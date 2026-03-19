  package minimized;
  
//⌄ enclosing_range_start semanticdb maven . . minimized/ClassOf#
  public class ClassOf {
//             ^^^^^^^ definition semanticdb maven . . minimized/ClassOf#
//                     display_name ClassOf
//                     signature_documentation java public class ClassOf
//                     kind Class
//             ^^^^^^^ definition semanticdb maven . . minimized/ClassOf#`<init>`().
//                     display_name <init>
//                     signature_documentation java public ClassOf()
//                     kind Constructor
//  ⌄ enclosing_range_start semanticdb maven jdk 11 java/lang/String#
//  ⌄ enclosing_range_start semanticdb maven . . minimized/ClassOf#app().
    public static String app() {
//                ^^^^^^ reference read_access semanticdb maven jdk 11 java/lang/String#
//                       ^^^ definition semanticdb maven . . minimized/ClassOf#app().
//                           display_name app
//                           signature_documentation java public static String app()
//                           kind StaticMethod
//                           relationship is_type_definition semanticdb maven jdk 11 java/lang/String#
//           ⌄ enclosing_range_start semanticdb maven . . minimized/ClassOf#
//           ⌄ enclosing_range_start semanticdb maven . . minimized/ClassOf#class.
//           ⌄ enclosing_range_start semanticdb maven jdk 11 java/lang/Class#getName().
      return ClassOf.class.getName();
//           ^^^^^^^ reference read_access semanticdb maven . . minimized/ClassOf#
//                   ^^^^^ reference read_access semanticdb maven . . minimized/ClassOf#class.
//                         ^^^^^^^ reference read_access semanticdb maven jdk 11 java/lang/Class#getName().
//                       ⌃ enclosing_range_end semanticdb maven . . minimized/ClassOf#
//                               ⌃ enclosing_range_end semanticdb maven . . minimized/ClassOf#class.
//                                 ⌃ enclosing_range_end semanticdb maven jdk 11 java/lang/Class#getName().
    }
//  ⌃ enclosing_range_end semanticdb maven jdk 11 java/lang/String#
//  ⌃ enclosing_range_end semanticdb maven . . minimized/ClassOf#app().
  }
//⌃ enclosing_range_end semanticdb maven . . minimized/ClassOf#
