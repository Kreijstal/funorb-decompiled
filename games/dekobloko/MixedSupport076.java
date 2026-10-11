/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class MixedSupport076 extends HashNode {
    int integerState0408;
    int integerState0409;
    static String stringState0320;
    int integerState0410;
    long longState0024;
    int integerState0411;
    int[] integerArrayState0139;
    int integerState0412;
    int integerState0413;
    static SceneWidget sceneWidgetState0071;
    int integerState0414;
    static SceneWidget sceneWidgetState0072;

    public static void performAction1038(int integerArgument1) {
        sceneWidgetState0071 = null;
        sceneWidgetState0072 = null;
        if (integerArgument1 != -1) {
          MixedSupport076.performAction1038(11);
          stringState0320 = null;
          return;
        }
        stringState0320 = null;
    }

    final static void performAction1039(BitmapFont bitmapFontArgument1, byte byteArgument2, int integerArgument3, String stringArgument4, int integerArgument5, int integerArgument6) {
        int integerLocal1 = 0;
        if (byteArgument2 != -39) {
          return;
        }
        try {
          integerLocal1 = 2;
          if (UiComponentPart029.renderingSupport010State0005 == bitmapFontArgument1) {
            integerLocal1 = 1;
          }
          bitmapFontArgument1.performAction1228(stringArgument4, -integerLocal1 + integerArgument6, -integerLocal1 + integerArgument3, 0, -1);
          bitmapFontArgument1.performAction1228(stringArgument4, -integerLocal1 + integerArgument6, integerArgument3, 0, -1);
          bitmapFontArgument1.performAction1228(stringArgument4, -integerLocal1 + integerArgument6, integerArgument3 + integerLocal1, 0, -1);
          bitmapFontArgument1.performAction1228(stringArgument4, integerArgument6, -integerLocal1 + integerArgument3, 0, -1);
          bitmapFontArgument1.performAction1228(stringArgument4, integerArgument6, integerArgument3 + integerLocal1, 0, -1);
          bitmapFontArgument1.performAction1228(stringArgument4, integerArgument6 + integerLocal1, -integerLocal1 + integerArgument3, 0, -1);
          bitmapFontArgument1.performAction1228(stringArgument4, integerLocal1 + integerArgument6, integerArgument3, 0, -1);
          bitmapFontArgument1.performAction1228(stringArgument4, integerLocal1 + integerArgument6, integerLocal1 + integerArgument3, 0, -1);
          if (SceneWidget.renderingSupport010State0007 == bitmapFontArgument1) {
            bitmapFontArgument1.performAction1228(stringArgument4, 1 + integerArgument6, integerArgument3 - integerLocal1, 0, -1);
            bitmapFontArgument1.performAction1228(stringArgument4, -1 + integerArgument6, integerArgument3 - integerLocal1, 0, -1);
            bitmapFontArgument1.performAction1228(stringArgument4, integerLocal1 + integerArgument6, -1 + integerArgument3, 0, -1);
            bitmapFontArgument1.performAction1228(stringArgument4, -integerLocal1 + integerArgument6, -1 + integerArgument3, 0, -1);
            bitmapFontArgument1.performAction1228(stringArgument4, integerLocal1 + integerArgument6, integerArgument3 + 1, 0, -1);
            bitmapFontArgument1.performAction1228(stringArgument4, -integerLocal1 + integerArgument6, 1 + integerArgument3, 0, -1);
            bitmapFontArgument1.performAction1228(stringArgument4, integerArgument6 + 1, integerLocal1 + integerArgument3, 0, -1);
            bitmapFontArgument1.performAction1228(stringArgument4, -1 + integerArgument6, integerArgument3 + integerLocal1, 0, -1);
          }
          bitmapFontArgument1.performAction1228(stringArgument4, integerArgument6, integerArgument3, integerArgument5, -1);
        } catch (RuntimeException runtimeException) {
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) runtimeException), "kn.B(" + (bitmapFontArgument1 != null ? "{...}" : "null") + ',' + byteArgument2 + ',' + integerArgument3 + ',' + (stringArgument4 != null ? "{...}" : "null") + ',' + integerArgument5 + ',' + integerArgument6 + ')');
        }
    }

    MixedSupport076(int integerArgument1, int integerArgument2, int integerArgument3, int integerArgument4, int integerArgument5, int integerArgument6, int[] integerArrayArgument7) {
        int integerLocal1 = 0;
        try {
          integerLocal1 = PlatformSupport002.integerState0145;
          PlatformSupport002.integerState0145 = PlatformSupport002.integerState0145 + 1;
          this.integerState0411 = 65535 & integerLocal1;
          this.integerArrayState0139 = integerArrayArgument7;
          this.integerState0412 = integerArgument4;
          this.integerState0410 = integerArgument2;
          this.integerState0413 = integerArgument3;
          this.integerState0409 = integerArgument6;
          this.integerState0408 = integerArgument5;
          this.integerState0414 = integerArgument1;
        } catch (RuntimeException runtimeException) {
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) runtimeException), "kn.<init>(" + integerArgument1 + ',' + integerArgument2 + ',' + integerArgument3 + ',' + integerArgument4 + ',' + integerArgument5 + ',' + integerArgument6 + ',' + (integerArrayArgument7 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        stringState0320 = "<%0> must play <%1> more rated games before playing with the current options.";
    }
}
