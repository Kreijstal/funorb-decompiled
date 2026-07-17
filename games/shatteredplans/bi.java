/*
 * Decompiled by CFR-JS 0.4.0.
 */
class bi extends ii {
    int[] field_B;

    private final static void a(int[] param0, int[] param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9) {
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
                int incrementValue$4 = param3;
                param3++;
                param2 = param1[incrementValue$4];
                if (param2 == 0) {
                  param4++;
                  var16++;
                  continue L1;
                } else {
                  L2: {
                    var17 = param2 >> 16 & 255;
                    var18 = param2 >> 8 & 255;
                    var19 = param2 & 255;
                    if (var17 != var18) {
                      break L2;
                    } else {
                      if (var18 != var19) {
                        break L2;
                      } else {
                        if (var17 > 128) {
                          int incrementValue$5 = param4;
                          param4++;
                          param0[incrementValue$5] = (var10 * (256 - var17) + 255 * (var17 - 128) >> 7 << 16) + (var11 * (256 - var18) + 255 * (var18 - 128) >> 7 << 8) + (var12 * (256 - var19) + 255 * (var19 - 128) >> 7);
                          var16++;
                          continue L1;
                        } else {
                          int incrementValue$6 = param4;
                          param4++;
                          param0[incrementValue$6] = (var17 * var10 >> 7 << 16) + (var18 * var11 >> 7 << 8) + (var19 * var12 >> 7);
                          var16++;
                          continue L1;
                        }
                      }
                    }
                  }
                  int incrementValue$7 = param4;
                  param4++;
                  param0[incrementValue$7] = param2;
                  var16++;
                  continue L1;
                }
              }
            }
          }
        }
    }

    private final static void a(int param0, int param1, int param2, int param3, int[] param4, int[] param5, int param6, int param7, int param8, int param9, int param10, int param11, int param12, int param13, int param14, int param15) {
        int var16 = param3;
        while (param8 < 0) {
            param7 = (param9 >> 16) * param15;
            for (param6 = -param12; param6 < 0; param6++) {
                param0 = param4[(param3 >> 16) + param7];
                if (param0 != 0) {
                    param1 = param5[param10];
                    param2 = param0 + param1;
                    param0 = (param0 & 16711935) + (param1 & 16711935);
                    param1 = (param0 & 16777472) + (param2 - param0 & 65536);
                    int incrementValue$0 = param10;
                    param10++;
                    param5[incrementValue$0] = param2 - param1 | param1 - (param1 >>> 8);
                } else {
                    param10++;
                }
                param3 = param3 + param13;
            }
            param9 = param9 + param14;
            param3 = var16;
            param10 = param10 + param11;
            param8++;
        }
    }

    final void d() {
        int var1 = 0;
        int var2 = ((bi) this).field_z * ((bi) this).field_w;
        int[] var3 = new int[var2];
        while (var2 > 0) {
            int incrementValue$0 = var1;
            var1++;
            var2--;
            var3[incrementValue$0] = ((bi) this).field_B[var2];
        }
        ((bi) this).field_B = var3;
        ((bi) this).field_t = ((bi) this).field_o - ((bi) this).field_z - ((bi) this).field_t;
        ((bi) this).field_x = ((bi) this).field_p - ((bi) this).field_w - ((bi) this).field_x;
    }

    void a(int param0, int param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        L0: {
          param0 = param0 + ((bi) this).field_t;
          param1 = param1 + ((bi) this).field_x;
          var4 = param0 + param1 * gf.field_b;
          var5 = 0;
          var6 = ((bi) this).field_w;
          var7 = ((bi) this).field_z;
          var8 = gf.field_b - var7;
          var9 = 0;
          if (param1 >= gf.field_a) {
            break L0;
          } else {
            var10 = gf.field_a - param1;
            var6 = var6 - var10;
            param1 = gf.field_a;
            var5 = var5 + var10 * var7;
            var4 = var4 + var10 * gf.field_b;
            break L0;
          }
        }
        L1: {
          if (param1 + var6 <= gf.field_f) {
            break L1;
          } else {
            var6 = var6 - (param1 + var6 - gf.field_f);
            break L1;
          }
        }
        L2: {
          if (param0 >= gf.field_i) {
            break L2;
          } else {
            var10 = gf.field_i - param0;
            var7 = var7 - var10;
            param0 = gf.field_i;
            var5 = var5 + var10;
            var4 = var4 + var10;
            var9 = var9 + var10;
            var8 = var8 + var10;
            break L2;
          }
        }
        L3: {
          if (param0 + var7 <= gf.field_l) {
            break L3;
          } else {
            var10 = param0 + var7 - gf.field_l;
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
            bi.b(gf.field_h, ((bi) this).field_B, 0, var5, var4, var7, var6, var8, var9, param2);
            return;
          } else {
            return;
          }
        }
    }

    void a(int param0, int param1, int param2, int param3, int param4, int param5) {
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
        if (param5 != 0) {
          L0: {
            param0 = param0 - (((bi) this).field_t << 4);
            param1 = param1 - (((bi) this).field_x << 4);
            var7 = (double)(param4 & 65535) * 0.00009587379924285257;
            var9 = (int)Math.floor(Math.sin(var7) * (double)param5 + 0.5);
            var10 = (int)Math.floor(Math.cos(var7) * (double)param5 + 0.5);
            var11 = -param0 * var10 + -param1 * var9;
            var12 = --param0 * var9 + -param1 * var10;
            var13 = ((((bi) this).field_z << 4) - param0) * var10 + -param1 * var9;
            var14 = -((((bi) this).field_z << 4) - param0) * var9 + -param1 * var10;
            var15 = -param0 * var10 + ((((bi) this).field_w << 4) - param1) * var9;
            var16 = --param0 * var9 + ((((bi) this).field_w << 4) - param1) * var10;
            var17 = ((((bi) this).field_z << 4) - param0) * var10 + ((((bi) this).field_w << 4) - param1) * var9;
            var18 = -((((bi) this).field_z << 4) - param0) * var9 + ((((bi) this).field_w << 4) - param1) * var10;
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
            if (var19 >= gf.field_i) {
              break L10;
            } else {
              var19 = gf.field_i;
              break L10;
            }
          }
          L11: {
            if (var20 <= gf.field_l) {
              break L11;
            } else {
              var20 = gf.field_l;
              break L11;
            }
          }
          L12: {
            if (var21 >= gf.field_a) {
              break L12;
            } else {
              var21 = gf.field_a;
              break L12;
            }
          }
          L13: {
            if (var22 <= gf.field_f) {
              break L13;
            } else {
              var22 = gf.field_f;
              break L13;
            }
          }
          var20 = var19 - var20;
          if (var20 < 0) {
            var22 = var21 - var22;
            if (var22 < 0) {
              L14: {
                var23 = var21 * gf.field_b + var19;
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
                              var32 = (1 + var35 - (((bi) this).field_z << 12) - var27) / var27;
                              if ((1 + var35 - (((bi) this).field_z << 12) - var27) / var27 <= var37) {
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
                              var32 = (1 + var36 - (((bi) this).field_w << 12) - var26) / var26;
                              if ((1 + var36 - (((bi) this).field_w << 12) - var26) / var26 <= var37) {
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
                                var23 = var23 + gf.field_b;
                                continue L15;
                              } else {
                                L21: {
                                  var38 = ((bi) this).field_B[(var36 >> 12) * ((bi) this).field_z + (var35 >> 12)];
                                  if (var38 == 0) {
                                    var34++;
                                    break L21;
                                  } else {
                                    int incrementValue$9 = var34;
                                    var34++;
                                    gf.field_h[incrementValue$9] = var38;
                                    break L21;
                                  }
                                }
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
                        L22: while (true) {
                          if (var33 >= 0) {
                            break L14;
                          } else {
                            L23: {
                              var34 = var23;
                              var35 = var30 + (var28 * var27 >> 4);
                              var36 = var31 + (var28 * var26 >> 4);
                              var37 = var20;
                              if (var35 >= 0) {
                                break L23;
                              } else {
                                var32 = (var27 - 1 - var35) / var27;
                                var37 = var37 + var32;
                                var35 = var35 + var27 * var32;
                                var36 = var36 + var26 * var32;
                                var34 = var34 + var32;
                                break L23;
                              }
                            }
                            L24: {
                              var32 = (1 + var35 - (((bi) this).field_z << 12) - var27) / var27;
                              if ((1 + var35 - (((bi) this).field_z << 12) - var27) / var27 <= var37) {
                                break L24;
                              } else {
                                var37 = var32;
                                break L24;
                              }
                            }
                            L25: {
                              var32 = var36 - (((bi) this).field_w << 12);
                              if (var36 - (((bi) this).field_w << 12) < 0) {
                                break L25;
                              } else {
                                var32 = (var26 - var32) / var26;
                                var37 = var37 + var32;
                                var35 = var35 + var27 * var32;
                                var36 = var36 + var26 * var32;
                                var34 = var34 + var32;
                                break L25;
                              }
                            }
                            L26: {
                              var32 = (var36 - var26) / var26;
                              if ((var36 - var26) / var26 <= var37) {
                                break L26;
                              } else {
                                var37 = var32;
                                break L26;
                              }
                            }
                            L27: while (true) {
                              if (var37 >= 0) {
                                var33++;
                                var30 = var30 - var26;
                                var31 = var31 + var27;
                                var23 = var23 + gf.field_b;
                                continue L22;
                              } else {
                                L28: {
                                  var38 = ((bi) this).field_B[(var36 >> 12) * ((bi) this).field_z + (var35 >> 12)];
                                  if (var38 == 0) {
                                    var34++;
                                    break L28;
                                  } else {
                                    int incrementValue$10 = var34;
                                    var34++;
                                    gf.field_h[incrementValue$10] = var38;
                                    break L28;
                                  }
                                }
                                var35 = var35 + var27;
                                var36 = var36 + var26;
                                var37++;
                                continue L27;
                              }
                            }
                          }
                        }
                      }
                    } else {
                      var33 = var22;
                      L29: while (true) {
                        if (var33 >= 0) {
                          break L14;
                        } else {
                          L30: {
                            var34 = var23;
                            var35 = var30 + (var28 * var27 >> 4);
                            var36 = var31;
                            var37 = var20;
                            if (var36 >= 0) {
                              if (var36 - (((bi) this).field_w << 12) < 0) {
                                L31: {
                                  if (var35 >= 0) {
                                    break L31;
                                  } else {
                                    var32 = (var27 - 1 - var35) / var27;
                                    var37 = var37 + var32;
                                    var35 = var35 + var27 * var32;
                                    var34 = var34 + var32;
                                    break L31;
                                  }
                                }
                                L32: {
                                  var32 = (1 + var35 - (((bi) this).field_z << 12) - var27) / var27;
                                  if ((1 + var35 - (((bi) this).field_z << 12) - var27) / var27 <= var37) {
                                    break L32;
                                  } else {
                                    var37 = var32;
                                    break L32;
                                  }
                                }
                                L33: while (true) {
                                  if (var37 >= 0) {
                                    break L30;
                                  } else {
                                    L34: {
                                      var38 = ((bi) this).field_B[(var36 >> 12) * ((bi) this).field_z + (var35 >> 12)];
                                      if (var38 == 0) {
                                        var34++;
                                        break L34;
                                      } else {
                                        int incrementValue$11 = var34;
                                        var34++;
                                        gf.field_h[incrementValue$11] = var38;
                                        break L34;
                                      }
                                    }
                                    var35 = var35 + var27;
                                    var37++;
                                    continue L33;
                                  }
                                }
                              } else {
                                break L30;
                              }
                            } else {
                              break L30;
                            }
                          }
                          var33++;
                          var31 = var31 + var27;
                          var23 = var23 + gf.field_b;
                          continue L29;
                        }
                      }
                    }
                  } else {
                    if (var26 != 0) {
                      if (var26 >= 0) {
                        var33 = var22;
                        L35: while (true) {
                          if (var33 >= 0) {
                            break L14;
                          } else {
                            L36: {
                              var34 = var23;
                              var35 = var30 + (var28 * var27 >> 4);
                              var36 = var31 + (var28 * var26 >> 4);
                              var37 = var20;
                              var32 = var35 - (((bi) this).field_z << 12);
                              if (var35 - (((bi) this).field_z << 12) < 0) {
                                break L36;
                              } else {
                                var32 = (var27 - var32) / var27;
                                var37 = var37 + var32;
                                var35 = var35 + var27 * var32;
                                var36 = var36 + var26 * var32;
                                var34 = var34 + var32;
                                break L36;
                              }
                            }
                            L37: {
                              var32 = (var35 - var27) / var27;
                              if ((var35 - var27) / var27 <= var37) {
                                break L37;
                              } else {
                                var37 = var32;
                                break L37;
                              }
                            }
                            L38: {
                              if (var36 >= 0) {
                                break L38;
                              } else {
                                var32 = (var26 - 1 - var36) / var26;
                                var37 = var37 + var32;
                                var35 = var35 + var27 * var32;
                                var36 = var36 + var26 * var32;
                                var34 = var34 + var32;
                                break L38;
                              }
                            }
                            L39: {
                              var32 = (1 + var36 - (((bi) this).field_w << 12) - var26) / var26;
                              if ((1 + var36 - (((bi) this).field_w << 12) - var26) / var26 <= var37) {
                                break L39;
                              } else {
                                var37 = var32;
                                break L39;
                              }
                            }
                            L40: while (true) {
                              if (var37 >= 0) {
                                var33++;
                                var30 = var30 - var26;
                                var31 = var31 + var27;
                                var23 = var23 + gf.field_b;
                                continue L35;
                              } else {
                                L41: {
                                  var38 = ((bi) this).field_B[(var36 >> 12) * ((bi) this).field_z + (var35 >> 12)];
                                  if (var38 == 0) {
                                    var34++;
                                    break L41;
                                  } else {
                                    int incrementValue$12 = var34;
                                    var34++;
                                    gf.field_h[incrementValue$12] = var38;
                                    break L41;
                                  }
                                }
                                var35 = var35 + var27;
                                var36 = var36 + var26;
                                var37++;
                                continue L40;
                              }
                            }
                          }
                        }
                      } else {
                        var33 = var22;
                        L42: while (true) {
                          if (var33 >= 0) {
                            break L14;
                          } else {
                            L43: {
                              var34 = var23;
                              var35 = var30 + (var28 * var27 >> 4);
                              var36 = var31 + (var28 * var26 >> 4);
                              var37 = var20;
                              var32 = var35 - (((bi) this).field_z << 12);
                              if (var35 - (((bi) this).field_z << 12) < 0) {
                                break L43;
                              } else {
                                var32 = (var27 - var32) / var27;
                                var37 = var37 + var32;
                                var35 = var35 + var27 * var32;
                                var36 = var36 + var26 * var32;
                                var34 = var34 + var32;
                                break L43;
                              }
                            }
                            L44: {
                              var32 = (var35 - var27) / var27;
                              if ((var35 - var27) / var27 <= var37) {
                                break L44;
                              } else {
                                var37 = var32;
                                break L44;
                              }
                            }
                            L45: {
                              var32 = var36 - (((bi) this).field_w << 12);
                              if (var36 - (((bi) this).field_w << 12) < 0) {
                                break L45;
                              } else {
                                var32 = (var26 - var32) / var26;
                                var37 = var37 + var32;
                                var35 = var35 + var27 * var32;
                                var36 = var36 + var26 * var32;
                                var34 = var34 + var32;
                                break L45;
                              }
                            }
                            L46: {
                              var32 = (var36 - var26) / var26;
                              if ((var36 - var26) / var26 <= var37) {
                                break L46;
                              } else {
                                var37 = var32;
                                break L46;
                              }
                            }
                            L47: while (true) {
                              if (var37 >= 0) {
                                var33++;
                                var30 = var30 - var26;
                                var31 = var31 + var27;
                                var23 = var23 + gf.field_b;
                                continue L42;
                              } else {
                                L48: {
                                  var38 = ((bi) this).field_B[(var36 >> 12) * ((bi) this).field_z + (var35 >> 12)];
                                  if (var38 == 0) {
                                    var34++;
                                    break L48;
                                  } else {
                                    int incrementValue$13 = var34;
                                    var34++;
                                    gf.field_h[incrementValue$13] = var38;
                                    break L48;
                                  }
                                }
                                var35 = var35 + var27;
                                var36 = var36 + var26;
                                var37++;
                                continue L47;
                              }
                            }
                          }
                        }
                      }
                    } else {
                      var33 = var22;
                      L49: while (true) {
                        if (var33 >= 0) {
                          break L14;
                        } else {
                          L50: {
                            var34 = var23;
                            var35 = var30 + (var28 * var27 >> 4);
                            var36 = var31;
                            var37 = var20;
                            if (var36 >= 0) {
                              if (var36 - (((bi) this).field_w << 12) < 0) {
                                L51: {
                                  var32 = var35 - (((bi) this).field_z << 12);
                                  if (var35 - (((bi) this).field_z << 12) < 0) {
                                    break L51;
                                  } else {
                                    var32 = (var27 - var32) / var27;
                                    var37 = var37 + var32;
                                    var35 = var35 + var27 * var32;
                                    var34 = var34 + var32;
                                    break L51;
                                  }
                                }
                                L52: {
                                  var32 = (var35 - var27) / var27;
                                  if ((var35 - var27) / var27 <= var37) {
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
                                    L54: {
                                      var38 = ((bi) this).field_B[(var36 >> 12) * ((bi) this).field_z + (var35 >> 12)];
                                      if (var38 == 0) {
                                        var34++;
                                        break L54;
                                      } else {
                                        int incrementValue$14 = var34;
                                        var34++;
                                        gf.field_h[incrementValue$14] = var38;
                                        break L54;
                                      }
                                    }
                                    var35 = var35 + var27;
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
                          var31 = var31 + var27;
                          var23 = var23 + gf.field_b;
                          continue L49;
                        }
                      }
                    }
                  }
                } else {
                  if (var26 != 0) {
                    if (var26 >= 0) {
                      var33 = var22;
                      L55: while (true) {
                        if (var33 >= 0) {
                          break L14;
                        } else {
                          L56: {
                            var34 = var23;
                            var35 = var30;
                            var36 = var31 + (var28 * var26 >> 4);
                            var37 = var20;
                            if (var35 >= 0) {
                              if (var35 - (((bi) this).field_z << 12) < 0) {
                                L57: {
                                  if (var36 >= 0) {
                                    break L57;
                                  } else {
                                    var32 = (var26 - 1 - var36) / var26;
                                    var37 = var37 + var32;
                                    var36 = var36 + var26 * var32;
                                    var34 = var34 + var32;
                                    break L57;
                                  }
                                }
                                L58: {
                                  var32 = (1 + var36 - (((bi) this).field_w << 12) - var26) / var26;
                                  if ((1 + var36 - (((bi) this).field_w << 12) - var26) / var26 <= var37) {
                                    break L58;
                                  } else {
                                    var37 = var32;
                                    break L58;
                                  }
                                }
                                L59: while (true) {
                                  if (var37 >= 0) {
                                    break L56;
                                  } else {
                                    L60: {
                                      var38 = ((bi) this).field_B[(var36 >> 12) * ((bi) this).field_z + (var35 >> 12)];
                                      if (var38 == 0) {
                                        var34++;
                                        break L60;
                                      } else {
                                        int incrementValue$15 = var34;
                                        var34++;
                                        gf.field_h[incrementValue$15] = var38;
                                        break L60;
                                      }
                                    }
                                    var36 = var36 + var26;
                                    var37++;
                                    continue L59;
                                  }
                                }
                              } else {
                                break L56;
                              }
                            } else {
                              break L56;
                            }
                          }
                          var33++;
                          var30 = var30 - var26;
                          var23 = var23 + gf.field_b;
                          continue L55;
                        }
                      }
                    } else {
                      var33 = var22;
                      L61: while (true) {
                        if (var33 >= 0) {
                          break L14;
                        } else {
                          L62: {
                            var34 = var23;
                            var35 = var30;
                            var36 = var31 + (var28 * var26 >> 4);
                            var37 = var20;
                            if (var35 >= 0) {
                              if (var35 - (((bi) this).field_z << 12) < 0) {
                                L63: {
                                  var32 = var36 - (((bi) this).field_w << 12);
                                  if (var36 - (((bi) this).field_w << 12) < 0) {
                                    break L63;
                                  } else {
                                    var32 = (var26 - var32) / var26;
                                    var37 = var37 + var32;
                                    var36 = var36 + var26 * var32;
                                    var34 = var34 + var32;
                                    break L63;
                                  }
                                }
                                L64: {
                                  var32 = (var36 - var26) / var26;
                                  if ((var36 - var26) / var26 <= var37) {
                                    break L64;
                                  } else {
                                    var37 = var32;
                                    break L64;
                                  }
                                }
                                L65: while (true) {
                                  if (var37 >= 0) {
                                    break L62;
                                  } else {
                                    L66: {
                                      var38 = ((bi) this).field_B[(var36 >> 12) * ((bi) this).field_z + (var35 >> 12)];
                                      if (var38 == 0) {
                                        var34++;
                                        break L66;
                                      } else {
                                        int incrementValue$16 = var34;
                                        var34++;
                                        gf.field_h[incrementValue$16] = var38;
                                        break L66;
                                      }
                                    }
                                    var36 = var36 + var26;
                                    var37++;
                                    continue L65;
                                  }
                                }
                              } else {
                                var33++;
                                var30 = var30 - var26;
                                var23 = var23 + gf.field_b;
                                continue L61;
                              }
                            } else {
                              break L62;
                            }
                          }
                          var33++;
                          var30 = var30 - var26;
                          var23 = var23 + gf.field_b;
                          continue L61;
                        }
                      }
                    }
                  } else {
                    var33 = var22;
                    L67: while (true) {
                      if (var33 >= 0) {
                        return;
                      } else {
                        var34 = var23;
                        var35 = var30;
                        var36 = var31;
                        var37 = var20;
                        if (var35 >= 0) {
                          L68: {
                            if (var36 >= 0) {
                              if (var35 - (((bi) this).field_z << 12) < 0) {
                                if (var36 - (((bi) this).field_w << 12) < 0) {
                                  L69: while (true) {
                                    if (var37 >= 0) {
                                      break L68;
                                    } else {
                                      var38 = ((bi) this).field_B[(var36 >> 12) * ((bi) this).field_z + (var35 >> 12)];
                                      if (var38 == 0) {
                                        var34++;
                                        var37++;
                                        continue L69;
                                      } else {
                                        int incrementValue$17 = var34;
                                        var34++;
                                        gf.field_h[incrementValue$17] = var38;
                                        var37++;
                                        continue L69;
                                      }
                                    }
                                  }
                                } else {
                                  break L68;
                                }
                              } else {
                                break L68;
                              }
                            } else {
                              break L68;
                            }
                          }
                          var33++;
                          var23 = var23 + gf.field_b;
                          continue L67;
                        } else {
                          var33++;
                          var23 = var23 + gf.field_b;
                          continue L67;
                        }
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

    final void e(int param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        L0: {
          param0 = param0 + ((bi) this).field_t;
          param1 = param1 + ((bi) this).field_x;
          var3 = param0 + param1 * gf.field_b;
          var4 = 0;
          var5 = ((bi) this).field_w;
          var6 = ((bi) this).field_z;
          var7 = gf.field_b - var6;
          var8 = 0;
          if (param1 >= gf.field_a) {
            break L0;
          } else {
            var9 = gf.field_a - param1;
            var5 = var5 - var9;
            param1 = gf.field_a;
            var4 = var4 + var9 * var6;
            var3 = var3 + var9 * gf.field_b;
            break L0;
          }
        }
        L1: {
          if (param1 + var5 <= gf.field_f) {
            break L1;
          } else {
            var5 = var5 - (param1 + var5 - gf.field_f);
            break L1;
          }
        }
        L2: {
          if (param0 >= gf.field_i) {
            break L2;
          } else {
            var9 = gf.field_i - param0;
            var6 = var6 - var9;
            param0 = gf.field_i;
            var4 = var4 + var9;
            var3 = var3 + var9;
            var8 = var8 + var9;
            var7 = var7 + var9;
            break L2;
          }
        }
        L3: {
          if (param0 + var6 <= gf.field_l) {
            break L3;
          } else {
            var9 = param0 + var6 - gf.field_l;
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
            bi.a(0, gf.field_h, ((bi) this).field_B, 0, var4, var3, var6, var5, var7, var8);
            return;
          } else {
            return;
          }
        }
    }

    private final static void a(int[] param0, int[] param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8) {
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        var9 = -(param5 >> 2);
        param5 = -(param5 & 3);
        var10 = -param6;
        L0: while (true) {
          if (var10 >= 0) {
            return;
          } else {
            var11 = var9;
            L1: while (true) {
              if (var11 >= 0) {
                var11 = param5;
                L2: while (true) {
                  if (var11 >= 0) {
                    param4 = param4 + param7;
                    param3 = param3 + param8;
                    var10++;
                    continue L0;
                  } else {
                    int incrementValue$218 = param3;
                    param3++;
                    param2 = param1[incrementValue$218];
                    if (param2 == 0) {
                      param4++;
                      var11++;
                      continue L2;
                    } else {
                      int incrementValue$219 = param4;
                      param4++;
                      param0[incrementValue$219] = param2;
                      var11++;
                      continue L2;
                    }
                  }
                }
              } else {
                L3: {
                  int incrementValue$220 = param3;
                  param3++;
                  param2 = param1[incrementValue$220];
                  if (param2 == 0) {
                    param4++;
                    break L3;
                  } else {
                    int incrementValue$221 = param4;
                    param4++;
                    param0[incrementValue$221] = param2;
                    break L3;
                  }
                }
                L4: {
                  int incrementValue$222 = param3;
                  param3++;
                  param2 = param1[incrementValue$222];
                  if (param2 == 0) {
                    param4++;
                    break L4;
                  } else {
                    int incrementValue$223 = param4;
                    param4++;
                    param0[incrementValue$223] = param2;
                    break L4;
                  }
                }
                L5: {
                  int incrementValue$224 = param3;
                  param3++;
                  param2 = param1[incrementValue$224];
                  if (param2 == 0) {
                    param4++;
                    break L5;
                  } else {
                    int incrementValue$225 = param4;
                    param4++;
                    param0[incrementValue$225] = param2;
                    break L5;
                  }
                }
                int incrementValue$226 = param3;
                param3++;
                param2 = param1[incrementValue$226];
                if (param2 == 0) {
                  param4++;
                  var11++;
                  continue L1;
                } else {
                  int incrementValue$227 = param4;
                  param4++;
                  param0[incrementValue$227] = param2;
                  var11++;
                  continue L1;
                }
              }
            }
          }
        }
    }

    void d(int param0, int param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        L0: {
          param0 = param0 + ((bi) this).field_t;
          param1 = param1 + ((bi) this).field_x;
          var4 = param0 + param1 * gf.field_b;
          var5 = 0;
          var6 = ((bi) this).field_w;
          var7 = ((bi) this).field_z;
          var8 = gf.field_b - var7;
          var9 = 0;
          if (param1 >= gf.field_a) {
            break L0;
          } else {
            var10 = gf.field_a - param1;
            var6 = var6 - var10;
            param1 = gf.field_a;
            var5 = var5 + var10 * var7;
            var4 = var4 + var10 * gf.field_b;
            break L0;
          }
        }
        L1: {
          if (param1 + var6 <= gf.field_f) {
            break L1;
          } else {
            var6 = var6 - (param1 + var6 - gf.field_f);
            break L1;
          }
        }
        L2: {
          if (param0 >= gf.field_i) {
            break L2;
          } else {
            var10 = gf.field_i - param0;
            var7 = var7 - var10;
            param0 = gf.field_i;
            var5 = var5 + var10;
            var4 = var4 + var10;
            var9 = var9 + var10;
            var8 = var8 + var10;
            break L2;
          }
        }
        L3: {
          if (param0 + var7 <= gf.field_l) {
            break L3;
          } else {
            var10 = param0 + var7 - gf.field_l;
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
            bi.a(gf.field_h, ((bi) this).field_B, 0, var5, var4, var7, var6, var8, var9, param2);
            return;
          } else {
            return;
          }
        }
    }

    final void b() {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int[] var1 = ((bi) this).field_B;
        for (var2 = (((bi) this).field_w >> 1) - 1; var2 >= 0; var2--) {
            var3 = var2 * ((bi) this).field_z;
            var4 = (((bi) this).field_w - var2 - 1) * ((bi) this).field_z;
            for (var5 = -((bi) this).field_z; var5 < 0; var5++) {
                var6 = var1[var3];
                var1[var3] = var1[var4];
                var1[var4] = var6;
                var3++;
                var4++;
            }
        }
        ((bi) this).field_x = ((bi) this).field_p - ((bi) this).field_w - ((bi) this).field_x;
    }

    private final void d(int param0, int param1, int param2, int param3, int param4) {
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
        int stackIn_5_0 = 0;
        int stackIn_11_0 = 0;
        int stackIn_19_0 = 0;
        int stackIn_25_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_18_0 = 0;
        int stackOut_17_0 = 0;
        int stackOut_24_0 = 0;
        int stackOut_23_0 = 0;
        L0: {
          var6 = param2 * ((bi) this).field_z + param1;
          param3 = param3 & 4095;
          param4 = param4 & 4095;
          if (param2 < 0) {
            var12 = 0;
            var11 = 0;
            var8 = 0;
            var7 = 0;
            break L0;
          } else {
            L1: {
              if (param1 < 0) {
                var11 = 0;
                var7 = 0;
                break L1;
              } else {
                L2: {
                  var7 = ((bi) this).field_B[var6];
                  if (var7 == 0) {
                    stackOut_4_0 = 0;
                    stackIn_5_0 = stackOut_4_0;
                    break L2;
                  } else {
                    stackOut_3_0 = (4096 - param3) * (4096 - param4);
                    stackIn_5_0 = stackOut_3_0;
                    break L2;
                  }
                }
                var11 = stackIn_5_0;
                break L1;
              }
            }
            if (param1 >= ((bi) this).field_z - 1) {
              var12 = 0;
              var8 = 0;
              break L0;
            } else {
              L3: {
                var8 = ((bi) this).field_B[var6 + 1];
                if (var8 == 0) {
                  stackOut_10_0 = 0;
                  stackIn_11_0 = stackOut_10_0;
                  break L3;
                } else {
                  stackOut_9_0 = param3 * (4096 - param4);
                  stackIn_11_0 = stackOut_9_0;
                  break L3;
                }
              }
              var12 = stackIn_11_0;
              break L0;
            }
          }
        }
        L4: {
          if (param2 >= ((bi) this).field_w - 1) {
            var14 = 0;
            var13 = 0;
            var10 = 0;
            var9 = 0;
            break L4;
          } else {
            L5: {
              if (param1 < 0) {
                var13 = 0;
                var9 = 0;
                break L5;
              } else {
                L6: {
                  var9 = ((bi) this).field_B[var6 + ((bi) this).field_z];
                  if (var9 == 0) {
                    stackOut_18_0 = 0;
                    stackIn_19_0 = stackOut_18_0;
                    break L6;
                  } else {
                    stackOut_17_0 = (4096 - param3) * param4;
                    stackIn_19_0 = stackOut_17_0;
                    break L6;
                  }
                }
                var13 = stackIn_19_0;
                break L5;
              }
            }
            if (param1 >= ((bi) this).field_z - 1) {
              var14 = 0;
              var10 = 0;
              break L4;
            } else {
              L7: {
                var10 = ((bi) this).field_B[var6 + ((bi) this).field_z + 1];
                if (var10 == 0) {
                  stackOut_24_0 = 0;
                  stackIn_25_0 = stackOut_24_0;
                  break L7;
                } else {
                  stackOut_23_0 = param3 * param4;
                  stackIn_25_0 = stackOut_23_0;
                  break L7;
                }
              }
              var14 = stackIn_25_0;
              break L4;
            }
          }
        }
        L8: {
          var11 = var11 >> 16;
          var12 = var12 >> 16;
          var13 = var13 >> 16;
          var14 = var14 >> 16;
          var15 = var11 + var12 + var13 + var14;
          if (var15 < 256) {
            if (var15 < 128) {
              return;
            } else {
              L9: {
                var16 = (var7 & 16711935) * var11 + (var8 & 16711935) * var12;
                var16 = var16 + ((var9 & 16711935) * var13 + (var10 & 16711935) * var14);
                var17 = (var7 & 65280) * var11 + (var8 & 65280) * var12;
                var17 = var17 + ((var9 & 65280) * var13 + (var10 & 65280) * var14);
                var18 = ((var16 >>> 16) / var15 << 16) + (var17 / var15 & 65280) + (var16 & 65535) / var15;
                if (var18 != 0) {
                  break L9;
                } else {
                  var18 = 1;
                  break L9;
                }
              }
              gf.field_h[param0] = var18;
              break L8;
            }
          } else {
            L10: {
              var16 = (var7 & 16711935) * var11 + (var8 & 16711935) * var12;
              var16 = var16 + ((var9 & 16711935) * var13 + (var10 & 16711935) * var14);
              var17 = (var7 & 65280) * var11 + (var8 & 65280) * var12;
              var17 = var17 + ((var9 & 65280) * var13 + (var10 & 65280) * var14);
              var18 = (var16 >>> 8 & 16711935) + (var17 >>> 8 & 65280);
              if (var18 != 0) {
                break L10;
              } else {
                var18 = 1;
                break L10;
              }
            }
            gf.field_h[param0] = var18;
            break L8;
          }
        }
    }

    final void f() {
        int var3 = 0;
        int var4 = 0;
        int[] var1 = new int[((bi) this).field_z * ((bi) this).field_w];
        int var2 = 0;
        for (var3 = 0; var3 < ((bi) this).field_z; var3++) {
            for (var4 = ((bi) this).field_w - 1; var4 >= 0; var4--) {
                int incrementValue$0 = var2;
                var2++;
                var1[incrementValue$0] = ((bi) this).field_B[var3 + var4 * ((bi) this).field_z];
            }
        }
        ((bi) this).field_B = var1;
        var3 = ((bi) this).field_x;
        ((bi) this).field_x = ((bi) this).field_t;
        ((bi) this).field_t = ((bi) this).field_p - ((bi) this).field_w - var3;
        var3 = ((bi) this).field_w;
        ((bi) this).field_w = ((bi) this).field_z;
        ((bi) this).field_z = var3;
        var3 = ((bi) this).field_p;
        ((bi) this).field_p = ((bi) this).field_o;
        ((bi) this).field_o = var3;
    }

    void c(int param0, int param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        L0: {
          param0 = param0 + ((bi) this).field_t;
          param1 = param1 + ((bi) this).field_x;
          var4 = param0 + param1 * gf.field_b;
          var5 = 0;
          var6 = ((bi) this).field_w;
          var7 = ((bi) this).field_z;
          var8 = gf.field_b - var7;
          var9 = 0;
          if (param1 >= gf.field_a) {
            break L0;
          } else {
            var10 = gf.field_a - param1;
            var6 = var6 - var10;
            param1 = gf.field_a;
            var5 = var5 + var10 * var7;
            var4 = var4 + var10 * gf.field_b;
            break L0;
          }
        }
        L1: {
          if (param1 + var6 <= gf.field_f) {
            break L1;
          } else {
            var6 = var6 - (param1 + var6 - gf.field_f);
            break L1;
          }
        }
        L2: {
          if (param0 >= gf.field_i) {
            break L2;
          } else {
            var10 = gf.field_i - param0;
            var7 = var7 - var10;
            param0 = gf.field_i;
            var5 = var5 + var10;
            var4 = var4 + var10;
            var9 = var9 + var10;
            var8 = var8 + var10;
            break L2;
          }
        }
        L3: {
          if (param0 + var7 <= gf.field_l) {
            break L3;
          } else {
            var10 = param0 + var7 - gf.field_l;
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
            L4: {
              if (param2 != 256) {
                bi.a(0, 0, 0, gf.field_h, ((bi) this).field_B, var5, 0, var4, 0, var7, var6, var8, var9, param2);
                break L4;
              } else {
                bi.a(0, 0, 0, gf.field_h, ((bi) this).field_B, var5, 0, var4, 0, var7, var6, var8, var9);
                break L4;
              }
            }
            return;
          } else {
            return;
          }
        }
    }

    private final static void a(int param0, int[] param1, int[] param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9) {
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        var10 = -param7;
        L0: while (true) {
          if (var10 >= 0) {
            return;
          } else {
            var11 = -param6;
            L1: while (true) {
              if (var11 >= 0) {
                param5 = param5 + param8;
                param4 = param4 + param9;
                var10++;
                continue L0;
              } else {
                int incrementValue$14 = param4;
                param4++;
                param3 = param2[incrementValue$14];
                if (param3 != 0) {
                  param0 = param1[param5];
                  if (param0 != 0) {
                    var12 = ((param3 & 16711680) >>> 16) * ((param0 & 16711680) >>> 16) >>> 8;
                    var13 = (param3 & 65280) * (param0 & 65280) >>> 24;
                    var14 = (param3 & 255) * (param0 & 255) >>> 8;
                    int incrementValue$15 = param5;
                    param5++;
                    param1[incrementValue$15] = (var12 << 16) + (var13 << 8) + var14;
                    var11++;
                    continue L1;
                  } else {
                    param5++;
                    var11++;
                    continue L1;
                  }
                } else {
                  param5++;
                  var11++;
                  continue L1;
                }
              }
            }
          }
        }
    }

    void f(int param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        L0: {
          param0 = param0 + ((bi) this).field_t;
          param1 = param1 + ((bi) this).field_x;
          var3 = param0 + param1 * gf.field_b;
          var4 = 0;
          var5 = ((bi) this).field_w;
          var6 = ((bi) this).field_z;
          var7 = gf.field_b - var6;
          var8 = 0;
          if (param1 >= gf.field_a) {
            break L0;
          } else {
            var9 = gf.field_a - param1;
            var5 = var5 - var9;
            param1 = gf.field_a;
            var4 = var4 + var9 * var6;
            var3 = var3 + var9 * gf.field_b;
            break L0;
          }
        }
        L1: {
          if (param1 + var5 <= gf.field_f) {
            break L1;
          } else {
            var5 = var5 - (param1 + var5 - gf.field_f);
            break L1;
          }
        }
        L2: {
          if (param0 >= gf.field_i) {
            break L2;
          } else {
            var9 = gf.field_i - param0;
            var6 = var6 - var9;
            param0 = gf.field_i;
            var4 = var4 + var9;
            var3 = var3 + var9;
            var8 = var8 + var9;
            var7 = var7 + var9;
            break L2;
          }
        }
        L3: {
          if (param0 + var6 <= gf.field_l) {
            break L3;
          } else {
            var9 = param0 + var6 - gf.field_l;
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
            bi.a(gf.field_h, ((bi) this).field_B, 0, var4, var3, var6, var5, var7, var8);
            return;
          } else {
            return;
          }
        }
    }

    final bi c() {
        int var2 = 0;
        int var3 = 0;
        bi var1 = new bi(((bi) this).field_z, ((bi) this).field_w);
        var1.field_o = ((bi) this).field_o;
        var1.field_p = ((bi) this).field_p;
        var1.field_t = ((bi) this).field_o - ((bi) this).field_z - ((bi) this).field_t;
        var1.field_x = ((bi) this).field_x;
        for (var2 = 0; var2 < ((bi) this).field_w; var2++) {
            for (var3 = 0; var3 < ((bi) this).field_z; var3++) {
                var1.field_B[var2 * ((bi) this).field_z + var3] = ((bi) this).field_B[var2 * ((bi) this).field_z + ((bi) this).field_z - 1 - var3];
            }
        }
        return var1;
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
          param0 = param0 + ((bi) this).field_t;
          param1 = param1 + ((bi) this).field_x;
          var4 = param0 + param1 * gf.field_b;
          var5 = 0;
          var6 = ((bi) this).field_w;
          var7 = ((bi) this).field_z;
          var8 = gf.field_b - var7;
          var9 = 0;
          if (param1 >= gf.field_a) {
            break L0;
          } else {
            var10 = gf.field_a - param1;
            var6 = var6 - var10;
            param1 = gf.field_a;
            var5 = var5 + var10 * var7;
            var4 = var4 + var10 * gf.field_b;
            break L0;
          }
        }
        L1: {
          if (param1 + var6 <= gf.field_f) {
            break L1;
          } else {
            var6 = var6 - (param1 + var6 - gf.field_f);
            break L1;
          }
        }
        L2: {
          if (param0 >= gf.field_i) {
            break L2;
          } else {
            var10 = gf.field_i - param0;
            var7 = var7 - var10;
            param0 = gf.field_i;
            var5 = var5 + var10;
            var4 = var4 + var10;
            var9 = var9 + var10;
            var8 = var8 + var10;
            break L2;
          }
        }
        L3: {
          if (param0 + var7 <= gf.field_l) {
            break L3;
          } else {
            var10 = param0 + var7 - gf.field_l;
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
            bi.b(gf.field_h, ((bi) this).field_B, param2, var5, var4, var7, var6, var8, var9);
            return;
          } else {
            return;
          }
        }
    }

    void d(int param0, int param1) {
        param0 = param0 + (((bi) this).field_t >> 1);
        param1 = param1 + (((bi) this).field_x >> 1);
        int var3 = param0 < gf.field_i ? gf.field_i - param0 << 1 : 0;
        int var4 = param0 + (((bi) this).field_z >> 1) > gf.field_l ? gf.field_l - param0 << 1 : ((bi) this).field_z;
        int var5 = param1 < gf.field_a ? gf.field_a - param1 << 1 : 0;
        int var6 = param1 + (((bi) this).field_w >> 1) > gf.field_f ? gf.field_f - param1 << 1 : ((bi) this).field_w;
        bi.a(((bi) this).field_B, var5 * ((bi) this).field_z + var3, (param1 + (var5 >> 1)) * gf.field_b + (param0 + (var3 >> 1)), (((bi) this).field_z << 1) - (var4 - var3) + (((bi) this).field_z & 1), gf.field_b - (var4 - var3 >> 1), ((bi) this).field_z, var4 - var3 >> 1, var6 - var5 >> 1);
    }

    final void a(int param0, int param1, int param2, int param3) {
        int var5 = ((bi) this).field_o << 3;
        int var6 = ((bi) this).field_p << 3;
        param0 = (param0 << 4) + (var5 & 15);
        param1 = (param1 << 4) + (var6 & 15);
        ((bi) this).b(var5, var6, param0, param1, param2, param3);
    }

    private final static void a(int[] param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        var8 = 0;
        L0: while (true) {
          if (var8 >= param7) {
            return;
          } else {
            var9 = 0;
            L1: while (true) {
              if (var9 >= param6) {
                var8++;
                param1 = param1 + param3;
                param2 = param2 + param4;
                continue L0;
              } else {
                L2: {
                  var11 = gf.field_h[param2] & 16711935;
                  var12 = gf.field_h[param2] & 65280;
                  var13 = 0;
                  var14 = 0;
                  var10 = param0[param1];
                  if (param0[param1] != 0) {
                    var13 = var13 + (var10 & 16711935);
                    var14 = var14 + (var10 & 65280);
                    break L2;
                  } else {
                    var13 = var13 + var11;
                    var14 = var14 + var12;
                    break L2;
                  }
                }
                L3: {
                  var10 = param0[param1 + 1];
                  if (param0[param1 + 1] != 0) {
                    var13 = var13 + (var10 & 16711935);
                    var14 = var14 + (var10 & 65280);
                    break L3;
                  } else {
                    var13 = var13 + var11;
                    var14 = var14 + var12;
                    break L3;
                  }
                }
                L4: {
                  var10 = param0[param1 + param5];
                  if (param0[param1 + param5] != 0) {
                    var13 = var13 + (var10 & 16711935);
                    var14 = var14 + (var10 & 65280);
                    break L4;
                  } else {
                    var13 = var13 + var11;
                    var14 = var14 + var12;
                    break L4;
                  }
                }
                L5: {
                  var10 = param0[param1 + param5 + 1];
                  if (param0[param1 + param5 + 1] != 0) {
                    var13 = var13 + (var10 & 16711935);
                    var14 = var14 + (var10 & 65280);
                    break L5;
                  } else {
                    var13 = var13 + var11;
                    var14 = var14 + var12;
                    break L5;
                  }
                }
                int incrementValue$1 = param2;
                param2++;
                gf.field_h[incrementValue$1] = (var13 & 66847740 | var14 & 261120) >> 2;
                var9++;
                param1 += 2;
                continue L1;
              }
            }
          }
        }
    }

    void b(int param0, int param1, int param2, int param3) {
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
              var5 = ((bi) this).field_z;
              var6 = ((bi) this).field_w;
              var7 = 0;
              var8 = 0;
              var9 = ((bi) this).field_o;
              var10 = ((bi) this).field_p;
              var11 = (var9 << 16) / param2;
              var12 = (var10 << 16) / param3;
              if (((bi) this).field_t <= 0) {
                break L0;
              } else {
                var13 = ((((bi) this).field_t << 16) + var11 - 1) / var11;
                param0 = param0 + var13;
                var7 = var7 + (var13 * var11 - (((bi) this).field_t << 16));
                break L0;
              }
            }
            L1: {
              if (((bi) this).field_x <= 0) {
                break L1;
              } else {
                var13 = ((((bi) this).field_x << 16) + var12 - 1) / var12;
                param1 = param1 + var13;
                var8 = var8 + (var13 * var12 - (((bi) this).field_x << 16));
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
              var13 = param0 + param1 * gf.field_b;
              var14 = gf.field_b - param2;
              if (param1 + param3 <= gf.field_f) {
                break L4;
              } else {
                param3 = param3 - (param1 + param3 - gf.field_f);
                break L4;
              }
            }
            L5: {
              if (param1 >= gf.field_a) {
                break L5;
              } else {
                var15 = gf.field_a - param1;
                param3 = param3 - var15;
                var13 = var13 + var15 * gf.field_b;
                var8 = var8 + var12 * var15;
                break L5;
              }
            }
            L6: {
              if (param0 + param2 <= gf.field_l) {
                break L6;
              } else {
                var15 = param0 + param2 - gf.field_l;
                param2 = param2 - var15;
                var14 = var14 + var15;
                break L6;
              }
            }
            L7: {
              if (param0 >= gf.field_i) {
                break L7;
              } else {
                var15 = gf.field_i - param0;
                param2 = param2 - var15;
                var13 = var13 + var15;
                var7 = var7 + var11 * var15;
                var14 = var14 + var15;
                break L7;
              }
            }
            bi.b(gf.field_h, ((bi) this).field_B, 0, var7, var8, var13, var14, param2, param3, var11, var12, var5);
            return;
          } else {
            return;
          }
        }
    }

    final void e() {
        gf.a(((bi) this).field_B, ((bi) this).field_z, ((bi) this).field_w);
    }

    final void c(int param0, int param1, int param2, int param3) {
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
        int var32 = 0;
        int var33 = 0;
        L0: {
          if (param2 > ((bi) this).field_o) {
            break L0;
          } else {
            if (param3 <= ((bi) this).field_p) {
              L1: {
                var5 = param0 + ((bi) this).field_t * param2 / ((bi) this).field_o;
                var6 = param0 + ((((bi) this).field_t + ((bi) this).field_z) * param2 + ((bi) this).field_o - 1) / ((bi) this).field_o;
                var7 = param1 + ((bi) this).field_x * param3 / ((bi) this).field_p;
                var8 = param1 + ((((bi) this).field_x + ((bi) this).field_w) * param3 + ((bi) this).field_p - 1) / ((bi) this).field_p;
                if (var5 >= gf.field_i) {
                  break L1;
                } else {
                  var5 = gf.field_i;
                  break L1;
                }
              }
              L2: {
                if (var6 <= gf.field_l) {
                  break L2;
                } else {
                  var6 = gf.field_l;
                  break L2;
                }
              }
              L3: {
                if (var7 >= gf.field_a) {
                  break L3;
                } else {
                  var7 = gf.field_a;
                  break L3;
                }
              }
              L4: {
                if (var8 <= gf.field_f) {
                  break L4;
                } else {
                  var8 = gf.field_f;
                  break L4;
                }
              }
              if (var5 >= var6) {
                return;
              } else {
                if (var7 < var8) {
                  var9 = var7 * gf.field_b + var5;
                  var10 = gf.field_b - (var6 - var5);
                  var11 = var7;
                  L5: while (true) {
                    if (var11 >= var8) {
                      return;
                    } else {
                      var12 = var5;
                      L6: while (true) {
                        if (var12 >= var6) {
                          var9 = var9 + var10;
                          var11++;
                          continue L5;
                        } else {
                          var13 = var12 - param0 << 4;
                          var14 = var11 - param1 << 4;
                          var15 = var13 * ((bi) this).field_o / param2 - (((bi) this).field_t << 4);
                          var16 = (var13 + 16) * ((bi) this).field_o / param2 - (((bi) this).field_t << 4);
                          var17 = var14 * ((bi) this).field_p / param3 - (((bi) this).field_x << 4);
                          var18 = (var14 + 16) * ((bi) this).field_p / param3 - (((bi) this).field_x << 4);
                          var19 = (var16 - var15) * (var18 - var17);
                          if (var19 != 0) {
                            L7: {
                              if (var15 >= 0) {
                                break L7;
                              } else {
                                var15 = 0;
                                break L7;
                              }
                            }
                            L8: {
                              if (var16 <= ((bi) this).field_z << 4) {
                                break L8;
                              } else {
                                var16 = ((bi) this).field_z << 4;
                                break L8;
                              }
                            }
                            L9: {
                              if (var17 >= 0) {
                                break L9;
                              } else {
                                var17 = 0;
                                break L9;
                              }
                            }
                            L10: {
                              if (var18 <= ((bi) this).field_w << 4) {
                                break L10;
                              } else {
                                var18 = ((bi) this).field_w << 4;
                                break L10;
                              }
                            }
                            var16--;
                            var18--;
                            var20 = 16 - (var15 & 15);
                            var21 = (var16 & 15) + 1;
                            var22 = 16 - (var17 & 15);
                            var23 = (var18 & 15) + 1;
                            var15 = var15 >> 4;
                            var16 = var16 >> 4;
                            var17 = var17 >> 4;
                            var18 = var18 >> 4;
                            var24 = 0;
                            var25 = 0;
                            var26 = 0;
                            var27 = 0;
                            var28 = gf.field_h[var9];
                            var29 = var17;
                            L11: while (true) {
                              if (var29 > var18) {
                                L12: {
                                  if (var27 >= var19) {
                                    break L12;
                                  } else {
                                    var29 = var19 - var27;
                                    var24 = var24 + (var28 >> 16 & 255) * var29;
                                    var25 = var25 + (var28 >> 8 & 255) * var29;
                                    var26 = var26 + (var28 & 255) * var29;
                                    break L12;
                                  }
                                }
                                L13: {
                                  var29 = (var24 / var19 << 16) + (var25 / var19 << 8) + var26 / var19;
                                  if (var29 != 0) {
                                    break L13;
                                  } else {
                                    var29 = 1;
                                    break L13;
                                  }
                                }
                                gf.field_h[var9] = var29;
                                var9++;
                                var12++;
                                continue L6;
                              } else {
                                L14: {
                                  var30 = 16;
                                  if (var29 != var17) {
                                    break L14;
                                  } else {
                                    var30 = var22;
                                    break L14;
                                  }
                                }
                                L15: {
                                  if (var29 != var18) {
                                    break L15;
                                  } else {
                                    var30 = var23;
                                    break L15;
                                  }
                                }
                                var31 = var15;
                                L16: while (true) {
                                  if (var31 > var16) {
                                    var29++;
                                    continue L11;
                                  } else {
                                    L17: {
                                      var32 = ((bi) this).field_B[var29 * ((bi) this).field_z + var31];
                                      if (var32 != 0) {
                                        break L17;
                                      } else {
                                        var32 = var28;
                                        break L17;
                                      }
                                    }
                                    L18: {
                                      var33 = var30;
                                      if (var31 != var15) {
                                        if (var31 != var16) {
                                          var33 = var33 << 4;
                                          break L18;
                                        } else {
                                          var33 = var33 * var21;
                                          break L18;
                                        }
                                      } else {
                                        var33 = var33 * var20;
                                        break L18;
                                      }
                                    }
                                    var27 = var27 + var33;
                                    var24 = var24 + (var32 >> 16 & 255) * var33;
                                    var25 = var25 + (var32 >> 8 & 255) * var33;
                                    var26 = var26 + (var32 & 255) * var33;
                                    var31++;
                                    continue L16;
                                  }
                                }
                              }
                            }
                          } else {
                            var12++;
                            continue L6;
                          }
                        }
                      }
                    }
                  }
                } else {
                  return;
                }
              }
            } else {
              break L0;
            }
          }
        }
        throw new IllegalArgumentException();
    }

    private final static void a(int[] param0, int[] param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11) {
        int var12 = 0;
        int var13 = 0;
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
                int incrementValue$403 = param3;
                param3++;
                param2 = param1[incrementValue$403];
                if (param2 == 0) {
                  param4++;
                  param5++;
                  continue L1;
                } else {
                  if (param2 >> 8 != (param2 & 65535)) {
                    int incrementValue$404 = param4;
                    param4++;
                    param0[incrementValue$404] = param2;
                    param5++;
                    continue L1;
                  } else {
                    param2 = param2 & 255;
                    int incrementValue$405 = param4;
                    param4++;
                    param0[incrementValue$405] = (param2 * var12 >> 8 & 16711934) + (param2 * var13 & 65280) + 1;
                    param5++;
                    continue L1;
                  }
                }
              }
            }
          }
        }
    }

    void b(int param0, int param1, int param2, int param3, int param4) {
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
        if (param2 <= 0) {
          return;
        } else {
          if (param3 > 0) {
            L0: {
              var6 = ((bi) this).field_z;
              var7 = ((bi) this).field_w;
              var8 = 0;
              var9 = 0;
              var10 = ((bi) this).field_o;
              var11 = ((bi) this).field_p;
              var12 = (var10 << 16) / param2;
              var13 = (var11 << 16) / param3;
              if (((bi) this).field_t <= 0) {
                break L0;
              } else {
                var14 = ((((bi) this).field_t << 16) + var12 - 1) / var12;
                param0 = param0 + var14;
                var8 = var8 + (var14 * var12 - (((bi) this).field_t << 16));
                break L0;
              }
            }
            L1: {
              if (((bi) this).field_x <= 0) {
                break L1;
              } else {
                var14 = ((((bi) this).field_x << 16) + var13 - 1) / var13;
                param1 = param1 + var14;
                var9 = var9 + (var14 * var13 - (((bi) this).field_x << 16));
                break L1;
              }
            }
            L2: {
              if (var6 >= var10) {
                break L2;
              } else {
                param2 = ((var6 << 16) - var8 + var12 - 1) / var12;
                break L2;
              }
            }
            L3: {
              if (var7 >= var11) {
                break L3;
              } else {
                param3 = ((var7 << 16) - var9 + var13 - 1) / var13;
                break L3;
              }
            }
            L4: {
              var14 = param0 + param1 * gf.field_b;
              var15 = gf.field_b - param2;
              if (param1 + param3 <= gf.field_f) {
                break L4;
              } else {
                param3 = param3 - (param1 + param3 - gf.field_f);
                break L4;
              }
            }
            L5: {
              if (param1 >= gf.field_a) {
                break L5;
              } else {
                var16 = gf.field_a - param1;
                param3 = param3 - var16;
                var14 = var14 + var16 * gf.field_b;
                var9 = var9 + var13 * var16;
                break L5;
              }
            }
            L6: {
              if (param0 + param2 <= gf.field_l) {
                break L6;
              } else {
                var16 = param0 + param2 - gf.field_l;
                param2 = param2 - var16;
                var15 = var15 + var16;
                break L6;
              }
            }
            L7: {
              if (param0 >= gf.field_i) {
                break L7;
              } else {
                var16 = gf.field_i - param0;
                param2 = param2 - var16;
                var14 = var14 + var16;
                var8 = var8 + var12 * var16;
                var15 = var15 + var16;
                break L7;
              }
            }
            bi.a(gf.field_h, ((bi) this).field_B, 0, var8, var9, var14, var15, param2, param3, var12, var13, var6, param4);
            return;
          } else {
            return;
          }
        }
    }

    private final static void a(int[] param0, int[] param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11, int param12) {
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var13 = 256 - param12;
        int var14 = param3;
        for (var15 = -param8; var15 < 0; var15++) {
            var16 = (param4 >> 16) * param11;
            for (var17 = -param7; var17 < 0; var17++) {
                param2 = param1[(param3 >> 16) + var16];
                if (param2 != 0) {
                    var18 = param0[param5];
                    int incrementValue$0 = param5;
                    param5++;
                    param0[incrementValue$0] = ((param2 & 16711935) * param12 + (var18 & 16711935) * var13 & -16711936) + ((param2 & 65280) * param12 + (var18 & 65280) * var13 & 16711680) >> 8;
                } else {
                    param5++;
                }
                param3 = param3 + param9;
            }
            param4 = param4 + param10;
            param3 = var14;
            param5 = param5 + param6;
        }
    }

    private final static void b(int[] param0, int[] param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11) {
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var12 = param3;
        for (var13 = -param8; var13 < 0; var13++) {
            var14 = (param4 >> 16) * param11;
            for (var15 = -param7; var15 < 0; var15++) {
                param2 = param1[(param3 >> 16) + var14];
                if (param2 != 0) {
                    int incrementValue$1 = param5;
                    param5++;
                    param0[incrementValue$1] = param2;
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

    private final static void a(int param0, int param1, int param2, int param3, int[] param4, int[] param5, int param6, int param7, int param8, int param9, int param10, int param11, int param12, int param13, int param14, int param15, int param16) {
        int var17 = param3;
        while (param8 < 0) {
            param7 = (param9 >> 16) * param15;
            for (param6 = -param12; param6 < 0; param6++) {
                param0 = param4[(param3 >> 16) + param7];
                if (param0 != 0) {
                    param1 = (param0 & 16711935) * param16;
                    param0 = (param1 & -16711936) + (param0 * param16 - param1 & 16711680) >>> 8;
                    param1 = param5[param10];
                    param2 = param0 + param1;
                    param0 = (param0 & 16711935) + (param1 & 16711935);
                    param1 = (param0 & 16777472) + (param2 - param0 & 65536);
                    int incrementValue$0 = param10;
                    param10++;
                    param5[incrementValue$0] = param2 - param1 | param1 - (param1 >>> 8);
                } else {
                    param10++;
                }
                param3 = param3 + param13;
            }
            param9 = param9 + param14;
            param3 = var17;
            param10 = param10 + param11;
            param8++;
        }
    }

    final void b(int param0, int param1, int param2, int param3, int param4, int param5) {
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
        int var24 = 0;
        double var25 = 0.0;
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
        if (param5 != 0) {
          L0: {
            param0 = param0 - (((bi) this).field_t << 4);
            param1 = param1 - (((bi) this).field_x << 4);
            var7 = (double)(param4 & 65535) * 0.00009587379924285257;
            var9 = (int)Math.floor(Math.sin(var7) * (double)param5 + 0.5);
            var10 = (int)Math.floor(Math.cos(var7) * (double)param5 + 0.5);
            var11 = -param0 * var10 + -param1 * var9;
            var12 = --param0 * var9 + -param1 * var10;
            var13 = ((((bi) this).field_z << 4) - param0) * var10 + -param1 * var9;
            var14 = -((((bi) this).field_z << 4) - param0) * var9 + -param1 * var10;
            var15 = -param0 * var10 + ((((bi) this).field_w << 4) - param1) * var9;
            var16 = --param0 * var9 + ((((bi) this).field_w << 4) - param1) * var10;
            var17 = ((((bi) this).field_z << 4) - param0) * var10 + ((((bi) this).field_w << 4) - param1) * var9;
            var18 = -((((bi) this).field_z << 4) - param0) * var9 + ((((bi) this).field_w << 4) - param1) * var10;
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
            if (var19 >= gf.field_i) {
              break L10;
            } else {
              var19 = gf.field_i;
              break L10;
            }
          }
          L11: {
            if (var20 <= gf.field_l) {
              break L11;
            } else {
              var20 = gf.field_l;
              break L11;
            }
          }
          L12: {
            if (var21 >= gf.field_a) {
              break L12;
            } else {
              var21 = gf.field_a;
              break L12;
            }
          }
          L13: {
            if (var22 <= gf.field_f) {
              break L13;
            } else {
              var22 = gf.field_f;
              break L13;
            }
          }
          var20 = var19 - var20;
          if (var20 < 0) {
            var22 = var21 - var22;
            if (var22 < 0) {
              L14: {
                var23 = var21 * gf.field_b + var19;
                var24 = gf.field_b + var20;
                var25 = 16777216.0 / (double)param5;
                var27 = (int)Math.floor(Math.sin(var7) * var25 + 0.5);
                var28 = (int)Math.floor(Math.cos(var7) * var25 + 0.5);
                var29 = (var19 << 4) + 8 - param2;
                var30 = (var21 << 4) + 8 - param3;
                var31 = (param0 << 8) - 2048 - (var30 * var27 >> 4);
                var32 = (param1 << 8) - 2048 + (var30 * var28 >> 4);
                if (var28 >= 0) {
                  if (var27 >= 0) {
                    var36 = var22;
                    L15: while (true) {
                      if (var36 >= 0) {
                        break L14;
                      } else {
                        L16: {
                          var37 = var31 + (var29 * var28 >> 4);
                          var38 = var32 + (var29 * var27 >> 4);
                          var39 = var20;
                          var40 = 0;
                          var35 = var37 + 4096;
                          if (var35 < 0) {
                            if (var28 != 0) {
                              var35 = (var28 - 1 - var35) / var28;
                              var39 = var39 + var35;
                              var37 = var37 + var28 * var35;
                              var38 = var38 + var27 * var35;
                              var23 = var23 + var35;
                              var40 = 1;
                              break L16;
                            } else {
                              var23 = var23 - var39;
                              break L16;
                            }
                          } else {
                            var40 = 1;
                            break L16;
                          }
                        }
                        L17: {
                          if (var40 == 0) {
                            break L17;
                          } else {
                            L18: {
                              var40 = 0;
                              var35 = var38 + 4096;
                              if (var35 < 0) {
                                if (var27 != 0) {
                                  var35 = (var27 - 1 - var35) / var27;
                                  var39 = var39 + var35;
                                  var37 = var37 + var28 * var35;
                                  var38 = var38 + var27 * var35;
                                  var23 = var23 + var35;
                                  var40 = 1;
                                  break L18;
                                } else {
                                  var23 = var23 - var39;
                                  break L18;
                                }
                              } else {
                                var40 = 1;
                                break L18;
                              }
                            }
                            if (var40 == 0) {
                              break L17;
                            } else {
                              L19: while (true) {
                                L20: {
                                  if (var39 >= 0) {
                                    break L20;
                                  } else {
                                    var33 = var37 >> 12;
                                    if (var37 >> 12 >= ((bi) this).field_z) {
                                      break L20;
                                    } else {
                                      var34 = var38 >> 12;
                                      if (var38 >> 12 < ((bi) this).field_w) {
                                        this.d(var23, var33, var34, var37, var38);
                                        var39++;
                                        var37 = var37 + var28;
                                        var38 = var38 + var27;
                                        var23++;
                                        continue L19;
                                      } else {
                                        break L20;
                                      }
                                    }
                                  }
                                }
                                var23 = var23 - var39;
                                break L17;
                              }
                            }
                          }
                        }
                        var36++;
                        var31 = var31 - var27;
                        var32 = var32 + var28;
                        var23 = var23 + var24;
                        continue L15;
                      }
                    }
                  } else {
                    var36 = var22;
                    L21: while (true) {
                      if (var36 >= 0) {
                        break L14;
                      } else {
                        L22: {
                          var37 = var31 + (var29 * var28 >> 4);
                          var38 = var32 + (var29 * var27 >> 4);
                          var39 = var20;
                          var40 = 0;
                          var35 = var37 + 4096;
                          if (var35 < 0) {
                            if (var28 != 0) {
                              var35 = (var28 - 1 - var35) / var28;
                              var39 = var39 + var35;
                              var37 = var37 + var28 * var35;
                              var38 = var38 + var27 * var35;
                              var23 = var23 + var35;
                              var40 = 1;
                              break L22;
                            } else {
                              var23 = var23 - var39;
                              break L22;
                            }
                          } else {
                            var40 = 1;
                            break L22;
                          }
                        }
                        L23: {
                          if (var40 == 0) {
                            break L23;
                          } else {
                            L24: {
                              var40 = 0;
                              var35 = var38 - (((bi) this).field_w << 12);
                              if (var35 >= 0) {
                                if (var27 != 0) {
                                  var35 = (var27 - var35) / var27;
                                  var39 = var39 + var35;
                                  var37 = var37 + var28 * var35;
                                  var38 = var38 + var27 * var35;
                                  var23 = var23 + var35;
                                  var40 = 1;
                                  break L24;
                                } else {
                                  var23 = var23 - var39;
                                  break L24;
                                }
                              } else {
                                var40 = 1;
                                break L24;
                              }
                            }
                            if (var40 == 0) {
                              break L23;
                            } else {
                              L25: while (true) {
                                L26: {
                                  if (var39 >= 0) {
                                    break L26;
                                  } else {
                                    if (var38 < -4096) {
                                      break L26;
                                    } else {
                                      var33 = var37 >> 12;
                                      if (var37 >> 12 < ((bi) this).field_z) {
                                        var34 = var38 >> 12;
                                        this.d(var23, var33, var34, var37, var38);
                                        var39++;
                                        var37 = var37 + var28;
                                        var38 = var38 + var27;
                                        var23++;
                                        continue L25;
                                      } else {
                                        break L26;
                                      }
                                    }
                                  }
                                }
                                var23 = var23 - var39;
                                break L23;
                              }
                            }
                          }
                        }
                        var36++;
                        var31 = var31 - var27;
                        var32 = var32 + var28;
                        var23 = var23 + var24;
                        continue L21;
                      }
                    }
                  }
                } else {
                  if (var27 >= 0) {
                    var36 = var22;
                    L27: while (true) {
                      if (var36 >= 0) {
                        break L14;
                      } else {
                        L28: {
                          var37 = var31 + (var29 * var28 >> 4);
                          var38 = var32 + (var29 * var27 >> 4);
                          var39 = var20;
                          var40 = 0;
                          var35 = var37 - (((bi) this).field_z << 12);
                          if (var35 >= 0) {
                            if (var28 != 0) {
                              var35 = (var28 - var35) / var28;
                              var39 = var39 + var35;
                              var37 = var37 + var28 * var35;
                              var38 = var38 + var27 * var35;
                              var23 = var23 + var35;
                              var40 = 1;
                              break L28;
                            } else {
                              var23 = var23 - var39;
                              break L28;
                            }
                          } else {
                            var40 = 1;
                            break L28;
                          }
                        }
                        L29: {
                          if (var40 == 0) {
                            break L29;
                          } else {
                            L30: {
                              var40 = 0;
                              var35 = var38 + 4096;
                              if (var35 < 0) {
                                if (var27 != 0) {
                                  var35 = (var27 - 1 - var35) / var27;
                                  var39 = var39 + var35;
                                  var37 = var37 + var28 * var35;
                                  var38 = var38 + var27 * var35;
                                  var23 = var23 + var35;
                                  var40 = 1;
                                  break L30;
                                } else {
                                  var23 = var23 - var39;
                                  break L30;
                                }
                              } else {
                                var40 = 1;
                                break L30;
                              }
                            }
                            if (var40 == 0) {
                              break L29;
                            } else {
                              L31: while (true) {
                                L32: {
                                  if (var39 >= 0) {
                                    break L32;
                                  } else {
                                    if (var37 < -4096) {
                                      break L32;
                                    } else {
                                      var34 = var38 >> 12;
                                      if (var38 >> 12 < ((bi) this).field_w) {
                                        var33 = var37 >> 12;
                                        this.d(var23, var33, var34, var37, var38);
                                        var39++;
                                        var37 = var37 + var28;
                                        var38 = var38 + var27;
                                        var23++;
                                        continue L31;
                                      } else {
                                        break L32;
                                      }
                                    }
                                  }
                                }
                                var23 = var23 - var39;
                                break L29;
                              }
                            }
                          }
                        }
                        var36++;
                        var31 = var31 - var27;
                        var32 = var32 + var28;
                        var23 = var23 + var24;
                        continue L27;
                      }
                    }
                  } else {
                    var36 = var22;
                    L33: while (true) {
                      if (var36 >= 0) {
                        return;
                      } else {
                        L34: {
                          var37 = var31 + (var29 * var28 >> 4);
                          var38 = var32 + (var29 * var27 >> 4);
                          var39 = var20;
                          var40 = 0;
                          var35 = var37 - (((bi) this).field_z << 12);
                          if (var35 >= 0) {
                            if (var28 != 0) {
                              var35 = (var28 - var35) / var28;
                              var39 = var39 + var35;
                              var37 = var37 + var28 * var35;
                              var38 = var38 + var27 * var35;
                              var23 = var23 + var35;
                              var40 = 1;
                              break L34;
                            } else {
                              var23 = var23 - var39;
                              break L34;
                            }
                          } else {
                            var40 = 1;
                            break L34;
                          }
                        }
                        L35: {
                          if (var40 == 0) {
                            break L35;
                          } else {
                            L36: {
                              var40 = 0;
                              var35 = var38 - (((bi) this).field_w << 12);
                              if (var35 >= 0) {
                                if (var27 != 0) {
                                  var35 = (var27 - var35) / var27;
                                  var39 = var39 + var35;
                                  var37 = var37 + var28 * var35;
                                  var38 = var38 + var27 * var35;
                                  var23 = var23 + var35;
                                  var40 = 1;
                                  break L36;
                                } else {
                                  var23 = var23 - var39;
                                  break L36;
                                }
                              } else {
                                var40 = 1;
                                break L36;
                              }
                            }
                            if (var40 == 0) {
                              break L35;
                            } else {
                              L37: while (true) {
                                L38: {
                                  if (var39 >= 0) {
                                    break L38;
                                  } else {
                                    if (var37 < -4096) {
                                      break L38;
                                    } else {
                                      if (var38 >= -4096) {
                                        var33 = var37 >> 12;
                                        var34 = var38 >> 12;
                                        this.d(var23, var33, var34, var37, var38);
                                        var39++;
                                        var37 = var37 + var28;
                                        var38 = var38 + var27;
                                        var23++;
                                        continue L37;
                                      } else {
                                        break L38;
                                      }
                                    }
                                  }
                                }
                                var23 = var23 - var39;
                                break L35;
                              }
                            }
                          }
                        }
                        var36++;
                        var31 = var31 - var27;
                        var32 = var32 + var28;
                        var23 = var23 + var24;
                        continue L33;
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

    private final static void a(int param0, int param1, int param2, int[] param3, int[] param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11, int param12, int param13) {
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
                  param1 = (param0 & 16711935) * param13;
                  param0 = (param1 & -16711936) + (param0 * param13 - param1 & 16711680) >>> 8;
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

    private final static void a(int param0, int param1, int param2, int[] param3, int[] param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11, int param12) {
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

    bi(int param0, int param1, int param2, int param3, int param4, int param5, int[] param6) {
        ((bi) this).field_o = param0;
        ((bi) this).field_p = param1;
        ((bi) this).field_t = param2;
        ((bi) this).field_x = param3;
        ((bi) this).field_z = param4;
        ((bi) this).field_w = param5;
        ((bi) this).field_B = param6;
    }

    bi(int param0, int param1) {
        ((bi) this).field_B = new int[param0 * param1];
        ((bi) this).field_o = param0;
        ((bi) this).field_z = param0;
        ((bi) this).field_p = param1;
        ((bi) this).field_w = param1;
        ((bi) this).field_x = 0;
        ((bi) this).field_t = 0;
    }

    final void c(int param0, int param1, int param2, int param3, int param4) {
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
        if (param2 <= 0) {
          return;
        } else {
          if (param3 > 0) {
            L0: {
              var6 = ((bi) this).field_z;
              var7 = ((bi) this).field_w;
              var8 = 0;
              var9 = 0;
              var10 = ((bi) this).field_o;
              var11 = ((bi) this).field_p;
              var12 = (var10 << 16) / param2;
              var13 = (var11 << 16) / param3;
              if (((bi) this).field_t <= 0) {
                break L0;
              } else {
                var14 = ((((bi) this).field_t << 16) + var12 - 1) / var12;
                param0 = param0 + var14;
                var8 = var8 + (var14 * var12 - (((bi) this).field_t << 16));
                break L0;
              }
            }
            L1: {
              if (((bi) this).field_x <= 0) {
                break L1;
              } else {
                var14 = ((((bi) this).field_x << 16) + var13 - 1) / var13;
                param1 = param1 + var14;
                var9 = var9 + (var14 * var13 - (((bi) this).field_x << 16));
                break L1;
              }
            }
            L2: {
              if (var6 >= var10) {
                break L2;
              } else {
                param2 = ((var6 << 16) - var8 + var12 - 1) / var12;
                break L2;
              }
            }
            L3: {
              if (var7 >= var11) {
                break L3;
              } else {
                param3 = ((var7 << 16) - var9 + var13 - 1) / var13;
                break L3;
              }
            }
            L4: {
              var14 = param0 + param1 * gf.field_b;
              var15 = gf.field_b - param2;
              if (param1 + param3 <= gf.field_f) {
                break L4;
              } else {
                param3 = param3 - (param1 + param3 - gf.field_f);
                break L4;
              }
            }
            L5: {
              if (param1 >= gf.field_a) {
                break L5;
              } else {
                var16 = gf.field_a - param1;
                param3 = param3 - var16;
                var14 = var14 + var16 * gf.field_b;
                var9 = var9 + var13 * var16;
                break L5;
              }
            }
            L6: {
              if (param0 + param2 <= gf.field_l) {
                break L6;
              } else {
                var16 = param0 + param2 - gf.field_l;
                param2 = param2 - var16;
                var15 = var15 + var16;
                break L6;
              }
            }
            L7: {
              if (param0 >= gf.field_i) {
                break L7;
              } else {
                var16 = gf.field_i - param0;
                param2 = param2 - var16;
                var14 = var14 + var16;
                var8 = var8 + var12 * var16;
                var15 = var15 + var16;
                break L7;
              }
            }
            L8: {
              if (param4 != 256) {
                bi.a(0, 0, 0, var8, ((bi) this).field_B, gf.field_h, 0, 0, -param3, var9, var14, var15, param2, var12, var13, var6, param4);
                break L8;
              } else {
                bi.a(0, 0, 0, var8, ((bi) this).field_B, gf.field_h, 0, 0, -param3, var9, var14, var15, param2, var12, var13, var6);
                break L8;
              }
            }
            return;
          } else {
            return;
          }
        }
    }

    bi(byte[] param0, java.awt.Component param1) {
        InterruptedException var3 = null;
        java.awt.Image var3_ref = null;
        java.awt.MediaTracker var4 = null;
        java.awt.image.PixelGrabber var5 = null;
        Throwable decompiledCaughtException = null;
        try {
          L0: {
            var3_ref = java.awt.Toolkit.getDefaultToolkit().createImage(param0);
            var4 = new java.awt.MediaTracker(param1);
            var4.addImage(var3_ref, 0);
            var4.waitForAll();
            ((bi) this).field_z = var3_ref.getWidth((java.awt.image.ImageObserver) (Object) param1);
            ((bi) this).field_w = var3_ref.getHeight((java.awt.image.ImageObserver) (Object) param1);
            ((bi) this).field_o = ((bi) this).field_z;
            ((bi) this).field_p = ((bi) this).field_w;
            ((bi) this).field_t = 0;
            ((bi) this).field_x = 0;
            ((bi) this).field_B = new int[((bi) this).field_z * ((bi) this).field_w];
            var5 = new java.awt.image.PixelGrabber(var3_ref, 0, 0, ((bi) this).field_z, ((bi) this).field_w, ((bi) this).field_B, 0, ((bi) this).field_z);
            boolean discarded$1 = var5.grabPixels();
            break L0;
          }
        } catch (java.lang.Exception decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = (InterruptedException) (Object) decompiledCaughtException;
            break L1;
          }
        }
    }

    void b(int param0, int param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        L0: {
          param0 = param0 + ((bi) this).field_t;
          param1 = param1 + ((bi) this).field_x;
          var4 = param0 + param1 * gf.field_b;
          var5 = 0;
          var6 = ((bi) this).field_w;
          var7 = ((bi) this).field_z;
          var8 = gf.field_b - var7;
          var9 = 0;
          if (param1 >= gf.field_a) {
            break L0;
          } else {
            var10 = gf.field_a - param1;
            var6 = var6 - var10;
            param1 = gf.field_a;
            var5 = var5 + var10 * var7;
            var4 = var4 + var10 * gf.field_b;
            break L0;
          }
        }
        L1: {
          if (param1 + var6 <= gf.field_f) {
            break L1;
          } else {
            var6 = var6 - (param1 + var6 - gf.field_f);
            break L1;
          }
        }
        L2: {
          if (param0 >= gf.field_i) {
            break L2;
          } else {
            var10 = gf.field_i - param0;
            var7 = var7 - var10;
            param0 = gf.field_i;
            var5 = var5 + var10;
            var4 = var4 + var10;
            var9 = var9 + var10;
            var8 = var8 + var10;
            break L2;
          }
        }
        L3: {
          if (param0 + var7 <= gf.field_l) {
            break L3;
          } else {
            var10 = param0 + var7 - gf.field_l;
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
            bi.a(gf.field_h, ((bi) this).field_B, 0, var5, var4, 0, 0, var7, var6, var8, var9, param2);
            return;
          } else {
            return;
          }
        }
    }

    final bi g() {
        int var3 = 0;
        bi var1 = new bi(((bi) this).field_z, ((bi) this).field_w);
        var1.field_o = ((bi) this).field_o;
        var1.field_p = ((bi) this).field_p;
        var1.field_t = ((bi) this).field_t;
        var1.field_x = ((bi) this).field_x;
        int var2 = ((bi) this).field_B.length;
        for (var3 = 0; var3 < var2; var3++) {
            var1.field_B[var3] = ((bi) this).field_B[var3];
        }
        return var1;
    }

    void g(int param0, int param1) {
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
          var3 = ((bi) this).field_z >> 2;
          var4 = ((bi) this).field_w >> 2;
          param0 = param0 + ((bi) this).field_t / 4;
          param1 = param1 + ((bi) this).field_x / 4;
          if (param0 >= gf.field_i) {
            stackOut_2_0 = 0;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          } else {
            stackOut_1_0 = gf.field_i - param0 << 2;
            stackIn_3_0 = stackOut_1_0;
            break L0;
          }
        }
        L1: {
          var5 = stackIn_3_0;
          if (param0 + var3 <= gf.field_l) {
            stackOut_5_0 = ((bi) this).field_z - 4;
            stackIn_6_0 = stackOut_5_0;
            break L1;
          } else {
            stackOut_4_0 = (gf.field_l - param0 << 2) - 4;
            stackIn_6_0 = stackOut_4_0;
            break L1;
          }
        }
        L2: {
          var6 = stackIn_6_0;
          if (param1 >= gf.field_a) {
            stackOut_8_0 = 0;
            stackIn_9_0 = stackOut_8_0;
            break L2;
          } else {
            stackOut_7_0 = gf.field_a - param1 << 2;
            stackIn_9_0 = stackOut_7_0;
            break L2;
          }
        }
        L3: {
          var7 = stackIn_9_0;
          if (param1 + var4 <= gf.field_f) {
            stackOut_11_0 = ((bi) this).field_w - 4;
            stackIn_12_0 = stackOut_11_0;
            break L3;
          } else {
            stackOut_10_0 = (gf.field_f - param1 << 2) - 4;
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
            var10 = var9 * ((bi) this).field_z + var5;
            var11 = (param1 + (var9 >> 2)) * gf.field_b + (param0 + (var5 >> 2));
            var12 = var5;
            L5: while (true) {
              if (var12 > var6) {
                var9 += 4;
                continue L4;
              } else {
                var13 = 0;
                var14 = 0;
                var15 = 0;
                var16 = 0;
                L6: while (true) {
                  if (var16 >= 4) {
                    gf.field_h[var11] = (var14 & 267390960 | var15 & 1044480) >> 4;
                    var12 += 4;
                    var10 += 4;
                    var11++;
                    continue L5;
                  } else {
                    var17 = 0;
                    L7: while (true) {
                      if (var17 >= 4) {
                        var16++;
                        continue L6;
                      } else {
                        L8: {
                          var13 = ((bi) this).field_B[var10 + var16 * ((bi) this).field_z + var17];
                          if (var13 != 0) {
                            break L8;
                          } else {
                            var13 = gf.field_h[var11];
                            break L8;
                          }
                        }
                        var14 = var14 + (var13 & 16711935);
                        var15 = var15 + (var13 & 65280);
                        var17++;
                        continue L7;
                      }
                    }
                  }
                }
              }
            }
          }
        }
    }

    void c(int param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        L0: {
          param0 = param0 + ((bi) this).field_t;
          param1 = param1 + ((bi) this).field_x;
          var3 = param0 + param1 * gf.field_b;
          var4 = 0;
          var5 = ((bi) this).field_w;
          var6 = ((bi) this).field_z;
          var7 = gf.field_b - var6;
          var8 = 0;
          if (param1 >= gf.field_a) {
            break L0;
          } else {
            var9 = gf.field_a - param1;
            var5 = var5 - var9;
            param1 = gf.field_a;
            var4 = var4 + var9 * var6;
            var3 = var3 + var9 * gf.field_b;
            break L0;
          }
        }
        L1: {
          if (param1 + var5 <= gf.field_f) {
            break L1;
          } else {
            var5 = var5 - (param1 + var5 - gf.field_f);
            break L1;
          }
        }
        L2: {
          if (param0 >= gf.field_i) {
            break L2;
          } else {
            var9 = gf.field_i - param0;
            var6 = var6 - var9;
            param0 = gf.field_i;
            var4 = var4 + var9;
            var3 = var3 + var9;
            var8 = var8 + var9;
            var7 = var7 + var9;
            break L2;
          }
        }
        L3: {
          if (param0 + var6 <= gf.field_l) {
            break L3;
          } else {
            var9 = param0 + var6 - gf.field_l;
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
            bi.a(gf.field_h, ((bi) this).field_B, var4, var3, var6, var5, var7, var8);
            return;
          } else {
            return;
          }
        }
    }

    private final static void b(int[] param0, int[] param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9) {
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        var10 = 256 - param9;
        var11 = -param6;
        L0: while (true) {
          if (var11 >= 0) {
            return;
          } else {
            var12 = -param5;
            L1: while (true) {
              if (var12 >= 0) {
                param4 = param4 + param7;
                param3 = param3 + param8;
                var11++;
                continue L0;
              } else {
                int incrementValue$66 = param3;
                param3++;
                param2 = param1[incrementValue$66];
                if (param2 == 0) {
                  param4++;
                  var12++;
                  continue L1;
                } else {
                  var13 = param0[param4];
                  int incrementValue$67 = param4;
                  param4++;
                  param0[incrementValue$67] = ((param2 & 16711935) * param9 + (var13 & 16711935) * var10 & -16711936) + ((param2 & 65280) * param9 + (var13 & 65280) * var10 & 16711680) >> 8;
                  var12++;
                  continue L1;
                }
              }
            }
          }
        }
    }

    private final static void a(int[] param0, int[] param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        int var8 = 0;
        int var9 = 0;
        for (var8 = -param5; var8 < 0; var8++) {
            var9 = param3 + param4 - 3;
            while (param3 < var9) {
                int incrementValue$0 = param3;
                param3++;
                int incrementValue$1 = param2;
                param2++;
                param0[incrementValue$0] = param1[incrementValue$1];
                int incrementValue$2 = param3;
                param3++;
                int incrementValue$3 = param2;
                param2++;
                param0[incrementValue$2] = param1[incrementValue$3];
                int incrementValue$4 = param3;
                param3++;
                int incrementValue$5 = param2;
                param2++;
                param0[incrementValue$4] = param1[incrementValue$5];
                int incrementValue$6 = param3;
                param3++;
                int incrementValue$7 = param2;
                param2++;
                param0[incrementValue$6] = param1[incrementValue$7];
            }
            var9 += 3;
            while (param3 < var9) {
                int incrementValue$8 = param3;
                param3++;
                int incrementValue$9 = param2;
                param2++;
                param0[incrementValue$8] = param1[incrementValue$9];
            }
            param3 = param3 + param6;
            param2 = param2 + param7;
        }
    }

    private final static void b(int[] param0, int[] param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8) {
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        var9 = -(param5 >> 2);
        param5 = -(param5 & 3);
        var10 = -param6;
        L0: while (true) {
          if (var10 >= 0) {
            return;
          } else {
            var11 = var9;
            L1: while (true) {
              if (var11 >= 0) {
                var11 = param5;
                L2: while (true) {
                  if (var11 >= 0) {
                    param4 = param4 + param7;
                    param3 = param3 + param8;
                    var10++;
                    continue L0;
                  } else {
                    int incrementValue$218 = param3;
                    param3++;
                    if (param1[incrementValue$218] == 0) {
                      param4++;
                      var11++;
                      continue L2;
                    } else {
                      int incrementValue$219 = param4;
                      param4++;
                      param0[incrementValue$219] = param2;
                      var11++;
                      continue L2;
                    }
                  }
                }
              } else {
                L3: {
                  int incrementValue$220 = param3;
                  param3++;
                  if (param1[incrementValue$220] == 0) {
                    param4++;
                    break L3;
                  } else {
                    int incrementValue$221 = param4;
                    param4++;
                    param0[incrementValue$221] = param2;
                    break L3;
                  }
                }
                L4: {
                  int incrementValue$222 = param3;
                  param3++;
                  if (param1[incrementValue$222] == 0) {
                    param4++;
                    break L4;
                  } else {
                    int incrementValue$223 = param4;
                    param4++;
                    param0[incrementValue$223] = param2;
                    break L4;
                  }
                }
                L5: {
                  int incrementValue$224 = param3;
                  param3++;
                  if (param1[incrementValue$224] == 0) {
                    param4++;
                    break L5;
                  } else {
                    int incrementValue$225 = param4;
                    param4++;
                    param0[incrementValue$225] = param2;
                    break L5;
                  }
                }
                int incrementValue$226 = param3;
                param3++;
                if (param1[incrementValue$226] == 0) {
                  param4++;
                  var11++;
                  continue L1;
                } else {
                  int incrementValue$227 = param4;
                  param4++;
                  param0[incrementValue$227] = param2;
                  var11++;
                  continue L1;
                }
              }
            }
          }
        }
    }

    final void a() {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int[] var1 = ((bi) this).field_B;
        for (var2 = ((bi) this).field_w - 1; var2 >= 0; var2--) {
            var3 = var2 * ((bi) this).field_z;
            var4 = (var2 + 1) * ((bi) this).field_z;
            while (var3 < var4) {
                var4--;
                var5 = var1[var3];
                var1[var3] = var1[var4];
                var1[var4] = var5;
                var3++;
            }
        }
        ((bi) this).field_t = ((bi) this).field_o - ((bi) this).field_z - ((bi) this).field_t;
    }

    final void f(int param0) {
        int[] var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        var2 = new int[((bi) this).field_z * ((bi) this).field_w];
        var3 = 0;
        var4 = 0;
        L0: while (true) {
          if (var4 >= ((bi) this).field_w) {
            ((bi) this).field_B = var2;
            return;
          } else {
            var5 = 0;
            L1: while (true) {
              if (var5 >= ((bi) this).field_z) {
                var4++;
                continue L0;
              } else {
                L2: {
                  var6 = ((bi) this).field_B[var3];
                  if (var6 != 0) {
                    break L2;
                  } else {
                    L3: {
                      if (var5 <= 0) {
                        break L3;
                      } else {
                        if (((bi) this).field_B[var3 - 1] == 0) {
                          break L3;
                        } else {
                          var6 = param0;
                          break L2;
                        }
                      }
                    }
                    L4: {
                      if (var4 <= 0) {
                        break L4;
                      } else {
                        if (((bi) this).field_B[var3 - ((bi) this).field_z] == 0) {
                          break L4;
                        } else {
                          var6 = param0;
                          break L2;
                        }
                      }
                    }
                    L5: {
                      if (var5 >= ((bi) this).field_z - 1) {
                        break L5;
                      } else {
                        if (((bi) this).field_B[var3 + 1] == 0) {
                          break L5;
                        } else {
                          var6 = param0;
                          break L2;
                        }
                      }
                    }
                    if (var4 >= ((bi) this).field_w - 1) {
                      break L2;
                    } else {
                      if (((bi) this).field_B[var3 + ((bi) this).field_z] == 0) {
                        break L2;
                      } else {
                        var6 = param0;
                        break L2;
                      }
                    }
                  }
                }
                int incrementValue$2 = var3;
                var3++;
                var2[incrementValue$2] = var6;
                var5++;
                continue L1;
              }
            }
          }
        }
    }
}
