/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ba {
    static String field_a;
    static hl field_c;
    private rk field_d;
    private rf field_b;
    static String field_e;

    final rf a(rf param0, int param1) {
        rf var3 = null;
        Object var4 = null;
        L0: {
          if (param1 == 0) {
            break L0;
          } else {
            var4 = null;
            rf discarded$2 = ((ba) this).a(-43, (rf) null);
            break L0;
          }
        }
        L1: {
          if (param0 != null) {
            var3 = param0;
            break L1;
          } else {
            var3 = ((ba) this).field_d.field_c.field_a;
            break L1;
          }
        }
        if (var3 == ((ba) this).field_d.field_c) {
          ((ba) this).field_b = null;
          return null;
        } else {
          ((ba) this).field_b = var3.field_a;
          return var3;
        }
    }

    final rf a(boolean param0) {
        rf var2 = ((ba) this).field_d.field_c.field_d;
        if (param0) {
            ba.a(true, false, 62);
        }
        if (!(var2 != ((ba) this).field_d.field_c)) {
            ((ba) this).field_b = null;
            return null;
        }
        ((ba) this).field_b = var2.field_d;
        return var2;
    }

    final rf a(int param0) {
        rf var2 = null;
        if (param0 == 0) {
          var2 = ((ba) this).field_d.field_c.field_a;
          if (var2 == ((ba) this).field_d.field_c) {
            ((ba) this).field_b = null;
            return null;
          } else {
            ((ba) this).field_b = var2.field_a;
            return var2;
          }
        } else {
          return null;
        }
    }

    final static void a(boolean param0, boolean param1, int param2) {
        if (param2 != 2) {
            return;
        }
        Object var4 = null;
        ae.a((String) null, param1, 0, param0);
    }

    final static boolean a(int param0, CharSequence param1) {
        if (param0 != 6) {
            field_a = null;
        }
        return we.a((byte) -108, param1, true, 10);
    }

    final rf a(byte param0) {
        rf var2 = ((ba) this).field_b;
        if (param0 != -34) {
            field_a = null;
        }
        if (!(var2 != ((ba) this).field_d.field_c)) {
            ((ba) this).field_b = null;
            return null;
        }
        ((ba) this).field_b = var2.field_d;
        return var2;
    }

    static long a(long param0, long param1) {
        return param0 ^ param1;
    }

    public static void c(int param0) {
        field_a = null;
        if (param0 < 118) {
            return;
        }
        field_e = null;
        field_c = null;
    }

    final rf a(int param0, rf param1) {
        rf var3 = null;
        if (param1 != null) {
            var3 = param1;
        } else {
            var3 = ((ba) this).field_d.field_c.field_d;
        }
        if (param0 != 0) {
            ((ba) this).field_b = null;
        }
        if (!(var3 != ((ba) this).field_d.field_c)) {
            ((ba) this).field_b = null;
            return null;
        }
        ((ba) this).field_b = var3.field_d;
        return var3;
    }

    ba(rk param0) {
        ((ba) this).field_d = param0;
    }

    final static void a(int param0, hl[] param1, byte param2, int param3, int param4, int param5) {
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
        int var23 = 0;
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
        var23 = StarCannon.field_A;
        if (param1 == null) {
          return;
        } else {
          L0: {
            if (0 >= param4) {
              break L0;
            } else {
              if (0 < param0) {
                L1: {
                  if (null != param1[3]) {
                    stackOut_8_0 = param1[3].field_x;
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
                  if (null != param1[5]) {
                    stackOut_11_0 = param1[5].field_x;
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
                  if (null == param1[1]) {
                    stackOut_14_0 = 0;
                    stackIn_15_0 = stackOut_14_0;
                    break L3;
                  } else {
                    stackOut_13_0 = param1[1].field_q;
                    stackIn_15_0 = stackOut_13_0;
                    break L3;
                  }
                }
                L4: {
                  var8 = stackIn_15_0;
                  if (null != param1[7]) {
                    stackOut_17_0 = param1[7].field_q;
                    stackIn_18_0 = stackOut_17_0;
                    break L4;
                  } else {
                    stackOut_16_0 = 0;
                    stackIn_18_0 = stackOut_16_0;
                    break L4;
                  }
                }
                L5: {
                  var9 = stackIn_18_0;
                  var10 = param4 + param3;
                  var11 = param0 + param5;
                  var14 = 13 / ((param2 - -51) / 57);
                  var12 = param3 + var6;
                  var13 = var10 - var7;
                  var15 = param5 - -var8;
                  var16 = var11 + -var9;
                  var17 = var12;
                  var18 = var13;
                  if (var17 > var18) {
                    var18 = param3 + var6 * param4 / (var7 + var6);
                    var17 = param3 + var6 * param4 / (var7 + var6);
                    break L5;
                  } else {
                    break L5;
                  }
                }
                L6: {
                  var19 = var15;
                  var20 = var16;
                  ki.a(pk.field_d);
                  if (var19 > var20) {
                    var20 = param0 * var8 / (var8 - -var9) + param5;
                    var19 = param0 * var8 / (var8 - -var9) + param5;
                    break L6;
                  } else {
                    break L6;
                  }
                }
                L7: {
                  if (null == param1[0]) {
                    break L7;
                  } else {
                    ki.c(param3, param5, var17, var19);
                    param1[0].e(param3, param5);
                    ki.b(pk.field_d);
                    break L7;
                  }
                }
                L8: {
                  if (null != param1[2]) {
                    ki.c(var18, param5, var10, var19);
                    param1[2].e(var13, param5);
                    ki.b(pk.field_d);
                    break L8;
                  } else {
                    break L8;
                  }
                }
                L9: {
                  if (param1[6] == null) {
                    break L9;
                  } else {
                    ki.c(param3, var20, var17, var11);
                    param1[6].e(param3, var16);
                    ki.b(pk.field_d);
                    break L9;
                  }
                }
                L10: {
                  if (null != param1[8]) {
                    ki.c(var18, var20, var10, var11);
                    param1[8].e(var13, var16);
                    ki.b(pk.field_d);
                    break L10;
                  } else {
                    break L10;
                  }
                }
                L11: {
                  if (param1[1] == null) {
                    break L11;
                  } else {
                    if (param1[1].field_x == 0) {
                      break L11;
                    } else {
                      ki.c(var17, param5, var18, var19);
                      var21 = var12;
                      L12: while (true) {
                        L13: {
                          if (var13 <= var21) {
                            break L13;
                          } else {
                            param1[1].e(var21, param5);
                            var21 = var21 + param1[1].field_x;
                            if (0 == 0) {
                              continue L12;
                            } else {
                              break L13;
                            }
                          }
                        }
                        ki.b(pk.field_d);
                        break L11;
                      }
                    }
                  }
                }
                L14: {
                  if (null == param1[7]) {
                    break L14;
                  } else {
                    if (param1[7].field_x != 0) {
                      ki.c(var17, var20, var18, var11);
                      var21 = var12;
                      L15: while (true) {
                        L16: {
                          if (var13 <= var21) {
                            break L16;
                          } else {
                            param1[7].e(var21, var16);
                            var21 = var21 + param1[7].field_x;
                            if (0 == 0) {
                              continue L15;
                            } else {
                              break L16;
                            }
                          }
                        }
                        ki.b(pk.field_d);
                        break L14;
                      }
                    } else {
                      break L14;
                    }
                  }
                }
                L17: {
                  if (null == param1[3]) {
                    break L17;
                  } else {
                    if (-1 != (param1[3].field_q ^ -1)) {
                      ki.c(param3, var19, var17, var20);
                      var21 = var15;
                      L18: while (true) {
                        L19: {
                          if (var16 <= var21) {
                            break L19;
                          } else {
                            param1[3].e(param3, var21);
                            var21 = var21 + param1[3].field_q;
                            if (0 == 0) {
                              continue L18;
                            } else {
                              break L19;
                            }
                          }
                        }
                        ki.b(pk.field_d);
                        break L17;
                      }
                    } else {
                      break L17;
                    }
                  }
                }
                L20: {
                  if (param1[5] == null) {
                    break L20;
                  } else {
                    if (0 == param1[5].field_q) {
                      break L20;
                    } else {
                      ki.c(var18, var19, var10, var20);
                      var21 = var15;
                      L21: while (true) {
                        L22: {
                          if (var16 <= var21) {
                            break L22;
                          } else {
                            param1[5].e(var13, var21);
                            var21 = var21 + param1[5].field_q;
                            if (0 == 0) {
                              continue L21;
                            } else {
                              break L22;
                            }
                          }
                        }
                        ki.b(pk.field_d);
                        break L20;
                      }
                    }
                  }
                }
                L23: {
                  if (param1[4] == null) {
                    break L23;
                  } else {
                    if (-1 == (param1[4].field_x ^ -1)) {
                      break L23;
                    } else {
                      if (param1[4].field_q != 0) {
                        ki.c(var17, var19, var18, var20);
                        var21 = var15;
                        L24: while (true) {
                          L25: {
                            if (var21 >= var16) {
                              break L25;
                            } else {
                              var22 = var12;
                              L26: while (true) {
                                L27: {
                                  if (var22 >= var13) {
                                    break L27;
                                  } else {
                                    param1[4].e(var22, var21);
                                    var22 = var22 + param1[4].field_x;
                                    if (0 == 0) {
                                      continue L26;
                                    } else {
                                      break L27;
                                    }
                                  }
                                }
                                var21 = var21 + param1[4].field_q;
                                if (0 == 0) {
                                  continue L24;
                                } else {
                                  break L25;
                                }
                              }
                            }
                          }
                          ki.b(pk.field_d);
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
        }
    }

    final rf b(int param0) {
        if (param0 <= 64) {
            rf discarded$0 = ((ba) this).a(56);
        }
        rf var2 = ((ba) this).field_b;
        if (!(((ba) this).field_d.field_c != var2)) {
            ((ba) this).field_b = null;
            return null;
        }
        ((ba) this).field_b = var2.field_a;
        return var2;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "Please wait...";
    }
}
