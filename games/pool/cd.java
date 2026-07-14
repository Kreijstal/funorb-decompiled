/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cd {
    static int[] field_d;
    static int field_a;
    static String field_c;
    static int field_e;
    static int field_b;

    final static void a(byte param0) {
        int var1 = 0;
        L0: {
          tq.d((byte) -128);
          if (pa.field_K != null) {
            he.a(pa.field_K, 0);
            break L0;
          } else {
            break L0;
          }
        }
        v.a(-22444);
        var1 = 8 / ((param0 - -12) / 55);
        aq.a(0);
        am.b((byte) 70);
        if (oc.b((byte) 84)) {
          ej.field_j.b(false, 1);
          de.a(0, 0);
          dn.c(-111);
          return;
        } else {
          dn.c(-111);
          return;
        }
    }

    final static void a(int param0, int param1, int[] param2, int param3, int param4, int param5) {
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        Object var9 = null;
        param0 = param0 - param2[0];
        param1 = param1 - param2[1];
        param5 = param5 - param2[2];
        if (param4 == 10521) {
          var6 = param2[11] * param5 + param2[10] * param1 + param0 * param2[9] >> -2137141808;
          if ((var6 ^ -1) >= -1) {
            return;
          } else {
            var7 = param2[5] * param5 + param2[3] * param0 - -(param1 * param2[4]) >> -513264281;
            var8 = param2[6] * param0 + (param1 * param2[7] - -(param2[8] * param5)) >> 468293159;
            var7 = fb.field_q + var7 / var6;
            var8 = fb.field_d + var8 / var6;
            qh.d(-4 + var7, var8, 4 + var7, var8, param3);
            qh.d(var7, var8 + -4, var7, var8 - -4, param3);
            return;
          }
        } else {
          var9 = null;
          cd.a(-11, -8, (int[]) null, -102, -112, 112);
          var6 = param2[11] * param5 + param2[10] * param1 + param0 * param2[9] >> -2137141808;
          if ((var6 ^ -1) >= -1) {
            return;
          } else {
            var7 = param2[5] * param5 + param2[3] * param0 - -(param1 * param2[4]) >> -513264281;
            var8 = param2[6] * param0 + (param1 * param2[7] - -(param2[8] * param5)) >> 468293159;
            var7 = fb.field_q + var7 / var6;
            var8 = fb.field_d + var8 / var6;
            qh.d(-4 + var7, var8, 4 + var7, var8, param3);
            qh.d(var7, var8 + -4, var7, var8 - -4, param3);
            return;
          }
        }
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    public static void a(int param0) {
        field_c = null;
        field_d = null;
        if (param0 <= 35) {
            field_c = null;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = "You have resigned.";
        field_a = 22;
        field_b = 0;
    }
}
