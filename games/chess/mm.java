/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mm {
    static um field_d;
    static String field_c;
    static dd field_a;
    static String field_b;
    static String field_e;

    final static int[] a(int param0, int param1, int param2) {
        int var3 = pj.a(param1 ^ -105, param0);
        int var4 = rf.a(param0, 255);
        int var5 = pj.a(110, param2);
        if (param1 != -1) {
            mm.a(44);
        }
        int var6 = rf.a(param2, 255);
        int var7 = (int)((long)var5 * (long)var3 >> -515171504);
        int var8 = (int)((long)var6 * (long)var3 >> -2098901744);
        int var9 = (int)((long)var4 * (long)var5 >> -541395568);
        int var10 = (int)((long)var6 * (long)var4 >> 1089228368);
        return new int[]{0, 0, 0, var6, 0, var5, var7, var4, -var8, -var9, var3, var10};
    }

    final static void a(byte param0, int param1, int[] param2, int param3, int param4, int param5, int param6, int param7, int param8) {
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
        L0: {
          var20 = Chess.field_G;
          if (0 > param1) {
            break L0;
          } else {
            if (nh.field_l > param5) {
              L1: {
                if (param7 >= 0) {
                  break L1;
                } else {
                  if (0 <= param6) {
                    break L1;
                  } else {
                    if (param3 < 0) {
                      return;
                    } else {
                      break L1;
                    }
                  }
                }
              }
              L2: {
                if (nh.field_o > param7) {
                  break L2;
                } else {
                  if (param6 < nh.field_o) {
                    break L2;
                  } else {
                    if (nh.field_o > param3) {
                      break L2;
                    } else {
                      return;
                    }
                  }
                }
              }
              L3: {
                L4: {
                  var9 = -124 / ((29 - param0) / 63);
                  var15 = -param5 + param1;
                  if (param5 != param8) {
                    break L4;
                  } else {
                    L5: {
                      L6: {
                        if (param5 != param1) {
                          break L6;
                        } else {
                          var11 = param6 << -1835568848;
                          var10 = param7 << 1891354448;
                          var12 = 0;
                          var13 = 0;
                          if (0 == 0) {
                            break L5;
                          } else {
                            break L6;
                          }
                        }
                      }
                      L7: {
                        var16 = -param8 + param1;
                        if (param7 < param6) {
                          break L7;
                        } else {
                          var12 = (param3 + -param6 << -1899758320) / var16;
                          var13 = (param3 + -param7 << -670625104) / var15;
                          var10 = param6 << 1417680848;
                          var11 = param7 << 941616944;
                          if (0 == 0) {
                            break L5;
                          } else {
                            break L7;
                          }
                        }
                      }
                      var11 = param6 << 393835696;
                      var12 = (-param7 + param3 << -1735857072) / var15;
                      var13 = (param3 + -param6 << -832026160) / var16;
                      var10 = param7 << -815219952;
                      break L5;
                    }
                    L8: {
                      if (0 > param5) {
                        param5 = Math.min(-param5, param8 - param5);
                        var11 = var11 + param5 * var13;
                        var10 = var10 + var12 * param5;
                        param5 = 0;
                        break L8;
                      } else {
                        break L8;
                      }
                    }
                    var14 = 0;
                    if (0 == 0) {
                      break L3;
                    } else {
                      break L4;
                    }
                  }
                }
                L9: {
                  L10: {
                    var11 = param7 << 1256362256;
                    var10 = param7 << 1256362256;
                    var16 = param8 + -param5;
                    var13 = (-param7 + param3 << -475307536) / var15;
                    var12 = (param6 + -param7 << 676666256) / var16;
                    if (var13 <= var12) {
                      break L10;
                    } else {
                      var14 = 0;
                      if (0 == 0) {
                        break L9;
                      } else {
                        break L10;
                      }
                    }
                  }
                  var17 = var12;
                  var12 = var13;
                  var13 = var17;
                  var14 = 1;
                  break L9;
                }
                L11: {
                  L12: {
                    if (param5 < 0) {
                      L13: {
                        if (param8 < 0) {
                          break L13;
                        } else {
                          param5 = -param5;
                          var11 = var11 + param5 * var13;
                          var10 = var10 + var12 * param5;
                          param5 = 0;
                          if (0 == 0) {
                            break L12;
                          } else {
                            break L13;
                          }
                        }
                      }
                      param5 = -param5 + param8;
                      var10 = var10 + var12 * param5;
                      var11 = var11 + param5 * var13;
                      param5 = param8;
                      if (0 == 0) {
                        break L11;
                      } else {
                        break L12;
                      }
                    } else {
                      break L12;
                    }
                  }
                  var17 = nh.field_p[param5];
                  L14: while (true) {
                    if (param8 <= param5) {
                      break L11;
                    } else {
                      L15: {
                        var18 = var10 >> -1052729488;
                        if (nh.field_o <= var18) {
                          break L15;
                        } else {
                          L16: {
                            var19 = -(var10 >> -147915408) + (var11 >> 2008817424);
                            if (var19 == 0) {
                              break L16;
                            } else {
                              L17: {
                                if (var19 + var18 < nh.field_o) {
                                  break L17;
                                } else {
                                  var19 = nh.field_o + -var18 - 1;
                                  break L17;
                                }
                              }
                              L18: {
                                if (0 > var18) {
                                  break L18;
                                } else {
                                  fk.a(0, var19, param4, param2, var17 + var18);
                                  if (0 == 0) {
                                    break L15;
                                  } else {
                                    break L18;
                                  }
                                }
                              }
                              fk.a(0, var18 + var19, param4, param2, var17);
                              if (0 == 0) {
                                break L15;
                              } else {
                                break L16;
                              }
                            }
                          }
                          if (var18 < 0) {
                            break L15;
                          } else {
                            if (var18 < nh.field_o) {
                              fk.a(0, var19, param4, param2, var17 + var18);
                              break L15;
                            } else {
                              break L15;
                            }
                          }
                        }
                      }
                      param5++;
                      if (nh.field_l > param5) {
                        var11 = var11 + var13;
                        var17 = var17 + wb.field_h;
                        var10 = var10 + var12;
                        if (0 == 0) {
                          continue L14;
                        } else {
                          break L11;
                        }
                      } else {
                        return;
                      }
                    }
                  }
                }
                L19: {
                  var17 = -param8 + param1;
                  if (var17 != 0) {
                    break L19;
                  } else {
                    var13 = 0;
                    var12 = 0;
                    if (0 == 0) {
                      break L3;
                    } else {
                      break L19;
                    }
                  }
                }
                L20: {
                  L21: {
                    if (var14 != 0) {
                      break L21;
                    } else {
                      var10 = param6 << 1483048592;
                      if (0 == 0) {
                        break L20;
                      } else {
                        break L21;
                      }
                    }
                  }
                  var11 = param6 << -1274780624;
                  break L20;
                }
                var18 = param3 << -475670800;
                var12 = (-var10 + var18) / var17;
                var13 = (-var11 + var18) / var17;
                break L3;
              }
              L22: {
                if (param5 >= 0) {
                  break L22;
                } else {
                  param5 = -param5;
                  var11 = var11 + param5 * var13;
                  var10 = var10 + var12 * param5;
                  param5 = 0;
                  break L22;
                }
              }
              var16 = nh.field_p[param5];
              if (param1 > param5) {
                L23: {
                  var17 = var10 >> -1247927312;
                  if (var17 >= nh.field_o) {
                    break L23;
                  } else {
                    L24: {
                      var18 = (var11 >> 748725584) + -(var10 >> 664197616);
                      if (var18 != 0) {
                        break L24;
                      } else {
                        if (0 > var17) {
                          break L23;
                        } else {
                          if (var17 >= nh.field_o) {
                            break L23;
                          } else {
                            fk.a(0, var18, param4, param2, var16 + var17);
                            if (0 == 0) {
                              break L23;
                            } else {
                              break L24;
                            }
                          }
                        }
                      }
                    }
                    L25: {
                      if (var17 - -var18 >= nh.field_o) {
                        var18 = -1 + (-var17 + nh.field_o);
                        break L25;
                      } else {
                        break L25;
                      }
                    }
                    L26: {
                      if (var17 >= 0) {
                        break L26;
                      } else {
                        fk.a(0, var18 + var17, param4, param2, var16);
                        if (0 == 0) {
                          break L23;
                        } else {
                          break L26;
                        }
                      }
                    }
                    fk.a(0, var18, param4, param2, var17 - -var16);
                    break L23;
                  }
                }
                param5++;
                if (nh.field_l <= param5) {
                  return;
                } else {
                  var10 = var10 + var12;
                  var16 = var16 + wb.field_h;
                  var11 = var11 + var13;
                  return;
                }
              } else {
                return;
              }
            } else {
              break L0;
            }
          }
        }
    }

    public static void a(int param0) {
        field_c = null;
        if (param0 < 118) {
            field_c = null;
        }
        field_b = null;
        field_a = null;
        field_d = null;
        field_e = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = "your friend";
        field_b = "Please try changing the following settings:  ";
        field_e = "Unpacking graphics";
    }
}
