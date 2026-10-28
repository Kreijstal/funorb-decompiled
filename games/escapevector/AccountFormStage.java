/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class AccountFormStage {
    static int[] field_f;
    static int[] field_a;
    static LoginStage field_d;
    static PcmSample field_b;
    static long field_e;
    static String field_c;

    final static int availableGameMode(int mode, int guard) {
        mode = AccountChoicePanel.a(guard - 34966, mode);
        if (mode < 0) {
          return -1;
        }
        if (mode == 1) {
          return 1;
        }
        if (mode == 0) {
          return 0;
        }
        if (mode == 2) {
          return 2;
        }
        if (mode == 3) {
          return 3;
        }
        if (guard != 26504) {
          SystemTaskService var3 = (SystemTaskService) null;
          AccountFormStage.createFullscreenCanvas(-101, -4, (SystemTaskService) null, 127, 70, -30);
        }
        return -1;
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    public static void releaseStatics(int guard) {
        field_b = null;
        field_a = null;
        field_d = null;
        if (guard > -1) {
          AccountFormStage.buildRgbSpriteFromSheet((byte) 104);
        }
        field_f = null;
        field_c = null;
    }

    final static Sprite buildRgbSpriteFromSheet(byte guard) {
        int var5 = EscapeVector.obfuscationControl;
        int var1 = SavedDataQuerySupport.spriteHeights[0] * SpriteLoadTask.spriteWidths[0];
        byte[] var2 = AnimatedPathMarker.spriteIndices[0];
        int[] var3 = new int[var1];
        for (int var4_int = 0; var4_int < var1; var4_int++) {
          var3[var4_int] = ArchiveLoadTask.spritePalette[SpriteCheckboxPainter.bitwiseAnd((int) var2[var4_int], 255)];
        }
        Sprite var4 = new Sprite(IntroAudioSupport.spriteSheetWidth, DelegatingCanvas.spriteSheetHeight, ModeProgress.spriteOffsetXs[0], ChatMessage.spriteOffsetYs[0], SpriteLoadTask.spriteWidths[0], SavedDataQuerySupport.spriteHeights[0], var3);
        SpriteDecodeSupport.releaseSpriteSheet(false);
        if (guard < 98) {
          field_a = (int[]) null;
        }
        return var4;
    }

    final static FullscreenFocusCanvas createFullscreenCanvas(int param0, int param1, SystemTaskService param2, int param3, int param4, int param5) {
        String stackIn_10_2 = null;
        try {
          java.awt.Frame var8 = IntrusiveNodeHashTable.a((byte) 93, param0, param3, param2, param4, param5);
          java.awt.Frame var6 = var8;
          if (var8 == null) {
            return null;
          }
          FullscreenFocusCanvas var7 = new FullscreenFocusCanvas();
          var7.field_d = var8;
          var7.field_d.add((java.awt.Component) ((Object) var7));
          if (param1 != -16493) {
            field_b = (PcmSample) null;
          }
          var7.setBounds(0, 0, param0, param3);
          var7.addFocusListener(var7);
          var7.requestFocus();
          FullscreenFocusCanvas stackIn_6_0 = var7;
          return stackIn_6_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var6_ref = decompiledCaughtException;
          RuntimeException stackIn_9_0 = var6_ref;
          StringBuilder stackIn_9_1 = new StringBuilder().append("al.D(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw MainMenuScreen.wrapClientException((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(')').toString());
        }
    }

    static {
        field_a = new int[256];
        field_f = new int[1024];
        for (int var1 = 0; var1 < 256; var1++) {
          int var0 = var1;
          for (int var2 = 0; var2 < 8; var2++) {
            var0 = ((var0 & 1) == 1) ? (-306674912 ^ var0 >>> 1) : (var0 >>> 1);
          }
          field_a[var1] = var0;
        }
        field_c = "If you do nothing the game will revert to normal view in <%0> seconds.";
    }
}
