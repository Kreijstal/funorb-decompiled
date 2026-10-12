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

    final void a(byte param0) {
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
        dg stackIn_194_7;
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
          r.field_u = os.g(4);
          hk.k(128);
          if (FixedQuaternion.field_a != null &&
            FixedQuaternion.field_a.field_k) {
            ck.b(-127);
            oi.a(false);
          }
          stackIn_10_1 = 127;
          stackIn_11_2 = (FixedQuaternion.field_a != null);
          this.a(stackIn_10_1, stackIn_11_2);
          if (ts.field_l) {
            this.p(17);
            ts.field_l = false;
          }
          uk.field_n = uk.field_n + 1;
          if (param0 > -111) {
            return;
          }
          if (PopupPresentation.h(31337)) {
            this.g((byte) 4);
            if (PopupPresentation.h(31337)) {
              if (wd.a((byte) 105)) {
                discarded$0 = this.c(-100, false);
              }
              return;
            }
          }
          boolean decompiledFrameRemainder0 = true;
          if (!qu.field_q) {
            ii.a(el.field_d, (byte) -73);
            decompiledFrameRemainder0 = !(!this.c(102, true));
            if (decompiledFrameRemainder0) {
              this.r(-66);
              qu.field_q = true;
              decompiledFrameRemainder0 = (var11 != 0);
            }
          }
          if (decompiledFrameRemainder0) {
            if (UiSelectionState.d(95)) {
              if (!ed.a(-83)) {
                if (an.e((byte) 89)) {
                  if (~pg.field_f != ~pg.field_e) {
                    this.d(0, false);
                    decompiledFrameRemainder0 = (var11 != 0);
                  }
                  if (decompiledFrameRemainder0) {
                    var2_int = ba.h(-124);
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
                    gh.f((byte) -67);
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
                  gh.f((byte) -67);
                }
              }
            } else {
              gh.f((byte) -67);
            }
          }
          boolean decompiledFrameCompleted0 = true;
          if (!DamageEvent.g(100)) {
            while (true) {
              var2 = (iw) (UnitInfoPopup.field_u.a(0));
              if (var2 == null) {
                break;
              }
              nl.a(0, 4, (iw) (var2));
              if (var11 != 0) {
                decompiledFrameCompleted0 = false;
                break;
              }
            }
          }
          if (decompiledFrameCompleted0) {
            boolean decompiledNaturalLoopExit0 = false;
            while (!(decompiledNaturalLoopExit0 = (!gs.a((byte) 42, sh.field_a)))) {
              stackIn_337_0 = nm.field_o;
              stackIn_337_1 = 9;
              if (var11 == 0) {
                if (stackIn_337_0 == stackIn_337_1) {
                  ut.i((byte) 123);
                  SpellCastAction.field_t = false;
                  CipherPacketBuffer.a(false, 11, 1, jt.field_a);
                  PaletteRegionMap.field_i = ByteStorage.field_e.g(1);
                  continue;
                }
                if (nm.field_o == 14) {
                  RadialSummonItem.a(rs.a((byte) 76, 8), sp.b((byte) -90), 150, CipherPacketBuffer.field_A, rs.a((byte) 95, 1000), et.b(-1), 1024, 6, -84, sh.d((byte) 81));
                  ep.a(lp.b(-126), -72, km.c(0));
                  s.field_d = 0;
                  ma.field_Z = true;
                  SpellCastAction.field_t = false;
                  FaceNormal.field_d = true;
                  jt.field_a = -2;
                  TrianglePulse.a(-16147, 50, DeployRequest.field_B, true);
                  continue;
                }
                if (nm.field_o == 15) {
                  if (FaceNormal.field_d) {
                    ut.i((byte) 124);
                    PacketBuffer.i((byte) 109);
                    uk.b(22963);
                    SoftwareRaster.b();
                    CipherPacketBuffer.a(false, 0, 1, 0);
                    AiUnitPlanner.field_t = true;
                    du.field_h = false;
                    FaceNormal.field_d = false;
                    gk.field_H = false;
                    fj.field_c = false;
                    vs.field_j = true;
                    uc.a(0);
                  }
                  TrianglePulse.a(-16147, 50, mp.field_Ob, true);
                  dn.field_Qb = false;
                  SpellCastAction.field_t = false;
                  continue;
                }
                if (nm.field_o == 10 &&
                  FaceNormal.field_d) {
                  bl.a((byte) -105);
                  continue;
                }
                if (nm.field_o == 11 ||
                  nm.field_o == 12) {
                  stackIn_119_0 = 96;
                  stackIn_120_1 = (12 == nm.field_o);
                  var2 = ea.$cfr$intArgs$a$72f70aa7c69d(stackIn_119_0, stackIn_120_1);
                  if (((mo) (var2)).field_b == 4) {
                    if (null != rd.field_j) {
                      NodeHashTable.a(-1, rd.field_j.battlefield.a(((mo) (var2)).field_q, (byte) -64));
                    }
                    if (SectorCacheStore.field_a != null) {
                      NodeHashTable.a(-1, SectorCacheStore.field_a.battlefield.a(((mo) (var2)).field_q, (byte) -64));
                    }
                  }
                  MapLayout.a((mo) (var2), -1);
                  continue;
                }
                if (nm.field_o == 74) {
                  var2 = rq.field_n;
                  var3_ref_bv = ByteStorage.field_e;
                  var4 = ((PacketBuffer) ((Object) var3_ref_bv)).readUnsignedByte(0);
                  var5_int = 0;
                  while (var5_int < var4) {
                    ((int[]) (var2))[var5_int] = ((PacketBuffer) ((Object) var3_ref_bv)).readInt(1);
                    var5_int++;
                  }
                  Unit.m(13);
                  continue;
                }
                if (nm.field_o == 75) {
                  var2 = ByteStorage.field_e;
                  EffectPresentation.readCoatOfArms(ah.localCoat.parts, (PacketBuffer) (var2), false, ah.localCoat.colourIndices);
                  im.field_w = true;
                  continue;
                }
                if (81 == nm.field_o) {
                  var2_intLifetime1 = ByteStorage.field_e.readUnsignedByte(0);
                  if (var2_intLifetime1 != 0) {
                    bu.storedQuicksave = new CampaignQuicksave(ByteStorage.field_e, 9, true);
                    continue;
                  }
                  bu.storedQuicksave = null;
                  mv.field_b = true;
                  continue;
                }
                if (nm.field_o == 82) {
                  if (!bu.storedQuicksave.appendSnapshotChunk(fk.field_b, -1, ByteStorage.field_e)) {
                    continue;
                  }
                  mv.field_b = true;
                  continue;
                }
                if (nm.field_o == 80) {
                  pg.playerProfile = new PlayerProfile(ByteStorage.field_e, true);
                  ve.field_b = true;
                  continue;
                }
                if (79 == nm.field_o) {
                  if (null == rd.field_j) {
                    continue;
                  }
                  rd.field_j.field_Bb = ByteStorage.field_e.readInt(1);
                  continue;
                }
                if (nm.field_o == 64 ||
                  nm.field_o == 65) {
                  ut.i((byte) 123);
                  var2_intLifetime1Lifetime1 = ByteStorage.field_e.readUnsignedByte(0);
                  var3 = ByteStorage.field_e.readUnsignedByte(0);
                  stackIn_176_0 = ((1 & var3) == 0) ? 0 : 1;
                  var4Lifetime2 = stackIn_176_0;
                  stackIn_180_0 = ((var3 & 2) == 0) ? 0 : 1;
                  var5_intLifetime1 = stackIn_180_0;
                  var6 = (var3 & 30) >> 2;
                  var7 = 1 & var3 >> 6;
                  var8 = new String[ByteStorage.field_e.readUnsignedByte(0)];
                  var9 = ByteStorage.field_e.readByte((byte) 123);
                  var10_int = 0;
                  while (var8.length > var10_int) {
                    var8[var10_int] = ByteStorage.field_e.readNullCircumfixedString((byte) 121);
                    stackIn_337_0 = ~nm.field_o;
                    stackIn_337_1 = -65;
                    if (stackIn_337_0 == stackIn_337_1 &&
                      gt.a(var8[var10_int], (byte) 121)) {
                      var9 = var10_int;
                    }
                    var10_int++;
                  }
                  l.activeCampaignMission = null;
                  qa.field_F = false;
                  pq.field_f = null;
                  stackIn_194_0 = null;
                  stackIn_194_1 = null;
                  stackIn_194_2 = true;
                  stackIn_194_3 = var2_intLifetime1Lifetime1;
                  stackIn_194_4 = var8;
                  stackIn_194_5 = var9;
                  stackIn_194_6 = var4Lifetime2;
                  stackIn_194_7 = td.field_f;
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
                  if (nm.field_o != 64) {
                    SectorCacheStore.field_a = var10;
                    gk.field_H = true;
                  } else {
                    fj.field_c = true;
                    rd.field_j = var10;
                    dv.a(true);
                    bw.d(7242);
                    pc.b((byte) 16);
                  }
                  SoftwareRaster.b();
                  CipherPacketBuffer.a(false, -1, 1, jt.field_a);
                  dn.field_Qb = false;
                  io.field_w = true;
                  continue;
                }
                if (66 == nm.field_o) {
                  if (fj.field_c ||
                    gk.field_H) {
                    if (fj.field_c &&
                      null != rd.field_j) {
                      rd.field_j.d(127, false);
                    }
                    ma.field_Z = true;
                    vs.field_j = true;
                    s.field_d = 0;
                    du.field_h = false;
                    CipherPacketBuffer.a(false, -2, 1, jt.field_a);
                    fj.field_c = false;
                    gk.field_H = false;
                    uc.a(0);
                  }
                  dn.field_Qb = false;
                  continue;
                }
                var2 = null;
                if (!fj.field_c) {
                  if (gk.field_H) {
                    var2 = SectorCacheStore.field_a;
                  }
                } else {
                  var2 = rd.field_j;
                }
                if (var2 != null) {
                  if (nm.field_o == 77) {
                    ((GameplayController) (var2)).battlefield.appendSnapshotChunk(fk.field_b, ByteStorage.field_e, (byte) -81);
                    continue;
                  }
                  if (nm.field_o == 67) {
                    if (!((GameplayController) (var2)).battlefield.field_Ab) {
                      ((GameplayController) (var2)).battlefield.snapshotBuffer.position = 0;
                      ((GameplayController) (var2)).battlefield.readLegacySnapshot(0, ((GameplayController) (var2)).battlefield.snapshotBuffer);
                      ((GameplayController) (var2)).battlefield.snapshotBuffer = null;
                      mu.field_a = new cg();
                      ((GameplayController) (var2)).field_Ib.a(((GameplayController) (var2)).battlefield.mapTheme, 0);
                      ((GameplayController) (var2)).field_d = UnitLossCondition.field_d[((GameplayController) (var2)).battlefield.mapTheme].field_n;
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
                    var3Lifetime2 = ByteStorage.field_e.readUnsignedByte(0);
                    var4Lifetime3 = ByteStorage.field_e.readUnsignedByte(0);
                    var5_intLifetime2 = ByteStorage.field_e.readUnsignedShort((byte) -104);
                    if (((GameplayController) (var2)).battlefield.currentPlayer == var3Lifetime2 &&
                      var4Lifetime3 == ((GameplayController) (var2)).battlefield.turnNumber) {
                      stackIn_256_0 = 0;
                    } else {
                      stackIn_256_0 = 1;
                    }
                    var6Lifetime1 = stackIn_256_0;
                    if (var6Lifetime1 != 0) {
                      ((GameplayController) (var2)).field_Hb = uk.field_n;
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
                  if (68 == nm.field_o) {
                    ((GameplayController) (var2)).battlefield.readGameEvent((PacketBuffer) (ByteStorage.field_e), (byte) -67);
                    if (((GameplayController) (var2)).battlefield.currentPlayer != ((GameplayController) (var2)).battlefield.localPlayer) {
                      continue;
                    }
                    if ((1 << ((GameplayController) (var2)).battlefield.localPlayer & ((GameplayController) (var2)).battlefield.eliminatedPlayerMask) == 0) {
                      continue;
                    }
                    ((GameplayController) (var2)).i(0);
                    continue;
                  }
                  if (nm.field_o == 78) {
                    RadialSummonMenu.field_d = ByteStorage.field_e.readInt(1);
                    continue;
                  }
                  if (76 == nm.field_o) {
                    var3Lifetime2 = ByteStorage.field_e.readUnsignedByte(0);
                    if (var3Lifetime2 != 0) {
                      ((GameplayController) (var2)).field_Tb = true;
                    } else {
                      ((GameplayController) (var2)).field_Tb = false;
                    }
                    ((GameplayController) (var2)).field_Vb = ByteStorage.field_e.readUnsignedShort((byte) -104);
                    continue;
                  }
                  if (nm.field_o == 69) {
                    var3_ref_int__ = new int[((GameplayController) (var2)).battlefield.teamCount];
                    var4_ref_int__ = new int[((GameplayController) (var2)).battlefield.playerCount];
                    var5 = new int[((GameplayController) (var2)).battlefield.playerCount];
                    var6Lifetime1Lifetime1 = ByteStorage.field_e.readUnsignedByte(0);
                    var7Lifetime1 = 0;
                    while (((GameplayController) (var2)).battlefield.teamCount > var7Lifetime1) {
                      var3_ref_int__[var7Lifetime1] = ByteStorage.field_e.readUnsignedByte(0);
                      var7Lifetime1++;
                    }
                    var7Lifetime1Lifetime1 = 0;
                    while (var7Lifetime1Lifetime1 < ((GameplayController) (var2)).battlefield.playerCount) {
                      var5[var7Lifetime1Lifetime1] = ByteStorage.field_e.readUnsignedByte(0);
                      var4_ref_int__[var7Lifetime1Lifetime1] = ByteStorage.field_e.readUnsignedShort((byte) -104);
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
                  if (nm.field_o == 70) {
                    ((GameplayController) (var2)).battlefield.field_C = ByteStorage.field_e.readUnsignedByte(0);
                    if (null == rd.field_j) {
                      continue;
                    }
                    dv.a(true);
                    continue;
                  }
                  if (nm.field_o == 71) {
                    ((GameplayController) (var2)).battlefield.setInactivePlayerMask(0, ByteStorage.field_e.readUnsignedByte(0));
                    if (rd.field_j == null) {
                      continue;
                    }
                    dv.a(true);
                    continue;
                  }
                  if (nm.field_o == 73) {
                    ((GameplayController) (var2)).battlefield.setEliminatedPlayerMask(ByteStorage.field_e.readUnsignedByte(0), -119);
                    if (null == rd.field_j) {
                      continue;
                    }
                    dv.a(true);
                    continue;
                  }
                  if (nm.field_o == 72) {
                    ((GameplayController) (var2)).battlefield.field_i = ByteStorage.field_e.readUnsignedByte(0);
                    if (null == rd.field_j) {
                      continue;
                    }
                    bw.d(7242);
                    continue;
                  }
                  if (nm.field_o == 73) {
                    ((GameplayController) (var2)).field_hb = ByteStorage.field_e.readUnsignedByte(0);
                    if (null == rd.field_j) {
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
          if (ma.field_Z) {
            s.field_d = 0;
          }
          if (br.field_f[82] &&
            br.field_f[74]) {
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
                  rq.field_p[jt.field_a].restoreStageSelection(100, false, 0);
                  gk.field_H = false;
                  fj.field_c = false;
                  FaceNormal.field_d = false;
                  uc.a(0);
                }
                dn.field_Qb = false;
                SpellCastAction.field_t = false;
                if (var11 != 0) {
                  dn.field_Qb = true;
                  SpellCastAction.field_t = true;
                }
              } else {
                dn.field_Qb = true;
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
              dn.field_Qb) {
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
          throw ig.addExceptionContext((Throwable) (var2), "ArmiesOfGielinor.QA(" + param0 + ')');
        }
    }

    public ArmiesOfGielinor() {
    }

    final void b(byte param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          mj.b((byte) -82);
          if (null != FixedQuaternion.field_a) {
            ck.b(-116);
          }
          pg.a(false);
          if (param0 != 103) {
            this.a(true);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ig.addExceptionContext((Throwable) ((Object) var2), "ArmiesOfGielinor.OA(" + param0 + ')');
        }
    }

    private final boolean q(int param0) {
        RuntimeException var2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (ki.field_b.ensureIndex((byte) 82) &&
            ki.field_b.ensureAllGroupsAvailable(-27927)) {
            if (i.field_Lb.ensureIndex((byte) 82) &&
              i.field_Lb.ensureAllGroupsAvailable(-27927)) {
              if (param0 > -18) {
                return false;
              }
              if (op.field_b.ensureIndex((byte) 82) &&
                op.field_b.ensureAllGroupsAvailable(-27927)) {
                if (bi.field_f.ensureIndex((byte) 82) &&
                  bi.field_f.ensureAllGroupsAvailable(-27927)) {
                  if (nm.field_s.ensureIndex((byte) 82) &&
                    nm.field_s.ensureAllGroupsAvailable(-27927)) {
                    return true;
                  }
                  bn.a((byte) -24, 67.0f, ao.a(cr.field_eb, true, en.field_G, nm.field_s));
                  return false;
                }
                bn.a((byte) -24, 67.0f, ao.a(cr.field_eb, true, en.field_G, bi.field_f));
                return false;
              }
              bn.a((byte) -24, 67.0f, vl.a(op.field_b, 0, en.field_G, "", cr.field_eb));
              return false;
            }
            bn.a((byte) -24, 67.0f, ao.a(cr.field_eb, true, en.field_G, i.field_Lb));
            return false;
          }
          bn.a((byte) -24, 67.0f, ao.a(cr.field_eb, true, en.field_G, ki.field_b));
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ig.addExceptionContext((Throwable) ((Object) var2), "ArmiesOfGielinor.KA(" + param0 + ')');
        }
    }

    public final void init() {
        try {
          this.a((byte) 31, 25, "armiesofgielinor");
        } catch (RuntimeException runtimeException) {
          throw ig.addExceptionContext((Throwable) ((Object) runtimeException), "ArmiesOfGielinor.init()");
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
            if (null != oa.field_I) {
              oa.field_I.a((byte) -120, true);
            }
            boolean decompiledFrameRemainder3 = true;
            var4 = 0;
            if (!param1) {
              boolean decompiledFrameCompleted1 = true;
              boolean decompiledFrameRemainder2 = true;
              if (jt.field_a == -1) {
                if (!FaceNormal.field_d) {
                  if (rd.field_j == null) {
                    CipherPacketBuffer.a(false, 0, 1, jt.field_a);
                    decompiledFrameRemainder2 = (var8 != 0);
                  }
                  if (decompiledFrameRemainder2) {
                    rd.field_j.a(112, true);
                    while (Unit.i((byte) -89)) {
                      if (gu.a(param0 + 56)) {
                        continue;
                      }
                      rd.field_j.g(false);
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
                      (nm.a(jt.field_a, true))) {
                      rq.field_p[jt.field_a].d((byte) -109);
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
                qc.field_j = qc.field_j + 1;
              }
              if ((decompiledFrameRemainder3) &&
                (50 == qc.field_j)) {
                ut.i((byte) 127);
              }
            }
            boolean decompiledFrameRemainder1 = true;
            boolean decompiledFrameCompleted0 = true;
            if (FaceNormal.field_d &&
              !SpellCastAction.field_t &&
              !dn.field_Qb) {
              if (fj.field_c &&
                hf.field_c) {
                var3_int = 0;
              }
              wt.a(73, var3_int != 0);
              if (gk.field_H) {
                SectorCacheStore.field_a.a(109, var4 != 0);
              }
              if (fj.field_c) {
                PaletteRegionMap.a(320, 180, var4 != 0, 0);
                rd.field_j.a(param0 + 119, var4 != 0);
              }
              while (Unit.i((byte) -127)) {
                if (gu.a(param0 - 126) &&
                  var8 == 0) {
                  continue;
                }
                boolean decompiledFrameRemainder0 = true;
                if (ma.field_Z) {
                  if (!fj.field_c) {
                    NodeIterator.a(12, 15, 13, param0 + 50);
                    decompiledFrameRemainder0 = (var8 != 0);
                  }
                  if (decompiledFrameRemainder0) {
                    stackIn_97_0 = -66;
                    if (qa.field_F) {
                      stackIn_98_1 = 77;
                    } else {
                      stackIn_98_1 = 12;
                    }
                    if (qa.field_F) {
                      stackIn_102_2 = 78;
                    } else {
                      stackIn_102_2 = 15;
                    }
                    if (ja.$cfr$intArgs$a$78278125798b(stackIn_97_0, stackIn_98_1, stackIn_102_2, 13) &&
                      var8 == 0) {
                      continue;
                    }
                  }
                }
                if (gk.field_H) {
                  SectorCacheStore.field_a.g(false);
                }
                if (!fj.field_c) {
                  continue;
                }
                rd.field_j.g(false);
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
            if (ma.field_Z) {
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
            if (null != ai.field_P.first((byte) 111)) {
              fieldTemp$0 = lq.field_b + 1;
              lq.field_b = lq.field_b + 1;
              if (fieldTemp$0 == 335) {
                lq.field_b = 0;
                ai.field_P.a(0);
              }
            }
            decompiledFrameRemainder4 = (var8 != 0);
          }
          if (decompiledFrameRemainder4) {
            if (~DirectByteStorage.field_h == ~pg.field_f) {
              pk.field_X = pk.field_X + 1;
              decompiledFrameRemainder4 = (pk.field_X == 16);
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
                pk.field_X = pk.field_X - 1;
                decompiledFrameRemainder4 = (pk.field_X == 0);
                if (decompiledFrameRemainder4) {
                  pg.field_f = pg.field_e;
                  decompiledFrameRemainder4 = (var8 != 0);
                }
              }
              if (decompiledFrameRemainder4) {
                if (!DamageEvent.g(119)) {
                  if (pq.field_f != null) {
                    UnitSpell.a(3, 1, pq.field_f);
                  }
                  CombatPresentation.n(param0 ^ -110);
                  CipherPacketBuffer.a(false, tg.field_a, 1, 0);
                  if (ke.field_a) {
                    ke.field_a = false;
                    AiPlanningStrategy.a(false, 8028);
                  }
                  if (tv.field_a) {
                    CipherPacketBuffer.a(false, -4, 1, jt.field_a);
                  }
                  if (nm.a(jt.field_a, true)) {
                    ut.i((byte) 125);
                  }
                }
                pg.field_f = mq.field_Wb;
              }
            }
          }
          if (param0 != 0) {
            this.a((byte) -98);
          }
          if (jt.field_a == -3) {
            this.a(false, (byte) -62);
            rd.field_j.h(true);
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
              stackIn_197_2 = ku.getStoredQuicksave(127);
            }
            ts.startCampaignMission(stackIn_196_0, stackIn_196_1, stackIn_197_2);
            if (jt.field_a == -10) {
              qh.requestDeleteQuicksave((byte) 27);
            }
            rd.field_j.h(true);
            var3_intLifetime2 = r.field_s ? 1 : 0;
            CipherPacketBuffer.a(var3_intLifetime2 != 0, -1, 1, 0);
            du.field_h = true;
          }
          if (jt.field_a == -8) {
            this.a(true, (byte) -67);
            rd.field_j.k((byte) -113);
            rd.field_j.h(true);
            var3_intLifetime3 = r.field_s ? 1 : 0;
            CipherPacketBuffer.a(var3_intLifetime3 != 0, -1, 1, 0);
            du.field_h = true;
          }
          if (jt.field_a == -9) {
            this.a(true, (byte) -90);
            rd.field_j.startEquipmentTutorial((byte) 60);
            rd.field_j.h(true);
            var3_intLifetime4 = r.field_s ? 1 : 0;
            CipherPacketBuffer.a(var3_intLifetime4 != 0, -1, 1, 0);
            du.field_h = true;
          }
          if (-4 == jt.field_a) {
            vl.outgoingPacket.writeCipheredOpcode(32161, 9);
            SpellCastAction.field_t = true;
            TelepopEvent.field_F = mj.field_c;
          }
          if (jt.field_a == -5) {
            boolean decompiledSharedTail0 = !(gk.field_H);
            if (!decompiledSharedTail0) {
              ov.a(11, 3, 0);
              decompiledSharedTail0 = (var8 != 0);
            }
            if ((decompiledSharedTail0) &&
              (fj.field_c)) {
              pq.a(-81, vu.field_M.d((byte) 117), 11);
            }
            dn.field_Qb = true;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw ig.addExceptionContext((Throwable) ((Object) var3), "ArmiesOfGielinor.EA(" + param0 + ',' + param1 + ')');
        }
    }

    final void a(int param0) {
        boolean stackIn_21_0 = false;
        boolean stackIn_65_0 = false;
        RuntimeException decompiledCaughtException = null;
        java.awt.Canvas var2 = null;
        RuntimeException var2_ref = null;
        GameplayController var3 = null;
        int var4 = 0;
        try {
          var2 = ll.p(0);
          if (PopupPresentation.h(param0 ^ 31337)) {
            iv.a(false, fs.a(false), var2);
            return;
          }
          if (!qu.field_q) {
            PaletteRegionMap.a((byte) 121, var2);
            return;
          }
          if (!UiSelectionState.d(param0 + 95)) {
            bn.a((byte) -24, 100.0f, en.field_G);
            PaletteRegionMap.a((byte) 122, var2);
            return;
          }
          stackIn_21_0 = ((rd.field_j != null ||
            null != SectorCacheStore.field_a) &&
            jt.field_a == 7);
          io.field_w = stackIn_21_0;
          if (param0 > ~AiPlanningStrategy.field_d &&
            -1 < ko.field_b) {
          }
          BoundedFile.a(jt.field_a, true, io.field_w, false);
          if (null != mu.field_a) {
            mu.field_a.a(param0 ^ 8, qc.field_j);
            qc.field_j = qc.field_j + 1;
            if (50 == qc.field_j) {
              ut.i((byte) 126);
            }
          }
          if (!io.field_w ||
            !du.field_h) {
            tq.a(sq.c((byte) 54), false);
          }
          var3 = rd.field_j;
          if (gk.field_H) {
            var3 = SectorCacheStore.field_a;
          }
          if (var3 != null &&
            null == var3.movementPlanner) {
            ig.field_t.draw(0, 0);
            fe.c(ManaEvent.field_A, 320, 200, nd.field_b, false);
          }
          this.c(false);
          if (null != oa.field_I) {
            oa.field_I.b(89);
          }
          if (!ed.a(-89)) {
            if (an.e((byte) 93)) {
              SoftwareRaster.d(0, 0, SoftwareRaster.width, SoftwareRaster.height);
              an.h(1976460609);
              if (obfuscationControl) {
                if (FixedQuaternion.field_a == null) {
                  stackIn_65_0 = ph.field_f;
                } else {
                  stackIn_65_0 = true;
                }
                bl.a(stackIn_65_0, -5);
              }
            }
          } else {
            if (FixedQuaternion.field_a == null) {
              stackIn_65_0 = ph.field_f;
            } else {
              stackIn_65_0 = true;
            }
            bl.a(stackIn_65_0, -5);
          }
          if (~pg.field_f != ~pg.field_e) {
            var4 = pk.field_X * 256 / 16;
            if (var4 > 0) {
              SoftwareRaster.b(0, 0, SoftwareRaster.width, SoftwareRaster.height, 0, var4);
            }
          }
          if (BufferedSocket.field_j >= 2 &&
            CoatOfArms.field_e) {
            rs.field_n.b(Integer.toString(UnitModelPreview.field_i), 8, 23, 16777215, 1);
            rs.field_n.a((Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory()) / 1024L + "kB", 500, 100, 16777215, 1);
            rs.field_n.a(Runtime.getRuntime().totalMemory() / 1024L + "kB", 500, 120, 16777215, 1);
          }
          oa.h(2);
          pt.a(0, 12, var2, 0);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw ig.addExceptionContext((Throwable) ((Object) var2_ref), "ArmiesOfGielinor.DA(" + param0 + ')');
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
          throw ig.addExceptionContext((Throwable) ((Object) var1), "ArmiesOfGielinor.MA(" + param0 + ')');
        }
    }

    final void d(byte param0) {
        try {
          ArmiesOfGielinor.s(3);
          jg.a(-112);
          NodeDeque.c(param0 + 322);
          ResourceArchive.b(param0 + 71);
          rr.a(-114);
          et.c(13626);
          ed.b(15000);
          gi.a(180);
          wn.c((byte) 52);
          nm.e(256);
          gp.a((byte) 115);
          us.a(param0 ^ 30);
          CampaignMenu.d((byte) 44);
          dg.a((byte) -12);
          ve.a(1);
          CombatSandbox.a((byte) -8);
          hc.b(1017);
          qt.a((byte) 93);
          s.a(53);
          Spell.b(param0 - 1700635368);
          hg.a(true);
          t.a(0);
          cd.a(false);
          bt.c(0);
          gv.b(93);
          fe.b();
          vi.a(true);
          wf.h(71);
          ContextualRuntimeException.c(1);
          iv.d(105);
          fa.a((byte) 100);
          pq.a((byte) -79);
          el.b(-8834);
          SoftwareRaster.d();
          ah.a((byte) 32);
          PacketBuffer.f(115);
          l.a(true);
          pv.a(213);
          hb.a(param0 ^ 71);
          dt.a(-1);
          qk.a(50);
          ov.a((byte) 50);
          mo.a(0);
          er.a(-3);
          ds.a(2);
          qc.a((byte) -108);
          bi.b(0);
          jp.a((byte) -82);
          rd.a(param0 ^ -20000072);
          fj.b((byte) -67);
          CoatOfArms.a(false);
          co.a((byte) -117);
          ep.a((byte) 11);
          PlayerProfile.b(0);
          CampaignQuicksave.a(param0 + 157);
          p.a((byte) -58);
          TutorialController.h(param0 + 71);
          cg.a((byte) -109);
          GameplayController.d(param0 ^ 49);
          vd.a(256);
          lb.a(param0 + 13988);
          CampaignMission.f(0);
          ij.c(param0 ^ 3);
          ResourceProtocolClient.c((byte) 35);
          DiskCacheWorker.a(true);
          dd.b(-56);
          BufferedFile.b((byte) 78);
          BufferedSocket.b((byte) 99);
          Unit.q(-9480);
          Battlefield.c(-1);
          BitmapFont.a();
          ke.a(param0 + 156);
          IntrusiveNode.b((byte) 4);
          wh.b(0);
          ji.a(0);
          ih.f(-128);
          lt.b(-51);
          ev.a(960112080);
          rc.g();
          NodeHashTable.a(-83);
          mi.a(9480);
          dw.c();
          os.f(1048575);
          dj.b((byte) 116);
          it.a(param0 + 76);
          je.h(-117);
          au.e((byte) -58);
          tp.a(-116);
          of.e((byte) 20);
          ii.a((byte) -1);
          ArchiveIndex.a(param0 + 2);
          lg.a((byte) 126);
          ArchiveProvider.a(false);
          aq.a((byte) -22);
          hq.a((byte) -73);
          wl.f((byte) 97);
          gk.l(17);
          oe.j((byte) 126);
          cr.n(260);
          lw.j((byte) 49);
          ro.n(0);
          kd.f((byte) 19);
          ce.k(param0 ^ -11944);
          df.b(true);
          na.f((byte) -117);
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
          PaletteRegionMap.a(param0 + 7814);
          tm.b();
          MatchSetupPanel.g(256);
          InstructionsPanel.q(-114);
          la.b((byte) -111);
          sg.a((byte) 93);
          IntPair.a(-10);
          SpellMenuGroup.a(-84);
          TutorialLayout.a(param0 ^ -4368117);
          oo.b(-8616);
          UiSelectionState.c((byte) 110);
          fs.a(-1);
          SpellCastAction.e(-4541);
          AiPlanner.a(-27464);
          su.a(true);
          CampaignRewardPreview.a(126);
          CombatEvent.e((byte) -127);
          ManaEvent.g(-829);
          MoveEvent.g(param0 ^ -29395);
          SummonEvent.d((byte) 113);
          TurnEffectEvent.a(true);
          DeployRequest.a((byte) 44);
          SphinxActionRequest.f(-27538);
          SummonRequest.a((byte) -58);
          GlobalSpell.a((byte) 103);
          UnitSpell.c(6);
          UnitModelPreview.b(param0 ^ 298276648);
          SpellConfirmationDialog.a(param0 + 173);
          MovementPlanner.b(-104);
          RadialSummonMenu.a((byte) -122);
          UnitCycler.a((byte) -55);
          BattleCamera.d((byte) 55);
          BattleUnitRenderer.a(0);
          TurnTimerDial.a((byte) -95);
          BattleTutorial.b(1);
          EventPresenter.f(-126);
          GameEvent.a((byte) -103);
          UnitInfoPopup.a(param0 ^ 101);
          ActionSpell.a(false);
          ActionRequest.a(100);
          CipherPacketBuffer.k((byte) -97);
          km.e(param0 + 77);
          CombatPresentation.c(-128);
          AnimationPlayer.b(-106);
          ModelMesh.c();
          DualLinkedNode.f(param0 ^ 71);
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
          nf.k(param0 ^ -72);
          dn.k(0);
          fp.k(21755);
          ll.k(-1);
          im.g(31343);
          np.e((byte) 5);
          mp.l(-8291);
          tg.a(-97);
          i.m(73);
          ea.a(-47);
          bn.a(29022);
          lm.a(1638);
          ki.a((byte) 117);
          ck.a(14);
          th.a((byte) 73);
          h.a(-25764);
          af.b((byte) -120);
          uh.a(param0 + 20115);
          DualNodeDeque.d(125);
          dv.c((byte) -109);
          rq.a(-22823);
          cp.a(false);
          dp.f((byte) -123);
          IndexedSpriteBase.a(18347);
          hf.a((byte) 19);
          dq.a(-1);
          ou.a(4116);
          NodeIterator.a((byte) -121);
          vs.a(param0 ^ 21);
          nr.a((byte) -119);
          so.b(param0 ^ -328);
          jn.a(param0 - 29);
          op.a(true);
          IsaacRandom.b(-119);
          pg.a(20);
          ml.k(2);
          oc.k(param0 ^ -72);
          MatchConditionRegistry.a(true);
          LeaderEscortCondition.e(25931);
          UnitLossCondition.d(param0 + 196);
          PortalLossCondition.d(-12428);
          ul.b(param0 ^ -90);
          wp.e((byte) -74);
          TileMetadata.a(23582);
          fd.a(-30097);
          AnimationSequence.a(param0 ^ 125);
          qf.a((byte) 31);
          pn.b((byte) -90);
          r.d((byte) -11);
          sh.b((byte) 40);
          pd.a((byte) 95);
          hk.l(param0 ^ 55);
          jk.a(param0 ^ -28);
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
          lk.a((byte) 58);
          kb.c((byte) -124);
          nl.i(-98);
          ju.a(param0 - 51);
          ut.p(0);
          ls.a(-121);
          vq.a((byte) 107);
          sf.h((byte) 58);
          gh.a(param0 - 11763);
          fw.i(0);
          ob.e((byte) 68);
          tj.d((byte) -89);
          hs.i(0);
          vr.a((byte) -37);
          jj.a((byte) -112);
          rh.a(-74);
          TaggedMapData.a(-91);
          tf.a(false);
          BattleCharacter.c(-1);
          CombatViewTransition.b((byte) 120);
          br.a(111);
          vt.a(false);
          ng.w(0);
          MeshObject.a(-66);
          FaceNormal.a((byte) -101);
          VertexNormal.a(param0 - 14619);
          ig.e(77);
          mv.a((byte) -48);
          ht.a();
          rv.a(param0 ^ -72);
          PreparedAction.a(28038);
          VineGrowthAction.a((byte) 119);
          MoveAttackAction.e(param0 + 4);
          TeleportAction.a(false);
          SocketResourceClient.e(param0 - 4024);
          NetworkResourceRequest.h(param0 ^ 29322);
          SectorCacheStore.b(1);
          DiskCacheRequest.h(param0 ^ -61);
          CachedArchiveProvider.e(param0 - 56);
          ek.a(236611664);
          ResourceRequest.e((byte) -126);
          is.a((byte) -5);
          qs.b();
          bq.a(30156);
          pu.a((byte) -114);
          uc.a((byte) -39);
          gt.a(494);
          de.a((byte) -116);
          le.a(79);
          bk.a(true);
          od.a(param0 ^ 71);
          cw.a((byte) -118);
          un.a();
          mj.c((byte) -82);
          lp.a(param0 ^ -13095008);
          cu.a((byte) -121);
          e.b((byte) -13);
          mq.k(85);
          bl.a(40);
          rf.a((byte) -110);
          va.h(-97);
          ar.e((byte) -74);
          ri.a((byte) -57);
          du.b(16);
          ug.a(16);
          uk.d(0);
          dh.c(-117);
          hu.a();
          vc.a(-119);
          AiInfluenceMap.a(61);
          AiPlanningStrategy.a(-1);
          ja.e(-93);
          j.b((byte) 125);
          RadialSummonItem.b(76);
          sq.a(false);
          DeployAction.a(true);
          c.a(param0 + 157);
          SummonAction.a((byte) 113);
          k.a(param0 ^ 75);
          bw.a(-28911);
          StateChangeMarker.a((byte) -3);
          DisplacedUnitMarker.e(1223);
          DeployEvent.g(-125);
          CorpseConditionMarker.a(true);
          SkeletonLimitMarker.a(false);
          ParasiteEvent.d((byte) 46);
          KingBlackDragonEvent.g(-43);
          TelepopEvent.g(param0 - 9);
          GrowthEvent.g(-74);
          io.a((byte) 52);
          fq.a((byte) 99);
          ta.j(-12819);
          ma.g((byte) -127);
          fn.m(32);
          pt.i(param0);
          rj.a((byte) -85);
          kv.b(true);
          hv.b(true);
          kw.b(true);
          pk.c(false);
          vu.a(58);
          mk.f(-1);
          qd.k(-15);
          ws.a(param0 + 197);
          pi.a((byte) -63);
          AttackEvent.a(false);
          jv.a((byte) 36);
          BestScoreStrategy.c((byte) 110);
          AiActionCandidate.f(param0 ^ -123);
          WeightedScoreStrategy.c(-104);
          vf.c(param0 ^ 18);
          FixedQuaternion.a((byte) -57);
          MovementPresentation.g(67);
          EffectPresentation.c(param0 ^ 40);
          ph.a((byte) -54);
          sb.b(false);
          no.c(false);
          wb.a(false);
          bs.a(true);
          tq.a((byte) -84);
          en.n(0);
          ai.b(false);
          nb.d((byte) 68);
          DirectByteStorage.c(1);
          fh.a((byte) -28);
          ak.c(true);
          wc.j(0);
          ku.k(param0 ^ -36);
          cs.b(true);
          tn.n(param0 + 72);
          qm.j(param0 + 150);
          nv.l(-24061);
          m.a(false);
          wg.a(19345);
          uq.g(param0 ^ 91);
          me.a((byte) -36);
          f.c(true);
          pc.d(35);
          lc.a();
          mu.a(0);
          tl.a((byte) 100);
          sp.a((byte) -121);
          wj.a(true);
          aj.a(param0 + 155);
          ko.a(false);
          nt.a((byte) 97);
          vk.a(-4740);
          te.a((byte) -75);
          CampaignDefinition.a((byte) 9);
          CampaignParticipant.a((byte) -95);
          CampaignUnitOverride.a(param0 ^ -10);
          CampaignMenuButton.c(param0 ^ -72);
          CampaignMenuEntry.a(-101);
          bj.a(param0 ^ -72);
          nu.a(-26601);
          td.a(-127);
          lu.a(1);
          ol.b((byte) 117);
          oi.b(true);
          bh.c(false);
          ps.c(false);
          hl.k(param0 - 4103);
          we.a((byte) 120);
          b.a(true);
          iw.a(-25771);
          vg.a((byte) 89);
          li.a((byte) 74);
          og.a(true);
          nd.a((byte) -114);
          dr.d((byte) 126);
          ef.a(0);
          cb.a(125);
          TextCursor.a(param0 - 51);
          es.b(-119);
          TeamRoster.b(-51);
          fo.a(true);
          sa.a((byte) 96);
          qu.a(param0 + 1);
          wm.a(-10743);
          wd.a(200);
          ad.a((byte) 63);
          fg.a(-22856);
          CampaignResult.a((byte) -116);
          RegionAnchor.a(true);
          pf.b((byte) -49);
          wv.c((byte) -3);
          oq.a(120);
          eq.a(true);
          re.g(-90);
          ba.i(113);
          jq.g(-5);
          qa.g(1);
          oh.g(param0 + 21408);
          mw.g(12600);
          wt.e((byte) 120);
          qp.g(123);
          an.g(param0 ^ -1746174247);
          oa.g(-128);
          gg.g(-2260);
          ot.e((byte) -97);
          MatchConditionEntry.a((byte) -127);
          on.a(-7);
          rs.a((byte) -121);
          jl.a(-125);
          ip.a(param0 ^ 36);
          ts.b(param0 ^ 26972);
          gs.a((byte) 86);
          fc.a(param0 ^ 43);
          fk.a(true);
          kq.a(param0 ^ -3);
          pp.b(false);
          uj.h(29151);
          vl.b(true);
          kt.g(param0 ^ -55);
          jh.h(-117);
          di.g(49);
          tv.a((byte) -126);
          ct.a(135);
          gu.b(-16356);
          rb.d(65280);
          rn.a(false);
          this.field_p = null;
        } catch (RuntimeException runtimeException) {
          throw ig.addExceptionContext((Throwable) ((Object) runtimeException), "ArmiesOfGielinor.GA(" + param0 + ')');
        }
    }

    final void a(boolean param0) {
        int stackIn_10_0 = 0;
        int stackIn_10_1 = 0;
        int stackIn_26_0 = 0;
        RuntimeException decompiledCaughtException = null;
        wn var2 = null;
        RuntimeException var2_ref = null;
        wn var3 = null;
        nm var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        var7 = obfuscationControl ? 1 : 0;
        try {
          li.field_n = new Random(vi.b(-108));
          this.a(4, 68, 24, 2, -119, 0, 1);
          UnitSpell.a(52, new lt());
          var2 = new wn();
          var3 = new wn(var2);
          var4 = new nm(var2, var3);
          var4.field_w.a(-1, 128, 9);
          var4.field_D.a(-1, 128, 9);
          var5 = 0;
          do {
            if (!(CorpseConditionMarker.field_u.field_a.length > var5)) {
              lk.a(IntPair.field_m, 22050, var4, (byte) 68, true, (java.awt.Component) ((Object) IndexedSpriteBase.field_b));
              kb.field_o = new int[7];
              break;
            }
            CorpseConditionMarker.field_u.field_a[var5] = 256;
            var5++;
          } while (var7 == 0);
          var5 = 0;
          while (true) {
            stackIn_10_0 = var5;
            stackIn_10_1 = 7;
            if (stackIn_10_0 < stackIn_10_1) {
              kb.field_o[var5] = 0;
              stackIn_26_0 = ~var5;
              if (var7 == 0) {
                if (stackIn_26_0 > -5) {
                  var6 = 0;
                  while (!(var6 >= wp.unitUnlockGroups[var5].length)) {
                    stackIn_10_0 = ~bw.unitDefinitions[wp.unitUnlockGroups[var5][var6]][11];
                    stackIn_10_1 = -1;
                    if (stackIn_10_0 == stackIn_10_1) {
                      kb.field_o[var5] = oe.c(kb.field_o[var5], 1 << var6);
                    }
                    var6++;
                  }
                }
                var5++;
                continue;
              }
            } else {
              UnitLossCondition.field_d = TeleportAction.e(-10128);
              this.a(true, false, true, true, 55, false, true);
              jv.field_d = pi.field_M;
              sh.field_a[65] = -2;
              stackIn_26_0 = param0 ? 1 : 0;
            }
            bj.field_k = stackIn_26_0 != 0;
            sh.field_a[80] = -2;
            sh.field_a[77] = -2;
            sh.field_a[68] = -1;
            sh.field_a[9] = -1;
            sh.field_a[81] = -1;
            sh.field_a[72] = 1;
            sh.field_a[78] = 4;
            sh.field_a[82] = -2;
            sh.field_a[79] = 4;
            ke.field_b = m.field_f;
            sh.field_a[73] = 1;
            sh.field_a[75] = 12;
            sh.field_a[74] = -1;
            iv.field_e = DeployEvent.field_C;
            sh.field_a[76] = 3;
            sh.field_a[70] = 1;
            sh.field_a[64] = -2;
            sh.field_a[10] = -1;
            sh.field_a[71] = 1;
            sh.field_a[67] = 4;
            fs.field_d = hc.field_o;
            sh.field_a[69] = -1;
            return;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw ig.addExceptionContext((Throwable) ((Object) var2_ref), "ArmiesOfGielinor.FA(" + param0 + ')');
        }
    }

    private final void p(int param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          if (null != RegionAnchor.field_o) {
            TickCounter.loadClientAssets(RegionAnchor.field_o, 10207);
            IntKeyLookup.a(UnitLossCondition.field_d, (byte) 62);
            RegionAnchor.field_o = null;
            wl.a(0);
          }
          bt.field_e = nu.a(3, true);
          iw.field_l = DamageEvent.a(0, 5, (byte) 102, false, false);
          sh.field_j = nu.a(6, true);
          br.field_d = nu.a(7, true);
          SpellConfirmationDialog.field_f = nu.a(8, true);
          ep.field_b = nu.a(9, true);
          SummonAction.field_w = nu.a(10, true);
          CorpseConditionMarker.field_w = nu.a(11, true);
          ki.field_b = nu.a(12, true);
          op.field_b = nu.a(15, true);
          bi.field_f = nu.a(14, true);
          nm.field_s = nu.a(param0, true);
          i.field_Lb = nu.a(18, true);
          ce.field_M = nu.a(19, true);
          oh.field_M = nu.a(20, true);
          fw.field_F = nu.a(22, true);
          vc.field_m = DamageEvent.a(0, 21, (byte) 127, false, false);
          AiInfluenceMap.field_f = nu.a(23, true);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ig.addExceptionContext((Throwable) ((Object) var2), "ArmiesOfGielinor.JA(" + param0 + ')');
        }
    }

    final static tu a(byte[] param0, boolean param1) {
        tu var2 = null;
        RuntimeException var2_ref = null;
        Object stackIn_5_0 = null;
        tu stackIn_7_0 = null;
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
            return (tu) (stackIn_5_0);
          }
          var2 = new tu(param0, j.field_e, CampaignMenuButton.field_g, qm.field_K, c.field_e, AnimationPlayer.field_j);
          rj.d((byte) 124);
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
          throw ig.addExceptionContext((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(param1).append(')').toString());
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
        dg stackIn_20_7;
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
          pq.field_f = null;
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
              var4_ref_String = mv.field_d;
              var3 = new String[2];
              if (var4_ref_String == null) {
                var4_ref_String = BoundedFile.field_i;
              }
              var3[1] = vs.field_b;
              var3[0] = var4_ref_String;
            }
            td.field_f.a(wf.field_D, 0);
            qa.field_F = false;
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
          stackIn_20_7 = td.field_f;
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
            if (!rf.a(27875)) {
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
          rd.field_j = new GameplayController(stackIn_20_2, (int) stackIn_20_3, stackIn_20_4, stackIn_20_5, stackIn_20_6, stackIn_20_7, stackIn_21_8, stackIn_24_9, stackIn_24_10, stackIn_24_11, stackIn_24_12, stackIn_24_13, stackIn_25_14, (CampaignMission) null);
          rd.field_j.battlefield.playerCoats = new CoatOfArms[r.field_B];
          rd.field_j.battlefield.field_F = true;
          var5 = 0;
          while (r.field_B > var5) {
            rd.field_j.battlefield.playerCoats[var5] = ah.localCoat;
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
          throw ig.addExceptionContext((Throwable) ((Object) var3_ref), "ArmiesOfGielinor.HA(" + param0 + ',' + param1 + ')');
        }
    }

    private final boolean c(int param0, boolean param1) {
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        String var4 = null;
        int var5_int = 0;
        ih var5 = null;
        IndexedSprite[] var5_array = null;
        co[] var5_array2 = null;
        um[] var6 = null;
        co[] var6_array = null;
        int[] var6_array2 = null;
        int var6_int = 0;
        int var7_int = 0;
        int[] var7 = null;
        co var7_ref = null;
        um var8 = null;
        co var8_ref = null;
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
          if (qu.field_q) {
            return true;
          }
          var3_int = -78 / ((param0 + 45) / 46);
          j.a((byte) 119);
          var4 = "basicfont12";
          if (null != br.field_d) {
            if (gg.field_K.ensureIndex((byte) 82) &&
              gg.field_K.ensureGroupAvailableByName(28979, "basic")) {
              if (gg.field_K.ensureIndex((byte) 82) &&
                gg.field_K.ensureGroupAvailableByName(28979, var4)) {
                if (ResourceRequest.field_A.ensureIndex((byte) 82) &&
                  ResourceRequest.field_A.ensureGroupAvailableByName(28979, var4)) {
                  if (gg.field_K.ensureIndex((byte) 82) &&
                    gg.field_K.ensureGroupAvailableByName(28979, "lobby")) {
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
                                      if (ce.field_M.ensureIndex((byte) 82) &&
                                        ce.field_M.ensureAllGroupsAvailable(-27927)) {
                                        if (oh.field_M.ensureIndex((byte) 82) &&
                                          oh.field_M.ensureAllGroupsAvailable(-27927)) {
                                          if (fw.field_F.ensureIndex((byte) 82) &&
                                            fw.field_F.ensureAllGroupsAvailable(-27927)) {
                                            if (AiInfluenceMap.field_f.ensureIndex((byte) 82) &&
                                              AiInfluenceMap.field_f.ensureAllGroupsAvailable(-27927)) {
                                              if (vc.field_m.ensureIndex((byte) 82) &&
                                                vc.field_m.ensureAllGroupsAvailable(-27927)) {
                                                if (!this.q(-46)) {
                                                  return false;
                                                }
                                                if (!param1) {
                                                  return false;
                                                }
                                                UpkeepEvent.h(65);
                                                bn.a((byte) -24, 70.0f, ph.field_a);
                                                this.a(0);
                                                jl.field_d = new p(br.field_d, SpellConfirmationDialog.field_f);
                                                im.field_v[0] = jl.field_d.a("sword_slash_4", (byte) -97, "");
                                                im.field_v[1] = jl.field_d.a("runewars_menu_mouseover", (byte) -97, "");
                                                im.field_v[2] = jl.field_d.a("runewars_select_menu_item", (byte) -97, "");
                                                im.field_v[3] = jl.field_d.a("runewars_select_unit", (byte) -97, "");
                                                im.field_v[4] = jl.field_d.a("runewars_select_position", (byte) -97, "");
                                                im.field_v[5] = jl.field_d.a("runewars_errorsound", (byte) -97, "");
                                                im.field_v[6] = jl.field_d.a("runewars_teleport_all", (byte) -97, "");
                                                im.field_v[8] = jl.field_d.a((byte) -128, "", "runewars_capture_fanfare");
                                                im.field_v[9] = jl.field_d.a("runewars_select_flag", (byte) -97, "");
                                                im.field_v[10] = jl.field_d.a("runewars_paint_flag", (byte) -97, "");
                                                im.field_v[11] = jl.field_d.a("runewars_swap_spellbook", (byte) -97, "");
                                                im.field_v[12] = jl.field_d.a("runewars_select_spell", (byte) -97, "");
                                                im.field_v[13] = jl.field_d.a("runewars_transition", (byte) -97, "");
                                                im.field_v[14] = jl.field_d.a("runewars_purchase_unit", (byte) -97, "");
                                                im.field_v[15] = jl.field_d.a("runewars_choose_alignment", (byte) -97, "");
                                                im.field_v[16] = jl.field_d.a("runewars_clock_tick", (byte) -97, "");
                                                im.field_v[17] = jl.field_d.a("runewars_time_over_dong", (byte) -97, "");
                                                im.field_v[18] = jl.field_d.a("runewars_turnover_page_map", (byte) -97, "");
                                                var5_array2 = UnitLossCondition.field_d;
                                                var6_int = 0;
                                                do {
                                                  if (var6_int >= var5_array2.length) {
                                                    el.field_b[0] = jl.field_d.a("runewars_mana_whoosh", (byte) -97, "");
                                                    break;
                                                  }
                                                  var7_ref = var5_array2[var6_int];
                                                  var7_ref.a(17952, jl.field_d);
                                                  var6_int++;
                                                } while (var18 == 0);
                                                var5_int = 0;
                                                do {
                                                  if (var5_int >= 8) {
                                                    TurnTimerDial.a(126, jl.field_d);
                                                    ml.a(jl.field_d, (byte) 123);
                                                    br.field_d = null;
                                                    wl.a(0);
                                                    break;
                                                  }
                                                  el.field_b[var5_int + 1] = jl.field_d.a("runewars_mana_stars_" + (1 + var5_int), (byte) -97, "");
                                                  var5_int++;
                                                } while (var18 == 0);
                                                return false;
                                              }
                                              bn.a((byte) -24, 69.0f, ao.a(cr.field_eb, true, en.field_G, vc.field_m));
                                              return false;
                                            }
                                            bn.a((byte) -24, 66.0f, ao.a(cr.field_eb, true, en.field_G, AiInfluenceMap.field_f));
                                            return false;
                                          }
                                          bn.a((byte) -24, 63.0f, ao.a(cr.field_eb, true, en.field_G, fw.field_F));
                                          return false;
                                        }
                                        bn.a((byte) -24, 61.0f, ao.a(cr.field_eb, true, en.field_G, oh.field_M));
                                        return false;
                                      }
                                      bn.a((byte) -24, 58.0f, ao.a(cr.field_eb, true, en.field_G, ce.field_M));
                                      return false;
                                    }
                                    bn.a((byte) -24, 56.0f, ao.a(cr.field_eb, true, en.field_G, CorpseConditionMarker.field_w));
                                    return false;
                                  }
                                  bn.a((byte) -24, 54.0f, vl.a(bt.field_e, 0, en.field_G, "", cr.field_eb));
                                  return false;
                                }
                                bn.a((byte) -24, 52.0f, vl.a(sh.field_j, 0, rf.field_a, "basic", is.field_f));
                                return false;
                              }
                              bn.a((byte) -24, 41.0f, vl.a(iw.field_l, 0, Battlefield.field_nb, "basic", TileMetadata.field_i));
                              return false;
                            }
                            bn.a((byte) -24, 38.0f, vl.a(SummonAction.field_w, 0, is.field_d, "", PacketBuffer.field_m));
                            return false;
                          }
                          bn.a((byte) -24, 33.0f, df.a(is.field_d, 0, ep.field_b, -27638, PacketBuffer.field_m));
                          return false;
                        }
                        bn.a((byte) -24, 28.0f, vl.a(SpellConfirmationDialog.field_f, 0, ds.field_b, "", ResourceProtocolClient.field_k));
                        return false;
                      }
                      bn.a((byte) -24, 23.0f, vl.a(br.field_d, 0, ds.field_b, "", ResourceProtocolClient.field_k));
                      return false;
                    }
                    bn.a((byte) -24, 21.0f, vl.a(ResourceRequest.field_A, 0, rf.field_a, "lobby", is.field_f));
                    return false;
                  }
                  bn.a((byte) -24, 18.0f, vl.a(gg.field_K, 0, Battlefield.field_nb, "lobby", TileMetadata.field_i));
                  return false;
                }
                bn.a((byte) -24, 16.0f, vl.a(ResourceRequest.field_A, 0, rf.field_a, var4, is.field_f));
                return false;
              }
              bn.a((byte) -24, 13.0f, vl.a(gg.field_K, 0, Battlefield.field_nb, var4, TileMetadata.field_i));
              return false;
            }
            bn.a((byte) -24, 10.0f, vl.a(gg.field_K, 0, Battlefield.field_nb, "basic", TileMetadata.field_i));
            return false;
          }
          if (null != SpellConfirmationDialog.field_f) {
            bn.a((byte) -24, 71.0f, ph.field_a);
            this.a(0);
            SpellConfirmationDialog.field_f = null;
            wl.a(0);
            return false;
          }
          if (null != SummonAction.field_w) {
            bn.a((byte) -24, 75.0f, ta.field_M);
            this.a(0);
            mp.field_Ob = um.a(SummonAction.field_w, "", "Runewars Titlescreen");
            DeployRequest.field_B = um.a(SummonAction.field_w, "", "legion");
            oh.field_K = um.a(SummonAction.field_w, "", "Runewars win");
            se.field_h = um.a(SummonAction.field_w, "", "Runewars lose");
            var5_int = 0;
            do {
              if (!(var5_int < cb.field_a.length)) {
                fh.field_b = new um[9];
                fh.field_b[0] = um.a(SummonAction.field_w, "", "the terrible tower");
                fh.field_b[1] = um.a(SummonAction.field_w, "", "venture2");
                fh.field_b[2] = um.a(SummonAction.field_w, "", "the other side");
                fh.field_b[3] = um.a(SummonAction.field_w, "", "the shadow");
                fh.field_b[4] = um.a(SummonAction.field_w, "", "faithless");
                fh.field_b[5] = um.a(SummonAction.field_w, "", "kingdom");
                fh.field_b[6] = um.a(SummonAction.field_w, "", "fight or flight");
                fh.field_b[7] = um.a(SummonAction.field_w, "", "soul wars");
                fh.field_b[8] = um.a(SummonAction.field_w, "", "brain_barrelchest_battle");
                qf.field_f = um.a(SummonAction.field_w, "", "AoG_interface_guthix");
                break;
              }
              cb.field_a[var5_int] = um.a(SummonAction.field_w, "", "attack" + (var5_int + 1));
              var5_int++;
            } while (var18 == 0);
            var5 = lk.field_e.field_w;
            var5.a(jl.field_d, ep.field_b, 0, mp.field_Ob, (byte) 86);
            var5.a(jl.field_d, ep.field_b, 0, DeployRequest.field_B, (byte) 86);
            var5.a(jl.field_d, ep.field_b, 0, oh.field_K, (byte) 86);
            var5.a(jl.field_d, ep.field_b, 0, se.field_h, (byte) 86);
            var6 = cb.field_a;
            var7_int = 0;
            do {
              if (var7_int >= var6.length) {
                var5.a(jl.field_d, ep.field_b, 0, qf.field_f, (byte) 86);
                break;
              }
              var8 = var6[var7_int];
              var5.a(jl.field_d, ep.field_b, 0, var8, (byte) 86);
              var7_int++;
            } while (var18 == 0);
            var6_array = UnitLossCondition.field_d;
            var7_int = 0;
            do {
              if (var6_array.length <= var7_int) {
                var5.h(-117);
                SummonAction.field_w = null;
                ep.field_b = null;
                jl.field_d = null;
                wl.a(0);
                break;
              }
              var8_ref = var6_array[var7_int];
              var8_ref.a(jl.field_d, ep.field_b, SummonAction.field_w, 0, var5);
              var7_int++;
            } while (var18 == 0);
            return false;
          }
          if (sh.field_j == null) {
            if (bt.field_e != null) {
              uc.a(new dq(bt.field_e.getFileByName("huffman", -105, "")), 4);
              bt.field_e = null;
              wl.a(0);
              return false;
            }
            if (null != ce.field_M &&
              oh.field_M != null) {
              ArchiveProvider.field_e = new ou(ce.field_M, oh.field_M, false);
              ce.field_M = null;
              oh.field_M = null;
              return false;
            }
            if (null != fw.field_F) {
              CampaignMenu.a(fw.field_F, 0, 28);
              fw.field_F = null;
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
            wl.a(0);
            return true;
          }
          bn.a((byte) -24, 90.0f, SectorCacheStore.field_i);
          this.a(0);
          rs.field_n = gs.a(var4, gg.field_K, ResourceRequest.field_A, (byte) -53, "");
          en.field_E = gs.a("basic", iw.field_l, sh.field_j, (byte) -53, "smallfont");
          TrianglePulse.field_i = it.a("introfont", iw.field_l, sh.field_j, (byte) -87, "basic");
          nr.field_e = TurnEffectEvent.a("runewarsfont", sh.field_j, iw.field_l, "basic", -2088);
          fe.a(nr.field_e);
          fe.field_l = fk.a("textshadow", (byte) -127, iw.field_l, "basic");
          var5_array = MapLayout.a("members_benefits_screenshots", -28106, "basic", iw.field_l);
          if (var5_array != null) {
            ul.a(var5_array, (byte) 110, this);
          }
          MatchConditionEntry.field_n = pv.a("basic", "background", iw.field_l, 24914);
          cp.field_e = MapLayout.a("statusicons", -28106, "basic", iw.field_l);
          MapLayout.a("armouricons", -28106, "basic", iw.field_l);
          lb.field_e = MapLayout.a("special_icons", -28106, "basic", iw.field_l);
          TrianglePulse.field_d = GameplayController.a("godspark", (byte) 51, "basic", iw.field_l);
          gh.field_M = DiskCacheRequest.a("mapbutton", "basic", iw.field_l, false);
          DiskCacheRequest.a("endturnbutton", "basic", iw.field_l, false);
          ul.field_g = DiskCacheRequest.a("buttonring", "basic", iw.field_l, false);
          e.field_b = ac.a(iw.field_l, "lozenge", (byte) -4, "basic");
          bu.field_c = fk.a("endturnlozenge", (byte) -127, iw.field_l, "basic");
          jh.field_l = ac.a(iw.field_l, "summonframe", (byte) -4, "basic");
          EventPresenter.field_t = DiskCacheRequest.a("bubblepoint", "basic", iw.field_l, false);
          ii.field_a = ac.a(iw.field_l, "actionbuttons", (byte) -4, "basic");
          od.field_a = ac.a(iw.field_l, "info_icons", (byte) -4, "basic");
          ro.field_rb = MapLayout.a("trait_icons", -28106, "basic", iw.field_l);
          lp.field_b = MapLayout.a("terrain_icons", -28106, "basic", iw.field_l);
          sg.field_b = MapLayout.a("compare_icons", -28106, "basic", iw.field_l);
          CampaignRewardPreview.field_e = DiskCacheRequest.a("mapf", "basic", iw.field_l, false);
          io.field_z = DiskCacheRequest.a("mapi", "basic", iw.field_l, false);
          ig.field_t = pv.a("basic", "turn", iw.field_l, 24914);
          AttackEvent.field_y = fk.a("mapsquares", (byte) -127, iw.field_l, "basic");
          SkeletonLimitMarker.field_s = fk.a("isomapsquares", (byte) -127, iw.field_l, "basic");
          SpellMenuGroup.field_h = fk.a("maprotbutton", (byte) -128, iw.field_l, "basic");
          TeleportAction.field_w = fk.a("placeicons", (byte) -124, iw.field_l, "basic");
          mp.field_Jb = DiskCacheRequest.a("slider", "basic", iw.field_l, false);
          MoveEvent.field_z = GameplayController.a("bcarrow", (byte) 51, "basic", iw.field_l);
          BestScoreStrategy.field_m = GameplayController.a("goldiv", (byte) 51, "basic", iw.field_l);
          wc.field_Q = fk.a("silverbar", (byte) -125, iw.field_l, "basic");
          TaggedMapData.field_f = fk.a("pathfinder", (byte) -125, iw.field_l, "basic");
          DeployAction.field_x = ac.a(iw.field_l, "unitheads", (byte) -4, "basic");
          lt.field_i = fk.a("theme_icons", (byte) -127, iw.field_l, "basic");
          UpkeepEvent.a(iw.field_l, 116);
          hs.field_F = fk.a("fireball", (byte) -128, iw.field_l, "basic");
          MatchConditionRegistry.field_d = fk.a("fortcontrols", (byte) -124, iw.field_l, "basic");
          lw.field_ob = DiskCacheRequest.a("smallorb", "basic", iw.field_l, false);
          wc.field_J = DiskCacheRequest.a("bigorb", "basic", iw.field_l, false);
          pg.field_c = DiskCacheRequest.a("bigorbring", "basic", iw.field_l, false);
          UnitModelPreview.field_d = ac.a(iw.field_l, "godorbs", (byte) -4, "basic");
          gt.field_c = ac.a(iw.field_l, "godframes", (byte) -4, "basic");
          ce.field_F = ac.a(iw.field_l, "godglows", (byte) -4, "basic");
          BufferedFile.field_k = ac.a(iw.field_l, "godframeglows", (byte) -4, "basic");
          tn.a((byte) 80, UnitModelPreview.field_d);
          hf.a(128, ce.field_F, 0);
          TeamRoster.field_e = new RgbSprite(71, 71);
          fn.a(8678, 256, 15, TeamRoster.field_e);
          tn.a((byte) 105, ce.field_F);
          tn.a((byte) 124, BufferedFile.field_k);
          ol.field_y = DiskCacheRequest.a("logo", "basic", iw.field_l, false);
          km.field_h = ac.a(iw.field_l, "summonrings", (byte) -4, "basic");
          jv.field_b = fk.a("chatbubbles", (byte) -128, iw.field_l, "basic");
          AttackEvent.field_O = GameplayController.a("results_award_badge", (byte) 51, "basic", iw.field_l);
          ih.field_H = (nj) (DiskCacheRequest.a("shine", "basic", iw.field_l, false));
          CampaignDefinition.field_t = pv.a("basic", "statboxbg", iw.field_l, 24914);
          qt.field_e = pv.a("basic", "popupbg", iw.field_l, 24914);
          vq.field_b = pv.a("basic", "gameinfobg", iw.field_l, 24914);
          vc.field_k = fk.a("manastars", (byte) -127, iw.field_l, "basic");
          TrianglePulse.field_f = GameplayController.a("manaicon", (byte) 51, "basic", iw.field_l);
          od.field_d = fk.a("overlayicons", (byte) -125, iw.field_l, "basic");
          mv.field_a = fk.a("bloodsplat", (byte) -126, iw.field_l, "basic");
          it.field_a = GameplayController.a("results_rune_icon", (byte) 51, "basic", iw.field_l);
          rq.field_k = fk.a("results_mini_button_silver", (byte) -124, iw.field_l, "basic");
          IsaacRandom.field_a = fk.a("results_mini_button_gold", (byte) -127, iw.field_l, "basic");
          BattleCharacter.field_h = ac.a(iw.field_l, "trinketicons", (byte) -4, "basic");
          AttackEvent.field_E = DiskCacheRequest.a("eye", "basic", iw.field_l, false);
          cu.field_d = ac.a(iw.field_l, "trinketbuttons", (byte) -4, "basic");
          mo.field_s = GameplayController.a("wait_icon", (byte) 51, "basic", iw.field_l);
          mo.field_s.a();
          kt.field_o = fk.a("diamondscale", (byte) -128, iw.field_l, "basic");
          jg.field_m = new RgbSprite(vc.field_m.getFileByName("menu_background.jpg", -123, ""), (java.awt.Component) ((Object) ll.p(0)));
          var6_array = UnitLossCondition.field_d;
          var7_int = 0;
          do {
            if (var6_array.length <= var7_int) {
              BufferedSocket.field_i = new ep(vc.field_m);
              dq.field_i = CampaignMission.a((byte) -125, "frame_outer", "basic", iw.field_l);
              io.field_m = CampaignMission.a((byte) 83, "frame_inner", "basic", iw.field_l);
              oh.field_J = CampaignMission.a((byte) 83, "frame_ingame", "basic", iw.field_l);
              EffectPresentation.field_j = CampaignMission.a((byte) -108, "frame_boxes", "basic", iw.field_l);
              DisplacedUnitMarker.field_s = CampaignMission.a((byte) 89, "frame_button", "basic", iw.field_l);
              break;
            }
            var8_ref = var6_array[var7_int];
            var8_ref.a(vc.field_m, 0, iw.field_l);
            var7_int++;
          } while (var18 == 0);
          var6_array2 = new int[]{13615618, 10121728};
          var7 = new int[]{16184190, 16707943};
          nd.field_b = jk.a(50, var7, 127, var6_array2);
          var8_array = new int[]{13619151, 10132122};
          var9 = new int[]{16185078, 16711422};
          TutorialController.field_e = jk.a(100, var9, 123, var8_array);
          var10 = new int[]{13421772};
          var11 = new int[]{4473924};
          jh.field_k = jk.a(100, var11, 125, var10);
          var12 = new int[]{13565952, 10092544};
          var13 = new int[]{16121856, 16646144};
          MoveAttackAction.field_x = jk.a(100, var13, 125, var12);
          var14 = new int[]{13369344};
          var15 = new int[]{4456448};
          dh.field_l = jk.a(100, var15, 123, var14);
          fe.a(0, 0, 640, 480, oh.field_J, nd.field_b);
          SocketResourceClient.a((byte) 125, ac.a(iw.field_l, "dials", (byte) -4, "basic"), GameplayController.a("hand", (byte) 51, "basic", iw.field_l));
          IsaacRandom.field_k = fk.a("arrows", (byte) -124, iw.field_l, "basic");
          pi.field_T = GameplayController.a("isocrosshair", (byte) 51, "basic", iw.field_l);
          ng.a(GameplayController.a("glowray", (byte) 51, "basic", iw.field_l), 0, GameplayController.a("glowspark", (byte) 51, "basic", iw.field_l));
          MoveAttackRequest.field_C = fk.a("medals", (byte) -127, iw.field_l, "campaign");
          ps.field_w[0] = DiskCacheRequest.a("campaign_1_glow", "campaign", iw.field_l, false);
          ps.field_w[1] = DiskCacheRequest.a("campaign_2_glow", "campaign", iw.field_l, false);
          ps.field_w[2] = DiskCacheRequest.a("campaign_3_glow", "campaign", iw.field_l, false);
          qu.field_k = MapLayout.a("achievements_large", -28106, "basic", iw.field_l);
          MoveAttackRequest.field_A = GameplayController.a("unachieved", (byte) 51, "basic", gg.field_K);
          DeathEvent.field_A = GameplayController.a("locked", (byte) 51, "basic", gg.field_K);
          mo.field_t = GameplayController.a("orbcoin", (byte) 51, "basic", gg.field_K);
          CampaignUnitOverride.a(300, MoveAttackRequest.field_A);
          CampaignUnitOverride.a(300, mo.field_t);
          CorpseConditionMarker.field_v = new RgbSprite(32, 32);
          CorpseConditionMarker.field_v.b();
          mo.field_t.d(0, 0, 32, 32);
          so.field_b.a(5605);
          mo.field_t = null;
          var16 = new RgbSprite[hs.field_E.length][];
          var17 = 0;
          do {
            if (!(hs.field_E.length > var17)) {
              km.field_c = MapLayout.a("prestigeicons", -28106, "basic", iw.field_l);
              break;
            }
            var16[var17] = fk.a(hs.field_E[var17], (byte) -127, iw.field_l, "basic");
            var17++;
          } while (var18 == 0);
          if (!ta.field_L) {
            dh.field_k = GameplayController.a("lobby_game_logo", (byte) 51, "basic", iw.field_l);
            ar.a(var16, bs.field_b, (byte) 53, MoveAttackRequest.field_B, 4, gg.field_K, ResourceRequest.field_A, CipherPacketBuffer.field_A, pf.field_a, new int[]{10, 10, 10, 10, 10, 10, 10, 10, 10, 10}, true, pf.field_a.length, ku.field_L, km.field_c, CorpseConditionMarker.field_w, ki.field_d, var16);
            la.b((byte) 30, 200);
            ps.a(124, ResourceRequest.field_A, gg.field_K);
          }
          sh.field_j = null;
          ResourceRequest.field_A = null;
          wl.a(0);
          fe.field_o = new int[7][64];
          var17 = 0;
          do {
            if (var17 >= 64) {
              if (BufferedSocket.field_j >= 2) {
                oa.field_I = new ij(hg.a(101), rs.field_n, IntPair.field_m);
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
          throw ig.addExceptionContext((Throwable) ((Object) var3), "ArmiesOfGielinor.IA(" + param0 + ',' + param1 + ')');
        }
    }

    private final void r(int param0) {
        RuntimeException runtimeException = null;
        int var2_int = 0;
        int var3 = 0;
        RuntimeException decompiledCaughtException = null;
        var3 = obfuscationControl ? 1 : 0;
        try {
          ul.buildSpellMenu(17);
          StateChangeEvent.g(1);
          var2_int = 0;
          while (var2_int < 29) {
            rq.field_p[var2_int] = new TutorialController(var2_int);
            var2_int++;
            if (var3 != 0) {
              return;
            }
          }
          if (param0 != -66) {
            field_J = (BitmapFont) null;
          }
          jt.field_a = 16;
          sa.a(50, true);
          ar.a(param0 ^ -68, mp.field_Ob);
          gh.a(128, 8, rs.field_n.field_z, rs.field_n.field_L + rs.field_n.field_z, rs.field_n, io.field_m[0].pixelHeight, 8, 2, 16777215, 240, rs.field_n.field_z, -99, new pn(DisplacedUnitMarker.field_s, nd.field_b, 0, 128, true), 255, new pn(DisplacedUnitMarker.field_s, nd.field_b, 0, 128, true), 320, io.field_m[0].pixelWidth, rs.field_n.field_z + rs.field_n.field_L, new pn(io.field_m, nd.field_b, 0, 224, false), rs.field_n);
          wm.a(320, 128, 240, 16777215, rs.field_n.field_z + rs.field_n.field_L, rs.field_n.field_z, new pn(DisplacedUnitMarker.field_s, nd.field_b, 0, 128, true), 8, (byte) 90, 480, 8, rs.field_n.field_L + rs.field_n.field_z, new pn(DisplacedUnitMarker.field_s, nd.field_b, 0, 128, true), io.field_m[0].pixelHeight, rs.field_n, 2, io.field_m[0].pixelWidth, rs.field_n, 255, rs.field_n.field_z, new pn(io.field_m, nd.field_b, 0, 224, false));
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw ig.addExceptionContext((Throwable) ((Object) runtimeException), "ArmiesOfGielinor.PA(" + param0 + ')');
        }
    }

    final static void b(int param0, boolean param1) {
        RuntimeException runtimeException = null;
        wr var2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          CombatEvent.field_I.b(param1, param0 ^ 20);
          var2 = BestScoreStrategy.field_i;
          if (null != var2) {
            var2.a(CombatEvent.field_I.field_V, -125, CombatEvent.field_I.field_D);
          }
          if (param0 != 0) {
            field_H = (String) null;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw ig.addExceptionContext((Throwable) ((Object) runtimeException), "ArmiesOfGielinor.BA(" + param0 + ',' + param1 + ')');
        }
    }

    private final boolean o(int param0) {
        RuntimeException var2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (null != ki.field_b &&
            null == i.field_Lb) {
            bn.a((byte) -24, 97.0f, AiPlanner.field_R);
            this.a(param0 ^ 11672);
            bl.a(0, ki.field_b);
            ki.field_b = null;
            wl.a(0);
            return false;
          }
          if (null != i.field_Lb &&
            iw.field_l != null) {
            bn.a((byte) -24, 98.0f, AiPlanner.field_R);
            this.a(0);
            i.field_Lb = null;
            wl.a(param0 ^ 11672);
            return false;
          }
          if (param0 != 11672) {
            this.b((byte) -74);
          }
          if (op.field_b != null &&
            null != bi.field_f &&
            nm.field_s != null &&
            ki.field_b == null) {
            bn.a((byte) -24, 99.0f, AiPlanner.field_R);
            this.a(0);
            CoatOfArms.a(nm.field_s, bi.field_f, op.field_b, 0);
            op.field_b = null;
            bi.field_f = null;
            nm.field_s = null;
            wl.a(0);
            return false;
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ig.addExceptionContext((Throwable) ((Object) var2), "ArmiesOfGielinor.CA(" + param0 + ')');
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
          var2 = (jg) (ai.field_P.first((byte) 97));
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
            fe.b(-5, var3 - 10, rs.field_n.a(so.field_a[var2.field_l]) + 62, 48, io.field_m, nd.field_b, 0, 128);
            qu.field_k[var2.field_l].c(8, var3);
            rs.field_n.b(so.field_a[var2.field_l], 42, var3 - (-5 - rs.field_n.field_H), 15658734, -1);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw ig.addExceptionContext((Throwable) ((Object) var2_ref), "ArmiesOfGielinor.LA(" + param0 + ')');
        }
    }

    static {
        field_N = new String[]{"proj_aviansie_axe", null, null, null, null, "proj_rock", "spear"};
        field_I = new int[8192];
        field_K = 0;
        field_H = "Please check if address is correct";
    }
}
