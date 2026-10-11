/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ga extends wf {
    int field_i;
    int field_e;
    int[] field_h;
    static int field_l;
    int field_m;
    int field_f;
    int field_k;
    long field_j;
    int field_g;
    int field_n;

    final static boolean a(int param0, int param1, int param2) {
        boolean stackIn_6_0 = false;
        if (param0 != 0) {
          ga.a(-70);
        }
        stackIn_6_0 = (0 != (param2 & 2048)) && ((param1 & 55) != 0);
        return stackIn_6_0;
    }

    final static void a(int param0) {
        pa[] array$0 = null;
        pa[] array$1 = null;
        pa[] stackIn_78_0 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        ha var6 = null;
        int var3Lifetime1;
        int var2Lifetime1;
        int var2Lifetime2;
        int var2Lifetime3;
        int var2Lifetime4;
        int var2Lifetime5;
        int var2Lifetime6;
        int var2Lifetime7;
        int var2Lifetime8;
        int var2Lifetime9;
        int var2Lifetime10;
        int var2Lifetime11;
        int var2Lifetime12;
        int var2Lifetime13;
        int var2Lifetime14;
        int var2Lifetime15;
        int var2Lifetime16;
        int var2Lifetime17;
        int var2Lifetime18;
        int var2Lifetime19;
        int var2Lifetime20;
        int var2Lifetime21;
        var4 = AceOfSkies.field_G ? 1 : 0;
        try {
          var6 = pk.field_wb.a((byte) 100);
          if (hr.field_d == null) {
            hr.field_d = new pa[jd.field_d.length][];
            is.field_a = new pa[oo.field_ab.length];
            sd.field_k = new pa[na.field_c.length];
            es.field_b = new pa[tq.field_h.length];
            bl.field_b = new pa[ud.field_f.length];
            ac.field_f = new pa[qa.field_a.length];
            jm.field_a = new pa[hq.field_a.length];
            aa.field_a = new pa[la.field_g.length];
            rs.field_u = new pa[af.field_c.length];
            bs.field_b = new pa[qq.field_e.length];
            uc.field_o = new pa[tt.field_c.length];
            ua.field_g = new pa[eb.field_c.length];
            in.field_c = new pa[kb.field_D.length];
            ii.field_k = new pa[ps.field_f.length][];
            wm.field_i = new pa[ol.field_e.length];
            po.field_e = new pa[nu.field_b.length];
            co.field_i = new pa[gn.field_b.length];
            ec.field_e = new pa[o.field_a.length];
            mb.field_u = new pa[vl.field_b.length];
            dl.field_n = new pa[qk.field_a.length];
            ko.field_g = new pa[gu.field_a.length];
            for (var2 = 0; ii.field_k.length > var2; var2++) {
              array$0 = new pa[ps.field_f[var2].length];
              ii.field_k[var2] = array$0;
            }
          }
          for (var2Lifetime1 = 0; var2Lifetime1 < jd.field_d.length; var2Lifetime1++) {
            if (hr.field_d[var2Lifetime1] == null) {
              array$1 = new pa[jd.field_d[var2Lifetime1].length];
              hr.field_d[var2Lifetime1] = array$1;
            }
            for (var3 = 0; var3 < jd.field_d[var2Lifetime1].length; var3++) {
              hr.field_d[var2Lifetime1][var3] = var6.a(jd.field_d[var2Lifetime1][var3], false);
            }
          }
          for (var2Lifetime2 = 0; var2Lifetime2 < oo.field_ab.length; var2Lifetime2++) {
            is.field_a[var2Lifetime2] = var6.a(oo.field_ab[var2Lifetime2], false);
          }
          for (var2Lifetime3 = 0; na.field_c.length > var2Lifetime3; var2Lifetime3++) {
            sd.field_k[var2Lifetime3] = var6.a(na.field_c[var2Lifetime3], false);
          }
          for (var2Lifetime4 = 0; tq.field_h.length > var2Lifetime4; var2Lifetime4++) {
            es.field_b[var2Lifetime4] = var6.a(tq.field_h[var2Lifetime4], false);
          }
          for (var2Lifetime5 = 0; ud.field_f.length > var2Lifetime5; var2Lifetime5++) {
            bl.field_b[var2Lifetime5] = var6.a(ud.field_f[var2Lifetime5], false);
          }
          for (var2Lifetime6 = 0; ol.field_e.length > var2Lifetime6; var2Lifetime6++) {
            wm.field_i[var2Lifetime6] = var6.a(ol.field_e[var2Lifetime6], false);
          }
          for (var2Lifetime7 = 0; nu.field_b.length > var2Lifetime7; var2Lifetime7++) {
            po.field_e[var2Lifetime7] = var6.a(nu.field_b[var2Lifetime7], false);
          }
          for (var2Lifetime8 = 0; gn.field_b.length > var2Lifetime8; var2Lifetime8++) {
            co.field_i[var2Lifetime8] = var6.a(gn.field_b[var2Lifetime8], false);
          }
          for (var2Lifetime9 = 0; o.field_a.length > var2Lifetime9; var2Lifetime9++) {
            ec.field_e[var2Lifetime9] = var6.a(o.field_a[var2Lifetime9], false);
          }
          var2Lifetime10 = 0;
          if (param0 <= 38) {
            ga.a(65);
          }
          while (var2Lifetime10 < gu.field_a.length) {
            ko.field_g[var2Lifetime10] = var6.a(gu.field_a[var2Lifetime10], false);
            var2Lifetime10++;
          }
          for (var2Lifetime11 = 0; var2Lifetime11 < vl.field_b.length; var2Lifetime11++) {
            mb.field_u[var2Lifetime11] = var6.a(vl.field_b[var2Lifetime11], false);
          }
          for (var2Lifetime12 = 0; qk.field_a.length > var2Lifetime12; var2Lifetime12++) {
            dl.field_n[var2Lifetime12] = var6.a(qk.field_a[var2Lifetime12], false);
          }
          qk.field_i = var6.a(lt.field_v, false);
          for (var2Lifetime13 = 0; var2Lifetime13 < qa.field_a.length; var2Lifetime13++) {
            ac.field_f[var2Lifetime13] = var6.a(qa.field_a[var2Lifetime13], false);
          }
          for (var2Lifetime14 = 0; var2Lifetime14 < ps.field_f.length; var2Lifetime14++) {
            var5 = 0;
            var3Lifetime1 = var5;
            while (var5 < ps.field_f[var2Lifetime14].length) {
              ii.field_k[var2Lifetime14][var5] = var6.a(ps.field_f[var2Lifetime14][var5], false);
              var5++;
            }
          }
          for (var2Lifetime15 = 0; qq.field_e.length > var2Lifetime15; var2Lifetime15++) {
            bs.field_b[var2Lifetime15] = var6.a(qq.field_e[var2Lifetime15], false);
          }
          for (var2Lifetime16 = 0; var2Lifetime16 < tt.field_c.length; var2Lifetime16++) {
            uc.field_o[var2Lifetime16] = var6.a(tt.field_c[var2Lifetime16], false);
          }
          for (var2Lifetime17 = 0; hq.field_a.length > var2Lifetime17; var2Lifetime17++) {
            jm.field_a[var2Lifetime17] = var6.a(hq.field_a[var2Lifetime17], false);
          }
          for (var2Lifetime18 = 0; var2Lifetime18 < eb.field_c.length; var2Lifetime18++) {
            ua.field_g[var2Lifetime18] = var6.a(eb.field_c[var2Lifetime18], false);
          }
          for (var2Lifetime19 = 0; var2Lifetime19 < kb.field_D.length; var2Lifetime19++) {
            in.field_c[var2Lifetime19] = var6.a(kb.field_D[var2Lifetime19], false);
          }
          mp.field_h = var6.a(fs.field_e, false);
          dc.field_g = var6.a(l.field_a, false);
          se.field_c = var6.a(kn.field_b, q.field_o, true);
          kn.field_a = var6.a(dp.field_h, nc.field_a, true);
          rb.field_j = var6.a(hi.field_v, dl.field_m, true);
          for (var2Lifetime20 = 0; la.field_g.length > var2Lifetime20; var2Lifetime20++) {
            aa.field_a[var2Lifetime20] = var6.a(la.field_g[var2Lifetime20], false);
          }
          for (var2Lifetime21 = 0; var2Lifetime21 < af.field_c.length; var2Lifetime21++) {
            stackIn_78_0 = rs.field_u;
            stackIn_78_0[var2Lifetime21] = var6.a(af.field_c[var2Lifetime21], false);
          }
          lg.field_k = var6.a(vl.field_c, false);
          ut.field_c = var6.a(es.field_i, false);
          dh.field_k = var6.a(uc.field_g, false);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw pn.a((Throwable) ((Object) var1), "ga.A(" + param0 + ')');
        }
    }

    ga(int param0, int param1, int param2, int param3, int param4, int param5, int[] param6) {
        int fieldTemp$0 = 0;
        try {
          this.field_k = param1;
          this.field_g = param3;
          this.field_n = param4;
          this.field_e = param0;
          this.field_h = param6;
          fieldTemp$0 = am.field_a;
          am.field_a = am.field_a + 1;
          this.field_m = 65535 & fieldTemp$0;
          this.field_i = param2;
          this.field_f = param5;
        } catch (RuntimeException runtimeException) {
          throw pn.a((Throwable) ((Object) runtimeException), "ga.<init>(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + (param6 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_l = -1;
    }
}
