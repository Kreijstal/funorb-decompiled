/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

public final class ArmiesOfGielinor extends wf {
    static String[] field_N;
    static int field_K;
    static PacketBuffer field_L;
    static String field_H;
    static BitmapFont field_J;
    static int[] field_I;
    public static boolean obfuscationControl;

    final void tickClient(byte obfuscationGuard) {
        boolean discarded$0 = false;
        int stackIn_10_1 = 0;
        boolean stackIn_11_2 = false;
        int stackIn_61_1 = 0;
        boolean stackIn_62_2 = false;
        int stackIn_119_0 = 0;
        boolean stackIn_120_1 = false;
        int stackIn_176_0 = 0;
        int stackIn_180_0 = 0;
        GameplayController stackIn_194_0;
        GameplayController stackIn_194_1;
        boolean stackIn_194_2;
        int stackIn_194_3;
        String[] stackIn_194_4;
        int stackIn_194_5;
        int stackIn_194_6;
        BattleGraphicsAssets stackIn_194_7;
        int stackIn_194_8;
        int stackIn_194_9;
        int stackIn_194_10;
        int stackIn_194_11;
        int stackIn_194_12;
        int stackIn_194_13;
        GameplayController stackIn_195_0 = null;
        GameplayController stackIn_195_1 = null;
        boolean stackIn_195_14 = false;
        int stackIn_256_0 = 0;
        int stackIn_337_0 = 0;
        int stackIn_337_1 = 0;
        int stackIn_348_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        Object var2 = null;
        CipherPacketBuffer var3_ref_bv = null;
        int var3 = 0;
        int[] var3_ref_int__ = null;
        int var4 = 0;
        int[] var4_ref_int__ = null;
        int var5_int = 0;
        int[] var5 = null;
        int var6 = 0;
        int var7 = 0;
        String[] var8 = null;
        int var9 = 0;
        int var10_int = 0;
        GameplayController var10 = null;
        int var11 = 0;
        int var2_intLifetime1;
        int var2_intLifetime2;
        int var3Lifetime1;
        int var4Lifetime1;
        int var5_intLifetime1;
        int var5_intLifetime2;
        int var6Lifetime1;
        int var7Lifetime1;
        int var3Lifetime2;
        int var4Lifetime2;
        int var4Lifetime3;
        int var2_intLifetime1Lifetime1;
        int var6Lifetime1Lifetime1;
        int var7Lifetime1Lifetime1;
        var11 = obfuscationControl ? 1 : 0;
        try {
          bs.a((byte) -127);
          r.field_u = MusicPatchPcmStream.getPointerIdleTicks(4);
          QuickChatHelpDialog.pumpAudioAndPruneSounds(128);
          if (FixedQuaternion.field_a != null &&
            FixedQuaternion.field_a.field_k) {
            ck.b(-127);
            oi.a(false);
          }
          stackIn_10_1 = 127;
          stackIn_11_2 = (FixedQuaternion.field_a != null);
          this.a(stackIn_10_1, stackIn_11_2);
          if (TextLineLayout.field_l) {
            this.p(17);
            TextLineLayout.field_l = false;
          }
          NanoGameClock.field_n = NanoGameClock.field_n + 1;
          if (obfuscationGuard > -111) {
            return;
          }
          if (PopupPresentation.h(31337)) {
            this.g((byte) 4);
            if (PopupPresentation.h(31337)) {
              if (AccountRequestResult.a((byte) 105)) {
                discarded$0 = this.c(-100, false);
              }
              return;
            }
          }
          boolean decompiledFrameRemainder0 = true;
          if (!DelayedPacket.field_q) {
            ii.a(el.field_d, (byte) -73);
            decompiledFrameRemainder0 = !(!this.c(102, true));
            if (decompiledFrameRemainder0) {
              this.r(-66);
              DelayedPacket.field_q = true;
              decompiledFrameRemainder0 = (var11 != 0);
            }
          }
          if (decompiledFrameRemainder0) {
            if (UiSelectionState.d(95)) {
              if (!ed.a(-83)) {
                if (DefeatPlayerConsoleCommand.e((byte) 89)) {
                  if (~pg.field_f != ~pg.field_e) {
                    this.d(0, false);
                    decompiledFrameRemainder0 = (var11 != 0);
                  }
                  if (decompiledFrameRemainder0) {
                    var2_int = PrintCoatConsoleCommand.h(-124);
                    if (1 == var2_int) {
                      vf.a(0, 0);
                    }
                    this.d(0, true);
                    decompiledFrameRemainder0 = (var11 != 0);
                  }
                }
                if (decompiledFrameRemainder0) {
                  this.d(0, false);
                  if (var11 != 0) {
                    stackIn_61_1 = 42;
                    stackIn_62_2 = (null != FixedQuaternion.field_a);
                    var2_int = this.a((byte) stackIn_61_1, stackIn_62_2);
                    if (1 == var2_int ||
                      var2_int == 2) {
                      if (null != FixedQuaternion.field_a) {
                        ck.b(-104);
                      }
                      if (var2_int == 2) {
                        CampaignResult.a((java.applet.Applet) (this), (byte) -3);
                      }
                    }
                    this.d(0, true);
                    DropdownSelector.f((byte) -67);
                  }
                }
              } else {
                stackIn_61_1 = 42;
                stackIn_62_2 = (null != FixedQuaternion.field_a);
                var2_int = this.a((byte) stackIn_61_1, stackIn_62_2);
                if (1 == var2_int ||
                  var2_int == 2) {
                  if (null != FixedQuaternion.field_a) {
                    ck.b(-104);
                  }
                  if (var2_int == 2) {
                    CampaignResult.a((java.applet.Applet) (this), (byte) -3);
                  }
                }
                this.d(0, true);
                if (var11 != 0) {
                  DropdownSelector.f((byte) -67);
                }
              }
            } else {
              DropdownSelector.f((byte) -67);
            }
          }
          boolean decompiledFrameCompleted0 = true;
          if (!DamageEvent.g(100)) {
            while (true) {
              var2 = (iw) (UnitInfoPopup.field_u.popFirst(0));
              if (var2 == null) {
                break;
              }
              SingleChildWidgetContainer.a(0, 4, (iw) (var2));
              if (var11 != 0) {
                decompiledFrameCompleted0 = false;
                break;
              }
            }
          }
          if (decompiledFrameCompleted0) {
            boolean decompiledNaturalLoopExit0 = false;
            while (!(decompiledNaturalLoopExit0 = (!DropdownArrowPainter.pollIncomingPacket((byte) 42, sh.opcodePayloadLengths)))) {
              stackIn_337_0 = MusicCrossfadeStream.deliveredOpcode;
              stackIn_337_1 = 9;
              if (var11 == 0) {
                if (stackIn_337_0 == stackIn_337_1) {
                  ut.i((byte) 123);
                  SpellCastAction.field_t = false;
                  CipherPacketBuffer.a(false, 11, 1, jt.field_a);
                  PaletteRegionMap.field_i = ByteStorage.incomingPacket.readNullTerminatedString(1);
                  continue;
                }
                if (MusicCrossfadeStream.deliveredOpcode == 14) {
                  RadialSummonItem.a(rs.nextPowerOfTwo((byte) 76, 8), DualNodeIterator.b((byte) -90), 150, CipherPacketBuffer.field_A, rs.nextPowerOfTwo((byte) 95, 1000), et.b(-1), 1024, 6, -84, sh.d((byte) 81));
                  ep.a(lp.b(-126), -72, km.c(0));
                  s.field_d = 0;
                  ValidatedTextWidget.field_Z = true;
                  SpellCastAction.field_t = false;
                  FaceNormal.field_d = true;
                  jt.field_a = -2;
                  TrianglePulse.selectMusicTrackWithDefaultGain(-16147, 50, DeployRequest.field_B, true);
                  continue;
                }
                if (MusicCrossfadeStream.deliveredOpcode == 15) {
                  if (FaceNormal.field_d) {
                    ut.i((byte) 124);
                    PacketBuffer.i((byte) 109);
                    NanoGameClock.b(22963);
                    SoftwareRaster.b();
                    CipherPacketBuffer.a(false, 0, 1, 0);
                    AiUnitPlanner.field_t = true;
                    du.field_h = false;
                    FaceNormal.field_d = false;
                    ModalDialogHost.field_H = false;
                    fj.field_c = false;
                    vs.field_j = true;
                    uc.a(0);
                  }
                  TrianglePulse.selectMusicTrackWithDefaultGain(-16147, 50, SocialListPanel.field_Ob, true);
                  ScrollContainer.field_Qb = false;
                  SpellCastAction.field_t = false;
                  continue;
                }
                if (MusicCrossfadeStream.deliveredOpcode == 10 &&
                  FaceNormal.field_d) {
                  QuickChatCategoryRepository.processLobbyUpdate((byte) -105);
                  continue;
                }
                if (MusicCrossfadeStream.deliveredOpcode == 11 ||
                  MusicCrossfadeStream.deliveredOpcode == 12) {
                  stackIn_119_0 = 96;
                  stackIn_120_1 = (12 == MusicCrossfadeStream.deliveredOpcode);
                  var2 = CommunityTabGroup.decodeChatMessageWithIntGuard(stackIn_119_0, stackIn_120_1);
                  if (((ChatMessage) (var2)).channelId == 4) {
                    if (null != rd.gameplayController) {
                      NodeHashTable.a(-1, rd.gameplayController.battlefield.a(((ChatMessage) (var2)).displayName, (byte) -64));
                    }
                    if (SectorCacheStore.field_a != null) {
                      NodeHashTable.a(-1, SectorCacheStore.field_a.battlefield.a(((ChatMessage) (var2)).displayName, (byte) -64));
                    }
                  }
                  MapLayout.acceptReceivedChatMessage((ChatMessage) (var2), -1);
                  continue;
                }
                if (MusicCrossfadeStream.deliveredOpcode == 74) {
                  var2 = ConsoleTextNode.field_n;
                  var3_ref_bv = ByteStorage.incomingPacket;
                  var4 = ((PacketBuffer) ((Object) var3_ref_bv)).readUnsignedByte(0);
                  var5_int = 0;
                  while (var5_int < var4) {
                    ((int[]) (var2))[var5_int] = ((PacketBuffer) ((Object) var3_ref_bv)).readInt(1);
                    var5_int++;
                  }
                  Unit.m(13);
                  continue;
                }
                if (MusicCrossfadeStream.deliveredOpcode == 75) {
                  var2 = ByteStorage.incomingPacket;
                  EffectPresentation.readCoatOfArms(ah.localCoat.parts, (PacketBuffer) (var2), false, ah.localCoat.colourIndices);
                  ClientUiNode.field_w = true;
                  continue;
                }
                if (81 == MusicCrossfadeStream.deliveredOpcode) {
                  var2_intLifetime1 = ByteStorage.incomingPacket.readUnsignedByte(0);
                  if (var2_intLifetime1 != 0) {
                    bu.storedQuicksave = new CampaignQuicksave(ByteStorage.incomingPacket, 9, true);
                    continue;
                  }
                  bu.storedQuicksave = null;
                  mv.field_b = true;
                  continue;
                }
                if (MusicCrossfadeStream.deliveredOpcode == 82) {
                  if (!bu.storedQuicksave.appendSnapshotChunk(fk.packetPayloadLength, -1, ByteStorage.incomingPacket)) {
                    continue;
                  }
                  mv.field_b = true;
                  continue;
                }
                if (MusicCrossfadeStream.deliveredOpcode == 80) {
                  pg.playerProfile = new PlayerProfile(ByteStorage.incomingPacket, true);
                  ve.field_b = true;
                  continue;
                }
                if (79 == MusicCrossfadeStream.deliveredOpcode) {
                  if (null == rd.gameplayController) {
                    continue;
                  }
                  rd.gameplayController.field_Bb = ByteStorage.incomingPacket.readInt(1);
                  continue;
                }
                if (MusicCrossfadeStream.deliveredOpcode == 64 ||
                  MusicCrossfadeStream.deliveredOpcode == 65) {
                  ut.i((byte) 123);
                  var2_intLifetime1Lifetime1 = ByteStorage.incomingPacket.readUnsignedByte(0);
                  var3 = ByteStorage.incomingPacket.readUnsignedByte(0);
                  stackIn_176_0 = ((1 & var3) == 0) ? 0 : 1;
                  var4Lifetime2 = stackIn_176_0;
                  stackIn_180_0 = ((var3 & 2) == 0) ? 0 : 1;
                  var5_intLifetime1 = stackIn_180_0;
                  var6 = (var3 & 30) >> 2;
                  var7 = 1 & var3 >> 6;
                  var8 = new String[ByteStorage.incomingPacket.readUnsignedByte(0)];
                  var9 = ByteStorage.incomingPacket.readByte((byte) 123);
                  var10_int = 0;
                  while (var8.length > var10_int) {
                    var8[var10_int] = ByteStorage.incomingPacket.readNullCircumfixedString((byte) 121);
                    stackIn_337_0 = ~MusicCrossfadeStream.deliveredOpcode;
                    stackIn_337_1 = -65;
                    if (stackIn_337_0 == stackIn_337_1 &&
                      gt.isLocalAccountName(var8[var10_int], (byte) 121)) {
                      var9 = var10_int;
                    }
                    var10_int++;
                  }
                  l.activeCampaignMission = null;
                  ChannelFadeTimeConsoleCommand.field_F = false;
                  PointerInputHandler.field_f = null;
                  stackIn_194_0 = null;
                  stackIn_194_1 = null;
                  stackIn_194_2 = true;
                  stackIn_194_3 = var2_intLifetime1Lifetime1;
                  stackIn_194_4 = var8;
                  stackIn_194_5 = var9;
                  stackIn_194_6 = var4Lifetime2;
                  stackIn_194_7 = LinkButtonPainter.field_f;
                  stackIn_194_8 = -1;
                  stackIn_194_9 = 0;
                  stackIn_194_10 = -1;
                  stackIn_194_11 = var5_intLifetime1;
                  stackIn_194_12 = var6;
                  stackIn_194_13 = var7;
                  if (2 > BufferedSocket.field_j) {
                    stackIn_195_0 = null;
                    stackIn_195_1 = null;
                    stackIn_195_14 = false;
                  } else {
                    stackIn_195_0 = null;
                    stackIn_195_1 = null;
                    stackIn_195_14 = true;
                  }
                  var10 = new GameplayController(stackIn_194_2, stackIn_194_3, stackIn_194_4, stackIn_194_5, stackIn_194_6 != 0, stackIn_194_7, stackIn_194_8, stackIn_194_9, stackIn_194_10, stackIn_194_11 != 0, stackIn_194_12, stackIn_194_13, stackIn_195_14, (CampaignMission) null);
                  if (MusicCrossfadeStream.deliveredOpcode != 64) {
                    SectorCacheStore.field_a = var10;
                    ModalDialogHost.field_H = true;
                  } else {
                    fj.field_c = true;
                    rd.gameplayController = var10;
                    ConsolePanel.a(true);
                    bw.d(7242);
                    pc.b((byte) 16);
                  }
                  SoftwareRaster.b();
                  CipherPacketBuffer.a(false, -1, 1, jt.field_a);
                  ScrollContainer.field_Qb = false;
                  MusicPatch.field_w = true;
                  continue;
                }
                if (66 == MusicCrossfadeStream.deliveredOpcode) {
                  if (fj.field_c ||
                    ModalDialogHost.field_H) {
                    if (fj.field_c &&
                      null != rd.gameplayController) {
                      rd.gameplayController.d(127, false);
                    }
                    ValidatedTextWidget.field_Z = true;
                    vs.field_j = true;
                    s.field_d = 0;
                    du.field_h = false;
                    CipherPacketBuffer.a(false, -2, 1, jt.field_a);
                    fj.field_c = false;
                    ModalDialogHost.field_H = false;
                    uc.a(0);
                  }
                  ScrollContainer.field_Qb = false;
                  continue;
                }
                var2 = null;
                if (!fj.field_c) {
                  if (ModalDialogHost.field_H) {
                    var2 = SectorCacheStore.field_a;
                  }
                } else {
                  var2 = rd.gameplayController;
                }
                if (var2 != null) {
                  if (MusicCrossfadeStream.deliveredOpcode == 77) {
                    ((GameplayController) (var2)).battlefield.appendSnapshotChunk(fk.packetPayloadLength, ByteStorage.incomingPacket, (byte) -81);
                    continue;
                  }
                  if (MusicCrossfadeStream.deliveredOpcode == 67) {
                    if (!((GameplayController) (var2)).battlefield.field_Ab) {
                      ((GameplayController) (var2)).battlefield.snapshotBuffer.position = 0;
                      ((GameplayController) (var2)).battlefield.readLegacySnapshot(0, ((GameplayController) (var2)).battlefield.snapshotBuffer);
                      ((GameplayController) (var2)).battlefield.snapshotBuffer = null;
                      mu.field_a = new cg();
                      ((GameplayController) (var2)).battleGraphicsAssets.selectTheme(((GameplayController) (var2)).battlefield.mapTheme, 0);
                      ((GameplayController) (var2)).field_d = UnitLossCondition.battlefieldThemes[((GameplayController) (var2)).battlefield.mapTheme].musicTrack;
                      oo.e(-387);
                      if (((GameplayController) (var2)).battlefield.field_D == 3) {
                        ((GameplayController) (var2)).rebuildSummonMenus(true);
                      }
                      ((GameplayController) (var2)).h(true);
                      hc.a(((GameplayController) (var2)).controlledPlayerId, false);
                      ((GameplayController) (var2)).battlefield.field_Ab = true;
                      if (((GameplayController) (var2)).controlledPlayerId <= -1) {
                        NodeHashTable.a(-1, op.field_c[0][0]);
                      } else {
                        NodeHashTable.a(-1, op.field_c[0][((GameplayController) (var2)).battlefield.getPlayerTeamIndex(((GameplayController) (var2)).controlledPlayerId, -1)]);
                      }
                    }
                    var3Lifetime2 = ByteStorage.incomingPacket.readUnsignedByte(0);
                    var4Lifetime3 = ByteStorage.incomingPacket.readUnsignedByte(0);
                    var5_intLifetime2 = ByteStorage.incomingPacket.readUnsignedShort((byte) -104);
                    if (((GameplayController) (var2)).battlefield.currentPlayer == var3Lifetime2 &&
                      var4Lifetime3 == ((GameplayController) (var2)).battlefield.turnNumber) {
                      stackIn_256_0 = 0;
                    } else {
                      stackIn_256_0 = 1;
                    }
                    var6Lifetime1 = stackIn_256_0;
                    if (var6Lifetime1 != 0) {
                      ((GameplayController) (var2)).field_Hb = NanoGameClock.field_n;
                      if (((GameplayController) (var2)).battlefield.field_X) {
                        continue;
                      }
                      ((GameplayController) (var2)).battlefield.pendingEvents.addLast((byte) -119, (IntrusiveNode) (new TurnChangeEvent(var4Lifetime3, var3Lifetime2)));
                      continue;
                    }
                    ((GameplayController) (var2)).spellConfirmation = null;
                    ((GameplayController) (var2)).remainingTurnTicks = var5_intLifetime2;
                    ((GameplayController) (var2)).field_Tb = false;
                    continue;
                  }
                  if (68 == MusicCrossfadeStream.deliveredOpcode) {
                    ((GameplayController) (var2)).battlefield.readGameEvent((PacketBuffer) (ByteStorage.incomingPacket), (byte) -67);
                    if (((GameplayController) (var2)).battlefield.currentPlayer != ((GameplayController) (var2)).battlefield.localPlayer) {
                      continue;
                    }
                    if ((1 << ((GameplayController) (var2)).battlefield.localPlayer & ((GameplayController) (var2)).battlefield.eliminatedPlayerMask) == 0) {
                      continue;
                    }
                    ((GameplayController) (var2)).i(0);
                    continue;
                  }
                  if (MusicCrossfadeStream.deliveredOpcode == 78) {
                    RadialSummonMenu.field_d = ByteStorage.incomingPacket.readInt(1);
                    continue;
                  }
                  if (76 == MusicCrossfadeStream.deliveredOpcode) {
                    var3Lifetime2 = ByteStorage.incomingPacket.readUnsignedByte(0);
                    if (var3Lifetime2 != 0) {
                      ((GameplayController) (var2)).field_Tb = true;
                    } else {
                      ((GameplayController) (var2)).field_Tb = false;
                    }
                    ((GameplayController) (var2)).field_Vb = ByteStorage.incomingPacket.readUnsignedShort((byte) -104);
                    continue;
                  }
                  if (MusicCrossfadeStream.deliveredOpcode == 69) {
                    var3_ref_int__ = new int[((GameplayController) (var2)).battlefield.teamCount];
                    var4_ref_int__ = new int[((GameplayController) (var2)).battlefield.playerCount];
                    var5 = new int[((GameplayController) (var2)).battlefield.playerCount];
                    var6Lifetime1Lifetime1 = ByteStorage.incomingPacket.readUnsignedByte(0);
                    var7Lifetime1 = 0;
                    while (((GameplayController) (var2)).battlefield.teamCount > var7Lifetime1) {
                      var3_ref_int__[var7Lifetime1] = ByteStorage.incomingPacket.readUnsignedByte(0);
                      var7Lifetime1++;
                    }
                    var7Lifetime1Lifetime1 = 0;
                    while (var7Lifetime1Lifetime1 < ((GameplayController) (var2)).battlefield.playerCount) {
                      var5[var7Lifetime1Lifetime1] = ByteStorage.incomingPacket.readUnsignedByte(0);
                      var4_ref_int__[var7Lifetime1Lifetime1] = ByteStorage.incomingPacket.readUnsignedShort((byte) -104);
                      var7Lifetime1Lifetime1++;
                    }
                    ((GameplayController) (var2)).battlefield.applyMatchOutcome(var6Lifetime1Lifetime1, true, var3_ref_int__);
                    ((GameplayController) (var2)).battlefield.field_rb = var5;
                    ((GameplayController) (var2)).battlefield.field_G = var4_ref_int__;
                    if (0 <= ((GameplayController) (var2)).controlledPlayerId) {
                      ((GameplayController) (var2)).field_Gb = ((GameplayController) (var2)).battlefield.field_rb[((GameplayController) (var2)).controlledPlayerId] * 768 >> 8;
                      if (!(((GameplayController) (var2)).field_Gb <= pg.playerProfile.progressionCredit)) {
                        ((GameplayController) (var2)).field_Gb = pg.playerProfile.progressionCredit;
                      }
                    } else {
                      ((GameplayController) (var2)).field_Gb = 0;
                    }
                    ((GameplayController) (var2)).prepareMatchResults(true);
                    continue;
                  }
                  if (MusicCrossfadeStream.deliveredOpcode == 70) {
                    ((GameplayController) (var2)).battlefield.field_C = ByteStorage.incomingPacket.readUnsignedByte(0);
                    if (null == rd.gameplayController) {
                      continue;
                    }
                    ConsolePanel.a(true);
                    continue;
                  }
                  if (MusicCrossfadeStream.deliveredOpcode == 71) {
                    ((GameplayController) (var2)).battlefield.setInactivePlayerMask(0, ByteStorage.incomingPacket.readUnsignedByte(0));
                    if (rd.gameplayController == null) {
                      continue;
                    }
                    ConsolePanel.a(true);
                    continue;
                  }
                  if (MusicCrossfadeStream.deliveredOpcode == 73) {
                    ((GameplayController) (var2)).battlefield.setEliminatedPlayerMask(ByteStorage.incomingPacket.readUnsignedByte(0), -119);
                    if (null == rd.gameplayController) {
                      continue;
                    }
                    ConsolePanel.a(true);
                    continue;
                  }
                  if (MusicCrossfadeStream.deliveredOpcode == 72) {
                    ((GameplayController) (var2)).battlefield.field_i = ByteStorage.incomingPacket.readUnsignedByte(0);
                    if (null == rd.gameplayController) {
                      continue;
                    }
                    bw.d(7242);
                    continue;
                  }
                  if (MusicCrossfadeStream.deliveredOpcode == 73) {
                    ((GameplayController) (var2)).field_hb = ByteStorage.incomingPacket.readUnsignedByte(0);
                    if (null == rd.gameplayController) {
                      continue;
                    }
                    bw.d(7242);
                    continue;
                  }
                }
                this.j(12);
                continue;
              }
              break;
            }
            if (decompiledNaturalLoopExit0) {
              stackIn_337_0 = 30;
              stackIn_337_1 = 0;
            }
            hb.$cfr$intArgs$a$e9dea5688aa5(stackIn_337_0, stackIn_337_1);
          }
          if (ValidatedTextWidget.field_Z) {
            s.field_d = 0;
          }
          if (br.heldKeys[82] &&
            br.heldKeys[74]) {
            stackIn_348_0 = 1;
          } else {
            stackIn_348_0 = 0;
          }
          var2_intLifetime2 = stackIn_348_0;
          if (MovementPresentation.j(-11)) {
            var3Lifetime1 = this.h((byte) -116);
            if (var3Lifetime1 == 0 ||
              var3Lifetime1 == 1) {
              SphinxActionRequest.a(2, (byte) 37);
              bw.a(127, 3);
              ah.a((byte) 33, 4);
              op.a(5, true);
              SpellCastEvent.b(6, -32666);
              BestScoreStrategy.a(7, 1742);
              TutorialLayout.a(true);
              if (var3Lifetime1 != 1) {
                if (FaceNormal.field_d) {
                  du.field_h = false;
                  AiUnitPlanner.field_t = true;
                  vs.field_j = true;
                  if (!fj.field_c) {
                    CipherPacketBuffer.a(false, 0, 1, 0);
                    if (var11 != 0) {
                      PaletteRegionMap.field_i = ContextualRuntimeException.field_d;
                      CipherPacketBuffer.a(false, 11, 1, 0);
                    }
                  } else {
                    PaletteRegionMap.field_i = ContextualRuntimeException.field_d;
                    CipherPacketBuffer.a(false, 11, 1, 0);
                  }
                  ut.i((byte) 126);
                  ConsoleTextNode.field_p[jt.field_a].restoreStageSelection(100, false, 0);
                  ModalDialogHost.field_H = false;
                  fj.field_c = false;
                  FaceNormal.field_d = false;
                  uc.a(0);
                }
                ScrollContainer.field_Qb = false;
                SpellCastAction.field_t = false;
                if (var11 != 0) {
                  ScrollContainer.field_Qb = true;
                  SpellCastAction.field_t = true;
                }
              } else {
                ScrollContainer.field_Qb = true;
                SpellCastAction.field_t = true;
              }
            }
            var4Lifetime1 = 0;
            if (2 == var3Lifetime1) {
              var4Lifetime1 = 1;
            }
            if (var2_intLifetime2 != 0) {
              var4Lifetime1 = 1;
            }
            if (FaceNormal.field_d ||
              SpellCastAction.field_t ||
              ScrollContainer.field_Qb) {
              var4Lifetime1 = 1;
            }
            if (!MovementPresentation.j(-11)) {
              var4Lifetime1 = 0;
            }
            if (var4Lifetime1 != 0) {
              er.b(-11);
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw AnimationSkeleton.addExceptionContext((Throwable) (var2), "ArmiesOfGielinor.QA(" + obfuscationGuard + ')');
        }
    }

    public ArmiesOfGielinor() {
    }

    final void shutdownClient(byte obfuscationGuard) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          mj.shutdownAudioPlayers((byte) -82);
          if (null != FixedQuaternion.field_a) {
            ck.b(-116);
          }
          pg.a(false);
          if (obfuscationGuard != 103) {
            this.initializeClient(true);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) var2), "ArmiesOfGielinor.OA(" + obfuscationGuard + ')');
        }
    }

    private final boolean q(int param0) {
        RuntimeException var2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (ki.field_b.ensureIndex((byte) 82) &&
            ki.field_b.ensureAllGroupsAvailable(-27927)) {
            if (ReportAbuseDialog.field_Lb.ensureIndex((byte) 82) &&
              ReportAbuseDialog.field_Lb.ensureAllGroupsAvailable(-27927)) {
              if (param0 > -18) {
                return false;
              }
              if (op.field_b.ensureIndex((byte) 82) &&
                op.field_b.ensureAllGroupsAvailable(-27927)) {
                if (bi.field_f.ensureIndex((byte) 82) &&
                  bi.field_f.ensureAllGroupsAvailable(-27927)) {
                  if (MusicCrossfadeStream.field_s.ensureIndex((byte) 82) &&
                    MusicCrossfadeStream.field_s.ensureAllGroupsAvailable(-27927)) {
                    return true;
                  }
                  bn.a((byte) -24, 67.0f, ao.a(ProgressDialog.field_eb, true, DateInputWidget.field_G, MusicCrossfadeStream.field_s));
                  return false;
                }
                bn.a((byte) -24, 67.0f, ao.a(ProgressDialog.field_eb, true, DateInputWidget.field_G, bi.field_f));
                return false;
              }
              bn.a((byte) -24, 67.0f, EmailValidator.a(op.field_b, 0, DateInputWidget.field_G, "", ProgressDialog.field_eb));
              return false;
            }
            bn.a((byte) -24, 67.0f, ao.a(ProgressDialog.field_eb, true, DateInputWidget.field_G, ReportAbuseDialog.field_Lb));
            return false;
          }
          bn.a((byte) -24, 67.0f, ao.a(ProgressDialog.field_eb, true, DateInputWidget.field_G, ki.field_b));
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) var2), "ArmiesOfGielinor.KA(" + param0 + ')');
        }
    }

    public final void init() {
        try {
          this.a((byte) 31, 25, "armiesofgielinor");
        } catch (RuntimeException runtimeException) {
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) runtimeException), "ArmiesOfGielinor.init()");
        }
    }

    private final void d(int param0, boolean param1) {
        int fieldTemp$0 = 0;
        int stackIn_97_0 = 0;
        int stackIn_98_1 = 0;
        int stackIn_102_2 = 0;
        CampaignMission stackIn_196_0 = null;
        int stackIn_196_1 = 0;
        CampaignQuicksave stackIn_197_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var3_intLifetime1;
        int var3_intLifetime2;
        int var3_intLifetime3;
        int var3_intLifetime4;
        var8 = obfuscationControl ? 1 : 0;
        try {
          boolean decompiledFrameRemainder4 = true;
          if (~pg.field_f == ~pg.field_e) {
            var3_int = 0;
            if (null != ToggleTurnSkipConsoleCommand.debugConsole) {
              ToggleTurnSkipConsoleCommand.debugConsole.advanceConsole((byte) -120, true);
            }
            boolean decompiledFrameRemainder3 = true;
            var4 = 0;
            if (!param1) {
              boolean decompiledFrameCompleted1 = true;
              boolean decompiledFrameRemainder2 = true;
              if (jt.field_a == -1) {
                if (!FaceNormal.field_d) {
                  if (rd.gameplayController == null) {
                    CipherPacketBuffer.a(false, 0, 1, jt.field_a);
                    decompiledFrameRemainder2 = (var8 != 0);
                  }
                  if (decompiledFrameRemainder2) {
                    rd.gameplayController.a(112, true);
                    while (Unit.pollKeyEvent((byte) -89)) {
                      if (ValidationState.a(param0 + 56)) {
                        continue;
                      }
                      rd.gameplayController.g(false);
                      if (var8 != 0) {
                        decompiledFrameCompleted1 = false;
                        break;
                      }
                    }
                    decompiledFrameRemainder2 = !(decompiledFrameCompleted1);
                  }
                }
                if ((decompiledFrameRemainder2) &&
                  (decompiledFrameCompleted1)) {
                  var3_int = 1;
                  var4 = 1;
                  decompiledFrameRemainder2 = (var8 != 0);
                }
              }
              if ((decompiledFrameRemainder2) &&
                (decompiledFrameCompleted1)) {
                if (-2 != jt.field_a) {
                  if (jt.field_a != -6) {
                    if (-7 == jt.field_a) {
                      MatchSetupPanel.c((byte) 61);
                      decompiledFrameRemainder2 = (var8 != 0);
                    }
                    if ((decompiledFrameRemainder2) &&
                      (MusicCrossfadeStream.a(jt.field_a, true))) {
                      ConsoleTextNode.field_p[jt.field_a].d((byte) -109);
                      if (var8 != 0) {
                        ResourceArchive.c(-20193);
                        var3_int = 1;
                      }
                    }
                  } else {
                    ResourceArchive.c(-20193);
                    if (var8 != 0) {
                      var3_int = 1;
                    }
                  }
                } else {
                  var3_int = 1;
                }
              }
              if ((decompiledFrameCompleted1) &&
                (decompiledFrameRemainder3 = (mu.field_a != null))) {
                GameClock.field_j = GameClock.field_j + 1;
              }
              if ((decompiledFrameRemainder3) &&
                (50 == GameClock.field_j)) {
                ut.i((byte) 127);
              }
            }
            boolean decompiledFrameRemainder1 = true;
            boolean decompiledFrameCompleted0 = true;
            if (FaceNormal.field_d &&
              !SpellCastAction.field_t &&
              !ScrollContainer.field_Qb) {
              if (fj.field_c &&
                hf.textChatActive) {
                var3_int = 0;
              }
              GiveTileConsoleCommand.a(73, var3_int != 0);
              if (ModalDialogHost.field_H) {
                SectorCacheStore.field_a.a(109, var4 != 0);
              }
              if (fj.field_c) {
                PaletteRegionMap.a(320, 180, var4 != 0, 0);
                rd.gameplayController.a(param0 + 119, var4 != 0);
              }
              while (Unit.pollKeyEvent((byte) -127)) {
                if (ValidationState.a(param0 - 126) &&
                  var8 == 0) {
                  continue;
                }
                boolean decompiledFrameRemainder0 = true;
                if (ValidatedTextWidget.field_Z) {
                  if (!fj.field_c) {
                    NodeIterator.a(12, 15, 13, param0 + 50);
                    decompiledFrameRemainder0 = (var8 != 0);
                  }
                  if (decompiledFrameRemainder0) {
                    stackIn_97_0 = -66;
                    if (ChannelFadeTimeConsoleCommand.field_F) {
                      stackIn_98_1 = 77;
                    } else {
                      stackIn_98_1 = 12;
                    }
                    if (ChannelFadeTimeConsoleCommand.field_F) {
                      stackIn_102_2 = 78;
                    } else {
                      stackIn_102_2 = 15;
                    }
                    if (CameraOverviewTarget.$cfr$intArgs$a$78278125798b(stackIn_97_0, stackIn_98_1, stackIn_102_2, 13) &&
                      var8 == 0) {
                      continue;
                    }
                  }
                }
                if (ModalDialogHost.field_H) {
                  SectorCacheStore.field_a.g(false);
                }
                if (!fj.field_c) {
                  continue;
                }
                rd.gameplayController.g(false);
                if (var8 != 0) {
                  decompiledFrameCompleted0 = false;
                  break;
                }
              }
            }
            if (decompiledFrameCompleted0) {
              decompiledFrameRemainder1 = !(FaceNormal.field_d);
            }
            if (decompiledFrameRemainder1) {
              br.a((byte) -97);
            }
            if (ValidatedTextWidget.field_Z) {
              if (!(mj.field_c <= TelepopEvent.field_F)) {
                TelepopEvent.field_F = TelepopEvent.field_F + 1;
                if ((var8 != 0) &&
                  (0 < TelepopEvent.field_F)) {
                  TelepopEvent.field_F = TelepopEvent.field_F - 1;
                }
              }
            } else {
              if (0 < TelepopEvent.field_F) {
                TelepopEvent.field_F = TelepopEvent.field_F - 1;
              }
            }
            var5 = mj.field_c * mj.field_c;
            var6 = -(TelepopEvent.field_F * TelepopEvent.field_F) + var5;
            var7 = SoftwareRaster.height - (120 - var6 * 120 / var5);
            SpellCastAction.b(8, var7);
            if (null != ScrollWidgetContainer.field_P.first((byte) 111)) {
              fieldTemp$0 = lq.field_b + 1;
              lq.field_b = lq.field_b + 1;
              if (fieldTemp$0 == 335) {
                lq.field_b = 0;
                ScrollWidgetContainer.field_P.popFirst(0);
              }
            }
            decompiledFrameRemainder4 = (var8 != 0);
          }
          if (decompiledFrameRemainder4) {
            if (~DirectByteStorage.field_h == ~pg.field_f) {
              ValidationStatusWidget.field_X = ValidationStatusWidget.field_X + 1;
              decompiledFrameRemainder4 = (ValidationStatusWidget.field_X == 16);
              if (decompiledFrameRemainder4) {
                if (!ke.field_a) {
                  ed.a(false);
                  if (var8 != 0) {
                    CampaignMenuButton.b(-20267);
                  }
                } else {
                  CampaignMenuButton.b(-20267);
                }
                pg.field_f = or.field_c;
                decompiledFrameRemainder4 = (var8 != 0);
              }
            }
            if (decompiledFrameRemainder4) {
              if (or.field_c != pg.field_f) {
                ValidationStatusWidget.field_X = ValidationStatusWidget.field_X - 1;
                decompiledFrameRemainder4 = (ValidationStatusWidget.field_X == 0);
                if (decompiledFrameRemainder4) {
                  pg.field_f = pg.field_e;
                  decompiledFrameRemainder4 = (var8 != 0);
                }
              }
              if (decompiledFrameRemainder4) {
                if (!DamageEvent.g(119)) {
                  if (PointerInputHandler.field_f != null) {
                    UnitSpell.a(3, 1, PointerInputHandler.field_f);
                  }
                  CombatPresentation.n(param0 ^ -110);
                  CipherPacketBuffer.a(false, ClientContextMenu.field_a, 1, 0);
                  if (ke.field_a) {
                    ke.field_a = false;
                    AiPlanningStrategy.a(false, 8028);
                  }
                  if (tv.field_a) {
                    CipherPacketBuffer.a(false, -4, 1, jt.field_a);
                  }
                  if (MusicCrossfadeStream.a(jt.field_a, true)) {
                    ut.i((byte) 125);
                  }
                }
                pg.field_f = QuickChatMenu.field_Wb;
              }
            }
          }
          if (param0 != 0) {
            this.tickClient((byte) -98);
          }
          if (jt.field_a == -3) {
            this.a(false, (byte) -62);
            rd.gameplayController.h(true);
            var3_intLifetime1 = r.field_s ? 1 : 0;
            CipherPacketBuffer.a(var3_intLifetime1 != 0, -1, 1, 0);
            du.field_h = true;
          }
          if (jt.field_a == -10 ||
            jt.field_a == -11) {
            stackIn_196_0 = l.activeCampaignMission;
            stackIn_196_1 = -1;
            if (jt.field_a != -11) {
              stackIn_197_2 = null;
            } else {
              stackIn_197_2 = DropTargetWidgetContainer.getStoredQuicksave(127);
            }
            TextLineLayout.startCampaignMission(stackIn_196_0, stackIn_196_1, stackIn_197_2);
            if (jt.field_a == -10) {
              qh.requestDeleteQuicksave((byte) 27);
            }
            rd.gameplayController.h(true);
            var3_intLifetime2 = r.field_s ? 1 : 0;
            CipherPacketBuffer.a(var3_intLifetime2 != 0, -1, 1, 0);
            du.field_h = true;
          }
          if (jt.field_a == -8) {
            this.a(true, (byte) -67);
            rd.gameplayController.k((byte) -113);
            rd.gameplayController.h(true);
            var3_intLifetime3 = r.field_s ? 1 : 0;
            CipherPacketBuffer.a(var3_intLifetime3 != 0, -1, 1, 0);
            du.field_h = true;
          }
          if (jt.field_a == -9) {
            this.a(true, (byte) -90);
            rd.gameplayController.startEquipmentTutorial((byte) 60);
            rd.gameplayController.h(true);
            var3_intLifetime4 = r.field_s ? 1 : 0;
            CipherPacketBuffer.a(var3_intLifetime4 != 0, -1, 1, 0);
            du.field_h = true;
          }
          if (-4 == jt.field_a) {
            EmailValidator.outgoingPacket.writeCipheredOpcode(32161, 9);
            SpellCastAction.field_t = true;
            TelepopEvent.field_F = mj.field_c;
          }
          if (jt.field_a == -5) {
            boolean decompiledSharedTail0 = !(ModalDialogHost.field_H);
            if (!decompiledSharedTail0) {
              ov.writeSpectateRoomRequest(11, 3, 0);
              decompiledSharedTail0 = (var8 != 0);
            }
            if ((decompiledSharedTail0) &&
              (fj.field_c)) {
              PointerInputHandler.writeRoomAdmissionCancellation(-81, ToggleWidget.currentRoom.getRoomId((byte) 117), 11);
            }
            ScrollContainer.field_Qb = true;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) var3), "ArmiesOfGielinor.EA(" + param0 + ',' + param1 + ')');
        }
    }

    final void renderClient(int obfuscationGuard) {
        boolean stackIn_21_0 = false;
        boolean stackIn_65_0 = false;
        RuntimeException decompiledCaughtException = null;
        java.awt.Canvas var2 = null;
        RuntimeException var2_ref = null;
        GameplayController var3 = null;
        int var4 = 0;
        try {
          var2 = VerticalScrollbar.p(0);
          if (PopupPresentation.h(obfuscationGuard ^ 31337)) {
            GameAppletShell.a(false, fs.a(false), var2);
            return;
          }
          if (!DelayedPacket.field_q) {
            PaletteRegionMap.a((byte) 121, var2);
            return;
          }
          if (!UiSelectionState.d(obfuscationGuard + 95)) {
            bn.a((byte) -24, 100.0f, DateInputWidget.field_G);
            PaletteRegionMap.a((byte) 122, var2);
            return;
          }
          stackIn_21_0 = ((rd.gameplayController != null ||
            null != SectorCacheStore.field_a) &&
            jt.field_a == 7);
          MusicPatch.field_w = stackIn_21_0;
          if (obfuscationGuard > ~AiPlanningStrategy.pointerX &&
            -1 < ko.pointerY) {
          }
          BoundedFile.a(jt.field_a, true, MusicPatch.field_w, false);
          if (null != mu.field_a) {
            mu.field_a.a(obfuscationGuard ^ 8, GameClock.field_j);
            GameClock.field_j = GameClock.field_j + 1;
            if (50 == GameClock.field_j) {
              ut.i((byte) 126);
            }
          }
          if (!MusicPatch.field_w ||
            !du.field_h) {
            tq.a(sq.c((byte) 54), false);
          }
          var3 = rd.gameplayController;
          if (ModalDialogHost.field_H) {
            var3 = SectorCacheStore.field_a;
          }
          if (var3 != null &&
            null == var3.movementPlanner) {
            AnimationSkeleton.field_t.draw(0, 0);
            fe.c(ManaEvent.field_A, 320, 200, ConsoleValue.field_b, false);
          }
          this.c(false);
          if (null != ToggleTurnSkipConsoleCommand.debugConsole) {
            ToggleTurnSkipConsoleCommand.debugConsole.drawConsole(89);
          }
          if (!ed.a(-89)) {
            if (DefeatPlayerConsoleCommand.e((byte) 93)) {
              SoftwareRaster.d(0, 0, SoftwareRaster.width, SoftwareRaster.height);
              DefeatPlayerConsoleCommand.h(1976460609);
              if (obfuscationControl) {
                if (FixedQuaternion.field_a == null) {
                  stackIn_65_0 = ph.tickFocusSnapshot;
                } else {
                  stackIn_65_0 = true;
                }
                QuickChatCategoryRepository.a(stackIn_65_0, -5);
              }
            }
          } else {
            if (FixedQuaternion.field_a == null) {
              stackIn_65_0 = ph.tickFocusSnapshot;
            } else {
              stackIn_65_0 = true;
            }
            QuickChatCategoryRepository.a(stackIn_65_0, -5);
          }
          if (~pg.field_f != ~pg.field_e) {
            var4 = ValidationStatusWidget.field_X * 256 / 16;
            if (var4 > 0) {
              SoftwareRaster.b(0, 0, SoftwareRaster.width, SoftwareRaster.height, 0, var4);
            }
          }
          if (BufferedSocket.field_j >= 2 &&
            CoatOfArms.field_e) {
            rs.field_n.drawText(Integer.toString(UnitModelPreview.field_i), 8, 23, 16777215, 1);
            rs.field_n.drawRightAligned((Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory()) / 1024L + "kB", 500, 100, 16777215, 1);
            rs.field_n.drawRightAligned(Runtime.getRuntime().totalMemory() / 1024L + "kB", 500, 120, 16777215, 1);
          }
          ToggleTurnSkipConsoleCommand.h(2);
          ContentTransitionDialog.a(0, 12, var2, 0);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) var2_ref), "ArmiesOfGielinor.DA(" + obfuscationGuard + ')');
        }
    }

    public static void s(int param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        try {
          field_L = null;
          field_H = null;
          field_J = null;
          if (param0 != 3) {
            ArmiesOfGielinor.a((byte[]) null, false);
          }
          field_I = null;
          field_N = null;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) var1), "ArmiesOfGielinor.MA(" + param0 + ')');
        }
    }

    final void finishShutdown(byte obfuscationGuard) {
        try {
          ArmiesOfGielinor.s(3);
          jg.a(-112);
          NodeDeque.c(obfuscationGuard + 322);
          ResourceArchive.b(obfuscationGuard + 71);
          rr.a(-114);
          et.c(13626);
          ed.b(15000);
          gi.a(180);
          AdaptiveMidiPcmStream.c((byte) 52);
          MusicCrossfadeStream.e(256);
          gp.a((byte) 115);
          us.a(obfuscationGuard ^ 30);
          CampaignMenu.d((byte) 44);
          BattleGraphicsAssets.a((byte) -12);
          ve.a(1);
          CombatSandbox.a((byte) -8);
          hc.b(1017);
          qt.a((byte) 93);
          s.a(53);
          Spell.b(obfuscationGuard - 1700635368);
          KeyboardInputListener.a(true);
          t.a(0);
          cd.a(false);
          bt.c(0);
          gv.b(93);
          fe.b();
          vi.a(true);
          wf.h(71);
          ContextualRuntimeException.c(1);
          GameAppletShell.d(105);
          fa.a((byte) 100);
          PointerInputHandler.a((byte) -79);
          el.b(-8834);
          SoftwareRaster.d();
          ah.a((byte) 32);
          PacketBuffer.f(115);
          l.a(true);
          pv.a(213);
          hb.a(obfuscationGuard ^ 71);
          dt.a(-1);
          qk.a(50);
          ov.a((byte) 50);
          ChatMessage.a(0);
          er.a(-3);
          ds.a(2);
          GameClock.a((byte) -108);
          bi.b(0);
          jp.a((byte) -82);
          rd.a(obfuscationGuard ^ -20000072);
          fj.b((byte) -67);
          CoatOfArms.a(false);
          BattlefieldTheme.a((byte) -117);
          ep.a((byte) 11);
          PlayerProfile.b(0);
          CampaignQuicksave.a(obfuscationGuard + 157);
          SoundCache.a((byte) -58);
          TutorialController.h(obfuscationGuard + 71);
          cg.a((byte) -109);
          GameplayController.d(obfuscationGuard ^ 49);
          vd.a(256);
          lb.a(obfuscationGuard + 13988);
          CampaignMission.f(0);
          DebugConsole.c(obfuscationGuard ^ 3);
          ResourceProtocolClient.c((byte) 35);
          DiskCacheWorker.a(true);
          dd.b(-56);
          BufferedFile.b((byte) 78);
          BufferedSocket.b((byte) 99);
          Unit.q(-9480);
          Battlefield.c(-1);
          BitmapFont.a();
          ke.a(obfuscationGuard + 156);
          IntrusiveNode.b((byte) 4);
          wh.b(0);
          ji.a(0);
          MidiPcmStream.f(-128);
          BattleViewportResizeHandler.b(-51);
          RasterViewportResizeHandler.a(960112080);
          PcmPlayer.clearServiceReference();
          NodeHashTable.a(-83);
          MusicPatchNode.a(9480);
          MidiFileReader.releaseMessageTable();
          MusicPatchPcmStream.f(1048575);
          dj.b((byte) 116);
          it.a(obfuscationGuard + 76);
          ClientUiComponent.h(-117);
          LobbyRoom.e((byte) -58);
          DualNodeHashTable.a(-116);
          LobbyPlayer.e((byte) 20);
          ii.a((byte) -1);
          ArchiveIndex.a(obfuscationGuard + 2);
          lg.a((byte) 126);
          ArchiveProvider.a(false);
          aq.a((byte) -22);
          hq.a((byte) -73);
          ModalDialog.f((byte) 97);
          ModalDialogHost.l(17);
          AccountRegistrationDialog.j((byte) 126);
          ProgressDialog.n(260);
          StandardContentDialog.j((byte) 49);
          ProgressMessageDialog.n(0);
          AccountRegistrationForm.f((byte) 19);
          GuestPlayConfirmationForm.k(obfuscationGuard ^ -11944);
          LoginForm.b(true);
          AccountNameSelectionForm.f((byte) -117);
          gl.a(true);
          fl.a((byte) 82);
          uu.a((byte) 30);
          MapTile.g(-107);
          MoveAttackRequest.e(-1);
          eb.a(1);
          da.a(false);
          fm.a(95);
          CampaignProgress.a(false);
          MapLayout.a(0);
          db.a(-3);
          PaletteRegionMap.a(obfuscationGuard + 7814);
          TriangleRasterizer.b();
          MatchSetupPanel.g(256);
          InstructionsPanel.q(-114);
          la.b((byte) -111);
          sg.a((byte) 93);
          IntPair.a(-10);
          SpellMenuGroup.a(-84);
          TutorialLayout.a(obfuscationGuard ^ -4368117);
          oo.b(-8616);
          UiSelectionState.c((byte) 110);
          fs.a(-1);
          SpellCastAction.e(-4541);
          AiPlanner.a(-27464);
          su.a(true);
          CampaignRewardPreview.a(126);
          CombatEvent.e((byte) -127);
          ManaEvent.g(-829);
          MoveEvent.g(obfuscationGuard ^ -29395);
          SummonEvent.d((byte) 113);
          TurnEffectEvent.a(true);
          DeployRequest.a((byte) 44);
          SphinxActionRequest.f(-27538);
          SummonRequest.a((byte) -58);
          GlobalSpell.a((byte) 103);
          UnitSpell.c(6);
          UnitModelPreview.b(obfuscationGuard ^ 298276648);
          SpellConfirmationDialog.a(obfuscationGuard + 173);
          MovementPlanner.b(-104);
          RadialSummonMenu.a((byte) -122);
          UnitCycler.a((byte) -55);
          BattleCamera.d((byte) 55);
          BattleUnitRenderer.a(0);
          TurnTimerDial.a((byte) -95);
          BattleTutorial.b(1);
          EventPresenter.f(-126);
          GameEvent.a((byte) -103);
          UnitInfoPopup.a(obfuscationGuard ^ 101);
          ActionSpell.a(false);
          ActionRequest.a(100);
          CipherPacketBuffer.k((byte) -97);
          km.e(obfuscationGuard + 77);
          CombatPresentation.c(-128);
          AnimationPlayer.b(-106);
          ModelMesh.c();
          DualLinkedNode.f(obfuscationGuard ^ 71);
          ac.a((byte) 71);
          PopupPresentation.d((byte) 109);
          po.a(true);
          DamageEvent.d((byte) -26);
          StateChangeEvent.d((byte) 35);
          OwnerChangeEvent.g(-19269);
          SpellCastEvent.a(true);
          UpkeepEvent.g(10);
          cn.f(123);
          ab.a((byte) 32);
          vv.b((byte) 82);
          bu.a(-128);
          mh.a((byte) -119);
          IconTextComponent.k(obfuscationGuard ^ -72);
          ScrollContainer.k(0);
          IconLabelControl.k(21755);
          VerticalScrollbar.k(-1);
          ClientUiNode.g(31343);
          ContextActionMenu.e((byte) 5);
          SocialListPanel.l(-8291);
          ClientContextMenu.a(-97);
          ReportAbuseDialog.m(73);
          CommunityTabGroup.a(-47);
          bn.a(29022);
          lm.a(1638);
          ki.a((byte) 117);
          ck.a(14);
          th.a((byte) 73);
          h.a(-25764);
          af.b((byte) -120);
          uh.a(obfuscationGuard + 20115);
          DualNodeDeque.d(125);
          ConsolePanel.c((byte) -109);
          ConsoleTextNode.a(-22823);
          cp.a(false);
          EditableTextField.f((byte) -123);
          IndexedSpriteBase.a(18347);
          hf.a((byte) 19);
          HuffmanCodec.a(-1);
          MapRepository.a(4116);
          NodeIterator.a((byte) -121);
          vs.a(obfuscationGuard ^ 21);
          nr.a((byte) -119);
          so.b(obfuscationGuard ^ -328);
          jn.a(obfuscationGuard - 29);
          op.a(true);
          IsaacRandom.b(-119);
          pg.a(20);
          TabbedPanel.k(2);
          AccountNamePrompt.k(obfuscationGuard ^ -72);
          MatchConditionRegistry.a(true);
          LeaderEscortCondition.e(25931);
          UnitLossCondition.d(obfuscationGuard + 196);
          PortalLossCondition.d(-12428);
          LineOfSightGrid.b(obfuscationGuard ^ -90);
          AnimationFrameSet.e((byte) -74);
          TileMetadata.a(23582);
          fd.a(-30097);
          AnimationSequence.a(obfuscationGuard ^ 125);
          qf.a((byte) 31);
          pn.b((byte) -90);
          r.d((byte) -11);
          sh.b((byte) 40);
          pd.a((byte) 95);
          QuickChatHelpDialog.l(obfuscationGuard ^ 55);
          jk.a(obfuscationGuard ^ -28);
          AiUnitPlanner.a(-31116);
          DeathEvent.g(-81);
          RevivalEvent.e((byte) 91);
          TelefragEvent.g(-75);
          ti.a((byte) 29);
          lq.a(-31320);
          TrianglePulse.b(16);
          TickCounter.a(1);
          ud.n(12213);
          se.a(0);
          ByteStorage.b(9892);
          pb.a();
          nk.b((byte) 75);
          dc.a(540);
          BoundedFile.a(-98);
          tk.a((byte) -100);
          ao.b((byte) -120);
          or.a(false);
          kp.a(2);
          BitmapTextWidgetPainter.a((byte) 58);
          Widget.c((byte) -124);
          SingleChildWidgetContainer.i(-98);
          TextLayout.a(obfuscationGuard - 51);
          ut.p(0);
          ls.a(-121);
          vq.a((byte) 107);
          ResizableModalDialog.h((byte) 58);
          DropdownSelector.a(obfuscationGuard - 11763);
          InteractiveWidget.i(0);
          GridWidgetContainer.e((byte) 68);
          DequeWidgetContainer.d((byte) -89);
          ArrayWidgetContainer.i(0);
          vr.a((byte) -37);
          jj.a((byte) -112);
          PcmPlayerService.releaseLabels(-74);
          TaggedMapData.a(-91);
          tf.a(false);
          BattleCharacter.c(-1);
          CombatViewTransition.b((byte) 120);
          br.a(111);
          vt.a(false);
          ng.w(0);
          MeshObject.a(-66);
          FaceNormal.a((byte) -101);
          VertexNormal.a(obfuscationGuard - 14619);
          AnimationSkeleton.e(77);
          mv.a((byte) -48);
          AnimationFrame.releaseDecoderScratch();
          rv.a(obfuscationGuard ^ -72);
          PreparedAction.a(28038);
          VineGrowthAction.a((byte) 119);
          MoveAttackAction.e(obfuscationGuard + 4);
          TeleportAction.a(false);
          SocketResourceClient.e(obfuscationGuard - 4024);
          NetworkResourceRequest.h(obfuscationGuard ^ 29322);
          SectorCacheStore.b(1);
          DiskCacheRequest.h(obfuscationGuard ^ -61);
          CachedArchiveProvider.e(obfuscationGuard - 56);
          ek.a(236611664);
          ResourceRequest.e((byte) -126);
          is.a((byte) -5);
          VorbisSample.releaseSetup();
          bq.a(30156);
          pu.a((byte) -114);
          uc.a((byte) -39);
          gt.a(494);
          de.a((byte) -116);
          GameCanvas.a(79);
          bk.a(true);
          od.a(obfuscationGuard ^ 71);
          cw.a((byte) -118);
          VorbisFloor.releaseScratch();
          mj.c((byte) -82);
          lp.a(obfuscationGuard ^ -13095008);
          cu.a((byte) -121);
          e.b((byte) -13);
          QuickChatMenu.k(85);
          QuickChatCategoryRepository.a(40);
          QuickChatPhraseRepository.a((byte) -110);
          QuickChatCategory.h(-97);
          QuickChatPhrase.e((byte) -74);
          WeightedLruCache.a((byte) -57);
          du.b(16);
          ug.a(16);
          NanoGameClock.d(0);
          dh.c(-117);
          SynthesizerVoice.releaseScratch();
          MusicPatchUsage.releaseUiReferences(-119);
          AiInfluenceMap.a(61);
          AiPlanningStrategy.a(-1);
          CameraOverviewTarget.e(-93);
          j.b((byte) 125);
          RadialSummonItem.b(76);
          sq.a(false);
          DeployAction.a(true);
          c.a(obfuscationGuard + 157);
          SummonAction.a((byte) 113);
          AccountNameNormalizer.a(obfuscationGuard ^ 75);
          bw.a(-28911);
          StateChangeMarker.a((byte) -3);
          DisplacedUnitMarker.e(1223);
          DeployEvent.g(-125);
          CorpseConditionMarker.a(true);
          SkeletonLimitMarker.a(false);
          ParasiteEvent.d((byte) 46);
          KingBlackDragonEvent.g(-43);
          TelepopEvent.g(obfuscationGuard - 9);
          GrowthEvent.g(-74);
          MusicPatch.a((byte) 52);
          MusicPatchEnvelope.a((byte) 99);
          LabeledWidgetContainer.j(-12819);
          ValidatedTextWidget.g((byte) -127);
          EditableTextWidget.m(32);
          ContentTransitionDialog.i(obfuscationGuard);
          StripedProgressWidget.a((byte) -85);
          NameSuggestionList.b(true);
          HotspotTextWidget.b(true);
          kw.b(true);
          ValidationStatusWidget.c(false);
          ToggleWidget.a(58);
          TextFieldValidator.f(-1);
          RegistrationAgreementPane.k(-15);
          ws.a(obfuscationGuard + 197);
          pi.a((byte) -63);
          AttackEvent.a(false);
          jv.a((byte) 36);
          BestScoreStrategy.c((byte) 110);
          AiActionCandidate.f(obfuscationGuard ^ -123);
          WeightedScoreStrategy.c(-104);
          vf.c(obfuscationGuard ^ 18);
          FixedQuaternion.a((byte) -57);
          MovementPresentation.g(67);
          EffectPresentation.c(obfuscationGuard ^ 40);
          ph.a((byte) -54);
          DateOfBirthValidator.b(false);
          NumericDateInputWidget.c(false);
          wb.a(false);
          bs.a(true);
          tq.a((byte) -84);
          DateInputWidget.n(0);
          ScrollWidgetContainer.b(false);
          nb.d((byte) 68);
          DirectByteStorage.c(1);
          fh.a((byte) -28);
          BitmapTextLayout.c(true);
          DraggableWidgetContainer.j(0);
          DropTargetWidgetContainer.k(obfuscationGuard ^ -36);
          cs.b(true);
          tn.n(obfuscationGuard + 72);
          ClippedWidgetContainer.j(obfuscationGuard + 150);
          ScrollControlWidget.l(-24061);
          IterableNodeHashTable.a(false);
          IterableDualNodeDeque.a(19345);
          CacheEntry.g(obfuscationGuard ^ 91);
          QuickChatCommandDefinition.a((byte) -36);
          StrongCacheEntry.c(true);
          pc.d(35);
          SoundFilter.releaseScratch();
          mu.a(0);
          NodeHashIterator.a((byte) 100);
          DualNodeIterator.a((byte) -121);
          wj.a(true);
          aj.a(obfuscationGuard + 155);
          ko.a(false);
          nt.a((byte) 97);
          ChannelGainProfile.a(-4740);
          SoundPlaybackHandle.a((byte) -75);
          CampaignDefinition.a((byte) 9);
          CampaignParticipant.a((byte) -95);
          CampaignUnitOverride.a(obfuscationGuard ^ -10);
          CampaignMenuButton.c(obfuscationGuard ^ -72);
          CampaignMenuEntry.a(-101);
          bj.a(obfuscationGuard ^ -72);
          SpriteButtonPainter.a(-26601);
          LinkButtonPainter.a(-127);
          TextEntryWidgetPainter.a(1);
          MaskedTextEntryPainter.b((byte) 117);
          oi.b(true);
          AlphaWidgetContainer.c(false);
          ps.c(false);
          SocialListEntry.k(obfuscationGuard - 4103);
          we.a((byte) 120);
          b.a(true);
          iw.a(-25771);
          vg.a((byte) 89);
          li.a((byte) 74);
          ConsoleExpression.a(true);
          ConsoleValue.a((byte) -114);
          ConsoleCommand.d((byte) 126);
          ConsoleParseException.a(0);
          ConsoleEvaluationException.a(125);
          TextCursor.a(obfuscationGuard - 51);
          ConsoleTokenCursor.b(-119);
          TeamRoster.b(-51);
          EmailCheckResult.a(true);
          ClientConnectionState.a((byte) 96);
          DelayedPacket.a(obfuscationGuard + 1);
          wm.a(-10743);
          AccountRequestResult.a(200);
          DialogMessagePane.a((byte) 63);
          RasterState.a(-22856);
          CampaignResult.a((byte) -116);
          RegionAnchor.a(true);
          LoginMethod.b((byte) -49);
          wv.c((byte) -3);
          oq.a(120);
          eq.a(true);
          HelloConsoleCommand.g(-90);
          PrintCoatConsoleCommand.i(113);
          SetCoatConsoleCommand.g(-5);
          ChannelFadeTimeConsoleCommand.g(1);
          ChannelBaseVolumeConsoleCommand.g(obfuscationGuard + 21408);
          ListMissionsConsoleCommand.g(12600);
          GiveTileConsoleCommand.e((byte) 120);
          DefeatPlayerWithMetricsConsoleCommand.g(123);
          DefeatPlayerConsoleCommand.g(obfuscationGuard ^ -1746174247);
          ToggleTurnSkipConsoleCommand.g(-128);
          PrintVictoryConditionsConsoleCommand.g(-2260);
          FixInvisibleUnitsConsoleCommand.e((byte) -97);
          MatchConditionEntry.a((byte) -127);
          on.a(-7);
          rs.a((byte) -121);
          jl.a(-125);
          ip.a(obfuscationGuard ^ 36);
          TextLineLayout.b(obfuscationGuard ^ 26972);
          DropdownArrowPainter.a((byte) 86);
          fc.a(obfuscationGuard ^ 43);
          fk.a(true);
          kq.a(obfuscationGuard ^ -3);
          DropdownOptionList.b(false);
          AccountNameAvailabilityValidator.h(29151);
          EmailValidator.b(true);
          EmailConfirmationValidator.g(obfuscationGuard ^ -55);
          AgeValidator.h(-117);
          MatchingTextValidator.g(49);
          tv.a((byte) -126);
          TextHotspotRegion.a(135);
          ValidationState.b(-16356);
          DebouncedValidator.d(65280);
          rn.a(false);
          this.field_p = null;
        } catch (RuntimeException runtimeException) {
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) runtimeException), "ArmiesOfGielinor.GA(" + obfuscationGuard + ')');
        }
    }

    final void initializeClient(boolean obfuscationGuard) {
        int stackIn_10_0 = 0;
        int stackIn_10_1 = 0;
        int stackIn_26_0 = 0;
        RuntimeException decompiledCaughtException = null;
        AdaptiveMidiPcmStream var2 = null;
        RuntimeException var2_ref = null;
        AdaptiveMidiPcmStream var3 = null;
        MusicCrossfadeStream var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        var7 = obfuscationControl ? 1 : 0;
        try {
          li.field_n = new Random(vi.monotonicMillis(-108));
          this.a(4, 68, 24, 2, -119, 0, 1);
          UnitSpell.installViewportResizeListener(52, new BattleViewportResizeHandler());
          var2 = new AdaptiveMidiPcmStream();
          var3 = new AdaptiveMidiPcmStream(var2);
          var4 = new MusicCrossfadeStream(var2, var3);
          var4.firstSequencer.setChannelProgram(-1, 128, 9);
          var4.secondSequencer.setChannelProgram(-1, 128, 9);
          var5 = 0;
          do {
            if (!(CorpseConditionMarker.defaultMusicProfile.gains.length > var5)) {
              BitmapTextWidgetPainter.a(IntPair.field_m, 22050, var4, (byte) 68, true, (java.awt.Component) ((Object) IndexedSpriteBase.field_b));
              Widget.field_o = new int[7];
              break;
            }
            CorpseConditionMarker.defaultMusicProfile.gains[var5] = 256;
            var5++;
          } while (var7 == 0);
          var5 = 0;
          while (true) {
            stackIn_10_0 = var5;
            stackIn_10_1 = 7;
            if (stackIn_10_0 < stackIn_10_1) {
              Widget.field_o[var5] = 0;
              stackIn_26_0 = ~var5;
              if (var7 == 0) {
                if (stackIn_26_0 > -5) {
                  var6 = 0;
                  while (!(var6 >= AnimationFrameSet.unitUnlockGroups[var5].length)) {
                    stackIn_10_0 = ~bw.unitDefinitions[AnimationFrameSet.unitUnlockGroups[var5][var6]][11];
                    stackIn_10_1 = -1;
                    if (stackIn_10_0 == stackIn_10_1) {
                      Widget.field_o[var5] = AccountRegistrationDialog.bitwiseOr(Widget.field_o[var5], 1 << var6);
                    }
                    var6++;
                  }
                }
                var5++;
                continue;
              }
            } else {
              UnitLossCondition.battlefieldThemes = TeleportAction.createThemeCatalog(-10128);
              this.a(true, false, true, true, 55, false, true);
              jv.field_d = pi.field_M;
              sh.opcodePayloadLengths[65] = -2;
              stackIn_26_0 = obfuscationGuard ? 1 : 0;
            }
            bj.field_k = stackIn_26_0 != 0;
            sh.opcodePayloadLengths[80] = -2;
            sh.opcodePayloadLengths[77] = -2;
            sh.opcodePayloadLengths[68] = -1;
            sh.opcodePayloadLengths[9] = -1;
            sh.opcodePayloadLengths[81] = -1;
            sh.opcodePayloadLengths[72] = 1;
            sh.opcodePayloadLengths[78] = 4;
            sh.opcodePayloadLengths[82] = -2;
            sh.opcodePayloadLengths[79] = 4;
            ke.field_b = IterableNodeHashTable.field_f;
            sh.opcodePayloadLengths[73] = 1;
            sh.opcodePayloadLengths[75] = 12;
            sh.opcodePayloadLengths[74] = -1;
            GameAppletShell.field_e = DeployEvent.field_C;
            sh.opcodePayloadLengths[76] = 3;
            sh.opcodePayloadLengths[70] = 1;
            sh.opcodePayloadLengths[64] = -2;
            sh.opcodePayloadLengths[10] = -1;
            sh.opcodePayloadLengths[71] = 1;
            sh.opcodePayloadLengths[67] = 4;
            fs.field_d = hc.field_o;
            sh.opcodePayloadLengths[69] = -1;
            return;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) var2_ref), "ArmiesOfGielinor.FA(" + obfuscationGuard + ')');
        }
    }

    private final void p(int param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          if (null != RegionAnchor.field_o) {
            TickCounter.loadClientAssets(RegionAnchor.field_o, 10207);
            IntKeyLookup.a(UnitLossCondition.battlefieldThemes, (byte) 62);
            RegionAnchor.field_o = null;
            ModalDialog.a(0);
          }
          bt.field_e = SpriteButtonPainter.a(3, true);
          iw.field_l = DamageEvent.a(0, 5, (byte) 102, false, false);
          sh.field_j = SpriteButtonPainter.a(6, true);
          br.field_d = SpriteButtonPainter.a(7, true);
          SpellConfirmationDialog.field_f = SpriteButtonPainter.a(8, true);
          ep.field_b = SpriteButtonPainter.a(9, true);
          SummonAction.field_w = SpriteButtonPainter.a(10, true);
          CorpseConditionMarker.field_w = SpriteButtonPainter.a(11, true);
          ki.field_b = SpriteButtonPainter.a(12, true);
          op.field_b = SpriteButtonPainter.a(15, true);
          bi.field_f = SpriteButtonPainter.a(14, true);
          MusicCrossfadeStream.field_s = SpriteButtonPainter.a(param0, true);
          ReportAbuseDialog.field_Lb = SpriteButtonPainter.a(18, true);
          GuestPlayConfirmationForm.field_M = SpriteButtonPainter.a(19, true);
          ChannelBaseVolumeConsoleCommand.field_M = SpriteButtonPainter.a(20, true);
          InteractiveWidget.field_F = SpriteButtonPainter.a(22, true);
          MusicPatchUsage.backgroundArchive = DamageEvent.a(0, 21, (byte) 127, false, false);
          AiInfluenceMap.field_f = SpriteButtonPainter.a(23, true);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) var2), "ArmiesOfGielinor.JA(" + param0 + ')');
        }
    }

    final static BinaryBitmapFont a(byte[] param0, boolean param1) {
        BinaryBitmapFont var2 = null;
        RuntimeException var2_ref = null;
        Object stackIn_5_0 = null;
        BinaryBitmapFont stackIn_7_0 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!param1) {
            field_K = 125;
          }
          if (param0 == null) {
            stackIn_5_0 = null;
            return (BinaryBitmapFont) (stackIn_5_0);
          }
          var2 = new BinaryBitmapFont(param0, j.decodedSpriteOffsetXs, CampaignMenuButton.decodedSpriteOffsetYs, ClippedWidgetContainer.decodedSpriteWidths, c.decodedSpriteHeights, AnimationPlayer.decodedSpriteIndices);
          StripedProgressWidget.releaseSpriteDecodeBuffers((byte) 124);
          stackIn_7_0 = var2;
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          stackIn_11_0 = var2_ref;
          stackIn_11_1 = new StringBuilder().append("ArmiesOfGielinor.NA(");
          if (param0 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(param1).append(')').toString());
        }
    }

    private final void a(boolean param0, byte param1) {
        GameplayController stackIn_20_0;
        GameplayController stackIn_20_1;
        boolean stackIn_20_2;
        byte stackIn_20_3;
        String[] stackIn_20_4;
        int stackIn_20_5;
        boolean stackIn_20_6;
        BattleGraphicsAssets stackIn_20_7;
        GameplayController stackIn_21_0 = null;
        GameplayController stackIn_21_1 = null;
        int stackIn_21_8 = 0;
        int stackIn_24_9;
        int stackIn_24_10;
        boolean stackIn_24_11;
        int stackIn_24_12;
        int stackIn_24_13;
        GameplayController stackIn_25_0;
        GameplayController stackIn_25_1;
        boolean stackIn_25_14;
        RuntimeException decompiledCaughtException = null;
        String[] var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        String var4_ref_String = null;
        int var5 = 0;
        int var6 = 0;
        GameplayController stackIn_21_0Lifetime1;
        GameplayController stackIn_21_1Lifetime1;
        GameplayController stackIn_25_0Lifetime1;
        GameplayController stackIn_25_1Lifetime1;
        GameplayController stackIn_21_0Lifetime1Lifetime1;
        GameplayController stackIn_21_1Lifetime1Lifetime1;
        var6 = obfuscationControl ? 1 : 0;
        try {
          boolean decompiledFrameCompleted0 = true;
          l.activeCampaignMission = null;
          PointerInputHandler.field_f = null;
          if (!param0) {
            var3 = new String[r.field_B];
            var4 = 0;
            while (var4 < r.field_B) {
              var3[var4] = ArchiveIndex.field_w[var4];
              var4++;
              if (var6 != 0) {
                decompiledFrameCompleted0 = false;
                break;
              }
            }
          }
          if (decompiledFrameCompleted0) {
            if (param0 ||
              var6 != 0) {
              var4_ref_String = mv.localAccountName;
              var3 = new String[2];
              if (var4_ref_String == null) {
                var4_ref_String = BoundedFile.field_i;
              }
              var3[1] = vs.field_b;
              var3[0] = var4_ref_String;
            }
            LinkButtonPainter.field_f.selectTheme(wf.field_D, 0);
            ChannelFadeTimeConsoleCommand.field_F = false;
            var4 = 0;
          }
          if (param1 > -48) {
            return;
          }
          stackIn_20_0 = null;
          stackIn_20_1 = null;
          stackIn_20_2 = false;
          stackIn_20_3 = MoveAttackRequest.field_B[0];
          stackIn_20_4 = var3;
          stackIn_20_5 = 0;
          stackIn_20_6 = false;
          stackIn_20_7 = LinkButtonPainter.field_f;
          if (!IntrusiveNode.field_h) {
            stackIn_21_0 = null;
            stackIn_21_1 = null;
            stackIn_21_8 = t.field_e;
          } else {
            stackIn_21_0 = null;
            stackIn_21_1 = null;
            stackIn_21_8 = 4;
          }
          regionExit1: {
            stackIn_21_0Lifetime1 = null;
            stackIn_21_1Lifetime1 = null;
            stackIn_24_9 = field_K;
            stackIn_24_10 = wf.field_D;
            stackIn_24_11 = false;
            stackIn_24_12 = 4;
            stackIn_24_13 = var4;
            if (!QuickChatPhraseRepository.a(27875)) {
              stackIn_21_0Lifetime1Lifetime1 = null;
              stackIn_21_1Lifetime1Lifetime1 = null;
              if (BufferedSocket.field_j >= 2) {
                stackIn_25_0 = null;
                stackIn_25_1 = null;
                stackIn_25_14 = true;
                break regionExit1;
              }
            }
            stackIn_25_0Lifetime1 = null;
            stackIn_25_1Lifetime1 = null;
            stackIn_25_14 = false;
          }
          rd.gameplayController = new GameplayController(stackIn_20_2, (int) stackIn_20_3, stackIn_20_4, stackIn_20_5, stackIn_20_6, stackIn_20_7, stackIn_21_8, stackIn_24_9, stackIn_24_10, stackIn_24_11, stackIn_24_12, stackIn_24_13, stackIn_25_14, (CampaignMission) null);
          rd.gameplayController.battlefield.playerCoats = new CoatOfArms[r.field_B];
          rd.gameplayController.battlefield.field_F = true;
          var5 = 0;
          while (r.field_B > var5) {
            rd.gameplayController.battlefield.playerCoats[var5] = ah.localCoat;
            var5++;
            if (var6 != 0) {
              return;
            }
          }
          oo.e(-387);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) var3_ref), "ArmiesOfGielinor.HA(" + param0 + ',' + param1 + ')');
        }
    }

    private final boolean c(int param0, boolean param1) {
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        String var4 = null;
        int var5_int = 0;
        MidiPcmStream var5 = null;
        IndexedSprite[] var5_array = null;
        BattlefieldTheme[] var5_array2 = null;
        MusicTrack[] var6 = null;
        BattlefieldTheme[] var6_array = null;
        int[] var6_array2 = null;
        int var6_int = 0;
        int var7_int = 0;
        int[] var7 = null;
        BattlefieldTheme var7_ref = null;
        MusicTrack var8 = null;
        BattlefieldTheme var8_ref = null;
        int[] var8_array = null;
        int[] var9 = null;
        int[] var10 = null;
        int[] var11 = null;
        int[] var12 = null;
        int[] var13 = null;
        int[] var14 = null;
        int[] var15 = null;
        RgbSprite[][] var16 = null;
        int var17 = 0;
        int var18 = 0;
        var18 = obfuscationControl ? 1 : 0;
        try {
          if (DelayedPacket.field_q) {
            return true;
          }
          var3_int = -78 / ((param0 + 45) / 46);
          j.a((byte) 119);
          var4 = "basicfont12";
          if (null != br.field_d) {
            if (PrintVictoryConditionsConsoleCommand.field_K.ensureIndex((byte) 82) &&
              PrintVictoryConditionsConsoleCommand.field_K.ensureGroupAvailableByName(28979, "basic")) {
              if (PrintVictoryConditionsConsoleCommand.field_K.ensureIndex((byte) 82) &&
                PrintVictoryConditionsConsoleCommand.field_K.ensureGroupAvailableByName(28979, var4)) {
                if (ResourceRequest.field_A.ensureIndex((byte) 82) &&
                  ResourceRequest.field_A.ensureGroupAvailableByName(28979, var4)) {
                  if (PrintVictoryConditionsConsoleCommand.field_K.ensureIndex((byte) 82) &&
                    PrintVictoryConditionsConsoleCommand.field_K.ensureGroupAvailableByName(28979, "lobby")) {
                    if (ResourceRequest.field_A.ensureIndex((byte) 82) &&
                      ResourceRequest.field_A.ensureGroupAvailableByName(28979, "lobby")) {
                      if (br.field_d.ensureIndex((byte) 82) &&
                        br.field_d.ensureAllGroupsAvailable(-27927)) {
                        if (SpellConfirmationDialog.field_f.ensureIndex((byte) 82) &&
                          SpellConfirmationDialog.field_f.ensureAllGroupsAvailable(-27927)) {
                          if (ep.field_b.ensureIndex((byte) 82) &&
                            ep.field_b.ensureAllGroupsAvailable(-27927)) {
                            if (SummonAction.field_w.ensureIndex((byte) 82) &&
                              SummonAction.field_w.ensureAllGroupsAvailable(-27927)) {
                              if (iw.field_l.ensureIndex((byte) 82) &&
                                iw.field_l.ensureGroupAvailableByName(28979, "basic") &&
                                iw.field_l.ensureGroupAvailableByName(28979, "campaign")) {
                                if (sh.field_j.ensureIndex((byte) 82) &&
                                  sh.field_j.ensureGroupAvailableByName(28979, "basic")) {
                                  if (bt.field_e.ensureIndex((byte) 82) &&
                                    bt.field_e.ensureAllGroupsAvailable(-27927)) {
                                    if (CorpseConditionMarker.field_w.ensureIndex((byte) 82) &&
                                      CorpseConditionMarker.field_w.ensureAllGroupsAvailable(-27927)) {
                                      if (GuestPlayConfirmationForm.field_M.ensureIndex((byte) 82) &&
                                        GuestPlayConfirmationForm.field_M.ensureAllGroupsAvailable(-27927)) {
                                        if (ChannelBaseVolumeConsoleCommand.field_M.ensureIndex((byte) 82) &&
                                          ChannelBaseVolumeConsoleCommand.field_M.ensureAllGroupsAvailable(-27927)) {
                                          if (InteractiveWidget.field_F.ensureIndex((byte) 82) &&
                                            InteractiveWidget.field_F.ensureAllGroupsAvailable(-27927)) {
                                            if (AiInfluenceMap.field_f.ensureIndex((byte) 82) &&
                                              AiInfluenceMap.field_f.ensureAllGroupsAvailable(-27927)) {
                                              if (MusicPatchUsage.backgroundArchive.ensureIndex((byte) 82) &&
                                                MusicPatchUsage.backgroundArchive.ensureAllGroupsAvailable(-27927)) {
                                                if (!this.q(-46)) {
                                                  return false;
                                                }
                                                if (!param1) {
                                                  return false;
                                                }
                                                UpkeepEvent.h(65);
                                                bn.a((byte) -24, 70.0f, ph.field_a);
                                                this.renderClient(0);
                                                jl.field_d = new SoundCache(br.field_d, SpellConfirmationDialog.field_f);
                                                ClientUiNode.field_v[0] = jl.field_d.getSoundEffectByName("sword_slash_4", (byte) -97, "");
                                                ClientUiNode.field_v[1] = jl.field_d.getSoundEffectByName("runewars_menu_mouseover", (byte) -97, "");
                                                ClientUiNode.field_v[2] = jl.field_d.getSoundEffectByName("runewars_select_menu_item", (byte) -97, "");
                                                ClientUiNode.field_v[3] = jl.field_d.getSoundEffectByName("runewars_select_unit", (byte) -97, "");
                                                ClientUiNode.field_v[4] = jl.field_d.getSoundEffectByName("runewars_select_position", (byte) -97, "");
                                                ClientUiNode.field_v[5] = jl.field_d.getSoundEffectByName("runewars_errorsound", (byte) -97, "");
                                                ClientUiNode.field_v[6] = jl.field_d.getSoundEffectByName("runewars_teleport_all", (byte) -97, "");
                                                ClientUiNode.field_v[8] = jl.field_d.getMusicSampleByName((byte) -128, "", "runewars_capture_fanfare");
                                                ClientUiNode.field_v[9] = jl.field_d.getSoundEffectByName("runewars_select_flag", (byte) -97, "");
                                                ClientUiNode.field_v[10] = jl.field_d.getSoundEffectByName("runewars_paint_flag", (byte) -97, "");
                                                ClientUiNode.field_v[11] = jl.field_d.getSoundEffectByName("runewars_swap_spellbook", (byte) -97, "");
                                                ClientUiNode.field_v[12] = jl.field_d.getSoundEffectByName("runewars_select_spell", (byte) -97, "");
                                                ClientUiNode.field_v[13] = jl.field_d.getSoundEffectByName("runewars_transition", (byte) -97, "");
                                                ClientUiNode.field_v[14] = jl.field_d.getSoundEffectByName("runewars_purchase_unit", (byte) -97, "");
                                                ClientUiNode.field_v[15] = jl.field_d.getSoundEffectByName("runewars_choose_alignment", (byte) -97, "");
                                                ClientUiNode.field_v[16] = jl.field_d.getSoundEffectByName("runewars_clock_tick", (byte) -97, "");
                                                ClientUiNode.field_v[17] = jl.field_d.getSoundEffectByName("runewars_time_over_dong", (byte) -97, "");
                                                ClientUiNode.field_v[18] = jl.field_d.getSoundEffectByName("runewars_turnover_page_map", (byte) -97, "");
                                                var5_array2 = UnitLossCondition.battlefieldThemes;
                                                var6_int = 0;
                                                do {
                                                  if (var6_int >= var5_array2.length) {
                                                    el.field_b[0] = jl.field_d.getSoundEffectByName("runewars_mana_whoosh", (byte) -97, "");
                                                    break;
                                                  }
                                                  var7_ref = var5_array2[var6_int];
                                                  var7_ref.loadAmbientSounds(17952, jl.field_d);
                                                  var6_int++;
                                                } while (var18 == 0);
                                                var5_int = 0;
                                                do {
                                                  if (var5_int >= 8) {
                                                    TurnTimerDial.a(126, jl.field_d);
                                                    TabbedPanel.a(jl.field_d, (byte) 123);
                                                    br.field_d = null;
                                                    ModalDialog.a(0);
                                                    break;
                                                  }
                                                  el.field_b[var5_int + 1] = jl.field_d.getSoundEffectByName("runewars_mana_stars_" + (1 + var5_int), (byte) -97, "");
                                                  var5_int++;
                                                } while (var18 == 0);
                                                return false;
                                              }
                                              bn.a((byte) -24, 69.0f, ao.a(ProgressDialog.field_eb, true, DateInputWidget.field_G, MusicPatchUsage.backgroundArchive));
                                              return false;
                                            }
                                            bn.a((byte) -24, 66.0f, ao.a(ProgressDialog.field_eb, true, DateInputWidget.field_G, AiInfluenceMap.field_f));
                                            return false;
                                          }
                                          bn.a((byte) -24, 63.0f, ao.a(ProgressDialog.field_eb, true, DateInputWidget.field_G, InteractiveWidget.field_F));
                                          return false;
                                        }
                                        bn.a((byte) -24, 61.0f, ao.a(ProgressDialog.field_eb, true, DateInputWidget.field_G, ChannelBaseVolumeConsoleCommand.field_M));
                                        return false;
                                      }
                                      bn.a((byte) -24, 58.0f, ao.a(ProgressDialog.field_eb, true, DateInputWidget.field_G, GuestPlayConfirmationForm.field_M));
                                      return false;
                                    }
                                    bn.a((byte) -24, 56.0f, ao.a(ProgressDialog.field_eb, true, DateInputWidget.field_G, CorpseConditionMarker.field_w));
                                    return false;
                                  }
                                  bn.a((byte) -24, 54.0f, EmailValidator.a(bt.field_e, 0, DateInputWidget.field_G, "", ProgressDialog.field_eb));
                                  return false;
                                }
                                bn.a((byte) -24, 52.0f, EmailValidator.a(sh.field_j, 0, QuickChatPhraseRepository.field_a, "basic", is.field_f));
                                return false;
                              }
                              bn.a((byte) -24, 41.0f, EmailValidator.a(iw.field_l, 0, Battlefield.field_nb, "basic", TileMetadata.field_i));
                              return false;
                            }
                            bn.a((byte) -24, 38.0f, EmailValidator.a(SummonAction.field_w, 0, is.field_d, "", PacketBuffer.field_m));
                            return false;
                          }
                          bn.a((byte) -24, 33.0f, LoginForm.a(is.field_d, 0, ep.field_b, -27638, PacketBuffer.field_m));
                          return false;
                        }
                        bn.a((byte) -24, 28.0f, EmailValidator.a(SpellConfirmationDialog.field_f, 0, ds.field_b, "", ResourceProtocolClient.field_k));
                        return false;
                      }
                      bn.a((byte) -24, 23.0f, EmailValidator.a(br.field_d, 0, ds.field_b, "", ResourceProtocolClient.field_k));
                      return false;
                    }
                    bn.a((byte) -24, 21.0f, EmailValidator.a(ResourceRequest.field_A, 0, QuickChatPhraseRepository.field_a, "lobby", is.field_f));
                    return false;
                  }
                  bn.a((byte) -24, 18.0f, EmailValidator.a(PrintVictoryConditionsConsoleCommand.field_K, 0, Battlefield.field_nb, "lobby", TileMetadata.field_i));
                  return false;
                }
                bn.a((byte) -24, 16.0f, EmailValidator.a(ResourceRequest.field_A, 0, QuickChatPhraseRepository.field_a, var4, is.field_f));
                return false;
              }
              bn.a((byte) -24, 13.0f, EmailValidator.a(PrintVictoryConditionsConsoleCommand.field_K, 0, Battlefield.field_nb, var4, TileMetadata.field_i));
              return false;
            }
            bn.a((byte) -24, 10.0f, EmailValidator.a(PrintVictoryConditionsConsoleCommand.field_K, 0, Battlefield.field_nb, "basic", TileMetadata.field_i));
            return false;
          }
          if (null != SpellConfirmationDialog.field_f) {
            bn.a((byte) -24, 71.0f, ph.field_a);
            this.renderClient(0);
            SpellConfirmationDialog.field_f = null;
            ModalDialog.a(0);
            return false;
          }
          if (null != SummonAction.field_w) {
            bn.a((byte) -24, 75.0f, LabeledWidgetContainer.field_M);
            this.renderClient(0);
            SocialListPanel.field_Ob = MusicTrack.load(SummonAction.field_w, "", "Runewars Titlescreen");
            DeployRequest.field_B = MusicTrack.load(SummonAction.field_w, "", "legion");
            ChannelBaseVolumeConsoleCommand.field_K = MusicTrack.load(SummonAction.field_w, "", "Runewars win");
            se.field_h = MusicTrack.load(SummonAction.field_w, "", "Runewars lose");
            var5_int = 0;
            do {
              if (!(var5_int < ConsoleEvaluationException.field_a.length)) {
                fh.field_b = new MusicTrack[9];
                fh.field_b[0] = MusicTrack.load(SummonAction.field_w, "", "the terrible tower");
                fh.field_b[1] = MusicTrack.load(SummonAction.field_w, "", "venture2");
                fh.field_b[2] = MusicTrack.load(SummonAction.field_w, "", "the other side");
                fh.field_b[3] = MusicTrack.load(SummonAction.field_w, "", "the shadow");
                fh.field_b[4] = MusicTrack.load(SummonAction.field_w, "", "faithless");
                fh.field_b[5] = MusicTrack.load(SummonAction.field_w, "", "kingdom");
                fh.field_b[6] = MusicTrack.load(SummonAction.field_w, "", "fight or flight");
                fh.field_b[7] = MusicTrack.load(SummonAction.field_w, "", "soul wars");
                fh.field_b[8] = MusicTrack.load(SummonAction.field_w, "", "brain_barrelchest_battle");
                qf.interfaceMusicTrack = MusicTrack.load(SummonAction.field_w, "", "AoG_interface_guthix");
                break;
              }
              ConsoleEvaluationException.field_a[var5_int] = MusicTrack.load(SummonAction.field_w, "", "attack" + (var5_int + 1));
              var5_int++;
            } while (var18 == 0);
            var5 = BitmapTextWidgetPainter.musicCrossfadeStream.firstSequencer;
            var5.prepareTrackSamples(jl.field_d, ep.field_b, 0, SocialListPanel.field_Ob, (byte) 86);
            var5.prepareTrackSamples(jl.field_d, ep.field_b, 0, DeployRequest.field_B, (byte) 86);
            var5.prepareTrackSamples(jl.field_d, ep.field_b, 0, ChannelBaseVolumeConsoleCommand.field_K, (byte) 86);
            var5.prepareTrackSamples(jl.field_d, ep.field_b, 0, se.field_h, (byte) 86);
            var6 = ConsoleEvaluationException.field_a;
            var7_int = 0;
            do {
              if (var7_int >= var6.length) {
                var5.prepareTrackSamples(jl.field_d, ep.field_b, 0, qf.interfaceMusicTrack, (byte) 86);
                break;
              }
              var8 = var6[var7_int];
              var5.prepareTrackSamples(jl.field_d, ep.field_b, 0, var8, (byte) 86);
              var7_int++;
            } while (var18 == 0);
            var6_array = UnitLossCondition.battlefieldThemes;
            var7_int = 0;
            do {
              if (var6_array.length <= var7_int) {
                var5.releasePatchSampleIds(-117);
                SummonAction.field_w = null;
                ep.field_b = null;
                jl.field_d = null;
                ModalDialog.a(0);
                break;
              }
              var8_ref = var6_array[var7_int];
              var8_ref.prepareMusicSamples(jl.field_d, ep.field_b, SummonAction.field_w, 0, var5);
              var7_int++;
            } while (var18 == 0);
            return false;
          }
          if (sh.field_j == null) {
            if (bt.field_e != null) {
              uc.setChatHuffmanCodec(new HuffmanCodec(bt.field_e.getFileByName("huffman", -105, "")), 4);
              bt.field_e = null;
              ModalDialog.a(0);
              return false;
            }
            if (null != GuestPlayConfirmationForm.field_M &&
              ChannelBaseVolumeConsoleCommand.field_M != null) {
              ArchiveProvider.mapRepository = new MapRepository(GuestPlayConfirmationForm.field_M, ChannelBaseVolumeConsoleCommand.field_M, false);
              GuestPlayConfirmationForm.field_M = null;
              ChannelBaseVolumeConsoleCommand.field_M = null;
              return false;
            }
            if (null != InteractiveWidget.field_F) {
              CampaignMenu.a(InteractiveWidget.field_F, 0, 28);
              InteractiveWidget.field_F = null;
              return false;
            }
            if (AiInfluenceMap.field_f != null) {
              CampaignMenu.a(AiInfluenceMap.field_f, 1, -85);
              AiInfluenceMap.field_f = null;
              return false;
            }
            if (!this.o(11672)) {
              return false;
            }
            ModalDialog.a(0);
            return true;
          }
          bn.a((byte) -24, 90.0f, SectorCacheStore.field_i);
          this.renderClient(0);
          rs.field_n = DropdownArrowPainter.a(var4, PrintVictoryConditionsConsoleCommand.field_K, ResourceRequest.field_A, (byte) -53, "");
          DateInputWidget.field_E = DropdownArrowPainter.a("basic", iw.field_l, sh.field_j, (byte) -53, "smallfont");
          TrianglePulse.field_i = it.a("introfont", iw.field_l, sh.field_j, (byte) -87, "basic");
          nr.field_e = TurnEffectEvent.a("runewarsfont", sh.field_j, iw.field_l, "basic", -2088);
          fe.a(nr.field_e);
          fe.field_l = fk.loadRgbSpritesByName("textshadow", (byte) -127, iw.field_l, "basic");
          var5_array = MapLayout.loadIndexedSpritesByName("members_benefits_screenshots", -28106, "basic", iw.field_l);
          if (var5_array != null) {
            LineOfSightGrid.a(var5_array, (byte) 110, this);
          }
          MatchConditionEntry.field_n = pv.a("basic", "background", iw.field_l, 24914);
          cp.field_e = MapLayout.loadIndexedSpritesByName("statusicons", -28106, "basic", iw.field_l);
          MapLayout.loadIndexedSpritesByName("armouricons", -28106, "basic", iw.field_l);
          lb.field_e = MapLayout.loadIndexedSpritesByName("special_icons", -28106, "basic", iw.field_l);
          TrianglePulse.field_d = GameplayController.a("godspark", (byte) 51, "basic", iw.field_l);
          DropdownSelector.field_M = DiskCacheRequest.loadRgbSpriteByName("mapbutton", "basic", iw.field_l, false);
          DiskCacheRequest.loadRgbSpriteByName("endturnbutton", "basic", iw.field_l, false);
          LineOfSightGrid.field_g = DiskCacheRequest.loadRgbSpriteByName("buttonring", "basic", iw.field_l, false);
          e.field_b = ac.a(iw.field_l, "lozenge", (byte) -4, "basic");
          bu.field_c = fk.loadRgbSpritesByName("endturnlozenge", (byte) -127, iw.field_l, "basic");
          AgeValidator.field_l = ac.a(iw.field_l, "summonframe", (byte) -4, "basic");
          EventPresenter.field_t = DiskCacheRequest.loadRgbSpriteByName("bubblepoint", "basic", iw.field_l, false);
          ii.field_a = ac.a(iw.field_l, "actionbuttons", (byte) -4, "basic");
          od.field_a = ac.a(iw.field_l, "info_icons", (byte) -4, "basic");
          ProgressMessageDialog.field_rb = MapLayout.loadIndexedSpritesByName("trait_icons", -28106, "basic", iw.field_l);
          lp.field_b = MapLayout.loadIndexedSpritesByName("terrain_icons", -28106, "basic", iw.field_l);
          sg.field_b = MapLayout.loadIndexedSpritesByName("compare_icons", -28106, "basic", iw.field_l);
          CampaignRewardPreview.field_e = DiskCacheRequest.loadRgbSpriteByName("mapf", "basic", iw.field_l, false);
          MusicPatch.field_z = DiskCacheRequest.loadRgbSpriteByName("mapi", "basic", iw.field_l, false);
          AnimationSkeleton.field_t = pv.a("basic", "turn", iw.field_l, 24914);
          AttackEvent.field_y = fk.loadRgbSpritesByName("mapsquares", (byte) -127, iw.field_l, "basic");
          SkeletonLimitMarker.field_s = fk.loadRgbSpritesByName("isomapsquares", (byte) -127, iw.field_l, "basic");
          SpellMenuGroup.field_h = fk.loadRgbSpritesByName("maprotbutton", (byte) -128, iw.field_l, "basic");
          TeleportAction.field_w = fk.loadRgbSpritesByName("placeicons", (byte) -124, iw.field_l, "basic");
          SocialListPanel.field_Jb = DiskCacheRequest.loadRgbSpriteByName("slider", "basic", iw.field_l, false);
          MoveEvent.field_z = GameplayController.a("bcarrow", (byte) 51, "basic", iw.field_l);
          BestScoreStrategy.field_m = GameplayController.a("goldiv", (byte) 51, "basic", iw.field_l);
          DraggableWidgetContainer.field_Q = fk.loadRgbSpritesByName("silverbar", (byte) -125, iw.field_l, "basic");
          TaggedMapData.field_f = fk.loadRgbSpritesByName("pathfinder", (byte) -125, iw.field_l, "basic");
          DeployAction.field_x = ac.a(iw.field_l, "unitheads", (byte) -4, "basic");
          BattleViewportResizeHandler.field_i = fk.loadRgbSpritesByName("theme_icons", (byte) -127, iw.field_l, "basic");
          UpkeepEvent.a(iw.field_l, 116);
          ArrayWidgetContainer.field_F = fk.loadRgbSpritesByName("fireball", (byte) -128, iw.field_l, "basic");
          MatchConditionRegistry.field_d = fk.loadRgbSpritesByName("fortcontrols", (byte) -124, iw.field_l, "basic");
          StandardContentDialog.field_ob = DiskCacheRequest.loadRgbSpriteByName("smallorb", "basic", iw.field_l, false);
          DraggableWidgetContainer.field_J = DiskCacheRequest.loadRgbSpriteByName("bigorb", "basic", iw.field_l, false);
          pg.field_c = DiskCacheRequest.loadRgbSpriteByName("bigorbring", "basic", iw.field_l, false);
          UnitModelPreview.field_d = ac.a(iw.field_l, "godorbs", (byte) -4, "basic");
          gt.field_c = ac.a(iw.field_l, "godframes", (byte) -4, "basic");
          GuestPlayConfirmationForm.field_F = ac.a(iw.field_l, "godglows", (byte) -4, "basic");
          BufferedFile.field_k = ac.a(iw.field_l, "godframeglows", (byte) -4, "basic");
          tn.a((byte) 80, UnitModelPreview.field_d);
          hf.a(128, GuestPlayConfirmationForm.field_F, 0);
          TeamRoster.field_e = new RgbSprite(71, 71);
          EditableTextWidget.a(8678, 256, 15, TeamRoster.field_e);
          tn.a((byte) 105, GuestPlayConfirmationForm.field_F);
          tn.a((byte) 124, BufferedFile.field_k);
          MaskedTextEntryPainter.field_y = DiskCacheRequest.loadRgbSpriteByName("logo", "basic", iw.field_l, false);
          km.field_h = ac.a(iw.field_l, "summonrings", (byte) -4, "basic");
          jv.field_b = fk.loadRgbSpritesByName("chatbubbles", (byte) -128, iw.field_l, "basic");
          AttackEvent.field_O = GameplayController.a("results_award_badge", (byte) 51, "basic", iw.field_l);
          MidiPcmStream.field_H = (nj) (DiskCacheRequest.loadRgbSpriteByName("shine", "basic", iw.field_l, false));
          CampaignDefinition.field_t = pv.a("basic", "statboxbg", iw.field_l, 24914);
          qt.field_e = pv.a("basic", "popupbg", iw.field_l, 24914);
          vq.field_b = pv.a("basic", "gameinfobg", iw.field_l, 24914);
          MusicPatchUsage.manaStarSprites = fk.loadRgbSpritesByName("manastars", (byte) -127, iw.field_l, "basic");
          TrianglePulse.field_f = GameplayController.a("manaicon", (byte) 51, "basic", iw.field_l);
          od.field_d = fk.loadRgbSpritesByName("overlayicons", (byte) -125, iw.field_l, "basic");
          mv.field_a = fk.loadRgbSpritesByName("bloodsplat", (byte) -126, iw.field_l, "basic");
          it.field_a = GameplayController.a("results_rune_icon", (byte) 51, "basic", iw.field_l);
          ConsoleTextNode.field_k = fk.loadRgbSpritesByName("results_mini_button_silver", (byte) -124, iw.field_l, "basic");
          IsaacRandom.field_a = fk.loadRgbSpritesByName("results_mini_button_gold", (byte) -127, iw.field_l, "basic");
          BattleCharacter.field_h = ac.a(iw.field_l, "trinketicons", (byte) -4, "basic");
          AttackEvent.field_E = DiskCacheRequest.loadRgbSpriteByName("eye", "basic", iw.field_l, false);
          cu.field_d = ac.a(iw.field_l, "trinketbuttons", (byte) -4, "basic");
          ChatMessage.field_s = GameplayController.a("wait_icon", (byte) 51, "basic", iw.field_l);
          ChatMessage.field_s.a();
          EmailConfirmationValidator.field_o = fk.loadRgbSpritesByName("diamondscale", (byte) -128, iw.field_l, "basic");
          jg.field_m = new RgbSprite(MusicPatchUsage.backgroundArchive.getFileByName("menu_background.jpg", -123, ""), (java.awt.Component) ((Object) VerticalScrollbar.p(0)));
          var6_array = UnitLossCondition.battlefieldThemes;
          var7_int = 0;
          do {
            if (var6_array.length <= var7_int) {
              BufferedSocket.field_i = new ep(MusicPatchUsage.backgroundArchive);
              HuffmanCodec.field_i = CampaignMission.a((byte) -125, "frame_outer", "basic", iw.field_l);
              MusicPatch.field_m = CampaignMission.a((byte) 83, "frame_inner", "basic", iw.field_l);
              ChannelBaseVolumeConsoleCommand.field_J = CampaignMission.a((byte) 83, "frame_ingame", "basic", iw.field_l);
              EffectPresentation.field_j = CampaignMission.a((byte) -108, "frame_boxes", "basic", iw.field_l);
              DisplacedUnitMarker.field_s = CampaignMission.a((byte) 89, "frame_button", "basic", iw.field_l);
              break;
            }
            var8_ref = var6_array[var7_int];
            var8_ref.setResourceArchives(MusicPatchUsage.backgroundArchive, 0, iw.field_l);
            var7_int++;
          } while (var18 == 0);
          var6_array2 = new int[]{13615618, 10121728};
          var7 = new int[]{16184190, 16707943};
          ConsoleValue.field_b = jk.a(50, var7, 127, var6_array2);
          var8_array = new int[]{13619151, 10132122};
          var9 = new int[]{16185078, 16711422};
          TutorialController.field_e = jk.a(100, var9, 123, var8_array);
          var10 = new int[]{13421772};
          var11 = new int[]{4473924};
          AgeValidator.field_k = jk.a(100, var11, 125, var10);
          var12 = new int[]{13565952, 10092544};
          var13 = new int[]{16121856, 16646144};
          MoveAttackAction.field_x = jk.a(100, var13, 125, var12);
          var14 = new int[]{13369344};
          var15 = new int[]{4456448};
          dh.field_l = jk.a(100, var15, 123, var14);
          fe.a(0, 0, 640, 480, ChannelBaseVolumeConsoleCommand.field_J, ConsoleValue.field_b);
          SocketResourceClient.a((byte) 125, ac.a(iw.field_l, "dials", (byte) -4, "basic"), GameplayController.a("hand", (byte) 51, "basic", iw.field_l));
          IsaacRandom.field_k = fk.loadRgbSpritesByName("arrows", (byte) -124, iw.field_l, "basic");
          pi.field_T = GameplayController.a("isocrosshair", (byte) 51, "basic", iw.field_l);
          ng.a(GameplayController.a("glowray", (byte) 51, "basic", iw.field_l), 0, GameplayController.a("glowspark", (byte) 51, "basic", iw.field_l));
          MoveAttackRequest.field_C = fk.loadRgbSpritesByName("medals", (byte) -127, iw.field_l, "campaign");
          ps.field_w[0] = DiskCacheRequest.loadRgbSpriteByName("campaign_1_glow", "campaign", iw.field_l, false);
          ps.field_w[1] = DiskCacheRequest.loadRgbSpriteByName("campaign_2_glow", "campaign", iw.field_l, false);
          ps.field_w[2] = DiskCacheRequest.loadRgbSpriteByName("campaign_3_glow", "campaign", iw.field_l, false);
          DelayedPacket.field_k = MapLayout.loadIndexedSpritesByName("achievements_large", -28106, "basic", iw.field_l);
          MoveAttackRequest.field_A = GameplayController.a("unachieved", (byte) 51, "basic", PrintVictoryConditionsConsoleCommand.field_K);
          DeathEvent.field_A = GameplayController.a("locked", (byte) 51, "basic", PrintVictoryConditionsConsoleCommand.field_K);
          ChatMessage.field_t = GameplayController.a("orbcoin", (byte) 51, "basic", PrintVictoryConditionsConsoleCommand.field_K);
          CampaignUnitOverride.a(300, MoveAttackRequest.field_A);
          CampaignUnitOverride.a(300, ChatMessage.field_t);
          CorpseConditionMarker.field_v = new RgbSprite(32, 32);
          CorpseConditionMarker.field_v.b();
          ChatMessage.field_t.d(0, 0, 32, 32);
          so.field_b.a(5605);
          ChatMessage.field_t = null;
          var16 = new RgbSprite[ArrayWidgetContainer.field_E.length][];
          var17 = 0;
          do {
            if (!(ArrayWidgetContainer.field_E.length > var17)) {
              km.field_c = MapLayout.loadIndexedSpritesByName("prestigeicons", -28106, "basic", iw.field_l);
              break;
            }
            var16[var17] = fk.loadRgbSpritesByName(ArrayWidgetContainer.field_E[var17], (byte) -127, iw.field_l, "basic");
            var17++;
          } while (var18 == 0);
          if (!LabeledWidgetContainer.field_L) {
            dh.field_k = GameplayController.a("lobby_game_logo", (byte) 51, "basic", iw.field_l);
            QuickChatPhrase.a(var16, bs.field_b, (byte) 53, MoveAttackRequest.field_B, 4, PrintVictoryConditionsConsoleCommand.field_K, ResourceRequest.field_A, CipherPacketBuffer.field_A, LoginMethod.field_a, new int[]{10, 10, 10, 10, 10, 10, 10, 10, 10, 10}, true, LoginMethod.field_a.length, DropTargetWidgetContainer.field_L, km.field_c, CorpseConditionMarker.field_w, ki.field_d, var16);
            la.initializeChatHistory((byte) 30, 200);
            ps.a(124, ResourceRequest.field_A, PrintVictoryConditionsConsoleCommand.field_K);
          }
          sh.field_j = null;
          ResourceRequest.field_A = null;
          ModalDialog.a(0);
          fe.field_o = new int[7][64];
          var17 = 0;
          do {
            if (var17 >= 64) {
              if (BufferedSocket.field_j >= 2) {
                ToggleTurnSkipConsoleCommand.debugConsole = new DebugConsole(KeyboardInputListener.createDebugCommandRegistry(101), rs.field_n, IntPair.field_m);
              }
              break;
            }
            fe.field_o[1][var17] = fe.a(TutorialLayout.field_g[1], var17 << 3);
            fe.field_o[2][var17] = fe.a(TutorialLayout.field_g[2], var17 << 3);
            fe.field_o[3][var17] = fe.a(TutorialLayout.field_g[3], var17 << 3);
            fe.field_o[4][var17] = fe.a(TutorialLayout.field_g[4], var17 << 3);
            fe.field_o[5][var17] = fe.a(TutorialLayout.field_g[5], var17 << 3);
            fe.field_o[6][var17] = fe.a(TutorialLayout.field_g[6], var17 << 3);
            fe.field_o[0][var17] = (var17 << 2) + (var17 << 10) + (var17 << 18);
            var17++;
          } while (var18 == 0);
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) var3), "ArmiesOfGielinor.IA(" + param0 + ',' + param1 + ')');
        }
    }

    private final void r(int param0) {
        RuntimeException runtimeException = null;
        int var2_int = 0;
        int var3 = 0;
        RuntimeException decompiledCaughtException = null;
        var3 = obfuscationControl ? 1 : 0;
        try {
          LineOfSightGrid.buildSpellMenu(17);
          StateChangeEvent.g(1);
          var2_int = 0;
          while (var2_int < 29) {
            ConsoleTextNode.field_p[var2_int] = new TutorialController(var2_int);
            var2_int++;
            if (var3 != 0) {
              return;
            }
          }
          if (param0 != -66) {
            field_J = (BitmapFont) null;
          }
          jt.field_a = 16;
          ClientConnectionState.a(50, true);
          QuickChatPhrase.a(param0 ^ -68, SocialListPanel.field_Ob);
          DropdownSelector.a(128, 8, rs.field_n.capitalHeight, rs.field_n.maxDescent + rs.field_n.capitalHeight, rs.field_n, MusicPatch.field_m[0].pixelHeight, 8, 2, 16777215, 240, rs.field_n.capitalHeight, -99, new pn(DisplacedUnitMarker.field_s, ConsoleValue.field_b, 0, 128, true), 255, new pn(DisplacedUnitMarker.field_s, ConsoleValue.field_b, 0, 128, true), 320, MusicPatch.field_m[0].pixelWidth, rs.field_n.capitalHeight + rs.field_n.maxDescent, new pn(MusicPatch.field_m, ConsoleValue.field_b, 0, 224, false), rs.field_n);
          wm.a(320, 128, 240, 16777215, rs.field_n.capitalHeight + rs.field_n.maxDescent, rs.field_n.capitalHeight, new pn(DisplacedUnitMarker.field_s, ConsoleValue.field_b, 0, 128, true), 8, (byte) 90, 480, 8, rs.field_n.maxDescent + rs.field_n.capitalHeight, new pn(DisplacedUnitMarker.field_s, ConsoleValue.field_b, 0, 128, true), MusicPatch.field_m[0].pixelHeight, rs.field_n, 2, MusicPatch.field_m[0].pixelWidth, rs.field_n, 255, rs.field_n.capitalHeight, new pn(MusicPatch.field_m, ConsoleValue.field_b, 0, 224, false));
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) runtimeException), "ArmiesOfGielinor.PA(" + param0 + ')');
        }
    }

    final static void b(int param0, boolean param1) {
        RuntimeException runtimeException = null;
        BirthDateChatEnableForm var2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          CombatEvent.field_I.draw(param1, param0 ^ 20);
          var2 = BestScoreStrategy.field_i;
          if (null != var2) {
            var2.drawAllLayers(CombatEvent.field_I.screenX, -125, CombatEvent.field_I.screenY);
          }
          if (param0 != 0) {
            field_H = (String) null;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) runtimeException), "ArmiesOfGielinor.BA(" + param0 + ',' + param1 + ')');
        }
    }

    private final boolean o(int param0) {
        RuntimeException var2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (null != ki.field_b &&
            null == ReportAbuseDialog.field_Lb) {
            bn.a((byte) -24, 97.0f, AiPlanner.field_R);
            this.renderClient(param0 ^ 11672);
            QuickChatCategoryRepository.a(0, ki.field_b);
            ki.field_b = null;
            ModalDialog.a(0);
            return false;
          }
          if (null != ReportAbuseDialog.field_Lb &&
            iw.field_l != null) {
            bn.a((byte) -24, 98.0f, AiPlanner.field_R);
            this.renderClient(0);
            ReportAbuseDialog.field_Lb = null;
            ModalDialog.a(param0 ^ 11672);
            return false;
          }
          if (param0 != 11672) {
            this.shutdownClient((byte) -74);
          }
          if (op.field_b != null &&
            null != bi.field_f &&
            MusicCrossfadeStream.field_s != null &&
            ki.field_b == null) {
            bn.a((byte) -24, 99.0f, AiPlanner.field_R);
            this.renderClient(0);
            CoatOfArms.a(MusicCrossfadeStream.field_s, bi.field_f, op.field_b, 0);
            op.field_b = null;
            bi.field_f = null;
            MusicCrossfadeStream.field_s = null;
            ModalDialog.a(0);
            return false;
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) var2), "ArmiesOfGielinor.CA(" + param0 + ')');
        }
    }

    private final void c(boolean param0) {
        jg var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2_ref = null;
        var5 = obfuscationControl ? 1 : 0;
        try {
          if (param0) {
            field_L = (PacketBuffer) null;
          }
          var2 = (jg) (ScrollWidgetContainer.field_P.first((byte) 97));
          if (null != var2) {
            var4 = lq.field_b;
            if (var4 < 80) {
              var3 = -32 + var4 / 2;
              if (var5 != 0) {
                if (var4 >= 230) {
                  var3 = -(var4 / 2) + 123;
                  var3 = 8;
                } else {
                  var3 = 8;
                }
              }
            } else {
              if (var4 >= 230) {
                var3 = -(var4 / 2) + 123;
                if (var5 != 0) {
                  var3 = 8;
                }
              } else {
                var3 = 8;
              }
            }
            fe.b(-5, var3 - 10, rs.field_n.textWidth(so.field_a[var2.field_l]) + 62, 48, MusicPatch.field_m, ConsoleValue.field_b, 0, 128);
            DelayedPacket.field_k[var2.field_l].c(8, var3);
            rs.field_n.drawText(so.field_a[var2.field_l], 42, var3 - (-5 - rs.field_n.maxAscent), 15658734, -1);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) var2_ref), "ArmiesOfGielinor.LA(" + param0 + ')');
        }
    }

    static {
        field_N = new String[]{"proj_aviansie_axe", null, null, null, null, "proj_rock", "spear"};
        field_I = new int[8192];
        field_K = 0;
        field_H = "Please check if address is correct";
    }
}
