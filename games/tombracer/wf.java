/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wf extends vg {
    static jea field_g;
    private int field_i;
    private int field_h;
    private int field_f;

    private final boolean b(int param0) {
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        if (param0 < 96) {
          L0: {
            this.d(-115);
            if (-7 >= ((wf) this).field_f) {
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
            if (-7 <= ((wf) this).field_f) {
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

    public static void a(int param0) {
        field_g = null;
        if (param0 != 2907) {
            field_g = null;
        }
    }

    final void a(int param0, kh param1) {
        param1.a((byte) 2, ((wf) this).field_f, 4);
        if (param0 != -29928) {
          boolean discarded$2 = this.b(-112);
          param1.a((byte) -5, ((wf) this).field_h / 50, 6);
          return;
        } else {
          param1.a((byte) -5, ((wf) this).field_h / 50, 6);
          return;
        }
    }

    private final void d(int param0) {
        if (param0 != 100) {
            return;
        }
        ((wf) this).field_i = ((wf) this).field_h;
    }

    final int a(byte param0) {
        if (param0 != 91) {
            ((wf) this).field_f = -58;
            return ((wf) this).field_f;
        }
        return ((wf) this).field_f;
    }

    final boolean b(byte param0) {
        int var2 = 0;
        var2 = -122 % ((7 - param0) / 52);
        if (-1 > ((wf) this).field_h) {
          if (-1 < ((wf) this).field_i) {
            return false;
          } else {
            return true;
          }
        } else {
          return false;
        }
    }

    final void c(int param0) {
        ((wf) this).field_i = ((wf) this).field_i - 1;
        if (param0 != -9) {
            field_g = null;
        }
    }

    final wf e(int param0) {
        Object var3 = null;
        if (param0 != -1) {
          var3 = null;
          boolean discarded$2 = ((wf) this).a((byte) -15, (hca) null);
          return new wf(((wf) this).field_f, ((wf) this).field_h);
        } else {
          return new wf(((wf) this).field_f, ((wf) this).field_h);
        }
    }

    private wf(int param0, int param1) {
        ((wf) this).field_h = 100;
        ((wf) this).field_f = param0;
        ((wf) this).field_h = param1;
        this.d(100);
    }

    final boolean a(byte param0, hca param1) {
        int var3 = 0;
        if (this.b(97)) {
          return false;
        } else {
          var3 = ((wf) this).field_f;
          if (6 != var3) {
            var3 = -41 % ((param0 - 43) / 44);
            return true;
          } else {
            var3 = -41 % ((param0 - 43) / 44);
            return true;
          }
        }
    }

    wf(la param0, kh param1) {
        ((wf) this).field_h = 100;
        ((wf) this).field_f = param1.b((byte) 44, 4);
        if (-9 > (param0.field_E ^ -1)) {
            ((wf) this).field_h = 50 * param1.b((byte) 44, 6);
        } else {
            ((wf) this).field_h = 100;
        }
        this.d(100);
    }

    static {
    }
}
