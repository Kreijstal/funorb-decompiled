/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class goa extends iw {
    private String field_K;
    private String field_J;
    private boolean field_M;
    private boolean field_L;
    private ttb field_N;

    goa(ida param0, String param1) {
        super(param0, 300, 120);
        int var3 = 0;
        ((goa) this).field_K = param1;
        if (((goa) this).field_K != null) {
            var3 = vob.field_r.b(((goa) this).field_K, 260, vob.field_r.field_k);
            ((goa) this).c(300, -1860440319, 150 + var3);
        }
        ((goa) this).field_N = new ttb(13, 50, 274, 30, 15, 2113632, 4210752);
        ((goa) this).field_N.field_x = true;
        ((goa) this).field_L = false;
        ((goa) this).field_M = false;
        ((goa) this).b(-18756, (shb) (Object) ((goa) this).field_N);
    }

    final void b(int param0, int param1, int param2) {
        super.b(param0, param1, param2);
        vob.field_r.a(((goa) this).field_J, (((goa) this).field_h >> 1630174241) + param2, 103 + param0, 16777215, -1);
        if (null != ((goa) this).field_K) {
            dma.h(param2 + 20, 113 + param0, 260, 8421504);
            int discarded$0 = vob.field_r.a(((goa) this).field_K, 20 + param2, 120 + param0 - -8, 260, 100, 16777215, -1, 1, 0, vob.field_r.field_k);
        }
    }

    final void g(int param0) {
        Object var3 = null;
        if (param0 != 25880) {
          var3 = null;
          ((goa) this).a(false, (String) null, -1.248936414718628f, (byte) -121);
          ((goa) this).field_N.field_x = false;
          ((goa) this).field_L = true;
          return;
        } else {
          ((goa) this).field_N.field_x = false;
          ((goa) this).field_L = true;
          return;
        }
    }

    final void a(boolean param0, String param1, float param2, byte param3) {
        int stackIn_3_0 = 0;
        Object stackIn_9_0 = null;
        Object stackIn_10_0 = null;
        Object stackIn_11_0 = null;
        int stackIn_11_1 = 0;
        int stackOut_2_0 = 0;
        int stackOut_1_0 = 0;
        Object stackOut_8_0 = null;
        Object stackOut_10_0 = null;
        int stackOut_10_1 = 0;
        Object stackOut_9_0 = null;
        int stackOut_9_1 = 0;
        L0: {
          if (((goa) this).field_M) {
            stackOut_2_0 = 0;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          } else {
            stackOut_1_0 = 1;
            stackIn_3_0 = stackOut_1_0;
            break L0;
          }
        }
        if (stackIn_3_0 == (param0 ? 1 : 0)) {
          L1: {
            stackOut_8_0 = this;
            stackIn_10_0 = stackOut_8_0;
            stackIn_9_0 = stackOut_8_0;
            if (!param0) {
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
          ((goa) this).field_M = stackIn_11_1 != 0;
          if (!((goa) this).field_M) {
            ((goa) this).field_N.b(2113632, -21202, 4210752);
            if (!((goa) this).field_L) {
              ((goa) this).field_J = param1;
              ((goa) this).field_N.field_v = (int)(param2 / 100.0f * 65536.0f);
              if (param3 != -89) {
                ((goa) this).field_J = null;
                return;
              } else {
                return;
              }
            } else {
              ((goa) this).field_N.field_x = false;
              ((goa) this).field_J = param1;
              ((goa) this).field_N.field_v = (int)(param2 / 100.0f * 65536.0f);
              if (param3 != -89) {
                ((goa) this).field_J = null;
                return;
              } else {
                return;
              }
            }
          } else {
            ((goa) this).field_N.b(8405024, -21202, 4210752);
            ((goa) this).field_N.field_x = true;
            ((goa) this).field_J = param1;
            ((goa) this).field_N.field_v = (int)(param2 / 100.0f * 65536.0f);
            if (param3 == -89) {
              return;
            } else {
              ((goa) this).field_J = null;
              return;
            }
          }
        } else {
          ((goa) this).field_J = param1;
          ((goa) this).field_N.field_v = (int)(param2 / 100.0f * 65536.0f);
          if (param3 == -89) {
            return;
          } else {
            ((goa) this).field_J = null;
            return;
          }
        }
    }

    static {
    }
}
