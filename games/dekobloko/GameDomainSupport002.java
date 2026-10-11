/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class GameDomainSupport002 {
    static String stringState0141;
    String stringState0142;
    static String stringState0143;
    static int[] integerArrayState0035;
    int integerState0174;
    int integerState0175;
    int integerState0176;
    static String[] stringArrayState0010;
    static SceneWidgetPart008 sceneWidgetPart008State0002;
    static int integerState0177;
    int integerState0178;
    static String stringState0144;
    static BitmapFont bitmapFontState0012;
    static String stringState0145;
    int integerState0179;
    static String stringState0146;
    static SceneWidget sceneWidgetState0022;
    static int integerState0180;

    public static void performAction0443(byte byteArgument1) {
        sceneWidgetPart008State0002 = null;
        bitmapFontState0012 = null;
        sceneWidgetState0022 = null;
        if (byteArgument1 >= 78) {
          stringState0141 = null;
          integerArrayState0035 = null;
          stringState0143 = null;
          stringState0145 = null;
          stringState0146 = null;
          stringState0144 = null;
          stringArrayState0010 = null;
          return;
        }
    }

    final static void performAction0444(int integerArgument1) {
        int integerLocal1 = 0;
        RuntimeException caughtExceptionLocal2 = null;
        CipherPacketBuffer cipherPacketBufferLocal3 = null;
        RuntimeException runtimeExceptionLocal4 = null;
        int integerLocal5 = 0;
        int integerLocal6 = 0;
        integerLocal6 = DekoBlokoClient.obfuscationControl ? 1 : 0;
        try {
          cipherPacketBufferLocal3 = SocketFactory.cipherPacketBufferState0002;
          while (ProxySocketFactory.computeBoolean1682((byte) -104)) {
            cipherPacketBufferLocal3.performAction1861(8, -4);
            integerLocal1 = cipherPacketBufferLocal3.position + 1;
            cipherPacketBufferLocal3.position = cipherPacketBufferLocal3.position + 1;
            integerLocal5 = integerLocal1;
            ResourceSupport002.performAction0095(-32141, cipherPacketBufferLocal3);
            SocketFactory.cipherPacketBufferState0002.performAction2079(cipherPacketBufferLocal3.position - integerLocal5, true);
          }
          if (integerArgument1 <= -91) {
            return;
          }
          GameDomainSupport002.performAction0444(-123);
          return;
        } catch (java.lang.RuntimeException caughtParameterLocal7) {
          caughtExceptionLocal2 = caughtParameterLocal7;
          runtimeExceptionLocal4 = caughtExceptionLocal2;
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) runtimeExceptionLocal4), "ec.A(" + integerArgument1 + ')');
        }
    }

    GameDomainSupport002(int integerArgument1, String stringArgument2, BitmapFont bitmapFontArgument3) {
        try {
          this.integerState0179 = integerArgument1;
          this.stringState0142 = stringArgument2;
          this.integerState0176 = bitmapFontArgument3.computeInteger1208(this.stringState0142) + 46;
          this.integerState0175 = 30;
        } catch (RuntimeException runtimeException) {
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) runtimeException), "ec.<init>(" + integerArgument1 + ',' + (stringArgument2 != null ? "{...}" : "null") + ',' + (bitmapFontArgument3 != null ? "{...}" : "null") + ')');
        }
    }

    GameDomainSupport002(int integerArgument1) {
        this.integerState0175 = 30;
        this.integerState0179 = integerArgument1;
    }

    static {
        stringState0141 = "(1 player wants to join)";
        stringState0143 = "Only show private chat from my friends and opponents";
        integerArrayState0035 = new int[8192];
        stringArrayState0010 = new String[]{"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
        stringState0145 = "Spectate <%0>'s game";
        stringState0144 = "You cannot join this game - it is in progress";
        stringState0146 = "Go Back";
    }
}
