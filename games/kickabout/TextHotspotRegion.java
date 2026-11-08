/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class TextHotspotRegion extends IntrusiveNode {
    static int field_k;
    static byte[] field_h;
    static volatile boolean field_l;
    int height;
    int y;
    int x;
    int width;
    int hotspotId;
    TextHotspotRegion nextLineRegion;

    final static void drawContentTransition(byte param0, boolean param1) {
        if (param0 <= 21) {
          field_k = 101;
          ContentTransitionDialog.field_Y.draw(97, param1);
          return;
        }
        ContentTransitionDialog.field_Y.draw(97, param1);
    }

    final static double computeColorBoxVariance(byte param0, ColorQuantizationBox param1) {
        double var2_double = 0.0;
        RuntimeException var2 = null;
        double var4 = 0.0;
        double var6 = 0.0;
        double var8 = 0.0;
        double stackIn_2_0 = 0.0;
        double stackIn_4_0 = 0.0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var2_double = (double)NameSuggestionsPanel.colorBoxMoment(param1, GameModesHelpScreen.field_F, true);
          var4 = (double)NameSuggestionsPanel.colorBoxMoment(param1, IntrusiveDeque.field_g, true);
          var6 = (double)NameSuggestionsPanel.colorBoxMoment(param1, RenderedFootballer.field_fb, true);
          if (param0 <= 91) {
            stackIn_2_0 = 1.8026836499173446;
            return stackIn_2_0;
          }
          var8 = -IntTripleCommand.field_C[param1.field_c][param1.field_i][param1.field_k] + (IntTripleCommand.field_C[param1.field_c][param1.field_i][param1.field_e] + (IntTripleCommand.field_C[param1.field_c][param1.field_d][param1.field_k] + (-IntTripleCommand.field_C[param1.field_l][param1.field_i][param1.field_e] + (-IntTripleCommand.field_C[param1.field_l][param1.field_d][param1.field_k] + IntTripleCommand.field_C[param1.field_l][param1.field_d][param1.field_e]) + IntTripleCommand.field_C[param1.field_l][param1.field_i][param1.field_k] - IntTripleCommand.field_C[param1.field_c][param1.field_d][param1.field_e])));
          stackIn_4_0 = var8 - (var6 * var6 + (var4 * var4 + var2_double * var2_double)) / (double)NameSuggestionsPanel.colorBoxMoment(param1, RandomAccessCacheFile.field_i, true);
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_7_0 = var2;
          stackIn_7_1 = new StringBuilder().append("er.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw GameSoundEffect.wrapException((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(')').toString());
        }
    }

    final static int crc32Prefix(boolean param0, int param1, byte[] param2) {
        RuntimeException var3 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0) {
            field_l = false;
          }
          stackIn_3_0 = RotaryDialWidget.a(param1, -119, param2, 0);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("er.B(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw GameSoundEffect.wrapException((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    public static void releaseStatics(byte param0) {
        field_h = null;
        if (param0 != -94) {
          TextHotspotRegion.drawContentTransition((byte) -85, false);
        }
    }

    TextHotspotRegion(int param0, int param1, int param2, int param3, int param4) {
        this.y = param2;
        this.hotspotId = param0;
        this.x = param1;
        this.width = param3;
        this.height = param4;
    }

    static {
        field_l = true;
    }
}
