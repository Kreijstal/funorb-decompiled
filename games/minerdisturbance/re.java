/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class re implements uj {
    static int[] field_c;
    static ji[] field_a;
    static int field_b;
    static int field_d;

    final static void a(int param0, byte[] param1, int[] param2, int param3, int param4) {
        int incrementValue$12 = 0;
        int incrementValue$13 = 0;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        var7 = MinerDisturbance.field_ab;
        try {
          L0: {
            var5_int = param0;
            L1: while (true) {
              if (mg.field_e.length <= var5_int) {
                break L0;
              } else {
                param4 = mg.field_e[var5_int];
                var6 = var5_int << 694475396;
                L2: while (true) {
                  incrementValue$12 = param4;
                  param4--;
                  if (incrementValue$12 == 0) {
                    var5_int++;
                    continue L1;
                  } else {
                    incrementValue$13 = var6;
                    var6++;
                    param3 = ta.field_d[incrementValue$13];
                    param2[param1[param3]] = param2[param1[param3]] + 1;
                    ta.field_d[param2[param1[param3]]] = param3;
                    continue L2;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5 = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) (var5);
            stackOut_8_1 = new StringBuilder().append("re.F(").append(param0).append(',');
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param1 == null) {
              stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackOut_10_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L3;
            } else {
              stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackOut_9_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L3;
            }
          }
          L4: {
            stackOut_11_0 = (RuntimeException) ((Object) stackIn_11_0);
            stackOut_11_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_11_2).append(',');
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param2 == null) {
              stackOut_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackOut_13_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L4;
            } else {
              stackOut_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackOut_12_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L4;
            }
          }
          throw lj.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    public final void a(boolean param0) {
        int discarded$0 = 0;
        tb.field_a = 1;
        gd.field_x = 0;
        if (param0) {
            String var3 = (String) null;
            discarded$0 = re.a(-10, false, true, (String) null, false, (String) null);
        }
    }

    final static String a(String param0, int param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        char[] var3 = null;
        int var4 = 0;
        int var5 = 0;
        String stackIn_5_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_4_0 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        var5 = MinerDisturbance.field_ab;
        try {
          L0: {
            var2_int = param0.length();
            var3 = new char[var2_int];
            var4 = param1;
            L1: while (true) {
              if (var4 >= var2_int) {
                stackOut_4_0 = new String(var3);
                stackIn_5_0 = stackOut_4_0;
                break L0;
              } else {
                var3[-1 + var2_int - var4] = param0.charAt(var4);
                var4++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) (var2);
            stackOut_6_1 = new StringBuilder().append("re.E(");
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param0 == null) {
              stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackOut_8_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L2;
            } else {
              stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackOut_7_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L2;
            }
          }
          throw lj.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ',' + param1 + ')');
        }
        return stackIn_5_0;
    }

    final static int a(int param0, boolean param1, boolean param2, String param3, boolean param4, String param5) {
        try {
            int discarded$6 = 0;
            int discarded$7 = 0;
            int discarded$8 = 0;
            int discarded$9 = 0;
            Object discarded$10 = null;
            Object discarded$11 = null;
            RuntimeException var6 = null;
            int var6_int = 0;
            int var7 = 0;
            Throwable var8_ref_Throwable = null;
            int var8 = 0;
            int var9 = 0;
            String var10 = null;
            String var11 = null;
            CharSequence var12 = null;
            int stackIn_6_0 = 0;
            int stackIn_29_0 = 0;
            int stackIn_42_0 = 0;
            int stackIn_45_0 = 0;
            int stackIn_72_0 = 0;
            int stackIn_75_0 = 0;
            int stackIn_81_0 = 0;
            int stackIn_86_0 = 0;
            int stackIn_94_0 = 0;
            int stackIn_97_0 = 0;
            RuntimeException stackIn_99_0 = null;
            StringBuilder stackIn_99_1 = null;
            RuntimeException stackIn_100_0 = null;
            StringBuilder stackIn_100_1 = null;
            RuntimeException stackIn_101_0 = null;
            StringBuilder stackIn_101_1 = null;
            String stackIn_101_2 = null;
            RuntimeException stackIn_102_0 = null;
            StringBuilder stackIn_102_1 = null;
            RuntimeException stackIn_103_0 = null;
            StringBuilder stackIn_103_1 = null;
            RuntimeException stackIn_104_0 = null;
            StringBuilder stackIn_104_1 = null;
            String stackIn_104_2 = null;
            int decompiledRegionSelector0 = 0;
            Throwable decompiledCaughtException = null;
            int stackOut_5_0 = 0;
            int stackOut_28_0 = 0;
            int stackOut_41_0 = 0;
            int stackOut_40_0 = 0;
            int stackOut_44_0 = 0;
            int stackOut_43_0 = 0;
            int stackOut_71_0 = 0;
            int stackOut_80_0 = 0;
            int stackOut_85_0 = 0;
            int stackOut_93_0 = 0;
            int stackOut_96_0 = 0;
            int stackOut_74_0 = 0;
            RuntimeException stackOut_98_0 = null;
            StringBuilder stackOut_98_1 = null;
            RuntimeException stackOut_100_0 = null;
            StringBuilder stackOut_100_1 = null;
            String stackOut_100_2 = null;
            RuntimeException stackOut_99_0 = null;
            StringBuilder stackOut_99_1 = null;
            String stackOut_99_2 = null;
            RuntimeException stackOut_101_0 = null;
            StringBuilder stackOut_101_1 = null;
            RuntimeException stackOut_103_0 = null;
            StringBuilder stackOut_103_1 = null;
            String stackOut_103_2 = null;
            RuntimeException stackOut_102_0 = null;
            StringBuilder stackOut_102_1 = null;
            String stackOut_102_2 = null;
            var9 = MinerDisturbance.field_ab;
            try {
              L0: {
                L1: {
                  if (null == ci.field_i) {
                    if (!ed.a(param4, (byte) -126)) {
                      stackOut_5_0 = -1;
                      stackIn_6_0 = stackOut_5_0;
                      decompiledRegionSelector0 = 0;
                      break L0;
                    } else {
                      break L1;
                    }
                  } else {
                    break L1;
                  }
                }
                L2: {
                  if (qd.field_Q == cm.field_p) {
                    L3: {
                      if (param4) {
                        var10 = (String) null;
                        tb.field_d = qg.a(ne.field_Q, param5, 0, (String) null, false);
                        break L3;
                      } else {
                        tb.field_d = sl.a((byte) 86, param3, param5, false);
                        break L3;
                      }
                    }
                    sn.field_c.field_o = 0;
                    sn.field_c.c(14, 25564);
                    sn.field_c.c(tb.field_d.b(0).field_a, 25564);
                    bk.a((byte) -104, -1);
                    qd.field_Q = ra.field_c;
                    break L2;
                  } else {
                    break L2;
                  }
                }
                L4: {
                  if (qd.field_Q != ra.field_c) {
                    break L4;
                  } else {
                    if (ta.a(0, 1)) {
                      var6_int = kj.field_a.d((byte) -54);
                      kj.field_a.field_o = 0;
                      if (-1 == (var6_int ^ -1)) {
                        qd.field_Q = ka.field_d;
                        break L4;
                      } else {
                        oj.field_K = var6_int;
                        qd.field_Q = bh.field_bb;
                        rj.field_d = -1;
                        break L4;
                      }
                    } else {
                      break L4;
                    }
                  }
                }
                L5: {
                  if (qd.field_Q != ka.field_d) {
                    break L5;
                  } else {
                    if (!ta.a(0, 8)) {
                      break L5;
                    } else {
                      gd.field_s = kj.field_a.h(81);
                      kj.field_a.field_o = 0;
                      cm.a((byte) 6, param4, param0, tb.field_d, param2);
                      qd.field_Q = nn.field_m;
                      break L5;
                    }
                  }
                }
                L6: {
                  if (qd.field_Q != nn.field_m) {
                    break L6;
                  } else {
                    if (!ta.a(0, 1)) {
                      break L6;
                    } else {
                      L7: {
                        var6_int = kj.field_a.d((byte) -54);
                        ag.field_d = null;
                        oj.field_K = var6_int;
                        kj.field_a.field_o = 0;
                        if (0 == var6_int) {
                          break L7;
                        } else {
                          if (-2 == (var6_int ^ -1)) {
                            break L7;
                          } else {
                            if ((var6_int ^ -1) == -9) {
                              si.a(-67);
                              ek.field_c = false;
                              stackOut_28_0 = var6_int;
                              stackIn_29_0 = stackOut_28_0;
                              decompiledRegionSelector0 = 1;
                              break L0;
                            } else {
                              qd.field_Q = bh.field_bb;
                              rj.field_d = -1;
                              break L6;
                            }
                          }
                        }
                      }
                      rj.field_d = -1;
                      qd.field_Q = wi.field_s;
                      break L6;
                    }
                  }
                }
                L8: {
                  if (qd.field_Q != wi.field_s) {
                    break L8;
                  } else {
                    if (kj.b(-9319)) {
                      L9: {
                        ne.field_Q = kj.field_a.h(71);
                        wj.field_j = kj.field_a.d((byte) -54);
                        discarded$6 = kj.field_a.d((byte) -54);
                        pj.field_a = kj.field_a.e(-96);
                        var11 = kj.field_a.j(103);
                        var7 = kj.field_a.d((byte) -54);
                        if ((1 & var7) != 0) {
                          nj.a((byte) 89);
                          break L9;
                        } else {
                          break L9;
                        }
                      }
                      L10: {
                        if (!param4) {
                          L11: {
                            if ((8 & var7) == 0) {
                              stackOut_41_0 = 0;
                              stackIn_42_0 = stackOut_41_0;
                              break L11;
                            } else {
                              stackOut_40_0 = 1;
                              stackIn_42_0 = stackOut_40_0;
                              break L11;
                            }
                          }
                          L12: {
                            bd.field_b = stackIn_42_0 != 0;
                            if ((4 & var7) == 0) {
                              stackOut_44_0 = 0;
                              stackIn_45_0 = stackOut_44_0;
                              break L12;
                            } else {
                              stackOut_43_0 = 1;
                              stackIn_45_0 = stackOut_43_0;
                              break L12;
                            }
                          }
                          fa.field_b = stackIn_45_0 != 0;
                          if (bd.field_b) {
                            break L10;
                          } else {
                            break L10;
                          }
                        } else {
                          break L10;
                        }
                      }
                      L13: {
                        if (!ei.field_L) {
                          break L13;
                        } else {
                          discarded$7 = kj.field_a.d((byte) -54);
                          discarded$8 = kj.field_a.d((byte) -54);
                          discarded$9 = kj.field_a.b((byte) 33);
                          g.field_k = kj.field_a.e(-47);
                          ja.field_v = new byte[g.field_k];
                          var8 = 0;
                          L14: while (true) {
                            if (g.field_k <= var8) {
                              break L13;
                            } else {
                              ja.field_v[var8] = kj.field_a.m(4);
                              var8++;
                              continue L14;
                            }
                          }
                        }
                      }
                      L15: {
                        ti.field_J = kj.field_a.a(false);
                        var12 = (CharSequence) ((Object) ti.field_J);
                        in.field_b = cl.a(-95, var12);
                        a.field_d = kj.field_a.d((byte) -54);
                        qd.field_Q = pb.field_c;
                        if (tb.field_d.b(0) == hk.field_i) {
                          ak.field_b.a(bm.c(-122), 447616545);
                          break L15;
                        } else {
                          if (tb.field_d.b(0) != kl.field_a) {
                            break L15;
                          } else {
                            hj.field_e.a(bm.c(-116), 447616545);
                            break L15;
                          }
                        }
                      }
                      L16: {
                        ek.field_c = false;
                        if (var11 == null) {
                          break L16;
                        } else {
                          nc.a(bm.c(-93), var11, (byte) 78);
                          break L16;
                        }
                      }
                      L17: {
                        L18: {
                          if (0 < pj.field_a) {
                            break L18;
                          } else {
                            if (!fa.field_b) {
                              try {
                                L19: {
                                  discarded$10 = lk.a((byte) 18, "unzap", bm.c(-96));
                                  break L19;
                                }
                              } catch (java.lang.Throwable decompiledCaughtParameter0) {
                                decompiledCaughtException = decompiledCaughtParameter0;
                                L20: {
                                  var8_ref_Throwable = decompiledCaughtException;
                                  break L20;
                                }
                              }
                              break L17;
                            } else {
                              break L18;
                            }
                          }
                        }
                        try {
                          L21: {
                            discarded$11 = lk.a("zap", bm.c(-111), 16715, new Object[]{oh.a(ne.field_Q, 95)});
                            break L21;
                          }
                        } catch (java.lang.Throwable decompiledCaughtParameter1) {
                          decompiledCaughtException = decompiledCaughtParameter1;
                          L22: {
                            var8_ref_Throwable = decompiledCaughtException;
                            break L22;
                          }
                        }
                        break L17;
                      }
                      L23: {
                        if (-1 > (pj.field_a ^ -1)) {
                          v.field_e = true;
                          break L23;
                        } else {
                          break L23;
                        }
                      }
                      sn.field_c.b(v.field_b, -97);
                      var8 = 0;
                      L24: while (true) {
                        if (4 <= var8) {
                          kj.field_a.b(v.field_b, 107);
                          stackOut_71_0 = oj.field_K;
                          stackIn_72_0 = stackOut_71_0;
                          decompiledRegionSelector0 = 2;
                          break L0;
                        } else {
                          v.field_b[var8] = v.field_b[var8] + 50;
                          var8++;
                          continue L24;
                        }
                      }
                    } else {
                      break L8;
                    }
                  }
                }
                if (!param1) {
                  L25: {
                    if (bh.field_bb != qd.field_Q) {
                      break L25;
                    } else {
                      if (!kj.b(-9319)) {
                        break L25;
                      } else {
                        L26: {
                          si.a(-110);
                          if (7 != oj.field_K) {
                            break L26;
                          } else {
                            if (ek.field_c) {
                              break L26;
                            } else {
                              ek.field_c = true;
                              stackOut_80_0 = -1;
                              stackIn_81_0 = stackOut_80_0;
                              decompiledRegionSelector0 = 4;
                              break L0;
                            }
                          }
                        }
                        L27: {
                          if (7 == oj.field_K) {
                            oj.field_K = 3;
                            break L27;
                          } else {
                            break L27;
                          }
                        }
                        nf.field_g = kj.field_a.a(false);
                        ek.field_c = false;
                        stackOut_85_0 = oj.field_K;
                        stackIn_86_0 = stackOut_85_0;
                        decompiledRegionSelector0 = 5;
                        break L0;
                      }
                    }
                  }
                  L28: {
                    if (null == ci.field_i) {
                      if (!ek.field_c) {
                        var6_int = jc.field_E;
                        jc.field_E = ic.field_h;
                        ek.field_c = true;
                        ic.field_h = var6_int;
                        break L28;
                      } else {
                        L29: {
                          if ((qa.a(-125) ^ -1L) < -30001L) {
                            nf.field_g = oi.field_K;
                            break L29;
                          } else {
                            nf.field_g = l.field_a;
                            break L29;
                          }
                        }
                        ek.field_c = false;
                        stackOut_93_0 = 3;
                        stackIn_94_0 = stackOut_93_0;
                        decompiledRegionSelector0 = 6;
                        break L0;
                      }
                    } else {
                      break L28;
                    }
                  }
                  stackOut_96_0 = -1;
                  stackIn_97_0 = stackOut_96_0;
                  decompiledRegionSelector0 = 7;
                  break L0;
                } else {
                  stackOut_74_0 = -33;
                  stackIn_75_0 = stackOut_74_0;
                  decompiledRegionSelector0 = 3;
                  break L0;
                }
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter2) {
              decompiledCaughtException = decompiledCaughtParameter2;
              L30: {
                var6 = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_98_0 = (RuntimeException) (var6);
                stackOut_98_1 = new StringBuilder().append("re.C(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
                stackIn_100_0 = stackOut_98_0;
                stackIn_100_1 = stackOut_98_1;
                stackIn_99_0 = stackOut_98_0;
                stackIn_99_1 = stackOut_98_1;
                if (param3 == null) {
                  stackOut_100_0 = (RuntimeException) ((Object) stackIn_100_0);
                  stackOut_100_1 = (StringBuilder) ((Object) stackIn_100_1);
                  stackOut_100_2 = "null";
                  stackIn_101_0 = stackOut_100_0;
                  stackIn_101_1 = stackOut_100_1;
                  stackIn_101_2 = stackOut_100_2;
                  break L30;
                } else {
                  stackOut_99_0 = (RuntimeException) ((Object) stackIn_99_0);
                  stackOut_99_1 = (StringBuilder) ((Object) stackIn_99_1);
                  stackOut_99_2 = "{...}";
                  stackIn_101_0 = stackOut_99_0;
                  stackIn_101_1 = stackOut_99_1;
                  stackIn_101_2 = stackOut_99_2;
                  break L30;
                }
              }
              L31: {
                stackOut_101_0 = (RuntimeException) ((Object) stackIn_101_0);
                stackOut_101_1 = ((StringBuilder) (Object) stackIn_101_1).append(stackIn_101_2).append(',').append(param4).append(',');
                stackIn_103_0 = stackOut_101_0;
                stackIn_103_1 = stackOut_101_1;
                stackIn_102_0 = stackOut_101_0;
                stackIn_102_1 = stackOut_101_1;
                if (param5 == null) {
                  stackOut_103_0 = (RuntimeException) ((Object) stackIn_103_0);
                  stackOut_103_1 = (StringBuilder) ((Object) stackIn_103_1);
                  stackOut_103_2 = "null";
                  stackIn_104_0 = stackOut_103_0;
                  stackIn_104_1 = stackOut_103_1;
                  stackIn_104_2 = stackOut_103_2;
                  break L31;
                } else {
                  stackOut_102_0 = (RuntimeException) ((Object) stackIn_102_0);
                  stackOut_102_1 = (StringBuilder) ((Object) stackIn_102_1);
                  stackOut_102_2 = "{...}";
                  stackIn_104_0 = stackOut_102_0;
                  stackIn_104_1 = stackOut_102_1;
                  stackIn_104_2 = stackOut_102_2;
                  break L31;
                }
              }
              throw lj.a((Throwable) ((Object) stackIn_104_0), stackIn_104_2 + ')');
            }
            if (decompiledRegionSelector0 == 0) {
              return stackIn_6_0;
            } else {
              if (decompiledRegionSelector0 == 1) {
                return stackIn_29_0;
              } else {
                if (decompiledRegionSelector0 == 2) {
                  return stackIn_72_0;
                } else {
                  if (decompiledRegionSelector0 == 3) {
                    return stackIn_75_0;
                  } else {
                    if (decompiledRegionSelector0 == 4) {
                      return stackIn_81_0;
                    } else {
                      if (decompiledRegionSelector0 == 5) {
                        return stackIn_86_0;
                      } else {
                        if (decompiledRegionSelector0 == 6) {
                          return stackIn_94_0;
                        } else {
                          return stackIn_97_0;
                        }
                      }
                    }
                  }
                }
              }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void a(int param0) {
        field_a = null;
        if (param0 != -10887) {
            field_a = (ji[]) null;
        }
        field_c = null;
    }

    public final String a(byte param0) {
        int var2 = -121 % ((-33 - param0) / 62);
        return "Make Ore Iron";
    }

    static {
        $cfr$clinit: {
            int var0 = 0;
            field_c = new int[10];
            var0 = 0;
            L0: while (true) {
              if (field_c.length <= var0) {
                field_d = 0;
                break $cfr$clinit;
              } else {
                L1: {
                  if (var0 != 0) {
                    field_c[var0] = 51 * (var0 + 1) << -1044268176;
                    break L1;
                  } else {
                    field_c[var0] = 20 * var0 - -20 << 700938480;
                    break L1;
                  }
                }
                if (2 < var0) {
                  field_c[var0] = hi.a(field_c[var0], (-2 + var0) * 22 << -482023032);
                  var0++;
                  continue L0;
                } else {
                  var0++;
                  continue L0;
                }
              }
            }
        }
    }
}
