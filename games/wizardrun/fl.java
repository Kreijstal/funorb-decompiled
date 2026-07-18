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
        RuntimeException runtimeException = null;
        int var4_int = 0;
        int var5 = 0;
        RuntimeException decompiledCaughtException = null;
        var5 = wizardrun.field_H;
        try {
          L0: {
            L1: {
              L2: {
                if (param1 == ((fl) this).field_P[param2]) {
                  break L2;
                } else {
                  ((fl) this).field_P[param2] = param1;
                  var4_int = 0;
                  L3: while (true) {
                    if (var4_int >= 128) {
                      break L2;
                    } else {
                      ((fl) this).field_J[param2][var4_int] = null;
                      var4_int++;
                      if (var5 != 0) {
                        break L1;
                      } else {
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
              if (param0 == -129) {
                break L1;
              } else {
                this.c(93, -111, 85);
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw bd.a((Throwable) (Object) runtimeException, "fl.L(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    private final int a(vk param0, byte param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int stackIn_5_0 = 0;
        int stackIn_7_0 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_6_0 = 0;
        int stackOut_4_0 = 0;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        try {
          L0: {
            L1: {
              var3_int = ((fl) this).field_B[param0.field_F];
              if (param1 >= 54) {
                break L1;
              } else {
                ((fl) this).a(-24);
                break L1;
              }
            }
            if (var3_int >= 8192) {
              stackOut_6_0 = -((-var3_int + 16384) * (128 + -param0.field_B) - -32 >> 632376358) + 16384;
              stackIn_7_0 = stackOut_6_0;
              break L0;
            } else {
              stackOut_4_0 = 32 + param0.field_B * var3_int >> 750746630;
              stackIn_5_0 = stackOut_4_0;
              return stackIn_5_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) var3;
            stackOut_8_1 = new StringBuilder().append("fl.CA(");
            stackIn_11_0 = stackOut_8_0;
            stackIn_11_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param0 == null) {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L2;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_12_0 = stackOut_9_0;
              stackIn_12_1 = stackOut_9_1;
              stackIn_12_2 = stackOut_9_2;
              break L2;
            }
          }
          throw bd.a((Throwable) (Object) stackIn_12_0, stackIn_12_2 + ',' + param1 + ')');
        }
        return stackIn_7_0;
    }

    final synchronized boolean a(kl param0, int param1, ue param2, ji param3, int param4) {
        RuntimeException var6 = null;
        int var6_int = 0;
        Object var7 = null;
        pb var8 = null;
        int var9 = 0;
        h var10 = null;
        int var11 = 0;
        int stackIn_26_0 = 0;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_31_2 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        RuntimeException stackIn_35_0 = null;
        StringBuilder stackIn_35_1 = null;
        String stackIn_35_2 = null;
        RuntimeException stackIn_36_0 = null;
        StringBuilder stackIn_36_1 = null;
        RuntimeException stackIn_38_0 = null;
        StringBuilder stackIn_38_1 = null;
        RuntimeException stackIn_39_0 = null;
        StringBuilder stackIn_39_1 = null;
        String stackIn_39_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_25_0 = 0;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        String stackOut_30_2 = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        String stackOut_28_2 = null;
        RuntimeException stackOut_31_0 = null;
        StringBuilder stackOut_31_1 = null;
        RuntimeException stackOut_34_0 = null;
        StringBuilder stackOut_34_1 = null;
        String stackOut_34_2 = null;
        RuntimeException stackOut_32_0 = null;
        StringBuilder stackOut_32_1 = null;
        String stackOut_32_2 = null;
        RuntimeException stackOut_35_0 = null;
        StringBuilder stackOut_35_1 = null;
        RuntimeException stackOut_38_0 = null;
        StringBuilder stackOut_38_1 = null;
        String stackOut_38_2 = null;
        RuntimeException stackOut_36_0 = null;
        StringBuilder stackOut_36_1 = null;
        String stackOut_36_2 = null;
        var11 = wizardrun.field_H;
        try {
          L0: {
            L1: {
              param3.a();
              var6_int = 1;
              var7 = null;
              if (param1 > ~param4) {
                var7 = (Object) (Object) new int[]{param4};
                break L1;
              } else {
                break L1;
              }
            }
            var8 = (pb) (Object) param3.field_i.b((byte) 61);
            L2: while (true) {
              L3: {
                L4: {
                  if (null == var8) {
                    break L4;
                  } else {
                    var9 = (int)var8.field_e;
                    var10 = (h) (Object) ((fl) this).field_G.a(1, (long)var9);
                    if (var11 != 0) {
                      break L3;
                    } else {
                      L5: {
                        L6: {
                          if (null != var10) {
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
                            ((fl) this).field_G.a((wl) (Object) var10, -9, (long)var9);
                            break L6;
                          }
                        }
                        if (!var10.a(var8.field_j, param2, -75, (int[]) var7)) {
                          var6_int = 0;
                          break L5;
                        } else {
                          break L5;
                        }
                      }
                      var8 = (pb) (Object) param3.field_i.b(1);
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
              stackOut_25_0 = var6_int;
              stackIn_26_0 = stackOut_25_0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var6 = decompiledCaughtException;
            stackOut_27_0 = (RuntimeException) var6;
            stackOut_27_1 = new StringBuilder().append("fl.FA(");
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
              break L8;
            } else {
              stackOut_28_0 = (RuntimeException) (Object) stackIn_28_0;
              stackOut_28_1 = (StringBuilder) (Object) stackIn_28_1;
              stackOut_28_2 = "{...}";
              stackIn_31_0 = stackOut_28_0;
              stackIn_31_1 = stackOut_28_1;
              stackIn_31_2 = stackOut_28_2;
              break L8;
            }
          }
          L9: {
            stackOut_31_0 = (RuntimeException) (Object) stackIn_31_0;
            stackOut_31_1 = ((StringBuilder) (Object) stackIn_31_1).append(stackIn_31_2).append(',').append(param1).append(',');
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
          L10: {
            stackOut_35_0 = (RuntimeException) (Object) stackIn_35_0;
            stackOut_35_1 = ((StringBuilder) (Object) stackIn_35_1).append(stackIn_35_2).append(',');
            stackIn_38_0 = stackOut_35_0;
            stackIn_38_1 = stackOut_35_1;
            stackIn_36_0 = stackOut_35_0;
            stackIn_36_1 = stackOut_35_1;
            if (param3 == null) {
              stackOut_38_0 = (RuntimeException) (Object) stackIn_38_0;
              stackOut_38_1 = (StringBuilder) (Object) stackIn_38_1;
              stackOut_38_2 = "null";
              stackIn_39_0 = stackOut_38_0;
              stackIn_39_1 = stackOut_38_1;
              stackIn_39_2 = stackOut_38_2;
              break L10;
            } else {
              stackOut_36_0 = (RuntimeException) (Object) stackIn_36_0;
              stackOut_36_1 = (StringBuilder) (Object) stackIn_36_1;
              stackOut_36_2 = "{...}";
              stackIn_39_0 = stackOut_36_0;
              stackIn_39_1 = stackOut_36_1;
              stackIn_39_2 = stackOut_36_2;
              break L10;
            }
          }
          throw bd.a((Throwable) (Object) stackIn_39_0, stackIn_39_2 + ',' + param4 + ')');
        }
        return stackIn_26_0 != 0;
    }

    final synchronized k c() {
        RuntimeException var1 = null;
        Object stackIn_1_0 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_0_0 = null;
        try {
          L0: {
            stackOut_0_0 = null;
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw bd.a((Throwable) (Object) var1, "fl.F()");
        }
        return (k) (Object) stackIn_1_0;
    }

    private final void a(int param0, int param1, int param2, int param3) {
        RuntimeException var5 = null;
        vk var5_ref = null;
        h var5_ref2 = null;
        je var6 = null;
        int var6_int = 0;
        vk var7 = null;
        vk var8 = null;
        int var9 = 0;
        Object stackIn_26_0 = null;
        int stackIn_26_1 = 0;
        Object stackIn_28_0 = null;
        int stackIn_28_1 = 0;
        Object stackIn_30_0 = null;
        int stackIn_30_1 = 0;
        Object stackIn_31_0 = null;
        int stackIn_31_1 = 0;
        int stackIn_31_2 = 0;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_25_0 = null;
        int stackOut_25_1 = 0;
        Object stackOut_30_0 = null;
        int stackOut_30_1 = 0;
        int stackOut_30_2 = 0;
        Object stackOut_26_0 = null;
        int stackOut_26_1 = 0;
        Object stackOut_28_0 = null;
        int stackOut_28_1 = 0;
        int stackOut_28_2 = 0;
        var9 = wizardrun.field_H;
        try {
          L0: {
            L1: {
              this.a(param3, 64, param0, (byte) -16);
              if ((((fl) this).field_y[param0] & 2) != 0) {
                var5_ref = (vk) (Object) ((fl) this).field_A.field_p.a((byte) 11);
                L2: while (true) {
                  if (null == var5_ref) {
                    break L1;
                  } else {
                    L3: {
                      if (param0 != var5_ref.field_F) {
                        break L3;
                      } else {
                        if (var5_ref.field_j >= 0) {
                          break L3;
                        } else {
                          ((fl) this).field_S[param0][var5_ref.field_k] = null;
                          ((fl) this).field_S[param0][param3] = var5_ref;
                          var6_int = var5_ref.field_z + (var5_ref.field_y * var5_ref.field_I >> 1545564876);
                          var5_ref.field_z = var5_ref.field_z + (-var5_ref.field_k + param3 << 886715048);
                          var5_ref.field_k = param3;
                          var5_ref.field_I = -var5_ref.field_z + var6_int;
                          var5_ref.field_y = 4096;
                          return;
                        }
                      }
                    }
                    var5_ref = (vk) (Object) ((fl) this).field_A.field_p.a(102);
                    if (var9 == 0) {
                      continue L2;
                    } else {
                      break L1;
                    }
                  }
                }
              } else {
                break L1;
              }
            }
            var5_ref2 = (h) (Object) ((fl) this).field_G.a(1, (long)((fl) this).field_P[param0]);
            if (null == var5_ref2) {
              return;
            } else {
              var6 = var5_ref2.field_k[param3];
              if (var6 == null) {
                return;
              } else {
                L4: {
                  L5: {
                    var7 = new vk();
                    var7.field_C = var5_ref2;
                    var7.field_F = param0;
                    var7.field_v = var6;
                    var7.field_i = var5_ref2.field_t[param3];
                    var7.field_t = var5_ref2.field_l[param3];
                    var7.field_k = param3;
                    var7.field_D = 1024 + param1 * (param1 * var5_ref2.field_n) * var5_ref2.field_q[param3] >> 864177931;
                    var7.field_B = 255 & var5_ref2.field_o[param3];
                    var7.field_z = -(var5_ref2.field_r[param3] & 32767) + (param3 << -1562016536);
                    var7.field_m = 0;
                    var7.field_K = 0;
                    var7.field_j = -1;
                    var7.field_n = 0;
                    var7.field_s = param2;
                    if (((fl) this).field_o[param0] != 0) {
                      break L5;
                    } else {
                      var7.field_w = uj.a(var6, this.a(-822, var7), this.a(var7, -98), this.a(var7, (byte) 105));
                      if (var9 == 0) {
                        break L4;
                      } else {
                        break L5;
                      }
                    }
                  }
                  L6: {
                    var7.field_w = uj.a(var6, this.a(param2 ^ -822, var7), 0, this.a(var7, (byte) 79));
                    stackOut_25_0 = this;
                    stackOut_25_1 = 15;
                    stackIn_30_0 = stackOut_25_0;
                    stackIn_30_1 = stackOut_25_1;
                    stackIn_26_0 = stackOut_25_0;
                    stackIn_26_1 = stackOut_25_1;
                    if (var5_ref2.field_r[param3] >= 0) {
                      stackOut_30_0 = this;
                      stackOut_30_1 = stackIn_30_1;
                      stackOut_30_2 = 0;
                      stackIn_31_0 = stackOut_30_0;
                      stackIn_31_1 = stackOut_30_1;
                      stackIn_31_2 = stackOut_30_2;
                      break L6;
                    } else {
                      stackOut_26_0 = this;
                      stackOut_26_1 = stackIn_26_1;
                      stackIn_28_0 = stackOut_26_0;
                      stackIn_28_1 = stackOut_26_1;
                      stackOut_28_0 = this;
                      stackOut_28_1 = stackIn_28_1;
                      stackOut_28_2 = 1;
                      stackIn_31_0 = stackOut_28_0;
                      stackIn_31_1 = stackOut_28_1;
                      stackIn_31_2 = stackOut_28_2;
                      break L6;
                    }
                  }
                  ((fl) this).a(stackIn_31_1, stackIn_31_2 != 0, var7);
                  break L4;
                }
                L7: {
                  if (0 <= var5_ref2.field_r[param3]) {
                    break L7;
                  } else {
                    var7.field_w.e(-1);
                    break L7;
                  }
                }
                L8: {
                  if (var7.field_t < 0) {
                    break L8;
                  } else {
                    L9: {
                      var8 = ((fl) this).field_J[param0][var7.field_t];
                      if (null == var8) {
                        break L9;
                      } else {
                        if (var8.field_j >= 0) {
                          break L9;
                        } else {
                          ((fl) this).field_S[param0][var8.field_k] = null;
                          var8.field_j = 0;
                          break L9;
                        }
                      }
                    }
                    ((fl) this).field_J[param0][var7.field_t] = var7;
                    break L8;
                  }
                }
                ((fl) this).field_A.field_p.a((wl) (Object) var7, false);
                ((fl) this).field_S[param0][param3] = var7;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          throw bd.a((Throwable) (Object) var5, "fl.N(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final synchronized void b(boolean param0) {
        h var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        RuntimeException decompiledCaughtException = null;
        var3 = wizardrun.field_H;
        try {
          L0: {
            L1: {
              if (param0) {
                break L1;
              } else {
                ((fl) this).a(-72, 96);
                break L1;
              }
            }
            var2 = (h) (Object) ((fl) this).field_G.b((byte) -87);
            L2: while (true) {
              L3: {
                L4: {
                  if (null == var2) {
                    break L4;
                  } else {
                    var2.a(-106);
                    var2 = (h) (Object) ((fl) this).field_G.b(1);
                    if (var3 != 0) {
                      break L3;
                    } else {
                      if (var3 == 0) {
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
          var2_ref = decompiledCaughtException;
          throw bd.a((Throwable) (Object) var2_ref, "fl.P(" + param0 + ')');
        }
    }

    private final void c(boolean param0) {
        RuntimeException var2 = null;
        int var2_int = 0;
        int var3 = 0;
        long var4 = 0L;
        int var6 = 0;
        int var7 = 0;
        int stackIn_8_0 = 0;
        int stackIn_8_1 = 0;
        int stackIn_10_0 = 0;
        int stackIn_10_1 = 0;
        int stackIn_12_0 = 0;
        int stackIn_12_1 = 0;
        int stackIn_43_0 = 0;
        int stackIn_43_1 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_7_0 = 0;
        int stackOut_7_1 = 0;
        int stackOut_9_0 = 0;
        int stackOut_9_1 = 0;
        int stackOut_11_0 = 0;
        int stackOut_11_1 = 0;
        int stackOut_41_0 = 0;
        int stackOut_41_1 = 0;
        var7 = wizardrun.field_H;
        try {
          L0: {
            L1: {
              var2_int = ((fl) this).field_p;
              var3 = ((fl) this).field_s;
              var4 = ((fl) this).field_n;
              if (((fl) this).field_x == null) {
                break L1;
              } else {
                if (var3 != ((fl) this).field_W) {
                  break L1;
                } else {
                  this.a(((fl) this).field_U, ((fl) this).field_q, 0, ((fl) this).field_x);
                  this.c(false);
                  return;
                }
              }
            }
            L2: while (true) {
              stackOut_7_0 = ((fl) this).field_s;
              stackOut_7_1 = var3;
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              L3: while (true) {
                L4: {
                  L5: {
                    L6: {
                      if (stackIn_8_0 != stackIn_8_1) {
                        break L6;
                      } else {
                        L7: while (true) {
                          stackOut_9_0 = ((fl) this).field_E.field_h[var2_int];
                          stackOut_9_1 = var3;
                          stackIn_43_0 = stackOut_9_0;
                          stackIn_43_1 = stackOut_9_1;
                          stackIn_10_0 = stackOut_9_0;
                          stackIn_10_1 = stackOut_9_1;
                          if (var7 != 0) {
                            break L5;
                          } else {
                            L8: {
                              if (stackIn_10_0 != stackIn_10_1) {
                                break L8;
                              } else {
                                ((fl) this).field_E.a(var2_int);
                                var6 = ((fl) this).field_E.d(var2_int);
                                stackOut_11_0 = -2;
                                stackOut_11_1 = ~var6;
                                stackIn_8_0 = stackOut_11_0;
                                stackIn_8_1 = stackOut_11_1;
                                stackIn_12_0 = stackOut_11_0;
                                stackIn_12_1 = stackOut_11_1;
                                if (var7 != 0) {
                                  continue L3;
                                } else {
                                  if (stackIn_12_0 == stackIn_12_1) {
                                    ((fl) this).field_E.g();
                                    ((fl) this).field_E.c(var2_int);
                                    if (!((fl) this).field_E.f()) {
                                      break L8;
                                    } else {
                                      if (((fl) this).field_x != null) {
                                        ((fl) this).a(((fl) this).field_U, -76, ((fl) this).field_x);
                                        this.c(false);
                                        return;
                                      } else {
                                        L9: {
                                          if (!((fl) this).field_U) {
                                            break L9;
                                          } else {
                                            if (0 != var3) {
                                              ((fl) this).field_E.a(var4);
                                              if (var7 == 0) {
                                                break L8;
                                              } else {
                                                break L9;
                                              }
                                            } else {
                                              break L9;
                                            }
                                          }
                                        }
                                        this.a(true, (byte) -91);
                                        ((fl) this).field_E.e();
                                        return;
                                      }
                                    }
                                  } else {
                                    L10: {
                                      if ((var6 & 128) != 0) {
                                        this.e(var6, 12035);
                                        break L10;
                                      } else {
                                        break L10;
                                      }
                                    }
                                    ((fl) this).field_E.b(var2_int);
                                    ((fl) this).field_E.c(var2_int);
                                    if (var7 == 0) {
                                      continue L7;
                                    } else {
                                      break L8;
                                    }
                                  }
                                }
                              }
                            }
                            var2_int = ((fl) this).field_E.b();
                            var3 = ((fl) this).field_E.field_h[var2_int];
                            var4 = ((fl) this).field_E.e(var3);
                            if (var7 == 0) {
                              continue L2;
                            } else {
                              break L6;
                            }
                          }
                        }
                      }
                    }
                    L11: {
                      ((fl) this).field_n = var4;
                      ((fl) this).field_s = var3;
                      ((fl) this).field_p = var2_int;
                      if (!param0) {
                        break L11;
                      } else {
                        ((fl) this).b(true);
                        break L11;
                      }
                    }
                    if (null == ((fl) this).field_x) {
                      break L4;
                    } else {
                      stackOut_41_0 = var3;
                      stackOut_41_1 = ((fl) this).field_W;
                      stackIn_43_0 = stackOut_41_0;
                      stackIn_43_1 = stackOut_41_1;
                      break L5;
                    }
                  }
                  if (stackIn_43_0 <= stackIn_43_1) {
                    break L4;
                  } else {
                    ((fl) this).field_p = -1;
                    ((fl) this).field_s = ((fl) this).field_W;
                    ((fl) this).field_n = ((fl) this).field_E.e(((fl) this).field_s);
                    break L4;
                  }
                }
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw bd.a((Throwable) (Object) var2, "fl.J(" + param0 + ')');
        }
    }

    final void a(int param0, boolean param1, vk param2) {
        RuntimeException runtimeException = null;
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
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
                var5 = (int)((long)var4_int * (long)((fl) this).field_o[param2.field_F] >> -65387962);
                if (wizardrun.field_H == 0) {
                  break L1;
                } else {
                  break L2;
                }
              }
              var6 = -param2.field_v.field_n + var4_int + var4_int;
              var5 = (int)((long)((fl) this).field_o[param2.field_F] * (long)var6 >> -518849466);
              var4_int = var4_int << 8;
              if (~var4_int >= ~var5) {
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
                ((fl) this).a(true, -14, (ji) null);
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
            stackOut_14_0 = (RuntimeException) runtimeException;
            stackOut_14_1 = new StringBuilder().append("fl.V(").append(param0).append(',').append(param1).append(',');
            stackIn_17_0 = stackOut_14_0;
            stackIn_17_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param2 == null) {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "null";
              stackIn_18_0 = stackOut_17_0;
              stackIn_18_1 = stackOut_17_1;
              stackIn_18_2 = stackOut_17_2;
              break L5;
            } else {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "{...}";
              stackIn_18_0 = stackOut_15_0;
              stackIn_18_1 = stackOut_15_1;
              stackIn_18_2 = stackOut_15_2;
              break L5;
            }
          }
          throw bd.a((Throwable) (Object) stackIn_18_0, stackIn_18_2 + ')');
        }
    }

    private final int a(int param0, vk param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        q var4 = null;
        int var5 = 0;
        int var6 = 0;
        double var7 = 0.0;
        int stackIn_19_0 = 0;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_18_0 = 0;
        int stackOut_16_0 = 0;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        try {
          L0: {
            L1: {
              var3_int = param1.field_z + (param1.field_I * param1.field_y >> 1550235596);
              var3_int = var3_int + ((-8192 + ((fl) this).field_I[param1.field_F]) * ((fl) this).field_D[param1.field_F] >> 295693516);
              var4 = param1.field_i;
              if (var4.field_k <= 0) {
                break L1;
              } else {
                L2: {
                  if (var4.field_e > 0) {
                    break L2;
                  } else {
                    if (0 >= ((fl) this).field_C[param1.field_F]) {
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
                var5 = var5 + (((fl) this).field_C[param1.field_F] >> -1326977945);
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
                k discarded$1 = ((fl) this).a();
                break L4;
              }
            }
            L5: {
              if (var5 < 1) {
                stackOut_18_0 = 1;
                stackIn_19_0 = stackOut_18_0;
                break L5;
              } else {
                stackOut_16_0 = var5;
                stackIn_19_0 = stackOut_16_0;
                break L5;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var3 = decompiledCaughtException;
            stackOut_20_0 = (RuntimeException) var3;
            stackOut_20_1 = new StringBuilder().append("fl.M(").append(param0).append(',');
            stackIn_23_0 = stackOut_20_0;
            stackIn_23_1 = stackOut_20_1;
            stackIn_21_0 = stackOut_20_0;
            stackIn_21_1 = stackOut_20_1;
            if (param1 == null) {
              stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
              stackOut_23_1 = (StringBuilder) (Object) stackIn_23_1;
              stackOut_23_2 = "null";
              stackIn_24_0 = stackOut_23_0;
              stackIn_24_1 = stackOut_23_1;
              stackIn_24_2 = stackOut_23_2;
              break L6;
            } else {
              stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "{...}";
              stackIn_24_0 = stackOut_21_0;
              stackIn_24_1 = stackOut_21_1;
              stackIn_24_2 = stackOut_21_2;
              break L6;
            }
          }
          throw bd.a((Throwable) (Object) stackIn_24_0, stackIn_24_2 + ')');
        }
        return stackIn_19_0;
    }

    private final void c(int param0, int param1, int param2) {
        RuntimeException var4 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              ((fl) this).field_z[param0] = param2;
              if (param1 > 113) {
                break L1;
              } else {
                ((fl) this).field_U = false;
                break L1;
              }
            }
            ((fl) this).field_Q[param0] = (int)(2097152.0 * Math.pow(2.0, 0.00054931640625 * (double)param2) + 0.5);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw bd.a((Throwable) (Object) var4, "fl.PA(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    private final void b(int param0, int param1, int param2, byte param3) {
        try {
            if (param3 <= 71) {
                ((fl) this).field_Q = null;
            }
        } catch (RuntimeException runtimeException) {
            throw bd.a((Throwable) (Object) runtimeException, "fl.I(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    private final void c(int param0, int param1) {
        RuntimeException var3 = null;
        vk var3_ref = null;
        int var4 = 0;
        RuntimeException decompiledCaughtException = null;
        var4 = wizardrun.field_H;
        try {
          L0: {
            if (param0 == 256) {
              L1: {
                L2: {
                  if ((2 & ((fl) this).field_y[param1]) != 0) {
                    var3_ref = (vk) (Object) ((fl) this).field_A.field_p.b((byte) 91);
                    L3: while (true) {
                      if (null == var3_ref) {
                        break L2;
                      } else {
                        if (var4 != 0) {
                          break L1;
                        } else {
                          L4: {
                            if (~param1 != ~var3_ref.field_F) {
                              break L4;
                            } else {
                              if (((fl) this).field_S[param1][var3_ref.field_k] != null) {
                                break L4;
                              } else {
                                if (var3_ref.field_j >= 0) {
                                  break L4;
                                } else {
                                  var3_ref.field_j = 0;
                                  break L4;
                                }
                              }
                            }
                          }
                          var3_ref = (vk) (Object) ((fl) this).field_A.field_p.d(param0 ^ 8448);
                          if (var4 == 0) {
                            continue L3;
                          } else {
                            break L2;
                          }
                        }
                      }
                    }
                  } else {
                    break L2;
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
          var3 = decompiledCaughtException;
          throw bd.a((Throwable) (Object) var3, "fl.GA(" + param0 + ',' + param1 + ')');
        }
    }

    private final void e(int param0, int param1) {
        RuntimeException var3 = null;
        int var3_int = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var8 = wizardrun.field_H;
        try {
          L0: {
            var3_int = 240 & param0;
            if (var3_int == 128) {
              var4 = 15 & param0;
              var5 = param0 >> -866125432 & 127;
              var6 = 127 & param0 >> -2107653744;
              this.a(var5, var6, var4, (byte) -16);
              return;
            } else {
              if (144 != var3_int) {
                if (var3_int != 160) {
                  if (176 == var3_int) {
                    L1: {
                      var4 = 15 & param0;
                      var5 = (param0 & 32628) >> 1440553864;
                      var6 = (param0 & 8367717) >> -1837133072;
                      if (var5 != 0) {
                        break L1;
                      } else {
                        ((fl) this).field_w[var4] = (var6 << 1764442766) + kl.b(((fl) this).field_w[var4], -2080769);
                        break L1;
                      }
                    }
                    L2: {
                      if (var5 != 32) {
                        break L2;
                      } else {
                        ((fl) this).field_w[var4] = (var6 << 1372312199) + kl.b(((fl) this).field_w[var4], -16257);
                        break L2;
                      }
                    }
                    L3: {
                      if (1 != var5) {
                        break L3;
                      } else {
                        ((fl) this).field_C[var4] = kl.b(((fl) this).field_C[var4], -16257) + (var6 << 1024628071);
                        break L3;
                      }
                    }
                    L4: {
                      if (var5 != 33) {
                        break L4;
                      } else {
                        ((fl) this).field_C[var4] = var6 + kl.b(-128, ((fl) this).field_C[var4]);
                        break L4;
                      }
                    }
                    L5: {
                      if (var5 != 5) {
                        break L5;
                      } else {
                        ((fl) this).field_t[var4] = (var6 << 296128583) + kl.b(-16257, ((fl) this).field_t[var4]);
                        break L5;
                      }
                    }
                    L6: {
                      if (var5 == 37) {
                        ((fl) this).field_t[var4] = var6 + kl.b(-128, ((fl) this).field_t[var4]);
                        break L6;
                      } else {
                        break L6;
                      }
                    }
                    L7: {
                      if (7 == var5) {
                        ((fl) this).field_N[var4] = kl.b(-16257, ((fl) this).field_N[var4]) + (var6 << -351277465);
                        break L7;
                      } else {
                        break L7;
                      }
                    }
                    L8: {
                      if (var5 != 39) {
                        break L8;
                      } else {
                        ((fl) this).field_N[var4] = kl.b(-128, ((fl) this).field_N[var4]) + var6;
                        break L8;
                      }
                    }
                    L9: {
                      if (10 == var5) {
                        ((fl) this).field_B[var4] = (var6 << -1639809817) + kl.b(((fl) this).field_B[var4], -16257);
                        break L9;
                      } else {
                        break L9;
                      }
                    }
                    L10: {
                      if (42 != var5) {
                        break L10;
                      } else {
                        ((fl) this).field_B[var4] = kl.b(((fl) this).field_B[var4], -128) - -var6;
                        break L10;
                      }
                    }
                    L11: {
                      if (var5 == 11) {
                        ((fl) this).field_v[var4] = (var6 << -1988995545) + kl.b(-16257, ((fl) this).field_v[var4]);
                        break L11;
                      } else {
                        break L11;
                      }
                    }
                    L12: {
                      if (var5 != 43) {
                        break L12;
                      } else {
                        ((fl) this).field_v[var4] = kl.b(-128, ((fl) this).field_v[var4]) - -var6;
                        break L12;
                      }
                    }
                    L13: {
                      if (var5 != 64) {
                        break L13;
                      } else {
                        L14: {
                          if (var6 < 64) {
                            break L14;
                          } else {
                            ((fl) this).field_y[var4] = sd.a(((fl) this).field_y[var4], 1);
                            if (var8 == 0) {
                              break L13;
                            } else {
                              break L14;
                            }
                          }
                        }
                        ((fl) this).field_y[var4] = kl.b(((fl) this).field_y[var4], -2);
                        break L13;
                      }
                    }
                    L15: {
                      if (var5 != 65) {
                        break L15;
                      } else {
                        L16: {
                          if (64 <= var6) {
                            break L16;
                          } else {
                            this.c(256, var4);
                            ((fl) this).field_y[var4] = kl.b(((fl) this).field_y[var4], -3);
                            if (var8 == 0) {
                              break L15;
                            } else {
                              break L16;
                            }
                          }
                        }
                        ((fl) this).field_y[var4] = sd.a(((fl) this).field_y[var4], 2);
                        break L15;
                      }
                    }
                    L17: {
                      if (99 != var5) {
                        break L17;
                      } else {
                        ((fl) this).field_L[var4] = (var6 << -2144810105) + kl.b(127, ((fl) this).field_L[var4]);
                        break L17;
                      }
                    }
                    L18: {
                      if (98 == var5) {
                        ((fl) this).field_L[var4] = var6 + kl.b(16256, ((fl) this).field_L[var4]);
                        break L18;
                      } else {
                        break L18;
                      }
                    }
                    L19: {
                      if (101 == var5) {
                        ((fl) this).field_L[var4] = kl.b(127, ((fl) this).field_L[var4]) + (16384 + (var6 << -1007552633));
                        break L19;
                      } else {
                        break L19;
                      }
                    }
                    L20: {
                      if (var5 != 100) {
                        break L20;
                      } else {
                        ((fl) this).field_L[var4] = kl.b(((fl) this).field_L[var4], 16256) + (16384 + var6);
                        break L20;
                      }
                    }
                    L21: {
                      if (var5 == 120) {
                        this.d(param1 + -12035, var4);
                        break L21;
                      } else {
                        break L21;
                      }
                    }
                    L22: {
                      if (var5 != 121) {
                        break L22;
                      } else {
                        this.a(var4, (byte) 21);
                        break L22;
                      }
                    }
                    L23: {
                      if (123 == var5) {
                        this.g(var4, -1);
                        break L23;
                      } else {
                        break L23;
                      }
                    }
                    L24: {
                      if (6 != var5) {
                        break L24;
                      } else {
                        var7 = ((fl) this).field_L[var4];
                        if (var7 == 16384) {
                          ((fl) this).field_D[var4] = (var6 << -1526149721) + kl.b(((fl) this).field_D[var4], -16257);
                          break L24;
                        } else {
                          break L24;
                        }
                      }
                    }
                    L25: {
                      if (38 == var5) {
                        var7 = ((fl) this).field_L[var4];
                        if (var7 == 16384) {
                          ((fl) this).field_D[var4] = kl.b(((fl) this).field_D[var4], -128) + var6;
                          break L25;
                        } else {
                          break L25;
                        }
                      } else {
                        break L25;
                      }
                    }
                    L26: {
                      if (16 == var5) {
                        ((fl) this).field_o[var4] = (var6 << -524404729) + kl.b(((fl) this).field_o[var4], -16257);
                        break L26;
                      } else {
                        break L26;
                      }
                    }
                    L27: {
                      if (var5 == 48) {
                        ((fl) this).field_o[var4] = kl.b(-128, ((fl) this).field_o[var4]) - -var6;
                        break L27;
                      } else {
                        break L27;
                      }
                    }
                    L28: {
                      if (var5 == 81) {
                        L29: {
                          if (var6 < 64) {
                            break L29;
                          } else {
                            ((fl) this).field_y[var4] = sd.a(((fl) this).field_y[var4], 4);
                            if (var8 == 0) {
                              break L28;
                            } else {
                              break L29;
                            }
                          }
                        }
                        this.b(-1, var4);
                        ((fl) this).field_y[var4] = kl.b(((fl) this).field_y[var4], -5);
                        break L28;
                      } else {
                        break L28;
                      }
                    }
                    L30: {
                      if (17 != var5) {
                        break L30;
                      } else {
                        this.c(var4, param1 ^ 12154, (var6 << 107386279) + (((fl) this).field_z[var4] & -16257));
                        break L30;
                      }
                    }
                    L31: {
                      if (var5 != 49) {
                        break L31;
                      } else {
                        this.c(var4, param1 ^ 12148, (-128 & ((fl) this).field_z[var4]) + var6);
                        break L31;
                      }
                    }
                    return;
                  } else {
                    if (192 != var3_int) {
                      L32: {
                        if (param1 == 12035) {
                          break L32;
                        } else {
                          ((fl) this).field_K = -72L;
                          break L32;
                        }
                      }
                      if (var3_int != 208) {
                        if (var3_int != 224) {
                          var3_int = param0 & 255;
                          if (var3_int != 255) {
                            decompiledRegionSelector0 = 1;
                            break L0;
                          } else {
                            this.a(true, (byte) -78);
                            decompiledRegionSelector0 = 0;
                            break L0;
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
                      this.e(-129, var5 + ((fl) this).field_w[var4], var4);
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
                L33: {
                  L34: {
                    var4 = param0 & 15;
                    var5 = param0 >> -1610455896 & 127;
                    var6 = param0 >> 444953232 & 127;
                    if (var6 <= 0) {
                      break L34;
                    } else {
                      this.a(var4, var6, 0, var5);
                      if (var8 == 0) {
                        break L33;
                      } else {
                        break L34;
                      }
                    }
                  }
                  this.a(var5, 64, var4, (byte) -16);
                  break L33;
                }
                return;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw bd.a((Throwable) (Object) var3, "fl.JA(" + param0 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final synchronized void a(int param0) {
        RuntimeException var2 = null;
        int var2_int = 0;
        long var3 = 0L;
        int var5 = 0;
        int var6 = 0;
        RuntimeException decompiledCaughtException = null;
        var6 = wizardrun.field_H;
        try {
          L0: {
            L1: {
              L2: {
                if (((fl) this).field_E.c()) {
                  var2_int = ((fl) this).field_r * ((fl) this).field_E.field_d / c.field_l;
                  L3: while (true) {
                    L4: {
                      var3 = (long)var2_int * (long)param0 + ((fl) this).field_K;
                      if (-var3 + ((fl) this).field_n < 0L) {
                        break L4;
                      } else {
                        ((fl) this).field_K = var3;
                        if (var6 != 0) {
                          break L1;
                        } else {
                          if (var6 == 0) {
                            break L2;
                          } else {
                            break L4;
                          }
                        }
                      }
                    }
                    L5: {
                      var5 = (int)((-1L + ((long)var2_int + ((fl) this).field_n + -((fl) this).field_K)) / (long)var2_int);
                      ((fl) this).field_K = ((fl) this).field_K + (long)var5 * (long)var2_int;
                      ((fl) this).field_A.a(var5);
                      param0 = param0 - var5;
                      this.c(false);
                      if (((fl) this).field_E.c()) {
                        break L5;
                      } else {
                        if (var6 == 0) {
                          break L2;
                        } else {
                          break L5;
                        }
                      }
                    }
                    if (var6 == 0) {
                      continue L3;
                    } else {
                      break L2;
                    }
                  }
                } else {
                  break L2;
                }
              }
              ((fl) this).field_A.a(param0);
              break L1;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw bd.a((Throwable) (Object) var2, "fl.B(" + param0 + ')');
        }
    }

    final synchronized void a(int param0, int param1, byte param2) {
        if (param2 != 108) {
            return;
        }
        try {
            this.f(param0, param1, 1);
        } catch (RuntimeException runtimeException) {
            throw bd.a((Throwable) (Object) runtimeException, "fl.MA(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final synchronized void a(boolean param0, int param1, ji param2) {
        RuntimeException var4 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
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
              if (param1 < -75) {
                break L1;
              } else {
                ((fl) this).field_r = -65;
                break L1;
              }
            }
            this.a(param0, true, 0, param2);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var4;
            stackOut_5_1 = new StringBuilder().append("fl.T(").append(param0).append(',').append(param1).append(',');
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
          throw bd.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + ')');
        }
    }

    final synchronized void d(int param0) {
        try {
            this.a(true, true);
            if (param0 >= -20) {
                field_T = null;
            }
        } catch (RuntimeException runtimeException) {
            throw bd.a((Throwable) (Object) runtimeException, "fl.DA(" + param0 + ')');
        }
    }

    public static void c(int param0) {
        try {
            int var1_int = -95 / ((param0 - -33) / 63);
            field_F = null;
            field_H = null;
            field_T = null;
        } catch (RuntimeException runtimeException) {
            throw bd.a((Throwable) (Object) runtimeException, "fl.NA(" + param0 + ')');
        }
    }

    private final void g(int param0, int param1) {
        RuntimeException runtimeException = null;
        vk var3 = null;
        int var4 = 0;
        int stackIn_4_0 = 0;
        int stackIn_4_1 = 0;
        int stackIn_17_0 = 0;
        int stackIn_17_1 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_3_1 = 0;
        int stackOut_16_0 = 0;
        int stackOut_16_1 = 0;
        var4 = wizardrun.field_H;
        try {
          L0: {
            var3 = (vk) (Object) ((fl) this).field_A.field_p.b((byte) 110);
            L1: while (true) {
              L2: {
                L3: {
                  if (null == var3) {
                    break L3;
                  } else {
                    stackOut_3_0 = -1;
                    stackOut_3_1 = ~param0;
                    stackIn_17_0 = stackOut_3_0;
                    stackIn_17_1 = stackOut_3_1;
                    stackIn_4_0 = stackOut_3_0;
                    stackIn_4_1 = stackOut_3_1;
                    if (var4 != 0) {
                      break L2;
                    } else {
                      L4: {
                        L5: {
                          if (stackIn_4_0 < stackIn_4_1) {
                            break L5;
                          } else {
                            if (~param0 == ~var3.field_F) {
                              break L5;
                            } else {
                              break L4;
                            }
                          }
                        }
                        if (var3.field_j >= 0) {
                          break L4;
                        } else {
                          ((fl) this).field_S[var3.field_F][var3.field_k] = null;
                          var3.field_j = 0;
                          break L4;
                        }
                      }
                      var3 = (vk) (Object) ((fl) this).field_A.field_p.d(param1 ^ -8193);
                      if (var4 == 0) {
                        continue L1;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
                stackOut_16_0 = param1;
                stackOut_16_1 = -1;
                stackIn_17_0 = stackOut_16_0;
                stackIn_17_1 = stackOut_16_1;
                break L2;
              }
              L6: {
                if (stackIn_17_0 == stackIn_17_1) {
                  break L6;
                } else {
                  ((fl) this).field_y = null;
                  break L6;
                }
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw bd.a((Throwable) (Object) runtimeException, "fl.HA(" + param0 + ',' + param1 + ')');
        }
    }

    private final synchronized void a(boolean param0, boolean param1, int param2, ji param3) {
        RuntimeException runtimeException = null;
        int var5_int = 0;
        int var6 = 0;
        int var7 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        var7 = wizardrun.field_H;
        try {
          L0: {
            this.a(true, param1);
            ((fl) this).field_E.a(param3.field_j);
            ((fl) this).field_U = param0;
            ((fl) this).field_K = (long)param2;
            var5_int = ((fl) this).field_E.d();
            var6 = 0;
            L1: while (true) {
              L2: {
                L3: {
                  if (var5_int <= var6) {
                    break L3;
                  } else {
                    ((fl) this).field_E.a(var6);
                    ((fl) this).field_E.b(var6);
                    ((fl) this).field_E.c(var6);
                    var6++;
                    if (var7 != 0) {
                      break L2;
                    } else {
                      if (var7 == 0) {
                        continue L1;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
                ((fl) this).field_p = ((fl) this).field_E.b();
                ((fl) this).field_s = ((fl) this).field_E.field_h[((fl) this).field_p];
                ((fl) this).field_n = ((fl) this).field_E.e(((fl) this).field_s);
                break L2;
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            runtimeException = decompiledCaughtException;
            stackOut_9_0 = (RuntimeException) runtimeException;
            stackOut_9_1 = new StringBuilder().append("fl.IA(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_12_0 = stackOut_9_0;
            stackIn_12_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param3 == null) {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L4;
            } else {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "{...}";
              stackIn_13_0 = stackOut_10_0;
              stackIn_13_1 = stackOut_10_1;
              stackIn_13_2 = stackOut_10_2;
              break L4;
            }
          }
          throw bd.a((Throwable) (Object) stackIn_13_0, stackIn_13_2 + ')');
        }
    }

    private final synchronized void a(boolean param0, boolean param1) {
        try {
            ((fl) this).field_E.e();
            ((fl) this).field_x = null;
            this.a(param1, (byte) -71);
            if (!param0) {
                ((fl) this).a((int[]) null, -66, -74);
            }
        } catch (RuntimeException runtimeException) {
            throw bd.a((Throwable) (Object) runtimeException, "fl.KA(" + param0 + ',' + param1 + ')');
        }
    }

    final boolean b(int param0, vk param1) {
        RuntimeException var3 = null;
        int stackIn_2_0 = 0;
        int stackIn_16_0 = 0;
        int stackIn_18_0 = 0;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_17_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_1_0 = 0;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        try {
          L0: {
            if (param0 == -1) {
              if (null != param1.field_w) {
                stackOut_17_0 = 0;
                stackIn_18_0 = stackOut_17_0;
                break L0;
              } else {
                L1: {
                  if (param1.field_j < 0) {
                    break L1;
                  } else {
                    param1.a(false);
                    if (param1.field_t <= 0) {
                      break L1;
                    } else {
                      if (((fl) this).field_J[param1.field_F][param1.field_t] != param1) {
                        break L1;
                      } else {
                        ((fl) this).field_J[param1.field_F][param1.field_t] = null;
                        break L1;
                      }
                    }
                  }
                }
                stackOut_15_0 = 1;
                stackIn_16_0 = stackOut_15_0;
                return stackIn_16_0 != 0;
              }
            } else {
              stackOut_1_0 = 0;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_19_0 = (RuntimeException) var3;
            stackOut_19_1 = new StringBuilder().append("fl.R(").append(param0).append(',');
            stackIn_22_0 = stackOut_19_0;
            stackIn_22_1 = stackOut_19_1;
            stackIn_20_0 = stackOut_19_0;
            stackIn_20_1 = stackOut_19_1;
            if (param1 == null) {
              stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
              stackOut_22_1 = (StringBuilder) (Object) stackIn_22_1;
              stackOut_22_2 = "null";
              stackIn_23_0 = stackOut_22_0;
              stackIn_23_1 = stackOut_22_1;
              stackIn_23_2 = stackOut_22_2;
              break L2;
            } else {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "{...}";
              stackIn_23_0 = stackOut_20_0;
              stackIn_23_1 = stackOut_20_1;
              stackIn_23_2 = stackOut_20_2;
              break L2;
            }
          }
          throw bd.a((Throwable) (Object) stackIn_23_0, stackIn_23_2 + ')');
        }
        return stackIn_18_0 != 0;
    }

    final synchronized void a(int param0, int param1) {
        try {
            ((fl) this).field_m = param1;
            if (param0 != -1) {
                ((fl) this).field_J = null;
            }
        } catch (RuntimeException runtimeException) {
            throw bd.a((Throwable) (Object) runtimeException, "fl.O(" + param0 + ',' + param1 + ')');
        }
    }

    private final void f(int param0, int param1, int param2) {
        RuntimeException var4 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              ((fl) this).field_O[param1] = param0;
              ((fl) this).field_w[param1] = kl.b(param0, -128);
              if (param2 == 1) {
                break L1;
              } else {
                ((fl) this).field_o = null;
                break L1;
              }
            }
            this.e(param2 ^ -130, param0, param1);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw bd.a((Throwable) (Object) var4, "fl.BA(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    private final void a(int param0, byte param1) {
        RuntimeException runtimeException = null;
        int var4 = 0;
        RuntimeException decompiledCaughtException = null;
        var4 = wizardrun.field_H;
        try {
          L0: {
            if (param0 < 0) {
              param0 = 0;
              L1: while (true) {
                L2: {
                  if (param0 >= 16) {
                    break L2;
                  } else {
                    this.a(param0, (byte) 21);
                    param0++;
                    if (var4 == 0) {
                      continue L1;
                    } else {
                      break L2;
                    }
                  }
                }
                return;
              }
            } else {
              ((fl) this).field_N[param0] = 12800;
              ((fl) this).field_B[param0] = 8192;
              if (param1 == 21) {
                ((fl) this).field_v[param0] = 16383;
                ((fl) this).field_I[param0] = 8192;
                ((fl) this).field_C[param0] = 0;
                ((fl) this).field_t[param0] = 8192;
                this.c(256, param0);
                this.b(-1, param0);
                ((fl) this).field_y[param0] = 0;
                ((fl) this).field_L[param0] = 32767;
                ((fl) this).field_D[param0] = 256;
                ((fl) this).field_o[param0] = 0;
                this.c(param0, param1 + 103, 8192);
                break L0;
              } else {
                return;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw bd.a((Throwable) (Object) runtimeException, "fl.S(" + param0 + ',' + param1 + ')');
        }
    }

    final boolean a(int param0, int[] param1, vk param2, int param3, int param4) {
        RuntimeException var6 = null;
        int var6_int = 0;
        q var7 = null;
        int var8 = 0;
        double var9 = 0.0;
        int var11 = 0;
        int stackIn_17_0 = 0;
        int stackIn_46_0 = 0;
        int stackIn_46_1 = 0;
        int stackIn_53_0 = 0;
        int stackIn_53_1 = 0;
        int stackIn_81_0 = 0;
        int stackIn_81_1 = 0;
        int stackIn_88_0 = 0;
        int stackIn_88_1 = 0;
        int stackIn_113_0 = 0;
        int stackIn_115_0 = 0;
        RuntimeException stackIn_117_0 = null;
        StringBuilder stackIn_117_1 = null;
        RuntimeException stackIn_119_0 = null;
        StringBuilder stackIn_119_1 = null;
        RuntimeException stackIn_120_0 = null;
        StringBuilder stackIn_120_1 = null;
        String stackIn_120_2 = null;
        RuntimeException stackIn_121_0 = null;
        StringBuilder stackIn_121_1 = null;
        RuntimeException stackIn_123_0 = null;
        StringBuilder stackIn_123_1 = null;
        RuntimeException stackIn_124_0 = null;
        StringBuilder stackIn_124_1 = null;
        String stackIn_124_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_16_0 = 0;
        int stackOut_45_0 = 0;
        int stackOut_45_1 = 0;
        int stackOut_52_0 = 0;
        int stackOut_52_1 = 0;
        int stackOut_80_0 = 0;
        int stackOut_80_1 = 0;
        int stackOut_87_0 = 0;
        int stackOut_87_1 = 0;
        int stackOut_112_0 = 0;
        int stackOut_114_0 = 0;
        RuntimeException stackOut_116_0 = null;
        StringBuilder stackOut_116_1 = null;
        RuntimeException stackOut_119_0 = null;
        StringBuilder stackOut_119_1 = null;
        String stackOut_119_2 = null;
        RuntimeException stackOut_117_0 = null;
        StringBuilder stackOut_117_1 = null;
        String stackOut_117_2 = null;
        RuntimeException stackOut_120_0 = null;
        StringBuilder stackOut_120_1 = null;
        RuntimeException stackOut_123_0 = null;
        StringBuilder stackOut_123_1 = null;
        String stackOut_123_2 = null;
        RuntimeException stackOut_121_0 = null;
        StringBuilder stackOut_121_1 = null;
        String stackOut_121_2 = null;
        var11 = wizardrun.field_H;
        try {
          L0: {
            L1: {
              param2.field_E = c.field_l / 100;
              if (param2.field_j < 0) {
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
                    if (param2 != ((fl) this).field_J[param2.field_F][param2.field_t]) {
                      break L3;
                    } else {
                      ((fl) this).field_J[param2.field_F][param2.field_t] = null;
                      break L3;
                    }
                  }
                }
                stackOut_16_0 = 1;
                stackIn_17_0 = stackOut_16_0;
                return stackIn_17_0 != 0;
              }
            }
            L4: {
              var6_int = param2.field_y;
              if (var6_int <= 0) {
                break L4;
              } else {
                L5: {
                  var6_int = var6_int - (int)(16.0 * Math.pow(2.0, 0.0004921259842519685 * (double)((fl) this).field_t[param2.field_F]) + 0.5);
                  if (var6_int < 0) {
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
              if (var7.field_h > 0) {
                L7: {
                  L8: {
                    if (var7.field_d <= 0) {
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
                if (var7.field_h * param2.field_m < 819200) {
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
                    if (var7.field_i > 0) {
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
                        stackOut_45_0 = (255 & var7.field_f[2 + param2.field_n]) << -897535288;
                        stackOut_45_1 = param2.field_K;
                        stackIn_53_0 = stackOut_45_0;
                        stackIn_53_1 = stackOut_45_1;
                        stackIn_46_0 = stackOut_45_0;
                        stackIn_46_1 = stackOut_45_1;
                        if (var11 != 0) {
                          break L13;
                        } else {
                          if (stackIn_46_0 >= stackIn_46_1) {
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
                    stackOut_52_0 = var7.field_f.length - 2;
                    stackOut_52_1 = param2.field_n;
                    stackIn_53_0 = stackOut_52_0;
                    stackIn_53_1 = stackOut_52_1;
                    break L13;
                  }
                  if (stackIn_53_0 != stackIn_53_1) {
                    break L9;
                  } else {
                    if (var7.field_f[param2.field_n - -1] != 0) {
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
                  if ((((fl) this).field_y[param2.field_F] & 1) == 0) {
                    L16: {
                      if (param2.field_t < 0) {
                        break L16;
                      } else {
                        if (param2 != ((fl) this).field_J[param2.field_F][param2.field_t]) {
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
                          if (~(var7.field_c.length + -2) >= ~param2.field_s) {
                            break L21;
                          } else {
                            stackOut_80_0 = param2.field_j;
                            stackOut_80_1 = var7.field_c[2 + param2.field_s] << 1819065864 & 65280;
                            stackIn_88_0 = stackOut_80_0;
                            stackIn_88_1 = stackOut_80_1;
                            stackIn_81_0 = stackOut_80_0;
                            stackIn_81_1 = stackOut_80_1;
                            if (var11 != 0) {
                              break L20;
                            } else {
                              if (stackIn_81_0 <= stackIn_81_1) {
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
                        stackOut_87_0 = ~param2.field_s;
                        stackOut_87_1 = ~(-2 + var7.field_c.length);
                        stackIn_88_0 = stackOut_87_0;
                        stackIn_88_1 = stackOut_87_1;
                        break L20;
                      }
                      if (stackIn_88_0 == stackIn_88_1) {
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
                  if (null == param1) {
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
                  ((fl) this).field_A.field_o.a((k) (Object) param2.field_w);
                  break L24;
                }
              }
              L25: {
                param2.a(0);
                if (param2.field_j < 0) {
                  break L25;
                } else {
                  param2.a(false);
                  if (param2.field_t <= 0) {
                    break L25;
                  } else {
                    if (((fl) this).field_J[param2.field_F][param2.field_t] != param2) {
                      break L25;
                    } else {
                      ((fl) this).field_J[param2.field_F][param2.field_t] = null;
                      break L25;
                    }
                  }
                }
              }
              stackOut_112_0 = 1;
              stackIn_113_0 = stackOut_112_0;
              return stackIn_113_0 != 0;
            } else {
              param2.field_w.a(param2.field_E, this.a(param2, -109), this.a(param2, (byte) 59));
              stackOut_114_0 = 0;
              stackIn_115_0 = stackOut_114_0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L26: {
            var6 = decompiledCaughtException;
            stackOut_116_0 = (RuntimeException) var6;
            stackOut_116_1 = new StringBuilder().append("fl.H(").append(param0).append(',');
            stackIn_119_0 = stackOut_116_0;
            stackIn_119_1 = stackOut_116_1;
            stackIn_117_0 = stackOut_116_0;
            stackIn_117_1 = stackOut_116_1;
            if (param1 == null) {
              stackOut_119_0 = (RuntimeException) (Object) stackIn_119_0;
              stackOut_119_1 = (StringBuilder) (Object) stackIn_119_1;
              stackOut_119_2 = "null";
              stackIn_120_0 = stackOut_119_0;
              stackIn_120_1 = stackOut_119_1;
              stackIn_120_2 = stackOut_119_2;
              break L26;
            } else {
              stackOut_117_0 = (RuntimeException) (Object) stackIn_117_0;
              stackOut_117_1 = (StringBuilder) (Object) stackIn_117_1;
              stackOut_117_2 = "{...}";
              stackIn_120_0 = stackOut_117_0;
              stackIn_120_1 = stackOut_117_1;
              stackIn_120_2 = stackOut_117_2;
              break L26;
            }
          }
          L27: {
            stackOut_120_0 = (RuntimeException) (Object) stackIn_120_0;
            stackOut_120_1 = ((StringBuilder) (Object) stackIn_120_1).append(stackIn_120_2).append(',');
            stackIn_123_0 = stackOut_120_0;
            stackIn_123_1 = stackOut_120_1;
            stackIn_121_0 = stackOut_120_0;
            stackIn_121_1 = stackOut_120_1;
            if (param2 == null) {
              stackOut_123_0 = (RuntimeException) (Object) stackIn_123_0;
              stackOut_123_1 = (StringBuilder) (Object) stackIn_123_1;
              stackOut_123_2 = "null";
              stackIn_124_0 = stackOut_123_0;
              stackIn_124_1 = stackOut_123_1;
              stackIn_124_2 = stackOut_123_2;
              break L27;
            } else {
              stackOut_121_0 = (RuntimeException) (Object) stackIn_121_0;
              stackOut_121_1 = (StringBuilder) (Object) stackIn_121_1;
              stackOut_121_2 = "{...}";
              stackIn_124_0 = stackOut_121_0;
              stackIn_124_1 = stackOut_121_1;
              stackIn_124_2 = stackOut_121_2;
              break L27;
            }
          }
          throw bd.a((Throwable) (Object) stackIn_124_0, stackIn_124_2 + ',' + param3 + ',' + param4 + ')');
        }
        return stackIn_115_0 != 0;
    }

    private final synchronized void a(int param0, int param1, int param2) {
        RuntimeException runtimeException = null;
        int var4_int = 0;
        int var5 = 0;
        RuntimeException decompiledCaughtException = null;
        var5 = wizardrun.field_H;
        try {
          L0: {
            L1: {
              L2: {
                if (param2 >= 0) {
                  break L2;
                } else {
                  var4_int = 0;
                  L3: while (true) {
                    L4: {
                      if (var4_int >= 16) {
                        break L4;
                      } else {
                        ((fl) this).field_R[var4_int] = param0;
                        var4_int++;
                        if (var5 != 0) {
                          break L1;
                        } else {
                          if (var5 == 0) {
                            continue L3;
                          } else {
                            break L4;
                          }
                        }
                      }
                    }
                    if (var5 == 0) {
                      break L1;
                    } else {
                      break L2;
                    }
                  }
                }
              }
              ((fl) this).field_R[param2] = param0;
              break L1;
            }
            L5: {
              if (param1 > 99) {
                break L5;
              } else {
                field_T = null;
                break L5;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw bd.a((Throwable) (Object) runtimeException, "fl.AA(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final synchronized int d() {
        RuntimeException var1 = null;
        int stackIn_1_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_0_0 = 0;
        try {
          L0: {
            stackOut_0_0 = 0;
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw bd.a((Throwable) (Object) var1, "fl.A()");
        }
        return stackIn_1_0;
    }

    final static void f(int param0, int param1) {
        RuntimeException runtimeException = null;
        int var2_int = 0;
        int var3 = 0;
        RuntimeException decompiledCaughtException = null;
        var3 = wizardrun.field_H;
        try {
          L0: {
            wizardrun.a(true, (byte) 11, param0, lg.field_d, dg.field_d, rb.field_e, 0);
            var2_int = 0;
            if (param1 == 16) {
              L1: while (true) {
                L2: {
                  L3: {
                    if (~lg.field_d >= ~var2_int) {
                      break L3;
                    } else {
                      sj.field_m[param0 + var2_int] = var2_int;
                      var2_int++;
                      if (var3 != 0) {
                        break L2;
                      } else {
                        if (var3 == 0) {
                          continue L1;
                        } else {
                          break L3;
                        }
                      }
                    }
                  }
                  wizardrun.a(false, (byte) 11, param0 - -param0, lg.field_d + param0, gf.field_W, dj.field_b, param0);
                  break L2;
                }
                L4: {
                  if (~lg.field_d < ~param0) {
                    lg.field_d = param0;
                    break L4;
                  } else {
                    break L4;
                  }
                }
                break L0;
              }
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw bd.a((Throwable) (Object) runtimeException, "fl.QA(" + param0 + ',' + param1 + ')');
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
        int stackIn_4_0 = 0;
        int stackIn_23_0 = 0;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_28_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_22_0 = 0;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        String stackOut_27_2 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        String stackOut_25_2 = null;
        try {
          L0: {
            var3_int = 123 / ((49 - param1) / 44);
            if (((fl) this).field_R[param0.field_F] == 0) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              return stackIn_4_0;
            } else {
              L1: {
                var4 = param0.field_i;
                var5 = 4096 + ((fl) this).field_N[param0.field_F] * ((fl) this).field_v[param0.field_F] >> 293544461;
                var5 = var5 * var5 - -16384 >> 687053679;
                var5 = 16384 + param0.field_D * var5 >> 531806927;
                var5 = 128 + ((fl) this).field_m * var5 >> -1958504216;
                var5 = 128 + var5 * ((fl) this).field_R[param0.field_F] >> -704821432;
                if (var4.field_h <= 0) {
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
                    if (~param0.field_n <= ~(-2 + var4.field_f.length)) {
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
                if (param0.field_j <= 0) {
                  break L4;
                } else {
                  if (null != var4.field_c) {
                    L5: {
                      var6 = param0.field_j;
                      var7 = var4.field_c[1 + param0.field_s];
                      if (~(var4.field_c.length + -2) < ~param0.field_s) {
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
              stackOut_22_0 = var5;
              stackIn_23_0 = stackOut_22_0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var3 = decompiledCaughtException;
            stackOut_24_0 = (RuntimeException) var3;
            stackOut_24_1 = new StringBuilder().append("fl.U(");
            stackIn_27_0 = stackOut_24_0;
            stackIn_27_1 = stackOut_24_1;
            stackIn_25_0 = stackOut_24_0;
            stackIn_25_1 = stackOut_24_1;
            if (param0 == null) {
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
          throw bd.a((Throwable) (Object) stackIn_28_0, stackIn_28_2 + ',' + param1 + ')');
        }
        return stackIn_23_0;
    }

    private final void a(int param0, int param1, int param2, byte param3) {
        RuntimeException runtimeException = null;
        vk var5 = null;
        vk var6 = null;
        int var7 = 0;
        int stackIn_9_0 = 0;
        int stackIn_9_1 = 0;
        int stackIn_26_0 = 0;
        int stackIn_26_1 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_8_0 = 0;
        int stackOut_8_1 = 0;
        byte stackOut_25_0 = 0;
        int stackOut_25_1 = 0;
        var7 = wizardrun.field_H;
        try {
          L0: {
            var5 = ((fl) this).field_S[param2][param0];
            if (var5 == null) {
              return;
            } else {
              L1: {
                L2: {
                  L3: {
                    ((fl) this).field_S[param2][param0] = null;
                    if ((((fl) this).field_y[param2] & 2) == 0) {
                      break L3;
                    } else {
                      var6 = (vk) (Object) ((fl) this).field_A.field_p.b((byte) 84);
                      L4: while (true) {
                        L5: {
                          if (var6 == null) {
                            break L5;
                          } else {
                            stackOut_8_0 = ~var5.field_F;
                            stackOut_8_1 = ~var6.field_F;
                            stackIn_26_0 = stackOut_8_0;
                            stackIn_26_1 = stackOut_8_1;
                            stackIn_9_0 = stackOut_8_0;
                            stackIn_9_1 = stackOut_8_1;
                            if (var7 != 0) {
                              break L1;
                            } else {
                              L6: {
                                if (stackIn_9_0 != stackIn_9_1) {
                                  break L6;
                                } else {
                                  if (var6.field_j >= 0) {
                                    break L6;
                                  } else {
                                    if (var6 != var5) {
                                      var5.field_j = 0;
                                      if (var7 == 0) {
                                        break L5;
                                      } else {
                                        break L6;
                                      }
                                    } else {
                                      break L6;
                                    }
                                  }
                                }
                              }
                              var6 = (vk) (Object) ((fl) this).field_A.field_p.d(8192);
                              if (var7 == 0) {
                                continue L4;
                              } else {
                                break L5;
                              }
                            }
                          }
                        }
                        if (var7 == 0) {
                          break L2;
                        } else {
                          break L3;
                        }
                      }
                    }
                  }
                  var5.field_j = 0;
                  break L2;
                }
                stackOut_25_0 = param3;
                stackOut_25_1 = -16;
                stackIn_26_0 = stackOut_25_0;
                stackIn_26_1 = stackOut_25_1;
                break L1;
              }
              L7: {
                if (stackIn_26_0 == stackIn_26_1) {
                  break L7;
                } else {
                  ((fl) this).field_P = null;
                  break L7;
                }
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw bd.a((Throwable) (Object) runtimeException, "fl.EA(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final synchronized void a(int[] param0, int param1, int param2) {
        RuntimeException var4 = null;
        int var4_int = 0;
        long var5 = 0L;
        int var7 = 0;
        int var8 = 0;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        var8 = wizardrun.field_H;
        try {
          L0: {
            L1: {
              L2: {
                if (((fl) this).field_E.c()) {
                  var4_int = ((fl) this).field_r * ((fl) this).field_E.field_d / c.field_l;
                  L3: while (true) {
                    L4: {
                      var5 = ((fl) this).field_K + (long)param2 * (long)var4_int;
                      if (((fl) this).field_n + -var5 < 0L) {
                        break L4;
                      } else {
                        ((fl) this).field_K = var5;
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
                      var7 = (int)((-1L + (long)var4_int + (-((fl) this).field_K + ((fl) this).field_n)) / (long)var4_int);
                      ((fl) this).field_K = ((fl) this).field_K + (long)var7 * (long)var4_int;
                      ((fl) this).field_A.a(param0, param1, var7);
                      param1 = param1 + var7;
                      param2 = param2 - var7;
                      this.c(false);
                      if (((fl) this).field_E.c()) {
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
                      break L2;
                    }
                  }
                } else {
                  break L2;
                }
              }
              ((fl) this).field_A.a(param0, param1, param2);
              break L1;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var4 = decompiledCaughtException;
            stackOut_19_0 = (RuntimeException) var4;
            stackOut_19_1 = new StringBuilder().append("fl.D(");
            stackIn_22_0 = stackOut_19_0;
            stackIn_22_1 = stackOut_19_1;
            stackIn_20_0 = stackOut_19_0;
            stackIn_20_1 = stackOut_19_1;
            if (param0 == null) {
              stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
              stackOut_22_1 = (StringBuilder) (Object) stackIn_22_1;
              stackOut_22_2 = "null";
              stackIn_23_0 = stackOut_22_0;
              stackIn_23_1 = stackOut_22_1;
              stackIn_23_2 = stackOut_22_2;
              break L6;
            } else {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "{...}";
              stackIn_23_0 = stackOut_20_0;
              stackIn_23_1 = stackOut_20_1;
              stackIn_23_2 = stackOut_20_2;
              break L6;
            }
          }
          throw bd.a((Throwable) (Object) stackIn_23_0, stackIn_23_2 + ',' + param1 + ',' + param2 + ')');
        }
    }

    private final void b(int param0, int param1, int param2) {
        try {
            ((fl) this).field_I[param0] = param1;
            if (param2 != 38) {
                this.d(11, -69, 19);
            }
        } catch (RuntimeException runtimeException) {
            throw bd.a((Throwable) (Object) runtimeException, "fl.LA(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    private final void a(boolean param0, byte param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        RuntimeException decompiledCaughtException = null;
        var4 = wizardrun.field_H;
        try {
          L0: {
            L1: {
              L2: {
                if (param0) {
                  break L2;
                } else {
                  this.g(-1, -1);
                  if (var4 == 0) {
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              this.d(0, -1);
              break L1;
            }
            this.a(-1, (byte) 21);
            var3_int = 0;
            L3: while (true) {
              L4: {
                L5: {
                  if (16 <= var3_int) {
                    break L5;
                  } else {
                    ((fl) this).field_P[var3_int] = ((fl) this).field_O[var3_int];
                    var3_int++;
                    if (var4 != 0) {
                      break L4;
                    } else {
                      if (var4 == 0) {
                        continue L3;
                      } else {
                        break L5;
                      }
                    }
                  }
                }
                var3_int = 0;
                break L4;
              }
              L6: {
                if (param1 <= -62) {
                  break L6;
                } else {
                  this.f(-85, 122, -57);
                  break L6;
                }
              }
              L7: while (true) {
                L8: {
                  L9: {
                    if (16 <= var3_int) {
                      break L9;
                    } else {
                      ((fl) this).field_w[var3_int] = kl.b(((fl) this).field_O[var3_int], -128);
                      var3_int++;
                      if (var4 != 0) {
                        break L8;
                      } else {
                        if (var4 == 0) {
                          continue L7;
                        } else {
                          break L9;
                        }
                      }
                    }
                  }
                  break L8;
                }
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw bd.a((Throwable) (Object) var3, "fl.Q(" + param0 + ',' + param1 + ')');
        }
    }

    private final void b(int param0, int param1) {
        RuntimeException var3 = null;
        vk var3_ref = null;
        int var4 = 0;
        RuntimeException decompiledCaughtException = null;
        var4 = wizardrun.field_H;
        try {
          L0: {
            L1: {
              L2: {
                if (param0 != ~(4 & ((fl) this).field_y[param1])) {
                  var3_ref = (vk) (Object) ((fl) this).field_A.field_p.b((byte) 55);
                  L3: while (true) {
                    if (var3_ref == null) {
                      break L2;
                    } else {
                      if (var4 != 0) {
                        break L1;
                      } else {
                        L4: {
                          if (~param1 == ~var3_ref.field_F) {
                            var3_ref.field_H = 0;
                            break L4;
                          } else {
                            break L4;
                          }
                        }
                        var3_ref = (vk) (Object) ((fl) this).field_A.field_p.d(8192);
                        if (var4 == 0) {
                          continue L3;
                        } else {
                          break L2;
                        }
                      }
                    }
                  }
                } else {
                  break L2;
                }
              }
              break L1;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw bd.a((Throwable) (Object) var3, "fl.OA(" + param0 + ',' + param1 + ')');
        }
    }

    final synchronized k a() {
        RuntimeException var1 = null;
        he stackIn_1_0 = null;
        RuntimeException decompiledCaughtException = null;
        he stackOut_0_0 = null;
        try {
          L0: {
            stackOut_0_0 = ((fl) this).field_A;
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw bd.a((Throwable) (Object) var1, "fl.G()");
        }
        return (k) (Object) stackIn_1_0;
    }

    private final void d(int param0, int param1) {
        RuntimeException runtimeException = null;
        vk var3 = null;
        int var4 = 0;
        RuntimeException decompiledCaughtException = null;
        var4 = wizardrun.field_H;
        try {
          L0: {
            if (param0 == 0) {
              var3 = (vk) (Object) ((fl) this).field_A.field_p.b((byte) 92);
              L1: while (true) {
                L2: {
                  L3: {
                    if (null == var3) {
                      break L3;
                    } else {
                      if (var4 != 0) {
                        break L2;
                      } else {
                        L4: {
                          L5: {
                            if (param1 < 0) {
                              break L5;
                            } else {
                              if (~var3.field_F == ~param1) {
                                break L5;
                              } else {
                                break L4;
                              }
                            }
                          }
                          L6: {
                            if (var3.field_w != null) {
                              L7: {
                                var3.field_w.f(c.field_l / 100);
                                if (var3.field_w.i()) {
                                  ((fl) this).field_A.field_o.a((k) (Object) var3.field_w);
                                  break L7;
                                } else {
                                  break L7;
                                }
                              }
                              var3.a(0);
                              break L6;
                            } else {
                              break L6;
                            }
                          }
                          L8: {
                            if (var3.field_j >= 0) {
                              break L8;
                            } else {
                              ((fl) this).field_S[var3.field_F][var3.field_k] = null;
                              break L8;
                            }
                          }
                          var3.a(false);
                          break L4;
                        }
                        var3 = (vk) (Object) ((fl) this).field_A.field_p.d(8192);
                        if (var4 == 0) {
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
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw bd.a((Throwable) (Object) runtimeException, "fl.K(" + param0 + ',' + param1 + ')');
        }
    }

    private final void d(int param0, int param1, int param2) {
        try {
            if (param1 != 2) {
                fl.f(67, -78);
            }
        } catch (RuntimeException runtimeException) {
            throw bd.a((Throwable) (Object) runtimeException, "fl.W(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    public fl() {
        ((fl) this).field_r = 1000000;
        ((fl) this).field_D = new int[16];
        ((fl) this).field_R = new int[16];
        ((fl) this).field_Q = new int[16];
        ((fl) this).field_w = new int[16];
        ((fl) this).field_N = new int[16];
        ((fl) this).field_y = new int[16];
        ((fl) this).field_B = new int[16];
        ((fl) this).field_t = new int[16];
        ((fl) this).field_P = new int[16];
        ((fl) this).field_S = new vk[16][128];
        ((fl) this).field_I = new int[16];
        ((fl) this).field_C = new int[16];
        ((fl) this).field_v = new int[16];
        ((fl) this).field_z = new int[16];
        ((fl) this).field_O = new int[16];
        ((fl) this).field_J = new vk[16][128];
        ((fl) this).field_m = 256;
        ((fl) this).field_L = new int[16];
        ((fl) this).field_o = new int[16];
        ((fl) this).field_E = new wf();
        ((fl) this).field_A = new he((fl) this);
        try {
            ((fl) this).field_G = new ab(128);
            this.a(256, 114, -1);
            this.a(true, (byte) -67);
        } catch (RuntimeException runtimeException) {
            throw bd.a((Throwable) (Object) runtimeException, "fl.<init>()");
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        sk.a(16062, 50);
    }
}
