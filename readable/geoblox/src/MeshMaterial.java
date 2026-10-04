/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class MeshMaterial {
    int baseRgb;

    final static void inspectAppletUsernameParameter(java.applet.Applet applet, int methodGuard) {
        int guardRemainder = 0;
        RuntimeException inspectionFailureForContext = null;
        String usernameParameter = null;
        CharSequence usernameCharacters = null;
        RuntimeException inspectionFailureBeforeDescription = null;
        StringBuilder inspectionMessagePrefix = null;
        String appletDescription = null;
        RuntimeException caughtInspectionFailure = null;
        try {
          guardRemainder = 126 % ((-26 - methodGuard) / 49);
          usernameParameter = applet.getParameter("username");
          if (usernameParameter != null) {
            usernameCharacters = (CharSequence) ((Object) usernameParameter);
            if (0L != ResourceArchive.encodeBase37Name(usernameCharacters, -48)) {
              return;
            }
          }
          return;
        } catch (java.lang.RuntimeException inspectionFailure) {
          caughtInspectionFailure = inspectionFailure;
          inspectionFailureForContext = caughtInspectionFailure;
          inspectionFailureBeforeDescription = inspectionFailureForContext;
          inspectionMessagePrefix = new StringBuilder().append("fd.A(");
          if (applet == null) {
            appletDescription = "null";
          } else {
            appletDescription = "{...}";
          }
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) inspectionFailureBeforeDescription), ((StringBuilder) (Object) inspectionMessagePrefix).append(appletDescription).append(',').append(methodGuard).append(')').toString());
        }
    }

    final static void playDelayedSoundSample(int delayMillis, PcmSample sample, boolean skipMixerRegistration, int volume) {
        PcmSampleStream sampleStream = PcmSampleStream.createForPlaybackRate(sample, 100, volume);
        DelayedPcmStream delayedStream = ProgressDialog.delayStreamByMillis(delayMillis, sampleStream, 1000);
        PrefixCodeDecoder.trackedSoundEffectStreams.addLast(-103, new TrackedPcmStream(sampleStream, delayedStream));
        if (skipMixerRegistration) {
            return;
        }
        try {
            WhirlpoolHash.gameSoundMixer.addChildStream(delayedStream);
        } catch (RuntimeException playbackFailure) {
            throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) playbackFailure), "fd.B(" + delayMillis + ',' + (sample != null ? "{...}" : "null") + ',' + skipMixerRegistration + ',' + volume + ')');
        }
    }

    static {
    }
}
