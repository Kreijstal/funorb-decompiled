/*
 * Decompiled by CFR-JS 0.4.0.
 */
class gg {
    gg field_c;
    static oj field_b;
    long field_j;
    static long field_a;
    static int field_d;
    static int field_i;
    static byte[] field_e;
    static af field_f;
    gg field_g;
    static int[] field_h;

    final static void a(String param0, int param1) {
        try {
          df.a(param1 ^ -11, param0);
          we.a(false, param1 + 12660, ul.field_H);
          if (param1 != 97) {
            gg.b((byte) -95);
          }
        } catch (RuntimeException runtimeException) {
          throw ma.a((Throwable) ((Object) runtimeException), "gg.NB(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final static String a(String param0, String param1, String param2, int param3) {
        int var4 = 0;
        int var5 = 0;
        String stackIn_6_0 = null;
        var5 = stellarshard.field_B;
        var4 = param0.indexOf(param2);
        if (param3 <= 35) {
          gg.a(-103, -1, -45, -55, 12);
        }
        while (true) {
          if (var4 == -1) {
            return param0;
          }
          param0 = param0.substring(0, var4) + param1 + param0.substring(var4 + param2.length());
          stackIn_6_0 = (String) (param0);
          if (var5 != 0) {
            return stackIn_6_0;
          }
          var4 = ((String) (Object) stackIn_6_0).indexOf(param2, var4 + param1.length());
        }
    }

    final boolean b(int param0) {
        if (this.field_c == null) {
          return false;
        }
        if (param0 != 48) {
          field_i = -18;
          return true;
        }
        return true;
    }

    public static void b(byte param0) {
        field_b = null;
        field_f = null;
        field_h = null;
        if (param0 != -127) {
          field_a = 86L;
          field_e = null;
          return;
        }
        field_e = null;
    }

    final void c(int param0) {
        if (this.field_c == null) {
          return;
        }
        this.field_c.field_g = this.field_g;
        this.field_g.field_c = this.field_c;
        this.field_g = null;
        if (param0 == 20) {
          this.field_c = null;
          return;
        }
        field_b = (oj) null;
        this.field_c = null;
    }

    final static void a(int param0, int param1, int param2, int param3, int param4) {
        int var5 = -112 / ((param0 + 39) / 56);
        kg.d(false);
        ti.a(param4, param2, param1, param3);
    }

    final static String a(CharSequence param0, boolean param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        char[] var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        char[] var7 = null;
        char[] var8 = null;
        String stackIn_24_0 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_28_2 = null;
        RuntimeException decompiledCaughtException = null;
        var6 = stellarshard.field_B;
        try {
          var2_int = param0.length();
          if (var2_int > 20) {
            var2_int = 20;
          }
          var8 = new char[var2_int];
          var7 = var8;
          var3 = var7;
          if (param1) {
            gg.a(-62, 112, -30, 61, -127);
          }
          var4 = 0;
          while (var2_int > var4) {
            var5 = param0.charAt(var4);
            if (var5 < 65 ||
              var5 > 90) {
              if (var5 >= 97 &&
                var5 <= 122 ||
                48 <= var5 &&
                var5 <= 57) {
                var3[var4] = (char)var5;
                if (var6 != 0) {
                  var3[var4] = (char)95;
                  var3[var4] = (char)(var5 - 65 + 97);
                }
              } else {
                var3[var4] = (char)95;
                if (var6 != 0) {
                  var3[var4] = (char)(var5 - 65 + 97);
                }
              }
            } else {
              var3[var4] = (char)(var5 - 65 + 97);
            }
            var4++;
            if (var6 == 0) {
              continue;
            }
            break;
          }
          stackIn_24_0 = new String(var8);
          return stackIn_24_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_27_0 = var2;
          stackIn_27_1 = new StringBuilder().append("gg.MB(");
          if (param0 == null) {
            stackIn_28_2 = "null";
          } else {
            stackIn_28_2 = "{...}";
          }
          throw ma.a((Throwable) ((Object) stackIn_27_0), ((StringBuilder) (Object) stackIn_27_1).append(stackIn_28_2).append(',').append(param1).append(')').toString());
        }
    }

    static {
        field_i = 1;
        field_f = null;
        field_e = new byte[520];
        field_b = new oj();
        field_h = new int[1024];
    }
}
