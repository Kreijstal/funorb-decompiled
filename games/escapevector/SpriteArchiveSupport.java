/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class SpriteArchiveSupport {
    static int field_b;
    static String field_c;
    static int[] field_a;

    final static void showHighscoresScreen(boolean pointerDriven, int guard, boolean showSubmittedScore) {
        CheckboxPainter.field_n = true;
        if (guard == -1230) {
          LegacyWidgetStyle.field_N = null;
          int var3 = GzipDecoder.field_b;
          CanvasRenderSupport.field_a = new HighscoresScreen(showSubmittedScore, var3);
          int var4 = CanvasRenderSupport.field_a.actionCount(guard ^ -1209);
          HighscorePlayerRecord.field_d = new MenuInputState(var4);
          HighscorePlayerRecord.field_d.initializeSelection(100, pointerDriven, CanvasRenderSupport.field_a.hitTest(GzipDecoder.field_d, -1, UiContainer.field_y), IntroRasterSupport.initialHighscoreAction(0));
          return;
        }
        field_a = (int[]) null;
        LegacyWidgetStyle.field_N = null;
        int var3Lifetime1 = GzipDecoder.field_b;
        CanvasRenderSupport.field_a = new HighscoresScreen(showSubmittedScore, var3Lifetime1);
        int var4Lifetime1 = CanvasRenderSupport.field_a.actionCount(guard ^ -1209);
        HighscorePlayerRecord.field_d = new MenuInputState(var4Lifetime1);
        HighscorePlayerRecord.field_d.initializeSelection(100, pointerDriven, CanvasRenderSupport.field_a.hitTest(GzipDecoder.field_d, -1, UiContainer.field_y), IntroRasterSupport.initialHighscoreAction(0));
    }

    final static int pollLoginWithText(String param0, int param1, String param2, String param3, boolean param4, int param5, int param6) {
        String stackIn_7_2 = null;
        String stackIn_10_2 = null;
        String stackIn_13_2 = null;
        try {
          if (param6 != 0) {
            field_c = (String) null;
          }
          LoginText var7 = new LoginText(param0);
          LoginText var8 = new LoginText(param2);
          int stackIn_3_0 = SelfDestructEffects.a((byte) -32, param4, param3, var8, var7, param1, param5);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var7_ref = decompiledCaughtException;
          RuntimeException stackIn_6_0 = var7_ref;
          StringBuilder stackIn_6_1 = new StringBuilder().append("kh.B(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          StringBuilder stackIn_9_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          StringBuilder stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',');
          if (param3 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw MainMenuScreen.wrapClientException((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(')').toString());
        }
    }

    public static void releaseStatics(byte guard) {
        field_a = null;
        field_c = null;
        if (guard != 65) {
          field_b = -91;
        }
    }

    final static Sprite[] loadNamedSprites(ResourceArchive archive, byte guard, String groupName, String fileName) {
        String stackIn_5_2 = null;
        String stackIn_8_2 = null;
        String stackIn_11_2 = null;
        try {
          int var6 = 21 / ((guard - 62) / 60);
          int var4_int = archive.findGroupId(-1, groupName);
          int var5 = archive.findFileId(var4_int, fileName, true);
          Sprite[] stackIn_1_0 = ProgressRecord.loadSprites(var4_int, archive, var5, (byte) 75);
          return stackIn_1_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var4 = decompiledCaughtException;
          RuntimeException stackIn_4_0 = var4;
          StringBuilder stackIn_4_1 = new StringBuilder().append("kh.A(");
          if (archive == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          StringBuilder stackIn_7_1 = ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(',').append(guard).append(',');
          if (groupName == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          StringBuilder stackIn_10_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',');
          if (fileName == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw MainMenuScreen.wrapClientException((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }

    final static String repeatCharacter(int length, char character, byte guard) {
        int var5 = EscapeVector.obfuscationControl;
        char[] var6 = new char[length];
        char[] var3 = var6;
        if (guard >= 4) {
          for (int var4 = 0; length > var4; var4++) {
            var6[var4] = character;
          }
          return new String(var6);
        }
        SpriteArchiveSupport.releaseStatics((byte) -54);
        for (int var4Lifetime1 = 0; length > var4Lifetime1; var4Lifetime1++) {
          var6[var4Lifetime1] = character;
        }
        return new String(var6);
    }

    final static void addPointCloudIntensity(byte guard, int amount, int pixelIndex) {
        int var3 = (255 & RatingQuery.pointCloudRasterSprite.field_k[pixelIndex]) + amount;
        RatingQuery.pointCloudRasterSprite.field_k[pixelIndex] = (byte)MatchingTextValidator.a(var3, var3 << 23 >> 31);
        int var4 = -46 % ((-11 - guard) / 34);
    }

    static {
        field_b = 0;
        field_a = new int[12];
    }
}
