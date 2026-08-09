/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fb {
    static int[] field_b;
    static String field_c;
    static ll[] field_a;

    public static void a(boolean param0) {
        field_a = null;
        if (param0) {
            return;
        }
        field_b = null;
        field_c = null;
    }

    final static String a(boolean param0, char param1, String param2, String param3) {
        StringBuilder discarded$0 = null;
        StringBuilder discarded$1 = null;
        StringBuilder discarded$2 = null;
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8_int = 0;
        int var11 = 0;
        String stackIn_14_0 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        StringBuilder stackIn_20_1 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        StringBuilder var8 = null;
        int var9 = 0;
        int var10 = 0;
        var11 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              var4_int = param2.length();
              var5 = param3.length();
              var6 = var4_int;
              var7 = -1 + var5;
              if (-1 != (var7 ^ -1)) {
                var8_int = 0;
                L2: while (true) {
                  var8_int = param2.indexOf((int) param1, var8_int);
                  if (-1 >= (var8_int ^ -1)) {
                    var6 = var6 + var7;
                    var8_int++;
                    continue L2;
                  } else {
                    break L1;
                  }
                }
              } else {
                break L1;
              }
            }
            var8 = new StringBuilder(var6);
            var9 = 0;
            L3: while (true) {
              var10 = param2.indexOf((int) param1, var9);
              if (-1 >= (var10 ^ -1)) {
                discarded$0 = var8.append(param2.substring(var9, var10));
                discarded$1 = var8.append(param3);
                var9 = 1 + var10;
                continue L3;
              } else {
                L4: {
                  discarded$2 = var8.append(param2.substring(var9));
                  if (!param0) {
                    break L4;
                  } else {
                    fb.a(false);
                    break L4;
                  }
                }
                stackIn_14_0 = var8.toString();
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var4 = decompiledCaughtException;
            stackIn_17_0 = (RuntimeException) (var4);

            stackIn_17_1 = new StringBuilder().append("fb.B(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "null";
              break L5;
            } else {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "{...}";
              break L5;
            }
          }
          L6: {


            stackIn_20_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_18_2).append(',');

            if (param3 == null) {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "null";
              break L6;
            } else {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "{...}";
              break L6;
            }
          }
          throw aa.a((Throwable) ((Object) stackIn_18_0), stackIn_21_2 + ')');
        }
        return stackIn_14_0;
    }

    static {
        field_b = new int[]{6, 7, 8};
        field_c = "Your game";
    }
}
