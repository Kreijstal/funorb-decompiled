/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class i implements uj {
    static String[][] field_b;
    static String field_d;
    static int[] field_c;
    static int field_a;

    public final String a(byte param0) {
        int var2 = -47 / ((-33 - param0) / 62);
        return "Make Ore Diamonds";
    }

    public final void a(boolean param0) {
        gd.field_x = 4;
        tb.field_a = 1;
        if (!param0) {
            return;
        }
        Object var3 = null;
        int[] discarded$0 = i.a(-114, (int[]) null, (int[]) null);
    }

    public static void b(byte param0) {
        if (param0 != -57) {
          i.b((byte) -113);
          field_b = null;
          field_c = null;
          field_d = null;
          return;
        } else {
          field_b = null;
          field_c = null;
          field_d = null;
          return;
        }
    }

    final static int[] a(int param0, int[] param1, int[] param2) {
        int[] var3 = null;
        int var4 = 0;
        int var5 = 0;
        int[] var6 = null;
        var5 = MinerDisturbance.field_ab;
        var6 = new int[8];
        var3 = var6;
        var4 = 0;
        if (param0 < -103) {
          L0: while (true) {
            if (8 <= var4) {
              return var3;
            } else {
              var6[var4] = hi.a(param1[var4], param2[var4]);
              var4++;
              continue L0;
            }
          }
        } else {
          return null;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = new String[][]{null, new String[1]};
        field_d = "Mouse over an icon for details";
    }
}
