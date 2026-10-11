/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class InputAdapter003 {
    static PcmStreamMixer pcmStreamMixerState0002;
    static RawSound rawSoundState0009;
    static MixedSupport066 mixedSupport066State0004;
    static SceneWidget sceneWidgetState0050;
    static int[][] integerArrayArrayState0010;

    abstract int computeInteger0056(int integerArgument1);

    final static void performAction0751(TextLineMetrics textLineMetricsArgument1, BitmapFont bitmapFontArgument2, int integerArgument3, String stringArgument4, int integerArgument5) {
        int integerLocal1 = 0;
        RuntimeException stackRuntimeExceptionLocal2 = null;
        StringBuilder stackStringBuilderLocal3 = null;
        String stackStringLocal4 = null;
        StringBuilder stackStringBuilderLocal5 = null;
        String stackStringLocal6 = null;
        StringBuilder stackStringBuilderLocal7 = null;
        String stackStringLocal8 = null;
        RuntimeException caughtExceptionLocal9 = null;
        int integerLocal10 = 0;
        RuntimeException runtimeExceptionLocal11 = null;
        int integerLocal12 = 0;
        int integerLocal13 = 0;
        int integerLocal14 = 0;
        integerLocal14 = DekoBlokoClient.obfuscationControl ? 1 : 0;
        try {
          integerLocal10 = 0;
          integerLocal12 = integerArgument5;
          for (integerLocal1 = 1; stringArgument4.length() > integerLocal1; integerLocal1++) {
            integerLocal13 = stringArgument4.charAt(integerLocal1);
            if (integerLocal13 == 60) {
              integerLocal12 = textLineMetricsArgument1.characterXPositions[0] + ((integerLocal10 >> 8) + bitmapFontArgument2.computeInteger1208(stringArgument4.substring(0, integerLocal1)));
            }
            if (-1 != integerLocal12) {
              textLineMetricsArgument1.characterXPositions[integerLocal1] = integerLocal12;
            } else {
              if (32 == integerLocal13) {
                integerLocal10 = integerLocal10 + integerArgument3;
              }
              textLineMetricsArgument1.characterXPositions[integerLocal1] = (integerLocal10 >> 8) + textLineMetricsArgument1.characterXPositions[0] - (-bitmapFontArgument2.computeInteger1208(stringArgument4.substring(0, integerLocal1 + 1)) + bitmapFontArgument2.computeInteger1206((char) integerLocal13));
            }
            if (integerLocal13 == 62) {
              integerLocal12 = -1;
            }
          }
          return;
        } catch (java.lang.RuntimeException caughtParameterLocal15) {
          caughtExceptionLocal9 = caughtParameterLocal15;
          runtimeExceptionLocal11 = caughtExceptionLocal9;
          stackRuntimeExceptionLocal2 = runtimeExceptionLocal11;
          stackStringBuilderLocal3 = new StringBuilder().append("hm.B(");
          if (textLineMetricsArgument1 == null) {
            stackStringLocal4 = "null";
          } else {
            stackStringLocal4 = "{...}";
          }
          stackStringBuilderLocal5 = ((StringBuilder) (Object) stackStringBuilderLocal3).append(stackStringLocal4).append(',');
          if (bitmapFontArgument2 == null) {
            stackStringLocal6 = "null";
          } else {
            stackStringLocal6 = "{...}";
          }
          stackStringBuilderLocal7 = ((StringBuilder) (Object) stackStringBuilderLocal5).append(stackStringLocal6).append(',').append(integerArgument3).append(',');
          if (stringArgument4 == null) {
            stackStringLocal8 = "null";
          } else {
            stackStringLocal8 = "{...}";
          }
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) stackRuntimeExceptionLocal2), ((StringBuilder) (Object) stackStringBuilderLocal7).append(stackStringLocal8).append(',').append(integerArgument5).append(')').toString());
        }
    }

    public static void performAction0753(int integerArgument1) {
        pcmStreamMixerState0002 = null;
        rawSoundState0009 = null;
        sceneWidgetState0050 = null;
        int integerLocal1 = -36 / ((integerArgument1 + 11) / 52);
        mixedSupport066State0004 = null;
        integerArrayArrayState0010 = (int[][]) null;
    }

    abstract void performAction0057(int integerArgument1, java.awt.Component componentArgument2);

    final static void performAction0749(int integerArgument1, byte byteArgument2) {
        if (byteArgument2 >= -101) {
          return;
        }
        UiComponentPart001.integerState0034 = integerArgument1;
    }

    final static MixedSupport043 computeMixedSupport0430752(boolean booleanArgument1, String stringArgument2, String stringArgument3, int integerArgument4) {
        long longLocal1 = 0L;
        RuntimeException runtimeExceptionLocal2 = null;
        Object objectLocal3 = null;
        CharSequence charSequenceLocal4 = null;
        MixedSupport043 stackMixedSupport043Local5 = null;
        RuntimeException stackRuntimeExceptionLocal6 = null;
        StringBuilder stackStringBuilderLocal7 = null;
        String stackStringLocal8 = null;
        StringBuilder stackStringBuilderLocal9 = null;
        String stackStringLocal10 = null;
        RuntimeException caughtExceptionLocal11 = null;
        try {
          if (integerArgument4 != 9507) {
            rawSoundState0009 = (RawSound) null;
          }
          longLocal1 = 0L;
          objectLocal3 = null;
          if (stringArgument3.indexOf('@') != -1) {
            objectLocal3 = stringArgument3;
          } else {
            charSequenceLocal4 = (CharSequence) ((Object) stringArgument3);
            longLocal1 = DualNodeDeque.computeLong0031(121, charSequenceLocal4);
          }
          stackMixedSupport043Local5 = MixedSupport118.computeMixedSupport0431675(longLocal1, stringArgument2, booleanArgument1, (String) (objectLocal3), 0);
          return stackMixedSupport043Local5;
        } catch (java.lang.RuntimeException caughtParameterLocal12) {
          caughtExceptionLocal11 = caughtParameterLocal12;
          runtimeExceptionLocal2 = caughtExceptionLocal11;
          stackRuntimeExceptionLocal6 = runtimeExceptionLocal2;
          stackStringBuilderLocal7 = new StringBuilder().append("hm.D(").append(booleanArgument1).append(',');
          if (stringArgument2 == null) {
            stackStringLocal8 = "null";
          } else {
            stackStringLocal8 = "{...}";
          }
          stackStringBuilderLocal9 = ((StringBuilder) (Object) stackStringBuilderLocal7).append(stackStringLocal8).append(',');
          if (stringArgument3 == null) {
            stackStringLocal10 = "null";
          } else {
            stackStringLocal10 = "{...}";
          }
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) stackRuntimeExceptionLocal6), ((StringBuilder) (Object) stackStringBuilderLocal9).append(stackStringLocal10).append(',').append(integerArgument4).append(')').toString());
        }
    }

    abstract void performAction0058(java.awt.Component componentArgument1, int integerArgument2);

    final static void performAction0750(int integerArgument1, boolean booleanArgument2) {
        if (null != MixedSupport122.stringState0515) {
          SceneWidgetPart009.performAction1516(MixedSupport122.stringState0515, -2);
        }
        if (SceneWidget.mixedSupport104State0001 != null) {
          SceneWidget.mixedSupport104State0001.performAction1401((byte) 39, booleanArgument2);
        }
        UiComponentPart027.performAction1587(booleanArgument2, 4028);
        if (integerArgument1 != -1) {
          rawSoundState0009 = (RawSound) null;
          if (null != MixedSupport102.sceneWidgetPart007State0001) {
            MixedSupport102.sceneWidgetPart007State0001.performAction1997(1141039778, booleanArgument2);
            UiComponentPart017.performAction1080(booleanArgument2, -123);
            return;
          }
          UiComponentPart017.performAction1080(booleanArgument2, -123);
          return;
        }
        if (null == MixedSupport102.sceneWidgetPart007State0001) {
          UiComponentPart017.performAction1080(booleanArgument2, -123);
          return;
        }
        MixedSupport102.sceneWidgetPart007State0001.performAction1997(1141039778, booleanArgument2);
        UiComponentPart017.performAction1080(booleanArgument2, -123);
    }

    static {
        mixedSupport066State0004 = new MixedSupport066();
        integerArrayArrayState0010 = (int[][]) null;
    }
}
