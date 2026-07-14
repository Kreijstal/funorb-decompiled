/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ib implements rd {
    static jb[] field_a;
    static String field_i;
    private int field_k;
    private int field_j;
    private int field_f;
    private int field_h;
    private int field_l;
    private le field_c;
    static String field_b;
    private int field_e;
    static int[] field_g;
    private int field_d;

    public final void a(int param0, int param1, boolean param2, w param3, int param4) {
        int var7 = 0;
        int var8 = 0;
        double var9 = 0.0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        ae var14 = null;
        w stackIn_3_0 = null;
        w stackOut_2_0 = null;
        Object stackOut_1_0 = null;
        L0: {
          if (param3 instanceof ae) {
            stackOut_2_0 = (w) param3;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          } else {
            stackOut_1_0 = null;
            stackIn_3_0 = (w) (Object) stackOut_1_0;
            break L0;
          }
        }
        L1: {
          var14 = (ae) (Object) stackIn_3_0;
          if (var14 != null) {
            break L1;
          } else {
            break L1;
          }
        }
        if (param4 == -3284) {
          L2: {
            lf.a(param1 - -param3.field_t, param3.field_o + param0, param3.field_j, param3.field_v, ((ib) this).field_j);
            var7 = var14.field_L + (param1 + param3.field_t);
            var8 = var14.field_F + (param3.field_o + param0);
            lf.c(var7, var8, var14.field_I, ((ib) this).field_k);
            if (0 == (var14.field_H ^ -1)) {
              break L2;
            } else {
              var9 = 3.141592653589793 * (double)var14.field_H * 2.0 / (double)var14.field_K;
              var11 = (int)(-Math.sin(var9) * (double)var14.field_I);
              var12 = (int)(Math.cos(var9) * (double)var14.field_I);
              lf.c(var11 + var7, var8 - -var12, 1, ((ib) this).field_h);
              break L2;
            }
          }
          lf.c(var7, var8, 2, 1);
          var9 = (double)var14.field_G * 3.141592653589793 * 2.0 / (double)var14.field_K;
          var11 = (int)(-Math.sin(var9) * (double)var14.field_I);
          var12 = (int)(Math.cos(var9) * (double)var14.field_I);
          lf.b(var7, var8, var11 + var7, var8 - -var12, 1);
          if (null == ((ib) this).field_c) {
            return;
          } else {
            var13 = var14.field_L - (-var14.field_I + -((ib) this).field_d);
            int discarded$1 = ((ib) this).field_c.a(param3.field_u, var13 + (param1 + param3.field_t), param3.field_o + param0 + ((ib) this).field_f, param3.field_j + -((ib) this).field_d + -var13, param3.field_v - (((ib) this).field_d << 784973377), ((ib) this).field_e, ((ib) this).field_l, 1, 1, 0);
            return;
          }
        } else {
          return;
        }
    }

    public static void a(boolean param0) {
        field_b = null;
        field_a = null;
        field_i = null;
        field_g = null;
        if (!param0) {
            return;
        }
        ib.a(true);
    }

    final static void a(int param0, int[] param1, int param2, int param3, int param4) {
        int[] var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int[] var9 = null;
        var8 = Lexicominos.field_L ? 1 : 0;
        if (param4 < -36) {
          param2--;
          L0: while (true) {
            if (param2 >= 0) {
              var9 = param1;
              var5 = var9;
              var6 = param0;
              var7 = param3;
              var9[var6] = (vg.a(var9[var6], 16711422) >> -334453343) + var7;
              param0++;
              param2--;
              continue L0;
            } else {
              return;
            }
          }
        } else {
          return;
        }
    }

    ib(le param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        ((ib) this).field_h = param6;
        ((ib) this).field_k = param5;
        ((ib) this).field_c = param0;
        ((ib) this).field_d = param1;
        ((ib) this).field_j = param7;
        ((ib) this).field_e = param3;
        ((ib) this).field_f = param2;
        ((ib) this).field_l = param4;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = "Data server full or too many connections from your address. Please try again in a few minutes.";
        field_i = "The account name you use to access RuneScape and other Jagex.com games";
        field_g = new int[]{0, 0, 0, 10, 40, 125, 250, 500, 1000};
    }
}
