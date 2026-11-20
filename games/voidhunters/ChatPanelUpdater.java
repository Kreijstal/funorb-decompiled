/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ChatPanelUpdater {
    static String removeFromIgnoreListFirstText;

    final static void updateChatPanel(boolean param0, int param1, int param2, int param3) {
        int var4_int = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        Widget var5 = null;
        int var6 = 0;
        int var7 = 0;
        String var8 = null;
        ChatMessage var9 = null;
        int var6Lifetime1;
        var7 = VoidHunters.field_G;
        try {
          if (GetAngularForceDownshift.field_p != SetClientSideDragging.field_q.height) {
            GetPhasedEnergyBeamProjectiles.field_o = GetPhasedEnergyBeamProjectiles.field_o + (SetClientSideDragging.field_q.height - GetAngularForceDownshift.field_p);
            GetAngularForceDownshift.field_p = SetClientSideDragging.field_q.height;
          }
          if (SocialPanelState.chatPanelProgress < GetRepairModePower.field_o) {
            SocialPanelState.chatPanelProgress = SocialPanelState.chatPanelProgress + 1;
          }
          if (SocialPanelState.chatPanelProgress <= 0) {
            return;
          }
          SoftwareFaceAttachmentState.updateAnimatedPanelLayout((byte) 71);
          SetToggledScoreboard.field_o.updateInput(param0, 1332);
          if (PartitionZoneListFactory.field_b != null) {
            if (GetBloomThresholdPercentage.field_p) {
              PartitionZoneListFactory.field_b.processPointerInput((byte) -5, SetToggledScoreboard.field_o.screenX, SetToggledScoreboard.field_o.screenY, param0);
            } else {
              PartitionZoneListFactory.field_b = null;
            }
          }
          for (var4_int = 0; 5 > var4_int; var4_int++) {
            var5 = BeveledSpriteTileFactory.field_b[var4_int];
            if (var5 != null) {
              if (var5.field_o != 0) {
                SetShieldsDirectionalArcParticleSpeedDownshift.showChatFilterMenu(101, var5, var4_int);
              }
              var6 = SetReverbDry.getChatFilter(var4_int, (byte) 19);
              SecondaryNodeDeque.field_c[var4_int].field_tb = GetGrapplingHookAimspeed.field_o[var6];
              NebulaFieldFactory.field_c[var4_int].text = SetMissileLauncherProjectiles.field_o[var6];
            }
          }
          if (SetBombletSprayAimarc.field_o.field_o != 0) {
            Asteroid.activeReportDialog = new ReportAbuseDialog(SetBombletSprayAimarc.field_o.screenX, SetBombletSprayAimarc.field_o.screenY, SetBombletSprayAimarc.field_o.width, SetBombletSprayAimarc.field_o.height, param2, DualLinkNode.field_g, WorldSpriteTiler.field_b, GetFighterBayReload.field_p, DeveloperConsole.field_q, SetShieldsDirectionalArcParticleLife.field_o, GetMissionDebrisDefaultProbability.field_o, (String) null, 0L);
          }
          var9 = SetMissionDebrisDefaultProbability.b(DialogMessagePanel.field_w, AppletCookieWriter.field_c, param1, -123);
          if (var9 != null) {
            GetSniperCannonProjectiles.showChatMessageContextMenu(var9, 22859);
          }
          var8 = GetThrusterBindingBalanceThreshold.a(-8037);
          var6Lifetime1 = 101 / ((param3 + 32) / 58);
          if (var8 != null) {
            NebulaFieldFactory.field_a = var8;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw GetMissileLauncherRandomness.wrapClientException((Throwable) ((Object) var4), "mn.C(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    public static void clearSharedReferences(int param0) {
        int var1 = 19 / ((29 - param0) / 59);
        removeFromIgnoreListFirstText = null;
    }

    final static boolean isValidNormalizablePlayerName(CharSequence param0, byte param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        var3 = VoidHunters.field_G;
        try {
          if (!GpuQuadBuffers.isValidPlayerNameSyntax((byte) -31, param0, true)) {
            return false;
          }
          if (param1 > -107) {
            removeFromIgnoreListFirstText = (String) null;
          }
          for (var2_int = 0; var2_int < param0.length(); var2_int++) {
            if (!GetAngularVelocitySustainMax.isNormalizableNameCharacter((byte) -108, param0.charAt(var2_int))) {
              return false;
            }
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_18_0 = var2;
          stackIn_18_1 = new StringBuilder().append("mn.A(");
          if (param0 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.wrapClientException((Throwable) ((Object) stackIn_18_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',').append(param1).append(')').toString());
        }
    }

    static {
        removeFromIgnoreListFirstText = "Please remove <%0> from your ignore list first.";
    }
}
