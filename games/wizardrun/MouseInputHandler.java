/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class MouseInputHandler implements java.awt.event.MouseListener, java.awt.event.MouseMotionListener, java.awt.event.FocusListener {
    static String field_d;
    static int field_e;
    static String field_a;
    static int[] field_b;
    static int[] field_c;

    public final synchronized void mouseMoved(java.awt.event.MouseEvent param0) {
        RuntimeException var2 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (SavedDataRequest.mouseHandler == null) {
            return;
          }
          CoverageFontLoader.mouseIdleTime = 0;
          wizardrun.pointerX = param0.getX();
          IterableNodeHashTable.pointerY = param0.getY();
          IndexedSpriteState.field_i = true;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_6_0 = var2;
          stackIn_6_1 = new StringBuilder().append("tf.mouseMoved(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw ExceptionSupport.wrapException((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    public final synchronized void focusLost(java.awt.event.FocusEvent param0) {
        try {
          if (SavedDataRequest.mouseHandler != null) {
            ErrorReportingHelpers.pressedButton = 0;
          }
        } catch (RuntimeException runtimeException) {
          throw ExceptionSupport.wrapException((Throwable) ((Object) runtimeException), "tf.focusLost(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    public final synchronized void mouseExited(java.awt.event.MouseEvent param0) {
        RuntimeException var2 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (null == SavedDataRequest.mouseHandler) {
            return;
          }
          CoverageFontLoader.mouseIdleTime = 0;
          wizardrun.pointerX = -1;
          IterableNodeHashTable.pointerY = -1;
          IndexedSpriteState.field_i = true;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_6_0 = var2;
          stackIn_6_1 = new StringBuilder().append("tf.mouseExited(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw ExceptionSupport.wrapException((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    public final synchronized void mousePressed(java.awt.event.MouseEvent param0) {
        int var2_int = 0;
        RuntimeException var2 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (SavedDataRequest.mouseHandler != null) {
            CoverageFontLoader.mouseIdleTime = 0;
            AccountProgressDialog.clickX = param0.getX();
            ProgressSubmission.clickY = param0.getY();
            MonotonicClockHelpers.monotonicMillis((byte) 93);
            if (!javax.swing.SwingUtilities.isRightMouseButton(param0)) {
              NetworkArchiveRequest.field_w = 1;
              ErrorReportingHelpers.pressedButton = 1;
            } else {
              NetworkArchiveRequest.field_w = 2;
              ErrorReportingHelpers.pressedButton = 2;
            }
            var2_int = param0.getModifiers();
            if ((var2_int & 16) == 0) {
            }
            if ((4 & var2_int) == 0) {
            }
            IndexedSpriteState.field_i = true;
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
          stackIn_14_1 = new StringBuilder().append("tf.mousePressed(");
          if (param0 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw ExceptionSupport.wrapException((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(')').toString());
        }
    }

    final static int processAccountUiInput(int param0) {
        int var1_int = 0;
        RuntimeException var1 = null;
        int var2 = 0;
        int stackIn_7_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_16_0 = 0;
        int stackIn_20_0 = 0;
        int stackIn_23_0 = 0;
        int stackIn_25_0 = 0;
        RuntimeException decompiledCaughtException = null;
        var2 = wizardrun.field_H;
        try {
          GameShell.field_A.processMouseInput(126, true, StatefulWidgetPainter.field_s, ArchiveContainerHelpers.field_f);
          GameShell.field_A.animateDialogs((byte) 105);
          while (EmailValidationError.pollKeyboardEvent(param0 ^ -20316)) {
            GameShell.field_A.dispatchKeyPress(-90, MidiNote.field_r, EmailValidationError.typedCharacter);
          }
          if (UiThemeSetupHelpers.field_a != -1) {
            var1_int = UiThemeSetupHelpers.field_a;
            OpacityWidget.setAccountWorkflowState((byte) 43, -1);
            stackIn_7_0 = var1_int;
            return stackIn_7_0;
          }
          if (param0 != -20232) {
            field_c = (int[]) null;
          }
          if (WrappedTextLayout.field_i) {
            stackIn_13_0 = 3;
            return stackIn_13_0;
          }
          if (ChatMessage.field_j == TextButton.field_E) {
            stackIn_16_0 = 1;
            return stackIn_16_0;
          }
          if (!UiSpriteThemeHelpers.field_c.isComplete(true)) {
            stackIn_20_0 = 1;
            return stackIn_20_0;
          }
          if (NetworkArchiveRequest.field_y != TextButton.field_E) {
            stackIn_25_0 = -1;
            return stackIn_25_0;
          }
          stackIn_23_0 = 2;
          return stackIn_23_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw ExceptionSupport.wrapException((Throwable) ((Object) var1), "tf.A(" + param0 + ')');
        }
    }

    public static void releaseStatics(int param0) {
        field_d = null;
        field_a = null;
        field_b = null;
        field_c = null;
        if (param0 != 4286) {
          field_e = -53;
        }
    }

    public final void focusGained(java.awt.event.FocusEvent param0) {
    }

    public final synchronized void mouseEntered(java.awt.event.MouseEvent param0) {
        try {
          if (SavedDataRequest.mouseHandler != null) {
            CoverageFontLoader.mouseIdleTime = 0;
            wizardrun.pointerX = param0.getX();
            IterableNodeHashTable.pointerY = param0.getY();
            IndexedSpriteState.field_i = true;
          }
        } catch (RuntimeException runtimeException) {
          throw ExceptionSupport.wrapException((Throwable) ((Object) runtimeException), "tf.mouseEntered(" + (param0 != null ? "{...}" : "null") + ')');
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
          stackIn_6_1 = new StringBuilder().append("tf.mouseClicked(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw ExceptionSupport.wrapException((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    public final synchronized void mouseDragged(java.awt.event.MouseEvent param0) {
        RuntimeException var2 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (null == SavedDataRequest.mouseHandler) {
            return;
          }
          CoverageFontLoader.mouseIdleTime = 0;
          wizardrun.pointerX = param0.getX();
          IterableNodeHashTable.pointerY = param0.getY();
          IndexedSpriteState.field_i = true;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_6_0 = var2;
          stackIn_6_1 = new StringBuilder().append("tf.mouseDragged(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw ExceptionSupport.wrapException((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    public final synchronized void mouseReleased(java.awt.event.MouseEvent param0) {
        int var2_int = 0;
        RuntimeException var2 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (SavedDataRequest.mouseHandler != null) {
            CoverageFontLoader.mouseIdleTime = 0;
            ErrorReportingHelpers.pressedButton = 0;
            IndexedSpriteState.field_i = true;
            var2_int = param0.getModifiers();
            if (0 == (var2_int & 16)) {
            }
            if ((8 & var2_int) != 0) {
            }
            if (0 != (var2_int & 4)) {
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
          stackIn_11_1 = new StringBuilder().append("tf.mouseReleased(");
          if (param0 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw ExceptionSupport.wrapException((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(')').toString());
        }
    }

    static {
        field_e = 0;
        field_d = "Score: ";
        field_a = "The account name you use to access RuneScape and other Jagex.com games";
    }
}
