/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class MixedSupport083 {
    static MixedSupport139 mixedSupport139State0006;

    final static void performAction1128(boolean booleanArgument1, int integerArgument2, int integerArgument3) {
        int integerLocal1;
        String stringLocal2;
        Object objectLocal3;
        String stringLocal4;
        CharSequence charSequenceLocal5;
        Object objectLocal6;
        Object objectLocal7;
        if (integerArgument2 != 0) {
          return;
        }
        if (null == MixedSupport146.sceneWidgetPart004State0001) {
          return;
        }
        integerLocal1 = MixedSupport146.sceneWidgetPart004State0001.computeInteger0678((byte) -63, booleanArgument1);
        if (integerLocal1 == 0) {
          return;
        }
        if (integerLocal1 != 2) {
          MixedSupport146.sceneWidgetPart004State0001 = null;
          ResourceSupport003.integerState0555 = -1;
          return;
        }
        if (null == MixedSupport146.sceneWidgetPart004State0001.stringState0598) {
          MixedSupport146.sceneWidgetPart004State0001 = null;
          ResourceSupport003.integerState0555 = -1;
          return;
        }
        if (MixedSupport146.sceneWidgetPart004State0001.stringState0598.equals("")) {
          MixedSupport146.sceneWidgetPart004State0001 = null;
          ResourceSupport003.integerState0555 = -1;
          return;
        }
        if (MixedSupport146.sceneWidgetPart004State0001.stringState0598.charAt(0) != 91) {
          charSequenceLocal5 = (CharSequence) ((Object) MixedSupport146.sceneWidgetPart004State0001.stringState0598);
          stringLocal2 = ComponentContainer.computeString1011(charSequenceLocal5, (byte) 2);
          objectLocal3 = stringLocal2;
          objectLocal7 = stringLocal2;
        } else {
          stringLocal2 = MixedSupport146.sceneWidgetPart004State0001.stringState0598;
        }
        objectLocal6 = null;
        if (ResourceSupport003.integerState0555 == 0) {
          objectLocal6 = MixedSupport112.computeString1593(integerArgument3, integerArgument2 + 0, stringLocal2);
        }
        if (ResourceSupport003.integerState0555 == 1) {
          objectLocal6 = UiComponentPart018.computeString1161(integerArgument3, stringLocal2, false);
        }
        if (ResourceSupport003.integerState0555 == 2) {
          objectLocal6 = NetworkSupport003.computeString0383(stringLocal2, 127, integerArgument3);
        }
        if (ResourceSupport003.integerState0555 == 3) {
          objectLocal6 = InputAdapter006.computeString1696(stringLocal2, stringLocal2, integerArgument3, (byte) 125);
        }
        if (objectLocal6 == null) {
          MixedSupport146.sceneWidgetPart004State0001 = null;
          ResourceSupport003.integerState0555 = -1;
          return;
        }
        stringLocal4 = (String) null;
        UiComponentPart004.performAction0200(stringLocal2, (String) null, (String) (objectLocal6), (byte) -37, 2, 0);
        MixedSupport146.sceneWidgetPart004State0001 = null;
        ResourceSupport003.integerState0555 = -1;
        return;
    }

    final static boolean computeBoolean1125(int integerArgument1, byte byteArgument2) {
        if (integerArgument1 < 0) {
          return 0 == (1 + integerArgument1) % 4 ? true : false;
        }
        if (integerArgument1 < 1582) {
          return integerArgument1 % 4 == 0 ? true : false;
        }
        if (integerArgument1 % 4 != 0) {
          return false;
        }
        if (integerArgument1 % 100 != 0) {
          return true;
        }
        if (0 != integerArgument1 % 400) {
          return false;
        }
        if (byteArgument2 <= -12) {
          return true;
        }
        mixedSupport139State0006 = (MixedSupport139) null;
        return true;
    }

    final static SceneWidgetPart005 computeSceneWidgetPart0051127(SceneWidget sceneWidgetArgument1, SceneWidget sceneWidgetArgument2, MixedSupport003 mixedSupport003Argument3, SceneWidget sceneWidgetArgument4, int integerArgument5) {
        int integerLocal1 = 0;
        Object stackObjectLocal2 = null;
        int stackIntegerLocal3 = 0;
        int stackIntegerLocal4 = 0;
        SceneWidgetPart005 stackSceneWidgetPart005Local5 = null;
        SceneWidgetPart005 stackSceneWidgetPart005Local6 = null;
        RuntimeException stackRuntimeExceptionLocal7 = null;
        StringBuilder stackStringBuilderLocal8 = null;
        String stackStringLocal9 = null;
        StringBuilder stackStringBuilderLocal10 = null;
        String stackStringLocal11 = null;
        StringBuilder stackStringBuilderLocal12 = null;
        String stackStringLocal13 = null;
        StringBuilder stackStringBuilderLocal14 = null;
        String stackStringLocal15 = null;
        RuntimeException caughtExceptionLocal16 = null;
        int integerLocal17 = 0;
        RuntimeException runtimeExceptionLocal18 = null;
        int integerLocal19 = 0;
        int integerLocal20 = 0;
        String[] stringArrayLocal21 = null;
        char[] characterArrayLocal22 = null;
        int[] integerArrayLocal23 = null;
        SceneWidgetPart005[] sceneWidgetPart005ArrayLocal24 = null;
        int integerLocal25 = 0;
        MixedSupport003 mixedSupport003Local26 = null;
        int integerLocal27 = 0;
        int integerLocal28 = 0;
        NetworkSupport007 networkSupport007Local29 = null;
        int integerLocal30 = 0;
        int[] integerArrayLocal31 = null;
        char[] characterArrayLocal32 = null;
        int[] integerArrayLocal33 = null;
        char[] characterArrayLocal34 = null;
        int integerLocal35;
        integerLocal30 = DekoBlokoClient.obfuscationControl ? 1 : 0;
        try {
          if (mixedSupport003Argument3 == null) {
            stackObjectLocal2 = null;
            return (SceneWidgetPart005) (stackObjectLocal2);
          }
          if (mixedSupport003Argument3.integerArrayState0004 == null) {
            stackIntegerLocal3 = 0;
          } else {
            stackIntegerLocal3 = mixedSupport003Argument3.integerArrayState0004.length;
          }
          integerLocal17 = stackIntegerLocal3;
          if (null != mixedSupport003Argument3.integerArrayState0005) {
            stackIntegerLocal4 = mixedSupport003Argument3.integerArrayState0005.length;
          } else {
            stackIntegerLocal4 = 0;
          }
          integerLocal19 = stackIntegerLocal4;
          integerLocal20 = integerLocal17 + integerLocal19;
          stringArrayLocal21 = new String[integerLocal20];
          if (integerArgument5 != 0) {
            stackSceneWidgetPart005Local5 = (SceneWidgetPart005) null;
            return stackSceneWidgetPart005Local5;
          }
          characterArrayLocal34 = new char[integerLocal20];
          characterArrayLocal32 = characterArrayLocal34;
          characterArrayLocal22 = characterArrayLocal32;
          integerArrayLocal33 = new int[integerLocal20];
          integerArrayLocal31 = integerArrayLocal33;
          integerArrayLocal23 = integerArrayLocal31;
          sceneWidgetPart005ArrayLocal24 = new SceneWidgetPart005[integerLocal20];
          if (null != mixedSupport003Argument3.integerArrayState0004) {
            for (integerLocal25 = 0; mixedSupport003Argument3.integerArrayState0004.length > integerLocal25; integerLocal25++) {
              mixedSupport003Local26 = ReturnedShapeCache.mixedSupport032State0001.computeMixedSupport0030522(-126, mixedSupport003Argument3.integerArrayState0004[integerLocal25]);
              stringArrayLocal21[integerLocal25] = mixedSupport003Local26.stringState0008;
              characterArrayLocal22[integerLocal25] = mixedSupport003Argument3.characterArrayState0001[integerLocal25];
              sceneWidgetPart005ArrayLocal24[integerLocal25] = MixedSupport083.computeSceneWidgetPart0051127(sceneWidgetArgument1, sceneWidgetArgument2, mixedSupport003Local26, sceneWidgetArgument4, 0);
            }
          }
          if (mixedSupport003Argument3.integerArrayState0005 != null) {
            integerLocal35 = integerLocal17;
            integerLocal27 = 49;
            for (integerLocal1 = 0; mixedSupport003Argument3.integerArrayState0005.length > integerLocal1; integerLocal1++) {
              integerLocal28 = mixedSupport003Argument3.integerArrayState0005[integerLocal1];
              if (-1 == integerLocal28) {
                stringArrayLocal21[integerLocal1 + integerLocal35] = UiComponentPart012.stringState0207;
                characterArrayLocal22[integerLocal35 + integerLocal1] = mixedSupport003Argument3.characterArrayState0002[integerLocal1];
                integerArrayLocal23[integerLocal35 + integerLocal1] = mixedSupport003Argument3.integerArrayState0005[integerLocal1];
              } else {
                networkSupport007Local29 = UiComponentPart033.networkSupport012State0001.computeNetworkSupport0071741(126, integerLocal28);
                stringArrayLocal21[integerLocal1 + integerLocal35] = networkSupport007Local29.computeString1172((byte) -81);
                characterArrayLocal22[integerLocal35 + integerLocal1] = mixedSupport003Argument3.characterArrayState0002[integerLocal1];
                if (characterArrayLocal22[integerLocal35 + integerLocal1] <= 0) {
                  integerLocal27 = (char)(integerLocal27 + 1);
                  characterArrayLocal22[integerLocal1 + integerLocal35] = (char)integerLocal27;
                }
                integerArrayLocal23[integerLocal35 + integerLocal1] = mixedSupport003Argument3.integerArrayState0005[integerLocal1];
              }
            }
          }
          stackSceneWidgetPart005Local6 = new SceneWidgetPart005(0L, sceneWidgetArgument1, sceneWidgetArgument4, sceneWidgetArgument2, sceneWidgetPart005ArrayLocal24, integerArrayLocal33, stringArrayLocal21, characterArrayLocal34);
          return stackSceneWidgetPart005Local6;
        } catch (java.lang.RuntimeException caughtParameterLocal36) {
          caughtExceptionLocal16 = caughtParameterLocal36;
          runtimeExceptionLocal18 = caughtExceptionLocal16;
          stackRuntimeExceptionLocal7 = runtimeExceptionLocal18;
          stackStringBuilderLocal8 = new StringBuilder().append("ll.A(");
          if (sceneWidgetArgument1 == null) {
            stackStringLocal9 = "null";
          } else {
            stackStringLocal9 = "{...}";
          }
          stackStringBuilderLocal10 = ((StringBuilder) (Object) stackStringBuilderLocal8).append(stackStringLocal9).append(',');
          if (sceneWidgetArgument2 == null) {
            stackStringLocal11 = "null";
          } else {
            stackStringLocal11 = "{...}";
          }
          stackStringBuilderLocal12 = ((StringBuilder) (Object) stackStringBuilderLocal10).append(stackStringLocal11).append(',');
          if (mixedSupport003Argument3 == null) {
            stackStringLocal13 = "null";
          } else {
            stackStringLocal13 = "{...}";
          }
          stackStringBuilderLocal14 = ((StringBuilder) (Object) stackStringBuilderLocal12).append(stackStringLocal13).append(',');
          if (sceneWidgetArgument4 == null) {
            stackStringLocal15 = "null";
          } else {
            stackStringLocal15 = "{...}";
          }
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) stackRuntimeExceptionLocal7), ((StringBuilder) (Object) stackStringBuilderLocal14).append(stackStringLocal15).append(',').append(integerArgument5).append(')').toString());
        }
    }

    public static void performAction1124(int integerArgument1) {
        mixedSupport139State0006 = null;
        if (integerArgument1 < 29) {
          mixedSupport139State0006 = (MixedSupport139) null;
        }
    }

    final static void performAction1126(int integerArgument1, boolean booleanArgument2) {
        if (integerArgument1 != -1) {
          return;
        }
        MixedSupport033.performAction0545(2, booleanArgument2);
        MixedSupport036.performAction0559(integerArgument1 + 6, booleanArgument2);
    }

    static {
        mixedSupport139State0006 = new MixedSupport139();
    }
}
