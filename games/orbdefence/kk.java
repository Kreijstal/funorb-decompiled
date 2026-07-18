/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kk extends te {
    private ga field_T;
    static String field_Y;
    private String field_R;
    static im field_X;
    private int field_Q;
    private hj field_W;
    static qg[] field_P;
    static int[] field_U;
    static char[] field_V;
    static int field_S;

    kk(ga param0, String param1, int param2, int param3, int param4, int param5) {
        super(param1, (td) (Object) kd.a(false));
        RuntimeException runtimeException = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        try {
          L0: {
            ((kk) this).field_R = param1;
            ((kk) this).field_T = param0;
            ((kk) this).a(param2, param3, param5, (byte) -90, param4);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            runtimeException = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) runtimeException;
            stackOut_3_1 = new StringBuilder().append("kk.<init>(");
            stackIn_6_0 = stackOut_3_0;
            stackIn_6_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param0 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L1;
            } else {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "{...}";
              stackIn_7_0 = stackOut_4_0;
              stackIn_7_1 = stackOut_4_1;
              stackIn_7_2 = stackOut_4_2;
              break L1;
            }
          }
          L2: {
            stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
            stackOut_7_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(',');
            stackIn_10_0 = stackOut_7_0;
            stackIn_10_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param1 == null) {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L2;
            } else {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "{...}";
              stackIn_11_0 = stackOut_8_0;
              stackIn_11_1 = stackOut_8_1;
              stackIn_11_2 = stackOut_8_2;
              break L2;
            }
          }
          throw dd.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    final boolean a(int param0, pj param1) {
        RuntimeException var3 = null;
        int stackIn_4_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        try {
          L0: {
            L1: {
              if (param0 == -81) {
                break L1;
              } else {
                ((kk) this).field_Q = 3;
                break L1;
              }
            }
            stackOut_3_0 = 0;
            stackIn_4_0 = stackOut_3_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var3;
            stackOut_5_1 = new StringBuilder().append("kk.E(").append(param0).append(',');
            stackIn_8_0 = stackOut_5_0;
            stackIn_8_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param1 == null) {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L2;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_9_0 = stackOut_6_0;
              stackIn_9_1 = stackOut_6_1;
              stackIn_9_2 = stackOut_6_2;
              break L2;
            }
          }
          throw dd.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + ')');
        }
        return stackIn_4_0 != 0;
    }

    final static int a(int param0, int param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int stackIn_3_0 = 0;
        int stackIn_23_0 = 0;
        int stackIn_31_0 = 0;
        int stackIn_34_0 = 0;
        int stackIn_36_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_22_0 = 0;
        int stackOut_30_0 = 0;
        int stackOut_35_0 = 0;
        int stackOut_33_0 = 0;
        int stackOut_2_0 = 0;
        var3 = OrbDefence.field_D ? 1 : 0;
        try {
          L0: {
            cf.field_a = null;
            dd.field_A = null;
            mc.field_j = 0;
            if (param0 == -30179) {
              L1: {
                L2: {
                  var2_int = ta.field_z;
                  ta.field_z = hf.field_k;
                  hf.field_k = var2_int;
                  kg.field_h.field_b = kg.field_h.field_b + 1;
                  if (param1 != 51) {
                    break L2;
                  } else {
                    kg.field_h.field_n = 2;
                    if (var3 == 0) {
                      break L1;
                    } else {
                      break L2;
                    }
                  }
                }
                L3: {
                  if (param1 != 50) {
                    break L3;
                  } else {
                    kg.field_h.field_n = 5;
                    if (var3 == 0) {
                      break L1;
                    } else {
                      break L3;
                    }
                  }
                }
                kg.field_h.field_n = 1;
                break L1;
              }
              L4: {
                if (2 > kg.field_h.field_b) {
                  break L4;
                } else {
                  if (param1 == 51) {
                    stackOut_22_0 = 2;
                    stackIn_23_0 = stackOut_22_0;
                    return stackIn_23_0;
                  } else {
                    break L4;
                  }
                }
              }
              L5: {
                if (kg.field_h.field_b < 2) {
                  break L5;
                } else {
                  if (param1 == 50) {
                    stackOut_30_0 = 5;
                    stackIn_31_0 = stackOut_30_0;
                    return stackIn_31_0;
                  } else {
                    break L5;
                  }
                }
              }
              if (4 > kg.field_h.field_b) {
                stackOut_35_0 = -1;
                stackIn_36_0 = stackOut_35_0;
                break L0;
              } else {
                stackOut_33_0 = 1;
                stackIn_34_0 = stackOut_33_0;
                return stackIn_34_0;
              }
            } else {
              stackOut_2_0 = 72;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw dd.a((Throwable) (Object) var2, "kk.N(" + param0 + ',' + param1 + ')');
        }
        return stackIn_36_0;
    }

    public static void l(int param0) {
        field_Y = null;
        field_U = null;
        field_X = null;
        if (param0 <= 71) {
            return;
        }
        try {
            field_P = null;
            field_V = null;
        } catch (RuntimeException runtimeException) {
            throw dd.a((Throwable) (Object) runtimeException, "kk.M(" + param0 + ')');
        }
    }

    final void a(int param0, int param1, int param2, int param3) {
        RuntimeException var5 = null;
        String var5_ref = null;
        qd var6 = null;
        hj var7 = null;
        rj var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        RuntimeException decompiledCaughtException = null;
        var13 = OrbDefence.field_D ? 1 : 0;
        try {
          L0: {
            L1: {
              L2: {
                var6 = ((kk) this).field_T.d(-7847);
                if (ml.field_a == var6) {
                  break L2;
                } else {
                  if (var6 == uj.field_b) {
                    break L2;
                  } else {
                    var5_ref = ((kk) this).field_T.a(param2 ^ 1048451);
                    if (null != var5_ref) {
                      break L1;
                    } else {
                      var5_ref = ((kk) this).field_R;
                      if (var13 == 0) {
                        break L1;
                      } else {
                        break L2;
                      }
                    }
                  }
                }
              }
              var5_ref = pi.field_g;
              break L1;
            }
            L3: {
              if (var5_ref.equals((Object) (Object) ((kk) this).field_l)) {
                break L3;
              } else {
                ((kk) this).field_l = var5_ref;
                ((kk) this).a((byte) -127);
                break L3;
              }
            }
            L4: {
              super.a(param0, param1, param2, param3);
              if (param2 == 1048575) {
                break L4;
              } else {
                ((kk) this).field_R = null;
                break L4;
              }
            }
            L5: {
              L6: {
                var6 = ((kk) this).field_T.d(-7847);
                var8 = (rj) (Object) ((kk) this).field_j;
                var9 = param3 - -((kk) this).field_s;
                var10 = var8.a((pj) this, 9534, param0) - -(var8.a((pj) this, true).b(122) >> 358868577);
                if (var6 == ml.field_a) {
                  break L6;
                } else {
                  if (uj.field_b == var6) {
                    break L6;
                  } else {
                    L7: {
                      if (vh.field_h != var6) {
                        break L7;
                      } else {
                        var7 = wd.field_C[2];
                        var7.e(var9, var10 - (var7.field_k >> 577066561), 256);
                        if (var13 == 0) {
                          break L5;
                        } else {
                          break L7;
                        }
                      }
                    }
                    if (var6 != nc.field_bb) {
                      break L5;
                    } else {
                      var7 = wd.field_C[1];
                      var7.e(var9, -(var7.field_k >> -252404159) + var10, 256);
                      if (var13 == 0) {
                        break L5;
                      } else {
                        break L6;
                      }
                    }
                  }
                }
              }
              L8: {
                L9: {
                  L10: {
                    var7 = wd.field_C[0];
                    var11 = var7.field_s << -359941919;
                    var12 = var7.field_t << -859856799;
                    if (null == ((kk) this).field_W) {
                      break L10;
                    } else {
                      if (~var11 < ~((kk) this).field_W.field_o) {
                        break L10;
                      } else {
                        if (~((kk) this).field_W.field_k <= ~var12) {
                          break L9;
                        } else {
                          break L10;
                        }
                      }
                    }
                  }
                  ((kk) this).field_W = new hj(var11, var12);
                  de.a(param2 + -1048697, ((kk) this).field_W);
                  if (var13 == 0) {
                    break L8;
                  } else {
                    break L9;
                  }
                }
                de.a(-123, ((kk) this).field_W);
                ul.d();
                break L8;
              }
              var7.b(112, 144, var7.field_s << -316343036, var7.field_t << 1497717828, -((kk) this).field_Q << -1522496918, 4096);
              oc.g((byte) -105);
              ((kk) this).field_W.e(-(var7.field_s >> -1855429215) + var9, -var7.field_t + var10, 256);
              break L5;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          throw dd.a((Throwable) (Object) var5, "kk.L(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final static hj[] a(int param0, int param1, int param2, int param3, byte param4, int param5, int param6, int param7, int param8) {
        RuntimeException var9 = null;
        int var9_int = 0;
        hj[] var10 = null;
        hj[] var11_ref_hj__ = null;
        int var11 = 0;
        int var12 = 0;
        hj var13 = null;
        int var14 = 0;
        int var15 = 0;
        int stackIn_4_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_18_0 = 0;
        int stackIn_27_0 = 0;
        int stackIn_29_0 = 0;
        int stackIn_29_1 = 0;
        int stackIn_31_0 = 0;
        int stackIn_34_0 = 0;
        int stackIn_34_1 = 0;
        int stackIn_40_0 = 0;
        int stackIn_43_0 = 0;
        int stackIn_52_0 = 0;
        hj[] stackIn_63_0 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_17_0 = 0;
        int stackOut_26_0 = 0;
        int stackOut_28_0 = 0;
        int stackOut_28_1 = 0;
        int stackOut_30_0 = 0;
        int stackOut_33_0 = 0;
        int stackOut_33_1 = 0;
        int stackOut_39_0 = 0;
        int stackOut_42_0 = 0;
        int stackOut_51_0 = 0;
        hj[] stackOut_62_0 = null;
        var15 = OrbDefence.field_D ? 1 : 0;
        try {
          L0: {
            var9_int = param3 + (param1 - -param6);
            var10 = new hj[]{new hj(var9_int, var9_int), new hj(param0, var9_int), new hj(var9_int, var9_int), new hj(var9_int, param0), new hj(64, 64), new hj(var9_int, param0), new hj(var9_int, var9_int), new hj(param0, var9_int), new hj(var9_int, var9_int)};
            var11_ref_hj__ = var10;
            var12 = 0;
            L1: while (true) {
              L2: {
                L3: {
                  if (~var12 <= ~var11_ref_hj__.length) {
                    break L3;
                  } else {
                    var13 = var11_ref_hj__[var12];
                    stackOut_3_0 = 0;
                    stackIn_13_0 = stackOut_3_0;
                    stackIn_4_0 = stackOut_3_0;
                    if (var15 != 0) {
                      break L2;
                    } else {
                      var14 = stackIn_4_0;
                      L4: while (true) {
                        L5: {
                          L6: {
                            if (var13.field_v.length <= var14) {
                              break L6;
                            } else {
                              var13.field_v[var14] = param5;
                              var14++;
                              if (var15 != 0) {
                                break L5;
                              } else {
                                if (var15 == 0) {
                                  continue L4;
                                } else {
                                  break L6;
                                }
                              }
                            }
                          }
                          var12++;
                          break L5;
                        }
                        if (var15 == 0) {
                          continue L1;
                        } else {
                          break L3;
                        }
                      }
                    }
                  }
                }
                stackOut_12_0 = 0;
                stackIn_13_0 = stackOut_12_0;
                break L2;
              }
              L7: {
                var11 = stackIn_13_0;
                if (param4 >= 28) {
                  break L7;
                } else {
                  int discarded$1 = kk.a(-33, 100);
                  break L7;
                }
              }
              L8: while (true) {
                L9: {
                  L10: {
                    if (~param1 >= ~var11) {
                      break L10;
                    } else {
                      stackOut_17_0 = 0;
                      stackIn_27_0 = stackOut_17_0;
                      stackIn_18_0 = stackOut_17_0;
                      if (var15 != 0) {
                        break L9;
                      } else {
                        var12 = stackIn_18_0;
                        L11: while (true) {
                          L12: {
                            L13: {
                              if (var9_int <= var12) {
                                break L13;
                              } else {
                                var10[6].field_v[var9_int * (-var11 + (var9_int + -1)) - -var12] = param7;
                                var10[8].field_v[var9_int * (-1 + (var9_int - var11)) - -var12] = param7;
                                var10[2].field_v[-var11 + (-1 + var9_int) + var12 * var9_int] = param7;
                                var10[8].field_v[var12 * var9_int - var11 - 1 - -var9_int] = param7;
                                var12++;
                                if (var15 != 0) {
                                  break L12;
                                } else {
                                  if (var15 == 0) {
                                    continue L11;
                                  } else {
                                    break L13;
                                  }
                                }
                              }
                            }
                            var11++;
                            break L12;
                          }
                          if (var15 == 0) {
                            continue L8;
                          } else {
                            break L10;
                          }
                        }
                      }
                    }
                  }
                  stackOut_26_0 = 0;
                  stackIn_27_0 = stackOut_26_0;
                  break L9;
                }
                var11 = stackIn_27_0;
                L14: while (true) {
                  stackOut_28_0 = ~var11;
                  stackOut_28_1 = ~param1;
                  stackIn_29_0 = stackOut_28_0;
                  stackIn_29_1 = stackOut_28_1;
                  L15: while (true) {
                    L16: {
                      L17: {
                        if (stackIn_29_0 <= stackIn_29_1) {
                          break L17;
                        } else {
                          stackOut_30_0 = 0;
                          stackIn_40_0 = stackOut_30_0;
                          stackIn_31_0 = stackOut_30_0;
                          if (var15 != 0) {
                            break L16;
                          } else {
                            var12 = stackIn_31_0;
                            L18: while (true) {
                              L19: {
                                if (var9_int <= var12) {
                                  break L19;
                                } else {
                                  var10[0].field_v[var12 - -(var11 * var9_int)] = param2;
                                  var10[0].field_v[var12 * var9_int + var11] = param2;
                                  stackOut_33_0 = var9_int + -var11;
                                  stackOut_33_1 = var12;
                                  stackIn_29_0 = stackOut_33_0;
                                  stackIn_29_1 = stackOut_33_1;
                                  stackIn_34_0 = stackOut_33_0;
                                  stackIn_34_1 = stackOut_33_1;
                                  if (var15 != 0) {
                                    continue L15;
                                  } else {
                                    L20: {
                                      if (stackIn_34_0 > stackIn_34_1) {
                                        var10[2].field_v[var11 * var9_int + var12] = param2;
                                        var10[6].field_v[var11 + var9_int * var12] = param2;
                                        break L20;
                                      } else {
                                        break L20;
                                      }
                                    }
                                    var12++;
                                    if (var15 == 0) {
                                      continue L18;
                                    } else {
                                      break L19;
                                    }
                                  }
                                }
                              }
                              var11++;
                              if (var15 == 0) {
                                continue L14;
                              } else {
                                break L17;
                              }
                            }
                          }
                        }
                      }
                      stackOut_39_0 = 0;
                      stackIn_40_0 = stackOut_39_0;
                      break L16;
                    }
                    var11 = stackIn_40_0;
                    L21: while (true) {
                      L22: {
                        L23: {
                          if (~param0 >= ~var11) {
                            break L23;
                          } else {
                            stackOut_42_0 = 0;
                            stackIn_52_0 = stackOut_42_0;
                            stackIn_43_0 = stackOut_42_0;
                            if (var15 != 0) {
                              break L22;
                            } else {
                              var12 = stackIn_43_0;
                              L24: while (true) {
                                L25: {
                                  L26: {
                                    if (~param1 >= ~var12) {
                                      break L26;
                                    } else {
                                      var10[7].field_v[param0 * (-1 + (var9_int + -var12)) - -var11] = param7;
                                      var10[5].field_v[var9_int - (1 - (-var12 + var11 * var9_int))] = param7;
                                      var10[1].field_v[var11 + var12 * param0] = param2;
                                      var10[3].field_v[var9_int * var11 + var12] = param2;
                                      var12++;
                                      if (var15 != 0) {
                                        break L25;
                                      } else {
                                        if (var15 == 0) {
                                          continue L24;
                                        } else {
                                          break L26;
                                        }
                                      }
                                    }
                                  }
                                  var11++;
                                  break L25;
                                }
                                if (var15 == 0) {
                                  continue L21;
                                } else {
                                  break L23;
                                }
                              }
                            }
                          }
                        }
                        stackOut_51_0 = 0;
                        stackIn_52_0 = stackOut_51_0;
                        break L22;
                      }
                      var11 = stackIn_52_0;
                      L27: while (true) {
                        L28: {
                          if (var11 >= param0 >> 1171161633) {
                            break L28;
                          } else {
                            var12 = 0;
                            L29: while (true) {
                              L30: {
                                L31: {
                                  if (~var12 <= ~param3) {
                                    break L31;
                                  } else {
                                    var10[1].field_v[param0 * (-1 + var9_int + -var12) - -var11] = param8;
                                    var10[3].field_v[var11 * var9_int + (-var12 + -1) + var9_int] = param8;
                                    var10[7].field_v[var11 + var12 * param0] = param8;
                                    var10[5].field_v[var9_int * var11 - -var12] = param8;
                                    var12++;
                                    if (var15 != 0) {
                                      break L30;
                                    } else {
                                      if (var15 == 0) {
                                        continue L29;
                                      } else {
                                        break L31;
                                      }
                                    }
                                  }
                                }
                                var11++;
                                break L30;
                              }
                              if (var15 == 0) {
                                continue L27;
                              } else {
                                break L28;
                              }
                            }
                          }
                        }
                        stackOut_62_0 = (hj[]) var10;
                        stackIn_63_0 = stackOut_62_0;
                        break L0;
                      }
                    }
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var9 = decompiledCaughtException;
          throw dd.a((Throwable) (Object) var9, "kk.K(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ',' + param8 + ')');
        }
        return stackIn_63_0;
    }

    final static boolean a(String param0, String param1, int param2) {
        RuntimeException var3 = null;
        int stackIn_4_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_17_0 = 0;
        int stackIn_20_0 = 0;
        int stackIn_23_0 = 0;
        int stackIn_26_0 = 0;
        int stackIn_28_0 = 0;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        String stackIn_33_2 = null;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        RuntimeException stackIn_36_0 = null;
        StringBuilder stackIn_36_1 = null;
        RuntimeException stackIn_37_0 = null;
        StringBuilder stackIn_37_1 = null;
        String stackIn_37_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_16_0 = 0;
        int stackOut_27_0 = 0;
        int stackOut_25_0 = 0;
        int stackOut_22_0 = 0;
        int stackOut_19_0 = 0;
        int stackOut_11_0 = 0;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        RuntimeException stackOut_32_0 = null;
        StringBuilder stackOut_32_1 = null;
        String stackOut_32_2 = null;
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        String stackOut_30_2 = null;
        RuntimeException stackOut_33_0 = null;
        StringBuilder stackOut_33_1 = null;
        RuntimeException stackOut_36_0 = null;
        StringBuilder stackOut_36_1 = null;
        String stackOut_36_2 = null;
        RuntimeException stackOut_34_0 = null;
        StringBuilder stackOut_34_1 = null;
        String stackOut_34_2 = null;
        try {
          L0: {
            if (md.a(-20767, param1)) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              return stackIn_4_0 != 0;
            } else {
              if (me.a(param1, (byte) -44)) {
                stackOut_8_0 = 0;
                stackIn_9_0 = stackOut_8_0;
                return stackIn_9_0 != 0;
              } else {
                if (!mm.a(param1, (byte) 51)) {
                  if (param2 == ~param0.length()) {
                    stackOut_16_0 = 1;
                    stackIn_17_0 = stackOut_16_0;
                    return stackIn_17_0 != 0;
                  } else {
                    if (!df.a(param1, (byte) 117, param0)) {
                      if (!vh.a(false, param0, param1)) {
                        if (!l.a(117, param1, param0)) {
                          stackOut_27_0 = 1;
                          stackIn_28_0 = stackOut_27_0;
                          break L0;
                        } else {
                          stackOut_25_0 = 0;
                          stackIn_26_0 = stackOut_25_0;
                          return stackIn_26_0 != 0;
                        }
                      } else {
                        stackOut_22_0 = 0;
                        stackIn_23_0 = stackOut_22_0;
                        return stackIn_23_0 != 0;
                      }
                    } else {
                      stackOut_19_0 = 0;
                      stackIn_20_0 = stackOut_19_0;
                      return stackIn_20_0 != 0;
                    }
                  }
                } else {
                  stackOut_11_0 = 0;
                  stackIn_12_0 = stackOut_11_0;
                  return stackIn_12_0 != 0;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_29_0 = (RuntimeException) var3;
            stackOut_29_1 = new StringBuilder().append("kk.O(");
            stackIn_32_0 = stackOut_29_0;
            stackIn_32_1 = stackOut_29_1;
            stackIn_30_0 = stackOut_29_0;
            stackIn_30_1 = stackOut_29_1;
            if (param0 == null) {
              stackOut_32_0 = (RuntimeException) (Object) stackIn_32_0;
              stackOut_32_1 = (StringBuilder) (Object) stackIn_32_1;
              stackOut_32_2 = "null";
              stackIn_33_0 = stackOut_32_0;
              stackIn_33_1 = stackOut_32_1;
              stackIn_33_2 = stackOut_32_2;
              break L1;
            } else {
              stackOut_30_0 = (RuntimeException) (Object) stackIn_30_0;
              stackOut_30_1 = (StringBuilder) (Object) stackIn_30_1;
              stackOut_30_2 = "{...}";
              stackIn_33_0 = stackOut_30_0;
              stackIn_33_1 = stackOut_30_1;
              stackIn_33_2 = stackOut_30_2;
              break L1;
            }
          }
          L2: {
            stackOut_33_0 = (RuntimeException) (Object) stackIn_33_0;
            stackOut_33_1 = ((StringBuilder) (Object) stackIn_33_1).append(stackIn_33_2).append(',');
            stackIn_36_0 = stackOut_33_0;
            stackIn_36_1 = stackOut_33_1;
            stackIn_34_0 = stackOut_33_0;
            stackIn_34_1 = stackOut_33_1;
            if (param1 == null) {
              stackOut_36_0 = (RuntimeException) (Object) stackIn_36_0;
              stackOut_36_1 = (StringBuilder) (Object) stackIn_36_1;
              stackOut_36_2 = "null";
              stackIn_37_0 = stackOut_36_0;
              stackIn_37_1 = stackOut_36_1;
              stackIn_37_2 = stackOut_36_2;
              break L2;
            } else {
              stackOut_34_0 = (RuntimeException) (Object) stackIn_34_0;
              stackOut_34_1 = (StringBuilder) (Object) stackIn_34_1;
              stackOut_34_2 = "{...}";
              stackIn_37_0 = stackOut_34_0;
              stackIn_37_1 = stackOut_34_1;
              stackIn_37_2 = stackOut_34_2;
              break L2;
            }
          }
          throw dd.a((Throwable) (Object) stackIn_37_0, stackIn_37_2 + ',' + param2 + ')');
        }
        return stackIn_28_0 != 0;
    }

    final String g(int param0) {
        RuntimeException var2 = null;
        Object stackIn_2_0 = null;
        Object stackIn_4_0 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_3_0 = null;
        Object stackOut_1_0 = null;
        try {
          L0: {
            if (param0 == -8235) {
              stackOut_3_0 = null;
              stackIn_4_0 = stackOut_3_0;
              break L0;
            } else {
              stackOut_1_0 = null;
              stackIn_2_0 = stackOut_1_0;
              return (String) (Object) stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw dd.a((Throwable) (Object) var2, "kk.IA(" + param0 + ')');
        }
        return (String) (Object) stackIn_4_0;
    }

    final void a(byte param0, pj param1, int param2, int param3) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_2_0 = null;
        StringBuilder stackOut_2_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        String stackOut_3_2 = null;
        try {
          L0: {
            ((kk) this).field_Q = ((kk) this).field_Q + 1;
            super.a(param0, param1, param2, param3);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            runtimeException = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) runtimeException;
            stackOut_2_1 = new StringBuilder().append("kk.A(").append(param0).append(',');
            stackIn_5_0 = stackOut_2_0;
            stackIn_5_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param1 == null) {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L1;
            } else {
              stackOut_3_0 = (RuntimeException) (Object) stackIn_3_0;
              stackOut_3_1 = (StringBuilder) (Object) stackIn_3_1;
              stackOut_3_2 = "{...}";
              stackIn_6_0 = stackOut_3_0;
              stackIn_6_1 = stackOut_3_1;
              stackIn_6_2 = stackOut_3_2;
              break L1;
            }
          }
          throw dd.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + ',' + param2 + ',' + param3 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_X = new im();
        field_V = new char[]{' ', ' ', '_', '-', 'à', 'á', 'â', 'ä', 'ã', 'À', 'Á', 'Â', 'Ä', 'Ã', 'è', 'é', 'ê', 'ë', 'È', 'É', 'Ê', 'Ë', 'í', 'î', 'ï', 'Í', 'Î', 'Ï', 'ò', 'ó', 'ô', 'ö', 'õ', 'Ò', 'Ó', 'Ô', 'Ö', 'Õ', 'ù', 'ú', 'û', 'ü', 'Ù', 'Ú', 'Û', 'Ü', 'ç', 'Ç', 'ÿ', 'Ÿ', 'ñ', 'Ñ', 'ß'};
    }
}
