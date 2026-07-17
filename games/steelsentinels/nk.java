/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nk extends kd {
    int field_T;
    int field_C;
    private boolean field_L;
    private nk field_S;
    int field_V;
    private int field_D;
    private int field_z;
    gk field_U;
    int field_G;
    int field_E;
    gk field_R;
    int field_y;
    int field_N;
    int field_K;
    int field_Q;
    int field_W;
    private qd[] field_I;
    static dj field_F;
    private static int[] field_M;
    static pn field_A;
    static fm field_O;
    gk field_H;
    static String field_P;
    static int field_J;
    static boolean field_B;
    static String[] field_X;

    final static qb a(int param0, int param1, ee param2, int param3, int param4, boolean param5, int param6, int param7, int param8, int param9) {
        qb var10 = null;
        RuntimeException var10_ref = null;
        Object var11 = null;
        qb stackIn_3_0 = null;
        qb stackIn_4_0 = null;
        qb stackIn_5_0 = null;
        int stackIn_5_1 = 0;
        qb stackIn_6_0 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        qb stackOut_2_0 = null;
        qb stackOut_4_0 = null;
        int stackOut_4_1 = 0;
        qb stackOut_3_0 = null;
        int stackOut_3_1 = 0;
        qb stackOut_5_0 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        try {
          L0: {
            L1: {
              int discarded$4 = -105;
              var10 = ol.d();
              var10.field_O = param7;
              var10.field_B = param4;
              if (param3 > 86) {
                break L1;
              } else {
                var11 = null;
                qb discarded$5 = nk.a(91, 120, (ee) null, -2, -98, true, 88, 125, 5, -15);
                break L1;
              }
            }
            L2: {
              var10.field_P = param9;
              stackOut_2_0 = (qb) var10;
              stackIn_4_0 = stackOut_2_0;
              stackIn_3_0 = stackOut_2_0;
              if (!param5) {
                stackOut_4_0 = (qb) (Object) stackIn_4_0;
                stackOut_4_1 = 0;
                stackIn_5_0 = stackOut_4_0;
                stackIn_5_1 = stackOut_4_1;
                break L2;
              } else {
                stackOut_3_0 = (qb) (Object) stackIn_3_0;
                stackOut_3_1 = 1;
                stackIn_5_0 = stackOut_3_0;
                stackIn_5_1 = stackOut_3_1;
                break L2;
              }
            }
            stackIn_5_0.field_G = stackIn_5_1 != 0;
            var10.field_M = param0;
            var10.field_D = param6;
            var10.field_F = param8;
            var10.field_I = 0;
            var10.field_A = param1;
            var10.field_z = param2;
            stackOut_5_0 = (qb) var10;
            stackIn_6_0 = stackOut_5_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var10_ref = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) var10_ref;
            stackOut_7_1 = new StringBuilder().append("nk.K(").append(param0).append(44).append(param1).append(44);
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param2 == null) {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L3;
            } else {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L3;
            }
          }
          throw ci.a((Throwable) (Object) stackIn_10_0, stackIn_10_2 + 44 + param3 + 44 + param4 + 44 + param5 + 44 + param6 + 44 + param7 + 44 + param8 + 44 + param9 + 41);
        }
        return stackIn_6_0;
    }

    final void a(int param0, boolean param1, int param2, int param3, byte param4, int param5) {
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        L0: {
          var14 = SteelSentinels.field_G;
          var7 = ((nk) this).field_z + param5;
          if (param4 == 49) {
            break L0;
          } else {
            nk[] discarded$1 = ((nk) this).k(14);
            break L0;
          }
        }
        var8 = 0;
        L1: while (true) {
          if (((nk) this).field_I.length <= var8) {
            L2: {
              if (((nk) this).field_R == null) {
                break L2;
              } else {
                ((nk) this).field_R.a(((nk) this).field_G << 4, ((nk) this).field_E << 4, param2 << 4, param3 << 4, -var7, hj.field_w);
                break L2;
              }
            }
            L3: {
              if (param1) {
                ((nk) this).field_K = var7 + -param0 + -((nk) this).field_D;
                ((nk) this).field_W = ((nk) this).field_D + var7 - -param0;
                break L3;
              } else {
                break L3;
              }
            }
            L4: {
              var8 = 8 * hj.field_w / 4096;
              if (param2 + -var8 < nj.field_V) {
                nj.field_V = param2 - var8;
                break L4;
              } else {
                break L4;
              }
            }
            L5: {
              if (param3 + -var8 >= ti.field_y) {
                break L5;
              } else {
                ti.field_y = -var8 + param3;
                break L5;
              }
            }
            L6: {
              if (lh.field_t < var8 + param3) {
                lh.field_t = var8 + param3;
                break L6;
              } else {
                break L6;
              }
            }
            L7: {
              if (en.field_d < var8 + param2) {
                en.field_d = var8 + param2;
                break L7;
              } else {
                break L7;
              }
            }
            var15 = 0;
            var9 = var15;
            L8: while (true) {
              if (var15 >= ((nk) this).field_I.length) {
                return;
              } else {
                L9: {
                  if (((nk) this).field_I[var15].field_q != -1) {
                    break L9;
                  } else {
                    if (null != ((nk) this).field_I[var15].field_d) {
                      break L9;
                    } else {
                      var15++;
                      continue L8;
                    }
                  }
                }
                L10: {
                  var10 = jh.a(8192 * -var7 / 65536, param4 + 4047) * 16 / 65536;
                  var11 = 16 * kg.a(-var7 * 8192 / 65536, (byte) -82) / 65536;
                  ((nk) this).field_I[var15].field_k = (((-((nk) this).field_G + ((nk) this).field_I[var15].field_s) * var11 - -(var10 * (-((nk) this).field_E + ((nk) this).field_I[var15].field_r))) * hj.field_w >> 16) + param2;
                  ((nk) this).field_I[var15].field_l = ((var11 * (((nk) this).field_I[var15].field_r + -((nk) this).field_E) + -(var10 * (-((nk) this).field_G + ((nk) this).field_I[var15].field_s))) * hj.field_w >> 16) + param3;
                  ((nk) this).field_I[var15].field_f = var7 + ((nk) this).field_I[var15].field_n;
                  if (((nk) this).field_I[var15].field_d == null) {
                    break L10;
                  } else {
                    if (!((nk) this).field_I[var15].field_u) {
                      this.a((byte) -69, param1, ((nk) this).field_I[var15].field_f, var15, ((nk) this).field_I[var15].field_k, param0, ((nk) this).field_I[var15].field_l);
                      var15++;
                      continue L8;
                    } else {
                      break L10;
                    }
                  }
                }
                if (((nk) this).field_I[var15].field_d == null) {
                  if (((nk) this).field_I[var15].field_q != -1) {
                    if (param1) {
                      if (1024 != ((nk) this).field_I[var15].field_q) {
                        L11: {
                          if (nj.field_V > -var8 + ((nk) this).field_I[var15].field_k) {
                            nj.field_V = ((nk) this).field_I[var15].field_k + -var8;
                            break L11;
                          } else {
                            break L11;
                          }
                        }
                        L12: {
                          if (((nk) this).field_I[var15].field_k - -var8 > en.field_d) {
                            en.field_d = ((nk) this).field_I[var15].field_k + var8;
                            break L12;
                          } else {
                            break L12;
                          }
                        }
                        L13: {
                          if (-var8 + ((nk) this).field_I[var15].field_l >= ti.field_y) {
                            break L13;
                          } else {
                            ti.field_y = ((nk) this).field_I[var15].field_l + -var8;
                            break L13;
                          }
                        }
                        L14: {
                          if (lh.field_t >= ((nk) this).field_I[var15].field_l - -var8) {
                            break L14;
                          } else {
                            lh.field_t = ((nk) this).field_I[var15].field_l + var8;
                            break L14;
                          }
                        }
                        var10 = jh.a(((nk) this).field_I[var15].field_f * 8192 / 65536, 4096) * 16 / 65536;
                        var11 = kg.a(((nk) this).field_I[var15].field_f * 8192 / 65536, (byte) -68) * 16 / 65536;
                        var15++;
                        continue L8;
                      } else {
                        var15++;
                        continue L8;
                      }
                    } else {
                      var15++;
                      continue L8;
                    }
                  } else {
                    var15++;
                    continue L8;
                  }
                } else {
                  var15++;
                  continue L8;
                }
              }
            }
          } else {
            ((nk) this).field_I[var8].field_m = -((nk) this).field_I[var8].field_i + ((nk) this).field_I[var8].field_n + (var7 + -param0) + -((nk) this).field_D;
            ((nk) this).field_I[var8].field_j = ((nk) this).field_D + (((nk) this).field_I[var8].field_i + var7) + (((nk) this).field_I[var8].field_n - -param0);
            if (((nk) this).field_I[var8].field_d != null) {
              if (((nk) this).field_I[var8].field_u) {
                var9 = 16 * jh.a(8192 * -var7 / 65536, 4096) / 65536;
                var10 = 16 * kg.a(8192 * -var7 / 65536, (byte) -74) / 65536;
                var11 = (hj.field_w * ((((nk) this).field_I[var8].field_r + -((nk) this).field_E) * var9 + (((nk) this).field_I[var8].field_s + -((nk) this).field_G) * var10) >> 16) + param2;
                var12 = param3 - -((-(var9 * (((nk) this).field_I[var8].field_s - ((nk) this).field_G)) + var10 * (-((nk) this).field_E + ((nk) this).field_I[var8].field_r)) * hj.field_w >> 16);
                var13 = var7 - -((nk) this).field_I[var8].field_n;
                this.a((byte) -101, param1, var13, var8, var11, param0, var12);
                var8++;
                continue L1;
              } else {
                var8++;
                continue L1;
              }
            } else {
              var8++;
              continue L1;
            }
          }
        }
    }

    final nk[] a(int param0, mb param1, nk[] param2, int param3, int param4) {
        RuntimeException var6 = null;
        int var6_int = 0;
        nk[] var7 = null;
        int var8 = 0;
        int var9 = 0;
        int stackIn_19_0 = 0;
        nk[] stackIn_31_0 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        RuntimeException stackIn_35_0 = null;
        StringBuilder stackIn_35_1 = null;
        String stackIn_35_2 = null;
        RuntimeException stackIn_36_0 = null;
        StringBuilder stackIn_36_1 = null;
        RuntimeException stackIn_37_0 = null;
        StringBuilder stackIn_37_1 = null;
        RuntimeException stackIn_38_0 = null;
        StringBuilder stackIn_38_1 = null;
        String stackIn_38_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_17_0 = 0;
        int stackOut_16_0 = 0;
        int stackOut_14_0 = 0;
        nk[] stackOut_30_0 = null;
        RuntimeException stackOut_32_0 = null;
        StringBuilder stackOut_32_1 = null;
        RuntimeException stackOut_34_0 = null;
        StringBuilder stackOut_34_1 = null;
        String stackOut_34_2 = null;
        RuntimeException stackOut_33_0 = null;
        StringBuilder stackOut_33_1 = null;
        String stackOut_33_2 = null;
        RuntimeException stackOut_35_0 = null;
        StringBuilder stackOut_35_1 = null;
        RuntimeException stackOut_37_0 = null;
        StringBuilder stackOut_37_1 = null;
        String stackOut_37_2 = null;
        RuntimeException stackOut_36_0 = null;
        StringBuilder stackOut_36_1 = null;
        String stackOut_36_2 = null;
        var9 = SteelSentinels.field_G;
        try {
          L0: {
            L1: {
              if (param0 == 0) {
                break L1;
              } else {
                ((nk) this).field_R = null;
                break L1;
              }
            }
            L2: {
              L3: {
                if (param4 != ja.a(((nk) this).field_N, false)) {
                  break L3;
                } else {
                  if (((nk) this).field_Q <= 0) {
                    break L3;
                  } else {
                    if (((nk) this).field_C <= 0) {
                      L4: {
                        if (((nk) this).field_K <= param3) {
                          if (param3 <= ((nk) this).field_W) {
                            stackOut_17_0 = 1;
                            stackIn_19_0 = stackOut_17_0;
                            break L4;
                          } else {
                            stackOut_16_0 = 0;
                            stackIn_19_0 = stackOut_16_0;
                            break L4;
                          }
                        } else {
                          stackOut_14_0 = 0;
                          stackIn_19_0 = stackOut_14_0;
                          break L4;
                        }
                      }
                      L5: {
                        var6_int = stackIn_19_0;
                        if (var6_int == 0) {
                          break L5;
                        } else {
                          if (!param1.field_Lb) {
                            break L5;
                          } else {
                            if (!bi.b(105, ((nk) this).field_N)) {
                              break L5;
                            } else {
                              if (param1.i(31, param0 + -27)) {
                                break L5;
                              } else {
                                var6_int = 0;
                                break L5;
                              }
                            }
                          }
                        }
                      }
                      if (var6_int != 0) {
                        var7 = new nk[param2.length + 1];
                        var8 = 0;
                        L6: while (true) {
                          if (param2.length <= var8) {
                            var7[param2.length] = (nk) (Object) param2;
                            param2 = var7;
                            break L2;
                          } else {
                            var7[var8] = param2[var8];
                            var8++;
                            continue L6;
                          }
                        }
                      } else {
                        break L2;
                      }
                    } else {
                      break L3;
                    }
                  }
                }
              }
              var6_int = 0;
              L7: while (true) {
                if (((nk) this).field_I.length <= var6_int) {
                  break L2;
                } else {
                  L8: {
                    if (((nk) this).field_I[var6_int].field_d != null) {
                      param2 = ((nk) this).field_I[var6_int].field_d.a(param0, param1, param2, param3, param4);
                      break L8;
                    } else {
                      break L8;
                    }
                  }
                  var6_int++;
                  continue L7;
                }
              }
            }
            stackOut_30_0 = (nk[]) param2;
            stackIn_31_0 = stackOut_30_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L9: {
            var6 = decompiledCaughtException;
            stackOut_32_0 = (RuntimeException) var6;
            stackOut_32_1 = new StringBuilder().append("nk.I(").append(param0).append(44);
            stackIn_34_0 = stackOut_32_0;
            stackIn_34_1 = stackOut_32_1;
            stackIn_33_0 = stackOut_32_0;
            stackIn_33_1 = stackOut_32_1;
            if (param1 == null) {
              stackOut_34_0 = (RuntimeException) (Object) stackIn_34_0;
              stackOut_34_1 = (StringBuilder) (Object) stackIn_34_1;
              stackOut_34_2 = "null";
              stackIn_35_0 = stackOut_34_0;
              stackIn_35_1 = stackOut_34_1;
              stackIn_35_2 = stackOut_34_2;
              break L9;
            } else {
              stackOut_33_0 = (RuntimeException) (Object) stackIn_33_0;
              stackOut_33_1 = (StringBuilder) (Object) stackIn_33_1;
              stackOut_33_2 = "{...}";
              stackIn_35_0 = stackOut_33_0;
              stackIn_35_1 = stackOut_33_1;
              stackIn_35_2 = stackOut_33_2;
              break L9;
            }
          }
          L10: {
            stackOut_35_0 = (RuntimeException) (Object) stackIn_35_0;
            stackOut_35_1 = ((StringBuilder) (Object) stackIn_35_1).append(stackIn_35_2).append(44);
            stackIn_37_0 = stackOut_35_0;
            stackIn_37_1 = stackOut_35_1;
            stackIn_36_0 = stackOut_35_0;
            stackIn_36_1 = stackOut_35_1;
            if (param2 == null) {
              stackOut_37_0 = (RuntimeException) (Object) stackIn_37_0;
              stackOut_37_1 = (StringBuilder) (Object) stackIn_37_1;
              stackOut_37_2 = "null";
              stackIn_38_0 = stackOut_37_0;
              stackIn_38_1 = stackOut_37_1;
              stackIn_38_2 = stackOut_37_2;
              break L10;
            } else {
              stackOut_36_0 = (RuntimeException) (Object) stackIn_36_0;
              stackOut_36_1 = (StringBuilder) (Object) stackIn_36_1;
              stackOut_36_2 = "{...}";
              stackIn_38_0 = stackOut_36_0;
              stackIn_38_1 = stackOut_36_1;
              stackIn_38_2 = stackOut_36_2;
              break L10;
            }
          }
          throw ci.a((Throwable) (Object) stackIn_38_0, stackIn_38_2 + 44 + param3 + 44 + param4 + 41);
        }
        return stackIn_31_0;
    }

    final int e(byte param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int stackIn_4_0 = 0;
        int stackOut_2_0 = 0;
        int stackOut_3_0 = 0;
        L0: {
          L1: {
            var4 = SteelSentinels.field_G;
            if (((nk) this).field_N < 0) {
              break L1;
            } else {
              if (((nk) this).field_N >= tc.field_B.length) {
                break L1;
              } else {
                stackOut_2_0 = tc.field_B[((nk) this).field_N];
                stackIn_4_0 = stackOut_2_0;
                break L0;
              }
            }
          }
          stackOut_3_0 = 0;
          stackIn_4_0 = stackOut_3_0;
          break L0;
        }
        var2 = stackIn_4_0;
        var3 = 0;
        L2: while (true) {
          if (var3 >= ((nk) this).field_I.length) {
            L3: {
              if (param0 < -50) {
                break L3;
              } else {
                ((nk) this).field_U = null;
                break L3;
              }
            }
            return var2;
          } else {
            if (((nk) this).field_I[var3].field_d != null) {
              var2 = var2 + ((nk) this).field_I[var3].field_d.e((byte) -63);
              var3++;
              continue L2;
            } else {
              var3++;
              continue L2;
            }
          }
        }
    }

    final int a(byte param0, qd param1) {
        qd[] var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        qd var5 = null;
        nk var6 = null;
        int var7 = 0;
        int var8 = 0;
        qd[] var9 = null;
        int stackIn_10_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_18_0 = 0;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_17_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_12_0 = 0;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        var8 = SteelSentinels.field_G;
        try {
          L0: {
            var9 = ((nk) this).field_I;
            var3 = var9;
            var4 = 0;
            L1: while (true) {
              if (var4 >= var9.length) {
                L2: {
                  if (param0 == 2) {
                    break L2;
                  } else {
                    field_J = 118;
                    break L2;
                  }
                }
                stackOut_17_0 = -1;
                stackIn_18_0 = stackOut_17_0;
                break L0;
              } else {
                L3: {
                  var5 = var9[var4];
                  var6 = var5.field_d;
                  if (var6 != null) {
                    L4: {
                      if (var5.field_s != param1.field_s) {
                        break L4;
                      } else {
                        if (var5.field_r != param1.field_r) {
                          break L4;
                        } else {
                          if (var5.field_q == param1.field_q) {
                            stackOut_9_0 = var6.field_N;
                            stackIn_10_0 = stackOut_9_0;
                            return stackIn_10_0;
                          } else {
                            break L4;
                          }
                        }
                      }
                    }
                    var7 = var6.a((byte) 2, param1);
                    if (var7 < 0) {
                      break L3;
                    } else {
                      stackOut_12_0 = var7;
                      stackIn_13_0 = stackOut_12_0;
                      return stackIn_13_0;
                    }
                  } else {
                    break L3;
                  }
                }
                var4++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var3_ref = decompiledCaughtException;
            stackOut_19_0 = (RuntimeException) var3_ref;
            stackOut_19_1 = new StringBuilder().append("nk.P(").append(param0).append(44);
            stackIn_21_0 = stackOut_19_0;
            stackIn_21_1 = stackOut_19_1;
            stackIn_20_0 = stackOut_19_0;
            stackIn_20_1 = stackOut_19_1;
            if (param1 == null) {
              stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "null";
              stackIn_22_0 = stackOut_21_0;
              stackIn_22_1 = stackOut_21_1;
              stackIn_22_2 = stackOut_21_2;
              break L5;
            } else {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "{...}";
              stackIn_22_0 = stackOut_20_0;
              stackIn_22_1 = stackOut_20_1;
              stackIn_22_2 = stackOut_20_2;
              break L5;
            }
          }
          throw ci.a((Throwable) (Object) stackIn_22_0, stackIn_22_2 + 41);
        }
        return stackIn_18_0;
    }

    final int g(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        Object var5 = null;
        L0: {
          var4 = SteelSentinels.field_G;
          var2 = 0;
          if (param0 == 8192) {
            break L0;
          } else {
            var5 = null;
            nk discarded$2 = ((nk) this).a(-87, (String) null);
            break L0;
          }
        }
        var3 = 0;
        L1: while (true) {
          if (((nk) this).field_I.length <= var3) {
            return var2;
          } else {
            var2 = var2 + ((nk) this).field_I[var3].field_e;
            if (((nk) this).field_I[var3].field_d != null) {
              var2 = var2 + ((nk) this).field_I[var3].field_d.g(param0);
              var3++;
              continue L1;
            } else {
              var3++;
              continue L1;
            }
          }
        }
    }

    final int j(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        var4 = SteelSentinels.field_G;
        var2 = 0;
        var3 = param0;
        L0: while (true) {
          if (((nk) this).field_I.length <= var3) {
            return var2;
          } else {
            var2 = var2 + ((nk) this).field_I[var3].field_w;
            if (((nk) this).field_I[var3].field_d != null) {
              var2 = var2 + ((nk) this).field_I[var3].field_d.j(param0);
              var3++;
              continue L0;
            } else {
              var3++;
              continue L0;
            }
          }
        }
    }

    final void a(byte param0, int param1, int param2, int param3) {
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
        int stackIn_3_0 = 0;
        int stackIn_6_0 = 0;
        int stackOut_2_0 = 0;
        int stackOut_1_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_4_0 = 0;
        L0: {
          var13 = SteelSentinels.field_G;
          if (!((nk) this).field_L) {
            stackOut_2_0 = hj.field_w << 2;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          } else {
            stackOut_1_0 = hj.field_w;
            stackIn_3_0 = stackOut_1_0;
            break L0;
          }
        }
        L1: {
          var5 = stackIn_3_0;
          if (!((nk) this).field_L) {
            stackOut_5_0 = 2;
            stackIn_6_0 = stackOut_5_0;
            break L1;
          } else {
            stackOut_4_0 = 4;
            stackIn_6_0 = stackOut_4_0;
            break L1;
          }
        }
        var6 = stackIn_6_0;
        var7 = ((nk) this).field_y;
        var8 = 0;
        L2: while (true) {
          if (var8 >= ((nk) this).field_I.length) {
            L3: {
              if (param0 >= 97) {
                break L3;
              } else {
                ((nk) this).field_H = null;
                break L3;
              }
            }
            L4: {
              L5: {
                if (((nk) this).field_N != 108) {
                  break L5;
                } else {
                  if (vi.field_db) {
                    if (((nk) this).field_C > 0) {
                      if (50 < ((nk) this).field_C) {
                        break L4;
                      } else {
                        ((nk) this).field_U.a(140 << var6, 130 << var6, param1 << 4, param2 << 4, -var7, (-((nk) this).field_C + 50) * var5 / 50);
                        break L4;
                      }
                    } else {
                      ((nk) this).field_U.a(140 << var6, 130 << var6, param1 << 4, param2 << 4, -var7, var5);
                      break L4;
                    }
                  } else {
                    break L5;
                  }
                }
              }
              L6: {
                if (param3 != 1) {
                  break L6;
                } else {
                  if (null == ((nk) this).field_U) {
                    break L6;
                  } else {
                    if (0 < ((nk) this).field_C) {
                      if (((nk) this).field_C > 50) {
                        break L4;
                      } else {
                        ((nk) this).field_U.a(((nk) this).field_G << var6, ((nk) this).field_E << var6, param1 << 4, param2 << 4, -var7, (-((nk) this).field_C + 50) * var5 / 50);
                        break L4;
                      }
                    } else {
                      ((nk) this).field_U.a(((nk) this).field_G << var6, ((nk) this).field_E << var6, param1 << 4, param2 << 4, -var7, var5);
                      break L4;
                    }
                  }
                }
              }
              if (null != ((nk) this).field_H) {
                if (0 >= ((nk) this).field_C) {
                  ((nk) this).field_H.a(4 * ((nk) this).field_H.field_g - ((nk) this).field_G << var6, ((nk) this).field_E << var6, param1 << 4, param2 << 4, var7, var5);
                  break L4;
                } else {
                  if (((nk) this).field_C > 50) {
                    break L4;
                  } else {
                    ((nk) this).field_H.a(((nk) this).field_H.field_g * 4 + -((nk) this).field_G << var6, ((nk) this).field_E << var6, param1 << 4, param2 << 4, var7, (-((nk) this).field_C + 50) * var5 / 50);
                    break L4;
                  }
                }
              } else {
                break L4;
              }
            }
            var14 = 0;
            var8 = var14;
            L7: while (true) {
              if (var14 >= ((nk) this).field_I.length) {
                return;
              } else {
                if (null != ((nk) this).field_I[var14].field_d) {
                  if (!((nk) this).field_I[var14].field_u) {
                    var9 = jh.a(-var7 / 8, 4096) / 256;
                    var10 = kg.a(-var7 / 8, (byte) -71) / 256;
                    var11 = param3 * (hj.field_w * ((((nk) this).field_I[var14].field_r - ((nk) this).field_E) * var9 + var10 * (-((nk) this).field_G + ((nk) this).field_I[var14].field_s)) >> 20) + param1;
                    var12 = param2 + (hj.field_w * ((((nk) this).field_I[var14].field_r + -((nk) this).field_E) * var10 + -(var9 * (-((nk) this).field_G + ((nk) this).field_I[var14].field_s))) >> 20);
                    ((nk) this).field_I[var14].field_d.a((byte) 101, var11, var12, param3);
                    var14++;
                    continue L7;
                  } else {
                    var14++;
                    continue L7;
                  }
                } else {
                  var14++;
                  continue L7;
                }
              }
            }
          } else {
            if (null != ((nk) this).field_I[var8].field_d) {
              if (((nk) this).field_I[var8].field_u) {
                var9 = jh.a(-var7 / 8, 4096) / 256;
                var10 = kg.a(-var7 / 8, (byte) -103) / 256;
                var11 = param3 * (hj.field_w * ((((nk) this).field_I[var8].field_r - ((nk) this).field_E) * var9 + (((nk) this).field_I[var8].field_s - ((nk) this).field_G) * var10) >> 20) + param1;
                var12 = ((-((((nk) this).field_I[var8].field_s - ((nk) this).field_G) * var9) + (-((nk) this).field_E + ((nk) this).field_I[var8].field_r) * var10) * hj.field_w >> 20) + param2;
                ((nk) this).field_I[var8].field_d.a((byte) 122, var11, var12, param3);
                var8++;
                continue L2;
              } else {
                var8++;
                continue L2;
              }
            } else {
              var8++;
              continue L2;
            }
          }
        }
    }

    final int a(int param0, int[] param1, boolean param2, int param3) {
        RuntimeException var5 = null;
        int var5_int = 0;
        int var6 = 0;
        nk var7 = null;
        int var8 = 0;
        int stackIn_10_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_18_0 = 0;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_17_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_9_0 = 0;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        var8 = SteelSentinels.field_G;
        try {
          L0: {
            var5_int = param3;
            L1: while (true) {
              if (((nk) this).field_I.length <= var5_int) {
                stackOut_17_0 = param0;
                stackIn_18_0 = stackOut_17_0;
                break L0;
              } else {
                L2: {
                  if (null != ((nk) this).field_I[var5_int].field_d) {
                    param0 = ((nk) this).field_I[var5_int].field_d.a(param0, param1, param2, 0);
                    break L2;
                  } else {
                    if (-1 != ((nk) this).field_I[var5_int].field_q) {
                      int incrementValue$1 = param0;
                      param0++;
                      var6 = param1[incrementValue$1];
                      if (var6 != -1) {
                        var7 = ul.a(var6, (byte) 67);
                        if (var7 != null) {
                          if ((var7.field_Q & ((nk) this).field_I[var5_int].field_q) != 0) {
                            ((nk) this).field_I[var5_int].field_d = new nk(var7, param2);
                            param0 = ((nk) this).field_I[var5_int].field_d.a(param0, param1, param2, 0);
                            break L2;
                          } else {
                            dh.a(db.a("Component not correct id=<%0> type=<%0> desired=<%1>", -71, new String[3]), (byte) 124);
                            stackOut_12_0 = param0;
                            stackIn_13_0 = stackOut_12_0;
                            return stackIn_13_0;
                          }
                        } else {
                          dh.a(db.a("Component Id not valid ID=<%0> data_pos=<%1>", -61, new String[2]), (byte) 118);
                          stackOut_9_0 = param0;
                          stackIn_10_0 = stackOut_9_0;
                          return stackIn_10_0;
                        }
                      } else {
                        break L2;
                      }
                    } else {
                      break L2;
                    }
                  }
                }
                var5_int++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5 = decompiledCaughtException;
            stackOut_19_0 = (RuntimeException) var5;
            stackOut_19_1 = new StringBuilder().append("nk.F(").append(param0).append(44);
            stackIn_21_0 = stackOut_19_0;
            stackIn_21_1 = stackOut_19_1;
            stackIn_20_0 = stackOut_19_0;
            stackIn_20_1 = stackOut_19_1;
            if (param1 == null) {
              stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "null";
              stackIn_22_0 = stackOut_21_0;
              stackIn_22_1 = stackOut_21_1;
              stackIn_22_2 = stackOut_21_2;
              break L3;
            } else {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "{...}";
              stackIn_22_0 = stackOut_20_0;
              stackIn_22_1 = stackOut_20_1;
              stackIn_22_2 = stackOut_20_2;
              break L3;
            }
          }
          throw ci.a((Throwable) (Object) stackIn_22_0, stackIn_22_2 + 44 + param2 + 44 + param3 + 41);
        }
        return stackIn_18_0;
    }

    public static void d() {
        field_F = null;
        field_P = null;
        field_M = null;
        field_X = null;
        field_A = null;
        field_O = null;
    }

    final void b(int param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        var4 = SteelSentinels.field_G;
        var3 = 0;
        L0: while (true) {
          if (var3 >= ((nk) this).field_I.length) {
            var3 = -45 / ((param1 - -41) / 32);
            return;
          } else {
            if (null != ((nk) this).field_I[var3].field_d) {
              ((nk) this).field_I[var3].field_d.b(param0, -107);
              var3++;
              continue L0;
            } else {
              var3++;
              continue L0;
            }
          }
        }
    }

    final void b(byte param0, int param1, int param2, int param3) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        L0: {
          var10 = SteelSentinels.field_G;
          ((nk) this).field_T = param1;
          ((nk) this).field_V = param3;
          if (param0 == -128) {
            break L0;
          } else {
            String discarded$2 = ((nk) this).l(35);
            break L0;
          }
        }
        var5 = 0;
        L1: while (true) {
          if (var5 >= ((nk) this).field_I.length) {
            return;
          } else {
            if (null != ((nk) this).field_I[var5].field_d) {
              var6 = 32 * jh.a(-((nk) this).field_y * 8192 / 65536, 4096) / 65536;
              var7 = kg.a(-((nk) this).field_y * 8192 / 65536, (byte) -68) * 32 / 65536;
              var8 = param1 + ((-((nk) this).field_E + ((nk) this).field_I[var5].field_r) * var6 + var7 * (((nk) this).field_I[var5].field_s - ((nk) this).field_G)) * param2;
              var9 = param3 + (-((nk) this).field_E + ((nk) this).field_I[var5].field_r) * var7 + -(var6 * (((nk) this).field_I[var5].field_s + -((nk) this).field_G));
              ((nk) this).field_I[var5].field_d.b((byte) -128, var8, param2, var9);
              var5++;
              continue L1;
            } else {
              var5++;
              continue L1;
            }
          }
        }
    }

    private final void a(int param0, boolean param1, nk param2) {
        RuntimeException var4 = null;
        wk var4_ref = null;
        int var4_int = 0;
        int[] var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        Object stackIn_2_0 = null;
        Object stackIn_3_0 = null;
        Object stackIn_4_0 = null;
        int stackIn_4_1 = 0;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_29_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_1_0 = null;
        Object stackOut_3_0 = null;
        int stackOut_3_1 = 0;
        Object stackOut_2_0 = null;
        int stackOut_2_1 = 0;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        String stackOut_28_2 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        String stackOut_27_2 = null;
        var8 = SteelSentinels.field_G;
        try {
          L0: {
            L1: {
              stackOut_1_0 = this;
              stackIn_3_0 = stackOut_1_0;
              stackIn_2_0 = stackOut_1_0;
              if (!param1) {
                stackOut_3_0 = this;
                stackOut_3_1 = 0;
                stackIn_4_0 = stackOut_3_0;
                stackIn_4_1 = stackOut_3_1;
                break L1;
              } else {
                stackOut_2_0 = this;
                stackOut_2_1 = 1;
                stackIn_4_0 = stackOut_2_0;
                stackIn_4_1 = stackOut_2_1;
                break L1;
              }
            }
            L2: {
              ((nk) this).field_L = stackIn_4_1 != 0;
              if (!param1) {
                L3: {
                  if (param2.field_U != null) {
                    break L3;
                  } else {
                    if (param2.field_R != null) {
                      var4_ref = new wk(param2.field_R.field_g >> 2, param2.field_R.field_d >> 2);
                      var5 = pb.field_g;
                      var4_ref.d();
                      param2.field_R.b(0, 0);
                      pb.a(var5, 640, 480);
                      param2.field_U = new gk(var4_ref.field_z, var4_ref.field_B, 129);
                      var6 = var4_ref.field_E.length + -1;
                      L4: while (true) {
                        if (var6 < 0) {
                          param2.field_U.field_o = rm.field_h;
                          param2.field_H = param2.field_U.b();
                          param2.field_H.field_o = param2.field_U.field_o;
                          break L3;
                        } else {
                          L5: {
                            var7 = var4_ref.field_E[var6];
                            if (var7 != 0) {
                              if ((65535 & var7) != var7 >> 8) {
                                param2.field_U.field_p[var6] = (byte)(65 + 63 * ec.a(255, var7) / 255);
                                break L5;
                              } else {
                                param2.field_U.field_p[var6] = (byte)(1 + 63 * ec.a(var7, 255) / 255);
                                break L5;
                              }
                            } else {
                              param2.field_U.field_p[var6] = (byte) 0;
                              break L5;
                            }
                          }
                          var6--;
                          continue L4;
                        }
                      }
                    } else {
                      break L3;
                    }
                  }
                }
                ((nk) this).field_U = param2.field_U;
                ((nk) this).field_R = param2.field_R;
                ((nk) this).field_H = param2.field_H;
                break L2;
              } else {
                ((nk) this).field_R = param2.field_R;
                break L2;
              }
            }
            ((nk) this).field_G = param2.field_G;
            ((nk) this).field_D = param2.field_D;
            ((nk) this).field_Q = param2.field_Q;
            ((nk) this).field_z = param2.field_z;
            ((nk) this).field_E = param2.field_E;
            ((nk) this).field_N = param2.field_N;
            ((nk) this).field_I = new qd[param2.field_I.length];
            var4_int = 0;
            L6: while (true) {
              if (var4_int >= ((nk) this).field_I.length) {
                ((nk) this).field_K = param2.field_K;
                ((nk) this).field_y = param2.field_y;
                ((nk) this).field_W = param2.field_W;
                break L0;
              } else {
                ((nk) this).field_I[var4_int] = new qd(param2.field_I[var4_int], param1);
                var4_int++;
                continue L6;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var4 = decompiledCaughtException;
            stackOut_26_0 = (RuntimeException) var4;
            stackOut_26_1 = new StringBuilder().append("nk.L(").append(-353384856).append(44).append(param1).append(44);
            stackIn_28_0 = stackOut_26_0;
            stackIn_28_1 = stackOut_26_1;
            stackIn_27_0 = stackOut_26_0;
            stackIn_27_1 = stackOut_26_1;
            if (param2 == null) {
              stackOut_28_0 = (RuntimeException) (Object) stackIn_28_0;
              stackOut_28_1 = (StringBuilder) (Object) stackIn_28_1;
              stackOut_28_2 = "null";
              stackIn_29_0 = stackOut_28_0;
              stackIn_29_1 = stackOut_28_1;
              stackIn_29_2 = stackOut_28_2;
              break L7;
            } else {
              stackOut_27_0 = (RuntimeException) (Object) stackIn_27_0;
              stackOut_27_1 = (StringBuilder) (Object) stackIn_27_1;
              stackOut_27_2 = "{...}";
              stackIn_29_0 = stackOut_27_0;
              stackIn_29_1 = stackOut_27_1;
              stackIn_29_2 = stackOut_27_2;
              break L7;
            }
          }
          throw ci.a((Throwable) (Object) stackIn_29_0, stackIn_29_2 + 41);
        }
    }

    private final void a(byte param0, boolean param1, int param2, int param3, int param4, int param5, int param6) {
        if (param0 > -63) {
            return;
        }
        ((nk) this).field_I[param3].field_d.a(((nk) this).field_D + param5 - -((nk) this).field_I[param3].field_i, param1, param4, param6, (byte) 49, param2);
    }

    final void d(int param0, int param1) {
        ed.field_f = 0;
        gl.field_p = -1;
        si.field_t = 0;
        if (param0 != 65536) {
            ((nk) this).field_y = 13;
        }
        this.e(param1, 5307);
    }

    final void a(byte param0, boolean param1, boolean param2) {
        L0: {
          if (((nk) this).field_C <= 0) {
            break L0;
          } else {
            L1: {
              ((nk) this).field_C = ((nk) this).field_C - 1;
              if (!param2) {
                break L1;
              } else {
                if (((nk) this).field_Q != 128) {
                  break L1;
                } else {
                  if (((nk) this).field_C <= 75) {
                    break L0;
                  } else {
                    ((nk) this).field_C = 75;
                    break L0;
                  }
                }
              }
            }
            if (param1) {
              if (((nk) this).field_C <= 0) {
                break L0;
              } else {
                ((nk) this).field_C = ((nk) this).field_C - 1;
                break L0;
              }
            } else {
              break L0;
            }
          }
        }
        L2: {
          if (param0 < -23) {
            break L2;
          } else {
            field_X = null;
            break L2;
          }
        }
    }

    final nk[] k(int param0) {
        int var2 = 66 / ((29 - param0) / 57);
        nk[] var3 = new nk[]{};
        int discarded$0 = 3;
        return this.a(var3);
    }

    final int i(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        var4 = SteelSentinels.field_G;
        if (param0 < -104) {
          var2 = 0;
          var3 = 0;
          L0: while (true) {
            if (((nk) this).field_I.length <= var3) {
              return var2;
            } else {
              var2 = var2 + ((nk) this).field_I[var3].field_p;
              if (null != ((nk) this).field_I[var3].field_d) {
                var2 = var2 + ((nk) this).field_I[var3].field_d.i(-116);
                var3++;
                continue L0;
              } else {
                var3++;
                continue L0;
              }
            }
          }
        } else {
          return 21;
        }
    }

    final int h(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        var4 = SteelSentinels.field_G;
        var2 = 0;
        var3 = 0;
        if (param0 == -31496) {
          L0: while (true) {
            if (var3 >= ((nk) this).field_I.length) {
              return var2;
            } else {
              var2 = var2 + ((nk) this).field_I[var3].field_b;
              if (((nk) this).field_I[var3].field_d != null) {
                var2 = var2 + ((nk) this).field_I[var3].field_d.h(-31496);
                var3++;
                continue L0;
              } else {
                var3++;
                continue L0;
              }
            }
          }
        } else {
          return 18;
        }
    }

    final qd c(int param0, int param1) {
        int var3 = 0;
        qd var4 = null;
        int var5 = 0;
        var5 = SteelSentinels.field_G;
        var3 = param0;
        L0: while (true) {
          if (((nk) this).field_I.length > var3) {
            if (null == ((nk) this).field_I[var3].field_d) {
              if (1024 == ((nk) this).field_I[var3].field_q) {
                return ((nk) this).field_I[var3];
              } else {
                var3++;
                continue L0;
              }
            } else {
              if (((nk) this).field_I[var3].field_d.field_Q != 1024) {
                var4 = ((nk) this).field_I[var3].field_d.c(0, param1);
                if (var4 != null) {
                  return var4;
                } else {
                  var3++;
                  continue L0;
                }
              } else {
                return ((nk) this).field_I[var3];
              }
            }
          } else {
            return null;
          }
        }
    }

    final boolean f(int param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        var4 = SteelSentinels.field_G;
        var3 = 0;
        L0: while (true) {
          if (var3 >= ((nk) this).field_I.length) {
            if (param1 == -1) {
              return false;
            } else {
              String discarded$1 = ((nk) this).l(127);
              return false;
            }
          } else {
            L1: {
              if ((((nk) this).field_I[var3].field_q & param0) <= 0) {
                break L1;
              } else {
                if (((nk) this).field_I[var3].field_q != -1) {
                  return true;
                } else {
                  break L1;
                }
              }
            }
            if (null != ((nk) this).field_I[var3].field_d) {
              if (((nk) this).field_I[var3].field_d.f(param0, -1)) {
                return true;
              } else {
                var3++;
                continue L0;
              }
            } else {
              var3++;
              continue L0;
            }
          }
        }
    }

    final int a(int param0, int[] param1, int param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int stackIn_13_0 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_12_0 = 0;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        var5 = SteelSentinels.field_G;
        try {
          L0: {
            L1: {
              if (param0 != ~((nk) this).field_N) {
                int incrementValue$52 = param2;
                param2++;
                param1[incrementValue$52] = ((nk) this).field_N;
                break L1;
              } else {
                break L1;
              }
            }
            var4_int = 0;
            L2: while (true) {
              if (var4_int >= ((nk) this).field_I.length) {
                stackOut_12_0 = param2;
                stackIn_13_0 = stackOut_12_0;
                break L0;
              } else {
                L3: {
                  if (null != ((nk) this).field_I[var4_int].field_d) {
                    param2 = ((nk) this).field_I[var4_int].field_d.a(0, param1, param2);
                    break L3;
                  } else {
                    if (-1 != ((nk) this).field_I[var4_int].field_q) {
                      int incrementValue$53 = param2;
                      param2++;
                      param1[incrementValue$53] = -1;
                      break L3;
                    } else {
                      break L3;
                    }
                  }
                }
                var4_int++;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var4 = decompiledCaughtException;
            stackOut_14_0 = (RuntimeException) var4;
            stackOut_14_1 = new StringBuilder().append("nk.D(").append(param0).append(44);
            stackIn_16_0 = stackOut_14_0;
            stackIn_16_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param1 == null) {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L4;
            } else {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "{...}";
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              stackIn_17_2 = stackOut_15_2;
              break L4;
            }
          }
          throw ci.a((Throwable) (Object) stackIn_17_0, stackIn_17_2 + 44 + param2 + 41);
        }
        return stackIn_13_0;
    }

    final String l(int param0) {
        int var2 = 0;
        int var3 = 0;
        Object var4 = null;
        L0: {
          var3 = SteelSentinels.field_G;
          if (((nk) this).field_N < 0) {
            break L0;
          } else {
            if (t.field_e.length > ((nk) this).field_N) {
              if (t.field_e[((nk) this).field_N] != null) {
                return t.field_e[((nk) this).field_N];
              } else {
                break L0;
              }
            } else {
              break L0;
            }
          }
        }
        L1: {
          if (param0 == -24719) {
            break L1;
          } else {
            var4 = null;
            qd[] discarded$2 = ((nk) this).a((qd[]) null, -66, -17);
            break L1;
          }
        }
        var2 = 0;
        L2: while (true) {
          if (((nk) this).field_I.length > var2) {
            if (((nk) this).field_I[var2].field_v != null) {
              return ((nk) this).field_I[var2].field_v;
            } else {
              var2++;
              continue L2;
            }
          } else {
            return null;
          }
        }
    }

    final int[] c(byte param0) {
        if (param0 != 125) {
            ((nk) this).field_N = -25;
        }
        int[] var3 = new int[]{};
        int[] var2 = var3;
        return this.a(var3, param0 ^ 6900);
    }

    private final int[] a(int[] param0, int param1) {
        RuntimeException var3 = null;
        int var3_int = 0;
        int var4 = 0;
        int var5_int = 0;
        int[] var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int[] var10 = null;
        int[] stackIn_20_0 = null;
        int[] stackIn_33_0 = null;
        RuntimeException stackIn_35_0 = null;
        StringBuilder stackIn_35_1 = null;
        RuntimeException stackIn_36_0 = null;
        StringBuilder stackIn_36_1 = null;
        RuntimeException stackIn_37_0 = null;
        StringBuilder stackIn_37_1 = null;
        String stackIn_37_2 = null;
        RuntimeException decompiledCaughtException = null;
        int[] stackOut_19_0 = null;
        int[] stackOut_32_0 = null;
        RuntimeException stackOut_34_0 = null;
        StringBuilder stackOut_34_1 = null;
        RuntimeException stackOut_36_0 = null;
        StringBuilder stackOut_36_1 = null;
        String stackOut_36_2 = null;
        RuntimeException stackOut_35_0 = null;
        StringBuilder stackOut_35_1 = null;
        String stackOut_35_2 = null;
        var9 = SteelSentinels.field_G;
        try {
          L0: {
            L1: {
              var3_int = 0;
              if ((1008 & ((nk) this).field_Q) == 0) {
                break L1;
              } else {
                if (83 != ((nk) this).field_N) {
                  var3_int = 1;
                  break L1;
                } else {
                  break L1;
                }
              }
            }
            var4 = 0;
            L2: while (true) {
              if (var4 >= ((nk) this).field_I.length) {
                L3: {
                  if (param1 == 6793) {
                    break L3;
                  } else {
                    ((nk) this).a((byte) -7, true, true);
                    break L3;
                  }
                }
                L4: {
                  if (var3_int == 0) {
                    break L4;
                  } else {
                    if (-1 == ((nk) this).field_N) {
                      break L4;
                    } else {
                      var4 = param0.length;
                      var5_int = 0;
                      L5: while (true) {
                        if (var5_int >= var4) {
                          var5 = param0;
                          var10 = new int[var4 + 1];
                          param0 = var10;
                          var6 = ja.a(((nk) this).field_N, false);
                          var7 = 0;
                          var8 = 0;
                          L6: while (true) {
                            if (var4 <= var8) {
                              if (-1 != var6) {
                                var10[var4] = var6;
                                break L4;
                              } else {
                                break L4;
                              }
                            } else {
                              L7: {
                                if (-1 == var6) {
                                  break L7;
                                } else {
                                  if (var5[var8] > var6) {
                                    var10[var7] = var6;
                                    var6 = -1;
                                    var7++;
                                    break L7;
                                  } else {
                                    break L7;
                                  }
                                }
                              }
                              var10[var7] = var5[var8];
                              var7++;
                              var8++;
                              continue L6;
                            }
                          }
                        } else {
                          if (param0[var5_int] == ja.a(((nk) this).field_N, false)) {
                            stackOut_19_0 = (int[]) param0;
                            stackIn_20_0 = stackOut_19_0;
                            return stackIn_20_0;
                          } else {
                            var5_int++;
                            continue L5;
                          }
                        }
                      }
                    }
                  }
                }
                stackOut_32_0 = (int[]) param0;
                stackIn_33_0 = stackOut_32_0;
                break L0;
              } else {
                L8: {
                  if (null != ((nk) this).field_I[var4].field_d) {
                    var3_int = 0;
                    param0 = ((nk) this).field_I[var4].field_d.a(param0, 6793);
                    break L8;
                  } else {
                    break L8;
                  }
                }
                var4++;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L9: {
            var3 = decompiledCaughtException;
            stackOut_34_0 = (RuntimeException) var3;
            stackOut_34_1 = new StringBuilder().append("nk.EA(");
            stackIn_36_0 = stackOut_34_0;
            stackIn_36_1 = stackOut_34_1;
            stackIn_35_0 = stackOut_34_0;
            stackIn_35_1 = stackOut_34_1;
            if (param0 == null) {
              stackOut_36_0 = (RuntimeException) (Object) stackIn_36_0;
              stackOut_36_1 = (StringBuilder) (Object) stackIn_36_1;
              stackOut_36_2 = "null";
              stackIn_37_0 = stackOut_36_0;
              stackIn_37_1 = stackOut_36_1;
              stackIn_37_2 = stackOut_36_2;
              break L9;
            } else {
              stackOut_35_0 = (RuntimeException) (Object) stackIn_35_0;
              stackOut_35_1 = (StringBuilder) (Object) stackIn_35_1;
              stackOut_35_2 = "{...}";
              stackIn_37_0 = stackOut_35_0;
              stackIn_37_1 = stackOut_35_1;
              stackIn_37_2 = stackOut_35_2;
              break L9;
            }
          }
          throw ci.a((Throwable) (Object) stackIn_37_0, stackIn_37_2 + 44 + param1 + 41);
        }
        return stackIn_33_0;
    }

    final nk a(int param0, byte param1) {
        int var3 = 0;
        nk var4 = null;
        int var5 = 0;
        L0: {
          var5 = SteelSentinels.field_G;
          if (param1 <= -29) {
            break L0;
          } else {
            int discarded$2 = ((nk) this).g(-116);
            break L0;
          }
        }
        var3 = 0;
        L1: while (true) {
          if (var3 < ((nk) this).field_I.length) {
            if (((nk) this).field_N != param0) {
              if (((nk) this).field_I[var3].field_d != null) {
                var4 = ((nk) this).field_I[var3].field_d.a(param0, (byte) -73);
                if (var4 != null) {
                  return var4;
                } else {
                  var3++;
                  continue L1;
                }
              } else {
                var3++;
                continue L1;
              }
            } else {
              return (nk) this;
            }
          } else {
            return null;
          }
        }
    }

    final static void a(byte param0, gi param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_2_0 = null;
        StringBuilder stackOut_2_1 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        String stackOut_3_2 = null;
        try {
          L0: {
            um.field_W = param1.c((byte) -60) << 5;
            var2_int = param1.f((byte) -93);
            um.field_W = um.field_W + (var2_int >> 3);
            pm.field_S = var2_int << 18 & 1835008;
            pm.field_S = pm.field_S + (param1.c((byte) -60) << 2);
            var2_int = param1.f((byte) -59);
            pm.field_S = pm.field_S + (var2_int >> 6);
            uf.field_h = (63 & var2_int) << 15;
            uf.field_h = uf.field_h + (param1.f((byte) -65) << 7);
            var2_int = param1.f((byte) -77);
            lb.field_Tb = (1 & var2_int) << 16;
            uf.field_h = uf.field_h + (var2_int >> 1);
            lb.field_Tb = lb.field_Tb + param1.c((byte) -60);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2 = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) var2;
            stackOut_2_1 = new StringBuilder().append("nk.VA(").append(-80).append(44);
            stackIn_4_0 = stackOut_2_0;
            stackIn_4_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param1 == null) {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "null";
              stackIn_5_0 = stackOut_4_0;
              stackIn_5_1 = stackOut_4_1;
              stackIn_5_2 = stackOut_4_2;
              break L1;
            } else {
              stackOut_3_0 = (RuntimeException) (Object) stackIn_3_0;
              stackOut_3_1 = (StringBuilder) (Object) stackIn_3_1;
              stackOut_3_2 = "{...}";
              stackIn_5_0 = stackOut_3_0;
              stackIn_5_1 = stackOut_3_1;
              stackIn_5_2 = stackOut_3_2;
              break L1;
            }
          }
          throw ci.a((Throwable) (Object) stackIn_5_0, stackIn_5_2 + 41);
        }
    }

    final void a(int param0, int param1, int param2, int param3) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        var8 = SteelSentinels.field_G;
        var5 = ((nk) this).field_z + param0;
        ((nk) this).field_K = ((nk) this).field_z + param3 - ((nk) this).field_D;
        ((nk) this).field_y = var5;
        ((nk) this).field_W = param1 - (-((nk) this).field_D + -((nk) this).field_z);
        var6 = param2;
        L0: while (true) {
          if (var6 >= ((nk) this).field_I.length) {
            return;
          } else {
            if (((nk) this).field_I[var6].field_d != null) {
              var7 = var5 - -((nk) this).field_I[var6].field_n;
              ((nk) this).field_I[var6].field_d.field_S = (nk) this;
              ((nk) this).field_I[var6].field_d.a(var7, ((nk) this).field_W + (((nk) this).field_I[var6].field_i + ((nk) this).field_I[var6].field_n), param2, ((nk) this).field_I[var6].field_n + (-((nk) this).field_I[var6].field_i + ((nk) this).field_K));
              var6++;
              continue L0;
            } else {
              var6++;
              continue L0;
            }
          }
        }
    }

    final nk a(int param0, String param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        String var4 = null;
        nk var5 = null;
        int var6 = 0;
        Object stackIn_7_0 = null;
        nk stackIn_12_0 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_6_0 = null;
        nk stackOut_11_0 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        var6 = SteelSentinels.field_G;
        try {
          var3_int = param0;
          L0: while (true) {
            if (var3_int < ((nk) this).field_I.length) {
              L1: {
                var4 = ((nk) this).field_I[var3_int].field_v;
                if (var4 == null) {
                  break L1;
                } else {
                  if (!var4.equals((Object) (Object) param1)) {
                    break L1;
                  } else {
                    stackOut_6_0 = this;
                    stackIn_7_0 = stackOut_6_0;
                    return (nk) this;
                  }
                }
              }
              L2: {
                if (((nk) this).field_I[var3_int].field_d != null) {
                  var5 = ((nk) this).field_I[var3_int].field_d.a(param0, param1);
                  if (var5 == null) {
                    break L2;
                  } else {
                    stackOut_11_0 = (nk) var5;
                    stackIn_12_0 = stackOut_11_0;
                    return stackIn_12_0;
                  }
                } else {
                  break L2;
                }
              }
              var3_int++;
              continue L0;
            } else {
              return null;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackOut_15_0 = (RuntimeException) var3;
            stackOut_15_1 = new StringBuilder().append("nk.HA(").append(param0).append(44);
            stackIn_17_0 = stackOut_15_0;
            stackIn_17_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param1 == null) {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "null";
              stackIn_18_0 = stackOut_17_0;
              stackIn_18_1 = stackOut_17_1;
              stackIn_18_2 = stackOut_17_2;
              break L3;
            } else {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "{...}";
              stackIn_18_0 = stackOut_16_0;
              stackIn_18_1 = stackOut_16_1;
              stackIn_18_2 = stackOut_16_2;
              break L3;
            }
          }
          throw ci.a((Throwable) (Object) stackIn_18_0, stackIn_18_2 + 41);
        }
    }

    final static String a(int param0, na param1) {
        Object var2 = null;
        int var3 = 0;
        String var4 = null;
        int var5 = 0;
        String stackIn_32_0 = null;
        Object stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        Object stackIn_35_0 = null;
        StringBuilder stackIn_35_1 = null;
        Object stackIn_36_0 = null;
        StringBuilder stackIn_36_1 = null;
        String stackIn_36_2 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_31_0 = null;
        Object stackOut_33_0 = null;
        StringBuilder stackOut_33_1 = null;
        Object stackOut_35_0 = null;
        StringBuilder stackOut_35_1 = null;
        String stackOut_35_2 = null;
        Object stackOut_34_0 = null;
        StringBuilder stackOut_34_1 = null;
        String stackOut_34_2 = null;
        var5 = SteelSentinels.field_G;
        try {
          L0: {
            L1: {
              var2 = null;
              if (null != param1.field_d) {
                L2: {
                  var2 = (Object) (Object) param1.field_d;
                  if (param1.field_t == 1) {
                    var2 = (Object) (Object) ("<img=0>" + var2);
                    break L2;
                  } else {
                    break L2;
                  }
                }
                if (param1.field_t != 2) {
                  break L1;
                } else {
                  var2 = (Object) (Object) ("<img=1>" + var2);
                  break L1;
                }
              } else {
                break L1;
              }
            }
            L3: {
              var3 = -1;
              var4 = "";
              if (param1.field_k != 2) {
                L4: {
                  if (param1.field_k != 0) {
                    break L4;
                  } else {
                    if (!cd.field_g) {
                      break L4;
                    } else {
                      var4 = "[" + kh.field_p + "] ";
                      break L4;
                    }
                  }
                }
                L5: {
                  if (param1.field_k == 1) {
                    var4 = "[" + db.a(pd.field_ab, -102, new String[1]) + "] ";
                    break L5;
                  } else {
                    break L5;
                  }
                }
                L6: {
                  if (4 != param1.field_k) {
                    break L6;
                  } else {
                    if (qd.field_a != null) {
                      var4 = "[" + qd.field_a + "] ";
                      break L6;
                    } else {
                      break L6;
                    }
                  }
                }
                L7: {
                  if (param1.field_k == 3) {
                    var4 = "[#" + param1.field_s + "] ";
                    break L7;
                  } else {
                    break L7;
                  }
                }
                if (param1.field_g) {
                  break L3;
                } else {
                  var4 = var4 + var2 + ": ";
                  break L3;
                }
              } else {
                if (!param1.field_g) {
                  L8: {
                    if (0 != param1.field_w) {
                      break L8;
                    } else {
                      if (param1.field_n == 0) {
                        var4 = db.a(hh.field_d, -93, new String[1]);
                        break L3;
                      } else {
                        break L8;
                      }
                    }
                  }
                  var4 = db.a(ak.field_e, -99, new String[1]);
                  break L3;
                } else {
                  break L3;
                }
              }
            }
            stackOut_31_0 = (String) var4;
            stackIn_32_0 = stackOut_31_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L9: {
            var2 = (Object) (Object) decompiledCaughtException;
            stackOut_33_0 = var2;
            stackOut_33_1 = new StringBuilder().append("nk.CA(").append(-118).append(44);
            stackIn_35_0 = stackOut_33_0;
            stackIn_35_1 = stackOut_33_1;
            stackIn_34_0 = stackOut_33_0;
            stackIn_34_1 = stackOut_33_1;
            if (param1 == null) {
              stackOut_35_0 = stackIn_35_0;
              stackOut_35_1 = (StringBuilder) (Object) stackIn_35_1;
              stackOut_35_2 = "null";
              stackIn_36_0 = stackOut_35_0;
              stackIn_36_1 = stackOut_35_1;
              stackIn_36_2 = stackOut_35_2;
              break L9;
            } else {
              stackOut_34_0 = stackIn_34_0;
              stackOut_34_1 = (StringBuilder) (Object) stackIn_34_1;
              stackOut_34_2 = "{...}";
              stackIn_36_0 = stackOut_34_0;
              stackIn_36_1 = stackOut_34_1;
              stackIn_36_2 = stackOut_34_2;
              break L9;
            }
          }
          throw ci.a((Throwable) (Object) stackIn_36_0, stackIn_36_2 + 41);
        }
        return stackIn_32_0;
    }

    private final nk[] a(nk[] param0) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        nk[] var5 = null;
        int var6 = 0;
        int var7 = 0;
        nk[] var8 = null;
        nk[] stackIn_15_0 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        nk[] stackOut_14_0 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        var7 = SteelSentinels.field_G;
        try {
          L0: {
            L1: {
              var3_int = 0;
              if ((((nk) this).field_Q & 1008) == 0) {
                break L1;
              } else {
                var3_int = 1;
                break L1;
              }
            }
            var4 = 0;
            L2: while (true) {
              if (var4 >= ((nk) this).field_I.length) {
                L3: {
                  if (var3_int == 0) {
                    break L3;
                  } else {
                    if (((nk) this).field_N == -1) {
                      break L3;
                    } else {
                      var4 = param0.length;
                      var5 = param0;
                      var8 = new nk[1 + var4];
                      param0 = var8;
                      var6 = 0;
                      L4: while (true) {
                        if (var4 <= var6) {
                          param0[var4] = (nk) (Object) param0;
                          break L3;
                        } else {
                          var8[var6] = var5[var6];
                          var6++;
                          continue L4;
                        }
                      }
                    }
                  }
                }
                stackOut_14_0 = (nk[]) param0;
                stackIn_15_0 = stackOut_14_0;
                break L0;
              } else {
                L5: {
                  if (((nk) this).field_I[var4].field_d == null) {
                    break L5;
                  } else {
                    break L5;
                  }
                }
                var4++;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var3 = decompiledCaughtException;
            stackOut_16_0 = (RuntimeException) var3;
            stackOut_16_1 = new StringBuilder().append("nk.IA(");
            stackIn_18_0 = stackOut_16_0;
            stackIn_18_1 = stackOut_16_1;
            stackIn_17_0 = stackOut_16_0;
            stackIn_17_1 = stackOut_16_1;
            if (param0 == null) {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "null";
              stackIn_19_0 = stackOut_18_0;
              stackIn_19_1 = stackOut_18_1;
              stackIn_19_2 = stackOut_18_2;
              break L6;
            } else {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "{...}";
              stackIn_19_0 = stackOut_17_0;
              stackIn_19_1 = stackOut_17_1;
              stackIn_19_2 = stackOut_17_2;
              break L6;
            }
          }
          throw ci.a((Throwable) (Object) stackIn_19_0, stackIn_19_2 + 44 + 3 + 41);
        }
        return stackIn_15_0;
    }

    final void a(int param0, int param1, int param2) {
        int var4 = 0;
        nk var4_ref_nk = null;
        int var5 = 0;
        var5 = SteelSentinels.field_G;
        ((nk) this).field_y = (((nk) this).field_K + 8 * ((nk) this).field_y - -((nk) this).field_W) / 10;
        if (param1 <= -82) {
          L0: {
            L1: {
              if (ja.a(((nk) this).field_N, false) != param2) {
                break L1;
              } else {
                if (((nk) this).field_C > 0) {
                  break L1;
                } else {
                  L2: {
                    if (param0 < ((nk) this).field_K) {
                      break L2;
                    } else {
                      if (((nk) this).field_W < param0) {
                        break L2;
                      } else {
                        L3: {
                          qi.field_k = true;
                          if (sl.field_i == ic.field_P) {
                            sl.field_i = ((nk) this).field_K;
                            ic.field_P = ((nk) this).field_W;
                            break L3;
                          } else {
                            L4: {
                              if (ic.field_P >= ((nk) this).field_W) {
                                break L4;
                              } else {
                                ic.field_P = ((nk) this).field_W;
                                break L4;
                              }
                            }
                            if (((nk) this).field_K < sl.field_i) {
                              sl.field_i = ((nk) this).field_K;
                              break L3;
                            } else {
                              break L3;
                            }
                          }
                        }
                        ((nk) this).field_y = param0;
                        var4_ref_nk = ((nk) this).field_S;
                        L5: while (true) {
                          if (var4_ref_nk == null) {
                            break L0;
                          } else {
                            L6: {
                              if (0 < -((nk) this).field_K + ((nk) this).field_W) {
                                var4_ref_nk.field_y = var4_ref_nk.field_K + (-var4_ref_nk.field_K + var4_ref_nk.field_W) * (-((nk) this).field_K + param0) / (-((nk) this).field_K + ((nk) this).field_W);
                                break L6;
                              } else {
                                break L6;
                              }
                            }
                            var4_ref_nk = var4_ref_nk.field_S;
                            continue L5;
                          }
                        }
                      }
                    }
                  }
                  L7: {
                    if (qi.field_k) {
                      break L7;
                    } else {
                      if (sl.field_i == ic.field_P) {
                        ic.field_P = ((nk) this).field_W;
                        sl.field_i = ((nk) this).field_K;
                        break L7;
                      } else {
                        L8: {
                          if (sl.field_i > ((nk) this).field_K) {
                            sl.field_i = ((nk) this).field_K;
                            break L8;
                          } else {
                            break L8;
                          }
                        }
                        if (((nk) this).field_W <= ic.field_P) {
                          break L7;
                        } else {
                          ic.field_P = ((nk) this).field_W;
                          break L7;
                        }
                      }
                    }
                  }
                  if (((nk) this).field_S == null) {
                    break L0;
                  } else {
                    ((nk) this).field_y = ((nk) this).field_S.field_y - (((nk) this).field_S.field_K + ((nk) this).field_S.field_W) / 2 - -((((nk) this).field_W + ((nk) this).field_K) / 2);
                    break L0;
                  }
                }
              }
            }
            L9: {
              if (null == ((nk) this).field_S) {
                break L9;
              } else {
                ((nk) this).field_y = (((nk) this).field_W + ((nk) this).field_K) / 2 + (((nk) this).field_S.field_y - (((nk) this).field_S.field_K - -((nk) this).field_S.field_W) / 2);
                break L9;
              }
            }
            var4 = 0;
            L10: while (true) {
              if (var4 >= ((nk) this).field_I.length) {
                break L0;
              } else {
                if (null != ((nk) this).field_I[var4].field_d) {
                  ((nk) this).field_I[var4].field_d.a(param0, -90, param2);
                  var4++;
                  continue L10;
                } else {
                  var4++;
                  continue L10;
                }
              }
            }
          }
          return;
        } else {
          return;
        }
    }

    final static boolean f(byte param0) {
        int stackIn_6_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_5_0 = 0;
        if (param0 < -14) {
          L0: {
            L1: {
              if (ni.b(24)) {
                break L1;
              } else {
                if (rd.field_b <= 0) {
                  break L1;
                } else {
                  stackOut_4_0 = 1;
                  stackIn_6_0 = stackOut_4_0;
                  break L0;
                }
              }
            }
            stackOut_5_0 = 0;
            stackIn_6_0 = stackOut_5_0;
            break L0;
          }
          return stackIn_6_0 != 0;
        } else {
          return false;
        }
    }

    final qd a(int param0, int param1) {
        qd[] var3 = null;
        int var4 = 0;
        qd var5 = null;
        qd var6 = null;
        int var7 = 0;
        qd[] var8 = null;
        var7 = SteelSentinels.field_G;
        var8 = ((nk) this).field_I;
        var3 = var8;
        var4 = param0;
        L0: while (true) {
          if (var8.length > var4) {
            L1: {
              var5 = var8[var4];
              if (null == var5.field_d) {
                break L1;
              } else {
                if (param1 != var5.field_d.field_Q) {
                  var6 = var5.field_d.a(param0, param1);
                  if (var6 != null) {
                    return var6;
                  } else {
                    break L1;
                  }
                } else {
                  return var5;
                }
              }
            }
            if (var5.field_q != -1) {
              if ((var5.field_q & param1) != 0) {
                return var5;
              } else {
                var4++;
                continue L0;
              }
            } else {
              var4++;
              continue L0;
            }
          } else {
            return null;
          }
        }
    }

    private final void e(int param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        L0: {
          var4 = SteelSentinels.field_G;
          if (param0 == ja.a(((nk) this).field_N, false)) {
            L1: {
              if (0 < ((nk) this).field_C) {
                L2: {
                  if (gl.field_p == -1) {
                    break L2;
                  } else {
                    if (((nk) this).field_C < gl.field_p) {
                      break L2;
                    } else {
                      break L1;
                    }
                  }
                }
                gl.field_p = ((nk) this).field_C;
                break L1;
              } else {
                si.field_t = si.field_t + 1;
                break L1;
              }
            }
            ed.field_f = -17 + ((nk) this).field_N;
            break L0;
          } else {
            break L0;
          }
        }
        var3 = 0;
        L3: while (true) {
          if (((nk) this).field_I.length <= var3) {
            return;
          } else {
            if (((nk) this).field_I[var3].field_d != null) {
              ((nk) this).field_I[var3].field_d.e(param0, 5307);
              var3++;
              continue L3;
            } else {
              var3++;
              continue L3;
            }
          }
        }
    }

    final static int b(int param0, int param1, int param2) {
        if (param1 == 1) {
            if (ef.b(-15020, param2)) {
                return 29;
            }
        }
        return gi.field_s[param1];
    }

    final qd[] a(qd[] param0, int param1, int param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        qd[] var5 = null;
        int var6 = 0;
        int var7 = 0;
        qd[] stackIn_16_0 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        qd[] stackOut_15_0 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        var7 = SteelSentinels.field_G;
        try {
          L0: {
            var4_int = 0;
            L1: while (true) {
              if (var4_int >= ((nk) this).field_I.length) {
                L2: {
                  if (param1 == -21636) {
                    break L2;
                  } else {
                    ((nk) this).field_R = null;
                    break L2;
                  }
                }
                stackOut_15_0 = (qd[]) param0;
                stackIn_16_0 = stackOut_15_0;
                break L0;
              } else {
                L3: {
                  if (-1 <= (((nk) this).field_I[var4_int].field_q & param2)) {
                    break L3;
                  } else {
                    if (0 == ((nk) this).field_I[var4_int].field_q) {
                      break L3;
                    } else {
                      var5 = new qd[param0.length + 1];
                      var6 = 0;
                      L4: while (true) {
                        if (var6 >= param0.length) {
                          var5[param0.length] = ((nk) this).field_I[var4_int];
                          param0 = var5;
                          break L3;
                        } else {
                          var5[var6] = param0[var6];
                          var6++;
                          continue L4;
                        }
                      }
                    }
                  }
                }
                L5: {
                  if (null != ((nk) this).field_I[var4_int].field_d) {
                    param0 = ((nk) this).field_I[var4_int].field_d.a(param0, -21636, param2);
                    break L5;
                  } else {
                    break L5;
                  }
                }
                var4_int++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var4 = decompiledCaughtException;
            stackOut_17_0 = (RuntimeException) var4;
            stackOut_17_1 = new StringBuilder().append("nk.JA(");
            stackIn_19_0 = stackOut_17_0;
            stackIn_19_1 = stackOut_17_1;
            stackIn_18_0 = stackOut_17_0;
            stackIn_18_1 = stackOut_17_1;
            if (param0 == null) {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "null";
              stackIn_20_0 = stackOut_19_0;
              stackIn_20_1 = stackOut_19_1;
              stackIn_20_2 = stackOut_19_2;
              break L6;
            } else {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "{...}";
              stackIn_20_0 = stackOut_18_0;
              stackIn_20_1 = stackOut_18_1;
              stackIn_20_2 = stackOut_18_2;
              break L6;
            }
          }
          throw ci.a((Throwable) (Object) stackIn_20_0, stackIn_20_2 + 44 + param1 + 44 + param2 + 41);
        }
        return stackIn_16_0;
    }

    final void a(int param0, int param1, int[] param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        var5 = SteelSentinels.field_G;
        try {
          L0: {
            L1: {
              if (param0 != ja.a(((nk) this).field_N, false)) {
                break L1;
              } else {
                if (((nk) this).field_C > 0) {
                  break L1;
                } else {
                  var4_int = ((nk) this).field_K;
                  L2: while (true) {
                    if (((nk) this).field_W <= var4_int) {
                      break L1;
                    } else {
                      L3: {
                        if (var4_int <= 0) {
                          break L3;
                        } else {
                          if (var4_int < 32768) {
                            param2[var4_int >> 8] = param2[var4_int >> 8] + 1;
                            break L3;
                          } else {
                            break L3;
                          }
                        }
                      }
                      var4_int += 256;
                      continue L2;
                    }
                  }
                }
              }
            }
            if (param1 == -1) {
              var6 = 0;
              var4_int = var6;
              L4: while (true) {
                if (((nk) this).field_I.length <= var6) {
                  break L0;
                } else {
                  L5: {
                    if (null == ((nk) this).field_I[var6].field_d) {
                      break L5;
                    } else {
                      ((nk) this).field_I[var6].field_d.a(param0, -1, param2);
                      break L5;
                    }
                  }
                  var6++;
                  continue L4;
                }
              }
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var4 = decompiledCaughtException;
            stackOut_18_0 = (RuntimeException) var4;
            stackOut_18_1 = new StringBuilder().append("nk.N(").append(param0).append(44).append(param1).append(44);
            stackIn_20_0 = stackOut_18_0;
            stackIn_20_1 = stackOut_18_1;
            stackIn_19_0 = stackOut_18_0;
            stackIn_19_1 = stackOut_18_1;
            if (param2 == null) {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "null";
              stackIn_21_0 = stackOut_20_0;
              stackIn_21_1 = stackOut_20_1;
              stackIn_21_2 = stackOut_20_2;
              break L6;
            } else {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "{...}";
              stackIn_21_0 = stackOut_19_0;
              stackIn_21_1 = stackOut_19_1;
              stackIn_21_2 = stackOut_19_2;
              break L6;
            }
          }
          throw ci.a((Throwable) (Object) stackIn_21_0, stackIn_21_2 + 41);
        }
    }

    nk(nk param0) {
        try {
            this.a(-353384856, true, param0);
        } catch (RuntimeException runtimeException) {
            throw ci.a((Throwable) (Object) runtimeException, "nk.<init>(" + (param0 != null ? "{...}" : "null") + 41);
        }
    }

    nk(nk param0, boolean param1) {
        try {
            this.a(-353384856, param1, param0);
        } catch (RuntimeException runtimeException) {
            throw ci.a((Throwable) (Object) runtimeException, "nk.<init>(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 41);
        }
    }

    nk(gk param0, int param1, int param2, int param3, int param4, int param5, qd[] param6) {
        try {
            ((nk) this).field_W = 0;
            ((nk) this).field_Q = param1;
            ((nk) this).field_D = param5;
            ((nk) this).field_I = param6;
            ((nk) this).field_K = 0;
            ((nk) this).field_G = param2;
            ((nk) this).field_E = param3;
            ((nk) this).field_L = true;
            ((nk) this).field_N = -1;
            ((nk) this).field_z = param4;
            ((nk) this).field_R = param0;
            ((nk) this).field_y = 0;
        } catch (RuntimeException runtimeException) {
            throw ci.a((Throwable) (Object) runtimeException, "nk.<init>(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 44 + param2 + 44 + param3 + 44 + param4 + 44 + param5 + 44 + (param6 != null ? "{...}" : "null") + 41);
        }
    }

    nk(gk param0, int param1, int param2, qd[] param3) {
        try {
            ((nk) this).field_z = 0;
            ((nk) this).field_K = 0;
            ((nk) this).field_I = param3;
            ((nk) this).field_E = param2;
            ((nk) this).field_Q = -1;
            ((nk) this).field_D = 0;
            ((nk) this).field_y = 0;
            ((nk) this).field_R = param0;
            ((nk) this).field_L = true;
            ((nk) this).field_N = -1;
            ((nk) this).field_W = 0;
            ((nk) this).field_G = param1;
        } catch (RuntimeException runtimeException) {
            throw ci.a((Throwable) (Object) runtimeException, "nk.<init>(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 44 + param2 + 44 + (param3 != null ? "{...}" : "null") + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        int var0 = 0;
        long var4 = 0L;
        long var6 = 0L;
        int var3 = 0;
        int var2 = 0;
        int var1 = 0;
        field_F = new dj(3);
        field_M = new int[98304];
        for (var0 = 92682; var0 >= 46341; var0--) {
            var4 = (long)(-1 + (var0 << 1));
            var6 = (long)(1 + (var0 << 1));
            var3 = (int)(-32768L + (var6 * var6 >> 18));
            var2 = (int)(-32768L + (var4 * var4 >> 18));
            if (field_M.length <= var3) {
                var3 = field_M.length + -1;
            }
            for (var1 = 0 <= var2 ? var2 : 0; var1 <= var3; var1++) {
                field_M[var1] = var0;
            }
        }
        field_O = new fm(9, 0, 4, 1);
        field_P = "Accept <%0> into this game";
        field_J = 0;
        field_X = new String[]{"Waiting for text", "Warte auf Text", "En attente du texte", "Aguardando textos", "Op tekst wachten", "Esperando a texto"};
    }
}
