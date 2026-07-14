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
        if (param0 >= -15) {
            boolean discarded$0 = go.a(62);
        }
        field_c = null;
        field_e = null;
        field_h = null;
        field_f = null;
    }

    final void a(int param0, ha param1) {
        int var4 = 0;
        int var5 = 0;
        int var6 = ArmiesOfGielinor.field_M ? 1 : 0;
        int[] var7 = ((go) this).field_a;
        int[] var3 = var7;
        for (var4 = 0; var4 < var7.length; var4++) {
            var5 = var7[var4];
            param1.b(param0 ^ 10002, var5, true);
        }
        if (param0 != 3) {
            field_g = null;
        }
    }

    final String d(int param0) {
        if (param0 != 3) {
            boolean discarded$0 = ((go) this).a(-128, (byte) 1);
        }
        return ((go) this).field_b;
    }

    go(String param0, int[] param1) {
        ((go) this).field_b = param0;
        ((go) this).field_a = param1;
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
