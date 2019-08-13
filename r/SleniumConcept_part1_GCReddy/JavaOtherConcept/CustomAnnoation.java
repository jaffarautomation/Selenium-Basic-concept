package JavaOtherConcept;

import static java.lang.annotation.ElementType.CONSTRUCTOR;
import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.ElementType.LOCAL_VARIABLE;
import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.ElementType.PACKAGE;
import static java.lang.annotation.ElementType.PARAMETER;
import static java.lang.annotation.ElementType.TYPE;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;



//Annotations are created by using @interface, followed by annotation name as shown in the below example.
//An annotation can have elements as well. They look like methods. For example in the below code, we have four elements. We should not provide implementation for these elements.
//All annotations extends java.lang.annotation.Annotation interface. Annotations cannot include any extends clause.

//All the elements that have default values set while creating annotations can be skipped while using annotation. For example if I’m applying the above annotation to a class then I would do it like this:


//Lets back to the topic again: In the custom annotation example we have used these four annotations: @Documented, @Target, @Inherited & @Retention. Lets discuss them in detail.

//****************************************



@Target(value = {CONSTRUCTOR, FIELD, LOCAL_VARIABLE, METHOD, PACKAGE, PARAMETER, TYPE})
//It specifies where we can use the annotation. For example: In the below code, we have defined the target type as METHOD which means the below annotation can only be used on methods.


@Documented


@Retention(RetentionPolicy.RUNTIME)
//Here we have used RetentionPolicy.RUNTIME. There are two other options as well. Lets see what do they mean:
//RetentionPolicy.RUNTIME: The annotation should be available at runtime, for inspection via java reflection.
//RetentionPolicy.CLASS: The annotation would be in the .class file but it would not be available at runtime.
//RetentionPolicy.SOURCE: The annotation would be available in the source code of the program, it would neither be in the .class file nor be available at the runtime.

@Inherited
public @interface CustomAnnoation {
	
	 int studentAge() default 18;
	    String studentName();
	    String stuAddress();
	    String stuStream() default "CSE";    //No need to provide the values when you use this Annotaion unless if you dont need to change the value
	    
	    String[] Book();  // array of String 

}
