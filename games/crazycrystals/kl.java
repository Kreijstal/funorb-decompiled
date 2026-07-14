/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kl extends en {
    static int field_T;
    private String field_Q;
    static int[] field_S;
    private String field_Y;
    static int field_U;
    static int field_V;
    private boolean field_R;
    private boolean field_W;
    private co field_X;

    kl(ol param0, String param1) {
        super(param0, 300, 120);
        int var3 = 0;
        ((kl) this).field_Q = param1;
        if (((kl) this).field_Q != null) {
            var3 = mo.field_m.b(((kl) this).field_Q, 260, mo.field_m.field_o);
            ((kl) this).a(var3 + 150, (byte) 119, 300);
        }
        ((kl) this).field_X = new co(13, 50, 274, 30, 15, 2113632, 4210752);
        ((kl) this).field_X.field_H = true;
        ((kl) this).field_W = false;
        ((kl) this).field_R = false;
        ((kl) this).b((qm) (Object) ((kl) this).field_X, -121);
    }

    public static void h(byte param0) {
        field_S = null;
        if (param0 != -1) {
            field_T = 91;
        }
    }

    final static void a(byte param0, java.applet.Applet param1) {
        d.a(param1, (byte) 125, "");
        if (param0 != -1) {
            kl.h((byte) -111);
            qe.a(0, param1);
            return;
        }
        qe.a(0, param1);
    }

    final void b(int param0, int param1, int param2) {
        super.b(param0 + 0, param1, param2);
        mo.field_m.c(((kl) this).field_Y, (((kl) this).field_g >> 1061051233) + param1, param2 + 103, 16777215, -1);
        if (param0 != 30) {
          L0: {
            ((kl) this).field_Y = null;
            if (null != ((kl) this).field_Q) {
              kh.f(param1 - -20, -7 + (120 + param2), 260, 8421504);
              int discarded$2 = mo.field_m.a(((kl) this).field_Q, param1 - -20, 120 + (param2 + 8), 260, 100, 16777215, -1, 1, 0, mo.field_m.field_o);
              break L0;
            } else {
              break L0;
            }
          }
          return;
        } else {
          L1: {
            if (null != ((kl) this).field_Q) {
              kh.f(param1 - -20, -7 + (120 + param2), 260, 8421504);
              int discarded$3 = mo.field_m.a(((kl) this).field_Q, param1 - -20, 120 + (param2 + 8), 260, 100, 16777215, -1, 1, 0, mo.field_m.field_o);
              break L1;
            } else {
              break L1;
            }
          }
          return;
        }
    }

    final void a(int param0, boolean param1, float param2, String param3) {
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
          if (((kl) this).field_R) {
            stackOut_2_0 = 0;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          } else {
            stackOut_1_0 = 1;
            stackIn_3_0 = stackOut_1_0;
            break L0;
          }
        }
        if (stackIn_3_0 == (param1 ? 1 : 0)) {
          L1: {
            stackOut_8_0 = this;
            stackIn_10_0 = stackOut_8_0;
            stackIn_9_0 = stackOut_8_0;
            if (!param1) {
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
          ((kl) this).field_R = stackIn_11_1 != 0;
          if (((kl) this).field_R) {
            ((kl) this).field_X.b((byte) -126, 4210752, 8405024);
            ((kl) this).field_X.field_H = true;
            ((kl) this).field_Y = param3;
            if (param0 != 8405024) {
              kl.h((byte) 14);
              ((kl) this).field_X.field_A = (int)(param2 / 100.0f * 65536.0f);
              return;
            } else {
              ((kl) this).field_X.field_A = (int)(param2 / 100.0f * 65536.0f);
              return;
            }
          } else {
            ((kl) this).field_X.b((byte) 107, 4210752, 2113632);
            if (!((kl) this).field_W) {
              ((kl) this).field_Y = param3;
              if (param0 != 8405024) {
                kl.h((byte) 14);
                ((kl) this).field_X.field_A = (int)(param2 / 100.0f * 65536.0f);
                return;
              } else {
                ((kl) this).field_X.field_A = (int)(param2 / 100.0f * 65536.0f);
                return;
              }
            } else {
              ((kl) this).field_X.field_H = false;
              ((kl) this).field_Y = param3;
              if (param0 == 8405024) {
                ((kl) this).field_X.field_A = (int)(param2 / 100.0f * 65536.0f);
                return;
              } else {
                kl.h((byte) 14);
                ((kl) this).field_X.field_A = (int)(param2 / 100.0f * 65536.0f);
                return;
              }
            }
          }
        } else {
          ((kl) this).field_Y = param3;
          if (param0 == 8405024) {
            ((kl) this).field_X.field_A = (int)(param2 / 100.0f * 65536.0f);
            return;
          } else {
            kl.h((byte) 14);
            ((kl) this).field_X.field_A = (int)(param2 / 100.0f * 65536.0f);
            return;
          }
        }
    }

    final void i(byte param0) {
        ((kl) this).field_W = true;
        int var2 = -2 / ((param0 - -40) / 36);
        ((kl) this).field_X.field_H = false;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_S = new int[]{0, 0, -1, 1};
    }
}
