/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

public final class DungeonAssault extends NetworkGameClient {
    static String field_H;
    static RgbSprite field_I;
    static String field_G;
    static String field_J;
    public static int field_K;

    public static void clearDungeonAssaultGlobals(byte param0) {
        field_G = null;
        field_J = null;
        if (param0 != 114) {
          return;
        }
        try {
          field_I = null;
          field_H = null;
        } catch (RuntimeException runtimeException) {
          throw AccountServiceResult.wrapClientException((Throwable) ((Object) runtimeException), "DungeonAssault.E(" + param0 + ')');
        }
    }

    private final void updateScreensAndTransitions(boolean param0, byte param1) {
        int fieldTemp$0 = 0;
        boolean stackIn_16_0 = false;
        boolean stackIn_17_1 = false;
        int stackIn_106_0 = 0;
        int stackIn_110_0 = 0;
        int stackIn_112_0 = 0;
        int stackIn_112_1 = 0;
        int stackIn_127_0 = 0;
        int stackIn_131_0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        int var4 = 0;
        Random var4_ref_Random = null;
        int var5 = 0;
        int var6 = 0;
        CombatState var9 = null;
        CombatState var10 = null;
        int stackIn_112_0Lifetime1;
        int stackIn_112_1Lifetime1;
        int var4Lifetime1;
        int var4Lifetime2;
        var6 = field_K;
        try {
          if (~fm.field_e == ~fm.field_a) {
            if (!param0) {
              if (DiskArchiveRequest.field_G == null) {
                if (mn.field_b == -1) {
                  if (ik.field_e != null) {
                    ik.field_e.updateScreen(true);
                    while (ha.b((byte) 47)) {
                      ik.field_e.handleScreenKeyPress();
                    }
                  }
                } else {
                  if (fc.a(mn.field_b, (byte) -120)) {
                    bf.field_f[mn.field_b].updateScreen(true);
                  }
                }
              } else {
                bd.field_f = bd.field_f + 1;
                if (bd.field_f == 64) {
                  AccountRequestState.a((byte) 40);
                }
              }
            }
            if (null != ProxyAuthenticationRequiredException.field_a.beginBackward(-24172)) {
              fieldTemp$0 = ke.field_e + 1;
              ke.field_e = ke.field_e + 1;
              if (fieldTemp$0 == 335) {
                ProxyAuthenticationRequiredException.field_a.removeLast((byte) -124);
                sl.field_b = null;
                pa.field_a = null;
                ri.field_g = null;
              }
            }
          } else {
            if (fm.field_a == dg.field_H) {
              pk.field_t = pk.field_t + 1;
              if (pk.field_t == 16) {
                if (tl.field_d) {
                  LoginPanel.b(false);
                } else {
                  bj.i(81);
                }
                gm.field_d = null;
                fm.field_a = bn.field_n;
              }
            } else {
              if (~bn.field_n != ~fm.field_a) {
                pk.field_t = pk.field_t - 1;
                if (pk.field_t == 0) {
                  fm.field_a = fm.field_e;
                }
              } else {
                if (!ed.c(true)) {
                  AccountServiceResult.a((byte) -31);
                  gd.a(g.field_Hb, 0, sa.field_f, false);
                  stackIn_16_0 = DualLinkNode.field_k;
                  stackIn_17_1 = !(ResourceArchive.field_k < 2);
                  DualLinkNode.field_k = stackIn_16_0 | stackIn_17_1;
                  if (tl.field_d) {
                    tl.field_d = false;
                    a.a(320, IntrusiveNode.field_c.field_N, IntrusiveNode.field_c, true, false, 8, 240, 2, 8, IntrusiveNode.field_c.field_E + IntrusiveNode.field_c.field_N, (RgbSprite[]) null, (RgbSprite[]) null);
                    if (cm.field_R != null) {
                      i.field_A.requestCursorVisibility((java.awt.Component) ((Object) cm.field_R), (byte) 51, false);
                    }
                  }
                  if (fc.a(Bzip2State.field_z, (byte) -120)) {
                    AccountRequestState.a((byte) 114);
                  }
                }
                fm.field_a = ii.field_F;
              }
            }
          }
          if (ik.field_e != null &&
            mn.field_b != -1) {
            ik.field_e.a(false, 251569954);
          }
          if (param1 != -69) {
            this.updateScreensAndTransitions(true, (byte) -64);
          }
          if (Bzip2State.field_z == -2) {
            var9 = new CombatState();
            var9.field_v = GzipDecompressor.a(0, new Random());
            for (var4 = 0; 49 > var4; var4++) {
              stackIn_112_0 = 0;
              stackIn_112_1 = oi.b(0, 5);
              if (stackIn_112_0 == stackIn_112_1 &&
                var9.field_h[var4].field_a == 0) {
                var9.field_h[var4] = new DungeonTileState(ji.a(37, false, 4));
              }
            }
            if (null == gm.field_d) {
              stackIn_106_0 = 10000;
            } else {
              stackIn_106_0 = gm.field_d.field_N;
            }
            var4Lifetime2 = stackIn_106_0;
            var9.field_y = var4Lifetime2;
            var9.field_o = var4Lifetime2 / 10;
            var9.field_A[0] = new Raider(0, 25);
            var9.field_A[1] = new Raider(1, 27);
            var9.field_A[2] = new Raider(2, 18);
            var9.field_A[3] = new Raider(3, 19);
            var9.setCombatMode(false, 4);
            ik.field_e = new DungeonRaidScreen(false, var9);
            var5 = cm.field_Q ? 1 : 0;
            stackIn_110_0 = (!ve.a(false)) ? 0 : 12;
            gd.a(stackIn_110_0, 0, -1, var5 != 0);
          }
          stackIn_112_0Lifetime1 = 2;
          stackIn_112_1Lifetime1 = ~Bzip2State.field_z;
          if (stackIn_112_0Lifetime1 == stackIn_112_1Lifetime1) {
            var10 = new CombatState();
            if (!ed.c(true) &&
              gm.field_d.field_q == -1) {
              var10.field_v = new PackedBitSet(gm.field_d.field_k);
              var10.field_h = gm.field_d.field_L;
            } else {
              var4_ref_Random = new Random();
              var10.field_v = GzipDecompressor.a(0, var4_ref_Random);
              var10.field_h = da.a(var10.field_v, (byte) 71, var4_ref_Random);
              if (ed.c(true)) {
                gm.field_d = new PlayerDungeonProfile();
                gm.field_d.field_L = var10.field_h;
                gm.field_d.field_k = var10.field_v;
              }
            }
            var10.field_o = 1000;
            var10.field_A[0] = new Raider(0, 1);
            var10.field_A[1] = new Raider(1, 3);
            var10.field_A[2] = new Raider(2, 4);
            var10.field_A[3] = new Raider(3, 2);
            var10.setCombatMode(false, 4);
            ha.d(1);
            ik.field_e = new DungeonRaidScreen(false, var10);
            stackIn_127_0 = (!cm.field_Q) ? 0 : 1;
            var4Lifetime1 = stackIn_127_0;
            stackIn_131_0 = (!ve.a(false)) ? 0 : 12;
            gd.a(stackIn_131_0, 0, -1, var4Lifetime1 != 0);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw AccountServiceResult.wrapClientException((Throwable) ((Object) var3), "DungeonAssault.H(" + param0 + ',' + param1 + ')');
        }
    }

    final void updateGameTick(int param0) {
        int fieldTemp$0 = 0;
        boolean stackIn_44_1 = false;
        int stackIn_101_1 = 0;
        boolean stackIn_102_2 = false;
        boolean stackIn_139_0 = false;
        int stackIn_208_0 = 0;
        int stackIn_208_1 = 0;
        int stackIn_208_2 = 0;
        boolean stackIn_209_3;
        int stackIn_220_0 = 0;
        int stackIn_254_0 = 0;
        int stackIn_254_1 = 0;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        int[] var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        CipherPacketBuffer var4_ref_wj = null;
        int[] var4_ref_int__ = null;
        int var4 = 0;
        int var5 = 0;
        di[] var5_ref_di__ = null;
        int var6 = 0;
        int var7 = 0;
        int[] var10 = null;
        int[] var11 = null;
        int[] var12 = null;
        int[] var13 = null;
        int[] var14 = null;
        int[] var15 = null;
        int[] var16 = null;
        Object var17 = null;
        ak var17_ref = null;
        int[] var18 = null;
        PlayerDungeonProfile var19 = null;
        String var20 = null;
        CombatState var21 = null;
        int[] var22 = null;
        int[] var4_ref_int__Lifetime1;
        int[] var4_ref_int__Lifetime2;
        int stackIn_254_0Lifetime1;
        int stackIn_254_1Lifetime1;
        int var2_intLifetime1;
        int var2_intLifetime2;
        int var3Lifetime1;
        int var5Lifetime1;
        int var6Lifetime1;
        int var6Lifetime2;
        int var4Lifetime1;
        int var3Lifetime2;
        int var3Lifetime3;
        int var5Lifetime2;
        int var5Lifetime3;
        int var5Lifetime4;
        var17 = null;
        var7 = field_K;
        try {
          ib.b((byte) 31);
          mn.a((byte) -42);
          if (ef.field_h) {
            if (kj.field_n != 0 && (!(5 * AccountNameAvailabilityValidator.field_m.length / 2 <= kj.field_n) ||
              0 == la.field_g)) {
              fieldTemp$0 = kj.field_n + 1;
              kj.field_n = kj.field_n + 1;
              if (fieldTemp$0 >= 5 * AccountNameAvailabilityValidator.field_m.length) {
                kj.field_n = 0;
              }
            }
            if (0 != no.field_d) {
              kj.field_n = 1;
            }
            if (ao.a((byte) 79)) {
              if (!di.field_e) {
                i.field_A.requestCursorVisibility((java.awt.Component) ((Object) AwtRasterBuffer.field_h), (byte) 61, true);
                di.field_e = true;
              }
            } else {
              if (AwtRasterBuffer.field_h != NameSuggestionsPanel.field_R ||
                di.field_e) {
                i.field_A.requestCursorVisibility((java.awt.Component) ((Object) AwtRasterBuffer.field_h), (byte) 116, false);
                di.field_e = false;
                NameSuggestionsPanel.field_R = AwtRasterBuffer.field_h;
              }
            }
          }
          DungeonRaidScreen.b((byte) 14);
          if (cm.field_R != null &&
            cm.field_R.focusLost) {
            ib.a(930);
            hh.a((byte) -128);
          }
          stackIn_44_1 = (cm.field_R != null);
          this.a(stackIn_44_1, (byte) -74);
          if (ld.field_i) {
            bo.h(78);
            ld.field_i = false;
          }
          mo.field_a = mo.field_a + 1;
          if (ao.a((byte) -123)) {
            this.g((byte) 2);
            if (ao.a((byte) 121)) {
              return;
            }
          }
          if (param0 >= -89) {
            this.updateScreensAndTransitions(false, (byte) -112);
          }
          if (ef.field_h) {
            if (hc.b(1)) {
              if (!ib.a((byte) 84)) {
                if (!sl.b(15000)) {
                  if (!ue.b((byte) -93)) {
                    this.updateScreensAndTransitions(false, (byte) -69);
                  } else {
                    if (~fm.field_a == ~fm.field_e) {
                      var2_int = l.d(4570);
                      if (var2_int == 1) {
                        ik.a(bh.field_Q, 53, 0);
                      }
                      this.updateScreensAndTransitions(true, (byte) -69);
                    } else {
                      this.updateScreensAndTransitions(false, (byte) -69);
                    }
                  }
                } else {
                  stackIn_101_1 = 82;
                  stackIn_102_2 = (null != cm.field_R);
                  var2_int = this.b((byte) stackIn_101_1, stackIn_102_2);
                  if (1 == var2_int ||
                    2 == var2_int) {
                    if (null != cm.field_R) {
                      ib.a(930);
                    }
                    if (var2_int == 2) {
                      eg.a((byte) 120, DebouncedFieldValidator.c(true));
                    }
                  }
                  this.updateScreensAndTransitions(true, (byte) -69);
                }
              } else {
                up.c((byte) 126);
                if (~fm.field_e == ~fm.field_a) {
                  var2_int = mf.b(12210);
                  if (var2_int == 2) {
                    ib.a(930);
                  } else {
                    if (var2_int == 3) {
                      tl.field_d = false;
                      a.a(320, IntrusiveNode.field_c.field_N, IntrusiveNode.field_c, true, true, 8, 240, 2, 8, IntrusiveNode.field_c.field_E + IntrusiveNode.field_c.field_N, (RgbSprite[]) null, (RgbSprite[]) null);
                      if (cm.field_R != null) {
                        i.field_A.requestCursorVisibility((java.awt.Component) ((Object) cm.field_R), (byte) 86, false);
                      }
                    } else {
                      if (4 == var2_int) {
                        tl.field_d = true;
                        ik.a(ve.field_c, 86, 0);
                      }
                    }
                  }
                  this.updateScreensAndTransitions(true, (byte) -69);
                } else {
                  this.updateScreensAndTransitions(false, (byte) -69);
                }
              }
            } else {
              nb.a(22);
            }
          } else {
            td.a(CombatState.field_r, 121);
            if (this.finishLoadingAndInitializeScreens(0)) {
              ef.field_h = true;
            }
          }
          if (!ed.c(true)) {
            while (true) {
              var17_ref = (ak) (DualLinkNode.field_i.removeLast((byte) -124));
              if (var17_ref == null) {
                break;
              }
              vb.a(4, (byte) 84, var17_ref);
            }
          }
          scanLoop1: while (true) {
            stackIn_139_0 = di.a(uo.field_c, -1);
            if (stackIn_139_0) {
              stackIn_254_0 = -55;
              stackIn_254_1 = ~hc.field_c;
              if (stackIn_254_0 == stackIn_254_1) {
                var22 = wa.b(-1);
                var18 = var22;
                var2 = var18;
                var10 = var2;
                var4_ref_wj = ra.field_c;
                var5 = ((PacketBuffer) ((Object) var4_ref_wj)).readUnsignedByte(true);
                for (var6 = 0; var6 < var5; var6++) {
                  var10[var6] = ((PacketBuffer) ((Object) var4_ref_wj)).readInt(-48);
                }
                if (wh.field_d) {
                  var11 = var2;
                  var12 = FrameTimer.field_c;
                  var4_ref_int__ = FrameTimer.field_c;
                  for (var5Lifetime2 = 0; 8 > var5Lifetime2; var5Lifetime2++) {
                    var11[var5Lifetime2] = nb.a(var11[var5Lifetime2], ~var12[var5Lifetime2]);
                  }
                  for (var3 = 0; var3 < ce.field_o.length; var3++) {
                    stackIn_139_0 = vl.a(var3, -67, var22);
                    if (stackIn_139_0) {
                      ProxyAuthenticationRequiredException.field_a.addFirst(new a(var3), false);
                    }
                  }
                }
                var13 = FrameTimer.field_c;
                var14 = var2;
                var4_ref_int__Lifetime1 = var2;
                for (var5Lifetime3 = 0; 8 > var5Lifetime3; var5Lifetime3++) {
                  var13[var5Lifetime3] = mp.a(var13[var5Lifetime3], var14[var5Lifetime3]);
                }
                var15 = bp.field_e;
                var16 = var2;
                var4_ref_int__Lifetime2 = var2;
                for (var5Lifetime4 = 0; var5Lifetime4 < 8; var5Lifetime4++) {
                  var15[var5Lifetime4] = mp.a(var15[var5Lifetime4], var16[var5Lifetime4]);
                }
                rf.field_S = true;
                continue scanLoop1;
              }
              if (hc.field_c == 55) {
                var19 = gm.field_d;
                gm.field_d = new PlayerDungeonProfile(ra.field_c, 19);
                if (mn.field_b == 4 ||
                  Bzip2State.field_z == 4) {
                  jk.j((byte) 59);
                }
                if (5 == mn.field_b ||
                  Bzip2State.field_z == 5) {
                  u.a(1, var19);
                }
                if (mn.field_b == 2 ||
                  Bzip2State.field_z == 2) {
                  sh.a(27886, var19);
                }
                if (mn.field_b != 3 &&
                  Bzip2State.field_z != 3) {
                  continue scanLoop1;
                }
                hi.b(1);
                continue scanLoop1;
              }
              if (56 != hc.field_c &&
                57 != hc.field_c) {
                if (hc.field_c == 58) {
                  AchievementIconEntry.a(0);
                  continue scanLoop1;
                }
                if (61 == hc.field_c) {
                  var20 = ra.field_c.readPrefixedString(-21030);
                  var3Lifetime2 = ra.field_c.readUnsignedShort(0);
                  var4 = ra.field_c.readUnsignedByte(true);
                  var5Lifetime1 = ra.field_c.readInt(-111);
                  stackIn_220_0 = (ra.field_c.readUnsignedByte(true) != 1) ? 0 : 1;
                  var6Lifetime1 = stackIn_220_0;
                  if (2 != Bzip2State.field_z) {
                    continue scanLoop1;
                  }
                  ((bg) (bf.field_f[2])).a(var6Lifetime1 != 0, var4, 0, var5Lifetime1, var3Lifetime2, var20);
                  continue scanLoop1;
                }
                if (hc.field_c == 62) {
                  AccountRequestState.a((byte) 9);
                  var21 = new CombatState(ra.field_c, true);
                  if (null != ik.field_e &&
                    ik.field_e.field_Y.field_f == var21.field_f) {
                    ik.field_e = new DungeonRaidScreen(true, var21, ik.field_e);
                  } else {
                    ik.field_e = new DungeonRaidScreen(true, var21);
                  }
                  gd.a(Bzip2State.field_z, 0, -1, false);
                  AccountNameAvailabilityValidator.field_s = false;
                  nf.field_A = true;
                  continue scanLoop1;
                }
                if (hc.field_c != 72) {
                  if (nf.field_A &&
                    null != ik.field_e &&
                    ik.field_e.handleRaidPacket(0)) {
                    continue scanLoop1;
                  }
                  this.d(true);
                  continue scanLoop1;
                }
                if (nf.field_A) {
                  AccountRequestState.a((byte) 14);
                  if (nf.field_A) {
                    nf.field_A = false;
                    ik.field_e.leaveRaidScreen(17158, false);
                    gh.field_f = true;
                  }
                }
                AccountNameAvailabilityValidator.field_s = false;
                continue scanLoop1;
              }
              var2_intLifetime1 = ra.field_c.readUnsignedMedium(-123);
              var3Lifetime3 = ra.field_c.readUnsignedMedium(-124);
              var4Lifetime1 = ra.field_c.readUnsignedByte(true);
              var5_ref_di__ = new di[var4Lifetime1];
              for (var6Lifetime2 = 0; var4Lifetime1 > var6Lifetime2; var6Lifetime2++) {
                var5_ref_di__[var6Lifetime2] = mm.a(ra.field_c, false);
              }
              stackIn_208_0 = var2_intLifetime1;
              stackIn_208_1 = var3Lifetime3;
              stackIn_208_2 = 22;
              stackIn_209_3 = (hc.field_c == 57);
              HuffmanDecoder.$cfr$intArgs$a$ed16b0445cf3(stackIn_208_0, stackIn_208_1, stackIn_208_2, stackIn_209_3, var5_ref_di__);
              continue scanLoop1;
            }
            break;
          }
          stackIn_254_0Lifetime1 = 0;
          stackIn_254_1Lifetime1 = 0;
          op.a(stackIn_254_0Lifetime1, stackIn_254_1Lifetime1);
          if (dm.c(81)) {
            var2_intLifetime2 = this.f((byte) 101);
            if (var2_intLifetime2 == 0 ||
              var2_intLifetime2 == 1) {
              if (!ed.c(true)) {
                gm.field_d = null;
              }
              if (var2_intLifetime2 == 1) {
                AccountNameAvailabilityValidator.field_s = true;
              } else {
                if (nf.field_A) {
                  gh.field_f = true;
                  gd.a(0, 0, 0, false);
                }
                AccountNameAvailabilityValidator.field_s = false;
              }
            }
            var3Lifetime1 = 0;
            if (var2_intLifetime2 == 2) {
              var3Lifetime1 = 1;
            }
            if (AccountNameAvailabilityValidator.field_s) {
              var3Lifetime1 = 1;
            }
            if (!dm.c(71)) {
              var3Lifetime1 = 0;
            }
            if (var3Lifetime1 != 0) {
              l.a(-1);
              return;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw AccountServiceResult.wrapClientException((Throwable) ((Object) var2_ref), "DungeonAssault.C(" + param0 + ')');
        }
    }

    final void initializeGame(byte param0) {
        CrossfadingMidiPcmStream var3 = null;
        boolean stackIn_6_0 = false;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          this.a(false, 32, 8, 2, 17, 0, 5000, 1);
          var3 = new CrossfadingMidiPcmStream();
          var3.field_A.c((byte) 7, 128, 9);
          var3.field_B.c((byte) -120, 128, 9);
          AccountRequestState.a(true, var3, 22050, 22050, (java.awt.Component) ((Object) AwtRasterBuffer.field_h), -126, 2048, i.field_A);
          cm.a(1.600000023841858f, 0.9200000166893005f, -7788, 0.10000000149011612f, 25.0f);
          AgeValidator.field_p = 16711680;
          Bzip2State.field_l = 128;
          ui.field_b = 4473924;
          il.field_a = 255;
          om.field_a = 16777215;
          sm.field_c = 16776960;
          j.f((byte) -4);
          kd.b(0);
          this.b(true, (byte) -67);
          uo.field_c[70] = 0;
          uo.field_c[55] = 704;
          uo.field_c[57] = -2;
          uo.field_c[66] = 2;
          uo.field_c[54] = -1;
          uo.field_c[67] = 9;
          uo.field_c[62] = -2;
          uo.field_c[59] = 8;
          uo.field_c[56] = -2;
          uo.field_c[72] = 0;
          uo.field_c[65] = -1;
          kj.field_n = 0;
          uo.field_c[58] = 0;
          uo.field_c[61] = -1;
          uo.field_c[68] = 3;
          uo.field_c[63] = 10;
          if (param0 > -15) {
            return;
          }
          stackIn_6_0 = !(2 > ResourceArchive.field_k);
          DualLinkNode.field_k = stackIn_6_0;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw AccountServiceResult.wrapClientException((Throwable) ((Object) var2), "DungeonAssault.A(" + param0 + ')');
        }
    }

    public final void init() {
        try {
          this.a(32, "dungeonassault", 0);
        } catch (RuntimeException runtimeException) {
          throw AccountServiceResult.wrapClientException((Throwable) ((Object) runtimeException), "DungeonAssault.init()");
        }
    }

    final void releaseGameResources(boolean param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          DungeonAssault.clearDungeonAssaultGlobals((byte) 114);
          a.clearDeclaredStaticReferences(23779);
          IntrusiveDeque.clearStaticReferences(-4);
          CrossfadingMidiPcmStream.clearStaticReferences((byte) -86);
          rl.clearStaticReferences((byte) 75);
          vj.clearStaticReferences(24243);
          nb.a((byte) 109);
          td.clearStaticReferences(23);
          DungeonAssaultScreen.clearStaticReferences();
          te.clearStaticReferences();
          gh.a(7);
          KeyboardInput.resetStaticState(-129);
          sb.clearStaticReferences((byte) -88);
          fo.clearStaticReferences((byte) -73);
          t.a(-11353);
          jh.clearStaticReferences();
          NetworkGameClient.clearStaticReferences(-1);
          ClientException.b(-30719);
          GameAppletShell.a(false);
          tl.clearStaticReferences((byte) 50);
          MouseInput.clearStaticReferences(16);
          MouseWheelInput.clearStaticReferences((byte) -109);
          SoftwareRasterizer.clearStaticReferences();
          ResourceArchive.clearStaticReferences(param0);
          BitmapFont.clearStaticReferences();
          ig.a(-2898);
          dm.clearStaticReferences(0);
          PacketBuffer.clearStaticReferences(25);
          kd.clearStaticReferences((byte) -101);
          sp.clearStaticReferences(true);
          ml.clearStaticReferences((byte) 63);
          ri.clearStaticReferences(105);
          sn.a(5);
          ib.d(507);
          ta.clearStaticReferences(-84);
          to.a(0);
          kp.clearStaticReferences(0);
          cg.clearStaticReferences((byte) -117);
          la.clearStaticReferences((byte) -97);
          op.clearStaticReferences((byte) -120);
          mp.clearStaticReferences((byte) 112);
          sl.clearStaticReferences(105);
          FrameTimer.a((byte) 80);
          AwtRasterBuffer.clearStaticReferences(-9431);
          wk.b(false);
          FullscreenFocusCanvas.clearStaticReferences((byte) -115);
          bn.a((byte) -122);
          DungeonRaidScreen.clearRaidScreenGlobals(10);
          PlayerDungeonProfile.clearStaticReferences((byte) 119);
          hi.clearStaticReferences(-113);
          ea.a(0);
          ke.clearStaticReferences(-123);
          n.clearStaticReferences(3554);
          Raider.clearStaticReferences((byte) 3);
          DungeonTileState.clearStaticReferences((byte) 106);
          jc.clearStaticReferences(0);
          ua.a((byte) 103);
          IntrusiveNode.clearStaticReferences(-18880);
          qj.a(-2418);
          bc.clearStaticReferences(24740);
          lc.clearStaticReferences(true);
          HuffmanDecoder.clearStaticReferences(param0);
          lg.clearStaticReferences(true);
          eh.a(73);
          sg.clearStaticReferences((byte) -88);
          f.clearStaticReferences(!param0);
          fp.clearStaticReferences(-4126);
          pp.clearDeclaredStaticReferences(73);
          gd.e(0);
          nn.clearStaticReferences((byte) -80);
          kl.a(117);
          rj.clearStaticReferences(false);
          sa.clearStaticReferences(false);
          MidiPcmStream.e(0);
          wa.c(23413);
          lp.clearStaticReferences((byte) 16);
          vm.clearStaticReferences();
          MusicPatchPcmStream.resetStaticState(26609);
          AudioOutput.clearStaticReferences();
          cb.clearStaticReferences(27525);
          ae.clearStaticReferences((byte) -4);
          ko.clearDeclaredStaticReferences(-125);
          qk.clearStaticReferences((byte) 127);
          uf.clearStaticReferences(0);
          gm.clearStaticReferences(-94);
          CombatState.clearCombatStateGlobals(126);
          mo.clearStaticReferences(2);
          ul.clearStaticReferences(true);
          jg.a((byte) -126);
          BufferedRandomAccessFile.clearStaticReferences((byte) 117);
          uj.a(37);
          cd.clearStaticReferences(-1);
          vc.clearStaticReferences(-6058);
          mi.clearStaticReferences(-128);
          fd.a((byte) 65);
          hl.a(50);
          BufferedSocket.clearStaticReferences(true);
          CipherPacketBuffer.resetStaticState(7);
          MenuScreen.resetStaticState(0);
          dd.clearStaticReferences((byte) -40);
          en.clearStaticReferences(0);
          d.clearStaticReferences(0);
          DungeonBuilderScreen.clearStaticReferences(!param0);
          ed.clearDeclaredStaticReferences((byte) -89);
          RaiderRecruitmentScreen.clearStaticReferences(-2431);
          bg.clearStaticReferences(41);
          pd.clearStaticReferences((byte) 71);
          le.clearStaticReferences(103);
          di.clearStaticReferences((byte) -78);
          db.clearStaticReferences((byte) 127);
          wo.clearStaticReferences((byte) 100);
          jm.clearStaticReferences((byte) -123);
          IntroSequenceScreen.clearStaticReferences((byte) -124);
          tk.clearStaticReferences((byte) 10);
          ob.discardDeclaredStaticReferences(16);
          InstructionsScreen.clearStaticReferences((byte) -106);
          BoundedRandomAccessFile.b((byte) 56);
          qd.a(true);
          ji.clearDeclaredStaticReferences((byte) -98);
          AccountCreationResultPanel.discardDeclaredStaticReferences(-71);
          wi.discardDeclaredStaticReferences((byte) -97);
          jk.releaseDeclaredStaticReferences(-18554);
          nk.releaseDeclaredStaticReferences(2121792);
          AccountRegistrationPanel.releaseDeclaredStaticReferences((byte) -53);
          ia.resetStaticState(!param0);
          LoginPanel.releaseDeclaredStaticReferences((byte) -108);
          DisplayNameSelectionPanel.clearStaticReferences(param0);
          lh.clearStaticReferences(-107);
          so.clearStaticReferences((byte) 95);
          df.a(255);
          fj.clearStaticReferences((byte) -75);
          IsaacRandom.clearStaticReferences(-103);
          hj.clearDeclaredStaticReferences(16744448);
          lo.clearStaticReferences(114);
          DualLinkNode.a((byte) 92);
          SpriteGeometry.clearStaticReferences(true);
          s.clearStaticReferences(-55);
          pa.clearStaticReferences(2601);
          ka.resetStaticState((byte) -67);
          PcmOutputWorker.clearStaticReferences(param0);
          il.clearStaticReferences((byte) 111);
          bb.clearStaticReferences((byte) 127);
          DiskCacheWorker.clearStaticReferences(-86);
          je.clearStaticReferences(true);
          tm.clearStaticReferences(-107);
          GzipDecompressor.clearStaticReferences(0);
          qa.clearStaticReferences(-2544);
          ld.clearStaticReferences(false);
          hc.resetStaticState(32);
          nm.clearDeclaredStaticReferences(38);
          vd.clearStaticReferences((byte) -96);
          hh.clearStaticReferences(1);
          re.clearStaticReferences();
          jp.clearStaticReferences();
          sm.clearStaticReferences((byte) -118);
          qh.clearStaticReferences((byte) 75);
          jj.clearStaticReferences((byte) 80);
          rn.b(64);
          om.clearStaticReferences(63);
          mn.clearStaticReferences((byte) 94);
          jl.clearStaticReferences((byte) -113);
          li.resetStaticState(false);
          ok.releaseDeclaredStaticReferences(-16218);
          tb.clearStaticReferences((byte) -47);
          DelegatingCanvas.b((byte) 20);
          ik.clearStaticReferences(0);
          ra.a((byte) -114);
          ByteStorage.clearStaticReferences((byte) 23);
          Bzip2Decompressor.clearStaticReferences();
          Bzip2State.a((byte) 108);
          oe.clearDeclaredStaticReferences(0);
          kn.a(0);
          nj.resetStaticState((byte) 84);
          oh.clearStaticReferences(37);
          an.clearDeclaredStaticReferences(-13023);
          jn.resetStaticState(1);
          im.clearStaticReferences(-1);
          l.a((byte) -24);
          lm.clearStaticReferences((byte) -123);
          InteractiveWidget.b(!param0);
          da.clearDeclaredStaticReferences(6);
          sj.releaseDeclaredStaticReferences((byte) -10);
          rf.clearStaticReferences(param0);
          ii.clearDeclaredStaticReferences((byte) -21);
          dj.a((byte) 113);
          am.a(30111);
          VorbisFloor.clearStaticReferences();
          vb.clearStaticReferences((byte) -69);
          nf.e((byte) 93);
          hk.clearStaticReferences(-73);
          gb.resetStaticState(32767);
          eg.clearStaticReferences(-23658);
          hp.clearStaticReferences(35);
          no.resetStaticState((byte) -126);
          um.a(false);
          ProxyAuthenticationRequiredException.clearStaticReferences(98);
          NanoFrameTimer.clearStaticReferences(-102);
          ImageProducerRasterBuffer.clearStaticReferences(false);
          ag.clearStaticReferences(16760896);
          ki.clearStaticReferences((byte) -35);
          sf.c((byte) 114);
          lj.d(77);
          ro.f((byte) -88);
          oj.clearStaticReferences((byte) -29);
          uo.clearStaticReferences(-90);
          gl.clearStaticReferences((byte) -105);
          oc.clearStaticReferences(4296);
          dl.a(51);
          tp.clearStaticReferences(35);
          up.a(false);
          NetworkArchiveRequest.resetStaticState(true);
          SectorCacheStore.clearStaticReferences(1148357992);
          DiskArchiveRequest.clearDeclaredStaticReferences(96);
          ti.clearStaticReferences(true);
          sh.clearStaticReferences(false);
          ArchiveRequest.d(21);
          dg.clearStaticReferences(false);
          ValidatedTextField.clearDeclaredStaticReferences((byte) -41);
          EditableTextField.resetStaticState(4);
          hf.clearDeclaredStaticReferences(0);
          uc.clearStaticReferences(false);
          NameSuggestionsPanel.releaseDeclaredStaticReferences((byte) -32);
          bh.clearDeclaredStaticReferences((byte) -106);
          ng.f((byte) 124);
          tn.h((byte) -89);
          rb.clearDeclaredStaticReferences(4935);
          TextFieldValidator.c((byte) 19);
          mf.clearStaticReferences(5);
          cm.clearDeclaredStaticReferences(-119);
          mk.clearStaticReferences(false);
          wg.clearStaticReferences();
          kk.clearDeclaredStaticReferences(0);
          of.clearStaticReferences((byte) 65);
          ah.clearStaticReferences(-37);
          np.clearStaticReferences((byte) -74);
          fk.clearStaticReferences(67);
          j.clearDeclaredStaticReferences((byte) -7);
          eb.clearDeclaredStaticReferences((byte) 86);
          ol.clearStaticReferences((byte) -96);
          fe.clearStaticReferences((byte) -34);
          DirectByteStorage.clearStaticReferences(124);
          bp.a(-1);
          oi.releaseDeclaredStaticReferences(119);
          bj.h(31029);
          ad.clearStaticReferences(1);
          IterableNodeHashTable.clearStaticReferences(true);
          SecondaryNodeDeque.clearStaticReferences(20);
          wf.clearStaticReferences((byte) -28);
          pb.e((byte) -78);
          ha.clearStaticReferences(64);
          rc.clearStaticReferences((byte) -127);
          rp.b((byte) -68);
          g.g(-101);
          oo.clearStaticReferences(13054);
          SoundFilter.clearStaticReferences();
          NodeHashTableIterator.clearStaticReferences(0);
          SecondaryNodeDequeIterator.clearStaticReferences((byte) -90);
          fa.a(-28822);
          PackedBitSet.clearStaticReferences((byte) 112);
          gg.clearStaticReferences(0);
          AchievementIconEntry.d(269);
          tf.a(-1);
          k.clearStaticReferences(true);
          fm.clearStaticReferences(param0);
          cf.clearStaticReferences(30);
          o.clearDeclaredStaticReferences(0);
          wh.clearStaticReferences(96);
          na.clearDeclaredStaticReferences(-91);
          oa.clearStaticReferences((byte) 126);
          mc.clearDeclaredStaticReferences(24);
          ic.releaseDeclaredStaticReferences(4741);
          dk.clearStaticReferences((byte) -107);
          sd.clearStaticReferences(false);
          al.clearStaticReferences((byte) 17);
          fn.clearDeclaredStaticReferences(1);
          mj.clearStaticReferences(127);
          bo.clearStaticReferences((byte) -36);
          pm.clearDeclaredStaticReferences(112);
          bl.clearStaticReferences((byte) -128);
          jd.clearDeclaredStaticReferences(1);
          RaiderDefinition.clearRaiderDefinitionGlobals((byte) 16);
          ac.clearStaticReferences(19757);
          AccountRequestState.clearStaticReferences(0);
          AccountServiceResult.clearStaticReferences((byte) 75);
          SpriteAnimationPlayer.clearAnimationPlayerGlobals(115);
          fl.resetStaticState((byte) 63);
          gn.clearStaticReferences(194);
          ie.d(-102);
          lf.d(-121);
          pk.e(88);
          ce.resetStaticState((byte) 58);
          bf.clearStaticReferences((byte) 85);
          me.clearStaticReferences(36);
          ef.clearStaticReferences((byte) 111);
          ao.clearDeclaredStaticReferences(10625);
          ba.clearStaticReferences((byte) 117);
          ch.clearStaticReferences(0);
          sc.clearStaticReferences((byte) -94);
          vl.a((byte) -115);
          e.clearStaticReferences((byte) 29);
          qf.b(-21);
          jf.a(!param0);
          fc.clearDeclaredStaticReferences(18677);
          bd.clearDeclaredStaticReferences(76);
          cp.resetStaticState((byte) -66);
          u.clearStaticReferences((byte) 96);
          lk.h(25161);
          kc.clearDeclaredStaticReferences(0);
          pe.clearDeclaredStaticReferences(9);
          ak.clearDeclaredStaticReferences(-120);
          ve.clearStaticReferences(-125);
          r.resetStaticState(-113);
          i.clearStaticReferences((byte) 122);
          kj.resetStaticState(-109);
          mm.a(127);
          ub.clearStaticReferences((byte) 123);
          ue.clearStaticReferences((byte) 36);
          pi.clearStaticReferences(11877);
          tg.clearStaticReferences(400);
          AccountNameAvailabilityValidator.clearStaticReferences((byte) 102);
          PasswordValidator.clearDeclaredStaticReferences(1);
          EmailFormatValidator.clearStaticReferences(false);
          ConfirmedEmailAvailabilityValidator.clearStaticReferences((byte) 75);
          AgeValidator.d((byte) 117);
          MatchingFieldValidator.clearDeclaredStaticReferences(-15818);
          fb.clearStaticReferences(25);
          ci.resetStaticState(116);
          od.clearStaticReferences((byte) 106);
          DebouncedFieldValidator.clearStaticReferences(-1);
          ab.resetStaticState(1781937827);
          this.field_p = null;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw AccountServiceResult.wrapClientException((Throwable) ((Object) var2), "DungeonAssault.B(" + param0 + ')');
        }
    }

    public DungeonAssault() {
    }

    private final boolean finishLoadingAndInitializeScreens(int param0) {
        int stackIn_46_0 = 0;
        int stackIn_46_1 = 0;
        boolean stackIn_50_0 = false;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int stackIn_46_0Lifetime1;
        int stackIn_46_1Lifetime1;
        var3 = field_K;
        try {
          AgeValidator.e(param0 - 23487);
          if (!tf.a((java.applet.Applet) (this), 1041792321)) {
            return false;
          }
          DungeonTileState.measureRaidTutorialPanelWidth(param0 - 78);
          var2_int = param0;
          while (var2_int < 14) {
            stackIn_46_0 = ~var2_int;
            stackIn_46_1 = -5;
            if (stackIn_46_0 == stackIn_46_1) {
              bf.field_f[var2_int] = (DungeonAssaultScreen) ((Object) new DungeonBuilderScreen());
            } else {
              if (var2_int == 5) {
                bf.field_f[var2_int] = (DungeonAssaultScreen) ((Object) new RaiderRecruitmentScreen());
              } else {
                if (var2_int == 2) {
                  bf.field_f[var2_int] = (DungeonAssaultScreen) ((Object) new bg());
                } else {
                  if (var2_int != 3) {
                    if (var2_int == 13) {
                      bf.field_f[var2_int] = (DungeonAssaultScreen) ((Object) new IntroSequenceScreen());
                    } else {
                      if (var2_int == 7) {
                        bf.field_f[var2_int] = (DungeonAssaultScreen) ((Object) new InstructionsScreen());
                      } else {
                        bf.field_f[var2_int] = (DungeonAssaultScreen) ((Object) new MenuScreen(var2_int));
                      }
                    }
                  } else {
                    bf.field_f[var2_int] = (DungeonAssaultScreen) ((Object) new db());
                  }
                }
              }
            }
            var2_int++;
          }
          mn.field_b = 13;
          Bzip2State.field_z = 13;
          bf.field_f[13].initializeScreen(false);
          if (ed.c(true)) {
            gm.field_d = null;
          }
          ag.a(50, 55);
          nf.d(param0 + 0);
          i.field_A.requestCursorVisibility((java.awt.Component) ((Object) AwtRasterBuffer.field_h), (byte) 25, false);
          NameSuggestionsPanel.field_R = AwtRasterBuffer.field_h;
          DualLinkNode.a(-26);
          stackIn_46_0Lifetime1 = ResourceArchive.field_k;
          stackIn_46_1Lifetime1 = 2;
          stackIn_50_0 = !(stackIn_46_0Lifetime1 < stackIn_46_1Lifetime1);
          DualLinkNode.field_k = stackIn_50_0;
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw AccountServiceResult.wrapClientException((Throwable) ((Object) var2), "DungeonAssault.G(" + param0 + ')');
        }
    }

    final void prepareGameShutdown(boolean param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          wh.a(96);
          if (null != cm.field_R) {
            ib.a(930);
          }
          kp.a(1);
          if (!param0) {
            field_G = (String) null;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw AccountServiceResult.wrapClientException((Throwable) ((Object) var2), "DungeonAssault.F(" + param0 + ')');
        }
    }

    final void renderFrame(byte param0) {
        boolean stackIn_37_0 = false;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        Object var3 = null;
        int var3_int = 0;
        a var3_ref = null;
        int var4_int = 0;
        long var4_long = 0L;
        RgbSprite var4 = null;
        int var5_int = 0;
        RgbSprite var5 = null;
        long var6_long = 0L;
        int var6 = 0;
        long var8 = 0L;
        int var10 = 0;
        java.awt.Canvas var11 = null;
        int var3_intLifetime1;
        int var4_intLifetime1;
        int var5_intLifetime1;
        var3 = null;
        var10 = field_K;
        try {
          var11 = InstructionsScreen.getActiveCanvas(false);
          if (ao.a((byte) 72)) {
            mf.a((byte) -101, IntrusiveDeque.f(20), var11);
            return;
          }
          if (!ef.field_h) {
            g.a(var11, 18131);
            return;
          }
          if (param0 != 38) {
            this.updateScreensAndTransitions(true, (byte) -98);
          }
          if (!hc.b(1)) {
            tp.a(10, 100.0f, kj.field_m);
            g.a(var11, param0 + 18093);
            return;
          }
          li.field_k = li.field_k + 1;
          if (~fm.field_a != ~bn.field_n) {
            BoundedRandomAccessFile.a((byte) -24, mn.field_b, true);
            if (DiskArchiveRequest.field_G != null) {
              DiskArchiveRequest.field_G.a(true, bd.field_f);
              bd.field_f = bd.field_f + 1;
              if (bd.field_f == 64) {
                AccountRequestState.a((byte) 127);
              }
            }
          }
          if (ib.a((byte) 35)) {
            SoftwareRasterizer.darkenRectangleHalf(0, 0, SoftwareRasterizer.field_i, SoftwareRasterizer.field_c);
            var3_int = 15 + la.a((byte) -105);
            var4_int = 30 + KeyboardInput.b(4);
            fm.a(ea.a((byte) 13), var3_int, var4_int, (byte) -127);
            ci.a((byte) -119);
          }
          if (!sl.b(15000)) {
            if (ue.b((byte) -112) &&
              !ib.a((byte) 109)) {
              SoftwareRasterizer.darkenRectangleHalf(0, 0, SoftwareRasterizer.field_i, SoftwareRasterizer.field_c);
              rc.a(-126);
            }
          } else {
            if (cm.field_R == null) {
              stackIn_37_0 = rj.field_o;
            } else {
              stackIn_37_0 = true;
            }
            fl.a(stackIn_37_0, (byte) 120);
          }
          if (~fm.field_a != ~fm.field_e) {
            var3_intLifetime1 = pk.field_t * 256 / 16;
            if (var3_intLifetime1 > 0) {
              SoftwareRasterizer.fillRectangleAlpha(0, 0, SoftwareRasterizer.field_i, SoftwareRasterizer.field_c, 0, var3_intLifetime1);
            }
          }
          var3_ref = (a) (ProxyAuthenticationRequiredException.field_a.beginBackward(-24172));
          if (var3_ref != null) {
            if (null == sl.field_b) {
              ah.a(true, var3_ref.field_j);
            }
            var4_intLifetime1 = 0;
            if (40 <= ke.field_e) {
              if (80 > ke.field_e) {
                var5_int = (ke.field_e - 40 << 8) / 40;
                ri.field_g.drawScaledAlpha(8, 0, 32, 32, var5_int);
              } else {
                if (230 <= ke.field_e) {
                  if (ke.field_e >= 270) {
                    var4_intLifetime1 = 1;
                  } else {
                    var5_int = (-ke.field_e + 270 << 8) / 40;
                    var4_intLifetime1 = 1;
                    ri.field_g.drawScaledAlpha(8, 0, 32, 32, var5_int);
                  }
                } else {
                  PacketBuffer.field_j[var3_ref.field_j].a(8, 0, 32, 32);
                }
              }
            }
            if ((1 & li.field_k) != 0) {
              sl.field_b.a();
            } else {
              if (var4_intLifetime1 == 0) {
                sl.field_b.a(pa.field_a, 0, 0);
              } else {
                sl.field_b.b();
              }
            }
            if (40 <= ke.field_e) {
              if (80 <= ke.field_e) {
                if (ke.field_e < 230) {
                  IntrusiveNode.field_c.drawStringAlpha(ce.field_o[var3_ref.field_j], 48, 32 + IntrusiveNode.field_c.field_H >> 1, 0, -1, 128);
                } else {
                  if (270 > ke.field_e) {
                    var5_intLifetime1 = (-ke.field_e + 270 << 8) / 40;
                    IntrusiveNode.field_c.drawStringAlpha(ce.field_o[var3_ref.field_j], 48, 32 + IntrusiveNode.field_c.field_H >> 1, 0, -1, var5_intLifetime1 >> 1);
                  }
                }
              } else {
                var5_intLifetime1 = (-40 + ke.field_e << 8) / 40;
                IntrusiveNode.field_c.drawStringAlpha(ce.field_o[var3_ref.field_j], 48, 32 + IntrusiveNode.field_c.field_H >> 1, 0, -1, var5_intLifetime1 >> 1);
              }
            }
          }
          if (ResourceArchive.field_k >= 2 &&
            ld.field_b) {
            IntrusiveNode.field_c.drawString(Integer.toString(bc.field_a), 20, 20, 16777215, 1);
            var4_long = Runtime.getRuntime().totalMemory();
            var6_long = Runtime.getRuntime().freeMemory();
            var8 = var4_long - var6_long;
            IntrusiveNode.field_c.drawString((int)(var8 >> 10) + "kb", 4, IntrusiveNode.field_c.field_H * 2 + 8, 16777215, -1);
            IntrusiveNode.field_c.drawString(CrossfadingMidiPcmStream.field_u, 20, 80, 16777215, 1);
          }
          var4 = AccountNameAvailabilityValidator.field_m[kj.field_n / 5];
          var5 = jg.field_c[kj.field_n / 5];
          if (hj.field_S != -1) {
            var6 = (int)((3.0 + Math.cos((double)((float)mo.field_a / 20.0f))) * 64.0);
            var5.drawAdditive(hj.field_S, eh.field_h, var6);
            var4.draw(hj.field_S, eh.field_h);
          }
          ob.a(0, param0 - 161, var11, 0);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw AccountServiceResult.wrapClientException((Throwable) ((Object) var2), "DungeonAssault.D(" + param0 + ')');
        }
    }

    static {
        field_J = "Beastman";
        field_G = "<col=E5A634>Your title, </col><%0><col=E5A634>, will appear in the Dragons of Renown table.";
        field_H = "Trap";
    }
}
