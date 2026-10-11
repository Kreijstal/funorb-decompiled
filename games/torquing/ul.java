/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ul implements java.awt.event.MouseListener, java.awt.event.MouseMotionListener, java.awt.event.FocusListener {
    static ei field_e;
    static int field_d;
    static int[] field_b;
    static int field_a;
    static long field_f;
    static String field_c;

    public final synchronized void mouseReleased(java.awt.event.MouseEvent param0) {
        int var2_int = 0;
        RuntimeException var2 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (null != ef.field_b) {
            jl.field_S = 0;
            rn.field_f = 0;
            n.field_x = true;
            var2_int = param0.getModifiers();
            if ((var2_int & 4) != 0) {
            }
            if ((8 & var2_int) == 0) {
            }
            if ((16 & var2_int) != 0) {
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
          stackIn_11_0 = var2;
          stackIn_11_1 = new StringBuilder().append("ul.mouseReleased(");
          if (param0 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw rb.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(')').toString());
        }
    }

    public final synchronized void mouseMoved(java.awt.event.MouseEvent param0) {
        RuntimeException var2 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (null == ef.field_b) {
            return;
          }
          jl.field_S = 0;
          qi.field_b = param0.getX();
          rn.field_b = param0.getY();
          n.field_x = true;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_6_0 = var2;
          stackIn_6_1 = new StringBuilder().append("ul.mouseMoved(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw rb.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    final static t[] a(int param0, int param1, int param2, int param3, byte param4) {
        if (param4 == 82) {
          return wa.a((byte) -63, 1, 1, 1, param3, 3, param1, param2, param0);
        }
        java.applet.Applet var6 = (java.applet.Applet) null;
        ul.a(-53, (String) null, (java.applet.Applet) null);
        return wa.a((byte) -63, 1, 1, 1, param3, 3, param1, param2, param0);
    }

    public final void focusGained(java.awt.event.FocusEvent param0) {
    }

    public static void a(int param0) {
        field_e = null;
        if (param0 == 18133) {
          field_c = null;
          field_b = null;
          return;
        }
        ul.a(91, -87, -114, -36, (byte) 126);
        field_c = null;
        field_b = null;
    }

    public final synchronized void mousePressed(java.awt.event.MouseEvent param0) {
        int var2_int = 0;
        RuntimeException var2 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (ef.field_b != null) {
            jl.field_S = 0;
            fh.field_u = param0.getX();
            pf.field_r = param0.getY();
            km.b(-1);
            if (!javax.swing.SwingUtilities.isRightMouseButton(param0)) {
              vg.field_l = 1;
              rn.field_f = 1;
            } else {
              vg.field_l = 2;
              rn.field_f = 2;
            }
            var2_int = param0.getModifiers();
            n.field_x = true;
            if ((var2_int & 4) != 0) {
            }
            if (0 != (var2_int & 16)) {
            }
            if ((var2_int & 8) == 0) {
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
          stackIn_14_0 = var2;
          stackIn_14_1 = new StringBuilder().append("ul.mousePressed(");
          if (param0 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw rb.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(')').toString());
        }
    }

    public final void mouseClicked(java.awt.event.MouseEvent param0) {
        try {
          if (param0.isPopupTrigger()) {
            param0.consume();
          }
        } catch (RuntimeException runtimeException) {
          throw rb.a((Throwable) ((Object) runtimeException), "ul.mouseClicked(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final static void a(int param0, String param1, java.applet.Applet param2) {
        try {
          java.net.URL var3 = null;
          Exception var3_ref = null;
          RuntimeException var3_ref2 = null;
          RuntimeException stackIn_8_0 = null;
          StringBuilder stackIn_8_1 = null;
          String stackIn_9_2 = null;
          StringBuilder stackIn_11_1 = null;
          String stackIn_12_2 = null;
          Throwable decompiledCaughtException = null;
          try {
            try {
              var3 = new java.net.URL(param2.getCodeBase(), param1);
              if (param0 != 0) {
                return;
              }
              var3 = og.a(var3, param2, (byte) -75);
              a.a(true, var3.toString(), param2, 3);
              return;
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var3_ref = (Exception) (Object) decompiledCaughtException;
              var3_ref.printStackTrace();
              return;
            }
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var3_ref2 = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_8_0 = var3_ref2;
            stackIn_8_1 = new StringBuilder().append("ul.A(").append(param0).append(',');
            if (param1 == null) {
              stackIn_9_2 = "null";
            } else {
              stackIn_9_2 = "{...}";
            }
            stackIn_11_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',');
            if (param2 == null) {
              stackIn_12_2 = "null";
            } else {
              stackIn_12_2 = "{...}";
            }
            throw rb.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    public final synchronized void mouseExited(java.awt.event.MouseEvent param0) {
        try {
          if (ef.field_b != null) {
            jl.field_S = 0;
            qi.field_b = -1;
            rn.field_b = -1;
            n.field_x = true;
          }
        } catch (RuntimeException runtimeException) {
          throw rb.a((Throwable) ((Object) runtimeException), "ul.mouseExited(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    public final synchronized void mouseDragged(java.awt.event.MouseEvent param0) {
        try {
          if (ef.field_b != null) {
            jl.field_S = 0;
            qi.field_b = param0.getX();
            rn.field_b = param0.getY();
            n.field_x = true;
          }
        } catch (RuntimeException runtimeException) {
          throw rb.a((Throwable) ((Object) runtimeException), "ul.mouseDragged(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    public final synchronized void mouseEntered(java.awt.event.MouseEvent param0) {
        RuntimeException var2 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (ef.field_b == null) {
            return;
          }
          jl.field_S = 0;
          qi.field_b = param0.getX();
          rn.field_b = param0.getY();
          n.field_x = true;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_6_0 = var2;
          stackIn_6_1 = new StringBuilder().append("ul.mouseEntered(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw rb.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    public final synchronized void focusLost(java.awt.event.FocusEvent param0) {
        try {
          if (null != ef.field_b) {
            rn.field_f = 0;
          }
        } catch (RuntimeException runtimeException) {
          throw rb.a((Throwable) ((Object) runtimeException), "ul.focusLost(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_e = new ei();
        field_d = 0;
        field_c = "Email address is unavailable";
    }
}
