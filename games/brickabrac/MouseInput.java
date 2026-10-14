/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class MouseInput implements java.awt.event.MouseListener, java.awt.event.MouseMotionListener, java.awt.event.FocusListener {
    static mi field_e;
    static RgbSprite farmFarSprite;
    static String field_a;
    static BufferedSocket field_d;
    static WidgetTheme field_g;
    static int field_b;
    static byte[] field_c;

    public final synchronized void mousePressed(java.awt.event.MouseEvent event) {
        int var2_int = 0;
        RuntimeException var2 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (PowerUpWarning.mouseInput != null) {
            gr.pointerIdleTicks = 0;
            SoundPlayback.livePressX = event.getX();
            va.livePressY = event.getY();
            MonotonicTime.nowMillis(false);
            if (javax.swing.SwingUtilities.isRightMouseButton(event)) {
              mi.livePressedButton = 2;
              QuickChatHelpDialog.liveHeldButton = 2;
            } else {
              mi.livePressedButton = 1;
              QuickChatHelpDialog.liveHeldButton = 1;
            }
            var2_int = event.getModifiers();
            kn.livePointerChanged = true;
            if ((8 & var2_int) == 0) {
            }
            if (0 != (4 & var2_int)) {
            }
            if ((16 & var2_int) == 0) {
            }
          }
          if (!event.isPopupTrigger()) {
            return;
          }
          event.consume();
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_14_0 = var2;
          stackIn_14_1 = new StringBuilder().append("dm.mousePressed(");
          if (event == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw FarmBackground.addExceptionContext((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(')').toString());
        }
    }

    public final synchronized void mouseDragged(java.awt.event.MouseEvent event) {
        RuntimeException var2 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (PowerUpWarning.mouseInput == null) {
            return;
          }
          gr.pointerIdleTicks = 0;
          DirectByteStorage.livePointerX = event.getX();
          WidgetTextLayout.livePointerY = event.getY();
          kn.livePointerChanged = true;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_6_0 = var2;
          stackIn_6_1 = new StringBuilder().append("dm.mouseDragged(");
          if (event == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw FarmBackground.addExceptionContext((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    public final synchronized void focusLost(java.awt.event.FocusEvent event) {
        RuntimeException var2 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (PowerUpWarning.mouseInput == null) {
            return;
          }
          QuickChatHelpDialog.liveHeldButton = 0;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_6_0 = var2;
          stackIn_6_1 = new StringBuilder().append("dm.focusLost(");
          if (event == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw FarmBackground.addExceptionContext((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    public static void a(byte param0) {
        field_g = null;
        field_e = null;
        field_c = null;
        field_d = null;
        field_a = null;
        farmFarSprite = null;
        if (param0 != 24) {
          field_d = (BufferedSocket) null;
        }
    }

    public final synchronized void mouseExited(java.awt.event.MouseEvent event) {
        try {
          if (PowerUpWarning.mouseInput != null) {
            gr.pointerIdleTicks = 0;
            DirectByteStorage.livePointerX = -1;
            WidgetTextLayout.livePointerY = -1;
            kn.livePointerChanged = true;
          }
        } catch (RuntimeException runtimeException) {
          throw FarmBackground.addExceptionContext((Throwable) ((Object) runtimeException), "dm.mouseExited(" + (event != null ? "{...}" : "null") + ')');
        }
    }

    public final synchronized void mouseReleased(java.awt.event.MouseEvent event) {
        int var2_int = 0;
        RuntimeException var2 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (null != PowerUpWarning.mouseInput) {
            gr.pointerIdleTicks = 0;
            QuickChatHelpDialog.liveHeldButton = 0;
            kn.livePointerChanged = true;
            var2_int = event.getModifiers();
            if ((var2_int & 8) != 0) {
            }
            if (0 == (var2_int & 16)) {
            }
            if (0 == (4 & var2_int)) {
            }
          }
          if (!event.isPopupTrigger()) {
            return;
          }
          event.consume();
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_10_0 = var2;
          stackIn_10_1 = new StringBuilder().append("dm.mouseReleased(");
          if (event == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw FarmBackground.addExceptionContext((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }

    public final void mouseClicked(java.awt.event.MouseEvent event) {
        RuntimeException var2 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!event.isPopupTrigger()) {
            return;
          }
          event.consume();
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_6_0 = var2;
          stackIn_6_1 = new StringBuilder().append("dm.mouseClicked(");
          if (event == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw FarmBackground.addExceptionContext((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    final static int a(int param0, int param1, int param2) {
        int var5 = 0;
        int var6 = 0;
        int var3 = param2 >> 16;
        int var4 = param2 & 65535;
        int var5Lifetime1;
        int var6Lifetime1;
        if (param1 == -1) {
          var5 = param0 >> 16;
          var6 = 65535 & param0;
          return (var6 * var4 >> 16) + var5 * var4 + var3 * param0;
        }
        MouseInput.a(-92, 104, -112);
        var5Lifetime1 = param0 >> 16;
        var6Lifetime1 = 65535 & param0;
        return (var6Lifetime1 * var4 >> 16) + var5Lifetime1 * var4 + var3 * param0;
    }

    public final synchronized void mouseEntered(java.awt.event.MouseEvent event) {
        RuntimeException var2 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (PowerUpWarning.mouseInput == null) {
            return;
          }
          gr.pointerIdleTicks = 0;
          DirectByteStorage.livePointerX = event.getX();
          WidgetTextLayout.livePointerY = event.getY();
          kn.livePointerChanged = true;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_6_0 = var2;
          stackIn_6_1 = new StringBuilder().append("dm.mouseEntered(");
          if (event == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw FarmBackground.addExceptionContext((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    public final synchronized void mouseMoved(java.awt.event.MouseEvent event) {
        RuntimeException var2 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (null == PowerUpWarning.mouseInput) {
            return;
          }
          gr.pointerIdleTicks = 0;
          DirectByteStorage.livePointerX = event.getX();
          WidgetTextLayout.livePointerY = event.getY();
          kn.livePointerChanged = true;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_6_0 = var2;
          stackIn_6_1 = new StringBuilder().append("dm.mouseMoved(");
          if (event == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw FarmBackground.addExceptionContext((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    public final void focusGained(java.awt.event.FocusEvent event) {
    }

    static {
        field_a = "(<%0>)";
        field_e = new mi();
    }
}
