/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class cp extends se implements jn, in {
    static String field_L;
    static fm field_H;
    private gn field_M;
    gl field_V;
    static ul field_P;
    static Calendar field_U;
    private gn field_W;
    private on field_G;
    static ja[] field_X;
    static th field_T;
    static String[][] field_J;
    static int field_O;
    static boolean field_K;
    static String[] field_I;
    static String[][] field_S;
    static String[] field_Q;
    static String[] field_R;
    static String[][] field_N;

    final boolean a(int param0, char param1, cf param2, int param3) {
        RuntimeException var5 = null;
        int stackIn_2_0 = 0;
        boolean stackIn_6_0 = false;
        boolean stackIn_10_0 = false;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_5_0 = false;
        boolean stackOut_9_0 = false;
        int stackOut_1_0 = 0;
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
            if (!super.a(param0, param1, param2, param3)) {
              if ((param0 ^ -1) == -99) {
                stackOut_5_0 = this.a((byte) -1, param2);
                stackIn_6_0 = stackOut_5_0;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                if (param0 == 99) {
                  stackOut_9_0 = this.a(param3 + 6241, param2);
                  stackIn_10_0 = stackOut_9_0;
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  return false;
                }
              }
            } else {
              stackOut_1_0 = 1;
              stackIn_2_0 = stackOut_1_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var5 = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) (var5);
            stackOut_11_1 = new StringBuilder().append("cp.CA(").append(param0).append(',').append(param1).append(',');
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param2 == null) {
              stackOut_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackOut_13_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L1;
            } else {
              stackOut_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackOut_12_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L1;
            }
          }
          throw fa.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_6_0;
          } else {
            return stackIn_10_0;
          }
        }
    }

    private final void i(int param0) {
        boolean discarded$0 = false;
        if (!(this.h(param0 + -16777195))) {
            return;
        }
        ai.a(this.field_G.field_j, (byte) 126);
        if (param0 != 16777215) {
            discarded$0 = this.h(-58);
        }
    }

    public final void a(int param0) {
        if (param0 != 496) {
            return;
        }
        ((tp) ((Object) this.field_G.a((byte) -67))).i(-22837);
    }

    public final void a(int param0, int param1, gn param2, int param3, int param4) {
        RuntimeException var6 = null;
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
              L2: {
                if (param2 != this.field_W) {
                  break L2;
                } else {
                  qe.c((byte) 125);
                  if (!ZombieDawnMulti.field_E) {
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              if (param2 == this.field_M) {
                this.i(16777215);
                break L1;
              } else {
                break L1;
              }
            }
            if (param3 < -83) {
              break L0;
            } else {
              field_N = (String[][]) null;
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var6 = decompiledCaughtException;
            stackOut_9_0 = (RuntimeException) (var6);
            stackOut_9_1 = new StringBuilder().append("cp.E(").append(param0).append(',').append(param1).append(',');
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param2 == null) {
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
          throw fa.a((Throwable) ((Object) stackIn_12_0), stackIn_12_2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    private final boolean a(kh param0, int param1) {
        j var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        re var5 = null;
        int stackIn_2_0 = 0;
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
        int stackOut_4_0 = 0;
        int stackOut_1_0 = 0;
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
            var4 = 75 / ((param1 - -51) / 54);
            var3 = param0.a((byte) -119);
            if (var3 != null) {
              L1: {
                var5 = var3.d(55);
                if (var5 != db.field_b) {
                  stackOut_5_0 = 0;
                  stackIn_6_0 = stackOut_5_0;
                  break L1;
                } else {
                  stackOut_4_0 = 1;
                  stackIn_6_0 = stackOut_4_0;
                  break L1;
                }
              }
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackOut_1_0 = 1;
              stackIn_2_0 = stackOut_1_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3_ref = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) (var3_ref);
            stackOut_7_1 = new StringBuilder().append("cp.D(");
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
          throw fa.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0 != 0;
        } else {
          return stackIn_6_0 != 0;
        }
    }

    public cp() {
        super(0, 0, 496, 0, (nl) null);
        this.field_G = new on("", (bj) null, 12);
        hq var1 = new hq(field_H, 0, 0, 0, 0, 16777215, -1, 3, 0, ke.field_h.field_C, -1, 2147483647, true);
        cf var2 = new cf(la.field_e, var1, (bj) null);
        this.field_M = new gn(ji.field_e, (bj) null);
        this.field_W = new gn(gk.field_a, (bj) null);
        this.field_G.field_x = bi.field_d;
        this.field_G.a((byte) -27, new tp(this.field_G));
        this.field_M.field_F = false;
        this.field_M.field_h = (nl) ((Object) new oq());
        this.field_W.field_h = (nl) ((Object) new he());
        this.field_G.field_h = (nl) ((Object) new tb(10000536));
        int var3 = 20;
        int var4 = 4;
        var2.b(20, var3, 28972, 270, 50);
        int var5 = 200;
        var3 += 50;
        this.b((byte) 101, var2);
        var3 = var3 + (this.a(var3, ia.field_w, 170, this.field_G, -43, r.field_e) + 5);
        this.field_M.b(-var5 + 496 >> -1771215743, var3, 28972, var5, 40);
        this.field_W.b(3 + var4, var3 + 15, 28972, 60, 40);
        this.field_W.field_A = (bj) (this);
        this.field_M.field_A = (bj) (this);
        this.b((byte) 61, this.field_M);
        this.b((byte) 81, this.field_W);
        this.field_V = new gl((jn) (this));
        this.field_V.b(60 + this.field_G.field_n + this.field_G.field_y, 20, 28972, -60 + (this.field_n + -this.field_G.field_y - this.field_G.field_n), 150);
        this.b((byte) 120, this.field_V);
        this.b(0, 0, 28972, 496, var4 + 55 + var3);
    }

    public static void c(boolean param0) {
        field_S = (String[][]) null;
        if (!param0) {
          field_I = (String[]) null;
          field_J = (String[][]) null;
          field_P = null;
          field_L = null;
          field_N = (String[][]) null;
          field_I = null;
          field_Q = null;
          field_H = null;
          field_R = null;
          field_T = null;
          field_X = null;
          field_U = null;
          return;
        } else {
          field_J = (String[][]) null;
          field_P = null;
          field_L = null;
          field_N = (String[][]) null;
          field_I = null;
          field_Q = null;
          field_H = null;
          field_R = null;
          field_T = null;
          field_X = null;
          field_U = null;
          return;
        }
    }

    final void a(int param0, cf param1, int param2, int param3) {
        try {
            super.a(param0, param1, param2, param3);
            this.field_M.field_F = this.h(param0 + 5427);
        } catch (RuntimeException runtimeException) {
            throw fa.a((Throwable) ((Object) runtimeException), "cp.T(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ')');
        }
    }

    private final int a(int param0, String param1, int param2, cf param3, int param4, String param5) {
        int discarded$2 = 0;
        RuntimeException var7 = null;
        String var8 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_2_0 = 0;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
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
              if (param4 < -9) {
                break L1;
              } else {
                var8 = (String) null;
                discarded$2 = this.a(82, (String) null, 77, (cf) null, 115, (String) null);
                break L1;
              }
            }
            stackOut_2_0 = this.a(param0, param3, param5, 35, param1, 12352, param2);
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var7 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) (var7);
            stackOut_4_1 = new StringBuilder().append("cp.G(").append(param0).append(',');
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param1 == null) {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackOut_5_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          L3: {
            stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
            stackOut_7_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(',').append(param2).append(',');
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param3 == null) {
              stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackOut_9_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L3;
            } else {
              stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackOut_8_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L3;
            }
          }
          L4: {
            stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
            stackOut_10_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(',').append(param4).append(',');
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param5 == null) {
              stackOut_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackOut_12_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L4;
            } else {
              stackOut_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackOut_11_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L4;
            }
          }
          throw fa.a((Throwable) ((Object) stackIn_13_0), stackIn_13_2 + ')');
        }
        return stackIn_3_0;
    }

    static long a(long param0, long param1) {
        return param0 | param1;
    }

    public final void a(String param0, int param1) {
        on var3 = null;
        String var4 = null;
        if (param1 != 1) {
            return;
        }
        try {
            var3 = this.field_G;
            var4 = param0;
            ((pm) ((Object) var3)).a(false, var4, (byte) 117);
        } catch (RuntimeException runtimeException) {
            throw fa.a((Throwable) ((Object) runtimeException), "cp.B(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    private final int a(int param0, cf param1, String param2, int param3, String param4, int param5, int param6) {
        RuntimeException var8 = null;
        km var9 = null;
        el var10 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_2_0 = 0;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
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
              if (param5 == 12352) {
                break L1;
              } else {
                field_U = (Calendar) null;
                break L1;
              }
            }
            var10 = new el(20, param0, 120 + param6, 25, param1, false, 120, 3, ke.field_h, 16777215, param4);
            this.b((byte) 115, var10);
            var9 = new km(((kh) ((Object) param1)).a((byte) -61), param2, 126, var10.field_w + param0, 25 + param6, param3);
            var9.field_A = (bj) (this);
            this.b((byte) 91, var9);
            stackOut_2_0 = var9.field_w + var10.field_w;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var8 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) (var8);
            stackOut_4_1 = new StringBuilder().append("cp.C(").append(param0).append(',');
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param1 == null) {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackOut_5_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          L3: {
            stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
            stackOut_7_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(',');
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param2 == null) {
              stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackOut_9_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L3;
            } else {
              stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackOut_8_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L3;
            }
          }
          L4: {
            stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
            stackOut_10_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(',').append(param3).append(',');
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param4 == null) {
              stackOut_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackOut_12_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L4;
            } else {
              stackOut_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackOut_11_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L4;
            }
          }
          throw fa.a((Throwable) ((Object) stackIn_13_0), stackIn_13_2 + ',' + param5 + ',' + param6 + ')');
        }
        return stackIn_3_0;
    }

    private final boolean h(int param0) {
        cf var3 = null;
        if (this.a((kh) (this.field_G), param0 + 104)) {
          if (param0 != 20) {
            var3 = (cf) null;
            this.a(-4, (cf) null, -95, 88);
            return true;
          } else {
            return true;
          }
        } else {
          return false;
        }
    }

    static {
        field_L = "Charm";
        field_U = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
        field_T = new th();
        field_I = new String[]{"<col=FF0000>Disguise</col>: don a costume to blend in seamlessly with the environment. Your zombie won't lunge at survivors from a distance but, if it gets close, it won't resist the urge to bite.", "<col=FF0000>Speed</col>: go hyperactive and gain super-speed! Your zombie will move twice as fast to catch those fleshy humans.", "<col=FF0000>Meltdown</col>: dissolve into a puddle of sticky goo! Humans run very slowly through it, but zombies will be unaffected.", "<col=FF0000>Hammer</col>: stun any human or zombie in your field of influence!", "<col=E4F26A>More powerups can be researched by playing Rated games</col>!"};
        field_N = new String[4][6];
        field_J = new String[][]{new String[]{"Welcome to Zombie Dawn Multiplayer!", "How To Win"}, new String[]{"Basic Controls"}, new String[]{"Advanced Controls"}, new String[]{"The Interface"}, new String[]{"Starting Powerups"}, new String[]{"Starting Traits"}, new String[]{"Research"}};
        field_S = new String[][]{new String[]{"1983: The <col=FF0000>undead apocalypse</col> conquered humanity. The remaining humans are nothing more than fodder, but there aren't enough brains to go around; zombies have started fighting each other, and you lead one group.", "The goal of each match is to <col=FF0000>herd humans into your portal</col>, sending them to your laboratory for dastardly research (and Research Points)! You can also zombify humans, then send those zombies into your portal. To win a match, <col=FF0000>simply get more Research Points than your opponents</col>!"}, new String[]{"<col=FF0000>Left-click</col> on a zombie to select it.<br><col=FF0000>Right-click</col> to deselect.", "<col=FF0000>Left-click and drag a box</col> to select several zombies at once.", "<col=FF0000>Left-click</col> on the map to send your selected minions there.", "<col=FF0000>'ESC'</col>: Open the Options menu", "<col=FF0000>Arrow keys</col>/<col=FF0000>'W', 'A', 'S', and 'D' keys</col>: Move the camera"}, new String[]{"<col=FF0000>Right-click and drag</col> to move the<nbsp>camera.", "<col=FF0000>'SHIFT' + left-click</col> a zombie to add it to the current<nbsp>selection.", "<col=FF0000>'CTRL' + 'A'</col> to select every one of your zombies.", "<col=FF0000>'Z', 'X', 'C', 'V' and 'B'</col> are shortcut keys to select powerups."}, new String[]{"This tracks your progress as you zombify humans, showing how many remain.<br><br><br>This indicates <col=FF0000>how many zombies</col> you have under your control - if this goes to zero, it's the end of the match for you! Any zombies that go through a portal are converted to <col=FF0000>Research Points</col>.<br><br><br>Matches have <col=FF0000>time limits</col>. Once the timer hits zero, any remaining zombies on the map will go into meltdown. The more humans that are abducted or zombified, the faster the timer ticks down."}, new String[]{"You can hold several powerups in the menu at the bottom of the screen. Use them by clicking the hand that holds it, then target them with another click. Powerups can be used again after they've had a moment to <col=FF0000>recharge</col>."}, new String[]{"You start with a handful of traits and powerups, but many more can be discovered through research. You can gain valuable research in <col=FF0000>Rated games</col> by driving humans into your portal, or by zombifying humans and sending those zombies through your portal.<br><br>All the research you collect in a match will go towards the powerups and traits that you <col=FF0000>used</col> in that match, then, when that research is fully complete, you will unlock new powerups and traits."}};
        field_Q = new String[]{"Traits affect all of your zombies, all of the time. You can have up to three different traits equipped at one time.", "<col=FF0000>Hungry</col>: your zombies hunger for human flesh and will lunge faster and from further away.", "<col=FF0000>Nimble Fingers</col>: your powerups recharge faster than normal.", "<col=FF0000>Expert</col>: powerups with a fixed duration last longer.", "<col=FF0000>Zombie-lover</col>: increases the number of Research Points you get from zombies.", "<col=E4F26A>More traits can be researched by playing Rated games</col>!"};
        field_R = new String[]{"1983: The undead apocalypse conquered humanity.", "The remaining humans are nothing more than fodder...", "...but there aren't enough brains to go around.", "The overlords have started fighting each other over the few remaining humans", "You rule one shamble of zombies", "Now, try to rule the world!"};
        field_N = new String[][]{new String[]{"Introduction", "Lower Mall", "Sports Store", "Supermarket", "Upper Mall", "The Cinema"}, new String[]{"Power Plant", "Main Reactor", "Nuclear Waste Zone", "Lower Offices", "Backup Generator", "Laboratory"}, new String[]{"Police Precinct", "Archives", "Holding Cells", "Cafeteria", "Fifth Floor", "Jailbreak"}, new String[]{"The White House", "Press Conference", "Ballroom", "Rose Garden", "Situation Room", "The West Wing"}};
    }
}
