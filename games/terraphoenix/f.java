/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class f implements cj {
    private int field_c;
    private int field_j;
    private int field_b;
    private int field_f;
    private int field_d;
    private pk field_k;
    private int field_e;
    static int[] field_a;
    static bg[] field_i;
    private int field_l;
    static int field_g;
    static String field_h;

    public static void a(int param0) {
        field_h = null;
        field_i = null;
        field_a = null;
        if (param0 != -108911807) {
            field_g = -119;
        }
    }

    public final void a(int param0, gl param1, int param2, int param3, boolean param4) {
        int var7 = 0;
        int var8 = 0;
        double var9 = 0.0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        gh var14 = null;
        gl stackIn_3_0 = null;
        gl stackOut_2_0 = null;
        Object stackOut_1_0 = null;
        L0: {
          if (param1 instanceof gh) {
            stackOut_2_0 = (gl) param1;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          } else {
            stackOut_1_0 = null;
            stackIn_3_0 = (gl) (Object) stackOut_1_0;
            break L0;
          }
        }
        var14 = (gh) (Object) stackIn_3_0;
        l.f(param2 + param1.field_w, param1.field_u + param0, param1.field_p, param1.field_n, ((f) this).field_d);
        if (param3 != -24381) {
          L1: {
            ((f) this).field_b = 13;
            if (var14 != null) {
              break L1;
            } else {
              break L1;
            }
          }
          L2: {
            var7 = var14.field_R + (param2 + param1.field_w);
            var8 = param0 + param1.field_u - -var14.field_M;
            l.e(var7, var8, var14.field_Q, ((f) this).field_b);
            if ((var14.field_P ^ -1) != 0) {
              var9 = 3.141592653589793 * (double)var14.field_P * 2.0 / (double)var14.field_K;
              var11 = (int)(-Math.sin(var9) * (double)var14.field_Q);
              var12 = (int)(Math.cos(var9) * (double)var14.field_Q);
              l.e(var7 + var11, var8 - -var12, 1, ((f) this).field_l);
              break L2;
            } else {
              break L2;
            }
          }
          L3: {
            l.e(var7, var8, 2, 1);
            var9 = 2.0 * (3.141592653589793 * (double)var14.field_N) / (double)var14.field_K;
            var11 = (int)(-Math.sin(var9) * (double)var14.field_Q);
            var12 = (int)(Math.cos(var9) * (double)var14.field_Q);
            l.c(var7, var8, var7 - -var11, var12 + var8, 1);
            if (null == ((f) this).field_k) {
              break L3;
            } else {
              var13 = var14.field_Q + (var14.field_R - -((f) this).field_c);
              int discarded$2 = ((f) this).field_k.a(param1.field_o, var13 + (param1.field_w + param2), ((f) this).field_j + param0 - -param1.field_u, -((f) this).field_c + (-var13 + param1.field_p), param1.field_n - (((f) this).field_c << -108911807), ((f) this).field_e, ((f) this).field_f, 1, 1, 0);
              break L3;
            }
          }
          return;
        } else {
          L4: {
            if (var14 != null) {
              break L4;
            } else {
              break L4;
            }
          }
          L5: {
            var7 = var14.field_R + (param2 + param1.field_w);
            var8 = param0 + param1.field_u - -var14.field_M;
            l.e(var7, var8, var14.field_Q, ((f) this).field_b);
            if ((var14.field_P ^ -1) != 0) {
              var9 = 3.141592653589793 * (double)var14.field_P * 2.0 / (double)var14.field_K;
              var11 = (int)(-Math.sin(var9) * (double)var14.field_Q);
              var12 = (int)(Math.cos(var9) * (double)var14.field_Q);
              l.e(var7 + var11, var8 - -var12, 1, ((f) this).field_l);
              break L5;
            } else {
              break L5;
            }
          }
          L6: {
            l.e(var7, var8, 2, 1);
            var9 = 2.0 * (3.141592653589793 * (double)var14.field_N) / (double)var14.field_K;
            var11 = (int)(-Math.sin(var9) * (double)var14.field_Q);
            var12 = (int)(Math.cos(var9) * (double)var14.field_Q);
            l.c(var7, var8, var7 - -var11, var12 + var8, 1);
            if (null == ((f) this).field_k) {
              break L6;
            } else {
              var13 = var14.field_Q + (var14.field_R - -((f) this).field_c);
              int discarded$3 = ((f) this).field_k.a(param1.field_o, var13 + (param1.field_w + param2), ((f) this).field_j + param0 - -param1.field_u, -((f) this).field_c + (-var13 + param1.field_p), param1.field_n - (((f) this).field_c << -108911807), ((f) this).field_e, ((f) this).field_f, 1, 1, 0);
              break L6;
            }
          }
          return;
        }
    }

    f(pk param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        ((f) this).field_f = param4;
        ((f) this).field_e = param3;
        ((f) this).field_d = param7;
        ((f) this).field_l = param6;
        ((f) this).field_b = param5;
        ((f) this).field_c = param1;
        ((f) this).field_j = param2;
        ((f) this).field_k = param0;
    }

    final static boolean a(String param0, int param1) {
        if (param1 < -48) {
          if (param0 != null) {
            if (param0.length() >= na.field_Y) {
              if (param0.length() > sl.field_e) {
                return true;
              } else {
                return false;
              }
            } else {
              return true;
            }
          } else {
            return true;
          }
        } else {
          return true;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_h = "    Allied soldier";
    }
}
