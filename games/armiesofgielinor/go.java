/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class go {
    static int[][][] field_f;
    private String field_b;
    static wk field_e;
    static String field_d;
    static String[] field_c;
    static wk field_g;
    int[] field_a;
    static String field_h;

    final int c(int param0) {
        if (param0 != 16648) {
            field_d = null;
        }
        return ((go) this).field_a.length;
    }

    final static boolean a(int param0) {
        int var1 = 0;
        int stackIn_4_0 = 0;
        int stackOut_2_0 = 0;
        int stackOut_3_0 = 0;
        L0: {
          L1: {
            var1 = -85 / ((param0 - -50) / 45);
            if (am.field_z == null) {
              break L1;
            } else {
              if (kl.field_k != ov.field_g) {
                break L1;
              } else {
                stackOut_2_0 = 1;
                stackIn_4_0 = stackOut_2_0;
                break L0;
              }
            }
          }
          stackOut_3_0 = 0;
          stackIn_4_0 = stackOut_3_0;
          break L0;
        }
        return stackIn_4_0 != 0;
    }

    final boolean a(int param0, byte param1) {
        int var4 = 0;
        int var5 = 0;
        int var6 = ArmiesOfGielinor.field_M ? 1 : 0;
        if (param1 > -82) {
            return true;
        }
        int[] var7 = ((go) this).field_a;
        int[] var3 = var7;
        for (var4 = 0; var4 < var7.length; var4++) {
            var5 = var7[var4];
            if (!(var5 != param0)) {
                return true;
            }
        }
        return false;
    }

    public static void b(int param0) {
        field_g = null;
        field_d = null;
        field_c = null;
        field_e = null;
        field_h = null;
        field_f = null;
    }

    final void a(int param0, ha param1) {
        int[] var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int[] var7 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        var6 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            var7 = ((go) this).field_a;
            var3 = var7;
            var4 = 0;
            L1: while (true) {
              if (var4 >= var7.length) {
                L2: {
                  if (param0 == 3) {
                    break L2;
                  } else {
                    field_g = null;
                    break L2;
                  }
                }
                break L0;
              } else {
                var5 = var7[var4];
                param1.b(param0 ^ 10002, var5, true);
                var4++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3_ref = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) var3_ref;
            stackOut_7_1 = new StringBuilder().append("go.E(").append(param0).append(44);
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param1 == null) {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L3;
            } else {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L3;
            }
          }
          throw ig.a((Throwable) (Object) stackIn_10_0, stackIn_10_2 + 41);
        }
    }

    final String d(int param0) {
        if (param0 != 3) {
            boolean discarded$0 = ((go) this).a(-128, (byte) 1);
        }
        return ((go) this).field_b;
    }

    go(String param0, int[] param1) {
        try {
            ((go) this).field_b = param0;
            ((go) this).field_a = param1;
        } catch (RuntimeException runtimeException) {
            throw ig.a((Throwable) (Object) runtimeException, "go.<init>(" + (param0 != null ? "{...}" : "null") + 44 + (param1 != null ? "{...}" : "null") + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = new String[]{"Summon this unit", "Insufficient Mana", "Favour level too low", "Favour level too low and insufficient Mana", "You have not purchased this unit"};
        field_f = new int[][][]{new int[1][], new int[1][], new int[1][], new int[1][], new int[1][], new int[1][], new int[1][], new int[1][], new int[1][], new int[2][], new int[1][], new int[1][], new int[1][], new int[1][], new int[1][], new int[1][], new int[1][]};
        field_d = "Please select an option in the '<%0>' row.";
        field_h = "Miracles";
    }
}
