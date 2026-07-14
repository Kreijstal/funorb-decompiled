/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class wca extends od {
    int field_q;
    int field_p;
    static int[] field_l;
    int field_k;
    int field_o;
    int field_n;
    int field_m;

    public static void f(int param0) {
        if (param0 != 0) {
            wca.a(18);
            field_l = null;
            return;
        }
        field_l = null;
    }

    final static void a(int param0) {
        rm.field_a = (mfa) (Object) new wu();
        vha.field_c = (pma) (Object) new rn();
        if (param0 != -18035) {
          field_l = null;
          dea.field_a = (mb) (Object) new gva();
          return;
        } else {
          dea.field_a = (mb) (Object) new gva();
          return;
        }
    }

    final static void a(int param0, iu[] param1, int param2, int param3, int param4, int param5) {
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        L0: {
          var11 = TombRacer.field_G ? 1 : 0;
          if (param1 == null) {
            break L0;
          } else {
            if (0 < param5) {
              var6 = param1[0].field_n;
              var7 = param1[2].field_n;
              var8 = param1[1].field_n;
              param1[0].d(param4, param2, param0);
              param1[2].d(param4 - (-param5 - -var7), param2, param0);
              bea.b(ic.field_d);
              bea.g(var6 + param4, param2, -var7 + param4 + param5, param2 + param1[1].field_k);
              var9 = param4 + var6;
              var10 = -var7 + param4 + param5;
              param4 = var9;
              L1: while (true) {
                if (param4 >= var10) {
                  if (param3 == 20278) {
                    bea.a(ic.field_d);
                    return;
                  } else {
                    field_l = null;
                    bea.a(ic.field_d);
                    return;
                  }
                } else {
                  param1[1].d(param4, param2, param0);
                  param4 = param4 + var8;
                  continue L1;
                }
              }
            } else {
              break L0;
            }
          }
        }
    }

    wca() {
    }

    static {
    }
}
