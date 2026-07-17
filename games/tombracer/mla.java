/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mla {
    static int field_a;

    public final String toString() {
        throw new IllegalStateException();
    }

    final boolean a(int param0) {
        int stackIn_4_0 = 0;
        int stackIn_5_0 = 0;
        int stackIn_6_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_7_1 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_6_1 = 0;
        int stackOut_5_0 = 0;
        int stackOut_5_1 = 0;
        if (param0 >= -22) {
          return false;
        } else {
          L0: {
            if ((Object) (Object) coa.field_s != this) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              break L0;
            } else {
              stackOut_2_0 = 1;
              stackIn_4_0 = stackOut_2_0;
              break L0;
            }
          }
          L1: {
            stackOut_4_0 = stackIn_4_0;
            stackIn_6_0 = stackOut_4_0;
            stackIn_5_0 = stackOut_4_0;
            if (this != (Object) (Object) cha.field_d) {
              stackOut_6_0 = stackIn_6_0;
              stackOut_6_1 = 0;
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              break L1;
            } else {
              stackOut_5_0 = stackIn_5_0;
              stackOut_5_1 = 1;
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              break L1;
            }
          }
          return (stackIn_7_0 | stackIn_7_1) != 0;
        }
    }

    final static void a(int param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        kh var5 = null;
        kh var6 = null;
        if (param1 >= -83) {
          mla.a(-5, 33);
          var5 = ql.field_k;
          var5.k(param0, -2988);
          var5.field_h = var5.field_h + 1;
          var3 = var5.field_h;
          var5.i(5, 0);
          var5.i(uu.field_a.field_Jb, 0);
          var4 = (uu.field_a.field_yb << 6) + uu.field_a.field_cc;
          var5.i(var4, 0);
          var5.a(0, uu.field_a.field_ac, uu.field_a.field_ac.length, 121);
          var5.d(var5.field_h - var3, (byte) -97);
          return;
        } else {
          var6 = ql.field_k;
          var6.k(param0, -2988);
          var6.field_h = var6.field_h + 1;
          var3 = var6.field_h;
          var6.i(5, 0);
          var6.i(uu.field_a.field_Jb, 0);
          var4 = (uu.field_a.field_yb << 6) + uu.field_a.field_cc;
          var6.i(var4, 0);
          var6.a(0, uu.field_a.field_ac, uu.field_a.field_ac.length, 121);
          var6.d(var6.field_h - var3, (byte) -97);
          return;
        }
    }

    static {
    }
}
