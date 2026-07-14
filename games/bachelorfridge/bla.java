/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bla extends td {
    static kv[] field_p;
    static String field_q;

    final static ee[] a(int param0, String param1, String param2, vr param3) {
        int var4 = 0;
        int var5 = 0;
        Object var6 = null;
        var4 = param3.a(param1, false);
        var5 = param3.a((byte) 6, var4, param2);
        if (param0 != 29611) {
          var6 = null;
          ee[] discarded$2 = bla.a(39, (String) null, (String) null, (vr) null);
          return kn.a(-7726, param3, var5, var4);
        } else {
          return kn.a(-7726, param3, var5, var4);
        }
    }

    final static void a(int param0, kv[] param1, byte param2, int param3) {
        raa.field_I = new lda(param1);
        wo.field_j = param0;
        if (param2 != 15) {
            return;
        }
        ge.field_I = param3;
        el.e((byte) 122);
    }

    final ii a(op param0, int param1) {
        Object var6 = null;
        aga var7 = null;
        aga var8 = null;
        pg var9 = null;
        aga var10 = null;
        aga var11 = null;
        pg var12 = null;
        if (param1 == 3) {
          var10 = ((bla) this).field_h.a(62, param0);
          var11 = ((bla) this).field_j.a(116, param0);
          if (var11 != null) {
            if (var11.i(-77)) {
              return (ii) (Object) new ew(new nq(var10));
            } else {
              var12 = new pg(((bla) this).field_g, new nq(var10), ((bla) this).field_j);
              var12.field_o.a((bw) (Object) new iv(new nq(var11), false, 1, 0, 42), true);
              return (ii) (Object) var12;
            }
          } else {
            return (ii) (Object) new ew(new nq(var10));
          }
        } else {
          var6 = null;
          bla.a(57, (kv[]) null, (byte) 36, -19);
          var7 = ((bla) this).field_h.a(62, param0);
          var8 = ((bla) this).field_j.a(116, param0);
          if (var8 != null) {
            if (var8.i(-77)) {
              return (ii) (Object) new ew(new nq(var7));
            } else {
              var9 = new pg(((bla) this).field_g, new nq(var7), ((bla) this).field_j);
              var9.field_o.a((bw) (Object) new iv(new nq(var8), false, 1, 0, 42), true);
              return (ii) (Object) var9;
            }
          } else {
            return (ii) (Object) new ew(new nq(var7));
          }
        }
    }

    bla(int param0, aga param1, nq param2) {
        super(param0, param1);
        ((bla) this).field_j = param2;
    }

    public static void b(int param0) {
        Object var2 = null;
        field_p = null;
        if (param0 != 42) {
          var2 = null;
          ee[] discarded$2 = bla.a(30, (String) null, (String) null, (vr) null);
          field_q = null;
          return;
        } else {
          field_q = null;
          return;
        }
    }

    final static void c(byte param0) {
        lw.field_k = new String[cja.field_v];
        lw.field_k[7] = me.field_q;
        lw.field_k[18] = saa.field_r;
        lw.field_k[6] = on.field_p;
        lw.field_k[19] = ql.field_q;
        lw.field_k[16] = tl.field_q;
        lw.field_k[param0] = cu.field_y;
        lw.field_k[9] = bda.field_o;
        lw.field_k[17] = vaa.field_c;
        lw.field_k[11] = io.field_r;
        lw.field_k[21] = us.field_d;
        lw.field_k[20] = ts.field_q;
        lw.field_k[5] = rb.field_r;
        lw.field_k[4] = nu.field_a;
        lw.field_k[15] = qc.field_e;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_q = "Your rating is <%0>";
    }
}
