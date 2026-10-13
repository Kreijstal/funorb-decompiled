/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ed {
    static jp[] field_b;
    static String field_c;
    static boolean field_d;
    static int[] field_f;
    static String field_a;
    static int[] field_e;

    final static void a(int param0, int param1) {
        si.field_k.a(true, dm.field_b, 0, param1, param0);
        if (si.field_k.field_m == 7) {
          hq.b(true, true, param0);
        }
    }

    final static void a(boolean param0, mf param1, mf param2, byte param3) {
        try {
          ai.a(lp.field_Ab, ul.field_m, f.field_a, Paddle.field_C, im.field_d, wi.field_n, tk.field_t, ad.field_l, (byte) 61, param0, ic.field_c, fp.field_u);
          if (param3 < 74) {
            ed.b(2, -57);
          }
          ef.field_b = cr.a("lobby", param1, "chatfilter", 2);
          rh.field_e[0] = mc.field_a;
          rh.field_e[2] = sp.field_s;
          rh.field_e[1] = e.field_j;
          hk.a(rd.field_e, (byte) 90, param2);
        } catch (RuntimeException runtimeException) {
          throw qb.a((Throwable) ((Object) runtimeException), "ed.D(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ')');
        }
    }

    final static int b(int param0, int param1) {
        int var2 = 0;
        if (param0 != 9) {
          ed.b(-83, -74);
        }
        if (param1 < 0) {
          var2 += 16;
          param1 = param1 >>> 16;
          if (256 <= param1) {
            param1 = param1 >>> 8;
            var2 += 8;
          }
          if (16 <= param1) {
            param1 = param1 >>> 4;
            var2 += 4;
          }
          if (4 <= param1) {
            param1 = param1 >>> 2;
            var2 += 2;
          }
          if (param1 >= 1) {
            param1 = param1 >>> 1;
            var2++;
          }
          return var2 + param1;
        }
        if (param1 < 65536) {
          if (256 <= param1) {
            param1 = param1 >>> 8;
            var2 += 8;
          }
          if (16 <= param1) {
            param1 = param1 >>> 4;
            var2 += 4;
          }
          if (4 <= param1) {
            param1 = param1 >>> 2;
            var2 += 2;
          }
          if (param1 >= 1) {
            param1 = param1 >>> 1;
            var2++;
          }
          return var2 + param1;
        }
        var2 += 16;
        param1 = param1 >>> 16;
        if (256 <= param1) {
          param1 = param1 >>> 8;
          var2 += 8;
        }
        if (16 <= param1) {
          param1 = param1 >>> 4;
          var2 += 4;
        }
        if (4 <= param1) {
          param1 = param1 >>> 2;
          var2 += 2;
        }
        if (param1 >= 1) {
          param1 = param1 >>> 1;
          var2++;
        }
        return var2 + param1;
    }

    public static void a(int param0) {
        field_a = null;
        field_f = null;
        if (param0 > -61) {
          return;
        }
        field_c = null;
        field_e = null;
        field_b = null;
    }

    static {
        field_a = "Asking for or providing contact information";
        field_e = new int[8192];
        field_f = new int[]{0, 1, 2, 10, 25, -1, -1, -1, -1, 3, 4, -1, -1, -1, -1, -1, -1, -1, -1, 5, 6, 7, 8, -1, -1, -1, -1, -1, -1, 9, 10, 11, 12, 13, -1, -1, -1, -1, -1, 14, -1};
        field_c = "You have <%0> unread messages!";
    }
}
