/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ji extends kn {
    static ci field_N;
    static int field_S;
    static long field_U;
    static int field_R;
    static ed field_T;
    static fm field_V;
    static int field_O;
    static String field_Q;
    static boolean field_P;

    public static void i(int param0) {
        field_V = null;
        field_Q = null;
        field_T = null;
        field_N = null;
        if (param0 != 5849) {
            Object var2 = null;
            int discarded$0 = ji.a(-34, true, (String) null, (String) null, (byte) -54, true);
        }
    }

    final void a(int param0, mf param1, int param2, int param3, int param4, int param5) {
        kb var7 = null;
        L0: {
          super.a(param0, param1, param2, param3, param4 ^ param4, param5);
          var7 = vj.field_a;
          if (var7 == null) {
            break L0;
          } else {
            if (!((ji) this).a(param0, param5, param2, (byte) -117, param3)) {
              break L0;
            } else {
              if (((ji) this).field_p instanceof cj) {
                ((cj) (Object) ((ji) this).field_p).a(var7, -10925, (ji) this);
                vj.field_a = null;
                break L0;
              } else {
                if (!(var7.field_p instanceof cj)) {
                  break L0;
                } else {
                  ((cj) (Object) var7.field_p).a(var7, -10925, (ji) this);
                  vj.field_a = null;
                  break L0;
                }
              }
            }
          }
        }
    }

    final static String a(String param0, String param1, String param2, um param3, byte param4) {
        if (param4 < 15) {
            Object var6 = null;
            int discarded$0 = ji.a(74, true, (String) null, (String) null, (byte) 108, true);
        }
        if (!(param3.c((byte) 125))) {
            return param0;
        }
        return param2 + " - " + param3.c(param1, 0) + "%";
    }

    final static int a(int param0, boolean param1, String param2, String param3, byte param4, boolean param5) {
        try {
            int var6 = 0;
            int var7 = 0;
            String var7_ref_String = null;
            int var8 = 0;
            Throwable var9_ref_Throwable = null;
            int var9 = 0;
            int var10 = 0;
            Object var11 = null;
            CharSequence var12 = null;
            int stackIn_40_0 = 0;
            int stackIn_43_0 = 0;
            int stackIn_46_0 = 0;
            int stackIn_52_0 = 0;
            Throwable decompiledCaughtException = null;
            int stackOut_39_0 = 0;
            int stackOut_38_0 = 0;
            int stackOut_42_0 = 0;
            int stackOut_41_0 = 0;
            int stackOut_45_0 = 0;
            int stackOut_44_0 = 0;
            int stackOut_51_0 = 0;
            int stackOut_50_0 = 0;
            L0: {
              var10 = Chess.field_G;
              var6 = -87 % ((20 - param4) / 61);
              if (null == lj.field_a) {
                if (!gd.a((byte) 68, param1)) {
                  return -1;
                } else {
                  break L0;
                }
              } else {
                break L0;
              }
            }
            L1: {
              if (tb.field_f == ca.field_h) {
                L2: {
                  if (!param1) {
                    eh.field_K = nk.a(false, param2, param3, true);
                    break L2;
                  } else {
                    var11 = null;
                    eh.field_K = l.a(false, param2, (byte) 118, (String) null, sj.field_i);
                    break L2;
                  }
                }
                qn.field_U.field_l = 0;
                qn.field_U.c(14, (byte) 61);
                qn.field_U.c(eh.field_K.b((byte) 70).field_c, (byte) -73);
                vh.a(-1, (byte) 83);
                tb.field_f = rm.field_J;
                break L1;
              } else {
                break L1;
              }
            }
            L3: {
              if (rm.field_J != tb.field_f) {
                break L3;
              } else {
                if (!tk.a(5, 1)) {
                  break L3;
                } else {
                  var7 = tk.field_h.i(-89);
                  tk.field_h.field_l = 0;
                  if (0 == var7) {
                    tb.field_f = tg.field_d;
                    break L3;
                  } else {
                    tb.field_f = qd.field_m;
                    wg.field_B = var7;
                    sb.field_sb = -1;
                    break L3;
                  }
                }
              }
            }
            L4: {
              if (tb.field_f != tg.field_d) {
                break L4;
              } else {
                if (tk.a(120, 8)) {
                  sj.field_h = tk.field_h.d((byte) 116);
                  tk.field_h.field_l = 0;
                  pj.a(param5, -27359, param1, param0, eh.field_K);
                  tb.field_f = dl.field_j;
                  break L4;
                } else {
                  break L4;
                }
              }
            }
            L5: {
              if (tb.field_f != dl.field_j) {
                break L5;
              } else {
                if (!tk.a(81, 1)) {
                  break L5;
                } else {
                  L6: {
                    var7 = tk.field_h.i(-106);
                    wg.field_B = var7;
                    tk.field_h.field_l = 0;
                    lf.field_N = null;
                    if (var7 == 0) {
                      break L6;
                    } else {
                      if ((var7 ^ -1) != -2) {
                        if (8 == var7) {
                          si.d(65280);
                          ja.field_f = false;
                          return var7;
                        } else {
                          sb.field_sb = -1;
                          tb.field_f = qd.field_m;
                          break L5;
                        }
                      } else {
                        break L6;
                      }
                    }
                  }
                  sb.field_sb = -1;
                  tb.field_f = gi.field_d;
                  break L5;
                }
              }
            }
            L7: {
              if (tb.field_f == gi.field_d) {
                if (jl.a(false)) {
                  L8: {
                    sj.field_i = tk.field_h.d((byte) 123);
                    gi.field_g = param2;
                    sk.field_t = tk.field_h.i(-79);
                    sb.field_rb = tk.field_h.i(-113);
                    cl.field_d = tk.field_h.f(674914976);
                    var7_ref_String = tk.field_h.b(true);
                    var8 = tk.field_h.i(-91);
                    if ((1 & var8) == 0) {
                      break L8;
                    } else {
                      bh.f((byte) -74);
                      break L8;
                    }
                  }
                  L9: {
                    if (!param1) {
                      L10: {
                        if ((8 & var8) == 0) {
                          stackOut_39_0 = 0;
                          stackIn_40_0 = stackOut_39_0;
                          break L10;
                        } else {
                          stackOut_38_0 = 1;
                          stackIn_40_0 = stackOut_38_0;
                          break L10;
                        }
                      }
                      L11: {
                        qf.field_b = stackIn_40_0 != 0;
                        if (-1 == (var8 & 4 ^ -1)) {
                          stackOut_42_0 = 0;
                          stackIn_43_0 = stackOut_42_0;
                          break L11;
                        } else {
                          stackOut_41_0 = 1;
                          stackIn_43_0 = stackOut_41_0;
                          break L11;
                        }
                      }
                      L12: {
                        j.field_u = stackIn_43_0 != 0;
                        if (0 == (var8 & 2)) {
                          stackOut_45_0 = 0;
                          stackIn_46_0 = stackOut_45_0;
                          break L12;
                        } else {
                          stackOut_44_0 = 1;
                          stackIn_46_0 = stackOut_44_0;
                          break L12;
                        }
                      }
                      kh.field_o = stackIn_46_0 != 0;
                      if (qf.field_b) {
                        kh.field_o = true;
                        break L9;
                      } else {
                        break L9;
                      }
                    } else {
                      break L9;
                    }
                  }
                  L13: {
                    if ((16 & var8) == 0) {
                      stackOut_51_0 = 0;
                      stackIn_52_0 = stackOut_51_0;
                      break L13;
                    } else {
                      stackOut_50_0 = 1;
                      stackIn_52_0 = stackOut_50_0;
                      break L13;
                    }
                  }
                  L14: {
                    ej.field_f = stackIn_52_0 != 0;
                    if (!on.field_a) {
                      break L14;
                    } else {
                      int discarded$5 = tk.field_h.i(-87);
                      int discarded$6 = tk.field_h.i(-86);
                      int discarded$7 = tk.field_h.e((byte) -106);
                      si.field_n = tk.field_h.f(674914976);
                      jn.field_P = new byte[si.field_n];
                      var9 = 0;
                      L15: while (true) {
                        if (si.field_n <= var9) {
                          break L14;
                        } else {
                          jn.field_P[var9] = tk.field_h.g(0);
                          var9++;
                          continue L15;
                        }
                      }
                    }
                  }
                  L16: {
                    ci.field_J = tk.field_h.d(0);
                    var12 = (CharSequence) (Object) ci.field_J;
                    cc.field_A = ad.a(var12, -2);
                    gm.field_d = tk.field_h.i(-114);
                    tb.field_f = ik.field_e;
                    if (eh.field_K.b((byte) 31) == ec.field_i) {
                      ph.field_g.a(25799, bh.i(81));
                      break L16;
                    } else {
                      if (eh.field_K.b((byte) 68) != kn.field_H) {
                        break L16;
                      } else {
                        le.field_g.a(25799, bh.i(81));
                        break L16;
                      }
                    }
                  }
                  L17: {
                    ja.field_f = false;
                    if (var7_ref_String != null) {
                      aa.a(bh.i(81), -1, var7_ref_String);
                      break L17;
                    } else {
                      break L17;
                    }
                  }
                  L18: {
                    L19: {
                      if (cl.field_d > 0) {
                        break L19;
                      } else {
                        if (j.field_u) {
                          break L19;
                        } else {
                          try {
                            L20: {
                              Object discarded$8 = u.a(true, "unzap", bh.i(81));
                              break L20;
                            }
                          } catch (java.lang.Throwable decompiledCaughtParameter0) {
                            decompiledCaughtException = decompiledCaughtParameter0;
                            L21: {
                              var9_ref_Throwable = decompiledCaughtException;
                              break L21;
                            }
                          }
                          break L18;
                        }
                      }
                    }
                    try {
                      L22: {
                        Object discarded$9 = u.a(bh.i(81), true, new Object[1], "zap");
                        break L22;
                      }
                    } catch (java.lang.Throwable decompiledCaughtParameter1) {
                      decompiledCaughtException = decompiledCaughtParameter1;
                      L23: {
                        var9_ref_Throwable = decompiledCaughtException;
                        break L23;
                      }
                    }
                    break L18;
                  }
                  L24: {
                    if (-1 > (cl.field_d ^ -1)) {
                      ln.field_Kb = true;
                      break L24;
                    } else {
                      break L24;
                    }
                  }
                  qn.field_U.a(ol.field_S, (byte) -92);
                  var9 = 0;
                  L25: while (true) {
                    if ((var9 ^ -1) <= -5) {
                      tk.field_h.a(ol.field_S, (byte) -92);
                      return wg.field_B;
                    } else {
                      ol.field_S[var9] = ol.field_S[var9] + 50;
                      var9++;
                      continue L25;
                    }
                  }
                } else {
                  break L7;
                }
              } else {
                break L7;
              }
            }
            L26: {
              if (qd.field_m == tb.field_f) {
                if (jl.a(false)) {
                  L27: {
                    si.d(65280);
                    if (-8 != (wg.field_B ^ -1)) {
                      break L27;
                    } else {
                      if (!ja.field_f) {
                        ja.field_f = true;
                        return -1;
                      } else {
                        break L27;
                      }
                    }
                  }
                  L28: {
                    if (wg.field_B != 7) {
                      break L28;
                    } else {
                      wg.field_B = 3;
                      break L28;
                    }
                  }
                  n.field_c = tk.field_h.d(0);
                  ja.field_f = false;
                  return wg.field_B;
                } else {
                  break L26;
                }
              } else {
                break L26;
              }
            }
            L29: {
              if (lj.field_a == null) {
                if (ja.field_f) {
                  L30: {
                    if (ea.i((byte) 17) > 30000L) {
                      n.field_c = nc.field_Q;
                      break L30;
                    } else {
                      n.field_c = li.field_b;
                      break L30;
                    }
                  }
                  ja.field_f = false;
                  return 3;
                } else {
                  var7 = qh.field_a;
                  qh.field_a = bk.field_n;
                  bk.field_n = var7;
                  ja.field_f = true;
                  break L29;
                }
              } else {
                break L29;
              }
            }
            return -1;
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    private ji(int param0, int param1, int param2, int param3, jm param4, rg param5, mf param6) {
        super(param0, param1, param2, param3, param4, param5);
        ((ji) this).field_M = param6;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_S = 0;
        field_U = 20000000L;
        field_R = 20;
        field_O = 2;
        field_T = new ed();
        field_Q = "Names cannot contain consecutive spaces";
    }
}
