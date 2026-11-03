/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class MouseHandler implements java.awt.event.MouseListener, java.awt.event.MouseMotionListener, java.awt.event.FocusListener {
    static String timeTrialFailed;
    static String rule10;
    static String muGameIsFull;

    public final synchronized void mouseDragged(java.awt.event.MouseEvent param0) {
        RuntimeException var2 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (wp.field_g == null) {
            return;
          }
          PoolUiText.field_g = 0;
          ArchiveLoadStep.field_l = param0.getX();
          wn.field_k = param0.getY();
          m.field_d = true;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_6_0 = var2;
          stackIn_6_1 = new StringBuilder().append("ql.mouseDragged(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    public final synchronized void mouseMoved(java.awt.event.MouseEvent param0) {
        RuntimeException var2 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (null == wp.field_g) {
            return;
          }
          PoolUiText.field_g = 0;
          ArchiveLoadStep.field_l = param0.getX();
          wn.field_k = param0.getY();
          m.field_d = true;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_6_0 = var2;
          stackIn_6_1 = new StringBuilder().append("ql.mouseMoved(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    public static void releaseStatics(byte param0) {
        rule10 = null;
        timeTrialFailed = null;
        muGameIsFull = null;
        int var1 = 123 / ((param0 + 15) / 48);
    }

    public final synchronized void mouseExited(java.awt.event.MouseEvent param0) {
        try {
          if (wp.field_g != null) {
            PoolUiText.field_g = 0;
            ArchiveLoadStep.field_l = -1;
            wn.field_k = -1;
            m.field_d = true;
          }
        } catch (RuntimeException runtimeException) {
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) runtimeException), "ql.mouseExited(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    public final synchronized void focusLost(java.awt.event.FocusEvent param0) {
        RuntimeException var2 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (wp.field_g == null) {
            return;
          }
          ho.field_v = 0;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_6_0 = var2;
          stackIn_6_1 = new StringBuilder().append("ql.focusLost(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    public final void focusGained(java.awt.event.FocusEvent param0) {
    }

    public final synchronized void mouseReleased(java.awt.event.MouseEvent param0) {
        int var2_int = 0;
        RuntimeException var2 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (wp.field_g != null) {
            PoolUiText.field_g = 0;
            ho.field_v = 0;
            m.field_d = true;
            var2_int = param0.getModifiers();
            if ((var2_int & 4) != 0) {
            }
            if ((8 & var2_int) != 0) {
            }
            if ((var2_int & 16) != 0) {
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
          stackIn_10_0 = var2;
          stackIn_10_1 = new StringBuilder().append("ql.mouseReleased(");
          if (param0 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }

    public final void mouseClicked(java.awt.event.MouseEvent param0) {
        RuntimeException var2 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!param0.isPopupTrigger()) {
            return;
          }
          param0.consume();
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_6_0 = var2;
          stackIn_6_1 = new StringBuilder().append("ql.mouseClicked(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    final static boolean a(int param0, int param1) {
        if (param1 > -34) {
          return true;
        }
        return (param0 & -param0) == param0 ? true : false;
    }

    public final synchronized void mouseEntered(java.awt.event.MouseEvent param0) {
        RuntimeException var2 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (null == wp.field_g) {
            return;
          }
          PoolUiText.field_g = 0;
          ArchiveLoadStep.field_l = param0.getX();
          wn.field_k = param0.getY();
          m.field_d = true;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_6_0 = var2;
          stackIn_6_1 = new StringBuilder().append("ql.mouseEntered(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    final static boolean a(int param0) {
        if (param0 != -6720) {
          return false;
        }
        if (null == PlasmaTableScene.field_cb) {
          return false;
        }
        if (PlasmaTableScene.field_cb.getTopOpenDialog(103) == null) {
          return false;
        }
        return true;
    }

    public final synchronized void mousePressed(java.awt.event.MouseEvent param0) {
        int var2_int = 0;
        RuntimeException var2 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (null != wp.field_g) {
            PoolUiText.field_g = 0;
            Ball.field_f = param0.getX();
            MatchingTextValidator.field_o = param0.getY();
            rl.monotonicTimeMillis((byte) -115);
            if (javax.swing.SwingUtilities.isRightMouseButton(param0)) {
              CueAim.field_c = 2;
              ho.field_v = 2;
            } else {
              CueAim.field_c = 1;
              ho.field_v = 1;
            }
            var2_int = param0.getModifiers();
            if (0 == (var2_int & 8)) {
            }
            if ((4 & var2_int) == 0) {
            }
            if ((var2_int & 16) != 0) {
            }
            m.field_d = true;
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
          stackIn_14_1 = new StringBuilder().append("ql.mousePressed(");
          if (param0 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(')').toString());
        }
    }

    static {
        timeTrialFailed = "Time trial failed!";
        rule10 = "Seriously offensive language";
        muGameIsFull = "This game is full.";
    }
}
