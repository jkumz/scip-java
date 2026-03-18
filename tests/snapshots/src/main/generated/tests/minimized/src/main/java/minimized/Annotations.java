  package minimized;
  
//⌄ enclosing_range_start semanticdb maven jdk 11 java/lang/annotation/Documented#
//       ⌄ enclosing_range_start semanticdb maven . . java/
//       ⌄ enclosing_range_start semanticdb maven . . java/lang/
//       ⌄ enclosing_range_start semanticdb maven . . java/lang/annotation/
  import java.lang.annotation.Documented;
//       ^^^^ import semanticdb maven . . java/
//            ^^^^ import semanticdb maven . . java/lang/
//                 ^^^^^^^^^^ import semanticdb maven . . java/lang/annotation/
//                            ^^^^^^^^^^ import semanticdb maven jdk 11 java/lang/annotation/Documented#
//               ⌃ enclosing_range_end semanticdb maven . . java/
//                          ⌃ enclosing_range_end semanticdb maven . . java/lang/
//                                     ⌃ enclosing_range_end semanticdb maven . . java/lang/annotation/
//                                      ⌃ enclosing_range_end semanticdb maven jdk 11 java/lang/annotation/Documented#
//⌄ enclosing_range_start semanticdb maven jdk 11 java/lang/annotation/Retention#
//       ⌄ enclosing_range_start semanticdb maven . . java/
//       ⌄ enclosing_range_start semanticdb maven . . java/lang/
//       ⌄ enclosing_range_start semanticdb maven . . java/lang/annotation/
  import java.lang.annotation.Retention;
//       ^^^^ import semanticdb maven . . java/
//            ^^^^ import semanticdb maven . . java/lang/
//                 ^^^^^^^^^^ import semanticdb maven . . java/lang/annotation/
//                            ^^^^^^^^^ import semanticdb maven jdk 11 java/lang/annotation/Retention#
//               ⌃ enclosing_range_end semanticdb maven . . java/
//                          ⌃ enclosing_range_end semanticdb maven . . java/lang/
//                                    ⌃ enclosing_range_end semanticdb maven . . java/lang/annotation/
//                                     ⌃ enclosing_range_end semanticdb maven jdk 11 java/lang/annotation/Retention#
//⌄ enclosing_range_start semanticdb maven jdk 11 java/lang/annotation/RetentionPolicy#
//       ⌄ enclosing_range_start semanticdb maven . . java/
//       ⌄ enclosing_range_start semanticdb maven . . java/lang/
//       ⌄ enclosing_range_start semanticdb maven . . java/lang/annotation/
  import java.lang.annotation.RetentionPolicy;
//       ^^^^ import semanticdb maven . . java/
//            ^^^^ import semanticdb maven . . java/lang/
//                 ^^^^^^^^^^ import semanticdb maven . . java/lang/annotation/
//                            ^^^^^^^^^^^^^^^ import semanticdb maven jdk 11 java/lang/annotation/RetentionPolicy#
//               ⌃ enclosing_range_end semanticdb maven . . java/
//                          ⌃ enclosing_range_end semanticdb maven . . java/lang/
//                                          ⌃ enclosing_range_end semanticdb maven . . java/lang/annotation/
//                                           ⌃ enclosing_range_end semanticdb maven jdk 11 java/lang/annotation/RetentionPolicy#
//⌄ enclosing_range_start semanticdb maven jdk 11 java/lang/annotation/Target#
//       ⌄ enclosing_range_start semanticdb maven . . java/
//       ⌄ enclosing_range_start semanticdb maven . . java/lang/
//       ⌄ enclosing_range_start semanticdb maven . . java/lang/annotation/
  import java.lang.annotation.Target;
//       ^^^^ import semanticdb maven . . java/
//            ^^^^ import semanticdb maven . . java/lang/
//                 ^^^^^^^^^^ import semanticdb maven . . java/lang/annotation/
//                            ^^^^^^ import semanticdb maven jdk 11 java/lang/annotation/Target#
//               ⌃ enclosing_range_end semanticdb maven . . java/
//                          ⌃ enclosing_range_end semanticdb maven . . java/lang/
//                                 ⌃ enclosing_range_end semanticdb maven . . java/lang/annotation/
//                                  ⌃ enclosing_range_end semanticdb maven jdk 11 java/lang/annotation/Target#
  
