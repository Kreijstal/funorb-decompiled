/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.lang.String;

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
        qb stackIn_4_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        qb stackOut_3_0 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        try {
          L0: {
            L1: {
              var10 = ol.d((byte) -105);
              var10.field_O = param7;
              var10.field_B = param4;
              if (param3 > 86) {
                break L1;
              } else {
                qb discarded$2 = nk.a(91, 120, (ee) null, -2, -98, true, 88, 125, 5, -15);
                break L1;
              }
            }
            var10.field_P = param9;
            var10.field_G = param5;
            var10.field_M = param0;
            var10.field_D = param6;
            var10.field_F = param8;
            var10.field_I = 0;
            var10.field_A = param1;
            var10.field_z = param2;
            stackOut_3_0 = (qb) var10;
            stackIn_4_0 = stackOut_3_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var10_ref = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var10_ref;
            stackOut_5_1 = new StringBuilder().append("nk.K(").append(param0).append(',').append(param1).append(',');
            stackIn_8_0 = stackOut_5_0;
            stackIn_8_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param2 == null) {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L2;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_9_0 = stackOut_6_0;
              stackIn_9_1 = stackOut_6_1;
              stackIn_9_2 = stackOut_6_2;
              break L2;
            }
          }
          throw ci.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ',' + param8 + ',' + param9 + ')');
        }
        return stackIn_4_0;
    }

    final void a(int param0, boolean param1, int param2, int param3, byte param4, int param5) {
        RuntimeException var7 = null;
        int var7_int = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        nk stackIn_7_0 = null;
        nk stackIn_18_0 = null;
        RuntimeException decompiledCaughtException = null;
        nk stackOut_6_0 = null;
        Object stackOut_17_0 = null;
        var14 = SteelSentinels.field_G;
        try {
          L0: {
            L1: {
              var7_int = ((nk) this).field_z + param5;
              if (param4 == 49) {
                break L1;
              } else {
                nk[] discarded$1 = ((nk) this).k(14);
                break L1;
              }
            }
            var8 = 0;
            L2: while (true) {
              L3: {
                L4: {
                  if (((nk) this).field_I.length <= var8) {
                    break L4;
                  } else {
                    ((nk) this).field_I[var8].field_m = -((nk) this).field_I[var8].field_i + ((nk) this).field_I[var8].field_n + (var7_int + -param0) + -((nk) this).field_D;
                    ((nk) this).field_I[var8].field_j = ((nk) this).field_D + (((nk) this).field_I[var8].field_i + var7_int) + (((nk) this).field_I[var8].field_n - -param0);
                    stackOut_6_0 = ((nk) this).field_I[var8].field_d;
                    stackIn_18_0 = stackOut_6_0;
                    stackIn_7_0 = stackOut_6_0;
                    if (var14 != 0) {
                      break L3;
                    } else {
                      L5: {
                        if (stackIn_7_0 == null) {
                          break L5;
                        } else {
                          if (((nk) this).field_I[var8].field_u) {
                            var9 = 16 * jh.a(8192 * -var7_int / 65536, 4096) / 65536;
                            var10 = 16 * kg.a(8192 * -var7_int / 65536, (byte) -74) / 65536;
                            var11 = (hj.field_w * ((((nk) this).field_I[var8].field_r + -((nk) this).field_E) * var9 + (((nk) this).field_I[var8].field_s + -((nk) this).field_G) * var10) >> -617691376) + param2;
                            var12 = param3 - -((-(var9 * (((nk) this).field_I[var8].field_s - ((nk) this).field_G)) + var10 * (-((nk) this).field_E + ((nk) this).field_I[var8].field_r)) * hj.field_w >> -1906209104);
                            var13 = var7_int - -((nk) this).field_I[var8].field_n;
                            this.a((byte) -101, param1, var13, var8, var11, param0, var12);
                            break L5;
                          } else {
                            break L5;
                          }
                        }
                      }
                      var8++;
                      if (var14 == 0) {
                        continue L2;
                      } else {
                        break L4;
                      }
                    }
                  }
                }
                stackOut_17_0 = this;
                stackIn_18_0 = (nk) (Object) stackOut_17_0;
                break L3;
              }
              L6: {
                if (this.field_R == null) {
                  break L6;
                } else {
                  ((nk) this).field_R.a(((nk) this).field_G << -44748892, ((nk) this).field_E << -138785084, param2 << 210359140, param3 << -651945500, -var7_int, hj.field_w);
                  break L6;
                }
              }
              L7: {
                if (param1) {
                  ((nk) this).field_K = var7_int + -param0 + -((nk) this).field_D;
                  ((nk) this).field_W = ((nk) this).field_D + var7_int - -param0;
                  break L7;
                } else {
                  break L7;
                }
              }
              L8: {
                var8 = 8 * hj.field_w / 4096;
                if (~(param2 + -var8) > ~nj.field_V) {
                  nj.field_V = param2 - var8;
                  break L8;
                } else {
                  break L8;
                }
              }
              L9: {
                if (param3 + -var8 >= ti.field_y) {
                  break L9;
                } else {
                  ti.field_y = -var8 + param3;
                  break L9;
                }
              }
              L10: {
                if (lh.field_t < var8 + param3) {
                  lh.field_t = var8 + param3;
                  break L10;
                } else {
                  break L10;
                }
              }
              L11: {
                if (~en.field_d > ~(var8 + param2)) {
                  en.field_d = var8 + param2;
                  break L11;
                } else {
                  break L11;
                }
              }
              var9 = 0;
              L12: while (true) {
                L13: {
                  L14: {
                    if (~var9 <= ~((nk) this).field_I.length) {
                      break L14;
                    } else {
                      if (var14 != 0) {
                        break L13;
                      } else {
                        L15: {
                          L16: {
                            if (((nk) this).field_I[var9].field_q != -1) {
                              break L16;
                            } else {
                              if (null != ((nk) this).field_I[var9].field_d) {
                                break L16;
                              } else {
                                break L15;
                              }
                            }
                          }
                          L17: {
                            L18: {
                              var10 = jh.a(8192 * -var7_int / 65536, param4 + 4047) * 16 / 65536;
                              var11 = 16 * kg.a(-var7_int * 8192 / 65536, (byte) -82) / 65536;
                              ((nk) this).field_I[var9].field_k = (((-((nk) this).field_G + ((nk) this).field_I[var9].field_s) * var11 - -(var10 * (-((nk) this).field_E + ((nk) this).field_I[var9].field_r))) * hj.field_w >> 318264656) + param2;
                              ((nk) this).field_I[var9].field_l = ((var11 * (((nk) this).field_I[var9].field_r + -((nk) this).field_E) + -(var10 * (-((nk) this).field_G + ((nk) this).field_I[var9].field_s))) * hj.field_w >> 1481685264) + param3;
                              ((nk) this).field_I[var9].field_f = var7_int + ((nk) this).field_I[var9].field_n;
                              if (((nk) this).field_I[var9].field_d == null) {
                                break L18;
                              } else {
                                if (!((nk) this).field_I[var9].field_u) {
                                  break L17;
                                } else {
                                  break L18;
                                }
                              }
                            }
                            if (((nk) this).field_I[var9].field_d != null) {
                              break L15;
                            } else {
                              if (((nk) this).field_I[var9].field_q == -1) {
                                break L15;
                              } else {
                                if (!param1) {
                                  break L15;
                                } else {
                                  if (1024 == ((nk) this).field_I[var9].field_q) {
                                    break L15;
                                  } else {
                                    L19: {
                                      if (~nj.field_V < ~(-var8 + ((nk) this).field_I[var9].field_k)) {
                                        nj.field_V = ((nk) this).field_I[var9].field_k + -var8;
                                        break L19;
                                      } else {
                                        break L19;
                                      }
                                    }
                                    L20: {
                                      if (~(((nk) this).field_I[var9].field_k - -var8) < ~en.field_d) {
                                        en.field_d = ((nk) this).field_I[var9].field_k + var8;
                                        break L20;
                                      } else {
                                        break L20;
                                      }
                                    }
                                    L21: {
                                      if (~(-var8 + ((nk) this).field_I[var9].field_l) <= ~ti.field_y) {
                                        break L21;
                                      } else {
                                        ti.field_y = ((nk) this).field_I[var9].field_l + -var8;
                                        break L21;
                                      }
                                    }
                                    L22: {
                                      if (lh.field_t >= ((nk) this).field_I[var9].field_l - -var8) {
                                        break L22;
                                      } else {
                                        lh.field_t = ((nk) this).field_I[var9].field_l + var8;
                                        break L22;
                                      }
                                    }
                                    var10 = jh.a(((nk) this).field_I[var9].field_f * 8192 / 65536, 4096) * 16 / 65536;
                                    var11 = kg.a(((nk) this).field_I[var9].field_f * 8192 / 65536, (byte) -68) * 16 / 65536;
                                    if (var14 == 0) {
                                      break L15;
                                    } else {
                                      break L17;
                                    }
                                  }
                                }
                              }
                            }
                          }
                          this.a((byte) -69, param1, ((nk) this).field_I[var9].field_f, var9, ((nk) this).field_I[var9].field_k, param0, ((nk) this).field_I[var9].field_l);
                          break L15;
                        }
                        var9++;
                        if (var14 == 0) {
                          continue L12;
                        } else {
                          break L14;
                        }
                      }
                    }
                  }
                  break L13;
                }
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          throw ci.a((Throwable) (Object) var7, "nk.M(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    final nk[] a(int param0, mb param1, nk[] param2, int param3, int param4) {
        RuntimeException var6 = null;
        int var6_int = 0;
        nk[] var7 = null;
        int var8 = 0;
        int var9 = 0;
        int stackIn_31_0 = 0;
        nk[] stackIn_54_0 = null;
        RuntimeException stackIn_56_0 = null;
        StringBuilder stackIn_56_1 = null;
        RuntimeException stackIn_58_0 = null;
        StringBuilder stackIn_58_1 = null;
        RuntimeException stackIn_59_0 = null;
        StringBuilder stackIn_59_1 = null;
        String stackIn_59_2 = null;
        RuntimeException stackIn_60_0 = null;
        StringBuilder stackIn_60_1 = null;
        RuntimeException stackIn_62_0 = null;
        StringBuilder stackIn_62_1 = null;
        RuntimeException stackIn_63_0 = null;
        StringBuilder stackIn_63_1 = null;
        String stackIn_63_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_28_0 = 0;
        int stackOut_30_0 = 0;
        nk[] stackOut_53_0 = null;
        RuntimeException stackOut_55_0 = null;
        StringBuilder stackOut_55_1 = null;
        RuntimeException stackOut_58_0 = null;
        StringBuilder stackOut_58_1 = null;
        String stackOut_58_2 = null;
        RuntimeException stackOut_56_0 = null;
        StringBuilder stackOut_56_1 = null;
        String stackOut_56_2 = null;
        RuntimeException stackOut_59_0 = null;
        StringBuilder stackOut_59_1 = null;
        RuntimeException stackOut_62_0 = null;
        StringBuilder stackOut_62_1 = null;
        String stackOut_62_2 = null;
        RuntimeException stackOut_60_0 = null;
        StringBuilder stackOut_60_1 = null;
        String stackOut_60_2 = null;
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
                L4: {
                  if (param4 != ja.a(((nk) this).field_N, false)) {
                    break L4;
                  } else {
                    if (((nk) this).field_Q <= 0) {
                      break L4;
                    } else {
                      if (((nk) this).field_C <= 0) {
                        break L3;
                      } else {
                        break L4;
                      }
                    }
                  }
                }
                var6_int = 0;
                L5: while (true) {
                  L6: {
                    if (~((nk) this).field_I.length >= ~var6_int) {
                      break L6;
                    } else {
                      if (var9 != 0) {
                        break L2;
                      } else {
                        L7: {
                          if (((nk) this).field_I[var6_int].field_d != null) {
                            param2 = ((nk) this).field_I[var6_int].field_d.a(param0, param1, param2, param3, param4);
                            break L7;
                          } else {
                            break L7;
                          }
                        }
                        var6_int++;
                        if (var9 == 0) {
                          continue L5;
                        } else {
                          break L6;
                        }
                      }
                    }
                  }
                  if (var9 == 0) {
                    break L2;
                  } else {
                    break L3;
                  }
                }
              }
              L8: {
                L9: {
                  if (((nk) this).field_K > param3) {
                    break L9;
                  } else {
                    if (~param3 < ~((nk) this).field_W) {
                      break L9;
                    } else {
                      stackOut_28_0 = 1;
                      stackIn_31_0 = stackOut_28_0;
                      break L8;
                    }
                  }
                }
                stackOut_30_0 = 0;
                stackIn_31_0 = stackOut_30_0;
                break L8;
              }
              L10: {
                var6_int = stackIn_31_0;
                if (var6_int == 0) {
                  break L10;
                } else {
                  if (!param1.field_Lb) {
                    break L10;
                  } else {
                    if (!bi.b(105, ((nk) this).field_N)) {
                      break L10;
                    } else {
                      if (param1.i(31, param0 + -27)) {
                        break L10;
                      } else {
                        var6_int = 0;
                        break L10;
                      }
                    }
                  }
                }
              }
              if (var6_int != 0) {
                var7 = new nk[param2.length + 1];
                var8 = 0;
                L11: while (true) {
                  L12: {
                    L13: {
                      if (param2.length <= var8) {
                        break L13;
                      } else {
                        var7[var8] = param2[var8];
                        var8++;
                        if (var9 != 0) {
                          break L12;
                        } else {
                          if (var9 == 0) {
                            continue L11;
                          } else {
                            break L13;
                          }
                        }
                      }
                    }
                    var7[param2.length] = (nk) this;
                    break L12;
                  }
                  param2 = var7;
                  break L2;
                }
              } else {
                break L2;
              }
            }
            stackOut_53_0 = (nk[]) param2;
            stackIn_54_0 = stackOut_53_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L14: {
            var6 = decompiledCaughtException;
            stackOut_55_0 = (RuntimeException) var6;
            stackOut_55_1 = new StringBuilder().append("nk.I(").append(param0).append(',');
            stackIn_58_0 = stackOut_55_0;
            stackIn_58_1 = stackOut_55_1;
            stackIn_56_0 = stackOut_55_0;
            stackIn_56_1 = stackOut_55_1;
            if (param1 == null) {
              stackOut_58_0 = (RuntimeException) (Object) stackIn_58_0;
              stackOut_58_1 = (StringBuilder) (Object) stackIn_58_1;
              stackOut_58_2 = "null";
              stackIn_59_0 = stackOut_58_0;
              stackIn_59_1 = stackOut_58_1;
              stackIn_59_2 = stackOut_58_2;
              break L14;
            } else {
              stackOut_56_0 = (RuntimeException) (Object) stackIn_56_0;
              stackOut_56_1 = (StringBuilder) (Object) stackIn_56_1;
              stackOut_56_2 = "{...}";
              stackIn_59_0 = stackOut_56_0;
              stackIn_59_1 = stackOut_56_1;
              stackIn_59_2 = stackOut_56_2;
              break L14;
            }
          }
          L15: {
            stackOut_59_0 = (RuntimeException) (Object) stackIn_59_0;
            stackOut_59_1 = ((StringBuilder) (Object) stackIn_59_1).append(stackIn_59_2).append(',');
            stackIn_62_0 = stackOut_59_0;
            stackIn_62_1 = stackOut_59_1;
            stackIn_60_0 = stackOut_59_0;
            stackIn_60_1 = stackOut_59_1;
            if (param2 == null) {
              stackOut_62_0 = (RuntimeException) (Object) stackIn_62_0;
              stackOut_62_1 = (StringBuilder) (Object) stackIn_62_1;
              stackOut_62_2 = "null";
              stackIn_63_0 = stackOut_62_0;
              stackIn_63_1 = stackOut_62_1;
              stackIn_63_2 = stackOut_62_2;
              break L15;
            } else {
              stackOut_60_0 = (RuntimeException) (Object) stackIn_60_0;
              stackOut_60_1 = (StringBuilder) (Object) stackIn_60_1;
              stackOut_60_2 = "{...}";
              stackIn_63_0 = stackOut_60_0;
              stackIn_63_1 = stackOut_60_1;
              stackIn_63_2 = stackOut_60_2;
              break L15;
            }
          }
          throw ci.a((Throwable) (Object) stackIn_63_0, stackIn_63_2 + ',' + param3 + ',' + param4 + ')');
        }
        return stackIn_54_0;
    }

    final int e(byte param0) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int stackIn_8_0 = 0;
        nk stackIn_11_0 = null;
        nk stackIn_19_0 = null;
        int stackIn_21_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_5_0 = 0;
        int stackOut_7_0 = 0;
        nk stackOut_10_0 = null;
        Object stackOut_17_0 = null;
        int stackOut_20_0 = 0;
        var4 = SteelSentinels.field_G;
        try {
          L0: {
            L1: {
              L2: {
                if (((nk) this).field_N < 0) {
                  break L2;
                } else {
                  if (((nk) this).field_N >= tc.field_B.length) {
                    break L2;
                  } else {
                    stackOut_5_0 = tc.field_B[((nk) this).field_N];
                    stackIn_8_0 = stackOut_5_0;
                    break L1;
                  }
                }
              }
              stackOut_7_0 = 0;
              stackIn_8_0 = stackOut_7_0;
              break L1;
            }
            var2_int = stackIn_8_0;
            var3 = 0;
            L3: while (true) {
              L4: {
                L5: {
                  L6: {
                    if (var3 >= ((nk) this).field_I.length) {
                      break L6;
                    } else {
                      stackOut_10_0 = ((nk) this).field_I[var3].field_d;
                      stackIn_19_0 = stackOut_10_0;
                      stackIn_11_0 = stackOut_10_0;
                      if (var4 != 0) {
                        break L5;
                      } else {
                        L7: {
                          if (stackIn_11_0 == null) {
                            break L7;
                          } else {
                            var2_int = var2_int + ((nk) this).field_I[var3].field_d.e((byte) -63);
                            break L7;
                          }
                        }
                        var3++;
                        if (var4 == 0) {
                          continue L3;
                        } else {
                          break L6;
                        }
                      }
                    }
                  }
                  if (param0 < -50) {
                    break L4;
                  } else {
                    stackOut_17_0 = this;
                    stackIn_19_0 = (nk) (Object) stackOut_17_0;
                    break L5;
                  }
                }
                stackIn_19_0.field_U = null;
                break L4;
              }
              stackOut_20_0 = var2_int;
              stackIn_21_0 = stackOut_20_0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ci.a((Throwable) (Object) var2, "nk.T(" + param0 + ')');
        }
        return stackIn_21_0;
    }

    final int a(byte param0, qd param1) {
        qd[] var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        qd var5 = null;
        nk var6 = null;
        int var7 = 0;
        int var8 = 0;
        int stackIn_19_0 = 0;
        int stackIn_22_0 = 0;
        int stackIn_28_0 = 0;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        String stackIn_33_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_18_0 = 0;
        int stackOut_21_0 = 0;
        int stackOut_27_0 = 0;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        RuntimeException stackOut_32_0 = null;
        StringBuilder stackOut_32_1 = null;
        String stackOut_32_2 = null;
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        String stackOut_30_2 = null;
        var8 = SteelSentinels.field_G;
        try {
          L0: {
            var3 = ((nk) this).field_I;
            var4 = 0;
            L1: while (true) {
              L2: {
                L3: {
                  if (~var4 <= ~var3.length) {
                    break L3;
                  } else {
                    var5 = var3[var4];
                    var6 = var5.field_d;
                    if (var8 != 0) {
                      break L2;
                    } else {
                      L4: {
                        if (null != var6) {
                          L5: {
                            if (var5.field_s != param1.field_s) {
                              break L5;
                            } else {
                              if (var5.field_r != param1.field_r) {
                                break L5;
                              } else {
                                if (var5.field_q == param1.field_q) {
                                  stackOut_18_0 = var6.field_N;
                                  stackIn_19_0 = stackOut_18_0;
                                  return stackIn_19_0;
                                } else {
                                  break L5;
                                }
                              }
                            }
                          }
                          var7 = var6.a((byte) 2, param1);
                          if (var7 < 0) {
                            break L4;
                          } else {
                            stackOut_21_0 = var7;
                            stackIn_22_0 = stackOut_21_0;
                            return stackIn_22_0;
                          }
                        } else {
                          break L4;
                        }
                      }
                      var4++;
                      if (var8 == 0) {
                        continue L1;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
                if (param0 == 2) {
                  break L2;
                } else {
                  field_J = 118;
                  break L2;
                }
              }
              stackOut_27_0 = -1;
              stackIn_28_0 = stackOut_27_0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var3_ref = decompiledCaughtException;
            stackOut_29_0 = (RuntimeException) var3_ref;
            stackOut_29_1 = new StringBuilder().append("nk.P(").append(param0).append(',');
            stackIn_32_0 = stackOut_29_0;
            stackIn_32_1 = stackOut_29_1;
            stackIn_30_0 = stackOut_29_0;
            stackIn_30_1 = stackOut_29_1;
            if (param1 == null) {
              stackOut_32_0 = (RuntimeException) (Object) stackIn_32_0;
              stackOut_32_1 = (StringBuilder) (Object) stackIn_32_1;
              stackOut_32_2 = "null";
              stackIn_33_0 = stackOut_32_0;
              stackIn_33_1 = stackOut_32_1;
              stackIn_33_2 = stackOut_32_2;
              break L6;
            } else {
              stackOut_30_0 = (RuntimeException) (Object) stackIn_30_0;
              stackOut_30_1 = (StringBuilder) (Object) stackIn_30_1;
              stackOut_30_2 = "{...}";
              stackIn_33_0 = stackOut_30_0;
              stackIn_33_1 = stackOut_30_1;
              stackIn_33_2 = stackOut_30_2;
              break L6;
            }
          }
          throw ci.a((Throwable) (Object) stackIn_33_0, stackIn_33_2 + ')');
        }
        return stackIn_28_0;
    }

    final int g(int param0) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int stackIn_7_0 = 0;
        int stackIn_13_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_6_0 = 0;
        int stackOut_12_0 = 0;
        var4 = SteelSentinels.field_G;
        try {
          L0: {
            L1: {
              var2_int = 0;
              if (param0 == 8192) {
                break L1;
              } else {
                nk discarded$2 = ((nk) this).a(-87, (String) null);
                break L1;
              }
            }
            var3 = 0;
            L2: while (true) {
              L3: {
                L4: {
                  if (((nk) this).field_I.length <= var3) {
                    break L4;
                  } else {
                    stackOut_6_0 = var2_int + ((nk) this).field_I[var3].field_e;
                    stackIn_13_0 = stackOut_6_0;
                    stackIn_7_0 = stackOut_6_0;
                    if (var4 != 0) {
                      break L3;
                    } else {
                      L5: {
                        var2_int = stackIn_7_0;
                        if (((nk) this).field_I[var3].field_d != null) {
                          var2_int = var2_int + ((nk) this).field_I[var3].field_d.g(param0);
                          break L5;
                        } else {
                          break L5;
                        }
                      }
                      var3++;
                      if (var4 == 0) {
                        continue L2;
                      } else {
                        break L4;
                      }
                    }
                  }
                }
                stackOut_12_0 = var2_int;
                stackIn_13_0 = stackOut_12_0;
                break L3;
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ci.a((Throwable) (Object) var2, "nk.UA(" + param0 + ')');
        }
        return stackIn_13_0;
    }

    final int j(int param0) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_7_0 = 0;
        var4 = SteelSentinels.field_G;
        try {
          L0: {
            var2_int = 0;
            var3 = param0;
            L1: while (true) {
              L2: {
                L3: {
                  if (~((nk) this).field_I.length >= ~var3) {
                    break L3;
                  } else {
                    stackOut_3_0 = var2_int + ((nk) this).field_I[var3].field_w;
                    stackIn_8_0 = stackOut_3_0;
                    stackIn_4_0 = stackOut_3_0;
                    if (var4 != 0) {
                      break L2;
                    } else {
                      L4: {
                        var2_int = stackIn_4_0;
                        if (((nk) this).field_I[var3].field_d == null) {
                          break L4;
                        } else {
                          var2_int = var2_int + ((nk) this).field_I[var3].field_d.j(param0);
                          break L4;
                        }
                      }
                      var3++;
                      if (var4 == 0) {
                        continue L1;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
                stackOut_7_0 = var2_int;
                stackIn_8_0 = stackOut_7_0;
                break L2;
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ci.a((Throwable) (Object) var2, "nk.FA(" + param0 + ')');
        }
        return stackIn_8_0;
    }

    final void a(byte param0, int param1, int param2, int param3) {
        RuntimeException var5 = null;
        int var5_int = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int stackIn_5_0 = 0;
        int stackIn_9_0 = 0;
        Object stackIn_12_0 = null;
        nk stackIn_12_1 = null;
        Object stackIn_47_0 = null;
        nk stackIn_47_1 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_4_0 = 0;
        int stackOut_2_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_6_0 = 0;
        Object stackOut_11_0 = null;
        nk stackOut_11_1 = null;
        Object stackOut_45_0 = null;
        Object stackOut_45_1 = null;
        var13 = SteelSentinels.field_G;
        try {
          L0: {
            L1: {
              if (!((nk) this).field_L) {
                stackOut_4_0 = hj.field_w << 403432898;
                stackIn_5_0 = stackOut_4_0;
                break L1;
              } else {
                stackOut_2_0 = hj.field_w;
                stackIn_5_0 = stackOut_2_0;
                break L1;
              }
            }
            L2: {
              var5_int = stackIn_5_0;
              if (!((nk) this).field_L) {
                stackOut_8_0 = 2;
                stackIn_9_0 = stackOut_8_0;
                break L2;
              } else {
                stackOut_6_0 = 4;
                stackIn_9_0 = stackOut_6_0;
                break L2;
              }
            }
            var6 = stackIn_9_0;
            var7 = ((nk) this).field_y;
            var8 = 0;
            L3: while (true) {
              L4: {
                L5: {
                  L6: {
                    L7: {
                      if (~var8 <= ~((nk) this).field_I.length) {
                        break L7;
                      } else {
                        stackOut_11_0 = null;
                        stackOut_11_1 = ((nk) this).field_I[var8].field_d;
                        stackIn_47_0 = stackOut_11_0;
                        stackIn_47_1 = stackOut_11_1;
                        stackIn_12_0 = stackOut_11_0;
                        stackIn_12_1 = stackOut_11_1;
                        if (var13 != 0) {
                          break L6;
                        } else {
                          L8: {
                            if (stackIn_12_0 == (Object) (Object) stackIn_12_1) {
                              break L8;
                            } else {
                              if (!((nk) this).field_I[var8].field_u) {
                                break L8;
                              } else {
                                var9 = jh.a(-var7 / 8, 4096) / 256;
                                var10 = kg.a(-var7 / 8, (byte) -103) / 256;
                                var11 = param3 * (hj.field_w * ((((nk) this).field_I[var8].field_r - ((nk) this).field_E) * var9 + (((nk) this).field_I[var8].field_s - ((nk) this).field_G) * var10) >> -1091639436) + param1;
                                var12 = ((-((((nk) this).field_I[var8].field_s - ((nk) this).field_G) * var9) + (-((nk) this).field_E + ((nk) this).field_I[var8].field_r) * var10) * hj.field_w >> 1958262324) + param2;
                                ((nk) this).field_I[var8].field_d.a((byte) 122, var11, var12, param3);
                                break L8;
                              }
                            }
                          }
                          var8++;
                          if (var13 == 0) {
                            continue L3;
                          } else {
                            break L7;
                          }
                        }
                      }
                    }
                    L9: {
                      if (param0 >= 97) {
                        break L9;
                      } else {
                        ((nk) this).field_H = null;
                        break L9;
                      }
                    }
                    L10: {
                      if (((nk) this).field_N != 108) {
                        break L10;
                      } else {
                        if (vi.field_db) {
                          break L5;
                        } else {
                          break L10;
                        }
                      }
                    }
                    L11: {
                      if (param3 != 1) {
                        break L11;
                      } else {
                        if (null == ((nk) this).field_U) {
                          break L11;
                        } else {
                          L12: {
                            if (0 < ((nk) this).field_C) {
                              break L12;
                            } else {
                              ((nk) this).field_U.a(((nk) this).field_G << var6, ((nk) this).field_E << var6, param1 << -1071407324, param2 << 757338596, -var7, var5_int);
                              if (var13 == 0) {
                                break L4;
                              } else {
                                break L12;
                              }
                            }
                          }
                          if (((nk) this).field_C > 50) {
                            break L4;
                          } else {
                            ((nk) this).field_U.a(((nk) this).field_G << var6, ((nk) this).field_E << var6, param1 << 1422359812, param2 << -1494321116, -var7, (-((nk) this).field_C + 50) * var5_int / 50);
                            if (var13 == 0) {
                              break L4;
                            } else {
                              break L11;
                            }
                          }
                        }
                      }
                    }
                    stackOut_45_0 = null;
                    stackOut_45_1 = this;
                    stackIn_47_0 = stackOut_45_0;
                    stackIn_47_1 = (nk) (Object) stackOut_45_1;
                    break L6;
                  }
                  if (stackIn_47_0 != (Object) (Object) stackIn_47_1.field_H) {
                    L13: {
                      if (0 >= ((nk) this).field_C) {
                        break L13;
                      } else {
                        if (((nk) this).field_C > 50) {
                          break L4;
                        } else {
                          ((nk) this).field_H.a(((nk) this).field_H.field_g * 4 + -((nk) this).field_G << var6, ((nk) this).field_E << var6, param1 << -743874396, param2 << -344659868, var7, (-((nk) this).field_C + 50) * var5_int / 50);
                          if (var13 == 0) {
                            break L4;
                          } else {
                            break L13;
                          }
                        }
                      }
                    }
                    ((nk) this).field_H.a(4 * ((nk) this).field_H.field_g - ((nk) this).field_G << var6, ((nk) this).field_E << var6, param1 << 183085412, param2 << 655566916, var7, var5_int);
                    if (var13 == 0) {
                      break L4;
                    } else {
                      break L5;
                    }
                  } else {
                    break L4;
                  }
                }
                L14: {
                  if (((nk) this).field_C > 0) {
                    break L14;
                  } else {
                    ((nk) this).field_U.a(140 << var6, 130 << var6, param1 << 1537648228, param2 << -922044764, -var7, var5_int);
                    if (var13 == 0) {
                      break L4;
                    } else {
                      break L14;
                    }
                  }
                }
                if (50 < ((nk) this).field_C) {
                  break L4;
                } else {
                  ((nk) this).field_U.a(140 << var6, 130 << var6, param1 << 670110884, param2 << 693050276, -var7, (-((nk) this).field_C + 50) * var5_int / 50);
                  break L4;
                }
              }
              var8 = 0;
              L15: while (true) {
                L16: {
                  L17: {
                    if (var8 >= ((nk) this).field_I.length) {
                      break L17;
                    } else {
                      if (var13 != 0) {
                        break L16;
                      } else {
                        L18: {
                          if (null == ((nk) this).field_I[var8].field_d) {
                            break L18;
                          } else {
                            if (((nk) this).field_I[var8].field_u) {
                              break L18;
                            } else {
                              var9 = jh.a(-var7 / 8, 4096) / 256;
                              var10 = kg.a(-var7 / 8, (byte) -71) / 256;
                              var11 = param3 * (hj.field_w * ((((nk) this).field_I[var8].field_r - ((nk) this).field_E) * var9 + var10 * (-((nk) this).field_G + ((nk) this).field_I[var8].field_s)) >> 82278676) + param1;
                              var12 = param2 + (hj.field_w * ((((nk) this).field_I[var8].field_r + -((nk) this).field_E) * var10 + -(var9 * (-((nk) this).field_G + ((nk) this).field_I[var8].field_s))) >> 1450859092);
                              ((nk) this).field_I[var8].field_d.a((byte) 101, var11, var12, param3);
                              break L18;
                            }
                          }
                        }
                        var8++;
                        if (var13 == 0) {
                          continue L15;
                        } else {
                          break L17;
                        }
                      }
                    }
                  }
                  break L16;
                }
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          throw ci.a((Throwable) (Object) var5, "nk.DA(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final int a(int param0, int[] param1, boolean param2, int param3) {
        RuntimeException var5 = null;
        int var5_int = 0;
        int var6 = 0;
        nk var7 = null;
        int var8 = 0;
        int stackIn_14_0 = 0;
        int stackIn_17_0 = 0;
        int stackIn_23_0 = 0;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_28_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_16_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_22_0 = 0;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        String stackOut_27_2 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        String stackOut_25_2 = null;
        var8 = SteelSentinels.field_G;
        try {
          L0: {
            var5_int = param3;
            L1: while (true) {
              L2: {
                if (((nk) this).field_I.length <= var5_int) {
                  break L2;
                } else {
                  L3: {
                    L4: {
                      if (null != ((nk) this).field_I[var5_int].field_d) {
                        break L4;
                      } else {
                        if (-1 != ((nk) this).field_I[var5_int].field_q) {
                          L5: {
                            int incrementValue$1 = param0;
                            param0++;
                            var6 = param1[incrementValue$1];
                            if (var6 != -1) {
                              var7 = ul.a(var6, (byte) 67);
                              if (null != var7) {
                                if ((var7.field_Q & ((nk) this).field_I[var5_int].field_q) != 0) {
                                  ((nk) this).field_I[var5_int].field_d = new nk(var7, param2);
                                  param0 = ((nk) this).field_I[var5_int].field_d.a(param0, param1, param2, 0);
                                  break L5;
                                } else {
                                  dh.a(db.a("Component not correct id=<%0> type=<%0> desired=<%1>", -71, new String[3]), (byte) 124);
                                  stackOut_16_0 = param0;
                                  stackIn_17_0 = stackOut_16_0;
                                  return stackIn_17_0;
                                }
                              } else {
                                dh.a(db.a("Component Id not valid ID=<%0> data_pos=<%1>", -61, new String[2]), (byte) 118);
                                stackOut_13_0 = param0;
                                stackIn_14_0 = stackOut_13_0;
                                return stackIn_14_0;
                              }
                            } else {
                              break L5;
                            }
                          }
                          if (var8 == 0) {
                            break L3;
                          } else {
                            break L4;
                          }
                        } else {
                          break L3;
                        }
                      }
                    }
                    param0 = ((nk) this).field_I[var5_int].field_d.a(param0, param1, param2, 0);
                    break L3;
                  }
                  var5_int++;
                  if (var8 == 0) {
                    continue L1;
                  } else {
                    break L2;
                  }
                }
              }
              stackOut_22_0 = param0;
              stackIn_23_0 = stackOut_22_0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var5 = decompiledCaughtException;
            stackOut_24_0 = (RuntimeException) var5;
            stackOut_24_1 = new StringBuilder().append("nk.F(").append(param0).append(',');
            stackIn_27_0 = stackOut_24_0;
            stackIn_27_1 = stackOut_24_1;
            stackIn_25_0 = stackOut_24_0;
            stackIn_25_1 = stackOut_24_1;
            if (param1 == null) {
              stackOut_27_0 = (RuntimeException) (Object) stackIn_27_0;
              stackOut_27_1 = (StringBuilder) (Object) stackIn_27_1;
              stackOut_27_2 = "null";
              stackIn_28_0 = stackOut_27_0;
              stackIn_28_1 = stackOut_27_1;
              stackIn_28_2 = stackOut_27_2;
              break L6;
            } else {
              stackOut_25_0 = (RuntimeException) (Object) stackIn_25_0;
              stackOut_25_1 = (StringBuilder) (Object) stackIn_25_1;
              stackOut_25_2 = "{...}";
              stackIn_28_0 = stackOut_25_0;
              stackIn_28_1 = stackOut_25_1;
              stackIn_28_2 = stackOut_25_2;
              break L6;
            }
          }
          throw ci.a((Throwable) (Object) stackIn_28_0, stackIn_28_2 + ',' + param2 + ',' + param3 + ')');
        }
        return stackIn_23_0;
    }

    public static void d(byte param0) {
        RuntimeException var1 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              field_F = null;
              field_P = null;
              field_M = null;
              field_X = null;
              if (param0 == 20) {
                break L1;
              } else {
                field_P = null;
                break L1;
              }
            }
            field_A = null;
            field_O = null;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw ci.a((Throwable) (Object) var1, "nk.GA(" + param0 + ')');
        }
    }

    final void b(int param0, int param1) {
        RuntimeException runtimeException = null;
        int var3_int = 0;
        int var4 = 0;
        RuntimeException decompiledCaughtException = null;
        var4 = SteelSentinels.field_G;
        try {
          L0: {
            var3_int = 0;
            L1: while (true) {
              L2: {
                L3: {
                  if (var3_int >= ((nk) this).field_I.length) {
                    break L3;
                  } else {
                    if (var4 != 0) {
                      break L2;
                    } else {
                      L4: {
                        if (null != ((nk) this).field_I[var3_int].field_d) {
                          ((nk) this).field_I[var3_int].field_d.b(param0, -107);
                          break L4;
                        } else {
                          break L4;
                        }
                      }
                      var3_int++;
                      if (var4 == 0) {
                        continue L1;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
                var3_int = -45 / ((param1 - -41) / 32);
                break L2;
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw ci.a((Throwable) (Object) runtimeException, "nk.G(" + param0 + ',' + param1 + ')');
        }
    }

    final void b(byte param0, int param1, int param2, int param3) {
        RuntimeException var5 = null;
        int var5_int = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        RuntimeException decompiledCaughtException = null;
        var10 = SteelSentinels.field_G;
        try {
          L0: {
            L1: {
              ((nk) this).field_T = param1;
              ((nk) this).field_V = param3;
              if (param0 == -128) {
                break L1;
              } else {
                String discarded$1 = ((nk) this).l(35);
                break L1;
              }
            }
            var5_int = 0;
            L2: while (true) {
              L3: {
                L4: {
                  if (~var5_int <= ~((nk) this).field_I.length) {
                    break L4;
                  } else {
                    if (var10 != 0) {
                      break L3;
                    } else {
                      L5: {
                        if (null != ((nk) this).field_I[var5_int].field_d) {
                          var6 = 32 * jh.a(-((nk) this).field_y * 8192 / 65536, 4096) / 65536;
                          var7 = kg.a(-((nk) this).field_y * 8192 / 65536, (byte) -68) * 32 / 65536;
                          var8 = param1 + ((-((nk) this).field_E + ((nk) this).field_I[var5_int].field_r) * var6 + var7 * (((nk) this).field_I[var5_int].field_s - ((nk) this).field_G)) * param2;
                          var9 = param3 + (-((nk) this).field_E + ((nk) this).field_I[var5_int].field_r) * var7 + -(var6 * (((nk) this).field_I[var5_int].field_s + -((nk) this).field_G));
                          ((nk) this).field_I[var5_int].field_d.b((byte) -128, var8, param2, var9);
                          break L5;
                        } else {
                          break L5;
                        }
                      }
                      var5_int++;
                      if (var10 == 0) {
                        continue L2;
                      } else {
                        break L4;
                      }
                    }
                  }
                }
                break L3;
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          throw ci.a((Throwable) (Object) var5, "nk.Q(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
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
        int stackIn_16_0 = 0;
        int stackIn_34_0 = 0;
        RuntimeException stackIn_46_0 = null;
        StringBuilder stackIn_46_1 = null;
        RuntimeException stackIn_48_0 = null;
        StringBuilder stackIn_48_1 = null;
        RuntimeException stackIn_49_0 = null;
        StringBuilder stackIn_49_1 = null;
        String stackIn_49_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_15_0 = 0;
        int stackOut_33_0 = 0;
        RuntimeException stackOut_45_0 = null;
        StringBuilder stackOut_45_1 = null;
        RuntimeException stackOut_48_0 = null;
        StringBuilder stackOut_48_1 = null;
        String stackOut_48_2 = null;
        RuntimeException stackOut_46_0 = null;
        StringBuilder stackOut_46_1 = null;
        String stackOut_46_2 = null;
        var8 = SteelSentinels.field_G;
        try {
          L0: {
            L1: {
              L2: {
                L3: {
                  ((nk) this).field_L = param1;
                  if (!param1) {
                    break L3;
                  } else {
                    ((nk) this).field_R = param2.field_R;
                    if (var8 == 0) {
                      break L2;
                    } else {
                      break L3;
                    }
                  }
                }
                L4: {
                  if (param2.field_U != null) {
                    break L4;
                  } else {
                    if (param2.field_R != null) {
                      var4_ref = new wk(param2.field_R.field_g >> 837218530, param2.field_R.field_d >> -2137043710);
                      var5 = pb.field_g;
                      var4_ref.d();
                      param2.field_R.b(0, 0);
                      pb.a(var5, 640, 480);
                      param2.field_U = new gk(var4_ref.field_z, var4_ref.field_B, 129);
                      var6 = var4_ref.field_E.length + -1;
                      L5: while (true) {
                        L6: {
                          if (var6 < 0) {
                            break L6;
                          } else {
                            var7 = var4_ref.field_E[var6];
                            stackOut_15_0 = var7;
                            stackIn_34_0 = stackOut_15_0;
                            stackIn_16_0 = stackOut_15_0;
                            if (var8 != 0) {
                              break L1;
                            } else {
                              L7: {
                                L8: {
                                  if (stackIn_16_0 != 0) {
                                    break L8;
                                  } else {
                                    param2.field_U.field_p[var6] = (byte) 0;
                                    if (var8 == 0) {
                                      break L7;
                                    } else {
                                      break L8;
                                    }
                                  }
                                }
                                L9: {
                                  if (~(65535 & var7) != ~(var7 >> -353384856)) {
                                    break L9;
                                  } else {
                                    param2.field_U.field_p[var6] = (byte)(1 + 63 * ec.a(var7, 255) / 255);
                                    if (var8 == 0) {
                                      break L7;
                                    } else {
                                      break L9;
                                    }
                                  }
                                }
                                param2.field_U.field_p[var6] = (byte)(65 + 63 * ec.a(255, var7) / 255);
                                break L7;
                              }
                              var6--;
                              if (var8 == 0) {
                                continue L5;
                              } else {
                                break L6;
                              }
                            }
                          }
                        }
                        param2.field_U.field_o = rm.field_h;
                        param2.field_H = param2.field_U.b();
                        param2.field_H.field_o = param2.field_U.field_o;
                        break L4;
                      }
                    } else {
                      break L4;
                    }
                  }
                }
                ((nk) this).field_U = param2.field_U;
                ((nk) this).field_R = param2.field_R;
                ((nk) this).field_H = param2.field_H;
                break L2;
              }
              ((nk) this).field_G = param2.field_G;
              ((nk) this).field_D = param2.field_D;
              ((nk) this).field_Q = param2.field_Q;
              ((nk) this).field_z = param2.field_z;
              ((nk) this).field_E = param2.field_E;
              ((nk) this).field_N = param2.field_N;
              ((nk) this).field_I = new qd[param2.field_I.length];
              stackOut_33_0 = param0;
              stackIn_34_0 = stackOut_33_0;
              break L1;
            }
            L10: {
              if (stackIn_34_0 == -353384856) {
                break L10;
              } else {
                nk discarded$1 = ((nk) this).a(41, (byte) 107);
                break L10;
              }
            }
            var4_int = 0;
            L11: while (true) {
              L12: {
                L13: {
                  if (~var4_int <= ~((nk) this).field_I.length) {
                    break L13;
                  } else {
                    ((nk) this).field_I[var4_int] = new qd(param2.field_I[var4_int], param1);
                    var4_int++;
                    if (var8 != 0) {
                      break L12;
                    } else {
                      if (var8 == 0) {
                        continue L11;
                      } else {
                        break L13;
                      }
                    }
                  }
                }
                ((nk) this).field_K = param2.field_K;
                ((nk) this).field_y = param2.field_y;
                ((nk) this).field_W = param2.field_W;
                break L12;
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L14: {
            var4 = decompiledCaughtException;
            stackOut_45_0 = (RuntimeException) var4;
            stackOut_45_1 = new StringBuilder().append("nk.L(").append(param0).append(',').append(param1).append(',');
            stackIn_48_0 = stackOut_45_0;
            stackIn_48_1 = stackOut_45_1;
            stackIn_46_0 = stackOut_45_0;
            stackIn_46_1 = stackOut_45_1;
            if (param2 == null) {
              stackOut_48_0 = (RuntimeException) (Object) stackIn_48_0;
              stackOut_48_1 = (StringBuilder) (Object) stackIn_48_1;
              stackOut_48_2 = "null";
              stackIn_49_0 = stackOut_48_0;
              stackIn_49_1 = stackOut_48_1;
              stackIn_49_2 = stackOut_48_2;
              break L14;
            } else {
              stackOut_46_0 = (RuntimeException) (Object) stackIn_46_0;
              stackOut_46_1 = (StringBuilder) (Object) stackIn_46_1;
              stackOut_46_2 = "{...}";
              stackIn_49_0 = stackOut_46_0;
              stackIn_49_1 = stackOut_46_1;
              stackIn_49_2 = stackOut_46_2;
              break L14;
            }
          }
          throw ci.a((Throwable) (Object) stackIn_49_0, stackIn_49_2 + ')');
        }
    }

    private final void a(byte param0, boolean param1, int param2, int param3, int param4, int param5, int param6) {
        if (param0 > -63) {
            return;
        }
        try {
            ((nk) this).field_I[param3].field_d.a(((nk) this).field_D + param5 - -((nk) this).field_I[param3].field_i, param1, param4, param6, (byte) 49, param2);
        } catch (RuntimeException runtimeException) {
            throw ci.a((Throwable) (Object) runtimeException, "nk.J(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
    }

    final void d(int param0, int param1) {
        RuntimeException var3 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              ed.field_f = 0;
              gl.field_p = -1;
              si.field_t = 0;
              if (param0 == 65536) {
                break L1;
              } else {
                ((nk) this).field_y = 13;
                break L1;
              }
            }
            this.e(param1, 5307);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw ci.a((Throwable) (Object) var3, "nk.O(" + param0 + ',' + param1 + ')');
        }
    }

    final void a(byte param0, boolean param1, boolean param2) {
        RuntimeException var4 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (((nk) this).field_C <= 0) {
                break L1;
              } else {
                L2: {
                  ((nk) this).field_C = ((nk) this).field_C - 1;
                  if (!param2) {
                    break L2;
                  } else {
                    if (((nk) this).field_Q != 128) {
                      break L2;
                    } else {
                      if (((nk) this).field_C <= 75) {
                        break L1;
                      } else {
                        ((nk) this).field_C = 75;
                        if (SteelSentinels.field_G == 0) {
                          break L1;
                        } else {
                          break L2;
                        }
                      }
                    }
                  }
                }
                if (param1) {
                  if (((nk) this).field_C <= 0) {
                    break L1;
                  } else {
                    ((nk) this).field_C = ((nk) this).field_C - 1;
                    break L1;
                  }
                } else {
                  break L1;
                }
              }
            }
            L3: {
              if (param0 < -23) {
                break L3;
              } else {
                field_X = null;
                break L3;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw ci.a((Throwable) (Object) var4, "nk.SA(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final nk[] k(int param0) {
        int var2_int = 0;
        RuntimeException var2 = null;
        nk[] var3 = null;
        nk[] stackIn_1_0 = null;
        RuntimeException decompiledCaughtException = null;
        nk[] stackOut_0_0 = null;
        try {
          L0: {
            var2_int = 66 / ((29 - param0) / 57);
            var3 = new nk[]{};
            stackOut_0_0 = this.a(var3, 3);
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ci.a((Throwable) (Object) var2, "nk.C(" + param0 + ')');
        }
        return stackIn_1_0;
    }

    final int i(int param0) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int stackIn_3_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_11_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_6_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_2_0 = 0;
        var4 = SteelSentinels.field_G;
        try {
          L0: {
            if (param0 < -104) {
              var2_int = 0;
              var3 = 0;
              L1: while (true) {
                L2: {
                  L3: {
                    if (~((nk) this).field_I.length >= ~var3) {
                      break L3;
                    } else {
                      stackOut_6_0 = var2_int + ((nk) this).field_I[var3].field_p;
                      stackIn_11_0 = stackOut_6_0;
                      stackIn_7_0 = stackOut_6_0;
                      if (var4 != 0) {
                        break L2;
                      } else {
                        L4: {
                          var2_int = stackIn_7_0;
                          if (null == ((nk) this).field_I[var3].field_d) {
                            break L4;
                          } else {
                            var2_int = var2_int + ((nk) this).field_I[var3].field_d.i(-116);
                            break L4;
                          }
                        }
                        var3++;
                        if (var4 == 0) {
                          continue L1;
                        } else {
                          break L3;
                        }
                      }
                    }
                  }
                  stackOut_10_0 = var2_int;
                  stackIn_11_0 = stackOut_10_0;
                  break L2;
                }
                break L0;
              }
            } else {
              stackOut_2_0 = 21;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ci.a((Throwable) (Object) var2, "nk.RA(" + param0 + ')');
        }
        return stackIn_11_0;
    }

    final int h(int param0) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int stackIn_3_0 = 0;
        int stackIn_6_0 = 0;
        int stackIn_12_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_5_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_2_0 = 0;
        var4 = SteelSentinels.field_G;
        try {
          L0: {
            var2_int = 0;
            var3 = 0;
            if (param0 == -31496) {
              L1: while (true) {
                L2: {
                  L3: {
                    if (var3 >= ((nk) this).field_I.length) {
                      break L3;
                    } else {
                      stackOut_5_0 = var2_int + ((nk) this).field_I[var3].field_b;
                      stackIn_12_0 = stackOut_5_0;
                      stackIn_6_0 = stackOut_5_0;
                      if (var4 != 0) {
                        break L2;
                      } else {
                        L4: {
                          var2_int = stackIn_6_0;
                          if (((nk) this).field_I[var3].field_d != null) {
                            var2_int = var2_int + ((nk) this).field_I[var3].field_d.h(-31496);
                            break L4;
                          } else {
                            break L4;
                          }
                        }
                        var3++;
                        if (var4 == 0) {
                          continue L1;
                        } else {
                          break L3;
                        }
                      }
                    }
                  }
                  stackOut_11_0 = var2_int;
                  stackIn_12_0 = stackOut_11_0;
                  break L2;
                }
                break L0;
              }
            } else {
              stackOut_2_0 = 18;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ci.a((Throwable) (Object) var2, "nk.A(" + param0 + ')');
        }
        return stackIn_12_0;
    }

    final qd c(int param0, int param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        qd var4 = null;
        int var5 = 0;
        Object stackIn_4_0 = null;
        qd stackIn_11_0 = null;
        qd stackIn_14_0 = null;
        qd stackIn_20_0 = null;
        Object stackIn_23_0 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_3_0 = null;
        qd stackOut_13_0 = null;
        qd stackOut_10_0 = null;
        qd stackOut_19_0 = null;
        Object stackOut_22_0 = null;
        var5 = SteelSentinels.field_G;
        try {
          L0: {
            var3_int = param0;
            L1: while (true) {
              L2: {
                L3: {
                  if (((nk) this).field_I.length <= var3_int) {
                    break L3;
                  } else {
                    stackOut_3_0 = null;
                    stackIn_23_0 = stackOut_3_0;
                    stackIn_4_0 = stackOut_3_0;
                    if (var5 != 0) {
                      break L2;
                    } else {
                      L4: {
                        L5: {
                          if (stackIn_4_0 == (Object) (Object) ((nk) this).field_I[var3_int].field_d) {
                            break L5;
                          } else {
                            if (((nk) this).field_I[var3_int].field_d.field_Q != 1024) {
                              var4 = ((nk) this).field_I[var3_int].field_d.c(0, param1);
                              if (null == var4) {
                                if (var5 == 0) {
                                  break L4;
                                } else {
                                  break L5;
                                }
                              } else {
                                stackOut_13_0 = (qd) var4;
                                stackIn_14_0 = stackOut_13_0;
                                return stackIn_14_0;
                              }
                            } else {
                              stackOut_10_0 = ((nk) this).field_I[var3_int];
                              stackIn_11_0 = stackOut_10_0;
                              return stackIn_11_0;
                            }
                          }
                        }
                        if (1024 != ((nk) this).field_I[var3_int].field_q) {
                          break L4;
                        } else {
                          stackOut_19_0 = ((nk) this).field_I[var3_int];
                          stackIn_20_0 = stackOut_19_0;
                          return stackIn_20_0;
                        }
                      }
                      var3_int++;
                      if (var5 == 0) {
                        continue L1;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
                stackOut_22_0 = null;
                stackIn_23_0 = stackOut_22_0;
                break L2;
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw ci.a((Throwable) (Object) var3, "nk.AB(" + param0 + ',' + param1 + ')');
        }
        return (qd) (Object) stackIn_23_0;
    }

    final boolean f(int param0, int param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int stackIn_4_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_19_0 = 0;
        int stackIn_22_0 = 0;
        int stackIn_26_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_18_0 = 0;
        int stackOut_21_0 = 0;
        int stackOut_25_0 = 0;
        var4 = SteelSentinels.field_G;
        try {
          L0: {
            var3_int = 0;
            L1: while (true) {
              L2: {
                L3: {
                  if (~var3_int <= ~((nk) this).field_I.length) {
                    break L3;
                  } else {
                    stackOut_3_0 = ((nk) this).field_I[var3_int].field_q & param0;
                    stackIn_22_0 = stackOut_3_0;
                    stackIn_4_0 = stackOut_3_0;
                    if (var4 != 0) {
                      break L2;
                    } else {
                      L4: {
                        if (stackIn_4_0 <= 0) {
                          break L4;
                        } else {
                          if (((nk) this).field_I[var3_int].field_q != -1) {
                            stackOut_12_0 = 1;
                            stackIn_13_0 = stackOut_12_0;
                            return stackIn_13_0 != 0;
                          } else {
                            break L4;
                          }
                        }
                      }
                      L5: {
                        if (null == ((nk) this).field_I[var3_int].field_d) {
                          break L5;
                        } else {
                          if (!((nk) this).field_I[var3_int].field_d.f(param0, -1)) {
                            break L5;
                          } else {
                            stackOut_18_0 = 1;
                            stackIn_19_0 = stackOut_18_0;
                            return stackIn_19_0 != 0;
                          }
                        }
                      }
                      var3_int++;
                      if (var4 == 0) {
                        continue L1;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
                stackOut_21_0 = param1;
                stackIn_22_0 = stackOut_21_0;
                break L2;
              }
              L6: {
                if (stackIn_22_0 == -1) {
                  break L6;
                } else {
                  String discarded$2 = ((nk) this).l(127);
                  break L6;
                }
              }
              stackOut_25_0 = 0;
              stackIn_26_0 = stackOut_25_0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw ci.a((Throwable) (Object) var3, "nk.E(" + param0 + ',' + param1 + ')');
        }
        return stackIn_26_0 != 0;
    }

    final int a(int param0, int[] param1, int param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int stackIn_17_0 = 0;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_16_0 = 0;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        var5 = SteelSentinels.field_G;
        try {
          L0: {
            L1: {
              if (param0 != ~((nk) this).field_N) {
                int incrementValue$2 = param2;
                param2++;
                param1[incrementValue$2] = ((nk) this).field_N;
                break L1;
              } else {
                break L1;
              }
            }
            var4_int = 0;
            L2: while (true) {
              L3: {
                if (~var4_int <= ~((nk) this).field_I.length) {
                  break L3;
                } else {
                  L4: {
                    L5: {
                      if (null != ((nk) this).field_I[var4_int].field_d) {
                        break L5;
                      } else {
                        if (-1 != ((nk) this).field_I[var4_int].field_q) {
                          int incrementValue$3 = param2;
                          param2++;
                          param1[incrementValue$3] = -1;
                          if (var5 == 0) {
                            break L4;
                          } else {
                            break L5;
                          }
                        } else {
                          break L4;
                        }
                      }
                    }
                    param2 = ((nk) this).field_I[var4_int].field_d.a(0, param1, param2);
                    break L4;
                  }
                  var4_int++;
                  if (var5 == 0) {
                    continue L2;
                  } else {
                    break L3;
                  }
                }
              }
              stackOut_16_0 = param2;
              stackIn_17_0 = stackOut_16_0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var4 = decompiledCaughtException;
            stackOut_18_0 = (RuntimeException) var4;
            stackOut_18_1 = new StringBuilder().append("nk.D(").append(param0).append(',');
            stackIn_21_0 = stackOut_18_0;
            stackIn_21_1 = stackOut_18_1;
            stackIn_19_0 = stackOut_18_0;
            stackIn_19_1 = stackOut_18_1;
            if (param1 == null) {
              stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "null";
              stackIn_22_0 = stackOut_21_0;
              stackIn_22_1 = stackOut_21_1;
              stackIn_22_2 = stackOut_21_2;
              break L6;
            } else {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "{...}";
              stackIn_22_0 = stackOut_19_0;
              stackIn_22_1 = stackOut_19_1;
              stackIn_22_2 = stackOut_19_2;
              break L6;
            }
          }
          throw ci.a((Throwable) (Object) stackIn_22_0, stackIn_22_2 + ',' + param2 + ')');
        }
        return stackIn_17_0;
    }

    final String l(int param0) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        String stackIn_11_0 = null;
        String stackIn_21_0 = null;
        Object stackIn_24_0 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_10_0 = null;
        String stackOut_20_0 = null;
        Object stackOut_23_0 = null;
        var3 = SteelSentinels.field_G;
        try {
          L0: {
            L1: {
              if (((nk) this).field_N < 0) {
                break L1;
              } else {
                if (~t.field_e.length < ~((nk) this).field_N) {
                  if (t.field_e[((nk) this).field_N] != null) {
                    stackOut_10_0 = t.field_e[((nk) this).field_N];
                    stackIn_11_0 = stackOut_10_0;
                    return stackIn_11_0;
                  } else {
                    break L1;
                  }
                } else {
                  break L1;
                }
              }
            }
            L2: {
              if (param0 == -24719) {
                break L2;
              } else {
                qd[] discarded$2 = ((nk) this).a((qd[]) null, -66, -17);
                break L2;
              }
            }
            var2_int = 0;
            L3: while (true) {
              L4: {
                if (~((nk) this).field_I.length >= ~var2_int) {
                  break L4;
                } else {
                  if (((nk) this).field_I[var2_int].field_v != null) {
                    stackOut_20_0 = ((nk) this).field_I[var2_int].field_v;
                    stackIn_21_0 = stackOut_20_0;
                    return stackIn_21_0;
                  } else {
                    var2_int++;
                    if (var3 == 0) {
                      continue L3;
                    } else {
                      break L4;
                    }
                  }
                }
              }
              stackOut_23_0 = null;
              stackIn_24_0 = stackOut_23_0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ci.a((Throwable) (Object) var2, "nk.R(" + param0 + ')');
        }
        return (String) (Object) stackIn_24_0;
    }

    final int[] c(byte param0) {
        int[] var2 = null;
        RuntimeException var2_ref = null;
        int[] stackIn_4_0 = null;
        RuntimeException decompiledCaughtException = null;
        int[] stackOut_3_0 = null;
        try {
          L0: {
            L1: {
              if (param0 == 125) {
                break L1;
              } else {
                ((nk) this).field_N = -25;
                break L1;
              }
            }
            var2 = new int[]{};
            stackOut_3_0 = this.a(var2, param0 ^ 6900);
            stackIn_4_0 = stackOut_3_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw ci.a((Throwable) (Object) var2_ref, "nk.QA(" + param0 + ')');
        }
        return stackIn_4_0;
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
        int[] stackIn_28_0 = null;
        int[] stackIn_34_0 = null;
        int[] stackIn_37_0 = null;
        int stackIn_40_0 = 0;
        int stackIn_40_1 = 0;
        int stackIn_51_0 = 0;
        int stackIn_51_1 = 0;
        int[] stackIn_55_0 = null;
        RuntimeException stackIn_57_0 = null;
        StringBuilder stackIn_57_1 = null;
        RuntimeException stackIn_59_0 = null;
        StringBuilder stackIn_59_1 = null;
        RuntimeException stackIn_60_0 = null;
        StringBuilder stackIn_60_1 = null;
        String stackIn_60_2 = null;
        RuntimeException decompiledCaughtException = null;
        int[] stackOut_27_0 = null;
        int[] stackOut_33_0 = null;
        int[] stackOut_36_0 = null;
        int stackOut_39_0 = 0;
        int stackOut_39_1 = 0;
        int stackOut_50_0 = 0;
        int stackOut_50_1 = 0;
        int[] stackOut_54_0 = null;
        RuntimeException stackOut_56_0 = null;
        StringBuilder stackOut_56_1 = null;
        RuntimeException stackOut_59_0 = null;
        StringBuilder stackOut_59_1 = null;
        String stackOut_59_2 = null;
        RuntimeException stackOut_57_0 = null;
        StringBuilder stackOut_57_1 = null;
        String stackOut_57_2 = null;
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
              L3: {
                L4: {
                  if (var4 >= ((nk) this).field_I.length) {
                    break L4;
                  } else {
                    if (var9 != 0) {
                      break L3;
                    } else {
                      L5: {
                        if (null != ((nk) this).field_I[var4].field_d) {
                          var3_int = 0;
                          param0 = ((nk) this).field_I[var4].field_d.a(param0, 6793);
                          break L5;
                        } else {
                          break L5;
                        }
                      }
                      var4++;
                      if (var9 == 0) {
                        continue L2;
                      } else {
                        break L4;
                      }
                    }
                  }
                }
                if (param1 == 6793) {
                  break L3;
                } else {
                  ((nk) this).a((byte) -7, true, true);
                  break L3;
                }
              }
              L6: {
                if (var3_int == 0) {
                  break L6;
                } else {
                  if (-1 == ((nk) this).field_N) {
                    break L6;
                  } else {
                    var4 = param0.length;
                    var5_int = 0;
                    L7: while (true) {
                      L8: {
                        L9: {
                          if (~var5_int <= ~var4) {
                            break L9;
                          } else {
                            stackOut_27_0 = (int[]) param0;
                            stackIn_37_0 = stackOut_27_0;
                            stackIn_28_0 = stackOut_27_0;
                            if (var9 != 0) {
                              break L8;
                            } else {
                              if (stackIn_28_0[var5_int] == ja.a(((nk) this).field_N, false)) {
                                stackOut_33_0 = (int[]) param0;
                                stackIn_34_0 = stackOut_33_0;
                                return stackIn_34_0;
                              } else {
                                var5_int++;
                                if (var9 == 0) {
                                  continue L7;
                                } else {
                                  break L9;
                                }
                              }
                            }
                          }
                        }
                        stackOut_36_0 = (int[]) param0;
                        stackIn_37_0 = stackOut_36_0;
                        break L8;
                      }
                      var5 = stackIn_37_0;
                      param0 = new int[var4 + 1];
                      var6 = ja.a(((nk) this).field_N, false);
                      var7 = 0;
                      var8 = 0;
                      L10: while (true) {
                        L11: {
                          L12: {
                            if (var4 <= var8) {
                              break L12;
                            } else {
                              stackOut_39_0 = -1;
                              stackOut_39_1 = var6;
                              stackIn_51_0 = stackOut_39_0;
                              stackIn_51_1 = stackOut_39_1;
                              stackIn_40_0 = stackOut_39_0;
                              stackIn_40_1 = stackOut_39_1;
                              if (var9 != 0) {
                                break L11;
                              } else {
                                L13: {
                                  if (stackIn_40_0 == stackIn_40_1) {
                                    break L13;
                                  } else {
                                    if (~var5[var8] < ~var6) {
                                      param0[var7] = var6;
                                      var6 = -1;
                                      var7++;
                                      break L13;
                                    } else {
                                      break L13;
                                    }
                                  }
                                }
                                param0[var7] = var5[var8];
                                var7++;
                                var8++;
                                if (var9 == 0) {
                                  continue L10;
                                } else {
                                  break L12;
                                }
                              }
                            }
                          }
                          stackOut_50_0 = -1;
                          stackOut_50_1 = var6;
                          stackIn_51_0 = stackOut_50_0;
                          stackIn_51_1 = stackOut_50_1;
                          break L11;
                        }
                        if (stackIn_51_0 != stackIn_51_1) {
                          param0[var4] = var6;
                          break L6;
                        } else {
                          break L6;
                        }
                      }
                    }
                  }
                }
              }
              stackOut_54_0 = (int[]) param0;
              stackIn_55_0 = stackOut_54_0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L14: {
            var3 = decompiledCaughtException;
            stackOut_56_0 = (RuntimeException) var3;
            stackOut_56_1 = new StringBuilder().append("nk.EA(");
            stackIn_59_0 = stackOut_56_0;
            stackIn_59_1 = stackOut_56_1;
            stackIn_57_0 = stackOut_56_0;
            stackIn_57_1 = stackOut_56_1;
            if (param0 == null) {
              stackOut_59_0 = (RuntimeException) (Object) stackIn_59_0;
              stackOut_59_1 = (StringBuilder) (Object) stackIn_59_1;
              stackOut_59_2 = "null";
              stackIn_60_0 = stackOut_59_0;
              stackIn_60_1 = stackOut_59_1;
              stackIn_60_2 = stackOut_59_2;
              break L14;
            } else {
              stackOut_57_0 = (RuntimeException) (Object) stackIn_57_0;
              stackOut_57_1 = (StringBuilder) (Object) stackIn_57_1;
              stackOut_57_2 = "{...}";
              stackIn_60_0 = stackOut_57_0;
              stackIn_60_1 = stackOut_57_1;
              stackIn_60_2 = stackOut_57_2;
              break L14;
            }
          }
          throw ci.a((Throwable) (Object) stackIn_60_0, stackIn_60_2 + ',' + param1 + ')');
        }
        return stackIn_55_0;
    }

    final nk a(int param0, byte param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        nk var4 = null;
        int var5 = 0;
        Object stackIn_8_0 = null;
        nk stackIn_12_0 = null;
        Object stackIn_15_0 = null;
        RuntimeException decompiledCaughtException = null;
        nk stackOut_11_0 = null;
        Object stackOut_7_0 = null;
        Object stackOut_14_0 = null;
        var5 = SteelSentinels.field_G;
        try {
          L0: {
            L1: {
              if (param1 <= -29) {
                break L1;
              } else {
                int discarded$2 = ((nk) this).g(-116);
                break L1;
              }
            }
            var3_int = 0;
            L2: while (true) {
              L3: {
                if (var3_int >= ((nk) this).field_I.length) {
                  break L3;
                } else {
                  if (((nk) this).field_N != param0) {
                    L4: {
                      if (((nk) this).field_I[var3_int].field_d == null) {
                        break L4;
                      } else {
                        var4 = ((nk) this).field_I[var3_int].field_d.a(param0, (byte) -73);
                        if (var4 == null) {
                          break L4;
                        } else {
                          stackOut_11_0 = (nk) var4;
                          stackIn_12_0 = stackOut_11_0;
                          return stackIn_12_0;
                        }
                      }
                    }
                    var3_int++;
                    if (var5 == 0) {
                      continue L2;
                    } else {
                      break L3;
                    }
                  } else {
                    stackOut_7_0 = this;
                    stackIn_8_0 = stackOut_7_0;
                    return (nk) this;
                  }
                }
              }
              stackOut_14_0 = null;
              stackIn_15_0 = stackOut_14_0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw ci.a((Throwable) (Object) var3, "nk.WA(" + param0 + ',' + param1 + ')');
        }
        return (nk) (Object) stackIn_15_0;
    }

    final static void a(byte param0, gi param1) {
        RuntimeException runtimeException = null;
        int var2_int = 0;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        try {
          L0: {
            L1: {
              um.field_W = param1.c((byte) -60) << 1937029797;
              var2_int = param1.f((byte) -93);
              um.field_W = um.field_W + (var2_int >> -1301752989);
              pm.field_S = var2_int << 950096818 & 1835008;
              pm.field_S = pm.field_S + (param1.c((byte) -60) << 1680331746);
              var2_int = param1.f((byte) -59);
              pm.field_S = pm.field_S + (var2_int >> -251678554);
              uf.field_h = (63 & var2_int) << 762275983;
              uf.field_h = uf.field_h + (param1.f((byte) -65) << -426320633);
              var2_int = param1.f((byte) -77);
              lb.field_Tb = (1 & var2_int) << -583741616;
              uf.field_h = uf.field_h + (var2_int >> 157583233);
              lb.field_Tb = lb.field_Tb + param1.c((byte) -60);
              if (param0 <= -70) {
                break L1;
              } else {
                field_M = null;
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) runtimeException;
            stackOut_4_1 = new StringBuilder().append("nk.VA(").append(param0).append(',');
            stackIn_7_0 = stackOut_4_0;
            stackIn_7_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param1 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_8_0 = stackOut_5_0;
              stackIn_8_1 = stackOut_5_1;
              stackIn_8_2 = stackOut_5_2;
              break L2;
            }
          }
          throw ci.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + ')');
        }
    }

    final void a(int param0, int param1, int param2, int param3) {
        RuntimeException var5 = null;
        int var5_int = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        RuntimeException decompiledCaughtException = null;
        var8 = SteelSentinels.field_G;
        try {
          L0: {
            var5_int = ((nk) this).field_z + param0;
            ((nk) this).field_K = ((nk) this).field_z + param3 - ((nk) this).field_D;
            ((nk) this).field_y = var5_int;
            ((nk) this).field_W = param1 - (-((nk) this).field_D + -((nk) this).field_z);
            var6 = param2;
            L1: while (true) {
              L2: {
                L3: {
                  if (~var6 <= ~((nk) this).field_I.length) {
                    break L3;
                  } else {
                    if (var8 != 0) {
                      break L2;
                    } else {
                      L4: {
                        if (((nk) this).field_I[var6].field_d != null) {
                          var7 = var5_int - -((nk) this).field_I[var6].field_n;
                          ((nk) this).field_I[var6].field_d.field_S = (nk) this;
                          ((nk) this).field_I[var6].field_d.a(var7, ((nk) this).field_W + (((nk) this).field_I[var6].field_i + ((nk) this).field_I[var6].field_n), param2, ((nk) this).field_I[var6].field_n + (-((nk) this).field_I[var6].field_i + ((nk) this).field_K));
                          break L4;
                        } else {
                          break L4;
                        }
                      }
                      var6++;
                      if (var8 == 0) {
                        continue L1;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
                break L2;
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          throw ci.a((Throwable) (Object) var5, "nk.BA(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final nk a(int param0, String param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        String var4 = null;
        nk var5 = null;
        int var6 = 0;
        Object stackIn_4_0 = null;
        Object stackIn_11_0 = null;
        nk stackIn_17_0 = null;
        Object stackIn_20_0 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_3_0 = null;
        Object stackOut_10_0 = null;
        nk stackOut_16_0 = null;
        Object stackOut_19_0 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        var6 = SteelSentinels.field_G;
        try {
          L0: {
            var3_int = param0;
            L1: while (true) {
              L2: {
                L3: {
                  if (~var3_int <= ~((nk) this).field_I.length) {
                    break L3;
                  } else {
                    var4 = ((nk) this).field_I[var3_int].field_v;
                    stackOut_3_0 = null;
                    stackIn_20_0 = stackOut_3_0;
                    stackIn_4_0 = stackOut_3_0;
                    if (var6 != 0) {
                      break L2;
                    } else {
                      L4: {
                        if (stackIn_4_0 == (Object) (Object) var4) {
                          break L4;
                        } else {
                          if (!var4.equals((Object) (Object) param1)) {
                            break L4;
                          } else {
                            stackOut_10_0 = this;
                            stackIn_11_0 = stackOut_10_0;
                            return (nk) this;
                          }
                        }
                      }
                      L5: {
                        if (((nk) this).field_I[var3_int].field_d != null) {
                          var5 = ((nk) this).field_I[var3_int].field_d.a(param0, param1);
                          if (var5 == null) {
                            break L5;
                          } else {
                            stackOut_16_0 = (nk) var5;
                            stackIn_17_0 = stackOut_16_0;
                            return stackIn_17_0;
                          }
                        } else {
                          break L5;
                        }
                      }
                      var3_int++;
                      if (var6 == 0) {
                        continue L1;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
                stackOut_19_0 = null;
                stackIn_20_0 = stackOut_19_0;
                break L2;
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var3 = decompiledCaughtException;
            stackOut_21_0 = (RuntimeException) var3;
            stackOut_21_1 = new StringBuilder().append("nk.HA(").append(param0).append(',');
            stackIn_24_0 = stackOut_21_0;
            stackIn_24_1 = stackOut_21_1;
            stackIn_22_0 = stackOut_21_0;
            stackIn_22_1 = stackOut_21_1;
            if (param1 == null) {
              stackOut_24_0 = (RuntimeException) (Object) stackIn_24_0;
              stackOut_24_1 = (StringBuilder) (Object) stackIn_24_1;
              stackOut_24_2 = "null";
              stackIn_25_0 = stackOut_24_0;
              stackIn_25_1 = stackOut_24_1;
              stackIn_25_2 = stackOut_24_2;
              break L6;
            } else {
              stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
              stackOut_22_1 = (StringBuilder) (Object) stackIn_22_1;
              stackOut_22_2 = "{...}";
              stackIn_25_0 = stackOut_22_0;
              stackIn_25_1 = stackOut_22_1;
              stackIn_25_2 = stackOut_22_2;
              break L6;
            }
          }
          throw ci.a((Throwable) (Object) stackIn_25_0, stackIn_25_2 + ')');
        }
        return (nk) (Object) stackIn_20_0;
    }

    final static String a(int param0, na param1) {
        Object var2 = null;
        int var3 = 0;
        String var4 = null;
        int var5 = 0;
        String stackIn_47_0 = null;
        Object stackIn_49_0 = null;
        StringBuilder stackIn_49_1 = null;
        Object stackIn_51_0 = null;
        StringBuilder stackIn_51_1 = null;
        Object stackIn_52_0 = null;
        StringBuilder stackIn_52_1 = null;
        String stackIn_52_2 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_46_0 = null;
        Object stackOut_48_0 = null;
        StringBuilder stackOut_48_1 = null;
        Object stackOut_51_0 = null;
        StringBuilder stackOut_51_1 = null;
        String stackOut_51_2 = null;
        Object stackOut_49_0 = null;
        StringBuilder stackOut_49_1 = null;
        String stackOut_49_2 = null;
        var5 = SteelSentinels.field_G;
        try {
          L0: {
            L1: {
              var2 = null;
              if (null != param1.field_d) {
                L2: {
                  var2 = (Object) (Object) param1.field_d;
                  if (param1.field_t == 1) {
                    var2 = (Object) (Object) ("<img=0>" + (String) var2);
                    break L2;
                  } else {
                    break L2;
                  }
                }
                if (param1.field_t != 2) {
                  break L1;
                } else {
                  var2 = (Object) (Object) ("<img=1>" + (String) var2);
                  break L1;
                }
              } else {
                break L1;
              }
            }
            L3: {
              L4: {
                var3 = -107 % ((-2 - param0) / 44);
                var4 = "";
                if (param1.field_k != 2) {
                  break L4;
                } else {
                  if (!param1.field_g) {
                    L5: {
                      L6: {
                        if (0 != param1.field_w) {
                          break L6;
                        } else {
                          if (param1.field_n == 0) {
                            break L5;
                          } else {
                            break L6;
                          }
                        }
                      }
                      var4 = db.a(ak.field_e, -99, new String[1]);
                      if (var5 == 0) {
                        break L3;
                      } else {
                        break L5;
                      }
                    }
                    var4 = db.a(hh.field_d, -93, new String[1]);
                    if (var5 == 0) {
                      break L3;
                    } else {
                      break L4;
                    }
                  } else {
                    break L3;
                  }
                }
              }
              L7: {
                if (param1.field_k != 0) {
                  break L7;
                } else {
                  if (!cd.field_g) {
                    break L7;
                  } else {
                    var4 = "[" + kh.field_p + "] ";
                    break L7;
                  }
                }
              }
              L8: {
                if (param1.field_k == 1) {
                  var4 = "[" + db.a(pd.field_ab, -102, new String[1]) + "] ";
                  break L8;
                } else {
                  break L8;
                }
              }
              L9: {
                if (4 != param1.field_k) {
                  break L9;
                } else {
                  if (qd.field_a != null) {
                    var4 = "[" + qd.field_a + "] ";
                    break L9;
                  } else {
                    break L9;
                  }
                }
              }
              L10: {
                if (param1.field_k == 3) {
                  var4 = "[#" + param1.field_s + "] ";
                  break L10;
                } else {
                  break L10;
                }
              }
              if (param1.field_g) {
                break L3;
              } else {
                var4 = var4 + (String) var2 + ": ";
                break L3;
              }
            }
            stackOut_46_0 = (String) var4;
            stackIn_47_0 = stackOut_46_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L11: {
            var2 = (Object) (Object) decompiledCaughtException;
            stackOut_48_0 = var2;
            stackOut_48_1 = new StringBuilder().append("nk.CA(").append(param0).append(',');
            stackIn_51_0 = stackOut_48_0;
            stackIn_51_1 = stackOut_48_1;
            stackIn_49_0 = stackOut_48_0;
            stackIn_49_1 = stackOut_48_1;
            if (param1 == null) {
              stackOut_51_0 = stackIn_51_0;
              stackOut_51_1 = (StringBuilder) (Object) stackIn_51_1;
              stackOut_51_2 = "null";
              stackIn_52_0 = stackOut_51_0;
              stackIn_52_1 = stackOut_51_1;
              stackIn_52_2 = stackOut_51_2;
              break L11;
            } else {
              stackOut_49_0 = stackIn_49_0;
              stackOut_49_1 = (StringBuilder) (Object) stackIn_49_1;
              stackOut_49_2 = "{...}";
              stackIn_52_0 = stackOut_49_0;
              stackIn_52_1 = stackOut_49_1;
              stackIn_52_2 = stackOut_49_2;
              break L11;
            }
          }
          throw ci.a((Throwable) (Object) stackIn_52_0, stackIn_52_2 + ')');
        }
        return stackIn_47_0;
    }

    private final nk[] a(nk[] param0, int param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        nk[] var5 = null;
        int var6 = 0;
        int var7 = 0;
        nk[] stackIn_26_0 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_31_2 = null;
        RuntimeException decompiledCaughtException = null;
        nk[] stackOut_25_0 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        String stackOut_30_2 = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        String stackOut_28_2 = null;
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
            L2: {
              if (param1 == 3) {
                break L2;
              } else {
                field_B = true;
                break L2;
              }
            }
            var4 = 0;
            L3: while (true) {
              L4: {
                L5: {
                  if (~var4 <= ~((nk) this).field_I.length) {
                    break L5;
                  } else {
                    if (var7 != 0) {
                      break L4;
                    } else {
                      L6: {
                        if (((nk) this).field_I[var4].field_d == null) {
                          break L6;
                        } else {
                          var3_int = 0;
                          param0 = ((nk) this).field_I[var4].field_d.a(param0, 3);
                          break L6;
                        }
                      }
                      var4++;
                      if (var7 == 0) {
                        continue L3;
                      } else {
                        break L5;
                      }
                    }
                  }
                }
                if (var3_int == 0) {
                  break L4;
                } else {
                  if (((nk) this).field_N == -1) {
                    break L4;
                  } else {
                    var4 = param0.length;
                    var5 = param0;
                    param0 = new nk[1 + var4];
                    var6 = 0;
                    L7: while (true) {
                      L8: {
                        if (var4 <= var6) {
                          break L8;
                        } else {
                          param0[var6] = var5[var6];
                          var6++;
                          if (var7 != 0) {
                            break L4;
                          } else {
                            if (var7 == 0) {
                              continue L7;
                            } else {
                              break L8;
                            }
                          }
                        }
                      }
                      param0[var4] = (nk) this;
                      break L4;
                    }
                  }
                }
              }
              stackOut_25_0 = (nk[]) param0;
              stackIn_26_0 = stackOut_25_0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L9: {
            var3 = decompiledCaughtException;
            stackOut_27_0 = (RuntimeException) var3;
            stackOut_27_1 = new StringBuilder().append("nk.IA(");
            stackIn_30_0 = stackOut_27_0;
            stackIn_30_1 = stackOut_27_1;
            stackIn_28_0 = stackOut_27_0;
            stackIn_28_1 = stackOut_27_1;
            if (param0 == null) {
              stackOut_30_0 = (RuntimeException) (Object) stackIn_30_0;
              stackOut_30_1 = (StringBuilder) (Object) stackIn_30_1;
              stackOut_30_2 = "null";
              stackIn_31_0 = stackOut_30_0;
              stackIn_31_1 = stackOut_30_1;
              stackIn_31_2 = stackOut_30_2;
              break L9;
            } else {
              stackOut_28_0 = (RuntimeException) (Object) stackIn_28_0;
              stackOut_28_1 = (StringBuilder) (Object) stackIn_28_1;
              stackOut_28_2 = "{...}";
              stackIn_31_0 = stackOut_28_0;
              stackIn_31_1 = stackOut_28_1;
              stackIn_31_2 = stackOut_28_2;
              break L9;
            }
          }
          throw ci.a((Throwable) (Object) stackIn_31_0, stackIn_31_2 + ',' + param1 + ')');
        }
        return stackIn_26_0;
    }

    final void a(int param0, int param1, int param2) {
        RuntimeException var4 = null;
        int var4_int = 0;
        nk var4_ref = null;
        int var5 = 0;
        RuntimeException decompiledCaughtException = null;
        var5 = SteelSentinels.field_G;
        try {
          L0: {
            ((nk) this).field_y = (((nk) this).field_K + 8 * ((nk) this).field_y - -((nk) this).field_W) / 10;
            if (param1 <= -82) {
              L1: {
                L2: {
                  L3: {
                    if (ja.a(((nk) this).field_N, false) != param2) {
                      break L3;
                    } else {
                      if (((nk) this).field_C > 0) {
                        break L3;
                      } else {
                        L4: {
                          if (param0 < ((nk) this).field_K) {
                            break L4;
                          } else {
                            if (~((nk) this).field_W > ~param0) {
                              break L4;
                            } else {
                              L5: {
                                L6: {
                                  qi.field_k = true;
                                  if (sl.field_i == ic.field_P) {
                                    break L6;
                                  } else {
                                    L7: {
                                      if (~ic.field_P <= ~((nk) this).field_W) {
                                        break L7;
                                      } else {
                                        ic.field_P = ((nk) this).field_W;
                                        break L7;
                                      }
                                    }
                                    if (((nk) this).field_K < sl.field_i) {
                                      sl.field_i = ((nk) this).field_K;
                                      if (var5 == 0) {
                                        break L5;
                                      } else {
                                        break L6;
                                      }
                                    } else {
                                      break L5;
                                    }
                                  }
                                }
                                sl.field_i = ((nk) this).field_K;
                                ic.field_P = ((nk) this).field_W;
                                break L5;
                              }
                              ((nk) this).field_y = param0;
                              var4_ref = ((nk) this).field_S;
                              L8: while (true) {
                                L9: {
                                  if (var4_ref == null) {
                                    break L9;
                                  } else {
                                    if (var5 != 0) {
                                      break L2;
                                    } else {
                                      L10: {
                                        if (0 < -((nk) this).field_K + ((nk) this).field_W) {
                                          var4_ref.field_y = var4_ref.field_K + (-var4_ref.field_K + var4_ref.field_W) * (-((nk) this).field_K + param0) / (-((nk) this).field_K + ((nk) this).field_W);
                                          break L10;
                                        } else {
                                          break L10;
                                        }
                                      }
                                      var4_ref = var4_ref.field_S;
                                      if (var5 == 0) {
                                        continue L8;
                                      } else {
                                        break L9;
                                      }
                                    }
                                  }
                                }
                                if (var5 == 0) {
                                  break L2;
                                } else {
                                  break L4;
                                }
                              }
                            }
                          }
                        }
                        L11: {
                          if (qi.field_k) {
                            break L11;
                          } else {
                            L12: {
                              if (sl.field_i == ic.field_P) {
                                break L12;
                              } else {
                                L13: {
                                  if (~sl.field_i < ~((nk) this).field_K) {
                                    sl.field_i = ((nk) this).field_K;
                                    break L13;
                                  } else {
                                    break L13;
                                  }
                                }
                                if (~((nk) this).field_W >= ~ic.field_P) {
                                  break L11;
                                } else {
                                  ic.field_P = ((nk) this).field_W;
                                  if (var5 == 0) {
                                    break L11;
                                  } else {
                                    break L12;
                                  }
                                }
                              }
                            }
                            ic.field_P = ((nk) this).field_W;
                            sl.field_i = ((nk) this).field_K;
                            break L11;
                          }
                        }
                        if (((nk) this).field_S == null) {
                          break L2;
                        } else {
                          ((nk) this).field_y = ((nk) this).field_S.field_y - (((nk) this).field_S.field_K + ((nk) this).field_S.field_W) / 2 - -((((nk) this).field_W + ((nk) this).field_K) / 2);
                          if (var5 == 0) {
                            break L2;
                          } else {
                            break L3;
                          }
                        }
                      }
                    }
                  }
                  L14: {
                    if (null == ((nk) this).field_S) {
                      break L14;
                    } else {
                      ((nk) this).field_y = (((nk) this).field_W + ((nk) this).field_K) / 2 + (((nk) this).field_S.field_y - (((nk) this).field_S.field_K - -((nk) this).field_S.field_W) / 2);
                      break L14;
                    }
                  }
                  var4_int = 0;
                  L15: while (true) {
                    if (~var4_int <= ~((nk) this).field_I.length) {
                      break L2;
                    } else {
                      if (var5 != 0) {
                        break L1;
                      } else {
                        L16: {
                          if (null != ((nk) this).field_I[var4_int].field_d) {
                            ((nk) this).field_I[var4_int].field_d.a(param0, -90, param2);
                            break L16;
                          } else {
                            break L16;
                          }
                        }
                        var4_int++;
                        if (var5 == 0) {
                          continue L15;
                        } else {
                          break L2;
                        }
                      }
                    }
                  }
                }
                break L1;
              }
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw ci.a((Throwable) (Object) var4, "nk.TA(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final static boolean f(byte param0) {
        RuntimeException var1 = null;
        int stackIn_2_0 = 0;
        int stackIn_10_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_7_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_1_0 = 0;
        try {
          L0: {
            if (param0 < -14) {
              L1: {
                L2: {
                  if (ni.b(24)) {
                    break L2;
                  } else {
                    if (rd.field_b <= 0) {
                      break L2;
                    } else {
                      stackOut_7_0 = 1;
                      stackIn_10_0 = stackOut_7_0;
                      break L1;
                    }
                  }
                }
                stackOut_9_0 = 0;
                stackIn_10_0 = stackOut_9_0;
                break L1;
              }
              break L0;
            } else {
              stackOut_1_0 = 0;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw ci.a((Throwable) (Object) var1, "nk.B(" + param0 + ')');
        }
        return stackIn_10_0 != 0;
    }

    final qd a(int param0, int param1) {
        qd[] var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        qd var5 = null;
        qd var6 = null;
        int var7 = 0;
        Object stackIn_4_0 = null;
        qd stackIn_11_0 = null;
        qd stackIn_16_0 = null;
        qd stackIn_24_0 = null;
        Object stackIn_27_0 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_3_0 = null;
        qd stackOut_15_0 = null;
        qd stackOut_10_0 = null;
        qd stackOut_23_0 = null;
        Object stackOut_26_0 = null;
        var7 = SteelSentinels.field_G;
        try {
          L0: {
            var3 = ((nk) this).field_I;
            var4 = param0;
            L1: while (true) {
              L2: {
                L3: {
                  if (~var3.length >= ~var4) {
                    break L3;
                  } else {
                    var5 = var3[var4];
                    stackOut_3_0 = null;
                    stackIn_27_0 = stackOut_3_0;
                    stackIn_4_0 = stackOut_3_0;
                    if (var7 != 0) {
                      break L2;
                    } else {
                      L4: {
                        if (stackIn_4_0 == (Object) (Object) var5.field_d) {
                          break L4;
                        } else {
                          if (param1 != var5.field_d.field_Q) {
                            var6 = var5.field_d.a(param0, param1);
                            if (var6 != null) {
                              stackOut_15_0 = (qd) var6;
                              stackIn_16_0 = stackOut_15_0;
                              return stackIn_16_0;
                            } else {
                              break L4;
                            }
                          } else {
                            stackOut_10_0 = (qd) var5;
                            stackIn_11_0 = stackOut_10_0;
                            return stackIn_11_0;
                          }
                        }
                      }
                      L5: {
                        if (var5.field_q == -1) {
                          break L5;
                        } else {
                          if ((var5.field_q & param1) != 0) {
                            stackOut_23_0 = (qd) var5;
                            stackIn_24_0 = stackOut_23_0;
                            return stackIn_24_0;
                          } else {
                            break L5;
                          }
                        }
                      }
                      var4++;
                      if (var7 == 0) {
                        continue L1;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
                stackOut_26_0 = null;
                stackIn_27_0 = stackOut_26_0;
                break L2;
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          throw ci.a((Throwable) (Object) var3_ref, "nk.H(" + param0 + ',' + param1 + ')');
        }
        return (qd) (Object) stackIn_27_0;
    }

    private final void e(int param0, int param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        RuntimeException decompiledCaughtException = null;
        var4 = SteelSentinels.field_G;
        try {
          L0: {
            L1: {
              if (param1 == 5307) {
                break L1;
              } else {
                nk[] discarded$2 = this.a((nk[]) null, 24);
                break L1;
              }
            }
            L2: {
              if (~param0 == ~ja.a(((nk) this).field_N, false)) {
                L3: {
                  L4: {
                    if (0 < ((nk) this).field_C) {
                      break L4;
                    } else {
                      si.field_t = si.field_t + 1;
                      if (var4 == 0) {
                        break L3;
                      } else {
                        break L4;
                      }
                    }
                  }
                  L5: {
                    if (gl.field_p == -1) {
                      break L5;
                    } else {
                      if (((nk) this).field_C < gl.field_p) {
                        break L5;
                      } else {
                        break L3;
                      }
                    }
                  }
                  gl.field_p = ((nk) this).field_C;
                  break L3;
                }
                ed.field_f = -17 + ((nk) this).field_N;
                break L2;
              } else {
                break L2;
              }
            }
            var3_int = 0;
            L6: while (true) {
              L7: {
                L8: {
                  if (((nk) this).field_I.length <= var3_int) {
                    break L8;
                  } else {
                    if (var4 != 0) {
                      break L7;
                    } else {
                      L9: {
                        if (((nk) this).field_I[var3_int].field_d == null) {
                          break L9;
                        } else {
                          ((nk) this).field_I[var3_int].field_d.e(param0, 5307);
                          break L9;
                        }
                      }
                      var3_int++;
                      if (var4 == 0) {
                        continue L6;
                      } else {
                        break L8;
                      }
                    }
                  }
                }
                break L7;
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw ci.a((Throwable) (Object) var3, "nk.S(" + param0 + ',' + param1 + ')');
        }
    }

    final static int b(int param0, int param1, int param2) {
        RuntimeException var3 = null;
        int stackIn_5_0 = 0;
        int stackIn_8_0 = 0;
        int stackIn_10_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_4_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_7_0 = 0;
        try {
          L0: {
            L1: {
              if (param1 != 1) {
                break L1;
              } else {
                if (!ef.b(-15020, param2)) {
                  break L1;
                } else {
                  stackOut_4_0 = 29;
                  stackIn_5_0 = stackOut_4_0;
                  return stackIn_5_0;
                }
              }
            }
            if (param0 == -14487) {
              stackOut_9_0 = gi.field_s[param1];
              stackIn_10_0 = stackOut_9_0;
              break L0;
            } else {
              stackOut_7_0 = 19;
              stackIn_8_0 = stackOut_7_0;
              return stackIn_8_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw ci.a((Throwable) (Object) var3, "nk.PA(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
        return stackIn_10_0;
    }

    final qd[] a(qd[] param0, int param1, int param2) {
        RuntimeException var4 = null;
        int var4_int = 0;
        qd[] var5 = null;
        int var6 = 0;
        int var7 = 0;
        int stackIn_4_0 = 0;
        int stackIn_4_1 = 0;
        int stackIn_24_0 = 0;
        int stackIn_24_1 = 0;
        qd[] stackIn_28_0 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        String stackIn_33_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_3_1 = 0;
        int stackOut_23_0 = 0;
        int stackOut_23_1 = 0;
        qd[] stackOut_27_0 = null;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        RuntimeException stackOut_32_0 = null;
        StringBuilder stackOut_32_1 = null;
        String stackOut_32_2 = null;
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        String stackOut_30_2 = null;
        var7 = SteelSentinels.field_G;
        try {
          L0: {
            var4_int = 0;
            L1: while (true) {
              L2: {
                L3: {
                  if (var4_int >= ((nk) this).field_I.length) {
                    break L3;
                  } else {
                    stackOut_3_0 = -1;
                    stackOut_3_1 = ~(((nk) this).field_I[var4_int].field_q & param2);
                    stackIn_24_0 = stackOut_3_0;
                    stackIn_24_1 = stackOut_3_1;
                    stackIn_4_0 = stackOut_3_0;
                    stackIn_4_1 = stackOut_3_1;
                    if (var7 != 0) {
                      break L2;
                    } else {
                      L4: {
                        if (stackIn_4_0 <= stackIn_4_1) {
                          break L4;
                        } else {
                          if (((nk) this).field_I[var4_int].field_q == -1) {
                            break L4;
                          } else {
                            var5 = new qd[param0.length + 1];
                            var6 = 0;
                            L5: while (true) {
                              L6: {
                                L7: {
                                  if (var6 >= param0.length) {
                                    break L7;
                                  } else {
                                    var5[var6] = param0[var6];
                                    var6++;
                                    if (var7 != 0) {
                                      break L6;
                                    } else {
                                      if (var7 == 0) {
                                        continue L5;
                                      } else {
                                        break L7;
                                      }
                                    }
                                  }
                                }
                                var5[param0.length] = ((nk) this).field_I[var4_int];
                                break L6;
                              }
                              param0 = var5;
                              break L4;
                            }
                          }
                        }
                      }
                      L8: {
                        if (null != ((nk) this).field_I[var4_int].field_d) {
                          param0 = ((nk) this).field_I[var4_int].field_d.a(param0, -21636, param2);
                          break L8;
                        } else {
                          break L8;
                        }
                      }
                      var4_int++;
                      if (var7 == 0) {
                        continue L1;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
                stackOut_23_0 = param1;
                stackOut_23_1 = -21636;
                stackIn_24_0 = stackOut_23_0;
                stackIn_24_1 = stackOut_23_1;
                break L2;
              }
              L9: {
                if (stackIn_24_0 == stackIn_24_1) {
                  break L9;
                } else {
                  ((nk) this).field_R = null;
                  break L9;
                }
              }
              stackOut_27_0 = (qd[]) param0;
              stackIn_28_0 = stackOut_27_0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L10: {
            var4 = decompiledCaughtException;
            stackOut_29_0 = (RuntimeException) var4;
            stackOut_29_1 = new StringBuilder().append("nk.JA(");
            stackIn_32_0 = stackOut_29_0;
            stackIn_32_1 = stackOut_29_1;
            stackIn_30_0 = stackOut_29_0;
            stackIn_30_1 = stackOut_29_1;
            if (param0 == null) {
              stackOut_32_0 = (RuntimeException) (Object) stackIn_32_0;
              stackOut_32_1 = (StringBuilder) (Object) stackIn_32_1;
              stackOut_32_2 = "null";
              stackIn_33_0 = stackOut_32_0;
              stackIn_33_1 = stackOut_32_1;
              stackIn_33_2 = stackOut_32_2;
              break L10;
            } else {
              stackOut_30_0 = (RuntimeException) (Object) stackIn_30_0;
              stackOut_30_1 = (StringBuilder) (Object) stackIn_30_1;
              stackOut_30_2 = "{...}";
              stackIn_33_0 = stackOut_30_0;
              stackIn_33_1 = stackOut_30_1;
              stackIn_33_2 = stackOut_30_2;
              break L10;
            }
          }
          throw ci.a((Throwable) (Object) stackIn_33_0, stackIn_33_2 + ',' + param1 + ',' + param2 + ')');
        }
        return stackIn_28_0;
    }

    final void a(int param0, int param1, int[] param2) {
        RuntimeException var4 = null;
        int var4_int = 0;
        int var5 = 0;
        int stackIn_8_0 = 0;
        int stackIn_8_1 = 0;
        int stackIn_19_0 = 0;
        int stackIn_19_1 = 0;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        RuntimeException stackIn_35_0 = null;
        StringBuilder stackIn_35_1 = null;
        String stackIn_35_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_7_0 = 0;
        int stackOut_7_1 = 0;
        int stackOut_18_0 = 0;
        int stackOut_18_1 = 0;
        RuntimeException stackOut_31_0 = null;
        StringBuilder stackOut_31_1 = null;
        RuntimeException stackOut_34_0 = null;
        StringBuilder stackOut_34_1 = null;
        String stackOut_34_2 = null;
        RuntimeException stackOut_32_0 = null;
        StringBuilder stackOut_32_1 = null;
        String stackOut_32_2 = null;
        var5 = SteelSentinels.field_G;
        try {
          L0: {
            L1: {
              L2: {
                if (~param0 != ~ja.a(((nk) this).field_N, false)) {
                  break L2;
                } else {
                  if (((nk) this).field_C > 0) {
                    break L2;
                  } else {
                    var4_int = ((nk) this).field_K;
                    L3: while (true) {
                      if (~((nk) this).field_W >= ~var4_int) {
                        break L2;
                      } else {
                        stackOut_7_0 = ~var4_int;
                        stackOut_7_1 = -1;
                        stackIn_19_0 = stackOut_7_0;
                        stackIn_19_1 = stackOut_7_1;
                        stackIn_8_0 = stackOut_7_0;
                        stackIn_8_1 = stackOut_7_1;
                        if (var5 != 0) {
                          break L1;
                        } else {
                          L4: {
                            if (stackIn_8_0 >= stackIn_8_1) {
                              break L4;
                            } else {
                              if (var4_int < 32768) {
                                param2[var4_int >> -1388998296] = param2[var4_int >> -1388998296] + 1;
                                break L4;
                              } else {
                                break L4;
                              }
                            }
                          }
                          var4_int += 256;
                          if (var5 == 0) {
                            continue L3;
                          } else {
                            break L2;
                          }
                        }
                      }
                    }
                  }
                }
              }
              stackOut_18_0 = param1;
              stackOut_18_1 = -1;
              stackIn_19_0 = stackOut_18_0;
              stackIn_19_1 = stackOut_18_1;
              break L1;
            }
            if (stackIn_19_0 == stackIn_19_1) {
              var4_int = 0;
              L5: while (true) {
                L6: {
                  L7: {
                    if (~((nk) this).field_I.length >= ~var4_int) {
                      break L7;
                    } else {
                      if (var5 != 0) {
                        break L6;
                      } else {
                        L8: {
                          if (null == ((nk) this).field_I[var4_int].field_d) {
                            break L8;
                          } else {
                            ((nk) this).field_I[var4_int].field_d.a(param0, -1, param2);
                            break L8;
                          }
                        }
                        var4_int++;
                        if (var5 == 0) {
                          continue L5;
                        } else {
                          break L7;
                        }
                      }
                    }
                  }
                  break L6;
                }
                break L0;
              }
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L9: {
            var4 = decompiledCaughtException;
            stackOut_31_0 = (RuntimeException) var4;
            stackOut_31_1 = new StringBuilder().append("nk.N(").append(param0).append(',').append(param1).append(',');
            stackIn_34_0 = stackOut_31_0;
            stackIn_34_1 = stackOut_31_1;
            stackIn_32_0 = stackOut_31_0;
            stackIn_32_1 = stackOut_31_1;
            if (param2 == null) {
              stackOut_34_0 = (RuntimeException) (Object) stackIn_34_0;
              stackOut_34_1 = (StringBuilder) (Object) stackIn_34_1;
              stackOut_34_2 = "null";
              stackIn_35_0 = stackOut_34_0;
              stackIn_35_1 = stackOut_34_1;
              stackIn_35_2 = stackOut_34_2;
              break L9;
            } else {
              stackOut_32_0 = (RuntimeException) (Object) stackIn_32_0;
              stackOut_32_1 = (StringBuilder) (Object) stackIn_32_1;
              stackOut_32_2 = "{...}";
              stackIn_35_0 = stackOut_32_0;
              stackIn_35_1 = stackOut_32_1;
              stackIn_35_2 = stackOut_32_2;
              break L9;
            }
          }
          throw ci.a((Throwable) (Object) stackIn_35_0, stackIn_35_2 + ')');
        }
    }

    nk(nk param0) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        try {
          L0: {
            this.a(-353384856, true, param0);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            runtimeException = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) runtimeException;
            stackOut_3_1 = new StringBuilder().append("nk.<init>(");
            stackIn_6_0 = stackOut_3_0;
            stackIn_6_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param0 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L1;
            } else {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "{...}";
              stackIn_7_0 = stackOut_4_0;
              stackIn_7_1 = stackOut_4_1;
              stackIn_7_2 = stackOut_4_2;
              break L1;
            }
          }
          throw ci.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + ')');
        }
    }

    nk(nk param0, boolean param1) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        try {
          L0: {
            this.a(-353384856, param1, param0);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            runtimeException = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) runtimeException;
            stackOut_3_1 = new StringBuilder().append("nk.<init>(");
            stackIn_6_0 = stackOut_3_0;
            stackIn_6_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param0 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L1;
            } else {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "{...}";
              stackIn_7_0 = stackOut_4_0;
              stackIn_7_1 = stackOut_4_1;
              stackIn_7_2 = stackOut_4_2;
              break L1;
            }
          }
          throw ci.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + ',' + param1 + ')');
        }
    }

    nk(gk param0, int param1, int param2, int param3, int param4, int param5, qd[] param6) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        try {
          L0: {
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
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            runtimeException = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) runtimeException;
            stackOut_3_1 = new StringBuilder().append("nk.<init>(");
            stackIn_6_0 = stackOut_3_0;
            stackIn_6_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param0 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L1;
            } else {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "{...}";
              stackIn_7_0 = stackOut_4_0;
              stackIn_7_1 = stackOut_4_1;
              stackIn_7_2 = stackOut_4_2;
              break L1;
            }
          }
          L2: {
            stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
            stackOut_7_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',');
            stackIn_10_0 = stackOut_7_0;
            stackIn_10_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param6 == null) {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L2;
            } else {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "{...}";
              stackIn_11_0 = stackOut_8_0;
              stackIn_11_1 = stackOut_8_1;
              stackIn_11_2 = stackOut_8_2;
              break L2;
            }
          }
          throw ci.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + ')');
        }
    }

    nk(gk param0, int param1, int param2, qd[] param3) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        try {
          L0: {
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
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            runtimeException = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) runtimeException;
            stackOut_3_1 = new StringBuilder().append("nk.<init>(");
            stackIn_6_0 = stackOut_3_0;
            stackIn_6_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param0 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L1;
            } else {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "{...}";
              stackIn_7_0 = stackOut_4_0;
              stackIn_7_1 = stackOut_4_1;
              stackIn_7_2 = stackOut_4_2;
              break L1;
            }
          }
          L2: {
            stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
            stackOut_7_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_10_0 = stackOut_7_0;
            stackIn_10_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param3 == null) {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L2;
            } else {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "{...}";
              stackIn_11_0 = stackOut_8_0;
              stackIn_11_1 = stackOut_8_1;
              stackIn_11_2 = stackOut_8_2;
              break L2;
            }
          }
          throw ci.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        int var0 = 0;
        int var1 = 0;
        int var2 = 0;
        int var3 = 0;
        long var4 = 0L;
        long var6 = 0L;
        int stackIn_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_5_0 = 0;
        field_F = new dj(3);
        field_M = new int[98304];
        var0 = 92682;
        L0: while (true) {
          if (var0 < 46341) {
            field_O = new fm(9, 0, 4, 1);
            field_P = "Accept <%0> into this game";
            field_J = 0;
            field_X = new String[]{"Waiting for text", "Warte auf Text", "En attente du texte", "Aguardando textos", "Op tekst wachten", "Esperando a texto"};
            return;
          } else {
            L1: {
              var4 = (long)(-1 + (var0 << -263398335));
              var6 = (long)(1 + (var0 << 2007938337));
              var3 = (int)(-32768L + (var6 * var6 >> -633802286));
              var2 = (int)(-32768L + (var4 * var4 >> 478628306));
              if (~field_M.length < ~var3) {
                break L1;
              } else {
                var3 = field_M.length + -1;
                break L1;
              }
            }
            L2: {
              if (0 > var2) {
                stackOut_7_0 = 0;
                stackIn_8_0 = stackOut_7_0;
                break L2;
              } else {
                stackOut_5_0 = var2;
                stackIn_8_0 = stackOut_5_0;
                break L2;
              }
            }
            var1 = stackIn_8_0;
            L3: while (true) {
              if (var1 > var3) {
                var0--;
                continue L0;
              } else {
                field_M[var1] = var0;
                var1++;
                continue L3;
              }
            }
          }
        }
    }
}
