/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class SetMassDriverEnergyUsed extends ConsoleCommand {
    static int field_o;
    static int field_q;
    static String field_p;

    SetMassDriverEnergyUsed(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    final ConsoleValue execute(ConsoleValue[] arguments, int obfuscationGuard) {
        RuntimeException var3 = null;
        ConsoleValue stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          SetMachineGunEnergyUsed.submitSettingsChange(159, 62, arguments[0].intValue(106));
          if (obfuscationGuard > -119) {
            field_q = 105;
          }
          stackIn_3_0 = new ConsoleValue("void");
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("gbb.A(");
          if (arguments == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.wrapClientException((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(obfuscationGuard).append(')').toString());
        }
    }

    final static boolean handleChatKeyEvent(int param0, int param1, int param2, byte param3) {
        int var4;
        int stackIn_11_0 = 0;
        int stackIn_46_0 = 0;
        if (param3 != 23) {
          return true;
        }
        if (RoundResultFactory.quickChatHelpWindow == null) {
          if (!SetFightersPerPlayerMaximum.chatInputActive) {
            if (!LegacyOpenGlTurbulenceEffect.quickChatMenuOpen &&
              9 != SetBombletSprayProjectileDamage.field_o &&
              SetBombletSprayProjectileDamage.field_o != 10 &&
              SetBombletSprayProjectileDamage.field_o != 11) {
              if (SetBombletSprayProjectileDamage.field_o != 80) {
                return false;
              }
              if (!ChatPermissions.isFreeChatAllowed(118)) {
                return false;
              }
              SetFightersPerPlayerMaximum.chatInputActive = true;
              return true;
            }
            return GetDetachmentMode.handleQuickChatKeyEvent(param0, -9307, param1);
          }
          if (!ChatPermissions.isFreeChatAllowed(-115)) {
            return false;
          }
          stackIn_46_0 = (!SetFighterRepairAmount.handleTextChatKeyEvent(param2, param0, -85)) ? 0 : 1;
          var4 = stackIn_46_0;
          if (SetBombletSprayProjectileDamage.field_o == 80 ||
            84 == SetBombletSprayProjectileDamage.field_o) {
            var4 = 1;
            SetFightersPerPlayerMaximum.chatInputActive = false;
          }
        } else {
          if (SetBombletSprayProjectileDamage.field_o == 13) {
            RoundResultFactory.quickChatHelpWindow = null;
            return true;
          }
          if (!SetFightersPerPlayerMaximum.chatInputActive) {
            if (LegacyOpenGlTurbulenceEffect.quickChatMenuOpen) {
              return GetDetachmentMode.handleQuickChatKeyEvent(param0, -9307, param1);
            }
            if (9 == SetBombletSprayProjectileDamage.field_o) {
              return GetDetachmentMode.handleQuickChatKeyEvent(param0, -9307, param1);
            }
            if (SetBombletSprayProjectileDamage.field_o != 10 &&
              SetBombletSprayProjectileDamage.field_o != 11) {
              if (SetBombletSprayProjectileDamage.field_o != 80) {
                return false;
              }
              if (!ChatPermissions.isFreeChatAllowed(118)) {
                return false;
              }
              SetFightersPerPlayerMaximum.chatInputActive = true;
              return true;
            }
            return GetDetachmentMode.handleQuickChatKeyEvent(param0, -9307, param1);
          }
          if (!ChatPermissions.isFreeChatAllowed(-115)) {
            return false;
          }
          stackIn_11_0 = (!SetFighterRepairAmount.handleTextChatKeyEvent(param2, param0, -85)) ? 0 : 1;
          var4 = stackIn_11_0;
          if (SetBombletSprayProjectileDamage.field_o == 80) {
            var4 = 1;
            SetFightersPerPlayerMaximum.chatInputActive = false;
          } else {
            if (84 == SetBombletSprayProjectileDamage.field_o) {
              var4 = 1;
              SetFightersPerPlayerMaximum.chatInputActive = false;
            }
          }
        }
        if (SetBombletSprayProjectileDamage.field_o == 13) {
          ChatInputResetter.clearChatInput(26718);
          var4 = 1;
          SetFightersPerPlayerMaximum.chatInputActive = false;
        }
        return var4 != 0;
    }

    final static void insertSecondaryAfter(DualLinkNode param0, DualLinkNode param1, byte param2) {
        try {
          if (null != param0.secondaryPrevious) {
            param0.unlinkSecondary((byte) -35);
          }
          param0.secondaryNext = param1.secondaryNext;
          param0.secondaryPrevious = param1;
          param0.secondaryPrevious.secondaryNext = param0;
          if (param2 != -68) {
            SetMassDriverEnergyUsed.handleChatKeyEvent(12, 69, 48, (byte) 94);
          }
          param0.secondaryNext.secondaryPrevious = param0;
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.wrapClientException((Throwable) ((Object) runtimeException), "gbb.D(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    public static void clearSharedReferences(boolean param0) {
        field_p = null;
        if (!param0) {
          field_o = 71;
        }
    }

    static {
        field_o = 256;
        field_p = "Only show game chat from my friends";
    }
}
