/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class KeyboardInputListener implements java.awt.event.KeyListener, java.awt.event.FocusListener {
    static int[] field_a;
    static String[] field_d;
    static String field_c;
    static int field_b;

    public static void a(boolean param0) {
        field_c = null;
        field_a = null;
        field_d = null;
        if (!param0) {
          field_b = -14;
        }
    }

    public final synchronized void focusLost(java.awt.event.FocusEvent event) {
        try {
          if (null != QuickChatCategory.keyboardListener) {
            us.keyStateWriteIndex = -1;
          }
        } catch (RuntimeException runtimeException) {
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) runtimeException), "hg.focusLost(" + (event != null ? "{...}" : "null") + ')');
        }
    }

    final static NodeDeque createDebugCommandRegistry(int obfuscationGuard) {
        NodeDeque commands = new NodeDeque();
        commands.addLast((byte) -119, (IntrusiveNode) (new HelloConsoleCommand("hello", new Class[]{}, "Be friendly.")));
        commands.addLast((byte) -119, (IntrusiveNode) (new PrintCoatConsoleCommand("printCoat", new Class[]{}, "Print out your current coat of arms in a line ready for the config file.")));
        commands.addLast((byte) -119, (IntrusiveNode) (new SetCoatConsoleCommand("setCoat", new Class[]{String.class}, "Set your coat of arms to one indicated by the format used in the config file (including coat=).")));
        int guardRemainder = -43 % ((obfuscationGuard - 32) / 63);
        commands.addLast((byte) -119, (IntrusiveNode) (new ChannelFadeTimeConsoleCommand("channelFadeTime", new Class[]{Integer.TYPE}, "Change the time to fade between channel sets in the campaign menu, in milliseconds.")));
        commands.addLast((byte) -119, (IntrusiveNode) (new ChannelBaseVolumeConsoleCommand("channelBaseVolume", new Class[]{Integer.TYPE}, "(From 0 to 256) Change the volume of the base (<=3) channels in the campaign menu when in a campaign map.")));
        commands.addLast((byte) -119, (IntrusiveNode) (new ListMissionsConsoleCommand("listMissions", new Class[]{Integer.TYPE}, "List available missions.")));
        commands.addLast((byte) -119, (IntrusiveNode) (new GiveTileConsoleCommand("giveTo", new Class[]{Integer.TYPE}, "Change ownership of a selected tile in the map.")));
        commands.addLast((byte) -119, (IntrusiveNode) (new DefeatPlayerWithMetricsConsoleCommand("defeat", new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE}, "Defeat the given player. And specify it as happening in the given number of turns and damage taken")));
        commands.addLast((byte) -119, (IntrusiveNode) (new DefeatPlayerConsoleCommand("defeat", new Class[]{Integer.TYPE}, "Defeat the given player.")));
        commands.addLast((byte) -119, (IntrusiveNode) (new ToggleTurnSkipConsoleCommand("toggleSkip", new Class[]{}, "Toggle Automatically Skipping Player Turns")));
        commands.addLast((byte) -119, (IntrusiveNode) (new PrintVictoryConditionsConsoleCommand("printVictoryConditions", new Class[]{}, "Print out victory conditions for current player")));
        commands.addLast((byte) -119, (IntrusiveNode) (new FixInvisibleUnitsConsoleCommand("fixInvisible", new Class[]{}, "Make invisible units visible")));
        return commands;
    }

    public final synchronized void keyReleased(java.awt.event.KeyEvent event) {
        RuntimeException runtimeException = null;
        int mappedKeyCode = 0;
        RuntimeException failureForContext = null;
        StringBuilder errorContext = null;
        String eventDescription = null;
        RuntimeException caughtFailure = null;
        try {
          if (QuickChatCategory.keyboardListener != null) {
            fc.keyboardIdleTicks = 0;
            mappedKeyCode = event.getKeyCode();
            if (mappedKeyCode >= 0 &&
              mappedKeyCode < kw.awtToClientKeyCodes.length) {
              mappedKeyCode = -129 & kw.awtToClientKeyCodes[mappedKeyCode];
            } else {
              mappedKeyCode = -1;
            }
            if (us.keyStateWriteIndex >= 0 &&
              mappedKeyCode >= 0) {
              SphinxActionRequest.keyStateEvents[us.keyStateWriteIndex] = ~mappedKeyCode;
              us.keyStateWriteIndex = 127 & 1 + us.keyStateWriteIndex;
              if (cc.keyStateReadIndex == us.keyStateWriteIndex) {
                us.keyStateWriteIndex = -1;
              }
            }
          }
          event.consume();
          return;
        } catch (java.lang.RuntimeException caughtParameter) {
          caughtFailure = caughtParameter;
          runtimeException = caughtFailure;
          failureForContext = runtimeException;
          errorContext = new StringBuilder().append("hg.keyReleased(");
          if (event == null) {
            eventDescription = "null";
          } else {
            eventDescription = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) failureForContext), ((StringBuilder) (Object) errorContext).append(eventDescription).append(')').toString());
        }
    }

    public final void focusGained(java.awt.event.FocusEvent event) {
    }

    public final void keyTyped(java.awt.event.KeyEvent event) {
        int characterCode = 0;
        int nextEventIndex = 0;
        try {
          if (null != QuickChatCategory.keyboardListener) {
            characterCode = event.getKeyChar();
            if (characterCode != 0 && characterCode != 65535 &&
              AiActionCandidate.a((char) characterCode, 16150)) {
              nextEventIndex = 127 & cr.keyEventWriteIndex + 1;
              if (nextEventIndex != SummonAction.keyEventReadIndex) {
                gt.keyEventCodes[cr.keyEventWriteIndex] = -1;
                SpellCastAction.keyEventCharacters[cr.keyEventWriteIndex] = (char)characterCode;
                cr.keyEventWriteIndex = nextEventIndex;
              }
            }
          }
          event.consume();
        } catch (RuntimeException runtimeException) {
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) runtimeException), "hg.keyTyped(" + (event != null ? "{...}" : "null") + ')');
        }
    }

    public final synchronized void keyPressed(java.awt.event.KeyEvent event) {
        int mappedKeyCode = 0;
        int nextEventIndex = 0;
        RuntimeException failureForContext = null;
        StringBuilder errorContext = null;
        String eventDescription = null;
        RuntimeException caughtFailure = null;
        RuntimeException failure = null;
        int modifiers;
        try {
          if (null != QuickChatCategory.keyboardListener) {
            fc.keyboardIdleTicks = 0;
            mappedKeyCode = event.getKeyCode();
            if (0 <= mappedKeyCode &&
              kw.awtToClientKeyCodes.length > mappedKeyCode) {
              mappedKeyCode = kw.awtToClientKeyCodes[mappedKeyCode];
              if (0 != (128 & mappedKeyCode)) {
                mappedKeyCode = -1;
              }
            } else {
              mappedKeyCode = -1;
            }
            if (us.keyStateWriteIndex >= 0 &&
              0 <= mappedKeyCode) {
              SphinxActionRequest.keyStateEvents[us.keyStateWriteIndex] = mappedKeyCode;
              us.keyStateWriteIndex = us.keyStateWriteIndex + 1 & 127;
              if (cc.keyStateReadIndex == us.keyStateWriteIndex) {
                us.keyStateWriteIndex = -1;
              }
            }
            if (mappedKeyCode >= 0) {
              nextEventIndex = 127 & cr.keyEventWriteIndex + 1;
              if (nextEventIndex != SummonAction.keyEventReadIndex) {
                gt.keyEventCodes[cr.keyEventWriteIndex] = mappedKeyCode;
                SpellCastAction.keyEventCharacters[cr.keyEventWriteIndex] = (char)0;
                cr.keyEventWriteIndex = nextEventIndex;
              }
            }
            modifiers = event.getModifiers();
            if (0 != (modifiers & 10)) {
              event.consume();
              return;
            }
            if (mappedKeyCode == 85) {
              event.consume();
              return;
            }
            if (10 == mappedKeyCode) {
              event.consume();
              return;
            }
          }
          return;
        } catch (java.lang.RuntimeException caughtParameter) {
          caughtFailure = caughtParameter;
          failure = caughtFailure;
          failureForContext = failure;
          errorContext = new StringBuilder().append("hg.keyPressed(");
          if (event == null) {
            eventDescription = "null";
          } else {
            eventDescription = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) failureForContext), ((StringBuilder) (Object) errorContext).append(eventDescription).append(')').toString());
        }
    }

    final static boolean isValidSocialTargetName(byte obfuscationGuard, CharSequence name) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        var3 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          if (obfuscationGuard > -5) {
            return true;
          }
          if (!AdaptiveMidiPcmStream.hasValidAccountNameShape(name, 1, true)) {
            return false;
          }
          var2_int = 0;
          while (true) {
            if (var2_int >= name.length()) {
              return true;
            }
            if (ph.isAccountNameCharacter(-48, name.charAt(var2_int))) {
              var2_int++;
              continue;
            }
            break;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_17_0 = var2;
          stackIn_17_1 = new StringBuilder().append("hg.B(").append(obfuscationGuard).append(',');
          if (name == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(')').toString());
        }
    }

    static {
        field_c = "Spells to move your units around more efficiently, and to control your enemies.";
    }
}
