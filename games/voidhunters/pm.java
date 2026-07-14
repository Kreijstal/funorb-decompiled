/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pm extends rqa {
    final static void e(byte param0) {
        int var1 = 0;
        double var2 = 0.0;
        int var4 = VoidHunters.field_G;
        if (param0 > -17) {
            return;
        }
        bfb.e();
        ap.field_p = new int[260];
        iob.field_f = 11;
        for (var1 = 0; (var1 ^ -1) > -257; var1++) {
            var2 = 15.0;
            ap.field_p[var1] = (int)(255.0 * Math.pow((double)((float)var1 / 256.0f), var2));
        }
        int var5 = 256;
        var1 = var5;
        while (ap.field_p.length > var5) {
            ap.field_p[var5] = 255;
            var5++;
        }
    }

    final static void a(int param0, int param1, int param2, String param3, int param4, int param5, byte param6) {
        if (param6 >= -79) {
            return;
        }
        if (li.field_i) {
            nma.field_b[param4].a(true, param5 | -16777216, -16777216 | param1, param3, param2, param0);
        } else {
            ita.a(param4, 7988).c(param3, param0, param2, param5, param1);
        }
    }

    pm(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    final nc a(nc[] param0, int param1) {
        if (param1 >= -119) {
            pm.e((byte) -101);
        }
        si.a(223, 62, param0[0].a(65));
        return new nc((Object) (Object) "void");
    }

    static {
    }
}
