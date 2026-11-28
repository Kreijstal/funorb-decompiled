/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class UiComponentPart032 extends ComponentContainer implements CallbackContract005 {
    private InputAdapter002 inputAdapter002State0001;
    static ResourceArchive resourceArchiveState0024;
    static boolean booleanState0198;
    static int[] integerArrayState0238;
    static String[] stringArrayState0051;
    static int integerState0835;
    static String stringState0580;
    static String stringState0581;

    abstract int computeInteger1280(int integerArgument1);

    public static void clearStaticReferences(int integerArgument1) {
        integerArrayState0238 = null;
        stringArrayState0051 = null;
        resourceArchiveState0024 = null;
        if (integerArgument1 > -17) {
          UiComponentPart032.clearStaticReferences(-12);
        }
        stringState0580 = null;
        stringState0581 = null;
    }

    abstract boolean computeBoolean1281(int integerArgument1);

    final static void performAction1701(byte byteArgument1) {
        if (byteArgument1 != 105) {
          booleanState0198 = true;
        }
        String stringLocal1 = (String) null;
        InputAdapter002.performAction1352("", -99, (String) null);
    }

    public final CallbackContract011 computeCallbackContract0110824(int integerArgument1) {
        if (integerArgument1 > -86) {
          UiComponentPart032.clearStaticReferences(-30);
        }
        return (CallbackContract011) ((Object) this.inputAdapter002State0001);
    }

    abstract int computeInteger1279(byte byteArgument1);

    void performAction1270(byte byteArgument1, InputAdapter002 inputAdapter002Argument2) {
        try {
          if (byteArgument1 < 74) {
            resourceArchiveState0024 = (ResourceArchive) null;
          }
          this.inputAdapter002State0001 = inputAdapter002Argument2;
          this.inputAdapter002State0001.uiComponentPart032State0001 = this;
        } catch (RuntimeException runtimeException) {
          throw ClientException.computeDiagnosticSupport0020365((Throwable) ((Object) runtimeException), "vb.H(" + byteArgument1 + ',' + (inputAdapter002Argument2 != null ? "{...}" : "null") + ')');
        }
    }

    final static void performAction1700(boolean booleanArgument1, int integerArgument2) {
        int integerLocal1 = 0;
        int integerLocal2 = 0;
        int stackIntegerLocal3 = 0;
        SceneWidget stackSceneWidgetLocal4 = null;
        int stackIntegerLocal5 = 0;
        int stackIntegerLocal6 = 0;
        int stackIntegerLocal7 = 0;
        RuntimeException caughtExceptionLocal8 = null;
        int integerLocal9 = 0;
        RuntimeException runtimeExceptionLocal10 = null;
        int integerLocal11 = 0;
        int integerLocal12 = 0;
        int integerLocal13 = 0;
        int integerLocal14 = 0;
        int integerLocal15 = 0;
        SceneWidget sceneWidgetLocal16 = null;
        SceneWidgetPart009 sceneWidgetPart009Local17 = null;
        int integerLocal18 = 0;
        int integerLocal19 = 0;
        SceneWidgetPart009 sceneWidgetPart009Local20 = null;
        int integerLocal21 = 0;
        int integerLocal22 = 0;
        SceneWidget sceneWidgetLocal23 = null;
        SceneWidget sceneWidgetLocal24 = null;
        integerLocal22 = DekoBlokoClient.obfuscationControl ? 1 : 0;
        try {
          UiComponentPart033.integerState0934 = SoftwareRaster.integerState0285;
          GameplayControls.integerState0859 = SoftwareRaster.integerState0284;
          if (!booleanArgument1) {
            stackIntegerLocal3 = MixedSupport121.integerState0778;
          } else {
            stackIntegerLocal3 = RenderingSupport001.integerState0064;
          }
          InputAdapter002.performAction1350(stackIntegerLocal3, 97);
          PcmResampler.mixedSupport006State0002.performAction0066(-42 + IsaacRandom.sceneWidgetState0023.integerState0915, IsaacRandom.sceneWidgetState0023.integerState0896, 0, integerArgument2 + 117, 0);
          UiComponentPart013.sceneWidgetState0048.performAction1764(RenderingSupport006.sceneWidgetState0056.integerState0896, integerArgument2 ^ -2, 0, ComponentContainer.integerState0377, 0);
          stackSceneWidgetLocal4 = MixedSupport071.sceneWidgetState0070;
          stackIntegerLocal5 = RenderingSupport006.sceneWidgetState0056.integerState0896;
          if (!MixedSupport097.booleanState0133) {
            stackIntegerLocal6 = 0;
          } else {
            stackIntegerLocal6 = 2 + (40 + MixedSupport139.integerState0855 + 2);
          }
          ((SceneWidget) (Object) stackSceneWidgetLocal4).performAction1764(stackIntegerLocal5 - stackIntegerLocal6, 0, 2 + ComponentContainer.integerState0377, 18, 0);
          RichTextLayout.sceneWidgetState0020.performAction1764(42 + MixedSupport139.integerState0855, 0, ComponentContainer.integerState0377 - integerArgument2, 18, -40 + (-2 + RenderingSupport006.sceneWidgetState0056.integerState0896 - MixedSupport139.integerState0855));
          ValidationStatus.sceneWidgetPart008State0006.performAction1122(6, ComponentContainer.integerState0377 + 22, MixedSupport139.integerState0855, 0, -2 + (-ComponentContainer.integerState0377 + RenderingSupport006.sceneWidgetState0056.integerState0915) - 20, RenderingSupport006.sceneWidgetState0056.integerState0896, 2);
          ComponentDecorator.sceneWidgetState0078.performAction1764(IsaacRandom.sceneWidgetState0023.integerState0896, 0, -40 + IsaacRandom.sceneWidgetState0023.integerState0915, 40, 0);
          MixedSupport042.sceneWidgetState0033.performAction1764(NetworkSupport008.sceneWidgetState0093.integerState0896, 0, 0, 30, 0);
          MixedSupport106.sceneWidgetState0102.performAction1764(NetworkSupport008.sceneWidgetState0093.integerState0896, 0, 30, -2 + NetworkSupport008.sceneWidgetState0093.integerState0915 - 70, 0);
          integerLocal9 = MixedSupport063.integerState0336 + 3;
          if (UiComponentPart002.integerArrayState0014.length < 2) {
            integerLocal9--;
          }
          if (booleanArgument1) {
            integerLocal9--;
          }
          integerLocal11 = (-10 + (-5 + (MixedSupport106.sceneWidgetState0102.integerState0915 - 5) + 2 + (integerLocal9 + 1) / 2)) / (1 + integerLocal9) - 2;
          if (integerLocal11 > 30) {
            integerLocal11 = 30;
          }
          integerLocal12 = -((2 + integerLocal11) * integerLocal9) - 5 + MixedSupport106.sceneWidgetState0102.integerState0915 - 5;
          if (integerLocal12 > 40) {
            integerLocal12 = 40;
          }
          MixedSupport077.sceneWidgetState0075.performAction1764(-5 + MixedSupport106.sceneWidgetState0102.integerState0896 - 5, 0, 5, integerLocal12, 5);
          integerLocal13 = integerLocal12 + 5 + 2;
          for (integerLocal1 = 0; integerLocal1 < 4 + MixedSupport063.integerState0336; integerLocal1++) {
            if ((1 != integerLocal1 ||
              !(UiComponentPart002.integerArrayState0014.length < 2)) && (3 != integerLocal1 ||
              !(SceneWidgetPart007.integerState0506 <= 1))) {
              if (!booleanArgument1 &&
                integerLocal1 == 3) {
                sceneWidgetLocal24 = MixedSupport132.sceneWidgetArrayState0008[integerLocal1];
                MixedSupport132.sceneWidgetArrayState0008[integerLocal1].integerState0915 = 0;
                sceneWidgetLocal24.integerState0896 = 0;
                for (integerLocal15 = 0; MixedSupport103.sceneWidgetPart009ArrayArrayState0001[integerLocal1].length > integerLocal15; integerLocal15++) {
                  if (MixedSupport103.sceneWidgetPart009ArrayArrayState0001[integerLocal1][integerLocal15] != null) {
                    sceneWidgetPart009Local17 = MixedSupport103.sceneWidgetPart009ArrayArrayState0001[integerLocal1][integerLocal15];
                    MixedSupport103.sceneWidgetPart009ArrayArrayState0001[integerLocal1][integerLocal15].integerState0915 = 0;
                    sceneWidgetPart009Local17.integerState0896 = 0;
                  }
                }
              } else if (booleanArgument1 &&
                integerLocal1 == 0) {
                sceneWidgetLocal23 = MixedSupport132.sceneWidgetArrayState0008[integerLocal1];
                MixedSupport132.sceneWidgetArrayState0008[integerLocal1].integerState0915 = 0;
                sceneWidgetLocal23.integerState0896 = 0;
                for (integerLocal15 = 0; MixedSupport103.sceneWidgetPart009ArrayArrayState0001[integerLocal1].length > integerLocal15; integerLocal15++) {
                  if (MixedSupport103.sceneWidgetPart009ArrayArrayState0001[integerLocal1][integerLocal15] != null) {
                    sceneWidgetPart009Local17 = MixedSupport103.sceneWidgetPart009ArrayArrayState0001[integerLocal1][integerLocal15];
                    MixedSupport103.sceneWidgetPart009ArrayArrayState0001[integerLocal1][integerLocal15].integerState0915 = 0;
                    sceneWidgetPart009Local17.integerState0896 = 0;
                  }
                }
              } else {
                if (booleanArgument1) {
                  if (integerLocal1 >= 4) {
                    if (null != MixedSupport013.booleanArrayState0003) {
                      stackIntegerLocal7 = (MixedSupport013.booleanArrayState0003[-4 + integerLocal1]) ? 1 : 0;
                    } else {
                      stackIntegerLocal7 = 0;
                    }
                  } else {
                    stackIntegerLocal7 = 0;
                  }
                } else {
                  stackIntegerLocal7 = 0;
                }
                integerLocal14 = stackIntegerLocal7;
                if (integerLocal14 != 0) {
                  sceneWidgetLocal16 = MixedSupport132.sceneWidgetArrayState0008[integerLocal1];
                  MixedSupport132.sceneWidgetArrayState0008[integerLocal1].integerState0915 = 0;
                  sceneWidgetLocal16.integerState0896 = 0;
                  for (integerLocal18 = 0; MixedSupport103.sceneWidgetPart009ArrayArrayState0001[integerLocal1].length > integerLocal18; integerLocal18++) {
                    if (MixedSupport103.sceneWidgetPart009ArrayArrayState0001[integerLocal1][integerLocal18] != null) {
                      sceneWidgetPart009Local20 = MixedSupport103.sceneWidgetPart009ArrayArrayState0001[integerLocal1][integerLocal18];
                      MixedSupport103.sceneWidgetPart009ArrayArrayState0001[integerLocal1][integerLocal18].integerState0915 = 0;
                      sceneWidgetPart009Local20.integerState0896 = 0;
                    }
                  }
                } else {
                  MixedSupport132.sceneWidgetArrayState0008[integerLocal1].performAction1764(103, 0, integerLocal13, integerLocal11, 5);
                  integerLocal15 = 110;
                  if (!booleanArgument1) {
                    if (MixedSupport103.sceneWidgetPart009ArrayArrayState0001[integerLocal1][0] != null) {
                      sceneWidgetPart009Local17 = MixedSupport103.sceneWidgetPart009ArrayArrayState0001[integerLocal1][0];
                      MixedSupport103.sceneWidgetPart009ArrayArrayState0001[integerLocal1][0].integerState0915 = 0;
                      sceneWidgetPart009Local17.integerState0896 = 0;
                    }
                  } else {
                    MixedSupport103.sceneWidgetPart009ArrayArrayState0001[integerLocal1][0].performAction1336(integerLocal11, 2, integerLocal15, integerLocal13, 38, MixedSupport063.integerState0335, 500);
                    integerLocal15 += 40;
                  }
                  integerLocal18 = 2 + (-integerLocal15 - 5) + NetworkSupport008.sceneWidgetState0093.integerState0896;
                  integerLocal19 = MixedSupport103.sceneWidgetPart009ArrayArrayState0001[integerLocal1].length - 1;
                  for (integerLocal2 = 0; integerLocal19 > integerLocal2; integerLocal2++) {
                    integerLocal21 = integerLocal18 * integerLocal2 / integerLocal19;
                    MixedSupport103.sceneWidgetPart009ArrayArrayState0001[integerLocal1][integerLocal2 + 1].performAction1336(integerLocal11, 2, integerLocal15 + integerLocal21, integerLocal13, -integerLocal21 + ((1 + integerLocal2) * integerLocal18 / integerLocal19 - 2), MixedSupport063.integerState0335, integerArgument2 + 502);
                  }
                  integerLocal13 = integerLocal13 + (2 + integerLocal11);
                }
              }
            }
          }
          MixedSupport083.sceneWidgetState0087.performAction1764(360, integerArgument2 ^ -2, 10, -10 + (-120 + SoftwareRaster.integerState0284 - 14), SoftwareRaster.integerState0285 - 360 >> 1);
          FrameTimer.sceneWidgetState0054.performAction1764(MixedSupport083.sceneWidgetState0087.integerState0896, 0, 0, 24, 0);
          MixedSupport020.sceneWidgetState0013.performAction1764(MixedSupport083.sceneWidgetState0087.integerState0896, 0, 24, MixedSupport083.sceneWidgetState0087.integerState0915 - 24, 0);
          MixedSupport020.sceneWidgetState0013.rgbSpriteArrayState0033 = RichTextLayout.computeRgbSpriteArray0390(1, -20982, 3, MixedSupport020.sceneWidgetState0013.integerState0915, 8421504, 11579568);
          RenderingSupport004.sceneWidgetState0039.performAction1764(-10 + MixedSupport020.sceneWidgetState0013.integerState0896, 0, 5, -10 + MixedSupport020.sceneWidgetState0013.integerState0915 - 24 - 2, 5);
          GameSession.sceneWidgetState0099.performAction1764(80, 0, -29 + MixedSupport020.sceneWidgetState0013.integerState0915, 24, (-80 + MixedSupport020.sceneWidgetState0013.integerState0896) / 2);
          RenderingSupport001.performAction0139((byte) -81);
          return;
        } catch (java.lang.RuntimeException caughtParameterLocal25) {
          caughtExceptionLocal8 = caughtParameterLocal25;
          runtimeExceptionLocal10 = caughtExceptionLocal8;
          throw ClientException.computeDiagnosticSupport0020365((Throwable) ((Object) runtimeExceptionLocal10), "vb.G(" + booleanArgument1 + ',' + integerArgument2 + ')');
        }
    }

    UiComponentPart032(int integerArgument1, int integerArgument2, int integerArgument3, int integerArgument4, CallbackContract004 callbackContract004Argument5) {
        super(integerArgument1, integerArgument2, integerArgument3, integerArgument4, callbackContract004Argument5);
    }

    final static int integerPower(int integerArgument1, int integerArgument2, boolean booleanArgument3) {
        int integerLocal1 = 0;
        RuntimeException runtimeExceptionLocal2 = null;
        int integerLocal3 = 0;
        int stackIntegerLocal4 = 0;
        int stackIntegerLocal5 = 0;
        RuntimeException caughtExceptionLocal6 = null;
        integerLocal3 = DekoBlokoClient.obfuscationControl ? 1 : 0;
        try {
          integerLocal1 = 1;
          if (booleanArgument3) {
            integerArrayState0238 = (int[]) null;
          }
          while (integerArgument2 > 1) {
            if ((1 & integerArgument2) != 0) {
              integerLocal1 = integerLocal1 * integerArgument1;
            }
            integerArgument1 = integerArgument1 * integerArgument1;
            integerArgument2 = integerArgument2 >> 1;
          }
          if (integerArgument2 != 1) {
            stackIntegerLocal5 = integerLocal1;
            return stackIntegerLocal5;
          }
          stackIntegerLocal4 = integerArgument1 * integerLocal1;
          return stackIntegerLocal4;
        } catch (java.lang.RuntimeException caughtParameterLocal7) {
          caughtExceptionLocal6 = caughtParameterLocal7;
          runtimeExceptionLocal2 = caughtExceptionLocal6;
          throw ClientException.computeDiagnosticSupport0020365((Throwable) ((Object) runtimeExceptionLocal2), "vb.E(" + integerArgument1 + ',' + integerArgument2 + ',' + booleanArgument3 + ')');
        }
    }

    final static String computeString1698(char characterArgument1, int integerArgument2, int integerArgument3) {
        int integerLocal1 = 0;
        int integerLocal2 = DekoBlokoClient.obfuscationControl ? 1 : 0;
        char[] characterArrayLocal3 = new char[integerArgument2];
        char[] characterArrayLocal4 = characterArrayLocal3;
        if (integerArgument3 != -12681) {
          integerArrayState0238 = (int[]) null;
        }
        for (integerLocal1 = 0; integerLocal1 < integerArgument2; integerLocal1++) {
          characterArrayLocal3[integerLocal1] = characterArgument1;
        }
        return new String(characterArrayLocal3);
    }

    abstract int computeInteger1278(boolean booleanArgument1);

    static {
        stringState0581 = "Show tutorial again";
        stringState0580 = "To Customer Support";
        integerArrayState0238 = new int[]{2, 1, 2, 3, 2, 10, 2, 10, 3, 5, 5, 1, 1, 2, 5, 2, 3, 10, 1, 2, 5, 3, 5, 5, 1, 1, 1, 1, 2, 2, 3};
    }
}
