/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rd extends da {
    int field_m;
    static String field_j;
    static ka[] field_i;
    int field_q;
    int field_k;
    int field_l;
    int field_n;
    static int[] field_p;
    int field_o;

    final static void a(int param0, byte param1) {
        ta.field_Ab = ob.field_a[param0];
        ol.field_f = ik.field_c[param0];
        sd.field_g = pk.field_c[param0];
        if (param1 < 85) {
            field_i = null;
        }
    }

    public static void b(byte param0) {
        field_p = null;
        field_j = null;
        field_i = null;
        if (param0 != -60) {
            field_j = null;
        }
    }

    final static void a(int[][] param0, int param1, int param2, int param3, boolean param4, int param5, int param6, int param7, int param8, int param9) {
        int var10 = 0;
        int var11 = 0;
        var11 = TorChallenge.field_F ? 1 : 0;
        if (param6 != -1012815519) {
          return;
        } else {
          var10 = 0;
          L0: while (true) {
            if (param9 <= var10) {
              return;
            } else {
              L1: {
                if (!param4) {
                  break L1;
                } else {
                  param0[var10][0] = e.b((byte) 57, param3 * param7 >> 2014224898);
                  param0[var10][1] = e.b((byte) 57, param2 * param5 >> -805282014);
                  break L1;
                }
              }
              qg.a(param8 - (param7 >> -374728126) * (param3 - 4 >> 291984513) - -param0[var10][0] << 739857860, -((param2 >> -605843870) * (-4 + param5 >> -1012815519)) + (param1 + param0[var10][1]) << 1321506052, 64, 128, qe.field_A);
              var10++;
              continue L0;
            }
          }
        }
    }

    rd(int param0, int param1, int param2, int param3, int param4, int param5) {
        ((rd) this).field_n = param0;
        ((rd) this).field_k = param2;
        ((rd) this).field_m = param1;
        ((rd) this).field_o = param4;
        ((rd) this).field_l = param3;
        ((rd) this).field_q = param5;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_j = "Passwords can only contain letters and numbers";
        field_p = new int[]{2, 4, 2, 4, 2};
    }
}
