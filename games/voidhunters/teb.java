/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class teb extends mfb {
    static int[] field_b;

    final boolean h(byte param0) {
        if (param0 <= 18) {
            field_b = (int[]) null;
            return false;
        }
        return false;
    }

    final int a(byte param0) {
        int var2 = -41 / ((-48 - param0) / 43);
        return 0;
    }

    final int b(int param0) {
        int var2 = 35 / ((param0 - 7) / 47);
        return qea.field_o;
    }

    public static void l(int param0) {
        if (param0 != 8192) {
            return;
        }
        field_b = null;
    }

    teb() {
    }

    final int f(int param0) {
        if (param0 != 1024) {
            field_b = (int[]) null;
            return vha.field_p;
        }
        return vha.field_p;
    }

    final int b(byte param0) {
        int discarded$0 = 0;
        if (param0 < 27) {
            discarded$0 = this.f(-17);
            return op.field_p;
        }
        return op.field_p;
    }

    final int c(int param0) {
        if (param0 != 0) {
            field_b = (int[]) null;
            return mp.field_o;
        }
        return mp.field_o;
    }

    static {
        field_b = new int[8192];
    }
}
