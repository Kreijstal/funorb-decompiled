/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class LegacyOpenGlFloatPostProcessEffect extends LegacyOpenGlPostProcessEffect {
    static String thisEntryDoesnTText;
    static SpriteData[] field_o;
    static int[] droneBaseScores;

    final boolean isSupported(int guard) {
        if (guard != -8111) {
          this.close(-104);
          if (!this.toolkit.supportsFramebufferObjects) {
            return false;
          }
          if (this.toolkit.supportsFragmentShaders) {
            return this.toolkit.supportsFloatTextures ? true : false;
          }
          return false;
        }
        if (!this.toolkit.supportsFramebufferObjects) {
          return false;
        }
        if (this.toolkit.supportsFragmentShaders) {
          return this.toolkit.supportsFloatTextures ? true : false;
        }
        return false;
    }

    final void close(int guard) {
        if (guard != 50) {
          thisEntryDoesnTText = (String) null;
        }
    }

    public static void releaseStatics(boolean param0) {
        droneBaseScores = null;
        thisEntryDoesnTText = null;
        field_o = null;
        if (param0) {
          LegacyOpenGlFloatPostProcessEffect.releaseStatics(true);
        }
    }

    LegacyOpenGlFloatPostProcessEffect(LegacyOpenGlGraphicsToolkit owner) {
        super(owner);
    }

    static {
        thisEntryDoesnTText = "This entry doesn't match";
        droneBaseScores = new int[]{0, 50, 75, 75, 100, 150};
    }
}
