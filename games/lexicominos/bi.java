/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bi implements java.awt.event.KeyListener, java.awt.event.FocusListener {
    static cd field_a;

    final static boolean a(byte param0, String param1, String param2) {
        String var3 = null;
        java.awt.Component var4 = null;
        boolean stackIn_14_0 = false;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        try {
          if (param0 >= -121) {
            var4 = (java.awt.Component) null;
            bi.a((byte) -69, (java.awt.Component) null);
          }
          var3 = ci.a(param1, (byte) -79);
          if (-1 != param2.indexOf(param1)) {
            return true;
          }
          if (param2.indexOf(var3) != -1) {
            return true;
          }
          stackIn_14_0 = (param2.startsWith(param1)) || (param2.startsWith(var3)) || (param2.endsWith(param1)) || (param2.endsWith(var3));
          return stackIn_14_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_17_0 = var3_ref;
          stackIn_17_1 = new StringBuilder().append("bi.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          stackIn_20_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',');
          if (param2 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          throw ld.a((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(')').toString());
        }
    }

    public static void a(int param0) {
        if (param0 != -1) {
          java.awt.Component var2 = (java.awt.Component) null;
          bi.a((byte) 12, (java.awt.Component) null);
          field_a = null;
          return;
        }
        field_a = null;
    }

    public final synchronized void keyReleased(java.awt.event.KeyEvent param0) {
        RuntimeException runtimeException = null;
        int var2_int = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (ol.field_l != null) {
            tb.field_b = 0;
            var2_int = param0.getKeyCode();
            if (var2_int >= 0 &&
              var2_int < vc.field_K.length) {
              var2_int = vc.field_K[var2_int] & -129;
            } else {
              var2_int = -1;
            }
            if (0 <= vg.field_b &&
              var2_int >= 0) {
              ji.field_e[vg.field_b] = ~var2_int;
              vg.field_b = vg.field_b + 1 & 127;
              if (ud.field_a == vg.field_b) {
                vg.field_b = -1;
              }
            }
          }
          param0.consume();
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_15_0 = runtimeException;
          stackIn_15_1 = new StringBuilder().append("bi.keyReleased(");
          if (param0 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw ld.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(')').toString());
        }
    }

    public final void keyTyped(java.awt.event.KeyEvent param0) {
        int var2_int = 0;
        int var3 = 0;
        try {
          if (ol.field_l != null) {
            var2_int = param0.getKeyChar();
            if (0 != var2_int && var2_int != 65535 &&
              rf.a((byte) -10, (char) var2_int)) {
              var3 = Lexicominos.field_G + 1 & 127;
              if (tj.field_h != var3) {
                gj.field_x[Lexicominos.field_G] = -1;
                ok.field_q[Lexicominos.field_G] = (char)var2_int;
                Lexicominos.field_G = var3;
              }
            }
          }
          param0.consume();
        } catch (RuntimeException runtimeException) {
          throw ld.a((Throwable) ((Object) runtimeException), "bi.keyTyped(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    public final void focusGained(java.awt.event.FocusEvent param0) {
    }

    final static void a(byte param0, java.awt.Component param1) {
        try {
          param1.addMouseListener(hh.field_M);
          if (param0 != 104) {
            field_a = (cd) null;
          }
          param1.addMouseMotionListener(hh.field_M);
          param1.addFocusListener(hh.field_M);
        } catch (RuntimeException runtimeException) {
          throw ld.a((Throwable) ((Object) runtimeException), "bi.B(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public final synchronized void focusLost(java.awt.event.FocusEvent param0) {
        try {
          if (null != ol.field_l) {
            vg.field_b = -1;
          }
        } catch (RuntimeException runtimeException) {
          throw ld.a((Throwable) ((Object) runtimeException), "bi.focusLost(" + (param0 != null ? "{...}" : "null") + ')');
        }
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
          if (ol.field_l == null) {
            return;
          }
          tb.field_b = 0;
          var2_int = param0.getKeyCode();
          if (var2_int >= 0 &&
            vc.field_K.length > var2_int) {
            var2_int = vc.field_K[var2_int];
            if ((128 & var2_int) != 0) {
              var2_int = -1;
            }
          } else {
            var2_int = -1;
          }
          if (0 <= vg.field_b &&
            var2_int >= 0) {
            ji.field_e[vg.field_b] = var2_int;
            vg.field_b = 1 + vg.field_b & 127;
            if (ud.field_a == vg.field_b) {
              vg.field_b = -1;
            }
          }
          if (var2_int >= 0) {
            var3 = 127 & 1 + Lexicominos.field_G;
            if (tj.field_h != var3) {
              gj.field_x[Lexicominos.field_G] = var2_int;
              ok.field_q[Lexicominos.field_G] = (char)0;
              Lexicominos.field_G = var3;
            }
          }
          var3Lifetime1 = param0.getModifiers();
          if (0 == (var3Lifetime1 & 10) &&
            var2_int != 85 &&
            var2_int != 10) {
            return;
          }
          param0.consume();
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_25_0 = var2;
          stackIn_25_1 = new StringBuilder().append("bi.keyPressed(");
          if (param0 == null) {
            stackIn_26_2 = "null";
          } else {
            stackIn_26_2 = "{...}";
          }
          throw ld.a((Throwable) ((Object) stackIn_25_0), ((StringBuilder) (Object) stackIn_25_1).append(stackIn_26_2).append(')').toString());
        }
    }

    static {
    }
}
