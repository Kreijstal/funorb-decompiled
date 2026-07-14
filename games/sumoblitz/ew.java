/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ew extends na {
    static int field_e;
    static int field_f;

    final static eg a(byte param0, int param1) {
        int var3 = 115 % ((param0 - 30) / 47);
        eg var2 = new eg();
        wr.field_E.a((ms) (Object) var2, (byte) 39);
        ou.a(127, param1);
        return var2;
    }

    final String a(int param0, String param1) {
        if (((ew) this).a((byte) 26, param1) == qr.field_e) {
            return aj.field_t;
        }
        if (param0 != 0) {
            return null;
        }
        return nw.field_h;
    }

    ew(dh param0) {
        super(param0);
    }

    final gf a(byte param0, String param1) {
        int var3 = 0;
        if (param0 != 26) {
            field_e = 68;
            var3 = il.a(param1, (byte) 38) == null ? 1 : 0;
            if (!(var3 != 0)) {
                return qr.field_e;
            }
            return qe.field_a;
        }
        var3 = il.a(param1, (byte) 38) == null ? 1 : 0;
        if (!(var3 != 0)) {
            return qr.field_e;
        }
        return qe.field_a;
    }

    static {
    }
}
