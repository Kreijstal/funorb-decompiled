/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class dc extends jl {
    double field_y;
    private int field_db;
    private int field_E;
    double field_x;
    int field_G;
    int field_w;
    double field_K;
    private int field_v;
    double field_X;
    double field_cb;
    static String field_M;
    double field_ab;
    private int field_U;
    double field_L;
    pm field_T;
    double field_s;
    int field_N;
    private int field_Z;
    double field_P;
    double field_eb;
    double field_D;
    nm field_Q;
    double field_A;
    double field_B;
    double field_bb;
    static String field_J;
    double field_F;
    private int field_O;
    double field_R;
    double field_C;
    pm field_S;
    boolean field_V;
    int field_H;
    int field_t;
    double field_I;
    double field_u;
    int field_z;
    double field_Y;

    double a(double param0, byte param1) {
        if (param1 >= -2) {
            dc.d(-51);
        }
        return 0.0;
    }

    final void a(int param0, int param1) {
        if (param1 > -39) {
            ((dc) this).field_S = null;
        }
        ((dc) this).a(true, 0, param0);
    }

    void a(int param0, int param1, int param2, int param3) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
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
        var31 = Confined.field_J ? 1 : 0;
        if (!((dc) this).field_V) {
          return;
        } else {
          L0: {
            var5 = 6016;
            var6 = 0;
            var7 = 10240;
            var8 = 0;
            var9 = ((-((dc) this).field_G + ((dc) this).field_t) * param1 >> 16) + ((dc) this).field_G;
            var10 = (param1 * (((dc) this).field_w + -((dc) this).field_z) >> 16) + ((dc) this).field_z;
            var11 = ((dc) this).field_v - -((-((dc) this).field_v + ((dc) this).field_E) * param1 >> 16);
            var12 = (param3 * (-((dc) this).field_G + ((dc) this).field_t) >> 16) + ((dc) this).field_G;
            var13 = ((-((dc) this).field_z + ((dc) this).field_w) * param3 >> 16) + ((dc) this).field_z;
            var14 = ((-((dc) this).field_v + ((dc) this).field_E) * param3 >> 16) + ((dc) this).field_v;
            var15 = var9 - (((dc) this).field_Z * var11 >> 16);
            var16 = -(((dc) this).field_db * var11 >> 16) + var10;
            var17 = var9 + (var11 * ((dc) this).field_Z >> 16);
            var18 = (var11 * ((dc) this).field_db >> 16) + var10;
            var19 = -(var14 * ((dc) this).field_Z >> 16) + var12;
            var20 = -(var14 * ((dc) this).field_db >> 16) + var13;
            if (param2 == -14936) {
              break L0;
            } else {
              ((dc) this).field_V = false;
              break L0;
            }
          }
          L1: {
            var21 = var12 - -(((dc) this).field_Z * var14 >> 16);
            if (~var7 < ~var15) {
              var7 = var15;
              break L1;
            } else {
              break L1;
            }
          }
          L2: {
            if (var8 <= var15) {
              var8 = var15 - -1;
              break L2;
            } else {
              break L2;
            }
          }
          L3: {
            var22 = var13 + (((dc) this).field_db * var14 >> 16);
            if (~var7 < ~var17) {
              var7 = var17;
              break L3;
            } else {
              break L3;
            }
          }
          L4: {
            if (~var17 > ~var8) {
              break L4;
            } else {
              var8 = 1 + var17;
              break L4;
            }
          }
          L5: {
            if (var19 < var8) {
              break L5;
            } else {
              var8 = var19 - -1;
              break L5;
            }
          }
          L6: {
            if (~var19 > ~var7) {
              var7 = var19;
              break L6;
            } else {
              break L6;
            }
          }
          L7: {
            if (var16 < var5) {
              var5 = var16;
              break L7;
            } else {
              break L7;
            }
          }
          L8: {
            if (~var7 < ~var21) {
              var7 = var21;
              break L8;
            } else {
              break L8;
            }
          }
          L9: {
            if (~var16 > ~var6) {
              break L9;
            } else {
              var6 = var16 - -1;
              break L9;
            }
          }
          L10: {
            if (~var8 >= ~var21) {
              var8 = var21 - -1;
              break L10;
            } else {
              break L10;
            }
          }
          L11: {
            if (var18 < var5) {
              var5 = var18;
              break L11;
            } else {
              break L11;
            }
          }
          L12: {
            if (~var18 > ~var6) {
              break L12;
            } else {
              var6 = 1 + var18;
              break L12;
            }
          }
          L13: {
            if (~var20 <= ~var5) {
              break L13;
            } else {
              var5 = var20;
              break L13;
            }
          }
          L14: {
            if (var6 > var20) {
              break L14;
            } else {
              var6 = var20 - -1;
              break L14;
            }
          }
          L15: {
            if (~var22 > ~var5) {
              var5 = var22;
              break L15;
            } else {
              break L15;
            }
          }
          L16: {
            if (var22 < var6) {
              break L16;
            } else {
              var6 = var22 + 1;
              break L16;
            }
          }
          L17: {
            var7 = var7 >> 4;
            var6 = var6 + 15 >> 4;
            var5 = var5 >> 4;
            var8 = 15 + var8 >> 4;
            if (var7 >= 0) {
              break L17;
            } else {
              var7 = 0;
              break L17;
            }
          }
          L18: {
            if (var5 < 0) {
              var5 = 0;
              break L18;
            } else {
              break L18;
            }
          }
          L19: {
            if (var6 > 376) {
              var6 = 376;
              break L19;
            } else {
              break L19;
            }
          }
          L20: {
            if (var8 <= 640) {
              break L20;
            } else {
              var8 = 640;
              break L20;
            }
          }
          var7 = var7 << 4;
          var9 = 640 * var5;
          var5 = var5 << 4;
          param3 = param3 << 12;
          var8 = var8 << 4;
          var6 = var6 << 4;
          param1 = param1 << 12;
          var10 = (param0 * (65280 & ((dc) this).field_H) & 16711680) + ((16711935 & ((dc) this).field_H) * param0 & -16711936) >> 8;
          var11 = var5;
          L21: while (true) {
            if (~var6 >= ~var11) {
              return;
            } else {
              L22: {
                var12 = var7;
                var13 = var8;
                var14 = (-((dc) this).field_z + var11) * ((dc) this).field_O + ((dc) this).field_U * (var7 + -((dc) this).field_G) >> 12;
                var15 = ((((dc) this).field_E + -((dc) this).field_v) * var14 >> 8) + (((dc) this).field_v << 8);
                var16 = (var11 - ((dc) this).field_z) * ((dc) this).field_db + ((dc) this).field_Z * (var7 - ((dc) this).field_G);
                if (var15 < 1) {
                  break L22;
                } else {
                  var16 = var16 / var15;
                  break L22;
                }
              }
              L23: {
                var17 = (var11 - ((dc) this).field_z) * ((dc) this).field_O + (var8 + -((dc) this).field_G) * ((dc) this).field_U >> 12;
                var18 = (((dc) this).field_v << 8) - -(var17 * (-((dc) this).field_v + ((dc) this).field_E) >> 8);
                var19 = ((dc) this).field_Z * (var8 + -((dc) this).field_G) - -(((dc) this).field_db * (-((dc) this).field_z + var11));
                if (var18 >= 1) {
                  var19 = var19 / var18;
                  break L23;
                } else {
                  break L23;
                }
              }
              L24: {
                L25: {
                  if (var16 >= 0) {
                    break L25;
                  } else {
                    if (var19 <= 0) {
                      break L25;
                    } else {
                      L26: while (true) {
                        if (~var13 >= ~(var12 - -64)) {
                          break L24;
                        } else {
                          L27: {
                            var20 = (-31 & var13 + var12) >> 1;
                            var21 = (-((dc) this).field_z + var11) * ((dc) this).field_O + ((dc) this).field_U * (var20 + -((dc) this).field_G) >> 12;
                            var22 = (var21 * (-((dc) this).field_v + ((dc) this).field_E) >> 8) + (((dc) this).field_v << 8);
                            var23 = ((dc) this).field_Z * (var20 - ((dc) this).field_G) + ((dc) this).field_db * (-((dc) this).field_z + var11);
                            if (var22 >= 1) {
                              var23 = var23 / var22;
                              break L27;
                            } else {
                              break L27;
                            }
                          }
                          if (var23 > 0) {
                            var13 = var20;
                            continue L26;
                          } else {
                            var12 = var20;
                            continue L26;
                          }
                        }
                      }
                    }
                  }
                }
                L28: {
                  if (var16 <= 0) {
                    break L28;
                  } else {
                    if (var19 >= 0) {
                      break L28;
                    } else {
                      L29: while (true) {
                        if (var13 <= 64 + var12) {
                          break L24;
                        } else {
                          L30: {
                            var20 = (-31 & var12 - -var13) >> 1;
                            var21 = (-((dc) this).field_z + var11) * ((dc) this).field_O + (var20 - ((dc) this).field_G) * ((dc) this).field_U >> 12;
                            var22 = ((-((dc) this).field_v + ((dc) this).field_E) * var21 >> 8) + (((dc) this).field_v << 8);
                            var23 = ((dc) this).field_db * (-((dc) this).field_z + var11) + (-((dc) this).field_G + var20) * ((dc) this).field_Z;
                            if (1 > var22) {
                              break L30;
                            } else {
                              var23 = var23 / var22;
                              break L30;
                            }
                          }
                          if (0 <= var23) {
                            var12 = var20;
                            continue L29;
                          } else {
                            var13 = var20;
                            continue L29;
                          }
                        }
                      }
                    }
                  }
                }
                L31: {
                  if (var16 < 0) {
                    break L31;
                  } else {
                    if (0 <= var19) {
                      if (~var19 <= ~var16) {
                        var13 = var7;
                        break L24;
                      } else {
                        var12 = var8;
                        break L24;
                      }
                    } else {
                      break L31;
                    }
                  }
                }
                if (var16 < var19) {
                  var12 = var8;
                  break L24;
                } else {
                  var13 = var7;
                  break L24;
                }
              }
              var20 = var9 + (var12 >> 4);
              var21 = var12;
              L32: while (true) {
                if (~var13 >= ~var21) {
                  var21 = var13;
                  L33: while (true) {
                    L34: {
                      if (var21 >= var8) {
                        break L34;
                      } else {
                        L35: {
                          var22 = ((dc) this).field_U * (-((dc) this).field_G + var21) + ((dc) this).field_O * (-((dc) this).field_z + var11);
                          if (var22 < param1) {
                            break L35;
                          } else {
                            if (param3 > var22) {
                              var22 = var22 >> 12;
                              var23 = (((dc) this).field_v << 8) + (var22 * (((dc) this).field_E + -((dc) this).field_v) >> 8);
                              if (var23 > 0) {
                                var24 = (((dc) this).field_Z * (var21 + -((dc) this).field_G) - -(((dc) this).field_db * (var11 - ((dc) this).field_z))) / var23;
                                if (256 > var24) {
                                  L36: {
                                    if (0 <= var24) {
                                      break L36;
                                    } else {
                                      var24 = -var24;
                                      if (-var24 >= 256) {
                                        break L34;
                                      } else {
                                        break L36;
                                      }
                                    }
                                  }
                                  var25 = -var24 + 256;
                                  var26 = fn.field_h[var20];
                                  var27 = ((var10 & 16711935) * var25 >>> 8 & -1593900801) - -(var26 & 16711935);
                                  var28 = (16711935 & var27 >>> 8) * 255;
                                  var27 = 16711935 & (var27 | var28);
                                  var29 = ((var10 & 65280) * var25 >>> 8 & -1392443648) - -(65280 & var26);
                                  var30 = 255 * ((var29 & 16711680) >>> 8);
                                  var29 = 65280 & (var29 | var30);
                                  fn.field_h[var20] = nl.a(var27, var29);
                                  break L35;
                                } else {
                                  break L34;
                                }
                              } else {
                                break L34;
                              }
                            } else {
                              break L35;
                            }
                          }
                        }
                        var20++;
                        var21 += 16;
                        continue L33;
                      }
                    }
                    var20 = var9 - -(var12 >> 4);
                    var9 += 640;
                    var21 = -16 + var12;
                    L37: while (true) {
                      L38: {
                        if (~var21 > ~var7) {
                          break L38;
                        } else {
                          L39: {
                            var20--;
                            var22 = ((dc) this).field_O * (-((dc) this).field_z + var11) + (-((dc) this).field_G + var21) * ((dc) this).field_U;
                            if (var22 < param1) {
                              break L39;
                            } else {
                              if (~var22 <= ~param3) {
                                break L39;
                              } else {
                                var22 = var22 >> 12;
                                var23 = ((((dc) this).field_E + -((dc) this).field_v) * var22 >> 8) + (((dc) this).field_v << 8);
                                if (var23 > 0) {
                                  var24 = (((dc) this).field_Z * (-((dc) this).field_G + var21) - -((var11 + -((dc) this).field_z) * ((dc) this).field_db)) / var23;
                                  if (256 <= var24) {
                                    break L38;
                                  } else {
                                    L40: {
                                      if (var24 >= 0) {
                                        break L40;
                                      } else {
                                        var24 = -var24;
                                        if (-var24 < 256) {
                                          break L40;
                                        } else {
                                          break L38;
                                        }
                                      }
                                    }
                                    var25 = 256 + -var24;
                                    var26 = fn.field_h[var20];
                                    var27 = ((-16711840 & (16711935 & var10) * var25) >>> 8) - -(var26 & 16711935);
                                    var28 = 255 * (var27 >>> 8 & 16711935);
                                    var27 = 16711935 & (var27 | var28);
                                    var29 = (65280 & var26) + ((65280 & var10) * var25 >>> 8 & -687800576);
                                    var30 = 255 * (65280 & var29 >>> 8);
                                    var29 = (var30 | var29) & 65280;
                                    fn.field_h[var20] = nl.a(var27, var29);
                                    break L39;
                                  }
                                } else {
                                  break L38;
                                }
                              }
                            }
                          }
                          var21 -= 16;
                          continue L37;
                        }
                      }
                      var11 += 16;
                      continue L21;
                    }
                  }
                } else {
                  L41: {
                    var22 = ((dc) this).field_U * (-((dc) this).field_G + var21) - -((var11 + -((dc) this).field_z) * ((dc) this).field_O);
                    if (~var22 > ~param1) {
                      break L41;
                    } else {
                      if (~param3 >= ~var22) {
                        break L41;
                      } else {
                        var22 = var22 >> 12;
                        var23 = (((dc) this).field_v << 8) - -((-((dc) this).field_v + ((dc) this).field_E) * var22 >> 8);
                        if (var23 > 0) {
                          var24 = ((-((dc) this).field_z + var11) * ((dc) this).field_db + ((dc) this).field_Z * (var21 - ((dc) this).field_G)) / var23;
                          if (var24 < 256) {
                            L42: {
                              if (0 <= var24) {
                                break L42;
                              } else {
                                var24 = -var24;
                                if (256 > -var24) {
                                  break L42;
                                } else {
                                  break L41;
                                }
                              }
                            }
                            var25 = -var24 + 256;
                            var26 = fn.field_h[var20];
                            var27 = (16711935 & var26) + (var25 * (var10 & 16711935) >>> 8 & -1895890689);
                            var28 = (16711935 & var27 >>> 8) * 255;
                            var27 = 16711935 & (var28 | var27);
                            var29 = (var26 & 65280) + (2063662848 & var25 * (65280 & var10) >>> 8);
                            var30 = 255 * (var29 >>> 8 & 65280);
                            var29 = (var30 | var29) & 65280;
                            fn.field_h[var20] = nl.a(var29, var27);
                            break L41;
                          } else {
                            break L41;
                          }
                        } else {
                          break L41;
                        }
                      }
                    }
                  }
                  var20++;
                  var21 += 16;
                  continue L32;
                }
              }
            }
          }
        }
    }

    final boolean a(vg param0, int param1) {
        RuntimeException var3 = null;
        double var3_double = 0.0;
        double var5 = 0.0;
        double var7 = 0.0;
        double var9 = 0.0;
        double var11 = 0.0;
        double var13 = 0.0;
        double var15 = 0.0;
        double var17 = 0.0;
        double var19 = 0.0;
        double var21 = 0.0;
        double var23 = 0.0;
        double var25 = 0.0;
        double var27 = 0.0;
        double var29 = 0.0;
        int stackIn_9_0 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_7_0 = 0;
        int stackOut_8_0 = 0;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        try {
          L0: {
            L1: {
              if (param1 == -1073453180) {
                break L1;
              } else {
                ((dc) this).field_R = -0.7434725409770379;
                break L1;
              }
            }
            L2: {
              if (((dc) this).field_eb >= ((dc) this).field_X) {
                var3_double = ((dc) this).field_cb;
                var9 = ((dc) this).field_R;
                var11 = ((dc) this).field_s;
                var13 = ((dc) this).field_eb;
                var5 = ((dc) this).field_L;
                var7 = ((dc) this).field_X;
                break L2;
              } else {
                var9 = ((dc) this).field_cb;
                var3_double = ((dc) this).field_R;
                var7 = ((dc) this).field_eb;
                var5 = ((dc) this).field_s;
                var13 = ((dc) this).field_X;
                var11 = ((dc) this).field_L;
                break L2;
              }
            }
            L3: {
              L4: {
                var15 = var7;
                var9 = var9 - param0.field_T;
                var3_double = var3_double - param0.field_T;
                var11 = var11 - param0.field_L;
                var7 = var7 - param0.field_O;
                var17 = var13;
                var5 = var5 - param0.field_L;
                var13 = var13 - param0.field_O;
                var19 = var7 * param0.field_M + (param0.field_R * var3_double + var5 * param0.field_ab);
                var21 = var7 * param0.field_F + (param0.field_V * var3_double + var5 * param0.field_U);
                var23 = var7 * param0.field_N + (var5 * param0.field_H + param0.field_P * var3_double);
                var25 = param0.field_R * var9 + param0.field_ab * var11 + param0.field_M * var13;
                var27 = var9 * param0.field_V + var11 * param0.field_U + var13 * param0.field_F;
                ((dc) this).field_ab = var21;
                ((dc) this).field_C = var23;
                ((dc) this).field_bb = var19;
                var29 = var13 * param0.field_N + (param0.field_H * var11 + param0.field_P * var9);
                ((dc) this).field_D = var27;
                ((dc) this).field_Y = var25;
                ((dc) this).field_I = var17;
                ((dc) this).field_F = var15;
                ((dc) this).field_A = var29;
                if (!this.c(false)) {
                  break L4;
                } else {
                  if (!((dc) this).g(-10603)) {
                    break L4;
                  } else {
                    stackOut_7_0 = 1;
                    stackIn_9_0 = stackOut_7_0;
                    break L3;
                  }
                }
              }
              stackOut_8_0 = 0;
              stackIn_9_0 = stackOut_8_0;
              break L3;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var3 = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) var3;
            stackOut_10_1 = new StringBuilder().append("dc.LA(");
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param0 == null) {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L5;
            } else {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L5;
            }
          }
          throw sd.a((Throwable) (Object) stackIn_13_0, stackIn_13_2 + ',' + param1 + ')');
        }
        return stackIn_9_0 != 0;
    }

    final static boolean f(int param0) {
        int stackIn_6_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_5_0 = 0;
        L0: {
          if (param0 == -14) {
            break L0;
          } else {
            field_M = null;
            break L0;
          }
        }
        L1: {
          L2: {
            if (10 > rk.field_e) {
              break L2;
            } else {
              if (we.field_c < 13) {
                break L2;
              } else {
                stackOut_4_0 = 1;
                stackIn_6_0 = stackOut_4_0;
                break L1;
              }
            }
          }
          stackOut_5_0 = 0;
          stackIn_6_0 = stackOut_5_0;
          break L1;
        }
        return stackIn_6_0 != 0;
    }

    void c(int param0) {
        double var2 = 0.0;
        double var4 = 0.0;
        double var6 = 0.0;
        double var8 = 0.0;
        double var10 = 0.0;
        double var12 = 0.0;
        double var14 = 0.0;
        double var16 = 0.0;
        double var18 = 0.0;
        double var20 = 0.0;
        double var22 = 0.0;
        var2 = 320.0 + ((dc) this).field_Y / ((dc) this).field_A * 640.0;
        var4 = 640.0 * (((dc) this).field_D / ((dc) this).field_A) + 188.0;
        var6 = 12.8 / ((dc) this).field_A;
        var8 = 640.0 * (((dc) this).field_bb / ((dc) this).field_C) + 320.0;
        var10 = ((dc) this).field_ab / ((dc) this).field_C * 640.0 + 188.0;
        var12 = 12.8 / ((dc) this).field_C;
        ((dc) this).field_z = (int)(var4 * 16.0);
        ((dc) this).field_G = (int)(16.0 * var2);
        ((dc) this).field_w = (int)(16.0 * var10);
        ((dc) this).field_t = (int)(var8 * 16.0);
        ((dc) this).field_v = (int)(var6 * 16.0);
        ((dc) this).field_E = (int)(var12 * 16.0);
        var14 = -var2 + var8;
        var16 = var10 - var4;
        var18 = var16;
        var20 = -var14;
        var22 = var16 * var16 + var14 * var14;
        if (var22 >= var6 * var6) {
          if (var22 < var12 * var12) {
            ((dc) this).field_V = false;
            return;
          } else {
            L0: {
              ((dc) this).field_V = true;
              var22 = 1.0 / var22;
              var16 = var16 * var22;
              if (param0 == -1704) {
                break L0;
              } else {
                ((dc) this).field_A = -0.048228806224869226;
                break L0;
              }
            }
            var14 = var14 * var22;
            var22 = Math.sqrt(var22);
            ((dc) this).field_U = (int)(16777216.0 * var14);
            ((dc) this).field_O = (int)(16777216.0 * var16);
            var18 = var18 * var22;
            var20 = var20 * var22;
            ((dc) this).field_Z = (int)(65536.0 * var18);
            ((dc) this).field_db = (int)(65536.0 * var20);
            return;
          }
        } else {
          ((dc) this).field_V = false;
          return;
        }
    }

    public static void e(int param0) {
        field_M = null;
        if (param0 != 12259) {
            return;
        }
        field_J = null;
    }

    final void a(boolean param0, int param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
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
        int var21 = 0;
        int var22 = 0;
        int var23 = 0;
        var23 = Confined.field_J ? 1 : 0;
        if (!((dc) this).field_V) {
          return;
        } else {
          L0: {
            var4 = ((dc) this).field_G + ((((dc) this).field_t + -((dc) this).field_G) * param1 >> 16);
            var5 = ((((dc) this).field_w + -((dc) this).field_z) * param1 >> 16) + ((dc) this).field_z;
            var6 = ((dc) this).field_v - -(param1 * (-((dc) this).field_v + ((dc) this).field_E) >> 16);
            var7 = -var6 + var4 >> 4;
            var8 = var6 + (var4 - -15) >> 4;
            var9 = -var6 + var5 >> 4;
            if (0 <= var7) {
              break L0;
            } else {
              var7 = 0;
              break L0;
            }
          }
          L1: {
            if (var9 >= 0) {
              break L1;
            } else {
              var9 = 0;
              break L1;
            }
          }
          L2: {
            if (var8 <= 640) {
              break L2;
            } else {
              var8 = 640;
              break L2;
            }
          }
          L3: {
            var10 = var6 + (var5 - -15) >> 4;
            if (param0) {
              break L3;
            } else {
              ((dc) this).field_H = 58;
              break L3;
            }
          }
          L4: {
            if (var10 > 376) {
              var10 = 376;
              break L4;
            } else {
              break L4;
            }
          }
          var11 = var7 + 640 * var9;
          var12 = 640 + var7 + -var8;
          var8 = var8 << 4;
          var10 = var10 << 4;
          var9 = var9 << 4;
          var7 = var7 << 4;
          param1 = param1 << 12;
          var13 = ((((dc) this).field_H & 16711935) * param2 & -16711936) + ((((dc) this).field_H & 65280) * param2 & 16711680) >> 8;
          var14 = var9;
          L5: while (true) {
            if (var10 <= var14) {
              return;
            } else {
              var15 = var7;
              L6: while (true) {
                if (var15 >= var8) {
                  var11 = var11 + var12;
                  var14 += 16;
                  continue L5;
                } else {
                  if (param1 > (var15 - ((dc) this).field_G) * ((dc) this).field_U - -((var14 + -((dc) this).field_z) * ((dc) this).field_O)) {
                    var16 = (int)(Math.sqrt((double)((var15 + -var4) * (var15 - var4) + (var14 - var5) * (var14 + -var5))) * 256.0) / var6;
                    if (256 > var16) {
                      var17 = -var16 + 256;
                      var18 = fn.field_h[var11];
                      var19 = ((-16711907 & var17 * (16711935 & var13)) >>> 8) - -(var18 & 16711935);
                      var20 = (16711935 & var19 >>> 8) * 255;
                      var19 = 16711935 & (var19 | var20);
                      var21 = (738262784 & (var13 & 65280) * var17 >>> 8) + (65280 & var18);
                      var22 = 255 * (var21 >>> 8 & 65280);
                      var21 = (var21 | var22) & 65280;
                      fn.field_h[var11] = nl.a(var21, var19);
                      var11++;
                      var15 += 16;
                      continue L6;
                    } else {
                      var11++;
                      var15 += 16;
                      continue L6;
                    }
                  } else {
                    var11++;
                    var15 += 16;
                    continue L6;
                  }
                }
              }
            }
          }
        }
    }

    final void b(int param0, byte param1) {
        this.a(-9867, param0, 65536);
        if (param1 != 27) {
            dc.e(-108);
        }
    }

    final void a(mn param0, int param1) {
        RuntimeException var3 = null;
        int var3_int = 0;
        int var4 = 0;
        int var5 = 0;
        oi var6 = null;
        Object var7 = null;
        double var8 = 0.0;
        double var10 = 0.0;
        double var12 = 0.0;
        double var14 = 0.0;
        double var16 = 0.0;
        double var18 = 0.0;
        double var20 = 0.0;
        int var22_int = 0;
        double var22 = 0.0;
        Object var23 = null;
        oi var23_ref = null;
        Object var24 = null;
        oi var24_ref = null;
        int var25 = 0;
        int stackIn_9_0 = 0;
        rk stackIn_12_0 = null;
        Object stackIn_23_0 = null;
        Object stackIn_40_0 = null;
        RuntimeException stackIn_43_0 = null;
        StringBuilder stackIn_43_1 = null;
        RuntimeException stackIn_44_0 = null;
        StringBuilder stackIn_44_1 = null;
        RuntimeException stackIn_45_0 = null;
        StringBuilder stackIn_45_1 = null;
        String stackIn_45_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_8_0 = 0;
        int stackOut_7_0 = 0;
        rk stackOut_11_0 = null;
        rk stackOut_10_0 = null;
        oi stackOut_39_0 = null;
        rk stackOut_38_0 = null;
        oi stackOut_22_0 = null;
        rk stackOut_21_0 = null;
        RuntimeException stackOut_42_0 = null;
        StringBuilder stackOut_42_1 = null;
        RuntimeException stackOut_44_0 = null;
        StringBuilder stackOut_44_1 = null;
        String stackOut_44_2 = null;
        RuntimeException stackOut_43_0 = null;
        StringBuilder stackOut_43_1 = null;
        String stackOut_43_2 = null;
        var23 = null;
        var24 = null;
        var25 = Confined.field_J ? 1 : 0;
        try {
          L0: {
            L1: {
              var3_int = (int)((dc) this).field_y;
              var4 = var3_int + ah.field_U - -1;
              if (ln.field_d.size() < var4) {
                ln.field_d.setSize(var4);
                var5 = ah.field_U;
                L2: while (true) {
                  if (var4 <= var5) {
                    break L1;
                  } else {
                    ln.field_d.setElementAt((Object) (Object) new oi((pm) null), var5);
                    var5++;
                    continue L2;
                  }
                }
              } else {
                break L1;
              }
            }
            L3: {
              if (((dc) this).field_X <= ((dc) this).field_eb) {
                stackOut_8_0 = 0;
                stackIn_9_0 = stackOut_8_0;
                break L3;
              } else {
                stackOut_7_0 = 1;
                stackIn_9_0 = stackOut_7_0;
                break L3;
              }
            }
            L4: {
              var5 = stackIn_9_0;
              if (var5 != 0) {
                stackOut_11_0 = param0.a(-116);
                stackIn_12_0 = stackOut_11_0;
                break L4;
              } else {
                stackOut_10_0 = param0.a(false);
                stackIn_12_0 = stackOut_10_0;
                break L4;
              }
            }
            L5: {
              var6 = (oi) (Object) stackIn_12_0;
              var7 = (Object) (Object) param0.field_a;
              var8 = ((dc) this).field_cb;
              var10 = ((dc) this).field_L;
              var12 = ((dc) this).field_X;
              var14 = ((dc) this).field_y / (double)var3_int;
              if (param1 == 4) {
                break L5;
              } else {
                ((dc) this).field_v = 87;
                break L5;
              }
            }
            var16 = ((dc) this).field_x * var14;
            var18 = var14 * ((dc) this).field_P;
            var20 = var14 * ((dc) this).field_K;
            var8 = var8 + 0.5 * var16;
            var10 = var10 + 0.5 * var18;
            var12 = var12 + 0.5 * var20;
            var22_int = 0;
            L6: while (true) {
              if (var3_int <= var22_int) {
                L7: {
                  var22 = ((dc) this).field_y - (double)var3_int;
                  var8 = var8 + 0.5 * (var22 - 1.0) * var16;
                  var10 = var10 - 0.5 * (-1.0 + var22) * var18;
                  var12 = var12 - var20 * ((-1.0 + var22) * 0.5);
                  int fieldTemp$2 = ah.field_U;
                  ah.field_U = ah.field_U + 1;
                  var24_ref = (oi) ln.field_d.elementAt(fieldTemp$2);
                  var24_ref.field_t = var8;
                  var24_ref.field_u = var22 * ((dc) this).field_B;
                  var24_ref.field_p = var12;
                  var24_ref.field_o = var10;
                  if (var5 != 0) {
                    L8: while (true) {
                      L9: {
                        if (var6 == null) {
                          break L9;
                        } else {
                          if (var12 >= var6.field_p) {
                            break L9;
                          } else {
                            var6 = (oi) (Object) param0.d(param1 ^ 2127);
                            continue L8;
                          }
                        }
                      }
                      L10: {
                        if (var6 != null) {
                          stackOut_39_0 = (oi) var6;
                          stackIn_40_0 = (Object) (Object) stackOut_39_0;
                          break L10;
                        } else {
                          stackOut_38_0 = param0.field_a;
                          stackIn_40_0 = (Object) (Object) stackOut_38_0;
                          break L10;
                        }
                      }
                      ri.a((rk) (Object) stackIn_40_0, 0, (rk) (Object) var24_ref);
                      break L7;
                    }
                  } else {
                    L11: while (true) {
                      L12: {
                        if (var6 == null) {
                          break L12;
                        } else {
                          if (var12 <= var6.field_p) {
                            break L12;
                          } else {
                            var7 = (Object) (Object) var6;
                            var6 = (oi) (Object) param0.a((byte) 125);
                            continue L11;
                          }
                        }
                      }
                      ri.a((rk) var7, 0, (rk) (Object) var24_ref);
                      var7 = (Object) (Object) var24_ref;
                      break L7;
                    }
                  }
                }
                break L0;
              } else {
                L13: {
                  int fieldTemp$3 = ah.field_U;
                  ah.field_U = ah.field_U + 1;
                  var23_ref = (oi) ln.field_d.elementAt(fieldTemp$3);
                  var23_ref.field_p = var12;
                  var23_ref.field_o = var10;
                  var23_ref.field_t = var8;
                  var23_ref.field_u = ((dc) this).field_B;
                  var8 = var8 + var16;
                  var10 = var10 + var18;
                  if (var5 == 0) {
                    L14: while (true) {
                      L15: {
                        if (var6 == null) {
                          break L15;
                        } else {
                          if (var12 <= var6.field_p) {
                            break L15;
                          } else {
                            var7 = (Object) (Object) var6;
                            var6 = (oi) (Object) param0.a((byte) -90);
                            continue L14;
                          }
                        }
                      }
                      ri.a((rk) var7, 0, (rk) (Object) var23_ref);
                      var7 = (Object) (Object) var23_ref;
                      break L13;
                    }
                  } else {
                    L16: while (true) {
                      L17: {
                        if (var6 == null) {
                          break L17;
                        } else {
                          if (var6.field_p <= var12) {
                            break L17;
                          } else {
                            var6 = (oi) (Object) param0.d(2123);
                            continue L16;
                          }
                        }
                      }
                      L18: {
                        if (var6 != null) {
                          stackOut_22_0 = (oi) var6;
                          stackIn_23_0 = (Object) (Object) stackOut_22_0;
                          break L18;
                        } else {
                          stackOut_21_0 = param0.field_a;
                          stackIn_23_0 = (Object) (Object) stackOut_21_0;
                          break L18;
                        }
                      }
                      ri.a((rk) (Object) stackIn_23_0, 0, (rk) (Object) var23_ref);
                      break L13;
                    }
                  }
                }
                var12 = var12 + var20;
                var22_int++;
                continue L6;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L19: {
            var3 = decompiledCaughtException;
            stackOut_42_0 = (RuntimeException) var3;
            stackOut_42_1 = new StringBuilder().append("dc.DA(");
            stackIn_44_0 = stackOut_42_0;
            stackIn_44_1 = stackOut_42_1;
            stackIn_43_0 = stackOut_42_0;
            stackIn_43_1 = stackOut_42_1;
            if (param0 == null) {
              stackOut_44_0 = (RuntimeException) (Object) stackIn_44_0;
              stackOut_44_1 = (StringBuilder) (Object) stackIn_44_1;
              stackOut_44_2 = "null";
              stackIn_45_0 = stackOut_44_0;
              stackIn_45_1 = stackOut_44_1;
              stackIn_45_2 = stackOut_44_2;
              break L19;
            } else {
              stackOut_43_0 = (RuntimeException) (Object) stackIn_43_0;
              stackOut_43_1 = (StringBuilder) (Object) stackIn_43_1;
              stackOut_43_2 = "{...}";
              stackIn_45_0 = stackOut_43_0;
              stackIn_45_1 = stackOut_43_1;
              stackIn_45_2 = stackOut_43_2;
              break L19;
            }
          }
          throw sd.a((Throwable) (Object) stackIn_45_0, stackIn_45_2 + ',' + param1 + ')');
        }
    }

    private final boolean c(boolean param0) {
        double var2 = 0.0;
        double var4 = 0.0;
        double var6 = 0.0;
        double var8 = 0.0;
        double var10 = 0.0;
        double var12 = 0.0;
        double var14 = 0.0;
        double var16 = 0.0;
        double var18 = 0.0;
        L0: {
          var2 = ((dc) this).field_bb;
          var4 = ((dc) this).field_ab;
          var6 = ((dc) this).field_C;
          var8 = ((dc) this).field_Y;
          var10 = ((dc) this).field_D;
          var12 = ((dc) this).field_A;
          var14 = ((dc) this).field_F;
          var16 = ((dc) this).field_I;
          if (0.01 > var6) {
            if (0.02 > var12) {
              return false;
            } else {
              var18 = (-var6 + 0.01) / (-var6 + var12);
              var2 = var2 + (((dc) this).a(var18, (byte) -114) + (var8 - var2) * var18);
              var14 = var14 + (var16 - var14) * var18;
              var6 = 0.01;
              var4 = var4 + (var18 * (var10 - var4) + ((dc) this).a(var18, (byte) -20));
              break L0;
            }
          } else {
            if (0.01 > var12) {
              if (var6 < 0.02) {
                return false;
              } else {
                var18 = (0.01 - var12) / (-var12 + var6);
                var8 = var8 + ((-var8 + var2) * var18 + ((dc) this).a(var18, (byte) -128));
                var16 = var16 + var18 * (var14 - var16);
                var12 = 0.01;
                var10 = var10 + (var18 * (-var10 + var4) + ((dc) this).a(var18, (byte) -101));
                break L0;
              }
            } else {
              ((dc) this).field_Y = var8;
              ((dc) this).field_ab = var4;
              ((dc) this).field_D = var10;
              ((dc) this).field_bb = var2;
              ((dc) this).field_I = var16;
              ((dc) this).field_C = var6;
              ((dc) this).field_F = var14;
              ((dc) this).field_A = var12;
              return true;
            }
          }
        }
        ((dc) this).field_Y = var8;
        ((dc) this).field_ab = var4;
        ((dc) this).field_D = var10;
        ((dc) this).field_bb = var2;
        ((dc) this).field_I = var16;
        ((dc) this).field_C = var6;
        ((dc) this).field_F = var14;
        ((dc) this).field_A = var12;
        return true;
    }

    final boolean g(int param0) {
        double var2 = 0.0;
        double var4 = 0.0;
        double var6 = 0.0;
        double var8 = 0.0;
        double var10 = 0.0;
        double var12 = 0.0;
        double var14 = 0.0;
        double var16 = 0.0;
        double var18 = 0.0;
        int var20 = 0;
        L0: {
          var20 = Confined.field_J ? 1 : 0;
          var2 = ((dc) this).field_bb;
          var4 = ((dc) this).field_ab;
          var6 = ((dc) this).field_C;
          var8 = ((dc) this).field_Y;
          var10 = ((dc) this).field_D;
          var12 = ((dc) this).field_A;
          var14 = ((dc) this).field_F;
          var16 = ((dc) this).field_I;
          if (param0 == -10603) {
            break L0;
          } else {
            dc.e(-43);
            break L0;
          }
        }
        L1: {
          if (1.2 * var6 >= -var2) {
            if (-var8 <= 1.2 * var12) {
              break L1;
            } else {
              if (var6 * 1.1 < -var2) {
                return false;
              } else {
                var18 = (var8 + var12 * 1.2) / (1.2 * (var12 - var6) + (-var2 + var8));
                var8 = var8 + ((-var8 + var2) * var18 + ((dc) this).a(var18, (byte) -120));
                var10 = var10 + ((var4 - var10) * var18 + ((dc) this).a(var18, (byte) -12));
                var16 = var16 + var18 * (-var16 + var14);
                var12 = var12 + var18 * (var6 - var12);
                ((dc) this).field_y = ((dc) this).field_y * (-var18 + 1.0);
                break L1;
              }
            }
          } else {
            if (var12 * 1.1 >= -var8) {
              var18 = (1.2 * var6 + var2) / ((var6 - var12) * 1.2 + (var2 - var8));
              var2 = var2 + (var18 * (-var2 + var8) + ((dc) this).a(var18, (byte) -84));
              var4 = var4 + ((-var4 + var10) * var18 + ((dc) this).a(var18, (byte) -80));
              var14 = var14 + var18 * (var16 - var14);
              var6 = var6 + var18 * (var12 - var6);
              ((dc) this).field_y = ((dc) this).field_y * (1.0 - var18);
              break L1;
            } else {
              return false;
            }
          }
        }
        L2: {
          if (1.2 * var6 >= var2) {
            if (-var8 > 1.2 * var12) {
              if (var2 > var6 * 1.1) {
                return false;
              } else {
                var18 = (-(var12 * 1.2) + var8) / (var8 - var2 + (var6 - var12) * 1.2);
                var8 = var8 + (((dc) this).a(var18, (byte) -58) + (var2 - var8) * var18);
                var12 = var12 + var18 * (-var12 + var6);
                var10 = var10 + (var18 * (-var10 + var4) + ((dc) this).a(var18, (byte) -3));
                var16 = var16 + var18 * (var14 - var16);
                ((dc) this).field_y = ((dc) this).field_y * (1.0 - var18);
                break L2;
              }
            } else {
              break L2;
            }
          } else {
            if (var12 * 1.1 >= var8) {
              var18 = (var2 - 1.2 * var6) / (-var8 + var2 + (var12 - var6) * 1.2);
              var2 = var2 + (var18 * (var8 - var2) + ((dc) this).a(var18, (byte) -29));
              var4 = var4 + (((dc) this).a(var18, (byte) -4) + var18 * (var10 - var4));
              var14 = var14 + (var16 - var14) * var18;
              var6 = var6 + (-var6 + var12) * var18;
              ((dc) this).field_y = ((dc) this).field_y * (1.0 - var18);
              break L2;
            } else {
              return false;
            }
          }
        }
        L3: {
          if (var6 * 1.2 >= -var4) {
            if (1.2 * var12 < -var10) {
              if (1.1 * var6 >= -var4) {
                var18 = (var12 * 1.2 + var10) / ((var12 - var6) * 1.2 + (-var4 + var10));
                var8 = var8 + (((dc) this).a(var18, (byte) -101) + var18 * (-var8 + var2));
                var16 = var16 + (var14 - var16) * var18;
                var10 = var10 + (var18 * (-var10 + var4) + ((dc) this).a(var18, (byte) -124));
                var12 = var12 + (var6 - var12) * var18;
                ((dc) this).field_y = ((dc) this).field_y * (-var18 + 1.0);
                break L3;
              } else {
                return false;
              }
            } else {
              break L3;
            }
          } else {
            if (var12 * 1.1 < -var10) {
              return false;
            } else {
              var18 = (var6 * 1.2 + var4) / (1.2 * (-var12 + var6) + (-var10 + var4));
              var2 = var2 + (var18 * (-var2 + var8) + ((dc) this).a(var18, (byte) -9));
              var14 = var14 + (-var14 + var16) * var18;
              var6 = var6 + var18 * (-var6 + var12);
              var4 = var4 + (((dc) this).a(var18, (byte) -63) + var18 * (var10 - var4));
              ((dc) this).field_y = ((dc) this).field_y * (-var18 + 1.0);
              break L3;
            }
          }
        }
        if (1.2 * var6 < var4) {
          if (var10 > 1.1 * var12) {
            return false;
          } else {
            var18 = (var4 - var6 * 1.2) / ((var12 - var6) * 1.2 - (var10 - var4));
            var2 = var2 + (((dc) this).a(var18, (byte) -56) + var18 * (var8 - var2));
            var14 = var14 + (-var14 + var16) * var18;
            var6 = var6 + var18 * (-var6 + var12);
            var4 = var4 + (((dc) this).a(var18, (byte) -75) + var18 * (var10 - var4));
            ((dc) this).field_y = ((dc) this).field_y * (-var18 + 1.0);
            ((dc) this).field_I = var16;
            ((dc) this).field_C = var6;
            ((dc) this).field_bb = var2;
            ((dc) this).field_F = var14;
            ((dc) this).field_ab = var4;
            ((dc) this).field_A = var12;
            ((dc) this).field_Y = var8;
            ((dc) this).field_D = var10;
            return true;
          }
        } else {
          if (1.2 * var12 < -var10) {
            if (var6 * 1.1 < var4) {
              return false;
            } else {
              var18 = (-(var12 * 1.2) + var10) / (1.2 * (var6 - var12) - (var4 - var10));
              var8 = var8 + ((-var8 + var2) * var18 + ((dc) this).a(var18, (byte) -64));
              var16 = var16 + (-var16 + var14) * var18;
              var10 = var10 + ((-var10 + var4) * var18 + ((dc) this).a(var18, (byte) -58));
              var12 = var12 + var18 * (var6 - var12);
              ((dc) this).field_y = ((dc) this).field_y * (1.0 - var18);
              ((dc) this).field_I = var16;
              ((dc) this).field_C = var6;
              ((dc) this).field_bb = var2;
              ((dc) this).field_F = var14;
              ((dc) this).field_ab = var4;
              ((dc) this).field_A = var12;
              ((dc) this).field_Y = var8;
              ((dc) this).field_D = var10;
              return true;
            }
          } else {
            ((dc) this).field_I = var16;
            ((dc) this).field_C = var6;
            ((dc) this).field_bb = var2;
            ((dc) this).field_F = var14;
            ((dc) this).field_ab = var4;
            ((dc) this).field_A = var12;
            ((dc) this).field_Y = var8;
            ((dc) this).field_D = var10;
            return true;
          }
        }
    }

    final void a(byte param0, double param1, double param2, double param3) {
        ((dc) this).field_R = ((dc) this).field_R - param1;
        ((dc) this).field_eb = ((dc) this).field_eb - param2;
        ((dc) this).field_s = ((dc) this).field_s - param3;
        ((dc) this).field_cb = ((dc) this).field_cb - param1;
        ((dc) this).field_L = ((dc) this).field_L - param3;
        ((dc) this).field_X = ((dc) this).field_X - param2;
        int var8 = -81 % ((-49 - param0) / 58);
    }

    final static void e(byte param0) {
    }

    int a(int param0, byte param1) {
        if (((dc) this).field_E == ((dc) this).field_v) {
            return param0;
        }
        if (param1 != -63) {
            ((dc) this).c(127);
        }
        double var3 = 65536.0 / ((double)(65536 + -param0) / (double)((dc) this).field_v + (double)param0 / (double)((dc) this).field_E);
        int var5 = (int)(65536.0 * (((double)(-((dc) this).field_v) + var3) / (double)(-((dc) this).field_v + ((dc) this).field_E)));
        if (!(0 <= var5)) {
            return 0;
        }
        if (!(var5 <= 65536)) {
            return 65536;
        }
        return var5;
    }

    private final void a(int param0, int param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
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
        int var21 = 0;
        int var22 = 0;
        int var23 = 0;
        L0: {
          var23 = Confined.field_J ? 1 : 0;
          var4 = ((((dc) this).field_t + -((dc) this).field_G) * param2 >> 16) + ((dc) this).field_G;
          var5 = ((dc) this).field_z - -((-((dc) this).field_z + ((dc) this).field_w) * param2 >> 16);
          var6 = (param2 * (-((dc) this).field_v + ((dc) this).field_E) >> 16) + ((dc) this).field_v;
          var7 = var4 - var6 >> 4;
          var8 = var6 + var4 - -15 >> 4;
          var9 = var5 + -var6 >> 4;
          if (var7 >= 0) {
            break L0;
          } else {
            var7 = 0;
            break L0;
          }
        }
        L1: {
          if (var9 < 0) {
            var9 = 0;
            break L1;
          } else {
            break L1;
          }
        }
        L2: {
          var10 = var6 + (var5 + 15) >> 4;
          if (var8 <= 640) {
            break L2;
          } else {
            var8 = 640;
            break L2;
          }
        }
        L3: {
          if (var10 > 376) {
            var10 = 376;
            break L3;
          } else {
            break L3;
          }
        }
        var11 = var7 + 640 * var9;
        var12 = 640 + -var8 - -var7;
        var9 = var9 << 4;
        var7 = var7 << 4;
        var8 = var8 << 4;
        param2 = param2 << 12;
        var10 = var10 << 4;
        var13 = ((((dc) this).field_H & 65280) * param1 & 16711680) + (-16711936 & (((dc) this).field_H & 16711935) * param1) >> 8;
        var14 = var9;
        L4: while (true) {
          if (var14 >= var10) {
            return;
          } else {
            var15 = var7;
            L5: while (true) {
              if (var15 >= var8) {
                var11 = var11 + var12;
                var14 += 16;
                continue L4;
              } else {
                L6: {
                  if (!((dc) this).field_V) {
                    break L6;
                  } else {
                    if (param2 <= ((dc) this).field_U * (var15 - ((dc) this).field_G) - -((-((dc) this).field_z + var14) * ((dc) this).field_O)) {
                      break L6;
                    } else {
                      var11++;
                      var15 += 16;
                      continue L5;
                    }
                  }
                }
                var16 = (int)(256.0 * Math.sqrt((double)((-var5 + var14) * (var14 - var5) + (var15 - var4) * (-var4 + var15)))) / var6;
                if (256 > var16) {
                  var17 = 256 + -var16;
                  var18 = fn.field_h[var11];
                  var19 = (16711935 & var18) + (((var13 & 16711935) * var17 & -16711820) >>> 8);
                  var20 = 255 * ((var19 & -16711936) >>> 8);
                  var19 = (var19 | var20) & 16711935;
                  var21 = ((16711815 & (var13 & 65280) * var17) >>> 8) + (65280 & var18);
                  var22 = 255 * (var21 >>> 8 & 65280);
                  var21 = (var21 | var22) & 65280;
                  fn.field_h[var11] = nl.a(var21, var19);
                  var11++;
                  var15 += 16;
                  continue L5;
                } else {
                  var11++;
                  var15 += 16;
                  continue L5;
                }
              }
            }
          }
        }
    }

    final static void d(int param0) {
        if (param0 < 99) {
            boolean discarded$0 = dc.f(-117);
        }
        if (null != kl.field_G) {
            kl.field_G.a(1);
            kl.field_G = null;
        }
    }

    dc(pm param0, bi param1, int param2) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        try {
          L0: {
            L1: {
              ((dc) this).field_T = param0;
              if (param1 == null) {
                break L1;
              } else {
                ((dc) this).field_Q = new nm(param0, param1, (dc) this, param2);
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) runtimeException;
            stackOut_4_1 = new StringBuilder().append("dc.<init>(");
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param0 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          L3: {
            stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
            stackOut_7_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(',');
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param1 == null) {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L3;
            } else {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L3;
            }
          }
          throw sd.a((Throwable) (Object) stackIn_10_0, stackIn_10_2 + ',' + param2 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_M = "Press <%0> to fire concussion missiles";
    }
}
