/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qg {
    static String field_a;
    static String field_c;
    static sna field_b;

    final static void a(int[] param0, int param1, kv param2, int param3, int param4, int param5, int param6, int param7, int[] param8, int param9, int param10, int param11, int param12, int param13, int param14, int param15, int param16) {
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
        double var37 = 0.0;
        double var39 = 0.0;
        int var41 = 0;
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
        int var68 = 0;
        int stackIn_66_0 = 0;
        int stackIn_72_0 = 0;
        int stackIn_79_0 = 0;
        int stackIn_84_0 = 0;
        int stackIn_113_0 = 0;
        int stackIn_118_0 = 0;
        int stackIn_126_0 = 0;
        int stackIn_131_0 = 0;
        int stackIn_160_0 = 0;
        int stackIn_165_0 = 0;
        int stackIn_174_0 = 0;
        int stackIn_179_0 = 0;
        int stackIn_204_0 = 0;
        int stackIn_209_0 = 0;
        int stackIn_218_0 = 0;
        int stackIn_224_0 = 0;
        int stackOut_203_0 = 0;
        int stackOut_202_0 = 0;
        int stackOut_208_0 = 0;
        int stackOut_207_0 = 0;
        int stackOut_217_0 = 0;
        int stackOut_216_0 = 0;
        int stackOut_223_0 = 0;
        int stackOut_222_0 = 0;
        int stackOut_159_0 = 0;
        int stackOut_158_0 = 0;
        int stackOut_164_0 = 0;
        int stackOut_163_0 = 0;
        int stackOut_173_0 = 0;
        int stackOut_172_0 = 0;
        int stackOut_178_0 = 0;
        int stackOut_177_0 = 0;
        int stackOut_65_0 = 0;
        int stackOut_64_0 = 0;
        int stackOut_71_0 = 0;
        int stackOut_70_0 = 0;
        int stackOut_78_0 = 0;
        int stackOut_77_0 = 0;
        int stackOut_83_0 = 0;
        int stackOut_82_0 = 0;
        int stackOut_112_0 = 0;
        int stackOut_111_0 = 0;
        int stackOut_117_0 = 0;
        int stackOut_116_0 = 0;
        int stackOut_125_0 = 0;
        int stackOut_124_0 = 0;
        int stackOut_130_0 = 0;
        int stackOut_129_0 = 0;
        L0: {
          var68 = BachelorFridge.field_y;
          if (param1 == 0) {
            break L0;
          } else {
            if (param12 != 0) {
              L1: {
                var17_int = param2.field_q;
                param16 = param16 - (param2.field_t << 4);
                var18 = param2.field_p;
                param11 = param11 - (param2.field_u << 4);
                var19 = 0.00009587379924285257 * (double)(param10 & 65535);
                var21 = (int)Math.floor((double)param1 * Math.sin(var19) + 0.5);
                var22 = (int)Math.floor(Math.cos(var19) * (double)param1 + 0.5);
                var23 = (int)Math.floor(0.5 + Math.sin(var19) * (double)param12);
                var24 = (int)Math.floor((double)param12 * Math.cos(var19) + 0.5);
                var25 = -param11 * var23 + -param16 * var22;
                var26 = var21 * --param16 - -(var24 * -param11);
                var27 = -param11 * var23 + (-param16 + (var17_int << 4)) * var22;
                var28 = -(-param16 + (var17_int << 4)) * var21 - -(var24 * -param11);
                var29 = var23 * (-param11 + (var18 << 4)) + var22 * -param16;
                var30 = ((var18 << 4) + -param11) * var24 + var21 * --param16;
                var31 = (-param11 + (var18 << 4)) * var23 + ((var17_int << 4) - param16) * var22;
                var32 = -(-param16 + (var17_int << 4)) * var21 + (-param11 + (var18 << 4)) * var24;
                if (~var25 <= ~var27) {
                  var33 = var27;
                  var34 = var25;
                  break L1;
                } else {
                  var33 = var25;
                  var34 = var27;
                  break L1;
                }
              }
              L2: {
                if (var33 <= var29) {
                  break L2;
                } else {
                  var33 = var29;
                  break L2;
                }
              }
              L3: {
                if (var29 > var34) {
                  var34 = var29;
                  break L3;
                } else {
                  break L3;
                }
              }
              L4: {
                if (~var31 <= ~var33) {
                  break L4;
                } else {
                  var33 = var31;
                  break L4;
                }
              }
              L5: {
                if (~var34 <= ~var31) {
                  break L5;
                } else {
                  var34 = var31;
                  break L5;
                }
              }
              L6: {
                if (~var28 >= ~var26) {
                  var36 = var26;
                  var35 = var28;
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
                if (~var30 < ~var36) {
                  var36 = var30;
                  break L8;
                } else {
                  break L8;
                }
              }
              L9: {
                if (~var35 < ~var32) {
                  var35 = var32;
                  break L9;
                } else {
                  break L9;
                }
              }
              L10: {
                var33 = var33 >> 12;
                var34 = 4095 + var34 >> 12;
                if (~var32 < ~var36) {
                  var36 = var32;
                  break L10;
                } else {
                  break L10;
                }
              }
              L11: {
                var35 = var35 >> 12;
                var34 = var34 + param3;
                var36 = 4095 + var36 >> 12;
                var33 = var33 + param3;
                var35 = var35 + param15;
                var34 = 15 + var34 >> 4;
                var35 = var35 >> 4;
                var33 = var33 >> 4;
                var36 = var36 + param15;
                if (~var35 > ~dg.field_j) {
                  var35 = dg.field_j;
                  break L11;
                } else {
                  break L11;
                }
              }
              L12: {
                if (~dg.field_h <= ~var34) {
                  break L12;
                } else {
                  var34 = dg.field_h;
                  break L12;
                }
              }
              L13: {
                var36 = var36 + 15 >> 4;
                if (~var33 > ~dg.field_f) {
                  var33 = dg.field_f;
                  break L13;
                } else {
                  break L13;
                }
              }
              L14: {
                if (dg.field_k >= var36) {
                  break L14;
                } else {
                  var36 = dg.field_k;
                  break L14;
                }
              }
              var34 = -var34 + var33;
              if (var34 >= 0) {
                return;
              } else {
                var36 = var35 - var36;
                if (var36 < 0) {
                  param14 = dg.field_i * var35 - -var33;
                  param9 = dg.field_i - -var34;
                  var37 = 16777216.0 / (double)param1;
                  var39 = 16777216.0 / (double)param12;
                  var21 = (int)Math.floor(Math.sin(var19) * var37 + 0.5);
                  var22 = (int)Math.floor(0.5 + var37 * Math.cos(var19));
                  var23 = (int)Math.floor(Math.sin(var19) * var39 + 0.5);
                  L15: {
                    var24 = (int)Math.floor(0.5 + var39 * Math.cos(var19));
                    var41 = 8 + ((var33 << 4) + -param3);
                    var42 = (var35 << 4) + (8 - param15);
                    param6 = (param16 << 8) + -(var42 * var21 >> 4);
                    param5 = (var42 * var24 >> 4) + (param11 << 8);
                    var43 = var22 * var41 >> 4;
                    var44 = var23 * var41 >> 4;
                    var48 = var17_int << 12;
                    var49 = var18 << 12;
                    if (var22 < 0) {
                      if (var23 >= 0) {
                        var46 = var36;
                        L16: while (true) {
                          if (var46 == 0) {
                            break L15;
                          } else {
                            L17: {
                              var51 = var44 + param5;
                              var50 = param6 - -var43;
                              var45 = var34;
                              var47 = var50 + -var48;
                              if (var50 + -var48 < 0) {
                                break L17;
                              } else {
                                var47 = (-var47 + var22) / var22;
                                var45 = var45 + var47;
                                var50 = var50 + var47 * var22;
                                var51 = var51 + var47 * var23;
                                param14 = param14 + var47;
                                break L17;
                              }
                            }
                            L18: {
                              var47 = 4096 + var51;
                              if (4096 + var51 < 0) {
                                var47 = (-var47 + (-1 + var23)) / var23;
                                var45 = var45 + var47;
                                param14 = param14 + var47;
                                var51 = var51 + var47 * var23;
                                var50 = var50 + var22 * var47;
                                break L18;
                              } else {
                                break L18;
                              }
                            }
                            L19: while (true) {
                              L20: {
                                if (0 == var45) {
                                  break L20;
                                } else {
                                  if (var50 < -4096) {
                                    break L20;
                                  } else {
                                    param7 = var51 >> 12;
                                    if (~var18 < ~(var51 >> 12)) {
                                      L21: {
                                        var53 = var51;
                                        var52 = var50;
                                        param13 = var50 >> 12;
                                        var62 = var17_int * param7 - -param13;
                                        var53 = var53 & 4095;
                                        var52 = var52 & 4095;
                                        if (param7 >= var18 - 1) {
                                          var57 = 0;
                                          var61 = 0;
                                          var60 = 0;
                                          var56 = 0;
                                          break L21;
                                        } else {
                                          L22: {
                                            if (~param13 > ~(var17_int + -1)) {
                                              L23: {
                                                var57 = param0[var62 + var17_int - -1];
                                                if ((var57 & -16777216) != 0) {
                                                  stackOut_203_0 = var53 * var52;
                                                  stackIn_204_0 = stackOut_203_0;
                                                  break L23;
                                                } else {
                                                  stackOut_202_0 = 0;
                                                  stackIn_204_0 = stackOut_202_0;
                                                  break L23;
                                                }
                                              }
                                              var61 = stackIn_204_0;
                                              break L22;
                                            } else {
                                              var57 = 0;
                                              var61 = 0;
                                              break L22;
                                            }
                                          }
                                          if (param13 < 0) {
                                            var60 = 0;
                                            var56 = 0;
                                            break L21;
                                          } else {
                                            L24: {
                                              var56 = param0[var62 - -var17_int];
                                              if ((var56 & -16777216) != 0) {
                                                stackOut_208_0 = (-var52 + 4096) * var53;
                                                stackIn_209_0 = stackOut_208_0;
                                                break L24;
                                              } else {
                                                stackOut_207_0 = 0;
                                                stackIn_209_0 = stackOut_207_0;
                                                break L24;
                                              }
                                            }
                                            var60 = stackIn_209_0;
                                            break L21;
                                          }
                                        }
                                      }
                                      L25: {
                                        if (param7 < 0) {
                                          var54 = 0;
                                          var58 = 0;
                                          var55 = 0;
                                          var59 = 0;
                                          break L25;
                                        } else {
                                          L26: {
                                            if (0 <= param13) {
                                              L27: {
                                                var54 = param0[var62];
                                                if ((-16777216 & var54) == 0) {
                                                  stackOut_217_0 = 0;
                                                  stackIn_218_0 = stackOut_217_0;
                                                  break L27;
                                                } else {
                                                  stackOut_216_0 = (-var52 + 4096) * (-var53 + 4096);
                                                  stackIn_218_0 = stackOut_216_0;
                                                  break L27;
                                                }
                                              }
                                              var58 = stackIn_218_0;
                                              break L26;
                                            } else {
                                              var54 = 0;
                                              var58 = 0;
                                              break L26;
                                            }
                                          }
                                          if (~param13 > ~(-1 + var17_int)) {
                                            L28: {
                                              var55 = param0[var62 - -1];
                                              if ((var55 & -16777216) == 0) {
                                                stackOut_223_0 = 0;
                                                stackIn_224_0 = stackOut_223_0;
                                                break L28;
                                              } else {
                                                stackOut_222_0 = (4096 - var53) * var52;
                                                stackIn_224_0 = stackOut_222_0;
                                                break L28;
                                              }
                                            }
                                            var59 = stackIn_224_0;
                                            break L25;
                                          } else {
                                            var59 = 0;
                                            var55 = 0;
                                            break L25;
                                          }
                                        }
                                      }
                                      L29: {
                                        var58 = var58 >> 16;
                                        var59 = var59 >> 16;
                                        var61 = var61 >> 16;
                                        var60 = var60 >> 16;
                                        if (var61 + var60 + (var59 + var58) >= 128) {
                                          var63 = (16711935 & var55) * var59 + var58 * (var54 & 16711935);
                                          var63 = var63 + ((16711935 & var57) * var61 + var60 * (16711935 & var56));
                                          var64 = ((var54 & -16711936) >>> 8) * var58 - -((var55 >>> 8 & 16711935) * var59);
                                          var64 = var64 + (var61 * ((-16711936 & var57) >>> 8) + var60 * ((-16711936 & var56) >>> 8));
                                          var65 = var64 >>> 24;
                                          var63 = (-16711725 & var63) >>> 8;
                                          var64 = var64 & 65280;
                                          if (var65 == 0) {
                                            break L29;
                                          } else {
                                            var67 = param8[param14];
                                            var66 = -var65 + 256;
                                            param8[param14] = mp.a(dda.a(-16711936, var65 * var63 - -(var66 * dda.a(16711935, var67))) - -dda.a(dda.a(var67, 65280) * var66 + var65 * var64, 16711680) >>> 8, 128 - -(var65 >> 1) << 24);
                                            break L29;
                                          }
                                        } else {
                                          break L29;
                                        }
                                      }
                                      var45++;
                                      var51 = var51 + var23;
                                      var50 = var50 + var22;
                                      param14++;
                                      continue L19;
                                    } else {
                                      break L20;
                                    }
                                  }
                                }
                              }
                              param14 = param14 - var45;
                              param6 = param6 - var21;
                              param14 = param14 + param9;
                              var46++;
                              param5 = param5 + var24;
                              continue L16;
                            }
                          }
                        }
                      } else {
                        var46 = var36;
                        L30: while (true) {
                          if (var46 == 0) {
                            break L15;
                          } else {
                            L31: {
                              var45 = var34;
                              var51 = param5 - -var44;
                              var50 = var43 + param6;
                              var47 = -var48 + var50;
                              if (0 <= -var48 + var50) {
                                var47 = (var22 - var47) / var22;
                                var50 = var50 + var22 * var47;
                                param14 = param14 + var47;
                                var45 = var45 + var47;
                                var51 = var51 + var23 * var47;
                                break L31;
                              } else {
                                break L31;
                              }
                            }
                            L32: {
                              var47 = -var49 + var51;
                              if (-var49 + var51 >= 0) {
                                var47 = (var23 - var47) / var23;
                                var45 = var45 + var47;
                                var51 = var51 + var47 * var23;
                                param14 = param14 + var47;
                                var50 = var50 + var22 * var47;
                                break L32;
                              } else {
                                break L32;
                              }
                            }
                            L33: while (true) {
                              L34: {
                                if (var45 == 0) {
                                  break L34;
                                } else {
                                  if (-4096 > var50) {
                                    break L34;
                                  } else {
                                    if (-4096 > var51) {
                                      break L34;
                                    } else {
                                      L35: {
                                        param13 = var50 >> 12;
                                        var52 = var50;
                                        var53 = var51;
                                        param7 = var51 >> 12;
                                        var62 = var17_int * param7 + param13;
                                        var52 = var52 & 4095;
                                        var53 = var53 & 4095;
                                        if (-1 + var18 > param7) {
                                          L36: {
                                            if (param13 >= 0) {
                                              L37: {
                                                var56 = param0[var62 - -var17_int];
                                                if ((-16777216 & var56) != 0) {
                                                  stackOut_159_0 = var53 * (4096 - var52);
                                                  stackIn_160_0 = stackOut_159_0;
                                                  break L37;
                                                } else {
                                                  stackOut_158_0 = 0;
                                                  stackIn_160_0 = stackOut_158_0;
                                                  break L37;
                                                }
                                              }
                                              var60 = stackIn_160_0;
                                              break L36;
                                            } else {
                                              var56 = 0;
                                              var60 = 0;
                                              break L36;
                                            }
                                          }
                                          if (var17_int + -1 <= param13) {
                                            var57 = 0;
                                            var61 = 0;
                                            break L35;
                                          } else {
                                            L38: {
                                              var57 = param0[1 + (var17_int + var62)];
                                              if ((-16777216 & var57) == 0) {
                                                stackOut_164_0 = 0;
                                                stackIn_165_0 = stackOut_164_0;
                                                break L38;
                                              } else {
                                                stackOut_163_0 = var52 * var53;
                                                stackIn_165_0 = stackOut_163_0;
                                                break L38;
                                              }
                                            }
                                            var61 = stackIn_165_0;
                                            break L35;
                                          }
                                        } else {
                                          var56 = 0;
                                          var57 = 0;
                                          var61 = 0;
                                          var60 = 0;
                                          break L35;
                                        }
                                      }
                                      L39: {
                                        if (param7 >= 0) {
                                          L40: {
                                            if (param13 < -1 + var17_int) {
                                              L41: {
                                                var55 = param0[1 + var62];
                                                if ((-16777216 & var55) == 0) {
                                                  stackOut_173_0 = 0;
                                                  stackIn_174_0 = stackOut_173_0;
                                                  break L41;
                                                } else {
                                                  stackOut_172_0 = var52 * (4096 - var53);
                                                  stackIn_174_0 = stackOut_172_0;
                                                  break L41;
                                                }
                                              }
                                              var59 = stackIn_174_0;
                                              break L40;
                                            } else {
                                              var59 = 0;
                                              var55 = 0;
                                              break L40;
                                            }
                                          }
                                          if (param13 < 0) {
                                            var54 = 0;
                                            var58 = 0;
                                            break L39;
                                          } else {
                                            L42: {
                                              var54 = param0[var62];
                                              if ((var54 & -16777216) == 0) {
                                                stackOut_178_0 = 0;
                                                stackIn_179_0 = stackOut_178_0;
                                                break L42;
                                              } else {
                                                stackOut_177_0 = (-var52 + 4096) * (4096 + -var53);
                                                stackIn_179_0 = stackOut_177_0;
                                                break L42;
                                              }
                                            }
                                            var58 = stackIn_179_0;
                                            break L39;
                                          }
                                        } else {
                                          var58 = 0;
                                          var54 = 0;
                                          var59 = 0;
                                          var55 = 0;
                                          break L39;
                                        }
                                      }
                                      L43: {
                                        var61 = var61 >> 16;
                                        var59 = var59 >> 16;
                                        var58 = var58 >> 16;
                                        var60 = var60 >> 16;
                                        if (var61 + var58 + var59 - -var60 < 128) {
                                          break L43;
                                        } else {
                                          var63 = var58 * (var54 & 16711935) - -(var59 * (16711935 & var55));
                                          var64 = (16711935 & var55 >>> 8) * var59 + var58 * (var54 >>> 8 & 16711935);
                                          var63 = var63 + ((var57 & 16711935) * var61 + (var56 & 16711935) * var60);
                                          var64 = var64 + (((var57 & -16711936) >>> 8) * var61 + var60 * ((var56 & -16711936) >>> 8));
                                          var63 = 402587903 & var63 >>> 8;
                                          var65 = var64 >>> 24;
                                          var64 = 65280 & var64;
                                          if (var65 != 0) {
                                            var66 = 256 + -var65;
                                            var67 = param8[param14];
                                            param8[param14] = mp.a(128 + (var65 >> 1) << 24, dda.a(-16711936, var63 * var65 + dda.a(var67, 16711935) * var66) - -dda.a(16711680, var66 * dda.a(65280, var67) + var64 * var65) >>> 8);
                                            break L43;
                                          } else {
                                            break L43;
                                          }
                                        }
                                      }
                                      var45++;
                                      param14++;
                                      var50 = var50 + var22;
                                      var51 = var51 + var23;
                                      continue L33;
                                    }
                                  }
                                }
                              }
                              param14 = param14 - var45;
                              param14 = param14 + param9;
                              param5 = param5 + var24;
                              var46++;
                              param6 = param6 - var21;
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
                            var46 = var36;
                            L45: while (true) {
                              if (0 == var46) {
                                break L15;
                              } else {
                                L46: {
                                  var51 = var44 + param5;
                                  var45 = var34;
                                  var50 = var43 + param6;
                                  var47 = var50 + 4096;
                                  if (var50 + 4096 < 0) {
                                    var47 = (-var47 + (var22 - 1)) / var22;
                                    var45 = var45 + var47;
                                    var51 = var51 + var23 * var47;
                                    param14 = param14 + var47;
                                    var50 = var50 + var47 * var22;
                                    break L46;
                                  } else {
                                    break L46;
                                  }
                                }
                                L47: {
                                  var47 = -var49 + var51;
                                  if (-var49 + var51 < 0) {
                                    break L47;
                                  } else {
                                    var47 = (var23 - var47) / var23;
                                    var50 = var50 + var47 * var22;
                                    var45 = var45 + var47;
                                    param14 = param14 + var47;
                                    var51 = var51 + var47 * var23;
                                    break L47;
                                  }
                                }
                                L48: while (true) {
                                  L49: {
                                    if (var45 == 0) {
                                      break L49;
                                    } else {
                                      if (-4096 > var51) {
                                        break L49;
                                      } else {
                                        param13 = var50 >> 12;
                                        if (~(var50 >> 12) <= ~var17_int) {
                                          break L49;
                                        } else {
                                          L50: {
                                            var52 = var50;
                                            var53 = var51;
                                            param7 = var51 >> 12;
                                            var52 = var52 & 4095;
                                            var53 = var53 & 4095;
                                            var62 = param13 + param7 * var17_int;
                                            if (param7 >= 0) {
                                              L51: {
                                                if (param13 >= 0) {
                                                  L52: {
                                                    var54 = param0[var62];
                                                    if (0 == (-16777216 & var54)) {
                                                      stackOut_65_0 = 0;
                                                      stackIn_66_0 = stackOut_65_0;
                                                      break L52;
                                                    } else {
                                                      stackOut_64_0 = (-var52 + 4096) * (4096 + -var53);
                                                      stackIn_66_0 = stackOut_64_0;
                                                      break L52;
                                                    }
                                                  }
                                                  var58 = stackIn_66_0;
                                                  break L51;
                                                } else {
                                                  var54 = 0;
                                                  var58 = 0;
                                                  break L51;
                                                }
                                              }
                                              if (~param13 > ~(-1 + var17_int)) {
                                                L53: {
                                                  var55 = param0[1 + var62];
                                                  if ((-16777216 & var55) == 0) {
                                                    stackOut_71_0 = 0;
                                                    stackIn_72_0 = stackOut_71_0;
                                                    break L53;
                                                  } else {
                                                    stackOut_70_0 = var52 * (4096 - var53);
                                                    stackIn_72_0 = stackOut_70_0;
                                                    break L53;
                                                  }
                                                }
                                                var59 = stackIn_72_0;
                                                break L50;
                                              } else {
                                                var59 = 0;
                                                var55 = 0;
                                                break L50;
                                              }
                                            } else {
                                              var54 = 0;
                                              var55 = 0;
                                              var59 = 0;
                                              var58 = 0;
                                              break L50;
                                            }
                                          }
                                          L54: {
                                            if (param7 >= -1 + var18) {
                                              var60 = 0;
                                              var56 = 0;
                                              var57 = 0;
                                              var61 = 0;
                                              break L54;
                                            } else {
                                              L55: {
                                                if (param13 < var17_int - 1) {
                                                  L56: {
                                                    var57 = param0[1 + (var62 + var17_int)];
                                                    if ((-16777216 & var57) != 0) {
                                                      stackOut_78_0 = var53 * var52;
                                                      stackIn_79_0 = stackOut_78_0;
                                                      break L56;
                                                    } else {
                                                      stackOut_77_0 = 0;
                                                      stackIn_79_0 = stackOut_77_0;
                                                      break L56;
                                                    }
                                                  }
                                                  var61 = stackIn_79_0;
                                                  break L55;
                                                } else {
                                                  var61 = 0;
                                                  var57 = 0;
                                                  break L55;
                                                }
                                              }
                                              if (0 > param13) {
                                                var56 = 0;
                                                var60 = 0;
                                                break L54;
                                              } else {
                                                L57: {
                                                  var56 = param0[var17_int + var62];
                                                  if ((var56 & -16777216) != 0) {
                                                    stackOut_83_0 = (4096 - var52) * var53;
                                                    stackIn_84_0 = stackOut_83_0;
                                                    break L57;
                                                  } else {
                                                    stackOut_82_0 = 0;
                                                    stackIn_84_0 = stackOut_82_0;
                                                    break L57;
                                                  }
                                                }
                                                var60 = stackIn_84_0;
                                                break L54;
                                              }
                                            }
                                          }
                                          L58: {
                                            var60 = var60 >> 16;
                                            var58 = var58 >> 16;
                                            var61 = var61 >> 16;
                                            var59 = var59 >> 16;
                                            if (var60 + var59 + (var58 + var61) >= 128) {
                                              var63 = var58 * (var54 & 16711935) + (16711935 & var55) * var59;
                                              var64 = var59 * ((var55 & -16711936) >>> 8) + var58 * (16711935 & var54 >>> 8);
                                              var63 = var63 + ((16711935 & var56) * var60 + (var57 & 16711935) * var61);
                                              var64 = var64 + (((var56 & -16711936) >>> 8) * var60 + var61 * ((-16711936 & var57) >>> 8));
                                              var65 = var64 >>> 24;
                                              var63 = 1694433535 & var63 >>> 8;
                                              var64 = var64 & 65280;
                                              if (var65 != 0) {
                                                var67 = param8[param14];
                                                var66 = -var65 + 256;
                                                param8[param14] = mp.a(128 - -(var65 >> 1) << 24, dda.a(dda.a(var67, 16711935) * var66 + var65 * var63, -16711936) - -dda.a(var66 * dda.a(var67, 65280) + var64 * var65, 16711680) >>> 8);
                                                break L58;
                                              } else {
                                                break L58;
                                              }
                                            } else {
                                              break L58;
                                            }
                                          }
                                          var45++;
                                          var50 = var50 + var22;
                                          param14++;
                                          var51 = var51 + var23;
                                          continue L48;
                                        }
                                      }
                                    }
                                  }
                                  param14 = param14 - var45;
                                  param6 = param6 - var21;
                                  var46++;
                                  param5 = param5 + var24;
                                  param14 = param14 + param9;
                                  continue L45;
                                }
                              }
                            }
                          }
                        }
                      }
                      var46 = var36;
                      L59: while (true) {
                        if (var46 == 0) {
                          break L15;
                        } else {
                          L60: {
                            var51 = var44 + param5;
                            var50 = param6 + var43;
                            var45 = var34;
                            var47 = 4096 + var50;
                            if (4096 + var50 >= 0) {
                              break L60;
                            } else {
                              var47 = (-1 + (var22 + -var47)) / var22;
                              param14 = param14 + var47;
                              var50 = var50 + var47 * var22;
                              var45 = var45 + var47;
                              var51 = var51 + var47 * var23;
                              break L60;
                            }
                          }
                          L61: {
                            L62: {
                              var47 = var51 - -4096;
                              if (var51 - -4096 >= 0) {
                                break L62;
                              } else {
                                if (0 != var23) {
                                  var47 = (var23 + -1 - var47) / var23;
                                  param14 = param14 + var47;
                                  var50 = var50 + var22 * var47;
                                  var51 = var51 + var23 * var47;
                                  var45 = var45 + var47;
                                  break L62;
                                } else {
                                  param14 = param14 - var45;
                                  break L61;
                                }
                              }
                            }
                            L63: while (true) {
                              L64: {
                                if (var45 == 0) {
                                  break L64;
                                } else {
                                  param13 = var50 >> 12;
                                  if (var50 >> 12 >= var17_int) {
                                    break L64;
                                  } else {
                                    param7 = var51 >> 12;
                                    if (var51 >> 12 >= var18) {
                                      break L64;
                                    } else {
                                      L65: {
                                        var62 = param13 + var17_int * param7;
                                        var53 = var51;
                                        var52 = var50;
                                        var52 = var52 & 4095;
                                        var53 = var53 & 4095;
                                        if (~param7 > ~(-1 + var18)) {
                                          L66: {
                                            if (param13 >= 0) {
                                              L67: {
                                                var56 = param0[var62 - -var17_int];
                                                if ((var56 & -16777216) != 0) {
                                                  stackOut_112_0 = (-var52 + 4096) * var53;
                                                  stackIn_113_0 = stackOut_112_0;
                                                  break L67;
                                                } else {
                                                  stackOut_111_0 = 0;
                                                  stackIn_113_0 = stackOut_111_0;
                                                  break L67;
                                                }
                                              }
                                              var60 = stackIn_113_0;
                                              break L66;
                                            } else {
                                              var60 = 0;
                                              var56 = 0;
                                              break L66;
                                            }
                                          }
                                          if (~param13 <= ~(var17_int - 1)) {
                                            var57 = 0;
                                            var61 = 0;
                                            break L65;
                                          } else {
                                            L68: {
                                              var57 = param0[var17_int + (var62 + 1)];
                                              if ((-16777216 & var57) == 0) {
                                                stackOut_117_0 = 0;
                                                stackIn_118_0 = stackOut_117_0;
                                                break L68;
                                              } else {
                                                stackOut_116_0 = var53 * var52;
                                                stackIn_118_0 = stackOut_116_0;
                                                break L68;
                                              }
                                            }
                                            var61 = stackIn_118_0;
                                            break L65;
                                          }
                                        } else {
                                          var57 = 0;
                                          var56 = 0;
                                          var61 = 0;
                                          var60 = 0;
                                          break L65;
                                        }
                                      }
                                      L69: {
                                        if (param7 < 0) {
                                          var55 = 0;
                                          var54 = 0;
                                          var59 = 0;
                                          var58 = 0;
                                          break L69;
                                        } else {
                                          L70: {
                                            if (param13 >= 0) {
                                              L71: {
                                                var54 = param0[var62];
                                                if ((var54 & -16777216) != 0) {
                                                  stackOut_125_0 = (4096 - var53) * (-var52 + 4096);
                                                  stackIn_126_0 = stackOut_125_0;
                                                  break L71;
                                                } else {
                                                  stackOut_124_0 = 0;
                                                  stackIn_126_0 = stackOut_124_0;
                                                  break L71;
                                                }
                                              }
                                              var58 = stackIn_126_0;
                                              break L70;
                                            } else {
                                              var58 = 0;
                                              var54 = 0;
                                              break L70;
                                            }
                                          }
                                          if (param13 >= var17_int + -1) {
                                            var59 = 0;
                                            var55 = 0;
                                            break L69;
                                          } else {
                                            L72: {
                                              var55 = param0[1 + var62];
                                              if (0 == (var55 & -16777216)) {
                                                stackOut_130_0 = 0;
                                                stackIn_131_0 = stackOut_130_0;
                                                break L72;
                                              } else {
                                                stackOut_129_0 = (-var53 + 4096) * var52;
                                                stackIn_131_0 = stackOut_129_0;
                                                break L72;
                                              }
                                            }
                                            var59 = stackIn_131_0;
                                            break L69;
                                          }
                                        }
                                      }
                                      L73: {
                                        var61 = var61 >> 16;
                                        var60 = var60 >> 16;
                                        var59 = var59 >> 16;
                                        var58 = var58 >> 16;
                                        if (var59 + var58 - -var60 + var61 >= 128) {
                                          var63 = var58 * (16711935 & var54) - -(var59 * (var55 & 16711935));
                                          var64 = var58 * ((var54 & -16711936) >>> 8) + var59 * (16711935 & var55 >>> 8);
                                          var63 = var63 + (var60 * (16711935 & var56) - -(var61 * (16711935 & var57)));
                                          var64 = var64 + (var60 * ((-16711936 & var56) >>> 8) + ((var57 & -16711936) >>> 8) * var61);
                                          var65 = var64 >>> 24;
                                          var63 = (-16711760 & var63) >>> 8;
                                          var64 = -16711936 & var64;
                                          if (0 == var65) {
                                            break L73;
                                          } else {
                                            var66 = -var65 + 256;
                                            var67 = param8[param14];
                                            param8[param14] = mp.a(dda.a(dda.a(var67, 65280) * var66 + var64 * var65, 16711680) + dda.a(var66 * dda.a(var67, 16711935) + var63 * var65, -16711936) >>> 8, (var65 >> 1) + 128 << 24);
                                            break L73;
                                          }
                                        } else {
                                          break L73;
                                        }
                                      }
                                      var51 = var51 + var23;
                                      param14++;
                                      var45++;
                                      var50 = var50 + var22;
                                      continue L63;
                                    }
                                  }
                                }
                              }
                              param14 = param14 - var45;
                              break L61;
                            }
                          }
                          var46++;
                          param6 = param6 - var21;
                          param5 = param5 + var24;
                          param14 = param14 + param9;
                          continue L59;
                        }
                      }
                    }
                  }
                  return;
                } else {
                  return;
                }
              }
            } else {
              break L0;
            }
          }
        }
    }

    public static void a(int param0) {
        field_a = null;
        field_c = null;
        if (param0 != 4096) {
            qg.a(60);
        }
        field_b = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = "You are on <%0>";
        field_a = "Press TAB to chat or F10 to open Quick Chat.";
    }
}
