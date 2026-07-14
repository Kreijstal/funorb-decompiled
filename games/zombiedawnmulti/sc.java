/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sc {
    private long field_h;
    private int field_i;
    private qa field_e;
    static cj field_j;
    static String field_c;
    private int field_g;
    static boolean field_a;
    static int field_f;
    private qa[] field_k;
    static cj field_d;
    private qa field_b;

    final static void a(int param0, ja[] param1, String param2, boolean param3, int param4, int param5, int param6, fm param7, int param8, byte param9, int param10, int param11, int param12, boolean param13, ja[] param14) {
        aj.a(qf.field_c, param8, param4, param0, param5, param10, kk.field_x, param7, param0, param6, e.field_a, param12, new pd(param14), param12, new pd(param1), param7, ua.field_N, ic.field_g, sb.field_c, (byte) 70);
        gk.a(param13, 2, param2, param11, param3);
        if (param9 == -103) {
            return;
        }
        field_a = true;
    }

    final qa c(byte param0) {
        int var3 = 0;
        qa var4 = null;
        qa var8 = null;
        qa var11 = null;
        var3 = ZombieDawnMulti.field_E ? 1 : 0;
        if (((sc) this).field_g > 0) {
          if (((sc) this).field_e != ((sc) this).field_k[((sc) this).field_g - 1]) {
            var11 = ((sc) this).field_e;
            ((sc) this).field_e = var11.field_k;
            return var11;
          } else {
            if (param0 <= 94) {
              return null;
            } else {
              L0: while (true) {
                if (((sc) this).field_i > ((sc) this).field_g) {
                  ((sc) this).field_g = ((sc) this).field_g + 1;
                  var8 = ((sc) this).field_k[((sc) this).field_g].field_k;
                  if (((sc) this).field_k[((sc) this).field_g + -1] != var8) {
                    ((sc) this).field_e = var8.field_k;
                    return var8;
                  } else {
                    continue L0;
                  }
                } else {
                  return null;
                }
              }
            }
          }
        } else {
          if (param0 <= 94) {
            return null;
          } else {
            L1: while (true) {
              if (((sc) this).field_i > ((sc) this).field_g) {
                ((sc) this).field_g = ((sc) this).field_g + 1;
                var4 = ((sc) this).field_k[((sc) this).field_g].field_k;
                if (((sc) this).field_k[((sc) this).field_g + -1] != var4) {
                  ((sc) this).field_e = var4.field_k;
                  return var4;
                } else {
                  continue L1;
                }
              } else {
                return null;
              }
            }
          }
        }
    }

    public static void a(boolean param0) {
        field_j = null;
        field_c = null;
        if (!param0) {
            field_f = -125;
            field_d = null;
            return;
        }
        field_d = null;
    }

    final void a(int param0, qa param1, long param2) {
        qa var5 = null;
        if (param1.field_p != null) {
            param1.a(-4564);
            var5 = ((sc) this).field_k[(int)((long)(((sc) this).field_i + param0) & param2)];
            param1.field_p = var5.field_p;
            param1.field_k = var5;
            param1.field_p.field_k = param1;
            param1.field_l = param2;
            param1.field_k.field_p = param1;
            return;
        }
        var5 = ((sc) this).field_k[(int)((long)(((sc) this).field_i + param0) & param2)];
        param1.field_p = var5.field_p;
        param1.field_k = var5;
        param1.field_p.field_k = param1;
        param1.field_l = param2;
        param1.field_k.field_p = param1;
    }

    final qa b(byte param0) {
        qa var2 = null;
        qa var3 = null;
        int var4 = ZombieDawnMulti.field_E ? 1 : 0;
        if (null == ((sc) this).field_b) {
            return null;
        }
        if (param0 != 68) {
            sc.a(false);
            var2 = ((sc) this).field_k[(int)(((sc) this).field_h & (long)(((sc) this).field_i + -1))];
            while (((sc) this).field_b != var2) {
                if (!(((sc) this).field_h != ((sc) this).field_b.field_l)) {
                    var3 = ((sc) this).field_b;
                    ((sc) this).field_b = ((sc) this).field_b.field_k;
                    return var3;
                }
                ((sc) this).field_b = ((sc) this).field_b.field_k;
            }
            ((sc) this).field_b = null;
            return null;
        }
        var2 = ((sc) this).field_k[(int)(((sc) this).field_h & (long)(((sc) this).field_i + -1))];
        while (((sc) this).field_b != var2) {
            if (!(((sc) this).field_h != ((sc) this).field_b.field_l)) {
                var3 = ((sc) this).field_b;
                ((sc) this).field_b = ((sc) this).field_b.field_k;
                return var3;
            }
            ((sc) this).field_b = ((sc) this).field_b.field_k;
        }
        ((sc) this).field_b = null;
        return null;
    }

    final qa a(byte param0) {
        ((sc) this).field_g = 0;
        if (param0 != 7) {
            sc.d((byte) -11);
            return ((sc) this).c((byte) 108);
        }
        return ((sc) this).c((byte) 108);
    }

    final qa a(long param0, int param1) {
        qa var4 = null;
        qa var5 = null;
        int var6 = 0;
        qa var7 = null;
        qa var8 = null;
        var6 = ZombieDawnMulti.field_E ? 1 : 0;
        if (param1 == -22877) {
          ((sc) this).field_h = param0;
          var7 = ((sc) this).field_k[(int)((long)(-1 + ((sc) this).field_i) & param0)];
          var4 = var7;
          ((sc) this).field_b = var7.field_k;
          L0: while (true) {
            if (((sc) this).field_b == var4) {
              ((sc) this).field_b = null;
              return null;
            } else {
              if (((sc) this).field_b.field_l != param0) {
                ((sc) this).field_b = ((sc) this).field_b.field_k;
                continue L0;
              } else {
                var5 = ((sc) this).field_b;
                ((sc) this).field_b = ((sc) this).field_b.field_k;
                return var5;
              }
            }
          }
        } else {
          field_j = null;
          ((sc) this).field_h = param0;
          var8 = ((sc) this).field_k[(int)((long)(-1 + ((sc) this).field_i) & param0)];
          var4 = var8;
          ((sc) this).field_b = var8.field_k;
          L1: while (true) {
            if (((sc) this).field_b == var4) {
              ((sc) this).field_b = null;
              return null;
            } else {
              if (((sc) this).field_b.field_l != param0) {
                ((sc) this).field_b = ((sc) this).field_b.field_k;
                continue L1;
              } else {
                var5 = ((sc) this).field_b;
                ((sc) this).field_b = ((sc) this).field_b.field_k;
                return var5;
              }
            }
          }
        }
    }

    final static void a(int param0, boolean param1) {
        if (param0 >= -71) {
            field_f = -61;
            io.a(-21113, false, param1);
            return;
        }
        io.a(-21113, false, param1);
    }

    final static void d(byte param0) {
        if (!(fh.field_m == null)) {
            ec.field_b = fh.field_m;
            ua.field_E = ke.field_j;
            ec.field_b.field_ob = -1;
            fh.field_m = null;
            ec.field_b.field_xb = -1;
            ke.field_j = null;
        }
        nq.field_t = null;
        jk.field_d = null;
        if (param0 != 87) {
            field_f = -103;
            sq.field_N = true;
            lj.field_v = null;
            dp.field_c = null;
            br.field_c = null;
            return;
        }
        sq.field_N = true;
        lj.field_v = null;
        dp.field_c = null;
        br.field_c = null;
    }

    final static void a(int param0) {
        int var1 = 0;
        int var2 = 0;
        if (param0 != 0) {
            field_d = null;
            var1 = fa.d(false);
            var2 = sk.a((byte) -99);
            po.field_l.a(-la.field_m + ce.field_k, -um.field_a + ZombieDawnMulti.field_H, var1 + (um.field_a << -712202079), (la.field_m << -229064703) + var2, 12018);
            sq.g(param0 + 114);
            return;
        }
        var1 = fa.d(false);
        var2 = sk.a((byte) -99);
        po.field_l.a(-la.field_m + ce.field_k, -um.field_a + ZombieDawnMulti.field_H, var1 + (um.field_a << -712202079), (la.field_m << -229064703) + var2, 12018);
        sq.g(param0 + 114);
    }

    final static void b(int param0) {
        fq.field_i = null;
        if (param0 != 1) {
            field_j = null;
            wb.field_hb = null;
            return;
        }
        wb.field_hb = null;
    }

    sc(int param0) {
        int var2 = 0;
        qa var3 = null;
        ((sc) this).field_g = 0;
        ((sc) this).field_i = param0;
        ((sc) this).field_k = new qa[param0];
        var2 = 0;
        L0: while (true) {
          if (var2 < param0) {
            var3 = new qa();
            ((sc) this).field_k[var2] = new qa();
            var3.field_p = var3;
            var3.field_k = var3;
            var2++;
            continue L0;
          } else {
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        ja discarded$0 = new ja(640, 480);
        field_c = "You need to play <%0> more rated games to unlock this option.";
        field_a = false;
    }
}
