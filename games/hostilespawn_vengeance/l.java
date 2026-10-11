/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class l {
    static int[] field_c;
    static int field_a;
    static String field_b;
    static int field_d;
    static String field_e;

    final static int a(int param0, int param1) {
        int var2;
        int var3;
        var3 = HostileSpawn.field_I ? 1 : 0;
        var2 = param1;
        if (var2 == 3) {
          return 6;
        }
        if (var2 == 24) {
          return 6;
        }
        if (var2 == 18) {
          return 7;
        }
        if (19 == var2) {
          return 4;
        }
        if (var2 == 28) {
          return 4;
        }
        if (var2 == 225) {
          return 4;
        }
        if (1 == var2) {
          return 8;
        }
        if (var2 == 27) {
          return 5;
        }
        if (var2 == 8) {
          return 8;
        }
        if (var2 == 25) {
          return 4;
        }
        if (param0 != -28) {
          return -56;
        }
        return 8;
    }

    public static void a(byte param0) {
        field_c = null;
        field_b = null;
        int var1 = -25 / ((45 - param0) / 34);
        field_e = null;
    }

    final static void a(String param0, byte param1) {
        try {
          int var2_int = 108 / ((param1 - 44) / 48);
          ad.field_c = param0;
          g.a((byte) -116, 12);
        } catch (RuntimeException runtimeException) {
          throw wg.a((Throwable) ((Object) runtimeException), "l.C(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final static long a(CharSequence param0, byte param1) {
        long var2_long = 0L;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        long stackIn_3_0 = 0L;
        long stackIn_21_0 = 0L;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        var7 = HostileSpawn.field_I ? 1 : 0;
        try {
          var2_long = 0L;
          var4 = param0.length();
          var5 = 0;
          if (param1 <= 74) {
            stackIn_3_0 = 5L;
            return stackIn_3_0;
          }
          while (var4 > var5) {
            var2_long = var2_long * 37L;
            var6 = param0.charAt(var5);
            if (65 <= var6 &&
              var6 <= 90) {
              var2_long = var2_long + (long)(-64 + var6);
            } else if (var6 >= 97 &&
              var6 <= 122) {
              var2_long = var2_long + (long)(-97 + var6 + 1);
            } else {
              if (var6 >= 48 &&
                var6 <= 57) {
                var2_long = var2_long + (long)(-48 + (27 + var6));
              }
            }
            if (177917621779460413L > var2_long) {
              var5++;
              continue;
            }
            break;
          }
          while (var2_long % 37L == 0L) {
            if (var2_long != 0L) {
              var2_long = var2_long / 37L;
              continue;
            }
            break;
          }
          stackIn_21_0 = var2_long;
          return stackIn_21_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_24_0 = var2;
          stackIn_24_1 = new StringBuilder().append("l.A(");
          if (param0 == null) {
            stackIn_25_2 = "null";
          } else {
            stackIn_25_2 = "{...}";
          }
          throw wg.a((Throwable) ((Object) stackIn_24_0), ((StringBuilder) (Object) stackIn_24_1).append(stackIn_25_2).append(',').append(param1).append(')').toString());
        }
    }

    static {
        field_b = "Password is valid";
        field_d = -1;
        field_c = new int[8192];
        field_e = "Loading...";
    }
}
