/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qg {
    static String field_a;
    static String field_c;
    static sna field_b;

    final static void a(int[] param0, int param1, kv param2, int param3, int param4, int param5, int param6, int param7, int[] param8, int param9, int param10, int param11, int param12, int param13, int param14, int param15, int param16) {
        int stackIn_67_0 = 0;
        int stackIn_73_0 = 0;
        int stackIn_80_0 = 0;
        int stackIn_85_0 = 0;
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
        RuntimeException stackIn_235_0 = null;
        StringBuilder stackIn_235_1 = null;
        String stackIn_236_2 = null;
        StringBuilder stackIn_238_1 = null;
        String stackIn_239_2 = null;
        StringBuilder stackIn_241_1 = null;
        String stackIn_242_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var17_int = 0;
        RuntimeException var17 = null;
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
        int var21Lifetime1;
        int var22Lifetime1;
        int var23Lifetime1;
        int var24Lifetime1;
        int var45Lifetime1;
        int var45Lifetime2;
        int var46Lifetime1;
        int var46Lifetime2;
        int var47Lifetime1;
        int var47Lifetime2;
        int var50Lifetime1;
        int var50Lifetime2;
        int var51Lifetime1;
        int var51Lifetime2;
        int var52Lifetime1;
        int var52Lifetime2;
        int var53Lifetime1;
        int var53Lifetime2;
        int var54Lifetime1;
        int var54Lifetime2;
        int var55Lifetime1;
        int var55Lifetime2;
        int var56Lifetime1;
        int var56Lifetime2;
        int var57Lifetime1;
        int var57Lifetime2;
        int var58Lifetime1;
        int var58Lifetime2;
        int var59Lifetime1;
        int var59Lifetime2;
        int var60Lifetime1;
        int var60Lifetime2;
        int var61Lifetime1;
        int var61Lifetime2;
        int var62Lifetime1;
        int var62Lifetime2;
        int var63Lifetime1;
        int var63Lifetime2;
        int var64Lifetime1;
        int var64Lifetime2;
        int var65Lifetime1;
        int var65Lifetime2;
        int var66Lifetime1;
        int var66Lifetime2;
        int var67Lifetime1;
        int var67Lifetime2;
        int var45Lifetime3;
        int var46Lifetime3;
        int var47Lifetime3;
        int var50Lifetime3;
        int var51Lifetime3;
        int var52Lifetime3;
        int var53Lifetime3;
        int var54Lifetime3;
        int var55Lifetime3;
        int var56Lifetime3;
        int var57Lifetime3;
        int var58Lifetime3;
        int var59Lifetime3;
        int var60Lifetime3;
        int var61Lifetime3;
        int var62Lifetime3;
        int var63Lifetime3;
        int var64Lifetime3;
        int var65Lifetime3;
        int var66Lifetime3;
        int var67Lifetime3;
        int var47Lifetime1Lifetime1;
        int var47Lifetime2Lifetime1;
        var68 = BachelorFridge.field_y;
        try {
          if (param1 != 0 &&
            param12 != 0) {
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
            var26 = var21 * -(-param16) + var24 * -param11;
            var27 = -param11 * var23 + (-param16 + (var17_int << 4)) * var22;
            var28 = -(-param16 + (var17_int << 4)) * var21 + var24 * -param11;
            var29 = var23 * (-param11 + (var18 << 4)) + var22 * -param16;
            var30 = ((var18 << 4) - param11) * var24 + var21 * -(-param16);
            var31 = (-param11 + (var18 << 4)) * var23 + ((var17_int << 4) - param16) * var22;
            var32 = -(-param16 + (var17_int << 4)) * var21 + (-param11 + (var18 << 4)) * var24;
            if (var25 >= var27) {
              var33 = var27;
              var34 = var25;
            } else {
              var33 = var25;
              var34 = var27;
            }
            if (var33 > var29) {
              var33 = var29;
            }
            if (var29 > var34) {
              var34 = var29;
            }
            if (var31 < var33) {
              var33 = var31;
            }
            if (var34 < var31) {
              var34 = var31;
            }
            if (var28 <= var26) {
              var36 = var26;
              var35 = var28;
            } else {
              var35 = var26;
              var36 = var28;
            }
            if (var35 > var30) {
              var35 = var30;
            }
            if (var30 > var36) {
              var36 = var30;
            }
            if (var35 > var32) {
              var35 = var32;
            }
            var33 = var33 >> 12;
            var34 = 4095 + var34 >> 12;
            if (var32 > var36) {
              var36 = var32;
            }
            var35 = var35 >> 12;
            var34 = var34 + param3;
            var36 = 4095 + var36 >> 12;
            var33 = var33 + param3;
            var35 = var35 + param15;
            var34 = 15 + var34 >> 4;
            var35 = var35 >> 4;
            var33 = var33 >> 4;
            var36 = var36 + param15;
            if (var35 < dg.field_j) {
              var35 = dg.field_j;
            }
            if (dg.field_h < var34) {
              var34 = dg.field_h;
            }
            var36 = var36 + 15 >> 4;
            if (var33 < dg.field_f) {
              var33 = dg.field_f;
            }
            if (dg.field_k < var36) {
              var36 = dg.field_k;
            }
            var34 = -var34 + var33;
            if (var34 >= 0) {
              return;
            }
            var36 = var35 - var36;
            if (var36 >= 0) {
              return;
            }
            param14 = dg.field_i * var35 + var33;
            param9 = dg.field_i + var34;
            var37 = 16777216.0 / (double)param1;
            var39 = 16777216.0 / (double)param12;
            var21Lifetime1 = (int)Math.floor(Math.sin(var19) * var37 + 0.5);
            var22Lifetime1 = (int)Math.floor(0.5 + var37 * Math.cos(var19));
            var23Lifetime1 = (int)Math.floor(Math.sin(var19) * var39 + 0.5);
            if (param4 != 0) {
              return;
            }
            var24Lifetime1 = (int)Math.floor(0.5 + var39 * Math.cos(var19));
            var41 = 8 + ((var33 << 4) - param3);
            var42 = (var35 << 4) + (8 - param15);
            param6 = (param16 << 8) - (var42 * var21Lifetime1 >> 4);
            param5 = (var42 * var24Lifetime1 >> 4) + (param11 << 8);
            var43 = var22Lifetime1 * var41 >> 4;
            var44 = var23Lifetime1 * var41 >> 4;
            var48 = var17_int << 12;
            var49 = var18 << 12;
            if (var22Lifetime1 < 0) {
              if (var23Lifetime1 >= 0) {
                var46 = var36;
                while (var46 != 0) {
                  var51 = var44 + param5;
                  var50 = param6 + var43;
                  var45 = var34;
                  var47 = var50 - var48;
                  if (var50 - var48 >= 0) {
                    var47 = (-var47 + var22Lifetime1) / var22Lifetime1;
                    var45 = var45 + var47;
                    var50 = var50 + var47 * var22Lifetime1;
                    var51 = var51 + var47 * var23Lifetime1;
                    param14 = param14 + var47;
                  }
                  var47 = 4096 + var51;
                  if (4096 + var51 < 0) {
                    var47 = (-var47 + (-1 + var23Lifetime1)) / var23Lifetime1;
                    var45 = var45 + var47;
                    param14 = param14 + var47;
                    var51 = var51 + var47 * var23Lifetime1;
                    var50 = var50 + var22Lifetime1 * var47;
                  }
                  while (0 != var45) {
                    if (var50 >= -4096) {
                      param7 = var51 >> 12;
                      if (var18 > var51 >> 12) {
                        var53 = var51;
                        var52 = var50;
                        param13 = var50 >> 12;
                        var62 = var17_int * param7 + param13;
                        var53 = var53 & 4095;
                        var52 = var52 & 4095;
                        if (param7 >= var18 - 1) {
                          var57 = 0;
                          var61 = 0;
                          var60 = 0;
                          var56 = 0;
                        } else {
                          if (param13 < var17_int - 1) {
                            var57 = param0[var62 + var17_int + 1];
                            if ((var57 & -16777216) != 0) {
                              stackIn_204_0 = var53 * var52;
                            } else {
                              stackIn_204_0 = 0;
                            }
                            var61 = stackIn_204_0;
                          } else {
                            var57 = 0;
                            var61 = 0;
                          }
                          if (param13 < 0) {
                            var60 = 0;
                            var56 = 0;
                          } else {
                            var56 = param0[var62 + var17_int];
                            if ((var56 & -16777216) != 0) {
                              stackIn_209_0 = (-var52 + 4096) * var53;
                            } else {
                              stackIn_209_0 = 0;
                            }
                            var60 = stackIn_209_0;
                          }
                        }
                        if (param7 < 0) {
                          var54 = 0;
                          var58 = 0;
                          var55 = 0;
                          var59 = 0;
                        } else {
                          if (0 <= param13) {
                            var54 = param0[var62];
                            if ((-16777216 & var54) == 0) {
                              stackIn_218_0 = 0;
                            } else {
                              stackIn_218_0 = (-var52 + 4096) * (-var53 + 4096);
                            }
                            var58 = stackIn_218_0;
                          } else {
                            var54 = 0;
                            var58 = 0;
                          }
                          if (param13 < -1 + var17_int) {
                            var55 = param0[var62 + 1];
                            if ((var55 & -16777216) == 0) {
                              stackIn_224_0 = 0;
                            } else {
                              stackIn_224_0 = (4096 - var53) * var52;
                            }
                            var59 = stackIn_224_0;
                          } else {
                            var59 = 0;
                            var55 = 0;
                          }
                        }
                        var58 = var58 >> 16;
                        var59 = var59 >> 16;
                        var61 = var61 >> 16;
                        var60 = var60 >> 16;
                        if (var61 + var60 + (var59 + var58) >= 128) {
                          var63 = (16711935 & var55) * var59 + var58 * (var54 & 16711935);
                          var63 = var63 + ((16711935 & var57) * var61 + var60 * (16711935 & var56));
                          var64 = ((var54 & -16711936) >>> 8) * var58 + (var55 >>> 8 & 16711935) * var59;
                          var64 = var64 + (var61 * ((-16711936 & var57) >>> 8) + var60 * ((-16711936 & var56) >>> 8));
                          var65 = var64 >>> 24;
                          var63 = (-16711725 & var63) >>> 8;
                          var64 = var64 & 65280;
                          if (var65 != 0) {
                            var67 = param8[param14];
                            var66 = -var65 + 256;
                            param8[param14] = mp.a(dda.a(-16711936, var65 * var63 + var66 * dda.a(16711935, var67)) + dda.a(dda.a(var67, 65280) * var66 + var65 * var64, 16711680) >>> 8, 128 + (var65 >> 1) << 24);
                          }
                        }
                        var45++;
                        var51 = var51 + var23Lifetime1;
                        var50 = var50 + var22Lifetime1;
                        param14++;
                        continue;
                      }
                    }
                    break;
                  }
                  param14 = param14 - var45;
                  param6 = param6 - var21Lifetime1;
                  param14 = param14 + param9;
                  var46++;
                  param5 = param5 + var24Lifetime1;
                }
                return;
              }
              var46Lifetime3 = var36;
              while (var46Lifetime3 != 0) {
                var45Lifetime3 = var34;
                var51Lifetime3 = param5 + var44;
                var50Lifetime3 = var43 + param6;
                var47Lifetime3 = -var48 + var50Lifetime3;
                if (0 <= -var48 + var50Lifetime3) {
                  var47Lifetime3 = (var22Lifetime1 - var47Lifetime3) / var22Lifetime1;
                  var50Lifetime3 = var50Lifetime3 + var22Lifetime1 * var47Lifetime3;
                  param14 = param14 + var47Lifetime3;
                  var45Lifetime3 = var45Lifetime3 + var47Lifetime3;
                  var51Lifetime3 = var51Lifetime3 + var23Lifetime1 * var47Lifetime3;
                }
                var47Lifetime3 = -var49 + var51Lifetime3;
                if (-var49 + var51Lifetime3 >= 0) {
                  var47Lifetime3 = (var23Lifetime1 - var47Lifetime3) / var23Lifetime1;
                  var45Lifetime3 = var45Lifetime3 + var47Lifetime3;
                  var51Lifetime3 = var51Lifetime3 + var47Lifetime3 * var23Lifetime1;
                  param14 = param14 + var47Lifetime3;
                  var50Lifetime3 = var50Lifetime3 + var22Lifetime1 * var47Lifetime3;
                }
                while (var45Lifetime3 != 0) {
                  if (-4096 <= var50Lifetime3 &&
                    -4096 <= var51Lifetime3) {
                    param13 = var50Lifetime3 >> 12;
                    var52Lifetime3 = var50Lifetime3;
                    var53Lifetime3 = var51Lifetime3;
                    param7 = var51Lifetime3 >> 12;
                    var62Lifetime3 = var17_int * param7 + param13;
                    var52Lifetime3 = var52Lifetime3 & 4095;
                    var53Lifetime3 = var53Lifetime3 & 4095;
                    if (-1 + var18 > param7) {
                      if (param13 >= 0) {
                        var56Lifetime3 = param0[var62Lifetime3 + var17_int];
                        if ((-16777216 & var56Lifetime3) != 0) {
                          stackIn_160_0 = var53Lifetime3 * (4096 - var52Lifetime3);
                        } else {
                          stackIn_160_0 = 0;
                        }
                        var60Lifetime3 = stackIn_160_0;
                      } else {
                        var56Lifetime3 = 0;
                        var60Lifetime3 = 0;
                      }
                      if (var17_int - 1 <= param13) {
                        var57Lifetime3 = 0;
                        var61Lifetime3 = 0;
                      } else {
                        var57Lifetime3 = param0[1 + (var17_int + var62Lifetime3)];
                        if ((-16777216 & var57Lifetime3) == 0) {
                          stackIn_165_0 = 0;
                        } else {
                          stackIn_165_0 = var52Lifetime3 * var53Lifetime3;
                        }
                        var61Lifetime3 = stackIn_165_0;
                      }
                    } else {
                      var56Lifetime3 = 0;
                      var57Lifetime3 = 0;
                      var61Lifetime3 = 0;
                      var60Lifetime3 = 0;
                    }
                    if (param7 >= 0) {
                      if (param13 < -1 + var17_int) {
                        var55Lifetime3 = param0[1 + var62Lifetime3];
                        if ((-16777216 & var55Lifetime3) == 0) {
                          stackIn_174_0 = 0;
                        } else {
                          stackIn_174_0 = var52Lifetime3 * (4096 - var53Lifetime3);
                        }
                        var59Lifetime3 = stackIn_174_0;
                      } else {
                        var59Lifetime3 = 0;
                        var55Lifetime3 = 0;
                      }
                      if (param13 < 0) {
                        var54Lifetime3 = 0;
                        var58Lifetime3 = 0;
                      } else {
                        var54Lifetime3 = param0[var62Lifetime3];
                        if ((var54Lifetime3 & -16777216) == 0) {
                          stackIn_179_0 = 0;
                        } else {
                          stackIn_179_0 = (-var52Lifetime3 + 4096) * (4096 - var53Lifetime3);
                        }
                        var58Lifetime3 = stackIn_179_0;
                      }
                    } else {
                      var58Lifetime3 = 0;
                      var54Lifetime3 = 0;
                      var59Lifetime3 = 0;
                      var55Lifetime3 = 0;
                    }
                    var61Lifetime3 = var61Lifetime3 >> 16;
                    var59Lifetime3 = var59Lifetime3 >> 16;
                    var58Lifetime3 = var58Lifetime3 >> 16;
                    var60Lifetime3 = var60Lifetime3 >> 16;
                    if (var61Lifetime3 + var58Lifetime3 + var59Lifetime3 + var60Lifetime3 >= 128) {
                      var63Lifetime3 = var58Lifetime3 * (var54Lifetime3 & 16711935) + var59Lifetime3 * (16711935 & var55Lifetime3);
                      var64Lifetime3 = (16711935 & var55Lifetime3 >>> 8) * var59Lifetime3 + var58Lifetime3 * (var54Lifetime3 >>> 8 & 16711935);
                      var63Lifetime3 = var63Lifetime3 + ((var57Lifetime3 & 16711935) * var61Lifetime3 + (var56Lifetime3 & 16711935) * var60Lifetime3);
                      var64Lifetime3 = var64Lifetime3 + (((var57Lifetime3 & -16711936) >>> 8) * var61Lifetime3 + var60Lifetime3 * ((var56Lifetime3 & -16711936) >>> 8));
                      var63Lifetime3 = 402587903 & var63Lifetime3 >>> 8;
                      var65Lifetime3 = var64Lifetime3 >>> 24;
                      var64Lifetime3 = 65280 & var64Lifetime3;
                      if (var65Lifetime3 != 0) {
                        var66Lifetime3 = 256 - var65Lifetime3;
                        var67Lifetime3 = param8[param14];
                        param8[param14] = mp.a(128 + (var65Lifetime3 >> 1) << 24, dda.a(-16711936, var63Lifetime3 * var65Lifetime3 + dda.a(var67Lifetime3, 16711935) * var66Lifetime3) + dda.a(16711680, var66Lifetime3 * dda.a(65280, var67Lifetime3) + var64Lifetime3 * var65Lifetime3) >>> 8);
                      }
                    }
                    var45Lifetime3++;
                    param14++;
                    var50Lifetime3 = var50Lifetime3 + var22Lifetime1;
                    var51Lifetime3 = var51Lifetime3 + var23Lifetime1;
                    continue;
                  }
                  break;
                }
                param14 = param14 - var45Lifetime3;
                param14 = param14 + param9;
                param5 = param5 + var24Lifetime1;
                var46Lifetime3++;
                param6 = param6 - var21Lifetime1;
              }
              return;
            }
            if (var21Lifetime1 < 0 &&
              var23Lifetime1 < 0) {
              var46Lifetime1 = var36;
              while (0 != var46Lifetime1) {
                var51Lifetime1 = var44 + param5;
                var45Lifetime1 = var34;
                var50Lifetime1 = var43 + param6;
                var47Lifetime1 = var50Lifetime1 + 4096;
                if (var50Lifetime1 + 4096 < 0) {
                  var47Lifetime1 = (-var47Lifetime1 + (var22Lifetime1 - 1)) / var22Lifetime1;
                  var45Lifetime1 = var45Lifetime1 + var47Lifetime1;
                  var51Lifetime1 = var51Lifetime1 + var23Lifetime1 * var47Lifetime1;
                  param14 = param14 + var47Lifetime1;
                  var50Lifetime1 = var50Lifetime1 + var47Lifetime1 * var22Lifetime1;
                }
                var47Lifetime1Lifetime1 = -var49 + var51Lifetime1;
                if (-var49 + var51Lifetime1 >= 0) {
                  var47Lifetime1Lifetime1 = (var23Lifetime1 - var47Lifetime1Lifetime1) / var23Lifetime1;
                  var50Lifetime1 = var50Lifetime1 + var47Lifetime1Lifetime1 * var22Lifetime1;
                  var45Lifetime1 = var45Lifetime1 + var47Lifetime1Lifetime1;
                  param14 = param14 + var47Lifetime1Lifetime1;
                  var51Lifetime1 = var51Lifetime1 + var47Lifetime1Lifetime1 * var23Lifetime1;
                }
                while (var45Lifetime1 != 0) {
                  if (-4096 <= var51Lifetime1) {
                    param13 = var50Lifetime1 >> 12;
                    if (var50Lifetime1 >> 12 < var17_int) {
                      var52Lifetime1 = var50Lifetime1;
                      var53Lifetime1 = var51Lifetime1;
                      param7 = var51Lifetime1 >> 12;
                      var52Lifetime1 = var52Lifetime1 & 4095;
                      var53Lifetime1 = var53Lifetime1 & 4095;
                      var62Lifetime1 = param13 + param7 * var17_int;
                      if (param7 >= 0) {
                        if (param13 >= 0) {
                          var54Lifetime1 = param0[var62Lifetime1];
                          if (0 == (-16777216 & var54Lifetime1)) {
                            stackIn_67_0 = 0;
                          } else {
                            stackIn_67_0 = (-var52Lifetime1 + 4096) * (4096 - var53Lifetime1);
                          }
                          var58Lifetime1 = stackIn_67_0;
                        } else {
                          var54Lifetime1 = 0;
                          var58Lifetime1 = 0;
                        }
                        if (param13 < -1 + var17_int) {
                          var55Lifetime1 = param0[1 + var62Lifetime1];
                          if ((-16777216 & var55Lifetime1) == 0) {
                            stackIn_73_0 = 0;
                          } else {
                            stackIn_73_0 = var52Lifetime1 * (4096 - var53Lifetime1);
                          }
                          var59Lifetime1 = stackIn_73_0;
                        } else {
                          var59Lifetime1 = 0;
                          var55Lifetime1 = 0;
                        }
                      } else {
                        var54Lifetime1 = 0;
                        var55Lifetime1 = 0;
                        var59Lifetime1 = 0;
                        var58Lifetime1 = 0;
                      }
                      if (param7 >= -1 + var18) {
                        var60Lifetime1 = 0;
                        var56Lifetime1 = 0;
                        var57Lifetime1 = 0;
                        var61Lifetime1 = 0;
                      } else {
                        if (param13 < var17_int - 1) {
                          var57Lifetime1 = param0[1 + (var62Lifetime1 + var17_int)];
                          if ((-16777216 & var57Lifetime1) != 0) {
                            stackIn_80_0 = var53Lifetime1 * var52Lifetime1;
                          } else {
                            stackIn_80_0 = 0;
                          }
                          var61Lifetime1 = stackIn_80_0;
                        } else {
                          var61Lifetime1 = 0;
                          var57Lifetime1 = 0;
                        }
                        if (0 > param13) {
                          var56Lifetime1 = 0;
                          var60Lifetime1 = 0;
                        } else {
                          var56Lifetime1 = param0[var17_int + var62Lifetime1];
                          if ((var56Lifetime1 & -16777216) != 0) {
                            stackIn_85_0 = (4096 - var52Lifetime1) * var53Lifetime1;
                          } else {
                            stackIn_85_0 = 0;
                          }
                          var60Lifetime1 = stackIn_85_0;
                        }
                      }
                      var60Lifetime1 = var60Lifetime1 >> 16;
                      var58Lifetime1 = var58Lifetime1 >> 16;
                      var61Lifetime1 = var61Lifetime1 >> 16;
                      var59Lifetime1 = var59Lifetime1 >> 16;
                      if (var60Lifetime1 + var59Lifetime1 + (var58Lifetime1 + var61Lifetime1) >= 128) {
                        var63Lifetime1 = var58Lifetime1 * (var54Lifetime1 & 16711935) + (16711935 & var55Lifetime1) * var59Lifetime1;
                        var64Lifetime1 = var59Lifetime1 * ((var55Lifetime1 & -16711936) >>> 8) + var58Lifetime1 * (16711935 & var54Lifetime1 >>> 8);
                        var63Lifetime1 = var63Lifetime1 + ((16711935 & var56Lifetime1) * var60Lifetime1 + (var57Lifetime1 & 16711935) * var61Lifetime1);
                        var64Lifetime1 = var64Lifetime1 + (((var56Lifetime1 & -16711936) >>> 8) * var60Lifetime1 + var61Lifetime1 * ((-16711936 & var57Lifetime1) >>> 8));
                        var65Lifetime1 = var64Lifetime1 >>> 24;
                        var63Lifetime1 = 1694433535 & var63Lifetime1 >>> 8;
                        var64Lifetime1 = var64Lifetime1 & 65280;
                        if (var65Lifetime1 != 0) {
                          var67Lifetime1 = param8[param14];
                          var66Lifetime1 = -var65Lifetime1 + 256;
                          param8[param14] = mp.a(128 + (var65Lifetime1 >> 1) << 24, dda.a(dda.a(var67Lifetime1, 16711935) * var66Lifetime1 + var65Lifetime1 * var63Lifetime1, -16711936) + dda.a(var66Lifetime1 * dda.a(var67Lifetime1, 65280) + var64Lifetime1 * var65Lifetime1, 16711680) >>> 8);
                        }
                      }
                      var45Lifetime1++;
                      var50Lifetime1 = var50Lifetime1 + var22Lifetime1;
                      param14++;
                      var51Lifetime1 = var51Lifetime1 + var23Lifetime1;
                      continue;
                    }
                  }
                  break;
                }
                param14 = param14 - var45Lifetime1;
                param6 = param6 - var21Lifetime1;
                var46Lifetime1++;
                param5 = param5 + var24Lifetime1;
                param14 = param14 + param9;
              }
              return;
            }
            var46Lifetime2 = var36;
            while (var46Lifetime2 != 0) {
              var51Lifetime2 = var44 + param5;
              var50Lifetime2 = param6 + var43;
              var45Lifetime2 = var34;
              var47Lifetime2 = 4096 + var50Lifetime2;
              if (4096 + var50Lifetime2 < 0) {
                var47Lifetime2 = (-1 + (var22Lifetime1 - var47Lifetime2)) / var22Lifetime1;
                param14 = param14 + var47Lifetime2;
                var50Lifetime2 = var50Lifetime2 + var47Lifetime2 * var22Lifetime1;
                var45Lifetime2 = var45Lifetime2 + var47Lifetime2;
                var51Lifetime2 = var51Lifetime2 + var47Lifetime2 * var23Lifetime1;
              }
              boolean decompiledFrameRemainder0 = true;
              var47Lifetime2Lifetime1 = var51Lifetime2 + 4096;
              if (var51Lifetime2 + 4096 < 0) {
                if (0 == var23Lifetime1) {
                  param14 = param14 - var45Lifetime2;
                  decompiledFrameRemainder0 = false;
                }
                else {
                  var47Lifetime2Lifetime1 = (var23Lifetime1 - 1 - var47Lifetime2Lifetime1) / var23Lifetime1;
                  param14 = param14 + var47Lifetime2Lifetime1;
                  var50Lifetime2 = var50Lifetime2 + var22Lifetime1 * var47Lifetime2Lifetime1;
                  var51Lifetime2 = var51Lifetime2 + var23Lifetime1 * var47Lifetime2Lifetime1;
                  var45Lifetime2 = var45Lifetime2 + var47Lifetime2Lifetime1;
                }
              }
              if (decompiledFrameRemainder0) {
                while (var45Lifetime2 != 0) {
                  param13 = var50Lifetime2 >> 12;
                  if (var50Lifetime2 >> 12 < var17_int) {
                    param7 = var51Lifetime2 >> 12;
                    if (var51Lifetime2 >> 12 < var18) {
                      var62Lifetime2 = param13 + var17_int * param7;
                      var53Lifetime2 = var51Lifetime2;
                      var52Lifetime2 = var50Lifetime2;
                      var52Lifetime2 = var52Lifetime2 & 4095;
                      var53Lifetime2 = var53Lifetime2 & 4095;
                      if (param7 < -1 + var18) {
                        if (param13 >= 0) {
                          var56Lifetime2 = param0[var62Lifetime2 + var17_int];
                          if ((var56Lifetime2 & -16777216) != 0) {
                            stackIn_113_0 = (-var52Lifetime2 + 4096) * var53Lifetime2;
                          } else {
                            stackIn_113_0 = 0;
                          }
                          var60Lifetime2 = stackIn_113_0;
                        } else {
                          var60Lifetime2 = 0;
                          var56Lifetime2 = 0;
                        }
                        if (param13 >= var17_int - 1) {
                          var57Lifetime2 = 0;
                          var61Lifetime2 = 0;
                        } else {
                          var57Lifetime2 = param0[var17_int + (var62Lifetime2 + 1)];
                          if ((-16777216 & var57Lifetime2) == 0) {
                            stackIn_118_0 = 0;
                          } else {
                            stackIn_118_0 = var53Lifetime2 * var52Lifetime2;
                          }
                          var61Lifetime2 = stackIn_118_0;
                        }
                      } else {
                        var57Lifetime2 = 0;
                        var56Lifetime2 = 0;
                        var61Lifetime2 = 0;
                        var60Lifetime2 = 0;
                      }
                      if (param7 < 0) {
                        var55Lifetime2 = 0;
                        var54Lifetime2 = 0;
                        var59Lifetime2 = 0;
                        var58Lifetime2 = 0;
                      } else {
                        if (param13 >= 0) {
                          var54Lifetime2 = param0[var62Lifetime2];
                          if ((var54Lifetime2 & -16777216) != 0) {
                            stackIn_126_0 = (4096 - var53Lifetime2) * (-var52Lifetime2 + 4096);
                          } else {
                            stackIn_126_0 = 0;
                          }
                          var58Lifetime2 = stackIn_126_0;
                        } else {
                          var58Lifetime2 = 0;
                          var54Lifetime2 = 0;
                        }
                        if (param13 >= var17_int - 1) {
                          var59Lifetime2 = 0;
                          var55Lifetime2 = 0;
                        } else {
                          var55Lifetime2 = param0[1 + var62Lifetime2];
                          if (0 == (var55Lifetime2 & -16777216)) {
                            stackIn_131_0 = 0;
                          } else {
                            stackIn_131_0 = (-var53Lifetime2 + 4096) * var52Lifetime2;
                          }
                          var59Lifetime2 = stackIn_131_0;
                        }
                      }
                      var61Lifetime2 = var61Lifetime2 >> 16;
                      var60Lifetime2 = var60Lifetime2 >> 16;
                      var59Lifetime2 = var59Lifetime2 >> 16;
                      var58Lifetime2 = var58Lifetime2 >> 16;
                      if (var59Lifetime2 + var58Lifetime2 + var60Lifetime2 + var61Lifetime2 >= 128) {
                        var63Lifetime2 = var58Lifetime2 * (16711935 & var54Lifetime2) + var59Lifetime2 * (var55Lifetime2 & 16711935);
                        var64Lifetime2 = var58Lifetime2 * ((var54Lifetime2 & -16711936) >>> 8) + var59Lifetime2 * (16711935 & var55Lifetime2 >>> 8);
                        var63Lifetime2 = var63Lifetime2 + (var60Lifetime2 * (16711935 & var56Lifetime2) + var61Lifetime2 * (16711935 & var57Lifetime2));
                        var64Lifetime2 = var64Lifetime2 + (var60Lifetime2 * ((-16711936 & var56Lifetime2) >>> 8) + ((var57Lifetime2 & -16711936) >>> 8) * var61Lifetime2);
                        var65Lifetime2 = var64Lifetime2 >>> 24;
                        var63Lifetime2 = (-16711760 & var63Lifetime2) >>> 8;
                        var64Lifetime2 = -16711936 & var64Lifetime2;
                        if (0 != var65Lifetime2) {
                          var66Lifetime2 = -var65Lifetime2 + 256;
                          var67Lifetime2 = param8[param14];
                          param8[param14] = mp.a(dda.a(dda.a(var67Lifetime2, 65280) * var66Lifetime2 + var64Lifetime2 * var65Lifetime2, 16711680) + dda.a(var66Lifetime2 * dda.a(var67Lifetime2, 16711935) + var63Lifetime2 * var65Lifetime2, -16711936) >>> 8, (var65Lifetime2 >> 1) + 128 << 24);
                        }
                      }
                      var51Lifetime2 = var51Lifetime2 + var23Lifetime1;
                      param14++;
                      var45Lifetime2++;
                      var50Lifetime2 = var50Lifetime2 + var22Lifetime1;
                      continue;
                    }
                  }
                  break;
                }
                param14 = param14 - var45Lifetime2;
              }
              var46Lifetime2++;
              param6 = param6 - var21Lifetime1;
              param5 = param5 + var24Lifetime1;
              param14 = param14 + param9;
            }
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var17 = decompiledCaughtException;
          stackIn_235_0 = var17;
          stackIn_235_1 = new StringBuilder().append("qg.A(");
          if (param0 == null) {
            stackIn_236_2 = "null";
          } else {
            stackIn_236_2 = "{...}";
          }
          stackIn_238_1 = ((StringBuilder) (Object) stackIn_235_1).append(stackIn_236_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_239_2 = "null";
          } else {
            stackIn_239_2 = "{...}";
          }
          stackIn_241_1 = ((StringBuilder) (Object) stackIn_238_1).append(stackIn_239_2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',').append(param7).append(',');
          if (param8 == null) {
            stackIn_242_2 = "null";
          } else {
            stackIn_242_2 = "{...}";
          }
          throw pe.a((Throwable) ((Object) stackIn_235_0), ((StringBuilder) (Object) stackIn_241_1).append(stackIn_242_2).append(',').append(param9).append(',').append(param10).append(',').append(param11).append(',').append(param12).append(',').append(param13).append(',').append(param14).append(',').append(param15).append(',').append(param16).append(')').toString());
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
        field_c = "You are on <%0>";
        field_a = "Press TAB to chat or F10 to open Quick Chat.";
    }
}
