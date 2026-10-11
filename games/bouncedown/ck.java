/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class ck implements uh {
    static si field_e;
    static int field_b;
    private long field_d;
    static int field_c;
    static String field_f;
    static int field_a;

    public final String c(byte param0) {
        if (this.b((byte) -127)) {
          return null;
        }
        if (param0 != 66) {
          return (String) null;
        }
        if (350L + this.field_d > fa.a(-96)) {
          return null;
        }
        return this.a(8335);
    }

    public final vf a(byte param0) {
        if (this.b((byte) -62)) {
          return ha.field_l;
        }
        if (param0 < 121) {
          field_c = 111;
        }
        if (!(fa.a(81) >= (this.field_d + 350L))) {
          return ui.field_o;
        }
        return this.b(-1);
    }

    public static void f(byte param0) {
        field_e = null;
        field_f = null;
        if (param0 != -126) {
          ck.e((byte) -40);
        }
    }

    abstract vf b(int param0);

    abstract String a(int param0);

    public final void d(byte param0) {
        if (param0 <= 32) {
          this.c((byte) 37);
        }
        this.field_d = fa.a(-85);
    }

    final static ng a(String param0, String param1, long param2, int param3, boolean param4) {
        RuntimeException var6 = null;
        qe stackIn_5_0 = null;
        ek stackIn_8_0 = null;
        ji stackIn_10_0 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param3 <= 77) {
            field_e = (si) null;
          }
          if (0L == param2 &&
            param1 != null) {
            stackIn_5_0 = new qe(param1, param0);
            return (ng) ((Object) stackIn_5_0);
          }
          if (!param4) {
            stackIn_10_0 = new ji(param2, param0);
            return (ng) ((Object) stackIn_10_0);
          }
          stackIn_8_0 = new ek(param2, param0);
          return (ng) ((Object) stackIn_8_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_13_0 = var6;
          stackIn_13_1 = new StringBuilder().append("ck.V(");
          if (param0 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          stackIn_16_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',');
          if (param1 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw ii.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4) {
        int stackIn_6_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_15_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var11Lifetime1;
        int var11Lifetime2;
        int var11Lifetime3;
        int var12Lifetime1;
        int var12Lifetime2;
        int var12Lifetime3;
        var13 = Bounce.field_N;
        try {
          if (param4 != 14677) {
            return;
          }
          var5_int = param2 + param0;
          var6 = param3 + param1;
          if (na.field_g < param0) {
            stackIn_6_0 = param0;
          } else {
            stackIn_6_0 = na.field_g;
          }
          var7 = stackIn_6_0;
          if (na.field_i < param3) {
            stackIn_9_0 = param3;
          } else {
            stackIn_9_0 = na.field_i;
          }
          var8 = stackIn_9_0;
          if (na.field_b > var5_int) {
            stackIn_12_0 = var5_int;
          } else {
            stackIn_12_0 = na.field_b;
          }
          var9 = stackIn_12_0;
          if (na.field_f <= var6) {
            stackIn_15_0 = na.field_f;
          } else {
            stackIn_15_0 = var6;
          }
          var10 = stackIn_15_0;
          if (param0 >= na.field_g &&
            param0 < na.field_b) {
            var11 = var8 * na.field_e + param0;
            var12 = -var8 + (var10 + 1) >> 1;
            while (true) {
              var12--;
              if (var12 < 0) {
                break;
              }
              na.field_d[var11] = 16777215;
              var11 = var11 + 2 * na.field_e;
            }
          }
          if (na.field_i <= param3 &&
            na.field_f > var6) {
            var11Lifetime1 = na.field_e * param3 + var7;
            var12Lifetime1 = var9 + 1 - var7 >> 1;
            while (true) {
              var12Lifetime1--;
              if (var12Lifetime1 < 0) {
                break;
              }
              na.field_d[var11Lifetime1] = 16777215;
              var11Lifetime1 += 2;
            }
          }
          if (var5_int >= na.field_g &&
            var5_int < na.field_b) {
            var11Lifetime2 = ((-param0 + var5_int & 1) + var8) * na.field_e + var5_int;
            var12Lifetime2 = -var8 + 1 + var10 >> 1;
            while (true) {
              var12Lifetime2--;
              if (var12Lifetime2 < 0) {
                break;
              }
              na.field_d[var11Lifetime2] = 16777215;
              var11Lifetime2 = var11Lifetime2 + 2 * na.field_e;
            }
          }
          if (param3 >= na.field_i &&
            var6 < na.field_f) {
            var11Lifetime3 = (var6 - param3 & 1) + var6 * na.field_e + var7;
            var12Lifetime3 = -var7 + var9 + 1 >> 1;
            while (true) {
              var12Lifetime3--;
              if (var12Lifetime3 < 0) {
                return;
              }
              na.field_d[var11Lifetime3] = 16777215;
              var11Lifetime3 += 2;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          throw ii.a((Throwable) ((Object) var5), "ck.S(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final static boolean g(byte param0) {
        int var1 = -62 / ((49 - param0) / 62);
        return !pb.field_k.a(1000) ? true : false;
    }

    final static void e(byte param0) {
        d.a(ej.field_b, true, eb.field_z, 0);
        va.field_f = true;
        int var1 = -3 % ((param0 - 28) / 62);
    }

    final static String a(int param0, CharSequence param1) {
        int var4 = 0;
        int var2_int = 0;
        char[] var3 = null;
        int var5 = 0;
        int var6 = 0;
        char[] var7 = null;
        char[] var8 = null;
        String stackIn_21_0 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        var6 = Bounce.field_N;
        try {
          var2_int = param1.length();
          if (20 < var2_int) {
            var2_int = 20;
          }
          var8 = new char[var2_int];
          var7 = var8;
          var3 = var7;
          if (param0 > -57) {
            ck.a(18, -113, 56, 101, 46);
          }
          for (var4 = 0; var4 < var2_int; var4++) {
            var5 = param1.charAt(var4);
            if (var5 >= 65 &&
              var5 <= 90) {
              var3[var4] = (char)(-65 + (var5 + 97));
            } else if ((var5 < 97 ||
              var5 > 122) &&
              (var5 < 48 ||
              var5 > 57)) {
              var3[var4] = (char)95;
            } else {
              var3[var4] = (char)var5;
            }
          }
          stackIn_21_0 = new String(var8);
          return stackIn_21_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_24_0 = var2;
          stackIn_24_1 = new StringBuilder().append("ck.W(").append(param0).append(',');
          if (param1 == null) {
            stackIn_25_2 = "null";
          } else {
            stackIn_25_2 = "{...}";
          }
          throw ii.a((Throwable) ((Object) stackIn_24_0), ((StringBuilder) (Object) stackIn_24_1).append(stackIn_25_2).append(')').toString());
        }
    }

    static {
        field_b = -1;
        field_c = -1;
        field_f = "Play free version";
        field_a = 0;
    }
}
