/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ba extends gn implements dm {
    private String field_K;
    static String field_M;
    static int[] field_N;
    static hl field_L;
    private jb field_R;
    private int[] field_U;
    static boolean[][] field_S;
    private int field_V;
    private ae[] field_O;
    private lk field_T;
    static String field_P;
    static int field_Q;

    public static void h(int param0) {
        if (param0 != 22) {
            ba.a(34);
        }
        field_P = null;
        field_M = null;
        field_N = null;
        field_L = null;
        field_S = (boolean[][]) null;
    }

    final static void a(int param0) {
        int var2 = 0;
        L0: {
          var2 = TetraLink.field_J;
          if (aa.field_bc.field_c) {
            if ((aa.field_bc.field_a.field_n & 1 << aa.field_bc.field_i) != 0) {
              cd.field_c[18] = wk.field_a;
              break L0;
            } else {
              if (aa.field_bc.field_a.field_n == 0) {
                if ((aa.field_bc.field_m | 1 << aa.field_bc.field_i) == 3) {
                  cd.field_c[18] = fn.field_M;
                  break L0;
                } else {
                  cd.field_c[18] = lh.field_r;
                  break L0;
                }
              } else {
                cd.field_c[18] = ce.field_c;
                break L0;
              }
            }
          } else {
            if ((aa.field_bc.field_a.field_n & 1 << aa.field_bc.field_i) == 0) {
              if (aa.field_bc.field_a.field_n != 0) {
                cd.field_c[18] = tc.field_q;
                break L0;
              } else {
                if (-4 != ((aa.field_bc.field_m | 1 << aa.field_bc.field_i) ^ -1)) {
                  cd.field_c[18] = ej.field_w;
                  break L0;
                } else {
                  cd.field_c[18] = qn.field_v;
                  break L0;
                }
              }
            } else {
              cd.field_c[18] = co.field_s;
              break L0;
            }
          }
        }
        L1: {
          if (param0 == 1) {
            break L1;
          } else {
            ba.h(20);
            break L1;
          }
        }
    }

    public final void a(byte param0, ae param1, int param2, int param3, int param4) {
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        var8 = TetraLink.field_J;
        try {
          L0: {
            L1: {
              if (param0 < 0) {
                break L1;
              } else {
                this.field_K = (String) null;
                break L1;
              }
            }
            var6_int = 0;
            L2: while (true) {
              L3: {
                if (var6_int >= this.field_V) {
                  break L3;
                } else {
                  if (param1 != this.field_O[var6_int]) {
                    var6_int++;
                    continue L2;
                  } else {
                    var7 = this.field_U[var6_int];
                    if (var7 != -1) {
                      t.a(this.field_U[var6_int], 0);
                      break L3;
                    } else {
                      this.field_T.r(-128);
                      break L3;
                    }
                  }
                }
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var6 = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) (var6);
            stackOut_11_1 = new StringBuilder().append("ba.M(").append(param0).append(',');
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
              break L4;
            } else {
              stackOut_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackOut_12_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L4;
            }
          }
          throw oi.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final void a(int param0, int param1, int param2, int param3) {
        super.a(0, param1, param2, param3);
        int discarded$0 = this.field_R.a(this.field_K, 14 + (param1 + this.field_t), this.field_w + param2 - -10, this.field_F - 28, this.field_u, 16777215, -1, param0, 0, this.field_R.field_N);
    }

    private final void b(int param0, int param1) {
        int var5 = 0;
        int var6 = TetraLink.field_J;
        if (this.field_V >= param0) {
            return;
        }
        ae[] var7 = new ae[param0];
        ae[] var3 = var7;
        int[] var4 = new int[param0];
        for (var5 = param1; this.field_V > var5; var5++) {
            var7[var5] = this.field_O[var5];
            var4[var5] = this.field_U[var5];
        }
        this.field_U = var4;
        this.field_V = param0;
        this.field_O = var3;
    }

    final void a(String param0, int param1, int param2) {
        int var4_int = 0;
        try {
            var4_int = this.field_V;
            this.b(var4_int - -1, 0);
            int var5 = 80 / ((21 - param2) / 48);
            this.field_O[var4_int] = this.a((dn) (this), -67, param0);
            this.field_U[var4_int] = param1;
        } catch (RuntimeException runtimeException) {
            throw oi.a((Throwable) ((Object) runtimeException), "ba.D(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    final ae a(dn param0, int param1, String param2) {
        ae var4 = null;
        RuntimeException var4_ref = null;
        int var5 = 0;
        int var6 = 0;
        ae stackIn_1_0 = null;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        ae stackOut_0_0 = null;
        RuntimeException stackOut_2_0 = null;
        StringBuilder stackOut_2_1 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        String stackOut_3_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        try {
          L0: {
            var4 = new ae(param2, param0);
            var4.field_H = (kg) ((Object) new uj());
            var5 = -2 + this.field_u;
            this.a(this.field_u - -34, 0, 110, 0, this.field_F);
            var6 = 73 / ((param1 - -10) / 32);
            var4.a(30, var5, 122, 7, -14 + this.field_F);
            this.c(var4, 10);
            stackOut_0_0 = (ae) (var4);
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4_ref = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) (var4_ref);
            stackOut_2_1 = new StringBuilder().append("ba.G(");
            stackIn_4_0 = stackOut_2_0;
            stackIn_4_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param0 == null) {
              stackOut_4_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackOut_4_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackOut_4_2 = "null";
              stackIn_5_0 = stackOut_4_0;
              stackIn_5_1 = stackOut_4_1;
              stackIn_5_2 = stackOut_4_2;
              break L1;
            } else {
              stackOut_3_0 = (RuntimeException) ((Object) stackIn_3_0);
              stackOut_3_1 = (StringBuilder) ((Object) stackIn_3_1);
              stackOut_3_2 = "{...}";
              stackIn_5_0 = stackOut_3_0;
              stackIn_5_1 = stackOut_3_1;
              stackIn_5_2 = stackOut_3_2;
              break L1;
            }
          }
          L2: {
            stackOut_5_0 = (RuntimeException) ((Object) stackIn_5_0);
            stackOut_5_1 = ((StringBuilder) (Object) stackIn_5_1).append(stackIn_5_2).append(',').append(param1).append(',');
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param2 == null) {
              stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackOut_7_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L2;
            } else {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L2;
            }
          }
          throw oi.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ')');
        }
        return stackIn_1_0;
    }

    final static void a(le param0, int param1) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        try {
          L0: {
            L1: {
              ck.field_bb.a((byte) 63, param0);
              if (param1 >= 54) {
                break L1;
              } else {
                field_P = (String) null;
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) (runtimeException);
            stackOut_3_1 = new StringBuilder().append("ba.A(");
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param0 == null) {
              stackOut_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackOut_5_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L2;
            } else {
              stackOut_4_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackOut_4_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackOut_4_2 = "{...}";
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_6_2 = stackOut_4_2;
              break L2;
            }
          }
          throw oi.a((Throwable) ((Object) stackIn_6_0), stackIn_6_2 + ',' + param1 + ')');
        }
    }

    ba(lk param0, jb param1, String param2) {
        super(0, 0, 288, 0, (kg) null);
        int var4_int = 0;
        this.field_V = 0;
        try {
            this.field_R = param1;
            this.field_K = param2;
            this.field_T = param0;
            var4_int = null == this.field_K ? 0 : this.field_R.b(this.field_K, 260, this.field_R.field_N);
            this.a(var4_int + 22, 0, 69, 0, 288);
        } catch (RuntimeException runtimeException) {
            throw oi.a((Throwable) ((Object) runtimeException), "ba.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_M = "This game option is not available in rated games.";
        field_P = "Age:";
    }
}
