/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qj {
    static String field_a;
    static db field_c;
    static int[] field_b;
    static String field_e;
    static String field_d;

    final static boolean c(int param0) {
        if (param0 <= 105) {
            return true;
        }
        return null != hd.field_u ? true : ac.field_e;
    }

    final static void b(byte param0) {
        try {
            if (null != sk.field_f) {
                try {
                    sk.field_f.a(0L, 0);
                    sk.field_f.a(param0 ^ -19814, kb.field_q.field_u, kb.field_q.field_t, 24);
                } catch (Exception exception) {
                }
            }
            kb.field_q.field_t = kb.field_q.field_t + 24;
            if (param0 != 115) {
                field_d = null;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static boolean a(int param0) {
        int stackIn_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_5_0 = 0;
        L0: {
          if (param0 == 4) {
            break L0;
          } else {
            field_d = null;
            break L0;
          }
        }
        L1: {
          L2: {
            if (cm.field_n) {
              break L2;
            } else {
              if (!ug.o(-69)) {
                stackOut_6_0 = 0;
                stackIn_7_0 = stackOut_6_0;
                break L1;
              } else {
                break L2;
              }
            }
          }
          stackOut_5_0 = 1;
          stackIn_7_0 = stackOut_5_0;
          break L1;
        }
        return stackIn_7_0 != 0;
    }

    final static oh[] a(int param0, int param1) {
        oh[] var2 = new oh[9];
        var2[4] = ce.a(param1, 64, oj.a(param0, param0));
        return var2;
    }

    final static hl b(int param0) {
        if (param0 != 0) {
            hl discarded$0 = qj.b(-109);
        }
        return ph.field_t.field_Pb;
    }

    final static void a(int param0, byte param1, oh[] param2, int param3, int param4, int param5) {
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
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
        int stackIn_8_0 = 0;
        int stackIn_11_0 = 0;
        int stackIn_14_0 = 0;
        int stackIn_17_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_16_0 = 0;
        int stackOut_15_0 = 0;
        var22 = TetraLink.field_J;
        if (param2 != null) {
          L0: {
            if (0 >= param0) {
              break L0;
            } else {
              if ((param4 ^ -1) < -1) {
                L1: {
                  if (null != param2[3]) {
                    stackOut_7_0 = param2[3].field_t;
                    stackIn_8_0 = stackOut_7_0;
                    break L1;
                  } else {
                    stackOut_6_0 = 0;
                    stackIn_8_0 = stackOut_6_0;
                    break L1;
                  }
                }
                L2: {
                  var6 = stackIn_8_0;
                  if (null == param2[5]) {
                    stackOut_10_0 = 0;
                    stackIn_11_0 = stackOut_10_0;
                    break L2;
                  } else {
                    stackOut_9_0 = param2[5].field_t;
                    stackIn_11_0 = stackOut_9_0;
                    break L2;
                  }
                }
                L3: {
                  var7 = stackIn_11_0;
                  if (null != param2[1]) {
                    stackOut_13_0 = param2[1].field_F;
                    stackIn_14_0 = stackOut_13_0;
                    break L3;
                  } else {
                    stackOut_12_0 = 0;
                    stackIn_14_0 = stackOut_12_0;
                    break L3;
                  }
                }
                L4: {
                  var8 = stackIn_14_0;
                  if (param2[7] != null) {
                    stackOut_16_0 = param2[7].field_F;
                    stackIn_17_0 = stackOut_16_0;
                    break L4;
                  } else {
                    stackOut_15_0 = 0;
                    stackIn_17_0 = stackOut_15_0;
                    break L4;
                  }
                }
                L5: {
                  var9 = stackIn_17_0;
                  var10 = param0 + param3;
                  var11 = param4 + param5;
                  var12 = param3 - -var6;
                  if (param1 == -36) {
                    break L5;
                  } else {
                    field_d = null;
                    break L5;
                  }
                }
                L6: {
                  var13 = -var7 + var10;
                  var14 = var8 + param5;
                  var15 = var11 - var9;
                  var16 = var12;
                  var17 = var13;
                  if (var17 >= var16) {
                    break L6;
                  } else {
                    var17 = param3 - -(param0 * var6 / (var6 - -var7));
                    var16 = param3 - -(param0 * var6 / (var6 - -var7));
                    break L6;
                  }
                }
                L7: {
                  var18 = var14;
                  var19 = var15;
                  ra.a(pg.field_i);
                  if (var18 > var19) {
                    var19 = param5 - -(var8 * param4 / (var9 + var8));
                    var18 = param5 - -(var8 * param4 / (var9 + var8));
                    break L7;
                  } else {
                    break L7;
                  }
                }
                L8: {
                  if (param2[0] == null) {
                    break L8;
                  } else {
                    ra.b(param3, param5, var16, var18);
                    param2[0].c(param3, param5);
                    ra.b(pg.field_i);
                    break L8;
                  }
                }
                L9: {
                  if (param2[2] == null) {
                    break L9;
                  } else {
                    ra.b(var17, param5, var10, var18);
                    param2[2].c(var13, param5);
                    ra.b(pg.field_i);
                    break L9;
                  }
                }
                L10: {
                  if (null != param2[6]) {
                    ra.b(param3, var19, var16, var11);
                    param2[6].c(param3, var15);
                    ra.b(pg.field_i);
                    break L10;
                  } else {
                    break L10;
                  }
                }
                L11: {
                  if (param2[8] != null) {
                    ra.b(var17, var19, var10, var11);
                    param2[8].c(var13, var15);
                    ra.b(pg.field_i);
                    break L11;
                  } else {
                    break L11;
                  }
                }
                L12: {
                  if (null == param2[1]) {
                    break L12;
                  } else {
                    if (0 != param2[1].field_t) {
                      ra.b(var16, param5, var17, var18);
                      var20 = var12;
                      L13: while (true) {
                        L14: {
                          if (var20 >= var13) {
                            break L14;
                          } else {
                            param2[1].c(var20, param5);
                            var20 = var20 + param2[1].field_t;
                            if (0 == 0) {
                              continue L13;
                            } else {
                              break L14;
                            }
                          }
                        }
                        ra.b(pg.field_i);
                        break L12;
                      }
                    } else {
                      break L12;
                    }
                  }
                }
                L15: {
                  if (null == param2[7]) {
                    break L15;
                  } else {
                    if (param2[7].field_t != 0) {
                      ra.b(var16, var19, var17, var11);
                      var20 = var12;
                      L16: while (true) {
                        L17: {
                          if (var20 >= var13) {
                            break L17;
                          } else {
                            param2[7].c(var20, var15);
                            var20 = var20 + param2[7].field_t;
                            if (0 == 0) {
                              continue L16;
                            } else {
                              break L17;
                            }
                          }
                        }
                        ra.b(pg.field_i);
                        break L15;
                      }
                    } else {
                      break L15;
                    }
                  }
                }
                L18: {
                  if (param2[3] == null) {
                    break L18;
                  } else {
                    if (-1 == (param2[3].field_F ^ -1)) {
                      break L18;
                    } else {
                      ra.b(param3, var18, var16, var19);
                      var20 = var14;
                      L19: while (true) {
                        L20: {
                          if (var15 <= var20) {
                            break L20;
                          } else {
                            param2[3].c(param3, var20);
                            var20 = var20 + param2[3].field_F;
                            if (0 == 0) {
                              continue L19;
                            } else {
                              break L20;
                            }
                          }
                        }
                        ra.b(pg.field_i);
                        break L18;
                      }
                    }
                  }
                }
                L21: {
                  if (param2[5] == null) {
                    break L21;
                  } else {
                    if (param2[5].field_F == 0) {
                      break L21;
                    } else {
                      ra.b(var17, var18, var10, var19);
                      var20 = var14;
                      L22: while (true) {
                        L23: {
                          if (var15 <= var20) {
                            break L23;
                          } else {
                            param2[5].c(var13, var20);
                            var20 = var20 + param2[5].field_F;
                            if (0 == 0) {
                              continue L22;
                            } else {
                              break L23;
                            }
                          }
                        }
                        ra.b(pg.field_i);
                        break L21;
                      }
                    }
                  }
                }
                L24: {
                  if (param2[4] == null) {
                    break L24;
                  } else {
                    if (0 == param2[4].field_t) {
                      break L24;
                    } else {
                      if (param2[4].field_F == 0) {
                        break L24;
                      } else {
                        ra.b(var16, var18, var17, var19);
                        var20 = var14;
                        L25: while (true) {
                          L26: {
                            if (var15 <= var20) {
                              break L26;
                            } else {
                              var21 = var12;
                              L27: while (true) {
                                L28: {
                                  if (var21 >= var13) {
                                    break L28;
                                  } else {
                                    param2[4].c(var21, var20);
                                    var21 = var21 + param2[4].field_t;
                                    if (0 == 0) {
                                      continue L27;
                                    } else {
                                      break L28;
                                    }
                                  }
                                }
                                var20 = var20 + param2[4].field_F;
                                if (0 == 0) {
                                  continue L25;
                                } else {
                                  break L26;
                                }
                              }
                            }
                          }
                          ra.b(pg.field_i);
                          break L24;
                        }
                      }
                    }
                  }
                }
                return;
              } else {
                break L0;
              }
            }
          }
          return;
        } else {
          return;
        }
    }

    public static void a(byte param0) {
        field_e = null;
        field_b = null;
        field_a = null;
        int var1 = -67 / ((0 - param0) / 49);
        field_d = null;
        field_c = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = new int[]{2, 14, 15, 6, 5, 16, 17, 10, 11, 12};
        field_c = new db(1, 2, 2, 0);
        field_e = "Your turn - playing <%0> (<%1>)";
        field_d = "Enter name of friend to add to list";
    }
}
