/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nk extends fc {
    boolean field_k;
    static int field_l;
    int[] field_m;
    int field_i;
    static String field_j;

    final static void b(boolean param0) {
        vg var1 = null;
        var1 = (vg) (Object) gd.field_q.c((byte) -123);
        if (param0) {
          L0: {
            nk.d(-35);
            if (var1 == null) {
              var1 = new vg();
              break L0;
            } else {
              break L0;
            }
          }
          var1.a(ll.field_g, ll.field_d, 11033, ll.field_i, ll.field_a, ll.field_e, ll.field_k, ll.field_b);
          cj.field_j.a((byte) -97, (fc) (Object) var1);
          return;
        } else {
          L1: {
            if (var1 == null) {
              var1 = new vg();
              break L1;
            } else {
              break L1;
            }
          }
          var1.a(ll.field_g, ll.field_d, 11033, ll.field_i, ll.field_a, ll.field_e, ll.field_k, ll.field_b);
          cj.field_j.a((byte) -97, (fc) (Object) var1);
          return;
        }
    }

    final static void a(int param0, int param1) {
        la var2 = null;
        var2 = ra.field_C;
        var2.c(param0, 7);
        var2.a(1, (byte) -70);
        var2.a(2, (byte) -65);
        if (param1 >= -85) {
          field_j = null;
          return;
        } else {
          return;
        }
    }

    public static void d(int param0) {
        if (param0 != 23985) {
            return;
        }
        field_j = null;
    }

    final static void a(boolean param0, int param1, boolean param2) {
        Object var4 = null;
        jb.a((String) null, param0, param2, 0);
        int var3 = 88 % ((-51 - param1) / 44);
    }

    nk() {
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_l = -1;
        field_j = "Connection timed out. Please try using a different server.";
    }
}
