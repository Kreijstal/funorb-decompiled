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
        int var6 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        var6 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param1 <= -116) {
                break L1;
              } else {
                this.field_E = 0.7882997989654541f;
                break L1;
              }
            }
            var5_int = 0;
            L2: while (true) {
              if (!this.a(var5_int, 0, param0)) {
                var5_int++;
                continue L2;
              } else {
                L3: {
                  this.field_ab.a((byte) -113, new es(param0, param3, param2, var5_int));
                  if (this.field_W <= var5_int) {
                    this.field_W = 1 + var5_int;
                    break L3;
                  } else {
                    break L3;
                  }
                }
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var5 = decompiledCaughtException;
            stackIn_12_0 = (RuntimeException) (var5);

            stackIn_12_1 = new StringBuilder().append("ia.D(");

            if (param0 == null) {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L4;
            } else {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L4;
            }
          }
          L5: {


            stackIn_15_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_13_2).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "null";
              break L5;
            } else {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "{...}";
              break L5;
            }
          }
          throw r.a((Throwable) ((Object) stackIn_13_0), stackIn_16_2 + ')');
        }
    }

    final void b(boolean param0) {
        int var3 = 0;
        ln var4 = null;
        int var5 = ShatteredPlansClient.field_F ? 1 : 0;
        int var2 = this.field_O.field_e.length;
        if (param0) {
            this.field_X = false;
        }
        if (this.field_Q == null || this.field_Q.length < this.field_O.field_e.length) {
            this.field_jb = new int[var2];
            this.field_N = new sd[var2];
            this.field_Q = new fs[var2];
            this.field_P = new boolean[var2];
        }
        for (var3 = 0; var3 < var2; var3++) {
            var4 = this.field_O.field_e[var3];
            this.field_Q[var3] = var4.field_y;
            this.field_jb[var3] = var4.field_x;
            this.field_N[var3] = var4.field_R;
            this.field_P[var3] = false;
        }
    }

    final void a(l param0, int param1) {
        int[] var7 = null;
        int[] var3 = null;
        boolean[] var4 = null;
        int var5 = 0;
        int var6 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
            this.field_O = param0;
            this.field_F = (float)(this.field_O.field_k * 300 / 450);
            var7 = new int[this.field_O.field_e.length];
            var3 = var7;
            var4 = new boolean[this.field_O.field_e.length];
            for (var5 = param1; this.field_z.length > var5; var5++) {
                var7[var5] = this.field_z[var5];
                var4[var5] = this.field_P[var5];
            }
            this.field_z = var3;
            this.field_P = var4;
            this.a(false);
        } catch (RuntimeException runtimeException) {
            throw r.a((Throwable) ((Object) runtimeException), "ia.C(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final void a(int param0) {
        this.field_c.a(0);
        this.field_m.a(0);
        this.field_ab.a(0);
        this.field_v.a(0);
        this.field_hb.a(param0);
        this.field_y = 0;
        this.field_u = 0;
        this.field_W = 0;
    }

    final void a(kq param0, int param1) {
        if (param1 < 93) {
            return;
        }
        try {
            this.field_o = param0;
        } catch (RuntimeException runtimeException) {
            throw r.a((Throwable) ((Object) runtimeException), "ia.A(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final void a(sd param0, int param1) {
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_27_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4_int = 0;
        bh var4 = null;
        int var5 = 0;
        ln var6_ref_ln = null;
        int var6 = 0;
        int var7_int = 0;
        float var7 = 0.0f;
        int var8_int = 0;
        float var8 = 0.0f;
        int var9 = 0;
        bh var10 = null;
        var9 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            if (param0.e(param1 + 27649)) {
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L1: {
                if (this.field_fb == param0) {
                  break L1;
                } else {
                  var3_int = this.field_o.d((byte) 14);
                  var4_int = 320;
                  var5 = var3_int / 2;
                  var6_ref_ln = param0.j(18229);
                  L2: while (true) {
                    L3: {
                      if (var6_ref_ln == null) {
                        break L3;
                      } else {
                        L4: {
                          var7_int = (int)((-this.field_k + (float)var6_ref_ln.field_A) * (300.0f / (this.field_I + (float)var6_ref_ln.field_z))) + var4_int;
                          var8_int = var5 + (int)((-this.field_E + (float)var6_ref_ln.field_S) * (300.0f / ((float)var6_ref_ln.field_z + this.field_I)));
                          if ((var7_int ^ -1) > -1) {
                            break L4;
                          } else {
                            if ((var8_int ^ -1) > -1) {
                              break L4;
                            } else {
                              if (-641 >= (var7_int ^ -1)) {
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
                      this.field_fb = param0;
                      decompiledRegionSelector0 = 1;
                      break L0;
                    } else {
                      break L1;
                    }
                  }
                }
              }
              L5: {
                var10 = this.a(22770, param0);
                var4 = this.field_o.b((byte) 57);
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
              var8 = (float)(var4.field_l - -var4.field_o - 640 >> -1144347455);
              var8 = var8 * var7;
              this.field_f = -var8 + (float)(var10.field_o + var10.field_l >> 1881719393);
              var8 = (float)(var4.field_q + var4.field_i + -this.field_o.d((byte) 14) >> 771986881);
              var8 = var8 * var7;
              this.field_x = true;
              this.field_fb = param0;
              this.field_lb = (float)(var10.field_i + var10.field_q >> -1485041759) - var8;
              this.field_H = var7 * 300.0f;
              decompiledRegionSelector0 = 2;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var3 = decompiledCaughtException;
            stackIn_26_0 = (RuntimeException) (var3);

            stackIn_26_1 = new StringBuilder().append("ia.AA(");

            if (param0 == null) {
              stackIn_27_0 = (RuntimeException) ((Object) stackIn_26_0);
              stackIn_27_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackIn_27_2 = "null";
              break L7;
            } else {
              stackIn_27_0 = (RuntimeException) ((Object) stackIn_26_0);
              stackIn_27_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackIn_27_2 = "{...}";
              break L7;
            }
          }
          throw r.a((Throwable) ((Object) stackIn_27_0), stackIn_27_2 + ',' + param1 + ')');
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

    final void a(fs param0, ln param1, boolean param2, int param3) {
        int var5_int = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        StringBuilder stackIn_14_1 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        try {
          L0: {
            if (!param2) {
              var5_int = 0;
              L1: while (true) {
                if (this.a(var5_int, 0, param1)) {
                  L2: {
                    this.field_ab.a((byte) -113, new es(param1, param0, -1, param3, var5_int));
                    if (var5_int < this.field_W) {
                      break L2;
                    } else {
                      this.field_W = var5_int - -1;
                      break L2;
                    }
                  }
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  var5_int++;
                  continue L1;
                }
              }
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5 = decompiledCaughtException;
            stackIn_11_0 = (RuntimeException) (var5);

            stackIn_11_1 = new StringBuilder().append("ia.H(");

            if (param0 == null) {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "null";
              break L3;
            } else {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_14_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_12_2).append(',');

            if (param1 == null) {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "null";
              break L4;
            } else {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "{...}";
              break L4;
            }
          }
          throw r.a((Throwable) ((Object) stackIn_12_0), stackIn_15_2 + ',' + param2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final void a(int[] param0, int[] param1, int[] param2, boolean[] param3, boolean[] param4, int[] param5, int[] param6, int[] param7, int param8) {
        try {
            this.field_a = param2;
            this.field_U = param5;
            this.field_kb = param4;
            this.field_A = param3;
            if (param8 != 0) {
                this.a(true);
            }
        } catch (RuntimeException runtimeException) {
            throw r.a((Throwable) ((Object) runtimeException), "ia.N(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + (param3 != null ? "{...}" : "null") + ',' + (param4 != null ? "{...}" : "null") + ',' + (param5 != null ? "{...}" : "null") + ',' + (param6 != null ? "{...}" : "null") + ',' + (param7 != null ? "{...}" : "null") + ',' + param8 + ')');
        }
    }

    final void a(fs param0, ln param1, byte param2, ln param3) {
        int var5_int = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        StringBuilder stackIn_18_1 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        try {
          L0: {
            L1: {
              if (param2 <= -86) {
                break L1;
              } else {
                this.field_O = (l) null;
                break L1;
              }
            }
            var5_int = 0;
            L2: while (true) {
              L3: {
                if (!this.a(-4, var5_int)) {
                  break L3;
                } else {
                  if (!this.a(var5_int, 0, param3)) {
                    break L3;
                  } else {
                    if (!this.a(var5_int, 0, param1)) {
                      break L3;
                    } else {
                      L4: {
                        this.field_ab.a((byte) -113, new es(param3, param0, 3, var5_int));
                        this.field_ab.a((byte) -113, new es(param1, param0, 3, var5_int));
                        if (var5_int < this.field_W) {
                          break L4;
                        } else {
                          this.field_W = 1 + var5_int;
                          break L4;
                        }
                      }
                      break L0;
                    }
                  }
                }
              }
              var5_int++;
              continue L2;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var5 = decompiledCaughtException;
            stackIn_12_0 = (RuntimeException) (var5);

            stackIn_12_1 = new StringBuilder().append("ia.T(");

            if (param0 == null) {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L5;
            } else {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L5;
            }
          }
          L6: {


            stackIn_15_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_13_2).append(',');

            if (param1 == null) {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "null";
              break L6;
            } else {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "{...}";
              break L6;
            }
          }
          L7: {


            stackIn_18_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_16_2).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "null";
              break L7;
            } else {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "{...}";
              break L7;
            }
          }
          throw r.a((Throwable) ((Object) stackIn_13_0), stackIn_19_2 + ')');
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
        bh stackIn_18_0 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        var8 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              var3 = param1.j(18229);
              var4 = new bh(2147483647, 2147483647, -2147483648, -2147483648);
              if (param0 == 22770) {
                break L1;
              } else {
                this.field_J = (int[]) null;
                break L1;
              }
            }
            L2: while (true) {
              if (var3 == null) {
                stackIn_18_0 = (bh) (var4);
                break L0;
              } else {
                var5 = var3.field_r;
                var6 = 0;
                L3: while (true) {
                  if (var5.length <= var6) {
                    var3 = param1.h(-23410);
                    continue L2;
                  } else {
                    L4: {
                      var7 = var5[var6];
                      if ((var4.field_q ^ -1) >= (var7.field_f ^ -1)) {
                        break L4;
                      } else {
                        var4.field_q = var7.field_f;
                        break L4;
                      }
                    }
                    L5: {
                      if (var4.field_l <= var7.field_c) {
                        break L5;
                      } else {
                        var4.field_l = var7.field_c;
                        break L5;
                      }
                    }
                    L6: {
                      if (var7.field_f > var4.field_i) {
                        var4.field_i = var7.field_f;
                        break L6;
                      } else {
                        break L6;
                      }
                    }
                    L7: {
                      if (var4.field_o >= var7.field_c) {
                        break L7;
                      } else {
                        var4.field_o = var7.field_c;
                        break L7;
                      }
                    }
                    var6++;
                    continue L3;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var3_ref = decompiledCaughtException;
            stackIn_21_0 = (RuntimeException) (var3_ref);

            stackIn_21_1 = new StringBuilder().append("ia.S(").append(param0).append(',');

            if (param1 == null) {
              stackIn_22_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "null";
              break L8;
            } else {
              stackIn_22_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "{...}";
              break L8;
            }
          }
          throw r.a((Throwable) ((Object) stackIn_22_0), stackIn_22_2 + ')');
        }
        return stackIn_18_0;
    }

    final void a(int param0, ln param1) {
        bi var4 = null;
        bi var5 = null;
        try {
            if (param0 > -21) {
                this.field_X = false;
            }
            var4 = uk.a(false, param1);
            var5 = var4;
            var4.b(-1 + this.field_i[param1.field_p] - (int)(this.field_g * (float)var5.field_z / (this.field_I * 2.0f)), -1 + this.field_J[param1.field_p] - (int)((float)var5.field_z * this.field_g / (this.field_I * 2.0f)), (int)(this.field_g * (float)var5.field_z / this.field_I), (int)(this.field_g * (float)var5.field_z / this.field_I));
        } catch (RuntimeException runtimeException) {
            throw r.a((Throwable) ((Object) runtimeException), "ia.F(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(ln param0, int param1) {
        bh var3 = null;
        float var4 = 0.0f;
        try {
            var3 = this.field_o.b((byte) 51);
            var4 = 24000.0f / (float)(var3.field_o - var3.field_l) - 3.0f * (float)param0.field_z;
            if (!(var4 >= this.field_g)) {
                var4 = this.field_g;
            }
            int var5 = 80 / ((72 - param1) / 52);
            this.a(78, param0, var4);
        } catch (RuntimeException runtimeException) {
            throw r.a((Throwable) ((Object) runtimeException), "ia.G(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final void e(int param0) {
        this.field_T = -1;
        this.field_t = 0;
        this.field_o.field_X.d(false);
        this.field_o.field_X.field_o = da.field_f;
        if (param0 != -18641) {
            this.a(17, false, -42);
        }
    }

    private final boolean a(int param0, int param1, ln param2) {
        es var4 = null;
        RuntimeException var4_ref = null;
        int var5 = 0;
        int stackIn_6_0 = 0;
        int stackIn_9_0 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var5 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            var4 = (es) ((Object) this.field_ab.d(param1 + param1));
            L1: while (true) {
              if (var4 == null) {
                stackIn_9_0 = 1;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                L2: {
                  if (var4.field_p != param2) {
                    break L2;
                  } else {
                    if (param0 != var4.field_k) {
                      break L2;
                    } else {
                      stackIn_6_0 = 0;
                      decompiledRegionSelector0 = 0;
                      break L0;
                    }
                  }
                }
                var4 = (es) ((Object) this.field_ab.a((byte) -71));
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var4_ref = decompiledCaughtException;
            stackIn_12_0 = (RuntimeException) (var4_ref);

            stackIn_12_1 = new StringBuilder().append("ia.W(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L3;
            } else {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L3;
            }
          }
          throw r.a((Throwable) ((Object) stackIn_13_0), stackIn_13_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_6_0 != 0;
        } else {
          return stackIn_9_0 != 0;
        }
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
        ln[] var9 = this.field_O.field_e;
        ln[] var4 = var9;
        for (var5 = 0; var9.length > var5; var5++) {
            var6 = var9[var5];
            if (!(!cp.a(0, param2, this.field_D[var6.field_p], this.field_h[var6.field_p], param0))) {
                return var6;
            }
        }
        if (!param1) {
            return null;
        }
        ln var8 = (ln) null;
        boolean discarded$0 = this.a(-16, -79, (ln) null);
        return null;
    }

    final void a(int param0, ln param1, float param2) {
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        float var5 = 0.0f;
        bh var6 = null;
        try {
          L0: {
            L1: {
              var6 = this.field_o.b((byte) 52);
              var5 = (float)(-640 + var6.field_o + var6.field_l >> 877524417);
              var5 = var5 * (((float)param1.field_z + param2) / 300.0f);
              this.field_f = -var5 + (float)param1.field_A;
              if (0.0f > this.field_f) {
                this.field_f = 0.0f;
                break L1;
              } else {
                break L1;
              }
            }
            var5 = (float)(var6.field_i + (var6.field_q - this.field_o.d((byte) 14)) >> -2111832383);
            var5 = var5 * ((param2 + (float)param1.field_z) / 300.0f);
            this.field_lb = (float)param1.field_S - var5;
            this.field_H = param2;
            if (param0 >= 7) {
              L2: {
                this.field_x = true;
                this.field_fb = null;
                if (0.0f > this.field_lb) {
                  this.field_lb = 0.0f;
                  break L2;
                } else {
                  break L2;
                }
              }
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var4 = decompiledCaughtException;
            stackIn_11_0 = (RuntimeException) (var4);

            stackIn_11_1 = new StringBuilder().append("ia.P(").append(param0).append(',');

            if (param1 == null) {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "null";
              break L3;
            } else {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "{...}";
              break L3;
            }
          }
          throw r.a((Throwable) ((Object) stackIn_12_0), stackIn_12_2 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final void d(int param0) {
        int var3 = 0;
        ln var4 = null;
        int[] var5 = null;
        int var6 = ShatteredPlansClient.field_F ? 1 : 0;
        if (null == this.field_R || this.field_R.length < this.field_O.field_e.length) {
            this.field_R = new int[this.field_O.field_e.length][];
        }
        ln[] var7 = this.field_O.field_e;
        ln[] var2 = var7;
        for (var3 = param0; var3 < var7.length; var3++) {
            var4 = var7[var3];
            var5 = mf.a((byte) 74, var4.field_G);
            this.field_R[var4.field_p] = var5;
        }
    }

    final void b(int param0) {
        int var2 = -640 + ln.field_K.field_z;
        int var3 = -480 + ln.field_K.field_w;
        int var5 = -108 % ((-29 - param0) / 51);
        int var4 = -(((int)this.field_k - 0) * (var2 << 1744658852)) / (0 + this.field_O.field_k);
        int var6 = -(((int)this.field_E + 0) * (var3 << -1383320668)) / (0 + this.field_O.field_b);
        ln.field_K.f(var4 >> 1147533028, var6 >> 1693827940);
    }

    final void c(boolean param0) {
        this.field_fb = null;
        if (param0) {
            return;
        }
        this.field_x = true;
        this.field_lb = (float)(this.field_O.field_b / 2);
        this.field_H = this.field_F;
        this.field_f = (float)(this.field_O.field_k / 2);
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
                this.field_Z = (fs[]) ((Object) param3.clone());
                this.field_r = (sd[]) ((Object) param2.clone());
                this.field_eb = (int[]) ((Object) param0.clone());
            }
            this.field_w = param2;
            if (!param1) {
                this.field_H = -1.5487414598464966f;
            }
            this.field_G = param0;
            this.field_q = param3;
        } catch (RuntimeException runtimeException) {
            throw r.a((Throwable) ((Object) runtimeException), "ia.J(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + (param3 != null ? "{...}" : "null") + ',' + param4 + ')');
        }
    }

    final void a(int param0, pf param1, boolean param2) {
        RuntimeException stackIn_68_0 = null;
        StringBuilder stackIn_68_1 = null;
        RuntimeException stackIn_69_0 = null;
        StringBuilder stackIn_69_1 = null;
        String stackIn_69_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        oh var4 = null;
        vn var4_ref = null;
        RuntimeException var4_ref2 = null;
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
        var8 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            if (param1 != null) {
              L1: {
                if (0 == param0) {
                  if (!this.field_C) {
                    break L1;
                  } else {
                    var4_int = this.field_Q.length;
                    var9 = 0;
                    var5_int = var9;
                    L2: while (true) {
                      if (var9 >= var4_int) {
                        var5 = param1.d(0);
                        L3: while (true) {
                          if (var5 == null) {
                            this.field_o.a(10, 0, sr.field_N);
                            break L1;
                          } else {
                            L4: {
                              if (var5 instanceof hj) {
                                var15 = (hj) ((Object) var5);
                                this.field_eb[var15.field_i.field_p] = this.field_eb[var15.field_i.field_p] + var15.field_h;
                                break L4;
                              } else {
                                if (var5 instanceof qi) {
                                  var14 = (qi) ((Object) var5);
                                  this.field_eb[var14.field_l.field_p] = this.field_eb[var14.field_l.field_p] - var14.field_i;
                                  break L4;
                                } else {
                                  if (var5 instanceof mg) {
                                    var13 = (mg) ((Object) var5);
                                    this.field_eb[var13.field_y.field_p] = this.field_eb[var13.field_y.field_p] - var13.field_z;
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
                        this.field_Z[var9] = this.field_Q[var9];
                        this.field_r[var9] = this.field_N[var9];
                        this.field_eb[var9] = this.field_jb[var9];
                        var9++;
                        continue L2;
                      }
                    }
                  }
                } else {
                  if ((param0 ^ -1) != -2) {
                    if (param0 != 2) {
                      if (-4 != (param0 ^ -1)) {
                        if ((param0 ^ -1) != 0) {
                          break L1;
                        } else {
                          this.a(this.field_G, true, this.field_w, this.field_q, true);
                          this.field_o.a(10, 0, (String) null);
                          break L1;
                        }
                      } else {
                        L5: {
                          if (this.field_C) {
                            var4 = param1.d(0);
                            L6: while (true) {
                              if (var4 == null) {
                                break L5;
                              } else {
                                L7: {
                                  if (!(var4 instanceof nr)) {
                                    break L7;
                                  } else {
                                    var12 = (nr) ((Object) var4);
                                    var6 = var12.field_p.field_p;
                                    this.field_Z[var6] = null;
                                    this.field_eb[var6] = 0;
                                    this.field_r[var6] = null;
                                    break L7;
                                  }
                                }
                                var4 = param1.a((byte) -71);
                                continue L6;
                              }
                            }
                          } else {
                            break L5;
                          }
                        }
                        this.field_o.a(10, 0, md.field_G);
                        break L1;
                      }
                    } else {
                      L8: {
                        if (this.field_C) {
                          var4_ref = (vn) ((Object) this.field_m.d(0));
                          L9: while (true) {
                            if (var4_ref == null) {
                              var5 = param1.d(0);
                              L10: while (true) {
                                if (var5 == null) {
                                  break L8;
                                } else {
                                  L11: {
                                    if (!(var5 instanceof eg)) {
                                      break L11;
                                    } else {
                                      var11 = (eg) ((Object) var5);
                                      var7 = (ne) ((Object) var11.field_v.d(0));
                                      L12: while (true) {
                                        if (var7 == null) {
                                          break L11;
                                        } else {
                                          L13: {
                                            if (var7.field_k == null) {
                                              break L13;
                                            } else {
                                              if (var7.field_k.field_y == var7.field_h) {
                                                this.field_eb[var7.field_k.field_p] = this.field_eb[var7.field_k.field_p] + var7.field_r;
                                                break L13;
                                              } else {
                                                break L13;
                                              }
                                            }
                                          }
                                          var7 = (ne) ((Object) var11.field_v.a((byte) -71));
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
                              var5_int = var4_ref.field_o.field_p;
                              this.field_Z[var5_int] = var4_ref.field_k;
                              this.field_eb[var5_int] = var4_ref.field_n;
                              this.field_r[var5_int] = var4_ref.field_h;
                              var4_ref = (vn) ((Object) this.field_m.a((byte) -71));
                              continue L9;
                            }
                          }
                        } else {
                          break L8;
                        }
                      }
                      this.field_o.a(10, 0, ib.field_b);
                      break L1;
                    }
                  } else {
                    L14: {
                      if (this.field_C) {
                        var4 = param1.d(0);
                        L15: while (true) {
                          if (var4 == null) {
                            break L14;
                          } else {
                            L16: {
                              if (!(var4 instanceof mg)) {
                                break L16;
                              } else {
                                var10 = (mg) ((Object) var4);
                                var6 = var10.field_B.field_p;
                                if (var10.field_G == this.field_Q[var6]) {
                                  this.field_eb[var6] = this.field_eb[var6] + var10.field_z;
                                  break L16;
                                } else {
                                  break L16;
                                }
                              }
                            }
                            var4 = param1.a((byte) -71);
                            continue L15;
                          }
                        }
                      } else {
                        break L14;
                      }
                    }
                    this.field_l = (Random) ((Object) new ea((long)this.field_d));
                    var4_ref = (vn) ((Object) this.field_m.d(0));
                    L17: while (true) {
                      if (var4_ref == null) {
                        this.field_o.a(10, 0, pd.field_g);
                        break L1;
                      } else {
                        var4_ref.c(true);
                        var4_ref = (vn) ((Object) this.field_m.a((byte) -71));
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
              this.field_T = param0;
              this.field_t = 0;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L19: {
            var4_ref2 = decompiledCaughtException;
            stackIn_68_0 = (RuntimeException) (var4_ref2);

            stackIn_68_1 = new StringBuilder().append("ia.L(").append(param0).append(',');

            if (param1 == null) {
              stackIn_69_0 = (RuntimeException) ((Object) stackIn_68_0);
              stackIn_69_1 = (StringBuilder) ((Object) stackIn_68_1);
              stackIn_69_2 = "null";
              break L19;
            } else {
              stackIn_69_0 = (RuntimeException) ((Object) stackIn_68_0);
              stackIn_69_1 = (StringBuilder) ((Object) stackIn_68_1);
              stackIn_69_2 = "{...}";
              break L19;
            }
          }
          throw r.a((Throwable) ((Object) stackIn_69_0), stackIn_69_2 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    void a(boolean param0) {
        int[] array$0 = null;
        int var2;
        int var3;
        int var4_int;
        ln[] var4;
        int var5;
        ln var6;
        int var7;
        int var8;
        jd var9;
        float var10;
        float var11;
        int var12;
        L0: {
          L1: {
            var12 = ShatteredPlansClient.field_F ? 1 : 0;
            var2 = 320;
            var3 = this.field_o.d((byte) 14) / 2;
            if (this.field_D == null) {
              break L1;
            } else {
              if (this.field_O.field_e.length != this.field_D.length) {
                break L1;
              } else {
                break L0;
              }
            }
          }
          var4_int = this.field_O.field_e.length;
          this.field_i = new int[var4_int];
          this.field_h = new bh[var4_int];
          this.field_J = new int[var4_int];
          this.field_D = new int[var4_int][];
          var5 = 0;
          L2: while (true) {
            if (var4_int <= var5) {
              break L0;
            } else {
              array$0 = new int[2 * this.field_O.field_e[var5].field_r.length];
              this.field_D[var5] = array$0;
              this.field_h[var5] = new bh();
              var5++;
              continue L2;
            }
          }
        }
        this.field_n = (int)(12000.0f / this.field_I);
        var4 = this.field_O.field_e;
        var5 = 0;
        L3: while (true) {
          if (var5 >= var4.length) {
            L4: {
              if (!param0) {
                break L4;
              } else {
                this.field_x = false;
                break L4;
              }
            }
            return;
          } else {
            var6 = var4[var5];
            var7 = var6.field_p;
            this.field_i[var7] = (int)(((float)var6.field_A - this.field_k) * (300.0f / ((float)var6.field_z + this.field_I))) + var2;
            this.field_J[var7] = (int)(300.0f / ((float)var6.field_z + this.field_I) * (-this.field_E + (float)var6.field_S)) + var3;
            var8 = 0;
            L5: while (true) {
              if (var8 >= var6.field_r.length) {
                var5++;
                continue L3;
              } else {
                L6: {
                  var9 = var6.field_r[var8];
                  var10 = -this.field_k + (float)var9.field_c;
                  var10 = var10 * (300.0f / ((float)var9.field_b + this.field_I));
                  var11 = -this.field_E + (float)var9.field_f;
                  var10 = var10 + (float)var2;
                  var11 = var11 * (300.0f / (this.field_I + (float)var9.field_b));
                  this.field_D[var7][2 * var8] = (int)var10;
                  var11 = var11 + (float)var3;
                  this.field_D[var7][2 * var8 - -1] = (int)var11;
                  if (var10 < (float)this.field_h[var7].field_l) {
                    this.field_h[var7].field_l = (int)var10;
                    break L6;
                  } else {
                    break L6;
                  }
                }
                L7: {
                  if (var11 < (float)this.field_h[var7].field_q) {
                    this.field_h[var7].field_q = (int)var11;
                    break L7;
                  } else {
                    break L7;
                  }
                }
                L8: {
                  if ((float)this.field_h[var7].field_o < var10) {
                    this.field_h[var7].field_o = (int)var10;
                    break L8;
                  } else {
                    break L8;
                  }
                }
                if ((float)this.field_h[var7].field_i < var11) {
                  this.field_h[var7].field_i = (int)var11;
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
        es var3 = (es) ((Object) this.field_ab.d(0));
        if (param0 != -4) {
            this.c(false);
        }
        while (var3 != null) {
            if ((var3.field_o ^ -1) == -4 && var3.field_k == param1) {
                return false;
            }
            var3 = (es) ((Object) this.field_ab.a((byte) -71));
        }
        return true;
    }

    ia() {
        this.field_L = -30;
        rs.field_Cb.c("+");
        this.field_bb = new int[4][];
    }

    static {
        field_M = "You have <%0> unread messages!";
        field_b = -1;
    }
}
