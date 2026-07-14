/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class s {
    static String field_g;
    static volatile int field_b;
    static ri field_c;
    static String field_a;
    static volatile int field_f;
    static ga field_e;
    static String field_d;
    static String field_h;

    public static void a(int param0) {
        field_e = null;
        field_a = null;
        field_d = null;
        field_c = null;
        if (param0 > -71) {
            return;
        }
        field_g = null;
        field_h = null;
    }

    final static md a(ga param0, byte param1) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        md var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        var9 = ZombieDawnMulti.field_E ? 1 : 0;
        var3 = 76 / ((param1 - -22) / 54);
        var2 = param0.h(8, 14862);
        if (-1 <= (var2 ^ -1)) {
          L0: {
            var4 = fq.a(-128, param0) ? 1 : 0;
            var5 = fq.a(-86, param0) ? 1 : 0;
            var6 = new md();
            var6.field_n = (short)param0.h(16, 14862);
            var6.field_k = lo.a(16, var6.field_k, param0, (byte) -104);
            var6.field_E = lo.a(16, var6.field_E, param0, (byte) -120);
            var6.field_v = lo.a(16, var6.field_v, param0, (byte) -122);
            var6.field_B = (short)param0.h(16, 14862);
            var6.field_y = lo.a(16, var6.field_y, param0, (byte) -128);
            var6.field_L = lo.a(16, var6.field_L, param0, (byte) -106);
            var6.field_H = lo.a(16, var6.field_H, param0, (byte) -119);
            if (var4 == 0) {
              break L0;
            } else {
              var6.field_o = (short)param0.h(16, 14862);
              var6.field_A = lo.a(16, var6.field_A, param0, (byte) -108);
              var6.field_p = lo.a(16, var6.field_p, param0, (byte) -103);
              var6.field_b = lo.a(16, var6.field_b, param0, (byte) -119);
              var6.field_F = lo.a(16, var6.field_F, param0, (byte) -114);
              var6.field_K = lo.a(16, var6.field_K, param0, (byte) -103);
              var6.field_x = lo.a(16, var6.field_x, param0, (byte) -127);
              break L0;
            }
          }
          L1: {
            if (var5 == 0) {
              break L1;
            } else {
              int discarded$2 = param0.h(16, 14862);
              var6.field_M = lo.a(16, var6.field_M, param0, (byte) -117);
              var6.field_s = lo.a(16, var6.field_s, param0, (byte) -126);
              var6.field_g = lo.a(16, var6.field_g, param0, (byte) -128);
              var6.field_a = lo.a(16, var6.field_a, param0, (byte) -120);
              var6.field_J = lo.a(16, var6.field_J, param0, (byte) -116);
              break L1;
            }
          }
          L2: {
            if (fq.a(-99, param0)) {
              var6.field_c = lo.a(16, var6.field_c, param0, (byte) -100);
              break L2;
            } else {
              break L2;
            }
          }
          L3: {
            if (!fq.a(-92, param0)) {
              break L3;
            } else {
              var6.field_z = dn.a(param0, var6.field_z, (byte) -102, 16);
              var7 = 0;
              var8 = 0;
              L4: while (true) {
                if (var8 >= var6.field_z.length) {
                  if (var7 == 0) {
                    var6.field_z = null;
                    break L3;
                  } else {
                    var6.field_m = (byte)(var7 + 1);
                    break L3;
                  }
                } else {
                  if ((var6.field_z[var8] & 255) > var7) {
                    var7 = 255 & var6.field_z[var8];
                    var8++;
                    continue L4;
                  } else {
                    var8++;
                    continue L4;
                  }
                }
              }
            }
          }
          return var6;
        } else {
          throw new IllegalStateException("" + var2);
        }
    }

    final static void a(int param0, int param1, ja[] param2, int param3, int param4, int param5) {
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
        var22 = ZombieDawnMulti.field_E ? 1 : 0;
        if (param2 != null) {
          L0: {
            if (param5 <= 0) {
              break L0;
            } else {
              if ((param4 ^ -1) < -1) {
                L1: {
                  if (null != param2[3]) {
                    stackOut_7_0 = param2[3].field_z;
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
                    stackOut_9_0 = param2[5].field_z;
                    stackIn_11_0 = stackOut_9_0;
                    break L2;
                  }
                }
                L3: {
                  var7 = stackIn_11_0;
                  if (null != param2[1]) {
                    stackOut_13_0 = param2[1].field_u;
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
                    stackOut_16_0 = param2[7].field_u;
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
                  var10 = param3 + param5;
                  var11 = param4 + param0;
                  var12 = param3 - -var6;
                  var13 = var10 + -var7;
                  var14 = var8 + param0;
                  var15 = -var9 + var11;
                  var16 = var12;
                  var17 = var13;
                  if (var16 <= var17) {
                    break L5;
                  } else {
                    var17 = param3 + param5 * var6 / (var7 + var6);
                    var16 = param3 + param5 * var6 / (var7 + var6);
                    break L5;
                  }
                }
                L6: {
                  var18 = var14;
                  var19 = var15;
                  oo.a(qa.field_f);
                  if (var18 <= var19) {
                    break L6;
                  } else {
                    var19 = param0 + param4 * var8 / (var8 + var9);
                    var18 = param0 + param4 * var8 / (var8 + var9);
                    break L6;
                  }
                }
                L7: {
                  if (null != param2[param1]) {
                    oo.e(param3, param0, var16, var18);
                    param2[0].g(param3, param0);
                    oo.b(qa.field_f);
                    break L7;
                  } else {
                    break L7;
                  }
                }
                L8: {
                  if (param2[2] == null) {
                    break L8;
                  } else {
                    oo.e(var17, param0, var10, var18);
                    param2[2].g(var13, param0);
                    oo.b(qa.field_f);
                    break L8;
                  }
                }
                L9: {
                  if (param2[6] != null) {
                    oo.e(param3, var19, var16, var11);
                    param2[6].g(param3, var15);
                    oo.b(qa.field_f);
                    break L9;
                  } else {
                    break L9;
                  }
                }
                L10: {
                  if (param2[8] != null) {
                    oo.e(var17, var19, var10, var11);
                    param2[8].g(var13, var15);
                    oo.b(qa.field_f);
                    break L10;
                  } else {
                    break L10;
                  }
                }
                L11: {
                  if (param2[1] == null) {
                    break L11;
                  } else {
                    if (param2[1].field_z != 0) {
                      oo.e(var16, param0, var17, var18);
                      var20 = var12;
                      L12: while (true) {
                        L13: {
                          if (var20 >= var13) {
                            break L13;
                          } else {
                            param2[1].g(var20, param0);
                            var20 = var20 + param2[1].field_z;
                            if (0 == 0) {
                              continue L12;
                            } else {
                              break L13;
                            }
                          }
                        }
                        oo.b(qa.field_f);
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
                    if (0 != param2[7].field_z) {
                      oo.e(var16, var19, var17, var11);
                      var20 = var12;
                      L15: while (true) {
                        L16: {
                          if (var20 >= var13) {
                            break L16;
                          } else {
                            param2[7].g(var20, var15);
                            var20 = var20 + param2[7].field_z;
                            if (0 == 0) {
                              continue L15;
                            } else {
                              break L16;
                            }
                          }
                        }
                        oo.b(qa.field_f);
                        break L14;
                      }
                    } else {
                      break L14;
                    }
                  }
                }
                L17: {
                  if (null == param2[3]) {
                    break L17;
                  } else {
                    if (-1 == (param2[3].field_u ^ -1)) {
                      break L17;
                    } else {
                      oo.e(param3, var18, var16, var19);
                      var20 = var14;
                      L18: while (true) {
                        L19: {
                          if (var20 >= var15) {
                            break L19;
                          } else {
                            param2[3].g(param3, var20);
                            var20 = var20 + param2[3].field_u;
                            if (0 == 0) {
                              continue L18;
                            } else {
                              break L19;
                            }
                          }
                        }
                        oo.b(qa.field_f);
                        break L17;
                      }
                    }
                  }
                }
                L20: {
                  if (param2[5] == null) {
                    break L20;
                  } else {
                    if (param2[5].field_u == 0) {
                      break L20;
                    } else {
                      oo.e(var17, var18, var10, var19);
                      var20 = var14;
                      L21: while (true) {
                        L22: {
                          if (var20 >= var15) {
                            break L22;
                          } else {
                            param2[5].g(var13, var20);
                            var20 = var20 + param2[5].field_u;
                            if (0 == 0) {
                              continue L21;
                            } else {
                              break L22;
                            }
                          }
                        }
                        oo.b(qa.field_f);
                        break L20;
                      }
                    }
                  }
                }
                L23: {
                  if (null == param2[4]) {
                    break L23;
                  } else {
                    if (param2[4].field_z == 0) {
                      break L23;
                    } else {
                      if (param2[4].field_u != 0) {
                        oo.e(var16, var18, var17, var19);
                        var20 = var14;
                        L24: while (true) {
                          L25: {
                            if (var20 >= var15) {
                              break L25;
                            } else {
                              var21 = var12;
                              L26: while (true) {
                                L27: {
                                  if (var13 <= var21) {
                                    break L27;
                                  } else {
                                    param2[4].g(var21, var20);
                                    var21 = var21 + param2[4].field_z;
                                    if (0 == 0) {
                                      continue L26;
                                    } else {
                                      break L27;
                                    }
                                  }
                                }
                                var20 = var20 + param2[4].field_u;
                                if (0 == 0) {
                                  continue L24;
                                } else {
                                  break L25;
                                }
                              }
                            }
                          }
                          oo.b(qa.field_f);
                          break L23;
                        }
                      } else {
                        break L23;
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

    final static String a(byte param0) {
        if (!(dj.field_k != id.field_B)) {
            return ch.field_j;
        }
        if (param0 != 32) {
            return null;
        }
        if (!(dj.field_k != ta.field_hb)) {
            return ih.field_a;
        }
        if (!tg.field_g.d(-107)) {
            return ih.field_a;
        }
        return fa.field_Ib;
    }

    final static void a(int param0, byte param1, int param2) {
        if (ka.field_f != null) {
            // if_icmplt L17
        } else {
            ka.field_f = new int[param0 * 2];
        }
        if (null != lb.field_c) {
            // if_icmplt L43
        } else {
            lb.field_c = new int[2 * param0];
        }
        if (null != vk.field_J) {
            // if_icmple L80
        }
        vk.field_J = new int[2 * param0];
        if (kj.field_p != null) {
            // if_icmpgt L97
        } else {
            kj.field_p = new int[param0 * 2];
        }
        if (ie.field_ob != null) {
            // if_icmplt L122
        } else {
            ie.field_ob = new int[param0 * 2];
        }
        if (hn.field_f != null) {
            // if_icmplt L147
        } else {
            hn.field_f = new int[param0 * 2];
        }
        if (la.field_c != null) {
            // if_icmple L188
        }
        la.field_c = new int[2 * (param2 + param0)];
        if (fc.field_c != null) {
            // if_icmpge L216
        }
        fc.field_c = new boolean[param0 * 2];
        lj.field_n = 0;
        ba.field_m = -2147483648;
        up.field_d = -2147483648;
        int var3 = -105 / ((param1 - 6) / 47);
        ab.field_j = 2147483647;
        mj.field_Ub = 2147483647;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = 0;
        field_g = "Retry (<%0> Left)";
        field_d = "They may be nowhere near your zombies, but you'll still be able to reach them...";
        field_f = 0;
        field_h = "Loading extra data";
    }
}
