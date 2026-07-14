/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fi extends jm {
    static vr field_n;
    static String field_o;
    static js field_m;
    private int field_q;
    static byte[] field_p;
    private int field_r;

    public static void d(byte param0) {
        field_n = null;
        field_m = null;
        field_p = null;
        if (param0 != -80) {
            field_m = null;
        }
        field_o = null;
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, kv param5, int[] param6, int param7, int param8, int param9, int param10, int param11, int param12, int param13, int param14, int param15, int[] param16) {
        int var17 = 0;
        int var18 = 0;
        double var19 = 0.0;
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
        double var38 = 0.0;
        double var40 = 0.0;
        int var42 = 0;
        int var43 = 0;
        int var44 = 0;
        int var45 = 0;
        int var46 = 0;
        int var47 = 0;
        int var48 = 0;
        int var49 = 0;
        int var50 = 0;
        int var51 = 0;
        int var52 = 0;
        int var53 = 0;
        int var54 = 0;
        int var55 = 0;
        int var56 = 0;
        int var57 = 0;
        int var58 = 0;
        int var59 = 0;
        int var60 = 0;
        int var61 = 0;
        int var62 = 0;
        int var63 = 0;
        int var64 = 0;
        int var65 = 0;
        int var66 = 0;
        int var67 = 0;
        int stackIn_66_0 = 0;
        int stackIn_72_0 = 0;
        int stackIn_80_0 = 0;
        int stackIn_85_0 = 0;
        int stackIn_111_0 = 0;
        int stackIn_117_0 = 0;
        int stackIn_125_0 = 0;
        int stackIn_132_0 = 0;
        int stackIn_158_0 = 0;
        int stackIn_163_0 = 0;
        int stackIn_170_0 = 0;
        int stackIn_176_0 = 0;
        int stackIn_201_0 = 0;
        int stackIn_208_0 = 0;
        int stackIn_217_0 = 0;
        int stackIn_222_0 = 0;
        int stackOut_65_0 = 0;
        int stackOut_64_0 = 0;
        int stackOut_71_0 = 0;
        int stackOut_70_0 = 0;
        int stackOut_79_0 = 0;
        int stackOut_78_0 = 0;
        int stackOut_84_0 = 0;
        int stackOut_83_0 = 0;
        int stackOut_110_0 = 0;
        int stackOut_109_0 = 0;
        int stackOut_116_0 = 0;
        int stackOut_115_0 = 0;
        int stackOut_124_0 = 0;
        int stackOut_123_0 = 0;
        int stackOut_131_0 = 0;
        int stackOut_130_0 = 0;
        int stackOut_157_0 = 0;
        int stackOut_156_0 = 0;
        int stackOut_162_0 = 0;
        int stackOut_161_0 = 0;
        int stackOut_169_0 = 0;
        int stackOut_168_0 = 0;
        int stackOut_175_0 = 0;
        int stackOut_174_0 = 0;
        int stackOut_200_0 = 0;
        int stackOut_199_0 = 0;
        int stackOut_207_0 = 0;
        int stackOut_206_0 = 0;
        int stackOut_216_0 = 0;
        int stackOut_215_0 = 0;
        int stackOut_221_0 = 0;
        int stackOut_220_0 = 0;
        var67 = BachelorFridge.field_y;
        if (param10 != 0) {
          if (param14 == 0) {
            return;
          } else {
            L0: {
              L1: {
                var17 = param5.field_q;
                param1 = param1 - (param5.field_u << -1199960796);
                param0 = param0 - (param5.field_t << 490027748);
                var18 = param5.field_p;
                var19 = 0.00009587379924285257 * (double)(param2 & 65535);
                var21 = (int)Math.floor((double)param10 * Math.sin(var19) + 0.5);
                var22 = (int)Math.floor(Math.cos(var19) * (double)param10 + 0.5);
                var23 = (int)Math.floor((double)param14 * Math.sin(var19) + 0.5);
                var24 = (int)Math.floor(Math.cos(var19) * (double)param14 + 0.5);
                var25 = var22 * -param0 + -param1 * var23;
                var26 = var24 * -param1 + --param0 * var21;
                var27 = ((var17 << 1594990116) - param0) * var22 + -param1 * var23;
                var28 = -param1 * var24 + var21 * -((var17 << 530432196) + -param0);
                var29 = var23 * (-param1 + (var18 << 924030148)) + -param0 * var22;
                var30 = var24 * (-param1 + (var18 << -73192860)) + --param0 * var21;
                var31 = ((var17 << 574294948) - param0) * var22 + var23 * (-param1 + (var18 << -1503407804));
                var32 = var21 * -((var17 << 1392286308) - param0) + var24 * (-param1 + (var18 << 1235063108));
                if (var25 >= var27) {
                  break L1;
                } else {
                  var34 = var27;
                  var33 = var25;
                  if (0 == 0) {
                    break L0;
                  } else {
                    break L1;
                  }
                }
              }
              var33 = var27;
              var34 = var25;
              break L0;
            }
            L2: {
              if (var33 > var29) {
                var33 = var29;
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              if (var31 < var33) {
                var33 = var31;
                break L3;
              } else {
                break L3;
              }
            }
            L4: {
              if (var34 < var29) {
                var34 = var29;
                break L4;
              } else {
                break L4;
              }
            }
            L5: {
              if (var31 <= var34) {
                break L5;
              } else {
                var34 = var31;
                break L5;
              }
            }
            L6: {
              L7: {
                if (var28 <= var26) {
                  break L7;
                } else {
                  var35 = var26;
                  var36 = var28;
                  if (0 == 0) {
                    break L6;
                  } else {
                    break L7;
                  }
                }
              }
              var35 = var28;
              var36 = var26;
              break L6;
            }
            L8: {
              if (var35 <= var30) {
                break L8;
              } else {
                var35 = var30;
                break L8;
              }
            }
            L9: {
              if (var35 <= var32) {
                break L9;
              } else {
                var35 = var32;
                break L9;
              }
            }
            L10: {
              if (var36 < var30) {
                var36 = var30;
                break L10;
              } else {
                break L10;
              }
            }
            L11: {
              if (var32 <= var36) {
                break L11;
              } else {
                var36 = var32;
                break L11;
              }
            }
            L12: {
              var33 = var33 >> 12;
              var34 = 4095 + var34 >> -1000844820;
              var35 = var35 >> 12;
              var34 = var34 + param13;
              var33 = var33 + param13;
              var35 = var35 + param11;
              var36 = var36 + 4095 >> 16981004;
              var36 = var36 + param11;
              var35 = var35 >> 4;
              var34 = 15 + var34 >> 55092196;
              var33 = var33 >> 4;
              if (dg.field_f <= var33) {
                break L12;
              } else {
                var33 = dg.field_f;
                break L12;
              }
            }
            L13: {
              if (dg.field_h < var34) {
                var34 = dg.field_h;
                break L13;
              } else {
                break L13;
              }
            }
            L14: {
              if (dg.field_j <= var35) {
                break L14;
              } else {
                var35 = dg.field_j;
                break L14;
              }
            }
            L15: {
              var36 = var36 - -15 >> -1125340028;
              if (var36 <= dg.field_k) {
                break L15;
              } else {
                var36 = dg.field_k;
                break L15;
              }
            }
            var34 = var33 + -var34;
            if (var34 >= 0) {
              return;
            } else {
              var36 = var35 - var36;
              var37 = -127 / ((param8 - 12) / 54);
              if (var36 >= 0) {
                return;
              } else {
                L16: {
                  L17: {
                    param12 = var35 * dg.field_i + var33;
                    param15 = dg.field_i - -var34;
                    var38 = 16777216.0 / (double)param10;
                    var21 = (int)Math.floor(0.5 + var38 * Math.sin(var19));
                    var40 = 16777216.0 / (double)param14;
                    var22 = (int)Math.floor(0.5 + var38 * Math.cos(var19));
                    var23 = (int)Math.floor(0.5 + Math.sin(var19) * var40);
                    var24 = (int)Math.floor(Math.cos(var19) * var40 + 0.5);
                    var42 = (var33 << 646450852) - -8 + -param13;
                    var43 = -param11 + 8 + (var35 << -197165628);
                    param4 = (param1 << 1630618600) - -(var24 * var43 >> 2075858692);
                    param3 = -(var21 * var43 >> 247949860) + (param0 << -335242552);
                    var44 = var22 * var42 >> -1652711196;
                    var45 = var23 * var42 >> -539114716;
                    var49 = var17 << -1867216564;
                    var50 = var18 << 1994815244;
                    if (var22 < 0) {
                      break L17;
                    } else {
                      L18: {
                        if (var21 >= 0) {
                          break L18;
                        } else {
                          if (var23 >= 0) {
                            break L18;
                          } else {
                            var47 = var36;
                            L19: while (true) {
                              if (var47 == 0) {
                                break L16;
                              } else {
                                L20: {
                                  var46 = var34;
                                  var51 = param3 - -var44;
                                  var52 = param4 - -var45;
                                  var48 = var51 + 4096;
                                  if (0 > var51 + 4096) {
                                    var48 = (-var48 + var22 + -1) / var22;
                                    var52 = var52 + var48 * var23;
                                    var51 = var51 + var48 * var22;
                                    var46 = var46 + var48;
                                    param12 = param12 + var48;
                                    break L20;
                                  } else {
                                    break L20;
                                  }
                                }
                                L21: {
                                  var48 = var52 - var50;
                                  var48 += 0;
                                  if (var48 < 0) {
                                    break L21;
                                  } else {
                                    var48 = (var23 - var48) / var23;
                                    param12 = param12 + var48;
                                    var51 = var51 + var48 * var22;
                                    var46 = var46 + var48;
                                    var52 = var52 + var48 * var23;
                                    break L21;
                                  }
                                }
                                L22: while (true) {
                                  L23: {
                                    if (var46 == 0) {
                                      break L23;
                                    } else {
                                      if (4095 < (var52 ^ -1)) {
                                        break L23;
                                      } else {
                                        param9 = var51 >> 1446381452;
                                        if (var17 <= var51 >> 1446381452) {
                                          break L23;
                                        } else {
                                          L24: {
                                            L25: {
                                              param7 = var52 >> -83587028;
                                              var53 = var51;
                                              var54 = var52;
                                              var63 = param9 + param7 * var17;
                                              var54 = var54 & 4095;
                                              var53 = var53 & 4095;
                                              if (-1 + var18 > param7) {
                                                break L25;
                                              } else {
                                                var57 = 0;
                                                var58 = 0;
                                                var61 = 0;
                                                var62 = 0;
                                                if (0 == 0) {
                                                  break L24;
                                                } else {
                                                  break L25;
                                                }
                                              }
                                            }
                                            L26: {
                                              L27: {
                                                if (-1 + var17 > param9) {
                                                  break L27;
                                                } else {
                                                  var58 = 0;
                                                  var62 = 0;
                                                  if (0 == 0) {
                                                    break L26;
                                                  } else {
                                                    break L27;
                                                  }
                                                }
                                              }
                                              L28: {
                                                var58 = param16[1 + (var63 - -var17)];
                                                if (0 != (var58 & -16777216)) {
                                                  stackOut_65_0 = var53 * var54;
                                                  stackIn_66_0 = stackOut_65_0;
                                                  break L28;
                                                } else {
                                                  stackOut_64_0 = 0;
                                                  stackIn_66_0 = stackOut_64_0;
                                                  break L28;
                                                }
                                              }
                                              var62 = stackIn_66_0;
                                              break L26;
                                            }
                                            L29: {
                                              if (param9 >= 0) {
                                                break L29;
                                              } else {
                                                var57 = 0;
                                                var61 = 0;
                                                if (0 == 0) {
                                                  break L24;
                                                } else {
                                                  break L29;
                                                }
                                              }
                                            }
                                            L30: {
                                              var57 = param16[var17 + var63];
                                              if ((-16777216 & var57) != 0) {
                                                stackOut_71_0 = var54 * (4096 - var53);
                                                stackIn_72_0 = stackOut_71_0;
                                                break L30;
                                              } else {
                                                stackOut_70_0 = 0;
                                                stackIn_72_0 = stackOut_70_0;
                                                break L30;
                                              }
                                            }
                                            var61 = stackIn_72_0;
                                            break L24;
                                          }
                                          L31: {
                                            L32: {
                                              if (param7 >= 0) {
                                                break L32;
                                              } else {
                                                var55 = 0;
                                                var56 = 0;
                                                var60 = 0;
                                                var59 = 0;
                                                if (0 == 0) {
                                                  break L31;
                                                } else {
                                                  break L32;
                                                }
                                              }
                                            }
                                            L33: {
                                              L34: {
                                                if (param9 >= 0) {
                                                  break L34;
                                                } else {
                                                  var59 = 0;
                                                  var55 = 0;
                                                  if (0 == 0) {
                                                    break L33;
                                                  } else {
                                                    break L34;
                                                  }
                                                }
                                              }
                                              L35: {
                                                var55 = param16[var63];
                                                if ((var55 & -16777216) != 0) {
                                                  stackOut_79_0 = (-var53 + 4096) * (-var54 + 4096);
                                                  stackIn_80_0 = stackOut_79_0;
                                                  break L35;
                                                } else {
                                                  stackOut_78_0 = 0;
                                                  stackIn_80_0 = stackOut_78_0;
                                                  break L35;
                                                }
                                              }
                                              var59 = stackIn_80_0;
                                              break L33;
                                            }
                                            L36: {
                                              if (-1 + var17 <= param9) {
                                                break L36;
                                              } else {
                                                L37: {
                                                  var56 = param16[var63 + 1];
                                                  if (0 != (var56 & -16777216)) {
                                                    stackOut_84_0 = var53 * (-var54 + 4096);
                                                    stackIn_85_0 = stackOut_84_0;
                                                    break L37;
                                                  } else {
                                                    stackOut_83_0 = 0;
                                                    stackIn_85_0 = stackOut_83_0;
                                                    break L37;
                                                  }
                                                }
                                                var60 = stackIn_85_0;
                                                if (0 == 0) {
                                                  break L31;
                                                } else {
                                                  break L36;
                                                }
                                              }
                                            }
                                            var56 = 0;
                                            var60 = 0;
                                            break L31;
                                          }
                                          L38: {
                                            var60 = var60 >> 16;
                                            var62 = var62 >> 16;
                                            var61 = var61 >> 16;
                                            var59 = var59 >> 16;
                                            if (var62 + var60 + var59 + var61 >= 128) {
                                              var64 = (var55 & 16711935) * var59 + var60 * (16711935 & var56);
                                              var64 = var64 + ((16711935 & var58) * var62 + (var57 & 16711935) * var61);
                                              var65 = var60 * ((var56 & -16711936) >>> 918568328) + var59 * ((var55 & -16711936) >>> -1635865176);
                                              var65 = var65 + (var62 * (var58 >>> 1293651240 & 16711935) + (var57 >>> 959980072 & 16711935) * var61);
                                              var64 = 16711935 & var64 >> 1815014024;
                                              var66 = var65 >>> 1928786232;
                                              var65 = 65280 & var65;
                                              if (var66 != 0) {
                                                param6[param12] = mp.a((var66 >> 830278049) + 128 << -1949244264, dda.a(var64 * var66, -16711936) + dda.a(16711680, var65 * var66) >> -1431374968);
                                                break L38;
                                              } else {
                                                break L38;
                                              }
                                            } else {
                                              break L38;
                                            }
                                          }
                                          var51 = var51 + var22;
                                          param12++;
                                          var52 = var52 + var23;
                                          var46++;
                                          if (0 == 0) {
                                            continue L22;
                                          } else {
                                            break L23;
                                          }
                                        }
                                      }
                                    }
                                  }
                                  param12 = param12 - var46;
                                  param3 = param3 - var21;
                                  param4 = param4 + var24;
                                  param12 = param12 + param15;
                                  var47++;
                                  if (0 == 0) {
                                    continue L19;
                                  } else {
                                    break L18;
                                  }
                                }
                              }
                            }
                          }
                        }
                      }
                      var47 = var36;
                      L39: while (true) {
                        if (var47 == 0) {
                          break L16;
                        } else {
                          L40: {
                            var51 = var44 + param3;
                            var52 = param4 + var45;
                            var46 = var34;
                            var48 = 4096 + var51;
                            if (0 > 4096 + var51) {
                              var48 = (-var48 + -1 + var22) / var22;
                              var52 = var52 + var48 * var23;
                              var46 = var46 + var48;
                              var51 = var51 + var22 * var48;
                              param12 = param12 + var48;
                              break L40;
                            } else {
                              break L40;
                            }
                          }
                          L41: {
                            L42: {
                              var48 = 4096 + var52;
                              var48 += 0;
                              if (var48 >= 0) {
                                break L42;
                              } else {
                                L43: {
                                  if (0 != var23) {
                                    break L43;
                                  } else {
                                    param12 = param12 - var46;
                                    if (0 == 0) {
                                      break L41;
                                    } else {
                                      break L43;
                                    }
                                  }
                                }
                                var48 = (-var48 + (-1 + var23)) / var23;
                                param12 = param12 + var48;
                                var46 = var46 + var48;
                                var52 = var52 + var48 * var23;
                                var51 = var51 + var48 * var22;
                                break L42;
                              }
                            }
                            L44: while (true) {
                              L45: {
                                if (0 == var46) {
                                  break L45;
                                } else {
                                  param9 = var51 >> 1961964236;
                                  if ((var17 ^ -1) >= (var51 >> 1961964236 ^ -1)) {
                                    break L45;
                                  } else {
                                    param7 = var52 >> 1854145900;
                                    if (var18 <= var52 >> 1854145900) {
                                      break L45;
                                    } else {
                                      L46: {
                                        L47: {
                                          var54 = var52;
                                          var53 = var51;
                                          var63 = param9 + param7 * var17;
                                          var53 = var53 & 4095;
                                          var54 = var54 & 4095;
                                          if (param7 < 0) {
                                            break L47;
                                          } else {
                                            L48: {
                                              L49: {
                                                if (param9 < 0) {
                                                  break L49;
                                                } else {
                                                  L50: {
                                                    var55 = param16[var63];
                                                    if ((var55 & -16777216) != 0) {
                                                      stackOut_110_0 = (-var54 + 4096) * (4096 + -var53);
                                                      stackIn_111_0 = stackOut_110_0;
                                                      break L50;
                                                    } else {
                                                      stackOut_109_0 = 0;
                                                      stackIn_111_0 = stackOut_109_0;
                                                      break L50;
                                                    }
                                                  }
                                                  var59 = stackIn_111_0;
                                                  if (0 == 0) {
                                                    break L48;
                                                  } else {
                                                    break L49;
                                                  }
                                                }
                                              }
                                              var55 = 0;
                                              var59 = 0;
                                              break L48;
                                            }
                                            L51: {
                                              if (-1 + var17 <= param9) {
                                                break L51;
                                              } else {
                                                L52: {
                                                  var56 = param16[var63 + 1];
                                                  if ((-16777216 & var56) != 0) {
                                                    stackOut_116_0 = (4096 + -var54) * var53;
                                                    stackIn_117_0 = stackOut_116_0;
                                                    break L52;
                                                  } else {
                                                    stackOut_115_0 = 0;
                                                    stackIn_117_0 = stackOut_115_0;
                                                    break L52;
                                                  }
                                                }
                                                var60 = stackIn_117_0;
                                                if (0 == 0) {
                                                  break L46;
                                                } else {
                                                  break L51;
                                                }
                                              }
                                            }
                                            var60 = 0;
                                            var56 = 0;
                                            if (0 == 0) {
                                              break L46;
                                            } else {
                                              break L47;
                                            }
                                          }
                                        }
                                        var60 = 0;
                                        var59 = 0;
                                        var56 = 0;
                                        var55 = 0;
                                        break L46;
                                      }
                                      L53: {
                                        L54: {
                                          if (param7 >= var18 + -1) {
                                            break L54;
                                          } else {
                                            L55: {
                                              L56: {
                                                if (param9 >= -1 + var17) {
                                                  break L56;
                                                } else {
                                                  L57: {
                                                    var58 = param16[var63 + (var17 + 1)];
                                                    if (0 == (-16777216 & var58)) {
                                                      stackOut_124_0 = 0;
                                                      stackIn_125_0 = stackOut_124_0;
                                                      break L57;
                                                    } else {
                                                      stackOut_123_0 = var54 * var53;
                                                      stackIn_125_0 = stackOut_123_0;
                                                      break L57;
                                                    }
                                                  }
                                                  var62 = stackIn_125_0;
                                                  if (0 == 0) {
                                                    break L55;
                                                  } else {
                                                    break L56;
                                                  }
                                                }
                                              }
                                              var58 = 0;
                                              var62 = 0;
                                              break L55;
                                            }
                                            L58: {
                                              if (0 <= param9) {
                                                break L58;
                                              } else {
                                                var61 = 0;
                                                var57 = 0;
                                                if (0 == 0) {
                                                  break L53;
                                                } else {
                                                  break L58;
                                                }
                                              }
                                            }
                                            L59: {
                                              var57 = param16[var17 + var63];
                                              if ((-16777216 & var57) == 0) {
                                                stackOut_131_0 = 0;
                                                stackIn_132_0 = stackOut_131_0;
                                                break L59;
                                              } else {
                                                stackOut_130_0 = (-var53 + 4096) * var54;
                                                stackIn_132_0 = stackOut_130_0;
                                                break L59;
                                              }
                                            }
                                            var61 = stackIn_132_0;
                                            if (0 == 0) {
                                              break L53;
                                            } else {
                                              break L54;
                                            }
                                          }
                                        }
                                        var58 = 0;
                                        var61 = 0;
                                        var57 = 0;
                                        var62 = 0;
                                        break L53;
                                      }
                                      L60: {
                                        var59 = var59 >> 16;
                                        var62 = var62 >> 16;
                                        var60 = var60 >> 16;
                                        var61 = var61 >> 16;
                                        if (-129 < (var60 + var59 - (-var61 + -var62) ^ -1)) {
                                          break L60;
                                        } else {
                                          var64 = (var56 & 16711935) * var60 + var59 * (16711935 & var55);
                                          var65 = (16711935 & var55 >>> 1426439720) * var59 + var60 * ((-16711936 & var56) >>> -1125305048);
                                          var64 = var64 + (var61 * (var57 & 16711935) + (16711935 & var58) * var62);
                                          var65 = var65 + (var62 * ((-16711936 & var58) >>> -486145880) + (16711935 & var57 >>> 498509256) * var61);
                                          var64 = 16711935 & var64 >> 738873128;
                                          var66 = var65 >>> 893213912;
                                          var65 = var65 & 65280;
                                          if (var66 == 0) {
                                            break L60;
                                          } else {
                                            param6[param12] = mp.a(dda.a(var66 * var64, -16711936) - -dda.a(var66 * var65, 16711680) >> 1110433736, (var66 >> 1281733281) + 128 << -257600776);
                                            break L60;
                                          }
                                        }
                                      }
                                      var46++;
                                      param12++;
                                      var52 = var52 + var23;
                                      var51 = var51 + var22;
                                      if (0 == 0) {
                                        continue L44;
                                      } else {
                                        break L45;
                                      }
                                    }
                                  }
                                }
                              }
                              param12 = param12 - var46;
                              break L41;
                            }
                          }
                          var47++;
                          param12 = param12 + param15;
                          param3 = param3 - var21;
                          param4 = param4 + var24;
                          if (0 == 0) {
                            continue L39;
                          } else {
                            break L17;
                          }
                        }
                      }
                    }
                  }
                  L61: {
                    if (var23 >= 0) {
                      break L61;
                    } else {
                      var47 = var36;
                      L62: while (true) {
                        if (var47 == 0) {
                          break L16;
                        } else {
                          L63: {
                            var46 = var34;
                            var52 = var45 + param4;
                            var51 = var44 + param3;
                            var48 = -var49 + var51;
                            if (-1 < (-var49 + var51 ^ -1)) {
                              break L63;
                            } else {
                              var48 = (var22 - var48) / var22;
                              var46 = var46 + var48;
                              var51 = var51 + var22 * var48;
                              param12 = param12 + var48;
                              var52 = var52 + var48 * var23;
                              break L63;
                            }
                          }
                          L64: {
                            var48 = -var50 + var52;
                            if (-var50 + var52 >= 0) {
                              var48 = (-var48 + var23) / var23;
                              var46 = var46 + var48;
                              param12 = param12 + var48;
                              var52 = var52 + var23 * var48;
                              var51 = var51 + var48 * var22;
                              break L64;
                            } else {
                              break L64;
                            }
                          }
                          L65: while (true) {
                            L66: {
                              if (var46 == 0) {
                                break L66;
                              } else {
                                if (var51 < -4096) {
                                  break L66;
                                } else {
                                  if (var52 < -4096) {
                                    break L66;
                                  } else {
                                    L67: {
                                      L68: {
                                        param7 = var52 >> -593811156;
                                        var53 = var51;
                                        param9 = var51 >> 469462668;
                                        var54 = var52;
                                        var54 = var54 & 4095;
                                        var63 = param9 + param7 * var17;
                                        var53 = var53 & 4095;
                                        if (param7 >= 0) {
                                          break L68;
                                        } else {
                                          var56 = 0;
                                          var60 = 0;
                                          var59 = 0;
                                          var55 = 0;
                                          if (0 == 0) {
                                            break L67;
                                          } else {
                                            break L68;
                                          }
                                        }
                                      }
                                      L69: {
                                        L70: {
                                          if (var17 + -1 > param9) {
                                            break L70;
                                          } else {
                                            var60 = 0;
                                            var56 = 0;
                                            if (0 == 0) {
                                              break L69;
                                            } else {
                                              break L70;
                                            }
                                          }
                                        }
                                        L71: {
                                          var56 = param16[1 + var63];
                                          if ((-16777216 & var56) != 0) {
                                            stackOut_157_0 = (4096 + -var54) * var53;
                                            stackIn_158_0 = stackOut_157_0;
                                            break L71;
                                          } else {
                                            stackOut_156_0 = 0;
                                            stackIn_158_0 = stackOut_156_0;
                                            break L71;
                                          }
                                        }
                                        var60 = stackIn_158_0;
                                        break L69;
                                      }
                                      L72: {
                                        if (param9 < 0) {
                                          break L72;
                                        } else {
                                          L73: {
                                            var55 = param16[var63];
                                            if ((var55 & -16777216) == 0) {
                                              stackOut_162_0 = 0;
                                              stackIn_163_0 = stackOut_162_0;
                                              break L73;
                                            } else {
                                              stackOut_161_0 = (4096 - var53) * (-var54 + 4096);
                                              stackIn_163_0 = stackOut_161_0;
                                              break L73;
                                            }
                                          }
                                          var59 = stackIn_163_0;
                                          if (0 == 0) {
                                            break L67;
                                          } else {
                                            break L72;
                                          }
                                        }
                                      }
                                      var59 = 0;
                                      var55 = 0;
                                      break L67;
                                    }
                                    L74: {
                                      L75: {
                                        if (var18 - 1 <= param7) {
                                          break L75;
                                        } else {
                                          L76: {
                                            L77: {
                                              if (-1 + var17 <= param9) {
                                                break L77;
                                              } else {
                                                L78: {
                                                  var58 = param16[1 + var17 + var63];
                                                  if ((var58 & -16777216) == 0) {
                                                    stackOut_169_0 = 0;
                                                    stackIn_170_0 = stackOut_169_0;
                                                    break L78;
                                                  } else {
                                                    stackOut_168_0 = var53 * var54;
                                                    stackIn_170_0 = stackOut_168_0;
                                                    break L78;
                                                  }
                                                }
                                                var62 = stackIn_170_0;
                                                if (0 == 0) {
                                                  break L76;
                                                } else {
                                                  break L77;
                                                }
                                              }
                                            }
                                            var62 = 0;
                                            var58 = 0;
                                            break L76;
                                          }
                                          L79: {
                                            if (0 > param9) {
                                              break L79;
                                            } else {
                                              L80: {
                                                var57 = param16[var63 + var17];
                                                if ((var57 & -16777216) == 0) {
                                                  stackOut_175_0 = 0;
                                                  stackIn_176_0 = stackOut_175_0;
                                                  break L80;
                                                } else {
                                                  stackOut_174_0 = var54 * (4096 + -var53);
                                                  stackIn_176_0 = stackOut_174_0;
                                                  break L80;
                                                }
                                              }
                                              var61 = stackIn_176_0;
                                              if (0 == 0) {
                                                break L74;
                                              } else {
                                                break L79;
                                              }
                                            }
                                          }
                                          var57 = 0;
                                          var61 = 0;
                                          if (0 == 0) {
                                            break L74;
                                          } else {
                                            break L75;
                                          }
                                        }
                                      }
                                      var57 = 0;
                                      var58 = 0;
                                      var61 = 0;
                                      var62 = 0;
                                      break L74;
                                    }
                                    L81: {
                                      var59 = var59 >> 16;
                                      var60 = var60 >> 16;
                                      var62 = var62 >> 16;
                                      var61 = var61 >> 16;
                                      if ((var62 + (var61 + var59) + var60 ^ -1) <= -129) {
                                        var64 = var59 * (var55 & 16711935) + (var56 & 16711935) * var60;
                                        var65 = var59 * (var55 >>> -1437864184 & 16711935) + (16711935 & var56 >>> 1316579240) * var60;
                                        var64 = var64 + (var61 * (16711935 & var57) + (16711935 & var58) * var62);
                                        var65 = var65 + (var61 * (16711935 & var57 >>> -1971729880) + (var58 >>> 84407464 & 16711935) * var62);
                                        var66 = var65 >>> -402186056;
                                        var64 = var64 >> 1242420680 & 16711935;
                                        var65 = 65280 & var65;
                                        if (var66 != 0) {
                                          param6[param12] = mp.a(128 + (var66 >> -581947391) << 42542456, dda.a(-16711936, var64 * var66) - -dda.a(var65 * var66, 16711680) >> 851803112);
                                          break L81;
                                        } else {
                                          break L81;
                                        }
                                      } else {
                                        break L81;
                                      }
                                    }
                                    var51 = var51 + var22;
                                    var52 = var52 + var23;
                                    param12++;
                                    var46++;
                                    if (0 == 0) {
                                      continue L65;
                                    } else {
                                      break L66;
                                    }
                                  }
                                }
                              }
                            }
                            param12 = param12 - var46;
                            param12 = param12 + param15;
                            param4 = param4 + var24;
                            var47++;
                            param3 = param3 - var21;
                            if (0 == 0) {
                              continue L62;
                            } else {
                              break L61;
                            }
                          }
                        }
                      }
                    }
                  }
                  var47 = var36;
                  L82: while (true) {
                    if (0 == var47) {
                      break L16;
                    } else {
                      L83: {
                        var46 = var34;
                        var52 = param4 - -var45;
                        var51 = var44 + param3;
                        var48 = var51 - var49;
                        if (var51 - var49 >= 0) {
                          var48 = (var22 + -var48) / var22;
                          var51 = var51 + var48 * var22;
                          var52 = var52 + var23 * var48;
                          var46 = var46 + var48;
                          param12 = param12 + var48;
                          break L83;
                        } else {
                          break L83;
                        }
                      }
                      L84: {
                        var48 = 4096 + var52;
                        if (0 <= 4096 + var52) {
                          break L84;
                        } else {
                          var48 = (-var48 + (var23 + -1)) / var23;
                          var51 = var51 + var48 * var22;
                          var46 = var46 + var48;
                          var52 = var52 + var23 * var48;
                          param12 = param12 + var48;
                          break L84;
                        }
                      }
                      L85: while (true) {
                        L86: {
                          if (var46 == 0) {
                            break L86;
                          } else {
                            if (var51 < -4096) {
                              break L86;
                            } else {
                              param7 = var52 >> -1197030196;
                              if (var52 >> -1197030196 >= var18) {
                                break L86;
                              } else {
                                L87: {
                                  L88: {
                                    var54 = var52;
                                    param9 = var51 >> -1364423860;
                                    var53 = var51;
                                    var54 = var54 & 4095;
                                    var53 = var53 & 4095;
                                    var63 = param9 + var17 * param7;
                                    if (param7 < 0) {
                                      break L88;
                                    } else {
                                      L89: {
                                        L90: {
                                          if (param9 < 0) {
                                            break L90;
                                          } else {
                                            L91: {
                                              var55 = param16[var63];
                                              if ((-16777216 & var55) == 0) {
                                                stackOut_200_0 = 0;
                                                stackIn_201_0 = stackOut_200_0;
                                                break L91;
                                              } else {
                                                stackOut_199_0 = (4096 + -var53) * (4096 - var54);
                                                stackIn_201_0 = stackOut_199_0;
                                                break L91;
                                              }
                                            }
                                            var59 = stackIn_201_0;
                                            if (0 == 0) {
                                              break L89;
                                            } else {
                                              break L90;
                                            }
                                          }
                                        }
                                        var59 = 0;
                                        var55 = 0;
                                        break L89;
                                      }
                                      L92: {
                                        if (param9 < var17 + -1) {
                                          break L92;
                                        } else {
                                          var60 = 0;
                                          var56 = 0;
                                          if (0 == 0) {
                                            break L87;
                                          } else {
                                            break L92;
                                          }
                                        }
                                      }
                                      L93: {
                                        var56 = param16[1 + var63];
                                        if ((var56 & -16777216) != 0) {
                                          stackOut_207_0 = var53 * (4096 - var54);
                                          stackIn_208_0 = stackOut_207_0;
                                          break L93;
                                        } else {
                                          stackOut_206_0 = 0;
                                          stackIn_208_0 = stackOut_206_0;
                                          break L93;
                                        }
                                      }
                                      var60 = stackIn_208_0;
                                      if (0 == 0) {
                                        break L87;
                                      } else {
                                        break L88;
                                      }
                                    }
                                  }
                                  var60 = 0;
                                  var59 = 0;
                                  var56 = 0;
                                  var55 = 0;
                                  break L87;
                                }
                                L94: {
                                  L95: {
                                    if (var18 + -1 > param7) {
                                      break L95;
                                    } else {
                                      var57 = 0;
                                      var58 = 0;
                                      var61 = 0;
                                      var62 = 0;
                                      if (0 == 0) {
                                        break L94;
                                      } else {
                                        break L95;
                                      }
                                    }
                                  }
                                  L96: {
                                    L97: {
                                      if (var17 - 1 > param9) {
                                        break L97;
                                      } else {
                                        var62 = 0;
                                        var58 = 0;
                                        if (0 == 0) {
                                          break L96;
                                        } else {
                                          break L97;
                                        }
                                      }
                                    }
                                    L98: {
                                      var58 = param16[var17 + (var63 - -1)];
                                      if ((var58 & -16777216) != 0) {
                                        stackOut_216_0 = var53 * var54;
                                        stackIn_217_0 = stackOut_216_0;
                                        break L98;
                                      } else {
                                        stackOut_215_0 = 0;
                                        stackIn_217_0 = stackOut_215_0;
                                        break L98;
                                      }
                                    }
                                    var62 = stackIn_217_0;
                                    break L96;
                                  }
                                  L99: {
                                    if (0 > param9) {
                                      break L99;
                                    } else {
                                      L100: {
                                        var57 = param16[var17 + var63];
                                        if (-1 == (-16777216 & var57 ^ -1)) {
                                          stackOut_221_0 = 0;
                                          stackIn_222_0 = stackOut_221_0;
                                          break L100;
                                        } else {
                                          stackOut_220_0 = var54 * (-var53 + 4096);
                                          stackIn_222_0 = stackOut_220_0;
                                          break L100;
                                        }
                                      }
                                      var61 = stackIn_222_0;
                                      if (0 == 0) {
                                        break L94;
                                      } else {
                                        break L99;
                                      }
                                    }
                                  }
                                  var57 = 0;
                                  var61 = 0;
                                  break L94;
                                }
                                L101: {
                                  var61 = var61 >> 16;
                                  var59 = var59 >> 16;
                                  var60 = var60 >> 16;
                                  var62 = var62 >> 16;
                                  if (128 > var62 + (var61 + (var59 - -var60))) {
                                    break L101;
                                  } else {
                                    var64 = var60 * (var56 & 16711935) + var59 * (16711935 & var55);
                                    var65 = var60 * (16711935 & var56 >>> -632653720) + ((-16711936 & var55) >>> 67362696) * var59;
                                    var64 = var64 + (var62 * (16711935 & var58) + var61 * (var57 & 16711935));
                                    var65 = var65 + (((var58 & -16711936) >>> 234373160) * var62 + (var57 >>> 16413480 & 16711935) * var61);
                                    var64 = var64 >> 254044552 & 16711935;
                                    var66 = var65 >>> 649304536;
                                    var65 = 65280 & var65;
                                    if (0 != var66) {
                                      param6[param12] = mp.a(128 + (var66 >> 2088265729) << -472066536, dda.a(var65 * var66, 16711680) + dda.a(-16711936, var64 * var66) >> 969130568);
                                      break L101;
                                    } else {
                                      break L101;
                                    }
                                  }
                                }
                                param12++;
                                var46++;
                                var51 = var51 + var22;
                                var52 = var52 + var23;
                                if (0 == 0) {
                                  continue L85;
                                } else {
                                  break L86;
                                }
                              }
                            }
                          }
                        }
                        param12 = param12 - var46;
                        param12 = param12 + param15;
                        param3 = param3 - var21;
                        param4 = param4 + var24;
                        var47++;
                        if (0 == 0) {
                          continue L82;
                        } else {
                          break L16;
                        }
                      }
                    }
                  }
                }
                return;
              }
            }
          }
        } else {
          return;
        }
    }

    final static String a(String param0, int param1, java.applet.Applet param2) {
        try {
            String var3 = null;
            Throwable var3_ref = null;
            String[] var4 = null;
            int var5 = 0;
            int var6 = 0;
            int var7 = 0;
            String stackIn_8_0 = null;
            String stackOut_7_0 = null;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        var7 = BachelorFridge.field_y;
                        statePc = 1;
                        continue stateLoop;
                    }
                    case 1: {
                        try {
                            if (param1 == 61) {
                                statePc = 3;
                            } else {
                                statePc = 2;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_1) {
                            caughtException = stateCaught_1;
                            statePc = 11;
                            continue stateLoop;
                        }
                    }
                    case 2: {
                        try {
                            field_o = null;
                            statePc = 3;
                            continue stateLoop;
                        } catch (Throwable stateCaught_2) {
                            caughtException = stateCaught_2;
                            statePc = 11;
                            continue stateLoop;
                        }
                    }
                    case 3: {
                        try {
                            var3 = (String) ac.a(param2, "getcookies", (byte) 64);
                            var4 = fda.a(-1, ';', var3);
                            var5 = 0;
                            statePc = 4;
                            continue stateLoop;
                        } catch (Throwable stateCaught_3) {
                            caughtException = stateCaught_3;
                            statePc = 11;
                            continue stateLoop;
                        }
                    }
                    case 4: {
                        try {
                            if (var4.length <= var5) {
                                statePc = 12;
                            } else {
                                statePc = 5;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_4) {
                            caughtException = stateCaught_4;
                            statePc = 11;
                            continue stateLoop;
                        }
                    }
                    case 5: {
                        try {
                            var6 = var4[var5].indexOf('=');
                            if (var6 < 0) {
                                statePc = 9;
                            } else {
                                statePc = 6;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_5) {
                            caughtException = stateCaught_5;
                            statePc = 11;
                            continue stateLoop;
                        }
                    }
                    case 6: {
                        try {
                            if (!var4[var5].substring(0, var6).trim().equals((Object) (Object) param0)) {
                                statePc = 9;
                            } else {
                                statePc = 7;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_6) {
                            caughtException = stateCaught_6;
                            statePc = 11;
                            continue stateLoop;
                        }
                    }
                    case 7: {
                        try {
                            stackOut_7_0 = var4[var5].substring(var6 - -1).trim();
                            stackIn_8_0 = stackOut_7_0;
                            statePc = 8;
                            continue stateLoop;
                        } catch (Throwable stateCaught_7) {
                            caughtException = stateCaught_7;
                            statePc = 11;
                            continue stateLoop;
                        }
                    }
                    case 8: {
                        return (String) (Object) stackIn_8_0;
                    }
                    case 9: {
                        try {
                            var5++;
                            statePc = 4;
                            continue stateLoop;
                        } catch (Throwable stateCaught_9) {
                            caughtException = stateCaught_9;
                            statePc = 11;
                            continue stateLoop;
                        }
                    }
                    case 11: {
                        var3_ref = caughtException;
                        statePc = 12;
                        continue stateLoop;
                    }
                    case 12: {
                        return null;
                    }
                    default: throw new IllegalStateException("invalid CFG state " + statePc);
                }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final void a(boolean param0, op param1) {
        if (param0) {
            field_p = null;
        }
        param1.field_a[((fi) this).field_r][((fi) this).field_q].field_j = param1.field_a[((fi) this).field_r][((fi) this).field_q].field_j + 1;
    }

    final void b(lu param0, byte param1) {
        param0.d(((fi) this).field_r, 0);
        param0.d(((fi) this).field_q, 0);
        int var3 = 20 / ((37 - param1) / 38);
    }

    final void a(ub param0, int param1) {
        gj var3 = param0.field_o;
        if (param1 >= -2) {
            field_o = null;
        }
        ((fi) this).a(false, var3.field_h);
        aca var4 = new aca(var3, ((fi) this).field_r, ((fi) this).field_q, false);
        ((kj) (Object) var4).a(0);
        var3.field_s.field_F = 0;
    }

    fi(int param0, int param1) {
        ((fi) this).field_q = param1;
        ((fi) this).field_j = 4;
        ((fi) this).field_r = param0;
    }

    fi(lu param0) {
        ((fi) this).field_j = 4;
        ((fi) this).field_r = param0.b(16711935);
        ((fi) this).field_q = param0.b(16711935);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_o = "Creature viewer. Examine a creature and click the tooltips to continue.";
    }
}
