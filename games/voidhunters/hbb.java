/*
 * Decompiled by CFR-JS 0.4.0.
 */
class hbb extends f {
    private int[] field_A;
    private int field_q;
    private gnb field_E;
    private int[] field_G;
    private fkb[][] field_O;
    private int[] field_r;
    private q field_u;
    int[] field_j;
    private int field_p;
    private int[] field_K;
    private int[] field_M;
    static byte[] field_N;
    private int[] field_n;
    int[] field_v;
    private int[] field_y;
    private int[] field_t;
    private fkb[][] field_H;
    int[] field_l;
    static int field_z;
    private int[] field_o;
    private int[] field_D;
    private int[] field_I;
    private int[] field_B;
    private int[] field_x;
    private long field_h;
    private int field_m;
    private long field_i;
    private int field_F;
    private ht field_k;
    private boolean field_L;
    private boolean field_s;
    private int field_w;
    private kka field_C;

    private final void a(int param0, int param1) {
        fkb var3 = null;
        int var4 = 0;
        L0: {
          var4 = VoidHunters.field_G;
          if (param0 == 144) {
            break L0;
          } else {
            this.b(80, 70, -74);
            break L0;
          }
        }
        var3 = (fkb) (Object) ((hbb) this).field_k.field_k.d(0);
        L1: while (true) {
          if (var3 == null) {
            return;
          } else {
            L2: {
              L3: {
                if (0 > param1) {
                  break L3;
                } else {
                  if (var3.field_o != param1) {
                    break L2;
                  } else {
                    break L3;
                  }
                }
              }
              L4: {
                if (null != var3.field_j) {
                  L5: {
                    var3.field_j.f(vka.field_s / 100);
                    if (!var3.field_j.g()) {
                      break L5;
                    } else {
                      ((hbb) this).field_k.field_j.b((f) (Object) var3.field_j);
                      break L5;
                    }
                  }
                  var3.c(25804);
                  break L4;
                } else {
                  break L4;
                }
              }
              L6: {
                if (var3.field_v >= 0) {
                  break L6;
                } else {
                  ((hbb) this).field_O[var3.field_o][var3.field_x] = null;
                  break L6;
                }
              }
              var3.b(param0 ^ -3990);
              break L2;
            }
            var3 = (fkb) (Object) ((hbb) this).field_k.field_k.a((byte) 7);
            continue L1;
          }
        }
    }

    final synchronized void a(int param0, byte param1, int param2) {
        this.c(param2, param0, param1 ^ 95);
        if (param1 != 96) {
            ((hbb) this).field_v = null;
        }
    }

    private final void a(int param0, boolean param1) {
        int var4 = 0;
        var4 = VoidHunters.field_G;
        if (param0 < 0) {
          param0 = 0;
          L0: while (true) {
            if (param0 >= 16) {
              return;
            } else {
              this.a(param0, true);
              param0++;
              continue L0;
            }
          }
        } else {
          ((hbb) this).field_x[param0] = 12800;
          ((hbb) this).field_o[param0] = 8192;
          ((hbb) this).field_I[param0] = 16383;
          ((hbb) this).field_t[param0] = 8192;
          ((hbb) this).field_r[param0] = 0;
          ((hbb) this).field_D[param0] = 8192;
          if (param1) {
            this.a(param0, (byte) -123);
            this.b(param0, false);
            ((hbb) this).field_v[param0] = 0;
            ((hbb) this).field_n[param0] = 32767;
            ((hbb) this).field_B[param0] = 256;
            ((hbb) this).field_j[param0] = 0;
            this.d(param0, 8192, 2);
            return;
          } else {
            return;
          }
        }
    }

    private final void a(int param0, int param1, boolean param2, int param3) {
    }

    private final int a(int param0, fkb param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        cja var4 = null;
        int var5 = 0;
        int var6 = 0;
        double var7 = 0.0;
        int stackIn_12_0 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_11_0 = 0;
        int stackOut_10_0 = 0;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        try {
          L0: {
            L1: {
              var3_int = param1.field_d + (param1.field_h * param1.field_l >> 12);
              var3_int = var3_int + (((hbb) this).field_B[param1.field_o] * (-8192 + ((hbb) this).field_t[param1.field_o]) >> 12);
              if (param0 >= 7) {
                break L1;
              } else {
                ((hbb) this).field_r = null;
                break L1;
              }
            }
            L2: {
              var4 = param1.field_g;
              if (var4.field_f <= 0) {
                break L2;
              } else {
                L3: {
                  if (var4.field_i > 0) {
                    break L3;
                  } else {
                    if (0 >= ((hbb) this).field_r[param1.field_o]) {
                      break L2;
                    } else {
                      break L3;
                    }
                  }
                }
                L4: {
                  var5 = var4.field_i << 2;
                  var6 = var4.field_e << 1;
                  if (param1.field_q >= var6) {
                    break L4;
                  } else {
                    var5 = param1.field_q * var5 / var6;
                    break L4;
                  }
                }
                var5 = var5 + (((hbb) this).field_r[param1.field_o] >> 7);
                var7 = Math.sin(0.01227184630308513 * (double)(param1.field_e & 511));
                var3_int = var3_int + (int)((double)var5 * var7);
                break L2;
              }
            }
            L5: {
              var5 = (int)(0.5 + (double)(param1.field_y.field_f * 256) * Math.pow(2.0, 0.0003255208333333333 * (double)var3_int) / (double)vka.field_s);
              if (var5 >= 1) {
                stackOut_11_0 = var5;
                stackIn_12_0 = stackOut_11_0;
                break L5;
              } else {
                stackOut_10_0 = 1;
                stackIn_12_0 = stackOut_10_0;
                break L5;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var3 = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) var3;
            stackOut_13_1 = new StringBuilder().append("hbb.BB(").append(param0).append(44);
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param1 == null) {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L6;
            } else {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L6;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_16_0, stackIn_16_2 + 41);
        }
        return stackIn_12_0;
    }

    final synchronized void a(boolean param0, kka param1, int param2) {
        if (param2 != -1) {
            return;
        }
        try {
            ((hbb) this).a(param1, true, -11886, param0);
        } catch (RuntimeException runtimeException) {
            throw rta.a((Throwable) (Object) runtimeException, "hbb.T(" + param0 + 44 + (param1 != null ? "{...}" : "null") + 44 + param2 + 41);
        }
    }

    private final int b(int param0, fkb param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_1_0 = 0;
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
            var3_int = ((hbb) this).field_o[param1.field_o];
            if (var3_int >= 8192) {
              stackOut_3_0 = -((16384 + -var3_int) * (-param1.field_u + 128) - -32 >> 6) + 16384;
              stackIn_4_0 = stackOut_3_0;
              break L0;
            } else {
              stackOut_1_0 = 32 + param1.field_u * var3_int >> 6;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var3;
            stackOut_5_1 = new StringBuilder().append("hbb.W(").append(9259).append(44);
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param1 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L1;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L1;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + 41);
        }
        return stackIn_4_0;
    }

    private final void a(int param0, int param1, int param2) {
        int var4 = 0;
        int var5 = VoidHunters.field_G;
        if (((hbb) this).field_A[param0] != param2) {
            ((hbb) this).field_A[param0] = param2;
            for (var4 = 0; var4 < 128; var4++) {
                ((hbb) this).field_H[param0][var4] = null;
            }
        }
        if (param1 >= -16) {
            Object var6 = null;
            int discarded$0 = this.a(-85, (fkb) null);
        }
    }

