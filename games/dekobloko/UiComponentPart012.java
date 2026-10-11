/*
 * Decompiled by CFR-JS 0.4.0.
 */
class UiComponentPart012 extends UiComponentPart004 implements CallbackContract019 {
    static String stringState0206;
    static boolean booleanState0059;
    private boolean booleanState0060;
    private boolean booleanState0061;
    private BitmapFont bitmapFontState0014;
    private UiComponentPart027 uiComponentPart027State0001;
    static byte[][] byteArrayArrayState0002;
    static int[] integerArrayState0051;
    static SceneWidget sceneWidgetState0042;
    static String stringState0207;
    private boolean booleanState0062;
    private boolean booleanState0063;

    final void performAction0655(int integerArgument1) {
        if (!this.booleanState0011) {
          return;
        }
        this.booleanState0011 = false;
        int integerLocal1 = 6 % ((-68 - integerArgument1) / 51);
        if (this.booleanState0061) {
          InputAdapter005.performAction1535(true);
          return;
        }
        if (this.booleanState0062) {
          UiComponentPart001.performAction0066(-73);
          return;
        }
    }

    final void performAction0656(int integerArgument1) {
        this.uiComponentPart027State0001.performAction1585(integerArgument1, 4088, 2121792);
        UiComponentPart008 uiComponentPart008Local1 = new UiComponentPart008(this, this.bitmapFontState0014, MixedSupport043.stringState0186);
        uiComponentPart008Local1.performAction0406(MixedSupport087.stringState0355, 15, integerArgument1 ^ 4210766);
        this.performAction0201(uiComponentPart008Local1, (byte) 51);
    }

    final static int computeInteger0654(int integerArgument1, int integerArgument2, int integerArgument3) {
        if (integerArgument2 != integerArgument3) {
          return MixedSupport036.integerArrayState0045[integerArgument3];
        }
        if (!MixedSupport083.computeBoolean1125(integerArgument1, (byte) -96)) {
          return MixedSupport036.integerArrayState0045[integerArgument3];
        }
        return 29;
    }

