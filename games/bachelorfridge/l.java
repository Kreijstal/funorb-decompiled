/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class l extends bca {
    static String field_s;
    static vr field_r;
    static String field_q;

    final void a(op param0, int param1) {
        aga var3 = ((l) this).field_l.a(63, param0);
        int var4 = 99 % ((param1 - 12) / 35);
        bw discarded$10 = ((l) this).field_o.b((byte) 90);
        ((l) this).field_p = null == param0.a(var3, (byte) -92) ? true : false;
    }

    l(int param0, nq param1) {
        super(param0, param1);
    }

    final at a(int param0, gj param1) {
        Object var4 = null;
        if (param0 != 5) {
          var4 = null;
          ((l) this).a((byte) 112, (lu) null);
          return (at) (Object) new tma(param1, (l) this);
        } else {
          return (at) (Object) new tma(param1, (l) this);
        }
    }

    public static void d(byte param0) {
        field_r = null;
        field_q = null;
        field_s = null;
        if (param0 >= -116) {
            l.d((byte) -64);
        }
    }

    l(lu param0) {
        super(param0);
        ((l) this).field_k = param0.e((byte) 124);
        ((l) this).field_o = new eaa();
        int var2 = param0.b(16711935);
        while (true) {
            var2--;
            if (-1 < (var2 ^ -1)) {
                break;
            }
            ((l) this).field_o.a((bw) (Object) dca.a((byte) 102, param0), true);
        }
        ((l) this).field_p = 1 == param0.b(16711935) ? true : false;
    }

    final void a(byte param0, lu param1) {
        int var4 = 0;
        pp var5 = null;
        lu stackIn_5_0 = null;
        lu stackIn_6_0 = null;
        lu stackIn_7_0 = null;
        int stackIn_7_1 = 0;
        lu stackIn_11_0 = null;
        lu stackIn_12_0 = null;
        lu stackIn_13_0 = null;
        int stackIn_13_1 = 0;
        lu stackOut_10_0 = null;
        lu stackOut_12_0 = null;
        int stackOut_12_1 = 0;
        lu stackOut_11_0 = null;
        int stackOut_11_1 = 0;
        lu stackOut_4_0 = null;
        lu stackOut_6_0 = null;
        int stackOut_6_1 = 0;
        lu stackOut_5_0 = null;
        int stackOut_5_1 = 0;
        var4 = BachelorFridge.field_y;
        if (param0 > -12) {
          l.d((byte) -18);
          param1.b(((l) this).field_k, -125);
          param1.d(((l) this).field_o.g(0), 0);
          var5 = (pp) (Object) ((l) this).field_o.b((byte) 90);
          L0: while (true) {
            if (var5 != null) {
              var5.a(param1, (byte) -54);
              var5 = (pp) (Object) ((l) this).field_o.c(0);
              continue L0;
            } else {
              L1: {
                stackOut_10_0 = (lu) param1;
                stackIn_12_0 = stackOut_10_0;
                stackIn_11_0 = stackOut_10_0;
                if (!((l) this).field_p) {
                  stackOut_12_0 = (lu) (Object) stackIn_12_0;
                  stackOut_12_1 = 0;
                  stackIn_13_0 = stackOut_12_0;
                  stackIn_13_1 = stackOut_12_1;
                  break L1;
                } else {
                  stackOut_11_0 = (lu) (Object) stackIn_11_0;
                  stackOut_11_1 = 1;
                  stackIn_13_0 = stackOut_11_0;
                  stackIn_13_1 = stackOut_11_1;
                  break L1;
                }
              }
              ((lu) (Object) stackIn_13_0).d(stackIn_13_1, 0);
              return;
            }
          }
        } else {
          param1.b(((l) this).field_k, -125);
          param1.d(((l) this).field_o.g(0), 0);
          var5 = (pp) (Object) ((l) this).field_o.b((byte) 90);
          L2: while (true) {
            if (var5 == null) {
              L3: {
                stackOut_4_0 = (lu) param1;
                stackIn_6_0 = stackOut_4_0;
                stackIn_5_0 = stackOut_4_0;
                if (!((l) this).field_p) {
                  stackOut_6_0 = (lu) (Object) stackIn_6_0;
                  stackOut_6_1 = 0;
                  stackIn_7_0 = stackOut_6_0;
                  stackIn_7_1 = stackOut_6_1;
                  break L3;
                } else {
                  stackOut_5_0 = (lu) (Object) stackIn_5_0;
                  stackOut_5_1 = 1;
                  stackIn_7_0 = stackOut_5_0;
                  stackIn_7_1 = stackOut_5_1;
                  break L3;
                }
              }
              ((lu) (Object) stackIn_7_0).d(stackIn_7_1, 0);
              return;
            } else {
              var5.a(param1, (byte) -54);
              var5 = (pp) (Object) ((l) this).field_o.c(0);
              continue L2;
            }
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_s = "This option cannot be combined with the current '<%0>' setting.";
        field_q = "Start Game";
    }
}
