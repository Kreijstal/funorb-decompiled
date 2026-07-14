/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fd extends tc {
    int field_k;
    static kl field_m;
    static String field_o;
    static String field_l;
    wp field_p;
    static String[][] field_n;

    final static int a(boolean param0, int param1) {
        int var2 = 0;
        var2 = param1 >>> -1846380831;
        var2 = var2 | var2 >>> -1059359743;
        var2 = var2 | var2 >>> -294303678;
        if (!param0) {
          int discarded$1 = fd.a(true, 15);
          var2 = var2 | var2 >>> -412502876;
          var2 = var2 | var2 >>> -1676140568;
          var2 = var2 | var2 >>> 1799204304;
          return param1 & (var2 ^ -1);
        } else {
          var2 = var2 | var2 >>> -412502876;
          var2 = var2 | var2 >>> -1676140568;
          var2 = var2 | var2 >>> 1799204304;
          return param1 & (var2 ^ -1);
        }
    }

    public static void a(int param0) {
        field_o = null;
        field_m = null;
        if (param0 != -30097) {
          field_n = null;
          field_n = null;
          field_l = null;
          return;
        } else {
          field_n = null;
          field_l = null;
          return;
        }
    }

    fd(kl param0, kl param1, int param2) {
        ((fd) this).field_k = param2;
        ((fd) this).field_p = new wp(param2);
        tl.a((byte) -121, param1, param0);
        do {
        } while (!((fd) this).field_p.f((byte) -65));
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_o = "Potions";
        field_l = "Show game chat from my friends";
        field_n = new String[][]{new String[9], new String[9], new String[9], new String[9], new String[9], new String[9], new String[9], new String[9], new String[9], new String[9], new String[9], new String[9], new String[9], new String[9], new String[9], new String[9], new String[9], new String[9], new String[9], new String[9], new String[9], new String[9], new String[9], new String[9], new String[9], new String[9], new String[9], new String[9], new String[9], new String[9], new String[9], new String[9], new String[9], new String[9], new String[9], new String[9], new String[9], new String[9], new String[9], new String[9], new String[9], new String[9], new String[9], new String[9], new String[9], new String[9], new String[9], new String[9], new String[9], new String[9], new String[9], new String[9], new String[9], new String[9], new String[9], new String[9], new String[9], new String[9], new String[9], new String[9], new String[9], new String[9], new String[9], new String[9], new String[9], new String[9], new String[9], new String[9], new String[9], new String[9], new String[9], new String[9], new String[9], new String[9], new String[9], new String[9], new String[9], new String[9], new String[9], new String[9], new String[9], new String[9], new String[9], new String[9], new String[9], new String[9], new String[9], new String[9], new String[9], new String[9]};
    }
}
