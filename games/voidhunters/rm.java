/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rm extends eca {
    static int[] field_f;

    final static String d(byte param0) {
        if (param0 != 106) {
            field_f = null;
            if (jib.field_o) {
                return null;
            }
            if (fra.field_b > od.field_a) {
                return null;
            }
            if (!(od.field_a >= fra.field_b - -k.field_r)) {
                return rfa.field_o;
            }
            return null;
        }
        if (jib.field_o) {
            return null;
        }
        if (fra.field_b > od.field_a) {
            return null;
        }
        if (!(od.field_a >= fra.field_b - -k.field_r)) {
            return rfa.field_o;
        }
        return null;
    }

    rm(uf param0) {
        super(param0);
    }

    final String b(String param0, int param1) {
        if (!(((rm) this).a(param0, 16384) != cca.field_o)) {
            return it.field_m;
        }
        if (param1 != -1) {
            return null;
        }
        return bqa.field_f;
    }

    public static void f(int param0) {
        if (param0 != 2) {
            field_f = null;
            field_f = null;
            return;
        }
        field_f = null;
    }

    final qrb a(String param0, int param1) {
        int var3 = 0;
        if (param1 != 16384) {
            field_f = null;
            var3 = null == lkb.a(param0, (byte) -116) ? 1 : 0;
            if (!(var3 != 0)) {
                return cca.field_o;
            }
            return lea.field_o;
        }
        var3 = null == lkb.a(param0, (byte) -116) ? 1 : 0;
        if (!(var3 != 0)) {
            return cca.field_o;
        }
        return lea.field_o;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_f = new int[2];
    }
}
