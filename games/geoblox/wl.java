/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wl implements java.awt.event.KeyListener, java.awt.event.FocusListener {
    static dm field_a;
    static String field_b;

    public final synchronized void keyPressed(java.awt.event.KeyEvent param0) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_26_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (je.field_j == null) {
            return;
          }
          nk.field_e = 0;
          var2_int = param0.getKeyCode();
          if ((var2_int >= 0) &&
              (oe.field_P.length > var2_int)) {
            var2_int = oe.field_P[var2_int];
            if (!((var2_int & 128) == 0)) {
              var2_int = -1;
            }
          } else {
            var2_int = -1;
          }
          if ((ii.field_c >= 0) &&
              (var2_int >= 0)) {
            gf.field_c[ii.field_c] = var2_int;
            ii.field_c = 127 & 1 + ii.field_c;
            if (gk.field_b == ii.field_c) {
              ii.field_c = -1;
            }
          }
          if (var2_int >= 0) {
            var3 = 127 & 1 + ba.field_c;
            if (var3 != vd.field_n) {
              kj.field_O[ba.field_c] = var2_int;
              ai.field_n[ba.field_c] = (char)0;
              ba.field_c = var3;
            }
          }
          var3 = param0.getModifiers();
          if (((var3 & 10) == 0) &&
              (85 != var2_int) &&
              (var2_int != 10)) {
            return;
          }
          param0.consume();
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_25_0 = (RuntimeException) (var2);
          stackIn_25_1 = new StringBuilder().append("wl.keyPressed(");
          if (param0 == null) {
            stackIn_26_2 = "null";
          } else {
            stackIn_26_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_25_0), ((StringBuilder) (Object) stackIn_25_1).append(stackIn_26_2).append(')').toString());
        }
    }

    public final void focusGained(java.awt.event.FocusEvent param0) {
    }

    public static void a(int param0) {
        field_a = null;
        if (param0 != 31997) {
            return;
        }
        field_b = null;
    }

    public final void keyTyped(java.awt.event.KeyEvent param0) {
        int var2_int = 0;
        int var3 = 0;
        try {
            if (!(je.field_j == null)) {
                var2_int = param0.getKeyChar();
                if (var2_int != 0 && var2_int != 65535 && tc.a((byte) -112, (char) var2_int)) {
                    var3 = 1 + ba.field_c & 127;
                    if (var3 != vd.field_n) {
                        kj.field_O[ba.field_c] = -1;
                        ai.field_n[ba.field_c] = (char)var2_int;
                        ba.field_c = var3;
                    }
                }
            }
            param0.consume();
        } catch (RuntimeException runtimeException) {
            throw t.a((Throwable) ((Object) runtimeException), "wl.keyTyped(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    public final synchronized void keyReleased(java.awt.event.KeyEvent param0) {
        RuntimeException runtimeException = null;
        int var2_int = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (je.field_j != null) {
            nk.field_e = 0;
            var2_int = param0.getKeyCode();
            if ((var2_int >= 0) &&
                (oe.field_P.length > var2_int)) {
              var2_int = oe.field_P[var2_int] & -129;
            } else {
              var2_int = -1;
            }
            if ((ii.field_c >= 0) &&
                (0 <= var2_int)) {
              gf.field_c[ii.field_c] = ~var2_int;
              ii.field_c = 1 + ii.field_c & 127;
              if (gk.field_b == ii.field_c) {
                ii.field_c = -1;
              }
            }
          }
          param0.consume();
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_16_0 = (RuntimeException) (runtimeException);
          stackIn_16_1 = new StringBuilder().append("wl.keyReleased(");
          if (param0 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(')').toString());
        }
    }

    final static void b(int param0) {
        String var2 = (String) null;
        f.b(rh.field_i, (String) null, 7697781);
        if (param0 != -1) {
            field_a = (dm) null;
        }
    }

    public final synchronized void focusLost(java.awt.event.FocusEvent param0) {
        RuntimeException var2 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (null == je.field_j) {
            return;
          }
          ii.field_c = -1;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_6_0 = (RuntimeException) (var2);
          stackIn_6_1 = new StringBuilder().append("wl.focusLost(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    static {
        field_a = new dm(30, 30);
        field_b = "Clear bonus!";
    }
}
