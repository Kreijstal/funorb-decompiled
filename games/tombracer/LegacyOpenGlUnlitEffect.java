/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class LegacyOpenGlUnlitEffect extends LegacyOpenGlEffect {
    static String field_c;
    static sq field_d;

    LegacyOpenGlUnlitEffect(OpenGlToolkit param0) {
        super(param0);
    }

    final void setParameters(int param0, int param1, int param2) {
        if (param2 < 117) {
          field_c = (String) null;
        }
    }

    final void disable(boolean param0) {
        this.toolkit.setLightingSuppressed(-109, param0);
    }

    public static void releaseStatics(int param0) {
        field_c = null;
        if (param0 > -103) {
          LegacyOpenGlUnlitEffect.getAnimationSequence(114, -12, 14, -11);
          field_d = null;
          return;
        }
        field_d = null;
    }

    final static AnimationSequence getAnimationSequence(int param0, int param1, int param2, int param3) {
        int var4;
        int var5;
        var5 = TombRacer.field_G ? 1 : 0;
        if (param0 != -2) {
          return (AnimationSequence) null;
        }
        var4 = param3;
        if (var4 == 0) {
          return wl.field_f[param2][param1];
        }
        if (var4 == 1) {
          return qja.field_f[param1];
        }
        if (3 != var4) {
          throw new IllegalArgumentException("Animation category not recognised");
        }
        return LoadProfileCommand.field_p[param1];
    }

    final void refreshState(boolean param0, int param1) {
        if (param1 <= 77) {
          LegacyOpenGlTexture var4 = (LegacyOpenGlTexture) null;
          this.bindTexture(-105, 43, (LegacyOpenGlTexture) null);
        }
    }

    final boolean isSupported(int param0) {
        if (param0 != -11921) {
          this.refreshState(false, 31);
          return true;
        }
        return true;
    }

    final void bindTexture(int param0, int param1, LegacyOpenGlTexture param2) {
        try {
          if (param1 != 32221) {
            LegacyOpenGlUnlitEffect.releaseStatics(66);
          }
          this.toolkit.a(true, param2);
          this.toolkit.d(1, param0);
        } catch (RuntimeException runtimeException) {
          throw tba.wrapException((Throwable) ((Object) runtimeException), "tva.A(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final void enable(boolean param0, int param1) {
        int var3 = 73 / ((param1 - 56) / 48);
        this.toolkit.setLightingSuppressed(-55, true);
    }

    static {
        field_c = "Hide private chat and appear offline to friends";
    }
}
