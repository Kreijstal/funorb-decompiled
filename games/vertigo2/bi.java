/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bi {
    static int[] field_l;
    static int field_f;
    private static int[] field_k;
    static int field_e;
    static int field_i;
    static int field_j;
    private static int[] field_h;
    static int[] field_a;
    private static int[] field_g;
    static int field_d;
    static int[] field_b;
    static int field_c;

    final static void e(int param0, int param1, int param2, int param3, int param4) {
        bi.b(param0, param1, param2, param4);
        bi.b(param0, param1 + param3 - 1, param2, param4);
        bi.e(param0, param1, param3, param4);
        bi.e(param0 + param2 - 1, param1, param3, param4);
    }

    private final static void a(int[] param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8) {
        int incrementValue$0 = 0;
        int incrementValue$1 = 0;
        int incrementValue$2 = 0;
        int incrementValue$3 = 0;
        int incrementValue$4 = 0;
        int incrementValue$5 = 0;
        int incrementValue$6 = 0;
        int incrementValue$7 = 0;
        int incrementValue$8 = 0;
        int[] stackIn_38_0 = null;
        int stackIn_38_1 = 0;
        int[] stackIn_39_0 = null;
        int stackIn_39_1 = 0;
        int stackIn_39_2 = 0;
        int[] stackIn_41_0 = null;
        int stackIn_41_1 = 0;
        int[] stackIn_42_0 = null;
        int stackIn_42_1 = 0;
        int stackIn_42_2 = 0;
        int[] stackIn_44_0 = null;
        int stackIn_44_1 = 0;
        int[] stackIn_45_0 = null;
        int stackIn_45_1 = 0;
        int stackIn_45_2 = 0;
        int[] var9;
        int[] var10;
        int[] var11;
        int var12;
        int var13;
        int var14;
        int var15;
        int var16;
        int var17;
        int var18;
        int var19;
        int var20;
        int var21;
        int var22;
        int var23;
        int[] var24;
        int[] var25;
        int[] var26;
        int[] var27;
        int[] var28;
        int[] var29;
        L0: {
          L1: {
            if (field_k == null) {
              break L1;
            } else {
              if (field_k.length >= param8) {
                break L0;
              } else {
                break L1;
              }
            }
          }
          field_k = new int[param8];
          field_g = new int[param8];
          field_h = new int[param8];
          break L0;
        }
        L2: {
          var27 = field_k;
          var24 = var27;
          var9 = var24;
          var28 = field_g;
          var25 = var28;
          var10 = var25;
          var29 = field_h;
          var26 = var29;
          var11 = var26;
          qq.a(var27, 0, param8);
          qq.a(var28, 0, param8);
          qq.a(var29, 0, param8);
          var12 = 16384 / (2 * param3 + 1);
          var13 = param4 - param3;
          if (var13 >= 0) {
            break L2;
          } else {
            var13 = 0;
            break L2;
          }
        }
        L3: {
          var14 = param7 + var13 * field_e;
          var15 = param4 + param3;
          var16 = 0;
          if (var15 < field_j) {
            break L3;
          } else {
            var16 = var15 - field_j + 1;
            var15 = field_j - 1;
            break L3;
          }
        }
        var17 = var15 - var13 + 1;
        L4: while (true) {
          if (var13 > var15) {
            var14 = var14 + var16 * field_e;
            var18 = 0;
            L5: while (true) {
              if (var18 >= param8) {
                L6: {
                  param2 = param2 + param6;
                  var13 = 1 - param5;
                  var18 = 1 + param3 - param5 - param4;
                  if (0 >= var18) {
                    break L6;
                  } else {
                    var18 = 0;
                    break L6;
                  }
                }
                L7: {
                  var19 = param7 + (param4 - param3) * field_e;
                  if (var13 >= var18) {
                    break L7;
                  } else {
                    var19 = var19 + (var18 - var13) * field_e;
                    break L7;
                  }
                }
                L8: while (true) {
                  if (var13 >= var18) {
                    L9: {
                      var18 = field_j - param4 - param5 - param3;
                      if (0 >= var18) {
                        break L9;
                      } else {
                        var18 = 0;
                        break L9;
                      }
                    }
                    L10: while (true) {
                      if (var13 >= var18) {
                        L11: while (true) {
                          if (var13 >= 0) {
                            return;
                          } else {
                            var20 = 0;
                            L12: while (true) {
                              if (var20 >= param8) {
                                var19 = var19 + param6;
                                var17--;
                                var20 = 0;
                                L13: while (true) {
                                  if (var20 >= param8) {
                                    param2 = param2 + param6;
                                    var13++;
                                    continue L11;
                                  } else {
                                    L14: {
                                      var21 = var27[var20] / var17;
                                      var22 = var28[var20] / var17;
                                      var23 = var29[var20] / var17;
                                      if (var21 >= 0) {
                                        if (var21 <= 255) {
                                          break L14;
                                        } else {
                                          var21 = 255;
                                          break L14;
                                        }
                                      } else {
                                        var21 = 0;
                                        break L14;
                                      }
                                    }
                                    L15: {
                                      if (var22 >= 0) {
                                        if (var22 <= 255) {
                                          break L15;
                                        } else {
                                          var22 = 255;
                                          break L15;
                                        }
                                      } else {
                                        var22 = 0;
                                        break L15;
                                      }
                                    }
                                    L16: {
                                      if (var23 >= 0) {
                                        if (var23 <= 255) {
                                          break L16;
                                        } else {
                                          var23 = 255;
                                          break L16;
                                        }
                                      } else {
                                        var23 = 0;
                                        break L16;
                                      }
                                    }
                                    incrementValue$0 = param2;
                                    param2++;
                                    param0[incrementValue$0] = (var21 << 16) + (var22 << 8) + var23;
                                    var20++;
                                    continue L13;
                                  }
                                }
                              } else {
                                incrementValue$1 = var19;
                                var19++;
                                param1 = param0[incrementValue$1];
                                var9[var20] = var9[var20] - (param1 >> 16 & 255);
                                var10[var20] = var10[var20] - (param1 >> 8 & 255);
                                var11[var20] = var11[var20] - (param1 & 255);
                                var20++;
                                continue L12;
                              }
                            }
                          }
                        }
                      } else {
                        var20 = 0;
                        L17: while (true) {
                          if (var20 >= param8) {
                            var19 = var19 + param6;
                            var20 = 0;
                            L18: while (true) {
                              if (var20 >= param8) {
                                var14 = var14 + param6;
                                var20 = 0;
                                L19: while (true) {
                                  if (var20 >= param8) {
                                    param2 = param2 + param6;
                                    var13++;
                                    continue L10;
                                  } else {
                                    L20: {
                                      var21 = var27[var20] * var12 >> 14;
                                      var22 = var28[var20] * var12 >> 14;
                                      var23 = var29[var20] * var12 >> 14;
                                      if (var21 <= 255) {
                                        break L20;
                                      } else {
                                        var21 = 255;
                                        break L20;
                                      }
                                    }
                                    L21: {
                                      if (var22 <= 255) {
                                        break L21;
                                      } else {
                                        var22 = 255;
                                        break L21;
                                      }
                                    }
                                    L22: {
                                      if (var23 <= 255) {
                                        break L22;
                                      } else {
                                        var23 = 255;
                                        break L22;
                                      }
                                    }
                                    incrementValue$2 = param2;
                                    param2++;
                                    param0[incrementValue$2] = (var21 << 16) + (var22 << 8) + var23;
                                    var20++;
                                    continue L19;
                                  }
                                }
                              } else {
                                incrementValue$3 = var14;
                                var14++;
                                param1 = param0[incrementValue$3];
                                var9[var20] = var9[var20] + (param1 >> 16 & 255);
                                var10[var20] = var10[var20] + (param1 >> 8 & 255);
                                var11[var20] = var11[var20] + (param1 & 255);
                                var20++;
                                continue L18;
                              }
                            }
                          } else {
                            L23: {
                              incrementValue$4 = var19;
                              var19++;
                              param1 = param0[incrementValue$4];
                              var21 = var27[var20] - (param1 >> 16 & 255);
                              stackIn_38_0 = (int[]) (var9);

                              stackIn_38_1 = var20;

                              if (var21 >= 0) {
                                stackIn_39_0 = (int[]) ((Object) stackIn_38_0);
                                stackIn_39_1 = stackIn_38_1;
                                stackIn_39_2 = var21;
                                break L23;
                              } else {
                                stackIn_39_0 = (int[]) ((Object) stackIn_38_0);
                                stackIn_39_1 = stackIn_38_1;
                                stackIn_39_2 = 0;
                                break L23;
                              }
                            }
                            L24: {
                              stackIn_39_0[stackIn_39_1] = stackIn_39_2;
                              var21 = var28[var20] - (param1 >> 8 & 255);
                              stackIn_41_0 = (int[]) (var10);

                              stackIn_41_1 = var20;

                              if (var21 >= 0) {
                                stackIn_42_0 = (int[]) ((Object) stackIn_41_0);
                                stackIn_42_1 = stackIn_41_1;
                                stackIn_42_2 = var21;
                                break L24;
                              } else {
                                stackIn_42_0 = (int[]) ((Object) stackIn_41_0);
                                stackIn_42_1 = stackIn_41_1;
                                stackIn_42_2 = 0;
                                break L24;
                              }
                            }
                            L25: {
                              stackIn_42_0[stackIn_42_1] = stackIn_42_2;
                              var21 = var29[var20] - (param1 & 255);
                              stackIn_44_0 = (int[]) (var11);

                              stackIn_44_1 = var20;

                              if (var21 >= 0) {
                                stackIn_45_0 = (int[]) ((Object) stackIn_44_0);
                                stackIn_45_1 = stackIn_44_1;
                                stackIn_45_2 = var21;
                                break L25;
                              } else {
                                stackIn_45_0 = (int[]) ((Object) stackIn_44_0);
                                stackIn_45_1 = stackIn_44_1;
                                stackIn_45_2 = 0;
                                break L25;
                              }
                            }
                            stackIn_45_0[stackIn_45_1] = stackIn_45_2;
                            var20++;
                            continue L17;
                          }
                        }
                      }
                    }
                  } else {
                    L26: {
                      if (var13 + param4 + param5 + param3 >= field_c) {
                        var14 = var14 + field_e;
                        break L26;
                      } else {
                        var20 = 0;
                        L27: while (true) {
                          if (var20 >= param8) {
                            var14 = var14 + param6;
                            var17++;
                            break L26;
                          } else {
                            incrementValue$5 = var14;
                            var14++;
                            param1 = param0[incrementValue$5];
                            var9[var20] = var9[var20] + (param1 >> 16 & 255);
                            var10[var20] = var10[var20] + (param1 >> 8 & 255);
                            var11[var20] = var11[var20] + (param1 & 255);
                            var20++;
                            continue L27;
                          }
                        }
                      }
                    }
                    var20 = 0;
                    L28: while (true) {
                      if (var20 >= param8) {
                        param2 = param2 + param6;
                        var13++;
                        continue L8;
                      } else {
                        var21 = var27[var20] / var17;
                        var22 = var28[var20] / var17;
                        var23 = var29[var20] / var17;
                        incrementValue$6 = param2;
                        param2++;
                        param0[incrementValue$6] = (var21 << 16) + (var22 << 8) + var23;
                        var20++;
                        continue L28;
                      }
                    }
                  }
                }
              } else {
                incrementValue$7 = param2;
                param2++;
                param0[incrementValue$7] = (var27[var18] / var17 << 16) + (var28[var18] / var17 << 8) + var29[var18] / var17;
                var18++;
                continue L5;
              }
            }
          } else {
            var18 = 0;
            L29: while (true) {
              if (var18 >= param8) {
                var14 = var14 + param6;
                var13++;
                continue L4;
              } else {
                incrementValue$8 = var14;
                var14++;
                param1 = param0[incrementValue$8];
                var9[var18] = var9[var18] + (param1 >> 16 & 255);
                var10[var18] = var10[var18] + (param1 >> 8 & 255);
                var11[var18] = var11[var18] + (param1 & 255);
                var18++;
                continue L29;
              }
            }
          }
        }
    }

    private final static void a(int param0, int[] param1, int param2, int param3, int param4, int param5) {
        while (param4 < 0) {
            param2 = param0 + param3 - 7;
            while (param0 < param2) {
                param1[param0] = (param1[param0] & 16711422) >> 1;
                param0++;
                param1[param0] = (param1[param0] & 16711422) >> 1;
                param0++;
                param1[param0] = (param1[param0] & 16711422) >> 1;
                param0++;
                param1[param0] = (param1[param0] & 16711422) >> 1;
                param0++;
                param1[param0] = (param1[param0] & 16711422) >> 1;
                param0++;
                param1[param0] = (param1[param0] & 16711422) >> 1;
                param0++;
                param1[param0] = (param1[param0] & 16711422) >> 1;
                param0++;
                param1[param0] = (param1[param0] & 16711422) >> 1;
                param0++;
            }
            param2 += 7;
            while (param0 < param2) {
                param1[param0] = (param1[param0] & 16711422) >> 1;
                param0++;
            }
            param0 = param0 + param5;
            param4++;
        }
    }

    private final static void a(int param0, int param1, int param2, int param3, int param4, int param5) {
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int incrementValue$0 = 0;
        int var6 = 0;
        int var7 = 65536 / param3;
        if (param0 < field_d) {
            param2 = param2 - (field_d - param0);
            param0 = field_d;
        }
        if (param1 < field_f) {
            var6 = var6 + (field_f - param1) * var7;
            param3 = param3 - (field_f - param1);
            param1 = field_f;
        }
        if (param0 + param2 > field_i) {
            param2 = field_i - param0;
        }
        if (param1 + param3 > field_c) {
            param3 = field_c - param1;
        }
        int var8 = field_e - param2;
        int var9 = param0 + param1 * field_e;
        for (var10 = -param3; var10 < 0; var10++) {
            var11 = 65536 - var6 >> 8;
            var12 = var6 >> 8;
            var13 = ((param4 & 16711935) * var11 + (param5 & 16711935) * var12 & -16711936) + ((param4 & 65280) * var11 + (param5 & 65280) * var12 & 16711680) >>> 8;
            for (var14 = -param2; var14 < 0; var14++) {
                var15 = field_l[var9];
                var16 = var13 + var15;
                var17 = (var13 & 16711935) + (var15 & 16711935);
                var15 = (var17 & 16777472) + (var16 - var17 & 65536);
                incrementValue$0 = var9;
                var9++;
                field_l[incrementValue$0] = var16 - var15 | var15 - (var15 >>> 8);
            }
            var9 = var9 + var8;
            var6 = var6 + var7;
        }
    }

    final static void a(int param0, int param1, int param2) {
        if (param0 >= field_d) {
            if (param1 < field_f || param0 >= field_i || param1 >= field_c) {
                return;
            }
            field_l[param0 + param1 * field_e] = param2;
            return;
        }
    }

    final static void b(int[] param0) {
        field_d = param0[0];
        field_f = param0[1];
        field_i = param0[2];
        field_c = param0[3];
        bi.b();
    }

    private final static void a(int[] param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        int incrementValue$0 = 0;
        int incrementValue$1 = 0;
        int incrementValue$2 = 0;
        int incrementValue$3 = 0;
        int incrementValue$4 = 0;
        int incrementValue$5 = 0;
        int var8;
        int var9;
        int var10;
        int var11;
        int var12;
        int var13;
        int var14;
        int var15;
        int var16;
        int var17;
        int var18;
        int var19;
        int var20;
        int var21;
        int var22;
        int var23;
        L0: {
          var8 = 16384 / (2 * param3 + 1);
          var9 = 1 + param3 - param5 - param4;
          if (0 >= var9) {
            break L0;
          } else {
            var9 = 0;
            break L0;
          }
        }
        L1: {
          var10 = field_e - param4 - param5 - param3;
          if (0 >= var10) {
            break L1;
          } else {
            var10 = 0;
            break L1;
          }
        }
        L2: {
          var11 = 0;
          var12 = param4 + param3 + 1;
          if (field_e >= var12) {
            break L2;
          } else {
            var11 = var12 - field_e;
            var12 = field_e;
            break L2;
          }
        }
        var13 = -param7;
        L3: while (true) {
          if (var13 >= 0) {
            return;
          } else {
            L4: {
              var14 = 0;
              var15 = 0;
              var16 = 0;
              var17 = param2 - param3;
              var18 = var17 - (param3 << 1) - 1;
              var19 = param4 - param3;
              if (var19 >= 0) {
                break L4;
              } else {
                var17 = var17 - var19;
                var18 = var18 - var19;
                var19 = 0;
                break L4;
              }
            }
            var20 = var12 - var19;
            L5: while (true) {
              if (var19 >= var12) {
                var18 = var18 + var11;
                incrementValue$0 = param2;
                param2++;
                param0[incrementValue$0] = (var14 / var20 << 16) + (var15 / var20 << 8) + var16 / var20;
                var19 = 1 - param5;
                L6: while (true) {
                  if (var19 >= var9) {
                    L7: while (true) {
                      if (var19 >= var10) {
                        L8: while (true) {
                          if (var19 >= 0) {
                            param2 = param2 + param6;
                            var13++;
                            continue L3;
                          } else {
                            L9: {
                              incrementValue$1 = var18;
                              var18++;
                              param1 = param0[incrementValue$1];
                              var14 = var14 - (param1 >> 16 & 255);
                              var15 = var15 - (param1 >> 8 & 255);
                              var16 = var16 - (param1 & 255);
                              var20--;
                              var21 = var14 / var20;
                              var22 = var15 / var20;
                              var23 = var16 / var20;
                              if (var21 >= 0) {
                                if (var21 <= 255) {
                                  break L9;
                                } else {
                                  var21 = 255;
                                  break L9;
                                }
                              } else {
                                var21 = 0;
                                break L9;
                              }
                            }
                            L10: {
                              if (var22 >= 0) {
                                if (var22 <= 255) {
                                  break L10;
                                } else {
                                  var22 = 255;
                                  break L10;
                                }
                              } else {
                                var22 = 0;
                                break L10;
                              }
                            }
                            L11: {
                              if (var23 >= 0) {
                                if (var23 <= 255) {
                                  break L11;
                                } else {
                                  var23 = 255;
                                  break L11;
                                }
                              } else {
                                var23 = 0;
                                break L11;
                              }
                            }
                            incrementValue$2 = param2;
                            param2++;
                            param0[incrementValue$2] = (var21 << 16) + (var22 << 8) + var23;
                            var19++;
                            continue L8;
                          }
                        }
                      } else {
                        L12: {
                          incrementValue$3 = var18;
                          var18++;
                          param1 = param0[incrementValue$3];
                          var14 = var14 - (param1 >> 16 & 255);
                          if (var14 >= 0) {
                            break L12;
                          } else {
                            var14 = 0;
                            break L12;
                          }
                        }
                        L13: {
                          var15 = var15 - (param1 >> 8 & 255);
                          if (var15 >= 0) {
                            break L13;
                          } else {
                            var15 = 0;
                            break L13;
                          }
                        }
                        L14: {
                          var16 = var16 - (param1 & 255);
                          if (var16 >= 0) {
                            break L14;
                          } else {
                            var16 = 0;
                            break L14;
                          }
                        }
                        L15: {
                          param1 = param0[var17];
                          var17++;
                          var14 = var14 + (param1 >> 16 & 255);
                          var15 = var15 + (param1 >> 8 & 255);
                          var16 = var16 + (param1 & 255);
                          var21 = var14 * var8 >> 14;
                          var22 = var15 * var8 >> 14;
                          var23 = var16 * var8 >> 14;
                          if (var21 <= 255) {
                            break L15;
                          } else {
                            var21 = 255;
                            break L15;
                          }
                        }
                        L16: {
                          if (var22 <= 255) {
                            break L16;
                          } else {
                            var22 = 255;
                            break L16;
                          }
                        }
                        L17: {
                          if (var23 <= 255) {
                            break L17;
                          } else {
                            var23 = 255;
                            break L17;
                          }
                        }
                        incrementValue$4 = param2;
                        param2++;
                        param0[incrementValue$4] = (var21 << 16) + (var22 << 8) + var23;
                        var19++;
                        continue L7;
                      }
                    }
                  } else {
                    L18: {
                      var18++;
                      if (param4 + param5 + var19 + param3 >= field_i) {
                        break L18;
                      } else {
                        param1 = param0[var17];
                        var17++;
                        var14 = var14 + (param1 >> 16 & 255);
                        var15 = var15 + (param1 >> 8 & 255);
                        var16 = var16 + (param1 & 255);
                        var20++;
                        break L18;
                      }
                    }
                    var21 = var14 / var20;
                    var22 = var15 / var20;
                    var23 = var16 / var20;
                    incrementValue$5 = param2;
                    param2++;
                    param0[incrementValue$5] = (var21 << 16) + (var22 << 8) + var23;
                    var19++;
                    continue L6;
                  }
                }
              } else {
                param1 = param0[var17];
                var14 = var14 + (param1 >> 16 & 255);
                var15 = var15 + (param1 >> 8 & 255);
                var16 = var16 + (param1 & 255);
                var17++;
                var18++;
                var19++;
                continue L5;
              }
            }
          }
        }
    }

    final static void b(int param0, int param1, int param2, int param3, int param4, int param5) {
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int incrementValue$0 = 0;
        if (param0 < field_d) {
            param2 = param2 - (field_d - param0);
            param0 = field_d;
        }
        if (param1 < field_f) {
            param3 = param3 - (field_f - param1);
            param1 = field_f;
        }
        if (param0 + param2 > field_i) {
            param2 = field_i - param0;
        }
        if (param1 + param3 > field_c) {
            param3 = field_c - param1;
        }
        param4 = ((param4 & 16711935) * param5 >> 8 & 16711935) + ((param4 & 65280) * param5 >> 8 & 65280);
        int var6 = 256 - param5;
        int var7 = field_e - param2;
        int var8 = param0 + param1 * field_e;
        for (var9 = 0; var9 < param3; var9++) {
            for (var10 = -param2; var10 < 0; var10++) {
                var11 = field_l[var8];
                var11 = ((var11 & 16711935) * var6 >> 8 & 16711935) + ((var11 & 65280) * var6 >> 8 & 65280);
                incrementValue$0 = var8;
                var8++;
                field_l[incrementValue$0] = param4 + var11;
            }
            var8 = var8 + var7;
        }
    }

    final static void e(int param0, int param1, int param2, int param3) {
        int var4 = 0;
        int var5 = 0;
        if (param0 >= field_d) {
            if (param0 >= field_i) {
                return;
            }
            if (param1 < field_f) {
                param2 = param2 - (field_f - param1);
                param1 = field_f;
            }
            if (param1 + param2 > field_c) {
                param2 = field_c - param1;
            }
            var4 = param0 + param1 * field_e;
            var5 = 0;
            while (var5 < param2) {
                field_l[var4] = param3;
                var5++;
                var4 = var4 + field_e;
            }
            return;
        }
    }

    final static void f(int param0, int param1, int param2, int param3, int param4, int param5) {
        int incrementValue$0 = 0;
        int incrementValue$1 = 0;
        int incrementValue$2 = 0;
        int incrementValue$3 = 0;
        int incrementValue$4 = 0;
        int incrementValue$5 = 0;
        int incrementValue$6 = 0;
        int var6;
        int var7;
        int var8;
        int var9;
        int var10;
        int var11;
        int var12;
        int var13;
        int var14;
        int var15;
        int var16;
        int var17;
        int var18;
        int var19;
        int var20;
        int var21;
        int var22;
        if (param4 != 0) {
          L0: {
            if (param4 >= 0) {
              break L0;
            } else {
              param4 = -param4;
              break L0;
            }
          }
          L1: {
            var6 = param0 + param4;
            var7 = param1 + param4;
            var8 = param1;
            if (var8 >= field_f) {
              break L1;
            } else {
              var8 = field_f;
              break L1;
            }
          }
          L2: {
            var9 = param1 + param3;
            if (var9 <= field_c) {
              break L2;
            } else {
              var9 = field_c;
              break L2;
            }
          }
          L3: {
            var10 = param2 - param4 - param4 - 1;
            var11 = var8;
            var12 = param4 * param4;
            var13 = 0;
            var14 = var7 - var11;
            var15 = var14 * var14;
            var16 = var15 - var14;
            if (var7 <= var9) {
              break L3;
            } else {
              var7 = var9;
              break L3;
            }
          }
          L4: while (true) {
            if (var11 >= var7) {
              L5: {
                var14 = var11 - var7;
                var17 = param0;
                if (var17 >= field_d) {
                  break L5;
                } else {
                  var17 = field_d;
                  break L5;
                }
              }
              L6: {
                var18 = param0 + param2;
                if (var18 <= field_i) {
                  break L6;
                } else {
                  var18 = field_i;
                  break L6;
                }
              }
              L7: {
                var19 = var17 + var11 * field_e;
                var20 = field_e + var17 - var18;
                var21 = param1 + param3 - param4 - 1;
                if (var21 <= field_c) {
                  break L7;
                } else {
                  var21 = field_c;
                  break L7;
                }
              }
              L8: while (true) {
                if (var11 >= var21) {
                  var14 = 0;
                  var13 = param4;
                  var16 = var14 * var14 + var12;
                  var15 = var16 - var13;
                  var16 = var16 - var14;
                  L9: while (true) {
                    if (var11 >= var9) {
                      return;
                    } else {
                      L10: while (true) {
                        L11: {
                          if (var16 <= var12) {
                            break L11;
                          } else {
                            if (var15 <= var12) {
                              break L11;
                            } else {
                              incrementValue$0 = var13;
                              var13--;
                              var16 = var16 - (incrementValue$0 + var13);
                              var15 = var15 - (var13 + var13);
                              continue L10;
                            }
                          }
                        }
                        L12: {
                          var17 = var6 - var13;
                          if (var17 >= field_d) {
                            break L12;
                          } else {
                            var17 = field_d;
                            break L12;
                          }
                        }
                        L13: {
                          var18 = var6 + var10 + var13;
                          if (var18 <= field_i - 1) {
                            break L13;
                          } else {
                            var18 = field_i - 1;
                            break L13;
                          }
                        }
                        var19 = var17 + var11 * field_e;
                        var20 = var17;
                        L14: while (true) {
                          if (var20 > var18) {
                            var11++;
                            var16 = var16 + (var14 + var14);
                            incrementValue$1 = var14;
                            var14++;
                            var15 = var15 + (incrementValue$1 + var14);
                            continue L9;
                          } else {
                            incrementValue$2 = var19;
                            var19++;
                            field_l[incrementValue$2] = param5;
                            var20++;
                            continue L14;
                          }
                        }
                      }
                    }
                  }
                } else {
                  var22 = var17;
                  L15: while (true) {
                    if (var22 >= var18) {
                      var11++;
                      var19 = var19 + var20;
                      continue L8;
                    } else {
                      incrementValue$3 = var19;
                      var19++;
                      field_l[incrementValue$3] = param5;
                      var22++;
                      continue L15;
                    }
                  }
                }
              }
            } else {
              L16: while (true) {
                L17: {
                  if (var16 <= var12) {
                    break L17;
                  } else {
                    if (var15 > var12) {
                      L18: {
                        var17 = var6 - var13 + 1;
                        if (var17 >= field_d) {
                          break L18;
                        } else {
                          var17 = field_d;
                          break L18;
                        }
                      }
                      L19: {
                        var18 = var6 + var10 + var13;
                        if (var18 <= field_i) {
                          break L19;
                        } else {
                          var18 = field_i;
                          break L19;
                        }
                      }
                      var19 = var17 + var11 * field_e;
                      var20 = var17;
                      L20: while (true) {
                        if (var20 >= var18) {
                          var11++;
                          incrementValue$4 = var14;
                          var14--;
                          var15 = var15 - (incrementValue$4 + var14);
                          var16 = var16 - (var14 + var14);
                          continue L4;
                        } else {
                          incrementValue$5 = var19;
                          var19++;
                          field_l[incrementValue$5] = param5;
                          var20++;
                          continue L20;
                        }
                      }
                    } else {
                      break L17;
                    }
                  }
                }
                var15 = var15 + (var13 + var13);
                incrementValue$6 = var13;
                var13++;
                var16 = var16 + (incrementValue$6 + var13);
                continue L16;
              }
            }
          }
        } else {
          bi.b(param0, param1, param2, param3, param5);
          return;
        }
    }

    final static void a(int param0, int param1, int param2, int param3) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int incrementValue$0 = 0;
        if (param0 < field_d) {
            param2 = param2 - (field_d - param0);
            param0 = field_d;
        }
        if (param0 + param2 > field_i) {
            param2 = field_i - param0;
        }
        if (param1 < field_f) {
            param3 = param3 - (field_f - param1);
            param1 = field_f;
        }
        if (param1 + param3 > field_c) {
            param3 = field_c - param1;
        }
        int var4 = param0 + param1 * field_e;
        if (param2 > 0) {
            if (param3 <= 0) {
                return;
            }
            for (var5 = 0; var5 < param3; var5++) {
                for (var6 = 0; var6 < param2; var6++) {
                    var7 = field_l[var4];
                    var8 = var7 >> 15 & 510;
                    var9 = var7 >> 8 & 255;
                    var10 = var7 & 255;
                    var11 = (var10 + var8) / 3 + var9 >> 1;
                    incrementValue$0 = var4;
                    var4++;
                    field_l[incrementValue$0] = (var11 << 16) + (var11 << 8) + var11;
                }
                var4 = var4 + (field_e - param2);
            }
            return;
        }
    }

    final static void d(int param0, int param1, int param2, int param3, int param4, int param5) {
        int var6 = 0;
        for (var6 = 0; var6 < param4; var6++) {
            bi.e(param0 + var6, param1 + var6, param2 - (var6 << 1), param3 - (var6 << 1), param5);
        }
    }

    final static void a(int[] param0) {
        param0[0] = field_d;
        param0[1] = field_f;
        param0[2] = field_i;
        param0[3] = field_c;
    }

    final static void f(int param0, int param1, int param2, int param3, int param4) {
        int var6 = 0;
        int var5 = 0;
        for (var6 = 0; var6 < 4; var6++) {
            var5 = 128 - (var6 << 5);
            bi.d(param0 + var6, param1 + param3 + var6, param2, param4, var5);
            bi.c(param0 + param2 + var6, param1 + var6, param3 + 1, param4, var5);
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4) {
        int var5;
        int var6;
        param2 = param2 - param0;
        param3 = param3 - param1;
        if (param3 != 0) {
          if (param2 != 0) {
            L0: {
              if (param2 + param3 >= 0) {
                break L0;
              } else {
                param0 = param0 + param2;
                param2 = -param2;
                param1 = param1 + param3;
                param3 = -param3;
                break L0;
              }
            }
            if (param2 <= param3) {
              L1: {
                param0 = param0 << 16;
                param0 = param0 + 32768;
                param2 = param2 << 16;
                var5 = (int)Math.floor((double)param2 / (double)param3 + 0.5);
                param3 = param3 + param1;
                if (param1 >= field_f) {
                  break L1;
                } else {
                  param0 = param0 + var5 * (field_f - param1);
                  param1 = field_f;
                  break L1;
                }
              }
              L2: {
                if (param3 < field_c) {
                  break L2;
                } else {
                  param3 = field_c - 1;
                  break L2;
                }
              }
              L3: while (true) {
                if (param1 > param3) {
                  return;
                } else {
                  L4: {
                    var6 = param0 >> 16;
                    if (var6 < field_d) {
                      break L4;
                    } else {
                      if (var6 >= field_i) {
                        break L4;
                      } else {
                        field_l[var6 + param1 * field_e] = param4;
                        break L4;
                      }
                    }
                  }
                  param0 = param0 + var5;
                  param1++;
                  continue L3;
                }
              }
            } else {
              L5: {
                param1 = param1 << 16;
                param1 = param1 + 32768;
                param3 = param3 << 16;
                var5 = (int)Math.floor((double)param3 / (double)param2 + 0.5);
                param2 = param2 + param0;
                if (param0 >= field_d) {
                  break L5;
                } else {
                  param1 = param1 + var5 * (field_d - param0);
                  param0 = field_d;
                  break L5;
                }
              }
              L6: {
                if (param2 < field_i) {
                  break L6;
                } else {
                  param2 = field_i - 1;
                  break L6;
                }
              }
              L7: while (true) {
                if (param0 > param2) {
                  return;
                } else {
                  L8: {
                    var6 = param1 >> 16;
                    if (var6 < field_f) {
                      break L8;
                    } else {
                      if (var6 >= field_c) {
                        break L8;
                      } else {
                        field_l[param0 + var6 * field_e] = param4;
                        break L8;
                      }
                    }
                  }
                  param1 = param1 + var5;
                  param0++;
                  continue L7;
                }
              }
            }
          } else {
            L9: {
              if (param3 < 0) {
                bi.e(param0, param1 + param3, -param3 + 1, param4);
                break L9;
              } else {
                bi.e(param0, param1, param3 + 1, param4);
                break L9;
              }
            }
            return;
          }
        } else {
          L10: {
            if (param2 < 0) {
              bi.b(param0 + param2, param1, -param2 + 1, param4);
              break L10;
            } else {
              bi.b(param0, param1, param2 + 1, param4);
              break L10;
            }
          }
          return;
        }
    }

    final static void e(int param0, int param1, int param2, int param3, int param4, int param5) {
        int incrementValue$0 = 0;
        int var6;
        int var7;
        int var8;
        int var9;
        int var10;
        int var11;
        int var12;
        int var13;
        int var14;
        L0: {
          var6 = 0;
          var7 = 65536 / param3;
          if (param0 >= field_d) {
            break L0;
          } else {
            param2 = param2 - (field_d - param0);
            param0 = field_d;
            break L0;
          }
        }
        L1: {
          if (param1 >= field_f) {
            break L1;
          } else {
            var6 = var6 + (field_f - param1) * var7;
            param3 = param3 - (field_f - param1);
            param1 = field_f;
            break L1;
          }
        }
        L2: {
          if (param0 + param2 <= field_i) {
            break L2;
          } else {
            param2 = field_i - param0;
            break L2;
          }
        }
        L3: {
          if (param1 + param3 <= field_c) {
            break L3;
          } else {
            param3 = field_c - param1;
            break L3;
          }
        }
        var8 = field_e - param2;
        var9 = param0 + param1 * field_e;
        var10 = -param3;
        L4: while (true) {
          if (var10 >= 0) {
            return;
          } else {
            var11 = 65536 - var6 >> 8;
            var12 = var6 >> 8;
            var13 = ((param4 & 16711935) * var11 + (param5 & 16711935) * var12 & -16711936) + ((param4 & 65280) * var11 + (param5 & 65280) * var12 & 16711680) >>> 8;
            var14 = -param2;
            L5: while (true) {
              if (var14 >= 0) {
                var9 = var9 + var8;
                var6 = var6 + var7;
                var10++;
                continue L4;
              } else {
                incrementValue$0 = var9;
                var9++;
                field_l[incrementValue$0] = var13;
                var14++;
                continue L5;
              }
            }
          }
        }
    }

    private final static void d(int param0, int param1, int param2, int param3, int param4) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var12 = 0;
        int var13 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var14 = 0;
        int incrementValue$0 = 0;
        if (param1 >= field_f) {
            if (param1 >= field_c) {
                return;
            }
            if (param0 < field_d) {
                param2 = param2 - (field_d - param0);
                param0 = field_d;
            }
            if (param0 + param2 > field_i) {
                param2 = field_i - param0;
            }
            var5 = 256 - param4;
            var6 = (param3 >> 16 & 255) * param4;
            var7 = (param3 >> 8 & 255) * param4;
            var8 = (param3 & 255) * param4;
            var12 = param0 + param1 * field_e;
            for (var13 = 0; var13 < param2; var13++) {
                var9 = (field_l[var12] >> 16 & 255) * var5;
                var10 = (field_l[var12] >> 8 & 255) * var5;
                var11 = (field_l[var12] & 255) * var5;
                var14 = (var6 + var9 >> 8 << 16) + (var7 + var10 >> 8 << 8) + (var8 + var11 >> 8);
                incrementValue$0 = var12;
                var12++;
                field_l[incrementValue$0] = var14;
            }
            return;
        }
    }

    final static void c(int param0, int param1, int param2, int param3) {
        if (field_d < param0) {
            field_d = param0;
        }
        if (field_f < param1) {
            field_f = param1;
        }
        if (field_i > param2) {
            field_i = param2;
        }
        if (field_c > param3) {
            field_c = param3;
        }
        bi.b();
    }

    final static void b(int param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        int incrementValue$0 = 0;
        int incrementValue$1 = 0;
        int incrementValue$2 = 0;
        int incrementValue$3 = 0;
        int incrementValue$4 = 0;
        int incrementValue$5 = 0;
        int incrementValue$6 = 0;
        int var7;
        int var8;
        int var9;
        int var10;
        int var11;
        int var12;
        int var13;
        int var14;
        int var15;
        int var16;
        int var17;
        int var18;
        int var19;
        int var20;
        int var21;
        int var22;
        int var23;
        int var24;
        int var25;
        if (param6 != 256) {
          if (param4 != 0) {
            L0: {
              var7 = 256 - param6;
              param5 = ((param5 & 16711935) * param6 >> 8 & 16711935) + ((param5 & 65280) * param6 >> 8 & 65280);
              if (param4 >= 0) {
                break L0;
              } else {
                param4 = -param4;
                break L0;
              }
            }
            L1: {
              var8 = param0 + param4;
              var9 = param1 + param4;
              var10 = param1;
              if (var10 >= field_f) {
                break L1;
              } else {
                var10 = field_f;
                break L1;
              }
            }
            L2: {
              var11 = param1 + param3;
              if (var11 <= field_c) {
                break L2;
              } else {
                var11 = field_c;
                break L2;
              }
            }
            L3: {
              var12 = param2 - param4 - param4 - 1;
              var13 = var10;
              var14 = param4 * param4;
              var15 = 0;
              var16 = var9 - var13;
              var17 = var16 * var16;
              var18 = var17 - var16;
              if (var9 <= var11) {
                break L3;
              } else {
                var9 = var11;
                break L3;
              }
            }
            L4: while (true) {
              if (var13 >= var9) {
                L5: {
                  var16 = var13 - var9;
                  var19 = param0;
                  if (var19 >= field_d) {
                    break L5;
                  } else {
                    var19 = field_d;
                    break L5;
                  }
                }
                L6: {
                  var20 = param0 + param2;
                  if (var20 <= field_i) {
                    break L6;
                  } else {
                    var20 = field_i;
                    break L6;
                  }
                }
                L7: {
                  var21 = var19 + var13 * field_e;
                  var22 = field_e + var19 - var20;
                  var23 = param1 + param3 - param4 - 1;
                  if (var23 <= field_c) {
                    break L7;
                  } else {
                    var23 = field_c;
                    break L7;
                  }
                }
                L8: while (true) {
                  if (var13 >= var23) {
                    var16 = 0;
                    var15 = param4;
                    var18 = var16 * var16 + var14;
                    var17 = var18 - var15;
                    var18 = var18 - var16;
                    L9: while (true) {
                      if (var13 >= var11) {
                        return;
                      } else {
                        L10: while (true) {
                          L11: {
                            if (var18 <= var14) {
                              break L11;
                            } else {
                              if (var17 <= var14) {
                                break L11;
                              } else {
                                incrementValue$0 = var15;
                                var15--;
                                var18 = var18 - (incrementValue$0 + var15);
                                var17 = var17 - (var15 + var15);
                                continue L10;
                              }
                            }
                          }
                          L12: {
                            var19 = var8 - var15;
                            if (var19 >= field_d) {
                              break L12;
                            } else {
                              var19 = field_d;
                              break L12;
                            }
                          }
                          L13: {
                            var20 = var8 + var12 + var15;
                            if (var20 <= field_i - 1) {
                              break L13;
                            } else {
                              var20 = field_i - 1;
                              break L13;
                            }
                          }
                          var21 = var19 + var13 * field_e;
                          var22 = var19;
                          L14: while (true) {
                            if (var22 > var20) {
                              var13++;
                              var18 = var18 + (var16 + var16);
                              incrementValue$1 = var16;
                              var16++;
                              var17 = var17 + (incrementValue$1 + var16);
                              continue L9;
                            } else {
                              var23 = field_l[var21];
                              var23 = ((var23 & 16711935) * var7 >> 8 & 16711935) + ((var23 & 65280) * var7 >> 8 & 65280);
                              incrementValue$2 = var21;
                              var21++;
                              field_l[incrementValue$2] = param5 + var23;
                              var22++;
                              continue L14;
                            }
                          }
                        }
                      }
                    }
                  } else {
                    var24 = var19;
                    L15: while (true) {
                      if (var24 >= var20) {
                        var13++;
                        var21 = var21 + var22;
                        continue L8;
                      } else {
                        var25 = field_l[var21];
                        var25 = ((var25 & 16711935) * var7 >> 8 & 16711935) + ((var25 & 65280) * var7 >> 8 & 65280);
                        incrementValue$3 = var21;
                        var21++;
                        field_l[incrementValue$3] = param5 + var25;
                        var24++;
                        continue L15;
                      }
                    }
                  }
                }
              } else {
                L16: while (true) {
                  L17: {
                    if (var18 <= var14) {
                      break L17;
                    } else {
                      if (var17 > var14) {
                        L18: {
                          var19 = var8 - var15 + 1;
                          if (var19 >= field_d) {
                            break L18;
                          } else {
                            var19 = field_d;
                            break L18;
                          }
                        }
                        L19: {
                          var20 = var8 + var12 + var15;
                          if (var20 <= field_i) {
                            break L19;
                          } else {
                            var20 = field_i;
                            break L19;
                          }
                        }
                        var21 = var19 + var13 * field_e;
                        var22 = var19;
                        L20: while (true) {
                          if (var22 >= var20) {
                            var13++;
                            incrementValue$4 = var16;
                            var16--;
                            var17 = var17 - (incrementValue$4 + var16);
                            var18 = var18 - (var16 + var16);
                            continue L4;
                          } else {
                            var23 = field_l[var21];
                            var23 = ((var23 & 16711935) * var7 >> 8 & 16711935) + ((var23 & 65280) * var7 >> 8 & 65280);
                            incrementValue$5 = var21;
                            var21++;
                            field_l[incrementValue$5] = param5 + var23;
                            var22++;
                            continue L20;
                          }
                        }
                      } else {
                        break L17;
                      }
                    }
                  }
                  var17 = var17 + (var15 + var15);
                  incrementValue$6 = var15;
                  var15++;
                  var18 = var18 + (incrementValue$6 + var15);
                  continue L16;
                }
              }
            }
          } else {
            bi.b(param0, param1, param2, param3, param5, param6);
            return;
          }
        } else {
          bi.f(param0, param1, param2, param3, param4, param5);
          return;
        }
    }

    final static void c(int param0, int param1, int param2, int param3, int param4, int param5) {
        bi.a(field_l, 0, param2 + param3 * field_e, param0, param2, param4, field_e - param4, param5);
        bi.a(field_l, 0, param2 + param3 * field_e, param1, param3, param5, field_e - param4, param2, param4);
    }

    final static void b(int param0, int param1, int param2, int param3) {
        int var4 = 0;
        int var5 = 0;
        if (param1 >= field_f) {
            if (param1 >= field_c) {
                return;
            }
            if (param0 < field_d) {
                param2 = param2 - (field_d - param0);
                param0 = field_d;
            }
            if (param0 + param2 > field_i) {
                param2 = field_i - param0;
            }
            var4 = param0 + param1 * field_e;
            for (var5 = 0; var5 < param2; var5++) {
                field_l[var4 + var5] = param3;
            }
            return;
        }
    }

    final static void g(int param0, int param1, int param2, int param3) {
        if (param0 < 0) {
            param0 = 0;
        }
        if (param1 < 0) {
            param1 = 0;
        }
        if (param2 > field_e) {
            param2 = field_e;
        }
        if (param3 > field_j) {
            param3 = field_j;
        }
        field_d = param0;
        field_f = param1;
        field_i = param2;
        field_c = param3;
        bi.b();
    }

    final static void a(int[] param0, int param1, int param2) {
        field_l = param0;
        field_e = param1;
        field_j = param2;
        bi.g(0, 0, param1, param2);
    }

    final static void b(int param0, int param1, int param2, int param3, int param4) {
        int var7 = 0;
        int var8 = 0;
        int incrementValue$0 = 0;
        if (param0 < field_d) {
            param2 = param2 - (field_d - param0);
            param0 = field_d;
        }
        if (param1 < field_f) {
            param3 = param3 - (field_f - param1);
            param1 = field_f;
        }
        if (param0 + param2 > field_i) {
            param2 = field_i - param0;
        }
        if (param1 + param3 > field_c) {
            param3 = field_c - param1;
        }
        int var5 = field_e - param2;
        int var6 = param0 + param1 * field_e;
        for (var7 = -param3; var7 < 0; var7++) {
            for (var8 = -param2; var8 < 0; var8++) {
                incrementValue$0 = var6;
                var6++;
                field_l[incrementValue$0] = param4;
            }
            var6 = var6 + var5;
        }
    }

    final static void b(int param0, int param1, int param2) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        if (param0 >= field_d) {
            if (param1 < field_f || param0 >= field_i || param1 >= field_c) {
                return;
            }
            var3 = param0 + param1 * field_e;
            var4 = field_l[var3];
            var5 = param2 + var4;
            param2 = (param2 & 16711935) + (var4 & 16711935);
            var4 = (param2 & 16777472) + (var5 - param2 & 65536);
            field_l[var3] = var5 - var4 | var4 - (var4 >>> 8);
            return;
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        int incrementValue$0 = 0;
        int incrementValue$1 = 0;
        int incrementValue$2 = 0;
        int incrementValue$3 = 0;
        int incrementValue$4 = 0;
        int incrementValue$5 = 0;
        int incrementValue$6 = 0;
        int var7;
        int var8;
        int var9;
        int var10;
        int var11;
        int var12;
        int var13;
        int var14;
        int var15;
        int var16;
        int var17;
        int var18;
        int var19;
        int var20;
        int var21;
        int var22;
        int var23;
        int var24;
        int var25;
        int var26;
        int var27;
        int var28;
        if (param4 != 0) {
          L0: {
            if (param4 >= 0) {
              break L0;
            } else {
              param4 = -param4;
              break L0;
            }
          }
          L1: {
            var7 = 0;
            var8 = 65536 / param3;
            var9 = param0 + param4;
            var10 = param1 + param4;
            var11 = param1;
            if (var11 >= field_f) {
              break L1;
            } else {
              var7 = var7 + (field_f - param1) * var8;
              param3 = param3 - (field_f - param1);
              var11 = field_f;
              param1 = field_f;
              break L1;
            }
          }
          L2: {
            var12 = param1 + param3;
            if (var12 <= field_c) {
              break L2;
            } else {
              var12 = field_c;
              break L2;
            }
          }
          L3: {
            var13 = param2 - param4 - param4 - 1;
            var14 = var11;
            var15 = param4 * param4;
            var16 = 0;
            var17 = var10 - var14;
            var18 = var17 * var17;
            var19 = var18 - var17;
            if (var10 <= var12) {
              break L3;
            } else {
              var10 = var12;
              break L3;
            }
          }
          L4: while (true) {
            if (var14 >= var10) {
              L5: {
                var17 = var14 - var10;
                var20 = param0;
                if (var20 >= field_d) {
                  break L5;
                } else {
                  var20 = field_d;
                  break L5;
                }
              }
              L6: {
                var21 = param0 + param2;
                if (var21 <= field_i) {
                  break L6;
                } else {
                  var21 = field_i;
                  break L6;
                }
              }
              L7: {
                var22 = var20 + var14 * field_e;
                var23 = field_e + var20 - var21;
                var24 = param1 + param3 - param4 - 1;
                if (var24 <= field_c) {
                  break L7;
                } else {
                  var24 = field_c;
                  break L7;
                }
              }
              L8: while (true) {
                if (var14 >= var24) {
                  var17 = 0;
                  var16 = param4;
                  var19 = var17 * var17 + var15;
                  var18 = var19 - var16;
                  var19 = var19 - var17;
                  L9: while (true) {
                    if (var14 >= var12) {
                      return;
                    } else {
                      L10: while (true) {
                        L11: {
                          if (var19 <= var15) {
                            break L11;
                          } else {
                            if (var18 <= var15) {
                              break L11;
                            } else {
                              incrementValue$0 = var16;
                              var16--;
                              var19 = var19 - (incrementValue$0 + var16);
                              var18 = var18 - (var16 + var16);
                              continue L10;
                            }
                          }
                        }
                        L12: {
                          var20 = var9 - var16;
                          if (var20 >= field_d) {
                            break L12;
                          } else {
                            var20 = field_d;
                            break L12;
                          }
                        }
                        L13: {
                          var21 = var9 + var13 + var16;
                          if (var21 <= field_i - 1) {
                            break L13;
                          } else {
                            var21 = field_i - 1;
                            break L13;
                          }
                        }
                        var22 = var20 + var14 * field_e;
                        var23 = 65536 - var7 >> 8;
                        var24 = var7 >> 8;
                        var25 = ((param5 & 16711935) * var23 + (param6 & 16711935) * var24 & -16711936) + ((param5 & 65280) * var23 + (param6 & 65280) * var24 & 16711680) >>> 8;
                        var26 = var20;
                        L14: while (true) {
                          if (var26 > var21) {
                            var14++;
                            var19 = var19 + (var17 + var17);
                            incrementValue$1 = var17;
                            var17++;
                            var18 = var18 + (incrementValue$1 + var17);
                            var7 = var7 + var8;
                            continue L9;
                          } else {
                            incrementValue$2 = var22;
                            var22++;
                            field_l[incrementValue$2] = var25;
                            var26++;
                            continue L14;
                          }
                        }
                      }
                    }
                  }
                } else {
                  var25 = 65536 - var7 >> 8;
                  var26 = var7 >> 8;
                  var27 = ((param5 & 16711935) * var25 + (param6 & 16711935) * var26 & -16711936) + ((param5 & 65280) * var25 + (param6 & 65280) * var26 & 16711680) >>> 8;
                  var28 = var20;
                  L15: while (true) {
                    if (var28 >= var21) {
                      var14++;
                      var22 = var22 + var23;
                      var7 = var7 + var8;
                      continue L8;
                    } else {
                      incrementValue$3 = var22;
                      var22++;
                      field_l[incrementValue$3] = var27;
                      var28++;
                      continue L15;
                    }
                  }
                }
              }
            } else {
              L16: while (true) {
                L17: {
                  if (var19 <= var15) {
                    break L17;
                  } else {
                    if (var18 > var15) {
                      L18: {
                        var20 = var9 - var16 + 1;
                        if (var20 >= field_d) {
                          break L18;
                        } else {
                          var20 = field_d;
                          break L18;
                        }
                      }
                      L19: {
                        var21 = var9 + var13 + var16;
                        if (var21 <= field_i) {
                          break L19;
                        } else {
                          var21 = field_i;
                          break L19;
                        }
                      }
                      var22 = var20 + var14 * field_e;
                      var23 = 65536 - var7 >> 8;
                      var24 = var7 >> 8;
                      var25 = ((param5 & 16711935) * var23 + (param6 & 16711935) * var24 & -16711936) + ((param5 & 65280) * var23 + (param6 & 65280) * var24 & 16711680) >>> 8;
                      var26 = var20;
                      L20: while (true) {
                        if (var26 >= var21) {
                          var14++;
                          incrementValue$4 = var17;
                          var17--;
                          var18 = var18 - (incrementValue$4 + var17);
                          var19 = var19 - (var17 + var17);
                          var7 = var7 + var8;
                          continue L4;
                        } else {
                          incrementValue$5 = var22;
                          var22++;
                          field_l[incrementValue$5] = var25;
                          var26++;
                          continue L20;
                        }
                      }
                    } else {
                      break L17;
                    }
                  }
                }
                var18 = var18 + (var16 + var16);
                incrementValue$6 = var16;
                var16++;
                var19 = var19 + (incrementValue$6 + var16);
                continue L16;
              }
            }
          }
        } else {
          bi.a(param0, param1, param2, param3, param5, param6);
          return;
        }
    }

    private final static void b() {
        field_b = null;
        field_a = null;
    }

    public static void d() {
        field_l = null;
        field_b = null;
        field_a = null;
        field_k = null;
        field_g = null;
        field_h = null;
    }

    final static void d(int param0, int param1, int param2, int param3) {
        if (param0 < field_d) {
            param2 = param2 - (field_d - param0);
            param0 = field_d;
        }
        if (param1 < field_f) {
            param3 = param3 - (field_f - param1);
            param1 = field_f;
        }
        if (param0 + param2 > field_i) {
            param2 = field_i - param0;
        }
        if (param1 + param3 > field_c) {
            param3 = field_c - param1;
        }
        int var4 = field_e - param2;
        int var5 = param0 + param1 * field_e;
        bi.a(var5, field_l, 0, param2, -param3, var4);
    }

    final static void c(int param0, int param1, int param2, int param3, int param4) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var12 = 0;
        int var13 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var14 = 0;
        if (param0 >= field_d) {
            if (param0 >= field_i) {
                return;
            }
            if (param1 < field_f) {
                param2 = param2 - (field_f - param1);
                param1 = field_f;
            }
            if (param1 + param2 > field_c) {
                param2 = field_c - param1;
            }
            var5 = 256 - param4;
            var6 = (param3 >> 16 & 255) * param4;
            var7 = (param3 >> 8 & 255) * param4;
            var8 = (param3 & 255) * param4;
            var12 = param0 + param1 * field_e;
            for (var13 = 0; var13 < param2; var13++) {
                var9 = (field_l[var12] >> 16 & 255) * var5;
                var10 = (field_l[var12] >> 8 & 255) * var5;
                var11 = (field_l[var12] & 255) * var5;
                var14 = (var6 + var9 >> 8 << 16) + (var7 + var10 >> 8 << 8) + (var8 + var11 >> 8);
                field_l[var12] = var14;
                var12 = var12 + field_e;
            }
            return;
        }
    }

    final static void f(int param0, int param1, int param2, int param3) {
        int incrementValue$0 = 0;
        int incrementValue$1 = 0;
        int incrementValue$2 = 0;
        int incrementValue$3 = 0;
        int incrementValue$4 = 0;
        int incrementValue$5 = 0;
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        int var9;
        int var10;
        int var11;
        int var12;
        int var13;
        int var14;
        int var15;
        if (param2 != 0) {
          L0: {
            if (param2 >= 0) {
              break L0;
            } else {
              param2 = -param2;
              break L0;
            }
          }
          L1: {
            var4 = param1 - param2;
            if (var4 >= field_f) {
              break L1;
            } else {
              var4 = field_f;
              break L1;
            }
          }
          L2: {
            var5 = param1 + param2 + 1;
            if (var5 <= field_c) {
              break L2;
            } else {
              var5 = field_c;
              break L2;
            }
          }
          L3: {
            var6 = var4;
            var7 = param2 * param2;
            var8 = 0;
            var9 = param1 - var6;
            var10 = var9 * var9;
            var11 = var10 - var9;
            if (param1 <= var5) {
              break L3;
            } else {
              param1 = var5;
              break L3;
            }
          }
          L4: while (true) {
            if (var6 >= param1) {
              var8 = param2;
              var9 = var6 - param1;
              var11 = var9 * var9 + var7;
              var10 = var11 - var8;
              var11 = var11 - var9;
              L5: while (true) {
                if (var6 >= var5) {
                  return;
                } else {
                  L6: while (true) {
                    L7: {
                      if (var11 <= var7) {
                        break L7;
                      } else {
                        if (var10 <= var7) {
                          break L7;
                        } else {
                          incrementValue$0 = var8;
                          var8--;
                          var11 = var11 - (incrementValue$0 + var8);
                          var10 = var10 - (var8 + var8);
                          continue L6;
                        }
                      }
                    }
                    L8: {
                      var12 = param0 - var8;
                      if (var12 >= field_d) {
                        break L8;
                      } else {
                        var12 = field_d;
                        break L8;
                      }
                    }
                    L9: {
                      var13 = param0 + var8;
                      if (var13 <= field_i - 1) {
                        break L9;
                      } else {
                        var13 = field_i - 1;
                        break L9;
                      }
                    }
                    var14 = var12 + var6 * field_e;
                    var15 = var12;
                    L10: while (true) {
                      if (var15 > var13) {
                        var6++;
                        var11 = var11 + (var9 + var9);
                        incrementValue$1 = var9;
                        var9++;
                        var10 = var10 + (incrementValue$1 + var9);
                        continue L5;
                      } else {
                        incrementValue$2 = var14;
                        var14++;
                        field_l[incrementValue$2] = param3;
                        var15++;
                        continue L10;
                      }
                    }
                  }
                }
              }
            } else {
              L11: while (true) {
                L12: {
                  if (var11 <= var7) {
                    break L12;
                  } else {
                    if (var10 > var7) {
                      L13: {
                        var12 = param0 - var8 + 1;
                        if (var12 >= field_d) {
                          break L13;
                        } else {
                          var12 = field_d;
                          break L13;
                        }
                      }
                      L14: {
                        var13 = param0 + var8;
                        if (var13 <= field_i) {
                          break L14;
                        } else {
                          var13 = field_i;
                          break L14;
                        }
                      }
                      var14 = var12 + var6 * field_e;
                      var15 = var12;
                      L15: while (true) {
                        if (var15 >= var13) {
                          var6++;
                          incrementValue$3 = var9;
                          var9--;
                          var10 = var10 - (incrementValue$3 + var9);
                          var11 = var11 - (var9 + var9);
                          continue L4;
                        } else {
                          incrementValue$4 = var14;
                          var14++;
                          field_l[incrementValue$4] = param3;
                          var15++;
                          continue L15;
                        }
                      }
                    } else {
                      break L12;
                    }
                  }
                }
                var10 = var10 + (var8 + var8);
                incrementValue$5 = var8;
                var8++;
                var11 = var11 + (incrementValue$5 + var8);
                continue L11;
              }
            }
          }
        } else {
          bi.a(param0, param1, param3);
          return;
        }
    }

    final static void c() {
        int incrementValue$0 = 0;
        int incrementValue$1 = 0;
        int incrementValue$2 = 0;
        int incrementValue$3 = 0;
        int incrementValue$4 = 0;
        int incrementValue$5 = 0;
        int incrementValue$6 = 0;
        int incrementValue$7 = 0;
        int incrementValue$8 = 0;
        int var0 = 0;
        int var1 = field_e * field_j - 7;
        while (var0 < var1) {
            incrementValue$0 = var0;
            var0++;
            field_l[incrementValue$0] = 0;
            incrementValue$1 = var0;
            var0++;
            field_l[incrementValue$1] = 0;
            incrementValue$2 = var0;
            var0++;
            field_l[incrementValue$2] = 0;
            incrementValue$3 = var0;
            var0++;
            field_l[incrementValue$3] = 0;
            incrementValue$4 = var0;
            var0++;
            field_l[incrementValue$4] = 0;
            incrementValue$5 = var0;
            var0++;
            field_l[incrementValue$5] = 0;
            incrementValue$6 = var0;
            var0++;
            field_l[incrementValue$6] = 0;
            incrementValue$7 = var0;
            var0++;
            field_l[incrementValue$7] = 0;
        }
        var1 += 7;
        while (var0 < var1) {
            incrementValue$8 = var0;
            var0++;
            field_l[incrementValue$8] = 0;
        }
    }

    final static void a() {
        field_d = 0;
        field_f = 0;
        field_i = field_e;
        field_c = field_j;
        bi.b();
    }

    static {
        field_f = 0;
        field_d = 0;
        field_i = 0;
        field_c = 0;
    }
}
