/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class m extends hf {
    static iw field_X;
    private String field_W;
    private String field_U;
    private boolean field_P;
    private pq field_Q;
    static ov field_R;
    static String field_V;
    static String field_T;
    private boolean field_S;
    static gj[] field_O;

    final static void a(String param0, String param1, int param2) {
        if (param2 != -1807) {
            return;
        }
        try {
            lr.a(false, param0, (byte) 127, param1);
        } catch (RuntimeException runtimeException) {
            throw qo.a((Throwable) ((Object) runtimeException), "m.C(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    final void b(int param0, int param1, int param2) {
        int discarded$2 = 0;
        int discarded$3 = 0;
        if (param0 <= 110) {
          L0: {
            field_V = (String) null;
            super.b(112, param1, param2);
            tq.field_a.a(this.field_W, param1 - -(this.field_q >> -1039912223), param2 - -103, 16777215, -1);
            if (null != this.field_U) {
              lk.f(20 + param1, param2 - -120 + -7, 260, 8421504);
              discarded$2 = tq.field_a.a(this.field_U, param1 + 20, 128 + param2, 260, 100, 16777215, -1, 1, 0, tq.field_a.field_s);
              break L0;
            } else {
              break L0;
            }
          }
          return;
        } else {
          L1: {
            super.b(112, param1, param2);
            tq.field_a.a(this.field_W, param1 - -(this.field_q >> -1039912223), param2 - -103, 16777215, -1);
            if (null != this.field_U) {
              lk.f(20 + param1, param2 - -120 + -7, 260, 8421504);
              discarded$3 = tq.field_a.a(this.field_U, param1 + 20, 128 + param2, 260, 100, 16777215, -1, 1, 0, tq.field_a.field_s);
              break L1;
            } else {
              break L1;
            }
          }
          return;
        }
    }

    public static void e(boolean param0) {
        field_T = null;
        field_O = null;
        if (!param0) {
          field_T = (String) null;
          field_V = null;
          field_R = null;
          field_X = null;
          return;
        } else {
          field_V = null;
          field_R = null;
          field_X = null;
          return;
        }
    }

    final void k(int param0) {
        this.field_S = true;
        int var2 = -98 % ((param0 - 11) / 47);
        this.field_Q.field_J = false;
    }

    m(dg param0, String param1) {
        super(param0, 300, 120);
        int var3_int = 0;
        try {
            this.field_U = param1;
            if (this.field_U != null) {
                var3_int = tq.field_a.a(this.field_U, 260, tq.field_a.field_s);
                this.c(300, var3_int + 150, 58);
            }
            this.field_Q = new pq(13, 50, 274, 30, 15, 2113632, 4210752);
            this.field_S = false;
            this.field_Q.field_J = true;
            this.field_P = false;
            this.a(this.field_Q, 124);
        } catch (RuntimeException runtimeException) {
            throw qo.a((Throwable) ((Object) runtimeException), "m.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(boolean param0, float param1, String param2, boolean param3) {
        RuntimeException var5 = null;
        int stackIn_5_0 = 0;
        int stackIn_6_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_8_0 = 0;
        int stackIn_8_1 = 0;
        Object stackIn_10_0 = null;
        Object stackIn_11_0 = null;
        Object stackIn_12_0 = null;
        int stackIn_12_1 = 0;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_4_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_7_1 = 0;
        int stackOut_6_0 = 0;
        int stackOut_6_1 = 0;
        Object stackOut_9_0 = null;
        Object stackOut_11_0 = null;
        int stackOut_11_1 = 0;
        Object stackOut_10_0 = null;
        int stackOut_10_1 = 0;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        try {
          L0: {
            L1: {
              if (!param0) {
                break L1;
              } else {
                field_T = (String) null;
                break L1;
              }
            }
            L2: {
              if (param3) {
                stackOut_4_0 = 0;
                stackIn_5_0 = stackOut_4_0;
                break L2;
              } else {
                stackOut_3_0 = 1;
                stackIn_5_0 = stackOut_3_0;
                break L2;
              }
            }
            L3: {
              stackOut_5_0 = stackIn_5_0;
              stackIn_7_0 = stackOut_5_0;
              stackIn_6_0 = stackOut_5_0;
              if (this.field_P) {
                stackOut_7_0 = stackIn_7_0;
                stackOut_7_1 = 0;
                stackIn_8_0 = stackOut_7_0;
                stackIn_8_1 = stackOut_7_1;
                break L3;
              } else {
                stackOut_6_0 = stackIn_6_0;
                stackOut_6_1 = 1;
                stackIn_8_0 = stackOut_6_0;
                stackIn_8_1 = stackOut_6_1;
                break L3;
              }
            }
            L4: {
              if (stackIn_8_0 == stackIn_8_1) {
                break L4;
              } else {
                L5: {
                  stackOut_9_0 = this;
                  stackIn_11_0 = stackOut_9_0;
                  stackIn_10_0 = stackOut_9_0;
                  if (!param3) {
                    stackOut_11_0 = this;
                    stackOut_11_1 = 0;
                    stackIn_12_0 = stackOut_11_0;
                    stackIn_12_1 = stackOut_11_1;
                    break L5;
                  } else {
                    stackOut_10_0 = this;
                    stackOut_10_1 = 1;
                    stackIn_12_0 = stackOut_10_0;
                    stackIn_12_1 = stackOut_10_1;
                    break L5;
                  }
                }
                L6: {
                  ((m) (this)).field_P = stackIn_12_1 != 0;
                  if (this.field_P) {
                    break L6;
                  } else {
                    this.field_Q.b(2113632, 4210752, 99);
                    if (this.field_S) {
                      this.field_Q.field_J = false;
                      if (!Sumoblitz.field_L) {
                        break L4;
                      } else {
                        break L6;
                      }
                    } else {
                      this.field_Q.field_I = (int)(65536.0f * (param1 / 100.0f));
                      this.field_W = param2;
                      return;
                    }
                  }
                }
                this.field_Q.b(8405024, 4210752, 108);
                this.field_Q.field_J = true;
                break L4;
              }
            }
            this.field_Q.field_I = (int)(65536.0f * (param1 / 100.0f));
            this.field_W = param2;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var5 = decompiledCaughtException;
            stackOut_19_0 = (RuntimeException) (var5);
            stackOut_19_1 = new StringBuilder().append("m.E(").append(param0).append(',').append(param1).append(',');
            stackIn_21_0 = stackOut_19_0;
            stackIn_21_1 = stackOut_19_1;
            stackIn_20_0 = stackOut_19_0;
            stackIn_20_1 = stackOut_19_1;
            if (param2 == null) {
              stackOut_21_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackOut_21_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackOut_21_2 = "null";
              stackIn_22_0 = stackOut_21_0;
              stackIn_22_1 = stackOut_21_1;
              stackIn_22_2 = stackOut_21_2;
              break L7;
            } else {
              stackOut_20_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackOut_20_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackOut_20_2 = "{...}";
              stackIn_22_0 = stackOut_20_0;
              stackIn_22_1 = stackOut_20_1;
              stackIn_22_2 = stackOut_20_2;
              break L7;
            }
          }
          throw qo.a((Throwable) ((Object) stackIn_22_0), stackIn_22_2 + ',' + param3 + ')');
        }
    }

    static {
        field_X = new iw(3);
        field_T = "Names cannot start or end with space or underscore";
        field_V = "Waiting for graphics";
    }
}
