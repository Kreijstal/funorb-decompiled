/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mi {
    static long[] field_b;
    static String field_a;
    static String field_c;
    static int field_d;

    final static int a(boolean param0) {
        if (!param0) {
            mi.a(-77);
            return 3;
        }
        return 3;
    }

    final static int a(int param0, lk[] param1, int param2) {
        int var3 = 0;
        int var4 = 0;
        var4 = Kickabout.field_G;
        if (param2 == 1) {
          var3 = 0;
          L0: while (true) {
            if (-1 + param1.length > var3) {
              if (param1[1 + var3].field_f <= -1 + param0) {
                var3++;
                continue L0;
              } else {
                return var3;
              }
            } else {
              return param1.length + -1;
            }
          }
        } else {
          return -33;
        }
    }

    public static void a(int param0) {
        field_b = null;
        if (param0 != 0) {
            field_c = null;
            field_c = null;
            field_a = null;
            return;
        }
        field_c = null;
        field_a = null;
    }

    final static boolean a(long param0, String param1, byte param2, int param3, int[] param4) {
        bb var6 = null;
        CharSequence var7 = null;
        if (!cb.a(param3, param1, (byte) -75, param4, param0)) {
          return false;
        } else {
          L0: {
            if (1 != param3) {
              break L0;
            } else {
              param3 = 0;
              break L0;
            }
          }
          at.field_Kb = param1;
          ov.field_b = param3;
          var7 = (CharSequence) (Object) param1;
          qi.field_o = mo.a(0, var7);
          if (param2 < 114) {
            field_d = -66;
            ik.field_A = param0;
            var6 = te.a(-94, fr.field_E, param4, ic.field_a, ve.field_S);
            ad.a(var6, (byte) -115);
            return true;
          } else {
            ik.field_A = param0;
            var6 = te.a(-94, fr.field_E, param4, ic.field_a, ve.field_S);
            ad.a(var6, (byte) -115);
            return true;
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = new long[32];
        field_a = "Who can join";
        field_c = "Try again";
    }
}
