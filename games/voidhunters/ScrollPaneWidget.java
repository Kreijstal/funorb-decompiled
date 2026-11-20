/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ScrollPaneWidget extends Widget {
    Widget viewport;
    Widget content;
    ScrollBarWidget scrollbar;

    final static int[][] a(int param0, int param1, int param2, int param3, boolean param4, int param5, int param6, int param7, float param8) {
        int var11 = 0;
        int var12 = VoidHunters.field_G;
        int[][] var15 = new int[param5][param7];
        int[][] var14 = var15;
        int[][] var13 = var14;
        int[][] var9 = var13;
        PerlinNoiseTextureOperation var10 = new PerlinNoiseTextureOperation();
        var10.biasUnsigned = param4 ? true : false;
        var10.persistence = (int)(param8 * 4096.0f);
        var10.verticalFrequency = param2;
        if (param6 != -1) {
          return (int[][]) null;
        }
        var10.horizontalFrequency = param0;
        var10.octaveCount = param3;
        var10.postDecode((byte) -105);
        SetPhasedEnergyBeamProjectiles.setTextureDimensions(param5, param7, -108);
        for (var11 = 0; var11 < param5; var11++) {
          var10.generateNoiseRow(1, var11, var15[var11]);
        }
        return var9;
    }

    private final void layoutViewportAndScrollbar(int param0, int param1, int param2) {
        this.viewport.height = this.height;
        this.content.x = 0;
        this.viewport.width = -param0 + (this.width - param2);
        this.content.width = -param2 + this.width - param0;
        if (param1 <= 84) {
          ScrollPaneWidget.a(92, -71, 109, -69, true, 40, 47, 70, -1.1040540933609009f);
        }
        this.scrollbar.setBoundsAndGeometry(-param0 + this.width, this.content.height, 0, -this.content.y, this.viewport.height, this.height, param0, -1);
    }

    final boolean layoutAndUpdateScrolling(byte param0, int param1, int param2, boolean param3, boolean param4, int param5) {
        if (param0 != 38) {
          this.scrollbar = (ScrollBarWidget) null;
        }
        return this.layoutAndUpdateScrolling(param3, param4, this.viewport.height, param2, param1, param5, -120);
    }

    final static void a(boolean param0, int param1, boolean param2, int param3) {
        int stackIn_11_0 = 0;
        String stackIn_25_0 = null;
        Widget stackIn_36_0 = null;
        String stackIn_37_1 = null;
        Widget stackIn_39_0 = null;
        String stackIn_40_1 = null;
        Widget stackIn_71_0 = null;
        boolean stackIn_72_1 = false;
        Widget stackIn_76_0 = null;
        boolean stackIn_77_1 = false;
        Widget stackIn_83_0 = null;
        boolean stackIn_84_1 = false;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        Widget var5 = null;
        Widget var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9_int = 0;
        Object var9 = null;
        int var10 = 0;
        int var11_int = 0;
        Object var11 = null;
        String var11_ref = null;
        int var12 = 0;
        int var13 = 0;
        Widget var15 = null;
        String var16 = null;
        Widget var17 = null;
        Object var11Lifetime1;
        int var9_intLifetime1;
        int var10Lifetime1;
        var12 = VoidHunters.field_G;
        try {
          EmailValidationError.layoutSlidingLobbyPanels(CarouselPlayerEventFactory.field_a, (byte) -101);
          if (null != SetThrusterParticleSpeedDownshift.field_o) {
            var15 = LobbyInviteControls.inviteButton;
            var17 = var15;
            LobbyInviteControls.inviteButton.height = 0;
            var17.width = 0;
            var5 = ObjectiveMarker.field_b;
            ObjectiveMarker.field_b.height = 0;
            var5.width = 0;
            SetAutozoomSpeedDivide.field_p.height = 0;
            var6 = SetAutozoomSpeedDivide.field_p;
            var6.width = 0;
            GetWeaponParticleSpeedDownshift.field_q.text = GetTorpedoAimspeed.field_p.toUpperCase();
            var7 = (2 + ThreeSliceButtonStyle.field_r.width) / 2;
            SetAutozoomSpeedDivide.field_p.setBounds(0, 6, var7 - 2, ThreeSliceButtonStyle.field_r.height - 40, 40);
            ObjectiveMarker.field_b.setBounds(var7, -120, ThreeSliceButtonStyle.field_r.width - var7, -40 + ThreeSliceButtonStyle.field_r.height, 40);
            if (SetMutatorVotes.field_o.length == 1 &&
              SetMutatorVotes.field_o[0] == 2) {
              var8 = 0;
            } else {
              var8 = 0;
              var9_int = 0;
              var10 = 0;
              while (true) {
                if (SetMutatorVotes.field_o.length > var10) {
                  stackIn_11_0 = ((GetPlayerRepairTime.field_o[var10 / 8] & 1 << (var10 & 7)) == 0) ? 0 : 1;
                  var11_int = stackIn_11_0;
                  if (var11_int != 0) {
                    var9_int++;
                  }
                  if (var11_int != 0 &&
                    SetMutatorVotes.field_o[var10] != 2) {
                    var8 = 1;
                  } else {
                    var10++;
                    continue;
                  }
                }
                if (0 != var9_int) {
                  break;
                }
                var8 = 1;
                break;
              }
            }
            ObjectiveMarker.field_b.enabled = true;
            if (!ArchiveTextureProvider.field_h) {
              stackIn_36_0 = ObjectiveMarker.field_b;
              if (var8 != 0) {
                stackIn_37_1 = SetAudioRangeCutoff.field_p;
              } else {
                stackIn_37_1 = FullscreenExit.field_a;
              }
              stackIn_36_0.text = ((String) (Object) stackIn_37_1).toUpperCase();
              stackIn_39_0 = GetTorpedoProjectileDamage.field_p;
              if (var8 != 0) {
                stackIn_40_1 = Cp1252Strings.field_b;
              } else {
                stackIn_40_1 = LobbyGameContextMenuBuilder.field_a;
              }
              stackIn_39_0.text = SetReverbGain.a(stackIn_40_1, new String[]{ObjectiveMarker.field_b.text}, 76);
              TickClock.field_b = true;
              GetShipToShipRamDamage.field_q.enabled = true;
              SetAutozoomSpeedDivide.field_p.text = UiComboBox.field_D;
              if (LobbyOptionCompatibilityRules.optionCombinations != null) {
                if (null == UsernameAvailabilityValidator.field_i) {
                  AudioPump.field_a = new boolean[PasswordValidator.field_l];
                  UsernameAvailabilityValidator.field_i = new byte[PasswordValidator.field_l];
                }
                GetMissionVotes.field_p = false;
                TickClock.field_b = false;
                var13 = 0;
                var9_intLifetime1 = var13;
                while (PasswordValidator.field_l > var13) {
                  AudioPump.field_a[var13] = false;
                  var13++;
                }
                MissionBuilder.searchCompatibleLobbyOptions(PasswordValidator.field_l, -1, SetThrusterParticleSpeedDownshift.field_o, -1, 115, true, 0, -1);
                if (!(SetAngularVelocitySustain.field_p < 2) &&
                  SetMachineGunEnergyUsed.field_o[12]) {
                  TickClock.field_b = true;
                }
              }
              if (!TickClock.field_b) {
                ObjectiveMarker.field_b.enabled = false;
                if (ObjectiveMarker.field_b.field_Q) {
                  var9 = null;
                  if (GetMissionVotes.field_p) {
                    var9 = "<col=A00000>" + GpuMaterialEffect.field_a + "</col>";
                    var11 = var9;
                    var9 = var11;
                    var11Lifetime1 = var9;
                    var9 = var11Lifetime1;
                  }
                  for (var10Lifetime1 = 0; PasswordValidator.field_l > var10Lifetime1; var10Lifetime1++) {
                    if (AudioPump.field_a[var10Lifetime1]) {
                      var11_ref = "<col=A00000>" + ClientException.field_c[var10Lifetime1] + "</col>";
                      var9 = var11_ref;
                      var9 = var11_ref;
                      if (var9 != null) {
                        var9 = (String) (var9) + ", " + var11_ref;
                      } else {
                        var9 = var11_ref;
                      }
                    }
                  }
                  NebulaFieldFactory.field_a = "<col=A00000>" + GetReloadBarWidth.field_q + "<br>" + GetRepairModeCooldown.field_p + (String) (var9);
                }
              }
            } else {
              GetTorpedoProjectileDamage.field_p.text = PlayerContextMenu.field_j;
              GetShipToShipRamDamage.field_q.enabled = false;
              if (var8 == 0) {
                stackIn_25_0 = TickConditionFactory.field_b;
              } else {
                stackIn_25_0 = BodyDestroyedConditionFactory.field_a;
              }
              var16 = stackIn_25_0;
              var9 = var16;
              var9 = var16;
              var9 = var16;
              var10Lifetime1 = SetAutozoomSpeedDivide.field_p.font.getStringWidth(var16) + 3 * SetAutozoomSpeedDivide.field_p.font.getCharacterAdvance('.');
              SetAutozoomSpeedDivide.field_p.field_F = 0;
              if ((GetMissionTerrainNebulaProbability.field_o & 48) == 16) {
                var9 = var16 + ".";
              }
              SetAutozoomSpeedDivide.field_p.field_w = (-var10Lifetime1 + SetAutozoomSpeedDivide.field_p.width) / 2;
              if (32 == (48 & GetMissionTerrainNebulaProbability.field_o)) {
                var9 = (String) (var9) + "..";
              }
              if ((48 & GetMissionTerrainNebulaProbability.field_o) == 48) {
                var9 = (String) (var9) + "...";
              }
              SetAutozoomSpeedDivide.field_p.text = (String) (var9);
              ObjectiveMarker.field_b.text = SetMissileLauncherProjectiles.field_p.toUpperCase();
            }
          }
          stackIn_71_0 = WaterTextures.field_g;
          stackIn_72_1 = (param0) && (!param2) && (!GetTorpedoProjectileDamage.field_o);
          ((Widget) (Object) stackIn_71_0).updateInput(stackIn_72_1, 1332);
          stackIn_76_0 = ThreeSliceButtonStyle.field_r;
          stackIn_77_1 = (param0) && (!param2) && (!GetTorpedoProjectileDamage.field_o);
          ((Widget) (Object) stackIn_76_0).updateInput(stackIn_77_1, 1332);
          if (param1 > -89) {
            return;
          }
          stackIn_83_0 = SetUseCircleFill.field_o;
          stackIn_84_1 = (param0) && (!param2) && (GetTorpedoProjectileDamage.field_o);
          ((Widget) (Object) stackIn_83_0).updateInput(stackIn_84_1, 1332);
          GetReverbWidth.field_o.tabs.updateSelectedTab(10000);
          if (SetThrusterParticleSpeedDownshift.field_o != null) {
            if (GetShipToShipRamDamage.field_q.field_o != 0) {
              LegacyOpenGlShader.a(false, param3);
            }
            if (ObjectiveMarker.field_b.field_o != 0) {
              if (ArchiveTextureProvider.field_h) {
                GetComponentBreakingExplosionForceMultiplier.a(38, param3);
              } else {
                GpuSprite.a((byte) 108, param3);
              }
            }
            ResourceArchive.a(param3, SetThrusterParticleSpeedDownshift.field_o, true, (byte) -67);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) var4), "soa.C(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    ScrollPaneWidget(long param0, Widget param1, Widget param2, ScrollBarWidget param3) {
        super(param0, (Widget) null);
        try {
          this.viewport = new Widget(0L, param2);
          this.scrollbar = new ScrollBarWidget(0L, param3);
          this.addChild(-561, this.viewport);
          this.addChild(-561, this.scrollbar);
          this.content = param1;
          this.viewport.addChild(-561, param1);
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) runtimeException), "soa.<init>(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    final void setBoundsAndLayout(int param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        this.width = param0;
        this.y = param4;
        this.height = param3;
        this.x = param5;
        this.layoutViewportAndScrollbar(param6, 87, param1);
        if (param2 != -1) {
          this.scrollbar = (ScrollBarWidget) null;
        }
    }

    private final void processScrollInput(int param0, int param1, boolean param2, int param3, int param4) {
        if (this.scrollbar.pollScrollUp(0)) {
          this.content.field_db = this.content.field_db + param3;
        }
        if (this.scrollbar.pollScrollDown(-6)) {
          this.content.field_db = this.content.field_db - param3;
        }
        if (this.scrollbar.pollPageUp(20)) {
          this.content.field_db = this.content.field_db + param0;
        }
        if (this.scrollbar.pollPageDown(true)) {
          this.content.field_db = this.content.field_db - param0;
        }
        if (this.field_O) {
          this.content.field_db = this.content.field_db - param4;
        }
        if (!param2) {
          if (this.content.height + (this.content.field_E - this.viewport.height) < -(this.content.y + this.content.field_db)) {
            this.content.field_db = -this.content.y - (this.content.field_E + (this.content.height - this.viewport.height));
          }
          if (-(this.content.y + this.content.field_db) < 0) {
            this.content.field_db = -this.content.y;
          }
        } else {
          if (-(this.content.y + this.content.field_db) < 0) {
            this.content.field_db = -this.content.y;
          }
          if (-this.viewport.height + (this.content.field_E + this.content.height) < -(this.content.y + this.content.field_db)) {
            this.content.field_db = -(-this.viewport.height + this.content.field_E + this.content.height) - this.content.y;
          }
        }
        if (param1 != 48) {
          this.viewport = (Widget) null;
        }
        if (this.scrollbar.isThumbDragging(true)) {
          this.content.y = -this.scrollbar.getScrollPosition(this.content.height, this.viewport.height, (byte) -123, param2);
          this.content.field_db = 0;
        }
        this.scrollbar.updateGeometry(this.content.height, -this.content.y, (byte) -126, this.viewport.height);
    }

    private final boolean layoutAndUpdateScrolling(boolean param0, boolean param1, int param2, int param3, int param4, int param5, int param6) {
        int var8;
        int stackIn_10_0 = 0;
        if (param6 >= -46) {
          this.content = (Widget) null;
        }
        if (!param0) {
          if (this.field_O) {
            stackIn_10_0 = (!param1) ? 1 : 0;
          } else {
            stackIn_10_0 = 0;
          }
        } else {
          stackIn_10_0 = 1;
        }
        var8 = stackIn_10_0;
        this.content.layoutVerticalChildren(param4, -91, this.viewport.height, var8 != 0);
        this.processScrollInput(param2, 48, false, param5, param3);
        return var8 != 0;
    }

    final void updateScrolling(int param0, boolean param1, int param2, int param3) {
        if (param3 != 0) {
          this.content = (Widget) null;
        }
        this.processScrollInput(this.viewport.height, param3 + 48, param1, param2, param0);
    }

    static {
    }
}
