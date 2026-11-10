/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class ByteStorage {
    static String[] field_f;
    static int field_e;
    static String field_b;
    static int field_d;
    static String field_a;
    static String[] field_c;

    abstract byte[] getBytes(int param0);

    final static void initializeChatInterface(ResourceArchive param0, ResourceArchive param1, int param2, boolean param3) {
        try {
          ChatPanelSetupHelpers.buildChatPanelComponents(LobbyRequestHelpers.field_b, PasswordTextPainter.field_B, PhantomDecoy.field_L, ArchiveRequest.field_u, IntroScreen.field_m, PendingIntArrayReply.field_j, param3, TextLayoutLine.field_f, 16736511, NodeHashTableIterator.field_g, HudSpriteStore.field_d, SpriteState.field_v);
          AudioServiceHelpers.field_j = EffectAudioHelpers.loadSpritesByName("lobby", param1, param2 ^ -256, "chatfilter");
          RankingsRequest.field_h[2] = SpriteDecodeGlobals.field_h;
          RankingsRequest.field_h[1] = BufferedFile.field_p;
          RankingsRequest.field_h[param2] = DisplayNameRequestHelpers.field_a;
          SocketJs5Transport.initializeQuickChat(param0, (byte) -37, PropObject.field_G);
        } catch (RuntimeException runtimeException) {
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) runtimeException), "t.A(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ')');
        }
    }

    final static int getKeyboardIdleTicks(int param0) {
        int var1 = -9 / ((param0 + 67) / 57);
        return BirthDateInputWidget.field_cb;
    }

    public static void releaseStatics(byte param0) {
        field_a = null;
        field_f = null;
        field_c = null;
        field_b = null;
        int var1 = -70 % ((param0 - 50) / 35);
    }

    final static void drawRasterToCanvas(boolean param0, int param1, java.awt.Canvas param2, int param3) {
        java.awt.Graphics var4 = null;
        Exception var4_ref = null;
        RuntimeException var4_ref2 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        Throwable decompiledCaughtException = null;
        try {
          try {
            var4 = param2.getGraphics();
            SocketConnector.field_h.drawTo(param1, var4, 2, param3);
            var4.dispose();
            if (!param0) {
              return;
            }
            field_a = (String) null;
            return;
          } catch (java.lang.Exception decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var4_ref = (Exception) (Object) decompiledCaughtException;
            param2.repaint();
            return;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          var4_ref2 = (RuntimeException) (Object) decompiledCaughtException;
          stackIn_7_0 = var4_ref2;
          stackIn_7_1 = new StringBuilder().append("t.B(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param3).append(')').toString());
        }
    }

    abstract void setBytes(byte[] param0, byte param1);

    static {
        field_f = new String[]{null, "to discard it and<nbsp>continue.", "to discard it and<nbsp>continue.", "to discard them and<nbsp>continue.", "to discard them and<nbsp>continue.", "to discard them and<nbsp>continue.", "to discard them and<nbsp>continue.", "to discard them and<nbsp>continue."};
        field_a = "Chat is currently disabled.";
        field_b = "FULL ACCESS";
    }
}
