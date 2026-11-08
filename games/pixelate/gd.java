/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gd {
    static Sprite field_i;
    static int[] field_c;
    static String field_d;
    static LoadingStepTracker field_a;
    static int field_l;
    static int[] field_b;
    static int[] field_h;
    static PuzzlePieceQueue[] field_e;
    static String field_j;
    static byte[][] field_k;
    static int field_g;
    static Sprite[] field_f;

    final static void a(byte param0) {
        vd.field_c = new SceneWidget(0L, (SceneWidget) null);
        if (DialWidgetPainter.field_n) {
          vd.field_c.addChild(ValidatedTextWidget.field_lb, (byte) 26);
        }
        vd.field_c.addChild(StripedProgressBar.field_O, (byte) 26);
        cl.field_g = new wo(TimerBar.field_m, vd.field_c);
        GreenGrowTheRushesBackground.field_n = new SceneWidget(0L, (SceneWidget) null);
        if (param0 != -7) {
          gd.releaseStatics(-71);
        }
        GreenGrowTheRushesBackground.field_n.addChild(cl.field_g.field_g, (byte) 26);
        GreenGrowTheRushesBackground.field_n.addChild(ValidatedTextWidget.field_cb, (byte) 26);
        PacketBuffer.layoutLobbyPanels(false);
    }

    public static void releaseStatics(int param0) {
        field_e = null;
        field_j = null;
        field_h = null;
        if (param0 != 0) {
          return;
        }
        field_b = null;
        field_i = null;
        field_k = (byte[][]) null;
        field_a = null;
        field_c = null;
        field_f = null;
        field_d = null;
    }

    static {
        int var2 = 0;
        int var3 = 0;
        int var2Lifetime1;
        int var2Lifetime2;
        int var2Lifetime3;
        int var2Lifetime4;
        int var2Lifetime5;
        int var3Lifetime1;
        int var3Lifetime2;
        int var1Lifetime1;
        field_d = "To server list";
        field_l = 20;
        field_b = new int[8];
        field_c = new int[12];
        field_h = new int[615];
        int var0 = 307;
        for (var2 = 0; var0 > var2; var2++) {
          var3 = 255 & 255 * var2 / var0;
          field_h[var2] = bq.bitOr(var3 << 16, 65280);
        }
        int var1 = 153;
        for (var2Lifetime1 = var0; var1 + var0 > var2Lifetime1; var2Lifetime1++) {
          var3Lifetime1 = 255 * (-var0 + var2Lifetime1) / var1;
          field_h[var2Lifetime1] = bq.bitOr(-cm.bitAnd(255, var3Lifetime1) + 255 << 8, 16711680);
        }
        for (var2Lifetime2 = var1 + var0; var2Lifetime2 < 615; var2Lifetime2++) {
          var3Lifetime2 = 255 * (-var1 + var2Lifetime2 - var0) / var1;
          if (var3Lifetime2 > 255) {
            var3Lifetime2 = 255;
          }
          field_h[var2Lifetime2] = -(cm.bitAnd(255, var3Lifetime2) / 2) + 255 << 16;
        }
        for (var2Lifetime3 = 0; var2Lifetime3 < 8; var2Lifetime3++) {
          field_b[var2Lifetime3] = 65793 * (var2Lifetime3 << 4);
        }
        for (var2Lifetime4 = 0; field_c.length > var2Lifetime4; var2Lifetime4++) {
          field_c[var2Lifetime4] = (var2Lifetime4 << 8) / field_c.length * 65793;
        }
        field_j = "Only show lobby chat from my friends";
        field_e = new PuzzlePieceQueue[50];
        int[] var7 = new int[50];
        var1Lifetime1 = 30;
        var7[12] = 30;
        var7[7] = 22;
        var7[14] = 10;
        var7[16] = 14;
        var7[10] = 22;
        var7[5] = 30;
        var7[1] = 26;
        for (var2Lifetime5 = 18; var2Lifetime5 < 50; var2Lifetime5++) {
          var7[var2Lifetime5] = var1Lifetime1;
        }
        var7[29] = 0;
        var7[26] = 20;
        var7[39] = 24;
        var7[37] = 1;
        var7[35] = 1;
        var7[38] = 20;
        var7[41] = 20;
        var7[24] = 28;
        field_e[0] = new PuzzlePieceQueue(0, 3, 3, var7[0], 2, new int[]{2, 2, 2, 2});
        field_e[1] = new PuzzlePieceQueue(1, 3, 3, var7[1], 1, new int[]{1, 1, 0, 0, 5});
        field_e[2] = new PuzzlePieceQueue(2, 3, 3, var7[2], 3, new int[]{1, 2, 3, 4, 0});
        field_e[3] = new PuzzlePieceQueue(3, 3, 3, var7[3], 4, new int[]{4, 4, 3, 3, 4, 4});
        field_e[4] = new PuzzlePieceQueue(4, 3, 3, var7[4], 5, new int[]{4, 4, 3, 5});
        field_e[5] = new PuzzlePieceQueue(5, 3, 4, var7[5], 6, new int[]{3, 3, 5, 5, 3, 3});
        field_e[6] = new PuzzlePieceQueue(6, 3, 5, var7[6], 7, new int[]{4, 5, 5, 4, 4, 5});
        field_e[7] = new PuzzlePieceQueue(7, 3, 4, var7[7], 0, new int[]{0, 0, 1, 1, 0, 0});
        field_e[8] = new PuzzlePieceQueue(8, 4, 4, var7[8], 1, new int[]{4, 4, 5, 5, 1});
        field_e[9] = new PuzzlePieceQueue(9, 4, 4, var7[9], 3, new int[]{2, 1, 2, 1, 2, 0, 2, 2});
        field_e[10] = new PuzzlePieceQueue(10, 4, 3, var7[10], 4, new int[]{5, 5, 3, 3, 5, 5});
        field_e[11] = new PuzzlePieceQueue(11, 5, 3, var7[11], 2, new int[]{4, 2, 4, 2, 2, 2});
        field_e[12] = new PuzzlePieceQueue(12, 4, 4, var7[12], 6, new int[]{0, 0, 5, 5, 1, 1, 5, 5, 0, 1});
        field_e[13] = new PuzzlePieceQueue(13, 3, 5, var7[13], 5, new int[]{3, 2, 5, 3, 2, 5});
        field_e[14] = new PuzzlePieceQueue(14, 5, 4, var7[14], 7, new int[]{3, 3, 2, 3, 3, 3});
        field_e[15] = new PuzzlePieceQueue(15, 5, 5, var7[15], 0, new int[]{0, 3, 3, 3, 3, 5, 5, 2, 2});
        field_e[16] = new PuzzlePieceQueue(16, 4, 5, var7[16], 1, new int[]{3, 3, 3, 3, 3, 3, 3, 3});
        field_e[17] = new PuzzlePieceQueue(17, 5, 5, var7[17], 2, new int[]{2, 2, 2, 2, 2, 2, 2, 2, 2, 2});
        field_e[18] = new PuzzlePieceQueue(18, 5, 5, var7[18], 3, new int[]{5, 5, 5, 2, 2, 2, 4, 4, 4});
        field_e[19] = new PuzzlePieceQueue(19, 5, 5, var7[19], 4, new int[]{0, 0, 0, 3, 1, 4, 4, 4, 4});
        field_e[20] = new PuzzlePieceQueue(20, 5, 5, var7[20], 5, new int[]{5, 5, 5, 5, 5, 5, 5, 5, 5});
        field_e[21] = new PuzzlePieceQueue(21, 5, 5, var7[21], 6, new int[]{5, 3, 3, 2, 3, 3, 1, 3, 5});
        field_e[22] = new PuzzlePieceQueue(22, 5, 5, var7[22], 7, new int[]{0, 1, 1, 4, 4, 2, 3, 3, 5});
        field_e[23] = new PuzzlePieceQueue(23, 5, 5, var7[23], 3, new int[]{0, 1, 2, 4, 2, 4, 2, 4, 3});
        field_e[24] = new PuzzlePieceQueue(24, 5, 5, var7[24], 0, new int[]{5, 5, 2, 3, 4, 2, 4, 5, 3});
        field_e[25] = new PuzzlePieceQueue(25, 3, 3, var7[25], 5, new int[]{1, 5, 0, 1, 3, 4, 5});
        field_e[26] = new PuzzlePieceQueue(26, 3, 3, var7[26], 0, new int[]{1, 3, 3, 3, 2, 1, 2});
        field_e[27] = new PuzzlePieceQueue(27, 3, 3, var7[27], 3, new int[]{4, 0, 0, 4, 4, 0, 3});
        field_e[28] = new PuzzlePieceQueue(28, 3, 3, var7[28], 6, new int[]{3, 2, 4, 0, 3, 1});
        field_e[29] = new PuzzlePieceQueue(29, 3, 3, var7[29], 1, new int[]{4, 3, 3, 3, 3, 3, 3});
        field_e[30] = new PuzzlePieceQueue(30, 4, 4, var7[30], 7, new int[]{3, 3, 2, 2, 3, 2, 4});
        field_e[31] = new PuzzlePieceQueue(31, 3, 3, var7[31], 0, new int[]{0, 0, 0, 1, 2, 2, 5, 0});
        field_e[32] = new PuzzlePieceQueue(32, 3, 4, var7[32], 7, new int[]{0, 1, 0, 1, 0, 1, 0, 3});
        field_e[33] = new PuzzlePieceQueue(33, 3, 3, var7[33], 4, new int[]{4, 4, 4, 4, 5, 2, 2, 5, 2});
        field_e[34] = new PuzzlePieceQueue(34, 4, 4, var7[34], 3, new int[]{2, 4, 2, 5, 2, 2, 5});
        field_e[35] = new PuzzlePieceQueue(35, 3, 4, var7[35], 5, new int[]{5, 5, 5, 5, 5, 5, 5, 5, 5, 1});
        field_e[36] = new PuzzlePieceQueue(36, 3, 4, var7[36], 1, new int[]{0, 0, 1, 1, 5, 4, 3});
        field_e[37] = new PuzzlePieceQueue(37, 3, 5, var7[37], 0, new int[]{2, 2, 2, 2, 2, 2, 2, 2});
        field_e[38] = new PuzzlePieceQueue(38, 3, 3, var7[38], 4, new int[]{4, 4, 4, 3});
        field_e[39] = new PuzzlePieceQueue(39, 3, 3, var7[39], 6, new int[]{2, 2, 2, 2});
        field_e[40] = new PuzzlePieceQueue(40, 4, 4, var7[40], 4, new int[]{4, 2, 3, 5, 4});
        field_e[41] = new PuzzlePieceQueue(41, 4, 4, var7[41], 3, new int[]{3, 4, 3, 4, 5, 5});
        field_e[42] = new PuzzlePieceQueue(42, 4, 4, var7[42], 1, new int[]{3, 4, 3, 4, 2, 5});
        field_e[43] = new PuzzlePieceQueue(43, 4, 4, var7[43], 7, new int[]{5, 5, 2, 4, 4, 4});
        field_e[44] = new PuzzlePieceQueue(44, 4, 4, var7[44], 2, new int[]{5, 4, 3, 0, 1, 3});
        field_e[45] = new PuzzlePieceQueue(45, 5, 5, var7[45], 6, new int[]{3, 2, 1, 5, 5, 2, 3, 4, 3});
        field_e[46] = new PuzzlePieceQueue(46, 5, 5, var7[46], 2, new int[]{2, 5, 4, 5, 1, 3, 1, 4, 3, 5});
        field_e[47] = new PuzzlePieceQueue(47, 5, 5, var7[47], 1, new int[]{3, 4, 2, 1, 3, 5, 4, 3, 5, 5});
        field_e[48] = new PuzzlePieceQueue(48, 5, 5, var7[48], 2, new int[]{5, 5, 5, 5, 5, 5, 5, 5, 5, 3});
        field_e[49] = new PuzzlePieceQueue(49, 5, 5, var7[49], 0, new int[]{4, 4, 4, 4, 3, 3, 3, 3, 5, 5, 5, 5});
    }
}
