/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class oc {
    int field_a;
    int field_d;
    int[] field_h;
    String field_c;
    static String field_b;
    private String field_f;
    int field_i;
    private boolean field_g;
    static int[] field_m;
    static pc field_l;
    private long field_j;
    static int field_e;
    private int field_k;

    final int a(int param0) {
        int var2;
        int var2Lifetime1;
        int var2Lifetime2;
        if (this.field_g) {
          return 2;
        }
        if (this.field_a != 2) {
          if (this.field_j == he.field_e) {
            return 1;
          }
          if (rk.field_d == 2 &&
            bj.a(true, this.field_f)) {
            return 1;
          }
          var2 = -28 % ((9 - param0) / 60);
          return 0;
        }
        if (this.field_k > 0) {
          return 2;
        }
        if (this.field_j == he.field_e) {
          return 1;
        }
        if (rk.field_d != 2) {
          var2Lifetime1 = -28 % ((9 - param0) / 60);
          return 0;
        }
        if (bj.a(true, this.field_f)) {
          return 1;
        }
        var2Lifetime2 = -28 % ((9 - param0) / 60);
        return 0;
    }

    final static int b(int param0) {
        int var1_int = 0;
        RuntimeException var1 = null;
        int var2 = 0;
        int stackIn_7_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_17_0 = 0;
        int stackIn_21_0 = 0;
        int stackIn_24_0 = 0;
        int stackIn_26_0 = 0;
        RuntimeException decompiledCaughtException = null;
        var2 = Confined.field_J ? 1 : 0;
        try {
          vg.field_Z.a(true, true, ih.field_b, jf.field_k);
          vg.field_Z.i((byte) 70);
          while (nm.e((byte) -96)) {
            vg.field_Z.a((byte) 101, ad.field_h, gk.field_r);
          }
          if (qn.field_n != -1) {
            var1_int = qn.field_n;
            vf.a((byte) -115, -1);
            stackIn_7_0 = var1_int;
            return stackIn_7_0;
          }
          if (param0 != 1) {
            field_b = (String) null;
          }
          if (s.field_K) {
            stackIn_13_0 = 3;
            return stackIn_13_0;
          }
          if (wh.field_fb == na.field_S) {
            stackIn_17_0 = 1;
            return stackIn_17_0;
          }
          if (!fb.field_a.c(17237)) {
            stackIn_21_0 = 1;
            return stackIn_21_0;
          }
          if (wh.field_fb != oe.field_Q) {
            stackIn_26_0 = -1;
            return stackIn_26_0;
          }
          stackIn_24_0 = 2;
          return stackIn_24_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw sd.a((Throwable) ((Object) var1), "oc.B(" + param0 + ')');
        }
    }

    final static void a(int param0, int[] param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9) {
        int[] var17 = null;
        int[] var10 = null;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = Confined.field_J ? 1 : 0;
        try {
          while (true) {
            param8--;
            if (param8 < 0) {
              break;
            }
            var17 = param1;
            var10 = var17;
            var11 = param0;
            var12 = param3;
            var13 = param4;
            var14 = param5;
            var15 = (16711422 & var17[var11]) >> 1;
            var10[var11] = var15 + (va.a(var12, 33423360) >> 1) + va.a(var13 >> 9, 65280) + (va.a(33487527, var14) >> 17);
            param4 = param4 + param9;
            param3 = param3 + param7;
            param5 = param5 + param6;
            param0++;
          }
          int var10_int = -119 / ((param2 - 2) / 51);
        } catch (RuntimeException runtimeException) {
          throw sd.a((Throwable) ((Object) runtimeException), "oc.C(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ',' + param8 + ',' + param9 + ')');
        }
    }

    public static void c(int param0) {
        field_l = null;
        field_b = null;
        int var1 = 26 % ((-60 - param0) / 41);
        field_m = null;
    }

    oc(boolean param0) {
        this.field_i = qd.field_d;
        this.field_j = rl.field_x;
        if (!param0) {
          this.field_h = null;
        } else {
          this.field_h = lk.field_b;
        }
        this.field_f = ej.field_d;
        this.field_g = im.field_c;
        this.field_c = q.field_j;
        this.field_a = cc.field_m;
        this.field_d = ha.field_e;
        this.field_k = ve.field_h;
    }

    static {
        field_b = "Create a free account to start using this feature";
        field_e = 67;
    }
}
