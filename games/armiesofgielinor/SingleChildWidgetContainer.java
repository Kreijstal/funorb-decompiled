/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

abstract class SingleChildWidgetContainer extends Widget implements WidgetContainerMarker {
    static String field_D;
    Widget child;
    static String field_F;
    static String field_G;
    static String field_C;

    void layoutChild(boolean obfuscationGuard) {
        if (null != this.child) {
          this.child.refreshLayout(0);
        }
        if (!obfuscationGuard) {
          Widget var3 = (Widget) null;
          this.pointerPressed(-121, -73, 76, 99, (Widget) null, -116, -36);
        }
    }

    final boolean handleWheel(int pointerX, int originX, int originY, int pointerY, int wheelDelta, int obfuscationGuard, Widget rootWidget) {
        RuntimeException var8 = null;
        boolean stackIn_7_0 = false;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (obfuscationGuard < 93) {
            this.drawWidget(87, -41, (byte) 121, -47);
          }
          stackIn_7_0 = (null != this.child) && (this.child.isFocused(false)) && (this.child.handleWheel(pointerX, originX, originY, pointerY, wheelDelta, 96, rootWidget));
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_10_0 = var8;
          stackIn_10_1 = new StringBuilder().append("nl.RA(").append(pointerX).append(',').append(originX).append(',').append(originY).append(',').append(pointerY).append(',').append(wheelDelta).append(',').append(obfuscationGuard).append(',');
          if (rootWidget == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }

    void updatePointer(int obfuscationGuard, int originX, int originY, Widget rootWidget) {
        Widget var6 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        try {
          super.updatePointer(obfuscationGuard + 0, originX, originY, rootWidget);
          if (obfuscationGuard != 32722) {
            var6 = (Widget) null;
            this.pointerReleased(-74, (Widget) null, -57, (byte) -35, 30, 107);
          }
          if (this.child != null) {
            this.child.updatePointer(32722, this.x + originX, originY + this.y, rootWidget);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_7_0 = var5;
          stackIn_7_1 = new StringBuilder().append("nl.P(").append(obfuscationGuard).append(',').append(originX).append(',').append(originY).append(',');
          if (rootWidget == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(')').toString());
        }
    }

    void pointerReleased(int originY, Widget rootWidget, int pointerX, byte obfuscationGuard, int pointerY, int originX) {
        int var7_int = 0;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var7 = null;
        try {
          var7_int = -82 % ((obfuscationGuard + 58) / 53);
          if (this.child != null) {
            this.child.pointerReleased(originY + this.y, rootWidget, pointerX, (byte) 109, pointerY, this.x + originX);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_5_0 = var7;
          stackIn_5_1 = new StringBuilder().append("nl.JA(").append(originY).append(',');
          if (rootWidget == null) {
            stackIn_6_2 = "null";
          } else {
            stackIn_6_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_5_0), ((StringBuilder) (Object) stackIn_5_1).append(stackIn_6_2).append(',').append(pointerX).append(',').append(obfuscationGuard).append(',').append(pointerY).append(',').append(originX).append(')').toString());
        }
    }

    final void blur(int obfuscationGuard) {
        if (null != this.child) {
          this.child.blur(1);
        }
        if (obfuscationGuard != 1) {
          iw var3 = (iw) null;
          SingleChildWidgetContainer.a(-28, -106, (iw) null);
        }
    }

    StringBuilder a(int param0, StringBuilder param1, int param2, Hashtable param3) {
        RuntimeException var5 = null;
        ResourceArchive var6 = null;
        StringBuilder stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this.a(param3, param0, (byte) 39, param1)) {
            this.a(param0, param3, true, param1);
            this.a(param3, param0, 106, param1);
          }
          if (param2 != 26477) {
            var6 = (ResourceArchive) null;
            SingleChildWidgetContainer.a((ResourceArchive) null, (AnimationSequence[][]) null, (ResourceArchive) null, (byte) -118);
          }
          stackIn_6_0 = (StringBuilder) (param1);
          return stackIn_6_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_9_0 = var5;
          stackIn_9_1 = new StringBuilder().append("nl.OA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(')').toString());
        }
    }

    final void a(Hashtable param0, int param1, int param2, StringBuilder param3) {
        StringBuilder discarded$11 = null;
        int var6 = 0;
        StringBuilder discarded$13 = null;
        StringBuilder discarded$12 = null;
        int var5_int = 0;
        int var7 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        var7 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          discarded$11 = param3.append('\n');
          var5_int = -96 / ((param2 - 43) / 54);
          for (var6 = 0; var6 <= param1; var6++) {
            discarded$13 = param3.append(' ');
          }
          if (null != this.child) {
            this.child.a(param1 + 1, param3, 26477, param0);
          } else {
            discarded$12 = param3.append("null");
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_10_0 = var5;
          stackIn_10_1 = new StringBuilder().append("nl.HA(");
          if (param0 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          stackIn_13_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(')').toString());
        }
    }

    final int getMaximumRenderLayer(int obfuscationGuard) {
        if (obfuscationGuard != -31989) {
          Widget var3 = (Widget) null;
          this.updatePointer(87, 114, -83, (Widget) null);
        }
        return this.child != null ? this.child.getMaximumRenderLayer(-31989) : 0;
    }

    SingleChildWidgetContainer(int x, int y, int width, int height, WidgetPainter painter, WidgetListener listener) {
        super(x, y, width, height, painter, listener);
    }

    boolean pointerPressed(int pointerX, int originX, int originY, int obfuscationGuard, Widget rootWidget, int pointerY, int button) {
        RuntimeException var8 = null;
        boolean stackIn_6_0 = false;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (obfuscationGuard <= 103) {
            field_C = (String) null;
          }
          stackIn_6_0 = (null != this.child) && (this.child.pointerPressed(pointerX, originX + this.x, originY + this.y, 125, rootWidget, pointerY, button));
          return stackIn_6_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_9_0 = var8;
          stackIn_9_1 = new StringBuilder().append("nl.NA(").append(pointerX).append(',').append(originX).append(',').append(originY).append(',').append(obfuscationGuard).append(',');
          if (rootWidget == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(pointerY).append(',').append(button).append(')').toString());
        }
    }

