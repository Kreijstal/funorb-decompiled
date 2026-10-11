/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rhb extends rqa {
    static String field_o;

    public static void a(int param0) {
        field_o = null;
        if (param0 != 225) {
          int[] var2 = (int[]) null;
          rhb.a(52, (int[]) null);
        }
    }

    rhb(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    final static boolean a(int param0, int[] param1) {
        int var5_int = 0;
        int var6 = 0;
        RuntimeException stackIn_36_0 = null;
        StringBuilder stackIn_36_1 = null;
        String stackIn_37_2 = null;
        RuntimeException decompiledCaughtException = null;
        long var2_long = 0L;
        RuntimeException var2 = null;
        c var4_ref_c = null;
        int var4 = 0;
        c var5 = null;
        int var7 = 0;
        var7 = VoidHunters.field_G;
        try {
          if (tc.field_c != sp.field_o) {
            return false;
          }
          var2_long = wt.a(false);
          if (param0 != cd.field_c &&
            kcb.field_p < 0) {
            var4_ref_c = (c) (mlb.field_q.d(param0 + 0));
            if (var4_ref_c != null &&
              var4_ref_c.field_e < var2_long) {
              var4_ref_c.b(-3846);
              vja.field_a = var4_ref_c.field_f.length;
              qga.field_b.field_e = 0;
              for (var5_int = 0; var5_int < vja.field_a; var5_int++) {
                qga.field_b.field_h[var5_int] = var4_ref_c.field_f[var5_int];
              }
              iq.field_a = foa.field_o;
              foa.field_o = fd.field_r;
              fd.field_r = ow.field_a;
              ow.field_a = var4_ref_c.field_d;
              return true;
            }
          }
          while (true) {
            if (0 > kcb.field_p) {
              qga.field_b.field_e = 0;
              if (!boa.a(1, 30000)) {
                return false;
              }
              kcb.field_p = qga.field_b.o(255);
              qga.field_b.field_e = 0;
              vja.field_a = param1[kcb.field_p];
            }
            if (!ci.b((byte) 51)) {
              return false;
            }
            if (cd.field_c == 0) {
              iq.field_a = foa.field_o;
              foa.field_o = fd.field_r;
              fd.field_r = ow.field_a;
              ow.field_a = kcb.field_p;
              kcb.field_p = -1;
              return true;
            }
            var4 = cd.field_c;
            if (aib.field_c != 0.0) {
              var4 = (int)((double)var4 + jeb.field_b.nextGaussian() * aib.field_c);
              if (var4 < 0) {
                var4 = 0;
              }
            }
            var5 = new c((long)var4 + var2_long, kcb.field_p, new byte[vja.field_a]);
            for (var6 = 0; var6 < vja.field_a; var6++) {
              var5.field_f[var6] = qga.field_b.field_h[var6];
            }
            mlb.field_q.b(param0 ^ -10258, var5);
            kcb.field_p = -1;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_36_0 = var2;
          stackIn_36_1 = new StringBuilder().append("rhb.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_37_2 = "null";
          } else {
            stackIn_37_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_36_0), ((StringBuilder) (Object) stackIn_36_1).append(stackIn_37_2).append(')').toString());
        }
    }

    final nc a(nc[] param0, int param1) {
        RuntimeException var3 = null;
        nc stackIn_2_0 = null;
        nc stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 < -119) {
            stackIn_4_0 = new nc(frb.a(225, 79));
            return stackIn_4_0;
          }
          stackIn_2_0 = (nc) null;
          return stackIn_2_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_7_0 = var3;
          stackIn_7_1 = new StringBuilder().append("rhb.A(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param1).append(')').toString());
        }
    }

    static {
        field_o = "Real-life threats";
    }
}
