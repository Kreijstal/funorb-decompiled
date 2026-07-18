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
        Object var2 = null;
        if (null == q.field_N) {
          L0: {
            if (q.field_A != null) {
              q.field_A.m(65536);
              break L0;
            } else {
              break L0;
            }
          }
          int discarded$12 = 8192;
          ml.e();
          if (param0 < 4) {
            var2 = null;
            String discarded$13 = il.a((String) null, 'a', 12, (String) null);
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
          int discarded$14 = 8192;
          ml.e();
          if (param0 >= 4) {
            return;
          } else {
            var2 = null;
            String discarded$15 = il.a((String) null, 'a', 12, (String) null);
            return;
          }
        }
    }

    final static String a(String param0, char param1, int param2, String param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8_int = 0;
        StringBuilder var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        String stackIn_12_0 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_11_0 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
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
              if (var7 == 0) {
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
                StringBuilder discarded$3 = var8.append(param0.substring(var9));
                stackOut_11_0 = var8.toString();
                stackIn_12_0 = stackOut_11_0;
                break L0;
              } else {
                StringBuilder discarded$4 = var8.append(param0.substring(var9, var10));
                StringBuilder discarded$5 = var8.append(param3);
                var9 = 1 + var10;
                continue L4;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var4 = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) var4;
            stackOut_13_1 = new StringBuilder().append("il.C(");
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param0 == null) {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L5;
            } else {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L5;
            }
          }
          L6: {
            stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
            stackOut_16_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_16_2).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_18_0 = stackOut_16_0;
            stackIn_18_1 = stackOut_16_1;
            stackIn_17_0 = stackOut_16_0;
            stackIn_17_1 = stackOut_16_1;
            if (param3 == null) {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "null";
              stackIn_19_0 = stackOut_18_0;
              stackIn_19_1 = stackOut_18_1;
              stackIn_19_2 = stackOut_18_2;
              break L6;
            } else {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "{...}";
              stackIn_19_0 = stackOut_17_0;
              stackIn_19_1 = stackOut_17_1;
              stackIn_19_2 = stackOut_17_2;
              break L6;
            }
          }
          throw ii.a((Throwable) (Object) stackIn_19_0, stackIn_19_2 + ')');
        }
        return stackIn_12_0;
    }

    public static void a() {
        int var1 = -48;
        field_a = null;
        field_b = null;
        field_d = null;
        field_c = null;
        field_e = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = new int[8192];
        field_a = new ue[16];
        field_c = new eh(9, 0, 4, 1);
    }
}
