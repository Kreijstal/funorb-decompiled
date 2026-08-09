/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wj extends nm {
    final static void a(int param0, long param1) {
        if (param0 <= -123) {
          if (0L >= param1) {
            return;
          } else {
            if (0L == param1 % 10L) {
              bc.a(-29869, -1L + param1);
              bc.a(-29869, 1L);
              return;
            } else {
              bc.a(-29869, param1);
              return;
            }
          }
        } else {
          wj.a(112, -29L);
          if (0L >= param1) {
            return;
          } else {
            if (0L == param1 % 10L) {
              bc.a(-29869, -1L + param1);
              bc.a(-29869, 1L);
              return;
            } else {
              bc.a(-29869, param1);
              return;
            }
          }
        }
    }

    final static String a(int param0, String param1, char param2, String param3) {
        StringBuilder discarded$2 = null;
        StringBuilder discarded$3 = null;
        StringBuilder discarded$4 = null;
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8_int = 0;
        StringBuilder var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        String stackIn_10_0 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        StringBuilder stackIn_16_1 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        var11 = BrickABrac.field_J ? 1 : 0;
        try {
          L0: {
            L1: {
              var4_int = param1.length();
              var5 = param3.length();
              var6 = var4_int;
              var7 = param0 + var5;
              if (var7 == 0) {
                break L1;
              } else {
                var8_int = 0;
                L2: while (true) {
                  var8_int = param1.indexOf((int) param2, var8_int);
                  if ((var8_int ^ -1) > -1) {
                    break L1;
                  } else {
                    var8_int++;
                    var6 = var6 + var7;
                    continue L2;
                  }
                }
              }
            }
            var8 = new StringBuilder(var6);
            var9 = 0;
            L3: while (true) {
              var10 = param1.indexOf((int) param2, var9);
              if (-1 >= (var10 ^ -1)) {
                discarded$2 = var8.append(param1.substring(var9, var10));
                var9 = 1 + var10;
                discarded$3 = var8.append(param3);
                continue L3;
              } else {
                discarded$4 = var8.append(param1.substring(var9));
                stackIn_10_0 = var8.toString();
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var4 = decompiledCaughtException;
            stackIn_13_0 = (RuntimeException) (var4);

            stackIn_13_1 = new StringBuilder().append("wj.A(").append(param0).append(',');

            if (param1 == null) {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "null";
              break L4;
            } else {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "{...}";
              break L4;
            }
          }
          L5: {


            stackIn_16_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_14_2).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "null";
              break L5;
            } else {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "{...}";
              break L5;
            }
          }
          throw qb.a((Throwable) ((Object) stackIn_14_0), stackIn_17_2 + ')');
        }
        return stackIn_10_0;
    }

    final static void a(int param0, boolean param1, int param2, boolean param3, int param4, vm param5, boolean param6) {
        Object var7 = null;
        Throwable var8 = null;
        Object stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        Object stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        Throwable decompiledCaughtException = null;
        try {
          var7 = eo.field_f;
          synchronized (var7) {
            L0: {
              m.field_f.e(param2, -1, 16);
              if (!param3) {
                ji.a(25459, param6, param5, param4, param0, param1);
                break L0;
              } else {
                return;
              }
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var7 = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_11_0 = var7;

            stackIn_11_1 = new StringBuilder().append("wj.B(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');

            if (param5 == null) {
              stackIn_12_0 = stackIn_11_0;
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "null";
              break L1;
            } else {
              stackIn_12_0 = stackIn_11_0;
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "{...}";
              break L1;
            }
          }
          throw qb.a((Throwable) ((Object) stackIn_12_0), stackIn_12_2 + ',' + param6 + ')');
        }
    }

    private wj() throws Throwable {
        throw new Error();
    }

    static {
    }
}
