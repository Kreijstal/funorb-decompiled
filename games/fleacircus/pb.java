/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pb {
    static vc field_f;
    static String field_b;
    static String field_h;
    static fa field_e;
    static rh field_a;
    static int field_i;
    static int field_d;
    static dd field_g;
    static dd field_c;

    final static void a(int param0, int param1) {
        int var3 = 0;
        Object var4 = null;
        bh var4_ref = null;
        ll var5 = null;
        var4 = null;
        var3 = fleas.field_A ? 1 : 0;
        if (param1 == 0) {
          var4_ref = (bh) (Object) wi.field_j.c((byte) 47);
          L0: while (true) {
            if (var4_ref == null) {
              var5 = (ll) (Object) jj.field_S.c((byte) 47);
              L1: while (true) {
                if (var5 == null) {
                  return;
                } else {
                  ak.a(-14722, var5, param0);
                  var5 = (ll) (Object) jj.field_S.b((byte) -105);
                  continue L1;
                }
              }
            } else {
              s.a(param1 ^ -4471, param0, var4_ref);
              var4_ref = (bh) (Object) wi.field_j.b((byte) -105);
              continue L0;
            }
          }
        } else {
          field_b = null;
          var4_ref = (bh) (Object) wi.field_j.c((byte) 47);
          L2: while (true) {
            if (var4_ref == null) {
              var5 = (ll) (Object) jj.field_S.c((byte) 47);
              L3: while (true) {
                if (var5 == null) {
                  return;
                } else {
                  ak.a(-14722, var5, param0);
                  var5 = (ll) (Object) jj.field_S.b((byte) -105);
                  continue L3;
                }
              }
            } else {
              s.a(param1 ^ -4471, param0, var4_ref);
              var4_ref = (bh) (Object) wi.field_j.b((byte) -105);
              continue L2;
            }
          }
        }
    }

    final static void b(byte param0) {
        int var1 = 0;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        var4 = fleas.field_A ? 1 : 0;
        var1 = ed.field_c[0];
        if (param0 <= 42) {
          return;
        } else {
          var2 = 1;
          L0: while (true) {
            if (ed.field_c.length <= var2) {
              return;
            } else {
              var3 = ed.field_c[var2];
              dm.a(pk.field_J, var2 << 800311396, pk.field_J, var1, var3);
              var1 = var1 + var3;
              var2++;
              continue L0;
            }
          }
        }
    }

    public static void a(byte param0) {
        field_f = null;
        field_a = null;
        field_b = null;
        field_h = null;
        field_g = null;
        field_e = null;
        field_c = null;
        if (param0 >= -80) {
            field_c = null;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = "Creating your account";
        field_d = 0;
        field_h = "Tiles you can place";
        field_i = 100;
        field_f = new vc();
    }
}
