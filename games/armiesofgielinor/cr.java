/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cr extends sf {
    static String field_eb;
    private boolean field_ab;
    static String field_bb;
    private String field_cb;
    private rj field_Y;
    static String[][] field_W;
    static int field_Z;
    private boolean field_db;
    private String field_X;

    final static fo a(String param0, int param1) {
        if (param1 != 4210752) {
            field_bb = null;
            return new fo(param0);
        }
        return new fo(param0);
    }

    final void b(int param0, int param1, int param2) {
        this.b(param0, param1, param2);
        bv.field_t.c(((cr) this).field_cb, (((cr) this).field_l >> 1902847169) + param0, param2 - -103, 16777215, -1);
        if (null != ((cr) this).field_X) {
            qn.e(20 + param0, -7 + (120 + param2), 260, 8421504);
            int discarded$0 = bv.field_t.a(((cr) this).field_X, 20 + param0, param2 - -120 - -8, 260, 100, 16777215, -1, 1, 0, bv.field_t.field_H);
        }
    }

    public static void n(int param0) {
        field_eb = null;
        if (param0 != 260) {
          cr.n(-8);
          field_W = null;
          field_bb = null;
          return;
        } else {
          field_W = null;
          field_bb = null;
          return;
        }
    }

    final void a(float param0, int param1, boolean param2, String param3) {
        Object var6 = null;
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
        if (param1 == 30) {
          L0: {
            if (((cr) this).field_ab) {
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
            if (param2) {
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
              if (!param2) {
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
            ((cr) this).field_ab = stackIn_29_1 != 0;
            if (!((cr) this).field_ab) {
              ((cr) this).field_Y.c(4210752, 2113632, 27178);
              if (((cr) this).field_db) {
                ((cr) this).field_Y.field_R = false;
                ((cr) this).field_Y.field_D = (int)(param0 / 100.0f * 65536.0f);
                ((cr) this).field_cb = param3;
                return;
              } else {
                ((cr) this).field_Y.field_D = (int)(param0 / 100.0f * 65536.0f);
                ((cr) this).field_cb = param3;
                return;
              }
            } else {
              ((cr) this).field_Y.c(4210752, 8405024, 27178);
              ((cr) this).field_Y.field_R = true;
              ((cr) this).field_Y.field_D = (int)(param0 / 100.0f * 65536.0f);
              ((cr) this).field_cb = param3;
              return;
            }
          } else {
            ((cr) this).field_Y.field_D = (int)(param0 / 100.0f * 65536.0f);
            ((cr) this).field_cb = param3;
            return;
          }
        } else {
          L3: {
            var6 = null;
            fo discarded$1 = cr.a((String) null, -94);
            if (((cr) this).field_ab) {
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
            if (param2) {
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
              if (!param2) {
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
            ((cr) this).field_ab = stackIn_12_1 != 0;
            if (!((cr) this).field_ab) {
              ((cr) this).field_Y.c(4210752, 2113632, 27178);
              if (((cr) this).field_db) {
                ((cr) this).field_Y.field_R = false;
                ((cr) this).field_Y.field_D = (int)(param0 / 100.0f * 65536.0f);
                ((cr) this).field_cb = param3;
                return;
              } else {
                ((cr) this).field_Y.field_D = (int)(param0 / 100.0f * 65536.0f);
                ((cr) this).field_cb = param3;
                return;
              }
            } else {
              ((cr) this).field_Y.c(4210752, 8405024, 27178);
              ((cr) this).field_Y.field_R = true;
              ((cr) this).field_Y.field_D = (int)(param0 / 100.0f * 65536.0f);
              ((cr) this).field_cb = param3;
              return;
            }
          } else {
            ((cr) this).field_Y.field_D = (int)(param0 / 100.0f * 65536.0f);
            ((cr) this).field_cb = param3;
            return;
          }
        }
    }

    cr(gk param0, String param1) {
        super(param0, 300, 120);
        int var3 = 0;
        ((cr) this).field_X = param1;
        if (((cr) this).field_X != null) {
            var3 = bv.field_t.a(((cr) this).field_X, 260, bv.field_t.field_H);
            ((cr) this).a(300, (byte) 100, 150 - -var3);
        }
        ((cr) this).field_Y = new rj(13, 50, 274, 30, 15, 2113632, 4210752);
        ((cr) this).field_db = false;
        ((cr) this).field_ab = false;
        ((cr) this).field_Y.field_R = true;
        ((cr) this).a((byte) 10, (kb) (Object) ((cr) this).field_Y);
    }

    final void i(byte param0) {
        ((cr) this).field_db = true;
        ((cr) this).field_Y.field_R = false;
        if (param0 < 1) {
            ((cr) this).field_cb = null;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_bb = "<%0> / <%1> (+<%2>) - Victory in 1 turn";
        field_eb = "Waiting for extra data";
        field_W = new String[][]{new String[1], new String[1], new String[1], new String[1], new String[1], new String[1], new String[1], new String[1], new String[1], new String[1], new String[1], new String[1], new String[1], new String[1], new String[1], new String[1], new String[1], new String[1], new String[1], new String[1], new String[1], new String[1], new String[1], new String[1], new String[1], new String[1], new String[1], new String[1], new String[1], new String[1], new String[1], new String[1], new String[1], new String[1], new String[1], new String[1], new String[1], new String[1], new String[1], new String[1], new String[1], new String[1], new String[1], new String[1], new String[1], new String[1], new String[1], new String[1], new String[1], new String[1], new String[2], new String[1], new String[1], new String[1], new String[1], new String[1], new String[1], new String[1], new String[1], new String[2], new String[1], new String[1], new String[1], new String[1], new String[1], new String[1], new String[1], new String[1], new String[1], new String[1], new String[1], new String[1], new String[1], new String[1], new String[1], new String[1], new String[1], new String[1], new String[1], new String[1], new String[1], new String[1], new String[1], new String[1], new String[1], new String[1], new String[1], new String[1], new String[3], new String[1], new String[4], new String[4], new String[4], new String[4], new String[5], new String[5], new String[4], new String[4], new String[5], new String[10], new String[6], new String[1], new String[1], new String[1], new String[1], new String[1], new String[1], new String[1], new String[1], new String[1], new String[1], new String[1], new String[3], new String[1], new String[3], new String[3], new String[1], new String[1], new String[1], new String[1], new String[1], new String[1], new String[1], new String[1], new String[1], new String[1], new String[1], new String[1], new String[1], new String[1], new String[1], new String[1], new String[1], new String[1], new String[1], new String[1], new String[1], new String[1], new String[1], new String[1], new String[1], new String[1], new String[1], new String[1], new String[1], new String[1], new String[1], new String[1], new String[1], new String[1], new String[1], new String[1], new String[5], new String[1], new String[1], new String[1], new String[1], new String[1], new String[1], new String[1], new String[1], new String[1], new String[1], new String[1], new String[1], new String[1], new String[1], new String[1], new String[1], new String[1], new String[1], new String[1], new String[1], new String[1], new String[1], new String[1], new String[1], new String[1], new String[1], new String[1], new String[1], new String[1], new String[1], new String[1], new String[1], new String[1], new String[1], new String[1], new String[1], new String[1], new String[1], new String[1], new String[1], new String[1], new String[1], new String[4], new String[1], new String[1], new String[1], new String[1], new String[1], new String[1], new String[1], new String[1], new String[1], new String[1], new String[1], new String[1], new String[1], new String[1], new String[1], new String[1], new String[1], new String[1], new String[1], new String[1], new String[1], new String[1], new String[1], new String[1], new String[1], new String[1], new String[1], new String[1], new String[1], new String[1], new String[1], new String[1], new String[1], new String[1], new String[1], new String[1], new String[1], new String[1], new String[1], new String[1], new String[1], new String[1], new String[1], new String[1], new String[1], new String[1], new String[1], new String[1], new String[1], new String[1], new String[1], new String[1], new String[1], new String[1], new String[1], new String[1], new String[1], new String[1], new String[1], new String[1], new String[1], new String[1], new String[1], new String[1], new String[1], new String[1], new String[1], new String[1], new String[1], new String[1], new String[1], new String[1], new String[1], new String[1]};
        field_Z = 0;
    }
}
