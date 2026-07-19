/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ul extends nf {
    private boolean field_S;
    private boolean field_R;
    private String field_P;
    private jh field_Q;
    private String field_T;
    static int[] field_O;

    final void c(boolean param0) {
        this.field_S = param0 ? true : false;
        this.field_Q.field_G = false;
    }

    final void a(boolean param0, String param1, int param2, float param3) {
        RuntimeException var5 = null;
        String var6 = null;
        int stackIn_3_0 = 0;
        Object stackIn_6_0 = null;
        Object stackIn_7_0 = null;
        Object stackIn_8_0 = null;
        int stackIn_8_1 = 0;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_2_0 = 0;
        int stackOut_1_0 = 0;
        Object stackOut_5_0 = null;
        Object stackOut_7_0 = null;
        int stackOut_7_1 = 0;
        Object stackOut_6_0 = null;
        int stackOut_6_1 = 0;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        try {
          L0: {
            L1: {
              if (param0) {
                stackOut_2_0 = 0;
                stackIn_3_0 = stackOut_2_0;
                break L1;
              } else {
                stackOut_1_0 = 1;
                stackIn_3_0 = stackOut_1_0;
                break L1;
              }
            }
            L2: {
              if (stackIn_3_0 == (this.field_R ? 1 : 0)) {
                L3: {
                  stackOut_5_0 = this;
                  stackIn_7_0 = stackOut_5_0;
                  stackIn_6_0 = stackOut_5_0;
                  if (!param0) {
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
                ((ul) (this)).field_R = stackIn_8_1 != 0;
                if (this.field_R) {
                  this.field_Q.a((byte) -115, 8405024, 4210752);
                  this.field_Q.field_G = true;
                  break L2;
                } else {
                  this.field_Q.a((byte) -115, 2113632, 4210752);
                  if (!this.field_S) {
                    break L2;
                  } else {
                    this.field_Q.field_G = false;
                    if (!MonkeyPuzzle2.field_F) {
                      break L2;
                    } else {
                      this.field_Q.a((byte) -115, 8405024, 4210752);
                      this.field_Q.field_G = true;
                      break L2;
                    }
                  }
                }
              } else {
                break L2;
              }
            }
            L4: {
              if (param2 == 4210752) {
                break L4;
              } else {
                var6 = (String) null;
                this.a(true, (String) null, 19, -0.34645962715148926f);
                break L4;
              }
            }
            this.field_Q.field_D = (int)(param3 / 100.0f * 65536.0f);
            this.field_T = param1;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var5 = decompiledCaughtException;
            stackOut_18_0 = (RuntimeException) (var5);
            stackOut_18_1 = new StringBuilder().append("ul.D(").append(param0).append(',');
            stackIn_20_0 = stackOut_18_0;
            stackIn_20_1 = stackOut_18_1;
            stackIn_19_0 = stackOut_18_0;
            stackIn_19_1 = stackOut_18_1;
            if (param1 == null) {
              stackOut_20_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackOut_20_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackOut_20_2 = "null";
              stackIn_21_0 = stackOut_20_0;
              stackIn_21_1 = stackOut_20_1;
              stackIn_21_2 = stackOut_20_2;
              break L5;
            } else {
              stackOut_19_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackOut_19_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackOut_19_2 = "{...}";
              stackIn_21_0 = stackOut_19_0;
              stackIn_21_1 = stackOut_19_1;
              stackIn_21_2 = stackOut_19_2;
              break L5;
            }
          }
          throw la.a((Throwable) ((Object) stackIn_21_0), stackIn_21_2 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final void a(boolean param0, int param1, int param2) {
        int discarded$34 = 0;
        super.a(param0, param1, param2);
        pj.field_c.a(this.field_T, param1 - -(this.field_l >> -1036633151), param2 + 103, 16777215, -1);
        if (null == this.field_P) {
          if (param0) {
            this.field_R = true;
            return;
          } else {
            return;
          }
        } else {
          ge.a(20 + param1, 113 + param2, 260, 8421504);
          discarded$34 = pj.field_c.a(this.field_P, param1 - -20, 120 + (param2 + 8), 260, 100, 16777215, -1, 1, 0, pj.field_c.field_C);
          if (!param0) {
            return;
          } else {
            this.field_R = true;
            return;
          }
        }
    }

    public static void q(int param0) {
        if (param0 >= -34) {
            return;
        }
        field_O = null;
    }

    ul(kj param0, String param1) {
        super(param0, 300, 120);
        int var3_int = 0;
        try {
            this.field_P = param1;
            if (this.field_P != null) {
                var3_int = pj.field_c.a(this.field_P, 260, pj.field_c.field_C);
                this.a(150 - -var3_int, (byte) 110, 300);
            }
            this.field_Q = new jh(13, 50, 274, 30, 15, 2113632, 4210752);
            this.field_R = false;
            this.field_S = false;
            this.field_Q.field_G = true;
            this.b((byte) -28, this.field_Q);
        } catch (RuntimeException runtimeException) {
            throw la.a((Throwable) ((Object) runtimeException), "ul.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_O = new int[20];
    }
}
