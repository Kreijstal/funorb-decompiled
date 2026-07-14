/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fe {
    private static gk field_a;

    private final static void a(int[] param0, int[] param1, int[] param2, byte[] param3, int param4, int param5, int param6) {
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        var7 = 0;
        var8 = param4;
        L0: while (true) {
          if (var8 > param5) {
            var8 = 0;
            L1: while (true) {
              if (var8 >= 23) {
                var8 = 0;
                L2: while (true) {
                  if (var8 >= param6) {
                    var8 = 1;
                    L3: while (true) {
                      if (var8 >= 23) {
                        var8 = 0;
                        L4: while (true) {
                          if (var8 >= 23) {
                            var10 = 0;
                            var8 = param4;
                            L5: while (true) {
                              if (var8 > param5) {
                                var8 = param4 + 1;
                                L6: while (true) {
                                  if (var8 > param5) {
                                    return;
                                  } else {
                                    param1[var8] = (param0[var8 - 1] + 1 << 1) - param1[var8];
                                    var8++;
                                    continue L6;
                                  }
                                }
                              } else {
                                var10 = var10 + (param1[var8 + 1] - param1[var8]);
                                param0[var8] = var10 - 1;
                                var10 = var10 << 1;
                                var8++;
                                continue L5;
                              }
                            }
                          } else {
                            param0[var8] = 0;
                            var8++;
                            continue L4;
                          }
                        }
                      } else {
                        param1[var8] = param1[var8] + param1[var8 - 1];
                        var8++;
                        continue L3;
                      }
                    }
                  } else {
                    param1[param3[var8] + 1] = param1[param3[var8] + 1] + 1;
                    var8++;
                    continue L2;
                  }
                }
              } else {
                param1[var8] = 0;
                var8++;
                continue L1;
              }
            }
          } else {
            var9 = 0;
            L7: while (true) {
              if (var9 >= param6) {
                var8++;
                continue L0;
              } else {
                if (param3[var9] == var8) {
                  param2[var7] = var9;
                  var7++;
                  var9++;
                  continue L7;
                } else {
                  var9++;
                  continue L7;
                }
              }
            }
          }
        }
    }

    final static int a(byte[] param0, int param1, byte[] param2, int param3, int param4) {
        Object var5 = null;
        Throwable var6 = null;
        int stackIn_2_0 = 0;
        int stackOut_1_0 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var5 = (Object) (Object) field_a;
                    // monitorenter field_a
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        field_a.field_c = param2;
                        field_a.field_p = param4;
                        field_a.field_r = param0;
                        field_a.field_u = 0;
                        field_a.field_k = param1;
                        field_a.field_z = 0;
                        field_a.field_y = 0;
                        field_a.field_j = 0;
                        field_a.field_q = 0;
                        fe.d(field_a);
                        param1 = param1 - field_a.field_k;
                        field_a.field_c = null;
                        field_a.field_r = null;
                        // monitorexit var5
                        stackOut_1_0 = param1;
                        stackIn_2_0 = stackOut_1_0;
                        statePc = 2;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 3;
                        continue stateLoop;
                    }
                }
                case 2: {
                    return stackIn_2_0;
                }
                case 3: {
                    try {
                        var6 = caughtException;
                        // monitorexit var5
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 3;
                        continue stateLoop;
                    }
                }
                case 4: {
                    throw (RuntimeException) (Object) var6;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    private final static void d(gk param0) {
        int var1 = 0;
        int var2 = 0;
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
        int var22 = 0;
        Object var23 = null;
        int[] var23_array = null;
        Object var24 = null;
        int[] var24_array = null;
        Object var25 = null;
        int[] var25_array = null;
        int var26 = 0;
        byte[] var27_ref_byte__ = null;
        int var27 = 0;
        int var28 = 0;
        int var29 = 0;
        int var30 = 0;
        int var31 = 0;
        int var32 = 0;
        int var33 = 0;
        int var34 = 0;
        int var35 = 0;
        byte[] var36 = null;
        byte[] var37 = null;
        byte[] var38 = null;
        byte[] var39 = null;
        L0: {
          var4 = 0;
          var5 = 0;
          var6 = 0;
          var7 = 0;
          var8 = 0;
          var9 = 0;
          var10 = 0;
          var11 = 0;
          var12 = 0;
          var13 = 0;
          var14 = 0;
          var15 = 0;
          var16 = 0;
          var17 = 0;
          var18 = 0;
          var19 = 0;
          var20 = 0;
          var21 = 0;
          var22 = 0;
          var23 = null;
          var24 = null;
          var25 = null;
          param0.field_o = 1;
          if (hc.field_k != null) {
            break L0;
          } else {
            hc.field_k = new int[param0.field_o * 100000];
            break L0;
          }
        }
        var26 = 1;
        L1: while (true) {
          if (var26 == 0) {
            return;
          } else {
            var1 = fe.a(param0);
            if (var1 != 23) {
              L2: {
                var1 = fe.a(param0);
                var1 = fe.a(param0);
                var1 = fe.a(param0);
                var1 = fe.a(param0);
                var1 = fe.a(param0);
                var1 = fe.a(param0);
                var1 = fe.a(param0);
                var1 = fe.a(param0);
                var1 = fe.a(param0);
                var1 = fe.c(param0);
                if (var1 == 0) {
                  break L2;
                } else {
                  break L2;
                }
              }
              param0.field_l = 0;
              var1 = fe.a(param0);
              param0.field_l = param0.field_l << 8 | var1 & 255;
              var1 = fe.a(param0);
              param0.field_l = param0.field_l << 8 | var1 & 255;
              var1 = fe.a(param0);
              param0.field_l = param0.field_l << 8 | var1 & 255;
              var4 = 0;
              L3: while (true) {
                if (var4 >= 16) {
                  var4 = 0;
                  L4: while (true) {
                    if (var4 >= 256) {
                      var4 = 0;
                      L5: while (true) {
                        if (var4 >= 16) {
                          fe.e(param0);
                          var7 = param0.field_H + 2;
                          var8 = fe.a(3, param0);
                          var9 = fe.a(15, param0);
                          var4 = 0;
                          L6: while (true) {
                            if (var4 >= var9) {
                              var39 = new byte[6];
                              var38 = var39;
                              var37 = var38;
                              var36 = var37;
                              var27_ref_byte__ = var36;
                              var29 = 0;
                              L7: while (true) {
                                if (var29 >= var8) {
                                  var4 = 0;
                                  L8: while (true) {
                                    if (var4 >= var9) {
                                      var6 = 0;
                                      L9: while (true) {
                                        if (var6 >= var8) {
                                          var6 = 0;
                                          L10: while (true) {
                                            if (var6 >= var8) {
                                              var10 = param0.field_H + 1;
                                              var11 = -1;
                                              var12 = 0;
                                              var4 = 0;
                                              L11: while (true) {
                                                if (var4 > 255) {
                                                  var29 = 4095;
                                                  var27 = 15;
                                                  L12: while (true) {
                                                    if (var27 < 0) {
                                                      L13: {
                                                        var14 = 0;
                                                        if (var12 != 0) {
                                                          break L13;
                                                        } else {
                                                          var11++;
                                                          var12 = 50;
                                                          var21 = param0.field_B[var11];
                                                          var22 = param0.field_x[var21];
                                                          var23_array = param0.field_h[var21];
                                                          var25_array = param0.field_w[var21];
                                                          var24_array = param0.field_m[var21];
                                                          break L13;
                                                        }
                                                      }
                                                      var12--;
                                                      var18 = var22;
                                                      var19 = fe.a(var18, param0);
                                                      L14: while (true) {
                                                        if (var19 > var23_array[var18]) {
                                                          var18++;
                                                          var20 = fe.c(param0);
                                                          var19 = var19 << 1 | var20;
                                                          continue L14;
                                                        } else {
                                                          var13 = var25_array[var19 - var24_array[var18]];
                                                          L15: while (true) {
                                                            if (var13 != var10) {
                                                              L16: {
                                                                if (var13 == 0) {
                                                                  break L16;
                                                                } else {
                                                                  if (var13 != 1) {
                                                                    L17: {
                                                                      var33 = var13 - 1;
                                                                      if (var33 >= 16) {
                                                                        var31 = var33 / 16;
                                                                        var32 = var33 % 16;
                                                                        var35 = param0.field_b[var31] + var32;
                                                                        var30 = var35;
                                                                        var1 = param0.field_f[var35];
                                                                        L18: while (true) {
                                                                          if (var35 <= param0.field_b[var31]) {
                                                                            param0.field_b[var31] = param0.field_b[var31] + 1;
                                                                            L19: while (true) {
                                                                              if (var31 <= 0) {
                                                                                param0.field_b[0] = param0.field_b[0] - 1;
                                                                                param0.field_f[param0.field_b[0]] = (byte)var1;
                                                                                if (param0.field_b[0] != 0) {
                                                                                  break L17;
                                                                                } else {
                                                                                  var29 = 4095;
                                                                                  var27 = 15;
                                                                                  L20: while (true) {
                                                                                    if (var27 < 0) {
                                                                                      break L17;
                                                                                    } else {
                                                                                      var28 = 15;
                                                                                      L21: while (true) {
                                                                                        if (var28 < 0) {
                                                                                          param0.field_b[var27] = var29 + 1;
                                                                                          var27--;
                                                                                          continue L20;
                                                                                        } else {
                                                                                          param0.field_f[var29] = param0.field_f[param0.field_b[var27] + var28];
                                                                                          var29--;
                                                                                          var28--;
                                                                                          continue L21;
                                                                                        }
                                                                                      }
                                                                                    }
                                                                                  }
                                                                                }
                                                                              } else {
                                                                                param0.field_b[var31] = param0.field_b[var31] - 1;
                                                                                param0.field_f[param0.field_b[var31]] = param0.field_f[param0.field_b[var31 - 1] + 16 - 1];
                                                                                var31--;
                                                                                continue L19;
                                                                              }
                                                                            }
                                                                          } else {
                                                                            param0.field_f[var35] = param0.field_f[var35 - 1];
                                                                            var35--;
                                                                            continue L18;
                                                                          }
                                                                        }
                                                                      } else {
                                                                        var30 = param0.field_b[0];
                                                                        var1 = param0.field_f[var30 + var33];
                                                                        L22: while (true) {
                                                                          if (var33 <= 3) {
                                                                            L23: while (true) {
                                                                              if (var33 <= 0) {
                                                                                param0.field_f[var30] = (byte)var1;
                                                                                break L17;
                                                                              } else {
                                                                                param0.field_f[var30 + var33] = param0.field_f[var30 + var33 - 1];
                                                                                var33--;
                                                                                continue L23;
                                                                              }
                                                                            }
                                                                          } else {
                                                                            var34 = var30 + var33;
                                                                            param0.field_f[var34] = param0.field_f[var34 - 1];
                                                                            param0.field_f[var34 - 1] = param0.field_f[var34 - 2];
                                                                            param0.field_f[var34 - 2] = param0.field_f[var34 - 3];
                                                                            param0.field_f[var34 - 3] = param0.field_f[var34 - 4];
                                                                            var33 -= 4;
                                                                            continue L22;
                                                                          }
                                                                        }
                                                                      }
                                                                    }
                                                                    L24: {
                                                                      param0.field_i[param0.field_s[var1 & 255] & 255] = param0.field_i[param0.field_s[var1 & 255] & 255] + 1;
                                                                      hc.field_k[var14] = param0.field_s[var1 & 255] & 255;
                                                                      var14++;
                                                                      if (var12 != 0) {
                                                                        break L24;
                                                                      } else {
                                                                        var11++;
                                                                        var12 = 50;
                                                                        var21 = param0.field_B[var11];
                                                                        var22 = param0.field_x[var21];
                                                                        var23_array = param0.field_h[var21];
                                                                        var25_array = param0.field_w[var21];
                                                                        var24_array = param0.field_m[var21];
                                                                        break L24;
                                                                      }
                                                                    }
                                                                    var12--;
                                                                    var18 = var22;
                                                                    var19 = fe.a(var18, param0);
                                                                    L25: while (true) {
                                                                      if (var19 > var23_array[var18]) {
                                                                        var18++;
                                                                        var20 = fe.c(param0);
                                                                        var19 = var19 << 1 | var20;
                                                                        continue L25;
                                                                      } else {
                                                                        var13 = var25_array[var19 - var24_array[var18]];
                                                                        continue L15;
                                                                      }
                                                                    }
                                                                  } else {
                                                                    break L16;
                                                                  }
                                                                }
                                                              }
                                                              var15 = -1;
                                                              var16 = 1;
                                                              L26: while (true) {
                                                                L27: {
                                                                  if (var13 != 0) {
                                                                    if (var13 != 1) {
                                                                      break L27;
                                                                    } else {
                                                                      var15 = var15 + 2 * var16;
                                                                      break L27;
                                                                    }
                                                                  } else {
                                                                    var15 = var15 + 1 * var16;
                                                                    break L27;
                                                                  }
                                                                }
                                                                L28: {
                                                                  var16 = var16 * 2;
                                                                  if (var12 != 0) {
                                                                    break L28;
                                                                  } else {
                                                                    var11++;
                                                                    var12 = 50;
                                                                    var21 = param0.field_B[var11];
                                                                    var22 = param0.field_x[var21];
                                                                    var23_array = param0.field_h[var21];
                                                                    var25_array = param0.field_w[var21];
                                                                    var24_array = param0.field_m[var21];
                                                                    break L28;
                                                                  }
                                                                }
                                                                var12--;
                                                                var18 = var22;
                                                                var19 = fe.a(var18, param0);
                                                                L29: while (true) {
                                                                  if (var19 > var23_array[var18]) {
                                                                    var18++;
                                                                    var20 = fe.c(param0);
                                                                    var19 = var19 << 1 | var20;
                                                                    continue L29;
                                                                  } else {
                                                                    var13 = var25_array[var19 - var24_array[var18]];
                                                                    if (var13 == 0) {
                                                                      continue L26;
                                                                    } else {
                                                                      if (var13 == 1) {
                                                                        continue L26;
                                                                      } else {
                                                                        var15++;
                                                                        var1 = param0.field_s[param0.field_f[param0.field_b[0]] & 255];
                                                                        param0.field_i[var1 & 255] = param0.field_i[var1 & 255] + var15;
                                                                        L30: while (true) {
                                                                          if (var15 <= 0) {
                                                                            continue L15;
                                                                          } else {
                                                                            hc.field_k[var14] = var1 & 255;
                                                                            var14++;
                                                                            var15--;
                                                                            continue L30;
                                                                          }
                                                                        }
                                                                      }
                                                                    }
                                                                  }
                                                                }
                                                              }
                                                            } else {
                                                              param0.field_t = 0;
                                                              param0.field_C = (byte) 0;
                                                              param0.field_d[0] = 0;
                                                              var4 = 1;
                                                              L31: while (true) {
                                                                if (var4 > 256) {
                                                                  var4 = 1;
                                                                  L32: while (true) {
                                                                    if (var4 > 256) {
                                                                      var4 = 0;
                                                                      L33: while (true) {
                                                                        if (var4 >= var14) {
                                                                          L34: {
                                                                            param0.field_D = hc.field_k[param0.field_l] >> 8;
                                                                            param0.field_n = 0;
                                                                            param0.field_D = hc.field_k[param0.field_D];
                                                                            param0.field_I = (byte)(param0.field_D & 255);
                                                                            param0.field_D = param0.field_D >> 8;
                                                                            param0.field_n = param0.field_n + 1;
                                                                            param0.field_E = var14;
                                                                            fe.b(param0);
                                                                            if (param0.field_n != param0.field_E + 1) {
                                                                              break L34;
                                                                            } else {
                                                                              if (param0.field_t != 0) {
                                                                                break L34;
                                                                              } else {
                                                                                var26 = 1;
                                                                                continue L1;
                                                                              }
                                                                            }
                                                                          }
                                                                          var26 = 0;
                                                                          continue L1;
                                                                        } else {
                                                                          var1 = (byte)(hc.field_k[var4] & 255);
                                                                          hc.field_k[param0.field_d[var1 & 255]] = hc.field_k[param0.field_d[var1 & 255]] | var4 << 8;
                                                                          param0.field_d[var1 & 255] = param0.field_d[var1 & 255] + 1;
                                                                          var4++;
                                                                          continue L33;
                                                                        }
                                                                      }
                                                                    } else {
                                                                      param0.field_d[var4] = param0.field_d[var4] + param0.field_d[var4 - 1];
                                                                      var4++;
                                                                      continue L32;
                                                                    }
                                                                  }
                                                                } else {
                                                                  param0.field_d[var4] = param0.field_i[var4 - 1];
                                                                  var4++;
                                                                  continue L31;
                                                                }
                                                              }
                                                            }
                                                          }
                                                        }
                                                      }
                                                    } else {
                                                      var28 = 15;
                                                      L35: while (true) {
                                                        if (var28 < 0) {
                                                          param0.field_b[var27] = var29 + 1;
                                                          var27--;
                                                          continue L12;
                                                        } else {
                                                          param0.field_f[var29] = (byte)(var27 * 16 + var28);
                                                          var29--;
                                                          var28--;
                                                          continue L35;
                                                        }
                                                      }
                                                    }
                                                  }
                                                } else {
                                                  param0.field_i[var4] = 0;
                                                  var4++;
                                                  continue L11;
                                                }
                                              }
                                            } else {
                                              var2 = 32;
                                              var3 = 0;
                                              var4 = 0;
                                              L36: while (true) {
                                                if (var4 >= var7) {
                                                  fe.a(param0.field_h[var6], param0.field_m[var6], param0.field_w[var6], param0.field_v[var6], var2, var3, var7);
                                                  param0.field_x[var6] = var2;
                                                  var6++;
                                                  continue L10;
                                                } else {
                                                  L37: {
                                                    if (param0.field_v[var6][var4] <= var3) {
                                                      break L37;
                                                    } else {
                                                      var3 = param0.field_v[var6][var4];
                                                      break L37;
                                                    }
                                                  }
                                                  if (param0.field_v[var6][var4] < var2) {
                                                    var2 = param0.field_v[var6][var4];
                                                    var4++;
                                                    continue L36;
                                                  } else {
                                                    var4++;
                                                    continue L36;
                                                  }
                                                }
                                              }
                                            }
                                          }
                                        } else {
                                          var17 = fe.a(5, param0);
                                          var4 = 0;
                                          L38: while (true) {
                                            if (var4 >= var7) {
                                              var6++;
                                              continue L9;
                                            } else {
                                              L39: while (true) {
                                                var1 = fe.c(param0);
                                                if (var1 != 0) {
                                                  var1 = fe.c(param0);
                                                  if (var1 == 0) {
                                                    var17--;
                                                    continue L39;
                                                  } else {
                                                    var17--;
                                                    continue L39;
                                                  }
                                                } else {
                                                  param0.field_v[var6][var4] = (byte)var17;
                                                  var4++;
                                                  continue L38;
                                                }
                                              }
                                            }
                                          }
                                        }
                                      }
                                    } else {
                                      var29 = param0.field_g[var4];
                                      var28 = var39[var29];
                                      L40: while (true) {
                                        if (var29 <= 0) {
                                          var27_ref_byte__[0] = (byte)var28;
                                          param0.field_B[var4] = (byte)var28;
                                          var4++;
                                          continue L8;
                                        } else {
                                          var27_ref_byte__[var29] = var27_ref_byte__[var29 - 1];
                                          var29 = (byte)(var29 - 1);
                                          continue L40;
                                        }
                                      }
                                    }
                                  }
                                } else {
                                  var27_ref_byte__[var29] = (byte)var29;
                                  var29 = (byte)(var29 + 1);
                                  continue L7;
                                }
                              }
                            } else {
                              var5 = 0;
                              L41: while (true) {
                                var1 = fe.c(param0);
                                if (var1 != 0) {
                                  var5++;
                                  continue L41;
                                } else {
                                  param0.field_g[var4] = (byte)var5;
                                  var4++;
                                  continue L6;
                                }
                              }
                            }
                          }
                        } else {
                          if (param0.field_a[var4]) {
                            var5 = 0;
                            L42: while (true) {
                              if (var5 < 16) {
                                var1 = fe.c(param0);
                                if (var1 == 1) {
                                  param0.field_F[var4 * 16 + var5] = true;
                                  var5++;
                                  continue L42;
                                } else {
                                  var5++;
                                  continue L42;
                                }
                              } else {
                                var4++;
                                continue L5;
                              }
                            }
                          } else {
                            var4++;
                            continue L5;
                          }
                        }
                      }
                    } else {
                      param0.field_F[var4] = false;
                      var4++;
                      continue L4;
                    }
                  }
                } else {
                  var1 = fe.c(param0);
                  if (var1 != 1) {
                    param0.field_a[var4] = false;
                    var4++;
                    continue L3;
                  } else {
                    param0.field_a[var4] = true;
                    var4++;
                    continue L3;
                  }
                }
              }
            } else {
              return;
            }
          }
        }
    }

    private final static void e(gk param0) {
        int var1 = 0;
        param0.field_H = 0;
        var1 = 0;
        L0: while (true) {
          if (var1 >= 256) {
            return;
          } else {
            if (param0.field_F[var1]) {
              param0.field_s[param0.field_H] = (byte)var1;
              param0.field_H = param0.field_H + 1;
              var1++;
              continue L0;
            } else {
              var1++;
              continue L0;
            }
          }
        }
    }

    private final static int a(int param0, gk param1) {
        int var2 = 0;
        L0: while (true) {
          if (param1.field_z < param0) {
            param1.field_y = param1.field_y << 8 | param1.field_c[param1.field_p] & 255;
            param1.field_z = param1.field_z + 8;
            param1.field_p = param1.field_p + 1;
            param1.field_j = param1.field_j + 1;
            if (param1.field_j != 0) {
              continue L0;
            } else {
              continue L0;
            }
          } else {
            var2 = param1.field_y >> param1.field_z - param0 & (1 << param0) - 1;
            param1.field_z = param1.field_z - param0;
            return var2;
          }
        }
    }

    public static void a() {
        field_a = null;
    }

    private final static void b(gk param0) {
        int var1 = 0;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int[] var6 = null;
        int var7 = 0;
        byte[] var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int[] var14 = null;
        int[] var15 = null;
        int[] var16 = null;
        int[] var17 = null;
        var2 = param0.field_C;
        var3 = param0.field_t;
        var4 = param0.field_n;
        var5 = param0.field_I;
        var17 = hc.field_k;
        var16 = var17;
        var15 = var16;
        var14 = var15;
        var6 = var14;
        var7 = param0.field_D;
        var8 = param0.field_r;
        var9 = param0.field_u;
        var10 = param0.field_k;
        var11 = var10;
        var12 = param0.field_E + 1;
        L0: while (true) {
          L1: {
            L2: {
              if (var3 <= 0) {
                break L2;
              } else {
                L3: while (true) {
                  if (var10 != 0) {
                    if (var3 != 1) {
                      var8[var9] = (byte)var2;
                      var3--;
                      var9++;
                      var10--;
                      continue L3;
                    } else {
                      if (var10 != 0) {
                        var8[var9] = (byte)var2;
                        var9++;
                        var10--;
                        break L2;
                      } else {
                        var3 = 1;
                        break L1;
                      }
                    }
                  } else {
                    L4: {
                      var13 = param0.field_q;
                      param0.field_q = param0.field_q + (var11 - var10);
                      if (param0.field_q >= var13) {
                        break L4;
                      } else {
                        break L4;
                      }
                    }
                    param0.field_C = (byte) var2;
                    param0.field_t = var3;
                    param0.field_n = var4;
                    param0.field_I = var5;
                    hc.field_k = var6;
                    param0.field_D = var7;
                    param0.field_r = var8;
                    param0.field_u = var9;
                    param0.field_k = var10;
                    return;
                  }
                }
              }
            }
            L5: while (true) {
              if (var4 != var12) {
                L6: {
                  var17 = var16;
                  var2 = (byte)var5;
                  var7 = var17[var7];
                  var1 = (byte)var7;
                  var7 = var7 >> 8;
                  var4++;
                  if (var1 == var5) {
                    if (var4 != var12) {
                      var3 = 2;
                      var7 = var17[var7];
                      var1 = (byte)var7;
                      var7 = var7 >> 8;
                      var4++;
                      if (var4 != var12) {
                        if (var1 == var5) {
                          var3 = 3;
                          var7 = var17[var7];
                          var1 = (byte)var7;
                          var7 = var7 >> 8;
                          var4++;
                          if (var4 != var12) {
                            if (var1 == var5) {
                              var7 = var17[var7];
                              var1 = (byte)var7;
                              var7 = var7 >> 8;
                              var4++;
                              var3 = (var1 & 255) + 4;
                              var7 = var17[var7];
                              var5 = (byte)var7;
                              var7 = var7 >> 8;
                              var4++;
                              continue L0;
                            } else {
                              var5 = var1;
                              continue L0;
                            }
                          } else {
                            continue L0;
                          }
                        } else {
                          var5 = var1;
                          continue L0;
                        }
                      } else {
                        continue L0;
                      }
                    } else {
                      if (var10 != 0) {
                        break L6;
                      } else {
                        var3 = 1;
                        break L1;
                      }
                    }
                  } else {
                    var5 = var1;
                    if (var10 != 0) {
                      break L6;
                    } else {
                      var3 = 1;
                      break L1;
                    }
                  }
                }
                var8[var9] = (byte)var2;
                var9++;
                var10--;
                continue L5;
              } else {
                var3 = 0;
                break L1;
              }
            }
          }
          L7: {
            var13 = param0.field_q;
            param0.field_q = param0.field_q + (var11 - var10);
            if (param0.field_q >= var13) {
              break L7;
            } else {
              break L7;
            }
          }
          param0.field_C = (byte) var2;
          param0.field_t = var3;
          param0.field_n = var4;
          param0.field_I = var5;
          hc.field_k = var6;
          param0.field_D = var7;
          param0.field_r = var8;
          param0.field_u = var9;
          param0.field_k = var10;
          return;
        }
    }

    private final static byte c(gk param0) {
        return (byte)fe.a(1, param0);
    }

    private final static byte a(gk param0) {
        return (byte)fe.a(8, param0);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = new gk();
    }
}
