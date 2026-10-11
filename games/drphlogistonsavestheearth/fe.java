/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fe implements java.awt.event.KeyListener, java.awt.event.FocusListener {
    static int field_a;
    static String field_b;

    public final synchronized void focusLost(java.awt.event.FocusEvent param0) {
        try {
          if (ji.field_c != null) {
            gm.field_O = -1;
          }
        } catch (RuntimeException runtimeException) {
          throw ie.a((Throwable) ((Object) runtimeException), "fe.focusLost(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    public final void keyTyped(java.awt.event.KeyEvent param0) {
        int var2_int = 0;
        int var3 = 0;
        try {
          if (null != ji.field_c) {
            var2_int = param0.getKeyChar();
            if (var2_int != 0 &&
              65535 != var2_int &&
              ka.a((char) var2_int, 8192)) {
              var3 = 1 + jc.field_j & 127;
              if (var3 != rc.field_g) {
                ac.field_f[jc.field_j] = -1;
                na.field_a[jc.field_j] = (char)var2_int;
                jc.field_j = var3;
              }
            }
          }
          param0.consume();
        } catch (RuntimeException runtimeException) {
          throw ie.a((Throwable) ((Object) runtimeException), "fe.keyTyped(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    public static void a(byte param0) {
        if (param0 <= 116) {
          field_a = 14;
          field_b = null;
          return;
        }
        field_b = null;
    }

    public final synchronized void keyPressed(java.awt.event.KeyEvent param0) {
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_29_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var3Lifetime1;
        try {
          if (null == ji.field_c) {
            return;
          }
          dk.field_c = 0;
          var2_int = param0.getKeyCode();
          if (var2_int >= 0 &&
            d.field_d.length > var2_int) {
            var2_int = d.field_d[var2_int];
            if ((var2_int & 128) != 0) {
              var2_int = -1;
            }
          } else {
            var2_int = -1;
          }
          if (gm.field_O >= 0 &&
            var2_int >= 0) {
            qk.field_f[gm.field_O] = var2_int;
            gm.field_O = 127 & gm.field_O + 1;
            if (b.field_l == gm.field_O) {
              gm.field_O = -1;
            }
          }
          if (var2_int >= 0) {
            var3 = 127 & jc.field_j + 1;
            if (rc.field_g != var3) {
              ac.field_f[jc.field_j] = var2_int;
              na.field_a[jc.field_j] = (char)0;
              jc.field_j = var3;
            }
          }
          var3Lifetime1 = param0.getModifiers();
          if ((10 & var3Lifetime1) != 0) {
            param0.consume();
            return;
          }
          if (var2_int == 85) {
            param0.consume();
            return;
          }
          if (var2_int != 10) {
            return;
          }
          param0.consume();
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_28_0 = var2;
          stackIn_28_1 = new StringBuilder().append("fe.keyPressed(");
          if (param0 == null) {
            stackIn_29_2 = "null";
          } else {
            stackIn_29_2 = "{...}";
          }
          throw ie.a((Throwable) ((Object) stackIn_28_0), ((StringBuilder) (Object) stackIn_28_1).append(stackIn_29_2).append(')').toString());
        }
    }

    public final void focusGained(java.awt.event.FocusEvent param0) {
    }

    public final synchronized void keyReleased(java.awt.event.KeyEvent param0) {
        int var2_int = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          if (null != ji.field_c) {
            dk.field_c = 0;
            var2_int = param0.getKeyCode();
            if (var2_int >= 0 &&
              d.field_d.length > var2_int) {
              var2_int = d.field_d[var2_int] & -129;
            } else {
              var2_int = -1;
            }
            if (gm.field_O >= 0 &&
              var2_int >= 0) {
              qk.field_f[gm.field_O] = ~var2_int;
              gm.field_O = gm.field_O + 1 & 127;
              if (b.field_l == gm.field_O) {
                gm.field_O = -1;
              }
            }
          }
          param0.consume();
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_16_0 = var2;
          stackIn_16_1 = new StringBuilder().append("fe.keyReleased(");
          if (param0 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw ie.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(')').toString());
        }
    }

    static {
        field_b = "Return to game";
    }
}
