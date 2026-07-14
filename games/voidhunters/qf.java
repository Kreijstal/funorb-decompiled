/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qf extends rqa {
    static kb field_o;

    final nc a(nc[] param0, int param1) {
        if (param1 > -119) {
            return null;
        }
        return new nc(jj.field_p);
    }

    qf(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    final static void a(int param0, byte param1) {
        ksa var2 = null;
        int var3 = 0;
        dnb var4 = null;
        var3 = VoidHunters.field_G;
        var4 = (dnb) (Object) ahb.field_o.d(0);
        if (param1 != -52) {
          field_o = null;
          L0: while (true) {
            if (var4 == null) {
              var2 = cnb.field_q.d(0);
              L1: while (true) {
                if (var2 != null) {
                  wva.b(param0, 22681);
                  var2 = cnb.field_q.a((byte) 54);
                  continue L1;
                } else {
                  return;
                }
              }
            } else {
              nv.a((byte) 88, var4, param0);
              var4 = (dnb) (Object) ahb.field_o.a((byte) 89);
              continue L0;
            }
          }
        } else {
          L2: while (true) {
            if (var4 == null) {
              var2 = cnb.field_q.d(0);
              L3: while (true) {
                if (var2 != null) {
                  wva.b(param0, 22681);
                  var2 = cnb.field_q.a((byte) 54);
                  continue L3;
                } else {
                  return;
                }
              }
            } else {
              nv.a((byte) 88, var4, param0);
              var4 = (dnb) (Object) ahb.field_o.a((byte) 89);
              continue L2;
            }
          }
        }
    }

    public static void a(int param0) {
        if (param0 < 26) {
            field_o = null;
            field_o = null;
            return;
        }
        field_o = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        uu discarded$0 = new uu();
        field_o = new kb(1);
    }
}
