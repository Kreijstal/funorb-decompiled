/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bd {
    static pj field_b;
    static pj field_c;
    static String field_a;

    public static void a(byte param0) {
        field_b = null;
        field_a = null;
        field_c = null;
        if (param0 >= -4) {
            Object var2 = null;
            bd.a(true, (byte) 37, false, (String) null);
        }
    }

    static int a(int param0, int param1) {
        return param0 | param1;
    }

    final static void a(boolean param0, byte param1, boolean param2, String param3) {
        try {
            if (param1 != 98) {
                bd.a((byte) 46);
            }
            cd.a(param1 ^ -99);
            wg.field_j.k(param1 ^ 25);
            j.field_e = new qi(bh.field_b, (String) null, fk.field_a, param0, param2);
            jh.field_C = new ra(wg.field_j, (we) (Object) j.field_e);
            wg.field_j.b((byte) -101, (we) (Object) jh.field_C);
        } catch (RuntimeException runtimeException) {
            throw la.a((Throwable) (Object) runtimeException, "bd.A(" + param0 + 44 + param1 + 44 + param2 + 44 + (param3 != null ? "{...}" : "null") + 41);
        }
    }

    final static boolean a(int param0) {
        if (param0 == 25951) {
          if (null != ol.field_g) {
            if (!dk.field_h.b(param0 + -25949)) {
              return false;
            } else {
              return true;
            }
          } else {
            return false;
          }
        } else {
          return true;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = new pj();
        field_c = new pj();
        field_a = "Unpacking sound effects";
    }
}
