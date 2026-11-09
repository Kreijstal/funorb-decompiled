/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class WhirlpoolTables {
    static long[] roundConstants;
    static long[][] roundTables;
    static String resumeGameText;

    public static void releaseStatics(int param0) {
        roundTables = (long[][]) null;
        roundConstants = null;
        if (param0 >= -107) {
          roundConstants = (long[]) null;
          resumeGameText = null;
          return;
        }
        resumeGameText = null;
    }

    final static void c(int param0) {
        LegacyOpenGlEffectManager.field_i = 1;
        hc.field_f = 1;
        if (param0 >= 40) {
          ResourceArchive.field_f = 1;
          ArrayUtils.fill(CacheIoRequest.field_A, 0, 25, -1);
          return;
        }
        roundTables = (long[][]) null;
        ResourceArchive.field_f = 1;
        ArrayUtils.fill(CacheIoRequest.field_A, 0, 25, -1);
    }

    final static void a(int param0) {
        CacheIoRequest.field_z = new int[25];
        if (param0 == 17534) {
          hc.field_f = 1;
          CacheIoRequest.field_A = new int[25];
          OpenGlTexture3D.field_j = new int[25];
          ToolkitRasterStateFrame.field_e = -1;
          TextureMetadata.field_f = new boolean[25];
          ResourceArchive.field_f = 1;
          up.field_g = new boolean[25];
          LegacyOpenGlEffectManager.field_i = 1;
          NineSlicePanel.field_d = new boolean[25];
          ArrayUtils.fill(CacheIoRequest.field_z, 0, 25, 2147483647);
          ArrayUtils.fill(CacheIoRequest.field_A, 0, 25, -1);
          return;
        }
        roundTables = (long[][]) null;
        hc.field_f = 1;
        CacheIoRequest.field_A = new int[25];
        OpenGlTexture3D.field_j = new int[25];
        ToolkitRasterStateFrame.field_e = -1;
        TextureMetadata.field_f = new boolean[25];
        ResourceArchive.field_f = 1;
        up.field_g = new boolean[25];
        LegacyOpenGlEffectManager.field_i = 1;
        NineSlicePanel.field_d = new boolean[25];
        ArrayUtils.fill(CacheIoRequest.field_z, 0, 25, 2147483647);
        ArrayUtils.fill(CacheIoRequest.field_A, 0, 25, -1);
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
        roundConstants = new long[11];
        roundTables = new long[8][256];
        int var0 = 0;
        while (var0 < 256) {
            var1 = "ᠣ웨螸ŏ㚦틵祯酒悼鮎ꌌ笵ᷠퟂ⹋﹗ᕷ㟥鿰䫚壉⤊놠殅뵝ჴ쬾է䆋Ᵹ闘ﯮ籦\udd17䞞쨭뼇굚茳挂ꩱ젙䧙守騦㊰햀뻍㑈ｺ遟⁨᪮둔錢擱猒䀈쏬\udba1贽需켫皂혛떯橐䗳ワ㽕ꋪ斺⿀\ude1c﵍鉵ڊ닦ฟ拔ꢖ暈╙葲㥌幸㢌톥댡鰞䏇ﰄ写洍﫟縤㮫츑轎럫㲁铷뤓ⳓ쐃噄義⪻셓\udc0b鵬ㅴ겉ᓡᘺ椉炶탭챂颤⡜".charAt(var0 / 2);
            var2 = 0 != (var0 & 1) ? (long)(255 & var1) : (long)(var1 >>> 8);
            var4 = var2 << 1;
            if (var4 >= 256L) {
                var4 = var4 ^ 285L;
            }
            var6 = var4 << 1;
            if (256L <= var6) {
                var6 = var6 ^ 285L;
            }
            var8 = var6 ^ var2;
            var10 = var6 << 1;
            if (var10 >= 256L) {
                var10 = var10 ^ 285L;
            }
            var12 = var2 ^ var10;
            roundTables[0][var0] = ExpandingRingEffect.bitwiseOr(var12, ExpandingRingEffect.bitwiseOr(var4 << 8, ExpandingRingEffect.bitwiseOr(ExpandingRingEffect.bitwiseOr(ExpandingRingEffect.bitwiseOr(ExpandingRingEffect.bitwiseOr(var6 << 40, ExpandingRingEffect.bitwiseOr(var2 << 48, var2 << 56)), var2 << 32), var10 << 24), var8 << 16)));
            for (var14 = 1; 8 > var14; var14++) {
                roundTables[var14][var0] = ExpandingRingEffect.bitwiseOr(roundTables[var14 - 1][var0] >>> 8, roundTables[var14 - 1][var0] << 56);
            }
            var0++;
        }
        roundConstants[0] = 0L;
        for (var0 = 1; var0 <= 10; var0++) {
            var1 = 8 * (-1 + var0);
            roundConstants[var0] = ArenaBackdropPalettes.xor(ArenaBackdropPalettes.xor(ArenaBackdropPalettes.xor(ArenaBackdropPalettes.xor(SoftLruCache.bitwiseAnd(4278190080L, roundTables[4][4 + var1]), ArenaBackdropPalettes.xor(SoftLruCache.bitwiseAnd(1095216660480L, roundTables[3][var1 + 3]), ArenaBackdropPalettes.xor(SoftLruCache.bitwiseAnd(280375465082880L, roundTables[2][var1 + 2]), ArenaBackdropPalettes.xor(SoftLruCache.bitwiseAnd(roundTables[1][var1 + 1], 71776119061217280L), SoftLruCache.bitwiseAnd(roundTables[0][var1], -72057594037927936L))))), SoftLruCache.bitwiseAnd(16711680L, roundTables[5][var1 + 5])), SoftLruCache.bitwiseAnd(roundTables[6][6 + var1], 65280L)), SoftLruCache.bitwiseAnd(roundTables[7][7 + var1], 255L));
        }
        resumeGameText = "Resume Game";
    }
}
