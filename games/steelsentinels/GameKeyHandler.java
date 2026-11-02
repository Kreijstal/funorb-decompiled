/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class GameKeyHandler implements java.awt.event.KeyListener, java.awt.event.FocusListener {
    static String[] field_d;
    static SentinelDesigner[] field_e;
    static String field_c;
    static String field_b;
    static String field_a;

    public static void a(byte param0) {
        int var1 = -36 % ((-59 - param0) / 57);
        field_e = null;
        field_a = null;
        field_d = null;
        field_b = null;
        field_c = null;
    }

    public final synchronized void focusLost(java.awt.event.FocusEvent param0) {
        try {
          if (MouseInputHandler.field_i != null) {
            SentinelAnimationEditor.field_h = -1;
          }
        } catch (RuntimeException runtimeException) {
          throw ci.a((Throwable) ((Object) runtimeException), "i.focusLost(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    public final void keyTyped(java.awt.event.KeyEvent param0) {
        int var2_int = 0;
        int var3 = 0;
        try {
          if (MouseInputHandler.field_i != null) {
            var2_int = param0.getKeyChar();
            if (var2_int != 0 &&
              var2_int != 65535 &&
              ak.a(-2036, (char) var2_int)) {
              var3 = 127 & 1 + BoundedUrlRequest.field_e;
              if (ad.field_b != var3) {
                kk.field_b[BoundedUrlRequest.field_e] = -1;
                DelegatingCanvas.field_b[BoundedUrlRequest.field_e] = (char)var2_int;
                BoundedUrlRequest.field_e = var3;
              }
            }
          }
          param0.consume();
        } catch (RuntimeException runtimeException) {
          throw ci.a((Throwable) ((Object) runtimeException), "i.keyTyped(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    public final void focusGained(java.awt.event.FocusEvent param0) {
    }

    public final synchronized void keyPressed(java.awt.event.KeyEvent param0) {
        int var2_int = 0;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_26_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        int var3 = 0;
        int var3Lifetime1;
        try {
          if (MouseInputHandler.field_i != null) {
            km.field_f = 0;
            var2_int = param0.getKeyCode();
            if (var2_int >= 0 &&
              SentinelAnimationEditor.field_a.length > var2_int) {
              var2_int = SentinelAnimationEditor.field_a[var2_int];
              if ((128 & var2_int) != 0) {
                var2_int = -1;
              }
            } else {
              var2_int = -1;
            }
            if (0 <= SentinelAnimationEditor.field_h &&
              var2_int >= 0) {
              ni.field_b[SentinelAnimationEditor.field_h] = var2_int;
              SentinelAnimationEditor.field_h = 1 + SentinelAnimationEditor.field_h & 127;
              if (SentinelAnimationEditor.field_h == hh.field_b) {
                SentinelAnimationEditor.field_h = -1;
              }
            }
            if (var2_int >= 0) {
              var3 = BoundedUrlRequest.field_e + 1 & 127;
              if (ad.field_b != var3) {
                kk.field_b[BoundedUrlRequest.field_e] = var2_int;
                DelegatingCanvas.field_b[BoundedUrlRequest.field_e] = (char)0;
                BoundedUrlRequest.field_e = var3;
              }
            }
            var3Lifetime1 = param0.getModifiers();
            if ((var3Lifetime1 & 10) == 0 &&
              var2_int != 85 &&
              var2_int != 10) {
              return;
            }
            param0.consume();
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_25_0 = var2;
          stackIn_25_1 = new StringBuilder().append("i.keyPressed(");
          if (param0 == null) {
            stackIn_26_2 = "null";
          } else {
            stackIn_26_2 = "{...}";
          }
          throw ci.a((Throwable) ((Object) stackIn_25_0), ((StringBuilder) (Object) stackIn_25_1).append(stackIn_26_2).append(')').toString());
        }
    }

    public final synchronized void keyReleased(java.awt.event.KeyEvent param0) {
        RuntimeException runtimeException = null;
        int var2_int = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (MouseInputHandler.field_i != null) {
            km.field_f = 0;
            var2_int = param0.getKeyCode();
            if (var2_int >= 0 &&
              var2_int < SentinelAnimationEditor.field_a.length) {
              var2_int = -129 & SentinelAnimationEditor.field_a[var2_int];
            } else {
              var2_int = -1;
            }
            if (0 <= SentinelAnimationEditor.field_h &&
              var2_int >= 0) {
              ni.field_b[SentinelAnimationEditor.field_h] = ~var2_int;
              SentinelAnimationEditor.field_h = 127 & 1 + SentinelAnimationEditor.field_h;
              if (hh.field_b == SentinelAnimationEditor.field_h) {
                SentinelAnimationEditor.field_h = -1;
              }
            }
          }
          param0.consume();
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_15_0 = runtimeException;
          stackIn_15_1 = new StringBuilder().append("i.keyReleased(");
          if (param0 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw ci.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(')').toString());
        }
    }

    static {
        field_a = "This control is disabled. To enable it, click on <col=1f76a6><%0></col> in the options menu.";
        field_b = "Unrated game";
        field_c = "Asking for or providing contact information";
        field_d = new String[]{"Connecting to update server", "Verbinde mit Aktualisierungsserver", "Connexion au serveur de mise à jour", "Conectando ao servidor de atualização", "Met updateserver verbinden", "Connecting to update server (untranslated)"};
        field_e = new SentinelDesigner[23];
    }
}
