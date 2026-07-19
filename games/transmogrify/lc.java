/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class lc extends ag {
    private int[] field_y;
    private int[] field_r;
    private kc[][] field_l;
    private int[] field_p;
    private int[] field_H;
    static int field_q;
    static int field_R;
    private int field_w;
    private int[] field_G;
    private int[] field_M;
    private ul field_I;
    int[] field_D;
    private fl field_Q;
    private int[] field_o;
    private int[] field_K;
    int[] field_P;
    private int[] field_F;
    private int[] field_t;
    private int[] field_N;
    static String field_L;
    private kc[][] field_u;
    int[] field_v;
    private int[] field_C;
    private int field_B;
    private int[] field_z;
    private int field_J;
    private boolean field_A;
    private long field_s;
    private ej field_m;
    private long field_O;
    private int field_n;
    private boolean field_k;
    private int field_E;
    private pl field_x;

    final synchronized boolean a(int param0, boolean param1, bl param2, pl param3, ci param4) {
        RuntimeException var6 = null;
        int var6_int = 0;
        Object var7 = null;
        wd var8 = null;
        int var9 = 0;
        si var10 = null;
        int var11 = 0;
        int stackIn_3_0 = 0;
        int stackIn_21_0 = 0;
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
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_31_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_20_0 = 0;
        int stackOut_2_0 = 0;
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
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        String stackOut_30_2 = null;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        String stackOut_29_2 = null;
        var11 = Transmogrify.field_A ? 1 : 0;
        try {
          L0: {
            param3.a();
            if (!param1) {
              L1: {
                var6_int = 1;
                var7 = null;
                if (-1 > (param0 ^ -1)) {
                  var7 = new int[]{param0};
                  break L1;
                } else {
                  break L1;
                }
              }
              var8 = (wd) ((Object) param3.field_h.b(1000));
              L2: while (true) {
                L3: {
                  L4: {
                    L5: {
                      if (var8 == null) {
                        break L5;
                      } else {
                        var9 = (int)var8.field_c;
                        var10 = (si) ((Object) this.field_Q.a((long)var9, 0));
                        if (var11 != 0) {
                          break L4;
                        } else {
                          L6: {
                            L7: {
                              if (var10 != null) {
                                break L7;
                              } else {
                                L8: {
                                  var10 = ac.a(var9, 270, param4);
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
                                this.field_Q.a((long)var9, (byte) -66, var10);
                                break L7;
                              }
                            }
                            if (var10.a(param2, (int[]) (var7), -1, var8.field_h)) {
                              break L6;
                            } else {
                              var6_int = 0;
                              break L6;
                            }
                          }
                          var8 = (wd) ((Object) param3.field_h.a(110));
                          if (var11 == 0) {
                            continue L2;
                          } else {
                            break L5;
                          }
                        }
                      }
                    }
                    if (var6_int != 0) {
                      break L4;
                    } else {
                      break L3;
                    }
                  }
                  param3.b();
                  break L3;
                }
                stackOut_20_0 = var6_int;
                stackIn_21_0 = stackOut_20_0;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              stackOut_2_0 = 0;
              stackIn_3_0 = stackOut_2_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L9: {
            var6 = decompiledCaughtException;
            stackOut_22_0 = (RuntimeException) (var6);
            stackOut_22_1 = new StringBuilder().append("lc.O(").append(param0).append(',').append(param1).append(',');
            stackIn_24_0 = stackOut_22_0;
            stackIn_24_1 = stackOut_22_1;
            stackIn_23_0 = stackOut_22_0;
            stackIn_23_1 = stackOut_22_1;
            if (param2 == null) {
              stackOut_24_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackOut_24_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackOut_24_2 = "null";
              stackIn_25_0 = stackOut_24_0;
              stackIn_25_1 = stackOut_24_1;
              stackIn_25_2 = stackOut_24_2;
              break L9;
            } else {
              stackOut_23_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackOut_23_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackOut_23_2 = "{...}";
              stackIn_25_0 = stackOut_23_0;
              stackIn_25_1 = stackOut_23_1;
              stackIn_25_2 = stackOut_23_2;
              break L9;
            }
          }
          L10: {
            stackOut_25_0 = (RuntimeException) ((Object) stackIn_25_0);
            stackOut_25_1 = ((StringBuilder) (Object) stackIn_25_1).append(stackIn_25_2).append(',');
            stackIn_27_0 = stackOut_25_0;
            stackIn_27_1 = stackOut_25_1;
            stackIn_26_0 = stackOut_25_0;
            stackIn_26_1 = stackOut_25_1;
            if (param3 == null) {
              stackOut_27_0 = (RuntimeException) ((Object) stackIn_27_0);
              stackOut_27_1 = (StringBuilder) ((Object) stackIn_27_1);
              stackOut_27_2 = "null";
              stackIn_28_0 = stackOut_27_0;
              stackIn_28_1 = stackOut_27_1;
              stackIn_28_2 = stackOut_27_2;
              break L10;
            } else {
              stackOut_26_0 = (RuntimeException) ((Object) stackIn_26_0);
              stackOut_26_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackOut_26_2 = "{...}";
              stackIn_28_0 = stackOut_26_0;
              stackIn_28_1 = stackOut_26_1;
              stackIn_28_2 = stackOut_26_2;
              break L10;
            }
          }
          L11: {
            stackOut_28_0 = (RuntimeException) ((Object) stackIn_28_0);
            stackOut_28_1 = ((StringBuilder) (Object) stackIn_28_1).append(stackIn_28_2).append(',');
            stackIn_30_0 = stackOut_28_0;
            stackIn_30_1 = stackOut_28_1;
            stackIn_29_0 = stackOut_28_0;
            stackIn_29_1 = stackOut_28_1;
            if (param4 == null) {
              stackOut_30_0 = (RuntimeException) ((Object) stackIn_30_0);
              stackOut_30_1 = (StringBuilder) ((Object) stackIn_30_1);
              stackOut_30_2 = "null";
              stackIn_31_0 = stackOut_30_0;
              stackIn_31_1 = stackOut_30_1;
              stackIn_31_2 = stackOut_30_2;
              break L11;
            } else {
              stackOut_29_0 = (RuntimeException) ((Object) stackIn_29_0);
              stackOut_29_1 = (StringBuilder) ((Object) stackIn_29_1);
              stackOut_29_2 = "{...}";
              stackIn_31_0 = stackOut_29_0;
              stackIn_31_1 = stackOut_29_1;
              stackIn_31_2 = stackOut_29_2;
              break L11;
            }
          }
          throw ch.a((Throwable) ((Object) stackIn_31_0), stackIn_31_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0 != 0;
        } else {
          return stackIn_21_0 != 0;
        }
    }

    final synchronized void a(int param0, boolean param1, pl param2) {
        try {
            this.a(param1, param2, true, (byte) -81);
            int var4_int = -58 / ((65 - param0) / 58);
        } catch (RuntimeException runtimeException) {
            throw ch.a((Throwable) ((Object) runtimeException), "lc.SA(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final synchronized void f(int param0) {
        this.a((byte) 112, true);
        if (param0 != 16) {
            this.field_O = -106L;
        }
    }

    final synchronized void b(int[] param0, int param1, int param2) {
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
        var8 = Transmogrify.field_A ? 1 : 0;
        try {
          L0: {
            L1: {
              L2: {
                L3: {
                  if (this.field_I.e()) {
                    var4_int = this.field_w * this.field_I.field_h / qh.field_p;
                    L4: while (true) {
                      L5: {
                        var5 = (long)param2 * (long)var4_int + this.field_O;
                        if (-1L < (-var5 + this.field_s ^ -1L)) {
                          break L5;
                        } else {
                          this.field_O = var5;
                          if (var8 != 0) {
                            break L2;
                          } else {
                            if (var8 == 0) {
                              break L3;
                            } else {
                              break L5;
                            }
                          }
                        }
                      }
                      L6: {
                        var7 = (int)((this.field_s + (-this.field_O + ((long)var4_int + -1L))) / (long)var4_int);
                        this.field_O = this.field_O + (long)var4_int * (long)var7;
                        this.field_m.b(param0, param1, var7);
                        param1 = param1 + var7;
                        param2 = param2 - var7;
                        this.b(false);
                        if (this.field_I.e()) {
                          break L6;
                        } else {
                          if (var8 == 0) {
                            break L3;
                          } else {
                            break L6;
                          }
                        }
                      }
                      if (var8 == 0) {
                        continue L4;
                      } else {
                        this.field_m.b(param0, param1, param2);
                        break L1;
                      }
                    }
                  } else {
                    break L3;
                  }
                }
                this.field_m.b(param0, param1, param2);
                break L2;
              }
              break L1;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var4 = decompiledCaughtException;
            stackOut_15_0 = (RuntimeException) (var4);
            stackOut_15_1 = new StringBuilder().append("lc.K(");
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
              break L7;
            } else {
              stackOut_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackOut_16_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackOut_16_2 = "{...}";
              stackIn_18_0 = stackOut_16_0;
              stackIn_18_1 = stackOut_16_1;
              stackIn_18_2 = stackOut_16_2;
              break L7;
            }
          }
          throw ch.a((Throwable) ((Object) stackIn_18_0), stackIn_18_2 + ',' + param1 + ',' + param2 + ')');
        }
    }

    private final void b(int param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        var9 = Transmogrify.field_A ? 1 : 0;
        var3 = -117 % ((param0 - -62) / 44);
        var4 = 240 & param1;
        if (-129 == (var4 ^ -1)) {
          var5 = param1 & 15;
          var6 = (32651 & param1) >> 668655496;
          var7 = (8373600 & param1) >> -1297035152;
          this.c(0, var7, var6, var5);
          return;
        } else {
          L0: {
            if (144 != var4) {
              if (160 != var4) {
                if (176 != var4) {
                  if (var4 == 192) {
                    var5 = param1 & 15;
                    var6 = 127 & param1 >> -332484920;
                    this.d(this.field_K[var5] - -var6, var5, 122);
                    return;
                  } else {
                    if (var4 != 208) {
                      if (224 != var4) {
                        var4 = param1 & 255;
                        if (var4 != 255) {
                          return;
                        } else {
                          this.a(false, true);
                          return;
                        }
                      } else {
                        var5 = 15 & param1;
                        var6 = (param1 >> -895539287 & 16256) + ((param1 & 32603) >> -2013817272);
                        this.f(var5, var6, -106);
                        return;
                      }
                    } else {
                      var5 = param1 & 15;
                      var6 = 127 & param1 >> -1218098008;
                      this.e(var5, 872, var6);
                      return;
                    }
                  }
                } else {
                  L1: {
                    var5 = 15 & param1;
                    var6 = (32739 & param1) >> 946022152;
                    var7 = (8326702 & param1) >> 1924197264;
                    if ((var6 ^ -1) != -1) {
                      break L1;
                    } else {
                      this.field_K[var5] = (var7 << 1211463598) + vg.c(-2080769, this.field_K[var5]);
                      break L1;
                    }
                  }
                  L2: {
                    if ((var6 ^ -1) != -33) {
                      break L2;
                    } else {
                      this.field_K[var5] = vg.c(-16257, this.field_K[var5]) - -(var7 << 1148169351);
                      break L2;
                    }
                  }
                  L3: {
                    if (1 != var6) {
                      break L3;
                    } else {
                      this.field_p[var5] = vg.c(this.field_p[var5], -16257) - -(var7 << -778543673);
                      break L3;
                    }
                  }
                  L4: {
                    if (-34 != (var6 ^ -1)) {
                      break L4;
                    } else {
                      this.field_p[var5] = vg.c(-128, this.field_p[var5]) + var7;
                      break L4;
                    }
                  }
                  L5: {
                    if (5 == var6) {
                      this.field_y[var5] = vg.c(this.field_y[var5], -16257) + (var7 << 1842132039);
                      break L5;
                    } else {
                      break L5;
                    }
                  }
                  L6: {
                    if ((var6 ^ -1) == -38) {
                      this.field_y[var5] = vg.c(-128, this.field_y[var5]) - -var7;
                      break L6;
                    } else {
                      break L6;
                    }
                  }
                  L7: {
                    if (7 == var6) {
                      this.field_z[var5] = (var7 << 440107527) + vg.c(this.field_z[var5], -16257);
                      break L7;
                    } else {
                      break L7;
                    }
                  }
                  L8: {
                    if (39 != var6) {
                      break L8;
                    } else {
                      this.field_z[var5] = var7 + vg.c(this.field_z[var5], -128);
                      break L8;
                    }
                  }
                  L9: {
                    if (var6 == 10) {
                      this.field_N[var5] = vg.c(this.field_N[var5], -16257) + (var7 << -522526457);
                      break L9;
                    } else {
                      break L9;
                    }
                  }
                  L10: {
                    if ((var6 ^ -1) != -43) {
                      break L10;
                    } else {
                      this.field_N[var5] = vg.c(-128, this.field_N[var5]) + var7;
                      break L10;
                    }
                  }
                  L11: {
                    if (11 != var6) {
                      break L11;
                    } else {
                      this.field_C[var5] = (var7 << 1839825159) + vg.c(this.field_C[var5], -16257);
                      break L11;
                    }
                  }
                  L12: {
                    if (var6 == 43) {
                      this.field_C[var5] = var7 + vg.c(-128, this.field_C[var5]);
                      break L12;
                    } else {
                      break L12;
                    }
                  }
                  L13: {
                    if ((var6 ^ -1) != -65) {
                      break L13;
                    } else {
                      L14: {
                        if ((var7 ^ -1) <= -65) {
                          break L14;
                        } else {
                          this.field_v[var5] = vg.c(this.field_v[var5], -2);
                          if (var9 == 0) {
                            break L13;
                          } else {
                            break L14;
                          }
                        }
                      }
                      this.field_v[var5] = cl.b(this.field_v[var5], 1);
                      break L13;
                    }
                  }
                  L15: {
                    if (-66 != (var6 ^ -1)) {
                      break L15;
                    } else {
                      L16: {
                        if ((var7 ^ -1) <= -65) {
                          break L16;
                        } else {
                          this.a(-60, var5);
                          this.field_v[var5] = vg.c(this.field_v[var5], -3);
                          if (var9 == 0) {
                            break L15;
                          } else {
                            break L16;
                          }
                        }
                      }
                      this.field_v[var5] = cl.b(this.field_v[var5], 2);
                      break L15;
                    }
                  }
                  L17: {
                    if (-100 == (var6 ^ -1)) {
                      this.field_o[var5] = vg.c(127, this.field_o[var5]) - -(var7 << -142484697);
                      break L17;
                    } else {
                      break L17;
                    }
                  }
                  L18: {
                    if ((var6 ^ -1) == -99) {
                      this.field_o[var5] = vg.c(this.field_o[var5], 16256) + var7;
                      break L18;
                    } else {
                      break L18;
                    }
                  }
                  L19: {
                    if ((var6 ^ -1) != -102) {
                      break L19;
                    } else {
                      this.field_o[var5] = vg.c(127, this.field_o[var5]) + 16384 - -(var7 << 1185966311);
                      break L19;
                    }
                  }
                  L20: {
                    if (100 == var6) {
                      this.field_o[var5] = vg.c(this.field_o[var5], 16256) + (16384 - -var7);
                      break L20;
                    } else {
                      break L20;
                    }
                  }
                  L21: {
                    if (120 != var6) {
                      break L21;
                    } else {
                      this.b(var5, (byte) 102);
                      break L21;
                    }
                  }
                  L22: {
                    if ((var6 ^ -1) != -122) {
                      break L22;
                    } else {
                      this.a(var5, (byte) 59);
                      break L22;
                    }
                  }
                  L23: {
                    if (123 != var6) {
                      break L23;
                    } else {
                      this.d(-107, var5);
                      break L23;
                    }
                  }
                  L24: {
                    if ((var6 ^ -1) != -7) {
                      break L24;
                    } else {
                      var8 = this.field_o[var5];
                      if ((var8 ^ -1) != -16385) {
                        break L24;
                      } else {
                        this.field_F[var5] = vg.c(this.field_F[var5], -16257) - -(var7 << 406145063);
                        break L24;
                      }
                    }
                  }
                  L25: {
                    if (38 != var6) {
                      break L25;
                    } else {
                      var8 = this.field_o[var5];
                      if ((var8 ^ -1) != -16385) {
                        break L25;
                      } else {
                        this.field_F[var5] = vg.c(this.field_F[var5], -128) + var7;
                        break L25;
                      }
                    }
                  }
                  L26: {
                    if (16 != var6) {
                      break L26;
                    } else {
                      this.field_P[var5] = vg.c(this.field_P[var5], -16257) + (var7 << 1428831047);
                      break L26;
                    }
                  }
                  L27: {
                    if (-49 == (var6 ^ -1)) {
                      this.field_P[var5] = vg.c(-128, this.field_P[var5]) + var7;
                      break L27;
                    } else {
                      break L27;
                    }
                  }
                  L28: {
                    if (-82 != (var6 ^ -1)) {
                      break L28;
                    } else {
                      L29: {
                        if (64 > var7) {
                          break L29;
                        } else {
                          this.field_v[var5] = cl.b(this.field_v[var5], 4);
                          if (var9 == 0) {
                            break L28;
                          } else {
                            break L29;
                          }
                        }
                      }
                      this.c(var5, 42);
                      this.field_v[var5] = vg.c(this.field_v[var5], -5);
                      break L28;
                    }
                  }
                  L30: {
                    if (var6 == 17) {
                      this.a(var5, false, (this.field_t[var5] & -16257) + (var7 << 1589260231));
                      break L30;
                    } else {
                      break L30;
                    }
                  }
                  if ((var6 ^ -1) != -50) {
                    break L0;
                  } else {
                    this.a(var5, false, (-128 & this.field_t[var5]) - -var7);
                    return;
                  }
                }
              } else {
                var5 = param1 & 15;
                var6 = param1 >> 634440360 & 127;
                var7 = 127 & param1 >> 629913488;
                this.a(8373600, var5, var7, var6);
                return;
              }
            } else {
              L31: {
                var5 = 15 & param1;
                var6 = (32665 & param1) >> -751498488;
                var7 = (8354010 & param1) >> 187725712;
                if ((var7 ^ -1) < -1) {
                  break L31;
                } else {
                  this.c(0, 64, var6, var5);
                  if (var9 == 0) {
                    break L0;
                  } else {
                    break L31;
                  }
                }
              }
              this.b(var5, var6, var7, -106);
              return;
            }
          }
          return;
        }
    }

    private final void a(int param0, int param1, int param2) {
        ag discarded$0 = null;
        this.field_G[param2] = param1;
        this.field_K[param2] = vg.c(param1, -128);
        this.d(param1, param2, 73);
        if (param0 != 14731) {
            discarded$0 = this.d();
        }
    }

    public static void e(int param0) {
        field_L = null;
        if (param0 > -24) {
            field_q = -58;
        }
    }

    private final int a(kc param0, int param1) {
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
              if (param1 == 1135851910) {
                break L1;
              } else {
                this.d(-62, 28);
                break L1;
              }
            }
            var3_int = this.field_N[param0.field_u];
            if ((var3_int ^ -1) > -8193) {
              stackOut_5_0 = var3_int * param0.field_k - -32 >> 1135851910;
              stackIn_6_0 = stackOut_5_0;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackOut_3_0 = 16384 - ((128 - param0.field_k) * (-var3_int + 16384) - -32 >> -2045770586);
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
            stackOut_7_1 = new StringBuilder().append("lc.LA(");
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
          throw ch.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0;
        } else {
          return stackIn_6_0;
        }
    }

    final static void c(boolean param0) {
        RuntimeException var1 = null;
        int var2 = 0;
        int[] var3 = null;
        int[] var4 = null;
        hj var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int[] var9 = null;
        gd var10 = null;
        hj var11 = null;
        int[] var12 = null;
        oh var13 = null;
        oh var14 = null;
        int[] var15 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var8 = Transmogrify.field_A ? 1 : 0;
        try {
          L0: {
            L1: {
              var11 = nf.field_l;
              if (!param0) {
                break L1;
              } else {
                field_L = (String) null;
                break L1;
              }
            }
            L2: {
              L3: {
                var2 = var11.d((byte) 27);
                if (var2 != 0) {
                  break L3;
                } else {
                  var15 = rf.c(false);
                  var12 = var15;
                  var3 = var12;
                  var9 = var3;
                  var4 = var9;
                  var5 = var11;
                  var6 = ((oa) ((Object) var5)).d((byte) 48);
                  var7 = 0;
                  L4: while (true) {
                    L5: {
                      if (var6 <= var7) {
                        break L5;
                      } else {
                        var9[var7] = ((oa) ((Object) var5)).c((byte) -124);
                        var7++;
                        if (var8 != 0) {
                          break L2;
                        } else {
                          if (var8 == 0) {
                            continue L4;
                          } else {
                            break L5;
                          }
                        }
                      }
                    }
                    var13 = (oh) ((Object) oc.field_G.a((byte) -95));
                    if (var13 == null) {
                      pc.a(1);
                      decompiledRegionSelector0 = 0;
                      break L0;
                    } else {
                      var13.field_i = true;
                      var13.field_k = var15[0];
                      var13.field_g = var3;
                      var13.c(5);
                      if (var8 == 0) {
                        break L2;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
              }
              L6: {
                if (var2 == 1) {
                  break L6;
                } else {
                  L7: {
                    if ((var2 ^ -1) == -3) {
                      break L7;
                    } else {
                      d.a((Throwable) null, 63, "A1: " + ik.q(48));
                      pc.a(1);
                      if (var8 == 0) {
                        break L2;
                      } else {
                        break L7;
                      }
                    }
                  }
                  var14 = (oh) ((Object) oc.field_G.a((byte) -95));
                  if (var14 != null) {
                    var14.field_g = rf.c(false);
                    var14.field_k = var14.field_g[0];
                    var14.field_i = true;
                    var14.c(5);
                    if (var8 == 0) {
                      break L2;
                    } else {
                      break L6;
                    }
                  } else {
                    pc.a(1);
                    decompiledRegionSelector0 = 1;
                    break L0;
                  }
                }
              }
              var10 = (gd) ((Object) rh.field_r.a((byte) -95));
              if (var10 != null) {
                var10.c(5);
                break L2;
              } else {
                pc.a(1);
                decompiledRegionSelector0 = 2;
                break L0;
              }
            }
            decompiledRegionSelector0 = 3;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw ch.a((Throwable) ((Object) var1), "lc.FA(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return;
            } else {
              return;
            }
          }
        }
    }

    final synchronized ag a() {
        return null;
    }

    private final void a(int param0, boolean param1, int param2) {
        boolean discarded$0 = false;
        this.field_t[param0] = param2;
        this.field_D[param0] = (int)(2097152.0 * Math.pow(2.0, 0.00054931640625 * (double)param2) + 0.5);
        if (param1) {
            kc var5 = (kc) null;
            discarded$0 = this.a(101, (kc) null);
        }
    }

    private final void c(int param0, int param1) {
        kc var3 = null;
        int var4 = 0;
        int stackIn_4_0 = 0;
        int stackIn_4_1 = 0;
        int stackIn_8_0 = 0;
        int stackIn_8_1 = 0;
        int stackOut_3_0 = 0;
        int stackOut_3_1 = 0;
        int stackOut_7_0 = 0;
        int stackOut_7_1 = 0;
        L0: {
          L1: {
            var4 = Transmogrify.field_A ? 1 : 0;
            if (0 == (4 & this.field_v[param0])) {
              break L1;
            } else {
              var3 = (kc) ((Object) this.field_m.field_q.a((byte) -95));
              L2: while (true) {
                if (var3 == null) {
                  break L1;
                } else {
                  stackOut_3_0 = param0 ^ -1;
                  stackOut_3_1 = var3.field_u ^ -1;
                  stackIn_8_0 = stackOut_3_0;
                  stackIn_8_1 = stackOut_3_1;
                  stackIn_4_0 = stackOut_3_0;
                  stackIn_4_1 = stackOut_3_1;
                  if (var4 != 0) {
                    break L0;
                  } else {
                    L3: {
                      if (stackIn_4_0 != stackIn_4_1) {
                        break L3;
                      } else {
                        var3.field_n = 0;
                        break L3;
                      }
                    }
                    var3 = (kc) ((Object) this.field_m.field_q.a(true));
                    if (var4 == 0) {
                      continue L2;
                    } else {
                      break L1;
                    }
                  }
                }
              }
            }
          }
          stackOut_7_0 = param1;
          stackOut_7_1 = 12;
          stackIn_8_0 = stackOut_7_0;
          stackIn_8_1 = stackOut_7_1;
          break L0;
        }
        L4: {
          if (stackIn_8_0 >= stackIn_8_1) {
            break L4;
          } else {
            this.a(-119, false, -13);
            break L4;
          }
        }
    }

    private final void d(int param0, int param1) {
        kc var3 = null;
        int var4 = 0;
        int var5 = 0;
        var5 = Transmogrify.field_A ? 1 : 0;
        var3 = (kc) ((Object) this.field_m.field_q.a((byte) -95));
        var4 = -103 / ((-19 - param0) / 37);
        L0: while (true) {
          L1: {
            if (var3 == null) {
              break L1;
            } else {
              if (var5 != 0) {
                break L1;
              } else {
                L2: {
                  L3: {
                    if (param1 < 0) {
                      break L3;
                    } else {
                      if (param1 == var3.field_u) {
                        break L3;
                      } else {
                        break L2;
                      }
                    }
                  }
                  if (-1 < (var3.field_p ^ -1)) {
                    this.field_u[var3.field_u][var3.field_i] = null;
                    var3.field_p = 0;
                    break L2;
                  } else {
                    break L2;
                  }
                }
                var3 = (kc) ((Object) this.field_m.field_q.a(true));
                if (var5 == 0) {
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

    final synchronized void d(boolean param0) {
        int var3 = 0;
        si var4 = null;
        var3 = Transmogrify.field_A ? 1 : 0;
        if (param0) {
          var4 = (si) ((Object) this.field_Q.b(1000));
          L0: while (true) {
            L1: {
              if (var4 == null) {
                break L1;
              } else {
                var4.d(75);
                var4 = (si) ((Object) this.field_Q.a(44));
                if (var3 != 0) {
                  break L1;
                } else {
                  if (var3 == 0) {
                    continue L0;
                  } else {
                    break L1;
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

    private final void a(int param0, int param1, int param2, int param3) {
        if (param0 != 8373600) {
            this.a((byte) 42, false);
        }
    }

    private final void b(int param0, byte param1) {
        int var3 = 0;
        kc var4 = null;
        int var5 = 0;
        var5 = Transmogrify.field_A ? 1 : 0;
        var3 = -100 / ((param1 - -68) / 44);
        var4 = (kc) ((Object) this.field_m.field_q.a((byte) -95));
        L0: while (true) {
          L1: {
            if (var4 == null) {
              break L1;
            } else {
              if (var5 != 0) {
                break L1;
              } else {
                L2: {
                  L3: {
                    if (param0 < 0) {
                      break L3;
                    } else {
                      if ((var4.field_u ^ -1) == (param0 ^ -1)) {
                        break L3;
                      } else {
                        break L2;
                      }
                    }
                  }
                  L4: {
                    if (var4.field_y == null) {
                      break L4;
                    } else {
                      L5: {
                        var4.field_y.f(qh.field_p / 100);
                        if (var4.field_y.e()) {
                          this.field_m.field_m.a(var4.field_y);
                          break L5;
                        } else {
                          break L5;
                        }
                      }
                      var4.b(false);
                      break L4;
                    }
                  }
                  L6: {
                    if (var4.field_p < 0) {
                      this.field_u[var4.field_u][var4.field_i] = null;
                      break L6;
                    } else {
                      break L6;
                    }
                  }
                  var4.c(5);
                  break L2;
                }
                var4 = (kc) ((Object) this.field_m.field_q.a(true));
                if (var5 == 0) {
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

    private final void a(boolean param0, boolean param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        L0: {
          L1: {
            var4 = Transmogrify.field_A ? 1 : 0;
            if (param1) {
              break L1;
            } else {
              this.d(69, -1);
              if (var4 == 0) {
                break L0;
              } else {
                break L1;
              }
            }
          }
          this.b(-1, (byte) -115);
          break L0;
        }
        this.a(-1, (byte) 48);
        var3 = 0;
        L2: while (true) {
          L3: {
            L4: {
              if (var3 >= 16) {
                break L4;
              } else {
                this.field_H[var3] = this.field_G[var3];
                var3++;
                if (var4 != 0) {
                  break L3;
                } else {
                  if (var4 == 0) {
                    continue L2;
                  } else {
                    break L4;
                  }
                }
              }
            }
            if (!param0) {
              break L3;
            } else {
              this.e(-49, -104, 66);
              break L3;
            }
          }
          var5 = 0;
          var3 = var5;
          L5: while (true) {
            L6: {
              if (var5 >= 16) {
                break L6;
              } else {
                this.field_K[var5] = vg.c(this.field_G[var5], -128);
                var5++;
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

    private final void a(int param0, byte param1) {
        int var4 = 0;
        var4 = Transmogrify.field_A ? 1 : 0;
        if ((param0 ^ -1) > -1) {
          param0 = 0;
          L0: while (true) {
            if ((param0 ^ -1) <= -17) {
              return;
            } else {
              this.a(param0, (byte) 76);
              param0++;
              if (var4 == 0) {
                continue L0;
              } else {
                return;
              }
            }
          }
        } else {
          L1: {
            this.field_z[param0] = 12800;
            this.field_N[param0] = 8192;
            this.field_C[param0] = 16383;
            this.field_M[param0] = 8192;
            this.field_p[param0] = 0;
            this.field_y[param0] = 8192;
            if (param1 >= 44) {
              break L1;
            } else {
              this.f(-32, 71, 26);
              break L1;
            }
          }
          this.a(-60, param0);
          this.c(param0, 79);
          this.field_v[param0] = 0;
          this.field_o[param0] = 32767;
          this.field_F[param0] = 256;
          this.field_P[param0] = 0;
          this.a(param0, false, 8192);
          return;
        }
    }

    final void a(boolean param0, boolean param1, kc param2) {
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
            L1: {
              L2: {
                var4_int = param2.field_t.field_l.length;
                if (!param1) {
                  break L2;
                } else {
                  if (!param2.field_t.field_i) {
                    break L2;
                  } else {
                    L3: {
                      var6 = -param2.field_t.field_k + (var4_int + var4_int);
                      var4_int = var4_int << 8;
                      var5 = (int)((long)this.field_P[param2.field_u] * (long)var6 >> -1595985722);
                      if (var5 >= var4_int) {
                        param2.field_y.b(true);
                        var5 = -var5 + var4_int + var4_int + -1;
                        break L3;
                      } else {
                        break L3;
                      }
                    }
                    if (!Transmogrify.field_A) {
                      break L1;
                    } else {
                      break L2;
                    }
                  }
                }
              }
              var5 = (int)((long)this.field_P[param2.field_u] * (long)var4_int >> 774211334);
              break L1;
            }
            L4: {
              param2.field_y.g(var5);
              if (!param0) {
                break L4;
              } else {
                this.field_s = 117L;
                break L4;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var4 = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) (var4);
            stackOut_10_1 = new StringBuilder().append("lc.TA(").append(param0).append(',').append(param1).append(',');
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param2 == null) {
              stackOut_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackOut_12_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L5;
            } else {
              stackOut_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackOut_11_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L5;
            }
          }
          throw ch.a((Throwable) ((Object) stackIn_13_0), stackIn_13_2 + ')');
        }
    }

    final synchronized ag d() {
        return (ag) ((Object) this.field_m);
    }

    private final void e(int param0, int param1, int param2) {
        if (param1 != 872) {
            this.field_N = (int[]) null;
        }
    }

    private final int b(kc param0, byte param1) {
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        nh var9 = null;
        nh var10 = null;
        int stackIn_3_0 = 0;
        int stackIn_21_0 = 0;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_2_0 = 0;
        int stackOut_20_0 = 0;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        try {
          L0: {
            if (-1 == (this.field_r[param0.field_u] ^ -1)) {
              stackOut_2_0 = 0;
              stackIn_3_0 = stackOut_2_0;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L1: {
                if (param1 == -77) {
                  break L1;
                } else {
                  this.d(7);
                  break L1;
                }
              }
              L2: {
                var9 = param0.field_s;
                var10 = var9;
                var4 = 4096 + this.field_C[param0.field_u] * this.field_z[param0.field_u] >> -1734686419;
                var4 = 16384 + var4 * var4 >> 1053535759;
                var4 = param0.field_B * var4 - -16384 >> 349674671;
                var4 = 128 + var4 * this.field_B >> -522568280;
                var4 = 128 + this.field_r[param0.field_u] * var4 >> 1663678024;
                if (-1 > (var10.field_k ^ -1)) {
                  var4 = (int)((double)var4 * Math.pow(0.5, (double)param0.field_z * 0.00001953125 * (double)var10.field_k) + 0.5);
                  break L2;
                } else {
                  break L2;
                }
              }
              L3: {
                if (var10.field_g != null) {
                  L4: {
                    var5 = param0.field_m;
                    var6 = var10.field_g[param0.field_q - -1];
                    if ((param0.field_q ^ -1) > (var10.field_g.length + -2 ^ -1)) {
                      var7 = var9.field_g[param0.field_q] << 523876200 & 65280;
                      var8 = (var10.field_g[2 + param0.field_q] & 255) << -1163948248;
                      var6 = var6 + (-var7 + var5) * (-var6 + var10.field_g[3 + param0.field_q]) / (-var7 + var8);
                      break L4;
                    } else {
                      break L4;
                    }
                  }
                  var4 = var6 * var4 - -32 >> 2110185798;
                  break L3;
                } else {
                  break L3;
                }
              }
              L5: {
                if ((param0.field_p ^ -1) >= -1) {
                  break L5;
                } else {
                  if (var10.field_c == null) {
                    break L5;
                  } else {
                    L6: {
                      var5 = param0.field_p;
                      var6 = var10.field_c[1 + param0.field_w];
                      if (param0.field_w >= var10.field_c.length - 2) {
                        break L6;
                      } else {
                        var7 = (var9.field_c[param0.field_w] & 255) << 1132711432;
                        var8 = (var10.field_c[param0.field_w - -2] & 255) << -357769432;
                        var6 = var6 + (var10.field_c[param0.field_w - -3] - var6) * (var5 + -var7) / (var8 - var7);
                        break L6;
                      }
                    }
                    var4 = var4 * var6 + 32 >> 892347430;
                    break L5;
                  }
                }
              }
              stackOut_20_0 = var4;
              stackIn_21_0 = stackOut_20_0;
              decompiledRegionSelector0 = 1;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var3 = decompiledCaughtException;
            stackOut_22_0 = (RuntimeException) (var3);
            stackOut_22_1 = new StringBuilder().append("lc.T(");
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
              break L7;
            } else {
              stackOut_23_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackOut_23_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackOut_23_2 = "{...}";
              stackIn_25_0 = stackOut_23_0;
              stackIn_25_1 = stackOut_23_1;
              stackIn_25_2 = stackOut_23_2;
              break L7;
            }
          }
          throw ch.a((Throwable) ((Object) stackIn_25_0), stackIn_25_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          return stackIn_21_0;
        }
    }

    final synchronized int b() {
        return 0;
    }

    final synchronized void a(boolean param0, int param1) {
        if (!param0) {
            this.field_B = 32;
        }
        this.field_w = param1;
    }

    private final void a(int param0, int param1) {
        kc var3 = null;
        int var4 = 0;
        L0: {
          var4 = Transmogrify.field_A ? 1 : 0;
          if (param0 == -60) {
            break L0;
          } else {
            this.field_F = (int[]) null;
            break L0;
          }
        }
        L1: {
          if (0 == (this.field_v[param1] & 2)) {
            break L1;
          } else {
            var3 = (kc) ((Object) this.field_m.field_q.a((byte) -95));
            L2: while (true) {
              L3: {
                if (var3 == null) {
                  break L3;
                } else {
                  if (var4 != 0) {
                    break L1;
                  } else {
                    L4: {
                      if (param1 != var3.field_u) {
                        break L4;
                      } else {
                        if (null == this.field_u[param1][var3.field_i]) {
                          if (var3.field_p >= 0) {
                            break L4;
                          } else {
                            var3.field_p = 0;
                            break L4;
                          }
                        } else {
                          break L4;
                        }
                      }
                    }
                    var3 = (kc) ((Object) this.field_m.field_q.a(true));
                    if (var4 == 0) {
                      continue L2;
                    } else {
                      break L3;
                    }
                  }
                }
              }
              break L1;
            }
          }
        }
    }

    private final void c(int param0, int param1, int param2, int param3) {
        kc var6 = null;
        int var7 = 0;
        kc var8 = null;
        var7 = Transmogrify.field_A ? 1 : 0;
        var8 = this.field_u[param3][param2];
        if (var8 == null) {
          return;
        } else {
          L0: {
            L1: {
              this.field_u[param3][param2] = null;
              if (param0 != (this.field_v[param3] & 2)) {
                break L1;
              } else {
                var8.field_p = 0;
                if (var7 == 0) {
                  break L0;
                } else {
                  break L1;
                }
              }
            }
            var6 = (kc) ((Object) this.field_m.field_q.a((byte) -95));
            L2: while (true) {
              L3: {
                if (var6 == null) {
                  break L3;
                } else {
                  if (var7 != 0) {
                    break L0;
                  } else {
                    L4: {
                      if ((var6.field_u ^ -1) != (var8.field_u ^ -1)) {
                        break L4;
                      } else {
                        if (-1 >= (var6.field_p ^ -1)) {
                          break L4;
                        } else {
                          if (var6 != var8) {
                            var8.field_p = 0;
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
                    }
                    var6 = (kc) ((Object) this.field_m.field_q.a(true));
                    if (var7 == 0) {
                      continue L2;
                    } else {
                      break L3;
                    }
                  }
                }
              }
              break L0;
            }
          }
          return;
        }
    }

    private final int a(kc param0, byte param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        nh var4 = null;
        int var5 = 0;
        int var6 = 0;
        double var7 = 0.0;
        hj var9 = null;
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
              var3_int = param0.field_C - -(param0.field_v * param0.field_x >> 1229498764);
              var3_int = var3_int + ((this.field_M[param0.field_u] - 8192) * this.field_F[param0.field_u] >> -749403796);
              if (param1 >= 82) {
                break L1;
              } else {
                var9 = (hj) null;
                lc.a((byte) 127, (hj) null);
                break L1;
              }
            }
            L2: {
              var4 = param0.field_s;
              if (-1 <= (var4.field_a ^ -1)) {
                break L2;
              } else {
                L3: {
                  if ((var4.field_e ^ -1) < -1) {
                    break L3;
                  } else {
                    if (this.field_p[param0.field_u] <= 0) {
                      break L2;
                    } else {
                      break L3;
                    }
                  }
                }
                L4: {
                  var5 = var4.field_e << 892999586;
                  var6 = var4.field_i << -1052185375;
                  if (param0.field_o >= var6) {
                    break L4;
                  } else {
                    var5 = var5 * param0.field_o / var6;
                    break L4;
                  }
                }
                var5 = var5 + (this.field_p[param0.field_u] >> -948271961);
                var7 = Math.sin((double)(param0.field_l & 511) * 0.01227184630308513);
                var3_int = var3_int + (int)(var7 * (double)var5);
                break L2;
              }
            }
            L5: {
              var5 = (int)((double)(256 * param0.field_t.field_h) * Math.pow(2.0, 0.0003255208333333333 * (double)var3_int) / (double)qh.field_p + 0.5);
              if (1 > var5) {
                stackOut_11_0 = 1;
                stackIn_12_0 = stackOut_11_0;
                break L5;
              } else {
                stackOut_10_0 = var5;
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
            stackOut_13_0 = (RuntimeException) (var3);
            stackOut_13_1 = new StringBuilder().append("lc.I(");
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param0 == null) {
              stackOut_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackOut_15_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L6;
            } else {
              stackOut_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackOut_14_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L6;
            }
          }
          throw ch.a((Throwable) ((Object) stackIn_16_0), stackIn_16_2 + ',' + param1 + ')');
        }
        return stackIn_12_0;
    }

    final synchronized boolean a(byte param0) {
        if (param0 > -25) {
            return true;
        }
        return this.field_I.e();
    }

    final static void a(byte param0, hj param1) {
        try {
            RuntimeException var2 = null;
            int var3 = 0;
            int var4 = 0;
            int var5 = 0;
            int var6 = 0;
            ClassNotFoundException var7 = null;
            InvalidClassException var7_ref = null;
            StreamCorruptedException var7_ref2 = null;
            OptionalDataException var7_ref3 = null;
            IllegalAccessException var7_ref4 = null;
            IllegalArgumentException var7_ref5 = null;
            java.lang.reflect.InvocationTargetException var7_ref6 = null;
            SecurityException var7_ref7 = null;
            IOException var7_ref8 = null;
            NullPointerException var7_ref9 = null;
            Exception var7_ref10 = null;
            Throwable var7_ref11 = null;
            int var7_int = 0;
            java.lang.reflect.Field var8 = null;
            int var9 = 0;
            Object[] var10 = null;
            int var11_int = 0;
            Object var11 = null;
            ObjectInputStream var12 = null;
            int var13 = 0;
            ba var14 = null;
            java.lang.reflect.Field var15 = null;
            Object var16 = null;
            ba var18 = null;
            Object var19 = null;
            Object var21 = null;
            Object var22 = null;
            byte[][] var25 = null;
            java.lang.reflect.Field var26 = null;
            java.lang.reflect.Field var27 = null;
            java.lang.reflect.Method var28 = null;
            java.lang.reflect.Method var29 = null;
            int stackIn_26_0 = 0;
            int stackIn_70_0 = 0;
            RuntimeException stackIn_73_0 = null;
            StringBuilder stackIn_73_1 = null;
            RuntimeException stackIn_74_0 = null;
            StringBuilder stackIn_74_1 = null;
            RuntimeException stackIn_75_0 = null;
            StringBuilder stackIn_75_1 = null;
            String stackIn_75_2 = null;
            int decompiledRegionSelector0 = 0;
            Throwable decompiledCaughtException = null;
            int stackOut_25_0 = 0;
            int stackOut_69_0 = 0;
            RuntimeException stackOut_72_0 = null;
            StringBuilder stackOut_72_1 = null;
            RuntimeException stackOut_74_0 = null;
            StringBuilder stackOut_74_1 = null;
            String stackOut_74_2 = null;
            RuntimeException stackOut_73_0 = null;
            StringBuilder stackOut_73_1 = null;
            String stackOut_73_2 = null;
            var19 = null;
            var16 = null;
            var21 = null;
            var22 = null;
            var13 = Transmogrify.field_A ? 1 : 0;
            try {
              L0: {
                var14 = (ba) ((Object) wg.field_f.a((byte) -95));
                var18 = var14;
                if (var18 == null) {
                  decompiledRegionSelector0 = 0;
                  break L0;
                } else {
                  var3 = 0;
                  var4 = 0;
                  L1: while (true) {
                    L2: {
                      L3: {
                        if (var4 >= var18.field_p) {
                          break L3;
                        } else {
                          if (var13 != 0) {
                            break L2;
                          } else {
                            L4: {
                              if (var14.field_m[var4] != null) {
                                L5: {
                                  if (-3 != (var14.field_m[var4].field_c ^ -1)) {
                                    break L5;
                                  } else {
                                    var14.field_k[var4] = -5;
                                    break L5;
                                  }
                                }
                                if (-1 != (var14.field_m[var4].field_c ^ -1)) {
                                  break L4;
                                } else {
                                  var3 = 1;
                                  break L4;
                                }
                              } else {
                                break L4;
                              }
                            }
                            L6: {
                              if (var14.field_o[var4] != null) {
                                L7: {
                                  if (var14.field_o[var4].field_c != 2) {
                                    break L7;
                                  } else {
                                    var14.field_k[var4] = -6;
                                    break L7;
                                  }
                                }
                                if (var14.field_o[var4].field_c != 0) {
                                  break L6;
                                } else {
                                  var3 = 1;
                                  break L6;
                                }
                              } else {
                                break L6;
                              }
                            }
                            var4++;
                            if (var13 == 0) {
                              continue L1;
                            } else {
                              break L3;
                            }
                          }
                        }
                      }
                      if (var3 != 0) {
                        break L2;
                      } else {
                        var4 = param1.field_h;
                        param1.a(-109, var18.field_i);
                        var5 = 117 % ((param0 - 0) / 44);
                        var6 = 0;
                        L8: while (true) {
                          L9: {
                            L10: {
                              if ((var18.field_p ^ -1) >= (var6 ^ -1)) {
                                break L10;
                              } else {
                                stackOut_25_0 = 0;
                                stackIn_70_0 = stackOut_25_0;
                                stackIn_26_0 = stackOut_25_0;
                                if (var13 != 0) {
                                  break L9;
                                } else {
                                  L11: {
                                    L12: {
                                      if (stackIn_26_0 != var14.field_k[var6]) {
                                        param1.f(6389, var14.field_k[var6]);
                                        if (var13 == 0) {
                                          break L11;
                                        } else {
                                          break L12;
                                        }
                                      } else {
                                        break L12;
                                      }
                                    }
                                    try {
                                      L13: {
                                        L14: {
                                          L15: {
                                            var7_int = var14.field_j[var6];
                                            if (0 != var7_int) {
                                              break L15;
                                            } else {
                                              var26 = (java.lang.reflect.Field) (var14.field_m[var6].field_g);
                                              var9 = var26.getInt((Object) null);
                                              param1.f(6389, 0);
                                              param1.a(-119, var9);
                                              if (var13 == 0) {
                                                break L14;
                                              } else {
                                                break L15;
                                              }
                                            }
                                          }
                                          L16: {
                                            if (var7_int != 1) {
                                              break L16;
                                            } else {
                                              var15 = (java.lang.reflect.Field) (var14.field_m[var6].field_g);
                                              var8 = var15;
                                              var15.setInt((Object) null, var14.field_h[var6]);
                                              param1.f(6389, 0);
                                              if (var13 == 0) {
                                                break L14;
                                              } else {
                                                break L16;
                                              }
                                            }
                                          }
                                          if ((var7_int ^ -1) != -3) {
                                            break L14;
                                          } else {
                                            var27 = (java.lang.reflect.Field) (var14.field_m[var6].field_g);
                                            var9 = var27.getModifiers();
                                            param1.f(6389, 0);
                                            param1.a(-107, var9);
                                            break L14;
                                          }
                                        }
                                        L17: {
                                          L18: {
                                            L19: {
                                              if ((var7_int ^ -1) != -4) {
                                                break L19;
                                              } else {
                                                var28 = (java.lang.reflect.Method) (var14.field_o[var6].field_g);
                                                var25 = var14.field_g[var6];
                                                var10 = new Object[var25.length];
                                                var11_int = 0;
                                                L20: while (true) {
                                                  L21: {
                                                    if (var25.length <= var11_int) {
                                                      break L21;
                                                    } else {
                                                      var12 = new ObjectInputStream((InputStream) ((Object) new ByteArrayInputStream(var25[var11_int])));
                                                      var10[var11_int] = var12.readObject();
                                                      var11_int++;
                                                      if (var13 != 0) {
                                                        break L18;
                                                      } else {
                                                        if (var13 == 0) {
                                                          continue L20;
                                                        } else {
                                                          break L21;
                                                        }
                                                      }
                                                    }
                                                  }
                                                  L22: {
                                                    L23: {
                                                      var11 = var28.invoke((Object) null, var10);
                                                      if (var11 != null) {
                                                        break L23;
                                                      } else {
                                                        param1.f(6389, 0);
                                                        if (var13 == 0) {
                                                          break L22;
                                                        } else {
                                                          break L23;
                                                        }
                                                      }
                                                    }
                                                    L24: {
                                                      if (!(var11 instanceof Number)) {
                                                        break L24;
                                                      } else {
                                                        param1.f(6389, 1);
                                                        param1.b(1908720528, ((Number) (var11)).longValue());
                                                        if (var13 == 0) {
                                                          break L22;
                                                        } else {
                                                          break L24;
                                                        }
                                                      }
                                                    }
                                                    L25: {
                                                      if (!(var11 instanceof String)) {
                                                        break L25;
                                                      } else {
                                                        param1.f(6389, 2);
                                                        param1.a(-110, (String) (var11));
                                                        if (var13 == 0) {
                                                          break L22;
                                                        } else {
                                                          break L25;
                                                        }
                                                      }
                                                    }
                                                    param1.f(6389, 4);
                                                    break L22;
                                                  }
                                                  if (var13 == 0) {
                                                    break L18;
                                                  } else {
                                                    break L19;
                                                  }
                                                }
                                              }
                                            }
                                            if (4 == var7_int) {
                                              var29 = (java.lang.reflect.Method) (var14.field_o[var6].field_g);
                                              var9 = var29.getModifiers();
                                              param1.f(6389, 0);
                                              param1.a(-107, var9);
                                              break L18;
                                            } else {
                                              break L17;
                                            }
                                          }
                                          break L17;
                                        }
                                        break L13;
                                      }
                                    } catch (java.lang.ClassNotFoundException decompiledCaughtParameter0) {
                                      decompiledCaughtException = decompiledCaughtParameter0;
                                      L26: {
                                        var7 = (ClassNotFoundException) (Object) decompiledCaughtException;
                                        param1.f(6389, -10);
                                        break L26;
                                      }
                                    } catch (java.io.InvalidClassException decompiledCaughtParameter1) {
                                      decompiledCaughtException = decompiledCaughtParameter1;
                                      L27: {
                                        var7_ref = (InvalidClassException) (Object) decompiledCaughtException;
                                        param1.f(6389, -11);
                                        break L27;
                                      }
                                    } catch (java.io.StreamCorruptedException decompiledCaughtParameter2) {
                                      decompiledCaughtException = decompiledCaughtParameter2;
                                      L28: {
                                        var7_ref2 = (StreamCorruptedException) (Object) decompiledCaughtException;
                                        param1.f(6389, -12);
                                        break L28;
                                      }
                                    } catch (java.io.OptionalDataException decompiledCaughtParameter3) {
                                      decompiledCaughtException = decompiledCaughtParameter3;
                                      L29: {
                                        var7_ref3 = (OptionalDataException) (Object) decompiledCaughtException;
                                        param1.f(6389, -13);
                                        break L29;
                                      }
                                    } catch (java.lang.IllegalAccessException decompiledCaughtParameter4) {
                                      decompiledCaughtException = decompiledCaughtParameter4;
                                      L30: {
                                        var7_ref4 = (IllegalAccessException) (Object) decompiledCaughtException;
                                        param1.f(6389, -14);
                                        break L30;
                                      }
                                    } catch (java.lang.IllegalArgumentException decompiledCaughtParameter5) {
                                      decompiledCaughtException = decompiledCaughtParameter5;
                                      L31: {
                                        var7_ref5 = (IllegalArgumentException) (Object) decompiledCaughtException;
                                        param1.f(6389, -15);
                                        break L31;
                                      }
                                    } catch (java.lang.reflect.InvocationTargetException decompiledCaughtParameter6) {
                                      decompiledCaughtException = decompiledCaughtParameter6;
                                      L32: {
                                        var7_ref6 = (java.lang.reflect.InvocationTargetException) (Object) decompiledCaughtException;
                                        param1.f(6389, -16);
                                        break L32;
                                      }
                                    } catch (java.lang.SecurityException decompiledCaughtParameter7) {
                                      decompiledCaughtException = decompiledCaughtParameter7;
                                      L33: {
                                        var7_ref7 = (SecurityException) (Object) decompiledCaughtException;
                                        param1.f(6389, -17);
                                        break L33;
                                      }
                                    } catch (java.io.IOException decompiledCaughtParameter8) {
                                      decompiledCaughtException = decompiledCaughtParameter8;
                                      L34: {
                                        var7_ref8 = (IOException) (Object) decompiledCaughtException;
                                        param1.f(6389, -18);
                                        break L34;
                                      }
                                    } catch (java.lang.NullPointerException decompiledCaughtParameter9) {
                                      decompiledCaughtException = decompiledCaughtParameter9;
                                      L35: {
                                        var7_ref9 = (NullPointerException) (Object) decompiledCaughtException;
                                        param1.f(6389, -19);
                                        break L35;
                                      }
                                    } catch (java.lang.Exception decompiledCaughtParameter10) {
                                      decompiledCaughtException = decompiledCaughtParameter10;
                                      L36: {
                                        var7_ref10 = (Exception) (Object) decompiledCaughtException;
                                        param1.f(6389, -20);
                                        break L36;
                                      }
                                    } catch (java.lang.Throwable decompiledCaughtParameter11) {
                                      decompiledCaughtException = decompiledCaughtParameter11;
                                      L37: {
                                        var7_ref11 = decompiledCaughtException;
                                        param1.f(6389, -21);
                                        break L37;
                                      }
                                    }
                                    break L11;
                                  }
                                  var6++;
                                  if (var13 == 0) {
                                    continue L8;
                                  } else {
                                    break L10;
                                  }
                                }
                              }
                            }
                            stackOut_69_0 = param1.d(var4, -1323322296);
                            stackIn_70_0 = stackOut_69_0;
                            break L9;
                          }
                          var18.c(5);
                          decompiledRegionSelector0 = 2;
                          break L0;
                        }
                      }
                    }
                    decompiledRegionSelector0 = 1;
                    break L0;
                  }
                }
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter12) {
              decompiledCaughtException = decompiledCaughtParameter12;
              L38: {
                var2 = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_72_0 = (RuntimeException) (var2);
                stackOut_72_1 = new StringBuilder().append("lc.S(").append(param0).append(',');
                stackIn_74_0 = stackOut_72_0;
                stackIn_74_1 = stackOut_72_1;
                stackIn_73_0 = stackOut_72_0;
                stackIn_73_1 = stackOut_72_1;
                if (param1 == null) {
                  stackOut_74_0 = (RuntimeException) ((Object) stackIn_74_0);
                  stackOut_74_1 = (StringBuilder) ((Object) stackIn_74_1);
                  stackOut_74_2 = "null";
                  stackIn_75_0 = stackOut_74_0;
                  stackIn_75_1 = stackOut_74_1;
                  stackIn_75_2 = stackOut_74_2;
                  break L38;
                } else {
                  stackOut_73_0 = (RuntimeException) ((Object) stackIn_73_0);
                  stackOut_73_1 = (StringBuilder) ((Object) stackIn_73_1);
                  stackOut_73_2 = "{...}";
                  stackIn_75_0 = stackOut_73_0;
                  stackIn_75_1 = stackOut_73_1;
                  stackIn_75_2 = stackOut_73_2;
                  break L38;
                }
              }
              throw ch.a((Throwable) ((Object) stackIn_75_0), stackIn_75_2 + ')');
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
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    private final void d(int param0, int param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        pl var6 = null;
        L0: {
          var5 = Transmogrify.field_A ? 1 : 0;
          if (param2 >= 64) {
            break L0;
          } else {
            var6 = (pl) null;
            this.a(false, (pl) null, true, (byte) 16);
            break L0;
          }
        }
        L1: {
          if (this.field_H[param1] == param0) {
            break L1;
          } else {
            this.field_H[param1] = param0;
            var4 = 0;
            L2: while (true) {
              if (var4 >= 128) {
                break L1;
              } else {
                this.field_l[param1][var4] = null;
                var4++;
                if (var5 != 0) {
                  break L1;
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
    }

    private final void b(int param0, int param1, int param2, int param3) {
        kc var5 = null;
        int var6_int = 0;
        hb var6 = null;
        kc var7 = null;
        kc var8 = null;
        int var9 = 0;
        si var10 = null;
        si var11 = null;
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
          var9 = Transmogrify.field_A ? 1 : 0;
          this.c(0, 64, param1, param0);
          if ((2 & this.field_v[param0] ^ -1) != -1) {
            var5 = (kc) ((Object) this.field_m.field_q.b(-10231));
            L1: while (true) {
              if (var5 == null) {
                break L0;
              } else {
                L2: {
                  if (param0 != var5.field_u) {
                    break L2;
                  } else {
                    if (0 > var5.field_p) {
                      this.field_u[param0][var5.field_i] = null;
                      this.field_u[param0][param1] = var5;
                      var6_int = var5.field_C + (var5.field_x * var5.field_v >> 1458445356);
                      var5.field_C = var5.field_C + (-var5.field_i + param1 << -978726072);
                      var5.field_x = 4096;
                      var5.field_v = -var5.field_C + var6_int;
                      var5.field_i = param1;
                      return;
                    } else {
                      break L2;
                    }
                  }
                }
                var5 = (kc) ((Object) this.field_m.field_q.f(-33));
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
        var10 = (si) ((Object) this.field_Q.a((long)this.field_H[param0], 0));
        var11 = var10;
        if (var11 == null) {
          return;
        } else {
          L3: {
            if (param3 < -76) {
              break L3;
            } else {
              this.f(-47);
              break L3;
            }
          }
          var6 = var10.field_j[param1];
          if (var6 != null) {
            L4: {
              L5: {
                var7 = new kc();
                var7.field_u = param0;
                var7.field_t = var6;
                var7.field_h = var10;
                var7.field_s = var10.field_m[param1];
                var7.field_j = var10.field_g[param1];
                var7.field_i = param1;
                var7.field_B = var10.field_n[param1] * param2 * (param2 * var11.field_h) - -1024 >> -19647541;
                var7.field_k = var10.field_p[param1] & 255;
                var7.field_C = (param1 << -1398526296) - (32767 & var10.field_k[param1]);
                var7.field_m = 0;
                var7.field_w = 0;
                var7.field_q = 0;
                var7.field_p = -1;
                var7.field_z = 0;
                if (this.field_P[param0] == 0) {
                  break L5;
                } else {
                  L6: {
                    var7.field_y = bb.a(var6, this.a(var7, (byte) 123), 0, this.a(var7, 1135851910));
                    stackOut_17_0 = this;
                    stackOut_17_1 = 0;
                    stackIn_19_0 = stackOut_17_0;
                    stackIn_19_1 = stackOut_17_1;
                    stackIn_18_0 = stackOut_17_0;
                    stackIn_18_1 = stackOut_17_1;
                    if (-1 >= (var10.field_k[param1] ^ -1)) {
                      stackOut_19_0 = this;
                      stackOut_19_1 = stackIn_19_1;
                      stackOut_19_2 = 0;
                      stackIn_20_0 = stackOut_19_0;
                      stackIn_20_1 = stackOut_19_1;
                      stackIn_20_2 = stackOut_19_2;
                      break L6;
                    } else {
                      stackOut_18_0 = this;
                      stackOut_18_1 = stackIn_18_1;
                      stackOut_18_2 = 1;
                      stackIn_20_0 = stackOut_18_0;
                      stackIn_20_1 = stackOut_18_1;
                      stackIn_20_2 = stackOut_18_2;
                      break L6;
                    }
                  }
                  this.a(stackIn_20_1 != 0, stackIn_20_2 != 0, var7);
                  if (var9 == 0) {
                    break L4;
                  } else {
                    break L5;
                  }
                }
              }
              var7.field_y = bb.a(var6, this.a(var7, (byte) 106), this.b(var7, (byte) -77), this.a(var7, 1135851910));
              break L4;
            }
            L7: {
              if (var10.field_k[param1] < 0) {
                var7.field_y.h(-1);
                break L7;
              } else {
                break L7;
              }
            }
            L8: {
              if (0 > var7.field_j) {
                break L8;
              } else {
                L9: {
                  var8 = this.field_l[param0][var7.field_j];
                  if (var8 == null) {
                    break L9;
                  } else {
                    if (var8.field_p < 0) {
                      this.field_u[param0][var8.field_i] = null;
                      var8.field_p = 0;
                      break L9;
                    } else {
                      break L9;
                    }
                  }
                }
                this.field_l[param0][var7.field_j] = var7;
                break L8;
              }
            }
            this.field_m.field_q.a(var7, -107);
            this.field_u[param0][param1] = var7;
            return;
          } else {
            return;
          }
        }
    }

    private final synchronized void a(byte param0, boolean param1) {
        this.field_I.g();
        this.field_x = null;
        int var3 = 14 / ((param0 - 11) / 49);
        this.a(false, param1);
    }

    final boolean a(byte param0, int param1, int param2, int[] param3, kc param4) {
        RuntimeException var6 = null;
        int var6_int = 0;
        nh var7 = null;
        int var8 = 0;
        double var9 = 0.0;
        int var11 = 0;
        int stackIn_9_0 = 0;
        int stackIn_17_0 = 0;
        int stackIn_33_0 = 0;
        int stackIn_33_1 = 0;
        int stackIn_37_0 = 0;
        int stackIn_37_1 = 0;
        int stackIn_52_0 = 0;
        int stackIn_52_1 = 0;
        int stackIn_56_0 = 0;
        int stackIn_56_1 = 0;
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
        int stackOut_32_0 = 0;
        int stackOut_32_1 = 0;
        int stackOut_36_0 = 0;
        int stackOut_36_1 = 0;
        int stackOut_51_0 = 0;
        int stackOut_51_1 = 0;
        int stackOut_55_0 = 0;
        int stackOut_55_1 = 0;
        int stackOut_72_0 = 0;
        int stackOut_70_0 = 0;
        int stackOut_16_0 = 0;
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
        var11 = Transmogrify.field_A ? 1 : 0;
        try {
          L0: {
            L1: {
              param4.field_r = qh.field_p / 100;
              if (0 > param4.field_p) {
                break L1;
              } else {
                L2: {
                  if (param4.field_y == null) {
                    break L2;
                  } else {
                    if (!param4.field_y.l()) {
                      break L1;
                    } else {
                      break L2;
                    }
                  }
                }
                L3: {
                  param4.b(false);
                  param4.c(5);
                  if (param4.field_j <= 0) {
                    break L3;
                  } else {
                    if (param4 != this.field_l[param4.field_u][param4.field_j]) {
                      break L3;
                    } else {
                      this.field_l[param4.field_u][param4.field_j] = null;
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
              var6_int = param4.field_x;
              if (-1 <= (var6_int ^ -1)) {
                break L4;
              } else {
                L5: {
                  var6_int = var6_int - (int)(0.5 + Math.pow(2.0, (double)this.field_y[param4.field_u] * 0.0004921259842519685) * 16.0);
                  if ((var6_int ^ -1) > -1) {
                    var6_int = 0;
                    break L5;
                  } else {
                    break L5;
                  }
                }
                param4.field_x = var6_int;
                break L4;
              }
            }
            param4.field_y.e(this.a(param4, (byte) 94));
            if (param0 >= 116) {
              L6: {
                var7 = param4.field_s;
                var8 = 0;
                param4.field_l = param4.field_l + var7.field_a;
                param4.field_o = param4.field_o + 1;
                var9 = 0.000005086263020833333 * (double)((-60 + param4.field_i << 68355432) - -(param4.field_v * param4.field_x >> 1729402156));
                if (var7.field_k <= 0) {
                  break L6;
                } else {
                  L7: {
                    L8: {
                      if (var7.field_b <= 0) {
                        break L8;
                      } else {
                        param4.field_z = param4.field_z + (int)(128.0 * Math.pow(2.0, var9 * (double)var7.field_b) + 0.5);
                        if (var11 == 0) {
                          break L7;
                        } else {
                          break L8;
                        }
                      }
                    }
                    param4.field_z = param4.field_z + 128;
                    break L7;
                  }
                  if (-819201 >= (param4.field_z * var7.field_k ^ -1)) {
                    var8 = 1;
                    break L6;
                  } else {
                    break L6;
                  }
                }
              }
              L9: {
                if (var7.field_g == null) {
                  break L9;
                } else {
                  L10: {
                    L11: {
                      if (var7.field_f <= 0) {
                        break L11;
                      } else {
                        param4.field_m = param4.field_m + (int)(128.0 * Math.pow(2.0, var9 * (double)var7.field_f) + 0.5);
                        if (var11 == 0) {
                          break L10;
                        } else {
                          break L11;
                        }
                      }
                    }
                    param4.field_m = param4.field_m + 128;
                    break L10;
                  }
                  L12: while (true) {
                    L13: {
                      L14: {
                        if (param4.field_q >= var7.field_g.length - 2) {
                          break L14;
                        } else {
                          stackOut_32_0 = param4.field_m;
                          stackOut_32_1 = (255 & var7.field_g[2 + param4.field_q]) << 1029106728;
                          stackIn_37_0 = stackOut_32_0;
                          stackIn_37_1 = stackOut_32_1;
                          stackIn_33_0 = stackOut_32_0;
                          stackIn_33_1 = stackOut_32_1;
                          if (var11 != 0) {
                            break L13;
                          } else {
                            if (stackIn_33_0 <= stackIn_33_1) {
                              break L14;
                            } else {
                              param4.field_q = param4.field_q + 2;
                              if (var11 == 0) {
                                continue L12;
                              } else {
                                break L14;
                              }
                            }
                          }
                        }
                      }
                      stackOut_36_0 = param4.field_q;
                      stackOut_36_1 = var7.field_g.length + -2;
                      stackIn_37_0 = stackOut_36_0;
                      stackIn_37_1 = stackOut_36_1;
                      break L13;
                    }
                    if (stackIn_37_0 != stackIn_37_1) {
                      break L9;
                    } else {
                      if (-1 != (var7.field_g[param4.field_q - -1] ^ -1)) {
                        break L9;
                      } else {
                        var8 = 1;
                        break L9;
                      }
                    }
                  }
                }
              }
              L15: {
                if ((param4.field_p ^ -1) > -1) {
                  break L15;
                } else {
                  if (null == var7.field_c) {
                    break L15;
                  } else {
                    if ((1 & this.field_v[param4.field_u]) != 0) {
                      break L15;
                    } else {
                      L16: {
                        if (0 > param4.field_j) {
                          break L16;
                        } else {
                          if (this.field_l[param4.field_u][param4.field_j] != param4) {
                            break L16;
                          } else {
                            break L15;
                          }
                        }
                      }
                      L17: {
                        L18: {
                          if (var7.field_d <= 0) {
                            break L18;
                          } else {
                            param4.field_p = param4.field_p + (int)(128.0 * Math.pow(2.0, var9 * (double)var7.field_d) + 0.5);
                            if (var11 == 0) {
                              break L17;
                            } else {
                              break L18;
                            }
                          }
                        }
                        param4.field_p = param4.field_p + 128;
                        break L17;
                      }
                      L19: while (true) {
                        L20: {
                          L21: {
                            if ((var7.field_c.length - 2 ^ -1) >= (param4.field_w ^ -1)) {
                              break L21;
                            } else {
                              stackOut_51_0 = param4.field_p;
                              stackOut_51_1 = (255 & var7.field_c[2 + param4.field_w]) << -1167185912;
                              stackIn_56_0 = stackOut_51_0;
                              stackIn_56_1 = stackOut_51_1;
                              stackIn_52_0 = stackOut_51_0;
                              stackIn_52_1 = stackOut_51_1;
                              if (var11 != 0) {
                                break L20;
                              } else {
                                if (stackIn_52_0 <= stackIn_52_1) {
                                  break L21;
                                } else {
                                  param4.field_w = param4.field_w + 2;
                                  if (var11 == 0) {
                                    continue L19;
                                  } else {
                                    break L21;
                                  }
                                }
                              }
                            }
                          }
                          stackOut_55_0 = param4.field_w ^ -1;
                          stackOut_55_1 = var7.field_c.length - 2 ^ -1;
                          stackIn_56_0 = stackOut_55_0;
                          stackIn_56_1 = stackOut_55_1;
                          break L20;
                        }
                        if (stackIn_56_0 != stackIn_56_1) {
                          break L15;
                        } else {
                          var8 = 1;
                          break L15;
                        }
                      }
                    }
                  }
                }
              }
              if (var8 == 0) {
                param4.field_y.a(param4.field_r, this.b(param4, (byte) -77), this.a(param4, 1135851910));
                stackOut_72_0 = 0;
                stackIn_73_0 = stackOut_72_0;
                decompiledRegionSelector0 = 3;
                break L0;
              } else {
                L22: {
                  L23: {
                    param4.field_y.f(param4.field_r);
                    if (param3 == null) {
                      break L23;
                    } else {
                      param4.field_y.b(param3, param1, param2);
                      if (var11 == 0) {
                        break L22;
                      } else {
                        break L23;
                      }
                    }
                  }
                  param4.field_y.d(param2);
                  break L22;
                }
                L24: {
                  if (!param4.field_y.e()) {
                    break L24;
                  } else {
                    this.field_m.field_m.a(param4.field_y);
                    break L24;
                  }
                }
                L25: {
                  param4.b(false);
                  if (param4.field_p >= 0) {
                    param4.c(5);
                    if (param4.field_j <= 0) {
                      break L25;
                    } else {
                      if (this.field_l[param4.field_u][param4.field_j] != param4) {
                        break L25;
                      } else {
                        this.field_l[param4.field_u][param4.field_j] = null;
                        break L25;
                      }
                    }
                  } else {
                    break L25;
                  }
                }
                stackOut_70_0 = 1;
                stackIn_71_0 = stackOut_70_0;
                decompiledRegionSelector0 = 2;
                break L0;
              }
            } else {
              stackOut_16_0 = 1;
              stackIn_17_0 = stackOut_16_0;
              decompiledRegionSelector0 = 1;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L26: {
            var6 = decompiledCaughtException;
            stackOut_74_0 = (RuntimeException) (var6);
            stackOut_74_1 = new StringBuilder().append("lc.GA(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_76_0 = stackOut_74_0;
            stackIn_76_1 = stackOut_74_1;
            stackIn_75_0 = stackOut_74_0;
            stackIn_75_1 = stackOut_74_1;
            if (param3 == null) {
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
            if (param4 == null) {
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
          throw ch.a((Throwable) ((Object) stackIn_80_0), stackIn_80_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_9_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_17_0 != 0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_71_0 != 0;
            } else {
              return stackIn_73_0 != 0;
            }
          }
        }
    }

    private final synchronized void a(boolean param0, pl param1, boolean param2, byte param3) {
        RuntimeException runtimeException = null;
        int var5_int = 0;
        int var6 = 0;
        int var7 = 0;
        Object stackIn_2_0 = null;
        Object stackIn_3_0 = null;
        Object stackIn_4_0 = null;
        int stackIn_4_1 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_1_0 = null;
        Object stackOut_3_0 = null;
        int stackOut_3_1 = 0;
        Object stackOut_2_0 = null;
        int stackOut_2_1 = 0;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        var7 = Transmogrify.field_A ? 1 : 0;
        try {
          L0: {
            L1: {
              this.a((byte) -100, param2);
              this.field_I.a(param1.field_g);
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
            ((lc) (this)).field_A = stackIn_4_1 != 0;
            this.field_O = 0L;
            var5_int = this.field_I.c();
            if (param3 == -81) {
              var6 = 0;
              L2: while (true) {
                L3: {
                  L4: {
                    if (var6 >= var5_int) {
                      break L4;
                    } else {
                      this.field_I.d(var6);
                      this.field_I.c(var6);
                      this.field_I.f(var6);
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
                  this.field_n = this.field_I.a();
                  this.field_J = this.field_I.field_a[this.field_n];
                  this.field_s = this.field_I.e(this.field_J);
                  break L3;
                }
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            runtimeException = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) (runtimeException);
            stackOut_13_1 = new StringBuilder().append("lc.RA(").append(param0).append(',');
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param1 == null) {
              stackOut_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackOut_15_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L5;
            } else {
              stackOut_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackOut_14_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L5;
            }
          }
          throw ch.a((Throwable) ((Object) stackIn_16_0), stackIn_16_2 + ',' + param2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final synchronized void c(int param0, int param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        var5 = Transmogrify.field_A ? 1 : 0;
        if (param2 == 0) {
          L0: {
            L1: {
              if (-1 >= (param0 ^ -1)) {
                break L1;
              } else {
                var4 = 0;
                L2: while (true) {
                  L3: {
                    if (var4 >= 16) {
                      break L3;
                    } else {
                      this.field_r[var4] = param1;
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
            this.field_r[param0] = param1;
            break L0;
          }
          return;
        } else {
          return;
        }
    }

    final synchronized void a(byte param0, int param1) {
        if (param0 <= 99) {
            this.field_G = (int[]) null;
        }
        this.field_B = param1;
    }

    final boolean a(int param0, kc param1) {
        RuntimeException var3 = null;
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
            L1: {
              if (param0 == 7) {
                break L1;
              } else {
                this.a(85, -70, 31);
                break L1;
              }
            }
            if (param1.field_y == null) {
              L2: {
                if (0 > param1.field_p) {
                  break L2;
                } else {
                  param1.c(5);
                  if (0 >= param1.field_j) {
                    break L2;
                  } else {
                    if (param1 != this.field_l[param1.field_u][param1.field_j]) {
                      break L2;
                    } else {
                      this.field_l[param1.field_u][param1.field_j] = null;
                      return true;
                    }
                  }
                }
              }
              stackOut_8_0 = 1;
              stackIn_9_0 = stackOut_8_0;
              break L0;
            } else {
              return false;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) (var3);
            stackOut_10_1 = new StringBuilder().append("lc.JA(").append(param0).append(',');
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
          throw ch.a((Throwable) ((Object) stackIn_13_0), stackIn_13_2 + ')');
        }
        return stackIn_9_0 != 0;
    }

    final synchronized void d(int param0) {
        int var2 = 0;
        long var3 = 0L;
        int var5 = 0;
        int var6 = 0;
        L0: {
          L1: {
            var6 = Transmogrify.field_A ? 1 : 0;
            if (!this.field_I.e()) {
              break L1;
            } else {
              var2 = this.field_w * this.field_I.field_h / qh.field_p;
              L2: while (true) {
                L3: {
                  var3 = (long)param0 * (long)var2 + this.field_O;
                  if (0L > -var3 + this.field_s) {
                    break L3;
                  } else {
                    this.field_O = var3;
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
                var5 = (int)((-1L + (this.field_s - this.field_O) + (long)var2) / (long)var2);
                this.field_O = this.field_O + (long)var5 * (long)var2;
                param0 = param0 - var5;
                this.field_m.d(var5);
                this.b(false);
                if (!this.field_I.e()) {
                  break L1;
                } else {
                  if (var6 == 0) {
                    continue L2;
                  } else {
                    this.field_m.d(param0);
                    break L0;
                  }
                }
              }
            }
          }
          this.field_m.d(param0);
          break L0;
        }
    }

    private final void f(int param0, int param1, int param2) {
        int var4 = 83 / ((-33 - param2) / 63);
        this.field_M[param0] = param1;
    }

    private final void b(boolean param0) {
        int var2 = 0;
        int var3 = 0;
        long var4 = 0L;
        int var6 = 0;
        int var7 = 0;
        int stackIn_7_0 = 0;
        int stackIn_7_1 = 0;
        int stackIn_9_0 = 0;
        int stackIn_9_1 = 0;
        int stackIn_11_0 = 0;
        int stackIn_11_1 = 0;
        int stackIn_26_0 = 0;
        int stackIn_26_1 = 0;
        int stackOut_6_0 = 0;
        int stackOut_6_1 = 0;
        int stackOut_8_0 = 0;
        int stackOut_8_1 = 0;
        int stackOut_10_0 = 0;
        int stackOut_10_1 = 0;
        int stackOut_25_0 = 0;
        int stackOut_25_1 = 0;
        var7 = Transmogrify.field_A ? 1 : 0;
        if (!param0) {
          L0: {
            var2 = this.field_n;
            var3 = this.field_J;
            var4 = this.field_s;
            if (this.field_x == null) {
              break L0;
            } else {
              if ((this.field_E ^ -1) != (var3 ^ -1)) {
                break L0;
              } else {
                this.a(this.field_A, this.field_x, this.field_k, (byte) -81);
                this.b(param0);
                return;
              }
            }
          }
          L1: while (true) {
            stackOut_6_0 = this.field_J;
            stackOut_6_1 = var3;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            L2: while (true) {
              L3: {
                L4: {
                  L5: {
                    if (stackIn_7_0 != stackIn_7_1) {
                      break L5;
                    } else {
                      L6: while (true) {
                        stackOut_8_0 = var3 ^ -1;
                        stackOut_8_1 = this.field_I.field_a[var2] ^ -1;
                        stackIn_26_0 = stackOut_8_0;
                        stackIn_26_1 = stackOut_8_1;
                        stackIn_9_0 = stackOut_8_0;
                        stackIn_9_1 = stackOut_8_1;
                        if (var7 != 0) {
                          break L4;
                        } else {
                          L7: {
                            if (stackIn_9_0 != stackIn_9_1) {
                              break L7;
                            } else {
                              this.field_I.d(var2);
                              var6 = this.field_I.b(var2);
                              stackOut_10_0 = var6 ^ -1;
                              stackOut_10_1 = -2;
                              stackIn_7_0 = stackOut_10_0;
                              stackIn_7_1 = stackOut_10_1;
                              stackIn_11_0 = stackOut_10_0;
                              stackIn_11_1 = stackOut_10_1;
                              if (var7 != 0) {
                                continue L2;
                              } else {
                                if (stackIn_11_0 != stackIn_11_1) {
                                  L8: {
                                    if (0 == (128 & var6)) {
                                      break L8;
                                    } else {
                                      this.b(-106, var6);
                                      break L8;
                                    }
                                  }
                                  this.field_I.c(var2);
                                  this.field_I.f(var2);
                                  if (var7 == 0) {
                                    continue L6;
                                  } else {
                                    break L7;
                                  }
                                } else {
                                  this.field_I.d();
                                  this.field_I.f(var2);
                                  if (!this.field_I.f()) {
                                    break L7;
                                  } else {
                                    if (null == this.field_x) {
                                      L9: {
                                        if (!this.field_A) {
                                          break L9;
                                        } else {
                                          if (var3 == 0) {
                                            break L9;
                                          } else {
                                            this.field_I.a(var4);
                                            if (var7 == 0) {
                                              break L7;
                                            } else {
                                              break L9;
                                            }
                                          }
                                        }
                                      }
                                      this.a(false, true);
                                      this.field_I.g();
                                      return;
                                    } else {
                                      this.a(-73, this.field_A, this.field_x);
                                      this.b(param0);
                                      return;
                                    }
                                  }
                                }
                              }
                            }
                          }
                          var2 = this.field_I.a();
                          var3 = this.field_I.field_a[var2];
                          var4 = this.field_I.e(var3);
                          if (var7 == 0) {
                            continue L1;
                          } else {
                            break L5;
                          }
                        }
                      }
                    }
                  }
                  this.field_n = var2;
                  this.field_s = var4;
                  this.field_J = var3;
                  if (null == this.field_x) {
                    break L3;
                  } else {
                    stackOut_25_0 = this.field_E;
                    stackOut_25_1 = var3;
                    stackIn_26_0 = stackOut_25_0;
                    stackIn_26_1 = stackOut_25_1;
                    break L4;
                  }
                }
                if (stackIn_26_0 >= stackIn_26_1) {
                  break L3;
                } else {
                  this.field_J = this.field_E;
                  this.field_n = -1;
                  this.field_s = this.field_I.e(this.field_J);
                  break L3;
                }
              }
              return;
            }
          }
        } else {
          return;
        }
    }

    final synchronized void b(int param0, int param1, int param2) {
        if (param2 != -23780) {
            return;
        }
        this.a(14731, param0, param1);
    }

    public lc() {
        this.field_y = new int[16];
        this.field_H = new int[16];
        this.field_l = new kc[16][128];
        this.field_p = new int[16];
        this.field_r = new int[16];
        this.field_M = new int[16];
        this.field_w = 1000000;
        this.field_G = new int[16];
        this.field_o = new int[16];
        this.field_t = new int[16];
        this.field_P = new int[16];
        this.field_D = new int[16];
        this.field_u = new kc[16][128];
        this.field_C = new int[16];
        this.field_B = 256;
        this.field_v = new int[16];
        this.field_F = new int[16];
        this.field_K = new int[16];
        this.field_N = new int[16];
        this.field_z = new int[16];
        this.field_I = new ul();
        this.field_m = new ej((lc) (this));
        this.field_Q = new fl(128);
        this.c(-1, 256, 0);
        this.a(false, true);
    }

    static {
        field_L = "Return to game";
    }
}
