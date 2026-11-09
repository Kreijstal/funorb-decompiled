/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class SelectionOverlay {
    private boolean visible;
    int hoveredOption;

    final static void b(boolean param0) {
        int var1_int = 0;
        double var2 = 0.0;
        int var4 = 0;
        int var5 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        int var1_intLifetime1;
        var4 = Sumoblitz.field_L ? 1 : 0;
        try {
          if (!param0) {
            SelectionOverlay.a((byte) -32);
          }
          SoftwareRasterViewport.syncClip();
          sq.field_a = new int[260];
          IntrusiveDeque.field_b = 11;
          for (var1_int = 0; var1_int < 256; var1_int++) {
            var2 = 15.0;
            sq.field_a[var1_int] = (int)(255.0 * Math.pow((double)((float)var1_int / 256.0f), var2));
          }
          var5 = 256;
          var1_intLifetime1 = var5;
          while (var5 < sq.field_a.length) {
            sq.field_a[var5] = 255;
            var5++;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) var1), "qt.E(" + param0 + ')');
        }
    }

    final static LoginFieldValue a(byte param0) {
        if (param0 != 21) {
          return (LoginFieldValue) null;
        }
        String var1 = LegacyOpenGlRidgedWaterEffect.c((byte) -2);
        if (var1 != null &&
          var1.indexOf('@') >= 0) {
          var1 = "";
        }
        return new LoginFieldValue(LegacyOpenGlRidgedWaterEffect.c((byte) -2), GameApplet.a(param0 - 3));
    }

    final void hide(byte guard) {
        if (guard > -126) {
          this.visible = true;
          this.visible = false;
          return;
        }
        this.visible = false;
    }

    final boolean isVisible(boolean guard) {
        if (guard) {
          return true;
        }
        return this.visible;
    }

    final void show(int guard) {
        if (guard != 5295) {
          SelectionOverlay.b(false);
          this.visible = true;
          return;
        }
        this.visible = true;
    }

    SelectionOverlay() {
        this.hoveredOption = -1;
    }

    static {
    }
}
