/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class MixedSupport150 {
    static String stringState0600;
    static int integerState0918;
    static String stringState0601;
    static SceneWidget sceneWidgetState0146;
    static String stringState0602;
    static int[] integerArrayState0256;

    final static SceneWidgetPart005 computeSceneWidgetPart0052010(int[] integerArrayArgument1, SceneWidget sceneWidgetArgument2, byte byteArgument3, SceneWidget sceneWidgetArgument4, SceneWidget sceneWidgetArgument5) {
        int integerLocal1 = 0;
        int integerLocal2 = 0;
        String[] stringArrayLocal3 = null;
        char[] characterArrayLocal4 = null;
        SceneWidgetPart005[] sceneWidgetPart005ArrayLocal5 = null;
        int integerLocal6 = 0;
        NetworkSupport007 networkSupport007Local7 = null;
        int integerLocal8 = 0;
        char[] characterArrayLocal9 = null;
        char[] characterArrayLocal10 = null;
        SceneWidgetPart005 stackSceneWidgetPart005Local11 = null;
        Object stackObjectLocal12 = null;
        SceneWidgetPart005 stackSceneWidgetPart005Local13 = null;
        RuntimeException stackRuntimeExceptionLocal14 = null;
        StringBuilder stackStringBuilderLocal15 = null;
        String stackStringLocal16 = null;
        StringBuilder stackStringBuilderLocal17 = null;
        String stackStringLocal18 = null;
        StringBuilder stackStringBuilderLocal19 = null;
        String stackStringLocal20 = null;
        StringBuilder stackStringBuilderLocal21 = null;
        String stackStringLocal22 = null;
        Throwable caughtExceptionLocal23 = null;
        RuntimeException runtimeExceptionLocal24 = null;
        Exception exceptionLocal25 = null;
        integerLocal8 = DekoBlokoClient.obfuscationControl ? 1 : 0;
        try {
          if (byteArgument3 != -127) {
            stackSceneWidgetPart005Local11 = (SceneWidgetPart005) null;
            return stackSceneWidgetPart005Local11;
          }
          integerLocal2 = integerArrayArgument1.length;
          stringArrayLocal3 = new String[integerLocal2];
          characterArrayLocal10 = new char[integerLocal2];
          characterArrayLocal9 = characterArrayLocal10;
          characterArrayLocal4 = characterArrayLocal9;
          sceneWidgetPart005ArrayLocal5 = new SceneWidgetPart005[integerLocal2];
          integerLocal6 = 49;
          try {
            for (integerLocal1 = 0; integerLocal2 > integerLocal1; integerLocal1++) {
              networkSupport007Local7 = UiComponentPart033.networkSupport012State0001.computeNetworkSupport0071741(126, integerArrayArgument1[integerLocal1]);
              stringArrayLocal3[integerLocal1] = networkSupport007Local7.computeString1172((byte) -92);
              integerLocal6 = (char)(integerLocal6 + 1);
              characterArrayLocal4[integerLocal1] = (char)integerLocal6;
              sceneWidgetPart005ArrayLocal5[integerLocal1] = null;
            }
          } catch (java.lang.Exception caughtParameterLocal26) {
            caughtExceptionLocal23 = caughtParameterLocal26;
            exceptionLocal25 = (Exception) (Object) caughtExceptionLocal23;
            stackObjectLocal12 = null;
            return (SceneWidgetPart005) (stackObjectLocal12);
          }
          stackSceneWidgetPart005Local13 = new SceneWidgetPart005(0L, sceneWidgetArgument2, sceneWidgetArgument4, sceneWidgetArgument5, sceneWidgetPart005ArrayLocal5, integerArrayArgument1, stringArrayLocal3, characterArrayLocal10);
          return stackSceneWidgetPart005Local13;
        } catch (java.lang.RuntimeException caughtParameterLocal27) {
          caughtExceptionLocal23 = caughtParameterLocal27;
          runtimeExceptionLocal24 = (RuntimeException) (Object) caughtExceptionLocal23;
          stackRuntimeExceptionLocal14 = runtimeExceptionLocal24;
          stackStringBuilderLocal15 = new StringBuilder().append("wa.D(");
          if (integerArrayArgument1 == null) {
            stackStringLocal16 = "null";
          } else {
            stackStringLocal16 = "{...}";
          }
          stackStringBuilderLocal17 = ((StringBuilder) (Object) stackStringBuilderLocal15).append(stackStringLocal16).append(',');
          if (sceneWidgetArgument2 == null) {
            stackStringLocal18 = "null";
          } else {
            stackStringLocal18 = "{...}";
          }
          stackStringBuilderLocal19 = ((StringBuilder) (Object) stackStringBuilderLocal17).append(stackStringLocal18).append(',').append(byteArgument3).append(',');
          if (sceneWidgetArgument4 == null) {
            stackStringLocal20 = "null";
          } else {
            stackStringLocal20 = "{...}";
          }
          stackStringBuilderLocal21 = ((StringBuilder) (Object) stackStringBuilderLocal19).append(stackStringLocal20).append(',');
          if (sceneWidgetArgument5 == null) {
            stackStringLocal22 = "null";
          } else {
            stackStringLocal22 = "{...}";
          }
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) stackRuntimeExceptionLocal14), ((StringBuilder) (Object) stackStringBuilderLocal21).append(stackStringLocal22).append(')').toString());
        }
    }

    final static void performAction2007(int integerArgument1, int integerArgument2) {
        int integerLocal1 = 0;
        MixedSupport038 mixedSupport038Local2 = null;
        MixedSupport118 mixedSupport118Local3 = null;
        RuntimeException caughtExceptionLocal4 = null;
        RuntimeException runtimeExceptionLocal5 = null;
        integerLocal1 = DekoBlokoClient.obfuscationControl ? 1 : 0;
        try {
          mixedSupport038Local2 = (MixedSupport038) (MixedSupport016.nodeDequeState0003.computeHashNode1970((byte) 119));
          while (mixedSupport038Local2 != null) {
            MixedSupport085.performAction1159(true, mixedSupport038Local2, integerArgument2);
            mixedSupport038Local2 = (MixedSupport038) (MixedSupport016.nodeDequeState0003.computeHashNode1974(true));
          }
          if (integerArgument1 != 3) {
            return;
          }
          mixedSupport118Local3 = (MixedSupport118) (UiComponentPart010.nodeDequeState0008.computeHashNode1970((byte) 80));
          while (mixedSupport118Local3 != null) {
            ReturnedShapeCache.performAction1350(integerArgument1 ^ -87, integerArgument2, mixedSupport118Local3);
            mixedSupport118Local3 = (MixedSupport118) (UiComponentPart010.nodeDequeState0008.computeHashNode1974(true));
          }
          return;
        } catch (java.lang.RuntimeException caughtParameterLocal6) {
          caughtExceptionLocal4 = caughtParameterLocal6;
          runtimeExceptionLocal5 = caughtExceptionLocal4;
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) runtimeExceptionLocal5), "wa.A(" + integerArgument1 + ',' + integerArgument2 + ')');
        }
    }

    final static SceneWidget computeSceneWidget2009(int integerArgument1, int integerArgument2, int integerArgument3, int integerArgument4, int integerArgument5, int integerArgument6, int integerArgument7, int integerArgument8, int integerArgument9, int integerArgument10, int integerArgument11, int integerArgument12, BitmapFont bitmapFontArgument13) {
        SceneWidget sceneWidgetLocal1 = null;
        RuntimeException runtimeExceptionLocal2 = null;
        SceneWidget sceneWidgetLocal3 = null;
        SceneWidget stackSceneWidgetLocal4 = null;
        RuntimeException stackRuntimeExceptionLocal5 = null;
        StringBuilder stackStringBuilderLocal6 = null;
        String stackStringLocal7 = null;
        RuntimeException caughtExceptionLocal8 = null;
        try {
          sceneWidgetLocal1 = new SceneWidget(0L, (SceneWidget) null);
          sceneWidgetLocal1.rgbSpriteArrayState0033 = UiComponentPart007.computeRgbSpriteArray0392(integerArgument10, 0, integerArgument7);
          sceneWidgetLocal1.rgbSpriteArrayState0035 = UiComponentPart007.computeRgbSpriteArray0392(integerArgument4, 0, integerArgument2);
          sceneWidgetLocal1.rgbSpriteArrayState0036 = UiComponentPart007.computeRgbSpriteArray0392(integerArgument1, 0, integerArgument6);
          sceneWidgetLocal1.rgbSpriteArrayState0032 = UiComponentPart007.computeRgbSpriteArray0392(integerArgument5, integerArgument12 + 24447, integerArgument9);
          sceneWidgetLocal1.rgbSpriteArrayState0034 = UiComponentPart007.computeRgbSpriteArray0392(integerArgument11, 0, integerArgument8);
          sceneWidgetLocal1.integerState0910 = integerArgument3;
          if (integerArgument12 != -24447) {
            sceneWidgetLocal3 = (SceneWidget) null;
            MixedSupport150.computeSceneWidgetPart0052010((int[]) null, (SceneWidget) null, (byte) -92, (SceneWidget) null, (SceneWidget) null);
          }
          sceneWidgetLocal1.bitmapFontState0020 = bitmapFontArgument13;
          stackSceneWidgetLocal4 = sceneWidgetLocal1;
          return stackSceneWidgetLocal4;
        } catch (java.lang.RuntimeException caughtParameterLocal9) {
          caughtExceptionLocal8 = caughtParameterLocal9;
          runtimeExceptionLocal2 = caughtExceptionLocal8;
          stackRuntimeExceptionLocal5 = runtimeExceptionLocal2;
          stackStringBuilderLocal6 = new StringBuilder().append("wa.C(").append(integerArgument1).append(',').append(integerArgument2).append(',').append(integerArgument3).append(',').append(integerArgument4).append(',').append(integerArgument5).append(',').append(integerArgument6).append(',').append(integerArgument7).append(',').append(integerArgument8).append(',').append(integerArgument9).append(',').append(integerArgument10).append(',').append(integerArgument11).append(',').append(integerArgument12).append(',');
          if (bitmapFontArgument13 == null) {
            stackStringLocal7 = "null";
          } else {
            stackStringLocal7 = "{...}";
          }
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) stackRuntimeExceptionLocal5), ((StringBuilder) (Object) stackStringBuilderLocal6).append(stackStringLocal7).append(')').toString());
        }
    }

    public static void performAction2006(int integerArgument1) {
        stringState0600 = null;
        if (integerArgument1 == 18) {
          sceneWidgetState0146 = null;
          integerArrayState0256 = null;
          stringState0602 = null;
          stringState0601 = null;
          return;
        }
        MixedSupport150.performAction2007(-113, -90);
        sceneWidgetState0146 = null;
        integerArrayState0256 = null;
        stringState0602 = null;
        stringState0601 = null;
    }

    final static void performAction2008(int integerArgument1, int integerArgument2, int integerArgument3, int integerArgument4, int integerArgument5, int integerArgument6, int integerArgument7) {
        int integerLocal1 = DekoBlokoClient.obfuscationControl ? 1 : 0;
        int integerLocal2 = integerArgument7 >= 80 ? 54 : integerArgument7 / 20 * 18;
        int integerLocal3 = 0;
        if (integerArgument7 < 60) {
          integerLocal2 = integerLocal2 + MixedSupport148.computeInteger1983(23841, 80, 40 + 18 * integerArgument1);
          RenderingSupport002.performAction0263(integerArgument6, 2, 6, integerArgument4, 1 + (72 + integerArgument3), 2, -2);
          RenderingSupport002.performAction0263(integerArgument6, 2, 12, integerArgument4, 1 + (integerArgument3 + 54), 2, integerArgument5);
          RenderingSupport002.performAction0263(integerArgument6, 2, 8, integerArgument4, 36 + (integerArgument3 + 1), 2, -1);
          RenderingSupport002.performAction0263(integerArgument6, 2, 1, integerArgument4 + 18, integerArgument3 + 72 + 1, 1, -2);
          MixedSupport035.rgbSpriteArrayArrayState0006[integerArgument6][2].performAction0302(integerArgument4 + 18, integerArgument3 + 36, 18, 18);
          MixedSupport035.rgbSpriteArrayArrayState0006[integerArgument6][2].performAction0302(integerArgument4 + 18, 54 + integerArgument3, 18, 18);
          MixedSupport035.rgbSpriteArrayArrayState0006[integerArgument6][2].performAction0302(integerArgument4 + 36, 72 + integerArgument3, 18, 18);
          MixedSupport035.rgbSpriteArrayArrayState0006[integerArgument6][2].performAction0302(36 + integerArgument4, integerLocal2 + (integerArgument3 + integerLocal3), 18, 18 - integerLocal3);
          return;
        }
        if (integerArgument7 < 80) {
          integerLocal2 = integerLocal2 + MixedSupport148.computeInteger1983(23841, 80, 18 * integerArgument2 + 40);
          RenderingSupport002.performAction0263(integerArgument6, 2, 6, integerArgument4, 1 + (72 + integerArgument3), 2, -2);
          RenderingSupport002.performAction0263(integerArgument6, 2, 12, integerArgument4, 1 + (integerArgument3 + 54), 2, integerArgument5);
          RenderingSupport002.performAction0263(integerArgument6, 2, 8, integerArgument4, 36 + (integerArgument3 + 1), 2, -1);
          RenderingSupport002.performAction0263(integerArgument6, 2, 1, integerArgument4 + 18, integerArgument3 + 72 + 1, 1, -2);
          MixedSupport035.rgbSpriteArrayArrayState0006[integerArgument6][2].performAction0302(integerArgument4 + 18, integerArgument3 + 36, 18, 18);
          MixedSupport035.rgbSpriteArrayArrayState0006[integerArgument6][2].performAction0302(integerArgument4 + 18, 54 + integerArgument3, 18, 18);
          MixedSupport035.rgbSpriteArrayArrayState0006[integerArgument6][2].performAction0302(integerArgument4 + 36, 72 + integerArgument3, 18, 18);
          MixedSupport035.rgbSpriteArrayArrayState0006[integerArgument6][2].performAction0302(36 + integerArgument4, integerLocal2 + (integerArgument3 + integerLocal3), 18, 18 - integerLocal3);
          return;
        }
        if (93 > integerArgument7) {
          integerLocal3 = MixedSupport148.computeInteger1983(23841, 80, SceneWidgetPart013.integerArrayState0239[1 + integerArgument7 - 80] * 18 + 40);
          RenderingSupport002.performAction0263(integerArgument6, 2, 6, integerArgument4, 1 + (72 + integerArgument3), 2, -2);
          RenderingSupport002.performAction0263(integerArgument6, 2, 12, integerArgument4, 1 + (integerArgument3 + 54), 2, integerArgument5);
          RenderingSupport002.performAction0263(integerArgument6, 2, 8, integerArgument4, 36 + (integerArgument3 + 1), 2, -1);
          RenderingSupport002.performAction0263(integerArgument6, 2, 1, integerArgument4 + 18, integerArgument3 + 72 + 1, 1, -2);
          MixedSupport035.rgbSpriteArrayArrayState0006[integerArgument6][2].performAction0302(integerArgument4 + 18, integerArgument3 + 36, 18, 18);
          MixedSupport035.rgbSpriteArrayArrayState0006[integerArgument6][2].performAction0302(integerArgument4 + 18, 54 + integerArgument3, 18, 18);
          MixedSupport035.rgbSpriteArrayArrayState0006[integerArgument6][2].performAction0302(integerArgument4 + 36, 72 + integerArgument3, 18, 18);
          MixedSupport035.rgbSpriteArrayArrayState0006[integerArgument6][2].performAction0302(36 + integerArgument4, integerLocal2 + (integerArgument3 + integerLocal3), 18, 18 - integerLocal3);
          return;
        }
        SoftwareRaster.performAction0721(integerArgument4 - 3, integerArgument3 + 36 - 3, 60, 60, 4, 65280, 100);
        RenderingSupport002.performAction0263(integerArgument6, 2, 6, integerArgument4, 1 + (72 + integerArgument3), 2, -2);
        RenderingSupport002.performAction0263(integerArgument6, 2, 12, integerArgument4, 1 + (integerArgument3 + 54), 2, integerArgument5);
        RenderingSupport002.performAction0263(integerArgument6, 2, 8, integerArgument4, 36 + (integerArgument3 + 1), 2, -1);
        RenderingSupport002.performAction0263(integerArgument6, 2, 1, integerArgument4 + 18, integerArgument3 + 72 + 1, 1, -2);
        MixedSupport035.rgbSpriteArrayArrayState0006[integerArgument6][2].performAction0302(integerArgument4 + 18, integerArgument3 + 36, 18, 18);
        MixedSupport035.rgbSpriteArrayArrayState0006[integerArgument6][2].performAction0302(integerArgument4 + 18, 54 + integerArgument3, 18, 18);
        MixedSupport035.rgbSpriteArrayArrayState0006[integerArgument6][2].performAction0302(integerArgument4 + 36, 72 + integerArgument3, 18, 18);
        MixedSupport035.rgbSpriteArrayArrayState0006[integerArgument6][2].performAction0302(36 + integerArgument4, integerLocal2 + (integerArgument3 + integerLocal3), 18, 18 - integerLocal3);
    }

    static {
        stringState0600 = "Invalid password.";
        stringState0602 = "You can join this game";
        stringState0601 = "Send private Quick Chat to <%0>";
    }
}
