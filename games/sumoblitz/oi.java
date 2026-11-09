/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class oi {
    static AccountConnectionPhase WAIT_NAME_SUGGESTIONS;
    static IntrusiveDeque field_b;
    static String field_c;
    static SpriteData field_d;

    final static boolean a(byte param0) {
        if (param0 != -64) {
          return false;
        }
        return pg.field_a;
    }

    public static void releaseStatics(boolean param0) {
        if (param0) {
          field_c = null;
          field_b = null;
          WAIT_NAME_SUGGESTIONS = null;
          field_d = null;
          return;
        }
        field_b = (IntrusiveDeque) null;
        field_c = null;
        field_b = null;
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
        field_b = new IntrusiveDeque();
    }
}
