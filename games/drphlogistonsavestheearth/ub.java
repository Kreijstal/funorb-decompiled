/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ub {
    static int field_b;
    static he[] field_a;

    public static void a(byte param0) {
        if (param0 > -117) {
          return;
        }
        field_a = null;
    }

    final static long a(int param0, CharSequence param1) {
        int var5 = 0;
        long stackIn_22_0 = 0L;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_26_2 = null;
        RuntimeException decompiledCaughtException = null;
        long var2_long = 0L;
        RuntimeException var2 = null;
        int var4 = 0;
        int var6 = 0;
        int var7 = 0;
        var7 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        try {
          var2_long = 0L;
          var4 = param1.length();
          if (param0 < 42) {
            field_a = (he[]) null;
          }
          for (var5 = 0; var5 < var4; var5++) {
            var2_long = var2_long * 37L;
            var6 = param1.charAt(var5);
            if (var6 >= 65 &&
              var6 <= 90) {
              var2_long = var2_long + (long)(1 + (var6 - 65));
            } else if (var6 >= 97 &&
              var6 <= 122) {
              var2_long = var2_long + (long)(-97 + (1 + var6));
            } else {
              if (var6 >= 48 &&
                var6 <= 57) {
                var2_long = var2_long + (long)(27 + var6 - 48);
              }
            }
            if (var2_long < 177917621779460413L) {
              continue;
            }
            break;
          }
          while (var2_long % 37L == 0L) {
            if (var2_long != 0L) {
              var2_long = var2_long / 37L;
              continue;
            }
            break;
          }
          stackIn_22_0 = var2_long;
          return stackIn_22_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_25_0 = var2;
          stackIn_25_1 = new StringBuilder().append("ub.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_26_2 = "null";
          } else {
            stackIn_26_2 = "{...}";
          }
          throw ie.a((Throwable) ((Object) stackIn_25_0), ((StringBuilder) (Object) stackIn_25_1).append(stackIn_26_2).append(')').toString());
        }
    }

    final static void a(int param0) {
        ae.field_hb = new nh[]{hb.field_a, ad.field_t, oi.field_d, cl.field_p, li.field_i, al.field_b, kc.field_p, rk.field_e, hj.field_e, cl.field_s, kc.field_q, qa.field_M, nd.field_L, sa.field_c, mh.field_c, DrPhlogistonSavesTheEarth.field_J, jj.field_c, am.field_o, ik.field_b, bd.field_P, nc.field_K, null, lh.field_p, f.field_i[param0], le.field_d, qf.field_b, cj.field_d, kc.field_p, db.field_e, lh.field_p};
    }

    static {
    }
}
