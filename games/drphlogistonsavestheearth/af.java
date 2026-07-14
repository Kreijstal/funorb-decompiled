/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class af {
    static he[] field_e;
    static int[] field_f;
    static tf field_g;
    static String field_c;
    static int field_d;
    static String field_a;
    static int field_b;

    final static bm a(int param0, byte[] param1) {
        int var2 = 0;
        bm var3 = null;
        var2 = -19 % ((param0 - 22) / 63);
        if (param1 == null) {
          return null;
        } else {
          var3 = new bm(param1, kh.field_i, vi.field_b, gf.field_o, qa.field_J, aj.field_a, a.field_e);
          oc.a((byte) -21);
          return var3;
        }
    }

    final static void b(int param0) {
        if (param0 != 6) {
            af.a(-44);
            if (!(null != df.field_l)) {
                return;
            }
            hb.a(-5, (java.awt.Canvas) (Object) df.field_l);
            df.field_l.a(sb.field_d, true);
            df.field_l = null;
            if (!(null == pi.field_V)) {
                pi.field_V.b((byte) -7);
            }
            n.field_g.requestFocus();
            return;
        }
        if (!(null != df.field_l)) {
            return;
        }
        hb.a(-5, (java.awt.Canvas) (Object) df.field_l);
        df.field_l.a(sb.field_d, true);
        df.field_l = null;
        if (!(null == pi.field_V)) {
            pi.field_V.b((byte) -7);
        }
        n.field_g.requestFocus();
    }

    public static void a(int param0) {
        field_f = null;
        field_c = null;
        if (param0 != 4) {
          field_c = null;
          field_e = null;
          field_g = null;
          field_a = null;
          return;
        } else {
          field_e = null;
          field_g = null;
          field_a = null;
          return;
        }
    }

    final static void a(byte param0) {
        kc var1 = null;
        lh var2 = null;
        var1 = (kc) (Object) rd.field_C.h(-11151);
        if (var1 == null) {
          eg.a((byte) 126);
          return;
        } else {
          var2 = dh.field_N;
          int discarded$34 = var2.h(23);
          int discarded$35 = var2.h(97);
          int discarded$36 = var2.h(-104);
          if (param0 != 59) {
            field_c = null;
            int discarded$37 = var2.h(param0 ^ 74);
            var1.a(-16175);
            return;
          } else {
            int discarded$38 = var2.h(param0 ^ 74);
            var1.a(-16175);
            return;
          }
        }
    }

    final static nh[] a(int param0, int param1, int param2, byte param3, int param4) {
        nh[] var5 = null;
        nh[] var6 = null;
        var6 = new nh[9];
        var5 = var6;
        var6[6] = mi.a(param1, (byte) -96, param0);
        var5[3] = mi.a(param1, (byte) -96, param0);
        var5[2] = mi.a(param1, (byte) -96, param0);
        var5[1] = mi.a(param1, (byte) -96, param0);
        var5[0] = mi.a(param1, (byte) -96, param0);
        var6[8] = mi.a(param1, (byte) -85, param2);
        var5[7] = mi.a(param1, (byte) -85, param2);
        var5[5] = mi.a(param1, (byte) -85, param2);
        if (param3 != 32) {
          return null;
        } else {
          L0: {
            if (-1 != param4) {
              var6[4] = mi.a(64, (byte) -109, param4);
              break L0;
            } else {
              break L0;
            }
          }
          return var5;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = " of ";
        field_a = "Click icon to start";
        field_f = new int[]{1, 0, 5, 0, 13, 2, 2, 0, 0, 0, 2, 30, 15, 15, 10, 10, 2, 2, 1, 3, 60, 1, 60, 200, 4, 5, 4, 1, 11, 1};
    }
}
