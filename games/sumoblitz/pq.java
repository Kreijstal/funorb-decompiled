/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pq extends pk {
    static String field_N;
    private int field_H;
    private wb field_M;
    boolean field_J;
    private wb[] field_z;
    private int field_K;
    int field_I;
    static float[] field_y;
    private int field_x;
    private int field_A;
    private wb field_G;
    private int field_B;
    private int field_D;
    private wb field_E;
    static ri[] field_F;

    public static void a(int param0) {
        field_y = null;
        field_N = null;
        if (param0 != -1346554936) {
            pq.a(-63);
            field_F = null;
            return;
        }
        field_F = null;
    }

    private final void g(int param0) {
        this.field_z = new wb[]{this.a(this.field_K, (byte) -110, this.field_x), this.a(this.field_D, (byte) -5, this.field_B)};
        this.field_M = this.f(-53);
        if (param0 != 880072001) {
          this.field_K = -125;
          this.field_G = this.field_M.a();
          this.field_E = new wb(this.field_p >> 880072001, this.field_p);
          return;
        } else {
          this.field_G = this.field_M.a();
          this.field_E = new wb(this.field_p >> 880072001, this.field_p);
          return;
        }
    }

    final void b(int param0, int param1, int param2) {
        this.field_K = param1;
        this.field_B = 8355711 & param0 >> 2057004641;
        this.field_D = (param1 & 16711422) >> 1975341985;
        if (param2 <= 16) {
          return;
        } else {
          this.field_x = param0;
          this.g(880072001);
          return;
        }
    }

    final void a(int param0, int param1, pk param2, int param3) {
        RuntimeException runtimeException = null;
        int var5_int = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        try {
          L0: {
            L1: {
              var5_int = 94 / ((param1 - -25) / 45);
              if (!this.field_J) {
                break L1;
              } else {
                this.field_A = this.field_A + 1;
                if (this.field_A > this.field_H * 2) {
                  this.field_A = this.field_A - this.field_H * 2;
                  break L1;
                } else {
                  return;
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) (runtimeException);
            stackOut_5_1 = new StringBuilder().append("pq.U(").append(param0).append(',').append(param1).append(',');
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param2 == null) {
              stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackOut_7_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L2;
            } else {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L2;
            }
          }
          throw qo.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ',' + param3 + ')');
        }
    }

    private final wb f(int param0) {
        int var2 = 0;
        wb var3 = null;
        int var4 = 0;
        int var5 = 0;
        double var6 = 0.0;
        int var8 = 0;
        int var9 = 0;
        int stackIn_3_0 = 0;
        int stackIn_5_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_15_0 = 0;
        int stackIn_20_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_16_0 = 0;
        int stackOut_19_0 = 0;
        int stackOut_2_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_9_0 = 0;
        var9 = Sumoblitz.field_L ? 1 : 0;
        var2 = this.field_p >> 2128594561;
        var3 = new wb(var2, this.field_p);
        jq.a(7161, var3);
        if (param0 > -23) {
          this.field_M = (wb) null;
          var4 = 0;
          L0: while (true) {
            stackOut_12_0 = this.field_p;
            stackIn_13_0 = stackOut_12_0;
            L1: while (true) {
              L2: {
                L3: {
                  if (stackIn_13_0 <= var4) {
                    break L3;
                  } else {
                    stackOut_14_0 = 0;
                    stackIn_20_0 = stackOut_14_0;
                    stackIn_15_0 = stackOut_14_0;
                    if (var9 != 0) {
                      break L2;
                    } else {
                      var5 = stackIn_15_0;
                      if (var5 >= var2) {
                        var4++;
                        if (var9 == 0) {
                          continue L0;
                        } else {
                          break L3;
                        }
                      } else {
                        var6 = (double)var5 * (double)var5 / (double)((-var4 + this.field_p) * var4);
                        var8 = 1;
                        stackOut_16_0 = (var6 < 1.0 ? -1 : (var6 == 1.0 ? 0 : 1));
                        stackIn_13_0 = stackOut_16_0;
                        continue L1;
                      }
                    }
                  }
                }
                stackOut_19_0 = -94;
                stackIn_20_0 = stackOut_19_0;
                break L2;
              }
              su.a((byte) stackIn_20_0);
              return var3;
            }
          }
        } else {
          var4 = 0;
          L4: while (true) {
            stackOut_2_0 = this.field_p;
            stackIn_3_0 = stackOut_2_0;
            L5: while (true) {
              L6: {
                L7: {
                  if (stackIn_3_0 <= var4) {
                    break L7;
                  } else {
                    stackOut_4_0 = 0;
                    stackIn_10_0 = stackOut_4_0;
                    stackIn_5_0 = stackOut_4_0;
                    if (var9 != 0) {
                      break L6;
                    } else {
                      var5 = stackIn_5_0;
                      if (var5 >= var2) {
                        var4++;
                        if (var9 == 0) {
                          continue L4;
                        } else {
                          break L7;
                        }
                      } else {
                        var6 = (double)var5 * (double)var5 / (double)((-var4 + this.field_p) * var4);
                        var8 = 1;
                        stackOut_6_0 = (var6 < 1.0 ? -1 : (var6 == 1.0 ? 0 : 1));
                        stackIn_3_0 = stackOut_6_0;
                        continue L5;
                      }
                    }
                  }
                }
                stackOut_9_0 = -94;
                stackIn_10_0 = stackOut_9_0;
                break L6;
              }
              su.a((byte) stackIn_10_0);
              return var3;
            }
          }
        }
    }

    private final wb a(int param0, byte param1, int param2) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        wb var14 = null;
        int stackIn_3_0 = 0;
        int stackIn_3_1 = 0;
        int stackIn_6_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_11_0 = 0;
        int stackIn_11_1 = 0;
        int stackOut_2_0 = 0;
        int stackOut_2_1 = 0;
        int stackOut_5_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_10_1 = 0;
        var13 = Sumoblitz.field_L ? 1 : 0;
        var14 = new wb(2 * this.field_H, this.field_p);
        jq.a(7161, var14);
        var5 = this.field_p >> 1197786337;
        var6 = 0;
        L0: while (true) {
          L1: {
            L2: {
              if (this.field_p <= var6) {
                break L2;
              } else {
                var7 = (var6 >> 801054401) * (-1 + this.field_H * 2) % (2 * this.field_H);
                var8 = param2 & 16711935;
                var9 = 65280 & param2;
                var10 = var6 + -var5;
                var11 = 128 - -(int)(Math.sqrt((double)(var5 * var5 - var10 * var10)) / (double)var5 * 128.0);
                stackOut_2_0 = var11;
                stackOut_2_1 = 256;
                stackIn_11_0 = stackOut_2_0;
                stackIn_11_1 = stackOut_2_1;
                stackIn_3_0 = stackOut_2_0;
                stackIn_3_1 = stackOut_2_1;
                if (var13 != 0) {
                  break L1;
                } else {
                  L3: {
                    if (stackIn_3_0 >= stackIn_3_1) {
                      stackOut_5_0 = var9 | var8;
                      stackIn_6_0 = stackOut_5_0;
                      break L3;
                    } else {
                      stackOut_4_0 = (var9 * var11 & 16711680 | -16711936 & var11 * var8) >>> -1346554936;
                      stackIn_6_0 = stackOut_4_0;
                      break L3;
                    }
                  }
                  L4: {
                    var12 = stackIn_6_0;
                    lk.f(var7, var6, this.field_H, var12);
                    var9 = param0 & 65280;
                    var8 = 16711935 & param0;
                    lk.f(-(2 * this.field_H) + var7, var6, this.field_H, var12);
                    if (256 <= var11) {
                      stackOut_8_0 = var8 | var9;
                      stackIn_9_0 = stackOut_8_0;
                      break L4;
                    } else {
                      stackOut_7_0 = (16711680 & var11 * var9 | var8 * var11 & -16711936) >>> 1547071592;
                      stackIn_9_0 = stackOut_7_0;
                      break L4;
                    }
                  }
                  var12 = stackIn_9_0;
                  lk.f(this.field_H + var7, var6, this.field_H, var12);
                  lk.f(-this.field_H + var7, var6, this.field_H, var12);
                  var6++;
                  if (var13 == 0) {
                    continue L0;
                  } else {
                    break L2;
                  }
                }
              }
            }
            stackOut_10_0 = 21;
            stackOut_10_1 = (param1 - -50) / 32;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            break L1;
          }
          var6 = stackIn_11_0 % stackIn_11_1;
          su.a((byte) 44);
          return var14;
        }
    }

    private final void a(wb param0, int param1, int param2, int param3) {
        RuntimeException var5 = null;
        int var5_int = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        var8 = Sumoblitz.field_L ? 1 : 0;
        try {
          L0: {
            var5_int = param3 - -this.field_q;
            kw.a(this.field_p + param1, param1, 1, param3 + this.field_M.field_x, -this.field_M.field_x + var5_int);
            var6 = param3 - this.field_A;
            L1: while (true) {
              L2: {
                if (var6 >= var5_int) {
                  L3: {
                    if (param2 == 256) {
                      break L3;
                    } else {
                      this.field_J = true;
                      break L3;
                    }
                  }
                  su.a((byte) -51);
                  break L2;
                } else {
                  param0.a(var6, param1);
                  var6 = var6 + param0.field_x;
                  if (var8 != 0) {
                    break L2;
                  } else {
                    continue L1;
                  }
                }
              }
              L4: {
                if (param3 + this.field_M.field_x >= lk.field_k) {
                  jq.a(param2 + 6905, this.field_E);
                  param0.a(-this.field_A, 0);
                  param0.a(this.field_H * 2 + -this.field_A, 0);
                  this.field_G.d(0, 0);
                  su.a((byte) -105);
                  this.field_E.a(param3, param1);
                  break L4;
                } else {
                  break L4;
                }
              }
              if (lk.field_j >= -this.field_M.field_x + var5_int) {
                jq.a(7161, this.field_E);
                var7 = this.field_A + this.field_q - this.field_M.field_x;
                L5: while (true) {
                  L6: {
                    L7: {
                      if (this.field_H * 2 >= var7) {
                        break L7;
                      } else {
                        var7 = var7 - this.field_H * 2;
                        if (var8 != 0) {
                          break L6;
                        } else {
                          if (var8 == 0) {
                            continue L5;
                          } else {
                            break L7;
                          }
                        }
                      }
                    }
                    param0.a(-var7, 0);
                    param0.a(2 * this.field_H + -var7, 0);
                    this.field_M.d(0, 0);
                    su.a((byte) 106);
                    break L6;
                  }
                  this.field_E.a(var5_int - this.field_M.field_x, param1);
                  break L0;
                }
              } else {
                return;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var5 = decompiledCaughtException;
            stackOut_22_0 = (RuntimeException) (var5);
            stackOut_22_1 = new StringBuilder().append("pq.E(");
            stackIn_24_0 = stackOut_22_0;
            stackIn_24_1 = stackOut_22_1;
            stackIn_23_0 = stackOut_22_0;
            stackIn_23_1 = stackOut_22_1;
            if (param0 == null) {
              stackOut_24_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackOut_24_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackOut_24_2 = "null";
              stackIn_25_0 = stackOut_24_0;
              stackIn_25_1 = stackOut_24_1;
              stackIn_25_2 = stackOut_24_2;
              break L8;
            } else {
              stackOut_23_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackOut_23_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackOut_23_2 = "{...}";
              stackIn_25_0 = stackOut_23_0;
              stackIn_25_1 = stackOut_23_1;
              stackIn_25_2 = stackOut_23_2;
              break L8;
            }
          }
          throw qo.a((Throwable) ((Object) stackIn_25_0), stackIn_25_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    pq(int param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        this(param0, param1, param2, param3, param4, param5, param6, (param5 & 16711422) >> -1445149599, (16711422 & param6) >> 409329089);
    }

    final static int a(int param0, int param1) {
        int var2 = 0;
        int var3 = 0;
        if (param0 != 1) {
          return -1;
        } else {
          L0: {
            var2 = 0;
            if ((param1 & 7) == 0) {
              break L0;
            } else {
              var2 = -(7 & param1) + 8;
              break L0;
            }
          }
          var3 = var2 + param1;
          return var3;
        }
    }

    final void a(int param0, int param1, int param2, int param3, int param4) {
        super.a(-57, param1, param2, param3, param4);
        this.g(880072001);
        int var6 = 85 % ((28 - param0) / 63);
    }

    private pq(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8) {
        this.field_B = param7;
        this.field_D = param8;
        this.field_K = param6;
        this.field_x = param5;
        this.field_H = param4;
        this.a(-79, param0, param1, param3, param2);
    }

    final void a(int param0, int param1, byte param2, int param3) {
        int var5 = 0;
        int var6 = 0;
        if (param3 == 0) {
          var5 = param0 + this.field_r;
          if (param2 < -35) {
            var6 = this.field_v + param1;
            this.a(this.field_z[0], var6, 256, var5);
            if (this.field_I < 65536) {
              kw.a(var6 - -this.field_p, var6, 1, var5 - -(this.field_I * this.field_q >> 2035440112), this.field_q + var5);
              this.a(this.field_z[1], var6, 256, var5);
              su.a((byte) -110);
              return;
            } else {
              return;
            }
          } else {
            this.field_z = (wb[]) null;
            var6 = this.field_v + param1;
            this.a(this.field_z[0], var6, 256, var5);
            if (this.field_I >= 65536) {
              return;
            } else {
              kw.a(var6 - -this.field_p, var6, 1, var5 - -(this.field_I * this.field_q >> 2035440112), this.field_q + var5);
              this.a(this.field_z[1], var6, 256, var5);
              su.a((byte) -110);
              return;
            }
          }
        } else {
          return;
        }
    }

    static {
        field_N = "Confirm Email:";
        field_y = new float[16];
    }
}
