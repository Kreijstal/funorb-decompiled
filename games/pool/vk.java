/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vk extends kd {
    private int[] field_Y;
    private int[] field_T;
    static tf field_db;
    private int[] field_G;
    int[] field_L;
    private int[] field_s;
    private int[] field_cb;
    private int[] field_r;
    private int[] field_v;
    private int field_N;
    private int[] field_A;
    private gq field_Z;
    static dd[] field_y;
    private int[] field_B;
    int[] field_U;
    private int[] field_p;
    private int field_w;
    private int[] field_q;
    int[] field_F;
    private pr[][] field_R;
    private int[] field_K;
    private bm field_z;
    private pr[][] field_I;
    private int[] field_J;
    static int field_bb;
    static String field_O;
    private boolean field_M;
    private int field_t;
    private ib field_u;
    private long field_D;
    private long field_ab;
    private int field_X;
    static int field_H;
    static String field_P;
    private boolean field_W;
    static nl field_V;
    private cg field_C;
    static String field_x;
    private int field_S;

    final synchronized int d() {
        return 0;
    }

    final synchronized kd a() {
        return (kd) (Object) ((vk) this).field_u;
    }

    final synchronized boolean a(cf param0, di param1, cg param2, int param3, int param4) {
        RuntimeException var6 = null;
        int var6_int = 0;
        Object var7 = null;
        te var8 = null;
        int var9 = 0;
        g var10 = null;
        int var11 = 0;
        int stackIn_3_0 = 0;
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
        int stackOut_2_0 = 0;
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
        var11 = Pool.field_O;
        try {
          L0: {
            if (param3 > 54) {
              L1: {
                param2.b();
                var6_int = 1;
                var7 = null;
                if (param4 <= 0) {
                  break L1;
                } else {
                  var7 = (Object) (Object) new int[]{param4};
                  break L1;
                }
              }
              var8 = (te) (Object) param2.field_m.a(0);
              L2: while (true) {
                if (var8 == null) {
                  L3: {
                    if (var6_int == 0) {
                      break L3;
                    } else {
                      param2.a();
                      break L3;
                    }
                  }
                  stackOut_18_0 = var6_int;
                  stackIn_19_0 = stackOut_18_0;
                  break L0;
                } else {
                  L4: {
                    L5: {
                      var9 = (int)var8.field_c;
                      var10 = (g) (Object) ((vk) this).field_z.a(false, (long)var9);
                      if (var10 != null) {
                        break L5;
                      } else {
                        var10 = hk.a(param1, (byte) 127, var9);
                        if (var10 == null) {
                          var6_int = 0;
                          break L4;
                        } else {
                          ((vk) this).field_z.a((byte) -120, (ma) (Object) var10, (long)var9);
                          break L5;
                        }
                      }
                    }
                    if (var10.a(23605, var8.field_l, (int[]) var7, param0)) {
                      break L4;
                    } else {
                      var6_int = 0;
                      break L4;
                    }
                  }
                  var8 = (te) (Object) param2.field_m.b(-1);
                  continue L2;
                }
              }
            } else {
              stackOut_2_0 = 1;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var6 = decompiledCaughtException;
            stackOut_20_0 = (RuntimeException) var6;
            stackOut_20_1 = new StringBuilder().append("vk.FA(");
            stackIn_22_0 = stackOut_20_0;
            stackIn_22_1 = stackOut_20_1;
            stackIn_21_0 = stackOut_20_0;
            stackIn_21_1 = stackOut_20_1;
            if (param0 == null) {
              stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
              stackOut_22_1 = (StringBuilder) (Object) stackIn_22_1;
              stackOut_22_2 = "null";
              stackIn_23_0 = stackOut_22_0;
              stackIn_23_1 = stackOut_22_1;
              stackIn_23_2 = stackOut_22_2;
              break L6;
            } else {
              stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "{...}";
              stackIn_23_0 = stackOut_21_0;
              stackIn_23_1 = stackOut_21_1;
              stackIn_23_2 = stackOut_21_2;
              break L6;
            }
          }
          L7: {
            stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
            stackOut_23_1 = ((StringBuilder) (Object) stackIn_23_1).append(stackIn_23_2).append(',');
            stackIn_25_0 = stackOut_23_0;
            stackIn_25_1 = stackOut_23_1;
            stackIn_24_0 = stackOut_23_0;
            stackIn_24_1 = stackOut_23_1;
            if (param1 == null) {
              stackOut_25_0 = (RuntimeException) (Object) stackIn_25_0;
              stackOut_25_1 = (StringBuilder) (Object) stackIn_25_1;
              stackOut_25_2 = "null";
              stackIn_26_0 = stackOut_25_0;
              stackIn_26_1 = stackOut_25_1;
              stackIn_26_2 = stackOut_25_2;
              break L7;
            } else {
              stackOut_24_0 = (RuntimeException) (Object) stackIn_24_0;
              stackOut_24_1 = (StringBuilder) (Object) stackIn_24_1;
              stackOut_24_2 = "{...}";
              stackIn_26_0 = stackOut_24_0;
              stackIn_26_1 = stackOut_24_1;
              stackIn_26_2 = stackOut_24_2;
              break L7;
            }
          }
          L8: {
            stackOut_26_0 = (RuntimeException) (Object) stackIn_26_0;
            stackOut_26_1 = ((StringBuilder) (Object) stackIn_26_1).append(stackIn_26_2).append(',');
            stackIn_28_0 = stackOut_26_0;
            stackIn_28_1 = stackOut_26_1;
            stackIn_27_0 = stackOut_26_0;
            stackIn_27_1 = stackOut_26_1;
            if (param2 == null) {
              stackOut_28_0 = (RuntimeException) (Object) stackIn_28_0;
              stackOut_28_1 = (StringBuilder) (Object) stackIn_28_1;
              stackOut_28_2 = "null";
              stackIn_29_0 = stackOut_28_0;
              stackIn_29_1 = stackOut_28_1;
              stackIn_29_2 = stackOut_28_2;
              break L8;
            } else {
              stackOut_27_0 = (RuntimeException) (Object) stackIn_27_0;
              stackOut_27_1 = (StringBuilder) (Object) stackIn_27_1;
              stackOut_27_2 = "{...}";
              stackIn_29_0 = stackOut_27_0;
              stackIn_29_1 = stackOut_27_1;
              stackIn_29_2 = stackOut_27_2;
              break L8;
            }
          }
          throw wm.a((Throwable) (Object) stackIn_29_0, stackIn_29_2 + ',' + param3 + ',' + param4 + ')');
        }
        return stackIn_19_0 != 0;
    }

    public static void c(int param0) {
        field_V = null;
        field_x = null;
        field_P = null;
        field_O = null;
        field_y = null;
        field_db = null;
    }

    private final int a(boolean param0, pr param1) {
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        kp var9 = null;
        kp var10 = null;
        int stackIn_2_0 = 0;
        int stackIn_18_0 = 0;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_17_0 = 0;
        int stackOut_1_0 = 0;
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
            if (((vk) this).field_T[param1.field_t] != 0) {
              L1: {
                var9 = param1.field_x;
                var10 = var9;
                var4 = ((vk) this).field_G[param1.field_t] * ((vk) this).field_K[param1.field_t] + 4096 >> 13;
                var4 = 16384 + var4 * var4 >> 15;
                var4 = 16384 + var4 * param1.field_E >> 15;
                var4 = ((vk) this).field_w * var4 - -128 >> 8;
                var4 = var4 * ((vk) this).field_T[param1.field_t] + 128 >> 8;
                if (var10.field_e <= 0) {
                  break L1;
                } else {
                  var4 = (int)(Math.pow(0.5, (double)param1.field_p * 0.00001953125 * (double)var10.field_e) * (double)var4 + 0.5);
                  break L1;
                }
              }
              L2: {
                if (var10.field_a != null) {
                  L3: {
                    var5 = param1.field_z;
                    var6 = var10.field_a[param1.field_F - -1];
                    if (var10.field_a.length - 2 > param1.field_F) {
                      var7 = var9.field_a[param1.field_F] << 8 & 65280;
                      var8 = (255 & var10.field_a[param1.field_F - -2]) << 8;
                      var6 = var6 + (-var6 + var10.field_a[3 + param1.field_F]) * (-var7 + var5) / (-var7 + var8);
                      break L3;
                    } else {
                      break L3;
                    }
                  }
                  var4 = var6 * var4 + 32 >> 6;
                  break L2;
                } else {
                  break L2;
                }
              }
              L4: {
                if (param1.field_G <= 0) {
                  break L4;
                } else {
                  if (var10.field_l == null) {
                    break L4;
                  } else {
                    L5: {
                      var5 = param1.field_G;
                      var6 = var10.field_l[param1.field_w + 1];
                      if (param1.field_w < var10.field_l.length + -2) {
                        var7 = (var9.field_l[param1.field_w] & 255) << 8;
                        var8 = var10.field_l[2 + param1.field_w] << 8 & 65280;
                        var6 = var6 + (-var6 + var10.field_l[3 + param1.field_w]) * (-var7 + var5) / (var8 - var7);
                        break L5;
                      } else {
                        break L5;
                      }
                    }
                    var4 = 32 + var4 * var6 >> 6;
                    break L4;
                  }
                }
              }
              stackOut_17_0 = var4;
              stackIn_18_0 = stackOut_17_0;
              break L0;
            } else {
              stackOut_1_0 = 0;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var3 = decompiledCaughtException;
            stackOut_19_0 = (RuntimeException) var3;
            stackOut_19_1 = new StringBuilder().append("vk.CA(").append(true).append(',');
            stackIn_21_0 = stackOut_19_0;
            stackIn_21_1 = stackOut_19_1;
            stackIn_20_0 = stackOut_19_0;
            stackIn_20_1 = stackOut_19_1;
            if (param1 == null) {
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
          throw wm.a((Throwable) (Object) stackIn_22_0, stackIn_22_2 + ')');
        }
        return stackIn_18_0;
    }

    private final void a(byte param0, int param1) {
        if (param1 < 0) {
            for (param1 = 0; param1 < 16; param1++) {
                this.a((byte) -44, param1);
            }
            return;
        }
        ((vk) this).field_G[param1] = 12800;
        ((vk) this).field_B[param1] = 8192;
        ((vk) this).field_K[param1] = 16383;
        ((vk) this).field_Y[param1] = 8192;
        ((vk) this).field_q[param1] = 0;
        ((vk) this).field_s[param1] = 8192;
        this.d(param1, 0);
        this.a(param1, false);
        ((vk) this).field_F[param1] = 0;
        ((vk) this).field_cb[param1] = 32767;
        ((vk) this).field_p[param1] = 256;
        ((vk) this).field_U[param1] = 0;
        this.a(8192, param1, 6779);
    }

    final static String a(String param0, int param1) {
        RuntimeException var3 = null;
        int var3_int = 0;
        String stackIn_3_0 = null;
        String stackIn_7_0 = null;
        String stackIn_11_0 = null;
        String stackIn_15_0 = null;
        String stackIn_18_0 = null;
        String stackIn_22_0 = null;
        String stackIn_25_0 = null;
        String stackIn_29_0 = null;
        String stackIn_33_0 = null;
        String stackIn_36_0 = null;
        String stackIn_40_0 = null;
        RuntimeException stackIn_42_0 = null;
        StringBuilder stackIn_42_1 = null;
        RuntimeException stackIn_43_0 = null;
        StringBuilder stackIn_43_1 = null;
        RuntimeException stackIn_44_0 = null;
        StringBuilder stackIn_44_1 = null;
        String stackIn_44_2 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_2_0 = null;
        String stackOut_6_0 = null;
        String stackOut_10_0 = null;
        String stackOut_14_0 = null;
        String stackOut_21_0 = null;
        String stackOut_28_0 = null;
        String stackOut_32_0 = null;
        String stackOut_39_0 = null;
        String stackOut_35_0 = null;
        String stackOut_24_0 = null;
        String stackOut_17_0 = null;
        RuntimeException stackOut_41_0 = null;
        StringBuilder stackOut_41_1 = null;
        RuntimeException stackOut_43_0 = null;
        StringBuilder stackOut_43_1 = null;
        String stackOut_43_2 = null;
        RuntimeException stackOut_42_0 = null;
        StringBuilder stackOut_42_1 = null;
        String stackOut_42_2 = null;
        try {
          L0: {
            if (param1 == 1) {
              stackOut_2_0 = nr.a(new String[1], -1, th.field_k);
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0;
            } else {
              var3_int = -23;
              if (param1 == 2) {
                stackOut_6_0 = nr.a(new String[1], -1, up.field_I);
                stackIn_7_0 = stackOut_6_0;
                return stackIn_7_0;
              } else {
                if (3 == param1) {
                  stackOut_10_0 = nr.a(new String[1], -1, da.field_a);
                  stackIn_11_0 = stackOut_10_0;
                  return stackIn_11_0;
                } else {
                  if (param1 == 4) {
                    stackOut_14_0 = nr.a(new String[1], -1, s.field_g);
                    stackIn_15_0 = stackOut_14_0;
                    return stackIn_15_0;
                  } else {
                    if (param1 != 5) {
                      if (param1 == 6) {
                        stackOut_21_0 = nr.a(new String[1], -1, hr.field_w);
                        stackIn_22_0 = stackOut_21_0;
                        return stackIn_22_0;
                      } else {
                        if (param1 != 7) {
                          if (param1 == 8) {
                            stackOut_28_0 = nr.a(new String[1], -1, fd.field_M);
                            stackIn_29_0 = stackOut_28_0;
                            return stackIn_29_0;
                          } else {
                            if (param1 == 11) {
                              stackOut_32_0 = nr.a(new String[1], -1, sg.field_I);
                              stackIn_33_0 = stackOut_32_0;
                              return stackIn_33_0;
                            } else {
                              if (param1 != 12) {
                                if (param1 == 13) {
                                  stackOut_39_0 = nr.a(new String[1], -1, np.field_c);
                                  stackIn_40_0 = stackOut_39_0;
                                  break L0;
                                } else {
                                  return null;
                                }
                              } else {
                                stackOut_35_0 = nr.a(new String[1], -1, sd.field_U);
                                stackIn_36_0 = stackOut_35_0;
                                return stackIn_36_0;
                              }
                            }
                          }
                        } else {
                          stackOut_24_0 = nr.a(new String[1], -1, ii.field_f);
                          stackIn_25_0 = stackOut_24_0;
                          return stackIn_25_0;
                        }
                      }
                    } else {
                      stackOut_17_0 = nr.a(new String[1], -1, lh.field_a);
                      stackIn_18_0 = stackOut_17_0;
                      return stackIn_18_0;
                    }
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_41_0 = (RuntimeException) var3;
            stackOut_41_1 = new StringBuilder().append("vk.P(");
            stackIn_43_0 = stackOut_41_0;
            stackIn_43_1 = stackOut_41_1;
            stackIn_42_0 = stackOut_41_0;
            stackIn_42_1 = stackOut_41_1;
            if (param0 == null) {
              stackOut_43_0 = (RuntimeException) (Object) stackIn_43_0;
              stackOut_43_1 = (StringBuilder) (Object) stackIn_43_1;
              stackOut_43_2 = "null";
              stackIn_44_0 = stackOut_43_0;
              stackIn_44_1 = stackOut_43_1;
              stackIn_44_2 = stackOut_43_2;
              break L1;
            } else {
              stackOut_42_0 = (RuntimeException) (Object) stackIn_42_0;
              stackOut_42_1 = (StringBuilder) (Object) stackIn_42_1;
              stackOut_42_2 = "{...}";
              stackIn_44_0 = stackOut_42_0;
              stackIn_44_1 = stackOut_42_1;
              stackIn_44_2 = stackOut_42_2;
              break L1;
            }
          }
          throw wm.a((Throwable) (Object) stackIn_44_0, stackIn_44_2 + ',' + param1 + ',' + -126 + ')');
        }
        return stackIn_40_0;
    }

    final synchronized void a(int[] param0, int param1, int param2) {
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
        var8 = Pool.field_O;
        try {
          L0: {
            L1: {
              L2: {
                if (!((vk) this).field_Z.a()) {
                  break L2;
                } else {
                  var4_int = ((vk) this).field_N * ((vk) this).field_Z.field_f / bp.field_h;
                  L3: while (true) {
                    var5 = ((vk) this).field_ab - -((long)var4_int * (long)param2);
                    if (0L > ((vk) this).field_D + -var5) {
                      var7 = (int)(((long)var4_int + ((vk) this).field_D - ((vk) this).field_ab - 1L) / (long)var4_int);
                      ((vk) this).field_ab = ((vk) this).field_ab + (long)var7 * (long)var4_int;
                      ((vk) this).field_u.a(param0, param1, var7);
                      param2 = param2 - var7;
                      param1 = param1 + var7;
                      this.d((byte) -89);
                      if (((vk) this).field_Z.a()) {
                        continue L3;
                      } else {
                        ((vk) this).field_u.a(param0, param1, param2);
                        break L1;
                      }
                    } else {
                      ((vk) this).field_ab = var5;
                      break L2;
                    }
                  }
                }
              }
              ((vk) this).field_u.a(param0, param1, param2);
              break L1;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var4 = decompiledCaughtException;
            stackOut_9_0 = (RuntimeException) var4;
            stackOut_9_1 = new StringBuilder().append("vk.E(");
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
              break L4;
            } else {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L4;
            }
          }
          throw wm.a((Throwable) (Object) stackIn_12_0, stackIn_12_2 + ',' + param1 + ',' + param2 + ')');
        }
    }

    private final int a(byte param0, pr param1) {
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
              if (param0 >= 118) {
                break L1;
              } else {
                field_y = null;
                break L1;
              }
            }
            var3_int = ((vk) this).field_B[param1.field_t];
            if (var3_int >= 8192) {
              stackOut_5_0 = 16384 + -(32 + (-param1.field_m + 128) * (16384 - var3_int) >> 6);
              stackIn_6_0 = stackOut_5_0;
              break L0;
            } else {
              stackOut_3_0 = param1.field_m * var3_int + 32 >> 6;
              stackIn_4_0 = stackOut_3_0;
              return stackIn_4_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) var3;
            stackOut_7_1 = new StringBuilder().append("vk.AA(").append(param0).append(',');
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param1 == null) {
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
          throw wm.a((Throwable) (Object) stackIn_10_0, stackIn_10_2 + ')');
        }
        return stackIn_6_0;
    }

    final boolean a(int param0, pr param1) {
        RuntimeException var3 = null;
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
              if (param0 == -16257) {
                break L1;
              } else {
                ((vk) this).field_z = null;
                break L1;
              }
            }
            if (null == param1.field_o) {
              if (param1.field_G >= 0) {
                L2: {
                  param1.a((byte) -117);
                  if (param1.field_n <= 0) {
                    break L2;
                  } else {
                    if (param1 == ((vk) this).field_R[param1.field_t][param1.field_n]) {
                      ((vk) this).field_R[param1.field_t][param1.field_n] = null;
                      break L2;
                    } else {
                      break L2;
                    }
                  }
                }
                stackOut_10_0 = 1;
                stackIn_11_0 = stackOut_10_0;
                break L0;
              } else {
                return true;
              }
            } else {
              return false;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) var3;
            stackOut_12_1 = new StringBuilder().append("vk.OA(").append(param0).append(',');
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
              break L3;
            } else {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L3;
            }
          }
          throw wm.a((Throwable) (Object) stackIn_15_0, stackIn_15_2 + ')');
        }
        return stackIn_11_0 != 0;
    }

    private final void b(int param0, int param1, int param2) {
        int var4 = 0;
        int var5 = Pool.field_O;
        if (((vk) this).field_v[param2] != param1) {
            ((vk) this).field_v[param2] = param1;
            for (var4 = 0; var4 < 128; var4++) {
                ((vk) this).field_R[param2][var4] = null;
            }
        }
    }

    final synchronized void e(int param0) {
        ((vk) this).a(true, param0);
    }

    private final int b(int param0, pr param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        kp var4 = null;
        int var5 = 0;
        int var6 = 0;
        double var7 = 0.0;
        int stackIn_2_0 = 0;
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
        int stackOut_1_0 = 0;
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
            var3_int = (param1.field_v * param1.field_r >> 12) + param1.field_B;
            var3_int = var3_int + ((-8192 + ((vk) this).field_Y[param1.field_t]) * ((vk) this).field_p[param1.field_t] >> 12);
            var4 = param1.field_x;
            if (param0 == 1) {
              L1: {
                if (var4.field_o <= 0) {
                  break L1;
                } else {
                  L2: {
                    if (var4.field_b > 0) {
                      break L2;
                    } else {
                      if (((vk) this).field_q[param1.field_t] > 0) {
                        break L2;
                      } else {
                        break L1;
                      }
                    }
                  }
                  L3: {
                    var5 = var4.field_b << 2;
                    var6 = var4.field_n << 1;
                    if (param1.field_q >= var6) {
                      break L3;
                    } else {
                      var5 = param1.field_q * var5 / var6;
                      break L3;
                    }
                  }
                  var5 = var5 + (((vk) this).field_q[param1.field_t] >> 7);
                  var7 = Math.sin((double)(param1.field_s & 511) * 0.01227184630308513);
                  var3_int = var3_int + (int)((double)var5 * var7);
                  break L1;
                }
              }
              L4: {
                var5 = (int)(0.5 + (double)(param1.field_C.field_p * 256) * Math.pow(2.0, 0.0003255208333333333 * (double)var3_int) / (double)bp.field_h);
                if (1 > var5) {
                  stackOut_12_0 = 1;
                  stackIn_13_0 = stackOut_12_0;
                  break L4;
                } else {
                  stackOut_11_0 = var5;
                  stackIn_13_0 = stackOut_11_0;
                  break L4;
                }
              }
              break L0;
            } else {
              stackOut_1_0 = -128;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var3 = decompiledCaughtException;
            stackOut_14_0 = (RuntimeException) var3;
            stackOut_14_1 = new StringBuilder().append("vk.GA(").append(param0).append(',');
            stackIn_16_0 = stackOut_14_0;
            stackIn_16_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param1 == null) {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L5;
            } else {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "{...}";
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              stackIn_17_2 = stackOut_15_2;
              break L5;
            }
          }
          throw wm.a((Throwable) (Object) stackIn_17_0, stackIn_17_2 + ')');
        }
        return stackIn_13_0;
    }

    private final void b(boolean param0) {
        int var3 = 0;
        if (!param0) {
            this.a(-1, 0);
        } else {
            this.c(-45, -1);
        }
        this.a((byte) -44, -1);
        for (var3 = 0; var3 < 16; var3++) {
            ((vk) this).field_v[var3] = ((vk) this).field_r[var3];
        }
        int var4 = 0;
        var3 = var4;
        while (16 > var4) {
            ((vk) this).field_J[var4] = rb.b(((vk) this).field_r[var4], -128);
            var4++;
        }
    }

    private final void a(int param0, int param1, int param2) {
        ((vk) this).field_A[param1] = param0;
        ((vk) this).field_L[param1] = (int)(Math.pow(2.0, (double)param0 * 0.00054931640625) * 2097152.0 + 0.5);
        if (param2 != 6779) {
            this.a(-51, false);
        }
    }

    private final void a(int param0, int param1) {
        pr var3 = null;
        var3 = (pr) (Object) ((vk) this).field_u.field_t.c((byte) 124);
        L0: while (true) {
          if (var3 == null) {
            return;
          } else {
            L1: {
              L2: {
                if (param0 < 0) {
                  break L2;
                } else {
                  if (param0 == var3.field_t) {
                    break L2;
                  } else {
                    break L1;
                  }
                }
              }
              if (var3.field_G < 0) {
                ((vk) this).field_I[var3.field_t][var3.field_A] = null;
                var3.field_G = 0;
                break L1;
              } else {
                break L1;
              }
            }
            var3 = (pr) (Object) ((vk) this).field_u.field_t.f((byte) -5);
            continue L0;
          }
        }
    }

    final synchronized void a(byte param0, int param1, int param2) {
        int var5 = 0;
        int var4 = 62 / ((param0 - -68) / 53);
        if (param1 >= 0) {
            ((vk) this).field_T[param1] = param2;
        } else {
            for (var5 = 0; 16 > var5; var5++) {
                ((vk) this).field_T[var5] = param2;
            }
        }
    }

    final synchronized void a(cg param0, int param1, boolean param2) {
        if (param1 != 8821) {
            return;
        }
        try {
            ((vk) this).a(param0, true, (byte) -14, param2);
        } catch (RuntimeException runtimeException) {
            throw wm.a((Throwable) (Object) runtimeException, "vk.S(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    private final void d(int param0, int param1) {
        pr var3 = null;
        if (!(0 == (((vk) this).field_F[param0] & 2))) {
            var3 = (pr) (Object) ((vk) this).field_u.field_t.c((byte) -92);
            while (var3 != null) {
                if (var3.field_t == param0) {
                    if (null == ((vk) this).field_I[param0][var3.field_A]) {
                        if (!(var3.field_G >= 0)) {
                            var3.field_G = 0;
                        }
                    }
                }
                var3 = (pr) (Object) ((vk) this).field_u.field_t.f((byte) -5);
            }
        }
    }

    private final void a(int param0, int param1, int param2, int param3) {
    }

    private final void a(int param0, boolean param1) {
        pr var3 = null;
        if ((4 & ((vk) this).field_F[param0]) != 0) {
            var3 = (pr) (Object) ((vk) this).field_u.field_t.c((byte) 88);
            while (var3 != null) {
                if (var3.field_t == param0) {
                    var3.field_y = 0;
                }
                var3 = (pr) (Object) ((vk) this).field_u.field_t.f((byte) -5);
            }
        }
        field_db = null;
    }

    final synchronized boolean d(int param0) {
        if (param0 != -11414) {
            return true;
        }
        return ((vk) this).field_Z.a();
    }

    private final void d(byte param0) {
        int var2 = 0;
        int var3 = 0;
        long var4 = 0L;
        int var6 = 0;
        int var7 = 0;
        L0: {
          var7 = Pool.field_O;
          var2 = ((vk) this).field_X;
          var3 = ((vk) this).field_t;
          var4 = ((vk) this).field_D;
          if (null == ((vk) this).field_C) {
            break L0;
          } else {
            if (((vk) this).field_S != var3) {
              break L0;
            } else {
              ((vk) this).a(((vk) this).field_C, ((vk) this).field_W, (byte) -14, ((vk) this).field_M);
              this.d((byte) -89);
              return;
            }
          }
        }
        L1: while (true) {
          if (var3 != ((vk) this).field_t) {
            L2: {
              ((vk) this).field_D = var4;
              ((vk) this).field_X = var2;
              ((vk) this).field_t = var3;
              if (null == ((vk) this).field_C) {
                break L2;
              } else {
                if (var3 > ((vk) this).field_S) {
                  ((vk) this).field_X = -1;
                  ((vk) this).field_t = ((vk) this).field_S;
                  ((vk) this).field_D = ((vk) this).field_Z.b(((vk) this).field_t);
                  break L2;
                } else {
                  break L2;
                }
              }
            }
            return;
          } else {
            L3: while (true) {
              L4: {
                if (var3 != ((vk) this).field_Z.field_g[var2]) {
                  break L4;
                } else {
                  ((vk) this).field_Z.a(var2);
                  var6 = ((vk) this).field_Z.d(var2);
                  if (var6 == 1) {
                    ((vk) this).field_Z.c();
                    ((vk) this).field_Z.e(var2);
                    if (((vk) this).field_Z.f()) {
                      if (((vk) this).field_C != null) {
                        ((vk) this).a(((vk) this).field_C, 8821, ((vk) this).field_M);
                        this.d((byte) -89);
                        return;
                      } else {
                        L5: {
                          if (!((vk) this).field_M) {
                            break L5;
                          } else {
                            if (var3 != 0) {
                              ((vk) this).field_Z.a(var4);
                              break L4;
                            } else {
                              break L5;
                            }
                          }
                        }
                        int discarded$1 = 123;
                        this.b(true);
                        ((vk) this).field_Z.e();
                        return;
                      }
                    } else {
                      break L4;
                    }
                  } else {
                    L6: {
                      if ((var6 & 128) != 0) {
                        this.b(var6, -122);
                        break L6;
                      } else {
                        break L6;
                      }
                    }
                    ((vk) this).field_Z.f(var2);
                    ((vk) this).field_Z.e(var2);
                    continue L3;
                  }
                }
              }
              var2 = ((vk) this).field_Z.b();
              var3 = ((vk) this).field_Z.field_g[var2];
              var4 = ((vk) this).field_Z.b(var3);
              continue L1;
            }
          }
        }
    }

    private final void c(int param0, int param1, int param2, int param3) {
        pr var6 = null;
        int var7 = Pool.field_O;
        pr var8 = ((vk) this).field_I[param0][param1];
        if (!(var8 != null)) {
            return;
        }
        if (param2 < 18) {
            ((vk) this).field_F = null;
        }
        ((vk) this).field_I[param0][param1] = null;
        if ((2 & ((vk) this).field_F[param0]) == 0) {
            var8.field_G = 0;
        } else {
            var6 = (pr) (Object) ((vk) this).field_u.field_t.c((byte) 124);
            while (var6 != null) {
                if (var8.field_t == var6.field_t) {
                    if (var6.field_G < 0) {
                        if (!(var6 == var8)) {
                            var8.field_G = 0;
                            break;
                        }
                    }
                }
                var6 = (pr) (Object) ((vk) this).field_u.field_t.f((byte) -5);
            }
        }
    }

    final synchronized void a(cg param0, boolean param1, byte param2, boolean param3) {
        int var5_int = 0;
        int var6 = 0;
        try {
            ((vk) this).a(param1, -1);
            ((vk) this).field_Z.a(param0.field_l);
            ((vk) this).field_ab = 0L;
            ((vk) this).field_M = param3 ? true : false;
            var5_int = ((vk) this).field_Z.d();
            if (param2 != -14) {
                kd discarded$0 = ((vk) this).a();
            }
            for (var6 = 0; var5_int > var6; var6++) {
                ((vk) this).field_Z.a(var6);
                ((vk) this).field_Z.f(var6);
                ((vk) this).field_Z.e(var6);
            }
            ((vk) this).field_X = ((vk) this).field_Z.b();
            ((vk) this).field_t = ((vk) this).field_Z.field_g[((vk) this).field_X];
            ((vk) this).field_D = ((vk) this).field_Z.b(((vk) this).field_t);
        } catch (RuntimeException runtimeException) {
            throw wm.a((Throwable) (Object) runtimeException, "vk.R(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final synchronized void a(boolean param0) {
        int var3 = Pool.field_O;
        if (!param0) {
            field_H = -40;
        }
        g var4 = (g) (Object) ((vk) this).field_z.a(0);
        while (var4 != null) {
            var4.c(23478);
            var4 = (g) (Object) ((vk) this).field_z.b(-1);
        }
    }

    final long c(byte param0) {
        if (param0 >= -46) {
            ((vk) this).field_t = 53;
        }
        return ((vk) this).field_ab / (long)((vk) this).field_Z.field_f;
    }

    private final void c(byte param0, int param1, int param2) {
    }

    private final void c(int param0, int param1) {
        pr var3 = null;
        L0: {
          var3 = (pr) (Object) ((vk) this).field_u.field_t.c((byte) 62);
          if (param0 < -17) {
            break L0;
          } else {
            this.a(-123, -25, 81);
            break L0;
          }
        }
        L1: while (true) {
          if (var3 == null) {
            return;
          } else {
            L2: {
              L3: {
                if (0 > param1) {
                  break L3;
                } else {
                  if (param1 == var3.field_t) {
                    break L3;
                  } else {
                    break L2;
                  }
                }
              }
              L4: {
                if (null == var3.field_o) {
                  break L4;
                } else {
                  L5: {
                    var3.field_o.c(bp.field_h / 100);
                    if (var3.field_o.g()) {
                      ((vk) this).field_u.field_p.b((kd) (Object) var3.field_o);
                      break L5;
                    } else {
                      break L5;
                    }
                  }
                  var3.a(2);
                  break L4;
                }
              }
              L6: {
                if (var3.field_G < 0) {
                  ((vk) this).field_I[var3.field_t][var3.field_A] = null;
                  break L6;
                } else {
                  break L6;
                }
              }
              var3.a((byte) -117);
              break L2;
            }
            var3 = (pr) (Object) ((vk) this).field_u.field_t.f((byte) -5);
            continue L1;
          }
        }
    }

    private final void b(int param0, int param1, int param2, int param3) {
        pr var5 = null;
        jg var6 = null;
        int var6_int = 0;
        pr var7 = null;
        pr var8 = null;
        int var9 = 0;
        g var10 = null;
        g var11 = null;
        Object stackIn_16_0 = null;
        int stackIn_16_1 = 0;
        pr stackIn_16_2 = null;
        Object stackIn_17_0 = null;
        int stackIn_17_1 = 0;
        pr stackIn_17_2 = null;
        Object stackIn_18_0 = null;
        int stackIn_18_1 = 0;
        pr stackIn_18_2 = null;
        int stackIn_18_3 = 0;
        Object stackOut_15_0 = null;
        int stackOut_15_1 = 0;
        pr stackOut_15_2 = null;
        Object stackOut_17_0 = null;
        int stackOut_17_1 = 0;
        pr stackOut_17_2 = null;
        int stackOut_17_3 = 0;
        Object stackOut_16_0 = null;
        int stackOut_16_1 = 0;
        pr stackOut_16_2 = null;
        int stackOut_16_3 = 0;
        L0: {
          var9 = Pool.field_O;
          this.c(param3, param1, 104, 64);
          if (0 != (((vk) this).field_F[param3] & 2)) {
            var5 = (pr) (Object) ((vk) this).field_u.field_t.a((byte) -127);
            L1: while (true) {
              if (var5 == null) {
                break L0;
              } else {
                L2: {
                  if (param3 != var5.field_t) {
                    break L2;
                  } else {
                    if (var5.field_G >= 0) {
                      break L2;
                    } else {
                      ((vk) this).field_I[param3][var5.field_A] = null;
                      ((vk) this).field_I[param3][param1] = var5;
                      var6_int = var5.field_B + (var5.field_r * var5.field_v >> 12);
                      var5.field_B = var5.field_B + (param1 - var5.field_A << 8);
                      var5.field_v = -var5.field_B + var6_int;
                      var5.field_r = 4096;
                      var5.field_A = param1;
                      return;
                    }
                  }
                }
                var5 = (pr) (Object) ((vk) this).field_u.field_t.b((byte) -46);
                continue L1;
              }
            }
          } else {
            break L0;
          }
        }
        var10 = (g) (Object) ((vk) this).field_z.a(false, (long)((vk) this).field_v[param3]);
        var11 = var10;
        if (var11 != null) {
          var6 = var10.field_u[param1];
          if (var6 == null) {
            return;
          } else {
            L3: {
              var7 = new pr();
              var7.field_u = var11;
              var7.field_C = var6;
              var7.field_t = param3;
              var7.field_x = var10.field_t[param1];
              var7.field_n = var10.field_p[param1];
              var7.field_A = param1;
              var7.field_E = 1024 + param2 * param2 * var11.field_q * var10.field_n[param1] >> 11;
              var7.field_m = var10.field_v[param1] & 255;
              var7.field_B = -(32767 & var10.field_s[param1]) + (param1 << 8);
              var7.field_w = 0;
              var7.field_G = -1;
              var7.field_z = 0;
              var7.field_F = 0;
              var7.field_p = 0;
              if (((vk) this).field_U[param3] != 0) {
                L4: {
                  var7.field_o = nb.b(var6, this.b(1, var7), 0, this.a((byte) 123, var7));
                  stackOut_15_0 = this;
                  stackOut_15_1 = -123;
                  stackOut_15_2 = (pr) var7;
                  stackIn_17_0 = stackOut_15_0;
                  stackIn_17_1 = stackOut_15_1;
                  stackIn_17_2 = stackOut_15_2;
                  stackIn_16_0 = stackOut_15_0;
                  stackIn_16_1 = stackOut_15_1;
                  stackIn_16_2 = stackOut_15_2;
                  if (var11.field_s[param1] >= 0) {
                    stackOut_17_0 = this;
                    stackOut_17_1 = stackIn_17_1;
                    stackOut_17_2 = (pr) (Object) stackIn_17_2;
                    stackOut_17_3 = 0;
                    stackIn_18_0 = stackOut_17_0;
                    stackIn_18_1 = stackOut_17_1;
                    stackIn_18_2 = stackOut_17_2;
                    stackIn_18_3 = stackOut_17_3;
                    break L4;
                  } else {
                    stackOut_16_0 = this;
                    stackOut_16_1 = stackIn_16_1;
                    stackOut_16_2 = (pr) (Object) stackIn_16_2;
                    stackOut_16_3 = 1;
                    stackIn_18_0 = stackOut_16_0;
                    stackIn_18_1 = stackOut_16_1;
                    stackIn_18_2 = stackOut_16_2;
                    stackIn_18_3 = stackOut_16_3;
                    break L4;
                  }
                }
                ((vk) this).a(stackIn_18_1, stackIn_18_2, stackIn_18_3 != 0);
                break L3;
              } else {
                var7.field_o = nb.b(var6, this.b(1, var7), this.a(true, var7), this.a((byte) 121, var7));
                break L3;
              }
            }
            L5: {
              if (var11.field_s[param1] < 0) {
                var7.field_o.e(-1);
                break L5;
              } else {
                break L5;
              }
            }
            L6: {
              if (var7.field_n < 0) {
                break L6;
              } else {
                L7: {
                  var8 = ((vk) this).field_R[param3][var7.field_n];
                  if (var8 == null) {
                    break L7;
                  } else {
                    if (var8.field_G >= 0) {
                      break L7;
                    } else {
                      ((vk) this).field_I[param3][var8.field_A] = null;
                      var8.field_G = 0;
                      break L7;
                    }
                  }
                }
                ((vk) this).field_R[param3][var7.field_n] = var7;
                break L6;
              }
            }
            ((vk) this).field_u.field_t.b((byte) -93, (ma) (Object) var7);
            ((vk) this).field_I[param3][param1] = var7;
            return;
          }
        } else {
          return;
        }
    }

    private final void b(int param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        var8 = Pool.field_O;
        var3 = 240 & param0;
        if (128 != var3) {
          if (144 == var3) {
            var4 = param0 & 15;
            var5 = 127 & param0 >> 8;
            var6 = (8367257 & param0) >> 16;
            if (0 < var6) {
              this.b(0, var5, var6, var4);
              return;
            } else {
              this.c(var4, var5, 96, 64);
              return;
            }
          } else {
            if (var3 != 160) {
              if (176 != var3) {
                if (192 == var3) {
                  var4 = param0 & 15;
                  var5 = param0 >> 8 & 127;
                  this.b(-118, ((vk) this).field_J[var4] + var5, var4);
                  return;
                } else {
                  if (var3 == 208) {
                    var4 = 15 & param0;
                    var5 = (param0 & 32677) >> 8;
                    this.c((byte) -62, var4, var5);
                    return;
                  } else {
                    if (var3 == 224) {
                      var4 = 15 & param0;
                      var5 = ((param0 & 32702) >> 8) + ((8323364 & param0) >> 9);
                      this.b((byte) 90, var4, var5);
                      return;
                    } else {
                      var3 = 255 & param0;
                      if (var3 != 255) {
                        return;
                      } else {
                        int discarded$1 = 123;
                        this.b(true);
                        return;
                      }
                    }
                  }
                }
              } else {
                L0: {
                  var4 = 15 & param0;
                  var5 = param0 >> 8 & 127;
                  var6 = (param0 & 8325787) >> 16;
                  if (var5 != 0) {
                    break L0;
                  } else {
                    ((vk) this).field_J[var4] = rb.b(((vk) this).field_J[var4], -2080769) + (var6 << 14);
                    break L0;
                  }
                }
                L1: {
                  if (var5 != 32) {
                    break L1;
                  } else {
                    ((vk) this).field_J[var4] = (var6 << 7) + rb.b(-16257, ((vk) this).field_J[var4]);
                    break L1;
                  }
                }
                L2: {
                  if (var5 != 1) {
                    break L2;
                  } else {
                    ((vk) this).field_q[var4] = (var6 << 7) + rb.b(-16257, ((vk) this).field_q[var4]);
                    break L2;
                  }
                }
                L3: {
                  if (33 == var5) {
                    ((vk) this).field_q[var4] = rb.b(-128, ((vk) this).field_q[var4]) - -var6;
                    break L3;
                  } else {
                    break L3;
                  }
                }
                L4: {
                  if (var5 == 5) {
                    ((vk) this).field_s[var4] = rb.b(((vk) this).field_s[var4], -16257) + (var6 << 7);
                    break L4;
                  } else {
                    break L4;
                  }
                }
                L5: {
                  if (var5 == 37) {
                    ((vk) this).field_s[var4] = var6 + rb.b(-128, ((vk) this).field_s[var4]);
                    break L5;
                  } else {
                    break L5;
                  }
                }
                L6: {
                  if (var5 != 7) {
                    break L6;
                  } else {
                    ((vk) this).field_G[var4] = (var6 << 7) + rb.b(-16257, ((vk) this).field_G[var4]);
                    break L6;
                  }
                }
                L7: {
                  if (var5 == 39) {
                    ((vk) this).field_G[var4] = var6 + rb.b(-128, ((vk) this).field_G[var4]);
                    break L7;
                  } else {
                    break L7;
                  }
                }
                L8: {
                  if (10 != var5) {
                    break L8;
                  } else {
                    ((vk) this).field_B[var4] = (var6 << 7) + rb.b(-16257, ((vk) this).field_B[var4]);
                    break L8;
                  }
                }
                L9: {
                  if (42 == var5) {
                    ((vk) this).field_B[var4] = rb.b(-128, ((vk) this).field_B[var4]) - -var6;
                    break L9;
                  } else {
                    break L9;
                  }
                }
                L10: {
                  if (var5 == 11) {
                    ((vk) this).field_K[var4] = rb.b(-16257, ((vk) this).field_K[var4]) + (var6 << 7);
                    break L10;
                  } else {
                    break L10;
                  }
                }
                L11: {
                  if (var5 == 43) {
                    ((vk) this).field_K[var4] = rb.b(((vk) this).field_K[var4], -128) + var6;
                    break L11;
                  } else {
                    break L11;
                  }
                }
                L12: {
                  if (64 == var5) {
                    if (var6 < 64) {
                      ((vk) this).field_F[var4] = rb.b(((vk) this).field_F[var4], -2);
                      break L12;
                    } else {
                      ((vk) this).field_F[var4] = md.a(((vk) this).field_F[var4], 1);
                      break L12;
                    }
                  } else {
                    break L12;
                  }
                }
                L13: {
                  if (var5 != 65) {
                    break L13;
                  } else {
                    if (var6 >= 64) {
                      ((vk) this).field_F[var4] = md.a(((vk) this).field_F[var4], 2);
                      break L13;
                    } else {
                      this.d(var4, 0);
                      ((vk) this).field_F[var4] = rb.b(((vk) this).field_F[var4], -3);
                      break L13;
                    }
                  }
                }
                L14: {
                  if (var5 != 99) {
                    break L14;
                  } else {
                    ((vk) this).field_cb[var4] = (var6 << 7) + rb.b(127, ((vk) this).field_cb[var4]);
                    break L14;
                  }
                }
                L15: {
                  if (98 == var5) {
                    ((vk) this).field_cb[var4] = var6 + rb.b(((vk) this).field_cb[var4], 16256);
                    break L15;
                  } else {
                    break L15;
                  }
                }
                L16: {
                  if (101 != var5) {
                    break L16;
                  } else {
                    ((vk) this).field_cb[var4] = 16384 - (-rb.b(127, ((vk) this).field_cb[var4]) + -(var6 << 7));
                    break L16;
                  }
                }
                L17: {
                  if (100 != var5) {
                    break L17;
                  } else {
                    ((vk) this).field_cb[var4] = rb.b(((vk) this).field_cb[var4], 16256) + (16384 - -var6);
                    break L17;
                  }
                }
                L18: {
                  if (var5 != 120) {
                    break L18;
                  } else {
                    this.c(-50, var4);
                    break L18;
                  }
                }
                L19: {
                  if (var5 == 121) {
                    this.a((byte) -44, var4);
                    break L19;
                  } else {
                    break L19;
                  }
                }
                L20: {
                  if (var5 != 123) {
                    break L20;
                  } else {
                    this.a(var4, 0);
                    break L20;
                  }
                }
                L21: {
                  if (6 != var5) {
                    break L21;
                  } else {
                    var7 = ((vk) this).field_cb[var4];
                    if (var7 == 16384) {
                      ((vk) this).field_p[var4] = rb.b(((vk) this).field_p[var4], -16257) + (var6 << 7);
                      break L21;
                    } else {
                      break L21;
                    }
                  }
                }
                L22: {
                  if (var5 == 38) {
                    var7 = ((vk) this).field_cb[var4];
                    if (var7 == 16384) {
                      ((vk) this).field_p[var4] = rb.b(-128, ((vk) this).field_p[var4]) + var6;
                      break L22;
                    } else {
                      break L22;
                    }
                  } else {
                    break L22;
                  }
                }
                L23: {
                  if (16 == var5) {
                    ((vk) this).field_U[var4] = (var6 << 7) + rb.b(((vk) this).field_U[var4], -16257);
                    break L23;
                  } else {
                    break L23;
                  }
                }
                L24: {
                  if (48 != var5) {
                    break L24;
                  } else {
                    ((vk) this).field_U[var4] = rb.b(((vk) this).field_U[var4], -128) + var6;
                    break L24;
                  }
                }
                L25: {
                  if (81 == var5) {
                    if (var6 < 64) {
                      this.a(var4, false);
                      ((vk) this).field_F[var4] = rb.b(((vk) this).field_F[var4], -5);
                      break L25;
                    } else {
                      ((vk) this).field_F[var4] = md.a(((vk) this).field_F[var4], 4);
                      break L25;
                    }
                  } else {
                    break L25;
                  }
                }
                L26: {
                  if (var5 == 17) {
                    this.a((((vk) this).field_A[var4] & -16257) + (var6 << 7), var4, 6779);
                    break L26;
                  } else {
                    break L26;
                  }
                }
                L27: {
                  if (var5 == 49) {
                    this.a(var6 + (((vk) this).field_A[var4] & -128), var4, 6779);
                    break L27;
                  } else {
                    break L27;
                  }
                }
                return;
              }
            } else {
              var4 = param0 & 15;
              var5 = (param0 & 32765) >> 8;
              var6 = (param0 & 8339384) >> 16;
              this.a(var6, var5, 8192, var4);
              return;
            }
          }
        } else {
          var4 = 15 & param0;
          var5 = param0 >> 8 & 127;
          var6 = (8324615 & param0) >> 16;
          this.c(var4, var5, 37, var6);
          return;
        }
    }

    final synchronized kd b() {
        return null;
    }

    final synchronized void a(int param0, byte param1) {
        ((vk) this).field_w = param0;
        if (param1 > 0) {
            Object var4 = null;
            ((vk) this).a(70, (pr) null, true);
        }
    }

    final void a(int param0, pr param1, boolean param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
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
            L1: {
              L2: {
                var4_int = param1.field_C.field_n.length;
                var6 = 11 % ((-54 - param0) / 63);
                if (!param2) {
                  break L2;
                } else {
                  if (param1.field_C.field_o) {
                    var7 = var4_int + (var4_int + -param1.field_C.field_m);
                    var4_int = var4_int << 8;
                    var5 = (int)((long)var7 * (long)((vk) this).field_U[param1.field_t] >> 6);
                    if (var5 < var4_int) {
                      break L1;
                    } else {
                      param1.field_o.a(true);
                      var5 = var4_int - -var4_int - (1 - -var5);
                      break L1;
                    }
                  } else {
                    break L2;
                  }
                }
              }
              var5 = (int)((long)var4_int * (long)((vk) this).field_U[param1.field_t] >> 6);
              break L1;
            }
            param1.field_o.g(var5);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var4 = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) var4;
            stackOut_8_1 = new StringBuilder().append("vk.Q(").append(param0).append(',');
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param1 == null) {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L3;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L3;
            }
          }
          throw wm.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + ',' + param2 + ')');
        }
    }

    final synchronized void a(boolean param0, int param1) {
        ((vk) this).field_Z.e();
        ((vk) this).field_C = null;
        if (param1 != -1) {
            Object var4 = null;
            ((vk) this).a(88, (pr) null, true);
        }
        int discarded$0 = 123;
        this.b(param0);
    }

    private final void b(byte param0, int param1, int param2) {
        ((vk) this).field_Y[param1] = param2;
        if (param0 != 90) {
            this.b((byte) 60, 14, -98);
        }
    }

    final synchronized void a(int param0) {
        int var2 = 0;
        long var3 = 0L;
        int var5 = 0;
        int var6 = 0;
        L0: {
          var6 = Pool.field_O;
          if (!((vk) this).field_Z.a()) {
            break L0;
          } else {
            var2 = ((vk) this).field_Z.field_f * ((vk) this).field_N / bp.field_h;
            L1: while (true) {
              var3 = (long)param0 * (long)var2 + ((vk) this).field_ab;
              if (0L <= ((vk) this).field_D - var3) {
                ((vk) this).field_ab = var3;
                break L0;
              } else {
                var5 = (int)((-((vk) this).field_ab + ((vk) this).field_D + ((long)var2 - 1L)) / (long)var2);
                ((vk) this).field_ab = ((vk) this).field_ab + (long)var5 * (long)var2;
                ((vk) this).field_u.a(var5);
                param0 = param0 - var5;
                this.d((byte) -89);
                if (!((vk) this).field_Z.a()) {
                  break L0;
                } else {
                  continue L1;
                }
              }
            }
          }
        }
        ((vk) this).field_u.a(param0);
    }

    final boolean a(int param0, int[] param1, int param2, int param3, pr param4) {
        RuntimeException var6 = null;
        int var6_int = 0;
        kp var7 = null;
        int var8 = 0;
        double var9 = 0.0;
        int var11 = 0;
        int stackIn_9_0 = 0;
        int stackIn_62_0 = 0;
        int stackIn_64_0 = 0;
        RuntimeException stackIn_66_0 = null;
        StringBuilder stackIn_66_1 = null;
        RuntimeException stackIn_67_0 = null;
        StringBuilder stackIn_67_1 = null;
        RuntimeException stackIn_68_0 = null;
        StringBuilder stackIn_68_1 = null;
        String stackIn_68_2 = null;
        RuntimeException stackIn_69_0 = null;
        StringBuilder stackIn_69_1 = null;
        RuntimeException stackIn_70_0 = null;
        StringBuilder stackIn_70_1 = null;
        RuntimeException stackIn_71_0 = null;
        StringBuilder stackIn_71_1 = null;
        String stackIn_71_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_8_0 = 0;
        int stackOut_61_0 = 0;
        int stackOut_63_0 = 0;
        RuntimeException stackOut_65_0 = null;
        StringBuilder stackOut_65_1 = null;
        RuntimeException stackOut_67_0 = null;
        StringBuilder stackOut_67_1 = null;
        String stackOut_67_2 = null;
        RuntimeException stackOut_66_0 = null;
        StringBuilder stackOut_66_1 = null;
        String stackOut_66_2 = null;
        RuntimeException stackOut_68_0 = null;
        StringBuilder stackOut_68_1 = null;
        RuntimeException stackOut_70_0 = null;
        StringBuilder stackOut_70_1 = null;
        String stackOut_70_2 = null;
        RuntimeException stackOut_69_0 = null;
        StringBuilder stackOut_69_1 = null;
        String stackOut_69_2 = null;
        var11 = Pool.field_O;
        try {
          L0: {
            L1: {
              param4.field_D = bp.field_h / 100;
              if (param4.field_G < 0) {
                break L1;
              } else {
                L2: {
                  if (param4.field_o == null) {
                    break L2;
                  } else {
                    if (param4.field_o.i()) {
                      break L2;
                    } else {
                      break L1;
                    }
                  }
                }
                L3: {
                  param4.a(param3 ^ 3);
                  param4.a((byte) -117);
                  if (0 >= param4.field_n) {
                    break L3;
                  } else {
                    if (param4 != ((vk) this).field_R[param4.field_t][param4.field_n]) {
                      break L3;
                    } else {
                      ((vk) this).field_R[param4.field_t][param4.field_n] = null;
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
              var6_int = param4.field_r;
              if (0 >= var6_int) {
                break L4;
              } else {
                L5: {
                  var6_int = var6_int - (int)(16.0 * Math.pow(2.0, 0.0004921259842519685 * (double)((vk) this).field_s[param4.field_t]) + 0.5);
                  if (var6_int >= 0) {
                    break L5;
                  } else {
                    var6_int = 0;
                    break L5;
                  }
                }
                param4.field_r = var6_int;
                break L4;
              }
            }
            L6: {
              param4.field_o.f(this.b(param3, param4));
              var7 = param4.field_x;
              param4.field_s = param4.field_s + var7.field_o;
              if (param3 == 1) {
                break L6;
              } else {
                boolean discarded$1 = ((vk) this).d(27);
                break L6;
              }
            }
            L7: {
              param4.field_q = param4.field_q + 1;
              var8 = 0;
              var9 = (double)((param4.field_r * param4.field_v >> 12) + (-60 + param4.field_A << 8)) * 0.000005086263020833333;
              if (var7.field_e <= 0) {
                break L7;
              } else {
                L8: {
                  if (var7.field_k <= 0) {
                    param4.field_p = param4.field_p + 128;
                    break L8;
                  } else {
                    param4.field_p = param4.field_p + (int)(0.5 + 128.0 * Math.pow(2.0, var9 * (double)var7.field_k));
                    break L8;
                  }
                }
                if (param4.field_p * var7.field_e < 819200) {
                  break L7;
                } else {
                  var8 = 1;
                  break L7;
                }
              }
            }
            L9: {
              if (var7.field_a != null) {
                L10: {
                  if (var7.field_j > 0) {
                    param4.field_z = param4.field_z + (int)(0.5 + Math.pow(2.0, (double)var7.field_j * var9) * 128.0);
                    break L10;
                  } else {
                    param4.field_z = param4.field_z + 128;
                    break L10;
                  }
                }
                L11: while (true) {
                  L12: {
                    if (var7.field_a.length - 2 <= param4.field_F) {
                      break L12;
                    } else {
                      if ((65280 & var7.field_a[param4.field_F + 2] << 8) >= param4.field_z) {
                        break L12;
                      } else {
                        param4.field_F = param4.field_F + 2;
                        continue L11;
                      }
                    }
                  }
                  if (var7.field_a.length - 2 != param4.field_F) {
                    break L9;
                  } else {
                    if (var7.field_a[1 + param4.field_F] != 0) {
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
            L13: {
              if (param4.field_G < 0) {
                break L13;
              } else {
                if (var7.field_l == null) {
                  break L13;
                } else {
                  if ((((vk) this).field_F[param4.field_t] & 1) != 0) {
                    break L13;
                  } else {
                    L14: {
                      if (param4.field_n < 0) {
                        break L14;
                      } else {
                        if (param4 == ((vk) this).field_R[param4.field_t][param4.field_n]) {
                          break L13;
                        } else {
                          break L14;
                        }
                      }
                    }
                    L15: {
                      if (var7.field_g > 0) {
                        param4.field_G = param4.field_G + (int)(0.5 + Math.pow(2.0, var9 * (double)var7.field_g) * 128.0);
                        break L15;
                      } else {
                        param4.field_G = param4.field_G + 128;
                        break L15;
                      }
                    }
                    L16: while (true) {
                      L17: {
                        if (-2 + var7.field_l.length <= param4.field_w) {
                          break L17;
                        } else {
                          if ((255 & var7.field_l[2 + param4.field_w]) << 8 >= param4.field_G) {
                            break L17;
                          } else {
                            param4.field_w = param4.field_w + 2;
                            continue L16;
                          }
                        }
                      }
                      if (var7.field_l.length + -2 == param4.field_w) {
                        var8 = 1;
                        break L13;
                      } else {
                        break L13;
                      }
                    }
                  }
                }
              }
            }
            if (var8 != 0) {
              L18: {
                param4.field_o.c(param4.field_D);
                if (param1 == null) {
                  param4.field_o.a(param0);
                  break L18;
                } else {
                  param4.field_o.a(param1, param2, param0);
                  break L18;
                }
              }
              L19: {
                if (!param4.field_o.g()) {
                  break L19;
                } else {
                  ((vk) this).field_u.field_p.b((kd) (Object) param4.field_o);
                  break L19;
                }
              }
              L20: {
                param4.a(2);
                if (param4.field_G >= 0) {
                  param4.a((byte) -117);
                  if (0 >= param4.field_n) {
                    break L20;
                  } else {
                    if (((vk) this).field_R[param4.field_t][param4.field_n] == param4) {
                      ((vk) this).field_R[param4.field_t][param4.field_n] = null;
                      break L20;
                    } else {
                      break L20;
                    }
                  }
                } else {
                  break L20;
                }
              }
              stackOut_61_0 = 1;
              stackIn_62_0 = stackOut_61_0;
              return stackIn_62_0 != 0;
            } else {
              param4.field_o.a(param4.field_D, this.a(true, param4), this.a((byte) 120, param4));
              stackOut_63_0 = 0;
              stackIn_64_0 = stackOut_63_0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L21: {
            var6 = decompiledCaughtException;
            stackOut_65_0 = (RuntimeException) var6;
            stackOut_65_1 = new StringBuilder().append("vk.J(").append(param0).append(',');
            stackIn_67_0 = stackOut_65_0;
            stackIn_67_1 = stackOut_65_1;
            stackIn_66_0 = stackOut_65_0;
            stackIn_66_1 = stackOut_65_1;
            if (param1 == null) {
              stackOut_67_0 = (RuntimeException) (Object) stackIn_67_0;
              stackOut_67_1 = (StringBuilder) (Object) stackIn_67_1;
              stackOut_67_2 = "null";
              stackIn_68_0 = stackOut_67_0;
              stackIn_68_1 = stackOut_67_1;
              stackIn_68_2 = stackOut_67_2;
              break L21;
            } else {
              stackOut_66_0 = (RuntimeException) (Object) stackIn_66_0;
              stackOut_66_1 = (StringBuilder) (Object) stackIn_66_1;
              stackOut_66_2 = "{...}";
              stackIn_68_0 = stackOut_66_0;
              stackIn_68_1 = stackOut_66_1;
              stackIn_68_2 = stackOut_66_2;
              break L21;
            }
          }
          L22: {
            stackOut_68_0 = (RuntimeException) (Object) stackIn_68_0;
            stackOut_68_1 = ((StringBuilder) (Object) stackIn_68_1).append(stackIn_68_2).append(',').append(param2).append(',').append(param3).append(',');
            stackIn_70_0 = stackOut_68_0;
            stackIn_70_1 = stackOut_68_1;
            stackIn_69_0 = stackOut_68_0;
            stackIn_69_1 = stackOut_68_1;
            if (param4 == null) {
              stackOut_70_0 = (RuntimeException) (Object) stackIn_70_0;
              stackOut_70_1 = (StringBuilder) (Object) stackIn_70_1;
              stackOut_70_2 = "null";
              stackIn_71_0 = stackOut_70_0;
              stackIn_71_1 = stackOut_70_1;
              stackIn_71_2 = stackOut_70_2;
              break L22;
            } else {
              stackOut_69_0 = (RuntimeException) (Object) stackIn_69_0;
              stackOut_69_1 = (StringBuilder) (Object) stackIn_69_1;
              stackOut_69_2 = "{...}";
              stackIn_71_0 = stackOut_69_0;
              stackIn_71_1 = stackOut_69_1;
              stackIn_71_2 = stackOut_69_2;
              break L22;
            }
          }
          throw wm.a((Throwable) (Object) stackIn_71_0, stackIn_71_2 + ')');
        }
        return stackIn_64_0 != 0;
    }

    public vk() {
        ((vk) this).field_G = new int[16];
        ((vk) this).field_s = new int[16];
        ((vk) this).field_r = new int[16];
        ((vk) this).field_v = new int[16];
        ((vk) this).field_T = new int[16];
        ((vk) this).field_cb = new int[16];
        ((vk) this).field_B = new int[16];
        ((vk) this).field_F = new int[16];
        ((vk) this).field_q = new int[16];
        ((vk) this).field_w = 256;
        ((vk) this).field_U = new int[16];
        ((vk) this).field_p = new int[16];
        ((vk) this).field_Y = new int[16];
        ((vk) this).field_R = new pr[16][128];
        ((vk) this).field_K = new int[16];
        ((vk) this).field_J = new int[16];
        ((vk) this).field_N = 1000000;
        ((vk) this).field_L = new int[16];
        ((vk) this).field_I = new pr[16][128];
        ((vk) this).field_A = new int[16];
        ((vk) this).field_Z = new gq();
        ((vk) this).field_u = new ib((vk) this);
        ((vk) this).field_z = new bm(128);
        ((vk) this).a((byte) -127, -1, 256);
        int discarded$0 = 123;
        this.b(true);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_O = "Enter name of friend to delete from list";
        field_db = new tf(0);
        field_P = "Private";
        field_V = new nl();
        field_x = "Join";
    }
}