    final static void a(byte[] param0, int param1, int param2, String[] param3, String[][] param4, byte[] param5, String[][] param6, ResourceArchive param7, RgbSprite[][] param8, RgbSprite[][] param9, String[] param10, int[] param11, String[] param12, boolean param13, int param14) {
        IconTextComponent[] array$0 = null;
        IconTextComponent[] array$1 = null;
        IconTextComponent[] array$2 = null;
        int var19 = 0;
        ClientUiComponent stackIn_5_0;
        ClientUiComponent stackIn_5_1;
        long stackIn_5_2;
        ClientUiComponent stackIn_5_3;
        ClientUiComponent stackIn_6_0 = null;
        ClientUiComponent stackIn_6_1 = null;
        String stackIn_6_4 = null;
        RuntimeException stackIn_76_0 = null;
        StringBuilder stackIn_76_1 = null;
        String stackIn_77_2 = null;
        StringBuilder stackIn_79_1 = null;
        String stackIn_80_2 = null;
        StringBuilder stackIn_82_1 = null;
        String stackIn_83_2 = null;
        StringBuilder stackIn_85_1 = null;
        String stackIn_86_2 = null;
        StringBuilder stackIn_88_1 = null;
        String stackIn_89_2 = null;
        StringBuilder stackIn_91_1 = null;
        String stackIn_92_2 = null;
        StringBuilder stackIn_94_1 = null;
        String stackIn_95_2 = null;
        StringBuilder stackIn_97_1 = null;
        String stackIn_98_2 = null;
        StringBuilder stackIn_100_1 = null;
        String stackIn_101_2 = null;
        StringBuilder stackIn_103_1 = null;
        String stackIn_104_2 = null;
        StringBuilder stackIn_106_1 = null;
        String stackIn_107_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var15 = null;
        ClientUiComponent var16 = null;
        int var17_int = 0;
        ClientUiComponent var17 = null;
        int var18 = 0;
        Object var19_ref = null;
        Object var20 = null;
        int var21 = 0;
        iw var22 = null;
        ClientUiComponent var24 = null;
        ClientUiComponent var25 = null;
        int var18Lifetime1;
        int var18Lifetime2;
        int var17_intLifetime1;
        int var17_intLifetime2;
        int var17_intLifetime3;
        int var17_intLifetime4;
        var21 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          DeployEvent.field_F = param5;
          lm.field_e = param11;
          GridWidgetContainer.field_M = param10;
          VerticalScrollbar.field_Mb = param6;
          wb.field_a = param4;
          DirectByteStorage.field_j = param3;
          gt.field_f = param12;
          BoundedFile.field_h = param14;
          MusicPatchNode.field_r = param0;
          jn.field_b = param8;
          TextLayout.field_a = param9;
          TextCursor.field_d = param2;
          rs.field_p = fk.loadRgbSpritesByName("gameprivacy", (byte) -128, param7, "lobby");
          ResourceProtocolClient.field_d = fk.loadRgbSpritesByName("ratedgame", (byte) -125, param7, "lobby");
          ChatMessage.field_g = fk.loadRgbSpritesByName("opentome", (byte) -124, param7, "lobby");
          lm.field_h = fk.loadRgbSpritesByName("allowspectators", (byte) -125, param7, "lobby");
          ResourceRequest.field_u = new String[5];
          ResourceRequest.field_u[1] = pc.field_i;
          ResourceRequest.field_u[3] = ek.field_f;
          ResourceRequest.field_u[2] = AccountRegistrationForm.field_L;
          ResourceRequest.field_u[0] = AttackEvent.field_D;
          ResourceRequest.field_u[4] = MusicPatch.field_p;
          IconTextComponent.field_Kb = new ClientUiComponent(0L, (ClientUiComponent) null);
          StripedProgressWidget.field_F = new ClientUiComponent(0L, SoundPlaybackHandle.field_p, su.field_b);
          CampaignProgress.field_a = new ClientUiComponent(0L, br.field_e, PcmPlayerService.ratingLabel);
          MapTile.field_f = new ScrollContainer(0L, new ClientUiComponent(0L, (ClientUiComponent) null), ConsoleEvaluationException.field_c, WeightedLruCache.field_b);
          IconTextComponent.field_Kb.addChild(StripedProgressWidget.field_F, 79);
          if (fh.field_c) {
            IconTextComponent.field_Kb.addChild(CampaignProgress.field_a, 69);
          }
          IconTextComponent.field_Kb.addChild(MapTile.field_f, 59);
          MapTile.field_f.viewport.applyStyle(0, eq.field_h);
          MapTile.field_f.viewport.verticalAlignment = 1;
          var24 = MapTile.field_f.viewport;
          var25 = var24;
          var25.horizontalAlignment = 1;
          t.field_g = new ClientUiComponent(0L, eq.field_h);
          t.field_g.horizontalAlignment = 1;
          cp.field_d = new ClientUiComponent(0L, AccountRegistrationForm.field_M, eq.field_e.toUpperCase());
          ClientContextMenu.field_n = new ClientUiComponent(0L, SummonAction.field_y, nr.field_d.toUpperCase());
          LobbyPlayer.field_Lb = new ClientUiComponent(0L, UnitAnimationPreview.field_m);
          SpriteDropdownControl.field_v = new ClientUiComponent(0L, SoundPlaybackHandle.field_p, IntrusiveNode.field_a);
          ek.field_c = new ClientUiComponent(0L, CampaignResult.field_a, wb.field_c);
          CombatViewTransition.field_p = new ClientUiComponent(0L, CampaignResult.field_a, fk.field_g);
          bs.field_a = new ClientUiComponent(0L, CampaignResult.field_a, InteractiveWidget.field_H);
          SphinxActionRequest.field_A = new ClientUiComponent(0L, CampaignResult.field_a, ArrayWidgetContainer.field_D);
          ModalDialog.field_K = new ClientUiComponent(0L, br.field_e, RevivalEvent.field_B);
          CipherPacketBuffer.field_x = new ScrollContainer(0L, new ClientUiComponent(0L, (ClientUiComponent) null), ConsoleEvaluationException.field_c, WeightedLruCache.field_b);
          ViewportManager.field_d = new ClientUiComponent(0L, ConsoleValue.field_a, l.field_f.toUpperCase());
          ViewportManager.field_d.inputEnabled = fh.field_c;
          stackIn_5_0 = null;
          stackIn_5_1 = null;
          stackIn_5_2 = 0L;
          stackIn_5_3 = ConsoleValue.field_a;
          if (!fh.field_c) {
            stackIn_6_0 = null;
            stackIn_6_1 = null;
            stackIn_6_4 = NetworkResourceRequest.field_G;
          } else {
            stackIn_6_0 = null;
            stackIn_6_1 = null;
            stackIn_6_4 = CampaignMenuEntry.field_C;
          }
          VineGrowthAction.field_x = new ClientUiComponent(stackIn_5_2, stackIn_5_3, ((String) (Object) stackIn_6_4).toUpperCase());
          ov.field_i = new ClientUiComponent(0L, (ClientUiComponent) null);
          ov.field_i.addChild(ClientContextMenu.field_n, 92);
          ov.field_i.addChild(LobbyPlayer.field_Lb, 47);
          LobbyPlayer.field_Lb.addChild(SpriteDropdownControl.field_v, 38);
          LobbyPlayer.field_Lb.addChild(ek.field_c, 114);
          LobbyPlayer.field_Lb.addChild(CombatViewTransition.field_p, 121);
          if (fh.field_c) {
            LobbyPlayer.field_Lb.addChild(bs.field_a, 114);
          }
          LobbyPlayer.field_Lb.addChild(SphinxActionRequest.field_A, 78);
          LobbyPlayer.field_Lb.addChild(ModalDialog.field_K, 99);
          LobbyPlayer.field_Lb.addChild(CipherPacketBuffer.field_x, 70);
          if (fh.field_c) {
            ov.field_i.addChild(ViewportManager.field_d, 127);
          }
          ov.field_i.addChild(VineGrowthAction.field_x, 93);
          ToggleWidget.field_Q = new ClientUiComponent(0L, eq.field_h);
          ToggleWidget.field_Q.horizontalAlignment = 1;
          ToggleWidget.field_Q.verticalAlignment = 0;
          LinkButtonPainter.field_g = new ClientUiComponent(0L, WhirlpoolHasher.field_h, LineOfSightGrid.field_f.toUpperCase());
          GameClock.field_c = new ClientUiComponent(0L, ArchiveIndex.field_b);
          GameClock.field_c.addChild(ToggleWidget.field_Q, 116);
          GameClock.field_c.addChild(LinkButtonPainter.field_g, 89);
          AccountNameAvailabilityValidator.field_l = new ClientUiComponent(0L, ConsoleEvaluationException.field_c);
          AccountNameAvailabilityValidator.field_l.applyStyle(0, eq.field_h);
          AccountNameAvailabilityValidator.field_l.verticalAlignment = 1;
          var16 = AccountNameAvailabilityValidator.field_l;
          var16.horizontalAlignment = 1;
          eb.field_c = new ClientUiComponent(0L, (ClientUiComponent) null);
          PrintVictoryConditionsConsoleCommand.field_E = new ClientUiComponent(0L, eq.field_h);
          PrintVictoryConditionsConsoleCommand.field_E.horizontalAlignment = 1;
          MatchingTextValidator.field_l = new ClientUiComponent(0L, SoundPlaybackHandle.field_p, su.field_b);
          SpellCastEvent.field_D = new ClientUiComponent(0L, br.field_e, PcmPlayerService.ratingLabel);
          bu.field_a = new ScrollContainer(0L, new ClientUiComponent(0L, (ClientUiComponent) null), ConsoleEvaluationException.field_c, WeightedLruCache.field_b);
          eb.field_c.addChild(PrintVictoryConditionsConsoleCommand.field_E, 72);
          eb.field_c.addChild(MatchingTextValidator.field_l, 83);
          if (fh.field_c) {
            eb.field_c.addChild(SpellCastEvent.field_D, 107);
          }
          eb.field_c.addChild(bu.field_a, 109);
          SocialListPanel.field_Lb = new ClientUiComponent(0L, AccountRegistrationForm.field_M, DeployAction.field_v.toUpperCase());
          AccountRegistrationForm.field_F = new ClientUiComponent(0L, SummonAction.field_y);
          MusicPatchUsage.gameOptionsGrid = new ClientUiComponent(0L, UnitAnimationPreview.field_m);
          BattleTutorial.field_d = new ClientUiComponent(0L, rn.field_a, EffectPresentation.field_d.toUpperCase());
          KingBlackDragonEvent.field_z = new ClientUiComponent[param1 + 4];
          pu.field_k = new IconTextComponent[4 + param1][];
          KingBlackDragonEvent.field_z[0] = new ClientUiComponent(0L, IconLabelControl.field_Lb, et.field_c);
          pu.field_k[0] = new IconTextComponent[6];
          for (var17_int = 0; var17_int < 5; var17_int++) {
            pu.field_k[0][var17_int + 1] = new IconTextComponent(0L, eb.field_a, (ClientUiComponent) null, DualLinkedNode.field_k, rs.field_p[var17_int], ResourceRequest.field_u[var17_int]);
          }
          if (lm.field_e.length >= 2) {
            KingBlackDragonEvent.field_z[1] = new ClientUiComponent(0L, IconLabelControl.field_Lb, ep.field_h);
            array$0 = new IconTextComponent[1 + lm.field_e.length];
            pu.field_k[1] = array$0;
            pu.field_k[1][0] = new IconTextComponent(0L, eb.field_a, (ClientUiComponent) null, DualLinkedNode.field_k, (RgbSprite) null, ki.field_a);
            for (var17_intLifetime1 = 0; lm.field_e.length > var17_intLifetime1; var17_intLifetime1++) {
              pu.field_k[1][var17_intLifetime1 + 1] = new IconTextComponent(0L, eb.field_a, (ClientUiComponent) null, DualLinkedNode.field_k, (RgbSprite) null, Integer.toString(lm.field_e[var17_intLifetime1]));
            }
          }
          KingBlackDragonEvent.field_z[2] = new ClientUiComponent(0L, IconLabelControl.field_Lb, GameEvent.field_p);
          pu.field_k[2] = new IconTextComponent[]{new IconTextComponent(0L, eb.field_a, (ClientUiComponent) null, DualLinkedNode.field_k, (RgbSprite) null, ki.field_a), new IconTextComponent(0L, eb.field_a, (ClientUiComponent) null, DualLinkedNode.field_k, lm.field_h[0], LeaderEscortCondition.field_e), new IconTextComponent(0L, eb.field_a, (ClientUiComponent) null, DualLinkedNode.field_k, lm.field_h[1], po.field_b)};
          if (BoundedFile.field_h > 1) {
            KingBlackDragonEvent.field_z[3] = new ClientUiComponent(0L, IconLabelControl.field_Lb, AnimationFrameSet.field_u);
            array$1 = new IconTextComponent[1 + BoundedFile.field_h];
            pu.field_k[3] = array$1;
            pu.field_k[3][0] = new IconTextComponent(0L, eb.field_a, (ClientUiComponent) null, DualLinkedNode.field_k, (RgbSprite) null, ki.field_a);
            for (var17_intLifetime2 = 0; var17_intLifetime2 < BoundedFile.field_h; var17_intLifetime2++) {
              pu.field_k[3][1 + var17_intLifetime2] = new IconTextComponent(0L, eb.field_a, (ClientUiComponent) null, DualLinkedNode.field_k, (RgbSprite) null, gt.field_f[var17_intLifetime2]);
            }
          }
          for (var17_intLifetime3 = 0; param1 > var17_intLifetime3; var17_intLifetime3++) {
            KingBlackDragonEvent.field_z[var17_intLifetime3 + 4] = new ClientUiComponent(0L, IconLabelControl.field_Lb, GridWidgetContainer.field_M[var17_intLifetime3]);
            array$2 = new IconTextComponent[rn.bitwiseAnd(255, (int) MusicPatchNode.field_r[var17_intLifetime3]) + 1];
            pu.field_k[var17_intLifetime3 + 4] = array$2;
            pu.field_k[var17_intLifetime3 + 4][0] = new IconTextComponent(0L, eb.field_a, (ClientUiComponent) null, DualLinkedNode.field_k, (RgbSprite) null, ki.field_a);
            for (var18 = 0; var18 < (MusicPatchNode.field_r[var17_intLifetime3] & 255); var18++) {
              if (jn.field_b == null) {
                var19_ref = null;
              } else {
                if (jn.field_b[var17_intLifetime3] != null) {
                  var19_ref = jn.field_b[var17_intLifetime3][var18];
                } else {
                  var19_ref = null;
                }
              }
              if (VerticalScrollbar.field_Mb != null) {
                if (VerticalScrollbar.field_Mb[var17_intLifetime3] != null) {
                  var20 = VerticalScrollbar.field_Mb[var17_intLifetime3][var18];
                } else {
                  var20 = null;
                }
              } else {
                var20 = null;
              }
              pu.field_k[var17_intLifetime3 + 4][1 + var18] = new IconTextComponent(0L, eb.field_a, (ClientUiComponent) null, DualLinkedNode.field_k, (RgbSprite) (var19_ref), (String) (var20));
            }
          }
          for (var17_intLifetime4 = 0; param1 + 4 > var17_intLifetime4; var17_intLifetime4++) {
            if (null != KingBlackDragonEvent.field_z[var17_intLifetime4]) {
              KingBlackDragonEvent.field_z[var17_intLifetime4].textLineSpacing = 11;
            }
            if (pu.field_k[var17_intLifetime4] != null) {
              for (var18Lifetime1 = 0; pu.field_k[var17_intLifetime4].length > var18Lifetime1; var18Lifetime1++) {
                if (pu.field_k[var17_intLifetime4][var18Lifetime1] != null &&
                  null != pu.field_k[var17_intLifetime4][var18Lifetime1].textComponent) {
                  pu.field_k[var17_intLifetime4][var18Lifetime1].textComponent.textLineSpacing = 11;
                }
              }
            }
          }
          lm.field_b = new ClientUiComponent(0L, ConsoleValue.field_a);
          so.field_d = new ClientUiComponent(0L, ConsoleValue.field_a);
          pi.field_N = new ClientUiComponent(0L, ke.field_e);
          pi.field_N.applyStyle(0, eq.field_h);
          var17 = pi.field_N;
          pi.field_N.verticalAlignment = 1;
          if (param13) {
            var22 = (iw) null;
            SingleChildWidgetContainer.a(-73, 39, (iw) null);
          }
          var17.horizontalAlignment = 1;
          pd.field_c = new ClientUiComponent(0L, (ClientUiComponent) null);
          pd.field_c.addChild(AccountRegistrationForm.field_F, 44);
          pd.field_c.addChild(MusicPatchUsage.gameOptionsGrid, 68);
          MusicPatchUsage.gameOptionsGrid.addChild(BattleTutorial.field_d, 106);
          for (var18Lifetime2 = 0; var18Lifetime2 < param1 + 4; var18Lifetime2++) {
            if ((var18Lifetime2 != 1 ||
              !(2 > lm.field_e.length)) && (var18Lifetime2 != 3 ||
              !(BoundedFile.field_h <= 1))) {
              MusicPatchUsage.gameOptionsGrid.addChild(KingBlackDragonEvent.field_z[var18Lifetime2], 86);
              for (var19 = 0; var19 < pu.field_k[var18Lifetime2].length; var19++) {
                if (pu.field_k[var18Lifetime2][var19] != null) {
                  MusicPatchUsage.gameOptionsGrid.addChild(pu.field_k[var18Lifetime2][var19], 48);
                }
              }
            }
          }
          pd.field_c.addChild(lm.field_b, 77);
          pd.field_c.addChild(so.field_d, 69);
          pd.field_c.addChild(pi.field_N, 91);
          bk.field_f = new ClientUiComponent(0L, UnitModelPreview.field_m, TickCounter.field_d.toUpperCase());
          ConsolePanel.field_m = new ClientUiComponent(0L, WhirlpoolHasher.field_h, ConsoleCommand.field_D.toUpperCase());
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var15 = decompiledCaughtException;
          stackIn_76_0 = var15;
          stackIn_76_1 = new StringBuilder().append("nl.FA(");
          if (param0 == null) {
            stackIn_77_2 = "null";
          } else {
            stackIn_77_2 = "{...}";
          }
          stackIn_79_1 = ((StringBuilder) (Object) stackIn_76_1).append(stackIn_77_2).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_80_2 = "null";
          } else {
            stackIn_80_2 = "{...}";
          }
          stackIn_82_1 = ((StringBuilder) (Object) stackIn_79_1).append(stackIn_80_2).append(',');
          if (param4 == null) {
            stackIn_83_2 = "null";
          } else {
            stackIn_83_2 = "{...}";
          }
          stackIn_85_1 = ((StringBuilder) (Object) stackIn_82_1).append(stackIn_83_2).append(',');
          if (param5 == null) {
            stackIn_86_2 = "null";
          } else {
            stackIn_86_2 = "{...}";
          }
          stackIn_88_1 = ((StringBuilder) (Object) stackIn_85_1).append(stackIn_86_2).append(',');
          if (param6 == null) {
            stackIn_89_2 = "null";
          } else {
            stackIn_89_2 = "{...}";
          }
          stackIn_91_1 = ((StringBuilder) (Object) stackIn_88_1).append(stackIn_89_2).append(',');
          if (param7 == null) {
            stackIn_92_2 = "null";
          } else {
            stackIn_92_2 = "{...}";
          }
          stackIn_94_1 = ((StringBuilder) (Object) stackIn_91_1).append(stackIn_92_2).append(',');
          if (param8 == null) {
            stackIn_95_2 = "null";
          } else {
            stackIn_95_2 = "{...}";
          }
          stackIn_97_1 = ((StringBuilder) (Object) stackIn_94_1).append(stackIn_95_2).append(',');
          if (param9 == null) {
            stackIn_98_2 = "null";
          } else {
            stackIn_98_2 = "{...}";
          }
          stackIn_100_1 = ((StringBuilder) (Object) stackIn_97_1).append(stackIn_98_2).append(',');
          if (param10 == null) {
            stackIn_101_2 = "null";
          } else {
            stackIn_101_2 = "{...}";
          }
          stackIn_103_1 = ((StringBuilder) (Object) stackIn_100_1).append(stackIn_101_2).append(',');
          if (param11 == null) {
            stackIn_104_2 = "null";
          } else {
            stackIn_104_2 = "{...}";
          }
          stackIn_106_1 = ((StringBuilder) (Object) stackIn_103_1).append(stackIn_104_2).append(',');
          if (param12 == null) {
            stackIn_107_2 = "null";
          } else {
            stackIn_107_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_76_0), ((StringBuilder) (Object) stackIn_106_1).append(stackIn_107_2).append(',').append(param13).append(',').append(param14).append(')').toString());
        }
    }

    Widget getFocusedChild(int obfuscationGuard) {
        Widget var2 = this.child;
        if (var2 != null &&
          var2.isFocused(false)) {
          return var2;
        }
        if (obfuscationGuard == -1848) {
          return null;
        }
        Widget var3 = (Widget) null;
        this.handleWheel(-40, -59, -4, 58, 32, -127, (Widget) null);
        return null;
    }

    void drawWidget(int originX, int originY, byte obfuscationGuard, int renderLayer) {
        if (renderLayer == 0 &&
          this.painter != null) {
          this.painter.paintWidget((Widget) (this), originX, -94, true, originY);
        }
        if (obfuscationGuard > -82) {
          return;
        }
        if (this.child != null) {
          this.child.drawWidget(this.x + originX, this.y + originY, (byte) -118, renderLayer);
        }
    }

    final boolean isFocused(boolean obfuscationGuard) {
        if (obfuscationGuard) {
          field_D = (String) null;
        }
        return this.getFocusedChild(-1848) != null ? true : false;
    }

    String getTooltipText(int obfuscationGuard) {
        String var3 = null;
        if (obfuscationGuard != 21384) {
          return (String) null;
        }
        String var2 = super.getTooltipText(obfuscationGuard + 0);
        if (this.child != null) {
          var3 = this.child.getTooltipText(21384);
          if (var3 != null) {
            return var3;
          }
        }
        return var2;
    }

    public static void i(int param0) {
        field_C = null;
        if (param0 > -81) {
          field_F = (String) null;
        }
        field_D = null;
        field_G = null;
        field_F = null;
    }

    private final boolean focusPreviousChild(int obfuscationGuard, Widget rootWidget) {
        RuntimeException var3 = null;
        boolean stackIn_8_0 = false;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (obfuscationGuard != 4) {
            return true;
          }
          stackIn_8_0 = (null != this.child) && (!this.child.isFocused(false)) && (this.child.takeFocus(11, rootWidget));
          return stackIn_8_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_11_0 = var3;
          stackIn_11_1 = new StringBuilder().append("nl.IA(").append(obfuscationGuard).append(',');
          if (rootWidget == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(')').toString());
        }
    }

    final boolean handleKey(Widget rootWidget, int keyCode, char character, int obfuscationGuard) {
        int var5_int = 0;
        RuntimeException var5 = null;
        String[] var6 = null;
        boolean stackIn_12_0 = false;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (obfuscationGuard != -12215) {
            var6 = (String[]) null;
            SingleChildWidgetContainer.a((byte[]) null, 101, 110, (String[]) null, (String[][]) null, (byte[]) null, (String[][]) null, (ResourceArchive) null, (RgbSprite[][]) null, (RgbSprite[][]) null, (String[]) null, (int[]) null, (String[]) null, true, 39);
          }
          if (this.child != null &&
            this.child.isFocused(false) &&
            this.child.handleKey(rootWidget, keyCode, character, -12215)) {
            return true;
          }
          var5_int = keyCode;
          if (80 != var5_int) {
            return false;
          }
          if (!br.heldKeys[81]) {
            stackIn_12_0 = this.focusNextChild(rootWidget, (byte) 107);
          } else {
            stackIn_12_0 = this.focusPreviousChild(4, rootWidget);
          }
          return stackIn_12_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_15_0 = var5;
          stackIn_15_1 = new StringBuilder().append("nl.F(");
          if (rootWidget == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(keyCode).append(',').append(character).append(',').append(obfuscationGuard).append(')').toString());
        }
    }

    final static void a(int param0, int param1, iw param2) {
        try {
          if (param0 != 0) {
            iw var4 = (iw) null;
            SingleChildWidgetContainer.a(30, -59, (iw) null);
          }
          cg.field_c.addLast((byte) -119, (IntrusiveNode) (param2));
          FixInvisibleUnitsConsoleCommand.a((byte) 112, param1, param2);
        } catch (RuntimeException runtimeException) {
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) runtimeException), "nl.MA(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final void setBounds(int x, int width, int y, int obfuscationGuard, int height) {
        super.setBounds(x, width, y, obfuscationGuard, height);
        this.layoutChild(true);
    }

    final static void a(ResourceArchive param0, AnimationSequence[][] param1, ResourceArchive param2, byte param3) {
        int var5 = 0;
        int var7 = 0;
        int var11 = 0;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_27_2 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_30_2 = null;
        StringBuilder stackIn_32_1 = null;
        String stackIn_33_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var6 = 0;
        AnimationSequence var8 = null;
        int[] var9 = null;
        int var10 = 0;
        int var12 = 0;
        int var13 = 0;
        fd var14 = null;
        int var15 = 0;
        int[] var16 = null;
        int[] var17 = null;
        var15 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          if (param1 == null) {
            return;
          }
          var4_int = param1.length;
          for (var5 = 0; var4_int > var5; var5++) {
            if (param1[var5] != null) {
              var6 = param1[var5].length;
              for (var7 = 0; var6 > var7; var7++) {
                var8 = param1[var5][var7];
                if (var8 != null) {
                  var17 = var8.frameIds;
                  var16 = var17;
                  var9 = var16;
                  if (var9 != null) {
                    var10 = var17.length;
                    for (var11 = 0; var11 < var10; var11++) {
                      var12 = var17[var11] >> 16;
                      var13 = WeightedScoreStrategy.a(0, var12) ? 1 : 0;
                      if (var13 == 0) {
                        var14 = new fd(param2, param0, var12);
                        if (null == bk.field_e) {
                          bk.field_e = new NodeDeque();
                        }
                        bk.field_e.addLast((byte) -119, (IntrusiveNode) (var14));
                      }
                    }
                  }
                }
              }
            }
          }
          if (param3 < 124) {
            field_D = (String) null;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_26_0 = var4;
          stackIn_26_1 = new StringBuilder().append("nl.KA(");
          if (param0 == null) {
            stackIn_27_2 = "null";
          } else {
            stackIn_27_2 = "{...}";
          }
          stackIn_29_1 = ((StringBuilder) (Object) stackIn_26_1).append(stackIn_27_2).append(',');
          if (param1 == null) {
            stackIn_30_2 = "null";
          } else {
            stackIn_30_2 = "{...}";
          }
          stackIn_32_1 = ((StringBuilder) (Object) stackIn_29_1).append(stackIn_30_2).append(',');
          if (param2 == null) {
            stackIn_33_2 = "null";
          } else {
            stackIn_33_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_26_0), ((StringBuilder) (Object) stackIn_32_1).append(stackIn_33_2).append(',').append(param3).append(')').toString());
        }
    }

    final boolean takeFocus(int obfuscationGuard, Widget rootWidget) {
        RuntimeException var3 = null;
        boolean stackIn_6_0 = false;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (obfuscationGuard != 11) {
            field_C = (String) null;
          }
          stackIn_6_0 = (null != this.child) && (this.child.takeFocus(obfuscationGuard + 0, rootWidget));
          return stackIn_6_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_9_0 = var3;
          stackIn_9_1 = new StringBuilder().append("nl.M(").append(obfuscationGuard).append(',');
          if (rootWidget == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(')').toString());
        }
    }

    private final boolean focusNextChild(Widget rootWidget, byte obfuscationGuard) {
        RuntimeException var3 = null;
        boolean stackIn_8_0 = false;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (obfuscationGuard != 107) {
            return false;
          }
          stackIn_8_0 = (null != this.child) && (!this.child.isFocused(false)) && (this.child.takeFocus(11, rootWidget));
          return stackIn_8_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_11_0 = var3;
          stackIn_11_1 = new StringBuilder().append("nl.GA(");
          if (rootWidget == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(obfuscationGuard).append(')').toString());
        }
    }

    static {
        field_G = "Battle";
        field_D = "Fire";
        field_F = "Hotseat Game";
        field_C = "Location";
    }
}
