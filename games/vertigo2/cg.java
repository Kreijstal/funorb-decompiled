/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cg implements java.awt.event.KeyListener, java.awt.event.FocusListener {
    static jp[] field_b;
    static String field_c;
    static wp field_a;
    static int field_d;
    static cc field_f;
    static int[] field_e;

    public final void focusGained(java.awt.event.FocusEvent param0) {
    }

    public final synchronized void focusLost(java.awt.event.FocusEvent param0) {
        try {
          if (kb.field_a != null) {
            fh.field_w = -1;
          }
        } catch (RuntimeException runtimeException) {
          throw wn.a((Throwable) ((Object) runtimeException), "cg.focusLost(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    public final synchronized void keyReleased(java.awt.event.KeyEvent param0) {
        int var2_int = 0;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          if (null != kb.field_a) {
            mm.field_a = 0;
            var2_int = param0.getKeyCode();
            if (var2_int >= 0 &&
              gk.field_a.length > var2_int) {
              var2_int = gk.field_a[var2_int] & -129;
            } else {
              var2_int = -1;
            }
            if (fh.field_w >= 0 &&
              var2_int >= 0) {
              bq.field_D[fh.field_w] = ~var2_int;
              fh.field_w = 127 & fh.field_w + 1;
              if (bd.field_f == fh.field_w) {
                fh.field_w = -1;
              }
            }
          }
          param0.consume();
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_17_0 = var2;
          stackIn_17_1 = new StringBuilder().append("cg.keyReleased(");
          if (param0 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw wn.a((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(')').toString());
        }
    }

    public static void a(byte param0) {
        field_c = null;
        field_a = null;
        field_b = null;
        field_f = null;
        if (param0 != 92) {
          return;
        }
        field_e = null;
    }

    public final void keyTyped(java.awt.event.KeyEvent param0) {
        int var2_int = 0;
        int var3 = 0;
        try {
          if (null != kb.field_a) {
            var2_int = param0.getKeyChar();
            if (var2_int != 0 && 65535 != var2_int &&
              gr.a(0, (char) var2_int)) {
              var3 = 127 & ro.field_e + 1;
              if (var3 != rq.field_B) {
                wm.field_j[ro.field_e] = -1;
                af.field_F[ro.field_e] = (char)var2_int;
                ro.field_e = var3;
              }
            }
          }
          param0.consume();
        } catch (RuntimeException runtimeException) {
          throw wn.a((Throwable) ((Object) runtimeException), "cg.keyTyped(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    public final synchronized void keyPressed(java.awt.event.KeyEvent param0) {
        int var2_int = 0;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_28_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        int var3 = 0;
        int var3Lifetime1;
        try {
          if (kb.field_a == null) {
            return;
          }
          mm.field_a = 0;
          var2_int = param0.getKeyCode();
          if (var2_int >= 0 &&
            var2_int < gk.field_a.length) {
            var2_int = gk.field_a[var2_int];
            if ((128 & var2_int) != 0) {
              var2_int = -1;
            }
          } else {
            var2_int = -1;
          }
          if (fh.field_w >= 0 &&
            var2_int >= 0) {
            bq.field_D[fh.field_w] = var2_int;
            fh.field_w = fh.field_w + 1 & 127;
            if (fh.field_w == bd.field_f) {
              fh.field_w = -1;
            }
          }
          if (var2_int >= 0) {
            var3 = 1 + ro.field_e & 127;
            if (var3 != rq.field_B) {
              wm.field_j[ro.field_e] = var2_int;
              af.field_F[ro.field_e] = (char)0;
              ro.field_e = var3;
            }
          }
          var3Lifetime1 = param0.getModifiers();
          if ((var3Lifetime1 & 10) != 0) {
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
          stackIn_27_0 = var2;
          stackIn_27_1 = new StringBuilder().append("cg.keyPressed(");
          if (param0 == null) {
            stackIn_28_2 = "null";
          } else {
            stackIn_28_2 = "{...}";
          }
          throw wn.a((Throwable) ((Object) stackIn_27_0), ((StringBuilder) (Object) stackIn_27_1).append(stackIn_28_2).append(')').toString());
        }
    }

    static {
        field_c = "Tips";
        field_a = new wp();
        field_d = -1;
    }
}
