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
        ((vs) this).field_L.field_D = false;
        if (param0 != 12936) {
            vs.i((byte) 50);
            ((vs) this).field_Q = true;
            return;
        }
        ((vs) this).field_Q = true;
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
        boolean stackIn_1_0 = false;
        boolean stackIn_2_0 = false;
        boolean stackIn_3_0 = false;
        int stackIn_3_1 = 0;
        Object stackIn_9_0 = null;
        Object stackIn_10_0 = null;
        Object stackIn_11_0 = null;
        int stackIn_11_1 = 0;
        boolean stackOut_0_0 = false;
        boolean stackOut_2_0 = false;
        int stackOut_2_1 = 0;
        boolean stackOut_1_0 = false;
        int stackOut_1_1 = 0;
        Object stackOut_8_0 = null;
        Object stackOut_10_0 = null;
        int stackOut_10_1 = 0;
        Object stackOut_9_0 = null;
        int stackOut_9_1 = 0;
        L0: {
          stackOut_0_0 = param2;
          stackIn_2_0 = stackOut_0_0;
          stackIn_1_0 = stackOut_0_0;
          if (((vs) this).field_N) {
            stackOut_2_0 = stackIn_2_0;
            stackOut_2_1 = 0;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            break L0;
          } else {
            stackOut_1_0 = stackIn_1_0;
            stackOut_1_1 = 1;
            stackIn_3_0 = stackOut_1_0;
            stackIn_3_1 = stackOut_1_1;
            break L0;
          }
        }
        if ((stackIn_3_0 ? 1 : 0) == stackIn_3_1) {
          L1: {
            stackOut_8_0 = this;
            stackIn_10_0 = stackOut_8_0;
            stackIn_9_0 = stackOut_8_0;
            if (!param2) {
              stackOut_10_0 = this;
              stackOut_10_1 = 0;
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              break L1;
            } else {
              stackOut_9_0 = this;
              stackOut_9_1 = 1;
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              break L1;
            }
          }
          ((vs) this).field_N = stackIn_11_1 != 0;
          if (!((vs) this).field_N) {
            ((vs) this).field_L.a(true, 4210752, 2113632);
            if (!((vs) this).field_Q) {
              ((vs) this).field_L.field_B = (int)(param0 / 100.0f * 65536.0f);
              if (param3 == 110) {
                ((vs) this).field_S = param1;
                return;
              } else {
                ((vs) this).field_Q = true;
                ((vs) this).field_S = param1;
                return;
              }
            } else {
              ((vs) this).field_L.field_D = false;
              ((vs) this).field_L.field_B = (int)(param0 / 100.0f * 65536.0f);
              if (param3 == 110) {
                ((vs) this).field_S = param1;
                return;
              } else {
                ((vs) this).field_Q = true;
                ((vs) this).field_S = param1;
                return;
              }
            }
          } else {
            ((vs) this).field_L.a(true, 4210752, 8405024);
            ((vs) this).field_L.field_D = true;
            ((vs) this).field_L.field_B = (int)(param0 / 100.0f * 65536.0f);
            if (param3 == 110) {
              ((vs) this).field_S = param1;
              return;
            } else {
              ((vs) this).field_Q = true;
              ((vs) this).field_S = param1;
              return;
            }
          }
        } else {
          ((vs) this).field_L.field_B = (int)(param0 / 100.0f * 65536.0f);
          if (param3 == 110) {
            ((vs) this).field_S = param1;
            return;
          } else {
            ((vs) this).field_Q = true;
            ((vs) this).field_S = param1;
            return;
          }
        }
    }

    final void a(int param0, byte param1, int param2) {
        super.a(param0, param1, param2);
        ft.field_c.a(((vs) this).field_S, param2 + (((vs) this).field_m >> 87503585), param0 + 103, 16777215, -1);
        if (!(null == ((vs) this).field_M)) {
            bea.c(20 + param2, param0 - -120 + -7, 260, 8421504);
            int discarded$0 = ft.field_c.a(((vs) this).field_M, param2 + 20, 120 + param0 - -8, 260, 100, 16777215, -1, 1, 0, ft.field_c.field_w);
        }
    }

    vs(jta param0, String param1) {
        super(param0, 300, 120);
        int var3 = 0;
        ((vs) this).field_M = param1;
        if (null != ((vs) this).field_M) {
            var3 = ft.field_c.a(((vs) this).field_M, 260, ft.field_c.field_w);
            ((vs) this).c(-11560, var3 + 150, 300);
        }
        ((vs) this).field_L = new rk(13, 50, 274, 30, 15, 2113632, 4210752);
        ((vs) this).field_Q = false;
        ((vs) this).field_N = false;
        ((vs) this).field_L.field_D = true;
        ((vs) this).a((ae) (Object) ((vs) this).field_L, -1);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_T = new iw();
        field_P = new int[12];
    }
}
