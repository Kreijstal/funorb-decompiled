/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ee {
    static String field_c;
    static int field_b;
    static String field_a;
    static boolean field_e;
    static int field_d;

    public static void a(byte param0) {
        field_a = null;
        if (param0 > -88) {
            return;
        }
        field_c = null;
    }

    final static void b(byte param0) {
        L0: {
          if (rq.field_D != null) {
            pi.field_b.b((lq) (Object) rq.field_D);
            break L0;
          } else {
            break L0;
          }
        }
        if (param0 != -25) {
          field_e = false;
          qd.field_c = null;
          vg.field_Bb = null;
          rq.field_D = null;
          return;
        } else {
          qd.field_c = null;
          vg.field_Bb = null;
          rq.field_D = null;
          return;
        }
    }

    final static void a(int param0, int param1, int param2) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        if (param0 == 653278209) {
          var3 = hw.field_i * iw.field_g.field_o >> -1233444280;
          var4 = iw.field_g.field_o * hw.field_i >> 314556488;
          var5 = hw.field_i * sa.field_e >> 221643528;
          var6 = lr.field_m * hw.field_i >> -1718113176;
          if (rg.field_f) {
            iw.field_g.e(param1 - var5 + -(var3 >> 1562129825), -var6 + (param2 + -(var4 >> 39237793)), var3, var4, 256);
            return;
          } else {
            eo.a(iw.field_g, -(var3 >> 653278209) + (-var5 + param1), -var6 + param2 + -(var4 >> -1916685887), var3, var4);
            return;
          }
        } else {
          return;
        }
    }

    final static void a(ks param0, boolean param1) {
        os.field_I = param0;
        if (param1) {
            ee.b((byte) 1);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = "Send private Quick Chat to <%0>";
        field_d = 2;
    }
}
