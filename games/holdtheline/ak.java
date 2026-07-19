/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ak {
    static String[] field_d;
    static String field_a;
    static sa field_b;
    static int field_c;

    final static hj a(int param0, boolean param1, int param2) {
        int var3 = 0;
        int var4 = 0;
        hj stackIn_10_0 = null;
        hj stackIn_15_0 = null;
        hj stackIn_21_0 = null;
        hj stackIn_31_0 = null;
        hj stackOut_9_0 = null;
        hj stackOut_8_0 = null;
        hj stackOut_20_0 = null;
        hj stackOut_19_0 = null;
        hj stackOut_30_0 = null;
        hj stackOut_29_0 = null;
        hj stackOut_14_0 = null;
        hj stackOut_13_0 = null;
        L0: {
          var4 = HoldTheLine.field_D;
          if (param0 <= -24) {
            break L0;
          } else {
            ak.a(124);
            break L0;
          }
        }
        if ((param2 ^ -1) == 0) {
          L1: {
            if (null == vm.field_vb) {
              vm.field_vb = dl.a(wj.field_n, "basic", false, "unachieved");
              hi.field_N = new hj(32, 32);
              vb.a(-79, hi.field_N);
              vm.field_vb.c(0, 0, 32, 32);
              ug.b(-1);
              break L1;
            } else {
              break L1;
            }
          }
          L2: {
            if (!param1) {
              stackOut_9_0 = vm.field_vb;
              stackIn_10_0 = stackOut_9_0;
              break L2;
            } else {
              stackOut_8_0 = hi.field_N;
              stackIn_10_0 = stackOut_8_0;
              break L2;
            }
          }
          return stackIn_10_0;
        } else {
          if (null == cd.field_a) {
            if (!fb.field_i.b("achievements_128", 89)) {
              L3: {
                if (param1) {
                  stackOut_20_0 = hi.a(32, (byte) -106, 32);
                  stackIn_21_0 = stackOut_20_0;
                  break L3;
                } else {
                  stackOut_19_0 = ra.field_hb;
                  stackIn_21_0 = stackOut_19_0;
                  break L3;
                }
              }
              return stackIn_21_0;
            } else {
              cd.field_a = si.a(fb.field_i, 33, "achievements_128", "");
              nl.field_h = new hj[cd.field_a.length];
              ok.a(32381);
              var3 = 0;
              L4: while (true) {
                L5: {
                  L6: {
                    if (var3 >= cd.field_a.length) {
                      break L6;
                    } else {
                      nl.field_h[var3] = new hj(32, 32);
                      nl.field_h[var3].f();
                      cd.field_a[var3].c(0, 0, 32, 32);
                      var3++;
                      if (var4 != 0) {
                        break L5;
                      } else {
                        if (var4 == 0) {
                          continue L4;
                        } else {
                          break L6;
                        }
                      }
                    }
                  }
                  ug.b(-1);
                  break L5;
                }
                L7: {
                  if (param1) {
                    stackOut_30_0 = nl.field_h[param2];
                    stackIn_31_0 = stackOut_30_0;
                    break L7;
                  } else {
                    stackOut_29_0 = cd.field_a[param2];
                    stackIn_31_0 = stackOut_29_0;
                    break L7;
                  }
                }
                return stackIn_31_0;
              }
            }
          } else {
            L8: {
              if (param1) {
                stackOut_14_0 = nl.field_h[param2];
                stackIn_15_0 = stackOut_14_0;
                break L8;
              } else {
                stackOut_13_0 = cd.field_a[param2];
                stackIn_15_0 = stackOut_13_0;
                break L8;
              }
            }
            return stackIn_15_0;
          }
        }
    }

    public static void a(int param0) {
        field_a = null;
        field_b = null;
        if (param0 != 0) {
            return;
        }
        field_d = null;
    }

    final static hj[] a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8) {
        int var9 = 0;
        hj[] var10 = null;
        hj[] var11_ref_hj__ = null;
        int var11 = 0;
        int var12 = 0;
        hj var13 = null;
        int var14 = 0;
        int var15 = 0;
        int stackIn_3_0 = 0;
        int stackIn_11_0 = 0;
        int stackIn_14_0 = 0;
        int stackIn_22_0 = 0;
        int stackIn_24_0 = 0;
        int stackIn_24_1 = 0;
        int stackIn_26_0 = 0;
        int stackIn_31_0 = 0;
        int stackIn_34_0 = 0;
        int stackIn_42_0 = 0;
        int stackOut_2_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_21_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_23_0 = 0;
        int stackOut_23_1 = 0;
        int stackOut_30_0 = 0;
        int stackOut_25_0 = 0;
        int stackOut_27_0 = 0;
        int stackOut_27_1 = 0;
        int stackOut_41_0 = 0;
        int stackOut_33_0 = 0;
        var15 = HoldTheLine.field_D;
        var9 = param8 + (param5 + param2);
        var10 = new hj[]{new hj(var9, var9), new hj(param7, var9), new hj(var9, var9), new hj(var9, param7), new hj(64, 64), new hj(var9, param7), new hj(var9, var9), new hj(param7, var9), new hj(var9, var9)};
        var11_ref_hj__ = var10;
        var12 = 0;
        L0: while (true) {
          L1: {
            L2: {
              if (var12 >= var11_ref_hj__.length) {
                break L2;
              } else {
                var13 = var11_ref_hj__[var12];
                stackOut_2_0 = 0;
                stackIn_11_0 = stackOut_2_0;
                stackIn_3_0 = stackOut_2_0;
                if (var15 != 0) {
                  break L1;
                } else {
                  var14 = stackIn_3_0;
                  L3: while (true) {
                    L4: {
                      L5: {
                        if (var14 >= var13.field_z.length) {
                          break L5;
                        } else {
                          var13.field_z[var14] = param0;
                          var14++;
                          if (var15 != 0) {
                            break L4;
                          } else {
                            if (var15 == 0) {
                              continue L3;
                            } else {
                              break L5;
                            }
                          }
                        }
                      }
                      var12++;
                      break L4;
                    }
                    if (var15 == 0) {
                      continue L0;
                    } else {
                      break L2;
                    }
                  }
                }
              }
            }
            stackOut_10_0 = 0;
            stackIn_11_0 = stackOut_10_0;
            break L1;
          }
          var11 = stackIn_11_0;
          L6: while (true) {
            L7: {
              if (param5 <= var11) {
                stackOut_21_0 = 0;
                stackIn_22_0 = stackOut_21_0;
                break L7;
              } else {
                stackOut_13_0 = 0;
                stackIn_22_0 = stackOut_13_0;
                stackIn_14_0 = stackOut_13_0;
                if (var15 != 0) {
                  break L7;
                } else {
                  var12 = stackIn_14_0;
                  L8: while (true) {
                    L9: {
                      if (var9 <= var12) {
                        var11++;
                        break L9;
                      } else {
                        var10[6].field_z[var9 * (-var11 + var9 + -1) - -var12] = param1;
                        var10[8].field_z[var12 + var9 * (-1 + (-var11 + var9))] = param1;
                        var10[2].field_z[-var11 - (-var9 + (1 - var12 * var9))] = param1;
                        var10[8].field_z[var9 * var12 + (-1 + var9) + -var11] = param1;
                        var12++;
                        if (var15 != 0) {
                          break L9;
                        } else {
                          continue L8;
                        }
                      }
                    }
                    continue L6;
                  }
                }
              }
            }
            var11 = stackIn_22_0;
            L10: while (true) {
              stackOut_23_0 = param5;
              stackOut_23_1 = var11;
              stackIn_24_0 = stackOut_23_0;
              stackIn_24_1 = stackOut_23_1;
              L11: while (true) {
                L12: {
                  if (stackIn_24_0 <= stackIn_24_1) {
                    stackOut_30_0 = param6;
                    stackIn_31_0 = stackOut_30_0;
                    break L12;
                  } else {
                    stackOut_25_0 = 0;
                    stackIn_31_0 = stackOut_25_0;
                    stackIn_26_0 = stackOut_25_0;
                    if (var15 != 0) {
                      break L12;
                    } else {
                      var12 = stackIn_26_0;
                      if (var9 <= var12) {
                        var11++;
                        continue L10;
                      } else {
                        var10[0].field_z[var11 * var9 + var12] = param3;
                        var10[0].field_z[var11 + var9 * var12] = param3;
                        stackOut_27_0 = -var11 + var9;
                        stackOut_27_1 = var12;
                        stackIn_24_0 = stackOut_27_0;
                        stackIn_24_1 = stackOut_27_1;
                        continue L11;
                      }
                    }
                  }
                }
                var11 = stackIn_31_0;
                L13: while (true) {
                  L14: {
                    if (var11 >= param7) {
                      stackOut_41_0 = 0;
                      stackIn_42_0 = stackOut_41_0;
                      break L14;
                    } else {
                      stackOut_33_0 = 0;
                      stackIn_42_0 = stackOut_33_0;
                      stackIn_34_0 = stackOut_33_0;
                      if (var15 != 0) {
                        break L14;
                      } else {
                        var12 = stackIn_34_0;
                        L15: while (true) {
                          L16: {
                            if (param5 <= var12) {
                              var11++;
                              break L16;
                            } else {
                              var10[7].field_z[var11 + (var9 + (-var12 + -1)) * param7] = param1;
                              var10[5].field_z[var9 * var11 - (1 + -var9 - -var12)] = param1;
                              var10[1].field_z[var11 + var12 * param7] = param3;
                              var10[3].field_z[var12 + var11 * var9] = param3;
                              var12++;
                              if (var15 != 0) {
                                break L16;
                              } else {
                                continue L15;
                              }
                            }
                          }
                          continue L13;
                        }
                      }
                    }
                  }
                  var11 = stackIn_42_0;
                  L17: while (true) {
                    L18: {
                      if (var11 >= param7 >> -570040031) {
                        break L18;
                      } else {
                        var12 = 0;
                        L19: while (true) {
                          L20: {
                            if (var12 >= param8) {
                              var11++;
                              break L20;
                            } else {
                              var10[1].field_z[var11 + (var9 - (var12 + 1)) * param7] = param4;
                              var10[3].field_z[var11 * var9 + var9 - 1 + -var12] = param4;
                              var10[7].field_z[param7 * var12 - -var11] = param4;
                              var10[5].field_z[var12 + var11 * var9] = param4;
                              var12++;
                              if (var15 != 0) {
                                break L20;
                              } else {
                                continue L19;
                              }
                            }
                          }
                          if (var15 == 0) {
                            continue L17;
                          } else {
                            break L18;
                          }
                        }
                      }
                    }
                    return var10;
                  }
                }
              }
            }
          }
        }
    }

    static {
        field_d = new String[]{null, "to discard it and<nbsp>continue.", "to discard it and<nbsp>continue.", "to discard them and<nbsp>continue.", "to discard them and<nbsp>continue.", "to discard them and<nbsp>continue.", "to discard them and<nbsp>continue.", "to discard them and<nbsp>continue."};
        field_a = "This password contains repeated characters, and would be easy to guess";
        field_c = -1;
    }
}