    UiComponentPart012(UiComponentPart016 uiComponentPart016Argument1, BitmapFont bitmapFontArgument2, String stringArgument3, boolean booleanArgument4, boolean booleanArgument5) {
        super(uiComponentPart016Argument1, new UiComponentPart008((UiComponentPart012) null, bitmapFontArgument2, stringArgument3), 77, 10, 10);
        try {
          this.bitmapFontState0014 = bitmapFontArgument2;
          this.booleanState0061 = booleanArgument4 ? true : false;
          this.booleanState0063 = false;
          this.booleanState0060 = false;
          this.booleanState0062 = booleanArgument5 ? true : false;
          this.uiComponentPart027State0001 = new UiComponentPart027(13, 50, 274, 30, 15, 2113632, 4210752);
          this.uiComponentPart027State0001.booleanState0159 = true;
          this.performAction1012(this.uiComponentPart027State0001, (byte) -55);
        } catch (RuntimeException runtimeException) {
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) runtimeException), "gk.<init>(" + (uiComponentPart016Argument1 != null ? "{...}" : "null") + ',' + (bitmapFontArgument2 != null ? "{...}" : "null") + ',' + (stringArgument3 != null ? "{...}" : "null") + ',' + booleanArgument4 + ',' + booleanArgument5 + ')');
        }
    }

    final static void performAction0653(SceneWidget sceneWidgetArgument1, boolean booleanArgument2) {
        SceneWidget sceneWidgetLocal1 = null;
        SceneWidget sceneWidgetLocal2 = null;
        int integerLocal3 = DekoBlokoClient.obfuscationControl ? 1 : 0;
        try {
          sceneWidgetLocal1 = (SceneWidget) (sceneWidgetArgument1.nodeDequeState0034.computeHashNode1970((byte) -76));
          SceneWidget sceneWidgetLocal4 = sceneWidgetLocal1;
          while (sceneWidgetLocal1 != null) {
            sceneWidgetLocal1.integerState0903 = 0;
            sceneWidgetLocal1.integerState0904 = 0;
            sceneWidgetLocal1.integerState0895 = 0;
            sceneWidgetLocal1.integerState0915 = 0;
            sceneWidgetLocal2 = (SceneWidget) (sceneWidgetArgument1.nodeDequeState0034.computeHashNode1974(true));
            sceneWidgetLocal2 = sceneWidgetLocal2;
          }
          if (!booleanArgument2) {
            byteArrayArrayState0002 = (byte[][]) null;
          }
          sceneWidgetArgument1.integerState0904 = 0;
          sceneWidgetArgument1.integerState0903 = 0;
          sceneWidgetArgument1.integerState0895 = 0;
          sceneWidgetArgument1.integerState0915 = 0;
        } catch (RuntimeException runtimeException) {
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) runtimeException), "gk.IA(" + (sceneWidgetArgument1 != null ? "{...}" : "null") + ',' + booleanArgument2 + ')');
        }
    }

    final void performAction0651(byte byteArgument1, String stringArgument2, int integerArgument3) {
        boolean stackBooleanLocal1 = false;
        UiComponentPart008 stackUiComponentPart008Local2 = null;
        String stackStringLocal3 = null;
        RuntimeException stackRuntimeExceptionLocal4 = null;
        StringBuilder stackStringBuilderLocal5 = null;
        String stackStringLocal6 = null;
        RuntimeException caughtExceptionLocal7 = null;
        RuntimeException runtimeExceptionLocal8 = null;
        int integerLocal9 = 0;
        UiComponentPart008 uiComponentPart008Local10 = null;
        integerLocal9 = DekoBlokoClient.obfuscationControl ? 1 : 0;
        try {
          if (byteArgument1 != 48) {
            return;
          }
          if (this.booleanState0060) {
            return;
          }
          stackBooleanLocal1 = (256 == integerArgument3);
          this.booleanState0063 = stackBooleanLocal1;
          this.booleanState0060 = true;
          this.uiComponentPart027State0001.performAction1585(4210752, 4088, 8405024);
          uiComponentPart008Local10 = new UiComponentPart008(this, this.bitmapFontState0014, stringArgument2);
          if (integerArgument3 != 5) {
            if (integerArgument3 != 256) {
              stackUiComponentPart008Local2 = uiComponentPart008Local10;
              if (!this.booleanState0061) {
                stackStringLocal3 = UiComponentPart003.stringState0060;
              } else {
                stackStringLocal3 = GameAssets.stringState0504;
              }
              ((UiComponentPart008) (Object) stackUiComponentPart008Local2).performAction0406(stackStringLocal3, -1, 14);
            } else {
              uiComponentPart008Local10.computeInteractiveComponent0405(116, GameAssets.stringState0504, (CallbackContract006) (this));
            }
          } else {
            uiComponentPart008Local10.performAction0406(GameDomainSupport005.stringState0406, 11, 14);
            uiComponentPart008Local10.performAction0406(SceneWidgetPart005.stringState0255, 17, byteArgument1 ^ 62);
          }
          if (3 != integerArgument3) {
            if (integerArgument3 != 4) {
              if (6 != integerArgument3) {
                if (integerArgument3 == 9) {
                  uiComponentPart008Local10.computeInteractiveComponent0405(127, MixedSupport101.stringState0410, (CallbackContract006) (this));
                }
              } else {
                uiComponentPart008Local10.performAction0406(UiComponentPart032.stringState0580, 9, 14);
              }
            } else {
              uiComponentPart008Local10.performAction0406(UiComponentPart001.stringState0025, 8, 14);
            }
          } else {
            uiComponentPart008Local10.performAction0406(UiComponent.stringState0079, 7, 14);
          }
          this.performAction0201(uiComponentPart008Local10, (byte) 84);
          return;
        } catch (java.lang.RuntimeException caughtParameterLocal11) {
          caughtExceptionLocal7 = caughtParameterLocal11;
          runtimeExceptionLocal8 = caughtExceptionLocal7;
          stackRuntimeExceptionLocal4 = runtimeExceptionLocal8;
          stackStringBuilderLocal5 = new StringBuilder().append("gk.EA(").append(byteArgument1).append(',');
          if (stringArgument2 == null) {
            stackStringLocal6 = "null";
          } else {
            stackStringLocal6 = "{...}";
          }
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) stackRuntimeExceptionLocal4), ((StringBuilder) (Object) stackStringBuilderLocal5).append(stackStringLocal6).append(',').append(integerArgument3).append(')').toString());
        }
    }

    final static void performAction0652(int integerArgument1, int integerArgument2, byte byteArgument3, MixedSupport015 mixedSupport015Argument4) {
        try {
          int integerLocal1 = -111 % ((byteArgument3 - 41) / 38);
        } catch (RuntimeException runtimeException) {
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) runtimeException), "gk.JA(" + integerArgument1 + ',' + integerArgument2 + ',' + byteArgument3 + ',' + (mixedSupport015Argument4 != null ? "{...}" : "null") + ')');
        }
    }

    final boolean computeBoolean0198(int integerArgument1, int integerArgument2, UiComponent uiComponentArgument3, char characterArgument4) {
        int integerLocal1 = 0;
        RuntimeException runtimeExceptionLocal2 = null;
        boolean stackBooleanLocal3 = false;
        RuntimeException stackRuntimeExceptionLocal4 = null;
        StringBuilder stackStringBuilderLocal5 = null;
        String stackStringLocal6 = null;
        RuntimeException caughtExceptionLocal7 = null;
        try {
          if (integerArgument2 == 13) {
            this.performAction0655(63);
            return true;
          }
          integerLocal1 = -15 / ((integerArgument1 + 22) / 49);
          stackBooleanLocal3 = super.computeBoolean0198(123, integerArgument2, uiComponentArgument3, characterArgument4);
          return stackBooleanLocal3;
        } catch (java.lang.RuntimeException caughtParameterLocal8) {
          caughtExceptionLocal7 = caughtParameterLocal8;
          runtimeExceptionLocal2 = caughtExceptionLocal7;
          stackRuntimeExceptionLocal4 = runtimeExceptionLocal2;
          stackStringBuilderLocal5 = new StringBuilder().append("gk.QA(").append(integerArgument1).append(',').append(integerArgument2).append(',');
          if (uiComponentArgument3 == null) {
            stackStringLocal6 = "null";
          } else {
            stackStringLocal6 = "{...}";
          }
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) stackRuntimeExceptionLocal4), ((StringBuilder) (Object) stackStringBuilderLocal5).append(stackStringLocal6).append(',').append(characterArgument4).append(')').toString());
        }
    }

    public void performAction0341(byte byteArgument1, int integerArgument2, InteractiveComponent interactiveComponentArgument3, int integerArgument4, int integerArgument5) {
        RuntimeException runtimeExceptionLocal1 = null;
        RuntimeException stackRuntimeExceptionLocal2 = null;
        StringBuilder stackStringBuilderLocal3 = null;
        String stackStringLocal4 = null;
        RuntimeException caughtExceptionLocal5 = null;
        try {
          if (byteArgument1 != 67) {
            this.booleanState0062 = true;
          }
          if (!this.booleanState0063) {
            NetworkSupport001.performAction0068("tochangedisplayname.ws", byteArgument1 ^ -79, UiComponentPart029.computeApplet1689(byteArgument1 ^ 25211));
            return;
          }
          InputAdapter003.performAction0749(3, (byte) -124);
          this.performAction0655(-9);
          return;
        } catch (java.lang.RuntimeException caughtParameterLocal6) {
          caughtExceptionLocal5 = caughtParameterLocal6;
          runtimeExceptionLocal1 = caughtExceptionLocal5;
          stackRuntimeExceptionLocal2 = runtimeExceptionLocal1;
          stackStringBuilderLocal3 = new StringBuilder().append("gk.H(").append(byteArgument1).append(',').append(integerArgument2).append(',');
          if (interactiveComponentArgument3 == null) {
            stackStringLocal4 = "null";
          } else {
            stackStringLocal4 = "{...}";
          }
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) stackRuntimeExceptionLocal2), ((StringBuilder) (Object) stackStringBuilderLocal3).append(stackStringLocal4).append(',').append(integerArgument4).append(',').append(integerArgument5).append(')').toString());
        }
    }

    public static void performAction0657(int integerArgument1) {
        stringState0207 = null;
        byteArrayArrayState0002 = (byte[][]) null;
        int integerLocal1 = 107 % ((-66 - integerArgument1) / 34);
        stringState0206 = null;
        integerArrayState0051 = null;
        sceneWidgetState0042 = null;
    }

    static {
        stringState0206 = "Options";
        byteArrayArrayState0002 = new byte[50][];
        integerArrayState0051 = new int[4];
        stringState0207 = "Quick Chat Help";
    }
}
