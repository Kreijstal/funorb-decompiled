/*
 * Decompiled by CFR-JS 0.4.0.
 */
class wf extends oh {
    static String field_h;
    ln field_n;
    int field_j;
    static String field_k;
    int field_l;
    static String field_m;
    int field_i;

    final static void a(int param0) {
        String var1 = null;
        String var2 = null;
        if (param0 != -15887) {
          return;
        } else {
          L0: {
            if (la.field_h != null) {
              var2 = la.field_h;
              var1 = var2;
              bf.a(113, re.a(ei.field_b, param0 ^ -12062, new String[1]));
              la.field_h = null;
              break L0;
            } else {
              break L0;
            }
          }
          return;
        }
    }

    public static void a(byte param0) {
        field_m = null;
        field_h = null;
        if (param0 != -122) {
            wf.a((byte) 113);
            field_k = null;
            return;
        }
        field_k = null;
    }

    wf(ln param0) {
        ((wf) this).field_n = param0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_h = "<%0> has offered you a Non-Aggression Pact.";
        field_k = "Enter a password for this account. Try to pick a strong password that can't easily be guessed.";
    }
}
