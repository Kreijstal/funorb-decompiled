/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sc {
    static ci field_f;
    static ci field_d;
    static int field_i;
    static um field_c;
    static ci field_h;
    static String field_g;
    static String field_b;
    static int field_e;
    static lh field_a;

    final static String a(String param0, um param1, int param2, String param3, byte param4) {
        if (param4 > -31) {
            return null;
        }
        if (!(param1.c((byte) 121))) {
            return param3;
        }
        return param0 + " - " + param1.c(param2, -77) + "%";
    }

    final static String a(char param0, int param1) {
        if (param1 <= 117) {
            sc.a(28);
            return String.valueOf(param0);
        }
        return String.valueOf(param0);
    }

    public static void a(int param0) {
        field_b = null;
        field_c = null;
        field_a = null;
        field_f = null;
        field_g = null;
        field_d = null;
        if (param0 != -26862) {
          String discarded$2 = sc.a('ﾸ', 103);
          field_h = null;
          return;
        } else {
          field_h = null;
          return;
        }
    }

    final static km[] a(int param0, int param1, int param2, int param3, int param4) {
        km[] var5 = null;
        km[] var6 = null;
        var6 = new km[9];
        var5 = var6;
        if (param1 < 120) {
          L0: {
            field_e = -99;
            var6[6] = rd.a(param3, param2, 14727);
            var5[3] = rd.a(param3, param2, 14727);
            var5[2] = rd.a(param3, param2, 14727);
            var5[1] = rd.a(param3, param2, 14727);
            var5[0] = rd.a(param3, param2, 14727);
            var6[8] = rd.a(param3, param0, 14727);
            var5[7] = rd.a(param3, param0, 14727);
            var5[5] = rd.a(param3, param0, 14727);
            if (0 != param4) {
              var6[4] = rd.a(64, param4, 14727);
              break L0;
            } else {
              break L0;
            }
          }
          return var5;
        } else {
          L1: {
            var6[6] = rd.a(param3, param2, 14727);
            var5[3] = rd.a(param3, param2, 14727);
            var5[2] = rd.a(param3, param2, 14727);
            var5[1] = rd.a(param3, param2, 14727);
            var5[0] = rd.a(param3, param2, 14727);
            var6[8] = rd.a(param3, param0, 14727);
            var5[7] = rd.a(param3, param0, 14727);
            var5[5] = rd.a(param3, param0, 14727);
            if (0 != param4) {
              var6[4] = rd.a(64, param4, 14727);
              break L1;
            } else {
              break L1;
            }
          }
          return var5;
        }
    }

    final static void a(int param0, boolean param1) {
        ob.field_z = wm.field_n[param0];
        uk.field_a = bi.field_c[param0];
        if (param1) {
            return;
        }
        e.field_T = rh.field_e[param0];
    }

    final static void a(int param0, int param1) {
        int var3 = 0;
        Object var4 = null;
        hh var5 = null;
        var3 = Chess.field_G;
        if (param0 < -112) {
          var5 = (hh) (Object) eh.field_R.g(-18110);
          L0: while (true) {
            if (var5 == null) {
              return;
            } else {
              ue.a(param1, var5, (byte) 126);
              var5 = (hh) (Object) eh.field_R.a((byte) -128);
              continue L0;
            }
          }
        } else {
          var4 = null;
          String discarded$2 = sc.a((String) null, (um) null, 101, (String) null, (byte) 55);
          var5 = (hh) (Object) eh.field_R.g(-18110);
          L1: while (true) {
            if (var5 == null) {
              return;
            } else {
              ue.a(param1, var5, (byte) 126);
              var5 = (hh) (Object) eh.field_R.a((byte) -128);
              continue L1;
            }
          }
        }
    }

    final static aj a(String param0, int param1, byte param2) {
        aj var3 = new aj(false);
        int var4 = -56 % ((param2 - 42) / 46);
        var3.field_g = param1;
        var3.field_e = param0;
        return var3;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_i = 0;
        field_b = "Enter name of player to delete from list";
        field_g = "Waiting for sound effects";
        field_e = 15;
    }
}
