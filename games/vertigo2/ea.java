/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ea {
    static String field_f;
    static String field_a;
    static cr field_c;
    static int field_g;
    static int[] field_h;
    static int field_e;
    static String field_b;
    static er[] field_d;

    public static void a(byte param0) {
        field_f = null;
        field_h = null;
        field_d = null;
        field_b = null;
        if (param0 != -28) {
          ea.b((byte) 1);
          field_c = null;
          field_a = null;
          return;
        } else {
          field_c = null;
          field_a = null;
          return;
        }
    }

    final static void a(int param0, boolean param1) {
        mi var2 = null;
        var2 = uh.field_Wb;
        var2.j(param0, 122);
        var2.f(1, -99);
        var2.f(3, 98);
        if (!param1) {
          field_a = (String) null;
          return;
        } else {
          return;
        }
    }

    final static void b(byte param0) {
        Object var1 = null;
        Throwable var2 = null;
        Throwable decompiledCaughtException = null;
        L0: {
          if (param0 > 102) {
            break L0;
          } else {
            ea.b((byte) 112);
            break L0;
          }
        }
        if (as.field_b == null) {
          return;
        } else {
          var1 = as.field_b;
          synchronized (var1) {
            L1: {
              as.field_b = null;
              break L1;
            }
          }
          return;
        }
    }

    static {
        field_f = "Please enter a year between <%0> and <%1>";
        field_g = 250;
        field_a = "<%0> has lost connection.";
        field_d = new er[11];
        field_h = new int[8192];
    }
}
