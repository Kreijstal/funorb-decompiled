/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ge {
    static r field_a;
    static String field_h;
    static bj field_e;
    static int[] field_g;
    static boolean field_c;
    static String field_b;
    static int field_f;
    static String field_d;

    final static void a(int param0, byte param1, boolean param2) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        var4 = MinerDisturbance.field_ab;
        if (param1 == 85) {
          L0: {
            if (!param2) {
              var5 = 0;
              var3 = var5;
              L1: while (true) {
                if ((var5 ^ -1) <= -26) {
                  break L0;
                } else {
                  if (sd.field_c[var5] == param0) {
                    if (null != gl.field_u[var5]) {
                      kf.a(gl.field_u[var5], (byte) -111);
                      gl.field_u[var5] = null;
                      return;
                    } else {
                      var5++;
                      continue L1;
                    }
                  } else {
                    var5++;
                    continue L1;
                  }
                }
              }
            } else {
              var3 = 0;
              L2: while (true) {
                if (-26 >= (var3 ^ -1)) {
                  break L0;
                } else {
                  if (rb.field_l[var3] == param0) {
                    if (null != dn.field_t[var3]) {
                      kf.a(dn.field_t[var3], (byte) -114);
                      dn.field_t[var3] = null;
                      return;
                    } else {
                      var3++;
                      continue L2;
                    }
                  } else {
                    var3++;
                    continue L2;
                  }
                }
              }
            }
          }
          return;
        } else {
          return;
        }
    }

    public static void a(int param0) {
        field_g = null;
        field_d = null;
        field_a = null;
        field_e = null;
        if (param0 < 95) {
            field_c = false;
        }
        field_b = null;
        field_h = null;
    }

    final static ih a(byte[] param0, int param1) {
        if (param0 == null) {
            return null;
        }
        if (param1 != -569) {
            field_d = null;
        }
        ih var2 = new ih(param0, bg.field_d, oc.field_e, qk.field_b, ng.field_e, af.field_p, db.field_b);
        ec.a((byte) -111);
        return var2;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_h = "<%0> <times> 500 = <%1>";
        field_a = new r();
        field_b = "???";
        field_f = 48;
        field_g = new int[256];
    }
}
