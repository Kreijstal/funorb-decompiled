/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wd {
    int field_d;
    static wk field_k;
    boolean field_a;
    String[] field_c;
    static String field_l;
    static String field_j;
    static int field_b;
    String field_i;
    boolean field_h;
    static String field_g;
    static String field_e;
    static String field_f;

    public static void a(int param0) {
        field_g = null;
        field_f = null;
        if (param0 != 200) {
            return;
        }
        try {
            field_e = null;
            field_l = null;
            field_k = null;
            field_j = null;
        } catch (RuntimeException runtimeException) {
            throw ig.a((Throwable) (Object) runtimeException, "wd.C(" + param0 + 41);
        }
    }

    final static void a(boolean param0, int param1, byte param2, int param3, int param4, int param5) {
        RuntimeException var6 = null;
        int var6_int = 0;
        ne var7 = null;
        int var8 = 0;
        int var9 = 0;
        ca var10 = null;
        int var11 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param5 < 0) {
                break L1;
              } else {
                if (param3 < 0) {
                  break L1;
                } else {
                  if (~param5 <= ~ks.field_y) {
                    break L1;
                  } else {
                    if (param3 >= ef.field_c) {
                      break L1;
                    } else {
                      var6_int = ks.field_y * param3 + param5;
                      var7 = vs.field_e[var6_int];
                      var8 = a.a(16711680, param3, var6_int, param5);
                      if (param2 == -128) {
                        L2: {
                          var9 = -(var8 >>> 24 & 2102808831) + 255;
                          var8 = var8 & 16777215;
                          if (!param0) {
                            po.a((byte) 91, param3, param4, param1, var9, var8, var6_int, param5);
                            sf.b(param3, param5, param2 + 128, param1, var6_int, param4);
                            break L2;
                          } else {
                            break L2;
                          }
                        }
                        L3: {
                          tc.a(78, param5, param3, param4 - -19, var6_int, param1 + 39);
                          cw.a(var6_int, param4 + 19, 39 + param1, -125, param5, param3);
                          em.a(var9, param0, param3, param4, var6_int, param2 ^ -128, param5, param1, var8);
                          var10 = var7.field_n;
                          if (null == var10) {
                            break L3;
                          } else {
                            if ((var10.field_c & 1) == 0) {
                              break L3;
                            } else {
                              if (-1 >= vs.field_e[var6_int].field_a) {
                                break L3;
                              } else {
                                L4: {
                                  var11 = var7.field_a;
                                  if (null != bv.field_w) {
                                    var11 = bv.field_w.o(var11, -1);
                                    break L4;
                                  } else {
                                    break L4;
                                  }
                                }
                                eu.a(param1 - -22, var11, ug.field_b + var6_int, 92, 20 + param4);
                                break L3;
                              }
                            }
                          }
                        }
                        L5: {
                          if (!var7.e((byte) -125)) {
                            break L5;
                          } else {
                            oj.a(20 + param4, true, var6_int - -ug.field_b, var7.field_a, param1 + 22);
                            break L5;
                          }
                        }
                        fs.a(param4, false, param0, var9, param1, var6_int, param5, var8, param3);
                        break L0;
                      } else {
                        return;
                      }
                    }
                  }
                }
              }
            }
            gb.a(param3, param5, param1, param4, (byte) -82);
            return;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          throw ig.a((Throwable) (Object) var6, "wd.E(" + param0 + 44 + param1 + 44 + param2 + 44 + param3 + 44 + param4 + 44 + param5 + 41);
        }
    }

    final static boolean a(boolean param0, hl param1, hl param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int stackIn_21_0 = 0;
        int stackIn_26_0 = 0;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_31_2 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        RuntimeException stackIn_35_0 = null;
        StringBuilder stackIn_35_1 = null;
        String stackIn_35_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_25_0 = 0;
        int stackOut_23_0 = 0;
        int stackOut_20_0 = 0;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        String stackOut_30_2 = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        String stackOut_28_2 = null;
        RuntimeException stackOut_31_0 = null;
        StringBuilder stackOut_31_1 = null;
        RuntimeException stackOut_34_0 = null;
        StringBuilder stackOut_34_1 = null;
        String stackOut_34_2 = null;
        RuntimeException stackOut_32_0 = null;
        StringBuilder stackOut_32_1 = null;
        String stackOut_32_2 = null;
        var4 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            L1: {
              L2: {
                var3_int = param1.field_Ob - param2.field_Ob;
                if (vl.field_p == param1.field_Ib) {
                  break L2;
                } else {
                  if (param1.field_Ib == null) {
                    var3_int += 200;
                    if (var4 == 0) {
                      break L1;
                    } else {
                      break L2;
                    }
                  } else {
                    break L1;
                  }
                }
              }
              var3_int -= 200;
              break L1;
            }
            L3: {
              L4: {
                if (vl.field_p == param2.field_Ib) {
                  break L4;
                } else {
                  if (null != param2.field_Ib) {
                    break L3;
                  } else {
                    var3_int -= 200;
                    if (var4 == 0) {
                      break L3;
                    } else {
                      break L4;
                    }
                  }
                }
              }
              var3_int += 200;
              break L3;
            }
            if (!param0) {
              L5: {
                if (0 >= var3_int) {
                  stackOut_25_0 = 0;
                  stackIn_26_0 = stackOut_25_0;
                  break L5;
                } else {
                  stackOut_23_0 = 1;
                  stackIn_26_0 = stackOut_23_0;
                  break L5;
                }
              }
              break L0;
            } else {
              stackOut_20_0 = 0;
              stackIn_21_0 = stackOut_20_0;
              return stackIn_21_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var3 = decompiledCaughtException;
            stackOut_27_0 = (RuntimeException) var3;
            stackOut_27_1 = new StringBuilder().append("wd.B(").append(param0).append(44);
            stackIn_30_0 = stackOut_27_0;
            stackIn_30_1 = stackOut_27_1;
            stackIn_28_0 = stackOut_27_0;
            stackIn_28_1 = stackOut_27_1;
            if (param1 == null) {
              stackOut_30_0 = (RuntimeException) (Object) stackIn_30_0;
              stackOut_30_1 = (StringBuilder) (Object) stackIn_30_1;
              stackOut_30_2 = "null";
              stackIn_31_0 = stackOut_30_0;
              stackIn_31_1 = stackOut_30_1;
              stackIn_31_2 = stackOut_30_2;
              break L6;
            } else {
              stackOut_28_0 = (RuntimeException) (Object) stackIn_28_0;
              stackOut_28_1 = (StringBuilder) (Object) stackIn_28_1;
              stackOut_28_2 = "{...}";
              stackIn_31_0 = stackOut_28_0;
              stackIn_31_1 = stackOut_28_1;
              stackIn_31_2 = stackOut_28_2;
              break L6;
            }
          }
          L7: {
            stackOut_31_0 = (RuntimeException) (Object) stackIn_31_0;
            stackOut_31_1 = ((StringBuilder) (Object) stackIn_31_1).append(stackIn_31_2).append(44);
            stackIn_34_0 = stackOut_31_0;
            stackIn_34_1 = stackOut_31_1;
            stackIn_32_0 = stackOut_31_0;
            stackIn_32_1 = stackOut_31_1;
            if (param2 == null) {
              stackOut_34_0 = (RuntimeException) (Object) stackIn_34_0;
              stackOut_34_1 = (StringBuilder) (Object) stackIn_34_1;
              stackOut_34_2 = "null";
              stackIn_35_0 = stackOut_34_0;
              stackIn_35_1 = stackOut_34_1;
              stackIn_35_2 = stackOut_34_2;
              break L7;
            } else {
              stackOut_32_0 = (RuntimeException) (Object) stackIn_32_0;
              stackOut_32_1 = (StringBuilder) (Object) stackIn_32_1;
              stackOut_32_2 = "{...}";
              stackIn_35_0 = stackOut_32_0;
              stackIn_35_1 = stackOut_32_1;
              stackIn_35_2 = stackOut_32_2;
              break L7;
            }
          }
          throw ig.a((Throwable) (Object) stackIn_35_0, stackIn_35_2 + 41);
        }
        return stackIn_26_0 != 0;
    }

    final static String a(boolean param0) {
        Object var1 = null;
        Object var2 = null;
        String var3 = null;
        String var4 = null;
        String var5 = null;
        int var6 = 0;
        int var7 = 0;
        String var8 = null;
        int var9 = 0;
        int var10 = 0;
        String stackIn_56_0 = null;
        Object stackIn_96_0 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_55_0 = null;
        String stackOut_53_0 = null;
        Object stackOut_95_0 = null;
        var10 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            L1: {
              if (!param0) {
                break L1;
              } else {
                boolean discarded$1 = wd.a((byte) -13);
                break L1;
              }
            }
            L2: {
              var1 = null;
              var2 = null;
              if (rs.field_t != 0) {
                break L2;
              } else {
                if (no.field_K != null) {
                  var2 = (Object) (Object) wc.field_K;
                  break L2;
                } else {
                  break L2;
                }
              }
            }
            L3: {
              if (rs.field_t != 2) {
                break L3;
              } else {
                if (vu.j(6)) {
                  break L3;
                } else {
                  L4: {
                    L5: {
                      if (jj.a(62, wm.field_b)) {
                        break L5;
                      } else {
                        var2 = (Object) (Object) fo.a(4800, vo.field_h, new String[1]);
                        if (var10 == 0) {
                          break L4;
                        } else {
                          break L5;
                        }
                      }
                    }
                    var2 = (Object) (Object) fo.a(4800, pt.field_gb, new String[1]);
                    break L4;
                  }
                  if (!iu.field_h) {
                    break L3;
                  } else {
                    ta.a((String) null, 2, -18119, (String) null, (String) var2, 0);
                    qu.e(-3);
                    break L3;
                  }
                }
              }
            }
            L6: {
              if (null != var2) {
                break L6;
              } else {
                if (cu.field_c) {
                  break L6;
                } else {
                  if (null == eu.field_g) {
                    var2 = (Object) (Object) uq.field_w;
                    break L6;
                  } else {
                    break L6;
                  }
                }
              }
            }
            L7: {
              if (var2 != null) {
                fs.a(ni.field_d, (String) null, (String) var2, -122, 0);
                break L7;
              } else {
                L8: {
                  var3 = mv.field_d;
                  var3 = nt.a(-121, var3);
                  var4 = "";
                  var5 = "|";
                  var6 = rs.field_t;
                  var7 = 0;
                  if (var6 == 2) {
                    var4 = fo.a(4800, ta.field_Q, new String[1]);
                    var8 = fo.a(4800, ov.field_l, new String[1]);
                    var7 = rb.field_b.field_gb + qj.field_z.field_gb - 485 - (-tc.field_e.a(var8) + tc.field_e.a(var4));
                    if (var7 >= 0) {
                      break L8;
                    } else {
                      var7 = 0;
                      break L8;
                    }
                  } else {
                    L9: {
                      if (0 == var6) {
                        L10: {
                          if (null != vu.field_M) {
                            break L10;
                          } else {
                            if (!bq.field_c) {
                              break L10;
                            } else {
                              var4 = "[" + sa.field_c + "] ";
                              break L10;
                            }
                          }
                        }
                        if (null == vu.field_M) {
                          break L9;
                        } else {
                          L11: {
                            L12: {
                              var6 = 1;
                              if (!mt.field_f) {
                                break L12;
                              } else {
                                if (ur.field_C != null) {
                                  break L11;
                                } else {
                                  break L12;
                                }
                              }
                            }
                            var4 = "[" + fo.a(4800, cv.field_m, new String[1]) + "] ";
                            if (var10 == 0) {
                              break L9;
                            } else {
                              break L11;
                            }
                          }
                          var4 = "[" + ur.field_C + "] ";
                          break L9;
                        }
                      } else {
                        break L9;
                      }
                    }
                    L13: {
                      if (!us.a(true)) {
                        stackOut_55_0 = "<img=3>: ";
                        stackIn_56_0 = stackOut_55_0;
                        break L13;
                      } else {
                        stackOut_53_0 = ": ";
                        stackIn_56_0 = stackOut_53_0;
                        break L13;
                      }
                    }
                    L14: {
                      L15: {
                        var8 = stackIn_56_0;
                        var4 = var4 + var3 + var8;
                        if (!bb.field_a) {
                          break L15;
                        } else {
                          var4 = "<col=999999>" + var4 + dc.field_l + "</col>";
                          var5 = "";
                          if (var10 == 0) {
                            break L14;
                          } else {
                            break L15;
                          }
                        }
                      }
                      if (!vi.field_d) {
                        break L14;
                      } else {
                        var5 = "";
                        var4 = "<col=999999>" + var4 + ps.field_z + "</col>";
                        break L14;
                      }
                    }
                    L16: {
                      var9 = tc.field_e.a(var4);
                      if (us.a(true)) {
                        break L16;
                      } else {
                        L17: {
                          if (!qj.field_z.field_eb) {
                            break L17;
                          } else {
                            if (~var9 >= ~(-qj.field_z.field_V + sm.field_d)) {
                              break L17;
                            } else {
                              if (!bb.field_a) {
                                var1 = (Object) (Object) ps.field_z;
                                break L17;
                              } else {
                                var1 = (Object) (Object) "Broken!";
                                break L17;
                              }
                            }
                          }
                        }
                        if (qj.field_z.field_yb == 0) {
                          break L16;
                        } else {
                          if (~qj.field_z.field_bb <= ~var9) {
                            break L16;
                          } else {
                            if (bb.field_a) {
                              break L16;
                            } else {
                              np.k(92);
                              break L16;
                            }
                          }
                        }
                      }
                    }
                    break L8;
                  }
                }
                L18: {
                  fs.a(ag.field_A[var6], var5, var4 + ka.c(qj.field_C.toString()), 33, var7);
                  if (hf.field_c) {
                    break L18;
                  } else {
                    rb.field_b.field_eb = false;
                    break L18;
                  }
                }
                L19: {
                  if (rb.field_b.field_eb) {
                    var1 = (Object) (Object) fo.a(4800, os.field_q, new String[2]);
                    break L19;
                  } else {
                    break L19;
                  }
                }
                break L7;
              }
            }
            stackOut_95_0 = var1;
            stackIn_96_0 = stackOut_95_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = (Object) (Object) decompiledCaughtException;
          throw ig.a((Throwable) var1, "wd.A(" + param0 + 41);
        }
        return (String) (Object) stackIn_96_0;
    }

    final static boolean a(byte param0) {
        RuntimeException var1 = null;
        int stackIn_2_0 = 0;
        int stackIn_10_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_7_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_1_0 = 0;
        try {
          L0: {
            if (param0 > 19) {
              L1: {
                L2: {
                  if (10 > p.field_b) {
                    break L2;
                  } else {
                    if (13 > f.field_E) {
                      break L2;
                    } else {
                      stackOut_7_0 = 1;
                      stackIn_10_0 = stackOut_7_0;
                      break L1;
                    }
                  }
                }
                stackOut_9_0 = 0;
                stackIn_10_0 = stackOut_9_0;
                break L1;
              }
              break L0;
            } else {
              stackOut_1_0 = 0;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw ig.a((Throwable) (Object) var1, "wd.D(" + param0 + 41);
        }
        return stackIn_10_0 != 0;
    }

    wd(boolean param0) {
        try {
            ((wd) this).field_a = param0;
        } catch (RuntimeException runtimeException) {
            throw ig.a((Throwable) (Object) runtimeException, "wd.<init>(" + param0 + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_j = "Options";
        field_l = "No players";
        field_g = "<%0> has resigned";
        field_f = "Achieved";
        field_e = "<%0>, turn <%1>";
    }
}
