/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class tk extends ng {
    static String field_T;
    private int field_S;
    static boolean field_P;
    static eg field_R;
    static int[] field_Q;
    private wd field_O;

    public static void c(byte param0) {
        field_T = null;
        if (param0 < 68) {
          field_R = (eg) null;
        }
        field_Q = null;
        field_R = null;
    }

    final static void b(int param0, int param1, int param2, int param3, int param4) {
        int stackIn_5_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_15_0 = 0;
        int stackIn_27_0 = 0;
        int var5;
        int var6;
        int var7;
        int var8;
        int var9;
        int var10;
        int var11;
        int var12;
        int var13;
        int var14;
        int var15;
        int var16;
        int var17;
        int var18;
        int var19;
        int var11Lifetime1;
        int var11Lifetime2;
        int var13Lifetime1;
        int var14Lifetime1;
        int var19Lifetime1;
        var5 = vb.field_a[param3][param0];
        var6 = 1 + var5;
        var7 = var5 - 1;
        var8 = gl.field_l[param3][param0][1][0];
        var9 = gl.field_l[param3][param0][1][1];
        var10 = var9 - var8;
        if (var10 <= 0) {
          return;
        }
        var11 = ic.field_E[vb.field_a[param3][param0]][param2];
        stackIn_5_0 = ((var11 & 32) <= 0) ? 0 : 1;
        var12 = stackIn_5_0;
        var13 = 0;
        if (var7 < 0) {
          var7 += 64;
        }
        if (64 <= var6) {
          var6 -= 64;
        }
        var14 = 0;
        var11Lifetime1 = ic.field_E[var6][param2];
        stackIn_12_0 = ((var11Lifetime1 & 32) <= 0) ? 0 : 1;
        var13Lifetime1 = stackIn_12_0;
        var11Lifetime2 = ic.field_E[var7][param2];
        stackIn_15_0 = ((var11Lifetime2 & 32) <= 0) ? 0 : 1;
        var14Lifetime1 = stackIn_15_0;
        if (null != kj.field_C &&
          null != kj.field_C[0]) {
          var15 = kj.field_C[0].field_v;
          var16 = param1 + (64 - var15);
          var17 = var16;
          var18 = param1 + param4;
          var19 = 0;
          if (var14Lifetime1 == 0) {
            if (var12 == 0) {
              stackIn_27_0 = (var13Lifetime1 != 0) ? 1 : 0;
            } else {
              stackIn_27_0 = 1;
            }
          } else {
            stackIn_27_0 = 1;
          }
          var19Lifetime1 = stackIn_27_0;
          if (var19Lifetime1 == 0) {
            return;
          }
          ll.a(var17, 0, var8, var5, var14Lifetime1 != 0, var13Lifetime1 != 0, var12 != 0, var16, -1, var18, true, var9);
          return;
        }
        return;
    }

    final boolean a(ee param0, int param1) {
        RuntimeException var3 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != 0) {
            this.a(-59, 121, false, 81);
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("tk.RA(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw oj.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(')').toString());
        }
    }

    final static void a(int param0) {
        int var5 = 0;
        int[] array$1 = null;
        byte[] var1 = null;
        RuntimeException var1_ref = null;
        ge[] var2 = null;
        rh var3 = null;
        int[] var4 = null;
        int var6 = 0;
        byte[] var7 = null;
        byte[] var8 = null;
        int[] var9 = null;
        byte[] var10 = null;
        int[] var11 = null;
        RuntimeException decompiledCaughtException = null;
        var6 = TorChallenge.field_F ? 1 : 0;
        try {
          var10 = bh.field_q.a(-2, "font", "");
          var8 = var10;
          var7 = var8;
          var1 = var7;
          var2 = mh.a(122, ic.field_C, "font", "");
          fc.field_p = id.a(var10, var2, 256);
          var3 = vh.a(var2, 2, 33, var10, 16301089, 8015912);
          tf.field_x = (eg) ((Object) var3);
          if (param0 < 101) {
            tk.c((byte) 15);
          }
          var11 = var3.field_O[0];
          var9 = var11;
          var4 = var9;
          if (var3.field_O.length < 1) {
            var3.field_O = new int[1][];
          }
          var3.field_O[0] = var11;
          for (var5 = 1; var5 < 2; var5++) {
            array$1 = new int[var11.length];
            var3.field_O[var5] = array$1;
            he.a(var4, 0, var3.field_O[var5], 0, var11.length);
          }
          var3.field_O[1][2] = 8015912;
          var3.field_O[1][1] = 16301089;
          var3.field_x = 17;
          var3.field_O[0][1] = 15057307;
          var3.field_O[0][2] = 6488064;
          var3.field_K = 5;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw oj.a((Throwable) ((Object) var1_ref), "tk.UA(" + param0 + ')');
        }
    }

    final void a(ee param0, int param1, byte param2, int param3) {
        if (param2 > -97) {
          return;
        }
        try {
          this.field_S = this.field_S + 1;
          super.a(param0, param1, (byte) -112, param3);
        } catch (RuntimeException runtimeException) {
          throw oj.a((Throwable) ((Object) runtimeException), "tk.U(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final String b(boolean param0) {
        if (param0) {
          tk.b(-20, -30, -128, 99, -33);
        }
        if (!this.field_w) {
          return null;
        }
        return this.field_O.a((byte) -10);
    }

    final static String a(String param0, lj param1, String param2, int param3) {
        RuntimeException var4 = null;
        String stackIn_5_0 = null;
        String stackIn_7_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param3 != 256) {
            field_R = (eg) null;
          }
          if (!param1.b(param3 - 8213)) {
            stackIn_5_0 = (String) (param0);
            return stackIn_5_0;
          }
          stackIn_7_0 = param2 + " - " + param1.c(param3 - 197) + "%";
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_10_0 = var4;
          stackIn_10_1 = new StringBuilder().append("tk.SA(");
          if (param0 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          stackIn_13_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',');
          if (param1 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          stackIn_16_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',');
          if (param2 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw oj.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',').append(param3).append(')').toString());
        }
    }

    final void a(int param0, int param1, boolean param2, int param3) {
        int var5;
        int var6;
        rj var8;
        int var9;
        int var10;
        int var11;
        ka var12;
        ka var13;
        ka var14;
        var11 = TorChallenge.field_F ? 1 : 0;
        super.a(param0, param1, param2, param3);
        if (param3 != 0) {
          return;
        }
        if (param2) {
          field_Q = (int[]) null;
        }
        var5 = this.field_m + param1 + (this.field_p >> 1);
        var6 = (this.field_l >> 1) + this.field_i + param0;
        var8 = this.field_O.b(-53);
        if (bl.field_S != var8 &&
          jh.field_c != var8) {
          if (lk.field_c == var8) {
            var14 = ub.field_f[2];
            var14.b(var5 - (var14.field_u >> 1), var6 - (var14.field_x >> 1), 256);
          } else if (var8 == tf.field_w) {
            var13 = ub.field_f[1];
            var13.b(-(var13.field_u >> 1) + var5, var6 - (var13.field_x >> 1), 256);
          }
        } else {
          var12 = ub.field_f[0];
          var9 = var12.field_q << 1;
          var10 = var12.field_v << 1;
          if (lh.field_v != null &&
            var9 <= lh.field_v.field_u &&
            var10 <= lh.field_v.field_x) {
            ad.a(-50, lh.field_v);
            qg.b();
          } else {
            lh.field_v = new ka(var9, var10);
            ad.a(120, lh.field_v);
          }
          var12.b(112, 144, var12.field_q << 4, var12.field_v << 4, -this.field_S << 10, 4096);
          ie.b((byte) -9);
          lh.field_v.b(var5 - var12.field_q, var6 - var12.field_v, 256);
        }
    }

    tk(wd param0) {
        try {
          this.field_O = param0;
        } catch (RuntimeException runtimeException) {
          throw oj.a((Throwable) ((Object) runtimeException), "tk.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_T = "to return to the normal view.";
        field_Q = new int[]{6, 6, 7, 7, 7, 7};
    }
}
