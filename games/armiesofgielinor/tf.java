/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class tf extends tc {
    static String field_m;
    int field_n;
    static String field_p;
    int field_o;
    static int field_l;
    static int field_k;

    final static void a(int param0, int param1, int param2, int[] param3, int param4) {
        int[] var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int[] var9 = null;
        var8 = ArmiesOfGielinor.field_M ? 1 : 0;
        if (param1 == -1432128863) {
          L0: while (true) {
            param2--;
            if (0 <= param2) {
              var9 = param3;
              var5 = var9;
              var6 = param0;
              var7 = param4;
              var9[var6] = var7 - -rn.a(var9[var6] >> -1432128863, 8355711);
              param0++;
              continue L0;
            } else {
              return;
            }
          }
        } else {
          return;
        }
    }

    public static void a(boolean param0) {
        field_m = null;
        field_p = null;
        if (!param0) {
            return;
        }
        field_m = null;
    }

    final static void a(int param0, nt param1, byte param2) {
        bv var3 = null;
        var3 = vl.field_n;
        var3.h(32161, param0);
        var3.b(1, param1.field_o);
        if (param2 != -64) {
          field_m = null;
          var3.b(1, param1.field_q);
          return;
        } else {
          var3.b(1, param1.field_q);
          return;
        }
    }

    final static void a(byte param0, java.applet.Applet param1) {
        String var2 = null;
        String var3 = null;
        long var4 = 0L;
        at.field_a = true;
        var2 = "tuhstatbut";
        if (param0 != -99) {
          return;
        } else {
          var3 = "rvnadlm";
          var4 = -1L;
          tc.a(param1, var3, (byte) 120, var2, var4);
          return;
        }
    }

    tf(int param0, int param1) {
        ((tf) this).field_o = param1;
        ((tf) this).field_n = param0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_p = "Resign";
        field_m = "Confirm Password: ";
        field_k = 0;
    }
}
