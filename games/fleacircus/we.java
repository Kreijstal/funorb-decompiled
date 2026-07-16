/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class we {
    static int field_c;
    private lh field_a;
    private vc field_b;

    final static void a(int param0, int param1) {
        hd.field_c = param0 * 100 / 150;
        hd.field_g = param0 * 400 / 150;
        int var2 = 115 % ((-69 - param1) / 53);
        hd.field_b = (param0 << 15433904) / 150;
    }

    final lh b(int param0) {
        lh var2 = ((we) this).field_b.field_e.field_h;
        int var3 = -111 / ((-1 - param0) / 58);
        if (!(((we) this).field_b.field_e != var2)) {
            ((we) this).field_a = null;
            return null;
        }
        ((we) this).field_a = var2.field_h;
        return var2;
    }

    final lh a(byte param0, lh param1) {
        lh var3 = null;
        int var4 = 0;
        L0: {
          var4 = -117 % ((param0 - 66) / 60);
          if (param1 != null) {
            var3 = param1;
            break L0;
          } else {
            var3 = ((we) this).field_b.field_e.field_h;
            break L0;
          }
        }
        if (((we) this).field_b.field_e == var3) {
          ((we) this).field_a = null;
          return null;
        } else {
          ((we) this).field_a = var3.field_h;
          return var3;
        }
    }

    final lh a(byte param0) {
        lh var2 = null;
        var2 = ((we) this).field_b.field_e.field_a;
        if (((we) this).field_b.field_e == var2) {
          ((we) this).field_a = null;
          return null;
        } else {
          ((we) this).field_a = var2.field_a;
          if (param0 != 106) {
            lh discarded$2 = ((we) this).a(true);
            return var2;
          } else {
            return var2;
          }
        }
    }

    final static void a(int param0) {
        uh var1 = null;
        L0: {
          var1 = (uh) (Object) fk.field_z.a((byte) -60);
          if (var1 == null) {
            var1 = new uh();
            break L0;
          } else {
            break L0;
          }
        }
        var1.a(3, gb.field_a, gb.field_l, gb.field_k, gb.field_h, gb.field_i, gb.field_b, gb.field_d);
        fg.field_t.a(false, (lh) (Object) var1);
        if (param0 >= -56) {
          field_c = 106;
          return;
        } else {
          return;
        }
    }

    final lh c(int param0) {
        lh var2 = null;
        var2 = ((we) this).field_a;
        if (((we) this).field_b.field_e != var2) {
          if (param0 != -6144) {
            ((we) this).field_a = null;
            ((we) this).field_a = var2.field_h;
            return var2;
          } else {
            ((we) this).field_a = var2.field_h;
            return var2;
          }
        } else {
          ((we) this).field_a = null;
          return null;
        }
    }

    final lh b(byte param0, lh param1) {
        lh var3 = null;
        if (param1 == null) {
            var3 = ((we) this).field_b.field_e.field_a;
        } else {
            var3 = param1;
        }
        if (param0 >= -107) {
            ((we) this).field_a = null;
            if (!(((we) this).field_b.field_e != var3)) {
                ((we) this).field_a = null;
                return null;
            }
            ((we) this).field_a = var3.field_a;
            return var3;
        }
        if (!(((we) this).field_b.field_e != var3)) {
            ((we) this).field_a = null;
            return null;
        }
        ((we) this).field_a = var3.field_a;
        return var3;
    }

    final lh a(boolean param0) {
        lh var2 = null;
        if (!param0) {
            ((we) this).field_b = null;
            var2 = ((we) this).field_a;
            if (!(var2 != ((we) this).field_b.field_e)) {
                ((we) this).field_a = null;
                return null;
            }
            ((we) this).field_a = var2.field_a;
            return var2;
        }
        var2 = ((we) this).field_a;
        if (!(var2 != ((we) this).field_b.field_e)) {
            ((we) this).field_a = null;
            return null;
        }
        ((we) this).field_a = var2.field_a;
        return var2;
    }

    final static int a(byte param0, int param1) {
        int var2 = 0;
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        var2 = 71 / ((param0 - 0) / 55);
        param1 = param1 & 8191;
        if (4096 <= param1) {
          L0: {
            if ((param1 ^ -1) <= -6145) {
              stackOut_7_0 = dk.field_D[param1 + -6144];
              stackIn_8_0 = stackOut_7_0;
              break L0;
            } else {
              stackOut_6_0 = -dk.field_D[-param1 + 6144];
              stackIn_8_0 = stackOut_6_0;
              break L0;
            }
          }
          return stackIn_8_0;
        } else {
          L1: {
            if (param1 >= 2048) {
              stackOut_3_0 = -dk.field_D[param1 + -2048];
              stackIn_4_0 = stackOut_3_0;
              break L1;
            } else {
              stackOut_2_0 = dk.field_D[-param1 + 2048];
              stackIn_4_0 = stackOut_2_0;
              break L1;
            }
          }
          return stackIn_4_0;
        }
    }

    we(vc param0) {
        ((we) this).field_b = param0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = 0;
    }
}
