/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bk {
    static ClientUiComponent field_f;
    static String field_g;
    static String field_b;
    static DualNodeHashTable ignoredAccountsByName;
    static String field_c;
    static NodeDeque field_e;
    static IndexedSprite[] attackTargetSprites;
    static String field_h;

    final static void a(boolean param0, boolean param1, af param2, int param3, int param4) {
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_29_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        String var7 = null;
        try {
          CombatEvent.field_L[0] = CampaignMenuButton.connectionRandom.nextInt();
          CombatEvent.field_L[1] = CampaignMenuButton.connectionRandom.nextInt();
          vd.field_b.position = 0;
          CombatEvent.field_L[3] = (int)TextLineLayout.field_h;
          CombatEvent.field_L[2] = (int)(TextLineLayout.field_h >> 32);
          vd.field_b.writeInt((byte) -69, CombatEvent.field_L[0]);
          vd.field_b.writeInt((byte) -69, CombatEvent.field_L[1]);
          vd.field_b.writeInt((byte) -125, CombatEvent.field_L[2]);
          vd.field_b.writeInt((byte) -89, CombatEvent.field_L[3]);
          PaletteRegionMap.a(vd.field_b, (byte) -84);
          vd.field_b.writeShort(true, param4);
          param2.a(vd.field_b, -11436);
          EmailValidator.outgoingPacket.position = 0;
          if (!param1) {
            EmailValidator.outgoingPacket.writeByte(1, 16);
          }
          if (param1 ||
            ArmiesOfGielinor.obfuscationControl) {
            EmailValidator.outgoingPacket.writeByte(1, 18);
          }
          EmailValidator.outgoingPacket.position = EmailValidator.outgoingPacket.position + 2;
          var5_int = EmailValidator.outgoingPacket.position;
          EmailValidator.outgoingPacket.writeInt((byte) -67, fl.field_e);
          EmailValidator.outgoingPacket.writeLong(DefeatPlayerConsoleCommand.field_E, 38359632);
          var6 = 0;
          if (BestScoreStrategy.field_l) {
            var6 = var6 | 1;
          }
          if (LineOfSightGrid.field_a) {
            var6 = var6 | 4;
          }
          if (param0) {
            var6 = var6 | 8;
          }
          if (DropdownSelector.field_P != null) {
            var6 = var6 | 16;
          }
          EmailValidator.outgoingPacket.writeByte(1, var6);
          var7 = ByteStorage.a(0, CombatEvent.d((byte) -116));
          if (var7 == null) {
            var7 = "";
          }
          EmailValidator.outgoingPacket.writeNullTerminatedString(var7, param3 + 13851);
          if (DropdownSelector.field_P != null) {
            EmailValidator.outgoingPacket.a(DropdownSelector.field_P, 413740432);
          }
          IconLabelControl.a(mu.field_c, FullscreenConfirmationDialog.field_cb, (byte) 26, vd.field_b, EmailValidator.outgoingPacket);
          EmailValidator.outgoingPacket.f(param3 ^ param3, EmailValidator.outgoingPacket.position - var5_int);
          hb.$cfr$intArgs$a$e9dea5688aa5(29, -1);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_28_0 = var5;
          stackIn_28_1 = new StringBuilder().append("bk.C(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_29_2 = "null";
          } else {
            stackIn_29_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_28_0), ((StringBuilder) (Object) stackIn_28_1).append(stackIn_29_2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    final static void a(boolean param0, ClientUiComponent param1, ClientUiComponent param2, BitmapFont param3, ClientUiComponent param4, int param5, ClientUiComponent param6, ClientUiComponent param7, ClientUiComponent param8, VerticalScrollbar param9, ClientUiComponent param10, ClientUiComponent param11) {
        String stackIn_13_0 = null;
        int stackIn_28_0 = 0;
        RuntimeException stackIn_38_0 = null;
        StringBuilder stackIn_38_1 = null;
        String stackIn_39_2 = null;
        StringBuilder stackIn_42_1 = null;
        String stackIn_43_2 = null;
        StringBuilder stackIn_46_1 = null;
        String stackIn_47_2 = null;
        StringBuilder stackIn_50_1 = null;
        String stackIn_51_2 = null;
        StringBuilder stackIn_54_1 = null;
        String stackIn_55_2 = null;
        StringBuilder stackIn_58_1 = null;
        String stackIn_59_2 = null;
        StringBuilder stackIn_62_1 = null;
        String stackIn_63_2 = null;
        StringBuilder stackIn_66_1 = null;
        String stackIn_67_2 = null;
        StringBuilder stackIn_70_1 = null;
        String stackIn_71_2 = null;
        StringBuilder stackIn_74_1 = null;
        String stackIn_75_2 = null;
        RuntimeException decompiledCaughtException = null;
        RgbSprite var12 = null;
        RuntimeException var12_ref = null;
        int[] var13 = null;
        int[] var14 = null;
        int[] var15 = null;
        RgbSprite[] var16 = null;
        int var17 = 0;
        ClientUiComponent var18 = null;
        int var19 = 0;
        String var20 = null;
        int var21 = 0;
        var21 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          CombatEvent.field_A[4] = 16711935;
          CombatEvent.field_A[0] = 16764000;
          IntrusiveNode.field_e = param3;
          CombatEvent.field_A[3] = 16736511;
          CombatEvent.field_A[1] = 6356832;
          bq.field_c = param0;
          SpellConfirmationDialog.field_i = param4;
          CombatEvent.field_A[2] = 9474303;
          fm.field_d[0] = 16764000;
          MeshObject.field_d = 8421504;
          fm.field_d[1] = 6356832;
          fm.field_d[3] = 16736511;
          CombatEvent.field_A[4] = 16711935;
          fm.field_d[2] = 16736352;
          var12 = new RgbSprite(4, 4);
          var13 = var12.pixels;
          var14 = var12.pixels;
          var15 = var12.pixels;
          var12.pixels[15] = 7368816;
          var14[5] = 7368816;
          var13[2] = 7368816;
          var15[8] = 7368816;
          var16 = new RgbSprite[9];
          var16[4] = var12;
          var17 = 106 / ((param5 + 53) / 51);
          CombatEvent.field_I = new ClientUiComponent(0L, param7);
          SocialListPanel.field_Qb = new ClientUiComponent(0L, param8);
          CombatEvent.field_I.addChild(SocialListPanel.field_Qb, 55);
          var18 = new ClientUiComponent(0L, (ClientUiComponent) null);
          var18.children = new NodeDeque();
          vq.field_a = new ScrollContainer(0L, var18, param1, param9);
          SocialListPanel.field_Qb.addChild(vq.field_a, 126);
          we.field_f = new ClientUiComponent(0L, param6);
          SocialListPanel.field_Qb.addChild(we.field_f, 110);
          UpkeepEvent.field_z = new ClientUiComponent(0L, param2);
          UpkeepEvent.field_z.font = IntrusiveNode.field_e;
          we.field_f.addChild(UpkeepEvent.field_z, 82);
          we.field_f.inheritVisualStateForDescendants(-10027);
          DebouncedValidator.field_b = new ClientUiComponent(0L, (ClientUiComponent) null);
          DebouncedValidator.field_b.skinSprites = var16;
          we.field_f.addChild(DebouncedValidator.field_b, 99);
          jj.field_i = new ClientUiComponent[5];
          ResourceProtocolClient.field_j = new ClientUiComponent[5];
          we.field_g = new ClientUiComponent[5];
          gt.field_b = new ClientUiComponent[5];
          var19 = 0;
          boolean decompiledNaturalLoopExit0 = false;
          while (!(decompiledNaturalLoopExit0 = (var19 >= 5))) {
            stackIn_28_0 = var19;
            if (var21 == 0) {
              boolean decompiledFrameRemainder0 = true;
              if (stackIn_28_0 == 0) {
                if (bq.field_c) {
                  stackIn_13_0 = ClientConnectionState.field_c;
                } else {
                  stackIn_13_0 = NetworkGameShell.field_u;
                }
                var20 = stackIn_13_0;
              } else if (var19 == 1 &&
                bq.field_c) {
                var20 = GridWidgetContainer.field_O;
              } else {
                decompiledFrameRemainder0 = (var19 == 2);
                if (decompiledFrameRemainder0) {
                  var20 = tq.field_d;
                }
              }
              if (decompiledFrameRemainder0) {
                gt.field_b[var19] = new ClientUiComponent(0L, param10);
                jj.field_i[var19] = new ClientUiComponent(0L, SpellConfirmationDialog.field_i, var20);
                we.field_g[var19] = new ClientUiComponent(0L, (ClientUiComponent) null);
                we.field_g[var19].verticalAlignment = 1;
                ResourceProtocolClient.field_j[var19] = new ClientUiComponent(0L, SpellConfirmationDialog.field_i);
                ResourceProtocolClient.field_j[var19].verticalAlignment = 1;
                gt.field_b[var19].addChild(jj.field_i[var19], 107);
                gt.field_b[var19].addChild(we.field_g[var19], 45);
                gt.field_b[var19].addChild(ResourceProtocolClient.field_j[var19], 85);
                gt.field_b[var19].inheritVisualStateForDescendants(-10027);
                CombatEvent.field_I.addChild(gt.field_b[var19], 121);
                se.field_d = se.field_d + 1;
              }
              var19++;
              continue;
            }
            break;
          }
          if (decompiledNaturalLoopExit0) {
            UnitLossCondition.field_f = new ClientUiComponent(0L, param11);
            UnitLossCondition.field_f.text = CampaignMenu.field_n;
            CombatEvent.field_I.addChild(UnitLossCondition.field_f, 42);
            stackIn_28_0 = TeamRoster.a(4) ? 1 : 0;
          }
          if (stackIn_28_0 != 0 &&
            !NodeIterator.field_a) {
            return;
          }
          BestScoreStrategy.field_i = new BirthDateChatEnableForm(0, 0, 0, 0);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var12_ref = decompiledCaughtException;
          stackIn_38_0 = var12_ref;
          stackIn_38_1 = new StringBuilder().append("bk.D(").append(param0).append(',');
          if (param1 == null) {
            stackIn_39_2 = "null";
          } else {
            stackIn_39_2 = "{...}";
          }
          stackIn_42_1 = ((StringBuilder) (Object) stackIn_38_1).append(stackIn_39_2).append(',');
          if (param2 == null) {
            stackIn_43_2 = "null";
          } else {
            stackIn_43_2 = "{...}";
          }
          stackIn_46_1 = ((StringBuilder) (Object) stackIn_42_1).append(stackIn_43_2).append(',');
          if (param3 == null) {
            stackIn_47_2 = "null";
          } else {
            stackIn_47_2 = "{...}";
          }
          stackIn_50_1 = ((StringBuilder) (Object) stackIn_46_1).append(stackIn_47_2).append(',');
          if (param4 == null) {
            stackIn_51_2 = "null";
          } else {
            stackIn_51_2 = "{...}";
          }
          stackIn_54_1 = ((StringBuilder) (Object) stackIn_50_1).append(stackIn_51_2).append(',').append(param5).append(',');
          if (param6 == null) {
            stackIn_55_2 = "null";
          } else {
            stackIn_55_2 = "{...}";
          }
          stackIn_58_1 = ((StringBuilder) (Object) stackIn_54_1).append(stackIn_55_2).append(',');
          if (param7 == null) {
            stackIn_59_2 = "null";
          } else {
            stackIn_59_2 = "{...}";
          }
          stackIn_62_1 = ((StringBuilder) (Object) stackIn_58_1).append(stackIn_59_2).append(',');
          if (param8 == null) {
            stackIn_63_2 = "null";
          } else {
            stackIn_63_2 = "{...}";
          }
          stackIn_66_1 = ((StringBuilder) (Object) stackIn_62_1).append(stackIn_63_2).append(',');
          if (param9 == null) {
            stackIn_67_2 = "null";
          } else {
            stackIn_67_2 = "{...}";
          }
          stackIn_70_1 = ((StringBuilder) (Object) stackIn_66_1).append(stackIn_67_2).append(',');
          if (param10 == null) {
            stackIn_71_2 = "null";
          } else {
            stackIn_71_2 = "{...}";
          }
          stackIn_74_1 = ((StringBuilder) (Object) stackIn_70_1).append(stackIn_71_2).append(',');
          if (param11 == null) {
            stackIn_75_2 = "null";
          } else {
            stackIn_75_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_38_0), ((StringBuilder) (Object) stackIn_74_1).append(stackIn_75_2).append(')').toString());
        }
    }

    final static void selectMusicTrack(int channelGain, int fadeRate, MusicTrack track, int obfuscationGuard, boolean loop) {
        MusicCrossfadeStream crossfadeStream = null;
        int gainToApply = 0;
        boolean returnAfterTrack = false;
        RuntimeException failureForContext = null;
        StringBuilder errorContext = null;
        String trackDescription = null;
        RuntimeException caughtFailure = null;
        RuntimeException failure = null;
        try {
          crossfadeStream = BitmapTextWidgetPainter.musicCrossfadeStream;
          gainToApply = channelGain;
          returnAfterTrack = !(loop);
          ((MusicCrossfadeStream) (Object) crossfadeStream).selectTrack(gainToApply, returnAfterTrack, track, obfuscationGuard - 20608, fadeRate, 1000000);
          if (obfuscationGuard != 20607) {
            bk.selectMusicTrack(117, -8, (MusicTrack) null, 124, false);
          }
          return;
        } catch (java.lang.RuntimeException caughtParameter) {
          caughtFailure = caughtParameter;
          failure = caughtFailure;
          failureForContext = failure;
          errorContext = new StringBuilder().append("bk.B(").append(channelGain).append(',').append(fadeRate).append(',');
          if (track == null) {
            trackDescription = "null";
          } else {
            trackDescription = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) failureForContext), ((StringBuilder) (Object) errorContext).append(trackDescription).append(',').append(obfuscationGuard).append(',').append(loop).append(')').toString());
        }
    }

    public static void a(boolean param0) {
        ignoredAccountsByName = null;
        field_e = null;
        field_b = null;
        field_h = null;
        field_c = null;
        if (!param0) {
          return;
        }
        try {
          attackTargetSprites = null;
          field_g = null;
          field_f = null;
        } catch (RuntimeException runtimeException) {
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) runtimeException), "bk.E(" + param0 + ')');
        }
    }

    final static void a(boolean param0, int param1, int param2, int param3, LobbyPlayer param4, ScrollContainer param5, int param6) {
        ClientContextMenu var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var7_ref = null;
        try {
          SpriteDropdownMenu.openClientContextMenu(param5, param4, (int[]) null, param4.displayName, -1, 111, -1, param4.accountName, param4.accountId);
          FullscreenMembershipDialog.activeContextMenu.addPlayerAdmissionActions(23899, true);
          FullscreenMembershipDialog.activeContextMenu.addSocialActions((int[]) null, 7, 0);
          FullscreenMembershipDialog.activeContextMenu.addReportAction((byte) 44);
          if (param0) {
            bk.a(true, (ClientUiComponent) null, (ClientUiComponent) null, (BitmapFont) null, (ClientUiComponent) null, 86, (ClientUiComponent) null, (ClientUiComponent) null, (ClientUiComponent) null, (VerticalScrollbar) null, (ClientUiComponent) null, (ClientUiComponent) null);
          }
          var7 = FullscreenMembershipDialog.activeContextMenu;
          var8 = param2;
          var9 = param6;
          var10 = param3;
          var11 = param1;
          var7.menu.layoutPopup(var11, var9, var10, (byte) -118, var8);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7_ref = decompiledCaughtException;
          stackIn_8_0 = var7_ref;
          stackIn_8_1 = new StringBuilder().append("bk.A(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          stackIn_12_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',');
          if (param5 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param6).append(')').toString());
        }
    }

    static {
        field_g = "<%0> would need a rating of <%1> to play with the current options.";
        field_b = "Unit Selection";
        field_c = "Capture all enemy portals and defeat their barbarians to win this battle.";
        field_h = "<%0> has offered a draw";
    }
}
