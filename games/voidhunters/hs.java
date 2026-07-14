/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hs extends rqa {
    final static void a(int param0, int param1, int param2, boolean param3, int param4, int param5, String param6, int param7) {
        da stackIn_6_0 = null;
        int stackIn_6_1 = 0;
        int stackIn_6_2 = 0;
        int stackIn_6_3 = 0;
        da stackIn_7_0 = null;
        int stackIn_7_1 = 0;
        int stackIn_7_2 = 0;
        int stackIn_7_3 = 0;
        da stackIn_8_0 = null;
        int stackIn_8_1 = 0;
        int stackIn_8_2 = 0;
        int stackIn_8_3 = 0;
        int stackIn_8_4 = 0;
        da stackOut_5_0 = null;
        int stackOut_5_1 = 0;
        int stackOut_5_2 = 0;
        int stackOut_5_3 = 0;
        da stackOut_7_0 = null;
        int stackOut_7_1 = 0;
        int stackOut_7_2 = 0;
        int stackOut_7_3 = 0;
        int stackOut_7_4 = 0;
        da stackOut_6_0 = null;
        int stackOut_6_1 = 0;
        int stackOut_6_2 = 0;
        int stackOut_6_3 = 0;
        int stackOut_6_4 = 0;
        if (255 <= param2) {
          woa.a(param4, param1, param0, (byte) 74, param5, param7, param6);
          return;
        } else {
          L0: {
            if (li.field_i) {
              L1: {
                stackOut_5_0 = nma.field_b[param7];
                stackOut_5_1 = param5;
                stackOut_5_2 = param1;
                stackOut_5_3 = param2 << 703025464 | param4;
                stackIn_7_0 = stackOut_5_0;
                stackIn_7_1 = stackOut_5_1;
                stackIn_7_2 = stackOut_5_2;
                stackIn_7_3 = stackOut_5_3;
                stackIn_6_0 = stackOut_5_0;
                stackIn_6_1 = stackOut_5_1;
                stackIn_6_2 = stackOut_5_2;
                stackIn_6_3 = stackOut_5_3;
                if (param3) {
                  stackOut_7_0 = (da) (Object) stackIn_7_0;
                  stackOut_7_1 = stackIn_7_1;
                  stackOut_7_2 = stackIn_7_2;
                  stackOut_7_3 = stackIn_7_3;
                  stackOut_7_4 = 0;
                  stackIn_8_0 = stackOut_7_0;
                  stackIn_8_1 = stackOut_7_1;
                  stackIn_8_2 = stackOut_7_2;
                  stackIn_8_3 = stackOut_7_3;
                  stackIn_8_4 = stackOut_7_4;
                  break L1;
                } else {
                  stackOut_6_0 = (da) (Object) stackIn_6_0;
                  stackOut_6_1 = stackIn_6_1;
                  stackOut_6_2 = stackIn_6_2;
                  stackOut_6_3 = stackIn_6_3;
                  stackOut_6_4 = 1;
                  stackIn_8_0 = stackOut_6_0;
                  stackIn_8_1 = stackOut_6_1;
                  stackIn_8_2 = stackOut_6_2;
                  stackIn_8_3 = stackOut_6_3;
                  stackIn_8_4 = stackOut_6_4;
                  break L1;
                }
              }
              ((da) (Object) stackIn_8_0).a(stackIn_8_1, stackIn_8_2, stackIn_8_3, stackIn_8_4 != 0, param0, param6);
              break L0;
            } else {
              ita.a(param7, 7988).c(param6, param0, param1, param4, param5, param2);
              break L0;
            }
          }
          if (param3) {
            return;
          } else {
            return;
          }
        }
    }

    final static void a(ea param0, int param1, int param2) {
        faa var5 = dpa.field_p;
        var5.h(param1 + 24334, param2);
        var5.field_e = var5.field_e + 1;
        int var4 = var5.field_e;
        var5.c(0, param1);
        var5.c(param1 ^ 1, param0.field_e);
        var5.c(0, param0.field_g);
        var5.d(param0.field_i, param1 ^ 332614537);
        var5.d(param0.field_h, 332614536);
        var5.d(param0.field_l, param1 ^ 332614537);
        var5.d(param0.field_f, 332614536);
        int discarded$0 = var5.g(param1 ^ 1594, var4);
        var5.e(var5.field_e - var4, param1 + -130);
    }

    final nc a(nc[] param0, int param1) {
        Object var4 = null;
        if (param1 >= -119) {
          var4 = null;
          hs.a((ea) null, 4, -26);
          return new nc((Object) (Object) frb.a(129, 85));
        } else {
          return new nc((Object) (Object) frb.a(129, 85));
        }
    }

    hs(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    static {
    }
}
