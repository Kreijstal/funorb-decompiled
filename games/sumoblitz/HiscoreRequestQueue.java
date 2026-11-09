/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class HiscoreRequestQueue {
    static AccountConnectionPhase WAIT_NAME_SUGGESTIONS;
    static IntrusiveDeque pending;
    static String decodedChatText;
    static SpriteData field_d;

    final static boolean isReconnecting(byte guard) {
        if (guard != -64) {
          return false;
        }
        return ReconnectState.reconnecting;
    }

    public static void releaseStatics(boolean param0) {
        if (param0) {
          decodedChatText = null;
          pending = null;
          WAIT_NAME_SUGGESTIONS = null;
          field_d = null;
          return;
        }
        pending = (IntrusiveDeque) null;
        decodedChatText = null;
        pending = null;
        WAIT_NAME_SUGGESTIONS = null;
        field_d = null;
    }

    final static void shutdownAudioOutputs(int guard) {
        if (EmailCredentials.field_f != null) {
          EmailCredentials.field_f.shutdown();
          if (guard == -27864) {
            if (null == LegacyOpenGlEffectManager.field_a) {
              return;
            }
            LegacyOpenGlEffectManager.field_a.shutdown();
            return;
          }
          field_d = (SpriteData) null;
          if (null != LegacyOpenGlEffectManager.field_a) {
            LegacyOpenGlEffectManager.field_a.shutdown();
            return;
          }
          return;
        }
        if (guard != -27864) {
          field_d = (SpriteData) null;
          if (null == LegacyOpenGlEffectManager.field_a) {
            return;
          }
          LegacyOpenGlEffectManager.field_a.shutdown();
          return;
        }
        if (null == LegacyOpenGlEffectManager.field_a) {
          return;
        }
        LegacyOpenGlEffectManager.field_a.shutdown();
    }

    static {
        WAIT_NAME_SUGGESTIONS = new AccountConnectionPhase();
        pending = new IntrusiveDeque();
    }
}
