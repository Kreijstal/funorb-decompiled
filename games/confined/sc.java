/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class sc {
    sd[] field_c;
    static bi[] field_h;
    static int[] field_i;
    static rf field_a;
    static String field_e;
    static int[] field_d;
    static int field_f;
    static String[] field_g;
    static String field_j;
    static String field_b;

    final static String a(String param0, char param1, String param2, int param3) {
        StringBuilder discarded$0 = null;
        StringBuilder discarded$1 = null;
        StringBuilder discarded$2 = null;
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9_int = 0;
        int var12 = 0;
        String stackIn_10_0 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        StringBuilder var9 = null;
        int var10 = 0;
        int var11 = 0;
        var12 = Confined.field_J ? 1 : 0;
        try {
          var4_int = param0.length();
          var5 = param2.length();
          var6 = var4_int;
          var7 = -1 + var5;
          var8 = 30 % ((-18 - param3) / 49);
          if (0 != var7) {
            var9_int = 0;
            while (true) {
              var9_int = param0.indexOf((int) param1, var9_int);
              if (var9_int < 0) {
                break;
              }
              var6 = var6 + var7;
              var9_int++;
            }
          }
          var9 = new StringBuilder(var6);
          var10 = 0;
          while (true) {
            var11 = param0.indexOf((int) param1, var10);
            if (0 > var11) {
              discarded$0 = var9.append(param0.substring(var10));
              stackIn_10_0 = var9.toString();
              return stackIn_10_0;
            }
            discarded$1 = var9.append(param0.substring(var10, var11));
            discarded$2 = var9.append(param2);
            var10 = var11 + 1;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_13_0 = var4;
          stackIn_13_1 = new StringBuilder().append("sc.I(");
          if (param0 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          stackIn_16_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw sd.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',').append(param3).append(')').toString());
        }
    }

    final int b(int param0, int param1) {
        int var3 = 0;
        sd var4 = null;
        int var5 = Confined.field_J ? 1 : 0;
        for (var3 = 0; var3 < this.field_c.length; var3++) {
          var4 = this.field_c[var3];
          if (param1 < var4.field_e.length) {
            return var3;
          }
          param1 = param1 - (-1 + var4.field_e.length);
        }
        if (param0 > -68) {
          field_g = (String[]) null;
        }
        return this.field_c.length;
    }

    final int a(boolean param0) {
        int var4 = 0;
        int var2;
        sd[] var3;
        sd var5;
        int var7;
        int var6;
        var7 = Confined.field_J ? 1 : 0;
        var2 = -1;
        if (!param0) {
          return 51;
        }
        if (this.field_c != null) {
          var3 = this.field_c;
          for (var4 = 0; var4 < var3.length; var4++) {
            var5 = var3[var4];
            if (var5 != null) {
              var6 = var5.b(61);
              if (var6 > var2) {
                var2 = var6;
              }
            }
          }
        }
        return var2;
    }

    final int b(int param0) {
        int stackIn_6_0 = 0;
        if (param0 != 23791) {
          return -87;
        }
        if (null != this.field_c &&
          this.field_c.length > 0) {
          stackIn_6_0 = this.field_c[-1 + this.field_c.length].field_a - this.field_c[0].field_d;
        } else {
          stackIn_6_0 = 0;
        }
        return stackIn_6_0;
    }

    public static void a(int param0) {
        field_g = null;
        field_e = null;
        field_b = null;
        field_a = null;
        field_h = null;
        field_d = null;
        field_i = null;
        field_j = null;
        if (param0 != -30048) {
          sc.a(-29);
        }
    }

    final int a(int param0, int param1) {
        sd var5 = null;
        int var6 = Confined.field_J ? 1 : 0;
        sd[] var7 = this.field_c;
        sd[] var3 = var7;
        int var4 = 0;
        if (param1 >= -88) {
          return 46;
        }
        while (var7.length > var4) {
          var5 = var7[var4];
          if (var5.field_e.length > param0) {
            return var5.field_e[param0];
          }
          param0 = param0 - (var5.field_e.length - 1);
          var4++;
        }
        return 0;
    }

    final int a(int param0, byte param1, int param2) {
        sd var6 = null;
        int var7 = 0;
        int var8 = Confined.field_J ? 1 : 0;
        if (this.field_c == null ||
          this.field_c.length == 0 ||
          this.field_c[0].field_d > param0) {
          return -1;
        }
        if (param0 > this.field_c[-1 + this.field_c.length].field_a) {
          return -1;
        }
        if (1 == this.field_c.length) {
          return this.field_c[0].a((byte) 85, param2);
        }
        int var4 = 0;
        int var5 = 0;
        if (param1 >= -123) {
          this.a(-123, 16);
        }
        while (var5 < this.field_c.length) {
          var6 = this.field_c[var5];
          if (var6.field_d <= param0 &&
            !(var6.field_a < param0)) {
            var7 = var6.a((byte) 85, param2);
            if (var7 == -1) {
              return -1;
            }
            return var7 + var4;
          }
          var4 = var4 + (var6.field_e.length - 1);
          var5++;
        }
        return -1;
    }

    final int a(int param0, int param1, int param2, String param3) {
        int var8 = 0;
        int var5_int = 0;
        int var6 = 0;
        int var7 = 0;
        int var9 = 0;
        int var10 = 0;
        int stackIn_3_0 = 0;
        int stackIn_23_0 = 0;
        int stackIn_25_0 = 0;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_29_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        var10 = Confined.field_J ? 1 : 0;
        try {
          var5_int = 0;
          var6 = 0;
          var7 = param3.length();
          if (param2 != 28438) {
            stackIn_3_0 = -83;
            return stackIn_3_0;
          }
          for (var8 = 0; var8 < var7; var8++) {
            var9 = param3.charAt(var8);
            if (var9 == 60) {
              var6 = 1;
            } else {
              if (62 == var9) {
                var6 = 0;
              } else {
                if (var6 == 0 &&
                  32 == var9) {
                  var5_int++;
                }
              }
            }
          }
          if (var5_int > 0) {
            stackIn_23_0 = (param1 - param0 << 8) / var5_int;
            return stackIn_23_0;
          }
          stackIn_25_0 = 0;
          return stackIn_25_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_28_0 = var5;
          stackIn_28_1 = new StringBuilder().append("sc.K(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_29_2 = "null";
          } else {
            stackIn_29_2 = "{...}";
          }
          throw sd.a((Throwable) ((Object) stackIn_28_0), ((StringBuilder) (Object) stackIn_28_1).append(stackIn_29_2).append(')').toString());
        }
    }

    static {
        field_h = new bi[4];
        field_i = new int[8192];
        field_a = new rf();
        field_e = "Charge#cannon#This weapon is difficult to control,#since it takes time to charge and#will fire as soon as it is ready.";
        field_f = 0;
        field_d = new int[10];
        field_b = "Password: ";
        field_j = "You already have 20 homing missiles";
    }
}
