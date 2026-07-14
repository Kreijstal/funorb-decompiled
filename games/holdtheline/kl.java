/*
 * Decompiled by CFR-JS 0.4.0.
 */
class kl extends dk {
    static String[] field_r;
    static jn field_q;
    static ib field_v;
    static oa field_t;
    static uj[] field_s;
    static String field_u;

    public final void a(boolean param0, int param1, int param2, n param3, int param4) {
        if (param2 >= -48) {
          L0: {
            field_s = null;
            if (param0) {
              tn.a(param1 + param3.field_k, param3.field_x, 152, param4 + param3.field_o, param3.field_u);
              break L0;
            } else {
              break L0;
            }
          }
          super.a(param0, param1, -106, param3, param4);
          return;
        } else {
          L1: {
            if (param0) {
              tn.a(param1 + param3.field_k, param3.field_x, 152, param4 + param3.field_o, param3.field_u);
              break L1;
            } else {
              break L1;
            }
          }
          super.a(param0, param1, -106, param3, param4);
          return;
        }
    }

    kl(int param0) {
        this(hl.field_g, param0);
    }

    kl(qi param0, int param1) {
        super(param0, 4, 2, 2, 2, param1, -1, 0, 1, param0.field_G, -1, 2147483647, false);
    }

    public static void c(boolean param0) {
        field_t = null;
        field_s = null;
        field_q = null;
        field_r = null;
        field_u = null;
        field_v = null;
        if (!param0) {
            field_q = null;
        }
    }

    final static nd a(boolean param0, int param1) {
        nd var2 = null;
        nd stackIn_2_0 = null;
        nd stackIn_3_0 = null;
        nd stackIn_4_0 = null;
        int stackIn_4_1 = 0;
        nd stackIn_6_0 = null;
        nd stackIn_7_0 = null;
        nd stackIn_8_0 = null;
        int stackIn_8_1 = 0;
        nd stackOut_5_0 = null;
        nd stackOut_7_0 = null;
        int stackOut_7_1 = 0;
        nd stackOut_6_0 = null;
        int stackOut_6_1 = 0;
        nd stackOut_1_0 = null;
        nd stackOut_3_0 = null;
        int stackOut_3_1 = 0;
        nd stackOut_2_0 = null;
        int stackOut_2_1 = 0;
        var2 = new nd(true);
        if (param1 != 0) {
          L0: {
            field_r = null;
            stackOut_5_0 = (nd) var2;
            stackIn_7_0 = stackOut_5_0;
            stackIn_6_0 = stackOut_5_0;
            if (!param0) {
              stackOut_7_0 = (nd) (Object) stackIn_7_0;
              stackOut_7_1 = 0;
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              break L0;
            } else {
              stackOut_6_0 = (nd) (Object) stackIn_6_0;
              stackOut_6_1 = 1;
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              break L0;
            }
          }
          stackIn_8_0.field_i = stackIn_8_1 != 0;
          return var2;
        } else {
          L1: {
            stackOut_1_0 = (nd) var2;
            stackIn_3_0 = stackOut_1_0;
            stackIn_2_0 = stackOut_1_0;
            if (!param0) {
              stackOut_3_0 = (nd) (Object) stackIn_3_0;
              stackOut_3_1 = 0;
              stackIn_4_0 = stackOut_3_0;
              stackIn_4_1 = stackOut_3_1;
              break L1;
            } else {
              stackOut_2_0 = (nd) (Object) stackIn_2_0;
              stackOut_2_1 = 1;
              stackIn_4_0 = stackOut_2_0;
              stackIn_4_1 = stackOut_2_1;
              break L1;
            }
          }
          stackIn_4_0.field_i = stackIn_4_1 != 0;
          return var2;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_r = new String[]{"Loading text", "Lade Text", "Chargement du texte", "Carregando textos", "Tekst laden", "Cargando texto"};
        field_q = new jn(1);
    }
}
