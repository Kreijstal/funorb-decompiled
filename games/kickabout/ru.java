/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class ru extends lq {
    private int field_u;
    int[] field_i;
    private int[] field_z;
    private int[] field_E;
    private da[][] field_Q;
    private int[] field_A;
    private int[] field_I;
    private int[] field_q;
    int[] field_o;
    int[] field_s;
    private int[] field_G;
    private int[] field_v;
    private int[] field_n;
    private int field_p;
    private kc field_w;
    private rs field_k;
    private int[] field_y;
    private da[][] field_O;
    private int[] field_L;
    private int[] field_J;
    private int[] field_B;
    private int[] field_j;
    static Random field_l;
    static tf field_M;
    static int field_C;
    private int field_H;
    private pp field_m;
    private long field_D;
    private int field_K;
    static String field_t;
    private boolean field_r;
    private long field_P;
    private boolean field_F;
    private int field_N;
    private qm field_x;

    final synchronized void a(boolean param0, int param1, qm param2) {
        if (param1 != 19134) {
            return;
        }
        try {
            this.a(param2, true, (byte) 101, param0);
        } catch (RuntimeException runtimeException) {
            throw nb.a((Throwable) ((Object) runtimeException), "ru.HA(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final synchronized lq b() {
        return null;
    }

    private final void e(int param0, int param1, int param2) {
        if (param0 != 16) {
            this.field_k = (rs) null;
        }
    }

    private final int a(da param0, int param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        gl var4 = null;
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
            var3_int = (param0.field_n * param0.field_p >> -765265812) + param0.field_D;
            if (param1 == -5) {
              L1: {
                var3_int = var3_int + ((-8192 + this.field_v[param0.field_q]) * this.field_j[param0.field_q] >> 665747436);
                var4 = param0.field_j;
                if (var4.field_h <= 0) {
                  break L1;
                } else {
                  L2: {
                    if (-1 > (var4.field_j ^ -1)) {
                      break L2;
                    } else {
                      if (this.field_G[param0.field_q] <= 0) {
                        break L1;
                      } else {
                        break L2;
                      }
                    }
                  }
                  L3: {
                    var5 = var4.field_j << -2002369118;
                    var6 = var4.field_k << 1922130785;
                    if ((param0.field_w ^ -1) > (var6 ^ -1)) {
                      var5 = var5 * param0.field_w / var6;
                      break L3;
                    } else {
                      break L3;
                    }
                  }
                  var5 = var5 + (this.field_G[param0.field_q] >> 19891047);
                  var7 = Math.sin(0.01227184630308513 * (double)(511 & param0.field_z));
                  var3_int = var3_int + (int)(var7 * (double)var5);
                  break L1;
                }
              }
              L4: {
                var5 = (int)((double)(256 * param0.field_y.field_f) * Math.pow(2.0, 0.0003255208333333333 * (double)var3_int) / (double)uh.field_i + 0.5);
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
              stackOut_1_0 = -5;
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
            stackOut_15_1 = new StringBuilder().append("ru.V(");
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
          throw nb.a((Throwable) ((Object) stackIn_18_0), stackIn_18_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_14_0;
        }
    }

    final synchronized int d() {
        return 0;
    }

    final synchronized void c(int param0, int param1) {
        this.field_p = param0;
        if (param1 != 107342216) {
            this.d(9, 30);
        }
    }

    private final void a(int param0, int param1, byte param2, int param3) {
        int discarded$0 = 0;
        if (param2 != -71) {
            discarded$0 = this.a(false, (da) null);
        }
    }

    final synchronized void b(int param0, int param1, byte param2) {
        if (param2 > -48) {
            this.field_A = (int[]) null;
        }
        this.a(param0, param1, (byte) 36);
    }

    private final void d(int param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        var8 = Kickabout.field_G;
        if (param0 == 5) {
          var3 = 240 & param1;
          if (var3 == 128) {
            var4 = 15 & param1;
            var5 = 127 & param1 >> 2052715592;
            var6 = param1 >> -1402343152 & 127;
            this.a((byte) -119, var5, var4, var6);
            return;
          } else {
            L0: {
              if (-145 == (var3 ^ -1)) {
                var4 = 15 & param1;
                var5 = (param1 & 32618) >> -1176235928;
                var6 = param1 >> -1162534896 & 127;
                if (var6 <= 0) {
                  this.a((byte) -44, var5, var4, 64);
                  return;
                } else {
                  this.a(32, var6, var5, var4);
                  break L0;
                }
              } else {
                if (160 == var3) {
                  var4 = param1 & 15;
                  var5 = param1 >> 481587048 & 127;
                  var6 = (param1 & 8376783) >> 1320043472;
                  this.a(var4, var5, (byte) -71, var6);
                  return;
                } else {
                  if (-177 != (var3 ^ -1)) {
                    if (192 != var3) {
                      if (-209 != (var3 ^ -1)) {
                        if ((var3 ^ -1) != -225) {
                          var3 = param1 & 255;
                          if (255 == var3) {
                            this.a(true, false);
                            return;
                          } else {
                            return;
                          }
                        } else {
                          var4 = param1 & 15;
                          var5 = (127 & param1 >> -1808240824) + (16256 & param1 >> -1598628375);
                          this.b(param0 + 37, var4, var5);
                          return;
                        }
                      } else {
                        var4 = 15 & param1;
                        var5 = (param1 & 32603) >> 298506952;
                        this.e(param0 + 11, var5, var4);
                        return;
                      }
                    } else {
                      var4 = 15 & param1;
                      var5 = 127 & param1 >> -1022831896;
                      this.a(this.field_q[var4] + var5, param0 ^ 133, var4);
                      return;
                    }
                  } else {
                    L1: {
                      var4 = param1 & 15;
                      var5 = 127 & param1 >> 1208936424;
                      var6 = (8349360 & param1) >> -1014730608;
                      if ((var5 ^ -1) != -1) {
                        break L1;
                      } else {
                        this.field_q[var4] = qj.b(this.field_q[var4], -2080769) - -(var6 << 999007022);
                        break L1;
                      }
                    }
                    L2: {
                      if (var5 != 32) {
                        break L2;
                      } else {
                        this.field_q[var4] = qj.b(-16257, this.field_q[var4]) - -(var6 << -2085123321);
                        break L2;
                      }
                    }
                    L3: {
                      if ((var5 ^ -1) == -2) {
                        this.field_G[var4] = qj.b(this.field_G[var4], -16257) - -(var6 << -1605068185);
                        break L3;
                      } else {
                        break L3;
                      }
                    }
                    L4: {
                      if (33 == var5) {
                        this.field_G[var4] = var6 + qj.b(-128, this.field_G[var4]);
                        break L4;
                      } else {
                        break L4;
                      }
                    }
                    L5: {
                      if (var5 != 5) {
                        break L5;
                      } else {
                        this.field_B[var4] = (var6 << 1560857671) + qj.b(this.field_B[var4], -16257);
                        break L5;
                      }
                    }
                    L6: {
                      if ((var5 ^ -1) != -38) {
                        break L6;
                      } else {
                        this.field_B[var4] = var6 + qj.b(this.field_B[var4], -128);
                        break L6;
                      }
                    }
                    L7: {
                      if (var5 != 7) {
                        break L7;
                      } else {
                        this.field_y[var4] = (var6 << -292546969) + qj.b(this.field_y[var4], -16257);
                        break L7;
                      }
                    }
                    L8: {
                      if ((var5 ^ -1) != -40) {
                        break L8;
                      } else {
                        this.field_y[var4] = var6 + qj.b(-128, this.field_y[var4]);
                        break L8;
                      }
                    }
                    L9: {
                      if (10 == var5) {
                        this.field_E[var4] = (var6 << -1658210649) + qj.b(this.field_E[var4], -16257);
                        break L9;
                      } else {
                        break L9;
                      }
                    }
                    L10: {
                      if (-43 == (var5 ^ -1)) {
                        this.field_E[var4] = qj.b(this.field_E[var4], -128) - -var6;
                        break L10;
                      } else {
                        break L10;
                      }
                    }
                    L11: {
                      if (var5 != 11) {
                        break L11;
                      } else {
                        this.field_A[var4] = qj.b(this.field_A[var4], -16257) + (var6 << -562223033);
                        break L11;
                      }
                    }
                    L12: {
                      if ((var5 ^ -1) != -44) {
                        break L12;
                      } else {
                        this.field_A[var4] = var6 + qj.b(-128, this.field_A[var4]);
                        break L12;
                      }
                    }
                    L13: {
                      if (var5 != 64) {
                        break L13;
                      } else {
                        if ((var6 ^ -1) <= -65) {
                          this.field_i[var4] = hf.a(this.field_i[var4], 1);
                          break L13;
                        } else {
                          this.field_i[var4] = qj.b(this.field_i[var4], -2);
                          break L13;
                        }
                      }
                    }
                    L14: {
                      if (65 != var5) {
                        break L14;
                      } else {
                        if (-65 < (var6 ^ -1)) {
                          this.a(-1, var4);
                          this.field_i[var4] = qj.b(this.field_i[var4], -3);
                          break L14;
                        } else {
                          this.field_i[var4] = hf.a(this.field_i[var4], 2);
                          break L14;
                        }
                      }
                    }
                    L15: {
                      if (var5 == 99) {
                        this.field_z[var4] = qj.b(this.field_z[var4], 127) - -(var6 << -592884281);
                        break L15;
                      } else {
                        break L15;
                      }
                    }
                    L16: {
                      if (-99 != (var5 ^ -1)) {
                        break L16;
                      } else {
                        this.field_z[var4] = qj.b(16256, this.field_z[var4]) - -var6;
                        break L16;
                      }
                    }
                    L17: {
                      if (-102 != (var5 ^ -1)) {
                        break L17;
                      } else {
                        this.field_z[var4] = 16384 - (-qj.b(this.field_z[var4], 127) - (var6 << 1591088487));
                        break L17;
                      }
                    }
                    L18: {
                      if ((var5 ^ -1) == -101) {
                        this.field_z[var4] = var6 + (16384 + qj.b(16256, this.field_z[var4]));
                        break L18;
                      } else {
                        break L18;
                      }
                    }
                    L19: {
                      if (120 != var5) {
                        break L19;
                      } else {
                        this.f(var4, 100);
                        break L19;
                      }
                    }
                    L20: {
                      if (121 != var5) {
                        break L20;
                      } else {
                        this.b(var4, param0 ^ 87);
                        break L20;
                      }
                    }
                    L21: {
                      if ((var5 ^ -1) == -124) {
                        this.g(-9, var4);
                        break L21;
                      } else {
                        break L21;
                      }
                    }
                    L22: {
                      if (var5 != 6) {
                        break L22;
                      } else {
                        var7 = this.field_z[var4];
                        if ((var7 ^ -1) == -16385) {
                          this.field_j[var4] = (var6 << 545483719) + qj.b(-16257, this.field_j[var4]);
                          break L22;
                        } else {
                          break L22;
                        }
                      }
                    }
                    L23: {
                      if (var5 != 38) {
                        break L23;
                      } else {
                        var7 = this.field_z[var4];
                        if (var7 != 16384) {
                          break L23;
                        } else {
                          this.field_j[var4] = qj.b(-128, this.field_j[var4]) + var6;
                          break L23;
                        }
                      }
                    }
                    L24: {
                      if (-17 != (var5 ^ -1)) {
                        break L24;
                      } else {
                        this.field_s[var4] = (var6 << 553211175) + qj.b(-16257, this.field_s[var4]);
                        break L24;
                      }
                    }
                    L25: {
                      if (48 != var5) {
                        break L25;
                      } else {
                        this.field_s[var4] = var6 + qj.b(-128, this.field_s[var4]);
                        break L25;
                      }
                    }
                    L26: {
                      if (-82 != (var5 ^ -1)) {
                        break L26;
                      } else {
                        if (64 > var6) {
                          this.e(-28723, var4);
                          this.field_i[var4] = qj.b(this.field_i[var4], -5);
                          break L26;
                        } else {
                          this.field_i[var4] = hf.a(this.field_i[var4], 4);
                          break L26;
                        }
                      }
                    }
                    L27: {
                      if (17 != var5) {
                        break L27;
                      } else {
                        this.c(var4, (var6 << 1462295559) + (this.field_L[var4] & -16257), 103);
                        break L27;
                      }
                    }
                    if ((var5 ^ -1) != -50) {
                      break L0;
                    } else {
                      this.c(var4, (-128 & this.field_L[var4]) - -var6, 110);
                      return;
                    }
                  }
                }
              }
            }
            return;
          }
        } else {
          return;
        }
    }

    private final synchronized void a(qm param0, boolean param1, byte param2, boolean param3) {
        int var5_int = 0;
        int var6 = 0;
        int var7 = Kickabout.field_G;
        try {
            this.a((byte) -123, param1);
            this.field_k.a(param0.field_e);
            this.field_D = 0L;
            this.field_r = param3 ? true : false;
            if (param2 != 101) {
                this.field_N = 27;
            }
            var5_int = this.field_k.e();
            for (var6 = 0; var6 < var5_int; var6++) {
                this.field_k.c(var6);
                this.field_k.d(var6);
                this.field_k.b(var6);
            }
            this.field_K = this.field_k.g();
            this.field_H = this.field_k.field_e[this.field_K];
            this.field_P = this.field_k.e(this.field_H);
        } catch (RuntimeException runtimeException) {
            throw nb.a((Throwable) ((Object) runtimeException), "ru.EA(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    private final void a(int param0, int param1, int param2, int param3) {
        da var5 = null;
        to var6 = null;
        int var6_int = 0;
        da var7 = null;
        da var8 = null;
        int var9 = 0;
        jk var10 = null;
        jk var11 = null;
        Object stackIn_18_0 = null;
        int stackIn_18_1 = 0;
        da stackIn_18_2 = null;
        Object stackIn_19_0 = null;
        int stackIn_19_1 = 0;
        da stackIn_19_2 = null;
        Object stackIn_20_0 = null;
        int stackIn_20_1 = 0;
        da stackIn_20_2 = null;
        int stackIn_20_3 = 0;
        Object stackOut_17_0 = null;
        int stackOut_17_1 = 0;
        da stackOut_17_2 = null;
        Object stackOut_19_0 = null;
        int stackOut_19_1 = 0;
        da stackOut_19_2 = null;
        int stackOut_19_3 = 0;
        Object stackOut_18_0 = null;
        int stackOut_18_1 = 0;
        da stackOut_18_2 = null;
        int stackOut_18_3 = 0;
        L0: {
          var9 = Kickabout.field_G;
          this.a((byte) -50, param2, param3, 64);
          if (-1 != (this.field_i[param3] & 2 ^ -1)) {
            var5 = (da) ((Object) this.field_m.field_j.d(param0 ^ -9065));
            L1: while (true) {
              if (var5 == null) {
                break L0;
              } else {
                L2: {
                  if ((var5.field_q ^ -1) != (param3 ^ -1)) {
                    break L2;
                  } else {
                    if (0 <= var5.field_s) {
                      break L2;
                    } else {
                      this.field_O[param3][var5.field_e] = null;
                      this.field_O[param3][param2] = var5;
                      var6_int = var5.field_D - -(var5.field_p * var5.field_n >> 1221198668);
                      var5.field_D = var5.field_D + (param2 - var5.field_e << -774190648);
                      var5.field_e = param2;
                      var5.field_n = -var5.field_D + var6_int;
                      var5.field_p = 4096;
                      return;
                    }
                  }
                }
                var5 = (da) ((Object) this.field_m.field_j.e(33));
                continue L1;
              }
            }
          } else {
            break L0;
          }
        }
        var10 = (jk) ((Object) this.field_w.a(true, (long)this.field_n[param3]));
        var11 = var10;
        if (var11 == null) {
          return;
        } else {
          var6 = var10.field_l[param2];
          if (var6 != null) {
            var7 = new da();
            var7.field_y = var6;
            if (param0 == 32) {
              L3: {
                var7.field_q = param3;
                var7.field_g = var10;
                var7.field_j = var10.field_e[param2];
                var7.field_E = var10.field_p[param2];
                var7.field_e = param2;
                var7.field_C = var10.field_n[param2] * (param1 * param1) * var11.field_j + 1024 >> 1193637131;
                var7.field_A = var10.field_k[param2] & 255;
                var7.field_D = (param2 << -1535530296) - (32767 & var10.field_r[param2]);
                var7.field_f = 0;
                var7.field_l = 0;
                var7.field_t = 0;
                var7.field_s = -1;
                var7.field_v = 0;
                if (0 != this.field_s[param3]) {
                  L4: {
                    var7.field_F = vm.b(var6, this.a(var7, -5), 0, this.a(true, var7));
                    stackOut_17_0 = this;
                    stackOut_17_1 = 0;
                    stackOut_17_2 = (da) (var7);
                    stackIn_19_0 = stackOut_17_0;
                    stackIn_19_1 = stackOut_17_1;
                    stackIn_19_2 = stackOut_17_2;
                    stackIn_18_0 = stackOut_17_0;
                    stackIn_18_1 = stackOut_17_1;
                    stackIn_18_2 = stackOut_17_2;
                    if ((var11.field_r[param2] ^ -1) <= -1) {
                      stackOut_19_0 = this;
                      stackOut_19_1 = stackIn_19_1;
                      stackOut_19_2 = (da) ((Object) stackIn_19_2);
                      stackOut_19_3 = 0;
                      stackIn_20_0 = stackOut_19_0;
                      stackIn_20_1 = stackOut_19_1;
                      stackIn_20_2 = stackOut_19_2;
                      stackIn_20_3 = stackOut_19_3;
                      break L4;
                    } else {
                      stackOut_18_0 = this;
                      stackOut_18_1 = stackIn_18_1;
                      stackOut_18_2 = (da) ((Object) stackIn_18_2);
                      stackOut_18_3 = 1;
                      stackIn_20_0 = stackOut_18_0;
                      stackIn_20_1 = stackOut_18_1;
                      stackIn_20_2 = stackOut_18_2;
                      stackIn_20_3 = stackOut_18_3;
                      break L4;
                    }
                  }
                  this.a(stackIn_20_1 != 0, stackIn_20_2, stackIn_20_3 != 0);
                  break L3;
                } else {
                  var7.field_F = vm.b(var6, this.a(var7, -5), this.b(-101, var7), this.a(true, var7));
                  break L3;
                }
              }
              L5: {
                if ((var11.field_r[param2] ^ -1) <= -1) {
                  break L5;
                } else {
                  var7.field_F.g(-1);
                  break L5;
                }
              }
              L6: {
                if (-1 < (var7.field_E ^ -1)) {
                  break L6;
                } else {
                  L7: {
                    var8 = this.field_Q[param3][var7.field_E];
                    if (var8 == null) {
                      break L7;
                    } else {
                      if (0 > var8.field_s) {
                        this.field_O[param3][var8.field_e] = null;
                        var8.field_s = 0;
                        break L7;
                      } else {
                        break L7;
                      }
                    }
                  }
                  this.field_Q[param3][var7.field_E] = var7;
                  break L6;
                }
              }
              this.field_m.field_j.a(var7, 3);
              this.field_O[param3][param2] = var7;
              return;
            } else {
              return;
            }
          } else {
            return;
          }
        }
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
        var8 = Kickabout.field_G;
        try {
          L0: {
            L1: {
              if (!this.field_k.f()) {
                break L1;
              } else {
                var4_int = this.field_p * this.field_k.field_h / uh.field_i;
                L2: while (true) {
                  var5 = (long)var4_int * (long)param2 + this.field_D;
                  if (this.field_P - var5 < 0L) {
                    var7 = (int)((-1L + (long)var4_int + (this.field_P + -this.field_D)) / (long)var4_int);
                    this.field_D = this.field_D + (long)var7 * (long)var4_int;
                    this.field_m.a(param0, param1, var7);
                    param1 = param1 + var7;
                    this.e(4204);
                    param2 = param2 - var7;
                    if (!this.field_k.f()) {
                      break L1;
                    } else {
                      continue L2;
                    }
                  } else {
                    this.field_D = var5;
                    break L1;
                  }
                }
              }
            }
            this.field_m.a(param0, param1, param2);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var4 = decompiledCaughtException;
            stackOut_9_0 = (RuntimeException) (var4);
            stackOut_9_1 = new StringBuilder().append("ru.E(");
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
          throw nb.a((Throwable) ((Object) stackIn_12_0), stackIn_12_2 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final void a(boolean param0, da param1, boolean param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        try {
          L0: {
            var4_int = param1.field_y.field_i.length;
            if (!param0) {
              L1: {
                L2: {
                  if (!param2) {
                    break L2;
                  } else {
                    if (!param1.field_y.field_g) {
                      break L2;
                    } else {
                      var6 = -param1.field_y.field_h + (var4_int + var4_int);
                      var4_int = var4_int << 8;
                      var5 = (int)((long)this.field_s[param1.field_q] * (long)var6 >> 1798373126);
                      if (var5 >= var4_int) {
                        var5 = var4_int + var4_int - (1 - -var5);
                        param1.field_F.a(true);
                        break L1;
                      } else {
                        break L1;
                      }
                    }
                  }
                }
                var5 = (int)((long)this.field_s[param1.field_q] * (long)var4_int >> -726024122);
                break L1;
              }
              param1.field_F.i(var5);
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
            stackOut_10_0 = (RuntimeException) (var4);
            stackOut_10_1 = new StringBuilder().append("ru.NA(").append(param0).append(',');
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param1 == null) {
              stackOut_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackOut_12_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L3;
            } else {
              stackOut_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackOut_11_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L3;
            }
          }
          throw nb.a((Throwable) ((Object) stackIn_13_0), stackIn_13_2 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final synchronized boolean a(int param0, int param1, sj param2, rj param3, qm param4) {
        RuntimeException var6 = null;
        int var6_int = 0;
        Object var7 = null;
        hw var8 = null;
        int var9 = 0;
        jk var10 = null;
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
        var11 = Kickabout.field_G;
        try {
          L0: {
            L1: {
              param4.b();
              var6_int = 1;
              var7 = null;
              if (param1 <= 0) {
                break L1;
              } else {
                var7 = new int[]{param1};
                break L1;
              }
            }
            L2: {
              if (param0 == 1) {
                break L2;
              } else {
                this.field_m = (pp) null;
                break L2;
              }
            }
            var8 = (hw) ((Object) param4.field_f.b(param0 + -1));
            L3: while (true) {
              if (var8 == null) {
                L4: {
                  if (var6_int == 0) {
                    break L4;
                  } else {
                    param4.a();
                    break L4;
                  }
                }
                stackOut_18_0 = var6_int;
                stackIn_19_0 = stackOut_18_0;
                break L0;
              } else {
                L5: {
                  var9 = (int)var8.field_a;
                  var10 = (jk) ((Object) this.field_w.a(true, (long)var9));
                  if (var10 != null) {
                    break L5;
                  } else {
                    var10 = jr.a(param2, var9, 116);
                    if (var10 != null) {
                      this.field_w.a(var10, param0 ^ 124, (long)var9);
                      break L5;
                    } else {
                      var6_int = 0;
                      break L5;
                    }
                  }
                }
                L6: {
                  if (var10 == null) {
                    break L6;
                  } else {
                    if (!var10.a(param3, (int[]) (var7), (byte) 123, var8.field_g)) {
                      var6_int = 0;
                      break L6;
                    } else {
                      break L6;
                    }
                  }
                }
                var8 = (hw) ((Object) param4.field_f.a(param0 ^ -2));
                continue L3;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var6 = decompiledCaughtException;
            stackOut_20_0 = (RuntimeException) (var6);
            stackOut_20_1 = new StringBuilder().append("ru.CA(").append(param0).append(',').append(param1).append(',');
            stackIn_22_0 = stackOut_20_0;
            stackIn_22_1 = stackOut_20_1;
            stackIn_21_0 = stackOut_20_0;
            stackIn_21_1 = stackOut_20_1;
            if (param2 == null) {
              stackOut_22_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackOut_22_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackOut_22_2 = "null";
              stackIn_23_0 = stackOut_22_0;
              stackIn_23_1 = stackOut_22_1;
              stackIn_23_2 = stackOut_22_2;
              break L7;
            } else {
              stackOut_21_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackOut_21_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackOut_21_2 = "{...}";
              stackIn_23_0 = stackOut_21_0;
              stackIn_23_1 = stackOut_21_1;
              stackIn_23_2 = stackOut_21_2;
              break L7;
            }
          }
          L8: {
            stackOut_23_0 = (RuntimeException) ((Object) stackIn_23_0);
            stackOut_23_1 = ((StringBuilder) (Object) stackIn_23_1).append(stackIn_23_2).append(',');
            stackIn_25_0 = stackOut_23_0;
            stackIn_25_1 = stackOut_23_1;
            stackIn_24_0 = stackOut_23_0;
            stackIn_24_1 = stackOut_23_1;
            if (param3 == null) {
              stackOut_25_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackOut_25_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackOut_25_2 = "null";
              stackIn_26_0 = stackOut_25_0;
              stackIn_26_1 = stackOut_25_1;
              stackIn_26_2 = stackOut_25_2;
              break L8;
            } else {
              stackOut_24_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackOut_24_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackOut_24_2 = "{...}";
              stackIn_26_0 = stackOut_24_0;
              stackIn_26_1 = stackOut_24_1;
              stackIn_26_2 = stackOut_24_2;
              break L8;
            }
          }
          L9: {
            stackOut_26_0 = (RuntimeException) ((Object) stackIn_26_0);
            stackOut_26_1 = ((StringBuilder) (Object) stackIn_26_1).append(stackIn_26_2).append(',');
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
              break L9;
            } else {
              stackOut_27_0 = (RuntimeException) ((Object) stackIn_27_0);
              stackOut_27_1 = (StringBuilder) ((Object) stackIn_27_1);
              stackOut_27_2 = "{...}";
              stackIn_29_0 = stackOut_27_0;
              stackIn_29_1 = stackOut_27_1;
              stackIn_29_2 = stackOut_27_2;
              break L9;
            }
          }
          throw nb.a((Throwable) ((Object) stackIn_29_0), stackIn_29_2 + ')');
        }
        return stackIn_19_0 != 0;
    }

    private final int a(boolean param0, da param1) {
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
              if (param0) {
                break L1;
              } else {
                this.field_m = (pp) null;
                break L1;
              }
            }
            var3_int = this.field_E[param1.field_q];
            if (var3_int >= 8192) {
              stackOut_5_0 = 16384 + -((-var3_int + 16384) * (128 + -param1.field_A) + 32 >> 57710118);
              stackIn_6_0 = stackOut_5_0;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackOut_3_0 = 32 + var3_int * param1.field_A >> 1767358470;
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
            stackOut_7_1 = new StringBuilder().append("ru.DA(").append(param0).append(',');
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param1 == null) {
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
          throw nb.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0;
        } else {
          return stackIn_6_0;
        }
    }

    private final void f(int param0, int param1) {
        da var3 = null;
        int var4 = 0;
        L0: {
          var4 = Kickabout.field_G;
          if (param1 == 100) {
            break L0;
          } else {
            this.a(15, 115, (byte) 81);
            break L0;
          }
        }
        var3 = (da) ((Object) this.field_m.field_j.g(24009));
        L1: while (true) {
          if (var3 == null) {
            return;
          } else {
            L2: {
              L3: {
                if (param0 < 0) {
                  break L3;
                } else {
                  if (var3.field_q == param0) {
                    break L3;
                  } else {
                    break L2;
                  }
                }
              }
              L4: {
                if (var3.field_F != null) {
                  L5: {
                    var3.field_F.e(uh.field_i / 100);
                    if (!var3.field_F.n()) {
                      break L5;
                    } else {
                      this.field_m.field_i.a(var3.field_F);
                      break L5;
                    }
                  }
                  var3.a(true);
                  break L4;
                } else {
                  break L4;
                }
              }
              L6: {
                if (0 <= var3.field_s) {
                  break L6;
                } else {
                  this.field_O[var3.field_q][var3.field_e] = null;
                  break L6;
                }
              }
              var3.c((byte) -109);
              break L2;
            }
            var3 = (da) ((Object) this.field_m.field_j.c(33));
            continue L1;
          }
        }
    }

    private final void b(int param0, int param1) {
        int var4 = 0;
        var4 = Kickabout.field_G;
        if ((param0 ^ -1) <= -1) {
          L0: {
            this.field_y[param0] = 12800;
            if (param1 > 66) {
              break L0;
            } else {
              this.e(-112, 41, 103);
              break L0;
            }
          }
          this.field_E[param0] = 8192;
          this.field_A[param0] = 16383;
          this.field_v[param0] = 8192;
          this.field_G[param0] = 0;
          this.field_B[param0] = 8192;
          this.a(-1, param0);
          this.e(-28723, param0);
          this.field_i[param0] = 0;
          this.field_z[param0] = 32767;
          this.field_j[param0] = 256;
          this.field_s[param0] = 0;
          this.c(param0, 8192, 110);
          return;
        } else {
          param0 = 0;
          L1: while (true) {
            if (16 <= param0) {
              return;
            } else {
              this.b(param0, 73);
              param0++;
              continue L1;
            }
          }
        }
    }

    final boolean a(int param0, int param1, int param2, da param3, int[] param4) {
        RuntimeException var6 = null;
        int var6_int = 0;
        gl var7 = null;
        int var8 = 0;
        double var9 = 0.0;
        int var11 = 0;
        int stackIn_10_0 = 0;
        int stackIn_51_0 = 0;
        int stackIn_65_0 = 0;
        int stackIn_67_0 = 0;
        RuntimeException stackIn_69_0 = null;
        StringBuilder stackIn_69_1 = null;
        RuntimeException stackIn_70_0 = null;
        StringBuilder stackIn_70_1 = null;
        RuntimeException stackIn_71_0 = null;
        StringBuilder stackIn_71_1 = null;
        String stackIn_71_2 = null;
        RuntimeException stackIn_72_0 = null;
        StringBuilder stackIn_72_1 = null;
        RuntimeException stackIn_73_0 = null;
        StringBuilder stackIn_73_1 = null;
        RuntimeException stackIn_74_0 = null;
        StringBuilder stackIn_74_1 = null;
        String stackIn_74_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_9_0 = 0;
        int stackOut_66_0 = 0;
        int stackOut_64_0 = 0;
        int stackOut_50_0 = 0;
        RuntimeException stackOut_68_0 = null;
        StringBuilder stackOut_68_1 = null;
        RuntimeException stackOut_70_0 = null;
        StringBuilder stackOut_70_1 = null;
        String stackOut_70_2 = null;
        RuntimeException stackOut_69_0 = null;
        StringBuilder stackOut_69_1 = null;
        String stackOut_69_2 = null;
        RuntimeException stackOut_71_0 = null;
        StringBuilder stackOut_71_1 = null;
        RuntimeException stackOut_73_0 = null;
        StringBuilder stackOut_73_1 = null;
        String stackOut_73_2 = null;
        RuntimeException stackOut_72_0 = null;
        StringBuilder stackOut_72_1 = null;
        String stackOut_72_2 = null;
        var11 = Kickabout.field_G;
        try {
          L0: {
            L1: {
              param3.field_B = uh.field_i / 100;
              if (-1 < (param3.field_s ^ -1)) {
                break L1;
              } else {
                L2: {
                  if (param3.field_F == null) {
                    break L2;
                  } else {
                    if (!param3.field_F.f()) {
                      break L1;
                    } else {
                      break L2;
                    }
                  }
                }
                L3: {
                  param3.a(true);
                  param3.c((byte) -109);
                  if (0 >= param3.field_E) {
                    break L3;
                  } else {
                    if (this.field_Q[param3.field_q][param3.field_E] == param3) {
                      this.field_Q[param3.field_q][param3.field_E] = null;
                      break L3;
                    } else {
                      return true;
                    }
                  }
                }
                stackOut_9_0 = 1;
                stackIn_10_0 = stackOut_9_0;
                decompiledRegionSelector0 = 0;
                break L0;
              }
            }
            L4: {
              var6_int = param3.field_p;
              if (-1 > (var6_int ^ -1)) {
                L5: {
                  var6_int = var6_int - (int)(16.0 * Math.pow(2.0, 0.0004921259842519685 * (double)this.field_B[param3.field_q]) + 0.5);
                  if ((var6_int ^ -1) > -1) {
                    var6_int = 0;
                    break L5;
                  } else {
                    break L5;
                  }
                }
                param3.field_p = var6_int;
                break L4;
              } else {
                break L4;
              }
            }
            L6: {
              param3.field_F.h(this.a(param3, -5));
              var7 = param3.field_j;
              var8 = 0;
              param3.field_w = param3.field_w + 1;
              param3.field_z = param3.field_z + var7.field_h;
              var9 = 0.000005086263020833333 * (double)((param3.field_p * param3.field_n >> 1051750892) + (param3.field_e + -60 << 2077086536));
              if (var7.field_n <= 0) {
                break L6;
              } else {
                L7: {
                  if (var7.field_g <= 0) {
                    param3.field_f = param3.field_f + 128;
                    break L7;
                  } else {
                    param3.field_f = param3.field_f + (int)(128.0 * Math.pow(2.0, var9 * (double)var7.field_g) + 0.5);
                    break L7;
                  }
                }
                if (819200 > param3.field_f * var7.field_n) {
                  break L6;
                } else {
                  var8 = 1;
                  break L6;
                }
              }
            }
            L8: {
              if (var7.field_m == null) {
                break L8;
              } else {
                L9: {
                  if (0 >= var7.field_e) {
                    param3.field_v = param3.field_v + 128;
                    break L9;
                  } else {
                    param3.field_v = param3.field_v + (int)(128.0 * Math.pow(2.0, var9 * (double)var7.field_e) + 0.5);
                    break L9;
                  }
                }
                L10: while (true) {
                  L11: {
                    if ((var7.field_m.length - 2 ^ -1) >= (param3.field_t ^ -1)) {
                      break L11;
                    } else {
                      if (param3.field_v <= (var7.field_m[param3.field_t + 2] << -1461851032 & 65280)) {
                        break L11;
                      } else {
                        param3.field_t = param3.field_t + 2;
                        continue L10;
                      }
                    }
                  }
                  if (var7.field_m.length - 2 != param3.field_t) {
                    break L8;
                  } else {
                    if (var7.field_m[1 + param3.field_t] == 0) {
                      var8 = 1;
                      break L8;
                    } else {
                      break L8;
                    }
                  }
                }
              }
            }
            L12: {
              if (-1 < (param3.field_s ^ -1)) {
                break L12;
              } else {
                if (null == var7.field_b) {
                  break L12;
                } else {
                  if ((this.field_i[param3.field_q] & 1) != 0) {
                    break L12;
                  } else {
                    L13: {
                      if (param3.field_E < 0) {
                        break L13;
                      } else {
                        if (param3 != this.field_Q[param3.field_q][param3.field_E]) {
                          break L13;
                        } else {
                          break L12;
                        }
                      }
                    }
                    L14: {
                      if ((var7.field_l ^ -1) < -1) {
                        param3.field_s = param3.field_s + (int)(Math.pow(2.0, (double)var7.field_l * var9) * 128.0 + 0.5);
                        break L14;
                      } else {
                        param3.field_s = param3.field_s + 128;
                        break L14;
                      }
                    }
                    L15: while (true) {
                      L16: {
                        if ((-2 + var7.field_b.length ^ -1) >= (param3.field_l ^ -1)) {
                          break L16;
                        } else {
                          if ((var7.field_b[param3.field_l + 2] << 107342216 & 65280 ^ -1) <= (param3.field_s ^ -1)) {
                            break L16;
                          } else {
                            param3.field_l = param3.field_l + 2;
                            continue L15;
                          }
                        }
                      }
                      if (param3.field_l == -2 + var7.field_b.length) {
                        var8 = 1;
                        break L12;
                      } else {
                        break L12;
                      }
                    }
                  }
                }
              }
            }
            if (param0 < -26) {
              if (var8 == 0) {
                param3.field_F.a(param3.field_B, this.b(55, param3), this.a(true, param3));
                stackOut_66_0 = 0;
                stackIn_67_0 = stackOut_66_0;
                decompiledRegionSelector0 = 3;
                break L0;
              } else {
                L17: {
                  param3.field_F.e(param3.field_B);
                  if (param4 == null) {
                    param3.field_F.a(param1);
                    break L17;
                  } else {
                    param3.field_F.a(param4, param2, param1);
                    break L17;
                  }
                }
                L18: {
                  if (param3.field_F.n()) {
                    this.field_m.field_i.a(param3.field_F);
                    break L18;
                  } else {
                    break L18;
                  }
                }
                L19: {
                  param3.a(true);
                  if (0 > param3.field_s) {
                    break L19;
                  } else {
                    param3.c((byte) -109);
                    if (-1 <= (param3.field_E ^ -1)) {
                      break L19;
                    } else {
                      if (param3 == this.field_Q[param3.field_q][param3.field_E]) {
                        this.field_Q[param3.field_q][param3.field_E] = null;
                        break L19;
                      } else {
                        break L19;
                      }
                    }
                  }
                }
                stackOut_64_0 = 1;
                stackIn_65_0 = stackOut_64_0;
                decompiledRegionSelector0 = 2;
                break L0;
              }
            } else {
              stackOut_50_0 = 1;
              stackIn_51_0 = stackOut_50_0;
              decompiledRegionSelector0 = 1;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L20: {
            var6 = decompiledCaughtException;
            stackOut_68_0 = (RuntimeException) (var6);
            stackOut_68_1 = new StringBuilder().append("ru.K(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_70_0 = stackOut_68_0;
            stackIn_70_1 = stackOut_68_1;
            stackIn_69_0 = stackOut_68_0;
            stackIn_69_1 = stackOut_68_1;
            if (param3 == null) {
              stackOut_70_0 = (RuntimeException) ((Object) stackIn_70_0);
              stackOut_70_1 = (StringBuilder) ((Object) stackIn_70_1);
              stackOut_70_2 = "null";
              stackIn_71_0 = stackOut_70_0;
              stackIn_71_1 = stackOut_70_1;
              stackIn_71_2 = stackOut_70_2;
              break L20;
            } else {
              stackOut_69_0 = (RuntimeException) ((Object) stackIn_69_0);
              stackOut_69_1 = (StringBuilder) ((Object) stackIn_69_1);
              stackOut_69_2 = "{...}";
              stackIn_71_0 = stackOut_69_0;
              stackIn_71_1 = stackOut_69_1;
              stackIn_71_2 = stackOut_69_2;
              break L20;
            }
          }
          L21: {
            stackOut_71_0 = (RuntimeException) ((Object) stackIn_71_0);
            stackOut_71_1 = ((StringBuilder) (Object) stackIn_71_1).append(stackIn_71_2).append(',');
            stackIn_73_0 = stackOut_71_0;
            stackIn_73_1 = stackOut_71_1;
            stackIn_72_0 = stackOut_71_0;
            stackIn_72_1 = stackOut_71_1;
            if (param4 == null) {
              stackOut_73_0 = (RuntimeException) ((Object) stackIn_73_0);
              stackOut_73_1 = (StringBuilder) ((Object) stackIn_73_1);
              stackOut_73_2 = "null";
              stackIn_74_0 = stackOut_73_0;
              stackIn_74_1 = stackOut_73_1;
              stackIn_74_2 = stackOut_73_2;
              break L21;
            } else {
              stackOut_72_0 = (RuntimeException) ((Object) stackIn_72_0);
              stackOut_72_1 = (StringBuilder) ((Object) stackIn_72_1);
              stackOut_72_2 = "{...}";
              stackIn_74_0 = stackOut_72_0;
              stackIn_74_1 = stackOut_72_1;
              stackIn_74_2 = stackOut_72_2;
              break L21;
            }
          }
          throw nb.a((Throwable) ((Object) stackIn_74_0), stackIn_74_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_10_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_51_0 != 0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_65_0 != 0;
            } else {
              return stackIn_67_0 != 0;
            }
          }
        }
    }

    private final synchronized void a(byte param0, boolean param1) {
        this.field_k.c();
        if (param0 > -109) {
            field_C = 94;
        }
        this.field_x = null;
        this.a(param1, false);
    }

    private final void a(boolean param0, boolean param1) {
        int var3 = 0;
        int var4 = Kickabout.field_G;
        if (param0) {
            this.f(-1, 100);
        } else {
            this.g(-60, -1);
        }
        this.b(-1, 124);
        if (param1) {
            this.a(86, -61);
        }
        for (var3 = 0; (var3 ^ -1) > -17; var3++) {
            this.field_n[var3] = this.field_I[var3];
        }
        int var5 = 0;
        var3 = var5;
        while (-17 < (var5 ^ -1)) {
            this.field_q[var5] = qj.b(-128, this.field_I[var5]);
            var5++;
        }
    }

    private final void c(int param0, int param1, int param2) {
        this.field_L[param0] = param1;
        this.field_o[param0] = (int)(2097152.0 * Math.pow(2.0, 0.00054931640625 * (double)param1) + 0.5);
        if (param2 < 48) {
            this.b(-2);
        }
    }

    private final void g(int param0, int param1) {
        da var3 = null;
        int var4 = 0;
        var4 = Kickabout.field_G;
        var3 = (da) ((Object) this.field_m.field_j.g(24009));
        L0: while (true) {
          if (var3 == null) {
            L1: {
              if (param0 <= -8) {
                break L1;
              } else {
                this.d(4, -110);
                break L1;
              }
            }
            return;
          } else {
            L2: {
              L3: {
                if (0 > param1) {
                  break L3;
                } else {
                  if ((param1 ^ -1) == (var3.field_q ^ -1)) {
                    break L3;
                  } else {
                    break L2;
                  }
                }
              }
              if (0 <= var3.field_s) {
                break L2;
              } else {
                this.field_O[var3.field_q][var3.field_e] = null;
                var3.field_s = 0;
                break L2;
              }
            }
            var3 = (da) ((Object) this.field_m.field_j.c(33));
            continue L0;
          }
        }
    }

    final synchronized void d(int param0, int param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        L0: {
          var5 = Kickabout.field_G;
          if ((param0 ^ -1) <= param1) {
            this.field_J[param0] = param2;
            break L0;
          } else {
            var4 = 0;
            L1: while (true) {
              if ((var4 ^ -1) <= -17) {
                break L0;
              } else {
                this.field_J[var4] = param2;
                var4++;
                continue L1;
              }
            }
          }
        }
    }

    final synchronized void b(int param0) {
        if (param0 != 21404) {
            return;
        }
        this.a((byte) -114, true);
    }

    private final void e(int param0, int param1) {
        da var3 = null;
        int var4 = Kickabout.field_G;
        if (param0 != -28723) {
            this.field_J = (int[]) null;
        }
        if ((4 & this.field_i[param1]) != 0) {
            var3 = (da) ((Object) this.field_m.field_j.g(24009));
            while (var3 != null) {
                if (param1 == var3.field_q) {
                    var3.field_r = 0;
                }
                var3 = (da) ((Object) this.field_m.field_j.c(33));
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
            var6 = Kickabout.field_G;
            if (this.field_k.f()) {
              var2 = this.field_p * this.field_k.field_h / uh.field_i;
              L2: while (true) {
                var3 = this.field_D - -((long)param0 * (long)var2);
                if ((-var3 + this.field_P ^ -1L) > -1L) {
                  var5 = (int)((-1L + this.field_P - this.field_D - -(long)var2) / (long)var2);
                  this.field_D = this.field_D + (long)var2 * (long)var5;
                  param0 = param0 - var5;
                  this.field_m.a(var5);
                  this.e(4204);
                  if (this.field_k.f()) {
                    continue L2;
                  } else {
                    this.field_m.a(param0);
                    break L0;
                  }
                } else {
                  this.field_D = var3;
                  break L1;
                }
              }
            } else {
              break L1;
            }
          }
          this.field_m.a(param0);
          break L0;
        }
    }

    private final void a(int param0, int param1, int param2) {
        int var4 = 0;
        int var5 = Kickabout.field_G;
        if (param1 != 128) {
            return;
        }
        if (param0 != this.field_n[param2]) {
            this.field_n[param2] = param0;
            for (var4 = 0; var4 < 128; var4++) {
                this.field_Q[param2][var4] = null;
            }
        }
    }

    final static void a(boolean param0, byte param1) {
        Object var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int stackIn_7_0 = 0;
        int stackIn_11_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_13_1 = 0;
        int stackIn_17_0 = 0;
        int stackIn_17_1 = 0;
        int stackIn_18_0 = 0;
        int stackIn_18_1 = 0;
        int stackIn_19_0 = 0;
        int stackIn_19_1 = 0;
        int stackIn_19_2 = 0;
        int stackIn_23_0 = 0;
        int stackIn_24_0 = 0;
        int stackIn_25_0 = 0;
        int stackIn_25_1 = 0;
        int stackIn_48_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_6_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_12_1 = 0;
        int stackOut_11_0 = 0;
        int stackOut_11_1 = 0;
        int stackOut_16_0 = 0;
        int stackOut_16_1 = 0;
        int stackOut_18_0 = 0;
        int stackOut_18_1 = 0;
        int stackOut_18_2 = 0;
        int stackOut_17_0 = 0;
        int stackOut_17_1 = 0;
        int stackOut_17_2 = 0;
        int stackOut_22_0 = 0;
        int stackOut_24_0 = 0;
        int stackOut_24_1 = 0;
        int stackOut_23_0 = 0;
        int stackOut_23_1 = 0;
        int stackOut_47_0 = 0;
        int stackOut_46_0 = 0;
        var10 = Kickabout.field_G;
        try {
          L0: {
            if (wh.field_q) {
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L1: {
                var2 = null;
                var3 = b.c(-93, 359);
                if (param0) {
                  stackOut_6_0 = go.a(0, (byte) -56);
                  stackIn_7_0 = stackOut_6_0;
                  break L1;
                } else {
                  stackOut_5_0 = go.a(1344, (byte) -56);
                  stackIn_7_0 = stackOut_5_0;
                  break L1;
                }
              }
              L2: {
                var4 = stackIn_7_0;
                if (-1 != (rm.field_C ^ -1)) {
                  if ((rm.field_C ^ -1) != -2) {
                    if (-3 > (rm.field_C ^ -1)) {
                      if (-4 == (rm.field_C ^ -1)) {
                        if (!param0) {
                          var2 = kc.field_g[0];
                          var4 = var4 - (hw.field_i * 58 >> 1762924200);
                          break L2;
                        } else {
                          var2 = kc.field_g[1];
                          var4 = var4 - (hw.field_i * 97 >> 1610917896);
                          break L2;
                        }
                      } else {
                        break L2;
                      }
                    } else {
                      var4 = var4 - (55 * hw.field_i >> -1638033688);
                      var2 = kc.field_g[2];
                      if (param0) {
                        break L2;
                      } else {
                        var4 = var4 - (hw.field_i * 5 >> -1299977720);
                        break L2;
                      }
                    }
                  } else {
                    var4 = var4 - (hw.field_i * 62 >> -1443509912);
                    var2 = kc.field_g[3];
                    if (!param0) {
                      var4 = var4 - (5 * hw.field_i >> 1086683848);
                      break L2;
                    } else {
                      break L2;
                    }
                  }
                } else {
                  L3: {
                    if (ih.field_c == 0) {
                      L4: {
                        stackOut_10_0 = var4;
                        stackIn_12_0 = stackOut_10_0;
                        stackIn_11_0 = stackOut_10_0;
                        if (param0) {
                          stackOut_12_0 = stackIn_12_0;
                          stackOut_12_1 = 53;
                          stackIn_13_0 = stackOut_12_0;
                          stackIn_13_1 = stackOut_12_1;
                          break L4;
                        } else {
                          stackOut_11_0 = stackIn_11_0;
                          stackOut_11_1 = 64;
                          stackIn_13_0 = stackOut_11_0;
                          stackIn_13_1 = stackOut_11_1;
                          break L4;
                        }
                      }
                      var4 = stackIn_13_0 - (stackIn_13_1 * hw.field_i >> 291121768);
                      var2 = kc.field_g[6];
                      break L3;
                    } else {
                      break L3;
                    }
                  }
                  L5: {
                    if (ih.field_c == 1) {
                      L6: {
                        var2 = kc.field_g[5];
                        stackOut_16_0 = var4;
                        stackOut_16_1 = hw.field_i;
                        stackIn_18_0 = stackOut_16_0;
                        stackIn_18_1 = stackOut_16_1;
                        stackIn_17_0 = stackOut_16_0;
                        stackIn_17_1 = stackOut_16_1;
                        if (param0) {
                          stackOut_18_0 = stackIn_18_0;
                          stackOut_18_1 = stackIn_18_1;
                          stackOut_18_2 = 62;
                          stackIn_19_0 = stackOut_18_0;
                          stackIn_19_1 = stackOut_18_1;
                          stackIn_19_2 = stackOut_18_2;
                          break L6;
                        } else {
                          stackOut_17_0 = stackIn_17_0;
                          stackOut_17_1 = stackIn_17_1;
                          stackOut_17_2 = 72;
                          stackIn_19_0 = stackOut_17_0;
                          stackIn_19_1 = stackOut_17_1;
                          stackIn_19_2 = stackOut_17_2;
                          break L6;
                        }
                      }
                      var4 = stackIn_19_0 - (stackIn_19_1 * stackIn_19_2 >> -1574606584);
                      break L5;
                    } else {
                      break L5;
                    }
                  }
                  if (ih.field_c == 2) {
                    L7: {
                      var2 = kc.field_g[4];
                      stackOut_22_0 = var4;
                      stackIn_24_0 = stackOut_22_0;
                      stackIn_23_0 = stackOut_22_0;
                      if (param0) {
                        stackOut_24_0 = stackIn_24_0;
                        stackOut_24_1 = 68;
                        stackIn_25_0 = stackOut_24_0;
                        stackIn_25_1 = stackOut_24_1;
                        break L7;
                      } else {
                        stackOut_23_0 = stackIn_23_0;
                        stackOut_23_1 = 72;
                        stackIn_25_0 = stackOut_23_0;
                        stackIn_25_1 = stackOut_23_1;
                        break L7;
                      }
                    }
                    var4 = stackIn_25_0 - (stackIn_25_1 * hw.field_i >> -1481439768);
                    break L2;
                  } else {
                    break L2;
                  }
                }
              }
              L8: {
                if (!param0) {
                  break L8;
                } else {
                  if (3 != rm.field_C) {
                    break L8;
                  } else {
                    var5 = go.a(-87, (byte) -56);
                    var6 = 0;
                    L9: while (true) {
                      if ((var6 ^ -1) <= -6) {
                        break L8;
                      } else {
                        im.a(-12376, b.c(-121, (-5 + ge.field_k.field_o) * var6 + -32), var5, ge.field_k);
                        var6++;
                        continue L9;
                      }
                    }
                  }
                }
              }
              L10: {
                if ((ih.field_c ^ -1) == -3) {
                  L11: {
                    var5 = b.c(-105, -47);
                    var6 = b.c(param1 + 94, 892);
                    if (!param0) {
                      stackOut_47_0 = 0;
                      stackIn_48_0 = stackOut_47_0;
                      break L11;
                    } else {
                      stackOut_46_0 = 3;
                      stackIn_48_0 = stackOut_46_0;
                      break L11;
                    }
                  }
                  var7 = stackIn_48_0;
                  var8 = 0;
                  L12: while (true) {
                    if (5 <= var8) {
                      break L10;
                    } else {
                      var9 = go.a(var8 * 290 + -40, (byte) -56);
                      im.a(-12376, var5, var9, so.field_d[0 + var7]);
                      im.a(-12376, var6, var9, so.field_d[1 + var7]);
                      var8++;
                      continue L12;
                    }
                  }
                } else {
                  break L10;
                }
              }
              L13: {
                im.a(-12376, var3, var4, (ut) (var2));
                if (param1 == -114) {
                  break L13;
                } else {
                  field_M = (tf) null;
                  break L13;
                }
              }
              L14: {
                if (param0) {
                  break L14;
                } else {
                  if (3 != rm.field_C) {
                    break L14;
                  } else {
                    var5 = go.a(1384, (byte) -56);
                    var6 = 0;
                    L15: while (true) {
                      if ((var6 ^ -1) <= -6) {
                        break L14;
                      } else {
                        im.a(param1 + -12262, b.c(-126, var6 * (-5 + ge.field_k.field_o) + -32), var5, ge.field_k);
                        var6++;
                        continue L15;
                      }
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
          throw nb.a((Throwable) (var2), "ru.I(" + param0 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    private final void a(byte param0, int param1, int param2, int param3) {
        da var6 = null;
        int var7 = 0;
        da var8 = null;
        L0: {
          var7 = Kickabout.field_G;
          if (param0 <= -16) {
            break L0;
          } else {
            field_t = (String) null;
            break L0;
          }
        }
        var8 = this.field_O[param2][param1];
        if (var8 == null) {
          return;
        } else {
          L1: {
            this.field_O[param2][param1] = null;
            if ((this.field_i[param2] & 2) == 0) {
              var8.field_s = 0;
              break L1;
            } else {
              var6 = (da) ((Object) this.field_m.field_j.g(24009));
              L2: while (true) {
                if (var6 == null) {
                  break L1;
                } else {
                  L3: {
                    if (var6.field_q != var8.field_q) {
                      break L3;
                    } else {
                      if (0 <= var6.field_s) {
                        break L3;
                      } else {
                        if (var6 == var8) {
                          break L3;
                        } else {
                          var8.field_s = 0;
                          break L1;
                        }
                      }
                    }
                  }
                  var6 = (da) ((Object) this.field_m.field_j.c(33));
                  continue L2;
                }
              }
            }
          }
          return;
        }
    }

    private final void a(int param0, int param1, byte param2) {
        lq discarded$0 = null;
        this.field_I[param0] = param1;
        this.field_q[param0] = qj.b(param1, -128);
        this.a(param1, param2 ^ 164, param0);
        if (param2 != 36) {
            discarded$0 = this.c();
        }
    }

    final synchronized lq c() {
        return (lq) ((Object) this.field_m);
    }

    private final void a(int param0, int param1) {
        da var3 = null;
        int var4 = Kickabout.field_G;
        if (param0 != -1) {
            return;
        }
        if (!(0 == (2 & this.field_i[param1]))) {
            var3 = (da) ((Object) this.field_m.field_j.g(24009));
            while (var3 != null) {
                if (param1 == var3.field_q) {
                    if (this.field_O[param1][var3.field_e] == null) {
                        if (-1 < (var3.field_s ^ -1)) {
                            var3.field_s = 0;
                        }
                    }
                }
                var3 = (da) ((Object) this.field_m.field_j.c(33));
            }
        }
    }

    private final void e(int param0) {
        int var2 = 0;
        int var3 = 0;
        long var4 = 0L;
        int var6 = 0;
        int var7 = 0;
        L0: {
          var7 = Kickabout.field_G;
          if (param0 == 4204) {
            break L0;
          } else {
            this.f(-128, -34);
            break L0;
          }
        }
        L1: {
          var2 = this.field_K;
          var3 = this.field_H;
          var4 = this.field_P;
          if (this.field_x == null) {
            break L1;
          } else {
            if (this.field_N != var3) {
              break L1;
            } else {
              this.a(this.field_x, this.field_F, (byte) 101, this.field_r);
              this.e(4204);
              return;
            }
          }
        }
        L2: while (true) {
          if (this.field_H != var3) {
            L3: {
              this.field_H = var3;
              this.field_K = var2;
              this.field_P = var4;
              if (null == this.field_x) {
                break L3;
              } else {
                if ((this.field_N ^ -1) > (var3 ^ -1)) {
                  this.field_K = -1;
                  this.field_H = this.field_N;
                  this.field_P = this.field_k.e(this.field_H);
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
                if (this.field_k.field_e[var2] != var3) {
                  break L5;
                } else {
                  this.field_k.c(var2);
                  var6 = this.field_k.f(var2);
                  if (1 == var6) {
                    this.field_k.d();
                    this.field_k.b(var2);
                    if (!this.field_k.a()) {
                      break L5;
                    } else {
                      if (this.field_x == null) {
                        L6: {
                          if (!this.field_r) {
                            break L6;
                          } else {
                            if (var3 != 0) {
                              this.field_k.a(var4);
                              break L5;
                            } else {
                              break L6;
                            }
                          }
                        }
                        this.a(true, false);
                        this.field_k.c();
                        return;
                      } else {
                        this.a(this.field_r, 19134, this.field_x);
                        this.e(param0 ^ 0);
                        return;
                      }
                    }
                  } else {
                    L7: {
                      if ((var6 & 128) != 0) {
                        this.d(5, var6);
                        break L7;
                      } else {
                        break L7;
                      }
                    }
                    this.field_k.d(var2);
                    this.field_k.b(var2);
                    continue L4;
                  }
                }
              }
              var2 = this.field_k.g();
              var3 = this.field_k.field_e[var2];
              var4 = this.field_k.e(var3);
              continue L2;
            }
          }
        }
    }

    final boolean a(int param0, da param1) {
        RuntimeException var3 = null;
        int stackIn_8_0 = 0;
        int stackIn_10_0 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_9_0 = 0;
        int stackOut_7_0 = 0;
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
              if (param0 == -25102) {
                break L1;
              } else {
                this.field_m = (pp) null;
                break L1;
              }
            }
            if (param1.field_F != null) {
              stackOut_9_0 = 0;
              stackIn_10_0 = stackOut_9_0;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              L2: {
                if ((param1.field_s ^ -1) > -1) {
                  break L2;
                } else {
                  param1.c((byte) -109);
                  if (-1 <= (param1.field_E ^ -1)) {
                    break L2;
                  } else {
                    if (this.field_Q[param1.field_q][param1.field_E] != param1) {
                      break L2;
                    } else {
                      this.field_Q[param1.field_q][param1.field_E] = null;
                      return true;
                    }
                  }
                }
              }
              stackOut_7_0 = 1;
              stackIn_8_0 = stackOut_7_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) (var3);
            stackOut_11_1 = new StringBuilder().append("ru.W(").append(param0).append(',');
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param1 == null) {
              stackOut_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackOut_13_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L3;
            } else {
              stackOut_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackOut_12_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L3;
            }
          }
          throw nb.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_8_0 != 0;
        } else {
          return stackIn_10_0 != 0;
        }
    }

    private final int b(int param0, da param1) {
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        gl var10 = null;
        gl var11 = null;
        int stackIn_3_0 = 0;
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
        int stackOut_2_0 = 0;
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
            if (this.field_J[param1.field_q] == 0) {
              stackOut_2_0 = 0;
              stackIn_3_0 = stackOut_2_0;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L1: {
                var10 = param1.field_j;
                var11 = var10;
                var4 = this.field_A[param1.field_q] * this.field_y[param1.field_q] + 4096 >> -1467299603;
                var5 = 60 % ((param0 - -15) / 38);
                var4 = 16384 + var4 * var4 >> -1509700337;
                var4 = param1.field_C * var4 + 16384 >> 1193528111;
                var4 = this.field_u * var4 + 128 >> 1664478216;
                var4 = var4 * this.field_J[param1.field_q] + 128 >> 857214280;
                if (-1 > (var11.field_n ^ -1)) {
                  var4 = (int)(0.5 + (double)var4 * Math.pow(0.5, (double)var11.field_n * (0.00001953125 * (double)param1.field_f)));
                  break L1;
                } else {
                  break L1;
                }
              }
              L2: {
                if (var11.field_m == null) {
                  break L2;
                } else {
                  L3: {
                    var6 = param1.field_v;
                    var7 = var11.field_m[1 + param1.field_t];
                    if ((param1.field_t ^ -1) > (-2 + var11.field_m.length ^ -1)) {
                      var8 = var10.field_m[param1.field_t] << -1505635864 & 65280;
                      var9 = var11.field_m[param1.field_t + 2] << -575481944 & 65280;
                      var7 = var7 + (var6 + -var8) * (var11.field_m[param1.field_t + 3] - var7) / (var9 + -var8);
                      break L3;
                    } else {
                      break L3;
                    }
                  }
                  var4 = var4 * var7 + 32 >> 1079626310;
                  break L2;
                }
              }
              L4: {
                if ((param1.field_s ^ -1) >= -1) {
                  break L4;
                } else {
                  if (var11.field_b != null) {
                    L5: {
                      var6 = param1.field_s;
                      var7 = var11.field_b[param1.field_l - -1];
                      if (param1.field_l < var11.field_b.length + -2) {
                        var8 = (var10.field_b[param1.field_l] & 255) << -630973112;
                        var9 = (255 & var11.field_b[2 + param1.field_l]) << 1013398248;
                        var7 = var7 + (-var7 + var11.field_b[3 + param1.field_l]) * (var6 - var8) / (var9 + -var8);
                        break L5;
                      } else {
                        break L5;
                      }
                    }
                    var4 = var4 * var7 - -32 >> -771565818;
                    break L4;
                  } else {
                    break L4;
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
          L6: {
            var3 = decompiledCaughtException;
            stackOut_21_0 = (RuntimeException) (var3);
            stackOut_21_1 = new StringBuilder().append("ru.OA(").append(param0).append(',');
            stackIn_23_0 = stackOut_21_0;
            stackIn_23_1 = stackOut_21_1;
            stackIn_22_0 = stackOut_21_0;
            stackIn_22_1 = stackOut_21_1;
            if (param1 == null) {
              stackOut_23_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackOut_23_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackOut_23_2 = "null";
              stackIn_24_0 = stackOut_23_0;
              stackIn_24_1 = stackOut_23_1;
              stackIn_24_2 = stackOut_23_2;
              break L6;
            } else {
              stackOut_22_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackOut_22_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackOut_22_2 = "{...}";
              stackIn_24_0 = stackOut_22_0;
              stackIn_24_1 = stackOut_22_1;
              stackIn_24_2 = stackOut_22_2;
              break L6;
            }
          }
          throw nb.a((Throwable) ((Object) stackIn_24_0), stackIn_24_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          return stackIn_20_0;
        }
    }

    private final void b(int param0, int param1, int param2) {
        int discarded$0 = 0;
        this.field_v[param1] = param2;
        if (param0 < 20) {
            discarded$0 = this.d();
        }
    }

    public static void a(byte param0) {
        int var1 = -114 / ((34 - param0) / 59);
        field_t = null;
        field_l = null;
        field_M = null;
    }

    public ru() {
        this.field_E = new int[16];
        this.field_i = new int[16];
        this.field_Q = new da[16][128];
        this.field_z = new int[16];
        this.field_u = 256;
        this.field_s = new int[16];
        this.field_q = new int[16];
        this.field_I = new int[16];
        this.field_y = new int[16];
        this.field_A = new int[16];
        this.field_L = new int[16];
        this.field_p = 1000000;
        this.field_G = new int[16];
        this.field_O = new da[16][128];
        this.field_J = new int[16];
        this.field_n = new int[16];
        this.field_v = new int[16];
        this.field_B = new int[16];
        this.field_j = new int[16];
        this.field_o = new int[16];
        this.field_k = new rs();
        this.field_m = new pp((ru) (this));
        this.field_w = new kc(128);
        this.d(-1, -1, 256);
        this.a(true, false);
    }

    ru(ru param0) {
        this.field_E = new int[16];
        this.field_i = new int[16];
        this.field_Q = new da[16][128];
        this.field_z = new int[16];
        this.field_u = 256;
        this.field_s = new int[16];
        this.field_q = new int[16];
        this.field_I = new int[16];
        this.field_y = new int[16];
        this.field_A = new int[16];
        this.field_L = new int[16];
        this.field_p = 1000000;
        this.field_G = new int[16];
        this.field_O = new da[16][128];
        this.field_J = new int[16];
        this.field_n = new int[16];
        this.field_v = new int[16];
        this.field_B = new int[16];
        this.field_j = new int[16];
        this.field_o = new int[16];
        this.field_k = new rs();
        this.field_m = new pp((ru) (this));
        try {
            this.field_w = param0.field_w;
            this.d(-1, -1, 256);
            this.a(true, false);
        } catch (RuntimeException runtimeException) {
            throw nb.a((Throwable) ((Object) runtimeException), "ru.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_l = new Random();
        field_M = new tf();
        field_t = "Click or press F10 to open Quick Chat";
    }
}
