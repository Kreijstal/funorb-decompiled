/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class tm {
    static String field_g;
    static long[] field_e;
    static cm field_d;
    static boolean field_h;
    static String field_c;
    static long[][] field_i;
    static String field_b;
    static String field_a;
    static String field_f;

    final static void a(int param0, boolean param1, boolean param2, int param3) {
        gh stackIn_9_0 = null;
        int stackIn_9_1 = 0;
        boolean stackIn_10_2 = false;
        gh stackIn_16_0 = null;
        int stackIn_16_1 = 0;
        boolean stackIn_17_2 = false;
        gh stackIn_21_0 = null;
        int stackIn_21_1 = 0;
        boolean stackIn_22_2 = false;
        bh.a(param0 + 2);
        if (ba.field_b >= 0) {
          jb.field_C.field_S = db.a(qg.field_g, -34, new String[]{Integer.toString(ba.field_b)});
        } else {
          jb.field_C.field_S = null;
        }
        stackIn_9_0 = mg.field_Ub;
        stackIn_9_1 = 125;
        stackIn_10_2 = (param2) && (!param1) && (!im.field_b) && (nf.field_b == null) && (ni.field_a == null);
        ((gh) (Object) stackIn_9_0).a((byte) stackIn_9_1, stackIn_10_2);
        stackIn_16_0 = pc.field_q;
        stackIn_16_1 = 12;
        stackIn_17_2 = (param2) && (!param1) && (!im.field_b) && (null == nf.field_b) && (null == ni.field_a);
        ((gh) (Object) stackIn_16_0).a((byte) stackIn_16_1, stackIn_17_2);
        stackIn_21_0 = fl.field_b;
        stackIn_21_1 = 22;
        stackIn_22_2 = (param2) && (!param1) && (im.field_b);
        ((gh) (Object) stackIn_21_0).a((byte) stackIn_21_1, stackIn_22_2);
        sn.field_f.field_d.j(10000);
        if (sg.field_i.field_Eb != 0) {
          of.field_c = true;
        }
        if (0 != qm.field_b.field_Eb && (vg.field_a ||
          !(rd.field_b <= 0) ||
          !(ul.field_d < 2) &&
          fc.field_e[12])) {
          ui.a(param3, param0 + 2);
        }
        if (0 != uc.field_j.field_Eb) {
          if (jg.field_l.length == 1 &&
            ok.field_a != jg.field_l[0]) {
            ok.field_a = jg.field_l[0];
          }
          nl.a(ok.field_a, eh.field_e, true, 0, param3, (byte) 81);
        }
        if (pm.field_gb.field_Eb != 0) {
          im.field_b = false;
        }
        if (param0 != -2) {
          field_c = (String) null;
        }
    }

    final static gh a(byte param0) {
        int var1 = -54 % ((-38 - param0) / 57);
        return pl.d(true);
    }

    public static void a(int param0) {
        field_f = null;
        field_e = null;
        if (param0 != 5) {
          tm.a(-91, false, true, 52);
        }
        field_b = null;
        field_a = null;
        field_c = null;
        field_i = (long[][]) null;
        field_d = null;
        field_g = null;
    }

    static {
        int var14 = 0;
        long stackIn_5_0 = 0L;
        int var0;
        int var1;
        long var2;
        long var4;
        long var6;
        long var8;
        long var10;
        long var12;
        field_g = "1000 (MAX)";
        field_c = "Who can join";
        field_i = new long[8][256];
        field_h = false;
        field_b = "Password is valid";
        field_e = new long[11];
        field_a = "Unfortunately there was a focus problem while setting fullscreen mode. You could try disabling any multiple monitor drivers or window enhancements, if you have any enabled, or try a different resolution.";
        var0 = 0;
        L0: while (var0 < 256) {
          var1 = "ᠣ웨螸ŏ㚦틵祯酒悼鮎ꌌ笵ᷠퟂ⹋﹗ᕷ㟥鿰䫚壉⤊놠殅뵝ჴ쬾է䆋Ᵹ闘ﯮ籦\udd17䞞쨭뼇굚茳挂ꩱ젙䧙守騦㊰햀뻍㑈ｺ遟⁨᪮둔錢擱猒䀈쏬\udba1贽需켫皂혛떯橐䗳ワ㽕ꋪ斺⿀\ude1c﵍鉵ڊ닦ฟ拔ꢖ暈╙葲㥌幸㢌톥댡鰞䏇ﰄ写洍﫟縤㮫츑轎럫㲁铷뤓ⳓ쐃噄義⪻셓\udc0b鵬ㅴ겉ᓡᘺ椉炶탭챂颤⡜".charAt(var0 / 2);
          if ((var0 & 1) != 0) {
            stackIn_5_0 = (long)(255 & var1);
          } else {
            stackIn_5_0 = (long)(var1 >>> 8);
          }
          var2 = stackIn_5_0;
          var4 = var2 << 1;
          if (var4 >= 256L) {
            var4 = var4 ^ 285L;
          }
          var6 = var4 << 1;
          if (var6 >= 256L) {
            var6 = var6 ^ 285L;
          }
          var8 = var2 ^ var6;
          var10 = var6 << 1;
          if (256L <= var10) {
            var10 = var10 ^ 285L;
          }
          var12 = var2 ^ var10;
          field_i[0][var0] = mc.a(mc.a(mc.a(mc.a(var10 << 24, mc.a(var2 << 32, mc.a(mc.a(var2 << 56, var2 << 48), var6 << 40))), var8 << 16), var4 << 8), var12);
          for (var14 = 1; 8 > var14; var14++) {
            field_i[var14][var0] = mc.a(field_i[var14 - 1][var0] >>> 8, field_i[-1 + var14][var0] << 56);
          }
          var0++;
        }
        field_e[0] = 0L;
        for (var0 = 1; var0 <= 10; var0++) {
          var1 = -8 + 8 * var0;
          field_e[var0] = el.a(td.a(255L, field_i[7][7 + var1]), el.a(el.a(td.a(16711680L, field_i[5][var1 + 5]), el.a(el.a(td.a(1095216660480L, field_i[3][var1 + 3]), el.a(td.a(280375465082880L, field_i[2][2 + var1]), el.a(td.a(71776119061217280L, field_i[1][1 + var1]), td.a(-72057594037927936L, field_i[0][var1])))), td.a(field_i[4][var1 + 4], 4278190080L))), td.a(field_i[6][var1 + 6], 65280L)));
        }
        field_f = "Camera left/right: Inverted";
    }
}
