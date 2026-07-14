/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mn {
    static String field_a;

    final static void a(boolean param0, int param1, int param2, int param3) {
        int var4 = 0;
        llb var5 = null;
        int var6 = 0;
        int var7 = 0;
        String var8 = null;
        pgb var9 = null;
        L0: {
          var7 = VoidHunters.field_G;
          if (uh.field_p != jl.field_q.field_b) {
            kga.field_o = kga.field_o + (jl.field_q.field_b + -uh.field_p);
            uh.field_p = jl.field_q.field_b;
            break L0;
          } else {
            break L0;
          }
        }
        L1: {
          if (tb.field_b >= ldb.field_o) {
            break L1;
          } else {
            tb.field_b = tb.field_b + 1;
            break L1;
          }
        }
        if (tb.field_b > 0) {
          L2: {
            cs.b((byte) 71);
            hca.field_o.a(param0, 1332);
            if (ada.field_b == null) {
              break L2;
            } else {
              if (erb.field_p) {
                boolean discarded$1 = ada.field_b.a((byte) -5, hca.field_o.field_M, hca.field_o.field_u, param0);
                break L2;
              } else {
                ada.field_b = null;
                break L2;
              }
            }
          }
          var4 = 0;
          L3: while (true) {
            if (5 <= var4) {
              L4: {
                if (-1 != (nlb.field_o.field_o ^ -1)) {
                  crb.field_v = new bwa(nlb.field_o.field_M, nlb.field_o.field_u, nlb.field_o.field_hb, nlb.field_o.field_G, param2, fh.field_g, lo.field_b, kn.field_p, qc.field_q, urb.field_o, iga.field_o, (String) null, 0L);
                  break L4;
                } else {
                  break L4;
                }
              }
              L5: {
                var9 = aq.b(nna.field_w, qs.field_c, param1, -123);
                if (var9 != null) {
                  aka.a(var9, 22859);
                  break L5;
                } else {
                  break L5;
                }
              }
              L6: {
                var8 = sdb.a(-8037);
                var6 = 101 / ((param3 - -32) / 58);
                if (var8 != null) {
                  lob.field_a = var8;
                  break L6;
                } else {
                  break L6;
                }
              }
              return;
            } else {
              var5 = ul.field_b[var4];
              if (var5 != null) {
                L7: {
                  if (-1 == (var5.field_o ^ -1)) {
                    break L7;
                  } else {
                    tg.a(101, var5, var4);
                    break L7;
                  }
                }
                var6 = jia.a(var4, (byte) 19);
                vh.field_c[var4].field_tb = pmb.field_o[var6];
                lob.field_c[var4].field_R = fqb.field_o[var6];
                var4++;
                continue L3;
              } else {
                var4++;
                continue L3;
              }
            }
          }
        } else {
          return;
        }
    }

    public static void a(int param0) {
        int var1 = 19 / ((29 - param0) / 59);
        field_a = null;
    }

    final static boolean a(CharSequence param0, byte param1) {
        int var2 = 0;
        int var3 = VoidHunters.field_G;
        if (!(je.a((byte) -31, param0, true))) {
            return false;
        }
        if (param1 > -107) {
            field_a = null;
        }
        for (var2 = 0; var2 < param0.length(); var2++) {
            if (!(qnb.a((byte) -108, param0.charAt(var2)))) {
                return false;
            }
        }
        return true;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "Please remove <%0> from your ignore list first.";
    }
}
