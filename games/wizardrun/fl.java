/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fl extends k {
    private int[] field_C;
    private int field_r;
    private int[] field_O;
    int[] field_o;
    private int[] field_w;
    private int[] field_R;
    static int field_M;
    static java.applet.Applet field_F;
    private int[] field_D;
    int[] field_y;
    private int[] field_v;
    static int field_u;
    private int[] field_P;
    private int[] field_N;
    int[] field_Q;
    private int[] field_t;
    private int[] field_B;
    private int[] field_I;
    private vk[][] field_J;
    private vk[][] field_S;
    private wf field_E;
    private int[] field_L;
    private int[] field_z;
    static int field_V;
    private int field_m;
    private ab field_G;
    private boolean field_U;
    private int field_p;
    static byte[][][] field_T;
    private long field_n;
    private long field_K;
    static java.awt.Frame field_H;
    private int field_s;
    private he field_A;
    private ji field_x;
    private int field_W;
    private boolean field_q;

    private final void e(int param0, int param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        L0: {
          L1: {
            var5 = wizardrun.field_H;
            if (param1 == this.field_P[param2]) {
              break L1;
            } else {
              this.field_P[param2] = param1;
              var4 = 0;
              L2: while (true) {
                if (-129 >= (var4 ^ -1)) {
                  break L1;
                } else {
                  this.field_J[param2][var4] = null;
                  var4++;
                  if (var5 != 0) {
                    break L0;
                  } else {
                    if (var5 == 0) {
                      continue L2;
                    } else {
                      break L1;
                    }
                  }
                }
              }
            }
          }
          if (param0 == -129) {
            break L0;
          } else {
            this.c(93, -111, 85);
            break L0;
          }
        }
    }

    private final int a(vk param0, byte param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int stackIn_4_0 = 0;
        int stackIn_6_0 = 0;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_5_0 = 0;
        int stackOut_3_0 = 0;
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
              var3_int = this.field_B[param0.field_F];
              if (param1 >= 54) {
                break L1;
              } else {
                this.a(-24);
                break L1;
              }
            }
            if ((var3_int ^ -1) <= -8193) {
              stackOut_5_0 = -((-var3_int + 16384) * (128 + -param0.field_B) - -32 >> 632376358) + 16384;
              stackIn_6_0 = stackOut_5_0;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackOut_3_0 = 32 + param0.field_B * var3_int >> 750746630;
              stackIn_4_0 = stackOut_3_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) (var3);
            stackOut_7_1 = new StringBuilder().append("fl.CA(");
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param0 == null) {
              stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackOut_9_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L2;
            } else {
              stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackOut_8_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L2;
            }
          }
          throw bd.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0;
        } else {
          return stackIn_6_0;
        }
    }

    final synchronized boolean a(kl param0, int param1, ue param2, ji param3, int param4) {
        RuntimeException var6 = null;
        int var6_int = 0;
        Object var7 = null;
        pb var8 = null;
        int var9 = 0;
        h var10 = null;
        int var11 = 0;
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
        var11 = wizardrun.field_H;
        try {
          L0: {
            L1: {
              param3.a();
              var6_int = 1;
              var7 = null;
              if (param1 > (param4 ^ -1)) {
                var7 = new int[]{param4};
                break L1;
              } else {
                break L1;
              }
            }
            var8 = (pb) ((Object) param3.field_i.b((byte) 61));
            L2: while (true) {
              L3: {
                L4: {
                  if (var8 == null) {
                    break L4;
                  } else {
                    var9 = (int)var8.field_e;
                    var10 = (h) ((Object) this.field_G.a(1, (long)var9));
                    if (var11 != 0) {
                      break L3;
                    } else {
                      L5: {
                        L6: {
                          if (var10 != null) {
                            break L6;
                          } else {
                            L7: {
                              var10 = ld.a(param1 + 82, var9, param0);
                              if (var10 == null) {
                                var6_int = 0;
                                if (var11 == 0) {
                                  break L5;
                                } else {
                                  break L7;
                                }
                              } else {
                                break L7;
                              }
                            }
                            this.field_G.a(var10, -9, (long)var9);
                            break L6;
                          }
                        }
                        if (!var10.a(var8.field_j, param2, -75, (int[]) (var7))) {
                          var6_int = 0;
                          break L5;
                        } else {
                          break L5;
                        }
                      }
                      var8 = (pb) ((Object) param3.field_i.b(1));
                      if (var11 == 0) {
                        continue L2;
                      } else {
                        break L4;
                      }
                    }
                  }
                }
                if (var6_int == 0) {
                  break L3;
                } else {
                  param3.b();
                  break L3;
                }
              }
              stackOut_18_0 = var6_int;
              stackIn_19_0 = stackOut_18_0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var6 = decompiledCaughtException;
            stackOut_20_0 = (RuntimeException) (var6);
            stackOut_20_1 = new StringBuilder().append("fl.FA(");
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
              break L8;
            } else {
              stackOut_21_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackOut_21_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackOut_21_2 = "{...}";
              stackIn_23_0 = stackOut_21_0;
              stackIn_23_1 = stackOut_21_1;
              stackIn_23_2 = stackOut_21_2;
              break L8;
            }
          }
          L9: {
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
              break L9;
            } else {
              stackOut_24_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackOut_24_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackOut_24_2 = "{...}";
              stackIn_26_0 = stackOut_24_0;
              stackIn_26_1 = stackOut_24_1;
              stackIn_26_2 = stackOut_24_2;
              break L9;
            }
          }
          L10: {
            stackOut_26_0 = (RuntimeException) ((Object) stackIn_26_0);
            stackOut_26_1 = ((StringBuilder) (Object) stackIn_26_1).append(stackIn_26_2).append(',');
            stackIn_28_0 = stackOut_26_0;
            stackIn_28_1 = stackOut_26_1;
            stackIn_27_0 = stackOut_26_0;
            stackIn_27_1 = stackOut_26_1;
            if (param3 == null) {
              stackOut_28_0 = (RuntimeException) ((Object) stackIn_28_0);
              stackOut_28_1 = (StringBuilder) ((Object) stackIn_28_1);
              stackOut_28_2 = "null";
              stackIn_29_0 = stackOut_28_0;
              stackIn_29_1 = stackOut_28_1;
              stackIn_29_2 = stackOut_28_2;
              break L10;
            } else {
              stackOut_27_0 = (RuntimeException) ((Object) stackIn_27_0);
              stackOut_27_1 = (StringBuilder) ((Object) stackIn_27_1);
              stackOut_27_2 = "{...}";
              stackIn_29_0 = stackOut_27_0;
              stackIn_29_1 = stackOut_27_1;
              stackIn_29_2 = stackOut_27_2;
              break L10;
            }
          }
          throw bd.a((Throwable) ((Object) stackIn_29_0), stackIn_29_2 + ',' + param4 + ')');
        }
        return stackIn_19_0 != 0;
    }

    final synchronized k c() {
        return null;
    }

    private final void a(int param0, int param1, int param2, int param3) {
        vk var5 = null;
        je var6 = null;
        int var6_int = 0;
        vk var7 = null;
        vk var8 = null;
        int var9 = 0;
        h var10 = null;
        h var11 = null;
        Object stackIn_18_0 = null;
        int stackIn_18_1 = 0;
        Object stackIn_19_0 = null;
        int stackIn_19_1 = 0;
        Object stackIn_20_0 = null;
        int stackIn_20_1 = 0;
        int stackIn_20_2 = 0;
        Object stackOut_17_0 = null;
        int stackOut_17_1 = 0;
        Object stackOut_19_0 = null;
        int stackOut_19_1 = 0;
        int stackOut_19_2 = 0;
        Object stackOut_18_0 = null;
        int stackOut_18_1 = 0;
        int stackOut_18_2 = 0;
        L0: {
          var9 = wizardrun.field_H;
          this.a(param3, 64, param0, (byte) -16);
          if ((this.field_y[param0] & 2) != 0) {
            var5 = (vk) ((Object) this.field_A.field_p.a((byte) 11));
            L1: while (true) {
              if (var5 == null) {
                break L0;
              } else {
                L2: {
                  if (param0 != var5.field_F) {
                    break L2;
                  } else {
                    if (var5.field_j >= 0) {
                      break L2;
                    } else {
                      this.field_S[param0][var5.field_k] = null;
                      this.field_S[param0][param3] = var5;
                      var6_int = var5.field_z + (var5.field_y * var5.field_I >> 1545564876);
                      var5.field_z = var5.field_z + (-var5.field_k + param3 << 886715048);
                      var5.field_k = param3;
                      var5.field_I = -var5.field_z + var6_int;
                      var5.field_y = 4096;
                      return;
                    }
                  }
                }
                var5 = (vk) ((Object) this.field_A.field_p.a(102));
                if (var9 == 0) {
                  continue L1;
                } else {
                  break L0;
                }
              }
            }
          } else {
            break L0;
          }
        }
        var10 = (h) ((Object) this.field_G.a(1, (long)this.field_P[param0]));
        var11 = var10;
        if (var11 == null) {
          return;
        } else {
          var6 = var10.field_k[param3];
          if (var6 == null) {
            return;
          } else {
            L3: {
              L4: {
                var7 = new vk();
                var7.field_C = var11;
                var7.field_F = param0;
                var7.field_v = var6;
                var7.field_i = var10.field_t[param3];
                var7.field_t = var10.field_l[param3];
                var7.field_k = param3;
                var7.field_D = 1024 + param1 * (param1 * var11.field_n) * var10.field_q[param3] >> 864177931;
                var7.field_B = 255 & var10.field_o[param3];
                var7.field_z = -(var10.field_r[param3] & 32767) + (param3 << -1562016536);
                var7.field_m = 0;
                var7.field_K = 0;
                var7.field_j = -1;
                var7.field_n = 0;
                var7.field_s = param2;
                if (this.field_o[param0] != 0) {
                  break L4;
                } else {
                  var7.field_w = uj.a(var6, this.a(-822, var7), this.a(var7, -98), this.a(var7, (byte) 105));
                  if (var9 == 0) {
                    break L3;
                  } else {
                    break L4;
                  }
                }
              }
              L5: {
                var7.field_w = uj.a(var6, this.a(param2 ^ -822, var7), 0, this.a(var7, (byte) 79));
                stackOut_17_0 = this;
                stackOut_17_1 = 15;
                stackIn_19_0 = stackOut_17_0;
                stackIn_19_1 = stackOut_17_1;
                stackIn_18_0 = stackOut_17_0;
                stackIn_18_1 = stackOut_17_1;
                if ((var10.field_r[param3] ^ -1) <= -1) {
                  stackOut_19_0 = this;
                  stackOut_19_1 = stackIn_19_1;
                  stackOut_19_2 = 0;
                  stackIn_20_0 = stackOut_19_0;
                  stackIn_20_1 = stackOut_19_1;
                  stackIn_20_2 = stackOut_19_2;
                  break L5;
                } else {
                  stackOut_18_0 = this;
                  stackOut_18_1 = stackIn_18_1;
                  stackOut_18_2 = 1;
                  stackIn_20_0 = stackOut_18_0;
                  stackIn_20_1 = stackOut_18_1;
                  stackIn_20_2 = stackOut_18_2;
                  break L5;
                }
              }
              this.a(stackIn_20_1, stackIn_20_2 != 0, var7);
              break L3;
            }
            L6: {
              if (0 <= var10.field_r[param3]) {
                break L6;
              } else {
                var7.field_w.e(-1);
                break L6;
              }
            }
            L7: {
              if ((var7.field_t ^ -1) > -1) {
                break L7;
              } else {
                L8: {
                  var8 = this.field_J[param0][var7.field_t];
                  if (var8 == null) {
                    break L8;
                  } else {
                    if ((var8.field_j ^ -1) <= -1) {
                      break L8;
                    } else {
                      this.field_S[param0][var8.field_k] = null;
                      var8.field_j = 0;
                      break L8;
                    }
                  }
                }
                this.field_J[param0][var7.field_t] = var7;
                break L7;
              }
            }
            this.field_A.field_p.a(var7, false);
            this.field_S[param0][param3] = var7;
            return;
          }
        }
    }

    final synchronized void b(boolean param0) {
        int var3 = 0;
        h var4 = null;
        L0: {
          var3 = wizardrun.field_H;
          if (param0) {
            break L0;
          } else {
            this.a(-72, 96);
            break L0;
          }
        }
        var4 = (h) ((Object) this.field_G.b((byte) -87));
        L1: while (true) {
          L2: {
            if (var4 == null) {
              break L2;
            } else {
              var4.a(-106);
              var4 = (h) ((Object) this.field_G.b(1));
              if (var3 != 0) {
                break L2;
              } else {
                if (var3 == 0) {
                  continue L1;
                } else {
                  break L2;
                }
              }
            }
          }
          return;
        }
    }

    private final void c(boolean param0) {
        int var2 = 0;
        int var3 = 0;
        long var4 = 0L;
        int var6 = 0;
        int var7 = 0;
        int stackIn_9_0 = 0;
        int stackIn_9_1 = 0;
        int stackIn_13_0 = 0;
        int stackIn_13_1 = 0;
        int stackIn_16_0 = 0;
        int stackIn_16_1 = 0;
        int stackIn_37_0 = 0;
        int stackIn_37_1 = 0;
        int stackOut_12_0 = 0;
        int stackOut_12_1 = 0;
        int stackOut_36_0 = 0;
        int stackOut_36_1 = 0;
        int stackOut_8_0 = 0;
        int stackOut_8_1 = 0;
        L0: {
          var7 = wizardrun.field_H;
          var2 = this.field_p;
          var3 = this.field_s;
          var4 = this.field_n;
          if (this.field_x == null) {
            break L0;
          } else {
            if (var3 != this.field_W) {
              break L0;
            } else {
              this.a(this.field_U, this.field_q, 0, this.field_x);
              this.c(false);
              return;
            }
          }
        }
        L1: while (true) {
          if (this.field_s == var3) {
            L2: while (true) {
              stackOut_12_0 = this.field_E.field_h[var2];
              stackOut_12_1 = var3;
              stackIn_16_0 = stackOut_12_0;
              stackIn_16_1 = stackOut_12_1;
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              if (var7 == 0) {
                L3: {
                  if (stackIn_16_0 != stackIn_16_1) {
                    break L3;
                  } else {
                    this.field_E.a(var2);
                    var6 = this.field_E.d(var2);
                    if (-2 == (var6 ^ -1)) {
                      this.field_E.g();
                      this.field_E.c(var2);
                      if (!this.field_E.f()) {
                        break L3;
                      } else {
                        if (this.field_x != null) {
                          this.a(this.field_U, -76, this.field_x);
                          this.c(false);
                          return;
                        } else {
                          L4: {
                            if (!this.field_U) {
                              break L4;
                            } else {
                              if (0 != var3) {
                                this.field_E.a(var4);
                                if (var7 == 0) {
                                  break L3;
                                } else {
                                  break L4;
                                }
                              } else {
                                break L4;
                              }
                            }
                          }
                          this.a(true, (byte) -91);
                          this.field_E.e();
                          return;
                        }
                      }
                    } else {
                      L5: {
                        if (-1 != (var6 & 128 ^ -1)) {
                          this.e(var6, 12035);
                          break L5;
                        } else {
                          break L5;
                        }
                      }
                      this.field_E.b(var2);
                      this.field_E.c(var2);
                      continue L2;
                    }
                  }
                }
                var2 = this.field_E.b();
                var3 = this.field_E.field_h[var2];
                var4 = this.field_E.e(var3);
                if (var7 == 0) {
                  continue L1;
                } else {
                  L6: {
                    this.field_n = var4;
                    this.field_s = var3;
                    this.field_p = var2;
                    if (!param0) {
                      break L6;
                    } else {
                      this.b(true);
                      break L6;
                    }
                  }
                  L7: {
                    if (null == this.field_x) {
                      break L7;
                    } else {
                      stackOut_36_0 = var3;
                      stackOut_36_1 = this.field_W;
                      stackIn_37_0 = stackOut_36_0;
                      stackIn_37_1 = stackOut_36_1;
                      if (stackIn_37_0 <= stackIn_37_1) {
                        break L7;
                      } else {
                        this.field_p = -1;
                        this.field_s = this.field_W;
                        this.field_n = this.field_E.e(this.field_s);
                        break L7;
                      }
                    }
                  }
                  return;
                }
              } else {
                L8: {
                  if (stackIn_13_0 <= stackIn_13_1) {
                    break L8;
                  } else {
                    this.field_p = -1;
                    this.field_s = this.field_W;
                    this.field_n = this.field_E.e(this.field_s);
                    break L8;
                  }
                }
                return;
              }
            }
          } else {
            L9: {
              this.field_n = var4;
              this.field_s = var3;
              this.field_p = var2;
              if (!param0) {
                break L9;
              } else {
                this.b(true);
                break L9;
              }
            }
            L10: {
              if (null == this.field_x) {
                break L10;
              } else {
                stackOut_8_0 = var3;
                stackOut_8_1 = this.field_W;
                stackIn_9_0 = stackOut_8_0;
                stackIn_9_1 = stackOut_8_1;
                if (stackIn_9_0 <= stackIn_9_1) {
                  break L10;
                } else {
                  this.field_p = -1;
                  this.field_s = this.field_W;
                  this.field_n = this.field_E.e(this.field_s);
                  break L10;
                }
              }
            }
            return;
          }
        }
    }

    final void a(int param0, boolean param1, vk param2) {
        RuntimeException runtimeException = null;
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        try {
          L0: {
            L1: {
              L2: {
                L3: {
                  var4_int = param2.field_v.field_k.length;
                  if (!param1) {
                    break L3;
                  } else {
                    if (param2.field_v.field_j) {
                      break L2;
                    } else {
                      break L3;
                    }
                  }
                }
                var5 = (int)((long)var4_int * (long)this.field_o[param2.field_F] >> -65387962);
                if (wizardrun.field_H == 0) {
                  break L1;
                } else {
                  break L2;
                }
              }
              var6 = -param2.field_v.field_n + var4_int + var4_int;
              var5 = (int)((long)this.field_o[param2.field_F] * (long)var6 >> -518849466);
              var4_int = var4_int << 8;
              if (var4_int <= var5) {
                param2.field_w.b(true);
                var5 = -var5 + (var4_int + var4_int) + -1;
                break L1;
              } else {
                break L1;
              }
            }
            L4: {
              if (param0 == 15) {
                break L4;
              } else {
                this.a(true, -14, (ji) null);
                break L4;
              }
            }
            param2.field_w.g(var5);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            runtimeException = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) (runtimeException);
            stackOut_11_1 = new StringBuilder().append("fl.V(").append(param0).append(',').append(param1).append(',');
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param2 == null) {
              stackOut_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackOut_13_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L5;
            } else {
              stackOut_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackOut_12_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L5;
            }
          }
          throw bd.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ')');
        }
    }

    private final int a(int param0, vk param1) {
        k discarded$1 = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        q var4 = null;
        int var5 = 0;
        int var6 = 0;
        double var7 = 0.0;
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
        int stackOut_11_0 = 0;
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
            L1: {
              var3_int = param1.field_z + (param1.field_I * param1.field_y >> 1550235596);
              var3_int = var3_int + ((-8192 + this.field_I[param1.field_F]) * this.field_D[param1.field_F] >> 295693516);
              var4 = param1.field_i;
              if (-1 <= (var4.field_k ^ -1)) {
                break L1;
              } else {
                L2: {
                  if (-1 > (var4.field_e ^ -1)) {
                    break L2;
                  } else {
                    if (0 >= this.field_C[param1.field_F]) {
                      break L1;
                    } else {
                      break L2;
                    }
                  }
                }
                L3: {
                  var5 = var4.field_e << 204745058;
                  var6 = var4.field_a << 1284017697;
                  if (param1.field_q < var6) {
                    var5 = var5 * param1.field_q / var6;
                    break L3;
                  } else {
                    break L3;
                  }
                }
                var5 = var5 + (this.field_C[param1.field_F] >> -1326977945);
                var7 = Math.sin(0.01227184630308513 * (double)(param1.field_x & 511));
                var3_int = var3_int + (int)((double)var5 * var7);
                break L1;
              }
            }
            L4: {
              var5 = (int)((double)(256 * param1.field_v.field_m) * Math.pow(2.0, (double)var3_int * 0.0003255208333333333) / (double)c.field_l + 0.5);
              if (param0 == -822) {
                break L4;
              } else {
                discarded$1 = this.a();
                break L4;
              }
            }
            L5: {
              if (-2 < (var5 ^ -1)) {
                stackOut_12_0 = 1;
                stackIn_13_0 = stackOut_12_0;
                break L5;
              } else {
                stackOut_11_0 = var5;
                stackIn_13_0 = stackOut_11_0;
                break L5;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var3 = decompiledCaughtException;
            stackOut_14_0 = (RuntimeException) (var3);
            stackOut_14_1 = new StringBuilder().append("fl.M(").append(param0).append(',');
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
              break L6;
            } else {
              stackOut_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackOut_15_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackOut_15_2 = "{...}";
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              stackIn_17_2 = stackOut_15_2;
              break L6;
            }
          }
          throw bd.a((Throwable) ((Object) stackIn_17_0), stackIn_17_2 + ')');
        }
        return stackIn_13_0;
    }

    private final void c(int param0, int param1, int param2) {
        this.field_z[param0] = param2;
        if (param1 <= 113) {
            this.field_U = false;
        }
        this.field_Q[param0] = (int)(2097152.0 * Math.pow(2.0, 0.00054931640625 * (double)param2) + 0.5);
    }

    private final void b(int param0, int param1, int param2, byte param3) {
        if (param3 <= 71) {
            this.field_Q = (int[]) null;
        }
    }

    private final void c(int param0, int param1) {
        vk var3 = null;
        int var4 = 0;
        var4 = wizardrun.field_H;
        if (param0 != 256) {
          return;
        } else {
          L0: {
            if ((2 & this.field_y[param1]) != 0) {
              var3 = (vk) ((Object) this.field_A.field_p.b((byte) 91));
              L1: while (true) {
                if (var3 == null) {
                  break L0;
                } else {
                  if (var4 != 0) {
                    break L0;
                  } else {
                    L2: {
                      if (param1 != var3.field_F) {
                        break L2;
                      } else {
                        if (this.field_S[param1][var3.field_k] != null) {
                          break L2;
                        } else {
                          if (var3.field_j >= 0) {
                            break L2;
                          } else {
                            var3.field_j = 0;
                            break L2;
                          }
                        }
                      }
                    }
                    var3 = (vk) ((Object) this.field_A.field_p.d(param0 ^ 8448));
                    if (var4 == 0) {
                      continue L1;
                    } else {
                      break L0;
                    }
                  }
                }
              }
            } else {
              break L0;
            }
          }
          return;
        }
    }

    private final void e(int param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        var8 = wizardrun.field_H;
        var3 = 240 & param0;
        if (-129 == (var3 ^ -1)) {
          var4 = 15 & param0;
          var5 = param0 >> -866125432 & 127;
          var6 = 127 & param0 >> -2107653744;
          this.a(var5, var6, var4, (byte) -16);
          return;
        } else {
          if (144 != var3) {
            if ((var3 ^ -1) != -161) {
              if (176 == var3) {
                L0: {
                  var4 = 15 & param0;
                  var5 = (param0 & 32628) >> 1440553864;
                  var6 = (param0 & 8367717) >> -1837133072;
                  if (var5 != 0) {
                    break L0;
                  } else {
                    this.field_w[var4] = (var6 << 1764442766) + kl.b(this.field_w[var4], -2080769);
                    break L0;
                  }
                }
                L1: {
                  if (-33 != (var5 ^ -1)) {
                    break L1;
                  } else {
                    this.field_w[var4] = (var6 << 1372312199) + kl.b(this.field_w[var4], -16257);
                    break L1;
                  }
                }
                L2: {
                  if (1 != var5) {
                    break L2;
                  } else {
                    this.field_C[var4] = kl.b(this.field_C[var4], -16257) + (var6 << 1024628071);
                    break L2;
                  }
                }
                L3: {
                  if ((var5 ^ -1) != -34) {
                    break L3;
                  } else {
                    this.field_C[var4] = var6 + kl.b(-128, this.field_C[var4]);
                    break L3;
                  }
                }
                L4: {
                  if (var5 != 5) {
                    break L4;
                  } else {
                    this.field_t[var4] = (var6 << 296128583) + kl.b(-16257, this.field_t[var4]);
                    break L4;
                  }
                }
                L5: {
                  if ((var5 ^ -1) == -38) {
                    this.field_t[var4] = var6 + kl.b(-128, this.field_t[var4]);
                    break L5;
                  } else {
                    break L5;
                  }
                }
                L6: {
                  if (7 == var5) {
                    this.field_N[var4] = kl.b(-16257, this.field_N[var4]) + (var6 << -351277465);
                    break L6;
                  } else {
                    break L6;
                  }
                }
                L7: {
                  if ((var5 ^ -1) != -40) {
                    break L7;
                  } else {
                    this.field_N[var4] = kl.b(-128, this.field_N[var4]) + var6;
                    break L7;
                  }
                }
                L8: {
                  if (10 == var5) {
                    this.field_B[var4] = (var6 << -1639809817) + kl.b(this.field_B[var4], -16257);
                    break L8;
                  } else {
                    break L8;
                  }
                }
                L9: {
                  if (42 != var5) {
                    break L9;
                  } else {
                    this.field_B[var4] = kl.b(this.field_B[var4], -128) - -var6;
                    break L9;
                  }
                }
                L10: {
                  if (-12 == (var5 ^ -1)) {
                    this.field_v[var4] = (var6 << -1988995545) + kl.b(-16257, this.field_v[var4]);
                    break L10;
                  } else {
                    break L10;
                  }
                }
                L11: {
                  if (-44 != (var5 ^ -1)) {
                    break L11;
                  } else {
                    this.field_v[var4] = kl.b(-128, this.field_v[var4]) - -var6;
                    break L11;
                  }
                }
                L12: {
                  if (-65 != (var5 ^ -1)) {
                    break L12;
                  } else {
                    L13: {
                      if (var6 < 64) {
                        break L13;
                      } else {
                        this.field_y[var4] = sd.a(this.field_y[var4], 1);
                        if (var8 == 0) {
                          break L12;
                        } else {
                          break L13;
                        }
                      }
                    }
                    this.field_y[var4] = kl.b(this.field_y[var4], -2);
                    break L12;
                  }
                }
                L14: {
                  if (-66 != (var5 ^ -1)) {
                    break L14;
                  } else {
                    L15: {
                      if (64 <= var6) {
                        break L15;
                      } else {
                        this.c(256, var4);
                        this.field_y[var4] = kl.b(this.field_y[var4], -3);
                        if (var8 == 0) {
                          break L14;
                        } else {
                          break L15;
                        }
                      }
                    }
                    this.field_y[var4] = sd.a(this.field_y[var4], 2);
                    break L14;
                  }
                }
                L16: {
                  if (99 != var5) {
                    break L16;
                  } else {
                    this.field_L[var4] = (var6 << -2144810105) + kl.b(127, this.field_L[var4]);
                    break L16;
                  }
                }
                L17: {
                  if (98 == var5) {
                    this.field_L[var4] = var6 + kl.b(16256, this.field_L[var4]);
                    break L17;
                  } else {
                    break L17;
                  }
                }
                L18: {
                  if (101 == var5) {
                    this.field_L[var4] = kl.b(127, this.field_L[var4]) + (16384 + (var6 << -1007552633));
                    break L18;
                  } else {
                    break L18;
                  }
                }
                L19: {
                  if (var5 != 100) {
                    break L19;
                  } else {
                    this.field_L[var4] = kl.b(this.field_L[var4], 16256) + (16384 + var6);
                    break L19;
                  }
                }
                L20: {
                  if (var5 == 120) {
                    this.d(param1 + -12035, var4);
                    break L20;
                  } else {
                    break L20;
                  }
                }
                L21: {
                  if ((var5 ^ -1) != -122) {
                    break L21;
                  } else {
                    this.a(var4, (byte) 21);
                    break L21;
                  }
                }
                L22: {
                  if (123 == var5) {
                    this.g(var4, -1);
                    break L22;
                  } else {
                    break L22;
                  }
                }
                L23: {
                  if (6 != var5) {
                    break L23;
                  } else {
                    var7 = this.field_L[var4];
                    if ((var7 ^ -1) == -16385) {
                      this.field_D[var4] = (var6 << -1526149721) + kl.b(this.field_D[var4], -16257);
                      break L23;
                    } else {
                      break L23;
                    }
                  }
                }
                L24: {
                  if (38 == var5) {
                    var7 = this.field_L[var4];
                    if ((var7 ^ -1) == -16385) {
                      this.field_D[var4] = kl.b(this.field_D[var4], -128) + var6;
                      break L24;
                    } else {
                      break L24;
                    }
                  } else {
                    break L24;
                  }
                }
                L25: {
                  if (16 == var5) {
                    this.field_o[var4] = (var6 << -524404729) + kl.b(this.field_o[var4], -16257);
                    break L25;
                  } else {
                    break L25;
                  }
                }
                L26: {
                  if (var5 == 48) {
                    this.field_o[var4] = kl.b(-128, this.field_o[var4]) - -var6;
                    break L26;
                  } else {
                    break L26;
                  }
                }
                L27: {
                  if (var5 == 81) {
                    L28: {
                      if (-65 < (var6 ^ -1)) {
                        break L28;
                      } else {
                        this.field_y[var4] = sd.a(this.field_y[var4], 4);
                        if (var8 == 0) {
                          break L27;
                        } else {
                          break L28;
                        }
                      }
                    }
                    this.b(-1, var4);
                    this.field_y[var4] = kl.b(this.field_y[var4], -5);
                    break L27;
                  } else {
                    break L27;
                  }
                }
                L29: {
                  if (17 != var5) {
                    break L29;
                  } else {
                    this.c(var4, param1 ^ 12154, (var6 << 107386279) + (this.field_z[var4] & -16257));
                    break L29;
                  }
                }
                if (-50 == (var5 ^ -1)) {
                  this.c(var4, param1 ^ 12148, (-128 & this.field_z[var4]) + var6);
                  return;
                } else {
                  return;
                }
              } else {
                if (192 != var3) {
                  L30: {
                    if (param1 == 12035) {
                      break L30;
                    } else {
                      this.field_K = -72L;
                      break L30;
                    }
                  }
                  if (var3 != 208) {
                    if ((var3 ^ -1) != -225) {
                      var3 = param0 & 255;
                      if (var3 == 255) {
                        this.a(true, (byte) -78);
                        return;
                      } else {
                        return;
                      }
                    } else {
                      var4 = param0 & 15;
                      var5 = (param0 >> 1498609032 & 127) + ((param0 & 8323516) >> -1328152663);
                      this.b(var4, var5, 38);
                      return;
                    }
                  } else {
                    var4 = 15 & param0;
                    var5 = 127 & param0 >> -236730232;
                    this.d(var5, 2, var4);
                    return;
                  }
                } else {
                  var4 = param0 & 15;
                  var5 = 127 & param0 >> -1094714680;
                  this.e(-129, var5 + this.field_w[var4], var4);
                  return;
                }
              }
            } else {
              var4 = 15 & param0;
              var5 = 127 & param0 >> -1698178264;
              var6 = (8323853 & param0) >> -31229776;
              this.b(var4, var6, var5, (byte) 118);
              return;
            }
          } else {
            var4 = param0 & 15;
            var5 = param0 >> -1610455896 & 127;
            var6 = param0 >> 444953232 & 127;
            if ((var6 ^ -1) < -1) {
              this.a(var4, var6, 0, var5);
              if (var8 != 0) {
                this.a(var5, 64, var4, (byte) -16);
                return;
              } else {
                return;
              }
            } else {
              this.a(var5, 64, var4, (byte) -16);
              return;
            }
          }
        }
    }

    final synchronized void a(int param0) {
        int var2 = 0;
        long var3 = 0L;
        int var5 = 0;
        int var6 = 0;
        L0: {
          L1: {
            var6 = wizardrun.field_H;
            if (this.field_E.c()) {
              var2 = this.field_r * this.field_E.field_d / c.field_l;
              L2: while (true) {
                L3: {
                  var3 = (long)var2 * (long)param0 + this.field_K;
                  if (-var3 + this.field_n < 0L) {
                    break L3;
                  } else {
                    this.field_K = var3;
                    if (var6 != 0) {
                      break L0;
                    } else {
                      if (var6 == 0) {
                        break L1;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
                L4: {
                  var5 = (int)((-1L + ((long)var2 + this.field_n + -this.field_K)) / (long)var2);
                  this.field_K = this.field_K + (long)var5 * (long)var2;
                  this.field_A.a(var5);
                  param0 = param0 - var5;
                  this.c(false);
                  if (this.field_E.c()) {
                    break L4;
                  } else {
                    if (var6 == 0) {
                      break L1;
                    } else {
                      break L4;
                    }
                  }
                }
                if (var6 == 0) {
                  continue L2;
                } else {
                  this.field_A.a(param0);
                  break L0;
                }
              }
            } else {
              break L1;
            }
          }
          this.field_A.a(param0);
          break L0;
        }
    }

    final synchronized void a(int param0, int param1, byte param2) {
        if (param2 != 108) {
            return;
        }
        this.f(param0, param1, 1);
    }

    final synchronized void a(boolean param0, int param1, ji param2) {
        try {
            if (param1 >= -75) {
                this.field_r = -65;
            }
            this.a(param0, true, 0, param2);
        } catch (RuntimeException runtimeException) {
            throw bd.a((Throwable) ((Object) runtimeException), "fl.T(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final synchronized void d(int param0) {
        this.a(true, true);
        if (param0 >= -20) {
            field_T = (byte[][][]) null;
        }
    }

    public static void c(int param0) {
        int var1 = -95 / ((param0 - -33) / 63);
        field_F = null;
        field_H = null;
        field_T = (byte[][][]) null;
    }

    private final void g(int param0, int param1) {
        vk var3 = null;
        int var4 = 0;
        int stackIn_3_0 = 0;
        int stackIn_3_1 = 0;
        int stackIn_10_0 = 0;
        int stackIn_10_1 = 0;
        int stackOut_2_0 = 0;
        int stackOut_2_1 = 0;
        int stackOut_9_0 = 0;
        int stackOut_9_1 = 0;
        var4 = wizardrun.field_H;
        var3 = (vk) ((Object) this.field_A.field_p.b((byte) 110));
        L0: while (true) {
          L1: {
            L2: {
              if (var3 == null) {
                break L2;
              } else {
                stackOut_2_0 = -1;
                stackOut_2_1 = param0 ^ -1;
                stackIn_10_0 = stackOut_2_0;
                stackIn_10_1 = stackOut_2_1;
                stackIn_3_0 = stackOut_2_0;
                stackIn_3_1 = stackOut_2_1;
                if (var4 != 0) {
                  break L1;
                } else {
                  L3: {
                    L4: {
                      if (stackIn_3_0 < stackIn_3_1) {
                        break L4;
                      } else {
                        if (param0 == var3.field_F) {
                          break L4;
                        } else {
                          break L3;
                        }
                      }
                    }
                    if ((var3.field_j ^ -1) <= -1) {
                      break L3;
                    } else {
                      this.field_S[var3.field_F][var3.field_k] = null;
                      var3.field_j = 0;
                      break L3;
                    }
                  }
                  var3 = (vk) ((Object) this.field_A.field_p.d(param1 ^ -8193));
                  if (var4 == 0) {
                    continue L0;
                  } else {
                    break L2;
                  }
                }
              }
            }
            stackOut_9_0 = param1;
            stackOut_9_1 = -1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            break L1;
          }
          L5: {
            if (stackIn_10_0 == stackIn_10_1) {
              break L5;
            } else {
              this.field_y = (int[]) null;
              break L5;
            }
          }
          return;
        }
    }

    private final synchronized void a(boolean param0, boolean param1, int param2, ji param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        Object stackIn_2_0 = null;
        Object stackIn_3_0 = null;
        Object stackIn_4_0 = null;
        int stackIn_4_1 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_1_0 = null;
        Object stackOut_3_0 = null;
        int stackOut_3_1 = 0;
        Object stackOut_2_0 = null;
        int stackOut_2_1 = 0;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        var7 = wizardrun.field_H;
        try {
          L0: {
            L1: {
              this.a(true, param1);
              this.field_E.a(param3.field_j);
              stackOut_1_0 = this;
              stackIn_3_0 = stackOut_1_0;
              stackIn_2_0 = stackOut_1_0;
              if (!param0) {
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
            ((fl) (this)).field_U = stackIn_4_1 != 0;
            this.field_K = (long)param2;
            var5_int = this.field_E.d();
            var6 = 0;
            L2: while (true) {
              L3: {
                if (var5_int <= var6) {
                  this.field_p = this.field_E.b();
                  this.field_s = this.field_E.field_h[this.field_p];
                  this.field_n = this.field_E.e(this.field_s);
                  break L3;
                } else {
                  this.field_E.a(var6);
                  this.field_E.b(var6);
                  this.field_E.c(var6);
                  var6++;
                  if (var7 != 0) {
                    break L3;
                  } else {
                    continue L2;
                  }
                }
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var5 = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) (var5);
            stackOut_11_1 = new StringBuilder().append("fl.IA(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param3 == null) {
              stackOut_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackOut_13_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L4;
            } else {
              stackOut_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackOut_12_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L4;
            }
          }
          throw bd.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ')');
        }
    }

    private final synchronized void a(boolean param0, boolean param1) {
        this.field_E.e();
        this.field_x = null;
        this.a(param1, (byte) -71);
        if (!param0) {
            this.a((int[]) null, -66, -74);
        }
    }

    final boolean b(int param0, vk param1) {
        RuntimeException var3 = null;
        int stackIn_2_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_11_0 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_10_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_1_0 = 0;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        try {
          L0: {
            if (param0 == -1) {
              if (null != param1.field_w) {
                stackOut_10_0 = 0;
                stackIn_11_0 = stackOut_10_0;
                decompiledRegionSelector0 = 2;
                break L0;
              } else {
                L1: {
                  if (-1 < (param1.field_j ^ -1)) {
                    break L1;
                  } else {
                    param1.a(false);
                    if ((param1.field_t ^ -1) >= -1) {
                      break L1;
                    } else {
                      if (this.field_J[param1.field_F][param1.field_t] != param1) {
                        break L1;
                      } else {
                        this.field_J[param1.field_F][param1.field_t] = null;
                        return true;
                      }
                    }
                  }
                }
                stackOut_8_0 = 1;
                stackIn_9_0 = stackOut_8_0;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              stackOut_1_0 = 0;
              stackIn_2_0 = stackOut_1_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) (var3);
            stackOut_12_1 = new StringBuilder().append("fl.R(").append(param0).append(',');
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param1 == null) {
              stackOut_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackOut_14_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L2;
            } else {
              stackOut_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackOut_13_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L2;
            }
          }
          throw bd.a((Throwable) ((Object) stackIn_15_0), stackIn_15_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_9_0 != 0;
          } else {
            return stackIn_11_0 != 0;
          }
        }
    }

    final synchronized void a(int param0, int param1) {
        this.field_m = param1;
        if (param0 != -1) {
            this.field_J = (vk[][]) null;
        }
    }

    private final void f(int param0, int param1, int param2) {
        this.field_O[param1] = param0;
        this.field_w[param1] = kl.b(param0, -128);
        if (param2 != 1) {
            this.field_o = (int[]) null;
        }
        this.e(param2 ^ -130, param0, param1);
    }

    private final void a(int param0, byte param1) {
        int var4 = 0;
        var4 = wizardrun.field_H;
        if (-1 < (param0 ^ -1)) {
          param0 = 0;
          L0: while (true) {
            if ((param0 ^ -1) > -17) {
              this.a(param0, (byte) 21);
              param0++;
              if (var4 == 0) {
                continue L0;
              } else {
                return;
              }
            } else {
              return;
            }
          }
        } else {
          this.field_N[param0] = 12800;
          this.field_B[param0] = 8192;
          if (param1 != 21) {
            return;
          } else {
            this.field_v[param0] = 16383;
            this.field_I[param0] = 8192;
            this.field_C[param0] = 0;
            this.field_t[param0] = 8192;
            this.c(256, param0);
            this.b(-1, param0);
            this.field_y[param0] = 0;
            this.field_L[param0] = 32767;
            this.field_D[param0] = 256;
            this.field_o[param0] = 0;
            this.c(param0, param1 + 103, 8192);
            return;
          }
        }
    }

    final boolean a(int param0, int[] param1, vk param2, int param3, int param4) {
        RuntimeException var6 = null;
        int var6_int = 0;
        q var7 = null;
        int var8 = 0;
        double var9 = 0.0;
        int var11 = 0;
        int stackIn_9_0 = 0;
        int stackIn_31_0 = 0;
        int stackIn_31_1 = 0;
        int stackIn_35_0 = 0;
        int stackIn_35_1 = 0;
        int stackIn_51_0 = 0;
        int stackIn_51_1 = 0;
        int stackIn_55_0 = 0;
        int stackIn_55_1 = 0;
        int stackIn_71_0 = 0;
        int stackIn_73_0 = 0;
        RuntimeException stackIn_75_0 = null;
        StringBuilder stackIn_75_1 = null;
        RuntimeException stackIn_76_0 = null;
        StringBuilder stackIn_76_1 = null;
        RuntimeException stackIn_77_0 = null;
        StringBuilder stackIn_77_1 = null;
        String stackIn_77_2 = null;
        RuntimeException stackIn_78_0 = null;
        StringBuilder stackIn_78_1 = null;
        RuntimeException stackIn_79_0 = null;
        StringBuilder stackIn_79_1 = null;
        RuntimeException stackIn_80_0 = null;
        StringBuilder stackIn_80_1 = null;
        String stackIn_80_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_8_0 = 0;
        int stackOut_30_0 = 0;
        int stackOut_30_1 = 0;
        int stackOut_34_0 = 0;
        int stackOut_34_1 = 0;
        int stackOut_50_0 = 0;
        int stackOut_50_1 = 0;
        int stackOut_54_0 = 0;
        int stackOut_54_1 = 0;
        int stackOut_70_0 = 0;
        int stackOut_72_0 = 0;
        RuntimeException stackOut_74_0 = null;
        StringBuilder stackOut_74_1 = null;
        RuntimeException stackOut_76_0 = null;
        StringBuilder stackOut_76_1 = null;
        String stackOut_76_2 = null;
        RuntimeException stackOut_75_0 = null;
        StringBuilder stackOut_75_1 = null;
        String stackOut_75_2 = null;
        RuntimeException stackOut_77_0 = null;
        StringBuilder stackOut_77_1 = null;
        RuntimeException stackOut_79_0 = null;
        StringBuilder stackOut_79_1 = null;
        String stackOut_79_2 = null;
        RuntimeException stackOut_78_0 = null;
        StringBuilder stackOut_78_1 = null;
        String stackOut_78_2 = null;
        var11 = wizardrun.field_H;
        try {
          L0: {
            L1: {
              param2.field_E = c.field_l / 100;
              if (-1 < (param2.field_j ^ -1)) {
                break L1;
              } else {
                L2: {
                  if (null == param2.field_w) {
                    break L2;
                  } else {
                    if (!param2.field_w.g()) {
                      break L1;
                    } else {
                      break L2;
                    }
                  }
                }
                L3: {
                  param2.a(0);
                  param2.a(false);
                  if (0 >= param2.field_t) {
                    break L3;
                  } else {
                    if (param2 != this.field_J[param2.field_F][param2.field_t]) {
                      break L3;
                    } else {
                      this.field_J[param2.field_F][param2.field_t] = null;
                      return true;
                    }
                  }
                }
                stackOut_8_0 = 1;
                stackIn_9_0 = stackOut_8_0;
                decompiledRegionSelector0 = 0;
                break L0;
              }
            }
            L4: {
              var6_int = param2.field_y;
              if (-1 <= (var6_int ^ -1)) {
                break L4;
              } else {
                L5: {
                  var6_int = var6_int - (int)(16.0 * Math.pow(2.0, 0.0004921259842519685 * (double)this.field_t[param2.field_F]) + 0.5);
                  if (-1 < (var6_int ^ -1)) {
                    var6_int = 0;
                    break L5;
                  } else {
                    break L5;
                  }
                }
                param2.field_y = var6_int;
                break L4;
              }
            }
            L6: {
              param2.field_w.d(this.a(-822, param2));
              var7 = param2.field_i;
              param2.field_q = param2.field_q + 1;
              param2.field_x = param2.field_x + var7.field_k;
              var8 = 0;
              var9 = (double)((-60 + param2.field_k << -450777240) + (param2.field_I * param2.field_y >> -180829524)) * 0.000005086263020833333;
              if ((var7.field_h ^ -1) < -1) {
                L7: {
                  L8: {
                    if (-1 <= (var7.field_d ^ -1)) {
                      break L8;
                    } else {
                      param2.field_m = param2.field_m + (int)(0.5 + 128.0 * Math.pow(2.0, (double)var7.field_d * var9));
                      if (var11 == 0) {
                        break L7;
                      } else {
                        break L8;
                      }
                    }
                  }
                  param2.field_m = param2.field_m + 128;
                  break L7;
                }
                if (-819201 < (var7.field_h * param2.field_m ^ -1)) {
                  break L6;
                } else {
                  var8 = 1;
                  break L6;
                }
              } else {
                break L6;
              }
            }
            L9: {
              if (null != var7.field_f) {
                L10: {
                  L11: {
                    if (-1 > (var7.field_i ^ -1)) {
                      break L11;
                    } else {
                      param2.field_K = param2.field_K + 128;
                      if (var11 == 0) {
                        break L10;
                      } else {
                        break L11;
                      }
                    }
                  }
                  param2.field_K = param2.field_K + (int)(0.5 + 128.0 * Math.pow(2.0, var9 * (double)var7.field_i));
                  break L10;
                }
                L12: while (true) {
                  L13: {
                    L14: {
                      if (param2.field_n >= var7.field_f.length + -2) {
                        break L14;
                      } else {
                        stackOut_30_0 = (255 & var7.field_f[2 + param2.field_n]) << -897535288;
                        stackOut_30_1 = param2.field_K;
                        stackIn_35_0 = stackOut_30_0;
                        stackIn_35_1 = stackOut_30_1;
                        stackIn_31_0 = stackOut_30_0;
                        stackIn_31_1 = stackOut_30_1;
                        if (var11 != 0) {
                          break L13;
                        } else {
                          if (stackIn_31_0 >= stackIn_31_1) {
                            break L14;
                          } else {
                            param2.field_n = param2.field_n + 2;
                            if (var11 == 0) {
                              continue L12;
                            } else {
                              break L14;
                            }
                          }
                        }
                      }
                    }
                    stackOut_34_0 = var7.field_f.length - 2;
                    stackOut_34_1 = param2.field_n;
                    stackIn_35_0 = stackOut_34_0;
                    stackIn_35_1 = stackOut_34_1;
                    break L13;
                  }
                  if (stackIn_35_0 != stackIn_35_1) {
                    break L9;
                  } else {
                    if (-1 != (var7.field_f[param2.field_n - -1] ^ -1)) {
                      break L9;
                    } else {
                      var8 = 1;
                      break L9;
                    }
                  }
                }
              } else {
                break L9;
              }
            }
            L15: {
              if (param2.field_j < param0) {
                break L15;
              } else {
                if (null == var7.field_c) {
                  break L15;
                } else {
                  if ((this.field_y[param2.field_F] & 1) == 0) {
                    L16: {
                      if (-1 < (param2.field_t ^ -1)) {
                        break L16;
                      } else {
                        if (param2 != this.field_J[param2.field_F][param2.field_t]) {
                          break L16;
                        } else {
                          break L15;
                        }
                      }
                    }
                    L17: {
                      L18: {
                        if (0 < var7.field_j) {
                          break L18;
                        } else {
                          param2.field_j = param2.field_j + 128;
                          if (var11 == 0) {
                            break L17;
                          } else {
                            break L18;
                          }
                        }
                      }
                      param2.field_j = param2.field_j + (int)(0.5 + Math.pow(2.0, var9 * (double)var7.field_j) * 128.0);
                      break L17;
                    }
                    L19: while (true) {
                      L20: {
                        L21: {
                          if (var7.field_c.length + -2 <= param2.field_s) {
                            break L21;
                          } else {
                            stackOut_50_0 = param2.field_j;
                            stackOut_50_1 = var7.field_c[2 + param2.field_s] << 1819065864 & 65280;
                            stackIn_55_0 = stackOut_50_0;
                            stackIn_55_1 = stackOut_50_1;
                            stackIn_51_0 = stackOut_50_0;
                            stackIn_51_1 = stackOut_50_1;
                            if (var11 != 0) {
                              break L20;
                            } else {
                              if (stackIn_51_0 <= stackIn_51_1) {
                                break L21;
                              } else {
                                param2.field_s = param2.field_s + 2;
                                if (var11 == 0) {
                                  continue L19;
                                } else {
                                  break L21;
                                }
                              }
                            }
                          }
                        }
                        stackOut_54_0 = param2.field_s;
                        stackOut_54_1 = -2 + var7.field_c.length;
                        stackIn_55_0 = stackOut_54_0;
                        stackIn_55_1 = stackOut_54_1;
                        break L20;
                      }
                      if (stackIn_55_0 == stackIn_55_1) {
                        var8 = 1;
                        break L15;
                      } else {
                        break L15;
                      }
                    }
                  } else {
                    break L15;
                  }
                }
              }
            }
            if (var8 != 0) {
              L22: {
                L23: {
                  param2.field_w.f(param2.field_E);
                  if (param1 == null) {
                    break L23;
                  } else {
                    param2.field_w.a(param1, param4, param3);
                    if (var11 == 0) {
                      break L22;
                    } else {
                      break L23;
                    }
                  }
                }
                param2.field_w.a(param3);
                break L22;
              }
              L24: {
                if (!param2.field_w.i()) {
                  break L24;
                } else {
                  this.field_A.field_o.a(param2.field_w);
                  break L24;
                }
              }
              L25: {
                param2.a(0);
                if (-1 < (param2.field_j ^ -1)) {
                  break L25;
                } else {
                  param2.a(false);
                  if ((param2.field_t ^ -1) >= -1) {
                    break L25;
                  } else {
                    if (this.field_J[param2.field_F][param2.field_t] != param2) {
                      break L25;
                    } else {
                      this.field_J[param2.field_F][param2.field_t] = null;
                      break L25;
                    }
                  }
                }
              }
              stackOut_70_0 = 1;
              stackIn_71_0 = stackOut_70_0;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              param2.field_w.a(param2.field_E, this.a(param2, -109), this.a(param2, (byte) 59));
              stackOut_72_0 = 0;
              stackIn_73_0 = stackOut_72_0;
              decompiledRegionSelector0 = 2;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L26: {
            var6 = decompiledCaughtException;
            stackOut_74_0 = (RuntimeException) (var6);
            stackOut_74_1 = new StringBuilder().append("fl.H(").append(param0).append(',');
            stackIn_76_0 = stackOut_74_0;
            stackIn_76_1 = stackOut_74_1;
            stackIn_75_0 = stackOut_74_0;
            stackIn_75_1 = stackOut_74_1;
            if (param1 == null) {
              stackOut_76_0 = (RuntimeException) ((Object) stackIn_76_0);
              stackOut_76_1 = (StringBuilder) ((Object) stackIn_76_1);
              stackOut_76_2 = "null";
              stackIn_77_0 = stackOut_76_0;
              stackIn_77_1 = stackOut_76_1;
              stackIn_77_2 = stackOut_76_2;
              break L26;
            } else {
              stackOut_75_0 = (RuntimeException) ((Object) stackIn_75_0);
              stackOut_75_1 = (StringBuilder) ((Object) stackIn_75_1);
              stackOut_75_2 = "{...}";
              stackIn_77_0 = stackOut_75_0;
              stackIn_77_1 = stackOut_75_1;
              stackIn_77_2 = stackOut_75_2;
              break L26;
            }
          }
          L27: {
            stackOut_77_0 = (RuntimeException) ((Object) stackIn_77_0);
            stackOut_77_1 = ((StringBuilder) (Object) stackIn_77_1).append(stackIn_77_2).append(',');
            stackIn_79_0 = stackOut_77_0;
            stackIn_79_1 = stackOut_77_1;
            stackIn_78_0 = stackOut_77_0;
            stackIn_78_1 = stackOut_77_1;
            if (param2 == null) {
              stackOut_79_0 = (RuntimeException) ((Object) stackIn_79_0);
              stackOut_79_1 = (StringBuilder) ((Object) stackIn_79_1);
              stackOut_79_2 = "null";
              stackIn_80_0 = stackOut_79_0;
              stackIn_80_1 = stackOut_79_1;
              stackIn_80_2 = stackOut_79_2;
              break L27;
            } else {
              stackOut_78_0 = (RuntimeException) ((Object) stackIn_78_0);
              stackOut_78_1 = (StringBuilder) ((Object) stackIn_78_1);
              stackOut_78_2 = "{...}";
              stackIn_80_0 = stackOut_78_0;
              stackIn_80_1 = stackOut_78_1;
              stackIn_80_2 = stackOut_78_2;
              break L27;
            }
          }
          throw bd.a((Throwable) ((Object) stackIn_80_0), stackIn_80_2 + ',' + param3 + ',' + param4 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_9_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_71_0 != 0;
          } else {
            return stackIn_73_0 != 0;
          }
        }
    }

    private final synchronized void a(int param0, int param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        L0: {
          L1: {
            var5 = wizardrun.field_H;
            if (param2 >= 0) {
              break L1;
            } else {
              var4 = 0;
              L2: while (true) {
                L3: {
                  if ((var4 ^ -1) <= -17) {
                    break L3;
                  } else {
                    this.field_R[var4] = param0;
                    var4++;
                    if (var5 != 0) {
                      break L0;
                    } else {
                      if (var5 == 0) {
                        continue L2;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
                if (var5 == 0) {
                  break L0;
                } else {
                  break L1;
                }
              }
            }
          }
          this.field_R[param2] = param0;
          break L0;
        }
        L4: {
          if (param1 > 99) {
            break L4;
          } else {
            field_T = (byte[][][]) null;
            break L4;
          }
        }
    }

    final synchronized int d() {
        return 0;
    }

    final static void f(int param0, int param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int stackIn_5_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_4_0 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var3 = wizardrun.field_H;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        wizardrun.a(true, (byte) 11, param0, lg.field_d, dg.field_d, rb.field_e, 0);
                        var2_int = 0;
                        if (param1 == 16) {
                            statePc = 3;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 2: {
                    return;
                }
                case 3: {
                    stackOut_3_0 = lg.field_d;
                    stackIn_5_0 = stackOut_3_0;
                    statePc = 5;
                    continue stateLoop;
                }
                case 4: {
                    try {
                        stackOut_4_0 = lg.field_d;
                        stackIn_5_0 = stackOut_4_0;
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        if ((stackIn_5_0 ^ -1) >= (var2_int ^ -1)) {
                            statePc = 9;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        sj.field_m[param0 + var2_int] = var2_int;
                        var2_int++;
                        if (var3 != 0) {
                            statePc = 10;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        if (var3 == 0) {
                            statePc = 4;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        wizardrun.a(false, (byte) 11, param0 - -param0, lg.field_d + param0, gf.field_W, dj.field_b, param0);
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        if (lg.field_d > param0) {
                            statePc = 12;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        statePc = 15;
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        lg.field_d = param0;
                        statePc = 15;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 14: {
                    var2 = (RuntimeException) ((Object) caughtException);
                    throw bd.a((Throwable) ((Object) var2), "fl.QA(" + param0 + ',' + param1 + ')');
                }
                case 15: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    private final int a(vk param0, int param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        q var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int stackIn_3_0 = 0;
        int stackIn_18_0 = 0;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_2_0 = 0;
        int stackOut_17_0 = 0;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        try {
          L0: {
            var3_int = 123 / ((49 - param1) / 44);
            if (this.field_R[param0.field_F] == 0) {
              stackOut_2_0 = 0;
              stackIn_3_0 = stackOut_2_0;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L1: {
                var4 = param0.field_i;
                var5 = 4096 + this.field_N[param0.field_F] * this.field_v[param0.field_F] >> 293544461;
                var5 = var5 * var5 - -16384 >> 687053679;
                var5 = 16384 + param0.field_D * var5 >> 531806927;
                var5 = 128 + this.field_m * var5 >> -1958504216;
                var5 = 128 + var5 * this.field_R[param0.field_F] >> -704821432;
                if ((var4.field_h ^ -1) >= -1) {
                  break L1;
                } else {
                  var5 = (int)((double)var5 * Math.pow(0.5, (double)var4.field_h * ((double)param0.field_m * 0.00001953125)) + 0.5);
                  break L1;
                }
              }
              L2: {
                if (null == var4.field_f) {
                  break L2;
                } else {
                  L3: {
                    var6 = param0.field_K;
                    var7 = var4.field_f[1 + param0.field_n];
                    if (param0.field_n >= -2 + var4.field_f.length) {
                      break L3;
                    } else {
                      var8 = (var4.field_f[param0.field_n] & 255) << 153508648;
                      var9 = (255 & var4.field_f[param0.field_n - -2]) << 594838920;
                      var7 = var7 + (-var7 + var4.field_f[param0.field_n - -3]) * (var6 - var8) / (-var8 + var9);
                      break L3;
                    }
                  }
                  var5 = var5 * var7 + 32 >> 954150214;
                  break L2;
                }
              }
              L4: {
                if (-1 <= (param0.field_j ^ -1)) {
                  break L4;
                } else {
                  if (null != var4.field_c) {
                    L5: {
                      var6 = param0.field_j;
                      var7 = var4.field_c[1 + param0.field_s];
                      if (var4.field_c.length + -2 > param0.field_s) {
                        var8 = var4.field_c[param0.field_s] << -552342264 & 65280;
                        var9 = (var4.field_c[param0.field_s - -2] & 255) << 370316840;
                        var7 = var7 + (var6 - var8) * (var4.field_c[3 + param0.field_s] - var7) / (-var8 + var9);
                        break L5;
                      } else {
                        break L5;
                      }
                    }
                    var5 = var7 * var5 - -32 >> -469982938;
                    break L4;
                  } else {
                    break L4;
                  }
                }
              }
              stackOut_17_0 = var5;
              stackIn_18_0 = stackOut_17_0;
              decompiledRegionSelector0 = 1;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var3 = decompiledCaughtException;
            stackOut_19_0 = (RuntimeException) (var3);
            stackOut_19_1 = new StringBuilder().append("fl.U(");
            stackIn_21_0 = stackOut_19_0;
            stackIn_21_1 = stackOut_19_1;
            stackIn_20_0 = stackOut_19_0;
            stackIn_20_1 = stackOut_19_1;
            if (param0 == null) {
              stackOut_21_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackOut_21_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackOut_21_2 = "null";
              stackIn_22_0 = stackOut_21_0;
              stackIn_22_1 = stackOut_21_1;
              stackIn_22_2 = stackOut_21_2;
              break L6;
            } else {
              stackOut_20_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackOut_20_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackOut_20_2 = "{...}";
              stackIn_22_0 = stackOut_20_0;
              stackIn_22_1 = stackOut_20_1;
              stackIn_22_2 = stackOut_20_2;
              break L6;
            }
          }
          throw bd.a((Throwable) ((Object) stackIn_22_0), stackIn_22_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          return stackIn_18_0;
        }
    }

    private final void a(int param0, int param1, int param2, byte param3) {
        vk var6 = null;
        int var7 = 0;
        vk var8 = null;
        int stackIn_7_0 = 0;
        int stackIn_7_1 = 0;
        int stackIn_16_0 = 0;
        int stackIn_16_1 = 0;
        int stackOut_6_0 = 0;
        int stackOut_6_1 = 0;
        byte stackOut_15_0 = 0;
        int stackOut_15_1 = 0;
        var7 = wizardrun.field_H;
        var8 = this.field_S[param2][param0];
        if (var8 == null) {
          return;
        } else {
          L0: {
            L1: {
              L2: {
                this.field_S[param2][param0] = null;
                if ((this.field_y[param2] & 2) == 0) {
                  break L2;
                } else {
                  var6 = (vk) ((Object) this.field_A.field_p.b((byte) 84));
                  L3: while (true) {
                    L4: {
                      if (var6 == null) {
                        break L4;
                      } else {
                        stackOut_6_0 = var8.field_F ^ -1;
                        stackOut_6_1 = var6.field_F ^ -1;
                        stackIn_16_0 = stackOut_6_0;
                        stackIn_16_1 = stackOut_6_1;
                        stackIn_7_0 = stackOut_6_0;
                        stackIn_7_1 = stackOut_6_1;
                        if (var7 != 0) {
                          break L0;
                        } else {
                          L5: {
                            if (stackIn_7_0 != stackIn_7_1) {
                              break L5;
                            } else {
                              if (-1 >= (var6.field_j ^ -1)) {
                                break L5;
                              } else {
                                if (var6 != var8) {
                                  var8.field_j = 0;
                                  if (var7 == 0) {
                                    break L4;
                                  } else {
                                    break L5;
                                  }
                                } else {
                                  break L5;
                                }
                              }
                            }
                          }
                          var6 = (vk) ((Object) this.field_A.field_p.d(8192));
                          if (var7 == 0) {
                            continue L3;
                          } else {
                            break L4;
                          }
                        }
                      }
                    }
                    if (var7 == 0) {
                      break L1;
                    } else {
                      break L2;
                    }
                  }
                }
              }
              var8.field_j = 0;
              break L1;
            }
            stackOut_15_0 = param3;
            stackOut_15_1 = -16;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            break L0;
          }
          L6: {
            if (stackIn_16_0 == stackIn_16_1) {
              break L6;
            } else {
              this.field_P = (int[]) null;
              break L6;
            }
          }
          return;
        }
    }

    final synchronized void a(int[] param0, int param1, int param2) {
        RuntimeException var4 = null;
        int var4_int = 0;
        long var5 = 0L;
        int var7 = 0;
        int var8 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        var8 = wizardrun.field_H;
        try {
          L0: {
            L1: {
              L2: {
                if (this.field_E.c()) {
                  var4_int = this.field_r * this.field_E.field_d / c.field_l;
                  L3: while (true) {
                    L4: {
                      var5 = this.field_K + (long)param2 * (long)var4_int;
                      if (this.field_n + -var5 < 0L) {
                        break L4;
                      } else {
                        this.field_K = var5;
                        if (var8 != 0) {
                          break L1;
                        } else {
                          if (var8 == 0) {
                            break L2;
                          } else {
                            break L4;
                          }
                        }
                      }
                    }
                    L5: {
                      var7 = (int)((-1L + (long)var4_int + (-this.field_K + this.field_n)) / (long)var4_int);
                      this.field_K = this.field_K + (long)var7 * (long)var4_int;
                      this.field_A.a(param0, param1, var7);
                      param1 = param1 + var7;
                      param2 = param2 - var7;
                      this.c(false);
                      if (this.field_E.c()) {
                        break L5;
                      } else {
                        if (var8 == 0) {
                          break L2;
                        } else {
                          break L5;
                        }
                      }
                    }
                    if (var8 == 0) {
                      continue L3;
                    } else {
                      this.field_A.a(param0, param1, param2);
                      break L1;
                    }
                  }
                } else {
                  break L2;
                }
              }
              this.field_A.a(param0, param1, param2);
              break L1;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var4 = decompiledCaughtException;
            stackOut_15_0 = (RuntimeException) (var4);
            stackOut_15_1 = new StringBuilder().append("fl.D(");
            stackIn_17_0 = stackOut_15_0;
            stackIn_17_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param0 == null) {
              stackOut_17_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackOut_17_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackOut_17_2 = "null";
              stackIn_18_0 = stackOut_17_0;
              stackIn_18_1 = stackOut_17_1;
              stackIn_18_2 = stackOut_17_2;
              break L6;
            } else {
              stackOut_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackOut_16_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackOut_16_2 = "{...}";
              stackIn_18_0 = stackOut_16_0;
              stackIn_18_1 = stackOut_16_1;
              stackIn_18_2 = stackOut_16_2;
              break L6;
            }
          }
          throw bd.a((Throwable) ((Object) stackIn_18_0), stackIn_18_2 + ',' + param1 + ',' + param2 + ')');
        }
    }

    private final void b(int param0, int param1, int param2) {
        this.field_I[param0] = param1;
        if (param2 != 38) {
            this.d(11, -69, 19);
        }
    }

    private final void a(boolean param0, byte param1) {
        int var3 = 0;
        int var4 = 0;
        L0: {
          var4 = wizardrun.field_H;
          if (!param0) {
            this.g(-1, -1);
            if (var4 == 0) {
              break L0;
            } else {
              this.d(0, -1);
              break L0;
            }
          } else {
            this.d(0, -1);
            break L0;
          }
        }
        this.a(-1, (byte) 21);
        var3 = 0;
        L1: while (true) {
          L2: {
            L3: {
              if (16 <= var3) {
                break L3;
              } else {
                this.field_P[var3] = this.field_O[var3];
                var3++;
                if (var4 != 0) {
                  break L2;
                } else {
                  if (var4 == 0) {
                    continue L1;
                  } else {
                    break L3;
                  }
                }
              }
            }
            var3 = 0;
            break L2;
          }
          L4: {
            if (param1 <= -62) {
              break L4;
            } else {
              this.f(-85, 122, -57);
              break L4;
            }
          }
          L5: while (true) {
            L6: {
              if (16 <= var3) {
                break L6;
              } else {
                this.field_w[var3] = kl.b(this.field_O[var3], -128);
                var3++;
                if (var4 != 0) {
                  break L6;
                } else {
                  if (var4 == 0) {
                    continue L5;
                  } else {
                    break L6;
                  }
                }
              }
            }
            return;
          }
        }
    }

    private final void b(int param0, int param1) {
        vk var3 = null;
        int var4 = 0;
        L0: {
          var4 = wizardrun.field_H;
          if (param0 != (4 & this.field_y[param1] ^ -1)) {
            var3 = (vk) ((Object) this.field_A.field_p.b((byte) 55));
            L1: while (true) {
              if (var3 == null) {
                break L0;
              } else {
                if (var4 != 0) {
                  break L0;
                } else {
                  L2: {
                    if (param1 == var3.field_F) {
                      var3.field_H = 0;
                      break L2;
                    } else {
                      break L2;
                    }
                  }
                  var3 = (vk) ((Object) this.field_A.field_p.d(8192));
                  if (var4 == 0) {
                    continue L1;
                  } else {
                    break L0;
                  }
                }
              }
            }
          } else {
            break L0;
          }
        }
    }

    final synchronized k a() {
        return (k) ((Object) this.field_A);
    }

    private final void d(int param0, int param1) {
        vk var3 = null;
        int var4 = 0;
        var4 = wizardrun.field_H;
        if (param0 != 0) {
          return;
        } else {
          var3 = (vk) ((Object) this.field_A.field_p.b((byte) 92));
          L0: while (true) {
            L1: {
              if (var3 == null) {
                break L1;
              } else {
                if (var4 != 0) {
                  break L1;
                } else {
                  L2: {
                    L3: {
                      if ((param1 ^ -1) > -1) {
                        break L3;
                      } else {
                        if (var3.field_F == param1) {
                          break L3;
                        } else {
                          break L2;
                        }
                      }
                    }
                    L4: {
                      if (var3.field_w != null) {
                        L5: {
                          var3.field_w.f(c.field_l / 100);
                          if (var3.field_w.i()) {
                            this.field_A.field_o.a(var3.field_w);
                            break L5;
                          } else {
                            break L5;
                          }
                        }
                        var3.a(0);
                        break L4;
                      } else {
                        break L4;
                      }
                    }
                    L6: {
                      if (var3.field_j >= 0) {
                        break L6;
                      } else {
                        this.field_S[var3.field_F][var3.field_k] = null;
                        break L6;
                      }
                    }
                    var3.a(false);
                    break L2;
                  }
                  var3 = (vk) ((Object) this.field_A.field_p.d(8192));
                  if (var4 == 0) {
                    continue L0;
                  } else {
                    break L1;
                  }
                }
              }
            }
            return;
          }
        }
    }

    private final void d(int param0, int param1, int param2) {
        if (param1 != 2) {
            fl.f(67, -78);
        }
    }

    public fl() {
        this.field_r = 1000000;
        this.field_D = new int[16];
        this.field_R = new int[16];
        this.field_Q = new int[16];
        this.field_w = new int[16];
        this.field_N = new int[16];
        this.field_y = new int[16];
        this.field_B = new int[16];
        this.field_t = new int[16];
        this.field_P = new int[16];
        this.field_S = new vk[16][128];
        this.field_I = new int[16];
        this.field_C = new int[16];
        this.field_v = new int[16];
        this.field_z = new int[16];
        this.field_O = new int[16];
        this.field_J = new vk[16][128];
        this.field_m = 256;
        this.field_L = new int[16];
        this.field_o = new int[16];
        this.field_E = new wf();
        this.field_A = new he((fl) (this));
        this.field_G = new ab(128);
        this.a(256, 114, -1);
        this.a(true, (byte) -67);
    }

    static {
        sk.a(16062, 50);
    }
}
