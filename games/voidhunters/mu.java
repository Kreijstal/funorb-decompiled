/*
 * Decompiled by CFR-JS 0.4.0.
 */
class mu extends htb {
    private shb field_B;

    final static String a(int param0, int param1) {
        if (param0 != -18879) {
            return null;
        }
        return Integer.toHexString(param1);
    }

    final boolean a(int param0, shb param1) {
        Object var4 = null;
        if (param0 != 0) {
          var4 = null;
          boolean discarded$2 = ((mu) this).a(107, (shb) null);
          return ((mu) this).field_B.a(param0 ^ 0, param1);
        } else {
          return ((mu) this).field_B.a(param0 ^ 0, param1);
        }
    }

    mu(shb param0) {
        ((mu) this).field_B = param0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        jua discarded$0 = new jua();
    }
}
