/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rn {
    static gu field_e;
    static int field_d;
    static je field_a;
    static int field_c;
    static String field_b;

    final static void a(int param0, ha param1) {
        if (param0 >= -1) {
            return;
        }
        try {
            nn.a((byte) 96, param1);
        } catch (RuntimeException runtimeException) {
            throw ig.a((Throwable) ((Object) runtimeException), "rn.C(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    static int a(int param0, int param1) {
        return param0 & param1;
    }

    final static String b(boolean param0) {
        if (param0) {
          if (null == mv.field_d) {
            return "";
          } else {
            return mv.field_d;
          }
        } else {
          rn.a(true);
          if (null == mv.field_d) {
            return "";
          } else {
            return mv.field_d;
          }
        }
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    final static void a(int param0, String param1, boolean param2, boolean param3) {
        try {
            ou.a(true);
            rl.field_C.j(param0 ^ -124);
            np.field_Qb = new df(ga.field_d, (String) null, fh.field_i, param2, param3);
            if (param0 != 3) {
                field_d = -55;
            }
            lt.field_g = new lw(rl.field_C, np.field_Qb);
            rl.field_C.a(lt.field_g, 0);
        } catch (RuntimeException runtimeException) {
            throw ig.a((Throwable) ((Object) runtimeException), "rn.B(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ')');
        }
    }

    public static void a(boolean param0) {
        String var2 = null;
        if (param0) {
          var2 = (String) null;
          rn.a(-107, (String) null, true, true);
          field_e = null;
          field_b = null;
          field_a = null;
          return;
        } else {
          field_e = null;
          field_b = null;
          field_a = null;
          return;
        }
    }

    static {
        field_e = new gu();
        field_b = "This structure is not captured";
        field_c = 3;
    }
}
