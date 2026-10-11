/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nb extends am {
    private boolean field_t;
    private boolean field_s;

    final static void g(byte param0) {
        int var1_int = 0;
        int var2 = 0;
        double var3 = 0.0;
        int var5 = 0;
        int var6 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        int var1_intLifetime1;
        var5 = Torquing.field_u;
        try {
          be.a();
          id.field_c = new int[260];
          oe.field_b = 11;
          var2 = 90 % ((param0 + 4) / 60);
          for (var1_int = 0; var1_int < 256; var1_int++) {
            var3 = 15.0;
            id.field_c[var1_int] = (int)(255.0 * Math.pow((double)((float)var1_int / 256.0f), var3));
          }
          var6 = 256;
          var1_intLifetime1 = var6;
          while (id.field_c.length > var6) {
            id.field_c[var6] = 255;
            var6++;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw rb.a((Throwable) ((Object) var1), "nb.D(" + param0 + ')');
        }
    }

    public nb() {
        super(1, false);
        this.field_t = true;
        this.field_s = true;
    }

    final int[] a(byte param0, int param1) {
        int[] var4 = null;
        int var5 = 0;
        int var6 = Torquing.field_u;
        if (param0 < 86) {
          return (int[]) null;
        }
        int[] var7 = this.field_l.a(param1, 25657);
        int[] var3 = var7;
        if (!this.field_l.field_b) {
        } else {
          var4 = this.b(0, 0, this.field_t ? vp.field_I - param1 : param1);
          if (!this.field_s) {
            dk.a(var4, 0, var7, 0, ci.field_c);
          } else {
            for (var5 = 0; var5 < ci.field_c; var5++) {
              var3[var5] = var4[jh.field_A - var5];
            }
          }
        }
        return var3;
    }

    final int[][] a(int param0, int param1) {
        int stackIn_5_1 = 0;
        int stackIn_6_2 = 0;
        int[][] var3;
        int[] var5;
        int[] var6;
        int[] var7;
        int[] var8;
        int[] var9;
        int[] var10;
        int var11;
        int var12;
        int[][] var13;
        int var14;
        int[][] var16;
        int[] var17;
        int[] var18;
        int[] var19;
        int[][] var21;
        int[] var22;
        int[] var23;
        int[] var24;
        int[][] var26;
        var12 = Torquing.field_u;
        var21 = this.field_r.a(param0 + 44258, param1);
        var16 = var21;
        var13 = var16;
        var3 = var13;
        if (param0 != -29116) {
          nb.g((byte) 122);
        }
        if (this.field_r.field_b) {
          stackIn_5_1 = 24066;
          if (this.field_t) {
            stackIn_6_2 = -param1 + vp.field_I;
          } else {
            stackIn_6_2 = param1;
          }
          var26 = this.c(stackIn_5_1, stackIn_6_2, 0);
          var22 = var26[0];
          var17 = var22;
          var5 = var17;
          var23 = var26[1];
          var18 = var23;
          var6 = var18;
          var24 = var26[2];
          var19 = var24;
          var7 = var19;
          var8 = var21[0];
          var9 = var21[1];
          var10 = var21[2];
          if (this.field_s) {
            for (var11 = 0; var11 < ci.field_c; var11++) {
              var8[var11] = var5[jh.field_A - var11];
              var9[var11] = var6[-var11 + jh.field_A];
              var10[var11] = var7[-var11 + jh.field_A];
            }
          } else {
            var14 = 0;
            var11 = var14;
            while (var14 < ci.field_c) {
              var8[var14] = var22[var14];
              var9[var14] = var23[var14];
              var10[var14] = var24[var14];
              var14++;
            }
          }
        }
        return var3;
    }

    final static void a(int param0, int param1, int param2, int param3, int param4) {
        bi.field_p = param0;
        if (param1 >= -87) {
          return;
        }
        bp.field_f = param2;
        kp.field_d = param4;
        bp.field_e = param3;
    }

    final static void b(int param0) {
        if (param0 != 0) {
          return;
        }
        ug.a(param0 ^ -105);
        if (k.field_d != null) {
          tf.a(-93, k.field_d);
        }
        ee.a(true);
        qd.b(param0 ^ 1);
        ci.a(0);
        if (pf.a((byte) -34)) {
          wa.field_d.f(121, 1);
          jd.a((byte) -81, 0);
        }
        ih.b(true);
    }

    final static String a(String param0, java.applet.Applet param1, byte param2) {
        try {
          int var6 = 0;
          String var3 = null;
          String[] var4 = null;
          int var5 = 0;
          int var7 = 0;
          int var8 = 0;
          String stackIn_6_0 = null;
          Object stackIn_11_0 = null;
          RuntimeException stackIn_14_0 = null;
          StringBuilder stackIn_14_1 = null;
          String stackIn_15_2 = null;
          StringBuilder stackIn_17_1 = null;
          String stackIn_18_2 = null;
          Throwable decompiledCaughtException = null;
          Throwable var3_ref = null;
          RuntimeException var3_ref2 = null;
          var8 = Torquing.field_u;
          try {
            try {
              var3 = (String) (hp.a(param1, (byte) -85, "getcookies"));
              var4 = kc.a(';', var3, 0);
              var5 = -110 / ((param2 + 25) / 51);
              for (var6 = 0; var4.length > var6; var6++) {
                var7 = var4[var6].indexOf('=');
                if (var7 >= 0 &&
                  var4[var6].substring(0, var7).trim().equals(param0)) {
                  stackIn_6_0 = var4[var6].substring(var7 + 1).trim();
                  return stackIn_6_0;
                }
              }
            } catch (java.lang.Throwable decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var3_ref = decompiledCaughtException;
            }
            stackIn_11_0 = null;
            return (String) (stackIn_11_0);
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var3_ref2 = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_14_0 = var3_ref2;
            stackIn_14_1 = new StringBuilder().append("nb.A(");
            if (param0 == null) {
              stackIn_15_2 = "null";
            } else {
              stackIn_15_2 = "{...}";
            }
            stackIn_17_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',');
            if (param1 == null) {
              stackIn_18_2 = "null";
            } else {
              stackIn_18_2 = "{...}";
            }
            throw rb.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',').append(param2).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final void a(fj param0, int param1, int param2) {
        int var4_int = 0;
        int var5 = 0;
        boolean stackIn_10_1 = false;
        boolean stackIn_14_1 = false;
        boolean stackIn_18_1 = false;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        var5 = Torquing.field_u;
        try {
          var4_int = param2;
          if (var4_int != 0) {
            if (var4_int != 1) {
              if (var4_int == 2) {
                stackIn_18_1 = (param0.i((byte) -101) == 1);
                this.field_p = stackIn_18_1;
              }
            } else {
              stackIn_14_1 = (param0.i((byte) -101) == 1);
              this.field_t = stackIn_14_1;
            }
          } else {
            stackIn_10_1 = (1 == param0.i((byte) -101));
            this.field_s = stackIn_10_1;
          }
          if (param1 != 35) {
            this.field_s = false;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_24_0 = var4;
          stackIn_24_1 = new StringBuilder().append("nb.H(");
          if (param0 == null) {
            stackIn_25_2 = "null";
          } else {
            stackIn_25_2 = "{...}";
          }
          throw rb.a((Throwable) ((Object) stackIn_24_0), ((StringBuilder) (Object) stackIn_24_1).append(stackIn_25_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    static {
    }
}
