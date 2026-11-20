/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ServerInfoFactory implements GameStateFactory {
    static String field_b;
    static String field_a;

    public final SerializableGameState[] createArray(int param0, int param1) {
        if (param0 != 11995) {
          field_b = (String) null;
          return (SerializableGameState[]) ((Object) new ServerInfo[param1]);
        }
        return (SerializableGameState[]) ((Object) new ServerInfo[param1]);
    }

    public final SerializableGameState create(byte param0) {
        int var2 = -83 % ((-64 - param0) / 50);
        return (SerializableGameState) ((Object) new ServerInfo());
    }

    final static void a(int param0, boolean param1) {
        int stackIn_20_0 = 0;
        boolean stackIn_25_0 = false;
        String stackIn_38_0 = null;
        boolean stackIn_42_0 = false;
        int stackIn_74_0 = 0;
        boolean stackIn_79_0 = false;
        String stackIn_92_0 = null;
        boolean stackIn_96_0 = false;
        int stackIn_108_0 = 0;
        boolean stackIn_113_0 = false;
        String stackIn_122_0 = null;
        boolean stackIn_126_0 = false;
        String stackIn_140_0 = null;
        boolean stackIn_144_0 = false;
        String stackIn_158_0 = null;
        boolean stackIn_162_0 = false;
        String stackIn_177_0 = null;
        boolean stackIn_181_0 = false;
        int var2;
        ToolkitRasterStateStack var3;
        int var4_int;
        String var4;
        int var5;
        int var6;
        int var7;
        int var8;
        int var9;
        int var10;
        int var11;
        int var12;
        String var13;
        ToolkitRasterStateStack var14;
        String var15;
        ToolkitRasterStateStack var16;
        String var17;
        ToolkitRasterStateStack var18;
        String var19;
        String var20;
        String var21;
        int var2Lifetime1;
        int var4_intLifetime1;
        int var5Lifetime1;
        int var6Lifetime1;
        int var7Lifetime1;
        int var8Lifetime1;
        int var9Lifetime1;
        int var10Lifetime1;
        int var11Lifetime1;
        int var12Lifetime1;
        int var5Lifetime2;
        int var6Lifetime2;
        int var2Lifetime1Lifetime1;
        int var4_intLifetime1Lifetime1;
        int var5Lifetime1Lifetime1;
        int var5Lifetime1Lifetime2;
        int var6Lifetime1Lifetime1;
        int var6Lifetime1Lifetime2;
        int var7Lifetime1Lifetime1;
        int var7Lifetime1Lifetime2;
        int var8Lifetime1Lifetime1;
        int var8Lifetime1Lifetime2;
        int var9Lifetime1Lifetime1;
        int var9Lifetime1Lifetime2;
        int var10Lifetime1Lifetime1;
        int var10Lifetime1Lifetime2;
        int var11Lifetime1Lifetime1;
        int var11Lifetime1Lifetime2;
        int var12Lifetime1Lifetime1;
        int var12Lifetime1Lifetime2;
        String var4Lifetime1;
        String var19Lifetime1;
        String var19Lifetime2;
        String var19Lifetime3;
        String var19Lifetime4;
        String var4Lifetime1Lifetime1;
        String var4Lifetime1Lifetime2;
        int var5Lifetime1Lifetime3;
        int var6Lifetime1Lifetime3;
        int var4_intLifetime1Lifetime1Lifetime1;
        int var5Lifetime1Lifetime1Lifetime1;
        int var5Lifetime1Lifetime1Lifetime2;
        int var5Lifetime1Lifetime1Lifetime3;
        int var6Lifetime1Lifetime1Lifetime1;
        int var6Lifetime1Lifetime1Lifetime2;
        int var6Lifetime1Lifetime1Lifetime3;
        int var7Lifetime1Lifetime1Lifetime1;
        int var7Lifetime1Lifetime1Lifetime2;
        int var8Lifetime1Lifetime1Lifetime1;
        int var8Lifetime1Lifetime1Lifetime2;
        int var9Lifetime1Lifetime1Lifetime1;
        int var9Lifetime1Lifetime1Lifetime2;
        int var10Lifetime1Lifetime1Lifetime1;
        int var10Lifetime1Lifetime1Lifetime2;
        int var11Lifetime1Lifetime1Lifetime1;
        int var11Lifetime1Lifetime1Lifetime2;
        int var12Lifetime1Lifetime1Lifetime1;
        int var12Lifetime1Lifetime1Lifetime2;
        int var5Lifetime1Lifetime1Lifetime4;
        int var6Lifetime1Lifetime1Lifetime4;
        int var5Lifetime1Lifetime1Lifetime1Lifetime1;
        int var6Lifetime1Lifetime1Lifetime1Lifetime1;
        if (null != MatchingFieldValidator.field_g) {
          MatchingFieldValidator.field_g.renderSession((byte) 120, param1);
          if (null != ProxyAuthenticationException.field_a) {
            ProxyAuthenticationException.field_a.renderSession((byte) 111, param1);
          }
          if (SetShipTeamAction.field_f &&
            GetMessageFadetime.field_o &&
            MatchingFieldValidator.field_g != null) {
            if (GetThrusterSmallForce.field_o) {
              if (!MatchingFieldValidator.field_g.networked &&
                !GraphicsPresentException.field_a) {
                stackIn_20_0 = 0;
              } else {
                if (SetFightersPerPlayerMaximum.chatInputActive) {
                  stackIn_20_0 = (OpenGlPbuffer.isChatInputDialogInitialized(0)) ? 1 : 0;
                } else {
                  stackIn_20_0 = 0;
                }
              }
            } else {
              stackIn_20_0 = 0;
            }
            var2 = stackIn_20_0;
            stackIn_25_0 = (param1) && (SetSalvoDamageMultiplier.e(51)) && (var2 == 0);
            SpawnPointFactory.drawLobbyAndSocialOverlays(stackIn_25_0, true);
            var14 = ToolkitRasterStateCache.getStateStack(GetDebrisGroupColour.field_r, true);
            if (OpenGlTexture1D.field_i) {
              var4_int = SetToggledScoreboard.field_o.screenY;
              if (!LegacyOpenGlTurbulenceEffect.quickChatMenuOpen) {
                if (GetReverbDry.isSocialDialogOpen((byte) 105)) {
                  var4_int = SoftwareRasterizer2D.height;
                  GetAiRepairTime.e(-22);
                }
              } else {
                var4_int = SoftwareRasterizer2D.height;
                GetAiRepairTime.e(-97);
              }
              if (SoftwareRasterizer2D.height > var4_int) {
                var5 = (PartitionZoneFactory.field_a - SoftwareRasterizer2D.width) / 2;
                var6 = -SoftwareRasterizer2D.height + var4_int + MissionVariableFactory.field_a;
                GetDebrisGroupColour.field_r.writePixels(var5, var6, SoftwareRasterizer2D.width, -var4_int + SoftwareRasterizer2D.height, SoftwareRasterizer2D.pixels, var4_int * SoftwareRasterizer2D.width, SoftwareRasterizer2D.width);
              }
            }
            if (var2 != 0) {
              if (GpuSprite.field_e) {
                stackIn_38_0 = SetFighterBayAimspeed.field_p;
              } else {
                stackIn_38_0 = OpenGlByteTextureFactory.field_b;
              }
              var13 = stackIn_38_0;
              var4 = var13;
              stackIn_42_0 = (param1) && (SetSalvoDamageMultiplier.e(param0 + 30499));
              ModalStack.a(stackIn_42_0, var13, -73);
              if (OpenGlTexture1D.field_i) {
                var5Lifetime2 = SetLaserEnergyUsed.getOverlayClipLeft((byte) -47);
                var6Lifetime2 = PolygonContainment.getOverlayClipTop((byte) 120);
                var7 = DirectByteStorage.getOverlayClipWidth(false);
                var8 = SetArmageddonWarning.getOverlayClipHeight(param0 + 57974);
                var9 = (PartitionZoneFactory.field_a - SoftwareRasterizer2D.width) / 2;
                var10 = (-SoftwareRasterizer2D.height + MissionVariableFactory.field_a) / 2;
                var11 = var5Lifetime2 + var9;
                var12 = var6Lifetime2 + var10;
                var14.pushClip(var11, var7 + var11, var12, var8 + var12, (byte) -70);
                GetDebrisGroupColour.field_r.writePixels(var11 - var5Lifetime2, var12, SoftwareRasterizer2D.width, var8, SoftwareRasterizer2D.pixels, SoftwareRasterizer2D.width * var6Lifetime2, SoftwareRasterizer2D.width);
                var14.pop(true);
              }
            }
          }
          if (param0 != -30428) {
            field_b = (String) null;
          }
          return;
        }
        if (null != ProxyAuthenticationException.field_a) {
          ProxyAuthenticationException.field_a.renderSession((byte) 111, param1);
        }
        if (SetShipTeamAction.field_f &&
          GetMessageFadetime.field_o &&
          MatchingFieldValidator.field_g != null) {
          if (GetThrusterSmallForce.field_o) {
            if (MatchingFieldValidator.field_g.networked) {
              if (SetFightersPerPlayerMaximum.chatInputActive) {
                stackIn_108_0 = (!OpenGlPbuffer.isChatInputDialogInitialized(0)) ? 0 : 1;
              } else {
                stackIn_108_0 = 0;
              }
            } else {
              if (GraphicsPresentException.field_a) {
                if (SetFightersPerPlayerMaximum.chatInputActive) {
                  stackIn_74_0 = (OpenGlPbuffer.isChatInputDialogInitialized(0)) ? 1 : 0;
                } else {
                  stackIn_74_0 = 0;
                }
                var2Lifetime1 = stackIn_74_0;
                stackIn_79_0 = (param1) && (SetSalvoDamageMultiplier.e(51)) && (var2Lifetime1 == 0);
                SpawnPointFactory.drawLobbyAndSocialOverlays(stackIn_79_0, true);
                var16 = ToolkitRasterStateCache.getStateStack(GetDebrisGroupColour.field_r, true);
                if (OpenGlTexture1D.field_i) {
                  var4_intLifetime1 = SetToggledScoreboard.field_o.screenY;
                  if (!LegacyOpenGlTurbulenceEffect.quickChatMenuOpen) {
                    if (GetReverbDry.isSocialDialogOpen((byte) 105)) {
                      var4_intLifetime1 = SoftwareRasterizer2D.height;
                      GetAiRepairTime.e(-22);
                    }
                  } else {
                    var4_intLifetime1 = SoftwareRasterizer2D.height;
                    GetAiRepairTime.e(-97);
                  }
                  if (SoftwareRasterizer2D.height > var4_intLifetime1) {
                    var5Lifetime1 = (PartitionZoneFactory.field_a - SoftwareRasterizer2D.width) / 2;
                    var6Lifetime1 = -SoftwareRasterizer2D.height + var4_intLifetime1 + MissionVariableFactory.field_a;
                    GetDebrisGroupColour.field_r.writePixels(var5Lifetime1, var6Lifetime1, SoftwareRasterizer2D.width, -var4_intLifetime1 + SoftwareRasterizer2D.height, SoftwareRasterizer2D.pixels, var4_intLifetime1 * SoftwareRasterizer2D.width, SoftwareRasterizer2D.width);
                  }
                }
                if (var2Lifetime1 != 0) {
                  if (GpuSprite.field_e) {
                    stackIn_92_0 = SetFighterBayAimspeed.field_p;
                  } else {
                    stackIn_92_0 = OpenGlByteTextureFactory.field_b;
                  }
                  var15 = stackIn_92_0;
                  var4Lifetime1 = var15;
                  stackIn_96_0 = (param1) && (SetSalvoDamageMultiplier.e(param0 + 30499));
                  ModalStack.a(stackIn_96_0, var15, -73);
                  if (OpenGlTexture1D.field_i) {
                    var5Lifetime1Lifetime3 = SetLaserEnergyUsed.getOverlayClipLeft((byte) -47);
                    var6Lifetime1Lifetime3 = PolygonContainment.getOverlayClipTop((byte) 120);
                    var7Lifetime1 = DirectByteStorage.getOverlayClipWidth(false);
                    var8Lifetime1 = SetArmageddonWarning.getOverlayClipHeight(param0 + 57974);
                    var9Lifetime1 = (PartitionZoneFactory.field_a - SoftwareRasterizer2D.width) / 2;
                    var10Lifetime1 = (-SoftwareRasterizer2D.height + MissionVariableFactory.field_a) / 2;
                    var11Lifetime1 = var5Lifetime1Lifetime3 + var9Lifetime1;
                    var12Lifetime1 = var6Lifetime1Lifetime3 + var10Lifetime1;
                    var16.pushClip(var11Lifetime1, var7Lifetime1 + var11Lifetime1, var12Lifetime1, var8Lifetime1 + var12Lifetime1, (byte) -70);
                    GetDebrisGroupColour.field_r.writePixels(var11Lifetime1 - var5Lifetime1Lifetime3, var12Lifetime1, SoftwareRasterizer2D.width, var8Lifetime1, SoftwareRasterizer2D.pixels, SoftwareRasterizer2D.width * var6Lifetime1Lifetime3, SoftwareRasterizer2D.width);
                    var16.pop(true);
                  }
                }
                if (param0 != -30428) {
                  field_b = (String) null;
                }
                return;
              }
              stackIn_108_0 = 0;
            }
          } else {
            stackIn_108_0 = 0;
          }
          var2Lifetime1Lifetime1 = stackIn_108_0;
          stackIn_113_0 = (param1) && (SetSalvoDamageMultiplier.e(51)) && (var2Lifetime1Lifetime1 == 0);
          SpawnPointFactory.drawLobbyAndSocialOverlays(stackIn_113_0, true);
          var18 = ToolkitRasterStateCache.getStateStack(GetDebrisGroupColour.field_r, true);
          var3 = var18;
          if (OpenGlTexture1D.field_i) {
            var4_intLifetime1Lifetime1 = SetToggledScoreboard.field_o.screenY;
            if (LegacyOpenGlTurbulenceEffect.quickChatMenuOpen) {
              var4_intLifetime1Lifetime1 = SoftwareRasterizer2D.height;
              GetAiRepairTime.e(-97);
              if (SoftwareRasterizer2D.height > var4_intLifetime1Lifetime1) {
                var5Lifetime1Lifetime1 = (PartitionZoneFactory.field_a - SoftwareRasterizer2D.width) / 2;
                var6Lifetime1Lifetime1 = -SoftwareRasterizer2D.height + var4_intLifetime1Lifetime1 + MissionVariableFactory.field_a;
                GetDebrisGroupColour.field_r.writePixels(var5Lifetime1Lifetime1, var6Lifetime1Lifetime1, SoftwareRasterizer2D.width, -var4_intLifetime1Lifetime1 + SoftwareRasterizer2D.height, SoftwareRasterizer2D.pixels, var4_intLifetime1Lifetime1 * SoftwareRasterizer2D.width, SoftwareRasterizer2D.width);
              }
              if (var2Lifetime1Lifetime1 != 0) {
                if (GpuSprite.field_e) {
                  stackIn_122_0 = SetFighterBayAimspeed.field_p;
                } else {
                  stackIn_122_0 = OpenGlByteTextureFactory.field_b;
                }
                var17 = stackIn_122_0;
                var19 = var17;
                var4Lifetime1Lifetime1 = var19;
                var19Lifetime2 = var17;
                var4Lifetime1Lifetime1 = var19Lifetime2;
                var4Lifetime1Lifetime1 = var17;
                var19Lifetime3 = var4Lifetime1Lifetime1;
                var4Lifetime1Lifetime1 = var19Lifetime3;
                var19Lifetime4 = var4Lifetime1Lifetime1;
                var4Lifetime1Lifetime1 = var19Lifetime4;
                stackIn_126_0 = (param1) && (SetSalvoDamageMultiplier.e(param0 + 30499));
                ModalStack.a(stackIn_126_0, var17, -73);
                if (OpenGlTexture1D.field_i) {
                  var5Lifetime1Lifetime1Lifetime4 = SetLaserEnergyUsed.getOverlayClipLeft((byte) -47);
                  var6Lifetime1Lifetime1Lifetime4 = PolygonContainment.getOverlayClipTop((byte) 120);
                  var7Lifetime1Lifetime1 = DirectByteStorage.getOverlayClipWidth(false);
                  var8Lifetime1Lifetime1 = SetArmageddonWarning.getOverlayClipHeight(param0 + 57974);
                  var9Lifetime1Lifetime1 = (PartitionZoneFactory.field_a - SoftwareRasterizer2D.width) / 2;
                  var10Lifetime1Lifetime1 = (-SoftwareRasterizer2D.height + MissionVariableFactory.field_a) / 2;
                  var11Lifetime1Lifetime1 = var5Lifetime1Lifetime1Lifetime4 + var9Lifetime1Lifetime1;
                  var12Lifetime1Lifetime1 = var6Lifetime1Lifetime1Lifetime4 + var10Lifetime1Lifetime1;
                  var18.pushClip(var11Lifetime1Lifetime1, var7Lifetime1Lifetime1 + var11Lifetime1Lifetime1, var12Lifetime1Lifetime1, var8Lifetime1Lifetime1 + var12Lifetime1Lifetime1, (byte) -70);
                  GetDebrisGroupColour.field_r.writePixels(var11Lifetime1Lifetime1 - var5Lifetime1Lifetime1Lifetime4, var12Lifetime1Lifetime1, SoftwareRasterizer2D.width, var8Lifetime1Lifetime1, SoftwareRasterizer2D.pixels, SoftwareRasterizer2D.width * var6Lifetime1Lifetime1Lifetime4, SoftwareRasterizer2D.width);
                  var18.pop(true);
                }
              }
              if (param0 != -30428) {
                field_b = (String) null;
              }
              return;
            }
            if (!GetReverbDry.isSocialDialogOpen((byte) 105)) {
              if (SoftwareRasterizer2D.height > var4_intLifetime1Lifetime1) {
                var5Lifetime1Lifetime1Lifetime1 = (PartitionZoneFactory.field_a - SoftwareRasterizer2D.width) / 2;
                var6Lifetime1Lifetime1Lifetime1 = -SoftwareRasterizer2D.height + var4_intLifetime1Lifetime1 + MissionVariableFactory.field_a;
                GetDebrisGroupColour.field_r.writePixels(var5Lifetime1Lifetime1Lifetime1, var6Lifetime1Lifetime1Lifetime1, SoftwareRasterizer2D.width, -var4_intLifetime1Lifetime1 + SoftwareRasterizer2D.height, SoftwareRasterizer2D.pixels, var4_intLifetime1Lifetime1 * SoftwareRasterizer2D.width, SoftwareRasterizer2D.width);
              }
              if (var2Lifetime1Lifetime1 != 0) {
                if (GpuSprite.field_e) {
                  stackIn_140_0 = SetFighterBayAimspeed.field_p;
                } else {
                  stackIn_140_0 = OpenGlByteTextureFactory.field_b;
                }
                var19Lifetime1 = stackIn_140_0;
                var4Lifetime1Lifetime1 = var19Lifetime1;
                stackIn_144_0 = (param1) && (SetSalvoDamageMultiplier.e(param0 + 30499));
                ModalStack.a(stackIn_144_0, var19Lifetime1, -73);
                if (!OpenGlTexture1D.field_i) {
                  if (param0 != -30428) {
                    field_b = (String) null;
                  }
                  return;
                }
                var5Lifetime1Lifetime1Lifetime1Lifetime1 = SetLaserEnergyUsed.getOverlayClipLeft((byte) -47);
                var6Lifetime1Lifetime1Lifetime1Lifetime1 = PolygonContainment.getOverlayClipTop((byte) 120);
                var7Lifetime1Lifetime1Lifetime1 = DirectByteStorage.getOverlayClipWidth(false);
                var8Lifetime1Lifetime1Lifetime1 = SetArmageddonWarning.getOverlayClipHeight(param0 + 57974);
                var9Lifetime1Lifetime1Lifetime1 = (PartitionZoneFactory.field_a - SoftwareRasterizer2D.width) / 2;
                var10Lifetime1Lifetime1Lifetime1 = (-SoftwareRasterizer2D.height + MissionVariableFactory.field_a) / 2;
                var11Lifetime1Lifetime1Lifetime1 = var5Lifetime1Lifetime1Lifetime1Lifetime1 + var9Lifetime1Lifetime1Lifetime1;
                var12Lifetime1Lifetime1Lifetime1 = var6Lifetime1Lifetime1Lifetime1Lifetime1 + var10Lifetime1Lifetime1Lifetime1;
                var18.pushClip(var11Lifetime1Lifetime1Lifetime1, var7Lifetime1Lifetime1Lifetime1 + var11Lifetime1Lifetime1Lifetime1, var12Lifetime1Lifetime1Lifetime1, var8Lifetime1Lifetime1Lifetime1 + var12Lifetime1Lifetime1Lifetime1, (byte) -70);
                GetDebrisGroupColour.field_r.writePixels(var11Lifetime1Lifetime1Lifetime1 - var5Lifetime1Lifetime1Lifetime1Lifetime1, var12Lifetime1Lifetime1Lifetime1, SoftwareRasterizer2D.width, var8Lifetime1Lifetime1Lifetime1, SoftwareRasterizer2D.pixels, SoftwareRasterizer2D.width * var6Lifetime1Lifetime1Lifetime1Lifetime1, SoftwareRasterizer2D.width);
                var18.pop(true);
              }
              if (param0 == -30428) {
                return;
              }
              field_b = (String) null;
              return;
            }
            var4_intLifetime1Lifetime1Lifetime1 = SoftwareRasterizer2D.height;
            GetAiRepairTime.e(-22);
            if (SoftwareRasterizer2D.height <= var4_intLifetime1Lifetime1Lifetime1) {
              if (var2Lifetime1Lifetime1 != 0) {
                if (GpuSprite.field_e) {
                  stackIn_158_0 = SetFighterBayAimspeed.field_p;
                } else {
                  stackIn_158_0 = OpenGlByteTextureFactory.field_b;
                }
                var20 = stackIn_158_0;
                var4Lifetime1Lifetime1 = var20;
                stackIn_162_0 = (param1) && (SetSalvoDamageMultiplier.e(param0 + 30499));
                ModalStack.a(stackIn_162_0, var20, -73);
                if (OpenGlTexture1D.field_i) {
                  var5Lifetime1Lifetime1Lifetime2 = SetLaserEnergyUsed.getOverlayClipLeft((byte) -47);
                  var6Lifetime1Lifetime1Lifetime2 = PolygonContainment.getOverlayClipTop((byte) 120);
                  var7Lifetime1Lifetime1Lifetime2 = DirectByteStorage.getOverlayClipWidth(false);
                  var8Lifetime1Lifetime1Lifetime2 = SetArmageddonWarning.getOverlayClipHeight(param0 + 57974);
                  var9Lifetime1Lifetime1Lifetime2 = (PartitionZoneFactory.field_a - SoftwareRasterizer2D.width) / 2;
                  var10Lifetime1Lifetime1Lifetime2 = (-SoftwareRasterizer2D.height + MissionVariableFactory.field_a) / 2;
                  var11Lifetime1Lifetime1Lifetime2 = var5Lifetime1Lifetime1Lifetime2 + var9Lifetime1Lifetime1Lifetime2;
                  var12Lifetime1Lifetime1Lifetime2 = var6Lifetime1Lifetime1Lifetime2 + var10Lifetime1Lifetime1Lifetime2;
                  var18.pushClip(var11Lifetime1Lifetime1Lifetime2, var7Lifetime1Lifetime1Lifetime2 + var11Lifetime1Lifetime1Lifetime2, var12Lifetime1Lifetime1Lifetime2, var8Lifetime1Lifetime1Lifetime2 + var12Lifetime1Lifetime1Lifetime2, (byte) -70);
                  GetDebrisGroupColour.field_r.writePixels(var11Lifetime1Lifetime1Lifetime2 - var5Lifetime1Lifetime1Lifetime2, var12Lifetime1Lifetime1Lifetime2, SoftwareRasterizer2D.width, var8Lifetime1Lifetime1Lifetime2, SoftwareRasterizer2D.pixels, SoftwareRasterizer2D.width * var6Lifetime1Lifetime1Lifetime2, SoftwareRasterizer2D.width);
                  var18.pop(true);
                }
              }
              if (param0 == -30428) {
                return;
              }
              field_b = (String) null;
              return;
            }
            var5Lifetime1Lifetime1Lifetime3 = (PartitionZoneFactory.field_a - SoftwareRasterizer2D.width) / 2;
            var6Lifetime1Lifetime1Lifetime3 = -SoftwareRasterizer2D.height + var4_intLifetime1Lifetime1Lifetime1 + MissionVariableFactory.field_a;
            GetDebrisGroupColour.field_r.writePixels(var5Lifetime1Lifetime1Lifetime3, var6Lifetime1Lifetime1Lifetime3, SoftwareRasterizer2D.width, -var4_intLifetime1Lifetime1Lifetime1 + SoftwareRasterizer2D.height, SoftwareRasterizer2D.pixels, var4_intLifetime1Lifetime1Lifetime1 * SoftwareRasterizer2D.width, SoftwareRasterizer2D.width);
          }
          if (var2Lifetime1Lifetime1 != 0) {
            if (GpuSprite.field_e) {
              stackIn_177_0 = SetFighterBayAimspeed.field_p;
            } else {
              stackIn_177_0 = OpenGlByteTextureFactory.field_b;
            }
            var21 = stackIn_177_0;
            var4Lifetime1Lifetime2 = var21;
            stackIn_181_0 = (param1) && (SetSalvoDamageMultiplier.e(param0 + 30499));
            ModalStack.a(stackIn_181_0, var21, -73);
            if (!OpenGlTexture1D.field_i) {
              if (param0 == -30428) {
                return;
              }
              field_b = (String) null;
              return;
            }
            var5Lifetime1Lifetime2 = SetLaserEnergyUsed.getOverlayClipLeft((byte) -47);
            var6Lifetime1Lifetime2 = PolygonContainment.getOverlayClipTop((byte) 120);
            var7Lifetime1Lifetime2 = DirectByteStorage.getOverlayClipWidth(false);
            var8Lifetime1Lifetime2 = SetArmageddonWarning.getOverlayClipHeight(param0 + 57974);
            var9Lifetime1Lifetime2 = (PartitionZoneFactory.field_a - SoftwareRasterizer2D.width) / 2;
            var10Lifetime1Lifetime2 = (-SoftwareRasterizer2D.height + MissionVariableFactory.field_a) / 2;
            var11Lifetime1Lifetime2 = var5Lifetime1Lifetime2 + var9Lifetime1Lifetime2;
            var12Lifetime1Lifetime2 = var6Lifetime1Lifetime2 + var10Lifetime1Lifetime2;
            var18.pushClip(var11Lifetime1Lifetime2, var7Lifetime1Lifetime2 + var11Lifetime1Lifetime2, var12Lifetime1Lifetime2, var8Lifetime1Lifetime2 + var12Lifetime1Lifetime2, (byte) -70);
            GetDebrisGroupColour.field_r.writePixels(var11Lifetime1Lifetime2 - var5Lifetime1Lifetime2, var12Lifetime1Lifetime2, SoftwareRasterizer2D.width, var8Lifetime1Lifetime2, SoftwareRasterizer2D.pixels, SoftwareRasterizer2D.width * var6Lifetime1Lifetime2, SoftwareRasterizer2D.width);
            var18.pop(true);
          }
        }
        if (param0 == -30428) {
          return;
        }
        field_b = (String) null;
    }

    public static void clearSharedReferences(int param0) {
        field_a = null;
        field_b = null;
        if (param0 > -36) {
          field_a = (String) null;
        }
    }

    static {
        field_b = "Accept";
        field_a = "Names cannot contain consecutive spaces";
    }
}
