/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ir {
    private int field_b;
    private int field_n;
    static v field_d;
    private int field_a;
    static String field_j;
    static kl field_f;
    private int field_e;
    private int field_c;
    static String field_l;
    private ne[] field_m;
    static ka field_h;
    static String field_k;
    private int field_g;
    private int[] field_i;

    final void a(float[] param0, boolean param1, float param2, int param3, byte param4, int param5, int param6, int param7) {
        int var12 = 0;
        int var11 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        float var16 = 0.0f;
        int var17 = ArmiesOfGielinor.field_M ? 1 : 0;
        if (param4 != -4) {
            ((ir) this).field_b = 94;
        }
        jd var18 = wg.field_b[param3];
        jd var19 = var18;
        var19.field_J = param7;
        var19.field_w = param6;
        this.a(var19, 120);
        int var10 = 3 * bw.field_m[var18.field_N][3];
        for (var12 = ((ir) this).field_b; var12 <= ((ir) this).field_n; var12++) {
            var11 = ((ir) this).field_e - -(((ir) this).field_a * var12);
            for (var13 = ((ir) this).field_e; var13 <= ((ir) this).field_c; var13++) {
                var14 = ((ir) this).field_i[var11];
                var15 = (65535 & var14) + (var14 >> -1648080016) * var10;
                var16 = 10.0f * param2 / (float)(1 + var15);
                if (param1) {
                    var16 = var16 / (float)(1 + var15);
                }
                param0[var11] = param0[var11] + var16;
                var11++;
            }
        }
    }

    final static int a(int param0, int param1, int param2, int param3, int param4, int param5, bv param6) {
        int var7 = 0;
        int var8 = 0;
        L0: {
          var8 = ArmiesOfGielinor.field_M ? 1 : 0;
          if (-1 != (param5 ^ -1)) {
            L1: {
              var7 = 1 << -1 + param5;
              if (-1 + var7 < param2) {
                break L1;
              } else {
                if (param2 < -var7) {
                  break L1;
                } else {
                  param6.a(-16807, 2, 0);
                  param6.a(param4 + -16808, param5, param2);
                  return param5 + 2;
                }
              }
            }
            if (0 >= param2) {
              param2 = param2 + var7;
              break L0;
            } else {
              param2 = param2 - var7;
              break L0;
            }
          } else {
            if (0 == param2) {
              param6.a(param4 + -16808, 2, 0);
              return 2;
            } else {
              break L0;
            }
          }
        }
        L2: {
          var7 = 1 << -1 + param0;
          if (param2 > var7 - param4) {
            break L2;
          } else {
            if (param2 < -var7) {
              break L2;
            } else {
              param6.a(-16807, 2, 1);
              param6.a(param4 ^ -16808, param0, param2);
              return param0 + 2;
            }
          }
        }
        L3: {
          if ((param2 ^ -1) >= -1) {
            param2 = param2 + var7;
            break L3;
          } else {
            param2 = param2 - var7;
            break L3;
          }
        }
        L4: {
          var7 = 1 << -1 + param1;
          if (param2 > var7 - 1) {
            break L4;
          } else {
            if (param2 >= -var7) {
              param6.a(-16807, 2, 2);
              param6.a(-16807, param1, param2);
              return 2 + param1;
            } else {
              break L4;
            }
          }
        }
        L5: {
          if (-1 <= (param2 ^ -1)) {
            param2 = param2 + var7;
            break L5;
          } else {
            param2 = param2 - var7;
            break L5;
          }
        }
        L6: {
          var7 = 1 << param3 - 1;
          if (param2 > -1 + var7) {
            break L6;
          } else {
            if (param2 < -var7) {
              break L6;
            } else {
              param6.a(-16807, 2, 3);
              param6.a(-16807, param3, param2);
              return 2 - -param3;
            }
          }
        }
        L7: {
          if (param2 <= 0) {
            param2 = param2 + var7;
            break L7;
          } else {
            param2 = param2 - var7;
            break L7;
          }
        }
        throw new IllegalArgumentException("out of range " + param2);
    }

    public static void a(int param0) {
        field_l = null;
        field_d = null;
        field_f = null;
        int var1 = 59 % ((param0 - -1) / 41);
        field_h = null;
        field_k = null;
        field_j = null;
    }

    final static String a(int param0, int param1) {
        if (param0 != 10602) {
            Object var3 = null;
            int discarded$0 = ir.a(12, 72, -87, -119, -83, -86, (bv) null);
        }
        return Integer.toString(param1);
    }

    final void a(float[][] param0, int param1, int param2, jd param3) {
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
        var15 = ArmiesOfGielinor.field_M ? 1 : 0;
        if (param3.field_S) {
          return;
        } else {
          var5 = param3.g(param2 ^ param2);
          var6 = param3.i(-21428) ? 1 : 0;
          this.a(param3, 124);
          var7 = 0;
          var8 = bw.field_m[param3.field_N][7];
          ((ir) this).field_n = Math.min(((ir) this).field_n + var8, ((ir) this).field_g - 1);
          ((ir) this).field_c = Math.min(var8 + ((ir) this).field_c, ((ir) this).field_a + -1);
          ((ir) this).field_b = Math.max(-var8 + ((ir) this).field_b, 0);
          ((ir) this).field_e = Math.max(-var8 + ((ir) this).field_e, 0);
          var9 = ((ir) this).field_b;
          L0: while (true) {
            if (((ir) this).field_n < var9) {
              return;
            } else {
              var16 = ((ir) this).field_a * var9 + ((ir) this).field_e;
              var7 = var16;
              var10 = ((ir) this).field_e;
              L1: while (true) {
                if (var10 > ((ir) this).field_c) {
                  var9++;
                  continue L0;
                } else {
                  L2: {
                    var11 = this.a(((ir) this).field_i, param3, var10, var9, (byte) 5);
                    if (var11 == 1000000) {
                      break L2;
                    } else {
                      var12 = ((ir) this).field_i[var11];
                      var13 = var12 >> -865013712;
                      var14 = var13 + 1;
                      var14 = var14 * var14;
                      param0[var5][var16] = param0[var5][var16] + (float)(param1 * param3.g((byte) 122)) / (float)var14;
                      break L2;
                    }
                  }
                  if (var6 != 0) {
                    var12 = ((ir) this).field_i[var16];
                    var13 = var12 >> -419989840;
                    var14 = var13 + 1;
                    var14 = var14 * var14;
                    param0[8][var16] = param0[8][var16] + (float)(param1 * param3.g((byte) 122)) / (float)var14;
                    var16++;
                    var10++;
                    continue L1;
                  } else {
                    var16++;
                    var10++;
                    continue L1;
                  }
                }
              }
            }
          }
        }
    }

    private final void a(int param0, int param1, float param2, int param3, float[][][] param4, boolean param5, int param6, boolean param7) {
        if (!param7) {
            ((ir) this).field_a = -97;
        }
        ((ir) this).a(param4[param0][param6], param5, param2, param0, (byte) -4, param6, param3, param1);
    }

    final static void a(int[] param0, byte param1, vh param2, int[] param3) {
        int var4 = 0;
        int var5 = ArmiesOfGielinor.field_M ? 1 : 0;
        if (param1 != 100) {
            field_l = null;
        }
        for (var4 = 0; 6 > var4; var4++) {
            param2.b(param1 + -99, param0[var4]);
            param2.b(1, param3[var4]);
        }
    }

    private final void a(jd param0, int param1) {
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
        var11 = ArmiesOfGielinor.field_M ? 1 : 0;
        var3 = 0;
        L0: while (true) {
          if (((ir) this).field_i.length <= var3) {
            L1: {
              ((ir) this).field_b = param0.field_w;
              ((ir) this).field_c = param0.field_J;
              ((ir) this).field_n = param0.field_w;
              ((ir) this).field_e = param0.field_J;
              ((ir) this).field_c = Math.min(((ir) this).field_c - -1, -1 + ((ir) this).field_a);
              ((ir) this).field_n = Math.min(1 + ((ir) this).field_n, ((ir) this).field_g - 1);
              ((ir) this).field_e = Math.max(-1 + ((ir) this).field_e, 0);
              ((ir) this).field_b = Math.max(-1 + ((ir) this).field_b, 0);
              ((ir) this).field_i[param0.field_J + param0.field_w * ((ir) this).field_a] = 0;
              if (param1 >= 118) {
                break L1;
              } else {
                ((ir) this).field_e = -1;
                break L1;
              }
            }
            var3 = 3 * bw.field_m[param0.field_N][3];
            var4 = 0;
            L2: while (true) {
              L3: {
                if (500 <= var4) {
                  break L3;
                } else {
                  var5 = 0;
                  var6 = 0;
                  var7 = ((ir) this).field_b;
                  L4: while (true) {
                    if (((ir) this).field_n < var7) {
                      if (var5 == 0) {
                        break L3;
                      } else {
                        var4++;
                        continue L2;
                      }
                    } else {
                      var12 = ((ir) this).field_e - -(var7 * ((ir) this).field_a);
                      var6 = var12;
                      var8 = ((ir) this).field_e;
                      L5: while (true) {
                        if (((ir) this).field_c < var8) {
                          var7++;
                          continue L4;
                        } else {
                          L6: {
                            var9 = 2147483647;
                            if (-1 > (var8 ^ -1)) {
                              L7: {
                                var10 = ((ir) this).field_i[-1 + var12] - -pj.a(((ir) this).field_a, ((ir) this).field_m, false, var12, param0.field_O, ((ir) this).field_g, -1, param0, var12 - 1, false, true);
                                if (var3 >= (65535 & var10)) {
                                  break L7;
                                } else {
                                  var10 = -var3 + (((var10 >> 2111662672) - -1 << -874072112) + (65535 & var10));
                                  break L7;
                                }
                              }
                              if (var9 <= var10) {
                                break L6;
                              } else {
                                var9 = var10;
                                break L6;
                              }
                            } else {
                              break L6;
                            }
                          }
                          L8: {
                            if (var7 <= 0) {
                              break L8;
                            } else {
                              L9: {
                                var10 = ((ir) this).field_i[var12 - ((ir) this).field_a] - -pj.a(((ir) this).field_a, ((ir) this).field_m, false, var12, param0.field_O, ((ir) this).field_g, -1, param0, var12 - ((ir) this).field_a, false, true);
                                if (var3 < (var10 & 65535)) {
                                  var10 = (65535 & var10) + ((1 + (var10 >> 1497006928) << 1137221616) + -var3);
                                  break L9;
                                } else {
                                  break L9;
                                }
                              }
                              if (var9 <= var10) {
                                break L8;
                              } else {
                                var9 = var10;
                                break L8;
                              }
                            }
                          }
                          L10: {
                            if (-1 + ((ir) this).field_a <= var8) {
                              break L10;
                            } else {
                              L11: {
                                var10 = ((ir) this).field_i[1 + var12] - -pj.a(((ir) this).field_a, ((ir) this).field_m, false, var12, param0.field_O, ((ir) this).field_g, -1, param0, var12 - -1, false, true);
                                if ((var10 & 65535) > var3) {
                                  var10 = (1 + (var10 >> 379779344) << -1384863760) - -(var10 & 65535) + -var3;
                                  break L11;
                                } else {
                                  break L11;
                                }
                              }
                              if (var10 >= var9) {
                                break L10;
                              } else {
                                var9 = var10;
                                break L10;
                              }
                            }
                          }
                          L12: {
                            if (-1 + ((ir) this).field_g <= var7) {
                              break L12;
                            } else {
                              L13: {
                                var10 = ((ir) this).field_i[((ir) this).field_a + var12] - -pj.a(((ir) this).field_a, ((ir) this).field_m, false, var12, param0.field_O, ((ir) this).field_g, -1, param0, var12 - -((ir) this).field_a, false, true);
                                if ((var10 & 65535) <= var3) {
                                  break L13;
                                } else {
                                  var10 = -var3 + ((var10 >> 114181744) - -1 << -430777392) + (65535 & var10);
                                  break L13;
                                }
                              }
                              if (var9 > var10) {
                                var9 = var10;
                                break L12;
                              } else {
                                break L12;
                              }
                            }
                          }
                          if (var9 < ((ir) this).field_i[var12]) {
                            if (6 >= var9 >> 500845072) {
                              L14: {
                                ((ir) this).field_i[var12] = var9;
                                if (((ir) this).field_n > var7) {
                                  break L14;
                                } else {
                                  ((ir) this).field_n = Math.min(var7 + 1, ((ir) this).field_g + -1);
                                  break L14;
                                }
                              }
                              L15: {
                                if (((ir) this).field_c > var8) {
                                  break L15;
                                } else {
                                  ((ir) this).field_c = Math.min(1 + var8, ((ir) this).field_a + -1);
                                  break L15;
                                }
                              }
                              L16: {
                                if (((ir) this).field_b < var7) {
                                  break L16;
                                } else {
                                  ((ir) this).field_b = Math.max(-1 + var7, 0);
                                  break L16;
                                }
                              }
                              L17: {
                                if (var8 > ((ir) this).field_e) {
                                  break L17;
                                } else {
                                  ((ir) this).field_e = Math.max(-1 + var8, 0);
                                  break L17;
                                }
                              }
                              if (var5 < var9) {
                                var5 = var9;
                                var12++;
                                var8++;
                                continue L5;
                              } else {
                                var12++;
                                var8++;
                                continue L5;
                              }
                            } else {
                              var12++;
                              var8++;
                              continue L5;
                            }
                          } else {
                            var12++;
                            var8++;
                            continue L5;
                          }
                        }
                      }
                    }
                  }
                }
              }
              return;
            }
          } else {
            ((ir) this).field_i[var3] = 268435455;
            var3++;
            continue L0;
          }
        }
    }

    final boolean a(int param0, int param1, boolean param2, int param3, int param4, int param5) {
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int stackIn_13_0 = 0;
        int stackIn_28_0 = 0;
        int stackIn_45_0 = 0;
        int stackIn_58_0 = 0;
        int stackIn_61_0 = 0;
        int stackOut_27_0 = 0;
        int stackOut_26_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_44_0 = 0;
        int stackOut_43_0 = 0;
        int stackOut_57_0 = 0;
        int stackOut_56_0 = 0;
        int stackOut_60_0 = 0;
        int stackOut_59_0 = 0;
        L0: {
          var12 = ArmiesOfGielinor.field_M ? 1 : 0;
          if ((param0 - -param3 ^ -1) > -1) {
            break L0;
          } else {
            if (param3 + param0 >= ((ir) this).field_a) {
              break L0;
            } else {
              if ((param5 + param4 ^ -1) > -1) {
                break L0;
              } else {
                if (((ir) this).field_g <= param4 + param5) {
                  break L0;
                } else {
                  L1: {
                    L2: {
                      if (param3 != 0) {
                        if (param3 == -1) {
                          L3: {
                            if (-1 < param4) {
                              stackOut_27_0 = 1;
                              stackIn_28_0 = stackOut_27_0;
                              break L3;
                            } else {
                              stackOut_26_0 = -1;
                              stackIn_28_0 = stackOut_26_0;
                              break L3;
                            }
                          }
                          var7 = stackIn_28_0;
                          param4 = param4 * var7;
                          var8 = 1;
                          L4: while (true) {
                            if (var8 >= param4) {
                              break L1;
                            } else {
                              L5: {
                                L6: {
                                  var9 = param0 + (var8 * var7 + param5) * ((ir) this).field_a;
                                  if (param2) {
                                    break L6;
                                  } else {
                                    if (2 == ((ir) this).field_m[var9].field_h) {
                                      break L5;
                                    } else {
                                      break L6;
                                    }
                                  }
                                }
                                if (-4 != ((ir) this).field_m[var9].field_h) {
                                  var8++;
                                  continue L4;
                                } else {
                                  break L5;
                                }
                              }
                              return false;
                            }
                          }
                        } else {
                          break L2;
                        }
                      } else {
                        if (0 == param4) {
                          return true;
                        } else {
                          if (param3 == -1) {
                            L7: {
                              if (-1 < param4) {
                                stackOut_12_0 = 1;
                                stackIn_13_0 = stackOut_12_0;
                                break L7;
                              } else {
                                stackOut_11_0 = -1;
                                stackIn_13_0 = stackOut_11_0;
                                break L7;
                              }
                            }
                            var7 = stackIn_13_0;
                            param4 = param4 * var7;
                            var8 = 1;
                            L8: while (true) {
                              if (var8 >= param4) {
                                break L1;
                              } else {
                                L9: {
                                  var9 = param0 + (var8 * var7 + param5) * ((ir) this).field_a;
                                  if (param2) {
                                    break L9;
                                  } else {
                                    if (2 == ((ir) this).field_m[var9].field_h) {
                                      return false;
                                    } else {
                                      break L9;
                                    }
                                  }
                                }
                                if (-4 != (((ir) this).field_m[var9].field_h ^ -1)) {
                                  var8++;
                                  continue L8;
                                } else {
                                  return false;
                                }
                              }
                            }
                          } else {
                            break L2;
                          }
                        }
                      }
                    }
                    L10: {
                      if (param1 < -23) {
                        break L10;
                      } else {
                        field_f = null;
                        break L10;
                      }
                    }
                    if (-1 == param4) {
                      L11: {
                        if (-1 <= (param3 ^ -1)) {
                          stackOut_44_0 = -1;
                          stackIn_45_0 = stackOut_44_0;
                          break L11;
                        } else {
                          stackOut_43_0 = 1;
                          stackIn_45_0 = stackOut_43_0;
                          break L11;
                        }
                      }
                      var7 = stackIn_45_0;
                      param3 = param3 * var7;
                      var8 = 1;
                      L12: while (true) {
                        if (var8 >= param3) {
                          return true;
                        } else {
                          L13: {
                            L14: {
                              var9 = param5 * ((ir) this).field_a + var7 * var8 + param0;
                              if (param2) {
                                break L14;
                              } else {
                                if (((ir) this).field_m[var9].field_h == 2) {
                                  break L13;
                                } else {
                                  break L14;
                                }
                              }
                            }
                            if (((ir) this).field_m[var9].field_h == 3) {
                              break L13;
                            } else {
                              var8++;
                              continue L12;
                            }
                          }
                          return false;
                        }
                      }
                    } else {
                      L15: {
                        if (0 < param3) {
                          stackOut_57_0 = 1;
                          stackIn_58_0 = stackOut_57_0;
                          break L15;
                        } else {
                          stackOut_56_0 = -1;
                          stackIn_58_0 = stackOut_56_0;
                          break L15;
                        }
                      }
                      L16: {
                        var7 = stackIn_58_0;
                        if (0 >= param4) {
                          stackOut_60_0 = -1;
                          stackIn_61_0 = stackOut_60_0;
                          break L16;
                        } else {
                          stackOut_59_0 = 1;
                          stackIn_61_0 = stackOut_59_0;
                          break L16;
                        }
                      }
                      L17: {
                        var8 = stackIn_61_0;
                        param3 = param3 * var7;
                        param4 = param4 * var8;
                        if (param3 > param4) {
                          var9 = 1;
                          L18: while (true) {
                            if (var9 >= param3) {
                              break L17;
                            } else {
                              L19: {
                                L20: {
                                  var10 = var9 * param4 / param3;
                                  var11 = (var10 * var8 + param5) * ((ir) this).field_a + var9 * var7 + param0;
                                  if (param2) {
                                    break L20;
                                  } else {
                                    if (((ir) this).field_m[var11].field_h == 2) {
                                      break L19;
                                    } else {
                                      break L20;
                                    }
                                  }
                                }
                                if ((((ir) this).field_m[var11].field_h ^ -1) == -4) {
                                  break L19;
                                } else {
                                  var9++;
                                  continue L18;
                                }
                              }
                              return false;
                            }
                          }
                        } else {
                          var9 = 1;
                          L21: while (true) {
                            if (param4 <= var9) {
                              break L17;
                            } else {
                              L22: {
                                L23: {
                                  var10 = param3 * var9 / param4;
                                  var11 = (var9 * var8 + param5) * ((ir) this).field_a + var7 * var10 + param0;
                                  if (param2) {
                                    break L23;
                                  } else {
                                    if (2 == ((ir) this).field_m[var11].field_h) {
                                      break L22;
                                    } else {
                                      break L23;
                                    }
                                  }
                                }
                                if (-4 != (((ir) this).field_m[var11].field_h ^ -1)) {
                                  var9++;
                                  continue L21;
                                } else {
                                  break L22;
                                }
                              }
                              return false;
                            }
                          }
                        }
                      }
                      return true;
                    }
                  }
                  return true;
                }
              }
            }
          }
        }
        return false;
    }

    private final int a(int[] param0, jd param1, int param2, int param3, byte param4) {
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int stackIn_5_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_3_0 = 0;
        var17 = ArmiesOfGielinor.field_M ? 1 : 0;
        var6 = 1000000;
        var7 = 1000000;
        if (param4 == 5) {
          L0: {
            if (bw.field_m[param1.field_N][0] != 4) {
              stackOut_4_0 = 0;
              stackIn_5_0 = stackOut_4_0;
              break L0;
            } else {
              stackOut_3_0 = 1;
              stackIn_5_0 = stackOut_3_0;
              break L0;
            }
          }
          var8 = stackIn_5_0;
          var9 = bw.field_m[param1.field_N][6];
          var10 = bw.field_m[param1.field_N][7];
          var11 = -var10;
          L1: while (true) {
            if (var11 > var10) {
              return var6;
            } else {
              var12 = -var10;
              L2: while (true) {
                if (var10 >= var12) {
                  var13 = Math.abs(var11) + Math.abs(var12);
                  if (var9 <= var13) {
                    if (var13 <= var10) {
                      if (((ir) this).a(param2, -117, var8 != 0, var12, var11, param3)) {
                        var15 = (param3 - -var11) * ((ir) this).field_a + param2 + var12;
                        var16 = param0[var15];
                        if (var7 > var16) {
                          var6 = var15;
                          var7 = var16;
                          var12++;
                          continue L2;
                        } else {
                          var12++;
                          continue L2;
                        }
                      } else {
                        var12++;
                        continue L2;
                      }
                    } else {
                      var12++;
                      continue L2;
                    }
                  } else {
                    var12++;
                    continue L2;
                  }
                } else {
                  var11++;
                  continue L1;
                }
              }
            }
          }
        } else {
          return 115;
        }
    }

    final void a(int param0, int param1, float param2, int param3, int param4, float[][][] param5, int param6) {
        if (param0 >= -18) {
            Object var9 = null;
            this.a((jd) null, 43);
        }
        this.a(param3, param6, param2, param1, param5, false, param4, true);
    }

    ir(ne[] param0, int param1, int param2) {
        int[] var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int[] var9 = null;
        int var10 = 0;
        int[] var11 = null;
        int[] var12 = null;
        int[] var13 = null;
        int[] var14 = null;
        L0: {
          ((ir) this).field_a = param1;
          ((ir) this).field_g = param2;
          ((ir) this).field_m = param0;
          ((ir) this).field_i = new int[((ir) this).field_m.length];
          if (null != wg.field_b) {
            break L0;
          } else {
            wg.field_b = new jd[8];
            var14 = new int[wg.field_b.length];
            var13 = var14;
            var12 = var13;
            var11 = var12;
            var9 = var11;
            var4 = var9;
            var5 = 0;
            L1: while (true) {
              if (75 <= var5) {
                var10 = 0;
                var5 = var10;
                L2: while (true) {
                  if (wg.field_b.length <= var10) {
                    break L0;
                  } else {
                    wg.field_b[var10] = new jd(0, 0, var14[var10]);
                    var10++;
                    continue L2;
                  }
                }
              } else {
                L3: {
                  var6 = bw.field_m[var5][0];
                  var7 = bw.field_m[var5][3];
                  if (var14[var6] == 0) {
                    break L3;
                  } else {
                    if (bw.field_m[var14[var6]][3] < var7) {
                      break L3;
                    } else {
                      var5++;
                      continue L1;
                    }
                  }
                }
                var14[var6] = var5;
                var5++;
                continue L1;
              }
            }
          }
        }
    }

    final static void a(boolean param0) {
        int var2 = 0;
        nt var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6_int = 0;
        String[][] var6 = null;
        int[][] var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        bv var14 = null;
        nt stackIn_34_0 = null;
        nt stackIn_35_0 = null;
        nt stackIn_36_0 = null;
        int stackIn_36_1 = 0;
        nt stackOut_33_0 = null;
        nt stackOut_35_0 = null;
        int stackOut_35_1 = 0;
        nt stackOut_34_0 = null;
        int stackOut_34_1 = 0;
        var12 = ArmiesOfGielinor.field_M ? 1 : 0;
        var14 = mg.field_e;
        var2 = var14.k(0);
        var3 = (nt) (Object) s.field_a.e((byte) 120);
        L0: while (true) {
          L1: {
            if (var3 == null) {
              break L1;
            } else {
              if (var2 != var3.field_o) {
                var3 = (nt) (Object) s.field_a.a((byte) 123);
                continue L0;
              } else {
                break L1;
              }
            }
          }
          if (var3 == null) {
            dj.a((byte) -127);
            return;
          } else {
            L2: {
              var4 = var14.k(0);
              if (var4 == 0) {
                break L2;
              } else {
                var5 = var3.field_q;
                gm.field_a[0] = mv.field_d;
                var6_int = 1;
                L3: while (true) {
                  if (var6_int >= var4) {
                    qu.a(2, var5, var4);
                    var6_int = 0;
                    L4: while (true) {
                      if (var6_int >= var4) {
                        jm.a(var5, 0);
                        var3.field_t = new String[2][var5];
                        var6 = new String[2][var5];
                        var3.field_n = new int[2][var5 * 4];
                        var7 = new int[2][var5 * 4];
                        var8 = kt.field_p;
                        var9 = 0;
                        var10 = 0;
                        L5: while (true) {
                          if (var8 <= var9) {
                            var9 = 0;
                            var13 = 0;
                            var10 = var13;
                            L6: while (true) {
                              if (var8 <= var9) {
                                break L2;
                              } else {
                                var11 = vt.field_m[var5 - -var9];
                                var6[1][var13] = gm.field_a[var11];
                                var7[1][4 * var13] = no.field_U[var11];
                                var7[1][var13 * 4 - -1] = wp.field_w[var11];
                                var7[1][var13 * 4 + 2] = ci.field_c[var11];
                                var7[1][var13 * 4 - -3] = pe.field_s[var11];
                                if (gt.a(gm.field_a[var11], (byte) 109)) {
                                  if (-1 == (pe.field_s[var11] + (wp.field_w[var11] - -ci.field_c[var11]) ^ -1)) {
                                    var6[1][var13] = null;
                                    var13--;
                                    var9++;
                                    var13++;
                                    continue L6;
                                  } else {
                                    var9++;
                                    var13++;
                                    continue L6;
                                  }
                                } else {
                                  var9++;
                                  var13++;
                                  continue L6;
                                }
                              }
                            }
                          } else {
                            var11 = vt.field_m[var9];
                            var6[0][var10] = gm.field_a[var11];
                            var7[0][var10 * 4] = no.field_U[var11];
                            var7[0][1 + 4 * var10] = wp.field_w[var11];
                            var7[0][var10 * 4 + 2] = ci.field_c[var11];
                            var7[0][3 + var10 * 4] = pe.field_s[var11];
                            if (gt.a(gm.field_a[var11], (byte) 121)) {
                              if (0 == ci.field_c[var11] + wp.field_w[var11] - -pe.field_s[var11]) {
                                var6[0][var10] = null;
                                var10--;
                                var9++;
                                var10++;
                                continue L5;
                              } else {
                                var9++;
                                var10++;
                                continue L5;
                              }
                            } else {
                              var9++;
                              var10++;
                              continue L5;
                            }
                          }
                        }
                      } else {
                        jp.a((vh) (Object) var14, -83);
                        if (0 == var6_int) {
                          var3.field_r = rt.field_D;
                          var3.field_s = ov.field_e;
                          var3.field_k = la.field_d;
                          var3.field_m = nk.field_m;
                          ut.a(rt.field_D, nk.field_m, ov.field_e, la.field_d, (byte) 127, var6_int);
                          var6_int++;
                          continue L4;
                        } else {
                          ut.a(rt.field_D, nk.field_m, ov.field_e, la.field_d, (byte) 125, var6_int);
                          var6_int++;
                          continue L4;
                        }
                      }
                    }
                  } else {
                    gm.field_a[var6_int] = var14.g(1);
                    var6_int++;
                    continue L3;
                  }
                }
              }
            }
            L7: {
              stackOut_33_0 = (nt) var3;
              stackIn_35_0 = stackOut_33_0;
              stackIn_34_0 = stackOut_33_0;
              if (!param0) {
                stackOut_35_0 = (nt) (Object) stackIn_35_0;
                stackOut_35_1 = 0;
                stackIn_36_0 = stackOut_35_0;
                stackIn_36_1 = stackOut_35_1;
                break L7;
              } else {
                stackOut_34_0 = (nt) (Object) stackIn_34_0;
                stackOut_34_1 = 1;
                stackIn_36_0 = stackOut_34_0;
                stackIn_36_1 = stackOut_34_1;
                break L7;
              }
            }
            ((nt) (Object) stackIn_36_0).field_l = stackIn_36_1 != 0;
            var3.d(50);
            return;
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_l = "Prayers to increase your favour.";
        field_j = "RuneScape clan";
        field_k = "Screen Size";
    }
}
