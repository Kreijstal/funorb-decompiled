/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class oj {
    final static void a(byte param0) {
        vi dupTemp$0 = null;
        int fieldTemp$1 = 0;
        vi var1;
        int var2;
        vi var3;
        var2 = HoldTheLine.field_D;
        if (param0 < 78) {
          return;
        }
        if (null == bd.field_Q) {
          return;
        }
        if (-1 == ab.field_jb) {
          return;
        }
        var1 = gh.field_n[ab.field_jb];
        if (var1 == null) {
          dupTemp$0 = vi.a(bd.field_Q, em.field_m[ab.field_jb], "");
          var3 = dupTemp$0;
          var1 = var3;
          if (dupTemp$0 == null) {
            return;
          }
          gh.field_n[ab.field_jb] = var3;
        }
        if (!vl.field_d.field_q.a(22050, jh.field_a, var1, false, pd.field_f)) {
          return;
        }
        i.field_k[ab.field_jb] = var1;
        ab.field_jb = -1;
        fieldTemp$1 = oc.field_a - 1;
        oc.field_a = oc.field_a - 1;
        if (fieldTemp$1 == 0) {
          vl.field_d.field_q.e(0);
          jh.field_a = null;
        }
        if (bi.field_e == 2) {
          lc.field_d = var1;
          gn.a(false, var1, (byte) 69, 30);
        } else {
          if (1 != bi.field_e) {
            gn.a(true, var1, (byte) 69, 30);
            lc.field_d = null;
          } else {
            if (lc.field_d == null) {
              gn.a(true, var1, (byte) 69, 30);
              lc.field_d = null;
            } else {
              if (ai.field_a.a(-98, lc.field_d)) {
                ec.field_D = var1;
              } else {
                gn.a(true, var1, (byte) 69, 30);
                lc.field_d = null;
              }
            }
          }
        }
        return;
    }

    final static void a(hj[] param0, int param1, int param2, int param3, int param4, int param5) {
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        var11 = HoldTheLine.field_D;
        try {
          if (param0 != null &&
            param5 > 0) {
            var6_int = param0[0].field_o;
            var7 = param0[2].field_o;
            var8 = param0[1].field_o;
            param0[0].a(param2, param3, param1);
            param0[2].a(-var7 + (param5 + param2), param3, param1);
            tc.b(hi.field_W);
            tc.e(param2 + var6_int, param3, param2 + param5 - var7, param3 + param0[1].field_v);
            var9 = var6_int + param2;
            var10 = param2 - (-param5 + var7);
            if (param4 > -73) {
              return;
            }
            for (param2 = var9; param2 < var10; param2 = param2 + var8) {
              param0[1].a(param2, param3, param1);
            }
            tc.a(hi.field_W);
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_14_0 = var6;
          stackIn_14_1 = new StringBuilder().append("oj.A(");
          if (param0 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw kk.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(')').toString());
        }
    }

    static {
    }
}
