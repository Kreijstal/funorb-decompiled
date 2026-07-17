/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ac {
    static p field_d;
    static ua field_c;
    static String field_a;
    static String field_b;
    static boolean field_e;

    public static void a(int param0) {
        field_a = null;
        field_d = null;
        field_c = null;
        field_b = null;
    }

    final static void a(int param0, int param1, int param2, boolean param3) {
        RuntimeException var4 = null;
        int var4_int = 0;
        km var5 = null;
        int var6 = 0;
        int var7 = 0;
        String var8 = null;
        cj var9 = null;
        RuntimeException decompiledCaughtException = null;
        var7 = Virogrid.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              if (ve.field_t <= db.field_D) {
                break L1;
              } else {
                db.field_D = db.field_D + 1;
                break L1;
              }
            }
            L2: {
              if (p.field_h == ca.field_M.field_b) {
                break L2;
              } else {
                vf.field_c = vf.field_c + (ca.field_M.field_b - p.field_h);
                p.field_h = ca.field_M.field_b;
                break L2;
              }
            }
            if (0 >= db.field_D) {
              return;
            } else {
              L3: {
                ib.b(param1 + -39);
                we.field_c.a(param3, (byte) 125);
                if (null == fh.field_c) {
                  break L3;
                } else {
                  if (wg.field_f) {
                    boolean discarded$1 = fh.field_c.a(we.field_c.field_J, we.field_c.field_Bb, (byte) -128, param3);
                    break L3;
                  } else {
                    fh.field_c = null;
                    break L3;
                  }
                }
              }
              var4_int = 0;
              L4: while (true) {
                if (5 <= var4_int) {
                  L5: {
                    if (~af.field_d.field_nb == param1) {
                      break L5;
                    } else {
                      km.field_yb = new bg(af.field_d.field_Bb, af.field_d.field_J, af.field_d.field_K, af.field_d.field_ub, param2, fn.field_e, wh.field_a, eb.field_b, ti.field_h, vd.field_Z, ma.field_e, (String) null, 0L);
                      break L5;
                    }
                  }
                  L6: {
                    var9 = da.a(param1 ^ 1402, param0, qi.field_d, pg.field_e);
                    if (var9 != null) {
                      jb.a(-44, var9);
                      break L6;
                    } else {
                      break L6;
                    }
                  }
                  var8 = id.a(3063);
                  if (var8 != null) {
                    wc.field_g = var8;
                    break L0;
                  } else {
                    return;
                  }
                } else {
                  L7: {
                    var5 = ln.field_i[var4_int];
                    if (var5 == null) {
                      var4_int++;
                      break L7;
                    } else {
                      L8: {
                        if (var5.field_nb == 0) {
                          break L8;
                        } else {
                          kh.a(var5, var4_int, 20435);
                          break L8;
                        }
                      }
                      var6 = id.a(var4_int, (byte) 119);
                      og.field_g[var4_int].field_qb = j.field_k[var6];
                      th.field_o[var4_int].field_V = hn.field_i[var6];
                      var4_int++;
                      break L7;
                    }
                  }
                  var4_int++;
                  continue L4;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw kg.a((Throwable) (Object) var4, "ac.A(" + param0 + 44 + param1 + 44 + param2 + 44 + param3 + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "Report abuse";
        field_e = false;
        field_b = "Detail: ";
    }
}
