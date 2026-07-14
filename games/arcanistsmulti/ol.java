/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ol {
    static int field_g;
    static int field_i;
    static String field_a;
    ml field_d;
    static ec field_f;
    mi field_h;
    static String field_e;
    static String field_c;
    static String field_b;

    final static void a(byte param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = ArcanistsMulti.field_G ? 1 : 0;
        int var1 = kl.field_B[0];
        for (var2 = 1; var2 < kl.field_B.length; var2++) {
            var3 = kl.field_B[var2];
            sf.a(w.field_Lb, var2 << -1704635708, w.field_Lb, var1, var3);
            var1 = var1 + var3;
        }
        if (param0 != 91) {
            field_f = null;
        }
    }

    final static void a(int param0, int[] param1, boolean param2, int param3, int param4) {
        int[] var9 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = ArcanistsMulti.field_G ? 1 : 0;
        if (param2) {
            ol.b(64);
        }
        while (true) {
            param4--;
            if (-1 < (param4 ^ -1)) {
                break;
            }
            var9 = param1;
            int[] var5 = var9;
            var6 = param0;
            var7 = param3;
            var9[var6] = var7 + (dg.a(16711422, var9[var6]) >> -1642397951);
            param0++;
        }
    }

    final void a(int param0) {
        ((ol) this).field_d = null;
        ((ol) this).field_h = null;
        if (param0 != 0) {
            Object var3 = null;
            ol.a(-9, (int[]) null, false, -58, 111);
        }
    }

    public static void b(int param0) {
        field_b = null;
        field_f = null;
        field_c = null;
        field_a = null;
        if (param0 != -23971) {
            ol.a((byte) -20);
        }
        field_e = null;
    }

    final static uk a(int param0, int param1, boolean param2, dl param3, int param4, int param5) {
        java.awt.Frame var8 = vh.a(param1, param3, param5, param4, 10, param0);
        java.awt.Frame var6 = var8;
        if (var8 == null) {
            return null;
        }
        uk var7 = new uk();
        var7.field_b = var8;
        java.awt.Component discarded$7 = var7.field_b.add((java.awt.Component) (Object) var7);
        var7.setBounds(0, 0, param5, param4);
        var7.addFocusListener((java.awt.event.FocusListener) (Object) var7);
        var7.requestFocus();
        if (param2) {
            field_a = null;
        }
        return var7;
    }

    final void a(int param0, ml param1) {
        ((ol) this).field_h = null;
        if (param0 > -79) {
            field_e = null;
        }
        ((ol) this).field_d = param1;
    }

    final void a(mi param0, int param1) {
        if (param1 >= -122) {
            field_b = null;
        }
        ((ol) this).field_h = param0;
        ((ol) this).field_d = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_i = 0;
        field_a = "Multiplayer";
        field_c = "Hide private chat and appear offline to friends";
        field_e = "Only two targets left! Imps can also be increased in power with the Arcane<nbsp>Arrows and Arcane<nbsp>Flash spells. A powered-up Imp can be deadly in the hands of a master wizard.";
        field_b = "Spectate";
    }
}
