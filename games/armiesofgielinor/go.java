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
            field_d = (String) null;
        }
        return this.field_a.length;
    }

    final static boolean a(int param0) {
        int var1;
        int stackIn_4_0 = 0;
        L0: {
          L1: {
            var1 = -85 / ((param0 - -50) / 45);
            if (am.field_z == null) {
              break L1;
            } else {
              if (kl.field_k != ov.field_g) {
                break L1;
              } else {
                stackIn_4_0 = 1;
                break L0;
              }
            }
          }
          stackIn_4_0 = 0;
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
        int[] var7 = this.field_a;
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
        if (param0 >= -15) {
            go.a(62);
        }
        field_c = null;
        field_e = null;
        field_h = null;
        field_f = (int[][][]) null;
    }

    final void a(int param0, ha param1) {
        int[] var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int[] var7 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        var6 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            var7 = this.field_a;
            var3 = var7;
            var4 = 0;
            L1: while (true) {
              if (var4 >= var7.length) {
                L2: {
                  if (param0 == 3) {
                    break L2;
                  } else {
                    field_g = (wk) null;
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
            stackIn_9_0 = (RuntimeException) (var3_ref);

            stackIn_9_1 = new StringBuilder().append("go.E(").append(param0).append(',');

            if (param1 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L3;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L3;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ')');
        }
    }

    final String d(int param0) {
        if (param0 != 3) {
            this.a(-128, (byte) 1);
        }
        return this.field_b;
    }

    go(String param0, int[] param1) {
        try {
            this.field_b = param0;
            this.field_a = param1;
        } catch (RuntimeException runtimeException) {
            throw ig.a((Throwable) ((Object) runtimeException), "go.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_c = new String[]{"Summon this unit", "Insufficient Mana", "Favour level too low", "Favour level too low and insufficient Mana", "You have not purchased this unit"};
        field_f = new int[][][]{new int[][]{new int[]{-1, 5, -1, -1}}, new int[][]{new int[]{-1, 3, -1, -1}}, new int[][]{new int[]{-1, -1, -1, -1, 1}}, new int[][]{new int[]{-1, 3, 3, 3, 3}}, new int[][]{new int[]{3, 3, 3, 3, -1}}, new int[][]{new int[]{-1, -1, -1, 1, 1, -1}}, new int[][]{new int[]{-1, 3, 3, 3, -1, -1}}, new int[][]{new int[]{-1, 3, 3, 3, -1}}, new int[][]{new int[]{-1, -1, -1, 1}}, new int[][]{new int[]{-1, 3, 3, 3, 3}, new int[]{3, 3, 3, 3}}, new int[][]{new int[]{3, 3, 3, 3, 3, 3}}, new int[][]{new int[]{-1, 3, 3, 3, -1, -1, -1}}, new int[][]{new int[]{-1, 3, 3, 3}}, new int[][]{new int[]{-1, 3, 3, 3}}, new int[][]{new int[]{3, 3, 3}}, new int[][]{new int[]{-1, -1, -1, -1}}, new int[][]{new int[]{3, 3, 3, 3}}};
        field_d = "Please select an option in the '<%0>' row.";
        field_h = "Miracles";
    }
}
