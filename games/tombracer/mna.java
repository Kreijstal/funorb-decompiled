/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class mna {
    static jpa[] field_c;
    static String field_b;
    static int[] field_a;
    static int field_d;

    final static gqa a(byte param0, int param1, int param2, int param3) {
        boolean stackIn_44_0 = false;
        Object var4;
        int var5;
        int var6;
        int var7;
        int var8;
        int var9;
        int var10;
        int var11_int;
        String var11;
        String var12;
        int var13;
        int var14;
        gqa var15;
        gqa var16;
        int var7Lifetime1;
        int var8Lifetime1;
        int var8Lifetime2;
        var14 = TombRacer.field_G ? 1 : 0;
        ne.field_d.field_tb.field_J.d(8);
        var4 = null;
        var5 = 0;
        var6 = 0;
        var7 = -1 + ara.field_xb;
        var8 = 116 / ((-27 - param0) / 50);
        while (var7 >= 0) {
          var15 = wea.field_d[var7];
          var10 = 0;
          if (!fua.field_g &&
            var5 < sd.field_K) {
            var11_int = gda.a(var15.field_d, -20011);
            if (var15.a(false) >= var11_int && (var15.field_m ||
              !qaa.a(2180, var15.field_j))) {
              var10 = 1;
            }
          }
          if (var10 == 0) {
            var15.field_l = null;
          } else {
            if (var15.field_l != null &&
              !ce.field_B) {
              var5++;
            } else {
              if (var15.field_l == null) {
              }
              var11 = moa.a(var15, 94);
              var12 = var11 + il.c(var15.field_f);
              var13 = uaa.a((byte) -116, var15);
              var15.field_l = new jea(0L, bn.field_t, var12);
              var6 = var6 + param2;
              var15.field_l.field_ab = ((bn.field_t.field_ab & 16711422) >> 1) + var13 - (8355711 & var13 >> 1);
              var15.field_l.field_H = lpa.field_s;
              var15.field_l.field_ib = var13;
              var15.field_l.field_N = -(var13 >> 1 & 8355711) + var13 + ((16711422 & bn.field_t.field_N) >> 1);
              var5++;
            }
          }
          var7--;
        }
        var7Lifetime1 = 0;
        for (var8Lifetime1 = 0; var8Lifetime1 < ara.field_xb; var8Lifetime1++) {
          var16 = wea.field_d[var8Lifetime1];
          if (null != var16.field_l) {
            ne.field_d.field_tb.b(-125, var16.field_l);
            var16.field_l.a(var16.field_l.b((byte) 69), param2, -23776, var7Lifetime1, param3);
            if (var16.field_l.field_y != 0) {
              var4 = var16;
            }
            var7Lifetime1 = var7Lifetime1 + param2;
          }
        }
        var8Lifetime2 = ne.field_d.field_tb.field_t + (ne.field_d.field_tb.field_O + (-var7Lifetime1 + var6));
        ne.field_d.field_tb.field_t = ne.field_d.field_tb.field_t - var8Lifetime2;
        ne.field_d.field_tb.field_T = ne.field_d.field_tb.field_T + var8Lifetime2;
        if (ce.field_B) {
          ne.field_d.field_tb.field_t = var7Lifetime1;
        }
        if (ce.field_B) {
          voa.field_v = true;
          ne.field_d.field_tb.field_T = -ne.field_d.field_tb.field_t + ne.field_d.field_vb.field_t;
          ne.field_d.field_tb.field_K = 0;
          ce.field_B = false;
        }
        ne.field_d.field_tb.field_O = var7Lifetime1 - ne.field_d.field_tb.field_t;
        if (ni.field_c &&
          null != wi.field_s) {
          voa.field_v = true;
        }
        var9 = -ne.field_d.field_tb.field_O - (ne.field_d.field_tb.field_t - ne.field_d.field_vb.field_t);
        if (voa.field_v) {
          ne.field_d.field_tb.field_K = -ne.field_d.field_tb.field_T + var9;
        }
        ne.field_d.b(true, 0, param1 * param2 * 2, param2);
        stackIn_44_0 = (var9 == ne.field_d.field_tb.field_K + ne.field_d.field_tb.field_T);
        voa.field_v = stackIn_44_0;
        return (gqa) (var4);
    }

    final static g a(int param0, int param1) {
        int var3 = 0;
        g[] var2;
        g var4;
        int var5;
        g[] var6;
        var5 = TombRacer.field_G ? 1 : 0;
        var6 = sja.field_i;
        var2 = var6;
        for (var3 = param0; var6.length > var3; var3++) {
          var4 = var6[var3];
          if (var4.field_f == param1) {
            return var4;
          }
        }
        return null;
    }

    public static void a(boolean param0) {
        field_c = null;
        field_b = null;
        field_a = null;
        if (param0) {
          mna.a(false);
        }
    }

    static {
        field_b = "Join <%0>'s game";
        field_a = new int[]{0, 28, 21};
    }
}
