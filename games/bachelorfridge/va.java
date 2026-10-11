/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class va {
    final static void a(int param0) {
        RuntimeException decompiledCaughtException = null;
        kv var1 = null;
        RuntimeException var1_ref = null;
        int var2_int = 0;
        Object var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        kv var6 = null;
        kv var7 = null;
        kv var8 = null;
        int var3Lifetime1;
        var4 = BachelorFridge.field_y;
        try {
          dg.a(243, 197, 369, 143, 16777215);
          dg.c(244, 198, 367, 141, 0);
          if (null == oja.field_f) {
            if (null != g.field_f) {
              g.field_f.a(ema.field_Ab, 245, 199, 365, 139, 16777215, -1, 1, 1, 0);
            }
            return;
          }
          var6 = oja.field_f[ih.field_l];
          var1 = var6;
          if (param0 < 124) {
            va.a((byte) -87);
          }
          if (var6 != null) {
            var6.e(245, 199);
          } else {
            if (null != g.field_f) {
              g.field_f.a(ema.field_Ab, 245, 199, 365, 139, 16777215, -1, 1, 1, 0);
            }
          }
          if (gp.field_A < ph.field_E) {
            var7 = oja.field_f[vj.field_n];
            if (var7 != null) {
              var2_int = (60 + var7.field_n) * gp.field_A / ph.field_E;
              var3 = var2_int - 30;
              if (!ja.field_p) {
                iia.a((byte) 123, 199, -256 * var3 / 30, var7, (-var3 + var7.field_n) * 256 / 30, 245);
              } else {
                iia.a((byte) -57, 199, 256 * (var7.field_n - var3) / 30, var7, -256 * var3 / 30, 245);
              }
            }
          }
          if (null == g.field_f) {
            return;
          }
          var2 = null;
          var5 = 0;
          var3Lifetime1 = var5;
          while (oja.field_f.length > var5) {
            var8 = oja.field_f[var5];
            if (var8 != null && (365 != var8.field_n ||
              139 != var8.field_o)) {
              if (var2 != null) {
                var2 = (String) (var2) + ", " + var5;
              } else {
                var2 = Integer.toString(var5);
              }
            }
            var5++;
          }
          if (var2 == null) {
            return;
          }
          g.field_f.a("Screenshot(s) " + (String) (var2) + " is/are the wrong size! Should be " + 365 + "<times>" + 139, 245, 199, 365, 139, 16737843, 0, 1, 1, 0);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw pe.a((Throwable) ((Object) var1_ref), "va.A(" + param0 + ')');
        }
    }

    final static void a(byte param0) {
        ov.field_g = null;
        jl.field_s = -1;
        if (param0 < 7) {
          return;
        }
        eaa.field_b = -1;
        b.field_r = false;
        df.field_o = 0;
    }

    static {
    }
}
