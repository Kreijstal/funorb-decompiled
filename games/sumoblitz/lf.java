/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lf extends ka {
    static tg field_e;
    static mp field_c;
    static String[] field_d;

    final static void a(int param0, byte param1) {
        int var3 = Sumoblitz.field_L ? 1 : 0;
        kr.field_c = param0;
        if (param1 != -58) {
            return;
        }
        dj var2 = (dj) (Object) jf.field_c.b(81);
        while (var2 != null) {
            if (var2.field_k.a(false)) {
                var2.field_q.f(128 + var2.field_p * kr.field_c >> 1821625704);
            } else {
                var2.b(false);
            }
            var2 = (dj) (Object) jf.field_c.d((byte) 18);
        }
        if (null == s.field_u) {
        } else {
            var2 = (dj) (Object) s.field_u.b(param1 ^ -123);
            while (var2 != null) {
                if (!var2.field_k.a(false)) {
                    var2.b(false);
                } else {
                    var2.field_q.f(128 + kr.field_c * var2.field_p >> -834648856);
                }
                var2 = (dj) (Object) s.field_u.d((byte) 18);
            }
        }
    }

    final static void b(byte param0) {
        int var2 = 0;
        mf var3 = null;
        int var4 = Sumoblitz.field_L ? 1 : 0;
        mf[] var5 = fh.field_n;
        mf[] var1 = var5;
        for (var2 = 0; var2 < var5.length; var2++) {
            var3 = var5[var2];
            io.a(109, var3);
        }
        if (param0 > -113) {
            lf.a(-101, 66);
        }
    }

    public static void a(int param0) {
        if (param0 != 1821625704) {
            boolean discarded$0 = lf.b(-118);
        }
        field_e = null;
        field_c = null;
        field_d = null;
    }

    lf(fr param0) {
        jq discarded$0 = new jq((fk) null, 5126, 3, 0);
        jq discarded$1 = new jq((fk) null, 5126, 2, 0);
        jq discarded$2 = new jq((fk) null, 5126, 3, 0);
        jq discarded$3 = new jq((fk) null, 5121, 4, 0);
        ke discarded$4 = new ke();
    }

    final static void a(int param0, int param1) {
        tt.field_l = param1;
        if (!(null == qc.field_e)) {
            qc.field_e.b(param1, true);
        }
        if (param0 != 0) {
            return;
        }
        if (qr.field_b != null) {
            qr.field_b.a((byte) -43, param1);
        }
    }

    final static boolean b(int param0) {
        if (param0 != -251) {
            lf.a(98, (byte) -77);
        }
        return -251 > (td.field_u ^ -1) ? true : false;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = new tg();
        field_d = new String[]{"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
        field_c = new mp();
    }
}
