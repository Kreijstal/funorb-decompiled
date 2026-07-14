/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rk {
    static String field_b;
    static String field_a;
    static int field_e;
    static int field_c;
    static boolean field_f;
    static String field_g;
    static String field_h;
    static String field_d;

    private final static void b(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11, int param12, int param13) {
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
        int var24 = 0;
        int var25 = 0;
        int var26 = 0;
        var14 = (param0 << 4) - param13;
        var15 = param11;
        var16 = param1;
        var17 = param2;
        var18 = param8;
        L0: while (true) {
          L1: {
            if (var18 >= param9) {
              break L1;
            } else {
              if (var16 >= param5) {
                break L1;
              } else {
                L2: {
                  var19 = (var18 << 4) - param12;
                  var20 = (var16 << param4) / param6;
                  var21 = c.field_b[var20] * param10 >> 15;
                  var22 = var18 + (var19 * var21 + 131072 >> 18);
                  if (var22 <= 639) {
                    break L2;
                  } else {
                    var22 = 639;
                    break L2;
                  }
                }
                L3: {
                  var23 = param0 + (var14 * var21 + 131072 >> 18);
                  if (var23 >= 0) {
                    break L3;
                  } else {
                    var23 = 0;
                    break L3;
                  }
                }
                L4: {
                  var24 = df.field_d[var23 * 640 + var22];
                  var25 = 64;
                  if (var25 >= 0) {
                    break L4;
                  } else {
                    var25 = -var25;
                    break L4;
                  }
                }
                var26 = (var24 & 16711935) * var25;
                var25 = (var24 & 65280) * var25;
                var24 = (var26 & 1069563840) + (var25 & 4177920);
                var26 = (var26 & -1073692672) + (var25 & 12582912);
                var26 = (var26 | var26 >>> 1) & 1077952512;
                var15++;
                df.field_d[var15] = (var24 | var26 - (var26 >>> 8)) >>> 6;
                var16 = var16 + var17;
                var17 = var17 + param3;
                var18++;
                continue L0;
              }
            }
          }
          var15 = param11;
          var16 = param1;
          var17 = param2;
          var18 = param8 - 1;
          L5: while (true) {
            L6: {
              if (var18 < param7) {
                break L6;
              } else {
                var17 = var17 - param3;
                var16 = var16 - var17;
                if (var16 < param5) {
                  L7: {
                    var19 = (var18 << 4) - param12;
                    var20 = (var16 << param4) / param6;
                    var21 = c.field_b[var20] * param10 >> 15;
                    var22 = var18 + (var19 * var21 + 131072 >> 18);
                    if (var22 >= 0) {
                      break L7;
                    } else {
                      var22 = 0;
                      break L7;
                    }
                  }
                  L8: {
                    var23 = param0 + (var14 * var21 + 131072 >> 18);
                    if (var23 >= 0) {
                      break L8;
                    } else {
                      var23 = 0;
                      break L8;
                    }
                  }
                  L9: {
                    var24 = df.field_d[var23 * 640 + var22];
                    var25 = 64;
                    if (var25 >= 0) {
                      break L9;
                    } else {
                      var25 = -var25;
                      break L9;
                    }
                  }
                  var26 = (var24 & 16711935) * var25;
                  var25 = (var24 & 65280) * var25;
                  var24 = (var26 & 1069563840) + (var25 & 4177920);
                  var26 = (var26 & -1073692672) + (var25 & 12582912);
                  var26 = (var26 | var26 >>> 1) & 1077952512;
                  var15--;
                  df.field_d[var15] = (var24 | var26 - (var26 >>> 8)) >>> 6;
                  var18--;
                  continue L5;
                } else {
                  break L6;
                }
              }
            }
            return;
          }
        }
    }

    final static void a(oj param0, byte param1) {
        if (!(param0 != null)) {
            return;
        }
        dk.field_v = param0;
        cm.field_h.field_W.a(false);
        cm.field_h.a(0, (km) (Object) dk.field_v);
        ac.field_e = true;
        if (param1 > -15) {
            field_g = null;
        }
    }

    private final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11, int param12, int param13) {
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
        int var24 = 0;
        int var25 = 0;
        int var26 = 0;
        var14 = (param0 << 4) - param13;
        var15 = param11;
        var16 = param1;
        var17 = param2;
        var18 = param8;
        L0: while (true) {
          L1: {
            if (var18 >= param9) {
              break L1;
            } else {
              if (var16 >= param5) {
                break L1;
              } else {
                L2: {
                  var19 = (var18 << 4) - param12;
                  var20 = (var16 << param4) / param6;
                  var21 = c.field_b[var20] * param10 >> 15;
                  var22 = var18 + (var19 * var21 + 131072 >> 18);
                  if (var22 <= 639) {
                    break L2;
                  } else {
                    var22 = 639;
                    break L2;
                  }
                }
                L3: {
                  var23 = param0 + (var14 * var21 + 131072 >> 18);
                  if (var23 <= df.field_f - 1) {
                    break L3;
                  } else {
                    var23 = df.field_f - 1;
                    break L3;
                  }
                }
                var24 = df.field_d[var23 * 640 + var22];
                var25 = 64;
                if (var25 >= 0) {
                  var26 = (var24 & 16711935) * var25;
                  var25 = (var24 & 65280) * var25;
                  var24 = (var26 & 1069563840) + (var25 & 4177920);
                  var26 = (var26 & -1073692672) + (var25 & 12582912);
                  var26 = (var26 | var26 >>> 1) & 1077952512;
                  var15++;
                  df.field_d[var15] = (var24 | var26 - (var26 >>> 8)) >>> 6;
                  var16 = var16 + var17;
                  var17 = var17 + param3;
                  var18++;
                  continue L0;
                } else {
                  throw new Error();
                }
              }
            }
          }
          var15 = param11;
          var16 = param1;
          var17 = param2;
          var18 = param8 - 1;
          L4: while (true) {
            L5: {
              if (var18 < param7) {
                break L5;
              } else {
                var17 = var17 - param3;
                var16 = var16 - var17;
                if (var16 < param5) {
                  L6: {
                    var19 = (var18 << 4) - param12;
                    var20 = (var16 << param4) / param6;
                    var21 = c.field_b[var20] * param10 >> 15;
                    var22 = var18 + (var19 * var21 + 131072 >> 18);
                    if (var22 >= 0) {
                      break L6;
                    } else {
                      var22 = 0;
                      break L6;
                    }
                  }
                  L7: {
                    var23 = param0 + (var14 * var21 + 131072 >> 18);
                    if (var23 <= df.field_f - 1) {
                      break L7;
                    } else {
                      var23 = df.field_f - 1;
                      break L7;
                    }
                  }
                  L8: {
                    var24 = df.field_d[var23 * 640 + var22];
                    var25 = 64;
                    if (var25 >= 0) {
                      break L8;
                    } else {
                      var25 = -var25;
                      break L8;
                    }
                  }
                  var26 = (var24 & 16711935) * var25;
                  var25 = (var24 & 65280) * var25;
                  var24 = (var26 & 1069563840) + (var25 & 4177920);
                  var26 = (var26 & -1073692672) + (var25 & 12582912);
                  var26 = (var26 | var26 >>> 1) & 1077952512;
                  var15--;
                  df.field_d[var15] = (var24 | var26 - (var26 >>> 8)) >>> 6;
                  var18--;
                  continue L4;
                } else {
                  break L5;
                }
              }
            }
            return;
          }
        }
    }

    private final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int[] param6, int param7, int param8, int param9, int param10, int param11, int param12, int param13) {
        int var14 = 0;
        int stackIn_16_0 = 0;
        int stackIn_19_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_18_0 = 0;
        int stackOut_17_0 = 0;
        L0: while (true) {
          if (param11 >= 0) {
            return;
          } else {
            co.field_j = hn.field_w;
            lh.field_e = ah.field_k;
            var14 = param12;
            L1: while (true) {
              if (var14 >= 0) {
                param7 = param7 + param13;
                param11++;
                u.field_s = u.field_s + param9;
                hf.field_C = hf.field_C + param10;
                continue L0;
              } else {
                L2: {
                  param1 = lh.field_e - u.field_s >> 16;
                  if (param1 >= -param2) {
                    if (param1 <= param2) {
                      param0 = co.field_j + hf.field_C >> 16;
                      if (param0 >= -param2) {
                        if (param0 <= param5 + param2) {
                          L3: {
                            if (param0 >= param2) {
                              if (param0 <= param5 - param2) {
                                stackOut_15_0 = param8;
                                stackIn_16_0 = stackOut_15_0;
                                break L3;
                              } else {
                                stackOut_14_0 = (param5 + param2 - param0) * nn.field_a >> 8;
                                stackIn_16_0 = stackOut_14_0;
                                break L3;
                              }
                            } else {
                              stackOut_12_0 = (param0 + param2) * nn.field_a >> 8;
                              stackIn_16_0 = stackOut_12_0;
                              break L3;
                            }
                          }
                          L4: {
                            param3 = stackIn_16_0;
                            param4 = param1 * param3 * ai.field_h >> 8;
                            if (param4 < 0) {
                              stackOut_18_0 = tm.field_h[param3 + param4];
                              stackIn_19_0 = stackOut_18_0;
                              break L4;
                            } else {
                              stackOut_17_0 = tm.field_h[param3 - param4];
                              stackIn_19_0 = stackOut_17_0;
                              break L4;
                            }
                          }
                          param1 = stackIn_19_0;
                          param0 = param6[param7];
                          param3 = param1 + param0;
                          param1 = (param1 & 16711935) + (param0 & 16711935);
                          param0 = (param1 & 16777472) + (param3 - param1 & 65536);
                          param6[param7] = param3 - param0 | param0 - (param0 >>> 8);
                          break L2;
                        } else {
                          break L2;
                        }
                      } else {
                        break L2;
                      }
                    } else {
                      break L2;
                    }
                  } else {
                    break L2;
                  }
                }
                var14++;
                param7++;
                co.field_j = co.field_j + param9;
                lh.field_e = lh.field_e + param10;
                continue L1;
              }
            }
          }
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int[] param6) {
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        L0: {
          var7 = param2 - param0;
          var8 = param3 - param1;
          var9 = (int)Math.sqrt((double)(var7 * var7 + var8 * var8));
          var10 = (int)(65536.0 / Math.sqrt((double)(var7 * var7 + var8 * var8)));
          var7 = var7 * var10;
          var8 = var8 * var10;
          var11 = param0;
          var12 = param1;
          var13 = param2;
          var14 = param3;
          if (var11 <= var13) {
            break L0;
          } else {
            var15 = var11;
            var11 = var13;
            var13 = var15;
            break L0;
          }
        }
        L1: {
          if (var12 <= var14) {
            break L1;
          } else {
            var15 = var12;
            var12 = var14;
            var14 = var15;
            break L1;
          }
        }
        L2: {
          var11 = var11 - param4;
          var12 = var12 - param4;
          var13 = var13 + param4;
          var14 = var14 + param4;
          if (var11 >= df.field_i) {
            break L2;
          } else {
            var11 = df.field_i;
            break L2;
          }
        }
        L3: {
          if (var12 >= df.field_g) {
            break L3;
          } else {
            var12 = df.field_g;
            break L3;
          }
        }
        L4: {
          if (var13 <= df.field_k) {
            break L4;
          } else {
            var13 = df.field_k;
            break L4;
          }
        }
        L5: {
          if (var14 <= df.field_h) {
            break L5;
          } else {
            var14 = df.field_h;
            break L5;
          }
        }
        ai.field_h = 256 / param4;
        nn.field_a = param5 * 128 / param4;
        u.field_s = (var12 - param1) * var7;
        hf.field_C = (var12 - param1) * var8;
        hn.field_w = (var11 - param0) * var7;
        ah.field_k = (var11 - param0) * var8;
        tm.field_h = param6;
        rk.a(param0, param1, param4, 0, 0, var9, df.field_d, var12 * df.field_e + var11, param5, var7, var8, var12 - var14, var11 - var13, df.field_e - (var13 - var11));
    }

    final static void a(int param0, int param1, int param2, int param3) {
        int var4 = 0;
        int var5 = 0;
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
        int var24 = 0;
        int var25 = 0;
        int var26 = 0;
        int var27 = 0;
        int var28 = 0;
        L0: {
          var4 = param2 * param2;
          var5 = param0 - param2 >> 4;
          var6 = param0 + 15 >> 4;
          var7 = param0 + param2 + 15 >> 4;
          var8 = param1 - param2 >> 4;
          var9 = param1 + 15 >> 4;
          var10 = param1 + param2 + 15 >> 4;
          if (var5 >= 0) {
            break L0;
          } else {
            var5 = 0;
            break L0;
          }
        }
        L1: {
          if (var7 <= 640) {
            break L1;
          } else {
            var7 = 640;
            break L1;
          }
        }
        L2: {
          if (var8 >= 0) {
            break L2;
          } else {
            var8 = 0;
            break L2;
          }
        }
        L3: {
          if (var10 <= df.field_f) {
            break L3;
          } else {
            var10 = df.field_f;
            break L3;
          }
        }
        L4: {
          if (var6 >= 0) {
            break L4;
          } else {
            var6 = 0;
            break L4;
          }
        }
        L5: {
          if (var6 <= 640) {
            break L5;
          } else {
            var6 = 640;
            break L5;
          }
        }
        L6: {
          if (var9 >= 0) {
            break L6;
          } else {
            var9 = 0;
            break L6;
          }
        }
        L7: {
          if (var9 <= df.field_f) {
            break L7;
          } else {
            var9 = df.field_f;
            break L7;
          }
        }
        var11 = (var6 << 4) - param0;
        var11 = var11 * var11;
        var12 = (var6 + 1 << 4) - param0;
        var12 = var12 * var12;
        var13 = (var6 + 2 << 4) - param0;
        var13 = var13 * var13;
        var14 = var12 - var11;
        var15 = var13 - var12;
        var16 = var15 - var14;
        var17 = (var9 << 4) - param1;
        var17 = var17 * var17;
        var18 = (var9 + 1 << 4) - param1;
        var18 = var18 * var18;
        var19 = (var9 + 2 << 4) - param1;
        var19 = var19 * var19;
        var20 = var18 - var17;
        var21 = var19 - var18;
        var22 = var21 - var20;
        var23 = 16;
        var24 = var4;
        L8: while (true) {
          if (var4 <= 2147483647 >>> var23) {
            var25 = var9 * 640 + var6;
            var26 = var11 + var17;
            var27 = var20;
            var28 = var9;
            L9: while (true) {
              if (var28 >= var10) {
                var25 = var9 * 640 + var6;
                var26 = var11 + var17;
                var27 = var20;
                var28 = var9 - 1;
                L10: while (true) {
                  if (var28 < var8) {
                    return;
                  } else {
                    var27 = var27 - var22;
                    var26 = var26 - var27;
                    // wide iinc 25 -640
                    rk.b(var28, var26, var14, var16, var23, var4, var24, var5, var6, var7, param3, var25, param0, param1);
                    var28--;
                    continue L10;
                  }
                }
              } else {
                rk.a(var28, var26, var14, var16, var23, var4, var24, var5, var6, var7, param3, var25, param0, param1);
                var26 = var26 + var27;
                var27 = var27 + var22;
                // wide iinc 25 640
                var28++;
                continue L9;
              }
            }
          } else {
            var23--;
            var24 = var24 + 1 >>> 1;
            continue L8;
          }
        }
    }

    public static void a(int param0) {
        field_h = null;
        field_b = null;
        field_d = null;
        field_a = null;
        field_g = null;
        if (param0 > -82) {
            field_f = false;
        }
    }

    final static void a(java.awt.Component param0, int param1) {
        param0.removeMouseListener((java.awt.event.MouseListener) (Object) pm.field_l);
        param0.removeMouseMotionListener((java.awt.event.MouseMotionListener) (Object) pm.field_l);
        param0.removeFocusListener((java.awt.event.FocusListener) (Object) pm.field_l);
        hc.field_d = 0;
        if (param1 != 4) {
            Object var3 = null;
            rk.a((oj) null, (byte) 91);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "Message game";
        field_b = "Turn duration: <%0> seconds";
        field_f = false;
        field_c = 0;
        field_g = "Not yet achieved";
        field_d = "Offensive account name";
        field_h = "Connection lost. <%0>";
    }
}
