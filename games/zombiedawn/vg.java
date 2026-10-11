/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class vg {
    static volatile int field_c;
    static int[][] field_a;
    oe[] field_b;

    final int a(int param0, int param1) {
        int var4 = 0;
        oe var5 = null;
        int var6 = ZombieDawn.field_J;
        int var3 = 24 / ((29 - param0) / 61);
        for (var4 = 0; var4 < this.field_b.length; var4++) {
          var5 = this.field_b[var4];
          if (param1 < var5.field_e.length) {
            return var4;
          }
          param1 = param1 - (-1 + var5.field_e.length);
        }
        return this.field_b.length;
    }

    final int a(byte param0) {
        int var2;
        int stackIn_4_0 = 0;
        var2 = 98 % ((param0 - 46) / 56);
        if (null != this.field_b &&
          this.field_b.length > 0) {
          stackIn_4_0 = -this.field_b[0].field_b + this.field_b[-1 + this.field_b.length].field_g;
        } else {
          stackIn_4_0 = 0;
        }
        return stackIn_4_0;
    }

    final int a(int param0, String param1, int param2, int param3) {
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
        var10 = ZombieDawn.field_J;
        try {
          var5_int = 0;
          if (param3 <= 15) {
            stackIn_3_0 = 100;
            return stackIn_3_0;
          }
          var6 = 0;
          var7 = param1.length();
          for (var8 = 0; var8 < var7; var8++) {
            var9 = param1.charAt(var8);
            if (var9 != 60) {
              if (62 == var9) {
                var6 = 0;
              } else {
                if (var6 == 0 &&
                  var9 == 32) {
                  var5_int++;
                }
              }
            } else {
              var6 = 1;
            }
          }
          if (var5_int <= 0) {
            stackIn_22_0 = 0;
            return stackIn_22_0;
          }
          stackIn_19_0 = -param0 + param2 << 8;
          stackIn_19_1 = var5_int;
          stackIn_20_0 = stackIn_19_0 / stackIn_19_1;
          return stackIn_20_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_25_0 = var5;
          stackIn_25_1 = new StringBuilder().append("vg.E(").append(param0).append(',');
          if (param1 == null) {
            stackIn_26_2 = "null";
          } else {
            stackIn_26_2 = "{...}";
          }
          throw sh.a((Throwable) ((Object) stackIn_25_0), ((StringBuilder) (Object) stackIn_25_1).append(stackIn_26_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final int a(byte param0, int param1) {
        oe var5 = null;
        int var6 = ZombieDawn.field_J;
        oe[] var3 = this.field_b;
        int var4 = 0;
        if (param0 != -72) {
          this.a((byte) -52, 56);
        }
        while (var4 < var3.length) {
          var5 = var3[var4];
          if (param1 < var5.field_e.length) {
            return var5.field_e[param1];
          }
          param1 = param1 - (var5.field_e.length - 1);
          var4++;
        }
        return 0;
    }

    final int a(int param0, int param1, boolean param2) {
        int var5 = 0;
        int var4;
        oe var6;
        int var7;
        int var8;
        var8 = ZombieDawn.field_J;
        if (!param2) {
          field_a = (int[][]) null;
        }
        if (this.field_b != null &&
          this.field_b.length != 0 &&
          this.field_b[0].field_b <= param1) {
          if (param1 > this.field_b[-1 + this.field_b.length].field_g) {
            return -1;
          }
          if (this.field_b.length == 1) {
            return this.field_b[0].a(param0, 0);
          }
          var4 = 0;
          for (var5 = 0; this.field_b.length > var5; var5++) {
            var6 = this.field_b[var5];
            if (var6.field_b <= param1 &&
              var6.field_g >= param1) {
              var7 = var6.a(param0, 0);
              if (var7 != -1) {
                return var7 + var4;
              }
              return -1;
            }
            var4 = var4 + (-1 + var6.field_e.length);
          }
          return -1;
        }
        return -1;
    }

    final int b(byte param0) {
        int var4 = 0;
        int var2;
        oe[] var3;
        oe var5;
        int var7;
        int var6;
        var7 = ZombieDawn.field_J;
        var2 = -1;
        if (param0 <= 5) {
          return -97;
        }
        if (null != this.field_b) {
          var3 = this.field_b;
          for (var4 = 0; var4 < var3.length; var4++) {
            var5 = var3[var4];
            if (var5 != null) {
              var6 = var5.a(-101);
              if (var2 < var6) {
                var2 = var6;
              }
            }
          }
        }
        return var2;
    }

    public static void a(int param0) {
        if (param0 != -1) {
          field_c = 105;
        }
        field_a = (int[][]) null;
    }

    static {
        field_c = -1;
    }
}
