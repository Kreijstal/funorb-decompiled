/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bn implements uj {
    static boolean[] field_b;
    static we field_d;
    static int field_c;
    static String field_a;

    public final String a(byte param0) {
        int var2 = -71 / ((-33 - param0) / 62);
        return "Done Editing";
    }

    public final void a(boolean param0) {
        tb.field_a = 0;
        if (param0) {
            boolean discarded$0 = bn.a(126, 'ﾂ');
        }
    }

    public static void a(int param0) {
        field_d = null;
        field_b = null;
        field_a = null;
    }

    final static boolean a(int param0, char param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        char[] var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int stackIn_8_0 = 0;
        int stackIn_15_0 = 0;
        int stackIn_18_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_17_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_7_0 = 0;
        var6 = MinerDisturbance.field_ab;
        try {
          L0: {
            L1: {
              L2: {
                if (param1 <= 0) {
                  break L2;
                } else {
                  if (128 > param1) {
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              L3: {
                if (param1 < 160) {
                  break L3;
                } else {
                  if (param1 <= 255) {
                    break L1;
                  } else {
                    break L3;
                  }
                }
              }
              var2_int = -111 / ((param0 - 28) / 63);
              if (param1 != 0) {
                var3 = tk.field_e;
                var4 = 0;
                L4: while (true) {
                  if (var4 >= var3.length) {
                    stackOut_17_0 = 0;
                    stackIn_18_0 = stackOut_17_0;
                    break L0;
                  } else {
                    var5 = var3[var4];
                    if (var5 != param1) {
                      var4++;
                      continue L4;
                    } else {
                      stackOut_14_0 = 1;
                      stackIn_15_0 = stackOut_14_0;
                      return stackIn_15_0 != 0;
                    }
                  }
                }
              } else {
                return false;
              }
            }
            stackOut_7_0 = 1;
            stackIn_8_0 = stackOut_7_0;
            return stackIn_8_0 != 0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw lj.a((Throwable) (Object) var2, "bn.D(" + param0 + 44 + param1 + 41);
        }
        return stackIn_18_0 != 0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = new boolean[21];
        field_a = "Ranking: Mega Miner";
    }
}
