/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class iq {
    qj[] field_c;
    static String[] field_a;
    static String field_b;

    public static void b(int param0) {
        field_a = null;
        field_b = null;
        if (param0 != 0) {
          iq.$cfr$intArgs$a$8e2a9e3a0d15(-59, 98, 114, 64, -128);
        }
    }

    final int a(byte param0) {
        int var4 = 0;
        int var2;
        qj[] var3;
        qj var5;
        int var7;
        int var6;
        var7 = Kickabout.field_G;
        if (param0 != -25) {
          this.field_c = (qj[]) null;
        }
        var2 = -1;
        if (null != this.field_c) {
          var3 = this.field_c;
          for (var4 = 0; var4 < var3.length; var4++) {
            var5 = var3[var4];
            if (var5 != null) {
              var6 = var5.a((byte) -114);
              if (var2 < var6) {
                var2 = var6;
              }
            }
          }
        }
        return var2;
    }

    final int a(int param0) {
        int stackIn_6_0 = 0;
        if (param0 != -1761) {
          field_b = (String) null;
        }
        if (null != this.field_c &&
          this.field_c.length > 0) {
          stackIn_6_0 = this.field_c[this.field_c.length - 1].field_d - this.field_c[0].field_g;
        } else {
          stackIn_6_0 = 0;
        }
        return stackIn_6_0;
    }

    final static int a(byte param0, int param1, int param2, int param3, int param4) {
        ut var5 = tb.field_q[param3 % 10];
        if (param0 >= -66) {
          return -2;
        }
        param2 = param2 - var5.field_q;
        var5.c(-var5.field_s + param2, param1, param4);
        param2 -= 3;
        if (param3 >= 10) {
          param2 = iq.$cfr$intArgs$a$8e2a9e3a0d15(-109, param1, param2, param3 / 10, param4);
        }
        return param2;
    }

    final int a(int param0, int param1, int param2, String param3) {
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
        var10 = Kickabout.field_G;
        try {
          var5_int = 0;
          if (param1 != -61) {
            this.a(75, -37, -61);
          }
          var6 = 0;
          var7 = param3.length();
          for (var8 = 0; var8 < var7; var8++) {
            var9 = param3.charAt(var8);
            if (var9 == 60) {
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
          if (var5_int <= 0) {
            stackIn_22_0 = 0;
            return stackIn_22_0;
          }
          stackIn_20_0 = (-param2 + param0 << 8) / var5_int;
          return stackIn_20_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_25_0 = var5;
          stackIn_25_1 = new StringBuilder().append("iq.F(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_26_2 = "null";
          } else {
            stackIn_26_2 = "{...}";
          }
          throw nb.a((Throwable) ((Object) stackIn_25_0), ((StringBuilder) (Object) stackIn_25_1).append(stackIn_26_2).append(')').toString());
        }
    }

    final int a(int param0, int param1) {
        int var3 = 0;
        qj var4 = null;
        int var5 = Kickabout.field_G;
        for (var3 = param0; this.field_c.length > var3; var3++) {
          var4 = this.field_c[var3];
          if (param1 < var4.field_b.length) {
            return var3;
          }
          param1 = param1 - (var4.field_b.length - 1);
        }
        return this.field_c.length;
    }

    final int b(int param0, int param1) {
        int var4 = 0;
        qj var5 = null;
        int var6 = Kickabout.field_G;
        qj[] var7 = this.field_c;
        qj[] var3 = var7;
        for (var4 = param0; var4 < var7.length; var4++) {
          var5 = var7[var4];
          if (!(var5.field_b.length <= param1)) {
            return var5.field_b[param1];
          }
          param1 = param1 - (var5.field_b.length - 1);
        }
        return 0;
    }

    final int a(int param0, int param1, int param2) {
        int var5 = 0;
        int var4;
        qj var6;
        int var7;
        int var8;
        var8 = Kickabout.field_G;
        if (this.field_c != null &&
          this.field_c.length != 0 &&
          this.field_c[0].field_g <= param0) {
          if (this.field_c[-1 + this.field_c.length].field_d < param0) {
            return -1;
          }
          if (this.field_c.length == 1) {
            return this.field_c[0].a((byte) 101, param1);
          }
          var4 = 0;
          if (param2 != 29889) {
            this.b(19, -114);
          }
          for (var5 = 0; this.field_c.length > var5; var5++) {
            var6 = this.field_c[var5];
            if (var6.field_g <= param0 &&
              var6.field_d >= param0) {
              var7 = var6.a((byte) 101, param1);
              if (var7 == -1) {
                return -1;
              }
              return var4 + var7;
            }
            var4 = var4 + (var6.field_b.length - 1);
          }
          return -1;
        }
        return -1;
    }

    static {
        field_a = new String[]{"How To Move", "Using Your Feet", "The Players", "Player Stats", "Trinkets", "What You Need To Know"};
        field_b = "Choose colours and a stylish design for your team's clothing.";
    }

    /* Full JVM integer arguments; original narrow signature preserved. */
    final static int $cfr$intArgs$a$8e2a9e3a0d15(int param0, int param1, int param2, int param3, int param4) {
        ut var5 = tb.field_q[param3 % 10];
        if (param0 >= -66) {
          return -2;
        }
        param2 = param2 - var5.field_q;
        var5.c(-var5.field_s + param2, param1, param4);
        param2 -= 3;
        if (param3 >= 10) {
          param2 = iq.$cfr$intArgs$a$8e2a9e3a0d15(-109, param1, param2, param3 / 10, param4);
        }
        return param2;
    }
}
