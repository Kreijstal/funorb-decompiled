/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nh extends bb {
    static bh field_p;
    static String field_o;
    static int field_n;
    static String field_q;

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11, int param12, int[] param13, int param14, int param15, int param16) {
        int var17_int = 0;
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
        int var29 = 0;
        int var30 = 0;
        int var31 = 0;
        int var32 = 0;
        int var33 = 0;
        int var34 = 0;
        int var35 = 0;
        int var36 = 0;
        int var37 = 0;
        int var38 = 0;
        int var39 = 0;
        int var40 = 0;
        int var41 = 0;
        int var42 = 0;
        L0: {
          var42 = wizardrun.field_H;
          if (param7 < 0) {
            break L0;
          } else {
            if (cj.field_d > param3) {
              L1: {
                if (param9 >= 0) {
                  break L1;
                } else {
                  if (0 <= param15) {
                    break L1;
                  } else {
                    if (0 <= param11) {
                      break L1;
                    } else {
                      return;
                    }
                  }
                }
              }
              L2: {
                if (param9 < cj.field_b) {
                  break L2;
                } else {
                  if (param15 < cj.field_b) {
                    break L2;
                  } else {
                    if (cj.field_b <= param11) {
                      return;
                    } else {
                      break L2;
                    }
                  }
                }
              }
              L3: {
                if (param12 <= -119) {
                  break L3;
                } else {
                  field_q = null;
                  break L3;
                }
              }
              L4: {
                var34 = -param3 + param7;
                if (param0 != param3) {
                  L5: {
                    var26 = param8 << 16;
                    var25 = param8 << 16;
                    var22 = param6 << 16;
                    var21 = param6 << 16;
                    var18 = param9 << 16;
                    var17_int = param9 << 16;
                    var30 = param14 << 16;
                    var29 = param14 << 16;
                    var35 = param0 + -param3;
                    var19 = (param15 - param9 << 16) / var35;
                    var20 = (param11 - param9 << 16) / var34;
                    if (var19 >= var20) {
                      var36 = var19;
                      var19 = var20;
                      var20 = var36;
                      var24 = (-param6 + param10 << 16) / var35;
                      var27 = (param1 - param8 << 16) / var34;
                      var33 = 1;
                      var31 = (param2 + -param14 << 16) / var34;
                      var23 = (param16 + -param6 << 16) / var34;
                      var28 = (-param8 + param4 << 16) / var35;
                      var32 = (-param14 + param5 << 16) / var35;
                      break L5;
                    } else {
                      var27 = (param4 - param8 << 16) / var35;
                      var33 = 0;
                      var23 = (param10 - param6 << 16) / var35;
                      var32 = (param2 + -param14 << 16) / var34;
                      var28 = (param1 - param8 << 16) / var34;
                      var24 = (param16 - param6 << 16) / var34;
                      var31 = (param5 + -param14 << 16) / var35;
                      break L5;
                    }
                  }
                  L6: {
                    L7: {
                      if (0 > param3) {
                        if (0 <= param0) {
                          param3 = -param3;
                          var21 = var21 + param3 * var23;
                          var26 = var26 + var28 * param3;
                          var30 = var30 + param3 * var32;
                          var18 = var18 + var20 * param3;
                          var25 = var25 + param3 * var27;
                          var17_int = var17_int + param3 * var19;
                          var22 = var22 + var24 * param3;
                          var29 = var29 + var31 * param3;
                          param3 = 0;
                          break L7;
                        } else {
                          param3 = -param3 + param0;
                          var21 = var21 + param3 * var23;
                          var17_int = var17_int + param3 * var19;
                          var18 = var18 + var20 * param3;
                          var30 = var30 + var32 * param3;
                          var29 = var29 + var31 * param3;
                          var25 = var25 + var27 * param3;
                          var22 = var22 + var24 * param3;
                          var26 = var26 + param3 * var28;
                          param3 = param0;
                          break L6;
                        }
                      } else {
                        break L7;
                      }
                    }
                    var36 = cj.field_a[param3];
                    L8: while (true) {
                      if (param3 >= param0) {
                        break L6;
                      } else {
                        L9: {
                          var37 = var17_int >> 16;
                          if (var37 < cj.field_b) {
                            var38 = (var18 >> 16) + -(var17_int >> 16);
                            if (var38 != 0) {
                              L10: {
                                var39 = (-var21 + var22) / var38;
                                var40 = (var26 - var25) / var38;
                                var41 = (-var29 + var30) / var38;
                                if (var37 + var38 >= cj.field_b) {
                                  var38 = cj.field_b - (var37 - -1);
                                  break L10;
                                } else {
                                  break L10;
                                }
                              }
                              if (var37 < 0) {
                                uk.a(var38 + var37, var39, var41, var21 + -(var37 * var39), var36, var40, param13, true, var25 + -(var40 * var37), var29 + -(var41 * var37));
                                break L9;
                              } else {
                                uk.a(var38, var39, var41, var21, var37 - -var36, var40, param13, true, var25, var29);
                                break L9;
                              }
                            } else {
                              if (var37 < 0) {
                                break L9;
                              } else {
                                if (cj.field_b > var37) {
                                  uk.a(var38, 0, 0, var21, var37 + var36, 0, param13, true, var25, var29);
                                  break L9;
                                } else {
                                  break L9;
                                }
                              }
                            }
                          } else {
                            break L9;
                          }
                        }
                        param3++;
                        if (param3 >= cj.field_d) {
                          return;
                        } else {
                          var21 = var21 + var23;
                          var17_int = var17_int + var19;
                          var30 = var30 + var32;
                          var29 = var29 + var31;
                          var36 = var36 + ed.field_h;
                          var26 = var26 + var28;
                          var22 = var22 + var24;
                          var18 = var18 + var20;
                          var25 = var25 + var27;
                          continue L8;
                        }
                      }
                    }
                  }
                  var36 = -param0 + param7;
                  if (var36 == 0) {
                    var23 = 0;
                    var20 = 0;
                    var27 = 0;
                    var31 = 0;
                    var19 = 0;
                    var32 = 0;
                    var24 = 0;
                    var28 = 0;
                    break L4;
                  } else {
                    L11: {
                      var37 = param11 << 16;
                      var38 = param16 << 16;
                      var39 = param1 << 16;
                      var40 = param2 << 16;
                      if (var33 == 0) {
                        var17_int = param15 << 16;
                        var25 = param4 << 16;
                        var29 = param5 << 16;
                        var21 = param10 << 16;
                        break L11;
                      } else {
                        var26 = param4 << 16;
                        var30 = param5 << 16;
                        var18 = param15 << 16;
                        var22 = param10 << 16;
                        break L11;
                      }
                    }
                    var23 = (-var21 + var38) / var36;
                    var28 = (var39 - var26) / var36;
                    var31 = (var40 - var29) / var36;
                    var20 = (var37 - var18) / var36;
                    var32 = (var40 + -var30) / var36;
                    var19 = (-var17_int + var37) / var36;
                    var24 = (var38 + -var22) / var36;
                    var27 = (var39 + -var25) / var36;
                    break L4;
                  }
                } else {
                  L12: {
                    if (param7 == param3) {
                      var18 = param15 << 16;
                      var28 = 0;
                      var17_int = param9 << 16;
                      var20 = 0;
                      var30 = param5;
                      var29 = param14;
                      var26 = param4;
                      var22 = param10;
                      var23 = 0;
                      var32 = 0;
                      var24 = 0;
                      var27 = 0;
                      var31 = 0;
                      var19 = 0;
                      var21 = param6;
                      var25 = param8;
                      break L12;
                    } else {
                      var35 = -param0 + param7;
                      if (param9 >= param15) {
                        var20 = (param11 - param9 << 16) / var34;
                        var17_int = param15 << 16;
                        var26 = param8 << 16;
                        var30 = param14 << 16;
                        var21 = param10 << 16;
                        var32 = (-param14 + param2 << 16) / var34;
                        var27 = (-param4 + param1 << 16) / var35;
                        var29 = param5 << 16;
                        var18 = param9 << 16;
                        var24 = (-param6 + param16 << 16) / var34;
                        var28 = (param1 - param8 << 16) / var34;
                        var31 = (-param5 + param2 << 16) / var35;
                        var23 = (-param10 + param16 << 16) / var35;
                        var25 = param4 << 16;
                        var19 = (param11 - param15 << 16) / var35;
                        var22 = param6 << 16;
                        break L12;
                      } else {
                        var32 = (-param5 + param2 << 16) / var35;
                        var28 = (param1 - param4 << 16) / var35;
                        var20 = (-param15 + param11 << 16) / var35;
                        var30 = param5 << 16;
                        var27 = (param1 - param8 << 16) / var34;
                        var24 = (param16 + -param10 << 16) / var35;
                        var19 = (param11 - param9 << 16) / var34;
                        var18 = param15 << 16;
                        var26 = param4 << 16;
                        var25 = param8 << 16;
                        var31 = (-param14 + param2 << 16) / var34;
                        var23 = (-param6 + param16 << 16) / var34;
                        var29 = param14 << 16;
                        var22 = param10 << 16;
                        var17_int = param9 << 16;
                        var21 = param6 << 16;
                        break L12;
                      }
                    }
                  }
                  L13: {
                    if (0 <= param3) {
                      break L13;
                    } else {
                      param3 = Math.min(-param3, -param3 + param0);
                      var26 = var26 + param3 * var28;
                      var30 = var30 + var32 * param3;
                      var18 = var18 + param3 * var20;
                      var25 = var25 + param3 * var27;
                      var21 = var21 + var23 * param3;
                      var29 = var29 + var31 * param3;
                      var22 = var22 + param3 * var24;
                      var17_int = var17_int + param3 * var19;
                      param3 = 0;
                      break L13;
                    }
                  }
                  var33 = 0;
                  break L4;
                }
              }
              L14: {
                if (0 > param3) {
                  param3 = -param3;
                  var26 = var26 + var28 * param3;
                  var30 = var30 + param3 * var32;
                  var18 = var18 + var20 * param3;
                  var21 = var21 + var23 * param3;
                  var22 = var22 + var24 * param3;
                  var29 = var29 + param3 * var31;
                  var25 = var25 + var27 * param3;
                  var17_int = var17_int + var19 * param3;
                  param3 = 0;
                  break L14;
                } else {
                  break L14;
                }
              }
              var35 = cj.field_a[param3];
              L15: while (true) {
                if (param7 <= param3) {
                  return;
                } else {
                  L16: {
                    var36 = var17_int >> 16;
                    if (var36 < cj.field_b) {
                      var37 = (var18 >> 16) + -(var17_int >> 16);
                      if (0 != var37) {
                        L17: {
                          var38 = (-var21 + var22) / var37;
                          var39 = (-var25 + var26) / var37;
                          var40 = (var30 + -var29) / var37;
                          if (var37 + var36 >= cj.field_b) {
                            var37 = cj.field_b + (-var36 + -1);
                            break L17;
                          } else {
                            break L17;
                          }
                        }
                        if (0 <= var36) {
                          uk.a(var37, var38, var40, var21, var35 + var36, var39, param13, true, var25, var29);
                          break L16;
                        } else {
                          uk.a(var36 + var37, var38, var40, -(var36 * var38) + var21, var35, var39, param13, true, var25 - var36 * var39, -(var36 * var40) + var29);
                          break L16;
                        }
                      } else {
                        if (0 > var36) {
                          break L16;
                        } else {
                          if (var36 < cj.field_b) {
                            uk.a(var37, 0, 0, var21, var35 + var36, 0, param13, true, var25, var29);
                            break L16;
                          } else {
                            break L16;
                          }
                        }
                      }
                    } else {
                      break L16;
                    }
                  }
                  param3++;
                  if (param3 >= cj.field_d) {
                    return;
                  } else {
                    var30 = var30 + var32;
                    var17_int = var17_int + var19;
                    var25 = var25 + var27;
                    var35 = var35 + ed.field_h;
                    var21 = var21 + var23;
                    var26 = var26 + var28;
                    var29 = var29 + var31;
                    var22 = var22 + var24;
                    var18 = var18 + var20;
                    continue L15;
                  }
                }
              }
            } else {
              break L0;
            }
          }
        }
    }

    nh(long param0, String param1) {
        super(param0, param1);
    }

    final static bh a(int param0, int param1) {
        bh[] var2 = null;
        int var3 = 0;
        int var4 = 0;
        bh[] var5 = null;
        var4 = wizardrun.field_H;
        var5 = od.b(109);
        var2 = var5;
        var3 = 0;
        L0: while (true) {
          if (var3 < var5.length) {
            if (param1 != var5[var3].field_h) {
              var3++;
              continue L0;
            } else {
              return var5[var3];
            }
          } else {
            return null;
          }
        }
    }

    final sd a(boolean param0) {
        if (!param0) {
            field_q = null;
        }
        return pc.field_m;
    }

    final static void c(byte param0) {
        gj.field_b = 0;
        ag.field_u = -1;
        vb.field_I = null;
        uc.field_a = -1;
        ol.field_b = false;
        int var1 = -71;
    }

    final static void a(byte param0, int param1, int param2, int param3, int param4) {
        RuntimeException var5 = null;
        int var5_int = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int stackIn_4_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_13_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_11_0 = 0;
        var13 = wizardrun.field_H;
        try {
          L0: {
            L1: {
              var5_int = param1 + param4;
              var6 = param3 + param2;
              if (ed.field_c < param4) {
                stackOut_3_0 = param4;
                stackIn_4_0 = stackOut_3_0;
                break L1;
              } else {
                stackOut_2_0 = ed.field_c;
                stackIn_4_0 = stackOut_2_0;
                break L1;
              }
            }
            L2: {
              var7 = stackIn_4_0;
              if (param2 > ed.field_i) {
                stackOut_6_0 = param2;
                stackIn_7_0 = stackOut_6_0;
                break L2;
              } else {
                stackOut_5_0 = ed.field_i;
                stackIn_7_0 = stackOut_5_0;
                break L2;
              }
            }
            L3: {
              var8 = stackIn_7_0;
              if (ed.field_l > var5_int) {
                stackOut_9_0 = var5_int;
                stackIn_10_0 = stackOut_9_0;
                break L3;
              } else {
                stackOut_8_0 = ed.field_l;
                stackIn_10_0 = stackOut_8_0;
                break L3;
              }
            }
            L4: {
              var9 = stackIn_10_0;
              if (var6 >= ed.field_b) {
                stackOut_12_0 = ed.field_b;
                stackIn_13_0 = stackOut_12_0;
                break L4;
              } else {
                stackOut_11_0 = var6;
                stackIn_13_0 = stackOut_11_0;
                break L4;
              }
            }
            L5: {
              var10 = stackIn_13_0;
              if (ed.field_c > param4) {
                break L5;
              } else {
                if (ed.field_l > param4) {
                  var11 = param4 + ed.field_h * var8;
                  var12 = 1 - (-var10 - -var8) >> 1;
                  L6: while (true) {
                    var12--;
                    if (var12 < 0) {
                      break L5;
                    } else {
                      ed.field_k[var11] = 16777215;
                      var11 = var11 + ed.field_h * 2;
                      continue L6;
                    }
                  }
                } else {
                  break L5;
                }
              }
            }
            L7: {
              if (ed.field_i > param2) {
                break L7;
              } else {
                if (ed.field_b > var6) {
                  var11 = param2 * ed.field_h - -var7;
                  var12 = -var7 + (var9 + 1) >> 1;
                  L8: while (true) {
                    var12--;
                    if (var12 < 0) {
                      break L7;
                    } else {
                      ed.field_k[var11] = 16777215;
                      var11 += 2;
                      continue L8;
                    }
                  }
                } else {
                  break L7;
                }
              }
            }
            L9: {
              if (var5_int < ed.field_c) {
                break L9;
              } else {
                if (var5_int < ed.field_l) {
                  var11 = ed.field_h * (var8 - -(var5_int - param4 & 1)) + var5_int;
                  var12 = var10 + 1 - var8 >> 1;
                  L10: while (true) {
                    var12--;
                    if (var12 < 0) {
                      break L9;
                    } else {
                      ed.field_k[var11] = 16777215;
                      var11 = var11 + ed.field_h * 2;
                      continue L10;
                    }
                  }
                } else {
                  break L9;
                }
              }
            }
            L11: {
              if (param2 < ed.field_i) {
                break L11;
              } else {
                if (var6 < ed.field_b) {
                  var11 = var7 + (var6 * ed.field_h - -(1 & var6 + -param2));
                  var12 = -var7 + var9 + 1 >> 1;
                  L12: while (true) {
                    var12--;
                    if (0 > var12) {
                      break L11;
                    } else {
                      ed.field_k[var11] = 16777215;
                      var11 += 2;
                      continue L12;
                    }
                  }
                } else {
                  break L11;
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          throw bd.a((Throwable) (Object) var5, "nh.B(" + 69 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    public static void d(byte param0) {
        field_p = null;
        field_o = null;
        field_q = null;
        int var1 = -3;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_o = "Waiting for extra data";
        field_p = new bh(0, 2, 2, 1);
        field_q = "achievements to collect";
    }
}
