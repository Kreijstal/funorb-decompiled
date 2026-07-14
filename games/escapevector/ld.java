/*
 * Decompiled by CFR-JS 0.4.0.
 */
class ld extends vj {
    private String field_e;
    private long field_f;
    static byte[][][] field_h;
    static String[] field_g;

    final void a(n param0, byte param1) {
        param0.a(((ld) this).field_f, (byte) -23);
        if (param1 > -15) {
            return;
        }
        param0.a(((ld) this).field_e, (byte) 111);
    }

    public static void b(byte param0) {
        if (param0 != -71) {
            Object var2 = null;
            ld.a(9, (ed[]) null, 60, -23, 39, -65);
        }
        field_h = null;
        field_g = null;
    }

    final static void a(int param0, ed[] param1, int param2, int param3, int param4, int param5) {
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
        var22 = EscapeVector.field_A;
        if (param1 != null) {
          L0: {
            if (0 >= param5) {
              break L0;
            } else {
              if (0 < param0) {
                L1: {
                  if (null != param1[3]) {
                    stackOut_7_0 = param1[3].field_A;
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
                  if (null == param1[5]) {
                    stackOut_10_0 = 0;
                    stackIn_11_0 = stackOut_10_0;
                    break L2;
                  } else {
                    stackOut_9_0 = param1[5].field_A;
                    stackIn_11_0 = stackOut_9_0;
                    break L2;
                  }
                }
                L3: {
                  var7 = stackIn_11_0;
                  if (param1[1] != null) {
                    stackOut_13_0 = param1[1].field_z;
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
                  if (param1[7] == null) {
                    stackOut_16_0 = 0;
                    stackIn_17_0 = stackOut_16_0;
                    break L4;
                  } else {
                    stackOut_15_0 = param1[7].field_z;
                    stackIn_17_0 = stackOut_15_0;
                    break L4;
                  }
                }
                L5: {
                  var9 = stackIn_17_0;
                  var10 = param5 + param4;
                  var11 = param0 + param3;
                  var12 = var6 + param4;
                  var13 = var10 + -var7;
                  var14 = var8 + param3;
                  var15 = var11 - var9;
                  var16 = var12;
                  var17 = var13;
                  if (var16 <= var17) {
                    break L5;
                  } else {
                    var17 = param5 * var6 / (var6 - -var7) + param4;
                    var16 = param5 * var6 / (var6 - -var7) + param4;
                    break L5;
                  }
                }
                L6: {
                  var18 = var14;
                  var19 = var15;
                  if (var19 < var18) {
                    var19 = param0 * var8 / (var9 + var8) + param3;
                    var18 = param0 * var8 / (var9 + var8) + param3;
                    break L6;
                  } else {
                    break L6;
                  }
                }
                L7: {
                  em.a(kf.field_o);
                  if (null == param1[0]) {
                    break L7;
                  } else {
                    em.h(param4, param3, var16, var18);
                    param1[0].e(param4, param3);
                    em.b(kf.field_o);
                    break L7;
                  }
                }
                L8: {
                  if (param1[2] == null) {
                    break L8;
                  } else {
                    em.h(var17, param3, var10, var18);
                    param1[2].e(var13, param3);
                    em.b(kf.field_o);
                    break L8;
                  }
                }
                L9: {
                  if (param1[6] != null) {
                    em.h(param4, var19, var16, var11);
                    param1[6].e(param4, var15);
                    em.b(kf.field_o);
                    break L9;
                  } else {
                    break L9;
                  }
                }
                L10: {
                  if (null == param1[8]) {
                    break L10;
                  } else {
                    em.h(var17, var19, var10, var11);
                    param1[8].e(var13, var15);
                    em.b(kf.field_o);
                    break L10;
                  }
                }
                L11: {
                  if (null == param1[1]) {
                    break L11;
                  } else {
                    if (0 == param1[1].field_A) {
                      break L11;
                    } else {
                      em.h(var16, param3, var17, var18);
                      var20 = var12;
                      L12: while (true) {
                        L13: {
                          if (var20 >= var13) {
                            break L13;
                          } else {
                            param1[1].e(var20, param3);
                            var20 = var20 + param1[1].field_A;
                            if (0 == 0) {
                              continue L12;
                            } else {
                              break L13;
                            }
                          }
                        }
                        em.b(kf.field_o);
                        break L11;
                      }
                    }
                  }
                }
                L14: {
                  if (null == param1[7]) {
                    break L14;
                  } else {
                    if (-1 == (param1[7].field_A ^ -1)) {
                      break L14;
                    } else {
                      em.h(var16, var19, var17, var11);
                      var20 = var12;
                      L15: while (true) {
                        L16: {
                          if (var20 >= var13) {
                            break L16;
                          } else {
                            param1[7].e(var20, var15);
                            var20 = var20 + param1[7].field_A;
                            if (0 == 0) {
                              continue L15;
                            } else {
                              break L16;
                            }
                          }
                        }
                        em.b(kf.field_o);
                        break L14;
                      }
                    }
                  }
                }
                L17: {
                  if (null == param1[3]) {
                    break L17;
                  } else {
                    if (-1 == (param1[3].field_z ^ -1)) {
                      break L17;
                    } else {
                      em.h(param4, var18, var16, var19);
                      var20 = var14;
                      L18: while (true) {
                        L19: {
                          if (var20 >= var15) {
                            break L19;
                          } else {
                            param1[3].e(param4, var20);
                            var20 = var20 + param1[3].field_z;
                            if (0 == 0) {
                              continue L18;
                            } else {
                              break L19;
                            }
                          }
                        }
                        em.b(kf.field_o);
                        break L17;
                      }
                    }
                  }
                }
                L20: {
                  if (param1[5] == null) {
                    break L20;
                  } else {
                    if (param1[5].field_z != 0) {
                      em.h(var17, var18, var10, var19);
                      var20 = var14;
                      L21: while (true) {
                        L22: {
                          if (var20 >= var15) {
                            break L22;
                          } else {
                            param1[5].e(var13, var20);
                            var20 = var20 + param1[5].field_z;
                            if (0 == 0) {
                              continue L21;
                            } else {
                              break L22;
                            }
                          }
                        }
                        em.b(kf.field_o);
                        break L20;
                      }
                    } else {
                      break L20;
                    }
                  }
                }
                L23: {
                  if (param1[param2] == null) {
                    break L23;
                  } else {
                    if (0 == param1[4].field_A) {
                      break L23;
                    } else {
                      if (param1[4].field_z == 0) {
                        break L23;
                      } else {
                        em.h(var16, var18, var17, var19);
                        var20 = var14;
                        L24: while (true) {
                          L25: {
                            if (var15 <= var20) {
                              break L25;
                            } else {
                              var21 = var12;
                              L26: while (true) {
                                L27: {
                                  if (var21 >= var13) {
                                    break L27;
                                  } else {
                                    param1[4].e(var21, var20);
                                    var21 = var21 + param1[4].field_A;
                                    if (0 == 0) {
                                      continue L26;
                                    } else {
                                      break L27;
                                    }
                                  }
                                }
                                var20 = var20 + param1[4].field_z;
                                if (0 == 0) {
                                  continue L24;
                                } else {
                                  break L25;
                                }
                              }
                            }
                          }
                          em.b(kf.field_o);
                          break L23;
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

    final static void a(int param0, byte param1) {
        if (param1 != -6) {
            ld.a(-16, (byte) 28);
        }
    }

    final static hj c(byte param0) {
        if (param0 <= 104) {
            Object var2 = null;
            ld.a(-62, (ed[]) null, -58, -40, -5, -81);
        }
        return aj.field_f;
    }

    ld(long param0, String param1) {
        ((ld) this).field_f = param0;
        ((ld) this).field_e = param1;
    }

    fk a(byte param0) {
        if (param0 != 32) {
            return null;
        }
        return ja.field_a;
    }

    final static int a(ik param0, int param1, int param2, ij param3) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        L0: {
          var8 = EscapeVector.field_A;
          if (param3 == null) {
            break L0;
          } else {
            if (param3.field_o == null) {
              break L0;
            } else {
              if (param0 == null) {
                break L0;
              } else {
                if (param3.field_n != param0.field_j) {
                  break L0;
                } else {
                  var4 = param0.field_q.length;
                  var5 = param3.field_o[param1].length / var4;
                  var6 = param2;
                  L1: while (true) {
                    if (var6 >= var5) {
                      return -1;
                    } else {
                      if ((param3.field_k[param1][var6] ^ -1L) == (param0.field_l ^ -1L)) {
                        if (ic.a(param3.field_m[param1][var6], (byte) 120)) {
                          var7 = 0;
                          L2: while (true) {
                            if (var7 >= var4) {
                              return var6;
                            } else {
                              if (param0.field_q[var7] == param3.field_o[param1][var7 + var4 * var6]) {
                                var6 = var6;
                                var7++;
                                continue L2;
                              } else {
                                var6++;
                                continue L1;
                              }
                            }
                          }
                        } else {
                          var6++;
                          continue L1;
                        }
                      } else {
                        var6++;
                        continue L1;
                      }
                    }
                  }
                }
              }
            }
          }
        }
        return -1;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_g = new String[]{"[BACKSPACE]", "[HOME]", "[F9]", "[F10]", "[F11]", "[ESC]"};
    }
}
