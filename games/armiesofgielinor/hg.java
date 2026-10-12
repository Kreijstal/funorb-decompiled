/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hg implements java.awt.event.KeyListener, java.awt.event.FocusListener {
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

    public final synchronized void focusLost(java.awt.event.FocusEvent param0) {
        try {
          if (null != QuickChatCategory.field_w) {
            us.field_c = -1;
          }
        } catch (RuntimeException runtimeException) {
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) runtimeException), "hg.focusLost(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final static NodeDeque a(int param0) {
        NodeDeque var1 = new NodeDeque();
        var1.addLast((byte) -119, (IntrusiveNode) (new re("hello", new Class[]{}, "Be friendly.")));
        var1.addLast((byte) -119, (IntrusiveNode) (new ba("printCoat", new Class[]{}, "Print out your current coat of arms in a line ready for the config file.")));
        var1.addLast((byte) -119, (IntrusiveNode) (new jq("setCoat", new Class[]{String.class}, "Set your coat of arms to one indicated by the format used in the config file (including coat=).")));
        int var2 = -43 % ((param0 - 32) / 63);
        var1.addLast((byte) -119, (IntrusiveNode) (new qa("channelFadeTime", new Class[]{Integer.TYPE}, "Change the time to fade between channel sets in the campaign menu, in milliseconds.")));
        var1.addLast((byte) -119, (IntrusiveNode) (new oh("channelBaseVolume", new Class[]{Integer.TYPE}, "(From 0 to 256) Change the volume of the base (<=3) channels in the campaign menu when in a campaign map.")));
        var1.addLast((byte) -119, (IntrusiveNode) (new mw("listMissions", new Class[]{Integer.TYPE}, "List available missions.")));
        var1.addLast((byte) -119, (IntrusiveNode) (new wt("giveTo", new Class[]{Integer.TYPE}, "Change ownership of a selected tile in the map.")));
        var1.addLast((byte) -119, (IntrusiveNode) (new qp("defeat", new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE}, "Defeat the given player. And specify it as happening in the given number of turns and damage taken")));
        var1.addLast((byte) -119, (IntrusiveNode) (new an("defeat", new Class[]{Integer.TYPE}, "Defeat the given player.")));
        var1.addLast((byte) -119, (IntrusiveNode) (new oa("toggleSkip", new Class[]{}, "Toggle Automatically Skipping Player Turns")));
        var1.addLast((byte) -119, (IntrusiveNode) (new gg("printVictoryConditions", new Class[]{}, "Print out victory conditions for current player")));
        var1.addLast((byte) -119, (IntrusiveNode) (new ot("fixInvisible", new Class[]{}, "Make invisible units visible")));
        return var1;
    }

    public final synchronized void keyReleased(java.awt.event.KeyEvent param0) {
        RuntimeException runtimeException = null;
        int var2_int = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (QuickChatCategory.field_w != null) {
            fc.field_b = 0;
            var2_int = param0.getKeyCode();
            if (var2_int >= 0 &&
              var2_int < kw.field_M.length) {
              var2_int = -129 & kw.field_M[var2_int];
            } else {
              var2_int = -1;
            }
            if (us.field_c >= 0 &&
              var2_int >= 0) {
              SphinxActionRequest.field_x[us.field_c] = ~var2_int;
              us.field_c = 127 & 1 + us.field_c;
              if (cc.field_a == us.field_c) {
                us.field_c = -1;
              }
            }
          }
          param0.consume();
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_14_0 = runtimeException;
          stackIn_14_1 = new StringBuilder().append("hg.keyReleased(");
          if (param0 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(')').toString());
        }
    }

    public final void focusGained(java.awt.event.FocusEvent param0) {
    }

    public final void keyTyped(java.awt.event.KeyEvent param0) {
        int var2_int = 0;
        int var3 = 0;
        try {
          if (null != QuickChatCategory.field_w) {
            var2_int = param0.getKeyChar();
            if (var2_int != 0 && var2_int != 65535 &&
              AiActionCandidate.a((char) var2_int, 16150)) {
              var3 = 127 & cr.field_Z + 1;
              if (var3 != SummonAction.field_E) {
                gt.field_d[cr.field_Z] = -1;
                SpellCastAction.field_u[cr.field_Z] = (char)var2_int;
                cr.field_Z = var3;
              }
            }
          }
          param0.consume();
        } catch (RuntimeException runtimeException) {
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) runtimeException), "hg.keyTyped(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    public final synchronized void keyPressed(java.awt.event.KeyEvent param0) {
        int var2_int = 0;
        int var3 = 0;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_24_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        int var3Lifetime1;
        try {
          if (null != QuickChatCategory.field_w) {
            fc.field_b = 0;
            var2_int = param0.getKeyCode();
            if (0 <= var2_int &&
              kw.field_M.length > var2_int) {
              var2_int = kw.field_M[var2_int];
              if (0 != (128 & var2_int)) {
                var2_int = -1;
              }
            } else {
              var2_int = -1;
            }
            if (us.field_c >= 0 &&
              0 <= var2_int) {
              SphinxActionRequest.field_x[us.field_c] = var2_int;
              us.field_c = us.field_c + 1 & 127;
              if (cc.field_a == us.field_c) {
                us.field_c = -1;
              }
            }
            if (var2_int >= 0) {
              var3 = 127 & cr.field_Z + 1;
              if (var3 != SummonAction.field_E) {
                gt.field_d[cr.field_Z] = var2_int;
                SpellCastAction.field_u[cr.field_Z] = (char)0;
                cr.field_Z = var3;
              }
            }
            var3Lifetime1 = param0.getModifiers();
            if (0 != (var3Lifetime1 & 10)) {
              param0.consume();
              return;
            }
            if (var2_int == 85) {
              param0.consume();
              return;
            }
            if (10 == var2_int) {
              param0.consume();
              return;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_23_0 = var2;
          stackIn_23_1 = new StringBuilder().append("hg.keyPressed(");
          if (param0 == null) {
            stackIn_24_2 = "null";
          } else {
            stackIn_24_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_23_0), ((StringBuilder) (Object) stackIn_23_1).append(stackIn_24_2).append(')').toString());
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
