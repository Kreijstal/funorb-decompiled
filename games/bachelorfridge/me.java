/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class me extends bca {
    int field_r;
    static js field_t;
    int field_u;
    static String field_q;
    static String field_s;

    final at a(int param0, gj param1) {
        if (param0 != 5) {
          me.d((byte) 14);
          return (at) (Object) new od(param1, (me) this, ((me) this).field_p);
        } else {
          return (at) (Object) new od(param1, (me) this, ((me) this).field_p);
        }
    }

    me(int param0, nq param1) {
        super(param0, param1);
    }

    final void a(op param0, int param1) {
        int var3 = 0;
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
          aga discarded$1 = ((me) this).field_l.a(107, param0);
          stackOut_0_0 = this;
          stackIn_2_0 = stackOut_0_0;
          stackIn_1_0 = stackOut_0_0;
          if (param0.e(((me) this).field_r, ((me) this).field_u, -11066)) {
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
        ((me) this).field_p = stackIn_3_1 != 0;
        if (null != param0.field_a[((me) this).field_r][((me) this).field_u].field_l) {
          L1: {
            ((me) this).field_p = true;
            if (!((me) this).field_p) {
              param0.b((byte) 91, 36, ((me) this).field_r, ((me) this).field_u);
              break L1;
            } else {
              break L1;
            }
          }
          var3 = -2 / ((param1 - 12) / 35);
          return;
        } else {
          L2: {
            if (!((me) this).field_p) {
              param0.b((byte) 91, 36, ((me) this).field_r, ((me) this).field_u);
              break L2;
            } else {
              break L2;
            }
          }
          var3 = -2 / ((param1 - 12) / 35);
          return;
        }
    }

    public static void d(int param0) {
        field_s = null;
        field_t = null;
        field_q = null;
        if (param0 < 63) {
            field_s = null;
        }
    }

    final void a(byte param0, lu param1) {
        lu stackIn_2_0 = null;
        lu stackIn_3_0 = null;
        lu stackIn_4_0 = null;
        int stackIn_4_1 = 0;
        lu stackIn_6_0 = null;
        lu stackIn_7_0 = null;
        lu stackIn_8_0 = null;
        int stackIn_8_1 = 0;
        lu stackOut_5_0 = null;
        lu stackOut_7_0 = null;
        int stackOut_7_1 = 0;
        lu stackOut_6_0 = null;
        int stackOut_6_1 = 0;
        lu stackOut_1_0 = null;
        lu stackOut_3_0 = null;
        int stackOut_3_1 = 0;
        lu stackOut_2_0 = null;
        int stackOut_2_1 = 0;
        this.a((byte) -38, param1);
        param1.d(((me) this).field_r, 0);
        param1.d(((me) this).field_u, 0);
        if (param0 > -12) {
          L0: {
            me.d(94);
            stackOut_5_0 = (lu) param1;
            stackIn_7_0 = stackOut_5_0;
            stackIn_6_0 = stackOut_5_0;
            if (((me) this).field_p) {
              stackOut_7_0 = (lu) (Object) stackIn_7_0;
              stackOut_7_1 = 1;
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              break L0;
            } else {
              stackOut_6_0 = (lu) (Object) stackIn_6_0;
              stackOut_6_1 = 0;
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              break L0;
            }
          }
          ((lu) (Object) stackIn_8_0).d(stackIn_8_1, 0);
          return;
        } else {
          L1: {
            stackOut_1_0 = (lu) param1;
            stackIn_3_0 = stackOut_1_0;
            stackIn_2_0 = stackOut_1_0;
            if (((me) this).field_p) {
              stackOut_3_0 = (lu) (Object) stackIn_3_0;
              stackOut_3_1 = 1;
              stackIn_4_0 = stackOut_3_0;
              stackIn_4_1 = stackOut_3_1;
              break L1;
            } else {
              stackOut_2_0 = (lu) (Object) stackIn_2_0;
              stackOut_2_1 = 0;
              stackIn_4_0 = stackOut_2_0;
              stackIn_4_1 = stackOut_2_1;
              break L1;
            }
          }
          ((lu) (Object) stackIn_4_0).d(stackIn_4_1, 0);
          return;
        }
    }

    final static void d(byte param0) {
        if (bp.e(-29919)) {
          return;
        } else {
          if (param0 > -112) {
            me.d((byte) 87);
            sja.field_fb.c(64, (byte) 123);
            return;
          } else {
            sja.field_fb.c(64, (byte) 123);
            return;
          }
        }
    }

    me(lu param0) {
        super(param0);
        ((me) this).field_k = param0.e((byte) 55);
        ((me) this).field_o = new eaa();
        int var2 = param0.b(16711935);
        while (true) {
            var2--;
            if ((var2 ^ -1) > -1) {
                break;
            }
            ((me) this).field_o.a((bw) (Object) dca.a((byte) 102, param0), true);
        }
        ((me) this).field_r = param0.b(16711935);
        ((me) this).field_u = param0.b(16711935);
        ((me) this).field_p = (param0.b(16711935) ^ -1) == -2 ? true : false;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_s = "This password contains your Player Name, and would be easy to guess";
        field_q = "Macroing or use of bots";
    }
}
