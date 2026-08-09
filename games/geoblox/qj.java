/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qj {
    static boolean field_b;
    static dm field_c;
    static ck field_a;

    public static void a(byte param0) {
        field_c = null;
        field_a = null;
        if (param0 != -23) {
            qj.b((byte) 28);
        }
    }

    final static int b(byte param0) {
        if (param0 != 81) {
            qj.b((byte) -12);
            return rd.field_u;
        }
        return rd.field_u;
    }

    final static String a(String param0, String param1, char param2, byte param3) {
        StringBuilder discarded$0 = null;
        StringBuilder discarded$1 = null;
        StringBuilder discarded$2 = null;
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8_int = 0;
        int var11 = 0;
        String stackIn_13_0 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        StringBuilder stackIn_19_1 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        StringBuilder var8 = null;
        int var9 = 0;
        int var10 = 0;
        var11 = Geoblox.field_C;
        try {
          L0: {
            L1: {
              var4_int = param0.length();
              var5 = param1.length();
              if (param3 >= 79) {
                break L1;
              } else {
                field_b = false;
                break L1;
              }
            }
            L2: {
              var6 = var4_int;
              var7 = var5 + -1;
              if (0 == var7) {
                break L2;
              } else {
                var8_int = 0;
                L3: while (true) {
                  var8_int = param0.indexOf((int) param2, var8_int);
                  if (var8_int >= 0) {
                    var6 = var6 + var7;
                    var8_int++;
                    continue L3;
                  } else {
                    break L2;
                  }
                }
              }
            }
            var8 = new StringBuilder(var6);
            var9 = 0;
            L4: while (true) {
              var10 = param0.indexOf((int) param2, var9);
              if (var10 >= 0) {
                discarded$0 = var8.append(param0.substring(var9, var10));
                var9 = 1 + var10;
                discarded$1 = var8.append(param1);
                continue L4;
              } else {
                discarded$2 = var8.append(param0.substring(var9));
                stackIn_13_0 = var8.toString();
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var4 = decompiledCaughtException;
            stackIn_16_0 = (RuntimeException) (var4);

            stackIn_16_1 = new StringBuilder().append("qj.B(");

            if (param0 == null) {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "null";
              break L5;
            } else {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "{...}";
              break L5;
            }
          }
          L6: {


            stackIn_19_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_17_2).append(',');

            if (param1 == null) {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "null";
              break L6;
            } else {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "{...}";
              break L6;
            }
          }
          throw t.a((Throwable) ((Object) stackIn_17_0), stackIn_20_2 + ',' + param2 + ',' + param3 + ')');
        }
        return stackIn_13_0;
    }

    static {
        field_a = new ck(10, 2, 2, 0);
    }
}
