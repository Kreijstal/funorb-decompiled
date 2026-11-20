/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class WhirlpoolTables {
    static long[][] roundTables;
    static long[] roundConstants;
    static SpriteAsset field_a;
    static RoadStripRenderer field_c;
    static String field_d;
    static String[] field_b;
    static ArchiveLoadProgress field_e;

    final static void setNameSuggestions(byte param0, String[] param1) {
        if (null != TutorialAction.field_b) {
          TutorialAction.field_b.nameSuggestions.setSuggestions(param1, (byte) 43);
        }
        if (param0 <= 33) {
          return;
        }
        try {
          if (ZombiePedestrian.field_l != null) {
            ZombiePedestrian.field_l.nameSuggestions.setSuggestions(param1, (byte) 43);
          }
        } catch (RuntimeException runtimeException) {
          throw EntitySound.wrapException((Throwable) ((Object) runtimeException), "ri.B(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public static void clearSharedReferences(int param0) {
        roundConstants = null;
        field_d = null;
        field_a = null;
        if (param0 == 1003075272) {
          field_b = null;
          field_e = null;
          roundTables = (long[][]) null;
          field_c = null;
          return;
        }
        WhirlpoolTables.clearSharedReferences(120);
        field_b = null;
        field_e = null;
        roundTables = (long[][]) null;
        field_c = null;
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
        roundTables = new long[8][256];
        roundConstants = new long[11];
        int var0 = 0;
        while (var0 < 256) {
            var1 = "ᠣ웨螸ŏ㚦틵祯酒悼鮎ꌌ笵ᷠퟂ⹋﹗ᕷ㟥鿰䫚壉⤊놠殅뵝ჴ쬾է䆋Ᵹ闘ﯮ籦\udd17䞞쨭뼇굚茳挂ꩱ젙䧙守騦㊰햀뻍㑈ｺ遟⁨᪮둔錢擱猒䀈쏬\udba1贽需켫皂혛떯橐䗳ワ㽕ꋪ斺⿀\ude1c﵍鉵ڊ닦ฟ拔ꢖ暈╙葲㥌幸㢌톥댡鰞䏇ﰄ写洍﫟縤㮫츑轎럫㲁铷뤓ⳓ쐃噄義⪻셓\udc0b鵬ㅴ겉ᓡᘺ椉炶탭챂颤⡜".charAt(var0 / 2);
            var2 = (var0 & 1) != 0 ? (long)(255 & var1) : (long)(var1 >>> 8);
            var4 = var2 << 1;
            if (256L <= var4) {
                var4 = var4 ^ 285L;
            }
            var6 = var4 << 1;
            if (var6 >= 256L) {
                var6 = var6 ^ 285L;
            }
            var8 = var6 ^ var2;
            var10 = var6 << 1;
            if (var10 >= 256L) {
                var10 = var10 ^ 285L;
            }
            var12 = var10 ^ var2;
            roundTables[0][var0] = ba.orLongs(var12, ba.orLongs(var4 << 8, ba.orLongs(ba.orLongs(ba.orLongs(var2 << 32, ba.orLongs(ba.orLongs(var2 << 48, var2 << 56), var6 << 40)), var10 << 24), var8 << 16)));
            for (var14 = 1; var14 < 8; var14++) {
                roundTables[var14][var0] = ba.orLongs(roundTables[-1 + var14][var0] << 56, roundTables[-1 + var14][var0] >>> 8);
            }
            var0++;
        }
        roundConstants[0] = 0L;
        for (var0 = 1; 10 >= var0; var0++) {
            var1 = -8 + var0 * 8;
            roundConstants[var0] = GameKeyHandler.xorLongs(GameKeyHandler.xorLongs(ViewportSizingController.andLong(65280L, roundTables[6][var1 + 6]), GameKeyHandler.xorLongs(ViewportSizingController.andLong(16711680L, roundTables[5][var1 + 5]), GameKeyHandler.xorLongs(ViewportSizingController.andLong(roundTables[4][4 + var1], 4278190080L), GameKeyHandler.xorLongs(GameKeyHandler.xorLongs(GameKeyHandler.xorLongs(ViewportSizingController.andLong(roundTables[1][1 + var1], 71776119061217280L), ViewportSizingController.andLong(roundTables[0][var1], -72057594037927936L)), ViewportSizingController.andLong(roundTables[2][2 + var1], 280375465082880L)), ViewportSizingController.andLong(1095216660480L, roundTables[3][3 + var1]))))), ViewportSizingController.andLong(255L, roundTables[7][7 + var1]));
        }
        field_c = (RoadStripRenderer) ((Object) new ShadedRoadStripRenderer(7, 30.0f, new int[]{16711680, 16777215}));
        field_d = "Service unavailable";
        field_b = new String[]{"Showing by rating", "Showing by win percentage"};
    }
}
