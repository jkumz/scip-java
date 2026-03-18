  package minimized;
  
//⌄ enclosing_range_start semanticdb maven . . minimized/Annotations#
//⌄ enclosing_range_start semanticdb maven . . minimized/MinimizedJavaMain#
//             ⌄ enclosing_range_start semanticdb maven . . minimized/Annotations#value().
//                              ⌄ enclosing_range_start semanticdb maven . . minimized/Annotations#format().
  @Annotations(value = "value", format = "format")
// ^^^^^^^^^^ reference read_access semanticdb maven . . minimized/Annotations#
//             ^^^^^ reference write_access semanticdb maven . . minimized/Annotations#value().
//                              ^^^^^^ reference write_access semanticdb maven . . minimized/Annotations#format().
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
//                          ^^^^^^ reference read_access semanticdb maven jdk 11 java/lang/String#
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
//    ^^^^^^^^^^^^^ reference read_access semanticdb maven . . minimized/TypeVariables#
//                  ^^^ reference read_access semanticdb maven . . minimized/TypeVariables#app().
//                          ^^^^^^^^^^^^^ reference read_access semanticdb maven . . minimized/TypeVariables#
//                                        ^^ reference semanticdb maven . . minimized/TypeVariables#CT#`<init>`().
//                    ⌃ enclosing_range_end semanticdb maven . . minimized/TypeVariables#
//                                         ⌃ enclosing_range_end semanticdb maven . . minimized/TypeVariables#
//                                            ⌃ enclosing_range_end semanticdb maven . . minimized/TypeVariables#app().
//                                            ⌃ enclosing_range_end semanticdb maven . . minimized/TypeVariables#CT#`<init>`().
//    ⌄ enclosing_range_start semanticdb maven jdk 11 java/lang/System#
//    ⌄ enclosing_range_start semanticdb maven jdk 11 java/lang/System#out.
//    ⌄ enclosing_range_start semanticdb maven jdk 11 java/io/PrintStream#println(+8).
      System.out.println(
//    ^^^^^^ reference read_access semanticdb maven jdk 11 java/lang/System#
//           ^^^ reference read_access semanticdb maven jdk 11 java/lang/System#out.
//               ^^^^^^^ reference read_access semanticdb maven jdk 11 java/io/PrintStream#println(+8).
//             ⌃ enclosing_range_end semanticdb maven jdk 11 java/lang/System#
//                     ⌃ enclosing_range_end semanticdb maven jdk 11 java/lang/System#out.
//        ⌄ enclosing_range_start semanticdb maven . . minimized/Methods#
//        ⌄ enclosing_range_start semanticdb maven . . minimized/Methods#app().
          Methods.app(42, "42")
//        ^^^^^^^ reference read_access semanticdb maven . . minimized/Methods#
//                ^^^ reference read_access semanticdb maven . . minimized/Methods#app().
//                  ⌃ enclosing_range_end semanticdb maven . . minimized/Methods#
//                            ⌃ enclosing_range_end semanticdb maven . . minimized/Methods#app().
//              ⌄ enclosing_range_start semanticdb maven . . minimized/Enums#
//              ⌄ enclosing_range_start semanticdb maven . . minimized/Enums#app().
              + Enums.app()
//              ^^^^^ reference read_access semanticdb maven . . minimized/Enums#
//                    ^^^ reference read_access semanticdb maven . . minimized/Enums#app().
//                      ⌃ enclosing_range_end semanticdb maven . . minimized/Enums#
//                        ⌃ enclosing_range_end semanticdb maven . . minimized/Enums#app().
//              ⌄ enclosing_range_start semanticdb maven . . minimized/Docstrings#
//              ⌄ enclosing_range_start semanticdb maven . . minimized/Docstrings#app().
              + Docstrings.app()
//              ^^^^^^^^^^ reference read_access semanticdb maven . . minimized/Docstrings#
//                         ^^^ reference read_access semanticdb maven . . minimized/Docstrings#app().
//                           ⌃ enclosing_range_end semanticdb maven . . minimized/Docstrings#
//                             ⌃ enclosing_range_end semanticdb maven . . minimized/Docstrings#app().
//              ⌄ enclosing_range_start semanticdb maven . . minimized/InnerClasses#
//              ⌄ enclosing_range_start semanticdb maven . . minimized/InnerClasses#app().
              + InnerClasses.app()
//              ^^^^^^^^^^^^ reference read_access semanticdb maven . . minimized/InnerClasses#
//                           ^^^ reference read_access semanticdb maven . . minimized/InnerClasses#app().
//                             ⌃ enclosing_range_end semanticdb maven . . minimized/InnerClasses#
//                               ⌃ enclosing_range_end semanticdb maven . . minimized/InnerClasses#app().
//              ⌄ enclosing_range_start semanticdb maven . . minimized/ForComprehensions#
//              ⌄ enclosing_range_start semanticdb maven . . minimized/ForComprehensions#app().
              + ForComprehensions.app(42)
//              ^^^^^^^^^^^^^^^^^ reference read_access semanticdb maven . . minimized/ForComprehensions#
//                                ^^^ reference read_access semanticdb maven . . minimized/ForComprehensions#app().
//                                  ⌃ enclosing_range_end semanticdb maven . . minimized/ForComprehensions#
//                                      ⌃ enclosing_range_end semanticdb maven . . minimized/ForComprehensions#app().
//              ⌄ enclosing_range_start semanticdb maven . . minimized/AnonymousClasses#
//              ⌄ enclosing_range_start semanticdb maven . . minimized/AnonymousClasses#app().
              + AnonymousClasses.app(42)
//              ^^^^^^^^^^^^^^^^ reference read_access semanticdb maven . . minimized/AnonymousClasses#
//                               ^^^ reference read_access semanticdb maven . . minimized/AnonymousClasses#app().
//                                 ⌃ enclosing_range_end semanticdb maven . . minimized/AnonymousClasses#
//                                     ⌃ enclosing_range_end semanticdb maven . . minimized/AnonymousClasses#app().
//              ⌄ enclosing_range_start semanticdb maven . . minimized/Primitives#
//              ⌄ enclosing_range_start semanticdb maven . . minimized/Primitives#app().
              + Primitives.app()
//              ^^^^^^^^^^ reference read_access semanticdb maven . . minimized/Primitives#
//                         ^^^ reference read_access semanticdb maven . . minimized/Primitives#app().
//                           ⌃ enclosing_range_end semanticdb maven . . minimized/Primitives#
//                             ⌃ enclosing_range_end semanticdb maven . . minimized/Primitives#app().
//              ⌄ enclosing_range_start semanticdb maven . . minimized/ParameterizedTypes#`<init>`().
//              ⌄ enclosing_range_start semanticdb maven . . minimized/ParameterizedTypes#app().
//                  ⌄ enclosing_range_start semanticdb maven jdk 11 java/lang/Integer#
//                  ⌄ enclosing_range_start semanticdb maven jdk 11 java/lang/String#
              + new ParameterizedTypes<Integer, String>().app(42, "42")
//                  ^^^^^^^^^^^^^^^^^^ reference semanticdb maven . . minimized/ParameterizedTypes#`<init>`().
//                                     ^^^^^^^ reference read_access semanticdb maven jdk 11 java/lang/Integer#
//                                              ^^^^^^ reference read_access semanticdb maven jdk 11 java/lang/String#
//                                                        ^^^ reference read_access semanticdb maven . . minimized/ParameterizedTypes#app().
//                                                    ⌃ enclosing_range_end semanticdb maven jdk 11 java/lang/Integer#
//                                                    ⌃ enclosing_range_end semanticdb maven jdk 11 java/lang/String#
//                                                          ⌃ enclosing_range_end semanticdb maven . . minimized/ParameterizedTypes#`<init>`().
//                                                                    ⌃ enclosing_range_end semanticdb maven . . minimized/ParameterizedTypes#app().
//              ⌄ enclosing_range_start semanticdb maven . . minimized/RawTypes#
//              ⌄ enclosing_range_start semanticdb maven . . minimized/RawTypes#x.
//              ⌄ enclosing_range_start semanticdb maven jdk 11 java/lang/Object#toString().
              + RawTypes.x.toString()
//              ^^^^^^^^ reference read_access semanticdb maven . . minimized/RawTypes#
//                       ^ reference read_access semanticdb maven . . minimized/RawTypes#x.
//                         ^^^^^^^^ reference read_access semanticdb maven jdk 11 java/lang/Object#toString().
//                       ⌃ enclosing_range_end semanticdb maven . . minimized/RawTypes#
//                                ⌃ enclosing_range_end semanticdb maven . . minimized/RawTypes#x.
//                                  ⌃ enclosing_range_end semanticdb maven jdk 11 java/lang/Object#toString().
//              ⌄ enclosing_range_start semanticdb maven . . minimized/ClassOf#
//              ⌄ enclosing_range_start semanticdb maven . . minimized/ClassOf#app().
              + ClassOf.app()
//              ^^^^^^^ reference read_access semanticdb maven . . minimized/ClassOf#
//                      ^^^ reference read_access semanticdb maven . . minimized/ClassOf#app().
//                        ⌃ enclosing_range_end semanticdb maven . . minimized/ClassOf#
//                          ⌃ enclosing_range_end semanticdb maven . . minimized/ClassOf#app().
//              ⌄ enclosing_range_start semanticdb maven . . minimized/SubClasses#
//              ⌄ enclosing_range_start semanticdb maven . . minimized/SubClasses#app().
              + SubClasses.app()
//              ^^^^^^^^^^ reference read_access semanticdb maven . . minimized/SubClasses#
//                         ^^^ reference read_access semanticdb maven . . minimized/SubClasses#app().
//                           ⌃ enclosing_range_end semanticdb maven . . minimized/SubClasses#
//                             ⌃ enclosing_range_end semanticdb maven . . minimized/SubClasses#app().
//              ⌄ enclosing_range_start semanticdb maven . . minimized/Fields#
//              ⌄ enclosing_range_start semanticdb maven . . minimized/Fields#app().
              + Fields.app());
//              ^^^^^^ reference read_access semanticdb maven . . minimized/Fields#
//                     ^^^ reference read_access semanticdb maven . . minimized/Fields#app().
//                       ⌃ enclosing_range_end semanticdb maven . . minimized/Fields#
//                         ⌃ enclosing_range_end semanticdb maven . . minimized/Fields#app().
//                          ⌃ enclosing_range_end semanticdb maven jdk 11 java/io/PrintStream#println(+8).
    }
//  ⌃ enclosing_range_end semanticdb maven . . minimized/MinimizedJavaMain#main().
  }
//⌃ enclosing_range_end semanticdb maven . . minimized/MinimizedJavaMain#
