/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class MouseInputHandler implements java.awt.event.MouseListener, java.awt.event.MouseMotionListener, java.awt.event.FocusListener {
    static String field_a;

    public final synchronized void mouseDragged(java.awt.event.MouseEvent param0) {
        String stackIn_7_2 = null;
        try {
          if (QuickChatDynamicCommand.mouseHandler == null) {
            return;
          }
          AlphaContainer.mouseIdleTicks = 0;
          IterableDualLinkDeque.pendingMouseX = param0.getX();
          AchievementGrantRule.pendingMouseY = param0.getY();
          LegacyMenuFontSupport.mouseInputChanged = true;
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
          throw MainMenuScreen.wrapClientException((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    public final synchronized void mouseExited(java.awt.event.MouseEvent param0) {
        String stackIn_7_2 = null;
        try {
          if (null == QuickChatDynamicCommand.mouseHandler) {
            return;
          }
          AlphaContainer.mouseIdleTicks = 0;
          IterableDualLinkDeque.pendingMouseX = -1;
          AchievementGrantRule.pendingMouseY = -1;
          LegacyMenuFontSupport.mouseInputChanged = true;
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
          throw MainMenuScreen.wrapClientException((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
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
          throw MainMenuScreen.wrapClientException((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    final static PointCloudEffect createExplosionCloud(int yQ16, int xQ16, boolean indexedRendering, boolean guard, PcmSample sound) {
        String stackIn_10_2 = null;
        try {
          PointCloudEffect var5 = new PointCloudEffect(xQ16, yQ16, sound);
          if (!guard) {
            field_a = (String) null;
          }
          PointCloudEffect stackIn_4_0 = var5;
          boolean stackIn_5_1 = (indexedRendering);
          stackIn_4_0.indexedRendering = stackIn_5_1;
          PointCloudEffect stackIn_6_0 = var5;
          return stackIn_6_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var5_ref = decompiledCaughtException;
          RuntimeException stackIn_9_0 = var5_ref;
          StringBuilder stackIn_9_1 = new StringBuilder().append("eg.B(").append(yQ16).append(',').append(xQ16).append(',').append(indexedRendering).append(',').append(guard).append(',');
          if (sound == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw MainMenuScreen.wrapClientException((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(')').toString());
        }
    }

    public final synchronized void focusLost(java.awt.event.FocusEvent param0) {
        String stackIn_7_2 = null;
        try {
          if (null == QuickChatDynamicCommand.mouseHandler) {
            return;
          }
          LoginCredentials.heldMouseButton = 0;
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
          throw MainMenuScreen.wrapClientException((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    public final synchronized void mouseEntered(java.awt.event.MouseEvent param0) {
        try {
          if (null != QuickChatDynamicCommand.mouseHandler) {
            AlphaContainer.mouseIdleTicks = 0;
            IterableDualLinkDeque.pendingMouseX = param0.getX();
            AchievementGrantRule.pendingMouseY = param0.getY();
            LegacyMenuFontSupport.mouseInputChanged = true;
          }
        } catch (RuntimeException runtimeException) {
          throw MainMenuScreen.wrapClientException((Throwable) ((Object) runtimeException), "eg.mouseEntered(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    public final synchronized void mouseReleased(java.awt.event.MouseEvent param0) {
        String stackIn_10_2 = null;
        try {
          if (QuickChatDynamicCommand.mouseHandler != null) {
            AlphaContainer.mouseIdleTicks = 0;
            LoginCredentials.heldMouseButton = 0;
            LegacyMenuFontSupport.mouseInputChanged = true;
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
          throw MainMenuScreen.wrapClientException((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(')').toString());
        }
    }

    public final synchronized void mouseMoved(java.awt.event.MouseEvent param0) {
        try {
          if (null != QuickChatDynamicCommand.mouseHandler) {
            AlphaContainer.mouseIdleTicks = 0;
            IterableDualLinkDeque.pendingMouseX = param0.getX();
            AchievementGrantRule.pendingMouseY = param0.getY();
            LegacyMenuFontSupport.mouseInputChanged = true;
          }
        } catch (RuntimeException runtimeException) {
          throw MainMenuScreen.wrapClientException((Throwable) ((Object) runtimeException), "eg.mouseMoved(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    public final synchronized void mousePressed(java.awt.event.MouseEvent param0) {
        String stackIn_13_2 = null;
        try {
          if (QuickChatDynamicCommand.mouseHandler != null) {
            AlphaContainer.mouseIdleTicks = 0;
            LoginCredentialType.pendingClickX = param0.getX();
            PcmResampler.pendingClickY = param0.getY();
            MonotonicClockSupport.monotonicMillis(128);
            if (!javax.swing.SwingUtilities.isRightMouseButton(param0)) {
              SocketConnector.pendingClickButton = 1;
              LoginCredentials.heldMouseButton = 1;
            } else {
              SocketConnector.pendingClickButton = 2;
              LoginCredentials.heldMouseButton = 2;
            }
            int var2_int = param0.getModifiers();
            if ((var2_int & 4) == 0) {
            }
            if ((16 & var2_int) == 0) {
            }
            LegacyMenuFontSupport.mouseInputChanged = true;
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
          throw MainMenuScreen.wrapClientException((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(')').toString());
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
