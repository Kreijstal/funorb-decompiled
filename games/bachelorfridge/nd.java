/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nd extends kj {
    static double field_j;
    static int field_h;
    static kv field_g;
    static sna field_i;
    private int field_f;

    final void a(int param0, int param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        var6 = BachelorFridge.field_y;
        var4 = 0;
        var5 = param1;
        if (((nd) this).field_f >= 10) {
          if (-51 >= (((nd) this).field_f ^ -1)) {
            var4 = 128 - ((nd) this).field_f * 12 - -588 << -993476639;
            var5 = 64 + -(6 * (((nd) this).field_f + -49)) << -39136799;
            uu.field_vb.a((127 + -var4 >> -1635176543) + param2, (-var5 + 64 + -1 >> -1060869919) + (param0 - 64), var4 + 1, 1 + var5);
            return;
          } else {
            var4 = 256;
            var5 = 128;
            uu.field_vb.a((127 + -var4 >> -1635176543) + param2, (-var5 + 64 + -1 >> -1060869919) + (param0 - 64), var4 + 1, 1 + var5);
            return;
          }
        } else {
          var5 = 6 * ((nd) this).field_f << -1149108671;
          var4 = ((nd) this).field_f * 12 << 750968865;
          uu.field_vb.a((127 + -var4 >> -1635176543) + param2, (-var5 + 64 + -1 >> -1060869919) + (param0 - 64), var4 + 1, 1 + var5);
          return;
        }
    }

    final void a(int param0, boolean param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        L0: {
          var6 = BachelorFridge.field_y;
          var4 = 0;
          if (param1) {
            break L0;
          } else {
            ((nd) this).a(-79, -76, -16);
            break L0;
          }
        }
        var5 = 0;
        if (-11 >= (((nd) this).field_f ^ -1)) {
          if (50 > ((nd) this).field_f) {
            var4 = 256;
            var5 = 128;
            uu.field_vb.a((128 + -var4 - 1 >> 2064960577) + param2, param0 + (-var5 + 63 >> -1098854143) - 64, 1 + var4, 1 + var5);
            return;
          } else {
            var5 = 64 - (((nd) this).field_f * 6 - 294) << 1487332673;
            var4 = -((((nd) this).field_f - 49) * 12) + 128 << -1619400575;
            uu.field_vb.a((128 + -var4 - 1 >> 2064960577) + param2, param0 + (-var5 + 63 >> -1098854143) - 64, 1 + var4, 1 + var5);
            return;
          }
        } else {
          var5 = ((nd) this).field_f * 6 << 3565185;
          var4 = ((nd) this).field_f * 12 << 1107296801;
          uu.field_vb.a((128 + -var4 - 1 >> 2064960577) + param2, param0 + (-var5 + 63 >> -1098854143) - 64, 1 + var4, 1 + var5);
          return;
        }
    }

    final boolean b(int param0) {
        int stackIn_4_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        if (param0 < 21) {
          boolean discarded$2 = ((nd) this).b(69);
          ((nd) this).field_f = ((nd) this).field_f + 1;
          if (60 > ((nd) this).field_f + 1) {
            return false;
          } else {
            return true;
          }
        } else {
          L0: {
            ((nd) this).field_f = ((nd) this).field_f + 1;
            if (60 <= ((nd) this).field_f + 1) {
              stackOut_3_0 = 1;
              stackIn_4_0 = stackOut_3_0;
              break L0;
            } else {
              stackOut_2_0 = 0;
              stackIn_4_0 = stackOut_2_0;
              break L0;
            }
          }
          return stackIn_4_0 != 0;
        }
    }

    nd(gj param0, int param1, int param2) {
        super(param0, param1, param2);
    }

    public static void a(boolean param0) {
        field_g = null;
        field_i = null;
        if (param0) {
            field_j = -0.9287268583469704;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_j = Math.atan2(1.0, 0.0);
        field_h = 0;
    }
}
