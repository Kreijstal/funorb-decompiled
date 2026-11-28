/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nc {
    static String field_c;
    static long[][] field_d;
    static long[] field_g;
    static int field_f;
    static int field_e;
    static int[] field_b;
    static String field_a;

    public static void clearStaticReferences(int param0) {
        field_a = null;
        field_c = null;
        field_d = (long[][]) null;
        field_g = null;
        field_b = null;
        int var1 = 36 / ((76 - param0) / 34);
    }

    final static void a(int param0) {
        String var2 = (String) null;
        ValidationStatusIcon.a(v.field_b, (String) null, (byte) -53);
        if (param0 != 1) {
          field_c = (String) null;
        }
    }

    final static void a(ResourceArchive param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        sj var5 = null;
        int[] var6 = null;
        int var7 = 0;
        ResourceArchive var8 = null;
        hb var9 = null;
        int var10 = 0;
        hb var11 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        int var4Lifetime1;
        var7 = MonkeyPuzzle2.field_F ? 1 : 0;
        try {
          var9 = new hb(param0.getFileByName("", "logo.fo3d", -127));
          var11 = var9;
          var3 = var11.readUnsignedByte((byte) 114);
          var11.p(8);
          ri.field_c = SecondaryNodeDeque.a(12, var11);
          nl.field_a = new int[var3][];
          WidgetContainer.field_x = new sj[var3];
          if (param1 != 2) {
            var8 = (ResourceArchive) null;
            nc.a((ResourceArchive) null, -50);
          }
          for (var4 = 0; var4 < var3; var4++) {
            WidgetContainer.field_x[var4] = gi.a(param1 - 114, var9);
          }
          var11.q(param1 ^ -110);
          var10 = 0;
          var4Lifetime1 = var10;
          while (var10 < var3) {
            var5 = WidgetContainer.field_x[var10];
            var5.a(6, 6, 6, 1, false);
            var5.c(74);
            var6 = new int[]{var5.field_G + var5.field_q >> 1, var5.field_b + var5.field_j >> 1, var5.field_t + var5.field_x >> 1};
            nl.field_a[var10] = var6;
            var5.a(-var6[2], (byte) 70, -var6[0], -var6[1]);
            var10++;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_12_0 = var2;
          stackIn_12_1 = new StringBuilder().append("nc.B(");
          if (param0 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw la.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param1).append(')').toString());
        }
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
        field_c = "Friends can be added in multiplayer<nbsp>games";
        field_d = new long[8][256];
        field_g = new long[11];
        int var0 = 0;
        while (256 > var0) {
            var1 = "ᠣ웨螸ŏ㚦틵祯酒悼鮎ꌌ笵ᷠퟂ⹋﹗ᕷ㟥鿰䫚壉⤊놠殅뵝ჴ쬾է䆋Ᵹ闘ﯮ籦\udd17䞞쨭뼇굚茳挂ꩱ젙䧙守騦㊰햀뻍㑈ｺ遟⁨᪮둔錢擱猒䀈쏬\udba1贽需켫皂혛떯橐䗳ワ㽕ꋪ斺⿀\ude1c﵍鉵ڊ닦ฟ拔ꢖ暈╙葲㥌幸㢌톥댡鰞䏇ﰄ写洍﫟縤㮫츑轎럫㲁铷뤓ⳓ쐃噄義⪻셓\udc0b鵬ㅴ겉ᓡᘺ椉炶탭챂颤⡜".charAt(var0 / 2);
            var2 = (1 & var0) == 0 ? (long)(var1 >>> 8) : (long)(var1 & 255);
            var4 = var2 << 1;
            if (!(var4 < 256L)) {
                var4 = var4 ^ 285L;
            }
            var6 = var4 << 1;
            if (var6 >= 256L) {
                var6 = var6 ^ 285L;
            }
            var8 = var6 ^ var2;
            var10 = var6 << 1;
            if (!(var10 < 256L)) {
                var10 = var10 ^ 285L;
            }
            var12 = var2 ^ var10;
            field_d[0][var0] = gb.bitwiseOr(var12, gb.bitwiseOr(gb.bitwiseOr(gb.bitwiseOr(var10 << 24, gb.bitwiseOr(var2 << 32, gb.bitwiseOr(var6 << 40, gb.bitwiseOr(var2 << 56, var2 << 48)))), var8 << 16), var4 << 8));
            for (var14 = 1; var14 < 8; var14++) {
                field_d[var14][var0] = gb.bitwiseOr(field_d[var14 - 1][var0] << 56, field_d[var14 - 1][var0] >>> 8);
            }
            var0++;
        }
        field_g[0] = 0L;
        int var15 = 1;
        var0 = var15;
        while (10 >= var15) {
            var1 = (-1 + var15) * 8;
            field_g[var15] = hd.bitwiseXor(hd.bitwiseXor(DialogMessagePane.bitwiseAnd(field_d[6][6 + var1], 65280L), hd.bitwiseXor(DialogMessagePane.bitwiseAnd(field_d[5][5 + var1], 16711680L), hd.bitwiseXor(hd.bitwiseXor(hd.bitwiseXor(DialogMessagePane.bitwiseAnd(280375465082880L, field_d[2][var1 + 2]), hd.bitwiseXor(DialogMessagePane.bitwiseAnd(71776119061217280L, field_d[1][1 + var1]), DialogMessagePane.bitwiseAnd(-72057594037927936L, field_d[0][var1]))), DialogMessagePane.bitwiseAnd(1095216660480L, field_d[3][var1 + 3])), DialogMessagePane.bitwiseAnd(field_d[4][4 + var1], 4278190080L)))), DialogMessagePane.bitwiseAnd(field_d[7][var1 + 7], 255L));
            var15++;
        }
        field_a = "Resume Game";
    }
}
