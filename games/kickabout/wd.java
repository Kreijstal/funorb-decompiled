/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wd extends gn {
    static se field_l;
    static String field_g;
    int field_p;
    int field_m;
    int field_f;
    int field_k;
    int field_j;
    String[][] field_i;
    static int[] field_n;
    int[][] field_o;
    int field_h;
    boolean field_e;

    public static void a() {
        field_g = null;
        field_l = null;
        field_n = null;
    }

    final static void a(int param0, int param1, int param2) {
        RuntimeException var3 = null;
        ut[] var3_array = null;
        int var4 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        ut[] var9 = null;
        ut var10 = null;
        ut var11 = null;
        RuntimeException decompiledCaughtException = null;
        var8 = Kickabout.field_G;
        try {
          L0: {
            L1: {
              L2: {
                var9 = iw.field_h;
                var3_array = var9;
                if (rm.field_C != 0) {
                  if (rm.field_C == 1) {
                    var4 = 0;
                    L3: while (true) {
                      if (var4 >= 15) {
                        break L2;
                      } else {
                        var11 = var9[p.a((byte) -24, var9.length)];
                        var6 = p.a((byte) -24, 896 + -(var11.field_o >> 1));
                        var7 = p.a((byte) -24, 1344 - (var11.field_v >> 1));
                        var11.c(var6 + 15, var7 + 15);
                        var4++;
                        continue L3;
                      }
                    }
                  } else {
                    break L1;
                  }
                } else {
                  var4 = 0;
                  L4: while (true) {
                    if (var4 >= 30) {
                      break L2;
                    } else {
                      var10 = var9[p.a((byte) -24, var9.length)];
                      var6 = p.a((byte) -24, 896 - (var10.field_o >> 1));
                      var7 = p.a((byte) -24, 1344 + -(var10.field_v >> 1));
                      var10.c(var6 + 15, 15 + var7);
                      var4++;
                      continue L4;
                    }
                  }
                }
              }
              break L1;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw nb.a((Throwable) (Object) var3, "wd.A(" + 15 + ',' + 15 + ',' + 124 + ')');
        }
    }

    final static ki a(int param0, up[] param1, gr param2, int param3, int param4) {
        ki var5 = null;
        RuntimeException var5_ref = null;
        ki stackIn_3_0 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        ki stackOut_2_0 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        try {
          L0: {
            var5 = new ki(5, param4, param3, (byte) 0, (byte) 0);
            var5.field_s = param1;
            var5.field_t = param2;
            stackOut_2_0 = (ki) var5;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var5_ref = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var5_ref;
            stackOut_4_1 = new StringBuilder().append("wd.C(").append(18238).append(',');
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param1 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L1;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L1;
            }
          }
          L2: {
            stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
            stackOut_7_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(',');
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param2 == null) {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L2;
            } else {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L2;
            }
          }
          throw nb.a((Throwable) (Object) stackIn_10_0, stackIn_10_2 + ',' + param3 + ',' + param4 + ')');
        }
        return stackIn_3_0;
    }

    wd() {
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_g = "gameplay";
    }
}
