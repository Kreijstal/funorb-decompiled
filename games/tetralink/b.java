/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class b {
    static String field_b;
    static int field_c;
    static int field_a;

    final static void a(int param0, int param1, byte param2) {
        nh.field_Nb = param1;
        if (param2 > -5) {
            return;
        }
        fk.field_S = param0;
    }

    final static boolean a(int param0) {
        if (param0 == 0) {
          if (lf.field_b != null) {
            if (!lf.field_b.h(param0 ^ 0)) {
              return false;
            } else {
              return true;
            }
          } else {
            return false;
          }
        } else {
          field_b = (String) null;
          if (lf.field_b != null) {
            if (!lf.field_b.h(param0 ^ 0)) {
              return false;
            } else {
              return true;
            }
          } else {
            return false;
          }
        }
    }

    public static void a(byte param0) {
        boolean discarded$0 = false;
        field_b = null;
        if (param0 != 41) {
            discarded$0 = b.a(-42);
        }
    }

    static {
        field_c = 0;
        field_b = "Players are <%0> and <%1>.";
    }
}
