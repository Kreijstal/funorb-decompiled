/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rn extends rd {
    static int field_n;
    private int field_l;
    static int[] field_j;
    static jg[] field_o;
    private int field_m;
    static ko field_p;
    static bf field_r;
    static String field_q;
    static vc field_k;

    final f a(boolean param0, int param1, int param2, int param3, ta param4) {
        if (param0) {
            Object var7 = null;
            mg discarded$0 = rn.a(-72, true, 42L, (String) null, (String) null);
        }
        ((rn) this).field_l = ((rn) this).field_l + param3;
        ((rn) this).field_m = ((rn) this).field_m + 1;
        return (f) (Object) new mi(bm.field_g, true);
    }

    final static String[] a(String param0, byte param1) {
        int var2 = 0;
        String[] var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        var6 = CrazyCrystals.field_B;
        var2 = an.field_q.a(param0, 148);
        var3 = new String[var2];
        int discarded$2 = an.field_q.a(param0, new int[1], var3);
        var4 = 0;
        L0: while (true) {
          if (var4 >= var3.length) {
            var4 = -61 / ((param1 - 30) / 40);
            return var3;
          } else {
            L1: while (true) {
              var5 = var3[var4].indexOf("<br>");
              if (var5 >= 0) {
                var3[var4] = var3[var4].substring(0, var5) + var3[var4].substring(4 + var5);
                continue L1;
              } else {
                var4++;
                continue L0;
              }
            }
          }
        }
    }

    final void a(byte param0) {
        tb.field_d.a(ad.field_k, 100, 48 * gi.field_m * ((rn) this).field_m, ((rn) this).field_l / ((rn) this).field_m);
        ((rn) this).field_m = 0;
        int var2 = -42 / ((29 - param0) / 42);
        ((rn) this).field_l = 0;
    }

    final pb b(byte param0) {
        if (param0 >= -127) {
            Object var3 = null;
            f discarded$0 = ((rn) this).a(true, 103, 109, -114, (ta) null);
        }
        return (pb) (Object) new cl();
    }

    final static mg a(int param0, boolean param1, long param2, String param3, String param4) {
        L0: {
          if (-1L != (param2 ^ -1L)) {
            break L0;
          } else {
            if (param4 != null) {
              return (mg) (Object) new bq(param4, param3);
            } else {
              break L0;
            }
          }
        }
        if (!param1) {
          L1: {
            if (param0 == 0) {
              break L1;
            } else {
              field_o = null;
              break L1;
            }
          }
          return (mg) (Object) new fa(param2, param3);
        } else {
          return (mg) (Object) new uh(param2, param3);
        }
    }

    public static void c(int param0) {
        field_r = null;
        field_j = null;
        field_o = null;
        field_p = null;
        if (param0 >= -72) {
            String discarded$0 = rn.d(-52);
        }
        field_q = null;
        field_k = null;
    }

    rn() {
        ((rn) this).field_l = 0;
        ((rn) this).field_m = 0;
    }

    final static String d(int param0) {
        if (param0 < (eq.field_j ^ -1)) {
            return hd.field_b;
        }
        if (null != be.field_e) {
            if (!be.field_e.a((byte) 102)) {
                return jg.field_h;
            }
            return ge.field_a;
        }
        if (!rb.field_k.a((byte) 102)) {
            return re.field_n;
        }
        if (!rb.field_k.a(-20402, "commonui")) {
            return dp.field_j + " - " + rb.field_k.b("commonui", -38) + "%";
        }
        if (!(ok.field_c.a((byte) 102))) {
            return ld.field_w;
        }
        if (!ok.field_c.a(param0 ^ 20403, "commonui")) {
            return jn.field_k + " - " + ok.field_c.b("commonui", -60) + "%";
        }
        if (!dd.field_a.a((byte) 102)) {
            return gf.field_d;
        }
        if (!dd.field_a.a(false)) {
            return l.field_a + " - " + dd.field_a.b(3492) + "%";
        }
        return wp.field_a;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        int var0 = 0;
        field_j = new int[16];
        for (var0 = 0; 16 > var0; var0++) {
            field_j[var0] = 198149 * var0;
        }
        field_q = null;
        field_r = new bf();
    }
}
