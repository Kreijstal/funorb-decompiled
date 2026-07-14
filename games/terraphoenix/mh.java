/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mh {
    static ak field_b;
    static o field_a;

    public static void a(int param0) {
        field_a = null;
        if (param0 != 1) {
            field_a = null;
        }
        field_b = null;
    }

    final static void a(fb param0, int param1, int param2) {
        int var5 = 0;
        int var6 = Terraphoenix.field_V;
        uc var7 = di.field_l;
        uc var8 = var7;
        var8.k(-17410, param1);
        var8.field_k = var8.field_k + 1;
        int var4 = var8.field_k;
        var8.i(1, -22);
        var8.h(-1564407352, param0.field_s);
        var8.h(-1564407352, param0.field_h);
        var8.h(-1564407352, param0.field_q);
        var8.e(param0.field_k, 8959);
        var8.e(param0.field_l, 8959);
        var8.e(param0.field_j, 8959);
        var8.e(param0.field_o, 8959);
        var8.i(param0.field_r.length, -99);
        for (var5 = param2; var5 < param0.field_r.length; var5++) {
            var7.e(param0.field_r[var5], 8959);
        }
        int discarded$0 = var8.d(var4, 8600);
        var8.j(-var4 + var8.field_k, -119);
    }

    final static void a(byte param0, int param1, int param2) {
        if (param0 <= 111) {
            return;
        }
        int var3 = 1 << param1;
        if (!((var3 & ef.field_i) == 0)) {
            return;
        }
        ef.field_i = ef.field_i | var3;
        kl.field_a = kl.field_a | var3;
        ga.field_k.a((uf) (Object) new hd(param1), -16611);
        if (!kg.field_q) {
            if (!bk.c(-25704)) {
                eg discarded$1 = cl.a(4, -ge.field_e + oe.field_c, oh.field_e, param1, km.field_e, bh.field_a, param2, (byte) 43);
            } else {
                u.field_c.a((uf) (Object) new eg(param1, param2, -ge.field_e + oe.field_c, km.field_e, oh.field_e, bh.field_a), -16611);
            }
        }
    }

    final static void a(byte param0) {
        int var2_int = 0;
        String var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        ci var6 = null;
        ci var7 = null;
        ci var8 = null;
        var4 = Terraphoenix.field_V;
        l.e(243, 197, 369, 143, 16777215);
        l.f(244, 198, 367, 141, 0);
        if (rk.field_f == null) {
          L0: {
            if (null != ja.field_m) {
              int discarded$3 = ja.field_m.a(hh.field_k, 245, 199, 365, 139, 16777215, -1, 1, 1, 0);
              break L0;
            } else {
              break L0;
            }
          }
          return;
        } else {
          L1: {
            var6 = rk.field_f[vi.field_q];
            if (var6 == null) {
              if (null == ja.field_m) {
                break L1;
              } else {
                int discarded$4 = ja.field_m.a(hh.field_k, 245, 199, 365, 139, 16777215, -1, 1, 1, 0);
                break L1;
              }
            } else {
              var6.b(245, 199);
              break L1;
            }
          }
          L2: {
            if (vi.field_p < ke.field_c) {
              var7 = rk.field_f[hd.field_h];
              if (var7 == null) {
                break L2;
              } else {
                var2_int = vi.field_p * (60 + var7.field_q) / ke.field_c;
                var3 = var2_int + -30;
                if (!ve.field_c) {
                  cl.a(var3 * -256 / 30, 245, (byte) -51, var7, 199, (var7.field_q + -var3) * 256 / 30);
                  break L2;
                } else {
                  cl.a(256 * (-var3 + var7.field_q) / 30, 245, (byte) 99, var7, 199, var3 * -256 / 30);
                  break L2;
                }
              }
            } else {
              break L2;
            }
          }
          L3: {
            if (null == ja.field_m) {
              break L3;
            } else {
              var2 = null;
              var5 = 0;
              var3 = var5;
              L4: while (true) {
                if (var5 >= rk.field_f.length) {
                  if (var2 == null) {
                    break L3;
                  } else {
                    int discarded$5 = ja.field_m.a("Screenshot(s) " + var2 + " is/are the wrong size! Should be " + 365 + "<times>" + 139, 245, 199, 365, 139, 16737843, 0, 1, 1, 0);
                    break L3;
                  }
                } else {
                  var8 = rk.field_f[var5];
                  if (var8 != null) {
                    L5: {
                      if ((var8.field_q ^ -1) != -366) {
                        break L5;
                      } else {
                        if (var8.field_u != 139) {
                          break L5;
                        } else {
                          var5++;
                          continue L4;
                        }
                      }
                    }
                    if (var2 != null) {
                      var2 = var2 + ", " + var5;
                      var5++;
                      continue L4;
                    } else {
                      var2 = Integer.toString(var5);
                      var5++;
                      continue L4;
                    }
                  } else {
                    var5++;
                    continue L4;
                  }
                }
              }
            }
          }
          L6: {
            if (param0 <= -52) {
              break L6;
            } else {
              mh.a((byte) -23);
              break L6;
            }
          }
          return;
        }
    }

    static {
    }
}
