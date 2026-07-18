/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sp extends im {
    static uc field_R;
    static uc field_Q;
    private kf field_T;
    private String field_S;
    private boolean field_O;
    private boolean field_P;
    private String field_N;

    final void h(byte param0) {
        ((sp) this).field_T.field_M = false;
        ((sp) this).field_O = true;
        if (param0 >= 59) {
            return;
        }
        ((sp) this).h((byte) -28);
    }

    sp(ln param0, String param1) {
        super(param0, 300, 120);
        int var3_int = 0;
        try {
            ((sp) this).field_N = param1;
            if (((sp) this).field_N != null) {
                var3_int = pe.field_E.a(((sp) this).field_N, 260, pe.field_E.field_x);
                ((sp) this).a(300, (byte) -25, 150 + var3_int);
            }
            ((sp) this).field_T = new kf(13, 50, 274, 30, 15, 2113632, 4210752);
            ((sp) this).field_T.field_M = true;
            ((sp) this).field_O = false;
            ((sp) this).field_P = false;
            ((sp) this).a((gm) (Object) ((sp) this).field_T, -6938);
        } catch (RuntimeException runtimeException) {
            throw rb.a((Throwable) (Object) runtimeException, "sp.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public static void m(int param0) {
        field_R = null;
        field_Q = null;
    }

    final void a(boolean param0, int param1, String param2, float param3) {
        RuntimeException var5 = null;
        int stackIn_5_0 = 0;
        int stackIn_6_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_8_0 = 0;
        int stackIn_8_1 = 0;
        Object stackIn_11_0 = null;
        Object stackIn_12_0 = null;
        Object stackIn_13_0 = null;
        int stackIn_13_1 = 0;
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
        Object stackOut_10_0 = null;
        Object stackOut_12_0 = null;
        int stackOut_12_1 = 0;
        Object stackOut_11_0 = null;
        int stackOut_11_1 = 0;
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
              if (param1 > 51) {
                break L1;
              } else {
                ((sp) this).field_S = null;
                break L1;
              }
            }
            L2: {
              if (((sp) this).field_P) {
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
              if (param0) {
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
            if (stackIn_8_0 != stackIn_8_1) {
              L4: {
                stackOut_10_0 = this;
                stackIn_12_0 = stackOut_10_0;
                stackIn_11_0 = stackOut_10_0;
                if (!param0) {
                  stackOut_12_0 = this;
                  stackOut_12_1 = 0;
                  stackIn_13_0 = stackOut_12_0;
                  stackIn_13_1 = stackOut_12_1;
                  break L4;
                } else {
                  stackOut_11_0 = this;
                  stackOut_11_1 = 1;
                  stackIn_13_0 = stackOut_11_0;
                  stackIn_13_1 = stackOut_11_1;
                  break L4;
                }
              }
              L5: {
                ((sp) this).field_P = stackIn_13_1 != 0;
                if (((sp) this).field_P) {
                  ((sp) this).field_T.c(4210752, 8405024, (byte) 125);
                  ((sp) this).field_T.field_M = true;
                  break L5;
                } else {
                  ((sp) this).field_T.c(4210752, 2113632, (byte) 125);
                  if (!((sp) this).field_O) {
                    break L5;
                  } else {
                    ((sp) this).field_T.field_M = false;
                    break L5;
                  }
                }
              }
              ((sp) this).field_T.field_L = (int)(65536.0f * (param3 / 100.0f));
              ((sp) this).field_S = param2;
              break L0;
            } else {
              ((sp) this).field_T.field_L = (int)(65536.0f * (param3 / 100.0f));
              ((sp) this).field_S = param2;
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var5 = decompiledCaughtException;
            stackOut_19_0 = (RuntimeException) var5;
            stackOut_19_1 = new StringBuilder().append("sp.E(").append(param0).append(',').append(param1).append(',');
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
          throw rb.a((Throwable) (Object) stackIn_22_0, stackIn_22_2 + ',' + param3 + ')');
        }
    }

    final void b(int param0, int param1, byte param2) {
        if (param2 > -16) {
          return;
        } else {
          L0: {
            super.b(param0, param1, (byte) -75);
            pe.field_E.c(((sp) this).field_S, param1 + (((sp) this).field_p >> 1), param0 - -103, 16777215, -1);
            if (null != ((sp) this).field_N) {
              ph.b(20 + param1, -7 + (param0 + 120), 260, 8421504);
              int discarded$1 = pe.field_E.a(((sp) this).field_N, 20 + param1, 8 + param0 - -120, 260, 100, 16777215, -1, 1, 0, pe.field_E.field_x);
              break L0;
            } else {
              break L0;
            }
          }
          return;
        }
    }

    final static String a(String param0, String param1, String param2, byte param3) {
        int var4 = 0;
        int var5 = 0;
        var5 = Torquing.field_u;
        var4 = param0.indexOf(param1);
        if (param3 < -64) {
          L0: while (true) {
            if (var4 == -1) {
              return param0;
            } else {
              param0 = param0.substring(0, var4) + param2 + param0.substring(var4 + param1.length());
              var4 = param0.indexOf(param1, var4 + param2.length());
              continue L0;
            }
          }
        } else {
          return null;
        }
    }

    static {
    }
}
