/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

abstract class ia {
    int field_db;
    fs[] field_ib;
    l field_O;
    int field_L;
    kq field_o;
    int[][] field_cb;
    float field_E;
    static String field_M;
    float field_H;
    float field_k;
    float field_I;
    static qr field_j;
    float field_F;
    float field_g;
    fs field_B;
    float field_lb;
    sd field_fb;
    int field_e;
    float field_f;
    static int field_b;
    boolean field_x;
    ln field_p;
    bi field_gb;
    mg field_S;
    int[][] field_bb;
    private fs[] field_q;
    int[] field_a;
    Random field_l;
    int field_t;
    int[] field_z;
    int[] field_i;
    pf field_m;
    private int[][] field_R;
    int[] field_eb;
    private sd[] field_r;
    boolean[] field_A;
    private sd[] field_w;
    private int[] field_G;
    int field_n;
    int[] field_U;
    int field_y;
    boolean field_X;
    private int[] field_jb;
    int field_u;
    pf field_c;
    pf field_hb;
    bh[] field_h;
    pf field_Y;
    int[][] field_D;
    pf field_ab;
    fs[] field_Z;
    pf field_s;
    pf field_v;
    boolean[] field_kb;
    int[] field_J;
    fs[] field_Q;
    private sd[] field_N;
    int field_T;
    boolean field_C;
    int field_W;
    int field_d;
    boolean[] field_P;
    pf field_V;
    pf field_mb;

