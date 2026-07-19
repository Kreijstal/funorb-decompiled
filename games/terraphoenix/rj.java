/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rj {
    static String field_c;
    static cm field_a;
    static String field_e;
    static String field_d;
    static String field_b;
    static String field_f;

    public final String toString() {
        throw new IllegalStateException();
    }

    public static void b(int param0) {
        boolean discarded$0 = false;
        field_f = null;
        field_d = null;
        field_a = null;
        field_c = null;
        field_e = null;
        field_b = null;
        if (param0 != 0) {
            int[] var2 = (int[]) null;
            discarded$0 = rj.a(26, (int[]) null);
        }
    }

    final static boolean a(int param0, int[] param1) {
        RuntimeException var2 = null;
        long var2_long = 0L;
        ra var4_ref_ra = null;
        int var4 = 0;
        int var5_int = 0;
        ra var5 = null;
        int var6 = 0;
        int var7 = 0;
        int stackIn_4_0 = 0;
        int stackIn_15_0 = 0;
        int stackIn_21_0 = 0;
        int stackIn_26_0 = 0;
        int stackIn_37_0 = 0;
        RuntimeException stackIn_39_0 = null;
        StringBuilder stackIn_39_1 = null;
        RuntimeException stackIn_40_0 = null;
        StringBuilder stackIn_40_1 = null;
        RuntimeException stackIn_41_0 = null;
        StringBuilder stackIn_41_1 = null;
        String stackIn_41_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_20_0 = 0;
        int stackOut_25_0 = 0;
        int stackOut_36_0 = 0;
        RuntimeException stackOut_38_0 = null;
        StringBuilder stackOut_38_1 = null;
        RuntimeException stackOut_40_0 = null;
        StringBuilder stackOut_40_1 = null;
        String stackOut_40_2 = null;
        RuntimeException stackOut_39_0 = null;
        StringBuilder stackOut_39_1 = null;
        String stackOut_39_2 = null;
        var7 = Terraphoenix.field_V;
        try {
          L0: {
            if (od.field_g != mh.field_a) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L1: {
                var2_long = ll.a(param0 ^ -1491051318);
                if (eh.field_d == 0) {
                  break L1;
                } else {
                  if (fg.field_d < 0) {
                    var4_ref_ra = (ra) ((Object) am.field_F.d(9272));
                    if (var4_ref_ra == null) {
                      break L1;
                    } else {
                      if ((var4_ref_ra.field_o ^ -1L) > (var2_long ^ -1L)) {
                        var4_ref_ra.b((byte) 12);
                        qh.field_d = var4_ref_ra.field_k.length;
                        mk.field_j.field_k = 0;
                        var5_int = 0;
                        L2: while (true) {
                          if (var5_int >= qh.field_d) {
                            wc.field_r = wf.field_n;
                            wf.field_n = uc.field_r;
                            uc.field_r = qk.field_b;
                            qk.field_b = var4_ref_ra.field_n;
                            stackOut_14_0 = 1;
                            stackIn_15_0 = stackOut_14_0;
                            decompiledRegionSelector0 = 1;
                            break L0;
                          } else {
                            mk.field_j.field_i[var5_int] = var4_ref_ra.field_k[var5_int];
                            var5_int++;
                            continue L2;
                          }
                        }
                      } else {
                        break L1;
                      }
                    }
                  } else {
                    break L1;
                  }
                }
              }
              L3: {
                if (param0 == -1491050718) {
                  break L3;
                } else {
                  field_a = (cm) null;
                  break L3;
                }
              }
              L4: while (true) {
                L5: {
                  if (-1 >= (fg.field_d ^ -1)) {
                    break L5;
                  } else {
                    mk.field_j.field_k = 0;
                    if (vc.a(-125, 1)) {
                      fg.field_d = mk.field_j.a(false);
                      mk.field_j.field_k = 0;
                      qh.field_d = param1[fg.field_d];
                      break L5;
                    } else {
                      stackOut_20_0 = 0;
                      stackIn_21_0 = stackOut_20_0;
                      decompiledRegionSelector0 = 2;
                      break L0;
                    }
                  }
                }
                if (!cm.b((byte) -43)) {
                  stackOut_25_0 = 0;
                  stackIn_26_0 = stackOut_25_0;
                  decompiledRegionSelector0 = 3;
                  break L0;
                } else {
                  if (-1 == (eh.field_d ^ -1)) {
                    wc.field_r = wf.field_n;
                    wf.field_n = uc.field_r;
                    uc.field_r = qk.field_b;
                    qk.field_b = fg.field_d;
                    fg.field_d = -1;
                    stackOut_36_0 = 1;
                    stackIn_37_0 = stackOut_36_0;
                    decompiledRegionSelector0 = 4;
                    break L0;
                  } else {
                    L6: {
                      var4 = eh.field_d;
                      if (tb.field_u == 0.0) {
                        break L6;
                      } else {
                        var4 = (int)((double)var4 + j.field_H.nextGaussian() * tb.field_u);
                        if ((var4 ^ -1) > -1) {
                          var4 = 0;
                          break L6;
                        } else {
                          break L6;
                        }
                      }
                    }
                    var5 = new ra(var2_long - -(long)var4, fg.field_d, new byte[qh.field_d]);
                    var6 = 0;
                    L7: while (true) {
                      if (qh.field_d <= var6) {
                        am.field_F.a(var5, param0 ^ 1491066943);
                        fg.field_d = -1;
                        continue L4;
                      } else {
                        var5.field_k[var6] = mk.field_j.field_i[var6];
                        var6++;
                        continue L7;
                      }
                    }
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var2 = decompiledCaughtException;
            stackOut_38_0 = (RuntimeException) (var2);
            stackOut_38_1 = new StringBuilder().append("rj.D(").append(param0).append(',');
            stackIn_40_0 = stackOut_38_0;
            stackIn_40_1 = stackOut_38_1;
            stackIn_39_0 = stackOut_38_0;
            stackIn_39_1 = stackOut_38_1;
            if (param1 == null) {
              stackOut_40_0 = (RuntimeException) ((Object) stackIn_40_0);
              stackOut_40_1 = (StringBuilder) ((Object) stackIn_40_1);
              stackOut_40_2 = "null";
              stackIn_41_0 = stackOut_40_0;
              stackIn_41_1 = stackOut_40_1;
              stackIn_41_2 = stackOut_40_2;
              break L8;
            } else {
              stackOut_39_0 = (RuntimeException) ((Object) stackIn_39_0);
              stackOut_39_1 = (StringBuilder) ((Object) stackIn_39_1);
              stackOut_39_2 = "{...}";
              stackIn_41_0 = stackOut_39_0;
              stackIn_41_1 = stackOut_39_1;
              stackIn_41_2 = stackOut_39_2;
              break L8;
            }
          }
          throw qk.a((Throwable) ((Object) stackIn_41_0), stackIn_41_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_15_0 != 0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_21_0 != 0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_26_0 != 0;
              } else {
                return stackIn_37_0 != 0;
              }
            }
          }
        }
    }

    final static void a(int param0) {
        boolean discarded$1 = false;
        RuntimeException var1 = null;
        int var2 = 0;
        int var3 = 0;
        me var4 = null;
        int var4_int = 0;
        int var5 = 0;
        vi var5_ref_vi = null;
        int[] var6 = null;
        int var7 = 0;
        int var8 = 0;
        int[] var9 = null;
        uc var10 = null;
        int[] var11 = null;
        int[] var12 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var8 = Terraphoenix.field_V;
        try {
          L0: {
            L1: {
              var10 = mk.field_j;
              var2 = var10.a(-16384);
              var3 = var10.a(-16384);
              if (param0 >= 72) {
                break L1;
              } else {
                var9 = (int[]) null;
                discarded$1 = rj.a(-113, (int[]) null);
                break L1;
              }
            }
            L2: {
              if (0 == var2) {
                var4 = (me) ((Object) ga.field_r.d(9272));
                if (var4 != null) {
                  L3: {
                    var5 = qh.field_d - var10.field_k;
                    var12 = var4.field_i;
                    var11 = var12;
                    var6 = var11;
                    if (var12.length << -1491050718 >= var5) {
                      break L3;
                    } else {
                      var5 = var12.length << 48379010;
                      break L3;
                    }
                  }
                  var7 = 0;
                  L4: while (true) {
                    if (var5 <= var7) {
                      var4.b((byte) 12);
                      break L2;
                    } else {
                      var6[var7 >> -30357534] = var6[var7 >> -30357534] + (var10.a(-16384) << (dg.a(3, var7) << 1210091528));
                      var7++;
                      continue L4;
                    }
                  }
                } else {
                  gb.g(-17464);
                  decompiledRegionSelector0 = 2;
                  break L0;
                }
              } else {
                if (var2 == 1) {
                  var4_int = var10.e((byte) 118);
                  var5_ref_vi = (vi) ((Object) pd.field_g.d(9272));
                  L5: while (true) {
                    L6: {
                      if (var5_ref_vi == null) {
                        break L6;
                      } else {
                        L7: {
                          if (var3 != var5_ref_vi.field_l) {
                            break L7;
                          } else {
                            if (var5_ref_vi.field_s != var4_int) {
                              break L7;
                            } else {
                              break L6;
                            }
                          }
                        }
                        var5_ref_vi = (vi) ((Object) pd.field_g.e((byte) -119));
                        continue L5;
                      }
                    }
                    if (var5_ref_vi == null) {
                      gb.g(-17464);
                      decompiledRegionSelector0 = 1;
                      break L0;
                    } else {
                      var5_ref_vi.b((byte) 12);
                      break L2;
                    }
                  }
                } else {
                  bd.a((Throwable) null, "LR1: " + r.i(-15465), 67);
                  gb.g(-17464);
                  break L2;
                }
              }
            }
            decompiledRegionSelector0 = 0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw qk.a((Throwable) ((Object) var1), "rj.A(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return;
          } else {
            return;
          }
        }
    }

    final static void a(int param0, int param1, me param2) {
        uc var3 = null;
        try {
            var3 = di.field_l;
            var3.k(-17410, param0);
            var3.i(2, -106);
            var3.i(0, -119);
            if (param1 >= -117) {
                field_f = (String) null;
            }
            var3.i(param2.field_j, 12);
        } catch (RuntimeException runtimeException) {
            throw qk.a((Throwable) ((Object) runtimeException), "rj.B(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_c = "Exit debriefing without saving";
        field_e = "Continue";
        field_d = "Saved games can be continued from the main menu.<br>  You can only have one saved game.";
        field_a = new cm(3);
        field_f = "No route";
        field_b = "    Stairs";
    }
}
