/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class CampaignMission extends IntrusiveNode implements TaggedFieldReader {
    int flags;
    int rewardSpellId;
    static String field_s;
    static long[] field_r;
    int mapTheme;
    int musicId;
    private MapLayout cachedLayout;
    static String field_p;
    private int field_A;
    String description;
    int[] rewardUnitTypes;
    int scoreTurnTarget;
    int manaBonusPercent;
    int[] participantIds;
    int[] neighborMissionIds;
    static el field_I;
    int mapSizeSetting;
    int missionId;
    CampaignDefinition campaign;
    ResourceArchive mapArchive;
    int difficulty;
    int playerSlot;
    int scoreDamageTarget;
    private int[] teamAssignments;
    String name;
    private int mapResourceId;

    public final void decodeTaggedField(int encodedLength, CipherPacketBuffer packet, String fieldName, byte obfuscationGuard) {
        RuntimeException stackIn_91_0 = null;
        StringBuilder stackIn_91_1 = null;
        String stackIn_92_2 = null;
        StringBuilder stackIn_94_1 = null;
        String stackIn_95_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        var7 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          if (obfuscationGuard != 37) {
            this.createRewardPreview(-112);
          }
          if (!fieldName.equals("id")) {
            if (fieldName.equals("flg")) {
              if (encodedLength <= 0) {
                return;
              }
              this.flags = (int)tn.readTaggedInteger(false, encodedLength, packet);
            } else {
              if (fieldName.equals("name")) {
                if (encodedLength <= 0) {
                  return;
                }
                this.name = PortalLossCondition.a(packet, encodedLength, (byte) -82);
                return;
              }
              if (!fieldName.equals("key")) {
                if (fieldName.equals("pos")) {
                  if (encodedLength > 0) {
                    this.playerSlot = (int)tn.readTaggedInteger(false, encodedLength, packet);
                    return;
                  }
                } else {
                  if (!fieldName.equals("w")) {
                    if (fieldName.equals("h")) {
                      if (0 >= encodedLength) {
                        return;
                      }
                      tn.readTaggedInteger(false, encodedLength, packet);
                      return;
                    }
                    if (!fieldName.equals("mid")) {
                      if (fieldName.equals("ngb")) {
                        if (encodedLength <= 0) {
                          return;
                        }
                        var5_int = ai.readCompactInt(packet, true);
                        this.neighborMissionIds = new int[var5_int];
                        for (var6 = 0; var6 < var5_int; var6++) {
                          this.neighborMissionIds[var6] = (int)tn.readTaggedInteger(false, 2, packet);
                        }
                      } else {
                        if (fieldName.equals("mpsz")) {
                          if (0 < encodedLength) {
                            this.mapSizeSetting = (int)tn.readTaggedInteger(false, encodedLength, packet);
                            return;
                          }
                        } else {
                          if (!fieldName.equals("mpt")) {
                            if (fieldName.equals("ptc")) {
                              if (encodedLength <= 0) {
                                return;
                              }
                              var5_int = ai.readCompactInt(packet, true);
                              this.participantIds = new int[var5_int];
                              for (var6 = 0; var5_int > var6; var6++) {
                                this.participantIds[var6] = (int)tn.readTaggedInteger(false, 2, packet);
                              }
                            } else {
                              if (!fieldName.equals("rwd")) {
                                if (fieldName.equals("mbr")) {
                                  if (0 >= encodedLength) {
                                    return;
                                  }
                                  this.manaBonusPercent = (int)tn.readTaggedInteger(false, encodedLength, packet);
                                  return;
                                }
                                if (fieldName.equals("tr")) {
                                  if (encodedLength <= 0) {
                                    return;
                                  }
                                  this.rewardSpellId = (int)tn.readTaggedInteger(false, encodedLength, packet);
                                  return;
                                }
                                if (!fieldName.equals("df")) {
                                  if (fieldName.equals("dsc")) {
                                    if (0 >= encodedLength) {
                                      return;
                                    }
                                    this.description = PortalLossCondition.a(packet, encodedLength, (byte) -119);
                                    return;
                                  }
                                  if (fieldName.equals("gt")) {
                                    if (0 >= encodedLength) {
                                      return;
                                    }
                                    this.scoreTurnTarget = (int)tn.readTaggedInteger(false, encodedLength, packet);
                                    return;
                                  }
                                  if (fieldName.equals("gd")) {
                                    if (encodedLength > 0) {
                                      this.scoreDamageTarget = (int)tn.readTaggedInteger(false, encodedLength, packet);
                                      return;
                                    }
                                  } else {
                                    if (fieldName.equals("ach")) {
                                      if (0 >= encodedLength) {
                                        return;
                                      }
                                      tn.readTaggedInteger(false, encodedLength, packet);
                                      return;
                                    }
                                    if (fieldName.equals("song")) {
                                      if (encodedLength > 0) {
                                        this.musicId = (int)tn.readTaggedInteger(false, encodedLength, packet);
                                        return;
                                      }
                                    } else {
                                      if (!fieldName.equals("team")) {
                                        return;
                                      }
                                      if (encodedLength > 0) {
                                        var5_int = ai.readCompactInt(packet, true);
                                        this.teamAssignments = new int[var5_int];
                                        for (var6 = 0; var5_int > var6; var6++) {
                                          this.teamAssignments[var6] = (int)tn.readTaggedInteger(false, 2, packet);
                                        }
                                      }
                                    }
                                  }
                                } else {
                                  if (0 < encodedLength) {
                                    this.difficulty = (int)tn.readTaggedInteger(false, encodedLength, packet);
                                    return;
                                  }
                                }
                              } else {
                                if (encodedLength > 0) {
                                  var5_int = ai.readCompactInt(packet, true);
                                  this.rewardUnitTypes = new int[var5_int];
                                  for (var6 = 0; var6 < var5_int; var6++) {
                                    this.rewardUnitTypes[var6] = (int)tn.readTaggedInteger(false, 2, packet);
                                  }
                                }
                              }
                            }
                          } else {
                            if (encodedLength > 0) {
                              this.mapTheme = (int)tn.readTaggedInteger(false, encodedLength, packet);
                              return;
                            }
                          }
                        }
                      }
                    } else {
                      if (0 < encodedLength) {
                        this.mapResourceId = (int)tn.readTaggedInteger(false, encodedLength, packet);
                        return;
                      }
                    }
                  } else {
                    if (encodedLength > 0) {
                      this.field_A = (int)tn.readTaggedInteger(false, encodedLength, packet);
                      return;
                    }
                  }
                }
              } else {
                if (encodedLength > 0) {
                  PortalLossCondition.a(packet, encodedLength, (byte) -82);
                  return;
                }
              }
            }
          } else {
            if (encodedLength > 0) {
              this.missionId = (int)tn.readTaggedInteger(false, encodedLength, packet);
              return;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_91_0 = var5;
          stackIn_91_1 = new StringBuilder().append("om.B(").append(encodedLength).append(',');
          if (packet == null) {
            stackIn_92_2 = "null";
          } else {
            stackIn_92_2 = "{...}";
          }
          stackIn_94_1 = ((StringBuilder) (Object) stackIn_91_1).append(stackIn_92_2).append(',');
          if (fieldName == null) {
            stackIn_95_2 = "null";
          } else {
            stackIn_95_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_91_0), ((StringBuilder) (Object) stackIn_94_1).append(stackIn_95_2).append(',').append(obfuscationGuard).append(')').toString());
        }
    }

    final MapLayout getMapLayout(int obfuscationGuard) {
        if (null == this.cachedLayout) {
          this.cachedLayout = this.loadMapLayout((byte) 92);
        }
        if (obfuscationGuard > -88) {
          this.musicId = 10;
        }
        return this.cachedLayout;
    }

    public static void f(int param0) {
        field_r = null;
        field_I = null;
        field_s = null;
        field_p = null;
        if (param0 != 0) {
          field_r = (long[]) null;
        }
    }

    private final MapLayout loadMapLayout(byte obfuscationGuard) {
        if (obfuscationGuard < 86) {
          CampaignMission.c((byte) 8);
        }
        byte[] var3 = this.mapArchive.getFile((byte) 76, this.mapResourceId, this.mapArchive.getGroupId(gk.field_O[this.campaign.campaignIndex], 102));
        byte[] var2 = var3;
        return new MapLayout(this.missionId, var3);
    }

    final String[] getParticipantNames(int obfuscationGuard) {
        int var3 = 0;
        String[] var2;
        CampaignParticipant var4;
        int var5;
        String[] var6;
        var5 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        if (obfuscationGuard != -23209) {
          return (String[]) null;
        }
        var6 = new String[this.participantIds.length];
        var2 = var6;
        for (var3 = 0; var6.length > var3; var3++) {
          if (var3 == this.playerSlot) {
            var6[var3] = this.campaign.localPlayerName;
          } else {
            var4 = this.campaign.participants[this.participantIds[var3]];
            var6[var3] = var4.displayName;
          }
        }
        return var2;
    }

    final int[] getTeamAssignments(byte obfuscationGuard) {
        int var2 = -73 % ((obfuscationGuard - 13) / 33);
        return this.teamAssignments;
    }

    final boolean requiresAllNeighborScores(byte obfuscationGuard) {
        if (obfuscationGuard <= 56) {
          return true;
        }
        return (this.flags & 2) != 0 ? true : false;
    }

    final CampaignRewardPreview createRewardPreview(int obfuscationGuard) {
        if (obfuscationGuard != -1) {
          this.createRewardPreview(-55);
        }
        return new CampaignRewardPreview(this.rewardUnitTypes, this.rewardSpellId, this.manaBonusPercent);
    }

    final static RgbSprite[] a(byte param0, String param1, String param2, ResourceArchive param3) {
        RgbSprite[] var4 = null;
        RuntimeException var4_ref = null;
        int var5 = 0;
        int var6 = 0;
        RgbSprite[] var7 = null;
        RgbSprite[] stackIn_5_0 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5Lifetime1;
        var6 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          var7 = fk.a(param1, (byte) -126, param3, param2);
          var4 = var7;
          for (var5 = 0; var5 < 9; var5++) {
            var7[var5].i();
          }
          var5Lifetime1 = -30 % ((2 - param0) / 55);
          stackIn_5_0 = var4;
          return stackIn_5_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_8_0 = var4_ref;
          stackIn_8_1 = new StringBuilder().append("om.H(").append(param0).append(',');
          if (param1 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          stackIn_11_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',');
          if (param2 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          stackIn_14_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',');
          if (param3 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(')').toString());
        }
    }

    final void a(boolean param0) {
        int var2 = 0;
        int var3 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        for (var2 = 0; var2 < hs.field_G.length; var2++) {
          if (hs.field_G[var2] == this.field_A) {
            this.mapSizeSetting = var2;
            break;
          }
        }
        if (!param0) {
          this.getTeamAssignments((byte) 40);
        }
    }

    final static void a(int param0, int param1, int param2) {
        if (param1 != -22696) {
          field_s = (String) null;
        }
        ij.field_x = param0;
        te.field_l = param2;
        if (null != SphinxActionRequest.field_v) {
          SphinxActionRequest.field_v.a(param2, param0, (byte) -14);
        }
    }

    final static gl c(byte param0) {
        if (param0 >= -11) {
          ResourceArchive var2 = (ResourceArchive) null;
          CampaignMission.a((byte) -102, (String) null, (String) null, (ResourceArchive) null);
        }
        return new gl(cn.e(488997228), QuickChatPhraseRepository.c(-104));
    }

    CampaignMission() {
        this.musicId = -1;
        this.rewardSpellId = -1;
        this.difficulty = 1;
    }

    static {
        field_s = "Unfortunately we are unable to create an account for you at this time.";
        field_p = "Blue_Team";
        field_r = new long[32];
    }
}
