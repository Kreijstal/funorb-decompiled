/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class tba extends rqa {
    static int field_o;
    static int field_p;
    static asb field_q;

    tba(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    final static void a(int param0, byte param1, int param2) {
        if (param1 != -114) {
            tba.e((byte) 98);
            ela.field_o = param0;
            gi.field_b = param2;
            return;
        }
        ela.field_o = param0;
        gi.field_b = param2;
    }

    final static String a(int param0, String param1, int param2) {
        CharSequence var6 = (CharSequence) (Object) param1;
        if (!mn.a(var6, (byte) -121)) {
            return tjb.field_Cb;
        }
        if (!(!qja.a((byte) -75, param1))) {
            return oja.field_o;
        }
        if (!(-3 == (iwa.field_b ^ -1))) {
            return ma.field_o;
        }
        if (!(!ltb.a((byte) -94, param1))) {
            return isa.a(vjb.field_c, new String[1], 100);
        }
        if (-101 >= (mq.field_k ^ -1)) {
            return am.field_o;
        }
        if (!(!uaa.a(param1, (byte) -93))) {
            return isa.a(ceb.field_r, new String[1], 76);
        }
        faa var5 = dpa.field_p;
        var5.h(param0 ^ 24333, param2);
        var5.field_e = var5.field_e + 1;
        int var4 = var5.field_e;
        var5.c(0, param0);
        var5.a(true, param1);
        var5.e(var5.field_e + -var4, -129);
        return null;
    }

    public static void e(byte param0) {
        field_q = null;
        if (param0 >= -79) {
            tba.a(23, (byte) -112, 66);
        }
    }

    final static Boolean a(int param0) {
        int var1 = 118 % ((param0 - 12) / 55);
        Boolean var2 = ehb.field_f;
        ehb.field_f = null;
        return var2;
    }

    final nc a(nc[] param0, int param1) {
        if (param1 > -119) {
          field_p = -35;
          si.a(191, 62, param0[0].a(85));
          return new nc((Object) (Object) "void");
        } else {
          si.a(191, 62, param0[0].a(85));
          return new nc((Object) (Object) "void");
        }
    }

    static {
    }
}
