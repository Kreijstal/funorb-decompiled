/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ql extends tb {
    private String field_R;
    private boolean field_Q;
    private String field_P;
    private boolean field_S;
    private nc field_T;

    final void k(int param0) {
        this.field_S = true;
        if (param0 != 29960) {
            return;
        }
        this.field_T.field_B = false;
    }

    final void a(boolean param0, float param1, boolean param2, String param3) {
        RuntimeException var5 = null;
        Object stackIn_5_0 = null;
        Object stackIn_6_0 = null;
        Object stackIn_7_0 = null;
        int stackIn_7_1 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_4_0 = null;
        Object stackOut_6_0 = null;
        int stackOut_6_1 = 0;
        Object stackOut_5_0 = null;
        int stackOut_5_1 = 0;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        try {
          L0: {
            L1: {
              if (param2) {
                break L1;
              } else {
                this.field_S = true;
                break L1;
              }
            }
            if (this.field_Q != param0) {
              L2: {
                stackOut_4_0 = this;
                stackIn_6_0 = stackOut_4_0;
                stackIn_5_0 = stackOut_4_0;
                if (!param0) {
                  stackOut_6_0 = this;
                  stackOut_6_1 = 0;
                  stackIn_7_0 = stackOut_6_0;
                  stackIn_7_1 = stackOut_6_1;
                  break L2;
                } else {
                  stackOut_5_0 = this;
                  stackOut_5_1 = 1;
                  stackIn_7_0 = stackOut_5_0;
                  stackIn_7_1 = stackOut_5_1;
                  break L2;
                }
              }
              L3: {
                ((ql) (this)).field_Q = stackIn_7_1 != 0;
                if (!this.field_Q) {
                  this.field_T.c(65280, 4210752, 2113632);
                  if (this.field_S) {
                    this.field_T.field_B = false;
                    break L3;
                  } else {
                    break L3;
                  }
                } else {
                  this.field_T.c(65280, 4210752, 8405024);
                  this.field_T.field_B = true;
                  break L3;
                }
              }
              this.field_P = param3;
              this.field_T.field_K = (int)(param1 / 100.0f * 65536.0f);
              break L0;
            } else {
              this.field_P = param3;
              this.field_T.field_K = (int)(param1 / 100.0f * 65536.0f);
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var5 = decompiledCaughtException;
            stackOut_14_0 = (RuntimeException) (var5);
            stackOut_14_1 = new StringBuilder().append("ql.I(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_16_0 = stackOut_14_0;
            stackIn_16_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param3 == null) {
              stackOut_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackOut_16_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L4;
            } else {
              stackOut_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackOut_15_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackOut_15_2 = "{...}";
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              stackIn_17_2 = stackOut_15_2;
              break L4;
            }
          }
          throw ma.a((Throwable) ((Object) stackIn_17_0), stackIn_17_2 + ')');
        }
    }

    final void b(int param0, int param1, int param2) {
        int discarded$0 = 0;
        super.b(param0, param1, param2);
        s.field_c.c(this.field_P, param2 + (this.field_p >> -645937727), param1 - -103, 16777215, -1);
        if (this.field_R != null) {
            ti.g(20 + param2, -7 + param1 - -120, 260, 8421504);
            discarded$0 = s.field_c.a(this.field_R, 20 + param2, 120 + (param1 + 8), 260, 100, 16777215, -1, 1, 0, s.field_c.field_N);
        }
    }

    ql(ei param0, String param1) {
        super(param0, 300, 120);
        int var3_int = 0;
        try {
            this.field_R = param1;
            if (this.field_R != null) {
                var3_int = s.field_c.b(this.field_R, 260, s.field_c.field_N);
                this.a(300, (byte) -107, var3_int + 150);
            }
            this.field_T = new nc(13, 50, 274, 30, 15, 2113632, 4210752);
            this.field_Q = false;
            this.field_S = false;
            this.field_T.field_B = true;
            this.b(4, this.field_T);
        } catch (RuntimeException runtimeException) {
            throw ma.a((Throwable) ((Object) runtimeException), "ql.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    static {
    }
}
