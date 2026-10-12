/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class MeshObject {
    static int field_a;
    static String field_b;
    static int field_d;
    static String field_c;

    final static void a(int param0, int param1, int param2) {
        te.field_l = param1;
        if (param0 != -8994) {
          return;
        }
        ij.field_x = param2;
        if (KingBlackDragonEvent.field_C != null) {
          KingBlackDragonEvent.field_C.a(param1, param2, (byte) -14);
        }
    }

    final static boolean a(byte param0, char param1) {
        if (param0 >= -95) {
          MeshObject.a(61, 53, 87);
          if (param1 < 65) {
            if (97 > param1) {
              return false;
            }
            if (param1 <= 122) {
              return true;
            }
            return false;
          }
          if (param1 <= 90) {
            return true;
          }
          if (97 > param1) {
            return false;
          }
          if (param1 <= 122) {
            return true;
          }
          return false;
        }
        if (param1 >= 65) {
          if (param1 <= 90) {
            return true;
          }
          if (97 > param1) {
            return false;
          }
          if (param1 <= 122) {
            return true;
          }
          return false;
        }
        if (97 > param1) {
          return false;
        }
        if (param1 <= 122) {
          return true;
        }
        return false;
    }

    public static void a(int param0) {
        field_c = null;
        if (param0 != -66) {
          return;
        }
        field_b = null;
    }

    static {
        field_a = -5;
        field_b = "Mission Selection";
        field_c = "Unequip";
    }
}
