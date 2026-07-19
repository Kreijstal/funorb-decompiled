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
            field_m = (js) null;
        }
        field_o = null;
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, kv param5, int[] param6, int param7, int param8, int param9, int param10, int param11, int param12, int param13, int param14, int param15, int[] param16) {
        RuntimeException var17 = null;
        int var17_int = 0;
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
        RuntimeException stackIn_232_0 = null;
        StringBuilder stackIn_232_1 = null;
        RuntimeException stackIn_233_0 = null;
        StringBuilder stackIn_233_1 = null;
        RuntimeException stackIn_234_0 = null;
        StringBuilder stackIn_234_1 = null;
        String stackIn_234_2 = null;
        RuntimeException stackIn_235_0 = null;
        StringBuilder stackIn_235_1 = null;
        RuntimeException stackIn_236_0 = null;
        StringBuilder stackIn_236_1 = null;
        RuntimeException stackIn_237_0 = null;
        StringBuilder stackIn_237_1 = null;
        String stackIn_237_2 = null;
        RuntimeException stackIn_238_0 = null;
        StringBuilder stackIn_238_1 = null;
        RuntimeException stackIn_239_0 = null;
        StringBuilder stackIn_239_1 = null;
        RuntimeException stackIn_240_0 = null;
        StringBuilder stackIn_240_1 = null;
        String stackIn_240_2 = null;
        int decompiledRegionSelector0 = 0;
        Throwable caughtException = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_200_0 = 0;
        int stackOut_199_0 = 0;
        int stackOut_207_0 = 0;
        int stackOut_206_0 = 0;
        int stackOut_216_0 = 0;
        int stackOut_215_0 = 0;
        int stackOut_221_0 = 0;
        int stackOut_220_0 = 0;
        int stackOut_157_0 = 0;
        int stackOut_156_0 = 0;
        int stackOut_162_0 = 0;
        int stackOut_161_0 = 0;
        int stackOut_169_0 = 0;
        int stackOut_168_0 = 0;
        int stackOut_175_0 = 0;
        int stackOut_174_0 = 0;
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
        RuntimeException stackOut_231_0 = null;
        StringBuilder stackOut_231_1 = null;
        RuntimeException stackOut_233_0 = null;
        StringBuilder stackOut_233_1 = null;
        String stackOut_233_2 = null;
        RuntimeException stackOut_232_0 = null;
        StringBuilder stackOut_232_1 = null;
        String stackOut_232_2 = null;
        RuntimeException stackOut_234_0 = null;
        StringBuilder stackOut_234_1 = null;
        RuntimeException stackOut_236_0 = null;
        StringBuilder stackOut_236_1 = null;
        String stackOut_236_2 = null;
        RuntimeException stackOut_235_0 = null;
        StringBuilder stackOut_235_1 = null;
        String stackOut_235_2 = null;
        RuntimeException stackOut_237_0 = null;
        StringBuilder stackOut_237_1 = null;
        RuntimeException stackOut_239_0 = null;
        StringBuilder stackOut_239_1 = null;
        String stackOut_239_2 = null;
        RuntimeException stackOut_238_0 = null;
        StringBuilder stackOut_238_1 = null;
        String stackOut_238_2 = null;
        var67 = BachelorFridge.field_y;
        try {
          L0: {
            L1: {
              if (param10 == 0) {
                break L1;
              } else {
                if (param14 == 0) {
                  break L1;
                } else {
                  L2: {
                    var17_int = param5.field_q;
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
                    var27 = ((var17_int << 1594990116) - param0) * var22 + -param1 * var23;
                    var28 = -param1 * var24 + var21 * -((var17_int << 530432196) + -param0);
                    var29 = var23 * (-param1 + (var18 << 924030148)) + -param0 * var22;
                    var30 = var24 * (-param1 + (var18 << -73192860)) + --param0 * var21;
                    var31 = ((var17_int << 574294948) - param0) * var22 + var23 * (-param1 + (var18 << -1503407804));
                    var32 = var21 * -((var17_int << 1392286308) - param0) + var24 * (-param1 + (var18 << 1235063108));
                    if (var25 >= var27) {
                      var33 = var27;
                      var34 = var25;
                      break L2;
                    } else {
                      var34 = var27;
                      var33 = var25;
                      break L2;
                    }
                  }
                  L3: {
                    if (var33 > var29) {
                      var33 = var29;
                      break L3;
                    } else {
                      break L3;
                    }
                  }
                  L4: {
                    if (var31 < var33) {
                      var33 = var31;
                      break L4;
                    } else {
                      break L4;
                    }
                  }
                  L5: {
                    if (var34 < var29) {
                      var34 = var29;
                      break L5;
                    } else {
                      break L5;
                    }
                  }
                  L6: {
                    if (var31 <= var34) {
                      break L6;
                    } else {
                      var34 = var31;
                      break L6;
                    }
                  }
                  L7: {
                    if (var28 <= var26) {
                      var35 = var28;
                      var36 = var26;
                      break L7;
                    } else {
                      var35 = var26;
                      var36 = var28;
                      break L7;
                    }
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
                  if (-1 >= (var34 ^ -1)) {
                    decompiledRegionSelector0 = 1;
                    break L0;
                  } else {
                    var36 = var35 - var36;
                    var37 = -127 / ((param8 - 12) / 54);
                    if (var36 >= 0) {
                      decompiledRegionSelector0 = 2;
                      break L0;
                    } else {
                      L16: {
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
                        var49 = var17_int << -1867216564;
                        var50 = var18 << 1994815244;
                        if ((var22 ^ -1) > -1) {
                          if (-1 >= (var23 ^ -1)) {
                            var47 = var36;
                            L17: while (true) {
                              if (0 == var47) {
                                break L16;
                              } else {
                                L18: {
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
                                    break L18;
                                  } else {
                                    break L18;
                                  }
                                }
                                L19: {
                                  var48 = 4096 + var52;
                                  if (0 <= 4096 + var52) {
                                    break L19;
                                  } else {
                                    var48 = (-var48 + (var23 + -1)) / var23;
                                    var51 = var51 + var48 * var22;
                                    var46 = var46 + var48;
                                    var52 = var52 + var23 * var48;
                                    param12 = param12 + var48;
                                    break L19;
                                  }
                                }
                                L20: while (true) {
                                  L21: {
                                    if (var46 == 0) {
                                      break L21;
                                    } else {
                                      if (var51 < -4096) {
                                        break L21;
                                      } else {
                                        param7 = var52 >> -1197030196;
                                        if (var52 >> -1197030196 >= var18) {
                                          break L21;
                                        } else {
                                          L22: {
                                            var54 = var52;
                                            param9 = var51 >> -1364423860;
                                            var53 = var51;
                                            var54 = var54 & 4095;
                                            var53 = var53 & 4095;
                                            var63 = param9 + var17_int * param7;
                                            if (param7 < 0) {
                                              var60 = 0;
                                              var59 = 0;
                                              var56 = 0;
                                              var55 = 0;
                                              break L22;
                                            } else {
                                              L23: {
                                                if ((param9 ^ -1) > -1) {
                                                  var59 = 0;
                                                  var55 = 0;
                                                  break L23;
                                                } else {
                                                  L24: {
                                                    var55 = param16[var63];
                                                    if ((-16777216 & var55) == 0) {
                                                      stackOut_200_0 = 0;
                                                      stackIn_201_0 = stackOut_200_0;
                                                      break L24;
                                                    } else {
                                                      stackOut_199_0 = (4096 + -var53) * (4096 - var54);
                                                      stackIn_201_0 = stackOut_199_0;
                                                      break L24;
                                                    }
                                                  }
                                                  var59 = stackIn_201_0;
                                                  break L23;
                                                }
                                              }
                                              if (param9 < var17_int + -1) {
                                                L25: {
                                                  var56 = param16[1 + var63];
                                                  if ((var56 & -16777216) != 0) {
                                                    stackOut_207_0 = var53 * (4096 - var54);
                                                    stackIn_208_0 = stackOut_207_0;
                                                    break L25;
                                                  } else {
                                                    stackOut_206_0 = 0;
                                                    stackIn_208_0 = stackOut_206_0;
                                                    break L25;
                                                  }
                                                }
                                                var60 = stackIn_208_0;
                                                break L22;
                                              } else {
                                                var60 = 0;
                                                var56 = 0;
                                                break L22;
                                              }
                                            }
                                          }
                                          L26: {
                                            if (var18 + -1 > param7) {
                                              L27: {
                                                if (var17_int - 1 > param9) {
                                                  L28: {
                                                    var58 = param16[var17_int + (var63 - -1)];
                                                    if ((var58 & -16777216) != 0) {
                                                      stackOut_216_0 = var53 * var54;
                                                      stackIn_217_0 = stackOut_216_0;
                                                      break L28;
                                                    } else {
                                                      stackOut_215_0 = 0;
                                                      stackIn_217_0 = stackOut_215_0;
                                                      break L28;
                                                    }
                                                  }
                                                  var62 = stackIn_217_0;
                                                  break L27;
                                                } else {
                                                  var62 = 0;
                                                  var58 = 0;
                                                  break L27;
                                                }
                                              }
                                              if (0 > param9) {
                                                var57 = 0;
                                                var61 = 0;
                                                break L26;
                                              } else {
                                                L29: {
                                                  var57 = param16[var17_int + var63];
                                                  if (-1 == (-16777216 & var57 ^ -1)) {
                                                    stackOut_221_0 = 0;
                                                    stackIn_222_0 = stackOut_221_0;
                                                    break L29;
                                                  } else {
                                                    stackOut_220_0 = var54 * (-var53 + 4096);
                                                    stackIn_222_0 = stackOut_220_0;
                                                    break L29;
                                                  }
                                                }
                                                var61 = stackIn_222_0;
                                                break L26;
                                              }
                                            } else {
                                              var57 = 0;
                                              var58 = 0;
                                              var61 = 0;
                                              var62 = 0;
                                              break L26;
                                            }
                                          }
                                          L30: {
                                            var61 = var61 >> 16;
                                            var59 = var59 >> 16;
                                            var60 = var60 >> 16;
                                            var62 = var62 >> 16;
                                            if (128 > var62 + (var61 + (var59 - -var60))) {
                                              break L30;
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
                                                break L30;
                                              } else {
                                                break L30;
                                              }
                                            }
                                          }
                                          param12++;
                                          var46++;
                                          var51 = var51 + var22;
                                          var52 = var52 + var23;
                                          continue L20;
                                        }
                                      }
                                    }
                                  }
                                  param12 = param12 - var46;
                                  param12 = param12 + param15;
                                  param3 = param3 - var21;
                                  param4 = param4 + var24;
                                  var47++;
                                  continue L17;
                                }
                              }
                            }
                          } else {
                            var47 = var36;
                            L31: while (true) {
                              if (var47 == 0) {
                                break L16;
                              } else {
                                L32: {
                                  var46 = var34;
                                  var52 = var45 + param4;
                                  var51 = var44 + param3;
                                  var48 = -var49 + var51;
                                  if (-1 < (-var49 + var51 ^ -1)) {
                                    break L32;
                                  } else {
                                    var48 = (var22 - var48) / var22;
                                    var46 = var46 + var48;
                                    var51 = var51 + var22 * var48;
                                    param12 = param12 + var48;
                                    var52 = var52 + var48 * var23;
                                    break L32;
                                  }
                                }
                                L33: {
                                  var48 = -var50 + var52;
                                  if (-var50 + var52 >= 0) {
                                    var48 = (-var48 + var23) / var23;
                                    var46 = var46 + var48;
                                    param12 = param12 + var48;
                                    var52 = var52 + var23 * var48;
                                    var51 = var51 + var48 * var22;
                                    break L33;
                                  } else {
                                    break L33;
                                  }
                                }
                                L34: while (true) {
                                  L35: {
                                    if (-1 == (var46 ^ -1)) {
                                      break L35;
                                    } else {
                                      if (var51 < -4096) {
                                        break L35;
                                      } else {
                                        if (4095 < (var52 ^ -1)) {
                                          break L35;
                                        } else {
                                          L36: {
                                            param7 = var52 >> -593811156;
                                            var53 = var51;
                                            param9 = var51 >> 469462668;
                                            var54 = var52;
                                            var54 = var54 & 4095;
                                            var63 = param9 + param7 * var17_int;
                                            var53 = var53 & 4095;
                                            if (-1 >= (param7 ^ -1)) {
                                              L37: {
                                                if (var17_int + -1 > param9) {
                                                  L38: {
                                                    var56 = param16[1 + var63];
                                                    if ((-16777216 & var56) != 0) {
                                                      stackOut_157_0 = (4096 + -var54) * var53;
                                                      stackIn_158_0 = stackOut_157_0;
                                                      break L38;
                                                    } else {
                                                      stackOut_156_0 = 0;
                                                      stackIn_158_0 = stackOut_156_0;
                                                      break L38;
                                                    }
                                                  }
                                                  var60 = stackIn_158_0;
                                                  break L37;
                                                } else {
                                                  var60 = 0;
                                                  var56 = 0;
                                                  break L37;
                                                }
                                              }
                                              if (-1 < (param9 ^ -1)) {
                                                var59 = 0;
                                                var55 = 0;
                                                break L36;
                                              } else {
                                                L39: {
                                                  var55 = param16[var63];
                                                  if ((var55 & -16777216) == 0) {
                                                    stackOut_162_0 = 0;
                                                    stackIn_163_0 = stackOut_162_0;
                                                    break L39;
                                                  } else {
                                                    stackOut_161_0 = (4096 - var53) * (-var54 + 4096);
                                                    stackIn_163_0 = stackOut_161_0;
                                                    break L39;
                                                  }
                                                }
                                                var59 = stackIn_163_0;
                                                break L36;
                                              }
                                            } else {
                                              var56 = 0;
                                              var60 = 0;
                                              var59 = 0;
                                              var55 = 0;
                                              break L36;
                                            }
                                          }
                                          L40: {
                                            if (var18 - 1 <= param7) {
                                              var57 = 0;
                                              var58 = 0;
                                              var61 = 0;
                                              var62 = 0;
                                              break L40;
                                            } else {
                                              L41: {
                                                if (-1 + var17_int <= param9) {
                                                  var62 = 0;
                                                  var58 = 0;
                                                  break L41;
                                                } else {
                                                  L42: {
                                                    var58 = param16[1 + var17_int + var63];
                                                    if ((var58 & -16777216) == 0) {
                                                      stackOut_169_0 = 0;
                                                      stackIn_170_0 = stackOut_169_0;
                                                      break L42;
                                                    } else {
                                                      stackOut_168_0 = var53 * var54;
                                                      stackIn_170_0 = stackOut_168_0;
                                                      break L42;
                                                    }
                                                  }
                                                  var62 = stackIn_170_0;
                                                  break L41;
                                                }
                                              }
                                              if (0 > param9) {
                                                var57 = 0;
                                                var61 = 0;
                                                break L40;
                                              } else {
                                                L43: {
                                                  var57 = param16[var63 + var17_int];
                                                  if ((var57 & -16777216) == 0) {
                                                    stackOut_175_0 = 0;
                                                    stackIn_176_0 = stackOut_175_0;
                                                    break L43;
                                                  } else {
                                                    stackOut_174_0 = var54 * (4096 + -var53);
                                                    stackIn_176_0 = stackOut_174_0;
                                                    break L43;
                                                  }
                                                }
                                                var61 = stackIn_176_0;
                                                break L40;
                                              }
                                            }
                                          }
                                          L44: {
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
                                                break L44;
                                              } else {
                                                break L44;
                                              }
                                            } else {
                                              break L44;
                                            }
                                          }
                                          var51 = var51 + var22;
                                          var52 = var52 + var23;
                                          param12++;
                                          var46++;
                                          continue L34;
                                        }
                                      }
                                    }
                                  }
                                  param12 = param12 - var46;
                                  param12 = param12 + param15;
                                  param4 = param4 + var24;
                                  var47++;
                                  param3 = param3 - var21;
                                  continue L31;
                                }
                              }
                            }
                          }
                        } else {
                          L45: {
                            if (var21 >= 0) {
                              break L45;
                            } else {
                              if ((var23 ^ -1) <= -1) {
                                break L45;
                              } else {
                                var47 = var36;
                                L46: while (true) {
                                  if (var47 == 0) {
                                    break L16;
                                  } else {
                                    L47: {
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
                                        break L47;
                                      } else {
                                        break L47;
                                      }
                                    }
                                    L48: {
                                      var48 = var52 - var50;
                                      if (var52 - var50 < 0) {
                                        break L48;
                                      } else {
                                        var48 = (var23 - var48) / var23;
                                        param12 = param12 + var48;
                                        var51 = var51 + var48 * var22;
                                        var46 = var46 + var48;
                                        var52 = var52 + var48 * var23;
                                        break L48;
                                      }
                                    }
                                    L49: while (true) {
                                      L50: {
                                        if (-1 == (var46 ^ -1)) {
                                          break L50;
                                        } else {
                                          if (4095 < (var52 ^ -1)) {
                                            break L50;
                                          } else {
                                            param9 = var51 >> 1446381452;
                                            if (var17_int <= var51 >> 1446381452) {
                                              break L50;
                                            } else {
                                              L51: {
                                                param7 = var52 >> -83587028;
                                                var53 = var51;
                                                var54 = var52;
                                                var63 = param9 + param7 * var17_int;
                                                var54 = var54 & 4095;
                                                var53 = var53 & 4095;
                                                if (-1 + var18 > param7) {
                                                  L52: {
                                                    if (-1 + var17_int > param9) {
                                                      L53: {
                                                        var58 = param16[1 + (var63 - -var17_int)];
                                                        if (0 != (var58 & -16777216)) {
                                                          stackOut_65_0 = var53 * var54;
                                                          stackIn_66_0 = stackOut_65_0;
                                                          break L53;
                                                        } else {
                                                          stackOut_64_0 = 0;
                                                          stackIn_66_0 = stackOut_64_0;
                                                          break L53;
                                                        }
                                                      }
                                                      var62 = stackIn_66_0;
                                                      break L52;
                                                    } else {
                                                      var58 = 0;
                                                      var62 = 0;
                                                      break L52;
                                                    }
                                                  }
                                                  if (param9 >= 0) {
                                                    L54: {
                                                      var57 = param16[var17_int + var63];
                                                      if ((-16777216 & var57) != 0) {
                                                        stackOut_71_0 = var54 * (4096 - var53);
                                                        stackIn_72_0 = stackOut_71_0;
                                                        break L54;
                                                      } else {
                                                        stackOut_70_0 = 0;
                                                        stackIn_72_0 = stackOut_70_0;
                                                        break L54;
                                                      }
                                                    }
                                                    var61 = stackIn_72_0;
                                                    break L51;
                                                  } else {
                                                    var57 = 0;
                                                    var61 = 0;
                                                    break L51;
                                                  }
                                                } else {
                                                  var57 = 0;
                                                  var58 = 0;
                                                  var61 = 0;
                                                  var62 = 0;
                                                  break L51;
                                                }
                                              }
                                              L55: {
                                                if (-1 >= (param7 ^ -1)) {
                                                  L56: {
                                                    if (param9 >= 0) {
                                                      L57: {
                                                        var55 = param16[var63];
                                                        if ((var55 & -16777216) != 0) {
                                                          stackOut_79_0 = (-var53 + 4096) * (-var54 + 4096);
                                                          stackIn_80_0 = stackOut_79_0;
                                                          break L57;
                                                        } else {
                                                          stackOut_78_0 = 0;
                                                          stackIn_80_0 = stackOut_78_0;
                                                          break L57;
                                                        }
                                                      }
                                                      var59 = stackIn_80_0;
                                                      break L56;
                                                    } else {
                                                      var59 = 0;
                                                      var55 = 0;
                                                      break L56;
                                                    }
                                                  }
                                                  if (-1 + var17_int <= param9) {
                                                    var56 = 0;
                                                    var60 = 0;
                                                    break L55;
                                                  } else {
                                                    L58: {
                                                      var56 = param16[var63 + 1];
                                                      if (0 != (var56 & -16777216)) {
                                                        stackOut_84_0 = var53 * (-var54 + 4096);
                                                        stackIn_85_0 = stackOut_84_0;
                                                        break L58;
                                                      } else {
                                                        stackOut_83_0 = 0;
                                                        stackIn_85_0 = stackOut_83_0;
                                                        break L58;
                                                      }
                                                    }
                                                    var60 = stackIn_85_0;
                                                    break L55;
                                                  }
                                                } else {
                                                  var55 = 0;
                                                  var56 = 0;
                                                  var60 = 0;
                                                  var59 = 0;
                                                  break L55;
                                                }
                                              }
                                              L59: {
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
                                                  if (-1 != (var66 ^ -1)) {
                                                    param6[param12] = mp.a((var66 >> 830278049) + 128 << -1949244264, dda.a(var64 * var66, -16711936) + dda.a(16711680, var65 * var66) >> -1431374968);
                                                    break L59;
                                                  } else {
                                                    break L59;
                                                  }
                                                } else {
                                                  break L59;
                                                }
                                              }
                                              var51 = var51 + var22;
                                              param12++;
                                              var52 = var52 + var23;
                                              var46++;
                                              continue L49;
                                            }
                                          }
                                        }
                                      }
                                      param12 = param12 - var46;
                                      param3 = param3 - var21;
                                      param4 = param4 + var24;
                                      param12 = param12 + param15;
                                      var47++;
                                      continue L46;
                                    }
                                  }
                                }
                              }
                            }
                          }
                          var47 = var36;
                          L60: while (true) {
                            if (var47 == 0) {
                              break L16;
                            } else {
                              L61: {
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
                                  break L61;
                                } else {
                                  break L61;
                                }
                              }
                              L62: {
                                L63: {
                                  var48 = 4096 + var52;
                                  if (4096 + var52 >= 0) {
                                    break L63;
                                  } else {
                                    if (0 != var23) {
                                      var48 = (-var48 + (-1 + var23)) / var23;
                                      param12 = param12 + var48;
                                      var46 = var46 + var48;
                                      var52 = var52 + var48 * var23;
                                      var51 = var51 + var48 * var22;
                                      break L63;
                                    } else {
                                      param12 = param12 - var46;
                                      break L62;
                                    }
                                  }
                                }
                                L64: while (true) {
                                  L65: {
                                    if (0 == var46) {
                                      break L65;
                                    } else {
                                      param9 = var51 >> 1961964236;
                                      if (var17_int <= var51 >> 1961964236) {
                                        break L65;
                                      } else {
                                        param7 = var52 >> 1854145900;
                                        if (var18 <= var52 >> 1854145900) {
                                          break L65;
                                        } else {
                                          L66: {
                                            var54 = var52;
                                            var53 = var51;
                                            var63 = param9 + param7 * var17_int;
                                            var53 = var53 & 4095;
                                            var54 = var54 & 4095;
                                            if (param7 < 0) {
                                              var60 = 0;
                                              var59 = 0;
                                              var56 = 0;
                                              var55 = 0;
                                              break L66;
                                            } else {
                                              L67: {
                                                if ((param9 ^ -1) > -1) {
                                                  var55 = 0;
                                                  var59 = 0;
                                                  break L67;
                                                } else {
                                                  L68: {
                                                    var55 = param16[var63];
                                                    if ((var55 & -16777216) != 0) {
                                                      stackOut_110_0 = (-var54 + 4096) * (4096 + -var53);
                                                      stackIn_111_0 = stackOut_110_0;
                                                      break L68;
                                                    } else {
                                                      stackOut_109_0 = 0;
                                                      stackIn_111_0 = stackOut_109_0;
                                                      break L68;
                                                    }
                                                  }
                                                  var59 = stackIn_111_0;
                                                  break L67;
                                                }
                                              }
                                              if (-1 + var17_int <= param9) {
                                                var60 = 0;
                                                var56 = 0;
                                                break L66;
                                              } else {
                                                L69: {
                                                  var56 = param16[var63 + 1];
                                                  if ((-16777216 & var56) != 0) {
                                                    stackOut_116_0 = (4096 + -var54) * var53;
                                                    stackIn_117_0 = stackOut_116_0;
                                                    break L69;
                                                  } else {
                                                    stackOut_115_0 = 0;
                                                    stackIn_117_0 = stackOut_115_0;
                                                    break L69;
                                                  }
                                                }
                                                var60 = stackIn_117_0;
                                                break L66;
                                              }
                                            }
                                          }
                                          L70: {
                                            if (param7 >= var18 + -1) {
                                              var58 = 0;
                                              var61 = 0;
                                              var57 = 0;
                                              var62 = 0;
                                              break L70;
                                            } else {
                                              L71: {
                                                if (param9 >= -1 + var17_int) {
                                                  var58 = 0;
                                                  var62 = 0;
                                                  break L71;
                                                } else {
                                                  L72: {
                                                    var58 = param16[var63 + (var17_int + 1)];
                                                    if (0 == (-16777216 & var58)) {
                                                      stackOut_124_0 = 0;
                                                      stackIn_125_0 = stackOut_124_0;
                                                      break L72;
                                                    } else {
                                                      stackOut_123_0 = var54 * var53;
                                                      stackIn_125_0 = stackOut_123_0;
                                                      break L72;
                                                    }
                                                  }
                                                  var62 = stackIn_125_0;
                                                  break L71;
                                                }
                                              }
                                              if (0 <= param9) {
                                                L73: {
                                                  var57 = param16[var17_int + var63];
                                                  if ((-16777216 & var57) == 0) {
                                                    stackOut_131_0 = 0;
                                                    stackIn_132_0 = stackOut_131_0;
                                                    break L73;
                                                  } else {
                                                    stackOut_130_0 = (-var53 + 4096) * var54;
                                                    stackIn_132_0 = stackOut_130_0;
                                                    break L73;
                                                  }
                                                }
                                                var61 = stackIn_132_0;
                                                break L70;
                                              } else {
                                                var61 = 0;
                                                var57 = 0;
                                                break L70;
                                              }
                                            }
                                          }
                                          L74: {
                                            var59 = var59 >> 16;
                                            var62 = var62 >> 16;
                                            var60 = var60 >> 16;
                                            var61 = var61 >> 16;
                                            if (-129 < (var60 + var59 - (-var61 + -var62) ^ -1)) {
                                              break L74;
                                            } else {
                                              var64 = (var56 & 16711935) * var60 + var59 * (16711935 & var55);
                                              var65 = (16711935 & var55 >>> 1426439720) * var59 + var60 * ((-16711936 & var56) >>> -1125305048);
                                              var64 = var64 + (var61 * (var57 & 16711935) + (16711935 & var58) * var62);
                                              var65 = var65 + (var62 * ((-16711936 & var58) >>> -486145880) + (16711935 & var57 >>> 498509256) * var61);
                                              var64 = 16711935 & var64 >> 738873128;
                                              var66 = var65 >>> 893213912;
                                              var65 = var65 & 65280;
                                              if (-1 == (var66 ^ -1)) {
                                                break L74;
                                              } else {
                                                param6[param12] = mp.a(dda.a(var66 * var64, -16711936) - -dda.a(var66 * var65, 16711680) >> 1110433736, (var66 >> 1281733281) + 128 << -257600776);
                                                break L74;
                                              }
                                            }
                                          }
                                          var46++;
                                          param12++;
                                          var52 = var52 + var23;
                                          var51 = var51 + var22;
                                          continue L64;
                                        }
                                      }
                                    }
                                  }
                                  param12 = param12 - var46;
                                  break L62;
                                }
                              }
                              var47++;
                              param12 = param12 + param15;
                              param3 = param3 - var21;
                              param4 = param4 + var24;
                              continue L60;
                            }
                          }
                        }
                      }
                      decompiledRegionSelector0 = 3;
                      break L0;
                    }
                  }
                }
              }
            }
            decompiledRegionSelector0 = 0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L75: {
            var17 = decompiledCaughtException;
            stackOut_231_0 = (RuntimeException) (var17);
            stackOut_231_1 = new StringBuilder().append("fi.D(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');
            stackIn_233_0 = stackOut_231_0;
            stackIn_233_1 = stackOut_231_1;
            stackIn_232_0 = stackOut_231_0;
            stackIn_232_1 = stackOut_231_1;
            if (param5 == null) {
              stackOut_233_0 = (RuntimeException) ((Object) stackIn_233_0);
              stackOut_233_1 = (StringBuilder) ((Object) stackIn_233_1);
              stackOut_233_2 = "null";
              stackIn_234_0 = stackOut_233_0;
              stackIn_234_1 = stackOut_233_1;
              stackIn_234_2 = stackOut_233_2;
              break L75;
            } else {
              stackOut_232_0 = (RuntimeException) ((Object) stackIn_232_0);
              stackOut_232_1 = (StringBuilder) ((Object) stackIn_232_1);
              stackOut_232_2 = "{...}";
              stackIn_234_0 = stackOut_232_0;
              stackIn_234_1 = stackOut_232_1;
              stackIn_234_2 = stackOut_232_2;
              break L75;
            }
          }
          L76: {
            stackOut_234_0 = (RuntimeException) ((Object) stackIn_234_0);
            stackOut_234_1 = ((StringBuilder) (Object) stackIn_234_1).append(stackIn_234_2).append(',');
            stackIn_236_0 = stackOut_234_0;
            stackIn_236_1 = stackOut_234_1;
            stackIn_235_0 = stackOut_234_0;
            stackIn_235_1 = stackOut_234_1;
            if (param6 == null) {
              stackOut_236_0 = (RuntimeException) ((Object) stackIn_236_0);
              stackOut_236_1 = (StringBuilder) ((Object) stackIn_236_1);
              stackOut_236_2 = "null";
              stackIn_237_0 = stackOut_236_0;
              stackIn_237_1 = stackOut_236_1;
              stackIn_237_2 = stackOut_236_2;
              break L76;
            } else {
              stackOut_235_0 = (RuntimeException) ((Object) stackIn_235_0);
              stackOut_235_1 = (StringBuilder) ((Object) stackIn_235_1);
              stackOut_235_2 = "{...}";
              stackIn_237_0 = stackOut_235_0;
              stackIn_237_1 = stackOut_235_1;
              stackIn_237_2 = stackOut_235_2;
              break L76;
            }
          }
          L77: {
            stackOut_237_0 = (RuntimeException) ((Object) stackIn_237_0);
            stackOut_237_1 = ((StringBuilder) (Object) stackIn_237_1).append(stackIn_237_2).append(',').append(param7).append(',').append(param8).append(',').append(param9).append(',').append(param10).append(',').append(param11).append(',').append(param12).append(',').append(param13).append(',').append(param14).append(',').append(param15).append(',');
            stackIn_239_0 = stackOut_237_0;
            stackIn_239_1 = stackOut_237_1;
            stackIn_238_0 = stackOut_237_0;
            stackIn_238_1 = stackOut_237_1;
            if (param16 == null) {
              stackOut_239_0 = (RuntimeException) ((Object) stackIn_239_0);
              stackOut_239_1 = (StringBuilder) ((Object) stackIn_239_1);
              stackOut_239_2 = "null";
              stackIn_240_0 = stackOut_239_0;
              stackIn_240_1 = stackOut_239_1;
              stackIn_240_2 = stackOut_239_2;
              break L77;
            } else {
              stackOut_238_0 = (RuntimeException) ((Object) stackIn_238_0);
              stackOut_238_1 = (StringBuilder) ((Object) stackIn_238_1);
              stackOut_238_2 = "{...}";
              stackIn_240_0 = stackOut_238_0;
              stackIn_240_1 = stackOut_238_1;
              stackIn_240_2 = stackOut_238_2;
              break L77;
            }
          }
          throw pe.a((Throwable) ((Object) stackIn_240_0), stackIn_240_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return;
            } else {
              return;
            }
          }
        }
    }

    final static String a(String param0, int param1, java.applet.Applet param2) {
        try {
            String var3 = null;
            Throwable var3_ref = null;
            RuntimeException var3_ref2 = null;
            String[] var4 = null;
            int var5 = 0;
            int var6 = 0;
            int var7 = 0;
            String stackIn_8_0 = null;
            Object stackIn_13_0 = null;
            RuntimeException stackIn_15_0 = null;
            StringBuilder stackIn_15_1 = null;
            RuntimeException stackIn_16_0 = null;
            StringBuilder stackIn_16_1 = null;
            RuntimeException stackIn_17_0 = null;
            StringBuilder stackIn_17_1 = null;
            String stackIn_17_2 = null;
            RuntimeException stackIn_18_0 = null;
            StringBuilder stackIn_18_1 = null;
            RuntimeException stackIn_19_0 = null;
            StringBuilder stackIn_19_1 = null;
            RuntimeException stackIn_20_0 = null;
            StringBuilder stackIn_20_1 = null;
            String stackIn_20_2 = null;
            int decompiledRegionSelector0 = 0;
            int decompiledRegionSelector1 = 0;
            Throwable decompiledCaughtException = null;
            String stackOut_7_0 = null;
            Object stackOut_12_0 = null;
            RuntimeException stackOut_14_0 = null;
            StringBuilder stackOut_14_1 = null;
            RuntimeException stackOut_16_0 = null;
            StringBuilder stackOut_16_1 = null;
            String stackOut_16_2 = null;
            RuntimeException stackOut_15_0 = null;
            StringBuilder stackOut_15_1 = null;
            String stackOut_15_2 = null;
            RuntimeException stackOut_17_0 = null;
            StringBuilder stackOut_17_1 = null;
            RuntimeException stackOut_19_0 = null;
            StringBuilder stackOut_19_1 = null;
            String stackOut_19_2 = null;
            RuntimeException stackOut_18_0 = null;
            StringBuilder stackOut_18_1 = null;
            String stackOut_18_2 = null;
            var7 = BachelorFridge.field_y;
            try {
              L0: {
                try {
                  L1: {
                    L2: {
                      if (param1 == 61) {
                        break L2;
                      } else {
                        field_o = (String) null;
                        break L2;
                      }
                    }
                    var3 = (String) (ac.a(param2, "getcookies", (byte) 64));
                    var4 = fda.a(-1, ';', var3);
                    var5 = 0;
                    L3: while (true) {
                      if (var4.length <= var5) {
                        decompiledRegionSelector0 = 0;
                        break L1;
                      } else {
                        L4: {
                          var6 = var4[var5].indexOf('=');
                          if (var6 < 0) {
                            break L4;
                          } else {
                            if (!var4[var5].substring(0, var6).trim().equals(param0)) {
                              break L4;
                            } else {
                              stackOut_7_0 = var4[var5].substring(var6 - -1).trim();
                              stackIn_8_0 = stackOut_7_0;
                              decompiledRegionSelector0 = 1;
                              break L1;
                            }
                          }
                        }
                        var5++;
                        continue L3;
                      }
                    }
                  }
                } catch (java.lang.Throwable decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  L5: {
                    var3_ref = decompiledCaughtException;
                    decompiledRegionSelector0 = 0;
                    break L5;
                  }
                }
                if (decompiledRegionSelector0 == 0) {
                  stackOut_12_0 = null;
                  stackIn_13_0 = stackOut_12_0;
                  decompiledRegionSelector1 = 0;
                  break L0;
                } else {
                  decompiledRegionSelector1 = 1;
                  break L0;
                }
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L6: {
                var3_ref2 = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_14_0 = (RuntimeException) (var3_ref2);
                stackOut_14_1 = new StringBuilder().append("fi.A(");
                stackIn_16_0 = stackOut_14_0;
                stackIn_16_1 = stackOut_14_1;
                stackIn_15_0 = stackOut_14_0;
                stackIn_15_1 = stackOut_14_1;
                if (param0 == null) {
                  stackOut_16_0 = (RuntimeException) ((Object) stackIn_16_0);
                  stackOut_16_1 = (StringBuilder) ((Object) stackIn_16_1);
                  stackOut_16_2 = "null";
                  stackIn_17_0 = stackOut_16_0;
                  stackIn_17_1 = stackOut_16_1;
                  stackIn_17_2 = stackOut_16_2;
                  break L6;
                } else {
                  stackOut_15_0 = (RuntimeException) ((Object) stackIn_15_0);
                  stackOut_15_1 = (StringBuilder) ((Object) stackIn_15_1);
                  stackOut_15_2 = "{...}";
                  stackIn_17_0 = stackOut_15_0;
                  stackIn_17_1 = stackOut_15_1;
                  stackIn_17_2 = stackOut_15_2;
                  break L6;
                }
              }
              L7: {
                stackOut_17_0 = (RuntimeException) ((Object) stackIn_17_0);
                stackOut_17_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_17_2).append(',').append(param1).append(',');
                stackIn_19_0 = stackOut_17_0;
                stackIn_19_1 = stackOut_17_1;
                stackIn_18_0 = stackOut_17_0;
                stackIn_18_1 = stackOut_17_1;
                if (param2 == null) {
                  stackOut_19_0 = (RuntimeException) ((Object) stackIn_19_0);
                  stackOut_19_1 = (StringBuilder) ((Object) stackIn_19_1);
                  stackOut_19_2 = "null";
                  stackIn_20_0 = stackOut_19_0;
                  stackIn_20_1 = stackOut_19_1;
                  stackIn_20_2 = stackOut_19_2;
                  break L7;
                } else {
                  stackOut_18_0 = (RuntimeException) ((Object) stackIn_18_0);
                  stackOut_18_1 = (StringBuilder) ((Object) stackIn_18_1);
                  stackOut_18_2 = "{...}";
                  stackIn_20_0 = stackOut_18_0;
                  stackIn_20_1 = stackOut_18_1;
                  stackIn_20_2 = stackOut_18_2;
                  break L7;
                }
              }
              throw pe.a((Throwable) ((Object) stackIn_20_0), stackIn_20_2 + ')');
            }
            if (decompiledRegionSelector1 == 0) {
              return (String) ((Object) stackIn_13_0);
            } else {
              return stackIn_8_0;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final void a(boolean param0, op param1) {
        try {
            if (param0) {
                field_p = (byte[]) null;
            }
            param1.field_a[this.field_r][this.field_q].field_j = param1.field_a[this.field_r][this.field_q].field_j + 1;
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) ((Object) runtimeException), "fi.C(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final void b(lu param0, byte param1) {
        try {
            param0.d(this.field_r, 0);
            param0.d(this.field_q, 0);
            int var3_int = 20 / ((37 - param1) / 38);
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) ((Object) runtimeException), "fi.E(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final void a(ub param0, int param1) {
        gj var3 = null;
        aca var4 = null;
        try {
            var3 = param0.field_o;
            if (param1 >= -2) {
                field_o = (String) null;
            }
            this.a(false, var3.field_h);
            var4 = new aca(var3, this.field_r, this.field_q, false);
            ((kj) ((Object) var4)).a(0);
            var3.field_s.field_F = 0;
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) ((Object) runtimeException), "fi.B(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    fi(int param0, int param1) {
        this.field_q = param1;
        this.field_j = 4;
        this.field_r = param0;
    }

    fi(lu param0) {
        try {
            this.field_j = 4;
            this.field_r = param0.b(16711935);
            this.field_q = param0.b(16711935);
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) ((Object) runtimeException), "fi.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_o = "Creature viewer. Examine a creature and click the tooltips to continue.";
    }
}
