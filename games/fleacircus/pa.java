/*
 * Decompiled by CFR-JS 0.4.0.
 */
class pa extends lh {
    static int field_o;
    long field_j;
    static dd field_n;
    static rh field_l;
    static String field_k;
    static String[] field_i;
    pa field_p;
    pa field_m;

    final static void a(int param0) {
        RuntimeException var1 = null;
        int var1_int = 0;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        RuntimeException decompiledCaughtException = null;
        var5 = fleas.field_A ? 1 : 0;
        try {
          L0: {
            L1: {
              L2: {
                if (0 != fleas.field_E) {
                  break L2;
                } else {
                  if (fl.field_f) {
                    L3: {
                      var3 = 1;
                      var4 = (int)(32.0 * ma.a((double)ni.field_j / 50.0, 73));
                      if (tj.field_a == 0) {
                        ej.field_a[0].field_l = 380;
                        ej.field_a[0].field_a = 30;
                        ej.field_a[0].c(103);
                        break L3;
                      } else {
                        break L3;
                      }
                    }
                    L4: {
                      if (tj.field_a != 1) {
                        break L4;
                      } else {
                        ej.field_a[1].field_l = 70;
                        ej.field_a[1].field_a = 140;
                        ej.field_a[1].c(51);
                        break L4;
                      }
                    }
                    L5: {
                      if (tj.field_a != 2) {
                        break L5;
                      } else {
                        ej.field_a[2].field_l = 380;
                        ej.field_a[2].field_a = 30;
                        ej.field_a[2].c(95);
                        var2 = 20;
                        var1_int = 4;
                        if (fl.field_c[var2][var1_int] == 0) {
                          break L5;
                        } else {
                          var3 = 3;
                          ea.a(var4, (byte) -101, var1_int, var3, var3, var2);
                          break L5;
                        }
                      }
                    }
                    L6: {
                      if (tj.field_a != 3) {
                        break L6;
                      } else {
                        ej.field_a[3].field_a = 27;
                        ej.field_a[3].field_l = 133;
                        ej.field_a[3].c(-93);
                        break L6;
                      }
                    }
                    L7: {
                      if (tj.field_a != 4) {
                        break L7;
                      } else {
                        ej.field_a[4].field_a = 150;
                        ej.field_a[4].field_l = 30;
                        var2 = 18;
                        var1_int = 13;
                        ej.field_a[4].c(75);
                        ea.a(var4, (byte) 77, var1_int, 1, 1, var2);
                        var2 = 19;
                        L8: while (true) {
                          if (var2 >= 33) {
                            var2 = 17;
                            L9: while (true) {
                              if (var2 <= 0) {
                                var1_int = 4;
                                var2 = 19;
                                ea.a(var4, (byte) -91, var1_int, 1, 1, var2);
                                var2 = 20;
                                L10: while (true) {
                                  if (39 <= var2) {
                                    break L7;
                                  } else {
                                    pl.a(var1_int, -67, var2);
                                    var2++;
                                    continue L10;
                                  }
                                }
                              } else {
                                nl.a(var1_int, -4, var2);
                                var2--;
                                continue L9;
                              }
                            }
                          } else {
                            pl.a(var1_int, -67, var2);
                            var2++;
                            continue L8;
                          }
                        }
                      }
                    }
                    L11: {
                      if (tj.field_a != 5) {
                        break L11;
                      } else {
                        ej.field_a[5].field_a = 210;
                        ej.field_a[5].field_l = 210;
                        var2 = 12;
                        var1_int = 19;
                        ej.field_a[5].c(118);
                        ea.a(var4, (byte) -124, var1_int, 1, 1, var2);
                        break L11;
                      }
                    }
                    L12: {
                      if (6 != tj.field_a) {
                        break L12;
                      } else {
                        ej.field_a[6].field_a = 150;
                        ej.field_a[6].field_l = 200;
                        ej.field_a[6].c(-101);
                        var1_int = 13;
                        var2 = 11;
                        ea.a(var4, (byte) 112, var1_int, 3, 1, var2);
                        break L12;
                      }
                    }
                    L13: {
                      if (7 != tj.field_a) {
                        break L13;
                      } else {
                        ej.field_a[7].field_a = 150;
                        ej.field_a[7].field_l = 280;
                        var1_int = 2;
                        var2 = 7;
                        ej.field_a[7].c(-97);
                        ea.a(var4, (byte) 92, var1_int, 18, 1, var2);
                        break L13;
                      }
                    }
                    if (tj.field_a == 9) {
                      ej.field_a[9].field_a = 120;
                      ej.field_a[9].field_l = 200;
                      var1_int = 4;
                      var2 = 17;
                      ej.field_a[9].c(94);
                      ea.a(var4, (byte) -90, var1_int, 2, 1, var2);
                      var2 = 24;
                      var1_int = 4;
                      ea.a(var4, (byte) 24, var1_int, 2, 1, var2);
                      var2 = 30;
                      var1_int = 9;
                      ea.a(var4, (byte) 41, var1_int, 2, 1, var2);
                      break L2;
                    } else {
                      break L1;
                    }
                  } else {
                    break L1;
                  }
                }
              }
              break L1;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw pf.a((Throwable) (Object) var1, "pa.M(" + 111 + 41);
        }
    }

    final static void a(boolean param0, dd param1) {
        try {
            dl.field_s = param1;
        } catch (RuntimeException runtimeException) {
            throw pf.a((Throwable) (Object) runtimeException, "pa.L(" + 0 + 44 + (param1 != null ? "{...}" : "null") + 41);
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, int[] param11, int param12, int param13, int param14, int param15, int param16) {
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
          var42 = fleas.field_A ? 1 : 0;
          if (0 > param14) {
            break L0;
          } else {
            if (bl.field_i > param7) {
              L1: {
                if (0 <= param4) {
                  break L1;
                } else {
                  if (param6 >= 0) {
                    break L1;
                  } else {
                    if (param2 < 0) {
                      return;
                    } else {
                      break L1;
                    }
                  }
                }
              }
              L2: {
                if (param4 < bl.field_f) {
                  break L2;
                } else {
                  if (bl.field_f > param6) {
                    break L2;
                  } else {
                    if (bl.field_f <= param2) {
                      return;
                    } else {
                      break L2;
                    }
                  }
                }
              }
              L3: {
                var34 = -param7 + param14;
                if (param1 != param7) {
                  L4: {
                    var22 = param10 << 16;
                    var21 = param10 << 16;
                    var18 = param4 << 16;
                    var17_int = param4 << 16;
                    var26 = param3 << 16;
                    var25 = param3 << 16;
                    var30 = param8 << 16;
                    var29 = param8 << 16;
                    var35 = -param7 + param1;
                    var19 = (param6 + -param4 << 16) / var35;
                    var20 = (param2 + -param4 << 16) / var34;
                    if (var19 >= var20) {
                      var27 = (-param3 + param5 << 16) / var34;
                      var36 = var19;
                      var19 = var20;
                      var20 = var36;
                      var28 = (-param3 + param9 << 16) / var35;
                      var31 = (param12 - param8 << 16) / var34;
                      var24 = (-param10 + param13 << 16) / var35;
                      var23 = (-param10 + param16 << 16) / var34;
                      var33 = 1;
                      var32 = (-param8 + param0 << 16) / var35;
                      break L4;
                    } else {
                      var24 = (-param10 + param16 << 16) / var34;
                      var27 = (param9 + -param3 << 16) / var35;
                      var33 = 0;
                      var28 = (param5 - param3 << 16) / var34;
                      var32 = (-param8 + param12 << 16) / var34;
                      var31 = (-param8 + param0 << 16) / var35;
                      var23 = (param13 - param10 << 16) / var35;
                      break L4;
                    }
                  }
                  L5: {
                    L6: {
                      if (0 > param7) {
                        if (param1 >= 0) {
                          param7 = -param7;
                          var17_int = var17_int + var19 * param7;
                          var21 = var21 + var23 * param7;
                          var25 = var25 + var27 * param7;
                          var26 = var26 + var28 * param7;
                          var29 = var29 + var31 * param7;
                          var18 = var18 + var20 * param7;
                          var30 = var30 + var32 * param7;
                          var22 = var22 + param7 * var24;
                          param7 = 0;
                          break L6;
                        } else {
                          param7 = -param7 + param1;
                          var26 = var26 + param7 * var28;
                          var25 = var25 + var27 * param7;
                          var30 = var30 + param7 * var32;
                          var29 = var29 + var31 * param7;
                          var18 = var18 + param7 * var20;
                          var21 = var21 + param7 * var23;
                          var17_int = var17_int + param7 * var19;
                          var22 = var22 + param7 * var24;
                          param7 = param1;
                          break L5;
                        }
                      } else {
                        break L6;
                      }
                    }
                    var36 = bl.field_b[param7];
                    L7: while (true) {
                      if (param7 >= param1) {
                        break L5;
                      } else {
                        L8: {
                          var37 = var17_int >> 16;
                          if (var37 >= bl.field_f) {
                            break L8;
                          } else {
                            var38 = -(var17_int >> 16) + (var18 >> 16);
                            if (var38 != 0) {
                              L9: {
                                var39 = (var22 - var21) / var38;
                                var40 = (var26 - var25) / var38;
                                var41 = (-var29 + var30) / var38;
                                if (var37 - -var38 >= bl.field_f) {
                                  var38 = -var37 + bl.field_f - 1;
                                  break L9;
                                } else {
                                  break L9;
                                }
                              }
                              if (var37 >= 0) {
                                ue.a(var37 + var36, var41, var21, var29, var38, (byte) -117, var25, var40, var39, param11);
                                break L8;
                              } else {
                                ue.a(var36, var41, -(var37 * var39) + var21, -(var37 * var41) + var29, var37 + var38, (byte) -117, -(var40 * var37) + var25, var40, var39, param11);
                                break L8;
                              }
                            } else {
                              if (var37 < 0) {
                                break L8;
                              } else {
                                if (bl.field_f > var37) {
                                  ue.a(var36 + var37, 0, var21, var29, var38, (byte) -117, var25, 0, 0, param11);
                                  break L8;
                                } else {
                                  break L8;
                                }
                              }
                            }
                          }
                        }
                        param7++;
                        if (bl.field_i <= param7) {
                          return;
                        } else {
                          var21 = var21 + var23;
                          var17_int = var17_int + var19;
                          var26 = var26 + var28;
                          var30 = var30 + var32;
                          var22 = var22 + var24;
                          var18 = var18 + var20;
                          var25 = var25 + var27;
                          var29 = var29 + var31;
                          var36 = var36 + gb.field_d;
                          continue L7;
                        }
                      }
                    }
                  }
                  var36 = param14 + -param1;
                  if (var36 != 0) {
                    L10: {
                      var37 = param2 << 16;
                      var38 = param16 << 16;
                      var39 = param5 << 16;
                      var40 = param12 << 16;
                      if (var33 == 0) {
                        var17_int = param6 << 16;
                        var29 = param0 << 16;
                        var21 = param13 << 16;
                        var25 = param9 << 16;
                        break L10;
                      } else {
                        var22 = param13 << 16;
                        var26 = param9 << 16;
                        var18 = param6 << 16;
                        var30 = param0 << 16;
                        break L10;
                      }
                    }
                    var20 = (var37 - var18) / var36;
                    var28 = (-var26 + var39) / var36;
                    var27 = (-var25 + var39) / var36;
                    var19 = (-var17_int + var37) / var36;
                    var31 = (-var29 + var40) / var36;
                    var24 = (-var22 + var38) / var36;
                    var32 = (-var30 + var40) / var36;
                    var23 = (-var21 + var38) / var36;
                    break L3;
                  } else {
                    var27 = 0;
                    var32 = 0;
                    var24 = 0;
                    var31 = 0;
                    var23 = 0;
                    var19 = 0;
                    var20 = 0;
                    var28 = 0;
                    break L3;
                  }
                } else {
                  L11: {
                    if (param14 == param7) {
                      var26 = param9;
                      var29 = param8;
                      var23 = 0;
                      var21 = param10;
                      var24 = 0;
                      var22 = param13;
                      var17_int = param4 << 16;
                      var32 = 0;
                      var19 = 0;
                      var28 = 0;
                      var25 = param3;
                      var20 = 0;
                      var27 = 0;
                      var30 = param0;
                      var31 = 0;
                      var18 = param6 << 16;
                      break L11;
                    } else {
                      var35 = -param1 + param14;
                      if (param4 < param6) {
                        var17_int = param4 << 16;
                        var27 = (param5 - param3 << 16) / var34;
                        var28 = (param5 - param9 << 16) / var35;
                        var24 = (-param13 + param16 << 16) / var35;
                        var31 = (param12 + -param8 << 16) / var34;
                        var19 = (param2 - param4 << 16) / var34;
                        var23 = (-param10 + param16 << 16) / var34;
                        var30 = param0 << 16;
                        var25 = param3 << 16;
                        var21 = param10 << 16;
                        var26 = param9 << 16;
                        var22 = param13 << 16;
                        var32 = (param12 - param0 << 16) / var35;
                        var18 = param6 << 16;
                        var29 = param8 << 16;
                        var20 = (-param6 + param2 << 16) / var35;
                        break L11;
                      } else {
                        var23 = (-param13 + param16 << 16) / var35;
                        var30 = param8 << 16;
                        var17_int = param6 << 16;
                        var22 = param10 << 16;
                        var19 = (param2 - param6 << 16) / var35;
                        var32 = (param12 - param8 << 16) / var34;
                        var21 = param13 << 16;
                        var20 = (-param4 + param2 << 16) / var34;
                        var31 = (-param0 + param12 << 16) / var35;
                        var29 = param0 << 16;
                        var24 = (-param10 + param16 << 16) / var34;
                        var25 = param9 << 16;
                        var28 = (-param3 + param5 << 16) / var34;
                        var18 = param4 << 16;
                        var26 = param3 << 16;
                        var27 = (-param9 + param5 << 16) / var35;
                        break L11;
                      }
                    }
                  }
                  L12: {
                    if (param7 >= 0) {
                      break L12;
                    } else {
                      param7 = Math.min(-param7, -param7 + param1);
                      var30 = var30 + param7 * var32;
                      var22 = var22 + param7 * var24;
                      var21 = var21 + param7 * var23;
                      var29 = var29 + var31 * param7;
                      var26 = var26 + param7 * var28;
                      var25 = var25 + var27 * param7;
                      var17_int = var17_int + param7 * var19;
                      var18 = var18 + var20 * param7;
                      param7 = 0;
                      break L12;
                    }
                  }
                  var33 = 0;
                  break L3;
                }
              }
              L13: {
                if (param7 < 0) {
                  param7 = -param7;
                  var25 = var25 + param7 * var27;
                  var30 = var30 + param7 * var32;
                  var22 = var22 + param7 * var24;
                  var26 = var26 + var28 * param7;
                  var18 = var18 + var20 * param7;
                  var29 = var29 + param7 * var31;
                  var21 = var21 + var23 * param7;
                  var17_int = var17_int + var19 * param7;
                  param7 = 0;
                  break L13;
                } else {
                  break L13;
                }
              }
              var35 = bl.field_b[param7];
              L14: while (true) {
                if (param7 >= param14) {
                  return;
                } else {
                  L15: {
                    var36 = var17_int >> 16;
                    if (bl.field_f > var36) {
                      var37 = -(var17_int >> 16) + (var18 >> 16);
                      if (var37 == 0) {
                        if (0 > var36) {
                          break L15;
                        } else {
                          if (var36 < bl.field_f) {
                            ue.a(var36 + var35, 0, var21, var29, var37, (byte) -117, var25, 0, 0, param11);
                            break L15;
                          } else {
                            break L15;
                          }
                        }
                      } else {
                        L16: {
                          var38 = (-var21 + var22) / var37;
                          var39 = (var26 + -var25) / var37;
                          var40 = (var30 - var29) / var37;
                          if (bl.field_f > var36 - -var37) {
                            break L16;
                          } else {
                            var37 = bl.field_f - var36 + -1;
                            break L16;
                          }
                        }
                        if (var36 < 0) {
                          ue.a(var35, var40, -(var36 * var38) + var21, -(var40 * var36) + var29, var36 + var37, (byte) -117, var25 - var36 * var39, var39, var38, param11);
                          break L15;
                        } else {
                          ue.a(var35 + var36, var40, var21, var29, var37, (byte) -117, var25, var39, var38, param11);
                          break L15;
                        }
                      }
                    } else {
                      break L15;
                    }
                  }
                  param7++;
                  if (bl.field_i <= param7) {
                    return;
                  } else {
                    var29 = var29 + var31;
                    var22 = var22 + var24;
                    var21 = var21 + var23;
                    var17_int = var17_int + var19;
                    var35 = var35 + gb.field_d;
                    var25 = var25 + var27;
                    var18 = var18 + var20;
                    var26 = var26 + var28;
                    var30 = var30 + var32;
                    continue L14;
                  }
                }
              }
            } else {
              break L0;
            }
          }
        }
    }

    final void e(int param0) {
        int var2 = 45 % ((-26 - param0) / 54);
        if (((pa) this).field_m == null) {
            return;
        }
        ((pa) this).field_m.field_p = ((pa) this).field_p;
        ((pa) this).field_p.field_m = ((pa) this).field_m;
        ((pa) this).field_p = null;
        ((pa) this).field_m = null;
    }

    public static void d(int param0) {
        field_i = null;
        field_l = null;
        field_n = null;
        field_k = null;
    }

    final static void a(byte param0) {
        int var1 = 0;
        if (th.field_D < 224) {
            var1 = th.field_D % 32;
            lg.a(-91, -var1 + (32 + th.field_D));
        } else {
            lg.a(-118, 256);
        }
    }

    protected pa() {
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_o = 0;
    }
}