    private final void b(int param0, int param1, int param2) {
        if (param2 != 6889) {
            this.a(-21, 97);
        }
        ((hbb) this).field_t[param0] = param1;
    }

    private final void a(int param0, int param1, byte param2) {
    }

    final synchronized void a(byte param0, int param1) {
        if (param0 != 30) {
            Object var4 = null;
            ((hbb) this).a((fkb) null, true, false);
        }
        ((hbb) this).field_p = param1;
    }

    final synchronized int d() {
        return 0;
    }

    final synchronized f a() {
        return null;
    }

    final synchronized void b(boolean param0) {
        int var3 = VoidHunters.field_G;
        sd var2 = (sd) (Object) ((hbb) this).field_E.c((byte) -123);
        if (param0) {
            Object var4 = null;
            ((hbb) this).a((kka) null, true, -105, false);
        }
        while (var2 != null) {
            var2.a(0);
            var2 = (sd) (Object) ((hbb) this).field_E.b(-85);
        }
    }

    synchronized void a(kka param0, boolean param1, int param2, boolean param3) {
        int var5_int = 0;
        int var6 = 0;
        int var7 = VoidHunters.field_G;
        try {
            this.b(param1, true);
            ((hbb) this).field_u.a(param0.field_e);
            ((hbb) this).field_h = 0L;
            if (param2 != -11886) {
                Object var8 = null;
                int discarded$0 = this.a(113, (fkb) null);
            }
            ((hbb) this).field_L = param3 ? true : false;
            var5_int = ((hbb) this).field_u.e();
            for (var6 = 0; var6 < var5_int; var6++) {
                ((hbb) this).field_u.c(var6);
                ((hbb) this).field_u.e(var6);
                ((hbb) this).field_u.f(var6);
            }
            ((hbb) this).field_m = ((hbb) this).field_u.d();
            ((hbb) this).field_F = ((hbb) this).field_u.field_b[((hbb) this).field_m];
            ((hbb) this).field_i = ((hbb) this).field_u.a(((hbb) this).field_F);
        } catch (RuntimeException runtimeException) {
            throw rta.a((Throwable) (Object) runtimeException, "hbb.A(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 44 + param2 + 44 + param3 + 41);
        }
    }

    final synchronized boolean a(bmb param0, int param1, asb param2, int param3, kka param4) {
        RuntimeException var6 = null;
        int var6_int = 0;
        Object var7 = null;
        ghb var8 = null;
        int var9 = 0;
        sd var10 = null;
        int var11 = 0;
        int stackIn_3_0 = 0;
        int stackIn_20_0 = 0;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_27_2 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_30_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_19_0 = 0;
        int stackOut_2_0 = 0;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        String stackOut_26_2 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        String stackOut_25_2 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        String stackOut_29_2 = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        String stackOut_28_2 = null;
        var11 = VoidHunters.field_G;
        try {
          L0: {
            param4.a();
            var6_int = 1;
            var7 = null;
            if (param1 == -29476) {
              L1: {
                if (param3 <= 0) {
                  break L1;
                } else {
                  var7 = (Object) (Object) new int[]{param3};
                  break L1;
                }
              }
              var8 = (ghb) (Object) param4.field_d.c((byte) 126);
              L2: while (true) {
                if (var8 == null) {
                  L3: {
                    if (var6_int != 0) {
                      param4.b();
                      break L3;
                    } else {
                      break L3;
                    }
                  }
                  stackOut_19_0 = var6_int;
                  stackIn_20_0 = stackOut_19_0;
                  break L0;
                } else {
                  L4: {
                    L5: {
                      var9 = (int)var8.field_b;
                      var10 = (sd) (Object) ((hbb) this).field_E.a((long)var9, param1 ^ -29517);
                      if (var10 != null) {
                        break L5;
                      } else {
                        var10 = waa.a(param2, (byte) 115, var9);
                        if (var10 == null) {
                          var6_int = 0;
                          break L4;
                        } else {
                          ((hbb) this).field_E.a((long)var9, (ksa) (Object) var10, (byte) -122);
                          break L5;
                        }
                      }
                    }
                    if (var10.a(1069, param0, (int[]) var7, var8.field_d)) {
                      break L4;
                    } else {
                      var6_int = 0;
                      break L4;
                    }
                  }
                  var8 = (ghb) (Object) param4.field_d.b(param1 ^ 29545);
                  continue L2;
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
          L6: {
            var6 = decompiledCaughtException;
            stackOut_21_0 = (RuntimeException) var6;
            stackOut_21_1 = new StringBuilder().append("hbb.Q(");
            stackIn_23_0 = stackOut_21_0;
            stackIn_23_1 = stackOut_21_1;
            stackIn_22_0 = stackOut_21_0;
            stackIn_22_1 = stackOut_21_1;
            if (param0 == null) {
              stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
              stackOut_23_1 = (StringBuilder) (Object) stackIn_23_1;
              stackOut_23_2 = "null";
              stackIn_24_0 = stackOut_23_0;
              stackIn_24_1 = stackOut_23_1;
              stackIn_24_2 = stackOut_23_2;
              break L6;
            } else {
              stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
              stackOut_22_1 = (StringBuilder) (Object) stackIn_22_1;
              stackOut_22_2 = "{...}";
              stackIn_24_0 = stackOut_22_0;
              stackIn_24_1 = stackOut_22_1;
              stackIn_24_2 = stackOut_22_2;
              break L6;
            }
          }
          L7: {
            stackOut_24_0 = (RuntimeException) (Object) stackIn_24_0;
            stackOut_24_1 = ((StringBuilder) (Object) stackIn_24_1).append(stackIn_24_2).append(44).append(param1).append(44);
            stackIn_26_0 = stackOut_24_0;
            stackIn_26_1 = stackOut_24_1;
            stackIn_25_0 = stackOut_24_0;
            stackIn_25_1 = stackOut_24_1;
            if (param2 == null) {
              stackOut_26_0 = (RuntimeException) (Object) stackIn_26_0;
              stackOut_26_1 = (StringBuilder) (Object) stackIn_26_1;
              stackOut_26_2 = "null";
              stackIn_27_0 = stackOut_26_0;
              stackIn_27_1 = stackOut_26_1;
              stackIn_27_2 = stackOut_26_2;
              break L7;
            } else {
              stackOut_25_0 = (RuntimeException) (Object) stackIn_25_0;
              stackOut_25_1 = (StringBuilder) (Object) stackIn_25_1;
              stackOut_25_2 = "{...}";
              stackIn_27_0 = stackOut_25_0;
              stackIn_27_1 = stackOut_25_1;
              stackIn_27_2 = stackOut_25_2;
              break L7;
            }
          }
          L8: {
            stackOut_27_0 = (RuntimeException) (Object) stackIn_27_0;
            stackOut_27_1 = ((StringBuilder) (Object) stackIn_27_1).append(stackIn_27_2).append(44).append(param3).append(44);
            stackIn_29_0 = stackOut_27_0;
            stackIn_29_1 = stackOut_27_1;
            stackIn_28_0 = stackOut_27_0;
            stackIn_28_1 = stackOut_27_1;
            if (param4 == null) {
              stackOut_29_0 = (RuntimeException) (Object) stackIn_29_0;
              stackOut_29_1 = (StringBuilder) (Object) stackIn_29_1;
              stackOut_29_2 = "null";
              stackIn_30_0 = stackOut_29_0;
              stackIn_30_1 = stackOut_29_1;
              stackIn_30_2 = stackOut_29_2;
              break L8;
            } else {
              stackOut_28_0 = (RuntimeException) (Object) stackIn_28_0;
              stackOut_28_1 = (StringBuilder) (Object) stackIn_28_1;
              stackOut_28_2 = "{...}";
              stackIn_30_0 = stackOut_28_0;
              stackIn_30_1 = stackOut_28_1;
              stackIn_30_2 = stackOut_28_2;
              break L8;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_30_0, stackIn_30_2 + 41);
        }
        return stackIn_20_0 != 0;
    }

    private final void a(boolean param0, boolean param1) {
        int var3 = 0;
        int var4 = VoidHunters.field_G;
        if (param1) {
            this.a(144, -1);
        } else {
            this.c(0, -1);
        }
        this.a(-1, param0);
        for (var3 = 0; var3 < 16; var3++) {
            ((hbb) this).field_A[var3] = ((hbb) this).field_G[var3];
        }
        int var5 = 0;
        var3 = var5;
        while (var5 < 16) {
            ((hbb) this).field_M[var5] = dla.a(((hbb) this).field_G[var5], -128);
            var5++;
        }
    }

    final synchronized boolean c(int param0) {
        if (param0 >= -67) {
            field_N = null;
        }
        return ((hbb) this).field_u.g();
    }

    final boolean a(int param0, int[] param1, int param2, fkb param3, byte param4) {
        RuntimeException var6 = null;
        int var6_int = 0;
        cja var7 = null;
        int var8 = 0;
        double var9 = 0.0;
        int var11 = 0;
        int stackIn_10_0 = 0;
        int stackIn_62_0 = 0;
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
        RuntimeException decompiledCaughtException = null;
        int stackOut_9_0 = 0;
        int stackOut_61_0 = 0;
        int stackOut_65_0 = 0;
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
        var11 = VoidHunters.field_G;
        try {
          L0: {
            L1: {
              param3.field_k = vka.field_s / 100;
              if (param3.field_v < 0) {
                break L1;
              } else {
                L2: {
                  if (param3.field_j == null) {
                    break L2;
                  } else {
                    if (!param3.field_j.i()) {
                      break L1;
                    } else {
                      break L2;
                    }
                  }
                }
                L3: {
                  param3.c(25804);
                  param3.b(-3846);
                  if (0 >= param3.field_s) {
                    break L3;
                  } else {
                    if (param3 == ((hbb) this).field_H[param3.field_o][param3.field_s]) {
                      ((hbb) this).field_H[param3.field_o][param3.field_s] = null;
                      break L3;
                    } else {
                      return true;
                    }
                  }
                }
                stackOut_9_0 = 1;
                stackIn_10_0 = stackOut_9_0;
                return stackIn_10_0 != 0;
              }
            }
            L4: {
              var6_int = param3.field_l;
              if (var6_int > 0) {
                L5: {
                  var6_int = var6_int - (int)(16.0 * Math.pow(2.0, 0.0004921259842519685 * (double)((hbb) this).field_D[param3.field_o]) + 0.5);
                  if (0 <= var6_int) {
                    break L5;
                  } else {
                    var6_int = 0;
                    break L5;
                  }
                }
                param3.field_l = var6_int;
                break L4;
              } else {
                break L4;
              }
            }
            L6: {
              param3.field_j.g(this.a(93, param3));
              var7 = param3.field_g;
              param3.field_q = param3.field_q + 1;
              param3.field_e = param3.field_e + var7.field_f;
              var8 = 0;
              var9 = (double)((param3.field_x - 60 << 8) - -(param3.field_l * param3.field_h >> 12)) * 0.000005086263020833333;
              if (0 >= var7.field_b) {
                break L6;
              } else {
                L7: {
                  if (0 >= var7.field_c) {
                    param3.field_i = param3.field_i + 128;
                    break L7;
                  } else {
                    param3.field_i = param3.field_i + (int)(0.5 + Math.pow(2.0, var9 * (double)var7.field_c) * 128.0);
                    break L7;
                  }
                }
                if (var7.field_b * param3.field_i >= 819200) {
                  var8 = 1;
                  break L6;
                } else {
                  break L6;
                }
              }
            }
            L8: {
              if (var7.field_h != null) {
                L9: {
                  if (var7.field_d <= 0) {
                    param3.field_r = param3.field_r + 128;
                    break L9;
                  } else {
                    param3.field_r = param3.field_r + (int)(128.0 * Math.pow(2.0, (double)var7.field_d * var9) + 0.5);
                    break L9;
                  }
                }
                L10: while (true) {
                  L11: {
                    if (~param3.field_f <= ~(var7.field_h.length + -2)) {
                      break L11;
                    } else {
                      if (~(var7.field_h[param3.field_f + 2] << 8 & 65280) <= ~param3.field_r) {
                        break L11;
                      } else {
                        param3.field_f = param3.field_f + 2;
                        continue L10;
                      }
                    }
                  }
                  if (~param3.field_f != ~(-2 + var7.field_h.length)) {
                    break L8;
                  } else {
                    if (var7.field_h[1 + param3.field_f] == 0) {
                      var8 = 1;
                      break L8;
                    } else {
                      break L8;
                    }
                  }
                }
              } else {
                break L8;
              }
            }
            L12: {
              if (0 > param3.field_v) {
                break L12;
              } else {
                if (null == var7.field_a) {
                  break L12;
                } else {
                  if (0 != (1 & ((hbb) this).field_v[param3.field_o])) {
                    break L12;
                  } else {
                    L13: {
                      if (param3.field_s < 0) {
                        break L13;
                      } else {
                        if (param3 != ((hbb) this).field_H[param3.field_o][param3.field_s]) {
                          break L13;
                        } else {
                          break L12;
                        }
                      }
                    }
                    L14: {
                      if (var7.field_g > 0) {
                        param3.field_v = param3.field_v + (int)(Math.pow(2.0, (double)var7.field_g * var9) * 128.0 + 0.5);
                        break L14;
                      } else {
                        param3.field_v = param3.field_v + 128;
                        break L14;
                      }
                    }
                    L15: while (true) {
                      L16: {
                        if (param3.field_w >= var7.field_a.length + -2) {
                          break L16;
                        } else {
                          if (~param3.field_v >= ~((255 & var7.field_a[2 + param3.field_w]) << 8)) {
                            break L16;
                          } else {
                            param3.field_w = param3.field_w + 2;
                            continue L15;
                          }
                        }
                      }
                      if (param3.field_w != var7.field_a.length + -2) {
                        break L12;
                      } else {
                        var8 = 1;
                        break L12;
                      }
                    }
                  }
                }
              }
            }
            if (var8 != 0) {
              L17: {
                param3.field_j.f(param3.field_k);
                if (param1 == null) {
                  param3.field_j.a(param2);
                  break L17;
                } else {
                  param3.field_j.a(param1, param0, param2);
                  break L17;
                }
              }
              L18: {
                if (!param3.field_j.g()) {
                  break L18;
                } else {
                  ((hbb) this).field_k.field_j.b((f) (Object) param3.field_j);
                  break L18;
                }
              }
              L19: {
                param3.c(25804);
                if (param3.field_v < 0) {
                  break L19;
                } else {
                  param3.b(-3846);
                  if (param3.field_s <= 0) {
                    break L19;
                  } else {
                    if (((hbb) this).field_H[param3.field_o][param3.field_s] == param3) {
                      ((hbb) this).field_H[param3.field_o][param3.field_s] = null;
                      break L19;
                    } else {
                      break L19;
                    }
                  }
                }
              }
              stackOut_61_0 = 1;
              stackIn_62_0 = stackOut_61_0;
              return stackIn_62_0 != 0;
            } else {
              L20: {
                if (param4 < -3) {
                  break L20;
                } else {
                  ((hbb) this).field_u = null;
                  break L20;
                }
              }
              int discarded$1 = 0;
              param3.field_j.a(param3.field_k, this.b(param3), this.b(9259, param3));
              stackOut_65_0 = 0;
              stackIn_66_0 = stackOut_65_0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L21: {
            var6 = decompiledCaughtException;
            stackOut_67_0 = (RuntimeException) var6;
            stackOut_67_1 = new StringBuilder().append("hbb.LA(").append(param0).append(44);
            stackIn_69_0 = stackOut_67_0;
            stackIn_69_1 = stackOut_67_1;
            stackIn_68_0 = stackOut_67_0;
            stackIn_68_1 = stackOut_67_1;
            if (param1 == null) {
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
          L22: {
            stackOut_70_0 = (RuntimeException) (Object) stackIn_70_0;
            stackOut_70_1 = ((StringBuilder) (Object) stackIn_70_1).append(stackIn_70_2).append(44).append(param2).append(44);
            stackIn_72_0 = stackOut_70_0;
            stackIn_72_1 = stackOut_70_1;
            stackIn_71_0 = stackOut_70_0;
            stackIn_71_1 = stackOut_70_1;
            if (param3 == null) {
              stackOut_72_0 = (RuntimeException) (Object) stackIn_72_0;
              stackOut_72_1 = (StringBuilder) (Object) stackIn_72_1;
              stackOut_72_2 = "null";
              stackIn_73_0 = stackOut_72_0;
              stackIn_73_1 = stackOut_72_1;
              stackIn_73_2 = stackOut_72_2;
              break L22;
            } else {
              stackOut_71_0 = (RuntimeException) (Object) stackIn_71_0;
              stackOut_71_1 = (StringBuilder) (Object) stackIn_71_1;
              stackOut_71_2 = "{...}";
              stackIn_73_0 = stackOut_71_0;
              stackIn_73_1 = stackOut_71_1;
              stackIn_73_2 = stackOut_71_2;
              break L22;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_73_0, stackIn_73_2 + 44 + param4 + 41);
        }
        return stackIn_66_0 != 0;
    }

    private final synchronized void b(boolean param0, boolean param1) {
        ((hbb) this).field_u.a();
        ((hbb) this).field_C = null;
        this.a(param1, param0);
        if (!param1) {
            ((hbb) this).field_I = null;
        }
    }

    public static void c(boolean param0) {
        field_N = null;
        if (!param0) {
            hbb.c(false);
        }
    }

    synchronized void b(int param0, byte param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        L0: {
          var5 = VoidHunters.field_G;
          if (param2 >= 0) {
            ((hbb) this).field_y[param2] = param0;
            break L0;
          } else {
            var4 = 0;
            L1: while (true) {
              if (var4 >= 16) {
                break L0;
              } else {
                ((hbb) this).field_y[var4] = param0;
                var4++;
                continue L1;
              }
            }
          }
        }
        L2: {
          if (param1 == 18) {
            break L2;
          } else {
            field_z = 71;
            break L2;
          }
        }
    }

    final synchronized void a(int param0) {
        int var2 = 0;
        long var3 = 0L;
        int var5 = 0;
        int var6 = 0;
        L0: {
          var6 = VoidHunters.field_G;
          if (((hbb) this).field_u.g()) {
            var2 = ((hbb) this).field_u.field_c * ((hbb) this).field_p / vka.field_s;
            L1: while (true) {
              L2: {
                var3 = (long)param0 * (long)var2 + ((hbb) this).field_h;
                if (0L <= ((hbb) this).field_i + -var3) {
                  ((hbb) this).field_h = var3;
                  break L2;
                } else {
                  var5 = (int)((-1L + (long)var2 + (((hbb) this).field_i - ((hbb) this).field_h)) / (long)var2);
                  ((hbb) this).field_h = ((hbb) this).field_h + (long)var2 * (long)var5;
                  param0 = param0 - var5;
                  ((hbb) this).field_k.a(var5);
                  this.d(-1);
                  if (!((hbb) this).field_u.g()) {
                    break L2;
                  } else {
                    continue L1;
                  }
                }
              }
              ((hbb) this).field_k.a(param0);
              break L0;
            }
          } else {
            ((hbb) this).field_k.a(param0);
            break L0;
          }
        }
    }

    final synchronized f c() {
        return (f) (Object) ((hbb) this).field_k;
    }

    private final int b(fkb param0) {
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        cja var9 = null;
        cja var10 = null;
        int stackIn_3_0 = 0;
        int stackIn_17_0 = 0;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_2_0 = 0;
        int stackOut_16_0 = 0;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        try {
          L0: {
            if (((hbb) this).field_y[param0.field_o] == 0) {
              stackOut_2_0 = 0;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0;
            } else {
              L1: {
                var9 = param0.field_g;
                var10 = var9;
                var4 = ((hbb) this).field_x[param0.field_o] * ((hbb) this).field_I[param0.field_o] + 4096 >> 13;
                var4 = 16384 + var4 * var4 >> 15;
                var4 = 16384 + var4 * param0.field_t >> 15;
                var4 = ((hbb) this).field_q * var4 - -128 >> 8;
                var4 = var4 * ((hbb) this).field_y[param0.field_o] + 128 >> 8;
                if (0 >= var10.field_b) {
                  break L1;
                } else {
                  var4 = (int)((double)var4 * Math.pow(0.5, (double)param0.field_i * 0.00001953125 * (double)var10.field_b) + 0.5);
                  break L1;
                }
              }
              L2: {
                if (null == var10.field_h) {
                  break L2;
                } else {
                  L3: {
                    var5 = param0.field_r;
                    var6 = var10.field_h[1 + param0.field_f];
                    if (var10.field_h.length + -2 <= param0.field_f) {
                      break L3;
                    } else {
                      var7 = (var9.field_h[param0.field_f] & 255) << 8;
                      var8 = (255 & var10.field_h[2 + param0.field_f]) << 8;
                      var6 = var6 + (-var6 + var10.field_h[param0.field_f + 3]) * (var5 - var7) / (var8 + -var7);
                      break L3;
                    }
                  }
                  var4 = var4 * var6 + 32 >> 6;
                  break L2;
                }
              }
              L4: {
                if (0 >= param0.field_v) {
                  break L4;
                } else {
                  if (var10.field_a == null) {
                    break L4;
                  } else {
                    L5: {
                      var5 = param0.field_v;
                      var6 = var10.field_a[1 + param0.field_w];
                      if (param0.field_w < var10.field_a.length - 2) {
                        var7 = var9.field_a[param0.field_w] << 8 & 65280;
                        var8 = (255 & var10.field_a[2 + param0.field_w]) << 8;
                        var6 = var6 + (var5 + -var7) * (var10.field_a[3 + param0.field_w] + -var6) / (-var7 + var8);
                        break L5;
                      } else {
                        break L5;
                      }
                    }
                    var4 = var6 * var4 + 32 >> 6;
                    break L4;
                  }
                }
              }
              stackOut_16_0 = var4;
              stackIn_17_0 = stackOut_16_0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var3 = decompiledCaughtException;
            stackOut_18_0 = (RuntimeException) var3;
            stackOut_18_1 = new StringBuilder().append("hbb.U(");
            stackIn_20_0 = stackOut_18_0;
            stackIn_20_1 = stackOut_18_1;
            stackIn_19_0 = stackOut_18_0;
            stackIn_19_1 = stackOut_18_1;
            if (param0 == null) {
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
          throw rta.a((Throwable) (Object) stackIn_21_0, stackIn_21_2 + 44 + 0 + 41);
        }
        return stackIn_17_0;
    }

    final int e(int param0) {
        if (param0 != 127) {
            this.a(31, (byte) -113);
        }
        return ((hbb) this).field_q;
    }

    final synchronized void a(boolean param0) {
        this.b(true, param0);
    }

    synchronized void a(int[] param0, int param1, int param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        long var5 = 0L;
        int var7 = 0;
        int var8 = 0;
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
        var8 = VoidHunters.field_G;
        try {
          L0: {
            L1: {
              if (!((hbb) this).field_u.g()) {
                break L1;
              } else {
                var4_int = ((hbb) this).field_p * ((hbb) this).field_u.field_c / vka.field_s;
                L2: while (true) {
                  var5 = ((hbb) this).field_h - -((long)param2 * (long)var4_int);
                  if (-var5 + ((hbb) this).field_i < 0L) {
                    var7 = (int)((-1L + ((hbb) this).field_i + -((hbb) this).field_h + (long)var4_int) / (long)var4_int);
                    ((hbb) this).field_h = ((hbb) this).field_h + (long)var7 * (long)var4_int;
                    ((hbb) this).field_k.a(param0, param1, var7);
                    param2 = param2 - var7;
                    param1 = param1 + var7;
                    this.d(-1);
                    if (!((hbb) this).field_u.g()) {
                      break L1;
                    } else {
                      continue L2;
                    }
                  } else {
                    ((hbb) this).field_h = var5;
                    break L1;
                  }
                }
              }
            }
            ((hbb) this).field_k.a(param0, param1, param2);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var4 = decompiledCaughtException;
            stackOut_9_0 = (RuntimeException) var4;
            stackOut_9_1 = new StringBuilder().append("hbb.E(");
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param0 == null) {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L3;
            } else {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L3;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_12_0, stackIn_12_2 + 44 + param1 + 44 + param2 + 41);
        }
    }

    final boolean a(fkb param0, int param1) {
        RuntimeException var3 = null;
        int stackIn_6_0 = 0;
        int stackIn_10_0 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_9_0 = 0;
        int stackOut_5_0 = 0;
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
            if (param0.field_j != null) {
              L1: {
                if (param1 == 0) {
                  break L1;
                } else {
                  ((hbb) this).field_v = null;
                  break L1;
                }
              }
              stackOut_9_0 = 0;
              stackIn_10_0 = stackOut_9_0;
              break L0;
            } else {
              L2: {
                if (param0.field_v < 0) {
                  break L2;
                } else {
                  param0.b(-3846);
                  if (param0.field_s <= 0) {
                    break L2;
                  } else {
                    if (param0 != ((hbb) this).field_H[param0.field_o][param0.field_s]) {
                      break L2;
                    } else {
                      ((hbb) this).field_H[param0.field_o][param0.field_s] = null;
                      return true;
                    }
                  }
                }
              }
              stackOut_5_0 = 1;
              stackIn_6_0 = stackOut_5_0;
              return stackIn_6_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) var3;
            stackOut_11_1 = new StringBuilder().append("hbb.AB(");
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param0 == null) {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L3;
            } else {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L3;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + 44 + param1 + 41);
        }
        return stackIn_10_0 != 0;
    }

    private final void d(int param0, int param1, int param2) {
        ((hbb) this).field_K[param0] = param1;
        ((hbb) this).field_l[param0] = (int)(0.5 + Math.pow((double)param2, (double)param1 * 0.00054931640625) * 2097152.0);
    }

    private final void b(int param0, boolean param1) {
        fkb var3 = null;
        int var4 = VoidHunters.field_G;
        if ((4 & ((hbb) this).field_v[param0]) != 0) {
            var3 = (fkb) (Object) ((hbb) this).field_k.field_k.d(0);
            while (var3 != null) {
                if (!(param0 != var3.field_o)) {
                    var3.field_p = 0;
                }
                var3 = (fkb) (Object) ((hbb) this).field_k.field_k.a((byte) 117);
            }
        }
    }

    private final void b(int param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        var8 = VoidHunters.field_G;
        var3 = param0 & 240;
        if (128 != var3) {
          L0: {
            if (144 != var3) {
              if (var3 != 160) {
                if (var3 == 176) {
                  L1: {
                    var4 = param0 & 15;
                    var5 = (param0 & 32715) >> 8;
                    var6 = (param0 & 8340936) >> 16;
                    if (0 != var5) {
                      break L1;
                    } else {
                      ((hbb) this).field_M[var4] = (var6 << 14) + dla.a(((hbb) this).field_M[var4], -2080769);
                      break L1;
                    }
                  }
                  L2: {
                    if (var5 == 32) {
                      ((hbb) this).field_M[var4] = dla.a(-16257, ((hbb) this).field_M[var4]) + (var6 << 7);
                      break L2;
                    } else {
                      break L2;
                    }
                  }
                  L3: {
                    if (1 != var5) {
                      break L3;
                    } else {
                      ((hbb) this).field_r[var4] = dla.a(-16257, ((hbb) this).field_r[var4]) + (var6 << 7);
                      break L3;
                    }
                  }
                  L4: {
                    if (var5 != 33) {
                      break L4;
                    } else {
                      ((hbb) this).field_r[var4] = dla.a(-128, ((hbb) this).field_r[var4]) + var6;
                      break L4;
                    }
                  }
                  L5: {
                    if (var5 == 5) {
                      ((hbb) this).field_D[var4] = dla.a(((hbb) this).field_D[var4], -16257) - -(var6 << 7);
                      break L5;
                    } else {
                      break L5;
                    }
                  }
                  L6: {
                    if (var5 == 37) {
                      ((hbb) this).field_D[var4] = dla.a(((hbb) this).field_D[var4], -128) + var6;
                      break L6;
                    } else {
                      break L6;
                    }
                  }
                  L7: {
                    if (var5 == 7) {
                      ((hbb) this).field_x[var4] = (var6 << 7) + dla.a(((hbb) this).field_x[var4], -16257);
                      break L7;
                    } else {
                      break L7;
                    }
                  }
                  L8: {
                    if (var5 != 39) {
                      break L8;
                    } else {
                      ((hbb) this).field_x[var4] = dla.a(-128, ((hbb) this).field_x[var4]) + var6;
                      break L8;
                    }
                  }
                  L9: {
                    if (var5 == 10) {
                      ((hbb) this).field_o[var4] = (var6 << 7) + dla.a(((hbb) this).field_o[var4], -16257);
                      break L9;
                    } else {
                      break L9;
                    }
                  }
                  L10: {
                    if (var5 == 42) {
                      ((hbb) this).field_o[var4] = dla.a(((hbb) this).field_o[var4], -128) + var6;
                      break L10;
                    } else {
                      break L10;
                    }
                  }
                  L11: {
                    if (var5 != 11) {
                      break L11;
                    } else {
                      ((hbb) this).field_I[var4] = dla.a(-16257, ((hbb) this).field_I[var4]) + (var6 << 7);
                      break L11;
                    }
                  }
                  L12: {
                    if (var5 == 43) {
                      ((hbb) this).field_I[var4] = dla.a(((hbb) this).field_I[var4], -128) - -var6;
                      break L12;
                    } else {
                      break L12;
                    }
                  }
                  L13: {
                    if (var5 == 64) {
                      if (var6 >= 64) {
                        ((hbb) this).field_v[var4] = knb.a(((hbb) this).field_v[var4], 1);
                        break L13;
                      } else {
                        ((hbb) this).field_v[var4] = dla.a(((hbb) this).field_v[var4], -2);
                        break L13;
                      }
                    } else {
                      break L13;
                    }
                  }
                  L14: {
                    if (65 == var5) {
                      if (var6 < 64) {
                        this.a(var4, (byte) -89);
                        ((hbb) this).field_v[var4] = dla.a(((hbb) this).field_v[var4], -3);
                        break L14;
                      } else {
                        ((hbb) this).field_v[var4] = knb.a(((hbb) this).field_v[var4], 2);
                        break L14;
                      }
                    } else {
                      break L14;
                    }
                  }
                  L15: {
                    if (99 != var5) {
                      break L15;
                    } else {
                      ((hbb) this).field_n[var4] = (var6 << 7) + dla.a(127, ((hbb) this).field_n[var4]);
                      break L15;
                    }
                  }
                  L16: {
                    if (var5 != 98) {
                      break L16;
                    } else {
                      ((hbb) this).field_n[var4] = var6 + dla.a(((hbb) this).field_n[var4], 16256);
                      break L16;
                    }
                  }
                  L17: {
                    if (var5 == 101) {
                      ((hbb) this).field_n[var4] = (var6 << 7) + 16384 - -dla.a(((hbb) this).field_n[var4], 127);
                      break L17;
                    } else {
                      break L17;
                    }
                  }
                  L18: {
                    if (100 != var5) {
                      break L18;
                    } else {
                      ((hbb) this).field_n[var4] = var6 + dla.a(((hbb) this).field_n[var4], 16256) + 16384;
                      break L18;
                    }
                  }
                  L19: {
                    if (var5 != 120) {
                      break L19;
                    } else {
                      this.a(144, var4);
                      break L19;
                    }
                  }
                  L20: {
                    if (var5 == 121) {
                      this.a(var4, true);
                      break L20;
                    } else {
                      break L20;
                    }
                  }
                  L21: {
                    if (123 == var5) {
                      this.c(0, var4);
                      break L21;
                    } else {
                      break L21;
                    }
                  }
                  L22: {
                    if (var5 == 6) {
                      var7 = ((hbb) this).field_n[var4];
                      if (var7 != 16384) {
                        break L22;
                      } else {
                        ((hbb) this).field_B[var4] = (var6 << 7) + dla.a(-16257, ((hbb) this).field_B[var4]);
                        break L22;
                      }
                    } else {
                      break L22;
                    }
                  }
                  L23: {
                    if (var5 == 38) {
                      var7 = ((hbb) this).field_n[var4];
                      if (var7 != 16384) {
                        break L23;
                      } else {
                        ((hbb) this).field_B[var4] = var6 + dla.a(-128, ((hbb) this).field_B[var4]);
                        break L23;
                      }
                    } else {
                      break L23;
                    }
                  }
                  L24: {
                    if (var5 != 16) {
                      break L24;
                    } else {
                      ((hbb) this).field_j[var4] = (var6 << 7) + dla.a(-16257, ((hbb) this).field_j[var4]);
                      break L24;
                    }
                  }
                  L25: {
                    if (var5 != 48) {
                      break L25;
                    } else {
                      ((hbb) this).field_j[var4] = dla.a(((hbb) this).field_j[var4], -128) - -var6;
                      break L25;
                    }
                  }
                  L26: {
                    if (var5 != 81) {
                      break L26;
                    } else {
                      if (var6 >= 64) {
                        ((hbb) this).field_v[var4] = knb.a(((hbb) this).field_v[var4], 4);
                        break L26;
                      } else {
                        this.b(var4, false);
                        ((hbb) this).field_v[var4] = dla.a(((hbb) this).field_v[var4], -5);
                        break L26;
                      }
                    }
                  }
                  L27: {
                    if (var5 == 17) {
                      this.d(var4, (var6 << 7) + (((hbb) this).field_K[var4] & -16257), param1 + 19174);
                      break L27;
                    } else {
                      break L27;
                    }
                  }
                  if (49 != var5) {
                    break L0;
                  } else {
                    this.d(var4, (((hbb) this).field_K[var4] & -128) - -var6, param1 ^ -19170);
                    return;
                  }
                } else {
                  if (param1 == -19172) {
                    if (var3 == 192) {
                      var4 = param0 & 15;
                      var5 = param0 >> 8 & 127;
                      this.a(var4, -105, ((hbb) this).field_M[var4] + var5);
                      return;
                    } else {
                      if (208 != var3) {
                        if (var3 != 224) {
                          var3 = 255 & param0;
                          if (var3 == 255) {
                            this.a(true, true);
                            return;
                          } else {
                            return;
                          }
                        } else {
                          var4 = param0 & 15;
                          var5 = (16256 & param0 >> 9) - -(127 & param0 >> 8);
                          this.b(var4, var5, 6889);
                          return;
                        }
                      } else {
                        var4 = 15 & param0;
                        var5 = (32717 & param0) >> 8;
                        this.a(var5, var4, (byte) 72);
                        return;
                      }
                    }
                  } else {
                    return;
                  }
                }
              } else {
                var4 = 15 & param0;
                var5 = param0 >> 8 & 127;
                var6 = (8343323 & param0) >> 16;
                this.a(var6, var5, true, var4);
                return;
              }
            } else {
              var4 = param0 & 15;
              var5 = (param0 & 32621) >> 8;
              var6 = 127 & param0 >> 16;
              if (var6 <= 0) {
                this.a(64, var5, var4, (byte) 84);
                return;
              } else {
                this.b(var6, -21459, var5, var4);
                break L0;
              }
            }
          }
          return;
        } else {
          var4 = 15 & param0;
          var5 = 127 & param0 >> 8;
          var6 = (param0 & 8342805) >> 16;
          this.a(var6, var5, var4, (byte) 127);
          return;
        }
    }

    private final void a(int param0, int param1, int param2, byte param3) {
        fkb var6 = null;
        int var7 = VoidHunters.field_G;
        if (param3 <= 73) {
            ((hbb) this).field_p = -82;
        }
        fkb var8 = ((hbb) this).field_O[param2][param1];
        if (var8 == null) {
            return;
        }
        ((hbb) this).field_O[param2][param1] = null;
        if ((2 & ((hbb) this).field_v[param2]) == 0) {
            var8.field_v = 0;
        } else {
            var6 = (fkb) (Object) ((hbb) this).field_k.field_k.d(0);
            while (var6 != null) {
                if (var8.field_o == var6.field_o) {
                    if (var6.field_v < 0) {
                        if (var8 != var6) {
                            var8.field_v = 0;
                            break;
                        }
                    }
                }
                var6 = (fkb) (Object) ((hbb) this).field_k.field_k.a((byte) 96);
            }
        }
    }

    private final void d(int param0) {
        int var2 = 0;
        int var3 = 0;
        long var4 = 0L;
        int var6 = 0;
        int var7 = 0;
        L0: {
          var7 = VoidHunters.field_G;
          var2 = ((hbb) this).field_m;
          var3 = ((hbb) this).field_F;
          var4 = ((hbb) this).field_i;
          if (null == ((hbb) this).field_C) {
            break L0;
          } else {
            if (((hbb) this).field_w != var3) {
              break L0;
            } else {
              ((hbb) this).a(((hbb) this).field_C, ((hbb) this).field_s, -11886, ((hbb) this).field_L);
              this.d(param0);
              return;
            }
          }
        }
        L1: {
          if (param0 == -1) {
            break L1;
          } else {
            f discarded$1 = ((hbb) this).a();
            break L1;
          }
        }
        L2: while (true) {
          if (var3 != ((hbb) this).field_F) {
            L3: {
              ((hbb) this).field_m = var2;
              ((hbb) this).field_F = var3;
              ((hbb) this).field_i = var4;
              if (null == ((hbb) this).field_C) {
                break L3;
              } else {
                if (var3 > ((hbb) this).field_w) {
                  ((hbb) this).field_F = ((hbb) this).field_w;
                  ((hbb) this).field_m = -1;
                  ((hbb) this).field_i = ((hbb) this).field_u.a(((hbb) this).field_F);
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
                if (((hbb) this).field_u.field_b[var2] != var3) {
                  break L5;
                } else {
                  ((hbb) this).field_u.c(var2);
                  var6 = ((hbb) this).field_u.d(var2);
                  if (1 != var6) {
                    L6: {
                      if ((var6 & 128) == 0) {
                        break L6;
                      } else {
                        this.b(var6, param0 + -19171);
                        break L6;
                      }
                    }
                    ((hbb) this).field_u.e(var2);
                    ((hbb) this).field_u.f(var2);
                    continue L4;
                  } else {
                    ((hbb) this).field_u.c();
                    ((hbb) this).field_u.f(var2);
                    if (((hbb) this).field_u.f()) {
                      if (null != ((hbb) this).field_C) {
                        ((hbb) this).a(((hbb) this).field_L, ((hbb) this).field_C, param0);
                        this.d(-1);
                        return;
                      } else {
                        L7: {
                          if (!((hbb) this).field_L) {
                            break L7;
                          } else {
                            if (var3 == 0) {
                              break L7;
                            } else {
                              ((hbb) this).field_u.a(var4);
                              break L5;
                            }
                          }
                        }
                        this.a(true, true);
                        ((hbb) this).field_u.a();
                        return;
                      }
                    } else {
                      break L5;
                    }
                  }
                }
              }
              var2 = ((hbb) this).field_u.d();
              var3 = ((hbb) this).field_u.field_b[var2];
              var4 = ((hbb) this).field_u.a(var3);
              continue L2;
            }
          }
        }
    }

    final void a(fkb param0, boolean param1, boolean param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
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
              if (param2) {
                break L1;
              } else {
                ((hbb) this).field_O = null;
                break L1;
              }
            }
            L2: {
              L3: {
                var4_int = param0.field_y.field_i.length;
                if (!param1) {
                  break L3;
                } else {
                  if (param0.field_y.field_e) {
                    var6 = -param0.field_y.field_g + (var4_int + var4_int);
                    var4_int = var4_int << 8;
                    var5 = (int)((long)((hbb) this).field_j[param0.field_o] * (long)var6 >> 6);
                    if (var4_int <= var5) {
                      var5 = -var5 + var4_int - -var4_int + -1;
                      param0.field_j.a(true);
                      break L2;
                    } else {
                      break L2;
                    }
                  } else {
                    break L3;
                  }
                }
              }
              var5 = (int)((long)((hbb) this).field_j[param0.field_o] * (long)var4_int >> 6);
              break L2;
            }
            param0.field_j.c(var5);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var4 = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) var4;
            stackOut_11_1 = new StringBuilder().append("hbb.RA(");
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param0 == null) {
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
          throw rta.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + 44 + param1 + 44 + param2 + 41);
        }
    }

    private final void a(int param0, byte param1) {
        fkb var3 = null;
        int var4 = VoidHunters.field_G;
        if (!((((hbb) this).field_v[param0] & 2) == 0)) {
            var3 = (fkb) (Object) ((hbb) this).field_k.field_k.d(0);
            while (var3 != null) {
                if (var3.field_o == param0) {
                    if (null == ((hbb) this).field_O[param0][var3.field_x]) {
                        if (var3.field_v < 0) {
                            var3.field_v = 0;
                        }
                    }
                }
                var3 = (fkb) (Object) ((hbb) this).field_k.field_k.a((byte) 78);
            }
        }
        if (param1 > -60) {
            ((hbb) this).b(121, (byte) 19, -123);
        }
    }

    private final void b(int param0, int param1, int param2, int param3) {
        fkb var5 = null;
        gd var6 = null;
        int var6_int = 0;
        fkb var7 = null;
        fkb var8 = null;
        int var9 = 0;
        sd var10 = null;
        sd var11 = null;
        Object stackIn_16_0 = null;
        fkb stackIn_16_1 = null;
        Object stackIn_17_0 = null;
        fkb stackIn_17_1 = null;
        Object stackIn_18_0 = null;
        fkb stackIn_18_1 = null;
        int stackIn_18_2 = 0;
        Object stackOut_15_0 = null;
        fkb stackOut_15_1 = null;
        Object stackOut_17_0 = null;
        fkb stackOut_17_1 = null;
        int stackOut_17_2 = 0;
        Object stackOut_16_0 = null;
        fkb stackOut_16_1 = null;
        int stackOut_16_2 = 0;
        L0: {
          var9 = VoidHunters.field_G;
          this.a(64, param2, param3, (byte) 110);
          if (0 == (((hbb) this).field_v[param3] & 2)) {
            break L0;
          } else {
            var5 = (fkb) (Object) ((hbb) this).field_k.field_k.b((byte) 122);
            L1: while (true) {
              if (var5 == null) {
                break L0;
              } else {
                L2: {
                  if (~var5.field_o != ~param3) {
                    break L2;
                  } else {
                    if (var5.field_v < 0) {
                      ((hbb) this).field_O[param3][var5.field_x] = null;
                      ((hbb) this).field_O[param3][param2] = var5;
                      var6_int = (var5.field_h * var5.field_l >> 12) + var5.field_d;
                      var5.field_d = var5.field_d + (-var5.field_x + param2 << 8);
                      var5.field_x = param2;
                      var5.field_l = 4096;
                      var5.field_h = var6_int + -var5.field_d;
                      return;
                    } else {
                      break L2;
                    }
                  }
                }
                var5 = (fkb) (Object) ((hbb) this).field_k.field_k.a(-1155566844);
                continue L1;
              }
            }
          }
        }
        var10 = (sd) (Object) ((hbb) this).field_E.a((long)((hbb) this).field_A[param3], 103);
        var11 = var10;
        if (var11 != null) {
          var6 = var10.field_d[param2];
          if (var6 == null) {
            return;
          } else {
            L3: {
              var7 = new fkb();
              var7.field_n = var11;
              var7.field_y = var6;
              var7.field_o = param3;
              var7.field_g = var10.field_h[param2];
              var7.field_s = var10.field_j[param2];
              var7.field_x = param2;
              var7.field_t = var10.field_f[param2] * (var11.field_i * (param0 * param0)) + 1024 >> 11;
              var7.field_u = var10.field_g[param2] & 255;
              var7.field_d = (param2 << 8) - (32767 & var10.field_e[param2]);
              var7.field_v = -1;
              var7.field_i = 0;
              var7.field_f = 0;
              var7.field_w = 0;
              var7.field_r = 0;
              if (((hbb) this).field_j[param3] != 0) {
                L4: {
                  var7.field_j = fga.b(var6, this.a(92, var7), 0, this.b(9259, var7));
                  stackOut_15_0 = this;
                  stackOut_15_1 = (fkb) var7;
                  stackIn_17_0 = stackOut_15_0;
                  stackIn_17_1 = stackOut_15_1;
                  stackIn_16_0 = stackOut_15_0;
                  stackIn_16_1 = stackOut_15_1;
                  if (var11.field_e[param2] >= 0) {
                    stackOut_17_0 = this;
                    stackOut_17_1 = (fkb) (Object) stackIn_17_1;
                    stackOut_17_2 = 0;
                    stackIn_18_0 = stackOut_17_0;
                    stackIn_18_1 = stackOut_17_1;
                    stackIn_18_2 = stackOut_17_2;
                    break L4;
                  } else {
                    stackOut_16_0 = this;
                    stackOut_16_1 = (fkb) (Object) stackIn_16_1;
                    stackOut_16_2 = 1;
                    stackIn_18_0 = stackOut_16_0;
                    stackIn_18_1 = stackOut_16_1;
                    stackIn_18_2 = stackOut_16_2;
                    break L4;
                  }
                }
                ((hbb) this).a(stackIn_18_1, stackIn_18_2 != 0, true);
                break L3;
              } else {
                int discarded$1 = 0;
                var7.field_j = fga.b(var6, this.a(73, var7), this.b(var7), this.b(9259, var7));
                break L3;
              }
            }
            L5: {
              if (var11.field_e[param2] < 0) {
                var7.field_j.d(-1);
                break L5;
              } else {
                break L5;
              }
            }
            L6: {
              if (var7.field_s < 0) {
                break L6;
              } else {
                L7: {
                  var8 = ((hbb) this).field_H[param3][var7.field_s];
                  if (var8 == null) {
                    break L7;
                  } else {
                    if (var8.field_v < 0) {
                      ((hbb) this).field_O[param3][var8.field_x] = null;
                      var8.field_v = 0;
                      break L7;
                    } else {
                      break L7;
                    }
                  }
                }
                ((hbb) this).field_H[param3][var7.field_s] = var7;
                break L6;
              }
            }
            ((hbb) this).field_k.field_k.b(-10258, (ksa) (Object) var7);
            ((hbb) this).field_O[param3][param2] = var7;
            return;
          }
        } else {
          return;
        }
    }

    private final void c(int param0, int param1, int param2) {
        ((hbb) this).field_G[param0] = param1;
        ((hbb) this).field_M[param0] = dla.a(-128, param1);
        this.a(param0, -81, param1);
        if (param2 <= 0) {
            int discarded$0 = ((hbb) this).e(26);
        }
    }

    final synchronized void b(int param0, byte param1) {
        ((hbb) this).field_q = param0;
        if (param1 != 14) {
            ((hbb) this).field_o = null;
        }
    }

    private final void c(int param0, int param1) {
        fkb var3 = null;
        int var4 = 0;
        var4 = VoidHunters.field_G;
        var3 = (fkb) (Object) ((hbb) this).field_k.field_k.d(0);
        L0: while (true) {
          if (var3 == null) {
            return;
          } else {
            L1: {
              L2: {
                if (param1 < 0) {
                  break L2;
                } else {
                  if (var3.field_o != param1) {
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              if (0 <= var3.field_v) {
                break L1;
              } else {
                ((hbb) this).field_O[var3.field_o][var3.field_x] = null;
                var3.field_v = 0;
                break L1;
              }
            }
            var3 = (fkb) (Object) ((hbb) this).field_k.field_k.a((byte) 10);
            continue L0;
          }
        }
    }

    public hbb() {
        ((hbb) this).field_r = new int[16];
        ((hbb) this).field_q = 256;
        ((hbb) this).field_O = new fkb[16][128];
        ((hbb) this).field_K = new int[16];
        ((hbb) this).field_j = new int[16];
        ((hbb) this).field_p = 1000000;
        ((hbb) this).field_M = new int[16];
        ((hbb) this).field_H = new fkb[16][128];
        ((hbb) this).field_t = new int[16];
        ((hbb) this).field_l = new int[16];
        ((hbb) this).field_y = new int[16];
        ((hbb) this).field_o = new int[16];
        ((hbb) this).field_v = new int[16];
        ((hbb) this).field_n = new int[16];
        ((hbb) this).field_A = new int[16];
        ((hbb) this).field_I = new int[16];
        ((hbb) this).field_D = new int[16];
        ((hbb) this).field_B = new int[16];
        ((hbb) this).field_G = new int[16];
        ((hbb) this).field_x = new int[16];
        ((hbb) this).field_u = new q();
        ((hbb) this).field_k = new ht((hbb) this);
        ((hbb) this).field_E = new gnb(128);
        ((hbb) this).b(256, (byte) 18, -1);
        this.a(true, true);
    }

    hbb(hbb param0) {
        ((hbb) this).field_r = new int[16];
        ((hbb) this).field_q = 256;
        ((hbb) this).field_O = new fkb[16][128];
        ((hbb) this).field_K = new int[16];
        ((hbb) this).field_j = new int[16];
        ((hbb) this).field_p = 1000000;
        ((hbb) this).field_M = new int[16];
        ((hbb) this).field_H = new fkb[16][128];
        ((hbb) this).field_t = new int[16];
        ((hbb) this).field_l = new int[16];
        ((hbb) this).field_y = new int[16];
        ((hbb) this).field_o = new int[16];
        ((hbb) this).field_v = new int[16];
        ((hbb) this).field_n = new int[16];
        ((hbb) this).field_A = new int[16];
        ((hbb) this).field_I = new int[16];
        ((hbb) this).field_D = new int[16];
        ((hbb) this).field_B = new int[16];
        ((hbb) this).field_G = new int[16];
        ((hbb) this).field_x = new int[16];
        ((hbb) this).field_u = new q();
        ((hbb) this).field_k = new ht((hbb) this);
        try {
            ((hbb) this).field_E = param0.field_E;
            ((hbb) this).b(256, (byte) 18, -1);
            this.a(true, true);
        } catch (RuntimeException runtimeException) {
            throw rta.a((Throwable) (Object) runtimeException, "hbb.<init>(" + (param0 != null ? "{...}" : "null") + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_N = new byte[520];
        field_z = 0;
    }
}
