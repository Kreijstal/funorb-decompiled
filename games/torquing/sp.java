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
        int var3 = 0;
        ((sp) this).field_N = param1;
        if (((sp) this).field_N != null) {
            var3 = pe.field_E.a(((sp) this).field_N, 260, pe.field_E.field_x);
            ((sp) this).a(300, (byte) -25, 150 + var3);
        }
        ((sp) this).field_T = new kf(13, 50, 274, 30, 15, 2113632, 4210752);
        ((sp) this).field_T.field_M = true;
        ((sp) this).field_O = false;
        ((sp) this).field_P = false;
        ((sp) this).a((gm) (Object) ((sp) this).field_T, -6938);
    }

    public static void m(int param0) {
        field_R = null;
        field_Q = null;
        if (param0 == -7361) {
            return;
        }
        field_R = null;
    }

    final void a(boolean param0, int param1, String param2, float param3) {
        int stackIn_4_0 = 0;
        int stackIn_5_0 = 0;
        int stackIn_6_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_7_1 = 0;
        Object stackIn_10_0 = null;
        Object stackIn_11_0 = null;
        Object stackIn_12_0 = null;
        int stackIn_12_1 = 0;
        int stackIn_21_0 = 0;
        int stackIn_22_0 = 0;
        int stackIn_23_0 = 0;
        int stackIn_24_0 = 0;
        int stackIn_24_1 = 0;
        Object stackIn_27_0 = null;
        Object stackIn_28_0 = null;
        Object stackIn_29_0 = null;
        int stackIn_29_1 = 0;
        int stackOut_20_0 = 0;
        int stackOut_19_0 = 0;
        int stackOut_21_0 = 0;
        int stackOut_23_0 = 0;
        int stackOut_23_1 = 0;
        int stackOut_22_0 = 0;
        int stackOut_22_1 = 0;
        Object stackOut_26_0 = null;
        Object stackOut_28_0 = null;
        int stackOut_28_1 = 0;
        Object stackOut_27_0 = null;
        int stackOut_27_1 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_6_1 = 0;
        int stackOut_5_0 = 0;
        int stackOut_5_1 = 0;
        Object stackOut_9_0 = null;
        Object stackOut_11_0 = null;
        int stackOut_11_1 = 0;
        Object stackOut_10_0 = null;
        int stackOut_10_1 = 0;
        if (param1 > 51) {
          L0: {
            if (((sp) this).field_P) {
              stackOut_20_0 = 0;
              stackIn_21_0 = stackOut_20_0;
              break L0;
            } else {
              stackOut_19_0 = 1;
              stackIn_21_0 = stackOut_19_0;
              break L0;
            }
          }
          L1: {
            stackOut_21_0 = stackIn_21_0;
            stackIn_23_0 = stackOut_21_0;
            stackIn_22_0 = stackOut_21_0;
            if (param0) {
              stackOut_23_0 = stackIn_23_0;
              stackOut_23_1 = 0;
              stackIn_24_0 = stackOut_23_0;
              stackIn_24_1 = stackOut_23_1;
              break L1;
            } else {
              stackOut_22_0 = stackIn_22_0;
              stackOut_22_1 = 1;
              stackIn_24_0 = stackOut_22_0;
              stackIn_24_1 = stackOut_22_1;
              break L1;
            }
          }
          if (stackIn_24_0 != stackIn_24_1) {
            L2: {
              stackOut_26_0 = this;
              stackIn_28_0 = stackOut_26_0;
              stackIn_27_0 = stackOut_26_0;
              if (!param0) {
                stackOut_28_0 = this;
                stackOut_28_1 = 0;
                stackIn_29_0 = stackOut_28_0;
                stackIn_29_1 = stackOut_28_1;
                break L2;
              } else {
                stackOut_27_0 = this;
                stackOut_27_1 = 1;
                stackIn_29_0 = stackOut_27_0;
                stackIn_29_1 = stackOut_27_1;
                break L2;
              }
            }
            ((sp) this).field_P = stackIn_29_1 != 0;
            if (!((sp) this).field_P) {
              ((sp) this).field_T.c(4210752, 2113632, (byte) 125);
              if (((sp) this).field_O) {
                ((sp) this).field_T.field_M = false;
                ((sp) this).field_T.field_L = (int)(65536.0f * (param3 / 100.0f));
                ((sp) this).field_S = param2;
                return;
              } else {
                ((sp) this).field_T.field_L = (int)(65536.0f * (param3 / 100.0f));
                ((sp) this).field_S = param2;
                return;
              }
            } else {
              ((sp) this).field_T.c(4210752, 8405024, (byte) 125);
              ((sp) this).field_T.field_M = true;
              ((sp) this).field_T.field_L = (int)(65536.0f * (param3 / 100.0f));
              ((sp) this).field_S = param2;
              return;
            }
          } else {
            ((sp) this).field_T.field_L = (int)(65536.0f * (param3 / 100.0f));
            ((sp) this).field_S = param2;
            return;
          }
        } else {
          L3: {
            ((sp) this).field_S = null;
            if (((sp) this).field_P) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              break L3;
            } else {
              stackOut_2_0 = 1;
              stackIn_4_0 = stackOut_2_0;
              break L3;
            }
          }
          L4: {
            stackOut_4_0 = stackIn_4_0;
            stackIn_6_0 = stackOut_4_0;
            stackIn_5_0 = stackOut_4_0;
            if (param0) {
              stackOut_6_0 = stackIn_6_0;
              stackOut_6_1 = 0;
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              break L4;
            } else {
              stackOut_5_0 = stackIn_5_0;
              stackOut_5_1 = 1;
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              break L4;
            }
          }
          if (stackIn_7_0 != stackIn_7_1) {
            L5: {
              stackOut_9_0 = this;
              stackIn_11_0 = stackOut_9_0;
              stackIn_10_0 = stackOut_9_0;
              if (!param0) {
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
            ((sp) this).field_P = stackIn_12_1 != 0;
            if (!((sp) this).field_P) {
              ((sp) this).field_T.c(4210752, 2113632, (byte) 125);
              if (((sp) this).field_O) {
                ((sp) this).field_T.field_M = false;
                ((sp) this).field_T.field_L = (int)(65536.0f * (param3 / 100.0f));
                ((sp) this).field_S = param2;
                return;
              } else {
                ((sp) this).field_T.field_L = (int)(65536.0f * (param3 / 100.0f));
                ((sp) this).field_S = param2;
                return;
              }
            } else {
              ((sp) this).field_T.c(4210752, 8405024, (byte) 125);
              ((sp) this).field_T.field_M = true;
              ((sp) this).field_T.field_L = (int)(65536.0f * (param3 / 100.0f));
              ((sp) this).field_S = param2;
              return;
            }
          } else {
            ((sp) this).field_T.field_L = (int)(65536.0f * (param3 / 100.0f));
            ((sp) this).field_S = param2;
            return;
          }
        }
    }

    final void b(int param0, int param1, byte param2) {
        if (param2 > -16) {
          return;
        } else {
          L0: {
            super.b(param0, param1, (byte) -75);
            pe.field_E.c(((sp) this).field_S, param1 + (((sp) this).field_p >> -111395007), param0 - -103, 16777215, -1);
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
