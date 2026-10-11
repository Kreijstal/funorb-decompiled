/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class dk {
    private uh field_e;
    static boolean field_b;
    private oa field_l;
    private pj field_f;
    static int field_h;
    private java.math.BigInteger field_g;
    private be[] field_d;
    private java.math.BigInteger field_j;
    static int[] field_k;
    private cd field_c;
    static int field_i;
    static String field_a;

    dk(uh param0, cd param1) {
        this(param0, param1, (java.math.BigInteger) null, (java.math.BigInteger) null);
    }

    final static kk a(String param0, long param1, boolean param2, String param3, int param4) {
        RuntimeException var6 = null;
        ac stackIn_5_0 = null;
        bd stackIn_9_0 = null;
        wj stackIn_11_0 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param4 < 7) {
            dk.a((byte) 119);
          }
          if (param1 == 0L &&
            param0 != null) {
            stackIn_5_0 = new ac(param0, param3);
            return (kk) ((Object) stackIn_5_0);
          }
          if (param2) {
            stackIn_9_0 = new bd(param1, param3);
            return (kk) ((Object) stackIn_9_0);
          }
          stackIn_11_0 = new wj(param1, param3);
          return (kk) ((Object) stackIn_11_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_14_0 = var6;
          stackIn_14_1 = new StringBuilder().append("dk.B(");
          if (param0 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          stackIn_17_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw ch.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',').append(param4).append(')').toString());
        }
    }

    final static void a(int param0, ti[] param1, int param2, int param3, int param4, int param5) {
        int var21 = 0;
        int stackIn_10_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_16_0 = 0;
        int stackIn_19_0 = 0;
        RuntimeException stackIn_75_0 = null;
        StringBuilder stackIn_75_1 = null;
        String stackIn_76_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var22 = 0;
        int var20Lifetime1;
        int var20Lifetime2;
        int var20Lifetime3;
        int var20Lifetime4;
        var22 = Transmogrify.field_A ? 1 : 0;
        try {
          if (param1 == null) {
            return;
          }
          if (param5 > 0 &&
            param0 > 0) {
            if (null == param1[3]) {
              stackIn_10_0 = 0;
            } else {
              stackIn_10_0 = param1[3].field_r;
            }
            var6_int = stackIn_10_0;
            if (null != param1[5]) {
              stackIn_13_0 = param1[5].field_r;
            } else {
              stackIn_13_0 = 0;
            }
            var7 = stackIn_13_0;
            if (null == param1[1]) {
              stackIn_16_0 = 0;
            } else {
              stackIn_16_0 = param1[1].field_s;
            }
            var8 = stackIn_16_0;
            if (null == param1[7]) {
              stackIn_19_0 = 0;
            } else {
              stackIn_19_0 = param1[7].field_s;
            }
            var9 = stackIn_19_0;
            var10 = param5 + param3;
            if (param2 != -28018) {
              return;
            }
            var11 = param4 + param0;
            var12 = var6_int + param3;
            var13 = var10 - var7;
            var14 = param4 + var8;
            var15 = -var9 + var11;
            var16 = var12;
            var17 = var13;
            if (var16 > var17) {
              var17 = param5 * var6_int / (var6_int + var7) + param3;
              var16 = param5 * var6_int / (var6_int + var7) + param3;
            }
            var18 = var14;
            var19 = var15;
            sb.a(cc.field_d);
            if (var19 < var18) {
              var19 = param4 + param0 * var8 / (var8 + var9);
              var18 = param4 + param0 * var8 / (var8 + var9);
            }
            if (param1[0] != null) {
              sb.g(param3, param4, var16, var18);
              param1[0].c(param3, param4);
              sb.b(cc.field_d);
            }
            if (null != param1[2]) {
              sb.g(var17, param4, var10, var18);
              param1[2].c(var13, param4);
              sb.b(cc.field_d);
            }
            if (null != param1[6]) {
              sb.g(param3, var19, var16, var11);
              param1[6].c(param3, var15);
              sb.b(cc.field_d);
            }
            if (null != param1[8]) {
              sb.g(var17, var19, var10, var11);
              param1[8].c(var13, var15);
              sb.b(cc.field_d);
            }
            if (param1[1] != null &&
              param1[1].field_r != 0) {
              sb.g(var16, param4, var17, var18);
              for (var20 = var12; var20 < var13; var20 = var20 + param1[1].field_r) {
                param1[1].c(var20, param4);
              }
              sb.b(cc.field_d);
            }
            if (param1[7] != null &&
              param1[7].field_r != 0) {
              sb.g(var16, var19, var17, var11);
              for (var20Lifetime1 = var12; var13 > var20Lifetime1; var20Lifetime1 = var20Lifetime1 + param1[7].field_r) {
                param1[7].c(var20Lifetime1, var15);
              }
              sb.b(cc.field_d);
            }
            if (null != param1[3] &&
              param1[3].field_s != 0) {
              sb.g(param3, var18, var16, var19);
              for (var20Lifetime2 = var14; var15 > var20Lifetime2; var20Lifetime2 = var20Lifetime2 + param1[3].field_s) {
                param1[3].c(param3, var20Lifetime2);
              }
              sb.b(cc.field_d);
            }
            if (null != param1[5] &&
              0 != param1[5].field_s) {
              sb.g(var17, var18, var10, var19);
              for (var20Lifetime3 = var14; var20Lifetime3 < var15; var20Lifetime3 = var20Lifetime3 + param1[5].field_s) {
                param1[5].c(var13, var20Lifetime3);
              }
              sb.b(cc.field_d);
            }
            if (null != param1[4] &&
              param1[4].field_r != 0 &&
              param1[4].field_s != 0) {
              sb.g(var16, var18, var17, var19);
              for (var20Lifetime4 = var14; var20Lifetime4 < var15; var20Lifetime4 = var20Lifetime4 + param1[4].field_s) {
                for (var21 = var12; var13 > var21; var21 = var21 + param1[4].field_r) {
                  param1[4].c(var21, var20Lifetime4);
                }
              }
              sb.b(cc.field_d);
              return;
            }
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_75_0 = var6;
          stackIn_75_1 = new StringBuilder().append("dk.D(").append(param0).append(',');
          if (param1 == null) {
            stackIn_76_2 = "null";
          } else {
            stackIn_76_2 = "{...}";
          }
          throw ch.a((Throwable) ((Object) stackIn_75_0), ((StringBuilder) (Object) stackIn_75_1).append(stackIn_76_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(')').toString());
        }
    }

    final be a(int param0, boolean param1, int param2, ak param3, ak param4) {
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        be var9 = null;
        byte[] var13 = null;
        be stackIn_9_0 = null;
        be stackIn_13_0 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this.field_l == null) {
            throw new RuntimeException();
          }
          if (param0 >= 0 &&
            this.field_d.length > param0) {
            if (null != this.field_d[param0]) {
              stackIn_9_0 = this.field_d[param0];
              return stackIn_9_0;
            }
            this.field_l.field_h = 6 + 72 * param0;
            var6_int = this.field_l.c((byte) -112);
            var7 = this.field_l.c((byte) -108);
            var13 = new byte[64];
            this.field_l.a(64, 2, var13, 0);
            if (param2 != 24108) {
              field_b = true;
            }
            var9 = new be(param0, param4, param3, this.field_e, this.field_c, var6_int, var13, var7, param1);
            this.field_d[param0] = var9;
            stackIn_13_0 = var9;
            return stackIn_13_0;
          }
          throw new RuntimeException();
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_16_0 = var6;
          stackIn_16_1 = new StringBuilder().append("dk.F(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          stackIn_19_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',');
          if (param4 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          throw ch.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(')').toString());
        }
    }

    private dk(uh param0, cd param1, java.math.BigInteger param2, java.math.BigInteger param3) {
        try {
          this.field_j = param3;
          this.field_e = param0;
          this.field_g = param2;
          this.field_c = param1;
          if (!this.field_e.b(6)) {
            this.field_f = this.field_e.a(255, false, true, (byte) 0, 255);
          }
        } catch (RuntimeException runtimeException) {
          throw ch.a((Throwable) ((Object) runtimeException), "dk.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    final boolean b(boolean param0) {
        int var7 = 0;
        int var3;
        byte[] var4;
        byte[] var5;
        java.math.BigInteger var7_ref_java_math_BigInteger;
        int var8;
        oa var10;
        byte[] var11;
        java.math.BigInteger var12;
        byte[] var13;
        byte[] var15;
        var8 = Transmogrify.field_A ? 1 : 0;
        if (this.field_l != null) {
          return true;
        }
        if (null == this.field_f) {
          if (this.field_e.b(6)) {
            return false;
          }
          this.field_f = this.field_e.a(255, false, true, (byte) 0, 255);
        }
        if (this.field_f.field_m) {
          return false;
        }
        var10 = new oa(this.field_f.e(256));
        var10.field_h = 5;
        var3 = var10.d((byte) 30);
        var10.field_h = var10.field_h + var3 * 72;
        var13 = new byte[var10.field_g.length - var10.field_h];
        var11 = var13;
        var4 = var11;
        var10.a(var13.length, 2, var13, 0);
        if (param0) {
          return true;
        }
        if (this.field_g != null &&
          null != this.field_j) {
          var12 = new java.math.BigInteger(var13);
          var7_ref_java_math_BigInteger = var12.modPow(this.field_g, this.field_j);
          var5 = var7_ref_java_math_BigInteger.toByteArray();
        } else {
          var5 = var4;
        }
        if (var5.length != 65) {
          throw new RuntimeException();
        }
        var15 = n.a(var10.field_g, -5 + (-var13.length + var10.field_h), -5705, 5);
        for (var7 = 0; var7 < 64; var7++) {
          if (var15[var7] != var5[var7 + 1]) {
            throw new RuntimeException();
          }
        }
        this.field_l = var10;
        this.field_d = new be[var3];
        return true;
    }

    public static void a(byte param0) {
        field_k = null;
        field_a = null;
        int var1 = 45 % ((67 - param0) / 36);
    }

    final void a(boolean param0) {
        int var2;
        int var3;
        ak var4;
        be stackIn_18_0 = null;
        int var2Lifetime1;
        var3 = Transmogrify.field_A ? 1 : 0;
        if (param0) {
          var4 = (ak) null;
          this.a(-91, false, 38, (ak) null, (ak) null);
        }
        if (this.field_d == null) {
          return;
        }
        for (var2 = 0; this.field_d.length > var2; var2++) {
          if (this.field_d[var2] != null) {
            this.field_d[var2].d(23881);
          }
        }
        for (var2Lifetime1 = 0; var2Lifetime1 < this.field_d.length; var2Lifetime1++) {
          if (null != this.field_d[var2Lifetime1]) {
            stackIn_18_0 = this.field_d[var2Lifetime1];
            ((be) (Object) stackIn_18_0).b((byte) 126);
          }
        }
    }

    static {
        field_b = false;
        field_i = 0;
        field_a = "Next";
    }
}
