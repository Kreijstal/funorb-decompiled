/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fja extends rqa {
    static int field_o;
    static String field_r;
    static caa[] field_q;
    static rq field_p;

    fja(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    public static void e(byte param0) {
        field_p = null;
        field_r = null;
        int var1 = 42 / ((param0 - 0) / 43);
        field_q = null;
    }

    final static fs[] a(int[] param0, int param1) {
        int var2 = 0;
        fs[] var3 = null;
        int var4 = 0;
        int var5 = 0;
        int stackIn_3_0 = 0;
        int stackIn_6_0 = 0;
        int stackOut_2_0 = 0;
        int stackOut_1_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_4_0 = 0;
        L0: {
          var5 = VoidHunters.field_G;
          if (param0[-1 + param0.length] != 0) {
            stackOut_2_0 = 0;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          } else {
            stackOut_1_0 = 1;
            stackIn_3_0 = stackOut_1_0;
            break L0;
          }
        }
        L1: {
          var2 = stackIn_3_0;
          if (var2 != 0) {
            stackOut_5_0 = param0.length;
            stackIn_6_0 = stackOut_5_0;
            break L1;
          } else {
            stackOut_4_0 = 1 + param0.length;
            stackIn_6_0 = stackOut_4_0;
            break L1;
          }
        }
        var3 = new fs[stackIn_6_0];
        var4 = 0;
        if (param1 == 2) {
          var4 = 0;
          L2: while (true) {
            if (param0.length <= var4) {
              if (var4 < var3.length) {
                var3[var4] = new fs(0, 2);
                return var3;
              } else {
                return var3;
              }
            } else {
              var3[var4] = new fs(param0[var4], 2);
              var4++;
              continue L2;
            }
          }
        } else {
          field_q = null;
          var4 = 0;
          L3: while (true) {
            if (param0.length <= var4) {
              if (var4 >= var3.length) {
                return var3;
              } else {
                var3[var4] = new fs(0, 2);
                return var3;
              }
            } else {
              var3[var4] = new fs(param0[var4], 2);
              var4++;
              continue L3;
            }
          }
        }
    }

    final static void a(int param0) {
        pca.field_i = new uj[13];
        pca.field_i[0] = (uj) (Object) new nfa();
        pca.field_i[1] = (uj) (Object) new rea();
        pca.field_i[2] = (uj) (Object) new mcb();
        if (param0 != 11) {
          fja.a(-61);
          pca.field_i[3] = (uj) (Object) new qsb();
          pca.field_i[4] = (uj) (Object) new gb();
          pca.field_i[5] = (uj) (Object) new uw();
          pca.field_i[6] = (uj) (Object) new vdb();
          pca.field_i[7] = (uj) (Object) new lg();
          pca.field_i[8] = (uj) (Object) new nnb();
          pca.field_i[9] = (uj) (Object) new kib();
          pca.field_i[10] = (uj) (Object) new pva();
          pca.field_i[11] = (uj) (Object) new fpa();
          pca.field_i[12] = (uj) (Object) new hka();
          return;
        } else {
          pca.field_i[3] = (uj) (Object) new qsb();
          pca.field_i[4] = (uj) (Object) new gb();
          pca.field_i[5] = (uj) (Object) new uw();
          pca.field_i[6] = (uj) (Object) new vdb();
          pca.field_i[7] = (uj) (Object) new lg();
          pca.field_i[8] = (uj) (Object) new nnb();
          pca.field_i[9] = (uj) (Object) new kib();
          pca.field_i[10] = (uj) (Object) new pva();
          pca.field_i[11] = (uj) (Object) new fpa();
          pca.field_i[12] = (uj) (Object) new hka();
          return;
        }
    }

    final nc a(nc[] param0, int param1) {
        if (param1 > -119) {
            return null;
        }
        return new nc((Object) (Object) frb.a(231, 107));
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_r = "Cancel";
        field_o = 50;
    }
}