//              ⌄ enclosing_range_start semanticdb maven . . java/
//              ⌄ enclosing_range_start semanticdb maven . . java/lang/
//              ⌄ enclosing_range_start semanticdb maven . . java/lang/annotation/
//              ⌄ enclosing_range_start semanticdb maven jdk 11 java/lang/annotation/ElementType#
  import static java.lang.annotation.ElementType.*;
//              ^^^^ import semanticdb maven . . java/
//                   ^^^^ import semanticdb maven . . java/lang/
//                        ^^^^^^^^^^ import semanticdb maven . . java/lang/annotation/
//                                   ^^^^^^^^^^^ import semanticdb maven jdk 11 java/lang/annotation/ElementType#
//                      ⌃ enclosing_range_end semanticdb maven . . java/
//                                 ⌃ enclosing_range_end semanticdb maven . . java/lang/
//                                             ⌃ enclosing_range_end semanticdb maven . . java/lang/annotation/
//                                               ⌃ enclosing_range_end semanticdb maven jdk 11 java/lang/annotation/ElementType#
  
//⌄ enclosing_range_start semanticdb maven jdk 11 java/lang/annotation/Documented#
//⌄ enclosing_range_start semanticdb maven . . minimized/Annotations#
  @Documented
// ^^^^^^^^^ reference semanticdb maven jdk 11 java/lang/annotation/Documented#
//          ⌃ enclosing_range_end semanticdb maven jdk 11 java/lang/annotation/Documented#
//⌄ enclosing_range_start semanticdb maven jdk 11 java/lang/annotation/Retention#
//           ⌄ enclosing_range_start semanticdb maven jdk 11 java/lang/annotation/RetentionPolicy#
  @Retention(RetentionPolicy.RUNTIME)
