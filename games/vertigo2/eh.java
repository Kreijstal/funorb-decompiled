/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class eh {
    static int field_c;
    static cr field_a;
    static int field_e;
    static String field_g;
    static String[] field_d;
    static int[] field_b;
    static int field_f;

    public static void a(byte param0) {
        field_g = null;
        field_b = null;
        field_d = null;
        int var1 = 61 % ((0 - param0) / 56);
        field_a = null;
    }

    final static int a(int param0, byte param1) {
        param0 = (param0 & 1431655765) + (-715827883 & param0 >>> 1);
        param0 = ((-858993460 & param0) >>> 2) + (858993459 & param0);
        param0 = (param0 >>> 4) + param0 & 252645135;
        param0 = param0 + (param0 >>> 8);
        if (param1 == -64) {
          param0 = param0 + (param0 >>> 16);
          return param0 & 255;
        }
        return -96;
    }

    final static void a(int param0, int param1, byte param2, int param3, int param4, int param5) {
        int var6;
        int var7;
        int var8;
        int var9;
        int var10;
        int var11;
        int var12;
        int var13;
        int var14;
        int var8Lifetime1;
        int var8Lifetime2;
        int var9Lifetime1;
        int var9Lifetime2;
        int var10Lifetime1;
        int var10Lifetime2;
        int var11Lifetime1;
        int var11Lifetime2;
        var14 = Vertigo2.field_L ? 1 : 0;
        var6 = -param5 + param1;
        var7 = -param3 + param0;
        if (param2 != -4) {
          return;
        }
        if (0 == var6) {
          if (var7 != 0) {
            cr.b(param3, param0, param2 ^ 3, param5, param4);
          }
          return;
        }
        if (var7 == 0) {
          e.a(param2 ^ -29, param1, param4, param3, param5);
          return;
        }
        var12 = (var7 << 12) / var6;
        var13 = -(param5 * var12 >> 12) + param3;
        if (ap.field_e > param1) {
          var9 = ap.field_e;
          var11 = var13 + (var12 * ap.field_e >> 12);
          if (ap.field_e <= param5) {
            if (ib.field_a >= param5) {
              var8 = param5;
              var10 = param3;
            } else {
              var10 = (ib.field_a * var12 >> 12) + var13;
              var8 = ib.field_a;
            }
          } else {
            var10 = (var12 * ap.field_e >> 12) + var13;
            var8 = ap.field_e;
          }
          if (ua.field_e > var11) {
            var11 = ua.field_e;
            var9 = (ua.field_e - var13 << 12) / var12;
          } else {
            if (var11 > cj.field_D) {
              var9 = (cj.field_D - var13 << 12) / var12;
              var11 = cj.field_D;
            }
          }
          if (var10 < ua.field_e) {
            var10 = ua.field_e;
            var8 = (ua.field_e - var13 << 12) / var12;
          } else {
            if (var10 > cj.field_D) {
              var8 = (cj.field_D - var13 << 12) / var12;
              var10 = cj.field_D;
            }
          }
          uj.a(var8, var9, var11, true, var10, param4);
          return;
        }
        if (param1 > ib.field_a) {
          var9Lifetime1 = ib.field_a;
          var11Lifetime1 = (ib.field_a * var12 >> 12) + var13;
          if (ap.field_e <= param5) {
            if (ib.field_a >= param5) {
              var8Lifetime1 = param5;
              var10Lifetime1 = param3;
            } else {
              var10Lifetime1 = (ib.field_a * var12 >> 12) + var13;
              var8Lifetime1 = ib.field_a;
            }
          } else {
            var10Lifetime1 = (var12 * ap.field_e >> 12) + var13;
            var8Lifetime1 = ap.field_e;
          }
          if (ua.field_e > var11Lifetime1) {
            var11Lifetime1 = ua.field_e;
            var9Lifetime1 = (ua.field_e - var13 << 12) / var12;
          } else {
            if (var11Lifetime1 > cj.field_D) {
              var9Lifetime1 = (cj.field_D - var13 << 12) / var12;
              var11Lifetime1 = cj.field_D;
            }
          }
          if (var10Lifetime1 < ua.field_e) {
            var10Lifetime1 = ua.field_e;
            var8Lifetime1 = (ua.field_e - var13 << 12) / var12;
          } else {
            if (var10Lifetime1 > cj.field_D) {
              var8Lifetime1 = (cj.field_D - var13 << 12) / var12;
              var10Lifetime1 = cj.field_D;
            }
          }
          uj.a(var8Lifetime1, var9Lifetime1, var11Lifetime1, true, var10Lifetime1, param4);
          return;
        }
        var11Lifetime2 = param0;
        var9Lifetime2 = param1;
        if (ap.field_e > param5) {
          var10Lifetime2 = (var12 * ap.field_e >> 12) + var13;
          var8Lifetime2 = ap.field_e;
        } else {
          if (ib.field_a >= param5) {
            var8Lifetime2 = param5;
            var10Lifetime2 = param3;
            if (ua.field_e > var11Lifetime2) {
              var11Lifetime2 = ua.field_e;
              var9Lifetime2 = (ua.field_e - var13 << 12) / var12;
            } else {
              if (var11Lifetime2 > cj.field_D) {
                var9Lifetime2 = (cj.field_D - var13 << 12) / var12;
                var11Lifetime2 = cj.field_D;
              }
            }
            if (var10Lifetime2 < ua.field_e) {
              var10Lifetime2 = ua.field_e;
              var8Lifetime2 = (ua.field_e - var13 << 12) / var12;
            } else {
              if (var10Lifetime2 > cj.field_D) {
                var8Lifetime2 = (cj.field_D - var13 << 12) / var12;
                var10Lifetime2 = cj.field_D;
              }
            }
            uj.a(var8Lifetime2, var9Lifetime2, var11Lifetime2, true, var10Lifetime2, param4);
            return;
          }
          var10Lifetime2 = (ib.field_a * var12 >> 12) + var13;
          var8Lifetime2 = ib.field_a;
        }
        if (ua.field_e > var11Lifetime2) {
          var11Lifetime2 = ua.field_e;
          var9Lifetime2 = (ua.field_e - var13 << 12) / var12;
        } else {
          if (var11Lifetime2 > cj.field_D) {
            var9Lifetime2 = (cj.field_D - var13 << 12) / var12;
            var11Lifetime2 = cj.field_D;
          }
        }
        if (var10Lifetime2 < ua.field_e) {
          var10Lifetime2 = ua.field_e;
          var8Lifetime2 = (ua.field_e - var13 << 12) / var12;
        } else {
          if (var10Lifetime2 > cj.field_D) {
            var8Lifetime2 = (cj.field_D - var13 << 12) / var12;
            var10Lifetime2 = cj.field_D;
          }
        }
        uj.a(var8Lifetime2, var9Lifetime2, var11Lifetime2, true, var10Lifetime2, param4);
        return;
    }

    final static Class a(int param0, String param1) throws ClassNotFoundException {
        RuntimeException var2 = null;
        Class stackIn_3_0 = null;
        Class stackIn_7_0 = null;
        Class stackIn_10_0 = null;
        Class stackIn_13_0 = null;
        Class stackIn_19_0 = null;
        Class stackIn_22_0 = null;
        Class stackIn_25_0 = null;
        Class stackIn_29_0 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        String stackIn_33_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1.equals("B")) {
            stackIn_3_0 = Byte.TYPE;
            return stackIn_3_0;
          }
          if (param1.equals("I")) {
            stackIn_7_0 = Integer.TYPE;
            return stackIn_7_0;
          }
          if (param1.equals("S")) {
            stackIn_10_0 = Short.TYPE;
            return stackIn_10_0;
          }
          if (param1.equals("J")) {
            stackIn_13_0 = Long.TYPE;
            return stackIn_13_0;
          }
          if (param0 != -1147375319) {
            field_d = (String[]) null;
          }
          if (param1.equals("Z")) {
            stackIn_19_0 = Boolean.TYPE;
            return stackIn_19_0;
          }
          if (param1.equals("F")) {
            stackIn_22_0 = Float.TYPE;
            return stackIn_22_0;
          }
          if (param1.equals("D")) {
            stackIn_25_0 = Double.TYPE;
            return stackIn_25_0;
          }
          if (!param1.equals("C")) {
            return Class.forName(param1);
          }
          stackIn_29_0 = Character.TYPE;
          return stackIn_29_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_32_0 = var2;
          stackIn_32_1 = new StringBuilder().append("eh.E(").append(param0).append(',');
          if (param1 == null) {
            stackIn_33_2 = "null";
          } else {
            stackIn_33_2 = "{...}";
          }
          throw wn.a((Throwable) ((Object) stackIn_32_0), ((StringBuilder) (Object) stackIn_32_1).append(stackIn_33_2).append(')').toString());
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        if (param1 == param7) {
          nf.a(param5, param6, (byte) 121, param0, param3, param7, param2);
          return;
        }
        if (param4 != 16711680) {
          field_f = 45;
          if (param0 - param7 < ap.field_e) {
            sg.a(param1, param5, param7, (byte) 47, param0, param3, param2, param6);
            return;
          }
          if (ib.field_a < param7 + param0) {
            sg.a(param1, param5, param7, (byte) 47, param0, param3, param2, param6);
            return;
          }
          if (param2 - param1 < ua.field_e) {
            sg.a(param1, param5, param7, (byte) 47, param0, param3, param2, param6);
            return;
          }
          if (cj.field_D < param2 + param1) {
            sg.a(param1, param5, param7, (byte) 47, param0, param3, param2, param6);
            return;
          }
          ip.a(param3, param0, param5, (byte) -45, param6, param7, param2, param1);
          return;
        }
        if (param0 - param7 < ap.field_e) {
          sg.a(param1, param5, param7, (byte) 47, param0, param3, param2, param6);
          return;
        }
        if (ib.field_a < param7 + param0) {
          sg.a(param1, param5, param7, (byte) 47, param0, param3, param2, param6);
          return;
        }
        if (param2 - param1 < ua.field_e) {
          sg.a(param1, param5, param7, (byte) 47, param0, param3, param2, param6);
          return;
        }
        if (cj.field_D < param2 + param1) {
          sg.a(param1, param5, param7, (byte) 47, param0, param3, param2, param6);
          return;
        }
        ip.a(param3, param0, param5, (byte) -45, param6, param7, param2, param1);
    }

    static {
        field_c = 200;
        field_g = "Invite players";
        field_d = new String[]{null, "Or click", "Or click", "Or click", "Or click", "Or click", "Or click", "Or click"};
    }
}
