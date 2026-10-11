/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class MixedSupport131 {
    static UiComponentPart016 uiComponentPart016State0003;
    static RgbSprite rgbSpriteState0059;
    static int integerState0789;
    static String stringState0542;
    static String stringState0543;
    static int integerState0790;
    static String stringState0544;
    static String stringState0545;
    static int integerState0791;

    public static void performAction1835(int integerArgument1) {
        stringState0542 = null;
        stringState0543 = null;
        rgbSpriteState0059 = null;
        if (integerArgument1 == 23358) {
          stringState0544 = null;
          uiComponentPart016State0003 = null;
          stringState0545 = null;
          return;
        }
        integerState0790 = 32;
        stringState0544 = null;
        uiComponentPart016State0003 = null;
        stringState0545 = null;
    }

    final static void performAction1834(byte byteArgument1, String stringArgument2, long longArgument3) {
        CharSequence charSequenceLocal1 = null;
        try {
          MixedSupport029.stringState0149 = stringArgument2;
          int integerLocal2 = -67 % ((73 - byteArgument1) / 38);
          NetworkSupport010.integerState0585 = 2;
          charSequenceLocal1 = (CharSequence) ((Object) stringArgument2);
          TextLayout.stringState0081 = ComponentContainer.computeString1011(charSequenceLocal1, (byte) 2);
          LoginCredentials.booleanState0085 = true;
          MixedSupport043.longState0017 = longArgument3;
        } catch (RuntimeException runtimeException) {
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) runtimeException), "u.A(" + byteArgument1 + ',' + (stringArgument2 != null ? "{...}" : "null") + ',' + longArgument3 + ')');
        }
    }

    static {
        integerState0790 = -1;
        stringState0542 = "Multiplayer Rankings";
        stringState0544 = "Ask to join <%0>'s game";
        integerState0789 = 1;
        stringState0545 = "Breakfast";
        integerState0791 = 0;
    }
}
