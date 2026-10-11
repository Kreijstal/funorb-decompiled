/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class ne {
    static rh field_a;
    pi[] field_c;
    static int[] field_b;
    static fh field_d;

    final int a(int param0, String param1, int param2, int param3) {
        int var8 = 0;
        int var5_int = 0;
        int var6 = 0;
        int var7 = 0;
        int var9 = 0;
        int var10 = 0;
        int stackIn_18_0 = 0;
        int stackIn_20_0 = 0;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_24_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        var10 = fleas.field_A ? 1 : 0;
        try {
          var5_int = 0;
          var6 = 0;
          var7 = param1.length();
          for (var8 = param2; var7 > var8; var8++) {
            var9 = param1.charAt(var8);
            if (var9 != 60) {
              if (var9 != 62) {
                if (var6 == 0 &&
                  var9 == 32) {
                  var5_int++;
                }
              } else {
                var6 = 0;
              }
            } else {
              var6 = 1;
            }
          }
          if (0 >= var5_int) {
            stackIn_20_0 = 0;
            return stackIn_20_0;
          }
          stackIn_18_0 = (param3 - param0 << 8) / var5_int;
          return stackIn_18_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_23_0 = var5;
          stackIn_23_1 = new StringBuilder().append("ne.P(").append(param0).append(',');
          if (param1 == null) {
            stackIn_24_2 = "null";
          } else {
            stackIn_24_2 = "{...}";
          }
          throw pf.a((Throwable) ((Object) stackIn_23_0), ((StringBuilder) (Object) stackIn_23_1).append(stackIn_24_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    public static void a(byte param0) {
        field_d = null;
        if (param0 != -84) {
          ne.a((byte) 82);
        }
        field_a = null;
        field_b = null;
    }

    final int a(boolean param0) {
        int stackIn_6_0 = 0;
        if (!param0) {
          field_b = (int[]) null;
        }
        if (null != this.field_c &&
          this.field_c.length > 0) {
          stackIn_6_0 = this.field_c[-1 + this.field_c.length].field_c - this.field_c[0].field_a;
        } else {
          stackIn_6_0 = 0;
        }
        return stackIn_6_0;
    }

    static int a(int param0, int param1) {
        return param0 | param1;
    }

    final int b(int param0, int param1) {
        int var3 = 0;
        pi var4 = null;
        int var5 = fleas.field_A ? 1 : 0;
        if (param1 != -1) {
          return 33;
        }
        for (var3 = 0; var3 < this.field_c.length; var3++) {
          var4 = this.field_c[var3];
          if (param0 < var4.field_d.length) {
            return var3;
          }
          param0 = param0 - (var4.field_d.length - 1);
        }
        return this.field_c.length;
    }

    final int b(byte param0) {
        int var4 = 0;
        int var2;
        pi[] var3;
        pi var5;
        int var7;
        int var6;
        var7 = fleas.field_A ? 1 : 0;
        if (param0 != 97) {
          this.a(false);
        }
        var2 = -1;
        if (this.field_c != null) {
          var3 = this.field_c;
          for (var4 = 0; var3.length > var4; var4++) {
            var5 = var3[var4];
            if (var5 != null) {
              var6 = var5.b((byte) -42);
              if (var2 < var6) {
                var2 = var6;
              }
            }
          }
        }
        return var2;
    }

    final int a(int param0, int param1, byte param2) {
        int var5 = 0;
        int var4;
        pi var6;
        int var7;
        int var8;
        var8 = fleas.field_A ? 1 : 0;
        if (null != this.field_c &&
          this.field_c.length != 0 &&
          this.field_c[0].field_a <= param1) {
          if (this.field_c[-1 + this.field_c.length].field_c < param1) {
            return -1;
          }
          if (this.field_c.length == 1) {
            return this.field_c[0].a(6759, param0);
          }
          var4 = 0;
          if (param2 >= -104) {
            return -97;
          }
          for (var5 = 0; var5 < this.field_c.length; var5++) {
            var6 = this.field_c[var5];
            if (var6.field_a <= param1 &&
              param1 <= var6.field_c) {
              var7 = var6.a(6759, param0);
              if (var7 != -1) {
                return var4 + var7;
              }
              return -1;
            }
            var4 = var4 + (-1 + var6.field_d.length);
          }
          return -1;
        }
        return -1;
    }

    final int c(int param0, int param1) {
        int var4 = 0;
        pi var5 = null;
        int var6 = fleas.field_A ? 1 : 0;
        pi[] var7 = this.field_c;
        pi[] var3 = var7;
        if (param0 != -1) {
          field_a = (rh) null;
        }
        for (var4 = 0; var4 < var7.length; var4++) {
          var5 = var7[var4];
          if (param1 < var5.field_d.length) {
            return var5.field_d[param1];
          }
          param1 = param1 - (-1 + var5.field_d.length);
        }
        return 0;
    }

    static {
        field_b = new int[256];
        field_d = new fh(0, 2, 2, 1);
    }
}
