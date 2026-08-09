/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pk {
    static mc field_f;
    static String field_e;
    static long field_g;
    static String field_b;
    static tf[] field_c;
    static String[] field_d;
    static int[] field_a;

    final static void a(byte[] param0, int param1, int[] param2, int param3, int param4) {
        int incrementValue$4 = 0;
        int incrementValue$5 = 0;
        byte dupTemp$6 = 0;
        int dupTemp$7 = 0;
        RuntimeException runtimeException = null;
        int var5_int = 0;
        int var6 = 0;
        int var7 = 0;
        int stackIn_4_0 = 0;
        int stackIn_13_0 = 0;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var7 = Pixelate.field_H ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        var5_int = 0;
                        statePc = 2;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        if (kb.field_N.length <= var5_int) {
                            statePc = 12;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        param1 = kb.field_N[var5_int];
                        stackIn_13_0 = var5_int << -611089916;
                        stackIn_4_0 = stackIn_13_0;
                        if (var7 != 0) {
                            statePc = 13;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        var6 = stackIn_4_0;
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        incrementValue$4 = param1;
                        param1--;
                        if (incrementValue$4 == 0) {
                            statePc = 10;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        incrementValue$5 = var6;
                        var6++;
                        param4 = nd.field_c[incrementValue$5];
                        dupTemp$6 = param0[param4];
                        dupTemp$7 = param2[dupTemp$6];
                        param2[dupTemp$6] = dupTemp$7 + 1;
                        nd.field_c[dupTemp$7] = param4;
                        if (var7 != 0) {
                            statePc = 11;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        if (var7 == 0) {
                            statePc = 5;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        var5_int++;
                        statePc = 11;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        if (var7 == 0) {
                            statePc = 2;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        stackIn_13_0 = param3;
                        statePc = 13;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        if (stackIn_13_0 > 36) {
                            statePc = 26;
                        } else {
                            statePc = 14;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        pk.b(1);
                        statePc = 26;
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 17: {
                    runtimeException = (RuntimeException) ((Object) caughtException);
                    stackIn_20_0 = (RuntimeException) (runtimeException);
                    stackIn_18_0 = stackIn_20_0;
                    stackIn_20_1 = new StringBuilder().append("pk.B(");
                    stackIn_18_1 = stackIn_20_1;
                    if (param0 == null) {
                        statePc = 20;
                    } else {
                        statePc = 18;
                    }
                    continue stateLoop;
                }
                case 18: {
                    stackIn_21_0 = (RuntimeException) ((Object) stackIn_18_0);
                    stackIn_21_1 = (StringBuilder) ((Object) stackIn_18_1);
                    stackIn_21_2 = "{...}";
                    statePc = 21;
                    continue stateLoop;
                }
                case 20: {
                    stackIn_21_0 = (RuntimeException) ((Object) stackIn_20_0);
                    stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
                    stackIn_21_2 = "null";
                    statePc = 21;
                    continue stateLoop;
                }
                case 21: {
                    stackIn_24_0 = (RuntimeException) ((Object) stackIn_21_0);
                    stackIn_22_0 = stackIn_24_0;
                    stackIn_24_1 = ((StringBuilder) (Object) stackIn_21_1).append(stackIn_21_2).append(',').append(param1).append(',');
                    stackIn_22_1 = stackIn_24_1;
                    if (param2 == null) {
                        statePc = 24;
                    } else {
                        statePc = 22;
                    }
                    continue stateLoop;
                }
                case 22: {
                    stackIn_25_0 = (RuntimeException) ((Object) stackIn_22_0);
                    stackIn_25_1 = (StringBuilder) ((Object) stackIn_22_1);
                    stackIn_25_2 = "{...}";
                    statePc = 25;
                    continue stateLoop;
                }
                case 24: {
                    stackIn_25_0 = (RuntimeException) ((Object) stackIn_24_0);
                    stackIn_25_1 = (StringBuilder) ((Object) stackIn_24_1);
                    stackIn_25_2 = "null";
                    statePc = 25;
                    continue stateLoop;
                }
                case 25: {
                    throw aa.a((Throwable) ((Object) stackIn_25_0), stackIn_25_2 + ',' + param3 + ',' + param4 + ')');
                }
                case 26: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    public static void a(int param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        try {
          L0: {
            L1: {
              field_b = null;
              if (param0 == 4194303) {
                break L1;
              } else {
                pk.a((pc) null, -21);
                break L1;
              }
            }
            field_c = null;
            field_e = null;
            field_f = null;
            field_a = null;
            field_d = null;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw aa.a((Throwable) ((Object) var1), "pk.F(" + param0 + ')');
        }
    }

    final static id a(boolean param0, int param1) {
        id var2 = null;
        RuntimeException var2_ref = null;
        id stackIn_4_0 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param1 == 5731) {
                break L1;
              } else {
                pk.a(-111);
                break L1;
              }
            }
            var2 = new id(true);
            var2.field_e = param0;
            stackIn_4_0 = (id) (var2);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw aa.a((Throwable) ((Object) var2_ref), "pk.D(" + param0 + ',' + param1 + ')');
        }
        return stackIn_4_0;
    }

    final static rl a(pc param0, int param1) {
        int stackIn_29_0 = 0;
        int stackIn_29_1 = 0;
        rl stackIn_36_0 = null;
        RuntimeException stackIn_40_0 = null;
        StringBuilder stackIn_40_1 = null;
        RuntimeException stackIn_41_0 = null;
        StringBuilder stackIn_41_1 = null;
        String stackIn_41_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        rl var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        var8 = Pixelate.field_H ? 1 : 0;
        try {
          L0: {
            var2_int = param0.c(8, (byte) -34);
            if ((var2_int ^ -1) < param1) {
              throw new IllegalStateException("" + var2_int);
            } else {
              L1: {
                var3 = tj.a(param0, -32) ? 1 : 0;
                var4 = tj.a(param0, -32) ? 1 : 0;
                var5 = new rl();
                var5.field_A = (short)param0.c(16, (byte) -34);
                var5.field_k = bm.a(var5.field_k, (byte) -128, param0, 16);
                var5.field_N = bm.a(var5.field_N, (byte) -128, param0, 16);
                var5.field_E = bm.a(var5.field_E, (byte) -128, param0, 16);
                var5.field_j = (short)param0.c(16, (byte) -34);
                var5.field_h = bm.a(var5.field_h, (byte) -128, param0, 16);
                var5.field_I = bm.a(var5.field_I, (byte) -128, param0, 16);
                var5.field_o = bm.a(var5.field_o, (byte) -128, param0, 16);
                if (var3 != 0) {
                  var5.field_a = (short)param0.c(16, (byte) -34);
                  var5.field_K = bm.a(var5.field_K, (byte) -128, param0, 16);
                  var5.field_q = bm.a(var5.field_q, (byte) -128, param0, 16);
                  var5.field_p = bm.a(var5.field_p, (byte) -128, param0, 16);
                  var5.field_J = bm.a(var5.field_J, (byte) -128, param0, 16);
                  var5.field_s = bm.a(var5.field_s, (byte) -128, param0, 16);
                  var5.field_i = bm.a(var5.field_i, (byte) -128, param0, 16);
                  break L1;
                } else {
                  break L1;
                }
              }
              L2: {
                if (var4 != 0) {
                  param0.c(16, (byte) -34);
                  var5.field_D = bm.a(var5.field_D, (byte) -128, param0, 16);
                  var5.field_L = bm.a(var5.field_L, (byte) -128, param0, 16);
                  var5.field_S = bm.a(var5.field_S, (byte) -128, param0, 16);
                  var5.field_d = bm.a(var5.field_d, (byte) -128, param0, 16);
                  var5.field_z = bm.a(var5.field_z, (byte) -128, param0, 16);
                  break L2;
                } else {
                  break L2;
                }
              }
              L3: {
                if (tj.a(param0, -32)) {
                  var5.field_l = bm.a(var5.field_l, (byte) -128, param0, 16);
                  break L3;
                } else {
                  break L3;
                }
              }
              L4: {
                if (tj.a(param0, -32)) {
                  var5.field_n = nl.a(param0, var5.field_n, 16, param1 ^ -122);
                  var6 = 0;
                  var7 = 0;
                  L5: while (true) {
                    L6: {
                      L7: {
                        if (var5.field_n.length <= var7) {
                          break L7;
                        } else {
                          stackIn_29_0 = var6;

                          stackIn_29_1 = 255 & var5.field_n[var7];

                          if (var8 != 0) {
                            break L6;
                          } else {
                            L8: {
                              if (stackIn_29_0 >= stackIn_29_1) {
                                break L8;
                              } else {
                                var6 = 255 & var5.field_n[var7];
                                break L8;
                              }
                            }
                            var7++;
                            if (var8 == 0) {
                              continue L5;
                            } else {
                              break L7;
                            }
                          }
                        }
                      }
                      stackIn_29_0 = -1;
                      stackIn_29_1 = var6 ^ -1;
                      break L6;
                    }
                    L9: {
                      if (stackIn_29_0 != stackIn_29_1) {
                        break L9;
                      } else {
                        var5.field_n = null;
                        if (var8 == 0) {
                          break L4;
                        } else {
                          break L9;
                        }
                      }
                    }
                    var5.field_B = (byte)(1 + var6);
                    break L4;
                  }
                } else {
                  break L4;
                }
              }
              stackIn_36_0 = (rl) (var5);
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L10: {
            var2 = decompiledCaughtException;
            stackIn_40_0 = (RuntimeException) (var2);

            stackIn_40_1 = new StringBuilder().append("pk.C(");

            if (param0 == null) {
              stackIn_41_0 = (RuntimeException) ((Object) stackIn_40_0);
              stackIn_41_1 = (StringBuilder) ((Object) stackIn_40_1);
              stackIn_41_2 = "null";
              break L10;
            } else {
              stackIn_41_0 = (RuntimeException) ((Object) stackIn_40_0);
              stackIn_41_1 = (StringBuilder) ((Object) stackIn_40_1);
              stackIn_41_2 = "{...}";
              break L10;
            }
          }
          throw aa.a((Throwable) ((Object) stackIn_41_0), stackIn_41_2 + ',' + param1 + ')');
        }
        return stackIn_36_0;
    }

    final static boolean b(int param0) {
        RuntimeException var1 = null;
        int stackIn_5_0 = 0;
        int stackIn_8_0 = 0;
        int stackIn_10_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 >= 119) {
                break L1;
              } else {
                field_d = (String[]) null;
                break L1;
              }
            }
            if (oo.field_d) {
              if (ce.field_d == 0) {
                stackIn_10_0 = 1;
                decompiledRegionSelector0 = 2;
                break L0;
              } else {
                stackIn_8_0 = 0;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              stackIn_5_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw aa.a((Throwable) ((Object) var1), "pk.A(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_5_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_8_0 != 0;
          } else {
            return stackIn_10_0 != 0;
          }
        }
    }

    final static String a(byte param0) {
        String stackIn_20_0 = null;
        String stackIn_60_0 = null;
        Object stackIn_96_0 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
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
        var10 = Pixelate.field_H ? 1 : 0;
        try {
          L0: {
            L1: {
              var1 = null;
              var2 = null;
              if (-1 != (ce.field_d ^ -1)) {
                break L1;
              } else {
                if (null == bn.field_S) {
                  break L1;
                } else {
                  var2 = jh.field_P;
                  break L1;
                }
              }
            }
            L2: {
              if (ce.field_d != 2) {
                break L2;
              } else {
                if (!ra.a((byte) -99)) {
                  L3: {
                    L4: {
                      if (!ha.a(fp.field_d, (byte) 37)) {
                        break L4;
                      } else {
                        var2 = sd.a(tn.field_m, 34, new String[]{jo.field_k});
                        if (var10 == 0) {
                          break L3;
                        } else {
                          break L4;
                        }
                      }
                    }
                    var2 = sd.a(fg.field_d, 34, new String[]{jo.field_k});
                    break L3;
                  }
                  if (!un.field_l) {
                    break L2;
                  } else {
                    ti.a(0, (String) null, (String) null, (byte) -82, 2, (String) (var2));
                    po.a(true);
                    break L2;
                  }
                } else {
                  break L2;
                }
              }
            }
            if (param0 > 59) {
              L5: {
                if (null != var2) {
                  break L5;
                } else {
                  if (qo.field_z) {
                    break L5;
                  } else {
                    if (ko.field_eb != null) {
                      break L5;
                    } else {
                      var2 = a.field_M;
                      break L5;
                    }
                  }
                }
              }
              L6: {
                if (null != var2) {
                  ap.a((String) null, 0, vp.field_Ib, 24092, (String) (var2));
                  break L6;
                } else {
                  L7: {
                    L8: {
                      var3 = kn.field_J;
                      var3 = th.a(2, var3);
                      var4 = "";
                      var5 = "|";
                      var6 = ce.field_d;
                      var7 = 0;
                      if (2 != var6) {
                        break L8;
                      } else {
                        L9: {
                          var4 = sd.a(dg.field_b, 73, new String[]{jo.field_k});
                          var8 = sd.a(sk.field_c, 69, new String[]{var3});
                          var7 = -485 + (nf.field_d.field_K + rh.field_y.field_K + vl.field_Q.c(var8) + -vl.field_Q.c(var4));
                          if ((var7 ^ -1) <= -1) {
                            break L9;
                          } else {
                            var7 = 0;
                            break L9;
                          }
                        }
                        if (var10 == 0) {
                          break L7;
                        } else {
                          break L8;
                        }
                      }
                    }
                    L10: {
                      if (0 == var6) {
                        L11: {
                          if (null != io.field_c) {
                            break L11;
                          } else {
                            if (ge.field_f) {
                              var4 = "[" + ul.field_m + "] ";
                              break L11;
                            } else {
                              break L11;
                            }
                          }
                        }
                        if (null != io.field_c) {
                          L12: {
                            L13: {
                              L14: {
                                if (!nc.field_b) {
                                  break L14;
                                } else {
                                  if (mn.field_f != null) {
                                    break L13;
                                  } else {
                                    break L14;
                                  }
                                }
                              }
                              var4 = "[" + sd.a(fk.field_q, 40, new String[]{io.field_c.field_pc}) + "] ";
                              if (var10 == 0) {
                                break L12;
                              } else {
                                break L13;
                              }
                            }
                            var4 = "[" + mn.field_f + "] ";
                            break L12;
                          }
                          var6 = 1;
                          break L10;
                        } else {
                          break L10;
                        }
                      } else {
                        break L10;
                      }
                    }
                    L15: {
                      if (ue.a((byte) 81)) {
                        stackIn_60_0 = ": ";
                        break L15;
                      } else {
                        stackIn_60_0 = "<img=3>: ";
                        break L15;
                      }
                    }
                    L16: {
                      L17: {
                        var8 = stackIn_60_0;
                        var4 = var4 + var3 + var8;
                        if (!ln.field_q) {
                          break L17;
                        } else {
                          var5 = "";
                          var4 = "<col=999999>" + var4 + ef.field_d + "</col>";
                          if (var10 == 0) {
                            break L16;
                          } else {
                            break L17;
                          }
                        }
                      }
                      if (!lh.field_g) {
                        break L16;
                      } else {
                        var5 = "";
                        var4 = "<col=999999>" + var4 + ll.field_i + "</col>";
                        break L16;
                      }
                    }
                    var9 = vl.field_Q.c(var4);
                    if (ue.a((byte) 124)) {
                      break L7;
                    } else {
                      L18: {
                        if (!nf.field_d.field_W) {
                          break L18;
                        } else {
                          if ((-nf.field_d.field_tb + uf.field_d ^ -1) > (var9 ^ -1)) {
                            if (!ln.field_q) {
                              var1 = ll.field_i;
                              break L18;
                            } else {
                              var1 = "Broken!";
                              break L18;
                            }
                          } else {
                            break L18;
                          }
                        }
                      }
                      if (nf.field_d.field_P == 0) {
                        break L7;
                      } else {
                        if ((nf.field_d.field_ub ^ -1) <= (var9 ^ -1)) {
                          break L7;
                        } else {
                          if (ln.field_q) {
                            break L7;
                          } else {
                            ak.c(true);
                            break L7;
                          }
                        }
                      }
                    }
                  }
                  L19: {
                    ap.a(var5, var7, ib.field_i[var6], 24092, var4 + jl.b(mp.field_a.toString()));
                    if (!oo.field_d) {
                      rh.field_y.field_W = false;
                      break L19;
                    } else {
                      break L19;
                    }
                  }
                  L20: {
                    if (!rh.field_y.field_W) {
                      break L20;
                    } else {
                      var1 = sd.a(nn.field_m, 78, new String[]{var3, jo.field_k});
                      break L20;
                    }
                  }
                  break L6;
                }
              }
              stackIn_96_0 = var1;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_20_0 = (String) null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw aa.a((Throwable) (var1), "pk.E(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_20_0;
        } else {
          return (String) ((Object) stackIn_96_0);
        }
    }

    static {
        field_d = new String[]{"Welcome to Pixelate!", "The Buffer Zone", "How To Play", "Game Mode: Challenge", "Game Mode: Challenge", "Game Mode: Puzzle", "Game Mode: Multiplayer", "Game Mode: Multiplayer"};
        field_e = "Players";
        field_b = "This password is part of your Player Name, and would be easy to guess";
        field_a = new int[]{0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, 2147483647, -1};
    }
}
