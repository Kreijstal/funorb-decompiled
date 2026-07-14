/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bla extends eca {
    private String field_g;
    private boolean field_h;
    private vqa field_f;

    final static boolean a(int param0, boolean param1, int param2) {
        int stackIn_4_0 = 0;
        int stackIn_5_0 = 0;
        int stackIn_6_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_7_1 = 0;
        int stackIn_11_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_14_0 = 0;
        int stackIn_14_1 = 0;
        int stackOut_10_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_13_1 = 0;
        int stackOut_12_0 = 0;
        int stackOut_12_1 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_6_1 = 0;
        int stackOut_5_0 = 0;
        int stackOut_5_1 = 0;
        if (param1) {
          L0: {
            boolean discarded$13 = bla.a(126, true, -36);
            if (0 == (24 & param0)) {
              stackOut_10_0 = 0;
              stackIn_11_0 = stackOut_10_0;
              break L0;
            } else {
              stackOut_9_0 = 1;
              stackIn_11_0 = stackOut_9_0;
              break L0;
            }
          }
          L1: {
            stackOut_11_0 = stackIn_11_0;
            stackIn_13_0 = stackOut_11_0;
            stackIn_12_0 = stackOut_11_0;
            if ((544 & param0) != 544) {
              stackOut_13_0 = stackIn_13_0;
              stackOut_13_1 = 0;
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              break L1;
            } else {
              stackOut_12_0 = stackIn_12_0;
              stackOut_12_1 = 1;
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              break L1;
            }
          }
          return (stackIn_14_0 | stackIn_14_1) != 0;
        } else {
          L2: {
            if (0 == (24 & param0)) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              break L2;
            } else {
              stackOut_2_0 = 1;
              stackIn_4_0 = stackOut_2_0;
              break L2;
            }
          }
          L3: {
            stackOut_4_0 = stackIn_4_0;
            stackIn_6_0 = stackOut_4_0;
            stackIn_5_0 = stackOut_4_0;
            if ((544 & param0) != 544) {
              stackOut_6_0 = stackIn_6_0;
              stackOut_6_1 = 0;
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              break L3;
            } else {
              stackOut_5_0 = stackIn_5_0;
              stackOut_5_1 = 1;
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              break L3;
            }
          }
          return (stackIn_7_0 | stackIn_7_1) != 0;
        }
    }

    final qrb a(String param0, int param1) {
        ge var3 = null;
        if (((bla) this).field_f.a(param0, param1) == cca.field_o) {
            return cca.field_o;
        }
        if (!(param0.equals((Object) (Object) ((bla) this).field_g))) {
            var3 = psb.a(param0, param1 ^ 16384);
            if (!(var3.a(4))) {
                return dsa.field_q;
            }
            ((bla) this).field_g = param0;
            ((bla) this).field_h = var3.b((byte) -20);
        }
        return ((bla) this).field_h ? lea.field_o : cca.field_o;
    }

    final String b(String param0, int param1) {
        if (((bla) this).field_f.a(param0, 16384) == cca.field_o) {
          return ((bla) this).field_f.b(param0, -1);
        } else {
          if (((bla) this).a(param0, 16384) == cca.field_o) {
            return qh.field_N;
          } else {
            if (param1 != -1) {
              ((bla) this).field_g = null;
              return bqa.field_f;
            } else {
              return bqa.field_f;
            }
          }
        }
    }

    bla(uf param0, uf param1) {
        super(param0);
        ((bla) this).field_g = "";
        ((bla) this).field_h = false;
        ((bla) this).field_f = new vqa(param0, param1);
    }

    static {
    }
}
