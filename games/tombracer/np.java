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
        int stackIn_4_0 = 0;
        int stackIn_4_1 = 0;
        int stackIn_33_0 = 0;
        int stackIn_33_1 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_3_1 = 0;
        int stackOut_32_0 = 0;
        int stackOut_32_1 = 0;
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
                L3: {
                  if ((this.field_lb ^ -1) >= (var10 ^ -1)) {
                    break L3;
                  } else {
                    var11 = this.field_P[var10];
                    var12 = this.field_K[var10];
                    stackOut_3_0 = var2_int;
                    stackOut_3_1 = var11;
                    stackIn_33_0 = stackOut_3_0;
                    stackIn_33_1 = stackOut_3_1;
                    stackIn_4_0 = stackOut_3_0;
                    stackIn_4_1 = stackOut_3_1;
                    if (var15 != 0) {
                      break L2;
                    } else {
                      L4: {
                        if (stackIn_4_0 > stackIn_4_1) {
                          var2_int = var11;
                          break L4;
                        } else {
                          break L4;
                        }
                      }
                      L5: {
                        if (var3 > var12) {
                          var3 = var12;
                          break L5;
                        } else {
                          break L5;
                        }
                      }
                      L6: {
                        if ((var6 ^ -1) <= (var12 ^ -1)) {
                          break L6;
                        } else {
                          var6 = var12;
                          break L6;
                        }
                      }
                      L7: {
                        var13 = this.field_A[var10];
                        if (var11 <= var5) {
                          break L7;
                        } else {
                          var5 = var11;
                          break L7;
                        }
                      }
                      L8: {
                        if (var4 > var13) {
                          var4 = var13;
                          break L8;
                        } else {
                          break L8;
                        }
                      }
                      L9: {
                        if ((var7 ^ -1) <= (var13 ^ -1)) {
                          break L9;
                        } else {
                          var7 = var13;
                          break L9;
                        }
                      }
                      L10: {
                        var14 = var13 * var13 + var11 * var11;
                        if (var8 < var14) {
                          var8 = var14;
                          break L10;
                        } else {
                          break L10;
                        }
                      }
                      L11: {
                        var14 = var12 * var12 + var11 * var11 + var13 * var13;
                        if ((var14 ^ -1) < (var9 ^ -1)) {
                          var9 = var14;
                          break L11;
                        } else {
                          break L11;
                        }
                      }
                      var10++;
                      if (var15 == 0) {
                        continue L1;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
                stackOut_32_0 = param0;
                stackOut_32_1 = 2709;
                stackIn_33_0 = stackOut_32_0;
                stackIn_33_1 = stackOut_32_1;
                break L2;
              }
              if (stackIn_33_0 == stackIn_33_1) {
                this.field_k = (short)var4;
                this.field_T = (short)var5;
                this.field_S = (short)var7;
                this.field_eb = (short)var3;
                this.field_U = (short)var2_int;
                this.field_v = (short)var6;
                this.field_M = (short)(int)(0.99 + Math.sqrt((double)var8));
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
              L2: {
                L3: {
                  if (this.field_lb <= var4_int) {
                    break L3;
                  } else {
                    if (var5 != 0) {
                      break L2;
                    } else {
                      L4: {
                        if (0 == param0) {
                          break L4;
                        } else {
                          this.field_P[var4_int] = this.field_P[var4_int] + param0;
                          break L4;
                        }
                      }
                      L5: {
                        if (0 != param1) {
                          this.field_K[var4_int] = this.field_K[var4_int] + param1;
                          break L5;
                        } else {
                          break L5;
                        }
                      }
                      L6: {
                        if ((param2 ^ -1) == -1) {
                          break L6;
                        } else {
                          this.field_A[var4_int] = this.field_A[var4_int] + param2;
                          break L6;
                        }
                      }
                      var4_int++;
                      if (var5 == 0) {
                        continue L1;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
                this.field_l = false;
                break L2;
              }
              L7: {
                if (this.field_g == null) {
                  break L7;
                } else {
                  this.field_g.field_d = null;
                  break L7;
                }
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw tba.a((Throwable) ((Object) runtimeException), "np.H(" + param0 + ',' + param1 + ',' + param2 + ')');
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
                      L4: {
                        if ((param4 ^ -1) <= -1) {
                          break L4;
                        } else {
                          var9 = 0;
                          if (var13 == 0) {
                            break L3;
                          } else {
                            break L4;
                          }
                        }
                      }
                      L5: {
                        if ((param4 ^ -1) < -128) {
                          break L5;
                        } else {
                          var9 = param4 * 131586;
                          if (var13 == 0) {
                            break L3;
                          } else {
                            break L5;
                          }
                        }
                      }
                      var9 = 16777215;
                      break L3;
                    }
                    L6: {
                      if ((var8 ^ -1) == -257) {
                        break L6;
                      } else {
                        var10 = var8;
                        var11 = 256 - var8;
                        var6_int = (-16711936 & (16711935 & var9) * var10 - -((16711935 & var6_int) * var11)) - -(16711680 & var11 * (65280 & var6_int) + (65280 & var9) * var10) >> -2117016184;
                        if (var13 == 0) {
                          break L2;
                        } else {
                          break L6;
                        }
                      }
                    }
                    var6_int = var9;
                    break L2;
                  }
                }
                var9 = 255 & var7.field_i;
                if (0 != var9) {
                  L7: {
                    var9 += 256;
                    var10 = (var6_int >> -553499408 & 255) * var9;
                    if (-65536 <= (var10 ^ -1)) {
                      break L7;
                    } else {
                      var10 = 65535;
                      break L7;
                    }
                  }
                  L8: {
                    var11 = var9 * ((65280 & var6_int) >> -1510998072);
                    if (-65536 > (var11 ^ -1)) {
                      var11 = 65535;
                      break L8;
                    } else {
                      break L8;
                    }
                  }
                  L9: {
                    var12 = var9 * (var6_int & 255);
                    if (var12 <= 65535) {
                      break L9;
                    } else {
                      var12 = 65535;
                      break L9;
                    }
                  }
                  var6_int = (var12 >> 1406443688) + ((16711843 & var10 << 211496968) + (65280 & var11));
                  break L1;
                } else {
                  break L1;
                }
              }
            }
            L10: {
              if (param0 == -2117016184) {
                break L10;
              } else {
                this.b();
                break L10;
              }
            }
            stackOut_30_0 = (var6_int << 1985794856) - -255 - (param2 & 255);
            stackIn_31_0 = stackOut_30_0;
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
        RuntimeException runtimeException = null;
        int var2_int = 0;
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
              L2: {
                L3: {
                  if ((this.field_lb ^ -1) >= (var4 ^ -1)) {
                    break L3;
                  } else {
                    var5 = this.field_K[var4] * var3 - var2_int * this.field_A[var4] >> -1809676626;
                    this.field_A[var4] = var3 * this.field_A[var4] + var2_int * this.field_K[var4] >> 1196700814;
                    this.field_K[var4] = var5;
                    var4++;
                    if (var6 != 0) {
                      break L2;
                    } else {
                      if (var6 == 0) {
                        continue L1;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
                this.field_l = false;
                break L2;
              }
              L4: {
                if (this.field_g == null) {
                  break L4;
                } else {
                  this.field_g.field_d = null;
                  break L4;
                }
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw tba.a((Throwable) ((Object) runtimeException), "np.FA(" + param0 + ')');
        }
    }

    private final short a(long param0, int param1, int param2, int param3, byte param4, int param5, int param6, float param7, oc param8, float param9) {
        int fieldTemp$1 = 0;
        RuntimeException var12 = null;
        int var12_int = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int stackIn_4_0 = 0;
        short stackIn_15_0 = 0;
        int stackIn_18_0 = 0;
        short stackIn_22_0 = 0;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_27_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        short stackOut_14_0 = 0;
        byte stackOut_17_0 = 0;
        short stackOut_21_0 = 0;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        String stackOut_26_2 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
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
                    stackOut_3_0 = var16;
                    stackIn_18_0 = stackOut_3_0;
                    stackIn_4_0 = stackOut_3_0;
                    if (var17 != 0) {
                      break L2;
                    } else {
                      L4: {
                        if (stackIn_4_0 == 0) {
                          var14 = var15;
                          if (var17 == 0) {
                            break L3;
                          } else {
                            break L4;
                          }
                        } else {
                          break L4;
                        }
                      }
                      if ((qka.field_m[var15] ^ -1L) == (param0 ^ -1L)) {
                        stackOut_14_0 = (short)(-1 + var16);
                        stackIn_15_0 = stackOut_14_0;
                        decompiledRegionSelector0 = 0;
                        break L0;
                      } else {
                        var15++;
                        if (var17 == 0) {
                          continue L1;
                        } else {
                          break L3;
                        }
                      }
                    }
                  }
                }
                this.field_q[var14] = (short)(1 + this.field_L);
                qka.field_m[var14] = param0;
                this.field_E[this.field_L] = (short)param6;
                stackOut_17_0 = param4;
                stackIn_18_0 = stackOut_17_0;
                break L2;
              }
              L5: {
                if (stackIn_18_0 == -40) {
                  break L5;
                } else {
                  this.field_s = true;
                  break L5;
                }
              }
              this.field_Y[this.field_L] = (short)param2;
              this.field_cb[this.field_L] = (short)param1;
              this.field_O[this.field_L] = (byte)param3;
              this.field_n[this.field_L] = param9;
              this.field_y[this.field_L] = param7;
              fieldTemp$1 = this.field_L;
              this.field_L = this.field_L + 1;
              stackOut_21_0 = (short)fieldTemp$1;
              stackIn_22_0 = stackOut_21_0;
              decompiledRegionSelector0 = 1;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var12 = decompiledCaughtException;
            stackOut_23_0 = (RuntimeException) (var12);
            stackOut_23_1 = new StringBuilder().append("np.G(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',').append(param7).append(',');
            stackIn_26_0 = stackOut_23_0;
            stackIn_26_1 = stackOut_23_1;
            stackIn_24_0 = stackOut_23_0;
            stackIn_24_1 = stackOut_23_1;
            if (param8 == null) {
              stackOut_26_0 = (RuntimeException) ((Object) stackIn_26_0);
              stackOut_26_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackOut_26_2 = "null";
              stackIn_27_0 = stackOut_26_0;
              stackIn_27_1 = stackOut_26_1;
              stackIn_27_2 = stackOut_26_2;
              break L6;
            } else {
              stackOut_24_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackOut_24_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackOut_24_2 = "{...}";
              stackIn_27_0 = stackOut_24_0;
              stackIn_27_1 = stackOut_24_1;
              stackIn_27_2 = stackOut_24_2;
              break L6;
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
        int[] array$16 = null;
        int[] array$17 = null;
        int[] array$18 = null;
        short[] array$19 = null;
        byte[] array$20 = null;
        short[] array$21 = null;
        short[] array$22 = null;
        short[] array$23 = null;
        aba fieldTemp$24 = null;
        float[] array$25 = null;
        float[] array$26 = null;
        short[] array$27 = null;
        short[] array$28 = null;
        short[] array$29 = null;
        short[] array$30 = null;
        fd[] array$31 = null;
        RuntimeException var7 = null;
        int var7_int = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        aba var11_ref_aba = null;
        int var12 = 0;
        int var13 = 0;
        int stackIn_64_0 = 0;
        int stackIn_79_0 = 0;
        np stackIn_326_0 = null;
        RuntimeException stackIn_328_0 = null;
        StringBuilder stackIn_328_1 = null;
        RuntimeException stackIn_330_0 = null;
        StringBuilder stackIn_330_1 = null;
        RuntimeException stackIn_331_0 = null;
        StringBuilder stackIn_331_1 = null;
        String stackIn_331_2 = null;
        RuntimeException stackIn_332_0 = null;
        StringBuilder stackIn_332_1 = null;
        RuntimeException stackIn_334_0 = null;
        StringBuilder stackIn_334_1 = null;
        RuntimeException stackIn_335_0 = null;
        StringBuilder stackIn_335_1 = null;
        String stackIn_335_2 = null;
        Throwable caughtException = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_63_0 = 0;
        boolean stackOut_78_0 = false;
        np stackOut_325_0 = null;
        RuntimeException stackOut_327_0 = null;
        StringBuilder stackOut_327_1 = null;
        RuntimeException stackOut_330_0 = null;
        StringBuilder stackOut_330_1 = null;
        String stackOut_330_2 = null;
        RuntimeException stackOut_328_0 = null;
        StringBuilder stackOut_328_1 = null;
        String stackOut_328_2 = null;
        RuntimeException stackOut_331_0 = null;
        StringBuilder stackOut_331_1 = null;
        RuntimeException stackOut_334_0 = null;
        StringBuilder stackOut_334_1 = null;
        String stackOut_334_2 = null;
        RuntimeException stackOut_332_0 = null;
        StringBuilder stackOut_332_1 = null;
        String stackOut_332_2 = null;
        var13 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              L2: {
                param5.field_h = this.field_h;
                if (-1 == (param1 & 256 ^ -1)) {
                  break L2;
                } else {
                  param5.field_s = true;
                  if (var13 == 0) {
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              param5.field_s = this.field_s;
              break L1;
            }
            L3: {
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
                break L3;
              } else {
                this.field_q = (short[]) null;
                break L3;
              }
            }
            L4: {
              L5: {
                L6: {
                  if (var10 != 0) {
                    break L6;
                  } else {
                    param5.field_A = this.field_A;
                    param5.field_K = this.field_K;
                    param5.field_P = this.field_P;
                    if (var13 == 0) {
                      break L5;
                    } else {
                      break L6;
                    }
                  }
                }
                L7: {
                  L8: {
                    if (var7_int != 0) {
                      break L8;
                    } else {
                      param5.field_P = this.field_P;
                      if (var13 == 0) {
                        break L7;
                      } else {
                        break L8;
                      }
                    }
                  }
                  L9: {
                    if (param4.field_P == null) {
                      break L9;
                    } else {
                      if (this.field_N > param4.field_P.length) {
                        break L9;
                      } else {
                        param5.field_P = param4.field_P;
                        if (var13 == 0) {
                          break L7;
                        } else {
                          break L9;
                        }
                      }
                    }
                  }
                  array$16 = new int[this.field_N];
                  param4.field_P = array$16;
                  param5.field_P = array$16;
                  break L7;
                }
                L10: {
                  L11: {
                    if (var8 != 0) {
                      break L11;
                    } else {
                      param5.field_K = this.field_K;
                      if (var13 == 0) {
                        break L10;
                      } else {
                        break L11;
                      }
                    }
                  }
                  L12: {
                    if (null == param4.field_K) {
                      break L12;
                    } else {
                      if (this.field_N > param4.field_K.length) {
                        break L12;
                      } else {
                        param5.field_K = param4.field_K;
                        if (var13 == 0) {
                          break L10;
                        } else {
                          break L12;
                        }
                      }
                    }
                  }
                  array$17 = new int[this.field_N];
                  param4.field_K = array$17;
                  param5.field_K = array$17;
                  break L10;
                }
                L13: {
                  L14: {
                    if (var9 == 0) {
                      break L14;
                    } else {
                      L15: {
                        L16: {
                          if (param4.field_A == null) {
                            break L16;
                          } else {
                            if (param4.field_A.length >= this.field_N) {
                              break L15;
                            } else {
                              break L16;
                            }
                          }
                        }
                        array$18 = new int[this.field_N];
                        param4.field_A = array$18;
                        param5.field_A = array$18;
                        if (var13 == 0) {
                          break L13;
                        } else {
                          break L15;
                        }
                      }
                      param5.field_A = param4.field_A;
                      if (var13 == 0) {
                        break L13;
                      } else {
                        break L14;
                      }
                    }
                  }
                  param5.field_A = this.field_A;
                  break L13;
                }
                var11 = 0;
                L17: while (true) {
                  if (var11 >= this.field_N) {
                    break L5;
                  } else {
                    stackOut_63_0 = var7_int;
                    stackIn_79_0 = stackOut_63_0;
                    stackIn_64_0 = stackOut_63_0;
                    if (var13 != 0) {
                      break L4;
                    } else {
                      L18: {
                        if (stackIn_64_0 != 0) {
                          param5.field_P[var11] = this.field_P[var11];
                          break L18;
                        } else {
                          break L18;
                        }
                      }
                      L19: {
                        if (var8 != 0) {
                          param5.field_K[var11] = this.field_K[var11];
                          break L19;
                        } else {
                          break L19;
                        }
                      }
                      L20: {
                        if (var9 != 0) {
                          param5.field_A[var11] = this.field_A[var11];
                          break L20;
                        } else {
                          break L20;
                        }
                      }
                      var11++;
                      if (var13 == 0) {
                        continue L17;
                      } else {
                        break L5;
                      }
                    }
                  }
                }
              }
              stackOut_78_0 = so.a(param1, (byte) -106, this.field_u);
              stackIn_79_0 = stackOut_78_0 ? 1 : 0;
              break L4;
            }
            L21: {
              L22: {
                if (stackIn_79_0 != 0) {
                  break L22;
                } else {
                  L23: {
                    if (hha.a(this.field_u, 0, param1)) {
                      break L23;
                    } else {
                      param5.field_g = null;
                      if (var13 == 0) {
                        break L21;
                      } else {
                        break L23;
                      }
                    }
                  }
                  param5.field_g = this.field_g;
                  if (var13 == 0) {
                    break L21;
                  } else {
                    break L22;
                  }
                }
              }
              L24: {
                if (!param2) {
                  break L24;
                } else {
                  param5.field_Z = (byte)(param5.field_Z | 1);
                  break L24;
                }
              }
              param5.field_g = param4.field_g;
              param5.field_g.field_d = this.field_g.field_d;
              param5.field_g.field_g = this.field_g.field_g;
              break L21;
            }
            L25: {
              L26: {
                if (!o.a(-1, this.field_u, param1)) {
                  break L26;
                } else {
                  L27: {
                    L28: {
                      L29: {
                        if (null == param4.field_X) {
                          break L29;
                        } else {
                          if (this.field_W <= param4.field_X.length) {
                            break L28;
                          } else {
                            break L29;
                          }
                        }
                      }
                      array$19 = new short[this.field_W];
                      param4.field_X = array$19;
                      param5.field_X = array$19;
                      if (var13 == 0) {
                        break L27;
                      } else {
                        break L28;
                      }
                    }
                    param5.field_X = param4.field_X;
                    break L27;
                  }
                  var11 = 0;
                  L30: while (true) {
                    L31: {
                      if ((var11 ^ -1) <= (this.field_W ^ -1)) {
                        break L31;
                      } else {
                        param5.field_X[var11] = this.field_X[var11];
                        var11++;
                        if (var13 != 0) {
                          break L25;
                        } else {
                          if (var13 == 0) {
                            continue L30;
                          } else {
                            break L31;
                          }
                        }
                      }
                    }
                    if (var13 == 0) {
                      break L25;
                    } else {
                      break L26;
                    }
                  }
                }
              }
              param5.field_X = this.field_X;
              break L25;
            }
            L32: {
              L33: {
                L34: {
                  L35: {
                    if (mpa.a(false, this.field_u, param1)) {
                      break L35;
                    } else {
                      param5.field_o = this.field_o;
                      if (var13 == 0) {
                        break L34;
                      } else {
                        break L35;
                      }
                    }
                  }
                  L36: {
                    L37: {
                      L38: {
                        if (null == param4.field_o) {
                          break L38;
                        } else {
                          if ((param4.field_o.length ^ -1) <= (this.field_W ^ -1)) {
                            break L37;
                          } else {
                            break L38;
                          }
                        }
                      }
                      array$20 = new byte[this.field_W];
                      param4.field_o = array$20;
                      param5.field_o = array$20;
                      if (var13 == 0) {
                        break L36;
                      } else {
                        break L37;
                      }
                    }
                    param5.field_o = param4.field_o;
                    break L36;
                  }
                  var11 = 0;
                  L39: while (true) {
                    if ((this.field_W ^ -1) >= (var11 ^ -1)) {
                      break L34;
                    } else {
                      param5.field_o[var11] = this.field_o[var11];
                      var11++;
                      if (var13 != 0) {
                        break L33;
                      } else {
                        if (var13 == 0) {
                          continue L39;
                        } else {
                          break L34;
                        }
                      }
                    }
                  }
                }
                if (!vua.e(param1, this.field_u, 13650)) {
                  break L33;
                } else {
                  L40: {
                    if (!param2) {
                      break L40;
                    } else {
                      param5.field_Z = (byte)(param5.field_Z | 2);
                      break L40;
                    }
                  }
                  param5.field_kb = param4.field_kb;
                  param5.field_kb.field_d = this.field_kb.field_d;
                  param5.field_kb.field_g = this.field_kb.field_g;
                  if (var13 == 0) {
                    break L32;
                  } else {
                    break L33;
                  }
                }
              }
              L41: {
                if (!we.b(param1, this.field_u, 2048)) {
                  break L41;
                } else {
                  param5.field_kb = this.field_kb;
                  if (var13 == 0) {
                    break L32;
                  } else {
                    break L41;
                  }
                }
              }
              param5.field_kb = null;
              break L32;
            }
            L42: {
              L43: {
                if (cra.a(this.field_u, -17, param1)) {
                  break L43;
                } else {
                  param5.field_O = this.field_O;
                  param5.field_i = this.field_i;
                  param5.field_Y = this.field_Y;
                  param5.field_cb = this.field_cb;
                  param5.field_E = this.field_E;
                  if (var13 == 0) {
                    break L42;
                  } else {
                    break L43;
                  }
                }
              }
              L44: {
                L45: {
                  if (param4.field_E == null) {
                    break L45;
                  } else {
                    if (param4.field_E.length < this.field_L) {
                      break L45;
                    } else {
                      param5.field_Y = param4.field_Y;
                      param5.field_E = param4.field_E;
                      param5.field_cb = param4.field_cb;
                      if (var13 == 0) {
                        break L44;
                      } else {
                        break L45;
                      }
                    }
                  }
                }
                var11 = this.field_L;
                array$21 = new short[var11];
                param4.field_Y = array$21;
                param5.field_Y = array$21;
                array$22 = new short[var11];
                param4.field_E = array$22;
                param5.field_E = array$22;
                array$23 = new short[var11];
                param4.field_cb = array$23;
                param5.field_cb = array$23;
                break L44;
              }
              L46: {
                L47: {
                  if (null != this.field_i) {
                    break L47;
                  } else {
                    var11 = 0;
                    L48: while (true) {
                      L49: {
                        if ((var11 ^ -1) <= (this.field_L ^ -1)) {
                          break L49;
                        } else {
                          param5.field_E[var11] = this.field_E[var11];
                          param5.field_Y[var11] = this.field_Y[var11];
                          param5.field_cb[var11] = this.field_cb[var11];
                          var11++;
                          if (var13 != 0) {
                            break L46;
                          } else {
                            if (var13 == 0) {
                              continue L48;
                            } else {
                              break L49;
                            }
                          }
                        }
                      }
                      if (var13 == 0) {
                        break L46;
                      } else {
                        break L47;
                      }
                    }
                  }
                }
                L50: {
                  if (null != param4.field_i) {
                    break L50;
                  } else {
                    param4.field_i = new aba();
                    break L50;
                  }
                }
                L51: {
                  L52: {
                    fieldTemp$24 = param4.field_i;
                    param5.field_i = param4.field_i;
                    var11_ref_aba = fieldTemp$24;
                    if (var11_ref_aba.field_d == null) {
                      break L52;
                    } else {
                      if ((this.field_L ^ -1) < (var11_ref_aba.field_d.length ^ -1)) {
                        break L52;
                      } else {
                        break L51;
                      }
                    }
                  }
                  var12 = this.field_L;
                  var11_ref_aba.field_f = new short[var12];
                  var11_ref_aba.field_e = new byte[var12];
                  var11_ref_aba.field_d = new short[var12];
                  var11_ref_aba.field_b = new short[var12];
                  break L51;
                }
                var12 = 0;
                L53: while (true) {
                  if ((this.field_L ^ -1) >= (var12 ^ -1)) {
                    break L46;
                  } else {
                    param5.field_E[var12] = this.field_E[var12];
                    param5.field_Y[var12] = this.field_Y[var12];
                    param5.field_cb[var12] = this.field_cb[var12];
                    var11_ref_aba.field_d[var12] = this.field_i.field_d[var12];
                    var11_ref_aba.field_b[var12] = this.field_i.field_b[var12];
                    var11_ref_aba.field_f[var12] = this.field_i.field_f[var12];
                    var11_ref_aba.field_e[var12] = this.field_i.field_e[var12];
                    var12++;
                    if (var13 != 0) {
                      break L42;
                    } else {
                      if (var13 == 0) {
                        continue L53;
                      } else {
                        break L46;
                      }
                    }
                  }
                }
              }
              param5.field_O = this.field_O;
              break L42;
            }
            L54: {
              L55: {
                if (ooa.a(this.field_u, param1, -100)) {
                  break L55;
                } else {
                  L56: {
                    if (!kb.a(this.field_u, param1, (byte) 17)) {
                      break L56;
                    } else {
                      param5.field_F = this.field_F;
                      if (var13 == 0) {
                        break L54;
                      } else {
                        break L56;
                      }
                    }
                  }
                  param5.field_F = null;
                  if (var13 == 0) {
                    break L54;
                  } else {
                    break L55;
                  }
                }
              }
              L57: {
                param5.field_F = param4.field_F;
                if (!param2) {
                  break L57;
                } else {
                  param5.field_Z = (byte)(param5.field_Z | 4);
                  break L57;
                }
              }
              param5.field_F.field_g = this.field_F.field_g;
              param5.field_F.field_d = this.field_F.field_d;
              break L54;
            }
            L58: {
              L59: {
                L60: {
                  L61: {
                    if (hh.a(param1, (byte) 5, this.field_u)) {
                      break L61;
                    } else {
                      param5.field_n = this.field_n;
                      param5.field_y = this.field_y;
                      if (var13 == 0) {
                        break L60;
                      } else {
                        break L61;
                      }
                    }
                  }
                  L62: {
                    L63: {
                      L64: {
                        if (null == param4.field_n) {
                          break L64;
                        } else {
                          if ((param4.field_n.length ^ -1) <= (this.field_W ^ -1)) {
                            break L63;
                          } else {
                            break L64;
                          }
                        }
                      }
                      var11 = this.field_L;
                      array$25 = new float[var11];
                      param4.field_y = array$25;
                      param5.field_y = array$25;
                      array$26 = new float[var11];
                      param4.field_n = array$26;
                      param5.field_n = array$26;
                      if (var13 == 0) {
                        break L62;
                      } else {
                        break L63;
                      }
                    }
                    param5.field_n = param4.field_n;
                    param5.field_y = param4.field_y;
                    break L62;
                  }
                  var11 = 0;
                  L65: while (true) {
                    if (this.field_L <= var11) {
                      break L60;
                    } else {
                      param5.field_n[var11] = this.field_n[var11];
                      param5.field_y[var11] = this.field_y[var11];
                      var11++;
                      if (var13 != 0) {
                        break L59;
                      } else {
                        if (var13 == 0) {
                          continue L65;
                        } else {
                          break L60;
                        }
                      }
                    }
                  }
                }
                L66: {
                  if (upa.a(this.field_u, 0, param1)) {
                    break L66;
                  } else {
                    L67: {
                      if (wu.a(-17, this.field_u, param1)) {
                        break L67;
                      } else {
                        param5.field_ab = null;
                        if (var13 == 0) {
                          break L58;
                        } else {
                          break L67;
                        }
                      }
                    }
                    param5.field_ab = this.field_ab;
                    if (var13 == 0) {
                      break L58;
                    } else {
                      break L66;
                    }
                  }
                }
                param5.field_ab = param4.field_ab;
                break L59;
              }
              L68: {
                if (!param2) {
                  break L68;
                } else {
                  param5.field_Z = (byte)(param5.field_Z | 8);
                  break L68;
                }
              }
              param5.field_ab.field_g = this.field_ab.field_g;
              param5.field_ab.field_d = this.field_ab.field_d;
              break L58;
            }
            L69: {
              L70: {
                if (!qp.a(param1, (byte) -71, this.field_u)) {
                  break L70;
                } else {
                  L71: {
                    L72: {
                      if (param4.field_H == null) {
                        break L72;
                      } else {
                        if ((param4.field_H.length ^ -1) > (this.field_W ^ -1)) {
                          break L72;
                        } else {
                          param5.field_z = param4.field_z;
                          param5.field_H = param4.field_H;
                          param5.field_hb = param4.field_hb;
                          if (var13 == 0) {
                            break L71;
                          } else {
                            break L72;
                          }
                        }
                      }
                    }
                    var11 = this.field_W;
                    array$27 = new short[var11];
                    param4.field_hb = array$27;
                    param5.field_hb = array$27;
                    array$28 = new short[var11];
                    param4.field_H = array$28;
                    param5.field_H = array$28;
                    array$29 = new short[var11];
                    param4.field_z = array$29;
                    param5.field_z = array$29;
                    break L71;
                  }
                  var11 = 0;
                  L73: while (true) {
                    L74: {
                      if ((var11 ^ -1) <= (this.field_W ^ -1)) {
                        break L74;
                      } else {
                        param5.field_H[var11] = this.field_H[var11];
                        param5.field_z[var11] = this.field_z[var11];
                        param5.field_hb[var11] = this.field_hb[var11];
                        var11++;
                        if (var13 != 0) {
                          break L69;
                        } else {
                          if (var13 == 0) {
                            continue L73;
                          } else {
                            break L74;
                          }
                        }
                      }
                    }
                    if (var13 == 0) {
                      break L69;
                    } else {
                      break L70;
                    }
                  }
                }
              }
              param5.field_hb = this.field_hb;
              param5.field_z = this.field_z;
              param5.field_H = this.field_H;
              break L69;
            }
            L75: {
              L76: {
                if (tia.b(this.field_u, -23403, param1)) {
                  break L76;
                } else {
                  L77: {
                    if (mm.a(-123, param1, this.field_u)) {
                      break L77;
                    } else {
                      param5.field_w = null;
                      if (var13 == 0) {
                        break L75;
                      } else {
                        break L77;
                      }
                    }
                  }
                  param5.field_w = this.field_w;
                  if (var13 == 0) {
                    break L75;
                  } else {
                    break L76;
                  }
                }
              }
              L78: {
                if (!param2) {
                  break L78;
                } else {
                  param5.field_Z = (byte)(param5.field_Z | 16);
                  break L78;
                }
              }
              param5.field_w = param4.field_w;
              param5.field_w.field_a = this.field_w.field_a;
              break L75;
            }
            L79: {
              L80: {
                L81: {
                  L82: {
                    L83: {
                      if (aca.a(param1, 32768, this.field_u)) {
                        break L83;
                      } else {
                        param5.field_I = this.field_I;
                        if (var13 == 0) {
                          break L82;
                        } else {
                          break L83;
                        }
                      }
                    }
                    L84: {
                      L85: {
                        L86: {
                          if (null == param4.field_I) {
                            break L86;
                          } else {
                            if ((param4.field_I.length ^ -1) <= (this.field_W ^ -1)) {
                              break L85;
                            } else {
                              break L86;
                            }
                          }
                        }
                        var11 = this.field_W;
                        array$30 = new short[var11];
                        param4.field_I = array$30;
                        param5.field_I = array$30;
                        if (var13 == 0) {
                          break L84;
                        } else {
                          break L85;
                        }
                      }
                      param5.field_I = param4.field_I;
                      break L84;
                    }
                    var11 = 0;
                    L87: while (true) {
                      if ((var11 ^ -1) <= (this.field_W ^ -1)) {
                        break L82;
                      } else {
                        param5.field_I[var11] = this.field_I[var11];
                        var11++;
                        if (var13 != 0) {
                          break L81;
                        } else {
                          if (var13 == 0) {
                            continue L87;
                          } else {
                            break L82;
                          }
                        }
                      }
                    }
                  }
                  if (qba.a(this.field_u, 480, param1)) {
                    break L81;
                  } else {
                    param5.field_f = this.field_f;
                    if (var13 == 0) {
                      break L80;
                    } else {
                      break L81;
                    }
                  }
                }
                L88: {
                  if (null == param4.field_f) {
                    break L88;
                  } else {
                    if ((this.field_G ^ -1) < (param4.field_f.length ^ -1)) {
                      break L88;
                    } else {
                      param5.field_f = param4.field_f;
                      var11 = 0;
                      L89: while (true) {
                        L90: {
                          if ((this.field_G ^ -1) >= (var11 ^ -1)) {
                            break L90;
                          } else {
                            param5.field_f[var11].a(167, this.field_f[var11]);
                            var11++;
                            if (var13 != 0) {
                              break L79;
                            } else {
                              if (var13 == 0) {
                                continue L89;
                              } else {
                                break L90;
                              }
                            }
                          }
                        }
                        if (var13 == 0) {
                          break L80;
                        } else {
                          break L88;
                        }
                      }
                    }
                  }
                }
                var11 = this.field_G;
                array$31 = new fd[var11];
                param4.field_f = array$31;
                param5.field_f = array$31;
                var12 = 0;
                L91: while (true) {
                  if ((this.field_G ^ -1) >= (var12 ^ -1)) {
                    break L80;
                  } else {
                    param5.field_f[var12] = this.field_f[var12].a((byte) 78);
                    var12++;
                    if (var13 != 0) {
                      break L79;
                    } else {
                      if (var13 == 0) {
                        continue L91;
                      } else {
                        break L80;
                      }
                    }
                  }
                }
              }
              param5.field_j = this.field_j;
              param5.field_q = this.field_q;
              break L79;
            }
            L92: {
              L93: {
                if (this.field_l) {
                  break L93;
                } else {
                  param5.field_l = false;
                  if (var13 == 0) {
                    break L92;
                  } else {
                    break L93;
                  }
                }
              }
              param5.field_v = this.field_v;
              param5.field_S = this.field_S;
              param5.field_l = true;
              param5.field_k = this.field_k;
              param5.field_U = this.field_U;
              param5.field_eb = this.field_eb;
              param5.field_M = this.field_M;
              param5.field_T = this.field_T;
              break L92;
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
            stackOut_325_0 = (np) (param5);
            stackIn_326_0 = stackOut_325_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L94: {
            var7 = decompiledCaughtException;
            stackOut_327_0 = (RuntimeException) (var7);
            stackOut_327_1 = new StringBuilder().append("np.B(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
            stackIn_330_0 = stackOut_327_0;
            stackIn_330_1 = stackOut_327_1;
            stackIn_328_0 = stackOut_327_0;
            stackIn_328_1 = stackOut_327_1;
            if (param4 == null) {
              stackOut_330_0 = (RuntimeException) ((Object) stackIn_330_0);
              stackOut_330_1 = (StringBuilder) ((Object) stackIn_330_1);
              stackOut_330_2 = "null";
              stackIn_331_0 = stackOut_330_0;
              stackIn_331_1 = stackOut_330_1;
              stackIn_331_2 = stackOut_330_2;
              break L94;
            } else {
              stackOut_328_0 = (RuntimeException) ((Object) stackIn_328_0);
              stackOut_328_1 = (StringBuilder) ((Object) stackIn_328_1);
              stackOut_328_2 = "{...}";
              stackIn_331_0 = stackOut_328_0;
              stackIn_331_1 = stackOut_328_1;
              stackIn_331_2 = stackOut_328_2;
              break L94;
            }
          }
          L95: {
            stackOut_331_0 = (RuntimeException) ((Object) stackIn_331_0);
            stackOut_331_1 = ((StringBuilder) (Object) stackIn_331_1).append(stackIn_331_2).append(',');
            stackIn_334_0 = stackOut_331_0;
            stackIn_334_1 = stackOut_331_1;
            stackIn_332_0 = stackOut_331_0;
            stackIn_332_1 = stackOut_331_1;
            if (param5 == null) {
              stackOut_334_0 = (RuntimeException) ((Object) stackIn_334_0);
              stackOut_334_1 = (StringBuilder) ((Object) stackIn_334_1);
              stackOut_334_2 = "null";
              stackIn_335_0 = stackOut_334_0;
              stackIn_335_1 = stackOut_334_1;
              stackIn_335_2 = stackOut_334_2;
              break L95;
            } else {
              stackOut_332_0 = (RuntimeException) ((Object) stackIn_332_0);
              stackOut_332_1 = (StringBuilder) ((Object) stackIn_332_1);
              stackOut_332_2 = "{...}";
              stackIn_335_0 = stackOut_332_0;
              stackIn_335_1 = stackOut_332_1;
              stackIn_335_2 = stackOut_332_2;
              break L95;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_335_0), stackIn_335_2 + ')');
        }
        return (ka) ((Object) stackIn_326_0);
    }

    private final void a(byte param0, boolean param1) {
        RuntimeException var3 = null;
        qf var3_ref = null;
        int var4 = 0;
        int var5 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var5 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              L2: {
                if ((this.field_ib * 6 ^ -1) < (this.field_R.field_cb.field_g.length ^ -1)) {
                  break L2;
                } else {
                  this.field_R.field_cb.field_h = 0;
                  if (var5 == 0) {
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              this.field_R.field_cb = new qf((this.field_ib - -100) * 6);
              break L1;
            }
            L3: {
              L4: {
                L5: {
                  var3_ref = this.field_R.field_cb;
                  if (this.field_R.field_O) {
                    break L5;
                  } else {
                    var4 = 0;
                    L6: while (true) {
                      L7: {
                        if (this.field_ib <= var4) {
                          break L7;
                        } else {
                          var3_ref.d((int) this.field_H[var4], -87);
                          var3_ref.d((int) this.field_z[var4], 124);
                          var3_ref.d((int) this.field_hb[var4], 120);
                          var4++;
                          if (var5 != 0) {
                            break L4;
                          } else {
                            if (var5 == 0) {
                              continue L6;
                            } else {
                              break L7;
                            }
                          }
                        }
                      }
                      if (var5 == 0) {
                        break L4;
                      } else {
                        break L5;
                      }
                    }
                  }
                }
                var4 = 0;
                L8: while (true) {
                  if (this.field_ib <= var4) {
                    break L4;
                  } else {
                    var3_ref.f(-1477662136, (int) this.field_H[var4]);
                    var3_ref.f(-1477662136, (int) this.field_z[var4]);
                    var3_ref.f(-1477662136, (int) this.field_hb[var4]);
                    var4++;
                    if (var5 != 0) {
                      break L3;
                    } else {
                      if (var5 == 0) {
                        continue L8;
                      } else {
                        break L4;
                      }
                    }
                  }
                }
              }
              if (0 == var3_ref.field_h) {
                break L3;
              } else {
                L9: {
                  if (param0 <= 0) {
                    break L9;
                  } else {
                    this.I(68, (int[]) null, -92, 111, -30, false, -95, (int[]) null);
                    break L9;
                  }
                }
                L10: {
                  L11: {
                    if (!param1) {
                      break L11;
                    } else {
                      L12: {
                        L13: {
                          if (null != this.field_jb) {
                            break L13;
                          } else {
                            this.field_jb = this.field_R.a(-81, var3_ref.field_h, 5123, true, var3_ref.field_g);
                            if (var5 == 0) {
                              break L12;
                            } else {
                              break L13;
                            }
                          }
                        }
                        this.field_jb.a(var3_ref.field_h, -11783, var3_ref.field_g, 5123);
                        break L12;
                      }
                      this.field_w.field_a = this.field_jb;
                      if (var5 == 0) {
                        break L10;
                      } else {
                        break L11;
                      }
                    }
                  }
                  this.field_w.field_a = this.field_R.a(-56, var3_ref.field_h, 5123, false, var3_ref.field_g);
                  break L10;
                }
                L14: {
                  if (!param1) {
                    this.field_gb = true;
                    break L14;
                  } else {
                    break L14;
                  }
                }
                decompiledRegionSelector0 = 1;
                break L0;
              }
            }
            decompiledRegionSelector0 = 0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw tba.a((Throwable) ((Object) var3), "np.D(" + param0 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
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
        int stackIn_4_0 = 0;
        int stackIn_4_1 = 0;
        int stackIn_23_0 = 0;
        int stackIn_23_1 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_3_1 = 0;
        int stackOut_22_0 = 0;
        int stackOut_22_1 = 0;
        var10 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            var5_int = 0;
            L1: while (true) {
              L2: {
                L3: {
                  L4: {
                    L5: {
                      if (var5_int >= this.field_W) {
                        break L5;
                      } else {
                        var6_int = 65535 & this.field_X[var5_int];
                        var7_int = (var6_int & 65466) >> -1742868182;
                        var8 = (var6_int & 905) >> -1997019193;
                        var9 = 127 & var6_int;
                        stackOut_3_0 = 0;
                        stackOut_3_1 = param0 ^ -1;
                        stackIn_23_0 = stackOut_3_0;
                        stackIn_23_1 = stackOut_3_1;
                        stackIn_4_0 = stackOut_3_0;
                        stackIn_4_1 = stackOut_3_1;
                        if (var10 != 0) {
                          L6: while (true) {
                            if (stackIn_23_0 >= stackIn_23_1) {
                              break L3;
                            } else {
                              var6 = this.field_r[var5_int];
                              var7 = this.field_f[var5_int];
                              var7.field_c = 16777215 & cla.field_m[this.field_X[var6.field_l] & 65535] | -16777216 & var7.field_c;
                              var5_int++;
                              if (var10 != 0) {
                                break L2;
                              } else {
                                if (var10 == 0) {
                                  stackOut_22_0 = var5_int;
                                  stackOut_22_1 = this.field_G;
                                  stackIn_23_0 = stackOut_22_0;
                                  stackIn_23_1 = stackOut_22_1;
                                  continue L6;
                                } else {
                                  break L4;
                                }
                              }
                            }
                          }
                        } else {
                          L7: {
                            if (stackIn_4_0 != stackIn_4_1) {
                              var7_int = var7_int + ((param0 - var7_int) * param3 >> 1070960103);
                              break L7;
                            } else {
                              break L7;
                            }
                          }
                          L8: {
                            if (param1 != -1) {
                              var8 = var8 - -((-var8 + param1) * param3 >> 164170823);
                              break L8;
                            } else {
                              break L8;
                            }
                          }
                          L9: {
                            if (-1 != param2) {
                              var9 = ((-var9 + param2) * param3 >> -1263656665) + var9;
                              break L9;
                            } else {
                              break L9;
                            }
                          }
                          this.field_X[var5_int] = (short)fh.a(fh.a(var7_int << 599206666, var8 << -495384409), var9);
                          var5_int++;
                          if (var10 == 0) {
                            continue L1;
                          } else {
                            break L5;
                          }
                        }
                      }
                    }
                    if (this.field_r != null) {
                      var5_int = 0;
                      L10: while (true) {
                        stackOut_22_0 = var5_int;
                        stackOut_22_1 = this.field_G;
                        stackIn_23_0 = stackOut_22_0;
                        stackIn_23_1 = stackOut_22_1;
                        if (stackIn_23_0 >= stackIn_23_1) {
                          break L3;
                        } else {
                          var6 = this.field_r[var5_int];
                          var7 = this.field_f[var5_int];
                          var7.field_c = 16777215 & cla.field_m[this.field_X[var6.field_l] & 65535] | -16777216 & var7.field_c;
                          var5_int++;
                          if (var10 != 0) {
                            break L2;
                          } else {
                            if (var10 == 0) {
                              continue L10;
                            } else {
                              break L4;
                            }
                          }
                        }
                      }
                    } else {
                      break L3;
                    }
                  }
                  break L3;
                }
                if (this.field_kb == null) {
                  break L2;
                } else {
                  this.field_kb.field_d = null;
                  break L2;
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
        np dupTemp$1 = null;
        RuntimeException var4 = null;
        np var4_ref = null;
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
              L2: {
                if (-2 == (param0 ^ -1)) {
                  break L2;
                } else {
                  L3: {
                    if ((param0 ^ -1) != -3) {
                      break L3;
                    } else {
                      var4_ref = this.field_R.field_Nb;
                      var5 = this.field_R.field_eb;
                      if (var6 == 0) {
                        break L1;
                      } else {
                        break L3;
                      }
                    }
                  }
                  L4: {
                    if (-4 != (param0 ^ -1)) {
                      break L4;
                    } else {
                      var4_ref = this.field_R.field_Ub;
                      var5 = this.field_R.field_sc;
                      if (var6 == 0) {
                        break L1;
                      } else {
                        break L4;
                      }
                    }
                  }
                  L5: {
                    if (4 == param0) {
                      break L5;
                    } else {
                      L6: {
                        if (-6 != (param0 ^ -1)) {
                          break L6;
                        } else {
                          var5 = this.field_R.field_Xb;
                          var4_ref = this.field_R.field_yb;
                          if (var6 == 0) {
                            break L1;
                          } else {
                            break L6;
                          }
                        }
                      }
                      dupTemp$1 = new np(this.field_R);
                      var5 = dupTemp$1;
                      var4_ref = dupTemp$1;
                      if (var6 == 0) {
                        break L1;
                      } else {
                        break L5;
                      }
                    }
                  }
                  var5 = this.field_R.field_D;
                  var4_ref = this.field_R.field_E;
                  if (var6 == 0) {
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              var4_ref = this.field_R.field_w;
              var5 = this.field_R.field_i;
              break L1;
            }
            L7: {
              stackOut_20_0 = this;
              stackOut_20_1 = param2;
              stackOut_20_2 = param1;
              stackIn_23_0 = stackOut_20_0;
              stackIn_23_1 = stackOut_20_1;
              stackIn_23_2 = stackOut_20_2;
              stackIn_21_0 = stackOut_20_0;
              stackIn_21_1 = stackOut_20_1;
              stackIn_21_2 = stackOut_20_2;
              if (-1 == (param0 ^ -1)) {
                stackOut_23_0 = this;
                stackOut_23_1 = stackIn_23_1;
                stackOut_23_2 = stackIn_23_2;
                stackOut_23_3 = 0;
                stackIn_24_0 = stackOut_23_0;
                stackIn_24_1 = stackOut_23_1;
                stackIn_24_2 = stackOut_23_2;
                stackIn_24_3 = stackOut_23_3;
                break L7;
              } else {
                stackOut_21_0 = this;
                stackOut_21_1 = stackIn_21_1;
                stackOut_21_2 = stackIn_21_2;
                stackOut_21_3 = 1;
                stackIn_24_0 = stackOut_21_0;
                stackIn_24_1 = stackOut_21_1;
                stackIn_24_2 = stackOut_21_2;
                stackIn_24_3 = stackOut_21_3;
                break L7;
              }
            }
            stackOut_24_0 = this.a(stackIn_24_1, stackIn_24_2, stackIn_24_3 != 0, -22857, var5, var4_ref);
            stackIn_25_0 = stackOut_24_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw tba.a((Throwable) ((Object) var4), "np.A(" + param0 + ',' + param1 + ',' + param2 + ')');
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
        int decompiledRegionSelector0 = 0;
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
            if (this.field_L != 0) {
              L1: {
                var5_ref = this.field_R.field_jd;
                if (this.field_l) {
                  break L1;
                } else {
                  this.c(2709);
                  break L1;
                }
              }
              L2: {
                L3: {
                  var6 = (oba) ((Object) param0);
                  it.field_a = var6.field_h * var5_ref.field_q + (var5_ref.field_j * var6.field_k + var5_ref.field_h * var6.field_r);
                  bja.field_b = var5_ref.field_o + (var6.field_o * var5_ref.field_q + (var6.field_p * var5_ref.field_h + var5_ref.field_j * var6.field_m));
                  var7 = bja.field_b + it.field_a * (float)this.field_eb;
                  var8 = bja.field_b + it.field_a * (float)this.field_v;
                  if (var7 > var8) {
                    break L3;
                  } else {
                    var10 = var8 + (float)this.field_M;
                    var9 = (float)(-this.field_M) + var7;
                    if (var23 == 0) {
                      break L2;
                    } else {
                      break L3;
                    }
                  }
                }
                var10 = (float)this.field_M + var7;
                var9 = (float)(-this.field_M) + var8;
                break L2;
              }
              if (this.field_R.field_m > var9) {
                if (var10 > (float)this.field_R.field_Gc) {
                  L4: {
                    L5: {
                      eqa.field_a = var5_ref.field_k * var6.field_r + var6.field_k * var5_ref.field_l + var6.field_h * var5_ref.field_s;
                      aka.field_B = var5_ref.field_s * var6.field_o + (var6.field_p * var5_ref.field_k + var5_ref.field_l * var6.field_m) + var5_ref.field_m;
                      var11 = aka.field_B + eqa.field_a * (float)this.field_eb;
                      var12 = (float)this.field_v * eqa.field_a + aka.field_B;
                      if (var11 > var12) {
                        break L5;
                      } else {
                        var14 = (var12 + (float)this.field_M) * (float)this.field_R.field_W;
                        var13 = (float)this.field_R.field_W * (var11 - (float)this.field_M);
                        if (var23 == 0) {
                          break L4;
                        } else {
                          break L5;
                        }
                      }
                    }
                    var14 = (var11 + (float)this.field_M) * (float)this.field_R.field_W;
                    var13 = (var12 - (float)this.field_M) * (float)this.field_R.field_W;
                    break L4;
                  }
                  if (this.field_R.field_od <= var13 / (float)param2) {
                    decompiledRegionSelector0 = 3;
                    break L0;
                  } else {
                    if (this.field_R.field_s >= var14 / (float)param2) {
                      decompiledRegionSelector0 = 4;
                      break L0;
                    } else {
                      L6: {
                        L7: {
                          nw.field_u = var5_ref.field_g * var6.field_h + (var5_ref.field_i * var6.field_k + var6.field_r * var5_ref.field_r);
                          ef.field_s = var5_ref.field_p + (var6.field_o * var5_ref.field_g + (var6.field_p * var5_ref.field_r + var5_ref.field_i * var6.field_m));
                          var15 = ef.field_s + nw.field_u * (float)this.field_eb;
                          var16 = (float)this.field_v * nw.field_u + ef.field_s;
                          if (var15 <= var16) {
                            break L7;
                          } else {
                            var18 = (float)this.field_R.field_kb * (var15 + (float)this.field_M);
                            var17 = (float)this.field_R.field_kb * (var16 - (float)this.field_M);
                            if (var23 == 0) {
                              break L6;
                            } else {
                              break L7;
                            }
                          }
                        }
                        var17 = (float)this.field_R.field_kb * (var15 - (float)this.field_M);
                        var18 = (var16 + (float)this.field_M) * (float)this.field_R.field_kb;
                        break L6;
                      }
                      if (this.field_R.field_Db <= var17 / (float)param2) {
                        decompiledRegionSelector0 = 5;
                        break L0;
                      } else {
                        if (this.field_R.field_nd < var18 / (float)param2) {
                          L8: {
                            L9: {
                              if (null != param1) {
                                break L9;
                              } else {
                                if (null == this.field_r) {
                                  break L8;
                                } else {
                                  break L9;
                                }
                              }
                            }
                            is.field_Ab = var5_ref.field_l * var6.field_l + var5_ref.field_k * var6.field_i + var6.field_j * var5_ref.field_s;
                            roa.field_u = var6.field_l * var5_ref.field_j + var5_ref.field_h * var6.field_i + var6.field_j * var5_ref.field_q;
                            mu.field_ub = var6.field_q * var5_ref.field_s + (var5_ref.field_l * var6.field_s + var5_ref.field_k * var6.field_g);
                            bva.field_c = var6.field_q * var5_ref.field_g + (var6.field_g * var5_ref.field_r + var6.field_s * var5_ref.field_i);
                            qi.field_L = var6.field_i * var5_ref.field_r + var5_ref.field_i * var6.field_l + var5_ref.field_g * var6.field_j;
                            kka.field_q = var5_ref.field_h * var6.field_g + var6.field_s * var5_ref.field_j + var6.field_q * var5_ref.field_q;
                            break L8;
                          }
                          L10: {
                            if (null != param1) {
                              var19 = this.field_U - -this.field_T >> 1115123041;
                              var20 = this.field_k + this.field_S >> -1348054783;
                              var21 = (int)(it.field_a * (float)this.field_eb + (roa.field_u * (float)var19 + bja.field_b) + kka.field_q * (float)var20);
                              var22 = (int)((float)var20 * kka.field_q + (it.field_a * (float)this.field_v + (roa.field_u * (float)var19 + bja.field_b)));
                              if ((var21 ^ -1) <= (this.field_R.field_Gc ^ -1)) {
                                break L10;
                              } else {
                                if ((this.field_R.field_Gc ^ -1) >= (var22 ^ -1)) {
                                  break L10;
                                } else {
                                  break L10;
                                }
                              }
                            } else {
                              break L10;
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
          L11: {
            var5 = decompiledCaughtException;
            stackOut_47_0 = (RuntimeException) (var5);
            stackOut_47_1 = new StringBuilder().append("np.Q(");
            stackIn_50_0 = stackOut_47_0;
            stackIn_50_1 = stackOut_47_1;
            stackIn_48_0 = stackOut_47_0;
            stackIn_48_1 = stackOut_47_1;
            if (param0 == null) {
              stackOut_50_0 = (RuntimeException) ((Object) stackIn_50_0);
              stackOut_50_1 = (StringBuilder) ((Object) stackIn_50_1);
              stackOut_50_2 = "null";
              stackIn_51_0 = stackOut_50_0;
              stackIn_51_1 = stackOut_50_1;
              stackIn_51_2 = stackOut_50_2;
              break L11;
            } else {
              stackOut_48_0 = (RuntimeException) ((Object) stackIn_48_0);
              stackOut_48_1 = (StringBuilder) ((Object) stackIn_48_1);
              stackOut_48_2 = "{...}";
              stackIn_51_0 = stackOut_48_0;
              stackIn_51_1 = stackOut_48_1;
              stackIn_51_2 = stackOut_48_2;
              break L11;
            }
          }
          L12: {
            stackOut_51_0 = (RuntimeException) ((Object) stackIn_51_0);
            stackOut_51_1 = ((StringBuilder) (Object) stackIn_51_1).append(stackIn_51_2).append(',');
            stackIn_54_0 = stackOut_51_0;
            stackIn_54_1 = stackOut_51_1;
            stackIn_52_0 = stackOut_51_0;
            stackIn_52_1 = stackOut_51_1;
            if (param1 == null) {
              stackOut_54_0 = (RuntimeException) ((Object) stackIn_54_0);
              stackOut_54_1 = (StringBuilder) ((Object) stackIn_54_1);
              stackOut_54_2 = "null";
              stackIn_55_0 = stackOut_54_0;
              stackIn_55_1 = stackOut_54_1;
              stackIn_55_2 = stackOut_54_2;
              break L12;
            } else {
              stackOut_52_0 = (RuntimeException) ((Object) stackIn_52_0);
              stackOut_52_1 = (StringBuilder) ((Object) stackIn_52_1);
              stackOut_52_2 = "{...}";
              stackIn_55_0 = stackOut_52_0;
              stackIn_55_1 = stackOut_52_1;
              stackIn_55_2 = stackOut_52_2;
              break L12;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_55_0), stackIn_55_2 + ',' + param2 + ',' + param3 + ')');
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
        RuntimeException var9 = null;
        int var9_int = 0;
        int var10 = 0;
        int var11 = 0;
        pm var11_ref_pm = null;
        int var12_int = 0;
        int[] var12 = null;
        fd var12_ref = null;
        int var13 = 0;
        int[] var13_ref_int__ = null;
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
        int stackIn_5_0 = 0;
        int stackIn_5_1 = 0;
        int stackIn_27_0 = 0;
        int stackIn_27_1 = 0;
        Object stackIn_44_0 = null;
        Object stackIn_49_0 = null;
        int stackIn_68_0 = 0;
        int stackIn_68_1 = 0;
        Object stackIn_75_0 = null;
        short[] stackIn_75_1 = null;
        int stackIn_101_0 = 0;
        int stackIn_101_1 = 0;
        int stackIn_108_0 = 0;
        Object stackIn_110_0 = null;
        Object stackIn_110_1 = null;
        Object stackIn_112_0 = null;
        short[] stackIn_112_1 = null;
        int stackIn_122_0 = 0;
        Object stackIn_140_0 = null;
        Object stackIn_140_1 = null;
        int stackIn_155_0 = 0;
        int stackIn_157_0 = 0;
        int stackIn_160_0 = 0;
        int stackIn_170_0 = 0;
        int stackIn_172_0 = 0;
        int stackIn_174_0 = 0;
        int stackIn_177_0 = 0;
        int stackIn_187_0 = 0;
        int stackIn_245_0 = 0;
        int stackIn_247_0 = 0;
        int stackIn_250_0 = 0;
        int stackIn_260_0 = 0;
        int stackIn_288_0 = 0;
        int stackIn_288_1 = 0;
        int stackIn_322_0 = 0;
        int stackIn_322_1 = 0;
        int stackIn_332_0 = 0;
        int stackIn_332_1 = 0;
        Object stackIn_339_0 = null;
        int stackIn_373_0 = 0;
        int stackIn_373_1 = 0;
        Object stackIn_375_0 = null;
        RuntimeException stackIn_433_0 = null;
        StringBuilder stackIn_433_1 = null;
        RuntimeException stackIn_435_0 = null;
        StringBuilder stackIn_435_1 = null;
        RuntimeException stackIn_436_0 = null;
        StringBuilder stackIn_436_1 = null;
        String stackIn_436_2 = null;
        RuntimeException stackIn_437_0 = null;
        StringBuilder stackIn_437_1 = null;
        RuntimeException stackIn_439_0 = null;
        StringBuilder stackIn_439_1 = null;
        RuntimeException stackIn_440_0 = null;
        StringBuilder stackIn_440_1 = null;
        String stackIn_440_2 = null;
        Throwable caughtException = null;
        int stackOut_4_0 = 0;
        int stackOut_4_1 = 0;
        int stackOut_26_0 = 0;
        int stackOut_26_1 = 0;
        Object stackOut_43_0 = null;
        Object stackOut_48_0 = null;
        int stackOut_67_0 = 0;
        int stackOut_67_1 = 0;
        Object stackOut_74_0 = null;
        short[] stackOut_74_1 = null;
        int stackOut_100_0 = 0;
        int stackOut_100_1 = 0;
        int stackOut_107_0 = 0;
        Object stackOut_109_0 = null;
        Object stackOut_109_1 = null;
        Object stackOut_110_0 = null;
        short[] stackOut_110_1 = null;
        int stackOut_121_0 = 0;
        Object stackOut_139_0 = null;
        Object stackOut_139_1 = null;
        int stackOut_154_0 = 0;
        int stackOut_156_0 = 0;
        int stackOut_159_0 = 0;
        int stackOut_169_0 = 0;
        int stackOut_171_0 = 0;
        int stackOut_173_0 = 0;
        int stackOut_176_0 = 0;
        int stackOut_186_0 = 0;
        int stackOut_244_0 = 0;
        int stackOut_246_0 = 0;
        int stackOut_249_0 = 0;
        int stackOut_259_0 = 0;
        int stackOut_287_0 = 0;
        int stackOut_287_1 = 0;
        int stackOut_321_0 = 0;
        int stackOut_321_1 = 0;
        int stackOut_331_0 = 0;
        int stackOut_331_1 = 0;
        Object stackOut_338_0 = null;
        int stackOut_372_0 = 0;
        int stackOut_372_1 = 0;
        Object stackOut_374_0 = null;
        RuntimeException stackOut_432_0 = null;
        StringBuilder stackOut_432_1 = null;
        RuntimeException stackOut_433_0 = null;
        StringBuilder stackOut_433_1 = null;
        String stackOut_433_2 = null;
        RuntimeException stackOut_435_0 = null;
        StringBuilder stackOut_435_1 = null;
        String stackOut_435_2 = null;
        RuntimeException stackOut_436_0 = null;
        StringBuilder stackOut_436_1 = null;
        RuntimeException stackOut_437_0 = null;
        StringBuilder stackOut_437_1 = null;
        String stackOut_437_2 = null;
        RuntimeException stackOut_439_0 = null;
        StringBuilder stackOut_439_1 = null;
        String stackOut_439_2 = null;
        int statePc = 0;
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
                        statePc = 34;
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
                        statePc = 26;
                    } else {
                        statePc = 4;
                    }
                    continue stateLoop;
                }
                case 4: {
                    var12_int = param1[var11];
                    stackOut_4_0 = var12_int ^ -1;
                    stackOut_4_1 = this.field_d.length ^ -1;
                    stackIn_27_0 = stackOut_4_0;
                    stackIn_27_1 = stackOut_4_1;
                    stackIn_5_0 = stackOut_4_0;
                    stackIn_5_1 = stackOut_4_1;
                    if (var47 != 0) {
                        statePc = 27;
                    } else {
                        statePc = 5;
                    }
                    continue stateLoop;
                }
                case 5: {
                    if (stackIn_5_0 > stackIn_5_1) {
                        statePc = 9;
                    } else {
                        statePc = 24;
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
                        statePc = 24;
                    } else {
                        statePc = 11;
                    }
                    continue stateLoop;
                }
                case 11: {
                    var15 = var13_ref_int__[var14_int];
                    if (var47 != 0) {
                        statePc = 25;
                    } else {
                        statePc = 12;
                    }
                    continue stateLoop;
                }
                case 12: {
                    if (null == this.field_db) {
                        statePc = 21;
                    } else {
                        statePc = 15;
                    }
                    continue stateLoop;
                }
                case 15: {
                    if (-1 != (param6 & this.field_db[var15] ^ -1)) {
                        statePc = 21;
                    } else {
                        statePc = 18;
                    }
                    continue stateLoop;
                }
                case 18: {
                    if (var47 == 0) {
                        statePc = 23;
                    } else {
                        statePc = 21;
                    }
                    continue stateLoop;
                }
                case 21: {
                    rp.field_i = rp.field_i + this.field_P[var15];
                    via.field_e = via.field_e + this.field_K[var15];
                    dj.field_b = dj.field_b + this.field_A[var15];
                    var10++;
                    statePc = 23;
                    continue stateLoop;
                }
                case 23: {
                    var14_int++;
                    if (var47 == 0) {
                        statePc = 10;
                    } else {
                        statePc = 24;
                    }
                    continue stateLoop;
                }
                case 24: {
                    var11++;
                    statePc = 25;
                    continue stateLoop;
                }
                case 25: {
                    if (var47 == 0) {
                        statePc = 3;
                    } else {
                        statePc = 26;
                    }
                    continue stateLoop;
                }
                case 26: {
                    stackOut_26_0 = -1;
                    stackOut_26_1 = var10 ^ -1;
                    stackIn_27_0 = stackOut_26_0;
                    stackIn_27_1 = stackOut_26_1;
                    statePc = 27;
                    continue stateLoop;
                }
                case 27: {
                    if (stackIn_27_0 > stackIn_27_1) {
                        statePc = 31;
                    } else {
                        statePc = 28;
                    }
                    continue stateLoop;
                }
                case 28: {
                    via.field_e = param3;
                    dj.field_b = param4;
                    rp.field_i = param2;
                    if (var47 == 0) {
                        statePc = 33;
                    } else {
                        statePc = 31;
                    }
                    continue stateLoop;
                }
                case 31: {
                    via.field_e = param3 + via.field_e / var10;
                    dj.field_b = dj.field_b / var10 + param4;
                    rp.field_i = param2 + rp.field_i / var10;
                    vea.field_b = true;
                    statePc = 33;
                    continue stateLoop;
                }
                case 33: {
                    return;
                }
                case 34: {
                    if (param0 == 1) {
                        statePc = 37;
                    } else {
                        statePc = 61;
                    }
                    continue stateLoop;
                }
                case 37: {
                    if (param7 != null) {
                        statePc = 40;
                    } else {
                        statePc = 41;
                    }
                    continue stateLoop;
                }
                case 40: {
                    var10 = 8192 + (param2 * param7[0] - (-(param3 * param7[1]) - param7[2] * param4)) >> 1944742510;
                    var11 = 8192 + param7[4] * param3 + (param7[3] * param2 - -(param7[5] * param4)) >> -467641618;
                    var12_int = param7[6] * param2 + (param7[7] * param3 - -(param4 * param7[8]) - -8192) >> 1597913358;
                    param4 = var12_int;
                    param3 = var11;
                    param2 = var10;
                    statePc = 41;
                    continue stateLoop;
                }
                case 41: {
                    param2 = param2 << 4;
                    param4 = param4 << 4;
                    param3 = param3 << 4;
                    var10 = 0;
                    statePc = 42;
                    continue stateLoop;
                }
                case 42: {
                    if (var9_int <= var10) {
                        statePc = 60;
                    } else {
                        statePc = 43;
                    }
                    continue stateLoop;
                }
                case 43: {
                    var11 = param1[var10];
                    stackOut_43_0 = this;
                    stackIn_44_0 = stackOut_43_0;
                    statePc = 44;
                    continue stateLoop;
                }
                case 44: {
                    if ((((np) (this)).field_d.length ^ -1) < (var11 ^ -1)) {
                        statePc = 46;
                    } else {
                        statePc = 59;
                    }
                    continue stateLoop;
                }
                case 46: {
                    var12 = this.field_d[var11];
                    var13 = 0;
                    statePc = 47;
                    continue stateLoop;
                }
                case 47: {
                    if ((var12.length ^ -1) >= (var13 ^ -1)) {
                        statePc = 59;
                    } else {
                        statePc = 48;
                    }
                    continue stateLoop;
                }
                case 48: {
                    var14_int = var12[var13];
                    stackOut_48_0 = this;
                    stackIn_44_0 = stackOut_48_0;
                    stackIn_49_0 = stackOut_48_0;
                    if (var47 != 0) {
                        statePc = 44;
                    } else {
                        statePc = 49;
                    }
                    continue stateLoop;
                }
                case 49: {
                    if (((np) (this)).field_db == null) {
                        statePc = 56;
                    } else {
                        statePc = 50;
                    }
                    continue stateLoop;
                }
                case 50: {
                    if ((param6 & this.field_db[var14_int]) != 0) {
                        statePc = 56;
                    } else {
                        statePc = 53;
                    }
                    continue stateLoop;
                }
                case 53: {
                    if (var47 == 0) {
                        statePc = 58;
                    } else {
                        statePc = 56;
                    }
                    continue stateLoop;
                }
                case 56: {
                    this.field_P[var14_int] = this.field_P[var14_int] + param2;
                    this.field_K[var14_int] = this.field_K[var14_int] + param3;
                    this.field_A[var14_int] = this.field_A[var14_int] + param4;
                    statePc = 58;
                    continue stateLoop;
                }
                case 58: {
                    var13++;
                    if (var47 == 0) {
                        statePc = 47;
                    } else {
                        statePc = 59;
                    }
                    continue stateLoop;
                }
                case 59: {
                    var10++;
                    if (var47 == 0) {
                        statePc = 42;
                    } else {
                        statePc = 60;
                    }
                    continue stateLoop;
                }
                case 60: {
                    return;
                }
                case 61: {
                    if (param0 == 2) {
                        statePc = 64;
                    } else {
                        statePc = 209;
                    }
                    continue stateLoop;
                }
                case 64: {
                    if (null != param7) {
                        statePc = 151;
                    } else {
                        statePc = 65;
                    }
                    continue stateLoop;
                }
                case 65: {
                    var10 = 0;
                    statePc = 66;
                    continue stateLoop;
                }
                case 66: {
                    if (var9_int <= var10) {
                        statePc = 96;
                    } else {
                        statePc = 67;
                    }
                    continue stateLoop;
                }
                case 67: {
                    var11 = param1[var10];
                    stackOut_67_0 = this.field_d.length;
                    stackOut_67_1 = var11;
                    stackIn_101_0 = stackOut_67_0;
                    stackIn_101_1 = stackOut_67_1;
                    stackIn_68_0 = stackOut_67_0;
                    stackIn_68_1 = stackOut_67_1;
                    if (var47 != 0) {
                        statePc = 101;
                    } else {
                        statePc = 68;
                    }
                    continue stateLoop;
                }
                case 68: {
                    if (stackIn_68_0 > stackIn_68_1) {
                        statePc = 72;
                    } else {
                        statePc = 95;
                    }
                    continue stateLoop;
                }
                case 72: {
                    var12 = this.field_d[var11];
                    var13 = 0;
                    statePc = 73;
                    continue stateLoop;
                }
                case 73: {
                    if ((var13 ^ -1) <= (var12.length ^ -1)) {
                        statePc = 95;
                    } else {
                        statePc = 74;
                    }
                    continue stateLoop;
                }
                case 74: {
                    var14_int = var12[var13];
                    stackOut_74_0 = null;
                    stackOut_74_1 = this.field_db;
                    stackIn_112_0 = stackOut_74_0;
                    stackIn_112_1 = stackOut_74_1;
                    stackIn_75_0 = stackOut_74_0;
                    stackIn_75_1 = stackOut_74_1;
                    if (var47 != 0) {
                        statePc = 112;
                    } else {
                        statePc = 75;
                    }
                    continue stateLoop;
                }
                case 75: {
                    if (stackIn_75_0 == stackIn_75_1) {
                        statePc = 81;
                    } else {
                        statePc = 78;
                    }
                    continue stateLoop;
                }
                case 78: {
                    if (-1 == (this.field_db[var14_int] & param6 ^ -1)) {
                        statePc = 94;
                    } else {
                        statePc = 81;
                    }
                    continue stateLoop;
                }
                case 81: {
                    this.field_P[var14_int] = this.field_P[var14_int] - rp.field_i;
                    this.field_K[var14_int] = this.field_K[var14_int] - via.field_e;
                    this.field_A[var14_int] = this.field_A[var14_int] - dj.field_b;
                    if (-1 != (param4 ^ -1)) {
                        statePc = 86;
                    } else {
                        statePc = 87;
                    }
                    continue stateLoop;
                }
                case 86: {
                    var15 = qu.field_b[param4];
                    var16 = qu.field_d[param4];
                    var17 = var15 * this.field_K[var14_int] - (-(this.field_P[var14_int] * var16) - 16383) >> 1403726254;
                    this.field_K[var14_int] = 16383 + (var16 * this.field_K[var14_int] + -(var15 * this.field_P[var14_int])) >> -1429456306;
                    this.field_P[var14_int] = var17;
                    statePc = 87;
                    continue stateLoop;
                }
                case 87: {
                    if ((param2 ^ -1) != -1) {
                        statePc = 90;
                    } else {
                        statePc = 91;
                    }
                    continue stateLoop;
                }
                case 90: {
                    var15 = qu.field_b[param2];
                    var16 = qu.field_d[param2];
                    var17 = 16383 + (var16 * this.field_K[var14_int] + -(this.field_A[var14_int] * var15)) >> -1602330834;
                    this.field_A[var14_int] = 16383 + (var15 * this.field_K[var14_int] + var16 * this.field_A[var14_int]) >> -2069403378;
                    this.field_K[var14_int] = var17;
                    statePc = 91;
                    continue stateLoop;
                }
                case 91: {
                    if (param3 == 0) {
                        statePc = 93;
                    } else {
                        statePc = 92;
                    }
                    continue stateLoop;
                }
                case 92: {
                    var15 = qu.field_b[param3];
                    var16 = qu.field_d[param3];
                    var17 = 16383 + this.field_P[var14_int] * var16 + var15 * this.field_A[var14_int] >> -217774674;
                    this.field_A[var14_int] = 16383 + var16 * this.field_A[var14_int] + -(this.field_P[var14_int] * var15) >> 609400782;
                    this.field_P[var14_int] = var17;
                    statePc = 93;
                    continue stateLoop;
                }
                case 93: {
                    this.field_P[var14_int] = this.field_P[var14_int] + rp.field_i;
                    this.field_K[var14_int] = this.field_K[var14_int] + via.field_e;
                    this.field_A[var14_int] = this.field_A[var14_int] + dj.field_b;
                    statePc = 94;
                    continue stateLoop;
                }
                case 94: {
                    var13++;
                    if (var47 == 0) {
                        statePc = 73;
                    } else {
                        statePc = 95;
                    }
                    continue stateLoop;
                }
                case 95: {
                    var10++;
                    if (var47 == 0) {
                        statePc = 66;
                    } else {
                        statePc = 96;
                    }
                    continue stateLoop;
                }
                case 96: {
                    if (param5) {
                        statePc = 99;
                    } else {
                        statePc = 208;
                    }
                    continue stateLoop;
                }
                case 99: {
                    var10 = 0;
                    statePc = 100;
                    continue stateLoop;
                }
                case 100: {
                    stackOut_100_0 = var10 ^ -1;
                    stackOut_100_1 = var9_int ^ -1;
                    stackIn_101_0 = stackOut_100_0;
                    stackIn_101_1 = stackOut_100_1;
                    statePc = 101;
                    continue stateLoop;
                }
                case 101: {
                    if (stackIn_101_0 <= stackIn_101_1) {
                        statePc = 139;
                    } else {
                        statePc = 102;
                    }
                    continue stateLoop;
                }
                case 102: {
                    var11 = param1[var10];
                    if (var47 != 0) {
                        statePc = 147;
                    } else {
                        statePc = 103;
                    }
                    continue stateLoop;
                }
                case 103: {
                    if (var11 >= this.field_d.length) {
                        statePc = 138;
                    } else {
                        statePc = 106;
                    }
                    continue stateLoop;
                }
                case 106: {
                    var12 = this.field_d[var11];
                    var13 = 0;
                    statePc = 107;
                    continue stateLoop;
                }
                case 107: {
                    stackOut_107_0 = var13 ^ -1;
                    stackIn_108_0 = stackOut_107_0;
                    statePc = 108;
                    continue stateLoop;
                }
                case 108: {
                    if (stackIn_108_0 <= (var12.length ^ -1)) {
                        statePc = 138;
                    } else {
                        statePc = 109;
                    }
                    continue stateLoop;
                }
                case 109: {
                    var14_int = var12[var13];
                    stackOut_109_0 = null;
                    stackOut_109_1 = this;
                    stackIn_140_0 = stackOut_109_0;
                    stackIn_140_1 = stackOut_109_1;
                    stackIn_110_0 = stackOut_109_0;
                    stackIn_110_1 = stackOut_109_1;
                    if (var47 != 0) {
                        statePc = 140;
                    } else {
                        statePc = 110;
                    }
                    continue stateLoop;
                }
                case 110: {
                    stackOut_110_0 = stackIn_110_0;
                    stackOut_110_1 = ((np) (this)).field_db;
                    stackIn_112_0 = stackOut_110_0;
                    stackIn_112_1 = stackOut_110_1;
                    statePc = 112;
                    continue stateLoop;
                }
                case 112: {
                    if (stackIn_112_0 == stackIn_112_1) {
                        statePc = 119;
                    } else {
                        statePc = 113;
                    }
                    continue stateLoop;
                }
                case 113: {
                    if ((this.field_db[var14_int] & param6) != 0) {
                        statePc = 119;
                    } else {
                        statePc = 116;
                    }
                    continue stateLoop;
                }
                case 116: {
                    if (var47 == 0) {
                        statePc = 137;
                    } else {
                        statePc = 119;
                    }
                    continue stateLoop;
                }
                case 119: {
                    var15 = this.field_e[var14_int];
                    var16 = this.field_e[1 + var14_int];
                    var17 = var15;
                    statePc = 120;
                    continue stateLoop;
                }
                case 120: {
                    if ((var17 ^ -1) <= (var16 ^ -1)) {
                        statePc = 137;
                    } else {
                        statePc = 121;
                    }
                    continue stateLoop;
                }
                case 121: {
                    var18 = -1 + this.field_q[var17];
                    stackOut_121_0 = var18 ^ -1;
                    stackIn_108_0 = stackOut_121_0;
                    stackIn_122_0 = stackOut_121_0;
                    if (var47 != 0) {
                        statePc = 108;
                    } else {
                        statePc = 122;
                    }
                    continue stateLoop;
                }
                case 122: {
                    if (stackIn_122_0 != 0) {
                        statePc = 126;
                    } else {
                        statePc = 123;
                    }
                    continue stateLoop;
                }
                case 123: {
                    if (var47 == 0) {
                        statePc = 137;
                    } else {
                        statePc = 126;
                    }
                    continue stateLoop;
                }
                case 126: {
                    if ((param4 ^ -1) == -1) {
                        statePc = 130;
                    } else {
                        statePc = 129;
                    }
                    continue stateLoop;
                }
                case 129: {
                    var19 = qu.field_b[param4];
                    var20 = qu.field_d[param4];
                    var21 = 16383 + this.field_E[var18] * var20 + var19 * this.field_Y[var18] >> 1208636462;
                    this.field_Y[var18] = (short)(-(var19 * this.field_E[var18]) + (var20 * this.field_Y[var18] - -16383) >> 670421070);
                    this.field_E[var18] = (short)var21;
                    statePc = 130;
                    continue stateLoop;
                }
                case 130: {
                    if (0 != param2) {
                        statePc = 133;
                    } else {
                        statePc = 134;
                    }
                    continue stateLoop;
                }
                case 133: {
                    var19 = qu.field_b[param2];
                    var20 = qu.field_d[param2];
                    var21 = var20 * this.field_Y[var18] - var19 * this.field_cb[var18] - -16383 >> 2059641422;
                    this.field_cb[var18] = (short)(16383 + (this.field_cb[var18] * var20 + this.field_Y[var18] * var19) >> 238391182);
                    this.field_Y[var18] = (short)var21;
                    statePc = 134;
                    continue stateLoop;
                }
                case 134: {
                    if ((param3 ^ -1) == -1) {
                        statePc = 136;
                    } else {
                        statePc = 135;
                    }
                    continue stateLoop;
                }
                case 135: {
                    var19 = qu.field_b[param3];
                    var20 = qu.field_d[param3];
                    var21 = 16383 + this.field_cb[var18] * var19 - -(var20 * this.field_E[var18]) >> 1593143982;
                    this.field_cb[var18] = (short)(this.field_cb[var18] * var20 + (-(var19 * this.field_E[var18]) + 16383) >> 1390824398);
                    this.field_E[var18] = (short)var21;
                    statePc = 136;
                    continue stateLoop;
                }
                case 136: {
                    var17++;
                    if (var47 == 0) {
                        statePc = 120;
                    } else {
                        statePc = 137;
                    }
                    continue stateLoop;
                }
                case 137: {
                    var13++;
                    if (var47 == 0) {
                        statePc = 107;
                    } else {
                        statePc = 138;
                    }
                    continue stateLoop;
                }
                case 138: {
                    var10++;
                    if (var47 == 0) {
                        statePc = 100;
                    } else {
                        statePc = 139;
                    }
                    continue stateLoop;
                }
                case 139: {
                    stackOut_139_0 = null;
                    stackOut_139_1 = this;
                    stackIn_140_0 = stackOut_139_0;
                    stackIn_140_1 = stackOut_139_1;
                    statePc = 140;
                    continue stateLoop;
                }
                case 140: {
                    if (stackIn_140_0 != ((np) (this)).field_F) {
                        statePc = 147;
                    } else {
                        statePc = 141;
                    }
                    continue stateLoop;
                }
                case 141: {
                    if (this.field_kb != null) {
                        statePc = 146;
                    } else {
                        statePc = 147;
                    }
                    continue stateLoop;
                }
                case 146: {
                    this.field_kb.field_d = null;
                    statePc = 147;
                    continue stateLoop;
                }
                case 147: {
                    if (this.field_F == null) {
                        statePc = 208;
                    } else {
                        statePc = 148;
                    }
                    continue stateLoop;
                }
                case 148: {
                    this.field_F.field_d = null;
                    if (var47 == 0) {
                        statePc = 208;
                    } else {
                        statePc = 151;
                    }
                    continue stateLoop;
                }
                case 151: {
                    var10 = param7[9] << -636635996;
                    var11 = param7[10] << -1063123996;
                    var12_int = param7[11] << -1022980572;
                    var13 = param7[12] << -1520383804;
                    var14_int = param7[13] << 1040835012;
                    var15 = param7[14] << 987565796;
                    if (!vea.field_b) {
                        statePc = 153;
                    } else {
                        statePc = 152;
                    }
                    continue stateLoop;
                }
                case 152: {
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
                    statePc = 153;
                    continue stateLoop;
                }
                case 153: {
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
                    statePc = 154;
                    continue stateLoop;
                }
                case 154: {
                    stackOut_154_0 = 3;
                    stackIn_155_0 = stackOut_154_0;
                    statePc = 155;
                    continue stateLoop;
                }
                case 155: {
                    if (stackIn_155_0 <= var32) {
                        statePc = 169;
                    } else {
                        statePc = 156;
                    }
                    continue stateLoop;
                }
                case 156: {
                    stackOut_156_0 = 0;
                    stackIn_170_0 = stackOut_156_0;
                    stackIn_157_0 = stackOut_156_0;
                    if (var47 != 0) {
                        statePc = 170;
                    } else {
                        statePc = 157;
                    }
                    continue stateLoop;
                }
                case 157: {
                    var33 = stackIn_157_0;
                    statePc = 158;
                    continue stateLoop;
                }
                case 158: {
                    if ((var33 ^ -1) <= -4) {
                        statePc = 168;
                    } else {
                        statePc = 159;
                    }
                    continue stateLoop;
                }
                case 159: {
                    var34 = 0;
                    stackOut_159_0 = 0;
                    stackIn_155_0 = stackOut_159_0;
                    stackIn_160_0 = stackOut_159_0;
                    if (var47 != 0) {
                        statePc = 155;
                    } else {
                        statePc = 160;
                    }
                    continue stateLoop;
                }
                case 160: {
                    var35_int = stackIn_160_0;
                    statePc = 161;
                    continue stateLoop;
                }
                case 161: {
                    if ((var35_int ^ -1) <= -4) {
                        statePc = 166;
                    } else {
                        statePc = 162;
                    }
                    continue stateLoop;
                }
                case 162: {
                    var34 = var34 + param7[var35_int + var33 * 3] * var16_ref_int__[var35_int + var32 * 3];
                    var35_int++;
                    if (var47 != 0) {
                        statePc = 167;
                    } else {
                        statePc = 163;
                    }
                    continue stateLoop;
                }
                case 163: {
                    if (var47 == 0) {
                        statePc = 161;
                    } else {
                        statePc = 166;
                    }
                    continue stateLoop;
                }
                case 166: {
                    var31_ref_int__[var32 * 3 - -var33] = 8192 + var34 >> 1803012750;
                    var33++;
                    statePc = 167;
                    continue stateLoop;
                }
                case 167: {
                    if (var47 == 0) {
                        statePc = 158;
                    } else {
                        statePc = 168;
                    }
                    continue stateLoop;
                }
                case 168: {
                    var32++;
                    if (var47 == 0) {
                        statePc = 154;
                    } else {
                        statePc = 169;
                    }
                    continue stateLoop;
                }
                case 169: {
                    var32 = 8192 + (var13 * var16_ref_int__[0] - -(var14_int * var16_ref_int__[1])) - -(var16_ref_int__[2] * var15) >> -244496178;
                    stackOut_169_0 = var16_ref_int__[5] * var15 + var16_ref_int__[4] * var14_int + var16_ref_int__[3] * var13 + 8192 >> -2016182962;
                    stackIn_170_0 = stackOut_169_0;
                    statePc = 170;
                    continue stateLoop;
                }
                case 170: {
                    var33 = stackIn_170_0;
                    var32 = var32 + var28;
                    var33 = var33 + var29_int;
                    var34 = 8192 + var16_ref_int__[6] * var13 + var14_int * var16_ref_int__[7] - -(var15 * var16_ref_int__[8]) >> 994807150;
                    var34 = var34 + var30;
                    var35 = new int[9];
                    var36 = 0;
                    statePc = 171;
                    continue stateLoop;
                }
                case 171: {
                    stackOut_171_0 = 3;
                    stackIn_172_0 = stackOut_171_0;
                    statePc = 172;
                    continue stateLoop;
                }
                case 172: {
                    if (stackIn_172_0 <= var36) {
                        statePc = 186;
                    } else {
                        statePc = 173;
                    }
                    continue stateLoop;
                }
                case 173: {
                    stackOut_173_0 = 0;
                    stackIn_187_0 = stackOut_173_0;
                    stackIn_174_0 = stackOut_173_0;
                    if (var47 != 0) {
                        statePc = 187;
                    } else {
                        statePc = 174;
                    }
                    continue stateLoop;
                }
                case 174: {
                    var37 = stackIn_174_0;
                    statePc = 175;
                    continue stateLoop;
                }
                case 175: {
                    if (-4 >= (var37 ^ -1)) {
                        statePc = 185;
                    } else {
                        statePc = 176;
                    }
                    continue stateLoop;
                }
                case 176: {
                    var38 = 0;
                    stackOut_176_0 = 0;
                    stackIn_172_0 = stackOut_176_0;
                    stackIn_177_0 = stackOut_176_0;
                    if (var47 != 0) {
                        statePc = 172;
                    } else {
                        statePc = 177;
                    }
                    continue stateLoop;
                }
                case 177: {
                    var39 = stackIn_177_0;
                    statePc = 178;
                    continue stateLoop;
                }
                case 178: {
                    if ((var39 ^ -1) <= -4) {
                        statePc = 183;
                    } else {
                        statePc = 179;
                    }
                    continue stateLoop;
                }
                case 179: {
                    var38 = var38 + param7[var39 + 3 * var36] * var31_ref_int__[var37 - -(var39 * 3)];
                    var39++;
                    if (var47 != 0) {
                        statePc = 184;
                    } else {
                        statePc = 180;
                    }
                    continue stateLoop;
                }
                case 180: {
                    if (var47 == 0) {
                        statePc = 178;
                    } else {
                        statePc = 183;
                    }
                    continue stateLoop;
                }
                case 183: {
                    var35[3 * var36 - -var37] = 8192 + var38 >> -1117311218;
                    var37++;
                    statePc = 184;
                    continue stateLoop;
                }
                case 184: {
                    if (var47 == 0) {
                        statePc = 175;
                    } else {
                        statePc = 185;
                    }
                    continue stateLoop;
                }
                case 185: {
                    var36++;
                    if (var47 == 0) {
                        statePc = 171;
                    } else {
                        statePc = 186;
                    }
                    continue stateLoop;
                }
                case 186: {
                    var36 = 8192 + (var34 * param7[2] + var32 * param7[0] + param7[1] * var33) >> 540243854;
                    stackOut_186_0 = 8192 + (var33 * param7[4] + param7[3] * var32 + param7[5] * var34) >> 2100233646;
                    stackIn_187_0 = stackOut_186_0;
                    statePc = 187;
                    continue stateLoop;
                }
                case 187: {
                    var37 = stackIn_187_0;
                    var36 = var36 + var10;
                    var37 = var37 + var11;
                    var38 = var33 * param7[7] + (param7[6] * var32 + param7[8] * var34) + 8192 >> -877240146;
                    var38 = var38 + var12_int;
                    var39 = 0;
                    statePc = 188;
                    continue stateLoop;
                }
                case 188: {
                    if ((var9_int ^ -1) >= (var39 ^ -1)) {
                        statePc = 208;
                    } else {
                        statePc = 189;
                    }
                    continue stateLoop;
                }
                case 189: {
                    var40 = param1[var39];
                    if ((var40 ^ -1) > (this.field_d.length ^ -1)) {
                        statePc = 192;
                    } else {
                        statePc = 206;
                    }
                    continue stateLoop;
                }
                case 192: {
                    var41 = this.field_d[var40];
                    var42 = 0;
                    statePc = 193;
                    continue stateLoop;
                }
                case 193: {
                    if (var41.length <= var42) {
                        statePc = 206;
                    } else {
                        statePc = 194;
                    }
                    continue stateLoop;
                }
                case 194: {
                    var43 = var41[var42];
                    if (var47 != 0) {
                        statePc = 207;
                    } else {
                        statePc = 195;
                    }
                    continue stateLoop;
                }
                case 195: {
                    if (null == this.field_db) {
                        statePc = 204;
                    } else {
                        statePc = 198;
                    }
                    continue stateLoop;
                }
                case 198: {
                    if ((this.field_db[var43] & param6) != 0) {
                        statePc = 204;
                    } else {
                        statePc = 201;
                    }
                    continue stateLoop;
                }
                case 201: {
                    if (var47 == 0) {
                        statePc = 205;
                    } else {
                        statePc = 204;
                    }
                    continue stateLoop;
                }
                case 204: {
                    var44 = 8192 + var35[2] * this.field_A[var43] + (this.field_P[var43] * var35[0] + this.field_K[var43] * var35[1]) >> -463601330;
                    var45 = var35[5] * this.field_A[var43] + (this.field_K[var43] * var35[4] + this.field_P[var43] * var35[3] - -8192) >> 1938377006;
                    var44 = var44 + var36;
                    var45 = var45 + var37;
                    var46 = var35[8] * this.field_A[var43] + this.field_K[var43] * var35[7] + (this.field_P[var43] * var35[6] - -8192) >> 1589620046;
                    var46 = var46 + var38;
                    this.field_P[var43] = var44;
                    this.field_K[var43] = var45;
                    this.field_A[var43] = var46;
                    statePc = 205;
                    continue stateLoop;
                }
                case 205: {
                    var42++;
                    if (var47 == 0) {
                        statePc = 193;
                    } else {
                        statePc = 206;
                    }
                    continue stateLoop;
                }
                case 206: {
                    var39++;
                    statePc = 207;
                    continue stateLoop;
                }
                case 207: {
                    if (var47 == 0) {
                        statePc = 188;
                    } else {
                        statePc = 208;
                    }
                    continue stateLoop;
                }
                case 208: {
                    return;
                }
                case 209: {
                    if (param0 != 3) {
                        statePc = 279;
                    } else {
                        statePc = 210;
                    }
                    continue stateLoop;
                }
                case 210: {
                    if (param7 != null) {
                        statePc = 239;
                    } else {
                        statePc = 213;
                    }
                    continue stateLoop;
                }
                case 213: {
                    var10 = 0;
                    statePc = 214;
                    continue stateLoop;
                }
                case 214: {
                    if ((var10 ^ -1) <= (var9_int ^ -1)) {
                        statePc = 238;
                    } else {
                        statePc = 215;
                    }
                    continue stateLoop;
                }
                case 215: {
                    var11 = param1[var10];
                    if (var47 != 0) {
                        statePc = 278;
                    } else {
                        statePc = 216;
                    }
                    continue stateLoop;
                }
                case 216: {
                    if (this.field_d.length > var11) {
                        statePc = 221;
                    } else {
                        statePc = 236;
                    }
                    continue stateLoop;
                }
                case 221: {
                    var12 = this.field_d[var11];
                    var13 = 0;
                    statePc = 222;
                    continue stateLoop;
                }
                case 222: {
                    if (var13 >= var12.length) {
                        statePc = 236;
                    } else {
                        statePc = 223;
                    }
                    continue stateLoop;
                }
                case 223: {
                    var14_int = var12[var13];
                    if (var47 != 0) {
                        statePc = 237;
                    } else {
                        statePc = 224;
                    }
                    continue stateLoop;
                }
                case 224: {
                    if (null == this.field_db) {
                        statePc = 233;
                    } else {
                        statePc = 227;
                    }
                    continue stateLoop;
                }
                case 227: {
                    if (0 != (this.field_db[var14_int] & param6)) {
                        statePc = 233;
                    } else {
                        statePc = 230;
                    }
                    continue stateLoop;
                }
                case 230: {
                    if (var47 == 0) {
                        statePc = 235;
                    } else {
                        statePc = 233;
                    }
                    continue stateLoop;
                }
                case 233: {
                    this.field_P[var14_int] = this.field_P[var14_int] - rp.field_i;
                    this.field_K[var14_int] = this.field_K[var14_int] - via.field_e;
                    this.field_A[var14_int] = this.field_A[var14_int] - dj.field_b;
                    this.field_P[var14_int] = this.field_P[var14_int] * param2 >> 1763616103;
                    this.field_K[var14_int] = this.field_K[var14_int] * param3 >> 792956295;
                    this.field_A[var14_int] = this.field_A[var14_int] * param4 >> -750914169;
                    this.field_P[var14_int] = this.field_P[var14_int] + rp.field_i;
                    this.field_K[var14_int] = this.field_K[var14_int] + via.field_e;
                    this.field_A[var14_int] = this.field_A[var14_int] + dj.field_b;
                    statePc = 235;
                    continue stateLoop;
                }
                case 235: {
                    var13++;
                    if (var47 == 0) {
                        statePc = 222;
                    } else {
                        statePc = 236;
                    }
                    continue stateLoop;
                }
                case 236: {
                    var10++;
                    statePc = 237;
                    continue stateLoop;
                }
                case 237: {
                    if (var47 == 0) {
                        statePc = 214;
                    } else {
                        statePc = 238;
                    }
                    continue stateLoop;
                }
                case 238: {
                    if (var47 == 0) {
                        statePc = 278;
                    } else {
                        statePc = 239;
                    }
                    continue stateLoop;
                }
                case 239: {
                    var10 = param7[9] << -114422364;
                    var11 = param7[10] << 1146698980;
                    var12_int = param7[11] << -1175513820;
                    var13 = param7[12] << 1125017412;
                    var14_int = param7[13] << 1544675492;
                    var15 = param7[14] << 1462946276;
                    if (vea.field_b) {
                        statePc = 242;
                    } else {
                        statePc = 243;
                    }
                    continue stateLoop;
                }
                case 242: {
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
                    statePc = 243;
                    continue stateLoop;
                }
                case 243: {
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
                    statePc = 244;
                    continue stateLoop;
                }
                case 244: {
                    stackOut_244_0 = 3;
                    stackIn_245_0 = stackOut_244_0;
                    statePc = 245;
                    continue stateLoop;
                }
                case 245: {
                    if (stackIn_245_0 <= var30) {
                        statePc = 259;
                    } else {
                        statePc = 246;
                    }
                    continue stateLoop;
                }
                case 246: {
                    stackOut_246_0 = 0;
                    stackIn_260_0 = stackOut_246_0;
                    stackIn_247_0 = stackOut_246_0;
                    if (var47 != 0) {
                        statePc = 260;
                    } else {
                        statePc = 247;
                    }
                    continue stateLoop;
                }
                case 247: {
                    var31 = stackIn_247_0;
                    statePc = 248;
                    continue stateLoop;
                }
                case 248: {
                    if (var31 >= 3) {
                        statePc = 258;
                    } else {
                        statePc = 249;
                    }
                    continue stateLoop;
                }
                case 249: {
                    var32 = 0;
                    stackOut_249_0 = 0;
                    stackIn_245_0 = stackOut_249_0;
                    stackIn_250_0 = stackOut_249_0;
                    if (var47 != 0) {
                        statePc = 245;
                    } else {
                        statePc = 250;
                    }
                    continue stateLoop;
                }
                case 250: {
                    var33 = stackIn_250_0;
                    statePc = 251;
                    continue stateLoop;
                }
                case 251: {
                    if ((var33 ^ -1) <= -4) {
                        statePc = 256;
                    } else {
                        statePc = 252;
                    }
                    continue stateLoop;
                }
                case 252: {
                    var32 = var32 + var25[var31 + 3 * var33] * param7[var33 + var30 * 3];
                    var33++;
                    if (var47 != 0) {
                        statePc = 257;
                    } else {
                        statePc = 253;
                    }
                    continue stateLoop;
                }
                case 253: {
                    if (var47 == 0) {
                        statePc = 251;
                    } else {
                        statePc = 256;
                    }
                    continue stateLoop;
                }
                case 256: {
                    var29[3 * var30 - -var31] = var32 + 8192 >> -1436592082;
                    var31++;
                    statePc = 257;
                    continue stateLoop;
                }
                case 257: {
                    if (var47 == 0) {
                        statePc = 248;
                    } else {
                        statePc = 258;
                    }
                    continue stateLoop;
                }
                case 258: {
                    var30++;
                    if (var47 == 0) {
                        statePc = 244;
                    } else {
                        statePc = 259;
                    }
                    continue stateLoop;
                }
                case 259: {
                    var30 = 8192 + var26 * param7[0] + var27 * param7[1] + var28 * param7[2] >> -615909426;
                    stackOut_259_0 = 8192 + (var28 * param7[5] + (var26 * param7[3] + param7[4] * var27)) >> -456758482;
                    stackIn_260_0 = stackOut_259_0;
                    statePc = 260;
                    continue stateLoop;
                }
                case 260: {
                    var31 = stackIn_260_0;
                    var30 = var30 + var10;
                    var31 = var31 + var11;
                    var32 = 8192 + (var28 * param7[8] + var26 * param7[6] + var27 * param7[7]) >> -379422770;
                    var32 = var32 + var12_int;
                    var33 = 0;
                    statePc = 261;
                    continue stateLoop;
                }
                case 261: {
                    if ((var33 ^ -1) <= (var9_int ^ -1)) {
                        statePc = 278;
                    } else {
                        statePc = 262;
                    }
                    continue stateLoop;
                }
                case 262: {
                    var34 = param1[var33];
                    if ((var34 ^ -1) > (this.field_d.length ^ -1)) {
                        statePc = 265;
                    } else {
                        statePc = 276;
                    }
                    continue stateLoop;
                }
                case 265: {
                    var35 = this.field_d[var34];
                    var36 = 0;
                    statePc = 266;
                    continue stateLoop;
                }
                case 266: {
                    if ((var36 ^ -1) <= (var35.length ^ -1)) {
                        statePc = 276;
                    } else {
                        statePc = 267;
                    }
                    continue stateLoop;
                }
                case 267: {
                    var37 = var35[var36];
                    if (var47 != 0) {
                        statePc = 277;
                    } else {
                        statePc = 268;
                    }
                    continue stateLoop;
                }
                case 268: {
                    if (null == this.field_db) {
                        statePc = 274;
                    } else {
                        statePc = 271;
                    }
                    continue stateLoop;
                }
                case 271: {
                    if ((param6 & this.field_db[var37] ^ -1) == -1) {
                        statePc = 275;
                    } else {
                        statePc = 274;
                    }
                    continue stateLoop;
                }
                case 274: {
                    var38 = this.field_A[var37] * var29[2] + (this.field_P[var37] * var29[0] + var29[1] * this.field_K[var37] - -8192) >> 1024074446;
                    var39 = 8192 + (this.field_K[var37] * var29[4] + this.field_P[var37] * var29[3] + this.field_A[var37] * var29[5]) >> -501198002;
                    var38 = var38 + var30;
                    var39 = var39 + var31;
                    var40 = 8192 + (var29[8] * this.field_A[var37] + var29[6] * this.field_P[var37]) + this.field_K[var37] * var29[7] >> -407445266;
                    this.field_P[var37] = var38;
                    var40 = var40 + var32;
                    this.field_K[var37] = var39;
                    this.field_A[var37] = var40;
                    statePc = 275;
                    continue stateLoop;
                }
                case 275: {
                    var36++;
                    if (var47 == 0) {
                        statePc = 266;
                    } else {
                        statePc = 276;
                    }
                    continue stateLoop;
                }
                case 276: {
                    var33++;
                    statePc = 277;
                    continue stateLoop;
                }
                case 277: {
                    if (var47 == 0) {
                        statePc = 261;
                    } else {
                        statePc = 278;
                    }
                    continue stateLoop;
                }
                case 278: {
                    return;
                }
                case 279: {
                    if (param0 != 5) {
                        statePc = 325;
                    } else {
                        statePc = 280;
                    }
                    continue stateLoop;
                }
                case 280: {
                    if (this.field_j != null) {
                        statePc = 285;
                    } else {
                        statePc = 324;
                    }
                    continue stateLoop;
                }
                case 285: {
                    var10 = 0;
                    statePc = 286;
                    continue stateLoop;
                }
                case 286: {
                    if ((var10 ^ -1) <= (var9_int ^ -1)) {
                        statePc = 317;
                    } else {
                        statePc = 287;
                    }
                    continue stateLoop;
                }
                case 287: {
                    var11 = param1[var10];
                    stackOut_287_0 = this.field_j.length;
                    stackOut_287_1 = var11;
                    stackIn_322_0 = stackOut_287_0;
                    stackIn_322_1 = stackOut_287_1;
                    stackIn_288_0 = stackOut_287_0;
                    stackIn_288_1 = stackOut_287_1;
                    if (var47 != 0) {
                        statePc = 322;
                    } else {
                        statePc = 288;
                    }
                    continue stateLoop;
                }
                case 288: {
                    if (stackIn_288_0 <= stackIn_288_1) {
                        statePc = 315;
                    } else {
                        statePc = 291;
                    }
                    continue stateLoop;
                }
                case 291: {
                    var12 = this.field_j[var11];
                    var13 = 0;
                    statePc = 292;
                    continue stateLoop;
                }
                case 292: {
                    if ((var12.length ^ -1) >= (var13 ^ -1)) {
                        statePc = 315;
                    } else {
                        statePc = 293;
                    }
                    continue stateLoop;
                }
                case 293: {
                    var14_int = var12[var13];
                    if (var47 != 0) {
                        statePc = 316;
                    } else {
                        statePc = 294;
                    }
                    continue stateLoop;
                }
                case 294: {
                    if (null == this.field_fb) {
                        statePc = 303;
                    } else {
                        statePc = 297;
                    }
                    continue stateLoop;
                }
                case 297: {
                    if (0 != (param6 & this.field_fb[var14_int])) {
                        statePc = 303;
                    } else {
                        statePc = 300;
                    }
                    continue stateLoop;
                }
                case 300: {
                    if (var47 == 0) {
                        statePc = 314;
                    } else {
                        statePc = 303;
                    }
                    continue stateLoop;
                }
                case 303: {
                    var15 = param2 * 8 + (this.field_o[var14_int] & 255);
                    if ((var15 ^ -1) > -1) {
                        statePc = 310;
                    } else {
                        statePc = 304;
                    }
                    continue stateLoop;
                }
                case 304: {
                    if (-256 > (var15 ^ -1)) {
                        statePc = 309;
                    } else {
                        statePc = 311;
                    }
                    continue stateLoop;
                }
                case 309: {
                    var15 = 255;
                    if (var47 == 0) {
                        statePc = 311;
                    } else {
                        statePc = 310;
                    }
                    continue stateLoop;
                }
                case 310: {
                    var15 = 0;
                    statePc = 311;
                    continue stateLoop;
                }
                case 311: {
                    this.field_o[var14_int] = (byte)var15;
                    if (null == this.field_kb) {
                        statePc = 314;
                    } else {
                        statePc = 312;
                    }
                    continue stateLoop;
                }
                case 312: {
                    this.field_kb.field_d = null;
                    statePc = 314;
                    continue stateLoop;
                }
                case 314: {
                    var13++;
                    if (var47 == 0) {
                        statePc = 292;
                    } else {
                        statePc = 315;
                    }
                    continue stateLoop;
                }
                case 315: {
                    var10++;
                    statePc = 316;
                    continue stateLoop;
                }
                case 316: {
                    if (var47 == 0) {
                        statePc = 286;
                    } else {
                        statePc = 317;
                    }
                    continue stateLoop;
                }
                case 317: {
                    if (this.field_r != null) {
                        statePc = 320;
                    } else {
                        statePc = 324;
                    }
                    continue stateLoop;
                }
                case 320: {
                    var10 = 0;
                    statePc = 321;
                    continue stateLoop;
                }
                case 321: {
                    stackOut_321_0 = var10 ^ -1;
                    stackOut_321_1 = this.field_G ^ -1;
                    stackIn_322_0 = stackOut_321_0;
                    stackIn_322_1 = stackOut_321_1;
                    statePc = 322;
                    continue stateLoop;
                }
                case 322: {
                    if (stackIn_322_0 <= stackIn_322_1) {
                        statePc = 324;
                    } else {
                        statePc = 323;
                    }
                    continue stateLoop;
                }
                case 323: {
                    var11_ref_pm = this.field_r[var10];
                    var12_ref = this.field_f[var10];
                    var12_ref.field_c = -(this.field_o[var11_ref_pm.field_l] & 255) + 255 << -2011390920 | 16777215 & var12_ref.field_c;
                    var10++;
                    if (var47 == 0) {
                        statePc = 321;
                    } else {
                        statePc = 324;
                    }
                    continue stateLoop;
                }
                case 324: {
                    return;
                }
                case 325: {
                    if (-8 != (param0 ^ -1)) {
                        statePc = 377;
                    } else {
                        statePc = 326;
                    }
                    continue stateLoop;
                }
                case 326: {
                    if (null == this.field_j) {
                        statePc = 376;
                    } else {
                        statePc = 329;
                    }
                    continue stateLoop;
                }
                case 329: {
                    var10 = 0;
                    statePc = 330;
                    continue stateLoop;
                }
                case 330: {
                    if ((var10 ^ -1) <= (var9_int ^ -1)) {
                        statePc = 368;
                    } else {
                        statePc = 331;
                    }
                    continue stateLoop;
                }
                case 331: {
                    var11 = param1[var10];
                    stackOut_331_0 = var11 ^ -1;
                    stackOut_331_1 = this.field_j.length ^ -1;
                    stackIn_373_0 = stackOut_331_0;
                    stackIn_373_1 = stackOut_331_1;
                    stackIn_332_0 = stackOut_331_0;
                    stackIn_332_1 = stackOut_331_1;
                    if (var47 != 0) {
                        statePc = 373;
                    } else {
                        statePc = 332;
                    }
                    continue stateLoop;
                }
                case 332: {
                    if (stackIn_332_0 > stackIn_332_1) {
                        statePc = 336;
                    } else {
                        statePc = 367;
                    }
                    continue stateLoop;
                }
                case 336: {
                    var12 = this.field_j[var11];
                    var13 = 0;
                    statePc = 337;
                    continue stateLoop;
                }
                case 337: {
                    if ((var12.length ^ -1) >= (var13 ^ -1)) {
                        statePc = 367;
                    } else {
                        statePc = 338;
                    }
                    continue stateLoop;
                }
                case 338: {
                    var14_int = var12[var13];
                    stackOut_338_0 = this;
                    stackIn_375_0 = stackOut_338_0;
                    stackIn_339_0 = stackOut_338_0;
                    if (var47 != 0) {
                        statePc = 375;
                    } else {
                        statePc = 339;
                    }
                    continue stateLoop;
                }
                case 339: {
                    if (((np) (this)).field_fb == null) {
                        statePc = 348;
                    } else {
                        statePc = 342;
                    }
                    continue stateLoop;
                }
                case 342: {
                    if ((this.field_fb[var14_int] & param6) != 0) {
                        statePc = 348;
                    } else {
                        statePc = 345;
                    }
                    continue stateLoop;
                }
                case 345: {
                    if (var47 == 0) {
                        statePc = 366;
                    } else {
                        statePc = 348;
                    }
                    continue stateLoop;
                }
                case 348: {
                    var15 = this.field_X[var14_int] & 65535;
                    var16 = (64685 & var15) >> 243689802;
                    var17 = 7 & var15 >> -83060601;
                    var16 = 63 & param2 + var16;
                    var17 = var17 + param3 / 4;
                    var18 = var15 & 127;
                    var18 = var18 + param4;
                    if (0 <= var17) {
                        statePc = 350;
                    } else {
                        statePc = 349;
                    }
                    continue stateLoop;
                }
                case 349: {
                    var17 = 0;
                    if (var47 == 0) {
                        statePc = 356;
                    } else {
                        statePc = 350;
                    }
                    continue stateLoop;
                }
                case 350: {
                    if (7 < var17) {
                        statePc = 355;
                    } else {
                        statePc = 356;
                    }
                    continue stateLoop;
                }
                case 355: {
                    var17 = 7;
                    statePc = 356;
                    continue stateLoop;
                }
                case 356: {
                    if (-1 < (var18 ^ -1)) {
                        statePc = 361;
                    } else {
                        statePc = 357;
                    }
                    continue stateLoop;
                }
                case 357: {
                    if (127 >= var18) {
                        statePc = 362;
                    } else {
                        statePc = 360;
                    }
                    continue stateLoop;
                }
                case 360: {
                    var18 = 127;
                    if (var47 == 0) {
                        statePc = 362;
                    } else {
                        statePc = 361;
                    }
                    continue stateLoop;
                }
                case 361: {
                    var18 = 0;
                    statePc = 362;
                    continue stateLoop;
                }
                case 362: {
                    this.field_X[var14_int] = (short)fh.a(var18, fh.a(var17 << -655481913, var16 << -687474934));
                    if (null != this.field_kb) {
                        statePc = 365;
                    } else {
                        statePc = 366;
                    }
                    continue stateLoop;
                }
                case 365: {
                    this.field_kb.field_d = null;
                    statePc = 366;
                    continue stateLoop;
                }
                case 366: {
                    var13++;
                    if (var47 == 0) {
                        statePc = 337;
                    } else {
                        statePc = 367;
                    }
                    continue stateLoop;
                }
                case 367: {
                    var10++;
                    if (var47 == 0) {
                        statePc = 330;
                    } else {
                        statePc = 368;
                    }
                    continue stateLoop;
                }
                case 368: {
                    if (null != this.field_r) {
                        statePc = 371;
                    } else {
                        statePc = 376;
                    }
                    continue stateLoop;
                }
                case 371: {
                    var10 = 0;
                    statePc = 372;
                    continue stateLoop;
                }
                case 372: {
                    stackOut_372_0 = var10;
                    stackOut_372_1 = this.field_G;
                    stackIn_373_0 = stackOut_372_0;
                    stackIn_373_1 = stackOut_372_1;
                    statePc = 373;
                    continue stateLoop;
                }
                case 373: {
                    if (stackIn_373_0 >= stackIn_373_1) {
                        statePc = 376;
                    } else {
                        statePc = 374;
                    }
                    continue stateLoop;
                }
                case 374: {
                    stackOut_374_0 = this;
                    stackIn_375_0 = stackOut_374_0;
                    statePc = 375;
                    continue stateLoop;
                }
                case 375: {
                    var11_ref_pm = ((np) (this)).field_r[var10];
                    var12_ref = this.field_f[var10];
                    var12_ref.field_c = cla.field_m[this.field_X[var11_ref_pm.field_l] & 65535] & 16777215 | var12_ref.field_c & -16777216;
                    var10++;
                    if (var47 == 0) {
                        statePc = 372;
                    } else {
                        statePc = 376;
                    }
                    continue stateLoop;
                }
                case 376: {
                    return;
                }
                case 377: {
                    if (param0 != 8) {
                        statePc = 393;
                    } else {
                        statePc = 378;
                    }
                    continue stateLoop;
                }
                case 378: {
                    if (this.field_C == null) {
                        statePc = 392;
                    } else {
                        statePc = 381;
                    }
                    continue stateLoop;
                }
                case 381: {
                    var10 = 0;
                    statePc = 382;
                    continue stateLoop;
                }
                case 382: {
                    if ((var10 ^ -1) <= (var9_int ^ -1)) {
                        statePc = 392;
                    } else {
                        statePc = 383;
                    }
                    continue stateLoop;
                }
                case 383: {
                    var11 = param1[var10];
                    if ((this.field_C.length ^ -1) >= (var11 ^ -1)) {
                        statePc = 390;
                    } else {
                        statePc = 384;
                    }
                    continue stateLoop;
                }
                case 384: {
                    var12 = this.field_C[var11];
                    var13 = 0;
                    statePc = 385;
                    continue stateLoop;
                }
                case 385: {
                    if ((var13 ^ -1) <= (var12.length ^ -1)) {
                        statePc = 390;
                    } else {
                        statePc = 386;
                    }
                    continue stateLoop;
                }
                case 386: {
                    var14 = this.field_f[var12[var13]];
                    var14.field_h = var14.field_h + param2;
                    var14.field_a = var14.field_a + param3;
                    var13++;
                    if (var47 != 0) {
                        statePc = 391;
                    } else {
                        statePc = 387;
                    }
                    continue stateLoop;
                }
                case 387: {
                    if (var47 == 0) {
                        statePc = 385;
                    } else {
                        statePc = 390;
                    }
                    continue stateLoop;
                }
                case 390: {
                    var10++;
                    statePc = 391;
                    continue stateLoop;
                }
                case 391: {
                    if (var47 == 0) {
                        statePc = 382;
                    } else {
                        statePc = 392;
                    }
                    continue stateLoop;
                }
                case 392: {
                    return;
                }
                case 393: {
                    if (param0 == 10) {
                        statePc = 396;
                    } else {
                        statePc = 411;
                    }
                    continue stateLoop;
                }
                case 396: {
                    if (this.field_C != null) {
                        statePc = 399;
                    } else {
                        statePc = 410;
                    }
                    continue stateLoop;
                }
                case 399: {
                    var10 = 0;
                    statePc = 400;
                    continue stateLoop;
                }
                case 400: {
                    if ((var9_int ^ -1) >= (var10 ^ -1)) {
                        statePc = 410;
                    } else {
                        statePc = 401;
                    }
                    continue stateLoop;
                }
                case 401: {
                    var11 = param1[var10];
                    if (var11 >= this.field_C.length) {
                        statePc = 408;
                    } else {
                        statePc = 402;
                    }
                    continue stateLoop;
                }
                case 402: {
                    var12 = this.field_C[var11];
                    var13 = 0;
                    statePc = 403;
                    continue stateLoop;
                }
                case 403: {
                    if (var13 >= var12.length) {
                        statePc = 408;
                    } else {
                        statePc = 404;
                    }
                    continue stateLoop;
                }
                case 404: {
                    var14 = this.field_f[var12[var13]];
                    var14.field_b = var14.field_b * param2 >> -1560528921;
                    var14.field_f = param3 * var14.field_f >> 2147322599;
                    var13++;
                    if (var47 != 0) {
                        statePc = 409;
                    } else {
                        statePc = 405;
                    }
                    continue stateLoop;
                }
                case 405: {
                    if (var47 == 0) {
                        statePc = 403;
                    } else {
                        statePc = 408;
                    }
                    continue stateLoop;
                }
                case 408: {
                    var10++;
                    statePc = 409;
                    continue stateLoop;
                }
                case 409: {
                    if (var47 == 0) {
                        statePc = 400;
                    } else {
                        statePc = 410;
                    }
                    continue stateLoop;
                }
                case 410: {
                    return;
                }
                case 411: {
                    if (param0 != 9) {
                        statePc = 441;
                    } else {
                        statePc = 412;
                    }
                    continue stateLoop;
                }
                case 412: {
                    if (null != this.field_C) {
                        statePc = 417;
                    } else {
                        statePc = 430;
                    }
                    continue stateLoop;
                }
                case 417: {
                    var10 = 0;
                    statePc = 418;
                    continue stateLoop;
                }
                case 418: {
                    if (var9_int <= var10) {
                        statePc = 430;
                    } else {
                        statePc = 419;
                    }
                    continue stateLoop;
                }
                case 419: {
                    var11 = param1[var10];
                    if (var11 < this.field_C.length) {
                        statePc = 422;
                    } else {
                        statePc = 428;
                    }
                    continue stateLoop;
                }
                case 422: {
                    var12 = this.field_C[var11];
                    var13 = 0;
                    statePc = 423;
                    continue stateLoop;
                }
                case 423: {
                    if ((var12.length ^ -1) >= (var13 ^ -1)) {
                        statePc = 428;
                    } else {
                        statePc = 424;
                    }
                    continue stateLoop;
                }
                case 424: {
                    var14 = this.field_f[var12[var13]];
                    var14.field_g = 16383 & param2 + var14.field_g;
                    var13++;
                    if (var47 != 0) {
                        statePc = 429;
                    } else {
                        statePc = 425;
                    }
                    continue stateLoop;
                }
                case 425: {
                    if (var47 == 0) {
                        statePc = 423;
                    } else {
                        statePc = 428;
                    }
                    continue stateLoop;
                }
                case 428: {
                    var10++;
                    statePc = 429;
                    continue stateLoop;
                }
                case 429: {
                    if (var47 == 0) {
                        statePc = 418;
                    } else {
                        statePc = 430;
                    }
                    continue stateLoop;
                }
                case 430: {
                    return;
                }
                case 441: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final static void b(int param0) {
        int var1_int = 0;
        RuntimeException var1 = null;
        int var2 = 0;
        RuntimeException decompiledCaughtException = null;
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
        boolean stackIn_11_0 = false;
        int stackIn_21_0 = 0;
        RuntimeException decompiledCaughtException = null;
        cka stackOut_4_0 = null;
        cka stackOut_7_0 = null;
        int stackOut_7_1 = 0;
        cka stackOut_5_0 = null;
        int stackOut_5_1 = 0;
        boolean stackOut_10_0 = false;
        byte stackOut_20_0 = 0;
        var14 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              L2: {
                if (null != this.field_r) {
                  L3: {
                    var2_ref = this.field_R.field_mc;
                    this.field_R.u(28630);
                    stackOut_4_0 = this.field_R;
                    stackIn_7_0 = stackOut_4_0;
                    stackIn_5_0 = stackOut_4_0;
                    if (this.field_s) {
                      stackOut_7_0 = (cka) ((Object) stackIn_7_0);
                      stackOut_7_1 = 0;
                      stackIn_8_0 = stackOut_7_0;
                      stackIn_8_1 = stackOut_7_1;
                      break L3;
                    } else {
                      stackOut_5_0 = (cka) ((Object) stackIn_5_0);
                      stackOut_5_1 = 1;
                      stackIn_8_0 = stackOut_5_0;
                      stackIn_8_1 = stackOut_5_1;
                      break L3;
                    }
                  }
                  ((cka) (Object) stackIn_8_0).a(stackIn_8_1 != 0, false);
                  this.field_R.a(param0 ^ -35, false);
                  this.field_R.a((tj) null, this.field_R.field_Rb, (tj) null, -114, this.field_R.field_Bc);
                  var3 = 0;
                  L4: while (true) {
                    L5: {
                      if ((var3 ^ -1) <= (this.field_G ^ -1)) {
                        break L5;
                      } else {
                        var4 = this.field_r[var3];
                        var5 = this.field_f[var3];
                        stackOut_10_0 = var4.field_g;
                        stackIn_21_0 = stackOut_10_0 ? 1 : 0;
                        stackIn_11_0 = stackOut_10_0;
                        if (var14 != 0) {
                          break L1;
                        } else {
                          L6: {
                            L7: {
                              if (!stackIn_11_0) {
                                break L7;
                              } else {
                                if (this.field_R.f()) {
                                  break L6;
                                } else {
                                  break L7;
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
                            var2_ref.a(var5.field_g, var12 * var11 + -var11, var9 + (float)var5.field_h - var9 * var12, var4.field_e * var5.field_f >> -786865721, (byte) -60, var4.field_i * var5.field_b >> 1847323719, var12 * var10 + (-var10 + (float)var5.field_a));
                            this.field_R.a(var2_ref, 0);
                            var13 = var5.field_c;
                            jaggl.OpenGL.glColor4ub((byte)(var13 >> 441626224), (byte)(var13 >> 2136262376), (byte)var13, (byte)(var13 >> 683812344));
                            this.field_R.c((int) var4.field_f, 32677);
                            this.field_R.a((byte) 94, (int) var4.field_c);
                            this.field_R.a(0, 4, 7, true);
                            break L6;
                          }
                          var3++;
                          if (var14 == 0) {
                            continue L4;
                          } else {
                            break L5;
                          }
                        }
                      }
                    }
                    this.field_R.a(true, false);
                    this.field_R.n((byte) -65);
                    break L2;
                  }
                } else {
                  break L2;
                }
              }
              stackOut_20_0 = param0;
              stackIn_21_0 = stackOut_20_0;
              break L1;
            }
            L8: {
              if (stackIn_21_0 == -30) {
                break L8;
              } else {
                this.a(-99, (int[]) null, -39, -40, 4, -64, false);
                break L8;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw tba.a((Throwable) ((Object) var2), "np.F(" + param0 + ')');
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
        int decompiledRegionSelector0 = 0;
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
            if (this.field_L == 0) {
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L1: {
                var4_ref = this.field_R.field_jd;
                var5 = (oba) ((Object) param0);
                if (this.field_l) {
                  break L1;
                } else {
                  this.c(2709);
                  break L1;
                }
              }
              L2: {
                L3: {
                  bja.field_b = var4_ref.field_o + (var4_ref.field_j * var5.field_m + var4_ref.field_h * var5.field_p + var4_ref.field_q * var5.field_o);
                  it.field_a = var5.field_k * var4_ref.field_j + var4_ref.field_h * var5.field_r + var4_ref.field_q * var5.field_h;
                  var6 = bja.field_b + (float)this.field_eb * it.field_a;
                  var7 = bja.field_b + it.field_a * (float)this.field_v;
                  if (var7 >= var6) {
                    break L3;
                  } else {
                    var8 = var7 - (float)this.field_M;
                    var9 = (float)this.field_M + var6;
                    if (var24 == 0) {
                      break L2;
                    } else {
                      break L3;
                    }
                  }
                }
                var9 = var7 + (float)this.field_M;
                var8 = (float)(-this.field_M) + var6;
                break L2;
              }
              if (var8 >= this.field_R.field_u) {
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                if ((float)this.field_R.field_Gc < var9) {
                  L4: {
                    L5: {
                      eqa.field_a = var5.field_h * var4_ref.field_s + (var5.field_r * var4_ref.field_k + var5.field_k * var4_ref.field_l);
                      aka.field_B = var5.field_m * var4_ref.field_l + var5.field_p * var4_ref.field_k + var4_ref.field_s * var5.field_o + var4_ref.field_m;
                      var10 = aka.field_B + (float)this.field_eb * eqa.field_a;
                      var11 = eqa.field_a * (float)this.field_v + aka.field_B;
                      if (var10 > var11) {
                        break L5;
                      } else {
                        var13 = (float)this.field_R.field_W * (var11 + (float)this.field_M);
                        var12 = (var10 - (float)this.field_M) * (float)this.field_R.field_W;
                        if (var24 == 0) {
                          break L4;
                        } else {
                          break L5;
                        }
                      }
                    }
                    var13 = ((float)this.field_M + var10) * (float)this.field_R.field_W;
                    var12 = ((float)(-this.field_M) + var11) * (float)this.field_R.field_W;
                    break L4;
                  }
                  if (this.field_R.field_od > var12 / var9) {
                    if (var13 / var9 > this.field_R.field_s) {
                      L6: {
                        L7: {
                          nw.field_u = var4_ref.field_r * var5.field_r + var4_ref.field_i * var5.field_k + var5.field_h * var4_ref.field_g;
                          ef.field_s = var5.field_o * var4_ref.field_g + (var5.field_m * var4_ref.field_i + var5.field_p * var4_ref.field_r) + var4_ref.field_p;
                          var14 = ef.field_s + (float)this.field_eb * nw.field_u;
                          var15 = ef.field_s + nw.field_u * (float)this.field_v;
                          if (var15 >= var14) {
                            break L7;
                          } else {
                            var17 = (float)this.field_R.field_kb * (var14 + (float)this.field_M);
                            var16 = (float)this.field_R.field_kb * (var15 - (float)this.field_M);
                            if (var24 == 0) {
                              break L6;
                            } else {
                              break L7;
                            }
                          }
                        }
                        var16 = (float)this.field_R.field_kb * ((float)(-this.field_M) + var14);
                        var17 = (float)this.field_R.field_kb * ((float)this.field_M + var15);
                        break L6;
                      }
                      if (this.field_R.field_Db > var16 / var9) {
                        if (this.field_R.field_nd >= var17 / var9) {
                          decompiledRegionSelector0 = 6;
                          break L0;
                        } else {
                          L8: {
                            L9: {
                              if (param1 != null) {
                                break L9;
                              } else {
                                if (this.field_r == null) {
                                  break L8;
                                } else {
                                  break L9;
                                }
                              }
                            }
                            is.field_Ab = var5.field_i * var4_ref.field_k + var5.field_l * var4_ref.field_l + var4_ref.field_s * var5.field_j;
                            roa.field_u = var4_ref.field_q * var5.field_j + (var5.field_l * var4_ref.field_j + var5.field_i * var4_ref.field_h);
                            kka.field_q = var4_ref.field_q * var5.field_q + (var5.field_g * var4_ref.field_h + var4_ref.field_j * var5.field_s);
                            mu.field_ub = var4_ref.field_s * var5.field_q + (var4_ref.field_l * var5.field_s + var5.field_g * var4_ref.field_k);
                            qi.field_L = var5.field_j * var4_ref.field_g + (var5.field_i * var4_ref.field_r + var4_ref.field_i * var5.field_l);
                            bva.field_c = var5.field_s * var4_ref.field_i + var4_ref.field_r * var5.field_g + var5.field_q * var4_ref.field_g;
                            break L8;
                          }
                          L10: {
                            if (param1 == null) {
                              break L10;
                            } else {
                              L11: {
                                var18 = 0;
                                var19 = 1;
                                var20 = this.field_U + this.field_T >> -1924729023;
                                var21 = this.field_k + this.field_S >> 417397249;
                                var22 = (int)((float)var21 * kka.field_q + (it.field_a * (float)this.field_eb + ((float)var20 * roa.field_u + bja.field_b)));
                                if ((this.field_R.field_Gc ^ -1) < (var22 ^ -1)) {
                                  var18 = 1;
                                  break L11;
                                } else {
                                  break L11;
                                }
                              }
                              L12: {
                                var23 = (int)(bja.field_b + roa.field_u * (float)var20 + it.field_a * (float)this.field_v + (float)var21 * kka.field_q);
                                if (var23 >= this.field_R.field_Gc) {
                                  break L12;
                                } else {
                                  var18 = 1;
                                  break L12;
                                }
                              }
                              L13: {
                                if (var18 == 0) {
                                  break L13;
                                } else {
                                  L14: {
                                    if (var22 >= this.field_R.field_Gc) {
                                      break L14;
                                    } else {
                                      if ((this.field_R.field_Gc ^ -1) >= (var23 ^ -1)) {
                                        break L14;
                                      } else {
                                        var19 = 0;
                                        if (var24 == 0) {
                                          break L13;
                                        } else {
                                          break L14;
                                        }
                                      }
                                    }
                                  }
                                  if ((var22 ^ -1) <= (this.field_R.field_Gc ^ -1)) {
                                    if (var23 < this.field_R.field_Gc) {
                                      break L13;
                                    } else {
                                      break L13;
                                    }
                                  } else {
                                    break L13;
                                  }
                                }
                              }
                              if (var19 == 0) {
                                break L10;
                              } else {
                                if ((var23 ^ -1) <= (var22 ^ -1)) {
                                  break L10;
                                } else {
                                  break L10;
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
          L15: {
            var4 = decompiledCaughtException;
            stackOut_64_0 = (RuntimeException) (var4);
            stackOut_64_1 = new StringBuilder().append("np.N(");
            stackIn_67_0 = stackOut_64_0;
            stackIn_67_1 = stackOut_64_1;
            stackIn_65_0 = stackOut_64_0;
            stackIn_65_1 = stackOut_64_1;
            if (param0 == null) {
              stackOut_67_0 = (RuntimeException) ((Object) stackIn_67_0);
              stackOut_67_1 = (StringBuilder) ((Object) stackIn_67_1);
              stackOut_67_2 = "null";
              stackIn_68_0 = stackOut_67_0;
              stackIn_68_1 = stackOut_67_1;
              stackIn_68_2 = stackOut_67_2;
              break L15;
            } else {
              stackOut_65_0 = (RuntimeException) ((Object) stackIn_65_0);
              stackOut_65_1 = (StringBuilder) ((Object) stackIn_65_1);
              stackOut_65_2 = "{...}";
              stackIn_68_0 = stackOut_65_0;
              stackIn_68_1 = stackOut_65_1;
              stackIn_68_2 = stackOut_65_2;
              break L15;
            }
          }
          L16: {
            stackOut_68_0 = (RuntimeException) ((Object) stackIn_68_0);
            stackOut_68_1 = ((StringBuilder) (Object) stackIn_68_1).append(stackIn_68_2).append(',');
            stackIn_71_0 = stackOut_68_0;
            stackIn_71_1 = stackOut_68_1;
            stackIn_69_0 = stackOut_68_0;
            stackIn_69_1 = stackOut_68_1;
            if (param1 == null) {
              stackOut_71_0 = (RuntimeException) ((Object) stackIn_71_0);
              stackOut_71_1 = (StringBuilder) ((Object) stackIn_71_1);
              stackOut_71_2 = "null";
              stackIn_72_0 = stackOut_71_0;
              stackIn_72_1 = stackOut_71_1;
              stackIn_72_2 = stackOut_71_2;
              break L16;
            } else {
              stackOut_69_0 = (RuntimeException) ((Object) stackIn_69_0);
              stackOut_69_1 = (StringBuilder) ((Object) stackIn_69_1);
              stackOut_69_2 = "{...}";
              stackIn_72_0 = stackOut_69_0;
              stackIn_72_1 = stackOut_69_1;
              stackIn_72_2 = stackOut_69_2;
              break L16;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_72_0), stackIn_72_2 + ',' + param2 + ')');
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
        RuntimeException var1 = null;
        int var2 = 0;
        int stackIn_3_0 = 0;
        int stackIn_12_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_11_0 = 0;
        int stackOut_2_0 = 0;
        var2 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            if (this.field_d != null) {
              var1_int = 0;
              L1: while (true) {
                L2: {
                  L3: {
                    if ((this.field_N ^ -1) >= (var1_int ^ -1)) {
                      break L3;
                    } else {
                      this.field_P[var1_int] = this.field_P[var1_int] << 4;
                      this.field_K[var1_int] = this.field_K[var1_int] << 4;
                      this.field_A[var1_int] = this.field_A[var1_int] << 4;
                      var1_int++;
                      if (var2 != 0) {
                        break L2;
                      } else {
                        if (var2 == 0) {
                          continue L1;
                        } else {
                          break L3;
                        }
                      }
                    }
                  }
                  rp.field_i = 0;
                  dj.field_b = 0;
                  via.field_e = 0;
                  break L2;
                }
                stackOut_11_0 = 1;
                stackIn_12_0 = stackOut_11_0;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              stackOut_2_0 = 0;
              stackIn_3_0 = stackOut_2_0;
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
          return stackIn_12_0 != 0;
        }
    }

    private final void a(int param0, boolean param1) {
        RuntimeException var3 = null;
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
        float var20_float = 0.0f;
        int var20 = 0;
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
        int stackIn_81_0 = 0;
        int stackIn_84_0 = 0;
        int stackIn_84_1 = 0;
        int stackIn_95_0 = 0;
        int stackIn_95_1 = 0;
        int stackIn_97_0 = 0;
        int stackIn_100_0 = 0;
        int stackIn_100_1 = 0;
        int stackIn_109_0 = 0;
        int stackIn_128_0 = 0;
        float stackIn_137_0 = 0.0f;
        float stackIn_161_0 = 0.0f;
        float stackIn_161_1 = 0.0f;
        float stackIn_163_0 = 0.0f;
        float stackIn_163_1 = 0.0f;
        float stackIn_164_0 = 0.0f;
        float stackIn_164_1 = 0.0f;
        float stackIn_164_2 = 0.0f;
        float stackIn_193_0 = 0.0f;
        int stackIn_215_0 = 0;
        int stackIn_225_0 = 0;
        int stackIn_236_0 = 0;
        int stackIn_244_0 = 0;
        int decompiledRegionSelector0 = 0;
        Throwable caughtException = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_5_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_19_0 = 0;
        int stackOut_21_0 = 0;
        int stackOut_28_0 = 0;
        int stackOut_30_0 = 0;
        int stackOut_32_0 = 0;
        int stackOut_37_0 = 0;
        int stackOut_37_1 = 0;
        int stackOut_33_0 = 0;
        int stackOut_35_0 = 0;
        int stackOut_35_1 = 0;
        int stackOut_38_0 = 0;
        int stackOut_41_0 = 0;
        int stackOut_41_1 = 0;
        int stackOut_39_0 = 0;
        int stackOut_39_1 = 0;
        int stackOut_42_0 = 0;
        int stackOut_45_0 = 0;
        int stackOut_45_1 = 0;
        int stackOut_43_0 = 0;
        int stackOut_43_1 = 0;
        int stackOut_46_0 = 0;
        int stackOut_49_0 = 0;
        int stackOut_49_1 = 0;
        int stackOut_47_0 = 0;
        int stackOut_47_1 = 0;
        int stackOut_78_0 = 0;
        int stackOut_78_1 = 0;
        int stackOut_80_0 = 0;
        int stackOut_83_0 = 0;
        int stackOut_83_1 = 0;
        int stackOut_94_0 = 0;
        int stackOut_94_1 = 0;
        int stackOut_96_0 = 0;
        int stackOut_99_0 = 0;
        int stackOut_99_1 = 0;
        int stackOut_108_0 = 0;
        int stackOut_127_0 = 0;
        float stackOut_136_0 = 0.0f;
        float stackOut_134_0 = 0.0f;
        float stackOut_160_0 = 0.0f;
        float stackOut_160_1 = 0.0f;
        float stackOut_163_0 = 0.0f;
        float stackOut_163_1 = 0.0f;
        float stackOut_163_2 = 0.0f;
        float stackOut_161_0 = 0.0f;
        float stackOut_161_1 = 0.0f;
        float stackOut_161_2 = 0.0f;
        float stackOut_192_0 = 0.0f;
        float stackOut_190_0 = 0.0f;
        int stackOut_214_0 = 0;
        int stackOut_224_0 = 0;
        int stackOut_235_0 = 0;
        int stackOut_243_0 = 0;
        var35 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              L2: {
                if (this.field_kb == null) {
                  break L2;
                } else {
                  if (this.field_kb.field_d != null) {
                    break L2;
                  } else {
                    stackOut_5_0 = 1;
                    stackIn_8_0 = stackOut_5_0;
                    break L1;
                  }
                }
              }
              stackOut_7_0 = 0;
              stackIn_8_0 = stackOut_7_0;
              break L1;
            }
            L3: {
              L4: {
                var3_int = stackIn_8_0;
                if (null == this.field_F) {
                  break L4;
                } else {
                  if (null != this.field_F.field_d) {
                    break L4;
                  } else {
                    stackOut_12_0 = 1;
                    stackIn_15_0 = stackOut_12_0;
                    break L3;
                  }
                }
              }
              stackOut_14_0 = 0;
              stackIn_15_0 = stackOut_14_0;
              break L3;
            }
            L5: {
              L6: {
                var4 = stackIn_15_0;
                if (null == this.field_g) {
                  break L6;
                } else {
                  if (this.field_g.field_d != null) {
                    break L6;
                  } else {
                    stackOut_19_0 = 1;
                    stackIn_22_0 = stackOut_19_0;
                    break L5;
                  }
                }
              }
              stackOut_21_0 = 0;
              stackIn_22_0 = stackOut_21_0;
              break L5;
            }
            var5 = stackIn_22_0;
            if (param0 == 0) {
              L7: {
                L8: {
                  if (this.field_ab == null) {
                    break L8;
                  } else {
                    if (this.field_ab.field_d != null) {
                      break L8;
                    } else {
                      stackOut_28_0 = 1;
                      stackIn_31_0 = stackOut_28_0;
                      break L7;
                    }
                  }
                }
                stackOut_30_0 = 0;
                stackIn_31_0 = stackOut_30_0;
                break L7;
              }
              L9: {
                var6 = stackIn_31_0;
                if (!param1) {
                  break L9;
                } else {
                  L10: {
                    stackOut_32_0 = var6;
                    stackIn_37_0 = stackOut_32_0;
                    stackIn_33_0 = stackOut_32_0;
                    if ((8 & this.field_Z) == 0) {
                      stackOut_37_0 = stackIn_37_0;
                      stackOut_37_1 = 0;
                      stackIn_38_0 = stackOut_37_0;
                      stackIn_38_1 = stackOut_37_1;
                      break L10;
                    } else {
                      stackOut_33_0 = stackIn_33_0;
                      stackIn_35_0 = stackOut_33_0;
                      stackOut_35_0 = stackIn_35_0;
                      stackOut_35_1 = 1;
                      stackIn_38_0 = stackOut_35_0;
                      stackIn_38_1 = stackOut_35_1;
                      break L10;
                    }
                  }
                  L11: {
                    var6 = stackIn_38_0 & stackIn_38_1;
                    stackOut_38_0 = var5;
                    stackIn_41_0 = stackOut_38_0;
                    stackIn_39_0 = stackOut_38_0;
                    if ((this.field_Z & 1) == 0) {
                      stackOut_41_0 = stackIn_41_0;
                      stackOut_41_1 = 0;
                      stackIn_42_0 = stackOut_41_0;
                      stackIn_42_1 = stackOut_41_1;
                      break L11;
                    } else {
                      stackOut_39_0 = stackIn_39_0;
                      stackOut_39_1 = 1;
                      stackIn_42_0 = stackOut_39_0;
                      stackIn_42_1 = stackOut_39_1;
                      break L11;
                    }
                  }
                  L12: {
                    var5 = stackIn_42_0 & stackIn_42_1;
                    stackOut_42_0 = var4;
                    stackIn_45_0 = stackOut_42_0;
                    stackIn_43_0 = stackOut_42_0;
                    if (-1 == (4 & this.field_Z ^ -1)) {
                      stackOut_45_0 = stackIn_45_0;
                      stackOut_45_1 = 0;
                      stackIn_46_0 = stackOut_45_0;
                      stackIn_46_1 = stackOut_45_1;
                      break L12;
                    } else {
                      stackOut_43_0 = stackIn_43_0;
                      stackOut_43_1 = 1;
                      stackIn_46_0 = stackOut_43_0;
                      stackIn_46_1 = stackOut_43_1;
                      break L12;
                    }
                  }
                  L13: {
                    var4 = stackIn_46_0 & stackIn_46_1;
                    stackOut_46_0 = var3_int;
                    stackIn_49_0 = stackOut_46_0;
                    stackIn_47_0 = stackOut_46_0;
                    if ((2 & this.field_Z ^ -1) == -1) {
                      stackOut_49_0 = stackIn_49_0;
                      stackOut_49_1 = 0;
                      stackIn_50_0 = stackOut_49_0;
                      stackIn_50_1 = stackOut_49_1;
                      break L13;
                    } else {
                      stackOut_47_0 = stackIn_47_0;
                      stackOut_47_1 = 1;
                      stackIn_50_0 = stackOut_47_0;
                      stackIn_50_1 = stackOut_47_1;
                      break L13;
                    }
                  }
                  var3_int = stackIn_50_0 & stackIn_50_1;
                  break L9;
                }
              }
              L14: {
                var7 = 0;
                var8 = 0;
                var9 = 0;
                var10 = 0;
                if (var5 != 0) {
                  var8 = var7;
                  var7 = (byte)(var7 + 12);
                  break L14;
                } else {
                  break L14;
                }
              }
              L15: {
                var11 = 0;
                if (var3_int == 0) {
                  break L15;
                } else {
                  var9 = var7;
                  var7 = (byte)(var7 + 4);
                  break L15;
                }
              }
              L16: {
                if (var4 != 0) {
                  var10 = var7;
                  var7 = (byte)(var7 + 12);
                  break L16;
                } else {
                  break L16;
                }
              }
              L17: {
                if (var6 == 0) {
                  break L17;
                } else {
                  var11 = var7;
                  var7 = (byte)(var7 + 8);
                  break L17;
                }
              }
              if (-1 == (var7 ^ -1)) {
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                L18: {
                  L19: {
                    if ((this.field_R.field_cb.field_g.length ^ -1) <= (this.field_L * var7 ^ -1)) {
                      break L19;
                    } else {
                      this.field_R.field_cb = new qf((this.field_L + 100) * var7);
                      if (var35 == 0) {
                        break L18;
                      } else {
                        break L19;
                      }
                    }
                  }
                  this.field_R.field_cb.field_h = 0;
                  break L18;
                }
                L20: {
                  L21: {
                    var12 = this.field_R.field_cb;
                    if (var5 == 0) {
                      break L21;
                    } else {
                      L22: {
                        if (this.field_R.field_O) {
                          break L22;
                        } else {
                          var13_int = 0;
                          L23: while (true) {
                            stackOut_78_0 = var13_int ^ -1;
                            stackOut_78_1 = this.field_lb ^ -1;
                            stackIn_79_0 = stackOut_78_0;
                            stackIn_79_1 = stackOut_78_1;
                            L24: while (true) {
                              L25: {
                                if (stackIn_79_0 <= stackIn_79_1) {
                                  break L25;
                                } else {
                                  var14_int = jaclib.memory.Stream.floatToRawIntBits((float)this.field_P[var13_int]);
                                  var15_int = jaclib.memory.Stream.floatToRawIntBits((float)this.field_K[var13_int]);
                                  var16_int = jaclib.memory.Stream.floatToRawIntBits((float)this.field_A[var13_int]);
                                  var17_int = this.field_e[var13_int];
                                  var18_int = this.field_e[1 + var13_int];
                                  stackOut_80_0 = var17_int;
                                  stackIn_109_0 = stackOut_80_0;
                                  stackIn_81_0 = stackOut_80_0;
                                  if (var35 != 0) {
                                    break L20;
                                  } else {
                                    var19 = stackIn_81_0;
                                    L26: while (true) {
                                      L27: {
                                        if ((var18_int ^ -1) >= (var19 ^ -1)) {
                                          break L27;
                                        } else {
                                          var20 = this.field_q[var19] - 1;
                                          stackOut_83_0 = 0;
                                          stackOut_83_1 = var20 ^ -1;
                                          stackIn_79_0 = stackOut_83_0;
                                          stackIn_79_1 = stackOut_83_1;
                                          stackIn_84_0 = stackOut_83_0;
                                          stackIn_84_1 = stackOut_83_1;
                                          if (var35 != 0) {
                                            continue L24;
                                          } else {
                                            L28: {
                                              if (stackIn_84_0 != stackIn_84_1) {
                                                break L28;
                                              } else {
                                                if (var35 == 0) {
                                                  break L27;
                                                } else {
                                                  break L28;
                                                }
                                              }
                                            }
                                            var12.field_h = var7 * var20;
                                            var12.a((byte) -35, var14_int);
                                            var12.a((byte) -35, var15_int);
                                            var12.a((byte) -35, var16_int);
                                            var19++;
                                            if (var35 == 0) {
                                              continue L26;
                                            } else {
                                              break L27;
                                            }
                                          }
                                        }
                                      }
                                      var13_int++;
                                      if (var35 == 0) {
                                        continue L23;
                                      } else {
                                        break L25;
                                      }
                                    }
                                  }
                                }
                              }
                              if (var35 == 0) {
                                break L21;
                              } else {
                                break L22;
                              }
                            }
                          }
                        }
                      }
                      var13_int = 0;
                      L29: while (true) {
                        stackOut_94_0 = var13_int ^ -1;
                        stackOut_94_1 = this.field_lb ^ -1;
                        stackIn_95_0 = stackOut_94_0;
                        stackIn_95_1 = stackOut_94_1;
                        L30: while (true) {
                          if (stackIn_95_0 <= stackIn_95_1) {
                            break L21;
                          } else {
                            var14_int = jaclib.memory.Stream.floatToRawIntBits((float)this.field_P[var13_int]);
                            var15_int = jaclib.memory.Stream.floatToRawIntBits((float)this.field_K[var13_int]);
                            var16_int = jaclib.memory.Stream.floatToRawIntBits((float)this.field_A[var13_int]);
                            var17_int = this.field_e[var13_int];
                            var18_int = this.field_e[1 + var13_int];
                            stackOut_96_0 = var17_int;
                            stackIn_109_0 = stackOut_96_0;
                            stackIn_97_0 = stackOut_96_0;
                            if (var35 != 0) {
                              break L20;
                            } else {
                              var19 = stackIn_97_0;
                              L31: while (true) {
                                L32: {
                                  if (var19 >= var18_int) {
                                    break L32;
                                  } else {
                                    var20 = this.field_q[var19] - 1;
                                    stackOut_99_0 = -1;
                                    stackOut_99_1 = var20;
                                    stackIn_95_0 = stackOut_99_0;
                                    stackIn_95_1 = stackOut_99_1;
                                    stackIn_100_0 = stackOut_99_0;
                                    stackIn_100_1 = stackOut_99_1;
                                    if (var35 != 0) {
                                      continue L30;
                                    } else {
                                      L33: {
                                        if (stackIn_100_0 != stackIn_100_1) {
                                          break L33;
                                        } else {
                                          if (var35 == 0) {
                                            break L32;
                                          } else {
                                            break L33;
                                          }
                                        }
                                      }
                                      var12.field_h = var20 * var7;
                                      var12.a(var14_int, (byte) -72);
                                      var12.a(var15_int, (byte) -13);
                                      var12.a(var16_int, (byte) 81);
                                      var19++;
                                      if (var35 == 0) {
                                        continue L31;
                                      } else {
                                        break L32;
                                      }
                                    }
                                  }
                                }
                                var13_int++;
                                if (var35 == 0) {
                                  continue L29;
                                } else {
                                  break L21;
                                }
                              }
                            }
                          }
                        }
                      }
                    }
                  }
                  stackOut_108_0 = var3_int;
                  stackIn_109_0 = stackOut_108_0;
                  break L20;
                }
                L34: {
                  L35: {
                    if (stackIn_109_0 == 0) {
                      break L35;
                    } else {
                      L36: {
                        if (null == this.field_F) {
                          break L36;
                        } else {
                          var13_int = 0;
                          L37: while (true) {
                            L38: {
                              if ((this.field_W ^ -1) >= (var13_int ^ -1)) {
                                break L38;
                              } else {
                                var14_int = this.a(-2117016184, (int) this.field_X[var13_int], this.field_o[var13_int], this.field_I[var13_int], (int) this.field_B);
                                var12.field_h = var9 + var7 * this.field_H[var13_int];
                                var12.a(var14_int, (byte) 92);
                                var12.field_h = var7 * this.field_z[var13_int] + var9;
                                var12.a(var14_int, (byte) 91);
                                var12.field_h = var9 - -(this.field_hb[var13_int] * var7);
                                var12.a(var14_int, (byte) 113);
                                var13_int++;
                                if (var35 != 0) {
                                  break L35;
                                } else {
                                  if (var35 == 0) {
                                    continue L37;
                                  } else {
                                    break L38;
                                  }
                                }
                              }
                            }
                            if (var35 == 0) {
                              break L35;
                            } else {
                              break L36;
                            }
                          }
                        }
                      }
                      L39: {
                        L40: {
                          if (this.field_i == null) {
                            break L40;
                          } else {
                            var16 = this.field_i.field_e;
                            var13 = this.field_i.field_d;
                            var14 = this.field_i.field_b;
                            var15 = this.field_i.field_f;
                            if (var35 == 0) {
                              break L39;
                            } else {
                              break L40;
                            }
                          }
                        }
                        var16 = this.field_O;
                        var13 = this.field_E;
                        var14 = this.field_Y;
                        var15 = this.field_cb;
                        break L39;
                      }
                      var28 = this.field_R.field_Wb[0];
                      var29 = this.field_R.field_Wb[1];
                      var30 = this.field_R.field_Wb[2];
                      var31 = this.field_R.field_tc;
                      var32 = this.field_R.field_cd * 768.0f / (float)this.field_h;
                      var33 = 768.0f * this.field_R.field_Sb / (float)this.field_h;
                      var34 = 0;
                      L41: while (true) {
                        if ((this.field_W ^ -1) >= (var34 ^ -1)) {
                          break L35;
                        } else {
                          var24 = this.a(-2117016184, (int) this.field_X[var34], this.field_o[var34], this.field_I[var34], (int) this.field_B);
                          var20_float = (float)(var24 >>> -1389478568) * this.field_R.field_wc;
                          var22 = this.field_R.field_bc * (float)(255 & var24 >> -1368006712);
                          var21 = (float)(var24 >> -408436688 & 255) * this.field_R.field_Fb;
                          var23 = this.field_H[var34];
                          var17_int = (short)var16[var23];
                          stackOut_127_0 = var17_int;
                          stackIn_215_0 = stackOut_127_0;
                          stackIn_128_0 = stackOut_127_0;
                          if (var35 != 0) {
                            break L34;
                          } else {
                            L42: {
                              L43: {
                                if (stackIn_128_0 == 0) {
                                  break L43;
                                } else {
                                  var18 = ((float)var15[var23] * var30 + ((float)var13[var23] * var28 + var29 * (float)var14[var23])) / (float)(var17_int * 256);
                                  if (var35 == 0) {
                                    break L42;
                                  } else {
                                    break L43;
                                  }
                                }
                              }
                              var18 = ((float)var15[var23] * var30 + ((float)var14[var23] * var29 + var28 * (float)var13[var23])) * 0.0026041667442768812f;
                              break L42;
                            }
                            L44: {
                              if (var18 < 0.0f) {
                                stackOut_136_0 = var33;
                                stackIn_137_0 = stackOut_136_0;
                                break L44;
                              } else {
                                stackOut_134_0 = var32;
                                stackIn_137_0 = stackOut_134_0;
                                break L44;
                              }
                            }
                            L45: {
                              L46: {
                                var19_float = stackIn_137_0 * var18 + var31;
                                var25 = (int)(var20_float * var19_float);
                                var26 = (int)(var19_float * var21);
                                if ((var25 ^ -1) <= -1) {
                                  break L46;
                                } else {
                                  var25 = 0;
                                  if (var35 == 0) {
                                    break L45;
                                  } else {
                                    break L46;
                                  }
                                }
                              }
                              if ((var25 ^ -1) >= -256) {
                                break L45;
                              } else {
                                var25 = 255;
                                break L45;
                              }
                            }
                            L47: {
                              L48: {
                                if (0 <= var26) {
                                  break L48;
                                } else {
                                  var26 = 0;
                                  if (var35 == 0) {
                                    break L47;
                                  } else {
                                    break L48;
                                  }
                                }
                              }
                              if (255 >= var26) {
                                break L47;
                              } else {
                                var26 = 255;
                                break L47;
                              }
                            }
                            L49: {
                              L50: {
                                var27 = (int)(var19_float * var22);
                                var12.field_h = var9 - -(var23 * var7);
                                if (0 <= var27) {
                                  break L50;
                                } else {
                                  var27 = 0;
                                  if (var35 == 0) {
                                    break L49;
                                  } else {
                                    break L50;
                                  }
                                }
                              }
                              if (255 < var27) {
                                var27 = 255;
                                break L49;
                              } else {
                                break L49;
                              }
                            }
                            L51: {
                              L52: {
                                var12.i(var25, param0 + 0);
                                var12.i(var26, 0);
                                var12.i(var27, 0);
                                var12.i(255 + -(this.field_o[var34] & 255), 0);
                                var23 = this.field_z[var34];
                                var17_int = (short)var16[var23];
                                if (-1 == (var17_int ^ -1)) {
                                  break L52;
                                } else {
                                  var18 = (var30 * (float)var15[var23] + (var28 * (float)var13[var23] + var29 * (float)var14[var23])) / (float)(256 * var17_int);
                                  if (var35 == 0) {
                                    break L51;
                                  } else {
                                    break L52;
                                  }
                                }
                              }
                              var18 = ((float)var13[var23] * var28 + var29 * (float)var14[var23] + (float)var15[var23] * var30) * 0.0026041667442768812f;
                              break L51;
                            }
                            L53: {
                              stackOut_160_0 = var31;
                              stackOut_160_1 = var18;
                              stackIn_163_0 = stackOut_160_0;
                              stackIn_163_1 = stackOut_160_1;
                              stackIn_161_0 = stackOut_160_0;
                              stackIn_161_1 = stackOut_160_1;
                              if (0.0f <= var18) {
                                stackOut_163_0 = stackIn_163_0;
                                stackOut_163_1 = stackIn_163_1;
                                stackOut_163_2 = var32;
                                stackIn_164_0 = stackOut_163_0;
                                stackIn_164_1 = stackOut_163_1;
                                stackIn_164_2 = stackOut_163_2;
                                break L53;
                              } else {
                                stackOut_161_0 = stackIn_161_0;
                                stackOut_161_1 = stackIn_161_1;
                                stackOut_161_2 = var33;
                                stackIn_164_0 = stackOut_161_0;
                                stackIn_164_1 = stackOut_161_1;
                                stackIn_164_2 = stackOut_161_2;
                                break L53;
                              }
                            }
                            L54: {
                              L55: {
                                var19_float = stackIn_164_0 + stackIn_164_1 * stackIn_164_2;
                                var25 = (int)(var20_float * var19_float);
                                var26 = (int)(var19_float * var21);
                                if ((var25 ^ -1) > -1) {
                                  break L55;
                                } else {
                                  if (255 < var25) {
                                    var25 = 255;
                                    if (var35 == 0) {
                                      break L54;
                                    } else {
                                      break L55;
                                    }
                                  } else {
                                    break L54;
                                  }
                                }
                              }
                              var25 = 0;
                              break L54;
                            }
                            L56: {
                              L57: {
                                var27 = (int)(var19_float * var22);
                                if ((var26 ^ -1) > -1) {
                                  break L57;
                                } else {
                                  if (255 < var26) {
                                    var26 = 255;
                                    if (var35 == 0) {
                                      break L56;
                                    } else {
                                      break L57;
                                    }
                                  } else {
                                    break L56;
                                  }
                                }
                              }
                              var26 = 0;
                              break L56;
                            }
                            L58: {
                              L59: {
                                if (var27 < 0) {
                                  break L59;
                                } else {
                                  if (var27 <= 255) {
                                    break L58;
                                  } else {
                                    var27 = 255;
                                    if (var35 == 0) {
                                      break L58;
                                    } else {
                                      break L59;
                                    }
                                  }
                                }
                              }
                              var27 = 0;
                              break L58;
                            }
                            L60: {
                              L61: {
                                var12.field_h = var23 * var7 + var9;
                                var12.i(var25, param0 + 0);
                                var12.i(var26, param0 ^ 0);
                                var12.i(var27, 0);
                                var12.i(255 - (255 & this.field_o[var34]), param0 + 0);
                                var23 = this.field_hb[var34];
                                var17_int = (short)var16[var23];
                                if (-1 == (var17_int ^ -1)) {
                                  break L61;
                                } else {
                                  var18 = ((float)var15[var23] * var30 + (var29 * (float)var14[var23] + var28 * (float)var13[var23])) / (float)(var17_int * 256);
                                  if (var35 == 0) {
                                    break L60;
                                  } else {
                                    break L61;
                                  }
                                }
                              }
                              var18 = 0.0026041667442768812f * ((float)var13[var23] * var28 + var29 * (float)var14[var23] + (float)var15[var23] * var30);
                              break L60;
                            }
                            L62: {
                              if (0.0f <= var18) {
                                stackOut_192_0 = var32;
                                stackIn_193_0 = stackOut_192_0;
                                break L62;
                              } else {
                                stackOut_190_0 = var33;
                                stackIn_193_0 = stackOut_190_0;
                                break L62;
                              }
                            }
                            L63: {
                              L64: {
                                var19_float = stackIn_193_0 * var18 + var31;
                                var25 = (int)(var19_float * var20_float);
                                var26 = (int)(var19_float * var21);
                                if ((var25 ^ -1) > -1) {
                                  break L64;
                                } else {
                                  if ((var25 ^ -1) >= -256) {
                                    break L63;
                                  } else {
                                    var25 = 255;
                                    if (var35 == 0) {
                                      break L63;
                                    } else {
                                      break L64;
                                    }
                                  }
                                }
                              }
                              var25 = 0;
                              break L63;
                            }
                            L65: {
                              L66: {
                                var27 = (int)(var22 * var19_float);
                                if ((var26 ^ -1) <= -1) {
                                  break L66;
                                } else {
                                  var26 = 0;
                                  if (var35 == 0) {
                                    break L65;
                                  } else {
                                    break L66;
                                  }
                                }
                              }
                              if ((var26 ^ -1) < -256) {
                                var26 = 255;
                                break L65;
                              } else {
                                break L65;
                              }
                            }
                            L67: {
                              L68: {
                                if (0 <= var27) {
                                  break L68;
                                } else {
                                  var27 = 0;
                                  if (var35 == 0) {
                                    break L67;
                                  } else {
                                    break L68;
                                  }
                                }
                              }
                              if (-256 <= (var27 ^ -1)) {
                                break L67;
                              } else {
                                var27 = 255;
                                break L67;
                              }
                            }
                            var12.field_h = var9 + var7 * var23;
                            var12.i(var25, 0);
                            var12.i(var26, 0);
                            var12.i(var27, 0);
                            var12.i(-(this.field_o[var34] & 255) + 255, 0);
                            var34++;
                            if (var35 == 0) {
                              continue L41;
                            } else {
                              break L35;
                            }
                          }
                        }
                      }
                    }
                  }
                  stackOut_214_0 = var4;
                  stackIn_215_0 = stackOut_214_0;
                  break L34;
                }
                L69: {
                  L70: {
                    if (stackIn_215_0 == 0) {
                      break L70;
                    } else {
                      L71: {
                        L72: {
                          if (null == this.field_i) {
                            break L72;
                          } else {
                            var13 = this.field_i.field_d;
                            var16 = this.field_i.field_e;
                            var15 = this.field_i.field_f;
                            var14 = this.field_i.field_b;
                            if (var35 == 0) {
                              break L71;
                            } else {
                              break L72;
                            }
                          }
                        }
                        var15 = this.field_cb;
                        var14 = this.field_Y;
                        var13 = this.field_E;
                        var16 = this.field_O;
                        break L71;
                      }
                      L73: {
                        var17 = 3.0f / (float)this.field_h;
                        var12.field_h = var10;
                        var18 = 3.0f / (float)(this.field_h + this.field_h / 2);
                        if (this.field_R.field_O) {
                          break L73;
                        } else {
                          var19 = 0;
                          L74: while (true) {
                            L75: {
                              if ((this.field_L ^ -1) >= (var19 ^ -1)) {
                                break L75;
                              } else {
                                var20 = 255 & var16[var19];
                                stackOut_224_0 = -1;
                                stackIn_244_0 = stackOut_224_0;
                                stackIn_225_0 = stackOut_224_0;
                                if (var35 != 0) {
                                  break L69;
                                } else {
                                  L76: {
                                    L77: {
                                      if (stackIn_225_0 == (var20 ^ -1)) {
                                        break L77;
                                      } else {
                                        var21 = var17 / (float)var20;
                                        var12.a((byte) 114, var21 * (float)var13[var19]);
                                        var12.a((byte) 114, (float)var14[var19] * var21);
                                        var12.a((byte) 114, (float)var15[var19] * var21);
                                        if (var35 == 0) {
                                          break L76;
                                        } else {
                                          break L77;
                                        }
                                      }
                                    }
                                    var12.a((byte) 114, var18 * (float)var13[var19]);
                                    var12.a((byte) 114, (float)var14[var19] * var18);
                                    var12.a((byte) 114, (float)var15[var19] * var18);
                                    break L76;
                                  }
                                  var12.field_h = var12.field_h + (-12 + var7);
                                  var19++;
                                  if (var35 == 0) {
                                    continue L74;
                                  } else {
                                    break L75;
                                  }
                                }
                              }
                            }
                            if (var35 == 0) {
                              break L70;
                            } else {
                              break L73;
                            }
                          }
                        }
                      }
                      var19 = 0;
                      L78: while (true) {
                        if (this.field_L <= var19) {
                          break L70;
                        } else {
                          var20 = var16[var19] & 255;
                          stackOut_235_0 = var20 ^ -1;
                          stackIn_244_0 = stackOut_235_0;
                          stackIn_236_0 = stackOut_235_0;
                          if (var35 != 0) {
                            break L69;
                          } else {
                            L79: {
                              L80: {
                                if (stackIn_236_0 == -1) {
                                  break L80;
                                } else {
                                  var21 = var17 / (float)var20;
                                  var12.a(17133, var21 * (float)var13[var19]);
                                  var12.a(17133, (float)var14[var19] * var21);
                                  var12.a(param0 + 17133, var21 * (float)var15[var19]);
                                  if (var35 == 0) {
                                    break L79;
                                  } else {
                                    break L80;
                                  }
                                }
                              }
                              var12.a(17133, (float)var13[var19] * var18);
                              var12.a(17133, (float)var14[var19] * var18);
                              var12.a(17133, (float)var15[var19] * var18);
                              break L79;
                            }
                            var12.field_h = var12.field_h + (-12 + var7);
                            var19++;
                            if (var35 == 0) {
                              continue L78;
                            } else {
                              break L70;
                            }
                          }
                        }
                      }
                    }
                  }
                  stackOut_243_0 = var6;
                  stackIn_244_0 = stackOut_243_0;
                  break L69;
                }
                L81: {
                  L82: {
                    if (stackIn_244_0 != 0) {
                      L83: {
                        var12.field_h = var11;
                        if (!this.field_R.field_O) {
                          break L83;
                        } else {
                          var13_int = 0;
                          L84: while (true) {
                            L85: {
                              if ((this.field_L ^ -1) >= (var13_int ^ -1)) {
                                break L85;
                              } else {
                                var12.a(17133, this.field_n[var13_int]);
                                var12.a(17133, this.field_y[var13_int]);
                                var12.field_h = var12.field_h + (var7 + -8);
                                var13_int++;
                                if (var35 != 0) {
                                  break L81;
                                } else {
                                  if (var35 == 0) {
                                    continue L84;
                                  } else {
                                    break L85;
                                  }
                                }
                              }
                            }
                            if (var35 == 0) {
                              break L82;
                            } else {
                              break L83;
                            }
                          }
                        }
                      }
                      var13_int = 0;
                      L86: while (true) {
                        if (this.field_L <= var13_int) {
                          break L82;
                        } else {
                          var12.a((byte) 114, this.field_n[var13_int]);
                          var12.a((byte) 114, this.field_y[var13_int]);
                          var12.field_h = var12.field_h + (-8 + var7);
                          var13_int++;
                          if (var35 != 0) {
                            break L81;
                          } else {
                            if (var35 == 0) {
                              continue L86;
                            } else {
                              break L82;
                            }
                          }
                        }
                      }
                    } else {
                      break L82;
                    }
                  }
                  var12.field_h = this.field_L * var7;
                  break L81;
                }
                L87: {
                  L88: {
                    if (!param1) {
                      break L88;
                    } else {
                      L89: {
                        L90: {
                          if (this.field_Q == null) {
                            break L90;
                          } else {
                            this.field_Q.a(var7, var12.field_h, (byte) -112, var12.field_g);
                            if (var35 == 0) {
                              break L89;
                            } else {
                              break L90;
                            }
                          }
                        }
                        this.field_Q = this.field_R.a(var12.field_h, var12.field_g, var7, true, (byte) 117);
                        break L89;
                      }
                      this.field_Z = (byte) 0;
                      var13_ref = this.field_Q;
                      if (var35 == 0) {
                        break L87;
                      } else {
                        break L88;
                      }
                    }
                  }
                  var13_ref = this.field_R.a(var12.field_h, var12.field_g, var7, false, (byte) 99);
                  this.field_gb = true;
                  break L87;
                }
                L91: {
                  if (var5 != 0) {
                    this.field_g.field_g = (byte) var8;
                    this.field_g.field_d = var13_ref;
                    break L91;
                  } else {
                    break L91;
                  }
                }
                L92: {
                  if (var6 == 0) {
                    break L92;
                  } else {
                    this.field_ab.field_g = (byte) var11;
                    this.field_ab.field_d = var13_ref;
                    break L92;
                  }
                }
                L93: {
                  if (var3_int == 0) {
                    break L93;
                  } else {
                    this.field_kb.field_g = (byte) var9;
                    this.field_kb.field_d = var13_ref;
                    break L93;
                  }
                }
                L94: {
                  if (var4 == 0) {
                    break L94;
                  } else {
                    this.field_F.field_d = var13_ref;
                    this.field_F.field_g = (byte) var10;
                    break L94;
                  }
                }
                decompiledRegionSelector0 = 2;
                break L0;
              }
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw tba.a((Throwable) ((Object) var3), "np.T(" + param0 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return;
          } else {
            return;
          }
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
        cka stackIn_35_0 = null;
        int stackIn_35_1 = 0;
        cka stackIn_37_0 = null;
        int stackIn_37_1 = 0;
        cka stackIn_38_0 = null;
        int stackIn_38_1 = 0;
        int stackIn_38_2 = 0;
        int decompiledRegionSelector0 = 0;
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
        cka stackOut_34_0 = null;
        int stackOut_34_1 = 0;
        cka stackOut_37_0 = null;
        int stackOut_37_1 = 0;
        int stackOut_37_2 = 0;
        cka stackOut_35_0 = null;
        int stackOut_35_1 = 0;
        int stackOut_35_2 = 0;
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
                L3: {
                  this.a(0, param0);
                  if (this.field_w != null) {
                    L4: {
                      if (null != this.field_w.field_a) {
                        break L4;
                      } else {
                        L5: {
                          stackOut_11_0 = this;
                          stackOut_11_1 = -24;
                          stackIn_16_0 = stackOut_11_0;
                          stackIn_16_1 = stackOut_11_1;
                          stackIn_12_0 = stackOut_11_0;
                          stackIn_12_1 = stackOut_11_1;
                          if (0 == (this.field_Z & 16)) {
                            stackOut_16_0 = this;
                            stackOut_16_1 = stackIn_16_1;
                            stackOut_16_2 = 0;
                            stackIn_17_0 = stackOut_16_0;
                            stackIn_17_1 = stackOut_16_1;
                            stackIn_17_2 = stackOut_16_2;
                            break L5;
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
                            break L5;
                          }
                        }
                        this.a((byte) stackIn_17_1, stackIn_17_2 != 0);
                        break L4;
                      }
                    }
                    if (this.field_w.field_a == null) {
                      break L3;
                    } else {
                      L6: {
                        stackOut_19_0 = this.field_R;
                        stackOut_19_1 = 96;
                        stackIn_24_0 = stackOut_19_0;
                        stackIn_24_1 = stackOut_19_1;
                        stackIn_20_0 = stackOut_19_0;
                        stackIn_20_1 = stackOut_19_1;
                        if (this.field_F == null) {
                          stackOut_24_0 = (cka) ((Object) stackIn_24_0);
                          stackOut_24_1 = stackIn_24_1;
                          stackOut_24_2 = 0;
                          stackIn_25_0 = stackOut_24_0;
                          stackIn_25_1 = stackOut_24_1;
                          stackIn_25_2 = stackOut_24_2;
                          break L6;
                        } else {
                          stackOut_20_0 = (cka) ((Object) stackIn_20_0);
                          stackOut_20_1 = stackIn_20_1;
                          stackIn_22_0 = stackOut_20_0;
                          stackIn_22_1 = stackOut_20_1;
                          stackOut_22_0 = (cka) ((Object) stackIn_22_0);
                          stackOut_22_1 = stackIn_22_1;
                          stackOut_22_2 = 1;
                          stackIn_25_0 = stackOut_22_0;
                          stackIn_25_1 = stackOut_22_1;
                          stackIn_25_2 = stackOut_22_2;
                          break L6;
                        }
                      }
                      ((cka) (Object) stackIn_25_0).a(stackIn_25_1, stackIn_25_2 != 0);
                      this.field_R.a(this.field_kb, this.field_ab, this.field_F, -120, this.field_g);
                      var2_int = -1 + this.field_p.length;
                      var3 = 0;
                      L7: while (true) {
                        if ((var3 ^ -1) <= (var2_int ^ -1)) {
                          break L3;
                        } else {
                          var4 = this.field_p[var3];
                          var5 = this.field_p[1 + var3];
                          var6 = 65535 & this.field_I[var4];
                          if (var7 != 0) {
                            break L2;
                          } else {
                            L8: {
                              if ((var6 ^ -1) == -65536) {
                                var6 = -1;
                                break L8;
                              } else {
                                break L8;
                              }
                            }
                            L9: {
                              stackOut_34_0 = this.field_R;
                              stackOut_34_1 = 70;
                              stackIn_37_0 = stackOut_34_0;
                              stackIn_37_1 = stackOut_34_1;
                              stackIn_35_0 = stackOut_34_0;
                              stackIn_35_1 = stackOut_34_1;
                              if (null == this.field_F) {
                                stackOut_37_0 = (cka) ((Object) stackIn_37_0);
                                stackOut_37_1 = stackIn_37_1;
                                stackOut_37_2 = 0;
                                stackIn_38_0 = stackOut_37_0;
                                stackIn_38_1 = stackOut_37_1;
                                stackIn_38_2 = stackOut_37_2;
                                break L9;
                              } else {
                                stackOut_35_0 = (cka) ((Object) stackIn_35_0);
                                stackOut_35_1 = stackIn_35_1;
                                stackOut_35_2 = 1;
                                stackIn_38_0 = stackOut_35_0;
                                stackIn_38_1 = stackOut_35_1;
                                stackIn_38_2 = stackOut_35_2;
                                break L9;
                              }
                            }
                            ((cka) (Object) stackIn_38_0).a((byte) stackIn_38_1, stackIn_38_2 != 0, var6);
                            this.field_R.a(3 * var4, 4, -513, this.field_w.field_a, 3 * (var5 - var4));
                            var3++;
                            if (var7 == 0) {
                              continue L7;
                            } else {
                              break L3;
                            }
                          }
                        }
                      }
                    }
                  } else {
                    break L3;
                  }
                }
                this.c((byte) 31);
                break L2;
              }
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
              L2: {
                L3: {
                  if (var4_int >= this.field_lb) {
                    break L3;
                  } else {
                    if (var5 != 0) {
                      break L2;
                    } else {
                      L4: {
                        if (param0 == 128) {
                          break L4;
                        } else {
                          this.field_P[var4_int] = param0 * this.field_P[var4_int] >> -704502937;
                          break L4;
                        }
                      }
                      L5: {
                        if (-129 == (param1 ^ -1)) {
                          break L5;
                        } else {
                          this.field_K[var4_int] = param1 * this.field_K[var4_int] >> 1965436231;
                          break L5;
                        }
                      }
                      L6: {
                        if (param2 != 128) {
                          this.field_A[var4_int] = this.field_A[var4_int] * param2 >> 1714908615;
                          break L6;
                        } else {
                          break L6;
                        }
                      }
                      var4_int++;
                      if (var5 == 0) {
                        continue L1;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
                this.field_l = false;
                break L2;
              }
              L7: {
                if (this.field_g == null) {
                  break L7;
                } else {
                  this.field_g.field_d = null;
                  break L7;
                }
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw tba.a((Throwable) ((Object) runtimeException), "np.O(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final void a(int param0, int[] param1, int param2, int param3, int param4, int param5, boolean param6) {
        RuntimeException var8 = null;
        int var8_int = 0;
        int var9 = 0;
        int var10 = 0;
        pm var10_ref_pm = null;
        int var11_int = 0;
        int[] var11 = null;
        fd var11_ref = null;
        int var12 = 0;
        int[] var12_ref_int__ = null;
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
        int stackIn_5_0 = 0;
        int stackIn_5_1 = 0;
        int stackIn_18_0 = 0;
        int stackIn_18_1 = 0;
        int stackIn_45_0 = 0;
        int stackIn_45_1 = 0;
        int stackIn_47_0 = 0;
        int stackIn_47_1 = 0;
        int stackIn_54_0 = 0;
        int stackIn_54_1 = 0;
        int stackIn_68_0 = 0;
        int stackIn_68_1 = 0;
        int stackIn_82_0 = 0;
        int stackIn_83_0 = 0;
        int stackIn_83_1 = 0;
        int stackIn_90_0 = 0;
        int stackIn_90_1 = 0;
        int stackIn_92_0 = 0;
        int stackIn_95_0 = 0;
        int stackIn_95_1 = 0;
        int stackIn_146_0 = 0;
        int stackIn_146_1 = 0;
        int stackIn_152_0 = 0;
        int stackIn_152_1 = 0;
        int stackIn_164_0 = 0;
        int stackIn_164_1 = 0;
        int stackIn_174_0 = 0;
        int stackIn_174_1 = 0;
        int stackIn_185_0 = 0;
        int stackIn_185_1 = 0;
        int stackIn_187_0 = 0;
        int stackIn_187_1 = 0;
        int stackIn_193_0 = 0;
        int stackIn_193_1 = 0;
        int stackIn_221_0 = 0;
        int stackIn_221_1 = 0;
        RuntimeException stackIn_282_0 = null;
        StringBuilder stackIn_282_1 = null;
        RuntimeException stackIn_284_0 = null;
        StringBuilder stackIn_284_1 = null;
        RuntimeException stackIn_285_0 = null;
        StringBuilder stackIn_285_1 = null;
        String stackIn_285_2 = null;
        int decompiledRegionSelector0 = 0;
        Throwable caughtException = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_184_0 = 0;
        int stackOut_184_1 = 0;
        int stackOut_186_0 = 0;
        int stackOut_186_1 = 0;
        int stackOut_220_0 = 0;
        int stackOut_220_1 = 0;
        int stackOut_192_0 = 0;
        int stackOut_192_1 = 0;
        int stackOut_145_0 = 0;
        int stackOut_145_1 = 0;
        int stackOut_173_0 = 0;
        int stackOut_173_1 = 0;
        int stackOut_151_0 = 0;
        int stackOut_151_1 = 0;
        int stackOut_163_0 = 0;
        int stackOut_163_1 = 0;
        int stackOut_44_0 = 0;
        int stackOut_44_1 = 0;
        int stackOut_46_0 = 0;
        int stackOut_46_1 = 0;
        int stackOut_89_0 = 0;
        int stackOut_89_1 = 0;
        int stackOut_91_0 = 0;
        int stackOut_94_0 = 0;
        int stackOut_94_1 = 0;
        int stackOut_81_0 = 0;
        int stackOut_82_0 = 0;
        int stackOut_82_1 = 0;
        int stackOut_53_0 = 0;
        int stackOut_53_1 = 0;
        int stackOut_67_0 = 0;
        int stackOut_67_1 = 0;
        int stackOut_4_0 = 0;
        int stackOut_4_1 = 0;
        int stackOut_17_0 = 0;
        int stackOut_17_1 = 0;
        RuntimeException stackOut_281_0 = null;
        StringBuilder stackOut_281_1 = null;
        RuntimeException stackOut_284_0 = null;
        StringBuilder stackOut_284_1 = null;
        String stackOut_284_2 = null;
        RuntimeException stackOut_282_0 = null;
        StringBuilder stackOut_282_1 = null;
        String stackOut_282_2 = null;
        var21 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            var8_int = param1.length;
            if (0 != param0) {
              if (-2 == (param0 ^ -1)) {
                param2 = param2 << 4;
                param3 = param3 << 4;
                param4 = param4 << 4;
                var9 = 0;
                L1: while (true) {
                  L2: {
                    if (var8_int <= var9) {
                      break L2;
                    } else {
                      L3: {
                        L4: {
                          var10 = param1[var9];
                          if ((var10 ^ -1) > (this.field_d.length ^ -1)) {
                            var11 = this.field_d[var10];
                            var12 = 0;
                            L5: while (true) {
                              if (var12 >= var11.length) {
                                break L4;
                              } else {
                                var13_int = var11[var12];
                                this.field_P[var13_int] = this.field_P[var13_int] + param2;
                                this.field_K[var13_int] = this.field_K[var13_int] + param3;
                                this.field_A[var13_int] = this.field_A[var13_int] + param4;
                                var12++;
                                if (var21 != 0) {
                                  break L3;
                                } else {
                                  if (var21 == 0) {
                                    continue L5;
                                  } else {
                                    break L4;
                                  }
                                }
                              }
                            }
                          } else {
                            break L4;
                          }
                        }
                        var9++;
                        break L3;
                      }
                      if (var21 == 0) {
                        continue L1;
                      } else {
                        break L2;
                      }
                    }
                  }
                  decompiledRegionSelector0 = 1;
                  break L0;
                }
              } else {
                if (2 != param0) {
                  if (-4 == (param0 ^ -1)) {
                    var9 = 0;
                    L6: while (true) {
                      L7: {
                        if (var8_int <= var9) {
                          break L7;
                        } else {
                          L8: {
                            L9: {
                              var10 = param1[var9];
                              if (this.field_d.length > var10) {
                                var11 = this.field_d[var10];
                                var12 = 0;
                                L10: while (true) {
                                  if (var11.length <= var12) {
                                    break L9;
                                  } else {
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
                                    if (var21 != 0) {
                                      break L8;
                                    } else {
                                      if (var21 == 0) {
                                        continue L10;
                                      } else {
                                        break L9;
                                      }
                                    }
                                  }
                                }
                              } else {
                                break L9;
                              }
                            }
                            var9++;
                            break L8;
                          }
                          if (var21 == 0) {
                            continue L6;
                          } else {
                            break L7;
                          }
                        }
                      }
                      decompiledRegionSelector0 = 3;
                      break L0;
                    }
                  } else {
                    if (5 != param0) {
                      if (-8 != (param0 ^ -1)) {
                        if (param0 != 8) {
                          if (param0 != 10) {
                            if ((param0 ^ -1) != -10) {
                              decompiledRegionSelector0 = 9;
                              break L0;
                            } else {
                              L11: {
                                if (null != this.field_C) {
                                  var9 = 0;
                                  L12: while (true) {
                                    if ((var9 ^ -1) <= (var8_int ^ -1)) {
                                      break L11;
                                    } else {
                                      L13: {
                                        L14: {
                                          var10 = param1[var9];
                                          if ((this.field_C.length ^ -1) < (var10 ^ -1)) {
                                            var11 = this.field_C[var10];
                                            var12 = 0;
                                            L15: while (true) {
                                              if (var11.length <= var12) {
                                                break L14;
                                              } else {
                                                var13 = this.field_f[var11[var12]];
                                                var13.field_g = 16383 & var13.field_g - -param2;
                                                var12++;
                                                if (var21 != 0) {
                                                  break L13;
                                                } else {
                                                  if (var21 == 0) {
                                                    continue L15;
                                                  } else {
                                                    break L14;
                                                  }
                                                }
                                              }
                                            }
                                          } else {
                                            break L14;
                                          }
                                        }
                                        var9++;
                                        break L13;
                                      }
                                      if (var21 == 0) {
                                        continue L12;
                                      } else {
                                        break L11;
                                      }
                                    }
                                  }
                                } else {
                                  break L11;
                                }
                              }
                              decompiledRegionSelector0 = 8;
                              break L0;
                            }
                          } else {
                            L16: {
                              if (this.field_C != null) {
                                var9 = 0;
                                L17: while (true) {
                                  if ((var8_int ^ -1) >= (var9 ^ -1)) {
                                    break L16;
                                  } else {
                                    L18: {
                                      L19: {
                                        var10 = param1[var9];
                                        if ((var10 ^ -1) > (this.field_C.length ^ -1)) {
                                          var11 = this.field_C[var10];
                                          var12 = 0;
                                          L20: while (true) {
                                            if ((var12 ^ -1) <= (var11.length ^ -1)) {
                                              break L19;
                                            } else {
                                              var13 = this.field_f[var11[var12]];
                                              var13.field_f = param3 * var13.field_f >> 1239691559;
                                              var13.field_b = var13.field_b * param2 >> 873761959;
                                              var12++;
                                              if (var21 != 0) {
                                                break L18;
                                              } else {
                                                if (var21 == 0) {
                                                  continue L20;
                                                } else {
                                                  break L19;
                                                }
                                              }
                                            }
                                          }
                                        } else {
                                          break L19;
                                        }
                                      }
                                      var9++;
                                      break L18;
                                    }
                                    if (var21 == 0) {
                                      continue L17;
                                    } else {
                                      break L16;
                                    }
                                  }
                                }
                              } else {
                                break L16;
                              }
                            }
                            decompiledRegionSelector0 = 7;
                            break L0;
                          }
                        } else {
                          L21: {
                            if (null == this.field_C) {
                              break L21;
                            } else {
                              var9 = 0;
                              L22: while (true) {
                                if (var9 >= var8_int) {
                                  break L21;
                                } else {
                                  L23: {
                                    L24: {
                                      var10 = param1[var9];
                                      if (this.field_C.length <= var10) {
                                        break L24;
                                      } else {
                                        var11 = this.field_C[var10];
                                        var12 = 0;
                                        L25: while (true) {
                                          if (var11.length <= var12) {
                                            break L24;
                                          } else {
                                            var13 = this.field_f[var11[var12]];
                                            var13.field_h = var13.field_h + param2;
                                            var13.field_a = var13.field_a + param3;
                                            var12++;
                                            if (var21 != 0) {
                                              break L23;
                                            } else {
                                              if (var21 == 0) {
                                                continue L25;
                                              } else {
                                                break L24;
                                              }
                                            }
                                          }
                                        }
                                      }
                                    }
                                    var9++;
                                    break L23;
                                  }
                                  if (var21 == 0) {
                                    continue L22;
                                  } else {
                                    break L21;
                                  }
                                }
                              }
                            }
                          }
                          decompiledRegionSelector0 = 6;
                          break L0;
                        }
                      } else {
                        L26: {
                          if (null != this.field_j) {
                            var9 = 0;
                            L27: while (true) {
                              stackOut_184_0 = var8_int ^ -1;
                              stackOut_184_1 = var9 ^ -1;
                              stackIn_185_0 = stackOut_184_0;
                              stackIn_185_1 = stackOut_184_1;
                              L28: while (true) {
                                L29: {
                                  if (stackIn_185_0 >= stackIn_185_1) {
                                    break L29;
                                  } else {
                                    var10 = param1[var9];
                                    stackOut_186_0 = var10 ^ -1;
                                    stackOut_186_1 = this.field_j.length ^ -1;
                                    stackIn_221_0 = stackOut_186_0;
                                    stackIn_221_1 = stackOut_186_1;
                                    stackIn_187_0 = stackOut_186_0;
                                    stackIn_187_1 = stackOut_186_1;
                                    if (var21 != 0) {
                                      L30: while (true) {
                                        if (stackIn_221_0 <= stackIn_221_1) {
                                          break L26;
                                        } else {
                                          var10_ref_pm = this.field_r[var9];
                                          var11_ref = this.field_f[var9];
                                          var11_ref.field_c = 16777215 & cla.field_m[this.field_X[var10_ref_pm.field_l] & 65535] | -16777216 & var11_ref.field_c;
                                          var9++;
                                          if (var21 == 0) {
                                            stackOut_220_0 = this.field_G;
                                            stackOut_220_1 = var9;
                                            stackIn_221_0 = stackOut_220_0;
                                            stackIn_221_1 = stackOut_220_1;
                                            continue L30;
                                          } else {
                                            break L26;
                                          }
                                        }
                                      }
                                    } else {
                                      L31: {
                                        if (stackIn_187_0 <= stackIn_187_1) {
                                          break L31;
                                        } else {
                                          var11 = this.field_j[var10];
                                          var12 = 0;
                                          L32: while (true) {
                                            L33: {
                                              if (var11.length <= var12) {
                                                break L33;
                                              } else {
                                                var13_int = var11[var12];
                                                var14 = this.field_X[var13_int] & 65535;
                                                var15 = (var14 & 64694) >> 722944650;
                                                var16 = (var14 & 1011) >> 156860359;
                                                var16 = var16 + param3 / 4;
                                                var15 = 63 & param2 + var15;
                                                var17 = var14 & 127;
                                                stackOut_192_0 = var16 ^ -1;
                                                stackOut_192_1 = -1;
                                                stackIn_185_0 = stackOut_192_0;
                                                stackIn_185_1 = stackOut_192_1;
                                                stackIn_193_0 = stackOut_192_0;
                                                stackIn_193_1 = stackOut_192_1;
                                                if (var21 != 0) {
                                                  continue L28;
                                                } else {
                                                  L34: {
                                                    L35: {
                                                      if (stackIn_193_0 > stackIn_193_1) {
                                                        break L35;
                                                      } else {
                                                        if (var16 > 7) {
                                                          var16 = 7;
                                                          if (var21 == 0) {
                                                            break L34;
                                                          } else {
                                                            break L35;
                                                          }
                                                        } else {
                                                          break L34;
                                                        }
                                                      }
                                                    }
                                                    var16 = 0;
                                                    break L34;
                                                  }
                                                  L36: {
                                                    L37: {
                                                      var17 = var17 + param4;
                                                      if ((var17 ^ -1) <= -1) {
                                                        break L37;
                                                      } else {
                                                        var17 = 0;
                                                        if (var21 == 0) {
                                                          break L36;
                                                        } else {
                                                          break L37;
                                                        }
                                                      }
                                                    }
                                                    if (-128 <= (var17 ^ -1)) {
                                                      break L36;
                                                    } else {
                                                      var17 = 127;
                                                      break L36;
                                                    }
                                                  }
                                                  this.field_X[var13_int] = (short)fh.a(fh.a(var16 << 108042887, var15 << 1314691114), var17);
                                                  var12++;
                                                  if (var21 == 0) {
                                                    continue L32;
                                                  } else {
                                                    break L33;
                                                  }
                                                }
                                              }
                                            }
                                            if (var11.length <= 0) {
                                              break L31;
                                            } else {
                                              if (null != this.field_kb) {
                                                this.field_kb.field_d = null;
                                                break L31;
                                              } else {
                                                break L31;
                                              }
                                            }
                                          }
                                        }
                                      }
                                      var9++;
                                      if (var21 == 0) {
                                        continue L27;
                                      } else {
                                        break L29;
                                      }
                                    }
                                  }
                                }
                                if (this.field_r != null) {
                                  var9 = 0;
                                  L38: while (true) {
                                    stackOut_220_0 = this.field_G;
                                    stackOut_220_1 = var9;
                                    stackIn_221_0 = stackOut_220_0;
                                    stackIn_221_1 = stackOut_220_1;
                                    if (stackIn_221_0 <= stackIn_221_1) {
                                      break L26;
                                    } else {
                                      var10_ref_pm = this.field_r[var9];
                                      var11_ref = this.field_f[var9];
                                      var11_ref.field_c = 16777215 & cla.field_m[this.field_X[var10_ref_pm.field_l] & 65535] | -16777216 & var11_ref.field_c;
                                      var9++;
                                      if (var21 == 0) {
                                        continue L38;
                                      } else {
                                        break L26;
                                      }
                                    }
                                  }
                                } else {
                                  break L26;
                                }
                              }
                            }
                          } else {
                            break L26;
                          }
                        }
                        decompiledRegionSelector0 = 5;
                        break L0;
                      }
                    } else {
                      L39: {
                        if (this.field_j == null) {
                          break L39;
                        } else {
                          var9 = 0;
                          L40: while (true) {
                            L41: {
                              if ((var8_int ^ -1) >= (var9 ^ -1)) {
                                break L41;
                              } else {
                                var10 = param1[var9];
                                stackOut_145_0 = this.field_j.length ^ -1;
                                stackOut_145_1 = var10 ^ -1;
                                stackIn_174_0 = stackOut_145_0;
                                stackIn_174_1 = stackOut_145_1;
                                stackIn_146_0 = stackOut_145_0;
                                stackIn_146_1 = stackOut_145_1;
                                if (var21 != 0) {
                                  L42: while (true) {
                                    if (stackIn_174_0 >= stackIn_174_1) {
                                      break L39;
                                    } else {
                                      var10_ref_pm = this.field_r[var9];
                                      var11_ref = this.field_f[var9];
                                      var11_ref.field_c = var11_ref.field_c & 16777215 | -(this.field_o[var10_ref_pm.field_l] & 255) + 255 << -527710408;
                                      var9++;
                                      if (var21 == 0) {
                                        stackOut_173_0 = this.field_G ^ -1;
                                        stackOut_173_1 = var9 ^ -1;
                                        stackIn_174_0 = stackOut_173_0;
                                        stackIn_174_1 = stackOut_173_1;
                                        continue L42;
                                      } else {
                                        break L39;
                                      }
                                    }
                                  }
                                } else {
                                  L43: {
                                    if (stackIn_146_0 >= stackIn_146_1) {
                                      break L43;
                                    } else {
                                      var11 = this.field_j[var10];
                                      var12 = 0;
                                      L44: while (true) {
                                        L45: {
                                          L46: {
                                            if (var12 >= var11.length) {
                                              break L46;
                                            } else {
                                              var13_int = var11[var12];
                                              var14 = 8 * param2 + (255 & this.field_o[var13_int]);
                                              stackOut_151_0 = 0;
                                              stackOut_151_1 = var14;
                                              stackIn_164_0 = stackOut_151_0;
                                              stackIn_164_1 = stackOut_151_1;
                                              stackIn_152_0 = stackOut_151_0;
                                              stackIn_152_1 = stackOut_151_1;
                                              if (var21 != 0) {
                                                break L45;
                                              } else {
                                                L47: {
                                                  L48: {
                                                    if (stackIn_152_0 > stackIn_152_1) {
                                                      break L48;
                                                    } else {
                                                      if ((var14 ^ -1) < -256) {
                                                        var14 = 255;
                                                        if (var21 == 0) {
                                                          break L47;
                                                        } else {
                                                          break L48;
                                                        }
                                                      } else {
                                                        break L47;
                                                      }
                                                    }
                                                  }
                                                  var14 = 0;
                                                  break L47;
                                                }
                                                this.field_o[var13_int] = (byte)var14;
                                                var12++;
                                                if (var21 == 0) {
                                                  continue L44;
                                                } else {
                                                  break L46;
                                                }
                                              }
                                            }
                                          }
                                          stackOut_163_0 = 0;
                                          stackOut_163_1 = var11.length;
                                          stackIn_164_0 = stackOut_163_0;
                                          stackIn_164_1 = stackOut_163_1;
                                          break L45;
                                        }
                                        if (stackIn_164_0 >= stackIn_164_1) {
                                          break L43;
                                        } else {
                                          if (this.field_kb == null) {
                                            break L43;
                                          } else {
                                            this.field_kb.field_d = null;
                                            break L43;
                                          }
                                        }
                                      }
                                    }
                                  }
                                  var9++;
                                  if (var21 == 0) {
                                    continue L40;
                                  } else {
                                    break L41;
                                  }
                                }
                              }
                            }
                            if (null == this.field_r) {
                              break L39;
                            } else {
                              var9 = 0;
                              L49: while (true) {
                                stackOut_173_0 = this.field_G ^ -1;
                                stackOut_173_1 = var9 ^ -1;
                                stackIn_174_0 = stackOut_173_0;
                                stackIn_174_1 = stackOut_173_1;
                                if (stackIn_174_0 >= stackIn_174_1) {
                                  break L39;
                                } else {
                                  var10_ref_pm = this.field_r[var9];
                                  var11_ref = this.field_f[var9];
                                  var11_ref.field_c = var11_ref.field_c & 16777215 | -(this.field_o[var10_ref_pm.field_l] & 255) + 255 << -527710408;
                                  var9++;
                                  if (var21 == 0) {
                                    continue L49;
                                  } else {
                                    break L39;
                                  }
                                }
                              }
                            }
                          }
                        }
                      }
                      decompiledRegionSelector0 = 4;
                      break L0;
                    }
                  }
                } else {
                  var9 = 0;
                  L50: while (true) {
                    stackOut_44_0 = var9 ^ -1;
                    stackOut_44_1 = var8_int ^ -1;
                    stackIn_45_0 = stackOut_44_0;
                    stackIn_45_1 = stackOut_44_1;
                    L51: while (true) {
                      L52: {
                        L53: {
                          L54: {
                            L55: {
                              if (stackIn_45_0 <= stackIn_45_1) {
                                break L55;
                              } else {
                                var10 = param1[var9];
                                stackOut_46_0 = var10 ^ -1;
                                stackOut_46_1 = this.field_d.length ^ -1;
                                stackIn_83_0 = stackOut_46_0;
                                stackIn_83_1 = stackOut_46_1;
                                stackIn_47_0 = stackOut_46_0;
                                stackIn_47_1 = stackOut_46_1;
                                if (var21 != 0) {
                                  L56: while (true) {
                                    if (stackIn_83_0 <= stackIn_83_1) {
                                      break L54;
                                    } else {
                                      var10 = param1[var9];
                                      if (var21 != 0) {
                                        break L53;
                                      } else {
                                        L57: {
                                          L58: {
                                            if ((var10 ^ -1) <= (this.field_d.length ^ -1)) {
                                              break L58;
                                            } else {
                                              var11 = this.field_d[var10];
                                              var12 = 0;
                                              L59: while (true) {
                                                stackOut_89_0 = var12;
                                                stackOut_89_1 = var11.length;
                                                stackIn_90_0 = stackOut_89_0;
                                                stackIn_90_1 = stackOut_89_1;
                                                L60: while (true) {
                                                  if (stackIn_90_0 >= stackIn_90_1) {
                                                    break L58;
                                                  } else {
                                                    var13_int = var11[var12];
                                                    var14 = this.field_e[var13_int];
                                                    var15 = this.field_e[1 + var13_int];
                                                    stackOut_91_0 = var14;
                                                    stackIn_82_0 = stackOut_91_0;
                                                    stackIn_92_0 = stackOut_91_0;
                                                    if (var21 != 0) {
                                                      break L57;
                                                    } else {
                                                      var16 = stackIn_92_0;
                                                      L61: while (true) {
                                                        L62: {
                                                          if ((var16 ^ -1) <= (var15 ^ -1)) {
                                                            break L62;
                                                          } else {
                                                            var17 = -1 + this.field_q[var16];
                                                            stackOut_94_0 = -1;
                                                            stackOut_94_1 = var17;
                                                            stackIn_90_0 = stackOut_94_0;
                                                            stackIn_90_1 = stackOut_94_1;
                                                            stackIn_95_0 = stackOut_94_0;
                                                            stackIn_95_1 = stackOut_94_1;
                                                            if (var21 != 0) {
                                                              continue L60;
                                                            } else {
                                                              L63: {
                                                                if (stackIn_95_0 != stackIn_95_1) {
                                                                  break L63;
                                                                } else {
                                                                  if (var21 == 0) {
                                                                    break L62;
                                                                  } else {
                                                                    break L63;
                                                                  }
                                                                }
                                                              }
                                                              L64: {
                                                                if ((param4 ^ -1) != -1) {
                                                                  var18 = qu.field_b[param4];
                                                                  var19 = qu.field_d[param4];
                                                                  var20 = 16383 + var19 * this.field_E[var17] + this.field_Y[var17] * var18 >> 159574446;
                                                                  this.field_Y[var17] = (short)(var19 * this.field_Y[var17] + -(var18 * this.field_E[var17]) - -16383 >> 2116617550);
                                                                  this.field_E[var17] = (short)var20;
                                                                  break L64;
                                                                } else {
                                                                  break L64;
                                                                }
                                                              }
                                                              L65: {
                                                                if ((param2 ^ -1) == -1) {
                                                                  break L65;
                                                                } else {
                                                                  var18 = qu.field_b[param2];
                                                                  var19 = qu.field_d[param2];
                                                                  var20 = 16383 + this.field_Y[var17] * var19 + -(var18 * this.field_cb[var17]) >> -1509749106;
                                                                  this.field_cb[var17] = (short)(this.field_Y[var17] * var18 + var19 * this.field_cb[var17] + 16383 >> 1351990446);
                                                                  this.field_Y[var17] = (short)var20;
                                                                  break L65;
                                                                }
                                                              }
                                                              L66: {
                                                                if (-1 == (param3 ^ -1)) {
                                                                  break L66;
                                                                } else {
                                                                  var18 = qu.field_b[param3];
                                                                  var19 = qu.field_d[param3];
                                                                  var20 = 16383 + (var19 * this.field_E[var17] + var18 * this.field_cb[var17]) >> -714860658;
                                                                  this.field_cb[var17] = (short)(16383 + var19 * this.field_cb[var17] + -(var18 * this.field_E[var17]) >> 1830236110);
                                                                  this.field_E[var17] = (short)var20;
                                                                  break L66;
                                                                }
                                                              }
                                                              var16++;
                                                              if (var21 == 0) {
                                                                continue L61;
                                                              } else {
                                                                break L62;
                                                              }
                                                            }
                                                          }
                                                        }
                                                        var12++;
                                                        if (var21 == 0) {
                                                          continue L59;
                                                        } else {
                                                          break L58;
                                                        }
                                                      }
                                                    }
                                                  }
                                                }
                                              }
                                            }
                                          }
                                          var9++;
                                          if (var21 == 0) {
                                            stackOut_81_0 = var9 ^ -1;
                                            stackIn_82_0 = stackOut_81_0;
                                            break L57;
                                          } else {
                                            break L54;
                                          }
                                        }
                                        stackOut_82_0 = stackIn_82_0;
                                        stackOut_82_1 = var8_int ^ -1;
                                        stackIn_83_0 = stackOut_82_0;
                                        stackIn_83_1 = stackOut_82_1;
                                        continue L56;
                                      }
                                    }
                                  }
                                } else {
                                  L67: {
                                    if (stackIn_47_0 <= stackIn_47_1) {
                                      break L67;
                                    } else {
                                      L68: {
                                        var11 = this.field_d[var10];
                                        if ((param5 & 1 ^ -1) == -1) {
                                          break L68;
                                        } else {
                                          var12 = 0;
                                          L69: while (true) {
                                            L70: {
                                              if ((var11.length ^ -1) >= (var12 ^ -1)) {
                                                break L70;
                                              } else {
                                                var13_int = var11[var12];
                                                this.field_P[var13_int] = this.field_P[var13_int] - rp.field_i;
                                                this.field_K[var13_int] = this.field_K[var13_int] - via.field_e;
                                                this.field_A[var13_int] = this.field_A[var13_int] - dj.field_b;
                                                stackOut_53_0 = param2 ^ -1;
                                                stackOut_53_1 = -1;
                                                stackIn_45_0 = stackOut_53_0;
                                                stackIn_45_1 = stackOut_53_1;
                                                stackIn_54_0 = stackOut_53_0;
                                                stackIn_54_1 = stackOut_53_1;
                                                if (var21 != 0) {
                                                  continue L51;
                                                } else {
                                                  L71: {
                                                    if (stackIn_54_0 != stackIn_54_1) {
                                                      var14 = qu.field_b[param2];
                                                      var15 = qu.field_d[param2];
                                                      var16 = -(this.field_A[var13_int] * var14) + (var15 * this.field_K[var13_int] - -16383) >> 736349710;
                                                      this.field_A[var13_int] = this.field_A[var13_int] * var15 + this.field_K[var13_int] * var14 - -16383 >> 1341804590;
                                                      this.field_K[var13_int] = var16;
                                                      break L71;
                                                    } else {
                                                      break L71;
                                                    }
                                                  }
                                                  L72: {
                                                    if (-1 != (param4 ^ -1)) {
                                                      var14 = qu.field_b[param4];
                                                      var15 = qu.field_d[param4];
                                                      var16 = 16383 + var14 * this.field_K[var13_int] + this.field_P[var13_int] * var15 >> -366742706;
                                                      this.field_K[var13_int] = this.field_K[var13_int] * var15 + -(var14 * this.field_P[var13_int]) - -16383 >> -1507364914;
                                                      this.field_P[var13_int] = var16;
                                                      break L72;
                                                    } else {
                                                      break L72;
                                                    }
                                                  }
                                                  L73: {
                                                    if (-1 == (param3 ^ -1)) {
                                                      break L73;
                                                    } else {
                                                      var14 = qu.field_b[param3];
                                                      var15 = qu.field_d[param3];
                                                      var16 = 16383 + this.field_A[var13_int] * var14 - -(var15 * this.field_P[var13_int]) >> -2124998482;
                                                      this.field_A[var13_int] = 16383 + var15 * this.field_A[var13_int] + -(var14 * this.field_P[var13_int]) >> -1429602130;
                                                      this.field_P[var13_int] = var16;
                                                      break L73;
                                                    }
                                                  }
                                                  this.field_P[var13_int] = this.field_P[var13_int] + rp.field_i;
                                                  this.field_K[var13_int] = this.field_K[var13_int] + via.field_e;
                                                  this.field_A[var13_int] = this.field_A[var13_int] + dj.field_b;
                                                  var12++;
                                                  if (var21 == 0) {
                                                    continue L69;
                                                  } else {
                                                    break L70;
                                                  }
                                                }
                                              }
                                            }
                                            if (var21 == 0) {
                                              break L67;
                                            } else {
                                              break L68;
                                            }
                                          }
                                        }
                                      }
                                      var12 = 0;
                                      L74: while (true) {
                                        if (var11.length <= var12) {
                                          break L67;
                                        } else {
                                          var13_int = var11[var12];
                                          this.field_P[var13_int] = this.field_P[var13_int] - rp.field_i;
                                          this.field_K[var13_int] = this.field_K[var13_int] - via.field_e;
                                          this.field_A[var13_int] = this.field_A[var13_int] - dj.field_b;
                                          stackOut_67_0 = 0;
                                          stackOut_67_1 = param4;
                                          stackIn_45_0 = stackOut_67_0;
                                          stackIn_45_1 = stackOut_67_1;
                                          stackIn_68_0 = stackOut_67_0;
                                          stackIn_68_1 = stackOut_67_1;
                                          if (var21 != 0) {
                                            continue L51;
                                          } else {
                                            L75: {
                                              if (stackIn_68_0 != stackIn_68_1) {
                                                var14 = qu.field_b[param4];
                                                var15 = qu.field_d[param4];
                                                var16 = this.field_P[var13_int] * var15 + this.field_K[var13_int] * var14 + 16383 >> -784559026;
                                                this.field_K[var13_int] = 16383 + (var15 * this.field_K[var13_int] + -(var14 * this.field_P[var13_int])) >> 1819046638;
                                                this.field_P[var13_int] = var16;
                                                break L75;
                                              } else {
                                                break L75;
                                              }
                                            }
                                            L76: {
                                              if ((param2 ^ -1) == -1) {
                                                break L76;
                                              } else {
                                                var14 = qu.field_b[param2];
                                                var15 = qu.field_d[param2];
                                                var16 = var15 * this.field_K[var13_int] + -(var14 * this.field_A[var13_int]) + 16383 >> -912005810;
                                                this.field_A[var13_int] = var14 * this.field_K[var13_int] - -(this.field_A[var13_int] * var15) + 16383 >> 738632942;
                                                this.field_K[var13_int] = var16;
                                                break L76;
                                              }
                                            }
                                            L77: {
                                              if (0 != param3) {
                                                var14 = qu.field_b[param3];
                                                var15 = qu.field_d[param3];
                                                var16 = this.field_A[var13_int] * var14 - (-(var15 * this.field_P[var13_int]) - 16383) >> 1941960526;
                                                this.field_A[var13_int] = -(var14 * this.field_P[var13_int]) + (this.field_A[var13_int] * var15 - -16383) >> 1573510862;
                                                this.field_P[var13_int] = var16;
                                                break L77;
                                              } else {
                                                break L77;
                                              }
                                            }
                                            this.field_P[var13_int] = this.field_P[var13_int] + rp.field_i;
                                            this.field_K[var13_int] = this.field_K[var13_int] + via.field_e;
                                            this.field_A[var13_int] = this.field_A[var13_int] + dj.field_b;
                                            var12++;
                                            if (var21 == 0) {
                                              continue L74;
                                            } else {
                                              break L67;
                                            }
                                          }
                                        }
                                      }
                                    }
                                  }
                                  var9++;
                                  if (var21 == 0) {
                                    continue L50;
                                  } else {
                                    break L55;
                                  }
                                }
                              }
                            }
                            if (!param6) {
                              break L52;
                            } else {
                              var9 = 0;
                              L78: while (true) {
                                stackOut_81_0 = var9 ^ -1;
                                stackIn_82_0 = stackOut_81_0;
                                L79: while (true) {
                                  stackOut_82_0 = stackIn_82_0;
                                  stackOut_82_1 = var8_int ^ -1;
                                  stackIn_83_0 = stackOut_82_0;
                                  stackIn_83_1 = stackOut_82_1;
                                  if (stackIn_83_0 <= stackIn_83_1) {
                                    break L54;
                                  } else {
                                    var10 = param1[var9];
                                    if (var21 != 0) {
                                      break L53;
                                    } else {
                                      L80: {
                                        if ((var10 ^ -1) <= (this.field_d.length ^ -1)) {
                                          break L80;
                                        } else {
                                          var11 = this.field_d[var10];
                                          var12 = 0;
                                          L81: while (true) {
                                            stackOut_89_0 = var12;
                                            stackOut_89_1 = var11.length;
                                            stackIn_90_0 = stackOut_89_0;
                                            stackIn_90_1 = stackOut_89_1;
                                            L82: while (true) {
                                              if (stackIn_90_0 >= stackIn_90_1) {
                                                break L80;
                                              } else {
                                                var13_int = var11[var12];
                                                var14 = this.field_e[var13_int];
                                                var15 = this.field_e[1 + var13_int];
                                                stackOut_91_0 = var14;
                                                stackIn_82_0 = stackOut_91_0;
                                                stackIn_92_0 = stackOut_91_0;
                                                if (var21 != 0) {
                                                  continue L79;
                                                } else {
                                                  var16 = stackIn_92_0;
                                                  L83: while (true) {
                                                    L84: {
                                                      if ((var16 ^ -1) <= (var15 ^ -1)) {
                                                        break L84;
                                                      } else {
                                                        var17 = -1 + this.field_q[var16];
                                                        stackOut_94_0 = -1;
                                                        stackOut_94_1 = var17;
                                                        stackIn_90_0 = stackOut_94_0;
                                                        stackIn_90_1 = stackOut_94_1;
                                                        stackIn_95_0 = stackOut_94_0;
                                                        stackIn_95_1 = stackOut_94_1;
                                                        if (var21 != 0) {
                                                          continue L82;
                                                        } else {
                                                          L85: {
                                                            if (stackIn_95_0 != stackIn_95_1) {
                                                              break L85;
                                                            } else {
                                                              if (var21 == 0) {
                                                                break L84;
                                                              } else {
                                                                break L85;
                                                              }
                                                            }
                                                          }
                                                          L86: {
                                                            if ((param4 ^ -1) != -1) {
                                                              var18 = qu.field_b[param4];
                                                              var19 = qu.field_d[param4];
                                                              var20 = 16383 + var19 * this.field_E[var17] + this.field_Y[var17] * var18 >> 159574446;
                                                              this.field_Y[var17] = (short)(var19 * this.field_Y[var17] + -(var18 * this.field_E[var17]) - -16383 >> 2116617550);
                                                              this.field_E[var17] = (short)var20;
                                                              break L86;
                                                            } else {
                                                              break L86;
                                                            }
                                                          }
                                                          L87: {
                                                            if ((param2 ^ -1) == -1) {
                                                              break L87;
                                                            } else {
                                                              var18 = qu.field_b[param2];
                                                              var19 = qu.field_d[param2];
                                                              var20 = 16383 + this.field_Y[var17] * var19 + -(var18 * this.field_cb[var17]) >> -1509749106;
                                                              this.field_cb[var17] = (short)(this.field_Y[var17] * var18 + var19 * this.field_cb[var17] + 16383 >> 1351990446);
                                                              this.field_Y[var17] = (short)var20;
                                                              break L87;
                                                            }
                                                          }
                                                          L88: {
                                                            if (-1 == (param3 ^ -1)) {
                                                              break L88;
                                                            } else {
                                                              var18 = qu.field_b[param3];
                                                              var19 = qu.field_d[param3];
                                                              var20 = 16383 + (var19 * this.field_E[var17] + var18 * this.field_cb[var17]) >> -714860658;
                                                              this.field_cb[var17] = (short)(16383 + var19 * this.field_cb[var17] + -(var18 * this.field_E[var17]) >> 1830236110);
                                                              this.field_E[var17] = (short)var20;
                                                              break L88;
                                                            }
                                                          }
                                                          var16++;
                                                          if (var21 == 0) {
                                                            continue L83;
                                                          } else {
                                                            break L84;
                                                          }
                                                        }
                                                      }
                                                    }
                                                    var12++;
                                                    if (var21 == 0) {
                                                      continue L81;
                                                    } else {
                                                      break L80;
                                                    }
                                                  }
                                                }
                                              }
                                            }
                                          }
                                        }
                                      }
                                      var9++;
                                      if (var21 == 0) {
                                        continue L78;
                                      } else {
                                        break L54;
                                      }
                                    }
                                  }
                                }
                              }
                            }
                          }
                          if (this.field_F != null) {
                            break L53;
                          } else {
                            if (this.field_kb == null) {
                              break L53;
                            } else {
                              this.field_kb.field_d = null;
                              break L53;
                            }
                          }
                        }
                        if (null == this.field_F) {
                          break L52;
                        } else {
                          this.field_F.field_d = null;
                          break L52;
                        }
                      }
                      decompiledRegionSelector0 = 2;
                      break L0;
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
              L89: while (true) {
                L90: {
                  L91: {
                    if ((var8_int ^ -1) >= (var10 ^ -1)) {
                      break L91;
                    } else {
                      var11_int = param1[var10];
                      stackOut_4_0 = var11_int ^ -1;
                      stackOut_4_1 = this.field_d.length ^ -1;
                      stackIn_18_0 = stackOut_4_0;
                      stackIn_18_1 = stackOut_4_1;
                      stackIn_5_0 = stackOut_4_0;
                      stackIn_5_1 = stackOut_4_1;
                      if (var21 != 0) {
                        break L90;
                      } else {
                        L92: {
                          L93: {
                            if (stackIn_5_0 > stackIn_5_1) {
                              var12_ref_int__ = this.field_d[var11_int];
                              var13_int = 0;
                              L94: while (true) {
                                if ((var13_int ^ -1) <= (var12_ref_int__.length ^ -1)) {
                                  break L93;
                                } else {
                                  var14 = var12_ref_int__[var13_int];
                                  rp.field_i = rp.field_i + this.field_P[var14];
                                  via.field_e = via.field_e + this.field_K[var14];
                                  var9++;
                                  dj.field_b = dj.field_b + this.field_A[var14];
                                  var13_int++;
                                  if (var21 != 0) {
                                    break L92;
                                  } else {
                                    if (var21 == 0) {
                                      continue L94;
                                    } else {
                                      break L93;
                                    }
                                  }
                                }
                              }
                            } else {
                              break L93;
                            }
                          }
                          var10++;
                          break L92;
                        }
                        if (var21 == 0) {
                          continue L89;
                        } else {
                          break L91;
                        }
                      }
                    }
                  }
                  stackOut_17_0 = var9 ^ -1;
                  stackOut_17_1 = -1;
                  stackIn_18_0 = stackOut_17_0;
                  stackIn_18_1 = stackOut_17_1;
                  break L90;
                }
                L95: {
                  L96: {
                    if (stackIn_18_0 < stackIn_18_1) {
                      break L96;
                    } else {
                      rp.field_i = param2;
                      dj.field_b = param4;
                      via.field_e = param3;
                      if (var21 == 0) {
                        break L95;
                      } else {
                        break L96;
                      }
                    }
                  }
                  rp.field_i = param2 + rp.field_i / var9;
                  via.field_e = param3 + via.field_e / var9;
                  dj.field_b = dj.field_b / var9 + param4;
                  break L95;
                }
                decompiledRegionSelector0 = 0;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L97: {
            var8 = decompiledCaughtException;
            stackOut_281_0 = (RuntimeException) (var8);
            stackOut_281_1 = new StringBuilder().append("np.U(").append(param0).append(',');
            stackIn_284_0 = stackOut_281_0;
            stackIn_284_1 = stackOut_281_1;
            stackIn_282_0 = stackOut_281_0;
            stackIn_282_1 = stackOut_281_1;
            if (param1 == null) {
              stackOut_284_0 = (RuntimeException) ((Object) stackIn_284_0);
              stackOut_284_1 = (StringBuilder) ((Object) stackIn_284_1);
              stackOut_284_2 = "null";
              stackIn_285_0 = stackOut_284_0;
              stackIn_285_1 = stackOut_284_1;
              stackIn_285_2 = stackOut_284_2;
              break L97;
            } else {
              stackOut_282_0 = (RuntimeException) ((Object) stackIn_282_0);
              stackOut_282_1 = (StringBuilder) ((Object) stackIn_282_1);
              stackOut_282_2 = "{...}";
              stackIn_285_0 = stackOut_282_0;
              stackIn_285_1 = stackOut_282_1;
              stackIn_285_2 = stackOut_282_2;
              break L97;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_285_0), stackIn_285_2 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
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
                      if (decompiledRegionSelector0 == 7) {
                        return;
                      } else {
                        if (decompiledRegionSelector0 == 8) {
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
        RuntimeException runtimeException = null;
        int var1_int = 0;
        int var2 = 0;
        RuntimeException decompiledCaughtException = null;
        var2 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            var1_int = 0;
            L1: while (true) {
              L2: {
                L3: {
                  L4: {
                    if (var1_int >= this.field_N) {
                      break L4;
                    } else {
                      this.field_P[var1_int] = this.field_P[var1_int] + 7 >> -1664264924;
                      this.field_K[var1_int] = this.field_K[var1_int] + 7 >> 2011810308;
                      this.field_A[var1_int] = 7 + this.field_A[var1_int] >> 1032846372;
                      var1_int++;
                      if (var2 != 0) {
                        break L3;
                      } else {
                        if (var2 == 0) {
                          continue L1;
                        } else {
                          break L4;
                        }
                      }
                    }
                  }
                  if (null != this.field_g) {
                    break L3;
                  } else {
                    break L2;
                  }
                }
                this.field_g.field_d = null;
                break L2;
              }
              this.field_l = false;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw tba.a((Throwable) ((Object) runtimeException), "np.wa()");
        }
    }

    private final void c(byte param0) {
        RuntimeException var2 = null;
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
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
                                L4: {
                                  if (this.field_g == null) {
                                    break L4;
                                  } else {
                                    if (this.field_g.field_d == null) {
                                      break L3;
                                    } else {
                                      break L4;
                                    }
                                  }
                                }
                                L5: {
                                  if (this.field_l) {
                                    break L5;
                                  } else {
                                    this.c(2709);
                                    break L5;
                                  }
                                }
                                var2_int = 1;
                                if (var5 == 0) {
                                  break L2;
                                } else {
                                  break L3;
                                }
                              }
                              this.field_gb = true;
                              break L2;
                            } else {
                              break L2;
                            }
                          }
                        }
                        L6: {
                          var4 = 0;
                          if (null == this.field_K) {
                            break L6;
                          } else {
                            if (pt.a(-61, this.field_bb, this.field_u)) {
                              break L6;
                            } else {
                              L7: {
                                if (null == this.field_g) {
                                  break L7;
                                } else {
                                  if (null != this.field_g.field_d) {
                                    break L7;
                                  } else {
                                    this.field_gb = true;
                                    if (var5 == 0) {
                                      break L6;
                                    } else {
                                      break L7;
                                    }
                                  }
                                }
                              }
                              L8: {
                                if (this.field_l) {
                                  break L8;
                                } else {
                                  this.c(2709);
                                  break L8;
                                }
                              }
                              var3 = 1;
                              break L6;
                            }
                          }
                        }
                        L9: {
                          if (this.field_A == null) {
                            break L9;
                          } else {
                            if (jc.c(this.field_u, -23717, this.field_bb)) {
                              break L9;
                            } else {
                              L10: {
                                L11: {
                                  if (this.field_g == null) {
                                    break L11;
                                  } else {
                                    if (null == this.field_g.field_d) {
                                      break L10;
                                    } else {
                                      break L11;
                                    }
                                  }
                                }
                                L12: {
                                  if (!this.field_l) {
                                    this.c(2709);
                                    break L12;
                                  } else {
                                    break L12;
                                  }
                                }
                                var4 = 1;
                                if (var5 == 0) {
                                  break L9;
                                } else {
                                  break L10;
                                }
                              }
                              this.field_gb = true;
                              break L9;
                            }
                          }
                        }
                        L13: {
                          if (var3 == 0) {
                            break L13;
                          } else {
                            this.field_K = null;
                            break L13;
                          }
                        }
                        L14: {
                          if (var4 == 0) {
                            break L14;
                          } else {
                            this.field_A = null;
                            break L14;
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
              L15: {
                if (null == this.field_q) {
                  break L15;
                } else {
                  if (this.field_P != null) {
                    break L15;
                  } else {
                    if (null != this.field_K) {
                      break L15;
                    } else {
                      if (this.field_A == null) {
                        this.field_e = null;
                        this.field_q = null;
                        break L15;
                      } else {
                        break L15;
                      }
                    }
                  }
                }
              }
              L16: {
                if (this.field_O == null) {
                  break L16;
                } else {
                  if (!oea.a(this.field_bb, this.field_u, (byte) 115)) {
                    L17: {
                      if (null == this.field_F) {
                        break L17;
                      } else {
                        L18: {
                          if (this.field_F.field_d == null) {
                            break L18;
                          } else {
                            this.field_cb = null;
                            this.field_O = null;
                            this.field_E = null;
                            this.field_Y = null;
                            if (var5 == 0) {
                              break L16;
                            } else {
                              break L18;
                            }
                          }
                        }
                        this.field_gb = true;
                        if (var5 == 0) {
                          break L16;
                        } else {
                          break L17;
                        }
                      }
                    }
                    L19: {
                      L20: {
                        if (null == this.field_kb) {
                          break L20;
                        } else {
                          if (this.field_kb.field_d == null) {
                            break L19;
                          } else {
                            break L20;
                          }
                        }
                      }
                      this.field_O = null;
                      this.field_cb = null;
                      this.field_Y = null;
                      this.field_E = null;
                      if (var5 == 0) {
                        break L16;
                      } else {
                        break L19;
                      }
                    }
                    this.field_gb = true;
                    break L16;
                  } else {
                    break L16;
                  }
                }
              }
              L21: {
                var2_int = -95 % ((param0 - -49) / 55);
                if (null == this.field_X) {
                  break L21;
                } else {
                  if (!sm.a(2, this.field_bb, this.field_u)) {
                    L22: {
                      L23: {
                        if (null == this.field_kb) {
                          break L23;
                        } else {
                          if (null == this.field_kb.field_d) {
                            break L22;
                          } else {
                            break L23;
                          }
                        }
                      }
                      this.field_X = null;
                      if (var5 == 0) {
                        break L21;
                      } else {
                        break L22;
                      }
                    }
                    this.field_gb = true;
                    break L21;
                  } else {
                    break L21;
                  }
                }
              }
              L24: {
                if (this.field_o == null) {
                  break L24;
                } else {
                  if (!gda.b(107, this.field_u, this.field_bb)) {
                    L25: {
                      L26: {
                        if (null == this.field_kb) {
                          break L26;
                        } else {
                          if (null == this.field_kb.field_d) {
                            break L25;
                          } else {
                            break L26;
                          }
                        }
                      }
                      this.field_o = null;
                      if (var5 == 0) {
                        break L24;
                      } else {
                        break L25;
                      }
                    }
                    this.field_gb = true;
                    break L24;
                  } else {
                    break L24;
                  }
                }
              }
              L27: {
                if (null == this.field_n) {
                  break L27;
                } else {
                  if (!lva.a(this.field_bb, (byte) -21, this.field_u)) {
                    L28: {
                      L29: {
                        if (null == this.field_ab) {
                          break L29;
                        } else {
                          if (this.field_ab.field_d == null) {
                            break L28;
                          } else {
                            break L29;
                          }
                        }
                      }
                      this.field_n = null;
                      this.field_y = null;
                      if (var5 == 0) {
                        break L27;
                      } else {
                        break L28;
                      }
                    }
                    this.field_gb = true;
                    break L27;
                  } else {
                    break L27;
                  }
                }
              }
              L30: {
                if (null == this.field_I) {
                  break L30;
                } else {
                  if (in.a(this.field_bb, this.field_u, (byte) -115)) {
                    break L30;
                  } else {
                    L31: {
                      if (null == this.field_kb) {
                        break L31;
                      } else {
                        if (this.field_kb.field_d != null) {
                          break L31;
                        } else {
                          this.field_gb = true;
                          if (var5 == 0) {
                            break L30;
                          } else {
                            break L31;
                          }
                        }
                      }
                    }
                    this.field_I = null;
                    break L30;
                  }
                }
              }
              L32: {
                if (this.field_H == null) {
                  break L32;
                } else {
                  if (!ae.a(this.field_bb, this.field_u, 6100)) {
                    L33: {
                      L34: {
                        if (this.field_w == null) {
                          break L34;
                        } else {
                          if (this.field_w.field_a == null) {
                            break L33;
                          } else {
                            break L34;
                          }
                        }
                      }
                      L35: {
                        if (null == this.field_kb) {
                          break L35;
                        } else {
                          if (this.field_kb.field_d == null) {
                            break L33;
                          } else {
                            break L35;
                          }
                        }
                      }
                      this.field_z = null;
                      this.field_hb = null;
                      this.field_H = null;
                      if (var5 == 0) {
                        break L32;
                      } else {
                        break L33;
                      }
                    }
                    this.field_gb = true;
                    break L32;
                  } else {
                    break L32;
                  }
                }
              }
              L36: {
                if (this.field_j == null) {
                  break L36;
                } else {
                  if (!aw.d(-26571, this.field_bb, this.field_u)) {
                    this.field_j = (int[][]) null;
                    this.field_fb = null;
                    break L36;
                  } else {
                    break L36;
                  }
                }
              }
              L37: {
                if (null == this.field_d) {
                  break L37;
                } else {
                  if (!kda.b(this.field_bb, 124, this.field_u)) {
                    this.field_db = null;
                    this.field_d = (int[][]) null;
                    break L37;
                  } else {
                    break L37;
                  }
                }
              }
              L38: {
                if (null == this.field_C) {
                  break L38;
                } else {
                  if (!eo.a(this.field_u, (byte) -125, this.field_bb)) {
                    this.field_C = (int[][]) null;
                    break L38;
                  } else {
                    break L38;
                  }
                }
              }
              L39: {
                if (this.field_p == null) {
                  break L39;
                } else {
                  if ((this.field_bb & 2048 ^ -1) != -1) {
                    break L39;
                  } else {
                    if ((this.field_bb & 262144) != 0) {
                      break L39;
                    } else {
                      this.field_p = null;
                      break L39;
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
            stackOut_3_0 = (RuntimeException) (runtimeException);
            stackOut_3_1 = new StringBuilder().append("np.<init>(");
            stackIn_6_0 = stackOut_3_0;
            stackIn_6_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param0 == null) {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L1;
            } else {
              stackOut_4_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackOut_4_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackOut_4_2 = "{...}";
              stackIn_7_0 = stackOut_4_0;
              stackIn_7_1 = stackOut_4_1;
              stackIn_7_2 = stackOut_4_2;
              break L1;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ')');
        }
    }

    np(cka param0, oc param1, int param2, int param3, int param4, int param5) {
        int fieldTemp$4 = 0;
        uo dupTemp$5 = null;
        int[] array$7 = null;
        int incrementValue$6 = 0;
        RuntimeException var7 = null;
        d var7_ref = null;
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
        int stackIn_49_0 = 0;
        int stackIn_51_0 = 0;
        int stackIn_51_1 = 0;
        int stackIn_61_0 = 0;
        int stackIn_61_1 = 0;
        int stackIn_107_0 = 0;
        int stackIn_128_0 = 0;
        int stackIn_131_0 = 0;
        int stackIn_131_1 = 0;
        int stackIn_139_0 = 0;
        int stackIn_139_1 = 0;
        int stackIn_143_0 = 0;
        int stackIn_143_1 = 0;
        int stackIn_145_0 = 0;
        int stackIn_145_1 = 0;
        int stackIn_146_0 = 0;
        int stackIn_146_1 = 0;
        int stackIn_146_2 = 0;
        int stackIn_148_0 = 0;
        int stackIn_162_0 = 0;
        int stackIn_165_0 = 0;
        int stackIn_165_1 = 0;
        int stackIn_181_0 = 0;
        int stackIn_181_1 = 0;
        int stackIn_188_0 = 0;
        int stackIn_196_0 = 0;
        oc stackIn_199_0 = null;
        int stackIn_211_0 = 0;
        int stackIn_310_0 = 0;
        int stackIn_312_0 = 0;
        int stackIn_313_0 = 0;
        int stackIn_313_1 = 0;
        int stackIn_325_0 = 0;
        int stackIn_325_1 = 0;
        int stackIn_332_0 = 0;
        int stackIn_332_1 = 0;
        int stackIn_334_0 = 0;
        int stackIn_334_1 = 0;
        oc stackIn_353_0 = null;
        int stackIn_356_0 = 0;
        int stackIn_356_1 = 0;
        int stackIn_362_0 = 0;
        int stackIn_372_0 = 0;
        RuntimeException stackIn_389_0 = null;
        StringBuilder stackIn_389_1 = null;
        RuntimeException stackIn_391_0 = null;
        StringBuilder stackIn_391_1 = null;
        RuntimeException stackIn_392_0 = null;
        StringBuilder stackIn_392_1 = null;
        String stackIn_392_2 = null;
        RuntimeException stackIn_393_0 = null;
        StringBuilder stackIn_393_1 = null;
        RuntimeException stackIn_395_0 = null;
        StringBuilder stackIn_395_1 = null;
        RuntimeException stackIn_396_0 = null;
        StringBuilder stackIn_396_1 = null;
        String stackIn_396_2 = null;
        Throwable caughtException = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_48_0 = 0;
        int stackOut_46_0 = 0;
        int stackOut_50_0 = 0;
        int stackOut_50_1 = 0;
        int stackOut_60_0 = 0;
        int stackOut_60_1 = 0;
        int stackOut_106_0 = 0;
        int stackOut_104_0 = 0;
        int stackOut_127_0 = 0;
        int stackOut_130_0 = 0;
        int stackOut_130_1 = 0;
        int stackOut_138_0 = 0;
        int stackOut_138_1 = 0;
        int stackOut_142_0 = 0;
        int stackOut_142_1 = 0;
        int stackOut_145_0 = 0;
        int stackOut_145_1 = 0;
        byte stackOut_145_2 = 0;
        int stackOut_143_0 = 0;
        int stackOut_143_1 = 0;
        int stackOut_143_2 = 0;
        int stackOut_147_0 = 0;
        int stackOut_161_0 = 0;
        int stackOut_164_0 = 0;
        int stackOut_164_1 = 0;
        int stackOut_180_0 = 0;
        int stackOut_180_1 = 0;
        byte stackOut_187_0 = 0;
        int stackOut_185_0 = 0;
        int stackOut_195_0 = 0;
        oc stackOut_198_0 = null;
        int stackOut_210_0 = 0;
        short stackOut_208_0 = 0;
        int stackOut_309_0 = 0;
        int stackOut_312_0 = 0;
        int stackOut_312_1 = 0;
        int stackOut_310_0 = 0;
        int stackOut_310_1 = 0;
        int stackOut_324_0 = 0;
        int stackOut_324_1 = 0;
        int stackOut_333_0 = 0;
        int stackOut_333_1 = 0;
        int stackOut_331_0 = 0;
        int stackOut_331_1 = 0;
        oc stackOut_352_0 = null;
        int stackOut_354_0 = 0;
        int stackOut_354_1 = 0;
        int stackOut_361_0 = 0;
        int stackOut_371_0 = 0;
        RuntimeException stackOut_388_0 = null;
        StringBuilder stackOut_388_1 = null;
        RuntimeException stackOut_391_0 = null;
        StringBuilder stackOut_391_1 = null;
        String stackOut_391_2 = null;
        RuntimeException stackOut_389_0 = null;
        StringBuilder stackOut_389_1 = null;
        String stackOut_389_2 = null;
        RuntimeException stackOut_392_0 = null;
        StringBuilder stackOut_392_1 = null;
        RuntimeException stackOut_395_0 = null;
        StringBuilder stackOut_395_1 = null;
        String stackOut_395_2 = null;
        RuntimeException stackOut_393_0 = null;
        StringBuilder stackOut_393_1 = null;
        String stackOut_393_2 = null;
        var63 = TombRacer.field_G ? 1 : 0;
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
            L1: {
              this.field_bb = param2;
              this.field_R = param0;
              this.field_u = param5;
              if (!hha.a(param5, 0, param2)) {
                break L1;
              } else {
                this.field_g = new tj((va) null, 5126, 3, 0);
                break L1;
              }
            }
            L2: {
              if (!wu.a(-17, param5, param2)) {
                break L2;
              } else {
                this.field_ab = new tj((va) null, 5126, 2, 0);
                break L2;
              }
            }
            L3: {
              if (!kb.a(param5, param2, (byte) 17)) {
                break L3;
              } else {
                this.field_F = new tj((va) null, 5126, 3, 0);
                break L3;
              }
            }
            L4: {
              if (we.b(param2, param5, 2048)) {
                this.field_kb = new tj((va) null, 5121, 4, 0);
                break L4;
              } else {
                break L4;
              }
            }
            L5: {
              if (mm.a(-122, param2, param5)) {
                this.field_w = new afa();
                break L5;
              } else {
                break L5;
              }
            }
            var7_ref = param0.field_c;
            var8 = new int[param1.field_o];
            this.field_e = new int[param1.field_L + 1];
            var9_int = 0;
            L6: while (true) {
              L7: {
                L8: {
                  if (param1.field_o <= var9_int) {
                    break L8;
                  } else {
                    if (var63 != 0) {
                      break L7;
                    } else {
                      L9: {
                        L10: {
                          if (param1.field_G == null) {
                            break L10;
                          } else {
                            if (2 == param1.field_G[var9_int]) {
                              break L9;
                            } else {
                              break L10;
                            }
                          }
                        }
                        L11: {
                          if (param1.field_r == null) {
                            break L11;
                          } else {
                            if (0 != (param1.field_r[var9_int] ^ -1)) {
                              L12: {
                                var10_ref_dw = var7_ref.a((byte) 111, param1.field_r[var9_int] & 65535);
                                if ((64 & this.field_u) == 0) {
                                  break L12;
                                } else {
                                  if (var10_ref_dw.field_p) {
                                    break L11;
                                  } else {
                                    break L12;
                                  }
                                }
                              }
                              if (var10_ref_dw.field_f) {
                                break L9;
                              } else {
                                break L11;
                              }
                            } else {
                              break L11;
                            }
                          }
                        }
                        fieldTemp$4 = this.field_W;
                        this.field_W = this.field_W + 1;
                        var8[fieldTemp$4] = var9_int;
                        this.field_e[param1.field_a[var9_int]] = this.field_e[param1.field_a[var9_int]] + 1;
                        this.field_e[param1.field_t[var9_int]] = this.field_e[param1.field_t[var9_int]] + 1;
                        this.field_e[param1.field_J[var9_int]] = this.field_e[param1.field_J[var9_int]] + 1;
                        break L9;
                      }
                      var9_int++;
                      if (var63 == 0) {
                        continue L6;
                      } else {
                        break L8;
                      }
                    }
                  }
                }
                this.field_ib = this.field_W;
                break L7;
              }
              L13: {
                var9 = new long[this.field_W];
                if ((this.field_bb & 256 ^ -1) == -1) {
                  stackOut_48_0 = 0;
                  stackIn_49_0 = stackOut_48_0;
                  break L13;
                } else {
                  stackOut_46_0 = 1;
                  stackIn_49_0 = stackOut_46_0;
                  break L13;
                }
              }
              var10 = stackIn_49_0;
              var11_int = 0;
              L14: while (true) {
                stackOut_50_0 = var11_int;
                stackOut_50_1 = this.field_W;
                stackIn_51_0 = stackOut_50_0;
                stackIn_51_1 = stackOut_50_1;
                L15: while (true) {
                  L16: {
                    L17: {
                      if (stackIn_51_0 >= stackIn_51_1) {
                        break L17;
                      } else {
                        var12 = var8[var11_int];
                        var13_ref = null;
                        var14_int = 0;
                        var15_int = 0;
                        var16 = 0;
                        var17 = 0;
                        if (var63 != 0) {
                          break L16;
                        } else {
                          L18: {
                            L19: {
                              if (null != param1.field_m) {
                                var18 = 0;
                                var19_int = 0;
                                L20: while (true) {
                                  L21: {
                                    if ((var19_int ^ -1) <= (param1.field_m.length ^ -1)) {
                                      break L21;
                                    } else {
                                      var20_ref_jt = param1.field_m[var19_int];
                                      stackOut_60_0 = var12 ^ -1;
                                      stackOut_60_1 = var20_ref_jt.field_a ^ -1;
                                      stackIn_51_0 = stackOut_60_0;
                                      stackIn_51_1 = stackOut_60_1;
                                      stackIn_61_0 = stackOut_60_0;
                                      stackIn_61_1 = stackOut_60_1;
                                      if (var63 != 0) {
                                        continue L15;
                                      } else {
                                        L22: {
                                          if (stackIn_61_0 == stackIn_61_1) {
                                            L23: {
                                              var21_ref_lp = fw.a(var20_ref_jt.field_d, false);
                                              if (var21_ref_lp.field_i) {
                                                var18 = 1;
                                                break L23;
                                              } else {
                                                break L23;
                                              }
                                            }
                                            if ((var21_ref_lp.field_f ^ -1) != 0) {
                                              var22_ref_dw = var7_ref.a((byte) -92, var21_ref_lp.field_f);
                                              if (-3 != (var22_ref_dw.field_d ^ -1)) {
                                                break L22;
                                              } else {
                                                this.field_s = true;
                                                break L22;
                                              }
                                            } else {
                                              break L22;
                                            }
                                          } else {
                                            break L22;
                                          }
                                        }
                                        var19_int++;
                                        if (var63 == 0) {
                                          continue L20;
                                        } else {
                                          break L21;
                                        }
                                      }
                                    }
                                  }
                                  if (var18 != 0) {
                                    var9[var11_int] = 9223372036854775807L;
                                    this.field_ib = this.field_ib - 1;
                                    if (var63 == 0) {
                                      break L18;
                                    } else {
                                      break L19;
                                    }
                                  } else {
                                    break L19;
                                  }
                                }
                              } else {
                                break L19;
                              }
                            }
                            L24: {
                              var18 = -1;
                              if (param1.field_r != null) {
                                var18 = param1.field_r[var12];
                                if ((var18 ^ -1) != 0) {
                                  L25: {
                                    L26: {
                                      var13_ref = var7_ref.a((byte) 118, 65535 & var18);
                                      if ((64 & this.field_u ^ -1) == -1) {
                                        break L26;
                                      } else {
                                        if (((dw) (var13_ref)).field_p) {
                                          break L25;
                                        } else {
                                          break L26;
                                        }
                                      }
                                    }
                                    L27: {
                                      var16 = ((dw) (var13_ref)).field_h;
                                      if (0 != ((dw) (var13_ref)).field_s) {
                                        break L27;
                                      } else {
                                        if (0 != ((dw) (var13_ref)).field_o) {
                                          break L27;
                                        } else {
                                          break L27;
                                        }
                                      }
                                    }
                                    var17 = ((dw) (var13_ref)).field_a;
                                    if (var63 == 0) {
                                      break L24;
                                    } else {
                                      break L25;
                                    }
                                  }
                                  var18 = -1;
                                  var13_ref = null;
                                  break L24;
                                } else {
                                  break L24;
                                }
                              } else {
                                break L24;
                              }
                            }
                            L28: {
                              L29: {
                                L30: {
                                  if (param1.field_n == null) {
                                    break L30;
                                  } else {
                                    if ((param1.field_n[var12] ^ -1) != -1) {
                                      break L29;
                                    } else {
                                      break L30;
                                    }
                                  }
                                }
                                L31: {
                                  if (var13_ref == null) {
                                    break L31;
                                  } else {
                                    if (((dw) (var13_ref)).field_d == 0) {
                                      break L31;
                                    } else {
                                      break L29;
                                    }
                                  }
                                }
                                stackOut_106_0 = 0;
                                stackIn_107_0 = stackOut_106_0;
                                break L28;
                              }
                              stackOut_104_0 = 1;
                              stackIn_107_0 = stackOut_104_0;
                              break L28;
                            }
                            L32: {
                              L33: {
                                var19_int = stackIn_107_0;
                                if (var10 != 0) {
                                  break L33;
                                } else {
                                  if (var19_int == 0) {
                                    break L32;
                                  } else {
                                    break L33;
                                  }
                                }
                              }
                              if (null != param1.field_C) {
                                var14_int = var14_int + (param1.field_C[var12] << -1243823247);
                                break L32;
                              } else {
                                break L32;
                              }
                            }
                            L34: {
                              if (var19_int == 0) {
                                break L34;
                              } else {
                                var14_int = var14_int + 65536;
                                break L34;
                              }
                            }
                            var14_int = var14_int + (var16 << -354507832 & 65280);
                            var15_int = var15_int + ((var18 & 65535) << 1580516080);
                            var14_int = var14_int + (var17 & 255);
                            var15_int = var15_int + (65535 & var11_int);
                            var9[var11_int] = ((long)var14_int << -1008284320) - -(long)var15_int;
                            this.field_s = this.field_s | var19_int != 0;
                            break L18;
                          }
                          var11_int++;
                          if (var63 == 0) {
                            continue L14;
                          } else {
                            break L17;
                          }
                        }
                      }
                    }
                    ofa.a(var8, var9, 93);
                    this.field_P = param1.field_b;
                    this.field_A = param1.field_p;
                    this.field_N = param1.field_E;
                    this.field_K = param1.field_I;
                    this.field_lb = param1.field_L;
                    this.field_db = param1.field_y;
                    this.field_t = param1.field_e;
                    break L16;
                  }
                  L35: {
                    L36: {
                      var11 = new pa[this.field_lb];
                      this.field_D = param1.field_B;
                      if (param1.field_m != null) {
                        this.field_G = param1.field_m.length;
                        this.field_f = new fd[this.field_G];
                        this.field_r = new pm[this.field_G];
                        var12 = 0;
                        L37: while (true) {
                          if (var12 >= this.field_G) {
                            break L36;
                          } else {
                            var13_ref = param1.field_m[var12];
                            var14 = fw.a(((jt) (var13_ref)).field_d, false);
                            var15_int = -1;
                            stackOut_127_0 = 0;
                            stackIn_148_0 = stackOut_127_0;
                            stackIn_128_0 = stackOut_127_0;
                            if (var63 != 0) {
                              break L35;
                            } else {
                              var16 = stackIn_128_0;
                              L38: while (true) {
                                L39: {
                                  L40: {
                                    if ((this.field_W ^ -1) >= (var16 ^ -1)) {
                                      break L40;
                                    } else {
                                      stackOut_130_0 = ((jt) (var13_ref)).field_a ^ -1;
                                      stackOut_130_1 = var8[var16] ^ -1;
                                      stackIn_139_0 = stackOut_130_0;
                                      stackIn_139_1 = stackOut_130_1;
                                      stackIn_131_0 = stackOut_130_0;
                                      stackIn_131_1 = stackOut_130_1;
                                      if (var63 != 0) {
                                        break L39;
                                      } else {
                                        L41: {
                                          if (stackIn_131_0 != stackIn_131_1) {
                                            break L41;
                                          } else {
                                            var15_int = var16;
                                            if (var63 == 0) {
                                              break L40;
                                            } else {
                                              break L41;
                                            }
                                          }
                                        }
                                        var16++;
                                        if (var63 == 0) {
                                          continue L38;
                                        } else {
                                          break L40;
                                        }
                                      }
                                    }
                                  }
                                  stackOut_138_0 = 0;
                                  stackOut_138_1 = var15_int ^ -1;
                                  stackIn_139_0 = stackOut_138_0;
                                  stackIn_139_1 = stackOut_138_1;
                                  break L39;
                                }
                                if (stackIn_139_0 != stackIn_139_1) {
                                  L42: {
                                    var16 = cla.field_m[param1.field_A[((jt) (var13_ref)).field_a] & 65535] & 16777215;
                                    stackOut_142_0 = var16;
                                    stackOut_142_1 = 255;
                                    stackIn_145_0 = stackOut_142_0;
                                    stackIn_145_1 = stackOut_142_1;
                                    stackIn_143_0 = stackOut_142_0;
                                    stackIn_143_1 = stackOut_142_1;
                                    if (param1.field_n != null) {
                                      stackOut_145_0 = stackIn_145_0;
                                      stackOut_145_1 = stackIn_145_1;
                                      stackOut_145_2 = param1.field_n[((jt) (var13_ref)).field_a];
                                      stackIn_146_0 = stackOut_145_0;
                                      stackIn_146_1 = stackOut_145_1;
                                      stackIn_146_2 = stackOut_145_2;
                                      break L42;
                                    } else {
                                      stackOut_143_0 = stackIn_143_0;
                                      stackOut_143_1 = stackIn_143_1;
                                      stackOut_143_2 = 0;
                                      stackIn_146_0 = stackOut_143_0;
                                      stackIn_146_1 = stackOut_143_1;
                                      stackIn_146_2 = stackOut_143_2;
                                      break L42;
                                    }
                                  }
                                  var16 = stackIn_146_0 | stackIn_146_1 - stackIn_146_2 << -1923296424;
                                  this.field_r[var12] = new pm(var15_int, (int) param1.field_a[((jt) (var13_ref)).field_a], (int) param1.field_t[((jt) (var13_ref)).field_a], (int) param1.field_J[((jt) (var13_ref)).field_a], var14.field_d, var14.field_b, var14.field_f, var14.field_c, var14.field_e, var14.field_i, var14.field_a, ((jt) (var13_ref)).field_c);
                                  this.field_f[var12] = new fd(var16);
                                  var12++;
                                  if (var63 == 0) {
                                    continue L37;
                                  } else {
                                    break L36;
                                  }
                                } else {
                                  throw new RuntimeException();
                                }
                              }
                            }
                          }
                        }
                      } else {
                        break L36;
                      }
                    }
                    stackOut_147_0 = this.field_W * 3;
                    stackIn_148_0 = stackOut_147_0;
                    break L35;
                  }
                  L43: {
                    var12 = stackIn_148_0;
                    if (null != param1.field_h) {
                      this.field_fb = new short[this.field_W];
                      break L43;
                    } else {
                      break L43;
                    }
                  }
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
                  L44: while (true) {
                    L45: {
                      L46: {
                        if (var14_int >= param1.field_L) {
                          break L46;
                        } else {
                          var15_int = this.field_e[var14_int];
                          this.field_e[var14_int] = var13;
                          var13 = var13 + var15_int;
                          var11[var14_int] = new pa();
                          var14_int++;
                          if (var63 != 0) {
                            break L45;
                          } else {
                            if (var63 == 0) {
                              continue L44;
                            } else {
                              break L46;
                            }
                          }
                        }
                      }
                      this.field_e[param1.field_L] = var13;
                      break L45;
                    }
                    var14_ref = qqa.a(var8, param1, this.field_W, (byte) -6);
                    var15 = new uo[param1.field_o];
                    var16 = 0;
                    L47: while (true) {
                      L48: {
                        L49: {
                          if (var16 >= param1.field_o) {
                            break L49;
                          } else {
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
                            stackOut_161_0 = var20 * var24_int + -(var21 * var23_int);
                            stackIn_196_0 = stackOut_161_0;
                            stackIn_162_0 = stackOut_161_0;
                            if (var63 != 0) {
                              break L48;
                            } else {
                              var28 = stackIn_162_0;
                              L50: while (true) {
                                L51: {
                                  L52: {
                                    L53: {
                                      if (8192 < var26_int) {
                                        break L53;
                                      } else {
                                        stackOut_164_0 = -8193;
                                        stackOut_164_1 = var27_int ^ -1;
                                        stackIn_181_0 = stackOut_164_0;
                                        stackIn_181_1 = stackOut_164_1;
                                        stackIn_165_0 = stackOut_164_0;
                                        stackIn_165_1 = stackOut_164_1;
                                        if (var63 != 0) {
                                          break L52;
                                        } else {
                                          if (stackIn_165_0 > stackIn_165_1) {
                                            break L53;
                                          } else {
                                            if (-8193 > (var28 ^ -1)) {
                                              break L53;
                                            } else {
                                              if (-8192 > var26_int) {
                                                break L53;
                                              } else {
                                                if (-8192 > var27_int) {
                                                  break L53;
                                                } else {
                                                  if (-8192 <= var28) {
                                                    break L51;
                                                  } else {
                                                    break L53;
                                                  }
                                                }
                                              }
                                            }
                                          }
                                        }
                                      }
                                    }
                                    var26_int = var26_int >> 1;
                                    var28 = var28 >> 1;
                                    stackOut_180_0 = var27_int;
                                    stackOut_180_1 = 1;
                                    stackIn_181_0 = stackOut_180_0;
                                    stackIn_181_1 = stackOut_180_1;
                                    break L52;
                                  }
                                  var27_int = stackIn_181_0 >> stackIn_181_1;
                                  if (var63 == 0) {
                                    continue L50;
                                  } else {
                                    break L51;
                                  }
                                }
                                L54: {
                                  var29 = (int)Math.sqrt((double)(var28 * var28 + var26_int * var26_int + var27_int * var27_int));
                                  if (-1 > (var29 ^ -1)) {
                                    break L54;
                                  } else {
                                    var29 = 1;
                                    break L54;
                                  }
                                }
                                L55: {
                                  var27_int = 256 * var27_int / var29;
                                  var28 = var28 * 256 / var29;
                                  var26_int = 256 * var26_int / var29;
                                  if (param1.field_G != null) {
                                    stackOut_187_0 = param1.field_G[var16];
                                    stackIn_188_0 = stackOut_187_0;
                                    break L55;
                                  } else {
                                    stackOut_185_0 = 0;
                                    stackIn_188_0 = stackOut_185_0;
                                    break L55;
                                  }
                                }
                                L56: {
                                  L57: {
                                    var30 = stackIn_188_0;
                                    if (var30 != 0) {
                                      break L57;
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
                                      if (var63 == 0) {
                                        break L56;
                                      } else {
                                        break L57;
                                      }
                                    }
                                  }
                                  if ((var30 ^ -1) != -2) {
                                    break L56;
                                  } else {
                                    dupTemp$5 = new uo();
                                    var15[var16] = dupTemp$5;
                                    var31_ref_uo = dupTemp$5;
                                    var31_ref_uo.field_a = var28;
                                    var31_ref_uo.field_b = var26_int;
                                    var31_ref_uo.field_c = var27_int;
                                    break L56;
                                  }
                                }
                                var16++;
                                if (var63 == 0) {
                                  continue L47;
                                } else {
                                  break L49;
                                }
                              }
                            }
                          }
                        }
                        stackOut_195_0 = 0;
                        stackIn_196_0 = stackOut_195_0;
                        break L48;
                      }
                      var16 = stackIn_196_0;
                      L58: while (true) {
                        L59: {
                          L60: {
                            L61: {
                              L62: {
                                L63: {
                                  if ((var16 ^ -1) <= (this.field_W ^ -1)) {
                                    break L63;
                                  } else {
                                    var17 = var8[var16];
                                    var18 = param1.field_A[var17] & 65535;
                                    stackOut_198_0 = (oc) (param1);
                                    stackIn_353_0 = stackOut_198_0;
                                    stackIn_199_0 = stackOut_198_0;
                                    if (var63 != 0) {
                                      break L62;
                                    } else {
                                      L64: {
                                        L65: {
                                          if (stackIn_199_0.field_g != null) {
                                            break L65;
                                          } else {
                                            var19_int = -1;
                                            if (var63 == 0) {
                                              break L64;
                                            } else {
                                              break L65;
                                            }
                                          }
                                        }
                                        var19_int = param1.field_g[var17];
                                        break L64;
                                      }
                                      L66: {
                                        L67: {
                                          if (param1.field_n == null) {
                                            break L67;
                                          } else {
                                            var20 = 255 & param1.field_n[var17];
                                            if (var63 == 0) {
                                              break L66;
                                            } else {
                                              break L67;
                                            }
                                          }
                                        }
                                        var20 = 0;
                                        break L66;
                                      }
                                      L68: {
                                        if (param1.field_r == null) {
                                          stackOut_210_0 = -1;
                                          stackIn_211_0 = stackOut_210_0;
                                          break L68;
                                        } else {
                                          stackOut_208_0 = param1.field_r[var17];
                                          stackIn_211_0 = stackOut_208_0;
                                          break L68;
                                        }
                                      }
                                      L69: {
                                        var21 = stackIn_211_0;
                                        if (-1 == var21) {
                                          break L69;
                                        } else {
                                          if (-1 == (64 & this.field_u ^ -1)) {
                                            break L69;
                                          } else {
                                            var22_ref_dw = var7_ref.a((byte) -92, 65535 & var21);
                                            if (!var22_ref_dw.field_p) {
                                              break L69;
                                            } else {
                                              var21 = -1;
                                              break L69;
                                            }
                                          }
                                        }
                                      }
                                      L70: {
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
                                          L71: {
                                            if (0 != (var19_int ^ -1)) {
                                              break L71;
                                            } else {
                                              var23 = 1.0f;
                                              var22 = 0.0f;
                                              var24 = 1.0f;
                                              var27 = 0.0f;
                                              var26 = 0.0f;
                                              var29 = 2;
                                              var25 = 1.0f;
                                              var28 = 1;
                                              if (var63 == 0) {
                                                break L70;
                                              } else {
                                                break L71;
                                              }
                                            }
                                          }
                                          L72: {
                                            var19_int = var19_int & 255;
                                            var31 = param1.field_u[var19_int];
                                            if (var31 == 0) {
                                              break L72;
                                            } else {
                                              L73: {
                                                L74: {
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
                                                    break L74;
                                                  } else {
                                                    L75: {
                                                      if ((var31 ^ -1) == -3) {
                                                        break L75;
                                                      } else {
                                                        if (3 == var31) {
                                                          L76: {
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
                                                              break L76;
                                                            } else {
                                                              L77: {
                                                                L78: {
                                                                  if (var26 - var22 <= 0.5f) {
                                                                    break L78;
                                                                  } else {
                                                                    var29 = 1;
                                                                    var26 = var26 - 1.0f;
                                                                    if (var63 == 0) {
                                                                      break L77;
                                                                    } else {
                                                                      break L78;
                                                                    }
                                                                  }
                                                                }
                                                                if (var22 - var26 > 0.5f) {
                                                                  var26 = var26 + 1.0f;
                                                                  var29 = 2;
                                                                  break L77;
                                                                } else {
                                                                  break L77;
                                                                }
                                                              }
                                                              L79: {
                                                                if (var24 - var22 <= 0.5f) {
                                                                  break L79;
                                                                } else {
                                                                  var24 = var24 - 1.0f;
                                                                  var28 = 1;
                                                                  if (var63 == 0) {
                                                                    break L73;
                                                                  } else {
                                                                    break L79;
                                                                  }
                                                                }
                                                              }
                                                              if (var22 - var24 <= 0.5f) {
                                                                break L73;
                                                              } else {
                                                                var24 = var24 + 1.0f;
                                                                var28 = 2;
                                                                if (var63 == 0) {
                                                                  break L73;
                                                                } else {
                                                                  break L76;
                                                                }
                                                              }
                                                            }
                                                          }
                                                          L80: {
                                                            L81: {
                                                              if (0.5f < var27 - var23) {
                                                                break L81;
                                                              } else {
                                                                if (var23 - var27 <= 0.5f) {
                                                                  break L80;
                                                                } else {
                                                                  var27 = var27 + 1.0f;
                                                                  var29 = 2;
                                                                  if (var63 == 0) {
                                                                    break L80;
                                                                  } else {
                                                                    break L81;
                                                                  }
                                                                }
                                                              }
                                                            }
                                                            var29 = 1;
                                                            var27 = var27 - 1.0f;
                                                            break L80;
                                                          }
                                                          L82: {
                                                            if (var25 - var23 > 0.5f) {
                                                              break L82;
                                                            } else {
                                                              if (0.5f < var23 - var25) {
                                                                var28 = 2;
                                                                var25 = var25 + 1.0f;
                                                                if (var63 == 0) {
                                                                  break L73;
                                                                } else {
                                                                  break L82;
                                                                }
                                                              } else {
                                                                break L73;
                                                              }
                                                            }
                                                          }
                                                          var25 = var25 - 1.0f;
                                                          var28 = 1;
                                                          if (var63 == 0) {
                                                            break L73;
                                                          } else {
                                                            break L75;
                                                          }
                                                        } else {
                                                          break L73;
                                                        }
                                                      }
                                                    }
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
                                                    if (var63 == 0) {
                                                      break L73;
                                                    } else {
                                                      break L74;
                                                    }
                                                  }
                                                }
                                                L83: {
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
                                                    break L83;
                                                  } else {
                                                    L84: {
                                                      L85: {
                                                        if (var26 - var22 <= var42) {
                                                          break L85;
                                                        } else {
                                                          var26 = var26 - var41;
                                                          var29 = 1;
                                                          if (var63 == 0) {
                                                            break L84;
                                                          } else {
                                                            break L85;
                                                          }
                                                        }
                                                      }
                                                      if (var42 >= -var26 + var22) {
                                                        break L84;
                                                      } else {
                                                        var26 = var26 + var41;
                                                        var29 = 2;
                                                        break L84;
                                                      }
                                                    }
                                                    L86: {
                                                      if (var42 >= -var22 + var24) {
                                                        break L86;
                                                      } else {
                                                        var24 = var24 - var41;
                                                        var28 = 1;
                                                        if (var63 == 0) {
                                                          break L73;
                                                        } else {
                                                          break L86;
                                                        }
                                                      }
                                                    }
                                                    if (var42 < -var24 + var22) {
                                                      var24 = var24 + var41;
                                                      var28 = 2;
                                                      if (var63 == 0) {
                                                        break L73;
                                                      } else {
                                                        break L83;
                                                      }
                                                    } else {
                                                      break L73;
                                                    }
                                                  }
                                                }
                                                L87: {
                                                  L88: {
                                                    if (var42 >= var25 - var23) {
                                                      break L88;
                                                    } else {
                                                      var28 = 1;
                                                      var25 = var25 - var41;
                                                      if (var63 == 0) {
                                                        break L87;
                                                      } else {
                                                        break L88;
                                                      }
                                                    }
                                                  }
                                                  if (-var25 + var23 <= var42) {
                                                    break L87;
                                                  } else {
                                                    var25 = var25 + var41;
                                                    var28 = 2;
                                                    break L87;
                                                  }
                                                }
                                                L89: {
                                                  if (-var23 + var27 > var42) {
                                                    break L89;
                                                  } else {
                                                    if (var42 < var23 - var27) {
                                                      var29 = 2;
                                                      var27 = var27 + var41;
                                                      if (var63 == 0) {
                                                        break L73;
                                                      } else {
                                                        break L89;
                                                      }
                                                    } else {
                                                      break L73;
                                                    }
                                                  }
                                                }
                                                var27 = var27 - var41;
                                                var29 = 1;
                                                break L73;
                                              }
                                              if (var63 == 0) {
                                                break L70;
                                              } else {
                                                break L72;
                                              }
                                            }
                                          }
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
                                          break L70;
                                        } else {
                                          break L70;
                                        }
                                      }
                                      L90: {
                                        L91: {
                                          if (param1.field_G == null) {
                                            break L91;
                                          } else {
                                            var31 = param1.field_G[var17];
                                            if (var63 == 0) {
                                              break L90;
                                            } else {
                                              break L91;
                                            }
                                          }
                                        }
                                        var31 = 0;
                                        break L90;
                                      }
                                      L92: {
                                        L93: {
                                          if (0 != var31) {
                                            break L93;
                                          } else {
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
                                            if (var63 == 0) {
                                              break L92;
                                            } else {
                                              break L93;
                                            }
                                          }
                                        }
                                        if (var31 != 1) {
                                          break L92;
                                        } else {
                                          L94: {
                                            var32 = var15[var17];
                                            stackOut_309_0 = (256 + var32.field_a << 493169334) + ((var32.field_c + 256 << 100403916) + (var19_int << 1023554786));
                                            stackIn_312_0 = stackOut_309_0;
                                            stackIn_310_0 = stackOut_309_0;
                                            if (-1 > (var32.field_b ^ -1)) {
                                              stackOut_312_0 = stackIn_312_0;
                                              stackOut_312_1 = 1024;
                                              stackIn_313_0 = stackOut_312_0;
                                              stackIn_313_1 = stackOut_312_1;
                                              break L94;
                                            } else {
                                              stackOut_310_0 = stackIn_310_0;
                                              stackOut_310_1 = 2048;
                                              stackIn_313_0 = stackOut_310_0;
                                              stackIn_313_1 = stackOut_310_1;
                                              break L94;
                                            }
                                          }
                                          var33 = (long)(stackIn_313_0 - -stackIn_313_1) - -((long)var20 + (long)(var18 << -541878392) + (long)(var30 << 936601976) << -108288864);
                                          this.field_H[var16] = this.a(var33, var32.field_a, var32.field_c, 0, (byte) -40, (int) param1.field_a[var17], var32.field_b, var23, param1, var22);
                                          this.field_z[var16] = this.a(var33 + (long)var28, var32.field_a, var32.field_c, 0, (byte) -40, (int) param1.field_t[var17], var32.field_b, var25, param1, var24);
                                          this.field_hb[var16] = this.a((long)var29 + var33, var32.field_a, var32.field_c, 0, (byte) -40, (int) param1.field_J[var17], var32.field_b, var27, param1, var26);
                                          break L92;
                                        }
                                      }
                                      L95: {
                                        if (param1.field_n != null) {
                                          this.field_o[var16] = param1.field_n[var17];
                                          break L95;
                                        } else {
                                          break L95;
                                        }
                                      }
                                      L96: {
                                        if (param1.field_h == null) {
                                          break L96;
                                        } else {
                                          this.field_fb[var16] = param1.field_h[var17];
                                          break L96;
                                        }
                                      }
                                      this.field_X[var16] = param1.field_A[var17];
                                      this.field_I[var16] = (short) var21;
                                      var16++;
                                      if (var63 == 0) {
                                        continue L58;
                                      } else {
                                        break L63;
                                      }
                                    }
                                  }
                                }
                                var16 = 0;
                                var17 = -10000;
                                var18 = 0;
                                L97: while (true) {
                                  L98: {
                                    L99: {
                                      if ((this.field_ib ^ -1) >= (var18 ^ -1)) {
                                        break L99;
                                      } else {
                                        var19_int = this.field_I[var18];
                                        stackOut_324_0 = var19_int ^ -1;
                                        stackOut_324_1 = var17 ^ -1;
                                        stackIn_332_0 = stackOut_324_0;
                                        stackIn_332_1 = stackOut_324_1;
                                        stackIn_325_0 = stackOut_324_0;
                                        stackIn_325_1 = stackOut_324_1;
                                        if (var63 != 0) {
                                          L100: while (true) {
                                            if (stackIn_332_0 >= stackIn_332_1) {
                                              break L98;
                                            } else {
                                              var19_int = this.field_I[var18];
                                              stackOut_333_0 = var19_int ^ -1;
                                              stackOut_333_1 = var17 ^ -1;
                                              stackIn_356_0 = stackOut_333_0;
                                              stackIn_356_1 = stackOut_333_1;
                                              stackIn_334_0 = stackOut_333_0;
                                              stackIn_334_1 = stackOut_333_1;
                                              if (var63 != 0) {
                                                break L61;
                                              } else {
                                                L101: {
                                                  if (stackIn_334_0 == stackIn_334_1) {
                                                    break L101;
                                                  } else {
                                                    incrementValue$6 = var16;
                                                    var16++;
                                                    this.field_p[incrementValue$6] = var18;
                                                    var17 = var19_int;
                                                    break L101;
                                                  }
                                                }
                                                var18++;
                                                if (var63 == 0) {
                                                  stackOut_331_0 = this.field_ib ^ -1;
                                                  stackOut_331_1 = var18 ^ -1;
                                                  stackIn_332_0 = stackOut_331_0;
                                                  stackIn_332_1 = stackOut_331_1;
                                                  continue L100;
                                                } else {
                                                  break L98;
                                                }
                                              }
                                            }
                                          }
                                        } else {
                                          L102: {
                                            if (stackIn_325_0 == stackIn_325_1) {
                                              break L102;
                                            } else {
                                              var17 = var19_int;
                                              var16++;
                                              break L102;
                                            }
                                          }
                                          var18++;
                                          if (var63 == 0) {
                                            continue L97;
                                          } else {
                                            break L99;
                                          }
                                        }
                                      }
                                    }
                                    this.field_p = new int[var16 - -1];
                                    var17 = -10000;
                                    var16 = 0;
                                    var18 = 0;
                                    L103: while (true) {
                                      stackOut_331_0 = this.field_ib ^ -1;
                                      stackOut_331_1 = var18 ^ -1;
                                      stackIn_332_0 = stackOut_331_0;
                                      stackIn_332_1 = stackOut_331_1;
                                      if (stackIn_332_0 >= stackIn_332_1) {
                                        break L98;
                                      } else {
                                        var19_int = this.field_I[var18];
                                        stackOut_333_0 = var19_int ^ -1;
                                        stackOut_333_1 = var17 ^ -1;
                                        stackIn_356_0 = stackOut_333_0;
                                        stackIn_356_1 = stackOut_333_1;
                                        stackIn_334_0 = stackOut_333_0;
                                        stackIn_334_1 = stackOut_333_1;
                                        if (var63 != 0) {
                                          break L61;
                                        } else {
                                          L104: {
                                            if (stackIn_334_0 == stackIn_334_1) {
                                              break L104;
                                            } else {
                                              incrementValue$6 = var16;
                                              var16++;
                                              this.field_p[incrementValue$6] = var18;
                                              var17 = var19_int;
                                              break L104;
                                            }
                                          }
                                          var18++;
                                          if (var63 == 0) {
                                            continue L103;
                                          } else {
                                            break L98;
                                          }
                                        }
                                      }
                                    }
                                  }
                                  L105: {
                                    this.field_p[var16] = this.field_ib;
                                    qka.field_m = null;
                                    this.field_E = rna.a(this.field_E, true, this.field_L);
                                    this.field_Y = rna.a(this.field_Y, true, this.field_L);
                                    this.field_cb = rna.a(this.field_cb, true, this.field_L);
                                    this.field_O = pt.a(this.field_O, this.field_L, 4096);
                                    this.field_n = lpa.a(this.field_L, 50, this.field_n);
                                    this.field_y = lpa.a(this.field_L, 50, this.field_y);
                                    if (null == param1.field_l) {
                                      break L105;
                                    } else {
                                      if (kda.b(param2, 104, this.field_u)) {
                                        this.field_d = param1.a(false, (byte) 64);
                                        break L105;
                                      } else {
                                        break L105;
                                      }
                                    }
                                  }
                                  L106: {
                                    if (null == param1.field_m) {
                                      break L106;
                                    } else {
                                      if (!eo.a(this.field_u, (byte) 83, param2)) {
                                        break L106;
                                      } else {
                                        this.field_C = param1.b((byte) -91);
                                        break L106;
                                      }
                                    }
                                  }
                                  stackOut_352_0 = (oc) (param1);
                                  stackIn_353_0 = stackOut_352_0;
                                  break L62;
                                }
                              }
                              if (stackIn_353_0.field_D == null) {
                                break L60;
                              } else {
                                stackOut_354_0 = -26571;
                                stackOut_354_1 = param2;
                                stackIn_356_0 = stackOut_354_0;
                                stackIn_356_1 = stackOut_354_1;
                                break L61;
                              }
                            }
                            if (aw.d(stackIn_356_0, stackIn_356_1, this.field_u)) {
                              var18 = 0;
                              var19 = new int[256];
                              var20 = 0;
                              L107: while (true) {
                                L108: {
                                  L109: {
                                    if (var20 >= this.field_W) {
                                      break L109;
                                    } else {
                                      var21 = param1.field_D[var8[var20]];
                                      stackOut_361_0 = var21;
                                      stackIn_372_0 = stackOut_361_0;
                                      stackIn_362_0 = stackOut_361_0;
                                      if (var63 != 0) {
                                        break L108;
                                      } else {
                                        L110: {
                                          if (stackIn_362_0 < 0) {
                                            break L110;
                                          } else {
                                            L111: {
                                              if ((var21 ^ -1) >= (var18 ^ -1)) {
                                                break L111;
                                              } else {
                                                var18 = var21;
                                                break L111;
                                              }
                                            }
                                            var19[var21] = var19[var21] + 1;
                                            break L110;
                                          }
                                        }
                                        var20++;
                                        if (var63 == 0) {
                                          continue L107;
                                        } else {
                                          break L109;
                                        }
                                      }
                                    }
                                  }
                                  this.field_j = new int[1 + var18][];
                                  stackOut_371_0 = 0;
                                  stackIn_372_0 = stackOut_371_0;
                                  break L108;
                                }
                                var20 = stackIn_372_0;
                                L112: while (true) {
                                  L113: {
                                    L114: {
                                      if (var18 < var20) {
                                        break L114;
                                      } else {
                                        array$7 = new int[var19[var20]];
                                        this.field_j[var20] = array$7;
                                        var19[var20] = 0;
                                        var20++;
                                        if (var63 != 0) {
                                          break L113;
                                        } else {
                                          if (var63 == 0) {
                                            continue L112;
                                          } else {
                                            break L114;
                                          }
                                        }
                                      }
                                    }
                                    var20 = 0;
                                    break L113;
                                  }
                                  L115: while (true) {
                                    if ((this.field_W ^ -1) >= (var20 ^ -1)) {
                                      break L60;
                                    } else {
                                      var21 = param1.field_D[var8[var20]];
                                      if (var63 != 0) {
                                        break L59;
                                      } else {
                                        L116: {
                                          if (var21 < 0) {
                                            break L116;
                                          } else {
                                            var19[var21] = var19[var21] + 1;
                                            this.field_j[var21][var19[var21]] = var20;
                                            break L116;
                                          }
                                        }
                                        var20++;
                                        if (var63 == 0) {
                                          continue L115;
                                        } else {
                                          break L60;
                                        }
                                      }
                                    }
                                  }
                                }
                              }
                            } else {
                              break L60;
                            }
                          }
                          break L59;
                        }
                        break L0;
                      }
                    }
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L117: {
            var7 = decompiledCaughtException;
            stackOut_388_0 = (RuntimeException) (var7);
            stackOut_388_1 = new StringBuilder().append("np.<init>(");
            stackIn_391_0 = stackOut_388_0;
            stackIn_391_1 = stackOut_388_1;
            stackIn_389_0 = stackOut_388_0;
            stackIn_389_1 = stackOut_388_1;
            if (param0 == null) {
              stackOut_391_0 = (RuntimeException) ((Object) stackIn_391_0);
              stackOut_391_1 = (StringBuilder) ((Object) stackIn_391_1);
              stackOut_391_2 = "null";
              stackIn_392_0 = stackOut_391_0;
              stackIn_392_1 = stackOut_391_1;
              stackIn_392_2 = stackOut_391_2;
              break L117;
            } else {
              stackOut_389_0 = (RuntimeException) ((Object) stackIn_389_0);
              stackOut_389_1 = (StringBuilder) ((Object) stackIn_389_1);
              stackOut_389_2 = "{...}";
              stackIn_392_0 = stackOut_389_0;
              stackIn_392_1 = stackOut_389_1;
              stackIn_392_2 = stackOut_389_2;
              break L117;
            }
          }
          L118: {
            stackOut_392_0 = (RuntimeException) ((Object) stackIn_392_0);
            stackOut_392_1 = ((StringBuilder) (Object) stackIn_392_1).append(stackIn_392_2).append(',');
            stackIn_395_0 = stackOut_392_0;
            stackIn_395_1 = stackOut_392_1;
            stackIn_393_0 = stackOut_392_0;
            stackIn_393_1 = stackOut_392_1;
            if (param1 == null) {
              stackOut_395_0 = (RuntimeException) ((Object) stackIn_395_0);
              stackOut_395_1 = (StringBuilder) ((Object) stackIn_395_1);
              stackOut_395_2 = "null";
              stackIn_396_0 = stackOut_395_0;
              stackIn_396_1 = stackOut_395_1;
              stackIn_396_2 = stackOut_395_2;
              break L118;
            } else {
              stackOut_393_0 = (RuntimeException) ((Object) stackIn_393_0);
              stackOut_393_1 = (StringBuilder) ((Object) stackIn_393_1);
              stackOut_393_2 = "{...}";
              stackIn_396_0 = stackOut_393_0;
              stackIn_396_1 = stackOut_393_1;
              stackIn_396_2 = stackOut_393_2;
              break L118;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_396_0), stackIn_396_2 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    static {
        field_V = "<%0> has entered another game.";
    }
}
