/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class PlayerContextMenu {
    Widget sourceWidget;
    private String targetDisplayName;
    private int channelType;
    static int field_f;
    PopupMenuWidget menu;
    private long targetPlayerKey;
    static String[][] field_k;
    int targetGameId;
    private int[] actionData;
    String targetName;
    static String field_j;

    private final boolean handleSocialAction(int param0, int param1, int param2) {
        Object var4;
        String var4_ref;
        if (param2 > -64) {
          this.addReportOption(33);
        }
        var4 = null;
        if (param1 != 4) {
          if (param1 == 5) {
            var4_ref = ServerTickFactory.a((byte) 90, this.targetName, param0);
          } else {
            if (6 != param1) {
              if (7 != param1) {
                return false;
              }
              var4_ref = GameCanvasResizeListener.a(param0, this.targetDisplayName, this.targetName, (byte) -76);
            } else {
              var4_ref = SetExplosionPushMultiplier.a(2, this.targetName, param0);
            }
          }
        } else {
          var4_ref = SetPhasedEnergyBeamPulsetime.a(this.targetName, param0, 9602);
        }
        if (var4_ref != null) {
          lh.a((byte) -112, 0, (String) null, this.targetName, var4_ref, 2);
        }
        return true;
    }

    private final boolean handleReportAction(byte param0, int param1, int param2) {
        if (param0 != 16) {
          field_f = 14;
        }
        if (17 != param1) {
          return false;
        }
        Asteroid.field_v = new bwa(this.sourceWidget.screenX, this.sourceWidget.screenY, this.sourceWidget.width, this.sourceWidget.height, param2, DualLinkNode.field_g, lo.field_b, GetFighterBayReload.field_p, DeveloperConsole.field_q, SetShieldsDirectionalArcParticleLife.field_o, GetMissionDebrisDefaultProbability.field_o, this.targetName, this.targetPlayerKey);
        return true;
    }

    private final boolean handleLobbyAction(byte param0, int param1, int param2) {
        boolean discarded$1 = false;
        int var5;
        var5 = VoidHunters.field_G;
        if (param2 != 0) {
          if (param2 != 1) {
            if (param2 != 2) {
              if (param2 != 3) {
                if (param2 != 10) {
                  if (param2 == 15) {
                    AudioPump.a(param1, this.targetGameId, 91);
                  } else {
                    if (16 != param2) {
                      return false;
                    }
                    AudioPump.a(param1, 0, 53);
                  }
                } else {
                  ArmBehaviourFactory.a(this.targetGameId, param1, 20694);
                }
              } else {
                sh.a(this.targetGameId, -1, param1);
              }
            } else {
              pa.a(param1, (byte) -128, this.targetGameId);
            }
          } else {
            World.a(param1, this.targetPlayerKey, param0 ^ -25);
          }
        } else {
          ut.a(6, this.targetPlayerKey, param1);
        }
        if (param0 == 99) {
          return true;
        }
        discarded$1 = this.handleReportAction((byte) 32, 2, 100);
        return true;
    }

    final static void sortScoreIndices(int param0, int param1, int param2, boolean param3, int param4, byte param5, int param6) {
        int var11 = 0;
        int incrementValue$0 = 0;
        int stackIn_23_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var7_int = 0;
        RuntimeException var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var7_intLifetime1;
        int var8Lifetime1;
        int var9Lifetime1;
        int var10Lifetime1;
        var14 = VoidHunters.field_G;
        try {
          if (param4 <= param0) {
            return;
          }
          if (1 + param0 >= param2) {
            return;
          }
          if (param0 + 5 < param2 &&
            param6 != param1) {
            var7_int = (1 & (param6 & param1)) + ((param6 >> 1) + (param1 >> 1));
            var8 = param0;
            var9 = param1;
            var10 = param6;
            for (var11 = param0; var11 < param2; var11++) {
              var12 = UnlitGpuMaterialEffect.field_f[var11];
              if (param3) {
                stackIn_23_0 = GetLaserEnergyUsed.field_o[var12];
              } else {
                stackIn_23_0 = SetRespawnTime.field_o[var12];
              }
              var13 = stackIn_23_0;
              if (var13 > var7_int) {
                UnlitGpuMaterialEffect.field_f[var11] = UnlitGpuMaterialEffect.field_f[var8];
                incrementValue$0 = var8;
                var8++;
                UnlitGpuMaterialEffect.field_f[incrementValue$0] = var12;
                if (var13 < var9) {
                  var9 = var13;
                }
              } else {
                if (var13 > var10) {
                  var10 = var13;
                }
              }
            }
            PlayerContextMenu.sortScoreIndices(param0, param1, var8, param3, param4, (byte) 24, var9);
            PlayerContextMenu.sortScoreIndices(var8, var10, param2, param3, param4, param5, param6);
            return;
          }
          for (var7_intLifetime1 = param2 - 1; param0 < var7_intLifetime1; var7_intLifetime1--) {
            for (var8Lifetime1 = param0; var8Lifetime1 < var7_intLifetime1; var8Lifetime1++) {
              var9Lifetime1 = UnlitGpuMaterialEffect.field_f[var8Lifetime1];
              var10Lifetime1 = UnlitGpuMaterialEffect.field_f[1 + var8Lifetime1];
              if (dla.a(param5 + 103, param3, var10Lifetime1, var9Lifetime1)) {
                UnlitGpuMaterialEffect.field_f[var8Lifetime1] = var10Lifetime1;
                UnlitGpuMaterialEffect.field_f[1 + var8Lifetime1] = var9Lifetime1;
              }
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) var7), "hqb.O(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
    }

    final void addSocialOptions(int param0, int param1, int[] param2) {
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_30_2 = null;
        RuntimeException decompiledCaughtException = null;
        String var4 = null;
        RuntimeException var4_ref = null;
        vu var5 = null;
        int var6 = 0;
        CharSequence var7 = null;
        String var8 = null;
        try {
          if (this.targetName != null && (~BodyInZoneConditionFactory.field_a != ~this.targetPlayerKey ||
            param1 == 2) && iwa.field_b == 2) {
            var8 = this.getTargetDisplayName((byte) -63);
            var4 = var8;
            var5 = FlipTextureOperation.a(this.targetName, 0);
            var6 = SetUseLines.a((byte) -94, this.targetName) ? 1 : 0;
            if (var5 == null &&
              var6 == 0) {
              this.menu.addItem(SetReverbGain.a(SetAngularForceDownshift.field_r, new String[]{var8}, 93), (byte) -53, 4);
              this.menu.addItem(SetReverbGain.a(GpuMaterialEffect.field_c, new String[]{var8}, 104), (byte) -53, 6);
              if (param2 != null &&
                param1 != 2 &&
                !GetBloomThresholdPercentage.field_p) {
                this.actionData = param2;
                this.menu.addItem(SetReverbGain.a(SetMachineGunFireForce.field_q, new String[]{var8}, 87), (byte) -53, 19);
              }
            }
            if (var5 != null) {
              if (!qs.a(0, this.targetName) &&
                !GetBloomThresholdPercentage.field_p) {
                if (!hb.field_c) {
                  this.menu.addItem(SetReverbGain.a(SetSniperCannonProjectileLife.field_o, new String[]{var8}, 104), (byte) -53, 8);
                }
                this.menu.addItem(SetReverbGain.a(SetMissileLauncherFireForce.field_p, new String[]{var8}, 112), (byte) -53, 18);
                if (param2 != null) {
                  this.actionData = param2;
                  this.menu.addItem(SetReverbGain.a(SetMachineGunFireForce.field_q, new String[]{var8}, 73), (byte) -53, 19);
                }
              }
              this.menu.addItem(SetReverbGain.a(GetAllowShipSaving.field_o, new String[]{var8}, 114), (byte) -53, 5);
            }
            if (var6 != 0) {
              this.menu.addItem(SetReverbGain.a(HardpointMatch.field_c, new String[]{var8}, 80), (byte) -53, 7);
            }
          }
          if (param0 >= -13) {
            var7 = (CharSequence) null;
            PlayerContextMenu.getNameFormatError(false, (byte) -9, (CharSequence) null);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_29_0 = var4_ref;
          stackIn_29_1 = new StringBuilder().append("hqb.M(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_30_2 = "null";
          } else {
            stackIn_30_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_29_0), ((StringBuilder) (Object) stackIn_29_1).append(stackIn_30_2).append(')').toString());
        }
    }

    final static String getNameFormatError(boolean param0, byte param1, CharSequence param2) {
        int var6 = 0;
        String stackIn_3_0 = null;
        String stackIn_6_0 = null;
        String stackIn_11_0 = null;
        String stackIn_16_0 = null;
        String stackIn_21_0 = null;
        String stackIn_31_0 = null;
        String stackIn_36_0 = null;
        RuntimeException stackIn_40_0 = null;
        StringBuilder stackIn_40_1 = null;
        String stackIn_41_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        String var4 = null;
        int var5 = 0;
        int var7 = 0;
        int var8 = 0;
        var8 = VoidHunters.field_G;
        try {
          if (param1 != 43) {
            stackIn_3_0 = (String) null;
            return stackIn_3_0;
          }
          if (param2 == null) {
            stackIn_6_0 = GetInnateThrusters.field_o;
            return stackIn_6_0;
          }
          var3_int = param2.length();
          if (var3_int >= 1 &&
            var3_int <= 12) {
            var4 = ConstantColorTextureOperation.normalizeName(false, param2);
            if (var4 != null &&
              var4.length() >= 1) {
              if (!MouseWheelInput.isNameSeparator(var4.charAt(0), 56) &&
                !MouseWheelInput.isNameSeparator(var4.charAt(var4.length() - 1), param1 ^ 79)) {
                var5 = 0;
                for (var6 = 0; var6 < param2.length(); var6++) {
                  var7 = param2.charAt(var6);
                  if (MouseWheelInput.isNameSeparator((char) var7, 45)) {
                    var5++;
                  } else {
                    var5 = 0;
                  }
                  if (var5 >= 2 &&
                    !param0) {
                    stackIn_31_0 = ServerInfoFactory.field_a;
                    return stackIn_31_0;
                  }
                }
                if (0 >= var5) {
                  return null;
                }
                stackIn_36_0 = ArmBehaviour.field_d;
                return stackIn_36_0;
              }
              stackIn_21_0 = ArmBehaviour.field_d;
              return stackIn_21_0;
            }
            stackIn_16_0 = GetInnateThrusters.field_o;
            return stackIn_16_0;
          }
          stackIn_11_0 = GetInnateThrusters.field_o;
          return stackIn_11_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_40_0 = var3;
          stackIn_40_1 = new StringBuilder().append("hqb.C(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_41_2 = "null";
          } else {
            stackIn_41_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_40_0), ((StringBuilder) (Object) stackIn_40_1).append(stackIn_41_2).append(')').toString());
        }
    }

    public static void clearSharedReferences(byte param0) {
        field_k = (String[][]) null;
        if (param0 > -103) {
          CharSequence var2 = (CharSequence) null;
          PlayerContextMenu.getNameFormatError(true, (byte) -64, (CharSequence) null);
        }
        field_j = null;
    }

    final void drawMenu(int param0, boolean param1) {
        this.menu.draw(param1, 39);
        if (param0 != 1) {
          field_f = 4;
        }
    }

    private final boolean handleChatAction(int param0, int param1, int param2) {
        int var5;
        var5 = VoidHunters.field_G;
        if (param2 != -17791) {
          this.targetName = (String) null;
        }
        if (param1 != 8) {
          if (18 == param1) {
            PlayerVoteFactory.a(this.targetName, this.targetPlayerKey, 63);
          } else {
            if (param1 == 11) {
              OpenGlPostEffect.a(0, (byte) -118, param0, this.channelType);
            } else {
              if (param1 == 12) {
                OpenGlPostEffect.a(1, (byte) -123, param0, this.channelType);
              } else {
                if (param1 == 13) {
                  OpenGlPostEffect.a(2, (byte) -105, param0, this.channelType);
                } else {
                  if (param1 != 14) {
                    if (param1 != 20) {
                      if (19 != param1) {
                        return false;
                      }
                      fia.a(this.actionData, this.channelType, (byte) 105, this.targetPlayerKey, this.targetName);
                      return true;
                    }
                    or.a(0);
                  } else {
                    NetworkArchiveRequest.e(1);
                  }
                }
              }
            }
          }
        } else {
          GetMpSandboxEnemySpawnLimit.a((byte) 39, this.targetPlayerKey, this.targetName);
        }
        return true;
    }

    final void addLobbyOwnerOptions(boolean param0, int param1) {
        jk var4;
        String var5;
        int var6;
        jk var7;
        var6 = VoidHunters.field_G;
        if (param1 <= 1) {
          this.sourceWidget = (Widget) null;
        }
        if (this.targetName != null &&
          BodyInZoneConditionFactory.field_a != this.targetPlayerKey &&
          null != SetSpinningBladeSpindamageMultiplier.field_o &&
          SmoothedNanoTickClock.isLocalLobbyOwner(-45)) {
          var7 = SetPhasedEnergyBeamAimarc.a((byte) 80, this.targetPlayerKey);
          var4 = ScrollBarWidget.a(this.targetPlayerKey, true);
          var5 = this.getTargetDisplayName((byte) -128);
          if (var4 == null) {
            if (var7 != null &&
              SetSpinningBladeSpindamageMultiplier.field_o.field_Gb &&
              SetSpinningBladeSpindamageMultiplier.field_o.field_zb < SetSpinningBladeSpindamageMultiplier.field_o.field_Fb) {
              if (!var7.field_Eb) {
                if (param0 &&
                  var7.field_Fb) {
                  this.menu.addItem(SetReverbGain.a(SetWaitForPlayers.field_p, new String[]{var5}, 121), (byte) -53, 0);
                  this.menu.addItem(SetReverbGain.a(AsteroidField.field_b, new String[]{var5}, 75), (byte) -53, 1);
                } else {
                  this.menu.addItem(SetReverbGain.a(GetSalvoHoldable.field_o, new String[]{var5}, 94), (byte) -53, 0);
                }
              } else {
                this.menu.addItem(SetReverbGain.a(ts.field_a, new String[]{var5}, 115), (byte) -53, 1);
              }
            }
          } else {
            if (!SetSpinningBladeSpindamageMultiplier.field_o.field_fc ||
              !(SetSpinningBladeSpindamageMultiplier.field_o.field_Ub < 0)) {
              this.menu.addItem(SetReverbGain.a(GetRepairModeRadius.field_o, new String[]{var5}, 106), (byte) -53, 1);
            }
          }
        }

    }

    final void addChatFilterOptions(pgb param0, int param1) {
        if (param0.field_k) {
          return;
        }
        if (param1 <= 73) {
          return;
        }
        try {
          this.channelType = param0.field_a;
          if (param0.field_a == 0) {
            if (kib.field_d == 0) {
              this.menu.addItem(UiVisualStyle.field_a, (byte) -53, 12);
            }
            this.menu.addItem(tda.field_M, (byte) -53, 13);
          }
          if (1 == param0.field_a) {
            if (0 == GetThrusterSmallForce.field_p) {
              this.menu.addItem(SetMassDriverEnergyUsed.field_p, (byte) -53, 12);
            }
            this.menu.addItem(PasswordValidator.field_j, (byte) -53, 13);
          }
          if (param0.field_a == 2) {
            if (0 == lla.field_h) {
              this.menu.addItem(SetMissilesAcceleration.field_o, (byte) -53, 12);
            }
            this.menu.addItem(SetMissionDebrisVotingChancestep.field_o, (byte) -53, 13);
          }
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) runtimeException), "hqb.I(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    private final String getTargetDisplayName(byte param0) {
        String var2 = null;
        if (param0 >= -24) {
          return (String) null;
        }
        if (this.targetDisplayName == null) {
          var2 = this.targetName;
        } else {
          var2 = this.targetDisplayName;
        }
        return var2;
    }

    final void addGameJoinOptions(boolean param0) {
        String var3;
        int var4;
        LobbyGameEntry var5;
        var4 = VoidHunters.field_G;
        if (!param0) {
          return;
        }
        if (SetSpinningBladeSpindamageMultiplier.field_o == null) {
          var5 = meb.a(this.targetGameId, 1);
          if (var5 != null) {
            var3 = var5.field_Vb;
            if (!var5.field_ac) {
              if (var5.field_cc) {
                this.menu.addItem(SetReverbGain.a(ti.field_g, new String[]{var3}, 101), (byte) -53, 2);
              } else {
                if (!var5.field_Qb &&
                  var5.field_Gb && (!var5.field_fc ||
                  var5.field_cc)) {
                  this.menu.addItem(SetReverbGain.a(OpenGlShader.field_c, new String[]{var3}, 107), (byte) -53, 2);
                }
              }
              if (var5.field_Qb) {
                this.menu.addItem(SetReverbGain.a(t.field_e, new String[]{var3}, 126), (byte) -53, 3);
              }
            } else {
              this.menu.addItem(SetReverbGain.a(SetDebrisCollision.field_o, new String[]{var3}, 127), (byte) -53, 2);
              this.menu.addItem(SetReverbGain.a(nrb.field_a, new String[]{var3}, 127), (byte) -53, 3);
            }
          }
        }
    }

    final boolean updateAndDispatchSelection(boolean param0, int param1, int param2, int param3, int param4) {
        int var6 = this.menu.updateAndGetSelection(param1 + 17, param0);
        if (var6 == -2) {
          return false;
        }
        boolean discarded$2 = this.handleLobbyAction((byte) 99, param2, var6);
        if (param1 != -11) {
          this.addReportOption(26);
        }
        boolean discarded$3 = this.handleSocialAction(param3, var6, -111);
        boolean discarded$4 = this.handleChatAction(param3, var6, -17791);
        boolean discarded$5 = this.handleReportAction((byte) 16, var6, param4);
        return true;
    }

    final boolean pollSelectionPending(int param0) {
        boolean stackIn_6_0 = false;
        if (param0 != 0) {
          return true;
        }
        stackIn_6_0 = (this.menu != null) && (this.menu.pollSelectionPending((byte) -126));
        return stackIn_6_0;
    }

    final void addReportOption(int param0) {
        String var3 = null;
        if (this.targetName != null &&
          BodyInZoneConditionFactory.field_a != this.targetPlayerKey) {
          var3 = this.getTargetDisplayName((byte) -110);
          String var2 = var3;
          this.menu.addItem(SetReverbGain.a(NetworkArchiveClient.field_l, new String[]{var3}, 83), (byte) -53, 17);
        }
        if (param0 != -9923) {
          this.drawMenu(-125, false);
        }
    }

    PlayerContextMenu(Widget param0, long param1, String param2, String param3, int param4, int param5, int[] param6) {
        try {
          this.menu = new PopupMenuWidget(TextureCombineOperation.field_a);
          this.targetPlayerKey = param1;
          this.sourceWidget = param0;
          this.targetDisplayName = param3;
          param0.field_J = true;
          this.targetName = param2;
          this.channelType = param5;
          this.targetGameId = param4;
          this.actionData = param6;
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) runtimeException), "hqb.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + (param3 != null ? "{...}" : "null") + ',' + param4 + ',' + param5 + ',' + (param6 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_f = 0;
        field_j = "Please wait while we search.<br>Games usually start within a minute, provided the server is busy enough.<br><br>The longer you are forced to wait, the earlier in the list of players you are likely to appear.<br><br>If the game doesn't start, click 'Cancel' and then try choosing 'Don't mind' for more options or switching to a busier lobby.";
    }
}
