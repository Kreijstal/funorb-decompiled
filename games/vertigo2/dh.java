/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class dh {
    static int[] field_d;
    static String field_b;
    static String field_f;
    static String field_e;
    static String field_c;
    static String field_a;

    final static boolean a(byte param0) {
        return rm.a((byte) -125, ie.field_Nb, sm.field_Kb);
    }

    abstract byte[] b(int param0);

    final static void a(int param0, int param1, boolean param2) {
        fm.field_d = param1;
        cg.field_d = param0;
        ln.field_d.b(param0, -24066);
    }

    abstract void a(byte[] param0, boolean param1);

    public static void a(int param0) {
        field_e = null;
        field_a = null;
        field_f = null;
        field_c = null;
        field_d = null;
        field_b = null;
    }

    final static void a(int param0, byte param1, java.awt.Canvas param2, int param3) {
        java.awt.Graphics var4 = null;
        Exception var4_ref = null;
        RuntimeException var4_ref2 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        Throwable decompiledCaughtException = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        try {
          L0: {
            try {
              L1: {
                L2: {
                  var4 = param2.getGraphics();
                  if (param1 < -2) {
                    break L2;
                  } else {
                    field_d = null;
                    break L2;
                  }
                }
                ro.field_g.a(var4, param3, 15698, param0);
                var4.dispose();
                break L1;
              }
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              L3: {
                var4_ref = (Exception) (Object) decompiledCaughtException;
                param2.repaint();
                break L3;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          L4: {
            var4_ref2 = (RuntimeException) (Object) decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) var4_ref2;
            stackOut_6_1 = new StringBuilder().append("dh.I(").append(param0).append(44).append(param1).append(44);
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param2 == null) {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L4;
            } else {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L4;
            }
          }
          throw wn.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + 44 + param3 + 41);
        }
    }

    final static void a(byte param0, String param1, int param2, String param3, int param4, String param5) {
        tn var6 = null;
        try {
            if (param0 >= -3) {
                field_a = null;
            }
            var6 = new tn(param2, param5, param4, param3, param1);
            in.a(var6, 640);
        } catch (RuntimeException runtimeException) {
            throw wn.a((Throwable) (Object) runtimeException, "dh.F(" + param0 + 44 + (param1 != null ? "{...}" : "null") + 44 + param2 + 44 + (param3 != null ? "{...}" : "null") + 44 + param4 + 44 + (param5 != null ? "{...}" : "null") + 41);
        }
    }

    final static int a(int param0, boolean param1, String param2, String param3, int param4, boolean param5) {
        try {
            RuntimeException var6 = null;
            int var6_int = 0;
            String var6_ref = null;
            int var7 = 0;
            Throwable var8_ref_Throwable = null;
            int var8 = 0;
            int var9 = 0;
            Object var10 = null;
            Object var11 = null;
            CharSequence var12 = null;
            int stackIn_5_0 = 0;
            int stackIn_31_0 = 0;
            int stackIn_41_0 = 0;
            int stackIn_46_0 = 0;
            int stackIn_49_0 = 0;
            int stackIn_52_0 = 0;
            int stackIn_81_0 = 0;
            int stackIn_93_0 = 0;
            int stackIn_95_0 = 0;
            int stackIn_104_0 = 0;
            int stackIn_106_0 = 0;
            RuntimeException stackIn_108_0 = null;
            StringBuilder stackIn_108_1 = null;
            RuntimeException stackIn_109_0 = null;
            StringBuilder stackIn_109_1 = null;
            RuntimeException stackIn_110_0 = null;
            StringBuilder stackIn_110_1 = null;
            String stackIn_110_2 = null;
            RuntimeException stackIn_111_0 = null;
            StringBuilder stackIn_111_1 = null;
            RuntimeException stackIn_112_0 = null;
            StringBuilder stackIn_112_1 = null;
            RuntimeException stackIn_113_0 = null;
            StringBuilder stackIn_113_1 = null;
            String stackIn_113_2 = null;
            Throwable decompiledCaughtException = null;
            int stackOut_4_0 = 0;
            int stackOut_30_0 = 0;
            int stackOut_40_0 = 0;
            int stackOut_39_0 = 0;
            int stackOut_45_0 = 0;
            int stackOut_44_0 = 0;
            int stackOut_48_0 = 0;
            int stackOut_47_0 = 0;
            int stackOut_51_0 = 0;
            int stackOut_50_0 = 0;
            int stackOut_80_0 = 0;
            int stackOut_94_0 = 0;
            int stackOut_92_0 = 0;
            int stackOut_103_0 = 0;
            int stackOut_105_0 = 0;
            RuntimeException stackOut_107_0 = null;
            StringBuilder stackOut_107_1 = null;
            RuntimeException stackOut_109_0 = null;
            StringBuilder stackOut_109_1 = null;
            String stackOut_109_2 = null;
            RuntimeException stackOut_108_0 = null;
            StringBuilder stackOut_108_1 = null;
            String stackOut_108_2 = null;
            RuntimeException stackOut_110_0 = null;
            StringBuilder stackOut_110_1 = null;
            RuntimeException stackOut_112_0 = null;
            StringBuilder stackOut_112_1 = null;
            String stackOut_112_2 = null;
            RuntimeException stackOut_111_0 = null;
            StringBuilder stackOut_111_1 = null;
            String stackOut_111_2 = null;
            var9 = Vertigo2.field_L ? 1 : 0;
            try {
              L0: {
                L1: {
                  if (null == lo.field_k) {
                    if (ce.a((byte) 13, param5)) {
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
                  if (nn.field_w == rg.field_d) {
                    L3: {
                      if (param5) {
                        var11 = null;
                        qn.field_y = dp.a(param2, (String) null, (byte) -7, false, tn.field_p);
                        break L3;
                      } else {
                        qn.field_y = kq.a(false, param2, param0 ^ -24430, param3);
                        break L3;
                      }
                    }
                    uh.field_Wb.field_u = 0;
                    uh.field_Wb.f(14, -47);
                    uh.field_Wb.f(qn.field_y.a((byte) -83).field_b, param0 ^ 24323);
                    lf.d(72, -1);
                    rg.field_d = vi.field_D;
                    break L2;
                  } else {
                    break L2;
                  }
                }
                L4: {
                  if (rg.field_d == vi.field_D) {
                    if (c.a(1, (byte) -104)) {
                      var6_int = id.field_f.h(-11);
                      id.field_f.field_u = 0;
                      if (var6_int != 0) {
                        lc.field_f = var6_int;
                        ca.field_b = -1;
                        rg.field_d = hj.field_f;
                        break L4;
                      } else {
                        rg.field_d = gd.field_l;
                        break L4;
                      }
                    } else {
                      break L4;
                    }
                  } else {
                    break L4;
                  }
                }
                L5: {
                  if (gd.field_l != rg.field_d) {
                    break L5;
                  } else {
                    if (c.a(8, (byte) -104)) {
                      dc.field_F = id.field_f.i(-31016);
                      id.field_f.field_u = 0;
                      wl.a(param5, param1, (byte) 101, param4, qn.field_y);
                      rg.field_d = ir.field_c;
                      break L5;
                    } else {
                      break L5;
                    }
                  }
                }
                L6: {
                  if (ir.field_c != rg.field_d) {
                    break L6;
                  } else {
                    if (c.a(1, (byte) -104)) {
                      L7: {
                        var6_int = id.field_f.h(-11);
                        lc.field_f = var6_int;
                        id.field_f.field_u = 0;
                        go.field_g = null;
                        if (var6_int == 0) {
                          break L7;
                        } else {
                          if (var6_int == 1) {
                            break L7;
                          } else {
                            if (var6_int == 8) {
                              rm.b((byte) -11);
                              gn.field_d = false;
                              stackOut_30_0 = var6_int;
                              stackIn_31_0 = stackOut_30_0;
                              return stackIn_31_0;
                            } else {
                              ca.field_b = -1;
                              rg.field_d = hj.field_f;
                              break L6;
                            }
                          }
                        }
                      }
                      rg.field_d = Vertigo2.field_E;
                      ca.field_b = -1;
                      break L6;
                    } else {
                      break L6;
                    }
                  }
                }
                L8: {
                  if (rg.field_d != Vertigo2.field_E) {
                    break L8;
                  } else {
                    if (!dl.b((byte) -126)) {
                      break L8;
                    } else {
                      L9: {
                        tn.field_p = id.field_f.i(-31016);
                        nb.field_A = param2;
                        fn.field_z = id.field_f.h(-11);
                        uh.field_oc = id.field_f.h(param0 + -24440);
                        q.field_y = id.field_f.a((byte) -11);
                        var6_ref = id.field_f.k(param0 + -24553);
                        var7 = id.field_f.h(-11);
                        if (0 != (var7 & 1)) {
                          g.a(param0 ^ 24429);
                          break L9;
                        } else {
                          break L9;
                        }
                      }
                      L10: {
                        if ((var7 & 16) == 0) {
                          stackOut_40_0 = 0;
                          stackIn_41_0 = stackOut_40_0;
                          break L10;
                        } else {
                          stackOut_39_0 = 1;
                          stackIn_41_0 = stackOut_39_0;
                          break L10;
                        }
                      }
                      L11: {
                        lo.field_i = stackIn_41_0 != 0;
                        if (!param5) {
                          L12: {
                            if ((var7 & 8) == 0) {
                              stackOut_45_0 = 0;
                              stackIn_46_0 = stackOut_45_0;
                              break L12;
                            } else {
                              stackOut_44_0 = 1;
                              stackIn_46_0 = stackOut_44_0;
                              break L12;
                            }
                          }
                          L13: {
                            pe.field_r = stackIn_46_0 != 0;
                            if ((var7 & 4) == 0) {
                              stackOut_48_0 = 0;
                              stackIn_49_0 = stackOut_48_0;
                              break L13;
                            } else {
                              stackOut_47_0 = 1;
                              stackIn_49_0 = stackOut_47_0;
                              break L13;
                            }
                          }
                          L14: {
                            df.field_m = stackIn_49_0 != 0;
                            if ((2 & var7) == 0) {
                              stackOut_51_0 = 0;
                              stackIn_52_0 = stackOut_51_0;
                              break L14;
                            } else {
                              stackOut_50_0 = 1;
                              stackIn_52_0 = stackOut_50_0;
                              break L14;
                            }
                          }
                          hj.field_b = stackIn_52_0 != 0;
                          if (pe.field_r) {
                            hj.field_b = true;
                            break L11;
                          } else {
                            break L11;
                          }
                        } else {
                          break L11;
                        }
                      }
                      L15: {
                        if (!lm.field_G) {
                          break L15;
                        } else {
                          int discarded$5 = id.field_f.h(param0 + -24440);
                          int discarded$6 = id.field_f.h(-11);
                          int discarded$7 = id.field_f.b(true);
                          ao.field_H = id.field_f.a((byte) -11);
                          qh.field_d = new byte[ao.field_H];
                          var8 = 0;
                          L16: while (true) {
                            if (var8 >= ao.field_H) {
                              break L15;
                            } else {
                              qh.field_d[var8] = id.field_f.g(96);
                              var8++;
                              continue L16;
                            }
                          }
                        }
                      }
                      L17: {
                        qe.field_V = id.field_f.f(128);
                        var12 = (CharSequence) (Object) qe.field_V;
                        Vertigo2.field_F = rc.a(var12, 320);
                        rc.field_b = id.field_f.h(-11);
                        rg.field_d = bm.field_I;
                        if (qn.field_y.a((byte) -83) == lb.field_e) {
                          li.field_j.a(ob.e((byte) -93), (byte) -121);
                          break L17;
                        } else {
                          if (qn.field_y.a((byte) -83) == rf.field_n) {
                            la.field_i.a(ob.e((byte) 116), (byte) -99);
                            break L17;
                          } else {
                            break L17;
                          }
                        }
                      }
                      L18: {
                        gn.field_d = false;
                        if (var6_ref == null) {
                          break L18;
                        } else {
                          be.a(var6_ref, -1, ob.e((byte) -67));
                          break L18;
                        }
                      }
                      L19: {
                        L20: {
                          if (q.field_y > 0) {
                            break L20;
                          } else {
                            if (df.field_m) {
                              break L20;
                            } else {
                              try {
                                L21: {
                                  Object discarded$8 = je.a(ob.e((byte) 127), false, "unzap");
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
                            Object discarded$9 = je.a((byte) -63, "zap", ob.e((byte) -117), new Object[1]);
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
                        if (0 >= q.field_y) {
                          break L25;
                        } else {
                          pl.field_i = true;
                          break L25;
                        }
                      }
                      uh.field_Wb.b(he.field_u, 124);
                      var8 = 0;
                      L26: while (true) {
                        if (var8 >= 4) {
                          id.field_f.b(he.field_u, 61);
                          stackOut_80_0 = lc.field_f;
                          stackIn_81_0 = stackOut_80_0;
                          return stackIn_81_0;
                        } else {
                          he.field_u[var8] = he.field_u[var8] + 50;
                          var8++;
                          continue L26;
                        }
                      }
                    }
                  }
                }
                L27: {
                  if (param0 == 24429) {
                    break L27;
                  } else {
                    var10 = null;
                    dh.a(-113, (byte) 112, (java.awt.Canvas) null, 37);
                    break L27;
                  }
                }
                L28: {
                  if (rg.field_d != hj.field_f) {
                    break L28;
                  } else {
                    if (!dl.b((byte) 103)) {
                      break L28;
                    } else {
                      L29: {
                        rm.b((byte) 119);
                        if (7 != lc.field_f) {
                          break L29;
                        } else {
                          if (!gn.field_d) {
                            gn.field_d = true;
                            stackOut_94_0 = -1;
                            stackIn_95_0 = stackOut_94_0;
                            return stackIn_95_0;
                          } else {
                            break L29;
                          }
                        }
                      }
                      L30: {
                        if (7 == lc.field_f) {
                          lc.field_f = 3;
                          break L30;
                        } else {
                          break L30;
                        }
                      }
                      nk.field_Kb = id.field_f.f(128);
                      gn.field_d = false;
                      stackOut_92_0 = lc.field_f;
                      stackIn_93_0 = stackOut_92_0;
                      return stackIn_93_0;
                    }
                  }
                }
                L31: {
                  if (lo.field_k == null) {
                    if (gn.field_d) {
                      L32: {
                        if (30000L < qg.b(false)) {
                          nk.field_Kb = tf.field_m;
                          break L32;
                        } else {
                          nk.field_Kb = ba.field_c;
                          break L32;
                        }
                      }
                      gn.field_d = false;
                      stackOut_103_0 = 3;
                      stackIn_104_0 = stackOut_103_0;
                      return stackIn_104_0;
                    } else {
                      var6_int = cl.field_d;
                      cl.field_d = ne.field_P;
                      ne.field_P = var6_int;
                      gn.field_d = true;
                      break L31;
                    }
                  } else {
                    break L31;
                  }
                }
                stackOut_105_0 = -1;
                stackIn_106_0 = stackOut_105_0;
                break L0;
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter2) {
              decompiledCaughtException = decompiledCaughtParameter2;
              L33: {
                var6 = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_107_0 = (RuntimeException) var6;
                stackOut_107_1 = new StringBuilder().append("dh.H(").append(param0).append(44).append(param1).append(44);
                stackIn_109_0 = stackOut_107_0;
                stackIn_109_1 = stackOut_107_1;
                stackIn_108_0 = stackOut_107_0;
                stackIn_108_1 = stackOut_107_1;
                if (param2 == null) {
                  stackOut_109_0 = (RuntimeException) (Object) stackIn_109_0;
                  stackOut_109_1 = (StringBuilder) (Object) stackIn_109_1;
                  stackOut_109_2 = "null";
                  stackIn_110_0 = stackOut_109_0;
                  stackIn_110_1 = stackOut_109_1;
                  stackIn_110_2 = stackOut_109_2;
                  break L33;
                } else {
                  stackOut_108_0 = (RuntimeException) (Object) stackIn_108_0;
                  stackOut_108_1 = (StringBuilder) (Object) stackIn_108_1;
                  stackOut_108_2 = "{...}";
                  stackIn_110_0 = stackOut_108_0;
                  stackIn_110_1 = stackOut_108_1;
                  stackIn_110_2 = stackOut_108_2;
                  break L33;
                }
              }
              L34: {
                stackOut_110_0 = (RuntimeException) (Object) stackIn_110_0;
                stackOut_110_1 = ((StringBuilder) (Object) stackIn_110_1).append(stackIn_110_2).append(44);
                stackIn_112_0 = stackOut_110_0;
                stackIn_112_1 = stackOut_110_1;
                stackIn_111_0 = stackOut_110_0;
                stackIn_111_1 = stackOut_110_1;
                if (param3 == null) {
                  stackOut_112_0 = (RuntimeException) (Object) stackIn_112_0;
                  stackOut_112_1 = (StringBuilder) (Object) stackIn_112_1;
                  stackOut_112_2 = "null";
                  stackIn_113_0 = stackOut_112_0;
                  stackIn_113_1 = stackOut_112_1;
                  stackIn_113_2 = stackOut_112_2;
                  break L34;
                } else {
                  stackOut_111_0 = (RuntimeException) (Object) stackIn_111_0;
                  stackOut_111_1 = (StringBuilder) (Object) stackIn_111_1;
                  stackOut_111_2 = "{...}";
                  stackIn_113_0 = stackOut_111_0;
                  stackIn_113_1 = stackOut_111_1;
                  stackIn_113_2 = stackOut_111_2;
                  break L34;
                }
              }
              throw wn.a((Throwable) (Object) stackIn_113_0, stackIn_113_2 + 44 + param4 + 44 + param5 + 41);
            }
            return stackIn_106_0;
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = new int[8192];
        field_c = "Account created successfully!";
        field_f = "Unpacking animations";
        field_a = "Player";
        field_e = "coop complete";
        field_b = "Single-player game";
    }
}
