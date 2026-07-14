/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ma extends hf {
    int field_h;
    long field_f;
    byte[] field_g;

    final static void a(byte param0) {
        int[] var1 = null;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int[] var5 = null;
        var4 = Geoblox.field_C;
        var5 = uh.field_x;
        var1 = var5;
        var2 = 0;
        var3 = var5.length;
        if (param0 != -35) {
          return;
        } else {
          L0: while (true) {
            if (var2 >= var3) {
              return;
            } else {
              var2++;
              var5[var2] = 0;
              var2++;
              var5[var2] = 0;
              var2++;
              var5[var2] = 0;
              var2++;
              var5[var2] = 0;
              var2++;
              var5[var2] = 0;
              var2++;
              var5[var2] = 0;
              var2++;
              var5[var2] = 0;
              var2++;
              var5[var2] = 0;
              continue L0;
            }
          }
        }
    }

    final static boolean a(boolean param0, float param1, ja param2) {
        if (!param0) {
            int discarded$0 = ma.b(-91);
        }
        return aa.a(wd.field_b, 0, 0, vf.field_L, -wd.field_a + ng.field_G + -(vf.field_L.field_s >> 1323895489), -wd.field_d + -(vf.field_L.field_o >> -1840501887) + td.field_E);
    }

    final static int b(int param0) {
        gb.field_b.a((byte) -65);
        if (param0 != 15869) {
            return 61;
        }
        if (!wg.field_i.a((byte) 95)) {
            return ge.a((byte) -74);
        }
        return 0;
    }

    final static boolean c(byte param0) {
        int var1 = 39 / ((param0 - 18) / 54);
        return fa.field_b > fj.field_m ? true : false;
    }

    final static void a(int param0, int param1, int param2, byte param3, int param4, dm[] param5) {
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
        int stackIn_10_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_18_0 = 0;
        int stackIn_21_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_17_0 = 0;
        int stackOut_16_0 = 0;
        int stackOut_20_0 = 0;
        int stackOut_19_0 = 0;
        var22 = Geoblox.field_C;
        if (param5 != null) {
          if (param4 > 0) {
            if (0 >= param2) {
              return;
            } else {
              L0: {
                if (param5[3] == null) {
                  stackOut_9_0 = 0;
                  stackIn_10_0 = stackOut_9_0;
                  break L0;
                } else {
                  stackOut_8_0 = param5[3].field_s;
                  stackIn_10_0 = stackOut_8_0;
                  break L0;
                }
              }
              L1: {
                var6 = stackIn_10_0;
                if (null == param5[5]) {
                  stackOut_12_0 = 0;
                  stackIn_13_0 = stackOut_12_0;
                  break L1;
                } else {
                  stackOut_11_0 = param5[5].field_s;
                  stackIn_13_0 = stackOut_11_0;
                  break L1;
                }
              }
              var7 = stackIn_13_0;
              if (param3 == -92) {
                L2: {
                  if (null != param5[1]) {
                    stackOut_17_0 = param5[1].field_o;
                    stackIn_18_0 = stackOut_17_0;
                    break L2;
                  } else {
                    stackOut_16_0 = 0;
                    stackIn_18_0 = stackOut_16_0;
                    break L2;
                  }
                }
                L3: {
                  var8 = stackIn_18_0;
                  if (null != param5[7]) {
                    stackOut_20_0 = param5[7].field_o;
                    stackIn_21_0 = stackOut_20_0;
                    break L3;
                  } else {
                    stackOut_19_0 = 0;
                    stackIn_21_0 = stackOut_19_0;
                    break L3;
                  }
                }
                L4: {
                  var9 = stackIn_21_0;
                  var10 = param4 + param1;
                  var11 = param0 + param2;
                  var12 = param1 + var6;
                  var13 = var10 - var7;
                  var14 = param0 - -var8;
                  var15 = -var9 + var11;
                  var16 = var12;
                  var17 = var13;
                  if (var16 <= var17) {
                    break L4;
                  } else {
                    var17 = var6 * param4 / (var6 - -var7) + param1;
                    var16 = var6 * param4 / (var6 - -var7) + param1;
                    break L4;
                  }
                }
                L5: {
                  var18 = var14;
                  var19 = var15;
                  vb.a(hd.field_I);
                  if (var19 >= var18) {
                    break L5;
                  } else {
                    var19 = param2 * var8 / (var8 + var9) + param0;
                    var18 = param2 * var8 / (var8 + var9) + param0;
                    break L5;
                  }
                }
                L6: {
                  if (null == param5[0]) {
                    break L6;
                  } else {
                    vb.b(param1, param0, var16, var18);
                    param5[0].b(param1, param0);
                    vb.b(hd.field_I);
                    break L6;
                  }
                }
                L7: {
                  if (param5[2] != null) {
                    vb.b(var17, param0, var10, var18);
                    param5[2].b(var13, param0);
                    vb.b(hd.field_I);
                    break L7;
                  } else {
                    break L7;
                  }
                }
                L8: {
                  if (null != param5[6]) {
                    vb.b(param1, var19, var16, var11);
                    param5[6].b(param1, var15);
                    vb.b(hd.field_I);
                    break L8;
                  } else {
                    break L8;
                  }
                }
                L9: {
                  if (null != param5[8]) {
                    vb.b(var17, var19, var10, var11);
                    param5[8].b(var13, var15);
                    vb.b(hd.field_I);
                    break L9;
                  } else {
                    break L9;
                  }
                }
                L10: {
                  if (null == param5[1]) {
                    break L10;
                  } else {
                    if (param5[1].field_s != 0) {
                      vb.b(var16, param0, var17, var18);
                      var20 = var12;
                      L11: while (true) {
                        L12: {
                          if (var13 <= var20) {
                            break L12;
                          } else {
                            param5[1].b(var20, param0);
                            var20 = var20 + param5[1].field_s;
                            if (0 == 0) {
                              continue L11;
                            } else {
                              break L12;
                            }
                          }
                        }
                        vb.b(hd.field_I);
                        break L10;
                      }
                    } else {
                      break L10;
                    }
                  }
                }
                L13: {
                  if (param5[7] == null) {
                    break L13;
                  } else {
                    if (0 != param5[7].field_s) {
                      vb.b(var16, var19, var17, var11);
                      var20 = var12;
                      L14: while (true) {
                        L15: {
                          if (var20 >= var13) {
                            break L15;
                          } else {
                            param5[7].b(var20, var15);
                            var20 = var20 + param5[7].field_s;
                            if (0 == 0) {
                              continue L14;
                            } else {
                              break L15;
                            }
                          }
                        }
                        vb.b(hd.field_I);
                        break L13;
                      }
                    } else {
                      break L13;
                    }
                  }
                }
                L16: {
                  if (param5[3] == null) {
                    break L16;
                  } else {
                    if (0 != param5[3].field_o) {
                      vb.b(param1, var18, var16, var19);
                      var20 = var14;
                      L17: while (true) {
                        L18: {
                          if (var15 <= var20) {
                            break L18;
                          } else {
                            param5[3].b(param1, var20);
                            var20 = var20 + param5[3].field_o;
                            if (0 == 0) {
                              continue L17;
                            } else {
                              break L18;
                            }
                          }
                        }
                        vb.b(hd.field_I);
                        break L16;
                      }
                    } else {
                      break L16;
                    }
                  }
                }
                L19: {
                  if (param5[5] == null) {
                    break L19;
                  } else {
                    if (param5[5].field_o != 0) {
                      vb.b(var17, var18, var10, var19);
                      var20 = var14;
                      L20: while (true) {
                        L21: {
                          if (var20 >= var15) {
                            break L21;
                          } else {
                            param5[5].b(var13, var20);
                            var20 = var20 + param5[5].field_o;
                            if (0 == 0) {
                              continue L20;
                            } else {
                              break L21;
                            }
                          }
                        }
                        vb.b(hd.field_I);
                        break L19;
                      }
                    } else {
                      break L19;
                    }
                  }
                }
                L22: {
                  if (param5[4] == null) {
                    break L22;
                  } else {
                    if (param5[4].field_s == 0) {
                      break L22;
                    } else {
                      if (0 == param5[4].field_o) {
                        break L22;
                      } else {
                        vb.b(var16, var18, var17, var19);
                        var20 = var14;
                        L23: while (true) {
                          L24: {
                            if (var15 <= var20) {
                              break L24;
                            } else {
                              var21 = var12;
                              L25: while (true) {
                                L26: {
                                  if (var21 >= var13) {
                                    break L26;
                                  } else {
                                    param5[4].b(var21, var20);
                                    var21 = var21 + param5[4].field_s;
                                    if (0 == 0) {
                                      continue L25;
                                    } else {
                                      break L26;
                                    }
                                  }
                                }
                                var20 = var20 + param5[4].field_o;
                                if (0 == 0) {
                                  continue L23;
                                } else {
                                  break L24;
                                }
                              }
                            }
                          }
                          vb.b(hd.field_I);
                          break L22;
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
          } else {
            return;
          }
        } else {
          return;
        }
    }

    final static boolean a(rh param0, rh param1, rh param2, int param3) {
        L0: {
          if (!param2.a(0)) {
            break L0;
          } else {
            if (!param2.a("commonui", (byte) -127)) {
              break L0;
            } else {
              L1: {
                if (!param1.a(param3 + 11652)) {
                  break L1;
                } else {
                  if (!param1.a("commonui", (byte) -124)) {
                    break L1;
                  } else {
                    if (param3 == -11652) {
                      if (param0.a(0)) {
                        if (param0.a("button.gif", (byte) -125)) {
                          return true;
                        } else {
                          return false;
                        }
                      } else {
                        return false;
                      }
                    } else {
                      return false;
                    }
                  }
                }
              }
              return false;
            }
          }
        }
        return false;
    }

    ma(long param0, int param1, byte[] param2) {
        ((ma) this).field_h = param1;
        ((ma) this).field_g = param2;
        ((ma) this).field_f = param0;
    }

    static {
    }
}