    final void a(ln param0, int param1, int param2, fs param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        var6 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            if (param1 <= -116) {
              break L0;
            } else {
              ((ia) this).field_E = 0.7882997989654541f;
              break L0;
            }
          }
          var5_int = 0;
          L1: while (true) {
            if (!this.a(var5_int, 0, param0)) {
              var5_int++;
              continue L1;
            } else {
              L2: {
                ((ia) this).field_ab.a((byte) -113, (oh) (Object) new es(param0, param3, param2, var5_int));
                if (((ia) this).field_W <= var5_int) {
                  ((ia) this).field_W = 1 + var5_int;
                  break L2;
                } else {
                  break L2;
                }
              }
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5 = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) var5;
            stackOut_10_1 = new StringBuilder().append("ia.D(");
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
              break L3;
            } else {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L3;
            }
          }
          L4: {
            stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
            stackOut_13_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_13_2).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param3 == null) {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L4;
            } else {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L4;
            }
          }
          throw r.a((Throwable) (Object) stackIn_16_0, stackIn_16_2 + ')');
        }
    }

    final void b(boolean param0) {
        int var2 = 0;
        int var3 = 0;
        ln var4 = null;
        int var5 = 0;
        L0: {
          var5 = ShatteredPlansClient.field_F ? 1 : 0;
          var2 = ((ia) this).field_O.field_e.length;
          if (!param0) {
            break L0;
          } else {
            ((ia) this).field_X = false;
            break L0;
          }
        }
        L1: {
          L2: {
            if (((ia) this).field_Q == null) {
              break L2;
            } else {
              if (((ia) this).field_Q.length >= ((ia) this).field_O.field_e.length) {
                break L1;
              } else {
                break L2;
              }
            }
          }
          ((ia) this).field_jb = new int[var2];
          ((ia) this).field_N = new sd[var2];
          ((ia) this).field_Q = new fs[var2];
          ((ia) this).field_P = new boolean[var2];
          break L1;
        }
        var3 = 0;
        L3: while (true) {
          if (var3 >= var2) {
            return;
          } else {
            var4 = ((ia) this).field_O.field_e[var3];
            ((ia) this).field_Q[var3] = var4.field_y;
            ((ia) this).field_jb[var3] = var4.field_x;
            ((ia) this).field_N[var3] = var4.field_R;
            ((ia) this).field_P[var3] = false;
            var3++;
            continue L3;
          }
        }
    }

    final void a(l param0, int param1) {
        int[] var7 = null;
        int[] var3 = null;
        boolean[] var4 = null;
        int var5 = 0;
        int var6 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
            ((ia) this).field_O = param0;
            ((ia) this).field_F = (float)(((ia) this).field_O.field_k * 300 / 450);
            var7 = new int[((ia) this).field_O.field_e.length];
            var3 = var7;
            var4 = new boolean[((ia) this).field_O.field_e.length];
            for (var5 = param1; ((ia) this).field_z.length > var5; var5++) {
                var7[var5] = ((ia) this).field_z[var5];
                var4[var5] = ((ia) this).field_P[var5];
            }
            ((ia) this).field_z = var3;
            ((ia) this).field_P = var4;
            ((ia) this).a(false);
        } catch (RuntimeException runtimeException) {
            throw r.a((Throwable) (Object) runtimeException, "ia.C(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final void a(int param0) {
        ((ia) this).field_c.a(0);
        ((ia) this).field_m.a(0);
        ((ia) this).field_ab.a(0);
        ((ia) this).field_v.a(0);
        ((ia) this).field_hb.a(param0);
        ((ia) this).field_y = 0;
        ((ia) this).field_u = 0;
        ((ia) this).field_W = 0;
    }

    final void a(kq param0, int param1) {
        if (param1 < 93) {
            return;
        }
        try {
            ((ia) this).field_o = param0;
        } catch (RuntimeException runtimeException) {
            throw r.a((Throwable) (Object) runtimeException, "ia.A(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final void a(sd param0, int param1) {
        RuntimeException var3 = null;
        int var3_int = 0;
        bh var4 = null;
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        ln var6_ref_ln = null;
        float var7 = 0.0f;
        int var7_int = 0;
        int var8_int = 0;
        float var8 = 0.0f;
        int var9 = 0;
        bh var10 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_27_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        String stackOut_26_2 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        String stackOut_25_2 = null;
        var9 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            if (param0.e(param1 + 27649)) {
              return;
            } else {
              L1: {
                if (((ia) this).field_fb == param0) {
                  break L1;
                } else {
                  var3_int = ((ia) this).field_o.d((byte) 14);
                  var4_int = 320;
                  var5 = var3_int / 2;
                  var6_ref_ln = param0.j(18229);
                  L2: while (true) {
                    L3: {
                      if (var6_ref_ln == null) {
                        break L3;
                      } else {
                        L4: {
                          var7_int = (int)((-((ia) this).field_k + (float)var6_ref_ln.field_A) * (300.0f / (((ia) this).field_I + (float)var6_ref_ln.field_z))) + var4_int;
                          var8_int = var5 + (int)((-((ia) this).field_E + (float)var6_ref_ln.field_S) * (300.0f / ((float)var6_ref_ln.field_z + ((ia) this).field_I)));
                          if (var7_int < 0) {
                            break L4;
                          } else {
                            if (var8_int < 0) {
                              break L4;
                            } else {
                              if (var7_int >= 640) {
                                break L4;
                              } else {
                                if (var3_int <= var8_int) {
                                  break L4;
                                } else {
                                  break L3;
                                }
                              }
                            }
                          }
                        }
                        var6_ref_ln = param0.h(-23410);
                        continue L2;
                      }
                    }
                    if (var6_ref_ln != null) {
                      ((ia) this).field_fb = param0;
                      return;
                    } else {
                      break L1;
                    }
                  }
                }
              }
              L5: {
                var10 = this.a(22770, param0);
                var4 = ((ia) this).field_o.b((byte) 57);
                var5 = -var4.field_l + var4.field_o;
                var6 = var4.field_i - var4.field_q;
                var7 = (float)((var10.field_o - var10.field_l) / var5);
                if ((float)((-var10.field_q + var10.field_i) / var6) > var7) {
                  var7 = (float)((var10.field_i + -var10.field_q) / var6);
                  break L5;
                } else {
                  break L5;
                }
              }
              L6: {
                var7 = (float)((double)var7 + 0.2);
                if ((float)param1 <= var7) {
                  break L6;
                } else {
                  var7 = 1.0f;
                  break L6;
                }
              }
              var8 = (float)(var4.field_l - -var4.field_o - 640 >> 1);
              var8 = var8 * var7;
              ((ia) this).field_f = -var8 + (float)(var10.field_o + var10.field_l >> 1);
              var8 = (float)(var4.field_q + var4.field_i + -((ia) this).field_o.d((byte) 14) >> 1);
              var8 = var8 * var7;
              ((ia) this).field_x = true;
              ((ia) this).field_fb = param0;
              ((ia) this).field_lb = (float)(var10.field_i + var10.field_q >> 1) - var8;
              ((ia) this).field_H = var7 * 300.0f;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var3 = decompiledCaughtException;
            stackOut_24_0 = (RuntimeException) var3;
            stackOut_24_1 = new StringBuilder().append("ia.AA(");
            stackIn_26_0 = stackOut_24_0;
            stackIn_26_1 = stackOut_24_1;
            stackIn_25_0 = stackOut_24_0;
            stackIn_25_1 = stackOut_24_1;
            if (param0 == null) {
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
          throw r.a((Throwable) (Object) stackIn_27_0, stackIn_27_2 + ',' + param1 + ')');
        }
    }

    final void a(fs param0, ln param1, boolean param2, int param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        try {
          if (!param2) {
            var5_int = 0;
            L0: while (true) {
              if (this.a(var5_int, 0, param1)) {
                L1: {
                  ((ia) this).field_ab.a((byte) -113, (oh) (Object) new es(param1, param0, -1, param3, var5_int));
                  if (var5_int < ((ia) this).field_W) {
                    break L1;
                  } else {
                    ((ia) this).field_W = var5_int - -1;
                    break L1;
                  }
                }
                return;
              } else {
                var5_int++;
                continue L0;
              }
            }
          } else {
            return;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5 = decompiledCaughtException;
            stackOut_9_0 = (RuntimeException) var5;
            stackOut_9_1 = new StringBuilder().append("ia.H(");
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
              break L2;
            } else {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L2;
            }
          }
          L3: {
            stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
            stackOut_12_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_12_2).append(',');
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
          throw r.a((Throwable) (Object) stackIn_15_0, stackIn_15_2 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final void a(int[] param0, int[] param1, int[] param2, boolean[] param3, boolean[] param4, int[] param5, int[] param6, int[] param7, int param8) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
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
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
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
        try {
          L0: {
            L1: {
              ((ia) this).field_a = param2;
              ((ia) this).field_U = param5;
              ((ia) this).field_kb = param4;
              ((ia) this).field_A = param3;
              if (param8 == 0) {
                break L1;
              } else {
                ((ia) this).a(true);
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) runtimeException;
            stackOut_3_1 = new StringBuilder().append("ia.N(");
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param0 == null) {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L2;
            } else {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "{...}";
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_6_2 = stackOut_4_2;
              break L2;
            }
          }
          L3: {
            stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
            stackOut_6_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_6_2).append(',');
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param1 == null) {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L3;
            } else {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L3;
            }
          }
          L4: {
            stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
            stackOut_9_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_9_2).append(',');
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param2 == null) {
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
          L5: {
            stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
            stackOut_12_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_12_2).append(',');
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param3 == null) {
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
          L6: {
            stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
            stackOut_15_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_15_2).append(',');
            stackIn_17_0 = stackOut_15_0;
            stackIn_17_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param4 == null) {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "null";
              stackIn_18_0 = stackOut_17_0;
              stackIn_18_1 = stackOut_17_1;
              stackIn_18_2 = stackOut_17_2;
              break L6;
            } else {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "{...}";
              stackIn_18_0 = stackOut_16_0;
              stackIn_18_1 = stackOut_16_1;
              stackIn_18_2 = stackOut_16_2;
              break L6;
            }
          }
          L7: {
            stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
            stackOut_18_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_18_2).append(',');
            stackIn_20_0 = stackOut_18_0;
            stackIn_20_1 = stackOut_18_1;
            stackIn_19_0 = stackOut_18_0;
            stackIn_19_1 = stackOut_18_1;
            if (param5 == null) {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "null";
              stackIn_21_0 = stackOut_20_0;
              stackIn_21_1 = stackOut_20_1;
              stackIn_21_2 = stackOut_20_2;
              break L7;
            } else {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "{...}";
              stackIn_21_0 = stackOut_19_0;
              stackIn_21_1 = stackOut_19_1;
              stackIn_21_2 = stackOut_19_2;
              break L7;
            }
          }
          L8: {
            stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
            stackOut_21_1 = ((StringBuilder) (Object) stackIn_21_1).append(stackIn_21_2).append(',');
            stackIn_23_0 = stackOut_21_0;
            stackIn_23_1 = stackOut_21_1;
            stackIn_22_0 = stackOut_21_0;
            stackIn_22_1 = stackOut_21_1;
            if (param6 == null) {
              stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
              stackOut_23_1 = (StringBuilder) (Object) stackIn_23_1;
              stackOut_23_2 = "null";
              stackIn_24_0 = stackOut_23_0;
              stackIn_24_1 = stackOut_23_1;
              stackIn_24_2 = stackOut_23_2;
              break L8;
            } else {
              stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
              stackOut_22_1 = (StringBuilder) (Object) stackIn_22_1;
              stackOut_22_2 = "{...}";
              stackIn_24_0 = stackOut_22_0;
              stackIn_24_1 = stackOut_22_1;
              stackIn_24_2 = stackOut_22_2;
              break L8;
            }
          }
          L9: {
            stackOut_24_0 = (RuntimeException) (Object) stackIn_24_0;
            stackOut_24_1 = ((StringBuilder) (Object) stackIn_24_1).append(stackIn_24_2).append(',');
            stackIn_26_0 = stackOut_24_0;
            stackIn_26_1 = stackOut_24_1;
            stackIn_25_0 = stackOut_24_0;
            stackIn_25_1 = stackOut_24_1;
            if (param7 == null) {
              stackOut_26_0 = (RuntimeException) (Object) stackIn_26_0;
              stackOut_26_1 = (StringBuilder) (Object) stackIn_26_1;
              stackOut_26_2 = "null";
              stackIn_27_0 = stackOut_26_0;
              stackIn_27_1 = stackOut_26_1;
              stackIn_27_2 = stackOut_26_2;
              break L9;
            } else {
              stackOut_25_0 = (RuntimeException) (Object) stackIn_25_0;
              stackOut_25_1 = (StringBuilder) (Object) stackIn_25_1;
              stackOut_25_2 = "{...}";
              stackIn_27_0 = stackOut_25_0;
              stackIn_27_1 = stackOut_25_1;
              stackIn_27_2 = stackOut_25_2;
              break L9;
            }
          }
          throw r.a((Throwable) (Object) stackIn_27_0, stackIn_27_2 + ',' + param8 + ')');
        }
    }

    final void a(fs param0, ln param1, byte param2, ln param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        try {
          L0: {
            if (param2 <= -86) {
              break L0;
            } else {
              ((ia) this).field_O = null;
              break L0;
            }
          }
          var5_int = 0;
          L1: while (true) {
            L2: {
              if (!this.a(-4, var5_int)) {
                break L2;
              } else {
                if (!this.a(var5_int, 0, param3)) {
                  break L2;
                } else {
                  if (!this.a(var5_int, 0, param1)) {
                    break L2;
                  } else {
                    L3: {
                      ((ia) this).field_ab.a((byte) -113, (oh) (Object) new es(param3, param0, 3, var5_int));
                      ((ia) this).field_ab.a((byte) -113, (oh) (Object) new es(param1, param0, 3, var5_int));
                      if (var5_int < ((ia) this).field_W) {
                        break L3;
                      } else {
                        ((ia) this).field_W = 1 + var5_int;
                        break L3;
                      }
                    }
                    return;
                  }
                }
              }
            }
            var5_int++;
            continue L1;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var5 = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) var5;
            stackOut_10_1 = new StringBuilder().append("ia.T(");
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
          L5: {
            stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
            stackOut_13_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_13_2).append(',');
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
              break L5;
            } else {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L5;
            }
          }
          L6: {
            stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
            stackOut_16_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_16_2).append(',').append(param2).append(',');
            stackIn_18_0 = stackOut_16_0;
            stackIn_18_1 = stackOut_16_1;
            stackIn_17_0 = stackOut_16_0;
            stackIn_17_1 = stackOut_16_1;
            if (param3 == null) {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "null";
              stackIn_19_0 = stackOut_18_0;
              stackIn_19_1 = stackOut_18_1;
              stackIn_19_2 = stackOut_18_2;
              break L6;
            } else {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "{...}";
              stackIn_19_0 = stackOut_17_0;
              stackIn_19_1 = stackOut_17_1;
              stackIn_19_2 = stackOut_17_2;
              break L6;
            }
          }
          throw r.a((Throwable) (Object) stackIn_19_0, stackIn_19_2 + ')');
        }
    }

    private final bh a(int param0, sd param1) {
        ln var3 = null;
        RuntimeException var3_ref = null;
        bh var4 = null;
        jd[] var5 = null;
        int var6 = 0;
        jd var7 = null;
        int var8 = 0;
        bh stackIn_17_0 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        bh stackOut_16_0 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        var8 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            var3 = param1.j(18229);
            var4 = new bh(2147483647, 2147483647, -2147483648, -2147483648);
            L1: while (true) {
              if (var3 == null) {
                stackOut_16_0 = (bh) var4;
                stackIn_17_0 = stackOut_16_0;
                break L0;
              } else {
                var5 = var3.field_r;
                var6 = 0;
                L2: while (true) {
                  if (var5.length <= var6) {
                    var3 = param1.h(-23410);
                    continue L1;
                  } else {
                    L3: {
                      var7 = var5[var6];
                      if (var4.field_q <= var7.field_f) {
                        break L3;
                      } else {
                        var4.field_q = var7.field_f;
                        break L3;
                      }
                    }
                    L4: {
                      if (var4.field_l <= var7.field_c) {
                        break L4;
                      } else {
                        var4.field_l = var7.field_c;
                        break L4;
                      }
                    }
                    L5: {
                      if (var7.field_f > var4.field_i) {
                        var4.field_i = var7.field_f;
                        break L5;
                      } else {
                        break L5;
                      }
                    }
                    L6: {
                      if (var4.field_o >= var7.field_c) {
                        break L6;
                      } else {
                        var4.field_o = var7.field_c;
                        break L6;
                      }
                    }
                    var6++;
                    continue L2;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var3_ref = decompiledCaughtException;
            stackOut_18_0 = (RuntimeException) var3_ref;
            stackOut_18_1 = new StringBuilder().append("ia.S(").append(22770).append(',');
            stackIn_20_0 = stackOut_18_0;
            stackIn_20_1 = stackOut_18_1;
            stackIn_19_0 = stackOut_18_0;
            stackIn_19_1 = stackOut_18_1;
            if (param1 == null) {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "null";
              stackIn_21_0 = stackOut_20_0;
              stackIn_21_1 = stackOut_20_1;
              stackIn_21_2 = stackOut_20_2;
              break L7;
            } else {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "{...}";
              stackIn_21_0 = stackOut_19_0;
              stackIn_21_1 = stackOut_19_1;
              stackIn_21_2 = stackOut_19_2;
              break L7;
            }
          }
          throw r.a((Throwable) (Object) stackIn_21_0, stackIn_21_2 + ')');
        }
        return stackIn_17_0;
    }

    final void a(int param0, ln param1) {
        bi var4 = null;
        bi var5 = null;
        try {
            if (param0 > -21) {
                ((ia) this).field_X = false;
            }
            var4 = uk.a(false, param1);
            var5 = var4;
            var4.b(-1 + ((ia) this).field_i[param1.field_p] - (int)(((ia) this).field_g * (float)var5.field_z / (((ia) this).field_I * 2.0f)), -1 + ((ia) this).field_J[param1.field_p] - (int)((float)var5.field_z * ((ia) this).field_g / (((ia) this).field_I * 2.0f)), (int)(((ia) this).field_g * (float)var5.field_z / ((ia) this).field_I), (int)(((ia) this).field_g * (float)var5.field_z / ((ia) this).field_I));
        } catch (RuntimeException runtimeException) {
            throw r.a((Throwable) (Object) runtimeException, "ia.F(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(ln param0, int param1) {
        bh var3 = null;
        float var4 = 0.0f;
        try {
            var3 = ((ia) this).field_o.b((byte) 51);
            var4 = 24000.0f / (float)(var3.field_o - var3.field_l) - 3.0f * (float)param0.field_z;
            if (!(var4 >= ((ia) this).field_g)) {
                var4 = ((ia) this).field_g;
            }
            int var5 = 80 / ((72 - param1) / 52);
            ((ia) this).a(78, param0, var4);
        } catch (RuntimeException runtimeException) {
            throw r.a((Throwable) (Object) runtimeException, "ia.G(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final void e(int param0) {
        ((ia) this).field_T = -1;
        ((ia) this).field_t = 0;
        ((ia) this).field_o.field_X.d(false);
        ((ia) this).field_o.field_X.field_o = da.field_f;
        if (param0 != -18641) {
            ln discarded$0 = ((ia) this).a(17, false, -42);
        }
    }

    private final boolean a(int param0, int param1, ln param2) {
        es var4 = null;
        RuntimeException var4_ref = null;
        int var5 = 0;
        int stackIn_6_0 = 0;
        int stackIn_9_0 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_8_0 = 0;
        int stackOut_5_0 = 0;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        var5 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            var4 = (es) (Object) ((ia) this).field_ab.d(param1 + param1);
            L1: while (true) {
              if (var4 == null) {
                stackOut_8_0 = 1;
                stackIn_9_0 = stackOut_8_0;
                break L0;
              } else {
                L2: {
                  if (var4.field_p != param2) {
                    break L2;
                  } else {
                    if (param0 != var4.field_k) {
                      break L2;
                    } else {
                      stackOut_5_0 = 0;
                      stackIn_6_0 = stackOut_5_0;
                      return stackIn_6_0 != 0;
                    }
                  }
                }
                var4 = (es) (Object) ((ia) this).field_ab.a((byte) -71);
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var4_ref = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) var4_ref;
            stackOut_10_1 = new StringBuilder().append("ia.W(").append(param0).append(',').append(param1).append(',');
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param2 == null) {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L3;
            } else {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L3;
            }
          }
          throw r.a((Throwable) (Object) stackIn_13_0, stackIn_13_2 + ')');
        }
        return stackIn_9_0 != 0;
    }

    final ln a(int param0, boolean param1, int param2) {
        int var5 = 0;
        ln var6 = null;
        int var7 = ShatteredPlansClient.field_F ? 1 : 0;
        if (param0 < 0) {
            return null;
        }
        if (param2 < 0) {
            return null;
        }
        ln[] var9 = ((ia) this).field_O.field_e;
        ln[] var4 = var9;
        for (var5 = 0; var9.length > var5; var5++) {
            var6 = var9[var5];
            if (!(!cp.a(0, param2, ((ia) this).field_D[var6.field_p], ((ia) this).field_h[var6.field_p], param0))) {
                return var6;
            }
        }
        if (!param1) {
            return null;
        }
        Object var8 = null;
        boolean discarded$0 = this.a(-16, -79, (ln) null);
        return null;
    }

    final void a(int param0, ln param1, float param2) {
        RuntimeException var4 = null;
        float var5 = 0.0f;
        bh var6 = null;
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
              var6 = ((ia) this).field_o.b((byte) 52);
              var5 = (float)(-640 + var6.field_o + var6.field_l >> 1);
              var5 = var5 * (((float)param1.field_z + param2) / 300.0f);
              ((ia) this).field_f = -var5 + (float)param1.field_A;
              if (0.0f > ((ia) this).field_f) {
                ((ia) this).field_f = 0.0f;
                break L1;
              } else {
                break L1;
              }
            }
            var5 = (float)(var6.field_i + (var6.field_q - ((ia) this).field_o.d((byte) 14)) >> 1);
            var5 = var5 * ((param2 + (float)param1.field_z) / 300.0f);
            ((ia) this).field_lb = (float)param1.field_S - var5;
            ((ia) this).field_H = param2;
            if (param0 >= 7) {
              L2: {
                ((ia) this).field_x = true;
                ((ia) this).field_fb = null;
                if (0.0f > ((ia) this).field_lb) {
                  ((ia) this).field_lb = 0.0f;
                  break L2;
                } else {
                  break L2;
                }
              }
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var4 = decompiledCaughtException;
            stackOut_9_0 = (RuntimeException) var4;
            stackOut_9_1 = new StringBuilder().append("ia.P(").append(param0).append(',');
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param1 == null) {
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
          throw r.a((Throwable) (Object) stackIn_12_0, stackIn_12_2 + ',' + param2 + ')');
        }
    }

    final void d(int param0) {
        ln[] var2 = null;
        int var3 = 0;
        ln var4 = null;
        int[] var5 = null;
        int var6 = 0;
        ln[] var7 = null;
        L0: {
          L1: {
            var6 = ShatteredPlansClient.field_F ? 1 : 0;
            if (null == ((ia) this).field_R) {
              break L1;
            } else {
              if (((ia) this).field_R.length >= ((ia) this).field_O.field_e.length) {
                break L0;
              } else {
                break L1;
              }
            }
          }
          ((ia) this).field_R = new int[((ia) this).field_O.field_e.length][];
          break L0;
        }
        var7 = ((ia) this).field_O.field_e;
        var2 = var7;
        var3 = param0;
        L2: while (true) {
          if (var3 >= var7.length) {
            return;
          } else {
            var4 = var7[var3];
            var5 = mf.a((byte) 74, var4.field_G);
            ((ia) this).field_R[var4.field_p] = var5;
            var3++;
            continue L2;
          }
        }
    }

    final void b(int param0) {
        int var2 = -640 + ln.field_K.field_z;
        int var3 = -480 + ln.field_K.field_w;
        int var5 = -108 % ((-29 - param0) / 51);
        int var4 = -((int)((ia) this).field_k * (var2 << 4)) / ((ia) this).field_O.field_k;
        int var6 = -((int)((ia) this).field_E * (var3 << 4)) / ((ia) this).field_O.field_b;
        ln.field_K.f(var4 >> 4, var6 >> 4);
    }

    final void c(boolean param0) {
        ((ia) this).field_fb = null;
        if (param0) {
            return;
        }
        ((ia) this).field_x = true;
        ((ia) this).field_lb = (float)(((ia) this).field_O.field_b / 2);
        ((ia) this).field_H = ((ia) this).field_F;
        ((ia) this).field_f = (float)(((ia) this).field_O.field_k / 2);
    }

    public static void c(int param0) {
        if (param0 != -11784) {
            return;
        }
        field_j = null;
        field_M = null;
    }

    final void a(int[] param0, boolean param1, sd[] param2, fs[] param3, boolean param4) {
        try {
            if (param4) {
                ((ia) this).field_Z = (fs[]) param3.clone();
                ((ia) this).field_r = (sd[]) param2.clone();
                ((ia) this).field_eb = (int[]) param0.clone();
            }
            ((ia) this).field_w = param2;
            if (!param1) {
                ((ia) this).field_H = -1.5487414598464966f;
            }
            ((ia) this).field_G = param0;
            ((ia) this).field_q = param3;
        } catch (RuntimeException runtimeException) {
            throw r.a((Throwable) (Object) runtimeException, "ia.J(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + (param3 != null ? "{...}" : "null") + ',' + param4 + ')');
        }
    }

    final void a(int param0, pf param1, boolean param2) {
        RuntimeException var4 = null;
        int var4_int = 0;
        oh var4_ref = null;
        vn var4_ref2 = null;
        int var5_int = 0;
        oh var5 = null;
        int var6 = 0;
        ne var7 = null;
        int var8 = 0;
        int var9 = 0;
        mg var10 = null;
        eg var11 = null;
        nr var12 = null;
        mg var13 = null;
        qi var14 = null;
        hj var15 = null;
        RuntimeException stackIn_67_0 = null;
        StringBuilder stackIn_67_1 = null;
        RuntimeException stackIn_68_0 = null;
        StringBuilder stackIn_68_1 = null;
        RuntimeException stackIn_69_0 = null;
        StringBuilder stackIn_69_1 = null;
        String stackIn_69_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_66_0 = null;
        StringBuilder stackOut_66_1 = null;
        RuntimeException stackOut_68_0 = null;
        StringBuilder stackOut_68_1 = null;
        String stackOut_68_2 = null;
        RuntimeException stackOut_67_0 = null;
        StringBuilder stackOut_67_1 = null;
        String stackOut_67_2 = null;
        var8 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            if (param1 != null) {
              L1: {
                if (0 == param0) {
                  if (!((ia) this).field_C) {
                    break L1;
                  } else {
                    var4_int = ((ia) this).field_Q.length;
                    var9 = 0;
                    var5_int = var9;
                    L2: while (true) {
                      if (var9 >= var4_int) {
                        var5 = param1.d(0);
                        L3: while (true) {
                          if (var5 == null) {
                            ((ia) this).field_o.a(10, 0, sr.field_N);
                            break L1;
                          } else {
                            L4: {
                              if (var5 instanceof hj) {
                                var15 = (hj) (Object) var5;
                                ((ia) this).field_eb[var15.field_i.field_p] = ((ia) this).field_eb[var15.field_i.field_p] + var15.field_h;
                                break L4;
                              } else {
                                if (var5 instanceof qi) {
                                  var14 = (qi) (Object) var5;
                                  ((ia) this).field_eb[var14.field_l.field_p] = ((ia) this).field_eb[var14.field_l.field_p] - var14.field_i;
                                  break L4;
                                } else {
                                  if (var5 instanceof mg) {
                                    var13 = (mg) (Object) var5;
                                    ((ia) this).field_eb[var13.field_y.field_p] = ((ia) this).field_eb[var13.field_y.field_p] - var13.field_z;
                                    break L4;
                                  } else {
                                    var5 = param1.a((byte) -71);
                                    continue L3;
                                  }
                                }
                              }
                            }
                            var5 = param1.a((byte) -71);
                            continue L3;
                          }
                        }
                      } else {
                        ((ia) this).field_Z[var9] = ((ia) this).field_Q[var9];
                        ((ia) this).field_r[var9] = ((ia) this).field_N[var9];
                        ((ia) this).field_eb[var9] = ((ia) this).field_jb[var9];
                        var9++;
                        continue L2;
                      }
                    }
                  }
                } else {
                  if (param0 != 1) {
                    if (param0 != 2) {
                      if (param0 != 3) {
                        if (param0 != -1) {
                          break L1;
                        } else {
                          ((ia) this).a(((ia) this).field_G, true, ((ia) this).field_w, ((ia) this).field_q, true);
                          ((ia) this).field_o.a(10, 0, (String) null);
                          break L1;
                        }
                      } else {
                        L5: {
                          if (((ia) this).field_C) {
                            var4_ref = param1.d(0);
                            L6: while (true) {
                              if (var4_ref == null) {
                                break L5;
                              } else {
                                L7: {
                                  if (!(var4_ref instanceof nr)) {
                                    break L7;
                                  } else {
                                    var12 = (nr) (Object) var4_ref;
                                    var6 = var12.field_p.field_p;
                                    ((ia) this).field_Z[var6] = null;
                                    ((ia) this).field_eb[var6] = 0;
                                    ((ia) this).field_r[var6] = null;
                                    break L7;
                                  }
                                }
                                var4_ref = param1.a((byte) -71);
                                continue L6;
                              }
                            }
                          } else {
                            break L5;
                          }
                        }
                        ((ia) this).field_o.a(10, 0, md.field_G);
                        break L1;
                      }
                    } else {
                      L8: {
                        if (((ia) this).field_C) {
                          var4_ref2 = (vn) (Object) ((ia) this).field_m.d(0);
                          L9: while (true) {
                            if (var4_ref2 == null) {
                              var5 = param1.d(0);
                              L10: while (true) {
                                if (var5 == null) {
                                  break L8;
                                } else {
                                  L11: {
                                    if (!(var5 instanceof eg)) {
                                      break L11;
                                    } else {
                                      var11 = (eg) (Object) var5;
                                      var7 = (ne) (Object) var11.field_v.d(0);
                                      L12: while (true) {
                                        if (var7 == null) {
                                          break L11;
                                        } else {
                                          L13: {
                                            if (var7.field_k == null) {
                                              break L13;
                                            } else {
                                              if (var7.field_k.field_y == var7.field_h) {
                                                ((ia) this).field_eb[var7.field_k.field_p] = ((ia) this).field_eb[var7.field_k.field_p] + var7.field_r;
                                                break L13;
                                              } else {
                                                break L13;
                                              }
                                            }
                                          }
                                          var7 = (ne) (Object) var11.field_v.a((byte) -71);
                                          continue L12;
                                        }
                                      }
                                    }
                                  }
                                  var5 = param1.a((byte) -71);
                                  continue L10;
                                }
                              }
                            } else {
                              var5_int = var4_ref2.field_o.field_p;
                              ((ia) this).field_Z[var5_int] = var4_ref2.field_k;
                              ((ia) this).field_eb[var5_int] = var4_ref2.field_n;
                              ((ia) this).field_r[var5_int] = var4_ref2.field_h;
                              var4_ref2 = (vn) (Object) ((ia) this).field_m.a((byte) -71);
                              continue L9;
                            }
                          }
                        } else {
                          break L8;
                        }
                      }
                      ((ia) this).field_o.a(10, 0, ib.field_b);
                      break L1;
                    }
                  } else {
                    L14: {
                      if (((ia) this).field_C) {
                        var4_ref = param1.d(0);
                        L15: while (true) {
                          if (var4_ref == null) {
                            break L14;
                          } else {
                            L16: {
                              if (!(var4_ref instanceof mg)) {
                                break L16;
                              } else {
                                var10 = (mg) (Object) var4_ref;
                                var6 = var10.field_B.field_p;
                                if (var10.field_G == ((ia) this).field_Q[var6]) {
                                  ((ia) this).field_eb[var6] = ((ia) this).field_eb[var6] + var10.field_z;
                                  break L16;
                                } else {
                                  break L16;
                                }
                              }
                            }
                            var4_ref = param1.a((byte) -71);
                            continue L15;
                          }
                        }
                      } else {
                        break L14;
                      }
                    }
                    ((ia) this).field_l = (Random) (Object) new ea((long)((ia) this).field_d);
                    var4_ref2 = (vn) (Object) ((ia) this).field_m.d(0);
                    L17: while (true) {
                      if (var4_ref2 == null) {
                        ((ia) this).field_o.a(10, 0, pd.field_g);
                        break L1;
                      } else {
                        var4_ref2.c(true);
                        var4_ref2 = (vn) (Object) ((ia) this).field_m.a((byte) -71);
                        continue L17;
                      }
                    }
                  }
                }
              }
              L18: {
                if (!param2) {
                  break L18;
                } else {
                  ia.c(104);
                  break L18;
                }
              }
              ((ia) this).field_T = param0;
              ((ia) this).field_t = 0;
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L19: {
            var4 = decompiledCaughtException;
            stackOut_66_0 = (RuntimeException) var4;
            stackOut_66_1 = new StringBuilder().append("ia.L(").append(param0).append(',');
            stackIn_68_0 = stackOut_66_0;
            stackIn_68_1 = stackOut_66_1;
            stackIn_67_0 = stackOut_66_0;
            stackIn_67_1 = stackOut_66_1;
            if (param1 == null) {
              stackOut_68_0 = (RuntimeException) (Object) stackIn_68_0;
              stackOut_68_1 = (StringBuilder) (Object) stackIn_68_1;
              stackOut_68_2 = "null";
              stackIn_69_0 = stackOut_68_0;
              stackIn_69_1 = stackOut_68_1;
              stackIn_69_2 = stackOut_68_2;
              break L19;
            } else {
              stackOut_67_0 = (RuntimeException) (Object) stackIn_67_0;
              stackOut_67_1 = (StringBuilder) (Object) stackIn_67_1;
              stackOut_67_2 = "{...}";
              stackIn_69_0 = stackOut_67_0;
              stackIn_69_1 = stackOut_67_1;
              stackIn_69_2 = stackOut_67_2;
              break L19;
            }
          }
          throw r.a((Throwable) (Object) stackIn_69_0, stackIn_69_2 + ',' + param2 + ')');
        }
    }

    void a(boolean param0) {
        int var2 = 0;
        int var3 = 0;
        int var4_int = 0;
        ln[] var4 = null;
        int var5 = 0;
        ln var6 = null;
        int var7 = 0;
        int var8 = 0;
        jd var9 = null;
        float var10 = 0.0f;
        float var11 = 0.0f;
        int var12 = 0;
        L0: {
          L1: {
            var12 = ShatteredPlansClient.field_F ? 1 : 0;
            var2 = 320;
            var3 = ((ia) this).field_o.d((byte) 14) / 2;
            if (((ia) this).field_D == null) {
              break L1;
            } else {
              if (((ia) this).field_O.field_e.length != ((ia) this).field_D.length) {
                break L1;
              } else {
                break L0;
              }
            }
          }
          var4_int = ((ia) this).field_O.field_e.length;
          ((ia) this).field_i = new int[var4_int];
          ((ia) this).field_h = new bh[var4_int];
          ((ia) this).field_J = new int[var4_int];
          ((ia) this).field_D = new int[var4_int][];
          var5 = 0;
          L2: while (true) {
            if (var4_int <= var5) {
              break L0;
            } else {
              ((ia) this).field_D[var5] = new int[2 * ((ia) this).field_O.field_e[var5].field_r.length];
              ((ia) this).field_h[var5] = new bh();
              var5++;
              continue L2;
            }
          }
        }
        ((ia) this).field_n = (int)(12000.0f / ((ia) this).field_I);
        var4 = ((ia) this).field_O.field_e;
        var5 = 0;
        L3: while (true) {
          if (var5 >= var4.length) {
            L4: {
              if (!param0) {
                break L4;
              } else {
                ((ia) this).field_x = false;
                break L4;
              }
            }
            return;
          } else {
            var6 = var4[var5];
            var7 = var6.field_p;
            ((ia) this).field_i[var7] = (int)(((float)var6.field_A - ((ia) this).field_k) * (300.0f / ((float)var6.field_z + ((ia) this).field_I))) + var2;
            ((ia) this).field_J[var7] = (int)(300.0f / ((float)var6.field_z + ((ia) this).field_I) * (-((ia) this).field_E + (float)var6.field_S)) + var3;
            var8 = 0;
            L5: while (true) {
              if (var8 >= var6.field_r.length) {
                var5++;
                continue L3;
              } else {
                L6: {
                  var9 = var6.field_r[var8];
                  var10 = -((ia) this).field_k + (float)var9.field_c;
                  var10 = var10 * (300.0f / ((float)var9.field_b + ((ia) this).field_I));
                  var11 = -((ia) this).field_E + (float)var9.field_f;
                  var10 = var10 + (float)var2;
                  var11 = var11 * (300.0f / (((ia) this).field_I + (float)var9.field_b));
                  ((ia) this).field_D[var7][2 * var8] = (int)var10;
                  var11 = var11 + (float)var3;
                  ((ia) this).field_D[var7][2 * var8 - -1] = (int)var11;
                  if (var10 < (float)((ia) this).field_h[var7].field_l) {
                    ((ia) this).field_h[var7].field_l = (int)var10;
                    break L6;
                  } else {
                    break L6;
                  }
                }
                L7: {
                  if (var11 < (float)((ia) this).field_h[var7].field_q) {
                    ((ia) this).field_h[var7].field_q = (int)var11;
                    break L7;
                  } else {
                    break L7;
                  }
                }
                L8: {
                  if ((float)((ia) this).field_h[var7].field_o < var10) {
                    ((ia) this).field_h[var7].field_o = (int)var10;
                    break L8;
                  } else {
                    break L8;
                  }
                }
                if ((float)((ia) this).field_h[var7].field_i < var11) {
                  ((ia) this).field_h[var7].field_i = (int)var11;
                  var8++;
                  continue L5;
                } else {
                  var8++;
                  continue L5;
                }
              }
            }
          }
        }
    }

    private final boolean a(int param0, int param1) {
        int var4 = ShatteredPlansClient.field_F ? 1 : 0;
        es var3 = (es) (Object) ((ia) this).field_ab.d(0);
        while (var3 != null) {
            if (var3.field_o == 3) {
                if (var3.field_k == param1) {
                    return false;
                }
            }
            var3 = (es) (Object) ((ia) this).field_ab.a((byte) -71);
        }
        return true;
    }

    ia() {
        ((ia) this).field_L = -30;
        int discarded$0 = rs.field_Cb.c("+");
        ((ia) this).field_bb = new int[4][];
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_M = "You have <%0> unread messages!";
        field_b = -1;
    }
}
