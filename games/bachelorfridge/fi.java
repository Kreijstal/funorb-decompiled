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
        int stackIn_63_0 = 0;
        int stackIn_69_0 = 0;
        int stackIn_77_0 = 0;
        int stackIn_82_0 = 0;
        int stackIn_109_0 = 0;
        int stackIn_115_0 = 0;
        int stackIn_123_0 = 0;
        int stackIn_130_0 = 0;
        int stackIn_156_0 = 0;
        int stackIn_161_0 = 0;
        int stackIn_168_0 = 0;
        int stackIn_174_0 = 0;
        int stackIn_200_0 = 0;
        int stackIn_207_0 = 0;
        int stackIn_216_0 = 0;
        int stackIn_221_0 = 0;
        int stackOut_199_0 = 0;
        int stackOut_198_0 = 0;
        int stackOut_206_0 = 0;
        int stackOut_205_0 = 0;
        int stackOut_215_0 = 0;
        int stackOut_214_0 = 0;
        int stackOut_220_0 = 0;
        int stackOut_219_0 = 0;
        int stackOut_155_0 = 0;
        int stackOut_154_0 = 0;
        int stackOut_160_0 = 0;
        int stackOut_159_0 = 0;
        int stackOut_167_0 = 0;
        int stackOut_166_0 = 0;
        int stackOut_173_0 = 0;
        int stackOut_172_0 = 0;
        int stackOut_62_0 = 0;
        int stackOut_61_0 = 0;
        int stackOut_68_0 = 0;
        int stackOut_67_0 = 0;
        int stackOut_76_0 = 0;
        int stackOut_75_0 = 0;
        int stackOut_81_0 = 0;
        int stackOut_80_0 = 0;
        int stackOut_108_0 = 0;
        int stackOut_107_0 = 0;
        int stackOut_114_0 = 0;
        int stackOut_113_0 = 0;
        int stackOut_122_0 = 0;
        int stackOut_121_0 = 0;
        int stackOut_129_0 = 0;
        int stackOut_128_0 = 0;
        var67 = BachelorFridge.field_y;
        L0: {
          var17_int = param5.field_q;
          param1 = param1 - (param5.field_u << 4);
          param0 = param0 - (param5.field_t << 4);
          var18 = param5.field_p;
          var19 = 0.00009587379924285257 * (double)(param2 & 65535);
          var21 = (int)Math.floor((double)4096 * Math.sin(var19) + 0.5);
          var22 = (int)Math.floor(Math.cos(var19) * (double)4096 + 0.5);
          var23 = (int)Math.floor((double)4096 * Math.sin(var19) + 0.5);
          var24 = (int)Math.floor(Math.cos(var19) * (double)4096 + 0.5);
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
            break L0;
          } else {
            var34 = var27;
            var33 = var25;
            break L0;
          }
        }
        L1: {
          if (~var33 < ~var29) {
            var33 = var29;
            break L1;
          } else {
            break L1;
          }
        }
        L2: {
          if (var31 < var33) {
            var33 = var31;
            break L2;
          } else {
            break L2;
          }
        }
        L3: {
          if (~var34 > ~var29) {
            var34 = var29;
            break L3;
          } else {
            break L3;
          }
        }
        L4: {
          if (var31 <= var34) {
            break L4;
          } else {
            var34 = var31;
            break L4;
          }
        }
        L5: {
          if (var28 <= var26) {
            var35 = var28;
            var36 = var26;
            break L5;
          } else {
            var35 = var26;
            var36 = var28;
            break L5;
          }
        }
        L6: {
          if (~var35 >= ~var30) {
            break L6;
          } else {
            var35 = var30;
            break L6;
          }
        }
        L7: {
          if (var35 <= var32) {
            break L7;
          } else {
            var35 = var32;
            break L7;
          }
        }
        L8: {
          if (~var36 > ~var30) {
            var36 = var30;
            break L8;
          } else {
            break L8;
          }
        }
        L9: {
          if (~var32 >= ~var36) {
            break L9;
          } else {
            var36 = var32;
            break L9;
          }
        }
        L10: {
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
            break L10;
          } else {
            var33 = dg.field_f;
            break L10;
          }
        }
        L11: {
          if (~dg.field_h > ~var34) {
            var34 = dg.field_h;
            break L11;
          } else {
            break L11;
          }
        }
        L12: {
          if (dg.field_j <= var35) {
            break L12;
          } else {
            var35 = dg.field_j;
            break L12;
          }
        }
        L13: {
          var36 = var36 - -15 >> 4;
          if (~var36 >= ~dg.field_k) {
            break L13;
          } else {
            var36 = dg.field_k;
            break L13;
          }
        }
        var34 = var33 + -var34;
        if (var34 >= 0) {
          return;
        } else {
          var36 = var35 - var36;
          var37 = 63;
          if (var36 >= 0) {
            return;
          } else {
            L14: {
              param12 = var35 * dg.field_i + var33;
              param15 = dg.field_i - -var34;
              var38 = 16777216.0 / (double)4096;
              var21 = (int)Math.floor(0.5 + var38 * Math.sin(var19));
              var40 = 16777216.0 / (double)4096;
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
                  L15: while (true) {
                    if (0 == var47) {
                      break L14;
                    } else {
                      L16: {
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
                          break L16;
                        } else {
                          break L16;
                        }
                      }
                      L17: {
                        var48 = 4096 + var52;
                        if (0 <= 4096 + var52) {
                          break L17;
                        } else {
                          var48 = (-var48 + (var23 + -1)) / var23;
                          var51 = var51 + var48 * var22;
                          var46 = var46 + var48;
                          var52 = var52 + var23 * var48;
                          param12 = param12 + var48;
                          break L17;
                        }
                      }
                      L18: while (true) {
                        L19: {
                          if (var46 == 0) {
                            break L19;
                          } else {
                            if (var51 < -4096) {
                              break L19;
                            } else {
                              param7 = var52 >> 12;
                              if (~(var52 >> 12) <= ~var18) {
                                break L19;
                              } else {
                                L20: {
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
                                    break L20;
                                  } else {
                                    L21: {
                                      if (param9 < 0) {
                                        var59 = 0;
                                        var55 = 0;
                                        break L21;
                                      } else {
                                        L22: {
                                          var55 = param16[var63];
                                          if ((-16777216 & var55) == 0) {
                                            stackOut_199_0 = 0;
                                            stackIn_200_0 = stackOut_199_0;
                                            break L22;
                                          } else {
                                            stackOut_198_0 = (4096 + -var53) * (4096 - var54);
                                            stackIn_200_0 = stackOut_198_0;
                                            break L22;
                                          }
                                        }
                                        var59 = stackIn_200_0;
                                        break L21;
                                      }
                                    }
                                    if (~param9 > ~(var17_int + -1)) {
                                      L23: {
                                        var56 = param16[1 + var63];
                                        if ((var56 & -16777216) != 0) {
                                          stackOut_206_0 = var53 * (4096 - var54);
                                          stackIn_207_0 = stackOut_206_0;
                                          break L23;
                                        } else {
                                          stackOut_205_0 = 0;
                                          stackIn_207_0 = stackOut_205_0;
                                          break L23;
                                        }
                                      }
                                      var60 = stackIn_207_0;
                                      break L20;
                                    } else {
                                      var60 = 0;
                                      var56 = 0;
                                      break L20;
                                    }
                                  }
                                }
                                L24: {
                                  if (var18 + -1 > param7) {
                                    L25: {
                                      if (var17_int - 1 > param9) {
                                        L26: {
                                          var58 = param16[var17_int + (var63 - -1)];
                                          if ((var58 & -16777216) != 0) {
                                            stackOut_215_0 = var53 * var54;
                                            stackIn_216_0 = stackOut_215_0;
                                            break L26;
                                          } else {
                                            stackOut_214_0 = 0;
                                            stackIn_216_0 = stackOut_214_0;
                                            break L26;
                                          }
                                        }
                                        var62 = stackIn_216_0;
                                        break L25;
                                      } else {
                                        var62 = 0;
                                        var58 = 0;
                                        break L25;
                                      }
                                    }
                                    if (0 > param9) {
                                      var57 = 0;
                                      var61 = 0;
                                      break L24;
                                    } else {
                                      L27: {
                                        var57 = param16[var17_int + var63];
                                        if ((-16777216 & var57) == 0) {
                                          stackOut_220_0 = 0;
                                          stackIn_221_0 = stackOut_220_0;
                                          break L27;
                                        } else {
                                          stackOut_219_0 = var54 * (-var53 + 4096);
                                          stackIn_221_0 = stackOut_219_0;
                                          break L27;
                                        }
                                      }
                                      var61 = stackIn_221_0;
                                      break L24;
                                    }
                                  } else {
                                    var57 = 0;
                                    var58 = 0;
                                    var61 = 0;
                                    var62 = 0;
                                    break L24;
                                  }
                                }
                                L28: {
                                  var61 = var61 >> 16;
                                  var59 = var59 >> 16;
                                  var60 = var60 >> 16;
                                  var62 = var62 >> 16;
                                  if (128 > var62 + (var61 + (var59 - -var60))) {
                                    break L28;
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
                                      break L28;
                                    } else {
                                      break L28;
                                    }
                                  }
                                }
                                param12++;
                                var46++;
                                var51 = var51 + var22;
                                var52 = var52 + var23;
                                continue L18;
                              }
                            }
                          }
                        }
                        param12 = param12 - var46;
                        param12 = param12 + param15;
                        param3 = param3 - var21;
                        param4 = param4 + var24;
                        var47++;
                        continue L15;
                      }
                    }
                  }
                } else {
                  var47 = var36;
                  L29: while (true) {
                    if (var47 == 0) {
                      break L14;
                    } else {
                      L30: {
                        var46 = var34;
                        var52 = var45 + param4;
                        var51 = var44 + param3;
                        var48 = -var49 + var51;
                        if (-var49 + var51 < 0) {
                          break L30;
                        } else {
                          var48 = (var22 - var48) / var22;
                          var46 = var46 + var48;
                          var51 = var51 + var22 * var48;
                          param12 = param12 + var48;
                          var52 = var52 + var48 * var23;
                          break L30;
                        }
                      }
                      L31: {
                        var48 = -var50 + var52;
                        if (-var50 + var52 >= 0) {
                          var48 = (-var48 + var23) / var23;
                          var46 = var46 + var48;
                          param12 = param12 + var48;
                          var52 = var52 + var23 * var48;
                          var51 = var51 + var48 * var22;
                          break L31;
                        } else {
                          break L31;
                        }
                      }
                      L32: while (true) {
                        L33: {
                          if (var46 == 0) {
                            break L33;
                          } else {
                            if (var51 < -4096) {
                              break L33;
                            } else {
                              if (var52 < -4096) {
                                break L33;
                              } else {
                                L34: {
                                  param7 = var52 >> 12;
                                  var53 = var51;
                                  param9 = var51 >> 12;
                                  var54 = var52;
                                  var54 = var54 & 4095;
                                  var63 = param9 + param7 * var17_int;
                                  var53 = var53 & 4095;
                                  if (param7 >= 0) {
                                    L35: {
                                      if (~(var17_int + -1) < ~param9) {
                                        L36: {
                                          var56 = param16[1 + var63];
                                          if ((-16777216 & var56) != 0) {
                                            stackOut_155_0 = (4096 + -var54) * var53;
                                            stackIn_156_0 = stackOut_155_0;
                                            break L36;
                                          } else {
                                            stackOut_154_0 = 0;
                                            stackIn_156_0 = stackOut_154_0;
                                            break L36;
                                          }
                                        }
                                        var60 = stackIn_156_0;
                                        break L35;
                                      } else {
                                        var60 = 0;
                                        var56 = 0;
                                        break L35;
                                      }
                                    }
                                    if (param9 < 0) {
                                      var59 = 0;
                                      var55 = 0;
                                      break L34;
                                    } else {
                                      L37: {
                                        var55 = param16[var63];
                                        if ((var55 & -16777216) == 0) {
                                          stackOut_160_0 = 0;
                                          stackIn_161_0 = stackOut_160_0;
                                          break L37;
                                        } else {
                                          stackOut_159_0 = (4096 - var53) * (-var54 + 4096);
                                          stackIn_161_0 = stackOut_159_0;
                                          break L37;
                                        }
                                      }
                                      var59 = stackIn_161_0;
                                      break L34;
                                    }
                                  } else {
                                    var56 = 0;
                                    var60 = 0;
                                    var59 = 0;
                                    var55 = 0;
                                    break L34;
                                  }
                                }
                                L38: {
                                  if (~(var18 - 1) >= ~param7) {
                                    var57 = 0;
                                    var58 = 0;
                                    var61 = 0;
                                    var62 = 0;
                                    break L38;
                                  } else {
                                    L39: {
                                      if (~(-1 + var17_int) >= ~param9) {
                                        var62 = 0;
                                        var58 = 0;
                                        break L39;
                                      } else {
                                        L40: {
                                          var58 = param16[1 + var17_int + var63];
                                          if ((var58 & -16777216) == 0) {
                                            stackOut_167_0 = 0;
                                            stackIn_168_0 = stackOut_167_0;
                                            break L40;
                                          } else {
                                            stackOut_166_0 = var53 * var54;
                                            stackIn_168_0 = stackOut_166_0;
                                            break L40;
                                          }
                                        }
                                        var62 = stackIn_168_0;
                                        break L39;
                                      }
                                    }
                                    if (0 > param9) {
                                      var57 = 0;
                                      var61 = 0;
                                      break L38;
                                    } else {
                                      L41: {
                                        var57 = param16[var63 + var17_int];
                                        if ((var57 & -16777216) == 0) {
                                          stackOut_173_0 = 0;
                                          stackIn_174_0 = stackOut_173_0;
                                          break L41;
                                        } else {
                                          stackOut_172_0 = var54 * (4096 + -var53);
                                          stackIn_174_0 = stackOut_172_0;
                                          break L41;
                                        }
                                      }
                                      var61 = stackIn_174_0;
                                      break L38;
                                    }
                                  }
                                }
                                L42: {
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
                                      break L42;
                                    } else {
                                      break L42;
                                    }
                                  } else {
                                    break L42;
                                  }
                                }
                                var51 = var51 + var22;
                                var52 = var52 + var23;
                                param12++;
                                var46++;
                                continue L32;
                              }
                            }
                          }
                        }
                        param12 = param12 - var46;
                        param12 = param12 + param15;
                        param4 = param4 + var24;
                        var47++;
                        param3 = param3 - var21;
                        continue L29;
                      }
                    }
                  }
                }
              } else {
                L43: {
                  if (var21 >= 0) {
                    break L43;
                  } else {
                    if (var23 >= 0) {
                      break L43;
                    } else {
                      var47 = var36;
                      L44: while (true) {
                        if (var47 == 0) {
                          break L14;
                        } else {
                          L45: {
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
                              break L45;
                            } else {
                              break L45;
                            }
                          }
                          L46: {
                            var48 = var52 - var50;
                            if (var52 - var50 < 0) {
                              break L46;
                            } else {
                              var48 = (var23 - var48) / var23;
                              param12 = param12 + var48;
                              var51 = var51 + var48 * var22;
                              var46 = var46 + var48;
                              var52 = var52 + var48 * var23;
                              break L46;
                            }
                          }
                          L47: while (true) {
                            L48: {
                              if (var46 == 0) {
                                break L48;
                              } else {
                                if (var52 < -4096) {
                                  break L48;
                                } else {
                                  param9 = var51 >> 12;
                                  if (~var17_int >= ~(var51 >> 12)) {
                                    break L48;
                                  } else {
                                    L49: {
                                      param7 = var52 >> 12;
                                      var53 = var51;
                                      var54 = var52;
                                      var63 = param9 + param7 * var17_int;
                                      var54 = var54 & 4095;
                                      var53 = var53 & 4095;
                                      if (~(-1 + var18) < ~param7) {
                                        L50: {
                                          if (~(-1 + var17_int) < ~param9) {
                                            L51: {
                                              var58 = param16[1 + (var63 - -var17_int)];
                                              if (0 != (var58 & -16777216)) {
                                                stackOut_62_0 = var53 * var54;
                                                stackIn_63_0 = stackOut_62_0;
                                                break L51;
                                              } else {
                                                stackOut_61_0 = 0;
                                                stackIn_63_0 = stackOut_61_0;
                                                break L51;
                                              }
                                            }
                                            var62 = stackIn_63_0;
                                            break L50;
                                          } else {
                                            var58 = 0;
                                            var62 = 0;
                                            break L50;
                                          }
                                        }
                                        if (param9 >= 0) {
                                          L52: {
                                            var57 = param16[var17_int + var63];
                                            if ((-16777216 & var57) != 0) {
                                              stackOut_68_0 = var54 * (4096 - var53);
                                              stackIn_69_0 = stackOut_68_0;
                                              break L52;
                                            } else {
                                              stackOut_67_0 = 0;
                                              stackIn_69_0 = stackOut_67_0;
                                              break L52;
                                            }
                                          }
                                          var61 = stackIn_69_0;
                                          break L49;
                                        } else {
                                          var57 = 0;
                                          var61 = 0;
                                          break L49;
                                        }
                                      } else {
                                        var57 = 0;
                                        var58 = 0;
                                        var61 = 0;
                                        var62 = 0;
                                        break L49;
                                      }
                                    }
                                    L53: {
                                      if (param7 >= 0) {
                                        L54: {
                                          if (param9 >= 0) {
                                            L55: {
                                              var55 = param16[var63];
                                              if ((var55 & -16777216) != 0) {
                                                stackOut_76_0 = (-var53 + 4096) * (-var54 + 4096);
                                                stackIn_77_0 = stackOut_76_0;
                                                break L55;
                                              } else {
                                                stackOut_75_0 = 0;
                                                stackIn_77_0 = stackOut_75_0;
                                                break L55;
                                              }
                                            }
                                            var59 = stackIn_77_0;
                                            break L54;
                                          } else {
                                            var59 = 0;
                                            var55 = 0;
                                            break L54;
                                          }
                                        }
                                        if (~(-1 + var17_int) >= ~param9) {
                                          var56 = 0;
                                          var60 = 0;
                                          break L53;
                                        } else {
                                          L56: {
                                            var56 = param16[var63 + 1];
                                            if (0 != (var56 & -16777216)) {
                                              stackOut_81_0 = var53 * (-var54 + 4096);
                                              stackIn_82_0 = stackOut_81_0;
                                              break L56;
                                            } else {
                                              stackOut_80_0 = 0;
                                              stackIn_82_0 = stackOut_80_0;
                                              break L56;
                                            }
                                          }
                                          var60 = stackIn_82_0;
                                          break L53;
                                        }
                                      } else {
                                        var55 = 0;
                                        var56 = 0;
                                        var60 = 0;
                                        var59 = 0;
                                        break L53;
                                      }
                                    }
                                    L57: {
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
                                          break L57;
                                        } else {
                                          break L57;
                                        }
                                      } else {
                                        break L57;
                                      }
                                    }
                                    var51 = var51 + var22;
                                    param12++;
                                    var52 = var52 + var23;
                                    var46++;
                                    continue L47;
                                  }
                                }
                              }
                            }
                            param12 = param12 - var46;
                            param3 = param3 - var21;
                            param4 = param4 + var24;
                            param12 = param12 + param15;
                            var47++;
                            continue L44;
                          }
                        }
                      }
                    }
                  }
                }
                var47 = var36;
                L58: while (true) {
                  if (var47 == 0) {
                    break L14;
                  } else {
                    L59: {
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
                        break L59;
                      } else {
                        break L59;
                      }
                    }
                    L60: {
                      L61: {
                        var48 = 4096 + var52;
                        if (4096 + var52 >= 0) {
                          break L61;
                        } else {
                          if (0 != var23) {
                            var48 = (-var48 + (-1 + var23)) / var23;
                            param12 = param12 + var48;
                            var46 = var46 + var48;
                            var52 = var52 + var48 * var23;
                            var51 = var51 + var48 * var22;
                            break L61;
                          } else {
                            param12 = param12 - var46;
                            break L60;
                          }
                        }
                      }
                      L62: while (true) {
                        L63: {
                          if (0 == var46) {
                            break L63;
                          } else {
                            param9 = var51 >> 12;
                            if (~var17_int >= ~(var51 >> 12)) {
                              break L63;
                            } else {
                              param7 = var52 >> 12;
                              if (~var18 >= ~(var52 >> 12)) {
                                break L63;
                              } else {
                                L64: {
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
                                    break L64;
                                  } else {
                                    L65: {
                                      if (param9 < 0) {
                                        var55 = 0;
                                        var59 = 0;
                                        break L65;
                                      } else {
                                        L66: {
                                          var55 = param16[var63];
                                          if ((var55 & -16777216) != 0) {
                                            stackOut_108_0 = (-var54 + 4096) * (4096 + -var53);
                                            stackIn_109_0 = stackOut_108_0;
                                            break L66;
                                          } else {
                                            stackOut_107_0 = 0;
                                            stackIn_109_0 = stackOut_107_0;
                                            break L66;
                                          }
                                        }
                                        var59 = stackIn_109_0;
                                        break L65;
                                      }
                                    }
                                    if (~(-1 + var17_int) >= ~param9) {
                                      var60 = 0;
                                      var56 = 0;
                                      break L64;
                                    } else {
                                      L67: {
                                        var56 = param16[var63 + 1];
                                        if ((-16777216 & var56) != 0) {
                                          stackOut_114_0 = (4096 + -var54) * var53;
                                          stackIn_115_0 = stackOut_114_0;
                                          break L67;
                                        } else {
                                          stackOut_113_0 = 0;
                                          stackIn_115_0 = stackOut_113_0;
                                          break L67;
                                        }
                                      }
                                      var60 = stackIn_115_0;
                                      break L64;
                                    }
                                  }
                                }
                                L68: {
                                  if (~param7 <= ~(var18 + -1)) {
                                    var58 = 0;
                                    var61 = 0;
                                    var57 = 0;
                                    var62 = 0;
                                    break L68;
                                  } else {
                                    L69: {
                                      if (~param9 <= ~(-1 + var17_int)) {
                                        var58 = 0;
                                        var62 = 0;
                                        break L69;
                                      } else {
                                        L70: {
                                          var58 = param16[var63 + (var17_int + 1)];
                                          if (0 == (-16777216 & var58)) {
                                            stackOut_122_0 = 0;
                                            stackIn_123_0 = stackOut_122_0;
                                            break L70;
                                          } else {
                                            stackOut_121_0 = var54 * var53;
                                            stackIn_123_0 = stackOut_121_0;
                                            break L70;
                                          }
                                        }
                                        var62 = stackIn_123_0;
                                        break L69;
                                      }
                                    }
                                    if (0 <= param9) {
                                      L71: {
                                        var57 = param16[var17_int + var63];
                                        if ((-16777216 & var57) == 0) {
                                          stackOut_129_0 = 0;
                                          stackIn_130_0 = stackOut_129_0;
                                          break L71;
                                        } else {
                                          stackOut_128_0 = (-var53 + 4096) * var54;
                                          stackIn_130_0 = stackOut_128_0;
                                          break L71;
                                        }
                                      }
                                      var61 = stackIn_130_0;
                                      break L68;
                                    } else {
                                      var61 = 0;
                                      var57 = 0;
                                      break L68;
                                    }
                                  }
                                }
                                L72: {
                                  var59 = var59 >> 16;
                                  var62 = var62 >> 16;
                                  var60 = var60 >> 16;
                                  var61 = var61 >> 16;
                                  if (var60 + var59 - (-var61 + -var62) < 128) {
                                    break L72;
                                  } else {
                                    var64 = (var56 & 16711935) * var60 + var59 * (16711935 & var55);
                                    var65 = (16711935 & var55 >>> 8) * var59 + var60 * ((-16711936 & var56) >>> 8);
                                    var64 = var64 + (var61 * (var57 & 16711935) + (16711935 & var58) * var62);
                                    var65 = var65 + (var62 * ((-16711936 & var58) >>> 8) + (16711935 & var57 >>> 8) * var61);
                                    var64 = 16711935 & var64 >> 8;
                                    var66 = var65 >>> 24;
                                    var65 = var65 & 65280;
                                    if (var66 == 0) {
                                      break L72;
                                    } else {
                                      param6[param12] = mp.a(dda.a(var66 * var64, -16711936) - -dda.a(var66 * var65, 16711680) >> 8, (var66 >> 1) + 128 << 24);
                                      break L72;
                                    }
                                  }
                                }
                                var46++;
                                param12++;
                                var52 = var52 + var23;
                                var51 = var51 + var22;
                                continue L62;
                              }
                            }
                          }
                        }
                        param12 = param12 - var46;
                        break L60;
                      }
                    }
                    var47++;
                    param12 = param12 + param15;
                    param3 = param3 - var21;
                    param4 = param4 + var24;
                    continue L58;
                  }
                }
              }
            }
            return;
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
            String stackIn_6_0 = null;
            Object stackIn_11_0 = null;
            RuntimeException stackIn_13_0 = null;
            StringBuilder stackIn_13_1 = null;
            RuntimeException stackIn_14_0 = null;
            StringBuilder stackIn_14_1 = null;
            RuntimeException stackIn_15_0 = null;
            StringBuilder stackIn_15_1 = null;
            String stackIn_15_2 = null;
            RuntimeException stackIn_16_0 = null;
            StringBuilder stackIn_16_1 = null;
            RuntimeException stackIn_17_0 = null;
            StringBuilder stackIn_17_1 = null;
            RuntimeException stackIn_18_0 = null;
            StringBuilder stackIn_18_1 = null;
            String stackIn_18_2 = null;
            String stackOut_5_0 = null;
            Object stackOut_10_0 = null;
            RuntimeException stackOut_12_0 = null;
            StringBuilder stackOut_12_1 = null;
            RuntimeException stackOut_13_0 = null;
            StringBuilder stackOut_13_1 = null;
            String stackOut_13_2 = null;
            RuntimeException stackOut_14_0 = null;
            StringBuilder stackOut_14_1 = null;
            String stackOut_14_2 = null;
            RuntimeException stackOut_15_0 = null;
            StringBuilder stackOut_15_1 = null;
            RuntimeException stackOut_16_0 = null;
            StringBuilder stackOut_16_1 = null;
            String stackOut_16_2 = null;
            RuntimeException stackOut_17_0 = null;
            StringBuilder stackOut_17_1 = null;
            String stackOut_17_2 = null;
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
                            var3 = (String) ac.a(param2, "getcookies", (byte) 64);
                            var4 = fda.a(-1, ';', var3);
                            var5 = 0;
                            statePc = 2;
                            continue stateLoop;
                        } catch (Throwable stateCaught_1) {
                            caughtException = stateCaught_1;
                            statePc = 9;
                            continue stateLoop;
                        }
                    }
                    case 2: {
                        try {
                            if (var4.length <= var5) {
                                statePc = 10;
                            } else {
                                statePc = 3;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_2) {
                            caughtException = stateCaught_2;
                            statePc = 9;
                            continue stateLoop;
                        }
                    }
                    case 3: {
                        try {
                            var6 = var4[var5].indexOf('=');
                            if (var6 < 0) {
                                statePc = 7;
                            } else {
                                statePc = 4;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_3) {
                            caughtException = stateCaught_3;
                            statePc = 9;
                            continue stateLoop;
                        }
                    }
                    case 4: {
                        try {
                            if (!var4[var5].substring(0, var6).trim().equals((Object) (Object) param0)) {
                                statePc = 7;
                            } else {
                                statePc = 5;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_4) {
                            caughtException = stateCaught_4;
                            statePc = 9;
                            continue stateLoop;
                        }
                    }
                    case 5: {
                        try {
                            stackOut_5_0 = var4[var5].substring(var6 - -1).trim();
                            stackIn_6_0 = stackOut_5_0;
                            statePc = 6;
                            continue stateLoop;
                        } catch (Throwable stateCaught_5) {
                            caughtException = stateCaught_5;
                            statePc = 9;
                            continue stateLoop;
                        }
                    }
                    case 6: {
                        return stackIn_6_0;
                    }
                    case 7: {
                        try {
                            var5++;
                            statePc = 2;
                            continue stateLoop;
                        } catch (Throwable stateCaught_7) {
                            caughtException = stateCaught_7;
                            statePc = 9;
                            continue stateLoop;
                        }
                    }
                    case 9: {
                        try {
                            var3_ref = caughtException;
                            statePc = 10;
                            continue stateLoop;
                        } catch (Throwable stateCaught_9) {
                            caughtException = stateCaught_9;
                            statePc = 12;
                            continue stateLoop;
                        }
                    }
                    case 10: {
                        try {
                            stackOut_10_0 = null;
                            stackIn_11_0 = stackOut_10_0;
                            statePc = 11;
                            continue stateLoop;
                        } catch (Throwable stateCaught_10) {
                            caughtException = stateCaught_10;
                            statePc = 12;
                            continue stateLoop;
                        }
                    }
                    case 11: {
                        return (String) (Object) stackIn_11_0;
                    }
                    case 12: {
                        var3_ref2 = (RuntimeException) (Object) caughtException;
                        stackOut_12_0 = (RuntimeException) var3_ref2;
                        stackOut_12_1 = new StringBuilder().append("fi.A(");
                        stackIn_14_0 = stackOut_12_0;
                        stackIn_14_1 = stackOut_12_1;
                        stackIn_13_0 = stackOut_12_0;
                        stackIn_13_1 = stackOut_12_1;
                        if (param0 == null) {
                            statePc = 14;
                        } else {
                            statePc = 13;
                        }
                        continue stateLoop;
                    }
                    case 13: {
                        stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
                        stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
                        stackOut_13_2 = "{...}";
                        stackIn_15_0 = stackOut_13_0;
                        stackIn_15_1 = stackOut_13_1;
                        stackIn_15_2 = stackOut_13_2;
                        statePc = 15;
                        continue stateLoop;
                    }
                    case 14: {
                        stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
                        stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
                        stackOut_14_2 = "null";
                        stackIn_15_0 = stackOut_14_0;
                        stackIn_15_1 = stackOut_14_1;
                        stackIn_15_2 = stackOut_14_2;
                        statePc = 15;
                        continue stateLoop;
                    }
                    case 15: {
                        stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
                        stackOut_15_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_15_2).append(',').append(61).append(',');
                        stackIn_17_0 = stackOut_15_0;
                        stackIn_17_1 = stackOut_15_1;
                        stackIn_16_0 = stackOut_15_0;
                        stackIn_16_1 = stackOut_15_1;
                        if (param2 == null) {
                            statePc = 17;
                        } else {
                            statePc = 16;
                        }
                        continue stateLoop;
                    }
                    case 16: {
                        stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
                        stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
                        stackOut_16_2 = "{...}";
                        stackIn_18_0 = stackOut_16_0;
                        stackIn_18_1 = stackOut_16_1;
                        stackIn_18_2 = stackOut_16_2;
                        statePc = 18;
                        continue stateLoop;
                    }
                    case 17: {
                        stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
                        stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
                        stackOut_17_2 = "null";
                        stackIn_18_0 = stackOut_17_0;
                        stackIn_18_1 = stackOut_17_1;
                        stackIn_18_2 = stackOut_17_2;
                        statePc = 18;
                        continue stateLoop;
                    }
                    case 18: {
                        throw pe.a((Throwable) (Object) stackIn_18_0, stackIn_18_2 + ')');
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
            throw pe.a((Throwable) (Object) runtimeException, "fi.C(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final void b(lu param0, byte param1) {
        try {
            param0.d(((fi) this).field_r, 0);
            param0.d(((fi) this).field_q, 0);
            int var3_int = 20 / ((37 - param1) / 38);
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) (Object) runtimeException, "fi.E(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
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
            throw pe.a((Throwable) (Object) runtimeException, "fi.B(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
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
            throw pe.a((Throwable) (Object) runtimeException, "fi.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_o = "Creature viewer. Examine a creature and click the tooltips to continue.";
    }
}
