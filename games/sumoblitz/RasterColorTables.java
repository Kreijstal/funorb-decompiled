/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class RasterColorTables {
    static String[] field_f;
    static SpriteData[] field_b;
    static TextureTransformMode TEXTURE_COUNT4;
    static int[] bytePoolSizes;
    static int soundVolume;
    static int field_e;

    public static void releaseStatics(int param0) {
        field_f = null;
        TEXTURE_COUNT4 = null;
        bytePoolSizes = null;
        if (param0 > -58) {
          TEXTURE_COUNT4 = (TextureTransformMode) null;
          field_b = null;
          return;
        }
        field_b = null;
    }

    final static Sprite[] loadSprites(int guard, ResourceArchive archive, int fileId, int groupId) {
        RuntimeException var4 = null;
        Object stackIn_4_0 = null;
        Sprite[] stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (guard != 19889) {
            bytePoolSizes = (int[]) null;
          }
          if (SpriteSheetSupport.decodeSpriteSheet(archive, fileId, groupId, guard - 42935)) {
            stackIn_6_0 = NextLevelChoiceOverlay.takeDecodedSprites(-124);
            return stackIn_6_0;
          }
          stackIn_4_0 = null;
          return (Sprite[]) (stackIn_4_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_9_0 = var4;
          stackIn_9_1 = new StringBuilder().append("kr.B(").append(guard).append(',');
          if (archive == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(fileId).append(',').append(groupId).append(')').toString());
        }
    }

    final static void retainColorTables(boolean retainHsl, int guard, boolean retainHsv) {
        if (retainHsv) {
          Sumoblitz.hsvTableUsers = Sumoblitz.hsvTableUsers + 1;
          ArchiveProvider.initializeHsvColorTable(-129);
          if (guard > -16) {
            RasterColorTables.releaseStatics(28);
            if (retainHsl) {
              LoginMethodPreference.hslTableUsers = LoginMethodPreference.hslTableUsers + 1;
              LevelCompletionSupport.initializeHslColorTable((byte) -56);
            }
            return;
          }
          if (retainHsl) {
            LoginMethodPreference.hslTableUsers = LoginMethodPreference.hslTableUsers + 1;
            LevelCompletionSupport.initializeHslColorTable((byte) -56);
          }
          return;
        }
        if (guard <= -16) {
          if (retainHsl) {
            LoginMethodPreference.hslTableUsers = LoginMethodPreference.hslTableUsers + 1;
            LevelCompletionSupport.initializeHslColorTable((byte) -56);
          }
          return;
        }
        RasterColorTables.releaseStatics(28);
        if (retainHsl) {
          LoginMethodPreference.hslTableUsers = LoginMethodPreference.hslTableUsers + 1;
          LevelCompletionSupport.initializeHslColorTable((byte) -56);
        }
    }

    static {
        field_f = new String[]{null, "to discard it and<nbsp>continue.", "to discard it and<nbsp>continue.", "to discard them and<nbsp>continue.", "to discard them and<nbsp>continue.", "to discard them and<nbsp>continue.", "to discard them and<nbsp>continue.", "to discard them and<nbsp>continue."};
        TEXTURE_COUNT4 = new TextureTransformMode();
        field_e = 0;
        soundVolume = 256;
    }
}
