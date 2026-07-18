/*
 * Decompiled by CFR-JS 0.4.0.
 */
class da {
    static String field_a;
    long field_d;
    static int field_e;
    static e[] field_g;
    da field_h;
    static ka field_b;
    static wa field_c;
    da field_f;

    final void a(boolean param0) {
        if (null == ((da) this).field_h) {
          return;
        } else {
          L0: {
            ((da) this).field_h.field_f = ((da) this).field_f;
            ((da) this).field_f.field_h = ((da) this).field_h;
            ((da) this).field_h = null;
            ((da) this).field_f = null;
            if (param0) {
              break L0;
            } else {
              ((da) this).field_h = null;
              break L0;
            }
          }
          return;
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int[] param6) {
        try {
            ia.field_p[param5] = param6;
            ne.field_b[param5] = param0;
            bd.field_m[param5] = param1;
            il.field_q[param5] = param4;
            int var7_int = -98 / ((9 - param3) / 48);
            ea.field_d[param5] = param2;
        } catch (RuntimeException runtimeException) {
            throw oj.a((Throwable) (Object) runtimeException, "da.SB(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + (param6 != null ? "{...}" : "null") + ')');
        }
    }

    final boolean b(int param0) {
        int stackIn_4_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        if (param0 != 11163) {
          boolean discarded$6 = ((da) this).b(-32);
          if (null != ((da) this).field_h) {
            return true;
          } else {
            return false;
          }
        } else {
          L0: {
            if (null == ((da) this).field_h) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              break L0;
            } else {
              stackOut_2_0 = 1;
              stackIn_4_0 = stackOut_2_0;
              break L0;
            }
          }
          return stackIn_4_0 != 0;
        }
    }

    public static void a(byte param0) {
        field_a = null;
        field_g = null;
        field_b = null;
        field_c = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_g = new e[2];
        field_a = "Not yet achieved";
    }
}
