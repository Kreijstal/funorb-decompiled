/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gq {
    static String field_b;
    static String field_f;
    static int field_d;
    int field_c;
    int field_e;
    static String field_a;
    static String field_g;

    final static int c(int param0) {
        if (param0 >= -33) {
          return -8;
        }
        return -ld.field_j + ah.field_R;
    }

    final static boolean a(CharSequence param0, boolean param1, int param2) {
        int var6 = 0;
        RuntimeException stackIn_39_0 = null;
        StringBuilder stackIn_39_1 = null;
        String stackIn_40_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        String var4 = null;
        int var5 = 0;
        int var7 = 0;
        int var8 = 0;
        var8 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          if (param0 == null) {
            return false;
          }
          var3_int = param0.length();
          if (var3_int < 1) {
            return false;
          }
          if (12 < var3_int) {
            return false;
          }
          var4 = ji.a(param0, true);
          if (var4 != null &&
            var4.length() >= 1) {
            if (!tc.a(var4.charAt(0), param2 + 6) &&
              !tc.a(var4.charAt(var4.length() - 1), 2)) {
              var5 = 0;
              for (var6 = 0; var6 < param0.length(); var6++) {
                var7 = param0.charAt(var6);
                if (tc.a((char) var7, 2)) {
                  var5++;
                } else {
                  var5 = 0;
                }
                if (var5 >= 2 &&
                  !param1) {
                  return false;
                }
              }
              if (var5 > 0) {
                return false;
              }
              if (param2 != -4) {
                gq.e(46);
              }
              return true;
            }
            return false;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_39_0 = var3;
          stackIn_39_1 = new StringBuilder().append("gq.C(");
          if (param0 == null) {
            stackIn_40_2 = "null";
          } else {
            stackIn_40_2 = "{...}";
          }
          throw r.a((Throwable) ((Object) stackIn_39_0), ((StringBuilder) (Object) stackIn_39_1).append(stackIn_40_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    final static void b(int param0) {
        nd[] var6 = null;
        int var2 = 0;
        nd var3 = null;
        nd var4 = null;
        int var5 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          if (param0 <= 30) {
            gq.a(-49);
          }
          var6 = fe.field_C;
          nd[] var1 = var6;
          for (var2 = 0; var6.length > var2; var2++) {
            var3 = var6[var2];
            var3.field_h = 0;
            var4 = var3;
            var4.field_a = 0;
          }
          rp.field_K.a(0);
        } catch (RuntimeException runtimeException) {
          throw r.a((Throwable) ((Object) runtimeException), "gq.E(" + param0 + ')');
        }
    }

    final static ln a(ln[] param0, int param1, ob param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        ln stackIn_2_0 = null;
        ln stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var3_int = param2.j(-74);
          if (param1 != -2284) {
            stackIn_2_0 = (ln) null;
            return stackIn_2_0;
          }
          if (param0.length <= var3_int) {
            return null;
          }
          stackIn_6_0 = param0[var3_int];
          return stackIn_6_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_9_0 = var3;
          stackIn_9_1 = new StringBuilder().append("gq.B(");
          if (param0 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw r.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(')').toString());
        }
    }

    final static void e(int param0) {
        int var1_int = 0;
        int[] var21 = null;
        int[] var20 = null;
        int[] var2 = null;
        sr var4_ref_sr = null;
        int var10_int = 0;
        int var11 = 0;
        int var4 = 0;
        double var10 = 0.0;
        int var14 = 0;
        int var15 = 0;
        int var17_int = 0;
        sr var17 = null;
        int var18 = 0;
        int var3 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var12 = 0;
        int var13 = 0;
        int var16 = 0;
        int var19 = ShatteredPlansClient.field_F ? 1 : 0;
        double var10Lifetime1;
        int var3Lifetime1;
        int var5Lifetime1;
        int var6Lifetime1;
        int var7Lifetime1;
        int var8Lifetime1;
        int var9Lifetime1;
        int var12Lifetime1;
        int var13Lifetime1;
        int var16Lifetime1;
        try {
          nc.field_p = new int[]{0, 0, -8144, 65536, 0, 0, 0, -65536, 0, 0, 0, 65536};
          var1_int = vc.field_d.length;
          var21 = new int[var1_int];
          var20 = var21;
          var2 = var20;
          for (var3 = 0; var3 < var1_int; var3++) {
            var4_ref_sr = vc.field_d[var3];
            var4_ref_sr.a(true);
            ec.a(-1, var3);
            var5 = var4_ref_sr.field_O + var4_ref_sr.field_k >> 1;
            var6 = var4_ref_sr.field_j + var4_ref_sr.field_t >> 1;
            var7 = var4_ref_sr.field_r + var4_ref_sr.field_E >> 1;
            var8 = nc.field_p[9] >> 2;
            var9 = nc.field_p[10] >> 2;
            var10_int = nc.field_p[11] >> 2;
            var11 = ib.field_a[3] * var8 + (ib.field_a[4] * var9 + ib.field_a[5] * var10_int) >> 14;
            var12 = var8 * ib.field_a[6] + (var9 * ib.field_a[7] + var10_int * ib.field_a[8]) >> 14;
            var13 = ib.field_a[11] * var10_int + (var9 * ib.field_a[10] + ib.field_a[9] * var8) >> 14;
            var2[var3] = var13 * var7 + var11 * var5 + var6 * var12 >> 16;
          }
          var3Lifetime1 = nc.field_p[9] >> 8;
          var4 = nc.field_p[10] >> 8;
          var5Lifetime1 = nc.field_p[11] >> 8;
          var6Lifetime1 = js.field_j << 4;
          var7Lifetime1 = 0;
          var8Lifetime1 = je.a(var6Lifetime1, (byte) -104) >> 8;
          var9Lifetime1 = oh.b(var6Lifetime1, -123) >> 8;
          if (-1 != pd.field_k &&
            bb.field_b != -1) {
            var7Lifetime1 = pd.field_k - 320;
            var9Lifetime1 = -128;
            var8Lifetime1 = 240 - bb.field_b;
          }
          var10 = 256.0 / Math.sqrt((double)(var9Lifetime1 * var9Lifetime1 + (var7Lifetime1 * var7Lifetime1 + var8Lifetime1 * var8Lifetime1)));
          var7Lifetime1 = (int)((double)var7Lifetime1 * var10);
          var8Lifetime1 = (int)((double)var8Lifetime1 * var10);
          var9Lifetime1 = (int)((double)var9Lifetime1 * var10);
          var12Lifetime1 = -var3Lifetime1 + var7Lifetime1;
          var13Lifetime1 = var8Lifetime1 - var4;
          var14 = var9Lifetime1 - var5Lifetime1;
          var10Lifetime1 = 256.0 / Math.sqrt((double)(var14 * var14 + var13Lifetime1 * var13Lifetime1 + var12Lifetime1 * var12Lifetime1));
          var12Lifetime1 = (int)((double)var12Lifetime1 * var10Lifetime1);
          var14 = (int)((double)var14 * var10Lifetime1);
          var13Lifetime1 = (int)((double)var13Lifetime1 * var10Lifetime1);
          for (var15 = 0; vc.field_d.length > var15; var15++) {
            var16 = 0;
            for (var17_int = 1; var17_int < vc.field_d.length; var17_int++) {
              if (var21[var17_int] > var21[var16]) {
                var16 = var17_int;
              }
            }
            var21[var16] = -2147483648;
            var17 = vc.field_d[var16];
            ec.a(-1, var16);
            for (var18 = 0; var18 < 3; var18++) {
              ib.field_a[var18] = ib.field_a[var18] + fa.field_Z[var15][var18];
            }
            pe.a(true, nc.field_p, false, 80, ib.field_a, false, var17);
            er.a(var7Lifetime1, var13Lifetime1, false, var8Lifetime1, var14, var17, var12Lifetime1, var9Lifetime1);
          }
          var16Lifetime1 = -47 / ((47 - param0) / 46);
        } catch (RuntimeException runtimeException) {
          throw r.a((Throwable) ((Object) runtimeException), "gq.F(" + param0 + ')');
        }
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    final static bi d(int param0) {
        int var4_int = 0;
        int var5 = ShatteredPlansClient.field_F ? 1 : 0;
        int var1 = cm.field_g[0] * mc.field_s[0];
        byte[] var2 = hd.field_q[0];
        int[] var3 = new int[var1];
        for (var4_int = 0; var1 > var4_int; var4_int++) {
          var3[var4_int] = eo.field_fb[we.a((int) var2[var4_int], 255)];
        }
        bi var4 = new bi(tk.field_y, eg.field_t, cf.field_H[0], sj.field_a[0], mc.field_s[0], cm.field_g[param0], var3);
        pd.a(0);
        return var4;
    }

    gq(int param0, int param1, int param2, int param3) {
        this.field_c = param0;
        this.field_e = param3;
    }

    public static void a(int param0) {
        field_b = null;
        field_g = null;
        field_f = null;
        field_a = null;
        int var1 = 69 / ((67 - param0) / 43);
    }

    static {
        field_b = "Continue";
        field_f = "Connection timed out. Please try using a different server.";
        field_a = "Waiting for <%0> to start the game...";
        field_g = "Fleets destroyed";
    }
}
