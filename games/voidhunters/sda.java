/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sda extends oi {
    int[] field_F;

    final void a(int param0, int param1, int param2, int param3, int[] param4, int param5, int param6) {
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        param6 = param6 - param2;
        for (var8 = 0; var8 < param3; var8++) {
            var9 = (param1 + var8) * param2 + param0;
            for (var10 = 0; var10 < param2; var10++) {
                int incrementValue$0 = param5;
                param5++;
                ((sda) this).field_F[var9 + var10] = param4[incrementValue$0];
            }
            param5 = param5 + param6;
        }
    }

    sda(sob param0, int param1, int param2) {
        super(param0, param1, param2);
        ((sda) this).field_F = new int[param1 * param2];
    }

    final void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18_int = 0;
        int[] var18 = null;
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
        int[] var33 = null;
        int[] var34 = null;
        int[] var35 = null;
        int[] var36 = null;
        if (!((sda) this).field_w.g()) {
          L0: {
            if (param2 <= 0) {
              break L0;
            } else {
              if (param3 > 0) {
                L1: {
                  var9 = 0;
                  var10 = 0;
                  var11 = ((sda) this).field_w.field_i;
                  var12 = ((sda) this).field_k + ((sda) this).field_e + ((sda) this).field_D;
                  var13 = ((sda) this).field_n + ((sda) this).field_q + ((sda) this).field_j;
                  var14 = (var12 << 16) / param2;
                  var15 = (var13 << 16) / param3;
                  if (((sda) this).field_k <= 0) {
                    break L1;
                  } else {
                    var16 = ((((sda) this).field_k << 16) + var14 - 1) / var14;
                    param0 = param0 + var16;
                    var9 = var9 + (var16 * var14 - (((sda) this).field_k << 16));
                    break L1;
                  }
                }
                L2: {
                  if (((sda) this).field_n <= 0) {
                    break L2;
                  } else {
                    var16 = ((((sda) this).field_n << 16) + var15 - 1) / var15;
                    param1 = param1 + var16;
                    var10 = var10 + (var16 * var15 - (((sda) this).field_n << 16));
                    break L2;
                  }
                }
                L3: {
                  if (((sda) this).field_e >= var12) {
                    break L3;
                  } else {
                    param2 = ((((sda) this).field_e << 16) - var9 + var14 - 1) / var14;
                    break L3;
                  }
                }
                L4: {
                  if (((sda) this).field_q >= var13) {
                    break L4;
                  } else {
                    param3 = ((((sda) this).field_q << 16) - var10 + var15 - 1) / var15;
                    break L4;
                  }
                }
                L5: {
                  var16 = param0 + param1 * var11;
                  var17 = var11 - param2;
                  if (param1 + param3 <= ((sda) this).field_w.field_p) {
                    break L5;
                  } else {
                    param3 = param3 - (param1 + param3 - ((sda) this).field_w.field_p);
                    break L5;
                  }
                }
                L6: {
                  if (param1 >= ((sda) this).field_w.field_n) {
                    break L6;
                  } else {
                    var18_int = ((sda) this).field_w.field_n - param1;
                    param3 = param3 - var18_int;
                    var16 = var16 + var18_int * var11;
                    var10 = var10 + var15 * var18_int;
                    break L6;
                  }
                }
                L7: {
                  if (param0 + param2 <= ((sda) this).field_w.field_A) {
                    break L7;
                  } else {
                    var18_int = param0 + param2 - ((sda) this).field_w.field_A;
                    param2 = param2 - var18_int;
                    var17 = var17 + var18_int;
                    break L7;
                  }
                }
                L8: {
                  if (param0 >= ((sda) this).field_w.field_H) {
                    break L8;
                  } else {
                    var18_int = ((sda) this).field_w.field_H - param0;
                    param2 = param2 - var18_int;
                    var16 = var16 + var18_int;
                    var9 = var9 + var14 * var18_int;
                    var17 = var17 + var18_int;
                    break L8;
                  }
                }
                L9: {
                  var36 = ((sda) this).field_w.field_k;
                  var35 = var36;
                  var34 = var35;
                  var33 = var34;
                  var18 = var33;
                  if (param6 != 0) {
                    if (param6 != 1) {
                      if (param6 != 2) {
                        throw new IllegalArgumentException();
                      } else {
                        if (param4 != 1) {
                          if (param4 != 0) {
                            if (param4 != 3) {
                              if (param4 != 2) {
                                throw new IllegalArgumentException();
                              } else {
                                var19 = param5 >>> 24;
                                var20 = 256 - var19;
                                var21 = (param5 & 16711935) * var20 & -16711936;
                                var22 = (param5 & 65280) * var20 & 16711680;
                                param5 = (var21 | var22) >>> 8;
                                var23 = var9;
                                var24 = -param3;
                                L10: while (true) {
                                  if (var24 >= 0) {
                                    break L9;
                                  } else {
                                    var25 = (var10 >> 16) * ((sda) this).field_e;
                                    var26 = -param2;
                                    L11: while (true) {
                                      if (var26 >= 0) {
                                        var10 = var10 + var15;
                                        var9 = var23;
                                        var16 = var16 + var17;
                                        var24++;
                                        continue L10;
                                      } else {
                                        L12: {
                                          var27 = ((sda) this).field_F[(var9 >> 16) + var25];
                                          if (var27 == 0) {
                                            var16++;
                                            break L12;
                                          } else {
                                            var21 = (var27 & 16711935) * var19 & -16711936;
                                            var22 = (var27 & 65280) * var19 & 16711680;
                                            var27 = ((var21 | var22) >>> 8) + param5;
                                            var28 = var36[var16];
                                            var29 = var27 + var28;
                                            var30 = (var27 & 16711935) + (var28 & 16711935);
                                            var28 = (var30 & 16777472) + (var29 - var30 & 65536);
                                            int incrementValue$14 = var16;
                                            var16++;
                                            var18[incrementValue$14] = var29 - var28 | var28 - (var28 >>> 8);
                                            break L12;
                                          }
                                        }
                                        var9 = var9 + var14;
                                        var26++;
                                        continue L11;
                                      }
                                    }
                                  }
                                }
                              }
                            } else {
                              var19 = var9;
                              var20 = -param3;
                              L13: while (true) {
                                if (var20 >= 0) {
                                  break L9;
                                } else {
                                  var21 = (var10 >> 16) * ((sda) this).field_e;
                                  var22 = -param2;
                                  L14: while (true) {
                                    if (var22 >= 0) {
                                      var10 = var10 + var15;
                                      var9 = var19;
                                      var16 = var16 + var17;
                                      var20++;
                                      continue L13;
                                    } else {
                                      var23 = ((sda) this).field_F[(var9 >> 16) + var21];
                                      var24 = var23 + param5;
                                      var25 = (var23 & 16711935) + (param5 & 16711935);
                                      var26 = (var25 & 16777472) + (var24 - var25 & 65536);
                                      var23 = var24 - var26 | var26 - (var26 >>> 8);
                                      var26 = var36[var16];
                                      var24 = var23 + var26;
                                      var25 = (var23 & 16711935) + (var26 & 16711935);
                                      var26 = (var25 & 16777472) + (var24 - var25 & 65536);
                                      int incrementValue$15 = var16;
                                      var16++;
                                      var18[incrementValue$15] = var24 - var26 | var26 - (var26 >>> 8);
                                      var9 = var9 + var14;
                                      var22++;
                                      continue L14;
                                    }
                                  }
                                }
                              }
                            }
                          } else {
                            var19 = var9;
                            var20 = (param5 & 16711680) >> 16;
                            var21 = (param5 & 65280) >> 8;
                            var22 = param5 & 255;
                            var23 = -param3;
                            L15: while (true) {
                              if (var23 >= 0) {
                                break L9;
                              } else {
                                var24 = (var10 >> 16) * ((sda) this).field_e;
                                var25 = -param2;
                                L16: while (true) {
                                  if (var25 >= 0) {
                                    var10 = var10 + var15;
                                    var9 = var19;
                                    var16 = var16 + var17;
                                    var23++;
                                    continue L15;
                                  } else {
                                    L17: {
                                      var26 = ((sda) this).field_F[(var9 >> 16) + var24];
                                      if (var26 == 0) {
                                        var16++;
                                        break L17;
                                      } else {
                                        var27 = (var26 & 16711680) * var20 & -16777216;
                                        var28 = (var26 & 65280) * var21 & 16711680;
                                        var29 = (var26 & 255) * var22 & 65280;
                                        var26 = (var27 | var28 | var29) >>> 8;
                                        var30 = var36[var16];
                                        var31 = var26 + var30;
                                        var32 = (var26 & 16711935) + (var30 & 16711935);
                                        var30 = (var32 & 16777472) + (var31 - var32 & 65536);
                                        int incrementValue$16 = var16;
                                        var16++;
                                        var18[incrementValue$16] = var31 - var30 | var30 - (var30 >>> 8);
                                        break L17;
                                      }
                                    }
                                    var9 = var9 + var14;
                                    var25++;
                                    continue L16;
                                  }
                                }
                              }
                            }
                          }
                        } else {
                          var19 = var9;
                          var20 = -param3;
                          L18: while (true) {
                            if (var20 >= 0) {
                              break L9;
                            } else {
                              var21 = (var10 >> 16) * ((sda) this).field_e;
                              var22 = -param2;
                              L19: while (true) {
                                if (var22 >= 0) {
                                  var10 = var10 + var15;
                                  var9 = var19;
                                  var16 = var16 + var17;
                                  var20++;
                                  continue L18;
                                } else {
                                  L20: {
                                    var23 = ((sda) this).field_F[(var9 >> 16) + var21];
                                    if (var23 == 0) {
                                      var16++;
                                      break L20;
                                    } else {
                                      var24 = var36[var16];
                                      var25 = var23 + var24;
                                      var26 = (var23 & 16711935) + (var24 & 16711935);
                                      var24 = (var26 & 16777472) + (var25 - var26 & 65536);
                                      int incrementValue$17 = var16;
                                      var16++;
                                      var18[incrementValue$17] = var25 - var24 | var24 - (var24 >>> 8);
                                      break L20;
                                    }
                                  }
                                  var9 = var9 + var14;
                                  var22++;
                                  continue L19;
                                }
                              }
                            }
                          }
                        }
                      }
                    } else {
                      if (param4 != 1) {
                        if (param4 != 0) {
                          if (param4 != 3) {
                            if (param4 != 2) {
                              throw new IllegalArgumentException();
                            } else {
                              var19 = param5 >>> 24;
                              var20 = 256 - var19;
                              var21 = (param5 & 16711935) * var20 & -16711936;
                              var22 = (param5 & 65280) * var20 & 16711680;
                              param5 = (var21 | var22) >>> 8;
                              var23 = var9;
                              var24 = -param3;
                              L21: while (true) {
                                if (var24 >= 0) {
                                  break L9;
                                } else {
                                  var25 = (var10 >> 16) * ((sda) this).field_e;
                                  var26 = -param2;
                                  L22: while (true) {
                                    if (var26 >= 0) {
                                      var10 = var10 + var15;
                                      var9 = var23;
                                      var16 = var16 + var17;
                                      var24++;
                                      continue L21;
                                    } else {
                                      L23: {
                                        var27 = ((sda) this).field_F[(var9 >> 16) + var25];
                                        if (var27 == 0) {
                                          var16++;
                                          break L23;
                                        } else {
                                          var21 = (var27 & 16711935) * var19 & -16711936;
                                          var22 = (var27 & 65280) * var19 & 16711680;
                                          int incrementValue$18 = var16;
                                          var16++;
                                          var18[incrementValue$18] = ((var21 | var22) >>> 8) + param5;
                                          break L23;
                                        }
                                      }
                                      var9 = var9 + var14;
                                      var26++;
                                      continue L22;
                                    }
                                  }
                                }
                              }
                            }
                          } else {
                            var19 = var9;
                            var20 = param5 >>> 24;
                            var21 = 256 - var20;
                            var22 = -param3;
                            L24: while (true) {
                              if (var22 >= 0) {
                                break L9;
                              } else {
                                var23 = (var10 >> 16) * ((sda) this).field_e;
                                var24 = -param2;
                                L25: while (true) {
                                  if (var24 >= 0) {
                                    var10 = var10 + var15;
                                    var9 = var19;
                                    var16 = var16 + var17;
                                    var22++;
                                    continue L24;
                                  } else {
                                    L26: {
                                      var25 = ((sda) this).field_F[(var9 >> 16) + var23];
                                      var26 = var25 + param5;
                                      var27 = (var25 & 16711935) + (param5 & 16711935);
                                      var28 = (var27 & 16777472) + (var26 - var27 & 65536);
                                      var28 = var26 - var28 | var28 - (var28 >>> 8);
                                      if (var25 != 0) {
                                        break L26;
                                      } else {
                                        if (var20 == 255) {
                                          break L26;
                                        } else {
                                          var25 = var28;
                                          var28 = var36[var16];
                                          var28 = ((var25 & 16711935) * var20 + (var28 & 16711935) * var21 & -16711936) + ((var25 & 65280) * var20 + (var28 & 65280) * var21 & 16711680) >> 8;
                                          break L26;
                                        }
                                      }
                                    }
                                    int incrementValue$19 = var16;
                                    var16++;
                                    var18[incrementValue$19] = var28;
                                    var9 = var9 + var14;
                                    var24++;
                                    continue L25;
                                  }
                                }
                              }
                            }
                          }
                        } else {
                          var19 = var9;
                          if ((param5 & 16777215) != 16777215) {
                            var20 = (param5 & 16711680) >> 16;
                            var21 = (param5 & 65280) >> 8;
                            var22 = param5 & 255;
                            var23 = param5 >>> 24;
                            var24 = 256 - var23;
                            var25 = -param3;
                            L27: while (true) {
                              if (var25 >= 0) {
                                break L9;
                              } else {
                                var26 = (var10 >> 16) * ((sda) this).field_e;
                                var27 = -param2;
                                L28: while (true) {
                                  if (var27 >= 0) {
                                    var10 = var10 + var15;
                                    var9 = var19;
                                    var16 = var16 + var17;
                                    var25++;
                                    continue L27;
                                  } else {
                                    L29: {
                                      var28 = ((sda) this).field_F[(var9 >> 16) + var26];
                                      if (var28 == 0) {
                                        var16++;
                                        break L29;
                                      } else {
                                        if (var23 == 255) {
                                          var29 = (var28 & 16711680) * var20 & -16777216;
                                          var30 = (var28 & 65280) * var21 & 16711680;
                                          var31 = (var28 & 255) * var22 & 65280;
                                          int incrementValue$20 = var16;
                                          var16++;
                                          var18[incrementValue$20] = (var29 | var30 | var31) >>> 8;
                                          break L29;
                                        } else {
                                          var29 = (var28 & 16711680) * var20 & -16777216;
                                          var30 = (var28 & 65280) * var21 & 16711680;
                                          var31 = (var28 & 255) * var22 & 65280;
                                          var28 = (var29 | var30 | var31) >>> 8;
                                          var32 = var36[var16];
                                          int incrementValue$21 = var16;
                                          var16++;
                                          var18[incrementValue$21] = ((var28 & 16711935) * var23 + (var32 & 16711935) * var24 & -16711936) + ((var28 & 65280) * var23 + (var32 & 65280) * var24 & 16711680) >> 8;
                                          var9 = var9 + var14;
                                          var27++;
                                          continue L28;
                                        }
                                      }
                                    }
                                    var9 = var9 + var14;
                                    var27++;
                                    continue L28;
                                  }
                                }
                              }
                            }
                          } else {
                            var20 = param5 >>> 24;
                            var21 = 256 - var20;
                            var22 = -param3;
                            L30: while (true) {
                              if (var22 >= 0) {
                                break L9;
                              } else {
                                var23 = (var10 >> 16) * ((sda) this).field_e;
                                var24 = -param2;
                                L31: while (true) {
                                  if (var24 >= 0) {
                                    var10 = var10 + var15;
                                    var9 = var19;
                                    var16 = var16 + var17;
                                    var22++;
                                    continue L30;
                                  } else {
                                    L32: {
                                      var25 = ((sda) this).field_F[(var9 >> 16) + var23];
                                      if (var25 == 0) {
                                        var16++;
                                        break L32;
                                      } else {
                                        var26 = var36[var16];
                                        int incrementValue$22 = var16;
                                        var16++;
                                        var18[incrementValue$22] = ((var25 & 16711935) * var20 + (var26 & 16711935) * var21 & -16711936) + ((var25 & 65280) * var20 + (var26 & 65280) * var21 & 16711680) >> 8;
                                        break L32;
                                      }
                                    }
                                    var9 = var9 + var14;
                                    var24++;
                                    continue L31;
                                  }
                                }
                              }
                            }
                          }
                        }
                      } else {
                        var19 = var9;
                        var20 = -param3;
                        L33: while (true) {
                          if (var20 >= 0) {
                            break L9;
                          } else {
                            var21 = (var10 >> 16) * ((sda) this).field_e;
                            var22 = -param2;
                            L34: while (true) {
                              if (var22 >= 0) {
                                var10 = var10 + var15;
                                var9 = var19;
                                var16 = var16 + var17;
                                var20++;
                                continue L33;
                              } else {
                                L35: {
                                  var23 = ((sda) this).field_F[(var9 >> 16) + var21];
                                  if (var23 == 0) {
                                    var16++;
                                    break L35;
                                  } else {
                                    int incrementValue$23 = var16;
                                    var16++;
                                    var18[incrementValue$23] = var23;
                                    break L35;
                                  }
                                }
                                var9 = var9 + var14;
                                var22++;
                                continue L34;
                              }
                            }
                          }
                        }
                      }
                    }
                  } else {
                    if (param4 != 1) {
                      if (param4 != 0) {
                        if (param4 != 3) {
                          if (param4 != 2) {
                            throw new IllegalArgumentException();
                          } else {
                            var19 = param5 >>> 24;
                            var20 = 256 - var19;
                            var21 = (param5 & 16711935) * var20 & -16711936;
                            var22 = (param5 & 65280) * var20 & 16711680;
                            param5 = (var21 | var22) >>> 8;
                            var23 = var9;
                            var24 = -param3;
                            L36: while (true) {
                              if (var24 >= 0) {
                                break L9;
                              } else {
                                var25 = (var10 >> 16) * ((sda) this).field_e;
                                var26 = -param2;
                                L37: while (true) {
                                  if (var26 >= 0) {
                                    var10 = var10 + var15;
                                    var9 = var23;
                                    var16 = var16 + var17;
                                    var24++;
                                    continue L36;
                                  } else {
                                    var27 = ((sda) this).field_F[(var9 >> 16) + var25];
                                    var21 = (var27 & 16711935) * var19 & -16711936;
                                    var22 = (var27 & 65280) * var19 & 16711680;
                                    int incrementValue$24 = var16;
                                    var16++;
                                    var18[incrementValue$24] = ((var21 | var22) >>> 8) + param5;
                                    var9 = var9 + var14;
                                    var26++;
                                    continue L37;
                                  }
                                }
                              }
                            }
                          }
                        } else {
                          var19 = var9;
                          var20 = -param3;
                          L38: while (true) {
                            if (var20 >= 0) {
                              break L9;
                            } else {
                              var21 = (var10 >> 16) * ((sda) this).field_e;
                              var22 = -param2;
                              L39: while (true) {
                                if (var22 >= 0) {
                                  var10 = var10 + var15;
                                  var9 = var19;
                                  var16 = var16 + var17;
                                  var20++;
                                  continue L38;
                                } else {
                                  var23 = ((sda) this).field_F[(var9 >> 16) + var21];
                                  var24 = var23 + param5;
                                  var25 = (var23 & 16711935) + (param5 & 16711935);
                                  var26 = (var25 & 16777472) + (var24 - var25 & 65536);
                                  int incrementValue$25 = var16;
                                  var16++;
                                  var18[incrementValue$25] = var24 - var26 | var26 - (var26 >>> 8);
                                  var9 = var9 + var14;
                                  var22++;
                                  continue L39;
                                }
                              }
                            }
                          }
                        }
                      } else {
                        var19 = (param5 & 16711680) >> 16;
                        var20 = (param5 & 65280) >> 8;
                        var21 = param5 & 255;
                        var22 = var9;
                        var23 = -param3;
                        L40: while (true) {
                          if (var23 >= 0) {
                            break L9;
                          } else {
                            var24 = (var10 >> 16) * ((sda) this).field_e;
                            var25 = -param2;
                            L41: while (true) {
                              if (var25 >= 0) {
                                var10 = var10 + var15;
                                var9 = var22;
                                var16 = var16 + var17;
                                var23++;
                                continue L40;
                              } else {
                                var26 = ((sda) this).field_F[(var9 >> 16) + var24];
                                var27 = (var26 & 16711680) * var19 & -16777216;
                                var28 = (var26 & 65280) * var20 & 16711680;
                                var29 = (var26 & 255) * var21 & 65280;
                                int incrementValue$26 = var16;
                                var16++;
                                var18[incrementValue$26] = (var27 | var28 | var29) >>> 8;
                                var9 = var9 + var14;
                                var25++;
                                continue L41;
                              }
                            }
                          }
                        }
                      }
                    } else {
                      var19 = var9;
                      var20 = -param3;
                      L42: while (true) {
                        if (var20 >= 0) {
                          break L0;
                        } else {
                          var21 = (var10 >> 16) * ((sda) this).field_e;
                          var22 = -param2;
                          L43: while (true) {
                            if (var22 >= 0) {
                              var10 = var10 + var15;
                              var9 = var19;
                              var16 = var16 + var17;
                              var20++;
                              continue L42;
                            } else {
                              int incrementValue$27 = var16;
                              var16++;
                              var18[incrementValue$27] = ((sda) this).field_F[(var9 >> 16) + var21];
                              var9 = var9 + var14;
                              var22++;
                              continue L43;
                            }
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
            }
          }
          return;
        } else {
          throw new IllegalStateException();
        }
    }

    sda(sob param0, int[] param1, int param2, int param3, int param4, int param5, boolean param6) {
        super(param0, param4, param5);
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int[] stackIn_9_0 = null;
        int stackIn_9_1 = 0;
        int[] stackIn_10_0 = null;
        int stackIn_10_1 = 0;
        int[] stackIn_11_0 = null;
        int stackIn_11_1 = 0;
        int stackIn_11_2 = 0;
        int[] stackOut_8_0 = null;
        int stackOut_8_1 = 0;
        int[] stackOut_10_0 = null;
        int stackOut_10_1 = 0;
        int stackOut_10_2 = 0;
        int[] stackOut_9_0 = null;
        int stackOut_9_1 = 0;
        int stackOut_9_2 = 0;
        L0: {
          if (!param6) {
            ((sda) this).field_F = param1;
            break L0;
          } else {
            ((sda) this).field_F = new int[param4 * param5];
            break L0;
          }
        }
        param3 = param3 - ((sda) this).field_e;
        var8 = 0;
        var9 = 0;
        L1: while (true) {
          if (var9 >= param5) {
            return;
          } else {
            var10 = 0;
            L2: while (true) {
              if (var10 >= param4) {
                param2 = param2 + param3;
                var9++;
                continue L1;
              } else {
                int incrementValue$178 = param2;
                param2++;
                var11 = param1[incrementValue$178];
                if (var11 >>> 24 != 255) {
                  int incrementValue$179 = var8;
                  var8++;
                  ((sda) this).field_F[incrementValue$179] = 0;
                  var10++;
                  continue L2;
                } else {
                  L3: {
                    int incrementValue$180 = var8;
                    var8++;
                    stackOut_8_0 = ((sda) this).field_F;
                    stackOut_8_1 = incrementValue$180;
                    stackIn_10_0 = stackOut_8_0;
                    stackIn_10_1 = stackOut_8_1;
                    stackIn_9_0 = stackOut_8_0;
                    stackIn_9_1 = stackOut_8_1;
                    if ((var11 & 16777215) != 0) {
                      stackOut_10_0 = (int[]) (Object) stackIn_10_0;
                      stackOut_10_1 = stackIn_10_1;
                      stackOut_10_2 = var11;
                      stackIn_11_0 = stackOut_10_0;
                      stackIn_11_1 = stackOut_10_1;
                      stackIn_11_2 = stackOut_10_2;
                      break L3;
                    } else {
                      stackOut_9_0 = (int[]) (Object) stackIn_9_0;
                      stackOut_9_1 = stackIn_9_1;
                      stackOut_9_2 = -16777215;
                      stackIn_11_0 = stackOut_9_0;
                      stackIn_11_1 = stackOut_9_1;
                      stackIn_11_2 = stackOut_9_2;
                      break L3;
                    }
                  }
                  stackIn_11_0[stackIn_11_1] = stackIn_11_2;
                  var10++;
                  continue L2;
                }
              }
            }
          }
        }
    }

    final void a(int param0, int param1, int param2, int param3, int param4) {
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13_int = 0;
        int[] var13 = null;
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
        int[] var26 = null;
        int[] var27 = null;
        int[] var28 = null;
        int[] var29 = null;
        if (!((sda) this).field_w.g()) {
          L0: {
            var6 = ((sda) this).field_w.field_i;
            param0 = param0 + ((sda) this).field_k;
            param1 = param1 + ((sda) this).field_n;
            var7 = param1 * var6 + param0;
            var8 = 0;
            var9 = ((sda) this).field_q;
            var10 = ((sda) this).field_e;
            var11 = var6 - var10;
            var12 = 0;
            if (param1 >= ((sda) this).field_w.field_n) {
              break L0;
            } else {
              var13_int = ((sda) this).field_w.field_n - param1;
              var9 = var9 - var13_int;
              param1 = ((sda) this).field_w.field_n;
              var8 = var8 + var13_int * var10;
              var7 = var7 + var13_int * var6;
              break L0;
            }
          }
          L1: {
            if (param1 + var9 <= ((sda) this).field_w.field_p) {
              break L1;
            } else {
              var9 = var9 - (param1 + var9 - ((sda) this).field_w.field_p);
              break L1;
            }
          }
          L2: {
            if (param0 >= ((sda) this).field_w.field_H) {
              break L2;
            } else {
              var13_int = ((sda) this).field_w.field_H - param0;
              var10 = var10 - var13_int;
              param0 = ((sda) this).field_w.field_H;
              var8 = var8 + var13_int;
              var7 = var7 + var13_int;
              var12 = var12 + var13_int;
              var11 = var11 + var13_int;
              break L2;
            }
          }
          L3: {
            if (param0 + var10 <= ((sda) this).field_w.field_A) {
              break L3;
            } else {
              var13_int = param0 + var10 - ((sda) this).field_w.field_A;
              var10 = var10 - var13_int;
              var12 = var12 + var13_int;
              var11 = var11 + var13_int;
              break L3;
            }
          }
          L4: {
            if (var10 <= 0) {
              break L4;
            } else {
              if (var9 > 0) {
                L5: {
                  var29 = ((sda) this).field_w.field_k;
                  var28 = var29;
                  var27 = var28;
                  var26 = var27;
                  var13 = var26;
                  if (param4 != 0) {
                    if (param4 != 1) {
                      if (param4 != 2) {
                        throw new IllegalArgumentException();
                      } else {
                        if (param2 != 1) {
                          if (param2 != 0) {
                            if (param2 != 3) {
                              if (param2 != 2) {
                                throw new IllegalArgumentException();
                              } else {
                                var14 = param3 >>> 24;
                                var15 = 256 - var14;
                                var16 = (param3 & 16711935) * var15 & -16711936;
                                var17 = (param3 & 65280) * var15 & 16711680;
                                param3 = (var16 | var17) >>> 8;
                                var18 = -var9;
                                L6: while (true) {
                                  if (var18 >= 0) {
                                    break L5;
                                  } else {
                                    var19 = -var10;
                                    L7: while (true) {
                                      if (var19 >= 0) {
                                        var7 = var7 + var11;
                                        var8 = var8 + var12;
                                        var18++;
                                        continue L6;
                                      } else {
                                        int incrementValue$43 = var8;
                                        var8++;
                                        var20 = ((sda) this).field_F[incrementValue$43];
                                        if (var20 == 0) {
                                          var7++;
                                          var19++;
                                          continue L7;
                                        } else {
                                          var16 = (var20 & 16711935) * var14 & -16711936;
                                          var17 = (var20 & 65280) * var14 & 16711680;
                                          var20 = ((var16 | var17) >>> 8) + param3;
                                          var21 = var29[var7];
                                          var22 = var20 + var21;
                                          var23 = (var20 & 16711935) + (var21 & 16711935);
                                          var21 = (var23 & 16777472) + (var22 - var23 & 65536);
                                          int incrementValue$44 = var7;
                                          var7++;
                                          var13[incrementValue$44] = var22 - var21 | var21 - (var21 >>> 8);
                                          var19++;
                                          continue L7;
                                        }
                                      }
                                    }
                                  }
                                }
                              }
                            } else {
                              var14 = -var9;
                              L8: while (true) {
                                if (var14 >= 0) {
                                  break L5;
                                } else {
                                  var15 = -var10;
                                  L9: while (true) {
                                    if (var15 >= 0) {
                                      var7 = var7 + var11;
                                      var8 = var8 + var12;
                                      var14++;
                                      continue L8;
                                    } else {
                                      int incrementValue$45 = var8;
                                      var8++;
                                      var16 = ((sda) this).field_F[incrementValue$45];
                                      var17 = var16 + param3;
                                      var18 = (var16 & 16711935) + (param3 & 16711935);
                                      var19 = (var18 & 16777472) + (var17 - var18 & 65536);
                                      var16 = var17 - var19 | var19 - (var19 >>> 8);
                                      var19 = var29[var7];
                                      var17 = var16 + var19;
                                      var18 = (var16 & 16711935) + (var19 & 16711935);
                                      var19 = (var18 & 16777472) + (var17 - var18 & 65536);
                                      int incrementValue$46 = var7;
                                      var7++;
                                      var13[incrementValue$46] = var17 - var19 | var19 - (var19 >>> 8);
                                      var15++;
                                      continue L9;
                                    }
                                  }
                                }
                              }
                            }
                          } else {
                            var14 = (param3 & 16711680) >> 16;
                            var15 = (param3 & 65280) >> 8;
                            var16 = param3 & 255;
                            var17 = -var9;
                            L10: while (true) {
                              if (var17 >= 0) {
                                break L5;
                              } else {
                                var18 = -var10;
                                L11: while (true) {
                                  if (var18 >= 0) {
                                    var7 = var7 + var11;
                                    var8 = var8 + var12;
                                    var17++;
                                    continue L10;
                                  } else {
                                    int incrementValue$47 = var8;
                                    var8++;
                                    var19 = ((sda) this).field_F[incrementValue$47];
                                    if (var19 == 0) {
                                      var7++;
                                      var18++;
                                      continue L11;
                                    } else {
                                      var20 = (var19 & 16711680) * var14 & -16777216;
                                      var21 = (var19 & 65280) * var15 & 16711680;
                                      var22 = (var19 & 255) * var16 & 65280;
                                      var19 = (var20 | var21 | var22) >>> 8;
                                      var23 = var29[var7];
                                      var24 = var19 + var23;
                                      var25 = (var19 & 16711935) + (var23 & 16711935);
                                      var23 = (var25 & 16777472) + (var24 - var25 & 65536);
                                      int incrementValue$48 = var7;
                                      var7++;
                                      var13[incrementValue$48] = var24 - var23 | var23 - (var23 >>> 8);
                                      var18++;
                                      continue L11;
                                    }
                                  }
                                }
                              }
                            }
                          }
                        } else {
                          var14 = -var9;
                          L12: while (true) {
                            if (var14 >= 0) {
                              break L5;
                            } else {
                              var15 = -var10;
                              L13: while (true) {
                                if (var15 >= 0) {
                                  var7 = var7 + var11;
                                  var8 = var8 + var12;
                                  var14++;
                                  continue L12;
                                } else {
                                  int incrementValue$49 = var8;
                                  var8++;
                                  var16 = ((sda) this).field_F[incrementValue$49];
                                  if (var16 == 0) {
                                    var7++;
                                    var15++;
                                    continue L13;
                                  } else {
                                    var17 = var29[var7];
                                    var18 = var16 + var17;
                                    var19 = (var16 & 16711935) + (var17 & 16711935);
                                    var17 = (var19 & 16777472) + (var18 - var19 & 65536);
                                    int incrementValue$50 = var7;
                                    var7++;
                                    var13[incrementValue$50] = var18 - var17 | var17 - (var17 >>> 8);
                                    var15++;
                                    continue L13;
                                  }
                                }
                              }
                            }
                          }
                        }
                      }
                    } else {
                      if (param2 != 1) {
                        if (param2 != 0) {
                          if (param2 != 3) {
                            if (param2 != 2) {
                              throw new IllegalArgumentException();
                            } else {
                              var14 = param3 >>> 24;
                              var15 = 256 - var14;
                              var16 = (param3 & 16711935) * var15 & -16711936;
                              var17 = (param3 & 65280) * var15 & 16711680;
                              param3 = (var16 | var17) >>> 8;
                              var18 = -var9;
                              L14: while (true) {
                                if (var18 >= 0) {
                                  break L5;
                                } else {
                                  var19 = -var10;
                                  L15: while (true) {
                                    if (var19 >= 0) {
                                      var7 = var7 + var11;
                                      var8 = var8 + var12;
                                      var18++;
                                      continue L14;
                                    } else {
                                      int incrementValue$51 = var8;
                                      var8++;
                                      var20 = ((sda) this).field_F[incrementValue$51];
                                      if (var20 == 0) {
                                        var7++;
                                        var19++;
                                        continue L15;
                                      } else {
                                        var16 = (var20 & 16711935) * var14 & -16711936;
                                        var17 = (var20 & 65280) * var14 & 16711680;
                                        int incrementValue$52 = var7;
                                        var7++;
                                        var13[incrementValue$52] = ((var16 | var17) >>> 8) + param3;
                                        var19++;
                                        continue L15;
                                      }
                                    }
                                  }
                                }
                              }
                            }
                          } else {
                            var14 = param3 >>> 24;
                            var15 = 256 - var14;
                            var16 = -var9;
                            L16: while (true) {
                              if (var16 >= 0) {
                                break L5;
                              } else {
                                var17 = -var10;
                                L17: while (true) {
                                  if (var17 >= 0) {
                                    var7 = var7 + var11;
                                    var8 = var8 + var12;
                                    var16++;
                                    continue L16;
                                  } else {
                                    L18: {
                                      int incrementValue$53 = var8;
                                      var8++;
                                      var18 = ((sda) this).field_F[incrementValue$53];
                                      var19 = var18 + param3;
                                      var20 = (var18 & 16711935) + (param3 & 16711935);
                                      var21 = (var20 & 16777472) + (var19 - var20 & 65536);
                                      var21 = var19 - var21 | var21 - (var21 >>> 8);
                                      if (var18 != 0) {
                                        break L18;
                                      } else {
                                        if (var14 == 255) {
                                          break L18;
                                        } else {
                                          var18 = var21;
                                          var21 = var29[var7];
                                          var21 = ((var18 & 16711935) * var14 + (var21 & 16711935) * var15 & -16711936) + ((var18 & 65280) * var14 + (var21 & 65280) * var15 & 16711680) >> 8;
                                          break L18;
                                        }
                                      }
                                    }
                                    int incrementValue$54 = var7;
                                    var7++;
                                    var13[incrementValue$54] = var21;
                                    var17++;
                                    continue L17;
                                  }
                                }
                              }
                            }
                          }
                        } else {
                          if ((param3 & 16777215) != 16777215) {
                            var14 = (param3 & 16711680) >> 16;
                            var15 = (param3 & 65280) >> 8;
                            var16 = param3 & 255;
                            var17 = param3 >>> 24;
                            var18 = 256 - var17;
                            var19 = -var9;
                            L19: while (true) {
                              if (var19 >= 0) {
                                break L5;
                              } else {
                                var20 = -var10;
                                L20: while (true) {
                                  if (var20 >= 0) {
                                    var7 = var7 + var11;
                                    var8 = var8 + var12;
                                    var19++;
                                    continue L19;
                                  } else {
                                    int incrementValue$55 = var8;
                                    var8++;
                                    var21 = ((sda) this).field_F[incrementValue$55];
                                    if (var21 == 0) {
                                      var7++;
                                      var20++;
                                      continue L20;
                                    } else {
                                      if (var17 == 255) {
                                        var22 = (var21 & 16711680) * var14 & -16777216;
                                        var23 = (var21 & 65280) * var15 & 16711680;
                                        var24 = (var21 & 255) * var16 & 65280;
                                        int incrementValue$56 = var7;
                                        var7++;
                                        var13[incrementValue$56] = (var22 | var23 | var24) >>> 8;
                                        var20++;
                                        continue L20;
                                      } else {
                                        var22 = (var21 & 16711680) * var14 & -16777216;
                                        var23 = (var21 & 65280) * var15 & 16711680;
                                        var24 = (var21 & 255) * var16 & 65280;
                                        var21 = (var22 | var23 | var24) >>> 8;
                                        var25 = var29[var7];
                                        int incrementValue$57 = var7;
                                        var7++;
                                        var13[incrementValue$57] = ((var21 & 16711935) * var17 + (var25 & 16711935) * var18 & -16711936) + ((var21 & 65280) * var17 + (var25 & 65280) * var18 & 16711680) >> 8;
                                        var20++;
                                        continue L20;
                                      }
                                    }
                                  }
                                }
                              }
                            }
                          } else {
                            var14 = param3 >>> 24;
                            var15 = 256 - var14;
                            var16 = -var9;
                            L21: while (true) {
                              if (var16 >= 0) {
                                break L5;
                              } else {
                                var17 = -var10;
                                L22: while (true) {
                                  if (var17 >= 0) {
                                    var7 = var7 + var11;
                                    var8 = var8 + var12;
                                    var16++;
                                    continue L21;
                                  } else {
                                    int incrementValue$58 = var8;
                                    var8++;
                                    var18 = ((sda) this).field_F[incrementValue$58];
                                    if (var18 == 0) {
                                      var7++;
                                      var17++;
                                      continue L22;
                                    } else {
                                      var19 = var29[var7];
                                      int incrementValue$59 = var7;
                                      var7++;
                                      var13[incrementValue$59] = ((var18 & 16711935) * var14 + (var19 & 16711935) * var15 & -16711936) + ((var18 & 65280) * var14 + (var19 & 65280) * var15 & 16711680) >> 8;
                                      var17++;
                                      continue L22;
                                    }
                                  }
                                }
                              }
                            }
                          }
                        }
                      } else {
                        var14 = -var9;
                        L23: while (true) {
                          if (var14 >= 0) {
                            break L5;
                          } else {
                            var15 = var7 + var10 - 3;
                            L24: while (true) {
                              if (var7 >= var15) {
                                var15 += 3;
                                L25: while (true) {
                                  if (var7 >= var15) {
                                    var7 = var7 + var11;
                                    var8 = var8 + var12;
                                    var14++;
                                    continue L23;
                                  } else {
                                    int incrementValue$60 = var8;
                                    var8++;
                                    var16 = ((sda) this).field_F[incrementValue$60];
                                    if (var16 == 0) {
                                      var7++;
                                      continue L25;
                                    } else {
                                      int incrementValue$61 = var7;
                                      var7++;
                                      var13[incrementValue$61] = var16;
                                      continue L25;
                                    }
                                  }
                                }
                              } else {
                                L26: {
                                  int incrementValue$62 = var8;
                                  var8++;
                                  var16 = ((sda) this).field_F[incrementValue$62];
                                  if (var16 == 0) {
                                    var7++;
                                    break L26;
                                  } else {
                                    int incrementValue$63 = var7;
                                    var7++;
                                    var13[incrementValue$63] = var16;
                                    break L26;
                                  }
                                }
                                L27: {
                                  int incrementValue$64 = var8;
                                  var8++;
                                  var16 = ((sda) this).field_F[incrementValue$64];
                                  if (var16 == 0) {
                                    var7++;
                                    break L27;
                                  } else {
                                    int incrementValue$65 = var7;
                                    var7++;
                                    var13[incrementValue$65] = var16;
                                    break L27;
                                  }
                                }
                                L28: {
                                  int incrementValue$66 = var8;
                                  var8++;
                                  var16 = ((sda) this).field_F[incrementValue$66];
                                  if (var16 == 0) {
                                    var7++;
                                    break L28;
                                  } else {
                                    int incrementValue$67 = var7;
                                    var7++;
                                    var13[incrementValue$67] = var16;
                                    break L28;
                                  }
                                }
                                int incrementValue$68 = var8;
                                var8++;
                                var16 = ((sda) this).field_F[incrementValue$68];
                                if (var16 == 0) {
                                  var7++;
                                  continue L24;
                                } else {
                                  int incrementValue$69 = var7;
                                  var7++;
                                  var13[incrementValue$69] = var16;
                                  continue L24;
                                }
                              }
                            }
                          }
                        }
                      }
                    }
                  } else {
                    if (param2 != 1) {
                      if (param2 != 0) {
                        if (param2 != 3) {
                          if (param2 != 2) {
                            throw new IllegalArgumentException();
                          } else {
                            var14 = param3 >>> 24;
                            var15 = 256 - var14;
                            var16 = (param3 & 16711935) * var15 & -16711936;
                            var17 = (param3 & 65280) * var15 & 16711680;
                            param3 = (var16 | var17) >>> 8;
                            var18 = -var9;
                            L29: while (true) {
                              if (var18 >= 0) {
                                break L5;
                              } else {
                                var19 = -var10;
                                L30: while (true) {
                                  if (var19 >= 0) {
                                    var7 = var7 + var11;
                                    var8 = var8 + var12;
                                    var18++;
                                    continue L29;
                                  } else {
                                    int incrementValue$70 = var8;
                                    var8++;
                                    var20 = ((sda) this).field_F[incrementValue$70];
                                    var16 = (var20 & 16711935) * var14 & -16711936;
                                    var17 = (var20 & 65280) * var14 & 16711680;
                                    int incrementValue$71 = var7;
                                    var7++;
                                    var13[incrementValue$71] = ((var16 | var17) >>> 8) + param3;
                                    var19++;
                                    continue L30;
                                  }
                                }
                              }
                            }
                          }
                        } else {
                          var14 = -var9;
                          L31: while (true) {
                            if (var14 >= 0) {
                              break L5;
                            } else {
                              var15 = -var10;
                              L32: while (true) {
                                if (var15 >= 0) {
                                  var7 = var7 + var11;
                                  var8 = var8 + var12;
                                  var14++;
                                  continue L31;
                                } else {
                                  int incrementValue$72 = var8;
                                  var8++;
                                  var16 = ((sda) this).field_F[incrementValue$72];
                                  var17 = var16 + param3;
                                  var18 = (var16 & 16711935) + (param3 & 16711935);
                                  var19 = (var18 & 16777472) + (var17 - var18 & 65536);
                                  int incrementValue$73 = var7;
                                  var7++;
                                  var13[incrementValue$73] = var17 - var19 | var19 - (var19 >>> 8);
                                  var15++;
                                  continue L32;
                                }
                              }
                            }
                          }
                        }
                      } else {
                        var14 = (param3 & 16711680) >> 16;
                        var15 = (param3 & 65280) >> 8;
                        var16 = param3 & 255;
                        var17 = -var9;
                        L33: while (true) {
                          if (var17 >= 0) {
                            break L5;
                          } else {
                            var18 = -var10;
                            L34: while (true) {
                              if (var18 >= 0) {
                                var7 = var7 + var11;
                                var8 = var8 + var12;
                                var17++;
                                continue L33;
                              } else {
                                int incrementValue$74 = var8;
                                var8++;
                                var19 = ((sda) this).field_F[incrementValue$74];
                                var20 = (var19 & 16711680) * var14 & -16777216;
                                var21 = (var19 & 65280) * var15 & 16711680;
                                var22 = (var19 & 255) * var16 & 65280;
                                int incrementValue$75 = var7;
                                var7++;
                                var13[incrementValue$75] = (var20 | var21 | var22) >>> 8;
                                var18++;
                                continue L34;
                              }
                            }
                          }
                        }
                      }
                    } else {
                      var14 = -var9;
                      L35: while (true) {
                        if (var14 >= 0) {
                          break L4;
                        } else {
                          var15 = var7 + var10 - 3;
                          L36: while (true) {
                            if (var7 >= var15) {
                              var15 += 3;
                              L37: while (true) {
                                if (var7 >= var15) {
                                  var7 = var7 + var11;
                                  var8 = var8 + var12;
                                  var14++;
                                  continue L35;
                                } else {
                                  int incrementValue$76 = var7;
                                  var7++;
                                  int incrementValue$77 = var8;
                                  var8++;
                                  var13[incrementValue$76] = ((sda) this).field_F[incrementValue$77];
                                  continue L37;
                                }
                              }
                            } else {
                              int incrementValue$78 = var7;
                              var7++;
                              int incrementValue$79 = var8;
                              var8++;
                              var13[incrementValue$78] = ((sda) this).field_F[incrementValue$79];
                              int incrementValue$80 = var7;
                              var7++;
                              int incrementValue$81 = var8;
                              var8++;
                              var13[incrementValue$80] = ((sda) this).field_F[incrementValue$81];
                              int incrementValue$82 = var7;
                              var7++;
                              int incrementValue$83 = var8;
                              var8++;
                              var13[incrementValue$82] = ((sda) this).field_F[incrementValue$83];
                              int incrementValue$84 = var7;
                              var7++;
                              int incrementValue$85 = var8;
                              var8++;
                              var13[incrementValue$84] = ((sda) this).field_F[incrementValue$85];
                              continue L36;
                            }
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
            }
          }
          return;
        } else {
          throw new IllegalStateException();
        }
    }

    sda(sob param0, int[] param1, int param2, int param3) {
        super(param0, param2, param3);
        ((sda) this).field_F = param1;
    }

    final void b(int param0, int param1) {
        int[] var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int[] var12 = null;
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
        int[] var26 = null;
        int[] var27 = null;
        int[] var28 = null;
        int[] var29 = null;
        int[] var30 = null;
        int[] var31 = null;
        int[] var32 = null;
        int[] var33 = null;
        int[] var34 = null;
        int[] var35 = null;
        int[] var36 = null;
        int[] var37 = null;
        int[] var38 = null;
        int[] var39 = null;
        int[] var40 = null;
        int[] var41 = null;
        int[] var42 = null;
        int[] var43 = null;
        int[] var44 = null;
        int[] var45 = null;
        int[] var46 = null;
        int[] var47 = null;
        int[] var48 = null;
        int[] var49 = null;
        int[] var50 = null;
        int[] var51 = null;
        int[] var52 = null;
        int[] var53 = null;
        int[] var54 = null;
        int[] var55 = null;
        int[] var56 = null;
        int[] var57 = null;
        L0: {
          var3 = ((sda) this).field_w.field_k;
          if (field_C != 0) {
            if (field_C >= 0) {
              if (field_v != 0) {
                if (field_v >= 0) {
                  var5 = field_h;
                  L1: while (true) {
                    if (var5 >= 0) {
                      break L0;
                    } else {
                      L2: {
                        var6 = field_f;
                        var7 = field_m + field_a;
                        var8 = field_p + field_l;
                        var9 = field_B;
                        if (var7 >= 0) {
                          break L2;
                        } else {
                          var4 = (field_C - 1 - var7) / field_C;
                          var9 = var9 + var4;
                          var7 = var7 + field_C * var4;
                          var8 = var8 + field_v * var4;
                          var6 = var6 + var4;
                          break L2;
                        }
                      }
                      L3: {
                        var4 = (1 + var7 - (((sda) this).field_e << 12) - field_C) / field_C;
                        if ((1 + var7 - (((sda) this).field_e << 12) - field_C) / field_C <= var9) {
                          break L3;
                        } else {
                          var9 = var4;
                          break L3;
                        }
                      }
                      L4: {
                        if (var8 >= 0) {
                          break L4;
                        } else {
                          var4 = (field_v - 1 - var8) / field_v;
                          var9 = var9 + var4;
                          var7 = var7 + field_C * var4;
                          var8 = var8 + field_v * var4;
                          var6 = var6 + var4;
                          break L4;
                        }
                      }
                      L5: {
                        var4 = (1 + var8 - (((sda) this).field_q << 12) - field_v) / field_v;
                        if ((1 + var8 - (((sda) this).field_q << 12) - field_v) / field_v <= var9) {
                          break L5;
                        } else {
                          var9 = var4;
                          break L5;
                        }
                      }
                      L6: while (true) {
                        if (var9 >= 0) {
                          field_m = field_m + field_z;
                          field_p = field_p + field_u;
                          field_f = field_f + field_o;
                          var5++;
                          continue L1;
                        } else {
                          L7: {
                            var10 = (var8 >> 12) * ((sda) this).field_e + (var7 >> 12);
                            int incrementValue$36 = var6;
                            var6++;
                            var11 = incrementValue$36;
                            var57 = var3;
                            var48 = var57;
                            var39 = var48;
                            var30 = var39;
                            var12 = var30;
                            var13 = param0;
                            var14 = param1;
                            if (var14 != 0) {
                              if (var14 != 1) {
                                if (var14 != 2) {
                                  throw new IllegalArgumentException();
                                } else {
                                  if (var13 != 1) {
                                    if (var13 != 0) {
                                      if (var13 != 3) {
                                        if (var13 != 2) {
                                          break L7;
                                        } else {
                                          var15 = ((sda) this).field_F[var10];
                                          if (var15 == 0) {
                                            break L7;
                                          } else {
                                            var16 = (var15 & 16711935) * field_i & -16711936;
                                            var17 = (var15 & 65280) * field_i & 16711680;
                                            var15 = ((var16 | var17) >>> 8) + field_g;
                                            var18 = var57[var11];
                                            var19 = var15 + var18;
                                            var20 = (var15 & 16711935) + (var18 & 16711935);
                                            var18 = (var20 & 16777472) + (var19 - var20 & 65536);
                                            var12[var11] = var19 - var18 | var18 - (var18 >>> 8);
                                            break L7;
                                          }
                                        }
                                      } else {
                                        var15 = ((sda) this).field_F[var10];
                                        var16 = field_y;
                                        var17 = var15 + var16;
                                        var18 = (var15 & 16711935) + (var16 & 16711935);
                                        var19 = (var18 & 16777472) + (var17 - var18 & 65536);
                                        var15 = var17 - var19 | var19 - (var19 >>> 8);
                                        var19 = var57[var11];
                                        var17 = var15 + var19;
                                        var18 = (var15 & 16711935) + (var19 & 16711935);
                                        var19 = (var18 & 16777472) + (var17 - var18 & 65536);
                                        var12[var11] = var17 - var19 | var19 - (var19 >>> 8);
                                        break L7;
                                      }
                                    } else {
                                      var15 = ((sda) this).field_F[var10];
                                      if (var15 == 0) {
                                        break L7;
                                      } else {
                                        var16 = (var15 & 16711680) * field_x & -16777216;
                                        var17 = (var15 & 65280) * field_s & 16711680;
                                        var18 = (var15 & 255) * field_E & 65280;
                                        var15 = (var16 | var17 | var18) >>> 8;
                                        var19 = var57[var11];
                                        var20 = var15 + var19;
                                        var21 = (var15 & 16711935) + (var19 & 16711935);
                                        var19 = (var21 & 16777472) + (var20 - var21 & 65536);
                                        var12[var11] = var20 - var19 | var19 - (var19 >>> 8);
                                        break L7;
                                      }
                                    }
                                  } else {
                                    var15 = ((sda) this).field_F[var10];
                                    if (var15 == 0) {
                                      break L7;
                                    } else {
                                      var16 = var57[var11];
                                      var17 = var15 + var16;
                                      var18 = (var15 & 16711935) + (var16 & 16711935);
                                      var16 = (var18 & 16777472) + (var17 - var18 & 65536);
                                      var12[var11] = var17 - var16 | var16 - (var16 >>> 8);
                                      break L7;
                                    }
                                  }
                                }
                              } else {
                                if (var13 != 1) {
                                  if (var13 != 0) {
                                    if (var13 != 3) {
                                      if (var13 != 2) {
                                        throw new IllegalArgumentException();
                                      } else {
                                        var15 = ((sda) this).field_F[var10];
                                        if (var15 == 0) {
                                          break L7;
                                        } else {
                                          var16 = (var15 & 16711935) * field_i & -16711936;
                                          var17 = (var15 & 65280) * field_i & 16711680;
                                          int incrementValue$37 = var11;
                                          var11++;
                                          var12[incrementValue$37] = ((var16 | var17) >>> 8) + field_g;
                                          break L7;
                                        }
                                      }
                                    } else {
                                      L8: {
                                        var15 = ((sda) this).field_F[var10];
                                        var16 = field_y;
                                        var17 = var15 + var16;
                                        var18 = (var15 & 16711935) + (var16 & 16711935);
                                        var19 = (var18 & 16777472) + (var17 - var18 & 65536);
                                        var19 = var17 - var19 | var19 - (var19 >>> 8);
                                        if (var15 != 0) {
                                          break L8;
                                        } else {
                                          if (field_i == 255) {
                                            break L8;
                                          } else {
                                            var15 = var19;
                                            var19 = var57[var11];
                                            var19 = ((var15 & 16711935) * field_i + (var19 & 16711935) * field_b & -16711936) + ((var15 & 65280) * field_i + (var19 & 65280) * field_b & 16711680) >> 8;
                                            break L8;
                                          }
                                        }
                                      }
                                      var57[var11] = var19;
                                      break L7;
                                    }
                                  } else {
                                    var15 = ((sda) this).field_F[var10];
                                    if (var15 == 0) {
                                      break L7;
                                    } else {
                                      if ((field_y & 16777215) != 16777215) {
                                        if (field_i == 255) {
                                          var16 = (var15 & 16711680) * field_x & -16777216;
                                          var17 = (var15 & 65280) * field_s & 16711680;
                                          var18 = (var15 & 255) * field_E & 65280;
                                          var12[var11] = (var16 | var17 | var18) >>> 8;
                                          break L7;
                                        } else {
                                          var16 = (var15 & 16711680) * field_x & -16777216;
                                          var17 = (var15 & 65280) * field_s & 16711680;
                                          var18 = (var15 & 255) * field_E & 65280;
                                          var15 = (var16 | var17 | var18) >>> 8;
                                          var19 = var57[var11];
                                          var12[var11] = ((var15 & 16711935) * field_i + (var19 & 16711935) * field_b & -16711936) + ((var15 & 65280) * field_i + (var19 & 65280) * field_b & 16711680) >> 8;
                                          break L7;
                                        }
                                      } else {
                                        var16 = field_y >>> 24;
                                        var17 = 256 - var16;
                                        var18 = var57[var11];
                                        var12[var11] = ((var15 & 16711935) * var16 + (var18 & 16711935) * var17 & -16711936) + ((var15 & 65280) * var16 + (var18 & 65280) * var17 & 16711680) >> 8;
                                        break L7;
                                      }
                                    }
                                  }
                                } else {
                                  var15 = ((sda) this).field_F[var10];
                                  if (var15 == 0) {
                                    break L7;
                                  } else {
                                    var57[var11] = var15;
                                    break L7;
                                  }
                                }
                              }
                            } else {
                              if (var13 != 1) {
                                if (var13 != 0) {
                                  if (var13 != 3) {
                                    if (var13 != 2) {
                                      throw new IllegalArgumentException();
                                    } else {
                                      var15 = ((sda) this).field_F[var10];
                                      var16 = (var15 & 16711935) * field_i & -16711936;
                                      var17 = (var15 & 65280) * field_i & 16711680;
                                      var12[var11] = ((var16 | var17) >>> 8) + field_g;
                                      break L7;
                                    }
                                  } else {
                                    int incrementValue$38 = var10;
                                    var10++;
                                    var15 = ((sda) this).field_F[incrementValue$38];
                                    var16 = field_y;
                                    var17 = var15 + var16;
                                    var18 = (var15 & 16711935) + (var16 & 16711935);
                                    var19 = (var18 & 16777472) + (var17 - var18 & 65536);
                                    var12[var11] = var17 - var19 | var19 - (var19 >>> 8);
                                    break L7;
                                  }
                                } else {
                                  int incrementValue$39 = var10;
                                  var10++;
                                  var15 = ((sda) this).field_F[incrementValue$39];
                                  var16 = (var15 & 16711680) * field_x & -16777216;
                                  var17 = (var15 & 65280) * field_s & 16711680;
                                  var18 = (var15 & 255) * field_E & 65280;
                                  var12[var11] = (var16 | var17 | var18) >>> 8;
                                  break L7;
                                }
                              } else {
                                var12[var11] = ((sda) this).field_F[var10];
                                break L7;
                              }
                            }
                          }
                          var7 = var7 + field_C;
                          var8 = var8 + field_v;
                          var9++;
                          continue L6;
                        }
                      }
                    }
                  }
                } else {
                  var5 = field_h;
                  L9: while (true) {
                    if (var5 >= 0) {
                      break L0;
                    } else {
                      L10: {
                        var6 = field_f;
                        var7 = field_m + field_a;
                        var8 = field_p + field_l;
                        var9 = field_B;
                        if (var7 >= 0) {
                          break L10;
                        } else {
                          var4 = (field_C - 1 - var7) / field_C;
                          var9 = var9 + var4;
                          var7 = var7 + field_C * var4;
                          var8 = var8 + field_v * var4;
                          var6 = var6 + var4;
                          break L10;
                        }
                      }
                      L11: {
                        var4 = (1 + var7 - (((sda) this).field_e << 12) - field_C) / field_C;
                        if ((1 + var7 - (((sda) this).field_e << 12) - field_C) / field_C <= var9) {
                          break L11;
                        } else {
                          var9 = var4;
                          break L11;
                        }
                      }
                      L12: {
                        var4 = var8 - (((sda) this).field_q << 12);
                        if (var8 - (((sda) this).field_q << 12) < 0) {
                          break L12;
                        } else {
                          var4 = (field_v - var4) / field_v;
                          var9 = var9 + var4;
                          var7 = var7 + field_C * var4;
                          var8 = var8 + field_v * var4;
                          var6 = var6 + var4;
                          break L12;
                        }
                      }
                      L13: {
                        var4 = (var8 - field_v) / field_v;
                        if ((var8 - field_v) / field_v <= var9) {
                          break L13;
                        } else {
                          var9 = var4;
                          break L13;
                        }
                      }
                      L14: while (true) {
                        if (var9 >= 0) {
                          field_m = field_m + field_z;
                          field_p = field_p + field_u;
                          field_f = field_f + field_o;
                          var5++;
                          continue L9;
                        } else {
                          L15: {
                            var10 = (var8 >> 12) * ((sda) this).field_e + (var7 >> 12);
                            int incrementValue$40 = var6;
                            var6++;
                            var11 = incrementValue$40;
                            var56 = var3;
                            var47 = var56;
                            var38 = var47;
                            var29 = var38;
                            var12 = var29;
                            var13 = param0;
                            var14 = param1;
                            if (var14 != 0) {
                              if (var14 != 1) {
                                if (var14 != 2) {
                                  throw new IllegalArgumentException();
                                } else {
                                  if (var13 != 1) {
                                    if (var13 != 0) {
                                      if (var13 != 3) {
                                        if (var13 != 2) {
                                          break L15;
                                        } else {
                                          var15 = ((sda) this).field_F[var10];
                                          if (var15 == 0) {
                                            break L15;
                                          } else {
                                            var16 = (var15 & 16711935) * field_i & -16711936;
                                            var17 = (var15 & 65280) * field_i & 16711680;
                                            var15 = ((var16 | var17) >>> 8) + field_g;
                                            var18 = var56[var11];
                                            var19 = var15 + var18;
                                            var20 = (var15 & 16711935) + (var18 & 16711935);
                                            var18 = (var20 & 16777472) + (var19 - var20 & 65536);
                                            var12[var11] = var19 - var18 | var18 - (var18 >>> 8);
                                            break L15;
                                          }
                                        }
                                      } else {
                                        var15 = ((sda) this).field_F[var10];
                                        var16 = field_y;
                                        var17 = var15 + var16;
                                        var18 = (var15 & 16711935) + (var16 & 16711935);
                                        var19 = (var18 & 16777472) + (var17 - var18 & 65536);
                                        var15 = var17 - var19 | var19 - (var19 >>> 8);
                                        var19 = var56[var11];
                                        var17 = var15 + var19;
                                        var18 = (var15 & 16711935) + (var19 & 16711935);
                                        var19 = (var18 & 16777472) + (var17 - var18 & 65536);
                                        var12[var11] = var17 - var19 | var19 - (var19 >>> 8);
                                        break L15;
                                      }
                                    } else {
                                      var15 = ((sda) this).field_F[var10];
                                      if (var15 == 0) {
                                        break L15;
                                      } else {
                                        var16 = (var15 & 16711680) * field_x & -16777216;
                                        var17 = (var15 & 65280) * field_s & 16711680;
                                        var18 = (var15 & 255) * field_E & 65280;
                                        var15 = (var16 | var17 | var18) >>> 8;
                                        var19 = var56[var11];
                                        var20 = var15 + var19;
                                        var21 = (var15 & 16711935) + (var19 & 16711935);
                                        var19 = (var21 & 16777472) + (var20 - var21 & 65536);
                                        var12[var11] = var20 - var19 | var19 - (var19 >>> 8);
                                        break L15;
                                      }
                                    }
                                  } else {
                                    var15 = ((sda) this).field_F[var10];
                                    if (var15 == 0) {
                                      break L15;
                                    } else {
                                      var16 = var56[var11];
                                      var17 = var15 + var16;
                                      var18 = (var15 & 16711935) + (var16 & 16711935);
                                      var16 = (var18 & 16777472) + (var17 - var18 & 65536);
                                      var12[var11] = var17 - var16 | var16 - (var16 >>> 8);
                                      break L15;
                                    }
                                  }
                                }
                              } else {
                                if (var13 != 1) {
                                  if (var13 != 0) {
                                    if (var13 != 3) {
                                      if (var13 != 2) {
                                        throw new IllegalArgumentException();
                                      } else {
                                        var15 = ((sda) this).field_F[var10];
                                        if (var15 == 0) {
                                          break L15;
                                        } else {
                                          var16 = (var15 & 16711935) * field_i & -16711936;
                                          var17 = (var15 & 65280) * field_i & 16711680;
                                          int incrementValue$41 = var11;
                                          var11++;
                                          var12[incrementValue$41] = ((var16 | var17) >>> 8) + field_g;
                                          break L15;
                                        }
                                      }
                                    } else {
                                      L16: {
                                        var15 = ((sda) this).field_F[var10];
                                        var16 = field_y;
                                        var17 = var15 + var16;
                                        var18 = (var15 & 16711935) + (var16 & 16711935);
                                        var19 = (var18 & 16777472) + (var17 - var18 & 65536);
                                        var19 = var17 - var19 | var19 - (var19 >>> 8);
                                        if (var15 != 0) {
                                          break L16;
                                        } else {
                                          if (field_i == 255) {
                                            break L16;
                                          } else {
                                            var15 = var19;
                                            var19 = var56[var11];
                                            var19 = ((var15 & 16711935) * field_i + (var19 & 16711935) * field_b & -16711936) + ((var15 & 65280) * field_i + (var19 & 65280) * field_b & 16711680) >> 8;
                                            break L16;
                                          }
                                        }
                                      }
                                      var56[var11] = var19;
                                      break L15;
                                    }
                                  } else {
                                    var15 = ((sda) this).field_F[var10];
                                    if (var15 == 0) {
                                      break L15;
                                    } else {
                                      if ((field_y & 16777215) != 16777215) {
                                        if (field_i == 255) {
                                          var16 = (var15 & 16711680) * field_x & -16777216;
                                          var17 = (var15 & 65280) * field_s & 16711680;
                                          var18 = (var15 & 255) * field_E & 65280;
                                          var12[var11] = (var16 | var17 | var18) >>> 8;
                                          break L15;
                                        } else {
                                          var16 = (var15 & 16711680) * field_x & -16777216;
                                          var17 = (var15 & 65280) * field_s & 16711680;
                                          var18 = (var15 & 255) * field_E & 65280;
                                          var15 = (var16 | var17 | var18) >>> 8;
                                          var19 = var56[var11];
                                          var12[var11] = ((var15 & 16711935) * field_i + (var19 & 16711935) * field_b & -16711936) + ((var15 & 65280) * field_i + (var19 & 65280) * field_b & 16711680) >> 8;
                                          break L15;
                                        }
                                      } else {
                                        var16 = field_y >>> 24;
                                        var17 = 256 - var16;
                                        var18 = var56[var11];
                                        var12[var11] = ((var15 & 16711935) * var16 + (var18 & 16711935) * var17 & -16711936) + ((var15 & 65280) * var16 + (var18 & 65280) * var17 & 16711680) >> 8;
                                        break L15;
                                      }
                                    }
                                  }
                                } else {
                                  var15 = ((sda) this).field_F[var10];
                                  if (var15 == 0) {
                                    break L15;
                                  } else {
                                    var56[var11] = var15;
                                    break L15;
                                  }
                                }
                              }
                            } else {
                              if (var13 != 1) {
                                if (var13 != 0) {
                                  if (var13 != 3) {
                                    if (var13 != 2) {
                                      throw new IllegalArgumentException();
                                    } else {
                                      var15 = ((sda) this).field_F[var10];
                                      var16 = (var15 & 16711935) * field_i & -16711936;
                                      var17 = (var15 & 65280) * field_i & 16711680;
                                      var12[var11] = ((var16 | var17) >>> 8) + field_g;
                                      break L15;
                                    }
                                  } else {
                                    int incrementValue$42 = var10;
                                    var10++;
                                    var15 = ((sda) this).field_F[incrementValue$42];
                                    var16 = field_y;
                                    var17 = var15 + var16;
                                    var18 = (var15 & 16711935) + (var16 & 16711935);
                                    var19 = (var18 & 16777472) + (var17 - var18 & 65536);
                                    var12[var11] = var17 - var19 | var19 - (var19 >>> 8);
                                    break L15;
                                  }
                                } else {
                                  int incrementValue$43 = var10;
                                  var10++;
                                  var15 = ((sda) this).field_F[incrementValue$43];
                                  var16 = (var15 & 16711680) * field_x & -16777216;
                                  var17 = (var15 & 65280) * field_s & 16711680;
                                  var18 = (var15 & 255) * field_E & 65280;
                                  var12[var11] = (var16 | var17 | var18) >>> 8;
                                  break L15;
                                }
                              } else {
                                var12[var11] = ((sda) this).field_F[var10];
                                break L15;
                              }
                            }
                          }
                          var7 = var7 + field_C;
                          var8 = var8 + field_v;
                          var9++;
                          continue L14;
                        }
                      }
                    }
                  }
                }
              } else {
                var5 = field_h;
                L17: while (true) {
                  if (var5 >= 0) {
                    break L0;
                  } else {
                    L18: {
                      var6 = field_f;
                      var7 = field_m + field_a;
                      var8 = field_p;
                      var9 = field_B;
                      if (var8 >= 0) {
                        if (var8 - (((sda) this).field_q << 12) < 0) {
                          L19: {
                            if (var7 >= 0) {
                              break L19;
                            } else {
                              var4 = (field_C - 1 - var7) / field_C;
                              var9 = var9 + var4;
                              var7 = var7 + field_C * var4;
                              var6 = var6 + var4;
                              break L19;
                            }
                          }
                          L20: {
                            var4 = (1 + var7 - (((sda) this).field_e << 12) - field_C) / field_C;
                            if ((1 + var7 - (((sda) this).field_e << 12) - field_C) / field_C <= var9) {
                              break L20;
                            } else {
                              var9 = var4;
                              break L20;
                            }
                          }
                          L21: while (true) {
                            if (var9 >= 0) {
                              break L18;
                            } else {
                              L22: {
                                var10 = (var8 >> 12) * ((sda) this).field_e + (var7 >> 12);
                                int incrementValue$44 = var6;
                                var6++;
                                var11 = incrementValue$44;
                                var55 = var3;
                                var46 = var55;
                                var37 = var46;
                                var28 = var37;
                                var12 = var28;
                                var13 = param0;
                                var14 = param1;
                                if (var14 != 0) {
                                  if (var14 != 1) {
                                    if (var14 != 2) {
                                      throw new IllegalArgumentException();
                                    } else {
                                      if (var13 != 1) {
                                        if (var13 != 0) {
                                          if (var13 != 3) {
                                            if (var13 != 2) {
                                              break L22;
                                            } else {
                                              var15 = ((sda) this).field_F[var10];
                                              if (var15 == 0) {
                                                break L22;
                                              } else {
                                                var16 = (var15 & 16711935) * field_i & -16711936;
                                                var17 = (var15 & 65280) * field_i & 16711680;
                                                var15 = ((var16 | var17) >>> 8) + field_g;
                                                var18 = var55[var11];
                                                var19 = var15 + var18;
                                                var20 = (var15 & 16711935) + (var18 & 16711935);
                                                var18 = (var20 & 16777472) + (var19 - var20 & 65536);
                                                var12[var11] = var19 - var18 | var18 - (var18 >>> 8);
                                                break L22;
                                              }
                                            }
                                          } else {
                                            var15 = ((sda) this).field_F[var10];
                                            var16 = field_y;
                                            var17 = var15 + var16;
                                            var18 = (var15 & 16711935) + (var16 & 16711935);
                                            var19 = (var18 & 16777472) + (var17 - var18 & 65536);
                                            var15 = var17 - var19 | var19 - (var19 >>> 8);
                                            var19 = var55[var11];
                                            var17 = var15 + var19;
                                            var18 = (var15 & 16711935) + (var19 & 16711935);
                                            var19 = (var18 & 16777472) + (var17 - var18 & 65536);
                                            var12[var11] = var17 - var19 | var19 - (var19 >>> 8);
                                            break L22;
                                          }
                                        } else {
                                          var15 = ((sda) this).field_F[var10];
                                          if (var15 == 0) {
                                            break L22;
                                          } else {
                                            var16 = (var15 & 16711680) * field_x & -16777216;
                                            var17 = (var15 & 65280) * field_s & 16711680;
                                            var18 = (var15 & 255) * field_E & 65280;
                                            var15 = (var16 | var17 | var18) >>> 8;
                                            var19 = var55[var11];
                                            var20 = var15 + var19;
                                            var21 = (var15 & 16711935) + (var19 & 16711935);
                                            var19 = (var21 & 16777472) + (var20 - var21 & 65536);
                                            var12[var11] = var20 - var19 | var19 - (var19 >>> 8);
                                            break L22;
                                          }
                                        }
                                      } else {
                                        var15 = ((sda) this).field_F[var10];
                                        if (var15 == 0) {
                                          break L22;
                                        } else {
                                          var16 = var55[var11];
                                          var17 = var15 + var16;
                                          var18 = (var15 & 16711935) + (var16 & 16711935);
                                          var16 = (var18 & 16777472) + (var17 - var18 & 65536);
                                          var12[var11] = var17 - var16 | var16 - (var16 >>> 8);
                                          break L22;
                                        }
                                      }
                                    }
                                  } else {
                                    if (var13 != 1) {
                                      if (var13 != 0) {
                                        if (var13 != 3) {
                                          if (var13 != 2) {
                                            throw new IllegalArgumentException();
                                          } else {
                                            var15 = ((sda) this).field_F[var10];
                                            if (var15 == 0) {
                                              break L22;
                                            } else {
                                              var16 = (var15 & 16711935) * field_i & -16711936;
                                              var17 = (var15 & 65280) * field_i & 16711680;
                                              int incrementValue$45 = var11;
                                              var11++;
                                              var12[incrementValue$45] = ((var16 | var17) >>> 8) + field_g;
                                              break L22;
                                            }
                                          }
                                        } else {
                                          L23: {
                                            var15 = ((sda) this).field_F[var10];
                                            var16 = field_y;
                                            var17 = var15 + var16;
                                            var18 = (var15 & 16711935) + (var16 & 16711935);
                                            var19 = (var18 & 16777472) + (var17 - var18 & 65536);
                                            var19 = var17 - var19 | var19 - (var19 >>> 8);
                                            if (var15 != 0) {
                                              break L23;
                                            } else {
                                              if (field_i == 255) {
                                                break L23;
                                              } else {
                                                var15 = var19;
                                                var19 = var55[var11];
                                                var19 = ((var15 & 16711935) * field_i + (var19 & 16711935) * field_b & -16711936) + ((var15 & 65280) * field_i + (var19 & 65280) * field_b & 16711680) >> 8;
                                                break L23;
                                              }
                                            }
                                          }
                                          var55[var11] = var19;
                                          break L22;
                                        }
                                      } else {
                                        var15 = ((sda) this).field_F[var10];
                                        if (var15 == 0) {
                                          break L22;
                                        } else {
                                          if ((field_y & 16777215) != 16777215) {
                                            if (field_i == 255) {
                                              var16 = (var15 & 16711680) * field_x & -16777216;
                                              var17 = (var15 & 65280) * field_s & 16711680;
                                              var18 = (var15 & 255) * field_E & 65280;
                                              var12[var11] = (var16 | var17 | var18) >>> 8;
                                              break L22;
                                            } else {
                                              var16 = (var15 & 16711680) * field_x & -16777216;
                                              var17 = (var15 & 65280) * field_s & 16711680;
                                              var18 = (var15 & 255) * field_E & 65280;
                                              var15 = (var16 | var17 | var18) >>> 8;
                                              var19 = var55[var11];
                                              var12[var11] = ((var15 & 16711935) * field_i + (var19 & 16711935) * field_b & -16711936) + ((var15 & 65280) * field_i + (var19 & 65280) * field_b & 16711680) >> 8;
                                              break L22;
                                            }
                                          } else {
                                            var16 = field_y >>> 24;
                                            var17 = 256 - var16;
                                            var18 = var55[var11];
                                            var12[var11] = ((var15 & 16711935) * var16 + (var18 & 16711935) * var17 & -16711936) + ((var15 & 65280) * var16 + (var18 & 65280) * var17 & 16711680) >> 8;
                                            break L22;
                                          }
                                        }
                                      }
                                    } else {
                                      var15 = ((sda) this).field_F[var10];
                                      if (var15 == 0) {
                                        break L22;
                                      } else {
                                        var55[var11] = var15;
                                        break L22;
                                      }
                                    }
                                  }
                                } else {
                                  if (var13 != 1) {
                                    if (var13 != 0) {
                                      if (var13 != 3) {
                                        if (var13 != 2) {
                                          throw new IllegalArgumentException();
                                        } else {
                                          var15 = ((sda) this).field_F[var10];
                                          var16 = (var15 & 16711935) * field_i & -16711936;
                                          var17 = (var15 & 65280) * field_i & 16711680;
                                          var12[var11] = ((var16 | var17) >>> 8) + field_g;
                                          break L22;
                                        }
                                      } else {
                                        int incrementValue$46 = var10;
                                        var10++;
                                        var15 = ((sda) this).field_F[incrementValue$46];
                                        var16 = field_y;
                                        var17 = var15 + var16;
                                        var18 = (var15 & 16711935) + (var16 & 16711935);
                                        var19 = (var18 & 16777472) + (var17 - var18 & 65536);
                                        var12[var11] = var17 - var19 | var19 - (var19 >>> 8);
                                        break L22;
                                      }
                                    } else {
                                      int incrementValue$47 = var10;
                                      var10++;
                                      var15 = ((sda) this).field_F[incrementValue$47];
                                      var16 = (var15 & 16711680) * field_x & -16777216;
                                      var17 = (var15 & 65280) * field_s & 16711680;
                                      var18 = (var15 & 255) * field_E & 65280;
                                      var12[var11] = (var16 | var17 | var18) >>> 8;
                                      break L22;
                                    }
                                  } else {
                                    var12[var11] = ((sda) this).field_F[var10];
                                    break L22;
                                  }
                                }
                              }
                              var7 = var7 + field_C;
                              var9++;
                              continue L21;
                            }
                          }
                        } else {
                          break L18;
                        }
                      } else {
                        break L18;
                      }
                    }
                    var5++;
                    field_m = field_m + field_z;
                    field_p = field_p + field_u;
                    field_f = field_f + field_o;
                    continue L17;
                  }
                }
              }
            } else {
              if (field_v != 0) {
                if (field_v >= 0) {
                  var5 = field_h;
                  L24: while (true) {
                    if (var5 >= 0) {
                      break L0;
                    } else {
                      L25: {
                        var6 = field_f;
                        var7 = field_m + field_a;
                        var8 = field_p + field_l;
                        var9 = field_B;
                        var4 = var7 - (((sda) this).field_e << 12);
                        if (var7 - (((sda) this).field_e << 12) < 0) {
                          break L25;
                        } else {
                          var4 = (field_C - var4) / field_C;
                          var9 = var9 + var4;
                          var7 = var7 + field_C * var4;
                          var8 = var8 + field_v * var4;
                          var6 = var6 + var4;
                          break L25;
                        }
                      }
                      L26: {
                        var4 = (var7 - field_C) / field_C;
                        if ((var7 - field_C) / field_C <= var9) {
                          break L26;
                        } else {
                          var9 = var4;
                          break L26;
                        }
                      }
                      L27: {
                        if (var8 >= 0) {
                          break L27;
                        } else {
                          var4 = (field_v - 1 - var8) / field_v;
                          var9 = var9 + var4;
                          var7 = var7 + field_C * var4;
                          var8 = var8 + field_v * var4;
                          var6 = var6 + var4;
                          break L27;
                        }
                      }
                      L28: {
                        var4 = (1 + var8 - (((sda) this).field_q << 12) - field_v) / field_v;
                        if ((1 + var8 - (((sda) this).field_q << 12) - field_v) / field_v <= var9) {
                          break L28;
                        } else {
                          var9 = var4;
                          break L28;
                        }
                      }
                      L29: while (true) {
                        if (var9 >= 0) {
                          var5++;
                          field_m = field_m + field_z;
                          field_p = field_p + field_u;
                          field_f = field_f + field_o;
                          continue L24;
                        } else {
                          L30: {
                            var10 = (var8 >> 12) * ((sda) this).field_e + (var7 >> 12);
                            int incrementValue$48 = var6;
                            var6++;
                            var11 = incrementValue$48;
                            var54 = var3;
                            var45 = var54;
                            var36 = var45;
                            var27 = var36;
                            var12 = var27;
                            var13 = param0;
                            var14 = param1;
                            if (var14 != 0) {
                              if (var14 != 1) {
                                if (var14 != 2) {
                                  throw new IllegalArgumentException();
                                } else {
                                  if (var13 != 1) {
                                    if (var13 != 0) {
                                      if (var13 != 3) {
                                        if (var13 != 2) {
                                          break L30;
                                        } else {
                                          var15 = ((sda) this).field_F[var10];
                                          if (var15 == 0) {
                                            break L30;
                                          } else {
                                            var16 = (var15 & 16711935) * field_i & -16711936;
                                            var17 = (var15 & 65280) * field_i & 16711680;
                                            var15 = ((var16 | var17) >>> 8) + field_g;
                                            var18 = var54[var11];
                                            var19 = var15 + var18;
                                            var20 = (var15 & 16711935) + (var18 & 16711935);
                                            var18 = (var20 & 16777472) + (var19 - var20 & 65536);
                                            var12[var11] = var19 - var18 | var18 - (var18 >>> 8);
                                            break L30;
                                          }
                                        }
                                      } else {
                                        var15 = ((sda) this).field_F[var10];
                                        var16 = field_y;
                                        var17 = var15 + var16;
                                        var18 = (var15 & 16711935) + (var16 & 16711935);
                                        var19 = (var18 & 16777472) + (var17 - var18 & 65536);
                                        var15 = var17 - var19 | var19 - (var19 >>> 8);
                                        var19 = var54[var11];
                                        var17 = var15 + var19;
                                        var18 = (var15 & 16711935) + (var19 & 16711935);
                                        var19 = (var18 & 16777472) + (var17 - var18 & 65536);
                                        var12[var11] = var17 - var19 | var19 - (var19 >>> 8);
                                        break L30;
                                      }
                                    } else {
                                      var15 = ((sda) this).field_F[var10];
                                      if (var15 == 0) {
                                        break L30;
                                      } else {
                                        var16 = (var15 & 16711680) * field_x & -16777216;
                                        var17 = (var15 & 65280) * field_s & 16711680;
                                        var18 = (var15 & 255) * field_E & 65280;
                                        var15 = (var16 | var17 | var18) >>> 8;
                                        var19 = var54[var11];
                                        var20 = var15 + var19;
                                        var21 = (var15 & 16711935) + (var19 & 16711935);
                                        var19 = (var21 & 16777472) + (var20 - var21 & 65536);
                                        var12[var11] = var20 - var19 | var19 - (var19 >>> 8);
                                        break L30;
                                      }
                                    }
                                  } else {
                                    var15 = ((sda) this).field_F[var10];
                                    if (var15 == 0) {
                                      break L30;
                                    } else {
                                      var16 = var54[var11];
                                      var17 = var15 + var16;
                                      var18 = (var15 & 16711935) + (var16 & 16711935);
                                      var16 = (var18 & 16777472) + (var17 - var18 & 65536);
                                      var12[var11] = var17 - var16 | var16 - (var16 >>> 8);
                                      break L30;
                                    }
                                  }
                                }
                              } else {
                                if (var13 != 1) {
                                  if (var13 != 0) {
                                    if (var13 != 3) {
                                      if (var13 != 2) {
                                        throw new IllegalArgumentException();
                                      } else {
                                        var15 = ((sda) this).field_F[var10];
                                        if (var15 == 0) {
                                          break L30;
                                        } else {
                                          var16 = (var15 & 16711935) * field_i & -16711936;
                                          var17 = (var15 & 65280) * field_i & 16711680;
                                          int incrementValue$49 = var11;
                                          var11++;
                                          var12[incrementValue$49] = ((var16 | var17) >>> 8) + field_g;
                                          break L30;
                                        }
                                      }
                                    } else {
                                      L31: {
                                        var15 = ((sda) this).field_F[var10];
                                        var16 = field_y;
                                        var17 = var15 + var16;
                                        var18 = (var15 & 16711935) + (var16 & 16711935);
                                        var19 = (var18 & 16777472) + (var17 - var18 & 65536);
                                        var19 = var17 - var19 | var19 - (var19 >>> 8);
                                        if (var15 != 0) {
                                          break L31;
                                        } else {
                                          if (field_i == 255) {
                                            break L31;
                                          } else {
                                            var15 = var19;
                                            var19 = var54[var11];
                                            var19 = ((var15 & 16711935) * field_i + (var19 & 16711935) * field_b & -16711936) + ((var15 & 65280) * field_i + (var19 & 65280) * field_b & 16711680) >> 8;
                                            break L31;
                                          }
                                        }
                                      }
                                      var54[var11] = var19;
                                      break L30;
                                    }
                                  } else {
                                    var15 = ((sda) this).field_F[var10];
                                    if (var15 == 0) {
                                      break L30;
                                    } else {
                                      if ((field_y & 16777215) != 16777215) {
                                        if (field_i == 255) {
                                          var16 = (var15 & 16711680) * field_x & -16777216;
                                          var17 = (var15 & 65280) * field_s & 16711680;
                                          var18 = (var15 & 255) * field_E & 65280;
                                          var12[var11] = (var16 | var17 | var18) >>> 8;
                                          break L30;
                                        } else {
                                          var16 = (var15 & 16711680) * field_x & -16777216;
                                          var17 = (var15 & 65280) * field_s & 16711680;
                                          var18 = (var15 & 255) * field_E & 65280;
                                          var15 = (var16 | var17 | var18) >>> 8;
                                          var19 = var54[var11];
                                          var12[var11] = ((var15 & 16711935) * field_i + (var19 & 16711935) * field_b & -16711936) + ((var15 & 65280) * field_i + (var19 & 65280) * field_b & 16711680) >> 8;
                                          break L30;
                                        }
                                      } else {
                                        var16 = field_y >>> 24;
                                        var17 = 256 - var16;
                                        var18 = var54[var11];
                                        var12[var11] = ((var15 & 16711935) * var16 + (var18 & 16711935) * var17 & -16711936) + ((var15 & 65280) * var16 + (var18 & 65280) * var17 & 16711680) >> 8;
                                        break L30;
                                      }
                                    }
                                  }
                                } else {
                                  var15 = ((sda) this).field_F[var10];
                                  if (var15 == 0) {
                                    break L30;
                                  } else {
                                    var54[var11] = var15;
                                    break L30;
                                  }
                                }
                              }
                            } else {
                              if (var13 != 1) {
                                if (var13 != 0) {
                                  if (var13 != 3) {
                                    if (var13 != 2) {
                                      throw new IllegalArgumentException();
                                    } else {
                                      var15 = ((sda) this).field_F[var10];
                                      var16 = (var15 & 16711935) * field_i & -16711936;
                                      var17 = (var15 & 65280) * field_i & 16711680;
                                      var12[var11] = ((var16 | var17) >>> 8) + field_g;
                                      break L30;
                                    }
                                  } else {
                                    int incrementValue$50 = var10;
                                    var10++;
                                    var15 = ((sda) this).field_F[incrementValue$50];
                                    var16 = field_y;
                                    var17 = var15 + var16;
                                    var18 = (var15 & 16711935) + (var16 & 16711935);
                                    var19 = (var18 & 16777472) + (var17 - var18 & 65536);
                                    var12[var11] = var17 - var19 | var19 - (var19 >>> 8);
                                    break L30;
                                  }
                                } else {
                                  int incrementValue$51 = var10;
                                  var10++;
                                  var15 = ((sda) this).field_F[incrementValue$51];
                                  var16 = (var15 & 16711680) * field_x & -16777216;
                                  var17 = (var15 & 65280) * field_s & 16711680;
                                  var18 = (var15 & 255) * field_E & 65280;
                                  var12[var11] = (var16 | var17 | var18) >>> 8;
                                  break L30;
                                }
                              } else {
                                var12[var11] = ((sda) this).field_F[var10];
                                break L30;
                              }
                            }
                          }
                          var7 = var7 + field_C;
                          var8 = var8 + field_v;
                          var9++;
                          continue L29;
                        }
                      }
                    }
                  }
                } else {
                  var5 = field_h;
                  L32: while (true) {
                    if (var5 >= 0) {
                      break L0;
                    } else {
                      L33: {
                        var6 = field_f;
                        var7 = field_m + field_a;
                        var8 = field_p + field_l;
                        var9 = field_B;
                        var4 = var7 - (((sda) this).field_e << 12);
                        if (var7 - (((sda) this).field_e << 12) < 0) {
                          break L33;
                        } else {
                          var4 = (field_C - var4) / field_C;
                          var9 = var9 + var4;
                          var7 = var7 + field_C * var4;
                          var8 = var8 + field_v * var4;
                          var6 = var6 + var4;
                          break L33;
                        }
                      }
                      L34: {
                        var4 = (var7 - field_C) / field_C;
                        if ((var7 - field_C) / field_C <= var9) {
                          break L34;
                        } else {
                          var9 = var4;
                          break L34;
                        }
                      }
                      L35: {
                        var4 = var8 - (((sda) this).field_q << 12);
                        if (var8 - (((sda) this).field_q << 12) < 0) {
                          break L35;
                        } else {
                          var4 = (field_v - var4) / field_v;
                          var9 = var9 + var4;
                          var7 = var7 + field_C * var4;
                          var8 = var8 + field_v * var4;
                          var6 = var6 + var4;
                          break L35;
                        }
                      }
                      L36: {
                        var4 = (var8 - field_v) / field_v;
                        if ((var8 - field_v) / field_v <= var9) {
                          break L36;
                        } else {
                          var9 = var4;
                          break L36;
                        }
                      }
                      L37: while (true) {
                        if (var9 >= 0) {
                          var5++;
                          field_m = field_m + field_z;
                          field_p = field_p + field_u;
                          field_f = field_f + field_o;
                          continue L32;
                        } else {
                          L38: {
                            var10 = (var8 >> 12) * ((sda) this).field_e + (var7 >> 12);
                            int incrementValue$52 = var6;
                            var6++;
                            var11 = incrementValue$52;
                            var53 = var3;
                            var44 = var53;
                            var35 = var44;
                            var26 = var35;
                            var12 = var26;
                            var13 = param0;
                            var14 = param1;
                            if (var14 != 0) {
                              if (var14 != 1) {
                                if (var14 != 2) {
                                  throw new IllegalArgumentException();
                                } else {
                                  if (var13 != 1) {
                                    if (var13 != 0) {
                                      if (var13 != 3) {
                                        if (var13 != 2) {
                                          break L38;
                                        } else {
                                          var15 = ((sda) this).field_F[var10];
                                          if (var15 == 0) {
                                            break L38;
                                          } else {
                                            var16 = (var15 & 16711935) * field_i & -16711936;
                                            var17 = (var15 & 65280) * field_i & 16711680;
                                            var15 = ((var16 | var17) >>> 8) + field_g;
                                            var18 = var53[var11];
                                            var19 = var15 + var18;
                                            var20 = (var15 & 16711935) + (var18 & 16711935);
                                            var18 = (var20 & 16777472) + (var19 - var20 & 65536);
                                            var12[var11] = var19 - var18 | var18 - (var18 >>> 8);
                                            break L38;
                                          }
                                        }
                                      } else {
                                        var15 = ((sda) this).field_F[var10];
                                        var16 = field_y;
                                        var17 = var15 + var16;
                                        var18 = (var15 & 16711935) + (var16 & 16711935);
                                        var19 = (var18 & 16777472) + (var17 - var18 & 65536);
                                        var15 = var17 - var19 | var19 - (var19 >>> 8);
                                        var19 = var53[var11];
                                        var17 = var15 + var19;
                                        var18 = (var15 & 16711935) + (var19 & 16711935);
                                        var19 = (var18 & 16777472) + (var17 - var18 & 65536);
                                        var12[var11] = var17 - var19 | var19 - (var19 >>> 8);
                                        break L38;
                                      }
                                    } else {
                                      var15 = ((sda) this).field_F[var10];
                                      if (var15 == 0) {
                                        break L38;
                                      } else {
                                        var16 = (var15 & 16711680) * field_x & -16777216;
                                        var17 = (var15 & 65280) * field_s & 16711680;
                                        var18 = (var15 & 255) * field_E & 65280;
                                        var15 = (var16 | var17 | var18) >>> 8;
                                        var19 = var53[var11];
                                        var20 = var15 + var19;
                                        var21 = (var15 & 16711935) + (var19 & 16711935);
                                        var19 = (var21 & 16777472) + (var20 - var21 & 65536);
                                        var12[var11] = var20 - var19 | var19 - (var19 >>> 8);
                                        break L38;
                                      }
                                    }
                                  } else {
                                    var15 = ((sda) this).field_F[var10];
                                    if (var15 == 0) {
                                      break L38;
                                    } else {
                                      var16 = var53[var11];
                                      var17 = var15 + var16;
                                      var18 = (var15 & 16711935) + (var16 & 16711935);
                                      var16 = (var18 & 16777472) + (var17 - var18 & 65536);
                                      var12[var11] = var17 - var16 | var16 - (var16 >>> 8);
                                      break L38;
                                    }
                                  }
                                }
                              } else {
                                if (var13 != 1) {
                                  if (var13 != 0) {
                                    if (var13 != 3) {
                                      if (var13 != 2) {
                                        throw new IllegalArgumentException();
                                      } else {
                                        var15 = ((sda) this).field_F[var10];
                                        if (var15 == 0) {
                                          break L38;
                                        } else {
                                          var16 = (var15 & 16711935) * field_i & -16711936;
                                          var17 = (var15 & 65280) * field_i & 16711680;
                                          int incrementValue$53 = var11;
                                          var11++;
                                          var12[incrementValue$53] = ((var16 | var17) >>> 8) + field_g;
                                          break L38;
                                        }
                                      }
                                    } else {
                                      L39: {
                                        var15 = ((sda) this).field_F[var10];
                                        var16 = field_y;
                                        var17 = var15 + var16;
                                        var18 = (var15 & 16711935) + (var16 & 16711935);
                                        var19 = (var18 & 16777472) + (var17 - var18 & 65536);
                                        var19 = var17 - var19 | var19 - (var19 >>> 8);
                                        if (var15 != 0) {
                                          break L39;
                                        } else {
                                          if (field_i == 255) {
                                            break L39;
                                          } else {
                                            var15 = var19;
                                            var19 = var53[var11];
                                            var19 = ((var15 & 16711935) * field_i + (var19 & 16711935) * field_b & -16711936) + ((var15 & 65280) * field_i + (var19 & 65280) * field_b & 16711680) >> 8;
                                            break L39;
                                          }
                                        }
                                      }
                                      var53[var11] = var19;
                                      break L38;
                                    }
                                  } else {
                                    var15 = ((sda) this).field_F[var10];
                                    if (var15 == 0) {
                                      break L38;
                                    } else {
                                      if ((field_y & 16777215) != 16777215) {
                                        if (field_i == 255) {
                                          var16 = (var15 & 16711680) * field_x & -16777216;
                                          var17 = (var15 & 65280) * field_s & 16711680;
                                          var18 = (var15 & 255) * field_E & 65280;
                                          var12[var11] = (var16 | var17 | var18) >>> 8;
                                          break L38;
                                        } else {
                                          var16 = (var15 & 16711680) * field_x & -16777216;
                                          var17 = (var15 & 65280) * field_s & 16711680;
                                          var18 = (var15 & 255) * field_E & 65280;
                                          var15 = (var16 | var17 | var18) >>> 8;
                                          var19 = var53[var11];
                                          var12[var11] = ((var15 & 16711935) * field_i + (var19 & 16711935) * field_b & -16711936) + ((var15 & 65280) * field_i + (var19 & 65280) * field_b & 16711680) >> 8;
                                          break L38;
                                        }
                                      } else {
                                        var16 = field_y >>> 24;
                                        var17 = 256 - var16;
                                        var18 = var53[var11];
                                        var12[var11] = ((var15 & 16711935) * var16 + (var18 & 16711935) * var17 & -16711936) + ((var15 & 65280) * var16 + (var18 & 65280) * var17 & 16711680) >> 8;
                                        break L38;
                                      }
                                    }
                                  }
                                } else {
                                  var15 = ((sda) this).field_F[var10];
                                  if (var15 == 0) {
                                    break L38;
                                  } else {
                                    var53[var11] = var15;
                                    break L38;
                                  }
                                }
                              }
                            } else {
                              if (var13 != 1) {
                                if (var13 != 0) {
                                  if (var13 != 3) {
                                    if (var13 != 2) {
                                      throw new IllegalArgumentException();
                                    } else {
                                      var15 = ((sda) this).field_F[var10];
                                      var16 = (var15 & 16711935) * field_i & -16711936;
                                      var17 = (var15 & 65280) * field_i & 16711680;
                                      var12[var11] = ((var16 | var17) >>> 8) + field_g;
                                      break L38;
                                    }
                                  } else {
                                    int incrementValue$54 = var10;
                                    var10++;
                                    var15 = ((sda) this).field_F[incrementValue$54];
                                    var16 = field_y;
                                    var17 = var15 + var16;
                                    var18 = (var15 & 16711935) + (var16 & 16711935);
                                    var19 = (var18 & 16777472) + (var17 - var18 & 65536);
                                    var12[var11] = var17 - var19 | var19 - (var19 >>> 8);
                                    break L38;
                                  }
                                } else {
                                  int incrementValue$55 = var10;
                                  var10++;
                                  var15 = ((sda) this).field_F[incrementValue$55];
                                  var16 = (var15 & 16711680) * field_x & -16777216;
                                  var17 = (var15 & 65280) * field_s & 16711680;
                                  var18 = (var15 & 255) * field_E & 65280;
                                  var12[var11] = (var16 | var17 | var18) >>> 8;
                                  break L38;
                                }
                              } else {
                                var12[var11] = ((sda) this).field_F[var10];
                                break L38;
                              }
                            }
                          }
                          var7 = var7 + field_C;
                          var8 = var8 + field_v;
                          var9++;
                          continue L37;
                        }
                      }
                    }
                  }
                }
              } else {
                var5 = field_h;
                L40: while (true) {
                  if (var5 >= 0) {
                    break L0;
                  } else {
                    L41: {
                      var6 = field_f;
                      var7 = field_m + field_a;
                      var8 = field_p;
                      var9 = field_B;
                      if (var8 >= 0) {
                        if (var8 - (((sda) this).field_q << 12) < 0) {
                          L42: {
                            var4 = var7 - (((sda) this).field_e << 12);
                            if (var7 - (((sda) this).field_e << 12) < 0) {
                              break L42;
                            } else {
                              var4 = (field_C - var4) / field_C;
                              var9 = var9 + var4;
                              var7 = var7 + field_C * var4;
                              var6 = var6 + var4;
                              break L42;
                            }
                          }
                          L43: {
                            var4 = (var7 - field_C) / field_C;
                            if ((var7 - field_C) / field_C <= var9) {
                              break L43;
                            } else {
                              var9 = var4;
                              break L43;
                            }
                          }
                          L44: while (true) {
                            if (var9 >= 0) {
                              break L41;
                            } else {
                              L45: {
                                var10 = (var8 >> 12) * ((sda) this).field_e + (var7 >> 12);
                                int incrementValue$56 = var6;
                                var6++;
                                var11 = incrementValue$56;
                                var52 = var3;
                                var43 = var52;
                                var34 = var43;
                                var25 = var34;
                                var12 = var25;
                                var13 = param0;
                                var14 = param1;
                                if (var14 != 0) {
                                  if (var14 != 1) {
                                    if (var14 != 2) {
                                      throw new IllegalArgumentException();
                                    } else {
                                      if (var13 != 1) {
                                        if (var13 != 0) {
                                          if (var13 != 3) {
                                            if (var13 != 2) {
                                              break L45;
                                            } else {
                                              var15 = ((sda) this).field_F[var10];
                                              if (var15 == 0) {
                                                break L45;
                                              } else {
                                                var16 = (var15 & 16711935) * field_i & -16711936;
                                                var17 = (var15 & 65280) * field_i & 16711680;
                                                var15 = ((var16 | var17) >>> 8) + field_g;
                                                var18 = var52[var11];
                                                var19 = var15 + var18;
                                                var20 = (var15 & 16711935) + (var18 & 16711935);
                                                var18 = (var20 & 16777472) + (var19 - var20 & 65536);
                                                var12[var11] = var19 - var18 | var18 - (var18 >>> 8);
                                                break L45;
                                              }
                                            }
                                          } else {
                                            var15 = ((sda) this).field_F[var10];
                                            var16 = field_y;
                                            var17 = var15 + var16;
                                            var18 = (var15 & 16711935) + (var16 & 16711935);
                                            var19 = (var18 & 16777472) + (var17 - var18 & 65536);
                                            var15 = var17 - var19 | var19 - (var19 >>> 8);
                                            var19 = var52[var11];
                                            var17 = var15 + var19;
                                            var18 = (var15 & 16711935) + (var19 & 16711935);
                                            var19 = (var18 & 16777472) + (var17 - var18 & 65536);
                                            var12[var11] = var17 - var19 | var19 - (var19 >>> 8);
                                            break L45;
                                          }
                                        } else {
                                          var15 = ((sda) this).field_F[var10];
                                          if (var15 == 0) {
                                            break L45;
                                          } else {
                                            var16 = (var15 & 16711680) * field_x & -16777216;
                                            var17 = (var15 & 65280) * field_s & 16711680;
                                            var18 = (var15 & 255) * field_E & 65280;
                                            var15 = (var16 | var17 | var18) >>> 8;
                                            var19 = var52[var11];
                                            var20 = var15 + var19;
                                            var21 = (var15 & 16711935) + (var19 & 16711935);
                                            var19 = (var21 & 16777472) + (var20 - var21 & 65536);
                                            var12[var11] = var20 - var19 | var19 - (var19 >>> 8);
                                            break L45;
                                          }
                                        }
                                      } else {
                                        var15 = ((sda) this).field_F[var10];
                                        if (var15 == 0) {
                                          break L45;
                                        } else {
                                          var16 = var52[var11];
                                          var17 = var15 + var16;
                                          var18 = (var15 & 16711935) + (var16 & 16711935);
                                          var16 = (var18 & 16777472) + (var17 - var18 & 65536);
                                          var12[var11] = var17 - var16 | var16 - (var16 >>> 8);
                                          break L45;
                                        }
                                      }
                                    }
                                  } else {
                                    if (var13 != 1) {
                                      if (var13 != 0) {
                                        if (var13 != 3) {
                                          if (var13 != 2) {
                                            throw new IllegalArgumentException();
                                          } else {
                                            var15 = ((sda) this).field_F[var10];
                                            if (var15 == 0) {
                                              break L45;
                                            } else {
                                              var16 = (var15 & 16711935) * field_i & -16711936;
                                              var17 = (var15 & 65280) * field_i & 16711680;
                                              int incrementValue$57 = var11;
                                              var11++;
                                              var12[incrementValue$57] = ((var16 | var17) >>> 8) + field_g;
                                              break L45;
                                            }
                                          }
                                        } else {
                                          L46: {
                                            var15 = ((sda) this).field_F[var10];
                                            var16 = field_y;
                                            var17 = var15 + var16;
                                            var18 = (var15 & 16711935) + (var16 & 16711935);
                                            var19 = (var18 & 16777472) + (var17 - var18 & 65536);
                                            var19 = var17 - var19 | var19 - (var19 >>> 8);
                                            if (var15 != 0) {
                                              break L46;
                                            } else {
                                              if (field_i == 255) {
                                                break L46;
                                              } else {
                                                var15 = var19;
                                                var19 = var52[var11];
                                                var19 = ((var15 & 16711935) * field_i + (var19 & 16711935) * field_b & -16711936) + ((var15 & 65280) * field_i + (var19 & 65280) * field_b & 16711680) >> 8;
                                                break L46;
                                              }
                                            }
                                          }
                                          var52[var11] = var19;
                                          break L45;
                                        }
                                      } else {
                                        var15 = ((sda) this).field_F[var10];
                                        if (var15 == 0) {
                                          break L45;
                                        } else {
                                          if ((field_y & 16777215) != 16777215) {
                                            if (field_i == 255) {
                                              var16 = (var15 & 16711680) * field_x & -16777216;
                                              var17 = (var15 & 65280) * field_s & 16711680;
                                              var18 = (var15 & 255) * field_E & 65280;
                                              var12[var11] = (var16 | var17 | var18) >>> 8;
                                              break L45;
                                            } else {
                                              var16 = (var15 & 16711680) * field_x & -16777216;
                                              var17 = (var15 & 65280) * field_s & 16711680;
                                              var18 = (var15 & 255) * field_E & 65280;
                                              var15 = (var16 | var17 | var18) >>> 8;
                                              var19 = var52[var11];
                                              var12[var11] = ((var15 & 16711935) * field_i + (var19 & 16711935) * field_b & -16711936) + ((var15 & 65280) * field_i + (var19 & 65280) * field_b & 16711680) >> 8;
                                              break L45;
                                            }
                                          } else {
                                            var16 = field_y >>> 24;
                                            var17 = 256 - var16;
                                            var18 = var52[var11];
                                            var12[var11] = ((var15 & 16711935) * var16 + (var18 & 16711935) * var17 & -16711936) + ((var15 & 65280) * var16 + (var18 & 65280) * var17 & 16711680) >> 8;
                                            break L45;
                                          }
                                        }
                                      }
                                    } else {
                                      var15 = ((sda) this).field_F[var10];
                                      if (var15 == 0) {
                                        break L45;
                                      } else {
                                        var52[var11] = var15;
                                        break L45;
                                      }
                                    }
                                  }
                                } else {
                                  if (var13 != 1) {
                                    if (var13 != 0) {
                                      if (var13 != 3) {
                                        if (var13 != 2) {
                                          throw new IllegalArgumentException();
                                        } else {
                                          var15 = ((sda) this).field_F[var10];
                                          var16 = (var15 & 16711935) * field_i & -16711936;
                                          var17 = (var15 & 65280) * field_i & 16711680;
                                          var12[var11] = ((var16 | var17) >>> 8) + field_g;
                                          break L45;
                                        }
                                      } else {
                                        int incrementValue$58 = var10;
                                        var10++;
                                        var15 = ((sda) this).field_F[incrementValue$58];
                                        var16 = field_y;
                                        var17 = var15 + var16;
                                        var18 = (var15 & 16711935) + (var16 & 16711935);
                                        var19 = (var18 & 16777472) + (var17 - var18 & 65536);
                                        var12[var11] = var17 - var19 | var19 - (var19 >>> 8);
                                        break L45;
                                      }
                                    } else {
                                      int incrementValue$59 = var10;
                                      var10++;
                                      var15 = ((sda) this).field_F[incrementValue$59];
                                      var16 = (var15 & 16711680) * field_x & -16777216;
                                      var17 = (var15 & 65280) * field_s & 16711680;
                                      var18 = (var15 & 255) * field_E & 65280;
                                      var12[var11] = (var16 | var17 | var18) >>> 8;
                                      break L45;
                                    }
                                  } else {
                                    var12[var11] = ((sda) this).field_F[var10];
                                    break L45;
                                  }
                                }
                              }
                              var7 = var7 + field_C;
                              var9++;
                              continue L44;
                            }
                          }
                        } else {
                          break L41;
                        }
                      } else {
                        break L41;
                      }
                    }
                    var5++;
                    field_p = field_p + field_u;
                    field_f = field_f + field_o;
                    continue L40;
                  }
                }
              }
            }
          } else {
            if (field_v != 0) {
              if (field_v >= 0) {
                var5 = field_h;
                L47: while (true) {
                  if (var5 >= 0) {
                    break L0;
                  } else {
                    L48: {
                      var6 = field_f;
                      var7 = field_m;
                      var8 = field_p + field_l;
                      var9 = field_B;
                      if (var7 >= 0) {
                        if (var7 - (((sda) this).field_e << 12) < 0) {
                          L49: {
                            if (var8 >= 0) {
                              break L49;
                            } else {
                              var4 = (field_v - 1 - var8) / field_v;
                              var9 = var9 + var4;
                              var8 = var8 + field_v * var4;
                              var6 = var6 + var4;
                              break L49;
                            }
                          }
                          L50: {
                            var4 = (1 + var8 - (((sda) this).field_q << 12) - field_v) / field_v;
                            if ((1 + var8 - (((sda) this).field_q << 12) - field_v) / field_v <= var9) {
                              break L50;
                            } else {
                              var9 = var4;
                              break L50;
                            }
                          }
                          L51: while (true) {
                            if (var9 >= 0) {
                              break L48;
                            } else {
                              L52: {
                                var10 = (var8 >> 12) * ((sda) this).field_e + (var7 >> 12);
                                int incrementValue$60 = var6;
                                var6++;
                                var11 = incrementValue$60;
                                var51 = var3;
                                var42 = var51;
                                var33 = var42;
                                var24 = var33;
                                var12 = var24;
                                var13 = param0;
                                var14 = param1;
                                if (var14 != 0) {
                                  if (var14 != 1) {
                                    if (var14 != 2) {
                                      throw new IllegalArgumentException();
                                    } else {
                                      if (var13 != 1) {
                                        if (var13 != 0) {
                                          if (var13 != 3) {
                                            if (var13 != 2) {
                                              break L52;
                                            } else {
                                              var15 = ((sda) this).field_F[var10];
                                              if (var15 == 0) {
                                                break L52;
                                              } else {
                                                var16 = (var15 & 16711935) * field_i & -16711936;
                                                var17 = (var15 & 65280) * field_i & 16711680;
                                                var15 = ((var16 | var17) >>> 8) + field_g;
                                                var18 = var51[var11];
                                                var19 = var15 + var18;
                                                var20 = (var15 & 16711935) + (var18 & 16711935);
                                                var18 = (var20 & 16777472) + (var19 - var20 & 65536);
                                                var12[var11] = var19 - var18 | var18 - (var18 >>> 8);
                                                break L52;
                                              }
                                            }
                                          } else {
                                            var15 = ((sda) this).field_F[var10];
                                            var16 = field_y;
                                            var17 = var15 + var16;
                                            var18 = (var15 & 16711935) + (var16 & 16711935);
                                            var19 = (var18 & 16777472) + (var17 - var18 & 65536);
                                            var15 = var17 - var19 | var19 - (var19 >>> 8);
                                            var19 = var51[var11];
                                            var17 = var15 + var19;
                                            var18 = (var15 & 16711935) + (var19 & 16711935);
                                            var19 = (var18 & 16777472) + (var17 - var18 & 65536);
                                            var12[var11] = var17 - var19 | var19 - (var19 >>> 8);
                                            break L52;
                                          }
                                        } else {
                                          var15 = ((sda) this).field_F[var10];
                                          if (var15 == 0) {
                                            break L52;
                                          } else {
                                            var16 = (var15 & 16711680) * field_x & -16777216;
                                            var17 = (var15 & 65280) * field_s & 16711680;
                                            var18 = (var15 & 255) * field_E & 65280;
                                            var15 = (var16 | var17 | var18) >>> 8;
                                            var19 = var51[var11];
                                            var20 = var15 + var19;
                                            var21 = (var15 & 16711935) + (var19 & 16711935);
                                            var19 = (var21 & 16777472) + (var20 - var21 & 65536);
                                            var12[var11] = var20 - var19 | var19 - (var19 >>> 8);
                                            break L52;
                                          }
                                        }
                                      } else {
                                        var15 = ((sda) this).field_F[var10];
                                        if (var15 == 0) {
                                          break L52;
                                        } else {
                                          var16 = var51[var11];
                                          var17 = var15 + var16;
                                          var18 = (var15 & 16711935) + (var16 & 16711935);
                                          var16 = (var18 & 16777472) + (var17 - var18 & 65536);
                                          var12[var11] = var17 - var16 | var16 - (var16 >>> 8);
                                          break L52;
                                        }
                                      }
                                    }
                                  } else {
                                    if (var13 != 1) {
                                      if (var13 != 0) {
                                        if (var13 != 3) {
                                          if (var13 != 2) {
                                            throw new IllegalArgumentException();
                                          } else {
                                            var15 = ((sda) this).field_F[var10];
                                            if (var15 == 0) {
                                              break L52;
                                            } else {
                                              var16 = (var15 & 16711935) * field_i & -16711936;
                                              var17 = (var15 & 65280) * field_i & 16711680;
                                              int incrementValue$61 = var11;
                                              var11++;
                                              var12[incrementValue$61] = ((var16 | var17) >>> 8) + field_g;
                                              break L52;
                                            }
                                          }
                                        } else {
                                          L53: {
                                            var15 = ((sda) this).field_F[var10];
                                            var16 = field_y;
                                            var17 = var15 + var16;
                                            var18 = (var15 & 16711935) + (var16 & 16711935);
                                            var19 = (var18 & 16777472) + (var17 - var18 & 65536);
                                            var19 = var17 - var19 | var19 - (var19 >>> 8);
                                            if (var15 != 0) {
                                              break L53;
                                            } else {
                                              if (field_i == 255) {
                                                break L53;
                                              } else {
                                                var15 = var19;
                                                var19 = var51[var11];
                                                var19 = ((var15 & 16711935) * field_i + (var19 & 16711935) * field_b & -16711936) + ((var15 & 65280) * field_i + (var19 & 65280) * field_b & 16711680) >> 8;
                                                break L53;
                                              }
                                            }
                                          }
                                          var51[var11] = var19;
                                          break L52;
                                        }
                                      } else {
                                        var15 = ((sda) this).field_F[var10];
                                        if (var15 == 0) {
                                          break L52;
                                        } else {
                                          if ((field_y & 16777215) != 16777215) {
                                            if (field_i == 255) {
                                              var16 = (var15 & 16711680) * field_x & -16777216;
                                              var17 = (var15 & 65280) * field_s & 16711680;
                                              var18 = (var15 & 255) * field_E & 65280;
                                              var12[var11] = (var16 | var17 | var18) >>> 8;
                                              break L52;
                                            } else {
                                              var16 = (var15 & 16711680) * field_x & -16777216;
                                              var17 = (var15 & 65280) * field_s & 16711680;
                                              var18 = (var15 & 255) * field_E & 65280;
                                              var15 = (var16 | var17 | var18) >>> 8;
                                              var19 = var51[var11];
                                              var12[var11] = ((var15 & 16711935) * field_i + (var19 & 16711935) * field_b & -16711936) + ((var15 & 65280) * field_i + (var19 & 65280) * field_b & 16711680) >> 8;
                                              break L52;
                                            }
                                          } else {
                                            var16 = field_y >>> 24;
                                            var17 = 256 - var16;
                                            var18 = var51[var11];
                                            var12[var11] = ((var15 & 16711935) * var16 + (var18 & 16711935) * var17 & -16711936) + ((var15 & 65280) * var16 + (var18 & 65280) * var17 & 16711680) >> 8;
                                            break L52;
                                          }
                                        }
                                      }
                                    } else {
                                      var15 = ((sda) this).field_F[var10];
                                      if (var15 == 0) {
                                        break L52;
                                      } else {
                                        var51[var11] = var15;
                                        break L52;
                                      }
                                    }
                                  }
                                } else {
                                  if (var13 != 1) {
                                    if (var13 != 0) {
                                      if (var13 != 3) {
                                        if (var13 != 2) {
                                          throw new IllegalArgumentException();
                                        } else {
                                          var15 = ((sda) this).field_F[var10];
                                          var16 = (var15 & 16711935) * field_i & -16711936;
                                          var17 = (var15 & 65280) * field_i & 16711680;
                                          var12[var11] = ((var16 | var17) >>> 8) + field_g;
                                          break L52;
                                        }
                                      } else {
                                        int incrementValue$62 = var10;
                                        var10++;
                                        var15 = ((sda) this).field_F[incrementValue$62];
                                        var16 = field_y;
                                        var17 = var15 + var16;
                                        var18 = (var15 & 16711935) + (var16 & 16711935);
                                        var19 = (var18 & 16777472) + (var17 - var18 & 65536);
                                        var12[var11] = var17 - var19 | var19 - (var19 >>> 8);
                                        break L52;
                                      }
                                    } else {
                                      int incrementValue$63 = var10;
                                      var10++;
                                      var15 = ((sda) this).field_F[incrementValue$63];
                                      var16 = (var15 & 16711680) * field_x & -16777216;
                                      var17 = (var15 & 65280) * field_s & 16711680;
                                      var18 = (var15 & 255) * field_E & 65280;
                                      var12[var11] = (var16 | var17 | var18) >>> 8;
                                      break L52;
                                    }
                                  } else {
                                    var12[var11] = ((sda) this).field_F[var10];
                                    break L52;
                                  }
                                }
                              }
                              var8 = var8 + field_v;
                              var9++;
                              continue L51;
                            }
                          }
                        } else {
                          break L48;
                        }
                      } else {
                        break L48;
                      }
                    }
                    var5++;
                    field_m = field_m + field_z;
                    field_f = field_f + field_o;
                    continue L47;
                  }
                }
              } else {
                var5 = field_h;
                L54: while (true) {
                  if (var5 >= 0) {
                    break L0;
                  } else {
                    L55: {
                      var6 = field_f;
                      var7 = field_m;
                      var8 = field_p + field_l;
                      var9 = field_B;
                      if (var7 >= 0) {
                        if (var7 - (((sda) this).field_e << 12) < 0) {
                          L56: {
                            var4 = var8 - (((sda) this).field_q << 12);
                            if (var8 - (((sda) this).field_q << 12) < 0) {
                              break L56;
                            } else {
                              var4 = (field_v - var4) / field_v;
                              var9 = var9 + var4;
                              var8 = var8 + field_v * var4;
                              var6 = var6 + var4;
                              break L56;
                            }
                          }
                          L57: {
                            var4 = (var8 - field_v) / field_v;
                            if ((var8 - field_v) / field_v <= var9) {
                              break L57;
                            } else {
                              var9 = var4;
                              break L57;
                            }
                          }
                          L58: while (true) {
                            if (var9 >= 0) {
                              break L55;
                            } else {
                              L59: {
                                var10 = (var8 >> 12) * ((sda) this).field_e + (var7 >> 12);
                                int incrementValue$64 = var6;
                                var6++;
                                var11 = incrementValue$64;
                                var50 = var3;
                                var41 = var50;
                                var32 = var41;
                                var23 = var32;
                                var12 = var23;
                                var13 = param0;
                                var14 = param1;
                                if (var14 != 0) {
                                  if (var14 != 1) {
                                    if (var14 != 2) {
                                      throw new IllegalArgumentException();
                                    } else {
                                      if (var13 != 1) {
                                        if (var13 != 0) {
                                          if (var13 != 3) {
                                            if (var13 != 2) {
                                              break L59;
                                            } else {
                                              var15 = ((sda) this).field_F[var10];
                                              if (var15 == 0) {
                                                break L59;
                                              } else {
                                                var16 = (var15 & 16711935) * field_i & -16711936;
                                                var17 = (var15 & 65280) * field_i & 16711680;
                                                var15 = ((var16 | var17) >>> 8) + field_g;
                                                var18 = var50[var11];
                                                var19 = var15 + var18;
                                                var20 = (var15 & 16711935) + (var18 & 16711935);
                                                var18 = (var20 & 16777472) + (var19 - var20 & 65536);
                                                var12[var11] = var19 - var18 | var18 - (var18 >>> 8);
                                                break L59;
                                              }
                                            }
                                          } else {
                                            var15 = ((sda) this).field_F[var10];
                                            var16 = field_y;
                                            var17 = var15 + var16;
                                            var18 = (var15 & 16711935) + (var16 & 16711935);
                                            var19 = (var18 & 16777472) + (var17 - var18 & 65536);
                                            var15 = var17 - var19 | var19 - (var19 >>> 8);
                                            var19 = var50[var11];
                                            var17 = var15 + var19;
                                            var18 = (var15 & 16711935) + (var19 & 16711935);
                                            var19 = (var18 & 16777472) + (var17 - var18 & 65536);
                                            var12[var11] = var17 - var19 | var19 - (var19 >>> 8);
                                            break L59;
                                          }
                                        } else {
                                          var15 = ((sda) this).field_F[var10];
                                          if (var15 == 0) {
                                            break L59;
                                          } else {
                                            var16 = (var15 & 16711680) * field_x & -16777216;
                                            var17 = (var15 & 65280) * field_s & 16711680;
                                            var18 = (var15 & 255) * field_E & 65280;
                                            var15 = (var16 | var17 | var18) >>> 8;
                                            var19 = var50[var11];
                                            var20 = var15 + var19;
                                            var21 = (var15 & 16711935) + (var19 & 16711935);
                                            var19 = (var21 & 16777472) + (var20 - var21 & 65536);
                                            var12[var11] = var20 - var19 | var19 - (var19 >>> 8);
                                            break L59;
                                          }
                                        }
                                      } else {
                                        var15 = ((sda) this).field_F[var10];
                                        if (var15 == 0) {
                                          break L59;
                                        } else {
                                          var16 = var50[var11];
                                          var17 = var15 + var16;
                                          var18 = (var15 & 16711935) + (var16 & 16711935);
                                          var16 = (var18 & 16777472) + (var17 - var18 & 65536);
                                          var12[var11] = var17 - var16 | var16 - (var16 >>> 8);
                                          break L59;
                                        }
                                      }
                                    }
                                  } else {
                                    if (var13 != 1) {
                                      if (var13 != 0) {
                                        if (var13 != 3) {
                                          if (var13 != 2) {
                                            throw new IllegalArgumentException();
                                          } else {
                                            var15 = ((sda) this).field_F[var10];
                                            if (var15 == 0) {
                                              break L59;
                                            } else {
                                              var16 = (var15 & 16711935) * field_i & -16711936;
                                              var17 = (var15 & 65280) * field_i & 16711680;
                                              int incrementValue$65 = var11;
                                              var11++;
                                              var12[incrementValue$65] = ((var16 | var17) >>> 8) + field_g;
                                              break L59;
                                            }
                                          }
                                        } else {
                                          L60: {
                                            var15 = ((sda) this).field_F[var10];
                                            var16 = field_y;
                                            var17 = var15 + var16;
                                            var18 = (var15 & 16711935) + (var16 & 16711935);
                                            var19 = (var18 & 16777472) + (var17 - var18 & 65536);
                                            var19 = var17 - var19 | var19 - (var19 >>> 8);
                                            if (var15 != 0) {
                                              break L60;
                                            } else {
                                              if (field_i == 255) {
                                                break L60;
                                              } else {
                                                var15 = var19;
                                                var19 = var50[var11];
                                                var19 = ((var15 & 16711935) * field_i + (var19 & 16711935) * field_b & -16711936) + ((var15 & 65280) * field_i + (var19 & 65280) * field_b & 16711680) >> 8;
                                                break L60;
                                              }
                                            }
                                          }
                                          var50[var11] = var19;
                                          break L59;
                                        }
                                      } else {
                                        var15 = ((sda) this).field_F[var10];
                                        if (var15 == 0) {
                                          break L59;
                                        } else {
                                          if ((field_y & 16777215) != 16777215) {
                                            if (field_i == 255) {
                                              var16 = (var15 & 16711680) * field_x & -16777216;
                                              var17 = (var15 & 65280) * field_s & 16711680;
                                              var18 = (var15 & 255) * field_E & 65280;
                                              var12[var11] = (var16 | var17 | var18) >>> 8;
                                              break L59;
                                            } else {
                                              var16 = (var15 & 16711680) * field_x & -16777216;
                                              var17 = (var15 & 65280) * field_s & 16711680;
                                              var18 = (var15 & 255) * field_E & 65280;
                                              var15 = (var16 | var17 | var18) >>> 8;
                                              var19 = var50[var11];
                                              var12[var11] = ((var15 & 16711935) * field_i + (var19 & 16711935) * field_b & -16711936) + ((var15 & 65280) * field_i + (var19 & 65280) * field_b & 16711680) >> 8;
                                              break L59;
                                            }
                                          } else {
                                            var16 = field_y >>> 24;
                                            var17 = 256 - var16;
                                            var18 = var50[var11];
                                            var12[var11] = ((var15 & 16711935) * var16 + (var18 & 16711935) * var17 & -16711936) + ((var15 & 65280) * var16 + (var18 & 65280) * var17 & 16711680) >> 8;
                                            break L59;
                                          }
                                        }
                                      }
                                    } else {
                                      var15 = ((sda) this).field_F[var10];
                                      if (var15 == 0) {
                                        break L59;
                                      } else {
                                        var50[var11] = var15;
                                        break L59;
                                      }
                                    }
                                  }
                                } else {
                                  if (var13 != 1) {
                                    if (var13 != 0) {
                                      if (var13 != 3) {
                                        if (var13 != 2) {
                                          throw new IllegalArgumentException();
                                        } else {
                                          var15 = ((sda) this).field_F[var10];
                                          var16 = (var15 & 16711935) * field_i & -16711936;
                                          var17 = (var15 & 65280) * field_i & 16711680;
                                          var12[var11] = ((var16 | var17) >>> 8) + field_g;
                                          break L59;
                                        }
                                      } else {
                                        int incrementValue$66 = var10;
                                        var10++;
                                        var15 = ((sda) this).field_F[incrementValue$66];
                                        var16 = field_y;
                                        var17 = var15 + var16;
                                        var18 = (var15 & 16711935) + (var16 & 16711935);
                                        var19 = (var18 & 16777472) + (var17 - var18 & 65536);
                                        var12[var11] = var17 - var19 | var19 - (var19 >>> 8);
                                        break L59;
                                      }
                                    } else {
                                      int incrementValue$67 = var10;
                                      var10++;
                                      var15 = ((sda) this).field_F[incrementValue$67];
                                      var16 = (var15 & 16711680) * field_x & -16777216;
                                      var17 = (var15 & 65280) * field_s & 16711680;
                                      var18 = (var15 & 255) * field_E & 65280;
                                      var12[var11] = (var16 | var17 | var18) >>> 8;
                                      break L59;
                                    }
                                  } else {
                                    var12[var11] = ((sda) this).field_F[var10];
                                    break L59;
                                  }
                                }
                              }
                              var8 = var8 + field_v;
                              var9++;
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
                    var5++;
                    field_m = field_m + field_z;
                    field_f = field_f + field_o;
                    continue L54;
                  }
                }
              }
            } else {
              var5 = field_h;
              L61: while (true) {
                if (var5 >= 0) {
                  return;
                } else {
                  L62: {
                    var6 = field_f;
                    var7 = field_m;
                    var8 = field_p;
                    var9 = field_B;
                    if (var7 >= 0) {
                      if (var8 >= 0) {
                        if (var7 - (((sda) this).field_e << 12) < 0) {
                          if (var8 - (((sda) this).field_q << 12) < 0) {
                            L63: while (true) {
                              if (var9 >= 0) {
                                break L62;
                              } else {
                                L64: {
                                  var10 = (var8 >> 12) * ((sda) this).field_e + (var7 >> 12);
                                  int incrementValue$68 = var6;
                                  var6++;
                                  var11 = incrementValue$68;
                                  var49 = var3;
                                  var40 = var49;
                                  var31 = var40;
                                  var22 = var31;
                                  var12 = var22;
                                  var13 = param0;
                                  var14 = param1;
                                  if (var14 != 0) {
                                    if (var14 != 1) {
                                      if (var14 != 2) {
                                        throw new IllegalArgumentException();
                                      } else {
                                        if (var13 != 1) {
                                          if (var13 != 0) {
                                            if (var13 != 3) {
                                              if (var13 != 2) {
                                                break L64;
                                              } else {
                                                var15 = ((sda) this).field_F[var10];
                                                if (var15 == 0) {
                                                  break L64;
                                                } else {
                                                  var16 = (var15 & 16711935) * field_i & -16711936;
                                                  var17 = (var15 & 65280) * field_i & 16711680;
                                                  var15 = ((var16 | var17) >>> 8) + field_g;
                                                  var18 = var49[var11];
                                                  var19 = var15 + var18;
                                                  var20 = (var15 & 16711935) + (var18 & 16711935);
                                                  var18 = (var20 & 16777472) + (var19 - var20 & 65536);
                                                  var12[var11] = var19 - var18 | var18 - (var18 >>> 8);
                                                  break L64;
                                                }
                                              }
                                            } else {
                                              var15 = ((sda) this).field_F[var10];
                                              var16 = field_y;
                                              var17 = var15 + var16;
                                              var18 = (var15 & 16711935) + (var16 & 16711935);
                                              var19 = (var18 & 16777472) + (var17 - var18 & 65536);
                                              var15 = var17 - var19 | var19 - (var19 >>> 8);
                                              var19 = var49[var11];
                                              var17 = var15 + var19;
                                              var18 = (var15 & 16711935) + (var19 & 16711935);
                                              var19 = (var18 & 16777472) + (var17 - var18 & 65536);
                                              var12[var11] = var17 - var19 | var19 - (var19 >>> 8);
                                              break L64;
                                            }
                                          } else {
                                            var15 = ((sda) this).field_F[var10];
                                            if (var15 == 0) {
                                              break L64;
                                            } else {
                                              var16 = (var15 & 16711680) * field_x & -16777216;
                                              var17 = (var15 & 65280) * field_s & 16711680;
                                              var18 = (var15 & 255) * field_E & 65280;
                                              var15 = (var16 | var17 | var18) >>> 8;
                                              var19 = var49[var11];
                                              var20 = var15 + var19;
                                              var21 = (var15 & 16711935) + (var19 & 16711935);
                                              var19 = (var21 & 16777472) + (var20 - var21 & 65536);
                                              var12[var11] = var20 - var19 | var19 - (var19 >>> 8);
                                              break L64;
                                            }
                                          }
                                        } else {
                                          var15 = ((sda) this).field_F[var10];
                                          if (var15 == 0) {
                                            break L64;
                                          } else {
                                            var16 = var49[var11];
                                            var17 = var15 + var16;
                                            var18 = (var15 & 16711935) + (var16 & 16711935);
                                            var16 = (var18 & 16777472) + (var17 - var18 & 65536);
                                            var12[var11] = var17 - var16 | var16 - (var16 >>> 8);
                                            break L64;
                                          }
                                        }
                                      }
                                    } else {
                                      if (var13 != 1) {
                                        if (var13 != 0) {
                                          if (var13 != 3) {
                                            if (var13 != 2) {
                                              throw new IllegalArgumentException();
                                            } else {
                                              var15 = ((sda) this).field_F[var10];
                                              if (var15 == 0) {
                                                break L64;
                                              } else {
                                                var16 = (var15 & 16711935) * field_i & -16711936;
                                                var17 = (var15 & 65280) * field_i & 16711680;
                                                int incrementValue$69 = var11;
                                                var11++;
                                                var12[incrementValue$69] = ((var16 | var17) >>> 8) + field_g;
                                                break L64;
                                              }
                                            }
                                          } else {
                                            L65: {
                                              var15 = ((sda) this).field_F[var10];
                                              var16 = field_y;
                                              var17 = var15 + var16;
                                              var18 = (var15 & 16711935) + (var16 & 16711935);
                                              var19 = (var18 & 16777472) + (var17 - var18 & 65536);
                                              var19 = var17 - var19 | var19 - (var19 >>> 8);
                                              if (var15 != 0) {
                                                break L65;
                                              } else {
                                                if (field_i == 255) {
                                                  break L65;
                                                } else {
                                                  var15 = var19;
                                                  var19 = var49[var11];
                                                  var19 = ((var15 & 16711935) * field_i + (var19 & 16711935) * field_b & -16711936) + ((var15 & 65280) * field_i + (var19 & 65280) * field_b & 16711680) >> 8;
                                                  break L65;
                                                }
                                              }
                                            }
                                            var49[var11] = var19;
                                            break L64;
                                          }
                                        } else {
                                          var15 = ((sda) this).field_F[var10];
                                          if (var15 == 0) {
                                            break L64;
                                          } else {
                                            if ((field_y & 16777215) != 16777215) {
                                              if (field_i == 255) {
                                                var16 = (var15 & 16711680) * field_x & -16777216;
                                                var17 = (var15 & 65280) * field_s & 16711680;
                                                var18 = (var15 & 255) * field_E & 65280;
                                                var12[var11] = (var16 | var17 | var18) >>> 8;
                                                break L64;
                                              } else {
                                                var16 = (var15 & 16711680) * field_x & -16777216;
                                                var17 = (var15 & 65280) * field_s & 16711680;
                                                var18 = (var15 & 255) * field_E & 65280;
                                                var15 = (var16 | var17 | var18) >>> 8;
                                                var19 = var49[var11];
                                                var12[var11] = ((var15 & 16711935) * field_i + (var19 & 16711935) * field_b & -16711936) + ((var15 & 65280) * field_i + (var19 & 65280) * field_b & 16711680) >> 8;
                                                break L64;
                                              }
                                            } else {
                                              var16 = field_y >>> 24;
                                              var17 = 256 - var16;
                                              var18 = var49[var11];
                                              var12[var11] = ((var15 & 16711935) * var16 + (var18 & 16711935) * var17 & -16711936) + ((var15 & 65280) * var16 + (var18 & 65280) * var17 & 16711680) >> 8;
                                              break L64;
                                            }
                                          }
                                        }
                                      } else {
                                        var15 = ((sda) this).field_F[var10];
                                        if (var15 == 0) {
                                          break L64;
                                        } else {
                                          var49[var11] = var15;
                                          break L64;
                                        }
                                      }
                                    }
                                  } else {
                                    if (var13 != 1) {
                                      if (var13 != 0) {
                                        if (var13 != 3) {
                                          if (var13 != 2) {
                                            throw new IllegalArgumentException();
                                          } else {
                                            var15 = ((sda) this).field_F[var10];
                                            var16 = (var15 & 16711935) * field_i & -16711936;
                                            var17 = (var15 & 65280) * field_i & 16711680;
                                            var12[var11] = ((var16 | var17) >>> 8) + field_g;
                                            break L64;
                                          }
                                        } else {
                                          int incrementValue$70 = var10;
                                          var10++;
                                          var15 = ((sda) this).field_F[incrementValue$70];
                                          var16 = field_y;
                                          var17 = var15 + var16;
                                          var18 = (var15 & 16711935) + (var16 & 16711935);
                                          var19 = (var18 & 16777472) + (var17 - var18 & 65536);
                                          var12[var11] = var17 - var19 | var19 - (var19 >>> 8);
                                          break L64;
                                        }
                                      } else {
                                        int incrementValue$71 = var10;
                                        var10++;
                                        var15 = ((sda) this).field_F[incrementValue$71];
                                        var16 = (var15 & 16711680) * field_x & -16777216;
                                        var17 = (var15 & 65280) * field_s & 16711680;
                                        var18 = (var15 & 255) * field_E & 65280;
                                        var12[var11] = (var16 | var17 | var18) >>> 8;
                                        break L64;
                                      }
                                    } else {
                                      var12[var11] = ((sda) this).field_F[var10];
                                      break L64;
                                    }
                                  }
                                }
                                var9++;
                                continue L63;
                              }
                            }
                          } else {
                            break L62;
                          }
                        } else {
                          break L62;
                        }
                      } else {
                        break L62;
                      }
                    } else {
                      break L62;
                    }
                  }
                  var5++;
                  field_f = field_f + field_o;
                  continue L61;
                }
              }
            }
          }
        }
    }
}
