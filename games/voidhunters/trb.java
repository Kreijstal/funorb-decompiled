/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class trb extends rqa {
    final nc a(nc[] param0, int param1) {
        if (param1 > -119) {
            return null;
        }
        wkb.field_c = param0[0].a(68);
        return new nc((Object) (Object) "void");
    }

    final static boolean a(int param0, int param1, int param2, int param3, int param4, int param5) {
        param5 = param5 - param2;
        param0 = param0 - param1;
        if (param5 < -param3) {
            return false;
        }
        if (-param3 > param0) {
            return false;
        }
        if (param5 > param3) {
            return false;
        }
        if (param0 > param3) {
            return false;
        }
        int var6 = Math.max(vma.a(114, param3), Math.max(vma.a(122, param5), vma.a(122, param0))) - 13;
        if (-1 > (var6 ^ -1)) {
            param0 = param0 >> var6;
            param3 = param3 >> var6;
            param5 = param5 >> var6;
        }
        if (param3 >= -1) {
            return false;
        }
        var6 = -11 / ((-20 - param4) / 58);
        if (!(-1 != (param5 | param0))) {
            return true;
        }
        return param3 * param3 >= param0 * param0 + param5 * param5 ? true : false;
    }

    trb(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    final static boolean a(int param0, ij param1, int param2, boolean param3, ij param4) {
        ntb[] var5 = gn.a(param2 ^ param2, param1);
        ntb[] var6 = gn.a(0, param4);
        return tja.a(var6, param0, var5, param3, param2 ^ 5542);
    }

    static {
    }
}
