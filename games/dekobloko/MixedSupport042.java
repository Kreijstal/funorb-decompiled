/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class MixedSupport042 {
    static int[][] integerArrayArrayState0008;
    static String stringState0182;
    static RgbSprite rgbSpriteState0016;
    static String stringState0183;
    static SceneWidget sceneWidgetState0033;
    static String stringState0184;

    final static boolean computeBoolean0591(char characterArgument1, byte byteArgument2) {
        if (byteArgument2 != 23) {
          MixedSupport042.performAction0592(-17);
          if (48 > characterArgument1) {
            return false;
          }
          if (characterArgument1 <= 57) {
            return true;
          }
          return false;
        }
        if (48 > characterArgument1) {
          return false;
        }
        if (characterArgument1 <= 57) {
          return true;
        }
        return false;
    }

    public static void performAction0592(int integerArgument1) {
        integerArrayArrayState0008 = (int[][]) null;
        if (integerArgument1 == 29047) {
          stringState0182 = null;
          stringState0184 = null;
          rgbSpriteState0016 = null;
          sceneWidgetState0033 = null;
          stringState0183 = null;
          return;
        }
        stringState0182 = (String) null;
        stringState0182 = null;
        stringState0184 = null;
        rgbSpriteState0016 = null;
        sceneWidgetState0033 = null;
        stringState0183 = null;
    }

    final static int computeInteger0594(int integerArgument1, int integerArgument2, int integerArgument3, int integerArgument4, int integerArgument5) {
        int integerLocal1 = 0;
        int integerLocal2 = 0;
        int integerLocal3 = 0;
        int integerLocal4 = 255 & integerArgument4 >> 16;
        int integerLocal5 = 255 & integerArgument4 >> 8;
        int integerLocal6 = 255 & integerArgument4;
        int integerLocal7 = integerArgument1 >> 16 & 255;
        int integerLocal8 = (integerArgument1 & 65512) >> 8;
        int integerLocal9 = integerArgument1 & 255;
        if (integerArgument5 > 100) {
          if (integerArgument3 != 256) {
            integerLocal1 = integerArgument3 * ((-integerArgument2 + 256) * integerLocal4 + integerLocal7 * integerArgument2) >> 16;
            integerLocal2 = (integerLocal9 * integerArgument2 + (-integerArgument2 + 256) * integerLocal6) * integerArgument3 >> 16;
            integerLocal3 = integerArgument3 * (integerLocal8 * integerArgument2 + integerLocal5 * (256 - integerArgument2)) >> 16;
          } else {
            integerLocal3 = integerArgument2 * integerLocal8 + integerLocal5 * (256 - integerArgument2) >> 8;
            integerLocal2 = (256 - integerArgument2) * integerLocal6 + integerArgument2 * integerLocal9 >> 8;
            integerLocal1 = integerArgument2 * integerLocal7 + integerLocal4 * (-integerArgument2 + 256) >> 8;
          }
          return integerLocal1 << 16 | integerLocal3 << 8 | integerLocal2;
        }
        return 39;
    }

    final static RgbSprite[] computeRgbSpriteArray0593(int integerArgument1, int integerArgument2, int integerArgument3, int integerArgument4) {
        if (integerArgument4 == 32140) {
          return UiComponent.computeRgbSpriteArray0230(1, -109, integerArgument1, integerArgument3, integerArgument2);
        }
        MixedSupport042.computeInteger0594(-57, -94, 1, 10, -127);
        return UiComponent.computeRgbSpriteArray0230(1, -109, integerArgument1, integerArgument3, integerArgument2);
    }

    final static void performAction0596(int integerArgument1, SceneWidgetPart012 sceneWidgetPart012Argument2, SceneWidgetPart008 sceneWidgetPart008Argument3, int integerArgument4, int integerArgument5, int integerArgument6, int integerArgument7) {
        MixedSupport104 mixedSupport104Local1 = null;
        int integerLocal2 = 0;
        int integerLocal3 = 0;
        int integerLocal4 = 0;
        int integerLocal5 = 0;
        try {
          MixedSupport122.performAction1732(sceneWidgetPart012Argument2.stringState0532, (int[]) null, 89, sceneWidgetPart008Argument3, sceneWidgetPart012Argument2, sceneWidgetPart012Argument2.stringState0534, sceneWidgetPart012Argument2.longState0048, -1, -1);
          SceneWidget.mixedSupport104State0001.performAction1410(true, 29072);
          SceneWidget.mixedSupport104State0001.performAction1404(0, (byte) -43, (int[]) null);
          if (integerArgument6 >= -53) {
            MixedSupport042.computeInteger0590((byte) 105);
          }
          SceneWidget.mixedSupport104State0001.performAction1403(17);
          mixedSupport104Local1 = SceneWidget.mixedSupport104State0001;
          integerLocal2 = integerArgument4;
          integerLocal3 = integerArgument7;
          integerLocal4 = integerArgument5;
          integerLocal5 = integerArgument1;
          mixedSupport104Local1.sceneWidgetPart002State0002.performAction0621(integerLocal3, integerLocal2, 101, integerLocal5, integerLocal4);
        } catch (RuntimeException runtimeException) {
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) runtimeException), "fl.C(" + integerArgument1 + ',' + (sceneWidgetPart012Argument2 != null ? "{...}" : "null") + ',' + (sceneWidgetPart008Argument3 != null ? "{...}" : "null") + ',' + integerArgument4 + ',' + integerArgument5 + ',' + integerArgument6 + ',' + integerArgument7 + ')');
        }
    }

    final static void performAction0597(int integerArgument1, int integerArgument2, int integerArgument3, int integerArgument4, int integerArgument5) {
        if (integerArgument4 != 0) {
          return;
        }
        UiComponentPart032.integerState0835 = integerArgument2;
        SceneWidgetPart004.integerState0267 = integerArgument1;
        UiComponentPart022.integerState0576 = integerArgument5;
        ComponentDecorator.integerState0497 = integerArgument3;
    }

    final static void performAction0595(int integerArgument1, int integerArgument2, int integerArgument3, String stringArgument4, int integerArgument5, BitmapFont bitmapFontArgument6) {
        int integerLocal1 = 2;
        if (UiComponentPart029.renderingSupport010State0005 == bitmapFontArgument6) {
          integerLocal1 = 1;
        }
        bitmapFontArgument6.performAction1211(stringArgument4, -integerLocal1 + integerArgument5, integerArgument1 - integerLocal1, 0, -1);
        bitmapFontArgument6.performAction1211(stringArgument4, -integerLocal1 + integerArgument5, integerArgument1, 0, -1);
        bitmapFontArgument6.performAction1211(stringArgument4, -integerLocal1 + integerArgument5, integerArgument1 + integerLocal1, 0, -1);
        bitmapFontArgument6.performAction1211(stringArgument4, integerArgument5, integerArgument1 - integerLocal1, 0, -1);
        bitmapFontArgument6.performAction1211(stringArgument4, integerArgument5, integerArgument1 + integerLocal1, 0, -1);
        if (integerArgument2 != 256) {
          return;
        }
        try {
          bitmapFontArgument6.performAction1211(stringArgument4, integerArgument5 + integerLocal1, -integerLocal1 + integerArgument1, 0, -1);
          bitmapFontArgument6.performAction1211(stringArgument4, integerLocal1 + integerArgument5, integerArgument1, 0, -1);
          bitmapFontArgument6.performAction1211(stringArgument4, integerArgument5 + integerLocal1, integerArgument1 + integerLocal1, 0, -1);
          if (SceneWidget.renderingSupport010State0007 == bitmapFontArgument6) {
            bitmapFontArgument6.performAction1211(stringArgument4, integerArgument5 + 1, -integerLocal1 + integerArgument1, 0, -1);
            bitmapFontArgument6.performAction1211(stringArgument4, -1 + integerArgument5, -integerLocal1 + integerArgument1, 0, -1);
            bitmapFontArgument6.performAction1211(stringArgument4, integerArgument5 + integerLocal1, integerArgument1 - 1, 0, -1);
            bitmapFontArgument6.performAction1211(stringArgument4, integerArgument5 - integerLocal1, -1 + integerArgument1, 0, -1);
            bitmapFontArgument6.performAction1211(stringArgument4, integerArgument5 + integerLocal1, integerArgument1 + 1, 0, -1);
            bitmapFontArgument6.performAction1211(stringArgument4, integerArgument5 - integerLocal1, integerArgument1 + 1, 0, -1);
            bitmapFontArgument6.performAction1211(stringArgument4, integerArgument5 + 1, integerLocal1 + integerArgument1, 0, -1);
            bitmapFontArgument6.performAction1211(stringArgument4, -1 + integerArgument5, integerLocal1 + integerArgument1, 0, -1);
          }
          bitmapFontArgument6.performAction1211(stringArgument4, integerArgument5, integerArgument1, integerArgument3, -1);
        } catch (RuntimeException runtimeException) {
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) runtimeException), "fl.H(" + integerArgument1 + ',' + integerArgument2 + ',' + integerArgument3 + ',' + (stringArgument4 != null ? "{...}" : "null") + ',' + integerArgument5 + ',' + (bitmapFontArgument6 != null ? "{...}" : "null") + ')');
        }
    }

    final static int computeInteger0590(byte byteArgument1) {
        if (byteArgument1 != -108) {
          MixedSupport042.computeInteger0594(29, -113, -26, -55, -110);
          return MixedSupport098.integerState0569;
        }
        return MixedSupport098.integerState0569;
    }

    static {
        stringState0183 = "(<%0> players want to join)";
        integerArrayArrayState0008 = new int[][]{null, new int[]{0, 0, 0, 1500, 2000}, null, null, null};
        stringState0182 = "Join <%0>'s game";
        stringState0184 = "Remove friend";
    }
}
