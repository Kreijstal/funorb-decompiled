/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class GameCanvasResizeListener implements CanvasResizeListener {
    static ContentTransitionPhase field_a;

    public static void clearSharedReferences(int param0) {
        if (param0 != 2) {
          field_a = (ContentTransitionPhase) null;
          field_a = null;
          return;
        }
        field_a = null;
    }

    public final void onSizeChanged(int param0, int param1, int param2) {
        int var4 = 103 / ((22 - param0) / 42);
        CachedByteArray.setGameCanvasSize(param2, param1, (byte) -95);
    }

    final static String a(int param0, String param1, String param2, byte param3) {
        RuntimeException var4 = null;
        IsaacPacketBuffer var5 = null;
        int var6 = 0;
        SocialListEntry var7 = null;
        CharSequence var8 = null;
        String stackIn_3_0 = null;
        String stackIn_6_0 = null;
        String stackIn_10_0 = null;
        Object stackIn_14_0 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var8 = (CharSequence) ((Object) param2);
          if (!ChatPanelUpdater.isValidNormalizablePlayerName(var8, (byte) -114)) {
            stackIn_3_0 = QuickChatMenuWidget.field_Cb;
            return stackIn_3_0;
          }
          if (2 != iwa.field_b) {
            stackIn_6_0 = CarouselPlayerEventFactory.field_b;
            return stackIn_6_0;
          }
          var7 = CarouselPlayerEventFactory.a(param1, false);
          if (var7 == null) {
            stackIn_10_0 = SetReverbGain.a(DisplayModeErrorDialog.field_L, new String[]{param1}, 122);
            return stackIn_10_0;
          }
          var7.unlink(param3 ^ 3918);
          var7.unlinkSecondary((byte) -35);
          OpenGlIndexBuffer.field_k = OpenGlIndexBuffer.field_k - 1;
          var5 = RequestNewestBlackboxRecording.field_p;
          if (param3 != -76) {
            GameCanvasResizeListener.clearSharedReferences(76);
          }
          var5.writeIsaacByte(24335, param0);
          var5.position = var5.position + 1;
          var6 = var5.position;
          var5.writeByte(param3 ^ -76, 3);
          var5.writeString(true, param2);
          var5.writeLengthByte(var5.position - var6, param3 - 53);
          stackIn_14_0 = null;
          return (String) (stackIn_14_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_17_0 = var4;
          stackIn_17_1 = new StringBuilder().append("iab.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          stackIn_20_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',');
          if (param2 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(',').append(param3).append(')').toString());
        }
    }

    static {
        field_a = new ContentTransitionPhase();
    }
}
