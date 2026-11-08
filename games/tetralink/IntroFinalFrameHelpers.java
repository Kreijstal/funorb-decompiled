/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class IntroFinalFrameHelpers {
    static String field_a;
    static String field_c;
    static int[] field_d;
    static boolean field_b;
    static String field_e;

    final static void loadSplitFinalFrameSprites(int param0, Archive param1) {
        Sprite var2 = null;
        int var3 = 0;
        int var4 = 0;
        try {
          var2 = new Sprite(param1.getFileByName("final_frame.jpg", "", true), (java.awt.Component) ((Object) GameClock.field_b));
          var3 = var2.field_u;
          var4 = var2.field_E;
          ReflectionCheck.pushRasterState((byte) 45);
          ClientProtocolStage.field_c = new Sprite(var3, var4 * param0 / 4);
          ClientProtocolStage.field_c.makeRasterTarget();
          var2.drawOpaque(0, 0);
          ChatPanelHelpers.field_c = new Sprite(var3, var4 - ClientProtocolStage.field_c.field_E);
          ChatPanelHelpers.field_c.makeRasterTarget();
          var2.drawOpaque(0, -ClientProtocolStage.field_c.field_E);
          ChatPanelHelpers.field_c.field_D = ClientProtocolStage.field_c.field_E;
          LruTextureCache.popRaster(-581);
        } catch (RuntimeException runtimeException) {
          throw IndexedSpriteState.wrapException((Throwable) ((Object) runtimeException), "kj.B(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static String joinCharSequences(byte param0, CharSequence[] param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        String stackIn_1_0 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var2_int = 2 / ((param0 - 55) / 54);
          stackIn_1_0 = PopupAndStripHelpers.joinCharSequenceRange(param1, 0, param1.length, -2);
          return stackIn_1_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_4_0 = var2;
          stackIn_4_1 = new StringBuilder().append("kj.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          throw IndexedSpriteState.wrapException((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(')').toString());
        }
    }

    final static void resetMessageRateLimiter(byte param0) {
        FontAndBrightnessHelpers.field_g = ClockAndTextHelpers.monotonicMillis(0);
        if (param0 != 45) {
          return;
        }
        ConnectionTimingHelpers.field_b = 0;
    }

    public static void releaseStatics(int param0) {
        if (param0 == 0) {
          field_d = null;
          field_c = null;
          field_e = null;
          field_a = null;
          return;
        }
        field_b = true;
        field_d = null;
        field_c = null;
        field_e = null;
        field_a = null;
    }

    final static void setPointerAnchor(byte param0, int param1, int param2) {
        AccountServerResult.field_e = param1;
        if (param0 != -77) {
          Archive var4 = (Archive) null;
          IntroFinalFrameHelpers.loadSplitFinalFrameSprites(43, (Archive) null);
          UiComponent.field_cb = param2;
          return;
        }
        UiComponent.field_cb = param2;
    }

    static {
        field_a = "End Game";
        field_c = "You appear to be telling someone your password - please don't!";
        field_e = "This option cannot be combined with the current settings for:  ";
        field_b = true;
    }
}
