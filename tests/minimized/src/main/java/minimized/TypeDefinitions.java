package minimized;

import java.util.List;
import java.util.Map;
import java.io.IOException;

/**
 * Test cases for SCIP Relationship.is_type_definition emission.
 *
 * Covers:
 * - Field with declared class type → is_type_definition
 * - Local variable → is_type_definition
 * - Method parameter → is_type_definition
 * - Exception parameter in catch → is_type_definition
 * - Method return type (non-void, non-primitive) → is_type_definition
 * - Primitive field → NO is_type_definition
 * - Primitive return method → NO is_type_definition
 * - Void method → NO is_type_definition
 * - Generic type (List<String>) → is_type_definition to raw type (List)
 * - Nested generic (Map<String, Integer>) → is_type_definition to raw type (Map)
 * - Enum constant → is_type_definition to enum type
 * - Array of objects (String[]) → behavior check
 * - Class definition itself → NO is_type_definition (it IS a type)
 * - Constructor → NO is_type_definition
 * - Self-referencing field → is_type_definition to own class
 */
public class TypeDefinitions {

  String stringField;
  int primitiveField;
  boolean booleanPrimitive;
  List<String> genericField;
  Map<String, Integer> nestedGenericField;
  TypeDefinitions selfReference;
  String[] stringArray;
  Object objectField;

  public String methodReturningString() {
    return stringField;
  }

  public void voidMethod() {}

  public int primitiveReturnMethod() {
    return primitiveField;
  }

  public List<String> methodReturningGeneric() {
    return genericField;
  }

  public TypeDefinitions methodReturningSelf() {
    return this;
  }

  public void parameterTypes(String strParam, Map<String, Integer> mapParam) {
    String localVar = strParam;
    int localPrimitive = 42;
    Object localObject = localVar;
  }

  public void exceptionParameter() {
    try {
      voidMethod();
    } catch (RuntimeException e) {
      // e should have is_type_definition → RuntimeException
    }
  }

  public void checkedExceptionParameter() {
    try {
      throw new IOException("test");
    } catch (IOException e) {
      // e should have is_type_definition → IOException
    }
  }

  enum Color {
    RED,
    GREEN,
    BLUE;
  }
}