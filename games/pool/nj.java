/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nj {
    static int field_b;
    int field_a;
    static int field_c;
    static int field_d;

    final static void a(dd[] param0, byte param1, int param2, int param3, int param4, int param5) {
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
        int stackIn_9_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_15_0 = 0;
        int stackIn_18_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_17_0 = 0;
        int stackOut_16_0 = 0;
        if (param0 != null) {
          L0: {
            if (-1 <= (param2 ^ -1)) {
              break L0;
            } else {
              if (-1 <= (param5 ^ -1)) {
                break L0;
              } else {
                L1: {
                  if (null != param0[3]) {
                    stackOut_8_0 = param0[3].field_w;
                    stackIn_9_0 = stackOut_8_0;
                    break L1;
                  } else {
                    stackOut_7_0 = 0;
                    stackIn_9_0 = stackOut_7_0;
                    break L1;
                  }
                }
                L2: {
                  var6 = stackIn_9_0;
                  if (param0[5] != null) {
                    stackOut_11_0 = param0[5].field_w;
                    stackIn_12_0 = stackOut_11_0;
                    break L2;
                  } else {
                    stackOut_10_0 = 0;
                    stackIn_12_0 = stackOut_10_0;
                    break L2;
                  }
                }
                L3: {
                  var7 = stackIn_12_0;
                  if (null == param0[1]) {
                    stackOut_14_0 = 0;
                    stackIn_15_0 = stackOut_14_0;
                    break L3;
                  } else {
                    stackOut_13_0 = param0[1].field_y;
                    stackIn_15_0 = stackOut_13_0;
                    break L3;
                  }
                }
                L4: {
                  var8 = stackIn_15_0;
                  if (param0[7] == null) {
                    stackOut_17_0 = 0;
                    stackIn_18_0 = stackOut_17_0;
                    break L4;
                  } else {
                    stackOut_16_0 = param0[7].field_y;
                    stackIn_18_0 = stackOut_16_0;
                    break L4;
                  }
                }
                L5: {
                  var9 = stackIn_18_0;
                  var10 = param2 + param3;
                  var11 = param4 + param5;
                  var12 = param3 + var6;
                  var13 = var10 + -var7;
                  var14 = param4 - -var8;
                  var15 = -var9 + var11;
                  var16 = var12;
                  var17 = var13;
                  var19 = 52 % ((param1 - -35) / 37);
                  if ((var16 ^ -1) >= (var17 ^ -1)) {
                    break L5;
                  } else {
                    var17 = var6 * param2 / (var7 + var6) + param3;
                    var16 = var6 * param2 / (var7 + var6) + param3;
                    break L5;
                  }
                }
                L6: {
                  var18 = var14;
                  var20 = var15;
                  if (var20 < var18) {
                    var20 = param5 * var8 / (var8 - -var9) + param4;
                    var18 = param5 * var8 / (var8 - -var9) + param4;
                    break L6;
                  } else {
                    break L6;
                  }
                }
                L7: {
                  qh.a(mb.field_b);
                  if (null != param0[0]) {
                    qh.d(param3, param4, var16, var18);
                    param0[0].c(param3, param4);
                    qh.b(mb.field_b);
                    break L7;
                  } else {
                    break L7;
                  }
                }
                L8: {
                  if (param0[2] != null) {
                    qh.d(var17, param4, var10, var18);
                    param0[2].c(var13, param4);
                    qh.b(mb.field_b);
                    break L8;
                  } else {
                    break L8;
                  }
                }
                L9: {
                  if (param0[6] == null) {
                    break L9;
                  } else {
                    qh.d(param3, var20, var16, var11);
                    param0[6].c(param3, var15);
                    qh.b(mb.field_b);
                    break L9;
                  }
                }
                L10: {
                  if (null == param0[8]) {
                    break L10;
                  } else {
                    qh.d(var17, var20, var10, var11);
                    param0[8].c(var13, var15);
                    qh.b(mb.field_b);
                    break L10;
                  }
                }
                L11: {
                  if (null == param0[1]) {
                    break L11;
                  } else {
                    if (param0[1].field_w != 0) {
                      qh.d(var16, param4, var17, var18);
                      var21 = var12;
                      L12: while (true) {
                        if ((var21 ^ -1) <= (var13 ^ -1)) {
                          qh.b(mb.field_b);
                          break L11;
                        } else {
                          param0[1].c(var21, param4);
                          var21 = var21 + param0[1].field_w;
                          continue L12;
                        }
                      }
                    } else {
                      break L11;
                    }
                  }
                }
                L13: {
                  if (null == param0[7]) {
                    break L13;
                  } else {
                    if (-1 != (param0[7].field_w ^ -1)) {
                      qh.d(var16, var20, var17, var11);
                      var21 = var12;
                      L14: while (true) {
                        if ((var13 ^ -1) >= (var21 ^ -1)) {
                          qh.b(mb.field_b);
                          break L13;
                        } else {
                          param0[7].c(var21, var15);
                          var21 = var21 + param0[7].field_w;
                          continue L14;
                        }
                      }
                    } else {
                      break L13;
                    }
                  }
                }
                L15: {
                  if (null == param0[3]) {
                    break L15;
                  } else {
                    if (0 != param0[3].field_y) {
                      qh.d(param3, var18, var16, var20);
                      var21 = var14;
                      L16: while (true) {
                        if (var21 >= var15) {
                          qh.b(mb.field_b);
                          break L15;
                        } else {
                          param0[3].c(param3, var21);
                          var21 = var21 + param0[3].field_y;
                          continue L16;
                        }
                      }
                    } else {
                      break L15;
                    }
                  }
                }
                L17: {
                  if (null == param0[5]) {
                    break L17;
                  } else {
                    if ((param0[5].field_y ^ -1) != -1) {
                      qh.d(var17, var18, var10, var20);
                      var21 = var14;
                      L18: while (true) {
                        if (var21 >= var15) {
                          qh.b(mb.field_b);
                          break L17;
                        } else {
                          param0[5].c(var13, var21);
                          var21 = var21 + param0[5].field_y;
                          continue L18;
                        }
                      }
                    } else {
                      break L17;
                    }
                  }
                }
                L19: {
                  if (null == param0[4]) {
                    break L19;
                  } else {
                    if ((param0[4].field_w ^ -1) == -1) {
                      break L19;
                    } else {
                      if (-1 == (param0[4].field_y ^ -1)) {
                        break L19;
                      } else {
                        qh.d(var16, var18, var17, var20);
                        var21 = var14;
                        L20: while (true) {
                          if (var21 >= var15) {
                            qh.b(mb.field_b);
                            break L19;
                          } else {
                            var22 = var12;
                            L21: while (true) {
                              if (var22 >= var13) {
                                var21 = var21 + param0[4].field_y;
                                continue L20;
                              } else {
                                param0[4].c(var22, var21);
                                var22 = var22 + param0[4].field_w;
                                continue L21;
                              }
                            }
                          }
                        }
                      }
                    }
                  }
                }
                return;
              }
            }
          }
          return;
        } else {
          return;
        }
    }

    final static void a(int param0, int param1, int param2) {
        int var3 = 93 / ((-77 - param2) / 47);
        nn.field_c = param1;
        cd.field_e = param0;
    }

    final static boolean a(int param0, int param1, byte[] param2, int[][] param3) {
        int var4 = 0;
        int[] var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        if (param1 > 122) {
          if (param3 != null) {
            var4 = 0;
            L0: while (true) {
              if (param3.length > var4) {
                var5 = param3[var4];
                var6 = 0;
                L1: while (true) {
                  if (var5.length <= var6) {
                    return true;
                  } else {
                    var7 = var5[var6];
                    var8 = var5[var6 - -1];
                    if (var7 != -1) {
                      if (var8 != (255 & param2[var7])) {
                        var4++;
                        continue L0;
                      } else {
                        var6 += 2;
                        continue L1;
                      }
                    } else {
                      if (var8 == param0) {
                        var6 += 2;
                        continue L1;
                      } else {
                        var4++;
                        continue L0;
                      }
                    }
                  }
                }
              } else {
                return false;
              }
            }
          } else {
            return false;
          }
        } else {
          return true;
        }
    }

    final static int b(int param0, int param1, int param2) {
        if (param2 == -21223) {
          if (param0 > -3) {
            if (-6 <= param1) {
              return 1;
            } else {
              return 0;
            }
          } else {
            return 2;
          }
        } else {
          return -99;
        }
    }

    final static java.awt.Frame a(int param0, sj param1, int param2, boolean param3, int param4, int param5) {
        dj[] var6 = null;
        int var7_int = 0;
        java.awt.Frame var7 = null;
        int var8 = 0;
        int var9 = 0;
        Object var10 = null;
        dj[] var11 = null;
        le var12 = null;
        int stackIn_13_0 = 0;
        int stackIn_24_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_23_0 = 0;
        L0: {
          var9 = Pool.field_O;
          if (!param3) {
            break L0;
          } else {
            var10 = null;
            java.awt.Frame discarded$1 = nj.a(-1, (sj) null, -62, true, 71, -112);
            break L0;
          }
        }
        if (param1.a((byte) 126)) {
          L1: {
            L2: {
              if (param5 == 0) {
                break L2;
              } else {
                var12 = param1.a(param0, param2, param4, param5, (byte) 85);
                L3: while (true) {
                  if (var12.field_f != 0) {
                    break L1;
                  } else {
                    cf.a(-89, 10L);
                    if (var9 == 0) {
                      continue L3;
                    } else {
                      break L2;
                    }
                  }
                }
              }
            }
            var11 = s.a((byte) -112, param1);
            var6 = var11;
            if (var6 != null) {
              var7_int = 0;
              var8 = 0;
              L4: while (true) {
                L5: {
                  L6: {
                    if (var11.length <= var8) {
                      break L6;
                    } else {
                      stackOut_12_0 = var11[var8].field_f;
                      stackIn_24_0 = stackOut_12_0;
                      stackIn_13_0 = stackOut_12_0;
                      if (var9 != 0) {
                        break L5;
                      } else {
                        L7: {
                          if (stackIn_13_0 != param2) {
                            break L7;
                          } else {
                            if (var11[var8].field_i != param0) {
                              break L7;
                            } else {
                              L8: {
                                if (0 == param4) {
                                  break L8;
                                } else {
                                  if (var11[var8].field_k == param4) {
                                    break L8;
                                  } else {
                                    break L7;
                                  }
                                }
                              }
                              L9: {
                                if (var7_int == 0) {
                                  break L9;
                                } else {
                                  if (param5 >= var11[var8].field_d) {
                                    break L7;
                                  } else {
                                    break L9;
                                  }
                                }
                              }
                              param5 = var11[var8].field_d;
                              var7_int = 1;
                              break L7;
                            }
                          }
                        }
                        var8++;
                        if (var9 == 0) {
                          continue L4;
                        } else {
                          break L6;
                        }
                      }
                    }
                  }
                  stackOut_23_0 = var7_int;
                  stackIn_24_0 = stackOut_23_0;
                  break L5;
                }
                if (stackIn_24_0 != 0) {
                  var12 = param1.a(param0, param2, param4, param5, (byte) 85);
                  L10: while (true) {
                    if (var12.field_f != 0) {
                      break L1;
                    } else {
                      cf.a(-89, 10L);
                      if (var9 == 0) {
                        continue L10;
                      } else {
                        break L1;
                      }
                    }
                  }
                } else {
                  return null;
                }
              }
            } else {
              return null;
            }
          }
          var7 = (java.awt.Frame) var12.field_e;
          if (var7 != null) {
            if ((var12.field_f ^ -1) == -3) {
              og.a(var7, param1, 24442);
              return null;
            } else {
              return var7;
            }
          } else {
            return null;
          }
        } else {
          return null;
        }
    }

    final static int a(int param0) {
        if (param0 != -21055) {
            return -11;
        }
        return ti.field_e;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = 255;
    }
}
