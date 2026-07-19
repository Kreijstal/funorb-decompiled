/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hn {
    static int field_a;
    static jp field_b;

    public static void a(int param0) {
        int var1 = 125 % ((28 - param0) / 60);
        field_b = null;
    }

    final static boolean b(byte param0) {
        if (param0 != 7) {
            return true;
        }
        return o.field_e.field_xc == oc.field_p ? true : false;
    }

    final static jp[] a(int param0, int param1, int param2, int param3) {
        jp[] discarded$3 = null;
        jp[] var4 = null;
        int var5 = 0;
        int var6 = 0;
        jp[] var7 = null;
        var6 = BrickABrac.field_J ? 1 : 0;
        if (param3 == -10) {
          var7 = new jp[9];
          var4 = var7;
          var7[0] = hd.a(param0, param2, (byte) -6);
          var5 = 1;
          L0: while (true) {
            if (-10 >= (var5 ^ -1)) {
              var4[4] = hd.a(param1, 64, (byte) -6);
              return var4;
            } else {
              var7[var5] = var7[0];
              var5++;
              continue L0;
            }
          }
        } else {
          discarded$3 = hn.a(22, -77, 60, 46);
          var7 = new jp[9];
          var4 = var7;
          var7[0] = hd.a(param0, param2, (byte) -6);
          var5 = 1;
          L1: while (true) {
            if (-10 >= (var5 ^ -1)) {
              var4[4] = hd.a(param1, 64, (byte) -6);
              return var4;
            } else {
              var7[var5] = var7[0];
              var5++;
              continue L1;
            }
          }
        }
    }

    final static void a(byte param0) {
        if (!(eq.field_g == null)) {
            eq.field_g.a((byte) 113);
            eq.field_g = null;
        }
        if (param0 < 49) {
            field_b = (jp) null;
            return;
        }
    }

    final static void a(mh param0, mh param1, int param2) {
        try {
            if (!(param1.field_bb != null)) {
                param1.field_bb = new vl();
            }
            int var3_int = -102 / ((param2 - -58) / 50);
            if (param0.field_bb == null) {
                param0.field_bb = new vl();
            }
            if (!(null != of.field_i)) {
                of.field_i = new mk(64);
            }
            if (tf.field_d == null) {
                tf.field_d = new mk(64);
            }
            bf.field_N = param1.field_bb;
            jq.field_n = param0.field_bb;
            uc.e(108);
        } catch (RuntimeException runtimeException) {
            throw qb.a((Throwable) ((Object) runtimeException), "hn.E(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    static {
    }
}
