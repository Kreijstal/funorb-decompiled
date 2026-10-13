/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class ep {
    static int[] field_f;
    static int field_k;
    ml[] field_c;
    static volatile int livePointerY;
    static String field_e;
    static int resultCounterTwo;
    static RgbSprite field_j;
    static RgbSprite field_h;
    static float field_a;
    static String field_d;
    static RgbSprite field_b;

    final int a(int param0, boolean param1) {
        int var3 = 0;
        ml var4 = null;
        int var5 = BrickABrac.field_J ? 1 : 0;
        if (!param1) {
          ep.a(false);
        }
        for (var3 = 0; this.field_c.length > var3; var3++) {
          var4 = this.field_c[var3];
          if (!(var4.field_g.length <= param0)) {
            return var3;
          }
          param0 = param0 - (var4.field_g.length - 1);
        }
        return this.field_c.length;
    }

    final int a(int param0) {
        int stackIn_6_0 = 0;
        if (param0 != 0) {
          this.a(-90, true, 49);
        }
        if (null != this.field_c &&
          this.field_c.length > 0) {
          stackIn_6_0 = -this.field_c[0].field_d + this.field_c[this.field_c.length - 1].field_a;
        } else {
          stackIn_6_0 = 0;
        }
        return stackIn_6_0;
    }

    final int a(int param0, byte param1) {
        int var4 = 0;
        ml var5 = null;
        int var6 = BrickABrac.field_J ? 1 : 0;
        if (param1 >= -33) {
          return -38;
        }
        ml[] var7 = this.field_c;
        ml[] var3 = var7;
        for (var4 = 0; var4 < var7.length; var4++) {
          var5 = var7[var4];
          if (var5.field_g.length > param0) {
            return var5.field_g[param0];
          }
          param0 = param0 - (var5.field_g.length - 1);
        }
        return 0;
    }

    final int a(int param0, boolean param1, int param2) {
        int var5 = 0;
        int var4;
        ml var6;
        int var7;
        int var8;
        var8 = BrickABrac.field_J ? 1 : 0;
        if (this.field_c != null &&
          0 != this.field_c.length &&
          this.field_c[0].field_d <= param2) {
          if (this.field_c[-1 + this.field_c.length].field_a < param2) {
            return -1;
          }
          if (this.field_c.length == 1) {
            return this.field_c[0].a((byte) -95, param0);
          }
          if (param1) {
            field_d = (String) null;
          }
          var4 = 0;
          for (var5 = 0; var5 < this.field_c.length; var5++) {
            var6 = this.field_c[var5];
            if (param2 >= var6.field_d &&
              var6.field_a >= param2) {
              var7 = var6.a((byte) -95, param0);
              if (var7 == -1) {
                return -1;
              }
              return var7 + var4;
            }
            var4 = var4 + (-1 + var6.field_g.length);
          }
          return -1;
        }
        return -1;
    }

    public static void a(boolean param0) {
        field_f = null;
        if (!param0) {
          field_b = (RgbSprite) null;
        }
        field_b = null;
        field_e = null;
        field_h = null;
        field_j = null;
        field_d = null;
    }

    final int b(int param0) {
        int var4 = 0;
        int var2;
        ml[] var3;
        ml var5;
        int var7;
        int var6;
        var7 = BrickABrac.field_J ? 1 : 0;
        if (param0 != 31458) {
          return 12;
        }
        var2 = -1;
        if (null != this.field_c) {
          var3 = this.field_c;
          for (var4 = 0; var4 < var3.length; var4++) {
            var5 = var3[var4];
            if (var5 != null) {
              var6 = var5.b((byte) 56);
              if (var6 > var2) {
                var2 = var6;
              }
            }
          }
        }
        return var2;
    }

    final static boolean a(String param0, byte param1, String param2) {
        String var3 = null;
        boolean stackIn_7_0 = false;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        try {
          param2 = wj.a(-1, param2, '_', "");
          if (param1 != 73) {
            ep.a(true);
          }
          var3 = w.a(10, param2);
          stackIn_7_0 = (param0.indexOf(param2) != -1) || (-1 != param0.indexOf(var3));
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_10_0 = var3_ref;
          stackIn_10_1 = new StringBuilder().append("ep.A(");
          if (param0 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          stackIn_13_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw qb.addExceptionContext((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(')').toString());
        }
    }

    final int a(int param0, int param1, String param2, boolean param3) {
        int var8 = 0;
        int var5_int = 0;
        int var6 = 0;
        int var7 = 0;
        int var9 = 0;
        int var10 = 0;
        int stackIn_20_0 = 0;
        int stackIn_22_0 = 0;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_26_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        var10 = BrickABrac.field_J ? 1 : 0;
        try {
          var5_int = 0;
          var6 = 0;
          var7 = param2.length();
          for (var8 = 0; var7 > var8; var8++) {
            var9 = param2.charAt(var8);
            if (60 == var9) {
              var6 = 1;
            } else {
              if (var9 == 62) {
                var6 = 0;
              } else {
                if (var6 == 0 &&
                  var9 == 32) {
                  var5_int++;
                }
              }
            }
          }
          if (!param3) {
            field_k = 66;
          }
          if (var5_int <= 0) {
            stackIn_22_0 = 0;
            return stackIn_22_0;
          }
          stackIn_20_0 = (param0 - param1 << 8) / var5_int;
          return stackIn_20_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_25_0 = var5;
          stackIn_25_1 = new StringBuilder().append("ep.H(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_26_2 = "null";
          } else {
            stackIn_26_2 = "{...}";
          }
          throw qb.addExceptionContext((Throwable) ((Object) stackIn_25_0), ((StringBuilder) (Object) stackIn_25_1).append(stackIn_26_2).append(',').append(param3).append(')').toString());
        }
    }

    static {
        field_f = new int[8192];
        livePointerY = -1;
        field_d = "Logging in...";
    }
}