// ^^^^^^^^ reference semanticdb maven jdk 11 java/lang/annotation/Retention#
//           ^^^^^^^^^^^^^^^ reference semanticdb maven jdk 11 java/lang/annotation/RetentionPolicy#
//                           ^^^^^^^ reference semanticdb maven jdk 11 java/lang/annotation/RetentionPolicy#RUNTIME.
//                                 ⌃ enclosing_range_end semanticdb maven jdk 11 java/lang/annotation/RetentionPolicy#
//                                  ⌃ enclosing_range_end semanticdb maven jdk 11 java/lang/annotation/Retention#
//⌄ enclosing_range_start semanticdb maven jdk 11 java/lang/annotation/Target#
//        ⌄ enclosing_range_start semanticdb maven jdk 11 java/lang/annotation/Target#value().
//                ⌄ enclosing_range_start semanticdb maven jdk 11 java/lang/annotation/ElementType#CONSTRUCTOR.
//                ⌄ enclosing_range_start semanticdb maven jdk 11 java/lang/annotation/ElementType#FIELD.
//                ⌄ enclosing_range_start semanticdb maven jdk 11 java/lang/annotation/ElementType#LOCAL_VARIABLE.
//                ⌄ enclosing_range_start semanticdb maven jdk 11 java/lang/annotation/ElementType#METHOD.
//                ⌄ enclosing_range_start semanticdb maven jdk 11 java/lang/annotation/ElementType#PACKAGE.
//                ⌄ enclosing_range_start semanticdb maven jdk 11 java/lang/annotation/ElementType#PARAMETER.
//                ⌄ enclosing_range_start semanticdb maven jdk 11 java/lang/annotation/ElementType#TYPE.
  @Target(value = {CONSTRUCTOR,
// ^^^^^ reference semanticdb maven jdk 11 java/lang/annotation/Target#
//        ^^^^^ reference semanticdb maven jdk 11 java/lang/annotation/Target#value().
//                 ^^^^^^^^^^^ reference semanticdb maven jdk 11 java/lang/annotation/ElementType#CONSTRUCTOR.
          FIELD,
//        ^^^^^ reference semanticdb maven jdk 11 java/lang/annotation/ElementType#FIELD.
          LOCAL_VARIABLE,
//        ^^^^^^^^^^^^^^ reference semanticdb maven jdk 11 java/lang/annotation/ElementType#LOCAL_VARIABLE.
          METHOD,
//        ^^^^^^ reference semanticdb maven jdk 11 java/lang/annotation/ElementType#METHOD.
          PACKAGE,
//        ^^^^^^^ reference semanticdb maven jdk 11 java/lang/annotation/ElementType#PACKAGE.
          PARAMETER,
//        ^^^^^^^^^ reference semanticdb maven jdk 11 java/lang/annotation/ElementType#PARAMETER.
          TYPE}
//        ^^^^ reference semanticdb maven jdk 11 java/lang/annotation/ElementType#TYPE.
//            ⌃ enclosing_range_end semanticdb maven jdk 11 java/lang/annotation/Target#value().
//            ⌃ enclosing_range_end semanticdb maven jdk 11 java/lang/annotation/ElementType#CONSTRUCTOR.
//            ⌃ enclosing_range_end semanticdb maven jdk 11 java/lang/annotation/ElementType#FIELD.
//            ⌃ enclosing_range_end semanticdb maven jdk 11 java/lang/annotation/ElementType#LOCAL_VARIABLE.
//            ⌃ enclosing_range_end semanticdb maven jdk 11 java/lang/annotation/ElementType#METHOD.
//            ⌃ enclosing_range_end semanticdb maven jdk 11 java/lang/annotation/ElementType#PACKAGE.
//            ⌃ enclosing_range_end semanticdb maven jdk 11 java/lang/annotation/ElementType#PARAMETER.
//            ⌃ enclosing_range_end semanticdb maven jdk 11 java/lang/annotation/ElementType#TYPE.
  )
//⌃ enclosing_range_end semanticdb maven jdk 11 java/lang/annotation/Target#
  public @interface Annotations {
//                  ^^^^^^^^^^^ definition semanticdb maven . . minimized/Annotations#
//                              display_name Annotations
//                              signature_documentation java @Documented\n@Retention(RetentionPolicy.RUNTIME)\n@Target({CONSTRUCTOR, FIELD, LOCAL_VARIABLE, METHOD, PACKAGE, PARAMETER, TYPE})\npublic @interface Annotations
//                              kind Interface
//                              relationship is_implementation semanticdb maven jdk 11 java/lang/annotation/Annotation#
  
//  ⌄ enclosing_range_start semanticdb maven jdk 11 java/lang/String#
//  ⌄ enclosing_range_start semanticdb maven . . minimized/Annotations#value().
    String value() default "";
//  ^^^^^^ reference semanticdb maven jdk 11 java/lang/String#
//         ^^^^^ definition semanticdb maven . . minimized/Annotations#value().
//               display_name value
//               signature_documentation java public abstract String value()
//               kind AbstractMethod
//                           ⌃ enclosing_range_end semanticdb maven jdk 11 java/lang/String#
//                           ⌃ enclosing_range_end semanticdb maven . . minimized/Annotations#value().
  
//  ⌄ enclosing_range_start semanticdb maven jdk 11 java/lang/String#
//  ⌄ enclosing_range_start semanticdb maven . . minimized/Annotations#format().
    String format() default "";
//  ^^^^^^ reference semanticdb maven jdk 11 java/lang/String#
//         ^^^^^^ definition semanticdb maven . . minimized/Annotations#format().
//                display_name format
//                signature_documentation java public abstract String format()
//                kind AbstractMethod
//                            ⌃ enclosing_range_end semanticdb maven jdk 11 java/lang/String#
//                            ⌃ enclosing_range_end semanticdb maven . . minimized/Annotations#format().
  }
//⌃ enclosing_range_end semanticdb maven . . minimized/Annotations#
