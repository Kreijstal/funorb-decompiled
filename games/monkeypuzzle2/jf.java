/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jf extends ug {
    static int field_g;
    int field_o;
    int field_h;
    int field_j;
    static cd field_k;
    int field_m;
    int field_e;
    static int[] field_f;
    static String field_p;
    static boolean field_i;
    int[] field_l;
    int field_n;

    final static int a(int param0) {
        int var1_int = 0;
        RuntimeException var1 = null;
        ki var2 = null;
        int var3 = 0;
        int stackIn_7_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_6_0 = 0;
        var3 = MonkeyPuzzle2.field_F ? 1 : 0;
        try {
          L0: {
            var1_int = -2147483648;
            var2 = (ki) (Object) ok.field_a.a((byte) -117);
            L1: while (true) {
              if (var2 == null) {
                stackOut_6_0 = var1_int;
                stackIn_7_0 = stackOut_6_0;
                break L0;
              } else {
                L2: {
                  if (var2.field_q - (float)var2.field_y <= (float)var1_int) {
                    break L2;
                  } else {
                    var1_int = (int)((float)(-var2.field_y) + var2.field_q);
                    break L2;
                  }
                }
                var2 = (ki) (Object) ok.field_a.d((byte) 63);
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw la.a((Throwable) (Object) var1, "jf.B(" + -2147483648 + ')');
        }
        return stackIn_7_0;
    }

    final void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int[] param7) {
        RuntimeException runtimeException = null;
        Object var10 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        try {
          L0: {
            L1: {
              ((jf) this).field_l = param7;
              ((jf) this).field_e = param5;
              ((jf) this).field_o = param1;
              ((jf) this).field_j = param6;
              ((jf) this).field_m = param3;
              ((jf) this).field_n = param4;
              ((jf) this).field_h = param0;
              if (param2 > 103) {
                break L1;
              } else {
                var10 = null;
                ((jf) this).a(67, 55, 21, -107, -21, 22, 114, (int[]) null);
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) runtimeException;
            stackOut_3_1 = new StringBuilder().append("jf.C(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',');
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param7 == null) {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L2;
            } else {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "{...}";
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_6_2 = stackOut_4_2;
              break L2;
            }
          }
          throw la.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + ')');
        }
    }

    jf() {
    }

    public static void e(int param0) {
        field_p = null;
        field_f = null;
        field_k = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_g = 0;
        field_k = new cd("");
        field_f = new int[10];
        field_p = "Accept";
    }
}
