/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wp {
    static String field_i;
    private mf field_j;
    static dh field_c;
    static mh field_k;
    private mf field_g;
    static vl field_f;
    private si field_a;
    static char field_h;
    private si field_e;
    static String field_b;
    static String field_d;

    final static void a(int param0, int param1, boolean param2) {
        int var3 = 0;
        int var4 = 0;
        String var5 = null;
        String var6 = null;
        Object var7 = null;
        CharSequence var8 = null;
        L0: {
          var3 = 76;
          if (tn.field_m == null) {
            break L0;
          } else {
            var4 = tn.field_m.a(param2, (byte) 95);
            if (var4 != 0) {
              L1: {
                if (2 != var4) {
                  break L1;
                } else {
                  if (tn.field_m.field_Mb == null) {
                    break L1;
                  } else {
                    if (!tn.field_m.field_Mb.equals((Object) (Object) "")) {
                      L2: {
                        if (tn.field_m.field_Mb.charAt(0) == 91) {
                          var5 = tn.field_m.field_Mb;
                          var6 = var5;
                          var6 = var5;
                          break L2;
                        } else {
                          var8 = (CharSequence) (Object) tn.field_m.field_Mb;
                          var5 = gb.a(var8, 57);
                          break L2;
                        }
                      }
                      L3: {
                        var6 = null;
                        if (ij.field_d == 0) {
                          var6 = jl.a(24943, var5, param1);
                          break L3;
                        } else {
                          break L3;
                        }
                      }
                      L4: {
                        if (ij.field_d != 1) {
                          break L4;
                        } else {
                          var6 = op.a(param1, false, var5);
                          break L4;
                        }
                      }
                      L5: {
                        if (ij.field_d == 2) {
                          var6 = me.a(var5, param1, 2);
                          break L5;
                        } else {
                          break L5;
                        }
                      }
                      L6: {
                        if (ij.field_d != 3) {
                          break L6;
                        } else {
                          var6 = uf.a(var5, param1, var5, -45);
                          break L6;
                        }
                      }
                      L7: {
                        if (var6 == null) {
                          break L7;
                        } else {
                          var7 = null;
                          wp.a((byte) 92, 0, (String) null, var6, var5, 2);
                          break L7;
                        }
                      }
                      ij.field_d = -1;
                      tn.field_m = null;
                      break L0;
                    } else {
                      break L1;
                    }
                  }
                }
              }
              ij.field_d = -1;
              tn.field_m = null;
              break L0;
            } else {
              break L0;
            }
          }
        }
    }

    private final oe a(int[] param0, String param1, int param2, String param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        Object var7 = null;
        Object stackIn_7_0 = null;
        oe stackIn_9_0 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        oe stackOut_8_0 = null;
        Object stackOut_6_0 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        try {
          L0: {
            var5_int = ((wp) this).field_j.a(param3, false);
            if (var5_int >= 0) {
              L1: {
                if (param2 == 2) {
                  break L1;
                } else {
                  var7 = null;
                  oe discarded$2 = ((wp) this).a((byte) -29, (String) null, (String) null);
                  break L1;
                }
              }
              var6 = ((wp) this).field_j.a(var5_int, -100, param1);
              if (var6 >= 0) {
                stackOut_8_0 = this.a(var6, 0, var5_int, param0);
                stackIn_9_0 = stackOut_8_0;
                break L0;
              } else {
                stackOut_6_0 = null;
                stackIn_7_0 = stackOut_6_0;
                return (oe) (Object) stackIn_7_0;
              }
            } else {
              return null;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5 = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) var5;
            stackOut_10_1 = new StringBuilder().append("wp.E(");
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param0 == null) {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L2;
            } else {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L2;
            }
          }
          L3: {
            stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
            stackOut_13_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_13_2).append(',');
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param1 == null) {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L3;
            } else {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L3;
            }
          }
          L4: {
            stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
            stackOut_16_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_16_2).append(',').append(param2).append(',');
            stackIn_18_0 = stackOut_16_0;
            stackIn_18_1 = stackOut_16_1;
            stackIn_17_0 = stackOut_16_0;
            stackIn_17_1 = stackOut_16_1;
            if (param3 == null) {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "null";
              stackIn_19_0 = stackOut_18_0;
              stackIn_19_1 = stackOut_18_1;
              stackIn_19_2 = stackOut_18_2;
              break L4;
            } else {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "{...}";
              stackIn_19_0 = stackOut_17_0;
              stackIn_19_1 = stackOut_17_1;
              stackIn_19_2 = stackOut_17_2;
              break L4;
            }
          }
          throw qb.a((Throwable) (Object) stackIn_19_0, stackIn_19_2 + ')');
        }
        return stackIn_9_0;
    }

    private final oe a(int param0, int param1, int[] param2, int param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        long var6 = 0L;
        oe var8 = null;
        bk var9 = null;
        oe stackIn_2_0 = null;
        Object stackIn_6_0 = null;
        Object stackIn_15_0 = null;
        oe stackIn_17_0 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_5_0 = null;
        oe stackOut_16_0 = null;
        Object stackOut_14_0 = null;
        oe stackOut_1_0 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        try {
          L0: {
            var5_int = ((param1 & -536866817) << 4 | param1 >>> 12) ^ param0;
            var5_int = var5_int | param1 << 16;
            var6 = (long)var5_int ^ 4294967296L;
            var8 = (oe) (Object) ((wp) this).field_e.a(-87, var6);
            if (var8 == null) {
              L1: {
                field_d = null;
                if (param2 == null) {
                  break L1;
                } else {
                  if (param2[0] > 0) {
                    break L1;
                  } else {
                    stackOut_5_0 = null;
                    stackIn_6_0 = stackOut_5_0;
                    return (oe) (Object) stackIn_6_0;
                  }
                }
              }
              L2: {
                var9 = (bk) (Object) ((wp) this).field_a.a(-87, var6);
                if (var9 == null) {
                  var9 = bk.a(((wp) this).field_g, param1, param0);
                  if (var9 != null) {
                    ((wp) this).field_a.a(34, (nm) (Object) var9, var6);
                    break L2;
                  } else {
                    return null;
                  }
                } else {
                  break L2;
                }
              }
              var8 = var9.a(param2);
              if (var8 != null) {
                var9.b((byte) 111);
                ((wp) this).field_e.a(34, (nm) (Object) var8, var6);
                stackOut_16_0 = (oe) var8;
                stackIn_17_0 = stackOut_16_0;
                break L0;
              } else {
                stackOut_14_0 = null;
                stackIn_15_0 = stackOut_14_0;
                return (oe) (Object) stackIn_15_0;
              }
            } else {
              stackOut_1_0 = (oe) var8;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5 = decompiledCaughtException;
            stackOut_18_0 = (RuntimeException) var5;
            stackOut_18_1 = new StringBuilder().append("wp.K(").append(param0).append(',').append(param1).append(',');
            stackIn_20_0 = stackOut_18_0;
            stackIn_20_1 = stackOut_18_1;
            stackIn_19_0 = stackOut_18_0;
            stackIn_19_1 = stackOut_18_1;
            if (param2 == null) {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "null";
              stackIn_21_0 = stackOut_20_0;
              stackIn_21_1 = stackOut_20_1;
              stackIn_21_2 = stackOut_20_2;
              break L3;
            } else {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "{...}";
              stackIn_21_0 = stackOut_19_0;
              stackIn_21_1 = stackOut_19_1;
              stackIn_21_2 = stackOut_19_2;
              break L3;
            }
          }
          throw qb.a((Throwable) (Object) stackIn_21_0, stackIn_21_2 + ',' + 0 + ')');
        }
        return stackIn_17_0;
    }

    final static void a(int param0, int param1) {
        ul.field_p = param1;
        if (!(null == m.field_f)) {
            m.field_f.a(param1, false);
        }
        if (!(null == dc.field_e)) {
            dc.field_e.a(true, param1);
        }
        if (param0 != 1) {
            field_i = null;
        }
    }

    final static int a(String param0, boolean param1, boolean param2, boolean param3, int param4, String param5) {
        try {
            RuntimeException var6 = null;
            int var6_int = 0;
            int var7 = 0;
            Throwable var8_ref_Throwable = null;
            int var8 = 0;
            int var9 = 0;
            Object var10 = null;
            String var11 = null;
            CharSequence var12 = null;
            int stackIn_5_0 = 0;
            int stackIn_29_0 = 0;
            int stackIn_41_0 = 0;
            int stackIn_44_0 = 0;
            int stackIn_47_0 = 0;
            int stackIn_53_0 = 0;
            int stackIn_81_0 = 0;
            int stackIn_89_0 = 0;
            int stackIn_93_0 = 0;
            int stackIn_102_0 = 0;
            int stackIn_104_0 = 0;
            RuntimeException stackIn_106_0 = null;
            StringBuilder stackIn_106_1 = null;
            RuntimeException stackIn_107_0 = null;
            StringBuilder stackIn_107_1 = null;
            RuntimeException stackIn_108_0 = null;
            StringBuilder stackIn_108_1 = null;
            String stackIn_108_2 = null;
            RuntimeException stackIn_109_0 = null;
            StringBuilder stackIn_109_1 = null;
            RuntimeException stackIn_110_0 = null;
            StringBuilder stackIn_110_1 = null;
            RuntimeException stackIn_111_0 = null;
            StringBuilder stackIn_111_1 = null;
            String stackIn_111_2 = null;
            Throwable decompiledCaughtException = null;
            int stackOut_4_0 = 0;
            int stackOut_28_0 = 0;
            int stackOut_40_0 = 0;
            int stackOut_39_0 = 0;
            int stackOut_43_0 = 0;
            int stackOut_42_0 = 0;
            int stackOut_46_0 = 0;
            int stackOut_45_0 = 0;
            int stackOut_52_0 = 0;
            int stackOut_51_0 = 0;
            int stackOut_80_0 = 0;
            int stackOut_88_0 = 0;
            int stackOut_92_0 = 0;
            int stackOut_101_0 = 0;
            int stackOut_103_0 = 0;
            RuntimeException stackOut_105_0 = null;
            StringBuilder stackOut_105_1 = null;
            RuntimeException stackOut_107_0 = null;
            StringBuilder stackOut_107_1 = null;
            String stackOut_107_2 = null;
            RuntimeException stackOut_106_0 = null;
            StringBuilder stackOut_106_1 = null;
            String stackOut_106_2 = null;
            RuntimeException stackOut_108_0 = null;
            StringBuilder stackOut_108_1 = null;
            RuntimeException stackOut_110_0 = null;
            StringBuilder stackOut_110_1 = null;
            String stackOut_110_2 = null;
            RuntimeException stackOut_109_0 = null;
            StringBuilder stackOut_109_1 = null;
            String stackOut_109_2 = null;
            var9 = BrickABrac.field_J ? 1 : 0;
            try {
              L0: {
                L1: {
                  if (eq.field_g == null) {
                    if (ad.a(param1, 10000)) {
                      break L1;
                    } else {
                      stackOut_4_0 = -1;
                      stackIn_5_0 = stackOut_4_0;
                      return stackIn_5_0;
                    }
                  } else {
                    break L1;
                  }
                }
                L2: {
                  if (pi.field_u != rf.field_b) {
                    break L2;
                  } else {
                    L3: {
                      if (param1) {
                        var10 = null;
                        cg.field_s = he.a(sl.field_v, 20, false, param5, (String) null);
                        break L3;
                      } else {
                        cg.field_s = ih.a(param0, false, param5, (byte) -109);
                        break L3;
                      }
                    }
                    k.field_h.field_l = 0;
                    k.field_h.a(28, 14);
                    k.field_h.a(107, cg.field_s.a(13).field_a);
                    cr.a(-1, 10000);
                    rf.field_b = gf.field_c;
                    break L2;
                  }
                }
                L4: {
                  if (rf.field_b != gf.field_c) {
                    break L4;
                  } else {
                    if (vd.a(20, 1)) {
                      var6_int = jl.field_e.l(255);
                      jl.field_e.field_l = 0;
                      if (var6_int == 0) {
                        rf.field_b = dc.field_f;
                        break L4;
                      } else {
                        si.field_a = var6_int;
                        ga.field_j = -1;
                        rf.field_b = km.field_k;
                        break L4;
                      }
                    } else {
                      break L4;
                    }
                  }
                }
                L5: {
                  if (rf.field_b == dc.field_f) {
                    if (!vd.a(20, 8)) {
                      break L5;
                    } else {
                      bj.field_ab = jl.field_e.g(-32768);
                      jl.field_e.field_l = 0;
                      mp.a(param4, cg.field_s, param1, param3, false);
                      rf.field_b = rq.field_c;
                      break L5;
                    }
                  } else {
                    break L5;
                  }
                }
                L6: {
                  if (rf.field_b == rq.field_c) {
                    if (!vd.a(20, 1)) {
                      break L6;
                    } else {
                      L7: {
                        var6_int = jl.field_e.l(255);
                        ai.field_t = null;
                        si.field_a = var6_int;
                        jl.field_e.field_l = 0;
                        if (var6_int == 0) {
                          break L7;
                        } else {
                          if (var6_int == 1) {
                            break L7;
                          } else {
                            if (var6_int == 8) {
                              hn.a((byte) 52);
                              pf.field_d = false;
                              stackOut_28_0 = var6_int;
                              stackIn_29_0 = stackOut_28_0;
                              return stackIn_29_0;
                            } else {
                              ga.field_j = -1;
                              rf.field_b = km.field_k;
                              break L6;
                            }
                          }
                        }
                      }
                      ga.field_j = -1;
                      rf.field_b = fo.field_g;
                      break L6;
                    }
                  } else {
                    break L6;
                  }
                }
                L8: {
                  if (rf.field_b != fo.field_g) {
                    break L8;
                  } else {
                    if (!um.b((byte) -80)) {
                      break L8;
                    } else {
                      L9: {
                        sl.field_v = jl.field_e.g(-32768);
                        gd.field_b = param5;
                        kb.field_Yb = jl.field_e.l(255);
                        gh.field_f = jl.field_e.l(255);
                        go.field_c = jl.field_e.i(65280);
                        var11 = jl.field_e.m(0);
                        var7 = jl.field_e.l(255);
                        if ((var7 & 1) != 0) {
                          n.a(-1);
                          break L9;
                        } else {
                          break L9;
                        }
                      }
                      L10: {
                        if (!param1) {
                          L11: {
                            if ((var7 & 2) == 0) {
                              stackOut_40_0 = 0;
                              stackIn_41_0 = stackOut_40_0;
                              break L11;
                            } else {
                              stackOut_39_0 = 1;
                              stackIn_41_0 = stackOut_39_0;
                              break L11;
                            }
                          }
                          L12: {
                            qo.field_I = stackIn_41_0 != 0;
                            if (-1 == (8 & var7)) {
                              stackOut_43_0 = 0;
                              stackIn_44_0 = stackOut_43_0;
                              break L12;
                            } else {
                              stackOut_42_0 = 1;
                              stackIn_44_0 = stackOut_42_0;
                              break L12;
                            }
                          }
                          L13: {
                            um.field_e = stackIn_44_0 != 0;
                            if (-1 == (4 & var7)) {
                              stackOut_46_0 = 0;
                              stackIn_47_0 = stackOut_46_0;
                              break L13;
                            } else {
                              stackOut_45_0 = 1;
                              stackIn_47_0 = stackOut_45_0;
                              break L13;
                            }
                          }
                          oo.field_r = stackIn_47_0 != 0;
                          if (um.field_e) {
                            qo.field_I = true;
                            break L10;
                          } else {
                            break L10;
                          }
                        } else {
                          break L10;
                        }
                      }
                      L14: {
                        if ((16 & var7) == 0) {
                          stackOut_52_0 = 0;
                          stackIn_53_0 = stackOut_52_0;
                          break L14;
                        } else {
                          stackOut_51_0 = 1;
                          stackIn_53_0 = stackOut_51_0;
                          break L14;
                        }
                      }
                      L15: {
                        ii.field_j = stackIn_53_0 != 0;
                        if (ec.field_O) {
                          int discarded$5 = jl.field_e.l(255);
                          int discarded$6 = jl.field_e.l(255);
                          int discarded$7 = jl.field_e.e(255);
                          ta.field_f = jl.field_e.i(65280);
                          gg.field_q = new byte[ta.field_f];
                          var8 = 0;
                          L16: while (true) {
                            if (ta.field_f <= var8) {
                              break L15;
                            } else {
                              gg.field_q[var8] = jl.field_e.b(true);
                              var8++;
                              continue L16;
                            }
                          }
                        } else {
                          break L15;
                        }
                      }
                      L17: {
                        tb.field_cb = jl.field_e.d(-1);
                        var12 = (CharSequence) (Object) tb.field_cb;
                        ih.field_d = gb.a(var12, 65);
                        fp.field_x = jl.field_e.l(255);
                        rf.field_b = q.field_i;
                        if (cg.field_s.a(13) == vh.field_X) {
                          uc.field_k.a(100, uc.e((byte) -66));
                          break L17;
                        } else {
                          if (cg.field_s.a(13) == de.field_v) {
                            ll.field_d.a(112, uc.e((byte) -81));
                            break L17;
                          } else {
                            break L17;
                          }
                        }
                      }
                      L18: {
                        pf.field_d = false;
                        if (var11 == null) {
                          break L18;
                        } else {
                          ui.a(-70, uc.e((byte) -112), var11);
                          break L18;
                        }
                      }
                      L19: {
                        L20: {
                          if (0 < go.field_c) {
                            break L20;
                          } else {
                            if (oo.field_r) {
                              break L20;
                            } else {
                              try {
                                L21: {
                                  Object discarded$8 = ne.a("unzap", -121, uc.e((byte) -100));
                                  break L21;
                                }
                              } catch (java.lang.Throwable decompiledCaughtParameter0) {
                                decompiledCaughtException = decompiledCaughtParameter0;
                                L22: {
                                  var8_ref_Throwable = decompiledCaughtException;
                                  break L22;
                                }
                              }
                              break L19;
                            }
                          }
                        }
                        try {
                          L23: {
                            Object discarded$9 = ne.a(new Object[1], 116, uc.e((byte) -75), "zap");
                            break L23;
                          }
                        } catch (java.lang.Throwable decompiledCaughtParameter1) {
                          decompiledCaughtException = decompiledCaughtParameter1;
                          L24: {
                            var8_ref_Throwable = decompiledCaughtException;
                            break L24;
                          }
                        }
                        break L19;
                      }
                      L25: {
                        if (go.field_c > 0) {
                          qb.field_u = true;
                          break L25;
                        } else {
                          break L25;
                        }
                      }
                      k.field_h.a(lc.field_a, -98);
                      var8 = 0;
                      L26: while (true) {
                        if (var8 >= 4) {
                          jl.field_e.a(lc.field_a, -62);
                          stackOut_80_0 = si.field_a;
                          stackIn_81_0 = stackOut_80_0;
                          return stackIn_81_0;
                        } else {
                          lc.field_a[var8] = lc.field_a[var8] + 50;
                          var8++;
                          continue L26;
                        }
                      }
                    }
                  }
                }
                L27: {
                  if (rf.field_b == km.field_k) {
                    if (um.b((byte) -41)) {
                      L28: {
                        hn.a((byte) 58);
                        if (si.field_a != 7) {
                          break L28;
                        } else {
                          if (pf.field_d) {
                            break L28;
                          } else {
                            pf.field_d = true;
                            stackOut_88_0 = -1;
                            stackIn_89_0 = stackOut_88_0;
                            return stackIn_89_0;
                          }
                        }
                      }
                      L29: {
                        if (si.field_a != 7) {
                          break L29;
                        } else {
                          si.field_a = 3;
                          break L29;
                        }
                      }
                      eo.field_e = jl.field_e.d(-1);
                      pf.field_d = false;
                      stackOut_92_0 = si.field_a;
                      stackIn_93_0 = stackOut_92_0;
                      return stackIn_93_0;
                    } else {
                      break L27;
                    }
                  } else {
                    break L27;
                  }
                }
                L30: {
                  if (eq.field_g == null) {
                    if (pf.field_d) {
                      L31: {
                        if (30000L >= de.f(-6792)) {
                          eo.field_e = gd.field_e;
                          break L31;
                        } else {
                          eo.field_e = hg.field_b;
                          break L31;
                        }
                      }
                      pf.field_d = false;
                      stackOut_101_0 = 3;
                      stackIn_102_0 = stackOut_101_0;
                      return stackIn_102_0;
                    } else {
                      var6_int = dl.field_b;
                      dl.field_b = pj.field_a;
                      pf.field_d = true;
                      pj.field_a = var6_int;
                      break L30;
                    }
                  } else {
                    break L30;
                  }
                }
                stackOut_103_0 = -1;
                stackIn_104_0 = stackOut_103_0;
                break L0;
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter2) {
              decompiledCaughtException = decompiledCaughtParameter2;
              L32: {
                var6 = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_105_0 = (RuntimeException) var6;
                stackOut_105_1 = new StringBuilder().append("wp.L(");
                stackIn_107_0 = stackOut_105_0;
                stackIn_107_1 = stackOut_105_1;
                stackIn_106_0 = stackOut_105_0;
                stackIn_106_1 = stackOut_105_1;
                if (param0 == null) {
                  stackOut_107_0 = (RuntimeException) (Object) stackIn_107_0;
                  stackOut_107_1 = (StringBuilder) (Object) stackIn_107_1;
                  stackOut_107_2 = "null";
                  stackIn_108_0 = stackOut_107_0;
                  stackIn_108_1 = stackOut_107_1;
                  stackIn_108_2 = stackOut_107_2;
                  break L32;
                } else {
                  stackOut_106_0 = (RuntimeException) (Object) stackIn_106_0;
                  stackOut_106_1 = (StringBuilder) (Object) stackIn_106_1;
                  stackOut_106_2 = "{...}";
                  stackIn_108_0 = stackOut_106_0;
                  stackIn_108_1 = stackOut_106_1;
                  stackIn_108_2 = stackOut_106_2;
                  break L32;
                }
              }
              L33: {
                stackOut_108_0 = (RuntimeException) (Object) stackIn_108_0;
                stackOut_108_1 = ((StringBuilder) (Object) stackIn_108_1).append(stackIn_108_2).append(',').append(param1).append(',').append(true).append(',').append(param3).append(',').append(param4).append(',');
                stackIn_110_0 = stackOut_108_0;
                stackIn_110_1 = stackOut_108_1;
                stackIn_109_0 = stackOut_108_0;
                stackIn_109_1 = stackOut_108_1;
                if (param5 == null) {
                  stackOut_110_0 = (RuntimeException) (Object) stackIn_110_0;
                  stackOut_110_1 = (StringBuilder) (Object) stackIn_110_1;
                  stackOut_110_2 = "null";
                  stackIn_111_0 = stackOut_110_0;
                  stackIn_111_1 = stackOut_110_1;
                  stackIn_111_2 = stackOut_110_2;
                  break L33;
                } else {
                  stackOut_109_0 = (RuntimeException) (Object) stackIn_109_0;
                  stackOut_109_1 = (StringBuilder) (Object) stackIn_109_1;
                  stackOut_109_2 = "{...}";
                  stackIn_111_0 = stackOut_109_0;
                  stackIn_111_1 = stackOut_109_1;
                  stackIn_111_2 = stackOut_109_2;
                  break L33;
                }
              }
              throw qb.a((Throwable) (Object) stackIn_111_0, stackIn_111_2 + ')');
            }
            return stackIn_104_0;
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static void a(byte param0, int param1, String param2, String param3, String param4, int param5) {
        gb var6 = null;
        try {
            var6 = new gb(2, param4, 0, param2, param3);
            n.a(0, var6);
        } catch (RuntimeException runtimeException) {
            throw qb.a((Throwable) (Object) runtimeException, "wp.B(" + 92 + ',' + 0 + ',' + (param2 != null ? "{...}" : "null") + ',' + (param3 != null ? "{...}" : "null") + ',' + (param4 != null ? "{...}" : "null") + ',' + 2 + ')');
        }
    }

    private final oe a(String param0, byte param1, String param2, int[] param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        Object stackIn_5_0 = null;
        oe stackIn_7_0 = null;
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
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        oe stackOut_6_0 = null;
        Object stackOut_4_0 = null;
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
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        try {
          L0: {
            var5_int = ((wp) this).field_g.a(param0, false);
            if (var5_int >= 0) {
              var6 = ((wp) this).field_g.a(var5_int, -67, param2);
              if (var6 >= 0) {
                stackOut_6_0 = this.a(var6, var5_int, param3, 0);
                stackIn_7_0 = stackOut_6_0;
                break L0;
              } else {
                stackOut_4_0 = null;
                stackIn_5_0 = stackOut_4_0;
                return (oe) (Object) stackIn_5_0;
              }
            } else {
              return null;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var5 = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) var5;
            stackOut_8_1 = new StringBuilder().append("wp.O(");
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param0 == null) {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L1;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L1;
            }
          }
          L2: {
            stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
            stackOut_11_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_11_2).append(',').append(-109).append(',');
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
              break L2;
            } else {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L2;
            }
          }
          L3: {
            stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
            stackOut_14_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_14_2).append(',');
            stackIn_16_0 = stackOut_14_0;
            stackIn_16_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param3 == null) {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L3;
            } else {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "{...}";
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              stackIn_17_2 = stackOut_15_2;
              break L3;
            }
          }
          throw qb.a((Throwable) (Object) stackIn_17_0, stackIn_17_2 + ')');
        }
        return stackIn_7_0;
    }

    final static void a(int param0, oe param1) {
        try {
            l discarded$0 = vp.a(108, param1);
        } catch (RuntimeException runtimeException) {
            throw qb.a((Throwable) (Object) runtimeException, "wp.A(" + 8 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final oe a(String param0, String param1, byte param2) {
        RuntimeException var4 = null;
        Object var5 = null;
        oe stackIn_3_0 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        oe stackOut_2_0 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        try {
          L0: {
            L1: {
              if (param2 >= 107) {
                break L1;
              } else {
                var5 = null;
                oe discarded$2 = this.a((int[]) null, (String) null, 67, (String) null);
                break L1;
              }
            }
            stackOut_2_0 = this.a((int[]) null, param0, 2, param1);
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var4;
            stackOut_4_1 = new StringBuilder().append("wp.I(");
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param0 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          L3: {
            stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
            stackOut_7_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(',');
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param1 == null) {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L3;
            } else {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L3;
            }
          }
          throw qb.a((Throwable) (Object) stackIn_10_0, stackIn_10_2 + ',' + param2 + ')');
        }
        return stackIn_3_0;
    }

    final oe a(int[] param0, int param1, int param2) {
        RuntimeException var4 = null;
        oe stackIn_2_0 = null;
        oe stackIn_5_0 = null;
        Object stackIn_8_0 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_7_0 = null;
        oe stackOut_4_0 = null;
        oe stackOut_1_0 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        try {
          if (((wp) this).field_j.c(-97) != 1) {
            if (((wp) this).field_j.c(-80, param1) != 1) {
              if (param2 <= -124) {
                throw new RuntimeException();
              } else {
                stackOut_7_0 = null;
                stackIn_8_0 = stackOut_7_0;
                return (oe) (Object) stackIn_8_0;
              }
            } else {
              stackOut_4_0 = this.a(0, 0, param1, param0);
              stackIn_5_0 = stackOut_4_0;
              return stackIn_5_0;
            }
          } else {
            stackOut_1_0 = this.a(param1, 0, 0, param0);
            stackIn_2_0 = stackOut_1_0;
            return stackIn_2_0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L0: {
            var4 = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) var4;
            stackOut_10_1 = new StringBuilder().append("wp.J(");
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param0 == null) {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L0;
            } else {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L0;
            }
          }
          throw qb.a((Throwable) (Object) stackIn_13_0, stackIn_13_2 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final static void a(boolean param0, byte param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        nj var3 = null;
        int var4 = 0;
        RuntimeException decompiledCaughtException = null;
        var4 = BrickABrac.field_J ? 1 : 0;
        try {
          L0: {
            L1: {
              var2_int = dl.field_f;
              if (0 != var2_int) {
                break L1;
              } else {
                uf.a(3, 0);
                break L1;
              }
            }
            var3 = (nj) (Object) ob.field_E.d(-31);
            L2: while (true) {
              if (var3 == null) {
                uf.a(var2_int + -dl.field_f, 0);
                break L0;
              } else {
                var3.c(0);
                var3 = (nj) (Object) ob.field_E.a((byte) 116);
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw qb.a((Throwable) (Object) var2, "wp.G(" + true + ',' + -51 + ')');
        }
    }

    final oe a(int param0, int[] param1, int param2) {
        RuntimeException var4 = null;
        oe stackIn_3_0 = null;
        oe stackIn_6_0 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        oe stackOut_2_0 = null;
        oe stackOut_5_0 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        try {
          if (((wp) this).field_g.c(-124) == 1) {
            stackOut_2_0 = this.a(param0, 0, param1, 0);
            stackIn_3_0 = stackOut_2_0;
            return stackIn_3_0;
          } else {
            if (1 != ((wp) this).field_g.c(-90, param0)) {
              L0: {
                if (param2 > 48) {
                  break L0;
                } else {
                  wp.a(-14, -17);
                  break L0;
                }
              }
              throw new RuntimeException();
            } else {
              stackOut_5_0 = this.a(0, param0, param1, 0);
              stackIn_6_0 = stackOut_5_0;
              return stackIn_6_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4 = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) var4;
            stackOut_10_1 = new StringBuilder().append("wp.M(").append(param0).append(',');
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param1 == null) {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L1;
            } else {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L1;
            }
          }
          throw qb.a((Throwable) (Object) stackIn_13_0, stackIn_13_2 + ',' + param2 + ')');
        }
    }

    public static void a(byte param0) {
        field_f = null;
        field_d = null;
        field_i = null;
        field_k = null;
        field_b = null;
        field_c = null;
    }

    final oe a(byte param0, String param1, String param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        oe stackIn_1_0 = null;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        oe stackOut_0_0 = null;
        RuntimeException stackOut_2_0 = null;
        StringBuilder stackOut_2_1 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        String stackOut_3_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        try {
          L0: {
            var4_int = 11 / ((param0 - -37) / 59);
            stackOut_0_0 = this.a(param2, (byte) -109, param1, (int[]) null);
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4 = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) var4;
            stackOut_2_1 = new StringBuilder().append("wp.C(").append(param0).append(',');
            stackIn_4_0 = stackOut_2_0;
            stackIn_4_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param1 == null) {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "null";
              stackIn_5_0 = stackOut_4_0;
              stackIn_5_1 = stackOut_4_1;
              stackIn_5_2 = stackOut_4_2;
              break L1;
            } else {
              stackOut_3_0 = (RuntimeException) (Object) stackIn_3_0;
              stackOut_3_1 = (StringBuilder) (Object) stackIn_3_1;
              stackOut_3_2 = "{...}";
              stackIn_5_0 = stackOut_3_0;
              stackIn_5_1 = stackOut_3_1;
              stackIn_5_2 = stackOut_3_2;
              break L1;
            }
          }
          L2: {
            stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
            stackOut_5_1 = ((StringBuilder) (Object) stackIn_5_1).append(stackIn_5_2).append(',');
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param2 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L2;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L2;
            }
          }
          throw qb.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + ')');
        }
        return stackIn_1_0;
    }

    private final oe a(int param0, int param1, int param2, int[] param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        long var6 = 0L;
        oe var8 = null;
        dr var9 = null;
        oe var10 = null;
        oe stackIn_2_0 = null;
        Object stackIn_6_0 = null;
        Object stackIn_9_0 = null;
        oe stackIn_13_0 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_5_0 = null;
        oe stackOut_12_0 = null;
        Object stackOut_8_0 = null;
        oe stackOut_1_0 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        try {
          L0: {
            var5_int = param0 ^ (param2 >>> 12 | (-1342173185 & param2) << 4);
            var5_int = var5_int | param2 << 16;
            var6 = (long)var5_int;
            var8 = (oe) (Object) ((wp) this).field_e.a(-88, var6);
            if (var8 == null) {
              L1: {
                if (param3 == null) {
                  break L1;
                } else {
                  if (0 < param3[0]) {
                    break L1;
                  } else {
                    stackOut_5_0 = null;
                    stackIn_6_0 = stackOut_5_0;
                    return (oe) (Object) stackIn_6_0;
                  }
                }
              }
              var9 = dr.a(((wp) this).field_j, param2, param0);
              if (var9 != null) {
                L2: {
                  var10 = var9.a();
                  var8 = var10;
                  ((wp) this).field_e.a(34, (nm) (Object) var8, var6);
                  if (param3 == null) {
                    break L2;
                  } else {
                    param3[0] = param3[0] - var10.field_m.length;
                    break L2;
                  }
                }
                stackOut_12_0 = (oe) var8;
                stackIn_13_0 = stackOut_12_0;
                break L0;
              } else {
                stackOut_8_0 = null;
                stackIn_9_0 = stackOut_8_0;
                return (oe) (Object) stackIn_9_0;
              }
            } else {
              stackOut_1_0 = (oe) var8;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5 = decompiledCaughtException;
            stackOut_14_0 = (RuntimeException) var5;
            stackOut_14_1 = new StringBuilder().append("wp.H(").append(param0).append(',').append(0).append(',').append(param2).append(',');
            stackIn_16_0 = stackOut_14_0;
            stackIn_16_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param3 == null) {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L3;
            } else {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "{...}";
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              stackIn_17_2 = stackOut_15_2;
              break L3;
            }
          }
          throw qb.a((Throwable) (Object) stackIn_17_0, stackIn_17_2 + ')');
        }
        return stackIn_13_0;
    }

    wp(mf param0, mf param1) {
        ((wp) this).field_a = new si(256);
        ((wp) this).field_e = new si(256);
        try {
            ((wp) this).field_j = param0;
            ((wp) this).field_g = param1;
        } catch (RuntimeException runtimeException) {
            throw qb.a((Throwable) (Object) runtimeException, "wp.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_i = "Play the game without logging in just yet";
        field_h = '/';
        field_b = "RuneScape clan";
        field_f = new vl();
    }
}
