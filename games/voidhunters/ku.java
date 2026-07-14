/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ku extends qg {
    static int field_c;
    static String field_d;

    public static void a(byte param0) {
        field_d = null;
        if (param0 <= 105) {
            Object var2 = null;
            boolean discarded$0 = ku.a((String) null, 66, (rq) null, true, -92, (String) null, (String) null);
        }
    }

    final void a(boolean param0, int param1) {
        Object var4 = null;
        if (param1 < 18) {
          var4 = null;
          ((ku) this).a(-92, (byte) 78, (pib) null);
          ((ku) this).field_b.c(32925, true);
          return;
        } else {
          ((ku) this).field_b.c(32925, true);
          return;
        }
    }

    ku(qfa param0) {
        super(param0);
    }

    final void a(int param0, byte param1, pib param2) {
        ((ku) this).field_b.a(80, param2);
        if (param1 != 125) {
          field_c = -10;
          ((ku) this).field_b.c(0, param0);
          return;
        } else {
          ((ku) this).field_b.c(0, param0);
          return;
        }
    }

    final static boolean a(String param0, int param1, rq param2, boolean param3, int param4, String param5, String param6) {
        sn var7 = null;
        Object var8 = null;
        sn var9 = null;
        int stackIn_6_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_4_0 = 0;
        if (dn.field_r == kla.field_d) {
          var9 = new sn(klb.field_r, param2);
          var7 = var9;
          klb.field_r.a(false, (shb) (Object) var9);
          if (ws.f(0)) {
            var9.e(false);
            if (param4 != 1) {
              var8 = null;
              boolean discarded$2 = ku.a((String) null, 104, (rq) null, true, 77, (String) null, (String) null);
              return true;
            } else {
              return true;
            }
          } else {
            L0: {
              dn.field_r = dw.field_c;
              bfa.field_p = param6;
              mqb.field_x = param0;
              iua.field_p = param1;
              cjb.field_b = null;
              tca.field_o = param5;
              if (!param3) {
                stackOut_5_0 = 0;
                stackIn_6_0 = stackOut_5_0;
                break L0;
              } else {
                stackOut_4_0 = 1;
                stackIn_6_0 = stackOut_4_0;
                break L0;
              }
            }
            jpa.field_a = stackIn_6_0 != 0;
            if (param4 != 1) {
              var8 = null;
              boolean discarded$3 = ku.a((String) null, 104, (rq) null, true, 77, (String) null, (String) null);
              return true;
            } else {
              return true;
            }
          }
        } else {
          return false;
        }
    }

    final void a(int param0) {
        ((ku) this).field_b.c(32925, false);
        if (param0 != 5890) {
            Object var3 = null;
            boolean discarded$0 = ku.a((String) null, -94, (rq) null, true, -26, (String) null, (String) null);
        }
    }

    final void a(int param0, int param1, int param2) {
        if (param1 != -25139) {
            ((ku) this).a(true, true);
        }
    }

    final boolean b(int param0) {
        if (param0 > -87) {
            field_c = -126;
            return true;
        }
        return true;
    }

    final void a(boolean param0, boolean param1) {
        if (!param0) {
            ku.a((byte) -82);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = 1;
    }
}
