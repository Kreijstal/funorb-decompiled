/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class e extends hp implements hh {
    static int field_O;
    private an[] field_F;
    static String field_I;
    static int field_H;
    private rb field_L;
    private int[] field_J;
    static dn field_S;
    private int field_N;
    private String field_Q;
    static vn field_G;
    private sg field_R;
    static int field_P;
    static int field_K;

    final void a(int param0, int param1, int param2, int param3) {
        super.a(param0, param1, param2, param3 ^ 0);
        this.field_L.a(this.field_Q, this.field_k + param2 + 14, this.field_j + (param0 + 10), this.field_i - 28, this.field_n, 16777215, -1, 0, param3, this.field_L.field_I);
    }

    final an a(String param0, int param1, sk param2) {
        an var4 = null;
        RuntimeException var4_ref = null;
        int var5 = 0;
        an stackIn_2_0 = null;
        an stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param1 >= 102) {
              var4 = new an(param0, param2);
              var4.field_h = (io) ((Object) new vm());
              var5 = -2 + this.field_n;
              this.a(113, 0, 0, this.field_i, this.field_n + 34);
              var4.a(51, var5, 7, -14 + this.field_i, 30);
              this.a(var4, 10);
              stackIn_4_0 = (an) (var4);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = (an) null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4_ref = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var4_ref);

            stackIn_7_1 = new StringBuilder().append("e.F(");

            if (param0 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "null";
              break L1;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "{...}";
              break L1;
            }
          }
          L2: {


            stackIn_10_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_8_2).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L2;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L2;
            }
          }
          throw sh.a((Throwable) ((Object) stackIn_8_0), stackIn_11_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_4_0;
        }
    }

    final void a(byte param0, String param1, int param2) {
        int var4_int = 0;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        try {
          L0: {
            L1: {
              var4_int = this.field_N;
              this.a(-128, 1 + var4_int);
              this.field_F[var4_int] = this.a(param1, 125, (sk) (this));
              this.field_J[var4_int] = param2;
              if (param0 >= 88) {
                break L1;
              } else {
                this.field_F = (an[]) null;
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackIn_5_0 = (RuntimeException) (var4);

            stackIn_5_1 = new StringBuilder().append("e.H(").append(param0).append(',');

            if (param1 == null) {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "null";
              break L2;
            } else {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "{...}";
              break L2;
            }
          }
          throw sh.a((Throwable) ((Object) stackIn_6_0), stackIn_6_2 + ',' + param2 + ')');
        }
    }

    private final void a(int param0, int param1) {
        int var6 = 0;
        int var7 = ZombieDawn.field_J;
        if (!(this.field_N < param1)) {
            return;
        }
        int var4 = -81 / ((-66 - param0) / 59);
        an[] var8 = new an[param1];
        an[] var3 = var8;
        int[] var5 = new int[param1];
        for (var6 = 0; this.field_N > var6; var6++) {
            var8[var6] = this.field_F[var6];
            var5[var6] = this.field_J[var6];
        }
        this.field_N = param1;
        this.field_J = var5;
        this.field_F = var3;
    }

    e(sg param0, rb param1, String param2) {
        super(0, 0, 288, 0, (io) null);
        int var4_int = 0;
        this.field_N = 0;
        try {
            this.field_L = param1;
            this.field_Q = param2;
            this.field_R = param0;
            var4_int = this.field_Q != null ? this.field_L.b(this.field_Q, 260, this.field_L.field_I) : 0;
            this.a(44, 0, 0, 288, var4_int + 22);
        } catch (RuntimeException runtimeException) {
            throw sh.a((Throwable) ((Object) runtimeException), "e.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    public static void b(boolean param0) {
        field_S = null;
        field_I = null;
        if (!param0) {
            field_G = (vn) null;
        }
        field_G = null;
    }

    public final void a(int param0, int param1, an param2, int param3, int param4) {
        int var6_int = 0;
        int var7 = 0;
        int var8 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        var8 = ZombieDawn.field_J;
        try {
          L0: {
            L1: {
              if (param1 == -6) {
                break L1;
              } else {
                this.a(-49, -101);
                break L1;
              }
            }
            var6_int = 0;
            L2: while (true) {
              L3: {
                if (var6_int >= this.field_N) {
                  break L3;
                } else {
                  if (param2 != this.field_F[var6_int]) {
                    var6_int++;
                    continue L2;
                  } else {
                    var7 = this.field_J[var6_int];
                    if (var7 == -1) {
                      this.field_R.h((byte) -126);
                      break L3;
                    } else {
                      og.b(param1 ^ 120, this.field_J[var6_int]);
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
            stackIn_13_0 = (RuntimeException) (var6);

            stackIn_13_1 = new StringBuilder().append("e.K(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "null";
              break L4;
            } else {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "{...}";
              break L4;
            }
          }
          throw sh.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    static {
        field_O = 500;
        field_I = "Unpacking music";
        field_P = -1;
        field_K = 67;
    }
}
