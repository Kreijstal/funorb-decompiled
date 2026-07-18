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
        field_f = null;
        field_d = null;
        field_a = null;
        field_c = null;
        field_e = null;
        field_b = null;
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
        int stackIn_19_0 = 0;
        int stackIn_24_0 = 0;
        int stackIn_35_0 = 0;
        RuntimeException stackIn_37_0 = null;
        StringBuilder stackIn_37_1 = null;
        RuntimeException stackIn_38_0 = null;
        StringBuilder stackIn_38_1 = null;
        RuntimeException stackIn_39_0 = null;
        StringBuilder stackIn_39_1 = null;
        String stackIn_39_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_18_0 = 0;
        int stackOut_23_0 = 0;
        int stackOut_34_0 = 0;
        RuntimeException stackOut_36_0 = null;
        StringBuilder stackOut_36_1 = null;
        RuntimeException stackOut_38_0 = null;
        StringBuilder stackOut_38_1 = null;
        String stackOut_38_2 = null;
        RuntimeException stackOut_37_0 = null;
        StringBuilder stackOut_37_1 = null;
        String stackOut_37_2 = null;
        var7 = Terraphoenix.field_V;
        try {
          L0: {
            if (od.field_g != mh.field_a) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              return stackIn_4_0 != 0;
            } else {
              L1: {
                var2_long = ll.a(1000);
                if (eh.field_d == 0) {
                  break L1;
                } else {
                  if (fg.field_d < 0) {
                    var4_ref_ra = (ra) (Object) am.field_F.d(9272);
                    if (var4_ref_ra == null) {
                      break L1;
                    } else {
                      if (~var4_ref_ra.field_o > ~var2_long) {
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
                            return stackIn_15_0 != 0;
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
              L3: while (true) {
                L4: {
                  if (fg.field_d >= 0) {
                    break L4;
                  } else {
                    mk.field_j.field_k = 0;
                    if (vc.a(-125, 1)) {
                      fg.field_d = mk.field_j.a(false);
                      mk.field_j.field_k = 0;
                      qh.field_d = param1[fg.field_d];
                      break L4;
                    } else {
                      stackOut_18_0 = 0;
                      stackIn_19_0 = stackOut_18_0;
                      return stackIn_19_0 != 0;
                    }
                  }
                }
                if (!cm.b((byte) -43)) {
                  stackOut_23_0 = 0;
                  stackIn_24_0 = stackOut_23_0;
                  return stackIn_24_0 != 0;
                } else {
                  if (eh.field_d == 0) {
                    wc.field_r = wf.field_n;
                    wf.field_n = uc.field_r;
                    uc.field_r = qk.field_b;
                    qk.field_b = fg.field_d;
                    fg.field_d = -1;
                    stackOut_34_0 = 1;
                    stackIn_35_0 = stackOut_34_0;
                    break L0;
                  } else {
                    L5: {
                      var4 = eh.field_d;
                      if (tb.field_u == 0.0) {
                        break L5;
                      } else {
                        var4 = (int)((double)var4 + j.field_H.nextGaussian() * tb.field_u);
                        if (var4 < 0) {
                          var4 = 0;
                          break L5;
                        } else {
                          break L5;
                        }
                      }
                    }
                    var5 = new ra(var2_long - -(long)var4, fg.field_d, new byte[qh.field_d]);
                    var6 = 0;
                    L6: while (true) {
                      if (qh.field_d <= var6) {
                        am.field_F.a((uf) (Object) var5, -16611);
                        fg.field_d = -1;
                        continue L3;
                      } else {
                        var5.field_k[var6] = mk.field_j.field_i[var6];
                        var6++;
                        continue L6;
                      }
                    }
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var2 = decompiledCaughtException;
            stackOut_36_0 = (RuntimeException) var2;
            stackOut_36_1 = new StringBuilder().append("rj.D(").append(-1491050718).append(',');
            stackIn_38_0 = stackOut_36_0;
            stackIn_38_1 = stackOut_36_1;
            stackIn_37_0 = stackOut_36_0;
            stackIn_37_1 = stackOut_36_1;
            if (param1 == null) {
              stackOut_38_0 = (RuntimeException) (Object) stackIn_38_0;
              stackOut_38_1 = (StringBuilder) (Object) stackIn_38_1;
              stackOut_38_2 = "null";
              stackIn_39_0 = stackOut_38_0;
              stackIn_39_1 = stackOut_38_1;
              stackIn_39_2 = stackOut_38_2;
              break L7;
            } else {
              stackOut_37_0 = (RuntimeException) (Object) stackIn_37_0;
              stackOut_37_1 = (StringBuilder) (Object) stackIn_37_1;
              stackOut_37_2 = "{...}";
              stackIn_39_0 = stackOut_37_0;
              stackIn_39_1 = stackOut_37_1;
              stackIn_39_2 = stackOut_37_2;
              break L7;
            }
          }
          throw qk.a((Throwable) (Object) stackIn_39_0, stackIn_39_2 + ')');
        }
        return stackIn_35_0 != 0;
    }

    final static void a(int param0) {
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
        uc var9 = null;
        int[] var10 = null;
        int[] var11 = null;
        int[] var12 = null;
        int[] var13 = null;
        RuntimeException decompiledCaughtException = null;
        var8 = Terraphoenix.field_V;
        try {
          L0: {
            L1: {
              var9 = mk.field_j;
              var2 = var9.a(-16384);
              var3 = var9.a(-16384);
              if (0 == var2) {
                var4 = (me) (Object) ga.field_r.d(9272);
                if (var4 != null) {
                  L2: {
                    var5 = qh.field_d - var9.field_k;
                    var13 = var4.field_i;
                    var12 = var13;
                    var11 = var12;
                    var10 = var11;
                    var6 = var10;
                    if (var13.length << 2 >= var5) {
                      break L2;
                    } else {
                      var5 = var13.length << 2;
                      break L2;
                    }
                  }
                  var7 = 0;
                  L3: while (true) {
                    if (var5 <= var7) {
                      var4.b((byte) 12);
                      break L1;
                    } else {
                      var6[var7 >> 2] = var6[var7 >> 2] + (var9.a(-16384) << (dg.a(3, var7) << 8));
                      var7++;
                      continue L3;
                    }
                  }
                } else {
                  gb.g(-17464);
                  return;
                }
              } else {
                if (var2 == 1) {
                  var4_int = var9.e((byte) 118);
                  var5_ref_vi = (vi) (Object) pd.field_g.d(9272);
                  L4: while (true) {
                    L5: {
                      if (var5_ref_vi == null) {
                        break L5;
                      } else {
                        L6: {
                          if (var3 != var5_ref_vi.field_l) {
                            break L6;
                          } else {
                            if (var5_ref_vi.field_s != var4_int) {
                              break L6;
                            } else {
                              break L5;
                            }
                          }
                        }
                        var5_ref_vi = (vi) (Object) pd.field_g.e((byte) -119);
                        continue L4;
                      }
                    }
                    if (var5_ref_vi == null) {
                      gb.g(-17464);
                      return;
                    } else {
                      var5_ref_vi.b((byte) 12);
                      break L1;
                    }
                  }
                } else {
                  bd.a((Throwable) null, "LR1: " + r.i(-15465), 67);
                  gb.g(-17464);
                  break L1;
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw qk.a((Throwable) (Object) var1, "rj.A(" + 127 + ')');
        }
    }

    final static void a(int param0, int param1, me param2) {
        uc var3 = null;
        try {
            var3 = di.field_l;
            var3.k(-17410, 5);
            var3.i(2, -106);
            var3.i(0, -119);
            var3.i(param2.field_j, 12);
        } catch (RuntimeException runtimeException) {
            throw qk.a((Throwable) (Object) runtimeException, "rj.B(" + 5 + ',' + -119 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = "Exit debriefing without saving";
        field_e = "Continue";
        field_d = "Saved games can be continued from the main menu.<br>  You can only have one saved game.";
        field_a = new cm(3);
        field_f = "No route";
        field_b = "    Stairs";
    }
}
