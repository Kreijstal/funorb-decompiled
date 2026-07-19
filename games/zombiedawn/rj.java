/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rj extends sp {
    int[] field_O;
    private int[] field_M;
    static int field_E;
    int[] field_r;
    private int field_o;
    int[] field_l;
    private int[] field_L;
    private int[] field_B;
    private int[] field_D;
    private int[] field_z;
    private int[] field_q;
    private lf[][] field_x;
    private int[] field_u;
    private int field_m;
    private jg field_w;
    private int[] field_H;
    private dl field_A;
    private int[] field_I;
    private int[] field_Q;
    private int[] field_p;
    private int[] field_n;
    private int[] field_F;
    private lf[][] field_G;
    private long field_K;
    private ip field_J;
    private long field_t;
    private int field_v;
    private int field_N;
    private boolean field_s;
    private wj field_y;
    private int field_P;
    private boolean field_C;

    final synchronized sp c() {
        return (sp) ((Object) this.field_J);
    }

    final synchronized void a(int param0, byte param1) {
        this.field_o = param0;
        if (param1 >= -21) {
            this.field_N = 53;
        }
    }

    private final int a(lf param0, byte param1) {
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        nf var9 = null;
        nf var10 = null;
        int stackIn_5_0 = 0;
        int stackIn_20_0 = 0;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_4_0 = 0;
        int stackOut_19_0 = 0;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        try {
          L0: {
            L1: {
              if (param1 == -111) {
                break L1;
              } else {
                this.b(10, (byte) 5, 56);
                break L1;
              }
            }
            if (this.field_z[param0.field_z] == 0) {
              stackOut_4_0 = 0;
              stackIn_5_0 = stackOut_4_0;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L2: {
                var9 = param0.field_t;
                var10 = var9;
                var4 = 4096 + this.field_I[param0.field_z] * this.field_B[param0.field_z] >> -444117235;
                var4 = 16384 + var4 * var4 >> -1575844529;
                var4 = 16384 + param0.field_v * var4 >> -2055127153;
                var4 = var4 * this.field_o - -128 >> 867453352;
                var4 = this.field_z[param0.field_z] * var4 + 128 >> 406367240;
                if (0 < var10.field_j) {
                  var4 = (int)(0.5 + Math.pow(0.5, (double)param0.field_p * 0.00001953125 * (double)var10.field_j) * (double)var4);
                  break L2;
                } else {
                  break L2;
                }
              }
              L3: {
                if (var10.field_h == null) {
                  break L3;
                } else {
                  L4: {
                    var5 = param0.field_l;
                    var6 = var10.field_h[1 + param0.field_y];
                    if (-2 + var10.field_h.length <= param0.field_y) {
                      break L4;
                    } else {
                      var7 = 65280 & var9.field_h[param0.field_y] << 439719592;
                      var8 = (255 & var10.field_h[2 + param0.field_y]) << -574550328;
                      var6 = var6 + (var10.field_h[param0.field_y - -3] + -var6) * (-var7 + var5) / (var8 - var7);
                      break L4;
                    }
                  }
                  var4 = var4 * var6 - -32 >> -1805216122;
                  break L3;
                }
              }
              L5: {
                if ((param0.field_k ^ -1) >= -1) {
                  break L5;
                } else {
                  if (null == var10.field_b) {
                    break L5;
                  } else {
                    L6: {
                      var5 = param0.field_k;
                      var6 = var10.field_b[param0.field_q + 1];
                      if (-2 + var10.field_b.length > param0.field_q) {
                        var7 = (var9.field_b[param0.field_q] & 255) << 442913736;
                        var8 = 65280 & var10.field_b[param0.field_q + 2] << -1233186616;
                        var6 = var6 + (-var7 + var5) * (var10.field_b[3 + param0.field_q] + -var6) / (var8 + -var7);
                        break L6;
                      } else {
                        break L6;
                      }
                    }
                    var4 = var6 * var4 + 32 >> -172926938;
                    break L5;
                  }
                }
              }
              stackOut_19_0 = var4;
              stackIn_20_0 = stackOut_19_0;
              decompiledRegionSelector0 = 1;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var3 = decompiledCaughtException;
            stackOut_21_0 = (RuntimeException) (var3);
            stackOut_21_1 = new StringBuilder().append("rj.M(");
            stackIn_23_0 = stackOut_21_0;
            stackIn_23_1 = stackOut_21_1;
            stackIn_22_0 = stackOut_21_0;
            stackIn_22_1 = stackOut_21_1;
            if (param0 == null) {
              stackOut_23_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackOut_23_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackOut_23_2 = "null";
              stackIn_24_0 = stackOut_23_0;
              stackIn_24_1 = stackOut_23_1;
              stackIn_24_2 = stackOut_23_2;
              break L7;
            } else {
              stackOut_22_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackOut_22_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackOut_22_2 = "{...}";
              stackIn_24_0 = stackOut_22_0;
              stackIn_24_1 = stackOut_22_1;
              stackIn_24_2 = stackOut_22_2;
              break L7;
            }
          }
          throw sh.a((Throwable) ((Object) stackIn_24_0), stackIn_24_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_5_0;
        } else {
          return stackIn_20_0;
        }
    }

    private final void a(int param0, int param1, byte param2) {
        if (param2 <= 24) {
            this.field_x = (lf[][]) null;
        }
        this.field_p[param0] = param1;
        this.field_r[param0] = (int)(0.5 + 2097152.0 * Math.pow(2.0, (double)param1 * 0.00054931640625));
    }

    private final void a(int param0, int param1, int param2, int param3) {
        lf var5 = null;
        gi var6 = null;
        int var6_int = 0;
        lf var7 = null;
        lf var8 = null;
        int var9 = 0;
        ma var10 = null;
        ma var11 = null;
        Object stackIn_17_0 = null;
        lf stackIn_17_1 = null;
        int stackIn_17_2 = 0;
        Object stackIn_18_0 = null;
        lf stackIn_18_1 = null;
        int stackIn_18_2 = 0;
        Object stackIn_19_0 = null;
        lf stackIn_19_1 = null;
        int stackIn_19_2 = 0;
        int stackIn_19_3 = 0;
        Object stackOut_16_0 = null;
        lf stackOut_16_1 = null;
        int stackOut_16_2 = 0;
        Object stackOut_18_0 = null;
        lf stackOut_18_1 = null;
        int stackOut_18_2 = 0;
        int stackOut_18_3 = 0;
        Object stackOut_17_0 = null;
        lf stackOut_17_1 = null;
        int stackOut_17_2 = 0;
        int stackOut_17_3 = 0;
        L0: {
          var9 = ZombieDawn.field_J;
          this.b(param3, 116, param2, 64);
          if ((this.field_l[param3] & 2) != 0) {
            var5 = (lf) ((Object) this.field_J.field_s.e(0));
            L1: while (true) {
              if (var5 == null) {
                break L0;
              } else {
                L2: {
                  if (param3 != var5.field_z) {
                    break L2;
                  } else {
                    if (-1 < (var5.field_k ^ -1)) {
                      this.field_G[param3][var5.field_i] = null;
                      this.field_G[param3][param2] = var5;
                      var6_int = var5.field_C - -(var5.field_A * var5.field_j >> -266517716);
                      var5.field_C = var5.field_C + (-var5.field_i + param2 << -282778168);
                      var5.field_j = 4096;
                      var5.field_A = -var5.field_C + var6_int;
                      var5.field_i = param2;
                      return;
                    } else {
                      break L2;
                    }
                  }
                }
                var5 = (lf) ((Object) this.field_J.field_s.c(26853));
                continue L1;
              }
            }
          } else {
            break L0;
          }
        }
        var10 = (ma) ((Object) this.field_A.a((long)this.field_D[param3], param1 + 50));
        var11 = var10;
        if (var11 == null) {
          return;
        } else {
          var6 = var10.field_o[param2];
          if (var6 != null) {
            L3: {
              var7 = new lf();
              var7.field_u = var11;
              var7.field_s = var6;
              var7.field_z = param3;
              var7.field_t = var10.field_s[param2];
              var7.field_B = var10.field_t[param2];
              var7.field_i = param2;
              var7.field_v = var10.field_m[param2] * param0 * (param0 * var11.field_u) + 1024 >> -1030617685;
              var7.field_x = var10.field_h[param2] & 255;
              var7.field_C = (param2 << -847555384) + -(32767 & var10.field_j[param2]);
              var7.field_y = 0;
              var7.field_q = 0;
              var7.field_k = -1;
              var7.field_l = 0;
              var7.field_p = 0;
              if (0 != this.field_O[param3]) {
                L4: {
                  var7.field_E = fn.a(var6, this.a(-20165, var7), 0, this.a(var7, true));
                  stackOut_16_0 = this;
                  stackOut_16_1 = (lf) (var7);
                  stackOut_16_2 = -124;
                  stackIn_18_0 = stackOut_16_0;
                  stackIn_18_1 = stackOut_16_1;
                  stackIn_18_2 = stackOut_16_2;
                  stackIn_17_0 = stackOut_16_0;
                  stackIn_17_1 = stackOut_16_1;
                  stackIn_17_2 = stackOut_16_2;
                  if ((var11.field_j[param2] ^ -1) <= -1) {
                    stackOut_18_0 = this;
                    stackOut_18_1 = (lf) ((Object) stackIn_18_1);
                    stackOut_18_2 = stackIn_18_2;
                    stackOut_18_3 = 0;
                    stackIn_19_0 = stackOut_18_0;
                    stackIn_19_1 = stackOut_18_1;
                    stackIn_19_2 = stackOut_18_2;
                    stackIn_19_3 = stackOut_18_3;
                    break L4;
                  } else {
                    stackOut_17_0 = this;
                    stackOut_17_1 = (lf) ((Object) stackIn_17_1);
                    stackOut_17_2 = stackIn_17_2;
                    stackOut_17_3 = 1;
                    stackIn_19_0 = stackOut_17_0;
                    stackIn_19_1 = stackOut_17_1;
                    stackIn_19_2 = stackOut_17_2;
                    stackIn_19_3 = stackOut_17_3;
                    break L4;
                  }
                }
                this.a(stackIn_19_1, stackIn_19_2, stackIn_19_3 != 0);
                break L3;
              } else {
                var7.field_E = fn.a(var6, this.a(-20165, var7), this.a(var7, (byte) -111), this.a(var7, true));
                break L3;
              }
            }
            L5: {
              if ((var11.field_j[param2] ^ -1) <= -1) {
                break L5;
              } else {
                var7.field_E.e(-1);
                break L5;
              }
            }
            L6: {
              if (0 <= var7.field_B) {
                L7: {
                  var8 = this.field_x[param3][var7.field_B];
                  if (var8 == null) {
                    break L7;
                  } else {
                    if (var8.field_k < 0) {
                      this.field_G[param3][var8.field_i] = null;
                      var8.field_k = 0;
                      break L7;
                    } else {
                      break L7;
                    }
                  }
                }
                this.field_x[param3][var7.field_B] = var7;
                break L6;
              } else {
                break L6;
              }
            }
            this.field_J.field_s.a(param1 ^ param1, var7);
            this.field_G[param3][param2] = var7;
            return;
          } else {
            return;
          }
        }
    }

    final synchronized void a(int param0, byte param1, int param2) {
        boolean discarded$0 = false;
        this.b(param2, false, param0);
        if (param1 >= -115) {
            discarded$0 = this.c((byte) 118);
        }
    }

    private final void b(byte param0, int param1) {
        lf var3 = null;
        int var4 = 0;
        var4 = ZombieDawn.field_J;
        if (param0 == -128) {
          var3 = (lf) ((Object) this.field_J.field_s.b((byte) 26));
          L0: while (true) {
            if (var3 == null) {
              return;
            } else {
              L1: {
                L2: {
                  if (0 > param1) {
                    break L2;
                  } else {
                    if (param1 == var3.field_z) {
                      break L2;
                    } else {
                      break L1;
                    }
                  }
                }
                L3: {
                  if (null != var3.field_E) {
                    L4: {
                      var3.field_E.c(qf.field_p / 100);
                      if (!var3.field_E.f()) {
                        break L4;
                      } else {
                        this.field_J.field_m.b(var3.field_E);
                        break L4;
                      }
                    }
                    var3.c((byte) 125);
                    break L3;
                  } else {
                    break L3;
                  }
                }
                L5: {
                  if (0 > var3.field_k) {
                    this.field_G[var3.field_z][var3.field_i] = null;
                    break L5;
                  } else {
                    break L5;
                  }
                }
                var3.b(-27598);
                break L1;
              }
              var3 = (lf) ((Object) this.field_J.field_s.a(false));
              continue L0;
            }
          }
        } else {
          return;
        }
    }

    private final void c(int param0, int param1) {
        lf var3 = null;
        int var4 = ZombieDawn.field_J;
        if (!(0 == (this.field_l[param1] & 4))) {
            var3 = (lf) ((Object) this.field_J.field_s.b((byte) 26));
            while (var3 != null) {
                if (!(var3.field_z != param1)) {
                    var3.field_D = 0;
                }
                var3 = (lf) ((Object) this.field_J.field_s.a(false));
            }
        }
        if (param0 < 45) {
            this.field_o = 124;
        }
    }

    private final void b(int param0, byte param1, int param2) {
        if (param1 > -126) {
            this.field_P = 31;
        }
        this.field_L[param0] = param2;
    }

    private final void a(boolean param0, int param1) {
        int var3 = 0;
        int var4 = ZombieDawn.field_J;
        if (!param0) {
            this.d(0, -1);
        } else {
            this.b((byte) -128, -1);
        }
        this.b(-1, 8192);
        if (param1 != 256) {
            wj var5 = (wj) null;
            this.a((wj) null, (byte) 109, true, false);
        }
        for (var3 = 0; 16 > var3; var3++) {
            this.field_D[var3] = this.field_F[var3];
        }
        int var6 = 0;
        var3 = var6;
        while (-17 < (var6 ^ -1)) {
            this.field_M[var6] = eg.a(-128, this.field_F[var6]);
            var6++;
        }
    }

    final synchronized int a() {
        return 0;
    }

    final void a(lf param0, int param1, boolean param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        try {
          L0: {
            L1: {
              L2: {
                var4_int = param0.field_s.field_l.length;
                if (!param2) {
                  break L2;
                } else {
                  if (param0.field_s.field_j) {
                    var6 = -param0.field_s.field_i + (var4_int + var4_int);
                    var5 = (int)((long)this.field_O[param0.field_z] * (long)var6 >> -379715962);
                    var4_int = var4_int << 8;
                    if (var4_int <= var5) {
                      var5 = -1 + var4_int - (-var4_int - -var5);
                      param0.field_E.a(true);
                      break L1;
                    } else {
                      break L1;
                    }
                  } else {
                    break L2;
                  }
                }
              }
              var5 = (int)((long)var4_int * (long)this.field_O[param0.field_z] >> 1407356230);
              break L1;
            }
            param0.field_E.d(var5);
            var6 = -124 % ((param1 - -79) / 43);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var4 = decompiledCaughtException;
            stackOut_9_0 = (RuntimeException) (var4);
            stackOut_9_1 = new StringBuilder().append("rj.KA(");
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param0 == null) {
              stackOut_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackOut_11_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L3;
            } else {
              stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackOut_10_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L3;
            }
          }
          throw sh.a((Throwable) ((Object) stackIn_12_0), stackIn_12_2 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final boolean b(int param0, lf param1) {
        RuntimeException var3 = null;
        int stackIn_8_0 = 0;
        int stackIn_11_0 = 0;
        int stackIn_13_0 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_12_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_7_0 = 0;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        try {
          L0: {
            if (null != param1.field_E) {
              if (param0 == 30296) {
                stackOut_12_0 = 0;
                stackIn_13_0 = stackOut_12_0;
                decompiledRegionSelector0 = 2;
                break L0;
              } else {
                stackOut_10_0 = 0;
                stackIn_11_0 = stackOut_10_0;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              if ((param1.field_k ^ -1) <= -1) {
                L1: {
                  param1.b(param0 + -57894);
                  if (-1 <= (param1.field_B ^ -1)) {
                    break L1;
                  } else {
                    if (param1 == this.field_x[param1.field_z][param1.field_B]) {
                      this.field_x[param1.field_z][param1.field_B] = null;
                      break L1;
                    } else {
                      break L1;
                    }
                  }
                }
                stackOut_7_0 = 1;
                stackIn_8_0 = stackOut_7_0;
                decompiledRegionSelector0 = 0;
                break L0;
              } else {
                return true;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_14_0 = (RuntimeException) (var3);
            stackOut_14_1 = new StringBuilder().append("rj.JA(").append(param0).append(',');
            stackIn_16_0 = stackOut_14_0;
            stackIn_16_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param1 == null) {
              stackOut_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackOut_16_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L2;
            } else {
              stackOut_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackOut_15_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackOut_15_2 = "{...}";
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              stackIn_17_2 = stackOut_15_2;
              break L2;
            }
          }
          throw sh.a((Throwable) ((Object) stackIn_17_0), stackIn_17_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_8_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_11_0 != 0;
          } else {
            return stackIn_13_0 != 0;
          }
        }
    }

    private final void c(int param0, int param1, int param2, int param3) {
        if (param0 != 11664) {
            lf var6 = (lf) null;
            this.a((lf) null, -31, true);
        }
    }

    final synchronized void c(int param0) {
        this.a(true, (byte) -71);
        if (param0 != 28013) {
            int[] var3 = (int[]) null;
            this.a((int[]) null, 52, -103);
        }
    }

    final synchronized boolean c(byte param0) {
        if (param0 != -34) {
            this.field_t = 28L;
        }
        return this.field_w.a();
    }

    final synchronized sp d() {
        return null;
    }

    private final synchronized void a(wj param0, byte param1, boolean param2, boolean param3) {
        boolean discarded$2 = false;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        ka var8 = null;
        Object stackIn_2_0 = null;
        Object stackIn_3_0 = null;
        Object stackIn_4_0 = null;
        int stackIn_4_1 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_1_0 = null;
        Object stackOut_3_0 = null;
        int stackOut_3_1 = 0;
        Object stackOut_2_0 = null;
        int stackOut_2_1 = 0;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        var7 = ZombieDawn.field_J;
        try {
          L0: {
            L1: {
              this.a(param2, (byte) -71);
              this.field_w.a(param0.field_i);
              stackOut_1_0 = this;
              stackIn_3_0 = stackOut_1_0;
              stackIn_2_0 = stackOut_1_0;
              if (!param3) {
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
            ((rj) (this)).field_s = stackIn_4_1 != 0;
            this.field_K = 0L;
            var5_int = this.field_w.d();
            var6 = 0;
            L2: while (true) {
              if (var5_int <= var6) {
                L3: {
                  this.field_N = this.field_w.b();
                  this.field_v = this.field_w.field_f[this.field_N];
                  this.field_t = this.field_w.a(this.field_v);
                  if (param1 < -122) {
                    break L3;
                  } else {
                    var8 = (ka) null;
                    discarded$2 = this.a((wj) null, (byte) -81, (dj) null, -58, (ka) null);
                    break L3;
                  }
                }
                break L0;
              } else {
                this.field_w.f(var6);
                this.field_w.c(var6);
                this.field_w.b(var6);
                var6++;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var5 = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) (var5);
            stackOut_10_1 = new StringBuilder().append("rj.E(");
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param0 == null) {
              stackOut_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackOut_12_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L4;
            } else {
              stackOut_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackOut_11_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L4;
            }
          }
          throw sh.a((Throwable) ((Object) stackIn_13_0), stackIn_13_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final synchronized boolean a(wj param0, byte param1, dj param2, int param3, ka param4) {
        RuntimeException var6 = null;
        int var6_int = 0;
        Object var7 = null;
        int var8 = 0;
        bh var9 = null;
        int var10 = 0;
        ma var11 = null;
        int var12 = 0;
        int stackIn_19_0 = 0;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_26_2 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_29_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_18_0 = 0;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        String stackOut_25_2 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        String stackOut_28_2 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        String stackOut_27_2 = null;
        var12 = ZombieDawn.field_J;
        try {
          L0: {
            L1: {
              param0.b();
              var8 = 121 / ((param1 - -78) / 32);
              var6_int = 1;
              var7 = null;
              if ((param3 ^ -1) < -1) {
                var7 = new int[]{param3};
                break L1;
              } else {
                break L1;
              }
            }
            var9 = (bh) ((Object) param0.field_h.a((byte) -113));
            L2: while (true) {
              if (var9 == null) {
                L3: {
                  if (var6_int != 0) {
                    param0.a();
                    break L3;
                  } else {
                    break L3;
                  }
                }
                stackOut_18_0 = var6_int;
                stackIn_19_0 = stackOut_18_0;
                break L0;
              } else {
                L4: {
                  var10 = (int)var9.field_f;
                  var11 = (ma) ((Object) this.field_A.a((long)var10, 101));
                  if (var11 != null) {
                    break L4;
                  } else {
                    var11 = vk.a(param2, var10, 0);
                    if (var11 != null) {
                      this.field_A.a(-106, (long)var10, var11);
                      break L4;
                    } else {
                      var6_int = 0;
                      break L4;
                    }
                  }
                }
                L5: {
                  if (var11 == null) {
                    break L5;
                  } else {
                    if (!var11.a(true, (int[]) (var7), param4, var9.field_k)) {
                      var6_int = 0;
                      break L5;
                    } else {
                      break L5;
                    }
                  }
                }
                var9 = (bh) ((Object) param0.field_h.b((byte) 99));
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var6 = decompiledCaughtException;
            stackOut_20_0 = (RuntimeException) (var6);
            stackOut_20_1 = new StringBuilder().append("rj.FA(");
            stackIn_22_0 = stackOut_20_0;
            stackIn_22_1 = stackOut_20_1;
            stackIn_21_0 = stackOut_20_0;
            stackIn_21_1 = stackOut_20_1;
            if (param0 == null) {
              stackOut_22_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackOut_22_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackOut_22_2 = "null";
              stackIn_23_0 = stackOut_22_0;
              stackIn_23_1 = stackOut_22_1;
              stackIn_23_2 = stackOut_22_2;
              break L6;
            } else {
              stackOut_21_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackOut_21_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackOut_21_2 = "{...}";
              stackIn_23_0 = stackOut_21_0;
              stackIn_23_1 = stackOut_21_1;
              stackIn_23_2 = stackOut_21_2;
              break L6;
            }
          }
          L7: {
            stackOut_23_0 = (RuntimeException) ((Object) stackIn_23_0);
            stackOut_23_1 = ((StringBuilder) (Object) stackIn_23_1).append(stackIn_23_2).append(',').append(param1).append(',');
            stackIn_25_0 = stackOut_23_0;
            stackIn_25_1 = stackOut_23_1;
            stackIn_24_0 = stackOut_23_0;
            stackIn_24_1 = stackOut_23_1;
            if (param2 == null) {
              stackOut_25_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackOut_25_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackOut_25_2 = "null";
              stackIn_26_0 = stackOut_25_0;
              stackIn_26_1 = stackOut_25_1;
              stackIn_26_2 = stackOut_25_2;
              break L7;
            } else {
              stackOut_24_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackOut_24_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackOut_24_2 = "{...}";
              stackIn_26_0 = stackOut_24_0;
              stackIn_26_1 = stackOut_24_1;
              stackIn_26_2 = stackOut_24_2;
              break L7;
            }
          }
          L8: {
            stackOut_26_0 = (RuntimeException) ((Object) stackIn_26_0);
            stackOut_26_1 = ((StringBuilder) (Object) stackIn_26_1).append(stackIn_26_2).append(',').append(param3).append(',');
            stackIn_28_0 = stackOut_26_0;
            stackIn_28_1 = stackOut_26_1;
            stackIn_27_0 = stackOut_26_0;
            stackIn_27_1 = stackOut_26_1;
            if (param4 == null) {
              stackOut_28_0 = (RuntimeException) ((Object) stackIn_28_0);
              stackOut_28_1 = (StringBuilder) ((Object) stackIn_28_1);
              stackOut_28_2 = "null";
              stackIn_29_0 = stackOut_28_0;
              stackIn_29_1 = stackOut_28_1;
              stackIn_29_2 = stackOut_28_2;
              break L8;
            } else {
              stackOut_27_0 = (RuntimeException) ((Object) stackIn_27_0);
              stackOut_27_1 = (StringBuilder) ((Object) stackIn_27_1);
              stackOut_27_2 = "{...}";
              stackIn_29_0 = stackOut_27_0;
              stackIn_29_1 = stackOut_27_1;
              stackIn_29_2 = stackOut_27_2;
              break L8;
            }
          }
          throw sh.a((Throwable) ((Object) stackIn_29_0), stackIn_29_2 + ')');
        }
        return stackIn_19_0 != 0;
    }

    private final void a(boolean param0) {
        int var2 = 0;
        int var3 = 0;
        long var4 = 0L;
        int var6 = 0;
        int var7 = 0;
        L0: {
          var7 = ZombieDawn.field_J;
          var2 = this.field_N;
          if (!param0) {
            break L0;
          } else {
            this.field_H = (int[]) null;
            break L0;
          }
        }
        L1: {
          var3 = this.field_v;
          var4 = this.field_t;
          if (this.field_y == null) {
            break L1;
          } else {
            if (var3 == this.field_P) {
              this.a(this.field_y, (byte) -125, this.field_C, this.field_s);
              this.a(false);
              return;
            } else {
              break L1;
            }
          }
        }
        L2: while (true) {
          if (var3 != this.field_v) {
            L3: {
              this.field_t = var4;
              this.field_N = var2;
              this.field_v = var3;
              if (this.field_y == null) {
                break L3;
              } else {
                if (this.field_P < var3) {
                  this.field_N = -1;
                  this.field_v = this.field_P;
                  this.field_t = this.field_w.a(this.field_v);
                  break L3;
                } else {
                  break L3;
                }
              }
            }
            return;
          } else {
            L4: while (true) {
              L5: {
                if (var3 != this.field_w.field_f[var2]) {
                  break L5;
                } else {
                  this.field_w.f(var2);
                  var6 = this.field_w.d(var2);
                  if (-2 == (var6 ^ -1)) {
                    this.field_w.c();
                    this.field_w.b(var2);
                    if (!this.field_w.f()) {
                      break L5;
                    } else {
                      if (this.field_y == null) {
                        L6: {
                          if (!this.field_s) {
                            break L6;
                          } else {
                            if (0 != var3) {
                              this.field_w.a(var4);
                              break L5;
                            } else {
                              break L6;
                            }
                          }
                        }
                        this.a(true, 256);
                        this.field_w.e();
                        return;
                      } else {
                        this.a((byte) -22, this.field_y, this.field_s);
                        this.a(false);
                        return;
                      }
                    }
                  } else {
                    L7: {
                      if (0 == (var6 & 128)) {
                        break L7;
                      } else {
                        this.a((byte) -80, var6);
                        break L7;
                      }
                    }
                    this.field_w.c(var2);
                    this.field_w.b(var2);
                    continue L4;
                  }
                }
              }
              var2 = this.field_w.b();
              var3 = this.field_w.field_f[var2];
              var4 = this.field_w.a(var3);
              continue L2;
            }
          }
        }
    }

    final static void d(int param0) {
        if (!(dl.a(false))) {
            return;
        }
        if (param0 > -101) {
            return;
        }
        ti.a(4, 90, false);
    }

    private final void d(int param0, int param1) {
        lf var3 = null;
        int var4 = 0;
        var4 = ZombieDawn.field_J;
        var3 = (lf) ((Object) this.field_J.field_s.b((byte) 26));
        L0: while (true) {
          if (var3 == null) {
            L1: {
              if (param0 == 0) {
                break L1;
              } else {
                this.a(7, true);
                break L1;
              }
            }
            return;
          } else {
            L2: {
              L3: {
                if (param1 < 0) {
                  break L3;
                } else {
                  if (param1 != var3.field_z) {
                    break L2;
                  } else {
                    break L3;
                  }
                }
              }
              if (-1 < (var3.field_k ^ -1)) {
                this.field_G[var3.field_z][var3.field_i] = null;
                var3.field_k = 0;
                break L2;
              } else {
                break L2;
              }
            }
            var3 = (lf) ((Object) this.field_J.field_s.a(false));
            continue L0;
          }
        }
    }

    private final void b(int param0, int param1, int param2, int param3) {
        lf var6 = null;
        int var7 = ZombieDawn.field_J;
        if (param1 < 108) {
            return;
        }
        lf var8 = this.field_G[param0][param2];
        if (var8 == null) {
            return;
        }
        this.field_G[param0][param2] = null;
        if ((2 & this.field_l[param0]) == 0) {
            var8.field_k = 0;
        } else {
            var6 = (lf) ((Object) this.field_J.field_s.b((byte) 26));
            while (var6 != null) {
                if (var8.field_z == var6.field_z) {
                    if (0 > var6.field_k) {
                        if (var6 != var8) {
                            var8.field_k = 0;
                            break;
                        }
                    }
                }
                var6 = (lf) ((Object) this.field_J.field_s.a(false));
            }
        }
    }

    final synchronized void a(int[] param0, int param1, int param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        long var5 = 0L;
        int var7 = 0;
        int var8 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        var8 = ZombieDawn.field_J;
        try {
          L0: {
            L1: {
              L2: {
                if (!this.field_w.a()) {
                  break L2;
                } else {
                  var4_int = this.field_w.field_b * this.field_m / qf.field_p;
                  L3: while (true) {
                    var5 = (long)param2 * (long)var4_int + this.field_K;
                    if (-1L >= (this.field_t - var5 ^ -1L)) {
                      this.field_K = var5;
                      break L2;
                    } else {
                      var7 = (int)((-1L + ((long)var4_int + (-this.field_K + this.field_t))) / (long)var4_int);
                      this.field_K = this.field_K + (long)var4_int * (long)var7;
                      this.field_J.a(param0, param1, var7);
                      param1 = param1 + var7;
                      this.a(false);
                      param2 = param2 - var7;
                      if (this.field_w.a()) {
                        continue L3;
                      } else {
                        this.field_J.a(param0, param1, param2);
                        break L1;
                      }
                    }
                  }
                }
              }
              this.field_J.a(param0, param1, param2);
              break L1;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var4 = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) (var4);
            stackOut_10_1 = new StringBuilder().append("rj.J(");
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param0 == null) {
              stackOut_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackOut_12_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L4;
            } else {
              stackOut_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackOut_11_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L4;
            }
          }
          throw sh.a((Throwable) ((Object) stackIn_13_0), stackIn_13_2 + ',' + param1 + ',' + param2 + ')');
        }
    }

    private final void b(int param0, int param1, int param2) {
        if (param2 >= -51) {
            this.a(38, (byte) 112, 58);
        }
    }

    private final void b(int param0, boolean param1, int param2) {
        this.field_F[param0] = param2;
        this.field_M[param0] = eg.a(-128, param2);
        this.a(0, param0, param2);
        if (param1) {
            this.field_F = (int[]) null;
        }
    }

    private final int a(lf param0, boolean param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int stackIn_2_0 = 0;
        int stackIn_5_0 = 0;
        int stackIn_7_0 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_6_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_1_0 = 0;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        try {
          L0: {
            if (param1) {
              var3_int = this.field_q[param0.field_z];
              if (8192 > var3_int) {
                stackOut_6_0 = var3_int * param0.field_x - -32 >> -1840596762;
                stackIn_7_0 = stackOut_6_0;
                decompiledRegionSelector0 = 2;
                break L0;
              } else {
                stackOut_4_0 = 16384 + -((-param0.field_x + 128) * (16384 - var3_int) + 32 >> -152720954);
                stackIn_5_0 = stackOut_4_0;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              stackOut_1_0 = 28;
              stackIn_2_0 = stackOut_1_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) (var3);
            stackOut_8_1 = new StringBuilder().append("rj.GA(");
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param0 == null) {
              stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackOut_10_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L1;
            } else {
              stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackOut_9_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L1;
            }
          }
          throw sh.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_5_0;
          } else {
            return stackIn_7_0;
          }
        }
    }

    final synchronized void a(int param0, boolean param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        L0: {
          var5 = ZombieDawn.field_J;
          if (param1) {
            break L0;
          } else {
            this.field_n = (int[]) null;
            break L0;
          }
        }
        L1: {
          if (-1 >= (param2 ^ -1)) {
            this.field_z[param2] = param0;
            break L1;
          } else {
            var4 = 0;
            L2: while (true) {
              if ((var4 ^ -1) <= -17) {
                break L1;
              } else {
                this.field_z[var4] = param0;
                var4++;
                continue L2;
              }
            }
          }
        }
    }

    private final void a(int param0, int param1) {
        lf var3 = null;
        int var4 = 0;
        L0: {
          var4 = ZombieDawn.field_J;
          if (param0 == 0) {
            break L0;
          } else {
            this.b(122, 44, 94, 110);
            break L0;
          }
        }
        L1: {
          if ((2 & this.field_l[param1]) == 0) {
            break L1;
          } else {
            var3 = (lf) ((Object) this.field_J.field_s.b((byte) 26));
            L2: while (true) {
              if (var3 == null) {
                break L1;
              } else {
                L3: {
                  if (var3.field_z != param1) {
                    break L3;
                  } else {
                    if (null == this.field_G[param1][var3.field_i]) {
                      if (var3.field_k < 0) {
                        var3.field_k = 0;
                        break L3;
                      } else {
                        break L3;
                      }
                    } else {
                      var3 = (lf) ((Object) this.field_J.field_s.a(false));
                      continue L2;
                    }
                  }
                }
                var3 = (lf) ((Object) this.field_J.field_s.a(false));
                continue L2;
              }
            }
          }
        }
    }

    final synchronized void a(byte param0, wj param1, boolean param2) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        try {
          L0: {
            L1: {
              this.a(param1, (byte) -126, true, param2);
              if (param0 == -22) {
                break L1;
              } else {
                this.a((byte) -8, 95);
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) (runtimeException);
            stackOut_3_1 = new StringBuilder().append("rj.N(").append(param0).append(',');
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param1 == null) {
              stackOut_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackOut_5_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L2;
            } else {
              stackOut_4_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackOut_4_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackOut_4_2 = "{...}";
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_6_2 = stackOut_4_2;
              break L2;
            }
          }
          throw sh.a((Throwable) ((Object) stackIn_6_0), stackIn_6_2 + ',' + param2 + ')');
        }
    }

    private final void a(byte param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        var8 = ZombieDawn.field_J;
        var3 = param1 & 240;
        if ((var3 ^ -1) != -129) {
          if (-145 == (var3 ^ -1)) {
            var4 = param1 & 15;
            var5 = (param1 & 32553) >> -931388408;
            var6 = param1 >> 1306116976 & 127;
            if ((var6 ^ -1) < -1) {
              this.a(var6, 0, var5, var4);
              return;
            } else {
              this.b(var4, 110, var5, 64);
              return;
            }
          } else {
            if (var3 != 160) {
              if (var3 != 176) {
                if (192 != var3) {
                  if (208 == var3) {
                    var4 = param1 & 15;
                    var5 = 127 & param1 >> 559831912;
                    this.b(var4, var5, -124);
                    return;
                  } else {
                    if (224 != var3) {
                      var3 = param1 & 255;
                      if ((var3 ^ -1) != -256) {
                        var4 = 28 / ((58 - param0) / 50);
                        return;
                      } else {
                        this.a(true, 256);
                        return;
                      }
                    } else {
                      var4 = param1 & 15;
                      var5 = ((8323514 & param1) >> -503147191) - -(127 & param1 >> -927146392);
                      this.b(var4, (byte) -128, var5);
                      return;
                    }
                  }
                } else {
                  var4 = param1 & 15;
                  var5 = (32557 & param1) >> -891689528;
                  this.a(0, var4, var5 + this.field_M[var4]);
                  return;
                }
              } else {
                L0: {
                  var4 = 15 & param1;
                  var5 = 127 & param1 >> -1813894776;
                  var6 = 127 & param1 >> -1564265648;
                  if (0 == var5) {
                    this.field_M[var4] = eg.a(this.field_M[var4], -2080769) + (var6 << 1890319982);
                    break L0;
                  } else {
                    break L0;
                  }
                }
                L1: {
                  if (-33 == (var5 ^ -1)) {
                    this.field_M[var4] = (var6 << 987693031) + eg.a(this.field_M[var4], -16257);
                    break L1;
                  } else {
                    break L1;
                  }
                }
                L2: {
                  if ((var5 ^ -1) != -2) {
                    break L2;
                  } else {
                    this.field_n[var4] = eg.a(-16257, this.field_n[var4]) + (var6 << 1713452487);
                    break L2;
                  }
                }
                L3: {
                  if (var5 != 33) {
                    break L3;
                  } else {
                    this.field_n[var4] = eg.a(-128, this.field_n[var4]) + var6;
                    break L3;
                  }
                }
                L4: {
                  if (var5 == 5) {
                    this.field_H[var4] = (var6 << -1628296121) + eg.a(-16257, this.field_H[var4]);
                    break L4;
                  } else {
                    break L4;
                  }
                }
                L5: {
                  if (-38 == (var5 ^ -1)) {
                    this.field_H[var4] = eg.a(this.field_H[var4], -128) + var6;
                    break L5;
                  } else {
                    break L5;
                  }
                }
                L6: {
                  if (-8 != (var5 ^ -1)) {
                    break L6;
                  } else {
                    this.field_I[var4] = (var6 << -1131444121) + eg.a(-16257, this.field_I[var4]);
                    break L6;
                  }
                }
                L7: {
                  if ((var5 ^ -1) != -40) {
                    break L7;
                  } else {
                    this.field_I[var4] = eg.a(-128, this.field_I[var4]) - -var6;
                    break L7;
                  }
                }
                L8: {
                  if (-11 != (var5 ^ -1)) {
                    break L8;
                  } else {
                    this.field_q[var4] = (var6 << 1041329863) + eg.a(this.field_q[var4], -16257);
                    break L8;
                  }
                }
                L9: {
                  if (var5 == 42) {
                    this.field_q[var4] = eg.a(this.field_q[var4], -128) - -var6;
                    break L9;
                  } else {
                    break L9;
                  }
                }
                L10: {
                  if ((var5 ^ -1) != -12) {
                    break L10;
                  } else {
                    this.field_B[var4] = eg.a(this.field_B[var4], -16257) + (var6 << -461645849);
                    break L10;
                  }
                }
                L11: {
                  if (var5 == 43) {
                    this.field_B[var4] = var6 + eg.a(-128, this.field_B[var4]);
                    break L11;
                  } else {
                    break L11;
                  }
                }
                L12: {
                  if (var5 != 64) {
                    break L12;
                  } else {
                    if (var6 < 64) {
                      this.field_l[var4] = eg.a(this.field_l[var4], -2);
                      break L12;
                    } else {
                      this.field_l[var4] = hi.a(this.field_l[var4], 1);
                      break L12;
                    }
                  }
                }
                L13: {
                  if (var5 != 65) {
                    break L13;
                  } else {
                    if (-65 < (var6 ^ -1)) {
                      this.a(0, var4);
                      this.field_l[var4] = eg.a(this.field_l[var4], -3);
                      break L13;
                    } else {
                      this.field_l[var4] = hi.a(this.field_l[var4], 2);
                      break L13;
                    }
                  }
                }
                L14: {
                  if (-100 != (var5 ^ -1)) {
                    break L14;
                  } else {
                    this.field_u[var4] = eg.a(127, this.field_u[var4]) - -(var6 << 463574023);
                    break L14;
                  }
                }
                L15: {
                  if (98 == var5) {
                    this.field_u[var4] = eg.a(16256, this.field_u[var4]) - -var6;
                    break L15;
                  } else {
                    break L15;
                  }
                }
                L16: {
                  if (-102 != (var5 ^ -1)) {
                    break L16;
                  } else {
                    this.field_u[var4] = 16384 - (-eg.a(this.field_u[var4], 127) + -(var6 << -1720646681));
                    break L16;
                  }
                }
                L17: {
                  if ((var5 ^ -1) == -101) {
                    this.field_u[var4] = var6 + eg.a(this.field_u[var4], 16256) + 16384;
                    break L17;
                  } else {
                    break L17;
                  }
                }
                L18: {
                  if ((var5 ^ -1) == -121) {
                    this.b((byte) -128, var4);
                    break L18;
                  } else {
                    break L18;
                  }
                }
                L19: {
                  if (121 == var5) {
                    this.b(var4, 8192);
                    break L19;
                  } else {
                    break L19;
                  }
                }
                L20: {
                  if ((var5 ^ -1) != -124) {
                    break L20;
                  } else {
                    this.d(0, var4);
                    break L20;
                  }
                }
                L21: {
                  if ((var5 ^ -1) == -7) {
                    var7 = this.field_u[var4];
                    if (-16385 != (var7 ^ -1)) {
                      break L21;
                    } else {
                      this.field_Q[var4] = eg.a(-16257, this.field_Q[var4]) - -(var6 << 1134049671);
                      break L21;
                    }
                  } else {
                    break L21;
                  }
                }
                L22: {
                  if (-39 != (var5 ^ -1)) {
                    break L22;
                  } else {
                    var7 = this.field_u[var4];
                    if (var7 != 16384) {
                      break L22;
                    } else {
                      this.field_Q[var4] = var6 + eg.a(this.field_Q[var4], -128);
                      break L22;
                    }
                  }
                }
                L23: {
                  if (var5 == 16) {
                    this.field_O[var4] = (var6 << 1161470279) + eg.a(-16257, this.field_O[var4]);
                    break L23;
                  } else {
                    break L23;
                  }
                }
                L24: {
                  if (48 != var5) {
                    break L24;
                  } else {
                    this.field_O[var4] = eg.a(this.field_O[var4], -128) - -var6;
                    break L24;
                  }
                }
                L25: {
                  if (-82 != (var5 ^ -1)) {
                    break L25;
                  } else {
                    if (var6 < 64) {
                      this.c(95, var4);
                      this.field_l[var4] = eg.a(this.field_l[var4], -5);
                      break L25;
                    } else {
                      this.field_l[var4] = hi.a(this.field_l[var4], 4);
                      break L25;
                    }
                  }
                }
                L26: {
                  if (var5 != 17) {
                    break L26;
                  } else {
                    this.a(var4, (this.field_p[var4] & -16257) + (var6 << -1789718681), (byte) 119);
                    break L26;
                  }
                }
                L27: {
                  if (-50 == (var5 ^ -1)) {
                    this.a(var4, var6 + (-128 & this.field_p[var4]), (byte) 88);
                    break L27;
                  } else {
                    break L27;
                  }
                }
                return;
              }
            } else {
              var4 = 15 & param1;
              var5 = (32580 & param1) >> -1701763448;
              var6 = (param1 & 8354293) >> -144552976;
              this.c(11664, var4, var5, var6);
              return;
            }
          }
        } else {
          var4 = 15 & param1;
          var5 = (32713 & param1) >> 524025768;
          var6 = (8352632 & param1) >> 473847792;
          this.b(var4, 125, var5, var6);
          return;
        }
    }

    final boolean a(int param0, int param1, lf param2, int[] param3, int param4) {
        RuntimeException var6 = null;
        int var6_int = 0;
        nf var7 = null;
        int var8 = 0;
        double var9 = 0.0;
        int var11 = 0;
        int stackIn_12_0 = 0;
        int stackIn_64_0 = 0;
        int stackIn_66_0 = 0;
        RuntimeException stackIn_68_0 = null;
        StringBuilder stackIn_68_1 = null;
        RuntimeException stackIn_69_0 = null;
        StringBuilder stackIn_69_1 = null;
        RuntimeException stackIn_70_0 = null;
        StringBuilder stackIn_70_1 = null;
        String stackIn_70_2 = null;
        RuntimeException stackIn_71_0 = null;
        StringBuilder stackIn_71_1 = null;
        RuntimeException stackIn_72_0 = null;
        StringBuilder stackIn_72_1 = null;
        RuntimeException stackIn_73_0 = null;
        StringBuilder stackIn_73_1 = null;
        String stackIn_73_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_11_0 = 0;
        int stackOut_65_0 = 0;
        int stackOut_63_0 = 0;
        RuntimeException stackOut_67_0 = null;
        StringBuilder stackOut_67_1 = null;
        RuntimeException stackOut_69_0 = null;
        StringBuilder stackOut_69_1 = null;
        String stackOut_69_2 = null;
        RuntimeException stackOut_68_0 = null;
        StringBuilder stackOut_68_1 = null;
        String stackOut_68_2 = null;
        RuntimeException stackOut_70_0 = null;
        StringBuilder stackOut_70_1 = null;
        RuntimeException stackOut_72_0 = null;
        StringBuilder stackOut_72_1 = null;
        String stackOut_72_2 = null;
        RuntimeException stackOut_71_0 = null;
        StringBuilder stackOut_71_1 = null;
        String stackOut_71_2 = null;
        var11 = ZombieDawn.field_J;
        try {
          L0: {
            L1: {
              param2.field_r = qf.field_p / 100;
              if (param0 == -32464) {
                break L1;
              } else {
                this.field_G = (lf[][]) null;
                break L1;
              }
            }
            L2: {
              if (-1 < (param2.field_k ^ -1)) {
                break L2;
              } else {
                L3: {
                  if (param2.field_E == null) {
                    break L3;
                  } else {
                    if (!param2.field_E.l()) {
                      break L2;
                    } else {
                      break L3;
                    }
                  }
                }
                L4: {
                  param2.c((byte) 125);
                  param2.b(-27598);
                  if (-1 <= (param2.field_B ^ -1)) {
                    break L4;
                  } else {
                    if (this.field_x[param2.field_z][param2.field_B] == param2) {
                      this.field_x[param2.field_z][param2.field_B] = null;
                      break L4;
                    } else {
                      return true;
                    }
                  }
                }
                stackOut_11_0 = 1;
                stackIn_12_0 = stackOut_11_0;
                decompiledRegionSelector0 = 0;
                break L0;
              }
            }
            L5: {
              var6_int = param2.field_j;
              if (-1 > (var6_int ^ -1)) {
                L6: {
                  var6_int = var6_int - (int)(Math.pow(2.0, 0.0004921259842519685 * (double)this.field_H[param2.field_z]) * 16.0 + 0.5);
                  if (0 <= var6_int) {
                    break L6;
                  } else {
                    var6_int = 0;
                    break L6;
                  }
                }
                param2.field_j = var6_int;
                break L5;
              } else {
                break L5;
              }
            }
            L7: {
              param2.field_E.f(this.a(param0 + 12299, param2));
              var7 = param2.field_t;
              param2.field_o = param2.field_o + 1;
              var8 = 0;
              param2.field_w = param2.field_w + var7.field_a;
              var9 = 0.000005086263020833333 * (double)((param2.field_i - 60 << -1413567736) - -(param2.field_A * param2.field_j >> -522595188));
              if (var7.field_j > 0) {
                L8: {
                  if (0 < var7.field_c) {
                    param2.field_p = param2.field_p + (int)(Math.pow(2.0, (double)var7.field_c * var9) * 128.0 + 0.5);
                    break L8;
                  } else {
                    param2.field_p = param2.field_p + 128;
                    break L8;
                  }
                }
                if ((var7.field_j * param2.field_p ^ -1) > -819201) {
                  break L7;
                } else {
                  var8 = 1;
                  break L7;
                }
              } else {
                break L7;
              }
            }
            L9: {
              if (null == var7.field_h) {
                break L9;
              } else {
                L10: {
                  if (0 < var7.field_i) {
                    param2.field_l = param2.field_l + (int)(Math.pow(2.0, var9 * (double)var7.field_i) * 128.0 + 0.5);
                    break L10;
                  } else {
                    param2.field_l = param2.field_l + 128;
                    break L10;
                  }
                }
                L11: while (true) {
                  L12: {
                    if (var7.field_h.length - 2 <= param2.field_y) {
                      break L12;
                    } else {
                      if ((var7.field_h[param2.field_y - -2] & 255) << -737909368 >= param2.field_l) {
                        break L12;
                      } else {
                        param2.field_y = param2.field_y + 2;
                        continue L11;
                      }
                    }
                  }
                  if (param2.field_y != var7.field_h.length - 2) {
                    break L9;
                  } else {
                    if (var7.field_h[1 + param2.field_y] == 0) {
                      var8 = 1;
                      break L9;
                    } else {
                      break L9;
                    }
                  }
                }
              }
            }
            L13: {
              if (param2.field_k < 0) {
                break L13;
              } else {
                if (null == var7.field_b) {
                  break L13;
                } else {
                  if ((this.field_l[param2.field_z] & 1) == 0) {
                    L14: {
                      if ((param2.field_B ^ -1) > -1) {
                        break L14;
                      } else {
                        if (this.field_x[param2.field_z][param2.field_B] == param2) {
                          break L13;
                        } else {
                          break L14;
                        }
                      }
                    }
                    L15: {
                      if (-1 > (var7.field_e ^ -1)) {
                        param2.field_k = param2.field_k + (int)(0.5 + 128.0 * Math.pow(2.0, (double)var7.field_e * var9));
                        break L15;
                      } else {
                        param2.field_k = param2.field_k + 128;
                        break L15;
                      }
                    }
                    L16: while (true) {
                      L17: {
                        if (param2.field_q >= var7.field_b.length + -2) {
                          break L17;
                        } else {
                          if (param2.field_k <= (var7.field_b[param2.field_q - -2] << 1682596488 & 65280)) {
                            break L17;
                          } else {
                            param2.field_q = param2.field_q + 2;
                            continue L16;
                          }
                        }
                      }
                      if (-2 + var7.field_b.length == param2.field_q) {
                        var8 = 1;
                        break L13;
                      } else {
                        break L13;
                      }
                    }
                  } else {
                    break L13;
                  }
                }
              }
            }
            if (var8 == 0) {
              param2.field_E.a(param2.field_r, this.a(param2, (byte) -111), this.a(param2, true));
              stackOut_65_0 = 0;
              stackIn_66_0 = stackOut_65_0;
              decompiledRegionSelector0 = 2;
              break L0;
            } else {
              L18: {
                param2.field_E.c(param2.field_r);
                if (param3 != null) {
                  param2.field_E.a(param3, param1, param4);
                  break L18;
                } else {
                  param2.field_E.a(param4);
                  break L18;
                }
              }
              L19: {
                if (param2.field_E.f()) {
                  this.field_J.field_m.b(param2.field_E);
                  break L19;
                } else {
                  break L19;
                }
              }
              L20: {
                param2.c((byte) 123);
                if (-1 < (param2.field_k ^ -1)) {
                  break L20;
                } else {
                  param2.b(-27598);
                  if (param2.field_B <= 0) {
                    break L20;
                  } else {
                    if (this.field_x[param2.field_z][param2.field_B] != param2) {
                      break L20;
                    } else {
                      this.field_x[param2.field_z][param2.field_B] = null;
                      break L20;
                    }
                  }
                }
              }
              stackOut_63_0 = 1;
              stackIn_64_0 = stackOut_63_0;
              decompiledRegionSelector0 = 1;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L21: {
            var6 = decompiledCaughtException;
            stackOut_67_0 = (RuntimeException) (var6);
            stackOut_67_1 = new StringBuilder().append("rj.A(").append(param0).append(',').append(param1).append(',');
            stackIn_69_0 = stackOut_67_0;
            stackIn_69_1 = stackOut_67_1;
            stackIn_68_0 = stackOut_67_0;
            stackIn_68_1 = stackOut_67_1;
            if (param2 == null) {
              stackOut_69_0 = (RuntimeException) ((Object) stackIn_69_0);
              stackOut_69_1 = (StringBuilder) ((Object) stackIn_69_1);
              stackOut_69_2 = "null";
              stackIn_70_0 = stackOut_69_0;
              stackIn_70_1 = stackOut_69_1;
              stackIn_70_2 = stackOut_69_2;
              break L21;
            } else {
              stackOut_68_0 = (RuntimeException) ((Object) stackIn_68_0);
              stackOut_68_1 = (StringBuilder) ((Object) stackIn_68_1);
              stackOut_68_2 = "{...}";
              stackIn_70_0 = stackOut_68_0;
              stackIn_70_1 = stackOut_68_1;
              stackIn_70_2 = stackOut_68_2;
              break L21;
            }
          }
          L22: {
            stackOut_70_0 = (RuntimeException) ((Object) stackIn_70_0);
            stackOut_70_1 = ((StringBuilder) (Object) stackIn_70_1).append(stackIn_70_2).append(',');
            stackIn_72_0 = stackOut_70_0;
            stackIn_72_1 = stackOut_70_1;
            stackIn_71_0 = stackOut_70_0;
            stackIn_71_1 = stackOut_70_1;
            if (param3 == null) {
              stackOut_72_0 = (RuntimeException) ((Object) stackIn_72_0);
              stackOut_72_1 = (StringBuilder) ((Object) stackIn_72_1);
              stackOut_72_2 = "null";
              stackIn_73_0 = stackOut_72_0;
              stackIn_73_1 = stackOut_72_1;
              stackIn_73_2 = stackOut_72_2;
              break L22;
            } else {
              stackOut_71_0 = (RuntimeException) ((Object) stackIn_71_0);
              stackOut_71_1 = (StringBuilder) ((Object) stackIn_71_1);
              stackOut_71_2 = "{...}";
              stackIn_73_0 = stackOut_71_0;
              stackIn_73_1 = stackOut_71_1;
              stackIn_73_2 = stackOut_71_2;
              break L22;
            }
          }
          throw sh.a((Throwable) ((Object) stackIn_73_0), stackIn_73_2 + ',' + param4 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_12_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_64_0 != 0;
          } else {
            return stackIn_66_0 != 0;
          }
        }
    }

    private final int a(int param0, lf param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        nf var4 = null;
        int var5 = 0;
        int var6 = 0;
        double var7 = 0.0;
        int stackIn_2_0 = 0;
        int stackIn_14_0 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_13_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_1_0 = 0;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        try {
          L0: {
            var3_int = (param1.field_j * param1.field_A >> -1388421748) + param1.field_C;
            if (param0 == -20165) {
              L1: {
                var3_int = var3_int + ((this.field_L[param1.field_z] + -8192) * this.field_Q[param1.field_z] >> -752114804);
                var4 = param1.field_t;
                if ((var4.field_a ^ -1) >= -1) {
                  break L1;
                } else {
                  L2: {
                    if (-1 > (var4.field_f ^ -1)) {
                      break L2;
                    } else {
                      if (this.field_n[param1.field_z] <= 0) {
                        break L1;
                      } else {
                        break L2;
                      }
                    }
                  }
                  L3: {
                    var5 = var4.field_f << -923059134;
                    var6 = var4.field_g << -1153758751;
                    if (var6 > param1.field_o) {
                      var5 = param1.field_o * var5 / var6;
                      break L3;
                    } else {
                      break L3;
                    }
                  }
                  var5 = var5 + (this.field_n[param1.field_z] >> -954782873);
                  var7 = Math.sin(0.01227184630308513 * (double)(param1.field_w & 511));
                  var3_int = var3_int + (int)(var7 * (double)var5);
                  break L1;
                }
              }
              L4: {
                var5 = (int)(0.5 + (double)(256 * param1.field_s.field_m) * Math.pow(2.0, (double)var3_int * 0.0003255208333333333) / (double)qf.field_p);
                if (1 > var5) {
                  stackOut_13_0 = 1;
                  stackIn_14_0 = stackOut_13_0;
                  break L4;
                } else {
                  stackOut_12_0 = var5;
                  stackIn_14_0 = stackOut_12_0;
                  break L4;
                }
              }
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackOut_1_0 = 76;
              stackIn_2_0 = stackOut_1_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var3 = decompiledCaughtException;
            stackOut_15_0 = (RuntimeException) (var3);
            stackOut_15_1 = new StringBuilder().append("rj.I(").append(param0).append(',');
            stackIn_17_0 = stackOut_15_0;
            stackIn_17_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param1 == null) {
              stackOut_17_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackOut_17_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackOut_17_2 = "null";
              stackIn_18_0 = stackOut_17_0;
              stackIn_18_1 = stackOut_17_1;
              stackIn_18_2 = stackOut_17_2;
              break L5;
            } else {
              stackOut_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackOut_16_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackOut_16_2 = "{...}";
              stackIn_18_0 = stackOut_16_0;
              stackIn_18_1 = stackOut_16_1;
              stackIn_18_2 = stackOut_16_2;
              break L5;
            }
          }
          throw sh.a((Throwable) ((Object) stackIn_18_0), stackIn_18_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_14_0;
        }
    }

    final synchronized void a(int param0, boolean param1) {
        this.field_m = param0;
        if (param1) {
            this.a(27, -63, 10);
        }
    }

    private final synchronized void a(boolean param0, byte param1) {
        this.field_w.e();
        this.field_y = null;
        if (param1 != -71) {
            this.c(64);
        }
        this.a(param0, 256);
    }

    final synchronized void a(int param0) {
        int var2 = 0;
        long var3 = 0L;
        int var5 = 0;
        int var6 = 0;
        L0: {
          var6 = ZombieDawn.field_J;
          if (!this.field_w.a()) {
            break L0;
          } else {
            var2 = this.field_m * this.field_w.field_b / qf.field_p;
            L1: while (true) {
              var3 = this.field_K + (long)param0 * (long)var2;
              if (-1L >= (this.field_t - var3 ^ -1L)) {
                this.field_K = var3;
                break L0;
              } else {
                var5 = (int)((-this.field_K + (this.field_t + ((long)var2 - 1L))) / (long)var2);
                this.field_K = this.field_K + (long)var2 * (long)var5;
                this.field_J.a(var5);
                param0 = param0 - var5;
                this.a(false);
                if (!this.field_w.a()) {
                  break L0;
                } else {
                  continue L1;
                }
              }
            }
          }
        }
        this.field_J.a(param0);
    }

    private final void b(int param0, int param1) {
        int var4 = 0;
        var4 = ZombieDawn.field_J;
        if (-1 >= (param0 ^ -1)) {
          this.field_I[param0] = 12800;
          this.field_q[param0] = 8192;
          this.field_B[param0] = 16383;
          this.field_L[param0] = 8192;
          this.field_n[param0] = 0;
          this.field_H[param0] = param1;
          this.a(0, param0);
          this.c(param1 + -8116, param0);
          this.field_l[param0] = 0;
          this.field_u[param0] = 32767;
          this.field_Q[param0] = 256;
          this.field_O[param0] = 0;
          this.a(param0, 8192, (byte) 117);
          return;
        } else {
          param0 = 0;
          L0: while (true) {
            if (-17 >= (param0 ^ -1)) {
              return;
            } else {
              this.b(param0, param1 ^ 0);
              param0++;
              continue L0;
            }
          }
        }
    }

    private final void a(int param0, int param1, int param2) {
        int var4 = 0;
        int var5 = ZombieDawn.field_J;
        if (param0 != 0) {
            this.d(59, 36);
        }
        if (!(this.field_D[param1] == param2)) {
            this.field_D[param1] = param2;
            for (var4 = 0; 128 > var4; var4++) {
                this.field_x[param1][var4] = null;
            }
        }
    }

    public rj() {
        this.field_B = new int[16];
        this.field_L = new int[16];
        this.field_O = new int[16];
        this.field_x = new lf[16][128];
        this.field_r = new int[16];
        this.field_q = new int[16];
        this.field_D = new int[16];
        this.field_m = 1000000;
        this.field_u = new int[16];
        this.field_z = new int[16];
        this.field_l = new int[16];
        this.field_Q = new int[16];
        this.field_p = new int[16];
        this.field_H = new int[16];
        this.field_F = new int[16];
        this.field_o = 256;
        this.field_I = new int[16];
        this.field_n = new int[16];
        this.field_G = new lf[16][128];
        this.field_M = new int[16];
        this.field_w = new jg();
        this.field_J = new ip((rj) (this));
        this.field_A = new dl(128);
        this.a(256, true, -1);
        this.a(true, 256);
    }

    static {
    }
}
