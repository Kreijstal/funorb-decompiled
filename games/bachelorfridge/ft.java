/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ft extends bw {
    static vr field_h;
    boolean field_f;
    int field_g;

    final static void a(int param0) {
        L0: {
          kt.field_m = new sna(0L, (sna) null);
          if (eaa.field_c) {
            kt.field_m.a(-1, dea.field_m);
            break L0;
          } else {
            break L0;
          }
        }
        kt.field_m.a(-1, tv.field_o);
        if (param0 != 2048) {
          ft.a(93);
          lia.field_j = new lm(cja.field_r, kt.field_m);
          ng.field_e = new sna(0L, (sna) null);
          ng.field_e.a(-1, (sna) (Object) lia.field_j.field_a);
          ng.field_e.a(-1, mc.field_g);
          kf.a((byte) -6);
          return;
        } else {
          lia.field_j = new lm(cja.field_r, kt.field_m);
          ng.field_e = new sna(0L, (sna) null);
          ng.field_e.a(-1, (sna) (Object) lia.field_j.field_a);
          ng.field_e.a(-1, mc.field_g);
          kf.a((byte) -6);
          return;
        }
    }

    final static void c(byte param0) {
        int var1 = 0;
        if (!qo.field_c) {
          throw new IllegalStateException();
        } else {
          lia.field_i = true;
          var1 = -76 % ((param0 - 32) / 42);
          gq.a(false, 19626);
          jv.field_j = 0;
          return;
        }
    }

    private final void a(lu param0, int param1) {
        Object stackIn_1_0 = null;
        Object stackIn_2_0 = null;
        Object stackIn_3_0 = null;
        int stackIn_3_1 = 0;
        Object stackOut_0_0 = null;
        Object stackOut_2_0 = null;
        int stackOut_2_1 = 0;
        Object stackOut_1_0 = null;
        int stackOut_1_1 = 0;
        L0: {
          ((ft) this).field_g = param0.f(-95);
          stackOut_0_0 = this;
          stackIn_2_0 = stackOut_0_0;
          stackIn_1_0 = stackOut_0_0;
          if (-1 == (param0.b(16711935) ^ -1)) {
            stackOut_2_0 = this;
            stackOut_2_1 = 0;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            break L0;
          } else {
            stackOut_1_0 = this;
            stackOut_1_1 = 1;
            stackIn_3_0 = stackOut_1_0;
            stackIn_3_1 = stackOut_1_1;
            break L0;
          }
        }
        ((ft) this).field_f = stackIn_3_1 != 0;
        if (param1 != -26011) {
          int discarded$2 = ft.a(-71, (byte) 7);
          return;
        } else {
          return;
        }
    }

    public static void d(byte param0) {
        field_h = null;
        int var1 = -81 / ((param0 - 3) / 50);
    }

    final static int a(int param0, byte param1) {
        int stackIn_6_0 = 0;
        int stackIn_10_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_4_0 = 0;
        if (param1 <= -127) {
          param0 = param0 & 8191;
          if (4096 > param0) {
            L0: {
              if (2048 <= param0) {
                stackOut_9_0 = -ed.field_b[-2048 + param0];
                stackIn_10_0 = stackOut_9_0;
                break L0;
              } else {
                stackOut_8_0 = ed.field_b[2048 - param0];
                stackIn_10_0 = stackOut_8_0;
                break L0;
              }
            }
            return stackIn_10_0;
          } else {
            L1: {
              if (param0 < 6144) {
                stackOut_5_0 = -ed.field_b[6144 + -param0];
                stackIn_6_0 = stackOut_5_0;
                break L1;
              } else {
                stackOut_4_0 = ed.field_b[param0 - 6144];
                stackIn_6_0 = stackOut_4_0;
                break L1;
              }
            }
            return stackIn_6_0;
          }
        } else {
          return -124;
        }
    }

    ft(lu param0) {
        this.a(param0, -26011);
    }

    static {
    }
}
