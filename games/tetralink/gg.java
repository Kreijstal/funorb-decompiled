/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gg extends hm {
    private String field_g;
    private String field_h;
    static mk field_j;
    static hl field_i;
    static java.awt.Font field_k;

    final df a(byte param0) {
        if (param0 > -77) {
          return (df) null;
        }
        return t.field_h;
    }

    final static void c(int param0) {
        if (!qa.field_v) {
          throw new IllegalStateException();
        }
        if (param0 > -5) {
          return;
        }
        if (null != fl.field_u) {
          fl.field_u.r(-124);
        }
        String var1 = hb.c(-8927);
        ao.field_c = new tl(var1, (String) null, true, false, false);
        mf.field_s.a(mm.field_u, false);
        mm.field_u.e(ao.field_c, -27667);
        mm.field_u.a(true);
    }

    final static void d(byte param0) {
        bf var1 = null;
        int var2 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1_ref = null;
        bf var1Lifetime1;
        var2 = TetraLink.field_J;
        try {
          ch.field_q.f();
          hc.field_v.f();
          ok.field_a = ok.field_a - 1;
          if (ok.field_a == 0) {
            ok.field_a = 200;
            var1 = (bf) (ha.field_b.c(false));
            while (var1 != null) {
              if (!var1.field_q.a((byte) 95)) {
                var1.b(false);
              }
              var1 = (bf) (ha.field_b.a((byte) -70));
            }
            if (gi.field_d != null) {
              var1Lifetime1 = (bf) (gi.field_d.c(false));
              while (var1Lifetime1 != null) {
                if (!var1Lifetime1.field_q.a((byte) 95)) {
                  var1Lifetime1.b(false);
                }
                var1Lifetime1 = (bf) (gi.field_d.a((byte) -70));
              }
            }
          }
          if (param0 > -77) {
            gg.a(true);
          }
          if (null != ic.field_b &&
            !ic.field_b.d((byte) 127)) {
            oa.field_B = null;
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw oi.a((Throwable) ((Object) var1_ref), "gg.G(" + param0 + ')');
        }
    }

    final static void c(byte param0) {
        if (param0 != 43) {
          return;
        }
        if (null != hd.field_s &&
          null != hd.field_s.field_h) {
          hd.field_s.field_h.field_zb = false;
        }
        hd.field_s = null;
        bi.field_d = null;
    }

    final static void b(int param0) {
        int var1_int = 0;
        double var2 = 0.0;
        int var4 = 0;
        int var5 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        int var1_intLifetime1;
        var4 = TetraLink.field_J;
        try {
          vn.b();
          da.field_g = new int[260];
          mh.field_a = 11;
          for (var1_int = 0; var1_int < 256; var1_int++) {
            var2 = 15.0;
            da.field_g[var1_int] = (int)(255.0 * Math.pow((double)((float)var1_int / 256.0f), var2));
          }
          if (param0 <= 87) {
            gg.c((byte) 127);
          }
          var5 = 256;
          var1_intLifetime1 = var5;
          while (var5 < da.field_g.length) {
            da.field_g[var5] = 255;
            var5++;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw oi.a((Throwable) ((Object) var1), "gg.D(" + param0 + ')');
        }
    }

    final static boolean b(byte param0) {
        if (param0 != 87) {
          gg.b((byte) 24);
        }
        return al.field_i != null ? true : false;
    }

    final void a(int param0, bh param1) {
        try {
          if (param0 != -22017) {
            this.a((byte) 84);
          }
          param1.a(this.field_g, (byte) 103);
          param1.a((byte) 124, this.field_h);
        } catch (RuntimeException runtimeException) {
          throw oi.a((Throwable) ((Object) runtimeException), "gg.F(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static void a(int param0, int param1) {
        bc var2 = nd.field_Lb;
        var2.f(param0, (byte) -92);
        var2.a(1, false);
        var2.a(param1, false);
    }

    public static void a(boolean param0) {
        if (param0) {
          field_k = (java.awt.Font) null;
        }
        field_k = null;
        field_j = null;
        field_i = null;
    }

    gg(String param0, String param1) {
        try {
          this.field_h = param1;
          this.field_g = param0;
        } catch (RuntimeException runtimeException) {
          throw oi.a((Throwable) ((Object) runtimeException), "gg.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    static {
    }
}
