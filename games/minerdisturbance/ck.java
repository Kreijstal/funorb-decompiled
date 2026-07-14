/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ck {
    static String field_b;
    static String[] field_c;
    static String field_e;
    static ea field_a;
    static long field_d;

    public static void a(byte param0) {
        field_e = null;
        field_c = null;
        field_b = null;
        field_a = null;
        if (param0 != -100) {
            Object var2 = null;
            ea[] discarded$0 = ck.a(-35, -80, 96, (bj) null);
        }
    }

    final static ea[] a(int param0, int param1, int param2, bj param3) {
        if (cn.a(param0, 258, param2, param3)) {
          if (param1 != 64) {
            field_b = null;
            return kk.a(94);
          } else {
            return kk.a(94);
          }
        } else {
          return null;
        }
    }

    final static ea[] a(byte param0, int param1) {
        ea[] var2 = null;
        ea[] var3 = null;
        var3 = new ea[9];
        var2 = var3;
        var3[4] = hb.a(64, 32768, param1);
        if (param0 != 126) {
          field_d = -100L;
          return var2;
        } else {
          return var2;
        }
    }

    final static void a(int param0) {
        byte[] var1 = null;
        byte[] var2 = null;
        if (!kj.a(false)) {
          if (aa.field_j != null) {
            if (param0 != -30833) {
              field_e = null;
              var2 = en.a((byte) -92);
              var1 = var2;
              hf discarded$4 = le.a(0, var2, 6);
              return;
            } else {
              var2 = en.a((byte) -92);
              var1 = var2;
              hf discarded$5 = le.a(0, var2, 6);
              return;
            }
          } else {
            return;
          }
        } else {
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = "Ranking: Maestro Miner";
        field_c = new String[]{"All scores", "My scores", "Best each"};
        field_e = "There's so much water in the Super Volcano you'll need much more air to swim through it. Grab this souped-up aqualung for an extra large supply of precious oxygen.";
    }
}
