/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class DecodedSpriteHelpers {
    static IntrusiveDeque field_a;
    static int field_b;
    static int field_c;

    final static void setFrameStyles(int param0, int param1, NineSliceFrame param2, NineSliceFrame param3, int param4, int param5) {
        DisplaySettingsDialog.field_Y = param0;
        AbstractSprite.field_i = param4;
        HighscoreSubmissionHelpers.field_b = param2;
        DualLinkNode.field_m = param1;
        if (param5 != -386) {
          return;
        }
        try {
          ScrollContainer.field_G = param3;
        } catch (RuntimeException runtimeException) {
          throw ExceptionWrapper.wrapException((Throwable) ((Object) runtimeException), "ro.B(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + (param3 != null ? "{...}" : "null") + ',' + param4 + ',' + param5 + ')');
        }
    }

    public static void releaseStatics(byte param0) {
        field_a = null;
        if (param0 > -26) {
          NineSliceFrame var2 = (NineSliceFrame) null;
          DecodedSpriteHelpers.setFrameStyles(66, -67, (NineSliceFrame) null, (NineSliceFrame) null, -121, 83);
        }
    }

    final static Sprite[] buildDecodedSprites(byte param0) {
        byte[] var11 = null;
        byte[] var10 = null;
        int var2 = 0;
        int var3 = 0;
        int[] var5 = null;
        int var6 = 0;
        int var7 = ZombieDawn.field_J;
        Sprite[] var1 = new Sprite[DialWidgetPainter.field_h];
        int[] var5Lifetime1;
        int var2Lifetime1;
        int var6Lifetime1;
        int var3Lifetime1;
        if (param0 == 110) {
          for (var2 = 0; DialWidgetPainter.field_h > var2; var2++) {
            var3 = RasterState.field_n[var2] * LongAndTextLoginPayload.field_c[var2];
            var11 = HighscoresScreen.field_m[var2];
            var5 = new int[var3];
            for (var6 = 0; var3 > var6; var6++) {
              var5[var6] = ArchiveLoadStep.field_a[TextHotspotRegion.bitAnd((int) var11[var6], 255)];
            }
            var1[var2] = new Sprite(FocusDelegatingButton.field_F, Zombie.field_pb, LogoPoseHelpers.field_d[var2], AchievementSubmission.field_o[var2], LongAndTextLoginPayload.field_c[var2], RasterState.field_n[var2], var5);
          }
          RopeLadder.clearSpriteDecodeBuffers((byte) -111);
          return var1;
        }
        field_a = (IntrusiveDeque) null;
        for (var2Lifetime1 = 0; DialWidgetPainter.field_h > var2Lifetime1; var2Lifetime1++) {
          var3Lifetime1 = RasterState.field_n[var2Lifetime1] * LongAndTextLoginPayload.field_c[var2Lifetime1];
          var10 = HighscoresScreen.field_m[var2Lifetime1];
          var5Lifetime1 = new int[var3Lifetime1];
          for (var6Lifetime1 = 0; var3Lifetime1 > var6Lifetime1; var6Lifetime1++) {
            var5Lifetime1[var6Lifetime1] = ArchiveLoadStep.field_a[TextHotspotRegion.bitAnd((int) var10[var6Lifetime1], 255)];
          }
          var1[var2Lifetime1] = new Sprite(FocusDelegatingButton.field_F, Zombie.field_pb, LogoPoseHelpers.field_d[var2Lifetime1], AchievementSubmission.field_o[var2Lifetime1], LongAndTextLoginPayload.field_c[var2Lifetime1], RasterState.field_n[var2Lifetime1], var5Lifetime1);
        }
        RopeLadder.clearSpriteDecodeBuffers((byte) -111);
        return var1;
    }

    static {
        field_a = new IntrusiveDeque();
        field_b = 10;
    }
}
