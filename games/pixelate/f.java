/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class f implements eb {
    private int field_h;
    private int field_e;
    private int field_r;
    private int field_b;
    private int field_k;
    private int field_m;
    static int field_o;
    static String field_i;
    private int field_l;
    static bb field_c;
    private jl field_g;
    static int[] field_d;
    static int[] field_f;
    static al field_a;
    static int[] field_p;
    static String field_j;
    static int field_q;
    static boolean field_n;

    public final void a(ng param0, byte param1, int param2, int param3, boolean param4) {
        int var7 = 0;
        int var8 = 0;
        double var9 = 0.0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        si var14 = null;
        ng stackIn_3_0 = null;
        ng stackOut_2_0 = null;
        Object stackOut_1_0 = null;
        L0: {
          if (param0 instanceof si) {
            stackOut_2_0 = (ng) param0;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          } else {
            stackOut_1_0 = null;
            stackIn_3_0 = (ng) (Object) stackOut_1_0;
            break L0;
          }
        }
        L1: {
          var14 = (si) (Object) stackIn_3_0;
          if (var14 == null) {
            break L1;
          } else {
            break L1;
          }
        }
        t.d(param3 - -param0.field_z, param2 - -param0.field_p, param0.field_E, param0.field_C, ((f) this).field_m);
        if (param1 == -124) {
          L2: {
            var7 = param3 - (-param0.field_z + -var14.field_O);
            var8 = var14.field_R + param0.field_p + param2;
            t.c(var7, var8, var14.field_N, ((f) this).field_k);
            if (var14.field_Q == -1) {
              break L2;
            } else {
              var9 = 3.141592653589793 * (double)var14.field_Q * 2.0 / (double)var14.field_V;
              var11 = (int)(-Math.sin(var9) * (double)var14.field_N);
              var12 = (int)(Math.cos(var9) * (double)var14.field_N);
              t.c(var11 + var7, var8 - -var12, 1, ((f) this).field_h);
              break L2;
            }
          }
          L3: {
            t.c(var7, var8, 2, 1);
            var9 = 2.0 * (3.141592653589793 * (double)var14.field_T) / (double)var14.field_V;
            var11 = (int)(-Math.sin(var9) * (double)var14.field_N);
            var12 = (int)(Math.cos(var9) * (double)var14.field_N);
            t.b(var7, var8, var7 - -var11, var12 + var8, 1);
            if (null != ((f) this).field_g) {
              var13 = ((f) this).field_e + (var14.field_N + var14.field_O);
              int discarded$2 = ((f) this).field_g.a(param0.field_q, var13 + param3 - -param0.field_z, ((f) this).field_b + (param0.field_p + param2), -var13 - (((f) this).field_e - param0.field_E), param0.field_C - (((f) this).field_e << 119772897), ((f) this).field_r, ((f) this).field_l, 1, 1, 0);
              break L3;
            } else {
              break L3;
            }
          }
          return;
        } else {
          L4: {
            ((f) this).field_h = -106;
            var7 = param3 - (-param0.field_z + -var14.field_O);
            var8 = var14.field_R + param0.field_p + param2;
            t.c(var7, var8, var14.field_N, ((f) this).field_k);
            if (var14.field_Q == -1) {
              break L4;
            } else {
              var9 = 3.141592653589793 * (double)var14.field_Q * 2.0 / (double)var14.field_V;
              var11 = (int)(-Math.sin(var9) * (double)var14.field_N);
              var12 = (int)(Math.cos(var9) * (double)var14.field_N);
              t.c(var11 + var7, var8 - -var12, 1, ((f) this).field_h);
              break L4;
            }
          }
          L5: {
            t.c(var7, var8, 2, 1);
            var9 = 2.0 * (3.141592653589793 * (double)var14.field_T) / (double)var14.field_V;
            var11 = (int)(-Math.sin(var9) * (double)var14.field_N);
            var12 = (int)(Math.cos(var9) * (double)var14.field_N);
            t.b(var7, var8, var7 - -var11, var12 + var8, 1);
            if (null != ((f) this).field_g) {
              var13 = ((f) this).field_e + (var14.field_N + var14.field_O);
              int discarded$3 = ((f) this).field_g.a(param0.field_q, var13 + param3 - -param0.field_z, ((f) this).field_b + (param0.field_p + param2), -var13 - (((f) this).field_e - param0.field_E), param0.field_C - (((f) this).field_e << 119772897), ((f) this).field_r, ((f) this).field_l, 1, 1, 0);
              break L5;
            } else {
              break L5;
            }
          }
          return;
        }
    }

    final static void b(int param0) {
        int var2 = 0;
        ck var3 = null;
        int var4 = Pixelate.field_H ? 1 : 0;
        ck[] var5 = jm.field_d;
        ck[] var1 = var5;
        for (var2 = param0; var2 < var5.length; var2++) {
            var3 = var5[var2];
            var3.b(param0 + -26338);
        }
    }

    final static boolean a(CharSequence param0, byte param1, boolean param2) {
        int var3 = 0;
        int var4 = Pixelate.field_H ? 1 : 0;
        if (!(we.a(param2, 5832, param0))) {
            return false;
        }
        if (param1 >= -60) {
            field_q = 36;
            for (var3 = 0; param0.length() > var3; var3++) {
                if (!oh.a(param0.charAt(var3), -67)) {
                    return false;
                }
            }
            return true;
        }
        for (var3 = 0; param0.length() > var3; var3++) {
            if (!oh.a(param0.charAt(var3), -67)) {
                return false;
            }
        }
        return true;
    }

    public static void a(int param0) {
        field_d = null;
        field_a = null;
        field_i = null;
        if (param0 != -26570) {
            field_j = null;
            field_c = null;
            field_f = null;
            field_j = null;
            field_p = null;
            return;
        }
        field_c = null;
        field_f = null;
        field_j = null;
        field_p = null;
    }

    f(jl param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        ((f) this).field_l = param4;
        ((f) this).field_h = param6;
        ((f) this).field_g = param0;
        ((f) this).field_e = param1;
        ((f) this).field_b = param2;
        ((f) this).field_m = param7;
        ((f) this).field_k = param5;
        ((f) this).field_r = param3;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        int var0 = 0;
        int var1 = 0;
        int var2 = 0;
        field_i = "No spectators";
        field_c = new bb();
        field_d = new int[4];
        field_f = new int[768];
        var0 = 0;
        L0: while (true) {
          if (field_f.length <= var0) {
            field_j = "Playing";
            field_n = true;
          } else {
            var1 = var0 % 256;
            var2 = -var1 + 255;
            if (256 <= var0) {
              if (-513 >= (var0 ^ -1)) {
                field_f[var0] = bq.a(bq.a(65280, var2), var0 << 31618832);
                var0++;
                continue L0;
              } else {
                field_f[var0] = bq.a(var0 << -351410360, bq.a(255, var2 << -1530448624));
                var0++;
                continue L0;
              }
            } else {
              field_f[var0] = bq.a(bq.a(-1560215808, var2) << 1331838824, var0);
              var0++;
              var0++;
              continue L0;
            }
          }
        }
    }
}
