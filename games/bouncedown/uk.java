/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class uk {
    private int field_h;
    private int field_a;
    static bc field_d;
    private ai field_e;
    private ai[] field_c;
    static String field_b;
    private ai field_g;
    static tg[] field_f;

    public static void c(int param0) {
        field_f = null;
        int var1 = -69 % ((61 - param0) / 48);
        field_d = null;
        field_b = null;
    }

    final void a(long param0, int param1, ai param2) {
        ai var5 = null;
        Object var6 = null;
        L0: {
          if (null != param2.field_f) {
            param2.c(2);
            break L0;
          } else {
            break L0;
          }
        }
        if (param1 < 18) {
          var6 = null;
          ((uk) this).a(-59L, -124, (ai) null);
          var5 = ((uk) this).field_c[(int)(param0 & (long)(((uk) this).field_a - 1))];
          param2.field_f = var5.field_f;
          param2.field_c = var5;
          param2.field_f.field_c = param2;
          param2.field_d = param0;
          param2.field_c.field_f = param2;
          return;
        } else {
          var5 = ((uk) this).field_c[(int)(param0 & (long)(((uk) this).field_a - 1))];
          param2.field_f = var5.field_f;
          param2.field_c = var5;
          param2.field_f.field_c = param2;
          param2.field_d = param0;
          param2.field_c.field_f = param2;
          return;
        }
    }

    final ai a(int param0) {
        int var3 = 0;
        ai var4 = null;
        ai var5 = null;
        ai var6 = null;
        ai var9 = null;
        var3 = Bounce.field_N;
        if (param0 > (((uk) this).field_h ^ -1)) {
          if (((uk) this).field_e == ((uk) this).field_c[-1 + ((uk) this).field_h]) {
            L0: while (true) {
              if (((uk) this).field_a > ((uk) this).field_h) {
                ((uk) this).field_h = ((uk) this).field_h + 1;
                var4 = ((uk) this).field_c[((uk) this).field_h].field_c;
                var6 = var4;
                if (var4 != ((uk) this).field_c[((uk) this).field_h + -1]) {
                  ((uk) this).field_e = var6.field_c;
                  return var6;
                } else {
                  continue L0;
                }
              } else {
                return null;
              }
            }
          } else {
            var9 = ((uk) this).field_e;
            ((uk) this).field_e = var9.field_c;
            return var9;
          }
        } else {
          L1: while (true) {
            if (((uk) this).field_a > ((uk) this).field_h) {
              ((uk) this).field_h = ((uk) this).field_h + 1;
              var4 = ((uk) this).field_c[((uk) this).field_h].field_c;
              var5 = var4;
              if (var4 != ((uk) this).field_c[((uk) this).field_h + -1]) {
                ((uk) this).field_e = var5.field_c;
                return var5;
              } else {
                continue L1;
              }
            } else {
              return null;
            }
          }
        }
    }

    final ai a(int param0, long param1) {
        ai var4 = null;
        ai var5 = null;
        int var6 = 0;
        var6 = Bounce.field_N;
        var4 = ((uk) this).field_c[(int)(param1 & (long)(((uk) this).field_a + -1))];
        ((uk) this).field_g = var4.field_c;
        L0: while (true) {
          if (((uk) this).field_g == var4) {
            ((uk) this).field_g = null;
            if (param0 >= 7) {
              return null;
            } else {
              uk.c(-8);
              return null;
            }
          } else {
            if ((param1 ^ -1L) != (((uk) this).field_g.field_d ^ -1L)) {
              ((uk) this).field_g = ((uk) this).field_g.field_c;
              continue L0;
            } else {
              var5 = ((uk) this).field_g;
              ((uk) this).field_g = ((uk) this).field_g.field_c;
              return var5;
            }
          }
        }
    }

    final ai b(int param0) {
        ((uk) this).field_h = param0;
        return ((uk) this).a(-1);
    }

    final static lj a(int param0, String param1) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        Object var6 = null;
        var5 = Bounce.field_N;
        var2 = param1.length();
        var3 = 0;
        L0: while (true) {
          if (var2 <= var3) {
            if (param0 != -58) {
              var6 = null;
              uk.a((oh) null, 104, 43, (oh) null, -71, (byte) 23);
              return mh.field_R;
            } else {
              return mh.field_R;
            }
          } else {
            var4 = param1.charAt(var3);
            if (var4 >= 48) {
              if (var4 <= 57) {
                var3++;
                continue L0;
              } else {
                return null;
              }
            } else {
              return null;
            }
          }
        }
    }

    final static void a(oh param0, int param1, int param2, oh param3, int param4, byte param5) {
        if (param5 != 82) {
          uk.c(1);
          hj.field_a = param2;
          le.field_a = param3;
          cl.field_m = param1;
          d.field_F = param0;
          kk.field_z = param4;
          return;
        } else {
          hj.field_a = param2;
          le.field_a = param3;
          cl.field_m = param1;
          d.field_F = param0;
          kk.field_z = param4;
          return;
        }
    }

    uk(int param0) {
        int var2 = 0;
        ai var3 = null;
        ((uk) this).field_h = 0;
        ((uk) this).field_a = param0;
        ((uk) this).field_c = new ai[param0];
        var2 = 0;
        L0: while (true) {
          if (param0 > var2) {
            var3 = new ai();
            ((uk) this).field_c[var2] = new ai();
            var3.field_c = var3;
            var3.field_f = var3;
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
        field_d = new bc();
        field_b = "Close";
    }
}
