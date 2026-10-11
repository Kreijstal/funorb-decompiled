/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class ie {
    ri[] field_d;
    static float field_e;
    static String field_b;
    static kf field_a;
    static String field_c;

    public static void b(int param0) {
        field_c = null;
        if (param0 != 0) {
          ie.a(81, -82, 22, -52, -108, 64);
        }
        field_a = null;
        field_b = null;
    }

    final int a(byte param0) {
        int stackIn_7_0 = 0;
        if (param0 != 20) {
          ie.a(-6, -99, 20, 28, 4, 1);
        }
        if (null != this.field_d &&
          this.field_d.length > 0) {
          stackIn_7_0 = -this.field_d[0].field_c + this.field_d[-1 + this.field_d.length].field_b;
        } else {
          stackIn_7_0 = 0;
        }
        return stackIn_7_0;
    }

    final int b(int param0, int param1) {
        int var3 = 0;
        ri var4 = null;
        int var5 = Virogrid.field_F ? 1 : 0;
        for (var3 = param1; var3 < this.field_d.length; var3++) {
          var4 = this.field_d[var3];
          if (param0 < var4.field_d.length) {
            return var3;
          }
          param0 = param0 - (var4.field_d.length - 1);
        }
        return this.field_d.length;
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5) {
        int var6_int = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        int var6_intLifetime1;
        int var7Lifetime1;
        var9 = Virogrid.field_F ? 1 : 0;
        try {
          fd.field_B = new int[param5];
          o.field_d = new int[param0];
          var6_int = 0;
          if (param2 != 28476) {
            field_e = 1.0884095430374146f;
          }
          while (var6_int < param0) {
            var7 = -param3 + (500 - param1 * var6_int);
            var8 = param1 * var6_int + param3 + 140;
            o.field_d[var6_int] = var8;
            o.field_d[var6_int] = var7;
            var6_int++;
          }
          var10 = 0;
          var6_intLifetime1 = var10;
          while (var10 < param5) {
            var7Lifetime1 = -(var10 * param1) + 370 - param4;
            fd.field_B[var10] = var7Lifetime1;
            var10++;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          throw kg.a((Throwable) ((Object) var6), "ie.G(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    final static vh a(boolean param0, int param1, int param2, eh param3, eh param4) {
        RuntimeException var5 = null;
        vh stackIn_2_0 = null;
        vh stackIn_7_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0) {
            stackIn_2_0 = (vh) null;
            return stackIn_2_0;
          }
          if (!hn.a(param3, param2, param1, (byte) 109)) {
            return null;
          }
          stackIn_7_0 = jf.a(param4.a(param2, param1, 0), 20);
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_10_0 = var5;
          stackIn_10_1 = new StringBuilder().append("ie.C(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          stackIn_13_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',');
          if (param4 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw kg.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(')').toString());
        }
    }

    final int a(int param0, int param1) {
        int var4 = 0;
        ri var5 = null;
        int var6 = Virogrid.field_F ? 1 : 0;
        ri[] var7 = this.field_d;
        ri[] var3 = var7;
        if (param1 != -1) {
          field_c = (String) null;
        }
        for (var4 = 0; var4 < var7.length; var4++) {
          var5 = var7[var4];
          if (!(var5.field_d.length <= param0)) {
            return var5.field_d[param0];
          }
          param0 = param0 - (var5.field_d.length - 1);
        }
        return 0;
    }

    final int a(String param0, int param1, boolean param2, int param3) {
        int var8 = 0;
        int var5_int = 0;
        int var6 = 0;
        int var7 = 0;
        int var9 = 0;
        int var10 = 0;
        int stackIn_3_0 = 0;
        int stackIn_19_0 = 0;
        int stackIn_19_1 = 0;
        int stackIn_20_0 = 0;
        int stackIn_22_0 = 0;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_26_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        var10 = Virogrid.field_F ? 1 : 0;
        try {
          if (!param2) {
            stackIn_3_0 = 28;
            return stackIn_3_0;
          }
          var5_int = 0;
          var6 = 0;
          var7 = param0.length();
          for (var8 = 0; var8 < var7; var8++) {
            var9 = param0.charAt(var8);
            if (var9 == 60) {
              var6 = 1;
            } else {
              if (62 != var9) {
                if (var6 == 0 &&
                  var9 == 32) {
                  var5_int++;
                }
              } else {
                var6 = 0;
              }
            }
          }
          if (var5_int <= 0) {
            stackIn_22_0 = 0;
            return stackIn_22_0;
          }
          stackIn_19_0 = param3 - param1 << 8;
          stackIn_19_1 = var5_int;
          stackIn_20_0 = stackIn_19_0 / stackIn_19_1;
          return stackIn_20_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_25_0 = var5;
          stackIn_25_1 = new StringBuilder().append("ie.B(");
          if (param0 == null) {
            stackIn_26_2 = "null";
          } else {
            stackIn_26_2 = "{...}";
          }
          throw kg.a((Throwable) ((Object) stackIn_25_0), ((StringBuilder) (Object) stackIn_25_1).append(stackIn_26_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final int a(int param0) {
        int var4 = 0;
        int var2;
        ri[] var3;
        ri var5;
        int var7;
        int var6;
        var7 = Virogrid.field_F ? 1 : 0;
        if (param0 != 3209) {
          this.a(-28, -45);
        }
        var2 = -1;
        if (this.field_d != null) {
          var3 = this.field_d;
          for (var4 = 0; var3.length > var4; var4++) {
            var5 = var3[var4];
            if (var5 != null) {
              var6 = var5.a(-1);
              if (var6 > var2) {
                var2 = var6;
              }
            }
          }
        }
        return var2;
    }

    final int a(byte param0, int param1, int param2) {
        int var5 = 0;
        int var4;
        int var6;
        ri var7;
        int var8;
        int var9;
        var9 = Virogrid.field_F ? 1 : 0;
        if (this.field_d != null &&
          this.field_d.length != 0 &&
          param1 >= this.field_d[0].field_c) {
          if (this.field_d[-1 + this.field_d.length].field_b < param1) {
            return -1;
          }
          if (this.field_d.length == 1) {
            return this.field_d[0].a((byte) 89, param2);
          }
          var4 = 0;
          var6 = -97 / ((-46 - param0) / 56);
          for (var5 = 0; var5 < this.field_d.length; var5++) {
            var7 = this.field_d[var5];
            if (var7.field_c <= param1 &&
              param1 <= var7.field_b) {
              var8 = var7.a((byte) 119, param2);
              if (var8 == -1) {
                return -1;
              }
              return var8 + var4;
            }
            var4 = var4 + (-1 + var7.field_d.length);
          }
          return -1;
        }
        return -1;
    }

    static {
        field_b = "<%2>'s turn - playing <%0> (<%1>)";
        field_c = "Visit the Account Management section on the main site to view.";
    }
}
