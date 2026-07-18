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
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_12_0 = 0;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        var7 = Pixelate.field_H ? 1 : 0;
        try {
          L0: {
            var5_int = 0;
            L1: while (true) {
              L2: {
                L3: {
                  if (kb.field_N.length <= var5_int) {
                    break L3;
                  } else {
                    param1 = kb.field_N[var5_int];
                    stackOut_3_0 = var5_int << 4;
                    stackIn_13_0 = stackOut_3_0;
                    stackIn_4_0 = stackOut_3_0;
                    if (var7 != 0) {
                      break L2;
                    } else {
                      var6 = stackIn_4_0;
                      L4: while (true) {
                        L5: {
                          L6: {
                            int incrementValue$9 = param1;
                            param1--;
                            if (incrementValue$9 == 0) {
                              break L6;
                            } else {
                              int incrementValue$10 = var6;
                              var6++;
                              param4 = nd.field_c[incrementValue$10];
                              param2[param0[param4]] = param2[param0[param4]] + 1;
                              nd.field_c[param2[param0[param4]]] = param4;
                              if (var7 != 0) {
                                break L5;
                              } else {
                                if (var7 == 0) {
                                  continue L4;
                                } else {
                                  break L6;
                                }
                              }
                            }
                          }
                          var5_int++;
                          break L5;
                        }
                        if (var7 == 0) {
                          continue L1;
                        } else {
                          break L3;
                        }
                      }
                    }
                  }
                }
                stackOut_12_0 = 77;
                stackIn_13_0 = stackOut_12_0;
                break L2;
              }
              L7: {
                if (stackIn_13_0 > 36) {
                  break L7;
                } else {
                  boolean discarded$11 = pk.b(1);
                  break L7;
                }
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            runtimeException = decompiledCaughtException;
            stackOut_17_0 = (RuntimeException) runtimeException;
            stackOut_17_1 = new StringBuilder().append("pk.B(");
            stackIn_20_0 = stackOut_17_0;
            stackIn_20_1 = stackOut_17_1;
            stackIn_18_0 = stackOut_17_0;
            stackIn_18_1 = stackOut_17_1;
            if (param0 == null) {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "null";
              stackIn_21_0 = stackOut_20_0;
              stackIn_21_1 = stackOut_20_1;
              stackIn_21_2 = stackOut_20_2;
              break L8;
            } else {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "{...}";
              stackIn_21_0 = stackOut_18_0;
              stackIn_21_1 = stackOut_18_1;
              stackIn_21_2 = stackOut_18_2;
              break L8;
            }
          }
          L9: {
            stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
            stackOut_21_1 = ((StringBuilder) (Object) stackIn_21_1).append(stackIn_21_2).append(',').append(param1).append(',');
            stackIn_24_0 = stackOut_21_0;
            stackIn_24_1 = stackOut_21_1;
            stackIn_22_0 = stackOut_21_0;
            stackIn_22_1 = stackOut_21_1;
            if (param2 == null) {
              stackOut_24_0 = (RuntimeException) (Object) stackIn_24_0;
              stackOut_24_1 = (StringBuilder) (Object) stackIn_24_1;
              stackOut_24_2 = "null";
              stackIn_25_0 = stackOut_24_0;
              stackIn_25_1 = stackOut_24_1;
              stackIn_25_2 = stackOut_24_2;
              break L9;
            } else {
              stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
              stackOut_22_1 = (StringBuilder) (Object) stackIn_22_1;
              stackOut_22_2 = "{...}";
              stackIn_25_0 = stackOut_22_0;
              stackIn_25_1 = stackOut_22_1;
              stackIn_25_2 = stackOut_22_2;
              break L9;
            }
          }
          throw aa.a((Throwable) (Object) stackIn_25_0, stackIn_25_2 + ',' + 77 + ',' + param4 + ')');
        }
    }

    public static void a(int param0) {
        RuntimeException var1 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            field_b = null;
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
          throw aa.a((Throwable) (Object) var1, "pk.F(" + 4194303 + ')');
        }
    }

    final static id a(boolean param0) {
        RuntimeException var2 = null;
        id var2_ref = null;
        id stackIn_4_0 = null;
        RuntimeException decompiledCaughtException = null;
        id stackOut_3_0 = null;
        try {
          L0: {
            var2_ref = new id(true);
            var2_ref.field_e = param0;
            stackOut_3_0 = (id) var2_ref;
            stackIn_4_0 = stackOut_3_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw aa.a((Throwable) (Object) var2, "pk.D(" + param0 + ',' + 5731 + ')');
        }
        return stackIn_4_0;
    }

    final static rl a(pc param0) {
        RuntimeException var2 = null;
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        rl var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int stackIn_23_0 = 0;
        int stackIn_23_1 = 0;
        int stackIn_29_0 = 0;
        int stackIn_29_1 = 0;
        rl stackIn_36_0 = null;
        RuntimeException stackIn_38_0 = null;
        StringBuilder stackIn_38_1 = null;
        RuntimeException stackIn_40_0 = null;
        StringBuilder stackIn_40_1 = null;
        RuntimeException stackIn_41_0 = null;
        StringBuilder stackIn_41_1 = null;
        String stackIn_41_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_22_0 = 0;
        int stackOut_22_1 = 0;
        int stackOut_28_0 = 0;
        int stackOut_28_1 = 0;
        rl stackOut_35_0 = null;
        RuntimeException stackOut_37_0 = null;
        StringBuilder stackOut_37_1 = null;
        RuntimeException stackOut_40_0 = null;
        StringBuilder stackOut_40_1 = null;
        String stackOut_40_2 = null;
        RuntimeException stackOut_38_0 = null;
        StringBuilder stackOut_38_1 = null;
        String stackOut_38_2 = null;
        var8 = Pixelate.field_H ? 1 : 0;
        try {
          L0: {
            var2_int = param0.c(8, (byte) -34);
            if (var2_int > 0) {
              throw new IllegalStateException("" + var2_int);
            } else {
              L1: {
                int discarded$23 = -32;
                var3 = tj.a(param0) ? 1 : 0;
                int discarded$24 = -32;
                var4 = tj.a(param0) ? 1 : 0;
                var5 = new rl();
                var5.field_A = (short)param0.c(16, (byte) -34);
                int discarded$25 = 16;
                var5.field_k = bm.a(var5.field_k, (byte) -128, param0);
                int discarded$26 = 16;
                var5.field_N = bm.a(var5.field_N, (byte) -128, param0);
                int discarded$27 = 16;
                var5.field_E = bm.a(var5.field_E, (byte) -128, param0);
                var5.field_j = (short)param0.c(16, (byte) -34);
                int discarded$28 = 16;
                var5.field_h = bm.a(var5.field_h, (byte) -128, param0);
                int discarded$29 = 16;
                var5.field_I = bm.a(var5.field_I, (byte) -128, param0);
                int discarded$30 = 16;
                var5.field_o = bm.a(var5.field_o, (byte) -128, param0);
                if (var3 != 0) {
                  var5.field_a = (short)param0.c(16, (byte) -34);
                  int discarded$31 = 16;
                  var5.field_K = bm.a(var5.field_K, (byte) -128, param0);
                  int discarded$32 = 16;
                  var5.field_q = bm.a(var5.field_q, (byte) -128, param0);
                  int discarded$33 = 16;
                  var5.field_p = bm.a(var5.field_p, (byte) -128, param0);
                  int discarded$34 = 16;
                  var5.field_J = bm.a(var5.field_J, (byte) -128, param0);
                  int discarded$35 = 16;
                  var5.field_s = bm.a(var5.field_s, (byte) -128, param0);
                  int discarded$36 = 16;
                  var5.field_i = bm.a(var5.field_i, (byte) -128, param0);
                  break L1;
                } else {
                  break L1;
                }
              }
              L2: {
                if (var4 != 0) {
                  int discarded$37 = param0.c(16, (byte) -34);
                  int discarded$38 = 16;
                  var5.field_D = bm.a(var5.field_D, (byte) -128, param0);
                  int discarded$39 = 16;
                  var5.field_L = bm.a(var5.field_L, (byte) -128, param0);
                  int discarded$40 = 16;
                  var5.field_S = bm.a(var5.field_S, (byte) -128, param0);
                  int discarded$41 = 16;
                  var5.field_d = bm.a(var5.field_d, (byte) -128, param0);
                  int discarded$42 = 16;
                  var5.field_z = bm.a(var5.field_z, (byte) -128, param0);
                  break L2;
                } else {
                  break L2;
                }
              }
              L3: {
                int discarded$43 = -32;
                if (tj.a(param0)) {
                  int discarded$44 = 16;
                  var5.field_l = bm.a(var5.field_l, (byte) -128, param0);
                  break L3;
                } else {
                  break L3;
                }
              }
              L4: {
                int discarded$45 = -32;
                if (tj.a(param0)) {
                  var5.field_n = nl.a(param0, var5.field_n, 16, 121);
                  var6 = 0;
                  var7 = 0;
                  L5: while (true) {
                    L6: {
                      L7: {
                        if (var5.field_n.length <= var7) {
                          break L7;
                        } else {
                          stackOut_22_0 = var6;
                          stackOut_22_1 = 255 & var5.field_n[var7];
                          stackIn_29_0 = stackOut_22_0;
                          stackIn_29_1 = stackOut_22_1;
                          stackIn_23_0 = stackOut_22_0;
                          stackIn_23_1 = stackOut_22_1;
                          if (var8 != 0) {
                            break L6;
                          } else {
                            L8: {
                              if (stackIn_23_0 >= stackIn_23_1) {
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
                      stackOut_28_0 = -1;
                      stackOut_28_1 = ~var6;
                      stackIn_29_0 = stackOut_28_0;
                      stackIn_29_1 = stackOut_28_1;
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
              stackOut_35_0 = (rl) var5;
              stackIn_36_0 = stackOut_35_0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L10: {
            var2 = decompiledCaughtException;
            stackOut_37_0 = (RuntimeException) var2;
            stackOut_37_1 = new StringBuilder().append("pk.C(");
            stackIn_40_0 = stackOut_37_0;
            stackIn_40_1 = stackOut_37_1;
            stackIn_38_0 = stackOut_37_0;
            stackIn_38_1 = stackOut_37_1;
            if (param0 == null) {
              stackOut_40_0 = (RuntimeException) (Object) stackIn_40_0;
              stackOut_40_1 = (StringBuilder) (Object) stackIn_40_1;
              stackOut_40_2 = "null";
              stackIn_41_0 = stackOut_40_0;
              stackIn_41_1 = stackOut_40_1;
              stackIn_41_2 = stackOut_40_2;
              break L10;
            } else {
              stackOut_38_0 = (RuntimeException) (Object) stackIn_38_0;
              stackOut_38_1 = (StringBuilder) (Object) stackIn_38_1;
              stackOut_38_2 = "{...}";
              stackIn_41_0 = stackOut_38_0;
              stackIn_41_1 = stackOut_38_1;
              stackIn_41_2 = stackOut_38_2;
              break L10;
            }
          }
          throw aa.a((Throwable) (Object) stackIn_41_0, stackIn_41_2 + ',' + -1 + ')');
        }
        return stackIn_36_0;
    }

    final static boolean b(int param0) {
        RuntimeException var1 = null;
        int stackIn_5_0 = 0;
        int stackIn_8_0 = 0;
        int stackIn_10_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_9_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_4_0 = 0;
        try {
          L0: {
            L1: {
              if (param0 >= 119) {
                break L1;
              } else {
                field_d = null;
                break L1;
              }
            }
            if (oo.field_d) {
              if (ce.field_d == 0) {
                stackOut_9_0 = 1;
                stackIn_10_0 = stackOut_9_0;
                break L0;
              } else {
                stackOut_7_0 = 0;
                stackIn_8_0 = stackOut_7_0;
                return stackIn_8_0 != 0;
              }
            } else {
              stackOut_4_0 = 0;
              stackIn_5_0 = stackOut_4_0;
              return stackIn_5_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw aa.a((Throwable) (Object) var1, "pk.A(" + param0 + ')');
        }
        return stackIn_10_0 != 0;
    }

    final static String a() {
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
        String stackIn_60_0 = null;
        Object stackIn_96_0 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_59_0 = null;
        String stackOut_57_0 = null;
        Object stackOut_95_0 = null;
        var10 = Pixelate.field_H ? 1 : 0;
        try {
          L0: {
            L1: {
              var1 = null;
              var2 = null;
              if (ce.field_d != 0) {
                break L1;
              } else {
                if (null == bn.field_S) {
                  break L1;
                } else {
                  var2 = (Object) (Object) jh.field_P;
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
                      int discarded$2 = 37;
                      if (!ha.a(fp.field_d)) {
                        break L4;
                      } else {
                        var2 = (Object) (Object) sd.a(tn.field_m, 34, new String[1]);
                        if (var10 == 0) {
                          break L3;
                        } else {
                          break L4;
                        }
                      }
                    }
                    var2 = (Object) (Object) sd.a(fg.field_d, 34, new String[1]);
                    break L3;
                  }
                  if (!un.field_l) {
                    break L2;
                  } else {
                    ti.a(0, (String) null, (String) null, (byte) -82, 2, (String) var2);
                    po.a(true);
                    break L2;
                  }
                } else {
                  break L2;
                }
              }
            }
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
                    var2 = (Object) (Object) a.field_M;
                    break L5;
                  }
                }
              }
            }
            L6: {
              if (null != var2) {
                ap.a((String) null, 0, vp.field_Ib, 24092, (String) var2);
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
                        var4 = sd.a(dg.field_b, 73, new String[1]);
                        var8 = sd.a(sk.field_c, 69, new String[1]);
                        var7 = -485 + (nf.field_d.field_K + rh.field_y.field_K + vl.field_Q.c(var8) + -vl.field_Q.c(var4));
                        if (var7 >= 0) {
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
                            var4 = "[" + sd.a(fk.field_q, 40, new String[1]) + "] ";
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
                      stackOut_59_0 = ": ";
                      stackIn_60_0 = stackOut_59_0;
                      break L15;
                    } else {
                      stackOut_57_0 = "<img=3>: ";
                      stackIn_60_0 = stackOut_57_0;
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
                        if (~(-nf.field_d.field_tb + uf.field_d) > ~var9) {
                          if (!ln.field_q) {
                            var1 = (Object) (Object) ll.field_i;
                            break L18;
                          } else {
                            var1 = (Object) (Object) "Broken!";
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
                      if (~nf.field_d.field_ub <= ~var9) {
                        break L7;
                      } else {
                        if (ln.field_q) {
                          break L7;
                        } else {
                          int discarded$3 = 1;
                          ak.c();
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
                    var1 = (Object) (Object) sd.a(nn.field_m, 78, new String[2]);
                    break L20;
                  }
                }
                break L6;
              }
            }
            stackOut_95_0 = var1;
            stackIn_96_0 = stackOut_95_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = (Object) (Object) decompiledCaughtException;
          throw aa.a((Throwable) var1, "pk.E(" + 88 + ')');
        }
        return (String) (Object) stackIn_96_0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = new String[]{"Welcome to Pixelate!", "The Buffer Zone", "How To Play", "Game Mode: Challenge", "Game Mode: Challenge", "Game Mode: Puzzle", "Game Mode: Multiplayer", "Game Mode: Multiplayer"};
        field_e = "Players";
        field_b = "This password is part of your Player Name, and would be easy to guess";
        field_a = new int[]{0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, 2147483647, -1};
    }
}
