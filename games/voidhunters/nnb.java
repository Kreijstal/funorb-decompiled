/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nnb extends uj {
    static int field_e;
    static String field_f;
    static String field_d;

    public static void b(boolean param0) {
        if (param0) {
            nnb.b(false);
            field_d = null;
            field_f = null;
            return;
        }
        field_d = null;
        field_f = null;
    }

    final int a(int param0) {
        if (param0 != -1) {
            nnb.b(true);
            return wpa.field_p;
        }
        return wpa.field_p;
    }

    final int b(byte param0) {
        if (param0 < 79) {
            int discarded$0 = ((nnb) this).d((byte) 75);
            return 112;
        }
        return 112;
    }

    final int d(byte param0) {
        if (param0 != 64) {
            field_e = -50;
            return oq.field_o;
        }
        return oq.field_o;
    }

    nnb() {
    }

    final boolean c(byte param0) {
        if (param0 > -104) {
            return true;
        }
        return true;
    }

    final boolean a(boolean param0) {
        if (param0) {
            boolean discarded$0 = ((nnb) this).a(true);
            return false;
        }
        return false;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = 4;
        field_f = "Spawn enemy uber-ship at mouse";
        field_d = "You have 1 unread message!";
    }
}
