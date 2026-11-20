/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class SetFighterVision extends ConsoleCommand {
    final static void initializeChatInputDialog(Widget param0, int param1, Widget param2, Widget param3, Widget param4) {
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_24_2 = null;
        RuntimeException decompiledCaughtException = null;
        String var5 = null;
        RuntimeException var5_ref = null;
        int var6 = 0;
        String var7 = null;
        var6 = VoidHunters.field_G;
        try {
          if (PendingRequest.savedChatInputWidget != null) {
            return;
          }
          SetFightersPerPlayerMaximum.chatInputActive = false;
          if (GetBloomThresholdPercentage.field_p) {
            var5 = PasswordValidator.field_g;
          } else {
            if (ConsoleSettingsScript.quickChatOnly) {
              var5 = GameInterfaceText.quickChatShortcutText;
            } else {
              var5 = IconTextWidget.field_xb;
            }
          }
          var7 = (String) null;
          SetSelfDestructTimer.a(19204, var5, 0, (String) null, CarouselConstantRequests.field_a);
          ServerTick.field_d = WidgetNode.field_l;
          UiComboBoxRenderer.field_c.field_ib = (8355711 & TargetLock.field_b.field_ib >> 1) + (-((16711423 & CarouselConstantRequests.field_a) >> 1) + CarouselConstantRequests.field_a);
          UiComboBoxRenderer.field_c.field_qb = CarouselConstantRequests.field_a - (((16711422 & CarouselConstantRequests.field_a) >> 1) - ((TargetLock.field_b.field_qb & 16711423) >> 1));
          UiComboBoxRenderer.field_c.field_U = -(CarouselConstantRequests.field_a >> 1 & 8355711) + CarouselConstantRequests.field_a + ((TargetLock.field_b.field_U & 16711423) >> 1);
          if (param1 != -20149) {
            return;
          }
          PendingRequest.savedChatInputWidget = UiComboBoxRenderer.field_c;
          OneShotSound.field_l = new Widget(0L, param3);
          StringBuilderOutputStream.field_b = new Widget(0L, param2);
          TiledSpriteTextureOperation.field_s = new Widget(0L, (Widget) null);
          SetThrusterAutobalancing.field_p = new Widget(0L, param0);
          UiComboBoxRenderer.field_c = new Widget(0L, param4);
          UiComboBoxRenderer.field_c.font = DebrisFactory.field_c;
          SetThrusterAutobalancing.field_p.addChild(-561, UiComboBoxRenderer.field_c);
          WidgetNode.field_l = new Widget(0L, ServerTick.field_d);
          SetThrusterAutobalancing.field_p.addChild(-561, WidgetNode.field_l);
          GetMachineGunAimarc.field_q = new Widget(0L, TargetLock.field_b, GetMissionTerrainVotingChancestep.field_o);
          PartitionZoneFactoryHolder.field_a = new Widget(0L, TargetLock.field_b);
          OneShotSound.field_l.addChild(-561, StringBuilderOutputStream.field_b);
          OneShotSound.field_l.addChild(-561, TiledSpriteTextureOperation.field_s);
          TiledSpriteTextureOperation.field_s.addChild(-561, SetThrusterAutobalancing.field_p);
          TiledSpriteTextureOperation.field_s.addChild(param1 + 19588, GetMachineGunAimarc.field_q);
          TiledSpriteTextureOperation.field_s.addChild(-561, PartitionZoneFactoryHolder.field_a);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5_ref = decompiledCaughtException;
          stackIn_14_0 = var5_ref;
          stackIn_14_1 = new StringBuilder().append("dc.B(");
          if (param0 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          stackIn_17_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          stackIn_20_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',');
          if (param3 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          stackIn_23_1 = ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(',');
          if (param4 == null) {
            stackIn_24_2 = "null";
          } else {
            stackIn_24_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.wrapClientException((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_23_1).append(stackIn_24_2).append(')').toString());
        }
    }

    SetFighterVision(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    final ConsoleValue execute(ConsoleValue[] arguments, int obfuscationGuard) {
        RuntimeException var3 = null;
        ConsoleValue stackIn_2_0 = null;
        ConsoleValue stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (obfuscationGuard >= -119) {
            stackIn_2_0 = (ConsoleValue) null;
            return stackIn_2_0;
          }
          SetMachineGunEnergyUsed.a(2, 62, arguments[0].intValue(103));
          stackIn_4_0 = new ConsoleValue("void");
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_7_0 = var3;
          stackIn_7_1 = new StringBuilder().append("dc.A(");
          if (arguments == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.wrapClientException((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(obfuscationGuard).append(')').toString());
        }
    }

    static {
    }
}
