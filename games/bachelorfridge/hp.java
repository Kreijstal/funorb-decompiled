/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hp {
    static hga field_d;
    static boolean field_a;
    static kv[] field_b;
    static int field_c;

    final static boolean a(int param0, byte param1, int[] param2) {
        int var3 = 99 / ((-16 - param1) / 37);
        return (param2[param0 >> -1495798459] & 1 << (31 & param0)) != 0 ? true : false;
    }

    final static void a(java.applet.Applet param0, String param1, int param2) {
        try {
            String var6 = null;
            String var5 = null;
            String var4 = null;
            String var7 = null;
            nb.field_q = param1;
            try {
                if (param2 != 3) {
                    hp.a(106);
                }
                var6 = param0.getParameter("cookieprefix");
                var5 = var6;
                var5 = var6;
                var4 = param0.getParameter("cookiehost");
                var5 = var4;
                var5 = var4;
                var7 = var6 + "settings=" + param1 + "; version=1; path=/; domain=" + var4;
                var5 = var7;
                var5 = var7;
                if (param1.length() == 0) {
                    var5 = var7 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
                } else {
                    var5 = var7 + "; Expires=" + km.a(f.b((byte) 73) - -94608000000L, -1) + "; Max-Age=" + 94608000L;
                }
                ac.a("document.cookie=\"" + var5 + "\"", param0, 119);
            } catch (Throwable throwable) {
            }
            eha.a(-123, param0);
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void a(int param0) {
        field_d = null;
        field_b = null;
        int var1 = 31 % ((-6 - param0) / 38);
    }

    final static String a(CharSequence param0, int param1) {
        if (param1 != 0) {
            Object var3 = null;
            hp.a((java.applet.Applet) null, (String) null, 0);
        }
        return mc.a(false, param0, param1 ^ 0);
    }

    final static void a(int param0, int param1, byte param2, int param3, kv[] param4, int param5) {
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
        int stackIn_10_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_16_0 = 0;
        int stackIn_19_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_18_0 = 0;
        int stackOut_17_0 = 0;
        var23 = BachelorFridge.field_y;
        if (param4 == null) {
          return;
        } else {
          L0: {
            if (0 >= param0) {
              break L0;
            } else {
              if (-1 <= (param3 ^ -1)) {
                break L0;
              } else {
                L1: {
                  if (param4[3] == null) {
                    stackOut_9_0 = 0;
                    stackIn_10_0 = stackOut_9_0;
                    break L1;
                  } else {
                    stackOut_8_0 = param4[3].field_n;
                    stackIn_10_0 = stackOut_8_0;
                    break L1;
                  }
                }
                L2: {
                  var6 = stackIn_10_0;
                  if (param4[5] == null) {
                    stackOut_12_0 = 0;
                    stackIn_13_0 = stackOut_12_0;
                    break L2;
                  } else {
                    stackOut_11_0 = param4[5].field_n;
                    stackIn_13_0 = stackOut_11_0;
                    break L2;
                  }
                }
                L3: {
                  var7 = stackIn_13_0;
                  if (null != param4[1]) {
                    stackOut_15_0 = param4[1].field_o;
                    stackIn_16_0 = stackOut_15_0;
                    break L3;
                  } else {
                    stackOut_14_0 = 0;
                    stackIn_16_0 = stackOut_14_0;
                    break L3;
                  }
                }
                L4: {
                  var8 = stackIn_16_0;
                  var10 = 6 / ((52 - param2) / 42);
                  if (null != param4[7]) {
                    stackOut_18_0 = param4[7].field_o;
                    stackIn_19_0 = stackOut_18_0;
                    break L4;
                  } else {
                    stackOut_17_0 = 0;
                    stackIn_19_0 = stackOut_17_0;
                    break L4;
                  }
                }
                L5: {
                  var9 = stackIn_19_0;
                  var11 = param1 - -param0;
                  var12 = param3 + param5;
                  var13 = param1 - -var6;
                  var14 = -var7 + var11;
                  var15 = param5 - -var8;
                  var16 = -var9 + var12;
                  var17 = var13;
                  var18 = var14;
                  if (var18 >= var17) {
                    break L5;
                  } else {
                    var18 = var6 * param0 / (var7 + var6) + param1;
                    var17 = var6 * param0 / (var7 + var6) + param1;
                    break L5;
                  }
                }
                L6: {
                  var19 = var15;
                  var20 = var16;
                  if (var20 >= var19) {
                    break L6;
                  } else {
                    var20 = param5 + var8 * param3 / (var9 + var8);
                    var19 = param5 + var8 * param3 / (var9 + var8);
                    break L6;
                  }
                }
                L7: {
                  dg.a(qb.field_m);
                  if (param4[0] != null) {
                    dg.c(param1, param5, var17, var19);
                    param4[0].e(param1, param5);
                    dg.b(qb.field_m);
                    break L7;
                  } else {
                    break L7;
                  }
                }
                L8: {
                  if (null != param4[2]) {
                    dg.c(var18, param5, var11, var19);
                    param4[2].e(var14, param5);
                    dg.b(qb.field_m);
                    break L8;
                  } else {
                    break L8;
                  }
                }
                L9: {
                  if (param4[6] != null) {
                    dg.c(param1, var20, var17, var12);
                    param4[6].e(param1, var16);
                    dg.b(qb.field_m);
                    break L9;
                  } else {
                    break L9;
                  }
                }
                L10: {
                  if (param4[8] == null) {
                    break L10;
                  } else {
                    dg.c(var18, var20, var11, var12);
                    param4[8].e(var14, var16);
                    dg.b(qb.field_m);
                    break L10;
                  }
                }
                L11: {
                  if (null == param4[1]) {
                    break L11;
                  } else {
                    if (-1 == (param4[1].field_n ^ -1)) {
                      break L11;
                    } else {
                      dg.c(var17, param5, var18, var19);
                      var21 = var13;
                      L12: while (true) {
                        L13: {
                          if (var21 >= var14) {
                            break L13;
                          } else {
                            param4[1].e(var21, param5);
                            var21 = var21 + param4[1].field_n;
                            if (0 == 0) {
                              continue L12;
                            } else {
                              break L13;
                            }
                          }
                        }
                        dg.b(qb.field_m);
                        break L11;
                      }
                    }
                  }
                }
                L14: {
                  if (null == param4[7]) {
                    break L14;
                  } else {
                    if (param4[7].field_n == 0) {
                      break L14;
                    } else {
                      dg.c(var17, var20, var18, var12);
                      var21 = var13;
                      L15: while (true) {
                        L16: {
                          if (var21 >= var14) {
                            break L16;
                          } else {
                            param4[7].e(var21, var16);
                            var21 = var21 + param4[7].field_n;
                            if (0 == 0) {
                              continue L15;
                            } else {
                              break L16;
                            }
                          }
                        }
                        dg.b(qb.field_m);
                        break L14;
                      }
                    }
                  }
                }
                L17: {
                  if (param4[3] == null) {
                    break L17;
                  } else {
                    if (0 != param4[3].field_o) {
                      dg.c(param1, var19, var17, var20);
                      var21 = var15;
                      L18: while (true) {
                        L19: {
                          if (var21 >= var16) {
                            break L19;
                          } else {
                            param4[3].e(param1, var21);
                            var21 = var21 + param4[3].field_o;
                            if (0 == 0) {
                              continue L18;
                            } else {
                              break L19;
                            }
                          }
                        }
                        dg.b(qb.field_m);
                        break L17;
                      }
                    } else {
                      break L17;
                    }
                  }
                }
                L20: {
                  if (param4[5] == null) {
                    break L20;
                  } else {
                    if (0 != param4[5].field_o) {
                      dg.c(var18, var19, var11, var20);
                      var21 = var15;
                      L21: while (true) {
                        L22: {
                          if (var16 <= var21) {
                            break L22;
                          } else {
                            param4[5].e(var14, var21);
                            var21 = var21 + param4[5].field_o;
                            if (0 == 0) {
                              continue L21;
                            } else {
                              break L22;
                            }
                          }
                        }
                        dg.b(qb.field_m);
                        break L20;
                      }
                    } else {
                      break L20;
                    }
                  }
                }
                L23: {
                  if (null == param4[4]) {
                    break L23;
                  } else {
                    if (param4[4].field_n == 0) {
                      break L23;
                    } else {
                      if (0 != param4[4].field_o) {
                        dg.c(var17, var19, var18, var20);
                        var21 = var15;
                        L24: while (true) {
                          L25: {
                            if (var16 <= var21) {
                              break L25;
                            } else {
                              var22 = var13;
                              L26: while (true) {
                                L27: {
                                  if (var14 <= var22) {
                                    break L27;
                                  } else {
                                    param4[4].e(var22, var21);
                                    var22 = var22 + param4[4].field_n;
                                    if (0 == 0) {
                                      continue L26;
                                    } else {
                                      break L27;
                                    }
                                  }
                                }
                                var21 = var21 + param4[4].field_o;
                                if (0 == 0) {
                                  continue L24;
                                } else {
                                  break L25;
                                }
                              }
                            }
                          }
                          dg.b(qb.field_m);
                          break L23;
                        }
                      } else {
                        break L23;
                      }
                    }
                  }
                }
                return;
              }
            }
          }
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = true;
    }
}
