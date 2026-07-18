/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class od {
    final static void b(ka param0, int param1, int param2, int param3, int param4) {
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
        if (param0.field_x != 0) {
          L0: {
            var5 = param0.field_x;
            var6 = param0.field_u;
            var7 = 0;
            var8 = 32768 / var5;
            var9 = 0;
            if (param1 >= qg.field_a) {
              break L0;
            } else {
              var6 = var6 - (qg.field_a - param1);
              var9 = var9 + (qg.field_a - param1);
              param1 = qg.field_a;
              break L0;
            }
          }
          L1: {
            if (param2 >= qg.field_k) {
              break L1;
            } else {
              var7 = var7 + (qg.field_k - param2) * var8;
              var5 = var5 - (qg.field_k - param2);
              var9 = var9 + (qg.field_k - param2) * qg.field_g;
              param2 = qg.field_k;
              break L1;
            }
          }
          L2: {
            if (param1 + var6 <= qg.field_c) {
              break L2;
            } else {
              var6 = qg.field_c - param1;
              break L2;
            }
          }
          L3: {
            if (param2 + var5 <= qg.field_l) {
              break L3;
            } else {
              var5 = qg.field_l - param2;
              break L3;
            }
          }
          var10 = qg.field_g - var6;
          var11 = param0.field_u - var6;
          var12 = param1 + param2 * qg.field_g;
          param2 = -var5;
          L4: while (true) {
            if (param2 >= 0) {
              return;
            } else {
              var13 = var7 >> 8;
              if (var13 >= 0) {
                L5: {
                  if (var13 <= 255) {
                    break L5;
                  } else {
                    var13 = 255;
                    break L5;
                  }
                }
                param1 = -var6;
                L6: while (true) {
                  if (param1 >= 0) {
                    var12 = var12 + var10;
                    var9 = var9 + var11;
                    var7 = var7 + var8;
                    param2++;
                    continue L4;
                  } else {
                    int incrementValue$2 = var9;
                    var9++;
                    var14 = param0.field_y[incrementValue$2];
                    if (var14 == 0) {
                      var12++;
                      param1++;
                      continue L6;
                    } else {
                      var15 = (var14 & 16711935) * var13;
                      var14 = (var15 & -16711936) + (var14 * var13 - var15 & 16711680) >>> 8;
                      var15 = qg.field_i[var12];
                      var16 = var14 + var15;
                      var14 = (var14 & 16711935) + (var15 & 16711935);
                      var15 = (var14 & 16777472) + (var16 - var14 & 65536);
                      int incrementValue$3 = var12;
                      var12++;
                      qg.field_i[incrementValue$3] = var16 - var15 | var15 - (var15 >>> 8);
                      param1++;
                      continue L6;
                    }
                  }
                }
              } else {
                param2++;
                continue L4;
              }
            }
          }
        } else {
          return;
        }
    }

    final static void a(ka param0, int param1) {
        od.a(qg.field_i, param0.field_y, 0, 0, 0, 0, 0, param0.field_u, param0.field_x, qg.field_g - param0.field_u, 0, param1);
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
                  param1 = (param0 & 16711935) << param13;
                  param0 = (param1 & -16711936) + ((param0 << param13) - param1 & 16711680) >>> 8;
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

    final static void c(ka param0, int param1, int param2, int param3, int param4) {
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
        if (param3 <= param0.field_q) {
          L0: {
            var5 = param0.field_s * param3 / param0.field_q;
            var6 = ((param0.field_s + param0.field_u) * param3 + param0.field_q - 1) / param0.field_q;
            var7 = param0.field_p * param0.field_x / param0.field_v;
            var8 = ((param0.field_p + param0.field_x) * param0.field_x + param0.field_v - 1) / param0.field_v;
            if (var5 >= qg.field_a) {
              break L0;
            } else {
              var5 = qg.field_a;
              break L0;
            }
          }
          L1: {
            if (var6 <= qg.field_c) {
              break L1;
            } else {
              var6 = qg.field_c;
              break L1;
            }
          }
          L2: {
            if (var7 >= qg.field_k) {
              break L2;
            } else {
              var7 = qg.field_k;
              break L2;
            }
          }
          L3: {
            if (var8 <= qg.field_l) {
              break L3;
            } else {
              var8 = qg.field_l;
              break L3;
            }
          }
          L4: {
            if (var5 >= var6) {
              break L4;
            } else {
              if (var7 < var8) {
                var9 = var7 * qg.field_g + var5;
                var10 = qg.field_g;
                var11 = var9;
                var12 = var5;
                L5: while (true) {
                  if (var12 >= var6) {
                    return;
                  } else {
                    var11 = var9;
                    var13 = var12 << 4;
                    var14 = var13 * param0.field_q / param3 - (param0.field_s << 4);
                    var15 = (var13 + 16) * param0.field_q / param3 - (param0.field_s << 4);
                    var16 = var15 - var14;
                    if (var16 != 0) {
                      L6: {
                        if (var14 >= 0) {
                          break L6;
                        } else {
                          var14 = 0;
                          break L6;
                        }
                      }
                      L7: {
                        if (var15 <= param0.field_u << 4) {
                          break L7;
                        } else {
                          var15 = param0.field_u << 4;
                          break L7;
                        }
                      }
                      var14 = var14 >> 4;
                      var15 = var15 >> 4;
                      var16 = var15 - var14;
                      var17 = var7;
                      L8: while (true) {
                        if (var17 >= var8) {
                          var9 = var11;
                          var9++;
                          var12++;
                          continue L5;
                        } else {
                          L9: {
                            var18 = var17 - param0.field_p;
                            if (var18 >= 0) {
                              break L9;
                            } else {
                              var18 = 0;
                              break L9;
                            }
                          }
                          L10: {
                            if (var18 <= param0.field_x) {
                              break L10;
                            } else {
                              var18 = param0.field_x;
                              break L10;
                            }
                          }
                          var19 = 0;
                          var20 = 0;
                          var21 = var14;
                          L11: while (true) {
                            if (var21 >= var15) {
                              L12: {
                                var21 = fj.a(1870096848, var19 & -65536, lj.field_j[var16]) >> 16;
                                var22 = fj.a(1870096848, (var19 & 65535) << 16, lj.field_j[var16]) >> 16;
                                var23 = fj.a(1870096848, (var20 & 16776960) << 8, lj.field_j[var16]) >> 16;
                                var24 = (var21 << 16) + (var23 << 8) + var22;
                                if (var24 != 0) {
                                  break L12;
                                } else {
                                  var24 = 1;
                                  break L12;
                                }
                              }
                              L13: {
                                if (var24 == 0) {
                                  break L13;
                                } else {
                                  qg.field_i[var9] = var24;
                                  break L13;
                                }
                              }
                              var9 = var9 + var10;
                              var17++;
                              continue L8;
                            } else {
                              var22 = param0.field_y[var18 * param0.field_u + var21];
                              var19 = var19 + (var22 & 16711935);
                              var20 = var20 + (var22 & 65280);
                              var21++;
                              continue L11;
                            }
                          }
                        }
                      }
                    } else {
                      var12++;
                      continue L5;
                    }
                  }
                }
              } else {
                break L4;
              }
            }
          }
          return;
        } else {
          throw new IllegalArgumentException();
        }
    }

    private final static void b(int[] param0, int[] param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11) {
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        var12 = -param9;
        L0: while (true) {
          if (var12 > 0) {
            return;
          } else {
            var13 = -param8;
            L1: while (true) {
              if (var13 > 0) {
                L2: {
                  if (param11 <= 0) {
                    break L2;
                  } else {
                    L3: {
                      param5 = 0;
                      param6 = 0;
                      param7 = 0;
                      int incrementValue$6 = param4;
                      param4++;
                      param2 = param1[incrementValue$6];
                      if (param2 != 0) {
                        break L3;
                      } else {
                        param2 = param0[param3];
                        break L3;
                      }
                    }
                    L4: {
                      param5 = param5 + (param2 >> 16);
                      param6 = param6 + (param2 >> 8 & 255);
                      param7 = param7 + (param2 & 255);
                      param4 = param4 + (param10 - 1);
                      int incrementValue$7 = param4;
                      param4++;
                      param2 = param1[incrementValue$7];
                      if (param2 != 0) {
                        break L4;
                      } else {
                        param2 = param0[param3];
                        break L4;
                      }
                    }
                    param5 = param5 + (param2 >> 16);
                    param6 = param6 + (param2 >> 8 & 255);
                    param7 = param7 + (param2 & 255);
                    int incrementValue$8 = param3;
                    param3++;
                    param0[incrementValue$8] = param5 >> 1 << 16 | param6 >> 1 << 8 | param7 >> 1;
                    param4 = param4 - param10;
                    break L2;
                  }
                }
                param4 = param4 + (param10 + (param10 - param8 - 2));
                param3 = param3 + (qg.field_g - (param8 + 2 >> 1) - param11);
                var12 += 2;
                continue L0;
              } else {
                param5 = 0;
                param6 = 0;
                param7 = 0;
                var14 = -2;
                L5: while (true) {
                  if (var14 >= 0) {
                    param4 = param4 + (param10 - 2);
                    var14 = -2;
                    L6: while (true) {
                      if (var14 >= 0) {
                        int incrementValue$9 = param3;
                        param3++;
                        param0[incrementValue$9] = param5 >> 2 << 16 | param6 >> 2 << 8 | param7 >> 2;
                        param4 = param4 - param10;
                        var13 += 2;
                        continue L1;
                      } else {
                        L7: {
                          int incrementValue$10 = param4;
                          param4++;
                          param2 = param1[incrementValue$10];
                          if (param2 != 0) {
                            break L7;
                          } else {
                            param2 = param0[param3];
                            break L7;
                          }
                        }
                        param5 = param5 + (param2 >> 16);
                        param6 = param6 + (param2 >> 8 & 255);
                        param7 = param7 + (param2 & 255);
                        var14++;
                        continue L6;
                      }
                    }
                  } else {
                    L8: {
                      int incrementValue$11 = param4;
                      param4++;
                      param2 = param1[incrementValue$11];
                      if (param2 != 0) {
                        break L8;
                      } else {
                        param2 = param0[param3];
                        break L8;
                      }
                    }
                    param5 = param5 + (param2 >> 16);
                    param6 = param6 + (param2 >> 8 & 255);
                    param7 = param7 + (param2 & 255);
                    var14++;
                    continue L5;
                  }
                }
              }
            }
          }
        }
    }

    final static void a(ka param0, int param1, int param2) {
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
          var3 = param0.field_u >> 1;
          var4 = param0.field_x >> 1;
          param1 = param1 + param0.field_s / 2;
          param2 = param2 + param0.field_p / 2;
          if (param1 >= qg.field_a) {
            stackOut_2_0 = 0;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          } else {
            stackOut_1_0 = qg.field_a - param1 << 1;
            stackIn_3_0 = stackOut_1_0;
            break L0;
          }
        }
        L1: {
          var5 = stackIn_3_0;
          if (param1 + var3 <= qg.field_c) {
            stackOut_5_0 = param0.field_u - 2;
            stackIn_6_0 = stackOut_5_0;
            break L1;
          } else {
            stackOut_4_0 = (qg.field_c - param1 << 1) - 2;
            stackIn_6_0 = stackOut_4_0;
            break L1;
          }
        }
        L2: {
          var6 = stackIn_6_0;
          if (param2 >= qg.field_k) {
            stackOut_8_0 = 0;
            stackIn_9_0 = stackOut_8_0;
            break L2;
          } else {
            stackOut_7_0 = qg.field_k - param2 << 1;
            stackIn_9_0 = stackOut_7_0;
            break L2;
          }
        }
        L3: {
          var7 = stackIn_9_0;
          if (param2 + var4 <= qg.field_l) {
            stackOut_11_0 = param0.field_x - 2;
            stackIn_12_0 = stackOut_11_0;
            break L3;
          } else {
            stackOut_10_0 = (qg.field_l - param2 << 1) - 2;
            stackIn_12_0 = stackOut_10_0;
            break L3;
          }
        }
        L4: {
          var8 = stackIn_12_0;
          if (param1 >= qg.field_a) {
            break L4;
          } else {
            param1 = qg.field_a;
            break L4;
          }
        }
        L5: {
          if (param1 <= qg.field_c) {
            break L5;
          } else {
            param1 = qg.field_c;
            break L5;
          }
        }
        L6: {
          if (param2 >= qg.field_k) {
            break L6;
          } else {
            param2 = qg.field_k;
            break L6;
          }
        }
        L7: {
          if (param2 <= qg.field_l) {
            break L7;
          } else {
            param2 = qg.field_l;
            break L7;
          }
        }
        var9 = param2 * qg.field_g + param1;
        var10 = var7 * param0.field_u + var5;
        var11 = var6 - var5;
        var12 = var8 - var7;
        var13 = var11 - (var11 >> 1 << 1);
        od.b(qg.field_i, param0.field_y, 0, var9, var10, 0, 0, 0, var11, var12, param0.field_u, var13);
    }

    private final static void a(int[] param0, int[] param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11) {
        int var12 = 0;
        int var13 = 0;
        for (var12 = -param8; var12 < 0; var12++) {
            for (var13 = -param7; var13 < 0; var13++) {
                int incrementValue$0 = param5;
                param5++;
                param2 = param1[incrementValue$0];
                param3 = (param2 & 16711935) * param11 & -16711936;
                param4 = (param2 & 65280) * param11 & 16711680;
                int incrementValue$1 = param6;
                param6++;
                param0[incrementValue$1] = (param3 | param4) >>> 8;
            }
            param6 = param6 + param9;
            param5 = param5;
        }
    }

    private final static void a(int[] param0, int[] param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11, int[] param12) {
        int var13 = 0;
        int var14 = 0;
        for (var13 = -param9; var13 < 0; var13++) {
            for (var14 = -param8; var14 < 0; var14++) {
                int incrementValue$0 = param5;
                param5++;
                param2 = param1[incrementValue$0];
                param7 = var14 + param8;
                param3 = (param2 & 16711935) * param12[param7] & -16711936;
                param4 = (param2 & 65280) * param12[param7] & 16711680;
                int incrementValue$1 = param6;
                param6++;
                param0[incrementValue$1] = (param3 | param4) >>> 8;
            }
            param6 = param6 + param10;
            param5 = param5;
        }
    }

    final static void a(ka param0, int param1, int param2, int param3, int param4) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        L0: {
          param1 = param1 - param0.field_s;
          param2 = param2 - param0.field_p;
          var5 = param2 * param0.field_u + param1;
          if (var5 < 0) {
            break L0;
          } else {
            if (var5 < param0.field_y.length) {
              L1: {
                var6 = param1 + param3;
                if (var6 <= param0.field_u) {
                  break L1;
                } else {
                  var6 = param0.field_u;
                  break L1;
                }
              }
              L2: {
                param3 = var6 - param1;
                var7 = param2 + param4;
                if (var7 <= param0.field_x) {
                  break L2;
                } else {
                  var7 = param0.field_x;
                  break L2;
                }
              }
              param4 = var7 - param2;
              var8 = param0.field_u - param3;
              od.a(param0.field_y, var5, var8, param3, param4);
              return;
            } else {
              break L0;
            }
          }
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, ka param5) {
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        L0: {
          param0 = param0 + param5.field_s;
          param1 = param1 + param5.field_p;
          var6 = param0 + param1 * qg.field_g;
          var7 = 0;
          var8 = param5.field_x;
          var9 = param5.field_u;
          var10 = qg.field_g - var9;
          var11 = 0;
          if (param1 >= qg.field_k) {
            break L0;
          } else {
            var12 = qg.field_k - param1;
            var8 = var8 - var12;
            param1 = qg.field_k;
            var7 = var7 + var12 * var9;
            var6 = var6 + var12 * qg.field_g;
            break L0;
          }
        }
        L1: {
          if (param1 + var8 <= qg.field_l) {
            break L1;
          } else {
            var8 = var8 - (param1 + var8 - qg.field_l);
            break L1;
          }
        }
        L2: {
          if (param0 >= qg.field_a) {
            break L2;
          } else {
            var12 = qg.field_a - param0;
            var9 = var9 - var12;
            param0 = qg.field_a;
            var7 = var7 + var12;
            var6 = var6 + var12;
            var11 = var11 + var12;
            var10 = var10 + var12;
            break L2;
          }
        }
        L3: {
          if (param0 + var9 <= qg.field_c) {
            break L3;
          } else {
            var12 = param0 + var9 - qg.field_c;
            var9 = var9 - var12;
            var11 = var11 + var12;
            var10 = var10 + var12;
            break L3;
          }
        }
        L4: {
          if (var9 <= 0) {
            break L4;
          } else {
            if (var8 > 0) {
              L5: {
                if (param2 != 0) {
                  if (param3 != 256) {
                    od.a(0, 0, 0, qg.field_i, param5.field_y, var7, 0, var6, 0, var9, var8, var10, var11, param2, param3, param4);
                    break L5;
                  } else {
                    od.a(0, 0, 0, qg.field_i, param5.field_y, var7, 0, var6, 0, var9, var8, var10, var11);
                    break L5;
                  }
                } else {
                  od.a(0, 0, 0, qg.field_i, param5.field_y, var7, 0, var6, 0, var9, var8, var10, var11, param3);
                  break L5;
                }
              }
              return;
            } else {
              break L4;
            }
          }
        }
    }

    private final static void a(int[] param0, int param1, int param2, int param3, int param4) {
        int var5 = 0;
        int var6 = 0;
        var5 = -param4;
        L0: while (true) {
          if (var5 >= 0) {
            return;
          } else {
            var6 = -param3;
            L1: while (true) {
              if (var6 >= 0) {
                param1 = param1 + param2;
                var5++;
                continue L0;
              } else {
                if (param0[param1] == 0) {
                  param0[param1] = 1;
                  param1++;
                  var6++;
                  continue L1;
                } else {
                  param1++;
                  var6++;
                  continue L1;
                }
              }
            }
          }
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, ka param6, ka param7, int[] param8) {
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
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
        int[][][] var29 = null;
        var9 = 16777215;
        var10 = 17;
        var11 = 22;
        var29 = new int[2][4][2];
        var15 = 0;
        L0: while (true) {
          if (var15 >= 2) {
            var24 = 0;
            L1: while (true) {
              if (var24 >= 4) {
                param6.d();
                qg.f(33 + var10, 30 + var11, 34, 46, var9);
                la.field_f.a(115);
                return;
              } else {
                fi.c();
                var13 = 0;
                var14 = 1;
                var17 = 0;
                var18 = 0;
                var25 = 0;
                L2: while (true) {
                  if (var25 >= 4) {
                    L3: {
                      L4: {
                        fi.a(param8, 0, 8);
                        var15 = 65793;
                        var16 = var9;
                        var19 = 68;
                        var20 = var11;
                        var21 = 0;
                        if (var24 == 0) {
                          break L4;
                        } else {
                          if (var24 != 2) {
                            break L3;
                          } else {
                            break L4;
                          }
                        }
                      }
                      var19 = 68;
                      var20 = var11;
                      break L3;
                    }
                    L5: {
                      L6: {
                        if (var24 == 1) {
                          break L6;
                        } else {
                          if (var24 != 3) {
                            break L5;
                          } else {
                            break L6;
                          }
                        }
                      }
                      var19 = 90;
                      var20 = var10;
                      break L5;
                    }
                    L7: {
                      if (var24 != 0) {
                        break L7;
                      } else {
                        var21 = 0;
                        break L7;
                      }
                    }
                    L8: {
                      if (var24 != 1) {
                        break L8;
                      } else {
                        var21 = 90;
                        break L8;
                      }
                    }
                    L9: {
                      if (var24 != 2) {
                        break L9;
                      } else {
                        var21 = 180;
                        break L9;
                      }
                    }
                    L10: {
                      if (var24 != 3) {
                        break L10;
                      } else {
                        var21 = 270;
                        break L10;
                      }
                    }
                    L11: {
                      param7.d();
                      qg.b();
                      qg.c(0, 0, var19, var20, var15, var16);
                      la.field_f.a(-99);
                      var22 = 33;
                      var23 = 30;
                      if (var21 != 90) {
                        break L11;
                      } else {
                        param7.f();
                        var22 = 11;
                        break L11;
                      }
                    }
                    L12: {
                      if (var21 != 180) {
                        break L12;
                      } else {
                        param7.e();
                        break L12;
                      }
                    }
                    L13: {
                      if (var21 != 270) {
                        break L13;
                      } else {
                        param7.b();
                        break L13;
                      }
                    }
                    param6.d();
                    param7.e(var22, var23);
                    la.field_f.a(-86);
                    var24++;
                    continue L1;
                  } else {
                    L14: {
                      L15: {
                        if (var25 == 0) {
                          break L15;
                        } else {
                          if (var25 != 3) {
                            break L14;
                          } else {
                            break L15;
                          }
                        }
                      }
                      var18 = var24;
                      break L14;
                    }
                    L16: {
                      L17: {
                        if (var25 == 1) {
                          break L17;
                        } else {
                          if (var25 != 2) {
                            break L16;
                          } else {
                            break L17;
                          }
                        }
                      }
                      var18 = (var24 + 1) % 4;
                      break L16;
                    }
                    L18: {
                      L19: {
                        if (var25 == 0) {
                          break L19;
                        } else {
                          if (var25 != 1) {
                            break L18;
                          } else {
                            break L19;
                          }
                        }
                      }
                      var17 = 0;
                      break L18;
                    }
                    L20: {
                      L21: {
                        if (var25 == 2) {
                          break L21;
                        } else {
                          if (var25 != 3) {
                            break L20;
                          } else {
                            break L21;
                          }
                        }
                      }
                      var17 = 1;
                      break L20;
                    }
                    param8[var13] = var29[var17][var18][0];
                    param8[var14] = var29[var17][var18][1];
                    var13 += 2;
                    var14 += 2;
                    var25++;
                    continue L2;
                  }
                }
              }
            }
          } else {
            var16 = 0;
            L22: while (true) {
              if (var16 >= 4) {
                var15++;
                continue L0;
              } else {
                L23: {
                  L24: {
                    var13 = 33;
                    if (var16 == 0) {
                      break L24;
                    } else {
                      if (var16 != 3) {
                        break L23;
                      } else {
                        break L24;
                      }
                    }
                  }
                  L25: {
                    if (var15 != 0) {
                      break L25;
                    } else {
                      var13 = 33;
                      break L25;
                    }
                  }
                  if (var15 != 1) {
                    break L23;
                  } else {
                    var13 = 33 + var10;
                    break L23;
                  }
                }
                L26: {
                  L27: {
                    if (var16 == 1) {
                      break L27;
                    } else {
                      if (var16 != 2) {
                        break L26;
                      } else {
                        break L27;
                      }
                    }
                  }
                  L28: {
                    if (var15 != 0) {
                      break L28;
                    } else {
                      var13 = 101;
                      break L28;
                    }
                  }
                  if (var15 != 1) {
                    break L26;
                  } else {
                    var13 = 33 + var10 + 34;
                    break L26;
                  }
                }
                L29: {
                  L30: {
                    var29[var15][var16][0] = var13;
                    var14 = 30;
                    if (var16 == 0) {
                      break L30;
                    } else {
                      if (var16 != 1) {
                        break L29;
                      } else {
                        break L30;
                      }
                    }
                  }
                  L31: {
                    if (var15 != 0) {
                      break L31;
                    } else {
                      var14 = 30;
                      break L31;
                    }
                  }
                  if (var15 != 1) {
                    break L29;
                  } else {
                    var14 = 30 + var11;
                    break L29;
                  }
                }
                L32: {
                  L33: {
                    if (var16 == 2) {
                      break L33;
                    } else {
                      if (var16 != 3) {
                        break L32;
                      } else {
                        break L33;
                      }
                    }
                  }
                  L34: {
                    if (var15 != 0) {
                      break L34;
                    } else {
                      var14 = 120;
                      break L34;
                    }
                  }
                  if (var15 != 1) {
                    break L32;
                  } else {
                    var14 = 30 + var11 + 45;
                    break L32;
                  }
                }
                var29[var15][var16][1] = var14;
                var16++;
                continue L22;
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

    private final static void a(int param0, int param1, int param2, int[] param3, int[] param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11, int param12, int param13, int param14, int param15) {
        L0: {
          if (param13 <= 0) {
            param8 = -param10;
            L1: while (true) {
              if (param8 >= 0) {
                break L0;
              } else {
                param6 = -param9;
                L2: while (true) {
                  if (param6 >= 0) {
                    param7 = param7 + param11;
                    param5 = param5 + param12;
                    param8++;
                    continue L1;
                  } else {
                    int incrementValue$4 = param5;
                    param5++;
                    param0 = param4[incrementValue$4];
                    if (param0 == 0) {
                      param7++;
                      param6++;
                      continue L2;
                    } else {
                      param1 = param0 & 16711935;
                      param1 = (param1 << param14) - (param1 << param15);
                      param0 = (param1 & -16711936) + ((param0 << param14) - (param0 << param15) - param1 & 16711680) >>> 8;
                      param1 = param3[param7];
                      param2 = param0 + param1;
                      param0 = (param0 & 16711935) + (param1 & 16711935);
                      param1 = (param0 & 16777472) + (param2 - param0 & 65536);
                      int incrementValue$5 = param7;
                      param7++;
                      param3[incrementValue$5] = param2 - param1 | param1 - (param1 >>> 8);
                      param6++;
                      continue L2;
                    }
                  }
                }
              }
            }
          } else {
            param8 = -param10;
            L3: while (true) {
              if (param8 >= 0) {
                break L0;
              } else {
                param6 = -param9;
                L4: while (true) {
                  if (param6 >= 0) {
                    param7 = param7 + param11;
                    param5 = param5 + param12;
                    param8++;
                    continue L3;
                  } else {
                    int incrementValue$6 = param5;
                    param5++;
                    param0 = param4[incrementValue$6];
                    if (param0 == 0) {
                      param7++;
                      param6++;
                      continue L4;
                    } else {
                      param1 = param0 & 16711935;
                      param1 = (param1 << param14) + (param1 << param15);
                      param0 = (param1 & -16711936) + ((param0 << param14) + (param0 << param15) - param1 & 16711680) >>> 8;
                      param1 = param3[param7];
                      param2 = param0 + param1;
                      param0 = (param0 & 16711935) + (param1 & 16711935);
                      param1 = (param0 & 16777472) + (param2 - param0 & 65536);
                      int incrementValue$7 = param7;
                      param7++;
                      param3[incrementValue$7] = param2 - param1 | param1 - (param1 >>> 8);
                      param6++;
                      continue L4;
                    }
                  }
                }
              }
            }
          }
        }
    }

    final static void a(ka param0, int[] param1) {
        od.a(qg.field_i, param0.field_y, 0, 0, 0, 0, 0, 0, param0.field_q, param0.field_v, qg.field_g - param0.field_q, 0, param1);
    }
}
