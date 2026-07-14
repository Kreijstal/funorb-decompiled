/*
 * Decompiled by CFR-JS 0.4.0.
 */
class gb extends fc {
    static aa field_n;
    gb field_j;
    gb field_k;
    long field_m;
    static int field_i;
    static qj[] field_l;

    final static void a(int param0, int param1) {
        fc var2 = null;
        int var3 = 0;
        ei var4 = null;
        var3 = TrackController.field_F ? 1 : 0;
        var4 = (ei) (Object) fj.field_H.b(2);
        L0: while (true) {
          if (var4 == null) {
            if (param0 == 4) {
              var2 = ne.field_b.b(2);
              L1: while (true) {
                if (var2 == null) {
                  return;
                } else {
                  cj.a(param1, false);
                  var2 = ne.field_b.a(10);
                  continue L1;
                }
              }
            } else {
              field_n = null;
              var2 = ne.field_b.b(2);
              L2: while (true) {
                if (var2 == null) {
                  return;
                } else {
                  cj.a(param1, false);
                  var2 = ne.field_b.a(10);
                  continue L2;
                }
              }
            }
          } else {
            kc.a(param1, (byte) 75, var4);
            var4 = (ei) (Object) fj.field_H.a(10);
            continue L0;
          }
        }
    }

    public static void d(int param0) {
        field_l = null;
        field_n = null;
        if (param0 > -111) {
            gb.d(-127);
        }
    }

    protected gb() {
    }

    final static byte[] a(String param0, int param1) {
        if (param1 != -523) {
          field_i = -75;
          return si.field_b.a("", param1 + 522, param0);
        } else {
          return si.field_b.a("", param1 + 522, param0);
        }
    }

    final void e(int param0) {
        if (((gb) this).field_j == null) {
          return;
        } else {
          if (param0 != 0) {
            ((gb) this).e(11);
            ((gb) this).field_j.field_k = ((gb) this).field_k;
            ((gb) this).field_k.field_j = ((gb) this).field_j;
            ((gb) this).field_k = null;
            ((gb) this).field_j = null;
            return;
          } else {
            ((gb) this).field_j.field_k = ((gb) this).field_k;
            ((gb) this).field_k.field_j = ((gb) this).field_j;
            ((gb) this).field_k = null;
            ((gb) this).field_j = null;
            return;
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_n = new aa(9, 0, 4, 1);
        field_i = 0;
    }
}
