/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qm {
    static String field_a;
    static String field_e;
    private int[] field_d;
    static ve field_b;
    static volatile int field_c;
    static String field_f;

    final int a(int param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        var7 = TetraLink.field_J;
        var4 = -94 / ((param0 - -1) / 57);
        var3 = (((qm) this).field_d.length >> 1) - 1;
        var5 = var3 & param1;
        L0: while (true) {
          var6 = ((qm) this).field_d[var5 + (var5 - -1)];
          if (var6 != -1) {
            if (((qm) this).field_d[var5 + var5] != param1) {
              var5 = var3 & var5 + 1;
              continue L0;
            } else {
              return var6;
            }
          } else {
            return -1;
          }
        }
    }

    public static void a(boolean param0) {
        field_a = null;
        field_b = null;
        field_e = null;
        field_f = null;
    }

    qm(int[] param0) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        try {
          L0: {
            var2_int = 1;
            L1: while (true) {
              if (param0.length - -(param0.length >> 1) < var2_int) {
                ((qm) this).field_d = new int[var2_int - -var2_int];
                var3 = 0;
                L2: while (true) {
                  if (var2_int + var2_int <= var3) {
                    var3 = 0;
                    L3: while (true) {
                      if (param0.length <= var3) {
                        break L0;
                      } else {
                        var4 = param0[var3] & -1 + var2_int;
                        L4: while (true) {
                          if (((qm) this).field_d[1 + (var4 + var4)] == -1) {
                            ((qm) this).field_d[var4 + var4] = param0[var3];
                            ((qm) this).field_d[1 + (var4 + var4)] = var3;
                            var3++;
                            continue L3;
                          } else {
                            var4 = var2_int - 1 & 1 + var4;
                            continue L4;
                          }
                        }
                      }
                    }
                  } else {
                    ((qm) this).field_d[var3] = -1;
                    var3++;
                    continue L2;
                  }
                }
              } else {
                var2_int = var2_int << 1;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var2 = decompiledCaughtException;
            stackOut_14_0 = (RuntimeException) var2;
            stackOut_14_1 = new StringBuilder().append("qm.<init>(");
            stackIn_16_0 = stackOut_14_0;
            stackIn_16_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param0 == null) {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L5;
            } else {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "{...}";
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              stackIn_17_2 = stackOut_15_2;
              break L5;
            }
          }
          throw oi.a((Throwable) (Object) stackIn_17_0, stackIn_17_2 + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = "Game drawn";
        field_a = "Report <%0> for abuse";
        field_c = 0;
        field_f = "Passwords must be between 5 and 20 letters and numbers";
    }
}
