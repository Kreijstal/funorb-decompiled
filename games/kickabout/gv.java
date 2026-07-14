/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gv extends gn {
    private boolean field_j;
    private int field_e;
    private int field_i;
    private String field_f;
    static int field_h;
    private int field_g;

    final static void a(int param0, int param1, ni param2) {
        ml var3 = or.field_d;
        var3.b(param0, (byte) 73);
        var3.a(115, 5);
        var3.a(118, 0);
        if (param1 <= 71) {
            field_h = -27;
        }
        var3.g(-1207444472, param2.field_o);
        var3.a(116, param2.field_g);
        var3.a(102, param2.field_j);
    }

    final void a(int param0, int param1) {
        int var3 = -121 / ((37 - param0) / 47);
        if (-1 == (((gv) this).field_g ^ -1)) {
            return;
        }
        int var4 = al.a(true, (byte) -120);
        on.a(95, param1 - -1, ((gv) this).field_e, 17, 6, 0, var4 * ((gv) this).field_g >> -317138488);
        if (256 != ((gv) this).field_g) {
            cq.field_e.b(((gv) this).field_f, 107, -4 + (18 + param1), 16777215, -1, ((gv) this).field_g);
        } else {
            cq.field_e.a(((gv) this).field_f, 107, -4 + (param1 - -18), 16777215, -1);
        }
    }

    final void a(int param0) {
        int var2 = 0;
        if (param0 != 0) {
            ((gv) this).field_g = 22;
        }
        if (!(!((gv) this).field_j)) {
            ((gv) this).field_g = 256;
            return;
        }
        if ((((gv) this).field_i ^ -1) <= -601) {
            ((gv) this).field_g = 0;
            return;
        }
        ((gv) this).field_i = ((gv) this).field_i + 1;
        if (500 >= ((gv) this).field_i) {
        } else {
            var2 = 100 - ((gv) this).field_i + 500;
            if (0 <= var2) {
                ((gv) this).field_g = (var2 << 33742536) / 100;
            } else {
                ((gv) this).field_g = 0;
            }
        }
    }

    final static boolean a(boolean param0, CharSequence param1, int param2) {
        int var3 = 0;
        int var4 = Kickabout.field_G;
        if (!(hw.a(param1, param2 ^ -26200, param0))) {
            return false;
        }
        for (var3 = param2; var3 < param1.length(); var3++) {
            if (!(jw.a(param1.charAt(var3), 160))) {
                return false;
            }
        }
        return true;
    }

    gv(String param0, boolean param1) {
        ((gv) this).field_g = 256;
        ((gv) this).field_j = param1 ? true : false;
        ((gv) this).field_f = param0;
        ((gv) this).field_i = ((gv) this).field_j ? 500 : 0;
        int var3 = 20 + cq.field_e.a(((gv) this).field_f);
        ((gv) this).field_e = Math.max(400, var3);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_h = -1;
    }
}
