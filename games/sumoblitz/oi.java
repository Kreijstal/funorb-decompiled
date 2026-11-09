/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class oi {
    static qr field_a;
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
          field_a = null;
          field_d = null;
          return;
        }
        field_b = (IntrusiveDeque) null;
        field_c = null;
        field_b = null;
        field_a = null;
        field_d = null;
    }

    final static void shutdownAudioOutputs(int guard) {
        if (wd.field_f != null) {
          wd.field_f.shutdown();
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
        field_a = new qr();
        field_b = new IntrusiveDeque();
    }
}
