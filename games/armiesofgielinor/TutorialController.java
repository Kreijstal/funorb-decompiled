/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class TutorialController {
    static int[] field_e;
    private dl field_d;
    static String field_b;
    private int tutorialStage;
    static int[] field_c;
    static String[] field_f;

    private final void b(boolean param0, int param1, int param2) {
        int stackIn_53_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        String var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        var14 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          if (param1 == 49) {
            return;
          }
          var4_int = MoveEvent.field_y[this.tutorialStage][param1];
          if ((var4_int == 32 ||
            var4_int == 31) && hi.field_j < 2) {
            return;
          }
          var5 = this.e(var4_int, 29);
          var6 = nr.field_e.a(var5) / 2;
          var7 = this.a(true, param1);
          var8 = this.a(param1, -3858);
          var9 = this.a(param1, true);
          if (var4_int == 17 ||
            var4_int == 18) {
            var6 = kt.field_o[0].field_y + wd.field_b;
          }
          var10 = -var6 + var7 + var8 >> 1;
          var11 = var10;
          if (var4_int != 18 ||
            og.field_m != 3) {
            if (18 == var4_int &&
              og.field_m == 2) {
              var11 = var10 - 30;
              if (var14 != 0) {
                var11 = var10 - 27;
              }
            }
          } else {
            var11 = var10 - 27;
          }
          if (var4_int == 17 &&
            og.field_m == 2) {
            var11 = 10 + var10;
          }
          if (param2 != 28115) {
            this.f(93);
          }
          if (!param0) {
            fe.a(var5, var11, 25 + var9, nd.field_b, true);
          }
          if (param0 ||
            var14 != 0) {
            fe.a(var5, var11, var9 + 25, field_e, true);
          }
          var12 = this.b((byte) 84, param1);
          if (var12 > -1) {
            BestScoreStrategy.field_m.f(var12, -2 + var9);
          }
          if (var4_int != 17 &&
            var4_int != 18) {
            return;
          }
          var10 = var10 + wd.field_b;
          kt.field_o[0].g(var10, var9 + 5);
          if (17 == var4_int) {
            stackIn_53_0 = 100 * bp.field_e / 256;
          } else {
            stackIn_53_0 = te.field_n * 100 / 256;
          }
          var13 = stackIn_53_0;
          SoftwareRaster.f(var10, 5 + var9, var10 + var13, var9 + 19);
          kt.field_o[1].g(var10, 5 + var9);
          SoftwareRaster.a();
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw ig.a((Throwable) ((Object) var4), "ci.RA(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    private final void g(int param0) {
        RuntimeException runtimeException = null;
        int var2_int = 0;
        int var3 = 0;
        String var4 = null;
        int stackIn_4_0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          var2_int = io.a(i.field_Nb, (byte) 127) ? 1 : 0;
          stackIn_4_0 = (pq.field_f == null) ? 0 : 1;
          var3 = stackIn_4_0;
          if (var3 == 0 &&
            var2_int == 0) {
            jt.field_a = 0;
            return;
          }
          var4 = pk.field_V;
          var4 = var4 + " " + ia.a(fo.a(param0 ^ 4800, ar.a(var2_int != 0, false, (byte) -115, var3 != 0), new String[]{dv.field_r}), '#', param0 ^ 3, "<br><br>");
          fe.b(40, 180, 560, 150, io.field_m, nd.field_b, param0, 128);
          rs.field_n.a(var4, 80, 200, 480, 300, 16777215, -1, 1, 0, 30);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw ig.a((Throwable) ((Object) runtimeException), "ci.JB(" + param0 + ')');
        }
    }

    private final int d(int param0, int param1) {
        RuntimeException var3 = null;
        int stackIn_5_0 = 0;
        int stackIn_11_0 = 0;
        int stackIn_14_0 = 0;
        int stackIn_20_0 = 0;
        int stackIn_23_0 = 0;
        int stackIn_25_0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != 12) {
            field_f = (String[]) null;
          }
          if (this.tutorialStage == 16) {
            stackIn_5_0 = 20;
            return stackIn_5_0;
          }
          if (this.tutorialStage == 7 &&
            null != MoveEvent.field_G) {
            stackIn_11_0 = MoveEvent.field_G.a(param1, false);
            return stackIn_11_0;
          }
          if (this.tutorialStage == 7) {
            stackIn_14_0 = 1;
            return stackIn_14_0;
          }
          if (this.tutorialStage == 5 &&
            null != MoveEvent.field_E) {
            stackIn_20_0 = MoveEvent.field_E.a(false, param1);
            return stackIn_20_0;
          }
          if (5 != this.tutorialStage) {
            stackIn_25_0 = 30;
            return stackIn_25_0;
          }
          stackIn_23_0 = 1;
          return stackIn_23_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw ig.a((Throwable) ((Object) var3), "ci.EA(" + param0 + ',' + param1 + ')');
        }
    }

    private final void c(boolean param0) {
        int discarded$0 = 0;
        boolean stackIn_24_3 = false;
        boolean stackIn_30_3 = false;
        int stackIn_70_0 = 0;
        int stackIn_70_1 = 0;
        int stackIn_70_2 = 0;
        int stackIn_70_3 = 0;
        boolean stackIn_103_0 = false;
        boolean stackIn_116_0 = false;
        int stackIn_123_0 = 0;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_23_3;
        boolean stackOut_102_0;
        boolean stackOut_115_0;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int stackIn_123_0Lifetime1;
        int var3Lifetime1;
        int var4Lifetime1;
        int var4Lifetime2;
        int var5Lifetime1;
        int var6Lifetime1;
        int stackIn_123_0Lifetime2;
        int var3Lifetime2;
        int var4Lifetime3;
        var7 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          if (1 == DeployEvent.field_A) {
            if (wg.a(-33, db.a(true, 44), db.a(true, 159), MatchConditionEntry.a(384, (byte) 94), MatchConditionEntry.a(416, (byte) 94))) {
              tg.field_k = 1;
              if (ih.field_p != null &&
                tg.field_k == 0) {
                KingBlackDragonEvent.field_A = 0;
                ts.field_j = ih.field_p;
                wj.field_q = 0;
              }
              ub.$cfr$intArgs$a$6d836999ad61(123, im.field_v[2]);
            }
            if (wg.a(-33, db.a(true, 171), db.a(true, 286), MatchConditionEntry.a(384, (byte) 94), MatchConditionEntry.a(416, (byte) 94))) {
              tg.field_k = 0;
              ub.$cfr$intArgs$a$6d836999ad61(121, im.field_v[2]);
            }
          }
          if (KingBlackDragonEvent.field_A == 0) {
            var2_int = 0;
            while (true) {
              if (var2_int < 5) {
                stackIn_70_0 = MatchConditionEntry.a(98, (byte) 94);
                stackIn_70_1 = db.a(true, 55 * var2_int + 310 + 40);
                stackIn_70_2 = 22;
                stackOut_23_3 = param0;
                stackIn_70_3 = stackOut_23_3 ? 1 : 0;
                stackIn_24_3 = stackOut_23_3;
                if (var7 == 0) {
                  stackIn_30_3 = !(stackIn_24_3);
                  if (ml.a(stackIn_70_0, stackIn_70_1, stackIn_70_2, stackIn_30_3)) {
                    if (DeployEvent.field_A == 2 &&
                      pg.field_d.field_d[var2_int] > -1) {
                      pg.field_d.field_d[var2_int] = -1;
                      AttackEvent.b(false);
                      ub.$cfr$intArgs$a$6d836999ad61(101, MoveAttackRequest.field_v[45]);
                    }
                    if (pg.field_d.field_d[var2_int] > -1) {
                      if (hi.field_j >= 2 &&
                        br.field_f[82]) {
                        hs.b(119, pg.field_d.field_d[var2_int]);
                        return;
                      }
                      if (tg.field_k != 0) {
                        ab.field_a = ev.field_d;
                        ev.field_d = pg.field_d.field_d[var2_int];
                        ts.field_j = ct.field_o[ev.field_d];
                        this.a((byte) 96, ev.field_d, (rg) null);
                        return;
                      }
                      wj.field_q = 248;
                      ab.field_a = ev.field_d;
                      ev.field_d = pg.field_d.field_d[var2_int];
                      ih.field_p = ct.field_o[ev.field_d];
                      this.a((byte) 88, ev.field_d, (rg) null);
                      if (ts.field_j != ih.field_p) {
                        ub.$cfr$intArgs$a$6d836999ad61(127, MoveAttackRequest.field_v[44]);
                        return;
                      }
                      ub.$cfr$intArgs$a$6d836999ad61(31, MoveAttackRequest.field_v[42]);
                    }
                    return;
                  }
                  var2_int++;
                  continue;
                }
              } else {
                if (DeployEvent.field_A == 2) {
                  return;
                }
                var2_int = (nr.field_e.a(ig.field_m) >> 1) + 40;
                stackIn_70_0 = -33;
                stackIn_70_1 = db.a(true, 620 - var2_int);
                stackIn_70_2 = db.a(true, 620);
                stackIn_70_3 = MatchConditionEntry.a(19, (byte) 94);
              }
              if (wg.a(stackIn_70_0, stackIn_70_1, stackIn_70_2, stackIn_70_3, MatchConditionEntry.a(e.field_b[0].field_v + 19, (byte) 94))) {
                CipherPacketBuffer.a(true, -9, 1, 0);
                ub.$cfr$intArgs$a$6d836999ad61(91, im.field_v[2]);
                return;
              }
              if (tg.field_k == 0) {
                if (wg.a(-33, db.a(true, 469), db.a(true, 606), MatchConditionEntry.a(384, (byte) 94), MatchConditionEntry.a(416, (byte) 94))) {
                  if (ev.field_d > -1 &&
                    ev.field_d < 135 &&
                    pg.field_d.field_a[ev.field_d] < 250 &&
                    pg.field_d.a(uc.spellDefinitions[ev.field_d][0], (byte) 103)) {
                    vl.field_n.h(32161, 70);
                    vl.field_n.b(true, ev.field_d + 2000);
                    pg.field_d.field_a[ev.field_d] = pg.field_d.field_a[ev.field_d] + 1;
                    this.a((byte) 48, ev.field_d, (rg) null);
                    ub.$cfr$intArgs$a$6d836999ad61(58, im.field_v[2]);
                  }
                  return;
                }
                if (ml.a(MatchConditionEntry.a(212, (byte) 94), db.a(true, 165), 20, false)) {
                  if (null != ts.field_j.field_j) {
                    vu.field_O = ts.field_j;
                    wj.field_q = 248;
                    KingBlackDragonEvent.field_A = -248;
                    ts.field_j = ts.field_j.field_j;
                    this.a((byte) 51, -1, ts.field_j);
                    ub.$cfr$intArgs$a$6d836999ad61(118, MoveAttackRequest.field_v[43]);
                    ab.field_a = ev.field_d;
                    ev.field_d = -1;
                  }
                  return;
                }
                boolean decompiledFrameCompleted1 = true;
                boolean decompiledFrameCompleted0 = true;
                boolean decompiledFrameRemainder0 = true;
                if (ts.field_j.field_a != null) {
                  var3 = ts.field_j.field_a.length;
                  var4 = 0;
                  while (var3 > var4) {
                    var5 = 165 + (int)(Math.sin(6.283185307179586 * (double)var4 / (double)var3) * 90.0);
                    var6 = 212 - (int)(Math.cos(6.283185307179586 * (double)var4 / (double)var3) * 90.0);
                    stackOut_102_0 = ml.a(MatchConditionEntry.a(var6, (byte) 94), db.a(param0, var5), 20, false);
                    stackIn_123_0 = stackOut_102_0 ? 1 : 0;
                    stackIn_103_0 = stackOut_102_0;
                    if (var7 != 0) {
                      decompiledFrameCompleted1 = false;
                      break;
                    }
                    if (stackIn_103_0) {
                      vu.field_O = ts.field_j;
                      ts.field_j = ts.field_j.field_a[var4];
                      wj.field_q = 248;
                      KingBlackDragonEvent.field_A = 248;
                      this.a((byte) 92, -1, ts.field_j);
                      ub.$cfr$intArgs$a$6d836999ad61(79, MoveAttackRequest.field_v[42]);
                      ab.field_a = ev.field_d;
                      ev.field_d = -1;
                      return;
                    }
                    var4++;
                  }
                  if (decompiledFrameCompleted1) {
                    decompiledFrameRemainder0 = (var7 != 0);
                  }
                }
                if ((decompiledFrameRemainder0) &&
                  (decompiledFrameCompleted1) &&
                  (ts.field_j.field_i != null)) {
                  var3Lifetime2 = ts.field_j.field_i.length;
                  var4Lifetime3 = 0;
                  while (var4Lifetime3 < var3Lifetime2) {
                    var5Lifetime1 = (int)(Math.sin(6.283185307179586 * (double)var4Lifetime3 / (double)var3Lifetime2) * 90.0) + 165;
                    var6Lifetime1 = 212 - (int)(90.0 * Math.cos(6.283185307179586 * (double)var4Lifetime3 / (double)var3Lifetime2));
                    stackOut_115_0 = ml.a(MatchConditionEntry.a(var6Lifetime1, (byte) 94), db.a(true, var5Lifetime1), 20, false);
                    stackIn_123_0Lifetime2 = stackOut_115_0 ? 1 : 0;
                    stackIn_116_0 = stackOut_115_0;
                    if (var7 != 0) {
                      decompiledFrameCompleted0 = false;
                      break;
                    }
                    if (!stackIn_116_0) {
                      var4Lifetime3++;
                      continue;
                    }
                    ab.field_a = ev.field_d;
                    ev.field_d = ts.field_j.field_i[var4Lifetime3];
                    wj.field_q = 248;
                    TelepopEvent.field_D = true;
                    this.a((byte) 90, ev.field_d, (rg) null);
                    ub.$cfr$intArgs$a$6d836999ad61(113, MoveAttackRequest.field_v[45]);
                    ub.$cfr$intArgs$a$6d836999ad61(124, im.field_v[12]);
                    return;
                  }
                }
                if ((decompiledFrameCompleted1) &&
                  (decompiledFrameCompleted0)) {
                  stackIn_123_0Lifetime1 = this.a(ts.field_j, (byte) 83);
                }
                if (var7 == 0) {
                  break;
                }
              }
              if (tg.field_k != 1) {
                break;
              }
              var3Lifetime1 = 0;
              if (hh.field_c > 312) {
                var3Lifetime1 = (hh.field_c - 312) * ou.field_c / 291;
              }
              if (wg.a(-33, db.a(param0, 34), db.a(param0, 292), MatchConditionEntry.a(64, (byte) 94), MatchConditionEntry.a(380, (byte) 94))) {
                discarded$0 = this.a(bm.field_D, true, var3Lifetime1, 0, 0, 97);
              }
              if (fa.field_j != 2 &&
                wg.a(-33, db.a(true, 279), db.a(true, 293), MatchConditionEntry.a(68 + ou.field_c, (byte) 94), MatchConditionEntry.a(60 - (-ou.field_c - 24), (byte) 94))) {
                fa.field_j = 2;
                qg.field_u = -ou.field_c + (-68 + ko.field_b);
              }
              if (wg.a(-33, db.a(true, 469), db.a(param0, 606), MatchConditionEntry.a(384, (byte) 94), MatchConditionEntry.a(416, (byte) 94))) {
                var4Lifetime1 = 4;
                while (var4Lifetime1 >= 0) {
                  if (~pg.field_d.field_d[var4Lifetime1] == ~ev.field_d) {
                    pg.field_d.field_d[var4Lifetime1] = -1;
                    AttackEvent.b(false);
                    return;
                  }
                  var4Lifetime1--;
                  if (var7 == 0) {
                    continue;
                  }
                  break;
                }
                return;
              }
              if (!wg.a(-33, db.a(param0, 469), db.a(param0, 606), MatchConditionEntry.a(334, (byte) 94), MatchConditionEntry.a(366, (byte) 94))) {
                break;
              }
              var4Lifetime2 = 0;
              while (var4Lifetime2 < 5) {
                if (pg.field_d.field_d[var4Lifetime2] == -1) {
                  pg.field_d.field_d[var4Lifetime2] = ev.field_d;
                  AttackEvent.b(false);
                  return;
                }
                var4Lifetime2++;
                if (var7 == 0) {
                  continue;
                }
                break;
              }
              return;
            }
          }
          if (1 != fa.field_j &&
            wg.a(-33, db.a(true, 589), db.a(param0, 603), MatchConditionEntry.a(ep.field_o + 158, (byte) 94), MatchConditionEntry.a(150 - (-ep.field_o - 24), (byte) 94))) {
            qg.field_u = ko.field_b - (158 + ep.field_o);
            fa.field_j = 1;
          }
          if (!param0) {
            this.c(94);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ig.a((Throwable) ((Object) var2), "ci.IB(" + param0 + ')');
        }
    }

    private final void l(int param0) {
        RgbSprite stackIn_23_0 = null;
        int stackIn_23_1 = 0;
        int stackIn_23_2 = 0;
        int stackIn_24_3 = 0;
        int stackIn_26_0 = 0;
        int stackIn_26_1 = 0;
        int stackIn_32_0;
        boolean stackIn_32_1;
        int[] stackIn_32_2;
        int[] stackIn_32_3;
        String stackIn_32_4;
        boolean stackIn_33_5 = false;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        var4 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          boolean decompiledFrameCompleted0 = true;
          na.field_F = -1;
          if (null == ud.field_X) {
            ud.field_X = new RgbSprite[pc.field_k.length];
            var2_int = 0;
            while (!(pc.field_k.length <= var2_int)) {
              ud.field_X[var2_int] = DeathEvent.a(ah.field_a.field_b, pc.field_k[var2_int], mv.field_d, GrowthEvent.b(param0, -6583));
              var2_int++;
              if (var4 != 0) {
                decompiledFrameCompleted0 = false;
                break;
              }
            }
          }
          if (decompiledFrameCompleted0) {
            fe.b(db.a(true, 30), MatchConditionEntry.a(50, (byte) 94), 580, 90, EffectPresentation.field_j, jh.field_k, 0, 256);
            SoftwareRaster.f(db.a(true, 34), MatchConditionEntry.a(54, (byte) 94), db.a(true, 606), MatchConditionEntry.a(136, (byte) 94));
          }
          var2_int = 0;
          boolean decompiledNaturalLoopExit0 = false;
          while (!(decompiledNaturalLoopExit0 = (!(pc.field_k.length > var2_int)))) {
            stackIn_26_0 = var2_int;
            stackIn_26_1 = ah.field_b;
            if (var4 == 0) {
              if (stackIn_26_0 == stackIn_26_1) {
                TeamRoster.field_e.f(db.a(true, 26 + 57 * var2_int), MatchConditionEntry.a(60, (byte) 94), 256);
              }
              if (pg.field_d.a(0) <= var2_int) {
                TeamRoster.field_e.f(db.a(true, var2_int * 57 + 26), MatchConditionEntry.a(60, (byte) 94), 64);
              }
              stackIn_23_0 = ud.field_X[var2_int];
              stackIn_23_1 = db.a(true, 34 + var2_int * 57);
              stackIn_23_2 = MatchConditionEntry.a(64, (byte) 94);
              if (var2_int >= pg.field_d.a(0)) {
                stackIn_24_3 = 0;
              } else {
                stackIn_24_3 = 256;
              }
              ((RgbSprite) (Object) stackIn_23_0).g(stackIn_23_1, stackIn_23_2, stackIn_24_3);
              var2_int++;
              continue;
            }
            break;
          }
          if (decompiledNaturalLoopExit0) {
            SoftwareRaster.a();
            fe.b(db.a(true, 30), MatchConditionEntry.a(150, (byte) 94), 270, 270, EffectPresentation.field_j, jh.field_k, 0, 256);
            SoftwareRaster.f(db.a(true, 34), MatchConditionEntry.a(154, (byte) 94), db.a(true, 296), MatchConditionEntry.a(416, (byte) 94));
            stackIn_26_0 = pg.field_d.a(0);
            stackIn_26_1 = ah.field_b;
          }
          if (stackIn_26_0 <= stackIn_26_1) {
            a.field_m[0].d(db.a(true, 10), MatchConditionEntry.a(130, (byte) 94), 310, 310, 256);
          }
          stackIn_32_0 = MatchConditionEntry.a(165, (byte) 94);
          stackIn_32_1 = true;
          stackIn_32_2 = pc.field_k[ah.field_b];
          stackIn_32_3 = ah.field_a.field_b;
          stackIn_32_4 = mv.field_d;
          stackIn_33_5 = !(pg.field_d.a(0) > ah.field_b);
          uh.a(stackIn_32_0, stackIn_32_1, stackIn_32_2, stackIn_32_3, stackIn_32_4, stackIn_33_5, db.a(true, 50));
          SoftwareRaster.a();
          fe.b(db.a(true, 310), MatchConditionEntry.a(150, (byte) 94), 300, 170, EffectPresentation.field_j, jh.field_k, 0, 128);
          fe.b(db.a(true, 310), MatchConditionEntry.a(330, (byte) 94), 145, 90, EffectPresentation.field_j, nd.field_b, 0, 128);
          fe.b(db.a(true, 320), MatchConditionEntry.a(370, (byte) 94), 125, 42, EffectPresentation.field_j, jh.field_k, 0, 0);
          fe.c(ov.field_f, db.a(true, 382), MatchConditionEntry.a(366, (byte) 94), nd.field_b, true);
          fe.c(dd.a(pg.field_d.a((byte) 45), param0 ^ -23666), db.a(true, 382), MatchConditionEntry.a(406, (byte) 94), nd.field_b, true);
          if (hi.field_j >= 2) {
            rs.field_n.c(pg.field_d.a((byte) 127) + "", db.a(true, 382), MatchConditionEntry.a(369, (byte) 94), 16777215, 0);
          }
          fe.b(db.a(true, 465), MatchConditionEntry.a(330, (byte) 94), 145, 40, EffectPresentation.field_j, jh.field_k, 0, 128);
          fe.b(db.a(true, 465), MatchConditionEntry.a(380, (byte) 94), 145, 40, EffectPresentation.field_j, jh.field_k, 0, 128);
          var2_int = 0;
          var3 = 0;
          do {
            if (!(var3 <= ah.field_b)) {
              var3 = -pg.field_d.field_j - pg.field_d.field_c + var2_int;
              fe.c(fo.a(4800, hf.field_e, new String[]{Integer.toString(1 + ah.field_b)}), db.a(true, 460), MatchConditionEntry.a(190, (byte) 94), nd.field_b, true);
              break;
            }
            var2_int = var2_int + NodeDeque.field_c[var3];
            var3++;
          } while (var4 == 0);
          boolean decompiledSharedTail1 = !(pg.field_d.a(0) <= ah.field_b);
          if (!decompiledSharedTail1) {
            rs.field_n.a(fo.a(4800, SummonRequest.field_w, new String[]{this.c(param0 ^ 23558, var2_int), this.c(-38, var3)}), db.a(true, 320), MatchConditionEntry.a(200, (byte) 94), 280, 170, 16777215, 0, 1, 0, 0);
            decompiledSharedTail1 = (var4 != 0);
          }
          if (decompiledSharedTail1) {
            rs.field_n.a(fo.a(4800, gt.field_g, new String[]{this.c(-38, var2_int)}), db.a(true, 320), MatchConditionEntry.a(200, (byte) 94), 280, 170, 16777215, 0, 1, 0, 0);
          }
          if (pg.field_d.a(param0 ^ param0) < NodeDeque.field_c.length) {
            fe.c(this.c(-38, NodeDeque.field_c[ah.field_b]), db.a(true, 537), MatchConditionEntry.a(366, (byte) 94), nd.field_b, true);
            if (pg.field_d.a(0) == ah.field_b &&
              pg.field_d.a((byte) 123) >= NodeDeque.field_c[pg.field_d.a(0)]) {
              boolean decompiledSharedTail0 = !(wg.a(-33, db.a(true, 469), db.a(true, 606), MatchConditionEntry.a(384, (byte) 94), MatchConditionEntry.a(416, (byte) 94)));
              if (!decompiledSharedTail0) {
                fe.a(db.a(true, 469), MatchConditionEntry.a(384, (byte) 94), 137, 32, DisplacedUnitMarker.field_s, field_e, 0, 0);
                na.field_F = 52;
                decompiledSharedTail0 = (var4 != 0);
              }
              if (decompiledSharedTail0) {
                fe.a(db.a(true, 469), MatchConditionEntry.a(384, (byte) 94), 137, 32, DisplacedUnitMarker.field_s, nd.field_b, 0, 0);
              }
              fe.c(wv.field_e, db.a(true, 537), MatchConditionEntry.a(416, (byte) 94), 0, true);
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ig.a((Throwable) ((Object) var2), "ci.O(" + param0 + ')');
        }
    }

    private final void f(int param0) {
        RuntimeException var2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 >= -117) {
            return;
          }
          if (null != MoveEvent.field_G) {
            MoveEvent.field_G.d((byte) -102);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ig.a((Throwable) ((Object) var2), "ci.F(" + param0 + ')');
        }
    }

    private final void b(boolean param0) {
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        var4 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          var2_int = 0;
          if (eo.field_a == null) {
            return;
          }
          boolean decompiledSharedTail0 = !(158 >= eo.field_a.field_v);
          if (!decompiledSharedTail0) {
            SoftwareRaster.f(db.a(param0, 589), MatchConditionEntry.a(157, (byte) 94), 14, 156, 1250067);
            mp.field_Jb.g(db.a(param0, 590), MatchConditionEntry.a(158, (byte) 94), 128);
            decompiledSharedTail0 = (var4 != 0);
          }
          if (decompiledSharedTail0) {
            var2_int = ep.field_o * (-155 + eo.field_a.field_v) / 137;
            SoftwareRaster.f(db.a(true, 589), MatchConditionEntry.a(157, (byte) 94), 14, 156, 2302755);
            mp.field_Jb.g(db.a(true, 590), MatchConditionEntry.a(158 + ep.field_o, (byte) 94));
          }
          if (!param0) {
            field_b = (String) null;
          }
          if (eo.field_a != null) {
            SoftwareRaster.f(db.a(true, 314), MatchConditionEntry.a(158, (byte) 94), db.a(param0, 606), MatchConditionEntry.a(311, (byte) 94));
            eo.field_a.g(db.a(true, 326), MatchConditionEntry.a(-var2_int + 154, (byte) 94));
          }
          if (1 == fa.field_j) {
            if (ro.field_ub == 1) {
              var3 = -158 - qg.field_u + ko.field_b;
              if (0 > var3) {
                ep.field_o = 0;
                if (var4 != 0) {
                  if (var3 > 137) {
                    ep.field_o = 137;
                    ep.field_o = var3;
                  } else {
                    ep.field_o = var3;
                  }
                }
              } else {
                if (var3 > 137) {
                  ep.field_o = 137;
                  if (var4 != 0) {
                    ep.field_o = var3;
                  }
                } else {
                  ep.field_o = var3;
                }
              }
              if (var4 != 0) {
                fa.field_j = -1;
              }
            } else {
              fa.field_j = -1;
            }
          }
          SoftwareRaster.a();
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ig.a((Throwable) ((Object) var2), "ci.AA(" + param0 + ')');
        }
    }

    private final int a(byte param0, int param1, int param2) {
        int stackIn_8_0 = 0;
        int stackIn_19_0 = 0;
        int stackIn_34_0 = 0;
        int stackIn_42_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        String var11_ref_String = null;
        int var11 = 0;
        int var12 = 0;
        String var13 = null;
        int var14 = 0;
        var14 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          if (param1 != 0 &&
            param1 != 1) {
            stackIn_8_0 = -1;
            return stackIn_8_0;
          }
          var4_int = MoveEvent.field_D.b(this.tutorialStage, 29);
          var5 = MoveEvent.field_D.a((byte) 119, this.tutorialStage);
          var6 = -var4_int + var5;
          var7 = MoveEvent.field_y[this.tutorialStage].length;
          if (0 != var7 &&
            param2 >= 0 &&
            param2 < var7) {
            if (param0 >= -48) {
              field_f = (String[]) null;
            }
            var8 = 0;
            var9 = 0;
            do {
              if (var9 >= var7) {
                var9 = (-var8 + var6) / var7;
                break;
              }
              var10 = MoveEvent.field_y[this.tutorialStage][var9];
              var11_ref_String = DisplacedUnitMarker.field_t[var10];
              var8 = var8 + (nr.field_e.a(var11_ref_String) >> 1);
              var9++;
            } while (var14 == 0);
            if (0 != param1) {
              stackIn_34_0 = param2 + 1;
            } else {
              stackIn_34_0 = param2;
            }
            var10 = stackIn_34_0;
            var8 = 0;
            var11 = 0;
            do {
              if (var10 <= var11) {
                var11 = var8 + var9 * var10;
                break;
              }
              var12 = MoveEvent.field_y[this.tutorialStage][var11];
              var13 = DisplacedUnitMarker.field_t[var12];
              var8 = var8 + (nr.field_e.a(var13) >> 1);
              var11++;
            } while (var14 == 0);
            stackIn_42_0 = var4_int + var11;
            return stackIn_42_0;
          }
          stackIn_19_0 = -1;
          return stackIn_19_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw ig.a((Throwable) ((Object) var4), "ci.I(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    private final void e(int param0) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        RuntimeException decompiledCaughtException = null;
        var6 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          if (MoveEvent.field_G == null) {
            return;
          }
          if (MoveEvent.field_y != null &&
            this.tutorialStage < MoveEvent.field_y.length) {
            if (MoveEvent.field_y[this.tutorialStage] != null &&
              MoveEvent.field_y[this.tutorialStage].length >= this.field_d.field_k) {
              var2_int = 0;
              var4 = 103 / ((60 - param0) / 59);
              var3 = 0;
              var5 = 0;
              while (this.field_d.field_k > var5) {
                if (var6 != 0) {
                  return;
                }
                if (MoveEvent.field_y[this.tutorialStage][var5] != 22) {
                  if (23 == MoveEvent.field_y[this.tutorialStage][var5]) {
                    var3 = this.a((byte) 45, var5) ? 1 : 0;
                  }
                } else {
                  var2_int = this.a((byte) 107, var5) ? 1 : 0;
                }
                var5++;
              }
              MoveEvent.field_G.a(this.f(true), var2_int != 0, 100, this.field_d.field_h, var3 != 0, ij.field_y);
              return;
            }
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ig.a((Throwable) ((Object) var2), "ci.A(" + param0 + ')');
        }
    }

    private final void a(byte param0) {
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int[] var3 = null;
        int var4 = 0;
        int[] var5 = null;
        int var6 = 0;
        Object var7 = null;
        String[] var8 = null;
        int[] var9 = null;
        int var10 = 0;
        int var11 = 0;
        String var12 = null;
        int var13 = 0;
        int var4Lifetime1;
        var13 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          var2_int = og.field_m;
          if (!(og.field_m >= 0) ||
            !(og.field_m < jr.field_h.length)) {
            var2_int = 0;
          }
          var3 = jr.field_h[var2_int];
          if (DamageEvent.g(126)) {
            this.b(320);
            return;
          }
          if (null == wp.field_z) {
            wp.field_z = km.a(0, 120, 10, 7);
          }
          boolean decompiledFrameRemainder0 = true;
          var4 = 89;
          var5 = field_e;
          fe.c(sl.field_i, db.a(true, var3[0]), MatchConditionEntry.a(var4, (byte) 94), field_e, true);
          fe.c(ou.field_f, db.a(true, var3[1]), MatchConditionEntry.a(var4, (byte) 94), field_e, true);
          fe.c(ts.field_g, db.a(true, var3[2]), MatchConditionEntry.a(var4, (byte) 94), field_e, true);
          fe.c(vi.field_c, db.a(true, var3[3]), MatchConditionEntry.a(var4, (byte) 94), field_e, true);
          fe.c(hq.field_c, db.a(true, var3[4]), MatchConditionEntry.a(var4, (byte) 94), field_e, true);
          var4 = var4 + (8 + rs.field_n.field_H);
          var6 = -100 / ((15 - param0) / 42);
          if (!wp.field_z.field_l) {
            var7 = fm.field_c;
            decompiledFrameRemainder0 = (var13 != 0);
          }
          if (decompiledFrameRemainder0) {
            if (wp.field_z.field_t != null) {
              var7 = wd.field_l;
              var8 = wp.field_z.field_t[nf.field_Mb];
              var9 = wp.field_z.field_n[nf.field_Mb];
              var10 = 0;
              var11 = 0;
              scanLoop1: while (true) {
                if (10 > var11) {
                  if (var13 == 0) {
                    if (null != var8[var11]) {
                      var5 = field_e;
                      var12 = var8[var11];
                      if (gt.a(var12, (byte) 94)) {
                        var5 = nd.field_b;
                        var10 = 1;
                      }
                      var7 = null;
                      this.a(var5, var9[4 * var11 + 1], var11, var4, var9[4 * var11], var9[var11 * 4 + 3], 310, var9[4 * var11 + 2], var12);
                    }
                    var4 += 25;
                    var11++;
                    continue;
                  }
                } else {
                  if (var10 != 0) {
                    break scanLoop1;
                  }
                  var5 = nd.field_b;
                }
                this.a(var5, wp.field_z.field_k, -1, var4, wp.field_z.field_s, wp.field_z.field_m, 310, wp.field_z.field_r, mv.field_d);
                break;
              }
              if (var13 != 0) {
                var7 = ae.field_s;
              }
            } else {
              var7 = ae.field_s;
            }
          }
          var4Lifetime1 = 275 + (rs.field_n.field_H + 110);
          if (var7 != null) {
            fe.c((String) (var7), SoftwareRaster.field_l / 2, SoftwareRaster.field_g / 2, field_e, true);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ig.a((Throwable) ((Object) var2), "ci.J(" + param0 + ')');
        }
    }

    private final int a(rg param0, boolean param1, int param2, int param3, int param4, int param5) {
        int stackIn_25_0 = 0;
        int stackIn_25_1 = 0;
        int stackIn_42_0 = 0;
        int stackIn_46_0 = 0;
        RuntimeException stackIn_50_0 = null;
        StringBuilder stackIn_50_1 = null;
        String stackIn_51_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var7_int = 0;
        RuntimeException var7 = null;
        int var8 = 0;
        int var9 = 0;
        int stackIn_25_0Lifetime1;
        int stackIn_25_1Lifetime1;
        int var7_intLifetime1;
        var9 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          if (param5 <= 34) {
            field_f = (String[]) null;
          }
          boolean decompiledFrameCompleted3 = true;
          boolean decompiledFrameCompleted0 = true;
          boolean decompiledFrameCompleted2 = true;
          boolean decompiledFrameCompleted1 = true;
          if (null != param0.field_a) {
            var7_int = 0;
            while (!(param0.field_a.length <= var7_int)) {
              stackIn_25_0 = 0;
              stackIn_25_1 = ~param4;
              if (var9 == 0) {
                if (stackIn_25_0 <= stackIn_25_1) {
                  break;
                }
                if (param1) {
                  if (0 != (param4 & 3)) {
                    param4 = param4 + (-(3 & param4) + 4);
                  }
                  param3 += 40;
                }
                param4 = this.a(param0.field_a[var7_int], false, param2, param3, param4, 53);
                var7_int++;
                continue;
              }
              if (stackIn_25_0 > stackIn_25_1) {
                stackIn_46_0 = ~pg.field_d.field_a[param0.field_i[var7_int]];
                decompiledFrameCompleted3 = false;
                break;
              }
              decompiledFrameCompleted2 = false;
              break;
            }
          }
          if ((decompiledFrameCompleted3) &&
            (decompiledFrameCompleted2) &&
            (null != param0.field_i)) {
            var7_intLifetime1 = 0;
            while (true) {
              stackIn_25_0Lifetime1 = ~var7_intLifetime1;
              stackIn_25_1Lifetime1 = ~param0.field_i.length;
              if (stackIn_25_0Lifetime1 <= stackIn_25_1Lifetime1) {
                decompiledFrameCompleted1 = false;
                break;
              }
              stackIn_46_0 = ~pg.field_d.field_a[param0.field_i[var7_intLifetime1]];
              if (var9 != 0) {
                decompiledFrameCompleted0 = false;
                break;
              }
              if (stackIn_46_0 < -1) {
                var8 = 7 + param3 + ((param4 >> 2) * 70 - param2);
                if (var8 > -40 &&
                  var8 < 324 &&
                  ml.a(MatchConditionEntry.a(var8 + 60 + 23, (byte) 94), db.a(true, (param4 & 3) * 58 + 70), 22, false)) {
                  break;
                }
                param4++;
              }
              var7_intLifetime1++;
            }
            if ((decompiledFrameCompleted1) &&
              (decompiledFrameCompleted0)) {
              ab.field_a = ev.field_d;
              ev.field_d = param0.field_i[var7_intLifetime1];
              TelepopEvent.field_D = true;
              ts.field_j = param0;
              this.a((byte) 62, ev.field_d, (rg) null);
              ub.$cfr$intArgs$a$6d836999ad61(59, MoveAttackRequest.field_v[45]);
              ub.$cfr$intArgs$a$6d836999ad61(38, im.field_v[12]);
              stackIn_42_0 = -1;
              return stackIn_42_0;
            }
          }
          if ((decompiledFrameCompleted3) &&
            (decompiledFrameCompleted0)) {
            stackIn_46_0 = param4;
          }
          return stackIn_46_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_50_0 = var7;
          stackIn_50_1 = new StringBuilder().append("ci.FA(");
          if (param0 == null) {
            stackIn_51_2 = "null";
          } else {
            stackIn_51_2 = "{...}";
          }
          throw ig.a((Throwable) ((Object) stackIn_50_0), ((StringBuilder) (Object) stackIn_50_1).append(stackIn_51_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(')').toString());
        }
    }

    private final void a(boolean param0, int param1, int param2) {
        int fieldTemp$0 = 0;
        int fieldTemp$1 = 0;
        boolean stackIn_421_0 = false;
        boolean stackIn_431_0 = false;
        int stackIn_693_0 = 0;
        int stackIn_694_1 = 0;
        int stackIn_740_0 = 0;
        int stackIn_741_1 = 0;
        boolean stackIn_757_0 = false;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var6Lifetime1;
        int var7Lifetime1;
        int var8Lifetime1;
        int var6Lifetime2;
        int var7Lifetime2;
        var9 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          var4_int = MoveEvent.field_y[this.tutorialStage][param2];
          if (this.field_d.d((byte) 124)) {
            ub.$cfr$intArgs$a$6d836999ad61(64, im.field_v[2]);
          }
          if (param1 != 0) {
            this.b(false);
          }
          regionExit1: {
            regionExit2: {
              regionExit3: {
                regionExit4: {
                  regionExit5: {
                    regionExit6: {
                      regionExit7: {
                        regionExit8: {
                          regionExit9: {
                            regionExit10: {
                              regionExit11: {
                                regionExit12: {
                                  regionExit13: {
                                    regionExit14: {
                                      regionExit15: {
                                        regionExit16: {
                                          regionExit17: {
                                            regionExit18: {
                                              regionExit19: {
                                                regionExit20: {
                                                  regionExit21: {
                                                    regionExit22: {
                                                      regionExit23: {
                                                        regionExit24: {
                                                          regionExit25: {
                                                            regionExit26: {
                                                              regionExit27: {
                                                                regionExit28: {
                                                                  regionExit29: {
                                                                    regionExit30: {
                                                                      regionExit31: {
                                                                        regionExit32: {
                                                                          regionExit33: {
                                                                            regionExit34: {
                                                                              regionExit35: {
                                                                                regionExit36: {
                                                                                  regionExit37: {
                                                                                    regionExit38: {
                                                                                      regionExit39: {
                                                                                        regionExit40: {
                                                                                          {
                                                                                            boolean decompiledFrameRemainder12 = true;
                                                                                            {
                                                                                              boolean decompiledFrameRemainder11 = true;
                                                                                              {
                                                                                                boolean decompiledFrameRemainder10 = true;
                                                                                                {
                                                                                                  boolean decompiledFrameRemainder9 = true;
                                                                                                  {
                                                                                                    boolean decompiledFrameRemainder8 = true;
                                                                                                    {
                                                                                                      boolean decompiledFrameRemainder7 = true;
                                                                                                      {
                                                                                                        boolean decompiledFrameRemainder6 = true;
                                                                                                        {
                                                                                                          boolean decompiledFrameRemainder5 = true;
                                                                                                          {
                                                                                                            boolean decompiledFrameRemainder4 = true;
                                                                                                            {
                                                                                                              boolean decompiledFrameRemainder3 = true;
                                                                                                              {
                                                                                                                boolean decompiledFrameRemainder2 = true;
                                                                                                                {
                                                                                                                  boolean decompiledFrameRemainder1 = true;
                                                                                                                  {
                                                                                                                    boolean decompiledFrameRemainder0 = true;
                                                                                                                    var6 = var4_int;
                                                                                                                    if (0 != var6) {
                                                                                                                      if (var6 != 47 ||
                                                                                                                        var9 != 0) {
                                                                                                                        decompiledFrameRemainder0 = (var6 != 1);
                                                                                                                        if (decompiledFrameRemainder0) {
                                                                                                                          decompiledFrameRemainder1 = !(43 == var6 &&
                                                                                                                            var9 == 0);
                                                                                                                          if (decompiledFrameRemainder1) {
                                                                                                                            decompiledFrameRemainder2 = !(var6 == 2 &&
                                                                                                                              var9 == 0);
                                                                                                                            if (decompiledFrameRemainder2) {
                                                                                                                              decompiledFrameRemainder3 = (var6 != 7);
                                                                                                                              if (decompiledFrameRemainder3) {
                                                                                                                                decompiledFrameRemainder4 = !(var6 == 21 &&
                                                                                                                                  var9 == 0);
                                                                                                                                if (decompiledFrameRemainder4) {
                                                                                                                                  decompiledFrameRemainder5 = (19 != var6);
                                                                                                                                  if (decompiledFrameRemainder5) {
                                                                                                                                    decompiledFrameRemainder6 = !(var6 == 52 &&
                                                                                                                                      var9 == 0);
                                                                                                                                    if (decompiledFrameRemainder6) {
                                                                                                                                      decompiledFrameRemainder7 = !(var6 == 51 &&
                                                                                                                                        var9 == 0);
                                                                                                                                      if (decompiledFrameRemainder7) {
                                                                                                                                        decompiledFrameRemainder8 = (45 != var6);
                                                                                                                                        if (decompiledFrameRemainder8) {
                                                                                                                                          decompiledFrameRemainder9 = (var6 != 42);
                                                                                                                                          if (decompiledFrameRemainder9) {
                                                                                                                                            decompiledFrameRemainder10 = (var6 != 5);
                                                                                                                                            if (decompiledFrameRemainder10) {
                                                                                                                                              decompiledFrameRemainder11 = (var6 != 24);
                                                                                                                                              if (decompiledFrameRemainder11) {
                                                                                                                                                decompiledFrameRemainder12 = (var6 != 40);
                                                                                                                                                if (decompiledFrameRemainder12) {
                                                                                                                                                  if (30 == var6) {
                                                                                                                                                    break regionExit40;
                                                                                                                                                  }
                                                                                                                                                  if (var6 == 41 &&
                                                                                                                                                    var9 == 0) {
                                                                                                                                                    break regionExit39;
                                                                                                                                                  }
                                                                                                                                                  if (34 == var6 &&
                                                                                                                                                    var9 == 0) {
                                                                                                                                                    break regionExit38;
                                                                                                                                                  }
                                                                                                                                                  if (var6 == 8) {
                                                                                                                                                    break regionExit37;
                                                                                                                                                  }
                                                                                                                                                  if (var6 == 4) {
                                                                                                                                                    break regionExit36;
                                                                                                                                                  }
                                                                                                                                                  if (var6 == 35) {
                                                                                                                                                    break regionExit35;
                                                                                                                                                  }
                                                                                                                                                  if (var6 == 36 &&
                                                                                                                                                    var9 == 0) {
                                                                                                                                                    break regionExit34;
                                                                                                                                                  }
                                                                                                                                                  if (var6 == 37 &&
                                                                                                                                                    var9 == 0) {
                                                                                                                                                    break regionExit33;
                                                                                                                                                  }
                                                                                                                                                  if (var6 == 38) {
                                                                                                                                                    break regionExit32;
                                                                                                                                                  }
                                                                                                                                                  if (var6 == 39) {
                                                                                                                                                    break regionExit31;
                                                                                                                                                  }
                                                                                                                                                  if (var6 == 17 &&
                                                                                                                                                    var9 == 0) {
                                                                                                                                                    break regionExit30;
                                                                                                                                                  }
                                                                                                                                                  if (var6 == 18) {
                                                                                                                                                    break regionExit29;
                                                                                                                                                  }
                                                                                                                                                  if (var6 == 6) {
                                                                                                                                                    break regionExit28;
                                                                                                                                                  }
                                                                                                                                                  if (var6 == 9) {
                                                                                                                                                    break regionExit27;
                                                                                                                                                  }
                                                                                                                                                  if (10 == var6 &&
                                                                                                                                                    var9 == 0) {
                                                                                                                                                    break regionExit26;
                                                                                                                                                  }
                                                                                                                                                  if (var6 == 11) {
                                                                                                                                                    break regionExit25;
                                                                                                                                                  }
                                                                                                                                                  if (var6 == 12 &&
                                                                                                                                                    var9 == 0) {
                                                                                                                                                    break regionExit24;
                                                                                                                                                  }
                                                                                                                                                  if (var6 == 13 &&
                                                                                                                                                    var9 == 0) {
                                                                                                                                                    break regionExit23;
                                                                                                                                                  }
                                                                                                                                                  if (var6 == 50 &&
                                                                                                                                                    var9 == 0) {
                                                                                                                                                    break regionExit22;
                                                                                                                                                  }
                                                                                                                                                  if (var6 == 14 &&
                                                                                                                                                    var9 == 0) {
                                                                                                                                                    break regionExit21;
                                                                                                                                                  }
                                                                                                                                                  if (var6 == 15 &&
                                                                                                                                                    var9 == 0) {
                                                                                                                                                    break regionExit20;
                                                                                                                                                  }
                                                                                                                                                  if (var6 == 20) {
                                                                                                                                                    break regionExit19;
                                                                                                                                                  }
                                                                                                                                                  if (22 == var6 &&
                                                                                                                                                    var9 == 0) {
                                                                                                                                                    break regionExit18;
                                                                                                                                                  }
                                                                                                                                                  if (var6 == 23 &&
                                                                                                                                                    var9 == 0) {
                                                                                                                                                    break regionExit17;
                                                                                                                                                  }
                                                                                                                                                  if (48 == var6) {
                                                                                                                                                    break regionExit16;
                                                                                                                                                  }
                                                                                                                                                  if (var6 == 3) {
                                                                                                                                                    break regionExit15;
                                                                                                                                                  }
                                                                                                                                                  if (var6 == 53 &&
                                                                                                                                                    var9 == 0) {
                                                                                                                                                    break regionExit14;
                                                                                                                                                  }
                                                                                                                                                  if (var6 == 54) {
                                                                                                                                                    break regionExit13;
                                                                                                                                                  }
                                                                                                                                                  if (var6 == 16) {
                                                                                                                                                    break regionExit12;
                                                                                                                                                  }
                                                                                                                                                  if (25 == var6 &&
                                                                                                                                                    var9 == 0) {
                                                                                                                                                    break regionExit11;
                                                                                                                                                  }
                                                                                                                                                  if (26 == var6) {
                                                                                                                                                    break regionExit10;
                                                                                                                                                  }
                                                                                                                                                  if (27 == var6) {
                                                                                                                                                    break regionExit9;
                                                                                                                                                  }
                                                                                                                                                  if (var6 == 28 &&
                                                                                                                                                    var9 == 0) {
                                                                                                                                                    break regionExit8;
                                                                                                                                                  }
                                                                                                                                                  if (var6 == 46 &&
                                                                                                                                                    var9 == 0) {
                                                                                                                                                    break regionExit7;
                                                                                                                                                  }
                                                                                                                                                  if (var6 == 33 &&
                                                                                                                                                    var9 == 0) {
                                                                                                                                                    break regionExit6;
                                                                                                                                                  }
                                                                                                                                                  if (var6 == 29) {
                                                                                                                                                    break regionExit5;
                                                                                                                                                  }
                                                                                                                                                  if (31 == var6) {
                                                                                                                                                    break regionExit4;
                                                                                                                                                  }
                                                                                                                                                  if (var6 == 32) {
                                                                                                                                                    break regionExit3;
                                                                                                                                                  }
                                                                                                                                                  if (var6 == 44 &&
                                                                                                                                                    var9 == 0) {
                                                                                                                                                    break regionExit2;
                                                                                                                                                  }
                                                                                                                                                  if (var6 == 49) {
                                                                                                                                                    return;
                                                                                                                                                  }
                                                                                                                                                  break regionExit1;
                                                                                                                                                }
                                                                                                                                              }
                                                                                                                                            }
                                                                                                                                          }
                                                                                                                                        }
                                                                                                                                      }
                                                                                                                                    }
                                                                                                                                  }
                                                                                                                                }
                                                                                                                              }
                                                                                                                            }
                                                                                                                          }
                                                                                                                        }
                                                                                                                      }
                                                                                                                    } else {
                                                                                                                      if (!this.field_d.d((byte) 103)) {
                                                                                                                        return;
                                                                                                                      }
                                                                                                                      IntrusiveNode.field_h = false;
                                                                                                                      var6 = param0 ? 1 : 0;
                                                                                                                      CipherPacketBuffer.a(var6 != 0, 5, 1, 0);
                                                                                                                      if (var9 == 0) {
                                                                                                                        return;
                                                                                                                      }
                                                                                                                    }
                                                                                                                    if (decompiledFrameRemainder12) {
                                                                                                                      if (decompiledFrameRemainder11) {
                                                                                                                        if (decompiledFrameRemainder10) {
                                                                                                                          if (decompiledFrameRemainder9) {
                                                                                                                            if (decompiledFrameRemainder8) {
                                                                                                                              if (decompiledFrameRemainder7) {
                                                                                                                                if (decompiledFrameRemainder6) {
                                                                                                                                  if (decompiledFrameRemainder5) {
                                                                                                                                    if (decompiledFrameRemainder4) {
                                                                                                                                      if (decompiledFrameRemainder3) {
                                                                                                                                        if (decompiledFrameRemainder2) {
                                                                                                                                          if (decompiledFrameRemainder1) {
                                                                                                                                            if (decompiledFrameRemainder0) {
                                                                                                                                              if (!this.field_d.d((byte) 49)) {
                                                                                                                                                return;
                                                                                                                                              }
                                                                                                                                              if (DamageEvent.g(123)) {
                                                                                                                                                MoveAttackAction.a(0, bi.field_e, param0, (byte) 90, true);
                                                                                                                                                if (var9 == 0) {
                                                                                                                                                  return;
                                                                                                                                                }
                                                                                                                                              }
                                                                                                                                              MoveEvent.field_C.a(false);
                                                                                                                                              this.field_d.field_h = -1;
                                                                                                                                              var6 = param0 ? 1 : 0;
                                                                                                                                              CipherPacketBuffer.a(var6 != 0, 21, 1, jt.field_a);
                                                                                                                                              if (var9 == 0) {
                                                                                                                                                return;
                                                                                                                                              }
                                                                                                                                            }
                                                                                                                                          }
                                                                                                                                        }
                                                                                                                                      }
                                                                                                                                    }
                                                                                                                                  }
                                                                                                                                }
                                                                                                                              }
                                                                                                                            }
                                                                                                                          }
                                                                                                                        }
                                                                                                                      }
                                                                                                                    }
                                                                                                                  }
                                                                                                                  if (decompiledFrameRemainder12) {
                                                                                                                    if (decompiledFrameRemainder11) {
                                                                                                                      if (decompiledFrameRemainder10) {
                                                                                                                        if (decompiledFrameRemainder9) {
                                                                                                                          if (decompiledFrameRemainder8) {
                                                                                                                            if (decompiledFrameRemainder7) {
                                                                                                                              if (decompiledFrameRemainder6) {
                                                                                                                                if (decompiledFrameRemainder5) {
                                                                                                                                  if (decompiledFrameRemainder4) {
                                                                                                                                    if (decompiledFrameRemainder3) {
                                                                                                                                      if (decompiledFrameRemainder2) {
                                                                                                                                        if (decompiledFrameRemainder1) {
                                                                                                                                          if (!this.field_d.d((byte) 48)) {
                                                                                                                                            return;
                                                                                                                                          }
                                                                                                                                          if (DamageEvent.g(116)) {
                                                                                                                                            MoveAttackAction.a(0, rg.field_l, param0, (byte) 90, true);
                                                                                                                                            if (var9 == 0) {
                                                                                                                                              return;
                                                                                                                                            }
                                                                                                                                          }
                                                                                                                                          var6 = param0 ? 1 : 0;
                                                                                                                                          CipherPacketBuffer.a(var6 != 0, -4, 1, jt.field_a);
                                                                                                                                          if (var9 == 0) {
                                                                                                                                            return;
                                                                                                                                          }
                                                                                                                                        }
                                                                                                                                      }
                                                                                                                                    }
                                                                                                                                  }
                                                                                                                                }
                                                                                                                              }
                                                                                                                            }
                                                                                                                          }
                                                                                                                        }
                                                                                                                      }
                                                                                                                    }
                                                                                                                  }
                                                                                                                }
                                                                                                                if (decompiledFrameRemainder12) {
                                                                                                                  if (decompiledFrameRemainder11) {
                                                                                                                    if (decompiledFrameRemainder10) {
                                                                                                                      if (decompiledFrameRemainder9) {
                                                                                                                        if (decompiledFrameRemainder8) {
                                                                                                                          if (decompiledFrameRemainder7) {
                                                                                                                            if (decompiledFrameRemainder6) {
                                                                                                                              if (decompiledFrameRemainder5) {
                                                                                                                                if (decompiledFrameRemainder4) {
                                                                                                                                  if (decompiledFrameRemainder3) {
                                                                                                                                    if (decompiledFrameRemainder2) {
                                                                                                                                      if (!this.field_d.d((byte) 127)) {
                                                                                                                                        return;
                                                                                                                                      }
                                                                                                                                      if (this.tutorialStage != 2) {
                                                                                                                                        var6 = param0 ? 1 : 0;
                                                                                                                                        CipherPacketBuffer.a(var6 != 0, 2, 1, jt.field_a);
                                                                                                                                        if (var9 == 0) {
                                                                                                                                          return;
                                                                                                                                        }
                                                                                                                                      }
                                                                                                                                      var6 = param0 ? 1 : 0;
                                                                                                                                      CipherPacketBuffer.a(var6 != 0, 17, 1, jt.field_a);
                                                                                                                                      if (var9 == 0) {
                                                                                                                                        return;
                                                                                                                                      }
                                                                                                                                    }
                                                                                                                                  }
                                                                                                                                }
                                                                                                                              }
                                                                                                                            }
                                                                                                                          }
                                                                                                                        }
                                                                                                                      }
                                                                                                                    }
                                                                                                                  }
                                                                                                                }
                                                                                                              }
                                                                                                              if (decompiledFrameRemainder12) {
                                                                                                                if (decompiledFrameRemainder11) {
                                                                                                                  if (decompiledFrameRemainder10) {
                                                                                                                    if (decompiledFrameRemainder9) {
                                                                                                                      if (decompiledFrameRemainder8) {
                                                                                                                        if (decompiledFrameRemainder7) {
                                                                                                                          if (decompiledFrameRemainder6) {
                                                                                                                            if (decompiledFrameRemainder5) {
                                                                                                                              if (decompiledFrameRemainder4) {
                                                                                                                                if (decompiledFrameRemainder3) {
                                                                                                                                  if (!this.field_d.d((byte) 107)) {
                                                                                                                                    return;
                                                                                                                                  }
                                                                                                                                  var6 = param0 ? 1 : 0;
                                                                                                                                  CipherPacketBuffer.a(var6 != 0, -1, 1, 0);
                                                                                                                                  if (var9 == 0) {
                                                                                                                                    return;
                                                                                                                                  }
                                                                                                                                }
                                                                                                                              }
                                                                                                                            }
                                                                                                                          }
                                                                                                                        }
                                                                                                                      }
                                                                                                                    }
                                                                                                                  }
                                                                                                                }
                                                                                                              }
                                                                                                            }
                                                                                                            if (decompiledFrameRemainder12) {
                                                                                                              if (decompiledFrameRemainder11) {
                                                                                                                if (decompiledFrameRemainder10) {
                                                                                                                  if (decompiledFrameRemainder9) {
                                                                                                                    if (decompiledFrameRemainder8) {
                                                                                                                      if (decompiledFrameRemainder7) {
                                                                                                                        if (decompiledFrameRemainder6) {
                                                                                                                          if (decompiledFrameRemainder5) {
                                                                                                                            if (decompiledFrameRemainder4) {
                                                                                                                              if (!this.field_d.d((byte) 55)) {
                                                                                                                                return;
                                                                                                                              }
                                                                                                                              if (jt.field_a == 13) {
                                                                                                                                ah.b((byte) 90);
                                                                                                                              }
                                                                                                                              if (jt.field_a == 12) {
                                                                                                                                b.field_n = null;
                                                                                                                                eo.field_a = null;
                                                                                                                              }
                                                                                                                              hh.a(-16147, 50, mp.field_Ob, true);
                                                                                                                              var6 = param0 ? 1 : 0;
                                                                                                                              CipherPacketBuffer.a(var6 != 0, 0, 1, jt.field_a);
                                                                                                                              if (var9 == 0) {
                                                                                                                                return;
                                                                                                                              }
                                                                                                                            }
                                                                                                                          }
                                                                                                                        }
                                                                                                                      }
                                                                                                                    }
                                                                                                                  }
                                                                                                                }
                                                                                                              }
                                                                                                            }
                                                                                                          }
                                                                                                          if (decompiledFrameRemainder12) {
                                                                                                            if (decompiledFrameRemainder11) {
                                                                                                              if (decompiledFrameRemainder10) {
                                                                                                                if (decompiledFrameRemainder9) {
                                                                                                                  if (decompiledFrameRemainder8) {
                                                                                                                    if (decompiledFrameRemainder7) {
                                                                                                                      if (decompiledFrameRemainder6) {
                                                                                                                        if (decompiledFrameRemainder5) {
                                                                                                                          if (!this.field_d.d((byte) 54)) {
                                                                                                                            return;
                                                                                                                          }
                                                                                                                          var6 = param0 ? 1 : 0;
                                                                                                                          CipherPacketBuffer.a(var6 != 0, 0, param1 + 1, jt.field_a);
                                                                                                                          pv.field_c = true;
                                                                                                                          if (var9 == 0) {
                                                                                                                            return;
                                                                                                                          }
                                                                                                                        }
                                                                                                                      }
                                                                                                                    }
                                                                                                                  }
                                                                                                                }
                                                                                                              }
                                                                                                            }
                                                                                                          }
                                                                                                        }
                                                                                                        if (decompiledFrameRemainder12) {
                                                                                                          if (decompiledFrameRemainder11) {
                                                                                                            if (decompiledFrameRemainder10) {
                                                                                                              if (decompiledFrameRemainder9) {
                                                                                                                if (decompiledFrameRemainder8) {
                                                                                                                  if (decompiledFrameRemainder7) {
                                                                                                                    if (decompiledFrameRemainder6) {
                                                                                                                      if (!this.field_d.d((byte) 105)) {
                                                                                                                        return;
                                                                                                                      }
                                                                                                                      var6 = param0 ? 1 : 0;
                                                                                                                      CipherPacketBuffer.a(var6 != 0, 8, param1 ^ 1, jt.field_a);
                                                                                                                      if (var9 == 0) {
                                                                                                                        return;
                                                                                                                      }
                                                                                                                    }
                                                                                                                  }
                                                                                                                }
                                                                                                              }
                                                                                                            }
                                                                                                          }
                                                                                                        }
                                                                                                      }
                                                                                                      if (decompiledFrameRemainder12) {
                                                                                                        if (decompiledFrameRemainder11) {
                                                                                                          if (decompiledFrameRemainder10) {
                                                                                                            if (decompiledFrameRemainder9) {
                                                                                                              if (decompiledFrameRemainder8) {
                                                                                                                if (decompiledFrameRemainder7) {
                                                                                                                  if (!this.field_d.d((byte) 80)) {
                                                                                                                    return;
                                                                                                                  }
                                                                                                                  var6 = param0 ? 1 : 0;
                                                                                                                  CipherPacketBuffer.a(var6 != 0, 24, 1, jt.field_a);
                                                                                                                  if (var9 == 0) {
                                                                                                                    return;
                                                                                                                  }
                                                                                                                }
                                                                                                              }
                                                                                                            }
                                                                                                          }
                                                                                                        }
                                                                                                      }
                                                                                                    }
                                                                                                    if (decompiledFrameRemainder12) {
                                                                                                      if (decompiledFrameRemainder11) {
                                                                                                        if (decompiledFrameRemainder10) {
                                                                                                          if (decompiledFrameRemainder9) {
                                                                                                            if (decompiledFrameRemainder8) {
                                                                                                              if (!this.field_d.d((byte) 81)) {
                                                                                                                return;
                                                                                                              }
                                                                                                              var6 = param0 ? 1 : 0;
                                                                                                              CipherPacketBuffer.a(var6 != 0, -10, 1, 0);
                                                                                                              if (var9 == 0) {
                                                                                                                return;
                                                                                                              }
                                                                                                            }
                                                                                                          }
                                                                                                        }
                                                                                                      }
                                                                                                    }
                                                                                                  }
                                                                                                  if (decompiledFrameRemainder12) {
                                                                                                    if (decompiledFrameRemainder11) {
                                                                                                      if (decompiledFrameRemainder10) {
                                                                                                        if (decompiledFrameRemainder9) {
                                                                                                          if (!this.field_d.d((byte) 126)) {
                                                                                                            return;
                                                                                                          }
                                                                                                          var6 = param0 ? 1 : 0;
                                                                                                          CipherPacketBuffer.a(var6 != 0, 2, 1, jt.field_a);
                                                                                                          if (var9 == 0) {
                                                                                                            return;
                                                                                                          }
                                                                                                        }
                                                                                                      }
                                                                                                    }
                                                                                                  }
                                                                                                }
                                                                                                if (decompiledFrameRemainder12) {
                                                                                                  if (decompiledFrameRemainder11) {
                                                                                                    if (decompiledFrameRemainder10) {
                                                                                                      if (!this.field_d.d((byte) 81)) {
                                                                                                        return;
                                                                                                      }
                                                                                                      vs.field_j = true;
                                                                                                      du.field_h = false;
                                                                                                      rd.field_j.r(-128);
                                                                                                      var6 = param0 ? 1 : 0;
                                                                                                      CipherPacketBuffer.a(var6 != 0, -5, 1, jt.field_a);
                                                                                                      if (var9 == 0) {
                                                                                                        return;
                                                                                                      }
                                                                                                    }
                                                                                                  }
                                                                                                }
                                                                                              }
                                                                                              if (decompiledFrameRemainder12) {
                                                                                                if (decompiledFrameRemainder11) {
                                                                                                  if (!this.field_d.d((byte) 103)) {
                                                                                                    return;
                                                                                                  }
                                                                                                  if (fj.field_c ||
                                                                                                    gk.field_H) {
                                                                                                    ma.field_Z = false;
                                                                                                  }
                                                                                                  ij.field_y = 0;
                                                                                                  var6 = param0 ? 1 : 0;
                                                                                                  CipherPacketBuffer.a(var6 != 0, 7, 1, jt.field_a);
                                                                                                  if (var9 == 0) {
                                                                                                    return;
                                                                                                  }
                                                                                                }
                                                                                              }
                                                                                            }
                                                                                            if (decompiledFrameRemainder12) {
                                                                                              if (!this.field_d.d((byte) 111)) {
                                                                                                return;
                                                                                              }
                                                                                              if (this.tutorialStage == 12) {
                                                                                                return;
                                                                                              }
                                                                                              jq.field_F = -1;
                                                                                              li.field_q = -1;
                                                                                              this.a((String) null, -1, wf.field_q[0], (String) null, (byte) -64, GlobalSpell.field_l[0]);
                                                                                              var6 = param0 ? 1 : 0;
                                                                                              CipherPacketBuffer.a(var6 != 0, 12, 1, 0);
                                                                                              if (var9 == 0) {
                                                                                                return;
                                                                                              }
                                                                                            }
                                                                                          }
                                                                                          if (!this.field_d.d((byte) 79)) {
                                                                                            return;
                                                                                          }
                                                                                          if (rf.a(27875)) {
                                                                                            var6 = param0 ? 1 : 0;
                                                                                            CipherPacketBuffer.a(var6 != 0, 15, 1, jt.field_a);
                                                                                            if (var9 == 0) {
                                                                                              return;
                                                                                            }
                                                                                          }
                                                                                          li.field_q = -1;
                                                                                          jq.field_F = -1;
                                                                                          this.a((String) null, -1, wf.field_q[0], (String) null, (byte) -99, GlobalSpell.field_l[0]);
                                                                                          var6 = param0 ? 1 : 0;
                                                                                          CipherPacketBuffer.a(var6 != 0, 12, 1, 0);
                                                                                          if (var9 == 0) {
                                                                                            return;
                                                                                          }
                                                                                        }
                                                                                        if (!this.field_d.d((byte) 124)) {
                                                                                          return;
                                                                                        }
                                                                                        if (!DamageEvent.g(param1 + 89)) {
                                                                                          var6 = param0 ? 1 : 0;
                                                                                          CipherPacketBuffer.a(var6 != 0, 13, 1, jt.field_a);
                                                                                          if (var9 == 0) {
                                                                                            return;
                                                                                          }
                                                                                        }
                                                                                        MoveAttackAction.a(0, r.field_G, param0, (byte) 90, true);
                                                                                        if (var9 == 0) {
                                                                                          return;
                                                                                        }
                                                                                      }
                                                                                      if (!this.field_d.d((byte) 89)) {
                                                                                        return;
                                                                                      }
                                                                                      var6 = param0 ? 1 : 0;
                                                                                      CipherPacketBuffer.a(var6 != 0, 20, 1, 0);
                                                                                      if (var9 == 0) {
                                                                                        return;
                                                                                      }
                                                                                    }
                                                                                    if (!this.field_d.d((byte) 49)) {
                                                                                      return;
                                                                                    }
                                                                                    if (this.tutorialStage == 13) {
                                                                                      return;
                                                                                    }
                                                                                    if (jt.field_a == 12) {
                                                                                      b.field_n = null;
                                                                                      eo.field_a = null;
                                                                                    }
                                                                                    var6 = param0 ? 1 : 0;
                                                                                    CipherPacketBuffer.a(var6 != 0, 13, param1 + 1, jt.field_a);
                                                                                    if (var9 == 0) {
                                                                                      return;
                                                                                    }
                                                                                  }
                                                                                  if (!this.field_d.d((byte) 100)) {
                                                                                    return;
                                                                                  }
                                                                                  if (18 == jt.field_a) {
                                                                                    AttackEvent.b(false);
                                                                                  }
                                                                                  if (jt.field_a == 13) {
                                                                                    ah.b((byte) 90);
                                                                                  }
                                                                                  if (jt.field_a == 12) {
                                                                                    eo.field_a = null;
                                                                                    b.field_n = null;
                                                                                  }
                                                                                  var6 = ui.field_c;
                                                                                  var7 = param0 ? 1 : 0;
                                                                                  CipherPacketBuffer.a(var7 != 0, var6, 1, jt.field_a);
                                                                                  if (var9 == 0) {
                                                                                    return;
                                                                                  }
                                                                                }
                                                                                if (!this.field_d.d((byte) 83)) {
                                                                                  return;
                                                                                }
                                                                                var6 = param0 ? 1 : 0;
                                                                                CipherPacketBuffer.a(var6 != 0, 6, 1, jt.field_a);
                                                                                if (var9 == 0) {
                                                                                  return;
                                                                                }
                                                                              }
                                                                              if (!this.field_d.d((byte) 121)) {
                                                                                return;
                                                                              }
                                                                              var6 = param0 ? 1 : 0;
                                                                              CipherPacketBuffer.a(var6 != 0, 14, 1, jt.field_a);
                                                                              if (var9 == 0) {
                                                                                return;
                                                                              }
                                                                            }
                                                                            if (!this.field_d.d((byte) 85)) {
                                                                              return;
                                                                            }
                                                                            ps.field_v = true;
                                                                            stackIn_421_0 = !(cu.field_a);
                                                                            cu.field_a = stackIn_421_0;
                                                                            rj.a(param1 ^ 1);
                                                                            if (var9 == 0) {
                                                                              return;
                                                                            }
                                                                          }
                                                                          if (!this.field_d.d((byte) 98)) {
                                                                            return;
                                                                          }
                                                                          stackIn_431_0 = !(uc.field_a);
                                                                          uc.field_a = stackIn_431_0;
                                                                          ps.field_v = true;
                                                                          rj.a(1);
                                                                          if (var9 == 0) {
                                                                            return;
                                                                          }
                                                                        }
                                                                        if (!this.field_d.d((byte) 59)) {
                                                                          return;
                                                                        }
                                                                        ek.field_d = ek.field_d + 1;
                                                                        ps.field_v = true;
                                                                        if (ek.field_d == 3) {
                                                                          ek.field_d = 0;
                                                                        }
                                                                        rj.a(1);
                                                                        if (var9 == 0) {
                                                                          return;
                                                                        }
                                                                      }
                                                                      if (!this.field_d.d((byte) 55)) {
                                                                        return;
                                                                      }
                                                                      var6 = param0 ? 1 : 0;
                                                                      CipherPacketBuffer.a(var6 != 0, 0, param1 ^ 1, jt.field_a);
                                                                      if (var9 == 0) {
                                                                        return;
                                                                      }
                                                                    }
                                                                    var5 = 0;
                                                                    if (this.field_d.e(94) &&
                                                                      0 < bp.field_e) {
                                                                      var5 = 1;
                                                                      mh.a(0, (byte) -35);
                                                                    }
                                                                    if (this.field_d.b(96) &&
                                                                      256 > bp.field_e) {
                                                                      var5 = 1;
                                                                      mh.a(256, (byte) -96);
                                                                    }
                                                                    if (this.field_d.a(false)) {
                                                                      var6 = -100 + this.a(true, param2) - (-this.a(param2, param1 - 3858) - wd.field_b) >> 1;
                                                                      var7Lifetime2 = AiPlanningStrategy.field_d - var6;
                                                                      var8 = 256 * var7Lifetime2 / 100;
                                                                      if (var8 <= 0) {
                                                                        mh.a(0, (byte) -118);
                                                                        if (var9 != 0) {
                                                                          if (var8 >= 256) {
                                                                            mh.a(256, (byte) -98);
                                                                            mh.a(var8, (byte) -86);
                                                                          } else {
                                                                            mh.a(var8, (byte) -86);
                                                                          }
                                                                        }
                                                                      } else {
                                                                        if (var8 >= 256) {
                                                                          mh.a(256, (byte) -98);
                                                                          if (var9 != 0) {
                                                                            mh.a(var8, (byte) -86);
                                                                          }
                                                                        } else {
                                                                          mh.a(var8, (byte) -86);
                                                                        }
                                                                      }
                                                                      var5 = 1;
                                                                    }
                                                                    if (this.field_d.a((byte) -67) &&
                                                                      bp.field_e > 0) {
                                                                      hi.b(false);
                                                                      var5 = 1;
                                                                    }
                                                                    if (this.field_d.a(-98) &&
                                                                      bp.field_e < 256) {
                                                                      hs.a(30);
                                                                      var5 = 1;
                                                                    }
                                                                    if (var5 == 0) {
                                                                      return;
                                                                    }
                                                                    if (this.field_d.a(false) &&
                                                                      uk.field_n <= pn.field_h) {
                                                                      return;
                                                                    }
                                                                    ub.$cfr$intArgs$a$6d836999ad61(33, im.field_v[0]);
                                                                    pn.field_h = 20 + uk.field_n;
                                                                    if (var9 == 0) {
                                                                      return;
                                                                    }
                                                                  }
                                                                  if (this.field_d.e(-100)) {
                                                                    jf.b(0, 123);
                                                                  }
                                                                  if (this.field_d.b(param1 + 96)) {
                                                                    jf.b(256, param1 + 89);
                                                                  }
                                                                  if (this.field_d.a(false)) {
                                                                    var6 = -100 + (this.a(true, param2) + this.a(param2, -3858) + wd.field_b) >> 1;
                                                                    var7Lifetime1 = -var6 + AiPlanningStrategy.field_d;
                                                                    var8Lifetime1 = 256 * var7Lifetime1 / 100;
                                                                    if (var8Lifetime1 <= 0) {
                                                                      jf.b(0, 94);
                                                                      if (var9 != 0) {
                                                                        if (var8Lifetime1 >= 256) {
                                                                          jf.b(256, 105);
                                                                          jf.b(var8Lifetime1, 107);
                                                                        } else {
                                                                          jf.b(var8Lifetime1, 107);
                                                                        }
                                                                      }
                                                                    } else {
                                                                      if (var8Lifetime1 >= 256) {
                                                                        jf.b(256, 105);
                                                                        if (var9 != 0) {
                                                                          jf.b(var8Lifetime1, 107);
                                                                        }
                                                                      } else {
                                                                        jf.b(var8Lifetime1, 107);
                                                                      }
                                                                    }
                                                                  }
                                                                  if (this.field_d.a((byte) -62)) {
                                                                    wn.a(true);
                                                                  }
                                                                  if (!this.field_d.a(param1 ^ -98)) {
                                                                    return;
                                                                  }
                                                                  vv.a(-30647);
                                                                  if (var9 == 0) {
                                                                    return;
                                                                  }
                                                                }
                                                                if (!this.field_d.d((byte) 76)) {
                                                                  return;
                                                                }
                                                                mi.f(param1 - 28093);
                                                                if (var9 == 0) {
                                                                  return;
                                                                }
                                                              }
                                                              if (!this.field_d.d((byte) 111)) {
                                                                return;
                                                              }
                                                              rd.field_j.d(122, param0);
                                                              vs.field_j = true;
                                                              du.field_h = false;
                                                              if (var9 == 0) {
                                                                return;
                                                              }
                                                            }
                                                            if (!this.field_d.d((byte) 117)) {
                                                              return;
                                                            }
                                                            rd.field_j.h((byte) 69);
                                                            var6 = param0 ? 1 : 0;
                                                            CipherPacketBuffer.a(var6 != 0, -1, param1 ^ 1, 0);
                                                            if (var9 == 0) {
                                                              return;
                                                            }
                                                          }
                                                          if (!this.field_d.d((byte) 96)) {
                                                            return;
                                                          }
                                                          rd.field_j.r(122);
                                                          var6 = param0 ? 1 : 0;
                                                          CipherPacketBuffer.a(var6 != 0, -1, param1 ^ 1, 0);
                                                          if (var9 == 0) {
                                                            return;
                                                          }
                                                        }
                                                        if (!this.field_d.d((byte) 72)) {
                                                          return;
                                                        }
                                                        rd.field_j.l((byte) 108);
                                                        var6 = param0 ? 1 : 0;
                                                        CipherPacketBuffer.a(var6 != 0, -1, 1, 0);
                                                        if (var9 == 0) {
                                                          return;
                                                        }
                                                      }
                                                      if (!this.field_d.d((byte) 73)) {
                                                        return;
                                                      }
                                                      if (fj.field_c) {
                                                        boolean decompiledSharedTail0 = !(!rd.field_j.battlefield.field_X);
                                                        if (!decompiledSharedTail0) {
                                                          var6 = param0 ? 1 : 0;
                                                          CipherPacketBuffer.a(var6 != 0, 19, param1 ^ 1, jt.field_a);
                                                          decompiledSharedTail0 = (var9 != 0);
                                                        }
                                                        if (decompiledSharedTail0) {
                                                          var6 = param0 ? 1 : 0;
                                                          CipherPacketBuffer.a(var6 != 0, -5, param1 ^ 1, jt.field_a);
                                                        }
                                                      }
                                                      if (!gk.field_H) {
                                                        return;
                                                      }
                                                      ov.a(11, 3, 0);
                                                      hh.a(-16147, 50, mp.field_Ob, true);
                                                      if (var9 == 0) {
                                                        return;
                                                      }
                                                    }
                                                    if (!this.field_d.d((byte) 45)) {
                                                      return;
                                                    }
                                                    var6 = param0 ? 1 : 0;
                                                    CipherPacketBuffer.a(var6 != 0, 25, 1, jt.field_a);
                                                    if (var9 == 0) {
                                                      return;
                                                    }
                                                  }
                                                  if (!this.field_d.d((byte) 38)) {
                                                    return;
                                                  }
                                                  nf.field_Mb = 0;
                                                  if (var9 == 0) {
                                                    return;
                                                  }
                                                }
                                                if (!this.field_d.d((byte) 74)) {
                                                  return;
                                                }
                                                nf.field_Mb = 1;
                                                if (var9 == 0) {
                                                  return;
                                                }
                                              }
                                              if (!this.field_d.d((byte) 124)) {
                                                return;
                                              }
                                              if (this.tutorialStage != 10) {
                                                if (this.tutorialStage != 8 &&
                                                  this.tutorialStage != 6 &&
                                                  26 != this.tutorialStage &&
                                                  27 != this.tutorialStage &&
                                                  this.tutorialStage != 28) {
                                                  return;
                                                }
                                                vf.a(0, this.tutorialStage);
                                                if (var9 == 0) {
                                                  return;
                                                }
                                              }
                                              vf.a(0, 9);
                                              if (var9 == 0) {
                                                return;
                                              }
                                            }
                                            if (!this.field_d.d((byte) 100)) {
                                              return;
                                            }
                                            if (!this.a((byte) -95, param2)) {
                                              return;
                                            }
                                            fieldTemp$0 = ij.field_y - 1;
                                            ij.field_y = ij.field_y - 1;
                                            if (fieldTemp$0 != 0) {
                                              return;
                                            }
                                            if (this.field_d.field_h != 0) {
                                              return;
                                            }
                                            this.field_d.field_h = 2;
                                            if (var9 == 0) {
                                              return;
                                            }
                                          }
                                          if (!this.field_d.d((byte) 71)) {
                                            return;
                                          }
                                          if (!this.a((byte) 70, param2)) {
                                            return;
                                          }
                                          fieldTemp$1 = ij.field_y + 1;
                                          ij.field_y = ij.field_y + 1;
                                          if (~fieldTemp$1 != ~(-1 + PortalLossCondition.field_c.length)) {
                                            return;
                                          }
                                          if (this.field_d.field_h != 2) {
                                            return;
                                          }
                                          this.field_d.field_h = 0;
                                          if (var9 == 0) {
                                            return;
                                          }
                                        }
                                        if (!this.field_d.d((byte) 112)) {
                                          return;
                                        }
                                        var6 = param0 ? 1 : 0;
                                        CipherPacketBuffer.a(var6 != 0, 23, 1, jt.field_a);
                                        if (var9 == 0) {
                                          return;
                                        }
                                      }
                                      if (!this.field_d.d((byte) 46)) {
                                        return;
                                      }
                                      var6 = param0 ? 1 : 0;
                                      CipherPacketBuffer.a(var6 != 0, 26, 1, jt.field_a);
                                      if (var9 == 0) {
                                        return;
                                      }
                                    }
                                    if (!this.field_d.d((byte) 127)) {
                                      return;
                                    }
                                    var6 = param0 ? 1 : 0;
                                    CipherPacketBuffer.a(var6 != 0, 27, 1, jt.field_a);
                                    if (var9 == 0) {
                                      return;
                                    }
                                  }
                                  if (!this.field_d.d((byte) 95)) {
                                    return;
                                  }
                                  var6 = param0 ? 1 : 0;
                                  CipherPacketBuffer.a(var6 != 0, 28, 1, jt.field_a);
                                  if (var9 == 0) {
                                    return;
                                  }
                                }
                                if (!this.field_d.d((byte) 67)) {
                                  return;
                                }
                                ho.a(CombatEvent.d((byte) -128), (byte) -3);
                                if (var9 == 0) {
                                  return;
                                }
                              }
                              if (!this.field_d.d((byte) 58)) {
                                return;
                              }
                              var6 = param0 ? 1 : 0;
                              CipherPacketBuffer.a(var6 != 0, -8, 1, 0);
                              if (var9 == 0) {
                                return;
                              }
                            }
                            if (!this.field_d.d((byte) 41)) {
                              return;
                            }
                            IntrusiveNode.field_h = true;
                            var6 = param0 ? 1 : 0;
                            CipherPacketBuffer.a(var6 != 0, -3, 1, 0);
                            if (var9 == 0) {
                              return;
                            }
                          }
                          if (!this.field_d.d((byte) 47)) {
                            return;
                          }
                          var6 = param0 ? 1 : 0;
                          CipherPacketBuffer.a(var6 != 0, -3, 1, 0);
                          if (var9 == 0) {
                            return;
                          }
                        }
                        if (!this.field_d.d((byte) 111)) {
                          return;
                        }
                        stackIn_693_0 = r.field_B;
                        if (DeployEvent.field_A == 1) {
                          stackIn_694_1 = 1;
                        } else {
                          stackIn_694_1 = -1;
                        }
                        r.field_B = stackIn_693_0 + stackIn_694_1;
                        if (r.field_B < 2) {
                          r.field_B = 8;
                        }
                        if (r.field_B > 8) {
                          r.field_B = 2;
                        }
                        if (mg.field_g > r.field_B) {
                          mg.field_g = r.field_B;
                        }
                        if (0 == t.field_e &&
                          r.field_B > 2) {
                          t.field_e = 1;
                        }
                        if (t.field_e == 1 &&
                          r.field_B > 4) {
                          t.field_e = 2;
                        }
                        if (t.field_e == 2 &&
                          r.field_B > 6) {
                          t.field_e = 3;
                        }
                        if (t.field_e != 3) {
                          return;
                        }
                        if (4 <= r.field_B) {
                          return;
                        }
                        t.field_e = 2;
                        if (var9 == 0) {
                          return;
                        }
                      }
                      if (!this.field_d.d((byte) 124)) {
                        return;
                      }
                      stackIn_740_0 = mg.field_g;
                      if (1 == DeployEvent.field_A) {
                        stackIn_741_1 = 1;
                      } else {
                        stackIn_741_1 = -1;
                      }
                      mg.field_g = stackIn_740_0 + stackIn_741_1;
                      if (mg.field_g < 0) {
                        mg.field_g = r.field_B;
                      }
                      if (r.field_B >= mg.field_g) {
                        return;
                      }
                      mg.field_g = 0;
                      if (var9 == 0) {
                        return;
                      }
                    }
                    if (!this.field_d.d((byte) 91)) {
                      return;
                    }
                    stackIn_757_0 = !(vg.field_m);
                    vg.field_m = stackIn_757_0;
                    if (var9 == 0) {
                      return;
                    }
                  }
                  if (!this.field_d.d((byte) 61)) {
                    return;
                  }
                  t.field_e = t.field_e + 1;
                  if (4 == t.field_e) {
                    t.field_e = 0;
                  }
                  if (0 == t.field_e &&
                    r.field_B > 2) {
                    r.field_B = 2;
                  }
                  if (t.field_e == 1 &&
                    4 < r.field_B) {
                    r.field_B = 4;
                  }
                  if (t.field_e == 2 &&
                    r.field_B > 6) {
                    r.field_B = 6;
                  }
                  if (3 != t.field_e) {
                    return;
                  }
                  if (4 <= r.field_B) {
                    return;
                  }
                  r.field_B = 4;
                  if (var9 == 0) {
                    return;
                  }
                }
                if (!this.field_d.d((byte) 102)) {
                  return;
                }
                i.n(14737632);
                var6 = param0 ? 1 : 0;
                CipherPacketBuffer.a(var6 != 0, -6, 1, jt.field_a);
                if (var9 == 0) {
                  return;
                }
              }
              if (!this.field_d.d((byte) 89)) {
                return;
              }
              kv.a(-28541);
              var6 = param0 ? 1 : 0;
              CipherPacketBuffer.a(var6 != 0, -7, 1, jt.field_a);
              if (var9 == 0) {
                return;
              }
            }
            if (!this.field_d.d((byte) 88)) {
              return;
            }
            this.a((byte) 93, ev.field_d, ts.field_j);
            var6Lifetime2 = param0 ? 1 : 0;
            CipherPacketBuffer.a(var6Lifetime2 != 0, 18, 1, 0);
            if (var9 == 0) {
              return;
            }
          }
          if (var4_int >= 55 &&
            param2 < 59 &&
            this.field_d.d((byte) 121)) {
            var6Lifetime1 = -55 + var4_int;
            if (var6Lifetime1 > 1 &&
              rf.a(param1 + 27875) &&
              var9 == 0) {
              return;
            }
            wf.field_D = var6Lifetime1;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw ig.a((Throwable) ((Object) var4), "ci.HA(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    private final void b(int param0) {
        try {
          fe.a(eq.field_n, db.a(true, param0), MatchConditionEntry.a(220, (byte) 94), 400, 16777215, true);
        } catch (RuntimeException runtimeException) {
          throw ig.a((Throwable) ((Object) runtimeException), "ci.H(" + param0 + ')');
        }
    }

    private final String c(int param0, int param1) {
        RuntimeException var3 = null;
        String stackIn_2_0 = null;
        int stackIn_6_0 = 0;
        String stackIn_7_1 = null;
        String stackIn_8_0 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != -38) {
            stackIn_2_0 = (String) null;
            return stackIn_2_0;
          }
          stackIn_6_0 = 4800;
          if (1 == param1) {
            stackIn_7_1 = bt.field_b;
          } else {
            stackIn_7_1 = lm.field_f;
          }
          stackIn_8_0 = fo.a(stackIn_6_0, stackIn_7_1, new String[]{Integer.toString(param1)});
          return stackIn_8_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw ig.a((Throwable) ((Object) var3), "ci.PA(" + param0 + ',' + param1 + ')');
        }
    }

    private final void a(byte param0, int param1, rg param2) {
        int stackIn_16_0 = 0;
        int stackIn_16_1 = 0;
        int stackIn_16_2 = 0;
        int stackIn_17_3 = 0;
        tu stackIn_24_0;
        String stackIn_24_1;
        int stackIn_24_2;
        int stackIn_24_3;
        int stackIn_24_4;
        int stackIn_25_5 = 0;
        RgbSprite[] stackIn_32_0 = null;
        int stackIn_33_1 = 0;
        RuntimeException stackIn_38_0 = null;
        StringBuilder stackIn_38_1 = null;
        String stackIn_39_2 = null;
        RuntimeException decompiledCaughtException = null;
        String var4 = null;
        RuntimeException var4_ref = null;
        String var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        try {
          var6 = 0;
          var7 = 0;
          if (null != param2 &&
            0 > param1) {
            var5 = param2.field_g;
            var6 = param2.field_f;
            var7 = 1;
            var4 = param2.field_k;
          } else {
            if (-1 < param1) {
              var4 = fq.field_f[param1];
              var6 = uc.spellDefinitions[param1][2];
              var5 = ActionRequest.field_l[param1];
            }
            if (!(-1 < param1) ||
              ArmiesOfGielinor.obfuscationControl) {
              eo.field_a = null;
              return;
            }}
          if (param0 <= 41) {
            return;
          }
          var8 = 250;
          var9 = 12;
          var10 = en.field_E.a(var5, -20 + var8, var9);
          var11 = nr.field_e.a(var4, var8 - 45 << 1, 0) >> 1;
          stackIn_16_0 = var11 + 40 + var10;
          stackIn_16_1 = -12;
          stackIn_16_2 = var9;
          if (var7 == 0) {
            stackIn_17_3 = var9 + 30;
          } else {
            stackIn_17_3 = 0;
          }
          var12 = stackIn_16_0 - (stackIn_16_1 - (stackIn_16_2 + stackIn_17_3));
          eo.field_a = new RgbSprite(var8, var12);
          eo.field_a.b();
          var13 = 200;
          var14 = 16777215;
          var15 = -1;
          var16 = 1;
          var17 = 0;
          if (var7 == 0) {
            fe.a(fo.a(4800, me.field_a, new String[]{Integer.toString(pg.field_d.field_a[param1])}), var8 >> 1, 82 + var11, var8 - 45, nd.field_b, true);
          }
          stackIn_24_0 = en.field_E;
          stackIn_24_1 = var5;
          stackIn_24_2 = 10;
          stackIn_24_3 = 52;
          stackIn_24_4 = -var11;
          if (var7 != 0) {
            stackIn_25_5 = 8;
          } else {
            stackIn_25_5 = 30;
          }
          ((tu) (Object) stackIn_24_0).a(stackIn_24_1, stackIn_24_2, stackIn_24_3 - (stackIn_24_4 - stackIn_25_5), -20 + var8, var13, var14, var15, var16, var17, var9);
          if (var7 == 0) {
            en.field_E.a(fo.a(4800, ae.field_w, new String[]{Integer.toString(1 + uc.spellDefinitions[param1][1])}), 10, var11 + (52 - (-30 - var10)), var8 - 20, var13, var14, var15, var16, var17, var9);
          }
          fe.a(var4, var8 >> 1, 35, -45 + var8, nd.field_b, true);
          BattleCharacter.field_h[var6].g(-20 + (var8 >> 1), 12 + var11);
          stackIn_32_0 = km.field_h;
          if (var7 == 0) {
            stackIn_33_1 = 0;
          } else {
            stackIn_33_1 = 1;
          }
          ((RgbSprite) (Object) stackIn_32_0[stackIn_33_1]).g((var8 >> 1) - 23, -3 + (12 + var11));
          so.field_b.a(5605);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_38_0 = var4_ref;
          stackIn_38_1 = new StringBuilder().append("ci.B(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_39_2 = "null";
          } else {
            stackIn_39_2 = "{...}";
          }
          throw ig.a((Throwable) ((Object) stackIn_38_0), ((StringBuilder) (Object) stackIn_38_1).append(stackIn_39_2).append(')').toString());
        }
    }

    private final void d(int param0) {
        String discarded$0 = null;
        int stackIn_25_0 = 0;
        int stackIn_25_1 = 0;
        boolean stackIn_26_2 = false;
        int stackIn_58_0 = 0;
        int stackIn_58_1 = 0;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        var5 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          if (-1 < wh.field_a &&
            AiPlanningStrategy.field_d > db.a(true, 40) &&
            AiPlanningStrategy.field_d < db.a(true, 376) &&
            ko.field_b > MatchConditionEntry.a(330, (byte) 94) &&
            ko.field_b < MatchConditionEntry.a(414, (byte) 94)) {
            ah.field_a.a(wh.field_a, (AiPlanningStrategy.field_d - db.a(true, 40)) / 21 + 16 * ((ko.field_b - MatchConditionEntry.a(330, (byte) 94)) / 42), (byte) -110);
            ub.$cfr$intArgs$a$6d836999ad61(62, im.field_v[10]);
            return;
          }
          var2_int = fs.a(ko.field_b, 24340, db.a(true, 380), MatchConditionEntry.a(60, (byte) 94), AiPlanningStrategy.field_d, 224, 352);
          if (param0 != 330) {
            discarded$0 = this.f(-6, -35);
          }
          if (var2_int > -2) {
            stackIn_25_0 = wh.field_a;
            stackIn_25_1 = pg.field_d.a(0);
            stackIn_26_2 = !(hi.field_j < 2);
            if (ue.a(stackIn_25_0, stackIn_25_1, stackIn_26_2, var2_int, -1208926000, ei.field_e[0])) {
              ah.field_a.a(73, var2_int, wh.field_a);
              ub.$cfr$intArgs$a$6d836999ad61(121, im.field_v[9]);
              if (var5 == 0) {
                return;
              }
            }
            ub.$cfr$intArgs$a$6d836999ad61(62, im.field_v[5]);
            return;
          }
          if (-3 == var2_int) {
            return;
          }
          boolean decompiledFrameCompleted0 = true;
          var3 = 44;
          if (AiPlanningStrategy.field_d > db.a(true, 308) &&
            AiPlanningStrategy.field_d < db.a(true, 376)) {
            var4 = 0;
            while (var4 < 6) {
              stackIn_58_0 = ~ko.field_b;
              stackIn_58_1 = ~MatchConditionEntry.a(var4 * var3 + 60, (byte) 94);
              if (var5 != 0) {
                decompiledFrameCompleted0 = false;
                break;
              }
              if (stackIn_58_0 < stackIn_58_1 &&
                ko.field_b < MatchConditionEntry.a(-4 + (60 + var3 * (var4 + 1)), (byte) 94)) {
                wh.field_a = var4;
                if (wh.field_a != kd.field_X) {
                  dd.field_e = 0;
                  kb.field_n = 0;
                  kd.field_X = wh.field_a;
                  dg.b((byte) -61);
                }
                ub.$cfr$intArgs$a$6d836999ad61(33, im.field_v[2]);
                return;
              }
              var4++;
            }
          }
          if (decompiledFrameCompleted0) {
            var2_int = ah.field_a.a(ko.field_b, param0 ^ 21728, db.a(true, 55), MatchConditionEntry.a(70, (byte) 94), AiPlanningStrategy.field_d);
            stackIn_58_0 = ~var2_int;
            stackIn_58_1 = 1;
          }
          if (stackIn_58_0 < stackIn_58_1) {
            wh.field_a = var2_int;
            if (kd.field_X != wh.field_a) {
              kb.field_n = 0;
              kd.field_X = wh.field_a;
              dd.field_e = 0;
              dg.b((byte) -61);
            }
            ub.$cfr$intArgs$a$6d836999ad61(68, im.field_v[2]);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ig.a((Throwable) ((Object) var2), "ci.SA(" + param0 + ')');
        }
    }

    private final void n(int param0) {
        boolean stackIn_4_0 = false;
        int stackIn_10_0 = 0;
        int stackIn_14_0 = 0;
        boolean stackIn_27_4 = false;
        int stackIn_31_3 = 0;
        int[] stackIn_43_0;
        int stackIn_43_1;
        int stackIn_43_2;
        int stackIn_43_3;
        int stackIn_43_4;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_3_0;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int[] var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var3Lifetime1;
        int var9Lifetime1;
        var12 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          var2_int = 56;
          var3 = 0;
          boolean decompiledNaturalLoopExit0 = false;
          while (!(decompiledNaturalLoopExit0 = (!(var3 < oh.field_G.length)))) {
            stackOut_3_0 = this.c((byte) 102, var3);
            stackIn_10_0 = stackOut_3_0 ? 1 : 0;
            stackIn_4_0 = stackOut_3_0;
            if (var12 == 0) {
              if (!stackIn_4_0) {
                var2_int--;
              }
              var3++;
              continue;
            }
            break;
          }
          if (decompiledNaturalLoopExit0) {
            stackIn_10_0 = -1;
          }
          stackIn_14_0 = (stackIn_10_0 != ~(var2_int % 2)) ? 0 : 1;
          var3Lifetime1 = stackIn_14_0;
          var4 = 0;
          var4 = (int)Math.ceil((double)((float)(var2_int - var4 / 2) / 12.0f));
          MatchConditionRegistry.field_c = 85;
          var5 = MatchConditionRegistry.field_c;
          if (var3Lifetime1 != 0) {
            var5 -= 20;
          }
          var6 = 59;
          var7 = new int[1 + var4];
          var8 = 0;
          var9 = 0;
          scanLoop1: while (true) {
            if (var9 < var7.length - 1) {
              stackIn_43_0 = var7;
              stackIn_43_1 = var9;
              stackIn_43_2 = 12;
              stackIn_43_3 = var3Lifetime1;
              stackIn_43_4 = -2;
              if (var12 == 0) {
                stackIn_27_4 = (stackIn_43_4 == ~(var9 % 2));
                if (!CipherPacketBuffer.a(stackIn_43_3 != 0, stackIn_27_4)) {
                  stackIn_31_3 = 0;
                } else {
                  stackIn_31_3 = -1;
                }
                stackIn_43_0[stackIn_43_1] = stackIn_43_2 - stackIn_31_3;
                var8 = var8 + var7[var9];
                if (var2_int < var8) {
                  var7[var9] = var7[var9] - (-var2_int + var8);
                }
                var9++;
                continue;
              }
            } else {
              if (var7.length < 4) {
                break scanLoop1;
              }
              if (var7[4] > 6) {
                break scanLoop1;
              }
              stackIn_43_0 = var7;
              stackIn_43_1 = 3;
              stackIn_43_2 = var7[3];
              stackIn_43_3 = -var7[4];
              stackIn_43_4 = 6;
            }
            stackIn_43_0[stackIn_43_1] = stackIn_43_2 - (stackIn_43_3 + stackIn_43_4);
            var7[4] = 6;
            break;
          }
          if (param0 != 21666) {
            this.d(86);
          }
          var9Lifetime1 = 0;
          var10 = 0;
          var11 = 0;
          while (56 > var11) {
            if (var12 != 0) {
              return;
            }
            if (this.c((byte) -2, var11) ||
              var12 != 0) {
              qf.field_d[var11] = var5;
              GameEvent.field_q[var11] = var6;
              var5 += 40;
              var9Lifetime1++;
              if (var9Lifetime1 == var7[var10]) {
                var6 += 28;
                var10++;
                var9Lifetime1 = 0;
                var5 = (480 - 40 * var7[var10]) / 2 + MatchConditionRegistry.field_c;
                if (~(1 & var7[var10]) == ~(var7[var10 - 1] & 1)) {
                  var5 += 20;
                }
              }
            }
            var11++;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ig.a((Throwable) ((Object) var2), "ci.NA(" + param0 + ')');
        }
    }

    private final void g(byte param0) {
        int var2_int = 0;
        RuntimeException var2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (MoveEvent.field_E == null) {
            return;
          }
          MoveEvent.field_E.a(this.field_d.field_h, (byte) -28, t.field_e, wf.field_D, vg.field_m, mg.field_g, r.field_B, this.f(true));
          var2_int = -9 % ((61 - param0) / 60);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ig.a((Throwable) ((Object) var2), "ci.GB(" + param0 + ')');
        }
    }

    final static void h(byte param0) {
        try {
          SphinxActionRequest.field_v.j(-128);
          SphinxActionRequest.field_v.a(new ut(SphinxActionRequest.field_v), 0);
          if (param0 < 44) {
            TutorialController.h((byte) -22);
          }
        } catch (RuntimeException runtimeException) {
          throw ig.a((Throwable) ((Object) runtimeException), "ci.BA(" + param0 + ')');
        }
    }

    private final int a(rg param0, boolean param1, int param2, int param3) {
        rg stackIn_10_1 = null;
        boolean stackIn_11_2 = false;
        int stackIn_14_0 = 0;
        int stackIn_25_0 = 0;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_30_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        var6 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          var5_int = 0;
          boolean decompiledSharedTail0 = (param0.field_j != null);
          if (!decompiledSharedTail0) {
            SoftwareRaster.f(db.a(true, 38), MatchConditionEntry.a(340, (byte) 94), 254, 36, 2500134);
            decompiledSharedTail0 = (var6 != 0);
          }
          if (decompiledSharedTail0) {
            stackIn_10_1 = param0.field_j;
            if (256 == param3) {
              stackIn_11_2 = false;
            } else {
              stackIn_11_2 = param1;
            }
            var5_int = this.a(stackIn_10_1, stackIn_11_2, -124, 256);
            MoveEvent.field_z.e(db.a(true, 30 + var5_int * 50 + 4), MatchConditionEntry.a(354, (byte) 94), param3);
          }
          if (param2 > -82) {
            stackIn_14_0 = 49;
            return stackIn_14_0;
          }
          param0.field_c.h(db.a(true, var5_int * 50 + 50), MatchConditionEntry.a(348, (byte) 94));
          km.field_h[1].h(db.a(true, 50 * var5_int + 30 + 19), MatchConditionEntry.a(347, (byte) 94));
          SoftwareRaster.a(db.a(true, 30 + var5_int * 50 + 30), MatchConditionEntry.a(358, (byte) 94), 12, 2500134, -param3 + 256);
          if (ml.a(MatchConditionEntry.a(359, (byte) 94), db.a(true, 30 + (50 * var5_int + 30)), 10, false)) {
            na.field_F = param0.field_f + 400;
            if (!param1) {
              vi.field_f = fo.a(4800, rr.field_a, new String[]{param0.field_k});
              if (var6 != 0) {
                vi.field_f = param0.field_k;
              }
            } else {
              vi.field_f = param0.field_k;
            }
          }
          stackIn_25_0 = var5_int + 1;
          return stackIn_25_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_29_0 = var5;
          stackIn_29_1 = new StringBuilder().append("ci.VA(");
          if (param0 == null) {
            stackIn_30_2 = "null";
          } else {
            stackIn_30_2 = "{...}";
          }
          throw ig.a((Throwable) ((Object) stackIn_29_0), ((StringBuilder) (Object) stackIn_29_1).append(stackIn_30_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    private final void a(boolean param0, byte param1) {
        int discarded$0 = 0;
        int[] stackIn_8_0 = null;
        boolean stackIn_11_0 = false;
        RgbSprite stackIn_35_0 = null;
        int stackIn_40_0 = 0;
        int stackIn_44_0 = 0;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_10_0;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int[] var5 = null;
        int var6 = 0;
        RgbSprite var7_ref_wk = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        String[] var11 = null;
        String var12 = null;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var3_intLifetime1;
        int var4Lifetime1;
        var17 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          var3_int = db.a(true, 55);
          var4 = MatchConditionEntry.a(53, (byte) 94);
          if (param1 != -4) {
            discarded$0 = this.a(-41, 32);
          }
          if (param0) {
            stackIn_8_0 = i.field_Nb;
          } else {
            stackIn_8_0 = ei.field_e;
          }
          var5 = stackIn_8_0;
          var6 = 0;
          boolean decompiledNaturalLoopExit0 = false;
          while (!(decompiledNaturalLoopExit0 = (!(var6 < so.field_a.length)))) {
            stackOut_10_0 = this.c((byte) 106, var6);
            stackIn_40_0 = stackOut_10_0 ? 1 : 0;
            stackIn_11_0 = stackOut_10_0;
            if (var17 == 0) {
              boolean decompiledFrameRemainder0 = true;
              if (stackIn_11_0) {
                var3_intLifetime1 = db.a(true, qf.field_d[var6]);
                var4Lifetime1 = MatchConditionEntry.a(GameEvent.field_q[var6], (byte) 94);
                if (var6 == vs.field_a) {
                  TeamRoster.field_e.f(var3_intLifetime1 - 20, var4Lifetime1 - 20, 256);
                }
                if (~var6 == ~lm.field_c) {
                  TeamRoster.field_e.f(var3_intLifetime1 - 20, -20 + var4Lifetime1, 128);
                }
                if (!rb.a(var6, var5, 1)) {
                  if (!(param0)) {
                    if (pn.field_n[var6] &&
                      df.field_M <= 0) {
                      stackIn_35_0 = DeathEvent.field_A;
                    } else {
                      stackIn_35_0 = MoveAttackRequest.field_A;
                    }
                    var7_ref_wk = stackIn_35_0;
                    var7_ref_wk.e(var3_intLifetime1, var4Lifetime1);
                  }
                  decompiledFrameRemainder0 = false;
                }
                else {
                  qu.field_k[var6].c(var3_intLifetime1, var4Lifetime1);
                }
              }
              var6++;
              continue;
            }
            break;
          }
          if (decompiledNaturalLoopExit0) {
            stackIn_40_0 = vs.field_a;
          }
          if (stackIn_40_0 != -1) {
            stackIn_44_0 = vs.field_a;
          } else {
            stackIn_44_0 = lm.field_c;
          }
          var6 = stackIn_44_0;
          if (var6 == -1) {
            rs.field_n.c(ck.field_a, db.a(true, 279) + 154, MatchConditionEntry.a(200, (byte) 94) + 112, 16777215, -1);
            if (!DamageEvent.g(95)) {
              return;
            }
            fe.a(eq.field_n, db.a(true, 420), MatchConditionEntry.a(386, (byte) 94), 350, 16777215, true);
            if (var17 == 0) {
              return;
            }
          }
          var7 = rs.field_n.field_z + rs.field_n.field_L;
          fe.a(so.field_a[var6], db.a(true, 272), MatchConditionEntry.a(260 - (rs.field_n.field_L - rs.field_n.field_v), (byte) 94), nd.field_b, true);
          var8 = rb.a(var6, var5, 1) ? 1 : 0;
          var9 = MatchConditionEntry.a(288, (byte) 94);
          if (var8 != 0) {
            rs.field_n.b(wd.field_f, db.a(true, 272), var9, 65280, -1);
          }
          if (var8 == 0 ||
            var17 != 0) {
            rs.field_n.b(bl.field_g, db.a(true, 272), var9, 16711680, -1);
          }
          var10 = MatchConditionEntry.a(260 + var7, (byte) 94);
          if (var8 != 0) {
            qu.field_k[var6].a(db.a(true, 82), -14 + var10);
            if (var17 != 0) {
              if (!pn.field_n[var6] ||
                !(df.field_M <= 0)) {
                MoveAttackRequest.field_A.g(db.a(true, 82), -14 + var10);
                DeathEvent.field_A.g(db.a(true, 82), -14 + var10);
              } else {
                DeathEvent.field_A.g(db.a(true, 82), -14 + var10);
              }
            }
          } else {
            if (!pn.field_n[var6] ||
              !(df.field_M <= 0)) {
              MoveAttackRequest.field_A.g(db.a(true, 82), -14 + var10);
              if (var17 != 0) {
                DeathEvent.field_A.g(db.a(true, 82), -14 + var10);
              }
            } else {
              DeathEvent.field_A.g(db.a(true, 82), -14 + var10);
            }
          }
          var10 = var10 + rs.field_n.field_H;
          var10 = var10 + rs.field_n.field_H;
          var11 = new String[16];
          var12 = eu.field_d;
          if (!cg.field_m[var6] ||
            var8 != 0) {
            var12 = oi.field_a[var6];
          }
          var13 = rs.field_n.a(var12, new int[]{288}, var11);
          var7 += 3;
          var10 = MatchConditionEntry.a(314, (byte) 94);
          var14 = 0;
          do {
            if (var14 >= var13) {
              var10 = MatchConditionEntry.a(385, (byte) 94);
              rs.field_n.b(rd.field_h + ps.field_D[var6], db.a(true, 272), var10, 16777215, -1);
              rs.field_n.b(vo.field_e, db.a(true, 392), var10, 16777215, -1);
              var14 = db.a(true, rs.field_n.a(vo.field_e) + 392);
              break;
            }
            rs.field_n.b(var11[var14], db.a(true, 272), var10, 16777215, -1);
            var10 = var10 + var7;
            var14++;
          } while (var17 == 0);
          var15 = var10 - (rs.field_n.field_H + CorpseConditionMarker.field_v.field_v) / 2;
          var16 = 0;
          while (true) {
            if (var16 >= na.field_J[var6]) {
              return;
            }
            CorpseConditionMarker.field_v.g(var14, var15);
            var14 = var14 + CorpseConditionMarker.field_v.field_y / 3;
            var16++;
            if (var17 != 0) {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw ig.a((Throwable) ((Object) var3), "ci.OA(" + param0 + ',' + param1 + ')');
        }
    }

    private final void d(byte param0, int param1) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          this.b(true);
          if (param0 != -35) {
            this.a(true);
          }
          if (0 == pg.field_d.field_b[param1]) {
            fe.c(this.c(-38, 50), db.a(true, 537), MatchConditionEntry.a(366, (byte) 94), nd.field_b, true);
            if (pg.field_d.a((byte) 120) >= 50) {
              boolean decompiledSharedTail0 = !(wg.a(-33, db.a(true, 469), db.a(true, 606), MatchConditionEntry.a(384, (byte) 94), MatchConditionEntry.a(416, (byte) 94)));
              if (!decompiledSharedTail0) {
                fe.a(db.a(true, 469), MatchConditionEntry.a(384, (byte) 94), 137, 32, DisplacedUnitMarker.field_s, field_e, 0, 0);
                na.field_F = 53;
                decompiledSharedTail0 = (ArmiesOfGielinor.obfuscationControl);
              }
              if (decompiledSharedTail0) {
                fe.a(db.a(true, 469), MatchConditionEntry.a(384, (byte) 94), 137, 32, DisplacedUnitMarker.field_s, nd.field_b, 0, 0);
              }
              fe.c(wv.field_e, db.a(true, 537), MatchConditionEntry.a(416, (byte) 94), 0, true);
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw ig.a((Throwable) ((Object) var3), "ci.LB(" + param0 + ',' + param1 + ')');
        }
    }

    public static void h(int param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        try {
          field_b = null;
          if (param0 != -1) {
            field_b = (String) null;
          }
          field_e = null;
          field_f = null;
          field_c = null;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw ig.a((Throwable) ((Object) var1), "ci.QA(" + param0 + ')');
        }
    }

    private final int b(int param0, int param1, int param2) {
        int discarded$0 = 0;
        boolean stackIn_6_0 = false;
        int stackIn_31_0 = 0;
        int stackIn_33_0 = 0;
        int stackIn_36_0 = 0;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_5_0;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        var7 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          var4_int = 0;
          if (param2 != 31) {
            discarded$0 = this.a(false, -54);
          }
          boolean decompiledNaturalLoopExit0 = false;
          while (!(decompiledNaturalLoopExit0 = (!(MoveEvent.field_y[this.tutorialStage].length > var4_int)))) {
            var5 = -5 + this.a(var4_int, true);
            stackOut_5_0 = this.a((byte) -110, var4_int);
            stackIn_36_0 = stackOut_5_0 ? 1 : 0;
            stackIn_6_0 = stackOut_5_0;
            if (var7 == 0) {
              if (stackIn_6_0 &&
                this.a(true, var4_int) <= param1 &&
                this.a(var4_int, -3858) > param1 &&
                param0 >= var5 &&
                param0 < this.d(12, var4_int) + var5) {
                var6 = MoveEvent.field_y[this.tutorialStage][var4_int];
                if ((var6 == 32 ||
                  var6 == 31) && hi.field_j < 2) {
                  stackIn_31_0 = -1;
                  return stackIn_31_0;
                }
                stackIn_33_0 = var4_int;
                return stackIn_33_0;
              }
              var4_int++;
              continue;
            }
            break;
          }
          if (decompiledNaturalLoopExit0) {
            stackIn_36_0 = -1;
          }
          return stackIn_36_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw ig.a((Throwable) ((Object) var4), "ci.KA(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    private final void a(String param0, int param1, String param2, String param3, byte param4, String param5) {
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_16_0 = 0;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_26_2 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_30_2 = null;
        StringBuilder stackIn_33_1 = null;
        String stackIn_34_2 = null;
        StringBuilder stackIn_37_1 = null;
        String stackIn_38_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var7_int = 0;
        RuntimeException var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        String var11 = null;
        String var12 = null;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        try {
          var7_int = 250;
          stackIn_4_0 = (param0 == null) ? 0 : 12;
          var8 = stackIn_4_0;
          stackIn_8_0 = (param1 != -1) ? 22 : 0;
          var9 = stackIn_8_0;
          var10 = 17 % ((44 - param4) / 54);
          var11 = "<br>" + param3;
          var12 = "<br>" + param0;
          var13 = en.field_E.a(param5, var7_int, var8);
          if (null != param3) {
            stackIn_12_0 = en.field_E.a(var11, var7_int, var8);
          } else {
            stackIn_12_0 = 0;
          }
          var14 = stackIn_12_0;
          if (param0 == null) {
            stackIn_16_0 = 0;
          } else {
            stackIn_16_0 = en.field_E.a(var12, var7_int, var8);
          }
          var15 = stackIn_16_0;
          var16 = var9 + var14 + (var13 + var15 + 30);
          eo.field_a = new RgbSprite(var7_int, var16);
          eo.field_a.b();
          var17 = 200;
          var18 = 16777215;
          var19 = -1;
          var20 = 0;
          var21 = 0;
          var22 = 12;
          en.field_E.a(param3, 0, 30, var7_int, var17, var18, var19, var20, var21, var22);
          if (-1 < param1) {
            ro.field_rb[param1].a(0, var14 + 25);
            en.field_E.b(hi.field_m[param1], 23, 30 + var14 + 8, var18, var19);
          }
          en.field_E.a(param0, 0, var14 + (30 + var9), var7_int, var17, var18, var19, var20, var21, var22);
          en.field_E.a(param5, 0, var15 + (var14 + 30) + var9, var7_int, var17, var18, var19, var20, var21, var22);
          fe.c(param2, var7_int >> 1, 30, nd.field_b, true);
          so.field_b.a(5605);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_25_0 = var7;
          stackIn_25_1 = new StringBuilder().append("ci.TA(");
          if (param0 == null) {
            stackIn_26_2 = "null";
          } else {
            stackIn_26_2 = "{...}";
          }
          stackIn_29_1 = ((StringBuilder) (Object) stackIn_25_1).append(stackIn_26_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_30_2 = "null";
          } else {
            stackIn_30_2 = "{...}";
          }
          stackIn_33_1 = ((StringBuilder) (Object) stackIn_29_1).append(stackIn_30_2).append(',');
          if (param3 == null) {
            stackIn_34_2 = "null";
          } else {
            stackIn_34_2 = "{...}";
          }
          stackIn_37_1 = ((StringBuilder) (Object) stackIn_33_1).append(stackIn_34_2).append(',').append(param4).append(',');
          if (param5 == null) {
            stackIn_38_2 = "null";
          } else {
            stackIn_38_2 = "{...}";
          }
          throw ig.a((Throwable) ((Object) stackIn_25_0), ((StringBuilder) (Object) stackIn_37_1).append(stackIn_38_2).append(')').toString());
        }
    }

    private final String f(boolean param0) {
        Object stackIn_54_0 = null;
        RuntimeException decompiledCaughtException = null;
        Object var2 = null;
        try {
          var2 = null;
          if (0 != ui.field_c &&
            0 != jt.field_a &&
            ui.field_c != 15 &&
            15 != jt.field_a) {
            if (ui.field_c != 1 &&
              jt.field_a != 1 &&
              ui.field_c != 24 &&
              jt.field_a != 24) {
              if (ui.field_c != 2 &&
                2 != jt.field_a &&
                ui.field_c != 3 &&
                3 != jt.field_a &&
                4 != ui.field_c &&
                jt.field_a != 4) {
                if (ui.field_c == 21 ||
                  ui.field_c == 23) {
                  var2 = lb.field_c;
                }
              } else {
                var2 = hf.field_i;
              }
            } else {
              var2 = ai.field_U;
            }
          } else {
            var2 = DisplacedUnitMarker.field_t[7];
          }
          if (!param0) {
            this.f(73);
          }
          stackIn_54_0 = var2;
          return (String) (stackIn_54_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ig.a((Throwable) (var2), "ci.K(" + param0 + ')');
        }
    }

    private final int d(int param0, int param1, int param2) {
        int discarded$1 = 0;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        boolean stackIn_7_0 = false;
        int stackIn_24_0 = 0;
        int stackIn_27_0 = 0;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_6_0;
        var7 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          if (param1 != -1) {
            discarded$1 = this.d(-119, 51, -109);
          }
          var6 = 0;
          boolean decompiledNaturalLoopExit0 = false;
          while (!(decompiledNaturalLoopExit0 = (!(so.field_a.length > var6)))) {
            stackOut_6_0 = this.c((byte) -103, var6);
            stackIn_27_0 = stackOut_6_0 ? 1 : 0;
            stackIn_7_0 = stackOut_6_0;
            if (var7 == 0) {
              if (stackIn_7_0) {
                var4_int = db.a(true, qf.field_d[var6]);
                var5 = MatchConditionEntry.a(GameEvent.field_q[var6], (byte) 94);
                if (param0 >= var4_int &&
                  param0 <= (32 + var4_int) &&
                  param2 >= var5 &&
                  (32 + var5) >= param2) {
                  stackIn_24_0 = var6;
                  return stackIn_24_0;
                }
              }
              var6++;
              continue;
            }
            break;
          }
          if (decompiledNaturalLoopExit0) {
            stackIn_27_0 = -1;
          }
          return stackIn_27_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw ig.a((Throwable) ((Object) var4), "ci.G(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    private final void a(int param0) {
        boolean discarded$0 = false;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        int var3 = 0;
        var3 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          if (param0 < 30) {
            discarded$0 = this.a((byte) 126, 58);
          }
          if (96 == rs.field_q) {
            if (this.field_d.field_h <= 0) {
              this.field_d.a(1, false);
              if ((var3 != 0) &&
                (this.field_d.field_h != 2)) {
                this.field_d.a(0, false);
              }
            } else {
              if (this.field_d.field_h != 2) {
                this.field_d.a(0, false);
              }
            }
          }
          if (rs.field_q == 97) {
            if (this.field_d.field_h != 1) {
              if (this.field_d.field_h != 2) {
                this.field_d.a(1, false);
                if (var3 != 0) {
                  this.field_d.a(0, false);
                }
              }
            } else {
              this.field_d.a(0, false);
            }
          }
          if (99 == rs.field_q) {
            if (!(this.field_d.field_h >= 0) ||
              !(this.field_d.field_h <= 1)) {
              this.field_d.a(nf.field_Mb, false);
              if (var3 != 0) {
                this.field_d.a(2, false);
              }
            } else {
              this.field_d.a(2, false);
            }
          }
          if (rs.field_q == 98) {
            if (2 != this.field_d.field_h) {
              this.field_d.a(2, false);
              if (var3 != 0) {
                this.field_d.a(nf.field_Mb, false);
              }
            } else {
              this.field_d.a(nf.field_Mb, false);
            }
          }
          this.field_d.c(0);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ig.a((Throwable) ((Object) var2), "ci.AB(" + param0 + ')');
        }
    }

    final void d(boolean param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          this.field_d.field_h = -1;
          if (!param0) {
            this.k(-81);
          }
          b.field_n = null;
          if (this.tutorialStage == 26 ||
            this.tutorialStage == 27 ||
            this.tutorialStage == 28) {
            sj.field_a = null;
          }
          if (this.tutorialStage == 6) {
            wp.field_z = null;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ig.a((Throwable) ((Object) var2), "ci.P(" + param0 + ')');
        }
    }

    private final int a(int param0, boolean param1) {
        int stackIn_8_0 = 0;
        int stackIn_17_0 = 0;
        int stackIn_28_0 = 0;
        int stackIn_30_0 = 0;
        int stackIn_33_0 = 0;
        int stackIn_45_0 = 0;
        int stackIn_51_0 = 0;
        int stackIn_56_0 = 0;
        int stackIn_65_0 = 0;
        int stackIn_70_0 = 0;
        int stackIn_83_0 = 0;
        int stackIn_85_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        try {
          var3_int = MoveEvent.field_D.a(this.tutorialStage, (byte) -118);
          if (this.tutorialStage == 3 &&
            ma.field_Z) {
            var3_int -= 32;
          }
          if (param0 == -1) {
            stackIn_8_0 = var3_int - MoveEvent.field_D.b(this.tutorialStage, (byte) 106);
            return stackIn_8_0;
          }
          if ((!DamageEvent.g(97) ||
            this.tutorialStage != 8) &&
            9 != this.tutorialStage) {
            if (6 == this.tutorialStage &&
              !DamageEvent.g(78)) {
              if (param0 < 2) {
                stackIn_28_0 = var3_int;
                return stackIn_28_0;
              }
              stackIn_30_0 = MoveEvent.field_D.b(this.tutorialStage, (byte) 116) + var3_int;
              return stackIn_30_0;
            }
            if (this.tutorialStage == 11) {
              stackIn_33_0 = MoveEvent.field_D.a(-6, this.tutorialStage) - MoveEvent.field_D.b(this.tutorialStage, (byte) -102);
              return stackIn_33_0;
            }
            if (this.tutorialStage != 13 &&
              this.tutorialStage != 12 &&
              18 != this.tutorialStage &&
              this.tutorialStage != 20) {
              if (this.tutorialStage == 7 &&
                MoveEvent.field_G != null) {
                stackIn_51_0 = MoveEvent.field_G.g(-95, param0);
                return stackIn_51_0;
              }
              if (this.tutorialStage == 7) {
                stackIn_56_0 = 1;
                return stackIn_56_0;
              }
              if (!param1) {
                this.field_d = (dl) null;
              }
              if (this.tutorialStage == 5 &&
                MoveEvent.field_E != null) {
                stackIn_65_0 = MoveEvent.field_E.a(param0, 1084326849);
                return stackIn_65_0;
              }
              if (5 == this.tutorialStage) {
                stackIn_70_0 = 1;
                return stackIn_70_0;
              }
              if (this.tutorialStage == 25 &&
                param0 > -1) {
                var3_int = var3_int + (nr.field_e.a(vd.field_a, 500, 0) >> 1);
              }
              if (19 == this.tutorialStage &&
                -1 < param0) {
                var3_int = var3_int + (nr.field_e.a(mu.field_e, 500, 0) >> 1);
              }
              if (this.tutorialStage != 0) {
                stackIn_85_0 = var3_int + param0 * MoveEvent.field_D.b(this.tutorialStage, (byte) -29);
                return stackIn_85_0;
              }
              stackIn_83_0 = MoveEvent.field_D.b(this.tutorialStage, (byte) -59) * param0 + (var3_int + 5);
              return stackIn_83_0;
            }
            stackIn_45_0 = var3_int;
            return stackIn_45_0;
          }
          stackIn_17_0 = var3_int;
          return stackIn_17_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw ig.a((Throwable) ((Object) var3), "ci.S(" + param0 + ',' + param1 + ')');
        }
    }

    private final void b(byte param0) {
        String stackIn_39_0 = null;
        Object stackIn_60_0 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_38_0;
        int var2_int = 0;
        RuntimeException var2 = null;
        int[] var3 = null;
        int var4 = 0;
        int var5 = 0;
        int[] var6 = null;
        Object var7 = null;
        String[] var8_ref_String__ = null;
        int var8 = 0;
        int[] var9 = null;
        int var10 = 0;
        int var11 = 0;
        String var12 = null;
        int var13 = 0;
        int[] var6Lifetime1;
        int[] var6Lifetime1Lifetime1;
        int var5Lifetime1;
        int var5Lifetime2;
        var13 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          var2_int = og.field_m;
          if (!(0 <= og.field_m) ||
            !(og.field_m < jr.field_h.length)) {
            var2_int = 0;
          }
          var3 = jr.field_h[var2_int];
          if (DamageEvent.g(123)) {
            this.b(320);
            return;
          }
          var4 = -1;
          if (26 != this.tutorialStage) {
            if (this.tutorialStage == 27) {
              var4 = 1;
              if (var13 != 0 &&
                this.tutorialStage == 28) {
                var4 = 2;
                var4 = 0;
              }
            } else {
              if (this.tutorialStage == 28) {
                var4 = 2;
                if (var13 != 0) {
                  var4 = 0;
                }
              }
            }
          } else {
            var4 = 0;
          }
          if (null == sj.field_a) {
            boolean decompiledFrameRemainder2 = true;
            var5 = -1;
            if (this.tutorialStage == 26) {
              var5 = 0;
              decompiledFrameRemainder2 = (var13 != 0);
            }
            if (decompiledFrameRemainder2) {
              if (this.tutorialStage != 27) {
                if (this.tutorialStage == 28) {
                  var5 = 2;
                  if (var13 != 0) {
                    var5 = 1;
                  }
                }
              } else {
                var5 = 1;
              }
            }
            sj.field_a = DeployAction.a(34, var5, 3, 10, 1);
          }
          boolean decompiledFrameRemainder1 = true;
          boolean decompiledFrameCompleted0 = true;
          boolean decompiledFrameRemainder0 = true;
          var5Lifetime1 = 89;
          var6 = field_e;
          fe.c(bj.field_o, db.a(true, var3[4]), MatchConditionEntry.a(var5Lifetime1, (byte) 94), field_e, true);
          var5Lifetime1 = var5Lifetime1 + (8 + rs.field_n.field_H);
          if (!sj.field_a.field_o) {
            var7 = fm.field_c;
            decompiledFrameRemainder0 = (var13 != 0);
          }
          if (decompiledFrameRemainder0) {
            if (sj.field_a.field_s != null) {
              var7 = ed.field_b;
              var8_ref_String__ = sj.field_a.field_s[2];
              var9 = sj.field_a.field_m[2];
              var10 = 0;
              var11 = 0;
              while (var11 < 10) {
                stackOut_38_0 = var8_ref_String__[var11];
                stackIn_60_0 = stackOut_38_0;
                stackIn_39_0 = stackOut_38_0;
                if (var13 != 0) {
                  decompiledFrameCompleted0 = false;
                  break;
                }
                if (stackIn_39_0 != null) {
                  var6Lifetime1 = field_e;
                  var12 = var8_ref_String__[var11];
                  if (gt.a(var12, (byte) 111)) {
                    var10 = 1;
                    var6Lifetime1 = nd.field_b;
                  }
                  this.a((byte) 63, var11, var9[var11] / IntrusiveNode.a(-49, var4), var5Lifetime1, var6Lifetime1, var12);
                  var7 = null;
                }
                var5Lifetime1 += 25;
                var11++;
              }
              if (decompiledFrameCompleted0) {
                if (var10 == 0 &&
                  null != pg.field_d) {
                  var6Lifetime1Lifetime1 = nd.field_b;
                  this.a((byte) 63, -1, pg.field_d.field_g.a(false, var4) / IntrusiveNode.a(108, var4), var5Lifetime1, var6Lifetime1Lifetime1, mv.field_d);
                }
                if (var13 != 0) {
                  var7 = ae.field_s;
                }
              }
            } else {
              var7 = ae.field_s;
            }
          }
          if ((decompiledFrameCompleted0) &&
            (decompiledFrameRemainder1 = (null != var7))) {
            stackIn_60_0 = var7;
          }
          if (decompiledFrameRemainder1) {
            fe.c((String) (stackIn_60_0), SoftwareRaster.field_l / 2, SoftwareRaster.field_g / 2, field_e, true);
          }
          var8 = 30 / ((param0 + 12) / 41);
          var5Lifetime2 = 385 + rs.field_n.field_H;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ig.a((Throwable) ((Object) var2), "ci.MA(" + param0 + ')');
        }
    }

    private final void m(int param0) {
        int discarded$0 = 0;
        int discarded$1 = 0;
        int discarded$2 = 0;
        int discarded$3 = 0;
        rg stackIn_56_0;
        int stackIn_56_1;
        int stackIn_56_2;
        int stackIn_56_3;
        int stackIn_56_4;
        Object stackIn_56_5;
        int stackIn_56_6;
        int stackIn_57_7 = 0;
        RgbSprite stackIn_102_0 = null;
        int stackIn_102_1 = 0;
        int stackIn_102_2 = 0;
        int stackIn_103_3;
        int stackIn_105_0 = 0;
        int stackIn_105_1 = 0;
        int stackIn_111_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int stackIn_105_0Lifetime1;
        int stackIn_105_1Lifetime1;
        int var4Lifetime1;
        int var5Lifetime1;
        var8 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          vi.field_f = null;
          na.field_F = -1;
          var2_int = KingBlackDragonEvent.field_A;
          var3 = wj.field_q;
          if (null == ih.field_p) {
            var3 = (int)((Math.cos((double)wj.field_q * 3.141592653589793 / 256.0) + 1.0) * 128.0);
            var2_int = (int)(128.0 * (Math.cos((double)KingBlackDragonEvent.field_A * 3.141592653589793 / 256.0) - 1.0));
            if (KingBlackDragonEvent.field_A > 0) {
              var2_int = -var2_int;
            }
          }
          if (null == pg.field_d) {
            return;
          }
          fe.b(db.a(true, 40), MatchConditionEntry.a(380, (byte) 94), 123, 40, EffectPresentation.field_j, jh.field_k, 0, 128);
          fe.b(db.a(true, 167), MatchConditionEntry.a(380, (byte) 94), 123, 40, EffectPresentation.field_j, jh.field_k, 0, 128);
          SoftwareRaster.b(db.a(true, 167), MatchConditionEntry.a(380, (byte) 94), 123, 40, 0, 192);
          SoftwareRaster.b(db.a(true, 40), MatchConditionEntry.a(380, (byte) 94), 123, 40, 0, 192);
          if (tg.field_k == 0) {
            fe.b(db.a(true, 167), MatchConditionEntry.a(380, (byte) 94), 123, 40, EffectPresentation.field_j, jh.field_k, 0, 128);
            SoftwareRaster.b(db.a(true, 167), MatchConditionEntry.a(380, (byte) 94), 123, 40, 0, 128);
          }
          if (1 == tg.field_k) {
            fe.b(db.a(true, 40), MatchConditionEntry.a(380, (byte) 94), 123, 40, EffectPresentation.field_j, jh.field_k, 0, 128);
            SoftwareRaster.b(db.a(true, 40), MatchConditionEntry.a(380, (byte) 94), 123, 40, 0, 128);
          }
          boolean decompiledSharedTail2 = !(!wg.a(-33, db.a(true, 171), db.a(true, 286), MatchConditionEntry.a(384, (byte) 94), MatchConditionEntry.a(416, (byte) 94)));
          if (!decompiledSharedTail2) {
            fe.a(db.a(true, 171), MatchConditionEntry.a(384, (byte) 94), 115, 32, DisplacedUnitMarker.field_s, nd.field_b, 0, 0);
            decompiledSharedTail2 = (var8 != 0);
          }
          if (decompiledSharedTail2) {
            fe.a(db.a(true, 171), MatchConditionEntry.a(384, (byte) 94), 115, 32, DisplacedUnitMarker.field_s, field_e, 0, 0);
            na.field_F = 8;
          }
          fe.c(nu.field_w, db.a(true, 228), MatchConditionEntry.a(416, (byte) 94), 0, true);
          boolean decompiledSharedTail1 = !(wg.a(-33, db.a(true, 44), db.a(true, 159), MatchConditionEntry.a(384, (byte) 94), MatchConditionEntry.a(416, (byte) 94)));
          if (!decompiledSharedTail1) {
            fe.a(db.a(true, 44), MatchConditionEntry.a(384, (byte) 94), 115, 32, DisplacedUnitMarker.field_s, field_e, 0, 0);
            na.field_F = 9;
            decompiledSharedTail1 = (var8 != 0);
          }
          if (decompiledSharedTail1) {
            fe.a(db.a(true, 44), MatchConditionEntry.a(384, (byte) 94), 115, 32, DisplacedUnitMarker.field_s, nd.field_b, 0, 0);
          }
          fe.c(fu.field_b, db.a(true, 101), MatchConditionEntry.a(416, (byte) 94), 0, true);
          if (param0 != 100) {
            discarded$0 = this.d(78, 100, 70);
          }
          if (tg.field_k == 1) {
            SoftwareRaster.b(db.a(true, 167), MatchConditionEntry.a(380, (byte) 94), 123, 40, 0, 128);
          }
          if (tg.field_k == 0) {
            SoftwareRaster.b(db.a(true, 40), MatchConditionEntry.a(380, (byte) 94), 123, 40, 0, 128);
          }
          boolean decompiledFrameRemainder0 = true;
          fe.b(db.a(true, 30), MatchConditionEntry.a(60, (byte) 94), 270, 324, EffectPresentation.field_j, jh.field_k, 0, 256);
          if (tg.field_k == 0) {
            SoftwareRaster.f(db.a(true, 34), MatchConditionEntry.a(64, (byte) 94), db.a(true, 296), MatchConditionEntry.a(380, (byte) 94));
            if (vu.field_O == null ||
              ts.field_j == vu.field_O.field_j ||
              vu.field_O == ts.field_j.field_j) {
              if (0 < var2_int) {
                na.field_F = vu.field_O.a(-256 + var2_int, var3, 0, 40, this, na.field_F, ts.field_j.field_e);
              }
              stackIn_56_0 = ts.field_j;
              stackIn_56_1 = var2_int;
              stackIn_56_2 = var3;
              stackIn_56_3 = 0;
              stackIn_56_4 = 40;
              stackIn_56_5 = this;
              stackIn_56_6 = na.field_F;
              if (vu.field_O != null) {
                stackIn_57_7 = vu.field_O.field_e;
              } else {
                stackIn_57_7 = -1;
              }
              na.field_F = ((rg) (Object) stackIn_56_0).a(stackIn_56_1, stackIn_56_2, stackIn_56_3, stackIn_56_4, this, stackIn_56_6, stackIn_57_7);
              if (!(var2_int >= 0)) {
                na.field_F = vu.field_O.a(256 + var2_int, var3, 0, 40, this, na.field_F, vu.field_O.field_e);
                if (var8 != 0) {
                  if (0 < var2_int) {
                    na.field_F = vu.field_O.a(0, var3, var2_int - 256, 40, this, na.field_F, -1);
                  }
                  ts.field_j.a(0, var3, var2_int, param0 ^ 76, this, na.field_F, -1);
                }
              }
            } else {
              if (0 < var2_int) {
                na.field_F = vu.field_O.a(0, var3, var2_int - 256, 40, this, na.field_F, -1);
              }
              ts.field_j.a(0, var3, var2_int, param0 ^ 76, this, na.field_F, -1);
            }
            SoftwareRaster.a();
            fe.b(l.field_e, db.a(true, 165), MatchConditionEntry.a(76, (byte) 94), 230, true);
            fe.a(l.field_e, db.a(true, 165), MatchConditionEntry.a(76, (byte) 94), 230, nd.field_b, true);
            if (var2_int >= 0) {
              discarded$1 = this.a(ts.field_j, true, -125, -var2_int + 256);
            }
            if (var2_int < 0 ||
              var8 != 0) {
              discarded$2 = this.a(vu.field_O, true, -127, -var2_int);
            }
            if (vi.field_f == null) {
              fe.b(ts.field_j.field_k, db.a(true, 165), MatchConditionEntry.a(100, (byte) 94), 230, true);
              fe.a(ts.field_j.field_k, db.a(true, 165), MatchConditionEntry.a(100, (byte) 94), 230, field_e, true);
              decompiledFrameRemainder0 = (var8 != 0);
            }
            if (decompiledFrameRemainder0) {
              fe.b(vi.field_f, db.a(true, 165), MatchConditionEntry.a(100, (byte) 94), 230, true);
              fe.a(vi.field_f, db.a(true, 165), MatchConditionEntry.a(100, (byte) 94), 230, field_e, true);
              decompiledFrameRemainder0 = (var8 != 0);
            }
          }
          if (decompiledFrameRemainder0) {
            SoftwareRaster.f(db.a(true, 34), MatchConditionEntry.a(64, (byte) 94), db.a(true, 296), MatchConditionEntry.a(380, (byte) 94));
            var4 = 0;
            boolean decompiledSharedTail0 = !(hh.field_c > 312);
            if (!decompiledSharedTail0) {
              var4 = ou.field_c * (-312 + hh.field_c) / 291;
              SoftwareRaster.f(db.a(true, 279), MatchConditionEntry.a(67, (byte) 94), 14, 310, 2302755);
              mp.field_Jb.g(db.a(true, 280), MatchConditionEntry.a(68 + ou.field_c, (byte) 94));
              decompiledSharedTail0 = (var8 != 0);
            }
            if (decompiledSharedTail0) {
              SoftwareRaster.f(db.a(true, 279), MatchConditionEntry.a(67, (byte) 94), 14, 310, 1250067);
              mp.field_Jb.g(db.a(true, 280), MatchConditionEntry.a(68, (byte) 94), 128);
            }
            discarded$3 = this.a(0, bm.field_D, true, 0, var4, (byte) 116);
            this.c(0);
            SoftwareRaster.a();
            fe.b(ou.field_j, db.a(true, 165), MatchConditionEntry.a(76, (byte) 94), 230, true);
            fe.a(ou.field_j, db.a(true, 165), MatchConditionEntry.a(76, (byte) 94), 230, nd.field_b, true);
          }
          SoftwareRaster.a();
          fe.b(db.a(true, 310), MatchConditionEntry.a(60, (byte) 94), 300, 80, EffectPresentation.field_j, jh.field_k, 0, 256);
          var4Lifetime1 = 1;
          var5 = 0;
          while (true) {
            if (5 <= var5) {
              stackIn_111_0 = var4Lifetime1;
              break;
            }
            stackIn_111_0 = ~pg.field_d.field_d[var5];
            if (var8 == 0) {
              if (stackIn_111_0 < 0) {
                var6 = pg.field_d.field_a[pg.field_d.field_d[var5]];
                var7 = 0;
                while (var5 > var7) {
                  stackIn_105_0 = pg.field_d.field_d[var7];
                  stackIn_105_1 = pg.field_d.field_d[var5];
                  if (stackIn_105_0 == stackIn_105_1) {
                    var6--;
                  }
                  var7++;
                }
                var4Lifetime1 = 0;
                stackIn_102_0 = BattleCharacter.field_h[uc.spellDefinitions[pg.field_d.field_d[var5]][2]];
                stackIn_102_1 = db.a(true, 310 + var5 * 55 + 20);
                stackIn_102_2 = MatchConditionEntry.a(78, (byte) 94);
                if (var6 > 0) {
                  stackIn_103_3 = 255;
                } else {
                  stackIn_103_3 = 128;
                }
                ((RgbSprite) (Object) stackIn_102_0).g(stackIn_102_1, stackIn_102_2, stackIn_103_3);
              }
              km.field_h[0].g(db.a(true, var5 * 55 + 327), MatchConditionEntry.a(75, (byte) 94));
              stackIn_105_0Lifetime1 = MatchConditionEntry.a(98, (byte) 94);
              stackIn_105_1Lifetime1 = db.a(true, 310 + (var5 * 55 + 40));
              if (ml.a(stackIn_105_0Lifetime1, stackIn_105_1Lifetime1, 22, false)) {
                na.field_F = var5;
              }
              var5++;
              continue;
            }
            break;
          }
          if ((stackIn_111_0 != 0 ||
            br.field_f[82] &&
            !(2 > hi.field_j)) && tg.field_k == 0) {
            if (null == ts.field_j.field_j) {
              rs.field_n.a(ae.field_x, db.a(true, 40), MatchConditionEntry.a(284, (byte) 94), 250, 55, 16777215, -1, var2_int + 256, 1, 1, 0);
            }
            if (null != vu.field_O &&
              vu.field_O.field_j == null) {
              rs.field_n.a(ae.field_x, db.a(true, 40), MatchConditionEntry.a(284, (byte) 94), 250, 55, 16777215, -1, var2_int, 1, 1, 0);
            }
          }
          fe.b(cp.field_c, db.a(true, 460), MatchConditionEntry.a(76, (byte) 94), true);
          fe.c(cp.field_c, db.a(true, 460), MatchConditionEntry.a(76, (byte) 94), nd.field_b, true);
          fe.b(db.a(true, 310), MatchConditionEntry.a(150, (byte) 94), 300, 170, EffectPresentation.field_j, jh.field_k, 0, 256);
          fe.b(db.a(true, 310), MatchConditionEntry.a(330, (byte) 94), 145, 90, EffectPresentation.field_j, nd.field_b, 0, 128);
          fe.b(db.a(true, 320), MatchConditionEntry.a(370, (byte) 94), 125, 42, EffectPresentation.field_j, jh.field_k, 0, 0);
          fe.c(ov.field_f, db.a(true, 382), MatchConditionEntry.a(366, (byte) 94), nd.field_b, true);
          fe.c(dd.a(pg.field_d.a((byte) 48), 82), db.a(true, 382), MatchConditionEntry.a(406, (byte) 94), nd.field_b, true);
          if (2 <= hi.field_j &&
            ln.field_e) {
            rs.field_n.c(pg.field_d.a((byte) 114) + "", db.a(true, 382), MatchConditionEntry.a(369, (byte) 94), 16777215, 0);
          }
          fe.b(db.a(true, 465), MatchConditionEntry.a(330, (byte) 94), 145, 40, EffectPresentation.field_j, jh.field_k, 0, 128);
          fe.b(db.a(true, 465), MatchConditionEntry.a(380, (byte) 94), 145, 40, EffectPresentation.field_j, jh.field_k, 0, 128);
          this.g(ev.field_d, -118);
          var5Lifetime1 = 40 + (nr.field_e.a(ig.field_m) >> 1);
          fm.a(e.field_b, var5Lifetime1, db.a(true, 620 - var5Lifetime1), MatchConditionEntry.a(19, (byte) 94), -104);
          fe.a(ig.field_m, db.a(true, 640 - var5Lifetime1), MatchConditionEntry.a(49, (byte) 94), 16777215, true);
          if (wg.a(-33, db.a(true, 620 - var5Lifetime1), db.a(true, 620), MatchConditionEntry.a(19, (byte) 94), MatchConditionEntry.a(e.field_b[0].field_v + 19, (byte) 94))) {
            na.field_F = 45;
          }
          if (TelepopEvent.field_D) {
            BattleCharacter.field_h[uc.spellDefinitions[ev.field_d][2]].h(12 + AiPlanningStrategy.field_d, ko.field_b + 12);
            km.field_h[0].h(AiPlanningStrategy.field_d + 10, 10 + ko.field_b);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ig.a((Throwable) ((Object) var2), "ci.KB(" + param0 + ')');
        }
    }

    private final String e(int param0, int param1) {
        StringBuilder stackIn_25_0 = null;
        String stackIn_26_1 = null;
        StringBuilder stackIn_33_0 = null;
        String stackIn_34_1 = null;
        String stackIn_66_0 = null;
        RuntimeException decompiledCaughtException = null;
        String var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        var4 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          var3 = DisplacedUnitMarker.field_t[param0];
          if (param0 == 8) {
            var3 = this.f(true);
          }
          if (param0 == 28) {
            var3 = DisplacedUnitMarker.field_t[28] + r.field_B;
          }
          if (param0 == 46) {
            var3 = DisplacedUnitMarker.field_t[28] + mg.field_g;
          }
          if (param0 == 33) {
            if (vg.field_m) {
              var3 = DisplacedUnitMarker.field_t[33] + dn.field_Mb;
              if (var4 != 0) {
                var3 = DisplacedUnitMarker.field_t[33] + qd.field_J;
              }
            } else {
              var3 = DisplacedUnitMarker.field_t[33] + qd.field_J;
            }
          }
          if (36 == param0) {
            stackIn_25_0 = new StringBuilder().append(DisplacedUnitMarker.field_t[36]);
            if (!cu.field_a) {
              stackIn_26_1 = uk.field_k;
            } else {
              stackIn_26_1 = dc.field_s;
            }
            var3 = ((StringBuilder) (Object) stackIn_25_0).append(stackIn_26_1).toString();
          }
          if (param0 == 37) {
            stackIn_33_0 = new StringBuilder().append(DisplacedUnitMarker.field_t[37]);
            if (!uc.field_a) {
              stackIn_34_1 = fk.field_a;
            } else {
              stackIn_34_1 = CombatPresentation.field_N;
            }
            var3 = ((StringBuilder) (Object) stackIn_33_0).append(stackIn_34_1).toString();
          }
          if (param0 == 38) {
            var3 = DisplacedUnitMarker.field_t[38] + cf.field_m[ek.field_d];
          }
          if (param0 == 29) {
            var3 = DisplacedUnitMarker.field_t[29] + h.field_e[t.field_e];
          }
          if (param1 != 29) {
            this.g((byte) 101);
          }
          if (param0 == 9 &&
            rd.field_j != null) {
            if (rd.field_j.field_z) {
              var3 = ac.field_u;
              if ((var4 != 0) &&
                (rd.field_j.battlefield.campaignMission != null)) {
                var3 = jn.field_a;
              }
            } else {
              if (rd.field_j.battlefield.campaignMission != null) {
                var3 = jn.field_a;
              }
            }
          }
          if (47 == param0 &&
            this.tutorialStage == 22) {
            var3 = lb.field_c;
          }
          stackIn_66_0 = var3;
          return stackIn_66_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          throw ig.a((Throwable) ((Object) var3_ref), "ci.C(" + param0 + ',' + param1 + ')');
        }
    }

    final static String c(int param0, int param1, int param2) {
        RuntimeException var3 = null;
        String stackIn_4_0 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != 0) {
            TutorialController.h(-12);
          }
          stackIn_4_0 = "(" + param0 + ", " + param2 + ")";
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw ig.a((Throwable) ((Object) var3), "ci.CB(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    private final void i(int param0) {
        boolean stackIn_18_0 = false;
        boolean stackIn_42_0 = false;
        int stackIn_72_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        String var6 = null;
        String var7 = null;
        int var8 = 0;
        String var6Lifetime1;
        int var2_intLifetime1;
        int var2_intLifetime2;
        int var3Lifetime1;
        int var4Lifetime1;
        var8 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          if (param0 != 589) {
            this.tutorialStage = -35;
          }
          var2_int = 0;
          boolean decompiledNaturalLoopExit0 = false;
          while (!(decompiledNaturalLoopExit0 = (var2_int >= 7))) {
            var3 = 50 + 80 * var2_int + 30;
            var4 = 95;
            stackIn_18_0 = ml.a(MatchConditionEntry.a(var4, (byte) 94), db.a(true, var3), 25, false);
            if (var8 == 0) {
              if (stackIn_18_0) {
                ep.field_o = 0;
                if (li.field_q == -1 + var2_int) {
                  return;
                }
                MoveAttackAction.field_s = li.field_q;
                vs.field_f = tf.field_k;
                li.field_q = -1 + var2_int;
                tf.field_k = 256;
                ub.$cfr$intArgs$a$6d836999ad61(91, im.field_v[11]);
                vf.field_f = jq.field_F;
                kq.field_L = 0;
                jq.field_F = -1;
                ri.field_d = GlobalSpell.field_h;
                b.field_n = null;
                GlobalSpell.field_h = 256;
                this.a((String) null, -1, ve.a((byte) 13, wf.field_q[li.field_q + 1]), (String) null, (byte) -99, GlobalSpell.field_l[1 + li.field_q]);
                return;
              }
              var2_int++;
              continue;
            }
            break;
          }
          if (decompiledNaturalLoopExit0) {
            stackIn_18_0 = wg.a(-33, db.a(true, 30), db.a(true, 300), MatchConditionEntry.a(150, (byte) 94), MatchConditionEntry.a(420, (byte) 94));
          }
          boolean decompiledFrameCompleted0 = true;
          if (stackIn_18_0) {
            var4Lifetime1 = 0;
            while (!(wp.field_H[li.field_q + 1].length <= var4Lifetime1)) {
              var2_intLifetime1 = 135 + (int)(100.0 * Math.sin(2.0 * (3.141592653589793 * (double)var4Lifetime1) / (double)wp.field_H[1 + li.field_q].length)) + 30;
              var3Lifetime1 = (int)(-(Math.cos(3.141592653589793 * (double)var4Lifetime1 * 2.0 / (double)wp.field_H[li.field_q + 1].length) * 100.0)) + 150 + 135;
              stackIn_42_0 = ml.a(MatchConditionEntry.a(var3Lifetime1, (byte) 94), db.a(true, var2_intLifetime1), 25, false);
              if (var8 != 0) {
                decompiledFrameCompleted0 = false;
                break;
              }
              if (!stackIn_42_0) {
                var4Lifetime1++;
                continue;
              }
              ep.field_o = 0;
              if (var4Lifetime1 != jq.field_F) {
                MoveAttackAction.field_s = li.field_q;
                vf.field_f = jq.field_F;
                jq.field_F = var4Lifetime1;
                b.field_n = new la(wp.field_H[li.field_q + 1][jq.field_F]);
                ri.field_d = GlobalSpell.field_h;
                GlobalSpell.field_h = 256;
              } else {
                vf.field_f = jq.field_F;
                MoveAttackAction.field_s = li.field_q;
                ri.field_d = GlobalSpell.field_h;
                kq.field_L = 0;
                jq.field_F = -1;
                b.field_n = null;
                GlobalSpell.field_h = 256;
              }
              if (jq.field_F > -1) {
                var5 = wp.field_H[1 + li.field_q][jq.field_F];
                var6 = "";
                var6Lifetime1 = ut.field_cb[var5];
                var7 = bh.field_M[var5];
                this.a(var7, bw.unitDefinitions[var5][0], ve.a((byte) 13, dn.unitDisplayNames[var5]), this.f(var5, 8), (byte) 116, var6Lifetime1);
              } else {
                this.a((String) null, -1, ve.a((byte) 13, wf.field_q[li.field_q + 1]), (String) null, (byte) -55, GlobalSpell.field_l[li.field_q + 1]);
              }
              ub.$cfr$intArgs$a$6d836999ad61(100, im.field_v[12]);
              return;
            }
          }
          if (decompiledFrameCompleted0) {
            stackIn_42_0 = wg.a(param0 - 622, db.a(true, 469), db.a(true, 606), MatchConditionEntry.a(384, (byte) 94), MatchConditionEntry.a(416, (byte) 94));
          }
          if (stackIn_42_0) {
            if (jq.field_F <= -1) {
              if ((!(li.field_q <= -1)) &&
                (-1 == jq.field_F) &&
                (!(-1 >= li.field_q)) &&
                (pg.field_d.field_b[1 + li.field_q] == 0) &&
                (pg.field_d.a(50, (byte) 103))) {
                vl.field_n.h(32161, 70);
                vl.field_n.b(true, wp.field_H[li.field_q + 1][0]);
                var2_intLifetime2 = 0;
                while (true) {
                  if (var2_intLifetime2 < wp.field_H[li.field_q + 1].length) {
                    stackIn_72_0 = bw.unitDefinitions[wp.field_H[li.field_q + 1][var2_intLifetime2]][11];
                    if (var8 == 0) {
                      if (stackIn_72_0 == 0) {
                        pg.field_d.field_b[li.field_q] = oe.c(pg.field_d.field_b[li.field_q], 1 << var2_intLifetime2);
                      }
                      var2_intLifetime2++;
                      continue;
                    }
                  } else {
                    stackIn_72_0 = 124;
                  }
                  break;
                }
                ub.$cfr$intArgs$a$6d836999ad61(stackIn_72_0, im.field_v[14]);
                if ((var8 != 0) && (jq.field_F > -1 &&
                  0 < pg.field_d.field_b[li.field_q + 1] &&
                  0 == (pg.field_d.field_b[1 + li.field_q] & 1 << jq.field_F) &&
                  pg.field_d.a((byte) 91) >= bw.unitDefinitions[jq.field_F][11])) {
                  vl.field_n.h(32161, 70);
                  vl.field_n.b(true, wp.field_H[1 + li.field_q][jq.field_F]);
                  ub.$cfr$intArgs$a$6d836999ad61(62, im.field_v[14]);
                  pg.field_d.field_b[1 + li.field_q] = oe.c(pg.field_d.field_b[1 + li.field_q], 1 << jq.field_F);
                }
              }
            } else {
              if (jq.field_F > -1 &&
                0 < pg.field_d.field_b[li.field_q + 1] &&
                0 == (pg.field_d.field_b[1 + li.field_q] & 1 << jq.field_F) &&
                pg.field_d.a((byte) 91) >= bw.unitDefinitions[jq.field_F][11]) {
                vl.field_n.h(32161, 70);
                vl.field_n.b(true, wp.field_H[1 + li.field_q][jq.field_F]);
                ub.$cfr$intArgs$a$6d836999ad61(62, im.field_v[14]);
                pg.field_d.field_b[1 + li.field_q] = oe.c(pg.field_d.field_b[1 + li.field_q], 1 << jq.field_F);
              }
            }
          }
          if (fa.field_j != 1 &&
            wg.a(-33, db.a(true, 589), db.a(true, 603), MatchConditionEntry.a(158 + ep.field_o, (byte) 94), MatchConditionEntry.a(150 + (ep.field_o + 24), (byte) 94))) {
            fa.field_j = 1;
            qg.field_u = -ep.field_o - (158 - ko.field_b);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ig.a((Throwable) ((Object) var2), "ci.V(" + param0 + ')');
        }
    }

    private final void e(byte param0) {
        int discarded$1 = 0;
        RuntimeException runtimeException = null;
        int var2_int = 0;
        int var3 = 0;
        boolean stackIn_4_0 = false;
        int stackIn_11_0 = 0;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_3_0;
        var3 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          var2_int = 0;
          boolean decompiledNaturalLoopExit0 = false;
          while (!(decompiledNaturalLoopExit0 = (!(pc.field_k.length > var2_int)))) {
            stackOut_3_0 = wg.a(param0 + 59, db.a(true, 57 * var2_int + 35), db.a(true, 56 + 57 * var2_int + 35), MatchConditionEntry.a(65, (byte) 94), MatchConditionEntry.a(121, (byte) 94));
            stackIn_11_0 = stackOut_3_0 ? 1 : 0;
            stackIn_4_0 = stackOut_3_0;
            if (var3 == 0) {
              if (stackIn_4_0) {
                ah.field_b = var2_int;
              }
              var2_int++;
              continue;
            }
            break;
          }
          if (decompiledNaturalLoopExit0) {
            stackIn_11_0 = param0;
          }
          if (stackIn_11_0 != -92) {
            discarded$1 = this.a(124, 23);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw ig.a((Throwable) ((Object) runtimeException), "ci.D(" + param0 + ')');
        }
    }

    final void a(int param0, boolean param1, int param2) {
        String discarded$1 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        try {
          if (this.field_d.field_h != -1) {
            param2 = this.field_d.field_h;
          }
          this.field_d.a(param2, param1, this.b(ko.field_b, AiPlanningStrategy.field_d, 31), 0);
          vs.field_a = -1;
          lm.field_c = -1;
          ac.field_p = param2;
          pn.field_m = param2;
          pn.field_h = uk.field_n;
          if (this.tutorialStage == 22 ||
            21 == this.tutorialStage) {
            rd.field_j = null;
            System.gc();
            MoveEvent.field_C.c((byte) -120);
            MoveEvent.field_C.b(92);
          }
          if (param0 < 50) {
            discarded$1 = this.e(-53, 92);
          }
          if (this.tutorialStage == 8) {
            this.n(21666);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw ig.a((Throwable) ((Object) var4), "ci.E(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    private final void k(int param0) {
        int fieldTemp$0 = 0;
        RuntimeException runtimeException = null;
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        boolean stackIn_4_0 = false;
        int stackIn_18_0 = 0;
        int stackIn_25_0 = 0;
        int stackIn_43_0 = 0;
        int stackIn_43_1 = 0;
        boolean stackIn_45_0 = false;
        int stackIn_71_0 = 0;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_3_0;
        boolean stackOut_44_0;
        int var7Lifetime1;
        int var7Lifetime2;
        int var8Lifetime1;
        int var9Lifetime1;
        int stackIn_43_0Lifetime1;
        int stackIn_43_1Lifetime1;
        boolean stackIn_45_0Lifetime1;
        boolean stackOut_44_0Lifetime1;
        int var8Lifetime1Lifetime1;
        int var9Lifetime1Lifetime1;
        var10 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          na.field_F = -1;
          fe.b(db.a(true, 30), MatchConditionEntry.a(50, (byte) 94), 580, 90, EffectPresentation.field_j, jh.field_k, 0, 256);
          var2_int = (int)(-(128.0 * Math.cos((double)GlobalSpell.field_h * 3.141592653589793 / 256.0)) + 128.0);
          var3 = (int)(128.0 - Math.cos((double)ri.field_d * 3.141592653589793 / 256.0) * 128.0);
          var4 = (int)(128.0 - 128.0 * Math.cos((double)tf.field_k * 3.141592653589793 / 256.0));
          var5 = (int)(-(128.0 * Math.cos((double)vs.field_f * 3.141592653589793 / 256.0)) + 128.0);
          var6 = -54 / ((-52 - param0) / 42);
          SoftwareRaster.f(db.a(true, 34), MatchConditionEntry.a(54, (byte) 94), db.a(true, 606), MatchConditionEntry.a(136, (byte) 94));
          var7 = 0;
          boolean decompiledNaturalLoopExit0 = false;
          while (!(decompiledNaturalLoopExit0 = (7 <= var7))) {
            var8 = 24 + (30 + var7 * 80);
            var9 = 69;
            stackOut_3_0 = ml.a(MatchConditionEntry.a(26 + var9, (byte) 94), db.a(true, 25 + var8), 25, false);
            stackIn_18_0 = stackOut_3_0 ? 1 : 0;
            stackIn_4_0 = stackOut_3_0;
            if (var10 == 0) {
              if (stackIn_4_0) {
                ue.field_k[var7].f(db.a(true, var8 - 19), MatchConditionEntry.a(-22 + var9, (byte) 94), 128);
                na.field_F = 2 + var7;
              }
              if (~li.field_q == ~(var7 - 1)) {
                ue.field_k[var7].f(db.a(true, var8 - 19), MatchConditionEntry.a(var9 - 22, (byte) 94), 256 - var4);
                ue.field_k[var7].f(db.a(true, -19 + var8), MatchConditionEntry.a(-22 + var9, (byte) 94), 256 - var4);
              }
              if (~(var7 - 1) == ~MoveAttackAction.field_s) {
                ue.field_k[var7].f(db.a(true, -19 + var8), MatchConditionEntry.a(var9 - 22, (byte) 94), 256 - var5);
                ue.field_k[var7].f(db.a(true, -19 + var8), MatchConditionEntry.a(var9 - 22, (byte) 94), 256 - var5);
              }
              hr.field_d[var7].g(db.a(true, var8), MatchConditionEntry.a(var9, (byte) 94));
              gt.field_c[var7].g(db.a(true, -12 + var8), MatchConditionEntry.a(-17 + var9, (byte) 94));
              var7++;
              continue;
            }
            break;
          }
          if (decompiledNaturalLoopExit0) {
            SoftwareRaster.a();
            fe.b(db.a(true, 30), MatchConditionEntry.a(150, (byte) 94), 270, 270, EffectPresentation.field_j, jh.field_k, 0, 256);
            stackIn_18_0 = db.a(true, 34);
          }
          SoftwareRaster.f(stackIn_18_0, MatchConditionEntry.a(154, (byte) 94), db.a(true, 296), MatchConditionEntry.a(416, (byte) 94));
          ce.field_F[li.field_q + 1].f(db.a(true, 36), MatchConditionEntry.a(156, (byte) 94), 256 - var4);
          ce.field_F[1 + MoveAttackAction.field_s].f(db.a(true, 36), MatchConditionEntry.a(156, (byte) 94), 256 - var5);
          if (null != b.field_n) {
            tm.a(db.a(true, 34), MatchConditionEntry.a(154, (byte) 94), db.a(true, 296), MatchConditionEntry.a(416, (byte) 94));
            tm.c();
            stackIn_25_0 = ((pg.field_d.field_b[1 + li.field_q] & 1 << jq.field_F) != 0) ? 0 : 1;
            var7Lifetime1 = stackIn_25_0;
            fieldTemp$0 = kq.field_L;
            kq.field_L = kq.field_L + 1;
            b.field_n.b(2 * hk.field_Jb[b.field_n.field_f] / 3, MatchConditionEntry.a(145, (byte) 94), db.a(true, 165), fieldTemp$0, 98, var7Lifetime1 != 0);
          }
          var7Lifetime2 = 0;
          scanLoop1: while (true) {
            boolean decompiledFrameRemainder0 = true;
            if (var7Lifetime2 < wp.field_H[1 + MoveAttackAction.field_s].length) {
              var8Lifetime1 = 135 + ((int)(Math.sin(3.141592653589793 * (double)var7Lifetime2 * 2.0 / (double)wp.field_H[1 + MoveAttackAction.field_s].length) * (double)(100 + var5 * 150 / 256)) + 30);
              var9Lifetime1 = 285 + (int)(-(Math.cos(3.141592653589793 * (double)var7Lifetime2 * 2.0 / (double)wp.field_H[MoveAttackAction.field_s + 1].length) * (double)(100 + var5 * 150 / 256)));
              stackIn_43_0 = vf.field_f;
              stackIn_43_1 = var7Lifetime2;
              if (var10 != 0) {
                if (stackIn_43_0 < stackIn_43_1) {
                  var8Lifetime1 = 135 + (30 + (int)((double)(100 + var4 * 150 / 256) * Math.sin(2.0 * (3.141592653589793 * (double)var7Lifetime2) / (double)wp.field_H[li.field_q + 1].length)));
                  var9Lifetime1 = 135 + (150 + (int)(-(Math.cos((double)var7Lifetime2 * 3.141592653589793 * 2.0 / (double)wp.field_H[1 + li.field_q].length) * (double)(var4 * 150 / 256 + 100))));
                  stackOut_44_0 = ml.a(MatchConditionEntry.a(var9Lifetime1, (byte) 94), db.a(true, var8Lifetime1), 25, false);
                  stackIn_71_0 = stackOut_44_0 ? 1 : 0;
                  stackIn_45_0 = stackOut_44_0;
                  break scanLoop1;
                }
                decompiledFrameRemainder0 = false;
              }
              else {
                if (stackIn_43_0 == stackIn_43_1) {
                  TeamRoster.field_e.f(db.a(true, var8Lifetime1 - 35), MatchConditionEntry.a(-35 + var9Lifetime1, (byte) 94), var2_int);
                }
                lw.field_ob.d(db.a(true, var8Lifetime1 - 20), MatchConditionEntry.a(-20 + var9Lifetime1, (byte) 94), bo.field_g[MoveAttackAction.field_s + 1]);
                km.field_h[0].g(db.a(true, var8Lifetime1 - 23), MatchConditionEntry.a(-23 + var9Lifetime1, (byte) 94));
                if ((1 << var7Lifetime2 & pg.field_d.field_b[1 + MoveAttackAction.field_s]) > 0) {
                  DeployAction.field_x[wp.field_H[MoveAttackAction.field_s + 1][var7Lifetime2]].g(db.a(true, -19 + var8Lifetime1), MatchConditionEntry.a(-19 + var9Lifetime1, (byte) 94));
                  km.field_h[0].g(db.a(true, var8Lifetime1 - 23), MatchConditionEntry.a(-23 + var9Lifetime1, (byte) 94));
                } else {
                  DeployAction.field_x[wp.field_H[MoveAttackAction.field_s + 1][var7Lifetime2]].g(db.a(true, var8Lifetime1 - 19), MatchConditionEntry.a(var9Lifetime1 - 19, (byte) 94), 0);
                  km.field_h[0].g(db.a(true, -23 + var8Lifetime1), MatchConditionEntry.a(-23 + var9Lifetime1, (byte) 94), 10);
                }
                var7Lifetime2++;
                continue;
              }
            }
            if (decompiledFrameRemainder0) {
              var7Lifetime2 = 0;
              while (true) {
                stackIn_43_0Lifetime1 = ~wp.field_H[1 + li.field_q].length;
                stackIn_43_1Lifetime1 = ~var7Lifetime2;
                if (stackIn_43_0Lifetime1 >= stackIn_43_1Lifetime1) {
                  break;
                }
                var8Lifetime1Lifetime1 = 135 + (30 + (int)((double)(100 + var4 * 150 / 256) * Math.sin(2.0 * (3.141592653589793 * (double)var7Lifetime2) / (double)wp.field_H[li.field_q + 1].length)));
                var9Lifetime1Lifetime1 = 135 + (150 + (int)(-(Math.cos((double)var7Lifetime2 * 3.141592653589793 * 2.0 / (double)wp.field_H[1 + li.field_q].length) * (double)(var4 * 150 / 256 + 100))));
                stackOut_44_0Lifetime1 = ml.a(MatchConditionEntry.a(var9Lifetime1Lifetime1, (byte) 94), db.a(true, var8Lifetime1Lifetime1), 25, false);
                stackIn_71_0 = stackOut_44_0Lifetime1 ? 1 : 0;
                stackIn_45_0Lifetime1 = stackOut_44_0Lifetime1;
                if (var10 != 0) {
                  break scanLoop1;
                }
                if (stackIn_45_0Lifetime1 &&
                  var4 == 0) {
                  TeamRoster.field_e.f(db.a(true, -35 + var8Lifetime1Lifetime1), MatchConditionEntry.a(var9Lifetime1Lifetime1 - 35, (byte) 94), 128);
                  na.field_F = 20 + var7Lifetime2;
                }
                if (~jq.field_F == ~var7Lifetime2) {
                  TeamRoster.field_e.f(db.a(true, var8Lifetime1Lifetime1 - 35), MatchConditionEntry.a(var9Lifetime1Lifetime1 - 35, (byte) 94), var3);
                }
                if (vf.field_f == var7Lifetime2 &&
                  MoveAttackAction.field_s == li.field_q) {
                  TeamRoster.field_e.f(db.a(true, var8Lifetime1Lifetime1 - 35), MatchConditionEntry.a(var9Lifetime1Lifetime1 - 35, (byte) 94), var2_int);
                }
                lw.field_ob.d(db.a(true, var8Lifetime1Lifetime1 - 20), MatchConditionEntry.a(var9Lifetime1Lifetime1 - 20, (byte) 94), bo.field_g[1 + li.field_q]);
                if ((1 << var7Lifetime2 & pg.field_d.field_b[li.field_q + 1]) <= 0) {
                  DeployAction.field_x[wp.field_H[li.field_q + 1][var7Lifetime2]].g(db.a(true, var8Lifetime1Lifetime1 - 19), MatchConditionEntry.a(var9Lifetime1Lifetime1 - 19, (byte) 94), 0);
                  km.field_h[0].g(db.a(true, var8Lifetime1Lifetime1 - 23), MatchConditionEntry.a(var9Lifetime1Lifetime1 - 23, (byte) 94), 10);
                } else {
                  DeployAction.field_x[wp.field_H[li.field_q + 1][var7Lifetime2]].g(db.a(true, var8Lifetime1Lifetime1 - 19), MatchConditionEntry.a(var9Lifetime1Lifetime1 - 19, (byte) 94));
                  km.field_h[0].g(db.a(true, -23 + var8Lifetime1Lifetime1), MatchConditionEntry.a(var9Lifetime1Lifetime1 - 23, (byte) 94));
                }
                var7Lifetime2++;
              }
            }
            SoftwareRaster.a();
            fe.b(db.a(true, 310), MatchConditionEntry.a(150, (byte) 94), 300, 170, EffectPresentation.field_j, jh.field_k, 0, 128);
            fe.b(db.a(true, 310), MatchConditionEntry.a(330, (byte) 94), 145, 90, EffectPresentation.field_j, nd.field_b, 0, 128);
            fe.b(db.a(true, 320), MatchConditionEntry.a(370, (byte) 94), 125, 42, EffectPresentation.field_j, jh.field_k, 0, 0);
            fe.c(ov.field_f, db.a(true, 382), MatchConditionEntry.a(366, (byte) 94), nd.field_b, true);
            fe.c(dd.a(pg.field_d.a((byte) 55), 82), db.a(true, 382), MatchConditionEntry.a(406, (byte) 94), nd.field_b, true);
            stackIn_71_0 = hi.field_j;
            break;
          }
          if (stackIn_71_0 >= 2 &&
            ln.field_e) {
            rs.field_n.c(pg.field_d.a((byte) 96) + "", db.a(true, 382), MatchConditionEntry.a(369, (byte) 94), 16777215, 0);
          }
          fe.b(db.a(true, 465), MatchConditionEntry.a(330, (byte) 94), 145, 40, EffectPresentation.field_j, jh.field_k, 0, 128);
          fe.b(db.a(true, 465), MatchConditionEntry.a(380, (byte) 94), 145, 40, EffectPresentation.field_j, jh.field_k, 0, 128);
          if (jq.field_F <= -1) {
            this.d((byte) -35, 1 + li.field_q);
            if (var10 == 0) {
              return;
            }
          }
          this.a(li.field_q + 1, jq.field_F, -104);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw ig.a((Throwable) ((Object) runtimeException), "ci.T(" + param0 + ')');
        }
    }

    private final void a(int[] param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, String param8) {
        String stackIn_19_0 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_25_2 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_29_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var10_int = 0;
        RuntimeException var10 = null;
        int[] var11 = null;
        int var12 = 0;
        String var13 = null;
        String var13Lifetime1;
        String var13Lifetime2;
        String var13Lifetime3;
        String var13Lifetime4;
        String var13Lifetime5;
        try {
          var10_int = og.field_m;
          if (param6 != 310) {
            this.b(true, 56, 5);
          }
          if (!(og.field_m >= 0) ||
            !(og.field_m < jr.field_h.length)) {
            var10_int = 0;
          }
          var11 = jr.field_h[var10_int];
          var12 = param1 + param5 + param7;
          if (param2 != -1) {
            fe.b(param2 + 1 + ". ", db.a(true, 80), MatchConditionEntry.a(param3, (byte) 94), param0, true);
          }
          if (var12 != 0) {
            param5 = (200 * param5 + var12) / (2 * var12);
            param1 = (var12 + param1 * 200) / (2 * var12);
            param7 = (var12 + 200 * param7) / (var12 * 2);
          }
          var13 = param8;
          fe.a(var13, db.a(true, 80), MatchConditionEntry.a(param3, (byte) 94), param0, true);
          var13Lifetime1 = Integer.toString(param4);
          fe.c(var13Lifetime1, db.a(true, var11[0]), MatchConditionEntry.a(param3, (byte) 94), param0, true);
          if (50 > var12) {
            stackIn_19_0 = Integer.toString(var12);
          } else {
            stackIn_19_0 = "50+";
          }
          var13Lifetime2 = stackIn_19_0;
          fe.c(var13Lifetime2, db.a(true, var11[1]), MatchConditionEntry.a(param3, (byte) 94), param0, true);
          var13Lifetime3 = param1 + "%";
          fe.c(var13Lifetime3, db.a(true, var11[2]), MatchConditionEntry.a(param3, (byte) 94), param0, true);
          var13Lifetime4 = param5 + "%";
          fe.c(var13Lifetime4, db.a(true, var11[3]), MatchConditionEntry.a(param3, (byte) 94), param0, true);
          var13Lifetime5 = param7 + "%";
          fe.c(var13Lifetime5, db.a(true, var11[4]), MatchConditionEntry.a(param3, (byte) 94), param0, true);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var10 = decompiledCaughtException;
          stackIn_24_0 = var10;
          stackIn_24_1 = new StringBuilder().append("ci.U(");
          if (param0 == null) {
            stackIn_25_2 = "null";
          } else {
            stackIn_25_2 = "{...}";
          }
          stackIn_28_1 = ((StringBuilder) (Object) stackIn_24_1).append(stackIn_25_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',').append(param7).append(',');
          if (param8 == null) {
            stackIn_29_2 = "null";
          } else {
            stackIn_29_2 = "{...}";
          }
          throw ig.a((Throwable) ((Object) stackIn_24_0), ((StringBuilder) (Object) stackIn_28_1).append(stackIn_29_2).append(')').toString());
        }
    }

    TutorialController(int param0) {
        int stackIn_20_0 = 0;
        int stackIn_20_1 = 0;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int[] var4_ref_int__ = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        String var7 = null;
        int var8 = 0;
        int var9 = 0;
        var9 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          this.tutorialStage = param0;
          this.field_d = new dl(MoveEvent.field_y[this.tutorialStage].length);
          if (0 == this.tutorialStage) {
            this.field_d.field_h = 2;
          }
          if (this.tutorialStage == 7) {
            this.field_d.field_h = 1;
          }
          if (this.tutorialStage == 8) {
            this.n(21666);
          }
          var2_int = MoveEvent.field_D.a((byte) -55, this.tutorialStage) - MoveEvent.field_D.b(this.tutorialStage, 29);
          var3 = var2_int;
          var4_ref_int__ = MoveEvent.field_y[this.tutorialStage];
          var5 = 0;
          boolean decompiledNaturalLoopExit0 = false;
          while (!(decompiledNaturalLoopExit0 = (var4_ref_int__.length <= var5))) {
            var6 = var4_ref_int__[var5];
            var7 = this.e(var6, 29);
            var8 = nr.field_e.a(var7) / 2 + 20;
            stackIn_20_0 = var2_int;
            stackIn_20_1 = var8;
            if (var9 == 0) {
              if (stackIn_20_0 < stackIn_20_1) {
                var2_int = var8;
              }
              var5++;
              continue;
            }
            break;
          }
          if (decompiledNaturalLoopExit0) {
            stackIn_20_0 = -var3;
            stackIn_20_1 = var2_int;
          }
          var4 = stackIn_20_0 + stackIn_20_1;
          MoveEvent.field_D.a(-1, MoveEvent.field_D.b(this.tutorialStage, 29) - var4 / 2, this.tutorialStage);
          MoveEvent.field_D.b(-128, MoveEvent.field_D.a((byte) -106, this.tutorialStage) + var4 / 2, this.tutorialStage);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ig.a((Throwable) ((Object) var2), "ci.<init>(" + param0 + ')');
        }
    }

    private final void c(int param0) {
        int var2_int = 0;
        int var3 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        var3 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          boolean decompiledFrameRemainder0 = true;
          if (fa.field_j == 2) {
            if (ro.field_ub != 1) {
              fa.field_j = -1;
              decompiledFrameRemainder0 = (var3 != 0);
            }
            if (decompiledFrameRemainder0) {
              var2_int = ko.field_b + (-qg.field_u - 68);
              if (var2_int < 0) {
                ou.field_c = 0;
                if (var3 != 0) {
                  if (291 >= var2_int) {
                    ou.field_c = var2_int;
                    ou.field_c = 291;
                  } else {
                    ou.field_c = 291;
                  }
                }
              } else {
                if (291 >= var2_int) {
                  ou.field_c = var2_int;
                  if (var3 != 0) {
                    ou.field_c = 291;
                  }
                } else {
                  ou.field_c = 291;
                }
              }
            }
          }
          if (param0 != 0) {
            this.d((byte) -26, 52);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ig.a((Throwable) ((Object) var2), "ci.WA(" + param0 + ')');
        }
    }

    private final boolean a(byte param0, int param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (7 == this.tutorialStage) {
            if (param1 == 0 &&
              ij.field_y == 0) {
              return false;
            }
            if (param1 == 2 &&
              -1 + PortalLossCondition.field_c.length == ij.field_y) {
              return false;
            }
          }
          var3_int = 6 % ((-40 - param0) / 49);
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw ig.a((Throwable) ((Object) var3), "ci.W(" + param0 + ',' + param1 + ')');
        }
    }

    final void d(byte param0) {
        oo stackIn_10_0 = null;
        boolean stackIn_11_1 = false;
        boolean stackIn_86_0 = false;
        boolean stackIn_95_0 = false;
        boolean stackIn_106_0 = false;
        boolean stackIn_118_0 = false;
        boolean stackIn_129_0 = false;
        boolean stackIn_141_0 = false;
        boolean stackIn_152_0 = false;
        int stackIn_247_0 = 0;
        int stackIn_248_1 = 0;
        int stackIn_260_0 = 0;
        int stackIn_261_1 = 0;
        rg stackIn_284_0 = null;
        rg stackIn_284_1 = null;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int[] var3_ref_int__ = null;
        rg var3_ref_rg = null;
        int var3 = 0;
        int var4 = 0;
        int var2_intLifetime1;
        var4 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          if (cd.c(9501)) {
            return;
          }
          if (this.tutorialStage == 15) {
            stackIn_10_0 = br.field_a;
            stackIn_11_1 = !(GlobalSpell.a(false));
            var2_int = ((oo) (Object) stackIn_10_0).a(stackIn_11_1, -121);
            if (var2_int == 3) {
              if (null != wq.field_a) {
                ck.b(-99);
              }
              rf.a(32767, CombatEvent.d((byte) 65));
            }
            if (var2_int == 1) {
              CipherPacketBuffer.a(false, 0, 1, jt.field_a);
            }
            if (var2_int == 2) {
              CipherPacketBuffer.a(true, 0, 1, jt.field_a);
            }
            return;
          }
          var2_intLifetime1 = 69 / ((param0 + 36) / 37);
          if (!SpellCastAction.field_t &&
            !dn.field_Qb &&
            null == mu.field_a) {
            while (true) {
              if (Unit.i((byte) 102)) {
                if (gu.a(121) &&
                  var4 == 0) {
                  continue;
                }
                if (2 <= hi.field_j &&
                  rs.field_q == 1 &&
                  br.field_f[82]) {
                  RevivalEvent.d((byte) 122);
                  var3_ref_int__ = ei.field_e;
                  var3_ref_int__[0] = oe.c(var3_ref_int__[0], 2);
                  ai.field_P.addLast((byte) -119, (IntrusiveNode) (new jg(0)));
                  UnitInfoPopup.field_u.addLast((byte) -119, (IntrusiveNode) (new iw(0, 255, 0, 0, 0, 0)));
                }
                if (rs.field_q == 13) {
                  boolean decompiledSharedTail0 = (1 != this.tutorialStage &&
                    this.tutorialStage != 2 &&
                    this.tutorialStage != 24 &&
                    this.tutorialStage != 3 &&
                    this.tutorialStage != 4);
                  if (!decompiledSharedTail0) {
                    CipherPacketBuffer.a(false, -1, 1, 0);
                    decompiledSharedTail0 = (var4 != 0);
                  }
                  if ((decompiledSharedTail0) && (jt.field_a != 10 &&
                    22 != jt.field_a)) {
                    CipherPacketBuffer.a(false, ui.field_c, 1, ui.field_c);
                  }
                }
                if (rs.field_q == 11 &&
                  2 <= hi.field_j) {
                  stackIn_86_0 = !(jv.field_a);
                  jv.field_a = stackIn_86_0;
                  return;
                }
                if (rs.field_q == 12) {
                  stackIn_95_0 = !(ln.field_e);
                  ln.field_e = stackIn_95_0;
                }
                if (11 == rs.field_q &&
                  2 <= hi.field_j) {
                  stackIn_106_0 = !(jv.field_a);
                  jv.field_a = stackIn_106_0;
                  return;
                }
                if (12 == rs.field_q &&
                  hi.field_j >= 2) {
                  stackIn_118_0 = !(ln.field_e);
                  ln.field_e = stackIn_118_0;
                }
                if (rs.field_q == 11 &&
                  hi.field_j >= 2) {
                  stackIn_129_0 = !(jv.field_a);
                  jv.field_a = stackIn_129_0;
                  return;
                }
                if (12 == rs.field_q &&
                  hi.field_j >= 2) {
                  stackIn_141_0 = !(ln.field_e);
                  ln.field_e = stackIn_141_0;
                }
                if (rs.field_q == 11 &&
                  hi.field_j >= 2) {
                  stackIn_152_0 = !(jv.field_a);
                  jv.field_a = stackIn_152_0;
                  return;
                }
                if (rs.field_q == 80 &&
                  this.tutorialStage == 12 &&
                  tf.field_k == 0) {
                  MoveAttackAction.field_s = li.field_q;
                  vf.field_f = jq.field_F;
                  ri.field_d = GlobalSpell.field_h;
                  jq.field_F = -1;
                  li.field_q = li.field_q + 1;
                  GlobalSpell.field_h = 256;
                  li.field_q = li.field_q % 7;
                  kq.field_L = 0;
                  tf.field_k = 256;
                  b.field_n = null;
                  vs.field_f = 0;
                  if (li.field_q == 6) {
                    li.field_q = -1;
                  }
                  ub.$cfr$intArgs$a$6d836999ad61(126, im.field_v[11]);
                  if (var4 == 0) {
                    continue;
                  }
                }
                this.j(108);
                if (this.field_d.field_h == -1) {
                  continue;
                }
                this.a(false, 0, this.field_d.field_h);
                if (var4 == 0) {
                  continue;
                }
              } else {
                ac.field_p = this.b(ko.field_b, AiPlanningStrategy.field_d, 31);
                this.field_d.a(0, this.b(TeleportAction.field_z, iu.field_t, 31), ac.field_p);
              }
              if (~pn.field_m != ~ac.field_p) {
                ub.$cfr$intArgs$a$6d836999ad61(90, im.field_v[1]);
                pn.field_m = ac.field_p;
              }
              if (this.field_d.field_h != -1) {
                this.a(true, 0, this.field_d.field_h);
              }
              if (DeployEvent.field_A == 1 &&
                this.tutorialStage == 12) {
                this.i(589);
              }
              if ((DeployEvent.field_A == 1 ||
                DeployEvent.field_A == 2) &&
                this.tutorialStage == 18) {
                this.c(true);
              }
              if (DeployEvent.field_A == 1 &&
                this.tutorialStage == 20) {
                this.e((byte) -92);
              }
              if (DeployEvent.field_A != 1) {
                break;
              }
              if (this.tutorialStage != 13) {
                break;
              }
              this.d(330);
              break;
            }
          }
          boolean decompiledFrameRemainder3 = true;
          if (this.tutorialStage != 16) {
            if (this.tutorialStage != 8 &&
              this.tutorialStage != 9 &&
              jt.field_a != 10) {
              if (7 == this.tutorialStage) {
                this.e(-48);
                decompiledFrameRemainder3 = (var4 != 0);
              }
              if (decompiledFrameRemainder3) {
                if (22 != this.tutorialStage &&
                  this.tutorialStage != 21) {
                  if (this.tutorialStage == 18) {
                    if (GameplayController.field_J != na.field_F) {
                      ub.$cfr$intArgs$a$6d836999ad61(37, im.field_v[1]);
                      GameplayController.field_J = na.field_F;
                    }
                    if (KingBlackDragonEvent.field_A > 0) {
                      stackIn_247_0 = KingBlackDragonEvent.field_A;
                      if (ih.field_p == null) {
                        stackIn_248_1 = 8;
                      } else {
                        stackIn_248_1 = 16;
                      }
                      KingBlackDragonEvent.field_A = stackIn_247_0 - stackIn_248_1;
                      if (KingBlackDragonEvent.field_A < 0) {
                        KingBlackDragonEvent.field_A = 0;
                      }
                    }
                    if (0 < wj.field_q) {
                      wj.field_q = wj.field_q - 16;
                    }
                    if (0 > KingBlackDragonEvent.field_A) {
                      stackIn_260_0 = KingBlackDragonEvent.field_A;
                      if (null != ih.field_p) {
                        stackIn_261_1 = 16;
                      } else {
                        stackIn_261_1 = 8;
                      }
                      KingBlackDragonEvent.field_A = stackIn_260_0 + stackIn_261_1;
                      if (KingBlackDragonEvent.field_A > 0) {
                        KingBlackDragonEvent.field_A = 0;
                      }
                    }
                    boolean decompiledFrameRemainder2 = true;
                    if (0 == KingBlackDragonEvent.field_A) {
                      vu.field_O = null;
                      if (ih.field_p != null) {
                        if (ts.field_j == ih.field_p) {
                          ih.field_p = null;
                          decompiledFrameRemainder2 = (var4 != 0);
                        }
                        if (decompiledFrameRemainder2) {
                          var3_ref_rg = ih.field_p;
                          while (true) {
                            boolean decompiledFrameRemainder1 = true;
                            boolean decompiledFrameRemainder0 = true;
                            if (var3_ref_rg != null) {
                              stackIn_284_0 = var3_ref_rg.field_j;
                              stackIn_284_1 = ts.field_j;
                              decompiledFrameRemainder0 = (var4 == 0);
                              if ((decompiledFrameRemainder0) &&
                                (stackIn_284_0 != stackIn_284_1)) {
                                var3_ref_rg = var3_ref_rg.field_j;
                                continue;
                              }
                            }
                            if ((decompiledFrameRemainder0) &&
                              (decompiledFrameRemainder1 = (var3_ref_rg != null))) {
                              vu.field_O = ts.field_j;
                              ts.field_j = var3_ref_rg;
                              KingBlackDragonEvent.field_A = 240;
                              stackIn_284_0 = ts.field_j;
                              stackIn_284_1 = ih.field_p;
                            }
                            if (decompiledFrameRemainder1) {
                              if (stackIn_284_0 != stackIn_284_1) {
                                ub.$cfr$intArgs$a$6d836999ad61(98, MoveAttackRequest.field_v[44]);
                                if (var4 == 0) {
                                  break;
                                }
                              }
                              ih.field_p = null;
                              ub.$cfr$intArgs$a$6d836999ad61(83, MoveAttackRequest.field_v[42]);
                              if (var4 == 0) {
                                break;
                              }
                            }
                            vu.field_O = ts.field_j;
                            ts.field_j = ts.field_j.field_j;
                            KingBlackDragonEvent.field_A = -240;
                            ub.$cfr$intArgs$a$6d836999ad61(41, MoveAttackRequest.field_v[45]);
                            break;
                          }
                        }
                      }
                    }
                    decompiledFrameRemainder3 = !(!TelepopEvent.field_D);
                    if ((decompiledFrameRemainder3) &&
                      (decompiledFrameRemainder3 = (ro.field_ub != 1))) {
                      this.a(false);
                      decompiledFrameRemainder3 = (var4 != 0);
                    }
                  }
                  if (decompiledFrameRemainder3) {
                    if (12 != this.tutorialStage) {
                      if (5 == this.tutorialStage) {
                        this.g((byte) 123);
                        decompiledFrameRemainder3 = (var4 != 0);
                      }
                      if ((decompiledFrameRemainder3) &&
                        (decompiledFrameRemainder3 = (this.tutorialStage == 13))) {
                        if (na.field_F != GameplayController.field_J) {
                          ub.$cfr$intArgs$a$6d836999ad61(65, im.field_v[1]);
                          GameplayController.field_J = na.field_F;
                        }
                        ul.a((byte) -102, 224, db.a(true, 380), ro.field_ub, ko.field_b, 352, AiPlanningStrategy.field_d, MatchConditionEntry.a(60, (byte) 94));
                        decompiledFrameRemainder3 = (var4 != 0);
                      }
                    }
                    if (decompiledFrameRemainder3) {
                      if (b.field_n != null) {
                        b.field_n.a((byte) 118);
                      }
                      var3 = 8;
                      if (tf.field_k > 0) {
                        tf.field_k = tf.field_k - var3;
                      }
                      if (256 > vs.field_f) {
                        vs.field_f = vs.field_f + var3;
                      }
                      if (ri.field_d < 256) {
                        ri.field_d = ri.field_d + var3;
                      }
                      if (GlobalSpell.field_h > 0) {
                        GlobalSpell.field_h = GlobalSpell.field_h - var3;
                      }
                      if (GameplayController.field_J != na.field_F) {
                        ub.$cfr$intArgs$a$6d836999ad61(116, im.field_v[1]);
                        GameplayController.field_J = na.field_F;
                      }
                      decompiledFrameRemainder3 = (var4 != 0);
                    }
                  }
                }
                if (decompiledFrameRemainder3) {
                  MoveEvent.field_C.f((byte) 124);
                  if (var4 != 0) {
                    this.c((byte) -120);
                    if (hi.field_i != null) {
                      hi.field_i.a(false);
                    }
                  }
                }
              }
            } else {
              this.c((byte) -120);
              if ((var4 != 0) &&
                (hi.field_i != null)) {
                hi.field_i.a(false);
              }
            }
          } else {
            if (hi.field_i != null) {
              hi.field_i.a(false);
            }
          }
          if (2 == this.tutorialStage &&
            null != rd.field_j &&
            rd.field_j.field_lb &&
            0 <= rd.field_j.field_q &&
            rd.field_j.battlefield != null &&
            rd.field_j.battlefield.field_X) {
            CipherPacketBuffer.a(false, 3, 1, 0);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ig.a((Throwable) ((Object) var2), "ci.DB(" + param0 + ')');
        }
    }

    private final boolean c(byte param0, int param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        boolean stackIn_7_0 = false;
        RuntimeException decompiledCaughtException = null;
        try {
          var3_int = 83 % ((44 - param0) / 33);
          stackIn_7_0 = (this.b(-82, param1)) || (oh.field_G[param1]);
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw ig.a((Throwable) ((Object) var3), "ci.Q(" + param0 + ',' + param1 + ')');
        }
    }

    private final int a(int param0, rg param1, boolean param2, int param3, int param4, byte param5) {
        boolean stackIn_7_0 = false;
        int stackIn_23_0 = 0;
        int stackIn_40_0;
        int stackIn_40_1;
        int stackIn_40_2;
        int stackIn_40_3;
        int stackIn_41_4 = 0;
        int stackIn_48_0 = 0;
        int stackIn_58_0 = 0;
        int stackIn_60_0 = 0;
        RuntimeException stackIn_64_0 = null;
        StringBuilder stackIn_64_1 = null;
        String stackIn_65_2 = null;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_6_0;
        int var7_int = 0;
        RuntimeException var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var7_intLifetime1;
        int var8Lifetime1;
        int var9Lifetime1;
        var10 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          boolean decompiledFrameCompleted1 = true;
          if (param1.field_a != null) {
            var7_int = 0;
            while (!(var7_int >= param1.field_a.length)) {
              stackOut_6_0 = param2;
              stackIn_23_0 = stackOut_6_0 ? 1 : 0;
              stackIn_7_0 = stackOut_6_0;
              if (var10 != 0) {
                decompiledFrameCompleted1 = false;
                break;
              }
              if (stackIn_7_0) {
                param0 += 40;
                if (0 != (3 & param3)) {
                  param3 = param3 + (4 - (param3 & 3));
                }
                var8 = -param4 + param0 - (-7 - 70 * (param3 >> 2));
                if (0 < var8 &&
                  var8 < 354) {
                  fe.c(param1.field_a[var7_int].field_k, db.a(true, 152), MatchConditionEntry.a(var8 + 55, (byte) 94), field_e, true);
                  var9 = -30 + (270 + (-(nr.field_e.a(param1.field_a[var7_int].field_k) >> 1) - 25) >> 1);
                  fm.a(wc.field_Q, var9, db.a(true, 50), MatchConditionEntry.a(38 + var8, (byte) 94), -66);
                  fm.a(wc.field_Q, var9, db.a(true, 255 - var9), MatchConditionEntry.a(var8 + 38, (byte) 94), -126);
                }
              }
              param3 = this.a(param0, param1.field_a[var7_int], false, param3, param4, (byte) 126);
              var7_int++;
            }
          }
          if (decompiledFrameCompleted1) {
            stackIn_23_0 = -15 % ((param5 - 67) / 48);
          }
          boolean decompiledFrameCompleted0 = true;
          var7_intLifetime1 = stackIn_23_0;
          if (param1.field_i != null) {
            var8Lifetime1 = 0;
            while (!(var8Lifetime1 >= param1.field_i.length)) {
              stackIn_48_0 = pg.field_d.field_a[param1.field_i[var8Lifetime1]];
              if (var10 != 0) {
                decompiledFrameCompleted0 = false;
                break;
              }
              if (stackIn_48_0 > 0) {
                var9Lifetime1 = -param4 + (param3 >> 2) * 70 + 7 + param0;
                if (var9Lifetime1 > -70 &&
                  var9Lifetime1 < 324) {
                  stackIn_40_0 = db.a(true, 58 * (3 & param3) + 44);
                  stackIn_40_1 = MatchConditionEntry.a(-3 + (var9Lifetime1 + 60), (byte) 94);
                  stackIn_40_2 = 51;
                  stackIn_40_3 = 63;
                  if (param1.field_i[var8Lifetime1] != ev.field_d) {
                    stackIn_41_4 = 2236962;
                  } else {
                    stackIn_41_4 = 5592405;
                  }
                  SoftwareRaster.f(stackIn_40_0, stackIn_40_1, stackIn_40_2, stackIn_40_3, stackIn_41_4);
                  BattleCharacter.field_h[uc.spellDefinitions[param1.field_i[var8Lifetime1]][2]].g(db.a(true, 50 + (param3 & 3) * 58), MatchConditionEntry.a(63 + var9Lifetime1, (byte) 94));
                  km.field_h[0].g(db.a(true, (3 & param3) * 58 + 47), MatchConditionEntry.a(60 + var9Lifetime1, (byte) 94));
                  en.field_E.c(Integer.toString(pg.field_d.field_a[param1.field_i[var8Lifetime1]]), db.a(true, 70 + (3 & param3) * 58), MatchConditionEntry.a(var9Lifetime1 + 60 + 55, (byte) 94), 16777215, 0);
                  if (ml.a(MatchConditionEntry.a(60 + var9Lifetime1 + 23, (byte) 94), db.a(true, 70 + (3 & param3) * 58), 22, false)) {
                    na.field_F = 200 + param1.field_i[var8Lifetime1];
                  }
                }
                param3++;
              }
              var8Lifetime1++;
            }
          }
          if (decompiledFrameCompleted0) {
            stackIn_48_0 = param2 ? 1 : 0;
          }
          if (stackIn_48_0 != 0) {
            if (param3 == 0) {
              rs.field_n.a(ar.field_x, db.a(true, 50), MatchConditionEntry.a(70 + param0, (byte) 94), 220, 324 - (param0 + 20), 16777215, -1, 1, 1, 0);
            }
            stackIn_58_0 = ((3 & param3) != 0) ? 70 : 0;
            hh.field_c = stackIn_58_0 + (param0 + 70 * (param3 >> 2));
          }
          stackIn_60_0 = param3;
          return stackIn_60_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_64_0 = var7;
          stackIn_64_1 = new StringBuilder().append("ci.JA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_65_2 = "null";
          } else {
            stackIn_65_2 = "{...}";
          }
          throw ig.a((Throwable) ((Object) stackIn_64_0), ((StringBuilder) (Object) stackIn_64_1).append(stackIn_65_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(')').toString());
        }
    }

    private final void j(int param0) {
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var2_intLifetime1;
        var3 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          var2_int = 17 % ((26 - param0) / 35);
          if (rs.field_q == 84 &&
            br.field_f[86]) {
            if (null != wq.field_a) {
              ck.b(-83);
              if (var3 == 0) {
                return;
              }
            }
            ke.field_a = false;
            AiPlanningStrategy.a(false, 8028);
            return;
          }
          boolean decompiledFrameRemainder0 = true;
          if (jt.field_a != 7) {
            if (jt.field_a == 22 ||
              this.tutorialStage == 21) {
              MoveEvent.field_C.a(rs.field_q, (int) ui.field_i, 2);
              decompiledFrameRemainder0 = (var3 != 0);
            }
            if (decompiledFrameRemainder0) {
              if (jt.field_a == 6 &&
                !DamageEvent.g(79)) {
                this.a(98);
                decompiledFrameRemainder0 = (var3 != 0);
              }
              if (decompiledFrameRemainder0) {
                if (jt.field_a != 12 &&
                  jt.field_a != 20 &&
                  jt.field_a != 18) {
                  if (8 != this.tutorialStage &&
                    this.tutorialStage != 9) {
                    this.field_d.b((byte) -120);
                    if (var3 != 0) {
                      this.field_d.a(0, (byte) -7);
                      this.field_d.a(1, (byte) 127);
                      this.f((byte) 100);
                    }
                  } else {
                    this.field_d.a(0, (byte) -7);
                    if (var3 != 0) {
                      this.field_d.a(1, (byte) 127);
                      this.f((byte) 100);
                    }
                  }
                } else {
                  this.field_d.a(1, (byte) 127);
                  if (var3 != 0) {
                    this.f((byte) 100);
                  }
                }
              }
            }
          } else {
            this.f((byte) 100);
          }
          if (0 > this.field_d.field_h) {
            return;
          }
          var2_intLifetime1 = MoveEvent.field_y[this.tutorialStage][this.field_d.field_h];
          if (32 != var2_intLifetime1 &&
            var2_intLifetime1 != 31) {
            return;
          }
          if (2 > hi.field_j) {
            if (rs.field_q == 98) {
              this.field_d.field_h = -1 + this.field_d.field_k;
            }
            if (rs.field_q == 99) {
              this.field_d.field_h = 2;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ig.a((Throwable) ((Object) var2), "ci.DA(" + param0 + ')');
        }
    }

    private final void a(int param0, int param1, int param2) {
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        var6 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          var4_int = wp.field_H[param0][param1];
          var5 = 69 % ((14 - param2) / 40);
          this.b(true);
          if (bw.unitDefinitions[var4_int][11] <= 0) {
            if ((pg.field_d.field_b[param0] & 1 << param1) != 0) {
              fe.c(iq.field_b, db.a(true, 537), MatchConditionEntry.a(366, (byte) 94), nd.field_b, true);
              if (var6 == 0) {
                return;
              }
            }
            fe.c(IntrusiveNode.field_d, db.a(true, 537), MatchConditionEntry.a(366, (byte) 94), nd.field_b, true);
            if (var6 == 0) {
              return;
            }
          }
          if (0 == (pg.field_d.field_b[param0] & 1 << param1)) {
            fe.c(this.c(-38, bw.unitDefinitions[var4_int][11]), db.a(true, 537), MatchConditionEntry.a(366, (byte) 94), nd.field_b, true);
            if (pg.field_d.field_b[param0] == 0) {
              return;
            }
            if (pg.field_d.a((byte) 78) < bw.unitDefinitions[var4_int][11]) {
              return;
            }
            boolean decompiledSharedTail0 = !(wg.a(-33, db.a(true, 469), db.a(true, 606), MatchConditionEntry.a(384, (byte) 94), MatchConditionEntry.a(416, (byte) 94)));
            if (!decompiledSharedTail0) {
              fe.a(db.a(true, 469), MatchConditionEntry.a(384, (byte) 94), 137, 32, DisplacedUnitMarker.field_s, field_e, 0, 0);
              na.field_F = 52;
              decompiledSharedTail0 = (var6 != 0);
            }
            if (decompiledSharedTail0) {
              fe.a(db.a(true, 469), MatchConditionEntry.a(384, (byte) 94), 137, 32, DisplacedUnitMarker.field_s, nd.field_b, 0, 0);
            }
            fe.c(wv.field_e, db.a(true, 537), MatchConditionEntry.a(416, (byte) 94), 0, true);
            if (var6 == 0) {
              return;
            }
          }
          fe.c(iq.field_b, db.a(true, 537), MatchConditionEntry.a(366, (byte) 94), nd.field_b, true);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw ig.a((Throwable) ((Object) var4), "ci.HB(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    private final void g(int param0, int param1) {
        int stackIn_47_0 = 0;
        int stackIn_47_1 = 0;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var4Lifetime1;
        var7 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          this.b(true);
          if (ev.field_d < 0) {
            return;
          }
          var3_int = 44 % ((-32 - param1) / 61);
          if (tg.field_k == 0) {
            var4 = uc.spellDefinitions[param0][0];
            fe.c(this.c(-38, var4), db.a(true, 537), MatchConditionEntry.a(366, (byte) 94), nd.field_b, true);
            if (pg.field_d.a((byte) 125) >= var4 &&
              param0 < pg.field_d.field_a.length &&
              pg.field_d.field_a[param0] < 250) {
              boolean decompiledSharedTail2 = !(!wg.a(-33, db.a(true, 469), db.a(true, 606), MatchConditionEntry.a(384, (byte) 94), MatchConditionEntry.a(416, (byte) 94)));
              if (!decompiledSharedTail2) {
                fe.a(db.a(true, 469), MatchConditionEntry.a(384, (byte) 94), 137, 32, DisplacedUnitMarker.field_s, nd.field_b, 0, 0);
                decompiledSharedTail2 = (var7 != 0);
              }
              if (decompiledSharedTail2) {
                fe.a(db.a(true, 469), MatchConditionEntry.a(384, (byte) 94), 137, 32, DisplacedUnitMarker.field_s, field_e, 0, 0);
                na.field_F = 8;
              }
              fe.c(wv.field_e, db.a(true, 537), MatchConditionEntry.a(416, (byte) 94), 0, true);
            }
          }
          if (tg.field_k == 1) {
            var4Lifetime1 = 0;
            var5 = 0;
            var6 = 0;
            while (true) {
              if (var6 < 5) {
                stackIn_47_0 = -1;
                stackIn_47_1 = pg.field_d.field_d[var6];
                if (var7 == 0) {
                  if (stackIn_47_0 == stackIn_47_1) {
                    var5 = 1;
                  }
                  if (pg.field_d.field_d[var6] == ev.field_d) {
                    var4Lifetime1 = 1;
                  }
                  var6++;
                  continue;
                }
              } else {
                if (var5 != 0) {
                  boolean decompiledSharedTail1 = !(wg.a(-33, db.a(true, 469), db.a(true, 606), MatchConditionEntry.a(334, (byte) 94), MatchConditionEntry.a(366, (byte) 94)));
                  if (!decompiledSharedTail1) {
                    fe.a(db.a(true, 469), MatchConditionEntry.a(334, (byte) 94), 137, 32, DisplacedUnitMarker.field_s, field_e, 0, 0);
                    na.field_F = 8;
                    decompiledSharedTail1 = (var7 != 0);
                  }
                  if (decompiledSharedTail1) {
                    fe.a(db.a(true, 469), MatchConditionEntry.a(334, (byte) 94), 137, 32, DisplacedUnitMarker.field_s, nd.field_b, 0, 0);
                  }
                  fe.c(wi.field_h, db.a(true, 537), MatchConditionEntry.a(366, (byte) 94), 0, true);
                }
                if (var4Lifetime1 == 0) {
                  return;
                }
                stackIn_47_0 = -33;
                stackIn_47_1 = db.a(true, 469);
              }
              break;
            }
            boolean decompiledSharedTail0 = !(wg.a(stackIn_47_0, stackIn_47_1, db.a(true, 606), MatchConditionEntry.a(384, (byte) 94), MatchConditionEntry.a(416, (byte) 94)));
            if (!decompiledSharedTail0) {
              fe.a(db.a(true, 469), MatchConditionEntry.a(384, (byte) 94), 137, 32, DisplacedUnitMarker.field_s, field_e, 0, 0);
              na.field_F = 8;
              decompiledSharedTail0 = (var7 != 0);
            }
            if (decompiledSharedTail0) {
              fe.a(db.a(true, 469), MatchConditionEntry.a(384, (byte) 94), 137, 32, DisplacedUnitMarker.field_s, nd.field_b, 0, 0);
            }
            fe.c(ni.field_c, db.a(true, 537), MatchConditionEntry.a(416, (byte) 94), 0, true);
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw ig.a((Throwable) ((Object) var3), "ci.UA(" + param0 + ',' + param1 + ')');
        }
    }

    private final int a(boolean param0, int param1) {
        int discarded$0 = 0;
        boolean stackIn_18_0 = false;
        int stackIn_19_1 = 0;
        int stackIn_20_0 = 0;
        int stackIn_35_0 = 0;
        int stackIn_46_0 = 0;
        int stackIn_48_0 = 0;
        int stackIn_57_0 = 0;
        int stackIn_59_0 = 0;
        int stackIn_61_0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          if ((this.tutorialStage != 6 ||
            DamageEvent.g(121)) &&
            (!DamageEvent.g(108) ||
            8 != this.tutorialStage &&
            9 != this.tutorialStage)) {
            if (!param0) {
              discarded$0 = this.a(false, -88);
            }
            if (this.tutorialStage != 13 &&
              this.tutorialStage != 12 &&
              this.tutorialStage != 18 &&
              20 != this.tutorialStage) {
              if (7 == this.tutorialStage &&
                null != MoveEvent.field_G) {
                stackIn_48_0 = MoveEvent.field_G.a(param1, (byte) 4);
                return stackIn_48_0;
              }
              if (7 == this.tutorialStage) {
                stackIn_46_0 = 1;
                return stackIn_46_0;
              }
              if (this.tutorialStage == 5 &&
                MoveEvent.field_E != null) {
                stackIn_59_0 = MoveEvent.field_E.a(param1, true);
                return stackIn_59_0;
              }
              if (5 != this.tutorialStage) {
                stackIn_61_0 = MoveEvent.field_D.b(this.tutorialStage, 29);
                return stackIn_61_0;
              }
              stackIn_57_0 = 1;
              return stackIn_57_0;
            }
            stackIn_35_0 = this.a((byte) -50, 0, param1);
            return stackIn_35_0;
          }
          stackIn_18_0 = true;
          if (param1 < 2) {
            stackIn_19_1 = 100 + param1 * 240;
          } else {
            stackIn_19_1 = 260;
          }
          stackIn_20_0 = db.a(stackIn_18_0, stackIn_19_1);
          return stackIn_20_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw ig.a((Throwable) ((Object) var3), "ci.BB(" + param0 + ',' + param1 + ')');
        }
    }

    private final void c(byte param0) {
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        try {
          lm.field_c = this.d(AiPlanningStrategy.field_d, -1, ko.field_b);
          if (1 == DeployEvent.field_A) {
            ub.$cfr$intArgs$a$6d836999ad61(94, im.field_v[2]);
            var2_int = this.d(iu.field_t, -1, TeleportAction.field_z);
            if (vs.field_a == var2_int) {
              vs.field_a = -1;
              if ((ArmiesOfGielinor.obfuscationControl) &&
                (-1 != var2_int)) {
                vs.field_a = var2_int;
              }
            } else {
              if (-1 != var2_int) {
                vs.field_a = var2_int;
              }
            }
          }
          if (param0 > -83) {
            this.c(false);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ig.a((Throwable) ((Object) var2), "ci.LA(" + param0 + ')');
        }
    }

    private final boolean b(int param0, int param1) {
        int[] var3 = null;
        RuntimeException var3_ref = null;
        int[] stackIn_7_0 = null;
        boolean stackIn_8_0 = false;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 > -72) {
            this.field_d = (dl) null;
          }
          if (this.tutorialStage != 9) {
            stackIn_7_0 = ei.field_e;
          } else {
            stackIn_7_0 = i.field_Nb;
          }
          var3 = stackIn_7_0;
          stackIn_8_0 = rb.a(param1, var3, 1);
          return stackIn_8_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          throw ig.a((Throwable) ((Object) var3_ref), "ci.MB(" + param0 + ',' + param1 + ')');
        }
    }

    private final int b(byte param0, int param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int stackIn_14_0 = 0;
        int stackIn_16_0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          var3_int = -104 / ((-21 - param0) / 33);
          if ((this.tutorialStage == 13 ||
            this.tutorialStage == 12 ||
            this.tutorialStage == 18 ||
            this.tutorialStage == 20) && param1 < (MoveEvent.field_y[this.tutorialStage].length - 1)) {
            stackIn_14_0 = this.a(true, param1 + 1) + this.a(param1, -3858) >> 1;
            return stackIn_14_0;
          }
          stackIn_16_0 = -1;
          return stackIn_16_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw ig.a((Throwable) ((Object) var3), "ci.EB(" + param0 + ',' + param1 + ')');
        }
    }

    private final void a(byte param0, int param1, int param2, int param3, int[] param4, String param5) {
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_24_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var7_int = 0;
        RuntimeException var7 = null;
        int[] var8 = null;
        String var9 = null;
        String var9Lifetime1;
        try {
          var7_int = og.field_m;
          if (!(0 <= og.field_m) ||
            !(jr.field_h.length > og.field_m)) {
            var7_int = 0;
          }
          var8 = jr.field_h[var7_int];
          if (param0 != 63) {
            field_c = (int[]) null;
          }
          if (param1 != -1) {
            fe.b(1 + param1 + ". ", db.a(true, 80), MatchConditionEntry.a(param3, (byte) 94), param4, true);
          }
          var9 = param5;
          fe.a(var9, db.a(true, 80), MatchConditionEntry.a(param3, (byte) 94), param4, true);
          var9Lifetime1 = AiInfluenceMap.a(param0 + 10539, param2);
          fe.c(var9Lifetime1, db.a(true, var8[4]), MatchConditionEntry.a(param3, (byte) 94), param4, true);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_19_0 = var7;
          stackIn_19_1 = new StringBuilder().append("ci.IA(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          stackIn_23_1 = ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(',');
          if (param5 == null) {
            stackIn_24_2 = "null";
          } else {
            stackIn_24_2 = "{...}";
          }
          throw ig.a((Throwable) ((Object) stackIn_19_0), ((StringBuilder) (Object) stackIn_23_1).append(stackIn_24_2).append(')').toString());
        }
    }

    final void e(boolean param0) {
        String stackIn_68_0 = null;
        boolean stackIn_69_1 = false;
        String stackIn_143_0 = null;
        boolean stackIn_144_2 = false;
        String stackIn_168_0 = null;
        boolean stackIn_169_1 = false;
        String stackIn_180_0;
        int stackIn_180_1;
        Object stackIn_180_2;
        int stackIn_180_3;
        boolean stackIn_181_4 = false;
        String stackIn_184_0 = null;
        boolean stackIn_185_2 = false;
        String stackIn_189_0 = null;
        boolean stackIn_190_2 = false;
        String stackIn_193_0;
        int stackIn_193_1;
        Object stackIn_193_2;
        int stackIn_193_3;
        boolean stackIn_194_4 = false;
        String stackIn_197_0 = null;
        boolean stackIn_198_2 = false;
        boolean stackIn_203_0 = false;
        boolean stackIn_212_1 = false;
        int stackIn_215_0 = 0;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_202_0;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var2_intLifetime1;
        int var3Lifetime1;
        int var2_intLifetime2;
        var4 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          if (this.tutorialStage == 15) {
            br.field_a.a(120);
            return;
          }
          if (this.tutorialStage != 1 &&
            24 != this.tutorialStage &&
            2 != this.tutorialStage &&
            this.tutorialStage != 17 &&
            this.tutorialStage != 3 &&
            this.tutorialStage != 25 &&
            19 != this.tutorialStage &&
            4 != this.tutorialStage &&
            this.tutorialStage != 16) {
            fe.b(db.a(!param0, 0), MatchConditionEntry.a(0, (byte) 94), rs.field_k, se.field_a, dq.field_i, nd.field_b, 0, 0);
          }
          boolean decompiledFrameRemainder0 = true;
          if (19 != this.tutorialStage) {
            if (25 != this.tutorialStage) {
              if (6 != this.tutorialStage) {
                if (this.tutorialStage != 26 &&
                  this.tutorialStage != 27 &&
                  28 != this.tutorialStage) {
                  if (18 == this.tutorialStage) {
                    fe.b(db.a(true, 15), MatchConditionEntry.a(30, (byte) 94), 610, 420, io.field_m, nd.field_b, 0, 180);
                    fe.b(MoveEvent.field_D.b(this.tutorialStage, 29), MoveEvent.field_D.a(this.tutorialStage, (byte) -117) - 10, MoveEvent.field_D.a((byte) -73, this.tutorialStage) - MoveEvent.field_D.b(this.tutorialStage, 29), MoveEvent.field_D.a(-6, this.tutorialStage) + (-MoveEvent.field_D.a(this.tutorialStage, (byte) -125) + 10), io.field_m, nd.field_b, 0, 256);
                    this.m(100);
                    fe.b(wb.field_b[this.tutorialStage], db.a(true, 320), MatchConditionEntry.a(30, (byte) 94));
                    fe.c(wb.field_b[this.tutorialStage], db.a(true, 320), MatchConditionEntry.a(30, (byte) 94), nd.field_b, false);
                    decompiledFrameRemainder0 = (var4 != 0);
                  }
                  if (decompiledFrameRemainder0) {
                    if (this.tutorialStage == 12) {
                      fe.b(db.a(true, 15), MatchConditionEntry.a(30, (byte) 94), 610, 420, io.field_m, nd.field_b, 0, 180);
                      fe.b(MoveEvent.field_D.b(this.tutorialStage, 29), -10 + MoveEvent.field_D.a(this.tutorialStage, (byte) -118), MoveEvent.field_D.a((byte) -101, this.tutorialStage) - MoveEvent.field_D.b(this.tutorialStage, 29), MoveEvent.field_D.a(-6, this.tutorialStage) - MoveEvent.field_D.a(this.tutorialStage, (byte) -109) + 10, io.field_m, nd.field_b, 0, 256);
                      this.k(-128);
                      stackIn_68_0 = wb.field_b[this.tutorialStage];
                      stackIn_69_1 = !(param0);
                      fe.b(stackIn_68_0, db.a(stackIn_69_1, 320), MatchConditionEntry.a(30, (byte) 94));
                      fe.c(wb.field_b[this.tutorialStage], db.a(true, 320), MatchConditionEntry.a(30, (byte) 94), nd.field_b, false);
                      decompiledFrameRemainder0 = (var4 != 0);
                    }
                    if (decompiledFrameRemainder0) {
                      if (20 != this.tutorialStage) {
                        if (this.tutorialStage == 13) {
                          fe.b(db.a(!param0, 15), MatchConditionEntry.a(30, (byte) 94), 610, 420, io.field_m, nd.field_b, 0, 180);
                          fe.b(MoveEvent.field_D.b(this.tutorialStage, 29), MoveEvent.field_D.a(this.tutorialStage, (byte) -127) - 10, MoveEvent.field_D.a((byte) 115, this.tutorialStage) - MoveEvent.field_D.b(this.tutorialStage, 29), MoveEvent.field_D.a(-6, this.tutorialStage) - (MoveEvent.field_D.a(this.tutorialStage, (byte) -114) - 10), io.field_m, nd.field_b, 0, 256);
                          this.i((byte) 41);
                          fe.b(wb.field_b[this.tutorialStage], db.a(true, 320), MatchConditionEntry.a(30, (byte) 94));
                          fe.c(wb.field_b[this.tutorialStage], db.a(true, 320), MatchConditionEntry.a(30, (byte) 94), nd.field_b, false);
                          decompiledFrameRemainder0 = (var4 != 0);
                        }
                        if (decompiledFrameRemainder0) {
                          if (this.tutorialStage == 0) {
                            fe.b(MoveEvent.field_D.b(this.tutorialStage, 29), MoveEvent.field_D.a(this.tutorialStage, (byte) -106) - (-MoveEvent.field_D.b(this.tutorialStage, (byte) -33) - 10), MoveEvent.field_D.a((byte) -125, this.tutorialStage) - MoveEvent.field_D.b(this.tutorialStage, 29), -10 + (MoveEvent.field_D.a(-6, this.tutorialStage) - MoveEvent.field_D.a(this.tutorialStage, (byte) -125) - MoveEvent.field_D.b(this.tutorialStage, (byte) 113)), io.field_m, nd.field_b, 0, 128);
                            fe.b(10 + MoveEvent.field_D.b(this.tutorialStage, 29), 10 + MoveEvent.field_D.a(this.tutorialStage, (byte) -104) + (MoveEvent.field_D.b(this.tutorialStage, (byte) -22) + 10), -20 + MoveEvent.field_D.a((byte) 115, this.tutorialStage) - MoveEvent.field_D.b(this.tutorialStage, 29), MoveEvent.field_D.a(-6, this.tutorialStage) + (-MoveEvent.field_D.a(this.tutorialStage, (byte) -120) - MoveEvent.field_D.b(this.tutorialStage, (byte) -125) - 10) - 20, io.field_m, field_e, 0, 128);
                            var2_int = so.field_b.field_a;
                            ol.field_y.g(var2_int / 2 - ol.field_y.field_A / 2, 50 + MoveEvent.field_D.a(this.tutorialStage, (byte) -111) - ol.field_y.field_x);
                            decompiledFrameRemainder0 = (var4 != 0);
                          }
                          if (decompiledFrameRemainder0) {
                            if (this.tutorialStage == 7) {
                              this.f(-120);
                              return;
                            }
                            if (this.tutorialStage != 5) {
                              if (this.tutorialStage == 22 ||
                                21 == this.tutorialStage) {
                                fe.b(db.a(true, 15), MatchConditionEntry.a(30, (byte) 94), 610, 420, io.field_m, nd.field_b, 0, 180);
                                MoveEvent.field_C.e((byte) 17);
                                fe.b(MoveEvent.field_D.b(this.tutorialStage, 29), MoveEvent.field_D.a(this.tutorialStage, (byte) -119) - 10, MoveEvent.field_D.a((byte) 103, this.tutorialStage) - MoveEvent.field_D.b(this.tutorialStage, 29), MoveEvent.field_D.a(-6, this.tutorialStage) - (MoveEvent.field_D.a(this.tutorialStage, (byte) -119) - 10), io.field_m, nd.field_b, 0, 256);
                                decompiledFrameRemainder0 = (var4 != 0);
                              }
                              if (decompiledFrameRemainder0) {
                                if (this.tutorialStage == 16) {
                                  hi.field_i.a(256);
                                  fe.b(-3 + MoveEvent.field_D.b(16, 29), MoveEvent.field_D.a(16, (byte) -118) - 3, 6 + (MoveEvent.field_D.a((byte) -83, 16) - MoveEvent.field_D.b(16, 29)), 6 + this.d(12, 0), io.field_m, nd.field_b, 0, 128);
                                  decompiledFrameRemainder0 = (var4 != 0);
                                }
                                if (decompiledFrameRemainder0) {
                                  if (this.tutorialStage != 8 &&
                                    this.tutorialStage != 9) {
                                    if (1 != this.tutorialStage &&
                                      this.tutorialStage != 2 &&
                                      this.tutorialStage != 17 &&
                                      this.tutorialStage != 24) {
                                      var2_int = MoveEvent.field_D.a(this.tutorialStage, (byte) -118);
                                      if (3 == this.tutorialStage &&
                                        ma.field_Z) {
                                        var2_int -= 32;
                                      }
                                      fe.b(MoveEvent.field_D.b(this.tutorialStage, 29), var2_int - MoveEvent.field_D.b(this.tutorialStage, (byte) -64), MoveEvent.field_D.a((byte) 92, this.tutorialStage) - MoveEvent.field_D.b(this.tutorialStage, 29), MoveEvent.field_D.a(-6, this.tutorialStage) + (-MoveEvent.field_D.a(this.tutorialStage, (byte) -115) + MoveEvent.field_D.b(this.tutorialStage, (byte) 112)), io.field_m, nd.field_b, 0, 128);
                                      if (wb.field_b[this.tutorialStage] != null) {
                                        fe.b(wb.field_b[this.tutorialStage], this.a(true, 0) + this.a(this.field_d.field_k - 1, -3858) >> 1, this.a(-1, true));
                                        fe.c(wb.field_b[this.tutorialStage], this.a(true, 0) + this.a(this.field_d.field_k - 1, -3858) >> 1, this.a(-1, true), nd.field_b, false);
                                      }
                                      decompiledFrameRemainder0 = (var4 != 0);
                                    }
                                    if (decompiledFrameRemainder0) {
                                      var2_int = MoveEvent.field_D.a(this.tutorialStage, (byte) -102);
                                      fe.b(MoveEvent.field_D.b(this.tutorialStage, 29), var2_int - MoveEvent.field_D.b(this.tutorialStage, (byte) -34), MoveEvent.field_D.a((byte) 97, this.tutorialStage) - MoveEvent.field_D.b(this.tutorialStage, 29), (1 + MoveEvent.field_y[this.tutorialStage].length) * MoveEvent.field_D.b(this.tutorialStage, (byte) -121) + (MoveEvent.field_D.b(this.tutorialStage, (byte) 117) >> 2), io.field_m, nd.field_b, 0, 128);
                                      if (null != wb.field_b[this.tutorialStage]) {
                                        fe.b(wb.field_b[this.tutorialStage], this.a(true, 0) + this.a(this.field_d.field_k - 1, -3858) >> 1, this.a(-1, true));
                                        stackIn_143_0 = wb.field_b[this.tutorialStage];
                                        stackIn_144_2 = !(param0);
                                        fe.c(stackIn_143_0, this.a(stackIn_144_2, 0) + this.a(-1 + this.field_d.field_k, -3858) >> 1, this.a(-1, true), nd.field_b, false);
                                      }
                                      decompiledFrameRemainder0 = (var4 != 0);
                                    }
                                  }
                                  if (decompiledFrameRemainder0) {
                                    fe.b(db.a(true, 25), MatchConditionEntry.a(33, (byte) 94), 590, 414, io.field_m, nd.field_b, 0, 180);
                                    fe.b(db.a(true, 42), MatchConditionEntry.a(48, (byte) 94), 556, 158, io.field_m, jh.field_k, 0, 256);
                                    fe.b(db.a(true, 42), MatchConditionEntry.a(215, (byte) 94), 556, 205, io.field_m, jh.field_k, 0, 128);
                                    fe.b(db.a(true, 52), MatchConditionEntry.a(228, (byte) 94), 191, 180, io.field_m, jh.field_k, 0, 128);
                                    fe.b(db.a(true, 251), MatchConditionEntry.a(228, (byte) 94), 337, 180, io.field_m, jh.field_k, 0, 128);
                                    fe.b(db.a(!param0, 30), MatchConditionEntry.a(431, (byte) 94), 581, 32, io.field_m, nd.field_b, 0, 256);
                                    decompiledFrameRemainder0 = (null != wb.field_b[this.tutorialStage]);
                                    if (decompiledFrameRemainder0) {
                                      var2_int = MatchConditionEntry.a(33, (byte) 94);
                                      fe.b(wb.field_b[this.tutorialStage], MoveEvent.field_D.b(this.tutorialStage, 29) + MoveEvent.field_D.a((byte) -63, this.tutorialStage) >> 1, var2_int);
                                      fe.c(wb.field_b[this.tutorialStage], MoveEvent.field_D.b(this.tutorialStage, 29) + MoveEvent.field_D.a((byte) -77, this.tutorialStage) >> 1, var2_int, nd.field_b, false);
                                      decompiledFrameRemainder0 = (var4 != 0);
                                    }
                                  }
                                }
                              }
                            }
                            if (decompiledFrameRemainder0) {
                              if (null != MoveEvent.field_E) {
                                MoveEvent.field_E.d((byte) -73);
                              }
                              return;
                            }
                          }
                        }
                      }
                      if (decompiledFrameRemainder0) {
                        fe.b(db.a(true, 15), MatchConditionEntry.a(30, (byte) 94), 610, 420, io.field_m, nd.field_b, 0, 180);
                        fe.b(MoveEvent.field_D.b(this.tutorialStage, 29), MoveEvent.field_D.a(this.tutorialStage, (byte) -108) - 10, MoveEvent.field_D.a((byte) -85, this.tutorialStage) - MoveEvent.field_D.b(this.tutorialStage, 29), 10 + (MoveEvent.field_D.a(-6, this.tutorialStage) - MoveEvent.field_D.a(this.tutorialStage, (byte) -105)), io.field_m, nd.field_b, 0, 256);
                        this.l(-23588);
                        fe.b(wb.field_b[this.tutorialStage], db.a(true, 320), MatchConditionEntry.a(30, (byte) 94));
                        fe.c(wb.field_b[this.tutorialStage], db.a(true, 320), MatchConditionEntry.a(30, (byte) 94), nd.field_b, false);
                        decompiledFrameRemainder0 = (var4 != 0);
                      }
                    }
                  }
                }
                if (decompiledFrameRemainder0) {
                  fe.b(db.a(true, 20), MatchConditionEntry.a(40, (byte) 94), 600, 420, io.field_m, nd.field_b, 0, 180);
                  fe.b(wb.field_b[this.tutorialStage], db.a(true, 320), MatchConditionEntry.a(40, (byte) 94));
                  stackIn_168_0 = wb.field_b[this.tutorialStage];
                  stackIn_169_1 = !(param0);
                  fe.c(stackIn_168_0, db.a(stackIn_169_1, 320), MatchConditionEntry.a(40, (byte) 94), nd.field_b, false);
                  decompiledFrameRemainder0 = (var4 != 0);
                }
              }
              if (decompiledFrameRemainder0) {
                fe.b(db.a(!param0, 20), MatchConditionEntry.a(40, (byte) 94), 600, 420, io.field_m, nd.field_b, 0, 180);
                fe.b(wb.field_b[this.tutorialStage], db.a(true, 320), MatchConditionEntry.a(40, (byte) 94));
                fe.c(wb.field_b[this.tutorialStage], db.a(true, 320), MatchConditionEntry.a(40, (byte) 94), nd.field_b, false);
                decompiledFrameRemainder0 = (var4 != 0);
              }
            }
            if (decompiledFrameRemainder0) {
              var2_int = MoveEvent.field_D.a(this.tutorialStage, (byte) -117);
              var3 = MoveEvent.field_D.a(-6, this.tutorialStage) - MoveEvent.field_D.a(this.tutorialStage, (byte) -119) - (-MoveEvent.field_D.b(this.tutorialStage, (byte) -66) - (nr.field_e.a(vd.field_a, 500, 0) >> 1));
              fe.b(MoveEvent.field_D.b(this.tutorialStage, 29), var2_int - MoveEvent.field_D.b(this.tutorialStage, (byte) 112), MoveEvent.field_D.a((byte) 94, this.tutorialStage) - MoveEvent.field_D.b(this.tutorialStage, 29), var3, io.field_m, nd.field_b, 0, 128);
              fe.a(vd.field_a, this.a(true, 0) + this.a(-1 + this.field_d.field_k, -3858) >> 1, var2_int + 20, 250, 16777215, true);
              stackIn_180_0 = wb.field_b[this.tutorialStage];
              stackIn_180_1 = this.a(true, 0) + this.a(-1 + this.field_d.field_k, -3858) >> 1;
              stackIn_180_2 = this;
              stackIn_180_3 = -1;
              stackIn_181_4 = !(param0);
              fe.b(stackIn_180_0, stackIn_180_1, this.a(stackIn_180_3, stackIn_181_4));
              stackIn_184_0 = wb.field_b[this.tutorialStage];
              stackIn_185_2 = !(param0);
              fe.c(stackIn_184_0, this.a(stackIn_185_2, 0) + this.a(this.field_d.field_k - 1, -3858) >> 1, this.a(-1, true), nd.field_b, false);
              decompiledFrameRemainder0 = (var4 != 0);
            }
          }
          if (decompiledFrameRemainder0) {
            var2_intLifetime2 = MoveEvent.field_D.a(this.tutorialStage, (byte) -124);
            var3Lifetime1 = MoveEvent.field_D.a(-6, this.tutorialStage) - MoveEvent.field_D.a(this.tutorialStage, (byte) -103) - (-MoveEvent.field_D.b(this.tutorialStage, (byte) 122) - (nr.field_e.a(mu.field_e, 500, 0) >> 1));
            fe.b(MoveEvent.field_D.b(this.tutorialStage, 29), -MoveEvent.field_D.b(this.tutorialStage, (byte) 123) + var2_intLifetime2, MoveEvent.field_D.a((byte) -61, this.tutorialStage) - MoveEvent.field_D.b(this.tutorialStage, 29), var3Lifetime1, io.field_m, nd.field_b, 0, 128);
            stackIn_189_0 = mu.field_e;
            stackIn_190_2 = !(param0);
            fe.a(stackIn_189_0, this.a(stackIn_190_2, 0) + this.a(-1 + this.field_d.field_k, -3858) >> 1, 20 + var2_intLifetime2, 250, 16777215, true);
            stackIn_193_0 = wb.field_b[this.tutorialStage];
            stackIn_193_1 = this.a(true, 0) + this.a(-1 + this.field_d.field_k, -3858) >> 1;
            stackIn_193_2 = this;
            stackIn_193_3 = -1;
            stackIn_194_4 = !(param0);
            fe.b(stackIn_193_0, stackIn_193_1, this.a(stackIn_193_3, stackIn_194_4));
            stackIn_197_0 = wb.field_b[this.tutorialStage];
            stackIn_198_2 = !(param0);
            fe.c(stackIn_197_0, this.a(stackIn_198_2, 0) + this.a(-1 + this.field_d.field_k, -3858) >> 1, this.a(-1, true), nd.field_b, false);
          }
          var2_intLifetime1 = 0;
          if (param0) {
            return;
          }
          boolean decompiledNaturalLoopExit0 = false;
          while (!(decompiledNaturalLoopExit0 = (!(var2_intLifetime1 < this.field_d.field_k)))) {
            stackOut_202_0 = this.a((byte) 82, var2_intLifetime1);
            stackIn_215_0 = stackOut_202_0 ? 1 : 0;
            stackIn_203_0 = stackOut_202_0;
            if (var4 == 0) {
              if (stackIn_203_0) {
                stackIn_212_1 = (~var2_intLifetime1 == ~this.field_d.field_h);
                this.b(stackIn_212_1, var2_intLifetime1, 28115);
              }
              var2_intLifetime1++;
              continue;
            }
            break;
          }
          if (decompiledNaturalLoopExit0) {
            stackIn_215_0 = this.tutorialStage;
          }
          if (stackIn_215_0 == 6) {
            this.a((byte) -121);
            if (var4 == 0) {
              return;
            }
          }
          if (8 == this.tutorialStage) {
            this.a(false, (byte) -4);
            if (var4 == 0) {
              return;
            }
          }
          if (9 != this.tutorialStage) {
            if (this.tutorialStage != 10) {
              if (this.tutorialStage == 26 ||
                this.tutorialStage == 27 ||
                this.tutorialStage == 28) {
                this.b((byte) 117);
                if (var4 == 0) {
                  return;
                }
              }
              if (this.tutorialStage != 11) {
                return;
              }
              hh.field_i.a(pr.field_i, MoveEvent.field_D.b(11, 29) + 20, 20 + MoveEvent.field_D.a(11, (byte) -105), -40 + MoveEvent.field_D.a((byte) 105, 11) - MoveEvent.field_D.b(11, 29), 1000, 16777215, -1, 0, 0, hh.field_i.field_H);
              if (var4 == 0) {
                return;
              }
            }
            this.g(0);
            if (var4 == 0) {
              return;
            }
          }
          this.a(true, (byte) -4);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ig.a((Throwable) ((Object) var2), "ci.R(" + param0 + ')');
        }
    }

    private final void f(byte param0) {
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        int stackIn_7_0 = 0;
        int stackIn_11_0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        var4 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          if (param0 != 100) {
            return;
          }
          stackIn_7_0 = (!this.a((byte) 40, 0)) ? 1 : 0;
          var2_int = stackIn_7_0;
          stackIn_11_0 = (!this.a((byte) -102, 2)) ? 1 : 2;
          var3 = stackIn_11_0;
          if (!this.field_d.a(false)) {
            if (rs.field_q == 96) {
              if (this.field_d.field_h <= var2_int) {
                this.field_d.a(var3, false);
                if (var4 != 0) {
                  this.field_d.a(-1 + this.field_d.field_h, false);
                }
              } else {
                this.field_d.a(-1 + this.field_d.field_h, false);
              }
            }
            if (rs.field_q == 97) {
              if (0 <= this.field_d.field_h &&
                this.field_d.field_h < var3) {
                this.field_d.a(this.field_d.field_h + 1, false);
                if (var4 != 0) {
                  this.field_d.a(var2_int, false);
                }
              } else {
                this.field_d.a(var2_int, false);
              }
            }
          }
          this.field_d.c(0);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ig.a((Throwable) ((Object) var2), "ci.CA(" + param0 + ')');
        }
    }

    private final String f(int param0, int param1) {
        int[] var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        String stackIn_5_0 = null;
        String stackIn_7_0 = null;
        String stackIn_9_0 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var3 = bw.unitDefinitions[param0];
          var4 = var3[2];
          var5 = var3[3];
          var6 = var3[4];
          var7 = var3[5];
          var8 = var3[6];
          var9 = var3[7];
          var10 = var3[param1];
          if (param0 == 34) {
            var11 = var8;
            var8 = bw.unitDefinitions[75][6];
            var9 = bw.unitDefinitions[75][7];
            stackIn_9_0 = fo.a(param1 ^ 4808, vl.field_l, new String[]{Integer.toString(var4), Integer.toString(var5), Integer.toString(var6), Integer.toString(var7), Integer.toString(var11), Integer.toString(var8), Integer.toString(var9), Integer.toString(var10)});
            return stackIn_9_0;
          }
          if (~var8 != ~var9) {
            stackIn_7_0 = fo.a(4800, g.field_e, new String[]{Integer.toString(var4), Integer.toString(var5), Integer.toString(var6), Integer.toString(var7), Integer.toString(var8), Integer.toString(var9), Integer.toString(var10)});
            return stackIn_7_0;
          }
          stackIn_5_0 = fo.a(4800, Unit.field_y, new String[]{Integer.toString(var4), Integer.toString(var5), Integer.toString(var6), Integer.toString(var7), Integer.toString(var8), Integer.toString(var10)});
          return stackIn_5_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          throw ig.a((Throwable) ((Object) var3_ref), "ci.M(" + param0 + ',' + param1 + ')');
        }
    }

    private final void a(boolean param0) {
        int var2_int = 0;
        int var3 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        var3 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          TelepopEvent.field_D = param0;
          var2_int = 0;
          while (var2_int < 5) {
            if (var3 != 0) {
              return;
            }
            if (ml.a(MatchConditionEntry.a(98, (byte) 94), db.a(true, 350 + 55 * var2_int), 22, false)) {
              pg.field_d.field_d[var2_int] = ev.field_d;
              ub.$cfr$intArgs$a$6d836999ad61(51, MoveAttackRequest.field_v[44]);
              AttackEvent.b(false);
              return;
            }
            var2_int++;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ig.a((Throwable) ((Object) var2), "ci.GA(" + param0 + ')');
        }
    }

    private final int a(rg param0, byte param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int stackIn_11_0 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var3_int = 0;
          var4 = -24 / ((-4 - param1) / 55);
          if (param0.field_j != null) {
            var3_int = this.a(param0.field_j, (byte) -88);
          }
          if (ml.a(MatchConditionEntry.a(359, (byte) 94), db.a(true, 30 + var3_int * 50 + 30), 10, false)) {
            ih.field_p = param0;
            this.a((byte) 116, -1, param0);
            if (-1 != ev.field_d) {
              wj.field_q = 248;
            }
            ab.field_a = ev.field_d;
          }
          stackIn_11_0 = 1 + var3_int;
          return stackIn_11_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_15_0 = var3;
          stackIn_15_1 = new StringBuilder().append("ci.N(");
          if (param0 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw ig.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param1).append(')').toString());
        }
    }

    private final int a(int param0, int param1) {
        int stackIn_22_0 = 0;
        int stackIn_23_0 = 0;
        int stackIn_37_0 = 0;
        int stackIn_43_0 = 0;
        int stackIn_48_0 = 0;
        int stackIn_54_0 = 0;
        int stackIn_59_0 = 0;
        int stackIn_61_0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          if (param1 != -3858) {
            field_f = (String[]) null;
          }
          if ((this.tutorialStage != 6 ||
            DamageEvent.g(param1 + 3964)) &&
            (!DamageEvent.g(77) ||
            this.tutorialStage != 8 &&
            this.tutorialStage != 9)) {
            if (13 != this.tutorialStage &&
              this.tutorialStage != 12 &&
              this.tutorialStage != 18 &&
              20 != this.tutorialStage) {
              if (this.tutorialStage == 7 &&
                MoveEvent.field_G != null) {
                stackIn_43_0 = MoveEvent.field_G.a(false, param0);
                return stackIn_43_0;
              }
              if (this.tutorialStage == 7) {
                stackIn_48_0 = 1;
                return stackIn_48_0;
              }
              if (this.tutorialStage == 5 &&
                null != MoveEvent.field_E) {
                stackIn_54_0 = MoveEvent.field_E.b(true, param0);
                return stackIn_54_0;
              }
              if (5 == this.tutorialStage) {
                stackIn_59_0 = 1;
                return stackIn_59_0;
              }
              stackIn_61_0 = MoveEvent.field_D.a((byte) -71, this.tutorialStage);
              return stackIn_61_0;
            }
            stackIn_37_0 = this.a((byte) -88, 1, param0);
            return stackIn_37_0;
          }
          if (param0 >= 2) {
            stackIn_22_0 = 380;
          } else {
            stackIn_22_0 = 300 + 240 * param0;
          }
          stackIn_23_0 = MatchConditionEntry.a(stackIn_22_0, (byte) 94);
          return stackIn_23_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw ig.a((Throwable) ((Object) var3), "ci.FB(" + param0 + ',' + param1 + ')');
        }
    }

    private final void i(byte param0) {
        String discarded$0 = null;
        int stackIn_35_0 = 0;
        int stackIn_35_1 = 0;
        int stackIn_59_0 = 0;
        int stackIn_59_1 = 0;
        int stackIn_89_0 = 0;
        boolean stackIn_96_0 = false;
        boolean stackIn_103_0 = false;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var3Lifetime1;
        int var4Lifetime1;
        int var5Lifetime1;
        var8 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          fe.a(db.a(true, 40), MatchConditionEntry.a(60, (byte) 94), 264, 260, EffectPresentation.field_j, jh.field_k, 0, 128, false);
          na.field_F = ah.field_a.a(db.a(true, 55), 0, AiPlanningStrategy.field_d, wh.field_a, mv.field_d, MatchConditionEntry.a(70, (byte) 94), ko.field_b);
          var2_int = 44;
          var3 = 0;
          boolean decompiledNaturalLoopExit0 = false;
          while (!(decompiledNaturalLoopExit0 = (var3 >= 6))) {
            var4 = db.a(true, 308);
            var5 = MatchConditionEntry.a(60 + var2_int * var3, (byte) 94);
            stackIn_35_0 = ~var4;
            stackIn_35_1 = ~AiPlanningStrategy.field_d;
            if (var8 == 0) {
              if (stackIn_35_0 > stackIn_35_1 &&
                var4 + 68 > AiPlanningStrategy.field_d &&
                var5 < ko.field_b &&
                (60 + (var2_int * (1 + var3) - 4)) > ko.field_b) {
                if (~var3 != ~wh.field_a) {
                  fe.a(var4, var5, 68, -4 + var2_int, EffectPresentation.field_j, field_e, 0, 128, false);
                } else {
                  fe.a(var4, var5, 68, var2_int - 4, EffectPresentation.field_j, nd.field_b, 0, 128, false);
                }
                na.field_F = var3;
              } else if (~wh.field_a != ~var3) {
                fe.a(var4, var5, 68, var2_int - 4, EffectPresentation.field_j, jh.field_k, 0, 128, false);
              } else {
                fe.a(var4, var5, 68, -4 + var2_int, EffectPresentation.field_j, nd.field_b, 0, 128, false);
              }
              wv.field_h[var3].g(db.a(true, 323), MatchConditionEntry.a(var2_int * var3 + 66, (byte) 94));
              var3++;
              continue;
            }
            break;
          }
          if (decompiledNaturalLoopExit0) {
            stackIn_35_0 = -1;
            stackIn_35_1 = na.field_F;
          }
          if (stackIn_35_0 < stackIn_35_1) {
            na.field_F = na.field_F + 100;
          }
          var3Lifetime1 = -1;
          if (AiPlanningStrategy.field_d > db.a(true, 40) &&
            AiPlanningStrategy.field_d < db.a(true, 376) &&
            ko.field_b > MatchConditionEntry.a(330, (byte) 94) &&
            ko.field_b < MatchConditionEntry.a(414, (byte) 94)) {
            var3Lifetime1 = (AiPlanningStrategy.field_d - db.a(true, 40)) / 21 + (ko.field_b - MatchConditionEntry.a(330, (byte) 94)) / 42 * 16;
          }
          if (na.field_F <= -1) {
            na.field_F = var3Lifetime1;
            if (var8 != 0) {
              na.field_F = na.field_F + 100;
            }
          } else {
            na.field_F = na.field_F + 100;
          }
          var4Lifetime1 = 0;
          if (param0 != 41) {
            discarded$0 = this.e(13, -56);
          }
          while (true) {
            stackIn_59_0 = 2;
            stackIn_59_1 = var4Lifetime1;
            if (stackIn_59_0 > stackIn_59_1) {
              stackIn_89_0 = 0;
              if (var8 == 0) {
                var5Lifetime1 = stackIn_89_0;
                while (var5Lifetime1 < 16) {
                  var6 = db.a(true, 40 + 21 * var5Lifetime1);
                  var7 = MatchConditionEntry.a(42 * var4Lifetime1 + 330, (byte) 94);
                  stackIn_59_0 = kd.field_X;
                  stackIn_59_1 = -1;
                  if (stackIn_59_0 > stackIn_59_1 &&
                    var5Lifetime1 + var4Lifetime1 * 16 == ah.field_a.field_b[kd.field_X]) {
                    fe.a(var6, var7, 20, 40, EffectPresentation.field_j, nd.field_b, 0, 128, false);
                  } else if (kd.field_X > -1 &&
                    ~(var5Lifetime1 + var4Lifetime1 * 16) == ~var3Lifetime1) {
                    fe.a(var6, var7, 20, 40, EffectPresentation.field_j, field_e, 0, 128, false);
                  } else {
                    fe.a(var6, var7, 20, 40, EffectPresentation.field_j, jh.field_k, 0, 128, false);
                  }
                  if (-1 < kd.field_X) {
                    SoftwareRaster.f(db.a(true, var5Lifetime1 * 21 + 44), MatchConditionEntry.a(334 + var4Lifetime1 * 42, (byte) 94), 12, 32, PreparedAction.field_q[var5Lifetime1 + var4Lifetime1 * 16]);
                  }
                  var5Lifetime1++;
                }
                var4Lifetime1++;
                continue;
              }
            } else {
              var4Lifetime1 = -1;
              stackIn_89_0 = 0;
            }
            if (stackIn_89_0 > ~kd.field_X) {
              stackIn_96_0 = !(ro.field_ub <= 0);
              var4Lifetime1 = ib.a(stackIn_96_0, 352, db.a(true, 380), ko.field_b, AiPlanningStrategy.field_d, 224, ah.field_a.field_a[kd.field_X], -40, MatchConditionEntry.a(60, (byte) 94));
              if (var8 != 0) {
                stackIn_103_0 = !(ro.field_ub <= 0);
                var4Lifetime1 = ib.a(stackIn_103_0, 352, db.a(true, 380), ko.field_b, AiPlanningStrategy.field_d, 224, -1, -40, MatchConditionEntry.a(60, (byte) 94));
              }
            } else {
              stackIn_103_0 = !(ro.field_ub <= 0);
              var4Lifetime1 = ib.a(stackIn_103_0, 352, db.a(true, 380), ko.field_b, AiPlanningStrategy.field_d, 224, -1, -40, MatchConditionEntry.a(60, (byte) 94));
            }
            if (na.field_F > -1) {
              na.field_F = na.field_F + 200;
              if (var8 == 0) {
                return;
              }
            }
            na.field_F = var4Lifetime1;
            if (na.field_F > -2) {
              na.field_F = na.field_F + 300;
            }
            return;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ig.a((Throwable) ((Object) var2), "ci.L(" + param0 + ')');
        }
    }

    static {
        field_b = "Leather";
        field_f = new String[]{"Welcome to", "This is the main game screen. You can look around using the arrow keys, or by moving the mouse while holding down the right mouse button. Try this now.", "This is a barbarian chieftain. Barbarians are very important, as they are the only unit that can capture structures.</br>", "To select a unit, click on its base. Try this now.", "You will see that a status bar has appeared at the top of the screen. Holding the cursor over an icon will bring up an explanation of what that icon means.", "To move a selected unit, hover over the map tile where you wish it to move to. This will show the fastest route the unit can take to this tile. The highlighted green area shows where the unit can reach this turn. Click on a tile to move the unit towards it. Try this now", "Portals and villages are important resources to capture. Try moving your barbarian onto a portal or village.", "Well done - your barbarian unit is going to start capturing this village. Captured villages can be used to heal your units, and adds to your Mana each turn. You will see a small bar underneath the village; once this bar is full, you have captured the village. Once captured, a small flag in your army's colours will appear above the village.", "Well done - your barbarian has reached a portal. Capturing portals allows you to teleport additional units into your army. Control of portals is critical to victory. Once captured, the portal will glow with your army's colours.", "Excellent. Each of your units can only make one move per turn. End your turn now by clicking on the flashing \"End turn\" button.", "Each of your units can only make one move per turn. End your turn now by clicking on the flashing \"End turn\" button.", "Each turn lasts a fixed amount of time, as indicated by the clock in the top-left-hand corner of the screen. In a normal game, this will slowly count down the seconds remaining in your turn, but for the purposes of this tutorial it has been disabled.", "Now capture the empty portal by moving your barbarian unit on top of it.", "Now capture a village by moving your barbarian unit on top of it.", "Now click on the \"End turn\" button to continue.", "The village of Eastbridge has been captured by the enemy. You will need to teleport in more units before you can liberate it.", "Move your barbarian chieftain towards the bridge to Eastbridge. You will see an enemy unit there. To attack the enemy unit, simply click its base to see the route to it, then click again to attack. Your attack range for this turn is shown by the red map tiles. You can see which units can be attacked as they'll have red battle icons over their heads.", "Now you need to use your captured portal to teleport in more units. Click on the portal to select it.", "You can now see four orbs around the portal. Each coloured orb represents the forces of the gods of Gielinor, while the grey orb represents neutral forces. To begin, click on any orb.", "The units you can bring in are now displayed around the orb (darkened-out units are not available yet). Clicking on different orbs will present you with different selections of units. Moving your cursor over a unit gives you its statistics; clicking on the unit teleports it to the battlefield. Now, choose a unit to teleport into battle.", "Excellent. The more units you choose from a particular god, the more of that god's units will become available to you, as well as more neutral units. Your status with each god is represented by the small orbs at the bottom of the screen.", "Now feel free to bring in more units and fight the enemy in whatever way you wish. To win, you must defeat all enemy units and capture the enemy-controlled tower. Remember that only barbarians can capture structures. Good luck!", "Reminder: Defeat your enemies and capture the tower.", "Well done, brave hero! Eastbridge has been saved. Please take a look at the instructions for more information about the game, and for details of how to unlock new units.", "This screen shows combat close-up. Skipping it has no effect on the outcome of the battle. In multiplayer games, the clock will stop during your battles if you choose to watch them.", "Capturing a village normally takes two turns with a healthy barbarian; injured barbarians will take longer. A barbarian chieftain with full health can do it in one.", "The Game Status box shows you and your enemies' progress in the game. It shows you how many structures you have captured and how many there are in total. You can mouse over it for a more complete explanation.", "The bar at the bottom shows your Victory Points. It is disabled in the tutorial, but in live games, the first person in the game to fill this bar wins! The more structures you control, the faster it fills."};
    }
}
