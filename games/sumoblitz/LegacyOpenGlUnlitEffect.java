/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class LegacyOpenGlUnlitEffect extends LegacyOpenGlEffect {
    static int field_f;
    static int field_e;

    final void setParameters(byte guard, int parameters0, int parameters1) {
        if (guard <= 39) {
          field_e = -61;
        }
    }

    LegacyOpenGlUnlitEffect(LegacyOpenGlGraphicsToolkit owner) {
        super(owner);
    }

    final boolean isSupported(byte guard) {
        if (guard > -64) {
          CharSequence var3 = (CharSequence) null;
          LegacyOpenGlUnlitEffect.isIntegerInRadix(-87, (CharSequence) null, 43, true);
          return true;
        }
        return true;
    }

    final void bindTexture(byte guard, int combineMode, LegacyOpenGlTexture texture) {
        try {
          this.toolkit.bindTexture(guard + 45, texture);
          if (guard != 35) {
            this.enable((byte) -49, true);
          }
          this.toolkit.setTextureCombineMode(combineMode, true);
        } catch (RuntimeException runtimeException) {
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) runtimeException), "ra.A(" + guard + ',' + combineMode + ',' + (texture != null ? "{...}" : "null") + ')');
        }
    }

    final void refreshState(int guard, boolean lighting) {
        if (guard > -30) {
          this.isSupported((byte) -11);
        }
    }

    final void enable(byte guard, boolean lighting) {
        this.toolkit.setLightingSuppressed(true, (byte) -74);
        if (guard < 33) {
          this.setParameters((byte) 55, 7, -88);
        }
    }

    final void disable(int guard) {
        if (guard >= -125) {
          field_e = 78;
          this.toolkit.setLightingSuppressed(false, (byte) -81);
          return;
        }
        this.toolkit.setLightingSuppressed(false, (byte) -81);
    }

    final static java.applet.Applet activeApplet(int guard) {
        if (guard != 2) {
          LegacyOpenGlUnlitEffect.activeApplet(-55);
          if (OpenGlShader.field_c != null) {
            return OpenGlShader.field_c;
          }
          return (java.applet.Applet) ((Object) AppletInstanceState.activeApplet);
        }
        if (OpenGlShader.field_c != null) {
          return OpenGlShader.field_c;
        }
        return (java.applet.Applet) ((Object) AppletInstanceState.activeApplet);
    }

    final static boolean isIntegerInRadix(int radix, CharSequence text, int guard, boolean allowPlus) {
        int var8 = 0;
        int stackIn_43_0 = 0;
        RuntimeException stackIn_46_0 = null;
        StringBuilder stackIn_46_1 = null;
        String stackIn_47_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        var11 = Sumoblitz.field_L ? 1 : 0;
        try {
          if (guard != -46) {
            LegacyOpenGlUnlitEffect.activeApplet(-41);
          }
          if (2 <= radix &&
            radix <= 36) {
            var4_int = 0;
            var5 = 0;
            var6 = 0;
            var7 = text.length();
            for (var8 = 0; var7 > var8; var8++) {
              boolean decompiledFrameRemainder0 = true;
              var9 = text.charAt(var8);
              if ((var8 == 0) &&
                (var9 == 45)) {
                var4_int = 1;
                decompiledFrameRemainder0 = false;
              }
              if ((decompiledFrameRemainder0) && (var8 != 0 || (var9 != 43 ||
                !allowPlus))) {
                if (var9 >= 48 &&
                  var9 <= 57) {
                  var9 -= 48;
                } else if (var9 >= 65 &&
                  var9 <= 90) {
                  var9 -= 55;
                } else {
                  if (var9 < 97) {
                    return false;
                  }
                  if (122 < var9) {
                    return false;
                  }
                  var9 -= 87;
                }
                if (var9 >= radix) {
                  return false;
                }
                if (var4_int != 0) {
                  var9 = -var9;
                }
                var10 = var6 * radix + var9;
                if (var10 / radix != var6) {
                  return false;
                }
                var6 = var10;
                var5 = 1;
              }
            }
            stackIn_43_0 = var5;
            return stackIn_43_0 != 0;
          }
          throw new IllegalArgumentException("" + radix);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_46_0 = var4;
          stackIn_46_1 = new StringBuilder().append("ra.C(").append(radix).append(',');
          if (text == null) {
            stackIn_47_2 = "null";
          } else {
            stackIn_47_2 = "{...}";
          }
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) stackIn_46_0), ((StringBuilder) (Object) stackIn_46_1).append(stackIn_47_2).append(',').append(guard).append(',').append(allowPlus).append(')').toString());
        }
    }

    static {
        field_e = 0;
    }
}
