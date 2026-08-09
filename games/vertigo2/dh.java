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
        if (param0 != 127) {
            field_a = (String) null;
        }
        return rm.a((byte) -125, ie.field_Nb, sm.field_Kb);
    }

    abstract byte[] b(int param0);

    final static void a(int param0, int param1, boolean param2) {
        if (!param2) {
            field_f = (String) null;
        }
        fm.field_d = param1;
        cg.field_d = param0;
        ln.field_d.b(param0, -24066);
    }

    abstract void a(byte[] param0, boolean param1);

    public static void a(int param0) {
        field_e = null;
        if (param0 != -1) {
            return;
        }
        field_a = null;
        field_f = null;
        field_c = null;
        field_d = null;
        field_b = null;
    }

    final static void a(int param0, byte param1, java.awt.Canvas param2, int param3) {
        java.awt.Graphics var4 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        Throwable decompiledCaughtException = null;
        Exception var4_ref = null;
        RuntimeException var4_ref2 = null;
        try {
          L0: {
            try {
              L1: {
                L2: {
                  var4 = param2.getGraphics();
                  if (param1 < -2) {
                    break L2;
                  } else {
                    field_d = (int[]) null;
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
            stackIn_8_0 = (RuntimeException) (var4_ref2);

            stackIn_8_1 = new StringBuilder().append("dh.I(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "null";
              break L4;
            } else {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "{...}";
              break L4;
            }
          }
          throw wn.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ',' + param3 + ')');
        }
    }

    final static void a(byte param0, String param1, int param2, String param3, int param4, String param5) {
        tn var6 = null;
        try {
            if (param0 >= -3) {
                field_a = (String) null;
            }
            var6 = new tn(param2, param5, param4, param3, param1);
            in.a(var6, 640);
        } catch (RuntimeException runtimeException) {
            throw wn.a((Throwable) ((Object) runtimeException), "dh.F(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ',' + param4 + ',' + (param5 != null ? "{...}" : "null") + ')');
        }
    }

    final static int a(int param0, boolean param1, String param2, String param3, int param4, boolean param5) {
        try {
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
            RuntimeException stackIn_109_0 = null;
            StringBuilder stackIn_109_1 = null;
            RuntimeException stackIn_110_0 = null;
            StringBuilder stackIn_110_1 = null;
            String stackIn_110_2 = null;
            StringBuilder stackIn_112_1 = null;
            StringBuilder stackIn_113_1 = null;
            String stackIn_113_2 = null;
            int decompiledRegionSelector0 = 0;
            Throwable decompiledCaughtException = null;
            int var6_int = 0;
            String var6 = null;
            RuntimeException var6_ref = null;
            int var7 = 0;
            int var8 = 0;
            Throwable var8_ref_Throwable = null;
            int var9 = 0;
            java.awt.Canvas var10 = null;
            String var11 = null;
            CharSequence var12 = null;
            var9 = Vertigo2.field_L ? 1 : 0;
            try {
              L0: {
                L1: {
                  if (null == lo.field_k) {
                    if (ce.a((byte) 13, param5)) {
                      break L1;
                    } else {
                      stackIn_5_0 = -1;
                      decompiledRegionSelector0 = 0;
                      break L0;
                    }
                  } else {
                    break L1;
                  }
                }
                L2: {
                  if (nn.field_w == rg.field_d) {
                    L3: {
                      if (param5) {
                        var11 = (String) null;
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
                        if (-1 == (var6_int ^ -1)) {
                          break L7;
                        } else {
                          if ((var6_int ^ -1) == -2) {
                            break L7;
                          } else {
                            if ((var6_int ^ -1) == -9) {
                              rm.b((byte) -11);
                              gn.field_d = false;
                              stackIn_31_0 = var6_int;
                              decompiledRegionSelector0 = 1;
                              break L0;
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
                        var6 = id.field_f.k(param0 + -24553);
                        var7 = id.field_f.h(-11);
                        if (0 != (var7 & 1)) {
                          g.a(param0 ^ 24429);
                          break L9;
                        } else {
                          break L9;
                        }
                      }
                      L10: {
                        if (-1 == (var7 & 16 ^ -1)) {
                          stackIn_41_0 = 0;
                          break L10;
                        } else {
                          stackIn_41_0 = 1;
                          break L10;
                        }
                      }
                      L11: {
                        lo.field_i = stackIn_41_0 != 0;
                        if (!param5) {
                          L12: {
                            if ((var7 & 8) == 0) {
                              stackIn_46_0 = 0;
                              break L12;
                            } else {
                              stackIn_46_0 = 1;
                              break L12;
                            }
                          }
                          L13: {
                            pe.field_r = stackIn_46_0 != 0;
                            if ((var7 & 4) == 0) {
                              stackIn_49_0 = 0;
                              break L13;
                            } else {
                              stackIn_49_0 = 1;
                              break L13;
                            }
                          }
                          L14: {
                            df.field_m = stackIn_49_0 != 0;
                            if ((2 & var7) == 0) {
                              stackIn_52_0 = 0;
                              break L14;
                            } else {
                              stackIn_52_0 = 1;
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
                          id.field_f.h(param0 + -24440);
                          id.field_f.h(-11);
                          id.field_f.b(true);
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
                        var12 = (CharSequence) ((Object) qe.field_V);
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
                        if (var6 == null) {
                          break L18;
                        } else {
                          be.a(var6, -1, ob.e((byte) -67));
                          break L18;
                        }
                      }
                      L19: {
                        L20: {
                          if (-1 > (q.field_y ^ -1)) {
                            break L20;
                          } else {
                            if (df.field_m) {
                              break L20;
                            } else {
                              try {
                                L21: {
                                  je.a(ob.e((byte) 127), false, "unzap");
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
                            je.a((byte) -63, "zap", ob.e((byte) -117), new Object[]{eq.a(0, tn.field_p)});
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
                        if (-5 >= (var8 ^ -1)) {
                          id.field_f.b(he.field_u, 61);
                          stackIn_81_0 = lc.field_f;
                          decompiledRegionSelector0 = 2;
                          break L0;
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
                    var10 = (java.awt.Canvas) null;
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
                            stackIn_95_0 = -1;
                            decompiledRegionSelector0 = 4;
                            break L0;
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
                      stackIn_93_0 = lc.field_f;
                      decompiledRegionSelector0 = 3;
                      break L0;
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
                      stackIn_104_0 = 3;
                      decompiledRegionSelector0 = 5;
                      break L0;
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
                stackIn_106_0 = -1;
                decompiledRegionSelector0 = 6;
                break L0;
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter2) {
              decompiledCaughtException = decompiledCaughtParameter2;
              L33: {
                var6_ref = (RuntimeException) (Object) decompiledCaughtException;
                stackIn_109_0 = (RuntimeException) (var6_ref);

                stackIn_109_1 = new StringBuilder().append("dh.H(").append(param0).append(',').append(param1).append(',');

                if (param2 == null) {
                  stackIn_110_0 = (RuntimeException) ((Object) stackIn_109_0);
                  stackIn_110_1 = (StringBuilder) ((Object) stackIn_109_1);
                  stackIn_110_2 = "null";
                  break L33;
                } else {
                  stackIn_110_0 = (RuntimeException) ((Object) stackIn_109_0);
                  stackIn_110_1 = (StringBuilder) ((Object) stackIn_109_1);
                  stackIn_110_2 = "{...}";
                  break L33;
                }
              }
              L34: {


                stackIn_112_1 = ((StringBuilder) (Object) stackIn_110_1).append(stackIn_110_2).append(',');

                if (param3 == null) {
                  stackIn_110_0 = (RuntimeException) ((Object) stackIn_110_0);
                  stackIn_113_1 = (StringBuilder) ((Object) stackIn_112_1);
                  stackIn_113_2 = "null";
                  break L34;
                } else {
                  stackIn_110_0 = (RuntimeException) ((Object) stackIn_110_0);
                  stackIn_113_1 = (StringBuilder) ((Object) stackIn_112_1);
                  stackIn_113_2 = "{...}";
                  break L34;
                }
              }
              throw wn.a((Throwable) ((Object) stackIn_110_0), stackIn_113_2 + ',' + param4 + ',' + param5 + ')');
            }
            if (decompiledRegionSelector0 == 0) {
              return stackIn_5_0;
            } else {
              if (decompiledRegionSelector0 == 1) {
                return stackIn_31_0;
              } else {
                if (decompiledRegionSelector0 == 2) {
                  return stackIn_81_0;
                } else {
                  if (decompiledRegionSelector0 == 3) {
                    return stackIn_93_0;
                  } else {
                    if (decompiledRegionSelector0 == 4) {
                      return stackIn_95_0;
                    } else {
                      if (decompiledRegionSelector0 == 5) {
                        return stackIn_104_0;
                      } else {
                        return stackIn_106_0;
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

    static {
        field_d = new int[8192];
        field_c = "Account created successfully!";
        field_f = "Unpacking animations";
        field_a = "Player";
        field_e = "coop complete";
        field_b = "Single-player game";
    }
}
