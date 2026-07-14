/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rl extends oe {
    private String field_Y;
    static od field_W;
    private boolean field_ab;
    private boolean field_Z;
    private hl field_bb;
    private String field_X;

    rl(ng param0, String param1) {
        super(param0, 300, 120);
        int var3 = 0;
        ((rl) this).field_Y = param1;
        if (((rl) this).field_Y != null) {
            var3 = hh.field_c.b(((rl) this).field_Y, 260, hh.field_c.field_o);
            ((rl) this).c(var3 + 150, 103, 300);
        }
        ((rl) this).field_bb = new hl(13, 50, 274, 30, 15, 2113632, 4210752);
        ((rl) this).field_ab = false;
        ((rl) this).field_bb.field_C = true;
        ((rl) this).field_Z = false;
        ((rl) this).b((byte) -98, (el) (Object) ((rl) this).field_bb);
    }

    final static cg a(int param0, ia param1, int param2) {
        if (param2 != 1000) {
          boolean discarded$2 = rl.n(-33);
          return new cg(param1, param0 * qk.field_j / 1000);
        } else {
          return new cg(param1, param0 * qk.field_j / 1000);
        }
    }

    final static boolean n(int param0) {
        if (param0 != -1071908447) {
            return false;
        }
        return tf.field_d == si.field_g ? true : false;
    }

    final void m(int param0) {
        ((rl) this).field_bb.field_C = false;
        ((rl) this).field_ab = true;
        if (param0 != 23181) {
            Object var3 = null;
            cg discarded$0 = rl.a(9, (ia) null, 122);
        }
    }

    final static void a(int param0, int param1, ph param2) {
        pk var3 = null;
        var3 = fj.field_q;
        var3.a(param0, (byte) -85);
        var3.d((byte) 123, param2.field_f);
        var3.e(param2.field_h, param1 + 28161);
        if (param1 != 534) {
          field_W = null;
          return;
        } else {
          return;
        }
    }

    public static void h(byte param0) {
        if (param0 != 57) {
            field_W = null;
            field_W = null;
            return;
        }
        field_W = null;
    }

    final void a(boolean param0, String param1, int param2, float param3) {
        int var5 = 0;
        boolean stackIn_1_0 = false;
        boolean stackIn_2_0 = false;
        boolean stackIn_3_0 = false;
        int stackIn_3_1 = 0;
        Object stackIn_6_0 = null;
        Object stackIn_7_0 = null;
        Object stackIn_8_0 = null;
        int stackIn_8_1 = 0;
        boolean stackOut_0_0 = false;
        boolean stackOut_2_0 = false;
        int stackOut_2_1 = 0;
        boolean stackOut_1_0 = false;
        int stackOut_1_1 = 0;
        Object stackOut_5_0 = null;
        Object stackOut_7_0 = null;
        int stackOut_7_1 = 0;
        Object stackOut_6_0 = null;
        int stackOut_6_1 = 0;
        L0: {
          var5 = -51 / ((param2 - 86) / 32);
          stackOut_0_0 = param0;
          stackIn_2_0 = stackOut_0_0;
          stackIn_1_0 = stackOut_0_0;
          if (((rl) this).field_Z) {
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
            stackOut_5_0 = this;
            stackIn_7_0 = stackOut_5_0;
            stackIn_6_0 = stackOut_5_0;
            if (!param0) {
              stackOut_7_0 = this;
              stackOut_7_1 = 0;
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              break L1;
            } else {
              stackOut_6_0 = this;
              stackOut_6_1 = 1;
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              break L1;
            }
          }
          ((rl) this).field_Z = stackIn_8_1 != 0;
          if (!((rl) this).field_Z) {
            ((rl) this).field_bb.a(4210752, 2113632, (byte) -103);
            if (!((rl) this).field_ab) {
              ((rl) this).field_X = param1;
              ((rl) this).field_bb.field_x = (int)(65536.0f * (param3 / 100.0f));
              return;
            } else {
              ((rl) this).field_bb.field_C = false;
              ((rl) this).field_X = param1;
              ((rl) this).field_bb.field_x = (int)(65536.0f * (param3 / 100.0f));
              return;
            }
          } else {
            ((rl) this).field_bb.a(4210752, 8405024, (byte) -103);
            ((rl) this).field_bb.field_C = true;
            ((rl) this).field_X = param1;
            ((rl) this).field_bb.field_x = (int)(65536.0f * (param3 / 100.0f));
            return;
          }
        } else {
          ((rl) this).field_X = param1;
          ((rl) this).field_bb.field_x = (int)(65536.0f * (param3 / 100.0f));
          return;
        }
    }

    final void b(int param0, int param1, int param2) {
        super.b(param0, param1, param2);
        hh.field_c.b(((rl) this).field_X, (((rl) this).field_r >> -1071908447) + param0, param2 - -103, 16777215, -1);
        if (((rl) this).field_Y != null) {
            vb.c(20 + param0, -7 + param2 - -120, 260, 8421504);
            int discarded$0 = hh.field_c.a(((rl) this).field_Y, param0 - -20, 8 + (120 + param2), 260, 100, 16777215, -1, 1, 0, hh.field_c.field_o);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_W = new od("usename");
    }
}
