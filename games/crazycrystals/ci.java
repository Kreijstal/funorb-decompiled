/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ci extends se {
    static gb field_k;
    static String field_j;
    static db field_i;

    ci(ga param0) {
        super(param0);
    }

    final oi a(String param0, byte param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        CharSequence var4 = null;
        CharSequence var5 = null;
        oi stackIn_2_0 = null;
        oi stackIn_7_0 = null;
        oi stackIn_10_0 = null;
        oi stackIn_12_0 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var4 = (CharSequence) ((Object) param0);
          if (!cd.a(var4, (byte) -117)) {
            stackIn_2_0 = rk.field_c;
            return stackIn_2_0;
          }
          var5 = (CharSequence) ((Object) param0);
          var3_int = ti.a(param1 ^ -30, var5);
          if (var3_int > 0 &&
            var3_int <= 130) {
            if (param1 == -122) {
              stackIn_12_0 = ih.field_b;
              return stackIn_12_0;
            }
            stackIn_10_0 = (oi) null;
            return stackIn_10_0;
          }
          stackIn_7_0 = rk.field_c;
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_15_0 = var3;
          stackIn_15_1 = new StringBuilder().append("ci.G(");
          if (param0 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw dn.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param1).append(')').toString());
        }
    }

    final static dl[] a(int param0, int param1, byte param2, int param3, int param4) {
        if (param2 == -70) {
          return rc.a(3, 1, param1, param3, 1, param0, param4, param2 ^ -3020, 1);
        }
        field_j = (String) null;
        return rc.a(3, 1, param1, param3, 1, param0, param4, param2 ^ -3020, 1);
    }

    final static String a(String[] args, String param1, int param2) {
        StringBuilder discarded$2 = null;
        StringBuilder discarded$0 = null;
        StringBuilder discarded$1 = null;
        String stackIn_13_0 = null;
        int stackIn_19_0 = 0;
        String stackIn_29_0 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        String stackIn_33_2 = null;
        StringBuilder stackIn_35_1 = null;
        String stackIn_36_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6_int = 0;
        StringBuilder var6 = null;
        int var7 = 0;
        String var7_ref_String = null;
        int var8 = 0;
        String var9 = null;
        int var10 = 0;
        int var11 = 0;
        int var5Lifetime1;
        int var8Lifetime1;
        var11 = CrazyCrystals.field_B;
        try {
          var3_int = param1.length();
          var4 = var3_int;
          var5 = 0;
          while (true) {
            var6_int = param1.indexOf("<%", var5);
            if (var6_int >= 0) {
              for (var5 = var6_int + 2; var3_int > var5; var5++) {
                if (ag.a(param1.charAt(var5), 48)) {
                  continue;
                }
                break;
              }
              var7_ref_String = param1.substring(2 + var6_int, var5);
              if (!cd.a((CharSequence) ((Object) var7_ref_String), (byte) -109)) {
                continue;
              }
              if (var5 >= var3_int) {
                continue;
              }
              if (param1.charAt(var5) != 62) {
                continue;
              }
              var5++;
              var8 = ti.a(param2 ^ 103, (CharSequence) ((Object) var7_ref_String));
              var4 = var4 + (args[var8].length() + (var6_int - var5));
              continue;
            }
            break;
          }
          var6 = new StringBuilder(var4);
          var7 = 0;
          if (param2 != 3) {
            stackIn_13_0 = (String) null;
            return stackIn_13_0;
          }
          var5Lifetime1 = 0;
          while (true) {
            var8Lifetime1 = param1.indexOf("<%", var5Lifetime1);
            if (0 > var8Lifetime1) {
              discarded$2 = var6.append(param1.substring(var7));
              stackIn_29_0 = var6.toString();
              return stackIn_29_0;
            }
            stackIn_19_0 = var8Lifetime1 + 2;
            for (var5Lifetime1 = stackIn_19_0; var3_int > var5Lifetime1; var5Lifetime1++) {
              if (ag.a(param1.charAt(var5Lifetime1), 48)) {
                continue;
              }
              break;
            }
            var9 = param1.substring(var8Lifetime1 + 2, var5Lifetime1);
            if (!cd.a((CharSequence) ((Object) var9), (byte) -112)) {
              continue;
            }
            if (var3_int <= var5Lifetime1) {
              continue;
            }
            if (param1.charAt(var5Lifetime1) != 62) {
              continue;
            }
            var5Lifetime1++;
            var10 = ti.a(100, (CharSequence) ((Object) var9));
            discarded$0 = var6.append(param1.substring(var7, var8Lifetime1));
            var7 = var5Lifetime1;
            discarded$1 = var6.append(args[var10]);
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_32_0 = var3;
          stackIn_32_1 = new StringBuilder().append("ci.I(");
          if (args == null) {
            stackIn_33_2 = "null";
          } else {
            stackIn_33_2 = "{...}";
          }
          stackIn_35_1 = ((StringBuilder) (Object) stackIn_32_1).append(stackIn_33_2).append(',');
          if (param1 == null) {
            stackIn_36_2 = "null";
          } else {
            stackIn_36_2 = "{...}";
          }
          throw dn.a((Throwable) ((Object) stackIn_32_0), ((StringBuilder) (Object) stackIn_35_1).append(stackIn_36_2).append(',').append(param2).append(')').toString());
        }
    }

    final String a(String param0, int param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        String stackIn_2_0 = null;
        Object stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this.a(param0, (byte) -122) == rk.field_c) {
            stackIn_2_0 = bh.field_d;
            return stackIn_2_0;
          }
          var3_int = 14 / ((41 - param1) / 49);
          stackIn_4_0 = null;
          return (String) (stackIn_4_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_7_0 = var3;
          stackIn_7_1 = new StringBuilder().append("ci.H(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw dn.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param1).append(')').toString());
        }
    }

    public static void d(int param0) {
        int var1 = -12 % ((param0 + 6) / 48);
        field_i = null;
        field_k = null;
        field_j = null;
    }

    final static void a(int param0, int param1, boolean param2, int param3, int param4) {
        int stackIn_4_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_13_0 = 0;
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
        var13 = CrazyCrystals.field_B;
        try {
          var5_int = param4 + param0;
          var6 = param1 + param3;
          if (param0 > kh.field_c) {
            stackIn_4_0 = param0;
          } else {
            stackIn_4_0 = kh.field_c;
          }
          var7 = stackIn_4_0;
          if (param1 > kh.field_b) {
            stackIn_7_0 = param1;
          } else {
            stackIn_7_0 = kh.field_b;
          }
          var8 = stackIn_7_0;
          if (var5_int >= kh.field_g) {
            stackIn_10_0 = kh.field_g;
          } else {
            stackIn_10_0 = var5_int;
          }
          var9 = stackIn_10_0;
          if (var6 >= kh.field_j) {
            stackIn_13_0 = kh.field_j;
          } else {
            stackIn_13_0 = var6;
          }
          var10 = stackIn_13_0;
          if (param0 >= kh.field_c &&
            kh.field_g > param0) {
            var11 = param0 + kh.field_l * var8;
            var12 = 1 + var10 - var8 >> 1;
            while (true) {
              var12--;
              if (var12 < 0) {
                break;
              }
              kh.field_i[var11] = 16777215;
              var11 = var11 + kh.field_l * 2;
            }
          }
          if (kh.field_b <= param1 &&
            kh.field_j > var6) {
            var11Lifetime1 = param1 * kh.field_l + var7;
            var12Lifetime1 = -var7 + 1 + var9 >> 1;
            while (true) {
              var12Lifetime1--;
              if (var12Lifetime1 < 0) {
                break;
              }
              kh.field_i[var11Lifetime1] = 16777215;
              var11Lifetime1 += 2;
            }
          }
          if (param2) {
            field_i = (db) null;
          }
          if (var5_int >= kh.field_c &&
            var5_int < kh.field_g) {
            var11Lifetime2 = (var8 + (1 & -param0 + var5_int)) * kh.field_l + var5_int;
            var12Lifetime2 = -var8 + 1 + var10 >> 1;
            while (true) {
              var12Lifetime2--;
              if (var12Lifetime2 < 0) {
                break;
              }
              kh.field_i[var11Lifetime2] = 16777215;
              var11Lifetime2 = var11Lifetime2 + 2 * kh.field_l;
            }
          }
          if (kh.field_b <= param1) {
            if (var6 >= kh.field_j) {
              return;
            }
            var11Lifetime3 = var7 + (var6 * kh.field_l + (var6 - param1 & 1));
            var12Lifetime3 = -var7 + var9 + 1 >> 1;
            while (true) {
              var12Lifetime3--;
              if (var12Lifetime3 < 0) {
                return;
              }
              kh.field_i[var11Lifetime3] = 16777215;
              var11Lifetime3 += 2;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          throw dn.a((Throwable) ((Object) var5), "ci.E(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    static {
        field_j = "Unable to connect to the data server. Please check any firewall you are using.";
    }
}
