/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hfa extends oi {
    private byte[] field_F;
    private int[] field_G;

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
        int var22 = 0;
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
        int[] var58 = null;
        int stackIn_38_0 = 0;
        int stackIn_57_0 = 0;
        int stackIn_104_0 = 0;
        int stackIn_123_0 = 0;
        int stackIn_169_0 = 0;
        int stackIn_188_0 = 0;
        int stackIn_236_0 = 0;
        int stackIn_255_0 = 0;
        int stackIn_302_0 = 0;
        int stackIn_321_0 = 0;
        int stackIn_367_0 = 0;
        int stackIn_386_0 = 0;
        int stackIn_433_0 = 0;
        int stackIn_452_0 = 0;
        int stackIn_499_0 = 0;
        int stackIn_518_0 = 0;
        int stackIn_564_0 = 0;
        int stackIn_583_0 = 0;
        int stackOut_582_0 = 0;
        int stackOut_581_0 = 0;
        int stackOut_563_0 = 0;
        int stackOut_562_0 = 0;
        int stackOut_517_0 = 0;
        int stackOut_516_0 = 0;
        int stackOut_498_0 = 0;
        int stackOut_497_0 = 0;
        int stackOut_451_0 = 0;
        int stackOut_450_0 = 0;
        int stackOut_432_0 = 0;
        int stackOut_431_0 = 0;
        int stackOut_385_0 = 0;
        int stackOut_384_0 = 0;
        int stackOut_366_0 = 0;
        int stackOut_365_0 = 0;
        int stackOut_320_0 = 0;
        int stackOut_319_0 = 0;
        int stackOut_301_0 = 0;
        int stackOut_300_0 = 0;
        int stackOut_254_0 = 0;
        int stackOut_253_0 = 0;
        int stackOut_235_0 = 0;
        int stackOut_234_0 = 0;
        int stackOut_187_0 = 0;
        int stackOut_186_0 = 0;
        int stackOut_168_0 = 0;
        int stackOut_167_0 = 0;
        int stackOut_122_0 = 0;
        int stackOut_121_0 = 0;
        int stackOut_103_0 = 0;
        int stackOut_102_0 = 0;
        int stackOut_56_0 = 0;
        int stackOut_55_0 = 0;
        int stackOut_37_0 = 0;
        int stackOut_36_0 = 0;
        L0: {
          var3 = ((hfa) this).field_w.field_k;
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
                        var4 = (1 + var7 - (((hfa) this).field_e << 12) - field_C) / field_C;
                        if ((1 + var7 - (((hfa) this).field_e << 12) - field_C) / field_C <= var9) {
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
                        var4 = (1 + var8 - (((hfa) this).field_q << 12) - field_v) / field_v;
                        if ((1 + var8 - (((hfa) this).field_q << 12) - field_v) / field_v <= var9) {
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
                            var10 = (var8 >> 12) * ((hfa) this).field_e + (var7 >> 12);
                            int incrementValue$18 = var6;
                            var6++;
                            var11 = incrementValue$18;
                            var58 = var3;
                            var49 = var58;
                            var40 = var49;
                            var31 = var40;
                            var12 = var31;
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
                                          var15 = ((hfa) this).field_F[var10];
                                          if (var15 == 0) {
                                            break L7;
                                          } else {
                                            var16 = ((hfa) this).field_G[var15 & 255];
                                            var17 = (var16 & 16711935) * field_i & -16711936;
                                            var18 = (var16 & 65280) * field_i & 16711680;
                                            var16 = ((var17 | var18) >>> 8) + field_g;
                                            var19 = var58[var11];
                                            var20 = var16 + var19;
                                            var21 = (var16 & 16711935) + (var19 & 16711935);
                                            var19 = (var21 & 16777472) + (var20 - var21 & 65536);
                                            var12[var11] = var20 - var19 | var19 - (var19 >>> 8);
                                            break L7;
                                          }
                                        }
                                      } else {
                                        L8: {
                                          var15 = ((hfa) this).field_F[var10];
                                          if (var15 <= 0) {
                                            stackOut_582_0 = 0;
                                            stackIn_583_0 = stackOut_582_0;
                                            break L8;
                                          } else {
                                            stackOut_581_0 = ((hfa) this).field_G[var15];
                                            stackIn_583_0 = stackOut_581_0;
                                            break L8;
                                          }
                                        }
                                        L9: {
                                          var16 = stackIn_583_0;
                                          var17 = field_y;
                                          var18 = var16 + var17;
                                          var19 = (var16 & 16711935) + (var17 & 16711935);
                                          var20 = (var19 & 16777472) + (var18 - var19 & 65536);
                                          var20 = var18 - var20 | var20 - (var20 >>> 8);
                                          if (var16 != 0) {
                                            break L9;
                                          } else {
                                            if (field_i == 255) {
                                              break L9;
                                            } else {
                                              var16 = var20;
                                              var20 = var58[var11];
                                              var20 = ((var16 & 16711935) * field_i + (var20 & 16711935) * field_b & -16711936) + ((var16 & 65280) * field_i + (var20 & 65280) * field_b & 16711680) >> 8;
                                              break L9;
                                            }
                                          }
                                        }
                                        var58[var11] = var20;
                                        break L7;
                                      }
                                    } else {
                                      var15 = ((hfa) this).field_F[var10];
                                      if (var15 == 0) {
                                        break L7;
                                      } else {
                                        var16 = ((hfa) this).field_G[var15 & 255];
                                        var17 = (var16 & 16711680) * field_x & -16777216;
                                        var18 = (var16 & 65280) * field_s & 16711680;
                                        var19 = (var16 & 255) * field_E & 65280;
                                        var16 = (var17 | var18 | var19) >>> 8;
                                        var20 = var58[var11];
                                        var21 = var16 + var20;
                                        var22 = (var16 & 16711935) + (var20 & 16711935);
                                        var20 = (var22 & 16777472) + (var21 - var22 & 65536);
                                        var12[var11] = var21 - var20 | var20 - (var20 >>> 8);
                                        break L7;
                                      }
                                    }
                                  } else {
                                    var15 = ((hfa) this).field_F[var10];
                                    if (var15 == 0) {
                                      break L7;
                                    } else {
                                      var16 = ((hfa) this).field_G[var15 & 255];
                                      var17 = var58[var11];
                                      var18 = var16 + var17;
                                      var19 = (var16 & 16711935) + (var17 & 16711935);
                                      var17 = (var19 & 16777472) + (var18 - var19 & 65536);
                                      var12[var11] = var18 - var17 | var17 - (var17 >>> 8);
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
                                        var15 = ((hfa) this).field_F[var10];
                                        if (var15 == 0) {
                                          break L7;
                                        } else {
                                          var16 = ((hfa) this).field_G[var15 & 255];
                                          var17 = (var16 & 16711935) * field_i & -16711936;
                                          var18 = (var16 & 65280) * field_i & 16711680;
                                          int incrementValue$19 = var11;
                                          var11++;
                                          var12[incrementValue$19] = ((var17 | var18) >>> 8) + field_g;
                                          break L7;
                                        }
                                      }
                                    } else {
                                      L10: {
                                        var15 = ((hfa) this).field_F[var10];
                                        if (var15 <= 0) {
                                          stackOut_563_0 = 0;
                                          stackIn_564_0 = stackOut_563_0;
                                          break L10;
                                        } else {
                                          stackOut_562_0 = ((hfa) this).field_G[var15];
                                          stackIn_564_0 = stackOut_562_0;
                                          break L10;
                                        }
                                      }
                                      L11: {
                                        var16 = stackIn_564_0;
                                        var17 = field_y;
                                        var18 = var16 + var17;
                                        var19 = (var16 & 16711935) + (var17 & 16711935);
                                        var20 = (var19 & 16777472) + (var18 - var19 & 65536);
                                        var20 = var18 - var20 | var20 - (var20 >>> 8);
                                        if (var16 != 0) {
                                          break L11;
                                        } else {
                                          if (field_i == 255) {
                                            break L11;
                                          } else {
                                            var16 = var20;
                                            var20 = var58[var11];
                                            var20 = ((var16 & 16711935) * field_i + (var20 & 16711935) * field_b & -16711936) + ((var16 & 65280) * field_i + (var20 & 65280) * field_b & 16711680) >> 8;
                                            break L11;
                                          }
                                        }
                                      }
                                      var58[var11] = var20;
                                      break L7;
                                    }
                                  } else {
                                    var15 = ((hfa) this).field_F[var10];
                                    if (var15 == 0) {
                                      break L7;
                                    } else {
                                      var16 = ((hfa) this).field_G[var15 & 255];
                                      if ((field_y & 16777215) != 16777215) {
                                        if (field_i == 255) {
                                          var17 = (var16 & 16711680) * field_x & -16777216;
                                          var18 = (var16 & 65280) * field_s & 16711680;
                                          var19 = (var16 & 255) * field_E & 65280;
                                          var12[var11] = (var17 | var18 | var19) >>> 8;
                                          break L7;
                                        } else {
                                          var17 = (var16 & 16711680) * field_x & -16777216;
                                          var18 = (var16 & 65280) * field_s & 16711680;
                                          var19 = (var16 & 255) * field_E & 65280;
                                          var16 = (var17 | var18 | var19) >>> 8;
                                          var20 = var58[var11];
                                          var12[var11] = ((var16 & 16711935) * field_i + (var20 & 16711935) * field_b & -16711936) + ((var16 & 65280) * field_i + (var20 & 65280) * field_b & 16711680) >> 8;
                                          break L7;
                                        }
                                      } else {
                                        var17 = field_y >>> 24;
                                        var18 = 256 - var17;
                                        var19 = var58[var11];
                                        var12[var11] = ((var16 & 16711935) * var17 + (var19 & 16711935) * var18 & -16711936) + ((var16 & 65280) * var17 + (var19 & 65280) * var18 & 16711680) >> 8;
                                        break L7;
                                      }
                                    }
                                  }
                                } else {
                                  var15 = ((hfa) this).field_F[var10];
                                  if (var15 == 0) {
                                    break L7;
                                  } else {
                                    var12[var11] = ((hfa) this).field_G[var15 & 255];
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
                                      var15 = ((hfa) this).field_G[((hfa) this).field_F[var10] & 255];
                                      var16 = (var15 & 16711935) * field_i & -16711936;
                                      var17 = (var15 & 65280) * field_i & 16711680;
                                      var12[var11] = ((var16 | var17) >>> 8) + field_g;
                                      break L7;
                                    }
                                  } else {
                                    var15 = ((hfa) this).field_G[((hfa) this).field_F[var10] & 255];
                                    var16 = field_y;
                                    var17 = var15 + var16;
                                    var18 = (var15 & 16711935) + (var16 & 16711935);
                                    var19 = (var18 & 16777472) + (var17 - var18 & 65536);
                                    var12[var11] = var17 - var19 | var19 - (var19 >>> 8);
                                    break L7;
                                  }
                                } else {
                                  var15 = ((hfa) this).field_G[((hfa) this).field_F[var10] & 255];
                                  var16 = (var15 & 16711680) * field_x & -16777216;
                                  var17 = (var15 & 65280) * field_s & 16711680;
                                  var18 = (var15 & 255) * field_E & 65280;
                                  var12[var11] = (var16 | var17 | var18) >>> 8;
                                  break L7;
                                }
                              } else {
                                var12[var11] = ((hfa) this).field_G[((hfa) this).field_F[var10] & 255];
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
                  L12: while (true) {
                    if (var5 >= 0) {
                      break L0;
                    } else {
                      L13: {
                        var6 = field_f;
                        var7 = field_m + field_a;
                        var8 = field_p + field_l;
                        var9 = field_B;
                        if (var7 >= 0) {
                          break L13;
                        } else {
                          var4 = (field_C - 1 - var7) / field_C;
                          var9 = var9 + var4;
                          var7 = var7 + field_C * var4;
                          var8 = var8 + field_v * var4;
                          var6 = var6 + var4;
                          break L13;
                        }
                      }
                      L14: {
                        var4 = (1 + var7 - (((hfa) this).field_e << 12) - field_C) / field_C;
                        if ((1 + var7 - (((hfa) this).field_e << 12) - field_C) / field_C <= var9) {
                          break L14;
                        } else {
                          var9 = var4;
                          break L14;
                        }
                      }
                      L15: {
                        var4 = var8 - (((hfa) this).field_q << 12);
                        if (var8 - (((hfa) this).field_q << 12) < 0) {
                          break L15;
                        } else {
                          var4 = (field_v - var4) / field_v;
                          var9 = var9 + var4;
                          var7 = var7 + field_C * var4;
                          var8 = var8 + field_v * var4;
                          var6 = var6 + var4;
                          break L15;
                        }
                      }
                      L16: {
                        var4 = (var8 - field_v) / field_v;
                        if ((var8 - field_v) / field_v <= var9) {
                          break L16;
                        } else {
                          var9 = var4;
                          break L16;
                        }
                      }
                      L17: while (true) {
                        if (var9 >= 0) {
                          field_m = field_m + field_z;
                          field_p = field_p + field_u;
                          field_f = field_f + field_o;
                          var5++;
                          continue L12;
                        } else {
                          L18: {
                            var10 = (var8 >> 12) * ((hfa) this).field_e + (var7 >> 12);
                            int incrementValue$20 = var6;
                            var6++;
                            var11 = incrementValue$20;
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
                                          break L18;
                                        } else {
                                          var15 = ((hfa) this).field_F[var10];
                                          if (var15 == 0) {
                                            break L18;
                                          } else {
                                            var16 = ((hfa) this).field_G[var15 & 255];
                                            var17 = (var16 & 16711935) * field_i & -16711936;
                                            var18 = (var16 & 65280) * field_i & 16711680;
                                            var16 = ((var17 | var18) >>> 8) + field_g;
                                            var19 = var57[var11];
                                            var20 = var16 + var19;
                                            var21 = (var16 & 16711935) + (var19 & 16711935);
                                            var19 = (var21 & 16777472) + (var20 - var21 & 65536);
                                            var12[var11] = var20 - var19 | var19 - (var19 >>> 8);
                                            break L18;
                                          }
                                        }
                                      } else {
                                        L19: {
                                          var15 = ((hfa) this).field_F[var10];
                                          if (var15 <= 0) {
                                            stackOut_517_0 = 0;
                                            stackIn_518_0 = stackOut_517_0;
                                            break L19;
                                          } else {
                                            stackOut_516_0 = ((hfa) this).field_G[var15];
                                            stackIn_518_0 = stackOut_516_0;
                                            break L19;
                                          }
                                        }
                                        L20: {
                                          var16 = stackIn_518_0;
                                          var17 = field_y;
                                          var18 = var16 + var17;
                                          var19 = (var16 & 16711935) + (var17 & 16711935);
                                          var20 = (var19 & 16777472) + (var18 - var19 & 65536);
                                          var20 = var18 - var20 | var20 - (var20 >>> 8);
                                          if (var16 != 0) {
                                            break L20;
                                          } else {
                                            if (field_i == 255) {
                                              break L20;
                                            } else {
                                              var16 = var20;
                                              var20 = var57[var11];
                                              var20 = ((var16 & 16711935) * field_i + (var20 & 16711935) * field_b & -16711936) + ((var16 & 65280) * field_i + (var20 & 65280) * field_b & 16711680) >> 8;
                                              break L20;
                                            }
                                          }
                                        }
                                        var57[var11] = var20;
                                        break L18;
                                      }
                                    } else {
                                      var15 = ((hfa) this).field_F[var10];
                                      if (var15 == 0) {
                                        break L18;
                                      } else {
                                        var16 = ((hfa) this).field_G[var15 & 255];
                                        var17 = (var16 & 16711680) * field_x & -16777216;
                                        var18 = (var16 & 65280) * field_s & 16711680;
                                        var19 = (var16 & 255) * field_E & 65280;
                                        var16 = (var17 | var18 | var19) >>> 8;
                                        var20 = var57[var11];
                                        var21 = var16 + var20;
                                        var22 = (var16 & 16711935) + (var20 & 16711935);
                                        var20 = (var22 & 16777472) + (var21 - var22 & 65536);
                                        var12[var11] = var21 - var20 | var20 - (var20 >>> 8);
                                        break L18;
                                      }
                                    }
                                  } else {
                                    var15 = ((hfa) this).field_F[var10];
                                    if (var15 == 0) {
                                      break L18;
                                    } else {
                                      var16 = ((hfa) this).field_G[var15 & 255];
                                      var17 = var57[var11];
                                      var18 = var16 + var17;
                                      var19 = (var16 & 16711935) + (var17 & 16711935);
                                      var17 = (var19 & 16777472) + (var18 - var19 & 65536);
                                      var12[var11] = var18 - var17 | var17 - (var17 >>> 8);
                                      break L18;
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
                                        var15 = ((hfa) this).field_F[var10];
                                        if (var15 == 0) {
                                          break L18;
                                        } else {
                                          var16 = ((hfa) this).field_G[var15 & 255];
                                          var17 = (var16 & 16711935) * field_i & -16711936;
                                          var18 = (var16 & 65280) * field_i & 16711680;
                                          int incrementValue$21 = var11;
                                          var11++;
                                          var12[incrementValue$21] = ((var17 | var18) >>> 8) + field_g;
                                          break L18;
                                        }
                                      }
                                    } else {
                                      L21: {
                                        var15 = ((hfa) this).field_F[var10];
                                        if (var15 <= 0) {
                                          stackOut_498_0 = 0;
                                          stackIn_499_0 = stackOut_498_0;
                                          break L21;
                                        } else {
                                          stackOut_497_0 = ((hfa) this).field_G[var15];
                                          stackIn_499_0 = stackOut_497_0;
                                          break L21;
                                        }
                                      }
                                      L22: {
                                        var16 = stackIn_499_0;
                                        var17 = field_y;
                                        var18 = var16 + var17;
                                        var19 = (var16 & 16711935) + (var17 & 16711935);
                                        var20 = (var19 & 16777472) + (var18 - var19 & 65536);
                                        var20 = var18 - var20 | var20 - (var20 >>> 8);
                                        if (var16 != 0) {
                                          break L22;
                                        } else {
                                          if (field_i == 255) {
                                            break L22;
                                          } else {
                                            var16 = var20;
                                            var20 = var57[var11];
                                            var20 = ((var16 & 16711935) * field_i + (var20 & 16711935) * field_b & -16711936) + ((var16 & 65280) * field_i + (var20 & 65280) * field_b & 16711680) >> 8;
                                            break L22;
                                          }
                                        }
                                      }
                                      var57[var11] = var20;
                                      break L18;
                                    }
                                  } else {
                                    var15 = ((hfa) this).field_F[var10];
                                    if (var15 == 0) {
                                      break L18;
                                    } else {
                                      var16 = ((hfa) this).field_G[var15 & 255];
                                      if ((field_y & 16777215) != 16777215) {
                                        if (field_i == 255) {
                                          var17 = (var16 & 16711680) * field_x & -16777216;
                                          var18 = (var16 & 65280) * field_s & 16711680;
                                          var19 = (var16 & 255) * field_E & 65280;
                                          var12[var11] = (var17 | var18 | var19) >>> 8;
                                          break L18;
                                        } else {
                                          var17 = (var16 & 16711680) * field_x & -16777216;
                                          var18 = (var16 & 65280) * field_s & 16711680;
                                          var19 = (var16 & 255) * field_E & 65280;
                                          var16 = (var17 | var18 | var19) >>> 8;
                                          var20 = var57[var11];
                                          var12[var11] = ((var16 & 16711935) * field_i + (var20 & 16711935) * field_b & -16711936) + ((var16 & 65280) * field_i + (var20 & 65280) * field_b & 16711680) >> 8;
                                          break L18;
                                        }
                                      } else {
                                        var17 = field_y >>> 24;
                                        var18 = 256 - var17;
                                        var19 = var57[var11];
                                        var12[var11] = ((var16 & 16711935) * var17 + (var19 & 16711935) * var18 & -16711936) + ((var16 & 65280) * var17 + (var19 & 65280) * var18 & 16711680) >> 8;
                                        break L18;
                                      }
                                    }
                                  }
                                } else {
                                  var15 = ((hfa) this).field_F[var10];
                                  if (var15 == 0) {
                                    break L18;
                                  } else {
                                    var12[var11] = ((hfa) this).field_G[var15 & 255];
                                    break L18;
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
                                      var15 = ((hfa) this).field_G[((hfa) this).field_F[var10] & 255];
                                      var16 = (var15 & 16711935) * field_i & -16711936;
                                      var17 = (var15 & 65280) * field_i & 16711680;
                                      var12[var11] = ((var16 | var17) >>> 8) + field_g;
                                      break L18;
                                    }
                                  } else {
                                    var15 = ((hfa) this).field_G[((hfa) this).field_F[var10] & 255];
                                    var16 = field_y;
                                    var17 = var15 + var16;
                                    var18 = (var15 & 16711935) + (var16 & 16711935);
                                    var19 = (var18 & 16777472) + (var17 - var18 & 65536);
                                    var12[var11] = var17 - var19 | var19 - (var19 >>> 8);
                                    break L18;
                                  }
                                } else {
                                  var15 = ((hfa) this).field_G[((hfa) this).field_F[var10] & 255];
                                  var16 = (var15 & 16711680) * field_x & -16777216;
                                  var17 = (var15 & 65280) * field_s & 16711680;
                                  var18 = (var15 & 255) * field_E & 65280;
                                  var12[var11] = (var16 | var17 | var18) >>> 8;
                                  break L18;
                                }
                              } else {
                                var12[var11] = ((hfa) this).field_G[((hfa) this).field_F[var10] & 255];
                                break L18;
                              }
                            }
                          }
                          var7 = var7 + field_C;
                          var8 = var8 + field_v;
                          var9++;
                          continue L17;
                        }
                      }
                    }
                  }
                }
              } else {
                var5 = field_h;
                L23: while (true) {
                  if (var5 >= 0) {
                    break L0;
                  } else {
                    L24: {
                      var6 = field_f;
                      var7 = field_m + field_a;
                      var8 = field_p;
                      var9 = field_B;
                      if (var8 >= 0) {
                        if (var8 - (((hfa) this).field_q << 12) < 0) {
                          L25: {
                            if (var7 >= 0) {
                              break L25;
                            } else {
                              var4 = (field_C - 1 - var7) / field_C;
                              var9 = var9 + var4;
                              var7 = var7 + field_C * var4;
                              var6 = var6 + var4;
                              break L25;
                            }
                          }
                          L26: {
                            var4 = (1 + var7 - (((hfa) this).field_e << 12) - field_C) / field_C;
                            if ((1 + var7 - (((hfa) this).field_e << 12) - field_C) / field_C <= var9) {
                              break L26;
                            } else {
                              var9 = var4;
                              break L26;
                            }
                          }
                          L27: while (true) {
                            if (var9 >= 0) {
                              break L24;
                            } else {
                              L28: {
                                var10 = (var8 >> 12) * ((hfa) this).field_e + (var7 >> 12);
                                int incrementValue$22 = var6;
                                var6++;
                                var11 = incrementValue$22;
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
                                              break L28;
                                            } else {
                                              var15 = ((hfa) this).field_F[var10];
                                              if (var15 == 0) {
                                                break L28;
                                              } else {
                                                var16 = ((hfa) this).field_G[var15 & 255];
                                                var17 = (var16 & 16711935) * field_i & -16711936;
                                                var18 = (var16 & 65280) * field_i & 16711680;
                                                var16 = ((var17 | var18) >>> 8) + field_g;
                                                var19 = var56[var11];
                                                var20 = var16 + var19;
                                                var21 = (var16 & 16711935) + (var19 & 16711935);
                                                var19 = (var21 & 16777472) + (var20 - var21 & 65536);
                                                var12[var11] = var20 - var19 | var19 - (var19 >>> 8);
                                                break L28;
                                              }
                                            }
                                          } else {
                                            L29: {
                                              var15 = ((hfa) this).field_F[var10];
                                              if (var15 <= 0) {
                                                stackOut_451_0 = 0;
                                                stackIn_452_0 = stackOut_451_0;
                                                break L29;
                                              } else {
                                                stackOut_450_0 = ((hfa) this).field_G[var15];
                                                stackIn_452_0 = stackOut_450_0;
                                                break L29;
                                              }
                                            }
                                            L30: {
                                              var16 = stackIn_452_0;
                                              var17 = field_y;
                                              var18 = var16 + var17;
                                              var19 = (var16 & 16711935) + (var17 & 16711935);
                                              var20 = (var19 & 16777472) + (var18 - var19 & 65536);
                                              var20 = var18 - var20 | var20 - (var20 >>> 8);
                                              if (var16 != 0) {
                                                break L30;
                                              } else {
                                                if (field_i == 255) {
                                                  break L30;
                                                } else {
                                                  var16 = var20;
                                                  var20 = var56[var11];
                                                  var20 = ((var16 & 16711935) * field_i + (var20 & 16711935) * field_b & -16711936) + ((var16 & 65280) * field_i + (var20 & 65280) * field_b & 16711680) >> 8;
                                                  break L30;
                                                }
                                              }
                                            }
                                            var56[var11] = var20;
                                            break L28;
                                          }
                                        } else {
                                          var15 = ((hfa) this).field_F[var10];
                                          if (var15 == 0) {
                                            break L28;
                                          } else {
                                            var16 = ((hfa) this).field_G[var15 & 255];
                                            var17 = (var16 & 16711680) * field_x & -16777216;
                                            var18 = (var16 & 65280) * field_s & 16711680;
                                            var19 = (var16 & 255) * field_E & 65280;
                                            var16 = (var17 | var18 | var19) >>> 8;
                                            var20 = var56[var11];
                                            var21 = var16 + var20;
                                            var22 = (var16 & 16711935) + (var20 & 16711935);
                                            var20 = (var22 & 16777472) + (var21 - var22 & 65536);
                                            var12[var11] = var21 - var20 | var20 - (var20 >>> 8);
                                            break L28;
                                          }
                                        }
                                      } else {
                                        var15 = ((hfa) this).field_F[var10];
                                        if (var15 == 0) {
                                          break L28;
                                        } else {
                                          var16 = ((hfa) this).field_G[var15 & 255];
                                          var17 = var56[var11];
                                          var18 = var16 + var17;
                                          var19 = (var16 & 16711935) + (var17 & 16711935);
                                          var17 = (var19 & 16777472) + (var18 - var19 & 65536);
                                          var12[var11] = var18 - var17 | var17 - (var17 >>> 8);
                                          break L28;
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
                                            var15 = ((hfa) this).field_F[var10];
                                            if (var15 == 0) {
                                              break L28;
                                            } else {
                                              var16 = ((hfa) this).field_G[var15 & 255];
                                              var17 = (var16 & 16711935) * field_i & -16711936;
                                              var18 = (var16 & 65280) * field_i & 16711680;
                                              int incrementValue$23 = var11;
                                              var11++;
                                              var12[incrementValue$23] = ((var17 | var18) >>> 8) + field_g;
                                              break L28;
                                            }
                                          }
                                        } else {
                                          L31: {
                                            var15 = ((hfa) this).field_F[var10];
                                            if (var15 <= 0) {
                                              stackOut_432_0 = 0;
                                              stackIn_433_0 = stackOut_432_0;
                                              break L31;
                                            } else {
                                              stackOut_431_0 = ((hfa) this).field_G[var15];
                                              stackIn_433_0 = stackOut_431_0;
                                              break L31;
                                            }
                                          }
                                          L32: {
                                            var16 = stackIn_433_0;
                                            var17 = field_y;
                                            var18 = var16 + var17;
                                            var19 = (var16 & 16711935) + (var17 & 16711935);
                                            var20 = (var19 & 16777472) + (var18 - var19 & 65536);
                                            var20 = var18 - var20 | var20 - (var20 >>> 8);
                                            if (var16 != 0) {
                                              break L32;
                                            } else {
                                              if (field_i == 255) {
                                                break L32;
                                              } else {
                                                var16 = var20;
                                                var20 = var56[var11];
                                                var20 = ((var16 & 16711935) * field_i + (var20 & 16711935) * field_b & -16711936) + ((var16 & 65280) * field_i + (var20 & 65280) * field_b & 16711680) >> 8;
                                                break L32;
                                              }
                                            }
                                          }
                                          var56[var11] = var20;
                                          break L28;
                                        }
                                      } else {
                                        var15 = ((hfa) this).field_F[var10];
                                        if (var15 == 0) {
                                          break L28;
                                        } else {
                                          var16 = ((hfa) this).field_G[var15 & 255];
                                          if ((field_y & 16777215) != 16777215) {
                                            if (field_i == 255) {
                                              var17 = (var16 & 16711680) * field_x & -16777216;
                                              var18 = (var16 & 65280) * field_s & 16711680;
                                              var19 = (var16 & 255) * field_E & 65280;
                                              var12[var11] = (var17 | var18 | var19) >>> 8;
                                              break L28;
                                            } else {
                                              var17 = (var16 & 16711680) * field_x & -16777216;
                                              var18 = (var16 & 65280) * field_s & 16711680;
                                              var19 = (var16 & 255) * field_E & 65280;
                                              var16 = (var17 | var18 | var19) >>> 8;
                                              var20 = var56[var11];
                                              var12[var11] = ((var16 & 16711935) * field_i + (var20 & 16711935) * field_b & -16711936) + ((var16 & 65280) * field_i + (var20 & 65280) * field_b & 16711680) >> 8;
                                              break L28;
                                            }
                                          } else {
                                            var17 = field_y >>> 24;
                                            var18 = 256 - var17;
                                            var19 = var56[var11];
                                            var12[var11] = ((var16 & 16711935) * var17 + (var19 & 16711935) * var18 & -16711936) + ((var16 & 65280) * var17 + (var19 & 65280) * var18 & 16711680) >> 8;
                                            break L28;
                                          }
                                        }
                                      }
                                    } else {
                                      var15 = ((hfa) this).field_F[var10];
                                      if (var15 == 0) {
                                        break L28;
                                      } else {
                                        var12[var11] = ((hfa) this).field_G[var15 & 255];
                                        break L28;
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
                                          var15 = ((hfa) this).field_G[((hfa) this).field_F[var10] & 255];
                                          var16 = (var15 & 16711935) * field_i & -16711936;
                                          var17 = (var15 & 65280) * field_i & 16711680;
                                          var12[var11] = ((var16 | var17) >>> 8) + field_g;
                                          break L28;
                                        }
                                      } else {
                                        var15 = ((hfa) this).field_G[((hfa) this).field_F[var10] & 255];
                                        var16 = field_y;
                                        var17 = var15 + var16;
                                        var18 = (var15 & 16711935) + (var16 & 16711935);
                                        var19 = (var18 & 16777472) + (var17 - var18 & 65536);
                                        var12[var11] = var17 - var19 | var19 - (var19 >>> 8);
                                        break L28;
                                      }
                                    } else {
                                      var15 = ((hfa) this).field_G[((hfa) this).field_F[var10] & 255];
                                      var16 = (var15 & 16711680) * field_x & -16777216;
                                      var17 = (var15 & 65280) * field_s & 16711680;
                                      var18 = (var15 & 255) * field_E & 65280;
                                      var12[var11] = (var16 | var17 | var18) >>> 8;
                                      break L28;
                                    }
                                  } else {
                                    var12[var11] = ((hfa) this).field_G[((hfa) this).field_F[var10] & 255];
                                    break L28;
                                  }
                                }
                              }
                              var7 = var7 + field_C;
                              var9++;
                              continue L27;
                            }
                          }
                        } else {
                          break L24;
                        }
                      } else {
                        break L24;
                      }
                    }
                    var5++;
                    field_m = field_m + field_z;
                    field_p = field_p + field_u;
                    field_f = field_f + field_o;
                    continue L23;
                  }
                }
              }
            } else {
              if (field_v != 0) {
                if (field_v >= 0) {
                  var5 = field_h;
                  L33: while (true) {
                    if (var5 >= 0) {
                      break L0;
                    } else {
                      L34: {
                        var6 = field_f;
                        var7 = field_m + field_a;
                        var8 = field_p + field_l;
                        var9 = field_B;
                        var4 = var7 - (((hfa) this).field_e << 12);
                        if (var7 - (((hfa) this).field_e << 12) < 0) {
                          break L34;
                        } else {
                          var4 = (field_C - var4) / field_C;
                          var9 = var9 + var4;
                          var7 = var7 + field_C * var4;
                          var8 = var8 + field_v * var4;
                          var6 = var6 + var4;
                          break L34;
                        }
                      }
                      L35: {
                        var4 = (var7 - field_C) / field_C;
                        if ((var7 - field_C) / field_C <= var9) {
                          break L35;
                        } else {
                          var9 = var4;
                          break L35;
                        }
                      }
                      L36: {
                        if (var8 >= 0) {
                          break L36;
                        } else {
                          var4 = (field_v - 1 - var8) / field_v;
                          var9 = var9 + var4;
                          var7 = var7 + field_C * var4;
                          var8 = var8 + field_v * var4;
                          var6 = var6 + var4;
                          break L36;
                        }
                      }
                      L37: {
                        var4 = (1 + var8 - (((hfa) this).field_q << 12) - field_v) / field_v;
                        if ((1 + var8 - (((hfa) this).field_q << 12) - field_v) / field_v <= var9) {
                          break L37;
                        } else {
                          var9 = var4;
                          break L37;
                        }
                      }
                      L38: while (true) {
                        if (var9 >= 0) {
                          var5++;
                          field_m = field_m + field_z;
                          field_p = field_p + field_u;
                          field_f = field_f + field_o;
                          continue L33;
                        } else {
                          L39: {
                            var10 = (var8 >> 12) * ((hfa) this).field_e + (var7 >> 12);
                            int incrementValue$24 = var6;
                            var6++;
                            var11 = incrementValue$24;
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
                                          break L39;
                                        } else {
                                          var15 = ((hfa) this).field_F[var10];
                                          if (var15 == 0) {
                                            break L39;
                                          } else {
                                            var16 = ((hfa) this).field_G[var15 & 255];
                                            var17 = (var16 & 16711935) * field_i & -16711936;
                                            var18 = (var16 & 65280) * field_i & 16711680;
                                            var16 = ((var17 | var18) >>> 8) + field_g;
                                            var19 = var55[var11];
                                            var20 = var16 + var19;
                                            var21 = (var16 & 16711935) + (var19 & 16711935);
                                            var19 = (var21 & 16777472) + (var20 - var21 & 65536);
                                            var12[var11] = var20 - var19 | var19 - (var19 >>> 8);
                                            break L39;
                                          }
                                        }
                                      } else {
                                        L40: {
                                          var15 = ((hfa) this).field_F[var10];
                                          if (var15 <= 0) {
                                            stackOut_385_0 = 0;
                                            stackIn_386_0 = stackOut_385_0;
                                            break L40;
                                          } else {
                                            stackOut_384_0 = ((hfa) this).field_G[var15];
                                            stackIn_386_0 = stackOut_384_0;
                                            break L40;
                                          }
                                        }
                                        L41: {
                                          var16 = stackIn_386_0;
                                          var17 = field_y;
                                          var18 = var16 + var17;
                                          var19 = (var16 & 16711935) + (var17 & 16711935);
                                          var20 = (var19 & 16777472) + (var18 - var19 & 65536);
                                          var20 = var18 - var20 | var20 - (var20 >>> 8);
                                          if (var16 != 0) {
                                            break L41;
                                          } else {
                                            if (field_i == 255) {
                                              break L41;
                                            } else {
                                              var16 = var20;
                                              var20 = var55[var11];
                                              var20 = ((var16 & 16711935) * field_i + (var20 & 16711935) * field_b & -16711936) + ((var16 & 65280) * field_i + (var20 & 65280) * field_b & 16711680) >> 8;
                                              break L41;
                                            }
                                          }
                                        }
                                        var55[var11] = var20;
                                        break L39;
                                      }
                                    } else {
                                      var15 = ((hfa) this).field_F[var10];
                                      if (var15 == 0) {
                                        break L39;
                                      } else {
                                        var16 = ((hfa) this).field_G[var15 & 255];
                                        var17 = (var16 & 16711680) * field_x & -16777216;
                                        var18 = (var16 & 65280) * field_s & 16711680;
                                        var19 = (var16 & 255) * field_E & 65280;
                                        var16 = (var17 | var18 | var19) >>> 8;
                                        var20 = var55[var11];
                                        var21 = var16 + var20;
                                        var22 = (var16 & 16711935) + (var20 & 16711935);
                                        var20 = (var22 & 16777472) + (var21 - var22 & 65536);
                                        var12[var11] = var21 - var20 | var20 - (var20 >>> 8);
                                        break L39;
                                      }
                                    }
                                  } else {
                                    var15 = ((hfa) this).field_F[var10];
                                    if (var15 == 0) {
                                      break L39;
                                    } else {
                                      var16 = ((hfa) this).field_G[var15 & 255];
                                      var17 = var55[var11];
                                      var18 = var16 + var17;
                                      var19 = (var16 & 16711935) + (var17 & 16711935);
                                      var17 = (var19 & 16777472) + (var18 - var19 & 65536);
                                      var12[var11] = var18 - var17 | var17 - (var17 >>> 8);
                                      break L39;
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
                                        var15 = ((hfa) this).field_F[var10];
                                        if (var15 == 0) {
                                          break L39;
                                        } else {
                                          var16 = ((hfa) this).field_G[var15 & 255];
                                          var17 = (var16 & 16711935) * field_i & -16711936;
                                          var18 = (var16 & 65280) * field_i & 16711680;
                                          int incrementValue$25 = var11;
                                          var11++;
                                          var12[incrementValue$25] = ((var17 | var18) >>> 8) + field_g;
                                          break L39;
                                        }
                                      }
                                    } else {
                                      L42: {
                                        var15 = ((hfa) this).field_F[var10];
                                        if (var15 <= 0) {
                                          stackOut_366_0 = 0;
                                          stackIn_367_0 = stackOut_366_0;
                                          break L42;
                                        } else {
                                          stackOut_365_0 = ((hfa) this).field_G[var15];
                                          stackIn_367_0 = stackOut_365_0;
                                          break L42;
                                        }
                                      }
                                      L43: {
                                        var16 = stackIn_367_0;
                                        var17 = field_y;
                                        var18 = var16 + var17;
                                        var19 = (var16 & 16711935) + (var17 & 16711935);
                                        var20 = (var19 & 16777472) + (var18 - var19 & 65536);
                                        var20 = var18 - var20 | var20 - (var20 >>> 8);
                                        if (var16 != 0) {
                                          break L43;
                                        } else {
                                          if (field_i == 255) {
                                            break L43;
                                          } else {
                                            var16 = var20;
                                            var20 = var55[var11];
                                            var20 = ((var16 & 16711935) * field_i + (var20 & 16711935) * field_b & -16711936) + ((var16 & 65280) * field_i + (var20 & 65280) * field_b & 16711680) >> 8;
                                            break L43;
                                          }
                                        }
                                      }
                                      var55[var11] = var20;
                                      break L39;
                                    }
                                  } else {
                                    var15 = ((hfa) this).field_F[var10];
                                    if (var15 == 0) {
                                      break L39;
                                    } else {
                                      var16 = ((hfa) this).field_G[var15 & 255];
                                      if ((field_y & 16777215) != 16777215) {
                                        if (field_i == 255) {
                                          var17 = (var16 & 16711680) * field_x & -16777216;
                                          var18 = (var16 & 65280) * field_s & 16711680;
                                          var19 = (var16 & 255) * field_E & 65280;
                                          var12[var11] = (var17 | var18 | var19) >>> 8;
                                          break L39;
                                        } else {
                                          var17 = (var16 & 16711680) * field_x & -16777216;
                                          var18 = (var16 & 65280) * field_s & 16711680;
                                          var19 = (var16 & 255) * field_E & 65280;
                                          var16 = (var17 | var18 | var19) >>> 8;
                                          var20 = var55[var11];
                                          var12[var11] = ((var16 & 16711935) * field_i + (var20 & 16711935) * field_b & -16711936) + ((var16 & 65280) * field_i + (var20 & 65280) * field_b & 16711680) >> 8;
                                          break L39;
                                        }
                                      } else {
                                        var17 = field_y >>> 24;
                                        var18 = 256 - var17;
                                        var19 = var55[var11];
                                        var12[var11] = ((var16 & 16711935) * var17 + (var19 & 16711935) * var18 & -16711936) + ((var16 & 65280) * var17 + (var19 & 65280) * var18 & 16711680) >> 8;
                                        break L39;
                                      }
                                    }
                                  }
                                } else {
                                  var15 = ((hfa) this).field_F[var10];
                                  if (var15 == 0) {
                                    break L39;
                                  } else {
                                    var12[var11] = ((hfa) this).field_G[var15 & 255];
                                    break L39;
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
                                      var15 = ((hfa) this).field_G[((hfa) this).field_F[var10] & 255];
                                      var16 = (var15 & 16711935) * field_i & -16711936;
                                      var17 = (var15 & 65280) * field_i & 16711680;
                                      var12[var11] = ((var16 | var17) >>> 8) + field_g;
                                      break L39;
                                    }
                                  } else {
                                    var15 = ((hfa) this).field_G[((hfa) this).field_F[var10] & 255];
                                    var16 = field_y;
                                    var17 = var15 + var16;
                                    var18 = (var15 & 16711935) + (var16 & 16711935);
                                    var19 = (var18 & 16777472) + (var17 - var18 & 65536);
                                    var12[var11] = var17 - var19 | var19 - (var19 >>> 8);
                                    break L39;
                                  }
                                } else {
                                  var15 = ((hfa) this).field_G[((hfa) this).field_F[var10] & 255];
                                  var16 = (var15 & 16711680) * field_x & -16777216;
                                  var17 = (var15 & 65280) * field_s & 16711680;
                                  var18 = (var15 & 255) * field_E & 65280;
                                  var12[var11] = (var16 | var17 | var18) >>> 8;
                                  break L39;
                                }
                              } else {
                                var12[var11] = ((hfa) this).field_G[((hfa) this).field_F[var10] & 255];
                                break L39;
                              }
                            }
                          }
                          var7 = var7 + field_C;
                          var8 = var8 + field_v;
                          var9++;
                          continue L38;
                        }
                      }
                    }
                  }
                } else {
                  var5 = field_h;
                  L44: while (true) {
                    if (var5 >= 0) {
                      break L0;
                    } else {
                      L45: {
                        var6 = field_f;
                        var7 = field_m + field_a;
                        var8 = field_p + field_l;
                        var9 = field_B;
                        var4 = var7 - (((hfa) this).field_e << 12);
                        if (var7 - (((hfa) this).field_e << 12) < 0) {
                          break L45;
                        } else {
                          var4 = (field_C - var4) / field_C;
                          var9 = var9 + var4;
                          var7 = var7 + field_C * var4;
                          var8 = var8 + field_v * var4;
                          var6 = var6 + var4;
                          break L45;
                        }
                      }
                      L46: {
                        var4 = (var7 - field_C) / field_C;
                        if ((var7 - field_C) / field_C <= var9) {
                          break L46;
                        } else {
                          var9 = var4;
                          break L46;
                        }
                      }
                      L47: {
                        var4 = var8 - (((hfa) this).field_q << 12);
                        if (var8 - (((hfa) this).field_q << 12) < 0) {
                          break L47;
                        } else {
                          var4 = (field_v - var4) / field_v;
                          var9 = var9 + var4;
                          var7 = var7 + field_C * var4;
                          var8 = var8 + field_v * var4;
                          var6 = var6 + var4;
                          break L47;
                        }
                      }
                      L48: {
                        var4 = (var8 - field_v) / field_v;
                        if ((var8 - field_v) / field_v <= var9) {
                          break L48;
                        } else {
                          var9 = var4;
                          break L48;
                        }
                      }
                      L49: while (true) {
                        if (var9 >= 0) {
                          var5++;
                          field_m = field_m + field_z;
                          field_p = field_p + field_u;
                          field_f = field_f + field_o;
                          continue L44;
                        } else {
                          L50: {
                            var10 = (var8 >> 12) * ((hfa) this).field_e + (var7 >> 12);
                            int incrementValue$26 = var6;
                            var6++;
                            var11 = incrementValue$26;
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
                                          break L50;
                                        } else {
                                          var15 = ((hfa) this).field_F[var10];
                                          if (var15 == 0) {
                                            break L50;
                                          } else {
                                            var16 = ((hfa) this).field_G[var15 & 255];
                                            var17 = (var16 & 16711935) * field_i & -16711936;
                                            var18 = (var16 & 65280) * field_i & 16711680;
                                            var16 = ((var17 | var18) >>> 8) + field_g;
                                            var19 = var54[var11];
                                            var20 = var16 + var19;
                                            var21 = (var16 & 16711935) + (var19 & 16711935);
                                            var19 = (var21 & 16777472) + (var20 - var21 & 65536);
                                            var12[var11] = var20 - var19 | var19 - (var19 >>> 8);
                                            break L50;
                                          }
                                        }
                                      } else {
                                        L51: {
                                          var15 = ((hfa) this).field_F[var10];
                                          if (var15 <= 0) {
                                            stackOut_320_0 = 0;
                                            stackIn_321_0 = stackOut_320_0;
                                            break L51;
                                          } else {
                                            stackOut_319_0 = ((hfa) this).field_G[var15];
                                            stackIn_321_0 = stackOut_319_0;
                                            break L51;
                                          }
                                        }
                                        L52: {
                                          var16 = stackIn_321_0;
                                          var17 = field_y;
                                          var18 = var16 + var17;
                                          var19 = (var16 & 16711935) + (var17 & 16711935);
                                          var20 = (var19 & 16777472) + (var18 - var19 & 65536);
                                          var20 = var18 - var20 | var20 - (var20 >>> 8);
                                          if (var16 != 0) {
                                            break L52;
                                          } else {
                                            if (field_i == 255) {
                                              break L52;
                                            } else {
                                              var16 = var20;
                                              var20 = var54[var11];
                                              var20 = ((var16 & 16711935) * field_i + (var20 & 16711935) * field_b & -16711936) + ((var16 & 65280) * field_i + (var20 & 65280) * field_b & 16711680) >> 8;
                                              break L52;
                                            }
                                          }
                                        }
                                        var54[var11] = var20;
                                        break L50;
                                      }
                                    } else {
                                      var15 = ((hfa) this).field_F[var10];
                                      if (var15 == 0) {
                                        break L50;
                                      } else {
                                        var16 = ((hfa) this).field_G[var15 & 255];
                                        var17 = (var16 & 16711680) * field_x & -16777216;
                                        var18 = (var16 & 65280) * field_s & 16711680;
                                        var19 = (var16 & 255) * field_E & 65280;
                                        var16 = (var17 | var18 | var19) >>> 8;
                                        var20 = var54[var11];
                                        var21 = var16 + var20;
                                        var22 = (var16 & 16711935) + (var20 & 16711935);
                                        var20 = (var22 & 16777472) + (var21 - var22 & 65536);
                                        var12[var11] = var21 - var20 | var20 - (var20 >>> 8);
                                        break L50;
                                      }
                                    }
                                  } else {
                                    var15 = ((hfa) this).field_F[var10];
                                    if (var15 == 0) {
                                      break L50;
                                    } else {
                                      var16 = ((hfa) this).field_G[var15 & 255];
                                      var17 = var54[var11];
                                      var18 = var16 + var17;
                                      var19 = (var16 & 16711935) + (var17 & 16711935);
                                      var17 = (var19 & 16777472) + (var18 - var19 & 65536);
                                      var12[var11] = var18 - var17 | var17 - (var17 >>> 8);
                                      break L50;
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
                                        var15 = ((hfa) this).field_F[var10];
                                        if (var15 == 0) {
                                          break L50;
                                        } else {
                                          var16 = ((hfa) this).field_G[var15 & 255];
                                          var17 = (var16 & 16711935) * field_i & -16711936;
                                          var18 = (var16 & 65280) * field_i & 16711680;
                                          int incrementValue$27 = var11;
                                          var11++;
                                          var12[incrementValue$27] = ((var17 | var18) >>> 8) + field_g;
                                          break L50;
                                        }
                                      }
                                    } else {
                                      L53: {
                                        var15 = ((hfa) this).field_F[var10];
                                        if (var15 <= 0) {
                                          stackOut_301_0 = 0;
                                          stackIn_302_0 = stackOut_301_0;
                                          break L53;
                                        } else {
                                          stackOut_300_0 = ((hfa) this).field_G[var15];
                                          stackIn_302_0 = stackOut_300_0;
                                          break L53;
                                        }
                                      }
                                      L54: {
                                        var16 = stackIn_302_0;
                                        var17 = field_y;
                                        var18 = var16 + var17;
                                        var19 = (var16 & 16711935) + (var17 & 16711935);
                                        var20 = (var19 & 16777472) + (var18 - var19 & 65536);
                                        var20 = var18 - var20 | var20 - (var20 >>> 8);
                                        if (var16 != 0) {
                                          break L54;
                                        } else {
                                          if (field_i == 255) {
                                            break L54;
                                          } else {
                                            var16 = var20;
                                            var20 = var54[var11];
                                            var20 = ((var16 & 16711935) * field_i + (var20 & 16711935) * field_b & -16711936) + ((var16 & 65280) * field_i + (var20 & 65280) * field_b & 16711680) >> 8;
                                            break L54;
                                          }
                                        }
                                      }
                                      var54[var11] = var20;
                                      break L50;
                                    }
                                  } else {
                                    var15 = ((hfa) this).field_F[var10];
                                    if (var15 == 0) {
                                      break L50;
                                    } else {
                                      var16 = ((hfa) this).field_G[var15 & 255];
                                      if ((field_y & 16777215) != 16777215) {
                                        if (field_i == 255) {
                                          var17 = (var16 & 16711680) * field_x & -16777216;
                                          var18 = (var16 & 65280) * field_s & 16711680;
                                          var19 = (var16 & 255) * field_E & 65280;
                                          var12[var11] = (var17 | var18 | var19) >>> 8;
                                          break L50;
                                        } else {
                                          var17 = (var16 & 16711680) * field_x & -16777216;
                                          var18 = (var16 & 65280) * field_s & 16711680;
                                          var19 = (var16 & 255) * field_E & 65280;
                                          var16 = (var17 | var18 | var19) >>> 8;
                                          var20 = var54[var11];
                                          var12[var11] = ((var16 & 16711935) * field_i + (var20 & 16711935) * field_b & -16711936) + ((var16 & 65280) * field_i + (var20 & 65280) * field_b & 16711680) >> 8;
                                          break L50;
                                        }
                                      } else {
                                        var17 = field_y >>> 24;
                                        var18 = 256 - var17;
                                        var19 = var54[var11];
                                        var12[var11] = ((var16 & 16711935) * var17 + (var19 & 16711935) * var18 & -16711936) + ((var16 & 65280) * var17 + (var19 & 65280) * var18 & 16711680) >> 8;
                                        break L50;
                                      }
                                    }
                                  }
                                } else {
                                  var15 = ((hfa) this).field_F[var10];
                                  if (var15 == 0) {
                                    break L50;
                                  } else {
                                    var12[var11] = ((hfa) this).field_G[var15 & 255];
                                    break L50;
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
                                      var15 = ((hfa) this).field_G[((hfa) this).field_F[var10] & 255];
                                      var16 = (var15 & 16711935) * field_i & -16711936;
                                      var17 = (var15 & 65280) * field_i & 16711680;
                                      var12[var11] = ((var16 | var17) >>> 8) + field_g;
                                      break L50;
                                    }
                                  } else {
                                    var15 = ((hfa) this).field_G[((hfa) this).field_F[var10] & 255];
                                    var16 = field_y;
                                    var17 = var15 + var16;
                                    var18 = (var15 & 16711935) + (var16 & 16711935);
                                    var19 = (var18 & 16777472) + (var17 - var18 & 65536);
                                    var12[var11] = var17 - var19 | var19 - (var19 >>> 8);
                                    break L50;
                                  }
                                } else {
                                  var15 = ((hfa) this).field_G[((hfa) this).field_F[var10] & 255];
                                  var16 = (var15 & 16711680) * field_x & -16777216;
                                  var17 = (var15 & 65280) * field_s & 16711680;
                                  var18 = (var15 & 255) * field_E & 65280;
                                  var12[var11] = (var16 | var17 | var18) >>> 8;
                                  break L50;
                                }
                              } else {
                                var12[var11] = ((hfa) this).field_G[((hfa) this).field_F[var10] & 255];
                                break L50;
                              }
                            }
                          }
                          var7 = var7 + field_C;
                          var8 = var8 + field_v;
                          var9++;
                          continue L49;
                        }
                      }
                    }
                  }
                }
              } else {
                var5 = field_h;
                L55: while (true) {
                  if (var5 >= 0) {
                    break L0;
                  } else {
                    L56: {
                      var6 = field_f;
                      var7 = field_m + field_a;
                      var8 = field_p;
                      var9 = field_B;
                      if (var8 >= 0) {
                        if (var8 - (((hfa) this).field_q << 12) < 0) {
                          L57: {
                            var4 = var7 - (((hfa) this).field_e << 12);
                            if (var7 - (((hfa) this).field_e << 12) < 0) {
                              break L57;
                            } else {
                              var4 = (field_C - var4) / field_C;
                              var9 = var9 + var4;
                              var7 = var7 + field_C * var4;
                              var6 = var6 + var4;
                              break L57;
                            }
                          }
                          L58: {
                            var4 = (var7 - field_C) / field_C;
                            if ((var7 - field_C) / field_C <= var9) {
                              break L58;
                            } else {
                              var9 = var4;
                              break L58;
                            }
                          }
                          L59: while (true) {
                            if (var9 >= 0) {
                              break L56;
                            } else {
                              L60: {
                                var10 = (var8 >> 12) * ((hfa) this).field_e + (var7 >> 12);
                                int incrementValue$28 = var6;
                                var6++;
                                var11 = incrementValue$28;
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
                                              break L60;
                                            } else {
                                              var15 = ((hfa) this).field_F[var10];
                                              if (var15 == 0) {
                                                break L60;
                                              } else {
                                                var16 = ((hfa) this).field_G[var15 & 255];
                                                var17 = (var16 & 16711935) * field_i & -16711936;
                                                var18 = (var16 & 65280) * field_i & 16711680;
                                                var16 = ((var17 | var18) >>> 8) + field_g;
                                                var19 = var53[var11];
                                                var20 = var16 + var19;
                                                var21 = (var16 & 16711935) + (var19 & 16711935);
                                                var19 = (var21 & 16777472) + (var20 - var21 & 65536);
                                                var12[var11] = var20 - var19 | var19 - (var19 >>> 8);
                                                break L60;
                                              }
                                            }
                                          } else {
                                            L61: {
                                              var15 = ((hfa) this).field_F[var10];
                                              if (var15 <= 0) {
                                                stackOut_254_0 = 0;
                                                stackIn_255_0 = stackOut_254_0;
                                                break L61;
                                              } else {
                                                stackOut_253_0 = ((hfa) this).field_G[var15];
                                                stackIn_255_0 = stackOut_253_0;
                                                break L61;
                                              }
                                            }
                                            L62: {
                                              var16 = stackIn_255_0;
                                              var17 = field_y;
                                              var18 = var16 + var17;
                                              var19 = (var16 & 16711935) + (var17 & 16711935);
                                              var20 = (var19 & 16777472) + (var18 - var19 & 65536);
                                              var20 = var18 - var20 | var20 - (var20 >>> 8);
                                              if (var16 != 0) {
                                                break L62;
                                              } else {
                                                if (field_i == 255) {
                                                  break L62;
                                                } else {
                                                  var16 = var20;
                                                  var20 = var53[var11];
                                                  var20 = ((var16 & 16711935) * field_i + (var20 & 16711935) * field_b & -16711936) + ((var16 & 65280) * field_i + (var20 & 65280) * field_b & 16711680) >> 8;
                                                  break L62;
                                                }
                                              }
                                            }
                                            var53[var11] = var20;
                                            break L60;
                                          }
                                        } else {
                                          var15 = ((hfa) this).field_F[var10];
                                          if (var15 == 0) {
                                            break L60;
                                          } else {
                                            var16 = ((hfa) this).field_G[var15 & 255];
                                            var17 = (var16 & 16711680) * field_x & -16777216;
                                            var18 = (var16 & 65280) * field_s & 16711680;
                                            var19 = (var16 & 255) * field_E & 65280;
                                            var16 = (var17 | var18 | var19) >>> 8;
                                            var20 = var53[var11];
                                            var21 = var16 + var20;
                                            var22 = (var16 & 16711935) + (var20 & 16711935);
                                            var20 = (var22 & 16777472) + (var21 - var22 & 65536);
                                            var12[var11] = var21 - var20 | var20 - (var20 >>> 8);
                                            break L60;
                                          }
                                        }
                                      } else {
                                        var15 = ((hfa) this).field_F[var10];
                                        if (var15 == 0) {
                                          break L60;
                                        } else {
                                          var16 = ((hfa) this).field_G[var15 & 255];
                                          var17 = var53[var11];
                                          var18 = var16 + var17;
                                          var19 = (var16 & 16711935) + (var17 & 16711935);
                                          var17 = (var19 & 16777472) + (var18 - var19 & 65536);
                                          var12[var11] = var18 - var17 | var17 - (var17 >>> 8);
                                          break L60;
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
                                            var15 = ((hfa) this).field_F[var10];
                                            if (var15 == 0) {
                                              break L60;
                                            } else {
                                              var16 = ((hfa) this).field_G[var15 & 255];
                                              var17 = (var16 & 16711935) * field_i & -16711936;
                                              var18 = (var16 & 65280) * field_i & 16711680;
                                              int incrementValue$29 = var11;
                                              var11++;
                                              var12[incrementValue$29] = ((var17 | var18) >>> 8) + field_g;
                                              break L60;
                                            }
                                          }
                                        } else {
                                          L63: {
                                            var15 = ((hfa) this).field_F[var10];
                                            if (var15 <= 0) {
                                              stackOut_235_0 = 0;
                                              stackIn_236_0 = stackOut_235_0;
                                              break L63;
                                            } else {
                                              stackOut_234_0 = ((hfa) this).field_G[var15];
                                              stackIn_236_0 = stackOut_234_0;
                                              break L63;
                                            }
                                          }
                                          L64: {
                                            var16 = stackIn_236_0;
                                            var17 = field_y;
                                            var18 = var16 + var17;
                                            var19 = (var16 & 16711935) + (var17 & 16711935);
                                            var20 = (var19 & 16777472) + (var18 - var19 & 65536);
                                            var20 = var18 - var20 | var20 - (var20 >>> 8);
                                            if (var16 != 0) {
                                              break L64;
                                            } else {
                                              if (field_i == 255) {
                                                break L64;
                                              } else {
                                                var16 = var20;
                                                var20 = var53[var11];
                                                var20 = ((var16 & 16711935) * field_i + (var20 & 16711935) * field_b & -16711936) + ((var16 & 65280) * field_i + (var20 & 65280) * field_b & 16711680) >> 8;
                                                break L64;
                                              }
                                            }
                                          }
                                          var53[var11] = var20;
                                          break L60;
                                        }
                                      } else {
                                        var15 = ((hfa) this).field_F[var10];
                                        if (var15 == 0) {
                                          break L60;
                                        } else {
                                          var16 = ((hfa) this).field_G[var15 & 255];
                                          if ((field_y & 16777215) != 16777215) {
                                            if (field_i == 255) {
                                              var17 = (var16 & 16711680) * field_x & -16777216;
                                              var18 = (var16 & 65280) * field_s & 16711680;
                                              var19 = (var16 & 255) * field_E & 65280;
                                              var12[var11] = (var17 | var18 | var19) >>> 8;
                                              break L60;
                                            } else {
                                              var17 = (var16 & 16711680) * field_x & -16777216;
                                              var18 = (var16 & 65280) * field_s & 16711680;
                                              var19 = (var16 & 255) * field_E & 65280;
                                              var16 = (var17 | var18 | var19) >>> 8;
                                              var20 = var53[var11];
                                              var12[var11] = ((var16 & 16711935) * field_i + (var20 & 16711935) * field_b & -16711936) + ((var16 & 65280) * field_i + (var20 & 65280) * field_b & 16711680) >> 8;
                                              break L60;
                                            }
                                          } else {
                                            var17 = field_y >>> 24;
                                            var18 = 256 - var17;
                                            var19 = var53[var11];
                                            var12[var11] = ((var16 & 16711935) * var17 + (var19 & 16711935) * var18 & -16711936) + ((var16 & 65280) * var17 + (var19 & 65280) * var18 & 16711680) >> 8;
                                            break L60;
                                          }
                                        }
                                      }
                                    } else {
                                      var15 = ((hfa) this).field_F[var10];
                                      if (var15 == 0) {
                                        break L60;
                                      } else {
                                        var12[var11] = ((hfa) this).field_G[var15 & 255];
                                        break L60;
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
                                          var15 = ((hfa) this).field_G[((hfa) this).field_F[var10] & 255];
                                          var16 = (var15 & 16711935) * field_i & -16711936;
                                          var17 = (var15 & 65280) * field_i & 16711680;
                                          var12[var11] = ((var16 | var17) >>> 8) + field_g;
                                          break L60;
                                        }
                                      } else {
                                        var15 = ((hfa) this).field_G[((hfa) this).field_F[var10] & 255];
                                        var16 = field_y;
                                        var17 = var15 + var16;
                                        var18 = (var15 & 16711935) + (var16 & 16711935);
                                        var19 = (var18 & 16777472) + (var17 - var18 & 65536);
                                        var12[var11] = var17 - var19 | var19 - (var19 >>> 8);
                                        break L60;
                                      }
                                    } else {
                                      var15 = ((hfa) this).field_G[((hfa) this).field_F[var10] & 255];
                                      var16 = (var15 & 16711680) * field_x & -16777216;
                                      var17 = (var15 & 65280) * field_s & 16711680;
                                      var18 = (var15 & 255) * field_E & 65280;
                                      var12[var11] = (var16 | var17 | var18) >>> 8;
                                      break L60;
                                    }
                                  } else {
                                    var12[var11] = ((hfa) this).field_G[((hfa) this).field_F[var10] & 255];
                                    break L60;
                                  }
                                }
                              }
                              var7 = var7 + field_C;
                              var9++;
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
                    var5++;
                    field_p = field_p + field_u;
                    field_f = field_f + field_o;
                    continue L55;
                  }
                }
              }
            }
          } else {
            if (field_v != 0) {
              if (field_v >= 0) {
                var5 = field_h;
                L65: while (true) {
                  if (var5 >= 0) {
                    break L0;
                  } else {
                    L66: {
                      var6 = field_f;
                      var7 = field_m;
                      var8 = field_p + field_l;
                      var9 = field_B;
                      if (var7 >= 0) {
                        if (var7 - (((hfa) this).field_e << 12) < 0) {
                          L67: {
                            if (var8 >= 0) {
                              break L67;
                            } else {
                              var4 = (field_v - 1 - var8) / field_v;
                              var9 = var9 + var4;
                              var8 = var8 + field_v * var4;
                              var6 = var6 + var4;
                              break L67;
                            }
                          }
                          L68: {
                            var4 = (1 + var8 - (((hfa) this).field_q << 12) - field_v) / field_v;
                            if ((1 + var8 - (((hfa) this).field_q << 12) - field_v) / field_v <= var9) {
                              break L68;
                            } else {
                              var9 = var4;
                              break L68;
                            }
                          }
                          L69: while (true) {
                            if (var9 >= 0) {
                              break L66;
                            } else {
                              L70: {
                                var10 = (var8 >> 12) * ((hfa) this).field_e + (var7 >> 12);
                                int incrementValue$30 = var6;
                                var6++;
                                var11 = incrementValue$30;
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
                                              break L70;
                                            } else {
                                              var15 = ((hfa) this).field_F[var10];
                                              if (var15 == 0) {
                                                break L70;
                                              } else {
                                                var16 = ((hfa) this).field_G[var15 & 255];
                                                var17 = (var16 & 16711935) * field_i & -16711936;
                                                var18 = (var16 & 65280) * field_i & 16711680;
                                                var16 = ((var17 | var18) >>> 8) + field_g;
                                                var19 = var52[var11];
                                                var20 = var16 + var19;
                                                var21 = (var16 & 16711935) + (var19 & 16711935);
                                                var19 = (var21 & 16777472) + (var20 - var21 & 65536);
                                                var12[var11] = var20 - var19 | var19 - (var19 >>> 8);
                                                break L70;
                                              }
                                            }
                                          } else {
                                            L71: {
                                              var15 = ((hfa) this).field_F[var10];
                                              if (var15 <= 0) {
                                                stackOut_187_0 = 0;
                                                stackIn_188_0 = stackOut_187_0;
                                                break L71;
                                              } else {
                                                stackOut_186_0 = ((hfa) this).field_G[var15];
                                                stackIn_188_0 = stackOut_186_0;
                                                break L71;
                                              }
                                            }
                                            L72: {
                                              var16 = stackIn_188_0;
                                              var17 = field_y;
                                              var18 = var16 + var17;
                                              var19 = (var16 & 16711935) + (var17 & 16711935);
                                              var20 = (var19 & 16777472) + (var18 - var19 & 65536);
                                              var20 = var18 - var20 | var20 - (var20 >>> 8);
                                              if (var16 != 0) {
                                                break L72;
                                              } else {
                                                if (field_i == 255) {
                                                  break L72;
                                                } else {
                                                  var16 = var20;
                                                  var20 = var52[var11];
                                                  var20 = ((var16 & 16711935) * field_i + (var20 & 16711935) * field_b & -16711936) + ((var16 & 65280) * field_i + (var20 & 65280) * field_b & 16711680) >> 8;
                                                  break L72;
                                                }
                                              }
                                            }
                                            var52[var11] = var20;
                                            break L70;
                                          }
                                        } else {
                                          var15 = ((hfa) this).field_F[var10];
                                          if (var15 == 0) {
                                            break L70;
                                          } else {
                                            var16 = ((hfa) this).field_G[var15 & 255];
                                            var17 = (var16 & 16711680) * field_x & -16777216;
                                            var18 = (var16 & 65280) * field_s & 16711680;
                                            var19 = (var16 & 255) * field_E & 65280;
                                            var16 = (var17 | var18 | var19) >>> 8;
                                            var20 = var52[var11];
                                            var21 = var16 + var20;
                                            var22 = (var16 & 16711935) + (var20 & 16711935);
                                            var20 = (var22 & 16777472) + (var21 - var22 & 65536);
                                            var12[var11] = var21 - var20 | var20 - (var20 >>> 8);
                                            break L70;
                                          }
                                        }
                                      } else {
                                        var15 = ((hfa) this).field_F[var10];
                                        if (var15 == 0) {
                                          break L70;
                                        } else {
                                          var16 = ((hfa) this).field_G[var15 & 255];
                                          var17 = var52[var11];
                                          var18 = var16 + var17;
                                          var19 = (var16 & 16711935) + (var17 & 16711935);
                                          var17 = (var19 & 16777472) + (var18 - var19 & 65536);
                                          var12[var11] = var18 - var17 | var17 - (var17 >>> 8);
                                          break L70;
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
                                            var15 = ((hfa) this).field_F[var10];
                                            if (var15 == 0) {
                                              break L70;
                                            } else {
                                              var16 = ((hfa) this).field_G[var15 & 255];
                                              var17 = (var16 & 16711935) * field_i & -16711936;
                                              var18 = (var16 & 65280) * field_i & 16711680;
                                              int incrementValue$31 = var11;
                                              var11++;
                                              var12[incrementValue$31] = ((var17 | var18) >>> 8) + field_g;
                                              break L70;
                                            }
                                          }
                                        } else {
                                          L73: {
                                            var15 = ((hfa) this).field_F[var10];
                                            if (var15 <= 0) {
                                              stackOut_168_0 = 0;
                                              stackIn_169_0 = stackOut_168_0;
                                              break L73;
                                            } else {
                                              stackOut_167_0 = ((hfa) this).field_G[var15];
                                              stackIn_169_0 = stackOut_167_0;
                                              break L73;
                                            }
                                          }
                                          L74: {
                                            var16 = stackIn_169_0;
                                            var17 = field_y;
                                            var18 = var16 + var17;
                                            var19 = (var16 & 16711935) + (var17 & 16711935);
                                            var20 = (var19 & 16777472) + (var18 - var19 & 65536);
                                            var20 = var18 - var20 | var20 - (var20 >>> 8);
                                            if (var16 != 0) {
                                              break L74;
                                            } else {
                                              if (field_i == 255) {
                                                break L74;
                                              } else {
                                                var16 = var20;
                                                var20 = var52[var11];
                                                var20 = ((var16 & 16711935) * field_i + (var20 & 16711935) * field_b & -16711936) + ((var16 & 65280) * field_i + (var20 & 65280) * field_b & 16711680) >> 8;
                                                break L74;
                                              }
                                            }
                                          }
                                          var52[var11] = var20;
                                          break L70;
                                        }
                                      } else {
                                        var15 = ((hfa) this).field_F[var10];
                                        if (var15 == 0) {
                                          break L70;
                                        } else {
                                          var16 = ((hfa) this).field_G[var15 & 255];
                                          if ((field_y & 16777215) != 16777215) {
                                            if (field_i == 255) {
                                              var17 = (var16 & 16711680) * field_x & -16777216;
                                              var18 = (var16 & 65280) * field_s & 16711680;
                                              var19 = (var16 & 255) * field_E & 65280;
                                              var12[var11] = (var17 | var18 | var19) >>> 8;
                                              break L70;
                                            } else {
                                              var17 = (var16 & 16711680) * field_x & -16777216;
                                              var18 = (var16 & 65280) * field_s & 16711680;
                                              var19 = (var16 & 255) * field_E & 65280;
                                              var16 = (var17 | var18 | var19) >>> 8;
                                              var20 = var52[var11];
                                              var12[var11] = ((var16 & 16711935) * field_i + (var20 & 16711935) * field_b & -16711936) + ((var16 & 65280) * field_i + (var20 & 65280) * field_b & 16711680) >> 8;
                                              break L70;
                                            }
                                          } else {
                                            var17 = field_y >>> 24;
                                            var18 = 256 - var17;
                                            var19 = var52[var11];
                                            var12[var11] = ((var16 & 16711935) * var17 + (var19 & 16711935) * var18 & -16711936) + ((var16 & 65280) * var17 + (var19 & 65280) * var18 & 16711680) >> 8;
                                            break L70;
                                          }
                                        }
                                      }
                                    } else {
                                      var15 = ((hfa) this).field_F[var10];
                                      if (var15 == 0) {
                                        break L70;
                                      } else {
                                        var12[var11] = ((hfa) this).field_G[var15 & 255];
                                        break L70;
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
                                          var15 = ((hfa) this).field_G[((hfa) this).field_F[var10] & 255];
                                          var16 = (var15 & 16711935) * field_i & -16711936;
                                          var17 = (var15 & 65280) * field_i & 16711680;
                                          var12[var11] = ((var16 | var17) >>> 8) + field_g;
                                          break L70;
                                        }
                                      } else {
                                        var15 = ((hfa) this).field_G[((hfa) this).field_F[var10] & 255];
                                        var16 = field_y;
                                        var17 = var15 + var16;
                                        var18 = (var15 & 16711935) + (var16 & 16711935);
                                        var19 = (var18 & 16777472) + (var17 - var18 & 65536);
                                        var12[var11] = var17 - var19 | var19 - (var19 >>> 8);
                                        break L70;
                                      }
                                    } else {
                                      var15 = ((hfa) this).field_G[((hfa) this).field_F[var10] & 255];
                                      var16 = (var15 & 16711680) * field_x & -16777216;
                                      var17 = (var15 & 65280) * field_s & 16711680;
                                      var18 = (var15 & 255) * field_E & 65280;
                                      var12[var11] = (var16 | var17 | var18) >>> 8;
                                      break L70;
                                    }
                                  } else {
                                    var12[var11] = ((hfa) this).field_G[((hfa) this).field_F[var10] & 255];
                                    break L70;
                                  }
                                }
                              }
                              var8 = var8 + field_v;
                              var9++;
                              continue L69;
                            }
                          }
                        } else {
                          break L66;
                        }
                      } else {
                        break L66;
                      }
                    }
                    var5++;
                    field_m = field_m + field_z;
                    field_f = field_f + field_o;
                    continue L65;
                  }
                }
              } else {
                var5 = field_h;
                L75: while (true) {
                  if (var5 >= 0) {
                    break L0;
                  } else {
                    L76: {
                      var6 = field_f;
                      var7 = field_m;
                      var8 = field_p + field_l;
                      var9 = field_B;
                      if (var7 >= 0) {
                        if (var7 - (((hfa) this).field_e << 12) < 0) {
                          L77: {
                            var4 = var8 - (((hfa) this).field_q << 12);
                            if (var8 - (((hfa) this).field_q << 12) < 0) {
                              break L77;
                            } else {
                              var4 = (field_v - var4) / field_v;
                              var9 = var9 + var4;
                              var8 = var8 + field_v * var4;
                              var6 = var6 + var4;
                              break L77;
                            }
                          }
                          L78: {
                            var4 = (var8 - field_v) / field_v;
                            if ((var8 - field_v) / field_v <= var9) {
                              break L78;
                            } else {
                              var9 = var4;
                              break L78;
                            }
                          }
                          L79: while (true) {
                            if (var9 >= 0) {
                              break L76;
                            } else {
                              L80: {
                                var10 = (var8 >> 12) * ((hfa) this).field_e + (var7 >> 12);
                                int incrementValue$32 = var6;
                                var6++;
                                var11 = incrementValue$32;
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
                                              break L80;
                                            } else {
                                              var15 = ((hfa) this).field_F[var10];
                                              if (var15 == 0) {
                                                break L80;
                                              } else {
                                                var16 = ((hfa) this).field_G[var15 & 255];
                                                var17 = (var16 & 16711935) * field_i & -16711936;
                                                var18 = (var16 & 65280) * field_i & 16711680;
                                                var16 = ((var17 | var18) >>> 8) + field_g;
                                                var19 = var51[var11];
                                                var20 = var16 + var19;
                                                var21 = (var16 & 16711935) + (var19 & 16711935);
                                                var19 = (var21 & 16777472) + (var20 - var21 & 65536);
                                                var12[var11] = var20 - var19 | var19 - (var19 >>> 8);
                                                break L80;
                                              }
                                            }
                                          } else {
                                            L81: {
                                              var15 = ((hfa) this).field_F[var10];
                                              if (var15 <= 0) {
                                                stackOut_122_0 = 0;
                                                stackIn_123_0 = stackOut_122_0;
                                                break L81;
                                              } else {
                                                stackOut_121_0 = ((hfa) this).field_G[var15];
                                                stackIn_123_0 = stackOut_121_0;
                                                break L81;
                                              }
                                            }
                                            L82: {
                                              var16 = stackIn_123_0;
                                              var17 = field_y;
                                              var18 = var16 + var17;
                                              var19 = (var16 & 16711935) + (var17 & 16711935);
                                              var20 = (var19 & 16777472) + (var18 - var19 & 65536);
                                              var20 = var18 - var20 | var20 - (var20 >>> 8);
                                              if (var16 != 0) {
                                                break L82;
                                              } else {
                                                if (field_i == 255) {
                                                  break L82;
                                                } else {
                                                  var16 = var20;
                                                  var20 = var51[var11];
                                                  var20 = ((var16 & 16711935) * field_i + (var20 & 16711935) * field_b & -16711936) + ((var16 & 65280) * field_i + (var20 & 65280) * field_b & 16711680) >> 8;
                                                  break L82;
                                                }
                                              }
                                            }
                                            var51[var11] = var20;
                                            break L80;
                                          }
                                        } else {
                                          var15 = ((hfa) this).field_F[var10];
                                          if (var15 == 0) {
                                            break L80;
                                          } else {
                                            var16 = ((hfa) this).field_G[var15 & 255];
                                            var17 = (var16 & 16711680) * field_x & -16777216;
                                            var18 = (var16 & 65280) * field_s & 16711680;
                                            var19 = (var16 & 255) * field_E & 65280;
                                            var16 = (var17 | var18 | var19) >>> 8;
                                            var20 = var51[var11];
                                            var21 = var16 + var20;
                                            var22 = (var16 & 16711935) + (var20 & 16711935);
                                            var20 = (var22 & 16777472) + (var21 - var22 & 65536);
                                            var12[var11] = var21 - var20 | var20 - (var20 >>> 8);
                                            break L80;
                                          }
                                        }
                                      } else {
                                        var15 = ((hfa) this).field_F[var10];
                                        if (var15 == 0) {
                                          break L80;
                                        } else {
                                          var16 = ((hfa) this).field_G[var15 & 255];
                                          var17 = var51[var11];
                                          var18 = var16 + var17;
                                          var19 = (var16 & 16711935) + (var17 & 16711935);
                                          var17 = (var19 & 16777472) + (var18 - var19 & 65536);
                                          var12[var11] = var18 - var17 | var17 - (var17 >>> 8);
                                          break L80;
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
                                            var15 = ((hfa) this).field_F[var10];
                                            if (var15 == 0) {
                                              break L80;
                                            } else {
                                              var16 = ((hfa) this).field_G[var15 & 255];
                                              var17 = (var16 & 16711935) * field_i & -16711936;
                                              var18 = (var16 & 65280) * field_i & 16711680;
                                              int incrementValue$33 = var11;
                                              var11++;
                                              var12[incrementValue$33] = ((var17 | var18) >>> 8) + field_g;
                                              break L80;
                                            }
                                          }
                                        } else {
                                          L83: {
                                            var15 = ((hfa) this).field_F[var10];
                                            if (var15 <= 0) {
                                              stackOut_103_0 = 0;
                                              stackIn_104_0 = stackOut_103_0;
                                              break L83;
                                            } else {
                                              stackOut_102_0 = ((hfa) this).field_G[var15];
                                              stackIn_104_0 = stackOut_102_0;
                                              break L83;
                                            }
                                          }
                                          L84: {
                                            var16 = stackIn_104_0;
                                            var17 = field_y;
                                            var18 = var16 + var17;
                                            var19 = (var16 & 16711935) + (var17 & 16711935);
                                            var20 = (var19 & 16777472) + (var18 - var19 & 65536);
                                            var20 = var18 - var20 | var20 - (var20 >>> 8);
                                            if (var16 != 0) {
                                              break L84;
                                            } else {
                                              if (field_i == 255) {
                                                break L84;
                                              } else {
                                                var16 = var20;
                                                var20 = var51[var11];
                                                var20 = ((var16 & 16711935) * field_i + (var20 & 16711935) * field_b & -16711936) + ((var16 & 65280) * field_i + (var20 & 65280) * field_b & 16711680) >> 8;
                                                break L84;
                                              }
                                            }
                                          }
                                          var51[var11] = var20;
                                          break L80;
                                        }
                                      } else {
                                        var15 = ((hfa) this).field_F[var10];
                                        if (var15 == 0) {
                                          break L80;
                                        } else {
                                          var16 = ((hfa) this).field_G[var15 & 255];
                                          if ((field_y & 16777215) != 16777215) {
                                            if (field_i == 255) {
                                              var17 = (var16 & 16711680) * field_x & -16777216;
                                              var18 = (var16 & 65280) * field_s & 16711680;
                                              var19 = (var16 & 255) * field_E & 65280;
                                              var12[var11] = (var17 | var18 | var19) >>> 8;
                                              break L80;
                                            } else {
                                              var17 = (var16 & 16711680) * field_x & -16777216;
                                              var18 = (var16 & 65280) * field_s & 16711680;
                                              var19 = (var16 & 255) * field_E & 65280;
                                              var16 = (var17 | var18 | var19) >>> 8;
                                              var20 = var51[var11];
                                              var12[var11] = ((var16 & 16711935) * field_i + (var20 & 16711935) * field_b & -16711936) + ((var16 & 65280) * field_i + (var20 & 65280) * field_b & 16711680) >> 8;
                                              break L80;
                                            }
                                          } else {
                                            var17 = field_y >>> 24;
                                            var18 = 256 - var17;
                                            var19 = var51[var11];
                                            var12[var11] = ((var16 & 16711935) * var17 + (var19 & 16711935) * var18 & -16711936) + ((var16 & 65280) * var17 + (var19 & 65280) * var18 & 16711680) >> 8;
                                            break L80;
                                          }
                                        }
                                      }
                                    } else {
                                      var15 = ((hfa) this).field_F[var10];
                                      if (var15 == 0) {
                                        break L80;
                                      } else {
                                        var12[var11] = ((hfa) this).field_G[var15 & 255];
                                        break L80;
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
                                          var15 = ((hfa) this).field_G[((hfa) this).field_F[var10] & 255];
                                          var16 = (var15 & 16711935) * field_i & -16711936;
                                          var17 = (var15 & 65280) * field_i & 16711680;
                                          var12[var11] = ((var16 | var17) >>> 8) + field_g;
                                          break L80;
                                        }
                                      } else {
                                        var15 = ((hfa) this).field_G[((hfa) this).field_F[var10] & 255];
                                        var16 = field_y;
                                        var17 = var15 + var16;
                                        var18 = (var15 & 16711935) + (var16 & 16711935);
                                        var19 = (var18 & 16777472) + (var17 - var18 & 65536);
                                        var12[var11] = var17 - var19 | var19 - (var19 >>> 8);
                                        break L80;
                                      }
                                    } else {
                                      var15 = ((hfa) this).field_G[((hfa) this).field_F[var10] & 255];
                                      var16 = (var15 & 16711680) * field_x & -16777216;
                                      var17 = (var15 & 65280) * field_s & 16711680;
                                      var18 = (var15 & 255) * field_E & 65280;
                                      var12[var11] = (var16 | var17 | var18) >>> 8;
                                      break L80;
                                    }
                                  } else {
                                    var12[var11] = ((hfa) this).field_G[((hfa) this).field_F[var10] & 255];
                                    break L80;
                                  }
                                }
                              }
                              var8 = var8 + field_v;
                              var9++;
                              continue L79;
                            }
                          }
                        } else {
                          break L76;
                        }
                      } else {
                        break L76;
                      }
                    }
                    var5++;
                    field_m = field_m + field_z;
                    field_f = field_f + field_o;
                    continue L75;
                  }
                }
              }
            } else {
              var5 = field_h;
              L85: while (true) {
                if (var5 >= 0) {
                  return;
                } else {
                  L86: {
                    var6 = field_f;
                    var7 = field_m;
                    var8 = field_p;
                    var9 = field_B;
                    if (var7 >= 0) {
                      if (var8 >= 0) {
                        if (var7 - (((hfa) this).field_e << 12) < 0) {
                          if (var8 - (((hfa) this).field_q << 12) < 0) {
                            L87: while (true) {
                              if (var9 >= 0) {
                                break L86;
                              } else {
                                L88: {
                                  var10 = (var8 >> 12) * ((hfa) this).field_e + (var7 >> 12);
                                  int incrementValue$34 = var6;
                                  var6++;
                                  var11 = incrementValue$34;
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
                                                break L88;
                                              } else {
                                                var15 = ((hfa) this).field_F[var10];
                                                if (var15 == 0) {
                                                  break L88;
                                                } else {
                                                  var16 = ((hfa) this).field_G[var15 & 255];
                                                  var17 = (var16 & 16711935) * field_i & -16711936;
                                                  var18 = (var16 & 65280) * field_i & 16711680;
                                                  var16 = ((var17 | var18) >>> 8) + field_g;
                                                  var19 = var50[var11];
                                                  var20 = var16 + var19;
                                                  var21 = (var16 & 16711935) + (var19 & 16711935);
                                                  var19 = (var21 & 16777472) + (var20 - var21 & 65536);
                                                  var12[var11] = var20 - var19 | var19 - (var19 >>> 8);
                                                  break L88;
                                                }
                                              }
                                            } else {
                                              L89: {
                                                var15 = ((hfa) this).field_F[var10];
                                                if (var15 <= 0) {
                                                  stackOut_56_0 = 0;
                                                  stackIn_57_0 = stackOut_56_0;
                                                  break L89;
                                                } else {
                                                  stackOut_55_0 = ((hfa) this).field_G[var15];
                                                  stackIn_57_0 = stackOut_55_0;
                                                  break L89;
                                                }
                                              }
                                              L90: {
                                                var16 = stackIn_57_0;
                                                var17 = field_y;
                                                var18 = var16 + var17;
                                                var19 = (var16 & 16711935) + (var17 & 16711935);
                                                var20 = (var19 & 16777472) + (var18 - var19 & 65536);
                                                var20 = var18 - var20 | var20 - (var20 >>> 8);
                                                if (var16 != 0) {
                                                  break L90;
                                                } else {
                                                  if (field_i == 255) {
                                                    break L90;
                                                  } else {
                                                    var16 = var20;
                                                    var20 = var50[var11];
                                                    var20 = ((var16 & 16711935) * field_i + (var20 & 16711935) * field_b & -16711936) + ((var16 & 65280) * field_i + (var20 & 65280) * field_b & 16711680) >> 8;
                                                    break L90;
                                                  }
                                                }
                                              }
                                              var50[var11] = var20;
                                              break L88;
                                            }
                                          } else {
                                            var15 = ((hfa) this).field_F[var10];
                                            if (var15 == 0) {
                                              break L88;
                                            } else {
                                              var16 = ((hfa) this).field_G[var15 & 255];
                                              var17 = (var16 & 16711680) * field_x & -16777216;
                                              var18 = (var16 & 65280) * field_s & 16711680;
                                              var19 = (var16 & 255) * field_E & 65280;
                                              var16 = (var17 | var18 | var19) >>> 8;
                                              var20 = var50[var11];
                                              var21 = var16 + var20;
                                              var22 = (var16 & 16711935) + (var20 & 16711935);
                                              var20 = (var22 & 16777472) + (var21 - var22 & 65536);
                                              var12[var11] = var21 - var20 | var20 - (var20 >>> 8);
                                              break L88;
                                            }
                                          }
                                        } else {
                                          var15 = ((hfa) this).field_F[var10];
                                          if (var15 == 0) {
                                            break L88;
                                          } else {
                                            var16 = ((hfa) this).field_G[var15 & 255];
                                            var17 = var50[var11];
                                            var18 = var16 + var17;
                                            var19 = (var16 & 16711935) + (var17 & 16711935);
                                            var17 = (var19 & 16777472) + (var18 - var19 & 65536);
                                            var12[var11] = var18 - var17 | var17 - (var17 >>> 8);
                                            break L88;
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
                                              var15 = ((hfa) this).field_F[var10];
                                              if (var15 == 0) {
                                                break L88;
                                              } else {
                                                var16 = ((hfa) this).field_G[var15 & 255];
                                                var17 = (var16 & 16711935) * field_i & -16711936;
                                                var18 = (var16 & 65280) * field_i & 16711680;
                                                int incrementValue$35 = var11;
                                                var11++;
                                                var12[incrementValue$35] = ((var17 | var18) >>> 8) + field_g;
                                                break L88;
                                              }
                                            }
                                          } else {
                                            L91: {
                                              var15 = ((hfa) this).field_F[var10];
                                              if (var15 <= 0) {
                                                stackOut_37_0 = 0;
                                                stackIn_38_0 = stackOut_37_0;
                                                break L91;
                                              } else {
                                                stackOut_36_0 = ((hfa) this).field_G[var15];
                                                stackIn_38_0 = stackOut_36_0;
                                                break L91;
                                              }
                                            }
                                            L92: {
                                              var16 = stackIn_38_0;
                                              var17 = field_y;
                                              var18 = var16 + var17;
                                              var19 = (var16 & 16711935) + (var17 & 16711935);
                                              var20 = (var19 & 16777472) + (var18 - var19 & 65536);
                                              var20 = var18 - var20 | var20 - (var20 >>> 8);
                                              if (var16 != 0) {
                                                break L92;
                                              } else {
                                                if (field_i == 255) {
                                                  break L92;
                                                } else {
                                                  var16 = var20;
                                                  var20 = var50[var11];
                                                  var20 = ((var16 & 16711935) * field_i + (var20 & 16711935) * field_b & -16711936) + ((var16 & 65280) * field_i + (var20 & 65280) * field_b & 16711680) >> 8;
                                                  break L92;
                                                }
                                              }
                                            }
                                            var50[var11] = var20;
                                            break L88;
                                          }
                                        } else {
                                          var15 = ((hfa) this).field_F[var10];
                                          if (var15 == 0) {
                                            break L88;
                                          } else {
                                            var16 = ((hfa) this).field_G[var15 & 255];
                                            if ((field_y & 16777215) != 16777215) {
                                              if (field_i == 255) {
                                                var17 = (var16 & 16711680) * field_x & -16777216;
                                                var18 = (var16 & 65280) * field_s & 16711680;
                                                var19 = (var16 & 255) * field_E & 65280;
                                                var12[var11] = (var17 | var18 | var19) >>> 8;
                                                break L88;
                                              } else {
                                                var17 = (var16 & 16711680) * field_x & -16777216;
                                                var18 = (var16 & 65280) * field_s & 16711680;
                                                var19 = (var16 & 255) * field_E & 65280;
                                                var16 = (var17 | var18 | var19) >>> 8;
                                                var20 = var50[var11];
                                                var12[var11] = ((var16 & 16711935) * field_i + (var20 & 16711935) * field_b & -16711936) + ((var16 & 65280) * field_i + (var20 & 65280) * field_b & 16711680) >> 8;
                                                break L88;
                                              }
                                            } else {
                                              var17 = field_y >>> 24;
                                              var18 = 256 - var17;
                                              var19 = var50[var11];
                                              var12[var11] = ((var16 & 16711935) * var17 + (var19 & 16711935) * var18 & -16711936) + ((var16 & 65280) * var17 + (var19 & 65280) * var18 & 16711680) >> 8;
                                              break L88;
                                            }
                                          }
                                        }
                                      } else {
                                        var15 = ((hfa) this).field_F[var10];
                                        if (var15 == 0) {
                                          break L88;
                                        } else {
                                          var12[var11] = ((hfa) this).field_G[var15 & 255];
                                          break L88;
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
                                            var15 = ((hfa) this).field_G[((hfa) this).field_F[var10] & 255];
                                            var16 = (var15 & 16711935) * field_i & -16711936;
                                            var17 = (var15 & 65280) * field_i & 16711680;
                                            var12[var11] = ((var16 | var17) >>> 8) + field_g;
                                            break L88;
                                          }
                                        } else {
                                          var15 = ((hfa) this).field_G[((hfa) this).field_F[var10] & 255];
                                          var16 = field_y;
                                          var17 = var15 + var16;
                                          var18 = (var15 & 16711935) + (var16 & 16711935);
                                          var19 = (var18 & 16777472) + (var17 - var18 & 65536);
                                          var12[var11] = var17 - var19 | var19 - (var19 >>> 8);
                                          break L88;
                                        }
                                      } else {
                                        var15 = ((hfa) this).field_G[((hfa) this).field_F[var10] & 255];
                                        var16 = (var15 & 16711680) * field_x & -16777216;
                                        var17 = (var15 & 65280) * field_s & 16711680;
                                        var18 = (var15 & 255) * field_E & 65280;
                                        var12[var11] = (var16 | var17 | var18) >>> 8;
                                        break L88;
                                      }
                                    } else {
                                      var12[var11] = ((hfa) this).field_G[((hfa) this).field_F[var10] & 255];
                                      break L88;
                                    }
                                  }
                                }
                                var9++;
                                continue L87;
                              }
                            }
                          } else {
                            break L86;
                          }
                        } else {
                          break L86;
                        }
                      } else {
                        break L86;
                      }
                    } else {
                      break L86;
                    }
                  }
                  var5++;
                  field_f = field_f + field_o;
                  continue L85;
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
        int var26 = 0;
        int[] var27 = null;
        int[] var28 = null;
        int[] var29 = null;
        int[] var30 = null;
        int stackIn_84_0 = 0;
        int stackIn_126_0 = 0;
        int stackOut_125_0 = 0;
        int stackOut_124_0 = 0;
        int stackOut_83_0 = 0;
        int stackOut_82_0 = 0;
        if (!((hfa) this).field_w.g()) {
          L0: {
            var6 = ((hfa) this).field_w.field_i;
            param0 = param0 + ((hfa) this).field_k;
            param1 = param1 + ((hfa) this).field_n;
            var7 = param1 * var6 + param0;
            var8 = 0;
            var9 = ((hfa) this).field_q;
            var10 = ((hfa) this).field_e;
            var11 = var6 - var10;
            var12 = 0;
            if (param1 >= ((hfa) this).field_w.field_n) {
              break L0;
            } else {
              var13_int = ((hfa) this).field_w.field_n - param1;
              var9 = var9 - var13_int;
              param1 = ((hfa) this).field_w.field_n;
              var8 = var8 + var13_int * var10;
              var7 = var7 + var13_int * var6;
              break L0;
            }
          }
          L1: {
            if (param1 + var9 <= ((hfa) this).field_w.field_p) {
              break L1;
            } else {
              var9 = var9 - (param1 + var9 - ((hfa) this).field_w.field_p);
              break L1;
            }
          }
          L2: {
            if (param0 >= ((hfa) this).field_w.field_H) {
              break L2;
            } else {
              var13_int = ((hfa) this).field_w.field_H - param0;
              var10 = var10 - var13_int;
              param0 = ((hfa) this).field_w.field_H;
              var8 = var8 + var13_int;
              var7 = var7 + var13_int;
              var12 = var12 + var13_int;
              var11 = var11 + var13_int;
              break L2;
            }
          }
          L3: {
            if (param0 + var10 <= ((hfa) this).field_w.field_A) {
              break L3;
            } else {
              var13_int = param0 + var10 - ((hfa) this).field_w.field_A;
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
                  var30 = ((hfa) this).field_w.field_k;
                  var29 = var30;
                  var28 = var29;
                  var27 = var28;
                  var13 = var27;
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
                                        int incrementValue$35 = var8;
                                        var8++;
                                        var20 = ((hfa) this).field_F[incrementValue$35];
                                        if (var20 == 0) {
                                          var7++;
                                          var19++;
                                          continue L7;
                                        } else {
                                          var21 = ((hfa) this).field_G[var20 & 255];
                                          var16 = (var21 & 16711935) * var14 & -16711936;
                                          var17 = (var21 & 65280) * var14 & 16711680;
                                          var21 = ((var16 | var17) >>> 8) + param3;
                                          var22 = var30[var7];
                                          var23 = var21 + var22;
                                          var24 = (var21 & 16711935) + (var22 & 16711935);
                                          var22 = (var24 & 16777472) + (var23 - var24 & 65536);
                                          int incrementValue$36 = var7;
                                          var7++;
                                          var13[incrementValue$36] = var23 - var22 | var22 - (var22 >>> 8);
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
                                      L10: {
                                        int incrementValue$37 = var8;
                                        var8++;
                                        var16 = ((hfa) this).field_F[incrementValue$37];
                                        if (var16 <= 0) {
                                          stackOut_125_0 = 0;
                                          stackIn_126_0 = stackOut_125_0;
                                          break L10;
                                        } else {
                                          stackOut_124_0 = ((hfa) this).field_G[var16];
                                          stackIn_126_0 = stackOut_124_0;
                                          break L10;
                                        }
                                      }
                                      var17 = stackIn_126_0;
                                      var18 = var17 + param3;
                                      var19 = (var17 & 16711935) + (param3 & 16711935);
                                      var20 = (var19 & 16777472) + (var18 - var19 & 65536);
                                      var17 = var18 - var20 | var20 - (var20 >>> 8);
                                      var20 = var30[var7];
                                      var18 = var17 + var20;
                                      var19 = (var17 & 16711935) + (var20 & 16711935);
                                      var20 = (var19 & 16777472) + (var18 - var19 & 65536);
                                      int incrementValue$38 = var7;
                                      var7++;
                                      var13[incrementValue$38] = var18 - var20 | var20 - (var20 >>> 8);
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
                            L11: while (true) {
                              if (var17 >= 0) {
                                break L5;
                              } else {
                                var18 = -var10;
                                L12: while (true) {
                                  if (var18 >= 0) {
                                    var7 = var7 + var11;
                                    var8 = var8 + var12;
                                    var17++;
                                    continue L11;
                                  } else {
                                    int incrementValue$39 = var8;
                                    var8++;
                                    var19 = ((hfa) this).field_F[incrementValue$39];
                                    if (var19 == 0) {
                                      var7++;
                                      var18++;
                                      continue L12;
                                    } else {
                                      var20 = ((hfa) this).field_G[var19 & 255];
                                      var21 = (var20 & 16711680) * var14 & -16777216;
                                      var22 = (var20 & 65280) * var15 & 16711680;
                                      var23 = (var20 & 255) * var16 & 65280;
                                      var20 = (var21 | var22 | var23) >>> 8;
                                      var24 = var30[var7];
                                      var25 = var20 + var24;
                                      var26 = (var20 & 16711935) + (var24 & 16711935);
                                      var24 = (var26 & 16777472) + (var25 - var26 & 65536);
                                      int incrementValue$40 = var7;
                                      var7++;
                                      var13[incrementValue$40] = var25 - var24 | var24 - (var24 >>> 8);
                                      var18++;
                                      continue L12;
                                    }
                                  }
                                }
                              }
                            }
                          }
                        } else {
                          var14 = -var9;
                          L13: while (true) {
                            if (var14 >= 0) {
                              break L5;
                            } else {
                              var15 = -var10;
                              L14: while (true) {
                                if (var15 >= 0) {
                                  var7 = var7 + var11;
                                  var8 = var8 + var12;
                                  var14++;
                                  continue L13;
                                } else {
                                  int incrementValue$41 = var8;
                                  var8++;
                                  var16 = ((hfa) this).field_F[incrementValue$41];
                                  if (var16 == 0) {
                                    var7++;
                                    var15++;
                                    continue L14;
                                  } else {
                                    var17 = ((hfa) this).field_G[var16 & 255];
                                    var18 = var30[var7];
                                    var19 = var17 + var18;
                                    var20 = (var17 & 16711935) + (var18 & 16711935);
                                    var18 = (var20 & 16777472) + (var19 - var20 & 65536);
                                    int incrementValue$42 = var7;
                                    var7++;
                                    var13[incrementValue$42] = var19 - var18 | var18 - (var18 >>> 8);
                                    var15++;
                                    continue L14;
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
                              L15: while (true) {
                                if (var18 >= 0) {
                                  break L5;
                                } else {
                                  var19 = -var10;
                                  L16: while (true) {
                                    if (var19 >= 0) {
                                      var7 = var7 + var11;
                                      var8 = var8 + var12;
                                      var18++;
                                      continue L15;
                                    } else {
                                      int incrementValue$43 = var8;
                                      var8++;
                                      var20 = ((hfa) this).field_F[incrementValue$43];
                                      if (var20 == 0) {
                                        var7++;
                                        var19++;
                                        continue L16;
                                      } else {
                                        var21 = ((hfa) this).field_G[var20 & 255];
                                        var16 = (var21 & 16711935) * var14 & -16711936;
                                        var17 = (var21 & 65280) * var14 & 16711680;
                                        int incrementValue$44 = var7;
                                        var7++;
                                        var13[incrementValue$44] = ((var16 | var17) >>> 8) + param3;
                                        var19++;
                                        continue L16;
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
                            L17: while (true) {
                              if (var16 >= 0) {
                                break L5;
                              } else {
                                var17 = -var10;
                                L18: while (true) {
                                  if (var17 >= 0) {
                                    var7 = var7 + var11;
                                    var8 = var8 + var12;
                                    var16++;
                                    continue L17;
                                  } else {
                                    L19: {
                                      int incrementValue$45 = var8;
                                      var8++;
                                      var18 = ((hfa) this).field_F[incrementValue$45];
                                      if (var18 <= 0) {
                                        stackOut_83_0 = 0;
                                        stackIn_84_0 = stackOut_83_0;
                                        break L19;
                                      } else {
                                        stackOut_82_0 = ((hfa) this).field_G[var18];
                                        stackIn_84_0 = stackOut_82_0;
                                        break L19;
                                      }
                                    }
                                    L20: {
                                      var19 = stackIn_84_0;
                                      var20 = var19 + param3;
                                      var21 = (var19 & 16711935) + (param3 & 16711935);
                                      var22 = (var21 & 16777472) + (var20 - var21 & 65536);
                                      var22 = var20 - var22 | var22 - (var22 >>> 8);
                                      if (var19 != 0) {
                                        break L20;
                                      } else {
                                        if (var14 == 255) {
                                          break L20;
                                        } else {
                                          var19 = var22;
                                          var22 = var30[var7];
                                          var22 = ((var19 & 16711935) * var14 + (var22 & 16711935) * var15 & -16711936) + ((var19 & 65280) * var14 + (var22 & 65280) * var15 & 16711680) >> 8;
                                          break L20;
                                        }
                                      }
                                    }
                                    int incrementValue$46 = var7;
                                    var7++;
                                    var13[incrementValue$46] = var22;
                                    var17++;
                                    continue L18;
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
                            L21: while (true) {
                              if (var19 >= 0) {
                                break L5;
                              } else {
                                var20 = -var10;
                                L22: while (true) {
                                  if (var20 >= 0) {
                                    var7 = var7 + var11;
                                    var8 = var8 + var12;
                                    var19++;
                                    continue L21;
                                  } else {
                                    int incrementValue$47 = var8;
                                    var8++;
                                    var21 = ((hfa) this).field_F[incrementValue$47];
                                    if (var21 == 0) {
                                      var7++;
                                      var20++;
                                      continue L22;
                                    } else {
                                      var22 = ((hfa) this).field_G[var21 & 255];
                                      if (var17 == 255) {
                                        var23 = (var22 & 16711680) * var14 & -16777216;
                                        var24 = (var22 & 65280) * var15 & 16711680;
                                        var25 = (var22 & 255) * var16 & 65280;
                                        int incrementValue$48 = var7;
                                        var7++;
                                        var13[incrementValue$48] = (var23 | var24 | var25) >>> 8;
                                        var20++;
                                        continue L22;
                                      } else {
                                        var23 = (var22 & 16711680) * var14 & -16777216;
                                        var24 = (var22 & 65280) * var15 & 16711680;
                                        var25 = (var22 & 255) * var16 & 65280;
                                        var22 = (var23 | var24 | var25) >>> 8;
                                        var26 = var30[var7];
                                        int incrementValue$49 = var7;
                                        var7++;
                                        var13[incrementValue$49] = ((var22 & 16711935) * var17 + (var26 & 16711935) * var18 & -16711936) + ((var22 & 65280) * var17 + (var26 & 65280) * var18 & 16711680) >> 8;
                                        var20++;
                                        continue L22;
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
                            L23: while (true) {
                              if (var16 >= 0) {
                                break L5;
                              } else {
                                var17 = -var10;
                                L24: while (true) {
                                  if (var17 >= 0) {
                                    var7 = var7 + var11;
                                    var8 = var8 + var12;
                                    var16++;
                                    continue L23;
                                  } else {
                                    int incrementValue$50 = var8;
                                    var8++;
                                    var18 = ((hfa) this).field_F[incrementValue$50];
                                    if (var18 == 0) {
                                      var7++;
                                      var17++;
                                      continue L24;
                                    } else {
                                      var19 = ((hfa) this).field_G[var18 & 255];
                                      var20 = var30[var7];
                                      int incrementValue$51 = var7;
                                      var7++;
                                      var13[incrementValue$51] = ((var19 & 16711935) * var14 + (var20 & 16711935) * var15 & -16711936) + ((var19 & 65280) * var14 + (var20 & 65280) * var15 & 16711680) >> 8;
                                      var17++;
                                      continue L24;
                                    }
                                  }
                                }
                              }
                            }
                          }
                        }
                      } else {
                        var14 = -var9;
                        L25: while (true) {
                          if (var14 >= 0) {
                            break L5;
                          } else {
                            var15 = -var10;
                            L26: while (true) {
                              if (var15 >= 0) {
                                var7 = var7 + var11;
                                var8 = var8 + var12;
                                var14++;
                                continue L25;
                              } else {
                                int incrementValue$52 = var8;
                                var8++;
                                var16 = ((hfa) this).field_F[incrementValue$52];
                                if (var16 == 0) {
                                  var7++;
                                  var15++;
                                  continue L26;
                                } else {
                                  var17 = ((hfa) this).field_G[var16 & 255] | -16777216;
                                  var18 = 255;
                                  var19 = 0;
                                  var20 = var30[var7];
                                  int incrementValue$53 = var7;
                                  var7++;
                                  var13[incrementValue$53] = (((var17 & 16711935) * var18 + (var20 & 16711935) * var19 & -16711936) >> 8) + (((var17 & -16711936) >>> 8) * var18 + ((var20 & -16711936) >>> 8) * var19 & -16711936);
                                  var15++;
                                  continue L26;
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
                            L27: while (true) {
                              if (var18 >= 0) {
                                break L5;
                              } else {
                                var19 = -var10;
                                L28: while (true) {
                                  if (var19 >= 0) {
                                    var7 = var7 + var11;
                                    var8 = var8 + var12;
                                    var18++;
                                    continue L27;
                                  } else {
                                    int incrementValue$54 = var8;
                                    var8++;
                                    var20 = ((hfa) this).field_G[((hfa) this).field_F[incrementValue$54] & 255];
                                    var16 = (var20 & 16711935) * var14 & -16711936;
                                    var17 = (var20 & 65280) * var14 & 16711680;
                                    int incrementValue$55 = var7;
                                    var7++;
                                    var13[incrementValue$55] = ((var16 | var17) >>> 8) + param3;
                                    var19++;
                                    continue L28;
                                  }
                                }
                              }
                            }
                          }
                        } else {
                          var14 = -var9;
                          L29: while (true) {
                            if (var14 >= 0) {
                              break L5;
                            } else {
                              var15 = -var10;
                              L30: while (true) {
                                if (var15 >= 0) {
                                  var7 = var7 + var11;
                                  var8 = var8 + var12;
                                  var14++;
                                  continue L29;
                                } else {
                                  int incrementValue$56 = var8;
                                  var8++;
                                  var16 = ((hfa) this).field_G[((hfa) this).field_F[incrementValue$56] & 255];
                                  var17 = var16 + param3;
                                  var18 = (var16 & 16711935) + (param3 & 16711935);
                                  var19 = (var18 & 16777472) + (var17 - var18 & 65536);
                                  int incrementValue$57 = var7;
                                  var7++;
                                  var13[incrementValue$57] = var17 - var19 | var19 - (var19 >>> 8);
                                  var15++;
                                  continue L30;
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
                        L31: while (true) {
                          if (var17 >= 0) {
                            break L5;
                          } else {
                            var18 = -var10;
                            L32: while (true) {
                              if (var18 >= 0) {
                                var7 = var7 + var11;
                                var8 = var8 + var12;
                                var17++;
                                continue L31;
                              } else {
                                int incrementValue$58 = var8;
                                var8++;
                                var19 = ((hfa) this).field_G[((hfa) this).field_F[incrementValue$58] & 255];
                                var20 = (var19 & 16711680) * var14 & -16777216;
                                var21 = (var19 & 65280) * var15 & 16711680;
                                var22 = (var19 & 255) * var16 & 65280;
                                int incrementValue$59 = var7;
                                var7++;
                                var13[incrementValue$59] = (var20 | var21 | var22) >>> 8;
                                var18++;
                                continue L32;
                              }
                            }
                          }
                        }
                      }
                    } else {
                      var14 = -var9;
                      L33: while (true) {
                        if (var14 >= 0) {
                          break L4;
                        } else {
                          var15 = var7 + var10 - 3;
                          L34: while (true) {
                            if (var7 >= var15) {
                              var15 += 3;
                              L35: while (true) {
                                if (var7 >= var15) {
                                  var7 = var7 + var11;
                                  var8 = var8 + var12;
                                  var14++;
                                  continue L33;
                                } else {
                                  int incrementValue$60 = var7;
                                  var7++;
                                  int incrementValue$61 = var8;
                                  var8++;
                                  var13[incrementValue$60] = ((hfa) this).field_G[((hfa) this).field_F[incrementValue$61] & 255];
                                  continue L35;
                                }
                              }
                            } else {
                              int incrementValue$62 = var7;
                              var7++;
                              int incrementValue$63 = var8;
                              var8++;
                              var13[incrementValue$62] = ((hfa) this).field_G[((hfa) this).field_F[incrementValue$63] & 255];
                              int incrementValue$64 = var7;
                              var7++;
                              int incrementValue$65 = var8;
                              var8++;
                              var13[incrementValue$64] = ((hfa) this).field_G[((hfa) this).field_F[incrementValue$65] & 255];
                              int incrementValue$66 = var7;
                              var7++;
                              int incrementValue$67 = var8;
                              var8++;
                              var13[incrementValue$66] = ((hfa) this).field_G[((hfa) this).field_F[incrementValue$67] & 255];
                              int incrementValue$68 = var7;
                              var7++;
                              int incrementValue$69 = var8;
                              var8++;
                              var13[incrementValue$68] = ((hfa) this).field_G[((hfa) this).field_F[incrementValue$69] & 255];
                              continue L34;
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

    final void a(int param0, int param1, int param2, int param3, int[] param4, int param5, int param6) {
        throw new IllegalStateException();
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
        int var33 = 0;
        int[] var34 = null;
        int[] var35 = null;
        int[] var36 = null;
        int[] var37 = null;
        int stackIn_44_0 = 0;
        int stackIn_95_0 = 0;
        int stackIn_140_0 = 0;
        int stackOut_139_0 = 0;
        int stackOut_138_0 = 0;
        int stackOut_94_0 = 0;
        int stackOut_93_0 = 0;
        int stackOut_43_0 = 0;
        int stackOut_42_0 = 0;
        if (!((hfa) this).field_w.g()) {
          L0: {
            if (param2 <= 0) {
              break L0;
            } else {
              if (param3 > 0) {
                L1: {
                  var9 = 0;
                  var10 = 0;
                  var11 = ((hfa) this).field_w.field_i;
                  var12 = ((hfa) this).field_k + ((hfa) this).field_e + ((hfa) this).field_D;
                  var13 = ((hfa) this).field_n + ((hfa) this).field_q + ((hfa) this).field_j;
                  var14 = (var12 << 16) / param2;
                  var15 = (var13 << 16) / param3;
                  if (((hfa) this).field_k <= 0) {
                    break L1;
                  } else {
                    var16 = ((((hfa) this).field_k << 16) + var14 - 1) / var14;
                    param0 = param0 + var16;
                    var9 = var9 + (var16 * var14 - (((hfa) this).field_k << 16));
                    break L1;
                  }
                }
                L2: {
                  if (((hfa) this).field_n <= 0) {
                    break L2;
                  } else {
                    var16 = ((((hfa) this).field_n << 16) + var15 - 1) / var15;
                    param1 = param1 + var16;
                    var10 = var10 + (var16 * var15 - (((hfa) this).field_n << 16));
                    break L2;
                  }
                }
                L3: {
                  if (((hfa) this).field_e >= var12) {
                    break L3;
                  } else {
                    param2 = ((((hfa) this).field_e << 16) - var9 + var14 - 1) / var14;
                    break L3;
                  }
                }
                L4: {
                  if (((hfa) this).field_q >= var13) {
                    break L4;
                  } else {
                    param3 = ((((hfa) this).field_q << 16) - var10 + var15 - 1) / var15;
                    break L4;
                  }
                }
                L5: {
                  var16 = param0 + param1 * var11;
                  var17 = var11 - param2;
                  if (param1 + param3 <= ((hfa) this).field_w.field_p) {
                    break L5;
                  } else {
                    param3 = param3 - (param1 + param3 - ((hfa) this).field_w.field_p);
                    break L5;
                  }
                }
                L6: {
                  if (param1 >= ((hfa) this).field_w.field_n) {
                    break L6;
                  } else {
                    var18_int = ((hfa) this).field_w.field_n - param1;
                    param3 = param3 - var18_int;
                    var16 = var16 + var18_int * var11;
                    var10 = var10 + var15 * var18_int;
                    break L6;
                  }
                }
                L7: {
                  if (param0 + param2 <= ((hfa) this).field_w.field_A) {
                    break L7;
                  } else {
                    var18_int = param0 + param2 - ((hfa) this).field_w.field_A;
                    param2 = param2 - var18_int;
                    var17 = var17 + var18_int;
                    break L7;
                  }
                }
                L8: {
                  if (param0 >= ((hfa) this).field_w.field_H) {
                    break L8;
                  } else {
                    var18_int = ((hfa) this).field_w.field_H - param0;
                    param2 = param2 - var18_int;
                    var16 = var16 + var18_int;
                    var9 = var9 + var14 * var18_int;
                    var17 = var17 + var18_int;
                    break L8;
                  }
                }
                L9: {
                  var37 = ((hfa) this).field_w.field_k;
                  var36 = var37;
                  var35 = var36;
                  var34 = var35;
                  var18 = var34;
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
                                    var25 = (var10 >> 16) * ((hfa) this).field_e;
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
                                          var27 = ((hfa) this).field_F[(var9 >> 16) + var25];
                                          if (var27 == 0) {
                                            var16++;
                                            break L12;
                                          } else {
                                            var28 = ((hfa) this).field_G[var27 & 255];
                                            var21 = (var28 & 16711935) * var19 & -16711936;
                                            var22 = (var28 & 65280) * var19 & 16711680;
                                            var28 = ((var21 | var22) >>> 8) + param5;
                                            var29 = var37[var16];
                                            var30 = var28 + var29;
                                            var31 = (var28 & 16711935) + (var29 & 16711935);
                                            var29 = (var31 & 16777472) + (var30 - var31 & 65536);
                                            int incrementValue$14 = var16;
                                            var16++;
                                            var18[incrementValue$14] = var30 - var29 | var29 - (var29 >>> 8);
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
                                  var21 = (var10 >> 16) * ((hfa) this).field_e;
                                  var22 = -param2;
                                  L14: while (true) {
                                    if (var22 >= 0) {
                                      var10 = var10 + var15;
                                      var9 = var19;
                                      var16 = var16 + var17;
                                      var20++;
                                      continue L13;
                                    } else {
                                      L15: {
                                        var23 = ((hfa) this).field_F[(var9 >> 16) + var21];
                                        if (var23 <= 0) {
                                          stackOut_139_0 = 0;
                                          stackIn_140_0 = stackOut_139_0;
                                          break L15;
                                        } else {
                                          stackOut_138_0 = ((hfa) this).field_G[var23];
                                          stackIn_140_0 = stackOut_138_0;
                                          break L15;
                                        }
                                      }
                                      var24 = stackIn_140_0;
                                      var25 = var24 + param5;
                                      var26 = (var24 & 16711935) + (param5 & 16711935);
                                      var27 = (var26 & 16777472) + (var25 - var26 & 65536);
                                      var24 = var25 - var27 | var27 - (var27 >>> 8);
                                      var27 = var37[var16];
                                      var25 = var24 + var27;
                                      var26 = (var24 & 16711935) + (var27 & 16711935);
                                      var27 = (var26 & 16777472) + (var25 - var26 & 65536);
                                      int incrementValue$15 = var16;
                                      var16++;
                                      var18[incrementValue$15] = var25 - var27 | var27 - (var27 >>> 8);
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
                            L16: while (true) {
                              if (var23 >= 0) {
                                break L9;
                              } else {
                                var24 = (var10 >> 16) * ((hfa) this).field_e;
                                var25 = -param2;
                                L17: while (true) {
                                  if (var25 >= 0) {
                                    var10 = var10 + var15;
                                    var9 = var19;
                                    var16 = var16 + var17;
                                    var23++;
                                    continue L16;
                                  } else {
                                    L18: {
                                      var26 = ((hfa) this).field_F[(var9 >> 16) + var24];
                                      if (var26 == 0) {
                                        var16++;
                                        break L18;
                                      } else {
                                        var27 = ((hfa) this).field_G[var26 & 255];
                                        var28 = (var27 & 16711680) * var20 & -16777216;
                                        var29 = (var27 & 65280) * var21 & 16711680;
                                        var30 = (var27 & 255) * var22 & 65280;
                                        var27 = (var28 | var29 | var30) >>> 8;
                                        var31 = var37[var16];
                                        var32 = var27 + var31;
                                        var33 = (var27 & 16711935) + (var31 & 16711935);
                                        var31 = (var33 & 16777472) + (var32 - var33 & 65536);
                                        int incrementValue$16 = var16;
                                        var16++;
                                        var18[incrementValue$16] = var32 - var31 | var31 - (var31 >>> 8);
                                        break L18;
                                      }
                                    }
                                    var9 = var9 + var14;
                                    var25++;
                                    continue L17;
                                  }
                                }
                              }
                            }
                          }
                        } else {
                          var19 = var9;
                          var20 = -param3;
                          L19: while (true) {
                            if (var20 >= 0) {
                              break L9;
                            } else {
                              var21 = (var10 >> 16) * ((hfa) this).field_e;
                              var22 = -param2;
                              L20: while (true) {
                                if (var22 >= 0) {
                                  var10 = var10 + var15;
                                  var9 = var19;
                                  var16 = var16 + var17;
                                  var20++;
                                  continue L19;
                                } else {
                                  L21: {
                                    var23 = ((hfa) this).field_F[(var9 >> 16) + var21];
                                    if (var23 == 0) {
                                      var16++;
                                      break L21;
                                    } else {
                                      var24 = ((hfa) this).field_G[var23 & 255];
                                      var25 = var37[var16];
                                      var26 = var24 + var25;
                                      var27 = (var24 & 16711935) + (var25 & 16711935);
                                      var25 = (var27 & 16777472) + (var26 - var27 & 65536);
                                      int incrementValue$17 = var16;
                                      var16++;
                                      var18[incrementValue$17] = var26 - var25 | var25 - (var25 >>> 8);
                                      break L21;
                                    }
                                  }
                                  var9 = var9 + var14;
                                  var22++;
                                  continue L20;
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
                              L22: while (true) {
                                if (var24 >= 0) {
                                  break L9;
                                } else {
                                  var25 = (var10 >> 16) * ((hfa) this).field_e;
                                  var26 = -param2;
                                  L23: while (true) {
                                    if (var26 >= 0) {
                                      var10 = var10 + var15;
                                      var9 = var23;
                                      var16 = var16 + var17;
                                      var24++;
                                      continue L22;
                                    } else {
                                      L24: {
                                        var27 = ((hfa) this).field_F[(var9 >> 16) + var25];
                                        if (var27 == 0) {
                                          var16++;
                                          break L24;
                                        } else {
                                          var28 = ((hfa) this).field_G[var27 & 255];
                                          var21 = (var28 & 16711935) * var19 & -16711936;
                                          var22 = (var28 & 65280) * var19 & 16711680;
                                          int incrementValue$18 = var16;
                                          var16++;
                                          var18[incrementValue$18] = ((var21 | var22) >>> 8) + param5;
                                          break L24;
                                        }
                                      }
                                      var9 = var9 + var14;
                                      var26++;
                                      continue L23;
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
                            L25: while (true) {
                              if (var22 >= 0) {
                                break L9;
                              } else {
                                var23 = (var10 >> 16) * ((hfa) this).field_e;
                                var24 = -param2;
                                L26: while (true) {
                                  if (var24 >= 0) {
                                    var10 = var10 + var15;
                                    var9 = var19;
                                    var16 = var16 + var17;
                                    var22++;
                                    continue L25;
                                  } else {
                                    L27: {
                                      var25 = ((hfa) this).field_F[(var9 >> 16) + var23];
                                      if (var25 <= 0) {
                                        stackOut_94_0 = 0;
                                        stackIn_95_0 = stackOut_94_0;
                                        break L27;
                                      } else {
                                        stackOut_93_0 = ((hfa) this).field_G[var25];
                                        stackIn_95_0 = stackOut_93_0;
                                        break L27;
                                      }
                                    }
                                    L28: {
                                      var26 = stackIn_95_0;
                                      var27 = var26 + param5;
                                      var28 = (var26 & 16711935) + (param5 & 16711935);
                                      var29 = (var28 & 16777472) + (var27 - var28 & 65536);
                                      var29 = var27 - var29 | var29 - (var29 >>> 8);
                                      if (var26 != 0) {
                                        break L28;
                                      } else {
                                        if (var20 == 255) {
                                          break L28;
                                        } else {
                                          var26 = var29;
                                          var29 = var37[var16];
                                          var29 = ((var26 & 16711935) * var20 + (var29 & 16711935) * var21 & -16711936) + ((var26 & 65280) * var20 + (var29 & 65280) * var21 & 16711680) >> 8;
                                          break L28;
                                        }
                                      }
                                    }
                                    int incrementValue$19 = var16;
                                    var16++;
                                    var18[incrementValue$19] = var29;
                                    var9 = var9 + var14;
                                    var24++;
                                    continue L26;
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
                            L29: while (true) {
                              if (var25 >= 0) {
                                break L9;
                              } else {
                                var26 = (var10 >> 16) * ((hfa) this).field_e;
                                var27 = -param2;
                                L30: while (true) {
                                  if (var27 >= 0) {
                                    var10 = var10 + var15;
                                    var9 = var19;
                                    var16 = var16 + var17;
                                    var25++;
                                    continue L29;
                                  } else {
                                    L31: {
                                      var28 = ((hfa) this).field_F[(var9 >> 16) + var26];
                                      if (var28 == 0) {
                                        var16++;
                                        break L31;
                                      } else {
                                        var29 = ((hfa) this).field_G[var28 & 255];
                                        if (var23 == 255) {
                                          var30 = (var29 & 16711680) * var20 & -16777216;
                                          var31 = (var29 & 65280) * var21 & 16711680;
                                          var32 = (var29 & 255) * var22 & 65280;
                                          int incrementValue$20 = var16;
                                          var16++;
                                          var18[incrementValue$20] = (var30 | var31 | var32) >>> 8;
                                          break L31;
                                        } else {
                                          var30 = (var29 & 16711680) * var20 & -16777216;
                                          var31 = (var29 & 65280) * var21 & 16711680;
                                          var32 = (var29 & 255) * var22 & 65280;
                                          var29 = (var30 | var31 | var32) >>> 8;
                                          var33 = var37[var16];
                                          int incrementValue$21 = var16;
                                          var16++;
                                          var18[incrementValue$21] = ((var29 & 16711935) * var23 + (var33 & 16711935) * var24 & -16711936) + ((var29 & 65280) * var23 + (var33 & 65280) * var24 & 16711680) >> 8;
                                          var9 = var9 + var14;
                                          var27++;
                                          continue L30;
                                        }
                                      }
                                    }
                                    var9 = var9 + var14;
                                    var27++;
                                    continue L30;
                                  }
                                }
                              }
                            }
                          } else {
                            var20 = param5 >>> 24;
                            var21 = 256 - var20;
                            var22 = -param3;
                            L32: while (true) {
                              if (var22 >= 0) {
                                break L9;
                              } else {
                                var23 = (var10 >> 16) * ((hfa) this).field_e;
                                var24 = -param2;
                                L33: while (true) {
                                  if (var24 >= 0) {
                                    var10 = var10 + var15;
                                    var9 = var19;
                                    var16 = var16 + var17;
                                    var22++;
                                    continue L32;
                                  } else {
                                    L34: {
                                      var25 = ((hfa) this).field_F[(var9 >> 16) + var23];
                                      if (var25 == 0) {
                                        var16++;
                                        break L34;
                                      } else {
                                        var26 = ((hfa) this).field_G[var25 & 255];
                                        var27 = var37[var16];
                                        int incrementValue$22 = var16;
                                        var16++;
                                        var18[incrementValue$22] = ((var26 & 16711935) * var20 + (var27 & 16711935) * var21 & -16711936) + ((var26 & 65280) * var20 + (var27 & 65280) * var21 & 16711680) >> 8;
                                        break L34;
                                      }
                                    }
                                    var9 = var9 + var14;
                                    var24++;
                                    continue L33;
                                  }
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
                            var21 = (var10 >> 16) * ((hfa) this).field_e;
                            var22 = -param2;
                            L36: while (true) {
                              if (var22 >= 0) {
                                var10 = var10 + var15;
                                var9 = var19;
                                var16 = var16 + var17;
                                var20++;
                                continue L35;
                              } else {
                                L37: {
                                  var23 = ((hfa) this).field_F[(var9 >> 16) + var21];
                                  if (var23 == 0) {
                                    var16++;
                                    break L37;
                                  } else {
                                    int incrementValue$23 = var16;
                                    var16++;
                                    var18[incrementValue$23] = ((hfa) this).field_G[var23 & 255];
                                    break L37;
                                  }
                                }
                                var9 = var9 + var14;
                                var22++;
                                continue L36;
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
                            L38: while (true) {
                              if (var24 >= 0) {
                                break L9;
                              } else {
                                var25 = (var10 >> 16) * ((hfa) this).field_e;
                                var26 = -param2;
                                L39: while (true) {
                                  if (var26 >= 0) {
                                    var10 = var10 + var15;
                                    var9 = var23;
                                    var16 = var16 + var17;
                                    var24++;
                                    continue L38;
                                  } else {
                                    var27 = ((hfa) this).field_G[((hfa) this).field_F[(var9 >> 16) + var25] & 255];
                                    var21 = (var27 & 16711935) * var19 & -16711936;
                                    var22 = (var27 & 65280) * var19 & 16711680;
                                    int incrementValue$24 = var16;
                                    var16++;
                                    var18[incrementValue$24] = ((var21 | var22) >>> 8) + param5;
                                    var9 = var9 + var14;
                                    var26++;
                                    continue L39;
                                  }
                                }
                              }
                            }
                          }
                        } else {
                          var19 = var9;
                          var20 = -param3;
                          L40: while (true) {
                            if (var20 >= 0) {
                              break L9;
                            } else {
                              var21 = (var10 >> 16) * ((hfa) this).field_e;
                              var22 = -param2;
                              L41: while (true) {
                                if (var22 >= 0) {
                                  var10 = var10 + var15;
                                  var9 = var19;
                                  var16 = var16 + var17;
                                  var20++;
                                  continue L40;
                                } else {
                                  L42: {
                                    var23 = ((hfa) this).field_F[(var9 >> 16) + var21];
                                    if (var23 <= 0) {
                                      stackOut_43_0 = 0;
                                      stackIn_44_0 = stackOut_43_0;
                                      break L42;
                                    } else {
                                      stackOut_42_0 = ((hfa) this).field_G[var23];
                                      stackIn_44_0 = stackOut_42_0;
                                      break L42;
                                    }
                                  }
                                  var24 = stackIn_44_0;
                                  var25 = var24 + param5;
                                  var26 = (var24 & 16711935) + (param5 & 16711935);
                                  var27 = (var26 & 16777472) + (var25 - var26 & 65536);
                                  int incrementValue$25 = var16;
                                  var16++;
                                  var18[incrementValue$25] = var25 - var27 | var27 - (var27 >>> 8);
                                  var9 = var9 + var14;
                                  var22++;
                                  continue L41;
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
                        L43: while (true) {
                          if (var23 >= 0) {
                            break L9;
                          } else {
                            var24 = (var10 >> 16) * ((hfa) this).field_e;
                            var25 = -param2;
                            L44: while (true) {
                              if (var25 >= 0) {
                                var10 = var10 + var15;
                                var9 = var22;
                                var16 = var16 + var17;
                                var23++;
                                continue L43;
                              } else {
                                var26 = ((hfa) this).field_G[((hfa) this).field_F[(var9 >> 16) + var24] & 255];
                                var27 = (var26 & 16711680) * var19 & -16777216;
                                var28 = (var26 & 65280) * var20 & 16711680;
                                var29 = (var26 & 255) * var21 & 65280;
                                int incrementValue$26 = var16;
                                var16++;
                                var18[incrementValue$26] = (var27 | var28 | var29) >>> 8;
                                var9 = var9 + var14;
                                var25++;
                                continue L44;
                              }
                            }
                          }
                        }
                      }
                    } else {
                      var19 = var9;
                      var20 = -param3;
                      L45: while (true) {
                        if (var20 >= 0) {
                          break L0;
                        } else {
                          var21 = (var10 >> 16) * ((hfa) this).field_e;
                          var22 = -param2;
                          L46: while (true) {
                            if (var22 >= 0) {
                              var10 = var10 + var15;
                              var9 = var19;
                              var16 = var16 + var17;
                              var20++;
                              continue L45;
                            } else {
                              int incrementValue$27 = var16;
                              var16++;
                              var18[incrementValue$27] = ((hfa) this).field_G[((hfa) this).field_F[(var9 >> 16) + var21] & 255];
                              var9 = var9 + var14;
                              var22++;
                              continue L46;
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

    hfa(sob param0, byte[] param1, int[] param2, int param3, int param4) {
        super(param0, param3, param4);
        ((hfa) this).field_F = param1;
        ((hfa) this).field_G = param2;
    }
}
