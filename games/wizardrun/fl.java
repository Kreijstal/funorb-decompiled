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
        int var5 = wizardrun.field_H;
        if (param1 != ((fl) this).field_P[param2]) {
            ((fl) this).field_P[param2] = param1;
            for (var4 = 0; var4 < 128; var4++) {
                ((fl) this).field_J[param2][var4] = null;
            }
        }
        if (param0 != -129) {
            this.c(93, -111, 85);
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
              var3_int = ((fl) this).field_B[param0.field_F];
              if (param1 >= 54) {
                break L1;
              } else {
                ((fl) this).a(-24);
                break L1;
              }
            }
            if (var3_int >= 8192) {
              stackOut_5_0 = -((-var3_int + 16384) * (128 + -param0.field_B) - -32 >> 6) + 16384;
              stackIn_6_0 = stackOut_5_0;
              break L0;
            } else {
              stackOut_3_0 = 32 + param0.field_B * var3_int >> 6;
              stackIn_4_0 = stackOut_3_0;
              return stackIn_4_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) var3;
            stackOut_7_1 = new StringBuilder().append("fl.CA(");
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param0 == null) {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L2;
            } else {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L2;
            }
          }
          throw bd.a((Throwable) (Object) stackIn_10_0, stackIn_10_2 + ',' + param1 + ')');
        }
        return stackIn_6_0;
    }

    final synchronized boolean a(kl param0, int param1, ue param2, ji param3, int param4) {
        RuntimeException var6 = null;
        int var6_int = 0;
        Object var7 = null;
        pb var8 = null;
        int var9 = 0;
        h var10 = null;
        int var11 = 0;
        int stackIn_18_0 = 0;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_28_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_17_0 = 0;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        String stackOut_27_2 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        String stackOut_26_2 = null;
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
              if (var8 == null) {
                L3: {
                  if (var6_int == 0) {
                    break L3;
                  } else {
                    param3.b();
                    break L3;
                  }
                }
                stackOut_17_0 = var6_int;
                stackIn_18_0 = stackOut_17_0;
                break L0;
              } else {
                L4: {
                  L5: {
                    var9 = (int)var8.field_e;
                    var10 = (h) (Object) ((fl) this).field_G.a(1, (long)var9);
                    if (var10 != null) {
                      break L5;
                    } else {
                      var10 = ld.a(param1 + 82, var9, param0);
                      if (var10 == null) {
                        var6_int = 0;
                        break L4;
                      } else {
                        ((fl) this).field_G.a((wl) (Object) var10, -9, (long)var9);
                        break L5;
                      }
                    }
                  }
                  if (!var10.a(var8.field_j, param2, -75, (int[]) var7)) {
                    var6_int = 0;
                    break L4;
                  } else {
                    break L4;
                  }
                }
                var8 = (pb) (Object) param3.field_i.b(1);
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var6 = decompiledCaughtException;
            stackOut_19_0 = (RuntimeException) var6;
            stackOut_19_1 = new StringBuilder().append("fl.FA(");
            stackIn_21_0 = stackOut_19_0;
            stackIn_21_1 = stackOut_19_1;
            stackIn_20_0 = stackOut_19_0;
            stackIn_20_1 = stackOut_19_1;
            if (param0 == null) {
              stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "null";
              stackIn_22_0 = stackOut_21_0;
              stackIn_22_1 = stackOut_21_1;
              stackIn_22_2 = stackOut_21_2;
              break L6;
            } else {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "{...}";
              stackIn_22_0 = stackOut_20_0;
              stackIn_22_1 = stackOut_20_1;
              stackIn_22_2 = stackOut_20_2;
              break L6;
            }
          }
          L7: {
            stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
            stackOut_22_1 = ((StringBuilder) (Object) stackIn_22_1).append(stackIn_22_2).append(',').append(param1).append(',');
            stackIn_24_0 = stackOut_22_0;
            stackIn_24_1 = stackOut_22_1;
            stackIn_23_0 = stackOut_22_0;
            stackIn_23_1 = stackOut_22_1;
            if (param2 == null) {
              stackOut_24_0 = (RuntimeException) (Object) stackIn_24_0;
              stackOut_24_1 = (StringBuilder) (Object) stackIn_24_1;
              stackOut_24_2 = "null";
              stackIn_25_0 = stackOut_24_0;
              stackIn_25_1 = stackOut_24_1;
              stackIn_25_2 = stackOut_24_2;
              break L7;
            } else {
              stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
              stackOut_23_1 = (StringBuilder) (Object) stackIn_23_1;
              stackOut_23_2 = "{...}";
              stackIn_25_0 = stackOut_23_0;
              stackIn_25_1 = stackOut_23_1;
              stackIn_25_2 = stackOut_23_2;
              break L7;
            }
          }
          L8: {
            stackOut_25_0 = (RuntimeException) (Object) stackIn_25_0;
            stackOut_25_1 = ((StringBuilder) (Object) stackIn_25_1).append(stackIn_25_2).append(',');
            stackIn_27_0 = stackOut_25_0;
            stackIn_27_1 = stackOut_25_1;
            stackIn_26_0 = stackOut_25_0;
            stackIn_26_1 = stackOut_25_1;
            if (param3 == null) {
              stackOut_27_0 = (RuntimeException) (Object) stackIn_27_0;
              stackOut_27_1 = (StringBuilder) (Object) stackIn_27_1;
              stackOut_27_2 = "null";
              stackIn_28_0 = stackOut_27_0;
              stackIn_28_1 = stackOut_27_1;
              stackIn_28_2 = stackOut_27_2;
              break L8;
            } else {
              stackOut_26_0 = (RuntimeException) (Object) stackIn_26_0;
              stackOut_26_1 = (StringBuilder) (Object) stackIn_26_1;
              stackOut_26_2 = "{...}";
              stackIn_28_0 = stackOut_26_0;
              stackIn_28_1 = stackOut_26_1;
              stackIn_28_2 = stackOut_26_2;
              break L8;
            }
          }
          throw bd.a((Throwable) (Object) stackIn_28_0, stackIn_28_2 + ',' + param4 + ')');
        }
        return stackIn_18_0 != 0;
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
        Object stackIn_17_0 = null;
        int stackIn_17_1 = 0;
        Object stackIn_18_0 = null;
        int stackIn_18_1 = 0;
        Object stackIn_19_0 = null;
        int stackIn_19_1 = 0;
        int stackIn_19_2 = 0;
        Object stackOut_16_0 = null;
        int stackOut_16_1 = 0;
        Object stackOut_18_0 = null;
        int stackOut_18_1 = 0;
        int stackOut_18_2 = 0;
        Object stackOut_17_0 = null;
        int stackOut_17_1 = 0;
        int stackOut_17_2 = 0;
        L0: {
          var9 = wizardrun.field_H;
          this.a(param3, 64, param0, (byte) -16);
          if ((((fl) this).field_y[param0] & 2) != 0) {
            var5 = (vk) (Object) ((fl) this).field_A.field_p.a((byte) 11);
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
                      ((fl) this).field_S[param0][var5.field_k] = null;
                      ((fl) this).field_S[param0][param3] = var5;
                      var6_int = var5.field_z + (var5.field_y * var5.field_I >> 12);
                      var5.field_z = var5.field_z + (-var5.field_k + param3 << 8);
                      var5.field_k = param3;
                      var5.field_I = -var5.field_z + var6_int;
                      var5.field_y = 4096;
                      return;
                    }
                  }
                }
                var5 = (vk) (Object) ((fl) this).field_A.field_p.a(102);
                continue L1;
              }
            }
          } else {
            break L0;
          }
        }
        var10 = (h) (Object) ((fl) this).field_G.a(1, (long)((fl) this).field_P[param0]);
        var11 = var10;
        if (var11 == null) {
          return;
        } else {
          var6 = var10.field_k[param3];
          if (var6 == null) {
            return;
          } else {
            L3: {
              var7 = new vk();
              var7.field_C = var11;
              var7.field_F = param0;
              var7.field_v = var6;
              var7.field_i = var10.field_t[param3];
              var7.field_t = var10.field_l[param3];
              var7.field_k = param3;
              var7.field_D = 1024 + param1 * (param1 * var11.field_n) * var10.field_q[param3] >> 11;
              var7.field_B = 255 & var10.field_o[param3];
              var7.field_z = -(var10.field_r[param3] & 32767) + (param3 << 8);
              var7.field_m = 0;
              var7.field_K = 0;
              var7.field_j = -1;
              var7.field_n = 0;
              var7.field_s = 0;
              if (((fl) this).field_o[param0] != 0) {
                L4: {
                  var7.field_w = uj.a(var6, this.a(-822, var7), 0, this.a(var7, (byte) 79));
                  stackOut_16_0 = this;
                  stackOut_16_1 = 15;
                  stackIn_18_0 = stackOut_16_0;
                  stackIn_18_1 = stackOut_16_1;
                  stackIn_17_0 = stackOut_16_0;
                  stackIn_17_1 = stackOut_16_1;
                  if (var11.field_r[param3] >= 0) {
                    stackOut_18_0 = this;
                    stackOut_18_1 = stackIn_18_1;
                    stackOut_18_2 = 0;
                    stackIn_19_0 = stackOut_18_0;
                    stackIn_19_1 = stackOut_18_1;
                    stackIn_19_2 = stackOut_18_2;
                    break L4;
                  } else {
                    stackOut_17_0 = this;
                    stackOut_17_1 = stackIn_17_1;
                    stackOut_17_2 = 1;
                    stackIn_19_0 = stackOut_17_0;
                    stackIn_19_1 = stackOut_17_1;
                    stackIn_19_2 = stackOut_17_2;
                    break L4;
                  }
                }
                ((fl) this).a(stackIn_19_1, stackIn_19_2 != 0, var7);
                break L3;
              } else {
                var7.field_w = uj.a(var6, this.a(-822, var7), this.a(var7, -98), this.a(var7, (byte) 105));
                break L3;
              }
            }
            L5: {
              if (0 <= var11.field_r[param3]) {
                break L5;
              } else {
                var7.field_w.e(-1);
                break L5;
              }
            }
            L6: {
              if (var7.field_t < 0) {
                break L6;
              } else {
                L7: {
                  var8 = ((fl) this).field_J[param0][var7.field_t];
                  if (var8 == null) {
                    break L7;
                  } else {
                    if (var8.field_j >= 0) {
                      break L7;
                    } else {
                      ((fl) this).field_S[param0][var8.field_k] = null;
                      var8.field_j = 0;
                      break L7;
                    }
                  }
                }
                ((fl) this).field_J[param0][var7.field_t] = var7;
                break L6;
              }
            }
            ((fl) this).field_A.field_p.a((wl) (Object) var7, false);
            ((fl) this).field_S[param0][param3] = var7;
            return;
          }
        }
    }

    final synchronized void b(boolean param0) {
        int var3 = wizardrun.field_H;
        if (!param0) {
            ((fl) this).a(-72, 96);
        }
        h var4 = (h) (Object) ((fl) this).field_G.b((byte) -87);
        while (var4 != null) {
            var4.a(-106);
            var4 = (h) (Object) ((fl) this).field_G.b(1);
        }
    }

    private final void c(boolean param0) {
        int var2 = 0;
        int var3 = 0;
        long var4 = 0L;
        int var6 = 0;
        int var7 = 0;
        L0: {
          var7 = wizardrun.field_H;
          var2 = ((fl) this).field_p;
          var3 = ((fl) this).field_s;
          var4 = ((fl) this).field_n;
          if (((fl) this).field_x == null) {
            break L0;
          } else {
            if (var3 != ((fl) this).field_W) {
              break L0;
            } else {
              this.a(((fl) this).field_U, ((fl) this).field_q, 0, ((fl) this).field_x);
              this.c(false);
              return;
            }
          }
        }
        L1: while (true) {
          if (((fl) this).field_s != var3) {
            L2: {
              ((fl) this).field_n = var4;
              ((fl) this).field_s = var3;
              ((fl) this).field_p = var2;
              if (null == ((fl) this).field_x) {
                break L2;
              } else {
                if (var3 <= ((fl) this).field_W) {
                  break L2;
                } else {
                  ((fl) this).field_p = -1;
                  ((fl) this).field_s = ((fl) this).field_W;
                  ((fl) this).field_n = ((fl) this).field_E.e(((fl) this).field_s);
                  break L2;
                }
              }
            }
            return;
          } else {
            L3: while (true) {
              L4: {
                if (((fl) this).field_E.field_h[var2] != var3) {
                  break L4;
                } else {
                  ((fl) this).field_E.a(var2);
                  var6 = ((fl) this).field_E.d(var2);
                  if (var6 == 1) {
                    ((fl) this).field_E.g();
                    ((fl) this).field_E.c(var2);
                    if (!((fl) this).field_E.f()) {
                      break L4;
                    } else {
                      if (((fl) this).field_x != null) {
                        ((fl) this).a(((fl) this).field_U, -76, ((fl) this).field_x);
                        this.c(false);
                        return;
                      } else {
                        L5: {
                          if (!((fl) this).field_U) {
                            break L5;
                          } else {
                            if (0 != var3) {
                              ((fl) this).field_E.a(var4);
                              break L4;
                            } else {
                              break L5;
                            }
                          }
                        }
                        this.a(true, (byte) -91);
                        ((fl) this).field_E.e();
                        return;
                      }
                    }
                  } else {
                    L6: {
                      if ((var6 & 128) != 0) {
                        int discarded$1 = 12035;
                        this.e(var6);
                        break L6;
                      } else {
                        break L6;
                      }
                    }
                    ((fl) this).field_E.b(var2);
                    ((fl) this).field_E.c(var2);
                    continue L3;
                  }
                }
              }
              var2 = ((fl) this).field_E.b();
              var3 = ((fl) this).field_E.field_h[var2];
              var4 = ((fl) this).field_E.e(var3);
              continue L1;
            }
          }
        }
    }

    final void a(int param0, boolean param1, vk param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        Object var7 = null;
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
                var4_int = param2.field_v.field_k.length;
                if (!param1) {
                  break L2;
                } else {
                  if (param2.field_v.field_j) {
                    var6 = -param2.field_v.field_n + var4_int + var4_int;
                    var5 = (int)((long)((fl) this).field_o[param2.field_F] * (long)var6 >> 6);
                    var4_int = var4_int << 8;
                    if (~var4_int >= ~var5) {
                      param2.field_w.b(true);
                      var5 = -var5 + (var4_int + var4_int) + -1;
                      break L1;
                    } else {
                      break L1;
                    }
                  } else {
                    break L2;
                  }
                }
              }
              var5 = (int)((long)var4_int * (long)((fl) this).field_o[param2.field_F] >> 6);
              break L1;
            }
            L3: {
              if (param0 == 15) {
                break L3;
              } else {
                var7 = null;
                ((fl) this).a(true, -14, (ji) null);
                break L3;
              }
            }
            param2.field_w.g(var5);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var4 = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) var4;
            stackOut_11_1 = new StringBuilder().append("fl.V(").append(param0).append(',').append(param1).append(',');
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param2 == null) {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L4;
            } else {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L4;
            }
          }
          throw bd.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + ')');
        }
    }

    private final int a(int param0, vk param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        q var4 = null;
        int var5 = 0;
        int var6 = 0;
        double var7 = 0.0;
        int stackIn_11_0 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_10_0 = 0;
        int stackOut_9_0 = 0;
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
            L1: {
              var3_int = param1.field_z + (param1.field_I * param1.field_y >> 12);
              var3_int = var3_int + ((-8192 + ((fl) this).field_I[param1.field_F]) * ((fl) this).field_D[param1.field_F] >> 12);
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
                  var5 = var4.field_e << 2;
                  var6 = var4.field_a << 1;
                  if (param1.field_q < var6) {
                    var5 = var5 * param1.field_q / var6;
                    break L3;
                  } else {
                    break L3;
                  }
                }
                var5 = var5 + (((fl) this).field_C[param1.field_F] >> 7);
                var7 = Math.sin(0.01227184630308513 * (double)(param1.field_x & 511));
                var3_int = var3_int + (int)((double)var5 * var7);
                break L1;
              }
            }
            L4: {
              var5 = (int)((double)(256 * param1.field_v.field_m) * Math.pow(2.0, (double)var3_int * 0.0003255208333333333) / (double)c.field_l + 0.5);
              if (var5 < 1) {
                stackOut_10_0 = 1;
                stackIn_11_0 = stackOut_10_0;
                break L4;
              } else {
                stackOut_9_0 = var5;
                stackIn_11_0 = stackOut_9_0;
                break L4;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var3 = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) var3;
            stackOut_12_1 = new StringBuilder().append("fl.M(").append(-822).append(',');
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param1 == null) {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L5;
            } else {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L5;
            }
          }
          throw bd.a((Throwable) (Object) stackIn_15_0, stackIn_15_2 + ')');
        }
        return stackIn_11_0;
    }

    private final void c(int param0, int param1, int param2) {
        ((fl) this).field_z[param0] = param2;
        if (param1 <= 113) {
            ((fl) this).field_U = false;
        }
        ((fl) this).field_Q[param0] = (int)(2097152.0 * Math.pow(2.0, 0.00054931640625 * (double)param2) + 0.5);
    }

    private final void b(int param0, int param1, int param2, byte param3) {
    }

    private final void c(int param0, int param1) {
        vk var3 = null;
        int var4 = wizardrun.field_H;
        if (!((2 & ((fl) this).field_y[param1]) == 0)) {
            var3 = (vk) (Object) ((fl) this).field_A.field_p.b((byte) 91);
            while (var3 != null) {
                if (~param1 == ~var3.field_F) {
                    if (((fl) this).field_S[param1][var3.field_k] == null) {
                        if (var3.field_j < 0) {
                            var3.field_j = 0;
                        }
                    }
                }
                var3 = (vk) (Object) ((fl) this).field_A.field_p.d(8192);
            }
        }
    }

    private final void e(int param0) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        var8 = wizardrun.field_H;
        var3 = 240 & param0;
        if (var3 == 128) {
          var4 = 15 & param0;
          var5 = param0 >> 8 & 127;
          var6 = 127 & param0 >> 16;
          this.a(var5, var6, var4, (byte) -16);
          return;
        } else {
          L0: {
            if (144 != var3) {
              if (var3 != 160) {
                if (176 == var3) {
                  L1: {
                    var4 = 15 & param0;
                    var5 = (param0 & 32628) >> 8;
                    var6 = (param0 & 8367717) >> 16;
                    if (var5 != 0) {
                      break L1;
                    } else {
                      ((fl) this).field_w[var4] = (var6 << 14) + kl.b(((fl) this).field_w[var4], -2080769);
                      break L1;
                    }
                  }
                  L2: {
                    if (var5 != 32) {
                      break L2;
                    } else {
                      ((fl) this).field_w[var4] = (var6 << 7) + kl.b(((fl) this).field_w[var4], -16257);
                      break L2;
                    }
                  }
                  L3: {
                    if (1 != var5) {
                      break L3;
                    } else {
                      ((fl) this).field_C[var4] = kl.b(((fl) this).field_C[var4], -16257) + (var6 << 7);
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
                      ((fl) this).field_t[var4] = (var6 << 7) + kl.b(-16257, ((fl) this).field_t[var4]);
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
                      ((fl) this).field_N[var4] = kl.b(-16257, ((fl) this).field_N[var4]) + (var6 << 7);
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
                      ((fl) this).field_B[var4] = (var6 << 7) + kl.b(((fl) this).field_B[var4], -16257);
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
                      ((fl) this).field_v[var4] = (var6 << 7) + kl.b(-16257, ((fl) this).field_v[var4]);
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
                      if (var6 < 64) {
                        ((fl) this).field_y[var4] = kl.b(((fl) this).field_y[var4], -2);
                        break L13;
                      } else {
                        ((fl) this).field_y[var4] = sd.a(((fl) this).field_y[var4], 1);
                        break L13;
                      }
                    }
                  }
                  L14: {
                    if (var5 != 65) {
                      break L14;
                    } else {
                      if (64 <= var6) {
                        ((fl) this).field_y[var4] = sd.a(((fl) this).field_y[var4], 2);
                        break L14;
                      } else {
                        this.c(256, var4);
                        ((fl) this).field_y[var4] = kl.b(((fl) this).field_y[var4], -3);
                        break L14;
                      }
                    }
                  }
                  L15: {
                    if (99 != var5) {
                      break L15;
                    } else {
                      ((fl) this).field_L[var4] = (var6 << 7) + kl.b(127, ((fl) this).field_L[var4]);
                      break L15;
                    }
                  }
                  L16: {
                    if (98 == var5) {
                      ((fl) this).field_L[var4] = var6 + kl.b(16256, ((fl) this).field_L[var4]);
                      break L16;
                    } else {
                      break L16;
                    }
                  }
                  L17: {
                    if (101 == var5) {
                      ((fl) this).field_L[var4] = kl.b(127, ((fl) this).field_L[var4]) + (16384 + (var6 << 7));
                      break L17;
                    } else {
                      break L17;
                    }
                  }
                  L18: {
                    if (var5 != 100) {
                      break L18;
                    } else {
                      ((fl) this).field_L[var4] = kl.b(((fl) this).field_L[var4], 16256) + (16384 + var6);
                      break L18;
                    }
                  }
                  L19: {
                    if (var5 == 120) {
                      this.d(0, var4);
                      break L19;
                    } else {
                      break L19;
                    }
                  }
                  L20: {
                    if (var5 != 121) {
                      break L20;
                    } else {
                      this.a(var4, (byte) 21);
                      break L20;
                    }
                  }
                  L21: {
                    if (123 == var5) {
                      int discarded$1 = -1;
                      this.g(var4);
                      break L21;
                    } else {
                      break L21;
                    }
                  }
                  L22: {
                    if (6 != var5) {
                      break L22;
                    } else {
                      var7 = ((fl) this).field_L[var4];
                      if (var7 == 16384) {
                        ((fl) this).field_D[var4] = (var6 << 7) + kl.b(((fl) this).field_D[var4], -16257);
                        break L22;
                      } else {
                        break L22;
                      }
                    }
                  }
                  L23: {
                    if (38 == var5) {
                      var7 = ((fl) this).field_L[var4];
                      if (var7 == 16384) {
                        ((fl) this).field_D[var4] = kl.b(((fl) this).field_D[var4], -128) + var6;
                        break L23;
                      } else {
                        break L23;
                      }
                    } else {
                      break L23;
                    }
                  }
                  L24: {
                    if (16 == var5) {
                      ((fl) this).field_o[var4] = (var6 << 7) + kl.b(((fl) this).field_o[var4], -16257);
                      break L24;
                    } else {
                      break L24;
                    }
                  }
                  L25: {
                    if (var5 == 48) {
                      ((fl) this).field_o[var4] = kl.b(-128, ((fl) this).field_o[var4]) - -var6;
                      break L25;
                    } else {
                      break L25;
                    }
                  }
                  L26: {
                    if (var5 == 81) {
                      if (var6 < 64) {
                        this.b(-1, var4);
                        ((fl) this).field_y[var4] = kl.b(((fl) this).field_y[var4], -5);
                        break L26;
                      } else {
                        ((fl) this).field_y[var4] = sd.a(((fl) this).field_y[var4], 4);
                        break L26;
                      }
                    } else {
                      break L26;
                    }
                  }
                  L27: {
                    if (17 != var5) {
                      break L27;
                    } else {
                      this.c(var4, 121, (var6 << 7) + (((fl) this).field_z[var4] & -16257));
                      break L27;
                    }
                  }
                  if (var5 != 49) {
                    break L0;
                  } else {
                    this.c(var4, 119, (-128 & ((fl) this).field_z[var4]) + var6);
                    return;
                  }
                } else {
                  if (192 != var3) {
                    if (var3 != 208) {
                      if (var3 != 224) {
                        var3 = param0 & 255;
                        if (var3 != 255) {
                          return;
                        } else {
                          this.a(true, (byte) -78);
                          return;
                        }
                      } else {
                        var4 = param0 & 15;
                        var5 = (param0 >> 8 & 127) + ((param0 & 8323516) >> 9);
                        this.b(var4, var5, 38);
                        return;
                      }
                    } else {
                      var4 = 15 & param0;
                      var5 = 127 & param0 >> 8;
                      this.d(var5, 2, var4);
                      return;
                    }
                  } else {
                    var4 = param0 & 15;
                    var5 = 127 & param0 >> 8;
                    this.e(-129, var5 + ((fl) this).field_w[var4], var4);
                    return;
                  }
                }
              } else {
                var4 = 15 & param0;
                var5 = 127 & param0 >> 8;
                var6 = (8323853 & param0) >> 16;
                this.b(var4, var6, var5, (byte) 118);
                return;
              }
            } else {
              var4 = param0 & 15;
              var5 = param0 >> 8 & 127;
              var6 = param0 >> 16 & 127;
              if (var6 <= 0) {
                this.a(var5, 64, var4, (byte) -16);
                return;
              } else {
                this.a(var4, var6, 0, var5);
                break L0;
              }
            }
          }
          return;
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
            if (((fl) this).field_E.c()) {
              var2 = ((fl) this).field_r * ((fl) this).field_E.field_d / c.field_l;
              L2: while (true) {
                var3 = (long)var2 * (long)param0 + ((fl) this).field_K;
                if (-var3 + ((fl) this).field_n < 0L) {
                  var5 = (int)((-1L + ((long)var2 + ((fl) this).field_n + -((fl) this).field_K)) / (long)var2);
                  ((fl) this).field_K = ((fl) this).field_K + (long)var5 * (long)var2;
                  ((fl) this).field_A.a(var5);
                  param0 = param0 - var5;
                  this.c(false);
                  if (((fl) this).field_E.c()) {
                    continue L2;
                  } else {
                    ((fl) this).field_A.a(param0);
                    break L0;
                  }
                } else {
                  ((fl) this).field_K = var3;
                  break L1;
                }
              }
            } else {
              break L1;
            }
          }
          ((fl) this).field_A.a(param0);
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
                ((fl) this).field_r = -65;
            }
            this.a(param0, true, 0, param2);
        } catch (RuntimeException runtimeException) {
            throw bd.a((Throwable) (Object) runtimeException, "fl.T(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final synchronized void d(int param0) {
        this.a(true, true);
        if (param0 >= -20) {
            field_T = null;
        }
    }

    public static void c(int param0) {
        int var1 = -95;
        field_F = null;
        field_H = null;
        field_T = null;
    }

    private final void g(int param0) {
        vk var3 = null;
        int var4 = 0;
        var4 = wizardrun.field_H;
        var3 = (vk) (Object) ((fl) this).field_A.field_p.b((byte) 110);
        L0: while (true) {
          if (var3 == null) {
            return;
          } else {
            L1: {
              L2: {
                if (param0 < 0) {
                  break L2;
                } else {
                  if (~param0 == ~var3.field_F) {
                    break L2;
                  } else {
                    break L1;
                  }
                }
              }
              if (var3.field_j >= 0) {
                break L1;
              } else {
                ((fl) this).field_S[var3.field_F][var3.field_k] = null;
                var3.field_j = 0;
                break L1;
              }
            }
            var3 = (vk) (Object) ((fl) this).field_A.field_p.d(8192);
            continue L0;
          }
        }
    }

    private final synchronized void a(boolean param0, boolean param1, int param2, ji param3) {
        int var5_int = 0;
        int var6 = 0;
        int var7 = wizardrun.field_H;
        try {
            this.a(true, param1);
            ((fl) this).field_E.a(param3.field_j);
            ((fl) this).field_U = param0 ? true : false;
            ((fl) this).field_K = 0L;
            var5_int = ((fl) this).field_E.d();
            for (var6 = 0; var5_int > var6; var6++) {
                ((fl) this).field_E.a(var6);
                ((fl) this).field_E.b(var6);
                ((fl) this).field_E.c(var6);
            }
            ((fl) this).field_p = ((fl) this).field_E.b();
            ((fl) this).field_s = ((fl) this).field_E.field_h[((fl) this).field_p];
            ((fl) this).field_n = ((fl) this).field_E.e(((fl) this).field_s);
        } catch (RuntimeException runtimeException) {
            throw bd.a((Throwable) (Object) runtimeException, "fl.IA(" + param0 + ',' + param1 + ',' + 0 + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    private final synchronized void a(boolean param0, boolean param1) {
        ((fl) this).field_E.e();
        ((fl) this).field_x = null;
        this.a(param1, (byte) -71);
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
                        return true;
                      }
                    }
                  }
                }
                stackOut_8_0 = 1;
                stackIn_9_0 = stackOut_8_0;
                return stackIn_9_0 != 0;
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
            stackOut_12_0 = (RuntimeException) var3;
            stackOut_12_1 = new StringBuilder().append("fl.R(").append(param0).append(',');
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param1 == null) {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L2;
            } else {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L2;
            }
          }
          throw bd.a((Throwable) (Object) stackIn_15_0, stackIn_15_2 + ')');
        }
        return stackIn_11_0 != 0;
    }

    final synchronized void a(int param0, int param1) {
        ((fl) this).field_m = param1;
        if (param0 != -1) {
            ((fl) this).field_J = null;
        }
    }

    private final void f(int param0, int param1, int param2) {
        ((fl) this).field_O[param1] = param0;
        ((fl) this).field_w[param1] = kl.b(param0, -128);
        if (param2 != 1) {
            ((fl) this).field_o = null;
        }
        this.e(param2 ^ -130, param0, param1);
    }

    private final void a(int param0, byte param1) {
        int var4 = 0;
        var4 = wizardrun.field_H;
        if (param0 < 0) {
          param0 = 0;
          L0: while (true) {
            if (param0 >= 16) {
              return;
            } else {
              this.a(param0, (byte) 21);
              param0++;
              continue L0;
            }
          }
        } else {
          ((fl) this).field_N[param0] = 12800;
          ((fl) this).field_B[param0] = 8192;
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
          this.c(param0, 124, 8192);
          return;
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
        int stackIn_61_0 = 0;
        int stackIn_63_0 = 0;
        RuntimeException stackIn_65_0 = null;
        StringBuilder stackIn_65_1 = null;
        RuntimeException stackIn_66_0 = null;
        StringBuilder stackIn_66_1 = null;
        RuntimeException stackIn_67_0 = null;
        StringBuilder stackIn_67_1 = null;
        String stackIn_67_2 = null;
        RuntimeException stackIn_68_0 = null;
        StringBuilder stackIn_68_1 = null;
        RuntimeException stackIn_69_0 = null;
        StringBuilder stackIn_69_1 = null;
        RuntimeException stackIn_70_0 = null;
        StringBuilder stackIn_70_1 = null;
        String stackIn_70_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_8_0 = 0;
        int stackOut_60_0 = 0;
        int stackOut_62_0 = 0;
        RuntimeException stackOut_64_0 = null;
        StringBuilder stackOut_64_1 = null;
        RuntimeException stackOut_66_0 = null;
        StringBuilder stackOut_66_1 = null;
        String stackOut_66_2 = null;
        RuntimeException stackOut_65_0 = null;
        StringBuilder stackOut_65_1 = null;
        String stackOut_65_2 = null;
        RuntimeException stackOut_67_0 = null;
        StringBuilder stackOut_67_1 = null;
        RuntimeException stackOut_69_0 = null;
        StringBuilder stackOut_69_1 = null;
        String stackOut_69_2 = null;
        RuntimeException stackOut_68_0 = null;
        StringBuilder stackOut_68_1 = null;
        String stackOut_68_2 = null;
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
                      return true;
                    }
                  }
                }
                stackOut_8_0 = 1;
                stackIn_9_0 = stackOut_8_0;
                return stackIn_9_0 != 0;
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
              var9 = (double)((-60 + param2.field_k << 8) + (param2.field_I * param2.field_y >> 12)) * 0.000005086263020833333;
              if (var7.field_h > 0) {
                L7: {
                  if (var7.field_d <= 0) {
                    param2.field_m = param2.field_m + 128;
                    break L7;
                  } else {
                    param2.field_m = param2.field_m + (int)(0.5 + 128.0 * Math.pow(2.0, (double)var7.field_d * var9));
                    break L7;
                  }
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
            L8: {
              if (null != var7.field_f) {
                L9: {
                  if (var7.field_i > 0) {
                    param2.field_K = param2.field_K + (int)(0.5 + 128.0 * Math.pow(2.0, var9 * (double)var7.field_i));
                    break L9;
                  } else {
                    param2.field_K = param2.field_K + 128;
                    break L9;
                  }
                }
                L10: while (true) {
                  L11: {
                    if (param2.field_n >= var7.field_f.length + -2) {
                      break L11;
                    } else {
                      if ((255 & var7.field_f[2 + param2.field_n]) << 8 >= param2.field_K) {
                        break L11;
                      } else {
                        param2.field_n = param2.field_n + 2;
                        continue L10;
                      }
                    }
                  }
                  if (var7.field_f.length - 2 != param2.field_n) {
                    break L8;
                  } else {
                    if (var7.field_f[param2.field_n - -1] != 0) {
                      break L8;
                    } else {
                      var8 = 1;
                      break L8;
                    }
                  }
                }
              } else {
                break L8;
              }
            }
            L12: {
              if (param2.field_j < param0) {
                break L12;
              } else {
                if (null == var7.field_c) {
                  break L12;
                } else {
                  if ((((fl) this).field_y[param2.field_F] & 1) == 0) {
                    L13: {
                      if (param2.field_t < 0) {
                        break L13;
                      } else {
                        if (param2 != ((fl) this).field_J[param2.field_F][param2.field_t]) {
                          break L13;
                        } else {
                          break L12;
                        }
                      }
                    }
                    L14: {
                      if (0 < var7.field_j) {
                        param2.field_j = param2.field_j + (int)(0.5 + Math.pow(2.0, var9 * (double)var7.field_j) * 128.0);
                        break L14;
                      } else {
                        param2.field_j = param2.field_j + 128;
                        break L14;
                      }
                    }
                    L15: while (true) {
                      L16: {
                        if (~(var7.field_c.length + -2) >= ~param2.field_s) {
                          break L16;
                        } else {
                          if (param2.field_j <= (var7.field_c[2 + param2.field_s] << 8 & 65280)) {
                            break L16;
                          } else {
                            param2.field_s = param2.field_s + 2;
                            continue L15;
                          }
                        }
                      }
                      if (~param2.field_s == ~(-2 + var7.field_c.length)) {
                        var8 = 1;
                        break L12;
                      } else {
                        break L12;
                      }
                    }
                  } else {
                    break L12;
                  }
                }
              }
            }
            if (var8 != 0) {
              L17: {
                param2.field_w.f(param2.field_E);
                if (param1 == null) {
                  param2.field_w.a(param3);
                  break L17;
                } else {
                  param2.field_w.a(param1, param4, param3);
                  break L17;
                }
              }
              L18: {
                if (!param2.field_w.i()) {
                  break L18;
                } else {
                  ((fl) this).field_A.field_o.a((k) (Object) param2.field_w);
                  break L18;
                }
              }
              L19: {
                param2.a(0);
                if (param2.field_j < 0) {
                  break L19;
                } else {
                  param2.a(false);
                  if (param2.field_t <= 0) {
                    break L19;
                  } else {
                    if (((fl) this).field_J[param2.field_F][param2.field_t] != param2) {
                      break L19;
                    } else {
                      ((fl) this).field_J[param2.field_F][param2.field_t] = null;
                      break L19;
                    }
                  }
                }
              }
              stackOut_60_0 = 1;
              stackIn_61_0 = stackOut_60_0;
              return stackIn_61_0 != 0;
            } else {
              param2.field_w.a(param2.field_E, this.a(param2, -109), this.a(param2, (byte) 59));
              stackOut_62_0 = 0;
              stackIn_63_0 = stackOut_62_0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L20: {
            var6 = decompiledCaughtException;
            stackOut_64_0 = (RuntimeException) var6;
            stackOut_64_1 = new StringBuilder().append("fl.H(").append(param0).append(',');
            stackIn_66_0 = stackOut_64_0;
            stackIn_66_1 = stackOut_64_1;
            stackIn_65_0 = stackOut_64_0;
            stackIn_65_1 = stackOut_64_1;
            if (param1 == null) {
              stackOut_66_0 = (RuntimeException) (Object) stackIn_66_0;
              stackOut_66_1 = (StringBuilder) (Object) stackIn_66_1;
              stackOut_66_2 = "null";
              stackIn_67_0 = stackOut_66_0;
              stackIn_67_1 = stackOut_66_1;
              stackIn_67_2 = stackOut_66_2;
              break L20;
            } else {
              stackOut_65_0 = (RuntimeException) (Object) stackIn_65_0;
              stackOut_65_1 = (StringBuilder) (Object) stackIn_65_1;
              stackOut_65_2 = "{...}";
              stackIn_67_0 = stackOut_65_0;
              stackIn_67_1 = stackOut_65_1;
              stackIn_67_2 = stackOut_65_2;
              break L20;
            }
          }
          L21: {
            stackOut_67_0 = (RuntimeException) (Object) stackIn_67_0;
            stackOut_67_1 = ((StringBuilder) (Object) stackIn_67_1).append(stackIn_67_2).append(',');
            stackIn_69_0 = stackOut_67_0;
            stackIn_69_1 = stackOut_67_1;
            stackIn_68_0 = stackOut_67_0;
            stackIn_68_1 = stackOut_67_1;
            if (param2 == null) {
              stackOut_69_0 = (RuntimeException) (Object) stackIn_69_0;
              stackOut_69_1 = (StringBuilder) (Object) stackIn_69_1;
              stackOut_69_2 = "null";
              stackIn_70_0 = stackOut_69_0;
              stackIn_70_1 = stackOut_69_1;
              stackIn_70_2 = stackOut_69_2;
              break L21;
            } else {
              stackOut_68_0 = (RuntimeException) (Object) stackIn_68_0;
              stackOut_68_1 = (StringBuilder) (Object) stackIn_68_1;
              stackOut_68_2 = "{...}";
              stackIn_70_0 = stackOut_68_0;
              stackIn_70_1 = stackOut_68_1;
              stackIn_70_2 = stackOut_68_2;
              break L21;
            }
          }
          throw bd.a((Throwable) (Object) stackIn_70_0, stackIn_70_2 + ',' + param3 + ',' + param4 + ')');
        }
        return stackIn_63_0 != 0;
    }

    private final synchronized void a(int param0, int param1, int param2) {
        int var4 = 0;
        int var5 = wizardrun.field_H;
        for (var4 = 0; var4 < 16; var4++) {
            ((fl) this).field_R[var4] = 256;
        }
    }

    final synchronized int d() {
        return 0;
    }

    final static void f(int param0) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int stackIn_5_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_4_0 = 0;
        var3 = wizardrun.field_H;
        try {
          L0: {
            wizardrun.a(true, (byte) 11, param0, lg.field_d, dg.field_d, rb.field_e, 0);
            var2_int = 0;
            stackOut_3_0 = lg.field_d;
            stackIn_5_0 = stackOut_3_0;
            L1: while (true) {
              if (~stackIn_5_0 >= ~var2_int) {
                L2: {
                  wizardrun.a(false, (byte) 11, param0 - -param0, lg.field_d + param0, gf.field_W, dj.field_b, param0);
                  if (~lg.field_d < ~param0) {
                    lg.field_d = param0;
                    break L2;
                  } else {
                    break L2;
                  }
                }
                break L0;
              } else {
                sj.field_m[param0 + var2_int] = var2_int;
                var2_int++;
                stackOut_4_0 = lg.field_d;
                stackIn_5_0 = stackOut_4_0;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw bd.a((Throwable) (Object) var2, "fl.QA(" + param0 + ',' + 16 + ')');
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
            if (((fl) this).field_R[param0.field_F] == 0) {
              stackOut_2_0 = 0;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0;
            } else {
              L1: {
                var4 = param0.field_i;
                var5 = 4096 + ((fl) this).field_N[param0.field_F] * ((fl) this).field_v[param0.field_F] >> 13;
                var5 = var5 * var5 - -16384 >> 15;
                var5 = 16384 + param0.field_D * var5 >> 15;
                var5 = 128 + ((fl) this).field_m * var5 >> 8;
                var5 = 128 + var5 * ((fl) this).field_R[param0.field_F] >> 8;
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
                      var8 = (var4.field_f[param0.field_n] & 255) << 8;
                      var9 = (255 & var4.field_f[param0.field_n - -2]) << 8;
                      var7 = var7 + (-var7 + var4.field_f[param0.field_n - -3]) * (var6 - var8) / (-var8 + var9);
                      break L3;
                    }
                  }
                  var5 = var5 * var7 + 32 >> 6;
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
                        var8 = var4.field_c[param0.field_s] << 8 & 65280;
                        var9 = (var4.field_c[param0.field_s - -2] & 255) << 8;
                        var7 = var7 + (var6 - var8) * (var4.field_c[3 + param0.field_s] - var7) / (-var8 + var9);
                        break L5;
                      } else {
                        break L5;
                      }
                    }
                    var5 = var7 * var5 - -32 >> 6;
                    break L4;
                  } else {
                    break L4;
                  }
                }
              }
              stackOut_17_0 = var5;
              stackIn_18_0 = stackOut_17_0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var3 = decompiledCaughtException;
            stackOut_19_0 = (RuntimeException) var3;
            stackOut_19_1 = new StringBuilder().append("fl.U(");
            stackIn_21_0 = stackOut_19_0;
            stackIn_21_1 = stackOut_19_1;
            stackIn_20_0 = stackOut_19_0;
            stackIn_20_1 = stackOut_19_1;
            if (param0 == null) {
              stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "null";
              stackIn_22_0 = stackOut_21_0;
              stackIn_22_1 = stackOut_21_1;
              stackIn_22_2 = stackOut_21_2;
              break L6;
            } else {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "{...}";
              stackIn_22_0 = stackOut_20_0;
              stackIn_22_1 = stackOut_20_1;
              stackIn_22_2 = stackOut_20_2;
              break L6;
            }
          }
          throw bd.a((Throwable) (Object) stackIn_22_0, stackIn_22_2 + ',' + param1 + ')');
        }
        return stackIn_18_0;
    }

    private final void a(int param0, int param1, int param2, byte param3) {
        vk var6 = null;
        int var7 = 0;
        vk var8 = null;
        var7 = wizardrun.field_H;
        var8 = ((fl) this).field_S[param2][param0];
        if (var8 == null) {
          return;
        } else {
          L0: {
            ((fl) this).field_S[param2][param0] = null;
            if ((((fl) this).field_y[param2] & 2) == 0) {
              var8.field_j = 0;
              break L0;
            } else {
              var6 = (vk) (Object) ((fl) this).field_A.field_p.b((byte) 84);
              L1: while (true) {
                if (var6 == null) {
                  break L0;
                } else {
                  L2: {
                    if (~var8.field_F != ~var6.field_F) {
                      break L2;
                    } else {
                      if (var6.field_j >= 0) {
                        break L2;
                      } else {
                        if (var6 != var8) {
                          var8.field_j = 0;
                          break L0;
                        } else {
                          break L2;
                        }
                      }
                    }
                  }
                  var6 = (vk) (Object) ((fl) this).field_A.field_p.d(8192);
                  continue L1;
                }
              }
            }
          }
          return;
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
        var8 = wizardrun.field_H;
        try {
          L0: {
            L1: {
              L2: {
                if (((fl) this).field_E.c()) {
                  var4_int = ((fl) this).field_r * ((fl) this).field_E.field_d / c.field_l;
                  L3: while (true) {
                    var5 = ((fl) this).field_K + (long)param2 * (long)var4_int;
                    if (((fl) this).field_n + -var5 < 0L) {
                      var7 = (int)((-1L + (long)var4_int + (-((fl) this).field_K + ((fl) this).field_n)) / (long)var4_int);
                      ((fl) this).field_K = ((fl) this).field_K + (long)var7 * (long)var4_int;
                      ((fl) this).field_A.a(param0, param1, var7);
                      param1 = param1 + var7;
                      param2 = param2 - var7;
                      this.c(false);
                      if (((fl) this).field_E.c()) {
                        continue L3;
                      } else {
                        ((fl) this).field_A.a(param0, param1, param2);
                        break L1;
                      }
                    } else {
                      ((fl) this).field_K = var5;
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
          L4: {
            var4 = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) var4;
            stackOut_10_1 = new StringBuilder().append("fl.D(");
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param0 == null) {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L4;
            } else {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L4;
            }
          }
          throw bd.a((Throwable) (Object) stackIn_13_0, stackIn_13_2 + ',' + param1 + ',' + param2 + ')');
        }
    }

    private final void b(int param0, int param1, int param2) {
        ((fl) this).field_I[param0] = param1;
    }

    private final void a(boolean param0, byte param1) {
        int var3 = 0;
        int var4 = wizardrun.field_H;
        if (!param0) {
            int discarded$1 = -1;
            this.g(-1);
        } else {
            this.d(0, -1);
        }
        this.a(-1, (byte) 21);
        for (var3 = 0; 16 > var3; var3++) {
            ((fl) this).field_P[var3] = ((fl) this).field_O[var3];
        }
        int var5 = 0;
        var3 = var5;
        if (param1 > -62) {
            this.f(-85, 122, -57);
        }
        while (16 > var5) {
            ((fl) this).field_w[var5] = kl.b(((fl) this).field_O[var5], -128);
            var5++;
        }
    }

    private final void b(int param0, int param1) {
        vk var3 = null;
        int var4 = wizardrun.field_H;
        if (!((4 & ((fl) this).field_y[param1]) == 0)) {
            var3 = (vk) (Object) ((fl) this).field_A.field_p.b((byte) 55);
            while (var3 != null) {
                if (!(~param1 != ~var3.field_F)) {
                    var3.field_H = 0;
                }
                var3 = (vk) (Object) ((fl) this).field_A.field_p.d(8192);
            }
        }
    }

    final synchronized k a() {
        return (k) (Object) ((fl) this).field_A;
    }

    private final void d(int param0, int param1) {
        vk var3 = null;
        int var4 = 0;
        var4 = wizardrun.field_H;
        var3 = (vk) (Object) ((fl) this).field_A.field_p.b((byte) 92);
        L0: while (true) {
          if (var3 == null) {
            return;
          } else {
            L1: {
              L2: {
                if (param1 < 0) {
                  break L2;
                } else {
                  if (~var3.field_F == ~param1) {
                    break L2;
                  } else {
                    break L1;
                  }
                }
              }
              L3: {
                if (var3.field_w != null) {
                  L4: {
                    var3.field_w.f(c.field_l / 100);
                    if (var3.field_w.i()) {
                      ((fl) this).field_A.field_o.a((k) (Object) var3.field_w);
                      break L4;
                    } else {
                      break L4;
                    }
                  }
                  var3.a(0);
                  break L3;
                } else {
                  break L3;
                }
              }
              L5: {
                if (var3.field_j >= 0) {
                  break L5;
                } else {
                  ((fl) this).field_S[var3.field_F][var3.field_k] = null;
                  break L5;
                }
              }
              var3.a(false);
              break L1;
            }
            var3 = (vk) (Object) ((fl) this).field_A.field_p.d(8192);
            continue L0;
          }
        }
    }

    private final void d(int param0, int param1, int param2) {
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
        ((fl) this).field_G = new ab(128);
        this.a(256, 114, -1);
        this.a(true, (byte) -67);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        sk.a(16062, 50);
    }
}
