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
        int stackIn_33_0 = 0;
        int stackIn_33_1 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
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
              L2: {
                if ((this.field_lb ^ -1) >= (var10 ^ -1)) {
                  stackIn_33_0 = param0;
                  stackIn_33_1 = 2709;
                  break L2;
                } else {
                  var11 = this.field_P[var10];
                  var12 = this.field_K[var10];
                  stackIn_33_0 = var2_int;

                  stackIn_33_1 = var11;

                  L3: {
                    if (stackIn_33_0 > stackIn_33_1) {
                      var2_int = var11;
                      break L3;
                    } else {
                      break L3;
                    }
                  }
                  L4: {
                    if (var3 > var12) {
                      var3 = var12;
                      break L4;
                    } else {
                      break L4;
                    }
                  }
                  L5: {
                    if ((var6 ^ -1) <= (var12 ^ -1)) {
                      break L5;
                    } else {
                      var6 = var12;
                      break L5;
                    }
                  }
                  L6: {
                    var13 = this.field_A[var10];
                    if (var11 <= var5) {
                      break L6;
                    } else {
                      var5 = var11;
                      break L6;
                    }
                  }
                  L7: {
                    if (var4 > var13) {
                      var4 = var13;
                      break L7;
                    } else {
                      break L7;
                    }
                  }
                  L8: {
                    if ((var7 ^ -1) <= (var13 ^ -1)) {
                      break L8;
                    } else {
                      var7 = var13;
                      break L8;
                    }
                  }
                  L9: {
                    var14 = var13 * var13 + var11 * var11;
                    if (var8 < var14) {
                      var8 = var14;
                      break L9;
                    } else {
                      break L9;
                    }
                  }
                  L10: {
                    var14 = var12 * var12 + var11 * var11 + var13 * var13;
                    if ((var14 ^ -1) < (var9 ^ -1)) {
                      var9 = var14;
                      break L10;
                    } else {
                      break L10;
                    }
                  }
                  var10++;
                  continue L1;
                }
              }
              if (stackIn_33_0 == stackIn_33_1) {
                this.field_k = (short)var4;
                this.field_T = (short)var5;
                this.field_S = (short)var7;
                this.field_eb = (short)var3;
                this.field_U = (short)var2_int;
                this.field_v = (short)var6;
                this.field_M = (short)(int)(0.99 + Math.sqrt((double)var8));
                Math.sqrt((double)var9);
                this.field_l = true;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                decompiledRegionSelector0 = 0;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw tba.a((Throwable) ((Object) var2), "np.S(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
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
              if (this.field_lb <= var4_int) {
                L2: {
                  this.field_l = false;
                  if (this.field_g == null) {
                    break L2;
                  } else {
                    this.field_g.field_d = null;
                    break L2;
                  }
                }
                break L0;
              } else {
                L3: {
                  if (0 == param0) {
                    break L3;
                  } else {
                    this.field_P[var4_int] = this.field_P[var4_int] + param0;
                    break L3;
                  }
                }
                L4: {
                  if (0 != param1) {
                    this.field_K[var4_int] = this.field_K[var4_int] + param1;
                    break L4;
                  } else {
                    break L4;
                  }
                }
                L5: {
                  if ((param2 ^ -1) == -1) {
                    break L5;
                  } else {
                    this.field_A[var4_int] = this.field_A[var4_int] + param2;
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
          throw tba.a((Throwable) ((Object) runtimeException), "np.H(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    private final int a(int param0, int param1, byte param2, short param3, int param4) {
        int stackIn_31_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        dw var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        var13 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              var6_int = cla.field_m[qp.c(param1, param4, 117)];
              if ((param3 ^ -1) == 0) {
                break L1;
              } else {
                L2: {
                  var7 = this.field_R.field_c.a((byte) -79, 65535 & param3);
                  var8 = 255 & var7.field_c;
                  if (-1 == (var8 ^ -1)) {
                    break L2;
                  } else {
                    L3: {
                      if ((param4 ^ -1) <= -1) {
                        if ((param4 ^ -1) < -128) {
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
                    if ((var8 ^ -1) == -257) {
                      var6_int = var9;
                      break L2;
                    } else {
                      var10 = var8;
                      var11 = 256 - var8;
                      var6_int = (-16711936 & (16711935 & var9) * var10 - -((16711935 & var6_int) * var11)) - -(16711680 & var11 * (65280 & var6_int) + (65280 & var9) * var10) >> -2117016184;
                      break L2;
                    }
                  }
                }
                var9 = 255 & var7.field_i;
                if (0 != var9) {
                  L4: {
                    var9 += 256;
                    var10 = (var6_int >> -553499408 & 255) * var9;
                    if (-65536 <= (var10 ^ -1)) {
                      break L4;
                    } else {
                      var10 = 65535;
                      break L4;
                    }
                  }
                  L5: {
                    var11 = var9 * ((65280 & var6_int) >> -1510998072);
                    if (-65536 > (var11 ^ -1)) {
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
                  var6_int = (var12 >> 1406443688) + ((16711843 & var10 << 211496968) + (65280 & var11));
                  break L1;
                } else {
                  break L1;
                }
              }
            }
            L7: {
              if (param0 == -2117016184) {
                break L7;
              } else {
                this.b();
                break L7;
              }
            }
            stackIn_31_0 = (var6_int << 1985794856) - -255 - (param2 & 255);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          throw tba.a((Throwable) ((Object) var6), "np.K(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
        return stackIn_31_0;
    }

    final void FA(int param0) {
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        var6 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            var2_int = qu.field_b[param0];
            var3 = qu.field_d[param0];
            var4 = 0;
            L1: while (true) {
              if ((this.field_lb ^ -1) >= (var4 ^ -1)) {
                L2: {
                  this.field_l = false;
                  if (this.field_g == null) {
                    break L2;
                  } else {
                    this.field_g.field_d = null;
                    break L2;
                  }
                }
                break L0;
              } else {
                var5 = this.field_K[var4] * var3 - var2_int * this.field_A[var4] >> -1809676626;
                this.field_A[var4] = var3 * this.field_A[var4] + var2_int * this.field_K[var4] >> 1196700814;
                this.field_K[var4] = var5;
                var4++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw tba.a((Throwable) ((Object) var2), "np.FA(" + param0 + ')');
        }
    }

    private final short a(long param0, int param1, int param2, int param3, byte param4, int param5, int param6, float param7, oc param8, float param9) {
        int fieldTemp$0 = 0;
        short stackIn_15_0 = 0;
        int stackIn_18_0 = 0;
        short stackIn_22_0 = 0;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_27_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var12_int = 0;
        RuntimeException var12 = null;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        var17 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            var12_int = this.field_e[param5];
            var13 = this.field_e[1 + param5];
            var14 = 0;
            var15 = var12_int;
            L1: while (true) {
              L2: {
                L3: {
                  if (var15 >= var13) {
                    break L3;
                  } else {
                    var16 = this.field_q[var15];
                    stackIn_18_0 = var16;

                    if (stackIn_18_0 == 0) {
                      var14 = var15;
                      break L3;
                    } else {
                      if ((qka.field_m[var15] ^ -1L) == (param0 ^ -1L)) {
                        stackIn_15_0 = (short)(-1 + var16);
                        decompiledRegionSelector0 = 0;
                        break L0;
                      } else {
                        var15++;
                        continue L1;
                      }
                    }
                  }
                }
                this.field_q[var14] = (short)(1 + this.field_L);
                qka.field_m[var14] = param0;
                this.field_E[this.field_L] = (short)param6;
                stackIn_18_0 = param4;
                break L2;
              }
              L4: {
                if (stackIn_18_0 == -40) {
                  break L4;
                } else {
                  this.field_s = true;
                  break L4;
                }
              }
              this.field_Y[this.field_L] = (short)param2;
              this.field_cb[this.field_L] = (short)param1;
              this.field_O[this.field_L] = (byte)param3;
              this.field_n[this.field_L] = param9;
              this.field_y[this.field_L] = param7;
              fieldTemp$0 = this.field_L;
              this.field_L = this.field_L + 1;
              stackIn_22_0 = (short)fieldTemp$0;
              decompiledRegionSelector0 = 1;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var12 = decompiledCaughtException;
            stackIn_26_0 = (RuntimeException) (var12);

            stackIn_26_1 = new StringBuilder().append("np.G(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',').append(param7).append(',');

            if (param8 == null) {
              stackIn_27_0 = (RuntimeException) ((Object) stackIn_26_0);
              stackIn_27_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackIn_27_2 = "null";
              break L5;
            } else {
              stackIn_27_0 = (RuntimeException) ((Object) stackIn_26_0);
              stackIn_27_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackIn_27_2 = "{...}";
              break L5;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_27_0), stackIn_27_2 + ',' + param9 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_15_0;
        } else {
          return stackIn_22_0;
        }
    }

    private final ka a(boolean param0, int param1, boolean param2, int param3, np param4, np param5) {
        int[] array$0 = null;
        int[] array$1 = null;
        int[] array$2 = null;
        short[] array$3 = null;
        byte[] array$4 = null;
        short[] array$5 = null;
        short[] array$6 = null;
        short[] array$7 = null;
        aba fieldTemp$8 = null;
        float[] array$9 = null;
        float[] array$10 = null;
        short[] array$11 = null;
        short[] array$12 = null;
        short[] array$13 = null;
        short[] array$14 = null;
        fd[] array$15 = null;
        int stackIn_79_0 = 0;
        np stackIn_316_0 = null;
        RuntimeException stackIn_320_0 = null;
        StringBuilder stackIn_320_1 = null;
        RuntimeException stackIn_321_0 = null;
        StringBuilder stackIn_321_1 = null;
        String stackIn_321_2 = null;
        StringBuilder stackIn_324_1 = null;
        StringBuilder stackIn_325_1 = null;
        String stackIn_325_2 = null;
        Throwable caughtException = null;
        RuntimeException decompiledCaughtException = null;
        int var7_int = 0;
        RuntimeException var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        aba var11_ref_aba = null;
        int var12 = 0;
        int var13 = 0;
        var13 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              param5.field_h = this.field_h;
              if (-1 == (param1 & 256 ^ -1)) {
                param5.field_s = this.field_s;
                break L1;
              } else {
                param5.field_s = true;
                break L1;
              }
            }
            L2: {
              param5.field_N = this.field_N;
              param5.field_bb = param1;
              param5.field_B = this.field_B;
              param5.field_Z = (byte) 0;
              param5.field_u = this.field_u;
              param5.field_G = this.field_G;
              param5.field_W = this.field_W;
              param5.field_ib = this.field_ib;
              param5.field_L = this.field_L;
              param5.field_lb = this.field_lb;
              var7_int = jj.a(this.field_u, param1, -32842) ? 1 : 0;
              var8 = mg.a((byte) -53, this.field_u, param1) ? 1 : 0;
              var9 = gha.a(this.field_u, param1, param3 ^ -22830) ? 1 : 0;
              var10 = var8 | var7_int | var9;
              if (param3 == -22857) {
                break L2;
              } else {
                this.field_q = (short[]) null;
                break L2;
              }
            }
            L3: {
              L4: {
                if (var10 != 0) {
                  L5: {
                    if (var7_int != 0) {
                      L6: {
                        if (param4.field_P == null) {
                          break L6;
                        } else {
                          if (this.field_N > param4.field_P.length) {
                            break L6;
                          } else {
                            param5.field_P = param4.field_P;
                            break L5;
                          }
                        }
                      }
                      array$0 = new int[this.field_N];
                      param4.field_P = array$0;
                      param5.field_P = array$0;
                      break L5;
                    } else {
                      param5.field_P = this.field_P;
                      break L5;
                    }
                  }
                  L7: {
                    if (var8 != 0) {
                      L8: {
                        if (null == param4.field_K) {
                          break L8;
                        } else {
                          if (this.field_N > param4.field_K.length) {
                            break L8;
                          } else {
                            param5.field_K = param4.field_K;
                            break L7;
                          }
                        }
                      }
                      array$1 = new int[this.field_N];
                      param4.field_K = array$1;
                      param5.field_K = array$1;
                      break L7;
                    } else {
                      param5.field_K = this.field_K;
                      break L7;
                    }
                  }
                  L9: {
                    if (var9 == 0) {
                      param5.field_A = this.field_A;
                      break L9;
                    } else {
                      L10: {
                        if (param4.field_A == null) {
                          break L10;
                        } else {
                          if (param4.field_A.length >= this.field_N) {
                            param5.field_A = param4.field_A;
                            break L9;
                          } else {
                            break L10;
                          }
                        }
                      }
                      array$2 = new int[this.field_N];
                      param4.field_A = array$2;
                      param5.field_A = array$2;
                      break L9;
                    }
                  }
                  var11 = 0;
                  L11: while (true) {
                    if (var11 >= this.field_N) {
                      break L4;
                    } else {
                      stackIn_79_0 = var7_int;

                      L12: {
                        if (stackIn_79_0 != 0) {
                          param5.field_P[var11] = this.field_P[var11];
                          break L12;
                        } else {
                          break L12;
                        }
                      }
                      L13: {
                        if (var8 != 0) {
                          param5.field_K[var11] = this.field_K[var11];
                          break L13;
                        } else {
                          break L13;
                        }
                      }
                      L14: {
                        if (var9 != 0) {
                          param5.field_A[var11] = this.field_A[var11];
                          break L14;
                        } else {
                          break L14;
                        }
                      }
                      var11++;
                      continue L11;
                    }
                  }
                } else {
                  param5.field_A = this.field_A;
                  param5.field_K = this.field_K;
                  param5.field_P = this.field_P;
                  break L4;
                }
              }
              stackIn_79_0 = so.a(param1, (byte) -106, this.field_u) ? 1 : 0;
              break L3;
            }
            L15: {
              if (stackIn_79_0 != 0) {
                L16: {
                  if (!param2) {
                    break L16;
                  } else {
                    param5.field_Z = (byte)(param5.field_Z | 1);
                    break L16;
                  }
                }
                param5.field_g = param4.field_g;
                param5.field_g.field_d = this.field_g.field_d;
                param5.field_g.field_g = this.field_g.field_g;
                break L15;
              } else {
                if (hha.a(this.field_u, 0, param1)) {
                  param5.field_g = this.field_g;
                  break L15;
                } else {
                  param5.field_g = null;
                  break L15;
                }
              }
            }
            L17: {
              if (!o.a(-1, this.field_u, param1)) {
                param5.field_X = this.field_X;
                break L17;
              } else {
                L18: {
                  L19: {
                    if (null == param4.field_X) {
                      break L19;
                    } else {
                      if (this.field_W <= param4.field_X.length) {
                        param5.field_X = param4.field_X;
                        break L18;
                      } else {
                        break L19;
                      }
                    }
                  }
                  array$3 = new short[this.field_W];
                  param4.field_X = array$3;
                  param5.field_X = array$3;
                  break L18;
                }
                var11 = 0;
                L20: while (true) {
                  if ((var11 ^ -1) <= (this.field_W ^ -1)) {
                    break L17;
                  } else {
                    param5.field_X[var11] = this.field_X[var11];
                    var11++;
                    continue L20;
                  }
                }
              }
            }
            L21: {
              if (mpa.a(false, this.field_u, param1)) {
                L22: {
                  L23: {
                    if (null == param4.field_o) {
                      break L23;
                    } else {
                      if ((param4.field_o.length ^ -1) <= (this.field_W ^ -1)) {
                        param5.field_o = param4.field_o;
                        break L22;
                      } else {
                        break L23;
                      }
                    }
                  }
                  array$4 = new byte[this.field_W];
                  param4.field_o = array$4;
                  param5.field_o = array$4;
                  break L22;
                }
                var11 = 0;
                L24: while (true) {
                  if ((this.field_W ^ -1) >= (var11 ^ -1)) {
                    break L21;
                  } else {
                    param5.field_o[var11] = this.field_o[var11];
                    var11++;
                    continue L24;
                  }
                }
              } else {
                param5.field_o = this.field_o;
                break L21;
              }
            }
            L25: {
              if (!vua.e(param1, this.field_u, 13650)) {
                if (!we.b(param1, this.field_u, 2048)) {
                  param5.field_kb = null;
                  break L25;
                } else {
                  param5.field_kb = this.field_kb;
                  break L25;
                }
              } else {
                L26: {
                  if (!param2) {
                    break L26;
                  } else {
                    param5.field_Z = (byte)(param5.field_Z | 2);
                    break L26;
                  }
                }
                param5.field_kb = param4.field_kb;
                param5.field_kb.field_d = this.field_kb.field_d;
                param5.field_kb.field_g = this.field_kb.field_g;
                break L25;
              }
            }
            L27: {
              if (cra.a(this.field_u, -17, param1)) {
                L28: {
                  L29: {
                    if (param4.field_E == null) {
                      break L29;
                    } else {
                      if (param4.field_E.length < this.field_L) {
                        break L29;
                      } else {
                        param5.field_Y = param4.field_Y;
                        param5.field_E = param4.field_E;
                        param5.field_cb = param4.field_cb;
                        break L28;
                      }
                    }
                  }
                  var11 = this.field_L;
                  array$5 = new short[var11];
                  param4.field_Y = array$5;
                  param5.field_Y = array$5;
                  array$6 = new short[var11];
                  param4.field_E = array$6;
                  param5.field_E = array$6;
                  array$7 = new short[var11];
                  param4.field_cb = array$7;
                  param5.field_cb = array$7;
                  break L28;
                }
                L30: {
                  if (null != this.field_i) {
                    L31: {
                      if (null != param4.field_i) {
                        break L31;
                      } else {
                        param4.field_i = new aba();
                        break L31;
                      }
                    }
                    L32: {
                      L33: {
                        fieldTemp$8 = param4.field_i;
                        param5.field_i = param4.field_i;
                        var11_ref_aba = fieldTemp$8;
                        if (var11_ref_aba.field_d == null) {
                          break L33;
                        } else {
                          if ((this.field_L ^ -1) < (var11_ref_aba.field_d.length ^ -1)) {
                            break L33;
                          } else {
                            break L32;
                          }
                        }
                      }
                      var12 = this.field_L;
                      var11_ref_aba.field_f = new short[var12];
                      var11_ref_aba.field_e = new byte[var12];
                      var11_ref_aba.field_d = new short[var12];
                      var11_ref_aba.field_b = new short[var12];
                      break L32;
                    }
                    var12 = 0;
                    L34: while (true) {
                      if ((this.field_L ^ -1) >= (var12 ^ -1)) {
                        break L30;
                      } else {
                        param5.field_E[var12] = this.field_E[var12];
                        param5.field_Y[var12] = this.field_Y[var12];
                        param5.field_cb[var12] = this.field_cb[var12];
                        var11_ref_aba.field_d[var12] = this.field_i.field_d[var12];
                        var11_ref_aba.field_b[var12] = this.field_i.field_b[var12];
                        var11_ref_aba.field_f[var12] = this.field_i.field_f[var12];
                        var11_ref_aba.field_e[var12] = this.field_i.field_e[var12];
                        var12++;
                        continue L34;
                      }
                    }
                  } else {
                    var11 = 0;
                    L35: while (true) {
                      if ((var11 ^ -1) <= (this.field_L ^ -1)) {
                        break L30;
                      } else {
                        param5.field_E[var11] = this.field_E[var11];
                        param5.field_Y[var11] = this.field_Y[var11];
                        param5.field_cb[var11] = this.field_cb[var11];
                        var11++;
                        continue L35;
                      }
                    }
                  }
                }
                param5.field_O = this.field_O;
                break L27;
              } else {
                param5.field_O = this.field_O;
                param5.field_i = this.field_i;
                param5.field_Y = this.field_Y;
                param5.field_cb = this.field_cb;
                param5.field_E = this.field_E;
                break L27;
              }
            }
            L36: {
              if (ooa.a(this.field_u, param1, -100)) {
                L37: {
                  param5.field_F = param4.field_F;
                  if (!param2) {
                    break L37;
                  } else {
                    param5.field_Z = (byte)(param5.field_Z | 4);
                    break L37;
                  }
                }
                param5.field_F.field_g = this.field_F.field_g;
                param5.field_F.field_d = this.field_F.field_d;
                break L36;
              } else {
                if (!kb.a(this.field_u, param1, (byte) 17)) {
                  param5.field_F = null;
                  break L36;
                } else {
                  param5.field_F = this.field_F;
                  break L36;
                }
              }
            }
            L38: {
              if (hh.a(param1, (byte) 5, this.field_u)) {
                L39: {
                  L40: {
                    if (null == param4.field_n) {
                      break L40;
                    } else {
                      if ((param4.field_n.length ^ -1) <= (this.field_W ^ -1)) {
                        param5.field_n = param4.field_n;
                        param5.field_y = param4.field_y;
                        break L39;
                      } else {
                        break L40;
                      }
                    }
                  }
                  var11 = this.field_L;
                  array$9 = new float[var11];
                  param4.field_y = array$9;
                  param5.field_y = array$9;
                  array$10 = new float[var11];
                  param4.field_n = array$10;
                  param5.field_n = array$10;
                  break L39;
                }
                var11 = 0;
                L41: while (true) {
                  if (this.field_L <= var11) {
                    break L38;
                  } else {
                    param5.field_n[var11] = this.field_n[var11];
                    param5.field_y[var11] = this.field_y[var11];
                    var11++;
                    continue L41;
                  }
                }
              } else {
                param5.field_n = this.field_n;
                param5.field_y = this.field_y;
                break L38;
              }
            }
            L42: {
              if (upa.a(this.field_u, 0, param1)) {
                param5.field_ab = param4.field_ab;
                L43: {
                  if (!param2) {
                    break L43;
                  } else {
                    param5.field_Z = (byte)(param5.field_Z | 8);
                    break L43;
                  }
                }
                param5.field_ab.field_g = this.field_ab.field_g;
                param5.field_ab.field_d = this.field_ab.field_d;
                break L42;
              } else {
                if (wu.a(-17, this.field_u, param1)) {
                  param5.field_ab = this.field_ab;
                  break L42;
                } else {
                  param5.field_ab = null;
                  break L42;
                }
              }
            }
            L44: {
              if (!qp.a(param1, (byte) -71, this.field_u)) {
                param5.field_hb = this.field_hb;
                param5.field_z = this.field_z;
                param5.field_H = this.field_H;
                break L44;
              } else {
                L45: {
                  L46: {
                    if (param4.field_H == null) {
                      break L46;
                    } else {
                      if ((param4.field_H.length ^ -1) > (this.field_W ^ -1)) {
                        break L46;
                      } else {
                        param5.field_z = param4.field_z;
                        param5.field_H = param4.field_H;
                        param5.field_hb = param4.field_hb;
                        break L45;
                      }
                    }
                  }
                  var11 = this.field_W;
                  array$11 = new short[var11];
                  param4.field_hb = array$11;
                  param5.field_hb = array$11;
                  array$12 = new short[var11];
                  param4.field_H = array$12;
                  param5.field_H = array$12;
                  array$13 = new short[var11];
                  param4.field_z = array$13;
                  param5.field_z = array$13;
                  break L45;
                }
                var11 = 0;
                L47: while (true) {
                  if ((var11 ^ -1) <= (this.field_W ^ -1)) {
                    break L44;
                  } else {
                    param5.field_H[var11] = this.field_H[var11];
                    param5.field_z[var11] = this.field_z[var11];
                    param5.field_hb[var11] = this.field_hb[var11];
                    var11++;
                    continue L47;
                  }
                }
              }
            }
            L48: {
              if (tia.b(this.field_u, -23403, param1)) {
                L49: {
                  if (!param2) {
                    break L49;
                  } else {
                    param5.field_Z = (byte)(param5.field_Z | 16);
                    break L49;
                  }
                }
                param5.field_w = param4.field_w;
                param5.field_w.field_a = this.field_w.field_a;
                break L48;
              } else {
                if (mm.a(-123, param1, this.field_u)) {
                  param5.field_w = this.field_w;
                  break L48;
                } else {
                  param5.field_w = null;
                  break L48;
                }
              }
            }
            L50: {
              if (aca.a(param1, 32768, this.field_u)) {
                L51: {
                  L52: {
                    if (null == param4.field_I) {
                      break L52;
                    } else {
                      if ((param4.field_I.length ^ -1) <= (this.field_W ^ -1)) {
                        param5.field_I = param4.field_I;
                        break L51;
                      } else {
                        break L52;
                      }
                    }
                  }
                  var11 = this.field_W;
                  array$14 = new short[var11];
                  param4.field_I = array$14;
                  param5.field_I = array$14;
                  break L51;
                }
                var11 = 0;
                L53: while (true) {
                  if ((var11 ^ -1) <= (this.field_W ^ -1)) {
                    break L50;
                  } else {
                    param5.field_I[var11] = this.field_I[var11];
                    var11++;
                    continue L53;
                  }
                }
              } else {
                param5.field_I = this.field_I;
                break L50;
              }
            }
            L54: {
              if (qba.a(this.field_u, 480, param1)) {
                L55: {
                  if (null == param4.field_f) {
                    break L55;
                  } else {
                    if ((this.field_G ^ -1) < (param4.field_f.length ^ -1)) {
                      break L55;
                    } else {
                      param5.field_f = param4.field_f;
                      var11 = 0;
                      L56: while (true) {
                        if ((this.field_G ^ -1) >= (var11 ^ -1)) {
                          break L54;
                        } else {
                          param5.field_f[var11].a(167, this.field_f[var11]);
                          var11++;
                          continue L56;
                        }
                      }
                    }
                  }
                }
                var11 = this.field_G;
                array$15 = new fd[var11];
                param4.field_f = array$15;
                param5.field_f = array$15;
                var12 = 0;
                L57: while (true) {
                  if ((this.field_G ^ -1) >= (var12 ^ -1)) {
                    break L54;
                  } else {
                    param5.field_f[var12] = this.field_f[var12].a((byte) 78);
                    var12++;
                    continue L57;
                  }
                }
              } else {
                param5.field_f = this.field_f;
                break L54;
              }
            }
            L58: {
              param5.field_j = this.field_j;
              param5.field_q = this.field_q;
              if (this.field_l) {
                param5.field_v = this.field_v;
                param5.field_S = this.field_S;
                param5.field_l = true;
                param5.field_k = this.field_k;
                param5.field_U = this.field_U;
                param5.field_eb = this.field_eb;
                param5.field_M = this.field_M;
                param5.field_T = this.field_T;
                break L58;
              } else {
                param5.field_l = false;
                break L58;
              }
            }
            param5.field_t = this.field_t;
            param5.field_D = this.field_D;
            param5.field_r = this.field_r;
            param5.field_db = this.field_db;
            param5.field_C = this.field_C;
            param5.field_e = this.field_e;
            param5.field_p = this.field_p;
            param5.field_fb = this.field_fb;
            param5.field_d = this.field_d;
            stackIn_316_0 = (np) (param5);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L59: {
            var7 = decompiledCaughtException;
            stackIn_320_0 = (RuntimeException) (var7);

            stackIn_320_1 = new StringBuilder().append("np.B(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');

            if (param4 == null) {
              stackIn_321_0 = (RuntimeException) ((Object) stackIn_320_0);
              stackIn_321_1 = (StringBuilder) ((Object) stackIn_320_1);
              stackIn_321_2 = "null";
              break L59;
            } else {
              stackIn_321_0 = (RuntimeException) ((Object) stackIn_320_0);
              stackIn_321_1 = (StringBuilder) ((Object) stackIn_320_1);
              stackIn_321_2 = "{...}";
              break L59;
            }
          }
          L60: {


            stackIn_324_1 = ((StringBuilder) (Object) stackIn_321_1).append(stackIn_321_2).append(',');

            if (param5 == null) {
              stackIn_321_0 = (RuntimeException) ((Object) stackIn_321_0);
              stackIn_325_1 = (StringBuilder) ((Object) stackIn_324_1);
              stackIn_325_2 = "null";
              break L60;
            } else {
              stackIn_321_0 = (RuntimeException) ((Object) stackIn_321_0);
              stackIn_325_1 = (StringBuilder) ((Object) stackIn_324_1);
              stackIn_325_2 = "{...}";
              break L60;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_321_0), stackIn_325_2 + ')');
        }
        return (ka) ((Object) stackIn_316_0);
    }

    private final void a(byte param0, boolean param1) {
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        qf var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        int var5 = 0;
        var5 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              if ((this.field_ib * 6 ^ -1) < (this.field_R.field_cb.field_g.length ^ -1)) {
                this.field_R.field_cb = new qf((this.field_ib - -100) * 6);
                break L1;
              } else {
                this.field_R.field_cb.field_h = 0;
                break L1;
              }
            }
            L2: {
              var3 = this.field_R.field_cb;
              if (this.field_R.field_O) {
                var4 = 0;
                L3: while (true) {
                  if (this.field_ib <= var4) {
                    break L2;
                  } else {
                    var3.f(-1477662136, (int) this.field_H[var4]);
                    var3.f(-1477662136, (int) this.field_z[var4]);
                    var3.f(-1477662136, (int) this.field_hb[var4]);
                    var4++;
                    continue L3;
                  }
                }
              } else {
                var4 = 0;
                L4: while (true) {
                  if (this.field_ib <= var4) {
                    break L2;
                  } else {
                    var3.d((int) this.field_H[var4], -87);
                    var3.d((int) this.field_z[var4], 124);
                    var3.d((int) this.field_hb[var4], 120);
                    var4++;
                    continue L4;
                  }
                }
              }
            }
            if (0 == var3.field_h) {
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L5: {
                if (param0 <= 0) {
                  break L5;
                } else {
                  this.I(68, (int[]) null, -92, 111, -30, false, -95, (int[]) null);
                  break L5;
                }
              }
              L6: {
                if (!param1) {
                  this.field_w.field_a = this.field_R.a(-56, var3.field_h, 5123, false, var3.field_g);
                  break L6;
                } else {
                  L7: {
                    if (null != this.field_jb) {
                      this.field_jb.a(var3.field_h, -11783, var3.field_g, 5123);
                      break L7;
                    } else {
                      this.field_jb = this.field_R.a(-81, var3.field_h, 5123, true, var3.field_g);
                      break L7;
                    }
                  }
                  this.field_w.field_a = this.field_jb;
                  break L6;
                }
              }
              L8: {
                if (!param1) {
                  this.field_gb = true;
                  break L8;
                } else {
                  break L8;
                }
              }
              decompiledRegionSelector0 = 1;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          throw tba.a((Throwable) ((Object) var3_ref), "np.D(" + param0 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final void a(int param0, int param1, int param2, int param3) {
        int stackIn_23_0 = 0;
        int stackIn_23_1 = 0;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        pm var6 = null;
        int var6_int = 0;
        fd var7 = null;
        int var7_int = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        var10 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            var5_int = 0;
            L1: while (true) {
              L2: {
                if (var5_int >= this.field_W) {
                  if (this.field_r != null) {
                    var5_int = 0;
                    L3: while (true) {
                      stackIn_23_0 = var5_int;
                      stackIn_23_1 = this.field_G;
                      if (stackIn_23_0 >= stackIn_23_1) {
                        break L2;
                      } else {
                        var6 = this.field_r[var5_int];
                        var7 = this.field_f[var5_int];
                        var7.field_c = 16777215 & cla.field_m[this.field_X[var6.field_l] & 65535] | -16777216 & var7.field_c;
                        var5_int++;
                        continue L3;
                      }
                    }
                  } else {
                    break L2;
                  }
                } else {
                  var6_int = 65535 & this.field_X[var5_int];
                  var7_int = (var6_int & 65466) >> -1742868182;
                  var8 = (var6_int & 905) >> -1997019193;
                  var9 = 127 & var6_int;
                  stackIn_23_0 = 0;

                  stackIn_23_1 = param0 ^ -1;

                  L5: {
                    if (stackIn_23_0 != stackIn_23_1) {
                      var7_int = var7_int + ((param0 - var7_int) * param3 >> 1070960103);
                      break L5;
                    } else {
                      break L5;
                    }
                  }
                  L6: {
                    if (param1 != -1) {
                      var8 = var8 - -((-var8 + param1) * param3 >> 164170823);
                      break L6;
                    } else {
                      break L6;
                    }
                  }
                  L7: {
                    if (-1 != param2) {
                      var9 = ((-var9 + param2) * param3 >> -1263656665) + var9;
                      break L7;
                    } else {
                      break L7;
                    }
                  }
                  this.field_X[var5_int] = (short)fh.a(fh.a(var7_int << 599206666, var8 << -495384409), var9);
                  var5_int++;
                  continue L1;
                }
              }
              L8: {
                if (this.field_kb == null) {
                  break L8;
                } else {
                  this.field_kb.field_d = null;
                  break L8;
                }
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          throw tba.a((Throwable) ((Object) var5), "np.C(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final ka a(byte param0, int param1, boolean param2) {
        np dupTemp$0 = null;
        np var4 = null;
        np var5 = null;
        int var6 = 0;
        Object stackIn_23_0 = null;
        boolean stackIn_23_1 = false;
        int stackIn_23_2 = 0;
        Object stackIn_24_0;
        boolean stackIn_24_1;
        int stackIn_24_2;
        int stackIn_24_3;
        ka stackIn_25_0 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4_ref = null;
        var6 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              if (-2 == (param0 ^ -1)) {
                var4 = this.field_R.field_w;
                var5 = this.field_R.field_i;
                break L1;
              } else {
                if ((param0 ^ -1) != -3) {
                  if (-4 != (param0 ^ -1)) {
                    if (4 == param0) {
                      var5 = this.field_R.field_D;
                      var4 = this.field_R.field_E;
                      break L1;
                    } else {
                      if (-6 != (param0 ^ -1)) {
                        dupTemp$0 = new np(this.field_R);
                        var5 = dupTemp$0;
                        var4 = dupTemp$0;
                        break L1;
                      } else {
                        var5 = this.field_R.field_Xb;
                        var4 = this.field_R.field_yb;
                        break L1;
                      }
                    }
                  } else {
                    var4 = this.field_R.field_Ub;
                    var5 = this.field_R.field_sc;
                    break L1;
                  }
                } else {
                  var4 = this.field_R.field_Nb;
                  var5 = this.field_R.field_eb;
                  break L1;
                }
              }
            }
            L2: {
              stackIn_23_0 = this;

              stackIn_23_1 = param2;

              stackIn_23_2 = param1;

              if (-1 == (param0 ^ -1)) {
                stackIn_24_0 = this;
                stackIn_24_1 = stackIn_23_1;
                stackIn_24_2 = stackIn_23_2;
                stackIn_24_3 = 0;
                break L2;
              } else {
                stackIn_24_0 = this;
                stackIn_24_1 = stackIn_23_1;
                stackIn_24_2 = stackIn_23_2;
                stackIn_24_3 = 1;
                break L2;
              }
            }
            stackIn_25_0 = this.a(stackIn_24_1, stackIn_24_2, stackIn_24_3 != 0, -22857, var5, var4);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          throw tba.a((Throwable) ((Object) var4_ref), "np.A(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
        return stackIn_25_0;
    }

    final void a(gda param0, el param1, int param2, int param3) {
        RuntimeException stackIn_50_0 = null;
        StringBuilder stackIn_50_1 = null;
        RuntimeException stackIn_51_0 = null;
        StringBuilder stackIn_51_1 = null;
        String stackIn_51_2 = null;
        StringBuilder stackIn_54_1 = null;
        StringBuilder stackIn_55_1 = null;
        String stackIn_55_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        oba var5 = null;
        RuntimeException var5_ref = null;
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
        var23 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            if (this.field_L != 0) {
              L1: {
                var5 = this.field_R.field_jd;
                if (this.field_l) {
                  break L1;
                } else {
                  this.c(2709);
                  break L1;
                }
              }
              L2: {
                var6 = (oba) ((Object) param0);
                it.field_a = var6.field_h * var5.field_q + (var5.field_j * var6.field_k + var5.field_h * var6.field_r);
                bja.field_b = var5.field_o + (var6.field_o * var5.field_q + (var6.field_p * var5.field_h + var5.field_j * var6.field_m));
                var7 = bja.field_b + it.field_a * (float)this.field_eb;
                var8 = bja.field_b + it.field_a * (float)this.field_v;
                if (var7 > var8) {
                  var10 = (float)this.field_M + var7;
                  var9 = (float)(-this.field_M) + var8;
                  break L2;
                } else {
                  var10 = var8 + (float)this.field_M;
                  var9 = (float)(-this.field_M) + var7;
                  break L2;
                }
              }
              if (this.field_R.field_m > var9) {
                if (var10 > (float)this.field_R.field_Gc) {
                  L3: {
                    eqa.field_a = var5.field_k * var6.field_r + var6.field_k * var5.field_l + var6.field_h * var5.field_s;
                    aka.field_B = var5.field_s * var6.field_o + (var6.field_p * var5.field_k + var5.field_l * var6.field_m) + var5.field_m;
                    var11 = aka.field_B + eqa.field_a * (float)this.field_eb;
                    var12 = (float)this.field_v * eqa.field_a + aka.field_B;
                    if (var11 > var12) {
                      var14 = (var11 + (float)this.field_M) * (float)this.field_R.field_W;
                      var13 = (var12 - (float)this.field_M) * (float)this.field_R.field_W;
                      break L3;
                    } else {
                      var14 = (var12 + (float)this.field_M) * (float)this.field_R.field_W;
                      var13 = (float)this.field_R.field_W * (var11 - (float)this.field_M);
                      break L3;
                    }
                  }
                  if (this.field_R.field_od <= var13 / (float)param2) {
                    decompiledRegionSelector0 = 3;
                    break L0;
                  } else {
                    if (this.field_R.field_s >= var14 / (float)param2) {
                      decompiledRegionSelector0 = 4;
                      break L0;
                    } else {
                      L4: {
                        nw.field_u = var5.field_g * var6.field_h + (var5.field_i * var6.field_k + var6.field_r * var5.field_r);
                        ef.field_s = var5.field_p + (var6.field_o * var5.field_g + (var6.field_p * var5.field_r + var5.field_i * var6.field_m));
                        var15 = ef.field_s + nw.field_u * (float)this.field_eb;
                        var16 = (float)this.field_v * nw.field_u + ef.field_s;
                        if (var15 <= var16) {
                          var17 = (float)this.field_R.field_kb * (var15 - (float)this.field_M);
                          var18 = (var16 + (float)this.field_M) * (float)this.field_R.field_kb;
                          break L4;
                        } else {
                          var18 = (float)this.field_R.field_kb * (var15 + (float)this.field_M);
                          var17 = (float)this.field_R.field_kb * (var16 - (float)this.field_M);
                          break L4;
                        }
                      }
                      if (this.field_R.field_Db <= var17 / (float)param2) {
                        decompiledRegionSelector0 = 5;
                        break L0;
                      } else {
                        if (this.field_R.field_nd < var18 / (float)param2) {
                          L5: {
                            L6: {
                              if (null != param1) {
                                break L6;
                              } else {
                                if (null == this.field_r) {
                                  break L5;
                                } else {
                                  break L6;
                                }
                              }
                            }
                            is.field_Ab = var5.field_l * var6.field_l + var5.field_k * var6.field_i + var6.field_j * var5.field_s;
                            roa.field_u = var6.field_l * var5.field_j + var5.field_h * var6.field_i + var6.field_j * var5.field_q;
                            mu.field_ub = var6.field_q * var5.field_s + (var5.field_l * var6.field_s + var5.field_k * var6.field_g);
                            bva.field_c = var6.field_q * var5.field_g + (var6.field_g * var5.field_r + var6.field_s * var5.field_i);
                            qi.field_L = var6.field_i * var5.field_r + var5.field_i * var6.field_l + var5.field_g * var6.field_j;
                            kka.field_q = var5.field_h * var6.field_g + var6.field_s * var5.field_j + var6.field_q * var5.field_q;
                            break L5;
                          }
                          L7: {
                            if (null != param1) {
                              var19 = this.field_U - -this.field_T >> 1115123041;
                              var20 = this.field_k + this.field_S >> -1348054783;
                              var21 = (int)(it.field_a * (float)this.field_eb + (roa.field_u * (float)var19 + bja.field_b) + kka.field_q * (float)var20);
                              var22 = (int)((float)var20 * kka.field_q + (it.field_a * (float)this.field_v + (roa.field_u * (float)var19 + bja.field_b)));
                              if ((var21 ^ -1) <= (this.field_R.field_Gc ^ -1)) {
                                break L7;
                              } else {
                                if ((this.field_R.field_Gc ^ -1) >= (var22 ^ -1)) {
                                  break L7;
                                } else {
                                  break L7;
                                }
                              }
                            } else {
                              break L7;
                            }
                          }
                          this.field_R.a((byte) 88, (float)param2);
                          this.field_R.j((byte) -121);
                          this.field_R.b(var6, 112);
                          this.a(false);
                          this.field_R.n((byte) -91);
                          this.b((byte) -30);
                          decompiledRegionSelector0 = 7;
                          break L0;
                        } else {
                          decompiledRegionSelector0 = 6;
                          break L0;
                        }
                      }
                    }
                  }
                } else {
                  decompiledRegionSelector0 = 2;
                  break L0;
                }
              } else {
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var5_ref = decompiledCaughtException;
            stackIn_50_0 = (RuntimeException) (var5_ref);

            stackIn_50_1 = new StringBuilder().append("np.Q(");

            if (param0 == null) {
              stackIn_51_0 = (RuntimeException) ((Object) stackIn_50_0);
              stackIn_51_1 = (StringBuilder) ((Object) stackIn_50_1);
              stackIn_51_2 = "null";
              break L8;
            } else {
              stackIn_51_0 = (RuntimeException) ((Object) stackIn_50_0);
              stackIn_51_1 = (StringBuilder) ((Object) stackIn_50_1);
              stackIn_51_2 = "{...}";
              break L8;
            }
          }
          L9: {


            stackIn_54_1 = ((StringBuilder) (Object) stackIn_51_1).append(stackIn_51_2).append(',');

            if (param1 == null) {
              stackIn_51_0 = (RuntimeException) ((Object) stackIn_51_0);
              stackIn_55_1 = (StringBuilder) ((Object) stackIn_54_1);
              stackIn_55_2 = "null";
              break L9;
            } else {
              stackIn_51_0 = (RuntimeException) ((Object) stackIn_51_0);
              stackIn_55_1 = (StringBuilder) ((Object) stackIn_54_1);
              stackIn_55_2 = "{...}";
              break L9;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_51_0), stackIn_55_2 + ',' + param2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return;
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return;
                } else {
                  if (decompiledRegionSelector0 == 5) {
                    return;
                  } else {
                    if (decompiledRegionSelector0 == 6) {
                      return;
                    } else {
                      return;
                    }
                  }
                }
              }
            }
          }
        }
    }

    final void I(int param0, int[] param1, int param2, int param3, int param4, boolean param5, int param6, int[] param7) {
        int stackIn_5_0 = 0;
        int stackIn_5_1 = 0;
        int stackIn_25_0 = 0;
        int stackIn_25_1 = 0;
        int stackIn_64_0 = 0;
        int stackIn_64_1 = 0;
        Object stackIn_71_0 = null;
        short[] stackIn_71_1 = null;
        int stackIn_97_0 = 0;
        int stackIn_97_1 = 0;
        int stackIn_103_0 = 0;
        Object stackIn_106_0 = null;
        short[] stackIn_106_1 = null;
        int stackIn_116_0 = 0;
        int stackIn_256_0 = 0;
        int stackIn_256_1 = 0;
        int stackIn_288_0 = 0;
        int stackIn_288_1 = 0;
        int stackIn_298_0 = 0;
        int stackIn_298_1 = 0;
        int stackIn_338_0 = 0;
        int stackIn_338_1 = 0;
        RuntimeException stackIn_391_0 = null;
        StringBuilder stackIn_391_1 = null;
        RuntimeException stackIn_393_0 = null;
        StringBuilder stackIn_393_1 = null;
        RuntimeException stackIn_394_0 = null;
        StringBuilder stackIn_394_1 = null;
        String stackIn_394_2 = null;
        RuntimeException stackIn_395_0 = null;
        StringBuilder stackIn_395_1 = null;
        RuntimeException stackIn_397_0 = null;
        StringBuilder stackIn_397_1 = null;
        RuntimeException stackIn_398_0 = null;
        StringBuilder stackIn_398_1 = null;
        String stackIn_398_2 = null;
        Throwable caughtException = null;
        int statePc = 0;
        int var9_int = 0;
        RuntimeException var9 = null;
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
        int var16 = 0;
        int[] var16_ref_int__ = null;
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
        int var35_int = 0;
        int[] var35 = null;
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
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var47 = TombRacer.field_G ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    var9_int = param1.length;
                    if (param0 != 0) {
                        statePc = 32;
                    } else {
                        statePc = 2;
                    }
                    continue stateLoop;
                }
                case 2: {
                    param4 = param4 << 4;
                    param2 = param2 << 4;
                    param3 = param3 << 4;
                    rp.field_i = 0;
                    var10 = 0;
                    dj.field_b = 0;
                    via.field_e = 0;
                    var11 = 0;
                    statePc = 3;
                    continue stateLoop;
                }
                case 3: {
                    if ((var9_int ^ -1) >= (var11 ^ -1)) {
                        statePc = 24;
                    } else {
                        statePc = 4;
                    }
                    continue stateLoop;
                }
                case 4: {
                    var12_int = param1[var11];
                    stackIn_25_0 = var12_int ^ -1;
                    stackIn_5_0 = stackIn_25_0;
                    stackIn_25_1 = this.field_d.length ^ -1;
                    stackIn_5_1 = stackIn_25_1;
                    if (false) {
                        statePc = 25;
                    } else {
                        statePc = 5;
                    }
                    continue stateLoop;
                }
                case 5: {
                    if (stackIn_5_0 > stackIn_5_1) {
                        statePc = 9;
                    } else {
                        statePc = 23;
                    }
                    continue stateLoop;
                }
                case 9: {
                    var13_ref_int__ = this.field_d[var12_int];
                    var14_int = 0;
                    statePc = 10;
                    continue stateLoop;
                }
                case 10: {
                    if (var14_int >= var13_ref_int__.length) {
                        statePc = 23;
                    } else {
                        statePc = 11;
                    }
                    continue stateLoop;
                }
                case 11: {
                    var15 = var13_ref_int__[var14_int];
                    if (null == this.field_db) {
                        statePc = 20;
                    } else {
                        statePc = 14;
                    }
                    continue stateLoop;
                }
                case 14: {
                    if (-1 != (param6 & this.field_db[var15] ^ -1)) {
                        statePc = 20;
                    } else {
                        statePc = 22;
                    }
                    continue stateLoop;
                }
                case 20: {
                    rp.field_i = rp.field_i + this.field_P[var15];
                    via.field_e = via.field_e + this.field_K[var15];
                    dj.field_b = dj.field_b + this.field_A[var15];
                    var10++;
                    statePc = 22;
                    continue stateLoop;
                }
                case 22: {
                    var14_int++;
                    statePc = 10;
                    continue stateLoop;
                }
                case 23: {
                    var11++;
                    statePc = 3;
                    continue stateLoop;
                }
                case 24: {
                    stackIn_25_0 = -1;
                    stackIn_25_1 = var10 ^ -1;
                    statePc = 25;
                    continue stateLoop;
                }
                case 25: {
                    if (stackIn_25_0 > stackIn_25_1) {
                        statePc = 29;
                    } else {
                        statePc = 26;
                    }
                    continue stateLoop;
                }
                case 26: {
                    via.field_e = param3;
                    dj.field_b = param4;
                    rp.field_i = param2;
                    statePc = 31;
                    continue stateLoop;
                }
                case 29: {
                    via.field_e = param3 + via.field_e / var10;
                    dj.field_b = dj.field_b / var10 + param4;
                    rp.field_i = param2 + rp.field_i / var10;
                    vea.field_b = true;
                    statePc = 31;
                    continue stateLoop;
                }
                case 31: {
                    return;
                }
                case 32: {
                    if (param0 == 1) {
                        statePc = 35;
                    } else {
                        statePc = 57;
                    }
                    continue stateLoop;
                }
                case 35: {
                    if (param7 != null) {
                        statePc = 38;
                    } else {
                        statePc = 39;
                    }
                    continue stateLoop;
                }
                case 38: {
                    var10 = 8192 + (param2 * param7[0] - (-(param3 * param7[1]) - param7[2] * param4)) >> 1944742510;
                    var11 = 8192 + param7[4] * param3 + (param7[3] * param2 - -(param7[5] * param4)) >> -467641618;
                    var12_int = param7[6] * param2 + (param7[7] * param3 - -(param4 * param7[8]) - -8192) >> 1597913358;
                    param4 = var12_int;
                    param3 = var11;
                    param2 = var10;
                    statePc = 39;
                    continue stateLoop;
                }
                case 39: {
                    param2 = param2 << 4;
                    param4 = param4 << 4;
                    param3 = param3 << 4;
                    var10 = 0;
                    statePc = 40;
                    continue stateLoop;
                }
                case 40: {
                    if (var9_int <= var10) {
                        statePc = 56;
                    } else {
                        statePc = 41;
                    }
                    continue stateLoop;
                }
                case 41: {
                    var11 = param1[var10];
                    if ((this.field_d.length ^ -1) < (var11 ^ -1)) {
                        statePc = 43;
                    } else {
                        statePc = 55;
                    }
                    continue stateLoop;
                }
                case 43: {
                    var12 = this.field_d[var11];
                    var13 = 0;
                    statePc = 44;
                    continue stateLoop;
                }
                case 44: {
                    if ((var12.length ^ -1) >= (var13 ^ -1)) {
                        statePc = 55;
                    } else {
                        statePc = 45;
                    }
                    continue stateLoop;
                }
                case 45: {
                    var14_int = var12[var13];
                    if (this.field_db == null) {
                        statePc = 52;
                    } else {
                        statePc = 46;
                    }
                    continue stateLoop;
                }
                case 46: {
                    if ((param6 & this.field_db[var14_int]) != 0) {
                        statePc = 52;
                    } else {
                        statePc = 54;
                    }
                    continue stateLoop;
                }
                case 52: {
                    this.field_P[var14_int] = this.field_P[var14_int] + param2;
                    this.field_K[var14_int] = this.field_K[var14_int] + param3;
                    this.field_A[var14_int] = this.field_A[var14_int] + param4;
                    statePc = 54;
                    continue stateLoop;
                }
                case 54: {
                    var13++;
                    statePc = 44;
                    continue stateLoop;
                }
                case 55: {
                    var10++;
                    statePc = 40;
                    continue stateLoop;
                }
                case 56: {
                    return;
                }
                case 57: {
                    if (param0 == 2) {
                        statePc = 60;
                    } else {
                        statePc = 188;
                    }
                    continue stateLoop;
                }
                case 60: {
                    if (null != param7) {
                        statePc = 144;
                    } else {
                        statePc = 61;
                    }
                    continue stateLoop;
                }
                case 61: {
                    var10 = 0;
                    statePc = 62;
                    continue stateLoop;
                }
                case 62: {
                    if (var9_int <= var10) {
                        statePc = 92;
                    } else {
                        statePc = 63;
                    }
                    continue stateLoop;
                }
                case 63: {
                    var11 = param1[var10];
                    stackIn_97_0 = this.field_d.length;
                    stackIn_64_0 = stackIn_97_0;
                    stackIn_97_1 = var11;
                    stackIn_64_1 = stackIn_97_1;
                    if (false) {
                        statePc = 97;
                    } else {
                        statePc = 64;
                    }
                    continue stateLoop;
                }
                case 64: {
                    if (stackIn_64_0 > stackIn_64_1) {
                        statePc = 68;
                    } else {
                        statePc = 91;
                    }
                    continue stateLoop;
                }
                case 68: {
                    var12 = this.field_d[var11];
                    var13 = 0;
                    statePc = 69;
                    continue stateLoop;
                }
                case 69: {
                    if ((var13 ^ -1) <= (var12.length ^ -1)) {
                        statePc = 91;
                    } else {
                        statePc = 70;
                    }
                    continue stateLoop;
                }
                case 70: {
                    var14_int = var12[var13];
                    stackIn_106_0 = null;
                    stackIn_71_0 = stackIn_106_0;
                    stackIn_106_1 = this.field_db;
                    stackIn_71_1 = stackIn_106_1;
                    if (false) {
                        statePc = 106;
                    } else {
                        statePc = 71;
                    }
                    continue stateLoop;
                }
                case 71: {
                    if (stackIn_71_0 == stackIn_71_1) {
                        statePc = 77;
                    } else {
                        statePc = 74;
                    }
                    continue stateLoop;
                }
                case 74: {
                    if (-1 == (this.field_db[var14_int] & param6 ^ -1)) {
                        statePc = 90;
                    } else {
                        statePc = 77;
                    }
                    continue stateLoop;
                }
                case 77: {
                    this.field_P[var14_int] = this.field_P[var14_int] - rp.field_i;
                    this.field_K[var14_int] = this.field_K[var14_int] - via.field_e;
                    this.field_A[var14_int] = this.field_A[var14_int] - dj.field_b;
                    if (-1 != (param4 ^ -1)) {
                        statePc = 82;
                    } else {
                        statePc = 83;
                    }
                    continue stateLoop;
                }
                case 82: {
                    var15 = qu.field_b[param4];
                    var16 = qu.field_d[param4];
                    var17 = var15 * this.field_K[var14_int] - (-(this.field_P[var14_int] * var16) - 16383) >> 1403726254;
                    this.field_K[var14_int] = 16383 + (var16 * this.field_K[var14_int] + -(var15 * this.field_P[var14_int])) >> -1429456306;
                    this.field_P[var14_int] = var17;
                    statePc = 83;
                    continue stateLoop;
                }
                case 83: {
                    if ((param2 ^ -1) != -1) {
                        statePc = 86;
                    } else {
                        statePc = 87;
                    }
                    continue stateLoop;
                }
                case 86: {
                    var15 = qu.field_b[param2];
                    var16 = qu.field_d[param2];
                    var17 = 16383 + (var16 * this.field_K[var14_int] + -(this.field_A[var14_int] * var15)) >> -1602330834;
                    this.field_A[var14_int] = 16383 + (var15 * this.field_K[var14_int] + var16 * this.field_A[var14_int]) >> -2069403378;
                    this.field_K[var14_int] = var17;
                    statePc = 87;
                    continue stateLoop;
                }
                case 87: {
                    if (param3 == 0) {
                        statePc = 89;
                    } else {
                        statePc = 88;
                    }
                    continue stateLoop;
                }
                case 88: {
                    var15 = qu.field_b[param3];
                    var16 = qu.field_d[param3];
                    var17 = 16383 + this.field_P[var14_int] * var16 + var15 * this.field_A[var14_int] >> -217774674;
                    this.field_A[var14_int] = 16383 + var16 * this.field_A[var14_int] + -(this.field_P[var14_int] * var15) >> 609400782;
                    this.field_P[var14_int] = var17;
                    statePc = 89;
                    continue stateLoop;
                }
                case 89: {
                    this.field_P[var14_int] = this.field_P[var14_int] + rp.field_i;
                    this.field_K[var14_int] = this.field_K[var14_int] + via.field_e;
                    this.field_A[var14_int] = this.field_A[var14_int] + dj.field_b;
                    statePc = 90;
                    continue stateLoop;
                }
                case 90: {
                    var13++;
                    statePc = 69;
                    continue stateLoop;
                }
                case 91: {
                    var10++;
                    statePc = 62;
                    continue stateLoop;
                }
                case 92: {
                    if (param5) {
                        statePc = 95;
                    } else {
                        statePc = 187;
                    }
                    continue stateLoop;
                }
                case 95: {
                    var10 = 0;
                    statePc = 96;
                    continue stateLoop;
                }
                case 96: {
                    stackIn_97_0 = var10 ^ -1;
                    stackIn_97_1 = var9_int ^ -1;
                    statePc = 97;
                    continue stateLoop;
                }
                case 97: {
                    if (stackIn_97_0 <= stackIn_97_1) {
                        statePc = 133;
                    } else {
                        statePc = 98;
                    }
                    continue stateLoop;
                }
                case 98: {
                    var11 = param1[var10];
                    if (var11 >= this.field_d.length) {
                        statePc = 132;
                    } else {
                        statePc = 101;
                    }
                    continue stateLoop;
                }
                case 101: {
                    var12 = this.field_d[var11];
                    var13 = 0;
                    statePc = 102;
                    continue stateLoop;
                }
                case 102: {
                    stackIn_103_0 = var13 ^ -1;
                    statePc = 103;
                    continue stateLoop;
                }
                case 103: {
                    if (stackIn_103_0 <= (var12.length ^ -1)) {
                        statePc = 132;
                    } else {
                        statePc = 104;
                    }
                    continue stateLoop;
                }
                case 104: {
                    var14_int = var12[var13];
                    stackIn_106_0 = null;
                    stackIn_106_1 = this.field_db;
                    statePc = 106;
                    continue stateLoop;
                }
                case 106: {
                    if (stackIn_106_0 == stackIn_106_1) {
                        statePc = 113;
                    } else {
                        statePc = 107;
                    }
                    continue stateLoop;
                }
                case 107: {
                    if ((this.field_db[var14_int] & param6) != 0) {
                        statePc = 113;
                    } else {
                        statePc = 131;
                    }
                    continue stateLoop;
                }
                case 113: {
                    var15 = this.field_e[var14_int];
                    var16 = this.field_e[1 + var14_int];
                    var17 = var15;
                    statePc = 114;
                    continue stateLoop;
                }
                case 114: {
                    if ((var17 ^ -1) <= (var16 ^ -1)) {
                        statePc = 131;
                    } else {
                        statePc = 115;
                    }
                    continue stateLoop;
                }
                case 115: {
                    var18 = -1 + this.field_q[var17];
                    stackIn_103_0 = var18 ^ -1;
                    stackIn_116_0 = stackIn_103_0;
                    if (false) {
                        statePc = 103;
                    } else {
                        statePc = 116;
                    }
                    continue stateLoop;
                }
                case 116: {
                    if (stackIn_116_0 != 0) {
                        statePc = 120;
                    } else {
                        statePc = 131;
                    }
                    continue stateLoop;
                }
                case 120: {
                    if ((param4 ^ -1) == -1) {
                        statePc = 124;
                    } else {
                        statePc = 123;
                    }
                    continue stateLoop;
                }
                case 123: {
                    var19 = qu.field_b[param4];
                    var20 = qu.field_d[param4];
                    var21 = 16383 + this.field_E[var18] * var20 + var19 * this.field_Y[var18] >> 1208636462;
                    this.field_Y[var18] = (short)(-(var19 * this.field_E[var18]) + (var20 * this.field_Y[var18] - -16383) >> 670421070);
                    this.field_E[var18] = (short)var21;
                    statePc = 124;
                    continue stateLoop;
                }
                case 124: {
                    if (0 != param2) {
                        statePc = 127;
                    } else {
                        statePc = 128;
                    }
                    continue stateLoop;
                }
                case 127: {
                    var19 = qu.field_b[param2];
                    var20 = qu.field_d[param2];
                    var21 = var20 * this.field_Y[var18] - var19 * this.field_cb[var18] - -16383 >> 2059641422;
                    this.field_cb[var18] = (short)(16383 + (this.field_cb[var18] * var20 + this.field_Y[var18] * var19) >> 238391182);
                    this.field_Y[var18] = (short)var21;
                    statePc = 128;
                    continue stateLoop;
                }
                case 128: {
                    if ((param3 ^ -1) == -1) {
                        statePc = 130;
                    } else {
                        statePc = 129;
                    }
                    continue stateLoop;
                }
                case 129: {
                    var19 = qu.field_b[param3];
                    var20 = qu.field_d[param3];
                    var21 = 16383 + this.field_cb[var18] * var19 - -(var20 * this.field_E[var18]) >> 1593143982;
                    this.field_cb[var18] = (short)(this.field_cb[var18] * var20 + (-(var19 * this.field_E[var18]) + 16383) >> 1390824398);
                    this.field_E[var18] = (short)var21;
                    statePc = 130;
                    continue stateLoop;
                }
                case 130: {
                    var17++;
                    statePc = 114;
                    continue stateLoop;
                }
                case 131: {
                    var13++;
                    statePc = 102;
                    continue stateLoop;
                }
                case 132: {
                    var10++;
                    statePc = 96;
                    continue stateLoop;
                }
                case 133: {
                    if (null != this.field_F) {
                        statePc = 140;
                    } else {
                        statePc = 134;
                    }
                    continue stateLoop;
                }
                case 134: {
                    if (this.field_kb != null) {
                        statePc = 139;
                    } else {
                        statePc = 140;
                    }
                    continue stateLoop;
                }
                case 139: {
                    this.field_kb.field_d = null;
                    statePc = 140;
                    continue stateLoop;
                }
                case 140: {
                    if (this.field_F == null) {
                        statePc = 187;
                    } else {
                        statePc = 141;
                    }
                    continue stateLoop;
                }
                case 141: {
                    this.field_F.field_d = null;
                    statePc = 187;
                    continue stateLoop;
                }
                case 144: {
                    var10 = param7[9] << -636635996;
                    var11 = param7[10] << -1063123996;
                    var12_int = param7[11] << -1022980572;
                    var13 = param7[12] << -1520383804;
                    var14_int = param7[13] << 1040835012;
                    var15 = param7[14] << 987565796;
                    if (!vea.field_b) {
                        statePc = 146;
                    } else {
                        statePc = 145;
                    }
                    continue stateLoop;
                }
                case 145: {
                    var16 = 8192 + (dj.field_b * param7[6] + via.field_e * param7[3] + param7[0] * rp.field_i) >> -1903103698;
                    var17 = dj.field_b * param7[7] + (param7[4] * via.field_e + rp.field_i * param7[1] - -8192) >> 1440394222;
                    var18 = param7[2] * rp.field_i + (param7[5] * via.field_e + dj.field_b * param7[8] - -8192) >> -575748466;
                    var16 = var16 + var13;
                    var17 = var17 + var14_int;
                    via.field_e = var17;
                    var18 = var18 + var15;
                    rp.field_i = var16;
                    vea.field_b = false;
                    dj.field_b = var18;
                    statePc = 146;
                    continue stateLoop;
                }
                case 146: {
                    var16_ref_int__ = new int[9];
                    var17 = qu.field_d[param2];
                    var18 = qu.field_b[param2];
                    var19 = qu.field_d[param3];
                    var20 = qu.field_b[param3];
                    var21 = qu.field_d[param4];
                    var22 = qu.field_b[param4];
                    var23 = 8192 + var21 * var18 >> 662805134;
                    var24 = 8192 + var18 * var22 >> -2132536114;
                    var16_ref_int__[7] = var19 * var23 + var22 * var20 + 8192 >> -455554514;
                    var16_ref_int__[4] = 8192 + var17 * var21 >> 1500725582;
                    var16_ref_int__[0] = 8192 + (var24 * var20 + var21 * var19) >> 2120876398;
                    var16_ref_int__[6] = var24 * var19 + -var20 * var21 + 8192 >> 146216750;
                    var16_ref_int__[3] = var22 * var17 + 8192 >> -348546130;
                    var16_ref_int__[5] = -var18;
                    var16_ref_int__[8] = var19 * var17 - -8192 >> -981563378;
                    var16_ref_int__[1] = var20 * var23 + -var19 * var22 + 8192 >> -374317106;
                    var16_ref_int__[2] = var17 * var20 + 8192 >> 253876942;
                    var25_int = 8192 + (var16_ref_int__[2] * -dj.field_b + -rp.field_i * var16_ref_int__[0] - -(var16_ref_int__[1] * -via.field_e)) >> 1936941742;
                    var26 = 8192 + var16_ref_int__[5] * -dj.field_b + (-rp.field_i * var16_ref_int__[3] - -(-via.field_e * var16_ref_int__[4])) >> -94871858;
                    var27 = -dj.field_b * var16_ref_int__[8] + (-via.field_e * var16_ref_int__[7] + var16_ref_int__[6] * -rp.field_i + 8192) >> 892183054;
                    var28 = var25_int + rp.field_i;
                    var29_int = via.field_e + var26;
                    var30 = var27 + dj.field_b;
                    var31_ref_int__ = new int[9];
                    var32 = 0;
                    statePc = 147;
                    continue stateLoop;
                }
                case 147: {
                    if (3 <= var32) {
                        statePc = 157;
                    } else {
                        statePc = 148;
                    }
                    continue stateLoop;
                }
                case 148: {
                    var33 = 0;
                    statePc = 149;
                    continue stateLoop;
                }
                case 149: {
                    if ((var33 ^ -1) <= -4) {
                        statePc = 156;
                    } else {
                        statePc = 150;
                    }
                    continue stateLoop;
                }
                case 150: {
                    var34 = 0;
                    var35_int = 0;
                    statePc = 151;
                    continue stateLoop;
                }
                case 151: {
                    if ((var35_int ^ -1) <= -4) {
                        statePc = 155;
                    } else {
                        statePc = 152;
                    }
                    continue stateLoop;
                }
                case 152: {
                    var34 = var34 + param7[var35_int + var33 * 3] * var16_ref_int__[var35_int + var32 * 3];
                    var35_int++;
                    statePc = 151;
                    continue stateLoop;
                }
                case 155: {
                    var31_ref_int__[var32 * 3 - -var33] = 8192 + var34 >> 1803012750;
                    var33++;
                    statePc = 149;
                    continue stateLoop;
                }
                case 156: {
                    var32++;
                    statePc = 147;
                    continue stateLoop;
                }
                case 157: {
                    var32 = 8192 + (var13 * var16_ref_int__[0] - -(var14_int * var16_ref_int__[1])) - -(var16_ref_int__[2] * var15) >> -244496178;
                    var33 = var16_ref_int__[5] * var15 + var16_ref_int__[4] * var14_int + var16_ref_int__[3] * var13 + 8192 >> -2016182962;
                    var32 = var32 + var28;
                    var33 = var33 + var29_int;
                    var34 = 8192 + var16_ref_int__[6] * var13 + var14_int * var16_ref_int__[7] - -(var15 * var16_ref_int__[8]) >> 994807150;
                    var34 = var34 + var30;
                    var35 = new int[9];
                    var36 = 0;
                    statePc = 158;
                    continue stateLoop;
                }
                case 158: {
                    if (3 <= var36) {
                        statePc = 168;
                    } else {
                        statePc = 159;
                    }
                    continue stateLoop;
                }
                case 159: {
                    var37 = 0;
                    statePc = 160;
                    continue stateLoop;
                }
                case 160: {
                    if (-4 >= (var37 ^ -1)) {
                        statePc = 167;
                    } else {
                        statePc = 161;
                    }
                    continue stateLoop;
                }
                case 161: {
                    var38 = 0;
                    var39 = 0;
                    statePc = 162;
                    continue stateLoop;
                }
                case 162: {
                    if ((var39 ^ -1) <= -4) {
                        statePc = 166;
                    } else {
                        statePc = 163;
                    }
                    continue stateLoop;
                }
                case 163: {
                    var38 = var38 + param7[var39 + 3 * var36] * var31_ref_int__[var37 - -(var39 * 3)];
                    var39++;
                    statePc = 162;
                    continue stateLoop;
                }
                case 166: {
                    var35[3 * var36 - -var37] = 8192 + var38 >> -1117311218;
                    var37++;
                    statePc = 160;
                    continue stateLoop;
                }
                case 167: {
                    var36++;
                    statePc = 158;
                    continue stateLoop;
                }
                case 168: {
                    var36 = 8192 + (var34 * param7[2] + var32 * param7[0] + param7[1] * var33) >> 540243854;
                    var37 = 8192 + (var33 * param7[4] + param7[3] * var32 + param7[5] * var34) >> 2100233646;
                    var36 = var36 + var10;
                    var37 = var37 + var11;
                    var38 = var33 * param7[7] + (param7[6] * var32 + param7[8] * var34) + 8192 >> -877240146;
                    var38 = var38 + var12_int;
                    var39 = 0;
                    statePc = 169;
                    continue stateLoop;
                }
                case 169: {
                    if ((var9_int ^ -1) >= (var39 ^ -1)) {
                        statePc = 187;
                    } else {
                        statePc = 170;
                    }
                    continue stateLoop;
                }
                case 170: {
                    var40 = param1[var39];
                    if ((var40 ^ -1) > (this.field_d.length ^ -1)) {
                        statePc = 173;
                    } else {
                        statePc = 186;
                    }
                    continue stateLoop;
                }
                case 173: {
                    var41 = this.field_d[var40];
                    var42 = 0;
                    statePc = 174;
                    continue stateLoop;
                }
                case 174: {
                    if (var41.length <= var42) {
                        statePc = 186;
                    } else {
                        statePc = 175;
                    }
                    continue stateLoop;
                }
                case 175: {
                    var43 = var41[var42];
                    if (null == this.field_db) {
                        statePc = 184;
                    } else {
                        statePc = 178;
                    }
                    continue stateLoop;
                }
                case 178: {
                    if ((this.field_db[var43] & param6) != 0) {
                        statePc = 184;
                    } else {
                        statePc = 185;
                    }
                    continue stateLoop;
                }
                case 184: {
                    var44 = 8192 + var35[2] * this.field_A[var43] + (this.field_P[var43] * var35[0] + this.field_K[var43] * var35[1]) >> -463601330;
                    var45 = var35[5] * this.field_A[var43] + (this.field_K[var43] * var35[4] + this.field_P[var43] * var35[3] - -8192) >> 1938377006;
                    var44 = var44 + var36;
                    var45 = var45 + var37;
                    var46 = var35[8] * this.field_A[var43] + this.field_K[var43] * var35[7] + (this.field_P[var43] * var35[6] - -8192) >> 1589620046;
                    var46 = var46 + var38;
                    this.field_P[var43] = var44;
                    this.field_K[var43] = var45;
                    this.field_A[var43] = var46;
                    statePc = 185;
                    continue stateLoop;
                }
                case 185: {
                    var42++;
                    statePc = 174;
                    continue stateLoop;
                }
                case 186: {
                    var39++;
                    statePc = 169;
                    continue stateLoop;
                }
                case 187: {
                    return;
                }
                case 188: {
                    if (param0 != 3) {
                        statePc = 247;
                    } else {
                        statePc = 189;
                    }
                    continue stateLoop;
                }
                case 189: {
                    if (param7 != null) {
                        statePc = 215;
                    } else {
                        statePc = 192;
                    }
                    continue stateLoop;
                }
                case 192: {
                    var10 = 0;
                    statePc = 193;
                    continue stateLoop;
                }
                case 193: {
                    if ((var10 ^ -1) <= (var9_int ^ -1)) {
                        statePc = 246;
                    } else {
                        statePc = 194;
                    }
                    continue stateLoop;
                }
                case 194: {
                    var11 = param1[var10];
                    if (this.field_d.length > var11) {
                        statePc = 199;
                    } else {
                        statePc = 213;
                    }
                    continue stateLoop;
                }
                case 199: {
                    var12 = this.field_d[var11];
                    var13 = 0;
                    statePc = 200;
                    continue stateLoop;
                }
                case 200: {
                    if (var13 >= var12.length) {
                        statePc = 213;
                    } else {
                        statePc = 201;
                    }
                    continue stateLoop;
                }
                case 201: {
                    var14_int = var12[var13];
                    if (null == this.field_db) {
                        statePc = 210;
                    } else {
                        statePc = 204;
                    }
                    continue stateLoop;
                }
                case 204: {
                    if (0 != (this.field_db[var14_int] & param6)) {
                        statePc = 210;
                    } else {
                        statePc = 212;
                    }
                    continue stateLoop;
                }
                case 210: {
                    this.field_P[var14_int] = this.field_P[var14_int] - rp.field_i;
                    this.field_K[var14_int] = this.field_K[var14_int] - via.field_e;
                    this.field_A[var14_int] = this.field_A[var14_int] - dj.field_b;
                    this.field_P[var14_int] = this.field_P[var14_int] * param2 >> 1763616103;
                    this.field_K[var14_int] = this.field_K[var14_int] * param3 >> 792956295;
                    this.field_A[var14_int] = this.field_A[var14_int] * param4 >> -750914169;
                    this.field_P[var14_int] = this.field_P[var14_int] + rp.field_i;
                    this.field_K[var14_int] = this.field_K[var14_int] + via.field_e;
                    this.field_A[var14_int] = this.field_A[var14_int] + dj.field_b;
                    statePc = 212;
                    continue stateLoop;
                }
                case 212: {
                    var13++;
                    statePc = 200;
                    continue stateLoop;
                }
                case 213: {
                    var10++;
                    statePc = 193;
                    continue stateLoop;
                }
                case 215: {
                    var10 = param7[9] << -114422364;
                    var11 = param7[10] << 1146698980;
                    var12_int = param7[11] << -1175513820;
                    var13 = param7[12] << 1125017412;
                    var14_int = param7[13] << 1544675492;
                    var15 = param7[14] << 1462946276;
                    if (vea.field_b) {
                        statePc = 218;
                    } else {
                        statePc = 219;
                    }
                    continue stateLoop;
                }
                case 218: {
                    var16 = 8192 + (param7[0] * rp.field_i - -(param7[3] * via.field_e) - -(dj.field_b * param7[6])) >> -1204524114;
                    var17 = 8192 + (via.field_e * param7[4] + (param7[1] * rp.field_i - -(param7[7] * dj.field_b))) >> 256708334;
                    var18 = 8192 + (via.field_e * param7[5] + rp.field_i * param7[2]) - -(dj.field_b * param7[8]) >> 103396014;
                    var17 = var17 + var14_int;
                    var16 = var16 + var13;
                    via.field_e = var17;
                    rp.field_i = var16;
                    var18 = var18 + var15;
                    vea.field_b = false;
                    dj.field_b = var18;
                    statePc = 219;
                    continue stateLoop;
                }
                case 219: {
                    var16 = param2 << 1063809167 >> 1248565959;
                    var17 = param3 << -1064652305 >> 927631623;
                    var18 = param4 << -1297835473 >> -486422137;
                    var19 = 8192 + var16 * -rp.field_i >> 1629940238;
                    var20 = var17 * -via.field_e - -8192 >> -1537688594;
                    var21 = 8192 + var18 * -dj.field_b >> -1855396018;
                    var22 = var19 - -rp.field_i;
                    var23 = var20 + via.field_e;
                    var24 = var21 + dj.field_b;
                    var25 = new int[9];
                    var25[0] = var16 * param7[0] - -8192 >> 43373806;
                    var25[2] = var16 * param7[6] - -8192 >> 2114323598;
                    var25[1] = 8192 + param7[3] * var16 >> 1418955022;
                    var25[3] = 8192 + param7[1] * var17 >> 1158516718;
                    var25[6] = param7[2] * var18 + 8192 >> 416991278;
                    var25[4] = 8192 + param7[4] * var17 >> 1818694478;
                    var25[5] = 8192 + var17 * param7[7] >> -742667314;
                    var25[8] = 8192 + param7[8] * var18 >> -966335570;
                    var25[7] = 8192 + var18 * param7[5] >> 2098064910;
                    var26 = var16 * var13 + 8192 >> 822715438;
                    var27 = 8192 + var17 * var14_int >> 126403982;
                    var27 = var27 + var23;
                    var28 = var18 * var15 + 8192 >> -1596513042;
                    var26 = var26 + var22;
                    var28 = var28 + var24;
                    var29 = new int[9];
                    var30 = 0;
                    statePc = 220;
                    continue stateLoop;
                }
                case 220: {
                    if (3 <= var30) {
                        statePc = 230;
                    } else {
                        statePc = 221;
                    }
                    continue stateLoop;
                }
                case 221: {
                    var31 = 0;
                    statePc = 222;
                    continue stateLoop;
                }
                case 222: {
                    if (var31 >= 3) {
                        statePc = 229;
                    } else {
                        statePc = 223;
                    }
                    continue stateLoop;
                }
                case 223: {
                    var32 = 0;
                    var33 = 0;
                    statePc = 224;
                    continue stateLoop;
                }
                case 224: {
                    if ((var33 ^ -1) <= -4) {
                        statePc = 228;
                    } else {
                        statePc = 225;
                    }
                    continue stateLoop;
                }
                case 225: {
                    var32 = var32 + var25[var31 + 3 * var33] * param7[var33 + var30 * 3];
                    var33++;
                    statePc = 224;
                    continue stateLoop;
                }
                case 228: {
                    var29[3 * var30 - -var31] = var32 + 8192 >> -1436592082;
                    var31++;
                    statePc = 222;
                    continue stateLoop;
                }
                case 229: {
                    var30++;
                    statePc = 220;
                    continue stateLoop;
                }
                case 230: {
                    var30 = 8192 + var26 * param7[0] + var27 * param7[1] + var28 * param7[2] >> -615909426;
                    var31 = 8192 + (var28 * param7[5] + (var26 * param7[3] + param7[4] * var27)) >> -456758482;
                    var30 = var30 + var10;
                    var31 = var31 + var11;
                    var32 = 8192 + (var28 * param7[8] + var26 * param7[6] + var27 * param7[7]) >> -379422770;
                    var32 = var32 + var12_int;
                    var33 = 0;
                    statePc = 231;
                    continue stateLoop;
                }
                case 231: {
                    if ((var33 ^ -1) <= (var9_int ^ -1)) {
                        statePc = 246;
                    } else {
                        statePc = 232;
                    }
                    continue stateLoop;
                }
                case 232: {
                    var34 = param1[var33];
                    if ((var34 ^ -1) > (this.field_d.length ^ -1)) {
                        statePc = 235;
                    } else {
                        statePc = 245;
                    }
                    continue stateLoop;
                }
                case 235: {
                    var35 = this.field_d[var34];
                    var36 = 0;
                    statePc = 236;
                    continue stateLoop;
                }
                case 236: {
                    if ((var36 ^ -1) <= (var35.length ^ -1)) {
                        statePc = 245;
                    } else {
                        statePc = 237;
                    }
                    continue stateLoop;
                }
                case 237: {
                    var37 = var35[var36];
                    if (null == this.field_db) {
                        statePc = 243;
                    } else {
                        statePc = 240;
                    }
                    continue stateLoop;
                }
                case 240: {
                    if ((param6 & this.field_db[var37] ^ -1) == -1) {
                        statePc = 244;
                    } else {
                        statePc = 243;
                    }
                    continue stateLoop;
                }
                case 243: {
                    var38 = this.field_A[var37] * var29[2] + (this.field_P[var37] * var29[0] + var29[1] * this.field_K[var37] - -8192) >> 1024074446;
                    var39 = 8192 + (this.field_K[var37] * var29[4] + this.field_P[var37] * var29[3] + this.field_A[var37] * var29[5]) >> -501198002;
                    var38 = var38 + var30;
                    var39 = var39 + var31;
                    var40 = 8192 + (var29[8] * this.field_A[var37] + var29[6] * this.field_P[var37]) + this.field_K[var37] * var29[7] >> -407445266;
                    this.field_P[var37] = var38;
                    var40 = var40 + var32;
                    this.field_K[var37] = var39;
                    this.field_A[var37] = var40;
                    statePc = 244;
                    continue stateLoop;
                }
                case 244: {
                    var36++;
                    statePc = 236;
                    continue stateLoop;
                }
                case 245: {
                    var33++;
                    statePc = 231;
                    continue stateLoop;
                }
                case 246: {
                    return;
                }
                case 247: {
                    if (param0 != 5) {
                        statePc = 291;
                    } else {
                        statePc = 248;
                    }
                    continue stateLoop;
                }
                case 248: {
                    if (this.field_j != null) {
                        statePc = 253;
                    } else {
                        statePc = 290;
                    }
                    continue stateLoop;
                }
                case 253: {
                    var10 = 0;
                    statePc = 254;
                    continue stateLoop;
                }
                case 254: {
                    if ((var10 ^ -1) <= (var9_int ^ -1)) {
                        statePc = 283;
                    } else {
                        statePc = 255;
                    }
                    continue stateLoop;
                }
                case 255: {
                    var11 = param1[var10];
                    stackIn_288_0 = this.field_j.length;
                    stackIn_256_0 = stackIn_288_0;
                    stackIn_288_1 = var11;
                    stackIn_256_1 = stackIn_288_1;
                    if (false) {
                        statePc = 288;
                    } else {
                        statePc = 256;
                    }
                    continue stateLoop;
                }
                case 256: {
                    if (stackIn_256_0 <= stackIn_256_1) {
                        statePc = 282;
                    } else {
                        statePc = 259;
                    }
                    continue stateLoop;
                }
                case 259: {
                    var12 = this.field_j[var11];
                    var13 = 0;
                    statePc = 260;
                    continue stateLoop;
                }
                case 260: {
                    if ((var12.length ^ -1) >= (var13 ^ -1)) {
                        statePc = 282;
                    } else {
                        statePc = 261;
                    }
                    continue stateLoop;
                }
                case 261: {
                    var14_int = var12[var13];
                    if (null == this.field_fb) {
                        statePc = 270;
                    } else {
                        statePc = 264;
                    }
                    continue stateLoop;
                }
                case 264: {
                    if (0 != (param6 & this.field_fb[var14_int])) {
                        statePc = 270;
                    } else {
                        statePc = 281;
                    }
                    continue stateLoop;
                }
                case 270: {
                    var15 = param2 * 8 + (this.field_o[var14_int] & 255);
                    if ((var15 ^ -1) > -1) {
                        statePc = 277;
                    } else {
                        statePc = 271;
                    }
                    continue stateLoop;
                }
                case 271: {
                    if (-256 > (var15 ^ -1)) {
                        statePc = 276;
                    } else {
                        statePc = 278;
                    }
                    continue stateLoop;
                }
                case 276: {
                    var15 = 255;
                    statePc = 278;
                    continue stateLoop;
                }
                case 277: {
                    var15 = 0;
                    statePc = 278;
                    continue stateLoop;
                }
                case 278: {
                    this.field_o[var14_int] = (byte)var15;
                    if (null == this.field_kb) {
                        statePc = 281;
                    } else {
                        statePc = 279;
                    }
                    continue stateLoop;
                }
                case 279: {
                    this.field_kb.field_d = null;
                    statePc = 281;
                    continue stateLoop;
                }
                case 281: {
                    var13++;
                    statePc = 260;
                    continue stateLoop;
                }
                case 282: {
                    var10++;
                    statePc = 254;
                    continue stateLoop;
                }
                case 283: {
                    if (this.field_r != null) {
                        statePc = 286;
                    } else {
                        statePc = 290;
                    }
                    continue stateLoop;
                }
                case 286: {
                    var10 = 0;
                    statePc = 287;
                    continue stateLoop;
                }
                case 287: {
                    stackIn_288_0 = var10 ^ -1;
                    stackIn_288_1 = this.field_G ^ -1;
                    statePc = 288;
                    continue stateLoop;
                }
                case 288: {
                    if (stackIn_288_0 <= stackIn_288_1) {
                        statePc = 290;
                    } else {
                        statePc = 289;
                    }
                    continue stateLoop;
                }
                case 289: {
                    var11_ref_pm = this.field_r[var10];
                    var12_ref = this.field_f[var10];
                    var12_ref.field_c = -(this.field_o[var11_ref_pm.field_l] & 255) + 255 << -2011390920 | 16777215 & var12_ref.field_c;
                    var10++;
                    statePc = 287;
                    continue stateLoop;
                }
                case 290: {
                    return;
                }
                case 291: {
                    if (-8 != (param0 ^ -1)) {
                        statePc = 341;
                    } else {
                        statePc = 292;
                    }
                    continue stateLoop;
                }
                case 292: {
                    if (null == this.field_j) {
                        statePc = 340;
                    } else {
                        statePc = 295;
                    }
                    continue stateLoop;
                }
                case 295: {
                    var10 = 0;
                    statePc = 296;
                    continue stateLoop;
                }
                case 296: {
                    if ((var10 ^ -1) <= (var9_int ^ -1)) {
                        statePc = 333;
                    } else {
                        statePc = 297;
                    }
                    continue stateLoop;
                }
                case 297: {
                    var11 = param1[var10];
                    stackIn_338_0 = var11 ^ -1;
                    stackIn_298_0 = stackIn_338_0;
                    stackIn_338_1 = this.field_j.length ^ -1;
                    stackIn_298_1 = stackIn_338_1;
                    if (false) {
                        statePc = 338;
                    } else {
                        statePc = 298;
                    }
                    continue stateLoop;
                }
                case 298: {
                    if (stackIn_298_0 > stackIn_298_1) {
                        statePc = 302;
                    } else {
                        statePc = 332;
                    }
                    continue stateLoop;
                }
                case 302: {
                    var12 = this.field_j[var11];
                    var13 = 0;
                    statePc = 303;
                    continue stateLoop;
                }
                case 303: {
                    if ((var12.length ^ -1) >= (var13 ^ -1)) {
                        statePc = 332;
                    } else {
                        statePc = 304;
                    }
                    continue stateLoop;
                }
                case 304: {
                    var14_int = var12[var13];
                    if (this.field_fb == null) {
                        statePc = 313;
                    } else {
                        statePc = 307;
                    }
                    continue stateLoop;
                }
                case 307: {
                    if ((this.field_fb[var14_int] & param6) != 0) {
                        statePc = 313;
                    } else {
                        statePc = 331;
                    }
                    continue stateLoop;
                }
                case 313: {
                    var15 = this.field_X[var14_int] & 65535;
                    var16 = (64685 & var15) >> 243689802;
                    var17 = 7 & var15 >> -83060601;
                    var16 = 63 & param2 + var16;
                    var17 = var17 + param3 / 4;
                    var18 = var15 & 127;
                    var18 = var18 + param4;
                    if (0 <= var17) {
                        statePc = 315;
                    } else {
                        statePc = 314;
                    }
                    continue stateLoop;
                }
                case 314: {
                    var17 = 0;
                    statePc = 321;
                    continue stateLoop;
                }
                case 315: {
                    if (7 < var17) {
                        statePc = 320;
                    } else {
                        statePc = 321;
                    }
                    continue stateLoop;
                }
                case 320: {
                    var17 = 7;
                    statePc = 321;
                    continue stateLoop;
                }
                case 321: {
                    if (-1 < (var18 ^ -1)) {
                        statePc = 326;
                    } else {
                        statePc = 322;
                    }
                    continue stateLoop;
                }
                case 322: {
                    if (127 >= var18) {
                        statePc = 327;
                    } else {
                        statePc = 325;
                    }
                    continue stateLoop;
                }
                case 325: {
                    var18 = 127;
                    statePc = 327;
                    continue stateLoop;
                }
                case 326: {
                    var18 = 0;
                    statePc = 327;
                    continue stateLoop;
                }
                case 327: {
                    this.field_X[var14_int] = (short)fh.a(var18, fh.a(var17 << -655481913, var16 << -687474934));
                    if (null != this.field_kb) {
                        statePc = 330;
                    } else {
                        statePc = 331;
                    }
                    continue stateLoop;
                }
                case 330: {
                    this.field_kb.field_d = null;
                    statePc = 331;
                    continue stateLoop;
                }
                case 331: {
                    var13++;
                    statePc = 303;
                    continue stateLoop;
                }
                case 332: {
                    var10++;
                    statePc = 296;
                    continue stateLoop;
                }
                case 333: {
                    if (null != this.field_r) {
                        statePc = 336;
                    } else {
                        statePc = 340;
                    }
                    continue stateLoop;
                }
                case 336: {
                    var10 = 0;
                    statePc = 337;
                    continue stateLoop;
                }
                case 337: {
                    stackIn_338_0 = var10;
                    stackIn_338_1 = this.field_G;
                    statePc = 338;
                    continue stateLoop;
                }
                case 338: {
                    if (stackIn_338_0 >= stackIn_338_1) {
                        statePc = 340;
                    } else {
                        statePc = 339;
                    }
                    continue stateLoop;
                }
                case 339: {
                    var11_ref_pm = this.field_r[var10];
                    var12_ref = this.field_f[var10];
                    var12_ref.field_c = cla.field_m[this.field_X[var11_ref_pm.field_l] & 65535] & 16777215 | var12_ref.field_c & -16777216;
                    var10++;
                    statePc = 337;
                    continue stateLoop;
                }
                case 340: {
                    return;
                }
                case 341: {
                    if (param0 != 8) {
                        statePc = 355;
                    } else {
                        statePc = 342;
                    }
                    continue stateLoop;
                }
                case 342: {
                    if (this.field_C == null) {
                        statePc = 354;
                    } else {
                        statePc = 345;
                    }
                    continue stateLoop;
                }
                case 345: {
                    var10 = 0;
                    statePc = 346;
                    continue stateLoop;
                }
                case 346: {
                    if ((var10 ^ -1) <= (var9_int ^ -1)) {
                        statePc = 354;
                    } else {
                        statePc = 347;
                    }
                    continue stateLoop;
                }
                case 347: {
                    var11 = param1[var10];
                    if ((this.field_C.length ^ -1) >= (var11 ^ -1)) {
                        statePc = 353;
                    } else {
                        statePc = 348;
                    }
                    continue stateLoop;
                }
                case 348: {
                    var12 = this.field_C[var11];
                    var13 = 0;
                    statePc = 349;
                    continue stateLoop;
                }
                case 349: {
                    if ((var13 ^ -1) <= (var12.length ^ -1)) {
                        statePc = 353;
                    } else {
                        statePc = 350;
                    }
                    continue stateLoop;
                }
                case 350: {
                    var14 = this.field_f[var12[var13]];
                    var14.field_h = var14.field_h + param2;
                    var14.field_a = var14.field_a + param3;
                    var13++;
                    statePc = 349;
                    continue stateLoop;
                }
                case 353: {
                    var10++;
                    statePc = 346;
                    continue stateLoop;
                }
                case 354: {
                    return;
                }
                case 355: {
                    if (param0 == 10) {
                        statePc = 358;
                    } else {
                        statePc = 371;
                    }
                    continue stateLoop;
                }
                case 358: {
                    if (this.field_C != null) {
                        statePc = 361;
                    } else {
                        statePc = 370;
                    }
                    continue stateLoop;
                }
                case 361: {
                    var10 = 0;
                    statePc = 362;
                    continue stateLoop;
                }
                case 362: {
                    if ((var9_int ^ -1) >= (var10 ^ -1)) {
                        statePc = 370;
                    } else {
                        statePc = 363;
                    }
                    continue stateLoop;
                }
                case 363: {
                    var11 = param1[var10];
                    if (var11 >= this.field_C.length) {
                        statePc = 369;
                    } else {
                        statePc = 364;
                    }
                    continue stateLoop;
                }
                case 364: {
                    var12 = this.field_C[var11];
                    var13 = 0;
                    statePc = 365;
                    continue stateLoop;
                }
                case 365: {
                    if (var13 >= var12.length) {
                        statePc = 369;
                    } else {
                        statePc = 366;
                    }
                    continue stateLoop;
                }
                case 366: {
                    var14 = this.field_f[var12[var13]];
                    var14.field_b = var14.field_b * param2 >> -1560528921;
                    var14.field_f = param3 * var14.field_f >> 2147322599;
                    var13++;
                    statePc = 365;
                    continue stateLoop;
                }
                case 369: {
                    var10++;
                    statePc = 362;
                    continue stateLoop;
                }
                case 370: {
                    return;
                }
                case 371: {
                    if (param0 != 9) {
                        statePc = 399;
                    } else {
                        statePc = 372;
                    }
                    continue stateLoop;
                }
                case 372: {
                    if (null != this.field_C) {
                        statePc = 377;
                    } else {
                        statePc = 388;
                    }
                    continue stateLoop;
                }
                case 377: {
                    var10 = 0;
                    statePc = 378;
                    continue stateLoop;
                }
                case 378: {
                    if (var9_int <= var10) {
                        statePc = 388;
                    } else {
                        statePc = 379;
                    }
                    continue stateLoop;
                }
                case 379: {
                    var11 = param1[var10];
                    if (var11 < this.field_C.length) {
                        statePc = 382;
                    } else {
                        statePc = 387;
                    }
                    continue stateLoop;
                }
                case 382: {
                    var12 = this.field_C[var11];
                    var13 = 0;
                    statePc = 383;
                    continue stateLoop;
                }
                case 383: {
                    if ((var12.length ^ -1) >= (var13 ^ -1)) {
                        statePc = 387;
                    } else {
                        statePc = 384;
                    }
                    continue stateLoop;
                }
                case 384: {
                    var14 = this.field_f[var12[var13]];
                    var14.field_g = 16383 & param2 + var14.field_g;
                    var13++;
                    statePc = 383;
                    continue stateLoop;
                }
                case 387: {
                    var10++;
                    statePc = 378;
                    continue stateLoop;
                }
                case 388: {
                    return;
                }
                case 399: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final static void b(int param0) {
        int var1_int = 0;
        int var2 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        try {
          L0: {
            L1: {
              if (param0 <= -19) {
                break L1;
              } else {
                field_m = (cn) null;
                break L1;
              }
            }
            var1_int = jv.d(-77);
            var2 = za.a(18998);
            aoa.field_b.a((byte) 57, var1_int + (jf.field_q << -1436062303), -gm.field_m + wp.field_b, wt.field_a - jf.field_q, (gm.field_m << 301963873) + var2);
            mi.a(125);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw tba.a((Throwable) ((Object) var1), "np.P(" + param0 + ')');
        }
    }

    private final void b(byte param0) {
        int var14 = 0;
        cka stackIn_7_0 = null;
        cka stackIn_8_0 = null;
        int stackIn_8_1 = 0;
        boolean stackIn_11_0 = false;
        int stackIn_21_0 = 0;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_10_0;
        oba var2 = null;
        RuntimeException var2_ref = null;
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
        var14 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              L2: {
                if (null != this.field_r) {
                  L3: {
                    var2 = this.field_R.field_mc;
                    this.field_R.u(28630);
                    stackIn_7_0 = this.field_R;

                    if (this.field_s) {
                      stackIn_8_0 = (cka) ((Object) stackIn_7_0);
                      stackIn_8_1 = 0;
                      break L3;
                    } else {
                      stackIn_8_0 = (cka) ((Object) stackIn_7_0);
                      stackIn_8_1 = 1;
                      break L3;
                    }
                  }
                  ((cka) (Object) stackIn_8_0).a(stackIn_8_1 != 0, false);
                  this.field_R.a(param0 ^ -35, false);
                  this.field_R.a((tj) null, this.field_R.field_Rb, (tj) null, -114, this.field_R.field_Bc);
                  var3 = 0;
                  L4: while (true) {
                    if ((var3 ^ -1) <= (this.field_G ^ -1)) {
                      this.field_R.a(true, false);
                      this.field_R.n((byte) -65);
                      break L2;
                    } else {
                      var4 = this.field_r[var3];
                      var5 = this.field_f[var3];
                      stackOut_10_0 = var4.field_g;
                      stackIn_21_0 = stackOut_10_0 ? 1 : 0;
                      stackIn_11_0 = stackOut_10_0;
                      L5: {
                        L6: {
                          if (!stackIn_11_0) {
                            break L6;
                          } else {
                            if (this.field_R.f()) {
                              break L5;
                            } else {
                              break L6;
                            }
                          }
                        }
                        var6 = (float)(this.field_P[var4.field_b] + this.field_P[var4.field_k] + this.field_P[var4.field_m]) * 0.3333333134651184f;
                        var7 = 0.3333333134651184f * (float)(this.field_K[var4.field_b] + this.field_K[var4.field_k] + this.field_K[var4.field_m]);
                        var8 = (float)(this.field_A[var4.field_k] + this.field_A[var4.field_m] + this.field_A[var4.field_b]) * 0.3333333134651184f;
                        var9 = aka.field_B + (var8 * mu.field_ub + (eqa.field_a * var7 + var6 * is.field_Ab));
                        var10 = ef.field_s + (var6 * qi.field_L + nw.field_u * var7 + bva.field_c * var8);
                        var11 = bja.field_b + (kka.field_q * var8 + (var7 * it.field_a + var6 * roa.field_u));
                        var12 = (float)(1.0 / Math.sqrt((double)(var11 * var11 + (var10 * var10 + var9 * var9)))) * (float)var4.field_j;
                        var2.a(var5.field_g, var12 * var11 + -var11, var9 + (float)var5.field_h - var9 * var12, var4.field_e * var5.field_f >> -786865721, (byte) -60, var4.field_i * var5.field_b >> 1847323719, var12 * var10 + (-var10 + (float)var5.field_a));
                        this.field_R.a(var2, 0);
                        var13 = var5.field_c;
                        jaggl.OpenGL.glColor4ub((byte)(var13 >> 441626224), (byte)(var13 >> 2136262376), (byte)var13, (byte)(var13 >> 683812344));
                        this.field_R.c((int) var4.field_f, 32677);
                        this.field_R.a((byte) 94, (int) var4.field_c);
                        this.field_R.a(0, 4, 7, true);
                        break L5;
                      }
                      var3++;
                      continue L4;
                    }
                  }
                } else {
                  break L2;
                }
              }
              stackIn_21_0 = param0;
              break L1;
            }
            L7: {
              if (stackIn_21_0 == -30) {
                break L7;
              } else {
                this.a(-99, (int[]) null, -39, -40, 4, -64, false);
                break L7;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw tba.a((Throwable) ((Object) var2_ref), "np.F(" + param0 + ')');
        }
    }

    final void a(gda param0, el param1, int param2) {
        RuntimeException stackIn_67_0 = null;
        StringBuilder stackIn_67_1 = null;
        RuntimeException stackIn_68_0 = null;
        StringBuilder stackIn_68_1 = null;
        String stackIn_68_2 = null;
        StringBuilder stackIn_71_1 = null;
        StringBuilder stackIn_72_1 = null;
        String stackIn_72_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        oba var4 = null;
        RuntimeException var4_ref = null;
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
        var24 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            if (this.field_L == 0) {
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L1: {
                var4 = this.field_R.field_jd;
                var5 = (oba) ((Object) param0);
                if (this.field_l) {
                  break L1;
                } else {
                  this.c(2709);
                  break L1;
                }
              }
              L2: {
                bja.field_b = var4.field_o + (var4.field_j * var5.field_m + var4.field_h * var5.field_p + var4.field_q * var5.field_o);
                it.field_a = var5.field_k * var4.field_j + var4.field_h * var5.field_r + var4.field_q * var5.field_h;
                var6 = bja.field_b + (float)this.field_eb * it.field_a;
                var7 = bja.field_b + it.field_a * (float)this.field_v;
                if (var7 >= var6) {
                  var9 = var7 + (float)this.field_M;
                  var8 = (float)(-this.field_M) + var6;
                  break L2;
                } else {
                  var8 = var7 - (float)this.field_M;
                  var9 = (float)this.field_M + var6;
                  break L2;
                }
              }
              if (var8 >= this.field_R.field_u) {
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                if ((float)this.field_R.field_Gc < var9) {
                  L3: {
                    eqa.field_a = var5.field_h * var4.field_s + (var5.field_r * var4.field_k + var5.field_k * var4.field_l);
                    aka.field_B = var5.field_m * var4.field_l + var5.field_p * var4.field_k + var4.field_s * var5.field_o + var4.field_m;
                    var10 = aka.field_B + (float)this.field_eb * eqa.field_a;
                    var11 = eqa.field_a * (float)this.field_v + aka.field_B;
                    if (var10 > var11) {
                      var13 = ((float)this.field_M + var10) * (float)this.field_R.field_W;
                      var12 = ((float)(-this.field_M) + var11) * (float)this.field_R.field_W;
                      break L3;
                    } else {
                      var13 = (float)this.field_R.field_W * (var11 + (float)this.field_M);
                      var12 = (var10 - (float)this.field_M) * (float)this.field_R.field_W;
                      break L3;
                    }
                  }
                  if (this.field_R.field_od > var12 / var9) {
                    if (var13 / var9 > this.field_R.field_s) {
                      L4: {
                        nw.field_u = var4.field_r * var5.field_r + var4.field_i * var5.field_k + var5.field_h * var4.field_g;
                        ef.field_s = var5.field_o * var4.field_g + (var5.field_m * var4.field_i + var5.field_p * var4.field_r) + var4.field_p;
                        var14 = ef.field_s + (float)this.field_eb * nw.field_u;
                        var15 = ef.field_s + nw.field_u * (float)this.field_v;
                        if (var15 >= var14) {
                          var16 = (float)this.field_R.field_kb * ((float)(-this.field_M) + var14);
                          var17 = (float)this.field_R.field_kb * ((float)this.field_M + var15);
                          break L4;
                        } else {
                          var17 = (float)this.field_R.field_kb * (var14 + (float)this.field_M);
                          var16 = (float)this.field_R.field_kb * (var15 - (float)this.field_M);
                          break L4;
                        }
                      }
                      if (this.field_R.field_Db > var16 / var9) {
                        if (this.field_R.field_nd >= var17 / var9) {
                          decompiledRegionSelector0 = 6;
                          break L0;
                        } else {
                          L5: {
                            L6: {
                              if (param1 != null) {
                                break L6;
                              } else {
                                if (this.field_r == null) {
                                  break L5;
                                } else {
                                  break L6;
                                }
                              }
                            }
                            is.field_Ab = var5.field_i * var4.field_k + var5.field_l * var4.field_l + var4.field_s * var5.field_j;
                            roa.field_u = var4.field_q * var5.field_j + (var5.field_l * var4.field_j + var5.field_i * var4.field_h);
                            kka.field_q = var4.field_q * var5.field_q + (var5.field_g * var4.field_h + var4.field_j * var5.field_s);
                            mu.field_ub = var4.field_s * var5.field_q + (var4.field_l * var5.field_s + var5.field_g * var4.field_k);
                            qi.field_L = var5.field_j * var4.field_g + (var5.field_i * var4.field_r + var4.field_i * var5.field_l);
                            bva.field_c = var5.field_s * var4.field_i + var4.field_r * var5.field_g + var5.field_q * var4.field_g;
                            break L5;
                          }
                          L7: {
                            if (param1 == null) {
                              break L7;
                            } else {
                              L8: {
                                var18 = 0;
                                var19 = 1;
                                var20 = this.field_U + this.field_T >> -1924729023;
                                var21 = this.field_k + this.field_S >> 417397249;
                                var22 = (int)((float)var21 * kka.field_q + (it.field_a * (float)this.field_eb + ((float)var20 * roa.field_u + bja.field_b)));
                                if ((this.field_R.field_Gc ^ -1) < (var22 ^ -1)) {
                                  var18 = 1;
                                  break L8;
                                } else {
                                  break L8;
                                }
                              }
                              L9: {
                                var23 = (int)(bja.field_b + roa.field_u * (float)var20 + it.field_a * (float)this.field_v + (float)var21 * kka.field_q);
                                if (var23 >= this.field_R.field_Gc) {
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
                                    if (var22 >= this.field_R.field_Gc) {
                                      break L11;
                                    } else {
                                      if ((this.field_R.field_Gc ^ -1) >= (var23 ^ -1)) {
                                        break L11;
                                      } else {
                                        var19 = 0;
                                        break L10;
                                      }
                                    }
                                  }
                                  if ((var22 ^ -1) <= (this.field_R.field_Gc ^ -1)) {
                                    if (var23 < this.field_R.field_Gc) {
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
                                if ((var23 ^ -1) <= (var22 ^ -1)) {
                                  break L7;
                                } else {
                                  break L7;
                                }
                              }
                            }
                          }
                          this.field_R.c(false);
                          this.field_R.b(var5, 117);
                          this.a(false);
                          this.field_R.n((byte) -96);
                          this.b((byte) -30);
                          decompiledRegionSelector0 = 7;
                          break L0;
                        }
                      } else {
                        decompiledRegionSelector0 = 5;
                        break L0;
                      }
                    } else {
                      decompiledRegionSelector0 = 4;
                      break L0;
                    }
                  } else {
                    decompiledRegionSelector0 = 3;
                    break L0;
                  }
                } else {
                  decompiledRegionSelector0 = 2;
                  break L0;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L12: {
            var4_ref = decompiledCaughtException;
            stackIn_67_0 = (RuntimeException) (var4_ref);

            stackIn_67_1 = new StringBuilder().append("np.N(");

            if (param0 == null) {
              stackIn_68_0 = (RuntimeException) ((Object) stackIn_67_0);
              stackIn_68_1 = (StringBuilder) ((Object) stackIn_67_1);
              stackIn_68_2 = "null";
              break L12;
            } else {
              stackIn_68_0 = (RuntimeException) ((Object) stackIn_67_0);
              stackIn_68_1 = (StringBuilder) ((Object) stackIn_67_1);
              stackIn_68_2 = "{...}";
              break L12;
            }
          }
          L13: {


            stackIn_71_1 = ((StringBuilder) (Object) stackIn_68_1).append(stackIn_68_2).append(',');

            if (param1 == null) {
              stackIn_68_0 = (RuntimeException) ((Object) stackIn_68_0);
              stackIn_72_1 = (StringBuilder) ((Object) stackIn_71_1);
              stackIn_72_2 = "null";
              break L13;
            } else {
              stackIn_68_0 = (RuntimeException) ((Object) stackIn_68_0);
              stackIn_72_1 = (StringBuilder) ((Object) stackIn_71_1);
              stackIn_72_2 = "{...}";
              break L13;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_68_0), stackIn_72_2 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return;
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return;
                } else {
                  if (decompiledRegionSelector0 == 5) {
                    return;
                  } else {
                    if (decompiledRegionSelector0 == 6) {
                      return;
                    } else {
                      return;
                    }
                  }
                }
              }
            }
          }
        }
    }

    final void b() {
    }

    final boolean NA() {
        int var1_int = 0;
        int var2 = 0;
        int stackIn_3_0 = 0;
        int stackIn_10_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        var2 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            if (this.field_d != null) {
              var1_int = 0;
              L1: while (true) {
                if ((this.field_N ^ -1) >= (var1_int ^ -1)) {
                  rp.field_i = 0;
                  dj.field_b = 0;
                  via.field_e = 0;
                  stackIn_10_0 = 1;
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  this.field_P[var1_int] = this.field_P[var1_int] << 4;
                  this.field_K[var1_int] = this.field_K[var1_int] << 4;
                  this.field_A[var1_int] = this.field_A[var1_int] << 4;
                  var1_int++;
                  continue L1;
                }
              }
            } else {
              stackIn_3_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw tba.a((Throwable) ((Object) var1), "np.NA()");
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0 != 0;
        } else {
          return stackIn_10_0 != 0;
        }
    }

    private final void a(int param0, boolean param1) {
        int stackIn_8_0 = 0;
        int stackIn_15_0 = 0;
        int stackIn_22_0 = 0;
        int stackIn_31_0 = 0;
        int stackIn_33_0 = 0;
        int stackIn_35_0 = 0;
        int stackIn_37_0 = 0;
        int stackIn_38_0 = 0;
        int stackIn_38_1 = 0;
        int stackIn_39_0 = 0;
        int stackIn_41_0 = 0;
        int stackIn_42_0 = 0;
        int stackIn_42_1 = 0;
        int stackIn_43_0 = 0;
        int stackIn_45_0 = 0;
        int stackIn_46_0 = 0;
        int stackIn_46_1 = 0;
        int stackIn_47_0 = 0;
        int stackIn_49_0 = 0;
        int stackIn_50_0 = 0;
        int stackIn_50_1 = 0;
        int stackIn_79_0 = 0;
        int stackIn_79_1 = 0;
        int stackIn_83_0 = 0;
        int stackIn_83_1 = 0;
        int stackIn_94_0 = 0;
        int stackIn_94_1 = 0;
        int stackIn_98_0 = 0;
        int stackIn_98_1 = 0;
        int stackIn_124_0 = 0;
        float stackIn_133_0 = 0.0f;
        float stackIn_157_0 = 0.0f;
        float stackIn_157_1 = 0.0f;
        float stackIn_159_0 = 0.0f;
        float stackIn_159_1 = 0.0f;
        float stackIn_160_0 = 0.0f;
        float stackIn_160_1 = 0.0f;
        float stackIn_160_2 = 0.0f;
        float stackIn_189_0 = 0.0f;
        int stackIn_211_0 = 0;
        int decompiledRegionSelector0 = 0;
        Throwable caughtException = null;
        int statePc = 0;
        int var3_int = 0;
        RuntimeException var3 = null;
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
        int var14_int = 0;
        short[] var14 = null;
        int var15_int = 0;
        short[] var15 = null;
        int var16_int = 0;
        byte[] var16 = null;
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
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var35 = TombRacer.field_G ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    if (this.field_kb == null) {
                        statePc = 7;
                    } else {
                        statePc = 2;
                    }
                    continue stateLoop;
                }
                case 2: {
                    if (this.field_kb.field_d != null) {
                        statePc = 7;
                    } else {
                        statePc = 5;
                    }
                    continue stateLoop;
                }
                case 5: {
                    stackIn_8_0 = 1;
                    statePc = 8;
                    continue stateLoop;
                }
                case 7: {
                    stackIn_8_0 = 0;
                    statePc = 8;
                    continue stateLoop;
                }
                case 8: {
                    var3_int = stackIn_8_0;
                    if (null == this.field_F) {
                        statePc = 14;
                    } else {
                        statePc = 9;
                    }
                    continue stateLoop;
                }
                case 9: {
                    if (null != this.field_F.field_d) {
                        statePc = 14;
                    } else {
                        statePc = 12;
                    }
                    continue stateLoop;
                }
                case 12: {
                    stackIn_15_0 = 1;
                    statePc = 15;
                    continue stateLoop;
                }
                case 14: {
                    stackIn_15_0 = 0;
                    statePc = 15;
                    continue stateLoop;
                }
                case 15: {
                    var4 = stackIn_15_0;
                    if (null == this.field_g) {
                        statePc = 21;
                    } else {
                        statePc = 16;
                    }
                    continue stateLoop;
                }
                case 16: {
                    if (this.field_g.field_d != null) {
                        statePc = 21;
                    } else {
                        statePc = 19;
                    }
                    continue stateLoop;
                }
                case 19: {
                    stackIn_22_0 = 1;
                    statePc = 22;
                    continue stateLoop;
                }
                case 21: {
                    stackIn_22_0 = 0;
                    statePc = 22;
                    continue stateLoop;
                }
                case 22: {
                    var5 = stackIn_22_0;
                    if (param0 == 0) {
                        statePc = 24;
                    } else {
                        statePc = 23;
                    }
                    continue stateLoop;
                }
                case 23: {
                    return;
                }
                case 24: {
                    if (this.field_ab == null) {
                        statePc = 30;
                    } else {
                        statePc = 25;
                    }
                    continue stateLoop;
                }
                case 25: {
                    if (this.field_ab.field_d != null) {
                        statePc = 30;
                    } else {
                        statePc = 28;
                    }
                    continue stateLoop;
                }
                case 28: {
                    stackIn_31_0 = 1;
                    statePc = 31;
                    continue stateLoop;
                }
                case 30: {
                    stackIn_31_0 = 0;
                    statePc = 31;
                    continue stateLoop;
                }
                case 31: {
                    var6 = stackIn_31_0;
                    if (!param1) {
                        statePc = 51;
                    } else {
                        statePc = 32;
                    }
                    continue stateLoop;
                }
                case 32: {
                    stackIn_37_0 = var6;
                    stackIn_33_0 = stackIn_37_0;
                    if ((8 & this.field_Z) == 0) {
                        statePc = 37;
                    } else {
                        statePc = 33;
                    }
                    continue stateLoop;
                }
                case 33: {
                    stackIn_35_0 = stackIn_33_0;
                    statePc = 35;
                    continue stateLoop;
                }
                case 35: {
                    stackIn_38_0 = stackIn_35_0;
                    stackIn_38_1 = 1;
                    statePc = 38;
                    continue stateLoop;
                }
                case 37: {
                    stackIn_38_0 = stackIn_37_0;
                    stackIn_38_1 = 0;
                    statePc = 38;
                    continue stateLoop;
                }
                case 38: {
                    var6 = stackIn_38_0 & stackIn_38_1;
                    stackIn_41_0 = var5;
                    stackIn_39_0 = stackIn_41_0;
                    if ((this.field_Z & 1) == 0) {
                        statePc = 41;
                    } else {
                        statePc = 39;
                    }
                    continue stateLoop;
                }
                case 39: {
                    stackIn_42_0 = stackIn_39_0;
                    stackIn_42_1 = 1;
                    statePc = 42;
                    continue stateLoop;
                }
                case 41: {
                    stackIn_42_0 = stackIn_41_0;
                    stackIn_42_1 = 0;
                    statePc = 42;
                    continue stateLoop;
                }
                case 42: {
                    var5 = stackIn_42_0 & stackIn_42_1;
                    stackIn_45_0 = var4;
                    stackIn_43_0 = stackIn_45_0;
                    if (-1 == (4 & this.field_Z ^ -1)) {
                        statePc = 45;
                    } else {
                        statePc = 43;
                    }
                    continue stateLoop;
                }
                case 43: {
                    stackIn_46_0 = stackIn_43_0;
                    stackIn_46_1 = 1;
                    statePc = 46;
                    continue stateLoop;
                }
                case 45: {
                    stackIn_46_0 = stackIn_45_0;
                    stackIn_46_1 = 0;
                    statePc = 46;
                    continue stateLoop;
                }
                case 46: {
                    var4 = stackIn_46_0 & stackIn_46_1;
                    stackIn_49_0 = var3_int;
                    stackIn_47_0 = stackIn_49_0;
                    if ((2 & this.field_Z ^ -1) == -1) {
                        statePc = 49;
                    } else {
                        statePc = 47;
                    }
                    continue stateLoop;
                }
                case 47: {
                    stackIn_50_0 = stackIn_47_0;
                    stackIn_50_1 = 1;
                    statePc = 50;
                    continue stateLoop;
                }
                case 49: {
                    stackIn_50_0 = stackIn_49_0;
                    stackIn_50_1 = 0;
                    statePc = 50;
                    continue stateLoop;
                }
                case 50: {
                    var3_int = stackIn_50_0 & stackIn_50_1;
                    statePc = 51;
                    continue stateLoop;
                }
                case 51: {
                    var7 = 0;
                    var8 = 0;
                    var9 = 0;
                    var10 = 0;
                    if (var5 != 0) {
                        statePc = 54;
                    } else {
                        statePc = 55;
                    }
                    continue stateLoop;
                }
                case 54: {
                    var8 = var7;
                    var7 = (byte)(var7 + 12);
                    statePc = 55;
                    continue stateLoop;
                }
                case 55: {
                    var11 = 0;
                    if (var3_int == 0) {
                        statePc = 57;
                    } else {
                        statePc = 56;
                    }
                    continue stateLoop;
                }
                case 56: {
                    var9 = var7;
                    var7 = (byte)(var7 + 4);
                    statePc = 57;
                    continue stateLoop;
                }
                case 57: {
                    if (var4 != 0) {
                        statePc = 60;
                    } else {
                        statePc = 61;
                    }
                    continue stateLoop;
                }
                case 60: {
                    var10 = var7;
                    var7 = (byte)(var7 + 12);
                    statePc = 61;
                    continue stateLoop;
                }
                case 61: {
                    if (var6 == 0) {
                        statePc = 63;
                    } else {
                        statePc = 62;
                    }
                    continue stateLoop;
                }
                case 62: {
                    var11 = var7;
                    var7 = (byte)(var7 + 8);
                    statePc = 63;
                    continue stateLoop;
                }
                case 63: {
                    if (-1 == (var7 ^ -1)) {
                        statePc = 66;
                    } else {
                        statePc = 67;
                    }
                    continue stateLoop;
                }
                case 66: {
                    return;
                }
                case 67: {
                    if ((this.field_R.field_cb.field_g.length ^ -1) <= (this.field_L * var7 ^ -1)) {
                        statePc = 71;
                    } else {
                        statePc = 68;
                    }
                    continue stateLoop;
                }
                case 68: {
                    this.field_R.field_cb = new qf((this.field_L + 100) * var7);
                    statePc = 73;
                    continue stateLoop;
                }
                case 71: {
                    this.field_R.field_cb.field_h = 0;
                    statePc = 73;
                    continue stateLoop;
                }
                case 73: {
                    var12 = this.field_R.field_cb;
                    if (var5 == 0) {
                        statePc = 106;
                    } else {
                        statePc = 74;
                    }
                    continue stateLoop;
                }
                case 74: {
                    if (this.field_R.field_O) {
                        statePc = 92;
                    } else {
                        statePc = 77;
                    }
                    continue stateLoop;
                }
                case 77: {
                    var13_int = 0;
                    statePc = 78;
                    continue stateLoop;
                }
                case 78: {
                    stackIn_79_0 = var13_int ^ -1;
                    stackIn_79_1 = this.field_lb ^ -1;
                    statePc = 79;
                    continue stateLoop;
                }
                case 79: {
                    if (stackIn_79_0 <= stackIn_79_1) {
                        statePc = 106;
                    } else {
                        statePc = 80;
                    }
                    continue stateLoop;
                }
                case 80: {
                    var14_int = jaclib.memory.Stream.floatToRawIntBits((float)this.field_P[var13_int]);
                    var15_int = jaclib.memory.Stream.floatToRawIntBits((float)this.field_K[var13_int]);
                    var16_int = jaclib.memory.Stream.floatToRawIntBits((float)this.field_A[var13_int]);
                    var17_int = this.field_e[var13_int];
                    var18_int = this.field_e[1 + var13_int];
                    var19 = var17_int;
                    statePc = 81;
                    continue stateLoop;
                }
                case 81: {
                    if ((var18_int ^ -1) >= (var19 ^ -1)) {
                        statePc = 90;
                    } else {
                        statePc = 82;
                    }
                    continue stateLoop;
                }
                case 82: {
                    var20 = this.field_q[var19] - 1;
                    stackIn_79_0 = 0;
                    stackIn_83_0 = stackIn_79_0;
                    stackIn_79_1 = var20 ^ -1;
                    stackIn_83_1 = stackIn_79_1;
                    if (false) {
                        statePc = 79;
                    } else {
                        statePc = 83;
                    }
                    continue stateLoop;
                }
                case 83: {
                    if (stackIn_83_0 != stackIn_83_1) {
                        statePc = 87;
                    } else {
                        statePc = 90;
                    }
                    continue stateLoop;
                }
                case 87: {
                    var12.field_h = var7 * var20;
                    var12.a((byte) -35, var14_int);
                    var12.a((byte) -35, var15_int);
                    var12.a((byte) -35, var16_int);
                    var19++;
                    statePc = 81;
                    continue stateLoop;
                }
                case 90: {
                    var13_int++;
                    statePc = 78;
                    continue stateLoop;
                }
                case 92: {
                    var13_int = 0;
                    statePc = 93;
                    continue stateLoop;
                }
                case 93: {
                    stackIn_94_0 = var13_int ^ -1;
                    stackIn_94_1 = this.field_lb ^ -1;
                    statePc = 94;
                    continue stateLoop;
                }
                case 94: {
                    if (stackIn_94_0 <= stackIn_94_1) {
                        statePc = 106;
                    } else {
                        statePc = 95;
                    }
                    continue stateLoop;
                }
                case 95: {
                    var14_int = jaclib.memory.Stream.floatToRawIntBits((float)this.field_P[var13_int]);
                    var15_int = jaclib.memory.Stream.floatToRawIntBits((float)this.field_K[var13_int]);
                    var16_int = jaclib.memory.Stream.floatToRawIntBits((float)this.field_A[var13_int]);
                    var17_int = this.field_e[var13_int];
                    var18_int = this.field_e[1 + var13_int];
                    var19 = var17_int;
                    statePc = 96;
                    continue stateLoop;
                }
                case 96: {
                    if (var19 >= var18_int) {
                        statePc = 105;
                    } else {
                        statePc = 97;
                    }
                    continue stateLoop;
                }
                case 97: {
                    var20 = this.field_q[var19] - 1;
                    stackIn_94_0 = -1;
                    stackIn_98_0 = stackIn_94_0;
                    stackIn_94_1 = var20;
                    stackIn_98_1 = stackIn_94_1;
                    if (false) {
                        statePc = 94;
                    } else {
                        statePc = 98;
                    }
                    continue stateLoop;
                }
                case 98: {
                    if (stackIn_98_0 != stackIn_98_1) {
                        statePc = 102;
                    } else {
                        statePc = 105;
                    }
                    continue stateLoop;
                }
                case 102: {
                    var12.field_h = var20 * var7;
                    var12.a(var14_int, (byte) -72);
                    var12.a(var15_int, (byte) -13);
                    var12.a(var16_int, (byte) 81);
                    var19++;
                    statePc = 96;
                    continue stateLoop;
                }
                case 105: {
                    var13_int++;
                    statePc = 93;
                    continue stateLoop;
                }
                case 106: {
                    if (var3_int == 0) {
                        statePc = 210;
                    } else {
                        statePc = 107;
                    }
                    continue stateLoop;
                }
                case 107: {
                    if (null == this.field_F) {
                        statePc = 116;
                    } else {
                        statePc = 110;
                    }
                    continue stateLoop;
                }
                case 110: {
                    var13_int = 0;
                    statePc = 111;
                    continue stateLoop;
                }
                case 111: {
                    if ((this.field_W ^ -1) >= (var13_int ^ -1)) {
                        statePc = 210;
                    } else {
                        statePc = 112;
                    }
                    continue stateLoop;
                }
                case 112: {
                    var14_int = this.a(-2117016184, (int) this.field_X[var13_int], this.field_o[var13_int], this.field_I[var13_int], (int) this.field_B);
                    var12.field_h = var9 + var7 * this.field_H[var13_int];
                    var12.a(var14_int, (byte) 92);
                    var12.field_h = var7 * this.field_z[var13_int] + var9;
                    var12.a(var14_int, (byte) 91);
                    var12.field_h = var9 - -(this.field_hb[var13_int] * var7);
                    var12.a(var14_int, (byte) 113);
                    var13_int++;
                    statePc = 111;
                    continue stateLoop;
                }
                case 116: {
                    if (this.field_i == null) {
                        statePc = 120;
                    } else {
                        statePc = 119;
                    }
                    continue stateLoop;
                }
                case 119: {
                    var16 = this.field_i.field_e;
                    var13 = this.field_i.field_d;
                    var14 = this.field_i.field_b;
                    var15 = this.field_i.field_f;
                    statePc = 121;
                    continue stateLoop;
                }
                case 120: {
                    var16 = this.field_O;
                    var13 = this.field_E;
                    var14 = this.field_Y;
                    var15 = this.field_cb;
                    statePc = 121;
                    continue stateLoop;
                }
                case 121: {
                    var28 = this.field_R.field_Wb[0];
                    var29 = this.field_R.field_Wb[1];
                    var30 = this.field_R.field_Wb[2];
                    var31 = this.field_R.field_tc;
                    var32 = this.field_R.field_cd * 768.0f / (float)this.field_h;
                    var33 = 768.0f * this.field_R.field_Sb / (float)this.field_h;
                    var34 = 0;
                    statePc = 122;
                    continue stateLoop;
                }
                case 122: {
                    if ((this.field_W ^ -1) >= (var34 ^ -1)) {
                        statePc = 210;
                    } else {
                        statePc = 123;
                    }
                    continue stateLoop;
                }
                case 123: {
                    var24 = this.a(-2117016184, (int) this.field_X[var34], this.field_o[var34], this.field_I[var34], (int) this.field_B);
                    var20_float = (float)(var24 >>> -1389478568) * this.field_R.field_wc;
                    var22 = this.field_R.field_bc * (float)(255 & var24 >> -1368006712);
                    var21 = (float)(var24 >> -408436688 & 255) * this.field_R.field_Fb;
                    var23 = this.field_H[var34];
                    var17_int = (short)var16[var23];
                    stackIn_211_0 = var17_int;
                    stackIn_124_0 = stackIn_211_0;
                    if (false) {
                        statePc = 211;
                    } else {
                        statePc = 124;
                    }
                    continue stateLoop;
                }
                case 124: {
                    if (stackIn_124_0 == 0) {
                        statePc = 128;
                    } else {
                        statePc = 127;
                    }
                    continue stateLoop;
                }
                case 127: {
                    var18 = ((float)var15[var23] * var30 + ((float)var13[var23] * var28 + var29 * (float)var14[var23])) / (float)(var17_int * 256);
                    statePc = 129;
                    continue stateLoop;
                }
                case 128: {
                    var18 = ((float)var15[var23] * var30 + ((float)var14[var23] * var29 + var28 * (float)var13[var23])) * 0.0026041667442768812f;
                    statePc = 129;
                    continue stateLoop;
                }
                case 129: {
                    if (var18 < 0.0f) {
                        statePc = 132;
                    } else {
                        statePc = 130;
                    }
                    continue stateLoop;
                }
                case 130: {
                    stackIn_133_0 = var32;
                    statePc = 133;
                    continue stateLoop;
                }
                case 132: {
                    stackIn_133_0 = var33;
                    statePc = 133;
                    continue stateLoop;
                }
                case 133: {
                    var19_float = stackIn_133_0 * var18 + var31;
                    var25 = (int)(var20_float * var19_float);
                    var26 = (int)(var19_float * var21);
                    if ((var25 ^ -1) <= -1) {
                        statePc = 135;
                    } else {
                        statePc = 134;
                    }
                    continue stateLoop;
                }
                case 134: {
                    var25 = 0;
                    statePc = 139;
                    continue stateLoop;
                }
                case 135: {
                    if ((var25 ^ -1) >= -256) {
                        statePc = 139;
                    } else {
                        statePc = 138;
                    }
                    continue stateLoop;
                }
                case 138: {
                    var25 = 255;
                    statePc = 139;
                    continue stateLoop;
                }
                case 139: {
                    if (0 <= var26) {
                        statePc = 141;
                    } else {
                        statePc = 140;
                    }
                    continue stateLoop;
                }
                case 140: {
                    var26 = 0;
                    statePc = 145;
                    continue stateLoop;
                }
                case 141: {
                    if (255 >= var26) {
                        statePc = 145;
                    } else {
                        statePc = 144;
                    }
                    continue stateLoop;
                }
                case 144: {
                    var26 = 255;
                    statePc = 145;
                    continue stateLoop;
                }
                case 145: {
                    var27 = (int)(var19_float * var22);
                    var12.field_h = var9 - -(var23 * var7);
                    if (0 <= var27) {
                        statePc = 147;
                    } else {
                        statePc = 146;
                    }
                    continue stateLoop;
                }
                case 146: {
                    var27 = 0;
                    statePc = 153;
                    continue stateLoop;
                }
                case 147: {
                    if (255 < var27) {
                        statePc = 152;
                    } else {
                        statePc = 153;
                    }
                    continue stateLoop;
                }
                case 152: {
                    var27 = 255;
                    statePc = 153;
                    continue stateLoop;
                }
                case 153: {
                    var12.i(var25, param0 + 0);
                    var12.i(var26, 0);
                    var12.i(var27, 0);
                    var12.i(255 + -(this.field_o[var34] & 255), 0);
                    var23 = this.field_z[var34];
                    var17_int = (short)var16[var23];
                    if (-1 == (var17_int ^ -1)) {
                        statePc = 155;
                    } else {
                        statePc = 154;
                    }
                    continue stateLoop;
                }
                case 154: {
                    var18 = (var30 * (float)var15[var23] + (var28 * (float)var13[var23] + var29 * (float)var14[var23])) / (float)(256 * var17_int);
                    statePc = 156;
                    continue stateLoop;
                }
                case 155: {
                    var18 = ((float)var13[var23] * var28 + var29 * (float)var14[var23] + (float)var15[var23] * var30) * 0.0026041667442768812f;
                    statePc = 156;
                    continue stateLoop;
                }
                case 156: {
                    stackIn_159_0 = var31;
                    stackIn_157_0 = stackIn_159_0;
                    stackIn_159_1 = var18;
                    stackIn_157_1 = stackIn_159_1;
                    if (0.0f <= var18) {
                        statePc = 159;
                    } else {
                        statePc = 157;
                    }
                    continue stateLoop;
                }
                case 157: {
                    stackIn_160_0 = stackIn_157_0;
                    stackIn_160_1 = stackIn_157_1;
                    stackIn_160_2 = var33;
                    statePc = 160;
                    continue stateLoop;
                }
                case 159: {
                    stackIn_160_0 = stackIn_159_0;
                    stackIn_160_1 = stackIn_159_1;
                    stackIn_160_2 = var32;
                    statePc = 160;
                    continue stateLoop;
                }
                case 160: {
                    var19_float = stackIn_160_0 + stackIn_160_1 * stackIn_160_2;
                    var25 = (int)(var20_float * var19_float);
                    var26 = (int)(var19_float * var21);
                    if ((var25 ^ -1) > -1) {
                        statePc = 167;
                    } else {
                        statePc = 161;
                    }
                    continue stateLoop;
                }
                case 161: {
                    if (255 < var25) {
                        statePc = 166;
                    } else {
                        statePc = 168;
                    }
                    continue stateLoop;
                }
                case 166: {
                    var25 = 255;
                    statePc = 168;
                    continue stateLoop;
                }
                case 167: {
                    var25 = 0;
                    statePc = 168;
                    continue stateLoop;
                }
                case 168: {
                    var27 = (int)(var19_float * var22);
                    if ((var26 ^ -1) > -1) {
                        statePc = 175;
                    } else {
                        statePc = 169;
                    }
                    continue stateLoop;
                }
                case 169: {
                    if (255 < var26) {
                        statePc = 174;
                    } else {
                        statePc = 176;
                    }
                    continue stateLoop;
                }
                case 174: {
                    var26 = 255;
                    statePc = 176;
                    continue stateLoop;
                }
                case 175: {
                    var26 = 0;
                    statePc = 176;
                    continue stateLoop;
                }
                case 176: {
                    if (var27 < 0) {
                        statePc = 181;
                    } else {
                        statePc = 177;
                    }
                    continue stateLoop;
                }
                case 177: {
                    if (var27 <= 255) {
                        statePc = 182;
                    } else {
                        statePc = 180;
                    }
                    continue stateLoop;
                }
                case 180: {
                    var27 = 255;
                    statePc = 182;
                    continue stateLoop;
                }
                case 181: {
                    var27 = 0;
                    statePc = 182;
                    continue stateLoop;
                }
                case 182: {
                    var12.field_h = var23 * var7 + var9;
                    var12.i(var25, param0 + 0);
                    var12.i(var26, param0 ^ 0);
                    var12.i(var27, 0);
                    var12.i(255 - (255 & this.field_o[var34]), param0 + 0);
                    var23 = this.field_hb[var34];
                    var17_int = (short)var16[var23];
                    if (-1 == (var17_int ^ -1)) {
                        statePc = 184;
                    } else {
                        statePc = 183;
                    }
                    continue stateLoop;
                }
                case 183: {
                    var18 = ((float)var15[var23] * var30 + (var29 * (float)var14[var23] + var28 * (float)var13[var23])) / (float)(var17_int * 256);
                    statePc = 185;
                    continue stateLoop;
                }
                case 184: {
                    var18 = 0.0026041667442768812f * ((float)var13[var23] * var28 + var29 * (float)var14[var23] + (float)var15[var23] * var30);
                    statePc = 185;
                    continue stateLoop;
                }
                case 185: {
                    if (0.0f <= var18) {
                        statePc = 188;
                    } else {
                        statePc = 186;
                    }
                    continue stateLoop;
                }
                case 186: {
                    stackIn_189_0 = var33;
                    statePc = 189;
                    continue stateLoop;
                }
                case 188: {
                    stackIn_189_0 = var32;
                    statePc = 189;
                    continue stateLoop;
                }
                case 189: {
                    var19_float = stackIn_189_0 * var18 + var31;
                    var25 = (int)(var19_float * var20_float);
                    var26 = (int)(var19_float * var21);
                    if ((var25 ^ -1) > -1) {
                        statePc = 194;
                    } else {
                        statePc = 190;
                    }
                    continue stateLoop;
                }
                case 190: {
                    if ((var25 ^ -1) >= -256) {
                        statePc = 195;
                    } else {
                        statePc = 193;
                    }
                    continue stateLoop;
                }
                case 193: {
                    var25 = 255;
                    statePc = 195;
                    continue stateLoop;
                }
                case 194: {
                    var25 = 0;
                    statePc = 195;
                    continue stateLoop;
                }
                case 195: {
                    var27 = (int)(var22 * var19_float);
                    if ((var26 ^ -1) <= -1) {
                        statePc = 197;
                    } else {
                        statePc = 196;
                    }
                    continue stateLoop;
                }
                case 196: {
                    var26 = 0;
                    statePc = 203;
                    continue stateLoop;
                }
                case 197: {
                    if ((var26 ^ -1) < -256) {
                        statePc = 202;
                    } else {
                        statePc = 203;
                    }
                    continue stateLoop;
                }
                case 202: {
                    var26 = 255;
                    statePc = 203;
                    continue stateLoop;
                }
                case 203: {
                    if (0 <= var27) {
                        statePc = 205;
                    } else {
                        statePc = 204;
                    }
                    continue stateLoop;
                }
                case 204: {
                    var27 = 0;
                    statePc = 209;
                    continue stateLoop;
                }
                case 205: {
                    if (-256 <= (var27 ^ -1)) {
                        statePc = 209;
                    } else {
                        statePc = 208;
                    }
                    continue stateLoop;
                }
                case 208: {
                    var27 = 255;
                    statePc = 209;
                    continue stateLoop;
                }
                case 209: {
                    var12.field_h = var9 + var7 * var23;
                    var12.i(var25, 0);
                    var12.i(var26, 0);
                    var12.i(var27, 0);
                    var12.i(-(this.field_o[var34] & 255) + 255, 0);
                    var34++;
                    statePc = 122;
                    continue stateLoop;
                }
                case 210: {
                    stackIn_211_0 = var4;
                    statePc = 211;
                    continue stateLoop;
                }
                case 211: {
                    if (stackIn_211_0 == 0) {
                        statePc = 237;
                    } else {
                        statePc = 212;
                    }
                    continue stateLoop;
                }
                case 212: {
                    if (null == this.field_i) {
                        statePc = 216;
                    } else {
                        statePc = 215;
                    }
                    continue stateLoop;
                }
                case 215: {
                    var13 = this.field_i.field_d;
                    var16 = this.field_i.field_e;
                    var15 = this.field_i.field_f;
                    var14 = this.field_i.field_b;
                    statePc = 217;
                    continue stateLoop;
                }
                case 216: {
                    var15 = this.field_cb;
                    var14 = this.field_Y;
                    var13 = this.field_E;
                    var16 = this.field_O;
                    statePc = 217;
                    continue stateLoop;
                }
                case 217: {
                    var17 = 3.0f / (float)this.field_h;
                    var12.field_h = var10;
                    var18 = 3.0f / (float)(this.field_h + this.field_h / 2);
                    if (this.field_R.field_O) {
                        statePc = 228;
                    } else {
                        statePc = 218;
                    }
                    continue stateLoop;
                }
                case 218: {
                    var19 = 0;
                    statePc = 219;
                    continue stateLoop;
                }
                case 219: {
                    if ((this.field_L ^ -1) >= (var19 ^ -1)) {
                        statePc = 237;
                    } else {
                        statePc = 220;
                    }
                    continue stateLoop;
                }
                case 220: {
                    var20 = 255 & var16[var19];
                    if (-1 == (var20 ^ -1)) {
                        statePc = 224;
                    } else {
                        statePc = 223;
                    }
                    continue stateLoop;
                }
                case 223: {
                    var21 = var17 / (float)var20;
                    var12.a((byte) 114, var21 * (float)var13[var19]);
                    var12.a((byte) 114, (float)var14[var19] * var21);
                    var12.a((byte) 114, (float)var15[var19] * var21);
                    statePc = 226;
                    continue stateLoop;
                }
                case 224: {
                    var12.a((byte) 114, var18 * (float)var13[var19]);
                    var12.a((byte) 114, (float)var14[var19] * var18);
                    var12.a((byte) 114, (float)var15[var19] * var18);
                    statePc = 226;
                    continue stateLoop;
                }
                case 226: {
                    var12.field_h = var12.field_h + (-12 + var7);
                    var19++;
                    statePc = 219;
                    continue stateLoop;
                }
                case 228: {
                    var19 = 0;
                    statePc = 229;
                    continue stateLoop;
                }
                case 229: {
                    if (this.field_L <= var19) {
                        statePc = 237;
                    } else {
                        statePc = 230;
                    }
                    continue stateLoop;
                }
                case 230: {
                    var20 = var16[var19] & 255;
                    if ((var20 ^ -1) == -1) {
                        statePc = 234;
                    } else {
                        statePc = 233;
                    }
                    continue stateLoop;
                }
                case 233: {
                    var21 = var17 / (float)var20;
                    var12.a(17133, var21 * (float)var13[var19]);
                    var12.a(17133, (float)var14[var19] * var21);
                    var12.a(param0 + 17133, var21 * (float)var15[var19]);
                    statePc = 236;
                    continue stateLoop;
                }
                case 234: {
                    var12.a(17133, (float)var13[var19] * var18);
                    var12.a(17133, (float)var14[var19] * var18);
                    var12.a(17133, (float)var15[var19] * var18);
                    statePc = 236;
                    continue stateLoop;
                }
                case 236: {
                    var12.field_h = var12.field_h + (-12 + var7);
                    var19++;
                    statePc = 229;
                    continue stateLoop;
                }
                case 237: {
                    if (var6 != 0) {
                        statePc = 239;
                    } else {
                        statePc = 251;
                    }
                    continue stateLoop;
                }
                case 239: {
                    var12.field_h = var11;
                    if (!this.field_R.field_O) {
                        statePc = 246;
                    } else {
                        statePc = 240;
                    }
                    continue stateLoop;
                }
                case 240: {
                    var13_int = 0;
                    statePc = 241;
                    continue stateLoop;
                }
                case 241: {
                    if ((this.field_L ^ -1) >= (var13_int ^ -1)) {
                        statePc = 251;
                    } else {
                        statePc = 242;
                    }
                    continue stateLoop;
                }
                case 242: {
                    var12.a(17133, this.field_n[var13_int]);
                    var12.a(17133, this.field_y[var13_int]);
                    var12.field_h = var12.field_h + (var7 + -8);
                    var13_int++;
                    statePc = 241;
                    continue stateLoop;
                }
                case 246: {
                    var13_int = 0;
                    statePc = 247;
                    continue stateLoop;
                }
                case 247: {
                    if (this.field_L <= var13_int) {
                        statePc = 251;
                    } else {
                        statePc = 248;
                    }
                    continue stateLoop;
                }
                case 248: {
                    var12.a((byte) 114, this.field_n[var13_int]);
                    var12.a((byte) 114, this.field_y[var13_int]);
                    var12.field_h = var12.field_h + (-8 + var7);
                    var13_int++;
                    statePc = 247;
                    continue stateLoop;
                }
                case 251: {
                    var12.field_h = this.field_L * var7;
                    if (!param1) {
                        statePc = 261;
                    } else {
                        statePc = 252;
                    }
                    continue stateLoop;
                }
                case 252: {
                    if (this.field_Q == null) {
                        statePc = 258;
                    } else {
                        statePc = 255;
                    }
                    continue stateLoop;
                }
                case 255: {
                    this.field_Q.a(var7, var12.field_h, (byte) -112, var12.field_g);
                    statePc = 260;
                    continue stateLoop;
                }
                case 258: {
                    this.field_Q = this.field_R.a(var12.field_h, var12.field_g, var7, true, (byte) 117);
                    statePc = 260;
                    continue stateLoop;
                }
                case 260: {
                    this.field_Z = (byte) 0;
                    var13_ref = this.field_Q;
                    statePc = 262;
                    continue stateLoop;
                }
                case 261: {
                    var13_ref = this.field_R.a(var12.field_h, var12.field_g, var7, false, (byte) 99);
                    this.field_gb = true;
                    statePc = 262;
                    continue stateLoop;
                }
                case 262: {
                    if (var5 != 0) {
                        statePc = 265;
                    } else {
                        statePc = 266;
                    }
                    continue stateLoop;
                }
                case 265: {
                    this.field_g.field_g = (byte) var8;
                    this.field_g.field_d = var13_ref;
                    statePc = 266;
                    continue stateLoop;
                }
                case 266: {
                    if (var6 == 0) {
                        statePc = 269;
                    } else {
                        statePc = 267;
                    }
                    continue stateLoop;
                }
                case 267: {
                    this.field_ab.field_g = (byte) var11;
                    this.field_ab.field_d = var13_ref;
                    statePc = 269;
                    continue stateLoop;
                }
                case 269: {
                    if (var3_int == 0) {
                        statePc = 272;
                    } else {
                        statePc = 270;
                    }
                    continue stateLoop;
                }
                case 270: {
                    this.field_kb.field_g = (byte) var9;
                    this.field_kb.field_d = var13_ref;
                    statePc = 272;
                    continue stateLoop;
                }
                case 272: {
                    if (var4 == 0) {
                        statePc = 277;
                    } else {
                        statePc = 273;
                    }
                    continue stateLoop;
                }
                case 273: {
                    this.field_F.field_d = var13_ref;
                    this.field_F.field_g = (byte) var10;
                    statePc = 277;
                    continue stateLoop;
                }
                case 277: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final void a() {
    }

    private final void a(boolean param0) {
        Object stackIn_14_0 = null;
        Object stackIn_16_0 = null;
        int stackIn_16_1 = 0;
        Object stackIn_17_0 = null;
        int stackIn_17_1 = 0;
        int stackIn_17_2 = 0;
        cka stackIn_24_0 = null;
        int stackIn_24_1 = 0;
        cka stackIn_25_0 = null;
        int stackIn_25_1 = 0;
        int stackIn_25_2 = 0;
        cka stackIn_36_0 = null;
        int stackIn_36_1 = 0;
        cka stackIn_37_0 = null;
        int stackIn_37_1 = 0;
        int stackIn_37_2 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        var7 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            if (this.field_ib == 0) {
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L1: {
                if (this.field_Z == 0) {
                  break L1;
                } else {
                  this.a(0, true);
                  break L1;
                }
              }
              L2: {
                this.a(0, param0);
                if (this.field_w != null) {
                  L3: {
                    if (null != this.field_w.field_a) {
                      break L3;
                    } else {
                      L4: {
                        stackIn_16_0 = this;

                        stackIn_16_1 = -24;

                        if (0 == (this.field_Z & 16)) {
                          stackIn_17_0 = this;
                          stackIn_17_1 = stackIn_16_1;
                          stackIn_17_2 = 0;
                          break L4;
                        } else {
                          stackIn_14_0 = this;

                          stackIn_17_0 = this;
                          stackIn_17_1 = stackIn_16_1;
                          stackIn_17_2 = 1;
                          break L4;
                        }
                      }
                      this.a((byte) stackIn_17_1, stackIn_17_2 != 0);
                      break L3;
                    }
                  }
                  if (this.field_w.field_a == null) {
                    break L2;
                  } else {
                    L5: {
                      stackIn_24_0 = this.field_R;

                      stackIn_24_1 = 96;

                      if (this.field_F == null) {
                        stackIn_25_0 = (cka) ((Object) stackIn_24_0);
                        stackIn_25_1 = stackIn_24_1;
                        stackIn_25_2 = 0;
                        break L5;
                      } else {


                        stackIn_25_0 = (cka) ((Object) stackIn_24_0);
                        stackIn_25_1 = stackIn_24_1;
                        stackIn_25_2 = 1;
                        break L5;
                      }
                    }
                    ((cka) (Object) stackIn_25_0).a(stackIn_25_1, stackIn_25_2 != 0);
                    this.field_R.a(this.field_kb, this.field_ab, this.field_F, -120, this.field_g);
                    var2_int = -1 + this.field_p.length;
                    var3 = 0;
                    L6: while (true) {
                      if ((var3 ^ -1) <= (var2_int ^ -1)) {
                        break L2;
                      } else {
                        L7: {
                          var4 = this.field_p[var3];
                          var5 = this.field_p[1 + var3];
                          var6 = 65535 & this.field_I[var4];
                          if ((var6 ^ -1) == -65536) {
                            var6 = -1;
                            break L7;
                          } else {
                            break L7;
                          }
                        }
                        L8: {
                          stackIn_36_0 = this.field_R;

                          stackIn_36_1 = 70;

                          if (null == this.field_F) {
                            stackIn_37_0 = (cka) ((Object) stackIn_36_0);
                            stackIn_37_1 = stackIn_36_1;
                            stackIn_37_2 = 0;
                            break L8;
                          } else {
                            stackIn_37_0 = (cka) ((Object) stackIn_36_0);
                            stackIn_37_1 = stackIn_36_1;
                            stackIn_37_2 = 1;
                            break L8;
                          }
                        }
                        ((cka) (Object) stackIn_37_0).a((byte) stackIn_37_1, stackIn_37_2 != 0, var6);
                        this.field_R.a(3 * var4, 4, -513, this.field_w.field_a, 3 * (var5 - var4));
                        var3++;
                        continue L6;
                      }
                    }
                  }
                } else {
                  break L2;
                }
              }
              this.c((byte) 31);
              decompiledRegionSelector0 = 1;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw tba.a((Throwable) ((Object) var2), "np.L(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
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
              if (var4_int >= this.field_lb) {
                L2: {
                  this.field_l = false;
                  if (this.field_g == null) {
                    break L2;
                  } else {
                    this.field_g.field_d = null;
                    break L2;
                  }
                }
                break L0;
              } else {
                L3: {
                  if (param0 == 128) {
                    break L3;
                  } else {
                    this.field_P[var4_int] = param0 * this.field_P[var4_int] >> -704502937;
                    break L3;
                  }
                }
                L4: {
                  if (-129 == (param1 ^ -1)) {
                    break L4;
                  } else {
                    this.field_K[var4_int] = param1 * this.field_K[var4_int] >> 1965436231;
                    break L4;
                  }
                }
                L5: {
                  if (param2 != 128) {
                    this.field_A[var4_int] = this.field_A[var4_int] * param2 >> 1714908615;
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
          throw tba.a((Throwable) ((Object) runtimeException), "np.O(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final void a(int param0, int[] param1, int param2, int param3, int param4, int param5, boolean param6) {
        int stackIn_5_0 = 0;
        int stackIn_5_1 = 0;
        int stackIn_16_0 = 0;
        int stackIn_16_1 = 0;
        int stackIn_41_0 = 0;
        int stackIn_41_1 = 0;
        int stackIn_43_0 = 0;
        int stackIn_43_1 = 0;
        int stackIn_50_0 = 0;
        int stackIn_50_1 = 0;
        int stackIn_64_0 = 0;
        int stackIn_64_1 = 0;
        int stackIn_78_0 = 0;
        int stackIn_78_1 = 0;
        int stackIn_84_0 = 0;
        int stackIn_84_1 = 0;
        int stackIn_88_0 = 0;
        int stackIn_88_1 = 0;
        int stackIn_137_0 = 0;
        int stackIn_137_1 = 0;
        int stackIn_143_0 = 0;
        int stackIn_143_1 = 0;
        int stackIn_155_0 = 0;
        int stackIn_155_1 = 0;
        int stackIn_165_0 = 0;
        int stackIn_165_1 = 0;
        int stackIn_176_0 = 0;
        int stackIn_176_1 = 0;
        int stackIn_178_0 = 0;
        int stackIn_178_1 = 0;
        int stackIn_184_0 = 0;
        int stackIn_184_1 = 0;
        int stackIn_212_0 = 0;
        int stackIn_212_1 = 0;
        RuntimeException stackIn_267_0 = null;
        StringBuilder stackIn_267_1 = null;
        RuntimeException stackIn_269_0 = null;
        StringBuilder stackIn_269_1 = null;
        RuntimeException stackIn_270_0 = null;
        StringBuilder stackIn_270_1 = null;
        String stackIn_270_2 = null;
        int decompiledRegionSelector0 = 0;
        Throwable caughtException = null;
        int statePc = 0;
        int var8_int = 0;
        RuntimeException var8 = null;
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
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var21 = TombRacer.field_G ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    var8_int = param1.length;
                    if (0 != param0) {
                        statePc = 23;
                    } else {
                        statePc = 2;
                    }
                    continue stateLoop;
                }
                case 2: {
                    param4 = param4 << 4;
                    param3 = param3 << 4;
                    param2 = param2 << 4;
                    var9 = 0;
                    dj.field_b = 0;
                    rp.field_i = 0;
                    via.field_e = 0;
                    var10 = 0;
                    statePc = 3;
                    continue stateLoop;
                }
                case 3: {
                    if ((var8_int ^ -1) >= (var10 ^ -1)) {
                        statePc = 15;
                    } else {
                        statePc = 4;
                    }
                    continue stateLoop;
                }
                case 4: {
                    var11_int = param1[var10];
                    stackIn_16_0 = var11_int ^ -1;
                    stackIn_5_0 = stackIn_16_0;
                    stackIn_16_1 = this.field_d.length ^ -1;
                    stackIn_5_1 = stackIn_16_1;
                    if (false) {
                        statePc = 16;
                    } else {
                        statePc = 5;
                    }
                    continue stateLoop;
                }
                case 5: {
                    if (stackIn_5_0 > stackIn_5_1) {
                        statePc = 9;
                    } else {
                        statePc = 14;
                    }
                    continue stateLoop;
                }
                case 9: {
                    var12_ref_int__ = this.field_d[var11_int];
                    var13_int = 0;
                    statePc = 10;
                    continue stateLoop;
                }
                case 10: {
                    if ((var13_int ^ -1) <= (var12_ref_int__.length ^ -1)) {
                        statePc = 14;
                    } else {
                        statePc = 11;
                    }
                    continue stateLoop;
                }
                case 11: {
                    var14 = var12_ref_int__[var13_int];
                    rp.field_i = rp.field_i + this.field_P[var14];
                    via.field_e = via.field_e + this.field_K[var14];
                    var9++;
                    dj.field_b = dj.field_b + this.field_A[var14];
                    var13_int++;
                    statePc = 10;
                    continue stateLoop;
                }
                case 14: {
                    var10++;
                    statePc = 3;
                    continue stateLoop;
                }
                case 15: {
                    stackIn_16_0 = var9 ^ -1;
                    stackIn_16_1 = -1;
                    statePc = 16;
                    continue stateLoop;
                }
                case 16: {
                    if (stackIn_16_0 < stackIn_16_1) {
                        statePc = 20;
                    } else {
                        statePc = 17;
                    }
                    continue stateLoop;
                }
                case 17: {
                    rp.field_i = param2;
                    dj.field_b = param4;
                    via.field_e = param3;
                    statePc = 22;
                    continue stateLoop;
                }
                case 20: {
                    rp.field_i = param2 + rp.field_i / var9;
                    via.field_e = param3 + via.field_e / var9;
                    dj.field_b = dj.field_b / var9 + param4;
                    statePc = 22;
                    continue stateLoop;
                }
                case 22: {
                    return;
                }
                case 23: {
                    if (-2 == (param0 ^ -1)) {
                        statePc = 26;
                    } else {
                        statePc = 38;
                    }
                    continue stateLoop;
                }
                case 26: {
                    param2 = param2 << 4;
                    param3 = param3 << 4;
                    param4 = param4 << 4;
                    var9 = 0;
                    statePc = 27;
                    continue stateLoop;
                }
                case 27: {
                    if (var8_int <= var9) {
                        statePc = 37;
                    } else {
                        statePc = 28;
                    }
                    continue stateLoop;
                }
                case 28: {
                    var10 = param1[var9];
                    if ((var10 ^ -1) > (this.field_d.length ^ -1)) {
                        statePc = 31;
                    } else {
                        statePc = 36;
                    }
                    continue stateLoop;
                }
                case 31: {
                    var11 = this.field_d[var10];
                    var12 = 0;
                    statePc = 32;
                    continue stateLoop;
                }
                case 32: {
                    if (var12 >= var11.length) {
                        statePc = 36;
                    } else {
                        statePc = 33;
                    }
                    continue stateLoop;
                }
                case 33: {
                    var13_int = var11[var12];
                    this.field_P[var13_int] = this.field_P[var13_int] + param2;
                    this.field_K[var13_int] = this.field_K[var13_int] + param3;
                    this.field_A[var13_int] = this.field_A[var13_int] + param4;
                    var12++;
                    statePc = 32;
                    continue stateLoop;
                }
                case 36: {
                    var9++;
                    statePc = 27;
                    continue stateLoop;
                }
                case 37: {
                    return;
                }
                case 38: {
                    if (2 != param0) {
                        statePc = 115;
                    } else {
                        statePc = 39;
                    }
                    continue stateLoop;
                }
                case 39: {
                    var9 = 0;
                    statePc = 40;
                    continue stateLoop;
                }
                case 40: {
                    stackIn_41_0 = var9 ^ -1;
                    stackIn_41_1 = var8_int ^ -1;
                    statePc = 41;
                    continue stateLoop;
                }
                case 41: {
                    if (stackIn_41_0 <= stackIn_41_1) {
                        statePc = 75;
                    } else {
                        statePc = 42;
                    }
                    continue stateLoop;
                }
                case 42: {
                    var10 = param1[var9];
                    stackIn_78_0 = var10 ^ -1;
                    stackIn_43_0 = stackIn_78_0;
                    stackIn_78_1 = this.field_d.length ^ -1;
                    stackIn_43_1 = stackIn_78_1;
                    if (false) {
                        statePc = 78;
                    } else {
                        statePc = 43;
                    }
                    continue stateLoop;
                }
                case 43: {
                    if (stackIn_43_0 <= stackIn_43_1) {
                        statePc = 74;
                    } else {
                        statePc = 46;
                    }
                    continue stateLoop;
                }
                case 46: {
                    var11 = this.field_d[var10];
                    if ((param5 & 1 ^ -1) == -1) {
                        statePc = 61;
                    } else {
                        statePc = 47;
                    }
                    continue stateLoop;
                }
                case 47: {
                    var12 = 0;
                    statePc = 48;
                    continue stateLoop;
                }
                case 48: {
                    if ((var11.length ^ -1) >= (var12 ^ -1)) {
                        statePc = 74;
                    } else {
                        statePc = 49;
                    }
                    continue stateLoop;
                }
                case 49: {
                    var13_int = var11[var12];
                    this.field_P[var13_int] = this.field_P[var13_int] - rp.field_i;
                    this.field_K[var13_int] = this.field_K[var13_int] - via.field_e;
                    this.field_A[var13_int] = this.field_A[var13_int] - dj.field_b;
                    stackIn_41_0 = param2 ^ -1;
                    stackIn_50_0 = stackIn_41_0;
                    stackIn_41_1 = -1;
                    stackIn_50_1 = stackIn_41_1;
                    if (false) {
                        statePc = 41;
                    } else {
                        statePc = 50;
                    }
                    continue stateLoop;
                }
                case 50: {
                    if (stackIn_50_0 != stackIn_50_1) {
                        statePc = 52;
                    } else {
                        statePc = 53;
                    }
                    continue stateLoop;
                }
                case 52: {
                    var14 = qu.field_b[param2];
                    var15 = qu.field_d[param2];
                    var16 = -(this.field_A[var13_int] * var14) + (var15 * this.field_K[var13_int] - -16383) >> 736349710;
                    this.field_A[var13_int] = this.field_A[var13_int] * var15 + this.field_K[var13_int] * var14 - -16383 >> 1341804590;
                    this.field_K[var13_int] = var16;
                    statePc = 53;
                    continue stateLoop;
                }
                case 53: {
                    if (-1 != (param4 ^ -1)) {
                        statePc = 56;
                    } else {
                        statePc = 57;
                    }
                    continue stateLoop;
                }
                case 56: {
                    var14 = qu.field_b[param4];
                    var15 = qu.field_d[param4];
                    var16 = 16383 + var14 * this.field_K[var13_int] + this.field_P[var13_int] * var15 >> -366742706;
                    this.field_K[var13_int] = this.field_K[var13_int] * var15 + -(var14 * this.field_P[var13_int]) - -16383 >> -1507364914;
                    this.field_P[var13_int] = var16;
                    statePc = 57;
                    continue stateLoop;
                }
                case 57: {
                    if (-1 == (param3 ^ -1)) {
                        statePc = 59;
                    } else {
                        statePc = 58;
                    }
                    continue stateLoop;
                }
                case 58: {
                    var14 = qu.field_b[param3];
                    var15 = qu.field_d[param3];
                    var16 = 16383 + this.field_A[var13_int] * var14 - -(var15 * this.field_P[var13_int]) >> -2124998482;
                    this.field_A[var13_int] = 16383 + var15 * this.field_A[var13_int] + -(var14 * this.field_P[var13_int]) >> -1429602130;
                    this.field_P[var13_int] = var16;
                    statePc = 59;
                    continue stateLoop;
                }
                case 59: {
                    this.field_P[var13_int] = this.field_P[var13_int] + rp.field_i;
                    this.field_K[var13_int] = this.field_K[var13_int] + via.field_e;
                    this.field_A[var13_int] = this.field_A[var13_int] + dj.field_b;
                    var12++;
                    statePc = 48;
                    continue stateLoop;
                }
                case 61: {
                    var12 = 0;
                    statePc = 62;
                    continue stateLoop;
                }
                case 62: {
                    if (var11.length <= var12) {
                        statePc = 74;
                    } else {
                        statePc = 63;
                    }
                    continue stateLoop;
                }
                case 63: {
                    var13_int = var11[var12];
                    this.field_P[var13_int] = this.field_P[var13_int] - rp.field_i;
                    this.field_K[var13_int] = this.field_K[var13_int] - via.field_e;
                    this.field_A[var13_int] = this.field_A[var13_int] - dj.field_b;
                    stackIn_41_0 = 0;
                    stackIn_64_0 = stackIn_41_0;
                    stackIn_41_1 = param4;
                    stackIn_64_1 = stackIn_41_1;
                    if (false) {
                        statePc = 41;
                    } else {
                        statePc = 64;
                    }
                    continue stateLoop;
                }
                case 64: {
                    if (stackIn_64_0 != stackIn_64_1) {
                        statePc = 66;
                    } else {
                        statePc = 67;
                    }
                    continue stateLoop;
                }
                case 66: {
                    var14 = qu.field_b[param4];
                    var15 = qu.field_d[param4];
                    var16 = this.field_P[var13_int] * var15 + this.field_K[var13_int] * var14 + 16383 >> -784559026;
                    this.field_K[var13_int] = 16383 + (var15 * this.field_K[var13_int] + -(var14 * this.field_P[var13_int])) >> 1819046638;
                    this.field_P[var13_int] = var16;
                    statePc = 67;
                    continue stateLoop;
                }
                case 67: {
                    if ((param2 ^ -1) == -1) {
                        statePc = 69;
                    } else {
                        statePc = 68;
                    }
                    continue stateLoop;
                }
                case 68: {
                    var14 = qu.field_b[param2];
                    var15 = qu.field_d[param2];
                    var16 = var15 * this.field_K[var13_int] + -(var14 * this.field_A[var13_int]) + 16383 >> -912005810;
                    this.field_A[var13_int] = var14 * this.field_K[var13_int] - -(this.field_A[var13_int] * var15) + 16383 >> 738632942;
                    this.field_K[var13_int] = var16;
                    statePc = 69;
                    continue stateLoop;
                }
                case 69: {
                    if (0 != param3) {
                        statePc = 72;
                    } else {
                        statePc = 73;
                    }
                    continue stateLoop;
                }
                case 72: {
                    var14 = qu.field_b[param3];
                    var15 = qu.field_d[param3];
                    var16 = this.field_A[var13_int] * var14 - (-(var15 * this.field_P[var13_int]) - 16383) >> 1941960526;
                    this.field_A[var13_int] = -(var14 * this.field_P[var13_int]) + (this.field_A[var13_int] * var15 - -16383) >> 1573510862;
                    this.field_P[var13_int] = var16;
                    statePc = 73;
                    continue stateLoop;
                }
                case 73: {
                    this.field_P[var13_int] = this.field_P[var13_int] + rp.field_i;
                    this.field_K[var13_int] = this.field_K[var13_int] + via.field_e;
                    this.field_A[var13_int] = this.field_A[var13_int] + dj.field_b;
                    var12++;
                    statePc = 62;
                    continue stateLoop;
                }
                case 74: {
                    var9++;
                    statePc = 40;
                    continue stateLoop;
                }
                case 75: {
                    if (!param6) {
                        statePc = 114;
                    } else {
                        statePc = 76;
                    }
                    continue stateLoop;
                }
                case 76: {
                    var9 = 0;
                    statePc = 77;
                    continue stateLoop;
                }
                case 77: {
                    stackIn_78_0 = var9 ^ -1;
                    stackIn_78_1 = var8_int ^ -1;
                    statePc = 78;
                    continue stateLoop;
                }
                case 78: {
                    if (stackIn_78_0 <= stackIn_78_1) {
                        statePc = 105;
                    } else {
                        statePc = 79;
                    }
                    continue stateLoop;
                }
                case 79: {
                    var10 = param1[var9];
                    if ((var10 ^ -1) <= (this.field_d.length ^ -1)) {
                        statePc = 104;
                    } else {
                        statePc = 82;
                    }
                    continue stateLoop;
                }
                case 82: {
                    var11 = this.field_d[var10];
                    var12 = 0;
                    statePc = 83;
                    continue stateLoop;
                }
                case 83: {
                    stackIn_84_0 = var12;
                    stackIn_84_1 = var11.length;
                    statePc = 84;
                    continue stateLoop;
                }
                case 84: {
                    if (stackIn_84_0 >= stackIn_84_1) {
                        statePc = 104;
                    } else {
                        statePc = 85;
                    }
                    continue stateLoop;
                }
                case 85: {
                    var13_int = var11[var12];
                    var14 = this.field_e[var13_int];
                    var15 = this.field_e[1 + var13_int];
                    var16 = var14;
                    statePc = 86;
                    continue stateLoop;
                }
                case 86: {
                    if ((var16 ^ -1) <= (var15 ^ -1)) {
                        statePc = 103;
                    } else {
                        statePc = 87;
                    }
                    continue stateLoop;
                }
                case 87: {
                    var17 = -1 + this.field_q[var16];
                    stackIn_84_0 = -1;
                    stackIn_88_0 = stackIn_84_0;
                    stackIn_84_1 = var17;
                    stackIn_88_1 = stackIn_84_1;
                    if (false) {
                        statePc = 84;
                    } else {
                        statePc = 88;
                    }
                    continue stateLoop;
                }
                case 88: {
                    if (stackIn_88_0 != stackIn_88_1) {
                        statePc = 92;
                    } else {
                        statePc = 103;
                    }
                    continue stateLoop;
                }
                case 92: {
                    if ((param4 ^ -1) != -1) {
                        statePc = 97;
                    } else {
                        statePc = 98;
                    }
                    continue stateLoop;
                }
                case 97: {
                    var18 = qu.field_b[param4];
                    var19 = qu.field_d[param4];
                    var20 = 16383 + var19 * this.field_E[var17] + this.field_Y[var17] * var18 >> 159574446;
                    this.field_Y[var17] = (short)(var19 * this.field_Y[var17] + -(var18 * this.field_E[var17]) - -16383 >> 2116617550);
                    this.field_E[var17] = (short)var20;
                    statePc = 98;
                    continue stateLoop;
                }
                case 98: {
                    if ((param2 ^ -1) == -1) {
                        statePc = 100;
                    } else {
                        statePc = 99;
                    }
                    continue stateLoop;
                }
                case 99: {
                    var18 = qu.field_b[param2];
                    var19 = qu.field_d[param2];
                    var20 = 16383 + this.field_Y[var17] * var19 + -(var18 * this.field_cb[var17]) >> -1509749106;
                    this.field_cb[var17] = (short)(this.field_Y[var17] * var18 + var19 * this.field_cb[var17] + 16383 >> 1351990446);
                    this.field_Y[var17] = (short)var20;
                    statePc = 100;
                    continue stateLoop;
                }
                case 100: {
                    if (-1 == (param3 ^ -1)) {
                        statePc = 102;
                    } else {
                        statePc = 101;
                    }
                    continue stateLoop;
                }
                case 101: {
                    var18 = qu.field_b[param3];
                    var19 = qu.field_d[param3];
                    var20 = 16383 + (var19 * this.field_E[var17] + var18 * this.field_cb[var17]) >> -714860658;
                    this.field_cb[var17] = (short)(16383 + var19 * this.field_cb[var17] + -(var18 * this.field_E[var17]) >> 1830236110);
                    this.field_E[var17] = (short)var20;
                    statePc = 102;
                    continue stateLoop;
                }
                case 102: {
                    var16++;
                    statePc = 86;
                    continue stateLoop;
                }
                case 103: {
                    var12++;
                    statePc = 83;
                    continue stateLoop;
                }
                case 104: {
                    var9++;
                    statePc = 77;
                    continue stateLoop;
                }
                case 105: {
                    if (this.field_F != null) {
                        statePc = 111;
                    } else {
                        statePc = 106;
                    }
                    continue stateLoop;
                }
                case 106: {
                    if (this.field_kb == null) {
                        statePc = 111;
                    } else {
                        statePc = 109;
                    }
                    continue stateLoop;
                }
                case 109: {
                    this.field_kb.field_d = null;
                    statePc = 111;
                    continue stateLoop;
                }
                case 111: {
                    if (null == this.field_F) {
                        statePc = 114;
                    } else {
                        statePc = 112;
                    }
                    continue stateLoop;
                }
                case 112: {
                    this.field_F.field_d = null;
                    statePc = 114;
                    continue stateLoop;
                }
                case 114: {
                    return;
                }
                case 115: {
                    if (-4 == (param0 ^ -1)) {
                        statePc = 118;
                    } else {
                        statePc = 130;
                    }
                    continue stateLoop;
                }
                case 118: {
                    var9 = 0;
                    statePc = 119;
                    continue stateLoop;
                }
                case 119: {
                    if (var8_int <= var9) {
                        statePc = 129;
                    } else {
                        statePc = 120;
                    }
                    continue stateLoop;
                }
                case 120: {
                    var10 = param1[var9];
                    if (this.field_d.length > var10) {
                        statePc = 123;
                    } else {
                        statePc = 128;
                    }
                    continue stateLoop;
                }
                case 123: {
                    var11 = this.field_d[var10];
                    var12 = 0;
                    statePc = 124;
                    continue stateLoop;
                }
                case 124: {
                    if (var11.length <= var12) {
                        statePc = 128;
                    } else {
                        statePc = 125;
                    }
                    continue stateLoop;
                }
                case 125: {
                    var13_int = var11[var12];
                    this.field_P[var13_int] = this.field_P[var13_int] - rp.field_i;
                    this.field_K[var13_int] = this.field_K[var13_int] - via.field_e;
                    this.field_A[var13_int] = this.field_A[var13_int] - dj.field_b;
                    this.field_P[var13_int] = param2 * this.field_P[var13_int] >> 22298791;
                    this.field_K[var13_int] = this.field_K[var13_int] * param3 >> -380331321;
                    this.field_A[var13_int] = param4 * this.field_A[var13_int] >> 594812679;
                    this.field_P[var13_int] = this.field_P[var13_int] + rp.field_i;
                    this.field_K[var13_int] = this.field_K[var13_int] + via.field_e;
                    this.field_A[var13_int] = this.field_A[var13_int] + dj.field_b;
                    var12++;
                    statePc = 124;
                    continue stateLoop;
                }
                case 128: {
                    var9++;
                    statePc = 119;
                    continue stateLoop;
                }
                case 129: {
                    return;
                }
                case 130: {
                    if (5 != param0) {
                        statePc = 168;
                    } else {
                        statePc = 131;
                    }
                    continue stateLoop;
                }
                case 131: {
                    if (this.field_j == null) {
                        statePc = 167;
                    } else {
                        statePc = 134;
                    }
                    continue stateLoop;
                }
                case 134: {
                    var9 = 0;
                    statePc = 135;
                    continue stateLoop;
                }
                case 135: {
                    if ((var8_int ^ -1) >= (var9 ^ -1)) {
                        statePc = 162;
                    } else {
                        statePc = 136;
                    }
                    continue stateLoop;
                }
                case 136: {
                    var10 = param1[var9];
                    stackIn_165_0 = this.field_j.length ^ -1;
                    stackIn_137_0 = stackIn_165_0;
                    stackIn_165_1 = var10 ^ -1;
                    stackIn_137_1 = stackIn_165_1;
                    if (false) {
                        statePc = 165;
                    } else {
                        statePc = 137;
                    }
                    continue stateLoop;
                }
                case 137: {
                    if (stackIn_137_0 >= stackIn_137_1) {
                        statePc = 161;
                    } else {
                        statePc = 140;
                    }
                    continue stateLoop;
                }
                case 140: {
                    var11 = this.field_j[var10];
                    var12 = 0;
                    statePc = 141;
                    continue stateLoop;
                }
                case 141: {
                    if (var12 >= var11.length) {
                        statePc = 154;
                    } else {
                        statePc = 142;
                    }
                    continue stateLoop;
                }
                case 142: {
                    var13_int = var11[var12];
                    var14 = 8 * param2 + (255 & this.field_o[var13_int]);
                    stackIn_155_0 = 0;
                    stackIn_143_0 = stackIn_155_0;
                    stackIn_155_1 = var14;
                    stackIn_143_1 = stackIn_155_1;
                    if (false) {
                        statePc = 155;
                    } else {
                        statePc = 143;
                    }
                    continue stateLoop;
                }
                case 143: {
                    if (stackIn_143_0 > stackIn_143_1) {
                        statePc = 152;
                    } else {
                        statePc = 146;
                    }
                    continue stateLoop;
                }
                case 146: {
                    if ((var14 ^ -1) < -256) {
                        statePc = 151;
                    } else {
                        statePc = 153;
                    }
                    continue stateLoop;
                }
                case 151: {
                    var14 = 255;
                    statePc = 153;
                    continue stateLoop;
                }
                case 152: {
                    var14 = 0;
                    statePc = 153;
                    continue stateLoop;
                }
                case 153: {
                    this.field_o[var13_int] = (byte)var14;
                    var12++;
                    statePc = 141;
                    continue stateLoop;
                }
                case 154: {
                    stackIn_155_0 = 0;
                    stackIn_155_1 = var11.length;
                    statePc = 155;
                    continue stateLoop;
                }
                case 155: {
                    if (stackIn_155_0 >= stackIn_155_1) {
                        statePc = 161;
                    } else {
                        statePc = 156;
                    }
                    continue stateLoop;
                }
                case 156: {
                    if (this.field_kb == null) {
                        statePc = 161;
                    } else {
                        statePc = 159;
                    }
                    continue stateLoop;
                }
                case 159: {
                    this.field_kb.field_d = null;
                    statePc = 161;
                    continue stateLoop;
                }
                case 161: {
                    var9++;
                    statePc = 135;
                    continue stateLoop;
                }
                case 162: {
                    if (null == this.field_r) {
                        statePc = 167;
                    } else {
                        statePc = 163;
                    }
                    continue stateLoop;
                }
                case 163: {
                    var9 = 0;
                    statePc = 164;
                    continue stateLoop;
                }
                case 164: {
                    stackIn_165_0 = this.field_G ^ -1;
                    stackIn_165_1 = var9 ^ -1;
                    statePc = 165;
                    continue stateLoop;
                }
                case 165: {
                    if (stackIn_165_0 >= stackIn_165_1) {
                        statePc = 167;
                    } else {
                        statePc = 166;
                    }
                    continue stateLoop;
                }
                case 166: {
                    var10_ref_pm = this.field_r[var9];
                    var11_ref = this.field_f[var9];
                    var11_ref.field_c = var11_ref.field_c & 16777215 | -(this.field_o[var10_ref_pm.field_l] & 255) + 255 << -527710408;
                    var9++;
                    statePc = 164;
                    continue stateLoop;
                }
                case 167: {
                    return;
                }
                case 168: {
                    if (-8 != (param0 ^ -1)) {
                        statePc = 215;
                    } else {
                        statePc = 169;
                    }
                    continue stateLoop;
                }
                case 169: {
                    if (null != this.field_j) {
                        statePc = 174;
                    } else {
                        statePc = 214;
                    }
                    continue stateLoop;
                }
                case 174: {
                    var9 = 0;
                    statePc = 175;
                    continue stateLoop;
                }
                case 175: {
                    stackIn_176_0 = var8_int ^ -1;
                    stackIn_176_1 = var9 ^ -1;
                    statePc = 176;
                    continue stateLoop;
                }
                case 176: {
                    if (stackIn_176_0 >= stackIn_176_1) {
                        statePc = 207;
                    } else {
                        statePc = 177;
                    }
                    continue stateLoop;
                }
                case 177: {
                    var10 = param1[var9];
                    stackIn_212_0 = var10 ^ -1;
                    stackIn_178_0 = stackIn_212_0;
                    stackIn_212_1 = this.field_j.length ^ -1;
                    stackIn_178_1 = stackIn_212_1;
                    if (false) {
                        statePc = 212;
                    } else {
                        statePc = 178;
                    }
                    continue stateLoop;
                }
                case 178: {
                    if (stackIn_178_0 <= stackIn_178_1) {
                        statePc = 206;
                    } else {
                        statePc = 181;
                    }
                    continue stateLoop;
                }
                case 181: {
                    var11 = this.field_j[var10];
                    var12 = 0;
                    statePc = 182;
                    continue stateLoop;
                }
                case 182: {
                    if (var11.length <= var12) {
                        statePc = 199;
                    } else {
                        statePc = 183;
                    }
                    continue stateLoop;
                }
                case 183: {
                    var13_int = var11[var12];
                    var14 = this.field_X[var13_int] & 65535;
                    var15 = (var14 & 64694) >> 722944650;
                    var16 = (var14 & 1011) >> 156860359;
                    var16 = var16 + param3 / 4;
                    var15 = 63 & param2 + var15;
                    var17 = var14 & 127;
                    stackIn_176_0 = var16 ^ -1;
                    stackIn_184_0 = stackIn_176_0;
                    stackIn_176_1 = -1;
                    stackIn_184_1 = stackIn_176_1;
                    if (false) {
                        statePc = 176;
                    } else {
                        statePc = 184;
                    }
                    continue stateLoop;
                }
                case 184: {
                    if (stackIn_184_0 > stackIn_184_1) {
                        statePc = 191;
                    } else {
                        statePc = 185;
                    }
                    continue stateLoop;
                }
                case 185: {
                    if (var16 > 7) {
                        statePc = 190;
                    } else {
                        statePc = 192;
                    }
                    continue stateLoop;
                }
                case 190: {
                    var16 = 7;
                    statePc = 192;
                    continue stateLoop;
                }
                case 191: {
                    var16 = 0;
                    statePc = 192;
                    continue stateLoop;
                }
                case 192: {
                    var17 = var17 + param4;
                    if ((var17 ^ -1) <= -1) {
                        statePc = 194;
                    } else {
                        statePc = 193;
                    }
                    continue stateLoop;
                }
                case 193: {
                    var17 = 0;
                    statePc = 198;
                    continue stateLoop;
                }
                case 194: {
                    if (-128 <= (var17 ^ -1)) {
                        statePc = 198;
                    } else {
                        statePc = 197;
                    }
                    continue stateLoop;
                }
                case 197: {
                    var17 = 127;
                    statePc = 198;
                    continue stateLoop;
                }
                case 198: {
                    this.field_X[var13_int] = (short)fh.a(fh.a(var16 << 108042887, var15 << 1314691114), var17);
                    var12++;
                    statePc = 182;
                    continue stateLoop;
                }
                case 199: {
                    if (var11.length <= 0) {
                        statePc = 206;
                    } else {
                        statePc = 200;
                    }
                    continue stateLoop;
                }
                case 200: {
                    if (null != this.field_kb) {
                        statePc = 205;
                    } else {
                        statePc = 206;
                    }
                    continue stateLoop;
                }
                case 205: {
                    this.field_kb.field_d = null;
                    statePc = 206;
                    continue stateLoop;
                }
                case 206: {
                    var9++;
                    statePc = 175;
                    continue stateLoop;
                }
                case 207: {
                    if (this.field_r != null) {
                        statePc = 210;
                    } else {
                        statePc = 214;
                    }
                    continue stateLoop;
                }
                case 210: {
                    var9 = 0;
                    statePc = 211;
                    continue stateLoop;
                }
                case 211: {
                    stackIn_212_0 = this.field_G;
                    stackIn_212_1 = var9;
                    statePc = 212;
                    continue stateLoop;
                }
                case 212: {
                    if (stackIn_212_0 <= stackIn_212_1) {
                        statePc = 214;
                    } else {
                        statePc = 213;
                    }
                    continue stateLoop;
                }
                case 213: {
                    var10_ref_pm = this.field_r[var9];
                    var11_ref = this.field_f[var9];
                    var11_ref.field_c = 16777215 & cla.field_m[this.field_X[var10_ref_pm.field_l] & 65535] | -16777216 & var11_ref.field_c;
                    var9++;
                    statePc = 211;
                    continue stateLoop;
                }
                case 214: {
                    return;
                }
                case 215: {
                    if (param0 != 8) {
                        statePc = 229;
                    } else {
                        statePc = 216;
                    }
                    continue stateLoop;
                }
                case 216: {
                    if (null == this.field_C) {
                        statePc = 228;
                    } else {
                        statePc = 219;
                    }
                    continue stateLoop;
                }
                case 219: {
                    var9 = 0;
                    statePc = 220;
                    continue stateLoop;
                }
                case 220: {
                    if (var9 >= var8_int) {
                        statePc = 228;
                    } else {
                        statePc = 221;
                    }
                    continue stateLoop;
                }
                case 221: {
                    var10 = param1[var9];
                    if (this.field_C.length <= var10) {
                        statePc = 227;
                    } else {
                        statePc = 222;
                    }
                    continue stateLoop;
                }
                case 222: {
                    var11 = this.field_C[var10];
                    var12 = 0;
                    statePc = 223;
                    continue stateLoop;
                }
                case 223: {
                    if (var11.length <= var12) {
                        statePc = 227;
                    } else {
                        statePc = 224;
                    }
                    continue stateLoop;
                }
                case 224: {
                    var13 = this.field_f[var11[var12]];
                    var13.field_h = var13.field_h + param2;
                    var13.field_a = var13.field_a + param3;
                    var12++;
                    statePc = 223;
                    continue stateLoop;
                }
                case 227: {
                    var9++;
                    statePc = 220;
                    continue stateLoop;
                }
                case 228: {
                    return;
                }
                case 229: {
                    if (param0 != 10) {
                        statePc = 247;
                    } else {
                        statePc = 230;
                    }
                    continue stateLoop;
                }
                case 230: {
                    if (this.field_C != null) {
                        statePc = 235;
                    } else {
                        statePc = 246;
                    }
                    continue stateLoop;
                }
                case 235: {
                    var9 = 0;
                    statePc = 236;
                    continue stateLoop;
                }
                case 236: {
                    if ((var8_int ^ -1) >= (var9 ^ -1)) {
                        statePc = 246;
                    } else {
                        statePc = 237;
                    }
                    continue stateLoop;
                }
                case 237: {
                    var10 = param1[var9];
                    if ((var10 ^ -1) > (this.field_C.length ^ -1)) {
                        statePc = 240;
                    } else {
                        statePc = 245;
                    }
                    continue stateLoop;
                }
                case 240: {
                    var11 = this.field_C[var10];
                    var12 = 0;
                    statePc = 241;
                    continue stateLoop;
                }
                case 241: {
                    if ((var12 ^ -1) <= (var11.length ^ -1)) {
                        statePc = 245;
                    } else {
                        statePc = 242;
                    }
                    continue stateLoop;
                }
                case 242: {
                    var13 = this.field_f[var11[var12]];
                    var13.field_f = param3 * var13.field_f >> 1239691559;
                    var13.field_b = var13.field_b * param2 >> 873761959;
                    var12++;
                    statePc = 241;
                    continue stateLoop;
                }
                case 245: {
                    var9++;
                    statePc = 236;
                    continue stateLoop;
                }
                case 246: {
                    return;
                }
                case 247: {
                    if ((param0 ^ -1) != -10) {
                        statePc = 271;
                    } else {
                        statePc = 248;
                    }
                    continue stateLoop;
                }
                case 248: {
                    if (null != this.field_C) {
                        statePc = 253;
                    } else {
                        statePc = 264;
                    }
                    continue stateLoop;
                }
                case 253: {
                    var9 = 0;
                    statePc = 254;
                    continue stateLoop;
                }
                case 254: {
                    if ((var9 ^ -1) <= (var8_int ^ -1)) {
                        statePc = 264;
                    } else {
                        statePc = 255;
                    }
                    continue stateLoop;
                }
                case 255: {
                    var10 = param1[var9];
                    if ((this.field_C.length ^ -1) < (var10 ^ -1)) {
                        statePc = 258;
                    } else {
                        statePc = 263;
                    }
                    continue stateLoop;
                }
                case 258: {
                    var11 = this.field_C[var10];
                    var12 = 0;
                    statePc = 259;
                    continue stateLoop;
                }
                case 259: {
                    if (var11.length <= var12) {
                        statePc = 263;
                    } else {
                        statePc = 260;
                    }
                    continue stateLoop;
                }
                case 260: {
                    var13 = this.field_f[var11[var12]];
                    var13.field_g = 16383 & var13.field_g - -param2;
                    var12++;
                    statePc = 259;
                    continue stateLoop;
                }
                case 263: {
                    var9++;
                    statePc = 254;
                    continue stateLoop;
                }
                case 264: {
                    return;
                }
                case 271: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    public static void d(int param0) {
        try {
            field_V = null;
            int var1_int = -40 % ((56 - param0) / 48);
            field_J = null;
            field_m = null;
            field_x = null;
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "np.M(" + param0 + ')');
        }
    }

    final void wa() {
        int var1_int = 0;
        int var2 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        var2 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            var1_int = 0;
            L1: while (true) {
              if (var1_int >= this.field_N) {
                L2: {
                  if (null != this.field_g) {
                    this.field_g.field_d = null;
                    break L2;
                  } else {
                    break L2;
                  }
                }
                this.field_l = false;
                break L0;
              } else {
                this.field_P[var1_int] = this.field_P[var1_int] + 7 >> -1664264924;
                this.field_K[var1_int] = this.field_K[var1_int] + 7 >> 2011810308;
                this.field_A[var1_int] = 7 + this.field_A[var1_int] >> 1032846372;
                var1_int++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw tba.a((Throwable) ((Object) var1), "np.wa()");
        }
    }

    private final void c(byte param0) {
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        var5 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            if (!this.field_gb) {
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L1: {
                this.field_gb = false;
                if (null != this.field_D) {
                  break L1;
                } else {
                  if (this.field_t != null) {
                    break L1;
                  } else {
                    if (this.field_r != null) {
                      break L1;
                    } else {
                      if (!aw.c(-17275, this.field_u, this.field_bb)) {
                        L2: {
                          var2_int = 0;
                          var3 = 0;
                          if (null == this.field_P) {
                            break L2;
                          } else {
                            if (!uv.a(this.field_u, 1, this.field_bb)) {
                              L3: {
                                if (this.field_g == null) {
                                  break L3;
                                } else {
                                  if (this.field_g.field_d == null) {
                                    this.field_gb = true;
                                    break L2;
                                  } else {
                                    break L3;
                                  }
                                }
                              }
                              L4: {
                                if (this.field_l) {
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
                          if (null == this.field_K) {
                            break L5;
                          } else {
                            if (pt.a(-61, this.field_bb, this.field_u)) {
                              break L5;
                            } else {
                              L6: {
                                if (null == this.field_g) {
                                  break L6;
                                } else {
                                  if (null != this.field_g.field_d) {
                                    break L6;
                                  } else {
                                    this.field_gb = true;
                                    break L5;
                                  }
                                }
                              }
                              L7: {
                                if (this.field_l) {
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
                          if (this.field_A == null) {
                            break L8;
                          } else {
                            if (jc.c(this.field_u, -23717, this.field_bb)) {
                              break L8;
                            } else {
                              L9: {
                                if (this.field_g == null) {
                                  break L9;
                                } else {
                                  if (null == this.field_g.field_d) {
                                    this.field_gb = true;
                                    break L8;
                                  } else {
                                    break L9;
                                  }
                                }
                              }
                              L10: {
                                if (!this.field_l) {
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
                            this.field_K = null;
                            break L11;
                          }
                        }
                        L12: {
                          if (var4 == 0) {
                            break L12;
                          } else {
                            this.field_A = null;
                            break L12;
                          }
                        }
                        if (var2_int != 0) {
                          this.field_P = null;
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
                if (null == this.field_q) {
                  break L13;
                } else {
                  if (this.field_P != null) {
                    break L13;
                  } else {
                    if (null != this.field_K) {
                      break L13;
                    } else {
                      if (this.field_A == null) {
                        this.field_e = null;
                        this.field_q = null;
                        break L13;
                      } else {
                        break L13;
                      }
                    }
                  }
                }
              }
              L14: {
                if (this.field_O == null) {
                  break L14;
                } else {
                  if (!oea.a(this.field_bb, this.field_u, (byte) 115)) {
                    if (null == this.field_F) {
                      L15: {
                        if (null == this.field_kb) {
                          break L15;
                        } else {
                          if (this.field_kb.field_d == null) {
                            this.field_gb = true;
                            break L14;
                          } else {
                            break L15;
                          }
                        }
                      }
                      this.field_O = null;
                      this.field_cb = null;
                      this.field_Y = null;
                      this.field_E = null;
                      break L14;
                    } else {
                      if (this.field_F.field_d == null) {
                        this.field_gb = true;
                        break L14;
                      } else {
                        this.field_cb = null;
                        this.field_O = null;
                        this.field_E = null;
                        this.field_Y = null;
                        break L14;
                      }
                    }
                  } else {
                    break L14;
                  }
                }
              }
              L16: {
                var2_int = -95 % ((param0 - -49) / 55);
                if (null == this.field_X) {
                  break L16;
                } else {
                  if (!sm.a(2, this.field_bb, this.field_u)) {
                    L17: {
                      if (null == this.field_kb) {
                        break L17;
                      } else {
                        if (null == this.field_kb.field_d) {
                          this.field_gb = true;
                          break L16;
                        } else {
                          break L17;
                        }
                      }
                    }
                    this.field_X = null;
                    break L16;
                  } else {
                    break L16;
                  }
                }
              }
              L18: {
                if (this.field_o == null) {
                  break L18;
                } else {
                  if (!gda.b(107, this.field_u, this.field_bb)) {
                    L19: {
                      if (null == this.field_kb) {
                        break L19;
                      } else {
                        if (null == this.field_kb.field_d) {
                          this.field_gb = true;
                          break L18;
                        } else {
                          break L19;
                        }
                      }
                    }
                    this.field_o = null;
                    break L18;
                  } else {
                    break L18;
                  }
                }
              }
              L20: {
                if (null == this.field_n) {
                  break L20;
                } else {
                  if (!lva.a(this.field_bb, (byte) -21, this.field_u)) {
                    L21: {
                      if (null == this.field_ab) {
                        break L21;
                      } else {
                        if (this.field_ab.field_d == null) {
                          this.field_gb = true;
                          break L20;
                        } else {
                          break L21;
                        }
                      }
                    }
                    this.field_n = null;
                    this.field_y = null;
                    break L20;
                  } else {
                    break L20;
                  }
                }
              }
              L22: {
                if (null == this.field_I) {
                  break L22;
                } else {
                  if (in.a(this.field_bb, this.field_u, (byte) -115)) {
                    break L22;
                  } else {
                    L23: {
                      if (null == this.field_kb) {
                        break L23;
                      } else {
                        if (this.field_kb.field_d != null) {
                          break L23;
                        } else {
                          this.field_gb = true;
                          break L22;
                        }
                      }
                    }
                    this.field_I = null;
                    break L22;
                  }
                }
              }
              L24: {
                if (this.field_H == null) {
                  break L24;
                } else {
                  if (!ae.a(this.field_bb, this.field_u, 6100)) {
                    L25: {
                      L26: {
                        if (this.field_w == null) {
                          break L26;
                        } else {
                          if (this.field_w.field_a == null) {
                            break L25;
                          } else {
                            break L26;
                          }
                        }
                      }
                      L27: {
                        if (null == this.field_kb) {
                          break L27;
                        } else {
                          if (this.field_kb.field_d == null) {
                            break L25;
                          } else {
                            break L27;
                          }
                        }
                      }
                      this.field_z = null;
                      this.field_hb = null;
                      this.field_H = null;
                      break L24;
                    }
                    this.field_gb = true;
                    break L24;
                  } else {
                    break L24;
                  }
                }
              }
              L28: {
                if (this.field_j == null) {
                  break L28;
                } else {
                  if (!aw.d(-26571, this.field_bb, this.field_u)) {
                    this.field_j = (int[][]) null;
                    this.field_fb = null;
                    break L28;
                  } else {
                    break L28;
                  }
                }
              }
              L29: {
                if (null == this.field_d) {
                  break L29;
                } else {
                  if (!kda.b(this.field_bb, 124, this.field_u)) {
                    this.field_db = null;
                    this.field_d = (int[][]) null;
                    break L29;
                  } else {
                    break L29;
                  }
                }
              }
              L30: {
                if (null == this.field_C) {
                  break L30;
                } else {
                  if (!eo.a(this.field_u, (byte) -125, this.field_bb)) {
                    this.field_C = (int[][]) null;
                    break L30;
                  } else {
                    break L30;
                  }
                }
              }
              L31: {
                if (this.field_p == null) {
                  break L31;
                } else {
                  if ((this.field_bb & 2048 ^ -1) != -1) {
                    break L31;
                  } else {
                    if ((this.field_bb & 262144) != 0) {
                      break L31;
                    } else {
                      this.field_p = null;
                      break L31;
                    }
                  }
                }
              }
              decompiledRegionSelector0 = 1;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw tba.a((Throwable) ((Object) var2), "np.J(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    np(cka param0) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        this.field_L = 0;
        this.field_l = false;
        this.field_N = 0;
        this.field_s = false;
        this.field_gb = true;
        this.field_ib = 0;
        this.field_W = 0;
        this.field_lb = 0;
        try {
          L0: {
            this.field_R = param0;
            this.field_g = new tj((va) null, 5126, 3, 0);
            this.field_ab = new tj((va) null, 5126, 2, 0);
            this.field_F = new tj((va) null, 5126, 3, 0);
            this.field_kb = new tj((va) null, 5121, 4, 0);
            this.field_w = new afa();
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            runtimeException = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (runtimeException);

            stackIn_6_1 = new StringBuilder().append("np.<init>(");

            if (param0 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L1;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
              break L1;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ')');
        }
    }

    np(cka param0, oc param1, int param2, int param3, int param4, int param5) {
        int fieldTemp$0 = 0;
        short dupTemp$1 = 0;
        short dupTemp$2 = 0;
        short dupTemp$3 = 0;
        uo dupTemp$4 = null;
        int incrementValue$5 = 0;
        int[] array$6 = null;
        int dupTemp$7 = 0;
        int[] arrayValue$8 = null;
        int stackIn_47_0 = 0;
        int stackIn_49_0 = 0;
        int stackIn_49_1 = 0;
        int stackIn_58_0 = 0;
        int stackIn_58_1 = 0;
        int stackIn_104_0 = 0;
        int stackIn_126_0 = 0;
        int stackIn_126_1 = 0;
        int stackIn_134_0 = 0;
        int stackIn_134_1 = 0;
        int stackIn_138_0 = 0;
        int stackIn_138_1 = 0;
        int stackIn_140_0 = 0;
        int stackIn_140_1 = 0;
        int stackIn_141_0 = 0;
        int stackIn_141_1 = 0;
        int stackIn_141_2 = 0;
        int stackIn_156_0 = 0;
        int stackIn_156_1 = 0;
        int stackIn_172_0 = 0;
        int stackIn_172_1 = 0;
        int stackIn_179_0 = 0;
        int stackIn_200_0 = 0;
        int stackIn_299_0 = 0;
        int stackIn_301_0 = 0;
        int stackIn_302_0 = 0;
        int stackIn_302_1 = 0;
        int stackIn_314_0 = 0;
        int stackIn_314_1 = 0;
        int stackIn_321_0 = 0;
        int stackIn_321_1 = 0;
        int stackIn_323_0 = 0;
        int stackIn_323_1 = 0;
        int stackIn_344_0 = 0;
        int stackIn_344_1 = 0;
        int stackIn_350_0 = 0;
        int stackIn_360_0 = 0;
        RuntimeException stackIn_375_0 = null;
        StringBuilder stackIn_375_1 = null;
        RuntimeException stackIn_377_0 = null;
        StringBuilder stackIn_377_1 = null;
        RuntimeException stackIn_378_0 = null;
        StringBuilder stackIn_378_1 = null;
        String stackIn_378_2 = null;
        RuntimeException stackIn_379_0 = null;
        StringBuilder stackIn_379_1 = null;
        RuntimeException stackIn_381_0 = null;
        StringBuilder stackIn_381_1 = null;
        RuntimeException stackIn_382_0 = null;
        StringBuilder stackIn_382_1 = null;
        String stackIn_382_2 = null;
        Throwable caughtException = null;
        int statePc = 0;
        d var7 = null;
        RuntimeException var7_ref = null;
        int[] var8 = null;
        int var9_int = 0;
        long[] var9 = null;
        dw var10_ref_dw = null;
        int var10 = 0;
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
        pa var31_ref_pa = null;
        uo var31_ref_uo = null;
        int var31 = 0;
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
        float[] var38_ref_float__ = null;
        float var38 = 0.0f;
        int var39_int = 0;
        float var39 = 0.0f;
        float var40 = 0.0f;
        float var41 = 0.0f;
        float var42 = 0.0f;
        int var43_int = 0;
        float var43 = 0.0f;
        int var44_int = 0;
        float var44 = 0.0f;
        int var45_int = 0;
        float var45 = 0.0f;
        int var46_int = 0;
        float var46 = 0.0f;
        int var47_int = 0;
        float var47 = 0.0f;
        int var48_int = 0;
        float var48 = 0.0f;
        int var49_int = 0;
        float var49 = 0.0f;
        int var50_int = 0;
        float var50 = 0.0f;
        int var51_int = 0;
        float var51 = 0.0f;
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
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var63 = TombRacer.field_G ? 1 : 0;
                    this.field_L = 0;
                    this.field_l = false;
                    this.field_N = 0;
                    this.field_s = false;
                    this.field_gb = true;
                    this.field_ib = 0;
                    this.field_W = 0;
                    this.field_lb = 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    this.field_bb = param2;
                    this.field_R = param0;
                    this.field_u = param5;
                    if (!hha.a(param5, 0, param2)) {
                        statePc = 3;
                    } else {
                        statePc = 2;
                    }
                    continue stateLoop;
                }
                case 2: {
                    this.field_g = new tj((va) null, 5126, 3, 0);
                    statePc = 3;
                    continue stateLoop;
                }
                case 3: {
                    if (!wu.a(-17, param5, param2)) {
                        statePc = 6;
                    } else {
                        statePc = 4;
                    }
                    continue stateLoop;
                }
                case 4: {
                    this.field_ab = new tj((va) null, 5126, 2, 0);
                    statePc = 6;
                    continue stateLoop;
                }
                case 6: {
                    if (!kb.a(param5, param2, (byte) 17)) {
                        statePc = 9;
                    } else {
                        statePc = 7;
                    }
                    continue stateLoop;
                }
                case 7: {
                    this.field_F = new tj((va) null, 5126, 3, 0);
                    statePc = 9;
                    continue stateLoop;
                }
                case 9: {
                    if (we.b(param2, param5, 2048)) {
                        statePc = 12;
                    } else {
                        statePc = 13;
                    }
                    continue stateLoop;
                }
                case 12: {
                    this.field_kb = new tj((va) null, 5121, 4, 0);
                    statePc = 13;
                    continue stateLoop;
                }
                case 13: {
                    if (mm.a(-122, param2, param5)) {
                        statePc = 16;
                    } else {
                        statePc = 17;
                    }
                    continue stateLoop;
                }
                case 16: {
                    this.field_w = new afa();
                    statePc = 17;
                    continue stateLoop;
                }
                case 17: {
                    var7 = param0.field_c;
                    var8 = new int[param1.field_o];
                    this.field_e = new int[param1.field_L + 1];
                    var9_int = 0;
                    statePc = 18;
                    continue stateLoop;
                }
                case 18: {
                    if (param1.field_o <= var9_int) {
                        statePc = 43;
                    } else {
                        statePc = 19;
                    }
                    continue stateLoop;
                }
                case 19: {
                    if (param1.field_G == null) {
                        statePc = 25;
                    } else {
                        statePc = 22;
                    }
                    continue stateLoop;
                }
                case 22: {
                    if (2 == param1.field_G[var9_int]) {
                        statePc = 42;
                    } else {
                        statePc = 25;
                    }
                    continue stateLoop;
                }
                case 25: {
                    if (param1.field_r == null) {
                        statePc = 40;
                    } else {
                        statePc = 28;
                    }
                    continue stateLoop;
                }
                case 28: {
                    if (0 != (param1.field_r[var9_int] ^ -1)) {
                        statePc = 33;
                    } else {
                        statePc = 40;
                    }
                    continue stateLoop;
                }
                case 33: {
                    var10_ref_dw = var7.a((byte) 111, param1.field_r[var9_int] & 65535);
                    if ((64 & this.field_u) == 0) {
                        statePc = 37;
                    } else {
                        statePc = 34;
                    }
                    continue stateLoop;
                }
                case 34: {
                    if (var10_ref_dw.field_p) {
                        statePc = 40;
                    } else {
                        statePc = 37;
                    }
                    continue stateLoop;
                }
                case 37: {
                    if (var10_ref_dw.field_f) {
                        statePc = 42;
                    } else {
                        statePc = 40;
                    }
                    continue stateLoop;
                }
                case 40: {
                    fieldTemp$0 = this.field_W;
                    this.field_W = this.field_W + 1;
                    var8[fieldTemp$0] = var9_int;
                    dupTemp$1 = param1.field_a[var9_int];
                    this.field_e[dupTemp$1] = this.field_e[dupTemp$1] + 1;
                    dupTemp$2 = param1.field_t[var9_int];
                    this.field_e[dupTemp$2] = this.field_e[dupTemp$2] + 1;
                    dupTemp$3 = param1.field_J[var9_int];
                    this.field_e[dupTemp$3] = this.field_e[dupTemp$3] + 1;
                    statePc = 42;
                    continue stateLoop;
                }
                case 42: {
                    var9_int++;
                    statePc = 18;
                    continue stateLoop;
                }
                case 43: {
                    this.field_ib = this.field_W;
                    var9 = new long[this.field_W];
                    if ((this.field_bb & 256 ^ -1) == -1) {
                        statePc = 46;
                    } else {
                        statePc = 44;
                    }
                    continue stateLoop;
                }
                case 44: {
                    stackIn_47_0 = 1;
                    statePc = 47;
                    continue stateLoop;
                }
                case 46: {
                    stackIn_47_0 = 0;
                    statePc = 47;
                    continue stateLoop;
                }
                case 47: {
                    var10 = stackIn_47_0;
                    var11_int = 0;
                    statePc = 48;
                    continue stateLoop;
                }
                case 48: {
                    stackIn_49_0 = var11_int;
                    stackIn_49_1 = this.field_W;
                    statePc = 49;
                    continue stateLoop;
                }
                case 49: {
                    if (stackIn_49_0 >= stackIn_49_1) {
                        statePc = 118;
                    } else {
                        statePc = 50;
                    }
                    continue stateLoop;
                }
                case 50: {
                    var12 = var8[var11_int];
                    var13_ref = null;
                    var14_int = 0;
                    var15_int = 0;
                    var16 = 0;
                    var17 = 0;
                    if (null != param1.field_m) {
                        statePc = 55;
                    } else {
                        statePc = 75;
                    }
                    continue stateLoop;
                }
                case 55: {
                    var18 = 0;
                    var19_int = 0;
                    statePc = 56;
                    continue stateLoop;
                }
                case 56: {
                    if ((var19_int ^ -1) <= (param1.field_m.length ^ -1)) {
                        statePc = 71;
                    } else {
                        statePc = 57;
                    }
                    continue stateLoop;
                }
                case 57: {
                    var20_ref_jt = param1.field_m[var19_int];
                    stackIn_49_0 = var12 ^ -1;
                    stackIn_58_0 = stackIn_49_0;
                    stackIn_49_1 = var20_ref_jt.field_a ^ -1;
                    stackIn_58_1 = stackIn_49_1;
                    if (false) {
                        statePc = 49;
                    } else {
                        statePc = 58;
                    }
                    continue stateLoop;
                }
                case 58: {
                    if (stackIn_58_0 == stackIn_58_1) {
                        statePc = 60;
                    } else {
                        statePc = 70;
                    }
                    continue stateLoop;
                }
                case 60: {
                    var21_ref_lp = fw.a(var20_ref_jt.field_d, false);
                    if (var21_ref_lp.field_i) {
                        statePc = 63;
                    } else {
                        statePc = 64;
                    }
                    continue stateLoop;
                }
                case 63: {
                    var18 = 1;
                    statePc = 64;
                    continue stateLoop;
                }
                case 64: {
                    if ((var21_ref_lp.field_f ^ -1) != 0) {
                        statePc = 67;
                    } else {
                        statePc = 70;
                    }
                    continue stateLoop;
                }
                case 67: {
                    var22_ref_dw = var7.a((byte) -92, var21_ref_lp.field_f);
                    if (-3 != (var22_ref_dw.field_d ^ -1)) {
                        statePc = 70;
                    } else {
                        statePc = 68;
                    }
                    continue stateLoop;
                }
                case 68: {
                    this.field_s = true;
                    statePc = 70;
                    continue stateLoop;
                }
                case 70: {
                    var19_int++;
                    statePc = 56;
                    continue stateLoop;
                }
                case 71: {
                    if (var18 != 0) {
                        statePc = 74;
                    } else {
                        statePc = 75;
                    }
                    continue stateLoop;
                }
                case 74: {
                    var9[var11_int] = 9223372036854775807L;
                    this.field_ib = this.field_ib - 1;
                    statePc = 117;
                    continue stateLoop;
                }
                case 75: {
                    var18 = -1;
                    if (param1.field_r != null) {
                        statePc = 78;
                    } else {
                        statePc = 91;
                    }
                    continue stateLoop;
                }
                case 78: {
                    var18 = param1.field_r[var12];
                    if ((var18 ^ -1) != 0) {
                        statePc = 81;
                    } else {
                        statePc = 91;
                    }
                    continue stateLoop;
                }
                case 81: {
                    var13_ref = var7.a((byte) 118, 65535 & var18);
                    if ((64 & this.field_u ^ -1) == -1) {
                        statePc = 85;
                    } else {
                        statePc = 82;
                    }
                    continue stateLoop;
                }
                case 82: {
                    if (((dw) (var13_ref)).field_p) {
                        statePc = 90;
                    } else {
                        statePc = 85;
                    }
                    continue stateLoop;
                }
                case 85: {
                    var16 = ((dw) (var13_ref)).field_h;
                    if (0 != ((dw) (var13_ref)).field_s) {
                        statePc = 89;
                    } else {
                        statePc = 86;
                    }
                    continue stateLoop;
                }
                case 86: {
                    if (0 != ((dw) (var13_ref)).field_o) {
                        statePc = 89;
                    } else {
                        statePc = 89;
                    }
                    continue stateLoop;
                }
                case 89: {
                    var17 = ((dw) (var13_ref)).field_a;
                    statePc = 91;
                    continue stateLoop;
                }
                case 90: {
                    var18 = -1;
                    var13_ref = null;
                    statePc = 91;
                    continue stateLoop;
                }
                case 91: {
                    if (param1.field_n == null) {
                        statePc = 95;
                    } else {
                        statePc = 92;
                    }
                    continue stateLoop;
                }
                case 92: {
                    if ((param1.field_n[var12] ^ -1) != -1) {
                        statePc = 101;
                    } else {
                        statePc = 95;
                    }
                    continue stateLoop;
                }
                case 95: {
                    if (var13_ref == null) {
                        statePc = 103;
                    } else {
                        statePc = 98;
                    }
                    continue stateLoop;
                }
                case 98: {
                    if (((dw) (var13_ref)).field_d == 0) {
                        statePc = 103;
                    } else {
                        statePc = 101;
                    }
                    continue stateLoop;
                }
                case 101: {
                    stackIn_104_0 = 1;
                    statePc = 104;
                    continue stateLoop;
                }
                case 103: {
                    stackIn_104_0 = 0;
                    statePc = 104;
                    continue stateLoop;
                }
                case 104: {
                    var19_int = stackIn_104_0;
                    if (var10 != 0) {
                        statePc = 108;
                    } else {
                        statePc = 105;
                    }
                    continue stateLoop;
                }
                case 105: {
                    if (var19_int == 0) {
                        statePc = 114;
                    } else {
                        statePc = 108;
                    }
                    continue stateLoop;
                }
                case 108: {
                    if (null != param1.field_C) {
                        statePc = 113;
                    } else {
                        statePc = 114;
                    }
                    continue stateLoop;
                }
                case 113: {
                    var14_int = var14_int + (param1.field_C[var12] << -1243823247);
                    statePc = 114;
                    continue stateLoop;
                }
                case 114: {
                    if (var19_int == 0) {
                        statePc = 116;
                    } else {
                        statePc = 115;
                    }
                    continue stateLoop;
                }
                case 115: {
                    var14_int = var14_int + 65536;
                    statePc = 116;
                    continue stateLoop;
                }
                case 116: {
                    var14_int = var14_int + (var16 << -354507832 & 65280);
                    var15_int = var15_int + ((var18 & 65535) << 1580516080);
                    var14_int = var14_int + (var17 & 255);
                    var15_int = var15_int + (65535 & var11_int);
                    var9[var11_int] = ((long)var14_int << -1008284320) - -(long)var15_int;
                    this.field_s = this.field_s | var19_int != 0;
                    statePc = 117;
                    continue stateLoop;
                }
                case 117: {
                    var11_int++;
                    statePc = 48;
                    continue stateLoop;
                }
                case 118: {
                    ofa.a(var8, var9, 93);
                    this.field_P = param1.field_b;
                    this.field_A = param1.field_p;
                    this.field_N = param1.field_E;
                    this.field_K = param1.field_I;
                    this.field_lb = param1.field_L;
                    this.field_db = param1.field_y;
                    this.field_t = param1.field_e;
                    var11 = new pa[this.field_lb];
                    this.field_D = param1.field_B;
                    if (param1.field_m != null) {
                        statePc = 121;
                    } else {
                        statePc = 142;
                    }
                    continue stateLoop;
                }
                case 121: {
                    this.field_G = param1.field_m.length;
                    this.field_f = new fd[this.field_G];
                    this.field_r = new pm[this.field_G];
                    var12 = 0;
                    statePc = 122;
                    continue stateLoop;
                }
                case 122: {
                    if (var12 >= this.field_G) {
                        statePc = 142;
                    } else {
                        statePc = 123;
                    }
                    continue stateLoop;
                }
                case 123: {
                    var13_ref = param1.field_m[var12];
                    var14 = fw.a(((jt) (var13_ref)).field_d, false);
                    var15_int = -1;
                    var16 = 0;
                    statePc = 124;
                    continue stateLoop;
                }
                case 124: {
                    if ((this.field_W ^ -1) >= (var16 ^ -1)) {
                        statePc = 133;
                    } else {
                        statePc = 125;
                    }
                    continue stateLoop;
                }
                case 125: {
                    stackIn_134_0 = ((jt) (var13_ref)).field_a ^ -1;
                    stackIn_126_0 = stackIn_134_0;
                    stackIn_134_1 = var8[var16] ^ -1;
                    stackIn_126_1 = stackIn_134_1;
                    if (false) {
                        statePc = 134;
                    } else {
                        statePc = 126;
                    }
                    continue stateLoop;
                }
                case 126: {
                    if (stackIn_126_0 != stackIn_126_1) {
                        statePc = 130;
                    } else {
                        statePc = 129;
                    }
                    continue stateLoop;
                }
                case 129: {
                    var15_int = var16;
                    statePc = 133;
                    continue stateLoop;
                }
                case 130: {
                    var16++;
                    statePc = 124;
                    continue stateLoop;
                }
                case 133: {
                    stackIn_134_0 = 0;
                    stackIn_134_1 = var15_int ^ -1;
                    statePc = 134;
                    continue stateLoop;
                }
                case 134: {
                    if (stackIn_134_0 != stackIn_134_1) {
                        statePc = 137;
                    } else {
                        statePc = 135;
                    }
                    continue stateLoop;
                }
                case 135: {
                    throw new RuntimeException();
                }
                case 137: {
                    var16 = cla.field_m[param1.field_A[((jt) (var13_ref)).field_a] & 65535] & 16777215;
                    stackIn_140_0 = var16;
                    stackIn_138_0 = stackIn_140_0;
                    stackIn_140_1 = 255;
                    stackIn_138_1 = stackIn_140_1;
                    if (param1.field_n != null) {
                        statePc = 140;
                    } else {
                        statePc = 138;
                    }
                    continue stateLoop;
                }
                case 138: {
                    stackIn_141_0 = stackIn_138_0;
                    stackIn_141_1 = stackIn_138_1;
                    stackIn_141_2 = 0;
                    statePc = 141;
                    continue stateLoop;
                }
                case 140: {
                    stackIn_141_0 = stackIn_140_0;
                    stackIn_141_1 = stackIn_140_1;
                    stackIn_141_2 = param1.field_n[((jt) (var13_ref)).field_a];
                    statePc = 141;
                    continue stateLoop;
                }
                case 141: {
                    var16 = stackIn_141_0 | stackIn_141_1 - stackIn_141_2 << -1923296424;
                    this.field_r[var12] = new pm(var15_int, (int) param1.field_a[((jt) (var13_ref)).field_a], (int) param1.field_t[((jt) (var13_ref)).field_a], (int) param1.field_J[((jt) (var13_ref)).field_a], var14.field_d, var14.field_b, var14.field_f, var14.field_c, var14.field_e, var14.field_i, var14.field_a, ((jt) (var13_ref)).field_c);
                    this.field_f[var12] = new fd(var16);
                    var12++;
                    statePc = 122;
                    continue stateLoop;
                }
                case 142: {
                    var12 = this.field_W * 3;
                    if (null != param1.field_h) {
                        statePc = 145;
                    } else {
                        statePc = 146;
                    }
                    continue stateLoop;
                }
                case 145: {
                    this.field_fb = new short[this.field_W];
                    statePc = 146;
                    continue stateLoop;
                }
                case 146: {
                    this.field_y = new float[var12];
                    this.field_n = new float[var12];
                    this.field_Y = new short[var12];
                    this.field_I = new short[this.field_W];
                    this.field_E = new short[var12];
                    this.field_hb = new short[this.field_W];
                    this.field_O = new byte[var12];
                    this.field_cb = new short[var12];
                    this.field_o = new byte[this.field_W];
                    this.field_h = (short)param4;
                    this.field_z = new short[this.field_W];
                    this.field_H = new short[this.field_W];
                    this.field_B = (short)param3;
                    this.field_X = new short[this.field_W];
                    this.field_q = new short[var12];
                    qka.field_m = new long[var12];
                    var13 = 0;
                    var14_int = 0;
                    statePc = 147;
                    continue stateLoop;
                }
                case 147: {
                    if (var14_int >= param1.field_L) {
                        statePc = 151;
                    } else {
                        statePc = 148;
                    }
                    continue stateLoop;
                }
                case 148: {
                    var15_int = this.field_e[var14_int];
                    this.field_e[var14_int] = var13;
                    var13 = var13 + var15_int;
                    var11[var14_int] = new pa();
                    var14_int++;
                    statePc = 147;
                    continue stateLoop;
                }
                case 151: {
                    this.field_e[param1.field_L] = var13;
                    var14_ref = qqa.a(var8, param1, this.field_W, (byte) -6);
                    var15 = new uo[param1.field_o];
                    var16 = 0;
                    statePc = 152;
                    continue stateLoop;
                }
                case 152: {
                    if (var16 >= param1.field_o) {
                        statePc = 186;
                    } else {
                        statePc = 153;
                    }
                    continue stateLoop;
                }
                case 153: {
                    var17 = param1.field_a[var16];
                    var18 = param1.field_t[var16];
                    var19_int = param1.field_J[var16];
                    var20 = this.field_P[var18] - this.field_P[var17];
                    var21 = this.field_K[var18] - this.field_K[var17];
                    var22_int = this.field_A[var18] + -this.field_A[var17];
                    var23_int = this.field_P[var19_int] - this.field_P[var17];
                    var24_int = -this.field_K[var17] + this.field_K[var19_int];
                    var25_int = this.field_A[var19_int] + -this.field_A[var17];
                    var26_int = var21 * var25_int - var24_int * var22_int;
                    var27_int = var22_int * var23_int - var25_int * var20;
                    var28 = var20 * var24_int + -(var21 * var23_int);
                    statePc = 154;
                    continue stateLoop;
                }
                case 154: {
                    if (8192 < var26_int) {
                        statePc = 171;
                    } else {
                        statePc = 155;
                    }
                    continue stateLoop;
                }
                case 155: {
                    stackIn_172_0 = -8193;
                    stackIn_156_0 = stackIn_172_0;
                    stackIn_172_1 = var27_int ^ -1;
                    stackIn_156_1 = stackIn_172_1;
                    if (false) {
                        statePc = 172;
                    } else {
                        statePc = 156;
                    }
                    continue stateLoop;
                }
                case 156: {
                    if (stackIn_156_0 > stackIn_156_1) {
                        statePc = 171;
                    } else {
                        statePc = 159;
                    }
                    continue stateLoop;
                }
                case 159: {
                    if (-8193 > (var28 ^ -1)) {
                        statePc = 171;
                    } else {
                        statePc = 162;
                    }
                    continue stateLoop;
                }
                case 162: {
                    if (-8192 > var26_int) {
                        statePc = 171;
                    } else {
                        statePc = 165;
                    }
                    continue stateLoop;
                }
                case 165: {
                    if (-8192 > var27_int) {
                        statePc = 171;
                    } else {
                        statePc = 168;
                    }
                    continue stateLoop;
                }
                case 168: {
                    if (-8192 <= var28) {
                        statePc = 173;
                    } else {
                        statePc = 171;
                    }
                    continue stateLoop;
                }
                case 171: {
                    var26_int = var26_int >> 1;
                    var28 = var28 >> 1;
                    stackIn_172_0 = var27_int;
                    stackIn_172_1 = 1;
                    statePc = 172;
                    continue stateLoop;
                }
                case 172: {
                    var27_int = stackIn_172_0 >> stackIn_172_1;
                    statePc = 154;
                    continue stateLoop;
                }
                case 173: {
                    var29 = (int)Math.sqrt((double)(var28 * var28 + var26_int * var26_int + var27_int * var27_int));
                    if (-1 > (var29 ^ -1)) {
                        statePc = 175;
                    } else {
                        statePc = 174;
                    }
                    continue stateLoop;
                }
                case 174: {
                    var29 = 1;
                    statePc = 175;
                    continue stateLoop;
                }
                case 175: {
                    var27_int = 256 * var27_int / var29;
                    var28 = var28 * 256 / var29;
                    var26_int = 256 * var26_int / var29;
                    if (param1.field_G != null) {
                        statePc = 178;
                    } else {
                        statePc = 176;
                    }
                    continue stateLoop;
                }
                case 176: {
                    stackIn_179_0 = 0;
                    statePc = 179;
                    continue stateLoop;
                }
                case 178: {
                    stackIn_179_0 = param1.field_G[var16];
                    statePc = 179;
                    continue stateLoop;
                }
                case 179: {
                    var30 = stackIn_179_0;
                    if (var30 != 0) {
                        statePc = 181;
                    } else {
                        statePc = 180;
                    }
                    continue stateLoop;
                }
                case 180: {
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
                    statePc = 185;
                    continue stateLoop;
                }
                case 181: {
                    if ((var30 ^ -1) != -2) {
                        statePc = 185;
                    } else {
                        statePc = 184;
                    }
                    continue stateLoop;
                }
                case 184: {
                    dupTemp$4 = new uo();
                    var15[var16] = dupTemp$4;
                    var31_ref_uo = dupTemp$4;
                    var31_ref_uo.field_a = var28;
                    var31_ref_uo.field_b = var26_int;
                    var31_ref_uo.field_c = var27_int;
                    statePc = 185;
                    continue stateLoop;
                }
                case 185: {
                    var16++;
                    statePc = 152;
                    continue stateLoop;
                }
                case 186: {
                    var16 = 0;
                    statePc = 187;
                    continue stateLoop;
                }
                case 187: {
                    if ((var16 ^ -1) <= (this.field_W ^ -1)) {
                        statePc = 311;
                    } else {
                        statePc = 188;
                    }
                    continue stateLoop;
                }
                case 188: {
                    var17 = var8[var16];
                    var18 = param1.field_A[var17] & 65535;
                    if (param1.field_g != null) {
                        statePc = 192;
                    } else {
                        statePc = 191;
                    }
                    continue stateLoop;
                }
                case 191: {
                    var19_int = -1;
                    statePc = 193;
                    continue stateLoop;
                }
                case 192: {
                    var19_int = param1.field_g[var17];
                    statePc = 193;
                    continue stateLoop;
                }
                case 193: {
                    if (param1.field_n == null) {
                        statePc = 195;
                    } else {
                        statePc = 194;
                    }
                    continue stateLoop;
                }
                case 194: {
                    var20 = 255 & param1.field_n[var17];
                    statePc = 196;
                    continue stateLoop;
                }
                case 195: {
                    var20 = 0;
                    statePc = 196;
                    continue stateLoop;
                }
                case 196: {
                    if (param1.field_r == null) {
                        statePc = 199;
                    } else {
                        statePc = 197;
                    }
                    continue stateLoop;
                }
                case 197: {
                    stackIn_200_0 = param1.field_r[var17];
                    statePc = 200;
                    continue stateLoop;
                }
                case 199: {
                    stackIn_200_0 = -1;
                    statePc = 200;
                    continue stateLoop;
                }
                case 200: {
                    var21 = stackIn_200_0;
                    if (-1 == var21) {
                        statePc = 206;
                    } else {
                        statePc = 201;
                    }
                    continue stateLoop;
                }
                case 201: {
                    if (-1 == (64 & this.field_u ^ -1)) {
                        statePc = 206;
                    } else {
                        statePc = 204;
                    }
                    continue stateLoop;
                }
                case 204: {
                    var22_ref_dw = var7.a((byte) -92, 65535 & var21);
                    if (!var22_ref_dw.field_p) {
                        statePc = 206;
                    } else {
                        statePc = 205;
                    }
                    continue stateLoop;
                }
                case 205: {
                    var21 = -1;
                    statePc = 206;
                    continue stateLoop;
                }
                case 206: {
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
                        statePc = 209;
                    } else {
                        statePc = 290;
                    }
                    continue stateLoop;
                }
                case 209: {
                    if (0 != (var19_int ^ -1)) {
                        statePc = 211;
                    } else {
                        statePc = 210;
                    }
                    continue stateLoop;
                }
                case 210: {
                    var23 = 1.0f;
                    var22 = 0.0f;
                    var24 = 1.0f;
                    var27 = 0.0f;
                    var26 = 0.0f;
                    var29 = 2;
                    var25 = 1.0f;
                    var28 = 1;
                    statePc = 290;
                    continue stateLoop;
                }
                case 211: {
                    var19_int = var19_int & 255;
                    var31 = param1.field_u[var19_int];
                    if (var31 == 0) {
                        statePc = 289;
                    } else {
                        statePc = 212;
                    }
                    continue stateLoop;
                }
                case 212: {
                    var32_int = param1.field_a[var17];
                    var33_int = param1.field_t[var17];
                    var34 = param1.field_J[var17];
                    var35 = var14_ref.field_a[var19_int];
                    var36 = var14_ref.field_c[var19_int];
                    var37_int = var14_ref.field_d[var19_int];
                    var38_ref_float__ = var14_ref.field_b[var19_int];
                    var39_int = param1.field_z[var19_int];
                    var40 = (float)param1.field_d[var19_int] / 256.0f;
                    if ((var31 ^ -1) == -2) {
                        statePc = 255;
                    } else {
                        statePc = 213;
                    }
                    continue stateLoop;
                }
                case 213: {
                    if ((var31 ^ -1) == -3) {
                        statePc = 254;
                    } else {
                        statePc = 216;
                    }
                    continue stateLoop;
                }
                case 216: {
                    if (3 == var31) {
                        statePc = 221;
                    } else {
                        statePc = 290;
                    }
                    continue stateLoop;
                }
                case 221: {
                    ifa.a(param1.field_p[var32_int], param1.field_b[var32_int], var36, var37_int, dia.field_p, var40, var39_int, var35, var38_ref_float__, (byte) -44, param1.field_I[var32_int]);
                    var22 = dia.field_p[0];
                    var23 = dia.field_p[1];
                    ifa.a(param1.field_p[var33_int], param1.field_b[var33_int], var36, var37_int, dia.field_p, var40, var39_int, var35, var38_ref_float__, (byte) -44, param1.field_I[var33_int]);
                    var25 = dia.field_p[1];
                    var24 = dia.field_p[0];
                    ifa.a(param1.field_p[var34], param1.field_b[var34], var36, var37_int, dia.field_p, var40, var39_int, var35, var38_ref_float__, (byte) -44, param1.field_I[var34]);
                    var27 = dia.field_p[1];
                    var26 = dia.field_p[0];
                    if ((var39_int & 1 ^ -1) != -1) {
                        statePc = 238;
                    } else {
                        statePc = 222;
                    }
                    continue stateLoop;
                }
                case 222: {
                    if (var26 - var22 <= 0.5f) {
                        statePc = 226;
                    } else {
                        statePc = 225;
                    }
                    continue stateLoop;
                }
                case 225: {
                    var29 = 1;
                    var26 = var26 - 1.0f;
                    statePc = 232;
                    continue stateLoop;
                }
                case 226: {
                    if (var22 - var26 > 0.5f) {
                        statePc = 231;
                    } else {
                        statePc = 232;
                    }
                    continue stateLoop;
                }
                case 231: {
                    var26 = var26 + 1.0f;
                    var29 = 2;
                    statePc = 232;
                    continue stateLoop;
                }
                case 232: {
                    if (var24 - var22 <= 0.5f) {
                        statePc = 234;
                    } else {
                        statePc = 233;
                    }
                    continue stateLoop;
                }
                case 233: {
                    var24 = var24 - 1.0f;
                    var28 = 1;
                    statePc = 290;
                    continue stateLoop;
                }
                case 234: {
                    if (var22 - var24 <= 0.5f) {
                        statePc = 290;
                    } else {
                        statePc = 237;
                    }
                    continue stateLoop;
                }
                case 237: {
                    var24 = var24 + 1.0f;
                    var28 = 2;
                    statePc = 290;
                    continue stateLoop;
                }
                case 238: {
                    if (0.5f < var27 - var23) {
                        statePc = 245;
                    } else {
                        statePc = 241;
                    }
                    continue stateLoop;
                }
                case 241: {
                    if (var23 - var27 <= 0.5f) {
                        statePc = 246;
                    } else {
                        statePc = 244;
                    }
                    continue stateLoop;
                }
                case 244: {
                    var27 = var27 + 1.0f;
                    var29 = 2;
                    statePc = 246;
                    continue stateLoop;
                }
                case 245: {
                    var29 = 1;
                    var27 = var27 - 1.0f;
                    statePc = 246;
                    continue stateLoop;
                }
                case 246: {
                    if (var25 - var23 > 0.5f) {
                        statePc = 253;
                    } else {
                        statePc = 247;
                    }
                    continue stateLoop;
                }
                case 247: {
                    if (0.5f < var23 - var25) {
                        statePc = 252;
                    } else {
                        statePc = 290;
                    }
                    continue stateLoop;
                }
                case 252: {
                    var28 = 2;
                    var25 = var25 + 1.0f;
                    statePc = 290;
                    continue stateLoop;
                }
                case 253: {
                    var25 = var25 - 1.0f;
                    var28 = 1;
                    statePc = 290;
                    continue stateLoop;
                }
                case 254: {
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
                    statePc = 290;
                    continue stateLoop;
                }
                case 255: {
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
                    if ((var39_int & 1 ^ -1) != -1) {
                        statePc = 272;
                    } else {
                        statePc = 256;
                    }
                    continue stateLoop;
                }
                case 256: {
                    if (var26 - var22 <= var42) {
                        statePc = 260;
                    } else {
                        statePc = 259;
                    }
                    continue stateLoop;
                }
                case 259: {
                    var26 = var26 - var41;
                    var29 = 1;
                    statePc = 264;
                    continue stateLoop;
                }
                case 260: {
                    if (var42 >= -var26 + var22) {
                        statePc = 264;
                    } else {
                        statePc = 263;
                    }
                    continue stateLoop;
                }
                case 263: {
                    var26 = var26 + var41;
                    var29 = 2;
                    statePc = 264;
                    continue stateLoop;
                }
                case 264: {
                    if (var42 >= -var22 + var24) {
                        statePc = 266;
                    } else {
                        statePc = 265;
                    }
                    continue stateLoop;
                }
                case 265: {
                    var24 = var24 - var41;
                    var28 = 1;
                    statePc = 290;
                    continue stateLoop;
                }
                case 266: {
                    if (var42 < -var24 + var22) {
                        statePc = 271;
                    } else {
                        statePc = 290;
                    }
                    continue stateLoop;
                }
                case 271: {
                    var24 = var24 + var41;
                    var28 = 2;
                    statePc = 290;
                    continue stateLoop;
                }
                case 272: {
                    if (var42 >= var25 - var23) {
                        statePc = 276;
                    } else {
                        statePc = 275;
                    }
                    continue stateLoop;
                }
                case 275: {
                    var28 = 1;
                    var25 = var25 - var41;
                    statePc = 280;
                    continue stateLoop;
                }
                case 276: {
                    if (-var25 + var23 <= var42) {
                        statePc = 280;
                    } else {
                        statePc = 279;
                    }
                    continue stateLoop;
                }
                case 279: {
                    var25 = var25 + var41;
                    var28 = 2;
                    statePc = 280;
                    continue stateLoop;
                }
                case 280: {
                    if (-var23 + var27 > var42) {
                        statePc = 287;
                    } else {
                        statePc = 281;
                    }
                    continue stateLoop;
                }
                case 281: {
                    if (var42 < var23 - var27) {
                        statePc = 286;
                    } else {
                        statePc = 290;
                    }
                    continue stateLoop;
                }
                case 286: {
                    var29 = 2;
                    var27 = var27 + var41;
                    statePc = 290;
                    continue stateLoop;
                }
                case 287: {
                    var27 = var27 - var41;
                    var29 = 1;
                    statePc = 290;
                    continue stateLoop;
                }
                case 289: {
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
                    statePc = 290;
                    continue stateLoop;
                }
                case 290: {
                    if (param1.field_G == null) {
                        statePc = 292;
                    } else {
                        statePc = 291;
                    }
                    continue stateLoop;
                }
                case 291: {
                    var31 = param1.field_G[var17];
                    statePc = 293;
                    continue stateLoop;
                }
                case 292: {
                    var31 = 0;
                    statePc = 293;
                    continue stateLoop;
                }
                case 293: {
                    if (0 != var31) {
                        statePc = 295;
                    } else {
                        statePc = 294;
                    }
                    continue stateLoop;
                }
                case 294: {
                    var32_long = (long)(var19_int << 1091206530) - -((long)var20 + ((long)(var30 << 1206228440) - -(long)(var18 << -70712216)) << -433895136);
                    var34 = param1.field_a[var17];
                    var35 = param1.field_t[var17];
                    var36 = param1.field_J[var17];
                    var37 = var11[var34];
                    this.field_H[var16] = this.a(var32_long, var37.field_a, var37.field_b, var37.field_d, (byte) -40, var34, var37.field_e, var23, param1, var22);
                    var37 = var11[var35];
                    this.field_z[var16] = this.a(var32_long + (long)var28, var37.field_a, var37.field_b, var37.field_d, (byte) -40, var35, var37.field_e, var25, param1, var24);
                    var37 = var11[var36];
                    this.field_hb[var16] = this.a(var32_long + (long)var29, var37.field_a, var37.field_b, var37.field_d, (byte) -40, var36, var37.field_e, var27, param1, var26);
                    statePc = 303;
                    continue stateLoop;
                }
                case 295: {
                    if (var31 != 1) {
                        statePc = 303;
                    } else {
                        statePc = 298;
                    }
                    continue stateLoop;
                }
                case 298: {
                    var32 = var15[var17];
                    stackIn_301_0 = (256 + var32.field_a << 493169334) + ((var32.field_c + 256 << 100403916) + (var19_int << 1023554786));
                    stackIn_299_0 = stackIn_301_0;
                    if (-1 > (var32.field_b ^ -1)) {
                        statePc = 301;
                    } else {
                        statePc = 299;
                    }
                    continue stateLoop;
                }
                case 299: {
                    stackIn_302_0 = stackIn_299_0;
                    stackIn_302_1 = 2048;
                    statePc = 302;
                    continue stateLoop;
                }
                case 301: {
                    stackIn_302_0 = stackIn_301_0;
                    stackIn_302_1 = 1024;
                    statePc = 302;
                    continue stateLoop;
                }
                case 302: {
                    var33 = (long)(stackIn_302_0 - -stackIn_302_1) - -((long)var20 + (long)(var18 << -541878392) + (long)(var30 << 936601976) << -108288864);
                    this.field_H[var16] = this.a(var33, var32.field_a, var32.field_c, 0, (byte) -40, (int) param1.field_a[var17], var32.field_b, var23, param1, var22);
                    this.field_z[var16] = this.a(var33 + (long)var28, var32.field_a, var32.field_c, 0, (byte) -40, (int) param1.field_t[var17], var32.field_b, var25, param1, var24);
                    this.field_hb[var16] = this.a((long)var29 + var33, var32.field_a, var32.field_c, 0, (byte) -40, (int) param1.field_J[var17], var32.field_b, var27, param1, var26);
                    statePc = 303;
                    continue stateLoop;
                }
                case 303: {
                    if (param1.field_n != null) {
                        statePc = 306;
                    } else {
                        statePc = 307;
                    }
                    continue stateLoop;
                }
                case 306: {
                    this.field_o[var16] = param1.field_n[var17];
                    statePc = 307;
                    continue stateLoop;
                }
                case 307: {
                    if (param1.field_h == null) {
                        statePc = 310;
                    } else {
                        statePc = 308;
                    }
                    continue stateLoop;
                }
                case 308: {
                    this.field_fb[var16] = param1.field_h[var17];
                    statePc = 310;
                    continue stateLoop;
                }
                case 310: {
                    this.field_X[var16] = param1.field_A[var17];
                    this.field_I[var16] = (short) var21;
                    var16++;
                    statePc = 187;
                    continue stateLoop;
                }
                case 311: {
                    var16 = 0;
                    var17 = -10000;
                    var18 = 0;
                    statePc = 312;
                    continue stateLoop;
                }
                case 312: {
                    if ((this.field_ib ^ -1) >= (var18 ^ -1)) {
                        statePc = 319;
                    } else {
                        statePc = 313;
                    }
                    continue stateLoop;
                }
                case 313: {
                    var19_int = this.field_I[var18];
                    stackIn_321_0 = var19_int ^ -1;
                    stackIn_314_0 = stackIn_321_0;
                    stackIn_321_1 = var17 ^ -1;
                    stackIn_314_1 = stackIn_321_1;
                    if (false) {
                        statePc = 321;
                    } else {
                        statePc = 314;
                    }
                    continue stateLoop;
                }
                case 314: {
                    if (stackIn_314_0 == stackIn_314_1) {
                        statePc = 318;
                    } else {
                        statePc = 317;
                    }
                    continue stateLoop;
                }
                case 317: {
                    var17 = var19_int;
                    var16++;
                    statePc = 318;
                    continue stateLoop;
                }
                case 318: {
                    var18++;
                    statePc = 312;
                    continue stateLoop;
                }
                case 319: {
                    this.field_p = new int[var16 - -1];
                    var17 = -10000;
                    var16 = 0;
                    var18 = 0;
                    statePc = 320;
                    continue stateLoop;
                }
                case 320: {
                    stackIn_321_0 = this.field_ib ^ -1;
                    stackIn_321_1 = var18 ^ -1;
                    statePc = 321;
                    continue stateLoop;
                }
                case 321: {
                    if (stackIn_321_0 >= stackIn_321_1) {
                        statePc = 328;
                    } else {
                        statePc = 322;
                    }
                    continue stateLoop;
                }
                case 322: {
                    var19_int = this.field_I[var18];
                    stackIn_344_0 = var19_int ^ -1;
                    stackIn_323_0 = stackIn_344_0;
                    stackIn_344_1 = var17 ^ -1;
                    stackIn_323_1 = stackIn_344_1;
                    if (false) {
                        statePc = 344;
                    } else {
                        statePc = 323;
                    }
                    continue stateLoop;
                }
                case 323: {
                    if (stackIn_323_0 == stackIn_323_1) {
                        statePc = 327;
                    } else {
                        statePc = 326;
                    }
                    continue stateLoop;
                }
                case 326: {
                    incrementValue$5 = var16;
                    var16++;
                    this.field_p[incrementValue$5] = var18;
                    var17 = var19_int;
                    statePc = 327;
                    continue stateLoop;
                }
                case 327: {
                    var18++;
                    statePc = 320;
                    continue stateLoop;
                }
                case 328: {
                    this.field_p[var16] = this.field_ib;
                    qka.field_m = null;
                    this.field_E = rna.a(this.field_E, true, this.field_L);
                    this.field_Y = rna.a(this.field_Y, true, this.field_L);
                    this.field_cb = rna.a(this.field_cb, true, this.field_L);
                    this.field_O = pt.a(this.field_O, this.field_L, 4096);
                    this.field_n = lpa.a(this.field_L, 50, this.field_n);
                    this.field_y = lpa.a(this.field_L, 50, this.field_y);
                    if (null == param1.field_l) {
                        statePc = 335;
                    } else {
                        statePc = 329;
                    }
                    continue stateLoop;
                }
                case 329: {
                    if (kda.b(param2, 104, this.field_u)) {
                        statePc = 334;
                    } else {
                        statePc = 335;
                    }
                    continue stateLoop;
                }
                case 334: {
                    this.field_d = param1.a(false, (byte) 64);
                    statePc = 335;
                    continue stateLoop;
                }
                case 335: {
                    if (null == param1.field_m) {
                        statePc = 341;
                    } else {
                        statePc = 336;
                    }
                    continue stateLoop;
                }
                case 336: {
                    if (!eo.a(this.field_u, (byte) 83, param2)) {
                        statePc = 341;
                    } else {
                        statePc = 339;
                    }
                    continue stateLoop;
                }
                case 339: {
                    this.field_C = param1.b((byte) -91);
                    statePc = 341;
                    continue stateLoop;
                }
                case 341: {
                    if (param1.field_D == null) {
                        statePc = 383;
                    } else {
                        statePc = 342;
                    }
                    continue stateLoop;
                }
                case 342: {
                    stackIn_344_0 = -26571;
                    stackIn_344_1 = param2;
                    statePc = 344;
                    continue stateLoop;
                }
                case 344: {
                    if (aw.d(stackIn_344_0, stackIn_344_1, this.field_u)) {
                        statePc = 347;
                    } else {
                        statePc = 383;
                    }
                    continue stateLoop;
                }
                case 347: {
                    var18 = 0;
                    var19 = new int[256];
                    var20 = 0;
                    statePc = 348;
                    continue stateLoop;
                }
                case 348: {
                    if (var20 >= this.field_W) {
                        statePc = 359;
                    } else {
                        statePc = 349;
                    }
                    continue stateLoop;
                }
                case 349: {
                    var21 = param1.field_D[var8[var20]];
                    stackIn_360_0 = var21;
                    stackIn_350_0 = stackIn_360_0;
                    if (false) {
                        statePc = 360;
                    } else {
                        statePc = 350;
                    }
                    continue stateLoop;
                }
                case 350: {
                    if (stackIn_350_0 < 0) {
                        statePc = 358;
                    } else {
                        statePc = 353;
                    }
                    continue stateLoop;
                }
                case 353: {
                    if ((var21 ^ -1) >= (var18 ^ -1)) {
                        statePc = 357;
                    } else {
                        statePc = 356;
                    }
                    continue stateLoop;
                }
                case 356: {
                    var18 = var21;
                    statePc = 357;
                    continue stateLoop;
                }
                case 357: {
                    var19[var21] = var19[var21] + 1;
                    statePc = 358;
                    continue stateLoop;
                }
                case 358: {
                    var20++;
                    statePc = 348;
                    continue stateLoop;
                }
                case 359: {
                    this.field_j = new int[1 + var18][];
                    stackIn_360_0 = 0;
                    statePc = 360;
                    continue stateLoop;
                }
                case 360: {
                    var20 = stackIn_360_0;
                    statePc = 361;
                    continue stateLoop;
                }
                case 361: {
                    if (var18 < var20) {
                        statePc = 365;
                    } else {
                        statePc = 362;
                    }
                    continue stateLoop;
                }
                case 362: {
                    array$6 = new int[var19[var20]];
                    this.field_j[var20] = array$6;
                    var19[var20] = 0;
                    var20++;
                    statePc = 361;
                    continue stateLoop;
                }
                case 365: {
                    var20 = 0;
                    statePc = 366;
                    continue stateLoop;
                }
                case 366: {
                    if ((this.field_W ^ -1) >= (var20 ^ -1)) {
                        statePc = 383;
                    } else {
                        statePc = 367;
                    }
                    continue stateLoop;
                }
                case 367: {
                    var21 = param1.field_D[var8[var20]];
                    if (var21 < 0) {
                        statePc = 372;
                    } else {
                        statePc = 370;
                    }
                    continue stateLoop;
                }
                case 370: {
                    dupTemp$7 = var19[var21];
                    arrayValue$8 = this.field_j[var21];
                    var19[var21] = dupTemp$7 + 1;
                    arrayValue$8[dupTemp$7] = var20;
                    statePc = 372;
                    continue stateLoop;
                }
                case 372: {
                    var20++;
                    statePc = 366;
                    continue stateLoop;
                }
                case 383: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    static {
        field_V = "<%0> has entered another game.";
    }
}
