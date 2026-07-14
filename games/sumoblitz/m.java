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
        lr.a(false, param0, (byte) 127, param1);
    }

    final void b(int param0, int param1, int param2) {
        if (param0 <= 110) {
          L0: {
            field_V = null;
            super.b(112, param1, param2);
            tq.field_a.a(((m) this).field_W, param1 - -(((m) this).field_q >> -1039912223), param2 - -103, 16777215, -1);
            if (null != ((m) this).field_U) {
              lk.f(20 + param1, param2 - -120 + -7, 260, 8421504);
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
            tq.field_a.a(((m) this).field_W, param1 - -(((m) this).field_q >> -1039912223), param2 - -103, 16777215, -1);
            if (null != ((m) this).field_U) {
              lk.f(20 + param1, param2 - -120 + -7, 260, 8421504);
              int discarded$3 = tq.field_a.a(((m) this).field_U, param1 + 20, 128 + param2, 260, 100, 16777215, -1, 1, 0, tq.field_a.field_s);
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
          field_T = null;
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
        ((m) this).field_S = true;
        int var2 = -98 % ((param0 - 11) / 47);
        ((m) this).field_Q.field_J = false;
    }

    m(dg param0, String param1) {
        super(param0, 300, 120);
        int var3 = 0;
        ((m) this).field_U = param1;
        if (((m) this).field_U != null) {
            var3 = tq.field_a.a(((m) this).field_U, 260, tq.field_a.field_s);
            ((m) this).c(300, var3 + 150, 58);
        }
        ((m) this).field_Q = new pq(13, 50, 274, 30, 15, 2113632, 4210752);
        ((m) this).field_S = false;
        ((m) this).field_Q.field_J = true;
        ((m) this).field_P = false;
        ((m) this).a((pk) (Object) ((m) this).field_Q, 124);
    }

    final void a(boolean param0, float param1, String param2, boolean param3) {
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
        if (!param0) {
          L0: {
            if (param3) {
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
            if (((m) this).field_P) {
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
              if (!param3) {
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
            ((m) this).field_P = stackIn_29_1 != 0;
            if (!((m) this).field_P) {
              ((m) this).field_Q.b(2113632, 4210752, 99);
              if (!((m) this).field_S) {
                ((m) this).field_Q.field_I = (int)(65536.0f * (param1 / 100.0f));
                ((m) this).field_W = param2;
                return;
              } else {
                ((m) this).field_Q.field_J = false;
                ((m) this).field_Q.field_I = (int)(65536.0f * (param1 / 100.0f));
                ((m) this).field_W = param2;
                return;
              }
            } else {
              ((m) this).field_Q.b(8405024, 4210752, 108);
              ((m) this).field_Q.field_J = true;
              ((m) this).field_Q.field_I = (int)(65536.0f * (param1 / 100.0f));
              ((m) this).field_W = param2;
              return;
            }
          } else {
            ((m) this).field_Q.field_I = (int)(65536.0f * (param1 / 100.0f));
            ((m) this).field_W = param2;
            return;
          }
        } else {
          L3: {
            field_T = null;
            if (param3) {
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
            if (((m) this).field_P) {
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
            if (!((m) this).field_P) {
              ((m) this).field_Q.b(2113632, 4210752, 99);
              if (!((m) this).field_S) {
                ((m) this).field_Q.field_I = (int)(65536.0f * (param1 / 100.0f));
                ((m) this).field_W = param2;
                return;
              } else {
                ((m) this).field_Q.field_J = false;
                ((m) this).field_Q.field_I = (int)(65536.0f * (param1 / 100.0f));
                ((m) this).field_W = param2;
                return;
              }
            } else {
              ((m) this).field_Q.b(8405024, 4210752, 108);
              ((m) this).field_Q.field_J = true;
              ((m) this).field_Q.field_I = (int)(65536.0f * (param1 / 100.0f));
              ((m) this).field_W = param2;
              return;
            }
          } else {
            ((m) this).field_Q.field_I = (int)(65536.0f * (param1 / 100.0f));
            ((m) this).field_W = param2;
            return;
          }
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
