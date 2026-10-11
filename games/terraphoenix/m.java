/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class m {
    static String field_h;
    private int field_f;
    private int[][] field_d;
    static String field_e;
    static String field_a;
    static String field_b;
    static ci field_g;
    private int field_c;

    final static int a(int param0) {
        int var1_int = 0;
        RuntimeException var1 = null;
        int var2 = 0;
        int stackIn_3_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_16_0 = 0;
        int stackIn_19_0 = 0;
        int stackIn_23_0 = 0;
        RuntimeException decompiledCaughtException = null;
        var2 = Terraphoenix.field_V;
        try {
          jl.field_I.a(true, qf.field_c, wd.field_a, 115);
          jl.field_I.i((byte) 126);
          if (param0 != 1) {
            stackIn_3_0 = -58;
            return stackIn_3_0;
          }
          while (fd.d(1)) {
            jl.field_I.a(lf.field_c, ua.field_g, (byte) -121);
          }
          if (ga.field_c != -1) {
            var1_int = ga.field_c;
            bm.a(-1, (byte) 1);
            stackIn_9_0 = var1_int;
            return stackIn_9_0;
          }
          if (fd.field_k) {
            stackIn_13_0 = 3;
            return stackIn_13_0;
          }
          if (pe.field_a == ua.field_d) {
            stackIn_16_0 = 1;
            return stackIn_16_0;
          }
          if (!vc.field_a.a(-109)) {
            stackIn_19_0 = 1;
            return stackIn_19_0;
          }
          if (ua.field_d != qe.field_f) {
            return -1;
          }
          stackIn_23_0 = 2;
          return stackIn_23_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw qk.a((Throwable) ((Object) var1), "m.D(" + param0 + ')');
        }
    }

    final int a(int param0, boolean param1) {
        if (!param1) {
          this.field_d = (int[][]) null;
        }
        if (null != this.field_d) {
          param0 = (int)((long)this.field_f * (long)param0 / (long)this.field_c);
        }
        return param0;
    }

    public static void a(byte param0) {
        field_h = null;
        if (param0 <= 63) {
          field_a = (String) null;
        }
        field_e = null;
        field_a = null;
        field_g = null;
        field_b = null;
    }

    final static void a(java.applet.Applet param0, boolean param1, String param2, int param3) {
        try {
          RuntimeException stackIn_11_0 = null;
          StringBuilder stackIn_11_1 = null;
          String stackIn_12_2 = null;
          StringBuilder stackIn_14_1 = null;
          String stackIn_15_2 = null;
          Throwable decompiledCaughtException = null;
          java.net.MalformedURLException var4 = null;
          RuntimeException var4_ref = null;
          try {
            if (he.field_o.startsWith("win") &&
              ue.a(param2, 0)) {
              return;
            }
            try {
              param0.getAppletContext().showDocument(new java.net.URL(param2), "_blank");
              if (param3 != 0) {
                m.a(-14);
              }
            } catch (java.net.MalformedURLException decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var4 = (java.net.MalformedURLException) (Object) decompiledCaughtException;
              bd.a((Throwable) null, "MGR1: " + param2, param3 ^ -114);
            }
            return;
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var4_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_11_0 = var4_ref;
            stackIn_11_1 = new StringBuilder().append("m.B(");
            if (param0 == null) {
              stackIn_12_2 = "null";
            } else {
              stackIn_12_2 = "{...}";
            }
            stackIn_14_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(param1).append(',');
            if (param2 == null) {
              stackIn_15_2 = "null";
            } else {
              stackIn_15_2 = "{...}";
            }
            throw qk.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param3).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final int a(byte param0, int param1) {
        if (param0 != 46) {
          this.a(43, false);
        }
        if (null != this.field_d) {
          param1 = (int)((long)this.field_f * (long)param1 / (long)this.field_c) + 6;
        }
        return param1;
    }

    final byte[] a(byte param0, byte[] param1) {
        byte[] stackIn_3_0 = null;
        byte[] stackIn_21_0 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int[] var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int[] var14 = null;
        int[] var16 = null;
        int[] var18 = null;
        int var7Lifetime1;
        int var8Lifetime1;
        int var10Lifetime1;
        var11 = Terraphoenix.field_V;
        try {
          if (param0 != 109) {
            stackIn_3_0 = (byte[]) null;
            return stackIn_3_0;
          }
          if (null != this.field_d) {
            var3_int = 14 + (int)((long)param1.length * (long)this.field_f / (long)this.field_c);
            var16 = new int[var3_int];
            var14 = var16;
            var4 = var14;
            var5 = 0;
            var6 = 0;
            for (var7 = 0; param1.length > var7; var7++) {
              var8 = param1[var7];
              var18 = this.field_d[var6];
              for (var10 = 0; 14 > var10; var10++) {
                var4[var10 + var5] = var4[var10 + var5] + var18[var10] * var8;
              }
              var6 = var6 + this.field_f;
              var10Lifetime1 = var6 / this.field_c;
              var5 = var5 + var10Lifetime1;
              var6 = var6 - this.field_c * var10Lifetime1;
            }
            param1 = new byte[var3_int];
            var12 = 0;
            var7Lifetime1 = var12;
            while (var3_int > var12) {
              var8Lifetime1 = 32768 + var16[var12] >> 16;
              if (var8Lifetime1 < -128) {
                param1[var12] = (byte)-128;
              } else {
                if (var8Lifetime1 <= 127) {
                  param1[var12] = (byte)var8Lifetime1;
                } else {
                  param1[var12] = (byte)127;
                }
              }
              var12++;
            }
          }
          stackIn_21_0 = (byte[]) (param1);
          return stackIn_21_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_24_0 = var3;
          stackIn_24_1 = new StringBuilder().append("m.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_25_2 = "null";
          } else {
            stackIn_25_2 = "{...}";
          }
          throw qk.a((Throwable) ((Object) stackIn_24_0), ((StringBuilder) (Object) stackIn_24_1).append(stackIn_25_2).append(')').toString());
        }
    }

    m(int param0, int param1) {
        int var4 = 0;
        int var3;
        int[] var5;
        double var6;
        int var8;
        int var9;
        double var10;
        double var12;
        double var14;
        if (param0 == param1) {
          return;
        }
        var3 = ge.a(-1, param1, param0);
        param1 = param1 / var3;
        param0 = param0 / var3;
        this.field_d = new int[param0][14];
        this.field_f = param1;
        this.field_c = param0;
        for (var4 = 0; var4 < param0; var4++) {
          var5 = this.field_d[var4];
          var6 = (double)var4 / (double)param0 + 6.0;
          var8 = (int)Math.floor(1.0 + (-7.0 + var6));
          if (0 > var8) {
            var8 = 0;
          }
          var9 = (int)Math.ceil(var6 + 7.0);
          if (var9 > 14) {
            var9 = 14;
          }
          var10 = (double)param1 / (double)param0;
          while (var8 < var9) {
            var12 = 3.141592653589793 * ((double)var8 - var6);
            var14 = var10;
            if (var12 < -0.0001 ||
              var12 > 0.0001) {
              var14 = var14 * (Math.sin(var12) / var12);
            }
            var14 = var14 * (0.54 + Math.cos((-var6 + (double)var8) * 0.2243994752564138) * 0.46);
            var5[var8] = (int)Math.floor(0.5 + var14 * 65536.0);
            var8++;
          }
        }
        return;
    }

    static {
        field_h = "Not enough time to fire";
        field_b = "Efficency";
        field_e = null;
        field_a = "Increase grenade number";
    }
}
