  package minimized;
  
//⌄ enclosing_range_start semanticdb maven jdk 11 java/util/Collections#
//       ⌄ enclosing_range_start semanticdb maven . . java/
//       ⌄ enclosing_range_start semanticdb maven . . java/util/
  import java.util.Collections;
//       ^^^^ import semanticdb maven . . java/
//            ^^^^ import semanticdb maven . . java/util/
//                 ^^^^^^^^^^^ import semanticdb maven jdk 11 java/util/Collections#
//               ⌃ enclosing_range_end semanticdb maven . . java/
//                           ⌃ enclosing_range_end semanticdb maven . . java/util/
//                            ⌃ enclosing_range_end semanticdb maven jdk 11 java/util/Collections#
//⌄ enclosing_range_start semanticdb maven jdk 11 java/util/List#
//       ⌄ enclosing_range_start semanticdb maven . . java/
//       ⌄ enclosing_range_start semanticdb maven . . java/util/
  import java.util.List;
//       ^^^^ import semanticdb maven . . java/
//            ^^^^ import semanticdb maven . . java/util/
//                 ^^^^ import semanticdb maven jdk 11 java/util/List#
//               ⌃ enclosing_range_end semanticdb maven . . java/
//                    ⌃ enclosing_range_end semanticdb maven . . java/util/
//                     ⌃ enclosing_range_end semanticdb maven jdk 11 java/util/List#
  
//⌄ enclosing_range_start semanticdb maven jdk 11 java/lang/SuppressWarnings#
//⌄ enclosing_range_start semanticdb maven . . minimized/RawTypes#
  @SuppressWarnings("ALL")
// ^^^^^^^^^^^^^^^ reference read_access semanticdb maven jdk 11 java/lang/SuppressWarnings#
//                       ⌃ enclosing_range_end semanticdb maven jdk 11 java/lang/SuppressWarnings#
  public class RawTypes {
//             ^^^^^^^^ definition semanticdb maven . . minimized/RawTypes#
//                      display_name RawTypes
//                      signature_documentation java @SuppressWarnings("ALL")\npublic class RawTypes
//                      kind Class
//             ^^^^^^^^ definition semanticdb maven . . minimized/RawTypes#`<init>`().
//                      display_name <init>
//                      signature_documentation java public RawTypes()
//                      kind Constructor
//  ⌄ enclosing_range_start semanticdb maven jdk 11 java/util/List#
//  ⌄ enclosing_range_start semanticdb maven . . minimized/RawTypes#x.
//                               ⌄ enclosing_range_start semanticdb maven jdk 11 java/util/Collections#
//                               ⌄ enclosing_range_start semanticdb maven jdk 11 java/util/Collections#singletonList().
    public static final List x = Collections.singletonList(42);
//                      ^^^^ reference read_access semanticdb maven jdk 11 java/util/List#
//                           ^ definition semanticdb maven . . minimized/RawTypes#x.
//                             display_name x
//                             signature_documentation java public static final List x
//                             kind StaticField
//                             relationship is_type_definition semanticdb maven jdk 11 java/util/List#
//                               ^^^^^^^^^^^ reference read_access semanticdb maven jdk 11 java/util/Collections#
//                                           ^^^^^^^^^^^^^ reference read_access semanticdb maven jdk 11 java/util/Collections#singletonList().
//                                                       ⌃ enclosing_range_end semanticdb maven jdk 11 java/util/Collections#
//                                                           ⌃ enclosing_range_end semanticdb maven jdk 11 java/util/Collections#singletonList().
//                                                            ⌃ enclosing_range_end semanticdb maven jdk 11 java/util/List#
//                                                            ⌃ enclosing_range_end semanticdb maven . . minimized/RawTypes#x.
  }
//⌃ enclosing_range_end semanticdb maven . . minimized/RawTypes#
