/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class je {
    static int field_b;
    static IntrusiveDeque field_a;

    public static void releaseStatics(int guard) {
        int var1 = 86 / ((-10 - guard) / 57);
        field_a = null;
    }

    final static Sprite b(int param0) {
        Object var3 = null;
        int var7 = EscapeVector.obfuscationControl;
        Object var3Lifetime1;
        if (param0 > 44) {
          int var1 = qh.spriteWidths[0] * SavedDataQuerySupport.spriteHeights[0];
          byte[] var21 = qe.spriteIndices[0];
          if (UiContainer.spriteHasAlpha[0]) {
            byte[] var20 = CheckboxPainter.spriteAlphas[0];
            int[] var13 = new int[var1];
            int[] var11 = var13;
            int[] var5_ref_int__ = var11;
            for (int var6 = 0; var1 > var6; var6++) {
              var5_ref_int__[var6] = MatchingTextValidator.a(SpriteCheckboxPainter.bitwiseAnd(var20[var6] << 24, -16777216), qk.spritePalette[SpriteCheckboxPainter.bitwiseAnd((int) var21[var6], 255)]);
            }
            var3 = new ArgbSprite(on.spriteSheetWidth, DelegatingCanvas.spriteSheetHeight, gn.spriteOffsetXs[0], gi.spriteOffsetYs[0], qh.spriteWidths[0], SavedDataQuerySupport.spriteHeights[0], var13);
          } else {
            int[] var9 = new int[var1];
            for (int var5 = 0; var1 > var5; var5++) {
              var9[var5] = qk.spritePalette[SpriteCheckboxPainter.bitwiseAnd((int) var21[var5], 255)];
            }
            var3 = new Sprite(on.spriteSheetWidth, DelegatingCanvas.spriteSheetHeight, gn.spriteOffsetXs[0], gi.spriteOffsetYs[0], qh.spriteWidths[0], SavedDataQuerySupport.spriteHeights[0], var9);
          }
          of.a(false);
          return (Sprite) (var3);
        }
        je.releaseStatics(24);
        int var1Lifetime1 = qh.spriteWidths[0] * SavedDataQuerySupport.spriteHeights[0];
        byte[] var19 = qe.spriteIndices[0];
        if (UiContainer.spriteHasAlpha[0]) {
          byte[] var18 = CheckboxPainter.spriteAlphas[0];
          int[] var13Lifetime1 = new int[var1Lifetime1];
          int[] var11Lifetime1 = var13Lifetime1;
          int[] var5_ref_int__Lifetime1 = var11Lifetime1;
          for (int var6Lifetime1 = 0; var1Lifetime1 > var6Lifetime1; var6Lifetime1++) {
            var5_ref_int__Lifetime1[var6Lifetime1] = MatchingTextValidator.a(SpriteCheckboxPainter.bitwiseAnd(var18[var6Lifetime1] << 24, -16777216), qk.spritePalette[SpriteCheckboxPainter.bitwiseAnd((int) var19[var6Lifetime1], 255)]);
          }
          var3Lifetime1 = new ArgbSprite(on.spriteSheetWidth, DelegatingCanvas.spriteSheetHeight, gn.spriteOffsetXs[0], gi.spriteOffsetYs[0], qh.spriteWidths[0], SavedDataQuerySupport.spriteHeights[0], var13Lifetime1);
        } else {
          int[] var9Lifetime1 = new int[var1Lifetime1];
          for (int var5Lifetime1 = 0; var1Lifetime1 > var5Lifetime1; var5Lifetime1++) {
            var9Lifetime1[var5Lifetime1] = qk.spritePalette[SpriteCheckboxPainter.bitwiseAnd((int) var19[var5Lifetime1], 255)];
          }
          var3Lifetime1 = new Sprite(on.spriteSheetWidth, DelegatingCanvas.spriteSheetHeight, gn.spriteOffsetXs[0], gi.spriteOffsetYs[0], qh.spriteWidths[0], SavedDataQuerySupport.spriteHeights[0], var9Lifetime1);
        }
        of.a(false);
        return (Sprite) (var3Lifetime1);
    }

    final static int a(boolean param0, int param1) {
        if (param0) {
          je.b(13);
          if (AchievementRecord.a(param1, -102)) {
            return pc.a(2513, param1);
          }
          return 0;
        }
        if (AchievementRecord.a(param1, -102)) {
          return pc.a(2513, param1);
        }
        return 0;
    }

    final static void a(ResourceArchive param0, PcmStreamMixer param1, int param2, byte param3) {
        try {
          NodeHashTableIterator.field_h = se.a(0) * param2 / 1000;
          on.a(param0, -58);
          LoginForm.loadLogoMeshes(param0, (byte) 110);
          cj.a(0, param0);
          pa.a(-83);
          if (param3 < 80) {
            String var5 = (String) null;
            je.a(false, (String) null);
          }
          id.c(120);
          SocketConnector.field_d = 0 - NodeHashTableIterator.field_h;
        } catch (RuntimeException runtimeException) {
          throw t.a((Throwable) ((Object) runtimeException), "je.A(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ')');
        }
    }

    final static void a(boolean param0, String param1) {
        System.out.println("Error: " + ResizableModalPanel.replaceAllLiteral(param1, "%0a", (byte) 111, "\n"));
        if (param0) {
          String var3 = (String) null;
          je.a(false, (String) null);
        }
    }

    static {
        field_a = new IntrusiveDeque();
    }
}
