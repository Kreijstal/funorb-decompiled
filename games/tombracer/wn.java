/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wn extends nv {
    static String field_n;
    private int field_o;

    wn(la param0, kh param1, boolean param2) {
        super(param0, param1, param2);
        ((wn) this).field_o = param1.b((byte) 44, 4);
    }

    final int a(int param0, int param1) {
        if (param1 > -48) {
            field_n = null;
        }
        return param0;
    }

    public final void m(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        fsa stackIn_5_0 = null;
        int stackIn_5_1 = 0;
        fsa stackIn_6_0 = null;
        int stackIn_6_1 = 0;
        fsa stackIn_7_0 = null;
        int stackIn_7_1 = 0;
        int stackIn_7_2 = 0;
        fsa stackOut_4_0 = null;
        int stackOut_4_1 = 0;
        fsa stackOut_6_0 = null;
        int stackOut_6_1 = 0;
        int stackOut_6_2 = 0;
        fsa stackOut_5_0 = null;
        int stackOut_5_1 = 0;
        int stackOut_5_2 = 0;
        L0: {
          var4 = TombRacer.field_G ? 1 : 0;
          super.m(115);
          var2 = 81 % ((28 - param0) / 49);
          var3 = ((wn) this).field_o;
          if (var3 == 0) {
            ((wn) this).field_g.v((byte) 109);
            break L0;
          } else {
            if ((var3 ^ -1) != -2) {
              break L0;
            } else {
              L1: {
                stackOut_4_0 = ((wn) this).field_g;
                stackOut_4_1 = 17;
                stackIn_6_0 = stackOut_4_0;
                stackIn_6_1 = stackOut_4_1;
                stackIn_5_0 = stackOut_4_0;
                stackIn_5_1 = stackOut_4_1;
                if (((wn) this).field_g.z((byte) 90)) {
                  stackOut_6_0 = (fsa) (Object) stackIn_6_0;
                  stackOut_6_1 = stackIn_6_1;
                  stackOut_6_2 = 0;
                  stackIn_7_0 = stackOut_6_0;
                  stackIn_7_1 = stackOut_6_1;
                  stackIn_7_2 = stackOut_6_2;
                  break L1;
                } else {
                  stackOut_5_0 = (fsa) (Object) stackIn_5_0;
                  stackOut_5_1 = stackIn_5_1;
                  stackOut_5_2 = 1;
                  stackIn_7_0 = stackOut_5_0;
                  stackIn_7_1 = stackOut_5_1;
                  stackIn_7_2 = stackOut_5_2;
                  break L1;
                }
              }
              ((fsa) (Object) stackIn_7_0).b((byte) stackIn_7_1, stackIn_7_2 != 0);
              break L0;
            }
          }
        }
    }

    final int a(boolean param0) {
        if (param0) {
            return -85;
        }
        return 14;
    }

    final void a(boolean param0, kh param1) {
        super.a(param0, param1);
        param1.a((byte) -125, ((wn) this).field_o, 4);
    }

    final void a(boolean param0, fsa param1) {
        if (!param0) {
            Object var4 = null;
            ((wn) this).a(true, (fsa) null);
        }
        super.a(param0, param1);
        ((wn) this).field_f = false;
    }

    public static void b(int param0) {
        if (param0 < 120) {
            return;
        }
        field_n = null;
    }

    final static hra a(int param0, String param1) {
        int var5 = 0;
        String var6_ref_String = null;
        hra var7 = null;
        int var8 = TombRacer.field_G ? 1 : 0;
        int var2 = param1.length();
        if (!(var2 != 0)) {
            return is.field_wb;
        }
        if (!(255 >= var2)) {
            return rg.field_A;
        }
        String[] var3 = rga.a(32287, param1, '.');
        if (!((var3.length ^ -1) <= -3)) {
            return is.field_wb;
        }
        String[] var4 = var3;
        for (var5 = 0; var5 < var4.length; var5++) {
            var6_ref_String = var4[var5];
            var7 = kua.a(var6_ref_String, -6962);
            if (var7 != null) {
                return var7;
            }
        }
        int var6 = -62 / ((param0 - -53) / 56);
        return qh.a(-58, var3[var3.length + -1]);
    }

    final void k(int param0) {
        if (param0 != 5418) {
            Object var3 = null;
            hra discarded$0 = wn.a(-40, (String) null);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_n = "Press TAB to chat or F10 to open Quick Chat.";
    }
}
