/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wj extends tc {
    int[][] field_m;
    static hd field_n;
    int field_p;
    static volatile boolean field_l;
    boolean field_o;
    int field_k;
    int field_r;
    String[][] field_s;
    static int field_q;

    public static void a(boolean param0) {
        field_n = null;
    }

    wj() {
    }

    final static wk[] a(int param0, wk[] param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        wk var3 = null;
        int var4 = 0;
        wk[] stackIn_7_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        wk[] stackOut_6_0 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        var4 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            var2_int = 0;
            L1: while (true) {
              if (param1.length <= var2_int) {
                stackOut_6_0 = (wk[]) param1;
                stackIn_7_0 = stackOut_6_0;
                break L0;
              } else {
                var3 = param1[var2_int];
                param1[var2_int].field_z = 0;
                var3.field_w = 0;
                param1[var2_int].field_A = param1[var2_int].field_y;
                param1[var2_int].field_x = param1[var2_int].field_v;
                var2_int++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) var2;
            stackOut_8_1 = new StringBuilder().append("wj.C(").append(-12310).append(',');
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param1 == null) {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L2;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L2;
            }
          }
          throw ig.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + ')');
        }
        return stackIn_7_0;
    }

    final static void a(int param0) {
        try {
            Exception var1 = null;
            int decompiledRegionSelector0 = 0;
            Throwable decompiledCaughtException = null;
            L0: {
              if (null == le.field_d) {
                break L0;
              } else {
                try {
                  L1: {
                    le.field_d.a(-1, 0L);
                    le.field_d.a(24, mg.field_e.field_q, (byte) 46, mg.field_e.field_o);
                    decompiledRegionSelector0 = 0;
                    break L1;
                  }
                } catch (java.lang.Exception decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  L2: {
                    var1 = (Exception) (Object) decompiledCaughtException;
                    decompiledRegionSelector0 = 1;
                    break L2;
                  }
                }
                if (decompiledRegionSelector0 == 0) {
                  mg.field_e.field_q = mg.field_e.field_q + 24;
                  return;
                } else {
                  break L0;
                }
              }
            }
            mg.field_e.field_q = mg.field_e.field_q + 24;
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_l = true;
        field_q = 0;
    }
}
