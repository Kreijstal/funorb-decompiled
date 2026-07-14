/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gh extends eb {
    static String field_L;
    int field_K;
    int field_R;
    int field_P;
    static String field_O;
    int field_Q;
    int field_M;
    int field_N;

    final boolean a(boolean param0, int param1, int param2, int param3, int param4, gl param5, int param6) {
        int var8 = 0;
        int var9 = 0;
        double var10 = 0.0;
        int var12 = Terraphoenix.field_V;
        if (super.a(param0, param1, param2, param3, param4, param5, param6)) {
            var8 = param1 + (-((gh) this).field_R + (-((gh) this).field_w + -param3));
            var9 = param6 - (((gh) this).field_M + ((gh) this).field_u + param2);
            if (var9 * var9 + var8 * var8 < ((gh) this).field_Q * ((gh) this).field_Q) {
                var10 = Math.atan2((double)var9, (double)var8) - kd.field_b;
                if (var10 < 0.0) {
                    var10 = var10 - 3.141592653589793 / (double)((gh) this).field_K;
                } else {
                    if (!(0.0 >= var10)) {
                        var10 = var10 + 3.141592653589793 / (double)((gh) this).field_K;
                    }
                }
                ((gh) this).field_N = (int)(var10 * (double)((gh) this).field_K / 6.283185307179586);
                while (((gh) this).field_K <= ((gh) this).field_N) {
                    ((gh) this).field_N = ((gh) this).field_N - ((gh) this).field_K;
                }
                while (-1 < (((gh) this).field_N ^ -1)) {
                    ((gh) this).field_N = ((gh) this).field_N + ((gh) this).field_K;
                }
            }
            return true;
        }
        return false;
    }

    public static void a(int param0) {
        field_O = null;
        if (param0 >= -46) {
            int discarded$0 = gh.g(-50);
        }
        field_L = null;
    }

    final static int g(int param0) {
        int var1 = 0;
        int var2 = 0;
        int var3 = 0;
        var3 = Terraphoenix.field_V;
        if (param0 < -114) {
          var1 = 0;
          var2 = 0;
          L0: while (true) {
            if ((var2 ^ -1) <= -10) {
              return var1;
            } else {
              if (rf.field_B[var2].field_c) {
                var1++;
                var2++;
                continue L0;
              } else {
                var2++;
                continue L0;
              }
            }
          }
        } else {
          return -82;
        }
    }

    private gh() throws Throwable {
        throw new Error();
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_L = "    2nd level";
        field_O = "    Wall";
    }
}
