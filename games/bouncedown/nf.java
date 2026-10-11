/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nf implements java.awt.event.KeyListener, java.awt.event.FocusListener {
    static String field_a;
    static String field_b;

    public final synchronized void keyReleased(java.awt.event.KeyEvent param0) {
        int var2_int = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          if (qj.field_c != null) {
            ak.field_y = 0;
            var2_int = param0.getKeyCode();
            if (var2_int >= 0 &&
              mb.field_o.length > var2_int) {
              var2_int = -129 & mb.field_o[var2_int];
            } else {
              var2_int = -1;
            }
            if (db.field_R >= 0 &&
              var2_int >= 0) {
              di.field_b[db.field_R] = ~var2_int;
              db.field_R = 127 & 1 + db.field_R;
              if (db.field_R == rj.field_g) {
                db.field_R = -1;
              }
            }
          }
          param0.consume();
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_16_0 = var2;
          stackIn_16_1 = new StringBuilder().append("nf.keyReleased(");
          if (param0 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw ii.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(')').toString());
        }
    }

    public final void focusGained(java.awt.event.FocusEvent param0) {
    }

    public final void keyTyped(java.awt.event.KeyEvent param0) {
        int var2_int = 0;
        int var3 = 0;
        try {
          if (null != qj.field_c) {
            var2_int = param0.getKeyChar();
            if (var2_int != 0 && var2_int != 65535 &&
              vf.a(-13891, (char) var2_int)) {
              var3 = Bounce.field_F + 1 & 127;
              if (oh.field_a != var3) {
                pf.field_A[Bounce.field_F] = -1;
                fk.field_b[Bounce.field_F] = (char)var2_int;
                Bounce.field_F = var3;
              }
            }
          }
          param0.consume();
        } catch (RuntimeException runtimeException) {
          throw ii.a((Throwable) ((Object) runtimeException), "nf.keyTyped(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    public final synchronized void keyPressed(java.awt.event.KeyEvent param0) {
        int var2_int = 0;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_27_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        int var3 = 0;
        int var3Lifetime1;
        try {
          if (qj.field_c == null) {
            return;
          }
          ak.field_y = 0;
          var2_int = param0.getKeyCode();
          if (0 <= var2_int &&
            mb.field_o.length > var2_int) {
            var2_int = mb.field_o[var2_int];
            if ((var2_int & 128) != 0) {
              var2_int = -1;
            }
          } else {
            var2_int = -1;
          }
          if (db.field_R >= 0 &&
            var2_int >= 0) {
            di.field_b[db.field_R] = var2_int;
            db.field_R = 127 & db.field_R + 1;
            if (rj.field_g == db.field_R) {
              db.field_R = -1;
            }
          }
          if (0 <= var2_int) {
            var3 = Bounce.field_F + 1 & 127;
            if (var3 != oh.field_a) {
              pf.field_A[Bounce.field_F] = var2_int;
              fk.field_b[Bounce.field_F] = (char)0;
              Bounce.field_F = var3;
            }
          }
          var3Lifetime1 = param0.getModifiers();
          if ((10 & var3Lifetime1) == 0 &&
            85 != var2_int &&
            var2_int != 10) {
            return;
          }
          param0.consume();
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_26_0 = var2;
          stackIn_26_1 = new StringBuilder().append("nf.keyPressed(");
          if (param0 == null) {
            stackIn_27_2 = "null";
          } else {
            stackIn_27_2 = "{...}";
          }
          throw ii.a((Throwable) ((Object) stackIn_26_0), ((StringBuilder) (Object) stackIn_26_1).append(stackIn_27_2).append(')').toString());
        }
    }

    public static void a(int param0) {
        if (param0 > -58) {
          field_b = (String) null;
          field_a = null;
          field_b = null;
          return;
        }
        field_a = null;
        field_b = null;
    }

    public final synchronized void focusLost(java.awt.event.FocusEvent param0) {
        try {
          if (qj.field_c != null) {
            db.field_R = -1;
          }
        } catch (RuntimeException runtimeException) {
          throw ii.a((Throwable) ((Object) runtimeException), "nf.focusLost(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_a = "Play the game without logging in just yet";
        field_b = "Two Player Battle";
    }
}
