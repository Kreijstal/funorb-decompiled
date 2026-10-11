/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class tb {
    static boolean field_c;
    static java.applet.Applet field_d;
    static String field_e;
    static String field_b;
    static String field_a;
    static dd field_f;

    final static boolean a(int param0, int[] param1) {
        int var5_int = 0;
        int var6 = 0;
        RuntimeException stackIn_37_0 = null;
        StringBuilder stackIn_37_1 = null;
        String stackIn_38_2 = null;
        RuntimeException decompiledCaughtException = null;
        long var2_long = 0L;
        RuntimeException var2 = null;
        ha var4_ref_ha = null;
        int var4 = 0;
        ha var5 = null;
        int var7 = 0;
        CharSequence var8 = null;
        var7 = fleas.field_A ? 1 : 0;
        try {
          if (rh.field_k != fh.field_b) {
            return false;
          }
          var2_long = lj.a((byte) -83);
          if (ja.field_P != 0 &&
            0 > il.field_h) {
            var4_ref_ha = (ha) (bj.field_n.c((byte) 47));
            if (var4_ref_ha != null &&
              var4_ref_ha.field_q < var2_long) {
              var4_ref_ha.c(-1);
              pd.field_l = var4_ref_ha.field_r.length;
              ae.field_a.field_i = 0;
              for (var5_int = 0; pd.field_l > var5_int; var5_int++) {
                ae.field_a.field_k[var5_int] = var4_ref_ha.field_r[var5_int];
              }
              hc.field_j = rj.field_k;
              rj.field_k = vi.field_a;
              vi.field_a = be.field_a;
              be.field_a = var4_ref_ha.field_n;
              return true;
            }
          }
          if (param0 > -54) {
            var8 = (CharSequence) null;
            tb.a((CharSequence) null, false);
          }
          while (true) {
            if (il.field_h < 0) {
              ae.field_a.field_i = 0;
              if (!gi.a(1, true)) {
                return false;
              }
              il.field_h = ae.field_a.f((byte) 47);
              ae.field_a.field_i = 0;
              pd.field_l = param1[il.field_h];
            }
            if (!gf.b(-9)) {
              return false;
            }
            if (ja.field_P == 0) {
              hc.field_j = rj.field_k;
              rj.field_k = vi.field_a;
              vi.field_a = be.field_a;
              be.field_a = il.field_h;
              il.field_h = -1;
              return true;
            }
            var4 = ja.field_P;
            if (g.field_u != 0.0) {
              var4 = (int)((double)var4 + jj.field_R.nextGaussian() * g.field_u);
              if (var4 < 0) {
                var4 = 0;
              }
            }
            var5 = new ha((long)var4 + var2_long, il.field_h, new byte[pd.field_l]);
            for (var6 = 0; pd.field_l > var6; var6++) {
              var5.field_r[var6] = ae.field_a.field_k[var6];
            }
            bj.field_n.a(false, var5);
            il.field_h = -1;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_37_0 = var2;
          stackIn_37_1 = new StringBuilder().append("tb.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_38_2 = "null";
          } else {
            stackIn_38_2 = "{...}";
          }
          throw pf.a((Throwable) ((Object) stackIn_37_0), ((StringBuilder) (Object) stackIn_37_1).append(stackIn_38_2).append(')').toString());
        }
    }

    public static void a(byte param0) {
        if (param0 > -43) {
          field_d = (java.applet.Applet) null;
        }
        field_f = null;
        field_b = null;
        field_d = null;
        field_a = null;
        field_e = null;
    }

    final static int a(CharSequence param0, boolean param1) {
        int var4 = 0;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var5 = 0;
        int stackIn_3_0 = 0;
        int stackIn_8_0 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        var5 = fleas.field_A ? 1 : 0;
        try {
          var2_int = param0.length();
          var3 = 0;
          if (param1) {
            stackIn_3_0 = 40;
            return stackIn_3_0;
          }
          for (var4 = 0; var4 < var2_int; var4++) {
            var3 = rc.a(param0.charAt(var4), 22861) + ((var3 << 5) - var3);
          }
          stackIn_8_0 = var3;
          return stackIn_8_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_11_0 = var2;
          stackIn_11_1 = new StringBuilder().append("tb.A(");
          if (param0 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw pf.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(param1).append(')').toString());
        }
    }

    static {
        field_e = "Right slope: ";
        field_b = "Tiles in the level (1/3)";
        field_a = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!#$%&'*+-/=?^_{}~";
    }
}
