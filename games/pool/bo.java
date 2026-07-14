/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bo {
    static String field_b;
    static dd[] field_a;

    final static int b(int param0, int param1) {
        if (param0 == -65536) {
          if (-1 >= (param1 ^ -1)) {
            if (65536 < param1) {
              return -un.field_a[134217728 / param1] + 2048;
            } else {
              return un.field_a[param1 >> 910288389];
            }
          } else {
            if (param1 < -65536) {
              return un.field_a[134217728 / -param1] + -2048;
            } else {
              return -un.field_a[-param1 >> 1633905445];
            }
          }
        } else {
          bo.a((byte) -16);
          if (-1 >= (param1 ^ -1)) {
            if (65536 < param1) {
              return -un.field_a[134217728 / param1] + 2048;
            } else {
              return un.field_a[param1 >> 910288389];
            }
          } else {
            if (param1 < -65536) {
              return un.field_a[134217728 / -param1] + -2048;
            } else {
              return -un.field_a[-param1 >> 1633905445];
            }
          }
        }
    }

    public static void b(byte param0) {
        field_a = null;
        if (param0 != 45) {
            return;
        }
        field_b = null;
    }

    final static tq a(int param0, int param1) {
        tq var2 = null;
        if (param1 < 9) {
          return null;
        } else {
          var2 = new tq();
          hb.field_j.b((byte) 127, (ma) (Object) var2);
          kp.a(1, param0);
          return var2;
        }
    }

    final static void a(int param0, int param1, byte param2, int param3, int param4, int param5, int param6, byte param7, int param8, int[] param9, byte param10) {
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        int var23 = 0;
        int var24 = 0;
        int var25 = 0;
        int var26 = 0;
        param3 = param3 & -4;
        var11 = -66 % ((71 - param2) / 36);
        param5 = param5 & -4;
        param8 = param8 & -4;
        param6 = param6 & -4;
        param0 = param0 & -4;
        param4 = param4 & -4;
        kk.a(param8, param6, param0, param4, param5, param3, 1727215554);
        var12 = -na.field_f + la.field_f;
        var13 = wm.field_Nb + -or.field_a;
        var14 = var13 * var13 + var12 * var12 >> -381592446;
        if (var14 != 0) {
          var15 = (int)(Math.sqrt((double)((float)var14 / 4.0f)) * 4.0);
          var16 = ic.field_a;
          if (var16 < na.field_c) {
            var17 = -or.field_a + var16;
            var18 = -wm.field_Nb + var16;
            var19 = var17 * var13;
            var20 = var17 * var12;
            var21 = hd.field_I;
            if (wh.field_f > var21) {
              var22 = -na.field_f + var21;
              var23 = var21 - la.field_f;
              var24 = var22 * var12 + var19 >> -1136350;
              if (0 == param7) {
                if (0 <= var22 * ng.field_w - -(fr.field_u * var17)) {
                  if (param10 == 0) {
                    if (0 > var23 * ne.field_q + var18 * di.field_h) {
                      L0: {
                        L1: {
                          L2: {
                            L3: {
                              L4: {
                                if (2 == param7) {
                                  break L4;
                                } else {
                                  if (-1 >= (var24 ^ -1)) {
                                    break L4;
                                  } else {
                                    L5: {
                                      var25 = (int)Math.sqrt((double)(var22 * var22 + var17 * var17));
                                      if (param6 >= var25) {
                                        qh.b(var21 >> -469845502, var16 >> 1867618946, param9[param1 - var25 * param1 / param6]);
                                        break L5;
                                      } else {
                                        var21 += 4;
                                        break L5;
                                      }
                                    }
                                    var21 += 4;
                                    break L3;
                                  }
                                }
                              }
                              L6: {
                                if ((param10 ^ -1) == -3) {
                                  break L6;
                                } else {
                                  if (var14 >= var24) {
                                    break L6;
                                  } else {
                                    var25 = (int)Math.sqrt((double)(var18 * var18 + var23 * var23));
                                    if (param3 < var25) {
                                      break L3;
                                    } else {
                                      qh.b(var21 >> -2049453054, var16 >> 112382882, param9[param1 + -(param1 * var25 / param3)]);
                                      break L2;
                                    }
                                  }
                                }
                              }
                              L7: {
                                var25 = var13 * var22 - var20 >> -763357182;
                                if ((var25 ^ -1) > -1) {
                                  var25 = -var25;
                                  break L7;
                                } else {
                                  break L7;
                                }
                              }
                              var26 = ((var14 + -var24) * param6 + var24 * param3) / var14;
                              if (var25 >= var15 * var26 >> 1002652514) {
                                break L1;
                              } else {
                                qh.b(var21 >> -936474878, var16 >> -899084062, param9[param1 - (var25 << 133106498) * param1 / var26 / var15]);
                                break L0;
                              }
                            }
                            var21 += 4;
                            break L2;
                          }
                          var21 += 4;
                          break L1;
                        }
                        var21 += 4;
                        break L0;
                      }
                      var21 += 4;
                      var21 += 4;
                      var21 += 4;
                      var21 += 4;
                      var16 += 4;
                      return;
                    } else {
                      var21 += 4;
                      var21 += 4;
                      var21 += 4;
                      var16 += 4;
                      return;
                    }
                  } else {
                    L8: {
                      L9: {
                        L10: {
                          L11: {
                            L12: {
                              if (2 == param7) {
                                break L12;
                              } else {
                                if (-1 >= (var24 ^ -1)) {
                                  break L12;
                                } else {
                                  L13: {
                                    var25 = (int)Math.sqrt((double)(var22 * var22 + var17 * var17));
                                    if (param6 >= var25) {
                                      qh.b(var21 >> -469845502, var16 >> 1867618946, param9[param1 - var25 * param1 / param6]);
                                      break L13;
                                    } else {
                                      var21 += 4;
                                      break L13;
                                    }
                                  }
                                  var21 += 4;
                                  break L11;
                                }
                              }
                            }
                            L14: {
                              if ((param10 ^ -1) == -3) {
                                break L14;
                              } else {
                                if (var14 >= var24) {
                                  break L14;
                                } else {
                                  var25 = (int)Math.sqrt((double)(var18 * var18 + var23 * var23));
                                  if (param3 < var25) {
                                    break L11;
                                  } else {
                                    qh.b(var21 >> -2049453054, var16 >> 112382882, param9[param1 + -(param1 * var25 / param3)]);
                                    break L10;
                                  }
                                }
                              }
                            }
                            L15: {
                              var25 = var13 * var22 - var20 >> -763357182;
                              if ((var25 ^ -1) > -1) {
                                var25 = -var25;
                                break L15;
                              } else {
                                break L15;
                              }
                            }
                            var26 = ((var14 + -var24) * param6 + var24 * param3) / var14;
                            if (var25 >= var15 * var26 >> 1002652514) {
                              break L9;
                            } else {
                              qh.b(var21 >> -936474878, var16 >> -899084062, param9[param1 - (var25 << 133106498) * param1 / var26 / var15]);
                              break L8;
                            }
                          }
                          var21 += 4;
                          break L10;
                        }
                        var21 += 4;
                        break L9;
                      }
                      var21 += 4;
                      break L8;
                    }
                    var21 += 4;
                    var21 += 4;
                    var21 += 4;
                    var21 += 4;
                    var16 += 4;
                    return;
                  }
                } else {
                  var21 += 4;
                  var21 += 4;
                  var21 += 4;
                  var21 += 4;
                  var16 += 4;
                  return;
                }
              } else {
                L16: {
                  L17: {
                    if (param10 != 0) {
                      break L17;
                    } else {
                      if (0 > var23 * ne.field_q + var18 * di.field_h) {
                        break L17;
                      } else {
                        var21 += 4;
                        break L16;
                      }
                    }
                  }
                  L18: {
                    L19: {
                      L20: {
                        L21: {
                          L22: {
                            if (2 == param7) {
                              break L22;
                            } else {
                              if (-1 >= (var24 ^ -1)) {
                                break L22;
                              } else {
                                L23: {
                                  var25 = (int)Math.sqrt((double)(var22 * var22 + var17 * var17));
                                  if (param6 >= var25) {
                                    qh.b(var21 >> -469845502, var16 >> 1867618946, param9[param1 - var25 * param1 / param6]);
                                    break L23;
                                  } else {
                                    var21 += 4;
                                    break L23;
                                  }
                                }
                                var21 += 4;
                                break L21;
                              }
                            }
                          }
                          L24: {
                            if ((param10 ^ -1) == -3) {
                              break L24;
                            } else {
                              if (var14 >= var24) {
                                break L24;
                              } else {
                                var25 = (int)Math.sqrt((double)(var18 * var18 + var23 * var23));
                                if (param3 < var25) {
                                  break L21;
                                } else {
                                  qh.b(var21 >> -2049453054, var16 >> 112382882, param9[param1 + -(param1 * var25 / param3)]);
                                  break L20;
                                }
                              }
                            }
                          }
                          L25: {
                            var25 = var13 * var22 - var20 >> -763357182;
                            if ((var25 ^ -1) > -1) {
                              var25 = -var25;
                              break L25;
                            } else {
                              break L25;
                            }
                          }
                          var26 = ((var14 + -var24) * param6 + var24 * param3) / var14;
                          if (var25 >= var15 * var26 >> 1002652514) {
                            break L19;
                          } else {
                            qh.b(var21 >> -936474878, var16 >> -899084062, param9[param1 - (var25 << 133106498) * param1 / var26 / var15]);
                            break L18;
                          }
                        }
                        var21 += 4;
                        break L20;
                      }
                      var21 += 4;
                      break L19;
                    }
                    var21 += 4;
                    break L18;
                  }
                  var21 += 4;
                  var21 += 4;
                  break L16;
                }
                var21 += 4;
                var21 += 4;
                var16 += 4;
                return;
              }
            } else {
              var16 += 4;
              return;
            }
          } else {
            return;
          }
        } else {
          return;
        }
    }

    final static void a(byte param0) {
        Object var1 = null;
        Throwable var2 = null;
        Object var3 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var1 = (Object) (Object) wp.field_g;
                    // monitorenter wp.field_g
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        cd.field_b = ho.field_v;
                        qk.field_g = qk.field_g + 1;
                        wn.field_i = we.field_l;
                        gg.field_f = wn.field_k;
                        re.field_c = m.field_d;
                        m.field_d = false;
                        ne.field_s = kj.field_c;
                        lq.field_W = pq.field_f;
                        ua.field_o = ne.field_o;
                        kj.field_c = 0;
                        // monitorexit var1
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 3;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        var2 = caughtException;
                        // monitorexit var1
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 3;
                        continue stateLoop;
                    }
                }
                case 4: {
                    throw (RuntimeException) (Object) var2;
                }
                case 5: {
                    if (param0 < 86) {
                        statePc = 7;
                    } else {
                        statePc = 6;
                    }
                    continue stateLoop;
                }
                case 6: {
                    return;
                }
                case 7: {
                    var3 = null;
                    bo.a(94, 67, (byte) 67, -120, -99, 36, -121, (byte) 15, 19, (int[]) null, (byte) 9);
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final static boolean a(int param0, byte param1) {
        int stackIn_5_0 = 0;
        int stackIn_11_0 = 0;
        int stackIn_24_0 = 0;
        int stackIn_30_0 = 0;
        int stackIn_37_0 = 0;
        int stackOut_29_0 = 0;
        int stackOut_28_0 = 0;
        int stackOut_36_0 = 0;
        int stackOut_35_0 = 0;
        int stackOut_23_0 = 0;
        int stackOut_22_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_3_0 = 0;
        if (param1 == 43) {
          if (-1 <= param0) {
            if (param0 < 1582) {
              L0: {
                if (0 != param0 % 4) {
                  stackOut_29_0 = 0;
                  stackIn_30_0 = stackOut_29_0;
                  break L0;
                } else {
                  stackOut_28_0 = 1;
                  stackIn_30_0 = stackOut_28_0;
                  break L0;
                }
              }
              return stackIn_30_0 != 0;
            } else {
              if (param0 % 4 == 0) {
                if (param0 % 100 != 0) {
                  return true;
                } else {
                  L1: {
                    if (param0 % 400 != 0) {
                      stackOut_36_0 = 0;
                      stackIn_37_0 = stackOut_36_0;
                      break L1;
                    } else {
                      stackOut_35_0 = 1;
                      stackIn_37_0 = stackOut_35_0;
                      break L1;
                    }
                  }
                  return stackIn_37_0 != 0;
                }
              } else {
                return false;
              }
            }
          } else {
            L2: {
              if (-1 != ((param0 - -1) % 4 ^ -1)) {
                stackOut_23_0 = 0;
                stackIn_24_0 = stackOut_23_0;
                break L2;
              } else {
                stackOut_22_0 = 1;
                stackIn_24_0 = stackOut_22_0;
                break L2;
              }
            }
            return stackIn_24_0 != 0;
          }
        } else {
          field_a = null;
          if (-1 >= param0) {
            if (param0 < 1582) {
              L3: {
                if (0 != param0 % 4) {
                  stackOut_10_0 = 0;
                  stackIn_11_0 = stackOut_10_0;
                  break L3;
                } else {
                  stackOut_9_0 = 1;
                  stackIn_11_0 = stackOut_9_0;
                  break L3;
                }
              }
              return stackIn_11_0 != 0;
            } else {
              if (param0 % 4 == 0) {
                if (param0 % 100 == 0) {
                  if (param0 % 400 == -1) {
                    return true;
                  } else {
                    return false;
                  }
                } else {
                  return true;
                }
              } else {
                return false;
              }
            }
          } else {
            L4: {
              if (-1 != (param0 - -1) % 4) {
                stackOut_4_0 = 0;
                stackIn_5_0 = stackOut_4_0;
                break L4;
              } else {
                stackOut_3_0 = 1;
                stackIn_5_0 = stackOut_3_0;
                break L4;
              }
            }
            return stackIn_5_0 != 0;
          }
        }
    }

    final static void a(int param0) {
        int var1 = 0;
        int var2 = 0;
        int var3 = 0;
        var1 = lq.field_T[0];
        if (param0 >= -85) {
          boolean discarded$2 = bo.a(53, (byte) 68);
          var2 = 1;
          L0: while (true) {
            if (lq.field_T.length <= var2) {
              return;
            } else {
              var3 = lq.field_T[var2];
              qn.a(tl.field_I, var2 << 641789860, tl.field_I, var1, var3);
              var1 = var1 + var3;
              var2++;
              continue L0;
            }
          }
        } else {
          var2 = 1;
          L1: while (true) {
            if (lq.field_T.length <= var2) {
              return;
            } else {
              var3 = lq.field_T[var2];
              qn.a(tl.field_I, var2 << 641789860, tl.field_I, var1, var3);
              var1 = var1 + var3;
              var2++;
              continue L1;
            }
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = "Break";
    }
}
