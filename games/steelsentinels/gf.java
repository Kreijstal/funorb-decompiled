/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gf {
    static fm field_b;
    static mi field_d;
    static dm field_a;
    static wk[] field_c;
    static String field_e;

    final static int a(int param0, int param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int stackIn_15_0 = 0;
        int stackIn_23_0 = 0;
        int stackIn_29_0 = 0;
        int stackIn_34_0 = 0;
        int stackIn_36_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_22_0 = 0;
        int stackOut_28_0 = 0;
        int stackOut_33_0 = 0;
        int stackOut_35_0 = 0;
        int stackOut_14_0 = 0;
        var3 = SteelSentinels.field_G;
        try {
          L0: {
            L1: {
              L2: {
                ha.field_T = null;
                nf.field_c = null;
                wh.field_d = 0;
                var2_int = ih.field_n;
                ih.field_n = lh.field_B;
                ne.field_N.field_f = ne.field_N.field_f + 1;
                if (param0 == 51) {
                  break L2;
                } else {
                  L3: {
                    if (param0 != 50) {
                      break L3;
                    } else {
                      ne.field_N.field_t = 5;
                      if (var3 == 0) {
                        break L1;
                      } else {
                        break L3;
                      }
                    }
                  }
                  ne.field_N.field_t = 1;
                  if (var3 == 0) {
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              ne.field_N.field_t = 2;
              break L1;
            }
            if (param1 == 16777215) {
              L4: {
                lh.field_B = var2_int;
                if (2 > ne.field_N.field_f) {
                  break L4;
                } else {
                  if (param0 == 51) {
                    stackOut_22_0 = 2;
                    stackIn_23_0 = stackOut_22_0;
                    return stackIn_23_0;
                  } else {
                    break L4;
                  }
                }
              }
              L5: {
                if (2 > ne.field_N.field_f) {
                  break L5;
                } else {
                  if (50 != param0) {
                    break L5;
                  } else {
                    stackOut_28_0 = 5;
                    stackIn_29_0 = stackOut_28_0;
                    return stackIn_29_0;
                  }
                }
              }
              if (4 <= ne.field_N.field_f) {
                stackOut_33_0 = 1;
                stackIn_34_0 = stackOut_33_0;
                return stackIn_34_0;
              } else {
                stackOut_35_0 = -1;
                stackIn_36_0 = stackOut_35_0;
                break L0;
              }
            } else {
              stackOut_14_0 = 29;
              stackIn_15_0 = stackOut_14_0;
              return stackIn_15_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ci.a((Throwable) (Object) var2, "gf.B(" + param0 + ',' + param1 + ')');
        }
        return stackIn_36_0;
    }

    final static void a(int param0) {
        RuntimeException var1 = null;
        int var1_int = 0;
        int[] var2 = null;
        int var3_int = 0;
        wk var3 = null;
        int var4 = 0;
        int var5 = 0;
        int stackIn_4_0 = 0;
        int stackIn_20_0 = 0;
        int stackIn_33_0 = 0;
        int stackIn_46_0 = 0;
        int stackIn_49_0 = 0;
        int stackIn_49_1 = 0;
        int stackIn_63_0 = 0;
        int stackIn_63_1 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_19_0 = 0;
        int stackOut_32_0 = 0;
        int stackOut_45_0 = 0;
        int stackOut_48_0 = 0;
        int stackOut_48_1 = 0;
        int stackOut_62_0 = 0;
        int stackOut_62_1 = 0;
        var5 = SteelSentinels.field_G;
        try {
          L0: {
            jk.a((byte) 6);
            le.field_K = 77;
            bc.a(49, 9, 56, 0, fa.field_b, 16711680, 255);
            bc.a(83, 1, 63, 56, fa.field_b, 16711680, 255);
            ta.field_e = pf.field_b;
            rf.a(ea.field_m, 320, 8, 8, 8, 8, hk.field_Tb, 16777215, 0, (mi) (Object) pl.field_U, 1146810, 240, 2, param0 + -94, wc.field_d);
            im.a(hk.field_Tb, 0, 8, -13782, ea.field_m, 16777215, 8, 8, 2, 240, (mi) (Object) pl.field_U, 1146810, wc.field_d, 320, 8);
            eb.field_s = new wk[9];
            var1_int = 0;
            L1: while (true) {
              L2: {
                L3: {
                  if (var1_int >= 9) {
                    break L3;
                  } else {
                    eb.field_s[var1_int] = pl.field_T[var1_int].g();
                    stackOut_3_0 = ~var1_int;
                    stackIn_20_0 = stackOut_3_0;
                    stackIn_4_0 = stackOut_3_0;
                    if (var5 != 0) {
                      break L2;
                    } else {
                      L4: {
                        L5: {
                          if (stackIn_4_0 > -4) {
                            break L5;
                          } else {
                            L6: {
                              if (var1_int >= 6) {
                                break L6;
                              } else {
                                sf.a(10, 35, 42, eb.field_s[var1_int], 0, param0 ^ 81);
                                if (var5 == 0) {
                                  break L4;
                                } else {
                                  break L6;
                                }
                              }
                            }
                            sf.a(10, 27, 34, eb.field_s[var1_int], 0, -68);
                            if (var5 == 0) {
                              break L4;
                            } else {
                              break L5;
                            }
                          }
                        }
                        sf.a(10, 43, 50, eb.field_s[var1_int], 0, 122);
                        break L4;
                      }
                      var1_int++;
                      if (var5 == 0) {
                        continue L1;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
                stackOut_19_0 = aj.field_r[0].field_B;
                stackIn_20_0 = stackOut_19_0;
                break L2;
              }
              var1_int = stackIn_20_0;
              aj.field_r[1] = new wk(var1_int, var1_int);
              aj.field_r[2] = new wk(var1_int, var1_int);
              var2 = aj.field_r[0].field_E;
              var3_int = 0;
              L7: while (true) {
                L8: {
                  L9: {
                    if (var2.length <= var3_int) {
                      break L9;
                    } else {
                      if (var5 != 0) {
                        break L8;
                      } else {
                        L10: {
                          if (var2[var3_int] != 16711680) {
                            break L10;
                          } else {
                            aj.field_r[1].field_E[var3_int] = 45056;
                            aj.field_r[2].field_E[var3_int] = 8388608;
                            var2[var3_int] = 33023;
                            break L10;
                          }
                        }
                        var3_int++;
                        if (var5 == 0) {
                          continue L7;
                        } else {
                          break L9;
                        }
                      }
                    }
                  }
                  rh.field_v[21] = aj.field_r[0].g();
                  rh.field_v[22] = aj.field_r[1].g();
                  rh.field_v[23] = aj.field_r[2].g();
                  rh.field_v[24] = aj.field_r[2].g();
                  break L8;
                }
                var3 = b.field_q[0];
                b.field_q[0] = aj.field_r[0].g();
                b.field_q[0].d();
                var3.a(0, 0);
                var4 = 0;
                L11: while (true) {
                  L12: {
                    L13: {
                      if (~var4 <= ~var3.field_E.length) {
                        break L13;
                      } else {
                        stackOut_32_0 = 65280 & var3.field_E[var4];
                        stackIn_46_0 = stackOut_32_0;
                        stackIn_33_0 = stackOut_32_0;
                        if (var5 != 0) {
                          break L12;
                        } else {
                          L14: {
                            L15: {
                              if (stackIn_33_0 != 0) {
                                break L15;
                              } else {
                                if ((255 & var3.field_E[var4]) == 0) {
                                  break L14;
                                } else {
                                  var3.field_E[var4] = 32768;
                                  if (var5 == 0) {
                                    break L14;
                                  } else {
                                    break L15;
                                  }
                                }
                              }
                            }
                            var3.field_E[var4] = 8454016;
                            break L14;
                          }
                          var4++;
                          if (var5 == 0) {
                            continue L11;
                          } else {
                            break L13;
                          }
                        }
                      }
                    }
                    b.field_q[1] = aj.field_r[1].g();
                    b.field_q[1].d();
                    var3.a(0, 0);
                    stackOut_45_0 = 0;
                    stackIn_46_0 = stackOut_45_0;
                    break L12;
                  }
                  var4 = stackIn_46_0;
                  L16: while (true) {
                    L17: {
                      L18: {
                        L19: {
                          L20: {
                            if (~var4 <= ~var3.field_E.length) {
                              break L20;
                            } else {
                              stackOut_48_0 = ~var3.field_E[var4];
                              stackOut_48_1 = -8454017;
                              stackIn_63_0 = stackOut_48_0;
                              stackIn_63_1 = stackOut_48_1;
                              stackIn_49_0 = stackOut_48_0;
                              stackIn_49_1 = stackOut_48_1;
                              if (var5 != 0) {
                                L21: while (true) {
                                  if (stackIn_63_0 >= stackIn_63_1) {
                                    break L18;
                                  } else {
                                    rh.field_v[21 + var4].d();
                                    b.field_q[var4].a(0, 0);
                                    var4++;
                                    if (var5 != 0) {
                                      break L17;
                                    } else {
                                      if (var5 == 0) {
                                        stackOut_62_0 = var4;
                                        stackOut_62_1 = 3;
                                        stackIn_63_0 = stackOut_62_0;
                                        stackIn_63_1 = stackOut_62_1;
                                        continue L21;
                                      } else {
                                        break L19;
                                      }
                                    }
                                  }
                                }
                              } else {
                                L22: {
                                  L23: {
                                    if (stackIn_49_0 == stackIn_49_1) {
                                      break L23;
                                    } else {
                                      if (var3.field_E[var4] != 32768) {
                                        break L22;
                                      } else {
                                        var3.field_E[var4] = 8388608;
                                        if (var5 == 0) {
                                          break L22;
                                        } else {
                                          break L23;
                                        }
                                      }
                                    }
                                  }
                                  var3.field_E[var4] = 16711680;
                                  break L22;
                                }
                                var4++;
                                if (var5 == 0) {
                                  continue L16;
                                } else {
                                  break L20;
                                }
                              }
                            }
                          }
                          b.field_q[2] = aj.field_r[2].g();
                          b.field_q[2].d();
                          var3.a(0, param0);
                          var4 = 0;
                          L24: while (true) {
                            stackOut_62_0 = var4;
                            stackOut_62_1 = 3;
                            stackIn_63_0 = stackOut_62_0;
                            stackIn_63_1 = stackOut_62_1;
                            if (stackIn_63_0 >= stackIn_63_1) {
                              break L18;
                            } else {
                              rh.field_v[21 + var4].d();
                              b.field_q[var4].a(0, 0);
                              var4++;
                              if (var5 != 0) {
                                break L17;
                              } else {
                                if (var5 == 0) {
                                  continue L24;
                                } else {
                                  break L19;
                                }
                              }
                            }
                          }
                        }
                        break L18;
                      }
                      rh.field_v[24].d();
                      si.field_E[1].c(0, 0, 4 * var1_int, var1_int * 4);
                      sb.field_bb.b((byte) 122);
                      ff.field_rb = new wk[20];
                      break L17;
                    }
                    var4 = 0;
                    L25: while (true) {
                      L26: {
                        L27: {
                          if (20 <= var4) {
                            break L27;
                          } else {
                            ff.field_rb[var4] = new wk(20, 20);
                            ff.field_rb[var4].d();
                            hb.field_j[var4].b(0, 0);
                            var4++;
                            if (var5 != 0) {
                              break L26;
                            } else {
                              if (var5 == 0) {
                                continue L25;
                              } else {
                                break L27;
                              }
                            }
                          }
                        }
                        sb.field_bb.b((byte) 125);
                        ve.a((byte) 122);
                        break L26;
                      }
                      break L0;
                    }
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw ci.a((Throwable) (Object) var1, "gf.A(" + param0 + ')');
        }
    }

    final static void c(int param0) {
        if (param0 > -86) {
            return;
        }
        try {
            nc.field_q = false;
        } catch (RuntimeException runtimeException) {
            throw ci.a((Throwable) (Object) runtimeException, "gf.D(" + param0 + ')');
        }
    }

    public static void b(int param0) {
        field_a = null;
        field_b = null;
        field_d = null;
        if (param0 > -77) {
            return;
        }
        try {
            field_c = null;
            field_e = null;
        } catch (RuntimeException runtimeException) {
            throw ci.a((Throwable) (Object) runtimeException, "gf.C(" + param0 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = new fm(4, 1, 1, 1);
        field_e = "Q";
    }
}
