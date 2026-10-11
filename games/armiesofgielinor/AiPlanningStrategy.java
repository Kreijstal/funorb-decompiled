/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class AiPlanningStrategy {
    static int field_b;
    static int field_c;
    static String field_g;
    static String field_e;
    NodeDeque candidates;
    static int field_d;
    private NodeDeque recycledCandidates;

    final static hl a(int param0, int param1, boolean param2) {
        dn stackIn_4_0;
        boolean stackIn_4_1;
        int stackIn_4_2;
        int stackIn_4_3;
        boolean stackIn_5_4 = false;
        je stackIn_44_0 = null;
        String stackIn_45_1 = null;
        je stackIn_48_0 = null;
        String stackIn_49_1 = null;
        int stackIn_53_0 = 0;
        Object stackIn_102_0 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        NodeDeque var4 = null;
        Object var5 = null;
        Object var6 = null;
        hl var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        String var16 = null;
        tg var17 = null;
        String var18 = null;
        int var19 = 0;
        tg var17Lifetime1;
        String var18Lifetime1;
        var19 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          stackIn_4_0 = mw.field_E.field_Kb;
          stackIn_4_1 = param2;
          stackIn_4_2 = (jn.field_d * 3 + 6) * param1;
          stackIn_4_3 = 2 + jn.field_d;
          stackIn_5_4 = (mw.field_E.field_Kb == pq.field_b);
          var3_int = ((dn) (Object) stackIn_4_0).a(stackIn_4_1, stackIn_4_2, stackIn_4_3, stackIn_5_4, 0, 2) ? 1 : 0;
          var4 = mw.field_E.field_Nb.field_fb;
          if (param0 <= 20) {
            AiPlanningStrategy.a(-8, (String[]) null, (String) null, -108);
          }
          boolean decompiledFrameRemainder1 = true;
          var5 = null;
          if (th.field_a != 2) {
            su.field_d.field_xb = false;
            bn.field_c.field_X = fm.field_c;
            if (1 != th.field_a) {
              mw.field_E.field_Kb.field_Nb.field_X = ef.field_a;
              if (var19 != 0) {
                mw.field_E.field_Kb.field_Nb.field_X = TeleportAction.field_u;
              }
            } else {
              mw.field_E.field_Kb.field_Nb.field_X = TeleportAction.field_u;
            }
            jm.a(mw.field_E.field_Nb, -47);
            decompiledFrameRemainder1 = (var19 != 0);
          }
          if (decompiledFrameRemainder1) {
            su.field_d.field_xb = true;
            bn.field_c.field_X = fo.a(4800, ps.field_A, new String[]{vl.field_p});
            mw.field_E.field_Kb.field_Nb.field_X = null;
            var6 = null;
            var7 = (hl) (var4.first((byte) 109));
            while (true) {
              boolean decompiledFrameRemainder0 = true;
              if (var7 != null) {
                var8 = 0;
                if (var19 == 0) {
                  if (null == var7.field_fb) {
                    var7.field_Qb = new je(0L, IsaacRandom.field_i);
                    var7.a(var7.field_Qb, 87);
                    var7.field_Kb = new je(0L, ws.field_P);
                    var7.a(var7.field_Kb, 96);
                    var7.field_Jb = new je(0L, IsaacRandom.field_i);
                    var7.a(var7.field_Jb, 69);
                    var7.field_Kb.field_Eb = 2;
                    var7.i(-10027);
                    var8 = 1;
                  }
                  var7.field_gb = mw.field_E.field_Nb.field_gb;
                  var9 = 0;
                  if (null != var7.field_Ib) {
                    if (vl.field_p != var7.field_Ib) {
                      var11 = 16777062;
                      var10 = 13421568;
                    } else {
                      var10 = 52224;
                      var11 = 6750054;
                    }
                  } else {
                    var10 = 13369344;
                    var11 = 16737894;
                  }
                  var12 = 0;
                  if (var7.field_Nb != null &&
                    !var7.field_Nb.equals("")) {
                    var7.field_Jb.field_W = var11;
                    var7.field_Jb.field_cb = tl.field_e;
                    var12 = 1;
                    var7.field_Jb.a(jn.field_d, -20500, 3 + tl.field_e.field_A, var9, 0);
                  }
                  var7.field_Kb.field_wb = var11;
                  var7.field_Qb.field_wb = var11;
                  var7.field_Kb.field_N = var10;
                  var7.field_Qb.field_N = var10;
                  var7.field_Kb.field_W = var11;
                  var7.field_Qb.field_W = var11;
                  var7.field_Kb.field_T = var11;
                  var7.field_Qb.field_T = var11;
                  var13 = 0;
                  var14 = -82 + var7.field_gb;
                  if (var12 != 0) {
                    var13 = tl.field_e.field_A + 3;
                    var14 = var14 - var13;
                  }
                  stackIn_44_0 = var7.field_Qb;
                  if (var14 <= 0) {
                    stackIn_45_1 = var7.field_Mb;
                  } else {
                    stackIn_45_1 = BitmapFont.a(var7.field_Qb.field_Z, var7.field_Mb, var14);
                  }
                  stackIn_44_0.field_X = stackIn_45_1;
                  var7.field_Qb.a(jn.field_d, -20500, var14, var9, var13);
                  stackIn_48_0 = var7.field_Kb;
                  if (null != var7.field_Ib) {
                    stackIn_49_1 = var7.field_Ib;
                  } else {
                    stackIn_49_1 = iu.field_i;
                  }
                  stackIn_48_0.field_X = stackIn_49_1;
                  var7.field_Kb.a(jn.field_d, -20500, 80, var9, -80 + var7.field_gb);
                  stackIn_53_0 = (var7.field_Qb.field_X.equals(var7.field_Mb)) ? 0 : 1;
                  var15 = stackIn_53_0;
                  var9 = var9 + jn.field_d;
                  if (var3_int == 0) {
                    var7.field_nb = var9 - var7.field_ob;
                  }
                  if (var8 != 0) {
                    mw.field_E.field_Nb.a(var7, true, 2, (je) (var6));
                  }
                  var6 = var7;
                  if (var7.field_Jb != null &&
                    var7.field_Jb.field_eb) {
                    ad.field_I = var7.field_Nb;
                  } else if (var7.field_yb == 0) {
                    if (var7.field_Qb.field_eb &&
                      var15 != 0) {
                      ad.field_I = var7.field_Mb;
                    }
                  } else {
                    var16 = var7.field_Mb;
                    ng.a(mw.field_E.field_Kb, var7, (int[]) null, (String) null, -1, 84, -1, var16, 0L);
                    if (null != var7.field_Ib &&
                      !fs.a((byte) 110, tn.field_Z.field_m) &&
                      !NodeIterator.field_a) {
                      if (!vi.field_d) {
                        var17 = tn.field_Z;
                        var18 = fo.a(4800, mi.field_k, new String[]{var16});
                        var17.field_i.a(8, var18, (byte) -115);
                      }
                      var17Lifetime1 = tn.field_Z;
                      var18Lifetime1 = fo.a(4800, DeployRequest.field_w, new String[]{var16});
                      var17Lifetime1.field_i.a(18, var18Lifetime1, (byte) -100);
                    }
                    var5 = var7;
                  }
                  var7 = (hl) (var4.next((byte) 123));
                  continue;
                }
              } else {
                decompiledFrameRemainder0 = (0 != mw.field_E.field_Ib.field_yb);
                if (decompiledFrameRemainder0) {
                  EffectPresentation.field_e = new oc(mw.field_E.field_Ib.field_V, mw.field_E.field_Ib.field_D, mw.field_E.field_Ib.field_gb, mw.field_E.field_Ib.field_ob, iv.field_a, kq.field_N, eq.field_h, eq.field_h);
                }
              }
              if (decompiledFrameRemainder0) {
                ut.field_fb = 0;
              }
              if (mw.field_E.field_Rb.field_yb == 0) {
                break;
              }
              EffectPresentation.field_e = new oc(mw.field_E.field_Rb.field_V, mw.field_E.field_Rb.field_D, mw.field_E.field_Rb.field_gb, mw.field_E.field_Rb.field_ob, se.field_b, kq.field_N, eq.field_h, eq.field_h);
              ut.field_fb = 1;
              break;
            }
          }
          stackIn_102_0 = var5;
          return (hl) (stackIn_102_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw ig.a((Throwable) ((Object) var3), "sm.H(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    private final AiActionCandidate acquireCandidate(int obfuscationGuard) {
        AiActionCandidate var2 = null;
        RuntimeException var2_ref = null;
        AiActionCandidate stackIn_2_0 = null;
        AiActionCandidate stackIn_8_0 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (obfuscationGuard != 640) {
            stackIn_2_0 = (AiActionCandidate) null;
            return stackIn_2_0;
          }
          var2 = (AiActionCandidate) (this.recycledCandidates.a(0));
          if (null == var2) {
            var2 = new AiActionCandidate();
          }
          var2.reset(-1);
          stackIn_8_0 = var2;
          return stackIn_8_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw ig.a((Throwable) ((Object) var2_ref), "sm.G(" + obfuscationGuard + ')');
        }
    }

    abstract AiActionCandidate selectCandidate(byte obfuscationGuard);

    final void submitMoveCandidate(int destinationY, int destinationX, int obfuscationGuard, float score) {
        AiActionCandidate var5 = null;
        if (obfuscationGuard >= -69) {
          return;
        }
        try {
          var5 = this.acquireCandidate(640);
          var5.score = score;
          var5.destinationY = destinationY;
          var5.destinationX = destinationX;
          this.submitCandidate(16777062, var5);
        } catch (RuntimeException runtimeException) {
          throw ig.a((Throwable) ((Object) runtimeException), "sm.N(" + destinationY + ',' + destinationX + ',' + obfuscationGuard + ',' + score + ')');
        }
    }

    final void a(int param0, int param1, int param2, float param3, byte param4, int param5) {
        AiActionCandidate var7 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var7_ref = null;
        try {
          if (param4 != 71) {
            AiPlanningStrategy.a(76, (String[]) null, (String) null, 20);
          }
          var7 = this.acquireCandidate(param4 ^ 711);
          var7.score = param3;
          var7.destinationX = param1;
          var7.summoningPlayer = param5;
          var7.destinationY = param2;
          this.submitCandidate(16777062, var7);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7_ref = decompiledCaughtException;
          throw ig.a((Throwable) ((Object) var7_ref), "sm.K(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    final void submitResultCandidate(byte obfuscationGuard, int executionResult, float score) {
        AiActionCandidate var4 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4_ref = null;
        try {
          if (obfuscationGuard != -68) {
            field_g = (String) null;
          }
          var4 = this.acquireCandidate(640);
          var4.executionResult = executionResult;
          var4.score = score;
          this.submitCandidate(16777062, var4);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          throw ig.a((Throwable) ((Object) var4_ref), "sm.P(" + obfuscationGuard + ',' + executionResult + ',' + score + ')');
        }
    }

    public static void a(int param0) {
        try {
          field_e = null;
          field_g = null;
          if (param0 != -1) {
            field_g = (String) null;
          }
        } catch (RuntimeException runtimeException) {
          throw ig.a((Throwable) ((Object) runtimeException), "sm.O(" + param0 + ')');
        }
    }

    final static void a(int param0, String[] param1, String param2, int param3) {
        String[] var4 = null;
        int var5 = 0;
        boolean stackIn_18_0 = false;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_27_2 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_31_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4_ref = null;
        var5 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          mh.field_b = lm.field_d;
          if (param3 != 255) {
            if (param3 >= 100 &&
              param3 <= 105) {
              var4 = param1;
              fw.a(-1, var4);
              vl.field_k = ei.a(2, param1);
              if (var5 != 0) {
                vl.field_k = DisplacedUnitMarker.a(-1, param3, param2);
                stackIn_18_0 = !(nm.field_z >= 13);
                vl.field_k = dc.a(stackIn_18_0, false);
                fw.a(-1, (String[]) null);
              }
            } else {
              vl.field_k = DisplacedUnitMarker.a(-1, param3, param2);
              if (var5 != 0) {
                stackIn_18_0 = !(nm.field_z >= 13);
                vl.field_k = dc.a(stackIn_18_0, false);
                fw.a(-1, (String[]) null);
              }
            }
          } else {
            stackIn_18_0 = !(nm.field_z >= 13);
            vl.field_k = dc.a(stackIn_18_0, false);
            fw.a(-1, (String[]) null);
          }
          if (param0 <= 28) {
            AiPlanningStrategy.a(-35, -5, true);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_26_0 = var4_ref;
          stackIn_26_1 = new StringBuilder().append("sm.I(").append(param0).append(',');
          if (param1 == null) {
            stackIn_27_2 = "null";
          } else {
            stackIn_27_2 = "{...}";
          }
          stackIn_30_1 = ((StringBuilder) (Object) stackIn_26_1).append(stackIn_27_2).append(',');
          if (param2 == null) {
            stackIn_31_2 = "null";
          } else {
            stackIn_31_2 = "{...}";
          }
          throw ig.a((Throwable) ((Object) stackIn_26_0), ((StringBuilder) (Object) stackIn_30_1).append(stackIn_31_2).append(',').append(param3).append(')').toString());
        }
    }

    final void submitSummonCandidate(int destinationY, int unitType, float score, int actingPlayer, int destinationX, boolean submit) {
        AiActionCandidate var7 = this.acquireCandidate(640);
        var7.executionResult = -2;
        if (!submit) {
          return;
        }
        try {
          var7.destinationY = destinationY;
          var7.summoningPlayer = actingPlayer;
          var7.score = score;
          var7.summonUnitType = unitType;
          var7.destinationX = destinationX;
          this.submitCandidate(16777062, var7);
        } catch (RuntimeException runtimeException) {
          throw ig.a((Throwable) ((Object) runtimeException), "sm.J(" + destinationY + ',' + unitType + ',' + score + ',' + actingPlayer + ',' + destinationX + ',' + submit + ')');
        }
    }

    void reset(byte obfuscationGuard) {
        try {
          int var2_int = -101 / ((obfuscationGuard + 67) / 49);
          this.candidates.a(true, this.recycledCandidates);
        } catch (RuntimeException runtimeException) {
          throw ig.a((Throwable) ((Object) runtimeException), "sm.D(" + obfuscationGuard + ')');
        }
    }

    void submitCandidate(int obfuscationGuard, AiActionCandidate candidate) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (obfuscationGuard != 16777062) {
            return;
          }
          this.candidates.addLast((byte) -119, (IntrusiveNode) (candidate));
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_7_0 = runtimeException;
          stackIn_7_1 = new StringBuilder().append("sm.F(").append(obfuscationGuard).append(',');
          if (candidate == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw ig.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(')').toString());
        }
    }

    final void submitAttackCandidate(int destinationY, int targetX, int destinationX, int obfuscationGuard, float score, int targetY) {
        RuntimeException runtimeException = null;
        AiActionCandidate var7 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var7 = this.acquireCandidate(640);
          var7.score = score;
          var7.destinationX = destinationX;
          var7.targetX = targetX;
          var7.destinationY = destinationY;
          var7.targetY = targetY;
          this.submitCandidate(16777062, var7);
          if (obfuscationGuard > -114) {
            this.recycledCandidates = (NodeDeque) null;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw ig.a((Throwable) ((Object) runtimeException), "sm.M(" + destinationY + ',' + targetX + ',' + destinationX + ',' + obfuscationGuard + ',' + score + ',' + targetY + ')');
        }
    }

    final static void a(boolean param0, int param1) {
        int var2_int = 0;
        int var3 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        var3 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          boolean decompiledFrameRemainder0 = true;
          if (0 >= df.field_M) {
            if (DamageEvent.g(80)) {
              var2_int = 0;
              decompiledFrameRemainder0 = (var3 != 0);
            }
            if (decompiledFrameRemainder0) {
              var2_int = 1;
              decompiledFrameRemainder0 = (var3 != 0);
            }
          }
          if (decompiledFrameRemainder0) {
            if (ActionSpell.field_e == null) {
              wq.field_a = dj.a(640, 0, IntPair.field_m, -36, 0, 480);
              if (var3 != 0) {
                wq.field_a = ActionSpell.field_e.c(-1);
                ds.a(2, 99);
              }
            } else {
              wq.field_a = ActionSpell.field_e.c(-1);
              ds.a(2, 99);
            }
            if (null != wq.field_a) {
              var2_int = 2;
              lk.a(77, wq.field_a);
              if (var3 != 0) {
                var2_int = 3;
              }
            } else {
              var2_int = 3;
            }
          }
          if (param1 != 8028) {
            field_e = (String) null;
          }
          if (null == ActionSpell.field_e &&
            bn.field_e) {
            vq.a(var2_int, param0, (byte) 13);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ig.a((Throwable) ((Object) var2), "sm.L(" + param0 + ',' + param1 + ')');
        }
    }

    AiPlanningStrategy(AiPlanner planner) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          this.candidates = new NodeDeque();
          this.recycledCandidates = new NodeDeque();
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_6_0 = runtimeException;
          stackIn_6_1 = new StringBuilder().append("sm.<init>(");
          if (planner == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw ig.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    static {
        field_g = "Inviting <%0>";
        field_d = 0;
        field_e = "<%0> (<%1>-<%2>)";
    }
}
