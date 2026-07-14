/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class lk {
    static String field_b;
    static double field_a;

    abstract int a(int param0, int param1);

    abstract byte[] a(int param0, boolean param1);

    public static void a(byte param0) {
        if (param0 != -29) {
            return;
        }
        field_b = null;
    }

    final static void a(db param0, byte param1) {
        int var3 = 0;
        int var4 = 0;
        jg var5 = null;
        int[] var6 = null;
        int var7 = 0;
        md var8 = null;
        int var9 = 0;
        md var10 = null;
        var7 = CrazyCrystals.field_B;
        if (param1 < 26) {
          return;
        } else {
          var8 = new md(param0.a(7693, "", "logo.fo3d"));
          var10 = var8;
          var3 = var10.h(255);
          var10.f((byte) 50);
          ud.field_S = rd.a(var10, -95);
          je.field_d = new int[var3][];
          rn.field_o = new jg[var3];
          var4 = 0;
          L0: while (true) {
            if (var3 <= var4) {
              var10.k(-2321);
              var9 = 0;
              var4 = var9;
              L1: while (true) {
                if (var3 <= var9) {
                  return;
                } else {
                  var5 = rn.field_o[var9];
                  var5.a(-30866, 6, 6, 1, 6);
                  var5.b(32767);
                  var6 = new int[]{var5.field_j + var5.field_x >> 486289953, var5.field_C - -var5.field_E >> 630779105, var5.field_p - -var5.field_e >> -1354296927};
                  je.field_d[var9] = var6;
                  var5.a(-var6[0], -var6[2], -var6[1], 0);
                  var9++;
                  continue L1;
                }
              }
            } else {
              rn.field_o[var4] = nh.a(-31741, var8);
              var4++;
              continue L0;
            }
          }
        }
    }

    abstract qg a(int param0);

    final static boolean b(int param0) {
        if (param0 != 6) {
            return true;
        }
        return sg.field_b == l.field_b ? true : false;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = Math.atan2(1.0, 0.0);
    }
}
