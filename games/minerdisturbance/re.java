/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class re implements uj {
    static int[] field_c;
    static ji[] field_a;
    static int field_b;
    static int field_d;

    final static void a(int param0, byte[] param1, int[] param2, int param3, int param4) {
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
            var5_int = 0;
            L1: while (true) {
              if (mg.field_e.length <= var5_int) {
                break L0;
              } else {
                param4 = mg.field_e[var5_int];
                var6 = var5_int << 4;
                L2: while (true) {
                  int incrementValue$12 = param4;
                  param4--;
                  if (incrementValue$12 == 0) {
                    var5_int++;
                    continue L1;
                  } else {
                    int incrementValue$13 = var6;
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
            stackOut_8_0 = (RuntimeException) var5;
            stackOut_8_1 = new StringBuilder().append("re.F(").append(0).append(',');
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param1 == null) {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L3;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L3;
            }
          }
          L4: {
            stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
            stackOut_11_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_11_2).append(',');
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param2 == null) {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L4;
            } else {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L4;
            }
          }
          throw lj.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    public final void a(boolean param0) {
        tb.field_a = 1;
        gd.field_x = 0;
        if (param0) {
            Object var3 = null;
            int discarded$0 = re.a(-10, false, true, (String) null, false, (String) null);
        }
    }

    final static String a(String param0) {
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
            var4 = 0;
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
            stackOut_6_0 = (RuntimeException) var2;
            stackOut_6_1 = new StringBuilder().append("re.E(");
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param0 == null) {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L2;
            } else {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L2;
            }
          }
          throw lj.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + ',' + 0 + ')');
        }
        return stackIn_5_0;
    }

    final static int a(int param0, boolean param1, boolean param2, String param3, boolean param4, String param5) {
        try {
            RuntimeException var6 = null;
            int var6_int = 0;
            int var7 = 0;
            Throwable var8_ref_Throwable = null;
            int var8 = 0;
            int var9 = 0;
            String var10 = null;
            CharSequence var11 = null;
            int stackIn_6_0 = 0;
            int stackIn_29_0 = 0;
            int stackIn_42_0 = 0;
            int stackIn_45_0 = 0;
            int stackIn_72_0 = 0;
            int stackIn_74_0 = 0;
            RuntimeException stackIn_77_0 = null;
            StringBuilder stackIn_77_1 = null;
            RuntimeException stackIn_78_0 = null;
            StringBuilder stackIn_78_1 = null;
            RuntimeException stackIn_79_0 = null;
            StringBuilder stackIn_79_1 = null;
            String stackIn_79_2 = null;
            RuntimeException stackIn_80_0 = null;
            StringBuilder stackIn_80_1 = null;
            RuntimeException stackIn_81_0 = null;
            StringBuilder stackIn_81_1 = null;
            RuntimeException stackIn_82_0 = null;
            StringBuilder stackIn_82_1 = null;
            String stackIn_82_2 = null;
            Throwable decompiledCaughtException = null;
            int stackOut_5_0 = 0;
            int stackOut_28_0 = 0;
            int stackOut_41_0 = 0;
            int stackOut_40_0 = 0;
            int stackOut_44_0 = 0;
            int stackOut_43_0 = 0;
            int stackOut_71_0 = 0;
            int stackOut_73_0 = 0;
            RuntimeException stackOut_76_0 = null;
            StringBuilder stackOut_76_1 = null;
            RuntimeException stackOut_78_0 = null;
            StringBuilder stackOut_78_1 = null;
            String stackOut_78_2 = null;
            RuntimeException stackOut_77_0 = null;
            StringBuilder stackOut_77_1 = null;
            String stackOut_77_2 = null;
            RuntimeException stackOut_79_0 = null;
            StringBuilder stackOut_79_1 = null;
            RuntimeException stackOut_81_0 = null;
            StringBuilder stackOut_81_1 = null;
            String stackOut_81_2 = null;
            RuntimeException stackOut_80_0 = null;
            StringBuilder stackOut_80_1 = null;
            String stackOut_80_2 = null;
            var9 = MinerDisturbance.field_ab;
            try {
              L0: {
                L1: {
                  if (null == ci.field_i) {
                    if (!ed.a(param4, (byte) -126)) {
                      stackOut_5_0 = -1;
                      stackIn_6_0 = stackOut_5_0;
                      return stackIn_6_0;
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
                        int discarded$10 = 0;
                        tb.field_d = qg.a(ne.field_Q, param5, 0, (String) null);
                        break L3;
                      } else {
                        int discarded$11 = 0;
                        tb.field_d = sl.a((byte) 86, param3, param5);
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
                      if (var6_int == 0) {
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
                          if (var6_int == 1) {
                            break L7;
                          } else {
                            if (var6_int == 8) {
                              si.a(-67);
                              ek.field_c = false;
                              stackOut_28_0 = var6_int;
                              stackIn_29_0 = stackOut_28_0;
                              return stackIn_29_0;
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
                    int discarded$12 = -9319;
                    if (kj.b()) {
                      L9: {
                        ne.field_Q = kj.field_a.h(71);
                        wj.field_j = kj.field_a.d((byte) -54);
                        int discarded$13 = kj.field_a.d((byte) -54);
                        pj.field_a = kj.field_a.e(-96);
                        var10 = kj.field_a.j(103);
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
                          int discarded$14 = kj.field_a.d((byte) -54);
                          int discarded$15 = kj.field_a.d((byte) -54);
                          int discarded$16 = kj.field_a.b((byte) 33);
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
                        var11 = (CharSequence) (Object) ti.field_J;
                        in.field_b = cl.a(-95, var11);
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
                        if (var10 == null) {
                          break L16;
                        } else {
                          nc.a(bm.c(-93), var10, (byte) 78);
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
                                  Object discarded$17 = lk.a((byte) 18, "unzap", bm.c(-96));
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
                            int discarded$18 = 95;
                            Object discarded$19 = lk.a("zap", bm.c(-111), 16715, new Object[1]);
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
                        if (pj.field_a > 0) {
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
                          return stackIn_72_0;
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
                stackOut_73_0 = -33;
                stackIn_74_0 = stackOut_73_0;
                break L0;
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter2) {
              decompiledCaughtException = decompiledCaughtParameter2;
              L25: {
                var6 = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_76_0 = (RuntimeException) var6;
                stackOut_76_1 = new StringBuilder().append("re.C(").append(param0).append(',').append(false).append(',').append(param2).append(',');
                stackIn_78_0 = stackOut_76_0;
                stackIn_78_1 = stackOut_76_1;
                stackIn_77_0 = stackOut_76_0;
                stackIn_77_1 = stackOut_76_1;
                if (param3 == null) {
                  stackOut_78_0 = (RuntimeException) (Object) stackIn_78_0;
                  stackOut_78_1 = (StringBuilder) (Object) stackIn_78_1;
                  stackOut_78_2 = "null";
                  stackIn_79_0 = stackOut_78_0;
                  stackIn_79_1 = stackOut_78_1;
                  stackIn_79_2 = stackOut_78_2;
                  break L25;
                } else {
                  stackOut_77_0 = (RuntimeException) (Object) stackIn_77_0;
                  stackOut_77_1 = (StringBuilder) (Object) stackIn_77_1;
                  stackOut_77_2 = "{...}";
                  stackIn_79_0 = stackOut_77_0;
                  stackIn_79_1 = stackOut_77_1;
                  stackIn_79_2 = stackOut_77_2;
                  break L25;
                }
              }
              L26: {
                stackOut_79_0 = (RuntimeException) (Object) stackIn_79_0;
                stackOut_79_1 = ((StringBuilder) (Object) stackIn_79_1).append(stackIn_79_2).append(',').append(param4).append(',');
                stackIn_81_0 = stackOut_79_0;
                stackIn_81_1 = stackOut_79_1;
                stackIn_80_0 = stackOut_79_0;
                stackIn_80_1 = stackOut_79_1;
                if (param5 == null) {
                  stackOut_81_0 = (RuntimeException) (Object) stackIn_81_0;
                  stackOut_81_1 = (StringBuilder) (Object) stackIn_81_1;
                  stackOut_81_2 = "null";
                  stackIn_82_0 = stackOut_81_0;
                  stackIn_82_1 = stackOut_81_1;
                  stackIn_82_2 = stackOut_81_2;
                  break L26;
                } else {
                  stackOut_80_0 = (RuntimeException) (Object) stackIn_80_0;
                  stackOut_80_1 = (StringBuilder) (Object) stackIn_80_1;
                  stackOut_80_2 = "{...}";
                  stackIn_82_0 = stackOut_80_0;
                  stackIn_82_1 = stackOut_80_1;
                  stackIn_82_2 = stackOut_80_2;
                  break L26;
                }
              }
              throw lj.a((Throwable) (Object) stackIn_82_0, stackIn_82_2 + ')');
            }
            return stackIn_74_0;
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void a() {
        field_a = null;
        field_c = null;
    }

    public final String a(byte param0) {
        int var2 = -121 % ((-33 - param0) / 62);
        return "Make Ore Iron";
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        int var0 = 0;
        field_c = new int[10];
        var0 = 0;
        L0: while (true) {
          if (field_c.length <= var0) {
            field_d = 0;
            return;
          } else {
            L1: {
              if (var0 != 0) {
                field_c[var0] = 51 * (var0 + 1) << 16;
                break L1;
              } else {
                field_c[var0] = 20 * var0 - -20 << 16;
                break L1;
              }
            }
            if (2 < var0) {
              field_c[var0] = hi.a(field_c[var0], (-2 + var0) * 22 << 8);
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
