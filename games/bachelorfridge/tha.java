/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class tha extends td {
    static int field_p;
    static int field_q;

    final static void a(lda param0, po param1, int param2, lda param3, int param4, int param5, int param6, int param7, boolean param8, int param9, int param10, po param11, lda param12, int param13, int param14, int param15, int param16, int param17, int param18, int param19, int param20) {
        iw.a(param19, false, param11, param1);
        if (!param8) {
          field_p = -92;
          mja.a(param7, param10, 3, param9, param17);
          iea.a(param15, param2, (byte) -115);
          nna.a(param0, param3, param18, param4, param13, (byte) 85);
          ua.a((byte) -50, param5, param6, param12);
          ng.a(param20, param16, param14, 116);
          return;
        } else {
          mja.a(param7, param10, 3, param9, param17);
          iea.a(param15, param2, (byte) -115);
          nna.a(param0, param3, param18, param4, param13, (byte) 85);
          ua.a((byte) -50, param5, param6, param12);
          ng.a(param20, param16, param14, 116);
          return;
        }
    }

    final ii a(op param0, int param1) {
        aga var3 = null;
        bt var4 = null;
        var3 = ((tha) this).field_h.a(31, param0);
        var4 = new bt(((tha) this).field_g, new nq(var3));
        var4.field_o.a((bw) (Object) new iv(new nq(var3), false, 1, 0, 44), true);
        if (param1 != 3) {
          field_p = 12;
          return (ii) (Object) var4;
        } else {
          return (ii) (Object) var4;
        }
    }

    tha(int param0, aga param1) {
        super(param0, param1);
    }

    final static String a(int param0, String param1, String param2, int param3) {
        CharSequence var8 = (CharSequence) (Object) param1;
        if (!(wc.a(0, var8))) {
            return mk.field_f;
        }
        if (um.field_c != param0) {
            return cia.field_n;
        }
        nea var7 = di.a(param2, -112);
        if (!(var7 != null)) {
            return lga.a(true, new String[1], vc.field_e);
        }
        var7.a(false);
        var7.b(0);
        bda.field_l = bda.field_l - 1;
        pf var5 = sja.field_fb;
        var5.c(param3, (byte) 99);
        var5.field_g = var5.field_g + 1;
        int var6 = var5.field_g;
        var5.d(3, 0);
        var5.a((byte) -50, param1);
        var5.b((byte) 104, -var6 + var5.field_g);
        return null;
    }

    static {
    }
}
