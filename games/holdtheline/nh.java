/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nh extends v implements pi {
    private qi field_I;
    private rm[] field_G;
    static String field_K;
    private int[] field_J;
    static String field_H;
    private String field_M;
    private int field_L;
    private ab field_F;

    public static void a(byte param0) {
        if (param0 != 25) {
            field_H = (String) null;
            field_K = null;
            field_H = null;
            return;
        }
        field_K = null;
        field_H = null;
    }

    public final void a(int param0, rm param1, int param2, int param3, int param4) {
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        var8 = HoldTheLine.field_D;
        try {
          L0: {
            var6_int = 0;
            L1: while (true) {
              L2: {
                if (this.field_L <= var6_int) {
                  break L2;
                } else {
                  if (this.field_G[var6_int] == param1) {
                    var7 = this.field_J[var6_int];
                    if (-1 == var7) {
                      this.field_F.h((byte) -115);
                      break L2;
                    } else {
                      go.a(0, this.field_J[var6_int]);
                      break L2;
                    }
                  } else {
                    var6_int++;
                    continue L1;
                  }
                }
              }
              if (param2 == -4) {
                break L0;
              } else {
                nh.a((byte) -38);
                return;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var6 = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) (var6);
            stackOut_12_1 = new StringBuilder().append("nh.M(").append(param0).append(',');
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param1 == null) {
              stackOut_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackOut_14_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L3;
            } else {
              stackOut_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackOut_13_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L3;
            }
          }
          throw kk.a((Throwable) ((Object) stackIn_15_0), stackIn_15_2 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final rm a(int param0, tb param1, String param2) {
        rm var4 = null;
        RuntimeException var4_ref = null;
        int var5 = 0;
        rm var6 = null;
        rm stackIn_3_0 = null;
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
        RuntimeException decompiledCaughtException = null;
        rm stackOut_2_0 = null;
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
        try {
          L0: {
            L1: {
              var4 = new rm(param2, param1);
              var4.field_l = (dh) ((Object) new mo());
              var5 = -2 + this.field_u;
              this.a(0, (byte) 122, 0, 34 + this.field_u, this.field_x);
              var4.a(7, (byte) 122, var5, 30, -14 + this.field_x);
              if (param0 >= 43) {
                break L1;
              } else {
                var6 = (rm) null;
                this.a(-64, (rm) null, 28, 127, 42);
                break L1;
              }
            }
            this.a(true, var4);
            stackOut_2_0 = (rm) (var4);
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4_ref = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) (var4_ref);
            stackOut_4_1 = new StringBuilder().append("nh.G(").append(param0).append(',');
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
          throw kk.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ')');
        }
        return stackIn_3_0;
    }

    nh(ab param0, qi param1, String param2) {
        super(0, 0, 288, 0, (dh) null);
        int var4_int = 0;
        this.field_L = 0;
        try {
            this.field_I = param1;
            this.field_F = param0;
            this.field_M = param2;
            var4_int = this.field_M == null ? 0 : this.field_I.b(this.field_M, 260, this.field_I.field_G);
            this.a(0, (byte) 122, 0, 22 - -var4_int, 288);
        } catch (RuntimeException runtimeException) {
            throw kk.a((Throwable) ((Object) runtimeException), "nh.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final static void h(int param0) {
        ol.field_f = param0;
        va.field_k = false;
        a.field_I = -1;
    }

    private final void a(int param0, byte param1) {
        rm[] var3 = null;
        int[] var4 = null;
        int var5 = 0;
        int var6 = 0;
        rm[] var7 = null;
        var6 = HoldTheLine.field_D;
        if (this.field_L >= param0) {
          return;
        } else {
          var7 = new rm[param0];
          var3 = var7;
          var4 = new int[param0];
          var5 = 0;
          L0: while (true) {
            if (this.field_L <= var5) {
              this.field_L = param0;
              this.field_J = var4;
              if (param1 <= 125) {
                return;
              } else {
                this.field_G = var3;
                return;
              }
            } else {
              var7[var5] = this.field_G[var5];
              var4[var5] = this.field_J[var5];
              var5++;
              continue L0;
            }
          }
        }
    }

    final void a(int param0, int param1, int param2, int param3) {
        super.a(param0, param1, param2, param3);
        int discarded$0 = this.field_I.a(this.field_M, 14 + (this.field_k + param2), 10 + (this.field_o + param1), this.field_x + -28, this.field_u, 16777215, -1, 0, 0, this.field_I.field_G);
    }

    final void a(int param0, String param1, byte param2) {
        int var4_int = 0;
        try {
            var4_int = this.field_L;
            this.a(var4_int - -1, (byte) 127);
            this.field_G[var4_int] = this.a(76, (tb) (this), param1);
            if (param2 <= 52) {
                this.field_G = (rm[]) null;
            }
            this.field_J[var4_int] = param0;
        } catch (RuntimeException runtimeException) {
            throw kk.a((Throwable) ((Object) runtimeException), "nh.B(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    static {
        field_K = "Achievements";
        field_H = "Account created successfully!";
    }
}
