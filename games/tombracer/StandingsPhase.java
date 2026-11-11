/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class StandingsPhase extends MatchPhase {
    private int[] field_r;
    static SpriteData[] field_o;
    private int field_n;
    static long[] field_m;
    static String field_s;
    private boolean field_q;
    private MenuEntry[] field_p;

    public static void releaseStatics(byte param0) {
        field_m = null;
        if (param0 <= 28) {
          field_m = (long[]) null;
        }
        field_o = null;
        field_s = null;
    }

    StandingsPhase(MatchScreen param0, MatchProtocol param1) {
        super(param0, param1);
        int var5 = 0;
        int stackIn_26_0 = 0;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        String stackIn_35_2 = null;
        StringBuilder stackIn_37_1 = null;
        String stackIn_38_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var3_intLifetime1;
        this.field_n = -1;
        try {
          this.field_r = new int[this.matchState.playerCount];
          for (var3_int = 0; this.matchState.playerCount > var3_int; var3_int++) {
            var4 = 0;
            for (var5 = 0; this.matchState.roundWins.length > var5; var5++) {
              if (~var5 != ~var3_int &&
                this.matchState.roundWins[var5] > this.matchState.roundWins[var3_int] &&
                !this.matchState.hasResigned((byte) -96, var5)) {
                var4++;
              }
            }
            if (this.matchState.hasResigned((byte) -117, var3_int)) {
              var4 = this.matchState.playerCount - 1;
            }
            if (this.matchState.declaredWinner == -2) {
              var4 = 0;
            }
            this.field_r[var3_int] = var4;
          }
          if (this.screen.isSpectating((byte) 116)) {
            TripBeamComponent.playMusicTrack(1, 0);
          } else {
            if (0 == this.field_r[this.screen.localPlayerIndex] &&
              this.matchState.declaredWinner >= 0) {
              TripBeamComponent.playMusicTrack(1, 2);
            } else {
              TripBeamComponent.playMusicTrack(1, 3);
            }
          }
          if (this.screen.field_D &&
            !this.screen.isSpectating((byte) 82)) {
            this.field_p = new MenuEntry[2];
            this.field_p[0] = new MenuEntry(33, OpenGlSceneLight.field_q[33], 1, false);
            this.field_p[0].field_b = aaa.a(false) - 110;
            this.field_p[0].field_i = SwitchLinkList.b(0) - 25;
            this.field_p[0].finishDropAnimation(false);
            this.field_p[1] = new MenuEntry(34, OpenGlSceneLight.field_q[34], 1, false);
            this.field_p[1].field_b = 100;
            this.field_p[1].field_i = SwitchLinkList.b(0) - 25;
            this.field_p[1].finishDropAnimation(false);
            return;
          }
          this.field_p = new MenuEntry[1];
          stackIn_26_0 = (this.screen.field_D) ? 33 : 16;
          var3_intLifetime1 = stackIn_26_0;
          this.field_p[0] = new MenuEntry(var3_intLifetime1, OpenGlSceneLight.field_q[var3_intLifetime1], 0, false);
          this.field_p[0].field_b = -100 + aaa.a(false);
          this.field_p[0].field_i = SwitchLinkList.b(0) - 25;
          this.field_p[0].finishDropAnimation(false);
          if (!this.screen.field_D &&
            !TextWidgetPainter.a(43)) {
            this.field_p[0].field_e = aua.field_d.toUpperCase();
            FacePlayerLocomotor.field_p = ConsoleWindow.a(3, this.screen.getCourseId(-1), 0, 10, 1);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_34_0 = var3;
          stackIn_34_1 = new StringBuilder().append("qka.<init>(");
          if (param0 == null) {
            stackIn_35_2 = "null";
          } else {
            stackIn_35_2 = "{...}";
          }
          stackIn_37_1 = ((StringBuilder) (Object) stackIn_34_1).append(stackIn_35_2).append(',');
          if (param1 == null) {
            stackIn_38_2 = "null";
          } else {
            stackIn_38_2 = "{...}";
          }
          throw tba.wrapException((Throwable) ((Object) stackIn_34_0), ((StringBuilder) (Object) stackIn_37_1).append(stackIn_38_2).append(')').toString());
        }
    }

    final boolean allowsChat(int param0) {
        if (param0 != -9202) {
          return false;
        }
        return false;
    }

    final boolean handleKey(char param0, int param1, int param2) {
        if (param2 == 13) {
          this.handleMenuChoice(127, 0);
        } else {
          if (param2 == 34) {
            this.handleMenuChoice(127, 0);
          } else {
            if (param2 == 83) {
              this.handleMenuChoice(127, 0);
            }
          }
        }
        if (param1 != 25) {
          return false;
        }
        return true;
    }

    final void draw(int param0, boolean param1) {
        int var19 = 0;
        int stackIn_4_0 = 0;
        MenuEntry stackIn_62_0;
        boolean stackIn_62_1;
        boolean stackIn_62_2;
        int stackIn_62_3;
        boolean stackIn_63_4;
        Throwable decompiledCaughtException = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        String var10_ref_String = null;
        int var11 = 0;
        int var12 = 0;
        Object var12_ref = null;
        Exception var13_ref_Exception = null;
        int var13 = 0;
        String var13_ref_String = null;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        Object var18 = null;
        String var20 = null;
        int var21 = 0;
        int var22 = 0;
        String var23 = null;
        String var24 = null;
        var21 = TombRacer.field_G ? 1 : 0;
        ura.a(-10985);
        Room.field_j.draw(0, 0);
        if (this.screen.field_D) {
          var3 = aaa.a(false) >> 1;
          var4 = (aaa.a(false) >> 1) / 3 + 37;
          var5 = 56;
          var6 = this.matchState.playerCount;
          var22 = 0;
          var7 = var22;
          while (var22 < var6) {
            var8 = this.field_r[var22];
            var9 = -var8 + var6;
            var10 = -(var5 * var9) + SwitchLinkList.b(0);
            var11 = var4 * var22 + (var3 - (var4 >> 1) * (-1 + var6));
            this.matchState.players[var22].getAnimator((byte) -120).drawPortrait(-1, var11, 800, 0, var10);
            IntrusiveDeque.field_c.draw(var11 - (IntrusiveDeque.field_c.width() >> 1) + 1, var10 - 8);
            if (var8 == 0) {
              GridWidgetContainer.field_y[-1 + GridWidgetContainer.field_y.length].draw(-(GridWidgetContainer.field_y[GridWidgetContainer.field_y.length - 1].width() >> 1) + var11 - 1, var10 - 12);
            }
            var12 = 150;
            RasterBuffer.a(-60 + var11, 2, tga.field_a, 4, var10 - 250, 120, 65793 | var12 << 24, 1, 100);
            MembersUpsellMenu.drawCentredTextWithShadow(this.screen.getPlayerName(var22, false).toUpperCase(), wga.field_a[var22], kn.field_p, -1, var10 - 230, var11, 0);
            try {
              tga.field_a.fillShadedTriangle(var11, var10 - 140, 10 + var11, -151 + var10, var11, var10 - 151, 65793 | var12 << 24, var12 << 24 | 65793, var12 << 24 | 65793, 1);
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var13_ref_Exception = (Exception) (Object) decompiledCaughtException;
            }
            if (!this.matchState.hasResigned((byte) -102, var22)) {
              var13 = 7829367;
              if (-2 != this.matchState.declaredWinner) {
                SocketConnector.drawWrappedText(LegacyOpenGlFlowingWaterEffect.formatText(93, WallCrusherComponent.field_K.toUpperCase(), new String[]{Integer.toString(this.matchState.roundWins[var22])}).toUpperCase(), 1, kn.field_p, var13, 16, 60, 1, var10 - 243, -50 + var11, 0, (byte) 60, 100);
              } else {
                SocketConnector.drawWrappedText(DateInputWidget.field_y.toUpperCase(), 1, kn.field_p, var13, 16, 70, 1, var10 - 243, -50 + var11, 0, (byte) 60, 100);
              }
              if (this.matchState.g(69, var22)) {
                SocketConnector.drawWrappedText(SoundEventPlayer.field_d.toUpperCase(), 1, kn.field_p, 3385907, 16, 40, 1, var10 - 203, -50 + var11, 0, (byte) 60, 100);
              }
            } else {
              MembersUpsellMenu.drawCentredTextWithShadow(id.field_i.toUpperCase(), 11141120, kn.field_p, -1, var10 - 190, var11, 0);
            }
            var22++;
          }
        } else {
          var3 = aaa.a(false) >> 1;
          var4 = SwitchLinkList.b(0) >> 1;
          gg.field_f.draw(-(gg.field_f.width() >> 1) + var3, -(gg.field_f.height() >> 1) + var4);
          var5 = 260;
          var6 = 40;
          var7 = var3;
          var8 = var4 - 80;
          PlayerInputQueue.field_a.draw(var7 - (PlayerInputQueue.field_a.width() >> 1), var8 - (PlayerInputQueue.field_a.height() >> 1));
          var9 = this.screen.getCourseId(-1);
          stackIn_4_0 = (pl.a((byte) 64) != var9) ? 0 : 1;
          var11 = stackIn_4_0;
          if (var11 != 0) {
            var10_ref_String = id.field_k.toUpperCase();
          } else {
            var10_ref_String = SecondaryLinkQueue.worldNames[var9].toUpperCase();
          }
          SocketConnector.drawWrappedText(var10_ref_String, 1, eda.field_f, 2431750, 8 + HeapIndexArray.field_d.field_m, var6, 1, -(var6 >> 1) + var8, var7 - (var5 >> 1), -1, (byte) 60, var5);
          MembersUpsellMenu.drawCentredTextWithShadow(this.screen.getPlayerName(this.screen.localPlayerIndex, false).toUpperCase(), wga.field_a[this.screen.localPlayerIndex], eda.field_f, -1, -15 + var4, var3, -1);
          if (this.matchState.declaredWinner < 0) {
            MembersUpsellMenu.drawCentredTextWithShadow(ArrowShooterComponent.field_K.toUpperCase(), 2431750, eda.field_f, -1, var4 - 40, var3, -1);
            MembersUpsellMenu.drawCentredTextWithShadow(SafeZoneBehaviour.field_n.toUpperCase(), 2431750, kn.field_p, -1, 45 + var4, var3, -1);
          } else {
            MembersUpsellMenu.drawCentredTextWithShadow(iaa.field_a.toUpperCase(), 2431750, eda.field_f, -1, -40 + var4, var3, -1);
            if (var9 == uca.field_a) {
              var12_ref = null;
              var13_ref_String = SpriteTileOperator.field_v;
              if (C2SActionPacket.field_j == 3) {
                var12_ref = za.field_g;
                var13_ref_String = uaa.field_d;
              }
              if (C2SActionPacket.field_j == 2) {
                var13_ref_String = qna.field_c;
                var12_ref = VariantMask.field_d;
              }
              if (C2SActionPacket.field_j == 1) {
                var13_ref_String = MovingPlatformComponent.field_P;
                var12_ref = rm.field_c;
              }
              if (var12_ref != null) {
                ((ToolkitSprite) (var12_ref)).draw(var3 - (120 + ((ToolkitSprite) (var12_ref)).paddedWidth() / 2), var4 - 10);
              }
              MembersUpsellMenu.drawCentredTextWithShadow(var13_ref_String, 65793, kn.field_p, -1, 35 + var4, var3 - 120, -1);
            }
          }
          if (var11 != 0) {
            var24 = DropAnimation.formatTime(this.matchState.getSimulationTick((byte) 115, this.screen.localPlayerIndex), (byte) -8);
            MembersUpsellMenu.drawCentredTextWithShadow(cc.field_l.toUpperCase() + " " + var24.toUpperCase(), 2431750, kn.field_p, -1, 20 + var4, -120 + var3, -1);
            MembersUpsellMenu.drawCentredTextWithShadow(ContentTransitionDialog.field_L.toUpperCase(), 2431750, eda.field_f, -1, var4, 120 + var3, -1);
            var13 = this.screen.matchState.simulations[this.screen.localPlayerIndex].player.getScore(74);
            MembersUpsellMenu.drawCentredTextWithShadow(Integer.toString(var13), 2431750, eda.field_f, -1, 20 + var4, 120 + var3, -1);
          } else {
            var23 = DropAnimation.formatTime(this.matchState.getSimulationTick((byte) 115, this.screen.localPlayerIndex), (byte) -8);
            MembersUpsellMenu.drawCentredTextWithShadow(cc.field_l.toUpperCase() + " " + var23.toUpperCase(), 2431750, kn.field_p, -1, 48 + var4, var3 - 120, -1);
            za.field_g.draw(-200 + var3, var4 + 60);
            var13 = LegacyOpenGlShoreWaveWaterEffect.sumRoomParTimes(var9, 0);
            RoomEffectTraps.a(-1, -36, var4 + 79, DropAnimation.formatTime(var13, (byte) -8), -200 + (var3 + za.field_g.paddedWidth()) + 5, kn.field_p, 2431750);
            VariantMask.field_d.draw(var3 - 110, 60 + var4);
            RoomEffectTraps.a(-1, -92, 79 + var4, DropAnimation.formatTime(var13 + var13 / 2, (byte) -8), VariantMask.field_d.paddedWidth() + (var3 - 110) + 5, kn.field_p, 2431750);
            MembersUpsellMenu.drawCentredTextWithShadow(ContentTransitionDialog.field_L.toUpperCase(), 2431750, eda.field_f, -1, 5 + var4, 120 + var3, -1);
            var14 = this.screen.matchState.simulations[this.screen.localPlayerIndex].player.getScore(110);
            MembersUpsellMenu.drawCentredTextWithShadow(Integer.toString(var14), 2431750, eda.field_f, -1, var4 + 22, var3 + 120, -1);
            if (FacePlayerLocomotor.field_p != null &&
              FacePlayerLocomotor.field_p.field_p != null &&
              FacePlayerLocomotor.field_p.field_h) {
              var15 = FacePlayerLocomotor.field_p.field_p[1][0];
              var16 = -var15 + var14;
              if (var15 != 0) {
                MembersUpsellMenu.drawCentredTextWithShadow(LegacyOpenGlFlowingWaterEffect.formatText(103, ItemComponent.field_F, new String[]{Integer.toString(var15).toUpperCase() + " " + ByteStorage.formatSignedOffset(var16, -1)}), 2431750, kn.field_p, -1, 50 + var4, 120 + var3, -1);
              }
              var17 = 0;
              var18 = null;
              for (var19 = 0; FacePlayerLocomotor.field_p.field_k[2].length > var19; var19++) {
                var20 = FacePlayerLocomotor.field_p.field_k[2][var19];
                if (MiscItemBehaviour.a(var20, 0)) {
                  continue;
                }
                var17 = FacePlayerLocomotor.field_p.field_p[2][var19];
                var18 = var20;
                break;
              }
              if (var18 != null) {
                var16 = var14 - var17;
                SocketConnector.drawWrappedText(LegacyOpenGlFlowingWaterEffect.formatText(121, PenaltyNotice.field_g, new String[]{Integer.toString(var17).toUpperCase() + " " + ByteStorage.formatSignedOffset(var16, -1), (String) (var18)}), 0, kn.field_p, 2431750, 13, 50, 1, var4 + 60, var3, -1, (byte) 60, 240);
              }
            }
          }
        }
        RemovedFromGameMenu.resetDepthRange((byte) -6);
        for (var3 = 0; var3 < this.field_p.length; var3++) {
          stackIn_62_0 = this.field_p[var3];
          stackIn_62_1 = false;
          stackIn_62_2 = true;
          stackIn_62_3 = 1;
          stackIn_63_4 = (this.field_n == var3);
          ((MenuEntry) (Object) stackIn_62_0).draw(stackIn_62_1, stackIn_62_2, stackIn_62_3, stackIn_63_4);
        }
        if (param0 >= -50) {
          field_m = (long[]) null;
        }
    }

    private final void handleMenuChoice(int param0, int param1) {
        int var4;
        var4 = TombRacer.field_G ? 1 : 0;
        if (param1 == -1) {
          return;
        }
        if (param0 <= 114) {
          this.draw(-124, false);
        }
        if (param1 == 0) {
          this.screen.endMatch(false, true, 0);
          if (this.screen.field_D) {
            r.a(0, this.screen.isSpectating((byte) 120));
          } else {
            C2SActionPacket.field_j = -1;
          }
        } else {
          if (param1 == 1) {
            ql.field_k.writeCipheredOpcode(67, -2988);
          }
        }
    }

    final void update(int param0, boolean param1) {
        PlayerModel stackIn_5_0 = null;
        int stackIn_5_1 = 0;
        int stackIn_6_2 = 0;
        int stackIn_24_0 = 0;
        MenuEntry stackIn_29_0 = null;
        boolean stackIn_29_1 = false;
        boolean stackIn_30_2 = false;
        int var3;
        int var4;
        PlayerModel var4_ref_hf;
        int var5;
        int var3Lifetime1;
        int var3Lifetime2;
        var5 = TombRacer.field_G ? 1 : 0;
        for (var3 = 0; var3 < this.matchState.players.length; var3++) {
          var4_ref_hf = (PlayerModel) (this.matchState.players[var3].getAnimator((byte) -67));
          if (!this.field_q) {
            stackIn_5_0 = var4_ref_hf;
            stackIn_5_1 = 26;
            if (var3 != this.matchState.declaredWinner) {
              stackIn_6_2 = 0;
            } else {
              stackIn_6_2 = 23;
            }
            ((PlayerModel) (Object) stackIn_5_0).setAnimationState(stackIn_5_1, stackIn_6_2, false);
          }
          var4_ref_hf.tick(21463);
          var4_ref_hf.updateAnimation(-4366);
        }
        this.field_n = -1;
        this.field_q = true;
        if (param0 != 80) {
          this.draw(12, true);
        }
        for (var3Lifetime1 = 0; this.field_p.length > var3Lifetime1; var3Lifetime1++) {
          if (param1) {
            if (this.field_p[var3Lifetime1].field_b - 80 <= AgeValidator.field_j) {
              if (AgeValidator.field_j < 80 + this.field_p[var3Lifetime1].field_b) {
                if (-25 + this.field_p[var3Lifetime1].field_i <= GridWidgetContainer.field_B) {
                  stackIn_24_0 = (this.field_p[var3Lifetime1].field_i + 25 > GridWidgetContainer.field_B) ? 1 : 0;
                } else {
                  stackIn_24_0 = 0;
                }
              } else {
                stackIn_24_0 = 0;
              }
            } else {
              stackIn_24_0 = 0;
            }
          } else {
            stackIn_24_0 = 0;
          }
          var4 = stackIn_24_0;
          if (var4 != 0) {
            this.field_n = var3Lifetime1;
          }
          stackIn_29_0 = this.field_p[var3Lifetime1];
          stackIn_29_1 = true;
          stackIn_30_2 = (this.field_n == var3Lifetime1);
          ((MenuEntry) (Object) stackIn_29_0).update(stackIn_29_1, stackIn_30_2, true, 6);
          if (param1 &&
            var4 != 0 &&
            0 != PlayerModel.field_b) {
            this.handleMenuChoice(120, var3Lifetime1);
          }
        }
        if (this.screen.field_D &&
          !this.screen.isSpectating((byte) 69)) {
          var3Lifetime2 = this.screen.matchState.field_t;
          if ((var3Lifetime2 >> this.screen.localPlayerIndex & 1) == 1) {
            this.field_p[1].field_e = RevolverItemComponent.field_I.toUpperCase();
          } else {
            if (var3Lifetime2 != 0) {
              this.field_p[1].field_e = HardwareRidgedWaterNoise.field_t.toUpperCase();
            } else {
              if (this.screen.matchState.haveAllOthersResigned(this.screen.localPlayerIndex, true)) {
                this.field_p[1].field_e = HardwareReflectionEffect.field_g.toUpperCase();
              } else {
                this.field_p[1].field_e = PrefabComponent.field_E.toUpperCase();
              }
            }
          }
        }
    }

    static {
        field_s = "Solo Adventure";
    }
}
