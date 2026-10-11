/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class MixedSupport092 {
    static MixedSupport139 mixedSupport139State0007;
    static String stringState0369;
    static SceneWidget sceneWidgetState0091;

    final static void performAction1301(int integerArgument1, MusicTrack musicTrackArgument2, boolean booleanArgument3) {
        Object objectLocal1 = null;
        Throwable throwableLocal2 = null;
        Object stackObjectLocal3 = null;
        StringBuilder stackStringBuilderLocal4 = null;
        String stackStringLocal5 = null;
        Throwable caughtExceptionLocal6 = null;
        try {
          if (!booleanArgument3) {
            mixedSupport139State0007 = (MixedSupport139) null;
          }
          objectLocal1 = SceneWidgetNode.pcmPlayerState0002;
          synchronized (objectLocal1) {
            if (null != UiComponentPart033.midiSynthesizerState0001) {
              GameAssets.pcmStreamMixerState0004.performAction1196(UiComponentPart033.midiSynthesizerState0001);
              UiComponentPart033.midiSynthesizerState0001 = null;
            }
            if (musicTrackArgument2 != null) {
              UiComponentPart033.midiSynthesizerState0001 = new MidiSynthesizer(musicTrackArgument2);
              UiComponentPart033.midiSynthesizerState0001.performAction0769(MixedSupport001.integerState0011 * 50 / 128);
              UiComponentPart033.midiSynthesizerState0001.performAction0777(integerArgument1);
              GameAssets.pcmStreamMixerState0004.performAction1191(UiComponentPart033.midiSynthesizerState0001);
            }
            SceneWidgetNode.pcmPlayerState0002.performAction0526();
            AudioSupport004.musicTrackState0005 = musicTrackArgument2;
          }
          return;
        } catch (java.lang.RuntimeException caughtParameterLocal7) {
          caughtExceptionLocal6 = caughtParameterLocal7;
          objectLocal1 = (RuntimeException) (Object) caughtExceptionLocal6;
          stackObjectLocal3 = objectLocal1;
          stackStringBuilderLocal4 = new StringBuilder().append("nn.B(").append(integerArgument1).append(',');
          if (musicTrackArgument2 == null) {
            stackStringLocal5 = "null";
          } else {
            stackStringLocal5 = "{...}";
          }
          throw ClientException.computeDiagnosticSupport0020400((Throwable) (stackObjectLocal3), ((StringBuilder) (Object) stackStringBuilderLocal4).append(stackStringLocal5).append(',').append(booleanArgument3).append(')').toString());
        }
    }

    public static void performAction1300(int integerArgument1) {
        mixedSupport139State0007 = null;
        stringState0369 = null;
        sceneWidgetState0091 = null;
        if (integerArgument1 != 14925) {
          MixedSupport092.performAction1300(-43);
        }
    }

    final static boolean computeBoolean1302(boolean booleanArgument1, String stringArgument2, String stringArgument3) {
        String stringLocal1 = null;
        boolean stackBooleanLocal2 = false;
        RuntimeException stackRuntimeExceptionLocal3 = null;
        StringBuilder stackStringBuilderLocal4 = null;
        String stackStringLocal5 = null;
        StringBuilder stackStringBuilderLocal6 = null;
        String stackStringLocal7 = null;
        RuntimeException caughtExceptionLocal8 = null;
        RuntimeException runtimeExceptionLocal9 = null;
        try {
          stringLocal1 = MixedSupport094.computeString1307(stringArgument2, -1);
          if (booleanArgument1) {
            mixedSupport139State0007 = (MixedSupport139) null;
          }
          if (stringArgument3.indexOf(stringArgument2) == -1 &&
            -1 == stringArgument3.indexOf(stringLocal1)) {
            stackBooleanLocal2 = (stringArgument3.startsWith(stringArgument2)) || (stringArgument3.startsWith(stringLocal1)) || (stringArgument3.endsWith(stringArgument2)) || (stringArgument3.endsWith(stringLocal1));
            return stackBooleanLocal2;
          }
          return true;
        } catch (java.lang.RuntimeException caughtParameterLocal10) {
          caughtExceptionLocal8 = caughtParameterLocal10;
          runtimeExceptionLocal9 = caughtExceptionLocal8;
          stackRuntimeExceptionLocal3 = runtimeExceptionLocal9;
          stackStringBuilderLocal4 = new StringBuilder().append("nn.C(").append(booleanArgument1).append(',');
          if (stringArgument2 == null) {
            stackStringLocal5 = "null";
          } else {
            stackStringLocal5 = "{...}";
          }
          stackStringBuilderLocal6 = ((StringBuilder) (Object) stackStringBuilderLocal4).append(stackStringLocal5).append(',');
          if (stringArgument3 == null) {
            stackStringLocal7 = "null";
          } else {
            stackStringLocal7 = "{...}";
          }
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) stackRuntimeExceptionLocal3), ((StringBuilder) (Object) stackStringBuilderLocal6).append(stackStringLocal7).append(')').toString());
        }
    }

    static {
        mixedSupport139State0007 = new MixedSupport139();
        stringState0369 = "Please remove <%0> from your friend list first.";
    }
}
