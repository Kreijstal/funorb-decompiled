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
                return;
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
        int stackIn_8_0 = 0;
        int stackIn_11_0 = 0;
        int stackIn_14_0 = 0;
        int stackIn_18_0 = 0;
        int stackIn_21_0 = 0;
        int stackIn_23_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var2 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          L0: {
            L1: {
              if (!param0) {
                break L1;
              } else {
                lk.b(true);
                break L1;
              }
            }
            nb.field_a.a(hj.field_c, (byte) -27, nk.field_s, true);
            nb.field_a.h((byte) -104);
            L2: while (true) {
              if (!ba.c(-1)) {
                if (-1 == jk.field_j) {
                  if (!nj.field_f) {
                    if (ta.field_hb != dj.field_k) {
                      if (!tg.field_g.d(-96)) {
                        stackIn_18_0 = 1;
                        decompiledRegionSelector0 = 3;
                        break L0;
                      } else {
                        if (dj.field_k != id.field_B) {
                          stackIn_23_0 = -1;
                          decompiledRegionSelector0 = 5;
                          break L0;
                        } else {
                          stackIn_21_0 = 2;
                          decompiledRegionSelector0 = 4;
                          break L0;
                        }
                      }
                    } else {
                      stackIn_14_0 = 1;
                      decompiledRegionSelector0 = 2;
                      break L0;
                    }
                  } else {
                    stackIn_11_0 = 3;
                    decompiledRegionSelector0 = 1;
                    break L0;
                  }
                } else {
                  var1_int = jk.field_j;
                  fb.a(-1, 107);
                  stackIn_8_0 = var1_int;
                  decompiledRegionSelector0 = 0;
                  break L0;
                }
              } else {
                nb.field_a.a(0, pn.field_d, sj.field_p);
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw fa.a((Throwable) ((Object) var1), "lk.L(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_8_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_11_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_14_0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_18_0;
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return stackIn_21_0;
                } else {
                  return stackIn_23_0;
                }
              }
            }
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
