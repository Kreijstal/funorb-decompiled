/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ef {
    boolean field_c;
    static String field_f;
    boolean field_m;
    static int[] field_d;
    String field_g;
    static og field_l;
    static ka[] field_a;
    static int[][] field_i;
    static int field_e;
    static int[] field_j;
    String[] field_b;
    int field_n;
    static int field_k;
    static ka[][] field_h;

    final static void a(int param0, h param1, byte param2, int param3) {
        try {
          mg.field_d = param0;
          i.field_m = param3;
          gb.field_f = param1;
          int var4_int = 124 % ((-49 - param2) / 36);
        } catch (RuntimeException runtimeException) {
          throw oj.a((Throwable) ((Object) runtimeException), "ef.D(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ')');
        }
    }

    final static void a(int param0, qe param1) {
        int var2_int = 0;
        qe[] var3 = null;
        int var4 = 0;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        int var2_intLifetime1;
        var4 = TorChallenge.field_F ? 1 : 0;
        try {
          if (ea.field_g == null) {
            ea.field_g = new qe[10];
          }
          var2_int = param0;
          while (ea.field_g.length > var2_int) {
            if (ea.field_g[var2_int] != null) {
              var2_int++;
              continue;
            }
            ea.field_g[var2_int] = param1;
            param1.field_y = var2_int;
            return;
          }
          var3 = ea.field_g;
          ea.field_g = new qe[var3.length + 10];
          for (var2_intLifetime1 = 0; var2_intLifetime1 < var3.length; var2_intLifetime1++) {
            ea.field_g[var2_intLifetime1] = var3[var2_intLifetime1];
          }
          ea.field_g[var2_intLifetime1] = param1;
          param1.field_y = var2_intLifetime1;
          kf.a(param1, var2_intLifetime1, 8);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_18_0 = var2;
          stackIn_18_1 = new StringBuilder().append("ef.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          throw oj.a((Throwable) ((Object) stackIn_18_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(')').toString());
        }
    }

    final static int a(int param0, byte[] param1, int param2, int param3) {
        int var5 = 0;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var6 = 0;
        int stackIn_7_0 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        var6 = TorChallenge.field_F ? 1 : 0;
        try {
          var4_int = -1;
          for (var5 = param2; var5 < param3; var5++) {
            var4_int = ae.field_w[255 & (var4_int ^ param1[var5])] ^ var4_int >>> 8;
          }
          if (param0 < 33) {
            field_e = -18;
          }
          var4_int = ~var4_int;
          stackIn_7_0 = var4_int;
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_10_0 = var4;
          stackIn_10_1 = new StringBuilder().append("ef.G(").append(param0).append(',');
          if (param1 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw oj.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    public static void b(int param0) {
        field_h = (ka[][]) null;
        field_i = (int[][]) null;
        field_f = null;
        field_j = null;
        if (param0 >= -82) {
          qe var2 = (qe) null;
          ef.a(-3, (qe) null);
        }
        field_l = null;
        field_a = null;
        field_d = null;
    }

    final static void c(int param0) {
        int[] var1 = null;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int[] var5 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1_ref = null;
        var4 = TorChallenge.field_F ? 1 : 0;
        try {
          if (param0 != -13730) {
            ef.a((byte) -19);
          }
          var5 = m.field_i;
          var1 = var5;
          var2 = 0;
          var3 = var5.length;
          while (var2 < var3) {
            var5[var2++] = 0;
            var5[var2++] = 0;
            var5[var2++] = 0;
            var5[var2++] = 0;
            var5[var2++] = 0;
            var5[var2++] = 0;
            var5[var2++] = 0;
            var5[var2++] = 0;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw oj.a((Throwable) ((Object) var1_ref), "ef.B(" + param0 + ')');
        }
    }

    final static void a(int param0) {
        int var15 = 0;
        int var17_int = 0;
        int var18 = 0;
        int var1_int = 0;
        int[] var2 = null;
        int var3 = 0;
        vg var4_ref_vg = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10_int = 0;
        double var10 = 0.0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var16 = 0;
        vg var17 = null;
        int var19 = 0;
        int[] var20 = null;
        int[] var21 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        vg var17Lifetime1;
        vg var17Lifetime2;
        int var3Lifetime1;
        int var5Lifetime1;
        int var6Lifetime1;
        int var7Lifetime1;
        int var8Lifetime1;
        int var9Lifetime1;
        double var10Lifetime1;
        int var12Lifetime1;
        int var13Lifetime1;
        var19 = TorChallenge.field_F ? 1 : 0;
        try {
          sf.field_b = new int[]{0, 0, -8144, 65536, 0, 0, 0, -65536, 0, 0, 0, 65536};
          var1_int = qc.field_a.length;
          var21 = new int[var1_int];
          var20 = var21;
          var2 = var20;
          for (var3 = 0; var3 < var1_int; var3++) {
            var4_ref_vg = qc.field_a[var3];
            var17 = var4_ref_vg;
            var17Lifetime2 = var4_ref_vg;
            var4_ref_vg.b(-105);
            ue.a(var3, false);
            var5 = var4_ref_vg.field_p + var4_ref_vg.field_e >> 1;
            var6 = var4_ref_vg.field_K + var4_ref_vg.field_N >> 1;
            var7 = var4_ref_vg.field_B + var4_ref_vg.field_h >> 1;
            var8 = sf.field_b[9] >> 2;
            var9 = sf.field_b[10] >> 2;
            var10_int = sf.field_b[11] >> 2;
            var11 = uf.field_n[3] * var8 + var9 * uf.field_n[4] + uf.field_n[5] * var10_int >> 14;
            var12 = uf.field_n[7] * var9 + (var8 * uf.field_n[6] + var10_int * uf.field_n[8]) >> 14;
            var13 = uf.field_n[9] * var8 + var9 * uf.field_n[10] + var10_int * uf.field_n[11] >> 14;
            var2[var3] = var6 * var12 + (var11 * var5 + var7 * var13) >> 16;
          }
          var3Lifetime1 = sf.field_b[9] >> 8;
          var4 = sf.field_b[10] >> 8;
          if (param0 != 3) {
            field_f = (String) null;
          }
          var5Lifetime1 = sf.field_b[11] >> 8;
          var6Lifetime1 = jc.field_c << 4;
          var7Lifetime1 = 0;
          var8Lifetime1 = ai.a(true, var6Lifetime1) >> 8;
          var9Lifetime1 = lc.b(param0 ^ -73, var6Lifetime1) >> 8;
          if (-1 != kc.field_u &&
            ph.field_d != -1) {
            var8Lifetime1 = -ph.field_d + 240;
            var9Lifetime1 = -128;
            var7Lifetime1 = kc.field_u - 320;
          }
          var10 = 256.0 / Math.sqrt((double)(var9Lifetime1 * var9Lifetime1 + (var8Lifetime1 * var8Lifetime1 + var7Lifetime1 * var7Lifetime1)));
          var9Lifetime1 = (int)((double)var9Lifetime1 * var10);
          var7Lifetime1 = (int)((double)var7Lifetime1 * var10);
          var8Lifetime1 = (int)((double)var8Lifetime1 * var10);
          var12Lifetime1 = var7Lifetime1 - var3Lifetime1;
          var13Lifetime1 = -var4 + var8Lifetime1;
          var14 = -var5Lifetime1 + var9Lifetime1;
          var10Lifetime1 = 256.0 / Math.sqrt((double)(var14 * var14 + (var13Lifetime1 * var13Lifetime1 + var12Lifetime1 * var12Lifetime1)));
          var13Lifetime1 = (int)((double)var13Lifetime1 * var10Lifetime1);
          var14 = (int)((double)var14 * var10Lifetime1);
          var12Lifetime1 = (int)((double)var12Lifetime1 * var10Lifetime1);
          for (var15 = 0; qc.field_a.length > var15; var15++) {
            var16 = 0;
            for (var17_int = 1; qc.field_a.length > var17_int; var17_int++) {
              if (var21[var17_int] > var21[var16]) {
                var16 = var17_int;
              }
            }
            var21[var16] = -2147483648;
            var17Lifetime1 = qc.field_a[var16];
            ue.a(var16, false);
            for (var18 = 0; var18 < 3; var18++) {
              uf.field_n[var18] = uf.field_n[var18] + ok.field_d[var15][var18];
            }
            rj.a((byte) -77, false, uf.field_n, var17Lifetime1, true, false, sf.field_b);
            ul.a(var7Lifetime1, var8Lifetime1, var13Lifetime1, var14, var12Lifetime1, var17Lifetime1, var9Lifetime1, -16711780);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw oj.a((Throwable) ((Object) var1), "ef.F(" + param0 + ')');
        }
    }

    final static void a(byte param0) {
        try {
          Throwable decompiledCaughtException = null;
          java.lang.reflect.Method var1 = null;
          Exception var1_ref = null;
          Runtime var2 = null;
          Throwable var2_ref = null;
          Long var3 = null;
          Object[] var4 = null;
          try {
            var1 = Runtime.class.getMethod("maxMemory", new Class[]{});
            if (param0 < 64) {
              return;
            }
            if (var1 != null) {
              try {
                var2 = Runtime.getRuntime();
                var4 = (Object[]) null;
                var3 = (Long) (var1.invoke((Object) (var2), (Object[]) null));
                ul.field_l = 1 + (int)(var3.longValue() / 1048576L);
              } catch (java.lang.Throwable decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                var2_ref = decompiledCaughtException;
              }
            }
          } catch (java.lang.Exception decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var1_ref = (Exception) (Object) decompiledCaughtException;
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    ef(boolean param0) {
        this.field_m = param0 ? true : false;
    }

    final static void a(byte param0, java.applet.Applet param1) {
        try {
          java.net.URL var2 = null;
          RuntimeException stackIn_7_0 = null;
          StringBuilder stackIn_7_1 = null;
          String stackIn_8_2 = null;
          Throwable decompiledCaughtException = null;
          Exception var2_ref = null;
          RuntimeException var2_ref2 = null;
          try {
            try {
              var2 = new java.net.URL(param1.getCodeBase(), "quit.ws");
              param1.getAppletContext().showDocument(mc.a(var2, -1, param1), "_top");
              if (param0 != -93) {
                field_l = (og) null;
              }
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var2_ref = (Exception) (Object) decompiledCaughtException;
              var2_ref.printStackTrace();
            }
            return;
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var2_ref2 = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_7_0 = var2_ref2;
            stackIn_7_1 = new StringBuilder().append("ef.E(").append(param0).append(',');
            if (param1 == null) {
              stackIn_8_2 = "null";
            } else {
              stackIn_8_2 = "{...}";
            }
            throw oj.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    static {
        field_a = new ka[2];
        field_j = new int[]{290, 40};
        field_i = new int[][]{new int[]{-1, -1, -1}, new int[]{-1, -1, -1}, new int[]{-1, -1, -1}, new int[]{0, 0, 0}, new int[]{-1, 1, -1}, new int[]{-1, 2, -1}, new int[]{-1, -1, -1}, new int[]{-1, -1, -1}, new int[]{-1, 5, 6}, new int[]{-1, -1, 4}, new int[]{3, -1, -1}};
        field_f = "Log in / Create account";
        field_e = 250;
        field_h = new ka[5][];
        field_k = 0;
        field_d = new int[8192];
    }
}
