/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fi {
    private gp field_i;
    static String field_j;
    static byte[] field_c;
    static tj field_b;
    private long field_d;
    static String field_e;
    private int field_h;
    private int field_g;
    private gp field_a;
    private gp[] field_f;

    final static void a(int param0, boolean param1, String param2) {
        bf.field_a = param1 ? true : false;
        ed.field_t = true;
        df.field_l = new fj(ch.field_e, sg.field_a, param2, tk.field_e, bf.field_a);
        ch.field_e.b((iq) (Object) df.field_l, param0 ^ param0);
    }

    final void a(gp param0, long param1, int param2) {
        if (!(null == param0.field_o)) {
            param0.a(-107);
        }
        int var6 = 118 / ((param2 - -20) / 35);
        gp var5 = ((fi) this).field_f[(int)(param1 & (long)(-1 + ((fi) this).field_g))];
        param0.field_p = var5;
        param0.field_o = var5.field_o;
        param0.field_o.field_p = param0;
        param0.field_n = param1;
        param0.field_p.field_o = param0;
    }

    public static void c(int param0) {
        if (param0 != 0) {
            return;
        }
        field_j = null;
        field_e = null;
        field_b = null;
        field_c = null;
    }

    final gp a(byte param0) {
        int var3 = 0;
        gp var4 = null;
        gp var5 = null;
        gp var29 = null;
        gp var57 = null;
        gp var58 = null;
        gp var59 = null;
        var3 = Vertigo2.field_L ? 1 : 0;
        if ((((fi) this).field_h ^ -1) >= -1) {
          if (param0 != -60) {
            gp discarded$2 = ((fi) this).a(-90);
            L0: while (true) {
              if (((fi) this).field_g > ((fi) this).field_h) {
                ((fi) this).field_h = ((fi) this).field_h + 1;
                var4 = ((fi) this).field_f[((fi) this).field_h].field_p;
                var59 = var4;
                if (var4 == ((fi) this).field_f[-1 + ((fi) this).field_h]) {
                  continue L0;
                } else {
                  ((fi) this).field_a = var59.field_p;
                  return var59;
                }
              } else {
                return null;
              }
            }
          } else {
            L1: while (true) {
              if (((fi) this).field_g > ((fi) this).field_h) {
                ((fi) this).field_h = ((fi) this).field_h + 1;
                var4 = ((fi) this).field_f[((fi) this).field_h].field_p;
                var58 = var4;
                if (var4 == ((fi) this).field_f[-1 + ((fi) this).field_h]) {
                  continue L1;
                } else {
                  ((fi) this).field_a = var58.field_p;
                  return var58;
                }
              } else {
                return null;
              }
            }
          }
        } else {
          if (((fi) this).field_a == ((fi) this).field_f[((fi) this).field_h - 1]) {
            if (param0 != -60) {
              gp discarded$3 = ((fi) this).a(-90);
              L2: while (true) {
                if (((fi) this).field_g > ((fi) this).field_h) {
                  ((fi) this).field_h = ((fi) this).field_h + 1;
                  var4 = ((fi) this).field_f[((fi) this).field_h].field_p;
                  var29 = var4;
                  if (var4 == ((fi) this).field_f[-1 + ((fi) this).field_h]) {
                    continue L2;
                  } else {
                    ((fi) this).field_a = var29.field_p;
                    return var29;
                  }
                } else {
                  return null;
                }
              }
            } else {
              L3: while (true) {
                if (((fi) this).field_g > ((fi) this).field_h) {
                  ((fi) this).field_h = ((fi) this).field_h + 1;
                  var4 = ((fi) this).field_f[((fi) this).field_h].field_p;
                  var5 = var4;
                  if (var4 == ((fi) this).field_f[-1 + ((fi) this).field_h]) {
                    continue L3;
                  } else {
                    ((fi) this).field_a = var5.field_p;
                    return var5;
                  }
                } else {
                  return null;
                }
              }
            }
          } else {
            var57 = ((fi) this).field_a;
            ((fi) this).field_a = var57.field_p;
            return var57;
          }
        }
    }

    final static co a(int param0, r param1, r param2, int param3, byte param4) {
        int var5 = 0;
        var5 = 34 % ((-6 - param4) / 33);
        if (!hq.a(124, param0, param3, param1)) {
          return null;
        } else {
          return m.a(param2.a(param0, param3, (byte) -103), 0);
        }
    }

    final gp b(int param0) {
        int var2 = 59 / ((-72 - param0) / 53);
        ((fi) this).field_h = 0;
        return ((fi) this).a((byte) -60);
    }

    final gp a(int param0, long param1) {
        gp var4 = null;
        gp var5 = null;
        int var6 = 0;
        var6 = Vertigo2.field_L ? 1 : 0;
        ((fi) this).field_d = param1;
        if (param0 == 3661) {
          var4 = ((fi) this).field_f[(int)((long)(((fi) this).field_g - 1) & param1)];
          ((fi) this).field_i = var4.field_p;
          L0: while (true) {
            if (var4 != ((fi) this).field_i) {
              if ((param1 ^ -1L) == (((fi) this).field_i.field_n ^ -1L)) {
                var5 = ((fi) this).field_i;
                ((fi) this).field_i = ((fi) this).field_i.field_p;
                return var5;
              } else {
                ((fi) this).field_i = ((fi) this).field_i.field_p;
                continue L0;
              }
            } else {
              ((fi) this).field_i = null;
              return null;
            }
          }
        } else {
          return null;
        }
    }

    final gp a(int param0) {
        gp var2 = null;
        gp var3 = null;
        int var4 = 0;
        var4 = Vertigo2.field_L ? 1 : 0;
        if (null != ((fi) this).field_i) {
          if (param0 <= -89) {
            var2 = ((fi) this).field_f[(int)(((fi) this).field_d & (long)(-1 + ((fi) this).field_g))];
            L0: while (true) {
              if (((fi) this).field_i != var2) {
                if ((((fi) this).field_i.field_n ^ -1L) == (((fi) this).field_d ^ -1L)) {
                  var3 = ((fi) this).field_i;
                  ((fi) this).field_i = ((fi) this).field_i.field_p;
                  return var3;
                } else {
                  ((fi) this).field_i = ((fi) this).field_i.field_p;
                  continue L0;
                }
              } else {
                ((fi) this).field_i = null;
                return null;
              }
            }
          } else {
            return null;
          }
        } else {
          return null;
        }
    }

    fi(int param0) {
        int var2 = 0;
        gp var3 = null;
        ((fi) this).field_h = 0;
        ((fi) this).field_g = param0;
        ((fi) this).field_f = new gp[param0];
        var2 = 0;
        L0: while (true) {
          if (param0 > var2) {
            var3 = new gp();
            ((fi) this).field_f[var2] = new gp();
            var3.field_p = var3;
            var3.field_o = var3;
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
        field_j = "Average rating";
        field_b = new tj();
    }
}
