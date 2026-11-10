/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class TextHotspotRegion extends IntrusiveNode {
    int field_l;
    int field_m;
    static String field_n;
    int field_i;
    TextHotspotRegion field_h;
    int field_k;
    static int[][] field_o;
    int field_j;

    public static void releaseStatics(int param0) {
        if (param0 == -26441) {
          field_n = null;
          field_o = (int[][]) null;
          return;
        }
        field_o = (int[][]) null;
        field_n = null;
        field_o = (int[][]) null;
    }

    static int bitAnd(int param0, int param1) {
        return param0 & param1;
    }

    final static String getVisibleTooltipText(int param0) {
        if (param0 <= 71) {
          field_n = (String) null;
          if (StatefulWidgetRenderer.field_x) {
            return null;
          }
          if (OfflineLoginHelpers.field_d > LevelSelectScreen.field_m) {
            return null;
          }
          if (!(OfflineLoginHelpers.field_d + TextWidgetPainter.field_k <= LevelSelectScreen.field_m)) {
            return AchievementBanner.field_m;
          }
          return null;
        }
        if (StatefulWidgetRenderer.field_x) {
          return null;
        }
        if (OfflineLoginHelpers.field_d > LevelSelectScreen.field_m) {
          return null;
        }
        if (!(OfflineLoginHelpers.field_d + TextWidgetPainter.field_k <= LevelSelectScreen.field_m)) {
          return AchievementBanner.field_m;
        }
        return null;
    }

    final static void drawTutorialTip(int param0) {
        int var1 = 0;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var1Lifetime1;
        int var1Lifetime2;
        int var2Lifetime1;
        int var2Lifetime2;
        int var3Lifetime1;
        int var3Lifetime2;
        int var4Lifetime1;
        int var4Lifetime2;
        if (PendingFlagRequest.field_h) {
          if (param0 != 0) {
            TextHotspotRegion.releaseStatics(-13);
          }
          if (!(HighscoresScreen.field_o <= 0)) {
            var1 = 7 * DropdownList.field_P / 8;
            var2 = SpriteFadeHelpers.field_b + 100;
            var3 = var2 + (-HighscoresScreen.field_o + 400 >> 1);
            var4 = 40 + HighscoresScreen.field_o;
            Rasterizer.setClip(var3, var1 - Alien.field_bb, var4 + var3, var1);
            Rasterizer.fillRectangleBlended(var3, var1 - Alien.field_bb, var4, Alien.field_bb, 2560, 160);
            SpriteEffectHelpers.drawTransparent(BlastAffectedObject.field_j, var2, -Alien.field_bb + var1, 192);
            ByteArrayPool.field_a.drawTransparent(var2, -Alien.field_bb + var1);
            ByteArrayPool.field_a.drawVerticalFlip(var2, var1 - 5);
            GameWorld.field_x.drawTransparent(var3, var1 - Alien.field_bb);
            GameWorld.field_x.drawMirrored(var4 + (var3 - 5), -Alien.field_bb + var1);
            IntrusiveDeque.field_a[0].drawTransparent(var3, var1 - Alien.field_bb);
            IntrusiveDeque.field_a[1].drawTransparent(-5 + var3 + var4, var1 - Alien.field_bb);
            IntrusiveDeque.field_a[2].drawTransparent(var3, -5 + var1);
            IntrusiveDeque.field_a[3].drawTransparent(var3 + var4 - 5, -5 + var1);
            CacheEntry.field_q.drawParagraph(MeshDepthBuckets.field_c, 20 + var2, -10 + var1 + (-Alien.field_bb + 20), 400, -40 + Alien.field_bb - 4, 16777215, 0, 0, 2, 0);
            CacheEntry.field_q.drawStringCentered(MusicPatchPcmStream.field_o, 300 + var2, var1 - 14, 10066329, 0);
            Rasterizer.resetClip();
          }
          return;
        }
        if (MusicPatch.field_r == -2) {
          if (param0 != 0) {
            TextHotspotRegion.releaseStatics(-13);
          }
          if (!(HighscoresScreen.field_o <= 0)) {
            var1Lifetime1 = 7 * DropdownList.field_P / 8;
            var2Lifetime1 = SpriteFadeHelpers.field_b + 100;
            var3Lifetime1 = var2Lifetime1 + (-HighscoresScreen.field_o + 400 >> 1);
            var4Lifetime1 = 40 + HighscoresScreen.field_o;
            Rasterizer.setClip(var3Lifetime1, var1Lifetime1 - Alien.field_bb, var4Lifetime1 + var3Lifetime1, var1Lifetime1);
            Rasterizer.fillRectangleBlended(var3Lifetime1, var1Lifetime1 - Alien.field_bb, var4Lifetime1, Alien.field_bb, 2560, 160);
            SpriteEffectHelpers.drawTransparent(BlastAffectedObject.field_j, var2Lifetime1, -Alien.field_bb + var1Lifetime1, 192);
            ByteArrayPool.field_a.drawTransparent(var2Lifetime1, -Alien.field_bb + var1Lifetime1);
            ByteArrayPool.field_a.drawVerticalFlip(var2Lifetime1, var1Lifetime1 - 5);
            GameWorld.field_x.drawTransparent(var3Lifetime1, var1Lifetime1 - Alien.field_bb);
            GameWorld.field_x.drawMirrored(var4Lifetime1 + (var3Lifetime1 - 5), -Alien.field_bb + var1Lifetime1);
            IntrusiveDeque.field_a[0].drawTransparent(var3Lifetime1, var1Lifetime1 - Alien.field_bb);
            IntrusiveDeque.field_a[1].drawTransparent(-5 + var3Lifetime1 + var4Lifetime1, var1Lifetime1 - Alien.field_bb);
            IntrusiveDeque.field_a[2].drawTransparent(var3Lifetime1, -5 + var1Lifetime1);
            IntrusiveDeque.field_a[3].drawTransparent(var3Lifetime1 + var4Lifetime1 - 5, -5 + var1Lifetime1);
            CacheEntry.field_q.drawParagraph(MeshDepthBuckets.field_c, 20 + var2Lifetime1, -10 + var1Lifetime1 + (-Alien.field_bb + 20), 400, -40 + Alien.field_bb - 4, 16777215, 0, 0, 2, 0);
            CacheEntry.field_q.drawStringCentered(MusicPatchPcmStream.field_o, 300 + var2Lifetime1, var1Lifetime1 - 14, 10066329, 0);
            Rasterizer.resetClip();
          }
          return;
        }
        if (MusicPatch.field_r != -3) {
          return;
        }
        if (param0 != 0) {
          TextHotspotRegion.releaseStatics(-13);
        }
        if (!(HighscoresScreen.field_o <= 0)) {
          var1Lifetime2 = 7 * DropdownList.field_P / 8;
          var2Lifetime2 = SpriteFadeHelpers.field_b + 100;
          var3Lifetime2 = var2Lifetime2 + (-HighscoresScreen.field_o + 400 >> 1);
          var4Lifetime2 = 40 + HighscoresScreen.field_o;
          Rasterizer.setClip(var3Lifetime2, var1Lifetime2 - Alien.field_bb, var4Lifetime2 + var3Lifetime2, var1Lifetime2);
          Rasterizer.fillRectangleBlended(var3Lifetime2, var1Lifetime2 - Alien.field_bb, var4Lifetime2, Alien.field_bb, 2560, 160);
          SpriteEffectHelpers.drawTransparent(BlastAffectedObject.field_j, var2Lifetime2, -Alien.field_bb + var1Lifetime2, 192);
          ByteArrayPool.field_a.drawTransparent(var2Lifetime2, -Alien.field_bb + var1Lifetime2);
          ByteArrayPool.field_a.drawVerticalFlip(var2Lifetime2, var1Lifetime2 - 5);
          GameWorld.field_x.drawTransparent(var3Lifetime2, var1Lifetime2 - Alien.field_bb);
          GameWorld.field_x.drawMirrored(var4Lifetime2 + (var3Lifetime2 - 5), -Alien.field_bb + var1Lifetime2);
          IntrusiveDeque.field_a[0].drawTransparent(var3Lifetime2, var1Lifetime2 - Alien.field_bb);
          IntrusiveDeque.field_a[1].drawTransparent(-5 + var3Lifetime2 + var4Lifetime2, var1Lifetime2 - Alien.field_bb);
          IntrusiveDeque.field_a[2].drawTransparent(var3Lifetime2, -5 + var1Lifetime2);
          IntrusiveDeque.field_a[3].drawTransparent(var3Lifetime2 + var4Lifetime2 - 5, -5 + var1Lifetime2);
          CacheEntry.field_q.drawParagraph(MeshDepthBuckets.field_c, 20 + var2Lifetime2, -10 + var1Lifetime2 + (-Alien.field_bb + 20), 400, -40 + Alien.field_bb - 4, 16777215, 0, 0, 2, 0);
          CacheEntry.field_q.drawStringCentered(MusicPatchPcmStream.field_o, 300 + var2Lifetime2, var1Lifetime2 - 14, 10066329, 0);
          Rasterizer.resetClip();
        }
    }

    TextHotspotRegion(int param0, int param1, int param2, int param3, int param4) {
        this.field_j = param3;
        this.field_k = param2;
        this.field_l = param0;
        this.field_i = param1;
        this.field_m = param4;
    }

    static {
        field_n = null;
    }
}
