/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mn {
    static String field_a;

    final static void a(boolean param0, int param1, int param2, int param3) {
        int var4_int = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        llb var5 = null;
        int var6 = 0;
        int var7 = 0;
        String var8 = null;
        pgb var9 = null;
        int var6Lifetime1;
        var7 = VoidHunters.field_G;
        try {
          if (uh.field_p != jl.field_q.field_b) {
            kga.field_o = kga.field_o + (jl.field_q.field_b - uh.field_p);
            uh.field_p = jl.field_q.field_b;
          }
          if (tb.field_b < ldb.field_o) {
            tb.field_b = tb.field_b + 1;
          }
          if (tb.field_b <= 0) {
            return;
          }
          cs.b((byte) 71);
          hca.field_o.a(param0, 1332);
          if (ada.field_b != null) {
            if (erb.field_p) {
              ada.field_b.a((byte) -5, hca.field_o.field_M, hca.field_o.field_u, param0);
            } else {
              ada.field_b = null;
            }
          }
          for (var4_int = 0; 5 > var4_int; var4_int++) {
            var5 = ul.field_b[var4_int];
            if (var5 != null) {
              if (var5.field_o != 0) {
                tg.a(101, var5, var4_int);
              }
              var6 = jia.a(var4_int, (byte) 19);
              vh.field_c[var4_int].field_tb = pmb.field_o[var6];
              lob.field_c[var4_int].field_R = fqb.field_o[var6];
            }
          }
          if (nlb.field_o.field_o != 0) {
            crb.field_v = new bwa(nlb.field_o.field_M, nlb.field_o.field_u, nlb.field_o.field_hb, nlb.field_o.field_G, param2, fh.field_g, lo.field_b, kn.field_p, qc.field_q, urb.field_o, iga.field_o, (String) null, 0L);
          }
          var9 = aq.b(nna.field_w, qs.field_c, param1, -123);
          if (var9 != null) {
            aka.a(var9, 22859);
          }
          var8 = sdb.a(-8037);
          var6Lifetime1 = 101 / ((param3 + 32) / 58);
          if (var8 != null) {
            lob.field_a = var8;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw rta.a((Throwable) ((Object) var4), "mn.C(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    public static void a(int param0) {
        int var1 = 19 / ((29 - param0) / 59);
        field_a = null;
    }

    final static boolean a(CharSequence param0, byte param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        var3 = VoidHunters.field_G;
        try {
          if (!je.a((byte) -31, param0, true)) {
            return false;
          }
          if (param1 > -107) {
            field_a = (String) null;
          }
          for (var2_int = 0; var2_int < param0.length(); var2_int++) {
            if (!qnb.a((byte) -108, param0.charAt(var2_int))) {
              return false;
            }
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_18_0 = var2;
          stackIn_18_1 = new StringBuilder().append("mn.A(");
          if (param0 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_18_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',').append(param1).append(')').toString());
        }
    }

    static {
        field_a = "Please remove <%0> from your ignore list first.";
    }
}
