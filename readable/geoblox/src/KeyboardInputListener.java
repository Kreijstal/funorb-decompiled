/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class KeyboardInputListener implements java.awt.event.KeyListener, java.awt.event.FocusListener {
    static Sprite field_a;
    static String field_b;

    public final synchronized void keyPressed(java.awt.event.KeyEvent event) {
        int internalKeyCode = 0;
        RuntimeException callbackFailureForContext = null;
        int nextEventWriteIndexOrModifiers = 0;
        RuntimeException callbackFailureBeforeEventDescription = null;
        StringBuilder callbackMessagePrefix = null;
        String eventArgumentDescription = null;
        RuntimeException caughtCallbackFailure = null;
        try {
          if (je.keyboardListener == null) {
            return;
          }
          L0: {
            nk.keyboardIdleTicks = 0;
            internalKeyCode = event.getKeyCode();
            if (internalKeyCode >= 0) {
              if (oe.awtKeyCodeToInternalCode.length > internalKeyCode) {
                internalKeyCode = oe.awtKeyCodeToInternalCode[internalKeyCode];
                if ((internalKeyCode & 128) == 0) {
                  break L0;
                }
                internalKeyCode = -1;
                break L0;
              }
            }
            internalKeyCode = -1;
          }
          if (ii.keyStateWriteIndexOrResetSentinel >= 0) {
            if (internalKeyCode >= 0) {
              gf.queuedKeyStateChanges[ii.keyStateWriteIndexOrResetSentinel] = internalKeyCode;
              ii.keyStateWriteIndexOrResetSentinel = 127 & 1 + ii.keyStateWriteIndexOrResetSentinel;
              if (gk.keyStateReadIndex == ii.keyStateWriteIndexOrResetSentinel) {
                ii.keyStateWriteIndexOrResetSentinel = -1;
              }
            }
          }
          if (internalKeyCode >= 0) {
            nextEventWriteIndexOrModifiers = 127 & 1 + BufferedSocket.keyEventWriteIndex;
            if (nextEventWriteIndexOrModifiers != vd.keyboardEventReadIndex) {
              kj.queuedKeyboardEventCodes[BufferedSocket.keyEventWriteIndex] = internalKeyCode;
              ai.queuedKeyboardEventCharacters[BufferedSocket.keyEventWriteIndex] = (char)0;
              BufferedSocket.keyEventWriteIndex = nextEventWriteIndexOrModifiers;
            }
          }
          nextEventWriteIndexOrModifiers = event.getModifiers();
          if ((nextEventWriteIndexOrModifiers & 10) == 0) {
            if (85 != internalKeyCode) {
              if (internalKeyCode != 10) {
                return;
              }
            }
          }
          event.consume();
          return;
        } catch (java.lang.RuntimeException callbackFailure) {
          caughtCallbackFailure = callbackFailure;
          callbackFailureForContext = caughtCallbackFailure;
          callbackFailureBeforeEventDescription = (RuntimeException) (callbackFailureForContext);
          callbackMessagePrefix = new StringBuilder().append("wl.keyPressed(");
          if (event == null) {
            eventArgumentDescription = "null";
          } else {
            eventArgumentDescription = "{...}";
          }
          throw t.a((Throwable) ((Object) callbackFailureBeforeEventDescription), ((StringBuilder) (Object) callbackMessagePrefix).append(eventArgumentDescription).append(')').toString());
        }
    }

    public final void focusGained(java.awt.event.FocusEvent unusedFocusEvent) {
    }

    public static void a(int param0) {
        field_a = null;
        if (param0 != 31997) {
            return;
        }
        field_b = null;
    }

    public final void keyTyped(java.awt.event.KeyEvent event) {
        int typedCharacterCode = 0;
        int nextEventWriteIndex = 0;
        try {
            if (!(je.keyboardListener == null)) {
                typedCharacterCode = event.getKeyChar();
                if (typedCharacterCode != 0 && typedCharacterCode != 65535 && tc.a((byte) -112, (char) typedCharacterCode)) {
                    nextEventWriteIndex = 1 + BufferedSocket.keyEventWriteIndex & 127;
                    if (nextEventWriteIndex != vd.keyboardEventReadIndex) {
                        kj.queuedKeyboardEventCodes[BufferedSocket.keyEventWriteIndex] = -1;
                        ai.queuedKeyboardEventCharacters[BufferedSocket.keyEventWriteIndex] = (char)typedCharacterCode;
                        BufferedSocket.keyEventWriteIndex = nextEventWriteIndex;
                    }
                }
            }
            event.consume();
        } catch (RuntimeException callbackFailure) {
            throw t.a((Throwable) ((Object) callbackFailure), "wl.keyTyped(" + (event != null ? "{...}" : "null") + ')');
        }
    }

    public final synchronized void keyReleased(java.awt.event.KeyEvent event) {
        RuntimeException callbackFailureForContext = null;
        int internalKeyCode = 0;
        RuntimeException callbackFailureBeforeEventDescription = null;
        StringBuilder callbackMessagePrefix = null;
        String eventArgumentDescription = null;
        RuntimeException caughtCallbackFailure = null;
        try {
          if (je.keyboardListener != null) {
            L1: {
              nk.keyboardIdleTicks = 0;
              internalKeyCode = event.getKeyCode();
              if (internalKeyCode >= 0) {
                if (oe.awtKeyCodeToInternalCode.length > internalKeyCode) {
                  internalKeyCode = oe.awtKeyCodeToInternalCode[internalKeyCode] & -129;
                  break L1;
                }
              }
              internalKeyCode = -1;
            }
            if (ii.keyStateWriteIndexOrResetSentinel >= 0) {
              if (0 <= internalKeyCode) {
                gf.queuedKeyStateChanges[ii.keyStateWriteIndexOrResetSentinel] = ~internalKeyCode;
                ii.keyStateWriteIndexOrResetSentinel = 1 + ii.keyStateWriteIndexOrResetSentinel & 127;
                if (gk.keyStateReadIndex == ii.keyStateWriteIndexOrResetSentinel) {
                  ii.keyStateWriteIndexOrResetSentinel = -1;
                }
              }
            }
          }
          event.consume();
          return;
        } catch (java.lang.RuntimeException callbackFailure) {
          caughtCallbackFailure = callbackFailure;
          callbackFailureForContext = caughtCallbackFailure;
          callbackFailureBeforeEventDescription = (RuntimeException) (callbackFailureForContext);
          callbackMessagePrefix = new StringBuilder().append("wl.keyReleased(");
          if (event == null) {
            eventArgumentDescription = "null";
          } else {
            eventArgumentDescription = "{...}";
          }
          throw t.a((Throwable) ((Object) callbackFailureBeforeEventDescription), ((StringBuilder) (Object) callbackMessagePrefix).append(eventArgumentDescription).append(')').toString());
        }
    }

    final static void b(int param0) {
        String var2 = (String) null;
        f.b(rh.field_i, (String) null, 7697781);
        if (param0 != -1) {
            field_a = (Sprite) null;
        }
    }

    public final synchronized void focusLost(java.awt.event.FocusEvent event) {
        RuntimeException callbackFailureForContext = null;
        RuntimeException callbackFailureBeforeEventDescription = null;
        StringBuilder callbackMessagePrefix = null;
        String eventArgumentDescription = null;
        RuntimeException caughtCallbackFailure = null;
        try {
          if (null == je.keyboardListener) {
            return;
          }
          ii.keyStateWriteIndexOrResetSentinel = -1;
          return;
        } catch (java.lang.RuntimeException callbackFailure) {
          caughtCallbackFailure = callbackFailure;
          callbackFailureForContext = caughtCallbackFailure;
          callbackFailureBeforeEventDescription = (RuntimeException) (callbackFailureForContext);
          callbackMessagePrefix = new StringBuilder().append("wl.focusLost(");
          if (event == null) {
            eventArgumentDescription = "null";
          } else {
            eventArgumentDescription = "{...}";
          }
          throw t.a((Throwable) ((Object) callbackFailureBeforeEventDescription), ((StringBuilder) (Object) callbackMessagePrefix).append(eventArgumentDescription).append(')').toString());
        }
    }

    static {
        field_a = new Sprite(30, 30);
        field_b = "Clear bonus!";
    }
}
