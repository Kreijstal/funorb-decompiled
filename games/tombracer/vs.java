/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vs extends ofa {
    private boolean field_Q;
    static float field_O;
    private boolean field_N;
    static iw field_T;
    private String field_M;
    private rk field_L;
    static jea field_R;
    private String field_S;
    static int[] field_P;

    final void f(int param0) {
        this.field_L.field_D = false;
        if (param0 != 12936) {
            vs.i((byte) 50);
            this.field_Q = true;
            return;
        }
        this.field_Q = true;
    }

    public static void i(byte param0) {
        field_R = null;
        field_T = null;
        if (param0 != -77) {
            vs.i((byte) -111);
            field_P = null;
            return;
        }
        field_P = null;
    }

    final void a(float param0, String param1, boolean param2, byte param3) {
        RuntimeException runtimeException = null;
        boolean stackIn_1_0 = false;
        boolean stackIn_2_0 = false;
        boolean stackIn_3_0 = false;
        int stackIn_3_1 = 0;
        Object stackIn_6_0 = null;
        Object stackIn_7_0 = null;
        Object stackIn_8_0 = null;
        int stackIn_8_1 = 0;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_0_0 = false;
        boolean stackOut_2_0 = false;
        int stackOut_2_1 = 0;
        boolean stackOut_1_0 = false;
        int stackOut_1_1 = 0;
        Object stackOut_5_0 = null;
        Object stackOut_7_0 = null;
        int stackOut_7_1 = 0;
        Object stackOut_6_0 = null;
        int stackOut_6_1 = 0;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        try {
          L0: {
            L1: {
              stackOut_0_0 = param2;
              stackIn_2_0 = stackOut_0_0;
              stackIn_1_0 = stackOut_0_0;
              if (this.field_N) {
                stackOut_2_0 = stackIn_2_0;
                stackOut_2_1 = 0;
                stackIn_3_0 = stackOut_2_0;
                stackIn_3_1 = stackOut_2_1;
                break L1;
              } else {
                stackOut_1_0 = stackIn_1_0;
                stackOut_1_1 = 1;
                stackIn_3_0 = stackOut_1_0;
                stackIn_3_1 = stackOut_1_1;
                break L1;
              }
            }
            L2: {
              if ((stackIn_3_0 ? 1 : 0) == stackIn_3_1) {
                L3: {
                  stackOut_5_0 = this;
                  stackIn_7_0 = stackOut_5_0;
                  stackIn_6_0 = stackOut_5_0;
                  if (!param2) {
                    stackOut_7_0 = this;
                    stackOut_7_1 = 0;
                    stackIn_8_0 = stackOut_7_0;
                    stackIn_8_1 = stackOut_7_1;
                    break L3;
                  } else {
                    stackOut_6_0 = this;
                    stackOut_6_1 = 1;
                    stackIn_8_0 = stackOut_6_0;
                    stackIn_8_1 = stackOut_6_1;
                    break L3;
                  }
                }
                L4: {
                  ((vs) (this)).field_N = stackIn_8_1 != 0;
                  if (!this.field_N) {
                    break L4;
                  } else {
                    this.field_L.a(true, 4210752, 8405024);
                    this.field_L.field_D = true;
                    if (!TombRacer.field_G) {
                      break L2;
                    } else {
                      break L4;
                    }
                  }
                }
                this.field_L.a(true, 4210752, 2113632);
                if (!this.field_Q) {
                  break L2;
                } else {
                  this.field_L.field_D = false;
                  break L2;
                }
              } else {
                break L2;
              }
            }
            L5: {
              this.field_L.field_B = (int)(param0 / 100.0f * 65536.0f);
              if (param3 == 110) {
                break L5;
              } else {
                this.field_Q = true;
                break L5;
              }
            }
            this.field_S = param1;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            runtimeException = decompiledCaughtException;
            stackOut_17_0 = (RuntimeException) (runtimeException);
            stackOut_17_1 = new StringBuilder().append("vs.E(").append(param0).append(',');
            stackIn_19_0 = stackOut_17_0;
            stackIn_19_1 = stackOut_17_1;
            stackIn_18_0 = stackOut_17_0;
            stackIn_18_1 = stackOut_17_1;
            if (param1 == null) {
              stackOut_19_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackOut_19_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackOut_19_2 = "null";
              stackIn_20_0 = stackOut_19_0;
              stackIn_20_1 = stackOut_19_1;
              stackIn_20_2 = stackOut_19_2;
              break L6;
            } else {
              stackOut_18_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackOut_18_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackOut_18_2 = "{...}";
              stackIn_20_0 = stackOut_18_0;
              stackIn_20_1 = stackOut_18_1;
              stackIn_20_2 = stackOut_18_2;
              break L6;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_20_0), stackIn_20_2 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final void a(int param0, byte param1, int param2) {
        int discarded$0 = 0;
        super.a(param0, param1, param2);
        ft.field_c.a(this.field_S, param2 + (this.field_m >> 87503585), param0 + 103, 16777215, -1);
        if (!(null == this.field_M)) {
            bea.c(20 + param2, param0 - -120 + -7, 260, 8421504);
            discarded$0 = ft.field_c.a(this.field_M, param2 + 20, 120 + param0 - -8, 260, 100, 16777215, -1, 1, 0, ft.field_c.field_w);
        }
    }

    vs(jta param0, String param1) {
        super(param0, 300, 120);
        int var3_int = 0;
        try {
            this.field_M = param1;
            if (null != this.field_M) {
                var3_int = ft.field_c.a(this.field_M, 260, ft.field_c.field_w);
                this.c(-11560, var3_int + 150, 300);
            }
            this.field_L = new rk(13, 50, 274, 30, 15, 2113632, 4210752);
            this.field_Q = false;
            this.field_N = false;
            this.field_L.field_D = true;
            this.a(this.field_L, -1);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "vs.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_T = new iw();
        field_P = new int[12];
    }
}
