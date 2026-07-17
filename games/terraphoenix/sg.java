/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sg extends ci {
    private final static void b(int param0, int param1, int param2, int[] param3, int[] param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11, int param12, int param13) {
        int var14 = 0;
        param8 = -param10;
        L0: while (true) {
          if (param8 >= 0) {
            return;
          } else {
            param6 = -param9;
            L1: while (true) {
              if (param6 >= 0) {
                param7 = param7 + param11;
                param5 = param5 + param12;
                param8++;
                continue L0;
              } else {
                int incrementValue$66 = param5;
                param5++;
                param0 = param4[incrementValue$66];
                if (param0 == 0) {
                  param7++;
                  param6++;
                  continue L1;
                } else {
                  var14 = param13 * (param0 >>> 24) >> 8 & 255;
                  param1 = (param0 & 16711935) * var14;
                  param0 = (param1 & -16711936) + (param0 * var14 - param1 & 16711680) >>> 8;
                  param1 = param3[param7];
                  param2 = param0 + param1;
                  param0 = (param0 & 16711935) + (param1 & 16711935);
                  param1 = (param0 & 16777472) + (param2 - param0 & 65536);
                  int incrementValue$67 = param7;
                  param7++;
                  param3[incrementValue$67] = param2 - param1 | param1 - (param1 >>> 8);
                  param6++;
                  continue L1;
                }
              }
            }
          }
        }
    }

    private final static void c(int[] param0, int[] param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11) {
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        var12 = param11 & 16711935;
        var13 = param11 >> 8 & 255;
        param6 = -param8;
        L0: while (true) {
          if (param6 >= 0) {
            return;
          } else {
            param5 = -param7;
            L1: while (true) {
              if (param5 >= 0) {
                param4 = param4 + param9;
                param3 = param3 + param10;
                param6++;
                continue L0;
              } else {
                int incrementValue$66 = param3;
                param3++;
                param2 = param1[incrementValue$66];
                var14 = param2 >>> 24;
                param2 = param2 & 16777215;
                if (var14 == 0) {
                  param4++;
                  param5++;
                  continue L1;
                } else {
                  L2: {
                    var15 = 0;
                    if (param2 >> 8 != (param2 & 65535)) {
                      var15 = param2;
                      break L2;
                    } else {
                      param2 = param2 & 255;
                      var15 = (param2 * var12 >> 8 & 16711934) + (param2 * var13 & 65280) + 1;
                      break L2;
                    }
                  }
                  var16 = 256 - var14;
                  var17 = param0[param4];
                  int incrementValue$67 = param4;
                  param4++;
                  param0[incrementValue$67] = ((var15 & 16711935) * var14 + (var17 & 16711935) * var16 & -16711936) + ((var15 & 65280) * var14 + (var17 & 65280) * var16 & 16711680) >>> 8;
                  param5++;
                  continue L1;
                }
              }
            }
          }
        }
    }

    private final static void e(int[] param0, int[] param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9) {
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        for (var10 = -param6; var10 < 0; var10++) {
            for (var11 = -param5; var11 < 0; var11++) {
                var12 = (param1[param3] >>> 24) * param9 >> 8;
                var13 = 256 - var12;
                int incrementValue$0 = param3;
                param3++;
                var14 = param1[incrementValue$0];
                var15 = param0[param4];
                int incrementValue$1 = param4;
                param4++;
                param0[incrementValue$1] = ((var14 & 16711935) * var12 + (var15 & 16711935) * var13 & -16711936) + ((var14 & 65280) * var12 + (var15 & 65280) * var13 & 16711680) >>> 8;
            }
            param4 = param4 + param7;
            param3 = param3 + param8;
        }
    }

    final void a(int param0, int param1, int param2, int param3, int param4, int param5) {
        double var7 = 0.0;
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
        double var24 = 0.0;
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
        if (param5 != 0) {
          L0: {
            param0 = param0 - (((sg) this).field_p << 4);
            param1 = param1 - (((sg) this).field_v << 4);
            var7 = (double)(param4 & 65535) * 0.00009587379924285257;
            var9 = (int)Math.floor(Math.sin(var7) * (double)param5 + 0.5);
            var10 = (int)Math.floor(Math.cos(var7) * (double)param5 + 0.5);
            var11 = -param0 * var10 + -param1 * var9;
            var12 = --param0 * var9 + -param1 * var10;
            var13 = ((((sg) this).field_r << 4) - param0) * var10 + -param1 * var9;
            var14 = -((((sg) this).field_r << 4) - param0) * var9 + -param1 * var10;
            var15 = -param0 * var10 + ((((sg) this).field_t << 4) - param1) * var9;
            var16 = --param0 * var9 + ((((sg) this).field_t << 4) - param1) * var10;
            var17 = ((((sg) this).field_r << 4) - param0) * var10 + ((((sg) this).field_t << 4) - param1) * var9;
            var18 = -((((sg) this).field_r << 4) - param0) * var9 + ((((sg) this).field_t << 4) - param1) * var10;
            if (var11 >= var13) {
              var19 = var13;
              var20 = var11;
              break L0;
            } else {
              var19 = var11;
              var20 = var13;
              break L0;
            }
          }
          L1: {
            if (var15 >= var19) {
              break L1;
            } else {
              var19 = var15;
              break L1;
            }
          }
          L2: {
            if (var17 >= var19) {
              break L2;
            } else {
              var19 = var17;
              break L2;
            }
          }
          L3: {
            if (var15 <= var20) {
              break L3;
            } else {
              var20 = var15;
              break L3;
            }
          }
          L4: {
            if (var17 <= var20) {
              break L4;
            } else {
              var20 = var17;
              break L4;
            }
          }
          L5: {
            if (var12 >= var14) {
              var21 = var14;
              var22 = var12;
              break L5;
            } else {
              var21 = var12;
              var22 = var14;
              break L5;
            }
          }
          L6: {
            if (var16 >= var21) {
              break L6;
            } else {
              var21 = var16;
              break L6;
            }
          }
          L7: {
            if (var18 >= var21) {
              break L7;
            } else {
              var21 = var18;
              break L7;
            }
          }
          L8: {
            if (var16 <= var22) {
              break L8;
            } else {
              var22 = var16;
              break L8;
            }
          }
          L9: {
            if (var18 <= var22) {
              break L9;
            } else {
              var22 = var18;
              break L9;
            }
          }
          L10: {
            var19 = var19 >> 12;
            var20 = var20 + 4095 >> 12;
            var21 = var21 >> 12;
            var22 = var22 + 4095 >> 12;
            var19 = var19 + param2;
            var20 = var20 + param2;
            var21 = var21 + param3;
            var22 = var22 + param3;
            var19 = var19 >> 4;
            var20 = var20 + 15 >> 4;
            var21 = var21 >> 4;
            var22 = var22 + 15 >> 4;
            if (var19 >= l.field_b) {
              break L10;
            } else {
              var19 = l.field_b;
              break L10;
            }
          }
          L11: {
            if (var20 <= l.field_f) {
              break L11;
            } else {
              var20 = l.field_f;
              break L11;
            }
          }
          L12: {
            if (var21 >= l.field_d) {
              break L12;
            } else {
              var21 = l.field_d;
              break L12;
            }
          }
          L13: {
            if (var22 <= l.field_c) {
              break L13;
            } else {
              var22 = l.field_c;
              break L13;
            }
          }
          var20 = var19 - var20;
          if (var20 < 0) {
            var22 = var21 - var22;
            if (var22 < 0) {
              L14: {
                var23 = var21 * l.field_k + var19;
                var24 = 16777216.0 / (double)param5;
                var26 = (int)Math.floor(Math.sin(var7) * var24 + 0.5);
                var27 = (int)Math.floor(Math.cos(var7) * var24 + 0.5);
                var28 = (var19 << 4) + 8 - param2;
                var29 = (var21 << 4) + 8 - param3;
                var30 = (param0 << 8) - (var29 * var26 >> 4);
                var31 = (param1 << 8) + (var29 * var27 >> 4);
                if (var27 != 0) {
                  if (var27 >= 0) {
                    if (var26 != 0) {
                      if (var26 >= 0) {
                        var33 = var22;
                        L15: while (true) {
                          if (var33 >= 0) {
                            break L14;
                          } else {
                            L16: {
                              var34 = var23;
                              var35 = var30 + (var28 * var27 >> 4);
                              var36 = var31 + (var28 * var26 >> 4);
                              var37 = var20;
                              if (var35 >= 0) {
                                break L16;
                              } else {
                                var32 = (var27 - 1 - var35) / var27;
                                var37 = var37 + var32;
                                var35 = var35 + var27 * var32;
                                var36 = var36 + var26 * var32;
                                var34 = var34 + var32;
                                break L16;
                              }
                            }
                            L17: {
                              var32 = (1 + var35 - (((sg) this).field_r << 12) - var27) / var27;
                              if ((1 + var35 - (((sg) this).field_r << 12) - var27) / var27 <= var37) {
                                break L17;
                              } else {
                                var37 = var32;
                                break L17;
                              }
                            }
                            L18: {
                              if (var36 >= 0) {
                                break L18;
                              } else {
                                var32 = (var26 - 1 - var36) / var26;
                                var37 = var37 + var32;
                                var35 = var35 + var27 * var32;
                                var36 = var36 + var26 * var32;
                                var34 = var34 + var32;
                                break L18;
                              }
                            }
                            L19: {
                              var32 = (1 + var36 - (((sg) this).field_t << 12) - var26) / var26;
                              if ((1 + var36 - (((sg) this).field_t << 12) - var26) / var26 <= var37) {
                                break L19;
                              } else {
                                var37 = var32;
                                break L19;
                              }
                            }
                            L20: while (true) {
                              if (var37 >= 0) {
                                var33++;
                                var30 = var30 - var26;
                                var31 = var31 + var27;
                                var23 = var23 + l.field_k;
                                continue L15;
                              } else {
                                var38 = ((sg) this).field_z[(var36 >> 12) * ((sg) this).field_r + (var35 >> 12)];
                                var39 = l.field_i[var34];
                                var40 = var38 >>> 24;
                                var41 = 256 - var40;
                                int incrementValue$9 = var34;
                                var34++;
                                l.field_i[incrementValue$9] = ((var38 & 16711935) * var40 + (var39 & 16711935) * var41 & -16711936) + ((var38 & 65280) * var40 + (var39 & 65280) * var41 & 16711680) >>> 8;
                                var35 = var35 + var27;
                                var36 = var36 + var26;
                                var37++;
                                continue L20;
                              }
                            }
                          }
                        }
                      } else {
                        var33 = var22;
                        L21: while (true) {
                          if (var33 >= 0) {
                            break L14;
                          } else {
                            L22: {
                              var34 = var23;
                              var35 = var30 + (var28 * var27 >> 4);
                              var36 = var31 + (var28 * var26 >> 4);
                              var37 = var20;
                              if (var35 >= 0) {
                                break L22;
                              } else {
                                var32 = (var27 - 1 - var35) / var27;
                                var37 = var37 + var32;
                                var35 = var35 + var27 * var32;
                                var36 = var36 + var26 * var32;
                                var34 = var34 + var32;
                                break L22;
                              }
                            }
                            L23: {
                              var32 = (1 + var35 - (((sg) this).field_r << 12) - var27) / var27;
                              if ((1 + var35 - (((sg) this).field_r << 12) - var27) / var27 <= var37) {
                                break L23;
                              } else {
                                var37 = var32;
                                break L23;
                              }
                            }
                            L24: {
                              var32 = var36 - (((sg) this).field_t << 12);
                              if (var36 - (((sg) this).field_t << 12) < 0) {
                                break L24;
                              } else {
                                var32 = (var26 - var32) / var26;
                                var37 = var37 + var32;
                                var35 = var35 + var27 * var32;
                                var36 = var36 + var26 * var32;
                                var34 = var34 + var32;
                                break L24;
                              }
                            }
                            L25: {
                              var32 = (var36 - var26) / var26;
                              if ((var36 - var26) / var26 <= var37) {
                                break L25;
                              } else {
                                var37 = var32;
                                break L25;
                              }
                            }
                            L26: while (true) {
                              if (var37 >= 0) {
                                var33++;
                                var30 = var30 - var26;
                                var31 = var31 + var27;
                                var23 = var23 + l.field_k;
                                continue L21;
                              } else {
                                var38 = ((sg) this).field_z[(var36 >> 12) * ((sg) this).field_r + (var35 >> 12)];
                                var39 = l.field_i[var34];
                                var40 = var38 >>> 24;
                                var41 = 256 - var40;
                                int incrementValue$10 = var34;
                                var34++;
                                l.field_i[incrementValue$10] = ((var38 & 16711935) * var40 + (var39 & 16711935) * var41 & -16711936) + ((var38 & 65280) * var40 + (var39 & 65280) * var41 & 16711680) >>> 8;
                                var35 = var35 + var27;
                                var36 = var36 + var26;
                                var37++;
                                continue L26;
                              }
                            }
                          }
                        }
                      }
                    } else {
                      var33 = var22;
                      L27: while (true) {
                        if (var33 >= 0) {
                          break L14;
                        } else {
                          L28: {
                            var34 = var23;
                            var35 = var30 + (var28 * var27 >> 4);
                            var36 = var31;
                            var37 = var20;
                            if (var36 >= 0) {
                              if (var36 - (((sg) this).field_t << 12) < 0) {
                                L29: {
                                  if (var35 >= 0) {
                                    break L29;
                                  } else {
                                    var32 = (var27 - 1 - var35) / var27;
                                    var37 = var37 + var32;
                                    var35 = var35 + var27 * var32;
                                    var34 = var34 + var32;
                                    break L29;
                                  }
                                }
                                L30: {
                                  var32 = (1 + var35 - (((sg) this).field_r << 12) - var27) / var27;
                                  if ((1 + var35 - (((sg) this).field_r << 12) - var27) / var27 <= var37) {
                                    break L30;
                                  } else {
                                    var37 = var32;
                                    break L30;
                                  }
                                }
                                L31: while (true) {
                                  if (var37 >= 0) {
                                    break L28;
                                  } else {
                                    var38 = ((sg) this).field_z[(var36 >> 12) * ((sg) this).field_r + (var35 >> 12)];
                                    var39 = l.field_i[var34];
                                    var40 = var38 >>> 24;
                                    var41 = 256 - var40;
                                    int incrementValue$11 = var34;
                                    var34++;
                                    l.field_i[incrementValue$11] = ((var38 & 16711935) * var40 + (var39 & 16711935) * var41 & -16711936) + ((var38 & 65280) * var40 + (var39 & 65280) * var41 & 16711680) >>> 8;
                                    var35 = var35 + var27;
                                    var37++;
                                    continue L31;
                                  }
                                }
                              } else {
                                break L28;
                              }
                            } else {
                              break L28;
                            }
                          }
                          var33++;
                          var31 = var31 + var27;
                          var23 = var23 + l.field_k;
                          continue L27;
                        }
                      }
                    }
                  } else {
                    if (var26 != 0) {
                      if (var26 >= 0) {
                        var33 = var22;
                        L32: while (true) {
                          if (var33 >= 0) {
                            break L14;
                          } else {
                            L33: {
                              var34 = var23;
                              var35 = var30 + (var28 * var27 >> 4);
                              var36 = var31 + (var28 * var26 >> 4);
                              var37 = var20;
                              var32 = var35 - (((sg) this).field_r << 12);
                              if (var35 - (((sg) this).field_r << 12) < 0) {
                                break L33;
                              } else {
                                var32 = (var27 - var32) / var27;
                                var37 = var37 + var32;
                                var35 = var35 + var27 * var32;
                                var36 = var36 + var26 * var32;
                                var34 = var34 + var32;
                                break L33;
                              }
                            }
                            L34: {
                              var32 = (var35 - var27) / var27;
                              if ((var35 - var27) / var27 <= var37) {
                                break L34;
                              } else {
                                var37 = var32;
                                break L34;
                              }
                            }
                            L35: {
                              if (var36 >= 0) {
                                break L35;
                              } else {
                                var32 = (var26 - 1 - var36) / var26;
                                var37 = var37 + var32;
                                var35 = var35 + var27 * var32;
                                var36 = var36 + var26 * var32;
                                var34 = var34 + var32;
                                break L35;
                              }
                            }
                            L36: {
                              var32 = (1 + var36 - (((sg) this).field_t << 12) - var26) / var26;
                              if ((1 + var36 - (((sg) this).field_t << 12) - var26) / var26 <= var37) {
                                break L36;
                              } else {
                                var37 = var32;
                                break L36;
                              }
                            }
                            L37: while (true) {
                              if (var37 >= 0) {
                                var33++;
                                var30 = var30 - var26;
                                var31 = var31 + var27;
                                var23 = var23 + l.field_k;
                                continue L32;
                              } else {
                                var38 = ((sg) this).field_z[(var36 >> 12) * ((sg) this).field_r + (var35 >> 12)];
                                var39 = l.field_i[var34];
                                var40 = var38 >>> 24;
                                var41 = 256 - var40;
                                int incrementValue$12 = var34;
                                var34++;
                                l.field_i[incrementValue$12] = ((var38 & 16711935) * var40 + (var39 & 16711935) * var41 & -16711936) + ((var38 & 65280) * var40 + (var39 & 65280) * var41 & 16711680) >>> 8;
                                var35 = var35 + var27;
                                var36 = var36 + var26;
                                var37++;
                                continue L37;
                              }
                            }
                          }
                        }
                      } else {
                        var33 = var22;
                        L38: while (true) {
                          if (var33 >= 0) {
                            break L14;
                          } else {
                            L39: {
                              var34 = var23;
                              var35 = var30 + (var28 * var27 >> 4);
                              var36 = var31 + (var28 * var26 >> 4);
                              var37 = var20;
                              var32 = var35 - (((sg) this).field_r << 12);
                              if (var35 - (((sg) this).field_r << 12) < 0) {
                                break L39;
                              } else {
                                var32 = (var27 - var32) / var27;
                                var37 = var37 + var32;
                                var35 = var35 + var27 * var32;
                                var36 = var36 + var26 * var32;
                                var34 = var34 + var32;
                                break L39;
                              }
                            }
                            L40: {
                              var32 = (var35 - var27) / var27;
                              if ((var35 - var27) / var27 <= var37) {
                                break L40;
                              } else {
                                var37 = var32;
                                break L40;
                              }
                            }
                            L41: {
                              var32 = var36 - (((sg) this).field_t << 12);
                              if (var36 - (((sg) this).field_t << 12) < 0) {
                                break L41;
                              } else {
                                var32 = (var26 - var32) / var26;
                                var37 = var37 + var32;
                                var35 = var35 + var27 * var32;
                                var36 = var36 + var26 * var32;
                                var34 = var34 + var32;
                                break L41;
                              }
                            }
                            L42: {
                              var32 = (var36 - var26) / var26;
                              if ((var36 - var26) / var26 <= var37) {
                                break L42;
                              } else {
                                var37 = var32;
                                break L42;
                              }
                            }
                            L43: while (true) {
                              if (var37 >= 0) {
                                var33++;
                                var30 = var30 - var26;
                                var31 = var31 + var27;
                                var23 = var23 + l.field_k;
                                continue L38;
                              } else {
                                var38 = ((sg) this).field_z[(var36 >> 12) * ((sg) this).field_r + (var35 >> 12)];
                                var39 = l.field_i[var34];
                                var40 = var38 >>> 24;
                                var41 = 256 - var40;
                                int incrementValue$13 = var34;
                                var34++;
                                l.field_i[incrementValue$13] = ((var38 & 16711935) * var40 + (var39 & 16711935) * var41 & -16711936) + ((var38 & 65280) * var40 + (var39 & 65280) * var41 & 16711680) >>> 8;
                                var35 = var35 + var27;
                                var36 = var36 + var26;
                                var37++;
                                continue L43;
                              }
                            }
                          }
                        }
                      }
                    } else {
                      var33 = var22;
                      L44: while (true) {
                        if (var33 >= 0) {
                          break L14;
                        } else {
                          L45: {
                            var34 = var23;
                            var35 = var30 + (var28 * var27 >> 4);
                            var36 = var31;
                            var37 = var20;
                            if (var36 >= 0) {
                              if (var36 - (((sg) this).field_t << 12) < 0) {
                                L46: {
                                  var32 = var35 - (((sg) this).field_r << 12);
                                  if (var35 - (((sg) this).field_r << 12) < 0) {
                                    break L46;
                                  } else {
                                    var32 = (var27 - var32) / var27;
                                    var37 = var37 + var32;
                                    var35 = var35 + var27 * var32;
                                    var34 = var34 + var32;
                                    break L46;
                                  }
                                }
                                L47: {
                                  var32 = (var35 - var27) / var27;
                                  if ((var35 - var27) / var27 <= var37) {
                                    break L47;
                                  } else {
                                    var37 = var32;
                                    break L47;
                                  }
                                }
                                L48: while (true) {
                                  if (var37 >= 0) {
                                    break L45;
                                  } else {
                                    var38 = ((sg) this).field_z[(var36 >> 12) * ((sg) this).field_r + (var35 >> 12)];
                                    var39 = l.field_i[var34];
                                    var40 = var38 >>> 24;
                                    var41 = 256 - var40;
                                    int incrementValue$14 = var34;
                                    var34++;
                                    l.field_i[incrementValue$14] = ((var38 & 16711935) * var40 + (var39 & 16711935) * var41 & -16711936) + ((var38 & 65280) * var40 + (var39 & 65280) * var41 & 16711680) >>> 8;
                                    var35 = var35 + var27;
                                    var37++;
                                    continue L48;
                                  }
                                }
                              } else {
                                break L45;
                              }
                            } else {
                              break L45;
                            }
                          }
                          var33++;
                          var31 = var31 + var27;
                          var23 = var23 + l.field_k;
                          continue L44;
                        }
                      }
                    }
                  }
                } else {
                  if (var26 != 0) {
                    if (var26 >= 0) {
                      var33 = var22;
                      L49: while (true) {
                        if (var33 >= 0) {
                          break L14;
                        } else {
                          L50: {
                            var34 = var23;
                            var35 = var30;
                            var36 = var31 + (var28 * var26 >> 4);
                            var37 = var20;
                            if (var35 >= 0) {
                              if (var35 - (((sg) this).field_r << 12) < 0) {
                                L51: {
                                  if (var36 >= 0) {
                                    break L51;
                                  } else {
                                    var32 = (var26 - 1 - var36) / var26;
                                    var37 = var37 + var32;
                                    var36 = var36 + var26 * var32;
                                    var34 = var34 + var32;
                                    break L51;
                                  }
                                }
                                L52: {
                                  var32 = (1 + var36 - (((sg) this).field_t << 12) - var26) / var26;
                                  if ((1 + var36 - (((sg) this).field_t << 12) - var26) / var26 <= var37) {
                                    break L52;
                                  } else {
                                    var37 = var32;
                                    break L52;
                                  }
                                }
                                L53: while (true) {
                                  if (var37 >= 0) {
                                    break L50;
                                  } else {
                                    var38 = ((sg) this).field_z[(var36 >> 12) * ((sg) this).field_r + (var35 >> 12)];
                                    var39 = l.field_i[var34];
                                    var40 = var38 >>> 24;
                                    var41 = 256 - var40;
                                    int incrementValue$15 = var34;
                                    var34++;
                                    l.field_i[incrementValue$15] = ((var38 & 16711935) * var40 + (var39 & 16711935) * var41 & -16711936) + ((var38 & 65280) * var40 + (var39 & 65280) * var41 & 16711680) >>> 8;
                                    var36 = var36 + var26;
                                    var37++;
                                    continue L53;
                                  }
                                }
                              } else {
                                break L50;
                              }
                            } else {
                              break L50;
                            }
                          }
                          var33++;
                          var30 = var30 - var26;
                          var23 = var23 + l.field_k;
                          continue L49;
                        }
                      }
                    } else {
                      var33 = var22;
                      L54: while (true) {
                        if (var33 >= 0) {
                          break L14;
                        } else {
                          L55: {
                            var34 = var23;
                            var35 = var30;
                            var36 = var31 + (var28 * var26 >> 4);
                            var37 = var20;
                            if (var35 >= 0) {
                              if (var35 - (((sg) this).field_r << 12) < 0) {
                                L56: {
                                  var32 = var36 - (((sg) this).field_t << 12);
                                  if (var36 - (((sg) this).field_t << 12) < 0) {
                                    break L56;
                                  } else {
                                    var32 = (var26 - var32) / var26;
                                    var37 = var37 + var32;
                                    var36 = var36 + var26 * var32;
                                    var34 = var34 + var32;
                                    break L56;
                                  }
                                }
                                L57: {
                                  var32 = (var36 - var26) / var26;
                                  if ((var36 - var26) / var26 <= var37) {
                                    break L57;
                                  } else {
                                    var37 = var32;
                                    break L57;
                                  }
                                }
                                L58: while (true) {
                                  if (var37 >= 0) {
                                    break L55;
                                  } else {
                                    var38 = ((sg) this).field_z[(var36 >> 12) * ((sg) this).field_r + (var35 >> 12)];
                                    var39 = l.field_i[var34];
                                    var40 = var38 >>> 24;
                                    var41 = 256 - var40;
                                    int incrementValue$16 = var34;
                                    var34++;
                                    l.field_i[incrementValue$16] = ((var38 & 16711935) * var40 + (var39 & 16711935) * var41 & -16711936) + ((var38 & 65280) * var40 + (var39 & 65280) * var41 & 16711680) >>> 8;
                                    var36 = var36 + var26;
                                    var37++;
                                    continue L58;
                                  }
                                }
                              } else {
                                break L55;
                              }
                            } else {
                              break L55;
                            }
                          }
                          var33++;
                          var30 = var30 - var26;
                          var23 = var23 + l.field_k;
                          continue L54;
                        }
                      }
                    }
                  } else {
                    var33 = var22;
                    L59: while (true) {
                      if (var33 >= 0) {
                        return;
                      } else {
                        L60: {
                          var34 = var23;
                          var35 = var30;
                          var36 = var31;
                          var37 = var20;
                          if (var35 >= 0) {
                            if (var36 >= 0) {
                              if (var35 - (((sg) this).field_r << 12) < 0) {
                                if (var36 - (((sg) this).field_t << 12) < 0) {
                                  L61: while (true) {
                                    if (var37 >= 0) {
                                      break L60;
                                    } else {
                                      var38 = ((sg) this).field_z[(var36 >> 12) * ((sg) this).field_r + (var35 >> 12)];
                                      var39 = l.field_i[var34];
                                      var40 = var38 >>> 24;
                                      var41 = 256 - var40;
                                      int incrementValue$17 = var34;
                                      var34++;
                                      l.field_i[incrementValue$17] = ((var38 & 16711935) * var40 + (var39 & 16711935) * var41 & -16711936) + ((var38 & 65280) * var40 + (var39 & 65280) * var41 & 16711680) >>> 8;
                                      var37++;
                                      continue L61;
                                    }
                                  }
                                } else {
                                  break L60;
                                }
                              } else {
                                break L60;
                              }
                            } else {
                              break L60;
                            }
                          } else {
                            break L60;
                          }
                        }
                        var33++;
                        var23 = var23 + l.field_k;
                        continue L59;
                      }
                    }
                  }
                }
              }
              return;
            } else {
              return;
            }
          } else {
            return;
          }
        } else {
          return;
        }
    }

    final void c(int param0, int param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        if (param2 != 256) {
          L0: {
            param0 = param0 + ((sg) this).field_p;
            param1 = param1 + ((sg) this).field_v;
            var4 = param0 + param1 * l.field_k;
            var5 = 0;
            var6 = ((sg) this).field_t;
            var7 = ((sg) this).field_r;
            var8 = l.field_k - var7;
            var9 = 0;
            if (param1 >= l.field_d) {
              break L0;
            } else {
              var10 = l.field_d - param1;
              var6 = var6 - var10;
              param1 = l.field_d;
              var5 = var5 + var10 * var7;
              var4 = var4 + var10 * l.field_k;
              break L0;
            }
          }
          L1: {
            if (param1 + var6 <= l.field_c) {
              break L1;
            } else {
              var6 = var6 - (param1 + var6 - l.field_c);
              break L1;
            }
          }
          L2: {
            if (param0 >= l.field_b) {
              break L2;
            } else {
              var10 = l.field_b - param0;
              var7 = var7 - var10;
              param0 = l.field_b;
              var5 = var5 + var10;
              var4 = var4 + var10;
              var9 = var9 + var10;
              var8 = var8 + var10;
              break L2;
            }
          }
          L3: {
            if (param0 + var7 <= l.field_f) {
              break L3;
            } else {
              var10 = param0 + var7 - l.field_f;
              var7 = var7 - var10;
              var9 = var9 + var10;
              var8 = var8 + var10;
              break L3;
            }
          }
          if (var7 <= 0) {
            return;
          } else {
            if (var6 > 0) {
              sg.d(l.field_i, ((sg) this).field_z, 0, var5, var4, var7, var6, var8, var9, param2);
              return;
            } else {
              return;
            }
          }
        } else {
          ((sg) this).b(param0, param1);
          return;
        }
    }

    final void c(int param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int[] var9 = null;
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
        int[] var22 = null;
        int[] var23 = null;
        int[] var24 = null;
        int[] var25 = null;
        int stackIn_3_0 = 0;
        int stackIn_6_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_12_0 = 0;
        int stackOut_2_0 = 0;
        int stackOut_1_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_10_0 = 0;
        L0: {
          var3 = ((sg) this).field_r >> 2;
          var4 = ((sg) this).field_t >> 2;
          param0 = param0 + ((sg) this).field_p / 4;
          param1 = param1 + ((sg) this).field_v / 4;
          if (param0 >= l.field_b) {
            stackOut_2_0 = 0;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          } else {
            stackOut_1_0 = l.field_b - param0 << 2;
            stackIn_3_0 = stackOut_1_0;
            break L0;
          }
        }
        L1: {
          var5 = stackIn_3_0;
          if (param0 + var3 <= l.field_f) {
            stackOut_5_0 = ((sg) this).field_r - 4;
            stackIn_6_0 = stackOut_5_0;
            break L1;
          } else {
            stackOut_4_0 = (l.field_f - param0 << 2) - 4;
            stackIn_6_0 = stackOut_4_0;
            break L1;
          }
        }
        L2: {
          var6 = stackIn_6_0;
          if (param1 >= l.field_d) {
            stackOut_8_0 = 0;
            stackIn_9_0 = stackOut_8_0;
            break L2;
          } else {
            stackOut_7_0 = l.field_d - param1 << 2;
            stackIn_9_0 = stackOut_7_0;
            break L2;
          }
        }
        L3: {
          var7 = stackIn_9_0;
          if (param1 + var4 <= l.field_c) {
            stackOut_11_0 = ((sg) this).field_t - 4;
            stackIn_12_0 = stackOut_11_0;
            break L3;
          } else {
            stackOut_10_0 = (l.field_c - param1 << 2) - 4;
            stackIn_12_0 = stackOut_10_0;
            break L3;
          }
        }
        var8 = stackIn_12_0;
        var25 = new int[16];
        var24 = var25;
        var23 = var24;
        var22 = var23;
        var9 = var22;
        var10 = var7;
        L4: while (true) {
          if (var10 > var8) {
            return;
          } else {
            var11 = var5;
            L5: while (true) {
              if (var11 > var6) {
                var10 += 4;
                continue L4;
              } else {
                var12 = var10 * ((sg) this).field_r + var11;
                var13 = (param1 + (var10 >> 2)) * l.field_k + (param0 + (var11 >> 2));
                var14 = 0;
                L6: while (true) {
                  if (var14 >= 4) {
                    var25 = var24;
                    var14 = 0;
                    var15 = 0;
                    var16 = 0;
                    var17 = 0;
                    var18 = 0;
                    var19 = 0;
                    L7: while (true) {
                      if (var19 >= 16) {
                        if (var15 != 0) {
                          var16 = (var16 / var15 << 16) + var18 / var15;
                          var17 = var17 / var15 << 8;
                          var19 = var15 >> 4;
                          var20 = 256 - var19;
                          var21 = l.field_i[var13];
                          l.field_i[var13] = (var19 * var16 + var20 * (var21 & 16711935) & -16711936) + (var19 * var17 + var20 * (var21 & 65280) & 16711680) >>> 8;
                          var11 += 4;
                          continue L5;
                        } else {
                          var11 += 4;
                          continue L5;
                        }
                      } else {
                        var14 = var25[var19] >>> 24;
                        var15 = var15 + var14;
                        var16 = var16 + var14 * (var25[var19] >> 16 & 255);
                        var17 = var17 + var14 * (var25[var19] >> 8 & 255);
                        var18 = var18 + var14 * (var25[var19] & 255);
                        var19++;
                        continue L7;
                      }
                    }
                  } else {
                    var15 = 0;
                    L8: while (true) {
                      if (var15 >= 4) {
                        var14++;
                        continue L6;
                      } else {
                        var9[(var14 << 2) + var15] = ((sg) this).field_z[var12 + var14 * ((sg) this).field_r + var15];
                        var15++;
                        continue L8;
                      }
                    }
                  }
                }
              }
            }
          }
        }
    }

    final void d(int param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        L0: {
          param0 = param0 + ((sg) this).field_p;
          param1 = param1 + ((sg) this).field_v;
          var3 = param0 + param1 * l.field_k;
          var4 = 0;
          var5 = ((sg) this).field_t;
          var6 = ((sg) this).field_r;
          var7 = l.field_k - var6;
          var8 = 0;
          if (param1 >= l.field_d) {
            break L0;
          } else {
            var9 = l.field_d - param1;
            var5 = var5 - var9;
            param1 = l.field_d;
            var4 = var4 + var9 * var6;
            var3 = var3 + var9 * l.field_k;
            break L0;
          }
        }
        L1: {
          if (param1 + var5 <= l.field_c) {
            break L1;
          } else {
            var5 = var5 - (param1 + var5 - l.field_c);
            break L1;
          }
        }
        L2: {
          if (param0 >= l.field_b) {
            break L2;
          } else {
            var9 = l.field_b - param0;
            var6 = var6 - var9;
            param0 = l.field_b;
            var4 = var4 + var9;
            var3 = var3 + var9;
            var8 = var8 + var9;
            var7 = var7 + var9;
            break L2;
          }
        }
        L3: {
          if (param0 + var6 <= l.field_f) {
            break L3;
          } else {
            var9 = param0 + var6 - l.field_f;
            var6 = var6 - var9;
            var8 = var8 + var9;
            var7 = var7 + var9;
            break L3;
          }
        }
        if (var6 <= 0) {
          return;
        } else {
          if (var5 > 0) {
            sg.c(l.field_i, ((sg) this).field_z, 0, var4, var3, var6, var5, var7, var8);
            return;
          } else {
            return;
          }
        }
    }

    sg(int param0, int param1, int param2, int param3, int param4, int param5, int[] param6) {
        super(param0, param1, param2, param3, param4, param5, param6);
    }

    final void b(int param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        L0: {
          param0 = param0 + ((sg) this).field_p;
          param1 = param1 + ((sg) this).field_v;
          var3 = param0 + param1 * l.field_k;
          var4 = 0;
          var5 = ((sg) this).field_t;
          var6 = ((sg) this).field_r;
          var7 = l.field_k - var6;
          var8 = 0;
          if (param1 >= l.field_d) {
            break L0;
          } else {
            var9 = l.field_d - param1;
            var5 = var5 - var9;
            param1 = l.field_d;
            var4 = var4 + var9 * var6;
            var3 = var3 + var9 * l.field_k;
            break L0;
          }
        }
        L1: {
          if (param1 + var5 <= l.field_c) {
            break L1;
          } else {
            var5 = var5 - (param1 + var5 - l.field_c);
            break L1;
          }
        }
        L2: {
          if (param0 >= l.field_b) {
            break L2;
          } else {
            var9 = l.field_b - param0;
            var6 = var6 - var9;
            param0 = l.field_b;
            var4 = var4 + var9;
            var3 = var3 + var9;
            var8 = var8 + var9;
            var7 = var7 + var9;
            break L2;
          }
        }
        L3: {
          if (param0 + var6 <= l.field_f) {
            break L3;
          } else {
            var9 = param0 + var6 - l.field_f;
            var6 = var6 - var9;
            var8 = var8 + var9;
            var7 = var7 + var9;
            break L3;
          }
        }
        if (var6 <= 0) {
          return;
        } else {
          if (var5 > 0) {
            sg.c(l.field_i, ((sg) this).field_z, 0, var4, var3, var6, var5, var7, var8);
            return;
          } else {
            return;
          }
        }
    }

    private final static void f(int[] param0, int[] param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9) {
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
        var10 = param9 >> 16 & 255;
        var11 = param9 >> 8 & 255;
        var12 = param9 & 255;
        var13 = -(param5 >> 2);
        param5 = -(param5 & 3);
        var14 = var13 + var13 + var13 + var13 + param5;
        var15 = -param6;
        L0: while (true) {
          if (var15 >= 0) {
            return;
          } else {
            var16 = var14;
            L1: while (true) {
              if (var16 >= 0) {
                param4 = param4 + param7;
                param3 = param3 + param8;
                var15++;
                continue L0;
              } else {
                int incrementValue$2 = param3;
                param3++;
                param2 = param1[incrementValue$2];
                var17 = param2 >>> 24;
                if (var17 == 0) {
                  param4++;
                  var16++;
                  continue L1;
                } else {
                  L2: {
                    L3: {
                      var19 = param2 >> 16 & 255;
                      var20 = param2 >> 8 & 255;
                      var21 = param2 & 255;
                      if (var19 != var20) {
                        break L3;
                      } else {
                        if (var20 != var21) {
                          break L3;
                        } else {
                          if (var19 > 128) {
                            var18 = (var10 * (256 - var19) + 255 * (var19 - 128) >> 7 << 16) + (var11 * (256 - var20) + 255 * (var20 - 128) >> 7 << 8) + (var12 * (256 - var21) + 255 * (var21 - 128) >> 7);
                            break L2;
                          } else {
                            var18 = (var19 * var10 >> 7 << 16) + (var20 * var11 >> 7 << 8) + (var21 * var12 >> 7);
                            break L2;
                          }
                        }
                      }
                    }
                    var18 = param2;
                    break L2;
                  }
                  var22 = 256 - var17;
                  var23 = param0[param4];
                  int incrementValue$3 = param4;
                  param4++;
                  param0[incrementValue$3] = ((var18 & 16711935) * var17 + (var23 & 16711935) * var22 & -16711936) + ((var18 & 65280) * var17 + (var23 & 65280) * var22 & 16711680) >>> 8;
                  var16++;
                  continue L1;
                }
              }
            }
          }
        }
    }

    final void e(int param0, int param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        L0: {
          param0 = param0 + ((sg) this).field_p;
          param1 = param1 + ((sg) this).field_v;
          var4 = param0 + param1 * l.field_k;
          var5 = 0;
          var6 = ((sg) this).field_t;
          var7 = ((sg) this).field_r;
          var8 = l.field_k - var7;
          var9 = 0;
          if (param1 >= l.field_d) {
            break L0;
          } else {
            var10 = l.field_d - param1;
            var6 = var6 - var10;
            param1 = l.field_d;
            var5 = var5 + var10 * var7;
            var4 = var4 + var10 * l.field_k;
            break L0;
          }
        }
        L1: {
          if (param1 + var6 <= l.field_c) {
            break L1;
          } else {
            var6 = var6 - (param1 + var6 - l.field_c);
            break L1;
          }
        }
        L2: {
          if (param0 >= l.field_b) {
            break L2;
          } else {
            var10 = l.field_b - param0;
            var7 = var7 - var10;
            param0 = l.field_b;
            var5 = var5 + var10;
            var4 = var4 + var10;
            var9 = var9 + var10;
            var8 = var8 + var10;
            break L2;
          }
        }
        L3: {
          if (param0 + var7 <= l.field_f) {
            break L3;
          } else {
            var10 = param0 + var7 - l.field_f;
            var7 = var7 - var10;
            var9 = var9 + var10;
            var8 = var8 + var10;
            break L3;
          }
        }
        if (var7 <= 0) {
          return;
        } else {
          if (var6 > 0) {
            sg.f(l.field_i, ((sg) this).field_z, 0, var5, var4, var7, var6, var8, var9, param2);
            return;
          } else {
            return;
          }
        }
    }

    final void f(int param0, int param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        L0: {
          param0 = param0 + ((sg) this).field_p;
          param1 = param1 + ((sg) this).field_v;
          var4 = param0 + param1 * l.field_k;
          var5 = 0;
          var6 = ((sg) this).field_t;
          var7 = ((sg) this).field_r;
          var8 = l.field_k - var7;
          var9 = 0;
          if (param1 >= l.field_d) {
            break L0;
          } else {
            var10 = l.field_d - param1;
            var6 = var6 - var10;
            param1 = l.field_d;
            var5 = var5 + var10 * var7;
            var4 = var4 + var10 * l.field_k;
            break L0;
          }
        }
        L1: {
          if (param1 + var6 <= l.field_c) {
            break L1;
          } else {
            var6 = var6 - (param1 + var6 - l.field_c);
            break L1;
          }
        }
        L2: {
          if (param0 >= l.field_b) {
            break L2;
          } else {
            var10 = l.field_b - param0;
            var7 = var7 - var10;
            param0 = l.field_b;
            var5 = var5 + var10;
            var4 = var4 + var10;
            var9 = var9 + var10;
            var8 = var8 + var10;
            break L2;
          }
        }
        L3: {
          if (param0 + var7 <= l.field_f) {
            break L3;
          } else {
            var10 = param0 + var7 - l.field_f;
            var7 = var7 - var10;
            var9 = var9 + var10;
            var8 = var8 + var10;
            break L3;
          }
        }
        if (var7 <= 0) {
          return;
        } else {
          if (var6 > 0) {
            sg.c(l.field_i, ((sg) this).field_z, 0, var5, var4, 0, 0, var7, var6, var8, var9, param2);
            return;
          } else {
            return;
          }
        }
    }

    private final static void d(int[] param0, int[] param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11) {
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var18 = 0;
        int var17 = 0;
        int var12 = param3;
        for (var13 = -param8; var13 < 0; var13++) {
            var14 = (param4 >> 16) * param11;
            for (var15 = -param7; var15 < 0; var15++) {
                param2 = param1[(param3 >> 16) + var14];
                var16 = param2 >>> 24;
                if (var16 != 0) {
                    var17 = 256 - var16;
                    var18 = param0[param5];
                    int incrementValue$0 = param5;
                    param5++;
                    param0[incrementValue$0] = ((param2 & 16711935) * var16 + (var18 & 16711935) * var17 & -16711936) + ((param2 & 65280) * var16 + (var18 & 65280) * var17 & 16711680) >>> 8;
                } else {
                    param5++;
                }
                param3 = param3 + param9;
            }
            param4 = param4 + param10;
            param3 = var12;
            param5 = param5 + param6;
        }
    }

    private final static void d(int[] param0, int[] param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9) {
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        var10 = -param6;
        L0: while (true) {
          if (var10 >= 0) {
            return;
          } else {
            var11 = -param5;
            L1: while (true) {
              if (var11 >= 0) {
                param4 = param4 + param7;
                param3 = param3 + param8;
                var10++;
                continue L0;
              } else {
                int incrementValue$66 = param3;
                param3++;
                param2 = param1[incrementValue$66];
                var12 = param2 >>> 24;
                if (var12 == 0) {
                  param4++;
                  var11++;
                  continue L1;
                } else {
                  var13 = param0[param4];
                  var14 = 256 - var12;
                  var15 = (param2 & 16711935) * param9 & -16711936;
                  var16 = (param2 & 65280) * param9 & 16711680;
                  param2 = (var15 | var16) >>> 8;
                  int incrementValue$67 = param4;
                  param4++;
                  param0[incrementValue$67] = ((param2 & 16711935) * var12 + (var13 & 16711935) * var14 & -16711936) + ((param2 & 65280) * var12 + (var13 & 65280) * var14 & 16711680) >>> 8;
                  var11++;
                  continue L1;
                }
              }
            }
          }
        }
    }

    final void a(int param0, int param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        L0: {
          param0 = param0 + ((sg) this).field_p;
          param1 = param1 + ((sg) this).field_v;
          var4 = param0 + param1 * l.field_k;
          var5 = 0;
          var6 = ((sg) this).field_t;
          var7 = ((sg) this).field_r;
          var8 = l.field_k - var7;
          var9 = 0;
          if (param1 >= l.field_d) {
            break L0;
          } else {
            var10 = l.field_d - param1;
            var6 = var6 - var10;
            param1 = l.field_d;
            var5 = var5 + var10 * var7;
            var4 = var4 + var10 * l.field_k;
            break L0;
          }
        }
        L1: {
          if (param1 + var6 <= l.field_c) {
            break L1;
          } else {
            var6 = var6 - (param1 + var6 - l.field_c);
            break L1;
          }
        }
        L2: {
          if (param0 >= l.field_b) {
            break L2;
          } else {
            var10 = l.field_b - param0;
            var7 = var7 - var10;
            param0 = l.field_b;
            var5 = var5 + var10;
            var4 = var4 + var10;
            var9 = var9 + var10;
            var8 = var8 + var10;
            break L2;
          }
        }
        L3: {
          if (param0 + var7 <= l.field_f) {
            break L3;
          } else {
            var10 = param0 + var7 - l.field_f;
            var7 = var7 - var10;
            var9 = var9 + var10;
            var8 = var8 + var10;
            break L3;
          }
        }
        if (var7 <= 0) {
          return;
        } else {
          if (var6 > 0) {
            sg.e(l.field_i, ((sg) this).field_z, 0, var5, var4, var7, var6, var8, var9, param2);
            return;
          } else {
            return;
          }
        }
    }

    private final static void c(int[] param0, int[] param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8) {
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        var9 = -param5;
        var10 = -param6;
        L0: while (true) {
          if (var10 >= 0) {
            return;
          } else {
            var11 = var9;
            L1: while (true) {
              if (var11 >= 0) {
                param4 = param4 + param7;
                param3 = param3 + param8;
                var10++;
                continue L0;
              } else {
                int incrementValue$66 = param3;
                param3++;
                param2 = param1[incrementValue$66];
                var12 = param2 >>> 24;
                if (var12 == 0) {
                  param4++;
                  var11++;
                  continue L1;
                } else {
                  var13 = 256 - var12;
                  var14 = param0[param4];
                  int incrementValue$67 = param4;
                  param4++;
                  param0[incrementValue$67] = ((param2 & 16711935) * var12 + (var14 & 16711935) * var13 & -16711936) + ((param2 & 65280) * var12 + (var14 & 65280) * var13 & 16711680) >>> 8;
                  var11++;
                  continue L1;
                }
              }
            }
          }
        }
    }

    final void f(int param0, int param1) {
        int var3 = 0;
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
        int stackIn_3_0 = 0;
        int stackIn_6_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_12_0 = 0;
        int[] stackIn_19_0 = null;
        int stackIn_19_1 = 0;
        int[] stackIn_20_0 = null;
        int stackIn_20_1 = 0;
        int[] stackIn_21_0 = null;
        int stackIn_21_1 = 0;
        int stackIn_21_2 = 0;
        int stackOut_2_0 = 0;
        int stackOut_1_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_10_0 = 0;
        int[] stackOut_18_0 = null;
        int stackOut_18_1 = 0;
        int[] stackOut_20_0 = null;
        int stackOut_20_1 = 0;
        int stackOut_20_2 = 0;
        int[] stackOut_19_0 = null;
        int stackOut_19_1 = 0;
        int stackOut_19_2 = 0;
        L0: {
          var3 = ((sg) this).field_r >> 1;
          var4 = ((sg) this).field_t >> 1;
          param0 = param0 + ((sg) this).field_p / 2;
          param1 = param1 + ((sg) this).field_v / 2;
          if (param0 >= l.field_b) {
            stackOut_2_0 = 0;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          } else {
            stackOut_1_0 = l.field_b - param0 << 1;
            stackIn_3_0 = stackOut_1_0;
            break L0;
          }
        }
        L1: {
          var5 = stackIn_3_0;
          if (param0 + var3 <= l.field_f) {
            stackOut_5_0 = ((sg) this).field_r - 2;
            stackIn_6_0 = stackOut_5_0;
            break L1;
          } else {
            stackOut_4_0 = (l.field_f - param0 << 1) - 2;
            stackIn_6_0 = stackOut_4_0;
            break L1;
          }
        }
        L2: {
          var6 = stackIn_6_0;
          if (param1 >= l.field_d) {
            stackOut_8_0 = 0;
            stackIn_9_0 = stackOut_8_0;
            break L2;
          } else {
            stackOut_7_0 = l.field_d - param1 << 1;
            stackIn_9_0 = stackOut_7_0;
            break L2;
          }
        }
        L3: {
          var7 = stackIn_9_0;
          if (param1 + var4 <= l.field_c) {
            stackOut_11_0 = ((sg) this).field_t - 2;
            stackIn_12_0 = stackOut_11_0;
            break L3;
          } else {
            stackOut_10_0 = (l.field_c - param1 << 1) - 2;
            stackIn_12_0 = stackOut_10_0;
            break L3;
          }
        }
        var8 = stackIn_12_0;
        var9 = var7;
        L4: while (true) {
          if (var9 > var8) {
            return;
          } else {
            var10 = var9 * ((sg) this).field_r + var5;
            var11 = (param1 + (var9 >> 1)) * l.field_k + (param0 + (var5 >> 1));
            var12 = var5;
            L5: while (true) {
              if (var12 > var6) {
                var9 += 2;
                continue L4;
              } else {
                var13 = 0;
                var14 = 0;
                var15 = 0;
                var16 = 0;
                var17 = 0;
                var18 = 0;
                var19 = 0;
                L6: while (true) {
                  if (var19 >= 4) {
                    if (var18 != 0) {
                      var15 = (var15 / var18 << 16) + var17 / var18;
                      var16 = var16 / var18 << 8;
                      var19 = var18 >> 2;
                      var20 = 256 - var19;
                      var21 = l.field_i[var11];
                      l.field_i[var11] = (var19 * var15 + var20 * (var21 & 16711935) & -16711936) + (var19 * var16 + var20 * (var21 & 65280) & 16711680) >>> 8;
                      var12 += 2;
                      var11++;
                      var10 += 2;
                      continue L5;
                    } else {
                      var12 += 2;
                      var11++;
                      var10 += 2;
                      continue L5;
                    }
                  } else {
                    L7: {
                      stackOut_18_0 = ((sg) this).field_z;
                      stackOut_18_1 = var10 + (var19 & 1);
                      stackIn_20_0 = stackOut_18_0;
                      stackIn_20_1 = stackOut_18_1;
                      stackIn_19_0 = stackOut_18_0;
                      stackIn_19_1 = stackOut_18_1;
                      if ((var19 & 2) != 0) {
                        stackOut_20_0 = (int[]) (Object) stackIn_20_0;
                        stackOut_20_1 = stackIn_20_1;
                        stackOut_20_2 = 0;
                        stackIn_21_0 = stackOut_20_0;
                        stackIn_21_1 = stackOut_20_1;
                        stackIn_21_2 = stackOut_20_2;
                        break L7;
                      } else {
                        stackOut_19_0 = (int[]) (Object) stackIn_19_0;
                        stackOut_19_1 = stackIn_19_1;
                        stackOut_19_2 = ((sg) this).field_r;
                        stackIn_21_0 = stackOut_19_0;
                        stackIn_21_1 = stackOut_19_1;
                        stackIn_21_2 = stackOut_19_2;
                        break L7;
                      }
                    }
                    var13 = stackIn_21_0[stackIn_21_1 + stackIn_21_2];
                    var14 = var13 >>> 24;
                    var18 = var18 + var14;
                    var15 = var15 + var14 * (var13 >> 16 & 255);
                    var16 = var16 + var14 * (var13 >> 8 & 255);
                    var17 = var17 + var14 * (var13 & 255);
                    var19++;
                    continue L6;
                  }
                }
              }
            }
          }
        }
    }

    sg(int param0, int param1) {
        super(param0, param1);
    }

    final void a(int param0, int param1, int param2, int param3) {
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
        if (param2 <= 0) {
          return;
        } else {
          if (param3 > 0) {
            L0: {
              var5 = ((sg) this).field_r;
              var6 = ((sg) this).field_t;
              var7 = 0;
              var8 = 0;
              var9 = ((sg) this).field_q;
              var10 = ((sg) this).field_u;
              var11 = (var9 << 16) / param2;
              var12 = (var10 << 16) / param3;
              if (((sg) this).field_p <= 0) {
                break L0;
              } else {
                var13 = ((((sg) this).field_p << 16) + var11 - 1) / var11;
                param0 = param0 + var13;
                var7 = var7 + (var13 * var11 - (((sg) this).field_p << 16));
                break L0;
              }
            }
            L1: {
              if (((sg) this).field_v <= 0) {
                break L1;
              } else {
                var13 = ((((sg) this).field_v << 16) + var12 - 1) / var12;
                param1 = param1 + var13;
                var8 = var8 + (var13 * var12 - (((sg) this).field_v << 16));
                break L1;
              }
            }
            L2: {
              if (var5 >= var9) {
                break L2;
              } else {
                param2 = ((var5 << 16) - var7 + var11 - 1) / var11;
                break L2;
              }
            }
            L3: {
              if (var6 >= var10) {
                break L3;
              } else {
                param3 = ((var6 << 16) - var8 + var12 - 1) / var12;
                break L3;
              }
            }
            L4: {
              var13 = param0 + param1 * l.field_k;
              var14 = l.field_k - param2;
              if (param1 + param3 <= l.field_c) {
                break L4;
              } else {
                param3 = param3 - (param1 + param3 - l.field_c);
                break L4;
              }
            }
            L5: {
              if (param1 >= l.field_d) {
                break L5;
              } else {
                var15 = l.field_d - param1;
                param3 = param3 - var15;
                var13 = var13 + var15 * l.field_k;
                var8 = var8 + var12 * var15;
                break L5;
              }
            }
            L6: {
              if (param0 + param2 <= l.field_f) {
                break L6;
              } else {
                var15 = param0 + param2 - l.field_f;
                param2 = param2 - var15;
                var14 = var14 + var15;
                break L6;
              }
            }
            L7: {
              if (param0 >= l.field_b) {
                break L7;
              } else {
                var15 = l.field_b - param0;
                param2 = param2 - var15;
                var13 = var13 + var15;
                var7 = var7 + var11 * var15;
                var14 = var14 + var15;
                break L7;
              }
            }
            sg.d(l.field_i, ((sg) this).field_z, 0, var7, var8, var13, var14, param2, param3, var11, var12, var5);
            return;
          } else {
            return;
          }
        }
    }

    final void d(int param0, int param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        L0: {
          param0 = param0 + ((sg) this).field_p;
          param1 = param1 + ((sg) this).field_v;
          var4 = param0 + param1 * l.field_k;
          var5 = 0;
          var6 = ((sg) this).field_t;
          var7 = ((sg) this).field_r;
          var8 = l.field_k - var7;
          var9 = 0;
          if (param1 >= l.field_d) {
            break L0;
          } else {
            var10 = l.field_d - param1;
            var6 = var6 - var10;
            param1 = l.field_d;
            var5 = var5 + var10 * var7;
            var4 = var4 + var10 * l.field_k;
            break L0;
          }
        }
        L1: {
          if (param1 + var6 <= l.field_c) {
            break L1;
          } else {
            var6 = var6 - (param1 + var6 - l.field_c);
            break L1;
          }
        }
        L2: {
          if (param0 >= l.field_b) {
            break L2;
          } else {
            var10 = l.field_b - param0;
            var7 = var7 - var10;
            param0 = l.field_b;
            var5 = var5 + var10;
            var4 = var4 + var10;
            var9 = var9 + var10;
            var8 = var8 + var10;
            break L2;
          }
        }
        L3: {
          if (param0 + var7 <= l.field_f) {
            break L3;
          } else {
            var10 = param0 + var7 - l.field_f;
            var7 = var7 - var10;
            var9 = var9 + var10;
            var8 = var8 + var10;
            break L3;
          }
        }
        if (var7 <= 0) {
          return;
        } else {
          if (var6 > 0) {
            sg.b(0, 0, 0, l.field_i, ((sg) this).field_z, var5, 0, var4, 0, var7, var6, var8, var9, param2);
            return;
          } else {
            return;
          }
        }
    }
}
