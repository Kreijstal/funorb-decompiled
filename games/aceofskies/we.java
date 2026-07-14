/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class we {
    static of field_a;
    static int field_c;
    static String field_b;

    final static void a(int param0) {
        rh var1 = null;
        int var2 = AceOfSkies.field_G ? 1 : 0;
        um.field_m.h();
        da.field_a.h();
        ad.field_U = ad.field_U - 1;
        if (0 == ad.field_U) {
            ad.field_U = 200;
            var1 = (rh) di.field_M.d(268435455);
            while (var1 != null) {
                if (!((rh) var1).field_i.b((byte) 93)) {
                    var1.c(-128);
                }
                var1 = (rh) di.field_M.b((byte) 103);
            }
            if (!(null == ao.field_c)) {
                var1 = (rh) ao.field_c.d(268435455);
                while (var1 != null) {
                    if (!((rh) var1).field_i.b((byte) 105)) {
                        var1.c(-123);
                    }
                    var1 = (rh) ao.field_c.b((byte) 103);
                }
            }
        }
        if (param0 != 200) {
            field_c = -8;
        }
        if (null != mg.field_d) {
            if (!(mg.field_d.f(32119))) {
                dt.field_c = null;
            }
        }
    }

    public static void b(int param0) {
        if (param0 != 0) {
            field_c = -22;
        }
        field_b = null;
        field_a = null;
    }

    final static w a(String param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = AceOfSkies.field_G ? 1 : 0;
        int var2 = param0.length();
        for (var3 = 0; var3 < var2; var3++) {
            var4 = param0.charAt(var3);
            if (var4 < 48) {
                return null;
            }
            if (var4 > 57) {
                return null;
            }
        }
        if (param1 >= -108) {
            return (w) null;
        }
        return td.field_d;
    }

    final static void a(int param0, int param1, int param2, boolean param3, int param4, ll[] param5) {
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
        var22 = AceOfSkies.field_G ? 1 : 0;
        if (param5 == null) {
          return;
        } else {
          L0: {
            if (-1 <= param1) {
              break L0;
            } else {
              if (-1 < param0) {
                L1: {
                  if (param5[3] != null) {
                    stackOut_8_0 = param5[3].field_v;
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
                  if (null == param5[5]) {
                    stackOut_11_0 = 0;
                    stackIn_12_0 = stackOut_11_0;
                    break L2;
                  } else {
                    stackOut_10_0 = param5[5].field_v;
                    stackIn_12_0 = stackOut_10_0;
                    break L2;
                  }
                }
                L3: {
                  var7 = stackIn_12_0;
                  if (param5[1] != null) {
                    stackOut_14_0 = param5[1].field_q;
                    stackIn_15_0 = stackOut_14_0;
                    break L3;
                  } else {
                    stackOut_13_0 = 0;
                    stackIn_15_0 = stackOut_13_0;
                    break L3;
                  }
                }
                L4: {
                  var8 = stackIn_15_0;
                  if (null != param5[7]) {
                    stackOut_17_0 = param5[7].field_q;
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
                  var10 = param2 - -param1;
                  var11 = param0 + param4;
                  var12 = var6 + param2;
                  var13 = var10 + -var7;
                  var14 = param4 - -var8;
                  var15 = -var9 + var11;
                  var16 = var12;
                  var17 = var13;
                  if (var16 <= var17) {
                    break L5;
                  } else {
                    var17 = param1 * var6 / (var6 - -var7) + param2;
                    var16 = param1 * var6 / (var6 - -var7) + param2;
                    break L5;
                  }
                }
                L6: {
                  var18 = var14;
                  var19 = var15;
                  vp.b(jo.field_j);
                  if (var18 <= var19) {
                    break L6;
                  } else {
                    var19 = var8 * param0 / (var9 + var8) + param4;
                    var18 = var8 * param0 / (var9 + var8) + param4;
                    break L6;
                  }
                }
                L7: {
                  if (param5[0] != null) {
                    vp.a(param2, param4, var16, var18);
                    param5[0].b(param2, param4);
                    vp.a(jo.field_j);
                    break L7;
                  } else {
                    break L7;
                  }
                }
                L8: {
                  if (param5[2] != null) {
                    vp.a(var17, param4, var10, var18);
                    param5[2].b(var13, param4);
                    vp.a(jo.field_j);
                    break L8;
                  } else {
                    break L8;
                  }
                }
                L9: {
                  if (param5[6] != null) {
                    vp.a(param2, var19, var16, var11);
                    param5[6].b(param2, var15);
                    vp.a(jo.field_j);
                    break L9;
                  } else {
                    break L9;
                  }
                }
                L10: {
                  if (param5[8] == null) {
                    break L10;
                  } else {
                    vp.a(var17, var19, var10, var11);
                    param5[8].b(var13, var15);
                    vp.a(jo.field_j);
                    break L10;
                  }
                }
                L11: {
                  if (param5[1] == null) {
                    break L11;
                  } else {
                    if (0 == param5[1].field_v) {
                      break L11;
                    } else {
                      vp.a(var16, param4, var17, var18);
                      var20 = var12;
                      L12: while (true) {
                        L13: {
                          if (var20 >= var13) {
                            break L13;
                          } else {
                            param5[1].b(var20, param4);
                            var20 = var20 + param5[1].field_v;
                            if (0 == 0) {
                              continue L12;
                            } else {
                              break L13;
                            }
                          }
                        }
                        vp.a(jo.field_j);
                        break L11;
                      }
                    }
                  }
                }
                L14: {
                  if (param5[7] == null) {
                    break L14;
                  } else {
                    if (param5[7].field_v != 0) {
                      vp.a(var16, var19, var17, var11);
                      var20 = var12;
                      L15: while (true) {
                        L16: {
                          if (var20 >= var13) {
                            break L16;
                          } else {
                            param5[7].b(var20, var15);
                            var20 = var20 + param5[7].field_v;
                            if (0 == 0) {
                              continue L15;
                            } else {
                              break L16;
                            }
                          }
                        }
                        vp.a(jo.field_j);
                        break L14;
                      }
                    } else {
                      break L14;
                    }
                  }
                }
                L17: {
                  if (null == param5[3]) {
                    break L17;
                  } else {
                    if (-1 != (param5[3].field_q ^ -1)) {
                      vp.a(param2, var18, var16, var19);
                      var20 = var14;
                      L18: while (true) {
                        L19: {
                          if (var20 >= var15) {
                            break L19;
                          } else {
                            param5[3].b(param2, var20);
                            var20 = var20 + param5[3].field_q;
                            if (0 == 0) {
                              continue L18;
                            } else {
                              break L19;
                            }
                          }
                        }
                        vp.a(jo.field_j);
                        break L17;
                      }
                    } else {
                      break L17;
                    }
                  }
                }
                L20: {
                  if (null == param5[5]) {
                    break L20;
                  } else {
                    if (-1 != (param5[5].field_q ^ -1)) {
                      vp.a(var17, var18, var10, var19);
                      var20 = var14;
                      L21: while (true) {
                        L22: {
                          if (var20 >= var15) {
                            break L22;
                          } else {
                            param5[5].b(var13, var20);
                            var20 = var20 + param5[5].field_q;
                            if (0 == 0) {
                              continue L21;
                            } else {
                              break L22;
                            }
                          }
                        }
                        vp.a(jo.field_j);
                        break L20;
                      }
                    } else {
                      break L20;
                    }
                  }
                }
                L23: {
                  if (param5[4] == null) {
                    break L23;
                  } else {
                    if (-1 == param5[4].field_v) {
                      break L23;
                    } else {
                      if (-1 == param5[4].field_q) {
                        break L23;
                      } else {
                        vp.a(var16, var18, var17, var19);
                        var20 = var14;
                        L24: while (true) {
                          L25: {
                            if (var20 >= var15) {
                              break L25;
                            } else {
                              var21 = var12;
                              L26: while (true) {
                                L27: {
                                  if (var21 >= var13) {
                                    break L27;
                                  } else {
                                    param5[4].b(var21, var20);
                                    var21 = var21 + param5[4].field_v;
                                    if (0 == 0) {
                                      continue L26;
                                    } else {
                                      break L27;
                                    }
                                  }
                                }
                                var20 = var20 + param5[4].field_q;
                                if (0 == 0) {
                                  continue L24;
                                } else {
                                  break L25;
                                }
                              }
                            }
                          }
                          vp.a(jo.field_j);
                          break L23;
                        }
                      }
                    }
                  }
                }
                L28: {
                  if (!param3) {
                    break L28;
                  } else {
                    field_a = (of) null;
                    break L28;
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

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = new of();
        field_b = "By clicking Create, you agree to the <%0><hotspot=0>Terms of Use</hotspot><%1> and <%0><hotspot=1>Privacy Policy</hotspot><%1>.";
        field_c = -1;
    }
}
