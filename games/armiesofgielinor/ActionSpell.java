/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class ActionSpell extends Spell {
    static int field_j;
    static String field_i;
    static String field_l;
    private ActionRequest request;
    static String field_k;
    private PreparedAction preparedAction;
    static String field_f;
    static fj field_e;

    public static void a(boolean param0) {
        field_e = null;
        if (param0) {
          return;
        }
        field_i = null;
        field_k = null;
        field_f = null;
        field_l = null;
    }

    final static void a(java.applet.Applet param0, int param1, String param2) {
        try {
          java.net.URL var3 = null;
          Exception var3_ref = null;
          RuntimeException var3_ref2 = null;
          RuntimeException stackIn_8_0 = null;
          StringBuilder stackIn_8_1 = null;
          String stackIn_9_2 = null;
          StringBuilder stackIn_11_1 = null;
          String stackIn_12_2 = null;
          Throwable decompiledCaughtException = null;
          try {
            if (param1 >= -68) {
              return;
            }
            try {
              var3 = new java.net.URL(param0.getCodeBase(), param2);
              var3 = ck.a(-3780, var3, param0);
              SpellCastAction.a(param0, -109, var3.toString(), true);
              return;
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var3_ref = (Exception) (Object) decompiledCaughtException;
              var3_ref.printStackTrace();
              return;
            }
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var3_ref2 = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_8_0 = var3_ref2;
            stackIn_8_1 = new StringBuilder().append("ra.J(");
            if (param0 == null) {
              stackIn_9_2 = "null";
            } else {
              stackIn_9_2 = "{...}";
            }
            stackIn_11_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param1).append(',');
            if (param2 == null) {
              stackIn_12_2 = "null";
            } else {
              stackIn_12_2 = "{...}";
            }
            throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static void submitCampaignResult(int obfuscationGuard, int damageTaken, CampaignMission mission, boolean hasLostUnit, int candidateScore, int turnsTaken) {
        CipherPacketBuffer stackIn_32_0 = null;
        int stackIn_32_1 = 0;
        int stackIn_33_2 = 0;
        RuntimeException stackIn_39_0 = null;
        StringBuilder stackIn_39_1 = null;
        String stackIn_40_2 = null;
        RuntimeException decompiledCaughtException = null;
        int campaignIndex = 0;
        RuntimeException var6 = null;
        int missionId = 0;
        int mutationSelector = 0;
        int mutationVariant = 0;
        int var10 = 0;
        var10 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          if (DamageEvent.g(117)) {
            return;
          }
          campaignIndex = mission.campaign.campaignIndex;
          missionId = mission.missionId;
          MoveEvent.campaignMenu.updateMissionScore(missionId, (byte) 33, candidateScore);
          if (!(pg.playerProfile.campaignProgress.getMissionScore(campaignIndex, -63, missionId) >= candidateScore) ||
            candidateScore == 1) {
            if (1 < candidateScore) {
              hc.field_b = hc.field_b + 1;
              hc.field_b = hc.field_b + (ko.pointerY ^ AiPlanningStrategy.pointerX);
              hc.field_b = Math.abs(hc.field_b);
              mutationSelector = hc.field_b % 8;
              mutationVariant = mutationSelector;
              if (0 == mutationVariant) {
                cg.campaignPacketWord2 = cg.campaignPacketWord2 + 1;
                kw.campaignPacketWord0 = kw.campaignPacketWord0 - wr.campaignPacketWord3;
              } else {
                if (1 == mutationVariant) {
                  wr.campaignPacketWord3 = wr.campaignPacketWord3 + 1;
                  ii.campaignPacketWord1 = ii.campaignPacketWord1 + cg.campaignPacketWord2;
                } else {
                  if (mutationVariant == 2) {
                    ii.campaignPacketWord1 = ii.campaignPacketWord1 + 1;
                    kw.campaignPacketWord0 = kw.campaignPacketWord0 + 1;
                  } else {
                    if (mutationVariant != 3) {
                      if (mutationVariant != 4) {
                        if (5 != mutationVariant) {
                          if (mutationVariant != 6) {
                            if (7 != mutationVariant) {
                              throw new IllegalStateException("");
                            }
                            ii.campaignPacketWord1 = ii.campaignPacketWord1 - cg.campaignPacketWord2;
                            wr.campaignPacketWord3 = wr.campaignPacketWord3 - 1;
                          } else {
                            kw.campaignPacketWord0 = kw.campaignPacketWord0 + wr.campaignPacketWord3;
                            cg.campaignPacketWord2 = cg.campaignPacketWord2 - 1;
                          }
                        } else {
                          cg.campaignPacketWord2 = cg.campaignPacketWord2 + 1;
                          kw.campaignPacketWord0 = kw.campaignPacketWord0 - wr.campaignPacketWord3;
                        }
                      } else {
                        ii.campaignPacketWord1 = ii.campaignPacketWord1 + cg.campaignPacketWord2;
                        wr.campaignPacketWord3 = wr.campaignPacketWord3 + 1;
                      }
                    } else {
                      kw.campaignPacketWord0 = kw.campaignPacketWord0 + BattleTutorial.pointerPressX;
                      ii.campaignPacketWord1 = ii.campaignPacketWord1 + BattleTutorial.pointerPressX;
                    }
                  }
                }
              }
            }
            pg.playerProfile.campaignProgress.setResult(65535, missionId, turnsTaken, campaignIndex, damageTaken);
            vl.outgoingPacket.writeCipheredOpcode(32161, 79);
            vl.outgoingPacket.writeByte(obfuscationGuard - 3, campaignIndex);
            vl.outgoingPacket.writeByte(1, missionId);
            vl.outgoingPacket.writeShort(true, candidateScore);
            vl.outgoingPacket.writeShort(true, turnsTaken);
            vl.outgoingPacket.writeShort(true, damageTaken);
            stackIn_32_0 = vl.outgoingPacket;
            stackIn_32_1 = 1;
            if (!hasLostUnit) {
              stackIn_33_2 = 0;
            } else {
              stackIn_33_2 = 1;
            }
            ((CipherPacketBuffer) (Object) stackIn_32_0).writeByte(stackIn_32_1, stackIn_33_2);
            vl.outgoingPacket.writeInt((byte) -108, km.getCampaignPacketWord0(-59));
            vl.outgoingPacket.writeInt((byte) -124, oq.getCampaignPacketWord1(false));
            vl.outgoingPacket.writeInt((byte) -59, RadialSummonItem.getCampaignPacketWord2(false));
            vl.outgoingPacket.writeInt((byte) -50, RevivalEvent.getCampaignPacketWord3(0));
          }
          qh.requestDeleteQuicksave((byte) 27);
          if (obfuscationGuard == 4) {
            return;
          }
          ActionSpell.b(true);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_39_0 = var6;
          stackIn_39_1 = new StringBuilder().append("ra.N(").append(obfuscationGuard).append(',').append(damageTaken).append(',');
          if (mission == null) {
            stackIn_40_2 = "null";
          } else {
            stackIn_40_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_39_0), ((StringBuilder) (Object) stackIn_39_1).append(stackIn_40_2).append(',').append(hasLostUnit).append(',').append(candidateScore).append(',').append(turnsTaken).append(')').toString());
        }
    }

    final static void a(int param0, int param1, int param2) {
        bn.field_b = param0;
        ce.field_N = param0;
        dt.field_a = param2;
        MatchSetupPanel.field_D = param2;
        tq.field_a = true;
        so.field_b = null;
        int[] var4 = (int[]) null;
        SoftwareRaster.a((int[]) null, 0, 0);
        so.field_b = rj.a(param0, param2, 1423111778, (java.awt.Component) ((Object) IndexedSpriteBase.field_b));
        so.field_b.a(param1 - 17900);
        ContextualRuntimeException.a((byte) -85, param0 / 2, param2 / 2);
        if (param1 == 23505) {
          MeshObject.a(-8994, param0, param2);
          CampaignMission.a(param2, -22696, param0);
          pt.c(param0 / 2, param2 / 2, 9);
          return;
        }
        ActionSpell.a(-106, -34, -122);
        MeshObject.a(-8994, param0, param2);
        CampaignMission.a(param2, -22696, param0);
        pt.c(param0 / 2, param2 / 2, 9);
    }

    ActionSpell(int spellId, ActionRequest request) {
        super(spellId);
        try {
          this.request = request;
          if (this.spellId == 36) {
            this.request.allowOtherPlayer = true;
          }
          this.request.spellId = spellId;
        } catch (RuntimeException runtimeException) {
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) runtimeException), "ra.<init>(" + spellId + ',' + (request != null ? "{...}" : "null") + ')');
        }
    }

    final void applyEffect(int castingPlayer, Battlefield battlefield, int obfuscationGuard) {
        try {
          if (obfuscationGuard != 26123) {
            Battlefield var5 = (Battlefield) null;
            this.finishEffect((Battlefield) null, 42);
          }
        } catch (RuntimeException runtimeException) {
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) runtimeException), "ra.A(" + castingPlayer + ',' + (battlefield != null ? "{...}" : "null") + ',' + obfuscationGuard + ')');
        }
    }

    final int getPayloadSize(int obfuscationGuard) {
        if (obfuscationGuard != 25365) {
          PacketBuffer var3 = (PacketBuffer) null;
          this.writePayload(-112, (PacketBuffer) null);
          return 2;
        }
        return 2;
    }

    final void finishEffect(Battlefield battlefield, int obfuscationGuard) {
        RuntimeException var3 = null;
        CampaignMission var4 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (null != this.preparedAction) {
            this.preparedAction.applyToBattlefield(64, battlefield);
            this.preparedAction = null;
          }
          if (obfuscationGuard == -1700635440) {
            return;
          }
          var4 = (CampaignMission) null;
          ActionSpell.submitCampaignResult(112, -111, (CampaignMission) null, true, 116, 78);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_7_0 = var3;
          stackIn_7_1 = new StringBuilder().append("ra.G(");
          if (battlefield == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(obfuscationGuard).append(')').toString());
        }
    }

    final void prepareEffect(byte obfuscationGuard, Battlefield battlefield) {
        try {
          this.preparedAction = this.request.prepareAction(obfuscationGuard ^ -26, battlefield);
          if (obfuscationGuard != -37) {
            Battlefield var4 = (Battlefield) null;
            this.finishEffect((Battlefield) null, -62);
          }
        } catch (RuntimeException runtimeException) {
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) runtimeException), "ra.D(" + obfuscationGuard + ',' + (battlefield != null ? "{...}" : "null") + ')');
        }
    }

    final void writePayload(int obfuscationGuard, PacketBuffer packet) {
        try {
          packet.writeShort(true, this.spellId);
          if (obfuscationGuard != -11637) {
            field_i = (String) null;
          }
        } catch (RuntimeException runtimeException) {
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) runtimeException), "ra.E(" + obfuscationGuard + ',' + (packet != null ? "{...}" : "null") + ')');
        }
    }

    final static void writePlayerAdmissionRequest(long accountId, int packetOpcode, int command) {
        CipherPacketBuffer var4 = vl.outgoingPacket;
        var4.writeCipheredOpcode(32161, packetOpcode);
        var4.position = var4.position + 1;
        int var5 = var4.position;
        var4.writeByte(1, command);
        var4.writeLong(accountId, command ^ 38359638);
        var4.writeByteLengthPrefix(-var5 + var4.position, 5930);
    }

    final static int b(boolean param0) {
        if (param0) {
          return 1900 + new Date().getYear();
        }
        ActionSpell.b(false);
        return 1900 + new Date().getYear();
    }

    static {
        field_j = 0;
        field_i = "All players have left <%0>'s game.";
        field_k = "You must capture a village before you can use Fortify on it.";
        field_f = "This is your RuneScape clan if you have one.";
        field_l = "You have been removed from <%0>'s game.";
        field_e = null;
    }
}
