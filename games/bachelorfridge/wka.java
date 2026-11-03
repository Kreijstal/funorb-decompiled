/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wka {
    static int field_a;
    private static String field_z;

    final static int a(int param0, int param1, int param2, int param3) {
        MoveDefinition var4 = al.a(-101, param1);
        if (!(var4 instanceof BasicMoveDefinition)) {
          if (param0 != 57) {
            field_a = 79;
            if (!(var4 instanceof BasicMoveDefinition)) {
              return param3 * 400 / param2;
            }
            if (((BasicMoveDefinition) (var4)).field_p == 3) {
              return (1 + param3) * 6200 / ((1 + param3) * param2 * 57 + 1);
            }
            return param3 * 400 / param2;
          }
          if (!(var4 instanceof BasicMoveDefinition)) {
            return param3 * 400 / param2;
          }
          if (((BasicMoveDefinition) (var4)).field_p == 3) {
            return (1 + param3) * 6200 / ((1 + param3) * param2 * 57 + 1);
          }
          return param3 * 400 / param2;
        }
        if (((BasicMoveDefinition) (var4)).field_p == 2) {
          return (12000 * param3 + 12000) / (param2 * (param3 * 57 + 57));
        }
        if (param0 != 57) {
          field_a = 79;
          if (!(var4 instanceof BasicMoveDefinition)) {
            return param3 * 400 / param2;
          }
          if (((BasicMoveDefinition) (var4)).field_p == 3) {
            return (1 + param3) * 6200 / ((1 + param3) * param2 * 57 + 1);
          }
          return param3 * 400 / param2;
        }
        if (!(var4 instanceof BasicMoveDefinition)) {
          return param3 * 400 / param2;
        }
        if (((BasicMoveDefinition) (var4)).field_p != 3) {
          return param3 * 400 / param2;
        }
        return (1 + param3) * 6200 / ((1 + param3) * param2 * 57 + 1);
    }

    static {
        field_z = "wka.A(";
    }
}
