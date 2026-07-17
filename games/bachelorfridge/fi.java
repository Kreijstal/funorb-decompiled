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
        field_o = null;
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, kv param5, int[] param6, int param7, int param8, int param9, int param10, int param11, int param12, int param13, int param14, int param15, int[] param16) {
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
        int stackIn_112_0 = 0;
        int stackIn_118_0 = 0;
        int stackIn_126_0 = 0;
        int stackIn_133_0 = 0;
        int stackIn_159_0 = 0;
        int stackIn_164_0 = 0;
        int stackIn_171_0 = 0;
        int stackIn_177_0 = 0;
        int stackIn_203_0 = 0;
        int stackIn_210_0 = 0;
        int stackIn_219_0 = 0;
        int stackIn_224_0 = 0;
        int stackOut_202_0 = 0;
        int stackOut_201_0 = 0;
        int stackOut_209_0 = 0;
        int stackOut_208_0 = 0;
        int stackOut_218_0 = 0;
        int stackOut_217_0 = 0;
        int stackOut_223_0 = 0;
        int stackOut_222_0 = 0;
        int stackOut_158_0 = 0;
        int stackOut_157_0 = 0;
        int stackOut_163_0 = 0;
        int stackOut_162_0 = 0;
        int stackOut_170_0 = 0;
        int stackOut_169_0 = 0;
        int stackOut_176_0 = 0;
        int stackOut_175_0 = 0;
        int stackOut_65_0 = 0;
        int stackOut_64_0 = 0;
        int stackOut_71_0 = 0;
        int stackOut_70_0 = 0;
        int stackOut_79_0 = 0;
        int stackOut_78_0 = 0;
        int stackOut_84_0 = 0;
        int stackOut_83_0 = 0;
        int stackOut_111_0 = 0;
        int stackOut_110_0 = 0;
        int stackOut_117_0 = 0;
        int stackOut_116_0 = 0;
        int stackOut_125_0 = 0;
        int stackOut_124_0 = 0;
        int stackOut_132_0 = 0;
        int stackOut_131_0 = 0;
        L0: {
          var67 = BachelorFridge.field_y;
          if (param10 == 0) {
            break L0;
          } else {
            if (param14 == 0) {
              break L0;
            } else {
              L1: {
                var17_int = param5.field_q;
                param1 = param1 - (param5.field_u << 4);
                param0 = param0 - (param5.field_t << 4);
                var18 = param5.field_p;
                var19 = 0.00009587379924285257 * (double)(param2 & 65535);
                var21 = (int)Math.floor((double)param10 * Math.sin(var19) + 0.5);
                var22 = (int)Math.floor(Math.cos(var19) * (double)param10 + 0.5);
                var23 = (int)Math.floor((double)param14 * Math.sin(var19) + 0.5);
                var24 = (int)Math.floor(Math.cos(var19) * (double)param14 + 0.5);
                var25 = var22 * -param0 + -param1 * var23;
                var26 = var24 * -param1 + --param0 * var21;
                var27 = ((var17_int << 4) - param0) * var22 + -param1 * var23;
                var28 = -param1 * var24 + var21 * -((var17_int << 4) + -param0);
                var29 = var23 * (-param1 + (var18 << 4)) + -param0 * var22;
                var30 = var24 * (-param1 + (var18 << 4)) + --param0 * var21;
                var31 = ((var17_int << 4) - param0) * var22 + var23 * (-param1 + (var18 << 4));
                var32 = var21 * -((var17_int << 4) - param0) + var24 * (-param1 + (var18 << 4));
                if (var25 >= var27) {
                  var33 = var27;
                  var34 = var25;
                  break L1;
                } else {
                  var34 = var27;
                  var33 = var25;
                  break L1;
                }
              }
              L2: {
                if (~var33 < ~var29) {
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
                if (~var34 > ~var29) {
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
                if (var28 <= var26) {
                  var35 = var28;
                  var36 = var26;
                  break L6;
                } else {
                  var35 = var26;
                  var36 = var28;
                  break L6;
                }
              }
              L7: {
                if (~var35 >= ~var30) {
                  break L7;
                } else {
                  var35 = var30;
                  break L7;
                }
              }
              L8: {
                if (var35 <= var32) {
                  break L8;
                } else {
                  var35 = var32;
                  break L8;
                }
              }
              L9: {
                if (~var36 > ~var30) {
                  var36 = var30;
                  break L9;
                } else {
                  break L9;
                }
              }
              L10: {
                if (~var32 >= ~var36) {
                  break L10;
                } else {
                  var36 = var32;
                  break L10;
                }
              }
              L11: {
                var33 = var33 >> 12;
                var34 = 4095 + var34 >> 12;
                var35 = var35 >> 12;
                var34 = var34 + param13;
                var33 = var33 + param13;
                var35 = var35 + param11;
                var36 = var36 + 4095 >> 12;
                var36 = var36 + param11;
                var35 = var35 >> 4;
                var34 = 15 + var34 >> 4;
                var33 = var33 >> 4;
                if (~dg.field_f >= ~var33) {
                  break L11;
                } else {
                  var33 = dg.field_f;
                  break L11;
                }
              }
              L12: {
                if (~dg.field_h > ~var34) {
                  var34 = dg.field_h;
                  break L12;
                } else {
                  break L12;
                }
              }
              L13: {
                if (dg.field_j <= var35) {
                  break L13;
                } else {
                  var35 = dg.field_j;
                  break L13;
                }
              }
              L14: {
                var36 = var36 - -15 >> 4;
                if (~var36 >= ~dg.field_k) {
                  break L14;
                } else {
                  var36 = dg.field_k;
                  break L14;
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
                  L15: {
                    param12 = var35 * dg.field_i + var33;
                    param15 = dg.field_i - -var34;
                    var38 = 16777216.0 / (double)param10;
                    var21 = (int)Math.floor(0.5 + var38 * Math.sin(var19));
                    var40 = 16777216.0 / (double)param14;
                    var22 = (int)Math.floor(0.5 + var38 * Math.cos(var19));
                    var23 = (int)Math.floor(0.5 + Math.sin(var19) * var40);
                    var24 = (int)Math.floor(Math.cos(var19) * var40 + 0.5);
                    var42 = (var33 << 4) - -8 + -param13;
                    var43 = -param11 + 8 + (var35 << 4);
                    param4 = (param1 << 8) - -(var24 * var43 >> 4);
                    param3 = -(var21 * var43 >> 4) + (param0 << 8);
                    var44 = var22 * var42 >> 4;
                    var45 = var23 * var42 >> 4;
                    var49 = var17_int << 12;
                    var50 = var18 << 12;
                    if (var22 < 0) {
                      if (var23 >= 0) {
                        var47 = var36;
                        L16: while (true) {
                          if (0 == var47) {
                            break L15;
                          } else {
                            L17: {
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
                                break L17;
                              } else {
                                break L17;
                              }
                            }
                            L18: {
                              var48 = 4096 + var52;
                              if (0 <= 4096 + var52) {
                                break L18;
                              } else {
                                var48 = (-var48 + (var23 + -1)) / var23;
                                var51 = var51 + var48 * var22;
                                var46 = var46 + var48;
                                var52 = var52 + var23 * var48;
                                param12 = param12 + var48;
                                break L18;
                              }
                            }
                            L19: while (true) {
                              L20: {
                                if (var46 == 0) {
                                  break L20;
                                } else {
                                  if (var51 < -4096) {
                                    break L20;
                                  } else {
                                    param7 = var52 >> 12;
                                    if (~(var52 >> 12) <= ~var18) {
                                      break L20;
                                    } else {
                                      L21: {
                                        var54 = var52;
                                        param9 = var51 >> 12;
                                        var53 = var51;
                                        var54 = var54 & 4095;
                                        var53 = var53 & 4095;
                                        var63 = param9 + var17_int * param7;
                                        if (param7 < 0) {
                                          var60 = 0;
                                          var59 = 0;
                                          var56 = 0;
                                          var55 = 0;
                                          break L21;
                                        } else {
                                          L22: {
                                            if (param9 < 0) {
                                              var59 = 0;
                                              var55 = 0;
                                              break L22;
                                            } else {
                                              L23: {
                                                var55 = param16[var63];
                                                if ((-16777216 & var55) == 0) {
                                                  stackOut_202_0 = 0;
                                                  stackIn_203_0 = stackOut_202_0;
                                                  break L23;
                                                } else {
                                                  stackOut_201_0 = (4096 + -var53) * (4096 - var54);
                                                  stackIn_203_0 = stackOut_201_0;
                                                  break L23;
                                                }
                                              }
                                              var59 = stackIn_203_0;
                                              break L22;
                                            }
                                          }
                                          if (~param9 > ~(var17_int + -1)) {
                                            L24: {
                                              var56 = param16[1 + var63];
                                              if ((var56 & -16777216) != 0) {
                                                stackOut_209_0 = var53 * (4096 - var54);
                                                stackIn_210_0 = stackOut_209_0;
                                                break L24;
                                              } else {
                                                stackOut_208_0 = 0;
                                                stackIn_210_0 = stackOut_208_0;
                                                break L24;
                                              }
                                            }
                                            var60 = stackIn_210_0;
                                            break L21;
                                          } else {
                                            var60 = 0;
                                            var56 = 0;
                                            break L21;
                                          }
                                        }
                                      }
                                      L25: {
                                        if (var18 + -1 > param7) {
                                          L26: {
                                            if (var17_int - 1 > param9) {
                                              L27: {
                                                var58 = param16[var17_int + (var63 - -1)];
                                                if ((var58 & -16777216) != 0) {
                                                  stackOut_218_0 = var53 * var54;
                                                  stackIn_219_0 = stackOut_218_0;
                                                  break L27;
                                                } else {
                                                  stackOut_217_0 = 0;
                                                  stackIn_219_0 = stackOut_217_0;
                                                  break L27;
                                                }
                                              }
                                              var62 = stackIn_219_0;
                                              break L26;
                                            } else {
                                              var62 = 0;
                                              var58 = 0;
                                              break L26;
                                            }
                                          }
                                          if (0 > param9) {
                                            var57 = 0;
                                            var61 = 0;
                                            break L25;
                                          } else {
                                            L28: {
                                              var57 = param16[var17_int + var63];
                                              if ((-16777216 & var57) == 0) {
                                                stackOut_223_0 = 0;
                                                stackIn_224_0 = stackOut_223_0;
                                                break L28;
                                              } else {
                                                stackOut_222_0 = var54 * (-var53 + 4096);
                                                stackIn_224_0 = stackOut_222_0;
                                                break L28;
                                              }
                                            }
                                            var61 = stackIn_224_0;
                                            break L25;
                                          }
                                        } else {
                                          var57 = 0;
                                          var58 = 0;
                                          var61 = 0;
                                          var62 = 0;
                                          break L25;
                                        }
                                      }
                                      L29: {
                                        var61 = var61 >> 16;
                                        var59 = var59 >> 16;
                                        var60 = var60 >> 16;
                                        var62 = var62 >> 16;
                                        if (128 > var62 + (var61 + (var59 - -var60))) {
                                          break L29;
                                        } else {
                                          var64 = var60 * (var56 & 16711935) + var59 * (16711935 & var55);
                                          var65 = var60 * (16711935 & var56 >>> 8) + ((-16711936 & var55) >>> 8) * var59;
                                          var64 = var64 + (var62 * (16711935 & var58) + var61 * (var57 & 16711935));
                                          var65 = var65 + (((var58 & -16711936) >>> 8) * var62 + (var57 >>> 8 & 16711935) * var61);
                                          var64 = var64 >> 8 & 16711935;
                                          var66 = var65 >>> 24;
                                          var65 = 65280 & var65;
                                          if (0 != var66) {
                                            param6[param12] = mp.a(128 + (var66 >> 1) << 24, dda.a(var65 * var66, 16711680) + dda.a(-16711936, var64 * var66) >> 8);
                                            break L29;
                                          } else {
                                            break L29;
                                          }
                                        }
                                      }
                                      param12++;
                                      var46++;
                                      var51 = var51 + var22;
                                      var52 = var52 + var23;
                                      continue L19;
                                    }
                                  }
                                }
                              }
                              param12 = param12 - var46;
                              param12 = param12 + param15;
                              param3 = param3 - var21;
                              param4 = param4 + var24;
                              var47++;
                              continue L16;
                            }
                          }
                        }
                      } else {
                        var47 = var36;
                        L30: while (true) {
                          if (var47 == 0) {
                            break L15;
                          } else {
                            L31: {
                              var46 = var34;
                              var52 = var45 + param4;
                              var51 = var44 + param3;
                              var48 = -var49 + var51;
                              if (-var49 + var51 < 0) {
                                break L31;
                              } else {
                                var48 = (var22 - var48) / var22;
                                var46 = var46 + var48;
                                var51 = var51 + var22 * var48;
                                param12 = param12 + var48;
                                var52 = var52 + var48 * var23;
                                break L31;
                              }
                            }
                            L32: {
                              var48 = -var50 + var52;
                              if (-var50 + var52 >= 0) {
                                var48 = (-var48 + var23) / var23;
                                var46 = var46 + var48;
                                param12 = param12 + var48;
                                var52 = var52 + var23 * var48;
                                var51 = var51 + var48 * var22;
                                break L32;
                              } else {
                                break L32;
                              }
                            }
                            L33: while (true) {
                              L34: {
                                if (var46 == 0) {
                                  break L34;
                                } else {
                                  if (var51 < -4096) {
                                    break L34;
                                  } else {
                                    if (var52 < -4096) {
                                      break L34;
                                    } else {
                                      L35: {
                                        param7 = var52 >> 12;
                                        var53 = var51;
                                        param9 = var51 >> 12;
                                        var54 = var52;
                                        var54 = var54 & 4095;
                                        var63 = param9 + param7 * var17_int;
                                        var53 = var53 & 4095;
                                        if (param7 >= 0) {
                                          L36: {
                                            if (~(var17_int + -1) < ~param9) {
                                              L37: {
                                                var56 = param16[1 + var63];
                                                if ((-16777216 & var56) != 0) {
                                                  stackOut_158_0 = (4096 + -var54) * var53;
                                                  stackIn_159_0 = stackOut_158_0;
                                                  break L37;
                                                } else {
                                                  stackOut_157_0 = 0;
                                                  stackIn_159_0 = stackOut_157_0;
                                                  break L37;
                                                }
                                              }
                                              var60 = stackIn_159_0;
                                              break L36;
                                            } else {
                                              var60 = 0;
                                              var56 = 0;
                                              break L36;
                                            }
                                          }
                                          if (param9 < 0) {
                                            var59 = 0;
                                            var55 = 0;
                                            break L35;
                                          } else {
                                            L38: {
                                              var55 = param16[var63];
                                              if ((var55 & -16777216) == 0) {
                                                stackOut_163_0 = 0;
                                                stackIn_164_0 = stackOut_163_0;
                                                break L38;
                                              } else {
                                                stackOut_162_0 = (4096 - var53) * (-var54 + 4096);
                                                stackIn_164_0 = stackOut_162_0;
                                                break L38;
                                              }
                                            }
                                            var59 = stackIn_164_0;
                                            break L35;
                                          }
                                        } else {
                                          var56 = 0;
                                          var60 = 0;
                                          var59 = 0;
                                          var55 = 0;
                                          break L35;
                                        }
                                      }
                                      L39: {
                                        if (~(var18 - 1) >= ~param7) {
                                          var57 = 0;
                                          var58 = 0;
                                          var61 = 0;
                                          var62 = 0;
                                          break L39;
                                        } else {
                                          L40: {
                                            if (~(-1 + var17_int) >= ~param9) {
                                              var62 = 0;
                                              var58 = 0;
                                              break L40;
                                            } else {
                                              L41: {
                                                var58 = param16[1 + var17_int + var63];
                                                if ((var58 & -16777216) == 0) {
                                                  stackOut_170_0 = 0;
                                                  stackIn_171_0 = stackOut_170_0;
                                                  break L41;
                                                } else {
                                                  stackOut_169_0 = var53 * var54;
                                                  stackIn_171_0 = stackOut_169_0;
                                                  break L41;
                                                }
                                              }
                                              var62 = stackIn_171_0;
                                              break L40;
                                            }
                                          }
                                          if (0 > param9) {
                                            var57 = 0;
                                            var61 = 0;
                                            break L39;
                                          } else {
                                            L42: {
                                              var57 = param16[var63 + var17_int];
                                              if ((var57 & -16777216) == 0) {
                                                stackOut_176_0 = 0;
                                                stackIn_177_0 = stackOut_176_0;
                                                break L42;
                                              } else {
                                                stackOut_175_0 = var54 * (4096 + -var53);
                                                stackIn_177_0 = stackOut_175_0;
                                                break L42;
                                              }
                                            }
                                            var61 = stackIn_177_0;
                                            break L39;
                                          }
                                        }
                                      }
                                      L43: {
                                        var59 = var59 >> 16;
                                        var60 = var60 >> 16;
                                        var62 = var62 >> 16;
                                        var61 = var61 >> 16;
                                        if (var62 + (var61 + var59) + var60 >= 128) {
                                          var64 = var59 * (var55 & 16711935) + (var56 & 16711935) * var60;
                                          var65 = var59 * (var55 >>> 8 & 16711935) + (16711935 & var56 >>> 8) * var60;
                                          var64 = var64 + (var61 * (16711935 & var57) + (16711935 & var58) * var62);
                                          var65 = var65 + (var61 * (16711935 & var57 >>> 8) + (var58 >>> 8 & 16711935) * var62);
                                          var66 = var65 >>> 24;
                                          var64 = var64 >> 8 & 16711935;
                                          var65 = 65280 & var65;
                                          if (var66 != 0) {
                                            param6[param12] = mp.a(128 + (var66 >> 1) << 24, dda.a(-16711936, var64 * var66) - -dda.a(var65 * var66, 16711680) >> 8);
                                            break L43;
                                          } else {
                                            break L43;
                                          }
                                        } else {
                                          break L43;
                                        }
                                      }
                                      var51 = var51 + var22;
                                      var52 = var52 + var23;
                                      param12++;
                                      var46++;
                                      continue L33;
                                    }
                                  }
                                }
                              }
                              param12 = param12 - var46;
                              param12 = param12 + param15;
                              param4 = param4 + var24;
                              var47++;
                              param3 = param3 - var21;
                              continue L30;
                            }
                          }
                        }
                      }
                    } else {
                      L44: {
                        if (var21 >= 0) {
                          break L44;
                        } else {
                          if (var23 >= 0) {
                            break L44;
                          } else {
                            var47 = var36;
                            L45: while (true) {
                              if (var47 == 0) {
                                break L15;
                              } else {
                                L46: {
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
                                    break L46;
                                  } else {
                                    break L46;
                                  }
                                }
                                L47: {
                                  var48 = var52 - var50;
                                  if (var52 - var50 < 0) {
                                    break L47;
                                  } else {
                                    var48 = (var23 - var48) / var23;
                                    param12 = param12 + var48;
                                    var51 = var51 + var48 * var22;
                                    var46 = var46 + var48;
                                    var52 = var52 + var48 * var23;
                                    break L47;
                                  }
                                }
                                L48: while (true) {
                                  L49: {
                                    if (var46 == 0) {
                                      break L49;
                                    } else {
                                      if (var52 < -4096) {
                                        break L49;
                                      } else {
                                        param9 = var51 >> 12;
                                        if (~var17_int >= ~(var51 >> 12)) {
                                          break L49;
                                        } else {
                                          L50: {
                                            param7 = var52 >> 12;
                                            var53 = var51;
                                            var54 = var52;
                                            var63 = param9 + param7 * var17_int;
                                            var54 = var54 & 4095;
                                            var53 = var53 & 4095;
                                            if (~(-1 + var18) < ~param7) {
                                              L51: {
                                                if (~(-1 + var17_int) < ~param9) {
                                                  L52: {
                                                    var58 = param16[1 + (var63 - -var17_int)];
                                                    if (0 != (var58 & -16777216)) {
                                                      stackOut_65_0 = var53 * var54;
                                                      stackIn_66_0 = stackOut_65_0;
                                                      break L52;
                                                    } else {
                                                      stackOut_64_0 = 0;
                                                      stackIn_66_0 = stackOut_64_0;
                                                      break L52;
                                                    }
                                                  }
                                                  var62 = stackIn_66_0;
                                                  break L51;
                                                } else {
                                                  var58 = 0;
                                                  var62 = 0;
                                                  break L51;
                                                }
                                              }
                                              if (param9 >= 0) {
                                                L53: {
                                                  var57 = param16[var17_int + var63];
                                                  if ((-16777216 & var57) != 0) {
                                                    stackOut_71_0 = var54 * (4096 - var53);
                                                    stackIn_72_0 = stackOut_71_0;
                                                    break L53;
                                                  } else {
                                                    stackOut_70_0 = 0;
                                                    stackIn_72_0 = stackOut_70_0;
                                                    break L53;
                                                  }
                                                }
                                                var61 = stackIn_72_0;
                                                break L50;
                                              } else {
                                                var57 = 0;
                                                var61 = 0;
                                                break L50;
                                              }
                                            } else {
                                              var57 = 0;
                                              var58 = 0;
                                              var61 = 0;
                                              var62 = 0;
                                              break L50;
                                            }
                                          }
                                          L54: {
                                            if (param7 >= 0) {
                                              L55: {
                                                if (param9 >= 0) {
                                                  L56: {
                                                    var55 = param16[var63];
                                                    if ((var55 & -16777216) != 0) {
                                                      stackOut_79_0 = (-var53 + 4096) * (-var54 + 4096);
                                                      stackIn_80_0 = stackOut_79_0;
                                                      break L56;
                                                    } else {
                                                      stackOut_78_0 = 0;
                                                      stackIn_80_0 = stackOut_78_0;
                                                      break L56;
                                                    }
                                                  }
                                                  var59 = stackIn_80_0;
                                                  break L55;
                                                } else {
                                                  var59 = 0;
                                                  var55 = 0;
                                                  break L55;
                                                }
                                              }
                                              if (~(-1 + var17_int) >= ~param9) {
                                                var56 = 0;
                                                var60 = 0;
                                                break L54;
                                              } else {
                                                L57: {
                                                  var56 = param16[var63 + 1];
                                                  if (0 != (var56 & -16777216)) {
                                                    stackOut_84_0 = var53 * (-var54 + 4096);
                                                    stackIn_85_0 = stackOut_84_0;
                                                    break L57;
                                                  } else {
                                                    stackOut_83_0 = 0;
                                                    stackIn_85_0 = stackOut_83_0;
                                                    break L57;
                                                  }
                                                }
                                                var60 = stackIn_85_0;
                                                break L54;
                                              }
                                            } else {
                                              var55 = 0;
                                              var56 = 0;
                                              var60 = 0;
                                              var59 = 0;
                                              break L54;
                                            }
                                          }
                                          L58: {
                                            var60 = var60 >> 16;
                                            var62 = var62 >> 16;
                                            var61 = var61 >> 16;
                                            var59 = var59 >> 16;
                                            if (var62 + var60 + var59 + var61 >= 128) {
                                              var64 = (var55 & 16711935) * var59 + var60 * (16711935 & var56);
                                              var64 = var64 + ((16711935 & var58) * var62 + (var57 & 16711935) * var61);
                                              var65 = var60 * ((var56 & -16711936) >>> 8) + var59 * ((var55 & -16711936) >>> 8);
                                              var65 = var65 + (var62 * (var58 >>> 8 & 16711935) + (var57 >>> 8 & 16711935) * var61);
                                              var64 = 16711935 & var64 >> 8;
                                              var66 = var65 >>> 24;
                                              var65 = 65280 & var65;
                                              if (var66 != 0) {
                                                param6[param12] = mp.a((var66 >> 1) + 128 << 24, dda.a(var64 * var66, -16711936) + dda.a(16711680, var65 * var66) >> 8);
                                                break L58;
                                              } else {
                                                break L58;
                                              }
                                            } else {
                                              break L58;
                                            }
                                          }
                                          var51 = var51 + var22;
                                          param12++;
                                          var52 = var52 + var23;
                                          var46++;
                                          continue L48;
                                        }
                                      }
                                    }
                                  }
                                  param12 = param12 - var46;
                                  param3 = param3 - var21;
                                  param4 = param4 + var24;
                                  param12 = param12 + param15;
                                  var47++;
                                  continue L45;
                                }
                              }
                            }
                          }
                        }
                      }
                      var47 = var36;
                      L59: while (true) {
                        if (var47 == 0) {
                          break L15;
                        } else {
                          L60: {
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
                              break L60;
                            } else {
                              break L60;
                            }
                          }
                          L61: {
                            L62: {
                              var48 = 4096 + var52;
                              if (4096 + var52 >= 0) {
                                break L62;
                              } else {
                                if (0 != var23) {
                                  var48 = (-var48 + (-1 + var23)) / var23;
                                  param12 = param12 + var48;
                                  var46 = var46 + var48;
                                  var52 = var52 + var48 * var23;
                                  var51 = var51 + var48 * var22;
                                  break L62;
                                } else {
                                  param12 = param12 - var46;
                                  break L61;
                                }
                              }
                            }
                            L63: while (true) {
                              L64: {
                                if (0 == var46) {
                                  break L64;
                                } else {
                                  param9 = var51 >> 12;
                                  if (~var17_int >= ~(var51 >> 12)) {
                                    break L64;
                                  } else {
                                    param7 = var52 >> 12;
                                    if (~var18 >= ~(var52 >> 12)) {
                                      break L64;
                                    } else {
                                      L65: {
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
                                          break L65;
                                        } else {
                                          L66: {
                                            if (param9 < 0) {
                                              var55 = 0;
                                              var59 = 0;
                                              break L66;
                                            } else {
                                              L67: {
                                                var55 = param16[var63];
                                                if ((var55 & -16777216) != 0) {
                                                  stackOut_111_0 = (-var54 + 4096) * (4096 + -var53);
                                                  stackIn_112_0 = stackOut_111_0;
                                                  break L67;
                                                } else {
                                                  stackOut_110_0 = 0;
                                                  stackIn_112_0 = stackOut_110_0;
                                                  break L67;
                                                }
                                              }
                                              var59 = stackIn_112_0;
                                              break L66;
                                            }
                                          }
                                          if (~(-1 + var17_int) >= ~param9) {
                                            var60 = 0;
                                            var56 = 0;
                                            break L65;
                                          } else {
                                            L68: {
                                              var56 = param16[var63 + 1];
                                              if ((-16777216 & var56) != 0) {
                                                stackOut_117_0 = (4096 + -var54) * var53;
                                                stackIn_118_0 = stackOut_117_0;
                                                break L68;
                                              } else {
                                                stackOut_116_0 = 0;
                                                stackIn_118_0 = stackOut_116_0;
                                                break L68;
                                              }
                                            }
                                            var60 = stackIn_118_0;
                                            break L65;
                                          }
                                        }
                                      }
                                      L69: {
                                        if (~param7 <= ~(var18 + -1)) {
                                          var58 = 0;
                                          var61 = 0;
                                          var57 = 0;
                                          var62 = 0;
                                          break L69;
                                        } else {
                                          L70: {
                                            if (~param9 <= ~(-1 + var17_int)) {
                                              var58 = 0;
                                              var62 = 0;
                                              break L70;
                                            } else {
                                              L71: {
                                                var58 = param16[var63 + (var17_int + 1)];
                                                if (0 == (-16777216 & var58)) {
                                                  stackOut_125_0 = 0;
                                                  stackIn_126_0 = stackOut_125_0;
                                                  break L71;
                                                } else {
                                                  stackOut_124_0 = var54 * var53;
                                                  stackIn_126_0 = stackOut_124_0;
                                                  break L71;
                                                }
                                              }
                                              var62 = stackIn_126_0;
                                              break L70;
                                            }
                                          }
                                          if (0 <= param9) {
                                            L72: {
                                              var57 = param16[var17_int + var63];
                                              if ((-16777216 & var57) == 0) {
                                                stackOut_132_0 = 0;
                                                stackIn_133_0 = stackOut_132_0;
                                                break L72;
                                              } else {
                                                stackOut_131_0 = (-var53 + 4096) * var54;
                                                stackIn_133_0 = stackOut_131_0;
                                                break L72;
                                              }
                                            }
                                            var61 = stackIn_133_0;
                                            break L69;
                                          } else {
                                            var61 = 0;
                                            var57 = 0;
                                            break L69;
                                          }
                                        }
                                      }
                                      L73: {
                                        var59 = var59 >> 16;
                                        var62 = var62 >> 16;
                                        var60 = var60 >> 16;
                                        var61 = var61 >> 16;
                                        if (var60 + var59 - (-var61 + -var62) < 128) {
                                          break L73;
                                        } else {
                                          var64 = (var56 & 16711935) * var60 + var59 * (16711935 & var55);
                                          var65 = (16711935 & var55 >>> 8) * var59 + var60 * ((-16711936 & var56) >>> 8);
                                          var64 = var64 + (var61 * (var57 & 16711935) + (16711935 & var58) * var62);
                                          var65 = var65 + (var62 * ((-16711936 & var58) >>> 8) + (16711935 & var57 >>> 8) * var61);
                                          var64 = 16711935 & var64 >> 8;
                                          var66 = var65 >>> 24;
                                          var65 = var65 & 65280;
                                          if (var66 == 0) {
                                            break L73;
                                          } else {
                                            param6[param12] = mp.a(dda.a(var66 * var64, -16711936) - -dda.a(var66 * var65, 16711680) >> 8, (var66 >> 1) + 128 << 24);
                                            break L73;
                                          }
                                        }
                                      }
                                      var46++;
                                      param12++;
                                      var52 = var52 + var23;
                                      var51 = var51 + var22;
                                      continue L63;
                                    }
                                  }
                                }
                              }
                              param12 = param12 - var46;
                              break L61;
                            }
                          }
                          var47++;
                          param12 = param12 + param15;
                          param3 = param3 - var21;
                          param4 = param4 + var24;
                          continue L59;
                        }
                      }
                    }
                  }
                  return;
                }
              }
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
            String stackOut_7_0 = null;
            Object stackOut_12_0 = null;
            RuntimeException stackOut_14_0 = null;
            StringBuilder stackOut_14_1 = null;
            RuntimeException stackOut_15_0 = null;
            StringBuilder stackOut_15_1 = null;
            String stackOut_15_2 = null;
            RuntimeException stackOut_16_0 = null;
            StringBuilder stackOut_16_1 = null;
            String stackOut_16_2 = null;
            RuntimeException stackOut_17_0 = null;
            StringBuilder stackOut_17_1 = null;
            RuntimeException stackOut_18_0 = null;
            StringBuilder stackOut_18_1 = null;
            String stackOut_18_2 = null;
            RuntimeException stackOut_19_0 = null;
            StringBuilder stackOut_19_1 = null;
            String stackOut_19_2 = null;
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
                        return stackIn_8_0;
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
                        try {
                            var3_ref = caughtException;
                            statePc = 12;
                            continue stateLoop;
                        } catch (Throwable stateCaught_11) {
                            caughtException = stateCaught_11;
                            statePc = 14;
                            continue stateLoop;
                        }
                    }
                    case 12: {
                        try {
                            stackOut_12_0 = null;
                            stackIn_13_0 = stackOut_12_0;
                            statePc = 13;
                            continue stateLoop;
                        } catch (Throwable stateCaught_12) {
                            caughtException = stateCaught_12;
                            statePc = 14;
                            continue stateLoop;
                        }
                    }
                    case 13: {
                        return (String) (Object) stackIn_13_0;
                    }
                    case 14: {
                        var3_ref2 = (RuntimeException) (Object) caughtException;
                        stackOut_14_0 = (RuntimeException) var3_ref2;
                        stackOut_14_1 = new StringBuilder().append("fi.A(");
                        stackIn_16_0 = stackOut_14_0;
                        stackIn_16_1 = stackOut_14_1;
                        stackIn_15_0 = stackOut_14_0;
                        stackIn_15_1 = stackOut_14_1;
                        if (param0 == null) {
                            statePc = 16;
                        } else {
                            statePc = 15;
                        }
                        continue stateLoop;
                    }
                    case 15: {
                        stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
                        stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
                        stackOut_15_2 = "{...}";
                        stackIn_17_0 = stackOut_15_0;
                        stackIn_17_1 = stackOut_15_1;
                        stackIn_17_2 = stackOut_15_2;
                        statePc = 17;
                        continue stateLoop;
                    }
                    case 16: {
                        stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
                        stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
                        stackOut_16_2 = "null";
                        stackIn_17_0 = stackOut_16_0;
                        stackIn_17_1 = stackOut_16_1;
                        stackIn_17_2 = stackOut_16_2;
                        statePc = 17;
                        continue stateLoop;
                    }
                    case 17: {
                        stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
                        stackOut_17_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_17_2).append(44).append(param1).append(44);
                        stackIn_19_0 = stackOut_17_0;
                        stackIn_19_1 = stackOut_17_1;
                        stackIn_18_0 = stackOut_17_0;
                        stackIn_18_1 = stackOut_17_1;
                        if (param2 == null) {
                            statePc = 19;
                        } else {
                            statePc = 18;
                        }
                        continue stateLoop;
                    }
                    case 18: {
                        stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
                        stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
                        stackOut_18_2 = "{...}";
                        stackIn_20_0 = stackOut_18_0;
                        stackIn_20_1 = stackOut_18_1;
                        stackIn_20_2 = stackOut_18_2;
                        statePc = 20;
                        continue stateLoop;
                    }
                    case 19: {
                        stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
                        stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
                        stackOut_19_2 = "null";
                        stackIn_20_0 = stackOut_19_0;
                        stackIn_20_1 = stackOut_19_1;
                        stackIn_20_2 = stackOut_19_2;
                        statePc = 20;
                        continue stateLoop;
                    }
                    case 20: {
                        throw pe.a((Throwable) (Object) stackIn_20_0, stackIn_20_2 + 41);
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
        try {
            if (param0) {
                field_p = null;
            }
            param1.field_a[((fi) this).field_r][((fi) this).field_q].field_j = param1.field_a[((fi) this).field_r][((fi) this).field_q].field_j + 1;
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) (Object) runtimeException, "fi.C(" + param0 + 44 + (param1 != null ? "{...}" : "null") + 41);
        }
    }

    final void b(lu param0, byte param1) {
        try {
            param0.d(((fi) this).field_r, 0);
            param0.d(((fi) this).field_q, 0);
            int var3_int = 20 / ((37 - param1) / 38);
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) (Object) runtimeException, "fi.E(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 41);
        }
    }

    final void a(ub param0, int param1) {
        gj var3 = null;
        aca var4 = null;
        try {
            var3 = param0.field_o;
            if (param1 >= -2) {
                field_o = null;
            }
            ((fi) this).a(false, var3.field_h);
            var4 = new aca(var3, ((fi) this).field_r, ((fi) this).field_q, false);
            ((kj) (Object) var4).a(0);
            var3.field_s.field_F = 0;
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) (Object) runtimeException, "fi.B(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 41);
        }
    }

    fi(int param0, int param1) {
        ((fi) this).field_q = param1;
        ((fi) this).field_j = 4;
        ((fi) this).field_r = param0;
    }

    fi(lu param0) {
        try {
            ((fi) this).field_j = 4;
            ((fi) this).field_r = param0.b(16711935);
            ((fi) this).field_q = param0.b(16711935);
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) (Object) runtimeException, "fi.<init>(" + (param0 != null ? "{...}" : "null") + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_o = "Creature viewer. Examine a creature and click the tooltips to continue.";
    }
}
