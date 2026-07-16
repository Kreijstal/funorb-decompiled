/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ve {
    static String field_b;
    static int field_a;
    static String field_c;
    private boolean field_e;
    private String field_d;

    final static void a(int param0, int param1, tg[] param2, byte param3, int param4, int param5) {
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
        var22 = Bounce.field_N;
        if (param2 != null) {
          L0: {
            if (-1 <= (param4 ^ -1)) {
              break L0;
            } else {
              if (param0 <= 0) {
                break L0;
              } else {
                L1: {
                  if (null == param2[3]) {
                    stackOut_8_0 = 0;
                    stackIn_9_0 = stackOut_8_0;
                    break L1;
                  } else {
                    stackOut_7_0 = param2[3].field_t;
                    stackIn_9_0 = stackOut_7_0;
                    break L1;
                  }
                }
                L2: {
                  var6 = stackIn_9_0;
                  if (null != param2[5]) {
                    stackOut_11_0 = param2[5].field_t;
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
                  if (param2[1] == null) {
                    stackOut_14_0 = 0;
                    stackIn_15_0 = stackOut_14_0;
                    break L3;
                  } else {
                    stackOut_13_0 = param2[1].field_o;
                    stackIn_15_0 = stackOut_13_0;
                    break L3;
                  }
                }
                L4: {
                  var8 = stackIn_15_0;
                  if (param2[7] != null) {
                    stackOut_17_0 = param2[7].field_o;
                    stackIn_18_0 = stackOut_17_0;
                    break L4;
                  } else {
                    stackOut_16_0 = 0;
                    stackIn_18_0 = stackOut_16_0;
                    break L4;
                  }
                }
                var9 = stackIn_18_0;
                if (param3 < -67) {
                  L5: {
                    var10 = param4 + param5;
                    var11 = param1 - -param0;
                    var12 = var6 + param5;
                    var13 = var10 + -var7;
                    var14 = param1 - -var8;
                    var15 = -var9 + var11;
                    var16 = var12;
                    var17 = var13;
                    if (var17 >= var16) {
                      break L5;
                    } else {
                      var17 = param4 * var6 / (var6 + var7) + param5;
                      var16 = param4 * var6 / (var6 + var7) + param5;
                      break L5;
                    }
                  }
                  L6: {
                    var18 = var14;
                    var19 = var15;
                    if (var18 <= var19) {
                      break L6;
                    } else {
                      var19 = param1 - -(var8 * param0 / (var8 - -var9));
                      var18 = param1 - -(var8 * param0 / (var8 - -var9));
                      break L6;
                    }
                  }
                  L7: {
                    na.b(mg.field_j);
                    if (param2[0] == null) {
                      break L7;
                    } else {
                      na.c(param5, param1, var16, var18);
                      param2[0].a(param5, param1);
                      na.a(mg.field_j);
                      break L7;
                    }
                  }
                  L8: {
                    if (null == param2[2]) {
                      break L8;
                    } else {
                      na.c(var17, param1, var10, var18);
                      param2[2].a(var13, param1);
                      na.a(mg.field_j);
                      break L8;
                    }
                  }
                  L9: {
                    if (param2[6] != null) {
                      na.c(param5, var19, var16, var11);
                      param2[6].a(param5, var15);
                      na.a(mg.field_j);
                      break L9;
                    } else {
                      break L9;
                    }
                  }
                  L10: {
                    if (null == param2[8]) {
                      break L10;
                    } else {
                      na.c(var17, var19, var10, var11);
                      param2[8].a(var13, var15);
                      na.a(mg.field_j);
                      break L10;
                    }
                  }
                  L11: {
                    if (param2[1] == null) {
                      break L11;
                    } else {
                      if (0 != param2[1].field_t) {
                        na.c(var16, param1, var17, var18);
                        var20 = var12;
                        L12: while (true) {
                          L13: {
                            if (var20 >= var13) {
                              break L13;
                            } else {
                              param2[1].a(var20, param1);
                              var20 = var20 + param2[1].field_t;
                              if (0 == 0) {
                                continue L12;
                              } else {
                                break L13;
                              }
                            }
                          }
                          na.a(mg.field_j);
                          break L11;
                        }
                      } else {
                        break L11;
                      }
                    }
                  }
                  L14: {
                    if (param2[7] == null) {
                      break L14;
                    } else {
                      if (param2[7].field_t == 0) {
                        break L14;
                      } else {
                        na.c(var16, var19, var17, var11);
                        var20 = var12;
                        L15: while (true) {
                          L16: {
                            if (var13 <= var20) {
                              break L16;
                            } else {
                              param2[7].a(var20, var15);
                              var20 = var20 + param2[7].field_t;
                              if (0 == 0) {
                                continue L15;
                              } else {
                                break L16;
                              }
                            }
                          }
                          na.a(mg.field_j);
                          break L14;
                        }
                      }
                    }
                  }
                  L17: {
                    if (null == param2[3]) {
                      break L17;
                    } else {
                      if (param2[3].field_o == 0) {
                        break L17;
                      } else {
                        na.c(param5, var18, var16, var19);
                        var20 = var14;
                        L18: while (true) {
                          L19: {
                            if (var20 >= var15) {
                              break L19;
                            } else {
                              param2[3].a(param5, var20);
                              var20 = var20 + param2[3].field_o;
                              if (0 == 0) {
                                continue L18;
                              } else {
                                break L19;
                              }
                            }
                          }
                          na.a(mg.field_j);
                          break L17;
                        }
                      }
                    }
                  }
                  L20: {
                    if (param2[5] == null) {
                      break L20;
                    } else {
                      if (param2[5].field_o != 0) {
                        na.c(var17, var18, var10, var19);
                        var20 = var14;
                        L21: while (true) {
                          L22: {
                            if (var20 >= var15) {
                              break L22;
                            } else {
                              param2[5].a(var13, var20);
                              var20 = var20 + param2[5].field_o;
                              if (0 == 0) {
                                continue L21;
                              } else {
                                break L22;
                              }
                            }
                          }
                          na.a(mg.field_j);
                          break L20;
                        }
                      } else {
                        break L20;
                      }
                    }
                  }
                  L23: {
                    if (null == param2[4]) {
                      break L23;
                    } else {
                      if (-1 == (param2[4].field_t ^ -1)) {
                        break L23;
                      } else {
                        if (param2[4].field_o == 0) {
                          break L23;
                        } else {
                          na.c(var16, var18, var17, var19);
                          var20 = var14;
                          L24: while (true) {
                            L25: {
                              if (var15 <= var20) {
                                break L25;
                              } else {
                                var21 = var12;
                                L26: while (true) {
                                  L27: {
                                    if (var13 <= var21) {
                                      break L27;
                                    } else {
                                      param2[4].a(var21, var20);
                                      var21 = var21 + param2[4].field_t;
                                      if (0 == 0) {
                                        continue L26;
                                      } else {
                                        break L27;
                                      }
                                    }
                                  }
                                  var20 = var20 + param2[4].field_o;
                                  if (0 == 0) {
                                    continue L24;
                                  } else {
                                    break L25;
                                  }
                                }
                              }
                            }
                            na.a(mg.field_j);
                            break L23;
                          }
                        }
                      }
                    }
                  }
                  return;
                } else {
                  return;
                }
              }
            }
          }
          return;
        } else {
          return;
        }
    }

    final boolean a(byte param0) {
        if (param0 != 56) {
            field_b = null;
        }
        return ((ve) this).field_e;
    }

    public static void d(byte param0) {
        field_b = null;
        if (param0 != 85) {
            return;
        }
        field_c = null;
    }

    final static void b(byte param0) {
        Object var1 = null;
        Throwable var2 = null;
        Throwable decompiledCaughtException = null;
        var1 = (Object) (Object) nj.field_o;
        synchronized (var1) {
          L0: {
            L1: {
              n.field_m = c.field_c;
              wh.field_d = wh.field_d + 1;
              uc.field_C = th.field_a;
              ll.field_y = q.field_H;
              mi.field_j = cl.field_o;
              cl.field_o = false;
              vh.field_e = ta.field_a;
              og.field_a = hb.field_B;
              rk.field_a = nc.field_b;
              if (param0 == -91) {
                break L1;
              } else {
                ve.a(108);
                break L1;
              }
            }
            ta.field_a = 0;
            break L0;
          }
        }
    }

    final static void a(int param0) {
        n var1 = null;
        var1 = (n) (Object) qb.field_g.e((byte) 60);
        if (var1 == null) {
          throw new IllegalStateException();
        } else {
          L0: {
            na.a(var1.field_g, var1.field_k, var1.field_h);
            na.e(var1.field_l, var1.field_j, var1.field_i, var1.field_n);
            if (param0 <= -118) {
              break L0;
            } else {
              ve.b((byte) -90);
              break L0;
            }
          }
          var1.field_g = null;
          k.field_B.a(1, (ai) (Object) var1);
          return;
        }
    }

    final String c(byte param0) {
        if (param0 >= -49) {
            return null;
        }
        return ((ve) this).field_d;
    }

    ve(String param0) {
        this(param0, false);
    }

    ve(String param0, boolean param1) {
        ((ve) this).field_d = param0;
        if (((ve) this).field_d == null) {
            ((ve) this).field_d = "";
        }
        ((ve) this).field_e = param1 ? true : false;
        if (((ve) this).field_d.length() == 0) {
            ((ve) this).field_e = false;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = "Passwords must be between 5 and 20 characters long";
        field_c = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!#$%&'*+-/=?^_{}~";
    }
}
