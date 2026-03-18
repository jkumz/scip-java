  package minimized;
  
  /**
   * Test cases for SCIP WriteAccess and ReadAccess SymbolRole emission.
   *
   * Covers:
   * - Read-only field access
   * - Write-only assignment (LHS of =)
   * - Write+Read compound assignment (+=, -=)
   * - Write+Read prefix/postfix increment and decrement
   * - Read in method call argument
   */
//⌄ enclosing_range_start semanticdb maven . . minimized/AccessRoles#
  public class AccessRoles {
//             ^^^^^^^^^^^ definition semanticdb maven . . minimized/AccessRoles#
//                         display_name AccessRoles
//                         signature_documentation java public class AccessRoles
//                         kind Class
//                         documentation  Test cases for SCIP WriteAccess and ReadAccess SymbolRole emission.\n\n Covers:\n - Read-only field access\n - Write-only assignment (LHS of =)\n - Write+Read compound assignment (+=, -=)\n - Write+Read prefix/postfix increment and decrement\n - Read in method call argument\n
//             ^^^^^^^^^^^ definition semanticdb maven . . minimized/AccessRoles#`<init>`().
//                         display_name <init>
//                         signature_documentation java public AccessRoles()
//                         kind Constructor
//  ⌄ enclosing_range_start semanticdb maven . . minimized/AccessRoles#field.
    int field = 0;
//      ^^^^^ definition semanticdb maven . . minimized/AccessRoles#field.
//            display_name field
//            signature_documentation java int field
//            kind Field
//               ⌃ enclosing_range_end semanticdb maven . . minimized/AccessRoles#field.
  
//  ⌄ enclosing_range_start semanticdb maven . . minimized/AccessRoles#readOnly().
    public int readOnly() {
//             ^^^^^^^^ definition semanticdb maven . . minimized/AccessRoles#readOnly().
//                      display_name readOnly
//                      signature_documentation java public int readOnly()
//                      kind Method
//    ⌄ enclosing_range_start semanticdb maven . . minimized/AccessRoles#field.
      return field; // read_access
//           ^^^^^ reference read_access semanticdb maven . . minimized/AccessRoles#field.
//                ⌃ enclosing_range_end semanticdb maven . . minimized/AccessRoles#field.
    }
//  ⌃ enclosing_range_end semanticdb maven . . minimized/AccessRoles#readOnly().
  
//  ⌄ enclosing_range_start semanticdb maven . . minimized/AccessRoles#writeOnly().
//                        ⌄ enclosing_range_start local 0
    public void writeOnly(int value) {
//              ^^^^^^^^^ definition semanticdb maven . . minimized/AccessRoles#writeOnly().
//                        display_name writeOnly
//                        signature_documentation java public void writeOnly(int value)
//                        kind Method
//                            ^^^^^ definition local 0
//                                  display_name value
//                                  signature_documentation java int value
//                                  enclosing_symbol semanticdb maven . . minimized/AccessRoles#writeOnly().
//                                ⌃ enclosing_range_end local 0
//    ⌄ enclosing_range_start semanticdb maven . . minimized/AccessRoles#field.
//    ⌄ enclosing_range_start local 0
      field = value; // write_access only
//    ^^^^^ reference write_access semanticdb maven . . minimized/AccessRoles#field.
//            ^^^^^ reference read_access local 0
//                ⌃ enclosing_range_end semanticdb maven . . minimized/AccessRoles#field.
//                ⌃ enclosing_range_end local 0
    }
//  ⌃ enclosing_range_end semanticdb maven . . minimized/AccessRoles#writeOnly().
  
//  ⌄ enclosing_range_start semanticdb maven . . minimized/AccessRoles#compoundAssignment().
//                                 ⌄ enclosing_range_start local 1
    public void compoundAssignment(int value) {
//              ^^^^^^^^^^^^^^^^^^ definition semanticdb maven . . minimized/AccessRoles#compoundAssignment().
//                                 display_name compoundAssignment
//                                 signature_documentation java public void compoundAssignment(int value)
//                                 kind Method
//                                     ^^^^^ definition local 1
//                                           display_name value
//                                           signature_documentation java int value
//                                           enclosing_symbol semanticdb maven . . minimized/AccessRoles#compoundAssignment().
//                                         ⌃ enclosing_range_end local 1
//    ⌄ enclosing_range_start semanticdb maven . . minimized/AccessRoles#field.
//    ⌄ enclosing_range_start local 1
      field += value; // write_access read_access (compound)
//    ^^^^^ reference write_access read_access semanticdb maven . . minimized/AccessRoles#field.
//             ^^^^^ reference read_access local 1
//                 ⌃ enclosing_range_end semanticdb maven . . minimized/AccessRoles#field.
//                 ⌃ enclosing_range_end local 1
//    ⌄ enclosing_range_start semanticdb maven . . minimized/AccessRoles#field.
//    ⌄ enclosing_range_start local 1
      field -= value; // write_access read_access (compound)
//    ^^^^^ reference write_access read_access semanticdb maven . . minimized/AccessRoles#field.
//             ^^^^^ reference read_access local 1
//                 ⌃ enclosing_range_end semanticdb maven . . minimized/AccessRoles#field.
//                 ⌃ enclosing_range_end local 1
    }
//  ⌃ enclosing_range_end semanticdb maven . . minimized/AccessRoles#compoundAssignment().
  
//  ⌄ enclosing_range_start semanticdb maven . . minimized/AccessRoles#prefixIncrement().
    public void prefixIncrement() {
//              ^^^^^^^^^^^^^^^ definition semanticdb maven . . minimized/AccessRoles#prefixIncrement().
//                              display_name prefixIncrement
//                              signature_documentation java public void prefixIncrement()
//                              kind Method
//    ⌄ enclosing_range_start semanticdb maven . . minimized/AccessRoles#field.
      ++field; // write_access read_access
//      ^^^^^ reference write_access read_access semanticdb maven . . minimized/AccessRoles#field.
//          ⌃ enclosing_range_end semanticdb maven . . minimized/AccessRoles#field.
    }
//  ⌃ enclosing_range_end semanticdb maven . . minimized/AccessRoles#prefixIncrement().
  
//  ⌄ enclosing_range_start semanticdb maven . . minimized/AccessRoles#postfixIncrement().
    public void postfixIncrement() {
//              ^^^^^^^^^^^^^^^^ definition semanticdb maven . . minimized/AccessRoles#postfixIncrement().
//                               display_name postfixIncrement
//                               signature_documentation java public void postfixIncrement()
//                               kind Method
//    ⌄ enclosing_range_start semanticdb maven . . minimized/AccessRoles#field.
      field++; // write_access read_access
//    ^^^^^ reference write_access read_access semanticdb maven . . minimized/AccessRoles#field.
//          ⌃ enclosing_range_end semanticdb maven . . minimized/AccessRoles#field.
    }
//  ⌃ enclosing_range_end semanticdb maven . . minimized/AccessRoles#postfixIncrement().
  
//  ⌄ enclosing_range_start semanticdb maven . . minimized/AccessRoles#prefixDecrement().
    public void prefixDecrement() {
//              ^^^^^^^^^^^^^^^ definition semanticdb maven . . minimized/AccessRoles#prefixDecrement().
//                              display_name prefixDecrement
//                              signature_documentation java public void prefixDecrement()
//                              kind Method
//    ⌄ enclosing_range_start semanticdb maven . . minimized/AccessRoles#field.
      --field; // write_access read_access
//      ^^^^^ reference write_access read_access semanticdb maven . . minimized/AccessRoles#field.
//          ⌃ enclosing_range_end semanticdb maven . . minimized/AccessRoles#field.
    }
//  ⌃ enclosing_range_end semanticdb maven . . minimized/AccessRoles#prefixDecrement().
  
//  ⌄ enclosing_range_start semanticdb maven . . minimized/AccessRoles#postfixDecrement().
    public void postfixDecrement() {
//              ^^^^^^^^^^^^^^^^ definition semanticdb maven . . minimized/AccessRoles#postfixDecrement().
//                               display_name postfixDecrement
//                               signature_documentation java public void postfixDecrement()
//                               kind Method
//    ⌄ enclosing_range_start semanticdb maven . . minimized/AccessRoles#field.
      field--; // write_access read_access
//    ^^^^^ reference write_access read_access semanticdb maven . . minimized/AccessRoles#field.
//          ⌃ enclosing_range_end semanticdb maven . . minimized/AccessRoles#field.
    }
//  ⌃ enclosing_range_end semanticdb maven . . minimized/AccessRoles#postfixDecrement().
  
//  ⌄ enclosing_range_start semanticdb maven . . minimized/AccessRoles#readInExpression().
    public int readInExpression() {
//             ^^^^^^^^^^^^^^^^ definition semanticdb maven . . minimized/AccessRoles#readInExpression().
//                              display_name readInExpression
//                              signature_documentation java public int readInExpression()
//                              kind Method
//           ⌄ enclosing_range_start semanticdb maven . . minimized/AccessRoles#field.
      return field + 1; // read_access
//           ^^^^^ reference read_access semanticdb maven . . minimized/AccessRoles#field.
//                   ⌃ enclosing_range_end semanticdb maven . . minimized/AccessRoles#field.
    }
//  ⌃ enclosing_range_end semanticdb maven . . minimized/AccessRoles#readInExpression().
  }
//⌃ enclosing_range_end semanticdb maven . . minimized/AccessRoles#
