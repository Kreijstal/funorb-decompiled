/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gq extends ve {
    static String thisEntryDoesnTText;
    static SpriteData[] field_o;
    static int[] field_q;

    final boolean d(int param0) {
        if (param0 != -8111) {
          this.c(-104);
          if (!this.field_m.supportsFramebufferObjects) {
            return false;
          }
          if (this.field_m.supportsFragmentShaders) {
            return this.field_m.supportsFloatTextures ? true : false;
          }
          return false;
        }
        if (!this.field_m.supportsFramebufferObjects) {
          return false;
        }
        if (this.field_m.supportsFragmentShaders) {
          return this.field_m.supportsFloatTextures ? true : false;
        }
        return false;
    }

    final void c(int param0) {
        if (param0 != 50) {
          thisEntryDoesnTText = (String) null;
        }
    }

    public static void releaseStatics(boolean param0) {
        field_q = null;
        thisEntryDoesnTText = null;
        field_o = null;
        if (param0) {
          gq.releaseStatics(true);
        }
    }

    gq(LegacyOpenGlGraphicsToolkit param0) {
        super(param0);
    }

    static {
        thisEntryDoesnTText = "This entry doesn't match";
        field_q = new int[]{0, 50, 75, 75, 100, 150};
    }
}
