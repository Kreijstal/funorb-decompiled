/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rh {
    static bp field_c;
    static String field_a;
    static int field_d;
    static rc field_b;

    final static void a(int param0, int param1, byte param2, int param3, int param4, t[] param5) {
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
        Object var23 = null;
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
        var22 = Torquing.field_u;
        if (param5 != null) {
          L0: {
            if (-1 <= (param4 ^ -1)) {
              break L0;
            } else {
              if ((param1 ^ -1) < -1) {
                L1: {
                  if (null == param5[3]) {
                    stackOut_7_0 = 0;
                    stackIn_8_0 = stackOut_7_0;
                    break L1;
                  } else {
                    stackOut_6_0 = param5[3].field_w;
                    stackIn_8_0 = stackOut_6_0;
                    break L1;
                  }
                }
                L2: {
                  var6 = stackIn_8_0;
                  if (param5[5] == null) {
                    stackOut_10_0 = 0;
                    stackIn_11_0 = stackOut_10_0;
                    break L2;
                  } else {
                    stackOut_9_0 = param5[5].field_w;
                    stackIn_11_0 = stackOut_9_0;
                    break L2;
                  }
                }
                L3: {
                  var7 = stackIn_11_0;
                  if (null == param5[1]) {
                    stackOut_13_0 = 0;
                    stackIn_14_0 = stackOut_13_0;
                    break L3;
                  } else {
                    stackOut_12_0 = param5[1].field_u;
                    stackIn_14_0 = stackOut_12_0;
                    break L3;
                  }
                }
                L4: {
                  var8 = stackIn_14_0;
                  if (null == param5[7]) {
                    stackOut_16_0 = 0;
                    stackIn_17_0 = stackOut_16_0;
                    break L4;
                  } else {
                    stackOut_15_0 = param5[7].field_u;
                    stackIn_17_0 = stackOut_15_0;
                    break L4;
                  }
                }
                L5: {
                  var9 = stackIn_17_0;
                  var10 = param0 - -param4;
                  var11 = param1 + param3;
                  var12 = param0 - -var6;
                  var13 = -var7 + var10;
                  var14 = var8 + param3;
                  var15 = var11 - var9;
                  if (param2 == 71) {
                    break L5;
                  } else {
                    var23 = null;
                    boolean discarded$1 = rh.a(true, (String) null, (String) null);
                    break L5;
                  }
                }
                L6: {
                  var16 = var12;
                  var17 = var13;
                  if (var17 >= var16) {
                    break L6;
                  } else {
                    var17 = var6 * param4 / (var7 + var6) + param0;
                    var16 = var6 * param4 / (var7 + var6) + param0;
                    break L6;
                  }
                }
                L7: {
                  var18 = var14;
                  var19 = var15;
                  if (var19 >= var18) {
                    break L7;
                  } else {
                    var19 = param3 - -(param1 * var8 / (var9 + var8));
                    var18 = param3 - -(param1 * var8 / (var9 + var8));
                    break L7;
                  }
                }
                L8: {
                  ph.b(al.field_d);
                  if (null == param5[0]) {
                    break L8;
                  } else {
                    ph.f(param0, param3, var16, var18);
                    param5[0].d(param0, param3);
                    ph.a(al.field_d);
                    break L8;
                  }
                }
                L9: {
                  if (null != param5[2]) {
                    ph.f(var17, param3, var10, var18);
                    param5[2].d(var13, param3);
                    ph.a(al.field_d);
                    break L9;
                  } else {
                    break L9;
                  }
                }
                L10: {
                  if (param5[6] == null) {
                    break L10;
                  } else {
                    ph.f(param0, var19, var16, var11);
                    param5[6].d(param0, var15);
                    ph.a(al.field_d);
                    break L10;
                  }
                }
                L11: {
                  if (null != param5[8]) {
                    ph.f(var17, var19, var10, var11);
                    param5[8].d(var13, var15);
                    ph.a(al.field_d);
                    break L11;
                  } else {
                    break L11;
                  }
                }
                L12: {
                  if (null == param5[1]) {
                    break L12;
                  } else {
                    if (0 != param5[1].field_w) {
                      ph.f(var16, param3, var17, var18);
                      var20 = var12;
                      L13: while (true) {
                        L14: {
                          if (var20 >= var13) {
                            break L14;
                          } else {
                            param5[1].d(var20, param3);
                            var20 = var20 + param5[1].field_w;
                            if (0 == 0) {
                              continue L13;
                            } else {
                              break L14;
                            }
                          }
                        }
                        ph.a(al.field_d);
                        break L12;
                      }
                    } else {
                      break L12;
                    }
                  }
                }
                L15: {
                  if (null == param5[7]) {
                    break L15;
                  } else {
                    if (-1 != (param5[7].field_w ^ -1)) {
                      ph.f(var16, var19, var17, var11);
                      var20 = var12;
                      L16: while (true) {
                        L17: {
                          if (var13 <= var20) {
                            break L17;
                          } else {
                            param5[7].d(var20, var15);
                            var20 = var20 + param5[7].field_w;
                            if (0 == 0) {
                              continue L16;
                            } else {
                              break L17;
                            }
                          }
                        }
                        ph.a(al.field_d);
                        break L15;
                      }
                    } else {
                      break L15;
                    }
                  }
                }
                L18: {
                  if (param5[3] == null) {
                    break L18;
                  } else {
                    if (-1 != (param5[3].field_u ^ -1)) {
                      ph.f(param0, var18, var16, var19);
                      var20 = var14;
                      L19: while (true) {
                        L20: {
                          if (var20 >= var15) {
                            break L20;
                          } else {
                            param5[3].d(param0, var20);
                            var20 = var20 + param5[3].field_u;
                            if (0 == 0) {
                              continue L19;
                            } else {
                              break L20;
                            }
                          }
                        }
                        ph.a(al.field_d);
                        break L18;
                      }
                    } else {
                      break L18;
                    }
                  }
                }
                L21: {
                  if (param5[5] == null) {
                    break L21;
                  } else {
                    if (param5[5].field_u != 0) {
                      ph.f(var17, var18, var10, var19);
                      var20 = var14;
                      L22: while (true) {
                        L23: {
                          if (var20 >= var15) {
                            break L23;
                          } else {
                            param5[5].d(var13, var20);
                            var20 = var20 + param5[5].field_u;
                            if (0 == 0) {
                              continue L22;
                            } else {
                              break L23;
                            }
                          }
                        }
                        ph.a(al.field_d);
                        break L21;
                      }
                    } else {
                      break L21;
                    }
                  }
                }
                L24: {
                  if (param5[4] == null) {
                    break L24;
                  } else {
                    if (param5[4].field_w == 0) {
                      break L24;
                    } else {
                      if (param5[4].field_u != 0) {
                        ph.f(var16, var18, var17, var19);
                        var20 = var14;
                        L25: while (true) {
                          L26: {
                            if (var20 >= var15) {
                              break L26;
                            } else {
                              var21 = var12;
                              L27: while (true) {
                                L28: {
                                  if (var21 >= var13) {
                                    break L28;
                                  } else {
                                    param5[4].d(var21, var20);
                                    var21 = var21 + param5[4].field_w;
                                    if (0 == 0) {
                                      continue L27;
                                    } else {
                                      break L28;
                                    }
                                  }
                                }
                                var20 = var20 + param5[4].field_u;
                                if (0 == 0) {
                                  continue L25;
                                } else {
                                  break L26;
                                }
                              }
                            }
                          }
                          ph.a(al.field_d);
                          break L24;
                        }
                      } else {
                        break L24;
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

    final static uf[] a(byte param0, uf[] param1, t param2, String param3) {
        uf var7 = null;
        uf var9 = null;
        uf[] var6 = null;
        int var5 = -105 / ((52 - param0) / 57);
        uf var8 = param1[-1 + param1.length];
        if (!var8.a(param2, param3, 250)) {
            var7 = new uf(var8.field_b, var8.field_j, var8.field_m, var8.field_k, var8.field_e, var8.field_o, var8.field_d);
            var9 = var7;
            boolean discarded$0 = var9.a(param2, param3, 250);
            var6 = new uf[1 + param1.length];
            dk.a((Object[]) (Object) param1, 0, (Object[]) (Object) var6, 0, param1.length);
            var6[param1.length] = var7;
            param1 = var6;
        }
        return param1;
    }

    final static void a(byte param0, int param1, int param2, int param3, int param4) {
        if (param3 > param1) {
            di.a(param1, (byte) 26, param4, qd.field_a[param2], param3);
        } else {
            di.a(param3, (byte) 56, param4, qd.field_a[param2], param1);
        }
        if (param0 > -107) {
            Object var6 = null;
            rh.a(-75, 48, (byte) 27, -12, -103, (t[]) null);
        }
    }

    public static void a(byte param0) {
        field_b = null;
        if (param0 >= -27) {
            field_a = null;
        }
        field_a = null;
        field_c = null;
    }

    final static boolean a(boolean param0, String param1, String param2) {
        String var3 = null;
        int stackIn_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_5_0 = 0;
        L0: {
          param1 = kf.a(param1, '_', "", 111);
          if (param0) {
            break L0;
          } else {
            field_a = null;
            break L0;
          }
        }
        L1: {
          L2: {
            var3 = db.a(param2, 31108);
            if (-1 != param1.indexOf(param2)) {
              break L2;
            } else {
              if (param1.indexOf(var3) == -1) {
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

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = new bp();
        field_a = null;
    }
}
