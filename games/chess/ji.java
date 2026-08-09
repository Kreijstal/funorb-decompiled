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
            String var2 = (String) null;
            ji.a(-34, true, (String) null, (String) null, (byte) -54, true);
        }
    }

    final void a(int param0, mf param1, int param2, int param3, int param4, int param5) {
        kb var7 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var7_ref = null;
        try {
          L0: {
            L1: {
              super.a(param0, param1, param2, param3, param4 ^ param4, param5);
              var7 = vj.field_a;
              if (var7 == null) {
                break L1;
              } else {
                if (!this.a(param0, param5, param2, (byte) -117, param3)) {
                  break L1;
                } else {
                  if (this.field_p instanceof cj) {
                    ((cj) ((Object) this.field_p)).a(var7, -10925, (ji) (this));
                    vj.field_a = null;
                    break L1;
                  } else {
                    if (!(var7.field_p instanceof cj)) {
                      break L1;
                    } else {
                      ((cj) ((Object) var7.field_p)).a(var7, -10925, (ji) (this));
                      vj.field_a = null;
                      break L1;
                    }
                  }
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var7_ref = decompiledCaughtException;
            stackIn_9_0 = (RuntimeException) (var7_ref);

            stackIn_9_1 = new StringBuilder().append("ji.VA(").append(param0).append(',');

            if (param1 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L2;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L2;
            }
          }
          throw fk.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    final static String a(String param0, String param1, String param2, um param3, byte param4) {
        RuntimeException var5 = null;
        String var6 = null;
        String stackIn_5_0 = null;
        String stackIn_7_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        StringBuilder stackIn_16_1 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        StringBuilder stackIn_19_1 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param4 >= 15) {
                break L1;
              } else {
                var6 = (String) null;
                ji.a(74, true, (String) null, (String) null, (byte) 108, true);
                break L1;
              }
            }
            if (!param3.c((byte) 125)) {
              stackIn_5_0 = (String) (param0);
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              stackIn_7_0 = param2 + " - " + param3.c(param1, 0) + "%";
              decompiledRegionSelector0 = 1;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5 = decompiledCaughtException;
            stackIn_10_0 = (RuntimeException) (var5);

            stackIn_10_1 = new StringBuilder().append("ji.SA(");

            if (param0 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L2;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_13_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_11_2).append(',');

            if (param1 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "null";
              break L3;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_16_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_14_2).append(',');

            if (param2 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "null";
              break L4;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "{...}";
              break L4;
            }
          }
          L5: {


            stackIn_19_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_17_2).append(',');

            if (param3 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "null";
              break L5;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "{...}";
              break L5;
            }
          }
          throw fk.a((Throwable) ((Object) stackIn_11_0), stackIn_20_2 + ',' + param4 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_5_0;
        } else {
          return stackIn_7_0;
        }
    }

    final static int a(int param0, boolean param1, String param2, String param3, byte param4, boolean param5) {
        try {
            int stackIn_6_0 = 0;
            int stackIn_31_0 = 0;
            int stackIn_43_0 = 0;
            int stackIn_46_0 = 0;
            int stackIn_49_0 = 0;
            int stackIn_55_0 = 0;
            int stackIn_82_0 = 0;
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
            RuntimeException var6 = null;
            int var7 = 0;
            String var7_ref_String = null;
            int var8 = 0;
            int var9 = 0;
            Throwable var9_ref_Throwable = null;
            int var10 = 0;
            String var11 = null;
            CharSequence var12 = null;
            var10 = Chess.field_G;
            try {
              L0: {
                L1: {
                  var6_int = -87 % ((20 - param4) / 61);
                  if (null == lj.field_a) {
                    if (!gd.a((byte) 68, param1)) {
                      stackIn_6_0 = -1;
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
                  if (tb.field_f == ca.field_h) {
                    L3: {
                      if (!param1) {
                        eh.field_K = nk.a(false, param2, param3, true);
                        break L3;
                      } else {
                        var11 = (String) null;
                        eh.field_K = l.a(false, param2, (byte) 118, (String) null, sj.field_i);
                        break L3;
                      }
                    }
                    qn.field_U.field_l = 0;
                    qn.field_U.c(14, (byte) 61);
                    qn.field_U.c(eh.field_K.b((byte) 70).field_c, (byte) -73);
                    vh.a(-1, (byte) 83);
                    tb.field_f = rm.field_J;
                    break L2;
                  } else {
                    break L2;
                  }
                }
                L4: {
                  if (rm.field_J != tb.field_f) {
                    break L4;
                  } else {
                    if (!tk.a(5, 1)) {
                      break L4;
                    } else {
                      var7 = tk.field_h.i(-89);
                      tk.field_h.field_l = 0;
                      if (0 == var7) {
                        tb.field_f = tg.field_d;
                        break L4;
                      } else {
                        tb.field_f = qd.field_m;
                        wg.field_B = var7;
                        sb.field_sb = -1;
                        break L4;
                      }
                    }
                  }
                }
                L5: {
                  if (tb.field_f != tg.field_d) {
                    break L5;
                  } else {
                    if (tk.a(120, 8)) {
                      sj.field_h = tk.field_h.d((byte) 116);
                      tk.field_h.field_l = 0;
                      pj.a(param5, -27359, param1, param0, eh.field_K);
                      tb.field_f = dl.field_j;
                      break L5;
                    } else {
                      break L5;
                    }
                  }
                }
                L6: {
                  if (tb.field_f != dl.field_j) {
                    break L6;
                  } else {
                    if (!tk.a(81, 1)) {
                      break L6;
                    } else {
                      L7: {
                        var7 = tk.field_h.i(-106);
                        wg.field_B = var7;
                        tk.field_h.field_l = 0;
                        lf.field_N = null;
                        if (var7 == 0) {
                          break L7;
                        } else {
                          if ((var7 ^ -1) != -2) {
                            if (8 == var7) {
                              si.d(65280);
                              ja.field_f = false;
                              stackIn_31_0 = var7;
                              decompiledRegionSelector0 = 1;
                              break L0;
                            } else {
                              sb.field_sb = -1;
                              tb.field_f = qd.field_m;
                              break L6;
                            }
                          } else {
                            break L7;
                          }
                        }
                      }
                      sb.field_sb = -1;
                      tb.field_f = gi.field_d;
                      break L6;
                    }
                  }
                }
                L8: {
                  if (tb.field_f == gi.field_d) {
                    if (jl.a(false)) {
                      L9: {
                        sj.field_i = tk.field_h.d((byte) 123);
                        gi.field_g = param2;
                        sk.field_t = tk.field_h.i(-79);
                        sb.field_rb = tk.field_h.i(-113);
                        cl.field_d = tk.field_h.f(674914976);
                        var7_ref_String = tk.field_h.b(true);
                        var8 = tk.field_h.i(-91);
                        if ((1 & var8) == 0) {
                          break L9;
                        } else {
                          bh.f((byte) -74);
                          break L9;
                        }
                      }
                      L10: {
                        if (!param1) {
                          L11: {
                            if ((8 & var8) == 0) {
                              stackIn_43_0 = 0;
                              break L11;
                            } else {
                              stackIn_43_0 = 1;
                              break L11;
                            }
                          }
                          L12: {
                            qf.field_b = stackIn_43_0 != 0;
                            if (-1 == (var8 & 4 ^ -1)) {
                              stackIn_46_0 = 0;
                              break L12;
                            } else {
                              stackIn_46_0 = 1;
                              break L12;
                            }
                          }
                          L13: {
                            j.field_u = stackIn_46_0 != 0;
                            if (0 == (var8 & 2)) {
                              stackIn_49_0 = 0;
                              break L13;
                            } else {
                              stackIn_49_0 = 1;
                              break L13;
                            }
                          }
                          kh.field_o = stackIn_49_0 != 0;
                          if (qf.field_b) {
                            kh.field_o = true;
                            break L10;
                          } else {
                            break L10;
                          }
                        } else {
                          break L10;
                        }
                      }
                      L14: {
                        if ((16 & var8) == 0) {
                          stackIn_55_0 = 0;
                          break L14;
                        } else {
                          stackIn_55_0 = 1;
                          break L14;
                        }
                      }
                      L15: {
                        ej.field_f = stackIn_55_0 != 0;
                        if (!on.field_a) {
                          break L15;
                        } else {
                          tk.field_h.i(-87);
                          tk.field_h.i(-86);
                          tk.field_h.e((byte) -106);
                          si.field_n = tk.field_h.f(674914976);
                          jn.field_P = new byte[si.field_n];
                          var9 = 0;
                          L16: while (true) {
                            if (si.field_n <= var9) {
                              break L15;
                            } else {
                              jn.field_P[var9] = tk.field_h.g(0);
                              var9++;
                              continue L16;
                            }
                          }
                        }
                      }
                      L17: {
                        ci.field_J = tk.field_h.d(0);
                        var12 = (CharSequence) ((Object) ci.field_J);
                        cc.field_A = ad.a(var12, -2);
                        gm.field_d = tk.field_h.i(-114);
                        tb.field_f = ik.field_e;
                        if (eh.field_K.b((byte) 31) == ec.field_i) {
                          ph.field_g.a(25799, bh.i(81));
                          break L17;
                        } else {
                          if (eh.field_K.b((byte) 68) != kn.field_H) {
                            break L17;
                          } else {
                            le.field_g.a(25799, bh.i(81));
                            break L17;
                          }
                        }
                      }
                      L18: {
                        ja.field_f = false;
                        if (var7_ref_String != null) {
                          aa.a(bh.i(81), -1, var7_ref_String);
                          break L18;
                        } else {
                          break L18;
                        }
                      }
                      L19: {
                        L20: {
                          if (cl.field_d > 0) {
                            break L20;
                          } else {
                            if (j.field_u) {
                              break L20;
                            } else {
                              try {
                                L21: {
                                  u.a(true, "unzap", bh.i(81));
                                  break L21;
                                }
                              } catch (java.lang.Throwable decompiledCaughtParameter0) {
                                decompiledCaughtException = decompiledCaughtParameter0;
                                L22: {
                                  var9_ref_Throwable = decompiledCaughtException;
                                  break L22;
                                }
                              }
                              break L19;
                            }
                          }
                        }
                        try {
                          L23: {
                            u.a(bh.i(81), true, new Object[]{tf.a(37, sj.field_i)}, "zap");
                            break L23;
                          }
                        } catch (java.lang.Throwable decompiledCaughtParameter1) {
                          decompiledCaughtException = decompiledCaughtParameter1;
                          L24: {
                            var9_ref_Throwable = decompiledCaughtException;
                            break L24;
                          }
                        }
                        break L19;
                      }
                      L25: {
                        if (-1 > (cl.field_d ^ -1)) {
                          ln.field_Kb = true;
                          break L25;
                        } else {
                          break L25;
                        }
                      }
                      qn.field_U.a(ol.field_S, (byte) -92);
                      var9 = 0;
                      L26: while (true) {
                        if ((var9 ^ -1) <= -5) {
                          tk.field_h.a(ol.field_S, (byte) -92);
                          stackIn_82_0 = wg.field_B;
                          decompiledRegionSelector0 = 2;
                          break L0;
                        } else {
                          ol.field_S[var9] = ol.field_S[var9] + 50;
                          var9++;
                          continue L26;
                        }
                      }
                    } else {
                      break L8;
                    }
                  } else {
                    break L8;
                  }
                }
                L27: {
                  if (qd.field_m == tb.field_f) {
                    if (jl.a(false)) {
                      L28: {
                        si.d(65280);
                        if (-8 != (wg.field_B ^ -1)) {
                          break L28;
                        } else {
                          if (!ja.field_f) {
                            ja.field_f = true;
                            stackIn_95_0 = -1;
                            decompiledRegionSelector0 = 4;
                            break L0;
                          } else {
                            break L28;
                          }
                        }
                      }
                      L29: {
                        if (wg.field_B != 7) {
                          break L29;
                        } else {
                          wg.field_B = 3;
                          break L29;
                        }
                      }
                      n.field_c = tk.field_h.d(0);
                      ja.field_f = false;
                      stackIn_93_0 = wg.field_B;
                      decompiledRegionSelector0 = 3;
                      break L0;
                    } else {
                      break L27;
                    }
                  } else {
                    break L27;
                  }
                }
                L30: {
                  if (lj.field_a == null) {
                    if (ja.field_f) {
                      L31: {
                        if (ea.i((byte) 17) > 30000L) {
                          n.field_c = nc.field_Q;
                          break L31;
                        } else {
                          n.field_c = li.field_b;
                          break L31;
                        }
                      }
                      ja.field_f = false;
                      stackIn_104_0 = 3;
                      decompiledRegionSelector0 = 5;
                      break L0;
                    } else {
                      var7 = qh.field_a;
                      qh.field_a = bk.field_n;
                      bk.field_n = var7;
                      ja.field_f = true;
                      break L30;
                    }
                  } else {
                    break L30;
                  }
                }
                stackIn_106_0 = -1;
                decompiledRegionSelector0 = 6;
                break L0;
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter2) {
              decompiledCaughtException = decompiledCaughtParameter2;
              L32: {
                var6 = (RuntimeException) (Object) decompiledCaughtException;
                stackIn_109_0 = (RuntimeException) (var6);

                stackIn_109_1 = new StringBuilder().append("ji.TA(").append(param0).append(',').append(param1).append(',');

                if (param2 == null) {
                  stackIn_110_0 = (RuntimeException) ((Object) stackIn_109_0);
                  stackIn_110_1 = (StringBuilder) ((Object) stackIn_109_1);
                  stackIn_110_2 = "null";
                  break L32;
                } else {
                  stackIn_110_0 = (RuntimeException) ((Object) stackIn_109_0);
                  stackIn_110_1 = (StringBuilder) ((Object) stackIn_109_1);
                  stackIn_110_2 = "{...}";
                  break L32;
                }
              }
              L33: {


                stackIn_112_1 = ((StringBuilder) (Object) stackIn_110_1).append(stackIn_110_2).append(',');

                if (param3 == null) {
                  stackIn_110_0 = (RuntimeException) ((Object) stackIn_110_0);
                  stackIn_113_1 = (StringBuilder) ((Object) stackIn_112_1);
                  stackIn_113_2 = "null";
                  break L33;
                } else {
                  stackIn_110_0 = (RuntimeException) ((Object) stackIn_110_0);
                  stackIn_113_1 = (StringBuilder) ((Object) stackIn_112_1);
                  stackIn_113_2 = "{...}";
                  break L33;
                }
              }
              throw fk.a((Throwable) ((Object) stackIn_110_0), stackIn_113_2 + ',' + param4 + ',' + param5 + ')');
            }
            if (decompiledRegionSelector0 == 0) {
              return stackIn_6_0;
            } else {
              if (decompiledRegionSelector0 == 1) {
                return stackIn_31_0;
              } else {
                if (decompiledRegionSelector0 == 2) {
                  return stackIn_82_0;
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

    private ji(int param0, int param1, int param2, int param3, jm param4, rg param5, mf param6) {
        super(param0, param1, param2, param3, param4, param5);
        try {
            this.field_M = param6;
        } catch (RuntimeException runtimeException) {
            throw fk.a((Throwable) ((Object) runtimeException), "ji.<init>(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ',' + (param5 != null ? "{...}" : "null") + ',' + (param6 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_S = 0;
        field_U = 20000000L;
        field_R = 20;
        field_O = 2;
        field_T = new ed();
        field_Q = "Names cannot contain consecutive spaces";
    }
}
