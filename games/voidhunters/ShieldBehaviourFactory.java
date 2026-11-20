/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ShieldBehaviourFactory implements GameStateFactory {
    static int field_a;

    public final SerializableGameState create(byte param0) {
        int var2 = 56 / ((-64 - param0) / 50);
        return (SerializableGameState) ((Object) new ShieldBehaviour());
    }

    final static void decreaseSoundEffectVolume(byte param0) {
        int var1 = 0;
        if (32 < RidgedNoiseVolumeGenerator.soundEffectVolume) {
          var1 = RidgedNoiseVolumeGenerator.soundEffectVolume % 32;
          if (var1 == 0) {
            var1 = 32;
          }
          LoopingSound.setSoundEffectVolume(-var1 + RidgedNoiseVolumeGenerator.soundEffectVolume, -13205);
          if (param0 != 64) {
            field_a = 29;
            return;
          }
          return;
        }
        LoopingSound.setSoundEffectVolume(0, -13205);
        if (param0 != 64) {
          field_a = 29;
          return;
        }
    }

    public final SerializableGameState[] createArray(int param0, int param1) {
        if (param0 != 11995) {
          field_a = -87;
          return (SerializableGameState[]) ((Object) new ShieldBehaviour[param1]);
        }
        return (SerializableGameState[]) ((Object) new ShieldBehaviour[param1]);
    }

    final static void drawAndHandleShipImportPreview(int param0, boolean param1) {
        int var2;
        String var3;
        int var4;
        int var5;
        int var9;
        int var10;
        float var11;
        float var12;
        String var15;
        Ship var16;
        Camera2D var18;
        Ship var19;
        Camera2D var21;
        Ship var22;
        Camera2D var24;
        int[] var25;
        int[] var26;
        int[] var27;
        int var5Lifetime1;
        int var9Lifetime1;
        int var10Lifetime1;
        float var11Lifetime1;
        float var12Lifetime1;
        int var5Lifetime2;
        int var9Lifetime2;
        int var10Lifetime2;
        float var11Lifetime2;
        float var12Lifetime2;
        String var3Lifetime1;
        String var3Lifetime2;
        String var15Lifetime1;
        String var15Lifetime2;
        if (!SetDebrisGroupColour.isShipImportPending(false)) {
          if (param1) {
          }
          if (param0 == 0) {
            return;
          }
          ShieldBehaviourFactory.drawAndHandleShipImportPreview(45, false);
          return;
        }
        var2 = 1;
        var3 = NetworkArchiveRequest.field_s;
        var15 = var3;
        var3Lifetime1 = var15;
        var15Lifetime1 = var3Lifetime1;
        var3Lifetime2 = var15Lifetime1;
        var4 = 0;
        if (MatchingFieldValidator.field_g != null &&
          !MatchingFieldValidator.field_g.networked) {
          var4 = 1;
        } else {
          if (GetArmageddonTimerStart.field_o != 0) {
            var15Lifetime2 = SetVariableLabelAction.field_a;
            var3Lifetime2 = var15Lifetime2;
            CachedArchiveProvider.fillRectangleAlpha(200, false, 0, 0, GetBombletSprayEnergyUsed.field_p.height, GetBombletSprayEnergyUsed.field_p.width, 1);
            var5 = ArmBehaviour.drawCenteredMessagePanel(var2, 0, 200, var15Lifetime2);
            var16 = MenuInputState.createShipFromComponentWords(GetBombletSprayPushMultiplier.importedShipComponentWords, (byte) 41);
            var18 = new Camera2D();
            var18.screenOriginY = (GetBombletSprayEnergyUsed.field_p.height >> 1) - (-(var5 >> 1) - ((GetBombletSprayEnergyUsed.field_p.height >> 1) - (var5 >> 1) >> 1));
            var18.screenOriginX = GetBombletSprayEnergyUsed.field_p.width >> 1;
            var25 = var16.getBoundingbox((byte) -92);
            var9 = -var25[0] + var25[1];
            var10 = var25[3] - var25[2];
            var11 = (-32.0f + (float)((GetBombletSprayEnergyUsed.field_p.height >> 1) - (var5 >> 1))) / (float)var9;
            var12 = (-32.0f + (float)((GetBombletSprayEnergyUsed.field_p.height >> 1) - (var5 >> 1))) / (float)var10;
            var18.scale = Math.min(var11, var12);
            var18.worldCenterX = (float)((var25[0] + var25[1]) / 2);
            var18.worldCenterY = (float)((var25[3] + var25[2]) / 2);
            var16.setAngle(SetMinimapWidth.field_o * 10 % 8192, -82);
            if (MatchingFieldValidator.field_g != null &&
              !MatchingFieldValidator.field_g.networked &&
              MatchingFieldValidator.field_g.state.getVisibleSnapshot(param0 + 1).world.findShipByOwner(MatchingFieldValidator.field_g.localPlayerIndex, 76) != null) {
              var16.setTeam(17704, 1);
              var16.integrateMotion(false, true, (World) null);
              var16.draw(var18, 121, (World) null);
              if (0 != GetBots.field_o ||
                SetMachineGunEnergyUsed.field_o[83] ||
                SetMachineGunEnergyUsed.field_o[84] ||
                SetMachineGunEnergyUsed.field_o[13]) {
                if (var4 != 0) {
                  SetFixedaim.shipImportResolved = true;
                } else {
                  GetBombletSprayPushMultiplier.importedShipComponentWords = null;
                  SetFixedaim.shipImportResolved = true;
                }
              }
              if (param1) {
              }
              if (param0 != 0) {
                ShieldBehaviourFactory.drawAndHandleShipImportPreview(45, false);
              }
              return;
            }
            var16.integrateMotion(false, true, (World) null);
            var16.draw(var18, 121, (World) null);
            if (0 == GetBots.field_o &&
              !SetMachineGunEnergyUsed.field_o[83] &&
              !SetMachineGunEnergyUsed.field_o[84]) {
              if (!SetMachineGunEnergyUsed.field_o[13]) {
                if (param1) {
                }
                if (param0 == 0) {
                  return;
                }
                ShieldBehaviourFactory.drawAndHandleShipImportPreview(45, false);
                return;
              }
              if (var4 != 0) {
                SetFixedaim.shipImportResolved = true;
              } else {
                GetBombletSprayPushMultiplier.importedShipComponentWords = null;
                SetFixedaim.shipImportResolved = true;
              }
              if (param1) {
              }
              if (param0 != 0) {
                ShieldBehaviourFactory.drawAndHandleShipImportPreview(45, false);
              }
              return;
            }
            if (var4 != 0) {
              SetFixedaim.shipImportResolved = true;
              if (param1) {
              }
              if (param0 != 0) {
                ShieldBehaviourFactory.drawAndHandleShipImportPreview(45, false);
              }
              return;
            }
            GetBombletSprayPushMultiplier.importedShipComponentWords = null;
            SetFixedaim.shipImportResolved = true;
            if (param1) {
            }
            if (param0 != 0) {
              ShieldBehaviourFactory.drawAndHandleShipImportPreview(45, false);
            }
            return;
          }
          if (0 == AgeValidator.field_f) {
            var4 = 1;
            CachedArchiveProvider.fillRectangleAlpha(200, false, 0, 0, GetBombletSprayEnergyUsed.field_p.height, GetBombletSprayEnergyUsed.field_p.width, 1);
            var5Lifetime2 = ArmBehaviour.drawCenteredMessagePanel(var2, 0, 200, var3Lifetime2);
            var19 = MenuInputState.createShipFromComponentWords(GetBombletSprayPushMultiplier.importedShipComponentWords, (byte) 41);
            var21 = new Camera2D();
            var21.screenOriginY = (GetBombletSprayEnergyUsed.field_p.height >> 1) - (-(var5Lifetime2 >> 1) - ((GetBombletSprayEnergyUsed.field_p.height >> 1) - (var5Lifetime2 >> 1) >> 1));
            var21.screenOriginX = GetBombletSprayEnergyUsed.field_p.width >> 1;
            var26 = var19.getBoundingbox((byte) -92);
            var9Lifetime2 = -var26[0] + var26[1];
            var10Lifetime2 = var26[3] - var26[2];
            var11Lifetime2 = (-32.0f + (float)((GetBombletSprayEnergyUsed.field_p.height >> 1) - (var5Lifetime2 >> 1))) / (float)var9Lifetime2;
            var12Lifetime2 = (-32.0f + (float)((GetBombletSprayEnergyUsed.field_p.height >> 1) - (var5Lifetime2 >> 1))) / (float)var10Lifetime2;
            var21.scale = Math.min(var11Lifetime2, var12Lifetime2);
            var21.worldCenterX = (float)((var26[0] + var26[1]) / 2);
            var21.worldCenterY = (float)((var26[3] + var26[2]) / 2);
            var19.setAngle(SetMinimapWidth.field_o * 10 % 8192, -82);
            if (MatchingFieldValidator.field_g != null &&
              !MatchingFieldValidator.field_g.networked &&
              MatchingFieldValidator.field_g.state.getVisibleSnapshot(param0 + 1).world.findShipByOwner(MatchingFieldValidator.field_g.localPlayerIndex, 76) != null) {
              var19.setTeam(17704, 1);
            }
            var19.integrateMotion(false, true, (World) null);
            var19.draw(var21, 121, (World) null);
            if (0 != GetBots.field_o ||
              SetMachineGunEnergyUsed.field_o[83] ||
              SetMachineGunEnergyUsed.field_o[84] ||
              SetMachineGunEnergyUsed.field_o[13]) {
              if (var4 != 0) {
                SetFixedaim.shipImportResolved = true;
              } else {
                GetBombletSprayPushMultiplier.importedShipComponentWords = null;
                SetFixedaim.shipImportResolved = true;
              }
            }
            if (param1) {
            }
            if (param0 != 0) {
              ShieldBehaviourFactory.drawAndHandleShipImportPreview(45, false);
            }
            return;
          }
          var3Lifetime2 = SetVariableLabelAction.field_a;
        }
        CachedArchiveProvider.fillRectangleAlpha(200, false, 0, 0, GetBombletSprayEnergyUsed.field_p.height, GetBombletSprayEnergyUsed.field_p.width, 1);
        var5Lifetime1 = ArmBehaviour.drawCenteredMessagePanel(var2, 0, 200, var3Lifetime2);
        var22 = MenuInputState.createShipFromComponentWords(GetBombletSprayPushMultiplier.importedShipComponentWords, (byte) 41);
        var24 = new Camera2D();
        var24.screenOriginY = (GetBombletSprayEnergyUsed.field_p.height >> 1) - (-(var5Lifetime1 >> 1) - ((GetBombletSprayEnergyUsed.field_p.height >> 1) - (var5Lifetime1 >> 1) >> 1));
        var24.screenOriginX = GetBombletSprayEnergyUsed.field_p.width >> 1;
        var27 = var22.getBoundingbox((byte) -92);
        var9Lifetime1 = -var27[0] + var27[1];
        var10Lifetime1 = var27[3] - var27[2];
        var11Lifetime1 = (-32.0f + (float)((GetBombletSprayEnergyUsed.field_p.height >> 1) - (var5Lifetime1 >> 1))) / (float)var9Lifetime1;
        var12Lifetime1 = (-32.0f + (float)((GetBombletSprayEnergyUsed.field_p.height >> 1) - (var5Lifetime1 >> 1))) / (float)var10Lifetime1;
        var24.scale = Math.min(var11Lifetime1, var12Lifetime1);
        var24.worldCenterX = (float)((var27[0] + var27[1]) / 2);
        var24.worldCenterY = (float)((var27[3] + var27[2]) / 2);
        var22.setAngle(SetMinimapWidth.field_o * 10 % 8192, -82);
        if (MatchingFieldValidator.field_g == null) {
          var22.integrateMotion(false, true, (World) null);
          var22.draw(var24, 121, (World) null);
          if (0 == GetBots.field_o &&
            !SetMachineGunEnergyUsed.field_o[83] &&
            !SetMachineGunEnergyUsed.field_o[84]) {
            if (SetMachineGunEnergyUsed.field_o[13]) {
              if (var4 == 0) {
                GetBombletSprayPushMultiplier.importedShipComponentWords = null;
              }
              SetFixedaim.shipImportResolved = true;
              if (param1) {
              }
              if (param0 != 0) {
                ShieldBehaviourFactory.drawAndHandleShipImportPreview(45, false);
              }
              return;
            }
          } else {
            if (var4 == 0) {
              GetBombletSprayPushMultiplier.importedShipComponentWords = null;
            }
            SetFixedaim.shipImportResolved = true;
          }
        } else {
          if (MatchingFieldValidator.field_g.networked) {
            var22.integrateMotion(false, true, (World) null);
            var22.draw(var24, 121, (World) null);
            if (0 == GetBots.field_o &&
              !SetMachineGunEnergyUsed.field_o[83] &&
              !SetMachineGunEnergyUsed.field_o[84]) {
              if (SetMachineGunEnergyUsed.field_o[13]) {
                if (var4 == 0) {
                  GetBombletSprayPushMultiplier.importedShipComponentWords = null;
                }
                SetFixedaim.shipImportResolved = true;
                if (param1) {
                }
                if (param0 != 0) {
                  ShieldBehaviourFactory.drawAndHandleShipImportPreview(45, false);
                }
                return;
              }
            } else {
              if (var4 == 0) {
                GetBombletSprayPushMultiplier.importedShipComponentWords = null;
              }
              SetFixedaim.shipImportResolved = true;
            }
          } else {
            if (MatchingFieldValidator.field_g.state.getVisibleSnapshot(param0 + 1).world.findShipByOwner(MatchingFieldValidator.field_g.localPlayerIndex, 76) != null) {
              var22.setTeam(17704, 1);
              var22.integrateMotion(false, true, (World) null);
              var22.draw(var24, 121, (World) null);
              if (0 != GetBots.field_o ||
                SetMachineGunEnergyUsed.field_o[83] ||
                SetMachineGunEnergyUsed.field_o[84] ||
                SetMachineGunEnergyUsed.field_o[13]) {
                if (var4 != 0) {
                  SetFixedaim.shipImportResolved = true;
                } else {
                  GetBombletSprayPushMultiplier.importedShipComponentWords = null;
                  SetFixedaim.shipImportResolved = true;
                }
              }
            } else {
              var22.integrateMotion(false, true, (World) null);
              var22.draw(var24, 121, (World) null);
              if (0 != GetBots.field_o) {
                if (var4 == 0) {
                  GetBombletSprayPushMultiplier.importedShipComponentWords = null;
                }
                SetFixedaim.shipImportResolved = true;
              } else {
                if (SetMachineGunEnergyUsed.field_o[83]) {
                  if (var4 == 0) {
                    GetBombletSprayPushMultiplier.importedShipComponentWords = null;
                  }
                  SetFixedaim.shipImportResolved = true;
                } else {
                  if (SetMachineGunEnergyUsed.field_o[84]) {
                    if (var4 == 0) {
                      GetBombletSprayPushMultiplier.importedShipComponentWords = null;
                    }
                    SetFixedaim.shipImportResolved = true;
                  } else {
                    if (SetMachineGunEnergyUsed.field_o[13]) {
                      if (var4 != 0) {
                        SetFixedaim.shipImportResolved = true;
                        if (param1) {
                        }
                        if (param0 != 0) {
                          ShieldBehaviourFactory.drawAndHandleShipImportPreview(45, false);
                        }
                        return;
                      }
                      GetBombletSprayPushMultiplier.importedShipComponentWords = null;
                      SetFixedaim.shipImportResolved = true;
                    }
                  }
                }
              }
            }
          }
        }
        if (param1) {
        }
        if (param0 == 0) {
          return;
        }
        ShieldBehaviourFactory.drawAndHandleShipImportPreview(45, false);
        return;
    }

    static {
        field_a = 50;
    }
}
