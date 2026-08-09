/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class il {
    static ue[] field_a;
    static int[] field_d;
    static eh field_c;
    static int[] field_e;
    static q field_b;

    final static void a(int param0) {
        String var2;
        if (null == q.field_N) {
          L0: {
            if (q.field_A != null) {
              q.field_A.m(65536);
              break L0;
            } else {
              break L0;
            }
          }
          ml.e(8192);
          if (param0 < 4) {
            var2 = (String) null;
            il.a((String) null, 'a', 12, (String) null);
            return;
          } else {
            return;
          }
        } else {
          L1: {
            q.field_N.l(-26623);
            if (q.field_A != null) {
              q.field_A.m(65536);
              break L1;
            } else {
              break L1;
            }
          }
          ml.e(8192);
          if (param0 >= 4) {
            return;
          } else {
            var2 = (String) null;
            il.a((String) null, 'a', 12, (String) null);
            return;
          }
        }
    }

    final static String a(String param0, char param1, int param2, String param3) {
        StringBuilder discarded$0 = null;
        StringBuilder discarded$1 = null;
        StringBuilder discarded$2 = null;
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8_int = 0;
        int var11 = 0;
        String stackIn_12_0 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        StringBuilder stackIn_18_1 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        StringBuilder var8 = null;
        int var9 = 0;
        int var10 = 0;
        var11 = Bounce.field_N;
        try {
          L0: {
            L1: {
              var4_int = param0.length();
              if (param2 <= -28) {
                break L1;
              } else {
                il.a(-112);
                break L1;
              }
            }
            L2: {
              var5 = param3.length();
              var6 = var4_int;
              var7 = -1 + var5;
              if (-1 == (var7 ^ -1)) {
                break L2;
              } else {
                var8_int = 0;
                L3: while (true) {
                  var8_int = param0.indexOf((int) param1, var8_int);
                  if (var8_int >= 0) {
                    var8_int++;
                    var6 = var6 + var7;
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
              var10 = param0.indexOf((int) param1, var9);
              if (var10 < 0) {
                discarded$0 = var8.append(param0.substring(var9));
                stackIn_12_0 = var8.toString();
                break L0;
              } else {
                discarded$1 = var8.append(param0.substring(var9, var10));
                discarded$2 = var8.append(param3);
                var9 = 1 + var10;
                continue L4;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var4 = decompiledCaughtException;
            stackIn_15_0 = (RuntimeException) (var4);

            stackIn_15_1 = new StringBuilder().append("il.C(");

            if (param0 == null) {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "null";
              break L5;
            } else {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "{...}";
              break L5;
            }
          }
          L6: {


            stackIn_18_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_16_2).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "null";
              break L6;
            } else {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "{...}";
              break L6;
            }
          }
          throw ii.a((Throwable) ((Object) stackIn_16_0), stackIn_19_2 + ')');
        }
        return stackIn_12_0;
    }

    public static void a(byte param0) {
        int var1 = -48 / ((param0 - 71) / 46);
        field_a = null;
        field_b = null;
        field_d = null;
        field_c = null;
        field_e = null;
    }

    static {
        field_d = new int[8192];
        field_a = new ue[16];
        field_c = new eh(9, 0, 4, 1);
    }
}
