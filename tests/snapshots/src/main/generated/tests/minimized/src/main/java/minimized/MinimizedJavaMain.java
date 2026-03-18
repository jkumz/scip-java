  package minimized;
  
//⌄ enclosing_range_start semanticdb maven . . minimized/Annotations#
//⌄ enclosing_range_start semanticdb maven . . minimized/MinimizedJavaMain#
//             ⌄ enclosing_range_start semanticdb maven . . minimized/Annotations#value().
//                              ⌄ enclosing_range_start semanticdb maven . . minimized/Annotations#format().
  @Annotations(value = "value", format = "format")
// ^^^^^^^^^^ reference semanticdb maven . . minimized/Annotations#
//             ^^^^^ reference semanticdb maven . . minimized/Annotations#value().
//                              ^^^^^^ reference semanticdb maven . . minimized/Annotations#format().
//                           ⌃ enclosing_range_end semanticdb maven . . minimized/Annotations#value().
//                                              ⌃ enclosing_range_end semanticdb maven . . minimized/Annotations#format().
//                                               ⌃ enclosing_range_end semanticdb maven . . minimized/Annotations#
  public class MinimizedJavaMain {
//             ^^^^^^^^^^^^^^^^^ definition semanticdb maven . . minimized/MinimizedJavaMain#
//                               display_name MinimizedJavaMain
//                               signature_documentation java @Annotations(value = "value", format = "format")\npublic class MinimizedJavaMain
//                               kind Class
//             ^^^^^^^^^^^^^^^^^ definition semanticdb maven . . minimized/MinimizedJavaMain#`<init>`().
//                               display_name <init>
//                               signature_documentation java public MinimizedJavaMain()
//                               kind Constructor
//  ⌄ enclosing_range_start semanticdb maven . . minimized/MinimizedJavaMain#main().
//                          ⌄ enclosing_range_start semanticdb maven jdk 11 java/lang/String#
//                          ⌄ enclosing_range_start local 0
    public static void main(String[] args) {
//                     ^^^^ definition semanticdb maven . . minimized/MinimizedJavaMain#main().
//                          display_name main
//                          signature_documentation java public static void main(String[] args)
//                          kind StaticMethod
//                          ^^^^^^ reference semanticdb maven jdk 11 java/lang/String#
//                                   ^^^^ definition local 0
//                                        display_name args
//                                        signature_documentation java String[] args
//                                        enclosing_symbol semanticdb maven . . minimized/MinimizedJavaMain#main().
//                                 ⌃ enclosing_range_end semanticdb maven jdk 11 java/lang/String#
//                                      ⌃ enclosing_range_end local 0
//    ⌄ enclosing_range_start semanticdb maven . . minimized/TypeVariables#
//    ⌄ enclosing_range_start semanticdb maven . . minimized/TypeVariables#app().
//    ⌄ enclosing_range_start semanticdb maven . . minimized/TypeVariables#CT#`<init>`().
//                          ⌄ enclosing_range_start semanticdb maven . . minimized/TypeVariables#
      TypeVariables.app(new TypeVariables.CT());
//    ^^^^^^^^^^^^^ reference semanticdb maven . . minimized/TypeVariables#
//                  ^^^ reference semanticdb maven . . minimized/TypeVariables#app().
//                          ^^^^^^^^^^^^^ reference semanticdb maven . . minimized/TypeVariables#
//                                        ^^ reference semanticdb maven . . minimized/TypeVariables#CT#`<init>`().
//                    ⌃ enclosing_range_end semanticdb maven . . minimized/TypeVariables#
//                                         ⌃ enclosing_range_end semanticdb maven . . minimized/TypeVariables#
//                                            ⌃ enclosing_range_end semanticdb maven . . minimized/TypeVariables#app().
//                                            ⌃ enclosing_range_end semanticdb maven . . minimized/TypeVariables#CT#`<init>`().
//    ⌄ enclosing_range_start semanticdb maven jdk 11 java/lang/System#
//    ⌄ enclosing_range_start semanticdb maven jdk 11 java/lang/System#out.
//    ⌄ enclosing_range_start semanticdb maven jdk 11 java/io/PrintStream#println(+8).
      System.out.println(
//    ^^^^^^ reference semanticdb maven jdk 11 java/lang/System#
//           ^^^ reference semanticdb maven jdk 11 java/lang/System#out.
//               ^^^^^^^ reference semanticdb maven jdk 11 java/io/PrintStream#println(+8).
//             ⌃ enclosing_range_end semanticdb maven jdk 11 java/lang/System#
//                     ⌃ enclosing_range_end semanticdb maven jdk 11 java/lang/System#out.
//        ⌄ enclosing_range_start semanticdb maven . . minimized/Methods#
//        ⌄ enclosing_range_start semanticdb maven . . minimized/Methods#app().
          Methods.app(42, "42")
//        ^^^^^^^ reference semanticdb maven . . minimized/Methods#
//                ^^^ reference semanticdb maven . . minimized/Methods#app().
//                  ⌃ enclosing_range_end semanticdb maven . . minimized/Methods#
//                            ⌃ enclosing_range_end semanticdb maven . . minimized/Methods#app().
//              ⌄ enclosing_range_start semanticdb maven . . minimized/Enums#
//              ⌄ enclosing_range_start semanticdb maven . . minimized/Enums#app().
              + Enums.app()
//              ^^^^^ reference semanticdb maven . . minimized/Enums#
//                    ^^^ reference semanticdb maven . . minimized/Enums#app().
//                      ⌃ enclosing_range_end semanticdb maven . . minimized/Enums#
//                        ⌃ enclosing_range_end semanticdb maven . . minimized/Enums#app().
//              ⌄ enclosing_range_start semanticdb maven . . minimized/Docstrings#
//              ⌄ enclosing_range_start semanticdb maven . . minimized/Docstrings#app().
              + Docstrings.app()
//              ^^^^^^^^^^ reference semanticdb maven . . minimized/Docstrings#
//                         ^^^ reference semanticdb maven . . minimized/Docstrings#app().
//                           ⌃ enclosing_range_end semanticdb maven . . minimized/Docstrings#
//                             ⌃ enclosing_range_end semanticdb maven . . minimized/Docstrings#app().
//              ⌄ enclosing_range_start semanticdb maven . . minimized/InnerClasses#
//              ⌄ enclosing_range_start semanticdb maven . . minimized/InnerClasses#app().
              + InnerClasses.app()
//              ^^^^^^^^^^^^ reference semanticdb maven . . minimized/InnerClasses#
//                           ^^^ reference semanticdb maven . . minimized/InnerClasses#app().
//                             ⌃ enclosing_range_end semanticdb maven . . minimized/InnerClasses#
//                               ⌃ enclosing_range_end semanticdb maven . . minimized/InnerClasses#app().
//              ⌄ enclosing_range_start semanticdb maven . . minimized/ForComprehensions#
//              ⌄ enclosing_range_start semanticdb maven . . minimized/ForComprehensions#app().
              + ForComprehensions.app(42)
//              ^^^^^^^^^^^^^^^^^ reference semanticdb maven . . minimized/ForComprehensions#
//                                ^^^ reference semanticdb maven . . minimized/ForComprehensions#app().
//                                  ⌃ enclosing_range_end semanticdb maven . . minimized/ForComprehensions#
//                                      ⌃ enclosing_range_end semanticdb maven . . minimized/ForComprehensions#app().
//              ⌄ enclosing_range_start semanticdb maven . . minimized/AnonymousClasses#
//              ⌄ enclosing_range_start semanticdb maven . . minimized/AnonymousClasses#app().
              + AnonymousClasses.app(42)
//              ^^^^^^^^^^^^^^^^ reference semanticdb maven . . minimized/AnonymousClasses#
//                               ^^^ reference semanticdb maven . . minimized/AnonymousClasses#app().
//                                 ⌃ enclosing_range_end semanticdb maven . . minimized/AnonymousClasses#
//                                     ⌃ enclosing_range_end semanticdb maven . . minimized/AnonymousClasses#app().
//              ⌄ enclosing_range_start semanticdb maven . . minimized/Primitives#
//              ⌄ enclosing_range_start semanticdb maven . . minimized/Primitives#app().
              + Primitives.app()
//              ^^^^^^^^^^ reference semanticdb maven . . minimized/Primitives#
//                         ^^^ reference semanticdb maven . . minimized/Primitives#app().
//                           ⌃ enclosing_range_end semanticdb maven . . minimized/Primitives#
//                             ⌃ enclosing_range_end semanticdb maven . . minimized/Primitives#app().
//              ⌄ enclosing_range_start semanticdb maven . . minimized/ParameterizedTypes#`<init>`().
//              ⌄ enclosing_range_start semanticdb maven . . minimized/ParameterizedTypes#app().
//                  ⌄ enclosing_range_start semanticdb maven jdk 11 java/lang/Integer#
//                  ⌄ enclosing_range_start semanticdb maven jdk 11 java/lang/String#
              + new ParameterizedTypes<Integer, String>().app(42, "42")
//                  ^^^^^^^^^^^^^^^^^^ reference semanticdb maven . . minimized/ParameterizedTypes#`<init>`().
//                                     ^^^^^^^ reference semanticdb maven jdk 11 java/lang/Integer#
//                                              ^^^^^^ reference semanticdb maven jdk 11 java/lang/String#
//                                                        ^^^ reference semanticdb maven . . minimized/ParameterizedTypes#app().
//                                                    ⌃ enclosing_range_end semanticdb maven jdk 11 java/lang/Integer#
//                                                    ⌃ enclosing_range_end semanticdb maven jdk 11 java/lang/String#
//                                                          ⌃ enclosing_range_end semanticdb maven . . minimized/ParameterizedTypes#`<init>`().
//                                                                    ⌃ enclosing_range_end semanticdb maven . . minimized/ParameterizedTypes#app().
//              ⌄ enclosing_range_start semanticdb maven . . minimized/RawTypes#
//              ⌄ enclosing_range_start semanticdb maven . . minimized/RawTypes#x.
//              ⌄ enclosing_range_start semanticdb maven jdk 11 java/lang/Object#toString().
              + RawTypes.x.toString()
//              ^^^^^^^^ reference semanticdb maven . . minimized/RawTypes#
//                       ^ reference semanticdb maven . . minimized/RawTypes#x.
//                         ^^^^^^^^ reference semanticdb maven jdk 11 java/lang/Object#toString().
//                       ⌃ enclosing_range_end semanticdb maven . . minimized/RawTypes#
//                                ⌃ enclosing_range_end semanticdb maven . . minimized/RawTypes#x.
//                                  ⌃ enclosing_range_end semanticdb maven jdk 11 java/lang/Object#toString().
//              ⌄ enclosing_range_start semanticdb maven . . minimized/ClassOf#
//              ⌄ enclosing_range_start semanticdb maven . . minimized/ClassOf#app().
              + ClassOf.app()
//              ^^^^^^^ reference semanticdb maven . . minimized/ClassOf#
//                      ^^^ reference semanticdb maven . . minimized/ClassOf#app().
//                        ⌃ enclosing_range_end semanticdb maven . . minimized/ClassOf#
//                          ⌃ enclosing_range_end semanticdb maven . . minimized/ClassOf#app().
//              ⌄ enclosing_range_start semanticdb maven . . minimized/SubClasses#
//              ⌄ enclosing_range_start semanticdb maven . . minimized/SubClasses#app().
              + SubClasses.app()
//              ^^^^^^^^^^ reference semanticdb maven . . minimized/SubClasses#
//                         ^^^ reference semanticdb maven . . minimized/SubClasses#app().
//                           ⌃ enclosing_range_end semanticdb maven . . minimized/SubClasses#
//                             ⌃ enclosing_range_end semanticdb maven . . minimized/SubClasses#app().
//              ⌄ enclosing_range_start semanticdb maven . . minimized/Fields#
//              ⌄ enclosing_range_start semanticdb maven . . minimized/Fields#app().
              + Fields.app());
//              ^^^^^^ reference semanticdb maven . . minimized/Fields#
//                     ^^^ reference semanticdb maven . . minimized/Fields#app().
//                       ⌃ enclosing_range_end semanticdb maven . . minimized/Fields#
//                         ⌃ enclosing_range_end semanticdb maven . . minimized/Fields#app().
//                          ⌃ enclosing_range_end semanticdb maven jdk 11 java/io/PrintStream#println(+8).
    }
//  ⌃ enclosing_range_end semanticdb maven . . minimized/MinimizedJavaMain#main().
  }
//⌃ enclosing_range_end semanticdb maven . . minimized/MinimizedJavaMain#
