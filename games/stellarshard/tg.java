/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class tg {
    static int[] field_a;
    static volatile int field_b;

    final static boolean a(byte param0) {
        if (param0 != 49) {
          tg.a((byte) -3);
          return mc.field_c.a(-26);
        }
        return mc.field_c.a(-26);
    }

    public static void b(byte param0) {
        if (param0 != 0) {
          field_a = (int[]) null;
          field_a = null;
          return;
        }
        field_a = null;
    }

    final static java.net.URL a(java.net.URL param0, int param1, String param2, String param3, int param4) {
        try {
          StringBuilder discarded$0 = null;
          StringBuilder discarded$1 = null;
          StringBuilder discarded$2 = null;
          StringBuilder discarded$3 = null;
          StringBuilder discarded$4 = null;
          StringBuilder discarded$5 = null;
          StringBuilder discarded$6 = null;
          StringBuilder discarded$7 = null;
          StringBuilder discarded$8 = null;
          java.net.URL stackIn_41_0 = null;
          java.net.URL stackIn_43_0 = null;
          RuntimeException stackIn_46_0 = null;
          StringBuilder stackIn_46_1 = null;
          String stackIn_47_2 = null;
          StringBuilder stackIn_49_1 = null;
          String stackIn_50_2 = null;
          StringBuilder stackIn_52_1 = null;
          String stackIn_53_2 = null;
          Throwable decompiledCaughtException = null;
          String var5 = null;
          RuntimeException var5_ref = null;
          int var6 = 0;
          int var7_int = 0;
          StringBuilder var7 = null;
          Exception var8 = null;
          int var9 = 0;
          int var7_intLifetime1;
          int var7_intLifetime2;
          int var7_intLifetime3;
          var9 = stellarshard.field_B;
          try {
            var5 = param0.getFile();
            var6 = 0;
            while (true) {
              if (var5.regionMatches(var6, "/l=", 0, 3)) {
                var7_int = var5.indexOf('/', 1 + var6);
                if (0 <= var7_int) {
                  if (param1 >= 0) {
                    var5 = var5.substring(0, var6) + var5.substring(var7_int);
                    continue;
                  }
                  var6 = var7_int;
                  continue;
                }
              }
              if (var5.regionMatches(var6, "/a=", 0, 3)) {
                var7_intLifetime1 = var5.indexOf('/', 1 + var6);
                if (0 <= var7_intLifetime1) {
                  var6 = var7_intLifetime1;
                  continue;
                }
              }
              if (var5.regionMatches(var6, "/p=", 0, 3)) {
                var7_intLifetime2 = var5.indexOf('/', var6 + 1);
                if (var7_intLifetime2 >= 0) {
                  if (param2 != null) {
                    var5 = var5.substring(0, var6) + var5.substring(var7_intLifetime2);
                    continue;
                  }
                  var6 = var7_intLifetime2;
                  continue;
                }
              }
              if (var5.regionMatches(var6, "/s=", 0, 3) ||
                var5.regionMatches(var6, "/c=", 0, 3)) {
                var7_intLifetime3 = var5.indexOf('/', 1 + var6);
                if (var7_intLifetime3 >= 0) {
                  if (param3 != null) {
                    var5 = var5.substring(0, var6) + var5.substring(var7_intLifetime3);
                    continue;
                  }
                  var6 = var7_intLifetime3;
                  continue;
                }
              }
              break;
            }
            if (param4 != 30403) {
              field_b = -126;
            }
            var7 = new StringBuilder(var6);
            discarded$0 = var7.append(var5.substring(0, var6));
            if (param1 > 0) {
              discarded$1 = var7.append("/l=");
              discarded$2 = var7.append(Integer.toString(param1));
            }
            if (param2 != null &&
              param2.length() > 0) {
              discarded$3 = var7.append("/p=");
              discarded$4 = var7.append(param2);
            }
            if (param3 != null &&
              param3.length() > 0) {
              discarded$5 = var7.append("/s=");
              discarded$6 = var7.append(param3);
            }
            if (var6 >= var5.length()) {
              discarded$7 = var7.append('/');
            } else {
              discarded$8 = var7.append(var5.substring(var6, var5.length()));
            }
            try {
              stackIn_41_0 = new java.net.URL(param0, var7.toString());
              return stackIn_41_0;
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var8 = (Exception) (Object) decompiledCaughtException;
              var8.printStackTrace();
              stackIn_43_0 = (java.net.URL) (param0);
              return stackIn_43_0;
            }
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var5_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_46_0 = var5_ref;
            stackIn_46_1 = new StringBuilder().append("tg.A(");
            if (param0 == null) {
              stackIn_47_2 = "null";
            } else {
              stackIn_47_2 = "{...}";
            }
            stackIn_49_1 = ((StringBuilder) (Object) stackIn_46_1).append(stackIn_47_2).append(',').append(param1).append(',');
            if (param2 == null) {
              stackIn_50_2 = "null";
            } else {
              stackIn_50_2 = "{...}";
            }
            stackIn_52_1 = ((StringBuilder) (Object) stackIn_49_1).append(stackIn_50_2).append(',');
            if (param3 == null) {
              stackIn_53_2 = "null";
            } else {
              stackIn_53_2 = "{...}";
            }
            throw ma.a((Throwable) ((Object) stackIn_46_0), ((StringBuilder) (Object) stackIn_52_1).append(stackIn_53_2).append(',').append(param4).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    static {
        field_b = 0;
        field_a = new int[128];
    }
}
