/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hk extends rg {
    static int field_bb;
    private boolean field_U;
    private hd field_Z;
    static int[] field_W;
    static int field_Y;
    private String field_X;
    private String field_cb;
    private boolean field_ab;

    final void b(int param0, int param1, int param2) {
        super.b(param0, -1, param2);
        va.field_i.b(((hk) this).field_X, (((hk) this).field_r >> 608644865) + param0, 103 + param2, 16777215, param1);
        if (!(null == ((hk) this).field_cb)) {
            ed.f(20 + param0, -7 + param2 + 120, 260, 8421504);
            int discarded$0 = va.field_i.a(((hk) this).field_cb, 20 + param0, param2 + 128, 260, 100, 16777215, -1, 1, 0, va.field_i.field_M);
        }
    }

    final void k(int param0) {
        ((hk) this).field_ab = true;
        ((hk) this).field_Z.field_I = false;
        if (param0 < 11) {
            hk.e(false);
        }
    }

    final void a(String param0, float param1, int param2, boolean param3) {
        int stackIn_3_0 = 0;
        Object stackIn_5_0 = null;
        Object stackIn_6_0 = null;
        Object stackIn_7_0 = null;
        int stackIn_7_1 = 0;
        int stackOut_2_0 = 0;
        int stackOut_1_0 = 0;
        Object stackOut_4_0 = null;
        Object stackOut_6_0 = null;
        int stackOut_6_1 = 0;
        Object stackOut_5_0 = null;
        int stackOut_5_1 = 0;
        L0: {
          if (param3) {
            stackOut_2_0 = 0;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          } else {
            stackOut_1_0 = 1;
            stackIn_3_0 = stackOut_1_0;
            break L0;
          }
        }
        L1: {
          if (stackIn_3_0 != (((hk) this).field_U ? 1 : 0)) {
            break L1;
          } else {
            L2: {
              stackOut_4_0 = this;
              stackIn_6_0 = stackOut_4_0;
              stackIn_5_0 = stackOut_4_0;
              if (!param3) {
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
            ((hk) this).field_U = stackIn_7_1 != 0;
            if (!((hk) this).field_U) {
              ((hk) this).field_Z.a(2113632, -1028717695, 4210752);
              if (((hk) this).field_ab) {
                ((hk) this).field_Z.field_I = false;
                break L1;
              } else {
                if (param2 != 2113632) {
                  return;
                } else {
                  ((hk) this).field_Z.field_z = (int)(65536.0f * (param1 / 100.0f));
                  ((hk) this).field_X = param0;
                  return;
                }
              }
            } else {
              ((hk) this).field_Z.a(8405024, -1028717695, 4210752);
              ((hk) this).field_Z.field_I = true;
              if (param2 != 2113632) {
                return;
              } else {
                ((hk) this).field_Z.field_z = (int)(65536.0f * (param1 / 100.0f));
                ((hk) this).field_X = param0;
                return;
              }
            }
          }
        }
        if (param2 != 2113632) {
          return;
        } else {
          ((hk) this).field_Z.field_z = (int)(65536.0f * (param1 / 100.0f));
          ((hk) this).field_X = param0;
          return;
        }
    }

    public static void e(boolean param0) {
        field_W = null;
        if (param0) {
            field_bb = -76;
        }
    }

    hk(wi param0, String param1) {
        super(param0, 300, 120);
        int var3 = 0;
        ((hk) this).field_cb = param1;
        if (null != ((hk) this).field_cb) {
            var3 = va.field_i.a(((hk) this).field_cb, 260, va.field_i.field_M);
            ((hk) this).a(6154, 150 - -var3, 300);
        }
        ((hk) this).field_Z = new hd(13, 50, 274, 30, 15, 2113632, 4210752);
        ((hk) this).field_Z.field_I = true;
        ((hk) this).field_ab = false;
        ((hk) this).field_U = false;
        ((hk) this).a((ub) (Object) ((hk) this).field_Z, (byte) 27);
    }

    static {
    }
}
