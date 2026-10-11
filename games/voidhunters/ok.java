/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ok implements dja {
    static sw[] field_b;
    static String field_a;

    final static void a(byte param0, boolean param1) {
        int var6 = 0;
        llb dupTemp$0 = null;
        int var11 = 0;
        int stackIn_4_0 = 0;
        llb stackIn_6_0;
        int stackIn_6_1;
        int stackIn_6_2;
        int stackIn_6_3;
        int stackIn_7_4 = 0;
        int stackIn_58_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        llb var7_ref_llb = null;
        int var7 = 0;
        int var8 = 0;
        llb var8_ref_llb = null;
        cna var9_ref_cna = null;
        int var9 = 0;
        int var10 = 0;
        cna var10_ref_cna = null;
        int var12 = 0;
        int var13 = 0;
        llb var14 = null;
        var13 = VoidHunters.field_G;
        try {
          gp.field_p = dma.field_g;
          wjb.field_p = dma.field_j;
          if (param1) {
            stackIn_4_0 = nf.field_a;
          } else {
            stackIn_4_0 = tba.field_p;
          }
          lkb.a(stackIn_4_0, (byte) -106);
          hra.field_o.a(0, -92, -2 + rga.field_g.field_G - 40, 0, rga.field_g.field_hb);
          ukb.field_o.a(0, -11, rsa.field_o.field_hb, 0, nna.field_w);
          stackIn_6_0 = jn.field_a;
          stackIn_6_1 = 0;
          stackIn_6_2 = param0 + 25;
          stackIn_6_3 = rsa.field_o.field_hb;
          if (ll.field_o) {
            stackIn_7_4 = 2 + (40 + rba.field_a + 2);
          } else {
            stackIn_7_4 = 0;
          }
          ((llb) (Object) stackIn_6_0).a(stackIn_6_1, stackIn_6_2, stackIn_6_3 - stackIn_7_4, 2 + nna.field_w, 18);
          vqb.field_o.a(-40 + (-2 + rsa.field_o.field_hb) - rba.field_a, param0 + 18, rba.field_a + 42, nna.field_w + 2, 18);
          rga.field_f.a(rsa.field_o.field_hb, 2, -1, -nna.field_w + (rsa.field_o.field_G - 2) - 20, 2 + (nna.field_w + 20), 0, rba.field_a);
          nt.field_q.a(0, -41, rga.field_g.field_hb, rga.field_g.field_G - 40, 40);
          rob.field_q.a(0, 121, vva.field_r.field_hb, 0, 30);
          if (param0 != 100) {
            ok.a((byte) -23, true);
          }
          gt.field_o.a(0, 124, vva.field_r.field_hb, 30, -32 + vva.field_r.field_G - 40);
          var2_int = 3 + ocb.field_l;
          if (ieb.field_o.length < 2) {
            var2_int--;
          }
          if (param1) {
            var2_int--;
          }
          var3 = -2 + ((1 + var2_int) / 2 - 13 + (gt.field_o.field_G - 5)) / (var2_int + 1);
          if (var3 > 30) {
            var3 = 30;
          }
          var4 = -10 + (gt.field_o.field_G - (var3 + 2) * var2_int);
          if (40 < var4) {
            var4 = 40;
          }
          aqb.field_e.a(5, param0 + 19, -5 + (-5 + gt.field_o.field_hb), 5, var4);
          var5 = 5 + (var4 + 2);
          for (var6 = 0; ocb.field_l + 4 > var6; var6++) {
            if ((1 != var6 ||
              !(ieb.field_o.length < 2)) && (var6 != 3 ||
              !(nkb.field_r <= 1))) {
              if (!param1 &&
                var6 == 3) {
                var7_ref_llb = ceb.field_o[var6];
                ceb.field_o[var6].field_G = 0;
                var7_ref_llb.field_hb = 0;
                for (var8 = 0; var8 < inb.field_q[var6].length; var8++) {
                  if (inb.field_q[var6][var8] != null) {
                    var9_ref_cna = inb.field_q[var6][var8];
                    inb.field_q[var6][var8].field_G = 0;
                    var9_ref_cna.field_hb = 0;
                  }
                }
              } else if (param1 &&
                0 == var6) {
                dupTemp$0 = ceb.field_o[var6];
                var14 = dupTemp$0;
                var7_ref_llb = dupTemp$0;
                ceb.field_o[var6].field_G = 0;
                var14.field_hb = 0;
                for (var8 = 0; inb.field_q[var6].length > var8; var8++) {
                  if (inb.field_q[var6][var8] != null) {
                    var9_ref_cna = inb.field_q[var6][var8];
                    inb.field_q[var6][var8].field_G = 0;
                    var9_ref_cna.field_hb = 0;
                  }
                }
              } else {
                if (param1) {
                  if (var6 >= 4) {
                    if (jra.field_d != null) {
                      stackIn_58_0 = (jra.field_d[-4 + var6]) ? 1 : 0;
                    } else {
                      stackIn_58_0 = 0;
                    }
                  } else {
                    stackIn_58_0 = 0;
                  }
                } else {
                  stackIn_58_0 = 0;
                }
                var7 = stackIn_58_0;
                if (var7 != 0) {
                  var8_ref_llb = ceb.field_o[var6];
                  ceb.field_o[var6].field_G = 0;
                  var8_ref_llb.field_hb = 0;
                  for (var9 = 0; inb.field_q[var6].length > var9; var9++) {
                    if (inb.field_q[var6][var9] != null) {
                      var10_ref_cna = inb.field_q[var6][var9];
                      inb.field_q[var6][var9].field_G = 0;
                      var10_ref_cna.field_hb = 0;
                    }
                  }
                } else {
                  ceb.field_o[var6].a(5, 118, 103, var5, var3);
                  var8 = 110;
                  if (param1) {
                    inb.field_q[var6][0].a(var5, var8, -118, 2, hi.field_a, 38, var3);
                    var8 += 40;
                  } else {
                    if (inb.field_q[var6][0] != null) {
                      var9_ref_cna = inb.field_q[var6][0];
                      inb.field_q[var6][0].field_G = 0;
                      var9_ref_cna.field_hb = 0;
                    }
                  }
                  var9 = -var8 + (-5 + vva.field_r.field_hb + 2);
                  var10 = -1 + inb.field_q[var6].length;
                  for (var11 = 0; var11 < var10; var11++) {
                    var12 = var9 * var11 / var10;
                    inb.field_q[var6][var11 + 1].a(var5, var8 + var12, -122, 2, hi.field_a, var9 * (var11 + 1) / var10 - 2 - var12, var3);
                  }
                  var5 = var5 + (2 + var3);
                }
              }
            }
          }
          jfb.field_o.a(-360 + dma.field_g >> 1, 117, 360, 10, -130 + (dma.field_j - 14));
          sfa.field_d.a(0, 124, jfb.field_o.field_hb, 0, 24);
          neb.field_o.a(0, 124, jfb.field_o.field_hb, 24, -24 + jfb.field_o.field_G);
          neb.field_o.field_gb = uwa.a(11579568, neb.field_o.field_G, 1, 8421504, 92, 3);
          fh.field_f.a(5, 124, neb.field_o.field_hb - 10, 5, -2 + (-24 + neb.field_o.field_G) - 10);
          rlb.field_a.a((neb.field_o.field_hb - 80) / 2, 24, 80, -29 + neb.field_o.field_G, 24);
          irb.a(0);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw rta.a((Throwable) ((Object) var2), "ok.C(" + param0 + ',' + param1 + ')');
        }
    }

    public final tv a(byte param0) {
        int var2 = 47 % ((param0 + 64) / 50);
        return (tv) ((Object) new anb());
    }

    public final tv[] a(int param0, int param1) {
        if (param0 != 11995) {
          ok.a((byte) 101, true);
        }
        return (tv[]) ((Object) new anb[param1]);
    }

    public static void b(byte param0) {
        field_a = null;
        field_b = null;
        int var1 = -7 % ((63 - param0) / 50);
    }

    static {
        field_a = "Voters: <%0>";
    }
}
