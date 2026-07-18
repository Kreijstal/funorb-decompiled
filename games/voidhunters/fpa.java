/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fpa extends uj {
    static String field_d;

    final int d(byte param0) {
        if (param0 != 64) {
            return -25;
        }
        return oq.field_t;
    }

    final boolean c(byte param0) {
        if (param0 >= -104) {
            boolean discarded$0 = ((fpa) this).c((byte) -63);
            return true;
        }
        return true;
    }

    final int b(byte param0) {
        if (param0 < 79) {
            field_d = null;
            return 110;
        }
        return 110;
    }

    final boolean a(boolean param0) {
        if (param0) {
            fpa.a(68, 42, true, -12, 65);
            return false;
        }
        return false;
    }

    final int b(int param0) {
        if (param0 != -25131) {
            return 46;
        }
        return 256;
    }

    fpa() {
    }

    final static void a(int param0, int param1, boolean param2, int param3, int param4) {
        if (li.field_i) {
          feb.a(og.field_r, true).a(param4, param3, param0, param1, (byte) -45);
          return;
        } else {
          qca.a(param3, param1, param4, true, param0);
          return;
        }
    }

    final int a(int param0) {
        if (param0 != -1) {
            return 67;
        }
        return ve.field_p;
    }

    public static void d(int param0) {
        if (param0 != 110) {
            fpa.d(-110);
            field_d = null;
            return;
        }
        field_d = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = "Music: ";
    }
}
