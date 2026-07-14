/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pj {
    static il field_a;
    static int[] field_d;
    static String field_b;
    static eh field_c;
    static String field_e;

    final static void a(int param0) {
        Object var2 = null;
        nd.a((byte) 119, "", (String) null);
        if (param0 != 256) {
            pj.a(false);
        }
    }

    public static void a(boolean param0) {
        if (param0) {
          field_e = null;
          field_a = null;
          field_c = null;
          field_b = null;
          field_d = null;
          field_e = null;
          return;
        } else {
          field_a = null;
          field_c = null;
          field_b = null;
          field_d = null;
          field_e = null;
          return;
        }
    }

    final static void a(int param0, int param1) {
        l var2 = null;
        int var3 = 0;
        sa var4 = null;
        var3 = Virogrid.field_F ? 1 : 0;
        var4 = (sa) (Object) fj.field_b.a((byte) -46);
        L0: while (true) {
          if (var4 == null) {
            if (param1 == -11513) {
              var2 = tf.field_a.a((byte) -31);
              L1: while (true) {
                if (var2 == null) {
                  return;
                } else {
                  fn.a(param0, true);
                  var2 = tf.field_a.a(16213);
                  continue L1;
                }
              }
            } else {
              pj.a(false);
              var2 = tf.field_a.a((byte) -31);
              L2: while (true) {
                if (var2 == null) {
                  return;
                } else {
                  fn.a(param0, true);
                  var2 = tf.field_a.a(16213);
                  continue L2;
                }
              }
            }
          } else {
            te.a(param1 ^ -11514, var4, param0);
            var4 = (sa) (Object) fj.field_b.a(param1 ^ -5038);
            continue L0;
          }
        }
    }

    final static void a(mg param0, int param1) {
        qc.a(param1 + -142);
        if (param1 != 256) {
            field_d = null;
            param0.b();
            return;
        }
        param0.b();
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = new int[256];
        field_b = "Warning: if you quit, you will lose any game you are in the middle of!";
        field_e = "Options";
    }
}
