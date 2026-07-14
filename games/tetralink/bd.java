/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bd {
    static int[] field_b;
    static int field_e;
    static je field_c;
    static String field_f;
    static String field_d;
    static int[] field_a;
    static hl field_g;

    final static oh[] a(int param0, int param1, int param2, int param3, byte param4) {
        oh[] var5 = null;
        oh[] var6 = null;
        if (param4 == 126) {
          var6 = new oh[9];
          var5 = var6;
          var5[6] = ce.a(param2, param1, param4 + -126);
          var5[3] = ce.a(param2, param1, param4 + -126);
          var5[2] = ce.a(param2, param1, param4 + -126);
          var5[1] = ce.a(param2, param1, param4 + -126);
          var5[0] = ce.a(param2, param1, param4 + -126);
          var6[8] = ce.a(param0, param1, 0);
          var5[7] = ce.a(param0, param1, 0);
          var5[5] = ce.a(param0, param1, 0);
          if (param3 != 0) {
            var5[4] = ce.a(param3, 64, param4 + -126);
            return var5;
          } else {
            return var5;
          }
        } else {
          bd.a((byte) -37);
          var6 = new oh[9];
          var5 = var6;
          var5[6] = ce.a(param2, param1, param4 + -126);
          var5[3] = ce.a(param2, param1, param4 + -126);
          var5[2] = ce.a(param2, param1, param4 + -126);
          var5[1] = ce.a(param2, param1, param4 + -126);
          var5[0] = ce.a(param2, param1, param4 + -126);
          var6[8] = ce.a(param0, param1, 0);
          var5[7] = ce.a(param0, param1, 0);
          var5[5] = ce.a(param0, param1, 0);
          if (param3 == 0) {
            return var5;
          } else {
            var5[4] = ce.a(param3, 64, param4 + -126);
            return var5;
          }
        }
    }

    final static String a(int param0) {
        if (null == ph.field_w) {
          return "";
        } else {
          if (param0 != 6) {
            oh[] discarded$2 = bd.a(85, -19, 63, -86, (byte) 97);
            return ph.field_w;
          } else {
            return ph.field_w;
          }
        }
    }

    final static void a(oh param0, int param1) {
        Object var3 = null;
        if (param1 != 6) {
          var3 = null;
          bd.a((oh) null, -66);
          me.a(false);
          param0.c();
          return;
        } else {
          me.a(false);
          param0.c();
          return;
        }
    }

    public static void a(byte param0) {
        field_f = null;
        field_d = null;
        field_c = null;
        field_b = null;
        field_a = null;
        field_g = null;
        if (param0 < 111) {
            Object var2 = null;
            bd.a((oh) null, 71);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = new je();
        field_f = "Report abuse";
        field_d = "Quick Chat game";
    }
}
