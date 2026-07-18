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
        RuntimeException runtimeException = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        try {
          L0: {
            if (param1 == 19134) {
              this.a(param2, true, (byte) 101, param0);
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            runtimeException = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) runtimeException;
            stackOut_4_1 = new StringBuilder().append("ru.HA(").append(param0).append(',').append(param1).append(',');
            stackIn_7_0 = stackOut_4_0;
            stackIn_7_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param2 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L1;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_8_0 = stackOut_5_0;
              stackIn_8_1 = stackOut_5_1;
              stackIn_8_2 = stackOut_5_2;
              break L1;
            }
          }
          throw nb.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + ')');
        }
    }

    final synchronized lq b() {
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
          throw nb.a((Throwable) (Object) var1, "ru.F()");
        }
        return (lq) (Object) stackIn_1_0;
    }

    private final void e(int param0, int param1, int param2) {
        try {
            if (param0 != 16) {
                ((ru) this).field_k = null;
            }
        } catch (RuntimeException runtimeException) {
            throw nb.a((Throwable) (Object) runtimeException, "ru.MA(" + param0 + ',' + param1 + ',' + param2 + ')');
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
        int stackOut_1_0 = 0;
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
            var3_int = (param0.field_n * param0.field_p >> -765265812) + param0.field_D;
            if (param1 == -5) {
              L1: {
                var3_int = var3_int + ((-8192 + ((ru) this).field_v[param0.field_q]) * ((ru) this).field_j[param0.field_q] >> 665747436);
                var4 = param0.field_j;
                if (var4.field_h <= 0) {
                  break L1;
                } else {
                  L2: {
                    if (var4.field_j > 0) {
                      break L2;
                    } else {
                      if (((ru) this).field_G[param0.field_q] <= 0) {
                        break L1;
                      } else {
                        break L2;
                      }
                    }
                  }
                  L3: {
                    var5 = var4.field_j << -2002369118;
                    var6 = var4.field_k << 1922130785;
                    if (~param0.field_w > ~var6) {
                      var5 = var5 * param0.field_w / var6;
                      break L3;
                    } else {
                      break L3;
                    }
                  }
                  var5 = var5 + (((ru) this).field_G[param0.field_q] >> 19891047);
                  var7 = Math.sin(0.01227184630308513 * (double)(511 & param0.field_z));
                  var3_int = var3_int + (int)(var7 * (double)var5);
                  break L1;
                }
              }
              L4: {
                var5 = (int)((double)(256 * param0.field_y.field_f) * Math.pow(2.0, 0.0003255208333333333 * (double)var3_int) / (double)uh.field_i + 0.5);
                if (1 > var5) {
                  stackOut_18_0 = 1;
                  stackIn_19_0 = stackOut_18_0;
                  break L4;
                } else {
                  stackOut_16_0 = var5;
                  stackIn_19_0 = stackOut_16_0;
                  break L4;
                }
              }
              break L0;
            } else {
              stackOut_1_0 = -5;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var3 = decompiledCaughtException;
            stackOut_20_0 = (RuntimeException) var3;
            stackOut_20_1 = new StringBuilder().append("ru.V(");
            stackIn_23_0 = stackOut_20_0;
            stackIn_23_1 = stackOut_20_1;
            stackIn_21_0 = stackOut_20_0;
            stackIn_21_1 = stackOut_20_1;
            if (param0 == null) {
              stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
              stackOut_23_1 = (StringBuilder) (Object) stackIn_23_1;
              stackOut_23_2 = "null";
              stackIn_24_0 = stackOut_23_0;
              stackIn_24_1 = stackOut_23_1;
              stackIn_24_2 = stackOut_23_2;
              break L5;
            } else {
              stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "{...}";
              stackIn_24_0 = stackOut_21_0;
              stackIn_24_1 = stackOut_21_1;
              stackIn_24_2 = stackOut_21_2;
              break L5;
            }
          }
          throw nb.a((Throwable) (Object) stackIn_24_0, stackIn_24_2 + ',' + param1 + ')');
        }
        return stackIn_19_0;
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
          throw nb.a((Throwable) (Object) var1, "ru.M()");
        }
        return stackIn_1_0;
    }

    final synchronized void c(int param0, int param1) {
        try {
            ((ru) this).field_p = param0;
            if (param1 != 107342216) {
                this.d(9, 30);
            }
        } catch (RuntimeException runtimeException) {
            throw nb.a((Throwable) (Object) runtimeException, "ru.S(" + param0 + ',' + param1 + ')');
        }
    }

    private final void a(int param0, int param1, byte param2, int param3) {
        try {
            if (param2 != -71) {
                int discarded$0 = this.a(false, (da) null);
            }
        } catch (RuntimeException runtimeException) {
            throw nb.a((Throwable) (Object) runtimeException, "ru.U(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final synchronized void b(int param0, int param1, byte param2) {
        RuntimeException var4 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param2 <= -48) {
                break L1;
              } else {
                ((ru) this).field_A = null;
                break L1;
              }
            }
            this.a(param0, param1, (byte) 36);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw nb.a((Throwable) (Object) var4, "ru.JA(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    private final void d(int param0, int param1) {
        RuntimeException var3 = null;
        int var3_int = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var8 = Kickabout.field_G;
        try {
          L0: {
            if (param0 == 5) {
              var3_int = 240 & param1;
              if (var3_int == 128) {
                var4 = 15 & param1;
                var5 = 127 & param1 >> 2052715592;
                var6 = param1 >> -1402343152 & 127;
                this.a((byte) -119, var5, var4, var6);
                return;
              } else {
                if (var3_int == 144) {
                  L1: {
                    L2: {
                      var4 = 15 & param1;
                      var5 = (param1 & 32618) >> -1176235928;
                      var6 = param1 >> -1162534896 & 127;
                      if (var6 <= 0) {
                        break L2;
                      } else {
                        this.a(32, var6, var5, var4);
                        if (var8 == 0) {
                          break L1;
                        } else {
                          break L2;
                        }
                      }
                    }
                    this.a((byte) -44, var5, var4, 64);
                    break L1;
                  }
                  return;
                } else {
                  if (160 == var3_int) {
                    var4 = param1 & 15;
                    var5 = param1 >> 481587048 & 127;
                    var6 = (param1 & 8376783) >> 1320043472;
                    this.a(var4, var5, (byte) -71, var6);
                    return;
                  } else {
                    if (var3_int != 176) {
                      if (192 != var3_int) {
                        if (var3_int != 208) {
                          if (var3_int != 224) {
                            var3_int = param1 & 255;
                            if (255 == var3_int) {
                              this.a(true, false);
                              decompiledRegionSelector0 = 0;
                              break L0;
                            } else {
                              decompiledRegionSelector0 = 1;
                              break L0;
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
                        this.a(((ru) this).field_q[var4] + var5, param0 ^ 133, var4);
                        return;
                      }
                    } else {
                      L3: {
                        var4 = param1 & 15;
                        var5 = 127 & param1 >> 1208936424;
                        var6 = (8349360 & param1) >> -1014730608;
                        if (var5 != 0) {
                          break L3;
                        } else {
                          ((ru) this).field_q[var4] = qj.b(((ru) this).field_q[var4], -2080769) - -(var6 << 999007022);
                          break L3;
                        }
                      }
                      L4: {
                        if (var5 != 32) {
                          break L4;
                        } else {
                          ((ru) this).field_q[var4] = qj.b(-16257, ((ru) this).field_q[var4]) - -(var6 << -2085123321);
                          break L4;
                        }
                      }
                      L5: {
                        if (var5 == 1) {
                          ((ru) this).field_G[var4] = qj.b(((ru) this).field_G[var4], -16257) - -(var6 << -1605068185);
                          break L5;
                        } else {
                          break L5;
                        }
                      }
                      L6: {
                        if (33 == var5) {
                          ((ru) this).field_G[var4] = var6 + qj.b(-128, ((ru) this).field_G[var4]);
                          break L6;
                        } else {
                          break L6;
                        }
                      }
                      L7: {
                        if (var5 != 5) {
                          break L7;
                        } else {
                          ((ru) this).field_B[var4] = (var6 << 1560857671) + qj.b(((ru) this).field_B[var4], -16257);
                          break L7;
                        }
                      }
                      L8: {
                        if (var5 != 37) {
                          break L8;
                        } else {
                          ((ru) this).field_B[var4] = var6 + qj.b(((ru) this).field_B[var4], -128);
                          break L8;
                        }
                      }
                      L9: {
                        if (var5 != 7) {
                          break L9;
                        } else {
                          ((ru) this).field_y[var4] = (var6 << -292546969) + qj.b(((ru) this).field_y[var4], -16257);
                          break L9;
                        }
                      }
                      L10: {
                        if (var5 != 39) {
                          break L10;
                        } else {
                          ((ru) this).field_y[var4] = var6 + qj.b(-128, ((ru) this).field_y[var4]);
                          break L10;
                        }
                      }
                      L11: {
                        if (10 == var5) {
                          ((ru) this).field_E[var4] = (var6 << -1658210649) + qj.b(((ru) this).field_E[var4], -16257);
                          break L11;
                        } else {
                          break L11;
                        }
                      }
                      L12: {
                        if (var5 == 42) {
                          ((ru) this).field_E[var4] = qj.b(((ru) this).field_E[var4], -128) - -var6;
                          break L12;
                        } else {
                          break L12;
                        }
                      }
                      L13: {
                        if (var5 != 11) {
                          break L13;
                        } else {
                          ((ru) this).field_A[var4] = qj.b(((ru) this).field_A[var4], -16257) + (var6 << -562223033);
                          break L13;
                        }
                      }
                      L14: {
                        if (var5 != 43) {
                          break L14;
                        } else {
                          ((ru) this).field_A[var4] = var6 + qj.b(-128, ((ru) this).field_A[var4]);
                          break L14;
                        }
                      }
                      L15: {
                        if (var5 != 64) {
                          break L15;
                        } else {
                          L16: {
                            if (var6 >= 64) {
                              break L16;
                            } else {
                              ((ru) this).field_i[var4] = qj.b(((ru) this).field_i[var4], -2);
                              if (var8 == 0) {
                                break L15;
                              } else {
                                break L16;
                              }
                            }
                          }
                          ((ru) this).field_i[var4] = hf.a(((ru) this).field_i[var4], 1);
                          break L15;
                        }
                      }
                      L17: {
                        if (65 != var5) {
                          break L17;
                        } else {
                          L18: {
                            if (var6 < 64) {
                              break L18;
                            } else {
                              ((ru) this).field_i[var4] = hf.a(((ru) this).field_i[var4], 2);
                              if (var8 == 0) {
                                break L17;
                              } else {
                                break L18;
                              }
                            }
                          }
                          this.a(-1, var4);
                          ((ru) this).field_i[var4] = qj.b(((ru) this).field_i[var4], -3);
                          break L17;
                        }
                      }
                      L19: {
                        if (var5 == 99) {
                          ((ru) this).field_z[var4] = qj.b(((ru) this).field_z[var4], 127) - -(var6 << -592884281);
                          break L19;
                        } else {
                          break L19;
                        }
                      }
                      L20: {
                        if (var5 != 98) {
                          break L20;
                        } else {
                          ((ru) this).field_z[var4] = qj.b(16256, ((ru) this).field_z[var4]) - -var6;
                          break L20;
                        }
                      }
                      L21: {
                        if (var5 != 101) {
                          break L21;
                        } else {
                          ((ru) this).field_z[var4] = 16384 - (-qj.b(((ru) this).field_z[var4], 127) - (var6 << 1591088487));
                          break L21;
                        }
                      }
                      L22: {
                        if (var5 == 100) {
                          ((ru) this).field_z[var4] = var6 + (16384 + qj.b(16256, ((ru) this).field_z[var4]));
                          break L22;
                        } else {
                          break L22;
                        }
                      }
                      L23: {
                        if (120 != var5) {
                          break L23;
                        } else {
                          this.f(var4, 100);
                          break L23;
                        }
                      }
                      L24: {
                        if (121 != var5) {
                          break L24;
                        } else {
                          this.b(var4, param0 ^ 87);
                          break L24;
                        }
                      }
                      L25: {
                        if (var5 == 123) {
                          this.g(-9, var4);
                          break L25;
                        } else {
                          break L25;
                        }
                      }
                      L26: {
                        if (var5 != 6) {
                          break L26;
                        } else {
                          var7 = ((ru) this).field_z[var4];
                          if (var7 == 16384) {
                            ((ru) this).field_j[var4] = (var6 << 545483719) + qj.b(-16257, ((ru) this).field_j[var4]);
                            break L26;
                          } else {
                            break L26;
                          }
                        }
                      }
                      L27: {
                        if (var5 != 38) {
                          break L27;
                        } else {
                          var7 = ((ru) this).field_z[var4];
                          if (var7 != 16384) {
                            break L27;
                          } else {
                            ((ru) this).field_j[var4] = qj.b(-128, ((ru) this).field_j[var4]) + var6;
                            break L27;
                          }
                        }
                      }
                      L28: {
                        if (var5 != 16) {
                          break L28;
                        } else {
                          ((ru) this).field_s[var4] = (var6 << 553211175) + qj.b(-16257, ((ru) this).field_s[var4]);
                          break L28;
                        }
                      }
                      L29: {
                        if (48 != var5) {
                          break L29;
                        } else {
                          ((ru) this).field_s[var4] = var6 + qj.b(-128, ((ru) this).field_s[var4]);
                          break L29;
                        }
                      }
                      L30: {
                        if (var5 != 81) {
                          break L30;
                        } else {
                          L31: {
                            if (64 > var6) {
                              break L31;
                            } else {
                              ((ru) this).field_i[var4] = hf.a(((ru) this).field_i[var4], 4);
                              if (var8 == 0) {
                                break L30;
                              } else {
                                break L31;
                              }
                            }
                          }
                          this.e(-28723, var4);
                          ((ru) this).field_i[var4] = qj.b(((ru) this).field_i[var4], -5);
                          break L30;
                        }
                      }
                      L32: {
                        if (17 != var5) {
                          break L32;
                        } else {
                          this.c(var4, (var6 << 1462295559) + (((ru) this).field_L[var4] & -16257), 103);
                          break L32;
                        }
                      }
                      L33: {
                        if (var5 != 49) {
                          break L33;
                        } else {
                          this.c(var4, (-128 & ((ru) this).field_L[var4]) - -var6, 110);
                          break L33;
                        }
                      }
                      return;
                    }
                  }
                }
              }
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw nb.a((Throwable) (Object) var3, "ru.Q(" + param0 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    private final synchronized void a(qm param0, boolean param1, byte param2, boolean param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        var7 = Kickabout.field_G;
        try {
          L0: {
            L1: {
              this.a((byte) -123, param1);
              ((ru) this).field_k.a(param0.field_e);
              ((ru) this).field_D = 0L;
              ((ru) this).field_r = param3;
              if (param2 == 101) {
                break L1;
              } else {
                ((ru) this).field_N = 27;
                break L1;
              }
            }
            var5_int = ((ru) this).field_k.e();
            var6 = 0;
            L2: while (true) {
              L3: {
                L4: {
                  if (var6 >= var5_int) {
                    break L4;
                  } else {
                    ((ru) this).field_k.c(var6);
                    ((ru) this).field_k.d(var6);
                    ((ru) this).field_k.b(var6);
                    var6++;
                    if (var7 != 0) {
                      break L3;
                    } else {
                      if (var7 == 0) {
                        continue L2;
                      } else {
                        break L4;
                      }
                    }
                  }
                }
                ((ru) this).field_K = ((ru) this).field_k.g();
                ((ru) this).field_H = ((ru) this).field_k.field_e[((ru) this).field_K];
                ((ru) this).field_P = ((ru) this).field_k.e(((ru) this).field_H);
                break L3;
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var5 = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) var5;
            stackOut_12_1 = new StringBuilder().append("ru.EA(");
            stackIn_15_0 = stackOut_12_0;
            stackIn_15_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param0 == null) {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L5;
            } else {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "{...}";
              stackIn_16_0 = stackOut_13_0;
              stackIn_16_1 = stackOut_13_1;
              stackIn_16_2 = stackOut_13_2;
              break L5;
            }
          }
          throw nb.a((Throwable) (Object) stackIn_16_0, stackIn_16_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    private final void a(int param0, int param1, int param2, int param3) {
        RuntimeException var5 = null;
        da var5_ref = null;
        jk var5_ref2 = null;
        to var6 = null;
        int var6_int = 0;
        da var7 = null;
        da var8 = null;
        int var9 = 0;
        da stackIn_7_0 = null;
        Object stackIn_17_0 = null;
        Object stackIn_30_0 = null;
        int stackIn_30_1 = 0;
        da stackIn_30_2 = null;
        Object stackIn_32_0 = null;
        int stackIn_32_1 = 0;
        da stackIn_32_2 = null;
        Object stackIn_34_0 = null;
        int stackIn_34_1 = 0;
        da stackIn_34_2 = null;
        Object stackIn_35_0 = null;
        int stackIn_35_1 = 0;
        da stackIn_35_2 = null;
        int stackIn_35_3 = 0;
        RuntimeException decompiledCaughtException = null;
        da stackOut_6_0 = null;
        gn stackOut_16_0 = null;
        Object stackOut_29_0 = null;
        int stackOut_29_1 = 0;
        da stackOut_29_2 = null;
        Object stackOut_34_0 = null;
        int stackOut_34_1 = 0;
        da stackOut_34_2 = null;
        int stackOut_34_3 = 0;
        Object stackOut_30_0 = null;
        int stackOut_30_1 = 0;
        da stackOut_30_2 = null;
        Object stackOut_32_0 = null;
        int stackOut_32_1 = 0;
        da stackOut_32_2 = null;
        int stackOut_32_3 = 0;
        var9 = Kickabout.field_G;
        try {
          L0: {
            L1: {
              L2: {
                this.a((byte) -50, param2, param3, 64);
                if ((((ru) this).field_i[param3] & 2) != 0) {
                  var5_ref = (da) (Object) ((ru) this).field_m.field_j.d(param0 ^ -9065);
                  L3: while (true) {
                    if (null == var5_ref) {
                      break L2;
                    } else {
                      stackOut_6_0 = (da) var5_ref;
                      stackIn_17_0 = (Object) (Object) stackOut_6_0;
                      stackIn_7_0 = stackOut_6_0;
                      if (var9 != 0) {
                        break L1;
                      } else {
                        L4: {
                          if (~stackIn_7_0.field_q != ~param3) {
                            break L4;
                          } else {
                            if (0 <= var5_ref.field_s) {
                              break L4;
                            } else {
                              ((ru) this).field_O[param3][var5_ref.field_e] = null;
                              ((ru) this).field_O[param3][param2] = var5_ref;
                              var6_int = var5_ref.field_D - -(var5_ref.field_p * var5_ref.field_n >> 1221198668);
                              var5_ref.field_D = var5_ref.field_D + (param2 - var5_ref.field_e << -774190648);
                              var5_ref.field_e = param2;
                              var5_ref.field_n = -var5_ref.field_D + var6_int;
                              var5_ref.field_p = 4096;
                              return;
                            }
                          }
                        }
                        var5_ref = (da) (Object) ((ru) this).field_m.field_j.e(33);
                        if (var9 == 0) {
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
              stackOut_16_0 = ((ru) this).field_w.a(true, (long)((ru) this).field_n[param3]);
              stackIn_17_0 = (Object) (Object) stackOut_16_0;
              break L1;
            }
            var5_ref2 = (jk) (Object) stackIn_17_0;
            if (null == var5_ref2) {
              return;
            } else {
              var6 = var5_ref2.field_l[param2];
              if (var6 != null) {
                var7 = new da();
                var7.field_y = var6;
                if (param0 == 32) {
                  L5: {
                    L6: {
                      var7.field_q = param3;
                      var7.field_g = var5_ref2;
                      var7.field_j = var5_ref2.field_e[param2];
                      var7.field_E = var5_ref2.field_p[param2];
                      var7.field_e = param2;
                      var7.field_C = var5_ref2.field_n[param2] * (param1 * param1) * var5_ref2.field_j + 1024 >> 1193637131;
                      var7.field_A = var5_ref2.field_k[param2] & 255;
                      var7.field_D = (param2 << -1535530296) - (32767 & var5_ref2.field_r[param2]);
                      var7.field_f = 0;
                      var7.field_l = 0;
                      var7.field_t = 0;
                      var7.field_s = -1;
                      var7.field_v = 0;
                      if (0 != ((ru) this).field_s[param3]) {
                        break L6;
                      } else {
                        var7.field_F = vm.b(var6, this.a(var7, -5), this.b(-101, var7), this.a(true, var7));
                        if (var9 == 0) {
                          break L5;
                        } else {
                          break L6;
                        }
                      }
                    }
                    L7: {
                      var7.field_F = vm.b(var6, this.a(var7, -5), 0, this.a(true, var7));
                      stackOut_29_0 = this;
                      stackOut_29_1 = 0;
                      stackOut_29_2 = (da) var7;
                      stackIn_34_0 = stackOut_29_0;
                      stackIn_34_1 = stackOut_29_1;
                      stackIn_34_2 = stackOut_29_2;
                      stackIn_30_0 = stackOut_29_0;
                      stackIn_30_1 = stackOut_29_1;
                      stackIn_30_2 = stackOut_29_2;
                      if (var5_ref2.field_r[param2] >= 0) {
                        stackOut_34_0 = this;
                        stackOut_34_1 = stackIn_34_1;
                        stackOut_34_2 = (da) (Object) stackIn_34_2;
                        stackOut_34_3 = 0;
                        stackIn_35_0 = stackOut_34_0;
                        stackIn_35_1 = stackOut_34_1;
                        stackIn_35_2 = stackOut_34_2;
                        stackIn_35_3 = stackOut_34_3;
                        break L7;
                      } else {
                        stackOut_30_0 = this;
                        stackOut_30_1 = stackIn_30_1;
                        stackOut_30_2 = (da) (Object) stackIn_30_2;
                        stackIn_32_0 = stackOut_30_0;
                        stackIn_32_1 = stackOut_30_1;
                        stackIn_32_2 = stackOut_30_2;
                        stackOut_32_0 = this;
                        stackOut_32_1 = stackIn_32_1;
                        stackOut_32_2 = (da) (Object) stackIn_32_2;
                        stackOut_32_3 = 1;
                        stackIn_35_0 = stackOut_32_0;
                        stackIn_35_1 = stackOut_32_1;
                        stackIn_35_2 = stackOut_32_2;
                        stackIn_35_3 = stackOut_32_3;
                        break L7;
                      }
                    }
                    ((ru) this).a(stackIn_35_1 != 0, stackIn_35_2, stackIn_35_3 != 0);
                    break L5;
                  }
                  L8: {
                    if (var5_ref2.field_r[param2] >= 0) {
                      break L8;
                    } else {
                      var7.field_F.g(-1);
                      break L8;
                    }
                  }
                  L9: {
                    if (var7.field_E < 0) {
                      break L9;
                    } else {
                      L10: {
                        var8 = ((ru) this).field_Q[param3][var7.field_E];
                        if (null == var8) {
                          break L10;
                        } else {
                          if (0 > var8.field_s) {
                            ((ru) this).field_O[param3][var8.field_e] = null;
                            var8.field_s = 0;
                            break L10;
                          } else {
                            break L10;
                          }
                        }
                      }
                      ((ru) this).field_Q[param3][var7.field_E] = var7;
                      break L9;
                    }
                  }
                  ((ru) this).field_m.field_j.a((gn) (Object) var7, 3);
                  ((ru) this).field_O[param3][param2] = var7;
                  break L0;
                } else {
                  return;
                }
              } else {
                return;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          throw nb.a((Throwable) (Object) var5, "ru.AA(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final synchronized void a(int[] param0, int param1, int param2) {
        RuntimeException runtimeException = null;
        int var4_int = 0;
        long var5 = 0L;
        int var7 = 0;
        int var8 = 0;
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
        var8 = Kickabout.field_G;
        try {
          L0: {
            L1: {
              L2: {
                if (!((ru) this).field_k.f()) {
                  break L2;
                } else {
                  var4_int = ((ru) this).field_p * ((ru) this).field_k.field_h / uh.field_i;
                  L3: while (true) {
                    L4: {
                      var5 = (long)var4_int * (long)param2 + ((ru) this).field_D;
                      if (((ru) this).field_P - var5 < 0L) {
                        break L4;
                      } else {
                        ((ru) this).field_D = var5;
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
                    var7 = (int)((-1L + (long)var4_int + (((ru) this).field_P + -((ru) this).field_D)) / (long)var4_int);
                    ((ru) this).field_D = ((ru) this).field_D + (long)var7 * (long)var4_int;
                    ((ru) this).field_m.a(param0, param1, var7);
                    param1 = param1 + var7;
                    this.e(4204);
                    param2 = param2 - var7;
                    if (!((ru) this).field_k.f()) {
                      break L2;
                    } else {
                      if (var8 == 0) {
                        continue L3;
                      } else {
                        break L2;
                      }
                    }
                  }
                }
              }
              ((ru) this).field_m.a(param0, param1, param2);
              break L1;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            runtimeException = decompiledCaughtException;
            stackOut_14_0 = (RuntimeException) runtimeException;
            stackOut_14_1 = new StringBuilder().append("ru.E(");
            stackIn_17_0 = stackOut_14_0;
            stackIn_17_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param0 == null) {
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
          throw nb.a((Throwable) (Object) stackIn_18_0, stackIn_18_2 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final void a(boolean param0, da param1, boolean param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
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
                      L3: {
                        var6 = -param1.field_y.field_h + (var4_int + var4_int);
                        var4_int = var4_int << 8;
                        var5 = (int)((long)((ru) this).field_s[param1.field_q] * (long)var6 >> 1798373126);
                        if (var5 >= var4_int) {
                          var5 = var4_int + var4_int - (1 - -var5);
                          param1.field_F.a(true);
                          break L3;
                        } else {
                          break L3;
                        }
                      }
                      if (Kickabout.field_G == 0) {
                        break L1;
                      } else {
                        break L2;
                      }
                    }
                  }
                }
                var5 = (int)((long)((ru) this).field_s[param1.field_q] * (long)var4_int >> -726024122);
                break L1;
              }
              param1.field_F.i(var5);
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var4 = decompiledCaughtException;
            stackOut_14_0 = (RuntimeException) var4;
            stackOut_14_1 = new StringBuilder().append("ru.NA(").append(param0).append(',');
            stackIn_17_0 = stackOut_14_0;
            stackIn_17_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param1 == null) {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "null";
              stackIn_18_0 = stackOut_17_0;
              stackIn_18_1 = stackOut_17_1;
              stackIn_18_2 = stackOut_17_2;
              break L4;
            } else {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "{...}";
              stackIn_18_0 = stackOut_15_0;
              stackIn_18_1 = stackOut_15_1;
              stackIn_18_2 = stackOut_15_2;
              break L4;
            }
          }
          throw nb.a((Throwable) (Object) stackIn_18_0, stackIn_18_2 + ',' + param2 + ')');
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
        int stackIn_25_0 = 0;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_30_2 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        String stackIn_34_2 = null;
        RuntimeException stackIn_35_0 = null;
        StringBuilder stackIn_35_1 = null;
        RuntimeException stackIn_37_0 = null;
        StringBuilder stackIn_37_1 = null;
        RuntimeException stackIn_38_0 = null;
        StringBuilder stackIn_38_1 = null;
        String stackIn_38_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_24_0 = 0;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        String stackOut_29_2 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        String stackOut_27_2 = null;
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        RuntimeException stackOut_33_0 = null;
        StringBuilder stackOut_33_1 = null;
        String stackOut_33_2 = null;
        RuntimeException stackOut_31_0 = null;
        StringBuilder stackOut_31_1 = null;
        String stackOut_31_2 = null;
        RuntimeException stackOut_34_0 = null;
        StringBuilder stackOut_34_1 = null;
        RuntimeException stackOut_37_0 = null;
        StringBuilder stackOut_37_1 = null;
        String stackOut_37_2 = null;
        RuntimeException stackOut_35_0 = null;
        StringBuilder stackOut_35_1 = null;
        String stackOut_35_2 = null;
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
                var7 = (Object) (Object) new int[]{param1};
                break L1;
              }
            }
            L2: {
              if (param0 == 1) {
                break L2;
              } else {
                ((ru) this).field_m = null;
                break L2;
              }
            }
            var8 = (hw) (Object) param4.field_f.b(param0 + -1);
            L3: while (true) {
              L4: {
                L5: {
                  if (null == var8) {
                    break L5;
                  } else {
                    var9 = (int)var8.field_a;
                    var10 = (jk) (Object) ((ru) this).field_w.a(true, (long)var9);
                    if (var11 != 0) {
                      break L4;
                    } else {
                      L6: {
                        L7: {
                          if (null != var10) {
                            break L7;
                          } else {
                            L8: {
                              var10 = jr.a(param2, var9, 116);
                              if (var10 != null) {
                                break L8;
                              } else {
                                var6_int = 0;
                                if (var11 == 0) {
                                  break L6;
                                } else {
                                  break L8;
                                }
                              }
                            }
                            ((ru) this).field_w.a((gn) (Object) var10, param0 ^ 124, (long)var9);
                            break L7;
                          }
                        }
                        if (!var10.a(param3, (int[]) var7, (byte) 123, var8.field_g)) {
                          var6_int = 0;
                          break L6;
                        } else {
                          break L6;
                        }
                      }
                      var8 = (hw) (Object) param4.field_f.a(param0 ^ -2);
                      if (var11 == 0) {
                        continue L3;
                      } else {
                        break L5;
                      }
                    }
                  }
                }
                if (var6_int == 0) {
                  break L4;
                } else {
                  param4.a();
                  break L4;
                }
              }
              stackOut_24_0 = var6_int;
              stackIn_25_0 = stackOut_24_0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L9: {
            var6 = decompiledCaughtException;
            stackOut_26_0 = (RuntimeException) var6;
            stackOut_26_1 = new StringBuilder().append("ru.CA(").append(param0).append(',').append(param1).append(',');
            stackIn_29_0 = stackOut_26_0;
            stackIn_29_1 = stackOut_26_1;
            stackIn_27_0 = stackOut_26_0;
            stackIn_27_1 = stackOut_26_1;
            if (param2 == null) {
              stackOut_29_0 = (RuntimeException) (Object) stackIn_29_0;
              stackOut_29_1 = (StringBuilder) (Object) stackIn_29_1;
              stackOut_29_2 = "null";
              stackIn_30_0 = stackOut_29_0;
              stackIn_30_1 = stackOut_29_1;
              stackIn_30_2 = stackOut_29_2;
              break L9;
            } else {
              stackOut_27_0 = (RuntimeException) (Object) stackIn_27_0;
              stackOut_27_1 = (StringBuilder) (Object) stackIn_27_1;
              stackOut_27_2 = "{...}";
              stackIn_30_0 = stackOut_27_0;
              stackIn_30_1 = stackOut_27_1;
              stackIn_30_2 = stackOut_27_2;
              break L9;
            }
          }
          L10: {
            stackOut_30_0 = (RuntimeException) (Object) stackIn_30_0;
            stackOut_30_1 = ((StringBuilder) (Object) stackIn_30_1).append(stackIn_30_2).append(',');
            stackIn_33_0 = stackOut_30_0;
            stackIn_33_1 = stackOut_30_1;
            stackIn_31_0 = stackOut_30_0;
            stackIn_31_1 = stackOut_30_1;
            if (param3 == null) {
              stackOut_33_0 = (RuntimeException) (Object) stackIn_33_0;
              stackOut_33_1 = (StringBuilder) (Object) stackIn_33_1;
              stackOut_33_2 = "null";
              stackIn_34_0 = stackOut_33_0;
              stackIn_34_1 = stackOut_33_1;
              stackIn_34_2 = stackOut_33_2;
              break L10;
            } else {
              stackOut_31_0 = (RuntimeException) (Object) stackIn_31_0;
              stackOut_31_1 = (StringBuilder) (Object) stackIn_31_1;
              stackOut_31_2 = "{...}";
              stackIn_34_0 = stackOut_31_0;
              stackIn_34_1 = stackOut_31_1;
              stackIn_34_2 = stackOut_31_2;
              break L10;
            }
          }
          L11: {
            stackOut_34_0 = (RuntimeException) (Object) stackIn_34_0;
            stackOut_34_1 = ((StringBuilder) (Object) stackIn_34_1).append(stackIn_34_2).append(',');
            stackIn_37_0 = stackOut_34_0;
            stackIn_37_1 = stackOut_34_1;
            stackIn_35_0 = stackOut_34_0;
            stackIn_35_1 = stackOut_34_1;
            if (param4 == null) {
              stackOut_37_0 = (RuntimeException) (Object) stackIn_37_0;
              stackOut_37_1 = (StringBuilder) (Object) stackIn_37_1;
              stackOut_37_2 = "null";
              stackIn_38_0 = stackOut_37_0;
              stackIn_38_1 = stackOut_37_1;
              stackIn_38_2 = stackOut_37_2;
              break L11;
            } else {
              stackOut_35_0 = (RuntimeException) (Object) stackIn_35_0;
              stackOut_35_1 = (StringBuilder) (Object) stackIn_35_1;
              stackOut_35_2 = "{...}";
              stackIn_38_0 = stackOut_35_0;
              stackIn_38_1 = stackOut_35_1;
              stackIn_38_2 = stackOut_35_2;
              break L11;
            }
          }
          throw nb.a((Throwable) (Object) stackIn_38_0, stackIn_38_2 + ')');
        }
        return stackIn_25_0 != 0;
    }

    private final int a(boolean param0, da param1) {
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
              if (param0) {
                break L1;
              } else {
                ((ru) this).field_m = null;
                break L1;
              }
            }
            var3_int = ((ru) this).field_E[param1.field_q];
            if (var3_int >= 8192) {
              stackOut_6_0 = 16384 + -((-var3_int + 16384) * (128 + -param1.field_A) + 32 >> 57710118);
              stackIn_7_0 = stackOut_6_0;
              break L0;
            } else {
              stackOut_4_0 = 32 + var3_int * param1.field_A >> 1767358470;
              stackIn_5_0 = stackOut_4_0;
              return stackIn_5_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) var3;
            stackOut_8_1 = new StringBuilder().append("ru.DA(").append(param0).append(',');
            stackIn_11_0 = stackOut_8_0;
            stackIn_11_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param1 == null) {
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
          throw nb.a((Throwable) (Object) stackIn_12_0, stackIn_12_2 + ')');
        }
        return stackIn_7_0;
    }

    private final void f(int param0, int param1) {
        da var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        RuntimeException decompiledCaughtException = null;
        var4 = Kickabout.field_G;
        try {
          L0: {
            L1: {
              if (param1 == 100) {
                break L1;
              } else {
                this.a(15, 115, (byte) 81);
                break L1;
              }
            }
            var3 = (da) (Object) ((ru) this).field_m.field_j.g(24009);
            L2: while (true) {
              L3: {
                L4: {
                  if (var3 == null) {
                    break L4;
                  } else {
                    if (var4 != 0) {
                      break L3;
                    } else {
                      L5: {
                        L6: {
                          if (param0 < 0) {
                            break L6;
                          } else {
                            if (var3.field_q == param0) {
                              break L6;
                            } else {
                              break L5;
                            }
                          }
                        }
                        L7: {
                          if (var3.field_F != null) {
                            L8: {
                              var3.field_F.e(uh.field_i / 100);
                              if (!var3.field_F.n()) {
                                break L8;
                              } else {
                                ((ru) this).field_m.field_i.a((lq) (Object) var3.field_F);
                                break L8;
                              }
                            }
                            var3.a(true);
                            break L7;
                          } else {
                            break L7;
                          }
                        }
                        L9: {
                          if (0 <= var3.field_s) {
                            break L9;
                          } else {
                            ((ru) this).field_O[var3.field_q][var3.field_e] = null;
                            break L9;
                          }
                        }
                        var3.c((byte) -109);
                        break L5;
                      }
                      var3 = (da) (Object) ((ru) this).field_m.field_j.c(33);
                      if (var4 == 0) {
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
          var3_ref = decompiledCaughtException;
          throw nb.a((Throwable) (Object) var3_ref, "ru.D(" + param0 + ',' + param1 + ')');
        }
    }

    private final void b(int param0, int param1) {
        RuntimeException var3 = null;
        int var4 = 0;
        RuntimeException decompiledCaughtException = null;
        var4 = Kickabout.field_G;
        try {
          L0: {
            if (param0 >= 0) {
              L1: {
                ((ru) this).field_y[param0] = 12800;
                if (param1 > 66) {
                  break L1;
                } else {
                  this.e(-112, 41, 103);
                  break L1;
                }
              }
              ((ru) this).field_E[param0] = 8192;
              ((ru) this).field_A[param0] = 16383;
              ((ru) this).field_v[param0] = 8192;
              ((ru) this).field_G[param0] = 0;
              ((ru) this).field_B[param0] = 8192;
              this.a(-1, param0);
              this.e(-28723, param0);
              ((ru) this).field_i[param0] = 0;
              ((ru) this).field_z[param0] = 32767;
              ((ru) this).field_j[param0] = 256;
              ((ru) this).field_s[param0] = 0;
              this.c(param0, 8192, 110);
              break L0;
            } else {
              param0 = 0;
              L2: while (true) {
                L3: {
                  if (16 <= param0) {
                    break L3;
                  } else {
                    this.b(param0, 73);
                    param0++;
                    if (var4 == 0) {
                      continue L2;
                    } else {
                      break L3;
                    }
                  }
                }
                return;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw nb.a((Throwable) (Object) var3, "ru.G(" + param0 + ',' + param1 + ')');
        }
    }

    final boolean a(int param0, int param1, int param2, da param3, int[] param4) {
        RuntimeException var6 = null;
        int var6_int = 0;
        gl var7 = null;
        int var8 = 0;
        double var9 = 0.0;
        int var11 = 0;
        int stackIn_18_0 = 0;
        int stackIn_49_0 = 0;
        int stackIn_49_1 = 0;
        int stackIn_56_0 = 0;
        int stackIn_56_1 = 0;
        int stackIn_86_0 = 0;
        int stackIn_86_1 = 0;
        int stackIn_93_0 = 0;
        int stackIn_93_1 = 0;
        int stackIn_98_0 = 0;
        int stackIn_123_0 = 0;
        int stackIn_125_0 = 0;
        RuntimeException stackIn_127_0 = null;
        StringBuilder stackIn_127_1 = null;
        RuntimeException stackIn_129_0 = null;
        StringBuilder stackIn_129_1 = null;
        RuntimeException stackIn_130_0 = null;
        StringBuilder stackIn_130_1 = null;
        String stackIn_130_2 = null;
        RuntimeException stackIn_131_0 = null;
        StringBuilder stackIn_131_1 = null;
        RuntimeException stackIn_133_0 = null;
        StringBuilder stackIn_133_1 = null;
        RuntimeException stackIn_134_0 = null;
        StringBuilder stackIn_134_1 = null;
        String stackIn_134_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_17_0 = 0;
        int stackOut_48_0 = 0;
        int stackOut_48_1 = 0;
        int stackOut_55_0 = 0;
        int stackOut_55_1 = 0;
        int stackOut_85_0 = 0;
        int stackOut_85_1 = 0;
        int stackOut_92_0 = 0;
        int stackOut_92_1 = 0;
        int stackOut_124_0 = 0;
        int stackOut_122_0 = 0;
        int stackOut_97_0 = 0;
        RuntimeException stackOut_126_0 = null;
        StringBuilder stackOut_126_1 = null;
        RuntimeException stackOut_129_0 = null;
        StringBuilder stackOut_129_1 = null;
        String stackOut_129_2 = null;
        RuntimeException stackOut_127_0 = null;
        StringBuilder stackOut_127_1 = null;
        String stackOut_127_2 = null;
        RuntimeException stackOut_130_0 = null;
        StringBuilder stackOut_130_1 = null;
        RuntimeException stackOut_133_0 = null;
        StringBuilder stackOut_133_1 = null;
        String stackOut_133_2 = null;
        RuntimeException stackOut_131_0 = null;
        StringBuilder stackOut_131_1 = null;
        String stackOut_131_2 = null;
        var11 = Kickabout.field_G;
        try {
          L0: {
            L1: {
              param3.field_B = uh.field_i / 100;
              if (param3.field_s < 0) {
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
                    if (((ru) this).field_Q[param3.field_q][param3.field_E] == param3) {
                      ((ru) this).field_Q[param3.field_q][param3.field_E] = null;
                      break L3;
                    } else {
                      break L3;
                    }
                  }
                }
                stackOut_17_0 = 1;
                stackIn_18_0 = stackOut_17_0;
                return stackIn_18_0 != 0;
              }
            }
            L4: {
              var6_int = param3.field_p;
              if (var6_int > 0) {
                L5: {
                  var6_int = var6_int - (int)(16.0 * Math.pow(2.0, 0.0004921259842519685 * (double)((ru) this).field_B[param3.field_q]) + 0.5);
                  if (var6_int < 0) {
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
                  L8: {
                    if (var7.field_g <= 0) {
                      break L8;
                    } else {
                      param3.field_f = param3.field_f + (int)(128.0 * Math.pow(2.0, var9 * (double)var7.field_g) + 0.5);
                      if (var11 == 0) {
                        break L7;
                      } else {
                        break L8;
                      }
                    }
                  }
                  param3.field_f = param3.field_f + 128;
                  break L7;
                }
                if (819200 > param3.field_f * var7.field_n) {
                  break L6;
                } else {
                  var8 = 1;
                  break L6;
                }
              }
            }
            L9: {
              if (var7.field_m == null) {
                break L9;
              } else {
                L10: {
                  L11: {
                    if (0 >= var7.field_e) {
                      break L11;
                    } else {
                      param3.field_v = param3.field_v + (int)(128.0 * Math.pow(2.0, var9 * (double)var7.field_e) + 0.5);
                      if (var11 == 0) {
                        break L10;
                      } else {
                        break L11;
                      }
                    }
                  }
                  param3.field_v = param3.field_v + 128;
                  break L10;
                }
                L12: while (true) {
                  L13: {
                    L14: {
                      if (~(var7.field_m.length - 2) >= ~param3.field_t) {
                        break L14;
                      } else {
                        stackOut_48_0 = param3.field_v;
                        stackOut_48_1 = var7.field_m[param3.field_t + 2] << -1461851032 & 65280;
                        stackIn_56_0 = stackOut_48_0;
                        stackIn_56_1 = stackOut_48_1;
                        stackIn_49_0 = stackOut_48_0;
                        stackIn_49_1 = stackOut_48_1;
                        if (var11 != 0) {
                          break L13;
                        } else {
                          if (stackIn_49_0 <= stackIn_49_1) {
                            break L14;
                          } else {
                            param3.field_t = param3.field_t + 2;
                            if (var11 == 0) {
                              continue L12;
                            } else {
                              break L14;
                            }
                          }
                        }
                      }
                    }
                    stackOut_55_0 = var7.field_m.length - 2;
                    stackOut_55_1 = param3.field_t;
                    stackIn_56_0 = stackOut_55_0;
                    stackIn_56_1 = stackOut_55_1;
                    break L13;
                  }
                  if (stackIn_56_0 != stackIn_56_1) {
                    break L9;
                  } else {
                    if (var7.field_m[1 + param3.field_t] == 0) {
                      var8 = 1;
                      break L9;
                    } else {
                      break L9;
                    }
                  }
                }
              }
            }
            L15: {
              if (param3.field_s < 0) {
                break L15;
              } else {
                if (null == var7.field_b) {
                  break L15;
                } else {
                  if ((((ru) this).field_i[param3.field_q] & 1) != 0) {
                    break L15;
                  } else {
                    L16: {
                      if (param3.field_E < 0) {
                        break L16;
                      } else {
                        if (param3 != ((ru) this).field_Q[param3.field_q][param3.field_E]) {
                          break L16;
                        } else {
                          break L15;
                        }
                      }
                    }
                    L17: {
                      L18: {
                        if (var7.field_l > 0) {
                          break L18;
                        } else {
                          param3.field_s = param3.field_s + 128;
                          if (var11 == 0) {
                            break L17;
                          } else {
                            break L18;
                          }
                        }
                      }
                      param3.field_s = param3.field_s + (int)(Math.pow(2.0, (double)var7.field_l * var9) * 128.0 + 0.5);
                      break L17;
                    }
                    L19: while (true) {
                      L20: {
                        L21: {
                          if (~(-2 + var7.field_b.length) >= ~param3.field_l) {
                            break L21;
                          } else {
                            stackOut_85_0 = ~(var7.field_b[param3.field_l + 2] << 107342216 & 65280);
                            stackOut_85_1 = ~param3.field_s;
                            stackIn_93_0 = stackOut_85_0;
                            stackIn_93_1 = stackOut_85_1;
                            stackIn_86_0 = stackOut_85_0;
                            stackIn_86_1 = stackOut_85_1;
                            if (var11 != 0) {
                              break L20;
                            } else {
                              if (stackIn_86_0 <= stackIn_86_1) {
                                break L21;
                              } else {
                                param3.field_l = param3.field_l + 2;
                                if (var11 == 0) {
                                  continue L19;
                                } else {
                                  break L21;
                                }
                              }
                            }
                          }
                        }
                        stackOut_92_0 = param3.field_l;
                        stackOut_92_1 = -2 + var7.field_b.length;
                        stackIn_93_0 = stackOut_92_0;
                        stackIn_93_1 = stackOut_92_1;
                        break L20;
                      }
                      if (stackIn_93_0 == stackIn_93_1) {
                        var8 = 1;
                        break L15;
                      } else {
                        break L15;
                      }
                    }
                  }
                }
              }
            }
            if (param0 < -26) {
              if (var8 == 0) {
                param3.field_F.a(param3.field_B, this.b(55, param3), this.a(true, param3));
                stackOut_124_0 = 0;
                stackIn_125_0 = stackOut_124_0;
                break L0;
              } else {
                L22: {
                  L23: {
                    param3.field_F.e(param3.field_B);
                    if (null == param4) {
                      break L23;
                    } else {
                      param3.field_F.a(param4, param2, param1);
                      if (var11 == 0) {
                        break L22;
                      } else {
                        break L23;
                      }
                    }
                  }
                  param3.field_F.a(param1);
                  break L22;
                }
                L24: {
                  if (param3.field_F.n()) {
                    ((ru) this).field_m.field_i.a((lq) (Object) param3.field_F);
                    break L24;
                  } else {
                    break L24;
                  }
                }
                L25: {
                  param3.a(true);
                  if (0 > param3.field_s) {
                    break L25;
                  } else {
                    param3.c((byte) -109);
                    if (param3.field_E <= 0) {
                      break L25;
                    } else {
                      if (param3 == ((ru) this).field_Q[param3.field_q][param3.field_E]) {
                        ((ru) this).field_Q[param3.field_q][param3.field_E] = null;
                        break L25;
                      } else {
                        break L25;
                      }
                    }
                  }
                }
                stackOut_122_0 = 1;
                stackIn_123_0 = stackOut_122_0;
                return stackIn_123_0 != 0;
              }
            } else {
              stackOut_97_0 = 1;
              stackIn_98_0 = stackOut_97_0;
              return stackIn_98_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L26: {
            var6 = decompiledCaughtException;
            stackOut_126_0 = (RuntimeException) var6;
            stackOut_126_1 = new StringBuilder().append("ru.K(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_129_0 = stackOut_126_0;
            stackIn_129_1 = stackOut_126_1;
            stackIn_127_0 = stackOut_126_0;
            stackIn_127_1 = stackOut_126_1;
            if (param3 == null) {
              stackOut_129_0 = (RuntimeException) (Object) stackIn_129_0;
              stackOut_129_1 = (StringBuilder) (Object) stackIn_129_1;
              stackOut_129_2 = "null";
              stackIn_130_0 = stackOut_129_0;
              stackIn_130_1 = stackOut_129_1;
              stackIn_130_2 = stackOut_129_2;
              break L26;
            } else {
              stackOut_127_0 = (RuntimeException) (Object) stackIn_127_0;
              stackOut_127_1 = (StringBuilder) (Object) stackIn_127_1;
              stackOut_127_2 = "{...}";
              stackIn_130_0 = stackOut_127_0;
              stackIn_130_1 = stackOut_127_1;
              stackIn_130_2 = stackOut_127_2;
              break L26;
            }
          }
          L27: {
            stackOut_130_0 = (RuntimeException) (Object) stackIn_130_0;
            stackOut_130_1 = ((StringBuilder) (Object) stackIn_130_1).append(stackIn_130_2).append(',');
            stackIn_133_0 = stackOut_130_0;
            stackIn_133_1 = stackOut_130_1;
            stackIn_131_0 = stackOut_130_0;
            stackIn_131_1 = stackOut_130_1;
            if (param4 == null) {
              stackOut_133_0 = (RuntimeException) (Object) stackIn_133_0;
              stackOut_133_1 = (StringBuilder) (Object) stackIn_133_1;
              stackOut_133_2 = "null";
              stackIn_134_0 = stackOut_133_0;
              stackIn_134_1 = stackOut_133_1;
              stackIn_134_2 = stackOut_133_2;
              break L27;
            } else {
              stackOut_131_0 = (RuntimeException) (Object) stackIn_131_0;
              stackOut_131_1 = (StringBuilder) (Object) stackIn_131_1;
              stackOut_131_2 = "{...}";
              stackIn_134_0 = stackOut_131_0;
              stackIn_134_1 = stackOut_131_1;
              stackIn_134_2 = stackOut_131_2;
              break L27;
            }
          }
          throw nb.a((Throwable) (Object) stackIn_134_0, stackIn_134_2 + ')');
        }
        return stackIn_125_0 != 0;
    }

    private final synchronized void a(byte param0, boolean param1) {
        RuntimeException var3 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              ((ru) this).field_k.c();
              if (param0 <= -109) {
                break L1;
              } else {
                field_C = 94;
                break L1;
              }
            }
            ((ru) this).field_x = null;
            this.a(param1, false);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw nb.a((Throwable) (Object) var3, "ru.R(" + param0 + ',' + param1 + ')');
        }
    }

    private final void a(boolean param0, boolean param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        RuntimeException decompiledCaughtException = null;
        var4 = Kickabout.field_G;
        try {
          L0: {
            L1: {
              L2: {
                if (!param0) {
                  break L2;
                } else {
                  this.f(-1, 100);
                  if (var4 == 0) {
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              this.g(-60, -1);
              break L1;
            }
            L3: {
              this.b(-1, 124);
              if (!param1) {
                break L3;
              } else {
                this.a(86, -61);
                break L3;
              }
            }
            var3_int = 0;
            L4: while (true) {
              L5: {
                L6: {
                  if (var3_int >= 16) {
                    break L6;
                  } else {
                    ((ru) this).field_n[var3_int] = ((ru) this).field_I[var3_int];
                    var3_int++;
                    if (var4 != 0) {
                      break L5;
                    } else {
                      if (var4 == 0) {
                        continue L4;
                      } else {
                        break L6;
                      }
                    }
                  }
                }
                var3_int = 0;
                break L5;
              }
              L7: while (true) {
                L8: {
                  L9: {
                    if (var3_int >= 16) {
                      break L9;
                    } else {
                      ((ru) this).field_q[var3_int] = qj.b(-128, ((ru) this).field_I[var3_int]);
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
          throw nb.a((Throwable) (Object) var3, "ru.L(" + param0 + ',' + param1 + ')');
        }
    }

    private final void c(int param0, int param1, int param2) {
        try {
            ((ru) this).field_L[param0] = param1;
            ((ru) this).field_o[param0] = (int)(2097152.0 * Math.pow(2.0, 0.00054931640625 * (double)param1) + 0.5);
            if (param2 < 48) {
                ((ru) this).b(-2);
            }
        } catch (RuntimeException runtimeException) {
            throw nb.a((Throwable) (Object) runtimeException, "ru.KA(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    private final void g(int param0, int param1) {
        RuntimeException runtimeException = null;
        da var3 = null;
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
        var4 = Kickabout.field_G;
        try {
          L0: {
            var3 = (da) (Object) ((ru) this).field_m.field_j.g(24009);
            L1: while (true) {
              L2: {
                L3: {
                  if (var3 == null) {
                    break L3;
                  } else {
                    stackOut_3_0 = 0;
                    stackOut_3_1 = param1;
                    stackIn_17_0 = stackOut_3_0;
                    stackIn_17_1 = stackOut_3_1;
                    stackIn_4_0 = stackOut_3_0;
                    stackIn_4_1 = stackOut_3_1;
                    if (var4 != 0) {
                      break L2;
                    } else {
                      L4: {
                        L5: {
                          if (stackIn_4_0 > stackIn_4_1) {
                            break L5;
                          } else {
                            if (~param1 == ~var3.field_q) {
                              break L5;
                            } else {
                              break L4;
                            }
                          }
                        }
                        if (0 <= var3.field_s) {
                          break L4;
                        } else {
                          ((ru) this).field_O[var3.field_q][var3.field_e] = null;
                          var3.field_s = 0;
                          break L4;
                        }
                      }
                      var3 = (da) (Object) ((ru) this).field_m.field_j.c(33);
                      if (var4 == 0) {
                        continue L1;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
                stackOut_16_0 = param0;
                stackOut_16_1 = -8;
                stackIn_17_0 = stackOut_16_0;
                stackIn_17_1 = stackOut_16_1;
                break L2;
              }
              L6: {
                if (stackIn_17_0 <= stackIn_17_1) {
                  break L6;
                } else {
                  this.d(4, -110);
                  break L6;
                }
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw nb.a((Throwable) (Object) runtimeException, "ru.PA(" + param0 + ',' + param1 + ')');
        }
    }

    final synchronized void d(int param0, int param1, int param2) {
        RuntimeException runtimeException = null;
        int var4_int = 0;
        int var5 = 0;
        RuntimeException decompiledCaughtException = null;
        var5 = Kickabout.field_G;
        try {
          L0: {
            L1: {
              L2: {
                if (~param0 <= param1) {
                  break L2;
                } else {
                  var4_int = 0;
                  L3: while (true) {
                    L4: {
                      if (var4_int >= 16) {
                        break L4;
                      } else {
                        ((ru) this).field_J[var4_int] = param2;
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
              ((ru) this).field_J[param0] = param2;
              break L1;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw nb.a((Throwable) (Object) runtimeException, "ru.J(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final synchronized void b(int param0) {
        if (param0 != 21404) {
            return;
        }
        try {
            this.a((byte) -114, true);
        } catch (RuntimeException runtimeException) {
            throw nb.a((Throwable) (Object) runtimeException, "ru.IA(" + param0 + ')');
        }
    }

    private final void e(int param0, int param1) {
        da var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        RuntimeException decompiledCaughtException = null;
        var4 = Kickabout.field_G;
        try {
          L0: {
            L1: {
              if (param0 == -28723) {
                break L1;
              } else {
                ((ru) this).field_J = null;
                break L1;
              }
            }
            L2: {
              L3: {
                if ((4 & ((ru) this).field_i[param1]) == 0) {
                  break L3;
                } else {
                  var3 = (da) (Object) ((ru) this).field_m.field_j.g(24009);
                  L4: while (true) {
                    if (var3 == null) {
                      break L3;
                    } else {
                      if (var4 != 0) {
                        break L2;
                      } else {
                        L5: {
                          if (param1 != var3.field_q) {
                            break L5;
                          } else {
                            var3.field_r = 0;
                            break L5;
                          }
                        }
                        var3 = (da) (Object) ((ru) this).field_m.field_j.c(33);
                        if (var4 == 0) {
                          continue L4;
                        } else {
                          break L3;
                        }
                      }
                    }
                  }
                }
              }
              break L2;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          throw nb.a((Throwable) (Object) var3_ref, "ru.A(" + param0 + ',' + param1 + ')');
        }
    }

    final synchronized void a(int param0) {
        RuntimeException var2 = null;
        int var2_int = 0;
        long var3 = 0L;
        int var5 = 0;
        int var6 = 0;
        RuntimeException decompiledCaughtException = null;
        var6 = Kickabout.field_G;
        try {
          L0: {
            L1: {
              L2: {
                if (((ru) this).field_k.f()) {
                  var2_int = ((ru) this).field_p * ((ru) this).field_k.field_h / uh.field_i;
                  L3: while (true) {
                    L4: {
                      var3 = ((ru) this).field_D - -((long)param0 * (long)var2_int);
                      if (-var3 + ((ru) this).field_P < 0L) {
                        break L4;
                      } else {
                        ((ru) this).field_D = var3;
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
                      var5 = (int)((-1L + ((ru) this).field_P - ((ru) this).field_D - -(long)var2_int) / (long)var2_int);
                      ((ru) this).field_D = ((ru) this).field_D + (long)var2_int * (long)var5;
                      param0 = param0 - var5;
                      ((ru) this).field_m.a(var5);
                      this.e(4204);
                      if (((ru) this).field_k.f()) {
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
              ((ru) this).field_m.a(param0);
              break L1;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw nb.a((Throwable) (Object) var2, "ru.C(" + param0 + ')');
        }
    }

    private final void a(int param0, int param1, int param2) {
        RuntimeException runtimeException = null;
        int var4_int = 0;
        int var5 = 0;
        RuntimeException decompiledCaughtException = null;
        var5 = Kickabout.field_G;
        try {
          L0: {
            if (param1 == 128) {
              L1: {
                L2: {
                  if (param0 == ((ru) this).field_n[param2]) {
                    break L2;
                  } else {
                    ((ru) this).field_n[param2] = param0;
                    var4_int = 0;
                    L3: while (true) {
                      if (var4_int >= 128) {
                        break L2;
                      } else {
                        ((ru) this).field_Q[param2][var4_int] = null;
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
                break L1;
              }
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw nb.a((Throwable) (Object) runtimeException, "ru.GA(" + param0 + ',' + param1 + ',' + param2 + ')');
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
        int stackIn_8_0 = 0;
        int stackIn_15_0 = 0;
        int stackIn_17_0 = 0;
        int stackIn_18_0 = 0;
        int stackIn_18_1 = 0;
        int stackIn_23_0 = 0;
        int stackIn_23_1 = 0;
        int stackIn_25_0 = 0;
        int stackIn_25_1 = 0;
        int stackIn_26_0 = 0;
        int stackIn_26_1 = 0;
        int stackIn_26_2 = 0;
        int stackIn_31_0 = 0;
        int stackIn_33_0 = 0;
        int stackIn_34_0 = 0;
        int stackIn_34_1 = 0;
        int stackIn_67_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_7_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_17_0 = 0;
        int stackOut_17_1 = 0;
        int stackOut_15_0 = 0;
        int stackOut_15_1 = 0;
        int stackOut_22_0 = 0;
        int stackOut_22_1 = 0;
        int stackOut_25_0 = 0;
        int stackOut_25_1 = 0;
        int stackOut_25_2 = 0;
        int stackOut_23_0 = 0;
        int stackOut_23_1 = 0;
        int stackOut_23_2 = 0;
        int stackOut_30_0 = 0;
        int stackOut_33_0 = 0;
        int stackOut_33_1 = 0;
        int stackOut_31_0 = 0;
        int stackOut_31_1 = 0;
        int stackOut_66_0 = 0;
        int stackOut_64_0 = 0;
        var10 = Kickabout.field_G;
        try {
          L0: {
            if (wh.field_q) {
              return;
            } else {
              L1: {
                var2 = null;
                var3 = b.c(-93, 359);
                if (param0) {
                  stackOut_7_0 = go.a(0, (byte) -56);
                  stackIn_8_0 = stackOut_7_0;
                  break L1;
                } else {
                  stackOut_5_0 = go.a(1344, (byte) -56);
                  stackIn_8_0 = stackOut_5_0;
                  break L1;
                }
              }
              L2: {
                var4 = stackIn_8_0;
                if (rm.field_C != 0) {
                  if (rm.field_C != 1) {
                    if (rm.field_C > 2) {
                      if (rm.field_C == 3) {
                        if (!param0) {
                          var2 = (Object) (Object) kc.field_g[0];
                          var4 = var4 - (hw.field_i * 58 >> 1762924200);
                          break L2;
                        } else {
                          var2 = (Object) (Object) kc.field_g[1];
                          var4 = var4 - (hw.field_i * 97 >> 1610917896);
                          break L2;
                        }
                      } else {
                        break L2;
                      }
                    } else {
                      var4 = var4 - (55 * hw.field_i >> -1638033688);
                      var2 = (Object) (Object) kc.field_g[2];
                      if (param0) {
                        break L2;
                      } else {
                        var4 = var4 - (hw.field_i * 5 >> -1299977720);
                        break L2;
                      }
                    }
                  } else {
                    var4 = var4 - (hw.field_i * 62 >> -1443509912);
                    var2 = (Object) (Object) kc.field_g[3];
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
                        stackOut_14_0 = var4;
                        stackIn_17_0 = stackOut_14_0;
                        stackIn_15_0 = stackOut_14_0;
                        if (param0) {
                          stackOut_17_0 = stackIn_17_0;
                          stackOut_17_1 = 53;
                          stackIn_18_0 = stackOut_17_0;
                          stackIn_18_1 = stackOut_17_1;
                          break L4;
                        } else {
                          stackOut_15_0 = stackIn_15_0;
                          stackOut_15_1 = 64;
                          stackIn_18_0 = stackOut_15_0;
                          stackIn_18_1 = stackOut_15_1;
                          break L4;
                        }
                      }
                      var4 = stackIn_18_0 - (stackIn_18_1 * hw.field_i >> 291121768);
                      var2 = (Object) (Object) kc.field_g[6];
                      break L3;
                    } else {
                      break L3;
                    }
                  }
                  L5: {
                    if (ih.field_c == 1) {
                      L6: {
                        var2 = (Object) (Object) kc.field_g[5];
                        stackOut_22_0 = var4;
                        stackOut_22_1 = hw.field_i;
                        stackIn_25_0 = stackOut_22_0;
                        stackIn_25_1 = stackOut_22_1;
                        stackIn_23_0 = stackOut_22_0;
                        stackIn_23_1 = stackOut_22_1;
                        if (param0) {
                          stackOut_25_0 = stackIn_25_0;
                          stackOut_25_1 = stackIn_25_1;
                          stackOut_25_2 = 62;
                          stackIn_26_0 = stackOut_25_0;
                          stackIn_26_1 = stackOut_25_1;
                          stackIn_26_2 = stackOut_25_2;
                          break L6;
                        } else {
                          stackOut_23_0 = stackIn_23_0;
                          stackOut_23_1 = stackIn_23_1;
                          stackOut_23_2 = 72;
                          stackIn_26_0 = stackOut_23_0;
                          stackIn_26_1 = stackOut_23_1;
                          stackIn_26_2 = stackOut_23_2;
                          break L6;
                        }
                      }
                      var4 = stackIn_26_0 - (stackIn_26_1 * stackIn_26_2 >> -1574606584);
                      break L5;
                    } else {
                      break L5;
                    }
                  }
                  if (ih.field_c == 2) {
                    L7: {
                      var2 = (Object) (Object) kc.field_g[4];
                      stackOut_30_0 = var4;
                      stackIn_33_0 = stackOut_30_0;
                      stackIn_31_0 = stackOut_30_0;
                      if (param0) {
                        stackOut_33_0 = stackIn_33_0;
                        stackOut_33_1 = 68;
                        stackIn_34_0 = stackOut_33_0;
                        stackIn_34_1 = stackOut_33_1;
                        break L7;
                      } else {
                        stackOut_31_0 = stackIn_31_0;
                        stackOut_31_1 = 72;
                        stackIn_34_0 = stackOut_31_0;
                        stackIn_34_1 = stackOut_31_1;
                        break L7;
                      }
                    }
                    var4 = stackIn_34_0 - (stackIn_34_1 * hw.field_i >> -1481439768);
                    break L2;
                  } else {
                    break L2;
                  }
                }
              }
              L8: {
                L9: {
                  L10: {
                    L11: {
                      if (!param0) {
                        break L11;
                      } else {
                        if (3 != rm.field_C) {
                          break L11;
                        } else {
                          var5 = go.a(-87, (byte) -56);
                          var6 = 0;
                          L12: while (true) {
                            if (var6 >= 5) {
                              break L11;
                            } else {
                              im.a(-12376, b.c(-121, (-5 + ge.field_k.field_o) * var6 + -32), var5, ge.field_k);
                              var6++;
                              if (var10 != 0) {
                                break L10;
                              } else {
                                if (var10 == 0) {
                                  continue L12;
                                } else {
                                  break L11;
                                }
                              }
                            }
                          }
                        }
                      }
                    }
                    if (ih.field_c == 2) {
                      var5 = b.c(-105, -47);
                      var6 = b.c(param1 + 94, 892);
                      break L10;
                    } else {
                      break L9;
                    }
                  }
                  L13: {
                    if (!param0) {
                      stackOut_66_0 = 0;
                      stackIn_67_0 = stackOut_66_0;
                      break L13;
                    } else {
                      stackOut_64_0 = 3;
                      stackIn_67_0 = stackOut_64_0;
                      break L13;
                    }
                  }
                  var7 = stackIn_67_0;
                  var8 = 0;
                  L14: while (true) {
                    if (5 <= var8) {
                      break L9;
                    } else {
                      var9 = go.a(var8 * 290 + -40, (byte) -56);
                      im.a(-12376, var5, var9, so.field_d[var7]);
                      im.a(-12376, var6, var9, so.field_d[1 + var7]);
                      var8++;
                      if (var10 != 0) {
                        break L8;
                      } else {
                        if (var10 == 0) {
                          continue L14;
                        } else {
                          break L9;
                        }
                      }
                    }
                  }
                }
                im.a(-12376, var3, var4, (ut) var2);
                break L8;
              }
              L15: {
                if (param1 == -114) {
                  break L15;
                } else {
                  field_M = null;
                  break L15;
                }
              }
              L16: {
                L17: {
                  if (param0) {
                    break L17;
                  } else {
                    if (3 != rm.field_C) {
                      break L17;
                    } else {
                      var5 = go.a(1384, (byte) -56);
                      var6 = 0;
                      L18: while (true) {
                        if (var6 >= 5) {
                          break L17;
                        } else {
                          im.a(param1 + -12262, b.c(-126, var6 * (-5 + ge.field_k.field_o) + -32), var5, ge.field_k);
                          var6++;
                          if (var10 != 0) {
                            break L16;
                          } else {
                            if (var10 == 0) {
                              continue L18;
                            } else {
                              break L17;
                            }
                          }
                        }
                      }
                    }
                  }
                }
                break L16;
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = (Object) (Object) decompiledCaughtException;
          throw nb.a((Throwable) var2, "ru.I(" + param0 + ',' + param1 + ')');
        }
    }

    private final void a(byte param0, int param1, int param2, int param3) {
        RuntimeException runtimeException = null;
        da var5 = null;
        da var6 = null;
        int var7 = 0;
        RuntimeException decompiledCaughtException = null;
        var7 = Kickabout.field_G;
        try {
          L0: {
            L1: {
              if (param0 <= -16) {
                break L1;
              } else {
                field_t = null;
                break L1;
              }
            }
            var5 = ((ru) this).field_O[param2][param1];
            if (null == var5) {
              return;
            } else {
              L2: {
                L3: {
                  ((ru) this).field_O[param2][param1] = null;
                  if ((((ru) this).field_i[param2] & 2) == 0) {
                    break L3;
                  } else {
                    var6 = (da) (Object) ((ru) this).field_m.field_j.g(24009);
                    L4: while (true) {
                      L5: {
                        if (var6 == null) {
                          break L5;
                        } else {
                          if (var7 != 0) {
                            break L2;
                          } else {
                            L6: {
                              if (var6.field_q != var5.field_q) {
                                break L6;
                              } else {
                                if (0 <= var6.field_s) {
                                  break L6;
                                } else {
                                  if (var6 == var5) {
                                    break L6;
                                  } else {
                                    var5.field_s = 0;
                                    if (var7 == 0) {
                                      break L5;
                                    } else {
                                      break L6;
                                    }
                                  }
                                }
                              }
                            }
                            var6 = (da) (Object) ((ru) this).field_m.field_j.c(33);
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
                var5.field_s = 0;
                break L2;
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw nb.a((Throwable) (Object) runtimeException, "ru.FA(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    private final void a(int param0, int param1, byte param2) {
        try {
            ((ru) this).field_I[param0] = param1;
            ((ru) this).field_q[param0] = qj.b(param1, -128);
            this.a(param1, param2 ^ 164, param0);
            if (param2 != 36) {
                lq discarded$0 = ((ru) this).c();
            }
        } catch (RuntimeException runtimeException) {
            throw nb.a((Throwable) (Object) runtimeException, "ru.H(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final synchronized lq c() {
        RuntimeException var1 = null;
        pp stackIn_1_0 = null;
        RuntimeException decompiledCaughtException = null;
        pp stackOut_0_0 = null;
        try {
          L0: {
            stackOut_0_0 = ((ru) this).field_m;
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw nb.a((Throwable) (Object) var1, "ru.B()");
        }
        return (lq) (Object) stackIn_1_0;
    }

    private final void a(int param0, int param1) {
        RuntimeException var3 = null;
        da var3_ref = null;
        int var4 = 0;
        RuntimeException decompiledCaughtException = null;
        var4 = Kickabout.field_G;
        try {
          L0: {
            if (param0 == -1) {
              L1: {
                L2: {
                  if (0 != (2 & ((ru) this).field_i[param1])) {
                    var3_ref = (da) (Object) ((ru) this).field_m.field_j.g(24009);
                    L3: while (true) {
                      if (null == var3_ref) {
                        break L2;
                      } else {
                        if (var4 != 0) {
                          break L1;
                        } else {
                          L4: {
                            if (param1 != var3_ref.field_q) {
                              break L4;
                            } else {
                              if (((ru) this).field_O[param1][var3_ref.field_e] != null) {
                                break L4;
                              } else {
                                if (var3_ref.field_s >= 0) {
                                  break L4;
                                } else {
                                  var3_ref.field_s = 0;
                                  break L4;
                                }
                              }
                            }
                          }
                          var3_ref = (da) (Object) ((ru) this).field_m.field_j.c(33);
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
          throw nb.a((Throwable) (Object) var3, "ru.P(" + param0 + ',' + param1 + ')');
        }
    }

    private final void e(int param0) {
        RuntimeException var2 = null;
        int var2_int = 0;
        int var3 = 0;
        long var4 = 0L;
        int var6 = 0;
        int var7 = 0;
        int stackIn_11_0 = 0;
        int stackIn_11_1 = 0;
        int stackIn_13_0 = 0;
        int stackIn_13_1 = 0;
        int stackIn_15_0 = 0;
        int stackIn_15_1 = 0;
        int stackIn_41_0 = 0;
        int stackIn_41_1 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_10_0 = 0;
        int stackOut_10_1 = 0;
        int stackOut_12_0 = 0;
        int stackOut_12_1 = 0;
        int stackOut_14_0 = 0;
        int stackOut_14_1 = 0;
        int stackOut_39_0 = 0;
        int stackOut_39_1 = 0;
        var7 = Kickabout.field_G;
        try {
          L0: {
            L1: {
              if (param0 == 4204) {
                break L1;
              } else {
                this.f(-128, -34);
                break L1;
              }
            }
            L2: {
              var2_int = ((ru) this).field_K;
              var3 = ((ru) this).field_H;
              var4 = ((ru) this).field_P;
              if (((ru) this).field_x == null) {
                break L2;
              } else {
                if (((ru) this).field_N != var3) {
                  break L2;
                } else {
                  this.a(((ru) this).field_x, ((ru) this).field_F, (byte) 101, ((ru) this).field_r);
                  this.e(4204);
                  return;
                }
              }
            }
            L3: while (true) {
              stackOut_10_0 = ((ru) this).field_H;
              stackOut_10_1 = var3;
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              L4: while (true) {
                L5: {
                  L6: {
                    L7: {
                      if (stackIn_11_0 != stackIn_11_1) {
                        break L7;
                      } else {
                        L8: while (true) {
                          stackOut_12_0 = ((ru) this).field_k.field_e[var2_int];
                          stackOut_12_1 = var3;
                          stackIn_41_0 = stackOut_12_0;
                          stackIn_41_1 = stackOut_12_1;
                          stackIn_13_0 = stackOut_12_0;
                          stackIn_13_1 = stackOut_12_1;
                          if (var7 != 0) {
                            break L6;
                          } else {
                            L9: {
                              if (stackIn_13_0 != stackIn_13_1) {
                                break L9;
                              } else {
                                ((ru) this).field_k.c(var2_int);
                                var6 = ((ru) this).field_k.f(var2_int);
                                stackOut_14_0 = 1;
                                stackOut_14_1 = var6;
                                stackIn_11_0 = stackOut_14_0;
                                stackIn_11_1 = stackOut_14_1;
                                stackIn_15_0 = stackOut_14_0;
                                stackIn_15_1 = stackOut_14_1;
                                if (var7 != 0) {
                                  continue L4;
                                } else {
                                  if (stackIn_15_0 == stackIn_15_1) {
                                    ((ru) this).field_k.d();
                                    ((ru) this).field_k.b(var2_int);
                                    if (!((ru) this).field_k.a()) {
                                      break L9;
                                    } else {
                                      if (((ru) this).field_x == null) {
                                        L10: {
                                          if (!((ru) this).field_r) {
                                            break L10;
                                          } else {
                                            if (var3 != 0) {
                                              ((ru) this).field_k.a(var4);
                                              if (var7 == 0) {
                                                break L9;
                                              } else {
                                                break L10;
                                              }
                                            } else {
                                              break L10;
                                            }
                                          }
                                        }
                                        this.a(true, false);
                                        ((ru) this).field_k.c();
                                        return;
                                      } else {
                                        ((ru) this).a(((ru) this).field_r, 19134, ((ru) this).field_x);
                                        this.e(param0);
                                        return;
                                      }
                                    }
                                  } else {
                                    L11: {
                                      if ((var6 & 128) != 0) {
                                        this.d(5, var6);
                                        break L11;
                                      } else {
                                        break L11;
                                      }
                                    }
                                    ((ru) this).field_k.d(var2_int);
                                    ((ru) this).field_k.b(var2_int);
                                    if (var7 == 0) {
                                      continue L8;
                                    } else {
                                      break L9;
                                    }
                                  }
                                }
                              }
                            }
                            var2_int = ((ru) this).field_k.g();
                            var3 = ((ru) this).field_k.field_e[var2_int];
                            var4 = ((ru) this).field_k.e(var3);
                            if (var7 == 0) {
                              continue L3;
                            } else {
                              break L7;
                            }
                          }
                        }
                      }
                    }
                    ((ru) this).field_H = var3;
                    ((ru) this).field_K = var2_int;
                    ((ru) this).field_P = var4;
                    if (null == ((ru) this).field_x) {
                      break L5;
                    } else {
                      stackOut_39_0 = ~((ru) this).field_N;
                      stackOut_39_1 = ~var3;
                      stackIn_41_0 = stackOut_39_0;
                      stackIn_41_1 = stackOut_39_1;
                      break L6;
                    }
                  }
                  if (stackIn_41_0 > stackIn_41_1) {
                    ((ru) this).field_K = -1;
                    ((ru) this).field_H = ((ru) this).field_N;
                    ((ru) this).field_P = ((ru) this).field_k.e(((ru) this).field_H);
                    break L5;
                  } else {
                    break L5;
                  }
                }
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw nb.a((Throwable) (Object) var2, "ru.LA(" + param0 + ')');
        }
    }

    final boolean a(int param0, da param1) {
        RuntimeException var3 = null;
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
            L1: {
              if (param0 == -25102) {
                break L1;
              } else {
                ((ru) this).field_m = null;
                break L1;
              }
            }
            if (param1.field_F != null) {
              stackOut_17_0 = 0;
              stackIn_18_0 = stackOut_17_0;
              break L0;
            } else {
              L2: {
                if (param1.field_s < 0) {
                  break L2;
                } else {
                  param1.c((byte) -109);
                  if (param1.field_E <= 0) {
                    break L2;
                  } else {
                    if (((ru) this).field_Q[param1.field_q][param1.field_E] != param1) {
                      break L2;
                    } else {
                      ((ru) this).field_Q[param1.field_q][param1.field_E] = null;
                      break L2;
                    }
                  }
                }
              }
              stackOut_15_0 = 1;
              stackIn_16_0 = stackOut_15_0;
              return stackIn_16_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackOut_19_0 = (RuntimeException) var3;
            stackOut_19_1 = new StringBuilder().append("ru.W(").append(param0).append(',');
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
              break L3;
            } else {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "{...}";
              stackIn_23_0 = stackOut_20_0;
              stackIn_23_1 = stackOut_20_1;
              stackIn_23_2 = stackOut_20_2;
              break L3;
            }
          }
          throw nb.a((Throwable) (Object) stackIn_23_0, stackIn_23_2 + ')');
        }
        return stackIn_18_0 != 0;
    }

    private final int b(int param0, da param1) {
        RuntimeException var3 = null;
        gl var3_ref = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int stackIn_4_0 = 0;
        int stackIn_27_0 = 0;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        String stackIn_32_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_26_0 = 0;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        RuntimeException stackOut_31_0 = null;
        StringBuilder stackOut_31_1 = null;
        String stackOut_31_2 = null;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        String stackOut_29_2 = null;
        try {
          L0: {
            if (((ru) this).field_J[param1.field_q] == 0) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              return stackIn_4_0;
            } else {
              L1: {
                var3_ref = param1.field_j;
                var4 = ((ru) this).field_A[param1.field_q] * ((ru) this).field_y[param1.field_q] + 4096 >> -1467299603;
                var5 = 60 % ((param0 - -15) / 38);
                var4 = 16384 + var4 * var4 >> -1509700337;
                var4 = param1.field_C * var4 + 16384 >> 1193528111;
                var4 = ((ru) this).field_u * var4 + 128 >> 1664478216;
                var4 = var4 * ((ru) this).field_J[param1.field_q] + 128 >> 857214280;
                if (var3_ref.field_n > 0) {
                  var4 = (int)(0.5 + (double)var4 * Math.pow(0.5, (double)var3_ref.field_n * (0.00001953125 * (double)param1.field_f)));
                  break L1;
                } else {
                  break L1;
                }
              }
              L2: {
                if (var3_ref.field_m == null) {
                  break L2;
                } else {
                  L3: {
                    var6 = param1.field_v;
                    var7 = var3_ref.field_m[1 + param1.field_t];
                    if (~param1.field_t > ~(-2 + var3_ref.field_m.length)) {
                      var8 = var3_ref.field_m[param1.field_t] << -1505635864 & 65280;
                      var9 = var3_ref.field_m[param1.field_t + 2] << -575481944 & 65280;
                      var7 = var7 + (var6 + -var8) * (var3_ref.field_m[param1.field_t + 3] - var7) / (var9 + -var8);
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
                if (param1.field_s <= 0) {
                  break L4;
                } else {
                  if (var3_ref.field_b != null) {
                    L5: {
                      var6 = param1.field_s;
                      var7 = var3_ref.field_b[param1.field_l - -1];
                      if (param1.field_l < var3_ref.field_b.length + -2) {
                        var8 = (var3_ref.field_b[param1.field_l] & 255) << -630973112;
                        var9 = (255 & var3_ref.field_b[2 + param1.field_l]) << 1013398248;
                        var7 = var7 + (-var7 + var3_ref.field_b[3 + param1.field_l]) * (var6 - var8) / (var9 + -var8);
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
              stackOut_26_0 = var4;
              stackIn_27_0 = stackOut_26_0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var3 = decompiledCaughtException;
            stackOut_28_0 = (RuntimeException) var3;
            stackOut_28_1 = new StringBuilder().append("ru.OA(").append(param0).append(',');
            stackIn_31_0 = stackOut_28_0;
            stackIn_31_1 = stackOut_28_1;
            stackIn_29_0 = stackOut_28_0;
            stackIn_29_1 = stackOut_28_1;
            if (param1 == null) {
              stackOut_31_0 = (RuntimeException) (Object) stackIn_31_0;
              stackOut_31_1 = (StringBuilder) (Object) stackIn_31_1;
              stackOut_31_2 = "null";
              stackIn_32_0 = stackOut_31_0;
              stackIn_32_1 = stackOut_31_1;
              stackIn_32_2 = stackOut_31_2;
              break L6;
            } else {
              stackOut_29_0 = (RuntimeException) (Object) stackIn_29_0;
              stackOut_29_1 = (StringBuilder) (Object) stackIn_29_1;
              stackOut_29_2 = "{...}";
              stackIn_32_0 = stackOut_29_0;
              stackIn_32_1 = stackOut_29_1;
              stackIn_32_2 = stackOut_29_2;
              break L6;
            }
          }
          throw nb.a((Throwable) (Object) stackIn_32_0, stackIn_32_2 + ')');
        }
        return stackIn_27_0;
    }

    private final void b(int param0, int param1, int param2) {
        try {
            ((ru) this).field_v[param1] = param2;
            if (param0 < 20) {
                int discarded$0 = ((ru) this).d();
            }
        } catch (RuntimeException runtimeException) {
            throw nb.a((Throwable) (Object) runtimeException, "ru.BA(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    public static void a(byte param0) {
        try {
            int var1_int = -114 / ((34 - param0) / 59);
            field_t = null;
            field_l = null;
            field_M = null;
        } catch (RuntimeException runtimeException) {
            throw nb.a((Throwable) (Object) runtimeException, "ru.T(" + param0 + ')');
        }
    }

    public ru() {
        ((ru) this).field_E = new int[16];
        ((ru) this).field_i = new int[16];
        ((ru) this).field_Q = new da[16][128];
        ((ru) this).field_z = new int[16];
        ((ru) this).field_u = 256;
        ((ru) this).field_s = new int[16];
        ((ru) this).field_q = new int[16];
        ((ru) this).field_I = new int[16];
        ((ru) this).field_y = new int[16];
        ((ru) this).field_A = new int[16];
        ((ru) this).field_L = new int[16];
        ((ru) this).field_p = 1000000;
        ((ru) this).field_G = new int[16];
        ((ru) this).field_O = new da[16][128];
        ((ru) this).field_J = new int[16];
        ((ru) this).field_n = new int[16];
        ((ru) this).field_v = new int[16];
        ((ru) this).field_B = new int[16];
        ((ru) this).field_j = new int[16];
        ((ru) this).field_o = new int[16];
        ((ru) this).field_k = new rs();
        ((ru) this).field_m = new pp((ru) this);
        try {
            ((ru) this).field_w = new kc(128);
            ((ru) this).d(-1, -1, 256);
            this.a(true, false);
        } catch (RuntimeException runtimeException) {
            throw nb.a((Throwable) (Object) runtimeException, "ru.<init>()");
        }
    }

    ru(ru param0) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        ((ru) this).field_E = new int[16];
        ((ru) this).field_i = new int[16];
        ((ru) this).field_Q = new da[16][128];
        ((ru) this).field_z = new int[16];
        ((ru) this).field_u = 256;
        ((ru) this).field_s = new int[16];
        ((ru) this).field_q = new int[16];
        ((ru) this).field_I = new int[16];
        ((ru) this).field_y = new int[16];
        ((ru) this).field_A = new int[16];
        ((ru) this).field_L = new int[16];
        ((ru) this).field_p = 1000000;
        ((ru) this).field_G = new int[16];
        ((ru) this).field_O = new da[16][128];
        ((ru) this).field_J = new int[16];
        ((ru) this).field_n = new int[16];
        ((ru) this).field_v = new int[16];
        ((ru) this).field_B = new int[16];
        ((ru) this).field_j = new int[16];
        ((ru) this).field_o = new int[16];
        ((ru) this).field_k = new rs();
        ((ru) this).field_m = new pp((ru) this);
        try {
          L0: {
            ((ru) this).field_w = param0.field_w;
            ((ru) this).d(-1, -1, 256);
            this.a(true, false);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            runtimeException = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) runtimeException;
            stackOut_3_1 = new StringBuilder().append("ru.<init>(");
            stackIn_6_0 = stackOut_3_0;
            stackIn_6_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param0 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L1;
            } else {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "{...}";
              stackIn_7_0 = stackOut_4_0;
              stackIn_7_1 = stackOut_4_1;
              stackIn_7_2 = stackOut_4_2;
              break L1;
            }
          }
          throw nb.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_l = new Random();
        field_M = new tf();
        field_t = "Click or press F10 to open Quick Chat";
    }
}
