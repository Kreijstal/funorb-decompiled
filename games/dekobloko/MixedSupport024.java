/*
 * Decompiled by CFR-JS 0.4.0.
 */
class MixedSupport024 extends MixedSupport001 {
    static String stringState0115;
    static String stringState0116;
    private static int[] integerArrayState0032;
    static String stringState0117;
    static String stringState0118;
    static String stringState0119;
    static long longState0007;

    public static void performAction0403(int integerArgument1) {
        stringState0115 = null;
        stringState0119 = null;
        stringState0116 = null;
        stringState0117 = null;
        if (integerArgument1 > 44) {
          integerArrayState0032 = null;
          stringState0118 = null;
          return;
        }
        stringState0118 = (String) null;
        integerArrayState0032 = null;
        stringState0118 = null;
    }

    public final void performAction0018(boolean booleanArgument1, int integerArgument2, int integerArgument3, byte byteArgument4, UiComponent uiComponentArgument5) {
        if (booleanArgument1) {
          RenderingSupport008.performAction0965(uiComponentArgument5.integerState0110 + integerArgument2, integerArgument3 + uiComponentArgument5.integerState0104, uiComponentArgument5.integerState0107, uiComponentArgument5.integerState0108, (byte) 112);
        }
        if (byteArgument4 > -60) {
          return;
        }
        try {
          super.performAction0018(booleanArgument1, integerArgument2, integerArgument3, (byte) -120, uiComponentArgument5);
        } catch (RuntimeException runtimeException) {
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) runtimeException), "di.B(" + booleanArgument1 + ',' + integerArgument2 + ',' + integerArgument3 + ',' + byteArgument4 + ',' + (uiComponentArgument5 != null ? "{...}" : "null") + ')');
        }
    }

    final static boolean computeBoolean0402(boolean booleanArgument1) {
        if (booleanArgument1) {
          MixedSupport024.computeBoolean0402(false);
          if (null == GameSession.bufferedSocketState0002) {
            return false;
          }
          if (UiComponentPart023.mixedSupport139State0009.computeBoolean1900(22277)) {
            return true;
          }
          return false;
        }
        if (null == GameSession.bufferedSocketState0002) {
          return false;
        }
        if (UiComponentPart023.mixedSupport139State0009.computeBoolean1900(22277)) {
          return true;
        }
        return false;
    }

    MixedSupport024(BitmapFont bitmapFontArgument1, int integerArgument2) {
        super(bitmapFontArgument1, 4, 2, 2, 2, integerArgument2, -1, 0, 1, bitmapFontArgument1.integerState0518, -1, 2147483647, false);
    }

    MixedSupport024(int integerArgument1) {
        this(GameDomainSupport003.bitmapFontState0015, integerArgument1);
    }

    static {
        int integerLocal1 = 0;
        long longLocal2 = 0L;
        long longLocal3 = 0L;
        int integerLocal4 = 0;
        int integerLocal5 = 0;
        int integerLocal6 = 0;
        stringState0116 = "Solid shapes are sent to the next player!";
        stringState0115 = "Invalid Login or Password<br><br>For accounts created after the 24th of November 2010, please use your email address to log in.<br><br>Otherwise please log in with your username.";
        stringState0118 = "Accept invitation to <%0>'s game";
        stringState0117 = "Set up new unrated game";
        integerArrayState0032 = new int[98304];
        for (integerLocal1 = 92682; integerLocal1 >= 46341; integerLocal1--) {
          longLocal2 = (long)(-1 + (integerLocal1 << 1));
          longLocal3 = (long)(1 + (integerLocal1 << 1));
          integerLocal4 = (int)(-32768L + (longLocal3 * longLocal3 >> 18));
          integerLocal5 = (int)((longLocal2 * longLocal2 >> 18) - 32768L);
          if (!(integerArrayState0032.length > integerLocal4)) {
            integerLocal4 = integerArrayState0032.length - 1;
          }
          for (integerLocal6 = integerLocal5 < 0 ? 0 : integerLocal5; integerLocal4 >= integerLocal6; integerLocal6++) {
            integerArrayState0032[integerLocal6] = integerLocal1;
          }
        }
        stringState0119 = "Names should contain a maximum of 12 characters";
    }
}
