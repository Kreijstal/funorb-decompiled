/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ok {
    static String field_b;
    static int[] field_d;
    static cm field_f;
    static cm field_e;
    static boolean field_g;
    static int field_c;
    static int field_a;
    static String field_h;

    final static void a(int param0, pn param1, java.awt.Frame param2) {
        wj var3 = null;
        int var4 = 0;
        Object var5 = null;
        var4 = SteelSentinels.field_G;
        L0: while (true) {
          var3 = param1.a(param2, -1463474960);
          L1: while (true) {
            if (-1 != (var3.field_a ^ -1)) {
              if ((var3.field_a ^ -1) == -2) {
                param2.setVisible(false);
                param2.dispose();
                if (param0 != -1) {
                  var5 = null;
                  ok.a(27, (pn) null, (java.awt.Frame) null);
                  return;
                } else {
                  return;
                }
              } else {
                a.a((byte) 118, 100L);
                continue L0;
              }
            } else {
              a.a((byte) 121, 10L);
              continue L1;
            }
          }
        }
    }

    final static void a(boolean param0, boolean param1, int param2) {
        Object var4 = null;
        nm.a((String) null, param0, param1, 12);
        int var3 = -36 % ((param2 - -22) / 36);
    }

    final static int a(int param0, byte param1) {
        int var2 = 0;
        Object var3 = null;
        var2 = param0 >>> -449278847;
        var2 = var2 | var2 >>> 1699537281;
        var2 = var2 | var2 >>> 1630051138;
        var2 = var2 | var2 >>> -1304318812;
        var2 = var2 | var2 >>> 116530824;
        if (param1 <= 33) {
          var3 = null;
          int discarded$2 = ok.a(-16, (byte[]) null, 9, (byte) -15);
          var2 = var2 | var2 >>> 683349808;
          return param0 & (var2 ^ -1);
        } else {
          var2 = var2 | var2 >>> 683349808;
          return param0 & (var2 ^ -1);
        }
    }

    public static void a(boolean param0) {
        field_d = null;
        field_e = null;
        field_f = null;
        if (!param0) {
          field_d = null;
          field_b = null;
          field_h = null;
          return;
        } else {
          field_b = null;
          field_h = null;
          return;
        }
    }

    final static int a(int param0, byte[] param1, int param2, byte param3) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        Object var7 = null;
        var6 = SteelSentinels.field_G;
        if (param3 != 109) {
          var7 = null;
          int discarded$1 = ok.a(-97, (byte[]) null, -1, (byte) -92);
          var4 = -1;
          var5 = param0;
          L0: while (true) {
            if (param2 <= var5) {
              var4 = var4 ^ -1;
              return var4;
            } else {
              var4 = var4 >>> 304932904 ^ kh.field_r[255 & (var4 ^ param1[var5])];
              var5++;
              continue L0;
            }
          }
        } else {
          var4 = -1;
          var5 = param0;
          L1: while (true) {
            if (param2 <= var5) {
              var4 = var4 ^ -1;
              return var4;
            } else {
              var4 = var4 >>> 304932904 ^ kh.field_r[255 & (var4 ^ param1[var5])];
              var5++;
              continue L1;
            }
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = "Report abuse";
        field_h = "Invite";
    }
}
