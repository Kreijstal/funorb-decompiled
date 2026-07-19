/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wi {
    static int field_b;
    static String field_a;
    static rg field_c;

    public static void b(int param0) {
        int var1 = -63 / ((param0 - -15) / 33);
        field_a = null;
        field_c = null;
    }

    final static java.awt.Container a(byte param0) {
        if (!(ic.field_d == null)) {
            return (java.awt.Container) ((Object) ic.field_d);
        }
        if (param0 <= 103) {
            field_a = (String) null;
            return (java.awt.Container) ((Object) ll.b(78));
        }
        return (java.awt.Container) ((Object) ll.b(78));
    }

    final static boolean a(int param0) {
        if (param0 == -10214) {
          if (kd.field_B != null) {
            if (!kd.field_B.c(0)) {
              return false;
            } else {
              return true;
            }
          } else {
            return false;
          }
        } else {
          field_c = (rg) null;
          if (kd.field_B != null) {
            if (!kd.field_B.c(0)) {
              return false;
            } else {
              return true;
            }
          } else {
            return false;
          }
        }
    }

    static {
        field_a = "Email is valid";
    }
}
