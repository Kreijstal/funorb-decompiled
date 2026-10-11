/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jg extends am {
    static String field_v;
    private int field_s;
    static String field_u;
    static String field_w;
    static t field_t;
    private int field_x;

    final static void a(int param0, int param1, byte param2, int param3, int param4, int param5, int param6) {
        RuntimeException decompiledCaughtException = null;
        int var7_int = 0;
        RuntimeException var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var17 = 0;
        int[] var21 = null;
        int var15Lifetime1;
        int var15Lifetime2;
        var17 = Torquing.field_u;
        try {
          var11 = ln.a(qk.field_p, j.field_q, param4, 113);
          var12 = ln.a(qk.field_p, j.field_q, param6, 69);
          var13 = ln.a(qg.field_z, kn.field_e, param5, 96);
          var14 = ln.a(qg.field_z, kn.field_e, param1, 113);
          var7_int = ln.a(qk.field_p, j.field_q, param3 + param4, 99);
          var8 = ln.a(qk.field_p, j.field_q, -param3 + param6, 71);
          for (var15 = var11; var7_int > var15; var15++) {
            di.a(var13, (byte) -92, param0, qd.field_a[var15], var14);
          }
          for (var15Lifetime1 = var12; var8 < var15Lifetime1; var15Lifetime1--) {
            di.a(var13, (byte) 90, param0, qd.field_a[var15Lifetime1], var14);
          }
          var9 = ln.a(qg.field_z, kn.field_e, param5 + param3, 75);
          var10 = ln.a(qg.field_z, kn.field_e, -param3 + param1, 119);
          for (var15Lifetime2 = var7_int; var15Lifetime2 <= var8; var15Lifetime2++) {
            var21 = qd.field_a[var15Lifetime2];
            di.a(var13, (byte) -118, param0, var21, var9);
            di.a(var10, (byte) 4, param0, var21, var14);
          }
          if (param2 >= -108) {
            field_u = (String) null;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          throw rb.a((Throwable) ((Object) var7), "jg.D(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
    }

    final int[] a(byte param0, int param1) {
        int var5 = 0;
        int[] var3;
        int[] var4;
        int var6;
        int var7;
        int[] var8;
        int[] stackIn_9_0 = null;
        int stackIn_9_1 = 0;
        int stackIn_11_2 = 0;
        var7 = Torquing.field_u;
        if (param0 <= 86) {
          this.field_s = 60;
        }
        var8 = this.field_l.a(param1, 25657);
        var3 = var8;
        if (this.field_l.field_b) {
          var4 = this.b(0, 0, param1);
          for (var5 = 0; var5 < ci.field_c; var5++) {
            var6 = var4[var5];
            stackIn_9_0 = var8;
            stackIn_9_1 = var5;
            if (this.field_s <= var6 &&
              var6 <= this.field_x) {
              stackIn_11_2 = 4096;
            } else {
              stackIn_11_2 = 0;
            }
            stackIn_9_0[stackIn_9_1] = stackIn_11_2;
          }
        }
        return var8;
    }

    public static void g(byte param0) {
        field_v = null;
        field_w = null;
        field_t = null;
        if (param0 < 68) {
          jg.a(124, 87, (byte) 71, 65, 68, 33, -72);
        }
        field_u = null;
    }

    final static String a(boolean param0) {
        if (!param0) {
          return (String) null;
        }
        if (null == re.field_e) {
          return "";
        }
        return re.field_e;
    }

    final void a(fj param0, int param1, int param2) {
        int var4_int = 0;
        int var5 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        var5 = Torquing.field_u;
        try {
          var4_int = param2;
          if (0 != var4_int) {
            if (var4_int == 1) {
              this.field_x = param0.i(7088);
            }
          } else {
            this.field_s = param0.i(7088);
          }
          if (param1 != 35) {
            jg.a(57, -27, (byte) 70, -55, -8, -83, -31);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_12_0 = var4;
          stackIn_12_1 = new StringBuilder().append("jg.H(");
          if (param0 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw rb.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    public jg() {
        super(1, true);
        this.field_s = 0;
        this.field_x = 4096;
    }

    final static void a(int param0, int param1, boolean param2, int param3, int param4, int param5, int param6) {
        int var11 = 0;
        int incrementValue$0 = 0;
        int stackIn_26_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var7_int = 0;
        RuntimeException var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var7_intLifetime1;
        int var8Lifetime1;
        int var9Lifetime1;
        int var10Lifetime1;
        var14 = Torquing.field_u;
        try {
          if (param4 >= param0) {
            return;
          }
          if (param4 + 1 >= param6) {
            return;
          }
          if (param4 + 5 < param6 &&
            param3 != param5) {
            var7_int = (1 & (param3 & param5)) + ((param3 >> 1) + (param5 >> 1));
            var8 = param4;
            if (param1 > -27) {
              return;
            }
            var9 = param3;
            var10 = param5;
            for (var11 = param4; var11 < param6; var11++) {
              var12 = lp.field_g[var11];
              if (param2) {
                stackIn_26_0 = il.field_o[var12];
              } else {
                stackIn_26_0 = ji.field_a[var12];
              }
              var13 = stackIn_26_0;
              if (var13 <= var7_int) {
                if (var10 < var13) {
                  var10 = var13;
                }
              } else {
                lp.field_g[var11] = lp.field_g[var8];
                incrementValue$0 = var8;
                var8++;
                lp.field_g[incrementValue$0] = var12;
                if (var9 > var13) {
                  var9 = var13;
                }
              }
            }
            jg.a(param0, -101, param2, param3, param4, var9, var8);
            jg.a(param0, -29, param2, var10, var8, param5, param6);
            return;
          }
          for (var7_intLifetime1 = -1 + param6; var7_intLifetime1 > param4; var7_intLifetime1--) {
            for (var8Lifetime1 = param4; var7_intLifetime1 > var8Lifetime1; var8Lifetime1++) {
              var9Lifetime1 = lp.field_g[var8Lifetime1];
              var10Lifetime1 = lp.field_g[1 + var8Lifetime1];
              if (vc.a(param2, var10Lifetime1, 0, var9Lifetime1)) {
                lp.field_g[var8Lifetime1] = var10Lifetime1;
                lp.field_g[var8Lifetime1 + 1] = var9Lifetime1;
              }
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          throw rb.a((Throwable) ((Object) var7), "jg.E(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
    }

    static {
        field_w = "Connection lost. <%0>";
        field_u = "This password contains repeated characters, and would be easy to guess";
        field_v = "Unfortunately there was a focus problem while setting fullscreen mode. You could try disabling any multiple monitor drivers or window enhancements, if you have any enabled, or try a different resolution.";
    }
}
