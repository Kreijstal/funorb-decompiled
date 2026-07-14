/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ve extends rqa {
    static int field_p;
    static int field_o;

    final static boolean a(boolean param0, byte param1, CharSequence param2) {
        int var3 = 0;
        int var4 = VoidHunters.field_G;
        if (!(je.a((byte) -31, param2, param0))) {
            return false;
        }
        if (param1 < 47) {
            return true;
        }
        for (var3 = 0; var3 < param2.length(); var3++) {
            if (!fqb.a(16647, param2.charAt(var3))) {
                return false;
            }
        }
        return true;
    }

    ve(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    final nc a(nc[] param0, int param1) {
        si.a(24, 62, param0[0].a(76));
        if (param1 > -119) {
            Object var4 = null;
            nc discarded$0 = ((ve) this).a((nc[]) null, 90);
        }
        return new nc((Object) (Object) "void");
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_p = 54;
    }
}
