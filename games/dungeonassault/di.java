/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class di {
    String field_g;
    int field_h;
    int field_a;
    String field_c;
    String field_i;
    static boolean field_e;
    int field_f;
    int field_j;
    static String field_k;
    int field_b;
    static int field_d;
    static cn[] field_l;

    final static boolean a(int[] param0, int param1) {
        int var5_int = 0;
        int var6 = 0;
        RuntimeException stackIn_41_0 = null;
        StringBuilder stackIn_41_1 = null;
        String stackIn_42_2 = null;
        RuntimeException decompiledCaughtException = null;
        long var2_long = 0L;
        RuntimeException var2 = null;
        ao var4_ref_ao = null;
        int var4 = 0;
        ao var5 = null;
        int var7 = 0;
        int[] var8 = null;
        var7 = DungeonAssault.field_K;
        try {
          if (pd.field_A != qa.field_c) {
            return false;
          }
          if (param1 != -1) {
            var8 = (int[]) null;
            di.a((int[]) null, -88);
          }
          var2_long = kd.c(-2456);
          if (pm.field_p != 0 &&
            0 > pp.field_J) {
            var4_ref_ao = (ao) (nl.field_e.e(-24172));
            if (var4_ref_ao != null &&
              var2_long > var4_ref_ao.field_l) {
              var4_ref_ao.a(false);
              nj.field_b = var4_ref_ao.field_m.length;
              ra.field_c.field_o = 0;
              for (var5_int = 0; var5_int < nj.field_b; var5_int++) {
                ra.field_c.field_m[var5_int] = var4_ref_ao.field_m[var5_int];
              }
              wl.field_f = oc.field_E;
              oc.field_E = rd.field_C;
              rd.field_C = hc.field_c;
              hc.field_c = var4_ref_ao.field_j;
              return true;
            }
          }
          while (true) {
            if (pp.field_J < 0) {
              ra.field_c.field_o = 0;
              if (!oi.a(-12929, 1)) {
                return false;
              }
              pp.field_J = ra.field_c.m(255);
              ra.field_c.field_o = 0;
              nj.field_b = param0[pp.field_J];
            }
            if (!kh.d((byte) -117)) {
              return false;
            }
            if (pm.field_p == 0) {
              wl.field_f = oc.field_E;
              oc.field_E = rd.field_C;
              rd.field_C = hc.field_c;
              hc.field_c = pp.field_J;
              pp.field_J = -1;
              return true;
            }
            var4 = pm.field_p;
            if (qi.field_a != 0.0) {
              var4 = (int)((double)var4 + bl.field_i.nextGaussian() * qi.field_a);
              if (var4 < 0) {
                var4 = 0;
              }
            }
            var5 = new ao((long)var4 + var2_long, pp.field_J, new byte[nj.field_b]);
            for (var6 = 0; nj.field_b > var6; var6++) {
              var5.field_m[var6] = ra.field_c.field_m[var6];
            }
            nl.field_e.a(var5, false);
            pp.field_J = -1;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_41_0 = var2;
          stackIn_41_1 = new StringBuilder().append("di.B(");
          if (param0 == null) {
            stackIn_42_2 = "null";
          } else {
            stackIn_42_2 = "{...}";
          }
          throw vk.a((Throwable) ((Object) stackIn_41_0), ((StringBuilder) (Object) stackIn_41_1).append(stackIn_42_2).append(',').append(param1).append(')').toString());
        }
    }

    final void a(ec param0, int param1) {
        try {
          this.field_i = param0.a(-21030);
          if (param1 != -1) {
            ec var4 = (ec) null;
            this.a((ec) null, -21);
          }
          this.field_g = param0.a(-21030);
          this.field_c = param0.a(-21030);
          param0.a(param1 ^ 21029);
          this.field_j = rm.a(param0, 6065);
          rm.a(param0, 6065);
          rm.a(param0, param1 + 6066);
          this.field_a = param0.f(param1 - 101);
          this.field_f = param0.f(param1 ^ 125);
          this.field_h = param0.f(-117);
        } catch (RuntimeException runtimeException) {
          throw vk.a((Throwable) ((Object) runtimeException), "di.C(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    public static void a(byte param0) {
        field_l = null;
        if (param0 != -78) {
          field_k = (String) null;
        }
        field_k = null;
    }

    static {
        field_e = true;
        field_k = "This password contains repeated characters, and would be easy to guess";
    }
}
