/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class SetMissionDebrisDefaultProbability extends ConsoleCommand {
    static int field_o;
    static int[] faceSortIndices;

    final ConsoleValue execute(ConsoleValue[] arguments, int obfuscationGuard) {
        RuntimeException var3 = null;
        ConsoleValue stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (obfuscationGuard >= -119) {
            SetMissionDebrisDefaultProbability.clearSharedReferences(80);
          }
          SetMachineGunEnergyUsed.submitSettingsChange(68, 62, arguments[0].intValue(91));
          stackIn_3_0 = new ConsoleValue("void");
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("aq.A(");
          if (arguments == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.wrapClientException((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(obfuscationGuard).append(')').toString());
        }
    }

    SetMissionDebrisDefaultProbability(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    public static void clearSharedReferences(int param0) {
        faceSortIndices = null;
        if (param0 != -10441) {
          field_o = -54;
        }
    }

    final static ChatMessage b(int param0, int param1, int param2, int param3) {
        Object var4;
        int var5;
        int var6;
        int var7;
        ChatMessage var8_ref_pgb;
        int var9;
        int var10_int;
        int var13;
        boolean stackIn_46_0 = false;
        boolean stackIn_54_0 = false;
        boolean stackIn_61_0 = false;
        boolean stackIn_73_0 = false;
        boolean stackIn_81_0 = false;
        boolean stackIn_88_0 = false;
        int var8;
        ChatMessage var9_ref_pgb;
        String var10;
        String var11;
        int var12;
        int var7Lifetime1;
        int var9Lifetime1;
        int var8Lifetime1;
        var13 = VoidHunters.field_G;
        var4 = null;
        if (param3 > -70) {
          return (ChatMessage) null;
        }
        GetUseLines.field_p.content.children.clear(122);
        var5 = 0;
        var6 = 0;
        for (var7 = -1 + SetRepairModePower.chatMessageCount; 0 <= var7; var7--) {
          var8_ref_pgb = NullUiRenderer.chatMessages[var7];
          var9 = 0;
          if (!GetBloomThresholdPercentage.field_p &&
            var5 < EnvironmentReflectionGpuMaterialEffect.field_k) {
            var10_int = SetReverbDry.getChatFilter(var8_ref_pgb.channelType, (byte) 19);
            if (var10_int <= var8_ref_pgb.getVisibilityPriority(1) && (var8_ref_pgb.unfiltered ||
              !SetUseLines.isIgnoredPlayer((byte) -94, var8_ref_pgb.senderName))) {
              var9 = 1;
            }
          }
          if (var9 != 0) {
            if (null == var8_ref_pgb.widget ||
              ShipBodyFactoryHolder.field_b) {
              if (null != var8_ref_pgb.widget) {
              }
              var10 = FullscreenFailureReason.formatChatPrefix(true, var8_ref_pgb);
              var11 = var10 + BitmapFont.escapeMarkup(var8_ref_pgb.text);
              var12 = GetReverbFeedback.getChatMessageColor(2, var8_ref_pgb);
              var8_ref_pgb.widget = new Widget(0L, TargetLock.field_b, var11);
              var8_ref_pgb.widget.field_ib = ((TargetLock.field_b.field_ib & 16711422) >> 1) - (var12 >> 1 & 8355711) + var12;
              var8_ref_pgb.widget.field_Y = var12;
              var8_ref_pgb.widget.field_qb = ((TargetLock.field_b.field_qb & 16711422) >> 1) + var12 - (8355711 & var12 >> 1);
              var6 = var6 + param0;
              var8_ref_pgb.widget.font = DebrisFactory.field_c;
            }
            var5++;
          } else {
            var8_ref_pgb.widget = null;
          }
        }
        var7Lifetime1 = 0;
        for (var8 = 0; SetRepairModePower.chatMessageCount > var8; var8++) {
          var9_ref_pgb = NullUiRenderer.chatMessages[var8];
          if (null != var9_ref_pgb.widget) {
            GetUseLines.field_p.content.addChild(-561, var9_ref_pgb.widget);
            var9_ref_pgb.widget.setBounds(param1, 122, var9_ref_pgb.widget.getPreferredWidth(66), var7Lifetime1, param0);
            var7Lifetime1 = var7Lifetime1 + param0;
            if (var9_ref_pgb.widget.field_o != 0) {
              var4 = var9_ref_pgb;
            }
          }
        }
        var8Lifetime1 = -var7Lifetime1 - (-var6 - (GetUseLines.field_p.content.height + GetUseLines.field_p.content.field_E));
        GetUseLines.field_p.content.y = GetUseLines.field_p.content.y + var8Lifetime1;
        GetUseLines.field_p.content.height = GetUseLines.field_p.content.height - var8Lifetime1;
        if (!ShipBodyFactoryHolder.field_b) {
          if (ShipBodyFactoryHolder.field_b) {
            ShipBodyFactoryHolder.field_b = false;
            GetUseLines.field_p.content.field_db = 0;
            GetReverbDamp.field_o = true;
            GetUseLines.field_p.content.y = GetUseLines.field_p.viewport.height - GetUseLines.field_p.content.height;
          }
          GetUseLines.field_p.content.field_E = -GetUseLines.field_p.content.height + var7Lifetime1;
          if (!SetFightersPerPlayerMaximum.chatInputActive) {
            var9Lifetime1 = -GetUseLines.field_p.content.field_E - GetUseLines.field_p.content.height + GetUseLines.field_p.viewport.height;
            if (GetReverbDamp.field_o) {
              GetUseLines.field_p.content.field_db = -GetUseLines.field_p.content.y + var9Lifetime1;
            }
            GetUseLines.field_p.updateScrolling(2 * param0 * param2, true, param0, 0);
            stackIn_73_0 = (var9Lifetime1 == GetUseLines.field_p.content.y + GetUseLines.field_p.content.field_db);
            GetReverbDamp.field_o = stackIn_73_0;
          } else {
            if (null == OneShotSound.field_l) {
              var9Lifetime1 = -GetUseLines.field_p.content.field_E - GetUseLines.field_p.content.height + GetUseLines.field_p.viewport.height;
              if (GetReverbDamp.field_o) {
                GetUseLines.field_p.content.field_db = -GetUseLines.field_p.content.y + var9Lifetime1;
              }
              GetUseLines.field_p.updateScrolling(2 * param0 * param2, true, param0, 0);
              stackIn_81_0 = (var9Lifetime1 == GetUseLines.field_p.content.y + GetUseLines.field_p.content.field_db);
              GetReverbDamp.field_o = stackIn_81_0;
            } else {
              GetReverbDamp.field_o = true;
              var9Lifetime1 = -GetUseLines.field_p.content.field_E - GetUseLines.field_p.content.height + GetUseLines.field_p.viewport.height;
              if (GetReverbDamp.field_o) {
                GetUseLines.field_p.content.field_db = -GetUseLines.field_p.content.y + var9Lifetime1;
              }
              GetUseLines.field_p.updateScrolling(2 * param0 * param2, true, param0, 0);
              stackIn_88_0 = (var9Lifetime1 == GetUseLines.field_p.content.y + GetUseLines.field_p.content.field_db);
              GetReverbDamp.field_o = stackIn_88_0;
            }
          }
        } else {
          GetUseLines.field_p.content.height = var7Lifetime1;
          if (ShipBodyFactoryHolder.field_b) {
            ShipBodyFactoryHolder.field_b = false;
            GetUseLines.field_p.content.field_db = 0;
            GetReverbDamp.field_o = true;
            GetUseLines.field_p.content.y = GetUseLines.field_p.viewport.height - GetUseLines.field_p.content.height;
          }
          GetUseLines.field_p.content.field_E = -GetUseLines.field_p.content.height + var7Lifetime1;
          if (!SetFightersPerPlayerMaximum.chatInputActive) {
            var9Lifetime1 = -GetUseLines.field_p.content.field_E - GetUseLines.field_p.content.height + GetUseLines.field_p.viewport.height;
            if (GetReverbDamp.field_o) {
              GetUseLines.field_p.content.field_db = -GetUseLines.field_p.content.y + var9Lifetime1;
            }
            GetUseLines.field_p.updateScrolling(2 * param0 * param2, true, param0, 0);
            stackIn_46_0 = (var9Lifetime1 == GetUseLines.field_p.content.y + GetUseLines.field_p.content.field_db);
            GetReverbDamp.field_o = stackIn_46_0;
          } else {
            if (null == OneShotSound.field_l) {
              var9Lifetime1 = -GetUseLines.field_p.content.field_E - GetUseLines.field_p.content.height + GetUseLines.field_p.viewport.height;
              if (GetReverbDamp.field_o) {
                GetUseLines.field_p.content.field_db = -GetUseLines.field_p.content.y + var9Lifetime1;
              }
              GetUseLines.field_p.updateScrolling(2 * param0 * param2, true, param0, 0);
              stackIn_61_0 = (var9Lifetime1 == GetUseLines.field_p.content.y + GetUseLines.field_p.content.field_db);
              GetReverbDamp.field_o = stackIn_61_0;
            } else {
              GetReverbDamp.field_o = true;
              var9Lifetime1 = -GetUseLines.field_p.content.field_E - GetUseLines.field_p.content.height + GetUseLines.field_p.viewport.height;
              if (GetReverbDamp.field_o) {
                GetUseLines.field_p.content.field_db = -GetUseLines.field_p.content.y + var9Lifetime1;
              }
              GetUseLines.field_p.updateScrolling(2 * param0 * param2, true, param0, 0);
              stackIn_54_0 = (var9Lifetime1 == GetUseLines.field_p.content.y + GetUseLines.field_p.content.field_db);
              GetReverbDamp.field_o = stackIn_54_0;
            }
          }
        }
        return (ChatMessage) (var4);
    }

    static {
        field_o = 8;
        faceSortIndices = new int[16384];
    }
}
