/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class td {
    static String[] field_b;
    el field_f;
    static ud field_g;
    static String field_d;
    static hj field_a;
    el field_h;
    static String[] field_e;
    static volatile boolean field_c;

    public static void a(int param0) {
        field_g = null;
        field_e = null;
        field_a = null;
        if (param0 != 1491624464) {
          return;
        }
        field_d = null;
        field_b = null;
    }

    final static boolean a(byte param0, gn param1) {
        RuntimeException var2 = null;
        boolean stackIn_3_0 = false;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 > -52) {
            td.a(7);
          }
          stackIn_3_0 = param1.a((byte) 105);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_6_0 = var2;
          stackIn_6_1 = new StringBuilder().append("td.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw kk.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    final static vj a(int param0, float param1, vj param2) {
        gj var3 = null;
        lb var3_ref = null;
        RuntimeException var3_ref2 = null;
        gj stackIn_4_0 = null;
        lb stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != 150) {
            field_e = (String[]) null;
          }
          if (param2 instanceof lb) {
            var3_ref = (lb) (param2);
            stackIn_6_0 = new lb(var3_ref.field_r, var3_ref.a(false, param1), param2.field_k, param2.field_p, param2.field_q);
            return (vj) ((Object) stackIn_6_0);
          }
          var3 = (gj) (param2);
          stackIn_4_0 = new gj(var3.field_t, var3.field_u, var3.field_r, var3.field_r + (var3.field_w - var3.field_r) * param1, param2.field_k, param2.field_p, param2.field_q);
          return (vj) ((Object) stackIn_4_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref2 = decompiledCaughtException;
          stackIn_9_0 = var3_ref2;
          stackIn_9_1 = new StringBuilder().append("td.E(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw kk.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(')').toString());
        }
    }

    td(String param0) {
        try {
          this.field_f = jh.field_a.a(-32660, param0 + "_left");
          this.field_h = jh.field_a.a(-32660, param0 + "_right");
        } catch (RuntimeException runtimeException) {
          throw kk.a((Throwable) ((Object) runtimeException), "td.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final static void a(int param0, int param1, int param2, boolean param3, int param4) {
        if (!param3) {
          return;
        }
        lj.a((byte) -107);
        tc.e(param1, param4, param0, param2);
    }

    final static void a(int param0, int param1) {
        bg.field_f = 400 * param0 / 150;
        bg.field_g = 100 * param0 / 150;
        if (param1 != 14195) {
          field_g = (ud) null;
        }
        bg.field_c = (param0 << 16) / 150;
    }

    final static void a(byte param0) {
        int var16 = 0;
        int var18_int = 0;
        int var19 = 0;
        int var1_int = 0;
        int[] var2 = null;
        int var3 = 0;
        qk var4_ref_qk = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11_int = 0;
        double var11 = 0.0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var17 = 0;
        int var20 = 0;
        int[] var21 = null;
        int[] var22 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        qk var18 = null;
        int var3Lifetime1;
        int var5Lifetime1;
        int var6Lifetime1;
        int var7Lifetime1;
        int var8Lifetime1;
        int var9Lifetime1;
        int var10Lifetime1;
        double var11Lifetime1;
        int var13Lifetime1;
        var20 = HoldTheLine.field_D;
        try {
          HoldTheLine.field_E = new int[]{0, 0, -8144, 65536, 0, 0, 0, -65536, 0, 0, 0, 65536};
          var1_int = ej.field_c.length;
          var22 = new int[var1_int];
          var21 = var22;
          var2 = var21;
          for (var3 = 0; var1_int > var3; var3++) {
            var4_ref_qk = ej.field_c[var3];
            var4_ref_qk.c(0);
            dj.b(var3, 28433);
            var5 = var4_ref_qk.field_F + var4_ref_qk.field_L >> 1;
            var6 = var4_ref_qk.field_d + var4_ref_qk.field_H >> 1;
            var7 = var4_ref_qk.field_p + var4_ref_qk.field_n >> 1;
            var8 = HoldTheLine.field_E[9] >> 2;
            var9 = HoldTheLine.field_E[10] >> 2;
            var10 = HoldTheLine.field_E[11] >> 2;
            var11_int = var9 * fe.field_b[4] + fe.field_b[3] * var8 + var10 * fe.field_b[5] >> 14;
            var12 = var10 * fe.field_b[8] + (fe.field_b[7] * var9 + var8 * fe.field_b[6]) >> 14;
            var13 = var10 * fe.field_b[11] + (fe.field_b[9] * var8 + fe.field_b[10] * var9) >> 14;
            var2[var3] = var5 * var11_int + var6 * var12 + var13 * var7 >> 16;
          }
          var3Lifetime1 = HoldTheLine.field_E[9] >> 8;
          var4 = HoldTheLine.field_E[10] >> 8;
          var5Lifetime1 = HoldTheLine.field_E[11] >> 8;
          var6Lifetime1 = cf.field_q << 4;
          var7Lifetime1 = 0;
          var8Lifetime1 = tn.a(var6Lifetime1, 5255) >> 8;
          var9Lifetime1 = hc.a(0, var6Lifetime1) >> 8;
          var10Lifetime1 = 68 / ((param0 - 5) / 52);
          if (-1 != nc.field_g &&
            rf.field_X != -1) {
            var7Lifetime1 = -320 + nc.field_g;
            var9Lifetime1 = -128;
            var8Lifetime1 = -rf.field_X + 240;
          }
          var11 = 256.0 / Math.sqrt((double)(var9Lifetime1 * var9Lifetime1 + var8Lifetime1 * var8Lifetime1 + var7Lifetime1 * var7Lifetime1));
          var8Lifetime1 = (int)((double)var8Lifetime1 * var11);
          var7Lifetime1 = (int)((double)var7Lifetime1 * var11);
          var9Lifetime1 = (int)((double)var9Lifetime1 * var11);
          var13Lifetime1 = var7Lifetime1 - var3Lifetime1;
          var14 = var8Lifetime1 - var4;
          var15 = var9Lifetime1 - var5Lifetime1;
          var11Lifetime1 = 256.0 / Math.sqrt((double)(var13Lifetime1 * var13Lifetime1 + var14 * var14 + var15 * var15));
          var14 = (int)((double)var14 * var11Lifetime1);
          var15 = (int)((double)var15 * var11Lifetime1);
          var13Lifetime1 = (int)((double)var13Lifetime1 * var11Lifetime1);
          for (var16 = 0; var16 < ej.field_c.length; var16++) {
            var17 = 0;
            for (var18_int = 1; var18_int < ej.field_c.length; var18_int++) {
              if (var22[var18_int] > var22[var17]) {
                var17 = var18_int;
              }
            }
            var2[var17] = -2147483648;
            var18 = ej.field_c[var17];
            dj.b(var17, 28433);
            for (var19 = 0; 3 > var19; var19++) {
              fe.field_b[var19] = fe.field_b[var19] + gd.field_e[var16][var19];
            }
            ch.a(HoldTheLine.field_E, false, fe.field_b, (byte) 96, var18, true, false);
            ai.a(-4006, var8Lifetime1, var9Lifetime1, var14, var18, var13Lifetime1, var7Lifetime1, var15);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw kk.a((Throwable) ((Object) var1), "td.F(" + param0 + ')');
        }
    }

    static {
        field_b = new String[]{"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
        field_e = new String[]{"[BACKSPACE]", "[HOME]", "[F9]", "[F10]", "[F11]", "[ESC]"};
        field_d = "Instructions";
        field_c = true;
    }
}
