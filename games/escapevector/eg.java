/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class eg implements java.awt.event.MouseListener, java.awt.event.MouseMotionListener, java.awt.event.FocusListener {
    static String field_a;

    public final synchronized void mouseDragged(java.awt.event.MouseEvent param0) {
        String stackIn_7_2 = null;
        try {
          if (om.field_b == null) {
            return;
          }
          md.field_G = 0;
          vb.field_b = param0.getX();
          jk.field_b = param0.getY();
          ke.field_a = true;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var2 = decompiledCaughtException;
          RuntimeException stackIn_6_0 = var2;
          StringBuilder stackIn_6_1 = new StringBuilder().append("eg.mouseDragged(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    public final synchronized void mouseExited(java.awt.event.MouseEvent param0) {
        String stackIn_7_2 = null;
        try {
          if (null == om.field_b) {
            return;
          }
          md.field_G = 0;
          vb.field_b = -1;
          jk.field_b = -1;
          ke.field_a = true;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var2 = decompiledCaughtException;
          RuntimeException stackIn_6_0 = var2;
          StringBuilder stackIn_6_1 = new StringBuilder().append("eg.mouseExited(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    public final void mouseClicked(java.awt.event.MouseEvent param0) {
        String stackIn_7_2 = null;
        try {
          if (!param0.isPopupTrigger()) {
            return;
          }
          param0.consume();
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var2 = decompiledCaughtException;
          RuntimeException stackIn_6_0 = var2;
          StringBuilder stackIn_6_1 = new StringBuilder().append("eg.mouseClicked(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    final static PointCloudEffect a(int param0, int param1, boolean param2, boolean param3, PcmSample param4) {
        String stackIn_10_2 = null;
        try {
          PointCloudEffect var5 = new PointCloudEffect(param1, param0, param4);
          if (!param3) {
            field_a = (String) null;
          }
          PointCloudEffect stackIn_4_0 = var5;
          boolean stackIn_5_1 = (param2);
          stackIn_4_0.field_q = stackIn_5_1;
          PointCloudEffect stackIn_6_0 = var5;
          return stackIn_6_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var5_ref = decompiledCaughtException;
          RuntimeException stackIn_9_0 = var5_ref;
          StringBuilder stackIn_9_1 = new StringBuilder().append("eg.B(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(')').toString());
        }
    }

    public final synchronized void focusLost(java.awt.event.FocusEvent param0) {
        String stackIn_7_2 = null;
        try {
          if (null == om.field_b) {
            return;
          }
          vj.field_b = 0;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var2 = decompiledCaughtException;
          RuntimeException stackIn_6_0 = var2;
          StringBuilder stackIn_6_1 = new StringBuilder().append("eg.focusLost(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    public final synchronized void mouseEntered(java.awt.event.MouseEvent param0) {
        try {
          if (null != om.field_b) {
            md.field_G = 0;
            vb.field_b = param0.getX();
            jk.field_b = param0.getY();
            ke.field_a = true;
          }
        } catch (RuntimeException runtimeException) {
          throw t.a((Throwable) ((Object) runtimeException), "eg.mouseEntered(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    public final synchronized void mouseReleased(java.awt.event.MouseEvent param0) {
        String stackIn_10_2 = null;
        try {
          if (om.field_b != null) {
            md.field_G = 0;
            vj.field_b = 0;
            ke.field_a = true;
            int var2_int = param0.getModifiers();
            if ((8 & var2_int) == 0) {
            }
            if ((4 & var2_int) != 0) {
            }
            if (0 != (var2_int & 16)) {
            }
          }
          if (!param0.isPopupTrigger()) {
            return;
          }
          param0.consume();
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var2 = decompiledCaughtException;
          RuntimeException stackIn_9_0 = var2;
          StringBuilder stackIn_9_1 = new StringBuilder().append("eg.mouseReleased(");
          if (param0 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(')').toString());
        }
    }

    public final synchronized void mouseMoved(java.awt.event.MouseEvent param0) {
        try {
          if (null != om.field_b) {
            md.field_G = 0;
            vb.field_b = param0.getX();
            jk.field_b = param0.getY();
            ke.field_a = true;
          }
        } catch (RuntimeException runtimeException) {
          throw t.a((Throwable) ((Object) runtimeException), "eg.mouseMoved(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    public final synchronized void mousePressed(java.awt.event.MouseEvent param0) {
        String stackIn_13_2 = null;
        try {
          if (om.field_b != null) {
            md.field_G = 0;
            fk.field_b = param0.getX();
            PcmResampler.field_c = param0.getY();
            td.b(128);
            if (!javax.swing.SwingUtilities.isRightMouseButton(param0)) {
              kb.field_f = 1;
              vj.field_b = 1;
            } else {
              kb.field_f = 2;
              vj.field_b = 2;
            }
            int var2_int = param0.getModifiers();
            if ((var2_int & 4) == 0) {
            }
            if ((16 & var2_int) == 0) {
            }
            ke.field_a = true;
            if ((var2_int & 8) != 0) {
            }
          }
          if (!param0.isPopupTrigger()) {
            return;
          }
          param0.consume();
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var2 = decompiledCaughtException;
          RuntimeException stackIn_12_0 = var2;
          StringBuilder stackIn_12_1 = new StringBuilder().append("eg.mousePressed(");
          if (param0 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(')').toString());
        }
    }

    public static void releaseStatics(int guard) {
        if (guard != -1) {
          field_a = (String) null;
          field_a = null;
          return;
        }
        field_a = null;
    }

    public final void focusGained(java.awt.event.FocusEvent param0) {
    }

    static {
        field_a = "Fullscreen mode was cancelled after a delay of 10 seconds. If you were unable to accept fullscreen mode during this time, there may be a problem with your configuration. You could try restarting your browser and trying again.";
    }
}
