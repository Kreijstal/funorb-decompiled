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
        int var1 = 0;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        L0: {
          L1: {
            var5 = fleas.field_A ? 1 : 0;
            if (param0 <= 100) {
              field_k = null;
              if (0 != fleas.field_E) {
                break L0;
              } else {
                if (fl.field_f) {
                  var3 = 1;
                  break L1;
                } else {
                  break L0;
                }
              }
            } else {
              if (0 != fleas.field_E) {
                break L0;
              } else {
                if (fl.field_f) {
                  var3 = 1;
                  break L1;
                } else {
                  break L0;
                }
              }
            }
          }
          L2: {
            var4 = (int)(32.0 * ma.a((double)ni.field_j / 50.0, 73));
            if (tj.field_a == 0) {
              ej.field_a[0].field_l = 380;
              ej.field_a[0].field_a = 30;
              ej.field_a[0].c(103);
              break L2;
            } else {
              break L2;
            }
          }
          L3: {
            if ((tj.field_a ^ -1) != -2) {
              break L3;
            } else {
              ej.field_a[1].field_l = 70;
              ej.field_a[1].field_a = 140;
              ej.field_a[1].c(51);
              break L3;
            }
          }
          L4: {
            if (tj.field_a != 2) {
              break L4;
            } else {
              ej.field_a[2].field_l = 380;
              ej.field_a[2].field_a = 30;
              ej.field_a[2].c(95);
              var2 = 20;
              var1 = 4;
              if (-1 == fl.field_c[var2][var1]) {
                break L4;
              } else {
                var3 = 3;
                ea.a(var4, (byte) -101, var1, var3, var3, var2);
                break L4;
              }
            }
          }
          L5: {
            if (-4 != tj.field_a) {
              break L5;
            } else {
              ej.field_a[3].field_a = 27;
              ej.field_a[3].field_l = 133;
              ej.field_a[3].c(-93);
              break L5;
            }
          }
          L6: {
            if ((tj.field_a ^ -1) != -5) {
              break L6;
            } else {
              ej.field_a[4].field_a = 150;
              ej.field_a[4].field_l = 30;
              var2 = 18;
              var1 = 13;
              ej.field_a[4].c(75);
              ea.a(var4, (byte) 77, var1, 1, 1, var2);
              var2 = 19;
              L7: while (true) {
                if (var2 >= 33) {
                  var2 = 17;
                  L8: while (true) {
                    if (var2 <= 0) {
                      var1 = 4;
                      var2 = 19;
                      ea.a(var4, (byte) -91, var1, 1, 1, var2);
                      var2 = 20;
                      L9: while (true) {
                        if (39 <= var2) {
                          break L6;
                        } else {
                          pl.a(var1, -67, var2);
                          var2++;
                          continue L9;
                        }
                      }
                    } else {
                      nl.a(var1, -4, var2);
                      var2--;
                      continue L8;
                    }
                  }
                } else {
                  pl.a(var1, -67, var2);
                  var2++;
                  continue L7;
                }
              }
            }
          }
          L10: {
            if (-6 != (tj.field_a ^ -1)) {
              break L10;
            } else {
              ej.field_a[5].field_a = 210;
              ej.field_a[5].field_l = 210;
              var2 = 12;
              var1 = 19;
              ej.field_a[5].c(118);
              ea.a(var4, (byte) -124, var1, 1, 1, var2);
              break L10;
            }
          }
          L11: {
            if (6 != tj.field_a) {
              break L11;
            } else {
              ej.field_a[6].field_a = 150;
              ej.field_a[6].field_l = 200;
              ej.field_a[6].c(-101);
              var1 = 13;
              var2 = 11;
              ea.a(var4, (byte) 112, var1, 3, 1, var2);
              break L11;
            }
          }
          L12: {
            if (7 != tj.field_a) {
              break L12;
            } else {
              ej.field_a[7].field_a = 150;
              ej.field_a[7].field_l = 280;
              var1 = 2;
              var2 = 7;
              ej.field_a[7].c(-97);
              ea.a(var4, (byte) 92, var1, 18, 1, var2);
              break L12;
            }
          }
          if ((tj.field_a ^ -1) == -10) {
            ej.field_a[9].field_a = 120;
            ej.field_a[9].field_l = 200;
            var1 = 4;
            var2 = 17;
            ej.field_a[9].c(94);
            ea.a(var4, (byte) -90, var1, 2, 1, var2);
            var2 = 24;
            var1 = 4;
            ea.a(var4, (byte) 24, var1, 2, 1, var2);
            var2 = 30;
            var1 = 9;
            ea.a(var4, (byte) 41, var1, 2, 1, var2);
            break L0;
          } else {
            break L0;
          }
        }
    }

    final static void a(boolean param0, dd param1) {
        if (param0) {
            return;
        }
        dl.field_s = param1;
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, int[] param11, int param12, int param13, int param14, int param15, int param16) {
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
        var42 = fleas.field_A ? 1 : 0;
        if (0 > param14) {
          return;
        } else {
          if (bl.field_i > param7) {
            L0: {
              if (0 <= param4) {
                break L0;
              } else {
                if (param6 >= 0) {
                  break L0;
                } else {
                  if (param2 < 0) {
                    return;
                  } else {
                    break L0;
                  }
                }
              }
            }
            L1: {
              if (param4 < bl.field_f) {
                break L1;
              } else {
                if (bl.field_f > param6) {
                  break L1;
                } else {
                  if (bl.field_f <= param2) {
                    return;
                  } else {
                    break L1;
                  }
                }
              }
            }
            L2: {
              L3: {
                var34 = -param7 + param14;
                if (param1 != param7) {
                  break L3;
                } else {
                  L4: {
                    L5: {
                      if (param14 == param7) {
                        break L5;
                      } else {
                        L6: {
                          L7: {
                            var35 = -param1 + param14;
                            if (param4 < param6) {
                              break L7;
                            } else {
                              var23 = (-param13 + param16 << -267468784) / var35;
                              var30 = param8 << -1167723408;
                              var17 = param6 << -1265090640;
                              var22 = param10 << -1055330192;
                              var19 = (param2 - param6 << -1288295920) / var35;
                              var32 = (param12 - param8 << -1720220880) / var34;
                              var21 = param13 << -1648025872;
                              var20 = (-param4 + param2 << 530117808) / var34;
                              var31 = (-param0 + param12 << 127008944) / var35;
                              var29 = param0 << -1106722064;
                              var24 = (-param10 + param16 << -418373168) / var34;
                              var25 = param9 << 1166378832;
                              var28 = (-param3 + param5 << -533849648) / var34;
                              var18 = param4 << 1372330768;
                              var26 = param3 << -1141651728;
                              var27 = (-param9 + param5 << -1582034800) / var35;
                              if (0 == 0) {
                                break L6;
                              } else {
                                break L7;
                              }
                            }
                          }
                          var17 = param4 << 1904003216;
                          var27 = (param5 - param3 << 321952240) / var34;
                          var28 = (param5 - param9 << 509747600) / var35;
                          var24 = (-param13 + param16 << -1636600944) / var35;
                          var31 = (param12 + -param8 << 382802544) / var34;
                          var19 = (param2 - param4 << -2124462384) / var34;
                          var23 = (-param10 + param16 << 1571806768) / var34;
                          var30 = param0 << 1927250128;
                          var25 = param3 << 21238000;
                          var21 = param10 << 227914160;
                          var26 = param9 << -1113485072;
                          var22 = param13 << 1778891600;
                          var32 = (param12 - param0 << -1293504528) / var35;
                          var18 = param6 << 496238768;
                          var29 = param8 << -2133793712;
                          var20 = (-param6 + param2 << 46086544) / var35;
                          break L6;
                        }
                        if (0 == 0) {
                          break L4;
                        } else {
                          break L5;
                        }
                      }
                    }
                    var26 = param9;
                    var29 = param8;
                    var23 = 0;
                    var21 = param10;
                    var24 = 0;
                    var22 = param13;
                    var17 = param4 << -296220272;
                    var32 = 0;
                    var19 = 0;
                    var28 = 0;
                    var25 = param3;
                    var20 = 0;
                    var27 = 0;
                    var30 = param0;
                    var31 = 0;
                    var18 = param6 << -1900736208;
                    break L4;
                  }
                  L8: {
                    if (param7 >= 0) {
                      break L8;
                    } else {
                      param7 = Math.min(-param7, -param7 + param1);
                      var30 = var30 + param7 * var32;
                      var22 = var22 + param7 * var24;
                      var21 = var21 + param7 * var23;
                      var29 = var29 + var31 * param7;
                      var26 = var26 + param7 * var28;
                      var25 = var25 + var27 * param7;
                      var17 = var17 + param7 * var19;
                      var18 = var18 + var20 * param7;
                      param7 = 0;
                      break L8;
                    }
                  }
                  var33 = 0;
                  if (0 == 0) {
                    break L2;
                  } else {
                    break L3;
                  }
                }
              }
              L9: {
                L10: {
                  var22 = param10 << -229103920;
                  var21 = param10 << -229103920;
                  var18 = param4 << -1429414928;
                  var17 = param4 << -1429414928;
                  var26 = param3 << -336576976;
                  var25 = param3 << -336576976;
                  var30 = param8 << -1188557520;
                  var29 = param8 << -1188557520;
                  var35 = -param7 + param1;
                  var19 = (param6 + -param4 << 541138800) / var35;
                  var20 = (param2 + -param4 << -1637991984) / var34;
                  if (var19 >= var20) {
                    break L10;
                  } else {
                    var24 = (-param10 + param16 << 376027600) / var34;
                    var27 = (param9 + -param3 << 1684943088) / var35;
                    var33 = 0;
                    var28 = (param5 - param3 << 1001838352) / var34;
                    var32 = (-param8 + param12 << -1301910672) / var34;
                    var31 = (-param8 + param0 << 1587502352) / var35;
                    var23 = (param13 - param10 << -182596816) / var35;
                    if (0 == 0) {
                      break L9;
                    } else {
                      break L10;
                    }
                  }
                }
                var27 = (-param3 + param5 << 600757840) / var34;
                var36 = var19;
                var19 = var20;
                var20 = var36;
                var28 = (-param3 + param9 << 20409232) / var35;
                var31 = (param12 - param8 << -474050160) / var34;
                var24 = (-param10 + param13 << 1413029168) / var35;
                var23 = (-param10 + param16 << -508103856) / var34;
                var33 = 1;
                var32 = (-param8 + param0 << -1209217744) / var35;
                break L9;
              }
              L11: {
                L12: {
                  if (0 > param7) {
                    L13: {
                      if (param1 >= 0) {
                        break L13;
                      } else {
                        param7 = -param7 + param1;
                        var26 = var26 + param7 * var28;
                        var25 = var25 + var27 * param7;
                        var30 = var30 + param7 * var32;
                        var29 = var29 + var31 * param7;
                        var18 = var18 + param7 * var20;
                        var21 = var21 + param7 * var23;
                        var17 = var17 + param7 * var19;
                        var22 = var22 + param7 * var24;
                        param7 = param1;
                        if (0 == 0) {
                          break L11;
                        } else {
                          break L13;
                        }
                      }
                    }
                    param7 = -param7;
                    var17 = var17 + var19 * param7;
                    var21 = var21 + var23 * param7;
                    var25 = var25 + var27 * param7;
                    var26 = var26 + var28 * param7;
                    var29 = var29 + var31 * param7;
                    var18 = var18 + var20 * param7;
                    var30 = var30 + var32 * param7;
                    var22 = var22 + param7 * var24;
                    param7 = 0;
                    break L12;
                  } else {
                    break L12;
                  }
                }
                var36 = bl.field_b[param7];
                L14: while (true) {
                  if (param7 >= param1) {
                    break L11;
                  } else {
                    L15: {
                      var37 = var17 >> -1797693744;
                      if (var37 >= bl.field_f) {
                        break L15;
                      } else {
                        L16: {
                          var38 = -(var17 >> -223572560) + (var18 >> -940159952);
                          if (var38 != 0) {
                            break L16;
                          } else {
                            if (var37 < 0) {
                              break L15;
                            } else {
                              if (bl.field_f > var37) {
                                ue.a(var36 + var37, 0, var21, var29, var38, (byte) -117, var25, 0, 0, param11);
                                if (0 == 0) {
                                  break L15;
                                } else {
                                  break L16;
                                }
                              } else {
                                break L15;
                              }
                            }
                          }
                        }
                        L17: {
                          var39 = (var22 - var21) / var38;
                          var40 = (var26 - var25) / var38;
                          var41 = (-var29 + var30) / var38;
                          if (var37 - -var38 >= bl.field_f) {
                            var38 = -var37 + bl.field_f - 1;
                            break L17;
                          } else {
                            break L17;
                          }
                        }
                        L18: {
                          if (var37 >= 0) {
                            break L18;
                          } else {
                            ue.a(var36, var41, -(var37 * var39) + var21, -(var37 * var41) + var29, var37 + var38, (byte) -117, -(var40 * var37) + var25, var40, var39, param11);
                            if (0 == 0) {
                              break L15;
                            } else {
                              break L18;
                            }
                          }
                        }
                        ue.a(var37 + var36, var41, var21, var29, var38, (byte) -117, var25, var40, var39, param11);
                        break L15;
                      }
                    }
                    param7++;
                    if (bl.field_i <= param7) {
                      return;
                    } else {
                      var21 = var21 + var23;
                      var17 = var17 + var19;
                      var26 = var26 + var28;
                      var30 = var30 + var32;
                      var22 = var22 + var24;
                      var18 = var18 + var20;
                      var25 = var25 + var27;
                      var29 = var29 + var31;
                      var36 = var36 + gb.field_d;
                      if (0 == 0) {
                        continue L14;
                      } else {
                        break L11;
                      }
                    }
                  }
                }
              }
              L19: {
                var36 = param14 + -param1;
                if (var36 != 0) {
                  break L19;
                } else {
                  var27 = 0;
                  var32 = 0;
                  var24 = 0;
                  var31 = 0;
                  var23 = 0;
                  var19 = 0;
                  var20 = 0;
                  var28 = 0;
                  if (0 == 0) {
                    break L2;
                  } else {
                    break L19;
                  }
                }
              }
              L20: {
                L21: {
                  var37 = param2 << 840635696;
                  var38 = param16 << -531271696;
                  var39 = param5 << 178670224;
                  var40 = param12 << 1304834448;
                  if (var33 == 0) {
                    break L21;
                  } else {
                    var22 = param13 << -2066882416;
                    var26 = param9 << 1321665264;
                    var18 = param6 << 960718832;
                    var30 = param0 << -888450064;
                    if (0 == 0) {
                      break L20;
                    } else {
                      break L21;
                    }
                  }
                }
                var17 = param6 << 1431102608;
                var29 = param0 << -2004174352;
                var21 = param13 << -1111132048;
                var25 = param9 << -392484592;
                break L20;
              }
              var20 = (var37 - var18) / var36;
              var28 = (-var26 + var39) / var36;
              var27 = (-var25 + var39) / var36;
              var19 = (-var17 + var37) / var36;
              var31 = (-var29 + var40) / var36;
              var24 = (-var22 + var38) / var36;
              var32 = (-var30 + var40) / var36;
              var23 = (-var21 + var38) / var36;
              break L2;
            }
            L22: {
              if (param7 < 0) {
                param7 = -param7;
                var25 = var25 + param7 * var27;
                var30 = var30 + param7 * var32;
                var22 = var22 + param7 * var24;
                var26 = var26 + var28 * param7;
                var18 = var18 + var20 * param7;
                var29 = var29 + param7 * var31;
                var21 = var21 + var23 * param7;
                var17 = var17 + var19 * param7;
                param7 = 0;
                break L22;
              } else {
                break L22;
              }
            }
            var35 = bl.field_b[param7];
            L23: while (true) {
              L24: {
                if (param7 >= param14) {
                  break L24;
                } else {
                  L25: {
                    var36 = var17 >> 1532091184;
                    if ((bl.field_f ^ -1) < (var36 ^ -1)) {
                      L26: {
                        var37 = -(var17 >> -1661966192) + (var18 >> 1449647376);
                        if (var37 == 0) {
                          break L26;
                        } else {
                          L27: {
                            var38 = (-var21 + var22) / var37;
                            var39 = (var26 + -var25) / var37;
                            var40 = (var30 - var29) / var37;
                            if (bl.field_f > var36 - -var37) {
                              break L27;
                            } else {
                              var37 = bl.field_f - var36 + -1;
                              break L27;
                            }
                          }
                          L28: {
                            L29: {
                              if (var36 < 0) {
                                break L29;
                              } else {
                                ue.a(var35 + var36, var40, var21, var29, var37, (byte) -117, var25, var39, var38, param11);
                                if (0 == 0) {
                                  break L28;
                                } else {
                                  break L29;
                                }
                              }
                            }
                            ue.a(var35, var40, -(var36 * var38) + var21, -(var40 * var36) + var29, var36 + var37, (byte) -117, var25 - var36 * var39, var39, var38, param11);
                            break L28;
                          }
                          if (0 == 0) {
                            break L25;
                          } else {
                            break L26;
                          }
                        }
                      }
                      if (0 > var36) {
                        break L25;
                      } else {
                        if (var36 < bl.field_f) {
                          ue.a(var36 + var35, 0, var21, var29, var37, (byte) -117, var25, 0, 0, param11);
                          break L25;
                        } else {
                          break L25;
                        }
                      }
                    } else {
                      break L25;
                    }
                  }
                  param7++;
                  if (bl.field_i <= param7) {
                    return;
                  } else {
                    var29 = var29 + var31;
                    var22 = var22 + var24;
                    var21 = var21 + var23;
                    var17 = var17 + var19;
                    var35 = var35 + gb.field_d;
                    var25 = var25 + var27;
                    var18 = var18 + var20;
                    var26 = var26 + var28;
                    var30 = var30 + var32;
                    if (0 == 0) {
                      continue L23;
                    } else {
                      break L24;
                    }
                  }
                }
              }
              L30: {
                if (param15 == 32679) {
                  break L30;
                } else {
                  field_i = null;
                  break L30;
                }
              }
              return;
            }
          } else {
            return;
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
        if (param0 != -6) {
            return;
        }
        field_k = null;
    }

    final static void a(byte param0) {
        int var1 = 0;
        if (-225 < (th.field_D ^ -1)) {
            var1 = th.field_D % 32;
            lg.a(-91, -var1 + (32 + th.field_D));
        } else {
            lg.a(-118, 256);
        }
        if (param0 != 93) {
            field_l = null;
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
