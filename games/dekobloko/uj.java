/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class uj {
    static String field_g;
    static String[] field_f;
    static int field_a;
    static String field_e;
    static String field_b;
    static String field_c;
    static ck[][] field_d;

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5) {
        RuntimeException var6 = null;
        int var6_int = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        RuntimeException decompiledCaughtException = null;
        var15 = client.field_A ? 1 : 0;
        try {
          L0: {
            L1: {
              var6_int = param1 + (2 + (485 + param4) + 16);
              var7 = -37 / ((-64 - param5) / 62);
              re.field_x.a(-6 + var6_int, 0, 3, -6 + ea.field_D.field_N, 3);
              var8 = -5 + re.field_x.field_N;
              sk.field_c.a(2 + (485 + param4) - -param1, 0, -param0 + var8, param0, 5);
              wj.field_Mb.a(sk.field_c.field_mb - (param4 + jb.field_f.field_mb), 0, 0, param0, param4);
              var8 = var8 - (param0 - -2);
              jb.field_f.a(jb.field_f.field_mb, 0, 0, param0, param4 + wj.field_Mb.field_mb);
              dn.field_l.a(6, 5, param1, 5, var8 - 5, 487 + param4 - -param1, 2);
              if (null == bc.field_E) {
                break L1;
              } else {
                bc.field_E.b(dn.field_l.field_N, dn.field_l.field_mb, dn.field_l.field_vb, dn.field_l.field_Ib, -16555);
                break L1;
              }
            }
            var9 = -var6_int + (-param4 + ea.field_D.field_mb);
            var10 = var9 / 2;
            var11 = param2 + (var10 + param4);
            var12 = 0;
            var13 = 0;
            L2: while (true) {
              if (var13 >= 6) {
                break L0;
              } else {
                L3: {
                  L4: {
                    if (var13 >= 5) {
                      break L4;
                    } else {
                      if (null != dh.field_c[var13]) {
                        break L4;
                      } else {
                        break L3;
                      }
                    }
                  }
                  var14 = 3 - -((-6 + (ea.field_D.field_N - -2)) * var12 / (dh.field_f - -1));
                  var12++;
                  var8 = 1 + ((-4 + ea.field_D.field_N) * var12 / (1 + dh.field_f) - var14);
                  if (var13 >= 5) {
                    qb.field_p.a(var9, 0, var14, var8, var6_int);
                    break L3;
                  } else {
                    dh.field_c[var13].a(var9, 0, var14, var8, var6_int);
                    ui.field_E[var13].a(-param4 + var10, 0, 0, var8, param4);
                    si.field_b[var13].a(param2, 0, param3, -param3 + (var8 - param3), var10);
                    le.field_D[var13].a(-var11 + (-param4 + var9), 0, param3, -param3 + (var8 - param3), var11);
                    break L3;
                  }
                }
                var13++;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          throw dh.a((Throwable) (Object) var6, "uj.A(" + param0 + 44 + param1 + 44 + param2 + 44 + param3 + 44 + param4 + 44 + param5 + 41);
        }
    }

    public static void a(byte param0) {
        field_b = null;
        field_f = null;
        field_c = null;
        field_e = null;
        field_d = null;
        field_g = null;
    }

    final synchronized static byte[] a(int param0, int param1) {
        byte[] var2_ref_byte__ = null;
        int var2 = 0;
        byte[] var3 = null;
        L0: {
          if (param1 != 100) {
            break L0;
          } else {
            if (rb.field_h > 0) {
              int fieldTemp$6 = rb.field_h - 1;
              rb.field_h = rb.field_h - 1;
              var2_ref_byte__ = of.field_f[fieldTemp$6];
              of.field_f[rb.field_h] = null;
              return var2_ref_byte__;
            } else {
              break L0;
            }
          }
        }
        L1: {
          if (param1 != 5000) {
            break L1;
          } else {
            if (la.field_a <= 0) {
              break L1;
            } else {
              int fieldTemp$7 = la.field_a - 1;
              la.field_a = la.field_a - 1;
              var2_ref_byte__ = vk.field_c[fieldTemp$7];
              vk.field_c[la.field_a] = null;
              return var2_ref_byte__;
            }
          }
        }
        if (param0 == 5) {
          L2: {
            if (param1 != 30000) {
              break L2;
            } else {
              if (d.field_c <= 0) {
                break L2;
              } else {
                int fieldTemp$8 = d.field_c - 1;
                d.field_c = d.field_c - 1;
                var2_ref_byte__ = gk.field_yb[fieldTemp$8];
                gk.field_yb[d.field_c] = null;
                return var2_ref_byte__;
              }
            }
          }
          L3: {
            if (null != jg.field_b) {
              var2 = 0;
              L4: while (true) {
                if (ln.field_d.length <= var2) {
                  break L3;
                } else {
                  if (ln.field_d[var2] == param1) {
                    if (wa.field_d[var2] > 0) {
                      wa.field_d[var2] = wa.field_d[var2] - 1;
                      var3 = jg.field_b[var2][wa.field_d[var2] - 1];
                      jg.field_b[var2][wa.field_d[var2]] = null;
                      return var3;
                    } else {
                      var2++;
                      continue L4;
                    }
                  } else {
                    var2++;
                    continue L4;
                  }
                }
              }
            } else {
              break L3;
            }
          }
          return new byte[param1];
        } else {
          return null;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_f = new String[]{"Welcome to the Master Challenge!<br><br>The Master Challenge is not for the faint of heart. Games are short, and, unlike Stamina Mode, the Master Challenge gets very harsh very quickly. Get as many points as you can, while you can.", "The Master Challenge will test your skill in every different Deko Bloko strategy. You will need to use different strategies as the game progresses. Have you noticed the strategy box on the right? Keep checking it for each new theme."};
        field_e = "Seriously offensive language";
        field_b = "<%0> SHAPES";
        field_c = "to return to the normal view.";
        field_d = new ck[8][];
        field_g = "Rated games are available to members only. To become a member and gain access to Rated games, extra game options and more, please visit the 'Account' section of the website.";
    }
}
