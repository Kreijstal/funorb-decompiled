/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class p {
    static long[] field_d;
    static int field_e;
    static String field_c;
    static PlatformTaskDispatcher field_a;
    static String field_b;
    static long[][] field_f;

    final static gh createRequestResult(int param0, String param1, int param2) {
        gh var3 = null;
        RuntimeException var3_ref = null;
        gh stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var3 = new gh(false);
          var3.field_c = param2;
          if (param0 > -26) {
            field_f = (long[][]) null;
          }
          var3.field_h = param1;
          stackIn_3_0 = var3;
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_6_0 = var3_ref;
          stackIn_6_1 = new StringBuilder().append("p.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param2).append(')').toString());
        }
    }

    final static void setMenuOptionMetrics(int param0, int param1, boolean param2, int param3) {
        IndexedSpriteState.field_c = param0;
        if (param2) {
          p.releaseStatics(35);
        }
        kk.field_x = param1;
        DraggableWidget.field_N = param3;
    }

    public static void releaseStatics(int param0) {
        field_b = null;
        field_d = null;
        field_f = (long[][]) null;
        field_a = null;
        field_c = null;
        if (param0 != 5) {
          p.createDebrisParticle(6, 69, -42, false);
        }
    }

    final static lk createDebrisParticle(int param0, int param1, int param2, boolean param3) {
        if (!param3) {
          return (lk) null;
        }
        lk var4 = (lk) (bo.field_a.removeLast(83));
        if (var4 == null) {
          var4 = new lk();
        }
        var4.a(param0, param2, param1, 7457);
        return var4;
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
        field_b = "Members";
        field_c = "Invite players";
        field_f = new long[8][256];
        field_d = new long[11];
        int var0 = 0;
        while (var0 < 256) {
            var1 = "ᠣ웨螸ŏ㚦틵祯酒悼鮎ꌌ笵ᷠퟂ⹋﹗ᕷ㟥鿰䫚壉⤊놠殅뵝ჴ쬾է䆋Ᵹ闘ﯮ籦\udd17䞞쨭뼇굚茳挂ꩱ젙䧙守騦㊰햀뻍㑈ｺ遟⁨᪮둔錢擱猒䀈쏬\udba1贽需켫皂혛떯橐䗳ワ㽕ꋪ斺⿀\ude1c﵍鉵ڊ닦ฟ拔ꢖ暈╙葲㥌幸㢌톥댡鰞䏇ﰄ写洍﫟縤㮫츑轎럫㲁铷뤓ⳓ쐃噄義⪻셓\udc0b鵬ㅴ겉ᓡᘺ椉炶탭챂颤⡜".charAt(var0 / 2);
            var2 = 0 != (1 & var0) ? (long)(var1 & 255) : (long)(var1 >>> 8);
            var4 = var2 << 1;
            if (var4 >= 256L) {
                var4 = var4 ^ 285L;
            }
            var6 = var4 << 1;
            if (!(256L > var6)) {
                var6 = var6 ^ 285L;
            }
            var8 = var6 ^ var2;
            var10 = var6 << 1;
            if (!(var10 < 256L)) {
                var10 = var10 ^ 285L;
            }
            var12 = var2 ^ var10;
            field_f[0][var0] = DisplayNamePanel.a(DisplayNamePanel.a(var4 << 8, DisplayNamePanel.a(DisplayNamePanel.a(var10 << 24, DisplayNamePanel.a(DisplayNamePanel.a(var6 << 40, DisplayNamePanel.a(var2 << 56, var2 << 48)), var2 << 32)), var8 << 16)), var12);
            for (var14 = 1; var14 < 8; var14++) {
                field_f[var14][var0] = DisplayNamePanel.a(field_f[-1 + var14][var0] << 56, field_f[-1 + var14][var0] >>> 8);
            }
            var0++;
        }
        field_d[0] = 0L;
        for (var0 = 1; 10 >= var0; var0++) {
            var1 = 8 * (-1 + var0);
            field_d[var0] = ScrollPane.bitXor(en.longAnd(255L, field_f[7][var1 + 7]), ScrollPane.bitXor(en.longAnd(65280L, field_f[6][var1 + 6]), ScrollPane.bitXor(ScrollPane.bitXor(ScrollPane.bitXor(ScrollPane.bitXor(en.longAnd(field_f[2][var1 + 2], 280375465082880L), ScrollPane.bitXor(en.longAnd(-72057594037927936L, field_f[0][var1]), en.longAnd(field_f[1][var1 + 1], 71776119061217280L))), en.longAnd(field_f[3][var1 + 3], 1095216660480L)), en.longAnd(4278190080L, field_f[4][4 + var1])), en.longAnd(field_f[5][5 + var1], 16711680L))));
        }
    }
}
