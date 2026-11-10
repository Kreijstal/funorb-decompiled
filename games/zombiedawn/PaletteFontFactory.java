/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class PaletteFontFactory {
    static String field_b;
    static int[] field_a;

    public static void releaseStatics(int param0) {
        field_a = null;
        if (param0 != -20441) {
          PaletteFontFactory.releaseStatics(-73);
          field_b = null;
          return;
        }
        field_b = null;
    }

    final static PaletteBitmapFont createPaletteFont(byte param0, byte[] param1) {
        PaletteBitmapFont var2 = null;
        RuntimeException var2_ref = null;
        Object stackIn_2_0 = null;
        PaletteBitmapFont stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 == null) {
            stackIn_2_0 = null;
            return (PaletteBitmapFont) (stackIn_2_0);
          }
          var2 = new PaletteBitmapFont(param1, LogoPoseHelpers.field_d, AchievementSubmission.field_o, LongAndTextLoginPayload.field_c, RasterState.field_n, ArchiveLoadStep.field_a, HighscoresScreen.field_m);
          RopeLadder.clearSpriteDecodeBuffers((byte) -54);
          if (param0 >= -126) {
            PaletteFontFactory.releaseStatics(18);
          }
          stackIn_6_0 = var2;
          return stackIn_6_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          stackIn_9_0 = var2_ref;
          stackIn_9_1 = new StringBuilder().append("ua.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw ExceptionWrapper.wrapException((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(')').toString());
        }
    }

    static {
        field_b = "Menu";
        field_a = new int[]{19, 7};
    }
}
