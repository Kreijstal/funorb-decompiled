/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fi {
    private static int field_a;
    private static int field_e;
    private static int field_g;
    private static int field_h;
    private static int field_f;
    private static int field_d;
    private static int[] field_b;
    private static int field_i;
    private static int field_c;

    final static void a(int param0, int param1, int param2, tf param3, int param4) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        param0 = param0 - (param3.field_A >> 1);
        var5 = param2 - 5;
        var6 = param2 - 4;
        var7 = 0;
        L0: while (true) {
          if (var7 >= param2) {
            return;
          } else {
            L1: {
              if (var7 < 3) {
                break L1;
              } else {
                if (var7 <= var6) {
                  if (var7 >= 5) {
                    if (var7 < var5) {
                      param3.b(param0, param1 + var7, 256);
                      var7++;
                      continue L0;
                    } else {
                      var7++;
                      continue L0;
                    }
                  } else {
                    var7++;
                    continue L0;
                  }
                } else {
                  break L1;
                }
              }
            }
            fi.a(param3, param0, param1 + var7, param4);
            var7++;
            continue L0;
          }
        }
    }

    public static void a() {
        field_b = null;
    }

    private final static void a(int[] param0, int[] param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10) {
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        var11 = param9 >> 8;
        var12 = 256 - var11;
        var13 = -param6;
        L0: while (true) {
          if (var13 >= 0) {
            return;
          } else {
            L1: {
              if (var11 <= 0) {
                param3 = param3 + param5;
                param4 = param4 + param5;
                break L1;
              } else {
                var14 = -param5;
                L2: while (true) {
                  if (var14 >= 0) {
                    break L1;
                  } else {
                    int incrementValue$82 = param3;
                    param3++;
                    param2 = param1[incrementValue$82];
                    if (param2 == 0) {
                      param4++;
                      var14++;
                      continue L2;
                    } else {
                      var15 = param0[param4];
                      int incrementValue$83 = param4;
                      param4++;
                      param0[incrementValue$83] = ((param2 & 16711935) * var11 + (var15 & 16711935) * var12 & -16711936) + ((param2 & 65280) * var11 + (var15 & 65280) * var12 & 16711680) >> 8;
                      var14++;
                      continue L2;
                    }
                  }
                }
              }
            }
            param4 = param4 + param7;
            param3 = param3 + param8;
            param9 = param9 + param10;
            var11 = param9 >> 8;
            var12 = 256 - var11;
            var13++;
            continue L0;
          }
        }
    }

    private final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int[] param6, int param7, int param8, int param9, int param10, int param11, int param12, int param13) {
        int var14 = 0;
        int stackIn_16_0 = 0;
        int stackIn_19_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_18_0 = 0;
        int stackOut_17_0 = 0;
        L0: while (true) {
          if (param11 >= 0) {
            return;
          } else {
            field_h = field_f;
            field_e = field_c;
            var14 = param12;
            L1: while (true) {
              if (var14 >= 0) {
                param7 = param7 + param13;
                param11++;
                field_i = field_i + param9;
                field_a = field_a + param10;
                continue L0;
              } else {
                L2: {
                  param1 = field_e - field_i >> 16;
                  if (param1 >= -param2) {
                    if (param1 <= param2) {
                      param0 = field_h + field_a >> 16;
                      if (param0 >= -param2) {
                        if (param0 <= param5 + param2) {
                          L3: {
                            if (param0 >= param2) {
                              if (param0 <= param5 - param2) {
                                stackOut_15_0 = param8;
                                stackIn_16_0 = stackOut_15_0;
                                break L3;
                              } else {
                                stackOut_14_0 = (param5 + param2 - param0) * field_d >> 8;
                                stackIn_16_0 = stackOut_14_0;
                                break L3;
                              }
                            } else {
                              stackOut_12_0 = (param0 + param2) * field_d >> 8;
                              stackIn_16_0 = stackOut_12_0;
                              break L3;
                            }
                          }
                          L4: {
                            param3 = stackIn_16_0;
                            param4 = param1 * param3 * field_g >> 8;
                            if (param4 < 0) {
                              stackOut_18_0 = field_b[param3 + param4];
                              stackIn_19_0 = stackOut_18_0;
                              break L4;
                            } else {
                              stackOut_17_0 = field_b[param3 - param4];
                              stackIn_19_0 = stackOut_17_0;
                              break L4;
                            }
                          }
                          param1 = stackIn_19_0;
                          param0 = param6[param7];
                          param3 = param1 + param0;
                          param1 = (param1 & 16711935) + (param0 & 16711935);
                          param0 = (param1 & 16777472) + (param3 - param1 & 65536);
                          param6[param7] = param3 - param0 | param0 - (param0 >>> 8);
                          break L2;
                        } else {
                          break L2;
                        }
                      } else {
                        break L2;
                      }
                    } else {
                      break L2;
                    }
                  } else {
                    break L2;
                  }
                }
                var14++;
                param7++;
                field_h = field_h + param9;
                field_e = field_e + param10;
                continue L1;
              }
            }
          }
        }
    }

    final static void a(tf param0, hh param1, int param2, int param3) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        L0: {
          param2 = param2 + param0.field_D;
          param3 = param3 + param0.field_y;
          var4 = param2 + param3 * t.field_j;
          var5 = 0;
          var6 = param0.field_E;
          var7 = param0.field_F;
          var8 = t.field_j - var7;
          var9 = 0;
          if (param3 >= t.field_f) {
            break L0;
          } else {
            var10 = t.field_f - param3;
            var6 = var6 - var10;
            param3 = t.field_f;
            var5 = var5 + var10 * var7;
            var4 = var4 + var10 * t.field_j;
            break L0;
          }
        }
        L1: {
          if (param3 + var6 <= t.field_a) {
            break L1;
          } else {
            var6 = var6 - (param3 + var6 - t.field_a);
            break L1;
          }
        }
        L2: {
          if (param2 >= t.field_e) {
            break L2;
          } else {
            var10 = t.field_e - param2;
            var7 = var7 - var10;
            param2 = t.field_e;
            var5 = var5 + var10;
            var4 = var4 + var10;
            var9 = var9 + var10;
            var8 = var8 + var10;
            break L2;
          }
        }
        L3: {
          if (param2 + var7 <= t.field_h) {
            break L3;
          } else {
            var10 = param2 + var7 - t.field_h;
            var7 = var7 - var10;
            var9 = var9 + var10;
            var8 = var8 + var10;
            break L3;
          }
        }
        L4: {
          if (var7 <= 0) {
            break L4;
          } else {
            if (var6 > 0) {
              fi.a(t.field_k, param0.field_G, 0, var5, var4, var7, var6, var8, var9, param1.field_n);
              return;
            } else {
              break L4;
            }
          }
        }
    }

    final static void a(int[] param0, int param1, int param2) {
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
        var3 = 480;
        var4 = 640;
        var5 = param1 << 8;
        var6 = (param2 - param1 << 8) / var3;
        var7 = 0;
        var8 = t.field_j - var4;
        var9 = 640 - var4;
        var10 = 0;
        var11 = 0;
        var12 = -var3;
        L0: while (true) {
          if (var12 >= 0) {
            return;
          } else {
            var13 = var5 >> 8;
            var14 = 256 - var13;
            if (var13 >= 0) {
              L1: {
                if (var13 <= 255) {
                  var11 = -var4;
                  L2: while (true) {
                    if (var11 >= 0) {
                      break L1;
                    } else {
                      int incrementValue$4 = var7;
                      var7++;
                      var15 = param0[incrementValue$4];
                      var16 = t.field_k[var10];
                      var17 = (var16 & 16711935) * var14 + (var15 & 16711935) * var13 >> 8 & 16711935;
                      int incrementValue$5 = var10;
                      var10++;
                      t.field_k[incrementValue$5] = var17 + ((var16 & 65280) * var14 + (var15 & 65280) * var13 >> 8 & 65280);
                      var11++;
                      continue L2;
                    }
                  }
                } else {
                  var11 = -var4;
                  L3: while (true) {
                    if (var11 >= 0) {
                      break L1;
                    } else {
                      int incrementValue$6 = var7;
                      var7++;
                      var15 = param0[incrementValue$6];
                      int incrementValue$7 = var10;
                      var10++;
                      t.field_k[incrementValue$7] = var15;
                      var11++;
                      continue L3;
                    }
                  }
                }
              }
              var10 = var10 + var8;
              var7 = var7 + var9;
              var5 = var5 + var6;
              var12++;
              continue L0;
            } else {
              var12++;
              continue L0;
            }
          }
        }
    }

    private final static void a(tf param0, int param1, int param2, int param3) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        L0: {
          param1 = param1 + param0.field_D;
          param2 = param2 + param0.field_y;
          var4 = param1 + param2 * t.field_j;
          var5 = 0;
          var6 = param0.field_E;
          var7 = param0.field_F;
          var8 = t.field_j - var7;
          var9 = 0;
          if (param2 >= t.field_f) {
            break L0;
          } else {
            var10 = t.field_f - param2;
            var6 = var6 - var10;
            param2 = t.field_f;
            var5 = var5 + var10 * var7;
            var4 = var4 + var10 * t.field_j;
            break L0;
          }
        }
        L1: {
          if (param2 + var6 <= t.field_a) {
            break L1;
          } else {
            var6 = var6 - (param2 + var6 - t.field_a);
            break L1;
          }
        }
        L2: {
          if (param1 >= t.field_e) {
            break L2;
          } else {
            var10 = t.field_e - param1;
            var7 = var7 - var10;
            param1 = t.field_e;
            var5 = var5 + var10;
            var4 = var4 + var10;
            var9 = var9 + var10;
            var8 = var8 + var10;
            break L2;
          }
        }
        L3: {
          if (param1 + var7 <= t.field_h) {
            break L3;
          } else {
            var10 = param1 + var7 - t.field_h;
            var7 = var7 - var10;
            var9 = var9 + var10;
            var8 = var8 + var10;
            break L3;
          }
        }
        L4: {
          if (var7 <= 0) {
            break L4;
          } else {
            if (var6 > 0) {
              fi.a(0, 0, 0, t.field_k, param0.field_G, var5, 0, var4, 0, var7, var6, var8, var9, param3);
              return;
            } else {
              break L4;
            }
          }
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int[] param6) {
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        if (jc.field_d) {
          L0: {
            var7 = param2 - param0;
            var8 = param3 - param1;
            var9 = (int)Math.sqrt((double)(var7 * var7 + var8 * var8));
            var10 = (int)(65536.0 / Math.sqrt((double)(var7 * var7 + var8 * var8)));
            var7 = var7 * var10;
            var8 = var8 * var10;
            var11 = param0;
            var12 = param1;
            var13 = param2;
            var14 = param3;
            if (var11 <= var13) {
              break L0;
            } else {
              var15 = var11;
              var11 = var13;
              var13 = var15;
              break L0;
            }
          }
          L1: {
            if (var12 <= var14) {
              break L1;
            } else {
              var15 = var12;
              var12 = var14;
              var14 = var15;
              break L1;
            }
          }
          L2: {
            var11 = var11 - param4;
            var12 = var12 - param4;
            var13 = var13 + param4;
            var14 = var14 + param4;
            if (var11 >= t.field_e) {
              break L2;
            } else {
              var11 = t.field_e;
              break L2;
            }
          }
          L3: {
            if (var12 >= t.field_f) {
              break L3;
            } else {
              var12 = t.field_f;
              break L3;
            }
          }
          L4: {
            if (var13 <= t.field_h) {
              break L4;
            } else {
              var13 = t.field_h;
              break L4;
            }
          }
          L5: {
            if (var14 <= t.field_a) {
              break L5;
            } else {
              var14 = t.field_a;
              break L5;
            }
          }
          field_g = 256 / param4;
          field_d = param5 * 128 / param4;
          field_i = (var12 - param1) * var7;
          field_a = (var12 - param1) * var8;
          field_f = (var11 - param0) * var7;
          field_c = (var11 - param0) * var8;
          field_b = param6;
          fi.a(param0, param1, param4, 0, 0, var9, t.field_k, var12 * t.field_j + var11, param5, var7, var8, var12 - var14, var11 - var13, t.field_j - (var13 - var11));
          return;
        } else {
          t.b(param0, param1, param2, param3, param6[param5]);
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
                param0 = param4[incrementValue$66] & 255;
                if (param0 == 0) {
                  param7++;
                  param6++;
                  continue L1;
                } else {
                  param2 = param3[param7];
                  param1 = 255 - param0;
                  int incrementValue$67 = param7;
                  param7++;
                  param3[incrementValue$67] = ((param2 & 16711935) * param1 & -16711936) + ((param2 & 65280) * param1 & 16711680) + ((param13 & 16711935) * param0 & -16711936) + ((param13 & 65280) * param0 & 16711680) >> 8;
                  param6++;
                  continue L1;
                }
              }
            }
          }
        }
    }

    final static void a(int param0, int param1, int param2, int param3) {
        int var10 = 0;
        int var11 = 0;
        int var8 = 0;
        int var9 = 0;
        int var12 = 0;
        if (param0 < t.field_e) {
            param2 = param2 - (t.field_e - param0);
            param0 = t.field_e;
        }
        if (param1 < t.field_f) {
            param3 = param3 - (t.field_f - param1);
            param1 = t.field_f;
        }
        if (param0 + param2 > t.field_h) {
            param2 = t.field_h - param0;
        }
        if (param1 + param3 > t.field_a) {
            param3 = t.field_a - param1;
        }
        int var6 = t.field_j - param2;
        int var7 = param0 + param1 * t.field_j;
        for (var10 = -param3; var10 < 0; var10++) {
            for (var11 = -param2; var11 < 0; var11++) {
                var8 = 668477400;
                var9 = (var8 & -16711936) + (671088600 - var8 & 16711680) >>> 8;
                var8 = t.field_k[var7];
                var12 = var9 + var8;
                var9 = (var9 & 16711935) + (var8 & 16711935);
                var8 = (var9 & 16777472) + (var12 - var9 & 65536);
                int incrementValue$0 = var7;
                var7++;
                t.field_k[incrementValue$0] = var12 - var8 | var8 - (var8 >>> 8);
            }
            var7 = var7 + var6;
        }
    }

    private final static void a(int[] param0, int[] param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, byte[] param9) {
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        var10 = -(param5 >> 2);
        param5 = -(param5 & 3);
        var11 = -param6;
        L0: while (true) {
          if (var11 >= 0) {
            return;
          } else {
            var12 = var10;
            L1: while (true) {
              if (var12 >= 0) {
                var12 = param5;
                L2: while (true) {
                  if (var12 >= 0) {
                    param4 = param4 + param7;
                    param3 = param3 + param8;
                    var11++;
                    continue L0;
                  } else {
                    param2 = param1[param3];
                    int incrementValue$10 = param3;
                    param3++;
                    if (param9[incrementValue$10] != 0) {
                      if (param2 != 0) {
                        int incrementValue$11 = param4;
                        param4++;
                        param0[incrementValue$11] = param2;
                        var12++;
                        continue L2;
                      } else {
                        param4++;
                        var12++;
                        continue L2;
                      }
                    } else {
                      param4++;
                      var12++;
                      continue L2;
                    }
                  }
                }
              } else {
                L3: {
                  L4: {
                    param2 = param1[param3];
                    int incrementValue$12 = param3;
                    param3++;
                    if (param9[incrementValue$12] == 0) {
                      break L4;
                    } else {
                      if (param2 == 0) {
                        break L4;
                      } else {
                        int incrementValue$13 = param4;
                        param4++;
                        param0[incrementValue$13] = param2;
                        break L3;
                      }
                    }
                  }
                  param4++;
                  break L3;
                }
                L5: {
                  L6: {
                    param2 = param1[param3];
                    int incrementValue$14 = param3;
                    param3++;
                    if (param9[incrementValue$14] == 0) {
                      break L6;
                    } else {
                      if (param2 == 0) {
                        break L6;
                      } else {
                        int incrementValue$15 = param4;
                        param4++;
                        param0[incrementValue$15] = param2;
                        break L5;
                      }
                    }
                  }
                  param4++;
                  break L5;
                }
                L7: {
                  L8: {
                    param2 = param1[param3];
                    int incrementValue$16 = param3;
                    param3++;
                    if (param9[incrementValue$16] == 0) {
                      break L8;
                    } else {
                      if (param2 == 0) {
                        break L8;
                      } else {
                        int incrementValue$17 = param4;
                        param4++;
                        param0[incrementValue$17] = param2;
                        break L7;
                      }
                    }
                  }
                  param4++;
                  break L7;
                }
                param2 = param1[param3];
                int incrementValue$18 = param3;
                param3++;
                if (param9[incrementValue$18] != 0) {
                  if (param2 != 0) {
                    int incrementValue$19 = param4;
                    param4++;
                    param0[incrementValue$19] = param2;
                    var12++;
                    continue L1;
                  } else {
                    param4++;
                    var12++;
                    continue L1;
                  }
                } else {
                  param4++;
                  var12++;
                  continue L1;
                }
              }
            }
          }
        }
    }

    final static void a(tf param0, int param1, int param2) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        L0: {
          var3 = param1 + param2 * t.field_j;
          var4 = 0;
          var5 = param0.field_E;
          var6 = param0.field_F;
          var7 = t.field_j - var6;
          var8 = 0;
          if (param2 >= t.field_f) {
            break L0;
          } else {
            var9 = t.field_f - param2;
            var5 = var5 - var9;
            param2 = t.field_f;
            var4 = var4 + var9 * var6;
            var3 = var3 + var9 * t.field_j;
            break L0;
          }
        }
        L1: {
          if (param2 + var5 <= t.field_a) {
            break L1;
          } else {
            var5 = var5 - (param2 + var5 - t.field_a);
            break L1;
          }
        }
        L2: {
          if (param1 >= t.field_e) {
            break L2;
          } else {
            var9 = t.field_e - param1;
            var6 = var6 - var9;
            param1 = t.field_e;
            var4 = var4 + var9;
            var3 = var3 + var9;
            var8 = var8 + var9;
            var7 = var7 + var9;
            break L2;
          }
        }
        L3: {
          if (param1 + var6 <= t.field_h) {
            break L3;
          } else {
            var9 = param1 + var6 - t.field_h;
            var6 = var6 - var9;
            var8 = var8 + var9;
            var7 = var7 + var9;
            break L3;
          }
        }
        L4: {
          if (var6 <= 0) {
            break L4;
          } else {
            if (var5 > 0) {
              fi.a(t.field_k, param0.field_G, 0, var4, var3, var6, var5, var7, var8);
              return;
            } else {
              break L4;
            }
          }
        }
    }

    final static void a(int param0, int param1, int param2, tf param3) {
        fi.a(param0, param1, param2, param3, 65280);
    }

    final static void a(jl param0, String param1, String param2, int param3, int param4, int param5, int param6, int param7, int param8) {
        param0.b(param1, 30, param5, 0, -1, param8);
        param0.b(param2, 30 + param3, param5, 0, -1, param8);
    }

    final static tf a(int param0) {
        int var2 = 0;
        int var3 = 0;
        tf var1 = new tf(param0, 1);
        for (var2 = 0; var2 < param0; var2++) {
            var3 = ((var2 > param0 / 2 - 1 ? param0 - var2 - 1 : var2) << 9) / param0;
            var1.field_G[var2] = 65793 * var3;
        }
        return var1;
    }

    private final static void a(int[] param0, int[] param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8) {
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
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
                  var9 = param0[param4];
                  var10 = 256 - (param2 & 255);
                  int incrementValue$67 = param4;
                  param4++;
                  param0[incrementValue$67] = (var9 & 16711935) * var10 >> 8 & 16711935 | (var9 & 65280) * var10 >> 8 & 65280;
                  var12++;
                  continue L1;
                }
              }
            }
          }
        }
    }

    final static void a(tf param0, int param1, int param2, int param3, int param4) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        L0: {
          param1 = param1 + param0.field_D;
          param2 = param2 + param0.field_y;
          var5 = param1 + param2 * t.field_j;
          var6 = 0;
          var7 = param0.field_E;
          var8 = param0.field_F;
          var9 = t.field_j - var8;
          var10 = 0;
          var11 = param3 << 8;
          var12 = (param4 - param3 << 8) / var7;
          if (param2 >= t.field_f) {
            break L0;
          } else {
            var11 = var11 + (t.field_f - param2) * var12;
            var13 = t.field_f - param2;
            var7 = var7 - var13;
            param2 = t.field_f;
            var6 = var6 + var13 * var8;
            var5 = var5 + var13 * t.field_j;
            break L0;
          }
        }
        L1: {
          if (param2 + var7 <= t.field_a) {
            break L1;
          } else {
            var7 = var7 - (param2 + var7 - t.field_a);
            break L1;
          }
        }
        L2: {
          if (param1 >= t.field_e) {
            break L2;
          } else {
            var13 = t.field_e - param1;
            var8 = var8 - var13;
            param1 = t.field_e;
            var6 = var6 + var13;
            var5 = var5 + var13;
            var10 = var10 + var13;
            var9 = var9 + var13;
            break L2;
          }
        }
        L3: {
          if (param1 + var8 <= t.field_h) {
            break L3;
          } else {
            var13 = param1 + var8 - t.field_h;
            var8 = var8 - var13;
            var10 = var10 + var13;
            var9 = var9 + var13;
            break L3;
          }
        }
        L4: {
          if (var8 <= 0) {
            break L4;
          } else {
            if (var7 > 0) {
              fi.a(t.field_k, param0.field_G, 0, var6, var5, var8, var7, var9, var10, var11, var12);
              return;
            } else {
              break L4;
            }
          }
        }
    }
}
