/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class lk extends id {
    private int field_K;
    private int field_M;
    private int field_Q;
    int field_S;
    static int[] field_P;
    static String field_I;
    boolean field_O;
    static int[][] field_G;
    static cj field_J;
    private int field_F;
    private int field_H;
    private int field_N;

    final void f(byte param0) {
        int fieldTemp$2 = 0;
        int fieldTemp$3 = 0;
        if (param0 < -79) {
          fieldTemp$2 = this.field_H + 1;
          this.field_H = this.field_H + 1;
          if ((fieldTemp$2 ^ -1) <= -5) {
            this.field_H = 0;
            fieldTemp$3 = this.field_M + 1;
            this.field_M = this.field_M + 1;
            if (fieldTemp$3 >= od.field_Fb.length) {
              if ((this.field_S ^ -1) == -2) {
                this.field_O = true;
                if (!ZombieDawnMulti.field_E) {
                  return;
                } else {
                  this.h((byte) -11);
                  return;
                }
              } else {
                this.h((byte) -11);
                return;
              }
            } else {
              return;
            }
          } else {
            return;
          }
        } else {
          return;
        }
    }

    final void a(int param0, int param1, int param2, int param3) {
        int var5;
        this.field_E = param2 << -1655083824;
        this.field_S = 0;
        this.field_N = param2;
        if (param3 != 7457) {
          lk.g((byte) -21);
          this.field_O = false;
          this.field_z = param0 << -1097850000;
          this.field_Q = param0;
          this.h((byte) -11);
          var5 = od.field_Fb.length;
          this.field_H = hp.a((byte) 68, g.field_a, 10);
          this.field_K = hp.a((byte) 107, g.field_a, param1);
          this.field_M = hp.a((byte) -68, g.field_a, var5);
          return;
        } else {
          this.field_O = false;
          this.field_z = param0 << -1097850000;
          this.field_Q = param0;
          this.h((byte) -11);
          var5 = od.field_Fb.length;
          this.field_H = hp.a((byte) 68, g.field_a, 10);
          this.field_K = hp.a((byte) 107, g.field_a, param1);
          this.field_M = hp.a((byte) -68, g.field_a, var5);
          return;
        }
    }

    final void a(int param0, nm param1) {
        int fieldTemp$2 = 0;
        RuntimeException runtimeException = null;
        int var3_int = 0;
        int var4 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param0 == -10136) {
              L1: {
                if (this.field_O) {
                  break L1;
                } else {
                  fieldTemp$2 = this.field_K - 1;
                  this.field_K = this.field_K - 1;
                  if (fieldTemp$2 > 0) {
                    break L1;
                  } else {
                    var3_int = param1.c(this.g(-50), -20126);
                    var4 = -24 + param1.d(this.h(-76), param0 + 10242);
                    if (io.a(var3_int, var4, (byte) -112, param1)) {
                      L2: {
                        if (he.field_a) {
                          break L2;
                        } else {
                          if (!fb.field_e.field_u.field_k[this.h(82) / 24][this.g(-95) / 24]) {
                            break L2;
                          } else {
                            decompiledRegionSelector0 = 3;
                            break L0;
                          }
                        }
                      }
                      od.field_Fb[this.field_M].c(var3_int, var4, this.field_F);
                      decompiledRegionSelector0 = 4;
                      break L0;
                    } else {
                      decompiledRegionSelector0 = 2;
                      break L0;
                    }
                  }
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
            runtimeException = decompiledCaughtException;
            stackIn_15_0 = (RuntimeException) (runtimeException);

            stackIn_15_1 = new StringBuilder().append("lk.H(").append(param0).append(',');

            if (param1 == null) {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "null";
              break L3;
            } else {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "{...}";
              break L3;
            }
          }
          throw fa.a((Throwable) ((Object) stackIn_16_0), stackIn_16_2 + ')');
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
              if (decompiledRegionSelector0 == 3) {
                return;
              } else {
                return;
              }
            }
          }
        }
    }

    public static void i(int param0) {
        if (param0 != 11041) {
          lk.i(-25);
          field_G = (int[][]) null;
          field_J = null;
          field_P = null;
          field_I = null;
          return;
        } else {
          field_G = (int[][]) null;
          field_J = null;
          field_P = null;
          field_I = null;
          return;
        }
    }

    final static int b(boolean param0) {
        int var1_int = 0;
        RuntimeException var1 = null;
        int var2 = 0;
        int stackIn_10_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_16_0 = 0;
        int stackIn_20_0 = 0;
        int stackIn_23_0 = 0;
        int stackIn_25_0 = 0;
        int decompiledRegionSelector0 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var2 = ZombieDawnMulti.field_E ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (!param0) {
                            statePc = 3;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 26;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        lk.b(true);
                        statePc = 3;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 26;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        nb.field_a.a(hj.field_c, (byte) -27, nk.field_s, true);
                        nb.field_a.h((byte) -104);
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 26;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        if (!ba.c(-1)) {
                            statePc = 8;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 26;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        nb.field_a.a(0, pn.field_d, sj.field_p);
                        if (var2 != 0) {
                            statePc = 11;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 26;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        if (var2 == 0) {
                            statePc = 4;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 26;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 26;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        if (-1 == jk.field_j) {
                            statePc = 11;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 26;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        var1_int = jk.field_j;
                        fb.a(-1, 107);
                        stackIn_10_0 = var1_int;
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 26;
                        continue stateLoop;
                    }
                }
                case 10: {
                    return stackIn_10_0;
                }
                case 11: {
                    try {
                        if (!nj.field_f) {
                            statePc = 14;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 26;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        stackIn_13_0 = 3;
                        statePc = 13;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 26;
                        continue stateLoop;
                    }
                }
                case 13: {
                    return stackIn_13_0;
                }
                case 14: {
                    try {
                        if (ta.field_hb != dj.field_k) {
                            statePc = 17;
                        } else {
                            statePc = 15;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 26;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        stackIn_16_0 = 1;
                        statePc = 16;
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 26;
                        continue stateLoop;
                    }
                }
                case 16: {
                    return stackIn_16_0;
                }
                case 17: {
                    try {
                        if (!tg.field_g.d(-96)) {
                            statePc = 19;
                        } else {
                            statePc = 18;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 26;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        statePc = 21;
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 26;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        stackIn_20_0 = 1;
                        statePc = 20;
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 26;
                        continue stateLoop;
                    }
                }
                case 20: {
                    return stackIn_20_0;
                }
                case 21: {
                    try {
                        if (dj.field_k != id.field_B) {
                            statePc = 24;
                        } else {
                            statePc = 22;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 26;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        stackIn_23_0 = 2;
                        statePc = 23;
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 26;
                        continue stateLoop;
                    }
                }
                case 23: {
                    return stackIn_23_0;
                }
                case 24: {
                    try {
                        stackIn_25_0 = -1;
                        statePc = 25;
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 26;
                        continue stateLoop;
                    }
                }
                case 25: {
                    return stackIn_25_0;
                }
                case 26: {
                    var1 = (RuntimeException) ((Object) caughtException);
                    throw fa.a((Throwable) ((Object) var1), "lk.L(" + param0 + ')');
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final static void g(byte param0) {
        int var1;
        int var2;
        int var3;
        if (param0 < 36) {
          lk.b(false);
          var1 = b.field_d * b.field_d;
          var2 = -(t.field_e * t.field_e) + var1;
          var3 = vj.field_t + var2 * (-vj.field_t + km.field_cb) / var1;
          dq.field_k.a(120, var3, 640, ck.field_a, -3344);
          eo.a(nj.field_h, ed.field_c, 0, -10, 5, 640, km.field_cb - 24);
          return;
        } else {
          var1 = b.field_d * b.field_d;
          var2 = -(t.field_e * t.field_e) + var1;
          var3 = vj.field_t + var2 * (-vj.field_t + km.field_cb) / var1;
          dq.field_k.a(120, var3, 640, ck.field_a, -3344);
          eo.a(nj.field_h, ed.field_c, 0, -10, 5, 640, km.field_cb - 24);
          return;
        }
    }

    lk() {
        super(0, 0, 0);
        this.field_H = 0;
    }

    final void j(int param0) {
        this.a(true);
        this.a(-4564);
        bo.field_a.a(-25612, (br) (this));
        if (param0 != 23068) {
            this.f((byte) -105);
        }
    }

    private final void h(byte param0) {
        this.field_F = 128 - -hp.a((byte) -85, g.field_a, 127);
        this.field_M = 0;
        this.field_z = this.field_Q + -12 + hp.a((byte) -106, g.field_a, 24) << 413735312;
        this.field_E = this.field_N - 12 - -hp.a((byte) 40, g.field_a, 24) << -1546083440;
        if (param0 != -11) {
            this.field_N = 22;
        }
    }

    static {
        field_I = "Kick <%0> from this game";
    }
}
