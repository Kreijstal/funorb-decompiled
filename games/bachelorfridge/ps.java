/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ps extends bca {
    static ee field_q;

    public static void d(byte param0) {
        if (param0 >= -8) {
            ps.d((byte) -65);
            field_q = null;
            return;
        }
        field_q = null;
    }

    final at a(int param0, gj param1) {
        if (param0 != 5) {
            return null;
        }
        return (at) (Object) new cka(param1, (ps) this);
    }

    ps(int param0, nq param1) {
        super(param0, param1);
    }

    ps(lu param0) {
        super(param0);
        ((ps) this).field_k = param0.e((byte) 104);
        ((ps) this).field_o = new eaa();
        int var2 = param0.b(16711935);
        while (true) {
            var2--;
            if (-1 < (var2 ^ -1)) {
                break;
            }
            ((ps) this).field_o.a((bw) (Object) dca.a((byte) 102, param0), true);
        }
    }

    final void a(op param0, int param1) {
        int var3 = 45 % ((param1 - 12) / 35);
        ((ps) this).a(param0, (byte) -2);
    }

    final static boolean d(int param0) {
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        if (param0 >= -116) {
          L0: {
            field_q = null;
            if (pw.field_w.field_Sb != ge.field_F) {
              stackOut_7_0 = 0;
              stackIn_8_0 = stackOut_7_0;
              break L0;
            } else {
              stackOut_6_0 = 1;
              stackIn_8_0 = stackOut_6_0;
              break L0;
            }
          }
          return stackIn_8_0 != 0;
        } else {
          L1: {
            if (pw.field_w.field_Sb != ge.field_F) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              break L1;
            } else {
              stackOut_2_0 = 1;
              stackIn_4_0 = stackOut_2_0;
              break L1;
            }
          }
          return stackIn_4_0 != 0;
        }
    }

    static {
    }
}
