/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ValidationState {
    static boolean field_b;
    static int field_a;

    final static SpriteOffset rotatedObjectOffset(int angle, int quarterTurn) {
        if (AccountPanelInputSupport.field_d == null) {
          return null;
        }
        if (0 == angle) {
          return AccountPanelInputSupport.field_d[0];
        }
        if (angle == quarterTurn) {
          return AccountPanelInputSupport.field_d[1];
        }
        if (angle == 32768) {
          return AccountPanelInputSupport.field_d[2];
        }
        if (angle == 49152) {
          return AccountPanelInputSupport.field_d[3];
        }
        return null;
    }

    final static void configureLegacyMenuFrames(NineSliceFrame normalFrame, int verticalPadding, int lineSpacing, int guard, NineSliceFrame selectedFrame, int horizontalPadding) {
        CheckboxPainter.field_s = lineSpacing;
        AnimatedPanelFrame.field_e = selectedFrame;
        MembershipPromotionScreen.field_k = horizontalPadding;
        AchievementTracker.field_k = verticalPadding;
        if (guard != 3) {
          return;
        }
        try {
          SpriteDecodeSupport.field_g = normalFrame;
        } catch (RuntimeException runtimeException) {
          throw MainMenuScreen.wrapClientException((Throwable) ((Object) runtimeException), "rf.B(" + (normalFrame != null ? "{...}" : "null") + ',' + verticalPadding + ',' + lineSpacing + ',' + guard + ',' + (selectedFrame != null ? "{...}" : "null") + ',' + horizontalPadding + ')');
        }
    }

    final static IndexedSprite copyIndexedSpriteWithPalette(int guard, IndexedSprite sprite, int[] palette) {
        String stackIn_7_2 = null;
        String stackIn_10_2 = null;
        try {
          IndexedSprite var3 = new IndexedSprite(0, 0, 0);
          if (guard > -15) {
            field_a = 60;
          }
          var3.field_a = sprite.field_a;
          var3.field_k = sprite.field_k;
          var3.field_g = sprite.field_g;
          var3.field_i = sprite.field_i;
          var3.field_l = palette;
          var3.field_h = sprite.field_h;
          var3.field_f = sprite.field_f;
          var3.field_d = sprite.field_d;
          IndexedSprite stackIn_3_0 = var3;
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var3_ref = decompiledCaughtException;
          RuntimeException stackIn_6_0 = var3_ref;
          StringBuilder stackIn_6_1 = new StringBuilder().append("rf.A(").append(guard).append(',');
          if (sprite == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          StringBuilder stackIn_9_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',');
          if (palette == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw MainMenuScreen.wrapClientException((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(')').toString());
        }
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    static {
        field_b = true;
        field_a = -1;
    }
}
