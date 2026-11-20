/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class GetThrusterBindingBalanceThreshold extends ConsoleCommand {
    static String field_o;
    static Widget field_p;

    final static String a(int param0) {
        String stackIn_56_0 = null;
        Object stackIn_94_0 = null;
        RuntimeException decompiledCaughtException = null;
        Object var1 = null;
        Object var2 = null;
        String var3 = null;
        String var4 = null;
        String var5 = null;
        int var6 = 0;
        int var7 = 0;
        String var8 = null;
        int var9 = 0;
        int var10 = 0;
        String var8Lifetime1;
        var10 = VoidHunters.field_G;
        try {
          if (param0 != -8037) {
            GetThrusterBindingBalanceThreshold.clearSharedReferences((byte) -1);
          }
          var1 = null;
          var2 = null;
          if (NetworkMessageState.chatChannel == 0 &&
            null != SetThrusterParticleSpeedDownshift.field_o) {
            var2 = GetRepairModePower.field_p;
          }
          if (NetworkMessageState.chatChannel == 2 &&
            !SetAutozoomAmountMultiply.isPrivateChatTargetAvailable(0)) {
            if (GetTorqueDownshift.isFriend(GetDebrisThrowable.privateChatTarget, (byte) -47)) {
              var2 = SetReverbGain.a(BodyDestroyedCondition.field_d, new String[]{ChoosePlayerNameForm.privateChatTargetDisplayName}, 78);
              if (var10 != 0) {
                var2 = SetReverbGain.a(GraphicsToolkitSelector.field_b, new String[]{ChoosePlayerNameForm.privateChatTargetDisplayName}, 114);
              }
            } else {
              var2 = SetReverbGain.a(GraphicsToolkitSelector.field_b, new String[]{ChoosePlayerNameForm.privateChatTargetDisplayName}, 114);
            }
            if (LegacyOpenGlTurbulenceEffect.quickChatMenuOpen) {
              ChatMessages.appendMessage((byte) -112, 0, (String) null, (String) null, (String) (var2), 2);
              WhirlpoolDigest.closeQuickChatIfOpen(param0 ^ -22377);
            }
          }
          if (null == var2 &&
            !GetReverbDamp.field_o &&
            OneShotSound.field_l == null) {
            var2 = SetMomentOfInertiaPerpointCalcDownshift.field_o;
          }
          if (var2 != null) {
            SetSelfDestructTimer.a(19204, (String) (var2), 0, (String) null, CarouselConstantRequests.field_a);
          } else {
            var3 = IntIndexTable.field_a;
            var3 = EscapePodFactory.a(1, var3);
            var4 = "";
            var5 = "|";
            var6 = NetworkMessageState.chatChannel;
            var7 = 0;
            if (var6 == 2) {
              var4 = SetReverbGain.a(UiComboBoxList.field_G, new String[]{ChoosePlayerNameForm.privateChatTargetDisplayName}, 91);
              var8 = SetReverbGain.a(GetLaserAimspeed.field_o, new String[]{var3}, 79);
              var7 = WidgetNode.field_l.width + (UiComboBoxRenderer.field_c.width - 485 + DebrisFactory.field_c.getStringWidth(var8)) - DebrisFactory.field_c.getStringWidth(var4);
              if (0 > var7) {
                var7 = 0;
              }
            }
            if (var6 != 2 ||
              var10 != 0) {
              if (0 == var6) {
                if (null == SetSpinningBladeSpindamageMultiplier.field_o &&
                  VariableCondition.field_e) {
                  var4 = "[" + UnsupportedGpuMaterialEffect.field_e + "] ";
                }
                if (null != SetSpinningBladeSpindamageMultiplier.field_o) {
                  var6 = 1;
                  boolean decompiledSharedTail0 = (!(OpenGlRenderbuffer.field_n) ||
                    LoginForm.teamChatName == null);
                  if (!decompiledSharedTail0) {
                    var4 = "[" + LoginForm.teamChatName + "] ";
                    decompiledSharedTail0 = (var10 != 0);
                  }
                  if (decompiledSharedTail0) {
                    var4 = "[" + SetReverbGain.a(MonotonicMillisClock.field_b, new String[]{SetSpinningBladeSpindamageMultiplier.field_o.field_Vb}, param0 + 8147) + "] ";
                  }
                }
              }
              if (OpenGlPbuffer.isChatInputDialogInitialized(0)) {
                stackIn_56_0 = ": ";
              } else {
                stackIn_56_0 = "<img=3>: ";
              }
              var8Lifetime1 = stackIn_56_0;
              var4 = var4 + var3 + var8Lifetime1;
              if (!GetBloomThresholdPercentage.field_p) {
                if (ConsoleSettingsScript.quickChatOnly) {
                  var5 = "";
                  var4 = "<col=999999>" + var4 + DateOfBirthInput.field_y + "</col>";
                  if (var10 != 0) {
                    var4 = "<col=999999>" + var4 + PasswordValidator.field_g + "</col>";
                    var5 = "";
                  }
                }
              } else {
                var4 = "<col=999999>" + var4 + PasswordValidator.field_g + "</col>";
                var5 = "";
              }
              var9 = DebrisFactory.field_c.getStringWidth(var4);
              if (!OpenGlPbuffer.isChatInputDialogInitialized(0)) {
                if (UiComboBoxRenderer.field_c.field_O &&
                  -UiComboBoxRenderer.field_c.screenX + PlayerGameData.field_b < var9) {
                  if (!GetBloomThresholdPercentage.field_p) {
                    var1 = DateOfBirthInput.field_y;
                  } else {
                    var1 = "Broken!";
                  }
                }
                if (UiComboBoxRenderer.field_c.field_o != 0 &&
                  var9 > UiComboBoxRenderer.field_c.field_r &&
                  !GetBloomThresholdPercentage.field_p) {
                  ChatChannelControl.setChatChannel(param0 + 8037);
                }
              }
            }
            SetSelfDestructTimer.a(19204, var4 + BitmapFont.escapeMarkup(SetShipAimLines.field_p.toString()), var7, var5, ConsoleCommand.field_m[var6]);
            if (!SetFightersPerPlayerMaximum.chatInputActive) {
              WidgetNode.field_l.field_O = false;
            }
            if (WidgetNode.field_l.field_O) {
              var1 = SetReverbGain.a(MissionGenerationDataFactory.field_a, new String[]{var3, ChoosePlayerNameForm.privateChatTargetDisplayName}, 100);
            }
          }
          stackIn_94_0 = var1;
          return (String) (stackIn_94_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw GetMissileLauncherRandomness.wrapClientException((Throwable) (var1), "sdb.B(" + param0 + ')');
        }
    }

    final ConsoleValue execute(ConsoleValue[] arguments, int obfuscationGuard) {
        RuntimeException var3 = null;
        ConsoleValue stackIn_4_0 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (obfuscationGuard >= -119) {
            field_o = (String) null;
          }
          stackIn_4_0 = new ConsoleValue(GetLaserFireForce.a(48, 117));
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_8_0 = var3;
          stackIn_8_1 = new StringBuilder().append("sdb.A(");
          if (arguments == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.wrapClientException((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(obfuscationGuard).append(')').toString());
        }
    }

    GetThrusterBindingBalanceThreshold(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    public static void clearSharedReferences(byte param0) {
        try {
          field_o = null;
          field_p = null;
          int var1_int = -99 % ((-65 - param0) / 39);
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.wrapClientException((Throwable) ((Object) runtimeException), "sdb.C(" + param0 + ')');
        }
    }

    static {
        field_o = "Scale up map zone";
    }
}
