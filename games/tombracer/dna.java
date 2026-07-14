/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class dna extends kna {
    static jpa field_F;
    static String field_I;
    static String field_H;
    static boolean field_G;

    public static void r(byte param0) {
        field_F = null;
        field_I = null;
        field_H = null;
        if (param0 < 78) {
            dna.r((byte) 9);
        }
    }

    final boolean v(int param0) {
        if (param0 != 555277520) {
            field_H = null;
            return false;
        }
        return false;
    }

    final boolean n(byte param0) {
        if (param0 != -122) {
            field_F = null;
            return true;
        }
        return true;
    }

    final int t(int param0) {
        if (param0 != 8) {
            field_G = false;
            return 7;
        }
        return 7;
    }

    final static kea A(int param0) {
        int var1 = -98 % ((81 - param0) / 34);
        return qla.field_f;
    }

    dna(la param0, int param1) {
        super(param0, param1);
    }

    final static int b(int param0, int param1) {
        if (param1 != 255) {
            field_H = null;
            return 255 & param0;
        }
        return 255 & param0;
    }

    dna(la param0, int param1, kh param2, csa param3) {
        super(param0, param1, param2, param3);
    }

    final boolean s(int param0) {
        if (param0 != -15254) {
            field_F = null;
            return false;
        }
        return false;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_I = "GRAPHICS MODE";
        field_H = "Private";
        field_G = false;
    }
}
