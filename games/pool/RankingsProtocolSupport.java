/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class RankingsProtocolSupport {
    static boolean field_a;
    static String muGameHasStarted;
    static String privatechatBlankareaExplanation;
    static ChatMessage[] field_e;
    static SceneNode field_c;
    static String sendPm;

    final static void resetAppletPreferences(boolean param0, java.applet.Applet param1) {
        try {
          NameEntryPopup.setSessionCookie(param1, -18788, "");
          if (param0) {
            RankingsProtocolSupport.releaseStatics((byte) 31);
          }
          DebouncedValidationProvider.reloadApplet(param1, (byte) -85);
        } catch (RuntimeException runtimeException) {
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) runtimeException), "wb.C(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static void sendRankingsRequest(RankingsRequest param0, int param1, byte param2) {
        CipherPacketBuffer var3 = null;
        if (param2 != -96) {
          return;
        }
        try {
          var3 = JaggrabDownloader.field_j;
          var3.writeCipheredOpcode(false, param1);
          var3.writeByte(param0.field_s, false);
          var3.writeByte(param0.field_o, false);
        } catch (RuntimeException runtimeException) {
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) runtimeException), "wb.B(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    public static void releaseStatics(byte param0) {
        field_e = null;
        if (param0 == 118) {
          field_c = null;
          privatechatBlankareaExplanation = null;
          sendPm = null;
          muGameHasStarted = null;
          return;
        }
        RankingsRequest var2 = (RankingsRequest) null;
        RankingsProtocolSupport.sendRankingsRequest((RankingsRequest) null, 39, (byte) 43);
        field_c = null;
        privatechatBlankareaExplanation = null;
        sendPm = null;
        muGameHasStarted = null;
    }

    static {
        field_a = true;
        muGameHasStarted = "This game has started.";
        privatechatBlankareaExplanation = "This private message is prefixed with \"<col=9090FF>To <%1>:</col>\" on your screen.<br>On <%1>'s screen, it will be prefixed with \"<col=FF6060>From <%0>:</col>\", which is<br>a different length and may leave less room for the message itself.<br><br>This shading covers the area which is not available on <%1>'s screen.<br>Provided your message fits to the left of the shaded area,<br><%1> should be able to see it in full.<br><br>(Note: this may be inaccurate if <%1> is playing in a different<br>language from you.)";
        sendPm = "Send private message";
    }
}
