/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gh {
    static String field_e;
    static String field_b;
    static ac[] field_i;
    static long[] field_a;
    static cn[] field_g;
    static nh field_c;
    static long[][] field_h;
    static boolean field_f;
    static String field_j;
    static wh field_d;

    public static void a(int param0) {
        field_e = null;
        field_b = null;
        field_d = null;
        field_g = null;
        field_i = null;
        field_c = null;
        field_h = (long[][]) null;
        field_a = null;
        field_j = null;
        if (param0 != 7) {
          gh.a(-121, (byte) 117);
        }
    }

    final static void a(int param0, String param1, boolean param2) {
        try {
          cd.field_b = true;
          jd.field_l = param2 ? true : false;
          a.field_n = new nk(lg.field_w, hc.field_f, param1, qc.field_t, jd.field_l);
          lg.field_w.a(a.field_n, -1);
          if (param0 != 23321) {
            field_i = (ac[]) null;
          }
        } catch (RuntimeException runtimeException) {
          throw vk.a((Throwable) ((Object) runtimeException), "gh.E(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    final static String a(int param0, byte param1) {
        if (param0 < 0) {
          return "-" + -param0 / 10 + "." + -param0 % 10;
        }
        if (param1 >= -97) {
          qg var3 = (qg) null;
          gh.a(101, -9, -53, 62, (qg) null, -6);
        }
        return param0 / 10 + "." + param0 % 10;
    }

    final static ek a(int param0, int param1, int param2, int param3, qg param4, int param5) {
        java.awt.Frame var6 = null;
        RuntimeException var6_ref = null;
        ek var7 = null;
        java.awt.Frame var8 = null;
        ek stackIn_5_0 = null;
        ek stackIn_7_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var8 = ga.a(param4, param5, param0, param2, 122, param3);
          var6 = var8;
          if (var8 == null) {
            return null;
          }
          var7 = new ek();
          var7.field_e = var8;
          var7.field_e.add((java.awt.Component) ((Object) var7));
          var7.setBounds(0, 0, param5, param3);
          var7.addFocusListener(var7);
          var7.requestFocus();
          if (param1 < -63) {
            stackIn_7_0 = var7;
            return stackIn_7_0;
          }
          stackIn_5_0 = (ek) null;
          return stackIn_5_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6_ref = decompiledCaughtException;
          stackIn_10_0 = var6_ref;
          stackIn_10_1 = new StringBuilder().append("gh.B(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw vk.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param5).append(')').toString());
        }
    }

    final static void a(int param0, int param1) {
        if (param1 != 11) {
          return;
        }
        rj var3 = (rj) null;
        qh.a(-13716, (rj) null, param0);
    }

    static {
        int var1 = 0;
        long var2 = 0L;
        long var4 = 0L;
        long var6 = 0L;
        long var8 = 0L;
        long var10 = 0L;
        long var12 = 0L;
        int var14 = 0;
        field_i = new ac[38];
        field_e = "Centaur";
        field_b = "Hugely muscled man wearing only a loincloth and leather helm for protection, but wielding a ridiculously large hammer to compensate. The berserker enters a trance-like state when he engages foes in combat, giving him great strength, but leaving him vulnerable to skilled opponents.";
        field_a = new long[11];
        field_h = new long[8][256];
        int var0 = 0;
        while (var0 < 256) {
            var1 = "ᠣ웨螸ŏ㚦틵祯酒悼鮎ꌌ笵ᷠퟂ⹋﹗ᕷ㟥鿰䫚壉⤊놠殅뵝ჴ쬾է䆋Ᵹ闘ﯮ籦\udd17䞞쨭뼇굚茳挂ꩱ젙䧙守騦㊰햀뻍㑈ｺ遟⁨᪮둔錢擱猒䀈쏬\udba1贽需켫皂혛떯橐䗳ワ㽕ꋪ斺⿀\ude1c﵍鉵ڊ닦ฟ拔ꢖ暈╙葲㥌幸㢌톥댡鰞䏇ﰄ写洍﫟縤㮫츑轎럫㲁铷뤓ⳓ쐃噄義⪻셓\udc0b鵬ㅴ겉ᓡᘺ椉炶탭챂颤⡜".charAt(var0 / 2);
            var2 = 0 != (var0 & 1) ? (long)(255 & var1) : (long)(var1 >>> 8);
            var4 = var2 << 1;
            if (!(256L > var4)) {
                var4 = var4 ^ 285L;
            }
            var6 = var4 << 1;
            if (!(var6 < 256L)) {
                var6 = var6 ^ 285L;
            }
            var8 = var6 ^ var2;
            var10 = var6 << 1;
            if (256L <= var10) {
                var10 = var10 ^ 285L;
            }
            var12 = var10 ^ var2;
            field_h[0][var0] = id.a(var12, id.a(id.a(var8 << 16, id.a(id.a(id.a(var6 << 40, id.a(var2 << 48, var2 << 56)), var2 << 32), var10 << 24)), var4 << 8));
            for (var14 = 1; var14 < 8; var14++) {
                field_h[var14][var0] = id.a(field_h[-1 + var14][var0] >>> 8, field_h[-1 + var14][var0] << 56);
            }
            var0++;
        }
        field_a[0] = 0L;
        for (var0 = 1; var0 <= 10; var0++) {
            var1 = var0 * 8 - 8;
            field_a[var0] = mn.a(eg.a(255L, field_h[7][var1 + 7]), mn.a(mn.a(mn.a(eg.a(4278190080L, field_h[4][var1 + 4]), mn.a(eg.a(field_h[3][3 + var1], 1095216660480L), mn.a(mn.a(eg.a(field_h[1][1 + var1], 71776119061217280L), eg.a(-72057594037927936L, field_h[0][var1])), eg.a(field_h[2][var1 + 2], 280375465082880L)))), eg.a(16711680L, field_h[5][var1 + 5])), eg.a(field_h[6][var1 + 6], 65280L)));
        }
        field_j = "Horns, claws, hooves, spines and a long tongue; the beastman is formed of many animals and more dangerous than all of them put together.";
    }
}
