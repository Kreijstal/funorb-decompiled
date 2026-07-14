/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wh {
    static int field_f;
    private db[] field_b;
    static int[] field_e;
    static String field_a;
    static Boolean field_d;
    static String field_c;

    public static void a(int param0) {
        int var1 = -3 / ((25 - param0) / 51);
        field_e = null;
        field_c = null;
        field_a = null;
        field_d = null;
    }

    final static void a(int param0, byte param1) {
        kd.field_a = (param0 & 52) >> -1160208572;
        jf.field_K = param0 >> -1754285374 & 3;
        if (kd.field_a <= 2) {
          L0: {
            fi.field_b = 3 & param0;
            if (-3 > (jf.field_K ^ -1)) {
              jf.field_K = 2;
              break L0;
            } else {
              break L0;
            }
          }
          if ((fi.field_b ^ -1) >= -3) {
            if (param1 != 63) {
              wh.a(44);
              return;
            } else {
              return;
            }
          } else {
            fi.field_b = 2;
            if (param1 != 63) {
              wh.a(44);
              return;
            } else {
              return;
            }
          }
        } else {
          L1: {
            kd.field_a = 2;
            fi.field_b = 3 & param0;
            if (-3 > (jf.field_K ^ -1)) {
              jf.field_K = 2;
              break L1;
            } else {
              break L1;
            }
          }
          if ((fi.field_b ^ -1) < -3) {
            fi.field_b = 2;
            if (param1 == 63) {
              return;
            } else {
              wh.a(44);
              return;
            }
          } else {
            if (param1 != 63) {
              wh.a(44);
              return;
            } else {
              return;
            }
          }
        }
    }

    final void a(int param0, int param1, int param2, int param3, int param4) {
        if (param4 != -1160208572) {
          field_d = null;
          gf.a(param3, param1, ((wh) this).field_b, param2, param0, (byte) 107);
          return;
        } else {
          gf.a(param3, param1, ((wh) this).field_b, param2, param0, (byte) 107);
          return;
        }
    }

    wh(db[] param0) {
        ((wh) this).field_b = param0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = new int[8192];
        field_c = "Names can only contain letters, numbers, spaces and underscores";
        field_a = "Names should contain a maximum of 12 characters";
    }
}
