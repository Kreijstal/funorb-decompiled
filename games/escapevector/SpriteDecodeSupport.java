/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class SpriteDecodeSupport {
    static String field_e;
    static java.awt.Canvas field_d;
    static int field_c;
    static ValidationState field_f;
    static boolean field_b;
    static Sprite field_a;
    static NineSliceFrame field_g;
    static PcmSample field_h;

    final static Sprite solidSprite(int color, byte guard, int size) {
        int var6 = EscapeVector.obfuscationControl;
        Sprite var7 = new Sprite(size, size);
        Sprite var3 = var7;
        int var4 = 92 % ((guard - 15) / 58);
        for (int var5 = 0; var5 < var3.pixels.length; var5++) {
          var7.pixels[var5] = color;
        }
        return var3;
    }

    final static boolean isAsciiLetter(char character, byte guard) {
        if (guard < 28) {
          SpriteDecodeSupport.isAsciiLetter('ﾱ', (byte) 49);
        }
        boolean stackIn_10_0 = ((!(65 > character) &&
          !(90 < character)) ||
          (!(character < 97) &&
          !(122 < character)));
        return stackIn_10_0;
    }

    final static boolean commonUiReady(ResourceArchive firstArchive, ResourceArchive secondArchive, ResourceArchive buttons, byte guard) {
        String stackIn_22_2 = null;
        String stackIn_25_2 = null;
        String stackIn_28_2 = null;
        try {
          if (!firstArchive.ensureIndex(0)) {
            return false;
          }
          if (!firstArchive.tryLoadNamedGroup(0, "commonui")) {
            return false;
          }
          if (secondArchive.ensureIndex(0) &&
            secondArchive.tryLoadNamedGroup(0, "commonui")) {
            if (buttons.ensureIndex(0) &&
              buttons.tryLoadNamedGroup(0, "button.gif")) {
              if (guard > -1) {
                field_h = (PcmSample) null;
              }
              return true;
            }
            return false;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var4 = decompiledCaughtException;
          RuntimeException stackIn_21_0 = var4;
          StringBuilder stackIn_21_1 = new StringBuilder().append("of.F(");
          if (firstArchive == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          StringBuilder stackIn_24_1 = ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(',');
          if (secondArchive == null) {
            stackIn_25_2 = "null";
          } else {
            stackIn_25_2 = "{...}";
          }
          StringBuilder stackIn_27_1 = ((StringBuilder) (Object) stackIn_24_1).append(stackIn_25_2).append(',');
          if (buttons == null) {
            stackIn_28_2 = "null";
          } else {
            stackIn_28_2 = "{...}";
          }
          throw MainMenuScreen.wrapClientException((Throwable) ((Object) stackIn_21_0), ((StringBuilder) (Object) stackIn_27_1).append(stackIn_28_2).append(',').append(guard).append(')').toString());
        }
    }

    final static NameAvailabilityResult pollNameAvailability(int guard, String name) {
        String stackIn_14_2 = null;
        try {
          if (guard != 122) {
            SpriteDecodeSupport.isAsciiLetter('o', (byte) -83);
          }
          if (MeshMaterial.field_b == EmailAvailabilityValidator.field_o) {
            return null;
          }
          if (TriangleMesh.field_y == MeshMaterial.field_b &&
            name.equals(SpriteStrip.field_j)) {
            MeshMaterial.field_b = RasterBuffer.field_g;
            NameAvailabilityResult stackIn_8_0 = InputGlyphSupport.field_a;
            return stackIn_8_0;
          }
          SpriteStrip.field_j = name;
          InputGlyphSupport.field_a = null;
          MeshMaterial.field_b = EmailAvailabilityValidator.field_o;
          Object stackIn_10_0 = null;
          return (NameAvailabilityResult) (stackIn_10_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var2 = decompiledCaughtException;
          RuntimeException stackIn_13_0 = var2;
          StringBuilder stackIn_13_1 = new StringBuilder().append("of.B(").append(guard).append(',');
          if (name == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw MainMenuScreen.wrapClientException((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(')').toString());
        }
    }

    final static void releaseSpriteSheet(boolean guard) {
        if (guard) {
          SpriteDecodeSupport.releaseStatics(89);
        }
        ChatMessage.spriteOffsetYs = null;
        ModeProgress.spriteOffsetXs = null;
        AnimatedPathMarker.spriteIndices = (byte[][]) null;
        SavedDataQuerySupport.spriteHeights = null;
        ArchiveLoadTask.spritePalette = null;
        SpriteLoadTask.spriteWidths = null;
    }

    final static int mouseIdleTicks(byte guard) {
        if (guard >= -72) {
          SpriteDecodeSupport.releaseStatics(-52);
        }
        return AlphaContainer.mouseIdleTicks;
    }

    public static void releaseStatics(int guard) {
        if (guard != 122) {
          return;
        }
        field_e = null;
        field_a = null;
        field_d = null;
        field_h = null;
        field_g = null;
        field_f = null;
    }

    static {
        field_e = "Start Game";
        field_c = 70;
        field_f = new ValidationState();
    }
}
