/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wfa extends oi {
    int[] field_F;

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
        if (!((wfa) this).field_w.g()) {
          L0: {
            var6 = ((wfa) this).field_w.field_i;
            param0 = param0 + ((wfa) this).field_k;
            param1 = param1 + ((wfa) this).field_n;
            var7 = param1 * var6 + param0;
            var8 = 0;
            var9 = ((wfa) this).field_q;
            var10 = ((wfa) this).field_e;
            var11 = var6 - var10;
            var12 = 0;
            if (param1 >= ((wfa) this).field_w.field_n) {
              break L0;
            } else {
              var13_int = ((wfa) this).field_w.field_n - param1;
              var9 = var9 - var13_int;
              param1 = ((wfa) this).field_w.field_n;
              var8 = var8 + var13_int * var10;
              var7 = var7 + var13_int * var6;
              break L0;
            }
          }
          L1: {
            if (param1 + var9 <= ((wfa) this).field_w.field_p) {
              break L1;
            } else {
              var9 = var9 - (param1 + var9 - ((wfa) this).field_w.field_p);
              break L1;
            }
          }
          L2: {
            if (param0 >= ((wfa) this).field_w.field_H) {
              break L2;
            } else {
              var13_int = ((wfa) this).field_w.field_H - param0;
              var10 = var10 - var13_int;
              param0 = ((wfa) this).field_w.field_H;
              var8 = var8 + var13_int;
              var7 = var7 + var13_int;
              var12 = var12 + var13_int;
              var11 = var11 + var13_int;
              break L2;
            }
          }
          L3: {
            if (param0 + var10 <= ((wfa) this).field_w.field_A) {
              break L3;
            } else {
              var13_int = param0 + var10 - ((wfa) this).field_w.field_A;
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
                  var29 = ((wfa) this).field_w.field_k;
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
                                        var8++;
                                        var20 = ((wfa) this).field_F[var8];
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
                                          var7++;
                                          var13[var7] = var22 - var21 | var21 - (var21 >>> 8);
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
                                      var8++;
                                      var16 = ((wfa) this).field_F[var8];
                                      var17 = var16 + param3;
                                      var18 = (var16 & 16711935) + (param3 & 16711935);
                                      var19 = (var18 & 16777472) + (var17 - var18 & 65536);
                                      var16 = var17 - var19 | var19 - (var19 >>> 8);
                                      var19 = var29[var7];
                                      var17 = var16 + var19;
                                      var18 = (var16 & 16711935) + (var19 & 16711935);
                                      var19 = (var18 & 16777472) + (var17 - var18 & 65536);
                                      var7++;
                                      var13[var7] = var17 - var19 | var19 - (var19 >>> 8);
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
                                    var8++;
                                    var19 = ((wfa) this).field_F[var8];
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
                                      var7++;
                                      var13[var7] = var24 - var23 | var23 - (var23 >>> 8);
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
                                  var8++;
                                  var16 = ((wfa) this).field_F[var8];
                                  if (var16 == 0) {
                                    var7++;
                                    var15++;
                                    continue L13;
                                  } else {
                                    var17 = var29[var7];
                                    var18 = var16 + var17;
                                    var19 = (var16 & 16711935) + (var17 & 16711935);
                                    var17 = (var19 & 16777472) + (var18 - var19 & 65536);
                                    var7++;
                                    var13[var7] = var18 - var17 | var17 - (var17 >>> 8);
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
                                      var8++;
                                      var20 = ((wfa) this).field_F[var8];
                                      var21 = var20 >>> 24;
                                      var22 = 256 - var21;
                                      var16 = (var20 & 16711935) * var14 & -16711936;
                                      var17 = (var20 & 65280) * var14 & 16711680;
                                      var20 = ((var16 | var17) >>> 8) + param3;
                                      var23 = var29[var7];
                                      var7++;
                                      var13[var7] = ((var20 & 16711935) * var21 + (var23 & 16711935) * var22 & -16711936) + ((var20 & 65280) * var21 + (var23 & 65280) * var22 & 16711680) >> 8;
                                      var19++;
                                      continue L15;
                                    }
                                  }
                                }
                              }
                            }
                          } else {
                            var14 = -var9;
                            L16: while (true) {
                              if (var14 >= 0) {
                                break L5;
                              } else {
                                var15 = -var10;
                                L17: while (true) {
                                  if (var15 >= 0) {
                                    var7 = var7 + var11;
                                    var8 = var8 + var12;
                                    var14++;
                                    continue L16;
                                  } else {
                                    L18: {
                                      var8++;
                                      var16 = ((wfa) this).field_F[var8];
                                      var17 = var16 + param3;
                                      var18 = (var16 & 16711935) + (param3 & 16711935);
                                      var19 = (var18 & 16777472) + (var17 - var18 & 65536);
                                      var19 = var17 - var19 | var19 - (var19 >>> 8);
                                      var20 = (var19 >>> 24) * (param3 >>> 24) >> 8;
                                      var21 = 256 - var20;
                                      if (var20 == 255) {
                                        break L18;
                                      } else {
                                        var16 = var19;
                                        var19 = var29[var7];
                                        var19 = ((var16 & 16711935) * var20 + (var19 & 16711935) * var21 & -16711936) + ((var16 & 65280) * var20 + (var19 & 65280) * var21 & 16711680) >> 8;
                                        break L18;
                                      }
                                    }
                                    var7++;
                                    var13[var7] = var19;
                                    var15++;
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
                            var17 = -var9;
                            L19: while (true) {
                              if (var17 >= 0) {
                                break L5;
                              } else {
                                var18 = -var10;
                                L20: while (true) {
                                  if (var18 >= 0) {
                                    var7 = var7 + var11;
                                    var8 = var8 + var12;
                                    var17++;
                                    continue L19;
                                  } else {
                                    var8++;
                                    var19 = ((wfa) this).field_F[var8];
                                    var20 = (var19 >>> 24) * (param3 >>> 24) >> 8;
                                    var21 = 256 - var20;
                                    if (var20 == 255) {
                                      var22 = (var19 & 16711680) * var14 & -16777216;
                                      var23 = (var19 & 65280) * var15 & 16711680;
                                      var24 = (var19 & 255) * var16 & 65280;
                                      var7++;
                                      var13[var7] = (var22 | var23 | var24) >>> 8;
                                      var18++;
                                      continue L20;
                                    } else {
                                      var22 = (var19 & 16711680) * var14 & -16777216;
                                      var23 = (var19 & 65280) * var15 & 16711680;
                                      var24 = (var19 & 255) * var16 & 65280;
                                      var19 = (var22 | var23 | var24) >>> 8;
                                      var25 = var29[var7];
                                      var7++;
                                      var13[var7] = ((var19 & 16711935) * var20 + (var25 & 16711935) * var21 & -16711936) + ((var19 & 65280) * var20 + (var25 & 65280) * var21 & 16711680) >> 8;
                                      var18++;
                                      continue L20;
                                    }
                                  }
                                }
                              }
                            }
                          } else {
                            var14 = -var9;
                            L21: while (true) {
                              if (var14 >= 0) {
                                break L5;
                              } else {
                                var15 = -var10;
                                L22: while (true) {
                                  if (var15 >= 0) {
                                    var7 = var7 + var11;
                                    var8 = var8 + var12;
                                    var14++;
                                    continue L21;
                                  } else {
                                    var8++;
                                    var16 = ((wfa) this).field_F[var8];
                                    var17 = (var16 >>> 24) * (param3 >>> 24) >> 8;
                                    var18 = 256 - var17;
                                    var19 = var29[var7];
                                    var7++;
                                    var13[var7] = ((var16 & 16711935) * var17 + (var19 & 16711935) * var18 & -16711936) + ((var16 & 65280) * var17 + (var19 & 65280) * var18 & 16711680) >> 8;
                                    var15++;
                                    continue L22;
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
                            var15 = -var10;
                            L24: while (true) {
                              if (var15 >= 0) {
                                var7 = var7 + var11;
                                var8 = var8 + var12;
                                var14++;
                                continue L23;
                              } else {
                                var8++;
                                var16 = ((wfa) this).field_F[var8];
                                var17 = var16 >>> 24;
                                var18 = 256 - var17;
                                var19 = var29[var7];
                                var7++;
                                var13[var7] = (((var16 & 16711935) * var17 + (var19 & 16711935) * var18 & -16711936) >> 8) + (((var16 & -16711936) >>> 8) * var17 + ((var19 & -16711936) >>> 8) * var18 & -16711936);
                                var15++;
                                continue L24;
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
                            L25: while (true) {
                              if (var18 >= 0) {
                                break L5;
                              } else {
                                var19 = -var10;
                                L26: while (true) {
                                  if (var19 >= 0) {
                                    var7 = var7 + var11;
                                    var8 = var8 + var12;
                                    var18++;
                                    continue L25;
                                  } else {
                                    var8++;
                                    var20 = ((wfa) this).field_F[var8];
                                    var16 = (var20 & 16711935) * var14 & -16711936;
                                    var17 = (var20 & 65280) * var14 & 16711680;
                                    var7++;
                                    var13[var7] = ((var16 | var17) >>> 8) + param3;
                                    var19++;
                                    continue L26;
                                  }
                                }
                              }
                            }
                          }
                        } else {
                          var14 = -var9;
                          L27: while (true) {
                            if (var14 >= 0) {
                              break L5;
                            } else {
                              var15 = -var10;
                              L28: while (true) {
                                if (var15 >= 0) {
                                  var7 = var7 + var11;
                                  var8 = var8 + var12;
                                  var14++;
                                  continue L27;
                                } else {
                                  var8++;
                                  var16 = ((wfa) this).field_F[var8];
                                  var17 = var16 + param3;
                                  var18 = (var16 & 16711935) + (param3 & 16711935);
                                  var19 = (var18 & 16777472) + (var17 - var18 & 65536);
                                  var7++;
                                  var13[var7] = var17 - var19 | var19 - (var19 >>> 8);
                                  var15++;
                                  continue L28;
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
                        L29: while (true) {
                          if (var17 >= 0) {
                            break L5;
                          } else {
                            var18 = -var10;
                            L30: while (true) {
                              if (var18 >= 0) {
                                var7 = var7 + var11;
                                var8 = var8 + var12;
                                var17++;
                                continue L29;
                              } else {
                                var8++;
                                var19 = ((wfa) this).field_F[var8];
                                var20 = (var19 & 16711680) * var14 & -16777216;
                                var21 = (var19 & 65280) * var15 & 16711680;
                                var22 = (var19 & 255) * var16 & 65280;
                                var7++;
                                var13[var7] = (var20 | var21 | var22) >>> 8;
                                var18++;
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
                          break L4;
                        } else {
                          var15 = var7 + var10 - 3;
                          L32: while (true) {
                            if (var7 >= var15) {
                              var15 += 3;
                              L33: while (true) {
                                if (var7 >= var15) {
                                  var7 = var7 + var11;
                                  var8 = var8 + var12;
                                  var14++;
                                  continue L31;
                                } else {
                                  var7++;
                                  var8++;
                                  var13[var7] = ((wfa) this).field_F[var8];
                                  continue L33;
                                }
                              }
                            } else {
                              var7++;
                              var8++;
                              var13[var7] = ((wfa) this).field_F[var8];
                              var7++;
                              var8++;
                              var13[var7] = ((wfa) this).field_F[var8];
                              var7++;
                              var8++;
                              var13[var7] = ((wfa) this).field_F[var8];
                              var7++;
                              var8++;
                              var13[var7] = ((wfa) this).field_F[var8];
                              continue L32;
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

    wfa(sob param0, int param1, int param2) {
        super(param0, param1, param2);
        ((wfa) this).field_F = new int[param1 * param2];
    }

    wfa(sob param0, int[] param1, int param2, int param3, int param4, int param5, boolean param6) {
        super(param0, param4, param5);
        int var9 = 0;
        int var10 = 0;
        if (param6) {
            ((wfa) this).field_F = new int[param4 * param5];
        } else {
            ((wfa) this).field_F = param1;
        }
        param3 = param3 - ((wfa) this).field_e;
        int var8 = 0;
        for (var9 = 0; var9 < param5; var9++) {
            for (var10 = 0; var10 < param4; var10++) {
                var8++;
                param2++;
                ((wfa) this).field_F[var8] = param1[param2];
            }
            param2 = param2 + param3;
        }
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
          var3 = ((wfa) this).field_w.field_k;
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
                        var4 = (1 + var7 - (((wfa) this).field_e << 12) - field_C) / field_C;
                        if ((1 + var7 - (((wfa) this).field_e << 12) - field_C) / field_C <= var9) {
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
                        var4 = (1 + var8 - (((wfa) this).field_q << 12) - field_v) / field_v;
                        if ((1 + var8 - (((wfa) this).field_q << 12) - field_v) / field_v <= var9) {
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
                            var10 = (var8 >> 12) * ((wfa) this).field_e + (var7 >> 12);
                            var6++;
                            var11 = var6;
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
                                          var15 = ((wfa) this).field_F[var10];
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
                                      } else {
                                        var15 = ((wfa) this).field_F[var10];
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
                                      var15 = ((wfa) this).field_F[var10];
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
                                  } else {
                                    var15 = ((wfa) this).field_F[var10];
                                    var16 = var57[var11];
                                    var17 = var15 + var16;
                                    var18 = (var15 & 16711935) + (var16 & 16711935);
                                    var16 = (var18 & 16777472) + (var17 - var18 & 65536);
                                    var12[var11] = var17 - var16 | var16 - (var16 >>> 8);
                                    break L7;
                                  }
                                }
                              } else {
                                if (var13 != 1) {
                                  if (var13 != 0) {
                                    if (var13 != 3) {
                                      if (var13 != 2) {
                                        throw new IllegalArgumentException();
                                      } else {
                                        var15 = ((wfa) this).field_F[var10];
                                        var16 = var15 >>> 24;
                                        var17 = 256 - var16;
                                        var18 = (var15 & 16711935) * field_i & -16711936;
                                        var19 = (var15 & 65280) * field_i & 16711680;
                                        var15 = ((var18 | var19) >>> 8) + field_g;
                                        var20 = var57[var11];
                                        var12[var11] = ((var15 & 16711935) * var16 + (var20 & 16711935) * var17 & -16711936) + ((var15 & 65280) * var16 + (var20 & 65280) * var17 & 16711680) >> 8;
                                        break L7;
                                      }
                                    } else {
                                      L8: {
                                        var15 = ((wfa) this).field_F[var10];
                                        var16 = field_y;
                                        var17 = var15 + var16;
                                        var18 = (var15 & 16711935) + (var16 & 16711935);
                                        var19 = (var18 & 16777472) + (var17 - var18 & 65536);
                                        var19 = var17 - var19 | var19 - (var19 >>> 8);
                                        var20 = (var15 >>> 24) * field_i >> 8;
                                        var21 = 256 - var20;
                                        if (var20 == 255) {
                                          break L8;
                                        } else {
                                          var15 = var19;
                                          var19 = var57[var11];
                                          var19 = ((var15 & 16711935) * var20 + (var19 & 16711935) * var21 & -16711936) + ((var15 & 65280) * var20 + (var19 & 65280) * var21 & 16711680) >> 8;
                                          break L8;
                                        }
                                      }
                                      var57[var11] = var19;
                                      break L7;
                                    }
                                  } else {
                                    var15 = ((wfa) this).field_F[var10];
                                    var16 = (var15 >>> 24) * field_i >> 8;
                                    var17 = 256 - var16;
                                    if ((field_y & 16777215) != 16777215) {
                                      if (var16 == 255) {
                                        var18 = (var15 & 16711680) * field_x & -16777216;
                                        var19 = (var15 & 65280) * field_s & 16711680;
                                        var20 = (var15 & 255) * field_E & 65280;
                                        var12[var11] = (var18 | var19 | var20) >>> 8;
                                        break L7;
                                      } else {
                                        var18 = (var15 & 16711680) * field_x & -16777216;
                                        var19 = (var15 & 65280) * field_s & 16711680;
                                        var20 = (var15 & 255) * field_E & 65280;
                                        var15 = (var18 | var19 | var20) >>> 8;
                                        var21 = var57[var11];
                                        var12[var11] = ((var15 & 16711935) * var16 + (var21 & 16711935) * var17 & -16711936) + ((var15 & 65280) * var16 + (var21 & 65280) * var17 & 16711680) >> 8;
                                        break L7;
                                      }
                                    } else {
                                      var18 = var57[var11];
                                      var12[var11] = ((var15 & 16711935) * var16 + (var18 & 16711935) * var17 & -16711936) + ((var15 & 65280) * var16 + (var18 & 65280) * var17 & 16711680) >> 8;
                                      break L7;
                                    }
                                  }
                                } else {
                                  var15 = ((wfa) this).field_F[var10];
                                  var16 = var15 >>> 24;
                                  var17 = 256 - var16;
                                  var18 = var57[var11];
                                  var12[var11] = ((var15 & 16711935) * var16 + (var18 & 16711935) * var17 & -16711936) + ((var15 & 65280) * var16 + (var18 & 65280) * var17 & 16711680) >> 8;
                                  break L7;
                                }
                              }
                            } else {
                              if (var13 != 1) {
                                if (var13 != 0) {
                                  if (var13 != 3) {
                                    if (var13 != 2) {
                                      throw new IllegalArgumentException();
                                    } else {
                                      var15 = ((wfa) this).field_F[var10];
                                      var16 = (var15 & 16711935) * field_i & -16711936;
                                      var17 = (var15 & 65280) * field_i & 16711680;
                                      var12[var11] = ((var16 | var17) >>> 8) + field_g;
                                      break L7;
                                    }
                                  } else {
                                    var10++;
                                    var15 = ((wfa) this).field_F[var10];
                                    var16 = field_y;
                                    var17 = var15 + var16;
                                    var18 = (var15 & 16711935) + (var16 & 16711935);
                                    var19 = (var18 & 16777472) + (var17 - var18 & 65536);
                                    var12[var11] = var17 - var19 | var19 - (var19 >>> 8);
                                    break L7;
                                  }
                                } else {
                                  var10++;
                                  var15 = ((wfa) this).field_F[var10];
                                  var16 = (var15 & 16711680) * field_x & -16777216;
                                  var17 = (var15 & 65280) * field_s & 16711680;
                                  var18 = (var15 & 255) * field_E & 65280;
                                  var12[var11] = (var16 | var17 | var18) >>> 8;
                                  break L7;
                                }
                              } else {
                                var12[var11] = ((wfa) this).field_F[var10];
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
                        var4 = (1 + var7 - (((wfa) this).field_e << 12) - field_C) / field_C;
                        if ((1 + var7 - (((wfa) this).field_e << 12) - field_C) / field_C <= var9) {
                          break L11;
                        } else {
                          var9 = var4;
                          break L11;
                        }
                      }
                      L12: {
                        var4 = var8 - (((wfa) this).field_q << 12);
                        if (var8 - (((wfa) this).field_q << 12) < 0) {
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
                            var10 = (var8 >> 12) * ((wfa) this).field_e + (var7 >> 12);
                            var6++;
                            var11 = var6;
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
                                          var15 = ((wfa) this).field_F[var10];
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
                                      } else {
                                        var15 = ((wfa) this).field_F[var10];
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
                                      var15 = ((wfa) this).field_F[var10];
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
                                  } else {
                                    var15 = ((wfa) this).field_F[var10];
                                    var16 = var56[var11];
                                    var17 = var15 + var16;
                                    var18 = (var15 & 16711935) + (var16 & 16711935);
                                    var16 = (var18 & 16777472) + (var17 - var18 & 65536);
                                    var12[var11] = var17 - var16 | var16 - (var16 >>> 8);
                                    break L15;
                                  }
                                }
                              } else {
                                if (var13 != 1) {
                                  if (var13 != 0) {
                                    if (var13 != 3) {
                                      if (var13 != 2) {
                                        throw new IllegalArgumentException();
                                      } else {
                                        var15 = ((wfa) this).field_F[var10];
                                        var16 = var15 >>> 24;
                                        var17 = 256 - var16;
                                        var18 = (var15 & 16711935) * field_i & -16711936;
                                        var19 = (var15 & 65280) * field_i & 16711680;
                                        var15 = ((var18 | var19) >>> 8) + field_g;
                                        var20 = var56[var11];
                                        var12[var11] = ((var15 & 16711935) * var16 + (var20 & 16711935) * var17 & -16711936) + ((var15 & 65280) * var16 + (var20 & 65280) * var17 & 16711680) >> 8;
                                        break L15;
                                      }
                                    } else {
                                      L16: {
                                        var15 = ((wfa) this).field_F[var10];
                                        var16 = field_y;
                                        var17 = var15 + var16;
                                        var18 = (var15 & 16711935) + (var16 & 16711935);
                                        var19 = (var18 & 16777472) + (var17 - var18 & 65536);
                                        var19 = var17 - var19 | var19 - (var19 >>> 8);
                                        var20 = (var15 >>> 24) * field_i >> 8;
                                        var21 = 256 - var20;
                                        if (var20 == 255) {
                                          break L16;
                                        } else {
                                          var15 = var19;
                                          var19 = var56[var11];
                                          var19 = ((var15 & 16711935) * var20 + (var19 & 16711935) * var21 & -16711936) + ((var15 & 65280) * var20 + (var19 & 65280) * var21 & 16711680) >> 8;
                                          break L16;
                                        }
                                      }
                                      var56[var11] = var19;
                                      break L15;
                                    }
                                  } else {
                                    var15 = ((wfa) this).field_F[var10];
                                    var16 = (var15 >>> 24) * field_i >> 8;
                                    var17 = 256 - var16;
                                    if ((field_y & 16777215) != 16777215) {
                                      if (var16 == 255) {
                                        var18 = (var15 & 16711680) * field_x & -16777216;
                                        var19 = (var15 & 65280) * field_s & 16711680;
                                        var20 = (var15 & 255) * field_E & 65280;
                                        var12[var11] = (var18 | var19 | var20) >>> 8;
                                        break L15;
                                      } else {
                                        var18 = (var15 & 16711680) * field_x & -16777216;
                                        var19 = (var15 & 65280) * field_s & 16711680;
                                        var20 = (var15 & 255) * field_E & 65280;
                                        var15 = (var18 | var19 | var20) >>> 8;
                                        var21 = var56[var11];
                                        var12[var11] = ((var15 & 16711935) * var16 + (var21 & 16711935) * var17 & -16711936) + ((var15 & 65280) * var16 + (var21 & 65280) * var17 & 16711680) >> 8;
                                        break L15;
                                      }
                                    } else {
                                      var18 = var56[var11];
                                      var12[var11] = ((var15 & 16711935) * var16 + (var18 & 16711935) * var17 & -16711936) + ((var15 & 65280) * var16 + (var18 & 65280) * var17 & 16711680) >> 8;
                                      break L15;
                                    }
                                  }
                                } else {
                                  var15 = ((wfa) this).field_F[var10];
                                  var16 = var15 >>> 24;
                                  var17 = 256 - var16;
                                  var18 = var56[var11];
                                  var12[var11] = ((var15 & 16711935) * var16 + (var18 & 16711935) * var17 & -16711936) + ((var15 & 65280) * var16 + (var18 & 65280) * var17 & 16711680) >> 8;
                                  break L15;
                                }
                              }
                            } else {
                              if (var13 != 1) {
                                if (var13 != 0) {
                                  if (var13 != 3) {
                                    if (var13 != 2) {
                                      throw new IllegalArgumentException();
                                    } else {
                                      var15 = ((wfa) this).field_F[var10];
                                      var16 = (var15 & 16711935) * field_i & -16711936;
                                      var17 = (var15 & 65280) * field_i & 16711680;
                                      var12[var11] = ((var16 | var17) >>> 8) + field_g;
                                      break L15;
                                    }
                                  } else {
                                    var10++;
                                    var15 = ((wfa) this).field_F[var10];
                                    var16 = field_y;
                                    var17 = var15 + var16;
                                    var18 = (var15 & 16711935) + (var16 & 16711935);
                                    var19 = (var18 & 16777472) + (var17 - var18 & 65536);
                                    var12[var11] = var17 - var19 | var19 - (var19 >>> 8);
                                    break L15;
                                  }
                                } else {
                                  var10++;
                                  var15 = ((wfa) this).field_F[var10];
                                  var16 = (var15 & 16711680) * field_x & -16777216;
                                  var17 = (var15 & 65280) * field_s & 16711680;
                                  var18 = (var15 & 255) * field_E & 65280;
                                  var12[var11] = (var16 | var17 | var18) >>> 8;
                                  break L15;
                                }
                              } else {
                                var12[var11] = ((wfa) this).field_F[var10];
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
                        if (var8 - (((wfa) this).field_q << 12) < 0) {
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
                            var4 = (1 + var7 - (((wfa) this).field_e << 12) - field_C) / field_C;
                            if ((1 + var7 - (((wfa) this).field_e << 12) - field_C) / field_C <= var9) {
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
                                var10 = (var8 >> 12) * ((wfa) this).field_e + (var7 >> 12);
                                var6++;
                                var11 = var6;
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
                                              var15 = ((wfa) this).field_F[var10];
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
                                          } else {
                                            var15 = ((wfa) this).field_F[var10];
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
                                          var15 = ((wfa) this).field_F[var10];
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
                                      } else {
                                        var15 = ((wfa) this).field_F[var10];
                                        var16 = var55[var11];
                                        var17 = var15 + var16;
                                        var18 = (var15 & 16711935) + (var16 & 16711935);
                                        var16 = (var18 & 16777472) + (var17 - var18 & 65536);
                                        var12[var11] = var17 - var16 | var16 - (var16 >>> 8);
                                        break L22;
                                      }
                                    }
                                  } else {
                                    if (var13 != 1) {
                                      if (var13 != 0) {
                                        if (var13 != 3) {
                                          if (var13 != 2) {
                                            throw new IllegalArgumentException();
                                          } else {
                                            var15 = ((wfa) this).field_F[var10];
                                            var16 = var15 >>> 24;
                                            var17 = 256 - var16;
                                            var18 = (var15 & 16711935) * field_i & -16711936;
                                            var19 = (var15 & 65280) * field_i & 16711680;
                                            var15 = ((var18 | var19) >>> 8) + field_g;
                                            var20 = var55[var11];
                                            var12[var11] = ((var15 & 16711935) * var16 + (var20 & 16711935) * var17 & -16711936) + ((var15 & 65280) * var16 + (var20 & 65280) * var17 & 16711680) >> 8;
                                            break L22;
                                          }
                                        } else {
                                          L23: {
                                            var15 = ((wfa) this).field_F[var10];
                                            var16 = field_y;
                                            var17 = var15 + var16;
                                            var18 = (var15 & 16711935) + (var16 & 16711935);
                                            var19 = (var18 & 16777472) + (var17 - var18 & 65536);
                                            var19 = var17 - var19 | var19 - (var19 >>> 8);
                                            var20 = (var15 >>> 24) * field_i >> 8;
                                            var21 = 256 - var20;
                                            if (var20 == 255) {
                                              break L23;
                                            } else {
                                              var15 = var19;
                                              var19 = var55[var11];
                                              var19 = ((var15 & 16711935) * var20 + (var19 & 16711935) * var21 & -16711936) + ((var15 & 65280) * var20 + (var19 & 65280) * var21 & 16711680) >> 8;
                                              break L23;
                                            }
                                          }
                                          var55[var11] = var19;
                                          break L22;
                                        }
                                      } else {
                                        var15 = ((wfa) this).field_F[var10];
                                        var16 = (var15 >>> 24) * field_i >> 8;
                                        var17 = 256 - var16;
                                        if ((field_y & 16777215) != 16777215) {
                                          if (var16 == 255) {
                                            var18 = (var15 & 16711680) * field_x & -16777216;
                                            var19 = (var15 & 65280) * field_s & 16711680;
                                            var20 = (var15 & 255) * field_E & 65280;
                                            var12[var11] = (var18 | var19 | var20) >>> 8;
                                            break L22;
                                          } else {
                                            var18 = (var15 & 16711680) * field_x & -16777216;
                                            var19 = (var15 & 65280) * field_s & 16711680;
                                            var20 = (var15 & 255) * field_E & 65280;
                                            var15 = (var18 | var19 | var20) >>> 8;
                                            var21 = var55[var11];
                                            var12[var11] = ((var15 & 16711935) * var16 + (var21 & 16711935) * var17 & -16711936) + ((var15 & 65280) * var16 + (var21 & 65280) * var17 & 16711680) >> 8;
                                            break L22;
                                          }
                                        } else {
                                          var18 = var55[var11];
                                          var12[var11] = ((var15 & 16711935) * var16 + (var18 & 16711935) * var17 & -16711936) + ((var15 & 65280) * var16 + (var18 & 65280) * var17 & 16711680) >> 8;
                                          break L22;
                                        }
                                      }
                                    } else {
                                      var15 = ((wfa) this).field_F[var10];
                                      var16 = var15 >>> 24;
                                      var17 = 256 - var16;
                                      var18 = var55[var11];
                                      var12[var11] = ((var15 & 16711935) * var16 + (var18 & 16711935) * var17 & -16711936) + ((var15 & 65280) * var16 + (var18 & 65280) * var17 & 16711680) >> 8;
                                      break L22;
                                    }
                                  }
                                } else {
                                  if (var13 != 1) {
                                    if (var13 != 0) {
                                      if (var13 != 3) {
                                        if (var13 != 2) {
                                          throw new IllegalArgumentException();
                                        } else {
                                          var15 = ((wfa) this).field_F[var10];
                                          var16 = (var15 & 16711935) * field_i & -16711936;
                                          var17 = (var15 & 65280) * field_i & 16711680;
                                          var12[var11] = ((var16 | var17) >>> 8) + field_g;
                                          break L22;
                                        }
                                      } else {
                                        var10++;
                                        var15 = ((wfa) this).field_F[var10];
                                        var16 = field_y;
                                        var17 = var15 + var16;
                                        var18 = (var15 & 16711935) + (var16 & 16711935);
                                        var19 = (var18 & 16777472) + (var17 - var18 & 65536);
                                        var12[var11] = var17 - var19 | var19 - (var19 >>> 8);
                                        break L22;
                                      }
                                    } else {
                                      var10++;
                                      var15 = ((wfa) this).field_F[var10];
                                      var16 = (var15 & 16711680) * field_x & -16777216;
                                      var17 = (var15 & 65280) * field_s & 16711680;
                                      var18 = (var15 & 255) * field_E & 65280;
                                      var12[var11] = (var16 | var17 | var18) >>> 8;
                                      break L22;
                                    }
                                  } else {
                                    var12[var11] = ((wfa) this).field_F[var10];
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
                        var4 = var7 - (((wfa) this).field_e << 12);
                        if (var7 - (((wfa) this).field_e << 12) < 0) {
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
                        var4 = (1 + var8 - (((wfa) this).field_q << 12) - field_v) / field_v;
                        if ((1 + var8 - (((wfa) this).field_q << 12) - field_v) / field_v <= var9) {
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
                            var10 = (var8 >> 12) * ((wfa) this).field_e + (var7 >> 12);
                            var6++;
                            var11 = var6;
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
                                          var15 = ((wfa) this).field_F[var10];
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
                                      } else {
                                        var15 = ((wfa) this).field_F[var10];
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
                                      var15 = ((wfa) this).field_F[var10];
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
                                  } else {
                                    var15 = ((wfa) this).field_F[var10];
                                    var16 = var54[var11];
                                    var17 = var15 + var16;
                                    var18 = (var15 & 16711935) + (var16 & 16711935);
                                    var16 = (var18 & 16777472) + (var17 - var18 & 65536);
                                    var12[var11] = var17 - var16 | var16 - (var16 >>> 8);
                                    break L30;
                                  }
                                }
                              } else {
                                if (var13 != 1) {
                                  if (var13 != 0) {
                                    if (var13 != 3) {
                                      if (var13 != 2) {
                                        throw new IllegalArgumentException();
                                      } else {
                                        var15 = ((wfa) this).field_F[var10];
                                        var16 = var15 >>> 24;
                                        var17 = 256 - var16;
                                        var18 = (var15 & 16711935) * field_i & -16711936;
                                        var19 = (var15 & 65280) * field_i & 16711680;
                                        var15 = ((var18 | var19) >>> 8) + field_g;
                                        var20 = var54[var11];
                                        var12[var11] = ((var15 & 16711935) * var16 + (var20 & 16711935) * var17 & -16711936) + ((var15 & 65280) * var16 + (var20 & 65280) * var17 & 16711680) >> 8;
                                        break L30;
                                      }
                                    } else {
                                      L31: {
                                        var15 = ((wfa) this).field_F[var10];
                                        var16 = field_y;
                                        var17 = var15 + var16;
                                        var18 = (var15 & 16711935) + (var16 & 16711935);
                                        var19 = (var18 & 16777472) + (var17 - var18 & 65536);
                                        var19 = var17 - var19 | var19 - (var19 >>> 8);
                                        var20 = (var15 >>> 24) * field_i >> 8;
                                        var21 = 256 - var20;
                                        if (var20 == 255) {
                                          break L31;
                                        } else {
                                          var15 = var19;
                                          var19 = var54[var11];
                                          var19 = ((var15 & 16711935) * var20 + (var19 & 16711935) * var21 & -16711936) + ((var15 & 65280) * var20 + (var19 & 65280) * var21 & 16711680) >> 8;
                                          break L31;
                                        }
                                      }
                                      var54[var11] = var19;
                                      break L30;
                                    }
                                  } else {
                                    var15 = ((wfa) this).field_F[var10];
                                    var16 = (var15 >>> 24) * field_i >> 8;
                                    var17 = 256 - var16;
                                    if ((field_y & 16777215) != 16777215) {
                                      if (var16 == 255) {
                                        var18 = (var15 & 16711680) * field_x & -16777216;
                                        var19 = (var15 & 65280) * field_s & 16711680;
                                        var20 = (var15 & 255) * field_E & 65280;
                                        var12[var11] = (var18 | var19 | var20) >>> 8;
                                        break L30;
                                      } else {
                                        var18 = (var15 & 16711680) * field_x & -16777216;
                                        var19 = (var15 & 65280) * field_s & 16711680;
                                        var20 = (var15 & 255) * field_E & 65280;
                                        var15 = (var18 | var19 | var20) >>> 8;
                                        var21 = var54[var11];
                                        var12[var11] = ((var15 & 16711935) * var16 + (var21 & 16711935) * var17 & -16711936) + ((var15 & 65280) * var16 + (var21 & 65280) * var17 & 16711680) >> 8;
                                        break L30;
                                      }
                                    } else {
                                      var18 = var54[var11];
                                      var12[var11] = ((var15 & 16711935) * var16 + (var18 & 16711935) * var17 & -16711936) + ((var15 & 65280) * var16 + (var18 & 65280) * var17 & 16711680) >> 8;
                                      break L30;
                                    }
                                  }
                                } else {
                                  var15 = ((wfa) this).field_F[var10];
                                  var16 = var15 >>> 24;
                                  var17 = 256 - var16;
                                  var18 = var54[var11];
                                  var12[var11] = ((var15 & 16711935) * var16 + (var18 & 16711935) * var17 & -16711936) + ((var15 & 65280) * var16 + (var18 & 65280) * var17 & 16711680) >> 8;
                                  break L30;
                                }
                              }
                            } else {
                              if (var13 != 1) {
                                if (var13 != 0) {
                                  if (var13 != 3) {
                                    if (var13 != 2) {
                                      throw new IllegalArgumentException();
                                    } else {
                                      var15 = ((wfa) this).field_F[var10];
                                      var16 = (var15 & 16711935) * field_i & -16711936;
                                      var17 = (var15 & 65280) * field_i & 16711680;
                                      var12[var11] = ((var16 | var17) >>> 8) + field_g;
                                      break L30;
                                    }
                                  } else {
                                    var10++;
                                    var15 = ((wfa) this).field_F[var10];
                                    var16 = field_y;
                                    var17 = var15 + var16;
                                    var18 = (var15 & 16711935) + (var16 & 16711935);
                                    var19 = (var18 & 16777472) + (var17 - var18 & 65536);
                                    var12[var11] = var17 - var19 | var19 - (var19 >>> 8);
                                    break L30;
                                  }
                                } else {
                                  var10++;
                                  var15 = ((wfa) this).field_F[var10];
                                  var16 = (var15 & 16711680) * field_x & -16777216;
                                  var17 = (var15 & 65280) * field_s & 16711680;
                                  var18 = (var15 & 255) * field_E & 65280;
                                  var12[var11] = (var16 | var17 | var18) >>> 8;
                                  break L30;
                                }
                              } else {
                                var12[var11] = ((wfa) this).field_F[var10];
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
                        var4 = var7 - (((wfa) this).field_e << 12);
                        if (var7 - (((wfa) this).field_e << 12) < 0) {
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
                        var4 = var8 - (((wfa) this).field_q << 12);
                        if (var8 - (((wfa) this).field_q << 12) < 0) {
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
                            var10 = (var8 >> 12) * ((wfa) this).field_e + (var7 >> 12);
                            var6++;
                            var11 = var6;
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
                                          var15 = ((wfa) this).field_F[var10];
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
                                      } else {
                                        var15 = ((wfa) this).field_F[var10];
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
                                      var15 = ((wfa) this).field_F[var10];
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
                                  } else {
                                    var15 = ((wfa) this).field_F[var10];
                                    var16 = var53[var11];
                                    var17 = var15 + var16;
                                    var18 = (var15 & 16711935) + (var16 & 16711935);
                                    var16 = (var18 & 16777472) + (var17 - var18 & 65536);
                                    var12[var11] = var17 - var16 | var16 - (var16 >>> 8);
                                    break L38;
                                  }
                                }
                              } else {
                                if (var13 != 1) {
                                  if (var13 != 0) {
                                    if (var13 != 3) {
                                      if (var13 != 2) {
                                        throw new IllegalArgumentException();
                                      } else {
                                        var15 = ((wfa) this).field_F[var10];
                                        var16 = var15 >>> 24;
                                        var17 = 256 - var16;
                                        var18 = (var15 & 16711935) * field_i & -16711936;
                                        var19 = (var15 & 65280) * field_i & 16711680;
                                        var15 = ((var18 | var19) >>> 8) + field_g;
                                        var20 = var53[var11];
                                        var12[var11] = ((var15 & 16711935) * var16 + (var20 & 16711935) * var17 & -16711936) + ((var15 & 65280) * var16 + (var20 & 65280) * var17 & 16711680) >> 8;
                                        break L38;
                                      }
                                    } else {
                                      L39: {
                                        var15 = ((wfa) this).field_F[var10];
                                        var16 = field_y;
                                        var17 = var15 + var16;
                                        var18 = (var15 & 16711935) + (var16 & 16711935);
                                        var19 = (var18 & 16777472) + (var17 - var18 & 65536);
                                        var19 = var17 - var19 | var19 - (var19 >>> 8);
                                        var20 = (var15 >>> 24) * field_i >> 8;
                                        var21 = 256 - var20;
                                        if (var20 == 255) {
                                          break L39;
                                        } else {
                                          var15 = var19;
                                          var19 = var53[var11];
                                          var19 = ((var15 & 16711935) * var20 + (var19 & 16711935) * var21 & -16711936) + ((var15 & 65280) * var20 + (var19 & 65280) * var21 & 16711680) >> 8;
                                          break L39;
                                        }
                                      }
                                      var53[var11] = var19;
                                      break L38;
                                    }
                                  } else {
                                    var15 = ((wfa) this).field_F[var10];
                                    var16 = (var15 >>> 24) * field_i >> 8;
                                    var17 = 256 - var16;
                                    if ((field_y & 16777215) != 16777215) {
                                      if (var16 == 255) {
                                        var18 = (var15 & 16711680) * field_x & -16777216;
                                        var19 = (var15 & 65280) * field_s & 16711680;
                                        var20 = (var15 & 255) * field_E & 65280;
                                        var12[var11] = (var18 | var19 | var20) >>> 8;
                                        break L38;
                                      } else {
                                        var18 = (var15 & 16711680) * field_x & -16777216;
                                        var19 = (var15 & 65280) * field_s & 16711680;
                                        var20 = (var15 & 255) * field_E & 65280;
                                        var15 = (var18 | var19 | var20) >>> 8;
                                        var21 = var53[var11];
                                        var12[var11] = ((var15 & 16711935) * var16 + (var21 & 16711935) * var17 & -16711936) + ((var15 & 65280) * var16 + (var21 & 65280) * var17 & 16711680) >> 8;
                                        break L38;
                                      }
                                    } else {
                                      var18 = var53[var11];
                                      var12[var11] = ((var15 & 16711935) * var16 + (var18 & 16711935) * var17 & -16711936) + ((var15 & 65280) * var16 + (var18 & 65280) * var17 & 16711680) >> 8;
                                      break L38;
                                    }
                                  }
                                } else {
                                  var15 = ((wfa) this).field_F[var10];
                                  var16 = var15 >>> 24;
                                  var17 = 256 - var16;
                                  var18 = var53[var11];
                                  var12[var11] = ((var15 & 16711935) * var16 + (var18 & 16711935) * var17 & -16711936) + ((var15 & 65280) * var16 + (var18 & 65280) * var17 & 16711680) >> 8;
                                  break L38;
                                }
                              }
                            } else {
                              if (var13 != 1) {
                                if (var13 != 0) {
                                  if (var13 != 3) {
                                    if (var13 != 2) {
                                      throw new IllegalArgumentException();
                                    } else {
                                      var15 = ((wfa) this).field_F[var10];
                                      var16 = (var15 & 16711935) * field_i & -16711936;
                                      var17 = (var15 & 65280) * field_i & 16711680;
                                      var12[var11] = ((var16 | var17) >>> 8) + field_g;
                                      break L38;
                                    }
                                  } else {
                                    var10++;
                                    var15 = ((wfa) this).field_F[var10];
                                    var16 = field_y;
                                    var17 = var15 + var16;
                                    var18 = (var15 & 16711935) + (var16 & 16711935);
                                    var19 = (var18 & 16777472) + (var17 - var18 & 65536);
                                    var12[var11] = var17 - var19 | var19 - (var19 >>> 8);
                                    break L38;
                                  }
                                } else {
                                  var10++;
                                  var15 = ((wfa) this).field_F[var10];
                                  var16 = (var15 & 16711680) * field_x & -16777216;
                                  var17 = (var15 & 65280) * field_s & 16711680;
                                  var18 = (var15 & 255) * field_E & 65280;
                                  var12[var11] = (var16 | var17 | var18) >>> 8;
                                  break L38;
                                }
                              } else {
                                var12[var11] = ((wfa) this).field_F[var10];
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
                        if (var8 - (((wfa) this).field_q << 12) < 0) {
                          L42: {
                            var4 = var7 - (((wfa) this).field_e << 12);
                            if (var7 - (((wfa) this).field_e << 12) < 0) {
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
                                var10 = (var8 >> 12) * ((wfa) this).field_e + (var7 >> 12);
                                var6++;
                                var11 = var6;
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
                                              var15 = ((wfa) this).field_F[var10];
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
                                          } else {
                                            var15 = ((wfa) this).field_F[var10];
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
                                          var15 = ((wfa) this).field_F[var10];
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
                                      } else {
                                        var15 = ((wfa) this).field_F[var10];
                                        var16 = var52[var11];
                                        var17 = var15 + var16;
                                        var18 = (var15 & 16711935) + (var16 & 16711935);
                                        var16 = (var18 & 16777472) + (var17 - var18 & 65536);
                                        var12[var11] = var17 - var16 | var16 - (var16 >>> 8);
                                        break L45;
                                      }
                                    }
                                  } else {
                                    if (var13 != 1) {
                                      if (var13 != 0) {
                                        if (var13 != 3) {
                                          if (var13 != 2) {
                                            throw new IllegalArgumentException();
                                          } else {
                                            var15 = ((wfa) this).field_F[var10];
                                            var16 = var15 >>> 24;
                                            var17 = 256 - var16;
                                            var18 = (var15 & 16711935) * field_i & -16711936;
                                            var19 = (var15 & 65280) * field_i & 16711680;
                                            var15 = ((var18 | var19) >>> 8) + field_g;
                                            var20 = var52[var11];
                                            var12[var11] = ((var15 & 16711935) * var16 + (var20 & 16711935) * var17 & -16711936) + ((var15 & 65280) * var16 + (var20 & 65280) * var17 & 16711680) >> 8;
                                            break L45;
                                          }
                                        } else {
                                          L46: {
                                            var15 = ((wfa) this).field_F[var10];
                                            var16 = field_y;
                                            var17 = var15 + var16;
                                            var18 = (var15 & 16711935) + (var16 & 16711935);
                                            var19 = (var18 & 16777472) + (var17 - var18 & 65536);
                                            var19 = var17 - var19 | var19 - (var19 >>> 8);
                                            var20 = (var15 >>> 24) * field_i >> 8;
                                            var21 = 256 - var20;
                                            if (var20 == 255) {
                                              break L46;
                                            } else {
                                              var15 = var19;
                                              var19 = var52[var11];
                                              var19 = ((var15 & 16711935) * var20 + (var19 & 16711935) * var21 & -16711936) + ((var15 & 65280) * var20 + (var19 & 65280) * var21 & 16711680) >> 8;
                                              break L46;
                                            }
                                          }
                                          var52[var11] = var19;
                                          break L45;
                                        }
                                      } else {
                                        var15 = ((wfa) this).field_F[var10];
                                        var16 = (var15 >>> 24) * field_i >> 8;
                                        var17 = 256 - var16;
                                        if ((field_y & 16777215) != 16777215) {
                                          if (var16 == 255) {
                                            var18 = (var15 & 16711680) * field_x & -16777216;
                                            var19 = (var15 & 65280) * field_s & 16711680;
                                            var20 = (var15 & 255) * field_E & 65280;
                                            var12[var11] = (var18 | var19 | var20) >>> 8;
                                            break L45;
                                          } else {
                                            var18 = (var15 & 16711680) * field_x & -16777216;
                                            var19 = (var15 & 65280) * field_s & 16711680;
                                            var20 = (var15 & 255) * field_E & 65280;
                                            var15 = (var18 | var19 | var20) >>> 8;
                                            var21 = var52[var11];
                                            var12[var11] = ((var15 & 16711935) * var16 + (var21 & 16711935) * var17 & -16711936) + ((var15 & 65280) * var16 + (var21 & 65280) * var17 & 16711680) >> 8;
                                            break L45;
                                          }
                                        } else {
                                          var18 = var52[var11];
                                          var12[var11] = ((var15 & 16711935) * var16 + (var18 & 16711935) * var17 & -16711936) + ((var15 & 65280) * var16 + (var18 & 65280) * var17 & 16711680) >> 8;
                                          break L45;
                                        }
                                      }
                                    } else {
                                      var15 = ((wfa) this).field_F[var10];
                                      var16 = var15 >>> 24;
                                      var17 = 256 - var16;
                                      var18 = var52[var11];
                                      var12[var11] = ((var15 & 16711935) * var16 + (var18 & 16711935) * var17 & -16711936) + ((var15 & 65280) * var16 + (var18 & 65280) * var17 & 16711680) >> 8;
                                      break L45;
                                    }
                                  }
                                } else {
                                  if (var13 != 1) {
                                    if (var13 != 0) {
                                      if (var13 != 3) {
                                        if (var13 != 2) {
                                          throw new IllegalArgumentException();
                                        } else {
                                          var15 = ((wfa) this).field_F[var10];
                                          var16 = (var15 & 16711935) * field_i & -16711936;
                                          var17 = (var15 & 65280) * field_i & 16711680;
                                          var12[var11] = ((var16 | var17) >>> 8) + field_g;
                                          break L45;
                                        }
                                      } else {
                                        var10++;
                                        var15 = ((wfa) this).field_F[var10];
                                        var16 = field_y;
                                        var17 = var15 + var16;
                                        var18 = (var15 & 16711935) + (var16 & 16711935);
                                        var19 = (var18 & 16777472) + (var17 - var18 & 65536);
                                        var12[var11] = var17 - var19 | var19 - (var19 >>> 8);
                                        break L45;
                                      }
                                    } else {
                                      var10++;
                                      var15 = ((wfa) this).field_F[var10];
                                      var16 = (var15 & 16711680) * field_x & -16777216;
                                      var17 = (var15 & 65280) * field_s & 16711680;
                                      var18 = (var15 & 255) * field_E & 65280;
                                      var12[var11] = (var16 | var17 | var18) >>> 8;
                                      break L45;
                                    }
                                  } else {
                                    var12[var11] = ((wfa) this).field_F[var10];
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
                        if (var7 - (((wfa) this).field_e << 12) < 0) {
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
                            var4 = (1 + var8 - (((wfa) this).field_q << 12) - field_v) / field_v;
                            if ((1 + var8 - (((wfa) this).field_q << 12) - field_v) / field_v <= var9) {
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
                                var10 = (var8 >> 12) * ((wfa) this).field_e + (var7 >> 12);
                                var6++;
                                var11 = var6;
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
                                              var15 = ((wfa) this).field_F[var10];
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
                                          } else {
                                            var15 = ((wfa) this).field_F[var10];
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
                                          var15 = ((wfa) this).field_F[var10];
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
                                      } else {
                                        var15 = ((wfa) this).field_F[var10];
                                        var16 = var51[var11];
                                        var17 = var15 + var16;
                                        var18 = (var15 & 16711935) + (var16 & 16711935);
                                        var16 = (var18 & 16777472) + (var17 - var18 & 65536);
                                        var12[var11] = var17 - var16 | var16 - (var16 >>> 8);
                                        break L52;
                                      }
                                    }
                                  } else {
                                    if (var13 != 1) {
                                      if (var13 != 0) {
                                        if (var13 != 3) {
                                          if (var13 != 2) {
                                            throw new IllegalArgumentException();
                                          } else {
                                            var15 = ((wfa) this).field_F[var10];
                                            var16 = var15 >>> 24;
                                            var17 = 256 - var16;
                                            var18 = (var15 & 16711935) * field_i & -16711936;
                                            var19 = (var15 & 65280) * field_i & 16711680;
                                            var15 = ((var18 | var19) >>> 8) + field_g;
                                            var20 = var51[var11];
                                            var12[var11] = ((var15 & 16711935) * var16 + (var20 & 16711935) * var17 & -16711936) + ((var15 & 65280) * var16 + (var20 & 65280) * var17 & 16711680) >> 8;
                                            break L52;
                                          }
                                        } else {
                                          L53: {
                                            var15 = ((wfa) this).field_F[var10];
                                            var16 = field_y;
                                            var17 = var15 + var16;
                                            var18 = (var15 & 16711935) + (var16 & 16711935);
                                            var19 = (var18 & 16777472) + (var17 - var18 & 65536);
                                            var19 = var17 - var19 | var19 - (var19 >>> 8);
                                            var20 = (var15 >>> 24) * field_i >> 8;
                                            var21 = 256 - var20;
                                            if (var20 == 255) {
                                              break L53;
                                            } else {
                                              var15 = var19;
                                              var19 = var51[var11];
                                              var19 = ((var15 & 16711935) * var20 + (var19 & 16711935) * var21 & -16711936) + ((var15 & 65280) * var20 + (var19 & 65280) * var21 & 16711680) >> 8;
                                              break L53;
                                            }
                                          }
                                          var51[var11] = var19;
                                          break L52;
                                        }
                                      } else {
                                        var15 = ((wfa) this).field_F[var10];
                                        var16 = (var15 >>> 24) * field_i >> 8;
                                        var17 = 256 - var16;
                                        if ((field_y & 16777215) != 16777215) {
                                          if (var16 == 255) {
                                            var18 = (var15 & 16711680) * field_x & -16777216;
                                            var19 = (var15 & 65280) * field_s & 16711680;
                                            var20 = (var15 & 255) * field_E & 65280;
                                            var12[var11] = (var18 | var19 | var20) >>> 8;
                                            break L52;
                                          } else {
                                            var18 = (var15 & 16711680) * field_x & -16777216;
                                            var19 = (var15 & 65280) * field_s & 16711680;
                                            var20 = (var15 & 255) * field_E & 65280;
                                            var15 = (var18 | var19 | var20) >>> 8;
                                            var21 = var51[var11];
                                            var12[var11] = ((var15 & 16711935) * var16 + (var21 & 16711935) * var17 & -16711936) + ((var15 & 65280) * var16 + (var21 & 65280) * var17 & 16711680) >> 8;
                                            break L52;
                                          }
                                        } else {
                                          var18 = var51[var11];
                                          var12[var11] = ((var15 & 16711935) * var16 + (var18 & 16711935) * var17 & -16711936) + ((var15 & 65280) * var16 + (var18 & 65280) * var17 & 16711680) >> 8;
                                          break L52;
                                        }
                                      }
                                    } else {
                                      var15 = ((wfa) this).field_F[var10];
                                      var16 = var15 >>> 24;
                                      var17 = 256 - var16;
                                      var18 = var51[var11];
                                      var12[var11] = ((var15 & 16711935) * var16 + (var18 & 16711935) * var17 & -16711936) + ((var15 & 65280) * var16 + (var18 & 65280) * var17 & 16711680) >> 8;
                                      break L52;
                                    }
                                  }
                                } else {
                                  if (var13 != 1) {
                                    if (var13 != 0) {
                                      if (var13 != 3) {
                                        if (var13 != 2) {
                                          throw new IllegalArgumentException();
                                        } else {
                                          var15 = ((wfa) this).field_F[var10];
                                          var16 = (var15 & 16711935) * field_i & -16711936;
                                          var17 = (var15 & 65280) * field_i & 16711680;
                                          var12[var11] = ((var16 | var17) >>> 8) + field_g;
                                          break L52;
                                        }
                                      } else {
                                        var10++;
                                        var15 = ((wfa) this).field_F[var10];
                                        var16 = field_y;
                                        var17 = var15 + var16;
                                        var18 = (var15 & 16711935) + (var16 & 16711935);
                                        var19 = (var18 & 16777472) + (var17 - var18 & 65536);
                                        var12[var11] = var17 - var19 | var19 - (var19 >>> 8);
                                        break L52;
                                      }
                                    } else {
                                      var10++;
                                      var15 = ((wfa) this).field_F[var10];
                                      var16 = (var15 & 16711680) * field_x & -16777216;
                                      var17 = (var15 & 65280) * field_s & 16711680;
                                      var18 = (var15 & 255) * field_E & 65280;
                                      var12[var11] = (var16 | var17 | var18) >>> 8;
                                      break L52;
                                    }
                                  } else {
                                    var12[var11] = ((wfa) this).field_F[var10];
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
                        if (var7 - (((wfa) this).field_e << 12) < 0) {
                          L56: {
                            var4 = var8 - (((wfa) this).field_q << 12);
                            if (var8 - (((wfa) this).field_q << 12) < 0) {
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
                                var10 = (var8 >> 12) * ((wfa) this).field_e + (var7 >> 12);
                                var6++;
                                var11 = var6;
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
                                              var15 = ((wfa) this).field_F[var10];
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
                                          } else {
                                            var15 = ((wfa) this).field_F[var10];
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
                                          var15 = ((wfa) this).field_F[var10];
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
                                      } else {
                                        var15 = ((wfa) this).field_F[var10];
                                        var16 = var50[var11];
                                        var17 = var15 + var16;
                                        var18 = (var15 & 16711935) + (var16 & 16711935);
                                        var16 = (var18 & 16777472) + (var17 - var18 & 65536);
                                        var12[var11] = var17 - var16 | var16 - (var16 >>> 8);
                                        break L59;
                                      }
                                    }
                                  } else {
                                    if (var13 != 1) {
                                      if (var13 != 0) {
                                        if (var13 != 3) {
                                          if (var13 != 2) {
                                            throw new IllegalArgumentException();
                                          } else {
                                            var15 = ((wfa) this).field_F[var10];
                                            var16 = var15 >>> 24;
                                            var17 = 256 - var16;
                                            var18 = (var15 & 16711935) * field_i & -16711936;
                                            var19 = (var15 & 65280) * field_i & 16711680;
                                            var15 = ((var18 | var19) >>> 8) + field_g;
                                            var20 = var50[var11];
                                            var12[var11] = ((var15 & 16711935) * var16 + (var20 & 16711935) * var17 & -16711936) + ((var15 & 65280) * var16 + (var20 & 65280) * var17 & 16711680) >> 8;
                                            break L59;
                                          }
                                        } else {
                                          L60: {
                                            var15 = ((wfa) this).field_F[var10];
                                            var16 = field_y;
                                            var17 = var15 + var16;
                                            var18 = (var15 & 16711935) + (var16 & 16711935);
                                            var19 = (var18 & 16777472) + (var17 - var18 & 65536);
                                            var19 = var17 - var19 | var19 - (var19 >>> 8);
                                            var20 = (var15 >>> 24) * field_i >> 8;
                                            var21 = 256 - var20;
                                            if (var20 == 255) {
                                              break L60;
                                            } else {
                                              var15 = var19;
                                              var19 = var50[var11];
                                              var19 = ((var15 & 16711935) * var20 + (var19 & 16711935) * var21 & -16711936) + ((var15 & 65280) * var20 + (var19 & 65280) * var21 & 16711680) >> 8;
                                              break L60;
                                            }
                                          }
                                          var50[var11] = var19;
                                          break L59;
                                        }
                                      } else {
                                        var15 = ((wfa) this).field_F[var10];
                                        var16 = (var15 >>> 24) * field_i >> 8;
                                        var17 = 256 - var16;
                                        if ((field_y & 16777215) != 16777215) {
                                          if (var16 == 255) {
                                            var18 = (var15 & 16711680) * field_x & -16777216;
                                            var19 = (var15 & 65280) * field_s & 16711680;
                                            var20 = (var15 & 255) * field_E & 65280;
                                            var12[var11] = (var18 | var19 | var20) >>> 8;
                                            break L59;
                                          } else {
                                            var18 = (var15 & 16711680) * field_x & -16777216;
                                            var19 = (var15 & 65280) * field_s & 16711680;
                                            var20 = (var15 & 255) * field_E & 65280;
                                            var15 = (var18 | var19 | var20) >>> 8;
                                            var21 = var50[var11];
                                            var12[var11] = ((var15 & 16711935) * var16 + (var21 & 16711935) * var17 & -16711936) + ((var15 & 65280) * var16 + (var21 & 65280) * var17 & 16711680) >> 8;
                                            break L59;
                                          }
                                        } else {
                                          var18 = var50[var11];
                                          var12[var11] = ((var15 & 16711935) * var16 + (var18 & 16711935) * var17 & -16711936) + ((var15 & 65280) * var16 + (var18 & 65280) * var17 & 16711680) >> 8;
                                          break L59;
                                        }
                                      }
                                    } else {
                                      var15 = ((wfa) this).field_F[var10];
                                      var16 = var15 >>> 24;
                                      var17 = 256 - var16;
                                      var18 = var50[var11];
                                      var12[var11] = ((var15 & 16711935) * var16 + (var18 & 16711935) * var17 & -16711936) + ((var15 & 65280) * var16 + (var18 & 65280) * var17 & 16711680) >> 8;
                                      break L59;
                                    }
                                  }
                                } else {
                                  if (var13 != 1) {
                                    if (var13 != 0) {
                                      if (var13 != 3) {
                                        if (var13 != 2) {
                                          throw new IllegalArgumentException();
                                        } else {
                                          var15 = ((wfa) this).field_F[var10];
                                          var16 = (var15 & 16711935) * field_i & -16711936;
                                          var17 = (var15 & 65280) * field_i & 16711680;
                                          var12[var11] = ((var16 | var17) >>> 8) + field_g;
                                          break L59;
                                        }
                                      } else {
                                        var10++;
                                        var15 = ((wfa) this).field_F[var10];
                                        var16 = field_y;
                                        var17 = var15 + var16;
                                        var18 = (var15 & 16711935) + (var16 & 16711935);
                                        var19 = (var18 & 16777472) + (var17 - var18 & 65536);
                                        var12[var11] = var17 - var19 | var19 - (var19 >>> 8);
                                        break L59;
                                      }
                                    } else {
                                      var10++;
                                      var15 = ((wfa) this).field_F[var10];
                                      var16 = (var15 & 16711680) * field_x & -16777216;
                                      var17 = (var15 & 65280) * field_s & 16711680;
                                      var18 = (var15 & 255) * field_E & 65280;
                                      var12[var11] = (var16 | var17 | var18) >>> 8;
                                      break L59;
                                    }
                                  } else {
                                    var12[var11] = ((wfa) this).field_F[var10];
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
                        if (var7 - (((wfa) this).field_e << 12) < 0) {
                          if (var8 - (((wfa) this).field_q << 12) < 0) {
                            L63: while (true) {
                              if (var9 >= 0) {
                                break L62;
                              } else {
                                L64: {
                                  var10 = (var8 >> 12) * ((wfa) this).field_e + (var7 >> 12);
                                  var6++;
                                  var11 = var6;
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
                                                var15 = ((wfa) this).field_F[var10];
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
                                            } else {
                                              var15 = ((wfa) this).field_F[var10];
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
                                            var15 = ((wfa) this).field_F[var10];
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
                                        } else {
                                          var15 = ((wfa) this).field_F[var10];
                                          var16 = var49[var11];
                                          var17 = var15 + var16;
                                          var18 = (var15 & 16711935) + (var16 & 16711935);
                                          var16 = (var18 & 16777472) + (var17 - var18 & 65536);
                                          var12[var11] = var17 - var16 | var16 - (var16 >>> 8);
                                          break L64;
                                        }
                                      }
                                    } else {
                                      if (var13 != 1) {
                                        if (var13 != 0) {
                                          if (var13 != 3) {
                                            if (var13 != 2) {
                                              throw new IllegalArgumentException();
                                            } else {
                                              var15 = ((wfa) this).field_F[var10];
                                              var16 = var15 >>> 24;
                                              var17 = 256 - var16;
                                              var18 = (var15 & 16711935) * field_i & -16711936;
                                              var19 = (var15 & 65280) * field_i & 16711680;
                                              var15 = ((var18 | var19) >>> 8) + field_g;
                                              var20 = var49[var11];
                                              var12[var11] = ((var15 & 16711935) * var16 + (var20 & 16711935) * var17 & -16711936) + ((var15 & 65280) * var16 + (var20 & 65280) * var17 & 16711680) >> 8;
                                              break L64;
                                            }
                                          } else {
                                            L65: {
                                              var15 = ((wfa) this).field_F[var10];
                                              var16 = field_y;
                                              var17 = var15 + var16;
                                              var18 = (var15 & 16711935) + (var16 & 16711935);
                                              var19 = (var18 & 16777472) + (var17 - var18 & 65536);
                                              var19 = var17 - var19 | var19 - (var19 >>> 8);
                                              var20 = (var15 >>> 24) * field_i >> 8;
                                              var21 = 256 - var20;
                                              if (var20 == 255) {
                                                break L65;
                                              } else {
                                                var15 = var19;
                                                var19 = var49[var11];
                                                var19 = ((var15 & 16711935) * var20 + (var19 & 16711935) * var21 & -16711936) + ((var15 & 65280) * var20 + (var19 & 65280) * var21 & 16711680) >> 8;
                                                break L65;
                                              }
                                            }
                                            var49[var11] = var19;
                                            break L64;
                                          }
                                        } else {
                                          var15 = ((wfa) this).field_F[var10];
                                          var16 = (var15 >>> 24) * field_i >> 8;
                                          var17 = 256 - var16;
                                          if ((field_y & 16777215) != 16777215) {
                                            if (var16 == 255) {
                                              var18 = (var15 & 16711680) * field_x & -16777216;
                                              var19 = (var15 & 65280) * field_s & 16711680;
                                              var20 = (var15 & 255) * field_E & 65280;
                                              var12[var11] = (var18 | var19 | var20) >>> 8;
                                              break L64;
                                            } else {
                                              var18 = (var15 & 16711680) * field_x & -16777216;
                                              var19 = (var15 & 65280) * field_s & 16711680;
                                              var20 = (var15 & 255) * field_E & 65280;
                                              var15 = (var18 | var19 | var20) >>> 8;
                                              var21 = var49[var11];
                                              var12[var11] = ((var15 & 16711935) * var16 + (var21 & 16711935) * var17 & -16711936) + ((var15 & 65280) * var16 + (var21 & 65280) * var17 & 16711680) >> 8;
                                              break L64;
                                            }
                                          } else {
                                            var18 = var49[var11];
                                            var12[var11] = ((var15 & 16711935) * var16 + (var18 & 16711935) * var17 & -16711936) + ((var15 & 65280) * var16 + (var18 & 65280) * var17 & 16711680) >> 8;
                                            break L64;
                                          }
                                        }
                                      } else {
                                        var15 = ((wfa) this).field_F[var10];
                                        var16 = var15 >>> 24;
                                        var17 = 256 - var16;
                                        var18 = var49[var11];
                                        var12[var11] = ((var15 & 16711935) * var16 + (var18 & 16711935) * var17 & -16711936) + ((var15 & 65280) * var16 + (var18 & 65280) * var17 & 16711680) >> 8;
                                        break L64;
                                      }
                                    }
                                  } else {
                                    if (var13 != 1) {
                                      if (var13 != 0) {
                                        if (var13 != 3) {
                                          if (var13 != 2) {
                                            throw new IllegalArgumentException();
                                          } else {
                                            var15 = ((wfa) this).field_F[var10];
                                            var16 = (var15 & 16711935) * field_i & -16711936;
                                            var17 = (var15 & 65280) * field_i & 16711680;
                                            var12[var11] = ((var16 | var17) >>> 8) + field_g;
                                            break L64;
                                          }
                                        } else {
                                          var10++;
                                          var15 = ((wfa) this).field_F[var10];
                                          var16 = field_y;
                                          var17 = var15 + var16;
                                          var18 = (var15 & 16711935) + (var16 & 16711935);
                                          var19 = (var18 & 16777472) + (var17 - var18 & 65536);
                                          var12[var11] = var17 - var19 | var19 - (var19 >>> 8);
                                          break L64;
                                        }
                                      } else {
                                        var10++;
                                        var15 = ((wfa) this).field_F[var10];
                                        var16 = (var15 & 16711680) * field_x & -16777216;
                                        var17 = (var15 & 65280) * field_s & 16711680;
                                        var18 = (var15 & 255) * field_E & 65280;
                                        var12[var11] = (var16 | var17 | var18) >>> 8;
                                        break L64;
                                      }
                                    } else {
                                      var12[var11] = ((wfa) this).field_F[var10];
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

    wfa(sob param0, int[] param1, int param2, int param3) {
        super(param0, param2, param3);
        ((wfa) this).field_F = param1;
    }

    final void a(int param0, int param1, int param2, int param3, int[] param4, int param5, int param6) {
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        param6 = param6 - param2;
        for (var8 = 0; var8 < param3; var8++) {
            var9 = (param1 + var8) * param2 + param0;
            for (var10 = 0; var10 < param2; var10++) {
                param5++;
                ((wfa) this).field_F[var9 + var10] = param4[param5];
            }
            param5 = param5 + param6;
        }
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
        if (!((wfa) this).field_w.g()) {
          L0: {
            if (param2 <= 0) {
              break L0;
            } else {
              if (param3 > 0) {
                L1: {
                  var9 = 0;
                  var10 = 0;
                  var11 = ((wfa) this).field_w.field_i;
                  var12 = ((wfa) this).field_k + ((wfa) this).field_e + ((wfa) this).field_D;
                  var13 = ((wfa) this).field_n + ((wfa) this).field_q + ((wfa) this).field_j;
                  var14 = (var12 << 16) / param2;
                  var15 = (var13 << 16) / param3;
                  if (((wfa) this).field_k <= 0) {
                    break L1;
                  } else {
                    var16 = ((((wfa) this).field_k << 16) + var14 - 1) / var14;
                    param0 = param0 + var16;
                    var9 = var9 + (var16 * var14 - (((wfa) this).field_k << 16));
                    break L1;
                  }
                }
                L2: {
                  if (((wfa) this).field_n <= 0) {
                    break L2;
                  } else {
                    var16 = ((((wfa) this).field_n << 16) + var15 - 1) / var15;
                    param1 = param1 + var16;
                    var10 = var10 + (var16 * var15 - (((wfa) this).field_n << 16));
                    break L2;
                  }
                }
                L3: {
                  if (((wfa) this).field_e >= var12) {
                    break L3;
                  } else {
                    param2 = ((((wfa) this).field_e << 16) - var9 + var14 - 1) / var14;
                    break L3;
                  }
                }
                L4: {
                  if (((wfa) this).field_q >= var13) {
                    break L4;
                  } else {
                    param3 = ((((wfa) this).field_q << 16) - var10 + var15 - 1) / var15;
                    break L4;
                  }
                }
                L5: {
                  var16 = param0 + param1 * var11;
                  var17 = var11 - param2;
                  if (param1 + param3 <= ((wfa) this).field_w.field_p) {
                    break L5;
                  } else {
                    param3 = param3 - (param1 + param3 - ((wfa) this).field_w.field_p);
                    break L5;
                  }
                }
                L6: {
                  if (param1 >= ((wfa) this).field_w.field_n) {
                    break L6;
                  } else {
                    var18_int = ((wfa) this).field_w.field_n - param1;
                    param3 = param3 - var18_int;
                    var16 = var16 + var18_int * var11;
                    var10 = var10 + var15 * var18_int;
                    break L6;
                  }
                }
                L7: {
                  if (param0 + param2 <= ((wfa) this).field_w.field_A) {
                    break L7;
                  } else {
                    var18_int = param0 + param2 - ((wfa) this).field_w.field_A;
                    param2 = param2 - var18_int;
                    var17 = var17 + var18_int;
                    break L7;
                  }
                }
                L8: {
                  if (param0 >= ((wfa) this).field_w.field_H) {
                    break L8;
                  } else {
                    var18_int = ((wfa) this).field_w.field_H - param0;
                    param2 = param2 - var18_int;
                    var16 = var16 + var18_int;
                    var9 = var9 + var14 * var18_int;
                    var17 = var17 + var18_int;
                    break L8;
                  }
                }
                L9: {
                  var36 = ((wfa) this).field_w.field_k;
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
                                    var25 = (var10 >> 16) * ((wfa) this).field_e;
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
                                          var27 = ((wfa) this).field_F[(var9 >> 16) + var25];
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
                                            var16++;
                                            var18[var16] = var29 - var28 | var28 - (var28 >>> 8);
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
                                  var21 = (var10 >> 16) * ((wfa) this).field_e;
                                  var22 = -param2;
                                  L14: while (true) {
                                    if (var22 >= 0) {
                                      var10 = var10 + var15;
                                      var9 = var19;
                                      var16 = var16 + var17;
                                      var20++;
                                      continue L13;
                                    } else {
                                      var23 = ((wfa) this).field_F[(var9 >> 16) + var21];
                                      var24 = var23 + param5;
                                      var25 = (var23 & 16711935) + (param5 & 16711935);
                                      var26 = (var25 & 16777472) + (var24 - var25 & 65536);
                                      var23 = var24 - var26 | var26 - (var26 >>> 8);
                                      var26 = var36[var16];
                                      var24 = var23 + var26;
                                      var25 = (var23 & 16711935) + (var26 & 16711935);
                                      var26 = (var25 & 16777472) + (var24 - var25 & 65536);
                                      var16++;
                                      var18[var16] = var24 - var26 | var26 - (var26 >>> 8);
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
                                var24 = (var10 >> 16) * ((wfa) this).field_e;
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
                                      var26 = ((wfa) this).field_F[(var9 >> 16) + var24];
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
                                        var16++;
                                        var18[var16] = var31 - var30 | var30 - (var30 >>> 8);
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
                              var21 = (var10 >> 16) * ((wfa) this).field_e;
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
                                    var23 = ((wfa) this).field_F[(var9 >> 16) + var21];
                                    if (var23 == 0) {
                                      var16++;
                                      break L20;
                                    } else {
                                      var24 = var36[var16];
                                      var25 = var23 + var24;
                                      var26 = (var23 & 16711935) + (var24 & 16711935);
                                      var24 = (var26 & 16777472) + (var25 - var26 & 65536);
                                      var16++;
                                      var18[var16] = var25 - var24 | var24 - (var24 >>> 8);
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
                                  var25 = (var10 >> 16) * ((wfa) this).field_e;
                                  var26 = -param2;
                                  L22: while (true) {
                                    if (var26 >= 0) {
                                      var10 = var10 + var15;
                                      var9 = var23;
                                      var16 = var16 + var17;
                                      var24++;
                                      continue L21;
                                    } else {
                                      var27 = ((wfa) this).field_F[(var9 >> 16) + var25];
                                      var28 = var27 >>> 24;
                                      var29 = 256 - var28;
                                      var21 = (var27 & 16711935) * var19 & -16711936;
                                      var22 = (var27 & 65280) * var19 & 16711680;
                                      var27 = ((var21 | var22) >>> 8) + param5;
                                      var30 = var36[var16];
                                      var16++;
                                      var18[var16] = ((var27 & 16711935) * var28 + (var30 & 16711935) * var29 & -16711936) + ((var27 & 65280) * var28 + (var30 & 65280) * var29 & 16711680) >> 8;
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
                            var20 = -param3;
                            L23: while (true) {
                              if (var20 >= 0) {
                                break L9;
                              } else {
                                var21 = (var10 >> 16) * ((wfa) this).field_e;
                                var22 = -param2;
                                L24: while (true) {
                                  if (var22 >= 0) {
                                    var10 = var10 + var15;
                                    var9 = var19;
                                    var16 = var16 + var17;
                                    var20++;
                                    continue L23;
                                  } else {
                                    L25: {
                                      var23 = ((wfa) this).field_F[(var9 >> 16) + var21];
                                      var24 = var23 + param5;
                                      var25 = (var23 & 16711935) + (param5 & 16711935);
                                      var26 = (var25 & 16777472) + (var24 - var25 & 65536);
                                      var26 = var24 - var26 | var26 - (var26 >>> 8);
                                      var27 = (var26 >>> 24) * (param5 >>> 24) >> 8;
                                      var28 = 256 - var27;
                                      if (var27 == 255) {
                                        break L25;
                                      } else {
                                        var23 = var26;
                                        var26 = var36[var16];
                                        var26 = ((var23 & 16711935) * var27 + (var26 & 16711935) * var28 & -16711936) + ((var23 & 65280) * var27 + (var26 & 65280) * var28 & 16711680) >> 8;
                                        break L25;
                                      }
                                    }
                                    var16++;
                                    var18[var16] = var26;
                                    var9 = var9 + var14;
                                    var22++;
                                    continue L24;
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
                            var23 = -param3;
                            L26: while (true) {
                              if (var23 >= 0) {
                                break L9;
                              } else {
                                var24 = (var10 >> 16) * ((wfa) this).field_e;
                                var25 = -param2;
                                L27: while (true) {
                                  if (var25 >= 0) {
                                    var10 = var10 + var15;
                                    var9 = var19;
                                    var16 = var16 + var17;
                                    var23++;
                                    continue L26;
                                  } else {
                                    L28: {
                                      var26 = ((wfa) this).field_F[(var9 >> 16) + var24];
                                      var27 = (var26 >>> 24) * (param5 >>> 24) >> 8;
                                      var28 = 256 - var27;
                                      if (var27 == 255) {
                                        var29 = (var26 & 16711680) * var20 & -16777216;
                                        var30 = (var26 & 65280) * var21 & 16711680;
                                        var31 = (var26 & 255) * var22 & 65280;
                                        var16++;
                                        var18[var16] = (var29 | var30 | var31) >>> 8;
                                        break L28;
                                      } else {
                                        var29 = (var26 & 16711680) * var20 & -16777216;
                                        var30 = (var26 & 65280) * var21 & 16711680;
                                        var31 = (var26 & 255) * var22 & 65280;
                                        var26 = (var29 | var30 | var31) >>> 8;
                                        var32 = var36[var16];
                                        var16++;
                                        var18[var16] = ((var26 & 16711935) * var27 + (var32 & 16711935) * var28 & -16711936) + ((var26 & 65280) * var27 + (var32 & 65280) * var28 & 16711680) >> 8;
                                        break L28;
                                      }
                                    }
                                    var9 = var9 + var14;
                                    var25++;
                                    continue L27;
                                  }
                                }
                              }
                            }
                          } else {
                            var20 = -param3;
                            L29: while (true) {
                              if (var20 >= 0) {
                                break L9;
                              } else {
                                var21 = (var10 >> 16) * ((wfa) this).field_e;
                                var22 = -param2;
                                L30: while (true) {
                                  if (var22 >= 0) {
                                    var10 = var10 + var15;
                                    var9 = var19;
                                    var16 = var16 + var17;
                                    var20++;
                                    continue L29;
                                  } else {
                                    var23 = ((wfa) this).field_F[(var9 >> 16) + var21];
                                    var24 = (var23 >>> 24) * (param5 >>> 24) >> 8;
                                    var25 = 256 - var24;
                                    var26 = var36[var16];
                                    var16++;
                                    var18[var16] = ((var23 & 16711935) * var24 + (var26 & 16711935) * var25 & -16711936) + ((var23 & 65280) * var24 + (var26 & 65280) * var25 & 16711680) >> 8;
                                    var9 = var9 + var14;
                                    var22++;
                                    continue L30;
                                  }
                                }
                              }
                            }
                          }
                        }
                      } else {
                        var19 = var9;
                        var20 = -param3;
                        L31: while (true) {
                          if (var20 >= 0) {
                            break L9;
                          } else {
                            var21 = (var10 >> 16) * ((wfa) this).field_e;
                            var22 = -param2;
                            L32: while (true) {
                              if (var22 >= 0) {
                                var10 = var10 + var15;
                                var9 = var19;
                                var16 = var16 + var17;
                                var20++;
                                continue L31;
                              } else {
                                var23 = ((wfa) this).field_F[(var9 >> 16) + var21];
                                var24 = var23 >>> 24;
                                var25 = 256 - var24;
                                var26 = var36[var16];
                                var16++;
                                var18[var16] = (((var23 & 16711935) * var24 + (var26 & 16711935) * var25 & -16711936) >> 8) + (((var23 & -16711936) >>> 8) * var24 + ((var26 & -16711936) >>> 8) * var25 & -16711936);
                                var9 = var9 + var14;
                                var22++;
                                continue L32;
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
                            L33: while (true) {
                              if (var24 >= 0) {
                                break L9;
                              } else {
                                var25 = (var10 >> 16) * ((wfa) this).field_e;
                                var26 = -param2;
                                L34: while (true) {
                                  if (var26 >= 0) {
                                    var10 = var10 + var15;
                                    var9 = var23;
                                    var16 = var16 + var17;
                                    var24++;
                                    continue L33;
                                  } else {
                                    var27 = ((wfa) this).field_F[(var9 >> 16) + var25];
                                    var21 = (var27 & 16711935) * var19 & -16711936;
                                    var22 = (var27 & 65280) * var19 & 16711680;
                                    var16++;
                                    var18[var16] = ((var21 | var22) >>> 8) + param5;
                                    var9 = var9 + var14;
                                    var26++;
                                    continue L34;
                                  }
                                }
                              }
                            }
                          }
                        } else {
                          var19 = var9;
                          var20 = -param3;
                          L35: while (true) {
                            if (var20 >= 0) {
                              break L9;
                            } else {
                              var21 = (var10 >> 16) * ((wfa) this).field_e;
                              var22 = -param2;
                              L36: while (true) {
                                if (var22 >= 0) {
                                  var10 = var10 + var15;
                                  var9 = var19;
                                  var16 = var16 + var17;
                                  var20++;
                                  continue L35;
                                } else {
                                  var23 = ((wfa) this).field_F[(var9 >> 16) + var21];
                                  var24 = var23 + param5;
                                  var25 = (var23 & 16711935) + (param5 & 16711935);
                                  var26 = (var25 & 16777472) + (var24 - var25 & 65536);
                                  var16++;
                                  var18[var16] = var24 - var26 | var26 - (var26 >>> 8);
                                  var9 = var9 + var14;
                                  var22++;
                                  continue L36;
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
                        L37: while (true) {
                          if (var23 >= 0) {
                            break L9;
                          } else {
                            var24 = (var10 >> 16) * ((wfa) this).field_e;
                            var25 = -param2;
                            L38: while (true) {
                              if (var25 >= 0) {
                                var10 = var10 + var15;
                                var9 = var22;
                                var16 = var16 + var17;
                                var23++;
                                continue L37;
                              } else {
                                var26 = ((wfa) this).field_F[(var9 >> 16) + var24];
                                var27 = (var26 & 16711680) * var19 & -16777216;
                                var28 = (var26 & 65280) * var20 & 16711680;
                                var29 = (var26 & 255) * var21 & 65280;
                                var16++;
                                var18[var16] = (var27 | var28 | var29) >>> 8;
                                var9 = var9 + var14;
                                var25++;
                                continue L38;
                              }
                            }
                          }
                        }
                      }
                    } else {
                      var19 = var9;
                      var20 = -param3;
                      L39: while (true) {
                        if (var20 >= 0) {
                          break L0;
                        } else {
                          var21 = (var10 >> 16) * ((wfa) this).field_e;
                          var22 = -param2;
                          L40: while (true) {
                            if (var22 >= 0) {
                              var10 = var10 + var15;
                              var9 = var19;
                              var16 = var16 + var17;
                              var20++;
                              continue L39;
                            } else {
                              var16++;
                              var18[var16] = ((wfa) this).field_F[(var9 >> 16) + var21];
                              var9 = var9 + var14;
                              var22++;
                              continue L40;
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
}
