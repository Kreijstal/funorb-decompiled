/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sb extends oa {
    static int field_Z;
    static he field_bb;
    static int[] field_V;
    static gh field_Y;
    static wk field_W;
    static gh field_ab;
    static wk[] field_X;

    public static void g(int param0) {
        field_bb = null;
        if (param0 < 92) {
          sb.g(-16);
          field_ab = null;
          field_X = null;
          field_V = null;
          field_Y = null;
          field_W = null;
          return;
        } else {
          field_ab = null;
          field_X = null;
          field_V = null;
          field_Y = null;
          field_W = null;
          return;
        }
    }

    sb(String param0, tn param1, boolean param2) {
        this(param0, param1);
        ((sb) this).field_T = param2 ? true : false;
    }

    private sb(String param0, qk param1, tn param2) {
        super(param0, param1, param2);
        ((sb) this).field_p = ad.field_j.field_x;
    }

    final void b(int param0, byte param1, int param2, int param3) {
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
          stackOut_0_0 = this;
          stackIn_2_0 = stackOut_0_0;
          stackIn_1_0 = stackOut_0_0;
          if (((sb) this).field_T) {
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
        ((sb) this).field_T = stackIn_3_1 != 0;
        super.b(param0, (byte) -127, param2, param3);
        if (param1 >= -122) {
          ((sb) this).b(-25, (byte) 43, -53, 29);
          return;
        } else {
          return;
        }
    }

    final static void a(boolean param0) {
        nn.a(param0);
        fg.a(10, db.field_b, dh.field_y[0].field_z, da.field_g, ua.field_G, te.field_b);
    }

    private sb(String param0, tn param1) {
        this(param0, ad.field_j.field_f, param1);
        ((sb) this).field_p = ad.field_j.field_x;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_V = new int[8192];
    }
}
