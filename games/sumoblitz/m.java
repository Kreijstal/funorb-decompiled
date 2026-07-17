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

    final static void a(String param0, String param1) {
        try {
            lr.a(false, param0, (byte) 127, param1);
        } catch (RuntimeException runtimeException) {
            throw qo.a((Throwable) (Object) runtimeException, "m.C(" + (param0 != null ? "{...}" : "null") + 44 + (param1 != null ? "{...}" : "null") + 44 + -1807 + 41);
        }
    }

    final void b(int param0, int param1, int param2) {
        if (param0 <= 110) {
          L0: {
            field_V = null;
            super.b(112, param1, param2);
            tq.field_a.a(((m) this).field_W, param1 - -(((m) this).field_q >> 1), param2 - -103, 16777215, -1);
            if (null != ((m) this).field_U) {
              lk.f(20 + param1, param2 + 113, 260, 8421504);
              int discarded$2 = tq.field_a.a(((m) this).field_U, param1 + 20, 128 + param2, 260, 100, 16777215, -1, 1, 0, tq.field_a.field_s);
              break L0;
            } else {
              break L0;
            }
          }
          return;
        } else {
          L1: {
            super.b(112, param1, param2);
            tq.field_a.a(((m) this).field_W, param1 - -(((m) this).field_q >> 1), param2 - -103, 16777215, -1);
            if (null != ((m) this).field_U) {
              lk.f(20 + param1, param2 + 113, 260, 8421504);
              int discarded$3 = tq.field_a.a(((m) this).field_U, param1 + 20, 128 + param2, 260, 100, 16777215, -1, 1, 0, tq.field_a.field_s);
              break L1;
            } else {
              break L1;
            }
          }
          return;
        }
    }

    public static void e() {
        field_T = null;
        field_O = null;
        field_V = null;
        field_R = null;
        field_X = null;
    }

    final void k(int param0) {
        ((m) this).field_S = true;
        int var2 = -98 % ((param0 - 11) / 47);
        ((m) this).field_Q.field_J = false;
    }

    m(dg param0, String param1) {
        super(param0, 300, 120);
        int var3_int = 0;
        try {
            ((m) this).field_U = param1;
            if (((m) this).field_U != null) {
                var3_int = tq.field_a.a(((m) this).field_U, 260, tq.field_a.field_s);
                ((m) this).c(300, var3_int + 150, 58);
            }
            ((m) this).field_Q = new pq(13, 50, 274, 30, 15, 2113632, 4210752);
            ((m) this).field_S = false;
            ((m) this).field_Q.field_J = true;
            ((m) this).field_P = false;
            ((m) this).a((pk) (Object) ((m) this).field_Q, 124);
        } catch (RuntimeException runtimeException) {
            throw qo.a((Throwable) (Object) runtimeException, "m.<init>(" + (param0 != null ? "{...}" : "null") + 44 + (param1 != null ? "{...}" : "null") + 41);
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
                field_T = null;
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
              if (((m) this).field_P) {
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
                ((m) this).field_P = stackIn_12_1 != 0;
                if (((m) this).field_P) {
                  ((m) this).field_Q.b(8405024, 4210752, 108);
                  ((m) this).field_Q.field_J = true;
                  break L4;
                } else {
                  ((m) this).field_Q.b(2113632, 4210752, 99);
                  if (((m) this).field_S) {
                    ((m) this).field_Q.field_J = false;
                    break L4;
                  } else {
                    ((m) this).field_Q.field_I = (int)(65536.0f * (param1 / 100.0f));
                    ((m) this).field_W = param2;
                    return;
                  }
                }
              }
            }
            ((m) this).field_Q.field_I = (int)(65536.0f * (param1 / 100.0f));
            ((m) this).field_W = param2;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var5 = decompiledCaughtException;
            stackOut_19_0 = (RuntimeException) var5;
            stackOut_19_1 = new StringBuilder().append("m.E(").append(param0).append(44).append(param1).append(44);
            stackIn_21_0 = stackOut_19_0;
            stackIn_21_1 = stackOut_19_1;
            stackIn_20_0 = stackOut_19_0;
            stackIn_20_1 = stackOut_19_1;
            if (param2 == null) {
              stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "null";
              stackIn_22_0 = stackOut_21_0;
              stackIn_22_1 = stackOut_21_1;
              stackIn_22_2 = stackOut_21_2;
              break L6;
            } else {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "{...}";
              stackIn_22_0 = stackOut_20_0;
              stackIn_22_1 = stackOut_20_1;
              stackIn_22_2 = stackOut_20_2;
              break L6;
            }
          }
          throw qo.a((Throwable) (Object) stackIn_22_0, stackIn_22_2 + 44 + param3 + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_X = new iw(3);
        field_T = "Names cannot start or end with space or underscore";
        field_V = "Waiting for graphics";
    }
}
