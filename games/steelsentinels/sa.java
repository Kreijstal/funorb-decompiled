/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sa {
    static String field_a;
    static hg[] field_f;
    static String field_d;
    static wk[] field_e;
    static int field_c;
    static String field_b;

    public static void a(boolean param0) {
        field_e = null;
        field_d = null;
        field_b = null;
        field_f = null;
        field_a = null;
        if (!param0) {
            return;
        }
        sa.a(false);
    }

    final static String b(byte param0) {
        if ((nj.field_Q ^ -1) > -3) {
            return ud.field_w;
        }
        if (!(null == ok.field_f)) {
            if (ok.field_f.a(true)) {
                return nm.field_t;
            }
            return jk.field_g;
        }
        int var1 = -86 / ((69 - param0) / 47);
        if (!ke.field_k.a(true)) {
            return ai.field_t;
        }
        if (!ke.field_k.a("commonui", (byte) 90)) {
            return en.field_f + " - " + ke.field_k.a((byte) 78, "commonui") + "%";
        }
        if (!(oe.field_d.a(true))) {
            return og.field_c;
        }
        if (!oe.field_d.a("commonui", (byte) 90)) {
            return kb.field_c + " - " + oe.field_d.a((byte) 103, "commonui") + "%";
        }
        if (!(id.field_bc.a(true))) {
            return sl.field_l;
        }
        if (!(id.field_bc.a(25))) {
            return qj.field_i + " - " + id.field_bc.a((byte) -33) + "%";
        }
        return lg.field_a;
    }

    final static String a(int param0, String param1, byte param2) {
        if ((param0 ^ -1) != -2) {
          if (2 != param0) {
            if (param0 != 3) {
              if ((param0 ^ -1) != -5) {
                if (5 != param0) {
                  if (-7 != (param0 ^ -1)) {
                    if (7 != param0) {
                      if (8 != param0) {
                        if (11 != param0) {
                          if ((param0 ^ -1) != -13) {
                            if (13 == param0) {
                              return db.a(vi.field_ab, -17, new String[1]);
                            } else {
                              if (param2 < -103) {
                                return null;
                              } else {
                                String discarded$1 = sa.b((byte) 118);
                                return null;
                              }
                            }
                          } else {
                            return db.a(uf.field_e, -117, new String[1]);
                          }
                        } else {
                          return db.a(n.field_y, -107, new String[1]);
                        }
                      } else {
                        return db.a(lb.field_Ub, -63, new String[1]);
                      }
                    } else {
                      return db.a(um.field_db, -32, new String[1]);
                    }
                  } else {
                    return db.a(qf.field_i, -65, new String[1]);
                  }
                } else {
                  return db.a(s.field_b, -67, new String[1]);
                }
              } else {
                return db.a(fk.field_p, -93, new String[1]);
              }
            } else {
              return db.a(jj.field_j, -75, new String[1]);
            }
          } else {
            return db.a(kb.field_d, -43, new String[1]);
          }
        } else {
          return db.a(ai.field_w, -73, new String[1]);
        }
    }

    final static void a(byte param0) {
        kj var1 = null;
        int var2 = 0;
        int var3 = 0;
        var3 = SteelSentinels.field_G;
        var1 = mm.field_g;
        if (param0 == -110) {
          L0: while (true) {
            if (qd.a(true)) {
              var1.a(8, (byte) -117);
              var1.field_p = var1.field_p + 1;
              var2 = var1.field_p + 1;
              uj.a(true, var1);
              mm.field_g.b((byte) -93, -var2 + var1.field_p);
              continue L0;
            } else {
              return;
            }
          }
        } else {
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        int var0 = 0;
        field_f = new hg[255];
        field_a = "Remove name";
        for (var0 = 0; field_f.length > var0; var0++) {
            field_f[var0] = new hg();
        }
        field_d = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        field_b = "Camera up/down: Normal";
        field_c = 48;
    }
}
