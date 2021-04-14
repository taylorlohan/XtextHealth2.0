/*
 * generated by Xtext 2.24.0
 */
package org.xtext.example.myhealth.generator

import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.AbstractGenerator
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext
import org.xtext.example.myhealth.health.HealthProgram
import org.xtext.example.myhealth.health.Statement
import org.xtext.example.myhealth.health.PeopleStatement
import org.xtext.example.myhealth.health.HeightStatement
import org.xtext.example.myhealth.health.IntValue
import org.xtext.example.myhealth.health.RealValue
import org.xtext.example.myhealth.health.WeightStatement
import org.xtext.example.myhealth.health.AgeStatement
import org.xtext.example.myhealth.health.GenderStatement
import org.xtext.example.myhealth.health.IngestStatement
import org.xtext.example.myhealth.health.ExerciseStatement
import org.xtext.example.myhealth.health.AdviceStatement

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
class HealthGenerator extends AbstractGenerator {

	override void doGenerate(Resource resource, IFileSystemAccess2 fsa, IGeneratorContext context) {
        val model = resource.contents.head as HealthProgram
        val className = resource.deriveClassNameFor
		fsa.generateFile(className + '.java', model.doGenerateClass(className))
	}
	
	def deriveClassNameFor(Resource resource) {
		val origName = resource.URI.lastSegment
		
		origName.substring(0, origName.indexOf('.')).toFirstUpper + 'Health'
	}
	
	def String doGenerateClass(HealthProgram program, String className)'''
	import HealthLibrary.*;
				
				public class «className» {
		
					public static void main (String[] args) {
						People p = new People();
						«program.statements.map[generateJavaStatement].join('\n')»
					}
				}
	'''
	
	dispatch def String generateJavaStatement(Statement stmt)''''''
	dispatch def String generateJavaStatement(PeopleStatement stmt)'''p.setName("«stmt.name.toString»");'''
	dispatch def String generateJavaStatement(HeightStatement stmt) '''p.setHeight((float)«if (stmt.getHeight instanceof IntValue){
		val intVal =  stmt.getHeight() as IntValue
		intVal.^val}else if ( stmt.getHeight instanceof RealValue){
		    val realVal =stmt.getHeight() as RealValue
		    realVal.^val}»);'''
	dispatch def String generateJavaStatement(WeightStatement stmt) '''p.setWeight((float)«if (stmt.getWeight instanceof IntValue){
			val intVal =  stmt.getWeight() as IntValue
			intVal.^val}else if ( stmt.getWeight instanceof RealValue){
			    val realVal =stmt.getWeight() as RealValue
			    realVal.^val}»);'''
    dispatch def String generateJavaStatement(AgeStatement stmt) '''p.setAge((int)«if (stmt.getAge instanceof IntValue){
    		val intVal =  stmt.getAge() as IntValue
    		intVal.^val}else if ( stmt.getAge instanceof RealValue){
    		    val realVal =stmt.getAge() as RealValue
    		    realVal.^val}»);'''
    dispatch def String generateJavaStatement(GenderStatement stmt) '''p.setGender("«stmt.gender.toString»");'''
    dispatch def String generateJavaStatement(IngestStatement stmt) '''p.setIntake("«stmt.nutritiontype.toString»",(float)«if (stmt.getAmount instanceof IntValue){
    		val intVal =  stmt.getAmount() as IntValue
    		intVal.^val}else if ( stmt.getAmount instanceof RealValue){
    		    val realVal =stmt.getAmount() as RealValue
    		    realVal.^val}»);'''
    dispatch def String generateJavaStatement(ExerciseStatement stmt) '''p.setSport("«stmt.exerciseType.toString»",(float)«if (stmt.time instanceof IntValue){
    		val intVal =  stmt.time as IntValue
    		intVal.^val}else if ( stmt.time instanceof RealValue){
    		    val realVal =stmt.time as RealValue
    		    realVal.^val}»);'''
    dispatch def String generateJavaStatement(AdviceStatement stmt)  '''p.suggestionOn«stmt.ad.getName»();'''
}
