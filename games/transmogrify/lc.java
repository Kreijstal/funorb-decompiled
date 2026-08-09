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
        int statePc = 0;
        Throwable caughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        Object var7 = null;
        wd var8 = null;
        int var9 = 0;
        si var10 = null;
        int var11 = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var11 = Transmogrify.field_A ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        param3.a();
                        if (!param1) {
                            statePc = 4;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        stackIn_3_0 = 0;
                        statePc = 3;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 3: {
                    return stackIn_3_0 != 0;
                }
                case 4: {
                    try {
                        var6_int = 1;
                        var7 = null;
                        if (-1 > (param0 ^ -1)) {
                            statePc = 6;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        var7 = new int[]{param0};
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        var8 = (wd) ((Object) param3.field_h.b(1000));
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        if (var8 == null) {
                            statePc = 17;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        var9 = (int)var8.field_c;
                        var10 = (si) ((Object) this.field_Q.a((long)var9, 0));
                        if (var11 != 0) {
                            statePc = 19;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        if (var10 != null) {
                            statePc = 14;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        var10 = ac.a(var9, 270, param4);
                        if (var10 != null) {
                            statePc = 13;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        var6_int = 0;
                        if (var11 == 0) {
                            statePc = 16;
                        } else {
                            statePc = 13;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        this.field_Q.a((long)var9, (byte) -66, var10);
                        statePc = 14;
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        if (var10.a(param2, (int[]) (var7), -1, var8.field_h)) {
                            statePc = 16;
                        } else {
                            statePc = 15;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        var6_int = 0;
                        statePc = 16;
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        var8 = (wd) ((Object) param3.field_h.a(110));
                        if (var11 == 0) {
                            statePc = 8;
                        } else {
                            statePc = 17;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        if (var6_int != 0) {
                            statePc = 19;
                        } else {
                            statePc = 18;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        statePc = 20;
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        param3.b();
                        statePc = 20;
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        stackIn_21_0 = var6_int;
                        statePc = 21;
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 21: {
                    return stackIn_21_0 != 0;
                }
                case 22: {
                    var6 = (RuntimeException) ((Object) caughtException);
                    stackIn_24_0 = (RuntimeException) (var6);
                    stackIn_23_0 = stackIn_24_0;
                    stackIn_24_1 = new StringBuilder().append("lc.O(").append(param0).append(',').append(param1).append(',');
                    stackIn_23_1 = stackIn_24_1;
                    if (param2 == null) {
                        statePc = 24;
                    } else {
                        statePc = 23;
                    }
                    continue stateLoop;
                }
                case 23: {
                    stackIn_25_0 = (RuntimeException) ((Object) stackIn_23_0);
                    stackIn_25_1 = (StringBuilder) ((Object) stackIn_23_1);
                    stackIn_25_2 = "{...}";
                    statePc = 25;
                    continue stateLoop;
                }
                case 24: {
                    stackIn_25_0 = (RuntimeException) ((Object) stackIn_24_0);
                    stackIn_25_1 = (StringBuilder) ((Object) stackIn_24_1);
                    stackIn_25_2 = "null";
                    statePc = 25;
                    continue stateLoop;
                }
                case 25: {
                    stackIn_27_0 = (RuntimeException) ((Object) stackIn_25_0);
                    stackIn_26_0 = stackIn_27_0;
                    stackIn_27_1 = ((StringBuilder) (Object) stackIn_25_1).append(stackIn_25_2).append(',');
                    stackIn_26_1 = stackIn_27_1;
                    if (param3 == null) {
                        statePc = 27;
                    } else {
                        statePc = 26;
                    }
                    continue stateLoop;
                }
                case 26: {
                    stackIn_28_0 = (RuntimeException) ((Object) stackIn_26_0);
                    stackIn_28_1 = (StringBuilder) ((Object) stackIn_26_1);
                    stackIn_28_2 = "{...}";
                    statePc = 28;
                    continue stateLoop;
                }
                case 27: {
                    stackIn_28_0 = (RuntimeException) ((Object) stackIn_27_0);
                    stackIn_28_1 = (StringBuilder) ((Object) stackIn_27_1);
                    stackIn_28_2 = "null";
                    statePc = 28;
                    continue stateLoop;
                }
                case 28: {
                    stackIn_30_0 = (RuntimeException) ((Object) stackIn_28_0);
                    stackIn_29_0 = stackIn_30_0;
                    stackIn_30_1 = ((StringBuilder) (Object) stackIn_28_1).append(stackIn_28_2).append(',');
                    stackIn_29_1 = stackIn_30_1;
                    if (param4 == null) {
                        statePc = 30;
                    } else {
                        statePc = 29;
                    }
                    continue stateLoop;
                }
                case 29: {
                    stackIn_31_0 = (RuntimeException) ((Object) stackIn_29_0);
                    stackIn_31_1 = (StringBuilder) ((Object) stackIn_29_1);
                    stackIn_31_2 = "{...}";
                    statePc = 31;
                    continue stateLoop;
                }
                case 30: {
                    stackIn_31_0 = (RuntimeException) ((Object) stackIn_30_0);
                    stackIn_31_1 = (StringBuilder) ((Object) stackIn_30_1);
                    stackIn_31_2 = "null";
                    statePc = 31;
                    continue stateLoop;
                }
                case 31: {
                    throw ch.a((Throwable) ((Object) stackIn_31_0), stackIn_31_2 + ')');
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
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
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        long var5 = 0L;
        int var7 = 0;
        int var8 = 0;
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
            stackIn_17_0 = (RuntimeException) (var4);

            stackIn_17_1 = new StringBuilder().append("lc.K(");

            if (param0 == null) {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "null";
              break L7;
            } else {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "{...}";
              break L7;
            }
          }
          throw ch.a((Throwable) ((Object) stackIn_18_0), stackIn_18_2 + ',' + param1 + ',' + param2 + ')');
        }
    }

    private final void b(int param0, int param1) {
        int var3;
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        int var9;
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
        this.field_G[param2] = param1;
        this.field_K[param2] = vg.c(param1, -128);
        this.d(param1, param2, 73);
        if (param0 != 14731) {
            this.d();
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
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
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
              stackIn_6_0 = var3_int * param0.field_k - -32 >> 1135851910;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_4_0 = 16384 - ((128 - param0.field_k) * (-var3_int + 16384) - -32 >> -2045770586);
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackIn_9_0 = (RuntimeException) (var3);

            stackIn_9_1 = new StringBuilder().append("lc.LA(");

            if (param0 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L2;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
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
        int decompiledRegionSelector0 = 0;
        int statePc = 0;
        Throwable caughtException = null;
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
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var8 = Transmogrify.field_A ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        var11 = nf.field_l;
                        if (!param0) {
                            statePc = 3;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 27;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        field_L = (String) null;
                        statePc = 3;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 27;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        var2 = var11.d((byte) 27);
                        if (var2 != 0) {
                            statePc = 14;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 27;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        var15 = rf.c(false);
                        var12 = var15;
                        var3 = var12;
                        var9 = var3;
                        var4 = var9;
                        var5 = var11;
                        var6 = ((oa) ((Object) var5)).d((byte) 48);
                        var7 = 0;
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 27;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        if (var6 <= var7) {
                            statePc = 9;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 27;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        var9[var7] = ((oa) ((Object) var5)).c((byte) -124);
                        var7++;
                        if (var8 != 0) {
                            statePc = 28;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 27;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        if (var8 == 0) {
                            statePc = 5;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 27;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 27;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        var13 = (oh) ((Object) oc.field_G.a((byte) -95));
                        if (var13 == null) {
                            statePc = 11;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 27;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        statePc = 13;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 27;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        pc.a(1);
                        statePc = 12;
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 27;
                        continue stateLoop;
                    }
                }
                case 12: {
                    return;
                }
                case 13: {
                    try {
                        var13.field_i = true;
                        var13.field_k = var15[0];
                        var13.field_g = var3;
                        var13.c(5);
                        if (var8 == 0) {
                            statePc = 28;
                        } else {
                            statePc = 14;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 27;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        if (var2 == 1) {
                            statePc = 22;
                        } else {
                            statePc = 15;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 27;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        if ((var2 ^ -1) == -3) {
                            statePc = 18;
                        } else {
                            statePc = 16;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 27;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        d.a((Throwable) null, 63, "A1: " + ik.q(48));
                        pc.a(1);
                        if (var8 == 0) {
                            statePc = 28;
                        } else {
                            statePc = 17;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 27;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        statePc = 18;
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 27;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        var14 = (oh) ((Object) oc.field_G.a((byte) -95));
                        if (var14 != null) {
                            statePc = 21;
                        } else {
                            statePc = 19;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 27;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        pc.a(1);
                        statePc = 20;
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 27;
                        continue stateLoop;
                    }
                }
                case 20: {
                    return;
                }
                case 21: {
                    try {
                        var14.field_g = rf.c(false);
                        var14.field_k = var14.field_g[0];
                        var14.field_i = true;
                        var14.c(5);
                        if (var8 == 0) {
                            statePc = 28;
                        } else {
                            statePc = 22;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 27;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        var10 = (gd) ((Object) rh.field_r.a((byte) -95));
                        if (var10 != null) {
                            statePc = 25;
                        } else {
                            statePc = 23;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 27;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        pc.a(1);
                        statePc = 24;
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 27;
                        continue stateLoop;
                    }
                }
                case 24: {
                    return;
                }
                case 25: {
                    try {
                        var10.c(5);
                        statePc = 28;
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 27;
                        continue stateLoop;
                    }
                }
                case 27: {
                    var1 = (RuntimeException) ((Object) caughtException);
                    throw ch.a((Throwable) ((Object) var1), "lc.FA(" + param0 + ')');
                }
                case 28: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final synchronized ag a() {
        return null;
    }

    private final void a(int param0, boolean param1, int param2) {
        this.field_t[param0] = param2;
        this.field_D[param0] = (int)(2097152.0 * Math.pow(2.0, 0.00054931640625 * (double)param2) + 0.5);
        if (param1) {
            kc var5 = (kc) null;
            this.a(101, (kc) null);
        }
    }

    private final void c(int param0, int param1) {
        kc var3;
        int var4;
        int stackIn_8_0 = 0;
        int stackIn_8_1 = 0;
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
                  stackIn_8_0 = param0 ^ -1;

                  stackIn_8_1 = var3.field_u ^ -1;

                  if (var4 != 0) {
                    break L0;
                  } else {
                    L3: {
                      if (stackIn_8_0 != stackIn_8_1) {
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
          stackIn_8_0 = param1;
          stackIn_8_1 = 12;
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
        kc var3;
        int var4;
        int var5;
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
        int statePc = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var3 = Transmogrify.field_A ? 1 : 0;
                    if (param0) {
                        statePc = 2;
                    } else {
                        statePc = 1;
                    }
                    continue stateLoop;
                }
                case 1: {
                    return;
                }
                case 2: {
                    var4 = (si) ((Object) this.field_Q.b(1000));
                    statePc = 3;
                    continue stateLoop;
                }
                case 3: {
                    if (var4 == null) {
                        statePc = 7;
                    } else {
                        statePc = 4;
                    }
                    continue stateLoop;
                }
                case 4: {
                    var4.d(75);
                    var4 = (si) ((Object) this.field_Q.a(44));
                    if (var3 != 0) {
                        statePc = 7;
                    } else {
                        statePc = 5;
                    }
                    continue stateLoop;
                }
                case 5: {
                    if (var3 == 0) {
                        statePc = 3;
                    } else {
                        statePc = 7;
                    }
                    continue stateLoop;
                }
                case 7: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    private final void a(int param0, int param1, int param2, int param3) {
        if (param0 != 8373600) {
            this.a((byte) 42, false);
        }
    }

    private final void b(int param0, byte param1) {
        int var3;
        kc var4;
        int var5;
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
        int statePc = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var4 = Transmogrify.field_A ? 1 : 0;
                    if (param1) {
                        statePc = 3;
                    } else {
                        statePc = 1;
                    }
                    continue stateLoop;
                }
                case 1: {
                    this.d(69, -1);
                    if (var4 == 0) {
                        statePc = 4;
                    } else {
                        statePc = 3;
                    }
                    continue stateLoop;
                }
                case 3: {
                    this.b(-1, (byte) -115);
                    statePc = 4;
                    continue stateLoop;
                }
                case 4: {
                    this.a(-1, (byte) 48);
                    var3 = 0;
                    statePc = 5;
                    continue stateLoop;
                }
                case 5: {
                    if (var3 >= 16) {
                        statePc = 9;
                    } else {
                        statePc = 6;
                    }
                    continue stateLoop;
                }
                case 6: {
                    this.field_H[var3] = this.field_G[var3];
                    var3++;
                    if (var4 != 0) {
                        statePc = 11;
                    } else {
                        statePc = 7;
                    }
                    continue stateLoop;
                }
                case 7: {
                    if (var4 == 0) {
                        statePc = 5;
                    } else {
                        statePc = 9;
                    }
                    continue stateLoop;
                }
                case 9: {
                    if (!param0) {
                        statePc = 11;
                    } else {
                        statePc = 10;
                    }
                    continue stateLoop;
                }
                case 10: {
                    this.e(-49, -104, 66);
                    statePc = 11;
                    continue stateLoop;
                }
                case 11: {
                    var5 = 0;
                    var3 = var5;
                    statePc = 12;
                    continue stateLoop;
                }
                case 12: {
                    if (var5 >= 16) {
                        statePc = 16;
                    } else {
                        statePc = 13;
                    }
                    continue stateLoop;
                }
                case 13: {
                    this.field_K[var5] = vg.c(this.field_G[var5], -128);
                    var5++;
                    if (var4 != 0) {
                        statePc = 16;
                    } else {
                        statePc = 14;
                    }
                    continue stateLoop;
                }
                case 14: {
                    if (var4 == 0) {
                        statePc = 12;
                    } else {
                        statePc = 16;
                    }
                    continue stateLoop;
                }
                case 16: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    private final void a(int param0, byte param1) {
        int var4;
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
        int var5 = 0;
        int var6 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
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
            stackIn_12_0 = (RuntimeException) (var4);

            stackIn_12_1 = new StringBuilder().append("lc.TA(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
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
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (-1 == (this.field_r[param0.field_u] ^ -1)) {
              stackIn_3_0 = 0;
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
              stackIn_21_0 = var4;
              decompiledRegionSelector0 = 1;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var3 = decompiledCaughtException;
            stackIn_24_0 = (RuntimeException) (var3);

            stackIn_24_1 = new StringBuilder().append("lc.T(");

            if (param0 == null) {
              stackIn_25_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackIn_25_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackIn_25_2 = "null";
              break L7;
            } else {
              stackIn_25_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackIn_25_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackIn_25_2 = "{...}";
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
        kc var3;
        int var4;
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
        int statePc = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var7 = Transmogrify.field_A ? 1 : 0;
                    var8 = this.field_u[param3][param2];
                    if (var8 == null) {
                        statePc = 2;
                    } else {
                        statePc = 3;
                    }
                    continue stateLoop;
                }
                case 2: {
                    return;
                }
                case 3: {
                    this.field_u[param3][param2] = null;
                    if (param0 != (this.field_v[param3] & 2)) {
                        statePc = 6;
                    } else {
                        statePc = 4;
                    }
                    continue stateLoop;
                }
                case 4: {
                    var8.field_p = 0;
                    if (var7 == 0) {
                        statePc = 16;
                    } else {
                        statePc = 6;
                    }
                    continue stateLoop;
                }
                case 6: {
                    var6 = (kc) ((Object) this.field_m.field_q.a((byte) -95));
                    statePc = 7;
                    continue stateLoop;
                }
                case 7: {
                    if (var6 == null) {
                        statePc = 16;
                    } else {
                        statePc = 8;
                    }
                    continue stateLoop;
                }
                case 8: {
                    if (var7 != 0) {
                        statePc = 16;
                    } else {
                        statePc = 9;
                    }
                    continue stateLoop;
                }
                case 9: {
                    if ((var6.field_u ^ -1) != (var8.field_u ^ -1)) {
                        statePc = 14;
                    } else {
                        statePc = 10;
                    }
                    continue stateLoop;
                }
                case 10: {
                    if (-1 >= (var6.field_p ^ -1)) {
                        statePc = 14;
                    } else {
                        statePc = 11;
                    }
                    continue stateLoop;
                }
                case 11: {
                    if (var6 != var8) {
                        statePc = 13;
                    } else {
                        statePc = 14;
                    }
                    continue stateLoop;
                }
                case 13: {
                    var8.field_p = 0;
                    if (var7 == 0) {
                        statePc = 16;
                    } else {
                        statePc = 14;
                    }
                    continue stateLoop;
                }
                case 14: {
                    var6 = (kc) ((Object) this.field_m.field_q.a(true));
                    if (var7 == 0) {
                        statePc = 7;
                    } else {
                        statePc = 16;
                    }
                    continue stateLoop;
                }
                case 16: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    private final int a(kc param0, byte param1) {
        int stackIn_12_0 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        nh var4 = null;
        int var5 = 0;
        int var6 = 0;
        double var7 = 0.0;
        hj var9 = null;
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
                stackIn_12_0 = 1;
                break L5;
              } else {
                stackIn_12_0 = var5;
                break L5;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var3 = decompiledCaughtException;
            stackIn_15_0 = (RuntimeException) (var3);

            stackIn_15_1 = new StringBuilder().append("lc.I(");

            if (param0 == null) {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "null";
              break L6;
            } else {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "{...}";
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
            int statePc = 0;
            Throwable caughtException = null;
            RuntimeException var2 = null;
            int var3 = 0;
            int var4 = 0;
            int var5 = 0;
            int var6 = 0;
            int var7_int = 0;
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
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        var19 = null;
                        var16 = null;
                        var21 = null;
                        var22 = null;
                        var13 = Transmogrify.field_A ? 1 : 0;
                        statePc = 1;
                        continue stateLoop;
                    }
                    case 1: {
                        try {
                            var14 = (ba) ((Object) wg.field_f.a((byte) -95));
                            var18 = var14;
                            if (var18 == null) {
                                statePc = 3;
                            } else {
                                statePc = 2;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_1) {
                            caughtException = stateCaught_1;
                            statePc = 72;
                            continue stateLoop;
                        }
                    }
                    case 2: {
                        try {
                            statePc = 4;
                            continue stateLoop;
                        } catch (Throwable stateCaught_2) {
                            caughtException = stateCaught_2;
                            statePc = 72;
                            continue stateLoop;
                        }
                    }
                    case 3: {
                        return;
                    }
                    case 4: {
                        try {
                            var3 = 0;
                            var4 = 0;
                            statePc = 5;
                            continue stateLoop;
                        } catch (Throwable stateCaught_4) {
                            caughtException = stateCaught_4;
                            statePc = 72;
                            continue stateLoop;
                        }
                    }
                    case 5: {
                        try {
                            if (var4 >= var18.field_p) {
                                statePc = 20;
                            } else {
                                statePc = 6;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_5) {
                            caughtException = stateCaught_5;
                            statePc = 72;
                            continue stateLoop;
                        }
                    }
                    case 6: {
                        try {
                            if (var13 != 0) {
                                statePc = 22;
                            } else {
                                statePc = 7;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_6) {
                            caughtException = stateCaught_6;
                            statePc = 72;
                            continue stateLoop;
                        }
                    }
                    case 7: {
                        try {
                            if (var14.field_m[var4] != null) {
                                statePc = 9;
                            } else {
                                statePc = 8;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_7) {
                            caughtException = stateCaught_7;
                            statePc = 72;
                            continue stateLoop;
                        }
                    }
                    case 8: {
                        try {
                            statePc = 13;
                            continue stateLoop;
                        } catch (Throwable stateCaught_8) {
                            caughtException = stateCaught_8;
                            statePc = 72;
                            continue stateLoop;
                        }
                    }
                    case 9: {
                        try {
                            if (-3 != (var14.field_m[var4].field_c ^ -1)) {
                                statePc = 11;
                            } else {
                                statePc = 10;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_9) {
                            caughtException = stateCaught_9;
                            statePc = 72;
                            continue stateLoop;
                        }
                    }
                    case 10: {
                        try {
                            var14.field_k[var4] = -5;
                            statePc = 11;
                            continue stateLoop;
                        } catch (Throwable stateCaught_10) {
                            caughtException = stateCaught_10;
                            statePc = 72;
                            continue stateLoop;
                        }
                    }
                    case 11: {
                        try {
                            if (-1 != (var14.field_m[var4].field_c ^ -1)) {
                                statePc = 13;
                            } else {
                                statePc = 12;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_11) {
                            caughtException = stateCaught_11;
                            statePc = 72;
                            continue stateLoop;
                        }
                    }
                    case 12: {
                        try {
                            var3 = 1;
                            statePc = 13;
                            continue stateLoop;
                        } catch (Throwable stateCaught_12) {
                            caughtException = stateCaught_12;
                            statePc = 72;
                            continue stateLoop;
                        }
                    }
                    case 13: {
                        try {
                            if (var14.field_o[var4] != null) {
                                statePc = 15;
                            } else {
                                statePc = 14;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_13) {
                            caughtException = stateCaught_13;
                            statePc = 72;
                            continue stateLoop;
                        }
                    }
                    case 14: {
                        try {
                            statePc = 19;
                            continue stateLoop;
                        } catch (Throwable stateCaught_14) {
                            caughtException = stateCaught_14;
                            statePc = 72;
                            continue stateLoop;
                        }
                    }
                    case 15: {
                        try {
                            if (var14.field_o[var4].field_c != 2) {
                                statePc = 17;
                            } else {
                                statePc = 16;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_15) {
                            caughtException = stateCaught_15;
                            statePc = 72;
                            continue stateLoop;
                        }
                    }
                    case 16: {
                        try {
                            var14.field_k[var4] = -6;
                            statePc = 17;
                            continue stateLoop;
                        } catch (Throwable stateCaught_16) {
                            caughtException = stateCaught_16;
                            statePc = 72;
                            continue stateLoop;
                        }
                    }
                    case 17: {
                        try {
                            if (var14.field_o[var4].field_c != 0) {
                                statePc = 19;
                            } else {
                                statePc = 18;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_17) {
                            caughtException = stateCaught_17;
                            statePc = 72;
                            continue stateLoop;
                        }
                    }
                    case 18: {
                        try {
                            var3 = 1;
                            statePc = 19;
                            continue stateLoop;
                        } catch (Throwable stateCaught_18) {
                            caughtException = stateCaught_18;
                            statePc = 72;
                            continue stateLoop;
                        }
                    }
                    case 19: {
                        try {
                            var4++;
                            if (var13 == 0) {
                                statePc = 5;
                            } else {
                                statePc = 20;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_19) {
                            caughtException = stateCaught_19;
                            statePc = 72;
                            continue stateLoop;
                        }
                    }
                    case 20: {
                        try {
                            if (var3 != 0) {
                                statePc = 22;
                            } else {
                                statePc = 21;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_20) {
                            caughtException = stateCaught_20;
                            statePc = 72;
                            continue stateLoop;
                        }
                    }
                    case 21: {
                        try {
                            statePc = 23;
                            continue stateLoop;
                        } catch (Throwable stateCaught_21) {
                            caughtException = stateCaught_21;
                            statePc = 72;
                            continue stateLoop;
                        }
                    }
                    case 22: {
                        return;
                    }
                    case 23: {
                        try {
                            var4 = param1.field_h;
                            param1.a(-109, var18.field_i);
                            var5 = 117 % ((param0 - 0) / 44);
                            var6 = 0;
                            statePc = 24;
                            continue stateLoop;
                        } catch (Throwable stateCaught_23) {
                            caughtException = stateCaught_23;
                            statePc = 72;
                            continue stateLoop;
                        }
                    }
                    case 24: {
                        try {
                            if ((var18.field_p ^ -1) >= (var6 ^ -1)) {
                                statePc = 69;
                            } else {
                                statePc = 25;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_24) {
                            caughtException = stateCaught_24;
                            statePc = 72;
                            continue stateLoop;
                        }
                    }
                    case 25: {
                        try {
                            stackIn_70_0 = 0;
                            stackIn_26_0 = stackIn_70_0;
                            if (var13 != 0) {
                                statePc = 70;
                            } else {
                                statePc = 26;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_25) {
                            caughtException = stateCaught_25;
                            statePc = 72;
                            continue stateLoop;
                        }
                    }
                    case 26: {
                        try {
                            if (stackIn_26_0 != var14.field_k[var6]) {
                                statePc = 28;
                            } else {
                                statePc = 27;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_26) {
                            caughtException = stateCaught_26;
                            statePc = 72;
                            continue stateLoop;
                        }
                    }
                    case 27: {
                        try {
                            statePc = 29;
                            continue stateLoop;
                        } catch (Throwable stateCaught_27) {
                            caughtException = stateCaught_27;
                            statePc = 72;
                            continue stateLoop;
                        }
                    }
                    case 28: {
                        try {
                            param1.f(6389, var14.field_k[var6]);
                            if (var13 == 0) {
                                statePc = 68;
                            } else {
                                statePc = 29;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_28) {
                            caughtException = stateCaught_28;
                            statePc = 72;
                            continue stateLoop;
                        }
                    }
                    case 29: {
                        try {
                            var7_int = var14.field_j[var6];
                            if (0 != var7_int) {
                                statePc = 31;
                            } else {
                                statePc = 30;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_29) {
                            caughtException = stateCaught_29;
                            statePc = ((Object) stateCaught_29 instanceof ClassNotFoundException ? 56 : ((Object) stateCaught_29 instanceof InvalidClassException ? 57 : ((Object) stateCaught_29 instanceof StreamCorruptedException ? 58 : ((Object) stateCaught_29 instanceof OptionalDataException ? 59 : ((Object) stateCaught_29 instanceof IllegalAccessException ? 60 : ((Object) stateCaught_29 instanceof IllegalArgumentException ? 61 : ((Object) stateCaught_29 instanceof java.lang.reflect.InvocationTargetException ? 62 : ((Object) stateCaught_29 instanceof SecurityException ? 63 : ((Object) stateCaught_29 instanceof IOException ? 64 : ((Object) stateCaught_29 instanceof NullPointerException ? 65 : ((Object) stateCaught_29 instanceof Exception ? 66 : 67)))))))))));
                            continue stateLoop;
                        }
                    }
                    case 30: {
                        try {
                            var26 = (java.lang.reflect.Field) (var14.field_m[var6].field_g);
                            var9 = var26.getInt((Object) null);
                            param1.f(6389, 0);
                            param1.a(-119, var9);
                            if (var13 == 0) {
                                statePc = 35;
                            } else {
                                statePc = 31;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_30) {
                            caughtException = stateCaught_30;
                            statePc = ((Object) stateCaught_30 instanceof ClassNotFoundException ? 56 : ((Object) stateCaught_30 instanceof InvalidClassException ? 57 : ((Object) stateCaught_30 instanceof StreamCorruptedException ? 58 : ((Object) stateCaught_30 instanceof OptionalDataException ? 59 : ((Object) stateCaught_30 instanceof IllegalAccessException ? 60 : ((Object) stateCaught_30 instanceof IllegalArgumentException ? 61 : ((Object) stateCaught_30 instanceof java.lang.reflect.InvocationTargetException ? 62 : ((Object) stateCaught_30 instanceof SecurityException ? 63 : ((Object) stateCaught_30 instanceof IOException ? 64 : ((Object) stateCaught_30 instanceof NullPointerException ? 65 : ((Object) stateCaught_30 instanceof Exception ? 66 : 67)))))))))));
                            continue stateLoop;
                        }
                    }
                    case 31: {
                        try {
                            if (var7_int != 1) {
                                statePc = 33;
                            } else {
                                statePc = 32;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_31) {
                            caughtException = stateCaught_31;
                            statePc = ((Object) stateCaught_31 instanceof ClassNotFoundException ? 56 : ((Object) stateCaught_31 instanceof InvalidClassException ? 57 : ((Object) stateCaught_31 instanceof StreamCorruptedException ? 58 : ((Object) stateCaught_31 instanceof OptionalDataException ? 59 : ((Object) stateCaught_31 instanceof IllegalAccessException ? 60 : ((Object) stateCaught_31 instanceof IllegalArgumentException ? 61 : ((Object) stateCaught_31 instanceof java.lang.reflect.InvocationTargetException ? 62 : ((Object) stateCaught_31 instanceof SecurityException ? 63 : ((Object) stateCaught_31 instanceof IOException ? 64 : ((Object) stateCaught_31 instanceof NullPointerException ? 65 : ((Object) stateCaught_31 instanceof Exception ? 66 : 67)))))))))));
                            continue stateLoop;
                        }
                    }
                    case 32: {
                        try {
                            var15 = (java.lang.reflect.Field) (var14.field_m[var6].field_g);
                            var8 = var15;
                            var15.setInt((Object) null, var14.field_h[var6]);
                            param1.f(6389, 0);
                            if (var13 == 0) {
                                statePc = 35;
                            } else {
                                statePc = 33;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_32) {
                            caughtException = stateCaught_32;
                            statePc = ((Object) stateCaught_32 instanceof ClassNotFoundException ? 56 : ((Object) stateCaught_32 instanceof InvalidClassException ? 57 : ((Object) stateCaught_32 instanceof StreamCorruptedException ? 58 : ((Object) stateCaught_32 instanceof OptionalDataException ? 59 : ((Object) stateCaught_32 instanceof IllegalAccessException ? 60 : ((Object) stateCaught_32 instanceof IllegalArgumentException ? 61 : ((Object) stateCaught_32 instanceof java.lang.reflect.InvocationTargetException ? 62 : ((Object) stateCaught_32 instanceof SecurityException ? 63 : ((Object) stateCaught_32 instanceof IOException ? 64 : ((Object) stateCaught_32 instanceof NullPointerException ? 65 : ((Object) stateCaught_32 instanceof Exception ? 66 : 67)))))))))));
                            continue stateLoop;
                        }
                    }
                    case 33: {
                        try {
                            if ((var7_int ^ -1) != -3) {
                                statePc = 35;
                            } else {
                                statePc = 34;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_33) {
                            caughtException = stateCaught_33;
                            statePc = ((Object) stateCaught_33 instanceof ClassNotFoundException ? 56 : ((Object) stateCaught_33 instanceof InvalidClassException ? 57 : ((Object) stateCaught_33 instanceof StreamCorruptedException ? 58 : ((Object) stateCaught_33 instanceof OptionalDataException ? 59 : ((Object) stateCaught_33 instanceof IllegalAccessException ? 60 : ((Object) stateCaught_33 instanceof IllegalArgumentException ? 61 : ((Object) stateCaught_33 instanceof java.lang.reflect.InvocationTargetException ? 62 : ((Object) stateCaught_33 instanceof SecurityException ? 63 : ((Object) stateCaught_33 instanceof IOException ? 64 : ((Object) stateCaught_33 instanceof NullPointerException ? 65 : ((Object) stateCaught_33 instanceof Exception ? 66 : 67)))))))))));
                            continue stateLoop;
                        }
                    }
                    case 34: {
                        try {
                            var27 = (java.lang.reflect.Field) (var14.field_m[var6].field_g);
                            var9 = var27.getModifiers();
                            param1.f(6389, 0);
                            param1.a(-107, var9);
                            statePc = 35;
                            continue stateLoop;
                        } catch (Throwable stateCaught_34) {
                            caughtException = stateCaught_34;
                            statePc = ((Object) stateCaught_34 instanceof ClassNotFoundException ? 56 : ((Object) stateCaught_34 instanceof InvalidClassException ? 57 : ((Object) stateCaught_34 instanceof StreamCorruptedException ? 58 : ((Object) stateCaught_34 instanceof OptionalDataException ? 59 : ((Object) stateCaught_34 instanceof IllegalAccessException ? 60 : ((Object) stateCaught_34 instanceof IllegalArgumentException ? 61 : ((Object) stateCaught_34 instanceof java.lang.reflect.InvocationTargetException ? 62 : ((Object) stateCaught_34 instanceof SecurityException ? 63 : ((Object) stateCaught_34 instanceof IOException ? 64 : ((Object) stateCaught_34 instanceof NullPointerException ? 65 : ((Object) stateCaught_34 instanceof Exception ? 66 : 67)))))))))));
                            continue stateLoop;
                        }
                    }
                    case 35: {
                        try {
                            if ((var7_int ^ -1) != -4) {
                                statePc = 52;
                            } else {
                                statePc = 36;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_35) {
                            caughtException = stateCaught_35;
                            statePc = ((Object) stateCaught_35 instanceof ClassNotFoundException ? 56 : ((Object) stateCaught_35 instanceof InvalidClassException ? 57 : ((Object) stateCaught_35 instanceof StreamCorruptedException ? 58 : ((Object) stateCaught_35 instanceof OptionalDataException ? 59 : ((Object) stateCaught_35 instanceof IllegalAccessException ? 60 : ((Object) stateCaught_35 instanceof IllegalArgumentException ? 61 : ((Object) stateCaught_35 instanceof java.lang.reflect.InvocationTargetException ? 62 : ((Object) stateCaught_35 instanceof SecurityException ? 63 : ((Object) stateCaught_35 instanceof IOException ? 64 : ((Object) stateCaught_35 instanceof NullPointerException ? 65 : ((Object) stateCaught_35 instanceof Exception ? 66 : 67)))))))))));
                            continue stateLoop;
                        }
                    }
                    case 36: {
                        try {
                            var28 = (java.lang.reflect.Method) (var14.field_o[var6].field_g);
                            var25 = var14.field_g[var6];
                            var10 = new Object[var25.length];
                            var11_int = 0;
                            statePc = 37;
                            continue stateLoop;
                        } catch (Throwable stateCaught_36) {
                            caughtException = stateCaught_36;
                            statePc = ((Object) stateCaught_36 instanceof ClassNotFoundException ? 56 : ((Object) stateCaught_36 instanceof InvalidClassException ? 57 : ((Object) stateCaught_36 instanceof StreamCorruptedException ? 58 : ((Object) stateCaught_36 instanceof OptionalDataException ? 59 : ((Object) stateCaught_36 instanceof IllegalAccessException ? 60 : ((Object) stateCaught_36 instanceof IllegalArgumentException ? 61 : ((Object) stateCaught_36 instanceof java.lang.reflect.InvocationTargetException ? 62 : ((Object) stateCaught_36 instanceof SecurityException ? 63 : ((Object) stateCaught_36 instanceof IOException ? 64 : ((Object) stateCaught_36 instanceof NullPointerException ? 65 : ((Object) stateCaught_36 instanceof Exception ? 66 : 67)))))))))));
                            continue stateLoop;
                        }
                    }
                    case 37: {
                        try {
                            if (var25.length <= var11_int) {
                                statePc = 41;
                            } else {
                                statePc = 38;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_37) {
                            caughtException = stateCaught_37;
                            statePc = ((Object) stateCaught_37 instanceof ClassNotFoundException ? 56 : ((Object) stateCaught_37 instanceof InvalidClassException ? 57 : ((Object) stateCaught_37 instanceof StreamCorruptedException ? 58 : ((Object) stateCaught_37 instanceof OptionalDataException ? 59 : ((Object) stateCaught_37 instanceof IllegalAccessException ? 60 : ((Object) stateCaught_37 instanceof IllegalArgumentException ? 61 : ((Object) stateCaught_37 instanceof java.lang.reflect.InvocationTargetException ? 62 : ((Object) stateCaught_37 instanceof SecurityException ? 63 : ((Object) stateCaught_37 instanceof IOException ? 64 : ((Object) stateCaught_37 instanceof NullPointerException ? 65 : ((Object) stateCaught_37 instanceof Exception ? 66 : 67)))))))))));
                            continue stateLoop;
                        }
                    }
                    case 38: {
                        try {
                            var12 = new ObjectInputStream((InputStream) ((Object) new ByteArrayInputStream(var25[var11_int])));
                            var10[var11_int] = var12.readObject();
                            var11_int++;
                            if (var13 != 0) {
                                statePc = 55;
                            } else {
                                statePc = 39;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_38) {
                            caughtException = stateCaught_38;
                            statePc = ((Object) stateCaught_38 instanceof ClassNotFoundException ? 56 : ((Object) stateCaught_38 instanceof InvalidClassException ? 57 : ((Object) stateCaught_38 instanceof StreamCorruptedException ? 58 : ((Object) stateCaught_38 instanceof OptionalDataException ? 59 : ((Object) stateCaught_38 instanceof IllegalAccessException ? 60 : ((Object) stateCaught_38 instanceof IllegalArgumentException ? 61 : ((Object) stateCaught_38 instanceof java.lang.reflect.InvocationTargetException ? 62 : ((Object) stateCaught_38 instanceof SecurityException ? 63 : ((Object) stateCaught_38 instanceof IOException ? 64 : ((Object) stateCaught_38 instanceof NullPointerException ? 65 : ((Object) stateCaught_38 instanceof Exception ? 66 : 67)))))))))));
                            continue stateLoop;
                        }
                    }
                    case 39: {
                        try {
                            if (var13 == 0) {
                                statePc = 37;
                            } else {
                                statePc = 40;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_39) {
                            caughtException = stateCaught_39;
                            statePc = ((Object) stateCaught_39 instanceof ClassNotFoundException ? 56 : ((Object) stateCaught_39 instanceof InvalidClassException ? 57 : ((Object) stateCaught_39 instanceof StreamCorruptedException ? 58 : ((Object) stateCaught_39 instanceof OptionalDataException ? 59 : ((Object) stateCaught_39 instanceof IllegalAccessException ? 60 : ((Object) stateCaught_39 instanceof IllegalArgumentException ? 61 : ((Object) stateCaught_39 instanceof java.lang.reflect.InvocationTargetException ? 62 : ((Object) stateCaught_39 instanceof SecurityException ? 63 : ((Object) stateCaught_39 instanceof IOException ? 64 : ((Object) stateCaught_39 instanceof NullPointerException ? 65 : ((Object) stateCaught_39 instanceof Exception ? 66 : 67)))))))))));
                            continue stateLoop;
                        }
                    }
                    case 40: {
                        try {
                            statePc = 41;
                            continue stateLoop;
                        } catch (Throwable stateCaught_40) {
                            caughtException = stateCaught_40;
                            statePc = ((Object) stateCaught_40 instanceof ClassNotFoundException ? 56 : ((Object) stateCaught_40 instanceof InvalidClassException ? 57 : ((Object) stateCaught_40 instanceof StreamCorruptedException ? 58 : ((Object) stateCaught_40 instanceof OptionalDataException ? 59 : ((Object) stateCaught_40 instanceof IllegalAccessException ? 60 : ((Object) stateCaught_40 instanceof IllegalArgumentException ? 61 : ((Object) stateCaught_40 instanceof java.lang.reflect.InvocationTargetException ? 62 : ((Object) stateCaught_40 instanceof SecurityException ? 63 : ((Object) stateCaught_40 instanceof IOException ? 64 : ((Object) stateCaught_40 instanceof NullPointerException ? 65 : ((Object) stateCaught_40 instanceof Exception ? 66 : 67)))))))))));
                            continue stateLoop;
                        }
                    }
                    case 41: {
                        try {
                            var11 = var28.invoke((Object) null, var10);
                            if (var11 != null) {
                                statePc = 44;
                            } else {
                                statePc = 42;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_41) {
                            caughtException = stateCaught_41;
                            statePc = ((Object) stateCaught_41 instanceof ClassNotFoundException ? 56 : ((Object) stateCaught_41 instanceof InvalidClassException ? 57 : ((Object) stateCaught_41 instanceof StreamCorruptedException ? 58 : ((Object) stateCaught_41 instanceof OptionalDataException ? 59 : ((Object) stateCaught_41 instanceof IllegalAccessException ? 60 : ((Object) stateCaught_41 instanceof IllegalArgumentException ? 61 : ((Object) stateCaught_41 instanceof java.lang.reflect.InvocationTargetException ? 62 : ((Object) stateCaught_41 instanceof SecurityException ? 63 : ((Object) stateCaught_41 instanceof IOException ? 64 : ((Object) stateCaught_41 instanceof NullPointerException ? 65 : ((Object) stateCaught_41 instanceof Exception ? 66 : 67)))))))))));
                            continue stateLoop;
                        }
                    }
                    case 42: {
                        try {
                            param1.f(6389, 0);
                            if (var13 == 0) {
                                statePc = 51;
                            } else {
                                statePc = 43;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_42) {
                            caughtException = stateCaught_42;
                            statePc = ((Object) stateCaught_42 instanceof ClassNotFoundException ? 56 : ((Object) stateCaught_42 instanceof InvalidClassException ? 57 : ((Object) stateCaught_42 instanceof StreamCorruptedException ? 58 : ((Object) stateCaught_42 instanceof OptionalDataException ? 59 : ((Object) stateCaught_42 instanceof IllegalAccessException ? 60 : ((Object) stateCaught_42 instanceof IllegalArgumentException ? 61 : ((Object) stateCaught_42 instanceof java.lang.reflect.InvocationTargetException ? 62 : ((Object) stateCaught_42 instanceof SecurityException ? 63 : ((Object) stateCaught_42 instanceof IOException ? 64 : ((Object) stateCaught_42 instanceof NullPointerException ? 65 : ((Object) stateCaught_42 instanceof Exception ? 66 : 67)))))))))));
                            continue stateLoop;
                        }
                    }
                    case 43: {
                        try {
                            statePc = 44;
                            continue stateLoop;
                        } catch (Throwable stateCaught_43) {
                            caughtException = stateCaught_43;
                            statePc = ((Object) stateCaught_43 instanceof ClassNotFoundException ? 56 : ((Object) stateCaught_43 instanceof InvalidClassException ? 57 : ((Object) stateCaught_43 instanceof StreamCorruptedException ? 58 : ((Object) stateCaught_43 instanceof OptionalDataException ? 59 : ((Object) stateCaught_43 instanceof IllegalAccessException ? 60 : ((Object) stateCaught_43 instanceof IllegalArgumentException ? 61 : ((Object) stateCaught_43 instanceof java.lang.reflect.InvocationTargetException ? 62 : ((Object) stateCaught_43 instanceof SecurityException ? 63 : ((Object) stateCaught_43 instanceof IOException ? 64 : ((Object) stateCaught_43 instanceof NullPointerException ? 65 : ((Object) stateCaught_43 instanceof Exception ? 66 : 67)))))))))));
                            continue stateLoop;
                        }
                    }
                    case 44: {
                        try {
                            if (!(var11 instanceof Number)) {
                                statePc = 47;
                            } else {
                                statePc = 45;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_44) {
                            caughtException = stateCaught_44;
                            statePc = ((Object) stateCaught_44 instanceof ClassNotFoundException ? 56 : ((Object) stateCaught_44 instanceof InvalidClassException ? 57 : ((Object) stateCaught_44 instanceof StreamCorruptedException ? 58 : ((Object) stateCaught_44 instanceof OptionalDataException ? 59 : ((Object) stateCaught_44 instanceof IllegalAccessException ? 60 : ((Object) stateCaught_44 instanceof IllegalArgumentException ? 61 : ((Object) stateCaught_44 instanceof java.lang.reflect.InvocationTargetException ? 62 : ((Object) stateCaught_44 instanceof SecurityException ? 63 : ((Object) stateCaught_44 instanceof IOException ? 64 : ((Object) stateCaught_44 instanceof NullPointerException ? 65 : ((Object) stateCaught_44 instanceof Exception ? 66 : 67)))))))))));
                            continue stateLoop;
                        }
                    }
                    case 45: {
                        try {
                            param1.f(6389, 1);
                            param1.b(1908720528, ((Number) (var11)).longValue());
                            if (var13 == 0) {
                                statePc = 51;
                            } else {
                                statePc = 46;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_45) {
                            caughtException = stateCaught_45;
                            statePc = ((Object) stateCaught_45 instanceof ClassNotFoundException ? 56 : ((Object) stateCaught_45 instanceof InvalidClassException ? 57 : ((Object) stateCaught_45 instanceof StreamCorruptedException ? 58 : ((Object) stateCaught_45 instanceof OptionalDataException ? 59 : ((Object) stateCaught_45 instanceof IllegalAccessException ? 60 : ((Object) stateCaught_45 instanceof IllegalArgumentException ? 61 : ((Object) stateCaught_45 instanceof java.lang.reflect.InvocationTargetException ? 62 : ((Object) stateCaught_45 instanceof SecurityException ? 63 : ((Object) stateCaught_45 instanceof IOException ? 64 : ((Object) stateCaught_45 instanceof NullPointerException ? 65 : ((Object) stateCaught_45 instanceof Exception ? 66 : 67)))))))))));
                            continue stateLoop;
                        }
                    }
                    case 46: {
                        try {
                            statePc = 47;
                            continue stateLoop;
                        } catch (Throwable stateCaught_46) {
                            caughtException = stateCaught_46;
                            statePc = ((Object) stateCaught_46 instanceof ClassNotFoundException ? 56 : ((Object) stateCaught_46 instanceof InvalidClassException ? 57 : ((Object) stateCaught_46 instanceof StreamCorruptedException ? 58 : ((Object) stateCaught_46 instanceof OptionalDataException ? 59 : ((Object) stateCaught_46 instanceof IllegalAccessException ? 60 : ((Object) stateCaught_46 instanceof IllegalArgumentException ? 61 : ((Object) stateCaught_46 instanceof java.lang.reflect.InvocationTargetException ? 62 : ((Object) stateCaught_46 instanceof SecurityException ? 63 : ((Object) stateCaught_46 instanceof IOException ? 64 : ((Object) stateCaught_46 instanceof NullPointerException ? 65 : ((Object) stateCaught_46 instanceof Exception ? 66 : 67)))))))))));
                            continue stateLoop;
                        }
                    }
                    case 47: {
                        try {
                            if (!(var11 instanceof String)) {
                                statePc = 50;
                            } else {
                                statePc = 48;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_47) {
                            caughtException = stateCaught_47;
                            statePc = ((Object) stateCaught_47 instanceof ClassNotFoundException ? 56 : ((Object) stateCaught_47 instanceof InvalidClassException ? 57 : ((Object) stateCaught_47 instanceof StreamCorruptedException ? 58 : ((Object) stateCaught_47 instanceof OptionalDataException ? 59 : ((Object) stateCaught_47 instanceof IllegalAccessException ? 60 : ((Object) stateCaught_47 instanceof IllegalArgumentException ? 61 : ((Object) stateCaught_47 instanceof java.lang.reflect.InvocationTargetException ? 62 : ((Object) stateCaught_47 instanceof SecurityException ? 63 : ((Object) stateCaught_47 instanceof IOException ? 64 : ((Object) stateCaught_47 instanceof NullPointerException ? 65 : ((Object) stateCaught_47 instanceof Exception ? 66 : 67)))))))))));
                            continue stateLoop;
                        }
                    }
                    case 48: {
                        try {
                            param1.f(6389, 2);
                            param1.a(-110, (String) (var11));
                            if (var13 == 0) {
                                statePc = 51;
                            } else {
                                statePc = 49;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_48) {
                            caughtException = stateCaught_48;
                            statePc = ((Object) stateCaught_48 instanceof ClassNotFoundException ? 56 : ((Object) stateCaught_48 instanceof InvalidClassException ? 57 : ((Object) stateCaught_48 instanceof StreamCorruptedException ? 58 : ((Object) stateCaught_48 instanceof OptionalDataException ? 59 : ((Object) stateCaught_48 instanceof IllegalAccessException ? 60 : ((Object) stateCaught_48 instanceof IllegalArgumentException ? 61 : ((Object) stateCaught_48 instanceof java.lang.reflect.InvocationTargetException ? 62 : ((Object) stateCaught_48 instanceof SecurityException ? 63 : ((Object) stateCaught_48 instanceof IOException ? 64 : ((Object) stateCaught_48 instanceof NullPointerException ? 65 : ((Object) stateCaught_48 instanceof Exception ? 66 : 67)))))))))));
                            continue stateLoop;
                        }
                    }
                    case 49: {
                        try {
                            statePc = 50;
                            continue stateLoop;
                        } catch (Throwable stateCaught_49) {
                            caughtException = stateCaught_49;
                            statePc = ((Object) stateCaught_49 instanceof ClassNotFoundException ? 56 : ((Object) stateCaught_49 instanceof InvalidClassException ? 57 : ((Object) stateCaught_49 instanceof StreamCorruptedException ? 58 : ((Object) stateCaught_49 instanceof OptionalDataException ? 59 : ((Object) stateCaught_49 instanceof IllegalAccessException ? 60 : ((Object) stateCaught_49 instanceof IllegalArgumentException ? 61 : ((Object) stateCaught_49 instanceof java.lang.reflect.InvocationTargetException ? 62 : ((Object) stateCaught_49 instanceof SecurityException ? 63 : ((Object) stateCaught_49 instanceof IOException ? 64 : ((Object) stateCaught_49 instanceof NullPointerException ? 65 : ((Object) stateCaught_49 instanceof Exception ? 66 : 67)))))))))));
                            continue stateLoop;
                        }
                    }
                    case 50: {
                        try {
                            param1.f(6389, 4);
                            statePc = 51;
                            continue stateLoop;
                        } catch (Throwable stateCaught_50) {
                            caughtException = stateCaught_50;
                            statePc = ((Object) stateCaught_50 instanceof ClassNotFoundException ? 56 : ((Object) stateCaught_50 instanceof InvalidClassException ? 57 : ((Object) stateCaught_50 instanceof StreamCorruptedException ? 58 : ((Object) stateCaught_50 instanceof OptionalDataException ? 59 : ((Object) stateCaught_50 instanceof IllegalAccessException ? 60 : ((Object) stateCaught_50 instanceof IllegalArgumentException ? 61 : ((Object) stateCaught_50 instanceof java.lang.reflect.InvocationTargetException ? 62 : ((Object) stateCaught_50 instanceof SecurityException ? 63 : ((Object) stateCaught_50 instanceof IOException ? 64 : ((Object) stateCaught_50 instanceof NullPointerException ? 65 : ((Object) stateCaught_50 instanceof Exception ? 66 : 67)))))))))));
                            continue stateLoop;
                        }
                    }
                    case 51: {
                        try {
                            if (var13 == 0) {
                                statePc = 55;
                            } else {
                                statePc = 52;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_51) {
                            caughtException = stateCaught_51;
                            statePc = ((Object) stateCaught_51 instanceof ClassNotFoundException ? 56 : ((Object) stateCaught_51 instanceof InvalidClassException ? 57 : ((Object) stateCaught_51 instanceof StreamCorruptedException ? 58 : ((Object) stateCaught_51 instanceof OptionalDataException ? 59 : ((Object) stateCaught_51 instanceof IllegalAccessException ? 60 : ((Object) stateCaught_51 instanceof IllegalArgumentException ? 61 : ((Object) stateCaught_51 instanceof java.lang.reflect.InvocationTargetException ? 62 : ((Object) stateCaught_51 instanceof SecurityException ? 63 : ((Object) stateCaught_51 instanceof IOException ? 64 : ((Object) stateCaught_51 instanceof NullPointerException ? 65 : ((Object) stateCaught_51 instanceof Exception ? 66 : 67)))))))))));
                            continue stateLoop;
                        }
                    }
                    case 52: {
                        try {
                            if (4 == var7_int) {
                                statePc = 54;
                            } else {
                                statePc = 53;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_52) {
                            caughtException = stateCaught_52;
                            statePc = ((Object) stateCaught_52 instanceof ClassNotFoundException ? 56 : ((Object) stateCaught_52 instanceof InvalidClassException ? 57 : ((Object) stateCaught_52 instanceof StreamCorruptedException ? 58 : ((Object) stateCaught_52 instanceof OptionalDataException ? 59 : ((Object) stateCaught_52 instanceof IllegalAccessException ? 60 : ((Object) stateCaught_52 instanceof IllegalArgumentException ? 61 : ((Object) stateCaught_52 instanceof java.lang.reflect.InvocationTargetException ? 62 : ((Object) stateCaught_52 instanceof SecurityException ? 63 : ((Object) stateCaught_52 instanceof IOException ? 64 : ((Object) stateCaught_52 instanceof NullPointerException ? 65 : ((Object) stateCaught_52 instanceof Exception ? 66 : 67)))))))))));
                            continue stateLoop;
                        }
                    }
                    case 53: {
                        try {
                            statePc = 68;
                            continue stateLoop;
                        } catch (Throwable stateCaught_53) {
                            caughtException = stateCaught_53;
                            statePc = ((Object) stateCaught_53 instanceof ClassNotFoundException ? 56 : ((Object) stateCaught_53 instanceof InvalidClassException ? 57 : ((Object) stateCaught_53 instanceof StreamCorruptedException ? 58 : ((Object) stateCaught_53 instanceof OptionalDataException ? 59 : ((Object) stateCaught_53 instanceof IllegalAccessException ? 60 : ((Object) stateCaught_53 instanceof IllegalArgumentException ? 61 : ((Object) stateCaught_53 instanceof java.lang.reflect.InvocationTargetException ? 62 : ((Object) stateCaught_53 instanceof SecurityException ? 63 : ((Object) stateCaught_53 instanceof IOException ? 64 : ((Object) stateCaught_53 instanceof NullPointerException ? 65 : ((Object) stateCaught_53 instanceof Exception ? 66 : 67)))))))))));
                            continue stateLoop;
                        }
                    }
                    case 54: {
                        try {
                            var29 = (java.lang.reflect.Method) (var14.field_o[var6].field_g);
                            var9 = var29.getModifiers();
                            param1.f(6389, 0);
                            param1.a(-107, var9);
                            statePc = 55;
                            continue stateLoop;
                        } catch (Throwable stateCaught_54) {
                            caughtException = stateCaught_54;
                            statePc = ((Object) stateCaught_54 instanceof ClassNotFoundException ? 56 : ((Object) stateCaught_54 instanceof InvalidClassException ? 57 : ((Object) stateCaught_54 instanceof StreamCorruptedException ? 58 : ((Object) stateCaught_54 instanceof OptionalDataException ? 59 : ((Object) stateCaught_54 instanceof IllegalAccessException ? 60 : ((Object) stateCaught_54 instanceof IllegalArgumentException ? 61 : ((Object) stateCaught_54 instanceof java.lang.reflect.InvocationTargetException ? 62 : ((Object) stateCaught_54 instanceof SecurityException ? 63 : ((Object) stateCaught_54 instanceof IOException ? 64 : ((Object) stateCaught_54 instanceof NullPointerException ? 65 : ((Object) stateCaught_54 instanceof Exception ? 66 : 67)))))))))));
                            continue stateLoop;
                        }
                    }
                    case 55: {
                        try {
                            statePc = 68;
                            continue stateLoop;
                        } catch (Throwable stateCaught_55) {
                            caughtException = stateCaught_55;
                            statePc = 72;
                            continue stateLoop;
                        }
                    }
                    case 56: {
                        try {
                            var7 = (ClassNotFoundException) ((Object) caughtException);
                            param1.f(6389, -10);
                            statePc = 68;
                            continue stateLoop;
                        } catch (Throwable stateCaught_56) {
                            caughtException = stateCaught_56;
                            statePc = 72;
                            continue stateLoop;
                        }
                    }
                    case 57: {
                        try {
                            var7_ref = (InvalidClassException) ((Object) caughtException);
                            param1.f(6389, -11);
                            statePc = 68;
                            continue stateLoop;
                        } catch (Throwable stateCaught_57) {
                            caughtException = stateCaught_57;
                            statePc = 72;
                            continue stateLoop;
                        }
                    }
                    case 58: {
                        try {
                            var7_ref2 = (StreamCorruptedException) ((Object) caughtException);
                            param1.f(6389, -12);
                            statePc = 68;
                            continue stateLoop;
                        } catch (Throwable stateCaught_58) {
                            caughtException = stateCaught_58;
                            statePc = 72;
                            continue stateLoop;
                        }
                    }
                    case 59: {
                        try {
                            var7_ref3 = (OptionalDataException) ((Object) caughtException);
                            param1.f(6389, -13);
                            statePc = 68;
                            continue stateLoop;
                        } catch (Throwable stateCaught_59) {
                            caughtException = stateCaught_59;
                            statePc = 72;
                            continue stateLoop;
                        }
                    }
                    case 60: {
                        try {
                            var7_ref4 = (IllegalAccessException) ((Object) caughtException);
                            param1.f(6389, -14);
                            statePc = 68;
                            continue stateLoop;
                        } catch (Throwable stateCaught_60) {
                            caughtException = stateCaught_60;
                            statePc = 72;
                            continue stateLoop;
                        }
                    }
                    case 61: {
                        try {
                            var7_ref5 = (IllegalArgumentException) ((Object) caughtException);
                            param1.f(6389, -15);
                            statePc = 68;
                            continue stateLoop;
                        } catch (Throwable stateCaught_61) {
                            caughtException = stateCaught_61;
                            statePc = 72;
                            continue stateLoop;
                        }
                    }
                    case 62: {
                        try {
                            var7_ref6 = (java.lang.reflect.InvocationTargetException) ((Object) caughtException);
                            param1.f(6389, -16);
                            statePc = 68;
                            continue stateLoop;
                        } catch (Throwable stateCaught_62) {
                            caughtException = stateCaught_62;
                            statePc = 72;
                            continue stateLoop;
                        }
                    }
                    case 63: {
                        try {
                            var7_ref7 = (SecurityException) ((Object) caughtException);
                            param1.f(6389, -17);
                            statePc = 68;
                            continue stateLoop;
                        } catch (Throwable stateCaught_63) {
                            caughtException = stateCaught_63;
                            statePc = 72;
                            continue stateLoop;
                        }
                    }
                    case 64: {
                        try {
                            var7_ref8 = (IOException) ((Object) caughtException);
                            param1.f(6389, -18);
                            statePc = 68;
                            continue stateLoop;
                        } catch (Throwable stateCaught_64) {
                            caughtException = stateCaught_64;
                            statePc = 72;
                            continue stateLoop;
                        }
                    }
                    case 65: {
                        try {
                            var7_ref9 = (NullPointerException) ((Object) caughtException);
                            param1.f(6389, -19);
                            statePc = 68;
                            continue stateLoop;
                        } catch (Throwable stateCaught_65) {
                            caughtException = stateCaught_65;
                            statePc = 72;
                            continue stateLoop;
                        }
                    }
                    case 66: {
                        try {
                            var7_ref10 = (Exception) ((Object) caughtException);
                            param1.f(6389, -20);
                            statePc = 68;
                            continue stateLoop;
                        } catch (Throwable stateCaught_66) {
                            caughtException = stateCaught_66;
                            statePc = 72;
                            continue stateLoop;
                        }
                    }
                    case 67: {
                        try {
                            var7_ref11 = caughtException;
                            param1.f(6389, -21);
                            statePc = 68;
                            continue stateLoop;
                        } catch (Throwable stateCaught_67) {
                            caughtException = stateCaught_67;
                            statePc = 72;
                            continue stateLoop;
                        }
                    }
                    case 68: {
                        try {
                            var6++;
                            if (var13 == 0) {
                                statePc = 24;
                            } else {
                                statePc = 69;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_68) {
                            caughtException = stateCaught_68;
                            statePc = 72;
                            continue stateLoop;
                        }
                    }
                    case 69: {
                        try {
                            stackIn_70_0 = param1.d(var4, -1323322296);
                            statePc = 70;
                            continue stateLoop;
                        } catch (Throwable stateCaught_69) {
                            caughtException = stateCaught_69;
                            statePc = 72;
                            continue stateLoop;
                        }
                    }
                    case 70: {
                        try {
                            var18.c(5);
                            statePc = 71;
                            continue stateLoop;
                        } catch (Throwable stateCaught_70) {
                            caughtException = stateCaught_70;
                            statePc = 72;
                            continue stateLoop;
                        }
                    }
                    case 71: {
                        return;
                    }
                    case 72: {
                        var2 = (RuntimeException) ((Object) caughtException);
                        stackIn_74_0 = (RuntimeException) (var2);
                        stackIn_73_0 = stackIn_74_0;
                        stackIn_74_1 = new StringBuilder().append("lc.S(").append(param0).append(',');
                        stackIn_73_1 = stackIn_74_1;
                        if (param1 == null) {
                            statePc = 74;
                        } else {
                            statePc = 73;
                        }
                        continue stateLoop;
                    }
                    case 73: {
                        stackIn_75_0 = (RuntimeException) ((Object) stackIn_73_0);
                        stackIn_75_1 = (StringBuilder) ((Object) stackIn_73_1);
                        stackIn_75_2 = "{...}";
                        statePc = 75;
                        continue stateLoop;
                    }
                    case 74: {
                        stackIn_75_0 = (RuntimeException) ((Object) stackIn_74_0);
                        stackIn_75_1 = (StringBuilder) ((Object) stackIn_74_1);
                        stackIn_75_2 = "null";
                        statePc = 75;
                        continue stateLoop;
                    }
                    case 75: {
                        throw ch.a((Throwable) ((Object) stackIn_75_0), stackIn_75_2 + ')');
                    }
                    default: throw new IllegalStateException("invalid CFG state " + statePc);
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
        int statePc = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var5 = Transmogrify.field_A ? 1 : 0;
                    if (param2 >= 64) {
                        statePc = 2;
                    } else {
                        statePc = 1;
                    }
                    continue stateLoop;
                }
                case 1: {
                    var6 = (pl) null;
                    this.a(false, (pl) null, true, (byte) 16);
                    statePc = 2;
                    continue stateLoop;
                }
                case 2: {
                    if (this.field_H[param1] == param0) {
                        statePc = 8;
                    } else {
                        statePc = 3;
                    }
                    continue stateLoop;
                }
                case 3: {
                    this.field_H[param1] = param0;
                    var4 = 0;
                    statePc = 4;
                    continue stateLoop;
                }
                case 4: {
                    if (var4 >= 128) {
                        statePc = 8;
                    } else {
                        statePc = 5;
                    }
                    continue stateLoop;
                }
                case 5: {
                    this.field_l[param1][var4] = null;
                    var4++;
                    if (var5 != 0) {
                        statePc = 8;
                    } else {
                        statePc = 6;
                    }
                    continue stateLoop;
                }
                case 6: {
                    if (var5 == 0) {
                        statePc = 4;
                    } else {
                        statePc = 8;
                    }
                    continue stateLoop;
                }
                case 8: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    private final void b(int param0, int param1, int param2, int param3) {
        Object stackIn_19_0 = null;
        int stackIn_19_1 = 0;
        Object stackIn_20_0 = null;
        int stackIn_20_1 = 0;
        int stackIn_20_2 = 0;
        kc var5;
        int var6_int;
        hb var6;
        kc var7;
        kc var8;
        int var9;
        si var10;
        si var11;
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
                    stackIn_19_0 = this;

                    stackIn_19_1 = 0;

                    if (-1 >= (var10.field_k[param1] ^ -1)) {
                      stackIn_20_0 = this;
                      stackIn_20_1 = stackIn_19_1;
                      stackIn_20_2 = 0;
                      break L6;
                    } else {
                      stackIn_20_0 = this;
                      stackIn_20_1 = stackIn_19_1;
                      stackIn_20_2 = 1;
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
        int stackIn_9_0 = 0;
        int stackIn_17_0 = 0;
        int stackIn_37_0 = 0;
        int stackIn_37_1 = 0;
        int stackIn_56_0 = 0;
        int stackIn_56_1 = 0;
        int stackIn_71_0 = 0;
        int stackIn_73_0 = 0;
        RuntimeException stackIn_76_0 = null;
        StringBuilder stackIn_76_1 = null;
        RuntimeException stackIn_77_0 = null;
        StringBuilder stackIn_77_1 = null;
        String stackIn_77_2 = null;
        StringBuilder stackIn_79_1 = null;
        StringBuilder stackIn_80_1 = null;
        String stackIn_80_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        nh var7 = null;
        int var8 = 0;
        double var9 = 0.0;
        int var11 = 0;
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
                stackIn_9_0 = 1;
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
                          stackIn_37_0 = param4.field_m;

                          stackIn_37_1 = (255 & var7.field_g[2 + param4.field_q]) << 1029106728;

                          if (var11 != 0) {
                            break L13;
                          } else {
                            if (stackIn_37_0 <= stackIn_37_1) {
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
                      stackIn_37_0 = param4.field_q;
                      stackIn_37_1 = var7.field_g.length + -2;
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
                              stackIn_56_0 = param4.field_p;

                              stackIn_56_1 = (255 & var7.field_c[2 + param4.field_w]) << -1167185912;

                              if (var11 != 0) {
                                break L20;
                              } else {
                                if (stackIn_56_0 <= stackIn_56_1) {
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
                          stackIn_56_0 = param4.field_w ^ -1;
                          stackIn_56_1 = var7.field_c.length - 2 ^ -1;
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
                stackIn_73_0 = 0;
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
                stackIn_71_0 = 1;
                decompiledRegionSelector0 = 2;
                break L0;
              }
            } else {
              stackIn_17_0 = 1;
              decompiledRegionSelector0 = 1;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L26: {
            var6 = decompiledCaughtException;
            stackIn_76_0 = (RuntimeException) (var6);

            stackIn_76_1 = new StringBuilder().append("lc.GA(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_77_0 = (RuntimeException) ((Object) stackIn_76_0);
              stackIn_77_1 = (StringBuilder) ((Object) stackIn_76_1);
              stackIn_77_2 = "null";
              break L26;
            } else {
              stackIn_77_0 = (RuntimeException) ((Object) stackIn_76_0);
              stackIn_77_1 = (StringBuilder) ((Object) stackIn_76_1);
              stackIn_77_2 = "{...}";
              break L26;
            }
          }
          L27: {


            stackIn_79_1 = ((StringBuilder) (Object) stackIn_77_1).append(stackIn_77_2).append(',');

            if (param4 == null) {
              stackIn_77_0 = (RuntimeException) ((Object) stackIn_77_0);
              stackIn_80_1 = (StringBuilder) ((Object) stackIn_79_1);
              stackIn_80_2 = "null";
              break L27;
            } else {
              stackIn_77_0 = (RuntimeException) ((Object) stackIn_77_0);
              stackIn_80_1 = (StringBuilder) ((Object) stackIn_79_1);
              stackIn_80_2 = "{...}";
              break L27;
            }
          }
          throw ch.a((Throwable) ((Object) stackIn_77_0), stackIn_80_2 + ')');
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
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var7 = Transmogrify.field_A ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        this.a((byte) -100, param2);
                        this.field_I.a(param1.field_g);
                        stackIn_3_0 = this;
                        stackIn_2_0 = stackIn_3_0;
                        if (!param0) {
                            statePc = 3;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        stackIn_4_0 = this;
                        stackIn_4_1 = 1;
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        stackIn_4_0 = this;
                        stackIn_4_1 = 0;
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        ((lc) (this)).field_A = stackIn_4_1 != 0;
                        this.field_O = 0L;
                        var5_int = this.field_I.c();
                        if (param3 == -81) {
                            statePc = 6;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 5: {
                    return;
                }
                case 6: {
                    try {
                        var6 = 0;
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        if (var6 >= var5_int) {
                            statePc = 11;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        this.field_I.d(var6);
                        this.field_I.c(var6);
                        this.field_I.f(var6);
                        var6++;
                        if (var7 != 0) {
                            statePc = 17;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        if (var7 == 0) {
                            statePc = 7;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        statePc = 11;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        this.field_n = this.field_I.a();
                        this.field_J = this.field_I.field_a[this.field_n];
                        this.field_s = this.field_I.e(this.field_J);
                        statePc = 17;
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 13: {
                    runtimeException = (RuntimeException) ((Object) caughtException);
                    stackIn_15_0 = (RuntimeException) (runtimeException);
                    stackIn_14_0 = stackIn_15_0;
                    stackIn_15_1 = new StringBuilder().append("lc.RA(").append(param0).append(',');
                    stackIn_14_1 = stackIn_15_1;
                    if (param1 == null) {
                        statePc = 15;
                    } else {
                        statePc = 14;
                    }
                    continue stateLoop;
                }
                case 14: {
                    stackIn_16_0 = (RuntimeException) ((Object) stackIn_14_0);
                    stackIn_16_1 = (StringBuilder) ((Object) stackIn_14_1);
                    stackIn_16_2 = "{...}";
                    statePc = 16;
                    continue stateLoop;
                }
                case 15: {
                    stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
                    stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
                    stackIn_16_2 = "null";
                    statePc = 16;
                    continue stateLoop;
                }
                case 16: {
                    throw ch.a((Throwable) ((Object) stackIn_16_0), stackIn_16_2 + ',' + param2 + ',' + param3 + ')');
                }
                case 17: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final synchronized void c(int param0, int param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        int statePc = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var5 = Transmogrify.field_A ? 1 : 0;
                    if (param2 == 0) {
                        statePc = 2;
                    } else {
                        statePc = 1;
                    }
                    continue stateLoop;
                }
                case 1: {
                    return;
                }
                case 2: {
                    if (-1 >= (param0 ^ -1)) {
                        statePc = 9;
                    } else {
                        statePc = 3;
                    }
                    continue stateLoop;
                }
                case 3: {
                    var4 = 0;
                    statePc = 4;
                    continue stateLoop;
                }
                case 4: {
                    if (var4 >= 16) {
                        statePc = 8;
                    } else {
                        statePc = 5;
                    }
                    continue stateLoop;
                }
                case 5: {
                    this.field_r[var4] = param1;
                    var4++;
                    if (var5 != 0) {
                        statePc = 10;
                    } else {
                        statePc = 6;
                    }
                    continue stateLoop;
                }
                case 6: {
                    if (var5 == 0) {
                        statePc = 4;
                    } else {
                        statePc = 8;
                    }
                    continue stateLoop;
                }
                case 8: {
                    if (var5 == 0) {
                        statePc = 10;
                    } else {
                        statePc = 9;
                    }
                    continue stateLoop;
                }
                case 9: {
                    this.field_r[param0] = param1;
                    statePc = 10;
                    continue stateLoop;
                }
                case 10: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
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
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
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
              stackIn_9_0 = 1;
              break L0;
            } else {
              return false;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackIn_12_0 = (RuntimeException) (var3);

            stackIn_12_1 = new StringBuilder().append("lc.JA(").append(param0).append(',');

            if (param1 == null) {
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
          throw ch.a((Throwable) ((Object) stackIn_13_0), stackIn_13_2 + ')');
        }
        return stackIn_9_0 != 0;
    }

    final synchronized void d(int param0) {
        int var2;
        long var3;
        int var5;
        int var6;
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
        int stackIn_7_0 = 0;
        int stackIn_7_1 = 0;
        int stackIn_9_0 = 0;
        int stackIn_9_1 = 0;
        int stackIn_11_0 = 0;
        int stackIn_11_1 = 0;
        int stackIn_26_0 = 0;
        int stackIn_26_1 = 0;
        int statePc = 0;
        int var2 = 0;
        int var3 = 0;
        long var4 = 0L;
        int var6 = 0;
        int var7 = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var7 = Transmogrify.field_A ? 1 : 0;
                    if (!param0) {
                        statePc = 2;
                    } else {
                        statePc = 1;
                    }
                    continue stateLoop;
                }
                case 1: {
                    return;
                }
                case 2: {
                    var2 = this.field_n;
                    var3 = this.field_J;
                    var4 = this.field_s;
                    if (this.field_x == null) {
                        statePc = 6;
                    } else {
                        statePc = 3;
                    }
                    continue stateLoop;
                }
                case 3: {
                    if ((this.field_E ^ -1) != (var3 ^ -1)) {
                        statePc = 6;
                    } else {
                        statePc = 4;
                    }
                    continue stateLoop;
                }
                case 4: {
                    this.a(this.field_A, this.field_x, this.field_k, (byte) -81);
                    this.b(param0);
                    return;
                }
                case 6: {
                    stackIn_7_0 = this.field_J;
                    stackIn_7_1 = var3;
                    statePc = 7;
                    continue stateLoop;
                }
                case 7: {
                    if (stackIn_7_0 != stackIn_7_1) {
                        statePc = 24;
                    } else {
                        statePc = 8;
                    }
                    continue stateLoop;
                }
                case 8: {
                    stackIn_26_0 = var3 ^ -1;
                    stackIn_9_0 = stackIn_26_0;
                    stackIn_26_1 = this.field_I.field_a[var2] ^ -1;
                    stackIn_9_1 = stackIn_26_1;
                    if (var7 != 0) {
                        statePc = 26;
                    } else {
                        statePc = 9;
                    }
                    continue stateLoop;
                }
                case 9: {
                    if (stackIn_9_0 != stackIn_9_1) {
                        statePc = 23;
                    } else {
                        statePc = 10;
                    }
                    continue stateLoop;
                }
                case 10: {
                    this.field_I.d(var2);
                    var6 = this.field_I.b(var2);
                    stackIn_7_0 = var6 ^ -1;
                    stackIn_11_0 = stackIn_7_0;
                    stackIn_7_1 = -2;
                    stackIn_11_1 = stackIn_7_1;
                    if (var7 != 0) {
                        statePc = 7;
                    } else {
                        statePc = 11;
                    }
                    continue stateLoop;
                }
                case 11: {
                    if (stackIn_11_0 != stackIn_11_1) {
                        statePc = 20;
                    } else {
                        statePc = 12;
                    }
                    continue stateLoop;
                }
                case 12: {
                    this.field_I.d();
                    this.field_I.f(var2);
                    if (!this.field_I.f()) {
                        statePc = 23;
                    } else {
                        statePc = 13;
                    }
                    continue stateLoop;
                }
                case 13: {
                    if (null == this.field_x) {
                        statePc = 15;
                    } else {
                        statePc = 14;
                    }
                    continue stateLoop;
                }
                case 14: {
                    this.a(-73, this.field_A, this.field_x);
                    this.b(param0);
                    return;
                }
                case 15: {
                    if (!this.field_A) {
                        statePc = 19;
                    } else {
                        statePc = 16;
                    }
                    continue stateLoop;
                }
                case 16: {
                    if (var3 == 0) {
                        statePc = 19;
                    } else {
                        statePc = 17;
                    }
                    continue stateLoop;
                }
                case 17: {
                    this.field_I.a(var4);
                    if (var7 == 0) {
                        statePc = 23;
                    } else {
                        statePc = 19;
                    }
                    continue stateLoop;
                }
                case 19: {
                    this.a(false, true);
                    this.field_I.g();
                    return;
                }
                case 20: {
                    if (0 == (128 & var6)) {
                        statePc = 22;
                    } else {
                        statePc = 21;
                    }
                    continue stateLoop;
                }
                case 21: {
                    this.b(-106, var6);
                    statePc = 22;
                    continue stateLoop;
                }
                case 22: {
                    this.field_I.c(var2);
                    this.field_I.f(var2);
                    if (var7 == 0) {
                        statePc = 8;
                    } else {
                        statePc = 23;
                    }
                    continue stateLoop;
                }
                case 23: {
                    var2 = this.field_I.a();
                    var3 = this.field_I.field_a[var2];
                    var4 = this.field_I.e(var3);
                    if (var7 == 0) {
                        statePc = 6;
                    } else {
                        statePc = 24;
                    }
                    continue stateLoop;
                }
                case 24: {
                    this.field_n = var2;
                    this.field_s = var4;
                    this.field_J = var3;
                    if (null == this.field_x) {
                        statePc = 28;
                    } else {
                        statePc = 25;
                    }
                    continue stateLoop;
                }
                case 25: {
                    stackIn_26_0 = this.field_E;
                    stackIn_26_1 = var3;
                    statePc = 26;
                    continue stateLoop;
                }
                case 26: {
                    if (stackIn_26_0 >= stackIn_26_1) {
                        statePc = 28;
                    } else {
                        statePc = 27;
                    }
                    continue stateLoop;
                }
                case 27: {
                    this.field_J = this.field_E;
                    this.field_n = -1;
                    this.field_s = this.field_I.e(this.field_J);
                    statePc = 28;
                    continue stateLoop;
                }
                case 28: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
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
