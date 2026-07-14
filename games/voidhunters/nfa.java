/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nfa extends uj {
    static int[] field_e;
    static int field_d;

    final boolean a(boolean param0) {
        if (param0) {
            nfa.d(-108);
            return true;
        }
        return true;
    }

    public static void d(int param0) {
        if (param0 != -3408) {
            nfa.d(-105);
            field_e = null;
            return;
        }
        field_e = null;
    }

    final boolean c(int param0) {
        if (param0 < 63) {
            return false;
        }
        return true;
    }

    nfa() {
    }

    final int b(byte param0) {
        if (param0 <= 79) {
            field_d = 5;
            return 103;
        }
        return 103;
    }

    final int a(int param0) {
        if (param0 != -1) {
            int discarded$0 = ((nfa) this).b((byte) 92);
            return tnb.field_o;
        }
        return tnb.field_o;
    }

    final int d(byte param0) {
        if (param0 != 64) {
            nfa.d(64);
            return oq.field_t;
        }
        return oq.field_t;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = new int[4];
    }
}
