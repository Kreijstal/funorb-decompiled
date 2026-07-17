/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class np extends ka {
    private float[] field_y;
    private byte field_Z;
    private fd[] field_f;
    private short field_U;
    private short field_M;
    private tj field_g;
    private int field_L;
    private int[] field_K;
    private int field_N;
    private short[] field_X;
    private tj field_ab;
    private aba field_i;
    private va field_Q;
    private short[] field_z;
    private short[] field_cb;
    private sca field_jb;
    private boolean field_l;
    private short field_T;
    private tj field_F;
    private boolean field_s;
    private int[] field_p;
    private int field_G;
    private int field_bb;
    private short field_B;
    private short[] field_I;
    private int[][] field_j;
    private byte[] field_O;
    private short field_eb;
    private short field_v;
    static cn field_m;
    private short[] field_fb;
    private short field_S;
    private short[] field_hb;
    private int[][] field_C;
    private ava[] field_D;
    private byte[] field_o;
    private short[] field_H;
    private int field_u;
    static byte[] field_J;
    private short field_k;
    private short field_h;
    private tj field_kb;
    private int field_W;
    private float[] field_n;
    private short[] field_q;
    private boolean field_gb;
    private cka field_R;
    private pm[] field_r;
    private int field_lb;
    private afa field_w;
    private int field_ib;
    private int[][] field_d;
    private int[] field_e;
    private short[] field_E;
    private rga[] field_t;
    static java.awt.Image field_x;
    private int[] field_P;
    static String field_V;
    private short[] field_Y;
    private int[] field_A;
    private short[] field_db;

    private final void c(int param0) {
        RuntimeException var2 = null;
        int var2_int = 0;
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
        RuntimeException decompiledCaughtException = null;
        var15 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            var2_int = 32767;
            var3 = 32767;
            var4 = 32767;
            var5 = -32768;
            var6 = -32768;
            var7 = -32768;
            var8 = 0;
            var9 = 0;
            var10 = 0;
            L1: while (true) {
              if (~((np) this).field_lb >= ~var10) {
                if (2709 == 2709) {
                  ((np) this).field_k = (short)var4;
                  ((np) this).field_T = (short)var5;
                  ((np) this).field_S = (short)var7;
                  ((np) this).field_eb = (short)var3;
                  ((np) this).field_U = (short)var2_int;
                  ((np) this).field_v = (short)var6;
                  ((np) this).field_M = (short)(int)(0.99 + Math.sqrt((double)var8));
                  ((np) this).field_l = true;
                  break L0;
                } else {
                  return;
                }
              } else {
                L2: {
                  var11 = ((np) this).field_P[var10];
                  var12 = ((np) this).field_K[var10];
                  if (var2_int > var11) {
                    var2_int = var11;
                    break L2;
                  } else {
                    break L2;
                  }
                }
                L3: {
                  if (var3 > var12) {
                    var3 = var12;
                    break L3;
                  } else {
                    break L3;
                  }
                }
                L4: {
                  if (~var6 <= ~var12) {
                    break L4;
                  } else {
                    var6 = var12;
                    break L4;
                  }
                }
                L5: {
                  var13 = ((np) this).field_A[var10];
                  if (var11 <= var5) {
                    break L5;
                  } else {
                    var5 = var11;
                    break L5;
                  }
                }
                L6: {
                  if (var4 > var13) {
                    var4 = var13;
                    break L6;
                  } else {
                    break L6;
                  }
                }
                L7: {
                  if (~var7 <= ~var13) {
                    break L7;
                  } else {
                    var7 = var13;
                    break L7;
                  }
                }
                L8: {
                  var14 = var13 * var13 + var11 * var11;
                  if (var8 < var14) {
                    var8 = var14;
                    break L8;
                  } else {
                    break L8;
                  }
                }
                L9: {
                  var14 = var12 * var12 + var11 * var11 + var13 * var13;
                  if (~var14 < ~var9) {
                    var9 = var14;
                    break L9;
                  } else {
                    break L9;
                  }
                }
                var10++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw tba.a((Throwable) (Object) var2, "np.S(" + 2709 + 41);
        }
    }

    final void H(int param0, int param1, int param2) {
        RuntimeException runtimeException = null;
        int var4_int = 0;
        int var5 = 0;
        RuntimeException decompiledCaughtException = null;
        var5 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            var4_int = 0;
            L1: while (true) {
              if (((np) this).field_lb <= var4_int) {
                L2: {
                  ((np) this).field_l = false;
                  if (((np) this).field_g == null) {
                    break L2;
                  } else {
                    ((np) this).field_g.field_d = null;
                    break L2;
                  }
                }
                break L0;
              } else {
                L3: {
                  if (0 == param0) {
                    break L3;
                  } else {
                    ((np) this).field_P[var4_int] = ((np) this).field_P[var4_int] + param0;
                    break L3;
                  }
                }
                L4: {
                  if (0 != param1) {
                    ((np) this).field_K[var4_int] = ((np) this).field_K[var4_int] + param1;
                    break L4;
                  } else {
                    break L4;
                  }
                }
                L5: {
                  if (param2 == 0) {
                    break L5;
                  } else {
                    ((np) this).field_A[var4_int] = ((np) this).field_A[var4_int] + param2;
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
          runtimeException = decompiledCaughtException;
          throw tba.a((Throwable) (Object) runtimeException, "np.H(" + param0 + 44 + param1 + 44 + param2 + 41);
        }
    }

    private final int a(int param0, int param1, byte param2, short param3, int param4) {
        RuntimeException var6 = null;
        int var6_int = 0;
        dw var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int stackIn_31_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_30_0 = 0;
        var13 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              var6_int = cla.field_m[qp.c(param1, param4, 117)];
              if (param3 == -1) {
                break L1;
              } else {
                L2: {
                  var7 = ((np) this).field_R.field_c.a((byte) -79, 65535 & param3);
                  var8 = 255 & var7.field_c;
                  if (var8 == 0) {
                    break L2;
                  } else {
                    L3: {
                      if (param4 >= 0) {
                        if (param4 > 127) {
                          var9 = 16777215;
                          break L3;
                        } else {
                          var9 = param4 * 131586;
                          break L3;
                        }
                      } else {
                        var9 = 0;
                        break L3;
                      }
                    }
                    if (var8 == 256) {
                      var6_int = var9;
                      break L2;
                    } else {
                      var10 = var8;
                      var11 = 256 - var8;
                      var6_int = (-16711936 & (16711935 & var9) * var10 - -((16711935 & var6_int) * var11)) - -(16711680 & var11 * (65280 & var6_int) + (65280 & var9) * var10) >> 8;
                      break L2;
                    }
                  }
                }
                var9 = 255 & var7.field_i;
                if (0 != var9) {
                  L4: {
                    var9 += 256;
                    var10 = (var6_int >> 16 & 255) * var9;
                    if (var10 <= 65535) {
                      break L4;
                    } else {
                      var10 = 65535;
                      break L4;
                    }
                  }
                  L5: {
                    var11 = var9 * ((65280 & var6_int) >> 8);
                    if (var11 > 65535) {
                      var11 = 65535;
                      break L5;
                    } else {
                      break L5;
                    }
                  }
                  L6: {
                    var12 = var9 * (var6_int & 255);
                    if (var12 <= 65535) {
                      break L6;
                    } else {
                      var12 = 65535;
                      break L6;
                    }
                  }
                  var6_int = (var12 >> 8) + ((16711843 & var10 << 8) + (65280 & var11));
                  break L1;
                } else {
                  break L1;
                }
              }
            }
            stackOut_30_0 = (var6_int << 8) - -255 - (param2 & 255);
            stackIn_31_0 = stackOut_30_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          throw tba.a((Throwable) (Object) var6, "np.K(" + -2117016184 + 44 + param1 + 44 + param2 + 44 + param3 + 44 + param4 + 41);
        }
        return stackIn_31_0;
    }

    final void FA(int param0) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        RuntimeException decompiledCaughtException = null;
        var6 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            var2_int = qu.field_b[param0];
            var3 = qu.field_d[param0];
            var4 = 0;
            L1: while (true) {
              if (~((np) this).field_lb >= ~var4) {
                L2: {
                  ((np) this).field_l = false;
                  if (((np) this).field_g == null) {
                    break L2;
                  } else {
                    ((np) this).field_g.field_d = null;
                    break L2;
                  }
                }
                break L0;
              } else {
                var5 = ((np) this).field_K[var4] * var3 - var2_int * ((np) this).field_A[var4] >> 14;
                ((np) this).field_A[var4] = var3 * ((np) this).field_A[var4] + var2_int * ((np) this).field_K[var4] >> 14;
                ((np) this).field_K[var4] = var5;
                var4++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw tba.a((Throwable) (Object) var2, "np.FA(" + param0 + 41);
        }
    }

    private final short a(long param0, int param1, int param2, int param3, byte param4, int param5, int param6, float param7, oc param8, float param9) {
        RuntimeException var12 = null;
        int var12_int = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        short stackIn_14_0 = 0;
        short stackIn_20_0 = 0;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
        short stackOut_13_0 = 0;
        short stackOut_19_0 = 0;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        var17 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            var12_int = ((np) this).field_e[param5];
            var13 = ((np) this).field_e[1 + param5];
            var14 = 0;
            var15 = var12_int;
            L1: while (true) {
              L2: {
                if (var15 >= var13) {
                  break L2;
                } else {
                  var16 = ((np) this).field_q[var15];
                  if (var16 == 0) {
                    var14 = var15;
                    break L2;
                  } else {
                    if (~qka.field_m[var15] == ~param0) {
                      stackOut_13_0 = (short)(-1 + var16);
                      stackIn_14_0 = stackOut_13_0;
                      return stackIn_14_0;
                    } else {
                      var15++;
                      continue L1;
                    }
                  }
                }
              }
              L3: {
                ((np) this).field_q[var14] = (short)(1 + ((np) this).field_L);
                qka.field_m[var14] = param0;
                ((np) this).field_E[((np) this).field_L] = (short)param6;
                if (-40 == -40) {
                  break L3;
                } else {
                  ((np) this).field_s = true;
                  break L3;
                }
              }
              ((np) this).field_Y[((np) this).field_L] = (short)param2;
              ((np) this).field_cb[((np) this).field_L] = (short)param1;
              ((np) this).field_O[((np) this).field_L] = (byte)param3;
              ((np) this).field_n[((np) this).field_L] = param9;
              ((np) this).field_y[((np) this).field_L] = param7;
              int fieldTemp$1 = ((np) this).field_L;
              ((np) this).field_L = ((np) this).field_L + 1;
              stackOut_19_0 = (short)fieldTemp$1;
              stackIn_20_0 = stackOut_19_0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var12 = decompiledCaughtException;
            stackOut_21_0 = (RuntimeException) var12;
            stackOut_21_1 = new StringBuilder().append("np.G(").append(param0).append(44).append(param1).append(44).append(param2).append(44).append(param3).append(44).append(-40).append(44).append(param5).append(44).append(param6).append(44).append(param7).append(44);
            stackIn_24_0 = stackOut_21_0;
            stackIn_24_1 = stackOut_21_1;
            stackIn_22_0 = stackOut_21_0;
            stackIn_22_1 = stackOut_21_1;
            if (param8 == null) {
              stackOut_24_0 = (RuntimeException) (Object) stackIn_24_0;
              stackOut_24_1 = (StringBuilder) (Object) stackIn_24_1;
              stackOut_24_2 = "null";
              stackIn_25_0 = stackOut_24_0;
              stackIn_25_1 = stackOut_24_1;
              stackIn_25_2 = stackOut_24_2;
              break L4;
            } else {
              stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
              stackOut_22_1 = (StringBuilder) (Object) stackIn_22_1;
              stackOut_22_2 = "{...}";
              stackIn_25_0 = stackOut_22_0;
              stackIn_25_1 = stackOut_22_1;
              stackIn_25_2 = stackOut_22_2;
              break L4;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_25_0, stackIn_25_2 + 44 + param9 + 41);
        }
        return stackIn_20_0;
    }

    private final ka a(boolean param0, int param1, boolean param2, int param3, np param4, np param5) {
        int var7_int = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        aba var11_ref_aba = null;
        int var12 = 0;
        int var13 = 0;
        L0: {
          var13 = TombRacer.field_G ? 1 : 0;
          param5.field_h = ((np) this).field_h;
          if ((param1 & 256) == 0) {
            param5.field_s = ((np) this).field_s;
            break L0;
          } else {
            param5.field_s = true;
            break L0;
          }
        }
        param5.field_N = ((np) this).field_N;
        param5.field_bb = param1;
        param5.field_B = ((np) this).field_B;
        param5.field_Z = (byte) 0;
        param5.field_u = ((np) this).field_u;
        param5.field_G = ((np) this).field_G;
        param5.field_W = ((np) this).field_W;
        param5.field_ib = ((np) this).field_ib;
        param5.field_L = ((np) this).field_L;
        param5.field_lb = ((np) this).field_lb;
        var7_int = jj.a(((np) this).field_u, param1, -32842) ? 1 : 0;
        var8 = mg.a((byte) -53, ((np) this).field_u, param1) ? 1 : 0;
        var9 = gha.a(((np) this).field_u, param1, 101) ? 1 : 0;
        var10 = var8 | var7_int | var9;
        L1: {
          if (var10 != 0) {
            L2: {
              if (var7_int != 0) {
                L3: {
                  if (param4.field_P == null) {
                    break L3;
                  } else {
                    if (((np) this).field_N > param4.field_P.length) {
                      break L3;
                    } else {
                      param5.field_P = param4.field_P;
                      break L2;
                    }
                  }
                }
                param4.field_P = new int[((np) this).field_N];
                param5.field_P = new int[((np) this).field_N];
                break L2;
              } else {
                param5.field_P = ((np) this).field_P;
                break L2;
              }
            }
            L4: {
              if (var8 != 0) {
                L5: {
                  if (null == param4.field_K) {
                    break L5;
                  } else {
                    if (((np) this).field_N > param4.field_K.length) {
                      break L5;
                    } else {
                      param5.field_K = param4.field_K;
                      break L4;
                    }
                  }
                }
                param4.field_K = new int[((np) this).field_N];
                param5.field_K = new int[((np) this).field_N];
                break L4;
              } else {
                param5.field_K = ((np) this).field_K;
                break L4;
              }
            }
            L6: {
              if (var9 == 0) {
                param5.field_A = ((np) this).field_A;
                break L6;
              } else {
                L7: {
                  if (param4.field_A == null) {
                    break L7;
                  } else {
                    if (param4.field_A.length >= ((np) this).field_N) {
                      param5.field_A = param4.field_A;
                      break L6;
                    } else {
                      break L7;
                    }
                  }
                }
                param4.field_A = new int[((np) this).field_N];
                param5.field_A = new int[((np) this).field_N];
                break L6;
              }
            }
            var11 = 0;
            L8: while (true) {
              if (var11 >= ((np) this).field_N) {
                break L1;
              } else {
                L9: {
                  if (var7_int != 0) {
                    param5.field_P[var11] = ((np) this).field_P[var11];
                    break L9;
                  } else {
                    break L9;
                  }
                }
                L10: {
                  if (var8 != 0) {
                    param5.field_K[var11] = ((np) this).field_K[var11];
                    break L10;
                  } else {
                    break L10;
                  }
                }
                L11: {
                  if (var9 != 0) {
                    param5.field_A[var11] = ((np) this).field_A[var11];
                    break L11;
                  } else {
                    break L11;
                  }
                }
                var11++;
                continue L8;
              }
            }
          } else {
            param5.field_A = ((np) this).field_A;
            param5.field_K = ((np) this).field_K;
            param5.field_P = ((np) this).field_P;
            break L1;
          }
        }
        L12: {
          if (so.a(param1, (byte) -106, ((np) this).field_u)) {
            L13: {
              if (!param2) {
                break L13;
              } else {
                param5.field_Z = (byte)(param5.field_Z | 1);
                break L13;
              }
            }
            param5.field_g = param4.field_g;
            param5.field_g.field_d = ((np) this).field_g.field_d;
            param5.field_g.field_g = ((np) this).field_g.field_g;
            break L12;
          } else {
            if (hha.a(((np) this).field_u, 0, param1)) {
              param5.field_g = ((np) this).field_g;
              break L12;
            } else {
              param5.field_g = null;
              break L12;
            }
          }
        }
        L14: {
          if (!o.a(-1, ((np) this).field_u, param1)) {
            param5.field_X = ((np) this).field_X;
            break L14;
          } else {
            L15: {
              L16: {
                if (null == param4.field_X) {
                  break L16;
                } else {
                  if (((np) this).field_W <= param4.field_X.length) {
                    param5.field_X = param4.field_X;
                    break L15;
                  } else {
                    break L16;
                  }
                }
              }
              param4.field_X = new short[((np) this).field_W];
              param5.field_X = new short[((np) this).field_W];
              break L15;
            }
            var11 = 0;
            L17: while (true) {
              if (~var11 <= ~((np) this).field_W) {
                break L14;
              } else {
                param5.field_X[var11] = ((np) this).field_X[var11];
                var11++;
                continue L17;
              }
            }
          }
        }
        L18: {
          if (mpa.a(false, ((np) this).field_u, param1)) {
            L19: {
              L20: {
                if (null == param4.field_o) {
                  break L20;
                } else {
                  if (~param4.field_o.length <= ~((np) this).field_W) {
                    param5.field_o = param4.field_o;
                    break L19;
                  } else {
                    break L20;
                  }
                }
              }
              param4.field_o = new byte[((np) this).field_W];
              param5.field_o = new byte[((np) this).field_W];
              break L19;
            }
            var11 = 0;
            L21: while (true) {
              if (~((np) this).field_W >= ~var11) {
                break L18;
              } else {
                param5.field_o[var11] = ((np) this).field_o[var11];
                var11++;
                continue L21;
              }
            }
          } else {
            param5.field_o = ((np) this).field_o;
            break L18;
          }
        }
        L22: {
          int discarded$2 = 13650;
          if (!vua.e(param1, ((np) this).field_u)) {
            if (!we.b(param1, ((np) this).field_u, 2048)) {
              param5.field_kb = null;
              break L22;
            } else {
              param5.field_kb = ((np) this).field_kb;
              break L22;
            }
          } else {
            L23: {
              if (!param2) {
                break L23;
              } else {
                param5.field_Z = (byte)(param5.field_Z | 2);
                break L23;
              }
            }
            param5.field_kb = param4.field_kb;
            param5.field_kb.field_d = ((np) this).field_kb.field_d;
            param5.field_kb.field_g = ((np) this).field_kb.field_g;
            break L22;
          }
        }
        L24: {
          if (cra.a(((np) this).field_u, -17, param1)) {
            L25: {
              L26: {
                if (param4.field_E == null) {
                  break L26;
                } else {
                  if (param4.field_E.length < ((np) this).field_L) {
                    break L26;
                  } else {
                    param5.field_Y = param4.field_Y;
                    param5.field_E = param4.field_E;
                    param5.field_cb = param4.field_cb;
                    break L25;
                  }
                }
              }
              var11 = ((np) this).field_L;
              param4.field_Y = new short[var11];
              param5.field_Y = new short[var11];
              param4.field_E = new short[var11];
              param5.field_E = new short[var11];
              param4.field_cb = new short[var11];
              param5.field_cb = new short[var11];
              break L25;
            }
            L27: {
              if (null != ((np) this).field_i) {
                L28: {
                  if (null != param4.field_i) {
                    break L28;
                  } else {
                    param4.field_i = new aba();
                    break L28;
                  }
                }
                L29: {
                  L30: {
                    aba fieldTemp$3 = param4.field_i;
                    param5.field_i = param4.field_i;
                    var11_ref_aba = fieldTemp$3;
                    if (var11_ref_aba.field_d == null) {
                      break L30;
                    } else {
                      if (~((np) this).field_L < ~var11_ref_aba.field_d.length) {
                        break L30;
                      } else {
                        break L29;
                      }
                    }
                  }
                  var12 = ((np) this).field_L;
                  var11_ref_aba.field_f = new short[var12];
                  var11_ref_aba.field_e = new byte[var12];
                  var11_ref_aba.field_d = new short[var12];
                  var11_ref_aba.field_b = new short[var12];
                  break L29;
                }
                var12 = 0;
                L31: while (true) {
                  if (~((np) this).field_L >= ~var12) {
                    break L27;
                  } else {
                    param5.field_E[var12] = ((np) this).field_E[var12];
                    param5.field_Y[var12] = ((np) this).field_Y[var12];
                    param5.field_cb[var12] = ((np) this).field_cb[var12];
                    var11_ref_aba.field_d[var12] = ((np) this).field_i.field_d[var12];
                    var11_ref_aba.field_b[var12] = ((np) this).field_i.field_b[var12];
                    var11_ref_aba.field_f[var12] = ((np) this).field_i.field_f[var12];
                    var11_ref_aba.field_e[var12] = ((np) this).field_i.field_e[var12];
                    var12++;
                    continue L31;
                  }
                }
              } else {
                var11 = 0;
                L32: while (true) {
                  if (~var11 <= ~((np) this).field_L) {
                    break L27;
                  } else {
                    param5.field_E[var11] = ((np) this).field_E[var11];
                    param5.field_Y[var11] = ((np) this).field_Y[var11];
                    param5.field_cb[var11] = ((np) this).field_cb[var11];
                    var11++;
                    continue L32;
                  }
                }
              }
            }
            param5.field_O = ((np) this).field_O;
            break L24;
          } else {
            param5.field_O = ((np) this).field_O;
            param5.field_i = ((np) this).field_i;
            param5.field_Y = ((np) this).field_Y;
            param5.field_cb = ((np) this).field_cb;
            param5.field_E = ((np) this).field_E;
            break L24;
          }
        }
        L33: {
          if (ooa.a(((np) this).field_u, param1, -100)) {
            L34: {
              param5.field_F = param4.field_F;
              if (!param2) {
                break L34;
              } else {
                param5.field_Z = (byte)(param5.field_Z | 4);
                break L34;
              }
            }
            param5.field_F.field_g = ((np) this).field_F.field_g;
            param5.field_F.field_d = ((np) this).field_F.field_d;
            break L33;
          } else {
            if (!kb.a(((np) this).field_u, param1, (byte) 17)) {
              param5.field_F = null;
              break L33;
            } else {
              param5.field_F = ((np) this).field_F;
              break L33;
            }
          }
        }
        L35: {
          if (hh.a(param1, (byte) 5, ((np) this).field_u)) {
            L36: {
              L37: {
                if (null == param4.field_n) {
                  break L37;
                } else {
                  if (~param4.field_n.length <= ~((np) this).field_W) {
                    param5.field_n = param4.field_n;
                    param5.field_y = param4.field_y;
                    break L36;
                  } else {
                    break L37;
                  }
                }
              }
              var11 = ((np) this).field_L;
              param4.field_y = new float[var11];
              param5.field_y = new float[var11];
              param4.field_n = new float[var11];
              param5.field_n = new float[var11];
              break L36;
            }
            var11 = 0;
            L38: while (true) {
              if (((np) this).field_L <= var11) {
                break L35;
              } else {
                param5.field_n[var11] = ((np) this).field_n[var11];
                param5.field_y[var11] = ((np) this).field_y[var11];
                var11++;
                continue L38;
              }
            }
          } else {
            param5.field_n = ((np) this).field_n;
            param5.field_y = ((np) this).field_y;
            break L35;
          }
        }
        L39: {
          if (upa.a(((np) this).field_u, 0, param1)) {
            param5.field_ab = param4.field_ab;
            L40: {
              if (!param2) {
                break L40;
              } else {
                param5.field_Z = (byte)(param5.field_Z | 8);
                break L40;
              }
            }
            param5.field_ab.field_g = ((np) this).field_ab.field_g;
            param5.field_ab.field_d = ((np) this).field_ab.field_d;
            break L39;
          } else {
            if (wu.a(-17, ((np) this).field_u, param1)) {
              param5.field_ab = ((np) this).field_ab;
              break L39;
            } else {
              param5.field_ab = null;
              break L39;
            }
          }
        }
        L41: {
          if (!qp.a(param1, (byte) -71, ((np) this).field_u)) {
            param5.field_hb = ((np) this).field_hb;
            param5.field_z = ((np) this).field_z;
            param5.field_H = ((np) this).field_H;
            break L41;
          } else {
            L42: {
              L43: {
                if (param4.field_H == null) {
                  break L43;
                } else {
                  if (~param4.field_H.length > ~((np) this).field_W) {
                    break L43;
                  } else {
                    param5.field_z = param4.field_z;
                    param5.field_H = param4.field_H;
                    param5.field_hb = param4.field_hb;
                    break L42;
                  }
                }
              }
              var11 = ((np) this).field_W;
              param4.field_hb = new short[var11];
              param5.field_hb = new short[var11];
              param4.field_H = new short[var11];
              param5.field_H = new short[var11];
              param4.field_z = new short[var11];
              param5.field_z = new short[var11];
              break L42;
            }
            var11 = 0;
            L44: while (true) {
              if (~var11 <= ~((np) this).field_W) {
                break L41;
              } else {
                param5.field_H[var11] = ((np) this).field_H[var11];
                param5.field_z[var11] = ((np) this).field_z[var11];
                param5.field_hb[var11] = ((np) this).field_hb[var11];
                var11++;
                continue L44;
              }
            }
          }
        }
        L45: {
          if (tia.b(((np) this).field_u, -23403, param1)) {
            L46: {
              if (!param2) {
                break L46;
              } else {
                param5.field_Z = (byte)(param5.field_Z | 16);
                break L46;
              }
            }
            param5.field_w = param4.field_w;
            param5.field_w.field_a = ((np) this).field_w.field_a;
            break L45;
          } else {
            if (mm.a(-123, param1, ((np) this).field_u)) {
              param5.field_w = ((np) this).field_w;
              break L45;
            } else {
              param5.field_w = null;
              break L45;
            }
          }
        }
        L47: {
          if (aca.a(param1, 32768, ((np) this).field_u)) {
            L48: {
              L49: {
                if (null == param4.field_I) {
                  break L49;
                } else {
                  if (~param4.field_I.length <= ~((np) this).field_W) {
                    param5.field_I = param4.field_I;
                    break L48;
                  } else {
                    break L49;
                  }
                }
              }
              var11 = ((np) this).field_W;
              param4.field_I = new short[var11];
              param5.field_I = new short[var11];
              break L48;
            }
            var11 = 0;
            L50: while (true) {
              if (~var11 <= ~((np) this).field_W) {
                break L47;
              } else {
                param5.field_I[var11] = ((np) this).field_I[var11];
                var11++;
                continue L50;
              }
            }
          } else {
            param5.field_I = ((np) this).field_I;
            break L47;
          }
        }
        L51: {
          if (qba.a(((np) this).field_u, 480, param1)) {
            L52: {
              if (null == param4.field_f) {
                break L52;
              } else {
                if (~((np) this).field_G < ~param4.field_f.length) {
                  break L52;
                } else {
                  param5.field_f = param4.field_f;
                  var11 = 0;
                  L53: while (true) {
                    if (~((np) this).field_G >= ~var11) {
                      break L51;
                    } else {
                      param5.field_f[var11].a(167, ((np) this).field_f[var11]);
                      var11++;
                      continue L53;
                    }
                  }
                }
              }
            }
            var11 = ((np) this).field_G;
            param4.field_f = new fd[var11];
            param5.field_f = new fd[var11];
            var12 = 0;
            L54: while (true) {
              if (~((np) this).field_G >= ~var12) {
                break L51;
              } else {
                param5.field_f[var12] = ((np) this).field_f[var12].a((byte) 78);
                var12++;
                continue L54;
              }
            }
          } else {
            param5.field_f = ((np) this).field_f;
            break L51;
          }
        }
        L55: {
          param5.field_j = ((np) this).field_j;
          param5.field_q = ((np) this).field_q;
          if (((np) this).field_l) {
            param5.field_v = ((np) this).field_v;
            param5.field_S = ((np) this).field_S;
            param5.field_l = true;
            param5.field_k = ((np) this).field_k;
            param5.field_U = ((np) this).field_U;
            param5.field_eb = ((np) this).field_eb;
            param5.field_M = ((np) this).field_M;
            param5.field_T = ((np) this).field_T;
            break L55;
          } else {
            param5.field_l = false;
            break L55;
          }
        }
        param5.field_t = ((np) this).field_t;
        param5.field_D = ((np) this).field_D;
        param5.field_r = ((np) this).field_r;
        param5.field_db = ((np) this).field_db;
        param5.field_C = ((np) this).field_C;
        param5.field_e = ((np) this).field_e;
        param5.field_p = ((np) this).field_p;
        param5.field_fb = ((np) this).field_fb;
        param5.field_d = ((np) this).field_d;
        return (ka) (Object) param5;
    }

    private final void a(byte param0, boolean param1) {
        RuntimeException var3 = null;
        qf var3_ref = null;
        int var4 = 0;
        int var5 = 0;
        RuntimeException decompiledCaughtException = null;
        var5 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              if (~(((np) this).field_ib * 6) < ~((np) this).field_R.field_cb.field_g.length) {
                ((np) this).field_R.field_cb = new qf((((np) this).field_ib - -100) * 6);
                break L1;
              } else {
                ((np) this).field_R.field_cb.field_h = 0;
                break L1;
              }
            }
            L2: {
              var3_ref = ((np) this).field_R.field_cb;
              if (((np) this).field_R.field_O) {
                var4 = 0;
                L3: while (true) {
                  if (((np) this).field_ib <= var4) {
                    break L2;
                  } else {
                    var3_ref.f(-1477662136, (int) ((np) this).field_H[var4]);
                    var3_ref.f(-1477662136, (int) ((np) this).field_z[var4]);
                    var3_ref.f(-1477662136, (int) ((np) this).field_hb[var4]);
                    var4++;
                    continue L3;
                  }
                }
              } else {
                var4 = 0;
                L4: while (true) {
                  if (((np) this).field_ib <= var4) {
                    break L2;
                  } else {
                    var3_ref.d((int) ((np) this).field_H[var4], -87);
                    var3_ref.d((int) ((np) this).field_z[var4], 124);
                    var3_ref.d((int) ((np) this).field_hb[var4], 120);
                    var4++;
                    continue L4;
                  }
                }
              }
            }
            if (0 == var3_ref.field_h) {
              return;
            } else {
              L5: {
                if (!param1) {
                  ((np) this).field_w.field_a = ((np) this).field_R.a(-56, var3_ref.field_h, 5123, false, var3_ref.field_g);
                  break L5;
                } else {
                  L6: {
                    if (null != ((np) this).field_jb) {
                      ((np) this).field_jb.a(var3_ref.field_h, -11783, var3_ref.field_g, 5123);
                      break L6;
                    } else {
                      ((np) this).field_jb = ((np) this).field_R.a(-81, var3_ref.field_h, 5123, true, var3_ref.field_g);
                      break L6;
                    }
                  }
                  ((np) this).field_w.field_a = ((np) this).field_jb;
                  break L5;
                }
              }
              L7: {
                if (!param1) {
                  ((np) this).field_gb = true;
                  break L7;
                } else {
                  break L7;
                }
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw tba.a((Throwable) (Object) var3, "np.D(" + -24 + 44 + param1 + 41);
        }
    }

    final void a(int param0, int param1, int param2, int param3) {
        RuntimeException var5 = null;
        int var5_int = 0;
        int var6_int = 0;
        pm var6 = null;
        int var7_int = 0;
        fd var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        RuntimeException decompiledCaughtException = null;
        var10 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            var5_int = 0;
            L1: while (true) {
              if (var5_int >= ((np) this).field_W) {
                L2: {
                  if (((np) this).field_r != null) {
                    var5_int = 0;
                    L3: while (true) {
                      if (var5_int >= ((np) this).field_G) {
                        break L2;
                      } else {
                        var6 = ((np) this).field_r[var5_int];
                        var7 = ((np) this).field_f[var5_int];
                        var7.field_c = 16777215 & cla.field_m[((np) this).field_X[var6.field_l] & 65535] | -16777216 & var7.field_c;
                        var5_int++;
                        continue L3;
                      }
                    }
                  } else {
                    break L2;
                  }
                }
                L4: {
                  if (((np) this).field_kb == null) {
                    break L4;
                  } else {
                    ((np) this).field_kb.field_d = null;
                    break L4;
                  }
                }
                break L0;
              } else {
                L5: {
                  var6_int = 65535 & ((np) this).field_X[var5_int];
                  var7_int = (var6_int & 65466) >> 10;
                  var8 = (var6_int & 905) >> 7;
                  var9 = 127 & var6_int;
                  if (param0 != -1) {
                    var7_int = var7_int + ((param0 - var7_int) * param3 >> 7);
                    break L5;
                  } else {
                    break L5;
                  }
                }
                L6: {
                  if (param1 != -1) {
                    var8 = var8 - -((-var8 + param1) * param3 >> 7);
                    break L6;
                  } else {
                    break L6;
                  }
                }
                L7: {
                  if (-1 != param2) {
                    var9 = ((-var9 + param2) * param3 >> 7) + var9;
                    break L7;
                  } else {
                    break L7;
                  }
                }
                ((np) this).field_X[var5_int] = (short)fh.a(fh.a(var7_int << 10, var8 << 7), var9);
                var5_int++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          throw tba.a((Throwable) (Object) var5, "np.C(" + param0 + 44 + param1 + 44 + param2 + 44 + param3 + 41);
        }
    }

    final ka a(byte param0, int param1, boolean param2) {
        np var4 = null;
        RuntimeException var4_ref = null;
        np var5 = null;
        int var6 = 0;
        Object stackIn_21_0 = null;
        boolean stackIn_21_1 = false;
        int stackIn_21_2 = 0;
        Object stackIn_23_0 = null;
        boolean stackIn_23_1 = false;
        int stackIn_23_2 = 0;
        Object stackIn_24_0 = null;
        boolean stackIn_24_1 = false;
        int stackIn_24_2 = 0;
        int stackIn_24_3 = 0;
        ka stackIn_25_0 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_20_0 = null;
        boolean stackOut_20_1 = false;
        int stackOut_20_2 = 0;
        Object stackOut_23_0 = null;
        boolean stackOut_23_1 = false;
        int stackOut_23_2 = 0;
        int stackOut_23_3 = 0;
        Object stackOut_21_0 = null;
        boolean stackOut_21_1 = false;
        int stackOut_21_2 = 0;
        int stackOut_21_3 = 0;
        ka stackOut_24_0 = null;
        var6 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param0 == 1) {
                var4 = ((np) this).field_R.field_w;
                var5 = ((np) this).field_R.field_i;
                break L1;
              } else {
                if (param0 != 2) {
                  if (param0 != 3) {
                    if (4 == param0) {
                      var5 = ((np) this).field_R.field_D;
                      var4 = ((np) this).field_R.field_E;
                      break L1;
                    } else {
                      if (param0 != 5) {
                        np dupTemp$1 = new np(((np) this).field_R);
                        var5 = dupTemp$1;
                        var4 = dupTemp$1;
                        break L1;
                      } else {
                        var5 = ((np) this).field_R.field_Xb;
                        var4 = ((np) this).field_R.field_yb;
                        break L1;
                      }
                    }
                  } else {
                    var4 = ((np) this).field_R.field_Ub;
                    var5 = ((np) this).field_R.field_sc;
                    break L1;
                  }
                } else {
                  var4 = ((np) this).field_R.field_Nb;
                  var5 = ((np) this).field_R.field_eb;
                  break L1;
                }
              }
            }
            L2: {
              stackOut_20_0 = this;
              stackOut_20_1 = param2;
              stackOut_20_2 = param1;
              stackIn_23_0 = stackOut_20_0;
              stackIn_23_1 = stackOut_20_1;
              stackIn_23_2 = stackOut_20_2;
              stackIn_21_0 = stackOut_20_0;
              stackIn_21_1 = stackOut_20_1;
              stackIn_21_2 = stackOut_20_2;
              if (param0 == 0) {
                stackOut_23_0 = this;
                stackOut_23_1 = stackIn_23_1;
                stackOut_23_2 = stackIn_23_2;
                stackOut_23_3 = 0;
                stackIn_24_0 = stackOut_23_0;
                stackIn_24_1 = stackOut_23_1;
                stackIn_24_2 = stackOut_23_2;
                stackIn_24_3 = stackOut_23_3;
                break L2;
              } else {
                stackOut_21_0 = this;
                stackOut_21_1 = stackIn_21_1;
                stackOut_21_2 = stackIn_21_2;
                stackOut_21_3 = 1;
                stackIn_24_0 = stackOut_21_0;
                stackIn_24_1 = stackOut_21_1;
                stackIn_24_2 = stackOut_21_2;
                stackIn_24_3 = stackOut_21_3;
                break L2;
              }
            }
            stackOut_24_0 = this.a(stackIn_24_1, stackIn_24_2, stackIn_24_3 != 0, -22857, var5, var4);
            stackIn_25_0 = stackOut_24_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          throw tba.a((Throwable) (Object) var4_ref, "np.A(" + param0 + 44 + param1 + 44 + param2 + 41);
        }
        return stackIn_25_0;
    }

    final void a(gda param0, el param1, int param2, int param3) {
        RuntimeException var5 = null;
        oba var5_ref = null;
        oba var6 = null;
        float var7 = 0.0f;
        float var8 = 0.0f;
        float var9 = 0.0f;
        float var10 = 0.0f;
        float var11 = 0.0f;
        float var12 = 0.0f;
        float var13 = 0.0f;
        float var14 = 0.0f;
        float var15 = 0.0f;
        float var16 = 0.0f;
        float var17 = 0.0f;
        float var18 = 0.0f;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        int var23 = 0;
        RuntimeException stackIn_48_0 = null;
        StringBuilder stackIn_48_1 = null;
        RuntimeException stackIn_50_0 = null;
        StringBuilder stackIn_50_1 = null;
        RuntimeException stackIn_51_0 = null;
        StringBuilder stackIn_51_1 = null;
        String stackIn_51_2 = null;
        RuntimeException stackIn_52_0 = null;
        StringBuilder stackIn_52_1 = null;
        RuntimeException stackIn_54_0 = null;
        StringBuilder stackIn_54_1 = null;
        RuntimeException stackIn_55_0 = null;
        StringBuilder stackIn_55_1 = null;
        String stackIn_55_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_47_0 = null;
        StringBuilder stackOut_47_1 = null;
        RuntimeException stackOut_50_0 = null;
        StringBuilder stackOut_50_1 = null;
        String stackOut_50_2 = null;
        RuntimeException stackOut_48_0 = null;
        StringBuilder stackOut_48_1 = null;
        String stackOut_48_2 = null;
        RuntimeException stackOut_51_0 = null;
        StringBuilder stackOut_51_1 = null;
        RuntimeException stackOut_54_0 = null;
        StringBuilder stackOut_54_1 = null;
        String stackOut_54_2 = null;
        RuntimeException stackOut_52_0 = null;
        StringBuilder stackOut_52_1 = null;
        String stackOut_52_2 = null;
        var23 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            if (((np) this).field_L != 0) {
              L1: {
                var5_ref = ((np) this).field_R.field_jd;
                if (((np) this).field_l) {
                  break L1;
                } else {
                  this.c(2709);
                  break L1;
                }
              }
              L2: {
                var6 = (oba) (Object) param0;
                it.field_a = var6.field_h * var5_ref.field_q + (var5_ref.field_j * var6.field_k + var5_ref.field_h * var6.field_r);
                bja.field_b = var5_ref.field_o + (var6.field_o * var5_ref.field_q + (var6.field_p * var5_ref.field_h + var5_ref.field_j * var6.field_m));
                var7 = bja.field_b + it.field_a * (float)((np) this).field_eb;
                var8 = bja.field_b + it.field_a * (float)((np) this).field_v;
                if (var7 > var8) {
                  var10 = (float)((np) this).field_M + var7;
                  var9 = (float)(-((np) this).field_M) + var8;
                  break L2;
                } else {
                  var10 = var8 + (float)((np) this).field_M;
                  var9 = (float)(-((np) this).field_M) + var7;
                  break L2;
                }
              }
              if (((np) this).field_R.field_m > var9) {
                if (var10 > (float)((np) this).field_R.field_Gc) {
                  L3: {
                    eqa.field_a = var5_ref.field_k * var6.field_r + var6.field_k * var5_ref.field_l + var6.field_h * var5_ref.field_s;
                    aka.field_B = var5_ref.field_s * var6.field_o + (var6.field_p * var5_ref.field_k + var5_ref.field_l * var6.field_m) + var5_ref.field_m;
                    var11 = aka.field_B + eqa.field_a * (float)((np) this).field_eb;
                    var12 = (float)((np) this).field_v * eqa.field_a + aka.field_B;
                    if (var11 > var12) {
                      var14 = (var11 + (float)((np) this).field_M) * (float)((np) this).field_R.field_W;
                      var13 = (var12 - (float)((np) this).field_M) * (float)((np) this).field_R.field_W;
                      break L3;
                    } else {
                      var14 = (var12 + (float)((np) this).field_M) * (float)((np) this).field_R.field_W;
                      var13 = (float)((np) this).field_R.field_W * (var11 - (float)((np) this).field_M);
                      break L3;
                    }
                  }
                  if (((np) this).field_R.field_od <= var13 / (float)param2) {
                    return;
                  } else {
                    if (((np) this).field_R.field_s >= var14 / (float)param2) {
                      return;
                    } else {
                      L4: {
                        nw.field_u = var5_ref.field_g * var6.field_h + (var5_ref.field_i * var6.field_k + var6.field_r * var5_ref.field_r);
                        ef.field_s = var5_ref.field_p + (var6.field_o * var5_ref.field_g + (var6.field_p * var5_ref.field_r + var5_ref.field_i * var6.field_m));
                        var15 = ef.field_s + nw.field_u * (float)((np) this).field_eb;
                        var16 = (float)((np) this).field_v * nw.field_u + ef.field_s;
                        if (var15 <= var16) {
                          var17 = (float)((np) this).field_R.field_kb * (var15 - (float)((np) this).field_M);
                          var18 = (var16 + (float)((np) this).field_M) * (float)((np) this).field_R.field_kb;
                          break L4;
                        } else {
                          var18 = (float)((np) this).field_R.field_kb * (var15 + (float)((np) this).field_M);
                          var17 = (float)((np) this).field_R.field_kb * (var16 - (float)((np) this).field_M);
                          break L4;
                        }
                      }
                      if (((np) this).field_R.field_Db <= var17 / (float)param2) {
                        return;
                      } else {
                        if (((np) this).field_R.field_nd < var18 / (float)param2) {
                          L5: {
                            L6: {
                              if (null != param1) {
                                break L6;
                              } else {
                                if (null == ((np) this).field_r) {
                                  break L5;
                                } else {
                                  break L6;
                                }
                              }
                            }
                            is.field_Ab = var5_ref.field_l * var6.field_l + var5_ref.field_k * var6.field_i + var6.field_j * var5_ref.field_s;
                            roa.field_u = var6.field_l * var5_ref.field_j + var5_ref.field_h * var6.field_i + var6.field_j * var5_ref.field_q;
                            mu.field_ub = var6.field_q * var5_ref.field_s + (var5_ref.field_l * var6.field_s + var5_ref.field_k * var6.field_g);
                            bva.field_c = var6.field_q * var5_ref.field_g + (var6.field_g * var5_ref.field_r + var6.field_s * var5_ref.field_i);
                            qi.field_L = var6.field_i * var5_ref.field_r + var5_ref.field_i * var6.field_l + var5_ref.field_g * var6.field_j;
                            kka.field_q = var5_ref.field_h * var6.field_g + var6.field_s * var5_ref.field_j + var6.field_q * var5_ref.field_q;
                            break L5;
                          }
                          L7: {
                            if (null != param1) {
                              var19 = ((np) this).field_U - -((np) this).field_T >> 1;
                              var20 = ((np) this).field_k + ((np) this).field_S >> 1;
                              var21 = (int)(it.field_a * (float)((np) this).field_eb + (roa.field_u * (float)var19 + bja.field_b) + kka.field_q * (float)var20);
                              var22 = (int)((float)var20 * kka.field_q + (it.field_a * (float)((np) this).field_v + (roa.field_u * (float)var19 + bja.field_b)));
                              if (~var21 <= ~((np) this).field_R.field_Gc) {
                                break L7;
                              } else {
                                if (~((np) this).field_R.field_Gc >= ~var22) {
                                  break L7;
                                } else {
                                  break L7;
                                }
                              }
                            } else {
                              break L7;
                            }
                          }
                          ((np) this).field_R.a((byte) 88, (float)param2);
                          ((np) this).field_R.j((byte) -121);
                          ((np) this).field_R.b(var6, 112);
                          this.a(false);
                          ((np) this).field_R.n((byte) -91);
                          this.b((byte) -30);
                          break L0;
                        } else {
                          return;
                        }
                      }
                    }
                  }
                } else {
                  return;
                }
              } else {
                return;
              }
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var5 = decompiledCaughtException;
            stackOut_47_0 = (RuntimeException) var5;
            stackOut_47_1 = new StringBuilder().append("np.Q(");
            stackIn_50_0 = stackOut_47_0;
            stackIn_50_1 = stackOut_47_1;
            stackIn_48_0 = stackOut_47_0;
            stackIn_48_1 = stackOut_47_1;
            if (param0 == null) {
              stackOut_50_0 = (RuntimeException) (Object) stackIn_50_0;
              stackOut_50_1 = (StringBuilder) (Object) stackIn_50_1;
              stackOut_50_2 = "null";
              stackIn_51_0 = stackOut_50_0;
              stackIn_51_1 = stackOut_50_1;
              stackIn_51_2 = stackOut_50_2;
              break L8;
            } else {
              stackOut_48_0 = (RuntimeException) (Object) stackIn_48_0;
              stackOut_48_1 = (StringBuilder) (Object) stackIn_48_1;
              stackOut_48_2 = "{...}";
              stackIn_51_0 = stackOut_48_0;
              stackIn_51_1 = stackOut_48_1;
              stackIn_51_2 = stackOut_48_2;
              break L8;
            }
          }
          L9: {
            stackOut_51_0 = (RuntimeException) (Object) stackIn_51_0;
            stackOut_51_1 = ((StringBuilder) (Object) stackIn_51_1).append(stackIn_51_2).append(44);
            stackIn_54_0 = stackOut_51_0;
            stackIn_54_1 = stackOut_51_1;
            stackIn_52_0 = stackOut_51_0;
            stackIn_52_1 = stackOut_51_1;
            if (param1 == null) {
              stackOut_54_0 = (RuntimeException) (Object) stackIn_54_0;
              stackOut_54_1 = (StringBuilder) (Object) stackIn_54_1;
              stackOut_54_2 = "null";
              stackIn_55_0 = stackOut_54_0;
              stackIn_55_1 = stackOut_54_1;
              stackIn_55_2 = stackOut_54_2;
              break L9;
            } else {
              stackOut_52_0 = (RuntimeException) (Object) stackIn_52_0;
              stackOut_52_1 = (StringBuilder) (Object) stackIn_52_1;
              stackOut_52_2 = "{...}";
              stackIn_55_0 = stackOut_52_0;
              stackIn_55_1 = stackOut_52_1;
              stackIn_55_2 = stackOut_52_2;
              break L9;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_55_0, stackIn_55_2 + 44 + param2 + 44 + param3 + 41);
        }
    }

    final void I(int param0, int[] param1, int param2, int param3, int param4, boolean param5, int param6, int[] param7) {
        int var9_int = 0;
        int var10 = 0;
        int var11 = 0;
        pm var11_ref_pm = null;
        int var12_int = 0;
        int[] var12 = null;
        fd var12_ref = null;
        int[] var13_ref_int__ = null;
        int var13 = 0;
        int var14_int = 0;
        fd var14 = null;
        int var15 = 0;
        int[] var16_ref_int__ = null;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        int var23 = 0;
        int var24 = 0;
        int var25_int = 0;
        int[] var25 = null;
        int var26 = 0;
        int var27 = 0;
        int var28 = 0;
        int var29_int = 0;
        int[] var29 = null;
        int var30 = 0;
        int[] var31_ref_int__ = null;
        int var31 = 0;
        int var32 = 0;
        int var33 = 0;
        int var34 = 0;
        int[] var35 = null;
        int var35_int = 0;
        int var36 = 0;
        int var37 = 0;
        int var38 = 0;
        int var39 = 0;
        int var40 = 0;
        int[] var41 = null;
        int var42 = 0;
        int var43 = 0;
        int var44 = 0;
        int var45 = 0;
        int var46 = 0;
        int var47 = 0;
        Object stackIn_74_0 = null;
        short[] stackIn_74_1 = null;
        Object stackOut_73_0 = null;
        short[] stackOut_73_1 = null;
        var47 = TombRacer.field_G ? 1 : 0;
        var9_int = param1.length;
        if (param0 != 0) {
          if (param0 == 1) {
            L0: {
              if (param7 != null) {
                var10 = 8192 + (param2 * param7[0] - (-(param3 * param7[1]) - param7[2] * param4)) >> 14;
                var11 = 8192 + param7[4] * param3 + (param7[3] * param2 - -(param7[5] * param4)) >> 14;
                var12_int = param7[6] * param2 + (param7[7] * param3 - -(param4 * param7[8]) - -8192) >> 14;
                param4 = var12_int;
                param3 = var11;
                param2 = var10;
                break L0;
              } else {
                break L0;
              }
            }
            param2 = param2 << 4;
            param4 = param4 << 4;
            param3 = param3 << 4;
            var10 = 0;
            L1: while (true) {
              if (var9_int <= var10) {
                return;
              } else {
                L2: {
                  var11 = param1[var10];
                  if (~((np) this).field_d.length < ~var11) {
                    var12 = ((np) this).field_d[var11];
                    var13 = 0;
                    L3: while (true) {
                      if (~var12.length >= ~var13) {
                        break L2;
                      } else {
                        L4: {
                          L5: {
                            var14_int = var12[var13];
                            if (((np) this).field_db == null) {
                              break L5;
                            } else {
                              if ((param6 & ((np) this).field_db[var14_int]) != 0) {
                                break L5;
                              } else {
                                break L4;
                              }
                            }
                          }
                          ((np) this).field_P[var14_int] = ((np) this).field_P[var14_int] + param2;
                          ((np) this).field_K[var14_int] = ((np) this).field_K[var14_int] + param3;
                          ((np) this).field_A[var14_int] = ((np) this).field_A[var14_int] + param4;
                          break L4;
                        }
                        var13++;
                        continue L3;
                      }
                    }
                  } else {
                    break L2;
                  }
                }
                var10++;
                continue L1;
              }
            }
          } else {
            if (param0 == 2) {
              L6: {
                if (null != param7) {
                  L7: {
                    var10 = param7[9] << 4;
                    var11 = param7[10] << 4;
                    var12_int = param7[11] << 4;
                    var13 = param7[12] << 4;
                    var14_int = param7[13] << 4;
                    var15 = param7[14] << 4;
                    if (!vea.field_b) {
                      break L7;
                    } else {
                      var16 = 8192 + (dj.field_b * param7[6] + via.field_e * param7[3] + param7[0] * rp.field_i) >> 14;
                      var17 = dj.field_b * param7[7] + (param7[4] * via.field_e + rp.field_i * param7[1] - -8192) >> 14;
                      var18 = param7[2] * rp.field_i + (param7[5] * via.field_e + dj.field_b * param7[8] - -8192) >> 14;
                      var16 = var16 + var13;
                      var17 = var17 + var14_int;
                      via.field_e = var17;
                      var18 = var18 + var15;
                      rp.field_i = var16;
                      vea.field_b = false;
                      dj.field_b = var18;
                      break L7;
                    }
                  }
                  var16_ref_int__ = new int[9];
                  var17 = qu.field_d[param2];
                  var18 = qu.field_b[param2];
                  var19 = qu.field_d[param3];
                  var20 = qu.field_b[param3];
                  var21 = qu.field_d[param4];
                  var22 = qu.field_b[param4];
                  var23 = 8192 + var21 * var18 >> 14;
                  var24 = 8192 + var18 * var22 >> 14;
                  var16_ref_int__[7] = var19 * var23 + var22 * var20 + 8192 >> 14;
                  var16_ref_int__[4] = 8192 + var17 * var21 >> 14;
                  var16_ref_int__[0] = 8192 + (var24 * var20 + var21 * var19) >> 14;
                  var16_ref_int__[6] = var24 * var19 + -var20 * var21 + 8192 >> 14;
                  var16_ref_int__[3] = var22 * var17 + 8192 >> 14;
                  var16_ref_int__[5] = -var18;
                  var16_ref_int__[8] = var19 * var17 - -8192 >> 14;
                  var16_ref_int__[1] = var20 * var23 + -var19 * var22 + 8192 >> 14;
                  var16_ref_int__[2] = var17 * var20 + 8192 >> 14;
                  var25_int = 8192 + (var16_ref_int__[2] * -dj.field_b + -rp.field_i * var16_ref_int__[0] - -(var16_ref_int__[1] * -via.field_e)) >> 14;
                  var26 = 8192 + var16_ref_int__[5] * -dj.field_b + (-rp.field_i * var16_ref_int__[3] - -(-via.field_e * var16_ref_int__[4])) >> 14;
                  var27 = -dj.field_b * var16_ref_int__[8] + (-via.field_e * var16_ref_int__[7] + var16_ref_int__[6] * -rp.field_i + 8192) >> 14;
                  var28 = var25_int + rp.field_i;
                  var29_int = via.field_e + var26;
                  var30 = var27 + dj.field_b;
                  var31_ref_int__ = new int[9];
                  var32 = 0;
                  L8: while (true) {
                    if (3 <= var32) {
                      var32 = 8192 + (var13 * var16_ref_int__[0] - -(var14_int * var16_ref_int__[1])) - -(var16_ref_int__[2] * var15) >> 14;
                      var33 = var16_ref_int__[5] * var15 + var16_ref_int__[4] * var14_int + var16_ref_int__[3] * var13 + 8192 >> 14;
                      var32 = var32 + var28;
                      var33 = var33 + var29_int;
                      var34 = 8192 + var16_ref_int__[6] * var13 + var14_int * var16_ref_int__[7] - -(var15 * var16_ref_int__[8]) >> 14;
                      var34 = var34 + var30;
                      var35 = new int[9];
                      var36 = 0;
                      L9: while (true) {
                        if (3 <= var36) {
                          var36 = 8192 + (var34 * param7[2] + var32 * param7[0] + param7[1] * var33) >> 14;
                          var37 = 8192 + (var33 * param7[4] + param7[3] * var32 + param7[5] * var34) >> 14;
                          var36 = var36 + var10;
                          var37 = var37 + var11;
                          var38 = var33 * param7[7] + (param7[6] * var32 + param7[8] * var34) + 8192 >> 14;
                          var38 = var38 + var12_int;
                          var39 = 0;
                          L10: while (true) {
                            if (~var9_int >= ~var39) {
                              break L6;
                            } else {
                              L11: {
                                var40 = param1[var39];
                                if (~var40 > ~((np) this).field_d.length) {
                                  var41 = ((np) this).field_d[var40];
                                  var42 = 0;
                                  L12: while (true) {
                                    if (var41.length <= var42) {
                                      break L11;
                                    } else {
                                      L13: {
                                        L14: {
                                          var43 = var41[var42];
                                          if (null == ((np) this).field_db) {
                                            break L14;
                                          } else {
                                            if ((((np) this).field_db[var43] & param6) != 0) {
                                              break L14;
                                            } else {
                                              break L13;
                                            }
                                          }
                                        }
                                        var44 = 8192 + var35[2] * ((np) this).field_A[var43] + (((np) this).field_P[var43] * var35[0] + ((np) this).field_K[var43] * var35[1]) >> 14;
                                        var45 = var35[5] * ((np) this).field_A[var43] + (((np) this).field_K[var43] * var35[4] + ((np) this).field_P[var43] * var35[3] - -8192) >> 14;
                                        var44 = var44 + var36;
                                        var45 = var45 + var37;
                                        var46 = var35[8] * ((np) this).field_A[var43] + ((np) this).field_K[var43] * var35[7] + (((np) this).field_P[var43] * var35[6] - -8192) >> 14;
                                        var46 = var46 + var38;
                                        ((np) this).field_P[var43] = var44;
                                        ((np) this).field_K[var43] = var45;
                                        ((np) this).field_A[var43] = var46;
                                        break L13;
                                      }
                                      var42++;
                                      continue L12;
                                    }
                                  }
                                } else {
                                  break L11;
                                }
                              }
                              var39++;
                              continue L10;
                            }
                          }
                        } else {
                          var37 = 0;
                          L15: while (true) {
                            if (var37 >= 3) {
                              var36++;
                              continue L9;
                            } else {
                              var38 = 0;
                              var39 = 0;
                              L16: while (true) {
                                if (var39 >= 3) {
                                  var35[3 * var36 - -var37] = 8192 + var38 >> 14;
                                  var37++;
                                  continue L15;
                                } else {
                                  var38 = var38 + param7[var39 + 3 * var36] * var31_ref_int__[var37 - -(var39 * 3)];
                                  var39++;
                                  continue L16;
                                }
                              }
                            }
                          }
                        }
                      }
                    } else {
                      var33 = 0;
                      L17: while (true) {
                        if (var33 >= 3) {
                          var32++;
                          continue L8;
                        } else {
                          var34 = 0;
                          var35_int = 0;
                          L18: while (true) {
                            if (var35_int >= 3) {
                              var31_ref_int__[var32 * 3 - -var33] = 8192 + var34 >> 14;
                              var33++;
                              continue L17;
                            } else {
                              var34 = var34 + param7[var35_int + var33 * 3] * var16_ref_int__[var35_int + var32 * 3];
                              var35_int++;
                              continue L18;
                            }
                          }
                        }
                      }
                    }
                  }
                } else {
                  var10 = 0;
                  L19: while (true) {
                    if (var9_int <= var10) {
                      if (param5) {
                        var10 = 0;
                        L20: while (true) {
                          if (~var10 <= ~var9_int) {
                            L21: {
                              if (null != ((np) this).field_F) {
                                break L21;
                              } else {
                                if (((np) this).field_kb != null) {
                                  ((np) this).field_kb.field_d = null;
                                  break L21;
                                } else {
                                  break L21;
                                }
                              }
                            }
                            if (((np) this).field_F == null) {
                              break L6;
                            } else {
                              ((np) this).field_F.field_d = null;
                              break L6;
                            }
                          } else {
                            L22: {
                              var11 = param1[var10];
                              if (var11 >= ((np) this).field_d.length) {
                                break L22;
                              } else {
                                var12 = ((np) this).field_d[var11];
                                var13 = 0;
                                L23: while (true) {
                                  if (~var13 <= ~var12.length) {
                                    break L22;
                                  } else {
                                    var14_int = var12[var13];
                                    stackOut_73_0 = null;
                                    stackOut_73_1 = ((np) this).field_db;
                                    stackIn_74_0 = stackOut_73_0;
                                    stackIn_74_1 = stackOut_73_1;
                                    L24: {
                                      L25: {
                                        if (stackIn_74_0 == (Object) (Object) stackIn_74_1) {
                                          break L25;
                                        } else {
                                          if ((((np) this).field_db[var14_int] & param6) != 0) {
                                            break L25;
                                          } else {
                                            break L24;
                                          }
                                        }
                                      }
                                      var15 = ((np) this).field_e[var14_int];
                                      var16 = ((np) this).field_e[1 + var14_int];
                                      var17 = var15;
                                      L26: while (true) {
                                        if (~var17 <= ~var16) {
                                          break L24;
                                        } else {
                                          var18 = -1 + ((np) this).field_q[var17];
                                          if (var18 != -1) {
                                            L27: {
                                              if (param4 == 0) {
                                                break L27;
                                              } else {
                                                var19 = qu.field_b[param4];
                                                var20 = qu.field_d[param4];
                                                var21 = 16383 + ((np) this).field_E[var18] * var20 + var19 * ((np) this).field_Y[var18] >> 14;
                                                ((np) this).field_Y[var18] = (short)(-(var19 * ((np) this).field_E[var18]) + (var20 * ((np) this).field_Y[var18] - -16383) >> 14);
                                                ((np) this).field_E[var18] = (short)var21;
                                                break L27;
                                              }
                                            }
                                            L28: {
                                              if (0 != param2) {
                                                var19 = qu.field_b[param2];
                                                var20 = qu.field_d[param2];
                                                var21 = var20 * ((np) this).field_Y[var18] - var19 * ((np) this).field_cb[var18] - -16383 >> 14;
                                                ((np) this).field_cb[var18] = (short)(16383 + (((np) this).field_cb[var18] * var20 + ((np) this).field_Y[var18] * var19) >> 14);
                                                ((np) this).field_Y[var18] = (short)var21;
                                                break L28;
                                              } else {
                                                break L28;
                                              }
                                            }
                                            L29: {
                                              if (param3 == 0) {
                                                break L29;
                                              } else {
                                                var19 = qu.field_b[param3];
                                                var20 = qu.field_d[param3];
                                                var21 = 16383 + ((np) this).field_cb[var18] * var19 - -(var20 * ((np) this).field_E[var18]) >> 14;
                                                ((np) this).field_cb[var18] = (short)(((np) this).field_cb[var18] * var20 + (-(var19 * ((np) this).field_E[var18]) + 16383) >> 14);
                                                ((np) this).field_E[var18] = (short)var21;
                                                break L29;
                                              }
                                            }
                                            var17++;
                                            continue L26;
                                          } else {
                                            break L24;
                                          }
                                        }
                                      }
                                    }
                                    var13++;
                                    continue L23;
                                  }
                                }
                              }
                            }
                            var10++;
                            continue L20;
                          }
                        }
                      } else {
                        break L6;
                      }
                    } else {
                      L30: {
                        var11 = param1[var10];
                        if (((np) this).field_d.length > var11) {
                          var12 = ((np) this).field_d[var11];
                          var13 = 0;
                          L31: while (true) {
                            if (~var13 <= ~var12.length) {
                              break L30;
                            } else {
                              L32: {
                                L33: {
                                  var14_int = var12[var13];
                                  if (null == ((np) this).field_db) {
                                    break L33;
                                  } else {
                                    if ((((np) this).field_db[var14_int] & param6) == 0) {
                                      break L32;
                                    } else {
                                      break L33;
                                    }
                                  }
                                }
                                L34: {
                                  ((np) this).field_P[var14_int] = ((np) this).field_P[var14_int] - rp.field_i;
                                  ((np) this).field_K[var14_int] = ((np) this).field_K[var14_int] - via.field_e;
                                  ((np) this).field_A[var14_int] = ((np) this).field_A[var14_int] - dj.field_b;
                                  if (param4 != 0) {
                                    var15 = qu.field_b[param4];
                                    var16 = qu.field_d[param4];
                                    var17 = var15 * ((np) this).field_K[var14_int] - (-(((np) this).field_P[var14_int] * var16) - 16383) >> 14;
                                    ((np) this).field_K[var14_int] = 16383 + (var16 * ((np) this).field_K[var14_int] + -(var15 * ((np) this).field_P[var14_int])) >> 14;
                                    ((np) this).field_P[var14_int] = var17;
                                    break L34;
                                  } else {
                                    break L34;
                                  }
                                }
                                L35: {
                                  if (param2 != 0) {
                                    var15 = qu.field_b[param2];
                                    var16 = qu.field_d[param2];
                                    var17 = 16383 + (var16 * ((np) this).field_K[var14_int] + -(((np) this).field_A[var14_int] * var15)) >> 14;
                                    ((np) this).field_A[var14_int] = 16383 + (var15 * ((np) this).field_K[var14_int] + var16 * ((np) this).field_A[var14_int]) >> 14;
                                    ((np) this).field_K[var14_int] = var17;
                                    break L35;
                                  } else {
                                    break L35;
                                  }
                                }
                                L36: {
                                  if (param3 == 0) {
                                    break L36;
                                  } else {
                                    var15 = qu.field_b[param3];
                                    var16 = qu.field_d[param3];
                                    var17 = 16383 + ((np) this).field_P[var14_int] * var16 + var15 * ((np) this).field_A[var14_int] >> 14;
                                    ((np) this).field_A[var14_int] = 16383 + var16 * ((np) this).field_A[var14_int] + -(((np) this).field_P[var14_int] * var15) >> 14;
                                    ((np) this).field_P[var14_int] = var17;
                                    break L36;
                                  }
                                }
                                ((np) this).field_P[var14_int] = ((np) this).field_P[var14_int] + rp.field_i;
                                ((np) this).field_K[var14_int] = ((np) this).field_K[var14_int] + via.field_e;
                                ((np) this).field_A[var14_int] = ((np) this).field_A[var14_int] + dj.field_b;
                                break L32;
                              }
                              var13++;
                              continue L31;
                            }
                          }
                        } else {
                          break L30;
                        }
                      }
                      var10++;
                      continue L19;
                    }
                  }
                }
              }
              return;
            } else {
              if (param0 != 3) {
                if (param0 != 5) {
                  if (param0 != 7) {
                    if (param0 != 8) {
                      if (param0 == 10) {
                        L37: {
                          if (((np) this).field_C != null) {
                            var10 = 0;
                            L38: while (true) {
                              if (~var9_int >= ~var10) {
                                break L37;
                              } else {
                                L39: {
                                  var11 = param1[var10];
                                  if (var11 >= ((np) this).field_C.length) {
                                    break L39;
                                  } else {
                                    var12 = ((np) this).field_C[var11];
                                    var13 = 0;
                                    L40: while (true) {
                                      if (var13 >= var12.length) {
                                        break L39;
                                      } else {
                                        var14 = ((np) this).field_f[var12[var13]];
                                        var14.field_b = var14.field_b * param2 >> 7;
                                        var14.field_f = param3 * var14.field_f >> 7;
                                        var13++;
                                        continue L40;
                                      }
                                    }
                                  }
                                }
                                var10++;
                                continue L38;
                              }
                            }
                          } else {
                            break L37;
                          }
                        }
                        return;
                      } else {
                        if (param0 != 9) {
                          return;
                        } else {
                          L41: {
                            if (null != ((np) this).field_C) {
                              var10 = 0;
                              L42: while (true) {
                                if (var9_int <= var10) {
                                  break L41;
                                } else {
                                  L43: {
                                    var11 = param1[var10];
                                    if (var11 < ((np) this).field_C.length) {
                                      var12 = ((np) this).field_C[var11];
                                      var13 = 0;
                                      L44: while (true) {
                                        if (~var12.length >= ~var13) {
                                          break L43;
                                        } else {
                                          var14 = ((np) this).field_f[var12[var13]];
                                          var14.field_g = 16383 & param2 + var14.field_g;
                                          var13++;
                                          continue L44;
                                        }
                                      }
                                    } else {
                                      break L43;
                                    }
                                  }
                                  var10++;
                                  continue L42;
                                }
                              }
                            } else {
                              break L41;
                            }
                          }
                          return;
                        }
                      }
                    } else {
                      L45: {
                        if (((np) this).field_C == null) {
                          break L45;
                        } else {
                          var10 = 0;
                          L46: while (true) {
                            if (~var10 <= ~var9_int) {
                              break L45;
                            } else {
                              L47: {
                                var11 = param1[var10];
                                if (~((np) this).field_C.length >= ~var11) {
                                  break L47;
                                } else {
                                  var12 = ((np) this).field_C[var11];
                                  var13 = 0;
                                  L48: while (true) {
                                    if (~var13 <= ~var12.length) {
                                      break L47;
                                    } else {
                                      var14 = ((np) this).field_f[var12[var13]];
                                      var14.field_h = var14.field_h + param2;
                                      var14.field_a = var14.field_a + param3;
                                      var13++;
                                      continue L48;
                                    }
                                  }
                                }
                              }
                              var10++;
                              continue L46;
                            }
                          }
                        }
                      }
                      return;
                    }
                  } else {
                    L49: {
                      if (null == ((np) this).field_j) {
                        break L49;
                      } else {
                        var10 = 0;
                        L50: while (true) {
                          if (~var10 <= ~var9_int) {
                            if (null != ((np) this).field_r) {
                              var10 = 0;
                              L51: while (true) {
                                if (var10 >= ((np) this).field_G) {
                                  break L49;
                                } else {
                                  var11_ref_pm = ((np) this).field_r[var10];
                                  var12_ref = ((np) this).field_f[var10];
                                  var12_ref.field_c = cla.field_m[((np) this).field_X[var11_ref_pm.field_l] & 65535] & 16777215 | var12_ref.field_c & -16777216;
                                  var10++;
                                  continue L51;
                                }
                              }
                            } else {
                              break L49;
                            }
                          } else {
                            L52: {
                              var11 = param1[var10];
                              if (~var11 > ~((np) this).field_j.length) {
                                var12 = ((np) this).field_j[var11];
                                var13 = 0;
                                L53: while (true) {
                                  if (~var12.length >= ~var13) {
                                    break L52;
                                  } else {
                                    L54: {
                                      L55: {
                                        var14_int = var12[var13];
                                        if (((np) this).field_fb == null) {
                                          break L55;
                                        } else {
                                          if ((((np) this).field_fb[var14_int] & param6) != 0) {
                                            break L55;
                                          } else {
                                            break L54;
                                          }
                                        }
                                      }
                                      L56: {
                                        var15 = ((np) this).field_X[var14_int] & 65535;
                                        var16 = (64685 & var15) >> 10;
                                        var17 = 7 & var15 >> 7;
                                        var16 = 63 & param2 + var16;
                                        var17 = var17 + param3 / 4;
                                        var18 = var15 & 127;
                                        var18 = var18 + param4;
                                        if (0 <= var17) {
                                          if (7 < var17) {
                                            var17 = 7;
                                            break L56;
                                          } else {
                                            break L56;
                                          }
                                        } else {
                                          var17 = 0;
                                          break L56;
                                        }
                                      }
                                      L57: {
                                        if (var18 < 0) {
                                          var18 = 0;
                                          break L57;
                                        } else {
                                          if (127 >= var18) {
                                            break L57;
                                          } else {
                                            var18 = 127;
                                            break L57;
                                          }
                                        }
                                      }
                                      ((np) this).field_X[var14_int] = (short)fh.a(var18, fh.a(var17 << 7, var16 << 10));
                                      if (null != ((np) this).field_kb) {
                                        ((np) this).field_kb.field_d = null;
                                        break L54;
                                      } else {
                                        break L54;
                                      }
                                    }
                                    var13++;
                                    continue L53;
                                  }
                                }
                              } else {
                                break L52;
                              }
                            }
                            var10++;
                            continue L50;
                          }
                        }
                      }
                    }
                    return;
                  }
                } else {
                  L58: {
                    if (((np) this).field_j != null) {
                      var10 = 0;
                      L59: while (true) {
                        if (~var10 <= ~var9_int) {
                          if (((np) this).field_r != null) {
                            var10 = 0;
                            L60: while (true) {
                              if (~var10 <= ~((np) this).field_G) {
                                break L58;
                              } else {
                                var11_ref_pm = ((np) this).field_r[var10];
                                var12_ref = ((np) this).field_f[var10];
                                var12_ref.field_c = -(((np) this).field_o[var11_ref_pm.field_l] & 255) + 255 << 24 | 16777215 & var12_ref.field_c;
                                var10++;
                                continue L60;
                              }
                            }
                          } else {
                            break L58;
                          }
                        } else {
                          L61: {
                            var11 = param1[var10];
                            if (((np) this).field_j.length <= var11) {
                              break L61;
                            } else {
                              var12 = ((np) this).field_j[var11];
                              var13 = 0;
                              L62: while (true) {
                                if (~var12.length >= ~var13) {
                                  break L61;
                                } else {
                                  L63: {
                                    L64: {
                                      var14_int = var12[var13];
                                      if (null == ((np) this).field_fb) {
                                        break L64;
                                      } else {
                                        if (0 != (param6 & ((np) this).field_fb[var14_int])) {
                                          break L64;
                                        } else {
                                          break L63;
                                        }
                                      }
                                    }
                                    L65: {
                                      var15 = param2 * 8 + (((np) this).field_o[var14_int] & 255);
                                      if (var15 < 0) {
                                        var15 = 0;
                                        break L65;
                                      } else {
                                        if (var15 > 255) {
                                          var15 = 255;
                                          break L65;
                                        } else {
                                          break L65;
                                        }
                                      }
                                    }
                                    ((np) this).field_o[var14_int] = (byte)var15;
                                    if (null == ((np) this).field_kb) {
                                      break L63;
                                    } else {
                                      ((np) this).field_kb.field_d = null;
                                      break L63;
                                    }
                                  }
                                  var13++;
                                  continue L62;
                                }
                              }
                            }
                          }
                          var10++;
                          continue L59;
                        }
                      }
                    } else {
                      break L58;
                    }
                  }
                  return;
                }
              } else {
                L66: {
                  if (param7 != null) {
                    L67: {
                      var10 = param7[9] << 4;
                      var11 = param7[10] << 4;
                      var12_int = param7[11] << 4;
                      var13 = param7[12] << 4;
                      var14_int = param7[13] << 4;
                      var15 = param7[14] << 4;
                      if (vea.field_b) {
                        var16 = 8192 + (param7[0] * rp.field_i - -(param7[3] * via.field_e) - -(dj.field_b * param7[6])) >> 14;
                        var17 = 8192 + (via.field_e * param7[4] + (param7[1] * rp.field_i - -(param7[7] * dj.field_b))) >> 14;
                        var18 = 8192 + (via.field_e * param7[5] + rp.field_i * param7[2]) - -(dj.field_b * param7[8]) >> 14;
                        var17 = var17 + var14_int;
                        var16 = var16 + var13;
                        via.field_e = var17;
                        rp.field_i = var16;
                        var18 = var18 + var15;
                        vea.field_b = false;
                        dj.field_b = var18;
                        break L67;
                      } else {
                        break L67;
                      }
                    }
                    var16 = param2 << 15 >> 7;
                    var17 = param3 << 15 >> 7;
                    var18 = param4 << 15 >> 7;
                    var19 = 8192 + var16 * -rp.field_i >> 14;
                    var20 = var17 * -via.field_e - -8192 >> 14;
                    var21 = 8192 + var18 * -dj.field_b >> 14;
                    var22 = var19 - -rp.field_i;
                    var23 = var20 + via.field_e;
                    var24 = var21 + dj.field_b;
                    var25 = new int[9];
                    var25[0] = var16 * param7[0] - -8192 >> 14;
                    var25[2] = var16 * param7[6] - -8192 >> 14;
                    var25[1] = 8192 + param7[3] * var16 >> 14;
                    var25[3] = 8192 + param7[1] * var17 >> 14;
                    var25[6] = param7[2] * var18 + 8192 >> 14;
                    var25[4] = 8192 + param7[4] * var17 >> 14;
                    var25[5] = 8192 + var17 * param7[7] >> 14;
                    var25[8] = 8192 + param7[8] * var18 >> 14;
                    var25[7] = 8192 + var18 * param7[5] >> 14;
                    var26 = var16 * var13 + 8192 >> 14;
                    var27 = 8192 + var17 * var14_int >> 14;
                    var27 = var27 + var23;
                    var28 = var18 * var15 + 8192 >> 14;
                    var26 = var26 + var22;
                    var28 = var28 + var24;
                    var29 = new int[9];
                    var30 = 0;
                    L68: while (true) {
                      if (3 <= var30) {
                        var30 = 8192 + var26 * param7[0] + var27 * param7[1] + var28 * param7[2] >> 14;
                        var31 = 8192 + (var28 * param7[5] + (var26 * param7[3] + param7[4] * var27)) >> 14;
                        var30 = var30 + var10;
                        var31 = var31 + var11;
                        var32 = 8192 + (var28 * param7[8] + var26 * param7[6] + var27 * param7[7]) >> 14;
                        var32 = var32 + var12_int;
                        var33 = 0;
                        L69: while (true) {
                          if (~var33 <= ~var9_int) {
                            break L66;
                          } else {
                            L70: {
                              var34 = param1[var33];
                              if (~var34 > ~((np) this).field_d.length) {
                                var35 = ((np) this).field_d[var34];
                                var36 = 0;
                                L71: while (true) {
                                  if (~var36 <= ~var35.length) {
                                    break L70;
                                  } else {
                                    L72: {
                                      L73: {
                                        var37 = var35[var36];
                                        if (null == ((np) this).field_db) {
                                          break L73;
                                        } else {
                                          if ((param6 & ((np) this).field_db[var37]) == 0) {
                                            break L72;
                                          } else {
                                            break L73;
                                          }
                                        }
                                      }
                                      var38 = ((np) this).field_A[var37] * var29[2] + (((np) this).field_P[var37] * var29[0] + var29[1] * ((np) this).field_K[var37] - -8192) >> 14;
                                      var39 = 8192 + (((np) this).field_K[var37] * var29[4] + ((np) this).field_P[var37] * var29[3] + ((np) this).field_A[var37] * var29[5]) >> 14;
                                      var38 = var38 + var30;
                                      var39 = var39 + var31;
                                      var40 = 8192 + (var29[8] * ((np) this).field_A[var37] + var29[6] * ((np) this).field_P[var37]) + ((np) this).field_K[var37] * var29[7] >> 14;
                                      ((np) this).field_P[var37] = var38;
                                      var40 = var40 + var32;
                                      ((np) this).field_K[var37] = var39;
                                      ((np) this).field_A[var37] = var40;
                                      break L72;
                                    }
                                    var36++;
                                    continue L71;
                                  }
                                }
                              } else {
                                break L70;
                              }
                            }
                            var33++;
                            continue L69;
                          }
                        }
                      } else {
                        var31 = 0;
                        L74: while (true) {
                          if (var31 >= 3) {
                            var30++;
                            continue L68;
                          } else {
                            var32 = 0;
                            var33 = 0;
                            L75: while (true) {
                              if (var33 >= 3) {
                                var29[3 * var30 - -var31] = var32 + 8192 >> 14;
                                var31++;
                                continue L74;
                              } else {
                                var32 = var32 + var25[var31 + 3 * var33] * param7[var33 + var30 * 3];
                                var33++;
                                continue L75;
                              }
                            }
                          }
                        }
                      }
                    }
                  } else {
                    var10 = 0;
                    L76: while (true) {
                      if (~var10 <= ~var9_int) {
                        break L66;
                      } else {
                        L77: {
                          var11 = param1[var10];
                          if (((np) this).field_d.length > var11) {
                            var12 = ((np) this).field_d[var11];
                            var13 = 0;
                            L78: while (true) {
                              if (var13 >= var12.length) {
                                break L77;
                              } else {
                                L79: {
                                  L80: {
                                    var14_int = var12[var13];
                                    if (null == ((np) this).field_db) {
                                      break L80;
                                    } else {
                                      if (0 != (((np) this).field_db[var14_int] & param6)) {
                                        break L80;
                                      } else {
                                        break L79;
                                      }
                                    }
                                  }
                                  ((np) this).field_P[var14_int] = ((np) this).field_P[var14_int] - rp.field_i;
                                  ((np) this).field_K[var14_int] = ((np) this).field_K[var14_int] - via.field_e;
                                  ((np) this).field_A[var14_int] = ((np) this).field_A[var14_int] - dj.field_b;
                                  ((np) this).field_P[var14_int] = ((np) this).field_P[var14_int] * param2 >> 7;
                                  ((np) this).field_K[var14_int] = ((np) this).field_K[var14_int] * param3 >> 7;
                                  ((np) this).field_A[var14_int] = ((np) this).field_A[var14_int] * param4 >> 7;
                                  ((np) this).field_P[var14_int] = ((np) this).field_P[var14_int] + rp.field_i;
                                  ((np) this).field_K[var14_int] = ((np) this).field_K[var14_int] + via.field_e;
                                  ((np) this).field_A[var14_int] = ((np) this).field_A[var14_int] + dj.field_b;
                                  break L79;
                                }
                                var13++;
                                continue L78;
                              }
                            }
                          } else {
                            break L77;
                          }
                        }
                        var10++;
                        continue L76;
                      }
                    }
                  }
                }
                return;
              }
            }
          }
        } else {
          param4 = param4 << 4;
          param2 = param2 << 4;
          param3 = param3 << 4;
          rp.field_i = 0;
          var10 = 0;
          dj.field_b = 0;
          via.field_e = 0;
          var11 = 0;
          L81: while (true) {
            if (~var9_int >= ~var11) {
              L82: {
                if (var10 > 0) {
                  via.field_e = param3 + via.field_e / var10;
                  dj.field_b = dj.field_b / var10 + param4;
                  rp.field_i = param2 + rp.field_i / var10;
                  vea.field_b = true;
                  break L82;
                } else {
                  via.field_e = param3;
                  dj.field_b = param4;
                  rp.field_i = param2;
                  break L82;
                }
              }
              return;
            } else {
              L83: {
                var12_int = param1[var11];
                if (~var12_int > ~((np) this).field_d.length) {
                  var13_ref_int__ = ((np) this).field_d[var12_int];
                  var14_int = 0;
                  L84: while (true) {
                    if (var14_int >= var13_ref_int__.length) {
                      break L83;
                    } else {
                      L85: {
                        L86: {
                          var15 = var13_ref_int__[var14_int];
                          if (null == ((np) this).field_db) {
                            break L86;
                          } else {
                            if ((param6 & ((np) this).field_db[var15]) != 0) {
                              break L86;
                            } else {
                              break L85;
                            }
                          }
                        }
                        rp.field_i = rp.field_i + ((np) this).field_P[var15];
                        via.field_e = via.field_e + ((np) this).field_K[var15];
                        dj.field_b = dj.field_b + ((np) this).field_A[var15];
                        var10++;
                        break L85;
                      }
                      var14_int++;
                      continue L84;
                    }
                  }
                } else {
                  break L83;
                }
              }
              var11++;
              continue L81;
            }
          }
        }
    }

    final static void b(int param0) {
        RuntimeException var1 = null;
        int var1_int = 0;
        int var2 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            int discarded$2 = -77;
            var1_int = jv.d();
            var2 = za.a(18998);
            aoa.field_b.a((byte) 57, var1_int + (jf.field_q << 1), -gm.field_m + wp.field_b, wt.field_a - jf.field_q, (gm.field_m << 1) + var2);
            int discarded$3 = 125;
            mi.a();
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw tba.a((Throwable) (Object) var1, "np.P(" + -69 + 41);
        }
    }

    private final void b(byte param0) {
        RuntimeException var2 = null;
        oba var2_ref = null;
        int var3 = 0;
        pm var4 = null;
        fd var5 = null;
        float var6 = 0.0f;
        float var7 = 0.0f;
        float var8 = 0.0f;
        float var9 = 0.0f;
        float var10 = 0.0f;
        float var11 = 0.0f;
        float var12 = 0.0f;
        int var13 = 0;
        int var14 = 0;
        cka stackIn_5_0 = null;
        cka stackIn_7_0 = null;
        cka stackIn_8_0 = null;
        int stackIn_8_1 = 0;
        RuntimeException decompiledCaughtException = null;
        cka stackOut_4_0 = null;
        cka stackOut_7_0 = null;
        int stackOut_7_1 = 0;
        cka stackOut_5_0 = null;
        int stackOut_5_1 = 0;
        var14 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              if (null != ((np) this).field_r) {
                L2: {
                  var2_ref = ((np) this).field_R.field_mc;
                  ((np) this).field_R.u(28630);
                  stackOut_4_0 = ((np) this).field_R;
                  stackIn_7_0 = stackOut_4_0;
                  stackIn_5_0 = stackOut_4_0;
                  if (((np) this).field_s) {
                    stackOut_7_0 = (cka) (Object) stackIn_7_0;
                    stackOut_7_1 = 0;
                    stackIn_8_0 = stackOut_7_0;
                    stackIn_8_1 = stackOut_7_1;
                    break L2;
                  } else {
                    stackOut_5_0 = (cka) (Object) stackIn_5_0;
                    stackOut_5_1 = 1;
                    stackIn_8_0 = stackOut_5_0;
                    stackIn_8_1 = stackOut_5_1;
                    break L2;
                  }
                }
                ((cka) (Object) stackIn_8_0).a(stackIn_8_1 != 0, false);
                ((np) this).field_R.a(63, false);
                ((np) this).field_R.a((tj) null, ((np) this).field_R.field_Rb, (tj) null, -114, ((np) this).field_R.field_Bc);
                var3 = 0;
                L3: while (true) {
                  if (~var3 <= ~((np) this).field_G) {
                    ((np) this).field_R.a(true, false);
                    ((np) this).field_R.n((byte) -65);
                    break L1;
                  } else {
                    L4: {
                      L5: {
                        var4 = ((np) this).field_r[var3];
                        var5 = ((np) this).field_f[var3];
                        if (!var4.field_g) {
                          break L5;
                        } else {
                          if (((np) this).field_R.f()) {
                            break L4;
                          } else {
                            break L5;
                          }
                        }
                      }
                      var6 = (float)(((np) this).field_P[var4.field_b] + ((np) this).field_P[var4.field_k] + ((np) this).field_P[var4.field_m]) * 0.3333333134651184f;
                      var7 = 0.3333333134651184f * (float)(((np) this).field_K[var4.field_b] + ((np) this).field_K[var4.field_k] + ((np) this).field_K[var4.field_m]);
                      var8 = (float)(((np) this).field_A[var4.field_k] + ((np) this).field_A[var4.field_m] + ((np) this).field_A[var4.field_b]) * 0.3333333134651184f;
                      var9 = aka.field_B + (var8 * mu.field_ub + (eqa.field_a * var7 + var6 * is.field_Ab));
                      var10 = ef.field_s + (var6 * qi.field_L + nw.field_u * var7 + bva.field_c * var8);
                      var11 = bja.field_b + (kka.field_q * var8 + (var7 * it.field_a + var6 * roa.field_u));
                      var12 = (float)(1.0 / Math.sqrt((double)(var11 * var11 + (var10 * var10 + var9 * var9)))) * (float)var4.field_j;
                      var2_ref.a(var5.field_g, var12 * var11 + -var11, var9 + (float)var5.field_h - var9 * var12, var4.field_e * var5.field_f >> 7, (byte) -60, var4.field_i * var5.field_b >> 7, var12 * var10 + (-var10 + (float)var5.field_a));
                      ((np) this).field_R.a(var2_ref, 0);
                      var13 = var5.field_c;
                      jaggl.OpenGL.glColor4ub((byte)(var13 >> 16), (byte)(var13 >> 8), (byte)var13, (byte)(var13 >> 24));
                      ((np) this).field_R.c((int) var4.field_f, 32677);
                      ((np) this).field_R.a((byte) 94, (int) var4.field_c);
                      ((np) this).field_R.a(0, 4, 7, true);
                      break L4;
                    }
                    var3++;
                    continue L3;
                  }
                }
              } else {
                break L1;
              }
            }
            L6: {
              if (-30 == -30) {
                break L6;
              } else {
                ((np) this).a(-99, (int[]) null, -39, -40, 4, -64, false);
                break L6;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw tba.a((Throwable) (Object) var2, "np.F(" + -30 + 41);
        }
    }

    final void a(gda param0, el param1, int param2) {
        RuntimeException var4 = null;
        oba var4_ref = null;
        oba var5 = null;
        float var6 = 0.0f;
        float var7 = 0.0f;
        float var8 = 0.0f;
        float var9 = 0.0f;
        float var10 = 0.0f;
        float var11 = 0.0f;
        float var12 = 0.0f;
        float var13 = 0.0f;
        float var14 = 0.0f;
        float var15 = 0.0f;
        float var16 = 0.0f;
        float var17 = 0.0f;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        int var23 = 0;
        int var24 = 0;
        RuntimeException stackIn_65_0 = null;
        StringBuilder stackIn_65_1 = null;
        RuntimeException stackIn_67_0 = null;
        StringBuilder stackIn_67_1 = null;
        RuntimeException stackIn_68_0 = null;
        StringBuilder stackIn_68_1 = null;
        String stackIn_68_2 = null;
        RuntimeException stackIn_69_0 = null;
        StringBuilder stackIn_69_1 = null;
        RuntimeException stackIn_71_0 = null;
        StringBuilder stackIn_71_1 = null;
        RuntimeException stackIn_72_0 = null;
        StringBuilder stackIn_72_1 = null;
        String stackIn_72_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_64_0 = null;
        StringBuilder stackOut_64_1 = null;
        RuntimeException stackOut_67_0 = null;
        StringBuilder stackOut_67_1 = null;
        String stackOut_67_2 = null;
        RuntimeException stackOut_65_0 = null;
        StringBuilder stackOut_65_1 = null;
        String stackOut_65_2 = null;
        RuntimeException stackOut_68_0 = null;
        StringBuilder stackOut_68_1 = null;
        RuntimeException stackOut_71_0 = null;
        StringBuilder stackOut_71_1 = null;
        String stackOut_71_2 = null;
        RuntimeException stackOut_69_0 = null;
        StringBuilder stackOut_69_1 = null;
        String stackOut_69_2 = null;
        var24 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            if (((np) this).field_L == 0) {
              return;
            } else {
              L1: {
                var4_ref = ((np) this).field_R.field_jd;
                var5 = (oba) (Object) param0;
                if (((np) this).field_l) {
                  break L1;
                } else {
                  this.c(2709);
                  break L1;
                }
              }
              L2: {
                bja.field_b = var4_ref.field_o + (var4_ref.field_j * var5.field_m + var4_ref.field_h * var5.field_p + var4_ref.field_q * var5.field_o);
                it.field_a = var5.field_k * var4_ref.field_j + var4_ref.field_h * var5.field_r + var4_ref.field_q * var5.field_h;
                var6 = bja.field_b + (float)((np) this).field_eb * it.field_a;
                var7 = bja.field_b + it.field_a * (float)((np) this).field_v;
                if (var7 >= var6) {
                  var9 = var7 + (float)((np) this).field_M;
                  var8 = (float)(-((np) this).field_M) + var6;
                  break L2;
                } else {
                  var8 = var7 - (float)((np) this).field_M;
                  var9 = (float)((np) this).field_M + var6;
                  break L2;
                }
              }
              if (var8 >= ((np) this).field_R.field_u) {
                return;
              } else {
                if ((float)((np) this).field_R.field_Gc < var9) {
                  L3: {
                    eqa.field_a = var5.field_h * var4_ref.field_s + (var5.field_r * var4_ref.field_k + var5.field_k * var4_ref.field_l);
                    aka.field_B = var5.field_m * var4_ref.field_l + var5.field_p * var4_ref.field_k + var4_ref.field_s * var5.field_o + var4_ref.field_m;
                    var10 = aka.field_B + (float)((np) this).field_eb * eqa.field_a;
                    var11 = eqa.field_a * (float)((np) this).field_v + aka.field_B;
                    if (var10 > var11) {
                      var13 = ((float)((np) this).field_M + var10) * (float)((np) this).field_R.field_W;
                      var12 = ((float)(-((np) this).field_M) + var11) * (float)((np) this).field_R.field_W;
                      break L3;
                    } else {
                      var13 = (float)((np) this).field_R.field_W * (var11 + (float)((np) this).field_M);
                      var12 = (var10 - (float)((np) this).field_M) * (float)((np) this).field_R.field_W;
                      break L3;
                    }
                  }
                  if (((np) this).field_R.field_od > var12 / var9) {
                    if (var13 / var9 > ((np) this).field_R.field_s) {
                      L4: {
                        nw.field_u = var4_ref.field_r * var5.field_r + var4_ref.field_i * var5.field_k + var5.field_h * var4_ref.field_g;
                        ef.field_s = var5.field_o * var4_ref.field_g + (var5.field_m * var4_ref.field_i + var5.field_p * var4_ref.field_r) + var4_ref.field_p;
                        var14 = ef.field_s + (float)((np) this).field_eb * nw.field_u;
                        var15 = ef.field_s + nw.field_u * (float)((np) this).field_v;
                        if (var15 >= var14) {
                          var16 = (float)((np) this).field_R.field_kb * ((float)(-((np) this).field_M) + var14);
                          var17 = (float)((np) this).field_R.field_kb * ((float)((np) this).field_M + var15);
                          break L4;
                        } else {
                          var17 = (float)((np) this).field_R.field_kb * (var14 + (float)((np) this).field_M);
                          var16 = (float)((np) this).field_R.field_kb * (var15 - (float)((np) this).field_M);
                          break L4;
                        }
                      }
                      if (((np) this).field_R.field_Db > var16 / var9) {
                        if (((np) this).field_R.field_nd >= var17 / var9) {
                          return;
                        } else {
                          L5: {
                            L6: {
                              if (param1 != null) {
                                break L6;
                              } else {
                                if (((np) this).field_r == null) {
                                  break L5;
                                } else {
                                  break L6;
                                }
                              }
                            }
                            is.field_Ab = var5.field_i * var4_ref.field_k + var5.field_l * var4_ref.field_l + var4_ref.field_s * var5.field_j;
                            roa.field_u = var4_ref.field_q * var5.field_j + (var5.field_l * var4_ref.field_j + var5.field_i * var4_ref.field_h);
                            kka.field_q = var4_ref.field_q * var5.field_q + (var5.field_g * var4_ref.field_h + var4_ref.field_j * var5.field_s);
                            mu.field_ub = var4_ref.field_s * var5.field_q + (var4_ref.field_l * var5.field_s + var5.field_g * var4_ref.field_k);
                            qi.field_L = var5.field_j * var4_ref.field_g + (var5.field_i * var4_ref.field_r + var4_ref.field_i * var5.field_l);
                            bva.field_c = var5.field_s * var4_ref.field_i + var4_ref.field_r * var5.field_g + var5.field_q * var4_ref.field_g;
                            break L5;
                          }
                          L7: {
                            if (param1 == null) {
                              break L7;
                            } else {
                              L8: {
                                var18 = 0;
                                var19 = 1;
                                var20 = ((np) this).field_U + ((np) this).field_T >> 1;
                                var21 = ((np) this).field_k + ((np) this).field_S >> 1;
                                var22 = (int)((float)var21 * kka.field_q + (it.field_a * (float)((np) this).field_eb + ((float)var20 * roa.field_u + bja.field_b)));
                                if (~((np) this).field_R.field_Gc < ~var22) {
                                  var18 = 1;
                                  break L8;
                                } else {
                                  break L8;
                                }
                              }
                              L9: {
                                var23 = (int)(bja.field_b + roa.field_u * (float)var20 + it.field_a * (float)((np) this).field_v + (float)var21 * kka.field_q);
                                if (var23 >= ((np) this).field_R.field_Gc) {
                                  break L9;
                                } else {
                                  var18 = 1;
                                  break L9;
                                }
                              }
                              L10: {
                                if (var18 == 0) {
                                  break L10;
                                } else {
                                  L11: {
                                    if (var22 >= ((np) this).field_R.field_Gc) {
                                      break L11;
                                    } else {
                                      if (~((np) this).field_R.field_Gc >= ~var23) {
                                        break L11;
                                      } else {
                                        var19 = 0;
                                        break L10;
                                      }
                                    }
                                  }
                                  if (~var22 <= ~((np) this).field_R.field_Gc) {
                                    if (var23 < ((np) this).field_R.field_Gc) {
                                      break L10;
                                    } else {
                                      break L10;
                                    }
                                  } else {
                                    break L10;
                                  }
                                }
                              }
                              if (var19 == 0) {
                                break L7;
                              } else {
                                if (~var23 <= ~var22) {
                                  break L7;
                                } else {
                                  break L7;
                                }
                              }
                            }
                          }
                          ((np) this).field_R.c(false);
                          ((np) this).field_R.b(var5, 117);
                          this.a(false);
                          ((np) this).field_R.n((byte) -96);
                          this.b((byte) -30);
                          break L0;
                        }
                      } else {
                        return;
                      }
                    } else {
                      return;
                    }
                  } else {
                    return;
                  }
                } else {
                  return;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L12: {
            var4 = decompiledCaughtException;
            stackOut_64_0 = (RuntimeException) var4;
            stackOut_64_1 = new StringBuilder().append("np.N(");
            stackIn_67_0 = stackOut_64_0;
            stackIn_67_1 = stackOut_64_1;
            stackIn_65_0 = stackOut_64_0;
            stackIn_65_1 = stackOut_64_1;
            if (param0 == null) {
              stackOut_67_0 = (RuntimeException) (Object) stackIn_67_0;
              stackOut_67_1 = (StringBuilder) (Object) stackIn_67_1;
              stackOut_67_2 = "null";
              stackIn_68_0 = stackOut_67_0;
              stackIn_68_1 = stackOut_67_1;
              stackIn_68_2 = stackOut_67_2;
              break L12;
            } else {
              stackOut_65_0 = (RuntimeException) (Object) stackIn_65_0;
              stackOut_65_1 = (StringBuilder) (Object) stackIn_65_1;
              stackOut_65_2 = "{...}";
              stackIn_68_0 = stackOut_65_0;
              stackIn_68_1 = stackOut_65_1;
              stackIn_68_2 = stackOut_65_2;
              break L12;
            }
          }
          L13: {
            stackOut_68_0 = (RuntimeException) (Object) stackIn_68_0;
            stackOut_68_1 = ((StringBuilder) (Object) stackIn_68_1).append(stackIn_68_2).append(44);
            stackIn_71_0 = stackOut_68_0;
            stackIn_71_1 = stackOut_68_1;
            stackIn_69_0 = stackOut_68_0;
            stackIn_69_1 = stackOut_68_1;
            if (param1 == null) {
              stackOut_71_0 = (RuntimeException) (Object) stackIn_71_0;
              stackOut_71_1 = (StringBuilder) (Object) stackIn_71_1;
              stackOut_71_2 = "null";
              stackIn_72_0 = stackOut_71_0;
              stackIn_72_1 = stackOut_71_1;
              stackIn_72_2 = stackOut_71_2;
              break L13;
            } else {
              stackOut_69_0 = (RuntimeException) (Object) stackIn_69_0;
              stackOut_69_1 = (StringBuilder) (Object) stackIn_69_1;
              stackOut_69_2 = "{...}";
              stackIn_72_0 = stackOut_69_0;
              stackIn_72_1 = stackOut_69_1;
              stackIn_72_2 = stackOut_69_2;
              break L13;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_72_0, stackIn_72_2 + 44 + param2 + 41);
        }
    }

    final void b() {
    }

    final boolean NA() {
        int var1_int = 0;
        RuntimeException var1 = null;
        int var2 = 0;
        int stackIn_3_0 = 0;
        int stackIn_10_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_9_0 = 0;
        int stackOut_2_0 = 0;
        var2 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            if (((np) this).field_d != null) {
              var1_int = 0;
              L1: while (true) {
                if (~((np) this).field_N >= ~var1_int) {
                  rp.field_i = 0;
                  dj.field_b = 0;
                  via.field_e = 0;
                  stackOut_9_0 = 1;
                  stackIn_10_0 = stackOut_9_0;
                  break L0;
                } else {
                  ((np) this).field_P[var1_int] = ((np) this).field_P[var1_int] << 4;
                  ((np) this).field_K[var1_int] = ((np) this).field_K[var1_int] << 4;
                  ((np) this).field_A[var1_int] = ((np) this).field_A[var1_int] << 4;
                  var1_int++;
                  continue L1;
                }
              }
            } else {
              stackOut_2_0 = 0;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw tba.a((Throwable) (Object) var1, "np.NA()");
        }
        return stackIn_10_0 != 0;
    }

    private final void a(int param0, boolean param1) {
        int var3_int = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        qf var12 = null;
        int var13_int = 0;
        short[] var13 = null;
        va var13_ref = null;
        short[] var14 = null;
        int var14_int = 0;
        short[] var15 = null;
        int var15_int = 0;
        byte[] var16 = null;
        int var16_int = 0;
        int var17_int = 0;
        float var17 = 0.0f;
        int var18_int = 0;
        float var18 = 0.0f;
        int var19 = 0;
        float var19_float = 0.0f;
        int var20 = 0;
        float var20_float = 0.0f;
        float var21 = 0.0f;
        float var22 = 0.0f;
        int var23 = 0;
        int var24 = 0;
        int var25 = 0;
        int var26 = 0;
        int var27 = 0;
        float var28 = 0.0f;
        float var29 = 0.0f;
        float var30 = 0.0f;
        float var31 = 0.0f;
        float var32 = 0.0f;
        float var33 = 0.0f;
        int var34 = 0;
        int var35 = 0;
        int stackIn_5_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_15_0 = 0;
        int stackIn_21_0 = 0;
        int stackIn_23_0 = 0;
        int stackIn_24_0 = 0;
        int stackIn_25_0 = 0;
        int stackIn_26_0 = 0;
        int stackIn_26_1 = 0;
        int stackIn_27_0 = 0;
        int stackIn_28_0 = 0;
        int stackIn_29_0 = 0;
        int stackIn_29_1 = 0;
        int stackIn_30_0 = 0;
        int stackIn_31_0 = 0;
        int stackIn_32_0 = 0;
        int stackIn_32_1 = 0;
        int stackIn_33_0 = 0;
        int stackIn_34_0 = 0;
        int stackIn_35_0 = 0;
        int stackIn_35_1 = 0;
        float stackIn_92_0 = 0.0f;
        float stackIn_112_0 = 0.0f;
        float stackIn_112_1 = 0.0f;
        float stackIn_113_0 = 0.0f;
        float stackIn_113_1 = 0.0f;
        float stackIn_114_0 = 0.0f;
        float stackIn_114_1 = 0.0f;
        float stackIn_114_2 = 0.0f;
        float stackIn_137_0 = 0.0f;
        int stackOut_3_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_19_0 = 0;
        int stackOut_20_0 = 0;
        int stackOut_22_0 = 0;
        int stackOut_25_0 = 0;
        int stackOut_25_1 = 0;
        int stackOut_23_0 = 0;
        int stackOut_24_0 = 0;
        int stackOut_24_1 = 0;
        int stackOut_26_0 = 0;
        int stackOut_28_0 = 0;
        int stackOut_28_1 = 0;
        int stackOut_27_0 = 0;
        int stackOut_27_1 = 0;
        int stackOut_29_0 = 0;
        int stackOut_31_0 = 0;
        int stackOut_31_1 = 0;
        int stackOut_30_0 = 0;
        int stackOut_30_1 = 0;
        int stackOut_32_0 = 0;
        int stackOut_34_0 = 0;
        int stackOut_34_1 = 0;
        int stackOut_33_0 = 0;
        int stackOut_33_1 = 0;
        float stackOut_91_0 = 0.0f;
        float stackOut_90_0 = 0.0f;
        float stackOut_111_0 = 0.0f;
        float stackOut_111_1 = 0.0f;
        float stackOut_113_0 = 0.0f;
        float stackOut_113_1 = 0.0f;
        float stackOut_113_2 = 0.0f;
        float stackOut_112_0 = 0.0f;
        float stackOut_112_1 = 0.0f;
        float stackOut_112_2 = 0.0f;
        float stackOut_136_0 = 0.0f;
        float stackOut_135_0 = 0.0f;
        L0: {
          L1: {
            var35 = TombRacer.field_G ? 1 : 0;
            if (((np) this).field_kb == null) {
              break L1;
            } else {
              if (((np) this).field_kb.field_d != null) {
                break L1;
              } else {
                stackOut_3_0 = 1;
                stackIn_5_0 = stackOut_3_0;
                break L0;
              }
            }
          }
          stackOut_4_0 = 0;
          stackIn_5_0 = stackOut_4_0;
          break L0;
        }
        L2: {
          L3: {
            var3_int = stackIn_5_0;
            if (null == ((np) this).field_F) {
              break L3;
            } else {
              if (null != ((np) this).field_F.field_d) {
                break L3;
              } else {
                stackOut_8_0 = 1;
                stackIn_10_0 = stackOut_8_0;
                break L2;
              }
            }
          }
          stackOut_9_0 = 0;
          stackIn_10_0 = stackOut_9_0;
          break L2;
        }
        L4: {
          L5: {
            var4 = stackIn_10_0;
            if (null == ((np) this).field_g) {
              break L5;
            } else {
              if (((np) this).field_g.field_d != null) {
                break L5;
              } else {
                stackOut_13_0 = 1;
                stackIn_15_0 = stackOut_13_0;
                break L4;
              }
            }
          }
          stackOut_14_0 = 0;
          stackIn_15_0 = stackOut_14_0;
          break L4;
        }
        var5 = stackIn_15_0;
        L6: {
          L7: {
            if (((np) this).field_ab == null) {
              break L7;
            } else {
              if (((np) this).field_ab.field_d != null) {
                break L7;
              } else {
                stackOut_19_0 = 1;
                stackIn_21_0 = stackOut_19_0;
                break L6;
              }
            }
          }
          stackOut_20_0 = 0;
          stackIn_21_0 = stackOut_20_0;
          break L6;
        }
        L8: {
          var6 = stackIn_21_0;
          if (!param1) {
            break L8;
          } else {
            L9: {
              stackOut_22_0 = var6;
              stackIn_25_0 = stackOut_22_0;
              stackIn_23_0 = stackOut_22_0;
              if ((8 & ((np) this).field_Z) == 0) {
                stackOut_25_0 = stackIn_25_0;
                stackOut_25_1 = 0;
                stackIn_26_0 = stackOut_25_0;
                stackIn_26_1 = stackOut_25_1;
                break L9;
              } else {
                stackOut_23_0 = stackIn_23_0;
                stackIn_24_0 = stackOut_23_0;
                stackOut_24_0 = stackIn_24_0;
                stackOut_24_1 = 1;
                stackIn_26_0 = stackOut_24_0;
                stackIn_26_1 = stackOut_24_1;
                break L9;
              }
            }
            L10: {
              var6 = stackIn_26_0 & stackIn_26_1;
              stackOut_26_0 = var5;
              stackIn_28_0 = stackOut_26_0;
              stackIn_27_0 = stackOut_26_0;
              if ((((np) this).field_Z & 1) == 0) {
                stackOut_28_0 = stackIn_28_0;
                stackOut_28_1 = 0;
                stackIn_29_0 = stackOut_28_0;
                stackIn_29_1 = stackOut_28_1;
                break L10;
              } else {
                stackOut_27_0 = stackIn_27_0;
                stackOut_27_1 = 1;
                stackIn_29_0 = stackOut_27_0;
                stackIn_29_1 = stackOut_27_1;
                break L10;
              }
            }
            L11: {
              var5 = stackIn_29_0 & stackIn_29_1;
              stackOut_29_0 = var4;
              stackIn_31_0 = stackOut_29_0;
              stackIn_30_0 = stackOut_29_0;
              if ((4 & ((np) this).field_Z) == 0) {
                stackOut_31_0 = stackIn_31_0;
                stackOut_31_1 = 0;
                stackIn_32_0 = stackOut_31_0;
                stackIn_32_1 = stackOut_31_1;
                break L11;
              } else {
                stackOut_30_0 = stackIn_30_0;
                stackOut_30_1 = 1;
                stackIn_32_0 = stackOut_30_0;
                stackIn_32_1 = stackOut_30_1;
                break L11;
              }
            }
            L12: {
              var4 = stackIn_32_0 & stackIn_32_1;
              stackOut_32_0 = var3_int;
              stackIn_34_0 = stackOut_32_0;
              stackIn_33_0 = stackOut_32_0;
              if ((2 & ((np) this).field_Z) == 0) {
                stackOut_34_0 = stackIn_34_0;
                stackOut_34_1 = 0;
                stackIn_35_0 = stackOut_34_0;
                stackIn_35_1 = stackOut_34_1;
                break L12;
              } else {
                stackOut_33_0 = stackIn_33_0;
                stackOut_33_1 = 1;
                stackIn_35_0 = stackOut_33_0;
                stackIn_35_1 = stackOut_33_1;
                break L12;
              }
            }
            var3_int = stackIn_35_0 & stackIn_35_1;
            break L8;
          }
        }
        L13: {
          var7 = 0;
          var8 = 0;
          var9 = 0;
          var10 = 0;
          if (var5 != 0) {
            var8 = var7;
            var7 = (byte)(var7 + 12);
            break L13;
          } else {
            break L13;
          }
        }
        L14: {
          var11 = 0;
          if (var3_int == 0) {
            break L14;
          } else {
            var9 = var7;
            var7 = (byte)(var7 + 4);
            break L14;
          }
        }
        L15: {
          if (var4 != 0) {
            var10 = var7;
            var7 = (byte)(var7 + 12);
            break L15;
          } else {
            break L15;
          }
        }
        L16: {
          if (var6 == 0) {
            break L16;
          } else {
            var11 = var7;
            var7 = (byte)(var7 + 8);
            break L16;
          }
        }
        if (var7 == 0) {
          return;
        } else {
          L17: {
            if (~((np) this).field_R.field_cb.field_g.length <= ~(((np) this).field_L * var7)) {
              ((np) this).field_R.field_cb.field_h = 0;
              break L17;
            } else {
              ((np) this).field_R.field_cb = new qf((((np) this).field_L + 100) * var7);
              break L17;
            }
          }
          L18: {
            var12 = ((np) this).field_R.field_cb;
            if (var5 == 0) {
              break L18;
            } else {
              if (((np) this).field_R.field_O) {
                var13_int = 0;
                L19: while (true) {
                  if (~var13_int <= ~((np) this).field_lb) {
                    break L18;
                  } else {
                    var14_int = jaclib.memory.Stream.floatToRawIntBits((float)((np) this).field_P[var13_int]);
                    var15_int = jaclib.memory.Stream.floatToRawIntBits((float)((np) this).field_K[var13_int]);
                    var16_int = jaclib.memory.Stream.floatToRawIntBits((float)((np) this).field_A[var13_int]);
                    var17_int = ((np) this).field_e[var13_int];
                    var18_int = ((np) this).field_e[1 + var13_int];
                    var19 = var17_int;
                    L20: while (true) {
                      L21: {
                        if (var19 >= var18_int) {
                          break L21;
                        } else {
                          var20 = ((np) this).field_q[var19] - 1;
                          if (-1 != var20) {
                            var12.field_h = var20 * var7;
                            var12.a(var14_int, (byte) -72);
                            var12.a(var15_int, (byte) -13);
                            var12.a(var16_int, (byte) 81);
                            var19++;
                            continue L20;
                          } else {
                            break L21;
                          }
                        }
                      }
                      var13_int++;
                      continue L19;
                    }
                  }
                }
              } else {
                var13_int = 0;
                L22: while (true) {
                  if (~var13_int <= ~((np) this).field_lb) {
                    break L18;
                  } else {
                    var14_int = jaclib.memory.Stream.floatToRawIntBits((float)((np) this).field_P[var13_int]);
                    var15_int = jaclib.memory.Stream.floatToRawIntBits((float)((np) this).field_K[var13_int]);
                    var16_int = jaclib.memory.Stream.floatToRawIntBits((float)((np) this).field_A[var13_int]);
                    var17_int = ((np) this).field_e[var13_int];
                    var18_int = ((np) this).field_e[1 + var13_int];
                    var19 = var17_int;
                    L23: while (true) {
                      L24: {
                        if (~var18_int >= ~var19) {
                          break L24;
                        } else {
                          var20 = ((np) this).field_q[var19] - 1;
                          if (var20 != -1) {
                            var12.field_h = var7 * var20;
                            var12.a((byte) -35, var14_int);
                            var12.a((byte) -35, var15_int);
                            var12.a((byte) -35, var16_int);
                            var19++;
                            continue L23;
                          } else {
                            break L24;
                          }
                        }
                      }
                      var13_int++;
                      continue L22;
                    }
                  }
                }
              }
            }
          }
          L25: {
            if (var3_int == 0) {
              break L25;
            } else {
              if (null == ((np) this).field_F) {
                L26: {
                  if (((np) this).field_i == null) {
                    var16 = ((np) this).field_O;
                    var13 = ((np) this).field_E;
                    var14 = ((np) this).field_Y;
                    var15 = ((np) this).field_cb;
                    break L26;
                  } else {
                    var16 = ((np) this).field_i.field_e;
                    var13 = ((np) this).field_i.field_d;
                    var14 = ((np) this).field_i.field_b;
                    var15 = ((np) this).field_i.field_f;
                    break L26;
                  }
                }
                var28 = ((np) this).field_R.field_Wb[0];
                var29 = ((np) this).field_R.field_Wb[1];
                var30 = ((np) this).field_R.field_Wb[2];
                var31 = ((np) this).field_R.field_tc;
                var32 = ((np) this).field_R.field_cd * 768.0f / (float)((np) this).field_h;
                var33 = 768.0f * ((np) this).field_R.field_Sb / (float)((np) this).field_h;
                var34 = 0;
                L27: while (true) {
                  if (~((np) this).field_W >= ~var34) {
                    break L25;
                  } else {
                    L28: {
                      var24 = this.a(-2117016184, (int) ((np) this).field_X[var34], ((np) this).field_o[var34], ((np) this).field_I[var34], (int) ((np) this).field_B);
                      var20_float = (float)(var24 >>> 24) * ((np) this).field_R.field_wc;
                      var22 = ((np) this).field_R.field_bc * (float)(255 & var24 >> 8);
                      var21 = (float)(var24 >> 16 & 255) * ((np) this).field_R.field_Fb;
                      var23 = ((np) this).field_H[var34];
                      var17_int = (short)var16[var23];
                      if (var17_int == 0) {
                        var18 = ((float)var15[var23] * var30 + ((float)var14[var23] * var29 + var28 * (float)var13[var23])) * 0.0026041667442768812f;
                        break L28;
                      } else {
                        var18 = ((float)var15[var23] * var30 + ((float)var13[var23] * var28 + var29 * (float)var14[var23])) / (float)(var17_int * 256);
                        break L28;
                      }
                    }
                    L29: {
                      if (var18 < 0.0f) {
                        stackOut_91_0 = var33;
                        stackIn_92_0 = stackOut_91_0;
                        break L29;
                      } else {
                        stackOut_90_0 = var32;
                        stackIn_92_0 = stackOut_90_0;
                        break L29;
                      }
                    }
                    L30: {
                      var19_float = stackIn_92_0 * var18 + var31;
                      var25 = (int)(var20_float * var19_float);
                      var26 = (int)(var19_float * var21);
                      if (var25 >= 0) {
                        if (var25 <= 255) {
                          break L30;
                        } else {
                          var25 = 255;
                          break L30;
                        }
                      } else {
                        var25 = 0;
                        break L30;
                      }
                    }
                    L31: {
                      if (0 <= var26) {
                        if (255 >= var26) {
                          break L31;
                        } else {
                          var26 = 255;
                          break L31;
                        }
                      } else {
                        var26 = 0;
                        break L31;
                      }
                    }
                    L32: {
                      var27 = (int)(var19_float * var22);
                      var12.field_h = var9 - -(var23 * var7);
                      if (0 <= var27) {
                        if (255 < var27) {
                          var27 = 255;
                          break L32;
                        } else {
                          break L32;
                        }
                      } else {
                        var27 = 0;
                        break L32;
                      }
                    }
                    L33: {
                      var12.i(var25, 0);
                      var12.i(var26, 0);
                      var12.i(var27, 0);
                      var12.i(255 + -(((np) this).field_o[var34] & 255), 0);
                      var23 = ((np) this).field_z[var34];
                      var17_int = (short)var16[var23];
                      if (var17_int == 0) {
                        var18 = ((float)var13[var23] * var28 + var29 * (float)var14[var23] + (float)var15[var23] * var30) * 0.0026041667442768812f;
                        break L33;
                      } else {
                        var18 = (var30 * (float)var15[var23] + (var28 * (float)var13[var23] + var29 * (float)var14[var23])) / (float)(256 * var17_int);
                        break L33;
                      }
                    }
                    L34: {
                      stackOut_111_0 = var31;
                      stackOut_111_1 = var18;
                      stackIn_113_0 = stackOut_111_0;
                      stackIn_113_1 = stackOut_111_1;
                      stackIn_112_0 = stackOut_111_0;
                      stackIn_112_1 = stackOut_111_1;
                      if (0.0f <= var18) {
                        stackOut_113_0 = stackIn_113_0;
                        stackOut_113_1 = stackIn_113_1;
                        stackOut_113_2 = var32;
                        stackIn_114_0 = stackOut_113_0;
                        stackIn_114_1 = stackOut_113_1;
                        stackIn_114_2 = stackOut_113_2;
                        break L34;
                      } else {
                        stackOut_112_0 = stackIn_112_0;
                        stackOut_112_1 = stackIn_112_1;
                        stackOut_112_2 = var33;
                        stackIn_114_0 = stackOut_112_0;
                        stackIn_114_1 = stackOut_112_1;
                        stackIn_114_2 = stackOut_112_2;
                        break L34;
                      }
                    }
                    L35: {
                      var19_float = stackIn_114_0 + stackIn_114_1 * stackIn_114_2;
                      var25 = (int)(var20_float * var19_float);
                      var26 = (int)(var19_float * var21);
                      if (var25 < 0) {
                        var25 = 0;
                        break L35;
                      } else {
                        if (255 < var25) {
                          var25 = 255;
                          break L35;
                        } else {
                          break L35;
                        }
                      }
                    }
                    L36: {
                      var27 = (int)(var19_float * var22);
                      if (var26 < 0) {
                        var26 = 0;
                        break L36;
                      } else {
                        if (255 < var26) {
                          var26 = 255;
                          break L36;
                        } else {
                          break L36;
                        }
                      }
                    }
                    L37: {
                      if (var27 < 0) {
                        var27 = 0;
                        break L37;
                      } else {
                        if (var27 <= 255) {
                          break L37;
                        } else {
                          var27 = 255;
                          break L37;
                        }
                      }
                    }
                    L38: {
                      var12.field_h = var23 * var7 + var9;
                      var12.i(var25, 0);
                      var12.i(var26, 0);
                      var12.i(var27, 0);
                      var12.i(255 - (255 & ((np) this).field_o[var34]), 0);
                      var23 = ((np) this).field_hb[var34];
                      var17_int = (short)var16[var23];
                      if (var17_int == 0) {
                        var18 = 0.0026041667442768812f * ((float)var13[var23] * var28 + var29 * (float)var14[var23] + (float)var15[var23] * var30);
                        break L38;
                      } else {
                        var18 = ((float)var15[var23] * var30 + (var29 * (float)var14[var23] + var28 * (float)var13[var23])) / (float)(var17_int * 256);
                        break L38;
                      }
                    }
                    L39: {
                      if (0.0f <= var18) {
                        stackOut_136_0 = var32;
                        stackIn_137_0 = stackOut_136_0;
                        break L39;
                      } else {
                        stackOut_135_0 = var33;
                        stackIn_137_0 = stackOut_135_0;
                        break L39;
                      }
                    }
                    L40: {
                      var19_float = stackIn_137_0 * var18 + var31;
                      var25 = (int)(var19_float * var20_float);
                      var26 = (int)(var19_float * var21);
                      if (var25 < 0) {
                        var25 = 0;
                        break L40;
                      } else {
                        if (var25 <= 255) {
                          break L40;
                        } else {
                          var25 = 255;
                          break L40;
                        }
                      }
                    }
                    L41: {
                      var27 = (int)(var22 * var19_float);
                      if (var26 >= 0) {
                        if (var26 > 255) {
                          var26 = 255;
                          break L41;
                        } else {
                          break L41;
                        }
                      } else {
                        var26 = 0;
                        break L41;
                      }
                    }
                    L42: {
                      if (0 <= var27) {
                        if (var27 <= 255) {
                          break L42;
                        } else {
                          var27 = 255;
                          break L42;
                        }
                      } else {
                        var27 = 0;
                        break L42;
                      }
                    }
                    var12.field_h = var9 + var7 * var23;
                    var12.i(var25, 0);
                    var12.i(var26, 0);
                    var12.i(var27, 0);
                    var12.i(-(((np) this).field_o[var34] & 255) + 255, 0);
                    var34++;
                    continue L27;
                  }
                }
              } else {
                var13_int = 0;
                L43: while (true) {
                  if (~((np) this).field_W >= ~var13_int) {
                    break L25;
                  } else {
                    var14_int = this.a(-2117016184, (int) ((np) this).field_X[var13_int], ((np) this).field_o[var13_int], ((np) this).field_I[var13_int], (int) ((np) this).field_B);
                    var12.field_h = var9 + var7 * ((np) this).field_H[var13_int];
                    var12.a(var14_int, (byte) 92);
                    var12.field_h = var7 * ((np) this).field_z[var13_int] + var9;
                    var12.a(var14_int, (byte) 91);
                    var12.field_h = var9 - -(((np) this).field_hb[var13_int] * var7);
                    var12.a(var14_int, (byte) 113);
                    var13_int++;
                    continue L43;
                  }
                }
              }
            }
          }
          L44: {
            if (var4 == 0) {
              break L44;
            } else {
              L45: {
                if (null == ((np) this).field_i) {
                  var15 = ((np) this).field_cb;
                  var14 = ((np) this).field_Y;
                  var13 = ((np) this).field_E;
                  var16 = ((np) this).field_O;
                  break L45;
                } else {
                  var13 = ((np) this).field_i.field_d;
                  var16 = ((np) this).field_i.field_e;
                  var15 = ((np) this).field_i.field_f;
                  var14 = ((np) this).field_i.field_b;
                  break L45;
                }
              }
              var17 = 3.0f / (float)((np) this).field_h;
              var12.field_h = var10;
              var18 = 3.0f / (float)(((np) this).field_h + ((np) this).field_h / 2);
              if (((np) this).field_R.field_O) {
                var19 = 0;
                L46: while (true) {
                  if (((np) this).field_L <= var19) {
                    break L44;
                  } else {
                    L47: {
                      var20 = var16[var19] & 255;
                      if (var20 == 0) {
                        var12.a(17133, (float)var13[var19] * var18);
                        var12.a(17133, (float)var14[var19] * var18);
                        var12.a(17133, (float)var15[var19] * var18);
                        break L47;
                      } else {
                        var21 = var17 / (float)var20;
                        var12.a(17133, var21 * (float)var13[var19]);
                        var12.a(17133, (float)var14[var19] * var21);
                        var12.a(17133, var21 * (float)var15[var19]);
                        break L47;
                      }
                    }
                    var12.field_h = var12.field_h + (-12 + var7);
                    var19++;
                    continue L46;
                  }
                }
              } else {
                var19 = 0;
                L48: while (true) {
                  if (~((np) this).field_L >= ~var19) {
                    break L44;
                  } else {
                    L49: {
                      var20 = 255 & var16[var19];
                      if (var20 == 0) {
                        var12.a((byte) 114, var18 * (float)var13[var19]);
                        var12.a((byte) 114, (float)var14[var19] * var18);
                        var12.a((byte) 114, (float)var15[var19] * var18);
                        break L49;
                      } else {
                        var21 = var17 / (float)var20;
                        var12.a((byte) 114, var21 * (float)var13[var19]);
                        var12.a((byte) 114, (float)var14[var19] * var21);
                        var12.a((byte) 114, (float)var15[var19] * var21);
                        break L49;
                      }
                    }
                    var12.field_h = var12.field_h + (-12 + var7);
                    var19++;
                    continue L48;
                  }
                }
              }
            }
          }
          L50: {
            if (var6 != 0) {
              var12.field_h = var11;
              if (!((np) this).field_R.field_O) {
                var13_int = 0;
                L51: while (true) {
                  if (((np) this).field_L <= var13_int) {
                    break L50;
                  } else {
                    var12.a((byte) 114, ((np) this).field_n[var13_int]);
                    var12.a((byte) 114, ((np) this).field_y[var13_int]);
                    var12.field_h = var12.field_h + (-8 + var7);
                    var13_int++;
                    continue L51;
                  }
                }
              } else {
                var13_int = 0;
                L52: while (true) {
                  if (~((np) this).field_L >= ~var13_int) {
                    break L50;
                  } else {
                    var12.a(17133, ((np) this).field_n[var13_int]);
                    var12.a(17133, ((np) this).field_y[var13_int]);
                    var12.field_h = var12.field_h + (var7 + -8);
                    var13_int++;
                    continue L52;
                  }
                }
              }
            } else {
              break L50;
            }
          }
          L53: {
            var12.field_h = ((np) this).field_L * var7;
            if (!param1) {
              var13_ref = ((np) this).field_R.a(var12.field_h, var12.field_g, var7, false, (byte) 99);
              ((np) this).field_gb = true;
              break L53;
            } else {
              L54: {
                if (((np) this).field_Q == null) {
                  ((np) this).field_Q = ((np) this).field_R.a(var12.field_h, var12.field_g, var7, true, (byte) 117);
                  break L54;
                } else {
                  ((np) this).field_Q.a(var7, var12.field_h, (byte) -112, var12.field_g);
                  break L54;
                }
              }
              ((np) this).field_Z = (byte) 0;
              var13_ref = ((np) this).field_Q;
              break L53;
            }
          }
          L55: {
            if (var5 != 0) {
              ((np) this).field_g.field_g = (byte) var8;
              ((np) this).field_g.field_d = var13_ref;
              break L55;
            } else {
              break L55;
            }
          }
          L56: {
            if (var6 == 0) {
              break L56;
            } else {
              ((np) this).field_ab.field_g = (byte) var11;
              ((np) this).field_ab.field_d = var13_ref;
              break L56;
            }
          }
          L57: {
            if (var3_int == 0) {
              break L57;
            } else {
              ((np) this).field_kb.field_g = (byte) var9;
              ((np) this).field_kb.field_d = var13_ref;
              break L57;
            }
          }
          L58: {
            if (var4 == 0) {
              break L58;
            } else {
              ((np) this).field_F.field_d = var13_ref;
              ((np) this).field_F.field_g = (byte) var10;
              break L58;
            }
          }
          return;
        }
    }

    final void a() {
    }

    private final void a(boolean param0) {
        RuntimeException var2 = null;
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        Object stackIn_12_0 = null;
        int stackIn_12_1 = 0;
        Object stackIn_14_0 = null;
        int stackIn_14_1 = 0;
        Object stackIn_16_0 = null;
        int stackIn_16_1 = 0;
        Object stackIn_17_0 = null;
        int stackIn_17_1 = 0;
        int stackIn_17_2 = 0;
        cka stackIn_20_0 = null;
        int stackIn_20_1 = 0;
        cka stackIn_22_0 = null;
        int stackIn_22_1 = 0;
        cka stackIn_24_0 = null;
        int stackIn_24_1 = 0;
        cka stackIn_25_0 = null;
        int stackIn_25_1 = 0;
        int stackIn_25_2 = 0;
        cka stackIn_34_0 = null;
        int stackIn_34_1 = 0;
        cka stackIn_36_0 = null;
        int stackIn_36_1 = 0;
        cka stackIn_37_0 = null;
        int stackIn_37_1 = 0;
        int stackIn_37_2 = 0;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_11_0 = null;
        int stackOut_11_1 = 0;
        Object stackOut_16_0 = null;
        int stackOut_16_1 = 0;
        int stackOut_16_2 = 0;
        Object stackOut_12_0 = null;
        int stackOut_12_1 = 0;
        Object stackOut_14_0 = null;
        int stackOut_14_1 = 0;
        int stackOut_14_2 = 0;
        cka stackOut_19_0 = null;
        int stackOut_19_1 = 0;
        cka stackOut_24_0 = null;
        int stackOut_24_1 = 0;
        int stackOut_24_2 = 0;
        cka stackOut_20_0 = null;
        int stackOut_20_1 = 0;
        cka stackOut_22_0 = null;
        int stackOut_22_1 = 0;
        int stackOut_22_2 = 0;
        cka stackOut_33_0 = null;
        int stackOut_33_1 = 0;
        cka stackOut_36_0 = null;
        int stackOut_36_1 = 0;
        int stackOut_36_2 = 0;
        cka stackOut_34_0 = null;
        int stackOut_34_1 = 0;
        int stackOut_34_2 = 0;
        var7 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            if (((np) this).field_ib == 0) {
              return;
            } else {
              L1: {
                if (((np) this).field_Z == 0) {
                  break L1;
                } else {
                  this.a(0, true);
                  break L1;
                }
              }
              L2: {
                this.a(0, false);
                if (((np) this).field_w != null) {
                  L3: {
                    if (null != ((np) this).field_w.field_a) {
                      break L3;
                    } else {
                      L4: {
                        stackOut_11_0 = this;
                        stackOut_11_1 = -24;
                        stackIn_16_0 = stackOut_11_0;
                        stackIn_16_1 = stackOut_11_1;
                        stackIn_12_0 = stackOut_11_0;
                        stackIn_12_1 = stackOut_11_1;
                        if (0 == (((np) this).field_Z & 16)) {
                          stackOut_16_0 = this;
                          stackOut_16_1 = stackIn_16_1;
                          stackOut_16_2 = 0;
                          stackIn_17_0 = stackOut_16_0;
                          stackIn_17_1 = stackOut_16_1;
                          stackIn_17_2 = stackOut_16_2;
                          break L4;
                        } else {
                          stackOut_12_0 = this;
                          stackOut_12_1 = stackIn_12_1;
                          stackIn_14_0 = stackOut_12_0;
                          stackIn_14_1 = stackOut_12_1;
                          stackOut_14_0 = this;
                          stackOut_14_1 = stackIn_14_1;
                          stackOut_14_2 = 1;
                          stackIn_17_0 = stackOut_14_0;
                          stackIn_17_1 = stackOut_14_1;
                          stackIn_17_2 = stackOut_14_2;
                          break L4;
                        }
                      }
                      this.a((byte) stackIn_17_1, stackIn_17_2 != 0);
                      break L3;
                    }
                  }
                  if (((np) this).field_w.field_a == null) {
                    break L2;
                  } else {
                    L5: {
                      stackOut_19_0 = ((np) this).field_R;
                      stackOut_19_1 = 96;
                      stackIn_24_0 = stackOut_19_0;
                      stackIn_24_1 = stackOut_19_1;
                      stackIn_20_0 = stackOut_19_0;
                      stackIn_20_1 = stackOut_19_1;
                      if (((np) this).field_F == null) {
                        stackOut_24_0 = (cka) (Object) stackIn_24_0;
                        stackOut_24_1 = stackIn_24_1;
                        stackOut_24_2 = 0;
                        stackIn_25_0 = stackOut_24_0;
                        stackIn_25_1 = stackOut_24_1;
                        stackIn_25_2 = stackOut_24_2;
                        break L5;
                      } else {
                        stackOut_20_0 = (cka) (Object) stackIn_20_0;
                        stackOut_20_1 = stackIn_20_1;
                        stackIn_22_0 = stackOut_20_0;
                        stackIn_22_1 = stackOut_20_1;
                        stackOut_22_0 = (cka) (Object) stackIn_22_0;
                        stackOut_22_1 = stackIn_22_1;
                        stackOut_22_2 = 1;
                        stackIn_25_0 = stackOut_22_0;
                        stackIn_25_1 = stackOut_22_1;
                        stackIn_25_2 = stackOut_22_2;
                        break L5;
                      }
                    }
                    ((cka) (Object) stackIn_25_0).a(stackIn_25_1, stackIn_25_2 != 0);
                    ((np) this).field_R.a(((np) this).field_kb, ((np) this).field_ab, ((np) this).field_F, -120, ((np) this).field_g);
                    var2_int = -1 + ((np) this).field_p.length;
                    var3 = 0;
                    L6: while (true) {
                      if (~var3 <= ~var2_int) {
                        break L2;
                      } else {
                        L7: {
                          var4 = ((np) this).field_p[var3];
                          var5 = ((np) this).field_p[1 + var3];
                          var6 = 65535 & ((np) this).field_I[var4];
                          if (var6 == 65535) {
                            var6 = -1;
                            break L7;
                          } else {
                            break L7;
                          }
                        }
                        L8: {
                          stackOut_33_0 = ((np) this).field_R;
                          stackOut_33_1 = 70;
                          stackIn_36_0 = stackOut_33_0;
                          stackIn_36_1 = stackOut_33_1;
                          stackIn_34_0 = stackOut_33_0;
                          stackIn_34_1 = stackOut_33_1;
                          if (null == ((np) this).field_F) {
                            stackOut_36_0 = (cka) (Object) stackIn_36_0;
                            stackOut_36_1 = stackIn_36_1;
                            stackOut_36_2 = 0;
                            stackIn_37_0 = stackOut_36_0;
                            stackIn_37_1 = stackOut_36_1;
                            stackIn_37_2 = stackOut_36_2;
                            break L8;
                          } else {
                            stackOut_34_0 = (cka) (Object) stackIn_34_0;
                            stackOut_34_1 = stackIn_34_1;
                            stackOut_34_2 = 1;
                            stackIn_37_0 = stackOut_34_0;
                            stackIn_37_1 = stackOut_34_1;
                            stackIn_37_2 = stackOut_34_2;
                            break L8;
                          }
                        }
                        ((cka) (Object) stackIn_37_0).a((byte) stackIn_37_1, stackIn_37_2 != 0, var6);
                        ((np) this).field_R.a(3 * var4, 4, -513, ((np) this).field_w.field_a, 3 * (var5 - var4));
                        var3++;
                        continue L6;
                      }
                    }
                  }
                } else {
                  break L2;
                }
              }
              int discarded$1 = 31;
              this.c();
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw tba.a((Throwable) (Object) var2, "np.L(" + 0 + 41);
        }
    }

    final void O(int param0, int param1, int param2) {
        RuntimeException runtimeException = null;
        int var4_int = 0;
        int var5 = 0;
        RuntimeException decompiledCaughtException = null;
        var5 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            var4_int = 0;
            L1: while (true) {
              if (var4_int >= ((np) this).field_lb) {
                L2: {
                  ((np) this).field_l = false;
                  if (((np) this).field_g == null) {
                    break L2;
                  } else {
                    ((np) this).field_g.field_d = null;
                    break L2;
                  }
                }
                break L0;
              } else {
                L3: {
                  if (param0 == 128) {
                    break L3;
                  } else {
                    ((np) this).field_P[var4_int] = param0 * ((np) this).field_P[var4_int] >> 7;
                    break L3;
                  }
                }
                L4: {
                  if (param1 == 128) {
                    break L4;
                  } else {
                    ((np) this).field_K[var4_int] = param1 * ((np) this).field_K[var4_int] >> 7;
                    break L4;
                  }
                }
                L5: {
                  if (param2 != 128) {
                    ((np) this).field_A[var4_int] = ((np) this).field_A[var4_int] * param2 >> 7;
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
          runtimeException = decompiledCaughtException;
          throw tba.a((Throwable) (Object) runtimeException, "np.O(" + param0 + 44 + param1 + 44 + param2 + 41);
        }
    }

    final void a(int param0, int[] param1, int param2, int param3, int param4, int param5, boolean param6) {
        int var8_int = 0;
        int var9 = 0;
        int var10 = 0;
        pm var10_ref_pm = null;
        int var11_int = 0;
        int[] var11 = null;
        fd var11_ref = null;
        int[] var12_ref_int__ = null;
        int var12 = 0;
        int var13_int = 0;
        fd var13 = null;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        var21 = TombRacer.field_G ? 1 : 0;
        var8_int = param1.length;
        if (0 != param0) {
          if (param0 == 1) {
            param2 = param2 << 4;
            param3 = param3 << 4;
            param4 = param4 << 4;
            var9 = 0;
            L0: while (true) {
              if (var8_int <= var9) {
                return;
              } else {
                L1: {
                  var10 = param1[var9];
                  if (~var10 > ~((np) this).field_d.length) {
                    var11 = ((np) this).field_d[var10];
                    var12 = 0;
                    L2: while (true) {
                      if (var12 >= var11.length) {
                        break L1;
                      } else {
                        var13_int = var11[var12];
                        ((np) this).field_P[var13_int] = ((np) this).field_P[var13_int] + param2;
                        ((np) this).field_K[var13_int] = ((np) this).field_K[var13_int] + param3;
                        ((np) this).field_A[var13_int] = ((np) this).field_A[var13_int] + param4;
                        var12++;
                        continue L2;
                      }
                    }
                  } else {
                    break L1;
                  }
                }
                var9++;
                continue L0;
              }
            }
          } else {
            if (2 != param0) {
              if (param0 == 3) {
                var9 = 0;
                L3: while (true) {
                  if (var8_int <= var9) {
                    return;
                  } else {
                    L4: {
                      var10 = param1[var9];
                      if (((np) this).field_d.length > var10) {
                        var11 = ((np) this).field_d[var10];
                        var12 = 0;
                        L5: while (true) {
                          if (var11.length <= var12) {
                            break L4;
                          } else {
                            var13_int = var11[var12];
                            ((np) this).field_P[var13_int] = ((np) this).field_P[var13_int] - rp.field_i;
                            ((np) this).field_K[var13_int] = ((np) this).field_K[var13_int] - via.field_e;
                            ((np) this).field_A[var13_int] = ((np) this).field_A[var13_int] - dj.field_b;
                            ((np) this).field_P[var13_int] = param2 * ((np) this).field_P[var13_int] >> 7;
                            ((np) this).field_K[var13_int] = ((np) this).field_K[var13_int] * param3 >> 7;
                            ((np) this).field_A[var13_int] = param4 * ((np) this).field_A[var13_int] >> 7;
                            ((np) this).field_P[var13_int] = ((np) this).field_P[var13_int] + rp.field_i;
                            ((np) this).field_K[var13_int] = ((np) this).field_K[var13_int] + via.field_e;
                            ((np) this).field_A[var13_int] = ((np) this).field_A[var13_int] + dj.field_b;
                            var12++;
                            continue L5;
                          }
                        }
                      } else {
                        break L4;
                      }
                    }
                    var9++;
                    continue L3;
                  }
                }
              } else {
                if (5 != param0) {
                  if (param0 != 7) {
                    if (param0 != 8) {
                      if (param0 != 10) {
                        if (param0 != 9) {
                          return;
                        } else {
                          L6: {
                            if (null != ((np) this).field_C) {
                              var9 = 0;
                              L7: while (true) {
                                if (~var9 <= ~var8_int) {
                                  break L6;
                                } else {
                                  L8: {
                                    var10 = param1[var9];
                                    if (~((np) this).field_C.length < ~var10) {
                                      var11 = ((np) this).field_C[var10];
                                      var12 = 0;
                                      L9: while (true) {
                                        if (var11.length <= var12) {
                                          break L8;
                                        } else {
                                          var13 = ((np) this).field_f[var11[var12]];
                                          var13.field_g = 16383 & var13.field_g - -param2;
                                          var12++;
                                          continue L9;
                                        }
                                      }
                                    } else {
                                      break L8;
                                    }
                                  }
                                  var9++;
                                  continue L7;
                                }
                              }
                            } else {
                              break L6;
                            }
                          }
                          return;
                        }
                      } else {
                        L10: {
                          if (((np) this).field_C != null) {
                            var9 = 0;
                            L11: while (true) {
                              if (~var8_int >= ~var9) {
                                break L10;
                              } else {
                                L12: {
                                  var10 = param1[var9];
                                  if (~var10 > ~((np) this).field_C.length) {
                                    var11 = ((np) this).field_C[var10];
                                    var12 = 0;
                                    L13: while (true) {
                                      if (~var12 <= ~var11.length) {
                                        break L12;
                                      } else {
                                        var13 = ((np) this).field_f[var11[var12]];
                                        var13.field_f = param3 * var13.field_f >> 7;
                                        var13.field_b = var13.field_b * param2 >> 7;
                                        var12++;
                                        continue L13;
                                      }
                                    }
                                  } else {
                                    break L12;
                                  }
                                }
                                var9++;
                                continue L11;
                              }
                            }
                          } else {
                            break L10;
                          }
                        }
                        return;
                      }
                    } else {
                      L14: {
                        if (null == ((np) this).field_C) {
                          break L14;
                        } else {
                          var9 = 0;
                          L15: while (true) {
                            if (var9 >= var8_int) {
                              break L14;
                            } else {
                              L16: {
                                var10 = param1[var9];
                                if (((np) this).field_C.length <= var10) {
                                  break L16;
                                } else {
                                  var11 = ((np) this).field_C[var10];
                                  var12 = 0;
                                  L17: while (true) {
                                    if (var11.length <= var12) {
                                      break L16;
                                    } else {
                                      var13 = ((np) this).field_f[var11[var12]];
                                      var13.field_h = var13.field_h + param2;
                                      var13.field_a = var13.field_a + param3;
                                      var12++;
                                      continue L17;
                                    }
                                  }
                                }
                              }
                              var9++;
                              continue L15;
                            }
                          }
                        }
                      }
                      return;
                    }
                  } else {
                    L18: {
                      if (null != ((np) this).field_j) {
                        var9 = 0;
                        L19: while (true) {
                          if (~var8_int >= ~var9) {
                            if (((np) this).field_r != null) {
                              var9 = 0;
                              L20: while (true) {
                                if (((np) this).field_G <= var9) {
                                  break L18;
                                } else {
                                  var10_ref_pm = ((np) this).field_r[var9];
                                  var11_ref = ((np) this).field_f[var9];
                                  var11_ref.field_c = 16777215 & cla.field_m[((np) this).field_X[var10_ref_pm.field_l] & 65535] | -16777216 & var11_ref.field_c;
                                  var9++;
                                  continue L20;
                                }
                              }
                            } else {
                              break L18;
                            }
                          } else {
                            L21: {
                              var10 = param1[var9];
                              if (~var10 <= ~((np) this).field_j.length) {
                                break L21;
                              } else {
                                var11 = ((np) this).field_j[var10];
                                var12 = 0;
                                L22: while (true) {
                                  if (var11.length <= var12) {
                                    if (var11.length <= 0) {
                                      break L21;
                                    } else {
                                      if (null != ((np) this).field_kb) {
                                        ((np) this).field_kb.field_d = null;
                                        break L21;
                                      } else {
                                        break L21;
                                      }
                                    }
                                  } else {
                                    L23: {
                                      var13_int = var11[var12];
                                      var14 = ((np) this).field_X[var13_int] & 65535;
                                      var15 = (var14 & 64694) >> 10;
                                      var16 = (var14 & 1011) >> 7;
                                      var16 = var16 + param3 / 4;
                                      var15 = 63 & param2 + var15;
                                      var17 = var14 & 127;
                                      if (var16 < 0) {
                                        var16 = 0;
                                        break L23;
                                      } else {
                                        if (var16 > 7) {
                                          var16 = 7;
                                          break L23;
                                        } else {
                                          break L23;
                                        }
                                      }
                                    }
                                    L24: {
                                      var17 = var17 + param4;
                                      if (var17 >= 0) {
                                        if (var17 <= 127) {
                                          break L24;
                                        } else {
                                          var17 = 127;
                                          break L24;
                                        }
                                      } else {
                                        var17 = 0;
                                        break L24;
                                      }
                                    }
                                    ((np) this).field_X[var13_int] = (short)fh.a(fh.a(var16 << 7, var15 << 10), var17);
                                    var12++;
                                    continue L22;
                                  }
                                }
                              }
                            }
                            var9++;
                            continue L19;
                          }
                        }
                      } else {
                        break L18;
                      }
                    }
                    return;
                  }
                } else {
                  L25: {
                    if (((np) this).field_j == null) {
                      break L25;
                    } else {
                      var9 = 0;
                      L26: while (true) {
                        if (~var8_int >= ~var9) {
                          if (null == ((np) this).field_r) {
                            break L25;
                          } else {
                            var9 = 0;
                            L27: while (true) {
                              if (~((np) this).field_G >= ~var9) {
                                break L25;
                              } else {
                                var10_ref_pm = ((np) this).field_r[var9];
                                var11_ref = ((np) this).field_f[var9];
                                var11_ref.field_c = var11_ref.field_c & 16777215 | -(((np) this).field_o[var10_ref_pm.field_l] & 255) + 255 << 24;
                                var9++;
                                continue L27;
                              }
                            }
                          }
                        } else {
                          L28: {
                            var10 = param1[var9];
                            if (~((np) this).field_j.length >= ~var10) {
                              break L28;
                            } else {
                              var11 = ((np) this).field_j[var10];
                              var12 = 0;
                              L29: while (true) {
                                if (var12 >= var11.length) {
                                  if (0 >= var11.length) {
                                    break L28;
                                  } else {
                                    if (((np) this).field_kb == null) {
                                      break L28;
                                    } else {
                                      ((np) this).field_kb.field_d = null;
                                      break L28;
                                    }
                                  }
                                } else {
                                  L30: {
                                    var13_int = var11[var12];
                                    var14 = 8 * param2 + (255 & ((np) this).field_o[var13_int]);
                                    if (0 > var14) {
                                      var14 = 0;
                                      break L30;
                                    } else {
                                      if (var14 > 255) {
                                        var14 = 255;
                                        break L30;
                                      } else {
                                        break L30;
                                      }
                                    }
                                  }
                                  ((np) this).field_o[var13_int] = (byte)var14;
                                  var12++;
                                  continue L29;
                                }
                              }
                            }
                          }
                          var9++;
                          continue L26;
                        }
                      }
                    }
                  }
                  return;
                }
              }
            } else {
              var9 = 0;
              L31: while (true) {
                if (~var9 <= ~var8_int) {
                  L32: {
                    if (!param6) {
                      break L32;
                    } else {
                      var9 = 0;
                      L33: while (true) {
                        if (~var9 <= ~var8_int) {
                          L34: {
                            if (((np) this).field_F != null) {
                              break L34;
                            } else {
                              if (((np) this).field_kb == null) {
                                break L34;
                              } else {
                                ((np) this).field_kb.field_d = null;
                                break L34;
                              }
                            }
                          }
                          if (null == ((np) this).field_F) {
                            break L32;
                          } else {
                            ((np) this).field_F.field_d = null;
                            break L32;
                          }
                        } else {
                          L35: {
                            var10 = param1[var9];
                            if (~var10 <= ~((np) this).field_d.length) {
                              break L35;
                            } else {
                              var11 = ((np) this).field_d[var10];
                              var12 = 0;
                              L36: while (true) {
                                if (var12 >= var11.length) {
                                  break L35;
                                } else {
                                  var13_int = var11[var12];
                                  var14 = ((np) this).field_e[var13_int];
                                  var15 = ((np) this).field_e[1 + var13_int];
                                  var16 = var14;
                                  L37: while (true) {
                                    L38: {
                                      if (~var16 <= ~var15) {
                                        break L38;
                                      } else {
                                        var17 = -1 + ((np) this).field_q[var16];
                                        if (-1 != var17) {
                                          L39: {
                                            if (param4 != 0) {
                                              var18 = qu.field_b[param4];
                                              var19 = qu.field_d[param4];
                                              var20 = 16383 + var19 * ((np) this).field_E[var17] + ((np) this).field_Y[var17] * var18 >> 14;
                                              ((np) this).field_Y[var17] = (short)(var19 * ((np) this).field_Y[var17] + -(var18 * ((np) this).field_E[var17]) - -16383 >> 14);
                                              ((np) this).field_E[var17] = (short)var20;
                                              break L39;
                                            } else {
                                              break L39;
                                            }
                                          }
                                          L40: {
                                            if (param2 == 0) {
                                              break L40;
                                            } else {
                                              var18 = qu.field_b[param2];
                                              var19 = qu.field_d[param2];
                                              var20 = 16383 + ((np) this).field_Y[var17] * var19 + -(var18 * ((np) this).field_cb[var17]) >> 14;
                                              ((np) this).field_cb[var17] = (short)(((np) this).field_Y[var17] * var18 + var19 * ((np) this).field_cb[var17] + 16383 >> 14);
                                              ((np) this).field_Y[var17] = (short)var20;
                                              break L40;
                                            }
                                          }
                                          L41: {
                                            if (param3 == 0) {
                                              break L41;
                                            } else {
                                              var18 = qu.field_b[param3];
                                              var19 = qu.field_d[param3];
                                              var20 = 16383 + (var19 * ((np) this).field_E[var17] + var18 * ((np) this).field_cb[var17]) >> 14;
                                              ((np) this).field_cb[var17] = (short)(16383 + var19 * ((np) this).field_cb[var17] + -(var18 * ((np) this).field_E[var17]) >> 14);
                                              ((np) this).field_E[var17] = (short)var20;
                                              break L41;
                                            }
                                          }
                                          var16++;
                                          continue L37;
                                        } else {
                                          break L38;
                                        }
                                      }
                                    }
                                    var12++;
                                    continue L36;
                                  }
                                }
                              }
                            }
                          }
                          var9++;
                          continue L33;
                        }
                      }
                    }
                  }
                  return;
                } else {
                  L42: {
                    var10 = param1[var9];
                    if (~var10 <= ~((np) this).field_d.length) {
                      break L42;
                    } else {
                      var11 = ((np) this).field_d[var10];
                      if ((param5 & 1) == 0) {
                        var12 = 0;
                        L43: while (true) {
                          if (var11.length <= var12) {
                            break L42;
                          } else {
                            L44: {
                              var13_int = var11[var12];
                              ((np) this).field_P[var13_int] = ((np) this).field_P[var13_int] - rp.field_i;
                              ((np) this).field_K[var13_int] = ((np) this).field_K[var13_int] - via.field_e;
                              ((np) this).field_A[var13_int] = ((np) this).field_A[var13_int] - dj.field_b;
                              if (0 != param4) {
                                var14 = qu.field_b[param4];
                                var15 = qu.field_d[param4];
                                var16 = ((np) this).field_P[var13_int] * var15 + ((np) this).field_K[var13_int] * var14 + 16383 >> 14;
                                ((np) this).field_K[var13_int] = 16383 + (var15 * ((np) this).field_K[var13_int] + -(var14 * ((np) this).field_P[var13_int])) >> 14;
                                ((np) this).field_P[var13_int] = var16;
                                break L44;
                              } else {
                                break L44;
                              }
                            }
                            L45: {
                              if (param2 == 0) {
                                break L45;
                              } else {
                                var14 = qu.field_b[param2];
                                var15 = qu.field_d[param2];
                                var16 = var15 * ((np) this).field_K[var13_int] + -(var14 * ((np) this).field_A[var13_int]) + 16383 >> 14;
                                ((np) this).field_A[var13_int] = var14 * ((np) this).field_K[var13_int] - -(((np) this).field_A[var13_int] * var15) + 16383 >> 14;
                                ((np) this).field_K[var13_int] = var16;
                                break L45;
                              }
                            }
                            L46: {
                              if (0 != param3) {
                                var14 = qu.field_b[param3];
                                var15 = qu.field_d[param3];
                                var16 = ((np) this).field_A[var13_int] * var14 - (-(var15 * ((np) this).field_P[var13_int]) - 16383) >> 14;
                                ((np) this).field_A[var13_int] = -(var14 * ((np) this).field_P[var13_int]) + (((np) this).field_A[var13_int] * var15 - -16383) >> 14;
                                ((np) this).field_P[var13_int] = var16;
                                break L46;
                              } else {
                                break L46;
                              }
                            }
                            ((np) this).field_P[var13_int] = ((np) this).field_P[var13_int] + rp.field_i;
                            ((np) this).field_K[var13_int] = ((np) this).field_K[var13_int] + via.field_e;
                            ((np) this).field_A[var13_int] = ((np) this).field_A[var13_int] + dj.field_b;
                            var12++;
                            continue L43;
                          }
                        }
                      } else {
                        var12 = 0;
                        L47: while (true) {
                          if (~var11.length >= ~var12) {
                            break L42;
                          } else {
                            L48: {
                              var13_int = var11[var12];
                              ((np) this).field_P[var13_int] = ((np) this).field_P[var13_int] - rp.field_i;
                              ((np) this).field_K[var13_int] = ((np) this).field_K[var13_int] - via.field_e;
                              ((np) this).field_A[var13_int] = ((np) this).field_A[var13_int] - dj.field_b;
                              if (param2 != 0) {
                                var14 = qu.field_b[param2];
                                var15 = qu.field_d[param2];
                                var16 = -(((np) this).field_A[var13_int] * var14) + (var15 * ((np) this).field_K[var13_int] - -16383) >> 14;
                                ((np) this).field_A[var13_int] = ((np) this).field_A[var13_int] * var15 + ((np) this).field_K[var13_int] * var14 - -16383 >> 14;
                                ((np) this).field_K[var13_int] = var16;
                                break L48;
                              } else {
                                break L48;
                              }
                            }
                            L49: {
                              if (param4 != 0) {
                                var14 = qu.field_b[param4];
                                var15 = qu.field_d[param4];
                                var16 = 16383 + var14 * ((np) this).field_K[var13_int] + ((np) this).field_P[var13_int] * var15 >> 14;
                                ((np) this).field_K[var13_int] = ((np) this).field_K[var13_int] * var15 + -(var14 * ((np) this).field_P[var13_int]) - -16383 >> 14;
                                ((np) this).field_P[var13_int] = var16;
                                break L49;
                              } else {
                                break L49;
                              }
                            }
                            L50: {
                              if (param3 == 0) {
                                break L50;
                              } else {
                                var14 = qu.field_b[param3];
                                var15 = qu.field_d[param3];
                                var16 = 16383 + ((np) this).field_A[var13_int] * var14 - -(var15 * ((np) this).field_P[var13_int]) >> 14;
                                ((np) this).field_A[var13_int] = 16383 + var15 * ((np) this).field_A[var13_int] + -(var14 * ((np) this).field_P[var13_int]) >> 14;
                                ((np) this).field_P[var13_int] = var16;
                                break L50;
                              }
                            }
                            ((np) this).field_P[var13_int] = ((np) this).field_P[var13_int] + rp.field_i;
                            ((np) this).field_K[var13_int] = ((np) this).field_K[var13_int] + via.field_e;
                            ((np) this).field_A[var13_int] = ((np) this).field_A[var13_int] + dj.field_b;
                            var12++;
                            continue L47;
                          }
                        }
                      }
                    }
                  }
                  var9++;
                  continue L31;
                }
              }
            }
          }
        } else {
          param4 = param4 << 4;
          param3 = param3 << 4;
          param2 = param2 << 4;
          var9 = 0;
          dj.field_b = 0;
          rp.field_i = 0;
          via.field_e = 0;
          var10 = 0;
          L51: while (true) {
            if (~var8_int >= ~var10) {
              L52: {
                if (var9 > 0) {
                  rp.field_i = param2 + rp.field_i / var9;
                  via.field_e = param3 + via.field_e / var9;
                  dj.field_b = dj.field_b / var9 + param4;
                  break L52;
                } else {
                  rp.field_i = param2;
                  dj.field_b = param4;
                  via.field_e = param3;
                  break L52;
                }
              }
              return;
            } else {
              L53: {
                var11_int = param1[var10];
                if (~var11_int > ~((np) this).field_d.length) {
                  var12_ref_int__ = ((np) this).field_d[var11_int];
                  var13_int = 0;
                  L54: while (true) {
                    if (~var13_int <= ~var12_ref_int__.length) {
                      break L53;
                    } else {
                      var14 = var12_ref_int__[var13_int];
                      rp.field_i = rp.field_i + ((np) this).field_P[var14];
                      via.field_e = via.field_e + ((np) this).field_K[var14];
                      var9++;
                      dj.field_b = dj.field_b + ((np) this).field_A[var14];
                      var13_int++;
                      continue L54;
                    }
                  }
                } else {
                  break L53;
                }
              }
              var10++;
              continue L51;
            }
          }
        }
    }

    public static void d() {
        try {
            field_V = null;
            int var1_int = 0;
            field_J = null;
            field_m = null;
            field_x = null;
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) (Object) runtimeException, "np.M(" + 0 + 41);
        }
    }

    final void wa() {
        int var1_int = 0;
        RuntimeException var1 = null;
        int var2 = 0;
        RuntimeException decompiledCaughtException = null;
        var2 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            var1_int = 0;
            L1: while (true) {
              if (var1_int >= ((np) this).field_N) {
                L2: {
                  if (null != ((np) this).field_g) {
                    ((np) this).field_g.field_d = null;
                    break L2;
                  } else {
                    break L2;
                  }
                }
                ((np) this).field_l = false;
                break L0;
              } else {
                ((np) this).field_P[var1_int] = ((np) this).field_P[var1_int] + 7 >> 4;
                ((np) this).field_K[var1_int] = ((np) this).field_K[var1_int] + 7 >> 4;
                ((np) this).field_A[var1_int] = 7 + ((np) this).field_A[var1_int] >> 4;
                var1_int++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw tba.a((Throwable) (Object) var1, "np.wa()");
        }
    }

    private final void c() {
        RuntimeException var2 = null;
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        RuntimeException decompiledCaughtException = null;
        var5 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            if (!((np) this).field_gb) {
              return;
            } else {
              L1: {
                ((np) this).field_gb = false;
                if (null != ((np) this).field_D) {
                  break L1;
                } else {
                  if (((np) this).field_t != null) {
                    break L1;
                  } else {
                    if (((np) this).field_r != null) {
                      break L1;
                    } else {
                      if (!aw.c(-17275, ((np) this).field_u, ((np) this).field_bb)) {
                        L2: {
                          var2_int = 0;
                          var3 = 0;
                          if (null == ((np) this).field_P) {
                            break L2;
                          } else {
                            if (!uv.a(((np) this).field_u, 1, ((np) this).field_bb)) {
                              L3: {
                                if (((np) this).field_g == null) {
                                  break L3;
                                } else {
                                  if (((np) this).field_g.field_d == null) {
                                    ((np) this).field_gb = true;
                                    break L2;
                                  } else {
                                    break L3;
                                  }
                                }
                              }
                              L4: {
                                if (((np) this).field_l) {
                                  break L4;
                                } else {
                                  this.c(2709);
                                  break L4;
                                }
                              }
                              var2_int = 1;
                              break L2;
                            } else {
                              break L2;
                            }
                          }
                        }
                        L5: {
                          var4 = 0;
                          if (null == ((np) this).field_K) {
                            break L5;
                          } else {
                            if (pt.a(-61, ((np) this).field_bb, ((np) this).field_u)) {
                              break L5;
                            } else {
                              L6: {
                                if (null == ((np) this).field_g) {
                                  break L6;
                                } else {
                                  if (null != ((np) this).field_g.field_d) {
                                    break L6;
                                  } else {
                                    ((np) this).field_gb = true;
                                    break L5;
                                  }
                                }
                              }
                              L7: {
                                if (((np) this).field_l) {
                                  break L7;
                                } else {
                                  this.c(2709);
                                  break L7;
                                }
                              }
                              var3 = 1;
                              break L5;
                            }
                          }
                        }
                        L8: {
                          if (((np) this).field_A == null) {
                            break L8;
                          } else {
                            if (jc.c(((np) this).field_u, -23717, ((np) this).field_bb)) {
                              break L8;
                            } else {
                              L9: {
                                if (((np) this).field_g == null) {
                                  break L9;
                                } else {
                                  if (null == ((np) this).field_g.field_d) {
                                    ((np) this).field_gb = true;
                                    break L8;
                                  } else {
                                    break L9;
                                  }
                                }
                              }
                              L10: {
                                if (!((np) this).field_l) {
                                  this.c(2709);
                                  break L10;
                                } else {
                                  break L10;
                                }
                              }
                              var4 = 1;
                              break L8;
                            }
                          }
                        }
                        L11: {
                          if (var3 == 0) {
                            break L11;
                          } else {
                            ((np) this).field_K = null;
                            break L11;
                          }
                        }
                        L12: {
                          if (var4 == 0) {
                            break L12;
                          } else {
                            ((np) this).field_A = null;
                            break L12;
                          }
                        }
                        if (var2_int != 0) {
                          ((np) this).field_P = null;
                          break L1;
                        } else {
                          break L1;
                        }
                      } else {
                        break L1;
                      }
                    }
                  }
                }
              }
              L13: {
                if (null == ((np) this).field_q) {
                  break L13;
                } else {
                  if (((np) this).field_P != null) {
                    break L13;
                  } else {
                    if (null != ((np) this).field_K) {
                      break L13;
                    } else {
                      if (((np) this).field_A == null) {
                        ((np) this).field_e = null;
                        ((np) this).field_q = null;
                        break L13;
                      } else {
                        break L13;
                      }
                    }
                  }
                }
              }
              L14: {
                if (((np) this).field_O == null) {
                  break L14;
                } else {
                  int discarded$1 = 115;
                  if (!oea.a(((np) this).field_bb, ((np) this).field_u)) {
                    if (null == ((np) this).field_F) {
                      L15: {
                        if (null == ((np) this).field_kb) {
                          break L15;
                        } else {
                          if (((np) this).field_kb.field_d == null) {
                            ((np) this).field_gb = true;
                            break L14;
                          } else {
                            break L15;
                          }
                        }
                      }
                      ((np) this).field_O = null;
                      ((np) this).field_cb = null;
                      ((np) this).field_Y = null;
                      ((np) this).field_E = null;
                      break L14;
                    } else {
                      if (((np) this).field_F.field_d == null) {
                        ((np) this).field_gb = true;
                        break L14;
                      } else {
                        ((np) this).field_cb = null;
                        ((np) this).field_O = null;
                        ((np) this).field_E = null;
                        ((np) this).field_Y = null;
                        break L14;
                      }
                    }
                  } else {
                    break L14;
                  }
                }
              }
              L16: {
                var2_int = 0;
                if (null == ((np) this).field_X) {
                  break L16;
                } else {
                  if (!sm.a(2, ((np) this).field_bb, ((np) this).field_u)) {
                    L17: {
                      if (null == ((np) this).field_kb) {
                        break L17;
                      } else {
                        if (null == ((np) this).field_kb.field_d) {
                          ((np) this).field_gb = true;
                          break L16;
                        } else {
                          break L17;
                        }
                      }
                    }
                    ((np) this).field_X = null;
                    break L16;
                  } else {
                    break L16;
                  }
                }
              }
              L18: {
                if (((np) this).field_o == null) {
                  break L18;
                } else {
                  if (!gda.b(107, ((np) this).field_u, ((np) this).field_bb)) {
                    L19: {
                      if (null == ((np) this).field_kb) {
                        break L19;
                      } else {
                        if (null == ((np) this).field_kb.field_d) {
                          ((np) this).field_gb = true;
                          break L18;
                        } else {
                          break L19;
                        }
                      }
                    }
                    ((np) this).field_o = null;
                    break L18;
                  } else {
                    break L18;
                  }
                }
              }
              L20: {
                if (null == ((np) this).field_n) {
                  break L20;
                } else {
                  if (!lva.a(((np) this).field_bb, (byte) -21, ((np) this).field_u)) {
                    L21: {
                      if (null == ((np) this).field_ab) {
                        break L21;
                      } else {
                        if (((np) this).field_ab.field_d == null) {
                          ((np) this).field_gb = true;
                          break L20;
                        } else {
                          break L21;
                        }
                      }
                    }
                    ((np) this).field_n = null;
                    ((np) this).field_y = null;
                    break L20;
                  } else {
                    break L20;
                  }
                }
              }
              L22: {
                if (null == ((np) this).field_I) {
                  break L22;
                } else {
                  if (in.a(((np) this).field_bb, ((np) this).field_u, (byte) -115)) {
                    break L22;
                  } else {
                    L23: {
                      if (null == ((np) this).field_kb) {
                        break L23;
                      } else {
                        if (((np) this).field_kb.field_d != null) {
                          break L23;
                        } else {
                          ((np) this).field_gb = true;
                          break L22;
                        }
                      }
                    }
                    ((np) this).field_I = null;
                    break L22;
                  }
                }
              }
              L24: {
                if (((np) this).field_H == null) {
                  break L24;
                } else {
                  if (!ae.a(((np) this).field_bb, ((np) this).field_u, 6100)) {
                    L25: {
                      L26: {
                        if (((np) this).field_w == null) {
                          break L26;
                        } else {
                          if (((np) this).field_w.field_a == null) {
                            break L25;
                          } else {
                            break L26;
                          }
                        }
                      }
                      L27: {
                        if (null == ((np) this).field_kb) {
                          break L27;
                        } else {
                          if (((np) this).field_kb.field_d == null) {
                            break L25;
                          } else {
                            break L27;
                          }
                        }
                      }
                      ((np) this).field_z = null;
                      ((np) this).field_hb = null;
                      ((np) this).field_H = null;
                      break L24;
                    }
                    ((np) this).field_gb = true;
                    break L24;
                  } else {
                    break L24;
                  }
                }
              }
              L28: {
                if (((np) this).field_j == null) {
                  break L28;
                } else {
                  if (!aw.d(-26571, ((np) this).field_bb, ((np) this).field_u)) {
                    ((np) this).field_j = null;
                    ((np) this).field_fb = null;
                    break L28;
                  } else {
                    break L28;
                  }
                }
              }
              L29: {
                if (null == ((np) this).field_d) {
                  break L29;
                } else {
                  if (!kda.b(((np) this).field_bb, 124, ((np) this).field_u)) {
                    ((np) this).field_db = null;
                    ((np) this).field_d = null;
                    break L29;
                  } else {
                    break L29;
                  }
                }
              }
              L30: {
                if (null == ((np) this).field_C) {
                  break L30;
                } else {
                  if (!eo.a(((np) this).field_u, (byte) -125, ((np) this).field_bb)) {
                    ((np) this).field_C = null;
                    break L30;
                  } else {
                    break L30;
                  }
                }
              }
              L31: {
                if (((np) this).field_p == null) {
                  break L31;
                } else {
                  if ((((np) this).field_bb & 2048) != 0) {
                    break L31;
                  } else {
                    if ((((np) this).field_bb & 262144) != 0) {
                      break L31;
                    } else {
                      ((np) this).field_p = null;
                      break L31;
                    }
                  }
                }
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw tba.a((Throwable) (Object) var2, "np.J(" + 31 + 41);
        }
    }

    np(cka param0) {
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
        ((np) this).field_L = 0;
        ((np) this).field_l = false;
        ((np) this).field_N = 0;
        ((np) this).field_s = false;
        ((np) this).field_gb = true;
        ((np) this).field_ib = 0;
        ((np) this).field_W = 0;
        ((np) this).field_lb = 0;
        try {
          L0: {
            ((np) this).field_R = param0;
            ((np) this).field_g = new tj((va) null, 5126, 3, 0);
            ((np) this).field_ab = new tj((va) null, 5126, 2, 0);
            ((np) this).field_F = new tj((va) null, 5126, 3, 0);
            ((np) this).field_kb = new tj((va) null, 5121, 4, 0);
            ((np) this).field_w = new afa();
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            runtimeException = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) runtimeException;
            stackOut_3_1 = new StringBuilder().append("np.<init>(");
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
          throw tba.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + 41);
        }
    }

    np(cka param0, oc param1, int param2, int param3, int param4, int param5) {
        d var7 = null;
        int[] var8 = null;
        int var9_int = 0;
        long[] var9 = null;
        int var10 = 0;
        dw var10_ref_dw = null;
        int var11_int = 0;
        pa[] var11 = null;
        int var12 = 0;
        Object var13_ref = null;
        int var13 = 0;
        int var14_int = 0;
        lp var14 = null;
        ima var14_ref = null;
        int var15_int = 0;
        uo[] var15 = null;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19_int = 0;
        int[] var19 = null;
        jt var20_ref_jt = null;
        int var20 = 0;
        lp var21_ref_lp = null;
        int var21 = 0;
        dw var22_ref_dw = null;
        int var22_int = 0;
        float var22 = 0.0f;
        int var23_int = 0;
        float var23 = 0.0f;
        int var24_int = 0;
        float var24 = 0.0f;
        int var25_int = 0;
        float var25 = 0.0f;
        int var26_int = 0;
        float var26 = 0.0f;
        int var27_int = 0;
        float var27 = 0.0f;
        int var28 = 0;
        int var29 = 0;
        int var30 = 0;
        int var31 = 0;
        pa var31_ref_pa = null;
        uo var31_ref_uo = null;
        int var32_int = 0;
        long var32_long = 0L;
        uo var32 = null;
        int var33_int = 0;
        long var33 = 0L;
        int var34 = 0;
        int var35 = 0;
        int var36 = 0;
        int var37_int = 0;
        pa var37 = null;
        float var38 = 0.0f;
        float[] var38_ref_float__ = null;
        float var39 = 0.0f;
        int var39_int = 0;
        float var40 = 0.0f;
        float var41 = 0.0f;
        float var42 = 0.0f;
        float var43 = 0.0f;
        int var43_int = 0;
        float var44 = 0.0f;
        int var44_int = 0;
        float var45 = 0.0f;
        int var45_int = 0;
        float var46 = 0.0f;
        int var46_int = 0;
        float var47 = 0.0f;
        int var47_int = 0;
        float var48 = 0.0f;
        int var48_int = 0;
        float var49 = 0.0f;
        int var49_int = 0;
        float var50 = 0.0f;
        int var50_int = 0;
        float var51 = 0.0f;
        int var51_int = 0;
        float var52 = 0.0f;
        float var53 = 0.0f;
        float var54 = 0.0f;
        float var55 = 0.0f;
        float var56 = 0.0f;
        float var57 = 0.0f;
        float var58 = 0.0f;
        float var59 = 0.0f;
        float var60 = 0.0f;
        float var61 = 0.0f;
        float var62 = 0.0f;
        int var63 = 0;
        int stackIn_33_0 = 0;
        int stackIn_74_0 = 0;
        int stackIn_98_0 = 0;
        int stackIn_98_1 = 0;
        int stackIn_99_0 = 0;
        int stackIn_99_1 = 0;
        int stackIn_100_0 = 0;
        int stackIn_100_1 = 0;
        int stackIn_100_2 = 0;
        int stackIn_127_0 = 0;
        int stackIn_145_0 = 0;
        int stackIn_222_0 = 0;
        int stackIn_223_0 = 0;
        int stackIn_224_0 = 0;
        int stackIn_224_1 = 0;
        int stackIn_254_0 = 0;
        int stackIn_254_1 = 0;
        int stackOut_32_0 = 0;
        int stackOut_31_0 = 0;
        int stackOut_97_0 = 0;
        int stackOut_97_1 = 0;
        int stackOut_99_0 = 0;
        int stackOut_99_1 = 0;
        byte stackOut_99_2 = 0;
        int stackOut_98_0 = 0;
        int stackOut_98_1 = 0;
        int stackOut_98_2 = 0;
        int stackOut_253_0 = 0;
        int stackOut_253_1 = 0;
        int stackOut_144_0 = 0;
        short stackOut_143_0 = 0;
        int stackOut_221_0 = 0;
        int stackOut_223_0 = 0;
        int stackOut_223_1 = 0;
        int stackOut_222_0 = 0;
        int stackOut_222_1 = 0;
        byte stackOut_126_0 = 0;
        int stackOut_125_0 = 0;
        int stackOut_73_0 = 0;
        int stackOut_72_0 = 0;
        L0: {
          var63 = TombRacer.field_G ? 1 : 0;
          ((np) this).field_L = 0;
          ((np) this).field_l = false;
          ((np) this).field_N = 0;
          ((np) this).field_s = false;
          ((np) this).field_gb = true;
          ((np) this).field_ib = 0;
          ((np) this).field_W = 0;
          ((np) this).field_lb = 0;
          ((np) this).field_bb = param2;
          ((np) this).field_R = param0;
          ((np) this).field_u = param5;
          if (!hha.a(param5, 0, param2)) {
            break L0;
          } else {
            ((np) this).field_g = new tj((va) null, 5126, 3, 0);
            break L0;
          }
        }
        L1: {
          if (!wu.a(-17, param5, param2)) {
            break L1;
          } else {
            ((np) this).field_ab = new tj((va) null, 5126, 2, 0);
            break L1;
          }
        }
        L2: {
          if (!kb.a(param5, param2, (byte) 17)) {
            break L2;
          } else {
            ((np) this).field_F = new tj((va) null, 5126, 3, 0);
            break L2;
          }
        }
        L3: {
          if (we.b(param2, param5, 2048)) {
            ((np) this).field_kb = new tj((va) null, 5121, 4, 0);
            break L3;
          } else {
            break L3;
          }
        }
        L4: {
          if (mm.a(-122, param2, param5)) {
            ((np) this).field_w = new afa();
            break L4;
          } else {
            break L4;
          }
        }
        var7 = param0.field_c;
        var8 = new int[param1.field_o];
        ((np) this).field_e = new int[param1.field_L + 1];
        var9_int = 0;
        L5: while (true) {
          if (param1.field_o <= var9_int) {
            L6: {
              ((np) this).field_ib = ((np) this).field_W;
              var9 = new long[((np) this).field_W];
              if ((((np) this).field_bb & 256) == 0) {
                stackOut_32_0 = 0;
                stackIn_33_0 = stackOut_32_0;
                break L6;
              } else {
                stackOut_31_0 = 1;
                stackIn_33_0 = stackOut_31_0;
                break L6;
              }
            }
            var10 = stackIn_33_0;
            var11_int = 0;
            L7: while (true) {
              if (var11_int >= ((np) this).field_W) {
                L8: {
                  ofa.a(var8, var9, 93);
                  ((np) this).field_P = param1.field_b;
                  ((np) this).field_A = param1.field_p;
                  ((np) this).field_N = param1.field_E;
                  ((np) this).field_K = param1.field_I;
                  ((np) this).field_lb = param1.field_L;
                  ((np) this).field_db = param1.field_y;
                  ((np) this).field_t = param1.field_e;
                  var11 = new pa[((np) this).field_lb];
                  ((np) this).field_D = param1.field_B;
                  if (param1.field_m != null) {
                    ((np) this).field_G = param1.field_m.length;
                    ((np) this).field_f = new fd[((np) this).field_G];
                    ((np) this).field_r = new pm[((np) this).field_G];
                    var12 = 0;
                    L9: while (true) {
                      if (var12 >= ((np) this).field_G) {
                        break L8;
                      } else {
                        var13_ref = (Object) (Object) param1.field_m[var12];
                        var14 = fw.a(((jt) var13_ref).field_d, false);
                        var15_int = -1;
                        var16 = 0;
                        L10: while (true) {
                          L11: {
                            if (~((np) this).field_W >= ~var16) {
                              break L11;
                            } else {
                              if (~((jt) var13_ref).field_a != ~var8[var16]) {
                                var16++;
                                continue L10;
                              } else {
                                var15_int = var16;
                                break L11;
                              }
                            }
                          }
                          if (var15_int != -1) {
                            L12: {
                              var16 = cla.field_m[param1.field_A[((jt) var13_ref).field_a] & 65535] & 16777215;
                              stackOut_97_0 = var16;
                              stackOut_97_1 = 255;
                              stackIn_99_0 = stackOut_97_0;
                              stackIn_99_1 = stackOut_97_1;
                              stackIn_98_0 = stackOut_97_0;
                              stackIn_98_1 = stackOut_97_1;
                              if (param1.field_n != null) {
                                stackOut_99_0 = stackIn_99_0;
                                stackOut_99_1 = stackIn_99_1;
                                stackOut_99_2 = param1.field_n[((jt) var13_ref).field_a];
                                stackIn_100_0 = stackOut_99_0;
                                stackIn_100_1 = stackOut_99_1;
                                stackIn_100_2 = stackOut_99_2;
                                break L12;
                              } else {
                                stackOut_98_0 = stackIn_98_0;
                                stackOut_98_1 = stackIn_98_1;
                                stackOut_98_2 = 0;
                                stackIn_100_0 = stackOut_98_0;
                                stackIn_100_1 = stackOut_98_1;
                                stackIn_100_2 = stackOut_98_2;
                                break L12;
                              }
                            }
                            var16 = stackIn_100_0 | stackIn_100_1 - stackIn_100_2 << 24;
                            ((np) this).field_r[var12] = new pm(var15_int, (int) param1.field_a[((jt) var13_ref).field_a], (int) param1.field_t[((jt) var13_ref).field_a], (int) param1.field_J[((jt) var13_ref).field_a], var14.field_d, var14.field_b, var14.field_f, var14.field_c, var14.field_e, var14.field_i, var14.field_a, ((jt) var13_ref).field_c);
                            ((np) this).field_f[var12] = new fd(var16);
                            var12++;
                            continue L9;
                          } else {
                            throw new RuntimeException();
                          }
                        }
                      }
                    }
                  } else {
                    break L8;
                  }
                }
                L13: {
                  var12 = ((np) this).field_W * 3;
                  if (null != param1.field_h) {
                    ((np) this).field_fb = new short[((np) this).field_W];
                    break L13;
                  } else {
                    break L13;
                  }
                }
                ((np) this).field_y = new float[var12];
                ((np) this).field_n = new float[var12];
                ((np) this).field_Y = new short[var12];
                ((np) this).field_I = new short[((np) this).field_W];
                ((np) this).field_E = new short[var12];
                ((np) this).field_hb = new short[((np) this).field_W];
                ((np) this).field_O = new byte[var12];
                ((np) this).field_cb = new short[var12];
                ((np) this).field_o = new byte[((np) this).field_W];
                ((np) this).field_h = (short)param4;
                ((np) this).field_z = new short[((np) this).field_W];
                ((np) this).field_H = new short[((np) this).field_W];
                ((np) this).field_B = (short)param3;
                ((np) this).field_X = new short[((np) this).field_W];
                ((np) this).field_q = new short[var12];
                qka.field_m = new long[var12];
                var13 = 0;
                var14_int = 0;
                L14: while (true) {
                  if (var14_int >= param1.field_L) {
                    ((np) this).field_e[param1.field_L] = var13;
                    int discarded$5 = -6;
                    var14_ref = qqa.a(var8, param1, ((np) this).field_W);
                    var15 = new uo[param1.field_o];
                    var16 = 0;
                    L15: while (true) {
                      if (var16 >= param1.field_o) {
                        var16 = 0;
                        L16: while (true) {
                          if (~var16 <= ~((np) this).field_W) {
                            var16 = 0;
                            var17 = -10000;
                            var18 = 0;
                            L17: while (true) {
                              if (~((np) this).field_ib >= ~var18) {
                                ((np) this).field_p = new int[var16 - -1];
                                var17 = -10000;
                                var16 = 0;
                                var18 = 0;
                                L18: while (true) {
                                  if (~((np) this).field_ib >= ~var18) {
                                    L19: {
                                      ((np) this).field_p[var16] = ((np) this).field_ib;
                                      qka.field_m = null;
                                      ((np) this).field_E = rna.a(((np) this).field_E, true, ((np) this).field_L);
                                      ((np) this).field_Y = rna.a(((np) this).field_Y, true, ((np) this).field_L);
                                      ((np) this).field_cb = rna.a(((np) this).field_cb, true, ((np) this).field_L);
                                      int discarded$6 = 4096;
                                      ((np) this).field_O = pt.a(((np) this).field_O, ((np) this).field_L);
                                      ((np) this).field_n = lpa.a(((np) this).field_L, 50, ((np) this).field_n);
                                      ((np) this).field_y = lpa.a(((np) this).field_L, 50, ((np) this).field_y);
                                      if (null == param1.field_l) {
                                        break L19;
                                      } else {
                                        if (kda.b(param2, 104, ((np) this).field_u)) {
                                          ((np) this).field_d = param1.a(false, (byte) 64);
                                          break L19;
                                        } else {
                                          break L19;
                                        }
                                      }
                                    }
                                    L20: {
                                      if (null == param1.field_m) {
                                        break L20;
                                      } else {
                                        if (!eo.a(((np) this).field_u, (byte) 83, param2)) {
                                          break L20;
                                        } else {
                                          ((np) this).field_C = param1.b((byte) -91);
                                          break L20;
                                        }
                                      }
                                    }
                                    L21: {
                                      if (param1.field_D == null) {
                                        break L21;
                                      } else {
                                        stackOut_253_0 = -26571;
                                        stackOut_253_1 = param2;
                                        stackIn_254_0 = stackOut_253_0;
                                        stackIn_254_1 = stackOut_253_1;
                                        if (aw.d(stackIn_254_0, stackIn_254_1, ((np) this).field_u)) {
                                          var18 = 0;
                                          var19 = new int[256];
                                          var20 = 0;
                                          L22: while (true) {
                                            if (var20 >= ((np) this).field_W) {
                                              ((np) this).field_j = new int[1 + var18][];
                                              var20 = 0;
                                              L23: while (true) {
                                                if (var18 < var20) {
                                                  var20 = 0;
                                                  L24: while (true) {
                                                    if (~((np) this).field_W >= ~var20) {
                                                      break L21;
                                                    } else {
                                                      L25: {
                                                        var21 = param1.field_D[var8[var20]];
                                                        if (var21 < 0) {
                                                          break L25;
                                                        } else {
                                                          var19[var21] = var19[var21] + 1;
                                                          ((np) this).field_j[var21][var19[var21]] = var20;
                                                          break L25;
                                                        }
                                                      }
                                                      var20++;
                                                      continue L24;
                                                    }
                                                  }
                                                } else {
                                                  ((np) this).field_j[var20] = new int[var19[var20]];
                                                  var19[var20] = 0;
                                                  var20++;
                                                  continue L23;
                                                }
                                              }
                                            } else {
                                              L26: {
                                                var21 = param1.field_D[var8[var20]];
                                                if (var21 < 0) {
                                                  break L26;
                                                } else {
                                                  L27: {
                                                    if (~var21 >= ~var18) {
                                                      break L27;
                                                    } else {
                                                      var18 = var21;
                                                      break L27;
                                                    }
                                                  }
                                                  var19[var21] = var19[var21] + 1;
                                                  break L26;
                                                }
                                              }
                                              var20++;
                                              continue L22;
                                            }
                                          }
                                        } else {
                                          break L21;
                                        }
                                      }
                                    }
                                    return;
                                  } else {
                                    L28: {
                                      var19_int = ((np) this).field_I[var18];
                                      if (~var19_int == ~var17) {
                                        break L28;
                                      } else {
                                        int incrementValue$7 = var16;
                                        var16++;
                                        ((np) this).field_p[incrementValue$7] = var18;
                                        var17 = var19_int;
                                        break L28;
                                      }
                                    }
                                    var18++;
                                    continue L18;
                                  }
                                }
                              } else {
                                L29: {
                                  var19_int = ((np) this).field_I[var18];
                                  if (~var19_int == ~var17) {
                                    break L29;
                                  } else {
                                    var17 = var19_int;
                                    var16++;
                                    break L29;
                                  }
                                }
                                var18++;
                                continue L17;
                              }
                            }
                          } else {
                            L30: {
                              var17 = var8[var16];
                              var18 = param1.field_A[var17] & 65535;
                              if (param1.field_g != null) {
                                var19_int = param1.field_g[var17];
                                break L30;
                              } else {
                                var19_int = -1;
                                break L30;
                              }
                            }
                            L31: {
                              if (param1.field_n == null) {
                                var20 = 0;
                                break L31;
                              } else {
                                var20 = 255 & param1.field_n[var17];
                                break L31;
                              }
                            }
                            L32: {
                              if (param1.field_r == null) {
                                stackOut_144_0 = -1;
                                stackIn_145_0 = stackOut_144_0;
                                break L32;
                              } else {
                                stackOut_143_0 = param1.field_r[var17];
                                stackIn_145_0 = stackOut_143_0;
                                break L32;
                              }
                            }
                            L33: {
                              var21 = stackIn_145_0;
                              if (-1 == var21) {
                                break L33;
                              } else {
                                if ((64 & ((np) this).field_u) == 0) {
                                  break L33;
                                } else {
                                  var22_ref_dw = var7.a((byte) -92, 65535 & var21);
                                  if (!var22_ref_dw.field_p) {
                                    break L33;
                                  } else {
                                    var21 = -1;
                                    break L33;
                                  }
                                }
                              }
                            }
                            L34: {
                              var22 = 0.0f;
                              var23 = 0.0f;
                              var24 = 0.0f;
                              var25 = 0.0f;
                              var26 = 0.0f;
                              var27 = 0.0f;
                              var28 = 0;
                              var29 = 0;
                              var30 = 0;
                              if (-1 != var21) {
                                if (var19_int != -1) {
                                  var19_int = var19_int & 255;
                                  var31 = param1.field_u[var19_int];
                                  if (var31 == 0) {
                                    var32_int = param1.field_a[var17];
                                    var33_int = param1.field_t[var17];
                                    var34 = param1.field_J[var17];
                                    var35 = param1.field_s[var19_int];
                                    var36 = param1.field_q[var19_int];
                                    var37_int = param1.field_K[var19_int];
                                    var38 = (float)param1.field_b[var35];
                                    var39 = (float)param1.field_I[var35];
                                    var40 = (float)param1.field_p[var35];
                                    var41 = (float)param1.field_b[var36] - var38;
                                    var42 = (float)param1.field_I[var36] - var39;
                                    var43 = (float)param1.field_p[var36] - var40;
                                    var44 = (float)param1.field_b[var37_int] - var38;
                                    var45 = (float)param1.field_I[var37_int] - var39;
                                    var46 = (float)param1.field_p[var37_int] - var40;
                                    var47 = -var38 + (float)param1.field_b[var32_int];
                                    var48 = (float)param1.field_I[var32_int] - var39;
                                    var49 = (float)param1.field_p[var32_int] - var40;
                                    var50 = (float)param1.field_b[var33_int] - var38;
                                    var51 = (float)param1.field_I[var33_int] - var39;
                                    var52 = (float)param1.field_p[var33_int] - var40;
                                    var53 = (float)param1.field_b[var34] - var38;
                                    var54 = (float)param1.field_I[var34] - var39;
                                    var55 = -var40 + (float)param1.field_p[var34];
                                    var56 = var46 * var42 - var43 * var45;
                                    var57 = -(var41 * var46) + var43 * var44;
                                    var58 = -(var44 * var42) + var41 * var45;
                                    var59 = var45 * var58 - var57 * var46;
                                    var60 = var46 * var56 - var44 * var58;
                                    var61 = -(var45 * var56) + var44 * var57;
                                    var62 = 1.0f / (var41 * var59 + var42 * var60 + var61 * var43);
                                    var26 = (var54 * var60 + var53 * var59 + var61 * var55) * var62;
                                    var24 = (var51 * var60 + var59 * var50 + var61 * var52) * var62;
                                    var22 = (var61 * var49 + (var59 * var47 + var60 * var48)) * var62;
                                    var61 = var41 * var57 - var42 * var56;
                                    var60 = -(var58 * var41) + var43 * var56;
                                    var59 = -(var43 * var57) + var58 * var42;
                                    var62 = 1.0f / (var45 * var60 + var44 * var59 + var46 * var61);
                                    var25 = (var59 * var50 + var51 * var60 + var52 * var61) * var62;
                                    var23 = (var61 * var49 + (var48 * var60 + var59 * var47)) * var62;
                                    var27 = (var55 * var61 + (var60 * var54 + var59 * var53)) * var62;
                                    break L34;
                                  } else {
                                    L35: {
                                      var32_int = param1.field_a[var17];
                                      var33_int = param1.field_t[var17];
                                      var34 = param1.field_J[var17];
                                      var35 = var14_ref.field_a[var19_int];
                                      var36 = var14_ref.field_c[var19_int];
                                      var37_int = var14_ref.field_d[var19_int];
                                      var38_ref_float__ = var14_ref.field_b[var19_int];
                                      var39_int = param1.field_z[var19_int];
                                      var40 = (float)param1.field_d[var19_int] / 256.0f;
                                      if (var31 == 1) {
                                        var41 = (float)param1.field_x[var19_int] / 1024.0f;
                                        loa.a(var39_int, dia.field_p, var41, param1.field_p[var32_int], param1.field_I[var32_int], 86, var38_ref_float__, var40, var36, var37_int, param1.field_b[var32_int], var35);
                                        var23 = dia.field_p[1];
                                        var22 = dia.field_p[0];
                                        loa.a(var39_int, dia.field_p, var41, param1.field_p[var33_int], param1.field_I[var33_int], -68, var38_ref_float__, var40, var36, var37_int, param1.field_b[var33_int], var35);
                                        var25 = dia.field_p[1];
                                        var24 = dia.field_p[0];
                                        loa.a(var39_int, dia.field_p, var41, param1.field_p[var34], param1.field_I[var34], 113, var38_ref_float__, var40, var36, var37_int, param1.field_b[var34], var35);
                                        var26 = dia.field_p[0];
                                        var27 = dia.field_p[1];
                                        var42 = var41 / 2.0f;
                                        if ((var39_int & 1) != 0) {
                                          L36: {
                                            if (var42 >= var25 - var23) {
                                              if (-var25 + var23 <= var42) {
                                                break L36;
                                              } else {
                                                var25 = var25 + var41;
                                                var28 = 2;
                                                break L36;
                                              }
                                            } else {
                                              var28 = 1;
                                              var25 = var25 - var41;
                                              break L36;
                                            }
                                          }
                                          if (-var23 + var27 > var42) {
                                            var27 = var27 - var41;
                                            var29 = 1;
                                            break L35;
                                          } else {
                                            if (var42 < var23 - var27) {
                                              var29 = 2;
                                              var27 = var27 + var41;
                                              break L35;
                                            } else {
                                              break L35;
                                            }
                                          }
                                        } else {
                                          L37: {
                                            if (var26 - var22 <= var42) {
                                              if (var42 >= -var26 + var22) {
                                                break L37;
                                              } else {
                                                var26 = var26 + var41;
                                                var29 = 2;
                                                break L37;
                                              }
                                            } else {
                                              var26 = var26 - var41;
                                              var29 = 1;
                                              break L37;
                                            }
                                          }
                                          if (var42 >= -var22 + var24) {
                                            if (var42 < -var24 + var22) {
                                              var24 = var24 + var41;
                                              var28 = 2;
                                              break L35;
                                            } else {
                                              break L35;
                                            }
                                          } else {
                                            var24 = var24 - var41;
                                            var28 = 1;
                                            break L35;
                                          }
                                        }
                                      } else {
                                        if (var31 == 2) {
                                          var41 = (float)param1.field_v[var19_int] / 256.0f;
                                          var42 = (float)param1.field_c[var19_int] / 256.0f;
                                          var43_int = param1.field_b[var33_int] - param1.field_b[var32_int];
                                          var44_int = param1.field_I[var33_int] + -param1.field_I[var32_int];
                                          var45_int = param1.field_p[var33_int] + -param1.field_p[var32_int];
                                          var46_int = -param1.field_b[var32_int] + param1.field_b[var34];
                                          var47_int = -param1.field_I[var32_int] + param1.field_I[var34];
                                          var48_int = -param1.field_p[var32_int] + param1.field_p[var34];
                                          var49_int = var48_int * var44_int + -(var47_int * var45_int);
                                          var50_int = var45_int * var46_int - var48_int * var43_int;
                                          var51_int = -(var44_int * var46_int) + var47_int * var43_int;
                                          var52 = 64.0f / (float)param1.field_j[var19_int];
                                          var53 = 64.0f / (float)param1.field_f[var19_int];
                                          var54 = 64.0f / (float)param1.field_x[var19_int];
                                          var55 = (var38_ref_float__[2] * (float)var51_int + (var38_ref_float__[0] * (float)var49_int + (float)var50_int * var38_ref_float__[1])) / var52;
                                          var56 = (var38_ref_float__[4] * (float)var50_int + (float)var49_int * var38_ref_float__[3] + var38_ref_float__[5] * (float)var51_int) / var53;
                                          var57 = (var38_ref_float__[8] * (float)var51_int + ((float)var50_int * var38_ref_float__[7] + var38_ref_float__[6] * (float)var49_int)) / var54;
                                          var30 = mr.a(var57, var56, false, var55);
                                          as.a(var36, dia.field_p, param1.field_I[var32_int], var35, var42, var37_int, var41, param1.field_b[var32_int], var30, param1.field_p[var32_int], -101, var40, var39_int, var38_ref_float__);
                                          var22 = dia.field_p[0];
                                          var23 = dia.field_p[1];
                                          as.a(var36, dia.field_p, param1.field_I[var33_int], var35, var42, var37_int, var41, param1.field_b[var33_int], var30, param1.field_p[var33_int], -95, var40, var39_int, var38_ref_float__);
                                          var25 = dia.field_p[1];
                                          var24 = dia.field_p[0];
                                          as.a(var36, dia.field_p, param1.field_I[var34], var35, var42, var37_int, var41, param1.field_b[var34], var30, param1.field_p[var34], -99, var40, var39_int, var38_ref_float__);
                                          var26 = dia.field_p[0];
                                          var27 = dia.field_p[1];
                                          break L35;
                                        } else {
                                          if (3 == var31) {
                                            ifa.a(param1.field_p[var32_int], param1.field_b[var32_int], var36, var37_int, dia.field_p, var40, var39_int, var35, var38_ref_float__, (byte) -44, param1.field_I[var32_int]);
                                            var22 = dia.field_p[0];
                                            var23 = dia.field_p[1];
                                            ifa.a(param1.field_p[var33_int], param1.field_b[var33_int], var36, var37_int, dia.field_p, var40, var39_int, var35, var38_ref_float__, (byte) -44, param1.field_I[var33_int]);
                                            var25 = dia.field_p[1];
                                            var24 = dia.field_p[0];
                                            ifa.a(param1.field_p[var34], param1.field_b[var34], var36, var37_int, dia.field_p, var40, var39_int, var35, var38_ref_float__, (byte) -44, param1.field_I[var34]);
                                            var27 = dia.field_p[1];
                                            var26 = dia.field_p[0];
                                            if ((var39_int & 1) != 0) {
                                              L38: {
                                                if (0.5f < var27 - var23) {
                                                  var29 = 1;
                                                  var27 = var27 - 1.0f;
                                                  break L38;
                                                } else {
                                                  if (var23 - var27 <= 0.5f) {
                                                    break L38;
                                                  } else {
                                                    var27 = var27 + 1.0f;
                                                    var29 = 2;
                                                    break L38;
                                                  }
                                                }
                                              }
                                              if (var25 - var23 > 0.5f) {
                                                var25 = var25 - 1.0f;
                                                var28 = 1;
                                                break L35;
                                              } else {
                                                if (0.5f < var23 - var25) {
                                                  var28 = 2;
                                                  var25 = var25 + 1.0f;
                                                  break L35;
                                                } else {
                                                  break L35;
                                                }
                                              }
                                            } else {
                                              L39: {
                                                if (var26 - var22 <= 0.5f) {
                                                  if (var22 - var26 > 0.5f) {
                                                    var26 = var26 + 1.0f;
                                                    var29 = 2;
                                                    break L39;
                                                  } else {
                                                    break L39;
                                                  }
                                                } else {
                                                  var29 = 1;
                                                  var26 = var26 - 1.0f;
                                                  break L39;
                                                }
                                              }
                                              if (var24 - var22 <= 0.5f) {
                                                if (var22 - var24 <= 0.5f) {
                                                  break L35;
                                                } else {
                                                  var24 = var24 + 1.0f;
                                                  var28 = 2;
                                                  break L35;
                                                }
                                              } else {
                                                var24 = var24 - 1.0f;
                                                var28 = 1;
                                                break L35;
                                              }
                                            }
                                          } else {
                                            break L35;
                                          }
                                        }
                                      }
                                    }
                                    break L34;
                                  }
                                } else {
                                  var23 = 1.0f;
                                  var22 = 0.0f;
                                  var24 = 1.0f;
                                  var27 = 0.0f;
                                  var26 = 0.0f;
                                  var29 = 2;
                                  var25 = 1.0f;
                                  var28 = 1;
                                  break L34;
                                }
                              } else {
                                break L34;
                              }
                            }
                            L40: {
                              if (param1.field_G == null) {
                                var31 = 0;
                                break L40;
                              } else {
                                var31 = param1.field_G[var17];
                                break L40;
                              }
                            }
                            L41: {
                              if (0 != var31) {
                                if (var31 != 1) {
                                  break L41;
                                } else {
                                  L42: {
                                    var32 = var15[var17];
                                    stackOut_221_0 = (256 + var32.field_a << 22) + ((var32.field_c + 256 << 12) + (var19_int << 2));
                                    stackIn_223_0 = stackOut_221_0;
                                    stackIn_222_0 = stackOut_221_0;
                                    if (var32.field_b > 0) {
                                      stackOut_223_0 = stackIn_223_0;
                                      stackOut_223_1 = 1024;
                                      stackIn_224_0 = stackOut_223_0;
                                      stackIn_224_1 = stackOut_223_1;
                                      break L42;
                                    } else {
                                      stackOut_222_0 = stackIn_222_0;
                                      stackOut_222_1 = 2048;
                                      stackIn_224_0 = stackOut_222_0;
                                      stackIn_224_1 = stackOut_222_1;
                                      break L42;
                                    }
                                  }
                                  var33 = (long)(stackIn_224_0 - -stackIn_224_1) - -((long)var20 + (long)(var18 << 8) + (long)(var30 << 24) << 32);
                                  ((np) this).field_H[var16] = this.a(var33, var32.field_a, var32.field_c, 0, (byte) -40, (int) param1.field_a[var17], var32.field_b, var23, param1, var22);
                                  ((np) this).field_z[var16] = this.a(var33 + (long)var28, var32.field_a, var32.field_c, 0, (byte) -40, (int) param1.field_t[var17], var32.field_b, var25, param1, var24);
                                  ((np) this).field_hb[var16] = this.a((long)var29 + var33, var32.field_a, var32.field_c, 0, (byte) -40, (int) param1.field_J[var17], var32.field_b, var27, param1, var26);
                                  break L41;
                                }
                              } else {
                                var32_long = (long)(var19_int << 2) - -((long)var20 + ((long)(var30 << 24) - -(long)(var18 << 8)) << 32);
                                var34 = param1.field_a[var17];
                                var35 = param1.field_t[var17];
                                var36 = param1.field_J[var17];
                                var37 = var11[var34];
                                ((np) this).field_H[var16] = this.a(var32_long, var37.field_a, var37.field_b, var37.field_d, (byte) -40, var34, var37.field_e, var23, param1, var22);
                                var37 = var11[var35];
                                ((np) this).field_z[var16] = this.a(var32_long + (long)var28, var37.field_a, var37.field_b, var37.field_d, (byte) -40, var35, var37.field_e, var25, param1, var24);
                                var37 = var11[var36];
                                ((np) this).field_hb[var16] = this.a(var32_long + (long)var29, var37.field_a, var37.field_b, var37.field_d, (byte) -40, var36, var37.field_e, var27, param1, var26);
                                break L41;
                              }
                            }
                            L43: {
                              if (param1.field_n != null) {
                                ((np) this).field_o[var16] = param1.field_n[var17];
                                break L43;
                              } else {
                                break L43;
                              }
                            }
                            L44: {
                              if (param1.field_h == null) {
                                break L44;
                              } else {
                                ((np) this).field_fb[var16] = param1.field_h[var17];
                                break L44;
                              }
                            }
                            ((np) this).field_X[var16] = param1.field_A[var17];
                            ((np) this).field_I[var16] = (short) var21;
                            var16++;
                            continue L16;
                          }
                        }
                      } else {
                        var17 = param1.field_a[var16];
                        var18 = param1.field_t[var16];
                        var19_int = param1.field_J[var16];
                        var20 = ((np) this).field_P[var18] - ((np) this).field_P[var17];
                        var21 = ((np) this).field_K[var18] - ((np) this).field_K[var17];
                        var22_int = ((np) this).field_A[var18] + -((np) this).field_A[var17];
                        var23_int = ((np) this).field_P[var19_int] - ((np) this).field_P[var17];
                        var24_int = -((np) this).field_K[var17] + ((np) this).field_K[var19_int];
                        var25_int = ((np) this).field_A[var19_int] + -((np) this).field_A[var17];
                        var26_int = var21 * var25_int - var24_int * var22_int;
                        var27_int = var22_int * var23_int - var25_int * var20;
                        var28 = var20 * var24_int + -(var21 * var23_int);
                        L45: while (true) {
                          L46: {
                            if (8192 < var26_int) {
                              break L46;
                            } else {
                              if (var27_int > 8192) {
                                break L46;
                              } else {
                                if (var28 > 8192) {
                                  break L46;
                                } else {
                                  if (-8192 > var26_int) {
                                    break L46;
                                  } else {
                                    if (-8192 > var27_int) {
                                      break L46;
                                    } else {
                                      if (-8192 <= var28) {
                                        L47: {
                                          var29 = (int)Math.sqrt((double)(var28 * var28 + var26_int * var26_int + var27_int * var27_int));
                                          if (var29 > 0) {
                                            break L47;
                                          } else {
                                            var29 = 1;
                                            break L47;
                                          }
                                        }
                                        L48: {
                                          var27_int = 256 * var27_int / var29;
                                          var28 = var28 * 256 / var29;
                                          var26_int = 256 * var26_int / var29;
                                          if (param1.field_G != null) {
                                            stackOut_126_0 = param1.field_G[var16];
                                            stackIn_127_0 = stackOut_126_0;
                                            break L48;
                                          } else {
                                            stackOut_125_0 = 0;
                                            stackIn_127_0 = stackOut_125_0;
                                            break L48;
                                          }
                                        }
                                        L49: {
                                          var30 = stackIn_127_0;
                                          if (var30 != 0) {
                                            if (var30 != 1) {
                                              break L49;
                                            } else {
                                              uo dupTemp$8 = new uo();
                                              var15[var16] = dupTemp$8;
                                              var31_ref_uo = dupTemp$8;
                                              var31_ref_uo.field_a = var28;
                                              var31_ref_uo.field_b = var26_int;
                                              var31_ref_uo.field_c = var27_int;
                                              break L49;
                                            }
                                          } else {
                                            var31_ref_pa = var11[var17];
                                            var31_ref_pa.field_b = var31_ref_pa.field_b + var27_int;
                                            var31_ref_pa.field_a = var31_ref_pa.field_a + var28;
                                            var31_ref_pa.field_d = var31_ref_pa.field_d + 1;
                                            var31_ref_pa.field_e = var31_ref_pa.field_e + var26_int;
                                            var31_ref_pa = var11[var18];
                                            var31_ref_pa.field_b = var31_ref_pa.field_b + var27_int;
                                            var31_ref_pa.field_d = var31_ref_pa.field_d + 1;
                                            var31_ref_pa.field_a = var31_ref_pa.field_a + var28;
                                            var31_ref_pa.field_e = var31_ref_pa.field_e + var26_int;
                                            var31_ref_pa = var11[var19_int];
                                            var31_ref_pa.field_d = var31_ref_pa.field_d + 1;
                                            var31_ref_pa.field_e = var31_ref_pa.field_e + var26_int;
                                            var31_ref_pa.field_b = var31_ref_pa.field_b + var27_int;
                                            var31_ref_pa.field_a = var31_ref_pa.field_a + var28;
                                            break L49;
                                          }
                                        }
                                        var16++;
                                        continue L15;
                                      } else {
                                        break L46;
                                      }
                                    }
                                  }
                                }
                              }
                            }
                          }
                          var26_int = var26_int >> 1;
                          var28 = var28 >> 1;
                          var27_int = var27_int >> 1;
                          continue L45;
                        }
                      }
                    }
                  } else {
                    var15_int = ((np) this).field_e[var14_int];
                    ((np) this).field_e[var14_int] = var13;
                    var13 = var13 + var15_int;
                    var11[var14_int] = new pa();
                    var14_int++;
                    continue L14;
                  }
                }
              } else {
                L50: {
                  L51: {
                    var12 = var8[var11_int];
                    var13_ref = null;
                    var14_int = 0;
                    var15_int = 0;
                    var16 = 0;
                    var17 = 0;
                    if (null != param1.field_m) {
                      var18 = 0;
                      var19_int = 0;
                      L52: while (true) {
                        if (~var19_int <= ~param1.field_m.length) {
                          if (var18 != 0) {
                            var9[var11_int] = 9223372036854775807L;
                            ((np) this).field_ib = ((np) this).field_ib - 1;
                            break L50;
                          } else {
                            break L51;
                          }
                        } else {
                          L53: {
                            var20_ref_jt = param1.field_m[var19_int];
                            if (~var12 == ~var20_ref_jt.field_a) {
                              L54: {
                                var21_ref_lp = fw.a(var20_ref_jt.field_d, false);
                                if (var21_ref_lp.field_i) {
                                  var18 = 1;
                                  break L54;
                                } else {
                                  break L54;
                                }
                              }
                              if (var21_ref_lp.field_f != -1) {
                                var22_ref_dw = var7.a((byte) -92, var21_ref_lp.field_f);
                                if (var22_ref_dw.field_d != 2) {
                                  break L53;
                                } else {
                                  ((np) this).field_s = true;
                                  break L53;
                                }
                              } else {
                                break L53;
                              }
                            } else {
                              break L53;
                            }
                          }
                          var19_int++;
                          continue L52;
                        }
                      }
                    } else {
                      break L51;
                    }
                  }
                  L55: {
                    var18 = -1;
                    if (param1.field_r != null) {
                      var18 = param1.field_r[var12];
                      if (var18 != -1) {
                        L56: {
                          var13_ref = (Object) (Object) var7.a((byte) 118, 65535 & var18);
                          if ((64 & ((np) this).field_u) == 0) {
                            break L56;
                          } else {
                            if (((dw) var13_ref).field_p) {
                              var18 = -1;
                              var13_ref = null;
                              break L55;
                            } else {
                              break L56;
                            }
                          }
                        }
                        L57: {
                          var16 = ((dw) var13_ref).field_h;
                          if (0 != ((dw) var13_ref).field_s) {
                            break L57;
                          } else {
                            if (0 != ((dw) var13_ref).field_o) {
                              break L57;
                            } else {
                              break L57;
                            }
                          }
                        }
                        var17 = ((dw) var13_ref).field_a;
                        break L55;
                      } else {
                        break L55;
                      }
                    } else {
                      break L55;
                    }
                  }
                  L58: {
                    L59: {
                      L60: {
                        if (param1.field_n == null) {
                          break L60;
                        } else {
                          if (param1.field_n[var12] != 0) {
                            break L59;
                          } else {
                            break L60;
                          }
                        }
                      }
                      L61: {
                        if (var13_ref == null) {
                          break L61;
                        } else {
                          if (((dw) var13_ref).field_d == 0) {
                            break L61;
                          } else {
                            break L59;
                          }
                        }
                      }
                      stackOut_73_0 = 0;
                      stackIn_74_0 = stackOut_73_0;
                      break L58;
                    }
                    stackOut_72_0 = 1;
                    stackIn_74_0 = stackOut_72_0;
                    break L58;
                  }
                  L62: {
                    L63: {
                      var19_int = stackIn_74_0;
                      if (var10 != 0) {
                        break L63;
                      } else {
                        if (var19_int == 0) {
                          break L62;
                        } else {
                          break L63;
                        }
                      }
                    }
                    if (null != param1.field_C) {
                      var14_int = var14_int + (param1.field_C[var12] << 17);
                      break L62;
                    } else {
                      break L62;
                    }
                  }
                  L64: {
                    if (var19_int == 0) {
                      break L64;
                    } else {
                      var14_int = var14_int + 65536;
                      break L64;
                    }
                  }
                  var14_int = var14_int + (var16 << 8 & 65280);
                  var15_int = var15_int + ((var18 & 65535) << 16);
                  var14_int = var14_int + (var17 & 255);
                  var15_int = var15_int + (65535 & var11_int);
                  var9[var11_int] = ((long)var14_int << 32) - -(long)var15_int;
                  ((np) this).field_s = ((np) this).field_s | var19_int != 0;
                  break L50;
                }
                var11_int++;
                continue L7;
              }
            }
          } else {
            L65: {
              L66: {
                if (param1.field_G == null) {
                  break L66;
                } else {
                  if (2 == param1.field_G[var9_int]) {
                    break L65;
                  } else {
                    break L66;
                  }
                }
              }
              L67: {
                if (param1.field_r == null) {
                  break L67;
                } else {
                  if (param1.field_r[var9_int] != -1) {
                    L68: {
                      var10_ref_dw = var7.a((byte) 111, param1.field_r[var9_int] & 65535);
                      if ((64 & ((np) this).field_u) == 0) {
                        break L68;
                      } else {
                        if (var10_ref_dw.field_p) {
                          break L67;
                        } else {
                          break L68;
                        }
                      }
                    }
                    if (var10_ref_dw.field_f) {
                      break L65;
                    } else {
                      break L67;
                    }
                  } else {
                    break L67;
                  }
                }
              }
              int fieldTemp$9 = ((np) this).field_W;
              ((np) this).field_W = ((np) this).field_W + 1;
              var8[fieldTemp$9] = var9_int;
              ((np) this).field_e[param1.field_a[var9_int]] = ((np) this).field_e[param1.field_a[var9_int]] + 1;
              ((np) this).field_e[param1.field_t[var9_int]] = ((np) this).field_e[param1.field_t[var9_int]] + 1;
              ((np) this).field_e[param1.field_J[var9_int]] = ((np) this).field_e[param1.field_J[var9_int]] + 1;
              break L65;
            }
            var9_int++;
            continue L5;
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_V = "<%0> has entered another game.";
    }
}
