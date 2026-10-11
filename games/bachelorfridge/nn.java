/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nn implements java.awt.event.MouseListener, java.awt.event.MouseMotionListener, java.awt.event.FocusListener {
    static int field_b;
    static String field_a;

    public final synchronized void mouseReleased(java.awt.event.MouseEvent param0) {
        int var2_int = 0;
        RuntimeException var2 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (uc.field_m != null) {
            tf.field_n = 0;
            oga.field_q = 0;
            gja.field_j = true;
            var2_int = param0.getModifiers();
            if ((var2_int & 16) != 0) {
              cj.field_f = cj.field_f & -2;
            }
            if ((8 & var2_int) != 0) {
              cj.field_f = cj.field_f & -3;
            }
            if ((var2_int & 4) != 0) {
              cj.field_f = cj.field_f & -5;
            }
          }
          if (!param0.isPopupTrigger()) {
            return;
          }
          param0.consume();
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_16_0 = var2;
          stackIn_16_1 = new StringBuilder().append("nn.mouseReleased(");
          if (param0 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw pe.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(')').toString());
        }
    }

    public final synchronized void mouseMoved(java.awt.event.MouseEvent param0) {
        RuntimeException var2 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (null == uc.field_m) {
            return;
          }
          tf.field_n = 0;
          ue.field_N = param0.getX();
          dia.field_A = param0.getY();
          gja.field_j = true;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_6_0 = var2;
          stackIn_6_1 = new StringBuilder().append("nn.mouseMoved(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw pe.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    public final synchronized void mousePressed(java.awt.event.MouseEvent param0) {
        int var2_int = 0;
        RuntimeException var2 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (uc.field_m != null) {
            tf.field_n = 0;
            tba.field_u = param0.getX();
            dma.field_c = param0.getY();
            f.b((byte) 73);
            if (!javax.swing.SwingUtilities.isRightMouseButton(param0)) {
              jh.field_l = 1;
              oga.field_q = 1;
            } else {
              jh.field_l = 2;
              oga.field_q = 2;
            }
            var2_int = param0.getModifiers();
            if ((var2_int & 16) != 0) {
              cj.field_f = cj.field_f | 1;
            }
            if (0 != (var2_int & 8)) {
              cj.field_f = cj.field_f | 2;
            }
            if (0 != (4 & var2_int)) {
              cj.field_f = cj.field_f | 4;
            }
            gja.field_j = true;
          }
          if (!param0.isPopupTrigger()) {
            return;
          }
          param0.consume();
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_18_0 = var2;
          stackIn_18_1 = new StringBuilder().append("nn.mousePressed(");
          if (param0 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          throw pe.a((Throwable) ((Object) stackIn_18_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(')').toString());
        }
    }

    public final synchronized void mouseEntered(java.awt.event.MouseEvent param0) {
        try {
          if (null != uc.field_m) {
            tf.field_n = 0;
            ue.field_N = param0.getX();
            dia.field_A = param0.getY();
            gja.field_j = true;
          }
        } catch (RuntimeException runtimeException) {
          throw pe.a((Throwable) ((Object) runtimeException), "nn.mouseEntered(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    public final void mouseClicked(java.awt.event.MouseEvent param0) {
        try {
          if (param0.isPopupTrigger()) {
            param0.consume();
          }
        } catch (RuntimeException runtimeException) {
          throw pe.a((Throwable) ((Object) runtimeException), "nn.mouseClicked(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    public final synchronized void mouseExited(java.awt.event.MouseEvent param0) {
        try {
          if (null != uc.field_m) {
            tf.field_n = 0;
            ue.field_N = -1;
            dia.field_A = -1;
            gja.field_j = true;
          }
        } catch (RuntimeException runtimeException) {
          throw pe.a((Throwable) ((Object) runtimeException), "nn.mouseExited(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final static int a(aga param0, aga param1, byte param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int stackIn_2_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_16_0 = 0;
        int stackIn_20_0 = 0;
        int stackIn_24_0 = 0;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_28_2 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_31_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param2 != 104) {
            stackIn_2_0 = -40;
            return stackIn_2_0;
          }
          var3_int = param0.field_x - param1.field_x;
          var4 = param0.field_J - param1.field_J;
          if (Math.abs(var3_int) < Math.abs(var4)) {
            stackIn_7_0 = (var4 >= 0) ? 3 : 1;
            return stackIn_7_0;
          }
          if (Math.abs(var3_int) > Math.abs(var4)) {
            stackIn_24_0 = (0 <= var3_int) ? 4 : 2;
            return stackIn_24_0;
          }
          if (0 > var3_int) {
            stackIn_20_0 = (var4 < 0) ? 1 : 2;
            return stackIn_20_0;
          }
          if (0 < var3_int) {
            stackIn_16_0 = (var4 < 0) ? 4 : 3;
            return stackIn_16_0;
          }
          stackIn_12_0 = 0;
          return stackIn_12_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_27_0 = var3;
          stackIn_27_1 = new StringBuilder().append("nn.B(");
          if (param0 == null) {
            stackIn_28_2 = "null";
          } else {
            stackIn_28_2 = "{...}";
          }
          stackIn_30_1 = ((StringBuilder) (Object) stackIn_27_1).append(stackIn_28_2).append(',');
          if (param1 == null) {
            stackIn_31_2 = "null";
          } else {
            stackIn_31_2 = "{...}";
          }
          throw pe.a((Throwable) ((Object) stackIn_27_0), ((StringBuilder) (Object) stackIn_30_1).append(stackIn_31_2).append(',').append(param2).append(')').toString());
        }
    }

    final static void a(byte param0, sna param1) {
        sna var5 = null;
        int var3 = BachelorFridge.field_y;
        sna var4 = (sna) (param1.field_z.b((byte) 90));
        sna var2 = var4;
        while (var4 != null) {
          var4.field_hb = 0;
          var4.field_p = 0;
          var4.field_I = 0;
          var4.field_rb = 0;
          var5 = (sna) (param1.field_z.c(param0 ^ -126));
          var5 = var5;
        }
        if (param0 != -126) {
          return;
        }
        try {
          param1.field_rb = 0;
          param1.field_p = 0;
          param1.field_hb = 0;
          param1.field_I = 0;
        } catch (RuntimeException runtimeException) {
          throw pe.a((Throwable) ((Object) runtimeException), "nn.A(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public final void focusGained(java.awt.event.FocusEvent param0) {
    }

    public final synchronized void focusLost(java.awt.event.FocusEvent param0) {
        try {
          if (uc.field_m != null) {
            oga.field_q = 0;
          }
        } catch (RuntimeException runtimeException) {
          throw pe.a((Throwable) ((Object) runtimeException), "nn.focusLost(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    public static void a(int param0) {
        if (param0 != 0) {
          nn.a(-74);
          field_a = null;
          return;
        }
        field_a = null;
    }

    public final synchronized void mouseDragged(java.awt.event.MouseEvent param0) {
        RuntimeException var2 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (uc.field_m == null) {
            return;
          }
          tf.field_n = 0;
          ue.field_N = param0.getX();
          dia.field_A = param0.getY();
          gja.field_j = true;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_6_0 = var2;
          stackIn_6_1 = new StringBuilder().append("nn.mouseDragged(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw pe.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    static {
        field_a = "You have been removed from <%0>'s game.";
    }
}
