/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wd {
    static gb field_a;
    static bd field_b;

    public static void a(byte param0) {
        if (param0 != 69) {
          field_b = (bd) null;
        }
        field_a = null;
        field_b = null;
    }

    final static boolean a(int param0, int[] param1) {
        int var5_int = 0;
        int var6 = 0;
        RuntimeException stackIn_40_0 = null;
        StringBuilder stackIn_40_1 = null;
        String stackIn_41_2 = null;
        RuntimeException decompiledCaughtException = null;
        long var2_long = 0L;
        RuntimeException var2 = null;
        ei var4_ref_ei = null;
        int var4 = 0;
        ei var5 = null;
        int var7 = 0;
        var7 = HostileSpawn.field_I ? 1 : 0;
        try {
          if (ci.field_d != rc.field_a) {
            return false;
          }
          var2_long = hn.a((byte) 80);
          if (bl.field_b != 0 &&
            tc.field_a < 0) {
            var4_ref_ei = (ei) (ck.field_u.g(-69));
            if (var4_ref_ei != null &&
              var4_ref_ei.field_j < var2_long) {
              var4_ref_ei.b(-115);
              jd.field_q = var4_ref_ei.field_r.length;
              sc.field_g.field_i = 0;
              for (var5_int = 0; var5_int < jd.field_q; var5_int++) {
                sc.field_g.field_n[var5_int] = var4_ref_ei.field_r[var5_int];
              }
              bj.field_f = ae.field_u;
              ae.field_u = ne.field_o;
              ne.field_o = wa.field_k;
              wa.field_k = var4_ref_ei.field_s;
              return true;
            }
          }
          if (param0 != 23278) {
            return true;
          }
          while (true) {
            if (tc.field_a < 0) {
              sc.field_g.field_i = 0;
              if (!re.c((byte) 33, 1)) {
                return false;
              }
              tc.field_a = sc.field_g.p(param0 - 23214);
              sc.field_g.field_i = 0;
              jd.field_q = param1[tc.field_a];
            }
            if (!eb.a(13372)) {
              return false;
            }
            if (bl.field_b == 0) {
              bj.field_f = ae.field_u;
              ae.field_u = ne.field_o;
              ne.field_o = wa.field_k;
              wa.field_k = tc.field_a;
              tc.field_a = -1;
              return true;
            }
            var4 = bl.field_b;
            if (sb.field_a != 0.0) {
              var4 = (int)((double)var4 + jk.field_b.nextGaussian() * sb.field_a);
              if (0 > var4) {
                var4 = 0;
              }
            }
            var5 = new ei(var2_long + (long)var4, tc.field_a, new byte[jd.field_q]);
            for (var6 = 0; jd.field_q > var6; var6++) {
              var5.field_r[var6] = sc.field_g.field_n[var6];
            }
            ck.field_u.a(var5, 111);
            tc.field_a = -1;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_40_0 = var2;
          stackIn_40_1 = new StringBuilder().append("wd.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_41_2 = "null";
          } else {
            stackIn_41_2 = "{...}";
          }
          throw wg.a((Throwable) ((Object) stackIn_40_0), ((StringBuilder) (Object) stackIn_40_1).append(stackIn_41_2).append(')').toString());
        }
    }

    static {
    }
}
