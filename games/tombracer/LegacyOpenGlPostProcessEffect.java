/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class LegacyOpenGlPostProcessEffect extends IntrusiveNode {
    boolean enabled;
    OpenGlToolkit toolkit;
    static long field_f;

    abstract void apply(LegacyOpenGlTexture2D param0, int param1, byte param2, LegacyOpenGlTexture2D param3);

    final static void a(boolean param0) {
        TileOperator.field_p = param0 ? true : false;
        LoadProfileCommand.field_r = false;
        jsa.a(false, -1);
        LegacyOpenGlTexture.field_a = fta.field_c;
        wt.field_d = fta.field_c;
    }

    final boolean isEnabled(byte param0) {
        if (param0 > -91) {
          field_f = 125L;
          return this.enabled;
        }
        return this.enabled;
    }

    abstract void endPass(int param0, byte param1);

    final boolean a(int param0) {
        if (param0 != 1) {
          this.enabled = true;
          return false;
        }
        return false;
    }

    int getPassCount(int param0) {
        if (param0 != 13727) {
          this.initialize((byte) 63);
          return 0;
        }
        return 0;
    }

    abstract boolean isInitialized(byte param0);

    abstract void resize(int param0, byte param1, int param2);

    abstract boolean initialize(byte param0);

    abstract void release(byte param0);

    final int c(int param0) {
        if (param0 != 1) {
          return -49;
        }
        return 1;
    }

    LegacyOpenGlPostProcessEffect(OpenGlToolkit param0) {
        try {
          this.toolkit = param0;
        } catch (RuntimeException runtimeException) {
          throw tba.a((Throwable) ((Object) runtimeException), "oga.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
    }
}
