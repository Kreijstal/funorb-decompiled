/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gl {
    int field_e;
    static String field_d;
    static aj field_b;
    static String field_a;
    static kc field_c;
    static String field_f;

    final static void a(int param0, int param1, int param2, int param3, int[] param4, int param5, int param6, int param7, int param8, byte param9) {
        int[] var18 = null;
        int[] var10 = null;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = ArcanistsMulti.field_G ? 1 : 0;
        while (true) {
            param2--;
            if (0 > param2) {
                break;
            }
            var18 = param4;
            var10 = var18;
            var11 = param1;
            var12 = param6;
            var13 = param5;
            var14 = param0;
            var15 = (16711422 & var18[var11]) >> -469845279;
            var10[var11] = dg.a(255, var14 >> -858249455) - (-(dg.a(var13, 33423780) >> -1006873719) + -dg.a(16711680, var12 >> 225687201)) + var15;
            param6 = param6 + param7;
            param1++;
            param0 = param0 + param8;
            param5 = param5 + param3;
        }
        if (param9 < 116) {
            Object var17 = null;
            gl.a(-42, -39, 14, -51, (int[]) null, 44, -111, -12, -52, (byte) 102);
        }
    }

    public static void a(byte param0) {
        field_d = null;
        field_f = null;
        field_a = null;
        field_c = null;
        field_b = null;
        if (param0 != 15) {
            gl.a((byte) -4);
        }
    }

    final static void a(int param0, int param1, int param2, int param3, qb[] param4, int param5) {
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
        int stackIn_14_0 = 0;
        int stackIn_17_0 = 0;
        int stackIn_20_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_16_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_19_0 = 0;
        int stackOut_18_0 = 0;
        var22 = ArcanistsMulti.field_G ? 1 : 0;
        if (param4 == null) {
          return;
        } else {
          L0: {
            if (param3 <= 0) {
              break L0;
            } else {
              if (param0 > 0) {
                L1: {
                  if (null == param4[3]) {
                    stackOut_8_0 = 0;
                    stackIn_9_0 = stackOut_8_0;
                    break L1;
                  } else {
                    stackOut_7_0 = param4[3].field_n;
                    stackIn_9_0 = stackOut_7_0;
                    break L1;
                  }
                }
                L2: {
                  var6 = stackIn_9_0;
                  if (param2 == -27327) {
                    break L2;
                  } else {
                    gl.a(true, -7);
                    break L2;
                  }
                }
                L3: {
                  if (null != param4[5]) {
                    stackOut_13_0 = param4[5].field_n;
                    stackIn_14_0 = stackOut_13_0;
                    break L3;
                  } else {
                    stackOut_12_0 = 0;
                    stackIn_14_0 = stackOut_12_0;
                    break L3;
                  }
                }
                L4: {
                  var7 = stackIn_14_0;
                  if (null != param4[1]) {
                    stackOut_16_0 = param4[1].field_w;
                    stackIn_17_0 = stackOut_16_0;
                    break L4;
                  } else {
                    stackOut_15_0 = 0;
                    stackIn_17_0 = stackOut_15_0;
                    break L4;
                  }
                }
                L5: {
                  var8 = stackIn_17_0;
                  if (null != param4[7]) {
                    stackOut_19_0 = param4[7].field_w;
                    stackIn_20_0 = stackOut_19_0;
                    break L5;
                  } else {
                    stackOut_18_0 = 0;
                    stackIn_20_0 = stackOut_18_0;
                    break L5;
                  }
                }
                L6: {
                  var9 = stackIn_20_0;
                  var10 = param1 + param3;
                  var11 = param0 + param5;
                  var12 = param1 - -var6;
                  var13 = -var7 + var10;
                  var14 = var8 + param5;
                  var15 = var11 - var9;
                  var16 = var12;
                  var17 = var13;
                  if (var17 >= var16) {
                    break L6;
                  } else {
                    var17 = param1 - -(param3 * var6 / (var7 + var6));
                    var16 = param1 - -(param3 * var6 / (var7 + var6));
                    break L6;
                  }
                }
                L7: {
                  var18 = var14;
                  var19 = var15;
                  de.a(ee.field_d);
                  if (var19 < var18) {
                    var19 = param5 - -(var8 * param0 / (var9 + var8));
                    var18 = param5 - -(var8 * param0 / (var9 + var8));
                    break L7;
                  } else {
                    break L7;
                  }
                }
                L8: {
                  if (null != param4[0]) {
                    de.a(param1, param5, var16, var18);
                    param4[0].c(param1, param5);
                    de.b(ee.field_d);
                    break L8;
                  } else {
                    break L8;
                  }
                }
                L9: {
                  if (null == param4[2]) {
                    break L9;
                  } else {
                    de.a(var17, param5, var10, var18);
                    param4[2].c(var13, param5);
                    de.b(ee.field_d);
                    break L9;
                  }
                }
                L10: {
                  if (null != param4[6]) {
                    de.a(param1, var19, var16, var11);
                    param4[6].c(param1, var15);
                    de.b(ee.field_d);
                    break L10;
                  } else {
                    break L10;
                  }
                }
                L11: {
                  if (param4[8] == null) {
                    break L11;
                  } else {
                    de.a(var17, var19, var10, var11);
                    param4[8].c(var13, var15);
                    de.b(ee.field_d);
                    break L11;
                  }
                }
                L12: {
                  if (param4[1] == null) {
                    break L12;
                  } else {
                    if (-1 == (param4[1].field_n ^ -1)) {
                      break L12;
                    } else {
                      de.a(var16, param5, var17, var18);
                      var20 = var12;
                      L13: while (true) {
                        L14: {
                          if (var20 >= var13) {
                            break L14;
                          } else {
                            param4[1].c(var20, param5);
                            var20 = var20 + param4[1].field_n;
                            if (0 == 0) {
                              continue L13;
                            } else {
                              break L14;
                            }
                          }
                        }
                        de.b(ee.field_d);
                        break L12;
                      }
                    }
                  }
                }
                L15: {
                  if (null == param4[7]) {
                    break L15;
                  } else {
                    if (param4[7].field_n == 0) {
                      break L15;
                    } else {
                      de.a(var16, var19, var17, var11);
                      var20 = var12;
                      L16: while (true) {
                        L17: {
                          if (var13 <= var20) {
                            break L17;
                          } else {
                            param4[7].c(var20, var15);
                            var20 = var20 + param4[7].field_n;
                            if (0 == 0) {
                              continue L16;
                            } else {
                              break L17;
                            }
                          }
                        }
                        de.b(ee.field_d);
                        break L15;
                      }
                    }
                  }
                }
                L18: {
                  if (null == param4[3]) {
                    break L18;
                  } else {
                    if (-1 != (param4[3].field_w ^ -1)) {
                      de.a(param1, var18, var16, var19);
                      var20 = var14;
                      L19: while (true) {
                        L20: {
                          if (var20 >= var15) {
                            break L20;
                          } else {
                            param4[3].c(param1, var20);
                            var20 = var20 + param4[3].field_w;
                            if (0 == 0) {
                              continue L19;
                            } else {
                              break L20;
                            }
                          }
                        }
                        de.b(ee.field_d);
                        break L18;
                      }
                    } else {
                      break L18;
                    }
                  }
                }
                L21: {
                  if (param4[5] == null) {
                    break L21;
                  } else {
                    if (param4[5].field_w == 0) {
                      break L21;
                    } else {
                      de.a(var17, var18, var10, var19);
                      var20 = var14;
                      L22: while (true) {
                        L23: {
                          if (var20 >= var15) {
                            break L23;
                          } else {
                            param4[5].c(var13, var20);
                            var20 = var20 + param4[5].field_w;
                            if (0 == 0) {
                              continue L22;
                            } else {
                              break L23;
                            }
                          }
                        }
                        de.b(ee.field_d);
                        break L21;
                      }
                    }
                  }
                }
                L24: {
                  if (null == param4[4]) {
                    break L24;
                  } else {
                    if (0 == param4[4].field_n) {
                      break L24;
                    } else {
                      if (param4[4].field_w == 0) {
                        break L24;
                      } else {
                        de.a(var16, var18, var17, var19);
                        var20 = var14;
                        L25: while (true) {
                          L26: {
                            if (var15 <= var20) {
                              break L26;
                            } else {
                              var21 = var12;
                              L27: while (true) {
                                L28: {
                                  if (var13 <= var21) {
                                    break L28;
                                  } else {
                                    param4[4].c(var21, var20);
                                    var21 = var21 + param4[4].field_n;
                                    if (0 == 0) {
                                      continue L27;
                                    } else {
                                      break L28;
                                    }
                                  }
                                }
                                var20 = var20 + param4[4].field_w;
                                if (0 == 0) {
                                  continue L25;
                                } else {
                                  break L26;
                                }
                              }
                            }
                          }
                          de.b(ee.field_d);
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
        }
    }

    final static void a(boolean param0, int param1) {
        int var3 = 0;
        Object var4 = null;
        L0: {
          L1: {
            var3 = ArcanistsMulti.field_G ? 1 : 0;
            if (param0) {
              break L1;
            } else {
              if (wi.field_f != null) {
                break L0;
              } else {
                break L1;
              }
            }
          }
          so.field_j = false;
          break L0;
        }
        L2: {
          if (param0) {
            if ((ce.field_h ^ -1) >= -1) {
              if ((sm.field_a ^ -1) >= -1) {
                if (0 < oo.field_y) {
                  oo.field_y = oo.field_y - 1;
                  break L2;
                } else {
                  break L2;
                }
              } else {
                sm.field_a = sm.field_a - 1;
                break L2;
              }
            } else {
              ce.field_h = ce.field_h - 1;
              break L2;
            }
          } else {
            if (wi.field_f == null) {
              if (om.field_x == null) {
                so.field_j = false;
                if (sm.field_a > 0) {
                  sm.field_a = sm.field_a - 1;
                  break L2;
                } else {
                  if (oo.field_y > 0) {
                    oo.field_y = oo.field_y - 1;
                    break L2;
                  } else {
                    if (ce.field_h >= ea.field_F) {
                      break L2;
                    } else {
                      L3: {
                        if (ce.field_h != 0) {
                          break L3;
                        } else {
                          ik.a((byte) -85);
                          break L3;
                        }
                      }
                      ce.field_h = ce.field_h + 1;
                      break L2;
                    }
                  }
                }
              } else {
                if (ce.field_h > 0) {
                  ce.field_h = ce.field_h - 1;
                  break L2;
                } else {
                  if (-1 <= (oo.field_y ^ -1)) {
                    if (ea.field_F <= sm.field_a) {
                      break L2;
                    } else {
                      L4: {
                        if (0 != sm.field_a) {
                          break L4;
                        } else {
                          ik.a(true, -115);
                          break L4;
                        }
                      }
                      sm.field_a = sm.field_a + 1;
                      break L2;
                    }
                  } else {
                    oo.field_y = oo.field_y - 1;
                    break L2;
                  }
                }
              }
            } else {
              if (ce.field_h <= 0) {
                if (sm.field_a < -1) {
                  sm.field_a = sm.field_a - 1;
                  break L2;
                } else {
                  if (oo.field_y >= ea.field_F) {
                    break L2;
                  } else {
                    L5: {
                      if (-1 == oo.field_y) {
                        ik.a(false, 95);
                        break L5;
                      } else {
                        break L5;
                      }
                    }
                    oo.field_y = oo.field_y + 1;
                    break L2;
                  }
                }
              } else {
                ce.field_h = ce.field_h - 1;
                break L2;
              }
            }
          }
        }
        L6: {
          if (param1 == 0) {
            break L6;
          } else {
            var4 = null;
            gl.a(126, -38, -58, 81, (qb[]) null, 13);
            break L6;
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = "Invalid date";
        field_b = new aj(9, 0, 4, 1);
        field_a = "Team Play:";
        field_f = "Please check if address is correct";
    }
}
