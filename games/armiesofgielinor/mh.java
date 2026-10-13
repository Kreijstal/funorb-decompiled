/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mh {
    static ClientConnectionState field_a;
    static String field_d;
    static wm accountNameCheckState;
    static int field_c;

    final static void setEffectsGain(int gain, byte obfuscationGuard) {
        SoundPlaybackHandle handle = null;
        int obfuscationControl = 0;
        RuntimeException caughtFailure = null;
        RuntimeException failure = null;
        SoundPlaybackHandle additionalHandle;
        obfuscationControl = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          ResourceProtocolClient.effectsGain = gain;
          handle = (SoundPlaybackHandle) (QuickChatCategoryRepository.soundHandles.first((byte) 110));
          while (handle != null) {
            if (!handle.lifetimeNode.isLinked(65280)) {
              handle.unlink(-110);
            } else {
              handle.stream.setVolume(handle.unscaledVolume * ResourceProtocolClient.effectsGain + 128 >> 8);
            }
            handle = (SoundPlaybackHandle) (QuickChatCategoryRepository.soundHandles.next((byte) 123));
          }
          if (TextLineLayout.additionalSoundHandles != null) {
            additionalHandle = (SoundPlaybackHandle) (TextLineLayout.additionalSoundHandles.first((byte) 95));
            while (additionalHandle != null) {
              if (!additionalHandle.lifetimeNode.isLinked(65280)) {
                additionalHandle.unlink(47);
              } else {
                additionalHandle.stream.setVolume(128 + ResourceProtocolClient.effectsGain * additionalHandle.unscaledVolume >> 8);
              }
              additionalHandle = (SoundPlaybackHandle) (TextLineLayout.additionalSoundHandles.next((byte) 123));
            }
          }
          if (obfuscationGuard < -26) {
            return;
          }
          field_d = (String) null;
          return;
        } catch (java.lang.RuntimeException caughtParameter) {
          caughtFailure = caughtParameter;
          failure = caughtFailure;
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) failure), "mh.A(" + gain + ',' + obfuscationGuard + ')');
        }
    }

    final static int getProfileMissionScore(int campaignIndex, int obfuscationGuard, int missionIndex) {
        if (pg.playerProfile == null) {
          return 0;
        }
        if (null == pg.playerProfile.campaignProgress) {
          return 0;
        }
        if (obfuscationGuard < -111) {
          return pg.playerProfile.campaignProgress.getMissionScore(campaignIndex, 127, missionIndex);
        }
        accountNameCheckState = (wm) null;
        return pg.playerProfile.campaignProgress.getMissionScore(campaignIndex, 127, missionIndex);
    }

    public static void a(byte param0) {
        field_a = null;
        field_d = null;
        accountNameCheckState = null;
        if (param0 >= -83) {
          mh.a((byte) 62);
        }
    }

    static {
        field_a = new ClientConnectionState();
        field_d = "Guthix Awakens Highscores";
        field_c = 0;
    }
}
